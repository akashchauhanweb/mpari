package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003Jo\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006'"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/VahanApplDisposeSuccessModel;", "", "state_cd", "", "off_cd", "regn_no", "mobile_no", "chasi_no", "eng_no", "state_name", "owner_name", "developerMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChasi_no", "()Ljava/lang/String;", "getDeveloperMessage", "getEng_no", "getMobile_no", "getOff_cd", "getOwner_name", "getRegn_no", "getState_cd", "getState_name", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VahanApplDisposeSuccessModel {
    private final String chasi_no;
    private final String developerMessage;
    private final String eng_no;
    private final String mobile_no;
    private final String off_cd;
    private final String owner_name;
    private final String regn_no;
    private final String state_cd;
    private final String state_name;

    public VahanApplDisposeSuccessModel(String state_cd, String off_cd, String str, String str2, String str3, String str4, String str5, String str6, String developerMessage) {
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(off_cd, "off_cd");
        Intrinsics.checkNotNullParameter(developerMessage, "developerMessage");
        this.state_cd = state_cd;
        this.off_cd = off_cd;
        this.regn_no = str;
        this.mobile_no = str2;
        this.chasi_no = str3;
        this.eng_no = str4;
        this.state_name = str5;
        this.owner_name = str6;
        this.developerMessage = developerMessage;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMobile_no() {
        return this.mobile_no;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getChasi_no() {
        return this.chasi_no;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEng_no() {
        return this.eng_no;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getState_name() {
        return this.state_name;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getOwner_name() {
        return this.owner_name;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDeveloperMessage() {
        return this.developerMessage;
    }

    public final VahanApplDisposeSuccessModel copy(String state_cd, String off_cd, String regn_no, String mobile_no, String chasi_no, String eng_no, String state_name, String owner_name, String developerMessage) {
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(off_cd, "off_cd");
        Intrinsics.checkNotNullParameter(developerMessage, "developerMessage");
        return new VahanApplDisposeSuccessModel(state_cd, off_cd, regn_no, mobile_no, chasi_no, eng_no, state_name, owner_name, developerMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VahanApplDisposeSuccessModel)) {
            return false;
        }
        VahanApplDisposeSuccessModel vahanApplDisposeSuccessModel = (VahanApplDisposeSuccessModel) other;
        return Intrinsics.areEqual(this.state_cd, vahanApplDisposeSuccessModel.state_cd) && Intrinsics.areEqual(this.off_cd, vahanApplDisposeSuccessModel.off_cd) && Intrinsics.areEqual(this.regn_no, vahanApplDisposeSuccessModel.regn_no) && Intrinsics.areEqual(this.mobile_no, vahanApplDisposeSuccessModel.mobile_no) && Intrinsics.areEqual(this.chasi_no, vahanApplDisposeSuccessModel.chasi_no) && Intrinsics.areEqual(this.eng_no, vahanApplDisposeSuccessModel.eng_no) && Intrinsics.areEqual(this.state_name, vahanApplDisposeSuccessModel.state_name) && Intrinsics.areEqual(this.owner_name, vahanApplDisposeSuccessModel.owner_name) && Intrinsics.areEqual(this.developerMessage, vahanApplDisposeSuccessModel.developerMessage);
    }

    public final String getChasi_no() {
        return this.chasi_no;
    }

    public final String getDeveloperMessage() {
        return this.developerMessage;
    }

    public final String getEng_no() {
        return this.eng_no;
    }

    public final String getMobile_no() {
        return this.mobile_no;
    }

    public final String getOff_cd() {
        return this.off_cd;
    }

    public final String getOwner_name() {
        return this.owner_name;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final String getState_name() {
        return this.state_name;
    }

    public int hashCode() {
        int iHashCode = ((this.state_cd.hashCode() * 31) + this.off_cd.hashCode()) * 31;
        String str = this.regn_no;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mobile_no;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.chasi_no;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.eng_no;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.state_name;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.owner_name;
        return ((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.developerMessage.hashCode();
    }

    public String toString() {
        return "VahanApplDisposeSuccessModel(state_cd=" + this.state_cd + ", off_cd=" + this.off_cd + ", regn_no=" + this.regn_no + ", mobile_no=" + this.mobile_no + ", chasi_no=" + this.chasi_no + ", eng_no=" + this.eng_no + ", state_name=" + this.state_name + ", owner_name=" + this.owner_name + ", developerMessage=" + this.developerMessage + ')';
    }

    public /* synthetic */ VahanApplDisposeSuccessModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, (i & 256) != 0 ? "" : str9);
    }
}
