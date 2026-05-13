package com.nic.mparivahan.VahanServices.HPTModel.HTPModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u000eHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u0083\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006/"}, d2 = {"Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptDetailsModle;", "", "fncr_add1", "", "fncr_add2", "fncr_add3", "fncr_district", "fncr_name", "fncr_pincode", "fncr_state", "from_dt", "hp_type", "op_dt", "vTHypthEntityByid", "Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/VTHypthEntityByid;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/VTHypthEntityByid;)V", "getFncr_add1", "()Ljava/lang/String;", "getFncr_add2", "getFncr_add3", "getFncr_district", "getFncr_name", "getFncr_pincode", "getFncr_state", "getFrom_dt", "getHp_type", "getOp_dt", "getVTHypthEntityByid", "()Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/VTHypthEntityByid;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class HptDetailsModle {
    private final String fncr_add1;
    private final String fncr_add2;
    private final String fncr_add3;
    private final String fncr_district;
    private final String fncr_name;
    private final String fncr_pincode;
    private final String fncr_state;
    private final String from_dt;
    private final String hp_type;
    private final String op_dt;
    private final VTHypthEntityByid vTHypthEntityByid;

    public HptDetailsModle(String str, String str2, String str3, String str4, String str5, String fncr_pincode, String fncr_state, String str6, String hp_type, String op_dt, VTHypthEntityByid vTHypthEntityByid) {
        Intrinsics.checkNotNullParameter(fncr_pincode, "fncr_pincode");
        Intrinsics.checkNotNullParameter(fncr_state, "fncr_state");
        Intrinsics.checkNotNullParameter(hp_type, "hp_type");
        Intrinsics.checkNotNullParameter(op_dt, "op_dt");
        Intrinsics.checkNotNullParameter(vTHypthEntityByid, "vTHypthEntityByid");
        this.fncr_add1 = str;
        this.fncr_add2 = str2;
        this.fncr_add3 = str3;
        this.fncr_district = str4;
        this.fncr_name = str5;
        this.fncr_pincode = fncr_pincode;
        this.fncr_state = fncr_state;
        this.from_dt = str6;
        this.hp_type = hp_type;
        this.op_dt = op_dt;
        this.vTHypthEntityByid = vTHypthEntityByid;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFncr_add1() {
        return this.fncr_add1;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getOp_dt() {
        return this.op_dt;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final VTHypthEntityByid getVTHypthEntityByid() {
        return this.vTHypthEntityByid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFncr_add2() {
        return this.fncr_add2;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFncr_add3() {
        return this.fncr_add3;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFncr_district() {
        return this.fncr_district;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFncr_name() {
        return this.fncr_name;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFncr_pincode() {
        return this.fncr_pincode;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFncr_state() {
        return this.fncr_state;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getFrom_dt() {
        return this.from_dt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getHp_type() {
        return this.hp_type;
    }

    public final HptDetailsModle copy(String fncr_add1, String fncr_add2, String fncr_add3, String fncr_district, String fncr_name, String fncr_pincode, String fncr_state, String from_dt, String hp_type, String op_dt, VTHypthEntityByid vTHypthEntityByid) {
        Intrinsics.checkNotNullParameter(fncr_pincode, "fncr_pincode");
        Intrinsics.checkNotNullParameter(fncr_state, "fncr_state");
        Intrinsics.checkNotNullParameter(hp_type, "hp_type");
        Intrinsics.checkNotNullParameter(op_dt, "op_dt");
        Intrinsics.checkNotNullParameter(vTHypthEntityByid, "vTHypthEntityByid");
        return new HptDetailsModle(fncr_add1, fncr_add2, fncr_add3, fncr_district, fncr_name, fncr_pincode, fncr_state, from_dt, hp_type, op_dt, vTHypthEntityByid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HptDetailsModle)) {
            return false;
        }
        HptDetailsModle hptDetailsModle = (HptDetailsModle) other;
        return Intrinsics.areEqual(this.fncr_add1, hptDetailsModle.fncr_add1) && Intrinsics.areEqual(this.fncr_add2, hptDetailsModle.fncr_add2) && Intrinsics.areEqual(this.fncr_add3, hptDetailsModle.fncr_add3) && Intrinsics.areEqual(this.fncr_district, hptDetailsModle.fncr_district) && Intrinsics.areEqual(this.fncr_name, hptDetailsModle.fncr_name) && Intrinsics.areEqual(this.fncr_pincode, hptDetailsModle.fncr_pincode) && Intrinsics.areEqual(this.fncr_state, hptDetailsModle.fncr_state) && Intrinsics.areEqual(this.from_dt, hptDetailsModle.from_dt) && Intrinsics.areEqual(this.hp_type, hptDetailsModle.hp_type) && Intrinsics.areEqual(this.op_dt, hptDetailsModle.op_dt) && Intrinsics.areEqual(this.vTHypthEntityByid, hptDetailsModle.vTHypthEntityByid);
    }

    public final String getFncr_add1() {
        return this.fncr_add1;
    }

    public final String getFncr_add2() {
        return this.fncr_add2;
    }

    public final String getFncr_add3() {
        return this.fncr_add3;
    }

    public final String getFncr_district() {
        return this.fncr_district;
    }

    public final String getFncr_name() {
        return this.fncr_name;
    }

    public final String getFncr_pincode() {
        return this.fncr_pincode;
    }

    public final String getFncr_state() {
        return this.fncr_state;
    }

    public final String getFrom_dt() {
        return this.from_dt;
    }

    public final String getHp_type() {
        return this.hp_type;
    }

    public final String getOp_dt() {
        return this.op_dt;
    }

    public final VTHypthEntityByid getVTHypthEntityByid() {
        return this.vTHypthEntityByid;
    }

    public int hashCode() {
        String str = this.fncr_add1;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fncr_add2;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fncr_add3;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fncr_district;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fncr_name;
        int iHashCode5 = (((((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.fncr_pincode.hashCode()) * 31) + this.fncr_state.hashCode()) * 31;
        String str6 = this.from_dt;
        return ((((((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.hp_type.hashCode()) * 31) + this.op_dt.hashCode()) * 31) + this.vTHypthEntityByid.hashCode();
    }

    public String toString() {
        return "HptDetailsModle(fncr_add1=" + this.fncr_add1 + ", fncr_add2=" + this.fncr_add2 + ", fncr_add3=" + this.fncr_add3 + ", fncr_district=" + this.fncr_district + ", fncr_name=" + this.fncr_name + ", fncr_pincode=" + this.fncr_pincode + ", fncr_state=" + this.fncr_state + ", from_dt=" + this.from_dt + ", hp_type=" + this.hp_type + ", op_dt=" + this.op_dt + ", vTHypthEntityByid=" + this.vTHypthEntityByid + ')';
    }

    public /* synthetic */ HptDetailsModle(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, VTHypthEntityByid vTHypthEntityByid, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? " " : str, (i & 2) != 0 ? " " : str2, (i & 4) != 0 ? " " : str3, (i & 8) != 0 ? " " : str4, (i & 16) != 0 ? " " : str5, str6, str7, (i & 128) != 0 ? " " : str8, str9, str10, vTHypthEntityByid);
    }
}
