package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b6\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0017J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010(J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010:\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010>\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010?\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010%JÎ\u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020\u00072\b\u0010C\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010D\u001a\u00020\u0010HÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\"\u0010\u001dR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b#\u0010\u001dR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0019R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0019¨\u0006F"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/OwnerIdentification;", "Ljava/io/Serializable;", "aadhar_no", "", "appl_no", "", "dlRequired", "", "dlValidationRequired", "dl_no", "email_id", "flag", "mobileNoEditable", "mobile_no", "", "ownerCatg", "", "pan_no", "passport_no", "ration_card_no", "regn_no", "state_cd", "voter_id", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V", "getAadhar_no", "()Ljava/lang/String;", "getAppl_no", "()Ljava/lang/Object;", "getDlRequired", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDlValidationRequired", "getDl_no", "getEmail_id", "getFlag", "getMobileNoEditable", "getMobile_no", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOwnerCatg", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPan_no", "getPassport_no", "getRation_card_no", "getRegn_no", "getState_cd", "getVoter_id", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)Lcom/nic/mparivahan/VahanServices/VahanModel/OwnerIdentification;", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class OwnerIdentification implements Serializable {
    private final String aadhar_no;
    private final Object appl_no;
    private final Boolean dlRequired;
    private final Boolean dlValidationRequired;
    private final String dl_no;
    private final String email_id;
    private final Boolean flag;
    private final Boolean mobileNoEditable;
    private final Long mobile_no;
    private final Integer ownerCatg;
    private final String pan_no;
    private final String passport_no;
    private final String ration_card_no;
    private final Object regn_no;
    private final Object state_cd;
    private final String voter_id;

    public OwnerIdentification(String str, Object obj, Boolean bool, Boolean bool2, String str2, String str3, Boolean bool3, Boolean bool4, Long l, Integer num, String str4, String str5, String str6, Object obj2, Object obj3, String str7) {
        this.aadhar_no = str;
        this.appl_no = obj;
        this.dlRequired = bool;
        this.dlValidationRequired = bool2;
        this.dl_no = str2;
        this.email_id = str3;
        this.flag = bool3;
        this.mobileNoEditable = bool4;
        this.mobile_no = l;
        this.ownerCatg = num;
        this.pan_no = str4;
        this.passport_no = str5;
        this.ration_card_no = str6;
        this.regn_no = obj2;
        this.state_cd = obj3;
        this.voter_id = str7;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAadhar_no() {
        return this.aadhar_no;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getOwnerCatg() {
        return this.ownerCatg;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPan_no() {
        return this.pan_no;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPassport_no() {
        return this.passport_no;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getRation_card_no() {
        return this.ration_card_no;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Object getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Object getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getVoter_id() {
        return this.voter_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getAppl_no() {
        return this.appl_no;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getDlRequired() {
        return this.dlRequired;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getDlValidationRequired() {
        return this.dlValidationRequired;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDl_no() {
        return this.dl_no;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEmail_id() {
        return this.email_id;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getFlag() {
        return this.flag;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getMobileNoEditable() {
        return this.mobileNoEditable;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getMobile_no() {
        return this.mobile_no;
    }

    public final OwnerIdentification copy(String aadhar_no, Object appl_no, Boolean dlRequired, Boolean dlValidationRequired, String dl_no, String email_id, Boolean flag, Boolean mobileNoEditable, Long mobile_no, Integer ownerCatg, String pan_no, String passport_no, String ration_card_no, Object regn_no, Object state_cd, String voter_id) {
        return new OwnerIdentification(aadhar_no, appl_no, dlRequired, dlValidationRequired, dl_no, email_id, flag, mobileNoEditable, mobile_no, ownerCatg, pan_no, passport_no, ration_card_no, regn_no, state_cd, voter_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OwnerIdentification)) {
            return false;
        }
        OwnerIdentification ownerIdentification = (OwnerIdentification) other;
        return Intrinsics.areEqual(this.aadhar_no, ownerIdentification.aadhar_no) && Intrinsics.areEqual(this.appl_no, ownerIdentification.appl_no) && Intrinsics.areEqual(this.dlRequired, ownerIdentification.dlRequired) && Intrinsics.areEqual(this.dlValidationRequired, ownerIdentification.dlValidationRequired) && Intrinsics.areEqual(this.dl_no, ownerIdentification.dl_no) && Intrinsics.areEqual(this.email_id, ownerIdentification.email_id) && Intrinsics.areEqual(this.flag, ownerIdentification.flag) && Intrinsics.areEqual(this.mobileNoEditable, ownerIdentification.mobileNoEditable) && Intrinsics.areEqual(this.mobile_no, ownerIdentification.mobile_no) && Intrinsics.areEqual(this.ownerCatg, ownerIdentification.ownerCatg) && Intrinsics.areEqual(this.pan_no, ownerIdentification.pan_no) && Intrinsics.areEqual(this.passport_no, ownerIdentification.passport_no) && Intrinsics.areEqual(this.ration_card_no, ownerIdentification.ration_card_no) && Intrinsics.areEqual(this.regn_no, ownerIdentification.regn_no) && Intrinsics.areEqual(this.state_cd, ownerIdentification.state_cd) && Intrinsics.areEqual(this.voter_id, ownerIdentification.voter_id);
    }

    public final String getAadhar_no() {
        return this.aadhar_no;
    }

    public final Object getAppl_no() {
        return this.appl_no;
    }

    public final Boolean getDlRequired() {
        return this.dlRequired;
    }

    public final Boolean getDlValidationRequired() {
        return this.dlValidationRequired;
    }

    public final String getDl_no() {
        return this.dl_no;
    }

    public final String getEmail_id() {
        return this.email_id;
    }

    public final Boolean getFlag() {
        return this.flag;
    }

    public final Boolean getMobileNoEditable() {
        return this.mobileNoEditable;
    }

    public final Long getMobile_no() {
        return this.mobile_no;
    }

    public final Integer getOwnerCatg() {
        return this.ownerCatg;
    }

    public final String getPan_no() {
        return this.pan_no;
    }

    public final String getPassport_no() {
        return this.passport_no;
    }

    public final String getRation_card_no() {
        return this.ration_card_no;
    }

    public final Object getRegn_no() {
        return this.regn_no;
    }

    public final Object getState_cd() {
        return this.state_cd;
    }

    public final String getVoter_id() {
        return this.voter_id;
    }

    public int hashCode() {
        String str = this.aadhar_no;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.appl_no;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Boolean bool = this.dlRequired;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.dlValidationRequired;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.dl_no;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.email_id;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool3 = this.flag;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.mobileNoEditable;
        int iHashCode8 = (iHashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Long l = this.mobile_no;
        int iHashCode9 = (iHashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.ownerCatg;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.pan_no;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.passport_no;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.ration_card_no;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Object obj2 = this.regn_no;
        int iHashCode14 = (iHashCode13 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.state_cd;
        int iHashCode15 = (iHashCode14 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        String str7 = this.voter_id;
        return iHashCode15 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        return "OwnerIdentification(aadhar_no=" + this.aadhar_no + ", appl_no=" + this.appl_no + ", dlRequired=" + this.dlRequired + ", dlValidationRequired=" + this.dlValidationRequired + ", dl_no=" + this.dl_no + ", email_id=" + this.email_id + ", flag=" + this.flag + ", mobileNoEditable=" + this.mobileNoEditable + ", mobile_no=" + this.mobile_no + ", ownerCatg=" + this.ownerCatg + ", pan_no=" + this.pan_no + ", passport_no=" + this.passport_no + ", ration_card_no=" + this.ration_card_no + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", voter_id=" + this.voter_id + ')';
    }
}
