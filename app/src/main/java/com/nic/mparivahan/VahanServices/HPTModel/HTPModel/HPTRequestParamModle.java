package com.nic.mparivahan.VahanServices.HPTModel.HTPModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\bW\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J×\u0002\u0010Y\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010Z\u001a\u00020[2\b\u0010\\\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010]\u001a\u00020^HÖ\u0001J\t\u0010_\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010!R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010!R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010!R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010!R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010!R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010!R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010!¨\u0006`"}, d2 = {"Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HPTRequestParamModle;", "", "appl_no", "", "fncr_add1", "fncr_add2", "fncr_add3", "fncr_district", "fncr_district_descr", "fncr_name", "fncr_pincode", "fncr_state", "fncr_state_name", "fncr_taluk", "fncr_taluk_descr", "fncr_village", "fncr_village_descr", "from_dt", "from_dt_descr", "hp_type", "hp_type_descr", "off_cd", "op_dt", "pur_cd", "regn_no", "sr_no", "state_cd", "term_dt", "term_dt_descr", "upto_dt", "upto_dt_descr", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppl_no", "()Ljava/lang/String;", "getFncr_add1", "getFncr_add2", "getFncr_add3", "getFncr_district", "getFncr_district_descr", "getFncr_name", "getFncr_pincode", "getFncr_state", "getFncr_state_name", "getFncr_taluk", "getFncr_taluk_descr", "getFncr_village", "getFncr_village_descr", "getFrom_dt", "getFrom_dt_descr", "getHp_type", "getHp_type_descr", "getOff_cd", "getOp_dt", "getPur_cd", "getRegn_no", "getSr_no", "getState_cd", "getTerm_dt", "getTerm_dt_descr", "getUpto_dt", "getUpto_dt_descr", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class HPTRequestParamModle {
    private final String appl_no;
    private final String fncr_add1;
    private final String fncr_add2;
    private final String fncr_add3;
    private final String fncr_district;
    private final String fncr_district_descr;
    private final String fncr_name;
    private final String fncr_pincode;
    private final String fncr_state;
    private final String fncr_state_name;
    private final String fncr_taluk;
    private final String fncr_taluk_descr;
    private final String fncr_village;
    private final String fncr_village_descr;
    private final String from_dt;
    private final String from_dt_descr;
    private final String hp_type;
    private final String hp_type_descr;
    private final String off_cd;
    private final String op_dt;
    private final String pur_cd;
    private final String regn_no;
    private final String sr_no;
    private final String state_cd;
    private final String term_dt;
    private final String term_dt_descr;
    private final String upto_dt;
    private final String upto_dt_descr;

    public HPTRequestParamModle(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String regn_no, String str22, String str23, String str24, String str25, String str26, String str27) {
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        this.appl_no = str;
        this.fncr_add1 = str2;
        this.fncr_add2 = str3;
        this.fncr_add3 = str4;
        this.fncr_district = str5;
        this.fncr_district_descr = str6;
        this.fncr_name = str7;
        this.fncr_pincode = str8;
        this.fncr_state = str9;
        this.fncr_state_name = str10;
        this.fncr_taluk = str11;
        this.fncr_taluk_descr = str12;
        this.fncr_village = str13;
        this.fncr_village_descr = str14;
        this.from_dt = str15;
        this.from_dt_descr = str16;
        this.hp_type = str17;
        this.hp_type_descr = str18;
        this.off_cd = str19;
        this.op_dt = str20;
        this.pur_cd = str21;
        this.regn_no = regn_no;
        this.sr_no = str22;
        this.state_cd = str23;
        this.term_dt = str24;
        this.term_dt_descr = str25;
        this.upto_dt = str26;
        this.upto_dt_descr = str27;
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
    public final String getFncr_taluk() {
        return this.fncr_taluk;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getFncr_taluk_descr() {
        return this.fncr_taluk_descr;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getFncr_village() {
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
    public final String getOff_cd() {
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
    public final String getPur_cd() {
        return this.pur_cd;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getSr_no() {
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
    public final String getFncr_district() {
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
    public final String getFncr_pincode() {
        return this.fncr_pincode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getFncr_state() {
        return this.fncr_state;
    }

    public final HPTRequestParamModle copy(String appl_no, String fncr_add1, String fncr_add2, String fncr_add3, String fncr_district, String fncr_district_descr, String fncr_name, String fncr_pincode, String fncr_state, String fncr_state_name, String fncr_taluk, String fncr_taluk_descr, String fncr_village, String fncr_village_descr, String from_dt, String from_dt_descr, String hp_type, String hp_type_descr, String off_cd, String op_dt, String pur_cd, String regn_no, String sr_no, String state_cd, String term_dt, String term_dt_descr, String upto_dt, String upto_dt_descr) {
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        return new HPTRequestParamModle(appl_no, fncr_add1, fncr_add2, fncr_add3, fncr_district, fncr_district_descr, fncr_name, fncr_pincode, fncr_state, fncr_state_name, fncr_taluk, fncr_taluk_descr, fncr_village, fncr_village_descr, from_dt, from_dt_descr, hp_type, hp_type_descr, off_cd, op_dt, pur_cd, regn_no, sr_no, state_cd, term_dt, term_dt_descr, upto_dt, upto_dt_descr);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HPTRequestParamModle)) {
            return false;
        }
        HPTRequestParamModle hPTRequestParamModle = (HPTRequestParamModle) other;
        return Intrinsics.areEqual(this.appl_no, hPTRequestParamModle.appl_no) && Intrinsics.areEqual(this.fncr_add1, hPTRequestParamModle.fncr_add1) && Intrinsics.areEqual(this.fncr_add2, hPTRequestParamModle.fncr_add2) && Intrinsics.areEqual(this.fncr_add3, hPTRequestParamModle.fncr_add3) && Intrinsics.areEqual(this.fncr_district, hPTRequestParamModle.fncr_district) && Intrinsics.areEqual(this.fncr_district_descr, hPTRequestParamModle.fncr_district_descr) && Intrinsics.areEqual(this.fncr_name, hPTRequestParamModle.fncr_name) && Intrinsics.areEqual(this.fncr_pincode, hPTRequestParamModle.fncr_pincode) && Intrinsics.areEqual(this.fncr_state, hPTRequestParamModle.fncr_state) && Intrinsics.areEqual(this.fncr_state_name, hPTRequestParamModle.fncr_state_name) && Intrinsics.areEqual(this.fncr_taluk, hPTRequestParamModle.fncr_taluk) && Intrinsics.areEqual(this.fncr_taluk_descr, hPTRequestParamModle.fncr_taluk_descr) && Intrinsics.areEqual(this.fncr_village, hPTRequestParamModle.fncr_village) && Intrinsics.areEqual(this.fncr_village_descr, hPTRequestParamModle.fncr_village_descr) && Intrinsics.areEqual(this.from_dt, hPTRequestParamModle.from_dt) && Intrinsics.areEqual(this.from_dt_descr, hPTRequestParamModle.from_dt_descr) && Intrinsics.areEqual(this.hp_type, hPTRequestParamModle.hp_type) && Intrinsics.areEqual(this.hp_type_descr, hPTRequestParamModle.hp_type_descr) && Intrinsics.areEqual(this.off_cd, hPTRequestParamModle.off_cd) && Intrinsics.areEqual(this.op_dt, hPTRequestParamModle.op_dt) && Intrinsics.areEqual(this.pur_cd, hPTRequestParamModle.pur_cd) && Intrinsics.areEqual(this.regn_no, hPTRequestParamModle.regn_no) && Intrinsics.areEqual(this.sr_no, hPTRequestParamModle.sr_no) && Intrinsics.areEqual(this.state_cd, hPTRequestParamModle.state_cd) && Intrinsics.areEqual(this.term_dt, hPTRequestParamModle.term_dt) && Intrinsics.areEqual(this.term_dt_descr, hPTRequestParamModle.term_dt_descr) && Intrinsics.areEqual(this.upto_dt, hPTRequestParamModle.upto_dt) && Intrinsics.areEqual(this.upto_dt_descr, hPTRequestParamModle.upto_dt_descr);
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

    public final String getFncr_district() {
        return this.fncr_district;
    }

    public final String getFncr_district_descr() {
        return this.fncr_district_descr;
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

    public final String getFncr_state_name() {
        return this.fncr_state_name;
    }

    public final String getFncr_taluk() {
        return this.fncr_taluk;
    }

    public final String getFncr_taluk_descr() {
        return this.fncr_taluk_descr;
    }

    public final String getFncr_village() {
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

    public final String getOff_cd() {
        return this.off_cd;
    }

    public final String getOp_dt() {
        return this.op_dt;
    }

    public final String getPur_cd() {
        return this.pur_cd;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getSr_no() {
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
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fncr_add1;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fncr_add2;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fncr_add3;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fncr_district;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.fncr_district_descr;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.fncr_name;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.fncr_pincode;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.fncr_state;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.fncr_state_name;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.fncr_taluk;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.fncr_taluk_descr;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.fncr_village;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.fncr_village_descr;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.from_dt;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.from_dt_descr;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.hp_type;
        int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.hp_type_descr;
        int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.off_cd;
        int iHashCode19 = (iHashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.op_dt;
        int iHashCode20 = (iHashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.pur_cd;
        int iHashCode21 = (((iHashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31) + this.regn_no.hashCode()) * 31;
        String str22 = this.sr_no;
        int iHashCode22 = (iHashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.state_cd;
        int iHashCode23 = (iHashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.term_dt;
        int iHashCode24 = (iHashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.term_dt_descr;
        int iHashCode25 = (iHashCode24 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.upto_dt;
        int iHashCode26 = (iHashCode25 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.upto_dt_descr;
        return iHashCode26 + (str27 != null ? str27.hashCode() : 0);
    }

    public String toString() {
        return "HPTRequestParamModle(appl_no=" + this.appl_no + ", fncr_add1=" + this.fncr_add1 + ", fncr_add2=" + this.fncr_add2 + ", fncr_add3=" + this.fncr_add3 + ", fncr_district=" + this.fncr_district + ", fncr_district_descr=" + this.fncr_district_descr + ", fncr_name=" + this.fncr_name + ", fncr_pincode=" + this.fncr_pincode + ", fncr_state=" + this.fncr_state + ", fncr_state_name=" + this.fncr_state_name + ", fncr_taluk=" + this.fncr_taluk + ", fncr_taluk_descr=" + this.fncr_taluk_descr + ", fncr_village=" + this.fncr_village + ", fncr_village_descr=" + this.fncr_village_descr + ", from_dt=" + this.from_dt + ", from_dt_descr=" + this.from_dt_descr + ", hp_type=" + this.hp_type + ", hp_type_descr=" + this.hp_type_descr + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", pur_cd=" + this.pur_cd + ", regn_no=" + this.regn_no + ", sr_no=" + this.sr_no + ", state_cd=" + this.state_cd + ", term_dt=" + this.term_dt + ", term_dt_descr=" + this.term_dt_descr + ", upto_dt=" + this.upto_dt + ", upto_dt_descr=" + this.upto_dt_descr + ')';
    }
}
