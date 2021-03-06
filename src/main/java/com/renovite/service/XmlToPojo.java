package com.renovite.service;

import org.jpos.iso.ISOMsg;

import com.renovite.model.IsoField;

public class XmlToPojo {

	public void convert(int index, ISOMsg msg, IsoField fields) {
		
		switch(index) {
		case 0:fields.setMSG_TYPE_0(msg.getString(index));
		break;
		case 2: fields.setPRIMARY_ACCOUNT_NUMBER_2(msg.getString(index));
		break;
		case 3: fields.setPROCESSING_CODE_3(msg.getString(index));
		break;
		case 4: fields.setAMOUNT_TRANSACTION_4(Long.parseLong(msg.getString(index)));
		break;
		case 5: fields.setAMOUNT_SETTLEMENT_5(Long.parseLong(msg.getString(index)));
		break;
		case 6: fields.setAMOUNT_CARDHOLDER_BILLING_6(Long.parseLong(msg.getString(index)));
		break;
		case 7: fields.setTRANSMISSION_DATE_AND_TIME_7(msg.getString(index));
		break;
		case 8: fields.setAMOUNT_CARDHOLDER_BILLING_FEE_8(msg.getString(index));
		break;
		case 9: fields.setCONVERSION_RATE_SETTLEMENT_9(msg.getString(index));
		break;
		case 10: fields.setCONVERSION_RATE_CARDHOLDER_BILLING_10(msg.getString(index));
		break;
		case 11: fields.setSYSTEM_TRACE_AUDIT_NUMBER_11(msg.getString(index));
		break;
		case 12: fields.setTIME_LOCAL_TRANSACTION_12(msg.getString(index));
		break;
		case 13: fields.setDATE_LOCAL_TRANSACTION_13(msg.getString(index));
		break;
		case 14: fields.setDATE_EXPIRATION_14(msg.getString(index));
		break;
		case 15: fields.setDATE_SETTLEMENT_15(msg.getString(index));
		break;
		case 16: fields.setDATE_CONVERSION_16(msg.getString(index));
		break;
		case 17: fields.setDATE_CAPTURE_17(msg.getString(index));
		break;
		case 18: fields.setMERCHANTS_TYPE_18(msg.getString(index));
		break;
		case 19: fields.setACQUIRING_INSTITUTION_COUNTRY_CODE_19(msg.getString(index));
		break;
		case 20: fields.setPAN_EXTENDED_COUNTRY_CODE_20(msg.getString(index));
		break;
		case 21: fields.setFORWARDING_INSTITUTION_COUNTRY_CODE_21(msg.getString(index));
		break;
		case 22: fields.setPOINT_OF_SERVICE_ENTRY_MODE_22(msg.getString(index));
		break;
		case 23: fields.setCARD_SEQUENCE_NUMBER_23(msg.getString(index));
		break;
		case 24: fields.setNETWORK_INTERNATIONAL_IDENTIFIEER_24(msg.getString(index));
		break;
		case 25: fields.setPOINT_OF_SERVICE_CONDITION_CODE_25(msg.getString(index));
		break;
		case 26: fields.setPOINT_OF_SERVICE_PIN_CAPTURE_CODE_26(msg.getString(index));
		break;
		case 27: fields.setAUTHORIZATION_IDENTIFICATION_RESP_LEN_27(msg.getString(index));
		break;
		case 28: fields.setAMOUNT_TRANSACTION_FEE_28(msg.getString(index));
		break;
		case 29: fields.setAMOUNT_SETTLEMENT_FEE_29(msg.getString(index));
		break;
		case 30: fields.setAMOUNT_TRANSACTION_PROCESSING_FEE_30(msg.getString(index));
		break;
		case 31: fields.setAMOUNT_SETTLEMENT_PROCESSING_FEE_31(msg.getString(index));
		break;
		case 32: fields.setACQUIRING_INSTITUTION_IDENT_CODE_32(msg.getString(index));
		break;
		case 33: fields.setFORWARDING_INSTITUTION_IDENT_CODE_33(msg.getString(index));
		break;
		case 34: fields.setPAN_EXTENDED_34(msg.getString(index));
		break;
		case 35: fields.setTRACK_2_DATA_35(msg.getString(index));
		break;
		case 36: fields.setTRACK_3_DATA_36(msg.getString(index));
		break;
		case 37: fields.setRETRIEVAL_REFERENCE_NUMBER_37(msg.getString(index));
		break;
		case 38: fields.setAUTHORIZATION_IDENTIFICATION_RESPONSE_38(msg.getString(index));
		break;
		case 39: fields.setRESPONSE_CODE_39(msg.getString(index));
		break;
		case 40: fields.setSERVICE_RESTRICTION_CODE_40(msg.getString(index));
		break;
		case 41: fields.setCARD_ACCEPTOR_TERMINAL_IDENTIFICACION_41(msg.getString(index));
		break;
		case 42: fields.setCARD_ACCEPTOR_IDENTIFICATION_CODE_42(msg.getString(index));
		break;
		case 43: fields.setCARD_ACCEPTOR_NAME_OR_LOCATION_43(msg.getString(index));
		break;
		case 44: fields.setADITIONAL_RESPONSE_DATA_44(msg.getString(index));
		break;
		case 45: fields.setTRACK_1_DATA_45(msg.getString(index));
		break;
		case 46: fields.setADITIONAL_DATA_ISO_46(msg.getString(index));
		break;
		case 47: fields.setADITIONAL_DATA_NATIONAL_47(msg.getString(index));
		break;
		case 48: fields.setADITIONAL_DATA_PRIVATE_48(msg.getString(index));
		break;
		case 49: fields.setCURRENCY_CODE_TRANSACTION_49(msg.getString(index));
		break;
		case 50: fields.setCURRENCY_CODE_SETTLEMENT_50(msg.getString(index));
		break;
		case 51: fields.setCURRENCY_CODE_CARDHOLDER_BILLING_51(msg.getString(index));
		break;
		case 52: fields.setPIN_DATA_52(msg.getString(index));
		break;
		case 53: fields.setSECURITY_RELATED_CONTROL_INFORMATION_53(msg.getString(index));
		break;
		case 54: fields.setADDITIONAL_AMOUNTS_54(msg.getString(index));
		break;
		case 55: fields.setRESERVED_ISO_55(msg.getString(index));
		break;
		case 56: fields.setRESERVED_ISO_56(msg.getString(index));
		break;   
		case 57: fields.setRESERVED_NATIONAL_57(msg.getString(index));
		break;
		case 58: fields.setRESERVED_NATIONAL_58(msg.getString(index));
		break;
		case 59: fields.setRESERVED_NATIONAL_59(msg.getString(index));
		break;
		case 60: fields.setRESERVED_PRIVATE_60(msg.getString(index));
		break;
		case 61: fields.setRESERVED_PRIVATE_61(msg.getString(index));
		break;
		case 62: fields.setRESERVED_PRIVATE_62(msg.getString(index));
		break;
		case 63: fields.setRESERVED_PRIVATE_63(msg.getString(index));
		break;
		case 64: fields.setMESSAGE_AUTHENTICATION_CODE_FIELD_64(msg.getString(index));
		break;
		case 65: fields.setBITMAP_EXTENDED_65(msg.getString(index));
		break;
		case 66: fields.setSETTLEMENT_CODE_66(msg.getString(index));
		break;
		case 67: fields.setEXTENDED_PAYMENT_CODE_67(msg.getString(index));
		break;
		case 68: fields.setRECEIVING_INSTITUTION_COUNTRY_CODE_68(msg.getString(index));
		break;
		case 69: fields.setSETTLEMENT_INSTITUTION_COUNTRY_CODE_69(msg.getString(index));
		break;
		case 70: fields.setNETWORK_MANAGEMENT_INFORMATION_CODE_70(msg.getString(index));
		break;
		case 71: fields.setMESSAGE_NUMBER_71(msg.getString(index));
		break;
		case 72: fields.setMESSAGE_NUMBER_LAST_72(msg.getString(index));
		break;
		case 73: fields.setDATE_ACTION_73(msg.getString(index));
		break;
		case 74: fields.setCREDITS_NUMBER_74(msg.getString(index));
		break;
		case 75: fields.setCREDITS_REVERSAL_NUMBER_75(msg.getString(index));
		break;
		case 76: fields.setDEBITS_NUMBER_76(msg.getString(index));
		break;
		case 77: fields.setDEBITS_REVERSAL_NUMBER_77(msg.getString(index));
		break;
		case 78: fields.setTRANSFER_NUMBER_78(msg.getString(index));
		break;
		case 79: fields.setTRANSFER_REVERSAL_NUMBER_79(msg.getString(index));
		break;
		case 80: fields.setINQUIRIES_NUMBER_80(msg.getString(index));
		break;
		case 81: fields.setAUTHORIZATION_NUMBER_81(msg.getString(index));
		break;
		case 82: fields.setCREDITS_PROCESSING_FEE_AMOUNT_82(msg.getString(index));
		break;
		case 83: fields.setCREDITS_TRANSACTION_FEE_AMOUNT_83(msg.getString(index));
		break;
		case 84: fields.setDEBITS_PROCESSING_FEE_AMOUNT_84(msg.getString(index));
		break;
		case 85: fields.setDEBITS_TRANSACTION_FEE_AMOUNT_85(msg.getString(index));
		break;
		case 86: fields.setCREDITS_AMOUNT_86(msg.getString(index));
		break;
		case 87: fields.setCREDITS_REVERSAL_AMOUNT_87(msg.getString(index));
		break;
		case 88: fields.setDEBITS_AMOUNT_88(msg.getString(index));
		break;
		case 89: fields.setDEBITS_REVERSAL_AMOUNT_89(msg.getString(index));
		break;
		case 90: fields.setORIGINAL_DATA_ELEMENTS_90(msg.getString(index));
		break;
		case 91: fields.setFILE_UPDATE_CODE_91(msg.getString(index));
		break;
		case 92: fields.setFILE_SECURITY_CODE_92(msg.getString(index));
		break;
		case 93: fields.setRESPONSE_INDICATOR_93(msg.getString(index));
		break;
		case 94: fields.setSERVICE_INDICATOR_94(msg.getString(index));
		break;
		case 95: fields.setREPLACEMENT_AMOUNTS_95(Long.parseLong(msg.getString(index)));
		break;
		case 96: fields.setMESSAGE_SECURITY_CODE_96(msg.getString(index));
		break;
		case 97: fields.setAMOUNT_NET_SETTLEMENT_97(msg.getString(index));
		break;
		case 98: fields.setPAYEE_98(msg.getString(index));
		break;
		case 99: fields.setSETTLEMENT_INSTITUTION_IDENT_CODE_99(msg.getString(index));
		break;
		case 100: fields.setRECEIVING_INSTITUTION_IDENT_CODE_100(msg.getString(index));
		break;
		case 101: fields.setFILE_NAME_101(msg.getString(index));
		break;
		case 102: fields.setACCOUNT_IDENTIFICATION_1_102(msg.getString(index));
		break;
		case 103: fields.setACCOUNT_IDENTIFICATION_2_103(msg.getString(index));
		break;
		case 104: fields.setTRANSACTION_DESCRIPTION_104(msg.getString(index));
		break;
		case 105: fields.setRESERVED_ISO_USE_105(msg.getString(index));
		break;
		case 106: fields.setRESERVED_ISO_USE_106(msg.getString(index));
		break;
		case 107: fields.setRESERVED_ISO_USE_107(msg.getString(index));
		break;
		case 108: fields.setRESERVED_ISO_USE_108(msg.getString(index));
		break;
		case 109: fields.setRESERVED_ISO_USE_109(msg.getString(index));
		break;
		case 110: fields.setRESERVED_ISO_USE_110(msg.getString(index));
		break;
		case 111: fields.setRESERVED_ISO_USE_111(msg.getString(index));
		break;
		case 112: fields.setRESERVED_NATIONAL_USE_112(msg.getString(index));
		break;
		case 113: fields.setRESERVED_NATIONAL_USE_113(msg.getString(index));
		break;
		case 114: fields.setRESERVED_NATIONAL_USE_114(msg.getString(index));
		break;
		case 115: fields.setRESERVED_NATIONAL_USE_115(msg.getString(index));
		break;
		case 116: fields.setRESERVED_NATIONAL_USE_116(msg.getString(index));
		break;
		case 117: fields.setRESERVED_NATIONAL_USE_117(msg.getString(index));
		break;
		case 118: fields.setRESERVED_NATIONAL_USE_118(msg.getString(index));
		break;
		case 119: fields.setRESERVED_NATIONAL_USE_119(msg.getString(index));
		break;
		case 120: fields.setRESERVED_PRIVATE_USE_120(msg.getString(index));
		break;
		case 121: fields.setRESERVED_PRIVATE_USE_121(msg.getString(index));
		break;
		case 122: fields.setRESERVED_PRIVATE_USE_122(msg.getString(index));
		break;
		case 123: fields.setRESERVED_PRIVATE_USE_123(msg.getString(index));
		break;
		case 124: fields.setRESERVED_PRIVATE_USE_124(msg.getString(index));
		break;
		case 125: fields.setRESERVED_PRIVATE_USE_125(msg.getString(index));
		break;
		case 126: fields.setRESERVED_PRIVATE_USE_126(msg.getString(index));
		break;
		case 127: fields.setRESERVED_PRIVATE_USE_127(msg.getString(index));
		break;
		case 128: fields.setMAC_2_128(msg.getString(index));
		break;
		}
		
	}
}
