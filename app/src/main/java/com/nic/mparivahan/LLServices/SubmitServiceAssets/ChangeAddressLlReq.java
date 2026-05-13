package com.nic.mparivahan.LLServices.SubmitServiceAssets;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bb\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00030\"j\b\u0012\u0004\u0012\u00020\u0003`#¢\u0006\u0002\u0010$J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\t\u0010k\u001a\u00020\u0003HÆ\u0003J\t\u0010l\u001a\u00020\u0003HÆ\u0003J\t\u0010m\u001a\u00020\u0003HÆ\u0003J\t\u0010n\u001a\u00020\u0003HÆ\u0003J\t\u0010o\u001a\u00020\u0003HÆ\u0003J\t\u0010p\u001a\u00020\u0003HÆ\u0003J\t\u0010q\u001a\u00020\u0003HÆ\u0003J\t\u0010r\u001a\u00020\u0003HÆ\u0003J\t\u0010s\u001a\u00020\u0003HÆ\u0003J\t\u0010t\u001a\u00020\u0003HÆ\u0003J\t\u0010u\u001a\u00020\u0003HÆ\u0003J\t\u0010v\u001a\u00020\u0003HÆ\u0003J\t\u0010w\u001a\u00020\u0003HÆ\u0003J\t\u0010x\u001a\u00020\u0003HÆ\u0003J\t\u0010y\u001a\u00020\u0003HÆ\u0003J\t\u0010z\u001a\u00020\u0003HÆ\u0003J\t\u0010{\u001a\u00020\u0003HÆ\u0003J\t\u0010|\u001a\u00020\u0003HÆ\u0003J\u0019\u0010}\u001a\u0012\u0012\u0004\u0012\u00020\u00030\"j\b\u0012\u0004\u0012\u00020\u0003`#HÆ\u0003J\t\u0010~\u001a\u00020\u0003HÆ\u0003J\t\u0010\u007f\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0003HÆ\u0003JÐ\u0002\u0010\u0084\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\u0018\b\u0002\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00030\"j\b\u0012\u0004\u0012\u00020\u0003`#HÆ\u0001J\u0016\u0010\u0085\u0001\u001a\u00030\u0086\u00012\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010\u0088\u0001\u001a\u00030\u0089\u0001HÖ\u0001J\n\u0010\u008a\u0001\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010&\"\u0004\b0\u0010(R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010&\"\u0004\b2\u0010(R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010&\"\u0004\b6\u0010(R\u001a\u0010\u001f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010&\"\u0004\b8\u0010(R\u001a\u0010\u0019\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010&\"\u0004\b:\u0010(R\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010&\"\u0004\b<\u0010(R\u001a\u0010\u001c\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010&\"\u0004\b>\u0010(R\u001a\u0010\u001b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010&\"\u0004\b@\u0010(R\u001a\u0010\u001e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010&\"\u0004\bB\u0010(R\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010&\"\u0004\bD\u0010(R\u001a\u0010\u001d\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010&\"\u0004\bF\u0010(R\u001a\u0010\u0018\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010&\"\u0004\bH\u0010(R\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010&\"\u0004\bJ\u0010(R\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010&\"\u0004\bL\u0010(R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010&\"\u0004\bN\u0010(R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010&\"\u0004\bP\u0010(R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010&\"\u0004\bR\u0010(R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010&\"\u0004\bT\u0010(R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010&\"\u0004\bV\u0010(R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010&\"\u0004\bX\u0010(R\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010&\"\u0004\bZ\u0010(R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010&\"\u0004\b\\\u0010(R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010&\"\u0004\b^\u0010(R!\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00030\"j\b\u0012\u0004\u0012\u00020\u0003`#¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010&\"\u0004\bb\u0010(R\u001a\u0010 \u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010&\"\u0004\bd\u0010(¨\u0006\u008b\u0001"}, d2 = {"Lcom/nic/mparivahan/LLServices/SubmitServiceAssets/ChangeAddressLlReq;", "", "agentId", "", "agentPwd", "agentIpAddress", "agentServiceName", "learningLicence", "dateOfBirth", "stCd", "llservicesRTO", "addressType", "presState", "presDistrict", "presSubDistrict", "presCity", "presVillageOrTown", "presLocation", "presHouseNo", "presStreet", "presPinCode", "phoneNumber", "permState", "permDistrict", "permSubDistrict", "permCity", "permVillageOrTown", "permLocation", "permHouseNo", "permStreet", "permPinCode", "mobileNumber", "transactionType", "selectedServices", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getAddressType", "()Ljava/lang/String;", "setAddressType", "(Ljava/lang/String;)V", "getAgentId", "setAgentId", "getAgentIpAddress", "setAgentIpAddress", "getAgentPwd", "setAgentPwd", "getAgentServiceName", "setAgentServiceName", "getDateOfBirth", "setDateOfBirth", "getLearningLicence", "setLearningLicence", "getLlservicesRTO", "setLlservicesRTO", "getMobileNumber", "setMobileNumber", "getPermCity", "setPermCity", "getPermDistrict", "setPermDistrict", "getPermHouseNo", "setPermHouseNo", "getPermLocation", "setPermLocation", "getPermPinCode", "setPermPinCode", "getPermState", "setPermState", "getPermStreet", "setPermStreet", "getPermSubDistrict", "setPermSubDistrict", "getPermVillageOrTown", "setPermVillageOrTown", "getPhoneNumber", "setPhoneNumber", "getPresCity", "setPresCity", "getPresDistrict", "setPresDistrict", "getPresHouseNo", "setPresHouseNo", "getPresLocation", "setPresLocation", "getPresPinCode", "setPresPinCode", "getPresState", "setPresState", "getPresStreet", "setPresStreet", "getPresSubDistrict", "setPresSubDistrict", "getPresVillageOrTown", "setPresVillageOrTown", "getSelectedServices", "()Ljava/util/ArrayList;", "getStCd", "setStCd", "getTransactionType", "setTransactionType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ChangeAddressLlReq {
    private String addressType;
    private String agentId;
    private String agentIpAddress;
    private String agentPwd;
    private String agentServiceName;
    private String dateOfBirth;
    private String learningLicence;
    private String llservicesRTO;
    private String mobileNumber;
    private String permCity;
    private String permDistrict;
    private String permHouseNo;
    private String permLocation;
    private String permPinCode;
    private String permState;
    private String permStreet;
    private String permSubDistrict;
    private String permVillageOrTown;
    private String phoneNumber;
    private String presCity;
    private String presDistrict;
    private String presHouseNo;
    private String presLocation;
    private String presPinCode;
    private String presState;
    private String presStreet;
    private String presSubDistrict;
    private String presVillageOrTown;
    private final ArrayList<String> selectedServices;
    private String stCd;
    private String transactionType;

    public ChangeAddressLlReq(String agentId, String agentPwd, String agentIpAddress, String agentServiceName, String learningLicence, String dateOfBirth, String stCd, String llservicesRTO, String addressType, String presState, String presDistrict, String presSubDistrict, String presCity, String presVillageOrTown, String presLocation, String presHouseNo, String presStreet, String presPinCode, String phoneNumber, String permState, String permDistrict, String permSubDistrict, String permCity, String permVillageOrTown, String permLocation, String permHouseNo, String permStreet, String permPinCode, String mobileNumber, String transactionType, ArrayList<String> selectedServices) {
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(agentPwd, "agentPwd");
        Intrinsics.checkNotNullParameter(agentIpAddress, "agentIpAddress");
        Intrinsics.checkNotNullParameter(agentServiceName, "agentServiceName");
        Intrinsics.checkNotNullParameter(learningLicence, "learningLicence");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(stCd, "stCd");
        Intrinsics.checkNotNullParameter(llservicesRTO, "llservicesRTO");
        Intrinsics.checkNotNullParameter(addressType, "addressType");
        Intrinsics.checkNotNullParameter(presState, "presState");
        Intrinsics.checkNotNullParameter(presDistrict, "presDistrict");
        Intrinsics.checkNotNullParameter(presSubDistrict, "presSubDistrict");
        Intrinsics.checkNotNullParameter(presCity, "presCity");
        Intrinsics.checkNotNullParameter(presVillageOrTown, "presVillageOrTown");
        Intrinsics.checkNotNullParameter(presLocation, "presLocation");
        Intrinsics.checkNotNullParameter(presHouseNo, "presHouseNo");
        Intrinsics.checkNotNullParameter(presStreet, "presStreet");
        Intrinsics.checkNotNullParameter(presPinCode, "presPinCode");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(permState, "permState");
        Intrinsics.checkNotNullParameter(permDistrict, "permDistrict");
        Intrinsics.checkNotNullParameter(permSubDistrict, "permSubDistrict");
        Intrinsics.checkNotNullParameter(permCity, "permCity");
        Intrinsics.checkNotNullParameter(permVillageOrTown, "permVillageOrTown");
        Intrinsics.checkNotNullParameter(permLocation, "permLocation");
        Intrinsics.checkNotNullParameter(permHouseNo, "permHouseNo");
        Intrinsics.checkNotNullParameter(permStreet, "permStreet");
        Intrinsics.checkNotNullParameter(permPinCode, "permPinCode");
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(selectedServices, "selectedServices");
        this.agentId = agentId;
        this.agentPwd = agentPwd;
        this.agentIpAddress = agentIpAddress;
        this.agentServiceName = agentServiceName;
        this.learningLicence = learningLicence;
        this.dateOfBirth = dateOfBirth;
        this.stCd = stCd;
        this.llservicesRTO = llservicesRTO;
        this.addressType = addressType;
        this.presState = presState;
        this.presDistrict = presDistrict;
        this.presSubDistrict = presSubDistrict;
        this.presCity = presCity;
        this.presVillageOrTown = presVillageOrTown;
        this.presLocation = presLocation;
        this.presHouseNo = presHouseNo;
        this.presStreet = presStreet;
        this.presPinCode = presPinCode;
        this.phoneNumber = phoneNumber;
        this.permState = permState;
        this.permDistrict = permDistrict;
        this.permSubDistrict = permSubDistrict;
        this.permCity = permCity;
        this.permVillageOrTown = permVillageOrTown;
        this.permLocation = permLocation;
        this.permHouseNo = permHouseNo;
        this.permStreet = permStreet;
        this.permPinCode = permPinCode;
        this.mobileNumber = mobileNumber;
        this.transactionType = transactionType;
        this.selectedServices = selectedServices;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAgentId() {
        return this.agentId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPresState() {
        return this.presState;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPresDistrict() {
        return this.presDistrict;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPresSubDistrict() {
        return this.presSubDistrict;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getPresCity() {
        return this.presCity;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getPresVillageOrTown() {
        return this.presVillageOrTown;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getPresLocation() {
        return this.presLocation;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getPresHouseNo() {
        return this.presHouseNo;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getPresStreet() {
        return this.presStreet;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getPresPinCode() {
        return this.presPinCode;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAgentPwd() {
        return this.agentPwd;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getPermState() {
        return this.permState;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getPermDistrict() {
        return this.permDistrict;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getPermSubDistrict() {
        return this.permSubDistrict;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getPermCity() {
        return this.permCity;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getPermVillageOrTown() {
        return this.permVillageOrTown;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getPermLocation() {
        return this.permLocation;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getPermHouseNo() {
        return this.permHouseNo;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getPermStreet() {
        return this.permStreet;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getPermPinCode() {
        return this.permPinCode;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAgentIpAddress() {
        return this.agentIpAddress;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getTransactionType() {
        return this.transactionType;
    }

    public final ArrayList<String> component31() {
        return this.selectedServices;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAgentServiceName() {
        return this.agentServiceName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLearningLicence() {
        return this.learningLicence;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStCd() {
        return this.stCd;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLlservicesRTO() {
        return this.llservicesRTO;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAddressType() {
        return this.addressType;
    }

    public final ChangeAddressLlReq copy(String agentId, String agentPwd, String agentIpAddress, String agentServiceName, String learningLicence, String dateOfBirth, String stCd, String llservicesRTO, String addressType, String presState, String presDistrict, String presSubDistrict, String presCity, String presVillageOrTown, String presLocation, String presHouseNo, String presStreet, String presPinCode, String phoneNumber, String permState, String permDistrict, String permSubDistrict, String permCity, String permVillageOrTown, String permLocation, String permHouseNo, String permStreet, String permPinCode, String mobileNumber, String transactionType, ArrayList<String> selectedServices) {
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(agentPwd, "agentPwd");
        Intrinsics.checkNotNullParameter(agentIpAddress, "agentIpAddress");
        Intrinsics.checkNotNullParameter(agentServiceName, "agentServiceName");
        Intrinsics.checkNotNullParameter(learningLicence, "learningLicence");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(stCd, "stCd");
        Intrinsics.checkNotNullParameter(llservicesRTO, "llservicesRTO");
        Intrinsics.checkNotNullParameter(addressType, "addressType");
        Intrinsics.checkNotNullParameter(presState, "presState");
        Intrinsics.checkNotNullParameter(presDistrict, "presDistrict");
        Intrinsics.checkNotNullParameter(presSubDistrict, "presSubDistrict");
        Intrinsics.checkNotNullParameter(presCity, "presCity");
        Intrinsics.checkNotNullParameter(presVillageOrTown, "presVillageOrTown");
        Intrinsics.checkNotNullParameter(presLocation, "presLocation");
        Intrinsics.checkNotNullParameter(presHouseNo, "presHouseNo");
        Intrinsics.checkNotNullParameter(presStreet, "presStreet");
        Intrinsics.checkNotNullParameter(presPinCode, "presPinCode");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(permState, "permState");
        Intrinsics.checkNotNullParameter(permDistrict, "permDistrict");
        Intrinsics.checkNotNullParameter(permSubDistrict, "permSubDistrict");
        Intrinsics.checkNotNullParameter(permCity, "permCity");
        Intrinsics.checkNotNullParameter(permVillageOrTown, "permVillageOrTown");
        Intrinsics.checkNotNullParameter(permLocation, "permLocation");
        Intrinsics.checkNotNullParameter(permHouseNo, "permHouseNo");
        Intrinsics.checkNotNullParameter(permStreet, "permStreet");
        Intrinsics.checkNotNullParameter(permPinCode, "permPinCode");
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(selectedServices, "selectedServices");
        return new ChangeAddressLlReq(agentId, agentPwd, agentIpAddress, agentServiceName, learningLicence, dateOfBirth, stCd, llservicesRTO, addressType, presState, presDistrict, presSubDistrict, presCity, presVillageOrTown, presLocation, presHouseNo, presStreet, presPinCode, phoneNumber, permState, permDistrict, permSubDistrict, permCity, permVillageOrTown, permLocation, permHouseNo, permStreet, permPinCode, mobileNumber, transactionType, selectedServices);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeAddressLlReq)) {
            return false;
        }
        ChangeAddressLlReq changeAddressLlReq = (ChangeAddressLlReq) other;
        return Intrinsics.areEqual(this.agentId, changeAddressLlReq.agentId) && Intrinsics.areEqual(this.agentPwd, changeAddressLlReq.agentPwd) && Intrinsics.areEqual(this.agentIpAddress, changeAddressLlReq.agentIpAddress) && Intrinsics.areEqual(this.agentServiceName, changeAddressLlReq.agentServiceName) && Intrinsics.areEqual(this.learningLicence, changeAddressLlReq.learningLicence) && Intrinsics.areEqual(this.dateOfBirth, changeAddressLlReq.dateOfBirth) && Intrinsics.areEqual(this.stCd, changeAddressLlReq.stCd) && Intrinsics.areEqual(this.llservicesRTO, changeAddressLlReq.llservicesRTO) && Intrinsics.areEqual(this.addressType, changeAddressLlReq.addressType) && Intrinsics.areEqual(this.presState, changeAddressLlReq.presState) && Intrinsics.areEqual(this.presDistrict, changeAddressLlReq.presDistrict) && Intrinsics.areEqual(this.presSubDistrict, changeAddressLlReq.presSubDistrict) && Intrinsics.areEqual(this.presCity, changeAddressLlReq.presCity) && Intrinsics.areEqual(this.presVillageOrTown, changeAddressLlReq.presVillageOrTown) && Intrinsics.areEqual(this.presLocation, changeAddressLlReq.presLocation) && Intrinsics.areEqual(this.presHouseNo, changeAddressLlReq.presHouseNo) && Intrinsics.areEqual(this.presStreet, changeAddressLlReq.presStreet) && Intrinsics.areEqual(this.presPinCode, changeAddressLlReq.presPinCode) && Intrinsics.areEqual(this.phoneNumber, changeAddressLlReq.phoneNumber) && Intrinsics.areEqual(this.permState, changeAddressLlReq.permState) && Intrinsics.areEqual(this.permDistrict, changeAddressLlReq.permDistrict) && Intrinsics.areEqual(this.permSubDistrict, changeAddressLlReq.permSubDistrict) && Intrinsics.areEqual(this.permCity, changeAddressLlReq.permCity) && Intrinsics.areEqual(this.permVillageOrTown, changeAddressLlReq.permVillageOrTown) && Intrinsics.areEqual(this.permLocation, changeAddressLlReq.permLocation) && Intrinsics.areEqual(this.permHouseNo, changeAddressLlReq.permHouseNo) && Intrinsics.areEqual(this.permStreet, changeAddressLlReq.permStreet) && Intrinsics.areEqual(this.permPinCode, changeAddressLlReq.permPinCode) && Intrinsics.areEqual(this.mobileNumber, changeAddressLlReq.mobileNumber) && Intrinsics.areEqual(this.transactionType, changeAddressLlReq.transactionType) && Intrinsics.areEqual(this.selectedServices, changeAddressLlReq.selectedServices);
    }

    public final String getAddressType() {
        return this.addressType;
    }

    public final String getAgentId() {
        return this.agentId;
    }

    public final String getAgentIpAddress() {
        return this.agentIpAddress;
    }

    public final String getAgentPwd() {
        return this.agentPwd;
    }

    public final String getAgentServiceName() {
        return this.agentServiceName;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final String getLearningLicence() {
        return this.learningLicence;
    }

    public final String getLlservicesRTO() {
        return this.llservicesRTO;
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final String getPermCity() {
        return this.permCity;
    }

    public final String getPermDistrict() {
        return this.permDistrict;
    }

    public final String getPermHouseNo() {
        return this.permHouseNo;
    }

    public final String getPermLocation() {
        return this.permLocation;
    }

    public final String getPermPinCode() {
        return this.permPinCode;
    }

    public final String getPermState() {
        return this.permState;
    }

    public final String getPermStreet() {
        return this.permStreet;
    }

    public final String getPermSubDistrict() {
        return this.permSubDistrict;
    }

    public final String getPermVillageOrTown() {
        return this.permVillageOrTown;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getPresCity() {
        return this.presCity;
    }

    public final String getPresDistrict() {
        return this.presDistrict;
    }

    public final String getPresHouseNo() {
        return this.presHouseNo;
    }

    public final String getPresLocation() {
        return this.presLocation;
    }

    public final String getPresPinCode() {
        return this.presPinCode;
    }

    public final String getPresState() {
        return this.presState;
    }

    public final String getPresStreet() {
        return this.presStreet;
    }

    public final String getPresSubDistrict() {
        return this.presSubDistrict;
    }

    public final String getPresVillageOrTown() {
        return this.presVillageOrTown;
    }

    public final ArrayList<String> getSelectedServices() {
        return this.selectedServices;
    }

    public final String getStCd() {
        return this.stCd;
    }

    public final String getTransactionType() {
        return this.transactionType;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.agentId.hashCode() * 31) + this.agentPwd.hashCode()) * 31) + this.agentIpAddress.hashCode()) * 31) + this.agentServiceName.hashCode()) * 31) + this.learningLicence.hashCode()) * 31) + this.dateOfBirth.hashCode()) * 31) + this.stCd.hashCode()) * 31) + this.llservicesRTO.hashCode()) * 31) + this.addressType.hashCode()) * 31) + this.presState.hashCode()) * 31) + this.presDistrict.hashCode()) * 31) + this.presSubDistrict.hashCode()) * 31) + this.presCity.hashCode()) * 31) + this.presVillageOrTown.hashCode()) * 31) + this.presLocation.hashCode()) * 31) + this.presHouseNo.hashCode()) * 31) + this.presStreet.hashCode()) * 31) + this.presPinCode.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.permState.hashCode()) * 31) + this.permDistrict.hashCode()) * 31) + this.permSubDistrict.hashCode()) * 31) + this.permCity.hashCode()) * 31) + this.permVillageOrTown.hashCode()) * 31) + this.permLocation.hashCode()) * 31) + this.permHouseNo.hashCode()) * 31) + this.permStreet.hashCode()) * 31) + this.permPinCode.hashCode()) * 31) + this.mobileNumber.hashCode()) * 31) + this.transactionType.hashCode()) * 31) + this.selectedServices.hashCode();
    }

    public final void setAddressType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.addressType = str;
    }

    public final void setAgentId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.agentId = str;
    }

    public final void setAgentIpAddress(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.agentIpAddress = str;
    }

    public final void setAgentPwd(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.agentPwd = str;
    }

    public final void setAgentServiceName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.agentServiceName = str;
    }

    public final void setDateOfBirth(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dateOfBirth = str;
    }

    public final void setLearningLicence(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.learningLicence = str;
    }

    public final void setLlservicesRTO(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.llservicesRTO = str;
    }

    public final void setMobileNumber(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobileNumber = str;
    }

    public final void setPermCity(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.permCity = str;
    }

    public final void setPermDistrict(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.permDistrict = str;
    }

    public final void setPermHouseNo(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.permHouseNo = str;
    }

    public final void setPermLocation(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.permLocation = str;
    }

    public final void setPermPinCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.permPinCode = str;
    }

    public final void setPermState(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.permState = str;
    }

    public final void setPermStreet(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.permStreet = str;
    }

    public final void setPermSubDistrict(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.permSubDistrict = str;
    }

    public final void setPermVillageOrTown(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.permVillageOrTown = str;
    }

    public final void setPhoneNumber(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.phoneNumber = str;
    }

    public final void setPresCity(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presCity = str;
    }

    public final void setPresDistrict(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presDistrict = str;
    }

    public final void setPresHouseNo(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presHouseNo = str;
    }

    public final void setPresLocation(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presLocation = str;
    }

    public final void setPresPinCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presPinCode = str;
    }

    public final void setPresState(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presState = str;
    }

    public final void setPresStreet(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presStreet = str;
    }

    public final void setPresSubDistrict(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presSubDistrict = str;
    }

    public final void setPresVillageOrTown(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.presVillageOrTown = str;
    }

    public final void setStCd(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stCd = str;
    }

    public final void setTransactionType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.transactionType = str;
    }

    public String toString() {
        return "ChangeAddressLlReq(agentId=" + this.agentId + ", agentPwd=" + this.agentPwd + ", agentIpAddress=" + this.agentIpAddress + ", agentServiceName=" + this.agentServiceName + ", learningLicence=" + this.learningLicence + ", dateOfBirth=" + this.dateOfBirth + ", stCd=" + this.stCd + ", llservicesRTO=" + this.llservicesRTO + ", addressType=" + this.addressType + ", presState=" + this.presState + ", presDistrict=" + this.presDistrict + ", presSubDistrict=" + this.presSubDistrict + ", presCity=" + this.presCity + ", presVillageOrTown=" + this.presVillageOrTown + ", presLocation=" + this.presLocation + ", presHouseNo=" + this.presHouseNo + ", presStreet=" + this.presStreet + ", presPinCode=" + this.presPinCode + ", phoneNumber=" + this.phoneNumber + ", permState=" + this.permState + ", permDistrict=" + this.permDistrict + ", permSubDistrict=" + this.permSubDistrict + ", permCity=" + this.permCity + ", permVillageOrTown=" + this.permVillageOrTown + ", permLocation=" + this.permLocation + ", permHouseNo=" + this.permHouseNo + ", permStreet=" + this.permStreet + ", permPinCode=" + this.permPinCode + ", mobileNumber=" + this.mobileNumber + ", transactionType=" + this.transactionType + ", selectedServices=" + this.selectedServices + ')';
    }
}
