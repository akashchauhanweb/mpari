package com.nic.mparivahan.LLServices.SubmitServiceAssets;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bD\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B½\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0018j\b\u0012\u0004\u0012\u00020\u0003`\u0019¢\u0006\u0002\u0010\u001aJ\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\u0019\u0010T\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0018j\b\u0012\u0004\u0012\u00020\u0003`\u0019HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003Jë\u0001\u0010\\\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\u0018\b\u0002\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0018j\b\u0012\u0004\u0012\u00020\u0003`\u0019HÆ\u0001J\u0013\u0010]\u001a\u00020^2\b\u0010_\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010`\u001a\u00020aHÖ\u0001J\t\u0010b\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001c\"\u0004\b,\u0010\u001eR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u0010\u001eR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001c\"\u0004\b4\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001c\"\u0004\b6\u0010\u001eR\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001c\"\u0004\b8\u0010\u001eR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001c\"\u0004\b:\u0010\u001eR!\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0018j\b\u0012\u0004\u0012\u00020\u0003`\u0019¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001c\"\u0004\b>\u0010\u001eR\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001c\"\u0004\b@\u0010\u001eR\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001c\"\u0004\bB\u0010\u001eR\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001c\"\u0004\bD\u0010\u001eR\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u001c\"\u0004\bF\u0010\u001e¨\u0006c"}, d2 = {"Lcom/nic/mparivahan/LLServices/SubmitServiceAssets/ChangeOfNameReq;", "", "agentId", "", "agentPwd", "agentIpAddress", "agentServiceName", "learningLicence", "dateOfBirth", "stCd", "llservicesRTO", "aadharNumber", "fullNameEntry", "fname", "mname", "lname", "relationTypeEntry", "swdfName", "swdmName", "swdlName", "reason", "effectDate", "transactionType", "selectedServices", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getAadharNumber", "()Ljava/lang/String;", "setAadharNumber", "(Ljava/lang/String;)V", "getAgentId", "setAgentId", "getAgentIpAddress", "setAgentIpAddress", "getAgentPwd", "setAgentPwd", "getAgentServiceName", "setAgentServiceName", "getDateOfBirth", "setDateOfBirth", "getEffectDate", "setEffectDate", "getFname", "setFname", "getFullNameEntry", "setFullNameEntry", "getLearningLicence", "setLearningLicence", "getLlservicesRTO", "setLlservicesRTO", "getLname", "setLname", "getMname", "setMname", "getReason", "setReason", "getRelationTypeEntry", "setRelationTypeEntry", "getSelectedServices", "()Ljava/util/ArrayList;", "getStCd", "setStCd", "getSwdfName", "setSwdfName", "getSwdlName", "setSwdlName", "getSwdmName", "setSwdmName", "getTransactionType", "setTransactionType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ChangeOfNameReq {
    private String aadharNumber;
    private String agentId;
    private String agentIpAddress;
    private String agentPwd;
    private String agentServiceName;
    private String dateOfBirth;
    private String effectDate;
    private String fname;
    private String fullNameEntry;
    private String learningLicence;
    private String llservicesRTO;
    private String lname;
    private String mname;
    private String reason;
    private String relationTypeEntry;
    private final ArrayList<String> selectedServices;
    private String stCd;
    private String swdfName;
    private String swdlName;
    private String swdmName;
    private String transactionType;

    public ChangeOfNameReq(String agentId, String agentPwd, String agentIpAddress, String agentServiceName, String learningLicence, String dateOfBirth, String stCd, String llservicesRTO, String aadharNumber, String fullNameEntry, String fname, String mname, String lname, String relationTypeEntry, String swdfName, String swdmName, String swdlName, String reason, String effectDate, String transactionType, ArrayList<String> selectedServices) {
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(agentPwd, "agentPwd");
        Intrinsics.checkNotNullParameter(agentIpAddress, "agentIpAddress");
        Intrinsics.checkNotNullParameter(agentServiceName, "agentServiceName");
        Intrinsics.checkNotNullParameter(learningLicence, "learningLicence");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(stCd, "stCd");
        Intrinsics.checkNotNullParameter(llservicesRTO, "llservicesRTO");
        Intrinsics.checkNotNullParameter(aadharNumber, "aadharNumber");
        Intrinsics.checkNotNullParameter(fullNameEntry, "fullNameEntry");
        Intrinsics.checkNotNullParameter(fname, "fname");
        Intrinsics.checkNotNullParameter(mname, "mname");
        Intrinsics.checkNotNullParameter(lname, "lname");
        Intrinsics.checkNotNullParameter(relationTypeEntry, "relationTypeEntry");
        Intrinsics.checkNotNullParameter(swdfName, "swdfName");
        Intrinsics.checkNotNullParameter(swdmName, "swdmName");
        Intrinsics.checkNotNullParameter(swdlName, "swdlName");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(effectDate, "effectDate");
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
        this.aadharNumber = aadharNumber;
        this.fullNameEntry = fullNameEntry;
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.relationTypeEntry = relationTypeEntry;
        this.swdfName = swdfName;
        this.swdmName = swdmName;
        this.swdlName = swdlName;
        this.reason = reason;
        this.effectDate = effectDate;
        this.transactionType = transactionType;
        this.selectedServices = selectedServices;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAgentId() {
        return this.agentId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getFullNameEntry() {
        return this.fullNameEntry;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getFname() {
        return this.fname;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getMname() {
        return this.mname;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getLname() {
        return this.lname;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getRelationTypeEntry() {
        return this.relationTypeEntry;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getSwdfName() {
        return this.swdfName;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getSwdmName() {
        return this.swdmName;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getSwdlName() {
        return this.swdlName;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getEffectDate() {
        return this.effectDate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAgentPwd() {
        return this.agentPwd;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getTransactionType() {
        return this.transactionType;
    }

    public final ArrayList<String> component21() {
        return this.selectedServices;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAgentIpAddress() {
        return this.agentIpAddress;
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
    public final String getAadharNumber() {
        return this.aadharNumber;
    }

    public final ChangeOfNameReq copy(String agentId, String agentPwd, String agentIpAddress, String agentServiceName, String learningLicence, String dateOfBirth, String stCd, String llservicesRTO, String aadharNumber, String fullNameEntry, String fname, String mname, String lname, String relationTypeEntry, String swdfName, String swdmName, String swdlName, String reason, String effectDate, String transactionType, ArrayList<String> selectedServices) {
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(agentPwd, "agentPwd");
        Intrinsics.checkNotNullParameter(agentIpAddress, "agentIpAddress");
        Intrinsics.checkNotNullParameter(agentServiceName, "agentServiceName");
        Intrinsics.checkNotNullParameter(learningLicence, "learningLicence");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(stCd, "stCd");
        Intrinsics.checkNotNullParameter(llservicesRTO, "llservicesRTO");
        Intrinsics.checkNotNullParameter(aadharNumber, "aadharNumber");
        Intrinsics.checkNotNullParameter(fullNameEntry, "fullNameEntry");
        Intrinsics.checkNotNullParameter(fname, "fname");
        Intrinsics.checkNotNullParameter(mname, "mname");
        Intrinsics.checkNotNullParameter(lname, "lname");
        Intrinsics.checkNotNullParameter(relationTypeEntry, "relationTypeEntry");
        Intrinsics.checkNotNullParameter(swdfName, "swdfName");
        Intrinsics.checkNotNullParameter(swdmName, "swdmName");
        Intrinsics.checkNotNullParameter(swdlName, "swdlName");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(effectDate, "effectDate");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(selectedServices, "selectedServices");
        return new ChangeOfNameReq(agentId, agentPwd, agentIpAddress, agentServiceName, learningLicence, dateOfBirth, stCd, llservicesRTO, aadharNumber, fullNameEntry, fname, mname, lname, relationTypeEntry, swdfName, swdmName, swdlName, reason, effectDate, transactionType, selectedServices);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeOfNameReq)) {
            return false;
        }
        ChangeOfNameReq changeOfNameReq = (ChangeOfNameReq) other;
        return Intrinsics.areEqual(this.agentId, changeOfNameReq.agentId) && Intrinsics.areEqual(this.agentPwd, changeOfNameReq.agentPwd) && Intrinsics.areEqual(this.agentIpAddress, changeOfNameReq.agentIpAddress) && Intrinsics.areEqual(this.agentServiceName, changeOfNameReq.agentServiceName) && Intrinsics.areEqual(this.learningLicence, changeOfNameReq.learningLicence) && Intrinsics.areEqual(this.dateOfBirth, changeOfNameReq.dateOfBirth) && Intrinsics.areEqual(this.stCd, changeOfNameReq.stCd) && Intrinsics.areEqual(this.llservicesRTO, changeOfNameReq.llservicesRTO) && Intrinsics.areEqual(this.aadharNumber, changeOfNameReq.aadharNumber) && Intrinsics.areEqual(this.fullNameEntry, changeOfNameReq.fullNameEntry) && Intrinsics.areEqual(this.fname, changeOfNameReq.fname) && Intrinsics.areEqual(this.mname, changeOfNameReq.mname) && Intrinsics.areEqual(this.lname, changeOfNameReq.lname) && Intrinsics.areEqual(this.relationTypeEntry, changeOfNameReq.relationTypeEntry) && Intrinsics.areEqual(this.swdfName, changeOfNameReq.swdfName) && Intrinsics.areEqual(this.swdmName, changeOfNameReq.swdmName) && Intrinsics.areEqual(this.swdlName, changeOfNameReq.swdlName) && Intrinsics.areEqual(this.reason, changeOfNameReq.reason) && Intrinsics.areEqual(this.effectDate, changeOfNameReq.effectDate) && Intrinsics.areEqual(this.transactionType, changeOfNameReq.transactionType) && Intrinsics.areEqual(this.selectedServices, changeOfNameReq.selectedServices);
    }

    public final String getAadharNumber() {
        return this.aadharNumber;
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

    public final String getEffectDate() {
        return this.effectDate;
    }

    public final String getFname() {
        return this.fname;
    }

    public final String getFullNameEntry() {
        return this.fullNameEntry;
    }

    public final String getLearningLicence() {
        return this.learningLicence;
    }

    public final String getLlservicesRTO() {
        return this.llservicesRTO;
    }

    public final String getLname() {
        return this.lname;
    }

    public final String getMname() {
        return this.mname;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getRelationTypeEntry() {
        return this.relationTypeEntry;
    }

    public final ArrayList<String> getSelectedServices() {
        return this.selectedServices;
    }

    public final String getStCd() {
        return this.stCd;
    }

    public final String getSwdfName() {
        return this.swdfName;
    }

    public final String getSwdlName() {
        return this.swdlName;
    }

    public final String getSwdmName() {
        return this.swdmName;
    }

    public final String getTransactionType() {
        return this.transactionType;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((this.agentId.hashCode() * 31) + this.agentPwd.hashCode()) * 31) + this.agentIpAddress.hashCode()) * 31) + this.agentServiceName.hashCode()) * 31) + this.learningLicence.hashCode()) * 31) + this.dateOfBirth.hashCode()) * 31) + this.stCd.hashCode()) * 31) + this.llservicesRTO.hashCode()) * 31) + this.aadharNumber.hashCode()) * 31) + this.fullNameEntry.hashCode()) * 31) + this.fname.hashCode()) * 31) + this.mname.hashCode()) * 31) + this.lname.hashCode()) * 31) + this.relationTypeEntry.hashCode()) * 31) + this.swdfName.hashCode()) * 31) + this.swdmName.hashCode()) * 31) + this.swdlName.hashCode()) * 31) + this.reason.hashCode()) * 31) + this.effectDate.hashCode()) * 31) + this.transactionType.hashCode()) * 31) + this.selectedServices.hashCode();
    }

    public final void setAadharNumber(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadharNumber = str;
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

    public final void setEffectDate(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.effectDate = str;
    }

    public final void setFname(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fname = str;
    }

    public final void setFullNameEntry(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fullNameEntry = str;
    }

    public final void setLearningLicence(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.learningLicence = str;
    }

    public final void setLlservicesRTO(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.llservicesRTO = str;
    }

    public final void setLname(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lname = str;
    }

    public final void setMname(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mname = str;
    }

    public final void setReason(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reason = str;
    }

    public final void setRelationTypeEntry(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.relationTypeEntry = str;
    }

    public final void setStCd(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stCd = str;
    }

    public final void setSwdfName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.swdfName = str;
    }

    public final void setSwdlName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.swdlName = str;
    }

    public final void setSwdmName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.swdmName = str;
    }

    public final void setTransactionType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.transactionType = str;
    }

    public String toString() {
        return "ChangeOfNameReq(agentId=" + this.agentId + ", agentPwd=" + this.agentPwd + ", agentIpAddress=" + this.agentIpAddress + ", agentServiceName=" + this.agentServiceName + ", learningLicence=" + this.learningLicence + ", dateOfBirth=" + this.dateOfBirth + ", stCd=" + this.stCd + ", llservicesRTO=" + this.llservicesRTO + ", aadharNumber=" + this.aadharNumber + ", fullNameEntry=" + this.fullNameEntry + ", fname=" + this.fname + ", mname=" + this.mname + ", lname=" + this.lname + ", relationTypeEntry=" + this.relationTypeEntry + ", swdfName=" + this.swdfName + ", swdmName=" + this.swdmName + ", swdlName=" + this.swdlName + ", reason=" + this.reason + ", effectDate=" + this.effectDate + ", transactionType=" + this.transactionType + ", selectedServices=" + this.selectedServices + ')';
    }
}
