package com.nic.mparivahan.VahanServices.VahanPaymentModel;

import androidx.annotation.Keep;
import com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle;
import com.nic.mparivahan.VahanServices.HPA.HPAResModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptTerResponse;
import com.nic.mparivahan.VahanServices.VahanModel.ChaangeOfAddressStatus;
import com.nic.mparivahan.VahanServices.VahanModel.NocDraftResponse;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bX\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\b\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010'J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\bHÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\bHÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\bHÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010MJ\t\u0010g\u001a\u00020\bHÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0010HÆ\u0003JÆ\u0002\u0010m\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010nJ\u0013\u0010o\u001a\u00020p2\b\u0010q\u001a\u0004\u0018\u00010rHÖ\u0003J\t\u0010s\u001a\u00020\bHÖ\u0001J\t\u0010t\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010)R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010)R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b7\u0010.R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010)R\u0011\u0010\u0013\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b9\u0010.R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010)R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010)R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010)R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010)R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010)R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010)R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010)R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010)R\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010)R\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010)R\u0011\u0010 \u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bF\u0010.R\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010)R\u0011\u0010\"\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010)R\u0011\u0010#\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010)R\u0011\u0010$\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010)R\u0011\u0010%\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u0010)R\u0015\u0010&\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010N\u001a\u0004\bL\u0010M¨\u0006u"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequestfinal;", "Ljava/io/Serializable;", "aadharauth", "", "appl_no", "channgeOfAdressDto", "Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;", "comp_cd", "", "durcdto", "Lcom/nic/mparivahan/VahanServices/DRcModle/dulicateRcResponseModle;", "fir_dt", "fir_no", "hpaDto", "Lcom/nic/mparivahan/VahanServices/HPA/HPAResModle;", "hptDto", "Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptTerResponse;", "idv", "ins_from", "ins_type", "ins_upto", "msg", "nocDto", "Lcom/nic/mparivahan/VahanServices/VahanModel/NocDraftResponse;", "off_cd", "op_dt", "police_station", "policy_no", "pur_cd", "rcp_dt", "rcpt_NO", "rcpt_amt", "reason", "regn_no", "state_cd", "state_header", "status", "tax_mode", "vh_class", "(Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;ILcom/nic/mparivahan/VahanServices/DRcModle/dulicateRcResponseModle;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/HPA/HPAResModle;Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptTerResponse;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanModel/NocDraftResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getAadharauth", "()Ljava/lang/String;", "getAppl_no", "getChanngeOfAdressDto", "()Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;", "getComp_cd", "()I", "getDurcdto", "()Lcom/nic/mparivahan/VahanServices/DRcModle/dulicateRcResponseModle;", "getFir_dt", "getFir_no", "getHpaDto", "()Lcom/nic/mparivahan/VahanServices/HPA/HPAResModle;", "getHptDto", "()Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptTerResponse;", "getIdv", "getIns_from", "getIns_type", "getIns_upto", "getMsg", "getNocDto", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NocDraftResponse;", "getOff_cd", "getOp_dt", "getPolice_station", "getPolicy_no", "getPur_cd", "getRcp_dt", "getRcpt_NO", "getRcpt_amt", "getReason", "getRegn_no", "getState_cd", "getState_header", "getStatus", "getTax_mode", "getVh_class", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanModel/ChaangeOfAddressStatus;ILcom/nic/mparivahan/VahanServices/DRcModle/dulicateRcResponseModle;Ljava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/HPA/HPAResModle;Lcom/nic/mparivahan/VahanServices/HPTModel/HTPModel/HptTerResponse;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/nic/mparivahan/VahanServices/VahanModel/NocDraftResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequestfinal;", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BeforePaymentRequestfinal implements Serializable {
    private final String aadharauth;
    private final String appl_no;
    private final ChaangeOfAddressStatus channgeOfAdressDto;
    private final int comp_cd;
    private final dulicateRcResponseModle durcdto;
    private final String fir_dt;
    private final String fir_no;
    private final HPAResModle hpaDto;
    private final HptTerResponse hptDto;
    private final int idv;
    private final String ins_from;
    private final int ins_type;
    private final String ins_upto;
    private final String msg;
    private final NocDraftResponse nocDto;
    private final String off_cd;
    private final String op_dt;
    private final String police_station;
    private final String policy_no;
    private final String pur_cd;
    private final String rcp_dt;
    private final String rcpt_NO;
    private final String rcpt_amt;
    private final int reason;
    private final String regn_no;
    private final String state_cd;
    private final String state_header;
    private final String status;
    private final String tax_mode;
    private final Integer vh_class;

    public BeforePaymentRequestfinal(String aadharauth, String appl_no, ChaangeOfAddressStatus chaangeOfAddressStatus, int i, dulicateRcResponseModle dulicatercresponsemodle, String fir_dt, String fir_no, HPAResModle hPAResModle, HptTerResponse hptTerResponse, int i2, String ins_from, int i3, String ins_upto, String msg, NocDraftResponse nocDraftResponse, String off_cd, String op_dt, String police_station, String policy_no, String pur_cd, String rcp_dt, String rcpt_NO, String rcpt_amt, int i4, String regn_no, String state_cd, String state_header, String status, String tax_mode, Integer num) {
        Intrinsics.checkNotNullParameter(aadharauth, "aadharauth");
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(fir_dt, "fir_dt");
        Intrinsics.checkNotNullParameter(fir_no, "fir_no");
        Intrinsics.checkNotNullParameter(ins_from, "ins_from");
        Intrinsics.checkNotNullParameter(ins_upto, "ins_upto");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(off_cd, "off_cd");
        Intrinsics.checkNotNullParameter(op_dt, "op_dt");
        Intrinsics.checkNotNullParameter(police_station, "police_station");
        Intrinsics.checkNotNullParameter(policy_no, "policy_no");
        Intrinsics.checkNotNullParameter(pur_cd, "pur_cd");
        Intrinsics.checkNotNullParameter(rcp_dt, "rcp_dt");
        Intrinsics.checkNotNullParameter(rcpt_NO, "rcpt_NO");
        Intrinsics.checkNotNullParameter(rcpt_amt, "rcpt_amt");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(state_header, "state_header");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(tax_mode, "tax_mode");
        this.aadharauth = aadharauth;
        this.appl_no = appl_no;
        this.channgeOfAdressDto = chaangeOfAddressStatus;
        this.comp_cd = i;
        this.durcdto = dulicatercresponsemodle;
        this.fir_dt = fir_dt;
        this.fir_no = fir_no;
        this.hpaDto = hPAResModle;
        this.hptDto = hptTerResponse;
        this.idv = i2;
        this.ins_from = ins_from;
        this.ins_type = i3;
        this.ins_upto = ins_upto;
        this.msg = msg;
        this.nocDto = nocDraftResponse;
        this.off_cd = off_cd;
        this.op_dt = op_dt;
        this.police_station = police_station;
        this.policy_no = policy_no;
        this.pur_cd = pur_cd;
        this.rcp_dt = rcp_dt;
        this.rcpt_NO = rcpt_NO;
        this.rcpt_amt = rcpt_amt;
        this.reason = i4;
        this.regn_no = regn_no;
        this.state_cd = state_cd;
        this.state_header = state_header;
        this.status = status;
        this.tax_mode = tax_mode;
        this.vh_class = num;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAadharauth() {
        return this.aadharauth;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getIdv() {
        return this.idv;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getIns_from() {
        return this.ins_from;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getIns_type() {
        return this.ins_type;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getIns_upto() {
        return this.ins_upto;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final NocDraftResponse getNocDto() {
        return this.nocDto;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getOp_dt() {
        return this.op_dt;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getPolice_station() {
        return this.police_station;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getPolicy_no() {
        return this.policy_no;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppl_no() {
        return this.appl_no;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getPur_cd() {
        return this.pur_cd;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getRcp_dt() {
        return this.rcp_dt;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getRcpt_NO() {
        return this.rcpt_NO;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getRcpt_amt() {
        return this.rcpt_amt;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final int getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getState_header() {
        return this.state_header;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getTax_mode() {
        return this.tax_mode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ChaangeOfAddressStatus getChanngeOfAdressDto() {
        return this.channgeOfAdressDto;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Integer getVh_class() {
        return this.vh_class;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getComp_cd() {
        return this.comp_cd;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final dulicateRcResponseModle getDurcdto() {
        return this.durcdto;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFir_dt() {
        return this.fir_dt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFir_no() {
        return this.fir_no;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final HPAResModle getHpaDto() {
        return this.hpaDto;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final HptTerResponse getHptDto() {
        return this.hptDto;
    }

    public final BeforePaymentRequestfinal copy(String aadharauth, String appl_no, ChaangeOfAddressStatus channgeOfAdressDto, int comp_cd, dulicateRcResponseModle durcdto, String fir_dt, String fir_no, HPAResModle hpaDto, HptTerResponse hptDto, int idv, String ins_from, int ins_type, String ins_upto, String msg, NocDraftResponse nocDto, String off_cd, String op_dt, String police_station, String policy_no, String pur_cd, String rcp_dt, String rcpt_NO, String rcpt_amt, int reason, String regn_no, String state_cd, String state_header, String status, String tax_mode, Integer vh_class) {
        Intrinsics.checkNotNullParameter(aadharauth, "aadharauth");
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(fir_dt, "fir_dt");
        Intrinsics.checkNotNullParameter(fir_no, "fir_no");
        Intrinsics.checkNotNullParameter(ins_from, "ins_from");
        Intrinsics.checkNotNullParameter(ins_upto, "ins_upto");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(off_cd, "off_cd");
        Intrinsics.checkNotNullParameter(op_dt, "op_dt");
        Intrinsics.checkNotNullParameter(police_station, "police_station");
        Intrinsics.checkNotNullParameter(policy_no, "policy_no");
        Intrinsics.checkNotNullParameter(pur_cd, "pur_cd");
        Intrinsics.checkNotNullParameter(rcp_dt, "rcp_dt");
        Intrinsics.checkNotNullParameter(rcpt_NO, "rcpt_NO");
        Intrinsics.checkNotNullParameter(rcpt_amt, "rcpt_amt");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(state_header, "state_header");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(tax_mode, "tax_mode");
        return new BeforePaymentRequestfinal(aadharauth, appl_no, channgeOfAdressDto, comp_cd, durcdto, fir_dt, fir_no, hpaDto, hptDto, idv, ins_from, ins_type, ins_upto, msg, nocDto, off_cd, op_dt, police_station, policy_no, pur_cd, rcp_dt, rcpt_NO, rcpt_amt, reason, regn_no, state_cd, state_header, status, tax_mode, vh_class);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeforePaymentRequestfinal)) {
            return false;
        }
        BeforePaymentRequestfinal beforePaymentRequestfinal = (BeforePaymentRequestfinal) other;
        return Intrinsics.areEqual(this.aadharauth, beforePaymentRequestfinal.aadharauth) && Intrinsics.areEqual(this.appl_no, beforePaymentRequestfinal.appl_no) && Intrinsics.areEqual(this.channgeOfAdressDto, beforePaymentRequestfinal.channgeOfAdressDto) && this.comp_cd == beforePaymentRequestfinal.comp_cd && Intrinsics.areEqual(this.durcdto, beforePaymentRequestfinal.durcdto) && Intrinsics.areEqual(this.fir_dt, beforePaymentRequestfinal.fir_dt) && Intrinsics.areEqual(this.fir_no, beforePaymentRequestfinal.fir_no) && Intrinsics.areEqual(this.hpaDto, beforePaymentRequestfinal.hpaDto) && Intrinsics.areEqual(this.hptDto, beforePaymentRequestfinal.hptDto) && this.idv == beforePaymentRequestfinal.idv && Intrinsics.areEqual(this.ins_from, beforePaymentRequestfinal.ins_from) && this.ins_type == beforePaymentRequestfinal.ins_type && Intrinsics.areEqual(this.ins_upto, beforePaymentRequestfinal.ins_upto) && Intrinsics.areEqual(this.msg, beforePaymentRequestfinal.msg) && Intrinsics.areEqual(this.nocDto, beforePaymentRequestfinal.nocDto) && Intrinsics.areEqual(this.off_cd, beforePaymentRequestfinal.off_cd) && Intrinsics.areEqual(this.op_dt, beforePaymentRequestfinal.op_dt) && Intrinsics.areEqual(this.police_station, beforePaymentRequestfinal.police_station) && Intrinsics.areEqual(this.policy_no, beforePaymentRequestfinal.policy_no) && Intrinsics.areEqual(this.pur_cd, beforePaymentRequestfinal.pur_cd) && Intrinsics.areEqual(this.rcp_dt, beforePaymentRequestfinal.rcp_dt) && Intrinsics.areEqual(this.rcpt_NO, beforePaymentRequestfinal.rcpt_NO) && Intrinsics.areEqual(this.rcpt_amt, beforePaymentRequestfinal.rcpt_amt) && this.reason == beforePaymentRequestfinal.reason && Intrinsics.areEqual(this.regn_no, beforePaymentRequestfinal.regn_no) && Intrinsics.areEqual(this.state_cd, beforePaymentRequestfinal.state_cd) && Intrinsics.areEqual(this.state_header, beforePaymentRequestfinal.state_header) && Intrinsics.areEqual(this.status, beforePaymentRequestfinal.status) && Intrinsics.areEqual(this.tax_mode, beforePaymentRequestfinal.tax_mode) && Intrinsics.areEqual(this.vh_class, beforePaymentRequestfinal.vh_class);
    }

    public final String getAadharauth() {
        return this.aadharauth;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final ChaangeOfAddressStatus getChanngeOfAdressDto() {
        return this.channgeOfAdressDto;
    }

    public final int getComp_cd() {
        return this.comp_cd;
    }

    public final dulicateRcResponseModle getDurcdto() {
        return this.durcdto;
    }

    public final String getFir_dt() {
        return this.fir_dt;
    }

    public final String getFir_no() {
        return this.fir_no;
    }

    public final HPAResModle getHpaDto() {
        return this.hpaDto;
    }

    public final HptTerResponse getHptDto() {
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

    public final NocDraftResponse getNocDto() {
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

    public final String getPur_cd() {
        return this.pur_cd;
    }

    public final String getRcp_dt() {
        return this.rcp_dt;
    }

    public final String getRcpt_NO() {
        return this.rcpt_NO;
    }

    public final String getRcpt_amt() {
        return this.rcpt_amt;
    }

    public final int getReason() {
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

    public final Integer getVh_class() {
        return this.vh_class;
    }

    public int hashCode() {
        int iHashCode = ((this.aadharauth.hashCode() * 31) + this.appl_no.hashCode()) * 31;
        ChaangeOfAddressStatus chaangeOfAddressStatus = this.channgeOfAdressDto;
        int iHashCode2 = (((iHashCode + (chaangeOfAddressStatus == null ? 0 : chaangeOfAddressStatus.hashCode())) * 31) + Integer.hashCode(this.comp_cd)) * 31;
        dulicateRcResponseModle dulicatercresponsemodle = this.durcdto;
        int iHashCode3 = (((((iHashCode2 + (dulicatercresponsemodle == null ? 0 : dulicatercresponsemodle.hashCode())) * 31) + this.fir_dt.hashCode()) * 31) + this.fir_no.hashCode()) * 31;
        HPAResModle hPAResModle = this.hpaDto;
        int iHashCode4 = (iHashCode3 + (hPAResModle == null ? 0 : hPAResModle.hashCode())) * 31;
        HptTerResponse hptTerResponse = this.hptDto;
        int iHashCode5 = (((((((((((iHashCode4 + (hptTerResponse == null ? 0 : hptTerResponse.hashCode())) * 31) + Integer.hashCode(this.idv)) * 31) + this.ins_from.hashCode()) * 31) + Integer.hashCode(this.ins_type)) * 31) + this.ins_upto.hashCode()) * 31) + this.msg.hashCode()) * 31;
        NocDraftResponse nocDraftResponse = this.nocDto;
        int iHashCode6 = (((((((((((((((((((((((((((((iHashCode5 + (nocDraftResponse == null ? 0 : nocDraftResponse.hashCode())) * 31) + this.off_cd.hashCode()) * 31) + this.op_dt.hashCode()) * 31) + this.police_station.hashCode()) * 31) + this.policy_no.hashCode()) * 31) + this.pur_cd.hashCode()) * 31) + this.rcp_dt.hashCode()) * 31) + this.rcpt_NO.hashCode()) * 31) + this.rcpt_amt.hashCode()) * 31) + Integer.hashCode(this.reason)) * 31) + this.regn_no.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.state_header.hashCode()) * 31) + this.status.hashCode()) * 31) + this.tax_mode.hashCode()) * 31;
        Integer num = this.vh_class;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "BeforePaymentRequestfinal(aadharauth=" + this.aadharauth + ", appl_no=" + this.appl_no + ", channgeOfAdressDto=" + this.channgeOfAdressDto + ", comp_cd=" + this.comp_cd + ", durcdto=" + this.durcdto + ", fir_dt=" + this.fir_dt + ", fir_no=" + this.fir_no + ", hpaDto=" + this.hpaDto + ", hptDto=" + this.hptDto + ", idv=" + this.idv + ", ins_from=" + this.ins_from + ", ins_type=" + this.ins_type + ", ins_upto=" + this.ins_upto + ", msg=" + this.msg + ", nocDto=" + this.nocDto + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", police_station=" + this.police_station + ", policy_no=" + this.policy_no + ", pur_cd=" + this.pur_cd + ", rcp_dt=" + this.rcp_dt + ", rcpt_NO=" + this.rcpt_NO + ", rcpt_amt=" + this.rcpt_amt + ", reason=" + this.reason + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", state_header=" + this.state_header + ", status=" + this.status + ", tax_mode=" + this.tax_mode + ", vh_class=" + this.vh_class + ')';
    }
}
