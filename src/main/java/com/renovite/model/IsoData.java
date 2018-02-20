package com.renovite.model;

import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.hazelcast.nio.ObjectDataInput;
import com.hazelcast.nio.ObjectDataOutput;
import com.hazelcast.nio.serialization.DataSerializable;

@Entity
public class IsoData implements DataSerializable  {
	/**
	 * 
	 */
	@Id
	int MULTIINST_ID;
	public String getI125_SUPP_INFO1() {
		return I125_SUPP_INFO1;
	}
	public void setI125_SUPP_INFO1(String i125_SUPP_INFO1) {
		I125_SUPP_INFO1 = i125_SUPP_INFO1;
	}
	
	@Column
	long AUTH_SERIAL_NO;
	@Column
	Date LTIMESTAMP;
	@Column
	String SOURCE;
	@Column
	String MSG_FORMAT;
	@Column
	long OTB_AMT_CNTR;
	@Column
	long OTB_AMT_CARD;
	@Column
	int MSG_TRXN_TYPE;
	@Column
	int MSG_TRXN_MODE;
	@Column
	int MSG_TRXN_SPECIFICS;
	@Column
	long MSG_CLASS;
	@Column
	long MSG_TYPE;
	@Column
	long TRXN_TYPE;
	@Column
	long TRXN_ENTRY_MODE;
	@Column
	String I000_MSG_TYPE;
	@Column
	String I002_NUMBER;
	@Column
	String I003_PROC_CODE;
	@Column
	long I004_AMT_TRXN;
	@Column
	long I005_AMT_SETTLE;
	@Column
	long I006_AMT_BILL;
	@Column
	String I007_TRANS_DT;
	@Column
	String I011_TRACE_NO;
	@Column
	String I012_LCL_TIME;
	@Column
	String I013_LCL_DATE;
	@Column
	String I014_EXP_DATE;
	@Column
	String I018_MER_TYPE;
	@Column
	String I019_ACQ_COUNTRY;
	@Column
	String I021_FWD_COUNTRY;
	@Column
	String I022_POS_ENTRY;
	@Column
	String I032_ACQ_ID;
	@Column
	String I035_TRACK2;
	@Column
	String I037_RET_REF_NO;
	@Column
	String I038_AUTH_ID;
	@Column
	String I039_RESP_CODE;
	@Column
	String I041_POS_ID;
	@Column
	String I042_MER_ID;
	@Column
	String I043A_MER_NAME;
	@Column
	String I043A_MER_CITY;
	@Column
	String I043A_MER_COUNTRY;
	@Column
	String I049_CUR_TRXN;
	@Column
	String I050_CUR_SETTLE;
	@Column
	String I051_CUR_BILL;
	@Column
	String FRAUD;
	@Column
	String I053_SEC_CNTRL;
	@Column
	String I054_ADDTNL_AMT;
	@Column
	String I055_ICC_DATA;
	@Column
	String I056_ORG_DATA;
	@Column
	String I058_AUTH_AGENT;
	@Column
	String I059_POS_GEO_DATA;
	@Column
	String I060_POS_CAP;
	@Column
	long I061V1_OTH_AMT_TXN;
	@Column
	long I061V2_OTH_AMT_BIL;
	@Column
	long I061V3_REP_AMT_BIL;
	@Column
	String I061M_POS_DATA;
	@Column
	String I062V1_AUTH_String;
	@Column
	String I062V2_TRANS_ID;
	@Column
	String I062V3_VALIDAT_CD;
	@Column
	String I062V4_MRKT_DATA;
	@Column
	String I062V5_DURATION;
	@Column
	String I062V6_PRSTG_PROP;
	@Column
	String I063_BANKNET_DATA;
	@Column
	String I063V1_NETWORK_ID;
	@Column
	String I063V2_TIME_LIMIT;
	@Column
	String I063V3_MIS_CAS_RD;
	@Column
	String I063V4_STIP_RS;
	@Column
	String I063V5_PMC_ID;
	@Column
	String I068_RCV_CNTRY;
	@Column
	String I072_MSG_NUM_LST;
	@Column
	String I090_ORIG_DATA;
	@Column
	String I093_RSP_IND;
	@Column
	String I094_SVC_IND;
	@Column
	long I095_ACT_TRAN_AMT;
	@Column
	String I100_RCV_INST;
	@Column
	String I101_FILE_NAME;
	@Column
	String I102_ACCT_ID1;
	@Column
	String I103_ACCT_ID2;
	@Column
	String I104_TRAN_DESC;
	@Column
	String I118_INTRA_COUNTRY;
	@Column
	String I120_ORIG_MSG_TYP;
	@Column
	String I123_ADR_VER;
	@Column
	String I124_GOODS_CODE;
	@Column
	String I125_SUPP_INFO1;
	@Column
	String I126V6_CH_CSERIAL;
	@Column
	String I126V7_ME_CSERIAL;
	@Column
	String I126V8_TRXN_ID;
	@Column
	String I126V9_STAIN;
	@Column
	String I126V10_CVV2;
	@Column
	String I126V18_AGENT_UNIQ_ACC_RSLT;
	@Column
	String I126V20_ADD_AUTH_METHOD;
	@Column
	String I126V21_ADD_AUTH_RSN_CD;
	@Column
	String I130_TERM_CAPA;
	@Column
	String I131_TVR;
	@Column
	String I132_UNPREDICT;
	@Column
	String I133_TERM_SERIAL;
	@Column
	String I134_VISA_DISCR;
	@Column
	int I135A_PREAUTHTRACE;
	@Column
	int I135B_PURCHTRACE;
	@Column
	int I135C_CRYPTTRACE;
	@Column
	int I135D_KEYVERSION;
	@Column
	String I136_CRYPTOGRAM;
	@Column
	String I137_ATC;
	@Column
	String I138_APL;
	@Column
	String I139_1_ARPC;
	@Column
	String I139_2_ARPC_RESCD;
	@Column
	long I142_SCRIPTSEND;
	@Column
	String I143_SCRIPT_RES;
	@Column
	String I144_CRYP_TR;
	@Column
	String I145_TRM_CNTRY;
	@Column
	String I146_TRM_DATE;
	@Column
	String I147_CRYPT_AMT;
	@Column
	String I148_CRYPT_CURR;
	@Column
	String I149_CRYPT_CSBK;
	@Column
	int AUTH_RC;
	
