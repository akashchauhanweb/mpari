package com.nic.mparivahan.AddCov.PojoClass;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\bq\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bí\u0002\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010 \u001a\u00020\u0004\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\u0006\u0010\"\u001a\u00020\u0004\u0012\u0006\u0010#\u001a\u00020\u0004\u0012\u0006\u0010$\u001a\u00020\u0004\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\u0006\u0010'\u001a\u00020\u0004\u0012\u0006\u0010(\u001a\u00020\u0004\u0012\u0006\u0010)\u001a\u00020\u0004\u0012\u0006\u0010*\u001a\u00020\u0004\u0012\u0006\u0010+\u001a\u00020\u0004\u0012\u0006\u0010,\u001a\u00020\u001e\u0012\u0006\u0010-\u001a\u00020\u0004\u0012\u0006\u0010.\u001a\u00020\u0004\u0012\u0006\u0010/\u001a\u00020\u0004\u0012\u0006\u00100\u001a\u00020\u0004\u0012\u0006\u00101\u001a\u00020\u001c¢\u0006\u0002\u00102J\u0019\u0010b\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\t\u0010c\u001a\u00020\u0004HÆ\u0003J\t\u0010d\u001a\u00020\u0004HÆ\u0003J\t\u0010e\u001a\u00020\u0004HÆ\u0003J\t\u0010f\u001a\u00020\u0004HÆ\u0003J\t\u0010g\u001a\u00020\u0004HÆ\u0003J\t\u0010h\u001a\u00020\u0004HÆ\u0003J\t\u0010i\u001a\u00020\u0004HÆ\u0003J\t\u0010j\u001a\u00020\u0004HÆ\u0003J\t\u0010k\u001a\u00020\u0004HÆ\u0003J\t\u0010l\u001a\u00020\u0004HÆ\u0003J\t\u0010m\u001a\u00020\u0004HÆ\u0003J\t\u0010n\u001a\u00020\u0004HÆ\u0003J\t\u0010o\u001a\u00020\u0004HÆ\u0003J\t\u0010p\u001a\u00020\u0004HÆ\u0003J\t\u0010q\u001a\u00020\u001cHÆ\u0003J\t\u0010r\u001a\u00020\u001eHÆ\u0003J\t\u0010s\u001a\u00020\u0004HÆ\u0003J\t\u0010t\u001a\u00020\u0004HÆ\u0003J\t\u0010u\u001a\u00020\u0004HÆ\u0003J\t\u0010v\u001a\u00020\u0004HÆ\u0003J\t\u0010w\u001a\u00020\u0004HÆ\u0003J\t\u0010x\u001a\u00020\u0004HÆ\u0003J\t\u0010y\u001a\u00020\u0004HÆ\u0003J\t\u0010z\u001a\u00020\u0004HÆ\u0003J\t\u0010{\u001a\u00020\u0004HÆ\u0003J\t\u0010|\u001a\u00020\u0004HÆ\u0003J\t\u0010}\u001a\u00020\u0004HÆ\u0003J\t\u0010~\u001a\u00020\u0004HÆ\u0003J\t\u0010\u007f\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u001eHÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u001cHÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0004HÆ\u0003JÈ\u0003\u0010\u008d\u0001\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u001e2\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020\u00042\b\b\u0002\u00101\u001a\u00020\u001cHÆ\u0001J\u0016\u0010\u008e\u0001\u001a\u00020\u001e2\n\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0090\u0001HÖ\u0003J\n\u0010\u0091\u0001\u001a\u00020\u001cHÖ\u0001J\n\u0010\u0092\u0001\u001a\u00020\u0004HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00106R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00106R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u00106R\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u00106R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u00106R\u0011\u0010\f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u00106R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u00106R\u0011\u0010\u000e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u00106R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u00106R\u0011\u0010\u0010\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u00106R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u00106R\u0011\u0010\u0012\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u00106R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u00106R\u0011\u0010\u0014\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u00106R\u0011\u0010\u0015\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u00106R\u0011\u0010\u0016\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u00106R\u0011\u0010\u0017\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u00106R\u0011\u0010\u0018\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u00106R\u0011\u0010\u0019\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u00106R\u0011\u0010\u001a\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u00106R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0011\u0010\u001f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u00106R\u0011\u0010 \u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u00106R\u0011\u0010!\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u00106R\u0011\u0010\"\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u00106R\u0011\u0010#\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u00106R\u0011\u0010$\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u00106R\u0011\u0010%\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u00106R\u0011\u0010&\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u00106R\u0011\u0010'\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u00106R\u0011\u0010(\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u00106R\u0011\u0010)\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u00106R\u0011\u0010*\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u00106R\u0011\u0010+\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u00106R\u0011\u0010,\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010NR\u0011\u0010-\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u00106R\u0011\u0010.\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u00106R\u0011\u0010/\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u00106R\u0011\u00100\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u00106R\u0011\u00101\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\ba\u0010L¨\u0006\u0093\u0001"}, d2 = {"Lcom/nic/mparivahan/AddCov/PojoClass/ApplStatusDetails;", "Ljava/io/Serializable;", "Eligiblecovs_EnableMode", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "IDM1", "IDM2", "MobileNO", "PERMANENT_ADD1", "PERMANENT_ADD2", "PERMANENT_ADD3", "PERMANENT_DISTRICTCODE", "PERMANENT_PINCODE", "PERMANENT_SUBDICTCODE", "PERMANENT_State", "PERMANENT_VILLAGE", "PRESENT_ADD1", "PRESENT_ADD2", "PRESENT_ADD3", "PRESENT_DISTRICTCODE", "PRESENT_PINCODE", "PRESENT_SUBDICTCODE", "PRESENT_State", "PRESENT_VILLAGE", "Qualcd_Desc", "StateCd", "age", "", "allowNewAddr", "", "altMobileNumber", "applDate", "applName", "applno", "bloodGroup", "countryOfBirth", "dbLocation", "dob", "emailId", "freshInAddTransaction", "gender", "licence", "placeOfBirth", "porting", "relation", "rtoCd", "selectedCovs", "swdName", "trcode", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getEligiblecovs_EnableMode", "()Ljava/util/ArrayList;", "getIDM1", "()Ljava/lang/String;", "getIDM2", "getMobileNO", "getPERMANENT_ADD1", "getPERMANENT_ADD2", "getPERMANENT_ADD3", "getPERMANENT_DISTRICTCODE", "getPERMANENT_PINCODE", "getPERMANENT_SUBDICTCODE", "getPERMANENT_State", "getPERMANENT_VILLAGE", "getPRESENT_ADD1", "getPRESENT_ADD2", "getPRESENT_ADD3", "getPRESENT_DISTRICTCODE", "getPRESENT_PINCODE", "getPRESENT_SUBDICTCODE", "getPRESENT_State", "getPRESENT_VILLAGE", "getQualcd_Desc", "getStateCd", "getAge", "()I", "getAllowNewAddr", "()Z", "getAltMobileNumber", "getApplDate", "getApplName", "getApplno", "getBloodGroup", "getCountryOfBirth", "getDbLocation", "getDob", "getEmailId", "getFreshInAddTransaction", "getGender", "getLicence", "getPlaceOfBirth", "getPorting", "getRelation", "getRtoCd", "getSelectedCovs", "getSwdName", "getTrcode", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ApplStatusDetails implements Serializable {
    private final ArrayList<String> Eligiblecovs_EnableMode;
    private final String IDM1;
    private final String IDM2;
    private final String MobileNO;
    private final String PERMANENT_ADD1;
    private final String PERMANENT_ADD2;
    private final String PERMANENT_ADD3;
    private final String PERMANENT_DISTRICTCODE;
    private final String PERMANENT_PINCODE;
    private final String PERMANENT_SUBDICTCODE;
    private final String PERMANENT_State;
    private final String PERMANENT_VILLAGE;
    private final String PRESENT_ADD1;
    private final String PRESENT_ADD2;
    private final String PRESENT_ADD3;
    private final String PRESENT_DISTRICTCODE;
    private final String PRESENT_PINCODE;
    private final String PRESENT_SUBDICTCODE;
    private final String PRESENT_State;
    private final String PRESENT_VILLAGE;
    private final String Qualcd_Desc;
    private final String StateCd;
    private final int age;
    private final boolean allowNewAddr;
    private final String altMobileNumber;
    private final String applDate;
    private final String applName;
    private final String applno;
    private final String bloodGroup;
    private final String countryOfBirth;
    private final String dbLocation;
    private final String dob;
    private final String emailId;
    private final String freshInAddTransaction;
    private final String gender;
    private final String licence;
    private final String placeOfBirth;
    private final boolean porting;
    private final String relation;
    private final String rtoCd;
    private final String selectedCovs;
    private final String swdName;
    private final int trcode;

    public ApplStatusDetails(ArrayList<String> Eligiblecovs_EnableMode, String IDM1, String IDM2, String MobileNO, String PERMANENT_ADD1, String PERMANENT_ADD2, String PERMANENT_ADD3, String PERMANENT_DISTRICTCODE, String PERMANENT_PINCODE, String PERMANENT_SUBDICTCODE, String PERMANENT_State, String PERMANENT_VILLAGE, String PRESENT_ADD1, String PRESENT_ADD2, String PRESENT_ADD3, String PRESENT_DISTRICTCODE, String PRESENT_PINCODE, String PRESENT_SUBDICTCODE, String PRESENT_State, String PRESENT_VILLAGE, String Qualcd_Desc, String StateCd, int i, boolean z, String altMobileNumber, String applDate, String applName, String applno, String bloodGroup, String countryOfBirth, String dbLocation, String dob, String emailId, String freshInAddTransaction, String gender, String licence, String placeOfBirth, boolean z2, String relation, String rtoCd, String selectedCovs, String swdName, int i2) {
        Intrinsics.checkNotNullParameter(Eligiblecovs_EnableMode, "Eligiblecovs_EnableMode");
        Intrinsics.checkNotNullParameter(IDM1, "IDM1");
        Intrinsics.checkNotNullParameter(IDM2, "IDM2");
        Intrinsics.checkNotNullParameter(MobileNO, "MobileNO");
        Intrinsics.checkNotNullParameter(PERMANENT_ADD1, "PERMANENT_ADD1");
        Intrinsics.checkNotNullParameter(PERMANENT_ADD2, "PERMANENT_ADD2");
        Intrinsics.checkNotNullParameter(PERMANENT_ADD3, "PERMANENT_ADD3");
        Intrinsics.checkNotNullParameter(PERMANENT_DISTRICTCODE, "PERMANENT_DISTRICTCODE");
        Intrinsics.checkNotNullParameter(PERMANENT_PINCODE, "PERMANENT_PINCODE");
        Intrinsics.checkNotNullParameter(PERMANENT_SUBDICTCODE, "PERMANENT_SUBDICTCODE");
        Intrinsics.checkNotNullParameter(PERMANENT_State, "PERMANENT_State");
        Intrinsics.checkNotNullParameter(PERMANENT_VILLAGE, "PERMANENT_VILLAGE");
        Intrinsics.checkNotNullParameter(PRESENT_ADD1, "PRESENT_ADD1");
        Intrinsics.checkNotNullParameter(PRESENT_ADD2, "PRESENT_ADD2");
        Intrinsics.checkNotNullParameter(PRESENT_ADD3, "PRESENT_ADD3");
        Intrinsics.checkNotNullParameter(PRESENT_DISTRICTCODE, "PRESENT_DISTRICTCODE");
        Intrinsics.checkNotNullParameter(PRESENT_PINCODE, "PRESENT_PINCODE");
        Intrinsics.checkNotNullParameter(PRESENT_SUBDICTCODE, "PRESENT_SUBDICTCODE");
        Intrinsics.checkNotNullParameter(PRESENT_State, "PRESENT_State");
        Intrinsics.checkNotNullParameter(PRESENT_VILLAGE, "PRESENT_VILLAGE");
        Intrinsics.checkNotNullParameter(Qualcd_Desc, "Qualcd_Desc");
        Intrinsics.checkNotNullParameter(StateCd, "StateCd");
        Intrinsics.checkNotNullParameter(altMobileNumber, "altMobileNumber");
        Intrinsics.checkNotNullParameter(applDate, "applDate");
        Intrinsics.checkNotNullParameter(applName, "applName");
        Intrinsics.checkNotNullParameter(applno, "applno");
        Intrinsics.checkNotNullParameter(bloodGroup, "bloodGroup");
        Intrinsics.checkNotNullParameter(countryOfBirth, "countryOfBirth");
        Intrinsics.checkNotNullParameter(dbLocation, "dbLocation");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(emailId, "emailId");
        Intrinsics.checkNotNullParameter(freshInAddTransaction, "freshInAddTransaction");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(licence, "licence");
        Intrinsics.checkNotNullParameter(placeOfBirth, "placeOfBirth");
        Intrinsics.checkNotNullParameter(relation, "relation");
        Intrinsics.checkNotNullParameter(rtoCd, "rtoCd");
        Intrinsics.checkNotNullParameter(selectedCovs, "selectedCovs");
        Intrinsics.checkNotNullParameter(swdName, "swdName");
        this.Eligiblecovs_EnableMode = Eligiblecovs_EnableMode;
        this.IDM1 = IDM1;
        this.IDM2 = IDM2;
        this.MobileNO = MobileNO;
        this.PERMANENT_ADD1 = PERMANENT_ADD1;
        this.PERMANENT_ADD2 = PERMANENT_ADD2;
        this.PERMANENT_ADD3 = PERMANENT_ADD3;
        this.PERMANENT_DISTRICTCODE = PERMANENT_DISTRICTCODE;
        this.PERMANENT_PINCODE = PERMANENT_PINCODE;
        this.PERMANENT_SUBDICTCODE = PERMANENT_SUBDICTCODE;
        this.PERMANENT_State = PERMANENT_State;
        this.PERMANENT_VILLAGE = PERMANENT_VILLAGE;
        this.PRESENT_ADD1 = PRESENT_ADD1;
        this.PRESENT_ADD2 = PRESENT_ADD2;
        this.PRESENT_ADD3 = PRESENT_ADD3;
        this.PRESENT_DISTRICTCODE = PRESENT_DISTRICTCODE;
        this.PRESENT_PINCODE = PRESENT_PINCODE;
        this.PRESENT_SUBDICTCODE = PRESENT_SUBDICTCODE;
        this.PRESENT_State = PRESENT_State;
        this.PRESENT_VILLAGE = PRESENT_VILLAGE;
        this.Qualcd_Desc = Qualcd_Desc;
        this.StateCd = StateCd;
        this.age = i;
        this.allowNewAddr = z;
        this.altMobileNumber = altMobileNumber;
        this.applDate = applDate;
        this.applName = applName;
        this.applno = applno;
        this.bloodGroup = bloodGroup;
        this.countryOfBirth = countryOfBirth;
        this.dbLocation = dbLocation;
        this.dob = dob;
        this.emailId = emailId;
        this.freshInAddTransaction = freshInAddTransaction;
        this.gender = gender;
        this.licence = licence;
        this.placeOfBirth = placeOfBirth;
        this.porting = z2;
        this.relation = relation;
        this.rtoCd = rtoCd;
        this.selectedCovs = selectedCovs;
        this.swdName = swdName;
        this.trcode = i2;
    }

    public final ArrayList<String> component1() {
        return this.Eligiblecovs_EnableMode;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPERMANENT_SUBDICTCODE() {
        return this.PERMANENT_SUBDICTCODE;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPERMANENT_State() {
        return this.PERMANENT_State;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPERMANENT_VILLAGE() {
        return this.PERMANENT_VILLAGE;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getPRESENT_ADD1() {
        return this.PRESENT_ADD1;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getPRESENT_ADD2() {
        return this.PRESENT_ADD2;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getPRESENT_ADD3() {
        return this.PRESENT_ADD3;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getPRESENT_DISTRICTCODE() {
        return this.PRESENT_DISTRICTCODE;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getPRESENT_PINCODE() {
        return this.PRESENT_PINCODE;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getPRESENT_SUBDICTCODE() {
        return this.PRESENT_SUBDICTCODE;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getPRESENT_State() {
        return this.PRESENT_State;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIDM1() {
        return this.IDM1;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getPRESENT_VILLAGE() {
        return this.PRESENT_VILLAGE;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getQualcd_Desc() {
        return this.Qualcd_Desc;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getStateCd() {
        return this.StateCd;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final int getAge() {
        return this.age;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final boolean getAllowNewAddr() {
        return this.allowNewAddr;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getAltMobileNumber() {
        return this.altMobileNumber;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getApplDate() {
        return this.applDate;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getApplName() {
        return this.applName;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getApplno() {
        return this.applno;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getBloodGroup() {
        return this.bloodGroup;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIDM2() {
        return this.IDM2;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getCountryOfBirth() {
        return this.countryOfBirth;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getDbLocation() {
        return this.dbLocation;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getEmailId() {
        return this.emailId;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getFreshInAddTransaction() {
        return this.freshInAddTransaction;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getLicence() {
        return this.licence;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getPlaceOfBirth() {
        return this.placeOfBirth;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final boolean getPorting() {
        return this.porting;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getRelation() {
        return this.relation;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMobileNO() {
        return this.MobileNO;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final String getRtoCd() {
        return this.rtoCd;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final String getSelectedCovs() {
        return this.selectedCovs;
    }

    /* JADX INFO: renamed from: component42, reason: from getter */
    public final String getSwdName() {
        return this.swdName;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final int getTrcode() {
        return this.trcode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPERMANENT_ADD1() {
        return this.PERMANENT_ADD1;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPERMANENT_ADD2() {
        return this.PERMANENT_ADD2;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPERMANENT_ADD3() {
        return this.PERMANENT_ADD3;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPERMANENT_DISTRICTCODE() {
        return this.PERMANENT_DISTRICTCODE;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPERMANENT_PINCODE() {
        return this.PERMANENT_PINCODE;
    }

    public final ApplStatusDetails copy(ArrayList<String> Eligiblecovs_EnableMode, String IDM1, String IDM2, String MobileNO, String PERMANENT_ADD1, String PERMANENT_ADD2, String PERMANENT_ADD3, String PERMANENT_DISTRICTCODE, String PERMANENT_PINCODE, String PERMANENT_SUBDICTCODE, String PERMANENT_State, String PERMANENT_VILLAGE, String PRESENT_ADD1, String PRESENT_ADD2, String PRESENT_ADD3, String PRESENT_DISTRICTCODE, String PRESENT_PINCODE, String PRESENT_SUBDICTCODE, String PRESENT_State, String PRESENT_VILLAGE, String Qualcd_Desc, String StateCd, int age, boolean allowNewAddr, String altMobileNumber, String applDate, String applName, String applno, String bloodGroup, String countryOfBirth, String dbLocation, String dob, String emailId, String freshInAddTransaction, String gender, String licence, String placeOfBirth, boolean porting, String relation, String rtoCd, String selectedCovs, String swdName, int trcode) {
        Intrinsics.checkNotNullParameter(Eligiblecovs_EnableMode, "Eligiblecovs_EnableMode");
        Intrinsics.checkNotNullParameter(IDM1, "IDM1");
        Intrinsics.checkNotNullParameter(IDM2, "IDM2");
        Intrinsics.checkNotNullParameter(MobileNO, "MobileNO");
        Intrinsics.checkNotNullParameter(PERMANENT_ADD1, "PERMANENT_ADD1");
        Intrinsics.checkNotNullParameter(PERMANENT_ADD2, "PERMANENT_ADD2");
        Intrinsics.checkNotNullParameter(PERMANENT_ADD3, "PERMANENT_ADD3");
        Intrinsics.checkNotNullParameter(PERMANENT_DISTRICTCODE, "PERMANENT_DISTRICTCODE");
        Intrinsics.checkNotNullParameter(PERMANENT_PINCODE, "PERMANENT_PINCODE");
        Intrinsics.checkNotNullParameter(PERMANENT_SUBDICTCODE, "PERMANENT_SUBDICTCODE");
        Intrinsics.checkNotNullParameter(PERMANENT_State, "PERMANENT_State");
        Intrinsics.checkNotNullParameter(PERMANENT_VILLAGE, "PERMANENT_VILLAGE");
        Intrinsics.checkNotNullParameter(PRESENT_ADD1, "PRESENT_ADD1");
        Intrinsics.checkNotNullParameter(PRESENT_ADD2, "PRESENT_ADD2");
        Intrinsics.checkNotNullParameter(PRESENT_ADD3, "PRESENT_ADD3");
        Intrinsics.checkNotNullParameter(PRESENT_DISTRICTCODE, "PRESENT_DISTRICTCODE");
        Intrinsics.checkNotNullParameter(PRESENT_PINCODE, "PRESENT_PINCODE");
        Intrinsics.checkNotNullParameter(PRESENT_SUBDICTCODE, "PRESENT_SUBDICTCODE");
        Intrinsics.checkNotNullParameter(PRESENT_State, "PRESENT_State");
        Intrinsics.checkNotNullParameter(PRESENT_VILLAGE, "PRESENT_VILLAGE");
        Intrinsics.checkNotNullParameter(Qualcd_Desc, "Qualcd_Desc");
        Intrinsics.checkNotNullParameter(StateCd, "StateCd");
        Intrinsics.checkNotNullParameter(altMobileNumber, "altMobileNumber");
        Intrinsics.checkNotNullParameter(applDate, "applDate");
        Intrinsics.checkNotNullParameter(applName, "applName");
        Intrinsics.checkNotNullParameter(applno, "applno");
        Intrinsics.checkNotNullParameter(bloodGroup, "bloodGroup");
        Intrinsics.checkNotNullParameter(countryOfBirth, "countryOfBirth");
        Intrinsics.checkNotNullParameter(dbLocation, "dbLocation");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(emailId, "emailId");
        Intrinsics.checkNotNullParameter(freshInAddTransaction, "freshInAddTransaction");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(licence, "licence");
        Intrinsics.checkNotNullParameter(placeOfBirth, "placeOfBirth");
        Intrinsics.checkNotNullParameter(relation, "relation");
        Intrinsics.checkNotNullParameter(rtoCd, "rtoCd");
        Intrinsics.checkNotNullParameter(selectedCovs, "selectedCovs");
        Intrinsics.checkNotNullParameter(swdName, "swdName");
        return new ApplStatusDetails(Eligiblecovs_EnableMode, IDM1, IDM2, MobileNO, PERMANENT_ADD1, PERMANENT_ADD2, PERMANENT_ADD3, PERMANENT_DISTRICTCODE, PERMANENT_PINCODE, PERMANENT_SUBDICTCODE, PERMANENT_State, PERMANENT_VILLAGE, PRESENT_ADD1, PRESENT_ADD2, PRESENT_ADD3, PRESENT_DISTRICTCODE, PRESENT_PINCODE, PRESENT_SUBDICTCODE, PRESENT_State, PRESENT_VILLAGE, Qualcd_Desc, StateCd, age, allowNewAddr, altMobileNumber, applDate, applName, applno, bloodGroup, countryOfBirth, dbLocation, dob, emailId, freshInAddTransaction, gender, licence, placeOfBirth, porting, relation, rtoCd, selectedCovs, swdName, trcode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplStatusDetails)) {
            return false;
        }
        ApplStatusDetails applStatusDetails = (ApplStatusDetails) other;
        return Intrinsics.areEqual(this.Eligiblecovs_EnableMode, applStatusDetails.Eligiblecovs_EnableMode) && Intrinsics.areEqual(this.IDM1, applStatusDetails.IDM1) && Intrinsics.areEqual(this.IDM2, applStatusDetails.IDM2) && Intrinsics.areEqual(this.MobileNO, applStatusDetails.MobileNO) && Intrinsics.areEqual(this.PERMANENT_ADD1, applStatusDetails.PERMANENT_ADD1) && Intrinsics.areEqual(this.PERMANENT_ADD2, applStatusDetails.PERMANENT_ADD2) && Intrinsics.areEqual(this.PERMANENT_ADD3, applStatusDetails.PERMANENT_ADD3) && Intrinsics.areEqual(this.PERMANENT_DISTRICTCODE, applStatusDetails.PERMANENT_DISTRICTCODE) && Intrinsics.areEqual(this.PERMANENT_PINCODE, applStatusDetails.PERMANENT_PINCODE) && Intrinsics.areEqual(this.PERMANENT_SUBDICTCODE, applStatusDetails.PERMANENT_SUBDICTCODE) && Intrinsics.areEqual(this.PERMANENT_State, applStatusDetails.PERMANENT_State) && Intrinsics.areEqual(this.PERMANENT_VILLAGE, applStatusDetails.PERMANENT_VILLAGE) && Intrinsics.areEqual(this.PRESENT_ADD1, applStatusDetails.PRESENT_ADD1) && Intrinsics.areEqual(this.PRESENT_ADD2, applStatusDetails.PRESENT_ADD2) && Intrinsics.areEqual(this.PRESENT_ADD3, applStatusDetails.PRESENT_ADD3) && Intrinsics.areEqual(this.PRESENT_DISTRICTCODE, applStatusDetails.PRESENT_DISTRICTCODE) && Intrinsics.areEqual(this.PRESENT_PINCODE, applStatusDetails.PRESENT_PINCODE) && Intrinsics.areEqual(this.PRESENT_SUBDICTCODE, applStatusDetails.PRESENT_SUBDICTCODE) && Intrinsics.areEqual(this.PRESENT_State, applStatusDetails.PRESENT_State) && Intrinsics.areEqual(this.PRESENT_VILLAGE, applStatusDetails.PRESENT_VILLAGE) && Intrinsics.areEqual(this.Qualcd_Desc, applStatusDetails.Qualcd_Desc) && Intrinsics.areEqual(this.StateCd, applStatusDetails.StateCd) && this.age == applStatusDetails.age && this.allowNewAddr == applStatusDetails.allowNewAddr && Intrinsics.areEqual(this.altMobileNumber, applStatusDetails.altMobileNumber) && Intrinsics.areEqual(this.applDate, applStatusDetails.applDate) && Intrinsics.areEqual(this.applName, applStatusDetails.applName) && Intrinsics.areEqual(this.applno, applStatusDetails.applno) && Intrinsics.areEqual(this.bloodGroup, applStatusDetails.bloodGroup) && Intrinsics.areEqual(this.countryOfBirth, applStatusDetails.countryOfBirth) && Intrinsics.areEqual(this.dbLocation, applStatusDetails.dbLocation) && Intrinsics.areEqual(this.dob, applStatusDetails.dob) && Intrinsics.areEqual(this.emailId, applStatusDetails.emailId) && Intrinsics.areEqual(this.freshInAddTransaction, applStatusDetails.freshInAddTransaction) && Intrinsics.areEqual(this.gender, applStatusDetails.gender) && Intrinsics.areEqual(this.licence, applStatusDetails.licence) && Intrinsics.areEqual(this.placeOfBirth, applStatusDetails.placeOfBirth) && this.porting == applStatusDetails.porting && Intrinsics.areEqual(this.relation, applStatusDetails.relation) && Intrinsics.areEqual(this.rtoCd, applStatusDetails.rtoCd) && Intrinsics.areEqual(this.selectedCovs, applStatusDetails.selectedCovs) && Intrinsics.areEqual(this.swdName, applStatusDetails.swdName) && this.trcode == applStatusDetails.trcode;
    }

    public final int getAge() {
        return this.age;
    }

    public final boolean getAllowNewAddr() {
        return this.allowNewAddr;
    }

    public final String getAltMobileNumber() {
        return this.altMobileNumber;
    }

    public final String getApplDate() {
        return this.applDate;
    }

    public final String getApplName() {
        return this.applName;
    }

    public final String getApplno() {
        return this.applno;
    }

    public final String getBloodGroup() {
        return this.bloodGroup;
    }

    public final String getCountryOfBirth() {
        return this.countryOfBirth;
    }

    public final String getDbLocation() {
        return this.dbLocation;
    }

    public final String getDob() {
        return this.dob;
    }

    public final ArrayList<String> getEligiblecovs_EnableMode() {
        return this.Eligiblecovs_EnableMode;
    }

    public final String getEmailId() {
        return this.emailId;
    }

    public final String getFreshInAddTransaction() {
        return this.freshInAddTransaction;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getIDM1() {
        return this.IDM1;
    }

    public final String getIDM2() {
        return this.IDM2;
    }

    public final String getLicence() {
        return this.licence;
    }

    public final String getMobileNO() {
        return this.MobileNO;
    }

    public final String getPERMANENT_ADD1() {
        return this.PERMANENT_ADD1;
    }

    public final String getPERMANENT_ADD2() {
        return this.PERMANENT_ADD2;
    }

    public final String getPERMANENT_ADD3() {
        return this.PERMANENT_ADD3;
    }

    public final String getPERMANENT_DISTRICTCODE() {
        return this.PERMANENT_DISTRICTCODE;
    }

    public final String getPERMANENT_PINCODE() {
        return this.PERMANENT_PINCODE;
    }

    public final String getPERMANENT_SUBDICTCODE() {
        return this.PERMANENT_SUBDICTCODE;
    }

    public final String getPERMANENT_State() {
        return this.PERMANENT_State;
    }

    public final String getPERMANENT_VILLAGE() {
        return this.PERMANENT_VILLAGE;
    }

    public final String getPRESENT_ADD1() {
        return this.PRESENT_ADD1;
    }

    public final String getPRESENT_ADD2() {
        return this.PRESENT_ADD2;
    }

    public final String getPRESENT_ADD3() {
        return this.PRESENT_ADD3;
    }

    public final String getPRESENT_DISTRICTCODE() {
        return this.PRESENT_DISTRICTCODE;
    }

    public final String getPRESENT_PINCODE() {
        return this.PRESENT_PINCODE;
    }

    public final String getPRESENT_SUBDICTCODE() {
        return this.PRESENT_SUBDICTCODE;
    }

    public final String getPRESENT_State() {
        return this.PRESENT_State;
    }

    public final String getPRESENT_VILLAGE() {
        return this.PRESENT_VILLAGE;
    }

    public final String getPlaceOfBirth() {
        return this.placeOfBirth;
    }

    public final boolean getPorting() {
        return this.porting;
    }

    public final String getQualcd_Desc() {
        return this.Qualcd_Desc;
    }

    public final String getRelation() {
        return this.relation;
    }

    public final String getRtoCd() {
        return this.rtoCd;
    }

    public final String getSelectedCovs() {
        return this.selectedCovs;
    }

    public final String getStateCd() {
        return this.StateCd;
    }

    public final String getSwdName() {
        return this.swdName;
    }

    public final int getTrcode() {
        return this.trcode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v45, types: [int] */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r1v84 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((this.Eligiblecovs_EnableMode.hashCode() * 31) + this.IDM1.hashCode()) * 31) + this.IDM2.hashCode()) * 31) + this.MobileNO.hashCode()) * 31) + this.PERMANENT_ADD1.hashCode()) * 31) + this.PERMANENT_ADD2.hashCode()) * 31) + this.PERMANENT_ADD3.hashCode()) * 31) + this.PERMANENT_DISTRICTCODE.hashCode()) * 31) + this.PERMANENT_PINCODE.hashCode()) * 31) + this.PERMANENT_SUBDICTCODE.hashCode()) * 31) + this.PERMANENT_State.hashCode()) * 31) + this.PERMANENT_VILLAGE.hashCode()) * 31) + this.PRESENT_ADD1.hashCode()) * 31) + this.PRESENT_ADD2.hashCode()) * 31) + this.PRESENT_ADD3.hashCode()) * 31) + this.PRESENT_DISTRICTCODE.hashCode()) * 31) + this.PRESENT_PINCODE.hashCode()) * 31) + this.PRESENT_SUBDICTCODE.hashCode()) * 31) + this.PRESENT_State.hashCode()) * 31) + this.PRESENT_VILLAGE.hashCode()) * 31) + this.Qualcd_Desc.hashCode()) * 31) + this.StateCd.hashCode()) * 31) + Integer.hashCode(this.age)) * 31;
        boolean z = this.allowNewAddr;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((((((((((((((((((((((((((iHashCode + r1) * 31) + this.altMobileNumber.hashCode()) * 31) + this.applDate.hashCode()) * 31) + this.applName.hashCode()) * 31) + this.applno.hashCode()) * 31) + this.bloodGroup.hashCode()) * 31) + this.countryOfBirth.hashCode()) * 31) + this.dbLocation.hashCode()) * 31) + this.dob.hashCode()) * 31) + this.emailId.hashCode()) * 31) + this.freshInAddTransaction.hashCode()) * 31) + this.gender.hashCode()) * 31) + this.licence.hashCode()) * 31) + this.placeOfBirth.hashCode()) * 31;
        boolean z2 = this.porting;
        return ((((((((((iHashCode2 + (z2 ? 1 : z2)) * 31) + this.relation.hashCode()) * 31) + this.rtoCd.hashCode()) * 31) + this.selectedCovs.hashCode()) * 31) + this.swdName.hashCode()) * 31) + Integer.hashCode(this.trcode);
    }

    public String toString() {
        return "ApplStatusDetails(Eligiblecovs_EnableMode=" + this.Eligiblecovs_EnableMode + ", IDM1=" + this.IDM1 + ", IDM2=" + this.IDM2 + ", MobileNO=" + this.MobileNO + ", PERMANENT_ADD1=" + this.PERMANENT_ADD1 + ", PERMANENT_ADD2=" + this.PERMANENT_ADD2 + ", PERMANENT_ADD3=" + this.PERMANENT_ADD3 + ", PERMANENT_DISTRICTCODE=" + this.PERMANENT_DISTRICTCODE + ", PERMANENT_PINCODE=" + this.PERMANENT_PINCODE + ", PERMANENT_SUBDICTCODE=" + this.PERMANENT_SUBDICTCODE + ", PERMANENT_State=" + this.PERMANENT_State + ", PERMANENT_VILLAGE=" + this.PERMANENT_VILLAGE + ", PRESENT_ADD1=" + this.PRESENT_ADD1 + ", PRESENT_ADD2=" + this.PRESENT_ADD2 + ", PRESENT_ADD3=" + this.PRESENT_ADD3 + ", PRESENT_DISTRICTCODE=" + this.PRESENT_DISTRICTCODE + ", PRESENT_PINCODE=" + this.PRESENT_PINCODE + ", PRESENT_SUBDICTCODE=" + this.PRESENT_SUBDICTCODE + ", PRESENT_State=" + this.PRESENT_State + ", PRESENT_VILLAGE=" + this.PRESENT_VILLAGE + ", Qualcd_Desc=" + this.Qualcd_Desc + ", StateCd=" + this.StateCd + ", age=" + this.age + ", allowNewAddr=" + this.allowNewAddr + ", altMobileNumber=" + this.altMobileNumber + ", applDate=" + this.applDate + ", applName=" + this.applName + ", applno=" + this.applno + ", bloodGroup=" + this.bloodGroup + ", countryOfBirth=" + this.countryOfBirth + ", dbLocation=" + this.dbLocation + ", dob=" + this.dob + ", emailId=" + this.emailId + ", freshInAddTransaction=" + this.freshInAddTransaction + ", gender=" + this.gender + ", licence=" + this.licence + ", placeOfBirth=" + this.placeOfBirth + ", porting=" + this.porting + ", relation=" + this.relation + ", rtoCd=" + this.rtoCd + ", selectedCovs=" + this.selectedCovs + ", swdName=" + this.swdName + ", trcode=" + this.trcode + ')';
    }
}
