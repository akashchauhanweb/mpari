package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u008b\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u00063"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/RtoNameModleItem;", "", "dist_cd", "", "email_id", "landline", "mobile_no", "off_add1", "off_cd", "off_name", "off_type_cd", "off_under_cd", "pin_cd", "state_cd", "taluk_cd", "village_cd", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDist_cd", "()Ljava/lang/String;", "getEmail_id", "getLandline", "getMobile_no", "getOff_add1", "getOff_cd", "getOff_name", "getOff_type_cd", "getOff_under_cd", "getPin_cd", "getState_cd", "getTaluk_cd", "getVillage_cd", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class RtoNameModleItem {

    @xy5("dist_cd")
    private final String dist_cd;

    @xy5("email_id")
    private final String email_id;

    @xy5("landline")
    private final String landline;

    @xy5("mobile_no")
    private final String mobile_no;

    @xy5("off_add1")
    private final String off_add1;

    @xy5("off_cd")
    private final String off_cd;

    @xy5("off_name")
    private final String off_name;

    @xy5("off_type_cd")
    private final String off_type_cd;

    @xy5("off_under_cd")
    private final String off_under_cd;

    @xy5("pin_cd")
    private final String pin_cd;

    @xy5("state_cd")
    private final String state_cd;

    @xy5("taluk_cd")
    private final String taluk_cd;

    @xy5("village_cd")
    private final String village_cd;

    public RtoNameModleItem(String dist_cd, String email_id, String landline, String mobile_no, String off_add1, String off_cd, String off_name, String off_type_cd, String off_under_cd, String pin_cd, String state_cd, String taluk_cd, String village_cd) {
        Intrinsics.checkNotNullParameter(dist_cd, "dist_cd");
        Intrinsics.checkNotNullParameter(email_id, "email_id");
        Intrinsics.checkNotNullParameter(landline, "landline");
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        Intrinsics.checkNotNullParameter(off_add1, "off_add1");
        Intrinsics.checkNotNullParameter(off_cd, "off_cd");
        Intrinsics.checkNotNullParameter(off_name, "off_name");
        Intrinsics.checkNotNullParameter(off_type_cd, "off_type_cd");
        Intrinsics.checkNotNullParameter(off_under_cd, "off_under_cd");
        Intrinsics.checkNotNullParameter(pin_cd, "pin_cd");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(taluk_cd, "taluk_cd");
        Intrinsics.checkNotNullParameter(village_cd, "village_cd");
        this.dist_cd = dist_cd;
        this.email_id = email_id;
        this.landline = landline;
        this.mobile_no = mobile_no;
        this.off_add1 = off_add1;
        this.off_cd = off_cd;
        this.off_name = off_name;
        this.off_type_cd = off_type_cd;
        this.off_under_cd = off_under_cd;
        this.pin_cd = pin_cd;
        this.state_cd = state_cd;
        this.taluk_cd = taluk_cd;
        this.village_cd = village_cd;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDist_cd() {
        return this.dist_cd;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPin_cd() {
        return this.pin_cd;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTaluk_cd() {
        return this.taluk_cd;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getVillage_cd() {
        return this.village_cd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmail_id() {
        return this.email_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLandline() {
        return this.landline;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMobile_no() {
        return this.mobile_no;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOff_add1() {
        return this.off_add1;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOff_name() {
        return this.off_name;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getOff_type_cd() {
        return this.off_type_cd;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getOff_under_cd() {
        return this.off_under_cd;
    }

    public final RtoNameModleItem copy(String dist_cd, String email_id, String landline, String mobile_no, String off_add1, String off_cd, String off_name, String off_type_cd, String off_under_cd, String pin_cd, String state_cd, String taluk_cd, String village_cd) {
        Intrinsics.checkNotNullParameter(dist_cd, "dist_cd");
        Intrinsics.checkNotNullParameter(email_id, "email_id");
        Intrinsics.checkNotNullParameter(landline, "landline");
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        Intrinsics.checkNotNullParameter(off_add1, "off_add1");
        Intrinsics.checkNotNullParameter(off_cd, "off_cd");
        Intrinsics.checkNotNullParameter(off_name, "off_name");
        Intrinsics.checkNotNullParameter(off_type_cd, "off_type_cd");
        Intrinsics.checkNotNullParameter(off_under_cd, "off_under_cd");
        Intrinsics.checkNotNullParameter(pin_cd, "pin_cd");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(taluk_cd, "taluk_cd");
        Intrinsics.checkNotNullParameter(village_cd, "village_cd");
        return new RtoNameModleItem(dist_cd, email_id, landline, mobile_no, off_add1, off_cd, off_name, off_type_cd, off_under_cd, pin_cd, state_cd, taluk_cd, village_cd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RtoNameModleItem)) {
            return false;
        }
        RtoNameModleItem rtoNameModleItem = (RtoNameModleItem) other;
        return Intrinsics.areEqual(this.dist_cd, rtoNameModleItem.dist_cd) && Intrinsics.areEqual(this.email_id, rtoNameModleItem.email_id) && Intrinsics.areEqual(this.landline, rtoNameModleItem.landline) && Intrinsics.areEqual(this.mobile_no, rtoNameModleItem.mobile_no) && Intrinsics.areEqual(this.off_add1, rtoNameModleItem.off_add1) && Intrinsics.areEqual(this.off_cd, rtoNameModleItem.off_cd) && Intrinsics.areEqual(this.off_name, rtoNameModleItem.off_name) && Intrinsics.areEqual(this.off_type_cd, rtoNameModleItem.off_type_cd) && Intrinsics.areEqual(this.off_under_cd, rtoNameModleItem.off_under_cd) && Intrinsics.areEqual(this.pin_cd, rtoNameModleItem.pin_cd) && Intrinsics.areEqual(this.state_cd, rtoNameModleItem.state_cd) && Intrinsics.areEqual(this.taluk_cd, rtoNameModleItem.taluk_cd) && Intrinsics.areEqual(this.village_cd, rtoNameModleItem.village_cd);
    }

    public final String getDist_cd() {
        return this.dist_cd;
    }

    public final String getEmail_id() {
        return this.email_id;
    }

    public final String getLandline() {
        return this.landline;
    }

    public final String getMobile_no() {
        return this.mobile_no;
    }

    public final String getOff_add1() {
        return this.off_add1;
    }

    public final String getOff_cd() {
        return this.off_cd;
    }

    public final String getOff_name() {
        return this.off_name;
    }

    public final String getOff_type_cd() {
        return this.off_type_cd;
    }

    public final String getOff_under_cd() {
        return this.off_under_cd;
    }

    public final String getPin_cd() {
        return this.pin_cd;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final String getTaluk_cd() {
        return this.taluk_cd;
    }

    public final String getVillage_cd() {
        return this.village_cd;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.dist_cd.hashCode() * 31) + this.email_id.hashCode()) * 31) + this.landline.hashCode()) * 31) + this.mobile_no.hashCode()) * 31) + this.off_add1.hashCode()) * 31) + this.off_cd.hashCode()) * 31) + this.off_name.hashCode()) * 31) + this.off_type_cd.hashCode()) * 31) + this.off_under_cd.hashCode()) * 31) + this.pin_cd.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.taluk_cd.hashCode()) * 31) + this.village_cd.hashCode();
    }

    public String toString() {
        return "RtoNameModleItem(dist_cd=" + this.dist_cd + ", email_id=" + this.email_id + ", landline=" + this.landline + ", mobile_no=" + this.mobile_no + ", off_add1=" + this.off_add1 + ", off_cd=" + this.off_cd + ", off_name=" + this.off_name + ", off_type_cd=" + this.off_type_cd + ", off_under_cd=" + this.off_under_cd + ", pin_cd=" + this.pin_cd + ", state_cd=" + this.state_cd + ", taluk_cd=" + this.taluk_cd + ", village_cd=" + this.village_cd + ')';
    }
}
