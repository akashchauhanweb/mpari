package com.nic.mparivahan.LLServices.SubmitServiceAssets;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000ej\b\u0012\u0004\u0012\u00020\u0003`\u000f¢\u0006\u0002\u0010\u0010J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u0019\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000ej\b\u0012\u0004\u0012\u00020\u0003`\u000fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u008d\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000ej\b\u0012\u0004\u0012\u00020\u0003`\u000fHÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R!\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000ej\b\u0012\u0004\u0012\u00020\u0003`\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0012¨\u00069"}, d2 = {"Lcom/nic/mparivahan/LLServices/SubmitServiceAssets/DuplicateLlRequest;", "", "agentId", "", "agentPwd", "agentIpAddress", "agentServiceName", "learningLicence", "dateOfBirth", "stCd", "llservicesRTO", "transactionType", "reasonForDuplicate", "selectedServices", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getAgentId", "()Ljava/lang/String;", "setAgentId", "(Ljava/lang/String;)V", "getAgentIpAddress", "setAgentIpAddress", "getAgentPwd", "setAgentPwd", "getAgentServiceName", "setAgentServiceName", "getDateOfBirth", "setDateOfBirth", "getLearningLicence", "setLearningLicence", "getLlservicesRTO", "setLlservicesRTO", "getReasonForDuplicate", "setReasonForDuplicate", "getSelectedServices", "()Ljava/util/ArrayList;", "getStCd", "getTransactionType", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DuplicateLlRequest {
    private String agentId;
    private String agentIpAddress;
    private String agentPwd;
    private String agentServiceName;
    private String dateOfBirth;
    private String learningLicence;
    private String llservicesRTO;
    private String reasonForDuplicate;
    private final ArrayList<String> selectedServices;
    private final String stCd;
    private final String transactionType;

    public DuplicateLlRequest(String str, String str2, String str3, String agentServiceName, String learningLicence, String dateOfBirth, String stCd, String llservicesRTO, String transactionType, String reasonForDuplicate, ArrayList<String> selectedServices) {
        Intrinsics.checkNotNullParameter(agentServiceName, "agentServiceName");
        Intrinsics.checkNotNullParameter(learningLicence, "learningLicence");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(stCd, "stCd");
        Intrinsics.checkNotNullParameter(llservicesRTO, "llservicesRTO");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(reasonForDuplicate, "reasonForDuplicate");
        Intrinsics.checkNotNullParameter(selectedServices, "selectedServices");
        this.agentId = str;
        this.agentPwd = str2;
        this.agentIpAddress = str3;
        this.agentServiceName = agentServiceName;
        this.learningLicence = learningLicence;
        this.dateOfBirth = dateOfBirth;
        this.stCd = stCd;
        this.llservicesRTO = llservicesRTO;
        this.transactionType = transactionType;
        this.reasonForDuplicate = reasonForDuplicate;
        this.selectedServices = selectedServices;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAgentId() {
        return this.agentId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getReasonForDuplicate() {
        return this.reasonForDuplicate;
    }

    public final ArrayList<String> component11() {
        return this.selectedServices;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAgentPwd() {
        return this.agentPwd;
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
    public final String getTransactionType() {
        return this.transactionType;
    }

    public final DuplicateLlRequest copy(String agentId, String agentPwd, String agentIpAddress, String agentServiceName, String learningLicence, String dateOfBirth, String stCd, String llservicesRTO, String transactionType, String reasonForDuplicate, ArrayList<String> selectedServices) {
        Intrinsics.checkNotNullParameter(agentServiceName, "agentServiceName");
        Intrinsics.checkNotNullParameter(learningLicence, "learningLicence");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(stCd, "stCd");
        Intrinsics.checkNotNullParameter(llservicesRTO, "llservicesRTO");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(reasonForDuplicate, "reasonForDuplicate");
        Intrinsics.checkNotNullParameter(selectedServices, "selectedServices");
        return new DuplicateLlRequest(agentId, agentPwd, agentIpAddress, agentServiceName, learningLicence, dateOfBirth, stCd, llservicesRTO, transactionType, reasonForDuplicate, selectedServices);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DuplicateLlRequest)) {
            return false;
        }
        DuplicateLlRequest duplicateLlRequest = (DuplicateLlRequest) other;
        return Intrinsics.areEqual(this.agentId, duplicateLlRequest.agentId) && Intrinsics.areEqual(this.agentPwd, duplicateLlRequest.agentPwd) && Intrinsics.areEqual(this.agentIpAddress, duplicateLlRequest.agentIpAddress) && Intrinsics.areEqual(this.agentServiceName, duplicateLlRequest.agentServiceName) && Intrinsics.areEqual(this.learningLicence, duplicateLlRequest.learningLicence) && Intrinsics.areEqual(this.dateOfBirth, duplicateLlRequest.dateOfBirth) && Intrinsics.areEqual(this.stCd, duplicateLlRequest.stCd) && Intrinsics.areEqual(this.llservicesRTO, duplicateLlRequest.llservicesRTO) && Intrinsics.areEqual(this.transactionType, duplicateLlRequest.transactionType) && Intrinsics.areEqual(this.reasonForDuplicate, duplicateLlRequest.reasonForDuplicate) && Intrinsics.areEqual(this.selectedServices, duplicateLlRequest.selectedServices);
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

    public final String getReasonForDuplicate() {
        return this.reasonForDuplicate;
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
        String str = this.agentId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.agentPwd;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.agentIpAddress;
        return ((((((((((((((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.agentServiceName.hashCode()) * 31) + this.learningLicence.hashCode()) * 31) + this.dateOfBirth.hashCode()) * 31) + this.stCd.hashCode()) * 31) + this.llservicesRTO.hashCode()) * 31) + this.transactionType.hashCode()) * 31) + this.reasonForDuplicate.hashCode()) * 31) + this.selectedServices.hashCode();
    }

    public final void setAgentId(String str) {
        this.agentId = str;
    }

    public final void setAgentIpAddress(String str) {
        this.agentIpAddress = str;
    }

    public final void setAgentPwd(String str) {
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

    public final void setReasonForDuplicate(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reasonForDuplicate = str;
    }

    public String toString() {
        return "DuplicateLlRequest(agentId=" + this.agentId + ", agentPwd=" + this.agentPwd + ", agentIpAddress=" + this.agentIpAddress + ", agentServiceName=" + this.agentServiceName + ", learningLicence=" + this.learningLicence + ", dateOfBirth=" + this.dateOfBirth + ", stCd=" + this.stCd + ", llservicesRTO=" + this.llservicesRTO + ", transactionType=" + this.transactionType + ", reasonForDuplicate=" + this.reasonForDuplicate + ", selectedServices=" + this.selectedServices + ')';
    }
}