	public IsoData() {
		
	}
	public IsoData(int mULTIINST_ID, long aUTH_SERIAL_NO, Date lTIMESTAMP, String sOURCE, String mSG_FORMAT,
			long oTB_AMT_CNTR, long oTB_AMT_CARD, int mSG_TRXN_TYPE, int mSG_TRXN_MODE, int mSG_TRXN_SPECIFICS,
			long mSG_CLASS, long mSG_TYPE, long tRXN_TYPE, long tRXN_ENTRY_MODE, String i000_MSG_TYPE,
			String i002_NUMBER, String i003_PROC_CODE, long i004_AMT_TRXN, long i005_AMT_SETTLE, long i006_AMT_BILL,
			String i007_TRANS_DT, String i011_TRACE_NO, String i012_LCL_TIME, String i013_LCL_DATE,
			String i014_EXP_DATE, String i018_MER_TYPE, String i019_ACQ_COUNTRY, String i021_FWD_COUNTRY,
			String i022_POS_ENTRY, String i032_ACQ_ID, String i035_TRACK2, String i037_RET_REF_NO, String i038_AUTH_ID,
			String i039_RESP_CODE, String i041_POS_ID, String i042_MER_ID, String i043a_MER_NAME, String i043a_MER_CITY,
			String i043a_MER_COUNTRY, String i049_CUR_TRXN, String i050_CUR_SETTLE, String i051_CUR_BILL, String fRAUD,
			String i053_SEC_CNTRL, String i054_ADDTNL_AMT, String i055_ICC_DATA, String i056_ORG_DATA,
			String i058_AUTH_AGENT, String i059_POS_GEO_DATA, String i060_POS_CAP, long i061v1_OTH_AMT_TXN,
			long i061v2_OTH_AMT_BIL, long i061v3_REP_AMT_BIL, String i061m_POS_DATA, String i062v1_AUTH_String,
			String i062v2_TRANS_ID, String i062v3_VALIDAT_CD, String i062v4_MRKT_DATA, String i062v5_DURATION,
			String i062v6_PRSTG_PROP, String i063_BANKNET_DATA, String i063v1_NETWORK_ID, String i063v2_TIME_LIMIT,
			String i063v3_MIS_CAS_RD, String i063v4_STIP_RS, String i063v5_PMC_ID, String i068_RCV_CNTRY,
			String i072_MSG_NUM_LST, String i090_ORIG_DATA, String i093_RSP_IND, String i094_SVC_IND,
			long i095_ACT_TRAN_AMT, String i100_RCV_INST, String i101_FILE_NAME, String i102_ACCT_ID1,
			String i103_ACCT_ID2, String i104_TRAN_DESC, String i118_INTRA_COUNTRY, String i120_ORIG_MSG_TYP,
			String i123_ADR_VER, String i124_GOODS_CODE, String i125_SUPP_INFO1, String i126v6_CH_CSERIAL,
			String i126v7_ME_CSERIAL, String i126v8_TRXN_ID, String i126v9_STAIN, String i126v10_CVV2,
			String i126v18_AGENT_UNIQ_ACC_RSLT, String i126v20_ADD_AUTH_METHOD, String i126v21_ADD_AUTH_RSN_CD,
			String i130_TERM_CAPA, String i131_TVR, String i132_UNPREDICT, String i133_TERM_SERIAL,
			String i134_VISA_DISCR, int i135a_PREAUTHTRACE, int i135b_PURCHTRACE, int i135c_CRYPTTRACE,
			int i135d_KEYVERSION, String i136_CRYPTOGRAM, String i137_ATC, String i138_APL, String i139_1_ARPC,
			String i139_2_ARPC_RESCD, long i142_SCRIPTSEND, String i143_SCRIPT_RES, String i144_CRYP_TR,
			String i145_TRM_CNTRY, String i146_TRM_DATE, String i147_CRYPT_AMT, String i148_CRYPT_CURR,
			String i149_CRYPT_CSBK, int aUTH_RC) {
		MULTIINST_ID = mULTIINST_ID;
		AUTH_SERIAL_NO = aUTH_SERIAL_NO;
		LTIMESTAMP = lTIMESTAMP;
		SOURCE = sOURCE;
		MSG_FORMAT = mSG_FORMAT;
		OTB_AMT_CNTR = oTB_AMT_CNTR;
		OTB_AMT_CARD = oTB_AMT_CARD;
		MSG_TRXN_TYPE = mSG_TRXN_TYPE;
		MSG_TRXN_MODE = mSG_TRXN_MODE;
		MSG_TRXN_SPECIFICS = mSG_TRXN_SPECIFICS;
		MSG_CLASS = mSG_CLASS;
		MSG_TYPE = mSG_TYPE;
		TRXN_TYPE = tRXN_TYPE;
		TRXN_ENTRY_MODE = tRXN_ENTRY_MODE;
		I000_MSG_TYPE = i000_MSG_TYPE;
		I002_NUMBER = i002_NUMBER;
		I003_PROC_CODE = i003_PROC_CODE;
		I004_AMT_TRXN = i004_AMT_TRXN;
		I005_AMT_SETTLE = i005_AMT_SETTLE;
		I006_AMT_BILL = i006_AMT_BILL;
		I007_TRANS_DT = i007_TRANS_DT;
		I011_TRACE_NO = i011_TRACE_NO;
		I012_LCL_TIME = i012_LCL_TIME;
		I013_LCL_DATE = i013_LCL_DATE;
		I014_EXP_DATE = i014_EXP_DATE;
		I018_MER_TYPE = i018_MER_TYPE;
		I019_ACQ_COUNTRY = i019_ACQ_COUNTRY;
		I021_FWD_COUNTRY = i021_FWD_COUNTRY;
		I022_POS_ENTRY = i022_POS_ENTRY;
		I032_ACQ_ID = i032_ACQ_ID;
		I035_TRACK2 = i035_TRACK2;
		I037_RET_REF_NO = i037_RET_REF_NO;
		I038_AUTH_ID = i038_AUTH_ID;
		I039_RESP_CODE = i039_RESP_CODE;
		I041_POS_ID = i041_POS_ID;
		I042_MER_ID = i042_MER_ID;
		I043A_MER_NAME = i043a_MER_NAME;
		I043A_MER_CITY = i043a_MER_CITY;
		I043A_MER_COUNTRY = i043a_MER_COUNTRY;
		I049_CUR_TRXN = i049_CUR_TRXN;
		I050_CUR_SETTLE = i050_CUR_SETTLE;
		I051_CUR_BILL = i051_CUR_BILL;
		FRAUD = fRAUD;
		I053_SEC_CNTRL = i053_SEC_CNTRL;
		I054_ADDTNL_AMT = i054_ADDTNL_AMT;
		I055_ICC_DATA = i055_ICC_DATA;
		I056_ORG_DATA = i056_ORG_DATA;
		I058_AUTH_AGENT = i058_AUTH_AGENT;
		I059_POS_GEO_DATA = i059_POS_GEO_DATA;
		I060_POS_CAP = i060_POS_CAP;
		I061V1_OTH_AMT_TXN = i061v1_OTH_AMT_TXN;
		I061V2_OTH_AMT_BIL = i061v2_OTH_AMT_BIL;
		I061V3_REP_AMT_BIL = i061v3_REP_AMT_BIL;
		I061M_POS_DATA = i061m_POS_DATA;
		I062V1_AUTH_String = i062v1_AUTH_String;
		I062V2_TRANS_ID = i062v2_TRANS_ID;
		I062V3_VALIDAT_CD = i062v3_VALIDAT_CD;
		I062V4_MRKT_DATA = i062v4_MRKT_DATA;
		I062V5_DURATION = i062v5_DURATION;
		I062V6_PRSTG_PROP = i062v6_PRSTG_PROP;
		I063_BANKNET_DATA = i063_BANKNET_DATA;
		I063V1_NETWORK_ID = i063v1_NETWORK_ID;
		I063V2_TIME_LIMIT = i063v2_TIME_LIMIT;
		I063V3_MIS_CAS_RD = i063v3_MIS_CAS_RD;
		I063V4_STIP_RS = i063v4_STIP_RS;
		I063V5_PMC_ID = i063v5_PMC_ID;
		I068_RCV_CNTRY = i068_RCV_CNTRY;
		I072_MSG_NUM_LST = i072_MSG_NUM_LST;
		I090_ORIG_DATA = i090_ORIG_DATA;
		I093_RSP_IND = i093_RSP_IND;
		I094_SVC_IND = i094_SVC_IND;
		I095_ACT_TRAN_AMT = i095_ACT_TRAN_AMT;
		I100_RCV_INST = i100_RCV_INST;
		I101_FILE_NAME = i101_FILE_NAME;
		I102_ACCT_ID1 = i102_ACCT_ID1;
		I103_ACCT_ID2 = i103_ACCT_ID2;
		I104_TRAN_DESC = i104_TRAN_DESC;
		I118_INTRA_COUNTRY = i118_INTRA_COUNTRY;
		I120_ORIG_MSG_TYP = i120_ORIG_MSG_TYP;
		I123_ADR_VER = i123_ADR_VER;
		I124_GOODS_CODE = i124_GOODS_CODE;
		I125_SUPP_INFO1 = i125_SUPP_INFO1;
		I126V6_CH_CSERIAL = i126v6_CH_CSERIAL;
		I126V7_ME_CSERIAL = i126v7_ME_CSERIAL;
		I126V8_TRXN_ID = i126v8_TRXN_ID;
		I126V9_STAIN = i126v9_STAIN;
		I126V10_CVV2 = i126v10_CVV2;
		I126V18_AGENT_UNIQ_ACC_RSLT = i126v18_AGENT_UNIQ_ACC_RSLT;
		I126V20_ADD_AUTH_METHOD = i126v20_ADD_AUTH_METHOD;
		I126V21_ADD_AUTH_RSN_CD = i126v21_ADD_AUTH_RSN_CD;
		I130_TERM_CAPA = i130_TERM_CAPA;
		I131_TVR = i131_TVR;
		I132_UNPREDICT = i132_UNPREDICT;
		I133_TERM_SERIAL = i133_TERM_SERIAL;
		I134_VISA_DISCR = i134_VISA_DISCR;
		I135A_PREAUTHTRACE = i135a_PREAUTHTRACE;
		I135B_PURCHTRACE = i135b_PURCHTRACE;
		I135C_CRYPTTRACE = i135c_CRYPTTRACE;
		I135D_KEYVERSION = i135d_KEYVERSION;
		I136_CRYPTOGRAM = i136_CRYPTOGRAM;
		I137_ATC = i137_ATC;
		I138_APL = i138_APL;
		I139_1_ARPC = i139_1_ARPC;
		I139_2_ARPC_RESCD = i139_2_ARPC_RESCD;
		I142_SCRIPTSEND = i142_SCRIPTSEND;
		I143_SCRIPT_RES = i143_SCRIPT_RES;
		I144_CRYP_TR = i144_CRYP_TR;
		I145_TRM_CNTRY = i145_TRM_CNTRY;
		I146_TRM_DATE = i146_TRM_DATE;
		I147_CRYPT_AMT = i147_CRYPT_AMT;
		I148_CRYPT_CURR = i148_CRYPT_CURR;
		I149_CRYPT_CSBK = i149_CRYPT_CSBK;
		AUTH_RC = aUTH_RC;
	}
	
