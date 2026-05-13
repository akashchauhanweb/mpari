package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\bg\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BÍ\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012\u0006\u0010\n\u001a\u00020\u0001\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0001\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u0001\u0012\u0006\u0010\u0012\u001a\u00020\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0001\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0001\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0001\u0012\u0006\u0010\u001b\u001a\u00020\u0001\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020\u001e\u0012\u0006\u0010#\u001a\u00020\u0001\u0012\u0006\u0010$\u001a\u00020\u0005\u0012\u0006\u0010%\u001a\u00020\u0005\u0012\u0006\u0010&\u001a\u00020\u0005\u0012\u0006\u0010'\u001a\u00020\u0001\u0012\u0006\u0010(\u001a\u00020\u0005\u0012\u0006\u0010)\u001a\u00020\u0005\u0012\u0006\u0010*\u001a\u00020\u0005\u0012\u0006\u0010+\u001a\u00020\u0005\u0012\u0006\u0010,\u001a\u00020\u0001\u0012\u0006\u0010-\u001a\u00020\u0001\u0012\u0006\u0010.\u001a\u00020\u0005¢\u0006\u0002\u0010/J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0001HÆ\u0003J\t\u0010`\u001a\u00020\u0001HÆ\u0003J\t\u0010a\u001a\u00020\u0001HÆ\u0003J\t\u0010b\u001a\u00020\u0001HÆ\u0003J\t\u0010c\u001a\u00020\u0001HÆ\u0003J\t\u0010d\u001a\u00020\u0001HÆ\u0003J\t\u0010e\u001a\u00020\u0001HÆ\u0003J\t\u0010f\u001a\u00020\u0001HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\t\u0010h\u001a\u00020\u0005HÆ\u0003J\t\u0010i\u001a\u00020\u0005HÆ\u0003J\t\u0010j\u001a\u00020\u0001HÆ\u0003J\t\u0010k\u001a\u00020\u0005HÆ\u0003J\t\u0010l\u001a\u00020\u0005HÆ\u0003J\t\u0010m\u001a\u00020\u0001HÆ\u0003J\t\u0010n\u001a\u00020\u0001HÆ\u0003J\t\u0010o\u001a\u00020\u0003HÆ\u0003J\t\u0010p\u001a\u00020\u001eHÆ\u0003J\t\u0010q\u001a\u00020\u0005HÆ\u0003J\t\u0010r\u001a\u00020!HÆ\u0003J\t\u0010s\u001a\u00020\u001eHÆ\u0003J\t\u0010t\u001a\u00020\u0001HÆ\u0003J\t\u0010u\u001a\u00020\u0001HÆ\u0003J\t\u0010v\u001a\u00020\u0005HÆ\u0003J\t\u0010w\u001a\u00020\u0005HÆ\u0003J\t\u0010x\u001a\u00020\u0005HÆ\u0003J\t\u0010y\u001a\u00020\u0001HÆ\u0003J\t\u0010z\u001a\u00020\u0005HÆ\u0003J\t\u0010{\u001a\u00020\u0005HÆ\u0003J\t\u0010|\u001a\u00020\u0005HÆ\u0003J\t\u0010}\u001a\u00020\u0005HÆ\u0003J\t\u0010~\u001a\u00020\u0001HÆ\u0003J\t\u0010\u007f\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0003HÆ\u0003J¤\u0003\u0010\u0087\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u001e2\b\b\u0002\u0010#\u001a\u00020\u00012\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020\u00052\b\b\u0002\u0010'\u001a\u00020\u00012\b\b\u0002\u0010(\u001a\u00020\u00052\b\b\u0002\u0010)\u001a\u00020\u00052\b\b\u0002\u0010*\u001a\u00020\u00052\b\b\u0002\u0010+\u001a\u00020\u00052\b\b\u0002\u0010,\u001a\u00020\u00012\b\b\u0002\u0010-\u001a\u00020\u00012\b\b\u0002\u0010.\u001a\u00020\u0005HÆ\u0001J\u0016\u0010\u0088\u0001\u001a\u00030\u0089\u00012\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0003HÖ\u0001J\n\u0010\u008c\u0001\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u0007\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b6\u00105R\u0011\u0010\b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b7\u00105R\u0011\u0010\t\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b8\u00105R\u0011\u0010\n\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b9\u00105R\u0011\u0010\u000b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b:\u00105R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u00101R\u0011\u0010\r\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b<\u00105R\u0011\u0010\u000e\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b=\u00105R\u0011\u0010\u000f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b>\u00105R\u0011\u0010\u0010\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b?\u00105R\u0011\u0010\u0011\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b@\u00105R\u0011\u0010\u0012\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bA\u00105R\u0011\u0010\u0013\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bB\u00105R\u0011\u0010\u0014\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bC\u00105R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u00101R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bE\u00103R\u0011\u0010\u0017\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bF\u00105R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bG\u00103R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bH\u00103R\u0011\u0010\u001a\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bI\u00105R\u0011\u0010\u001b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bJ\u00105R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u00101R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0011\u0010\u001f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bN\u00103R\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0011\u0010\"\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010MR\u0011\u0010#\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bR\u00105R\u0011\u0010$\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bS\u00103R\u0011\u0010%\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bT\u00103R\u0011\u0010&\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bU\u00103R\u0011\u0010'\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bV\u00105R\u0011\u0010(\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bW\u00103R\u0011\u0010)\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bX\u00103R\u0011\u0010*\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bY\u00103R\u0011\u0010+\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bZ\u00103R\u0011\u0010,\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b[\u00105R\u0011\u0010-\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\\\u00105R\u0011\u0010.\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b]\u00103¨\u0006\u008d\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/tp;", "", "action_cd", "", "appl_no", "", "channgeOfAdressDto", "chassis", "comp_cd", "duplicateRCDto", "fir_dt", "fir_no", "flow_slno", "hpadto", "hptdto", "idv", "ins_from", "ins_type", "ins_upto", "messege", "nocDobj", "off_cd", "off_descr", "op_dt", "owner_name", "payment_mode", "police_station", "policy_no", "pur_cd", "rcp_dt", "", "rcpt_NO", "rcpt_amt", "", "rcpt_dt", "reason", "regn_date", "regn_no", "response_code", "serviceDto", "state_cd", "state_header", "status", "status_desc", "tax_mode", "treasury_REF_NO", "vh_class", "(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;IJLjava/lang/String;DJLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V", "getAction_cd", "()I", "getAppl_no", "()Ljava/lang/String;", "getChanngeOfAdressDto", "()Ljava/lang/Object;", "getChassis", "getComp_cd", "getDuplicateRCDto", "getFir_dt", "getFir_no", "getFlow_slno", "getHpadto", "getHptdto", "getIdv", "getIns_from", "getIns_type", "getIns_upto", "getMessege", "getNocDobj", "getOff_cd", "getOff_descr", "getOp_dt", "getOwner_name", "getPayment_mode", "getPolice_station", "getPolicy_no", "getPur_cd", "getRcp_dt", "()J", "getRcpt_NO", "getRcpt_amt", "()D", "getRcpt_dt", "getReason", "getRegn_date", "getRegn_no", "getResponse_code", "getServiceDto", "getState_cd", "getState_header", "getStatus", "getStatus_desc", "getTax_mode", "getTreasury_REF_NO", "getVh_class", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class tp {
    private final int action_cd;
    private final String appl_no;
    private final Object channgeOfAdressDto;
    private final Object chassis;
    private final Object comp_cd;
    private final Object duplicateRCDto;
    private final Object fir_dt;
    private final Object fir_no;
    private final int flow_slno;
    private final Object hpadto;
    private final Object hptdto;
    private final Object idv;
    private final Object ins_from;
    private final Object ins_type;
    private final Object ins_upto;
    private final Object messege;
    private final Object nocDobj;
    private final int off_cd;
    private final String off_descr;
    private final Object op_dt;
    private final String owner_name;
    private final String payment_mode;
    private final Object police_station;
    private final Object policy_no;
    private final int pur_cd;
    private final long rcp_dt;
    private final String rcpt_NO;
    private final double rcpt_amt;
    private final long rcpt_dt;
    private final Object reason;
    private final String regn_date;
    private final String regn_no;
    private final String response_code;
    private final Object serviceDto;
    private final String state_cd;
    private final String state_header;
    private final String status;
    private final String status_desc;
    private final Object tax_mode;
    private final Object treasury_REF_NO;
    private final String vh_class;

    public tp(int i, String appl_no, Object channgeOfAdressDto, Object chassis, Object comp_cd, Object duplicateRCDto, Object fir_dt, Object fir_no, int i2, Object hpadto, Object hptdto, Object idv, Object ins_from, Object ins_type, Object ins_upto, Object messege, Object nocDobj, int i3, String off_descr, Object op_dt, String owner_name, String payment_mode, Object police_station, Object policy_no, int i4, long j, String rcpt_NO, double d, long j2, Object reason, String regn_date, String regn_no, String response_code, Object serviceDto, String state_cd, String state_header, String status, String status_desc, Object tax_mode, Object treasury_REF_NO, String vh_class) {
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(channgeOfAdressDto, "channgeOfAdressDto");
        Intrinsics.checkNotNullParameter(chassis, "chassis");
        Intrinsics.checkNotNullParameter(comp_cd, "comp_cd");
        Intrinsics.checkNotNullParameter(duplicateRCDto, "duplicateRCDto");
        Intrinsics.checkNotNullParameter(fir_dt, "fir_dt");
        Intrinsics.checkNotNullParameter(fir_no, "fir_no");
        Intrinsics.checkNotNullParameter(hpadto, "hpadto");
        Intrinsics.checkNotNullParameter(hptdto, "hptdto");
        Intrinsics.checkNotNullParameter(idv, "idv");
        Intrinsics.checkNotNullParameter(ins_from, "ins_from");
        Intrinsics.checkNotNullParameter(ins_type, "ins_type");
        Intrinsics.checkNotNullParameter(ins_upto, "ins_upto");
        Intrinsics.checkNotNullParameter(messege, "messege");
        Intrinsics.checkNotNullParameter(nocDobj, "nocDobj");
        Intrinsics.checkNotNullParameter(off_descr, "off_descr");
        Intrinsics.checkNotNullParameter(op_dt, "op_dt");
        Intrinsics.checkNotNullParameter(owner_name, "owner_name");
        Intrinsics.checkNotNullParameter(payment_mode, "payment_mode");
        Intrinsics.checkNotNullParameter(police_station, "police_station");
        Intrinsics.checkNotNullParameter(policy_no, "policy_no");
        Intrinsics.checkNotNullParameter(rcpt_NO, "rcpt_NO");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(regn_date, "regn_date");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(response_code, "response_code");
        Intrinsics.checkNotNullParameter(serviceDto, "serviceDto");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(state_header, "state_header");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        Intrinsics.checkNotNullParameter(tax_mode, "tax_mode");
        Intrinsics.checkNotNullParameter(treasury_REF_NO, "treasury_REF_NO");
        Intrinsics.checkNotNullParameter(vh_class, "vh_class");
        this.action_cd = i;
        this.appl_no = appl_no;
        this.channgeOfAdressDto = channgeOfAdressDto;
        this.chassis = chassis;
        this.comp_cd = comp_cd;
        this.duplicateRCDto = duplicateRCDto;
        this.fir_dt = fir_dt;
        this.fir_no = fir_no;
        this.flow_slno = i2;
        this.hpadto = hpadto;
        this.hptdto = hptdto;
        this.idv = idv;
        this.ins_from = ins_from;
        this.ins_type = ins_type;
        this.ins_upto = ins_upto;
        this.messege = messege;
        this.nocDobj = nocDobj;
        this.off_cd = i3;
        this.off_descr = off_descr;
        this.op_dt = op_dt;
        this.owner_name = owner_name;
        this.payment_mode = payment_mode;
        this.police_station = police_station;
        this.policy_no = policy_no;
        this.pur_cd = i4;
        this.rcp_dt = j;
        this.rcpt_NO = rcpt_NO;
        this.rcpt_amt = d;
        this.rcpt_dt = j2;
        this.reason = reason;
        this.regn_date = regn_date;
        this.regn_no = regn_no;
        this.response_code = response_code;
        this.serviceDto = serviceDto;
        this.state_cd = state_cd;
        this.state_header = state_header;
        this.status = status;
        this.status_desc = status_desc;
        this.tax_mode = tax_mode;
        this.treasury_REF_NO = treasury_REF_NO;
        this.vh_class = vh_class;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAction_cd() {
        return this.action_cd;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Object getHpadto() {
        return this.hpadto;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Object getHptdto() {
        return this.hptdto;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Object getIdv() {
        return this.idv;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Object getIns_from() {
        return this.ins_from;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Object getIns_type() {
        return this.ins_type;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Object getIns_upto() {
        return this.ins_upto;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Object getMessege() {
        return this.messege;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Object getNocDobj() {
        return this.nocDobj;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getOff_descr() {
        return this.off_descr;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppl_no() {
        return this.appl_no;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Object getOp_dt() {
        return this.op_dt;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getOwner_name() {
        return this.owner_name;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getPayment_mode() {
        return this.payment_mode;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Object getPolice_station() {
        return this.police_station;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Object getPolicy_no() {
        return this.policy_no;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final int getPur_cd() {
        return this.pur_cd;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final long getRcp_dt() {
        return this.rcp_dt;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getRcpt_NO() {
        return this.rcpt_NO;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final double getRcpt_amt() {
        return this.rcpt_amt;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final long getRcpt_dt() {
        return this.rcpt_dt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getChanngeOfAdressDto() {
        return this.channgeOfAdressDto;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Object getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getRegn_date() {
        return this.regn_date;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getResponse_code() {
        return this.response_code;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final Object getServiceDto() {
        return this.serviceDto;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getState_header() {
        return this.state_header;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getStatus_desc() {
        return this.status_desc;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final Object getTax_mode() {
        return this.tax_mode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Object getChassis() {
        return this.chassis;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final Object getTreasury_REF_NO() {
        return this.treasury_REF_NO;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final String getVh_class() {
        return this.vh_class;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Object getComp_cd() {
        return this.comp_cd;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Object getDuplicateRCDto() {
        return this.duplicateRCDto;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Object getFir_dt() {
        return this.fir_dt;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Object getFir_no() {
        return this.fir_no;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getFlow_slno() {
        return this.flow_slno;
    }

    public final tp copy(int action_cd, String appl_no, Object channgeOfAdressDto, Object chassis, Object comp_cd, Object duplicateRCDto, Object fir_dt, Object fir_no, int flow_slno, Object hpadto, Object hptdto, Object idv, Object ins_from, Object ins_type, Object ins_upto, Object messege, Object nocDobj, int off_cd, String off_descr, Object op_dt, String owner_name, String payment_mode, Object police_station, Object policy_no, int pur_cd, long rcp_dt, String rcpt_NO, double rcpt_amt, long rcpt_dt, Object reason, String regn_date, String regn_no, String response_code, Object serviceDto, String state_cd, String state_header, String status, String status_desc, Object tax_mode, Object treasury_REF_NO, String vh_class) {
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(channgeOfAdressDto, "channgeOfAdressDto");
        Intrinsics.checkNotNullParameter(chassis, "chassis");
        Intrinsics.checkNotNullParameter(comp_cd, "comp_cd");
        Intrinsics.checkNotNullParameter(duplicateRCDto, "duplicateRCDto");
        Intrinsics.checkNotNullParameter(fir_dt, "fir_dt");
        Intrinsics.checkNotNullParameter(fir_no, "fir_no");
        Intrinsics.checkNotNullParameter(hpadto, "hpadto");
        Intrinsics.checkNotNullParameter(hptdto, "hptdto");
        Intrinsics.checkNotNullParameter(idv, "idv");
        Intrinsics.checkNotNullParameter(ins_from, "ins_from");
        Intrinsics.checkNotNullParameter(ins_type, "ins_type");
        Intrinsics.checkNotNullParameter(ins_upto, "ins_upto");
        Intrinsics.checkNotNullParameter(messege, "messege");
        Intrinsics.checkNotNullParameter(nocDobj, "nocDobj");
        Intrinsics.checkNotNullParameter(off_descr, "off_descr");
        Intrinsics.checkNotNullParameter(op_dt, "op_dt");
        Intrinsics.checkNotNullParameter(owner_name, "owner_name");
        Intrinsics.checkNotNullParameter(payment_mode, "payment_mode");
        Intrinsics.checkNotNullParameter(police_station, "police_station");
        Intrinsics.checkNotNullParameter(policy_no, "policy_no");
        Intrinsics.checkNotNullParameter(rcpt_NO, "rcpt_NO");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(regn_date, "regn_date");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(response_code, "response_code");
        Intrinsics.checkNotNullParameter(serviceDto, "serviceDto");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(state_header, "state_header");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        Intrinsics.checkNotNullParameter(tax_mode, "tax_mode");
        Intrinsics.checkNotNullParameter(treasury_REF_NO, "treasury_REF_NO");
        Intrinsics.checkNotNullParameter(vh_class, "vh_class");
        return new tp(action_cd, appl_no, channgeOfAdressDto, chassis, comp_cd, duplicateRCDto, fir_dt, fir_no, flow_slno, hpadto, hptdto, idv, ins_from, ins_type, ins_upto, messege, nocDobj, off_cd, off_descr, op_dt, owner_name, payment_mode, police_station, policy_no, pur_cd, rcp_dt, rcpt_NO, rcpt_amt, rcpt_dt, reason, regn_date, regn_no, response_code, serviceDto, state_cd, state_header, status, status_desc, tax_mode, treasury_REF_NO, vh_class);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof tp)) {
            return false;
        }
        tp tpVar = (tp) other;
        return this.action_cd == tpVar.action_cd && Intrinsics.areEqual(this.appl_no, tpVar.appl_no) && Intrinsics.areEqual(this.channgeOfAdressDto, tpVar.channgeOfAdressDto) && Intrinsics.areEqual(this.chassis, tpVar.chassis) && Intrinsics.areEqual(this.comp_cd, tpVar.comp_cd) && Intrinsics.areEqual(this.duplicateRCDto, tpVar.duplicateRCDto) && Intrinsics.areEqual(this.fir_dt, tpVar.fir_dt) && Intrinsics.areEqual(this.fir_no, tpVar.fir_no) && this.flow_slno == tpVar.flow_slno && Intrinsics.areEqual(this.hpadto, tpVar.hpadto) && Intrinsics.areEqual(this.hptdto, tpVar.hptdto) && Intrinsics.areEqual(this.idv, tpVar.idv) && Intrinsics.areEqual(this.ins_from, tpVar.ins_from) && Intrinsics.areEqual(this.ins_type, tpVar.ins_type) && Intrinsics.areEqual(this.ins_upto, tpVar.ins_upto) && Intrinsics.areEqual(this.messege, tpVar.messege) && Intrinsics.areEqual(this.nocDobj, tpVar.nocDobj) && this.off_cd == tpVar.off_cd && Intrinsics.areEqual(this.off_descr, tpVar.off_descr) && Intrinsics.areEqual(this.op_dt, tpVar.op_dt) && Intrinsics.areEqual(this.owner_name, tpVar.owner_name) && Intrinsics.areEqual(this.payment_mode, tpVar.payment_mode) && Intrinsics.areEqual(this.police_station, tpVar.police_station) && Intrinsics.areEqual(this.policy_no, tpVar.policy_no) && this.pur_cd == tpVar.pur_cd && this.rcp_dt == tpVar.rcp_dt && Intrinsics.areEqual(this.rcpt_NO, tpVar.rcpt_NO) && Double.compare(this.rcpt_amt, tpVar.rcpt_amt) == 0 && this.rcpt_dt == tpVar.rcpt_dt && Intrinsics.areEqual(this.reason, tpVar.reason) && Intrinsics.areEqual(this.regn_date, tpVar.regn_date) && Intrinsics.areEqual(this.regn_no, tpVar.regn_no) && Intrinsics.areEqual(this.response_code, tpVar.response_code) && Intrinsics.areEqual(this.serviceDto, tpVar.serviceDto) && Intrinsics.areEqual(this.state_cd, tpVar.state_cd) && Intrinsics.areEqual(this.state_header, tpVar.state_header) && Intrinsics.areEqual(this.status, tpVar.status) && Intrinsics.areEqual(this.status_desc, tpVar.status_desc) && Intrinsics.areEqual(this.tax_mode, tpVar.tax_mode) && Intrinsics.areEqual(this.treasury_REF_NO, tpVar.treasury_REF_NO) && Intrinsics.areEqual(this.vh_class, tpVar.vh_class);
    }

    public final int getAction_cd() {
        return this.action_cd;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final Object getChanngeOfAdressDto() {
        return this.channgeOfAdressDto;
    }

    public final Object getChassis() {
        return this.chassis;
    }

    public final Object getComp_cd() {
        return this.comp_cd;
    }

    public final Object getDuplicateRCDto() {
        return this.duplicateRCDto;
    }

    public final Object getFir_dt() {
        return this.fir_dt;
    }

    public final Object getFir_no() {
        return this.fir_no;
    }

    public final int getFlow_slno() {
        return this.flow_slno;
    }

    public final Object getHpadto() {
        return this.hpadto;
    }

    public final Object getHptdto() {
        return this.hptdto;
    }

    public final Object getIdv() {
        return this.idv;
    }

    public final Object getIns_from() {
        return this.ins_from;
    }

    public final Object getIns_type() {
        return this.ins_type;
    }

    public final Object getIns_upto() {
        return this.ins_upto;
    }

    public final Object getMessege() {
        return this.messege;
    }

    public final Object getNocDobj() {
        return this.nocDobj;
    }

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final String getOff_descr() {
        return this.off_descr;
    }

    public final Object getOp_dt() {
        return this.op_dt;
    }

    public final String getOwner_name() {
        return this.owner_name;
    }

    public final String getPayment_mode() {
        return this.payment_mode;
    }

    public final Object getPolice_station() {
        return this.police_station;
    }

    public final Object getPolicy_no() {
        return this.policy_no;
    }

    public final int getPur_cd() {
        return this.pur_cd;
    }

    public final long getRcp_dt() {
        return this.rcp_dt;
    }

    public final String getRcpt_NO() {
        return this.rcpt_NO;
    }

    public final double getRcpt_amt() {
        return this.rcpt_amt;
    }

    public final long getRcpt_dt() {
        return this.rcpt_dt;
    }

    public final Object getReason() {
        return this.reason;
    }

    public final String getRegn_date() {
        return this.regn_date;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getResponse_code() {
        return this.response_code;
    }

    public final Object getServiceDto() {
        return this.serviceDto;
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

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public final Object getTax_mode() {
        return this.tax_mode;
    }

    public final Object getTreasury_REF_NO() {
        return this.treasury_REF_NO;
    }

    public final String getVh_class() {
        return this.vh_class;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.action_cd) * 31) + this.appl_no.hashCode()) * 31) + this.channgeOfAdressDto.hashCode()) * 31) + this.chassis.hashCode()) * 31) + this.comp_cd.hashCode()) * 31) + this.duplicateRCDto.hashCode()) * 31) + this.fir_dt.hashCode()) * 31) + this.fir_no.hashCode()) * 31) + Integer.hashCode(this.flow_slno)) * 31) + this.hpadto.hashCode()) * 31) + this.hptdto.hashCode()) * 31) + this.idv.hashCode()) * 31) + this.ins_from.hashCode()) * 31) + this.ins_type.hashCode()) * 31) + this.ins_upto.hashCode()) * 31) + this.messege.hashCode()) * 31) + this.nocDobj.hashCode()) * 31) + Integer.hashCode(this.off_cd)) * 31) + this.off_descr.hashCode()) * 31) + this.op_dt.hashCode()) * 31) + this.owner_name.hashCode()) * 31) + this.payment_mode.hashCode()) * 31) + this.police_station.hashCode()) * 31) + this.policy_no.hashCode()) * 31) + Integer.hashCode(this.pur_cd)) * 31) + Long.hashCode(this.rcp_dt)) * 31) + this.rcpt_NO.hashCode()) * 31) + Double.hashCode(this.rcpt_amt)) * 31) + Long.hashCode(this.rcpt_dt)) * 31) + this.reason.hashCode()) * 31) + this.regn_date.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + this.response_code.hashCode()) * 31) + this.serviceDto.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.state_header.hashCode()) * 31) + this.status.hashCode()) * 31) + this.status_desc.hashCode()) * 31) + this.tax_mode.hashCode()) * 31) + this.treasury_REF_NO.hashCode()) * 31) + this.vh_class.hashCode();
    }

    public String toString() {
        return "tp(action_cd=" + this.action_cd + ", appl_no=" + this.appl_no + ", channgeOfAdressDto=" + this.channgeOfAdressDto + ", chassis=" + this.chassis + ", comp_cd=" + this.comp_cd + ", duplicateRCDto=" + this.duplicateRCDto + ", fir_dt=" + this.fir_dt + ", fir_no=" + this.fir_no + ", flow_slno=" + this.flow_slno + ", hpadto=" + this.hpadto + ", hptdto=" + this.hptdto + ", idv=" + this.idv + ", ins_from=" + this.ins_from + ", ins_type=" + this.ins_type + ", ins_upto=" + this.ins_upto + ", messege=" + this.messege + ", nocDobj=" + this.nocDobj + ", off_cd=" + this.off_cd + ", off_descr=" + this.off_descr + ", op_dt=" + this.op_dt + ", owner_name=" + this.owner_name + ", payment_mode=" + this.payment_mode + ", police_station=" + this.police_station + ", policy_no=" + this.policy_no + ", pur_cd=" + this.pur_cd + ", rcp_dt=" + this.rcp_dt + ", rcpt_NO=" + this.rcpt_NO + ", rcpt_amt=" + this.rcpt_amt + ", rcpt_dt=" + this.rcpt_dt + ", reason=" + this.reason + ", regn_date=" + this.regn_date + ", regn_no=" + this.regn_no + ", response_code=" + this.response_code + ", serviceDto=" + this.serviceDto + ", state_cd=" + this.state_cd + ", state_header=" + this.state_header + ", status=" + this.status + ", status_desc=" + this.status_desc + ", tax_mode=" + this.tax_mode + ", treasury_REF_NO=" + this.treasury_REF_NO + ", vh_class=" + this.vh_class + ')';
    }
}
