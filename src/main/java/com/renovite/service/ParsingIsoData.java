package com.renovite.service;

import org.jpos.iso.ISOMsg;
import org.jpos.iso.packager.GenericPackager;
import org.jpos.util.Logger;
import org.jpos.util.SimpleLogListener;
import org.springframework.stereotype.Service;

import com.renovite.model.IsoField;

@Service
public class ParsingIsoData {

	private final static char[] hexArray = "0123456789ABCDEF".toCharArray();

	public IsoField parsingData(String data) {
		Logger logger = new Logger();
		try {

			System.out.println("DATAgfhgfgh : " + data);

			GenericPackager packager = new GenericPackager("basic1987.xml");
			ISOMsg isoMsg = new ISOMsg();
			isoMsg.setPackager(packager);
			// for (byte data1: data.getBytes()) {
			// System.out.format("%d"+data1);
			// System.out.println("");
			// }
			logger.addListener(new SimpleLogListener());
			packager.setLogger(logger, "packager");
			isoMsg.unpack(data.getBytes());
			System.out.println(isoMsg);
			try {
				System.out.println("  MTI : " + isoMsg.getMTI());
				IsoField isoFields = new IsoField();
				XmlToPojo pojoMaping = new XmlToPojo();
				for (int i = 1; i <= isoMsg.getMaxField(); i++) {
					if (isoMsg.hasField(i)) {
						pojoMaping.convert(i, isoMsg, isoFields);
						System.out.println("    Field-" + i + " : " + isoMsg.getString(i));
					}
				}
				System.out.println("============================");
				System.out.println(isoFields.getAMOUNT_TRANSACTION_4());
				System.out.println(isoFields.getMERCHANTS_TYPE_18());
				
				return isoFields;
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				System.out.println("--------------------");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return null;
	}

	public static String bytesToHex(byte[] bytes) {
		char[] hexChars = new char[bytes.length * 2];
		for (int j = 0; j < bytes.length; j++) {
			int v = bytes[j] & 0xFF;
			hexChars[j * 2] = hexArray[v >>> 4];
			hexChars[j * 2 + 1] = hexArray[v & 0x0F];
		}
		return new String(hexChars);
	}
}
