package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\bI\b\u0087\b\u0018\u00002\u00020\u0001Bõ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0001\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0001\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0007\u0012\u0006\u0010#\u001a\u00020$¢\u0006\u0002\u0010%J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0001HÆ\u0003J\t\u0010L\u001a\u00020\u0007HÆ\u0003J\t\u0010M\u001a\u00020\u0001HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0001HÆ\u0003J\t\u0010P\u001a\u00020\u0007HÆ\u0003J\t\u0010Q\u001a\u00020\u0001HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0007HÆ\u0003J\t\u0010U\u001a\u00020\u0005HÆ\u0003J\t\u0010V\u001a\u00020\u0001HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u001bHÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0007HÆ\u0003J\t\u0010`\u001a\u00020\u0007HÆ\u0003J\t\u0010a\u001a\u00020$HÆ\u0003J\t\u0010b\u001a\u00020\u0001HÆ\u0003J\t\u0010c\u001a\u00020\u0001HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u0001HÆ\u0003J\t\u0010f\u001a\u00020\u0001HÆ\u0003J\t\u0010g\u001a\u00020\u0007HÆ\u0003Jµ\u0002\u0010h\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020$HÆ\u0001J\u0013\u0010i\u001a\u00020$2\b\u0010j\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010k\u001a\u00020\u0007HÖ\u0001J\t\u0010l\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\t\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010'R\u0011\u0010\u000b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b2\u0010/R\u0011\u0010\f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b3\u0010/R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b4\u0010-R\u0011\u0010\u000e\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b5\u0010/R\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b6\u0010-R\u0011\u0010\u0010\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b7\u0010/R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010'R\u0011\u0010\u0012\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b9\u0010/R\u0011\u0010\u0013\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b:\u0010-R\u0011\u0010\u0014\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b;\u0010/R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010'R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010'R\u0011\u0010\u0017\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b>\u0010-R\u0011\u0010\u0018\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b?\u0010/R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010'R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010'R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010'R\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010'R\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010'R\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010'R\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010'R\u0011\u0010\"\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bI\u0010-¨\u0006m"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/FinalRequestSubmitResponse;", "", "appl_no", "", "channgeOfAdressDto", "Lcom/nic/mparivahan/VahanServices/VahanModel/ChanngeOfAdressDto;", "comp_cd", "", "durcdto", "fir_dt", "fir_no", "hpaDto", "hptDto", "idv", "ins_from", "ins_type", "ins_upto", "msg", "nocDto", "off_cd", "op_dt", "police_station", "policy_no", "pur_cd", "rcp_dt", "rcpt_NO", "rcpt_amt", "", "reason", "regn_no", "state_cd", "state_header", "status", "tax_mode", "vh_class", "application_status", "", "(Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanModel/ChanngeOfAdressDto;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "getAppl_no", "()Ljava/lang/String;", "getApplication_status", "()Z", "getChanngeOfAdressDto", "()Lcom/nic/mparivahan/VahanServices/VahanModel/ChanngeOfAdressDto;", "getComp_cd", "()I", "getDurcdto", "()Ljava/lang/Object;", "getFir_dt", "getFir_no", "getHpaDto", "getHptDto", "getIdv", "getIns_from", "getIns_type", "getIns_upto", "getMsg", "getNocDto", "getOff_cd", "getOp_dt", "getPolice_station", "getPolicy_no", "getPur_cd", "getRcp_dt", "getRcpt_NO", "getRcpt_amt", "()D", "getReason", "getRegn_no", "getState_cd", "getState_header", "getStatus", "getTax_mode", "getVh_class", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FinalRequestSubmitResponse {
    private final String appl_no;
    private final boolean application_status;
    private final ChanngeOfAdressDto channgeOfAdressDto;
    private final int comp_cd;
    private final Object durcdto;
    private final Object fir_dt;
    private final String fir_no;
    private final Object hpaDto;
    private final Object hptDto;
    private final int idv;
    private final Object ins_from;
    private final int ins_type;
    private final Object ins_upto;
    private final String msg;
    private final Object nocDto;
    private final int off_cd;
    private final Object op_dt;
    private final String police_station;
    private final String policy_no;
    private final int pur_cd;
    private final Object rcp_dt;
    private final String rcpt_NO;
    private final double rcpt_amt;
    private final String reason;
    private final String regn_no;
    private final String state_cd;
    private final String state_header;
    private final String status;
    private final String tax_mode;
    private final int vh_class;

    public FinalRequestSubmitResponse(String appl_no, ChanngeOfAdressDto channgeOfAdressDto, int i, Object durcdto, Object fir_dt, String fir_no, Object hpaDto, Object hptDto, int i2, Object ins_from, int i3, Object ins_upto, String msg, Object nocDto, int i4, Object op_dt, String police_station, String policy_no, int i5, Object rcp_dt, String rcpt_NO, double d, String reason, String regn_no, String state_cd, String state_header, String status, String tax_mode, int i6, boolean z) {
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(channgeOfAdressDto, "channgeOfAdressDto");
        Intrinsics.checkNotNullParameter(durcdto, "durcdto");
        Intrinsics.checkNotNullParameter(fir_dt, "fir_dt");
        Intrinsics.checkNotNullParameter(fir_no, "fir_no");
        Intrinsics.checkNotNullParameter(hpaDto, "hpaDto");
        Intrinsics.checkNotNullParameter(hptDto, "hptDto");
        Intrinsics.checkNotNullParameter(ins_from, "ins_from");
        Intrinsics.checkNotNullParameter(ins_upto, "ins_upto");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(nocDto, "nocDto");
        Intrinsics.checkNotNullParameter(op_dt, "op_dt");
        Intrinsics.checkNotNullParameter(police_station, "police_station");
        Intrinsics.checkNotNullParameter(policy_no, "policy_no");
        Intrinsics.checkNotNullParameter(rcp_dt, "rcp_dt");
        Intrinsics.checkNotNullParameter(rcpt_NO, "rcpt_NO");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(state_header, "state_header");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(tax_mode, "tax_mode");
        this.appl_no = appl_no;
        this.channgeOfAdressDto = channgeOfAdressDto;
        this.comp_cd = i;
        this.durcdto = durcdto;
        this.fir_dt = fir_dt;
        this.fir_no = fir_no;
        this.hpaDto = hpaDto;
        this.hptDto = hptDto;
        this.idv = i2;
        this.ins_from = ins_from;
        this.ins_type = i3;
        this.ins_upto = ins_upto;
        this.msg = msg;
        this.nocDto = nocDto;
        this.off_cd = i4;
        this.op_dt = op_dt;
        this.police_station = police_station;
        this.policy_no = policy_no;
        this.pur_cd = i5;
        this.rcp_dt = rcp_dt;
        this.rcpt_NO = rcpt_NO;
        this.rcpt_amt = d;
        this.reason = reason;
        this.regn_no = regn_no;
        this.state_cd = state_cd;
        this.state_header = state_header;
        this.status = status;
        this.tax_mode = tax_mode;
        this.vh_class = i6;
        this.application_status = z;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppl_no() {
        return this.appl_no;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Object getIns_from() {
        return this.ins_from;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getIns_type() {
        return this.ins_type;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Object getIns_upto() {
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
    public final int getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Object getOp_dt() {
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
    public final ChanngeOfAdressDto getChanngeOfAdressDto() {
        return this.channgeOfAdressDto;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Object getRcp_dt() {
        return this.rcp_dt;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getRcpt_NO() {
        return this.rcpt_NO;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final double getRcpt_amt() {
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
    public final boolean getApplication_status() {
        return this.application_status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Object getDurcdto() {
        return this.durcdto;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Object getFir_dt() {
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

    public final FinalRequestSubmitResponse copy(String appl_no, ChanngeOfAdressDto channgeOfAdressDto, int comp_cd, Object durcdto, Object fir_dt, String fir_no, Object hpaDto, Object hptDto, int idv, Object ins_from, int ins_type, Object ins_upto, String msg, Object nocDto, int off_cd, Object op_dt, String police_station, String policy_no, int pur_cd, Object rcp_dt, String rcpt_NO, double rcpt_amt, String reason, String regn_no, String state_cd, String state_header, String status, String tax_mode, int vh_class, boolean application_status) {
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(channgeOfAdressDto, "channgeOfAdressDto");
        Intrinsics.checkNotNullParameter(durcdto, "durcdto");
        Intrinsics.checkNotNullParameter(fir_dt, "fir_dt");
        Intrinsics.checkNotNullParameter(fir_no, "fir_no");
        Intrinsics.checkNotNullParameter(hpaDto, "hpaDto");
        Intrinsics.checkNotNullParameter(hptDto, "hptDto");
        Intrinsics.checkNotNullParameter(ins_from, "ins_from");
        Intrinsics.checkNotNullParameter(ins_upto, "ins_upto");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(nocDto, "nocDto");
        Intrinsics.checkNotNullParameter(op_dt, "op_dt");
        Intrinsics.checkNotNullParameter(police_station, "police_station");
        Intrinsics.checkNotNullParameter(policy_no, "policy_no");
        Intrinsics.checkNotNullParameter(rcp_dt, "rcp_dt");
        Intrinsics.checkNotNullParameter(rcpt_NO, "rcpt_NO");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(state_header, "state_header");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(tax_mode, "tax_mode");
        return new FinalRequestSubmitResponse(appl_no, channgeOfAdressDto, comp_cd, durcdto, fir_dt, fir_no, hpaDto, hptDto, idv, ins_from, ins_type, ins_upto, msg, nocDto, off_cd, op_dt, police_station, policy_no, pur_cd, rcp_dt, rcpt_NO, rcpt_amt, reason, regn_no, state_cd, state_header, status, tax_mode, vh_class, application_status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinalRequestSubmitResponse)) {
            return false;
        }
        FinalRequestSubmitResponse finalRequestSubmitResponse = (FinalRequestSubmitResponse) other;
        return Intrinsics.areEqual(this.appl_no, finalRequestSubmitResponse.appl_no) && Intrinsics.areEqual(this.channgeOfAdressDto, finalRequestSubmitResponse.channgeOfAdressDto) && this.comp_cd == finalRequestSubmitResponse.comp_cd && Intrinsics.areEqual(this.durcdto, finalRequestSubmitResponse.durcdto) && Intrinsics.areEqual(this.fir_dt, finalRequestSubmitResponse.fir_dt) && Intrinsics.areEqual(this.fir_no, finalRequestSubmitResponse.fir_no) && Intrinsics.areEqual(this.hpaDto, finalRequestSubmitResponse.hpaDto) && Intrinsics.areEqual(this.hptDto, finalRequestSubmitResponse.hptDto) && this.idv == finalRequestSubmitResponse.idv && Intrinsics.areEqual(this.ins_from, finalRequestSubmitResponse.ins_from) && this.ins_type == finalRequestSubmitResponse.ins_type && Intrinsics.areEqual(this.ins_upto, finalRequestSubmitResponse.ins_upto) && Intrinsics.areEqual(this.msg, finalRequestSubmitResponse.msg) && Intrinsics.areEqual(this.nocDto, finalRequestSubmitResponse.nocDto) && this.off_cd == finalRequestSubmitResponse.off_cd && Intrinsics.areEqual(this.op_dt, finalRequestSubmitResponse.op_dt) && Intrinsics.areEqual(this.police_station, finalRequestSubmitResponse.police_station) && Intrinsics.areEqual(this.policy_no, finalRequestSubmitResponse.policy_no) && this.pur_cd == finalRequestSubmitResponse.pur_cd && Intrinsics.areEqual(this.rcp_dt, finalRequestSubmitResponse.rcp_dt) && Intrinsics.areEqual(this.rcpt_NO, finalRequestSubmitResponse.rcpt_NO) && Double.compare(this.rcpt_amt, finalRequestSubmitResponse.rcpt_amt) == 0 && Intrinsics.areEqual(this.reason, finalRequestSubmitResponse.reason) && Intrinsics.areEqual(this.regn_no, finalRequestSubmitResponse.regn_no) && Intrinsics.areEqual(this.state_cd, finalRequestSubmitResponse.state_cd) && Intrinsics.areEqual(this.state_header, finalRequestSubmitResponse.state_header) && Intrinsics.areEqual(this.status, finalRequestSubmitResponse.status) && Intrinsics.areEqual(this.tax_mode, finalRequestSubmitResponse.tax_mode) && this.vh_class == finalRequestSubmitResponse.vh_class && this.application_status == finalRequestSubmitResponse.application_status;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final boolean getApplication_status() {
        return this.application_status;
    }

    public final ChanngeOfAdressDto getChanngeOfAdressDto() {
        return this.channgeOfAdressDto;
    }

    public final int getComp_cd() {
        return this.comp_cd;
    }

    public final Object getDurcdto() {
        return this.durcdto;
    }

    public final Object getFir_dt() {
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

    public final Object getIns_from() {
        return this.ins_from;
    }

    public final int getIns_type() {
        return this.ins_type;
    }

    public final Object getIns_upto() {
        return this.ins_upto;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final Object getNocDto() {
        return this.nocDto;
    }

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final Object getOp_dt() {
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

    public final Object getRcp_dt() {
        return this.rcp_dt;
    }

    public final String getRcpt_NO() {
        return this.rcpt_NO;
    }

    public final double getRcpt_amt() {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v57, types: [int] */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v59 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.appl_no.hashCode() * 31) + this.channgeOfAdressDto.hashCode()) * 31) + Integer.hashCode(this.comp_cd)) * 31) + this.durcdto.hashCode()) * 31) + this.fir_dt.hashCode()) * 31) + this.fir_no.hashCode()) * 31) + this.hpaDto.hashCode()) * 31) + this.hptDto.hashCode()) * 31) + Integer.hashCode(this.idv)) * 31) + this.ins_from.hashCode()) * 31) + Integer.hashCode(this.ins_type)) * 31) + this.ins_upto.hashCode()) * 31) + this.msg.hashCode()) * 31) + this.nocDto.hashCode()) * 31) + Integer.hashCode(this.off_cd)) * 31) + this.op_dt.hashCode()) * 31) + this.police_station.hashCode()) * 31) + this.policy_no.hashCode()) * 31) + Integer.hashCode(this.pur_cd)) * 31) + this.rcp_dt.hashCode()) * 31) + this.rcpt_NO.hashCode()) * 31) + Double.hashCode(this.rcpt_amt)) * 31) + this.reason.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.state_header.hashCode()) * 31) + this.status.hashCode()) * 31) + this.tax_mode.hashCode()) * 31) + Integer.hashCode(this.vh_class)) * 31;
        boolean z = this.application_status;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public String toString() {
        return "FinalRequestSubmitResponse(appl_no=" + this.appl_no + ", channgeOfAdressDto=" + this.channgeOfAdressDto + ", comp_cd=" + this.comp_cd + ", durcdto=" + this.durcdto + ", fir_dt=" + this.fir_dt + ", fir_no=" + this.fir_no + ", hpaDto=" + this.hpaDto + ", hptDto=" + this.hptDto + ", idv=" + this.idv + ", ins_from=" + this.ins_from + ", ins_type=" + this.ins_type + ", ins_upto=" + this.ins_upto + ", msg=" + this.msg + ", nocDto=" + this.nocDto + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", police_station=" + this.police_station + ", policy_no=" + this.policy_no + ", pur_cd=" + this.pur_cd + ", rcp_dt=" + this.rcp_dt + ", rcpt_NO=" + this.rcpt_NO + ", rcpt_amt=" + this.rcpt_amt + ", reason=" + this.reason + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", state_header=" + this.state_header + ", status=" + this.status + ", tax_mode=" + this.tax_mode + ", vh_class=" + this.vh_class + ", application_status=" + this.application_status + ')';
    }
}
