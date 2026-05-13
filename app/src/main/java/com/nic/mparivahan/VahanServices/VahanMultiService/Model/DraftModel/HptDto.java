package com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\bW\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bé\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003¢\u0006\u0002\u0010 J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\bHÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\bHÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\bHÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\bHÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\bHÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\bHÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\u0010\u0010[\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010+J\t\u0010\\\u001a\u00020\u0003HÆ\u0003Jª\u0002\u0010]\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010^J\u0013\u0010_\u001a\u00020`2\b\u0010a\u001a\u0004\u0018\u00010bHÖ\u0003J\t\u0010c\u001a\u00020\bHÖ\u0001J\t\u0010d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\"R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b/\u0010'R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b1\u0010'R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\"R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\"R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\"R\u0011\u0010\u0016\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b7\u0010'R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\"R\u0011\u0010\u0018\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b9\u0010'R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\"R\u0011\u0010\u001a\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b;\u0010'R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\"R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\"R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\"R\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\"R\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\"¨\u0006e"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HptDto;", "Ljava/io/Serializable;", "appl_no", "", "fncr_add1", "fncr_add2", "fncr_add3", "fncr_district", "", "fncr_district_descr", "fncr_name", "fncr_pincode", "fncr_state", "fncr_state_name", "fncr_taluk", "fncr_taluk_descr", "fncr_village", "fncr_village_descr", "from_dt", "from_dt_descr", "hp_type", "hp_type_descr", "off_cd", "op_dt", "pur_cd", "regn_no", "sr_no", "state_cd", "term_dt", "term_dt_descr", "upto_dt", "upto_dt_descr", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppl_no", "()Ljava/lang/String;", "getFncr_add1", "getFncr_add2", "getFncr_add3", "getFncr_district", "()I", "getFncr_district_descr", "getFncr_name", "getFncr_pincode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFncr_state", "getFncr_state_name", "getFncr_taluk", "getFncr_taluk_descr", "getFncr_village", "getFncr_village_descr", "getFrom_dt", "getFrom_dt_descr", "getHp_type", "getHp_type_descr", "getOff_cd", "getOp_dt", "getPur_cd", "getRegn_no", "getSr_no", "getState_cd", "getTerm_dt", "getTerm_dt_descr", "getUpto_dt", "getUpto_dt_descr", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/HptDto;", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class HptDto implements Serializable {
    private final String appl_no;
    private final String fncr_add1;
    private final String fncr_add2;
    private final String fncr_add3;
    private final int fncr_district;
    private final String fncr_district_descr;
    private final String fncr_name;
    private final Integer fncr_pincode;
    private final String fncr_state;
    private final String fncr_state_name;
    private final int fncr_taluk;
    private final String fncr_taluk_descr;
    private final int fncr_village;
    private final String fncr_village_descr;
    private final String from_dt;
    private final String from_dt_descr;
    private final String hp_type;
    private final String hp_type_descr;
    private final int off_cd;
    private final String op_dt;
    private final int pur_cd;
    private final String regn_no;
    private final int sr_no;
    private final String state_cd;
    private final String term_dt;
    private final String term_dt_descr;
    private final String upto_dt;
    private final String upto_dt_descr;

    public HptDto(String str, String fncr_add1, String fncr_add2, String fncr_add3, int i, String fncr_district_descr, String fncr_name, Integer num, String fncr_state, String fncr_state_name, int i2, String fncr_taluk_descr, int i3, String fncr_village_descr, String from_dt, String from_dt_descr, String hp_type, String hp_type_descr, int i4, String op_dt, int i5, String regn_no, int i6, String state_cd, String term_dt, String term_dt_descr, String upto_dt, String upto_dt_descr) {
        Intrinsics.checkNotNullParameter(fncr_add1, "fncr_add1");
        Intrinsics.checkNotNullParameter(fncr_add2, "fncr_add2");
        Intrinsics.checkNotNullParameter(fncr_add3, "fncr_add3");
        Intrinsics.checkNotNullParameter(fncr_district_descr, "fncr_district_descr");
        Intrinsics.checkNotNullParameter(fncr_name, "fncr_name");
        Intrinsics.checkNotNullParameter(fncr_state, "fncr_state");
        Intrinsics.checkNotNullParameter(fncr_state_name, "fncr_state_name");
        Intrinsics.checkNotNullParameter(fncr_taluk_descr, "fncr_taluk_descr");
        Intrinsics.checkNotNullParameter(fncr_village_descr, "fncr_village_descr");
        Intrinsics.checkNotNullParameter(from_dt, "from_dt");
        Intrinsics.checkNotNullParameter(from_dt_descr, "from_dt_descr");
        Intrinsics.checkNotNullParameter(hp_type, "hp_type");
        Intrinsics.checkNotNullParameter(hp_type_descr, "hp_type_descr");
        Intrinsics.checkNotNullParameter(op_dt, "op_dt");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(term_dt, "term_dt");
        Intrinsics.checkNotNullParameter(term_dt_descr, "term_dt_descr");
        Intrinsics.checkNotNullParameter(upto_dt, "upto_dt");
        Intrinsics.checkNotNullParameter(upto_dt_descr, "upto_dt_descr");
        this.appl_no = str;
        this.fncr_add1 = fncr_add1;
        this.fncr_add2 = fncr_add2;
        this.fncr_add3 = fncr_add3;
        this.fncr_district = i;
        this.fncr_district_descr = fncr_district_descr;
        this.fncr_name = fncr_name;
        this.fncr_pincode = num;
        this.fncr_state = fncr_state;
        this.fncr_state_name = fncr_state_name;
        this.fncr_taluk = i2;
        this.fncr_taluk_descr = fncr_taluk_descr;
        this.fncr_village = i3;
        this.fncr_village_descr = fncr_village_descr;
        this.from_dt = from_dt;
        this.from_dt_descr = from_dt_descr;
        this.hp_type = hp_type;
        this.hp_type_descr = hp_type_descr;
        this.off_cd = i4;
        this.op_dt = op_dt;
        this.pur_cd = i5;
        this.regn_no = regn_no;
        this.sr_no = i6;
        this.state_cd = state_cd;
        this.term_dt = term_dt;
        this.term_dt_descr = term_dt_descr;
        this.upto_dt = upto_dt;
        this.upto_dt_descr = upto_dt_descr;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppl_no() {
        return this.appl_no;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getFncr_state_name() {
        return this.fncr_state_name;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getFncr_taluk() {
        return this.fncr_taluk;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getFncr_taluk_descr() {
        return this.fncr_taluk_descr;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getFncr_village() {
        return this.fncr_village;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getFncr_village_descr() {
        return this.fncr_village_descr;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getFrom_dt() {
        return this.from_dt;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getFrom_dt_descr() {
        return this.from_dt_descr;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getHp_type() {
        return this.hp_type;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getHp_type_descr() {
        return this.hp_type_descr;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFncr_add1() {
        return this.fncr_add1;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getOp_dt() {
        return this.op_dt;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final int getPur_cd() {
        return this.pur_cd;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final int getSr_no() {
        return this.sr_no;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getTerm_dt() {
        return this.term_dt;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getTerm_dt_descr() {
        return this.term_dt_descr;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getUpto_dt() {
        return this.upto_dt;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getUpto_dt_descr() {
        return this.upto_dt_descr;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFncr_add2() {
        return this.fncr_add2;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFncr_add3() {
        return this.fncr_add3;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getFncr_district() {
        return this.fncr_district;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFncr_district_descr() {
        return this.fncr_district_descr;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFncr_name() {
        return this.fncr_name;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getFncr_pincode() {
        return this.fncr_pincode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getFncr_state() {
        return this.fncr_state;
    }

    public final HptDto copy(String appl_no, String fncr_add1, String fncr_add2, String fncr_add3, int fncr_district, String fncr_district_descr, String fncr_name, Integer fncr_pincode, String fncr_state, String fncr_state_name, int fncr_taluk, String fncr_taluk_descr, int fncr_village, String fncr_village_descr, String from_dt, String from_dt_descr, String hp_type, String hp_type_descr, int off_cd, String op_dt, int pur_cd, String regn_no, int sr_no, String state_cd, String term_dt, String term_dt_descr, String upto_dt, String upto_dt_descr) {
        Intrinsics.checkNotNullParameter(fncr_add1, "fncr_add1");
        Intrinsics.checkNotNullParameter(fncr_add2, "fncr_add2");
        Intrinsics.checkNotNullParameter(fncr_add3, "fncr_add3");
        Intrinsics.checkNotNullParameter(fncr_district_descr, "fncr_district_descr");
        Intrinsics.checkNotNullParameter(fncr_name, "fncr_name");
        Intrinsics.checkNotNullParameter(fncr_state, "fncr_state");
        Intrinsics.checkNotNullParameter(fncr_state_name, "fncr_state_name");
        Intrinsics.checkNotNullParameter(fncr_taluk_descr, "fncr_taluk_descr");
        Intrinsics.checkNotNullParameter(fncr_village_descr, "fncr_village_descr");
        Intrinsics.checkNotNullParameter(from_dt, "from_dt");
        Intrinsics.checkNotNullParameter(from_dt_descr, "from_dt_descr");
        Intrinsics.checkNotNullParameter(hp_type, "hp_type");
        Intrinsics.checkNotNullParameter(hp_type_descr, "hp_type_descr");
        Intrinsics.checkNotNullParameter(op_dt, "op_dt");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(term_dt, "term_dt");
        Intrinsics.checkNotNullParameter(term_dt_descr, "term_dt_descr");
        Intrinsics.checkNotNullParameter(upto_dt, "upto_dt");
        Intrinsics.checkNotNullParameter(upto_dt_descr, "upto_dt_descr");
        return new HptDto(appl_no, fncr_add1, fncr_add2, fncr_add3, fncr_district, fncr_district_descr, fncr_name, fncr_pincode, fncr_state, fncr_state_name, fncr_taluk, fncr_taluk_descr, fncr_village, fncr_village_descr, from_dt, from_dt_descr, hp_type, hp_type_descr, off_cd, op_dt, pur_cd, regn_no, sr_no, state_cd, term_dt, term_dt_descr, upto_dt, upto_dt_descr);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HptDto)) {
            return false;
        }
        HptDto hptDto = (HptDto) other;
        return Intrinsics.areEqual(this.appl_no, hptDto.appl_no) && Intrinsics.areEqual(this.fncr_add1, hptDto.fncr_add1) && Intrinsics.areEqual(this.fncr_add2, hptDto.fncr_add2) && Intrinsics.areEqual(this.fncr_add3, hptDto.fncr_add3) && this.fncr_district == hptDto.fncr_district && Intrinsics.areEqual(this.fncr_district_descr, hptDto.fncr_district_descr) && Intrinsics.areEqual(this.fncr_name, hptDto.fncr_name) && Intrinsics.areEqual(this.fncr_pincode, hptDto.fncr_pincode) && Intrinsics.areEqual(this.fncr_state, hptDto.fncr_state) && Intrinsics.areEqual(this.fncr_state_name, hptDto.fncr_state_name) && this.fncr_taluk == hptDto.fncr_taluk && Intrinsics.areEqual(this.fncr_taluk_descr, hptDto.fncr_taluk_descr) && this.fncr_village == hptDto.fncr_village && Intrinsics.areEqual(this.fncr_village_descr, hptDto.fncr_village_descr) && Intrinsics.areEqual(this.from_dt, hptDto.from_dt) && Intrinsics.areEqual(this.from_dt_descr, hptDto.from_dt_descr) && Intrinsics.areEqual(this.hp_type, hptDto.hp_type) && Intrinsics.areEqual(this.hp_type_descr, hptDto.hp_type_descr) && this.off_cd == hptDto.off_cd && Intrinsics.areEqual(this.op_dt, hptDto.op_dt) && this.pur_cd == hptDto.pur_cd && Intrinsics.areEqual(this.regn_no, hptDto.regn_no) && this.sr_no == hptDto.sr_no && Intrinsics.areEqual(this.state_cd, hptDto.state_cd) && Intrinsics.areEqual(this.term_dt, hptDto.term_dt) && Intrinsics.areEqual(this.term_dt_descr, hptDto.term_dt_descr) && Intrinsics.areEqual(this.upto_dt, hptDto.upto_dt) && Intrinsics.areEqual(this.upto_dt_descr, hptDto.upto_dt_descr);
    }

    public final String getAppl_no() {
        return this.appl_no;
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

    public final int getFncr_district() {
        return this.fncr_district;
    }

    public final String getFncr_district_descr() {
        return this.fncr_district_descr;
    }

    public final String getFncr_name() {
        return this.fncr_name;
    }

    public final Integer getFncr_pincode() {
        return this.fncr_pincode;
    }

    public final String getFncr_state() {
        return this.fncr_state;
    }

    public final String getFncr_state_name() {
        return this.fncr_state_name;
    }

    public final int getFncr_taluk() {
        return this.fncr_taluk;
    }

    public final String getFncr_taluk_descr() {
        return this.fncr_taluk_descr;
    }

    public final int getFncr_village() {
        return this.fncr_village;
    }

    public final String getFncr_village_descr() {
        return this.fncr_village_descr;
    }

    public final String getFrom_dt() {
        return this.from_dt;
    }

    public final String getFrom_dt_descr() {
        return this.from_dt_descr;
    }

    public final String getHp_type() {
        return this.hp_type;
    }

    public final String getHp_type_descr() {
        return this.hp_type_descr;
    }

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final String getOp_dt() {
        return this.op_dt;
    }

    public final int getPur_cd() {
        return this.pur_cd;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final int getSr_no() {
        return this.sr_no;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final String getTerm_dt() {
        return this.term_dt;
    }

    public final String getTerm_dt_descr() {
        return this.term_dt_descr;
    }

    public final String getUpto_dt() {
        return this.upto_dt;
    }

    public final String getUpto_dt_descr() {
        return this.upto_dt_descr;
    }

    public int hashCode() {
        String str = this.appl_no;
        int iHashCode = (((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.fncr_add1.hashCode()) * 31) + this.fncr_add2.hashCode()) * 31) + this.fncr_add3.hashCode()) * 31) + Integer.hashCode(this.fncr_district)) * 31) + this.fncr_district_descr.hashCode()) * 31) + this.fncr_name.hashCode()) * 31;
        Integer num = this.fncr_pincode;
        return ((((((((((((((((((((((((((((((((((((((((iHashCode + (num != null ? num.hashCode() : 0)) * 31) + this.fncr_state.hashCode()) * 31) + this.fncr_state_name.hashCode()) * 31) + Integer.hashCode(this.fncr_taluk)) * 31) + this.fncr_taluk_descr.hashCode()) * 31) + Integer.hashCode(this.fncr_village)) * 31) + this.fncr_village_descr.hashCode()) * 31) + this.from_dt.hashCode()) * 31) + this.from_dt_descr.hashCode()) * 31) + this.hp_type.hashCode()) * 31) + this.hp_type_descr.hashCode()) * 31) + Integer.hashCode(this.off_cd)) * 31) + this.op_dt.hashCode()) * 31) + Integer.hashCode(this.pur_cd)) * 31) + this.regn_no.hashCode()) * 31) + Integer.hashCode(this.sr_no)) * 31) + this.state_cd.hashCode()) * 31) + this.term_dt.hashCode()) * 31) + this.term_dt_descr.hashCode()) * 31) + this.upto_dt.hashCode()) * 31) + this.upto_dt_descr.hashCode();
    }

    public String toString() {
        return "HptDto(appl_no=" + this.appl_no + ", fncr_add1=" + this.fncr_add1 + ", fncr_add2=" + this.fncr_add2 + ", fncr_add3=" + this.fncr_add3 + ", fncr_district=" + this.fncr_district + ", fncr_district_descr=" + this.fncr_district_descr + ", fncr_name=" + this.fncr_name + ", fncr_pincode=" + this.fncr_pincode + ", fncr_state=" + this.fncr_state + ", fncr_state_name=" + this.fncr_state_name + ", fncr_taluk=" + this.fncr_taluk + ", fncr_taluk_descr=" + this.fncr_taluk_descr + ", fncr_village=" + this.fncr_village + ", fncr_village_descr=" + this.fncr_village_descr + ", from_dt=" + this.from_dt + ", from_dt_descr=" + this.from_dt_descr + ", hp_type=" + this.hp_type + ", hp_type_descr=" + this.hp_type_descr + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", pur_cd=" + this.pur_cd + ", regn_no=" + this.regn_no + ", sr_no=" + this.sr_no + ", state_cd=" + this.state_cd + ", term_dt=" + this.term_dt + ", term_dt_descr=" + this.term_dt_descr + ", upto_dt=" + this.upto_dt + ", upto_dt_descr=" + this.upto_dt_descr + ')';
    }
}
