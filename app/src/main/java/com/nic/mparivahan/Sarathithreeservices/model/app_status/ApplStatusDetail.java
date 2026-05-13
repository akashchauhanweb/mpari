package com.nic.mparivahan.Sarathithreeservices.model.app_status;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000e0\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0003j\b\u0012\u0004\u0012\u00020\u0017`\u0005¢\u0006\u0002\u0010\u0018J\u0019\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\u0019\u00102\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0003j\b\u0012\u0004\u0012\u00020\u0017`\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\u0015\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000e0\u000eHÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003JÕ\u0001\u0010;\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000e0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\u0018\b\u0002\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0003j\b\u0012\u0004\u0012\u00020\u0017`\u0005HÆ\u0001J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020@HÖ\u0001J\t\u0010A\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0014\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0015\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0011\u0010\u0013\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001aR!\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0003j\b\u0012\u0004\u0012\u00020\u0017`\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000e0\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001a¨\u0006B"}, d2 = {"Lcom/nic/mparivahan/Sarathithreeservices/model/app_status/ApplStatusDetail;", "", "applFlowStatusList", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/Sarathithreeservices/model/app_status/ApplFlowStatus;", "Lkotlin/collections/ArrayList;", "applName", "", "applno", "applpendStatus", "dob", "gender", "isApsubStgsInorder", "reqObjlst", "", "rtoCd", "rtoName", "swdName", "eKYCOpted", "eKYCId", "appPhotoBase64", "appSignatureBase64", "pendingAt", "Lcom/nic/mparivahan/Sarathithreeservices/model/app_status/PendingAt;", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getAppPhotoBase64", "()Ljava/lang/String;", "getAppSignatureBase64", "getApplFlowStatusList", "()Ljava/util/ArrayList;", "getApplName", "getApplno", "getApplpendStatus", "getDob", "getEKYCId", "getEKYCOpted", "getGender", "getPendingAt", "getReqObjlst", "()Ljava/util/List;", "getRtoCd", "getRtoName", "getSwdName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ApplStatusDetail {
    private final String appPhotoBase64;
    private final String appSignatureBase64;
    private final ArrayList<ApplFlowStatus> applFlowStatusList;
    private final String applName;
    private final String applno;
    private final String applpendStatus;
    private final String dob;
    private final String eKYCId;
    private final String eKYCOpted;
    private final String gender;
    private final String isApsubStgsInorder;
    private final ArrayList<PendingAt> pendingAt;
    private final List<List<String>> reqObjlst;
    private final String rtoCd;
    private final String rtoName;
    private final String swdName;

    /* JADX WARN: Multi-variable type inference failed */
    public ApplStatusDetail(ArrayList<ApplFlowStatus> applFlowStatusList, String applName, String applno, String applpendStatus, String dob, String gender, String isApsubStgsInorder, List<? extends List<String>> reqObjlst, String rtoCd, String rtoName, String swdName, String eKYCOpted, String eKYCId, String appPhotoBase64, String appSignatureBase64, ArrayList<PendingAt> pendingAt) {
        Intrinsics.checkNotNullParameter(applFlowStatusList, "applFlowStatusList");
        Intrinsics.checkNotNullParameter(applName, "applName");
        Intrinsics.checkNotNullParameter(applno, "applno");
        Intrinsics.checkNotNullParameter(applpendStatus, "applpendStatus");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(isApsubStgsInorder, "isApsubStgsInorder");
        Intrinsics.checkNotNullParameter(reqObjlst, "reqObjlst");
        Intrinsics.checkNotNullParameter(rtoCd, "rtoCd");
        Intrinsics.checkNotNullParameter(rtoName, "rtoName");
        Intrinsics.checkNotNullParameter(swdName, "swdName");
        Intrinsics.checkNotNullParameter(eKYCOpted, "eKYCOpted");
        Intrinsics.checkNotNullParameter(eKYCId, "eKYCId");
        Intrinsics.checkNotNullParameter(appPhotoBase64, "appPhotoBase64");
        Intrinsics.checkNotNullParameter(appSignatureBase64, "appSignatureBase64");
        Intrinsics.checkNotNullParameter(pendingAt, "pendingAt");
        this.applFlowStatusList = applFlowStatusList;
        this.applName = applName;
        this.applno = applno;
        this.applpendStatus = applpendStatus;
        this.dob = dob;
        this.gender = gender;
        this.isApsubStgsInorder = isApsubStgsInorder;
        this.reqObjlst = reqObjlst;
        this.rtoCd = rtoCd;
        this.rtoName = rtoName;
        this.swdName = swdName;
        this.eKYCOpted = eKYCOpted;
        this.eKYCId = eKYCId;
        this.appPhotoBase64 = appPhotoBase64;
        this.appSignatureBase64 = appSignatureBase64;
        this.pendingAt = pendingAt;
    }

    public final ArrayList<ApplFlowStatus> component1() {
        return this.applFlowStatusList;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getRtoName() {
        return this.rtoName;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSwdName() {
        return this.swdName;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getEKYCOpted() {
        return this.eKYCOpted;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getEKYCId() {
        return this.eKYCId;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getAppPhotoBase64() {
        return this.appPhotoBase64;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getAppSignatureBase64() {
        return this.appSignatureBase64;
    }

    public final ArrayList<PendingAt> component16() {
        return this.pendingAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getApplName() {
        return this.applName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getApplno() {
        return this.applno;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getApplpendStatus() {
        return this.applpendStatus;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIsApsubStgsInorder() {
        return this.isApsubStgsInorder;
    }

    public final List<List<String>> component8() {
        return this.reqObjlst;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRtoCd() {
        return this.rtoCd;
    }

    public final ApplStatusDetail copy(ArrayList<ApplFlowStatus> applFlowStatusList, String applName, String applno, String applpendStatus, String dob, String gender, String isApsubStgsInorder, List<? extends List<String>> reqObjlst, String rtoCd, String rtoName, String swdName, String eKYCOpted, String eKYCId, String appPhotoBase64, String appSignatureBase64, ArrayList<PendingAt> pendingAt) {
        Intrinsics.checkNotNullParameter(applFlowStatusList, "applFlowStatusList");
        Intrinsics.checkNotNullParameter(applName, "applName");
        Intrinsics.checkNotNullParameter(applno, "applno");
        Intrinsics.checkNotNullParameter(applpendStatus, "applpendStatus");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(isApsubStgsInorder, "isApsubStgsInorder");
        Intrinsics.checkNotNullParameter(reqObjlst, "reqObjlst");
        Intrinsics.checkNotNullParameter(rtoCd, "rtoCd");
        Intrinsics.checkNotNullParameter(rtoName, "rtoName");
        Intrinsics.checkNotNullParameter(swdName, "swdName");
        Intrinsics.checkNotNullParameter(eKYCOpted, "eKYCOpted");
        Intrinsics.checkNotNullParameter(eKYCId, "eKYCId");
        Intrinsics.checkNotNullParameter(appPhotoBase64, "appPhotoBase64");
        Intrinsics.checkNotNullParameter(appSignatureBase64, "appSignatureBase64");
        Intrinsics.checkNotNullParameter(pendingAt, "pendingAt");
        return new ApplStatusDetail(applFlowStatusList, applName, applno, applpendStatus, dob, gender, isApsubStgsInorder, reqObjlst, rtoCd, rtoName, swdName, eKYCOpted, eKYCId, appPhotoBase64, appSignatureBase64, pendingAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplStatusDetail)) {
            return false;
        }
        ApplStatusDetail applStatusDetail = (ApplStatusDetail) other;
        return Intrinsics.areEqual(this.applFlowStatusList, applStatusDetail.applFlowStatusList) && Intrinsics.areEqual(this.applName, applStatusDetail.applName) && Intrinsics.areEqual(this.applno, applStatusDetail.applno) && Intrinsics.areEqual(this.applpendStatus, applStatusDetail.applpendStatus) && Intrinsics.areEqual(this.dob, applStatusDetail.dob) && Intrinsics.areEqual(this.gender, applStatusDetail.gender) && Intrinsics.areEqual(this.isApsubStgsInorder, applStatusDetail.isApsubStgsInorder) && Intrinsics.areEqual(this.reqObjlst, applStatusDetail.reqObjlst) && Intrinsics.areEqual(this.rtoCd, applStatusDetail.rtoCd) && Intrinsics.areEqual(this.rtoName, applStatusDetail.rtoName) && Intrinsics.areEqual(this.swdName, applStatusDetail.swdName) && Intrinsics.areEqual(this.eKYCOpted, applStatusDetail.eKYCOpted) && Intrinsics.areEqual(this.eKYCId, applStatusDetail.eKYCId) && Intrinsics.areEqual(this.appPhotoBase64, applStatusDetail.appPhotoBase64) && Intrinsics.areEqual(this.appSignatureBase64, applStatusDetail.appSignatureBase64) && Intrinsics.areEqual(this.pendingAt, applStatusDetail.pendingAt);
    }

    public final String getAppPhotoBase64() {
        return this.appPhotoBase64;
    }

    public final String getAppSignatureBase64() {
        return this.appSignatureBase64;
    }

    public final ArrayList<ApplFlowStatus> getApplFlowStatusList() {
        return this.applFlowStatusList;
    }

    public final String getApplName() {
        return this.applName;
    }

    public final String getApplno() {
        return this.applno;
    }

    public final String getApplpendStatus() {
        return this.applpendStatus;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getEKYCId() {
        return this.eKYCId;
    }

    public final String getEKYCOpted() {
        return this.eKYCOpted;
    }

    public final String getGender() {
        return this.gender;
    }

    public final ArrayList<PendingAt> getPendingAt() {
        return this.pendingAt;
    }

    public final List<List<String>> getReqObjlst() {
        return this.reqObjlst;
    }

    public final String getRtoCd() {
        return this.rtoCd;
    }

    public final String getRtoName() {
        return this.rtoName;
    }

    public final String getSwdName() {
        return this.swdName;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((this.applFlowStatusList.hashCode() * 31) + this.applName.hashCode()) * 31) + this.applno.hashCode()) * 31) + this.applpendStatus.hashCode()) * 31) + this.dob.hashCode()) * 31) + this.gender.hashCode()) * 31) + this.isApsubStgsInorder.hashCode()) * 31) + this.reqObjlst.hashCode()) * 31) + this.rtoCd.hashCode()) * 31) + this.rtoName.hashCode()) * 31) + this.swdName.hashCode()) * 31) + this.eKYCOpted.hashCode()) * 31) + this.eKYCId.hashCode()) * 31) + this.appPhotoBase64.hashCode()) * 31) + this.appSignatureBase64.hashCode()) * 31) + this.pendingAt.hashCode();
    }

    public final String isApsubStgsInorder() {
        return this.isApsubStgsInorder;
    }

    public String toString() {
        return "ApplStatusDetail(applFlowStatusList=" + this.applFlowStatusList + ", applName=" + this.applName + ", applno=" + this.applno + ", applpendStatus=" + this.applpendStatus + ", dob=" + this.dob + ", gender=" + this.gender + ", isApsubStgsInorder=" + this.isApsubStgsInorder + ", reqObjlst=" + this.reqObjlst + ", rtoCd=" + this.rtoCd + ", rtoName=" + this.rtoName + ", swdName=" + this.swdName + ", eKYCOpted=" + this.eKYCOpted + ", eKYCId=" + this.eKYCId + ", appPhotoBase64=" + this.appPhotoBase64 + ", appSignatureBase64=" + this.appSignatureBase64 + ", pendingAt=" + this.pendingAt + ')';
    }
}
