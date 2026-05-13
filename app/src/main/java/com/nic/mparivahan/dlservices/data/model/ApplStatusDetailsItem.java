package com.nic.mparivahan.dlservices.data.model;

import androidx.annotation.Keep;
import com.zepto.xy5;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00050\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001a\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00050\u0005HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010*\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rHÆ\u0003J¤\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00050\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R \u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0015R$\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00050\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015¨\u00064"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/model/ApplStatusDetailsItem;", "Ljava/io/Serializable;", "rtoName", "", "reqObjlst", "", "rtoCd", "gender", "dob", "applName", "applno", "swdName", "applFlowStatusList", "", "Lcom/nic/mparivahan/dlservices/data/model/ApplFlowStatusListItem;", "applpendStatus", "isApsubStgsInorder", "(Ljava/lang/String;[[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getApplFlowStatusList", "()Ljava/util/List;", "getApplName", "()Ljava/lang/String;", "getApplno", "getApplpendStatus", "getDob", "getGender", "getReqObjlst", "()[[Ljava/lang/String;", "[[Ljava/lang/String;", "getRtoCd", "getRtoName", "getSwdName", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;[[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/nic/mparivahan/dlservices/data/model/ApplStatusDetailsItem;", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ApplStatusDetailsItem implements Serializable {

    @xy5("applFlowStatusList")
    private final List<ApplFlowStatusListItem> applFlowStatusList;

    @xy5("applName")
    private final String applName;

    @xy5("applno")
    private final String applno;

    @xy5("applpendStatus")
    private final String applpendStatus;

    @xy5("dob")
    private final String dob;

    @xy5("gender")
    private final String gender;

    @xy5("isApsubStgsInorder")
    private final String isApsubStgsInorder;

    @xy5("reqObjlst")
    private final String[][] reqObjlst;

    @xy5("rtoCd")
    private final String rtoCd;

    @xy5("rtoName")
    private final String rtoName;

    @xy5("swdName")
    private final String swdName;

    public ApplStatusDetailsItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRtoName() {
        return this.rtoName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getApplpendStatus() {
        return this.applpendStatus;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getIsApsubStgsInorder() {
        return this.isApsubStgsInorder;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String[][] getReqObjlst() {
        return this.reqObjlst;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRtoCd() {
        return this.rtoCd;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getApplName() {
        return this.applName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getApplno() {
        return this.applno;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSwdName() {
        return this.swdName;
    }

    public final List<ApplFlowStatusListItem> component9() {
        return this.applFlowStatusList;
    }

    public final ApplStatusDetailsItem copy(String rtoName, String[][] reqObjlst, String rtoCd, String gender, String dob, String applName, String applno, String swdName, List<ApplFlowStatusListItem> applFlowStatusList, String applpendStatus, String isApsubStgsInorder) {
        Intrinsics.checkNotNullParameter(reqObjlst, "reqObjlst");
        return new ApplStatusDetailsItem(rtoName, reqObjlst, rtoCd, gender, dob, applName, applno, swdName, applFlowStatusList, applpendStatus, isApsubStgsInorder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplStatusDetailsItem)) {
            return false;
        }
        ApplStatusDetailsItem applStatusDetailsItem = (ApplStatusDetailsItem) other;
        return Intrinsics.areEqual(this.rtoName, applStatusDetailsItem.rtoName) && Intrinsics.areEqual(this.reqObjlst, applStatusDetailsItem.reqObjlst) && Intrinsics.areEqual(this.rtoCd, applStatusDetailsItem.rtoCd) && Intrinsics.areEqual(this.gender, applStatusDetailsItem.gender) && Intrinsics.areEqual(this.dob, applStatusDetailsItem.dob) && Intrinsics.areEqual(this.applName, applStatusDetailsItem.applName) && Intrinsics.areEqual(this.applno, applStatusDetailsItem.applno) && Intrinsics.areEqual(this.swdName, applStatusDetailsItem.swdName) && Intrinsics.areEqual(this.applFlowStatusList, applStatusDetailsItem.applFlowStatusList) && Intrinsics.areEqual(this.applpendStatus, applStatusDetailsItem.applpendStatus) && Intrinsics.areEqual(this.isApsubStgsInorder, applStatusDetailsItem.isApsubStgsInorder);
    }

    public final List<ApplFlowStatusListItem> getApplFlowStatusList() {
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

    public final String getGender() {
        return this.gender;
    }

    public final String[][] getReqObjlst() {
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
        String str = this.rtoName;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.reqObjlst)) * 31;
        String str2 = this.rtoCd;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.gender;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dob;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.applName;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.applno;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.swdName;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<ApplFlowStatusListItem> list = this.applFlowStatusList;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str8 = this.applpendStatus;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.isApsubStgsInorder;
        return iHashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String isApsubStgsInorder() {
        return this.isApsubStgsInorder;
    }

    public String toString() {
        return "ApplStatusDetailsItem(rtoName=" + this.rtoName + ", reqObjlst=" + Arrays.toString(this.reqObjlst) + ", rtoCd=" + this.rtoCd + ", gender=" + this.gender + ", dob=" + this.dob + ", applName=" + this.applName + ", applno=" + this.applno + ", swdName=" + this.swdName + ", applFlowStatusList=" + this.applFlowStatusList + ", applpendStatus=" + this.applpendStatus + ", isApsubStgsInorder=" + this.isApsubStgsInorder + ')';
    }

    public ApplStatusDetailsItem(String str, String[][] reqObjlst, String str2, String str3, String str4, String str5, String str6, String str7, List<ApplFlowStatusListItem> list, String str8, String str9) {
        Intrinsics.checkNotNullParameter(reqObjlst, "reqObjlst");
        this.rtoName = str;
        this.reqObjlst = reqObjlst;
        this.rtoCd = str2;
        this.gender = str3;
        this.dob = str4;
        this.applName = str5;
        this.applno = str6;
        this.swdName = str7;
        this.applFlowStatusList = list;
        this.applpendStatus = str8;
        this.isApsubStgsInorder = str9;
    }

    public /* synthetic */ ApplStatusDetailsItem(String str, String[][] strArr, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new String[0][] : strArr, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : list, (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : str8, (i & 1024) == 0 ? str9 : null);
    }
}
