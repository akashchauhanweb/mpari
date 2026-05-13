package com.nic.mparivahan.VahanServices.DRcModle;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b]\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\"\u001a\u00020\u0007\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010$J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0007HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0007HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0007HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0007HÆ\u0003J\t\u0010]\u001a\u00020\u0007HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010d\u001a\u00020\u0007HÆ\u0003Jå\u0002\u0010e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\"\u001a\u00020\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010f\u001a\u00020g2\b\u0010h\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010i\u001a\u00020\u0007HÖ\u0001J\t\u0010j\u001a\u00020\u0003HÖ\u0001R\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010&R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010)R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010)R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b2\u0010+R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010&R\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b4\u0010+R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010&R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010&R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u0010)R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010&R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010&R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010&R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010&R\u0011\u0010\u0018\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b<\u0010+R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010&R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010&R\u0011\u0010\u001b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b?\u0010+R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010&R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010&R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010&R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010&R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010&R\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010&R\u0011\u0010\"\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bF\u0010+¨\u0006k"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DRcModle/dulicateRcResponseModle;", "Ljava/io/Serializable;", "appl_no", "", "channgeOfAdressDto", "", "comp_cd", "", "duprcDto", "Lcom/nic/mparivahan/VahanServices/DRcModle/DuprcDto;", "fir_dt", "fir_no", "hpaDto", "hptDto", "idv", "ins_from", "ins_type", "ins_upto", "msg", "nocDto", "off_cd", "op_dt", "police_station", "policy_no", "pur_cd", "rcp_dt", "rcpt_NO", "rcpt_amt", "reason", "regn_no", "state_cd", "state_header", "status", "tax_mode", "vh_class", "aadhaartxno", "(Ljava/lang/String;Ljava/lang/Object;ILcom/nic/mparivahan/VahanServices/DRcModle/DuprcDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getAadhaartxno", "()Ljava/lang/String;", "getAppl_no", "getChanngeOfAdressDto", "()Ljava/lang/Object;", "getComp_cd", "()I", "getDuprcDto", "()Lcom/nic/mparivahan/VahanServices/DRcModle/DuprcDto;", "getFir_dt", "getFir_no", "getHpaDto", "getHptDto", "getIdv", "getIns_from", "getIns_type", "getIns_upto", "getMsg", "getNocDto", "getOff_cd", "getOp_dt", "getPolice_station", "getPolicy_no", "getPur_cd", "getRcp_dt", "getRcpt_NO", "getRcpt_amt", "getReason", "getRegn_no", "getState_cd", "getState_header", "getStatus", "getTax_mode", "getVh_class", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class dulicateRcResponseModle implements Serializable {
    private final String aadhaartxno;
    private final String appl_no;
    private final Object channgeOfAdressDto;
    private final int comp_cd;
    private final DuprcDto duprcDto;
    private final String fir_dt;
    private final String fir_no;
    private final Object hpaDto;
    private final Object hptDto;
    private final int idv;
    private final String ins_from;
    private final int ins_type;
    private final String ins_upto;
    private final String msg;
    private final Object nocDto;
    private final String off_cd;
    private final String op_dt;
    private final String police_station;
    private final String policy_no;
    private final int pur_cd;
    private final String rcp_dt;
    private final String rcpt_NO;
    private final int rcpt_amt;
    private final String reason;
    private final String regn_no;
    private final String state_cd;
    private final String state_header;
    private final String status;
    private final String tax_mode;
    private final int vh_class;

    public dulicateRcResponseModle(String str, Object obj, int i, DuprcDto duprcDto, String str2, String str3, Object obj2, Object obj3, int i2, String str4, int i3, String str5, String str6, Object obj4, String str7, String str8, String str9, String str10, int i4, String str11, String str12, int i5, String str13, String str14, String str15, String str16, String str17, String str18, int i6, String str19) {
        this.appl_no = str;
        this.channgeOfAdressDto = obj;
        this.comp_cd = i;
        this.duprcDto = duprcDto;
        this.fir_dt = str2;
        this.fir_no = str3;
        this.hpaDto = obj2;
        this.hptDto = obj3;
        this.idv = i2;
        this.ins_from = str4;
        this.ins_type = i3;
        this.ins_upto = str5;
        this.msg = str6;
        this.nocDto = obj4;
        this.off_cd = str7;
        this.op_dt = str8;
        this.police_station = str9;
        this.policy_no = str10;
        this.pur_cd = i4;
        this.rcp_dt = str11;
        this.rcpt_NO = str12;
        this.rcpt_amt = i5;
        this.reason = str13;
        this.regn_no = str14;
        this.state_cd = str15;
        this.state_header = str16;
        this.status = str17;
        this.tax_mode = str18;
        this.vh_class = i6;
        this.aadhaartxno = str19;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppl_no() {
        return this.appl_no;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getIns_from() {
        return this.ins_from;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getIns_type() {
        return this.ins_type;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getIns_upto() {
        return this.ins_upto;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Object getNocDto() {
        return this.nocDto;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getOp_dt() {
        return this.op_dt;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getPolice_station() {
        return this.police_station;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getPolicy_no() {
        return this.policy_no;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getPur_cd() {
        return this.pur_cd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getChanngeOfAdressDto() {
        return this.channgeOfAdressDto;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getRcp_dt() {
        return this.rcp_dt;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getRcpt_NO() {
        return this.rcpt_NO;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getRcpt_amt() {
        return this.rcpt_amt;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getState_header() {
        return this.state_header;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getTax_mode() {
        return this.tax_mode;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final int getVh_class() {
        return this.vh_class;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getComp_cd() {
        return this.comp_cd;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getAadhaartxno() {
        return this.aadhaartxno;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DuprcDto getDuprcDto() {
        return this.duprcDto;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFir_dt() {
        return this.fir_dt;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFir_no() {
        return this.fir_no;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Object getHpaDto() {
        return this.hpaDto;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Object getHptDto() {
        return this.hptDto;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getIdv() {
        return this.idv;
    }

    public final dulicateRcResponseModle copy(String appl_no, Object channgeOfAdressDto, int comp_cd, DuprcDto duprcDto, String fir_dt, String fir_no, Object hpaDto, Object hptDto, int idv, String ins_from, int ins_type, String ins_upto, String msg, Object nocDto, String off_cd, String op_dt, String police_station, String policy_no, int pur_cd, String rcp_dt, String rcpt_NO, int rcpt_amt, String reason, String regn_no, String state_cd, String state_header, String status, String tax_mode, int vh_class, String aadhaartxno) {
        return new dulicateRcResponseModle(appl_no, channgeOfAdressDto, comp_cd, duprcDto, fir_dt, fir_no, hpaDto, hptDto, idv, ins_from, ins_type, ins_upto, msg, nocDto, off_cd, op_dt, police_station, policy_no, pur_cd, rcp_dt, rcpt_NO, rcpt_amt, reason, regn_no, state_cd, state_header, status, tax_mode, vh_class, aadhaartxno);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof dulicateRcResponseModle)) {
            return false;
        }
        dulicateRcResponseModle dulicatercresponsemodle = (dulicateRcResponseModle) other;
        return Intrinsics.areEqual(this.appl_no, dulicatercresponsemodle.appl_no) && Intrinsics.areEqual(this.channgeOfAdressDto, dulicatercresponsemodle.channgeOfAdressDto) && this.comp_cd == dulicatercresponsemodle.comp_cd && Intrinsics.areEqual(this.duprcDto, dulicatercresponsemodle.duprcDto) && Intrinsics.areEqual(this.fir_dt, dulicatercresponsemodle.fir_dt) && Intrinsics.areEqual(this.fir_no, dulicatercresponsemodle.fir_no) && Intrinsics.areEqual(this.hpaDto, dulicatercresponsemodle.hpaDto) && Intrinsics.areEqual(this.hptDto, dulicatercresponsemodle.hptDto) && this.idv == dulicatercresponsemodle.idv && Intrinsics.areEqual(this.ins_from, dulicatercresponsemodle.ins_from) && this.ins_type == dulicatercresponsemodle.ins_type && Intrinsics.areEqual(this.ins_upto, dulicatercresponsemodle.ins_upto) && Intrinsics.areEqual(this.msg, dulicatercresponsemodle.msg) && Intrinsics.areEqual(this.nocDto, dulicatercresponsemodle.nocDto) && Intrinsics.areEqual(this.off_cd, dulicatercresponsemodle.off_cd) && Intrinsics.areEqual(this.op_dt, dulicatercresponsemodle.op_dt) && Intrinsics.areEqual(this.police_station, dulicatercresponsemodle.police_station) && Intrinsics.areEqual(this.policy_no, dulicatercresponsemodle.policy_no) && this.pur_cd == dulicatercresponsemodle.pur_cd && Intrinsics.areEqual(this.rcp_dt, dulicatercresponsemodle.rcp_dt) && Intrinsics.areEqual(this.rcpt_NO, dulicatercresponsemodle.rcpt_NO) && this.rcpt_amt == dulicatercresponsemodle.rcpt_amt && Intrinsics.areEqual(this.reason, dulicatercresponsemodle.reason) && Intrinsics.areEqual(this.regn_no, dulicatercresponsemodle.regn_no) && Intrinsics.areEqual(this.state_cd, dulicatercresponsemodle.state_cd) && Intrinsics.areEqual(this.state_header, dulicatercresponsemodle.state_header) && Intrinsics.areEqual(this.status, dulicatercresponsemodle.status) && Intrinsics.areEqual(this.tax_mode, dulicatercresponsemodle.tax_mode) && this.vh_class == dulicatercresponsemodle.vh_class && Intrinsics.areEqual(this.aadhaartxno, dulicatercresponsemodle.aadhaartxno);
    }

    public final String getAadhaartxno() {
        return this.aadhaartxno;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final Object getChanngeOfAdressDto() {
        return this.channgeOfAdressDto;
    }

    public final int getComp_cd() {
        return this.comp_cd;
    }

    public final DuprcDto getDuprcDto() {
        return this.duprcDto;
    }

    public final String getFir_dt() {
        return this.fir_dt;
    }

    public final String getFir_no() {
        return this.fir_no;
    }

    public final Object getHpaDto() {
        return this.hpaDto;
    }

    public final Object getHptDto() {
        return this.hptDto;
    }

    public final int getIdv() {
        return this.idv;
    }

    public final String getIns_from() {
        return this.ins_from;
    }

    public final int getIns_type() {
        return this.ins_type;
    }

    public final String getIns_upto() {
        return this.ins_upto;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final Object getNocDto() {
        return this.nocDto;
    }

    public final String getOff_cd() {
        return this.off_cd;
    }

    public final String getOp_dt() {
        return this.op_dt;
    }

    public final String getPolice_station() {
        return this.police_station;
    }

    public final String getPolicy_no() {
        return this.policy_no;
    }

    public final int getPur_cd() {
        return this.pur_cd;
    }

    public final String getRcp_dt() {
        return this.rcp_dt;
    }

    public final String getRcpt_NO() {
        return this.rcpt_NO;
    }

    public final int getRcpt_amt() {
        return this.rcpt_amt;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final String getState_header() {
        return this.state_header;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTax_mode() {
        return this.tax_mode;
    }

    public final int getVh_class() {
        return this.vh_class;
    }

    public int hashCode() {
        String str = this.appl_no;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.channgeOfAdressDto;
        int iHashCode2 = (((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31) + Integer.hashCode(this.comp_cd)) * 31;
        DuprcDto duprcDto = this.duprcDto;
        int iHashCode3 = (iHashCode2 + (duprcDto == null ? 0 : duprcDto.hashCode())) * 31;
        String str2 = this.fir_dt;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fir_no;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Object obj2 = this.hpaDto;
        int iHashCode6 = (iHashCode5 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.hptDto;
        int iHashCode7 = (((iHashCode6 + (obj3 == null ? 0 : obj3.hashCode())) * 31) + Integer.hashCode(this.idv)) * 31;
        String str4 = this.ins_from;
        int iHashCode8 = (((iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.ins_type)) * 31;
        String str5 = this.ins_upto;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.msg;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Object obj4 = this.nocDto;
        int iHashCode11 = (iHashCode10 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        String str7 = this.off_cd;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.op_dt;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.police_station;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.policy_no;
        int iHashCode15 = (((iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31) + Integer.hashCode(this.pur_cd)) * 31;
        String str11 = this.rcp_dt;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.rcpt_NO;
        int iHashCode17 = (((iHashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31) + Integer.hashCode(this.rcpt_amt)) * 31;
        String str13 = this.reason;
        int iHashCode18 = (iHashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.regn_no;
        int iHashCode19 = (iHashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.state_cd;
        int iHashCode20 = (iHashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.state_header;
        int iHashCode21 = (iHashCode20 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.status;
        int iHashCode22 = (iHashCode21 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.tax_mode;
        int iHashCode23 = (((iHashCode22 + (str18 == null ? 0 : str18.hashCode())) * 31) + Integer.hashCode(this.vh_class)) * 31;
        String str19 = this.aadhaartxno;
        return iHashCode23 + (str19 != null ? str19.hashCode() : 0);
    }

    public String toString() {
        return "dulicateRcResponseModle(appl_no=" + this.appl_no + ", channgeOfAdressDto=" + this.channgeOfAdressDto + ", comp_cd=" + this.comp_cd + ", duprcDto=" + this.duprcDto + ", fir_dt=" + this.fir_dt + ", fir_no=" + this.fir_no + ", hpaDto=" + this.hpaDto + ", hptDto=" + this.hptDto + ", idv=" + this.idv + ", ins_from=" + this.ins_from + ", ins_type=" + this.ins_type + ", ins_upto=" + this.ins_upto + ", msg=" + this.msg + ", nocDto=" + this.nocDto + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", police_station=" + this.police_station + ", policy_no=" + this.policy_no + ", pur_cd=" + this.pur_cd + ", rcp_dt=" + this.rcp_dt + ", rcpt_NO=" + this.rcpt_NO + ", rcpt_amt=" + this.rcpt_amt + ", reason=" + this.reason + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", state_header=" + this.state_header + ", status=" + this.status + ", tax_mode=" + this.tax_mode + ", vh_class=" + this.vh_class + ", aadhaartxno=" + this.aadhaartxno + ')';
    }
}