	public IsoData getData() {
		IsoData isoData = new IsoData();
		isoData.getMULTIINST_ID();
		isoData.getAUTH_SERIAL_NO();
		isoData.getLTIMESTAMP();
		isoData.getSOURCE();
		isoData.getMSG_FORMAT();
		isoData.getOTB_AMT_CNTR();
		isoData.getOTB_AMT_CARD();
		isoData.getMSG_TRXN_TYPE();
		isoData.getMSG_TRXN_MODE();
		isoData.getMSG_TRXN_SPECIFICS();
		isoData.getMSG_CLASS();
		isoData.getMSG_TYPE();
		isoData.getTRXN_TYPE();
		isoData.getTRXN_ENTRY_MODE();
		isoData.getI000_MSG_TYPE();
		isoData.getI002_NUMBER();
		isoData.getI003_PROC_CODE();
		isoData.getI004_AMT_TRXN();
		isoData.getI005_AMT_SETTLE();
		isoData.getI006_AMT_BILL();
		isoData.getI007_TRANS_DT();
		isoData.getI011_TRACE_NO();
		isoData.getI012_LCL_TIME();
		isoData.getI013_LCL_DATE();
		isoData.getI014_EXP_DATE();
		isoData.getI018_MER_TYPE();
		isoData.getI019_ACQ_COUNTRY();
		isoData.getI021_FWD_COUNTRY();
		isoData.getI022_POS_ENTRY();
		isoData.getI032_ACQ_ID();
		isoData.getI035_TRACK2();
		isoData.getI037_RET_REF_NO();
		isoData.getI038_AUTH_ID();
		isoData.getI039_RESP_CODE();
		isoData.getI041_POS_ID();
		isoData.getI042_MER_ID();
		isoData.getI043A_MER_NAME();
		isoData.getI043A_MER_CITY();
		isoData.getI043A_MER_COUNTRY();
		isoData.getI049_CUR_TRXN();
		isoData.getI050_CUR_SETTLE();
		isoData.getI051_CUR_BILL();
		isoData.getFRAUD();
		isoData.getI053_SEC_CNTRL();
		isoData.getI054_ADDTNL_AMT();
		isoData.getI055_ICC_DATA();
		isoData.getI056_ORG_DATA();
		isoData.getI058_AUTH_AGENT();
		isoData.getI059_POS_GEO_DATA();
		isoData.getI060_POS_CAP();
		isoData.getI061V1_OTH_AMT_TXN();
		isoData.getI061V2_OTH_AMT_BIL();
		isoData.getI061V3_REP_AMT_BIL();
		isoData.getI061M_POS_DATA();
		isoData.getI062V1_AUTH_String();
		isoData.getI062V2_TRANS_ID();
		isoData.getI062V3_VALIDAT_CD();
		isoData.getI062V4_MRKT_DATA();
		isoData.getI062V5_DURATION();
		isoData.getI062V6_PRSTG_PROP();
		isoData.getI063_BANKNET_DATA();
		isoData.getI063V1_NETWORK_ID();
		isoData.getI063V2_TIME_LIMIT();
		isoData.getI063V3_MIS_CAS_RD();
		isoData.getI063V4_STIP_RS();
		isoData.getI063V5_PMC_ID();
		isoData.getI068_RCV_CNTRY();
		isoData.getI072_MSG_NUM_LST();
		isoData.getI090_ORIG_DATA();
		isoData.getI093_RSP_IND();
		isoData.getI094_SVC_IND();
		isoData.getI095_ACT_TRAN_AMT();
		isoData.getI100_RCV_INST();
		isoData.getI101_FILE_NAME();
		isoData.getI102_ACCT_ID1();
		isoData.getI103_ACCT_ID2();
		isoData.getI104_TRAN_DESC();
		isoData.getI118_INTRA_COUNTRY();
		isoData.getI120_ORIG_MSG_TYP();
		isoData.getI123_ADR_VER();
		isoData.getI124_GOODS_CODE();
		isoData.getI125_SUPP_INFO1();
		isoData.getI126V6_CH_CSERIAL();
		isoData.getI126V7_ME_CSERIAL();
		isoData.getI126V8_TRXN_ID();
		isoData.getI126V9_STAIN();
		isoData.getI126V10_CVV2();
		isoData.getI126V18_AGENT_UNIQ_ACC_RSLT();
		isoData.getI126V20_ADD_AUTH_METHOD();
		isoData.getI126V21_ADD_AUTH_RSN_CD();
		isoData.getI130_TERM_CAPA();
		isoData.getI131_TVR();
		isoData.getI132_UNPREDICT();
		isoData.getI133_TERM_SERIAL();
		isoData.getI134_VISA_DISCR();
		isoData.getI135A_PREAUTHTRACE();
		isoData.getI135B_PURCHTRACE();
		isoData.getI135C_CRYPTTRACE();
		isoData.getI135D_KEYVERSION();
		isoData.getI136_CRYPTOGRAM();
		isoData.getI137_ATC();
		isoData.getI138_APL();
		isoData.getI139_1_ARPC();
		isoData.getI139_2_ARPC_RESCD();
		isoData.getI142_SCRIPTSEND();
		isoData.getI143_SCRIPT_RES();
		isoData.getI144_CRYP_TR();
		isoData.getI145_TRM_CNTRY();
		isoData.getI146_TRM_DATE();
		isoData.getI147_CRYPT_AMT();
		isoData.getI148_CRYPT_CURR();
		isoData.getI149_CRYPT_CSBK();
		isoData.getAUTH_RC();
		
		return isoData;
	}
	
