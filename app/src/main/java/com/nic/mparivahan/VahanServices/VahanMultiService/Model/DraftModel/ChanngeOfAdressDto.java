package com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bM\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0002\u0010\u001dJ\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0006HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0006HÆ\u0003J\t\u0010=\u001a\u00020\u0006HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0006HÆ\u0003J\t\u0010@\u001a\u00020\u0006HÆ\u0003J\t\u0010A\u001a\u00020\u0006HÆ\u0003J\t\u0010B\u001a\u00020\u0006HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0006HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0006HÆ\u0003J\t\u0010I\u001a\u00020\u0006HÆ\u0003J\t\u0010J\u001a\u00020\u0006HÆ\u0003J\t\u0010K\u001a\u00020\u0006HÆ\u0003J\t\u0010L\u001a\u00020\u0006HÆ\u0003J\t\u0010M\u001a\u00020\u0006HÆ\u0003J\t\u0010N\u001a\u00020\u0006HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0006HÆ\u0003J\u0083\u0002\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u0006HÆ\u0001J\u0013\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010VHÖ\u0003J\t\u0010W\u001a\u00020\u0003HÖ\u0001J\t\u0010X\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\"R\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\"R\u0011\u0010\u0014\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0011\u0010\u0015\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\"R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u0011\u0010\u0018\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001fR\u0011\u0010\u001a\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\"R\u0011\u0010\u001b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\"R\u0011\u0010\u001c\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\"¨\u0006Y"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/ChanngeOfAdressDto;", "Ljava/io/Serializable;", "action_cd", "", "action_code", "appl_no", "", "c_add1", "c_add2", "c_add3", "c_district", "c_pincode", "c_state", "facelessmessge", "flow_slno", "from_dt", "messege", "off_cd", "op_dt", "p_add1", "p_add2", "p_add3", "p_district", "p_pincode", "p_state", "pur_cd", "regn_no", "state_cd", "state_header", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction_cd", "()I", "getAction_code", "getAppl_no", "()Ljava/lang/String;", "getC_add1", "getC_add2", "getC_add3", "getC_district", "getC_pincode", "getC_state", "getFacelessmessge", "getFlow_slno", "getFrom_dt", "getMessege", "getOff_cd", "getOp_dt", "getP_add1", "getP_add2", "getP_add3", "getP_district", "getP_pincode", "getP_state", "getPur_cd", "getRegn_no", "getState_cd", "getState_header", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ChanngeOfAdressDto implements Serializable {
    private final int action_cd;
    private final int action_code;
    private final String appl_no;
    private final String c_add1;
    private final String c_add2;
    private final String c_add3;
    private final int c_district;
    private final int c_pincode;
    private final String c_state;
    private final String facelessmessge;
    private final int flow_slno;
    private final String from_dt;
    private final String messege;
    private final int off_cd;
    private final String op_dt;
    private final String p_add1;
    private final String p_add2;
    private final String p_add3;
    private final int p_district;
    private final int p_pincode;
    private final String p_state;
    private final int pur_cd;
    private final String regn_no;
    private final String state_cd;
    private final String state_header;

    public ChanngeOfAdressDto(int i, int i2, String appl_no, String c_add1, String c_add2, String c_add3, int i3, int i4, String c_state, String facelessmessge, int i5, String from_dt, String messege, int i6, String op_dt, String p_add1, String p_add2, String p_add3, int i7, int i8, String p_state, int i9, String regn_no, String state_cd, String state_header) {
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(c_add1, "c_add1");
        Intrinsics.checkNotNullParameter(c_add2, "c_add2");
        Intrinsics.checkNotNullParameter(c_add3, "c_add3");
        Intrinsics.checkNotNullParameter(c_state, "c_state");
        Intrinsics.checkNotNullParameter(facelessmessge, "facelessmessge");
        Intrinsics.checkNotNullParameter(from_dt, "from_dt");
        Intrinsics.checkNotNullParameter(messege, "messege");
        Intrinsics.checkNotNullParameter(op_dt, "op_dt");
        Intrinsics.checkNotNullParameter(p_add1, "p_add1");
        Intrinsics.checkNotNullParameter(p_add2, "p_add2");
        Intrinsics.checkNotNullParameter(p_add3, "p_add3");
        Intrinsics.checkNotNullParameter(p_state, "p_state");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(state_header, "state_header");
        this.action_cd = i;
        this.action_code = i2;
        this.appl_no = appl_no;
        this.c_add1 = c_add1;
        this.c_add2 = c_add2;
        this.c_add3 = c_add3;
        this.c_district = i3;
        this.c_pincode = i4;
        this.c_state = c_state;
        this.facelessmessge = facelessmessge;
        this.flow_slno = i5;
        this.from_dt = from_dt;
        this.messege = messege;
        this.off_cd = i6;
        this.op_dt = op_dt;
        this.p_add1 = p_add1;
        this.p_add2 = p_add2;
        this.p_add3 = p_add3;
        this.p_district = i7;
        this.p_pincode = i8;
        this.p_state = p_state;
        this.pur_cd = i9;
        this.regn_no = regn_no;
        this.state_cd = state_cd;
        this.state_header = state_header;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAction_cd() {
        return this.action_cd;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getFacelessmessge() {
        return this.facelessmessge;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getFlow_slno() {
        return this.flow_slno;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getFrom_dt() {
        return this.from_dt;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getMessege() {
        return this.messege;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getOp_dt() {
        return this.op_dt;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getP_add1() {
        return this.p_add1;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getP_add2() {
        return this.p_add2;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getP_add3() {
        return this.p_add3;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getP_district() {
        return this.p_district;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAction_code() {
        return this.action_code;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getP_pincode() {
        return this.p_pincode;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getP_state() {
        return this.p_state;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getPur_cd() {
        return this.pur_cd;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getState_header() {
        return this.state_header;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppl_no() {
        return this.appl_no;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getC_add1() {
        return this.c_add1;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getC_add2() {
        return this.c_add2;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getC_add3() {
        return this.c_add3;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getC_district() {
        return this.c_district;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getC_pincode() {
        return this.c_pincode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getC_state() {
        return this.c_state;
    }

    public final ChanngeOfAdressDto copy(int action_cd, int action_code, String appl_no, String c_add1, String c_add2, String c_add3, int c_district, int c_pincode, String c_state, String facelessmessge, int flow_slno, String from_dt, String messege, int off_cd, String op_dt, String p_add1, String p_add2, String p_add3, int p_district, int p_pincode, String p_state, int pur_cd, String regn_no, String state_cd, String state_header) {
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(c_add1, "c_add1");
        Intrinsics.checkNotNullParameter(c_add2, "c_add2");
        Intrinsics.checkNotNullParameter(c_add3, "c_add3");
        Intrinsics.checkNotNullParameter(c_state, "c_state");
        Intrinsics.checkNotNullParameter(facelessmessge, "facelessmessge");
        Intrinsics.checkNotNullParameter(from_dt, "from_dt");
        Intrinsics.checkNotNullParameter(messege, "messege");
        Intrinsics.checkNotNullParameter(op_dt, "op_dt");
        Intrinsics.checkNotNullParameter(p_add1, "p_add1");
        Intrinsics.checkNotNullParameter(p_add2, "p_add2");
        Intrinsics.checkNotNullParameter(p_add3, "p_add3");
        Intrinsics.checkNotNullParameter(p_state, "p_state");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(state_header, "state_header");
        return new ChanngeOfAdressDto(action_cd, action_code, appl_no, c_add1, c_add2, c_add3, c_district, c_pincode, c_state, facelessmessge, flow_slno, from_dt, messege, off_cd, op_dt, p_add1, p_add2, p_add3, p_district, p_pincode, p_state, pur_cd, regn_no, state_cd, state_header);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChanngeOfAdressDto)) {
            return false;
        }
        ChanngeOfAdressDto channgeOfAdressDto = (ChanngeOfAdressDto) other;
        return this.action_cd == channgeOfAdressDto.action_cd && this.action_code == channgeOfAdressDto.action_code && Intrinsics.areEqual(this.appl_no, channgeOfAdressDto.appl_no) && Intrinsics.areEqual(this.c_add1, channgeOfAdressDto.c_add1) && Intrinsics.areEqual(this.c_add2, channgeOfAdressDto.c_add2) && Intrinsics.areEqual(this.c_add3, channgeOfAdressDto.c_add3) && this.c_district == channgeOfAdressDto.c_district && this.c_pincode == channgeOfAdressDto.c_pincode && Intrinsics.areEqual(this.c_state, channgeOfAdressDto.c_state) && Intrinsics.areEqual(this.facelessmessge, channgeOfAdressDto.facelessmessge) && this.flow_slno == channgeOfAdressDto.flow_slno && Intrinsics.areEqual(this.from_dt, channgeOfAdressDto.from_dt) && Intrinsics.areEqual(this.messege, channgeOfAdressDto.messege) && this.off_cd == channgeOfAdressDto.off_cd && Intrinsics.areEqual(this.op_dt, channgeOfAdressDto.op_dt) && Intrinsics.areEqual(this.p_add1, channgeOfAdressDto.p_add1) && Intrinsics.areEqual(this.p_add2, channgeOfAdressDto.p_add2) && Intrinsics.areEqual(this.p_add3, channgeOfAdressDto.p_add3) && this.p_district == channgeOfAdressDto.p_district && this.p_pincode == channgeOfAdressDto.p_pincode && Intrinsics.areEqual(this.p_state, channgeOfAdressDto.p_state) && this.pur_cd == channgeOfAdressDto.pur_cd && Intrinsics.areEqual(this.regn_no, channgeOfAdressDto.regn_no) && Intrinsics.areEqual(this.state_cd, channgeOfAdressDto.state_cd) && Intrinsics.areEqual(this.state_header, channgeOfAdressDto.state_header);
    }

    public final int getAction_cd() {
        return this.action_cd;
    }

    public final int getAction_code() {
        return this.action_code;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final String getC_add1() {
        return this.c_add1;
    }

    public final String getC_add2() {
        return this.c_add2;
    }

    public final String getC_add3() {
        return this.c_add3;
    }

    public final int getC_district() {
        return this.c_district;
    }

    public final int getC_pincode() {
        return this.c_pincode;
    }

    public final String getC_state() {
        return this.c_state;
    }

    public final String getFacelessmessge() {
        return this.facelessmessge;
    }

    public final int getFlow_slno() {
        return this.flow_slno;
    }

    public final String getFrom_dt() {
        return this.from_dt;
    }

    public final String getMessege() {
        return this.messege;
    }

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final String getOp_dt() {
        return this.op_dt;
    }

    public final String getP_add1() {
        return this.p_add1;
    }

    public final String getP_add2() {
        return this.p_add2;
    }

    public final String getP_add3() {
        return this.p_add3;
    }

    public final int getP_district() {
        return this.p_district;
    }

    public final int getP_pincode() {
        return this.p_pincode;
    }

    public final String getP_state() {
        return this.p_state;
    }

    public final int getPur_cd() {
        return this.pur_cd;
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

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.action_cd) * 31) + Integer.hashCode(this.action_code)) * 31) + this.appl_no.hashCode()) * 31) + this.c_add1.hashCode()) * 31) + this.c_add2.hashCode()) * 31) + this.c_add3.hashCode()) * 31) + Integer.hashCode(this.c_district)) * 31) + Integer.hashCode(this.c_pincode)) * 31) + this.c_state.hashCode()) * 31) + this.facelessmessge.hashCode()) * 31) + Integer.hashCode(this.flow_slno)) * 31) + this.from_dt.hashCode()) * 31) + this.messege.hashCode()) * 31) + Integer.hashCode(this.off_cd)) * 31) + this.op_dt.hashCode()) * 31) + this.p_add1.hashCode()) * 31) + this.p_add2.hashCode()) * 31) + this.p_add3.hashCode()) * 31) + Integer.hashCode(this.p_district)) * 31) + Integer.hashCode(this.p_pincode)) * 31) + this.p_state.hashCode()) * 31) + Integer.hashCode(this.pur_cd)) * 31) + this.regn_no.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + this.state_header.hashCode();
    }

    public String toString() {
        return "ChanngeOfAdressDto(action_cd=" + this.action_cd + ", action_code=" + this.action_code + ", appl_no=" + this.appl_no + ", c_add1=" + this.c_add1 + ", c_add2=" + this.c_add2 + ", c_add3=" + this.c_add3 + ", c_district=" + this.c_district + ", c_pincode=" + this.c_pincode + ", c_state=" + this.c_state + ", facelessmessge=" + this.facelessmessge + ", flow_slno=" + this.flow_slno + ", from_dt=" + this.from_dt + ", messege=" + this.messege + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", p_add1=" + this.p_add1 + ", p_add2=" + this.p_add2 + ", p_add3=" + this.p_add3 + ", p_district=" + this.p_district + ", p_pincode=" + this.p_pincode + ", p_state=" + this.p_state + ", pur_cd=" + this.pur_cd + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", state_header=" + this.state_header + ')';
    }
}