	public int getMULTIINST_ID() {
		return MULTIINST_ID;
	}
	public void setMULTIINST_ID(int mULTIINST_ID) {
		MULTIINST_ID = mULTIINST_ID;
	}
	public long getAUTH_SERIAL_NO() {
		return AUTH_SERIAL_NO;
	}
	public void setAUTH_SERIAL_NO(long aUTH_SERIAL_NO) {
		AUTH_SERIAL_NO = aUTH_SERIAL_NO;
	}
	public Date getLTIMESTAMP() {
		return LTIMESTAMP;
	}
	public void setLTIMESTAMP(Date lTIMESTAMP) {
		LTIMESTAMP = lTIMESTAMP;
	}
	public String getSOURCE() {
		return SOURCE;
	}
	public void setSOURCE(String sOURCE) {
		SOURCE = sOURCE;
	}
	public String getMSG_FORMAT() {
		return MSG_FORMAT;
	}
	public void setMSG_FORMAT(String mSG_FORMAT) {
		MSG_FORMAT = mSG_FORMAT;
	}
	public long getOTB_AMT_CNTR() {
		return OTB_AMT_CNTR;
	}
	public void setOTB_AMT_CNTR(long oTB_AMT_CNTR) {
		OTB_AMT_CNTR = oTB_AMT_CNTR;
	}
	public long getOTB_AMT_CARD() {
		return OTB_AMT_CARD;
	}
	public void setOTB_AMT_CARD(long oTB_AMT_CARD) {
		OTB_AMT_CARD = oTB_AMT_CARD;
	}
	public int getMSG_TRXN_TYPE() {
		return MSG_TRXN_TYPE;
	}
	public void setMSG_TRXN_TYPE(int mSG_TRXN_TYPE) {
		MSG_TRXN_TYPE = mSG_TRXN_TYPE;
	}
	public int getMSG_TRXN_MODE() {
		return MSG_TRXN_MODE;
	}
	public void setMSG_TRXN_MODE(int mSG_TRXN_MODE) {
		MSG_TRXN_MODE = mSG_TRXN_MODE;
	}
	public int getMSG_TRXN_SPECIFICS() {
		return MSG_TRXN_SPECIFICS;
	}
	public void setMSG_TRXN_SPECIFICS(int mSG_TRXN_SPECIFICS) {
		MSG_TRXN_SPECIFICS = mSG_TRXN_SPECIFICS;
	}
	public long getMSG_CLASS() {
		return MSG_CLASS;
	}
	public void setMSG_CLASS(long mSG_CLASS) {
		MSG_CLASS = mSG_CLASS;
	}
	public long getMSG_TYPE() {
		return MSG_TYPE;
	}
	public void setMSG_TYPE(long mSG_TYPE) {
		MSG_TYPE = mSG_TYPE;
	}
	public long getTRXN_TYPE() {
		return TRXN_TYPE;
	}
	public void setTRXN_TYPE(long tRXN_TYPE) {
		TRXN_TYPE = tRXN_TYPE;
	}
	public long getTRXN_ENTRY_MODE() {
		return TRXN_ENTRY_MODE;
	}
	public void setTRXN_ENTRY_MODE(long tRXN_ENTRY_MODE) {
		TRXN_ENTRY_MODE = tRXN_ENTRY_MODE;
	}
	public String getI000_MSG_TYPE() {
		return I000_MSG_TYPE;
	}
	public void setI000_MSG_TYPE(String i000_MSG_TYPE) {
		I000_MSG_TYPE = i000_MSG_TYPE;
	}
	public String getI002_NUMBER() {
		return I002_NUMBER;
	}
	public void setI002_NUMBER(String i002_NUMBER) {
		I002_NUMBER = i002_NUMBER;
	}
	public String getI003_PROC_CODE() {
		return I003_PROC_CODE;
	}
	public void setI003_PROC_CODE(String i003_PROC_CODE) {
		I003_PROC_CODE = i003_PROC_CODE;
	}
	public long getI004_AMT_TRXN() {
		return I004_AMT_TRXN;
	}
	public void setI004_AMT_TRXN(long i004_AMT_TRXN) {
		I004_AMT_TRXN = i004_AMT_TRXN;
	}
	public long getI005_AMT_SETTLE() {
		return I005_AMT_SETTLE;
	}
	public void setI005_AMT_SETTLE(long i005_AMT_SETTLE) {
		I005_AMT_SETTLE = i005_AMT_SETTLE;
	}
	public long getI006_AMT_BILL() {
		return I006_AMT_BILL;
	}
	public void setI006_AMT_BILL(long i006_AMT_BILL) {
		I006_AMT_BILL = i006_AMT_BILL;
	}
	public String getI007_TRANS_DT() {
		return I007_TRANS_DT;
	}
	public void setI007_TRANS_DT(String i007_TRANS_DT) {
		I007_TRANS_DT = i007_TRANS_DT;
	}
	public String getI011_TRACE_NO() {
		return I011_TRACE_NO;
	}
	public void setI011_TRACE_NO(String i011_TRACE_NO) {
		I011_TRACE_NO = i011_TRACE_NO;
	}
	public String getI012_LCL_TIME() {
		return I012_LCL_TIME;
	}
	public void setI012_LCL_TIME(String i012_LCL_TIME) {
		I012_LCL_TIME = i012_LCL_TIME;
	}
	public String getI013_LCL_DATE() {
		return I013_LCL_DATE;
	}
	public void setI013_LCL_DATE(String i013_LCL_DATE) {
		I013_LCL_DATE = i013_LCL_DATE;
	}
	public String getI014_EXP_DATE() {
		return I014_EXP_DATE;
	}
	public void setI014_EXP_DATE(String i014_EXP_DATE) {
		I014_EXP_DATE = i014_EXP_DATE;
	}
	public String getI018_MER_TYPE() {
		return I018_MER_TYPE;
	}
	public void setI018_MER_TYPE(String i018_MER_TYPE) {
		I018_MER_TYPE = i018_MER_TYPE;
	}
	public String getI019_ACQ_COUNTRY() {
		return I019_ACQ_COUNTRY;
	}
	public void setI019_ACQ_COUNTRY(String i019_ACQ_COUNTRY) {
		I019_ACQ_COUNTRY = i019_ACQ_COUNTRY;
	}
	public String getI021_FWD_COUNTRY() {
		return I021_FWD_COUNTRY;
	}
	public void setI021_FWD_COUNTRY(String i021_FWD_COUNTRY) {
		I021_FWD_COUNTRY = i021_FWD_COUNTRY;
	}
	public String getI022_POS_ENTRY() {
		return I022_POS_ENTRY;
	}
	public void setI022_POS_ENTRY(String i022_POS_ENTRY) {
		I022_POS_ENTRY = i022_POS_ENTRY;
	}
	public String getI032_ACQ_ID() {
		return I032_ACQ_ID;
	}
	public void setI032_ACQ_ID(String i032_ACQ_ID) {
		I032_ACQ_ID = i032_ACQ_ID;
	}
	public String getI035_TRACK2() {
		return I035_TRACK2;
	}
	public void setI035_TRACK2(String i035_TRACK2) {
		I035_TRACK2 = i035_TRACK2;
	}
	public String getI037_RET_REF_NO() {
		return I037_RET_REF_NO;
	}
	public void setI037_RET_REF_NO(String i037_RET_REF_NO) {
		I037_RET_REF_NO = i037_RET_REF_NO;
	}
	public String getI038_AUTH_ID() {
		return I038_AUTH_ID;
	}
	public void setI038_AUTH_ID(String i038_AUTH_ID) {
		I038_AUTH_ID = i038_AUTH_ID;
	}
	public String getI039_RESP_CODE() {
		return I039_RESP_CODE;
	}
	public void setI039_RESP_CODE(String i039_RESP_CODE) {
		I039_RESP_CODE = i039_RESP_CODE;
	}
	public String getI041_POS_ID() {
		return I041_POS_ID;
	}
	public void setI041_POS_ID(String i041_POS_ID) {
		I041_POS_ID = i041_POS_ID;
	}
	public String getI042_MER_ID() {
		return I042_MER_ID;
	}
	public void setI042_MER_ID(String i042_MER_ID) {
		I042_MER_ID = i042_MER_ID;
	}
	public String getI043A_MER_NAME() {
		return I043A_MER_NAME;
	}
	public void setI043A_MER_NAME(String i043a_MER_NAME) {
		I043A_MER_NAME = i043a_MER_NAME;
	}
	public String getI043A_MER_CITY() {
		return I043A_MER_CITY;
	}
	public void setI043A_MER_CITY(String i043a_MER_CITY) {
		I043A_MER_CITY = i043a_MER_CITY;
	}
	public String getI043A_MER_COUNTRY() {
		return I043A_MER_COUNTRY;
	}
	public void setI043A_MER_COUNTRY(String i043a_MER_COUNTRY) {
		I043A_MER_COUNTRY = i043a_MER_COUNTRY;
	}
	public String getI049_CUR_TRXN() {
		return I049_CUR_TRXN;
	}
	public void setI049_CUR_TRXN(String i049_CUR_TRXN) {
		I049_CUR_TRXN = i049_CUR_TRXN;
	}
	public String getI050_CUR_SETTLE() {
		return I050_CUR_SETTLE;
	}
	public void setI050_CUR_SETTLE(String i050_CUR_SETTLE) {
		I050_CUR_SETTLE = i050_CUR_SETTLE;
	}
	public String getI051_CUR_BILL() {
		return I051_CUR_BILL;
	}
	public void setI051_CUR_BILL(String i051_CUR_BILL) {
		I051_CUR_BILL = i051_CUR_BILL;
	}
	public String getFRAUD() {
		return FRAUD;
	}
	public void setFRAUD(String fRAUD) {
		FRAUD = fRAUD;
	}
	public String getI053_SEC_CNTRL() {
		return I053_SEC_CNTRL;
	}
	public void setI053_SEC_CNTRL(String i053_SEC_CNTRL) {
		I053_SEC_CNTRL = i053_SEC_CNTRL;
	}
	public String getI054_ADDTNL_AMT() {
		return I054_ADDTNL_AMT;
	}
	public void setI054_ADDTNL_AMT(String i054_ADDTNL_AMT) {
		I054_ADDTNL_AMT = i054_ADDTNL_AMT;
	}
	public String getI055_ICC_DATA() {
		return I055_ICC_DATA;
	}
	public void setI055_ICC_DATA(String i055_ICC_DATA) {
		I055_ICC_DATA = i055_ICC_DATA;
	}
	public String getI056_ORG_DATA() {
		return I056_ORG_DATA;
	}
	public void setI056_ORG_DATA(String i056_ORG_DATA) {
		I056_ORG_DATA = i056_ORG_DATA;
	}
	public String getI058_AUTH_AGENT() {
		return I058_AUTH_AGENT;
	}
	public void setI058_AUTH_AGENT(String i058_AUTH_AGENT) {
		I058_AUTH_AGENT = i058_AUTH_AGENT;
	}
	public String getI059_POS_GEO_DATA() {
		return I059_POS_GEO_DATA;
	}
	public void setI059_POS_GEO_DATA(String i059_POS_GEO_DATA) {
		I059_POS_GEO_DATA = i059_POS_GEO_DATA;
	}
	public String getI060_POS_CAP() {
		return I060_POS_CAP;
	}
	public void setI060_POS_CAP(String i060_POS_CAP) {
		I060_POS_CAP = i060_POS_CAP;
	}
	public long getI061V1_OTH_AMT_TXN() {
		return I061V1_OTH_AMT_TXN;
	}
	public void setI061V1_OTH_AMT_TXN(long i061v1_OTH_AMT_TXN) {
		I061V1_OTH_AMT_TXN = i061v1_OTH_AMT_TXN;
	}
	public long getI061V2_OTH_AMT_BIL() {
		return I061V2_OTH_AMT_BIL;
	}
	public void setI061V2_OTH_AMT_BIL(long i061v2_OTH_AMT_BIL) {
		I061V2_OTH_AMT_BIL = i061v2_OTH_AMT_BIL;
	}
	public long getI061V3_REP_AMT_BIL() {
		return I061V3_REP_AMT_BIL;
	}
	public void setI061V3_REP_AMT_BIL(long i061v3_REP_AMT_BIL) {
		I061V3_REP_AMT_BIL = i061v3_REP_AMT_BIL;
	}
	public String getI061M_POS_DATA() {
		return I061M_POS_DATA;
	}
	public void setI061M_POS_DATA(String i061m_POS_DATA) {
		I061M_POS_DATA = i061m_POS_DATA;
	}
	public String getI062V1_AUTH_String() {
		return I062V1_AUTH_String;
	}
	public void setI062V1_AUTH_String(String i062v1_AUTH_String) {
		I062V1_AUTH_String = i062v1_AUTH_String;
	}
	public String getI062V2_TRANS_ID() {
		return I062V2_TRANS_ID;
	}
	public void setI062V2_TRANS_ID(String i062v2_TRANS_ID) {
		I062V2_TRANS_ID = i062v2_TRANS_ID;
	}
	public String getI062V3_VALIDAT_CD() {
		return I062V3_VALIDAT_CD;
	}
	public void setI062V3_VALIDAT_CD(String i062v3_VALIDAT_CD) {
		I062V3_VALIDAT_CD = i062v3_VALIDAT_CD;
	}
	public String getI062V4_MRKT_DATA() {
		return I062V4_MRKT_DATA;
	}
	public void setI062V4_MRKT_DATA(String i062v4_MRKT_DATA) {
		I062V4_MRKT_DATA = i062v4_MRKT_DATA;
	}
	public String getI062V5_DURATION() {
		return I062V5_DURATION;
	}
	public void setI062V5_DURATION(String i062v5_DURATION) {
		I062V5_DURATION = i062v5_DURATION;
	}
	public String getI062V6_PRSTG_PROP() {
		return I062V6_PRSTG_PROP;
	}
	public void setI062V6_PRSTG_PROP(String i062v6_PRSTG_PROP) {
		I062V6_PRSTG_PROP = i062v6_PRSTG_PROP;
	}
	public String getI063_BANKNET_DATA() {
		return I063_BANKNET_DATA;
	}
	public void setI063_BANKNET_DATA(String i063_BANKNET_DATA) {
		I063_BANKNET_DATA = i063_BANKNET_DATA;
	}
	public String getI063V1_NETWORK_ID() {
		return I063V1_NETWORK_ID;
	}
	public void setI063V1_NETWORK_ID(String i063v1_NETWORK_ID) {
		I063V1_NETWORK_ID = i063v1_NETWORK_ID;
	}
	public String getI063V2_TIME_LIMIT() {
		return I063V2_TIME_LIMIT;
	}
	public void setI063V2_TIME_LIMIT(String i063v2_TIME_LIMIT) {
		I063V2_TIME_LIMIT = i063v2_TIME_LIMIT;
	}
	public String getI063V3_MIS_CAS_RD() {
		return I063V3_MIS_CAS_RD;
	}
	public void setI063V3_MIS_CAS_RD(String i063v3_MIS_CAS_RD) {
		I063V3_MIS_CAS_RD = i063v3_MIS_CAS_RD;
	}
	public String getI063V4_STIP_RS() {
		return I063V4_STIP_RS;
	}
	public void setI063V4_STIP_RS(String i063v4_STIP_RS) {
		I063V4_STIP_RS = i063v4_STIP_RS;
	}
	public String getI063V5_PMC_ID() {
		return I063V5_PMC_ID;
	}
	public void setI063V5_PMC_ID(String i063v5_PMC_ID) {
		I063V5_PMC_ID = i063v5_PMC_ID;
	}
	public String getI068_RCV_CNTRY() {
		return I068_RCV_CNTRY;
	}
	public void setI068_RCV_CNTRY(String i068_RCV_CNTRY) {
		I068_RCV_CNTRY = i068_RCV_CNTRY;
	}
	public String getI072_MSG_NUM_LST() {
		return I072_MSG_NUM_LST;
	}
	public void setI072_MSG_NUM_LST(String i072_MSG_NUM_LST) {
		I072_MSG_NUM_LST = i072_MSG_NUM_LST;
	}
	public String getI090_ORIG_DATA() {
		return I090_ORIG_DATA;
	}
	public void setI090_ORIG_DATA(String i090_ORIG_DATA) {
		I090_ORIG_DATA = i090_ORIG_DATA;
	}
	public String getI093_RSP_IND() {
		return I093_RSP_IND;
	}
	public void setI093_RSP_IND(String i093_RSP_IND) {
		I093_RSP_IND = i093_RSP_IND;
	}
	public String getI094_SVC_IND() {
		return I094_SVC_IND;
	}
	public void setI094_SVC_IND(String i094_SVC_IND) {
		I094_SVC_IND = i094_SVC_IND;
	}
	public long getI095_ACT_TRAN_AMT() {
		return I095_ACT_TRAN_AMT;
	}
	public void setI095_ACT_TRAN_AMT(long i095_ACT_TRAN_AMT) {
		I095_ACT_TRAN_AMT = i095_ACT_TRAN_AMT;
	}
	public String getI100_RCV_INST() {
		return I100_RCV_INST;
	}
	public void setI100_RCV_INST(String i100_RCV_INST) {
		I100_RCV_INST = i100_RCV_INST;
	}
	public String getI101_FILE_NAME() {
		return I101_FILE_NAME;
	}
	public void setI101_FILE_NAME(String i101_FILE_NAME) {
		I101_FILE_NAME = i101_FILE_NAME;
	}
	public String getI102_ACCT_ID1() {
		return I102_ACCT_ID1;
	}
	public void setI102_ACCT_ID1(String i102_ACCT_ID1) {
		I102_ACCT_ID1 = i102_ACCT_ID1;
	}
	public String getI103_ACCT_ID2() {
		return I103_ACCT_ID2;
	}
	public void setI103_ACCT_ID2(String i103_ACCT_ID2) {
		I103_ACCT_ID2 = i103_ACCT_ID2;
	}
	public String getI104_TRAN_DESC() {
		return I104_TRAN_DESC;
	}
	public void setI104_TRAN_DESC(String i104_TRAN_DESC) {
		I104_TRAN_DESC = i104_TRAN_DESC;
	}
	public String getI118_INTRA_COUNTRY() {
		return I118_INTRA_COUNTRY;
	}
	public void setI118_INTRA_COUNTRY(String i118_INTRA_COUNTRY) {
		I118_INTRA_COUNTRY = i118_INTRA_COUNTRY;
	}
	public String getI120_ORIG_MSG_TYP() {
		return I120_ORIG_MSG_TYP;
	}
	public void setI120_ORIG_MSG_TYP(String i120_ORIG_MSG_TYP) {
		I120_ORIG_MSG_TYP = i120_ORIG_MSG_TYP;
	}
	public String getI123_ADR_VER() {
		return I123_ADR_VER;
	}
	public void setI123_ADR_VER(String i123_ADR_VER) {
		I123_ADR_VER = i123_ADR_VER;
	}
	public String getI124_GOODS_CODE() {
		return I124_GOODS_CODE;
	}
	public void setI124_GOODS_CODE(String i124_GOODS_CODE) {
		I124_GOODS_CODE = i124_GOODS_CODE;
	}
	public String getI126V6_CH_CSERIAL() {
		return I126V6_CH_CSERIAL;
	}
	public void setI126V6_CH_CSERIAL(String i126v6_CH_CSERIAL) {
		I126V6_CH_CSERIAL = i126v6_CH_CSERIAL;
	}
	public String getI126V7_ME_CSERIAL() {
		return I126V7_ME_CSERIAL;
	}
	public void setI126V7_ME_CSERIAL(String i126v7_ME_CSERIAL) {
		I126V7_ME_CSERIAL = i126v7_ME_CSERIAL;
	}
	public String getI126V8_TRXN_ID() {
		return I126V8_TRXN_ID;
	}
	public void setI126V8_TRXN_ID(String i126v8_TRXN_ID) {
		I126V8_TRXN_ID = i126v8_TRXN_ID;
	}
	public String getI126V9_STAIN() {
		return I126V9_STAIN;
	}
	public void setI126V9_STAIN(String i126v9_STAIN) {
		I126V9_STAIN = i126v9_STAIN;
	}
	public String getI126V10_CVV2() {
		return I126V10_CVV2;
	}
	public void setI126V10_CVV2(String i126v10_CVV2) {
		I126V10_CVV2 = i126v10_CVV2;
	}
	public String getI126V18_AGENT_UNIQ_ACC_RSLT() {
		return I126V18_AGENT_UNIQ_ACC_RSLT;
	}
	public void setI126V18_AGENT_UNIQ_ACC_RSLT(String i126v18_AGENT_UNIQ_ACC_RSLT) {
		I126V18_AGENT_UNIQ_ACC_RSLT = i126v18_AGENT_UNIQ_ACC_RSLT;
	}
	public String getI126V20_ADD_AUTH_METHOD() {
		return I126V20_ADD_AUTH_METHOD;
	}
	public void setI126V20_ADD_AUTH_METHOD(String i126v20_ADD_AUTH_METHOD) {
		I126V20_ADD_AUTH_METHOD = i126v20_ADD_AUTH_METHOD;
	}
	public String getI126V21_ADD_AUTH_RSN_CD() {
		return I126V21_ADD_AUTH_RSN_CD;
	}
	public void setI126V21_ADD_AUTH_RSN_CD(String i126v21_ADD_AUTH_RSN_CD) {
		I126V21_ADD_AUTH_RSN_CD = i126v21_ADD_AUTH_RSN_CD;
	}
	public String getI130_TERM_CAPA() {
		return I130_TERM_CAPA;
	}
	public void setI130_TERM_CAPA(String i130_TERM_CAPA) {
		I130_TERM_CAPA = i130_TERM_CAPA;
	}
	public String getI131_TVR() {
		return I131_TVR;
	}
	public void setI131_TVR(String i131_TVR) {
		I131_TVR = i131_TVR;
	}
	public String getI132_UNPREDICT() {
		return I132_UNPREDICT;
	}
	public void setI132_UNPREDICT(String i132_UNPREDICT) {
		I132_UNPREDICT = i132_UNPREDICT;
	}
	public String getI133_TERM_SERIAL() {
		return I133_TERM_SERIAL;
	}
	public void setI133_TERM_SERIAL(String i133_TERM_SERIAL) {
		I133_TERM_SERIAL = i133_TERM_SERIAL;
	}
	public String getI134_VISA_DISCR() {
		return I134_VISA_DISCR;
	}
	public void setI134_VISA_DISCR(String i134_VISA_DISCR) {
		I134_VISA_DISCR = i134_VISA_DISCR;
	}
	public int getI135A_PREAUTHTRACE() {
		return I135A_PREAUTHTRACE;
	}
	public void setI135A_PREAUTHTRACE(int i135a_PREAUTHTRACE) {
		I135A_PREAUTHTRACE = i135a_PREAUTHTRACE;
	}
	public int getI135B_PURCHTRACE() {
		return I135B_PURCHTRACE;
	}
	public void setI135B_PURCHTRACE(int i135b_PURCHTRACE) {
		I135B_PURCHTRACE = i135b_PURCHTRACE;
	}
	public int getI135C_CRYPTTRACE() {
		return I135C_CRYPTTRACE;
	}
	public void setI135C_CRYPTTRACE(int i135c_CRYPTTRACE) {
		I135C_CRYPTTRACE = i135c_CRYPTTRACE;
	}
	public int getI135D_KEYVERSION() {
		return I135D_KEYVERSION;
	}
	public void setI135D_KEYVERSION(int i135d_KEYVERSION) {
		I135D_KEYVERSION = i135d_KEYVERSION;
	}
	public String getI136_CRYPTOGRAM() {
		return I136_CRYPTOGRAM;
	}
	public void setI136_CRYPTOGRAM(String i136_CRYPTOGRAM) {
		I136_CRYPTOGRAM = i136_CRYPTOGRAM;
	}
	public String getI137_ATC() {
		return I137_ATC;
	}
	public void setI137_ATC(String i137_ATC) {
		I137_ATC = i137_ATC;
	}
	public String getI138_APL() {
		return I138_APL;
	}
	public void setI138_APL(String i138_APL) {
		I138_APL = i138_APL;
	}
	public String getI139_1_ARPC() {
		return I139_1_ARPC;
	}
	public void setI139_1_ARPC(String i139_1_ARPC) {
		I139_1_ARPC = i139_1_ARPC;
	}
	public String getI139_2_ARPC_RESCD() {
		return I139_2_ARPC_RESCD;
	}
	public void setI139_2_ARPC_RESCD(String i139_2_ARPC_RESCD) {
		I139_2_ARPC_RESCD = i139_2_ARPC_RESCD;
	}
	public long getI142_SCRIPTSEND() {
		return I142_SCRIPTSEND;
	}
	public void setI142_SCRIPTSEND(long i142_SCRIPTSEND) {
		I142_SCRIPTSEND = i142_SCRIPTSEND;
	}
	public String getI143_SCRIPT_RES() {
		return I143_SCRIPT_RES;
	}
	public void setI143_SCRIPT_RES(String i143_SCRIPT_RES) {
		I143_SCRIPT_RES = i143_SCRIPT_RES;
	}
	public String getI144_CRYP_TR() {
		return I144_CRYP_TR;
	}
	public void setI144_CRYP_TR(String i144_CRYP_TR) {
		I144_CRYP_TR = i144_CRYP_TR;
	}
	public String getI145_TRM_CNTRY() {
		return I145_TRM_CNTRY;
	}
	public void setI145_TRM_CNTRY(String i145_TRM_CNTRY) {
		I145_TRM_CNTRY = i145_TRM_CNTRY;
	}
	public String getI146_TRM_DATE() {
		return I146_TRM_DATE;
	}
	public void setI146_TRM_DATE(String i146_TRM_DATE) {
		I146_TRM_DATE = i146_TRM_DATE;
	}
	public String getI147_CRYPT_AMT() {
		return I147_CRYPT_AMT;
	}
	public void setI147_CRYPT_AMT(String i147_CRYPT_AMT) {
		I147_CRYPT_AMT = i147_CRYPT_AMT;
	}
	public String getI148_CRYPT_CURR() {
		return I148_CRYPT_CURR;
	}
	public void setI148_CRYPT_CURR(String i148_CRYPT_CURR) {
		I148_CRYPT_CURR = i148_CRYPT_CURR;
	}
	public String getI149_CRYPT_CSBK() {
		return I149_CRYPT_CSBK;
	}
	public void setI149_CRYPT_CSBK(String i149_CRYPT_CSBK) {
		I149_CRYPT_CSBK = i149_CRYPT_CSBK;
	}
	public int getAUTH_RC() {
		return AUTH_RC;
	}
	public void setAUTH_RC(int aUTH_RC) {
		AUTH_RC = aUTH_RC;
	}
	@Override
	public void readData(ObjectDataInput in) throws IOException {
		MULTIINST_ID = in.readInt();
		AUTH_SERIAL_NO = in.readLong();
		LTIMESTAMP = new Date(in.readLong());
		SOURCE = in.readUTF();
		MSG_FORMAT = in.readUTF();
		OTB_AMT_CNTR = in.readLong();
		OTB_AMT_CARD = in.readLong();
		MSG_TRXN_TYPE = in.readInt();
		MSG_TRXN_MODE = in.readInt();
		MSG_TRXN_SPECIFICS = in.readInt();
		MSG_CLASS = in.readLong();
		MSG_TYPE = in.readLong();
		TRXN_TYPE = in.readLong();
		TRXN_ENTRY_MODE = in.readLong();
		I000_MSG_TYPE = in.readUTF();
		I002_NUMBER = in.readUTF();
		I003_PROC_CODE = in.readUTF();
		I004_AMT_TRXN = in.readLong();
		I005_AMT_SETTLE = in.readLong();
		I006_AMT_BILL = in.readLong();
		I007_TRANS_DT = in.readUTF();
		I011_TRACE_NO = in.readUTF();
		I012_LCL_TIME = in.readUTF();
		I013_LCL_DATE = in.readUTF();
		I014_EXP_DATE = in.readUTF();
		I018_MER_TYPE = in.readUTF();
		I019_ACQ_COUNTRY = in.readUTF();
		I021_FWD_COUNTRY = in.readUTF();
		I022_POS_ENTRY = in.readUTF();
		I032_ACQ_ID = in.readUTF();
		I035_TRACK2 = in.readUTF();
		I037_RET_REF_NO = in.readUTF();
		I038_AUTH_ID = in.readUTF();
		I039_RESP_CODE = in.readUTF();
		I041_POS_ID = in.readUTF();
		I042_MER_ID = in.readUTF();
		I043A_MER_NAME = in.readUTF();
		I043A_MER_CITY = in.readUTF();
		I043A_MER_COUNTRY = in.readUTF();
		I049_CUR_TRXN = in.readUTF();
		I050_CUR_SETTLE = in.readUTF();
		I051_CUR_BILL = in.readUTF();
		FRAUD = in.readUTF();
		I053_SEC_CNTRL = in.readUTF();
		I054_ADDTNL_AMT = in.readUTF();
		I055_ICC_DATA = in.readUTF();
		I056_ORG_DATA = in.readUTF();
		I058_AUTH_AGENT = in.readUTF();
		I059_POS_GEO_DATA = in.readUTF();
		I060_POS_CAP = in.readUTF();
		I061V1_OTH_AMT_TXN = in.readLong();
		I061V2_OTH_AMT_BIL = in.readLong();
		I061V3_REP_AMT_BIL = in.readLong();
		I061M_POS_DATA = in.readUTF();
		I062V1_AUTH_String = in.readUTF();
		I062V2_TRANS_ID = in.readUTF();
		I062V3_VALIDAT_CD = in.readUTF();
		I062V4_MRKT_DATA = in.readUTF();
		I062V5_DURATION = in.readUTF();
		I062V6_PRSTG_PROP = in.readUTF();
		I063_BANKNET_DATA = in.readUTF();
		I063V1_NETWORK_ID = in.readUTF();
		I063V2_TIME_LIMIT = in.readUTF();
		I063V3_MIS_CAS_RD = in.readUTF();
		I063V4_STIP_RS = in.readUTF();
		I063V5_PMC_ID = in.readUTF();
		I068_RCV_CNTRY = in.readUTF();
		I072_MSG_NUM_LST = in.readUTF();
		I090_ORIG_DATA = in.readUTF();
		I093_RSP_IND = in.readUTF();
		I094_SVC_IND = in.readUTF();
		I095_ACT_TRAN_AMT = in.readLong();
		I100_RCV_INST = in.readUTF();
		I101_FILE_NAME = in.readUTF();
		I102_ACCT_ID1 = in.readUTF();
		I103_ACCT_ID2 = in.readUTF();
		I104_TRAN_DESC = in.readUTF();
		I118_INTRA_COUNTRY = in.readUTF();
		I120_ORIG_MSG_TYP = in.readUTF();
		I123_ADR_VER = in.readUTF();
		I124_GOODS_CODE = in.readUTF();
		I125_SUPP_INFO1 = in.readUTF();
		I126V6_CH_CSERIAL = in.readUTF();
		I126V7_ME_CSERIAL = in.readUTF();
		I126V8_TRXN_ID = in.readUTF();
		I126V9_STAIN = in.readUTF();
		I126V10_CVV2 = in.readUTF();
		I126V18_AGENT_UNIQ_ACC_RSLT = in.readUTF();
		I126V20_ADD_AUTH_METHOD = in.readUTF();
		I126V21_ADD_AUTH_RSN_CD = in.readUTF();
		I130_TERM_CAPA = in.readUTF();
		I131_TVR = in.readUTF();
		I132_UNPREDICT = in.readUTF();
		I133_TERM_SERIAL = in.readUTF();
		I134_VISA_DISCR = in.readUTF();
		I135A_PREAUTHTRACE = in.readInt();
		I135B_PURCHTRACE = in.readInt();
		I135C_CRYPTTRACE = in.readInt();
		I135D_KEYVERSION = in.readInt();
		I136_CRYPTOGRAM = in.readUTF();
		I137_ATC = in.readUTF();
		I138_APL = in.readUTF();
		I139_1_ARPC = in.readUTF();
		I139_2_ARPC_RESCD = in.readUTF();
		I142_SCRIPTSEND = in.readLong();
		I143_SCRIPT_RES = in.readUTF();
		I144_CRYP_TR = in.readUTF();
		I145_TRM_CNTRY = in.readUTF();
		I146_TRM_DATE = in.readUTF();
		I147_CRYPT_AMT = in.readUTF();
		I148_CRYPT_CURR = in.readUTF();
		I149_CRYPT_CSBK = in.readUTF();
		AUTH_RC = in.readInt();
		
	}
	@Override
	public void writeData(ObjectDataOutput out) throws IOException {
		out.writeInt(MULTIINST_ID);
		out.writeLong(AUTH_SERIAL_NO);
		out.writeLong(LTIMESTAMP.getTime());
		out.writeUTF(SOURCE);
		out.writeUTF(MSG_FORMAT);
		out.writeLong(OTB_AMT_CNTR);
		out.writeLong(OTB_AMT_CARD);
		out.writeInt(MSG_TRXN_TYPE);
		out.writeInt(MSG_TRXN_MODE);
		out.writeInt(MSG_TRXN_SPECIFICS);
		out.writeLong(MSG_CLASS);
		out.writeLong(MSG_TYPE);
		out.writeLong(TRXN_TYPE);
		out.writeLong(TRXN_ENTRY_MODE);
		out.writeUTF(I000_MSG_TYPE);
		out.writeUTF(I002_NUMBER);
		out.writeUTF(I003_PROC_CODE);
		out.writeLong(I004_AMT_TRXN);
		out.writeLong(I005_AMT_SETTLE);
		out.writeLong(I006_AMT_BILL);
		out.writeUTF(I007_TRANS_DT);
		out.writeUTF(I011_TRACE_NO);
		out.writeUTF(I012_LCL_TIME);
		out.writeUTF(I013_LCL_DATE);
		out.writeUTF(I014_EXP_DATE);
		out.writeUTF(I018_MER_TYPE);
		out.writeUTF(I019_ACQ_COUNTRY);
		out.writeUTF(I021_FWD_COUNTRY);
		out.writeUTF(I022_POS_ENTRY);
		out.writeUTF(I032_ACQ_ID);
		out.writeUTF(I035_TRACK2);
		out.writeUTF(I037_RET_REF_NO);
		out.writeUTF(I038_AUTH_ID);
		out.writeUTF(I039_RESP_CODE);
		out.writeUTF(I041_POS_ID);
		out.writeUTF(I042_MER_ID);
		out.writeUTF(I043A_MER_NAME);
		out.writeUTF(I043A_MER_CITY);
		out.writeUTF(I043A_MER_COUNTRY);
		out.writeUTF(I049_CUR_TRXN);
		out.writeUTF(I050_CUR_SETTLE);
		out.writeUTF(I051_CUR_BILL);
		out.writeUTF(FRAUD);
		out.writeUTF(I053_SEC_CNTRL);
		out.writeUTF(I054_ADDTNL_AMT);
		out.writeUTF(I055_ICC_DATA);
		out.writeUTF(I056_ORG_DATA);
		out.writeUTF(I058_AUTH_AGENT);
		out.writeUTF(I059_POS_GEO_DATA);
		out.writeUTF(I060_POS_CAP);
		out.writeLong(I061V1_OTH_AMT_TXN);
		out.writeLong(I061V2_OTH_AMT_BIL);
		out.writeLong(I061V3_REP_AMT_BIL);
		out.writeUTF(I061M_POS_DATA);
		out.writeUTF(I062V1_AUTH_String);
		out.writeUTF(I062V2_TRANS_ID);
		out.writeUTF(I062V3_VALIDAT_CD);
		out.writeUTF(I062V4_MRKT_DATA);
		out.writeUTF(I062V5_DURATION);
		out.writeUTF(I062V6_PRSTG_PROP);
		out.writeUTF(I063_BANKNET_DATA);
		out.writeUTF(I063V1_NETWORK_ID);
		out.writeUTF(I063V2_TIME_LIMIT);
		out.writeUTF(I063V3_MIS_CAS_RD);
		out.writeUTF(I063V4_STIP_RS);
		out.writeUTF(I063V5_PMC_ID);
		out.writeUTF(I068_RCV_CNTRY);
		out.writeUTF(I072_MSG_NUM_LST);
		out.writeUTF(I090_ORIG_DATA);
		out.writeUTF(I093_RSP_IND);
		out.writeUTF(I094_SVC_IND);
		out.writeLong(I095_ACT_TRAN_AMT);
		out.writeUTF(I100_RCV_INST);
		out.writeUTF(I101_FILE_NAME);
		out.writeUTF(I102_ACCT_ID1);
		out.writeUTF(I103_ACCT_ID2);
		out.writeUTF(I104_TRAN_DESC);
		out.writeUTF(I118_INTRA_COUNTRY);
		out.writeUTF(I120_ORIG_MSG_TYP);
		out.writeUTF(I123_ADR_VER);
		out.writeUTF(I124_GOODS_CODE);
		out.writeUTF(I125_SUPP_INFO1);
		out.writeUTF(I126V6_CH_CSERIAL);
		out.writeUTF(I126V7_ME_CSERIAL);
		out.writeUTF(I126V8_TRXN_ID);
		out.writeUTF(I126V9_STAIN);
		out.writeUTF(I126V10_CVV2);
		out.writeUTF(I126V18_AGENT_UNIQ_ACC_RSLT);
		out.writeUTF(I126V20_ADD_AUTH_METHOD);
		out.writeUTF(I126V21_ADD_AUTH_RSN_CD);
		out.writeUTF(I130_TERM_CAPA);
		out.writeUTF(I131_TVR);
		out.writeUTF(I132_UNPREDICT);
		out.writeUTF(I133_TERM_SERIAL);
		out.writeUTF(I134_VISA_DISCR);
		out.writeInt(I135A_PREAUTHTRACE);
		out.writeInt(I135B_PURCHTRACE);
		out.writeInt(I135C_CRYPTTRACE);
		out.writeInt(I135D_KEYVERSION);
		out.writeUTF(I136_CRYPTOGRAM);
		out.writeUTF(I137_ATC);
		out.writeUTF(I138_APL);
		out.writeUTF(I139_1_ARPC);
		out.writeUTF(I139_2_ARPC_RESCD);
		out.writeLong(I142_SCRIPTSEND);
		out.writeUTF(I143_SCRIPT_RES);
		out.writeUTF(I144_CRYP_TR);
		out.writeUTF(I145_TRM_CNTRY);
		out.writeUTF(I146_TRM_DATE);
		out.writeUTF(I147_CRYPT_AMT);
		out.writeUTF(I148_CRYPT_CURR);
		out.writeUTF(I149_CRYPT_CSBK);
		out.writeInt(AUTH_RC);
	}
	
	}
