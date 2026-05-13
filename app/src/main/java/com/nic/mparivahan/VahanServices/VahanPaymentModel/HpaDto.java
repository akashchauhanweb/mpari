package com.nic.mparivahan.VahanServices.VahanPaymentModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b*\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u0095\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u00020\bHÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014¨\u00068"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/HpaDto;", "Ljava/io/Serializable;", "appl_no", "", "fncr_add1", "fncr_add2", "fncr_add3", "fncr_district", "", "fncr_name", "fncr_pincode", "fncr_state", "from_dt", "off_cd", "op_dt", "regn_no", "sr_no", "state_cd", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getAppl_no", "()Ljava/lang/String;", "getFncr_add1", "getFncr_add2", "getFncr_add3", "getFncr_district", "()I", "getFncr_name", "getFncr_pincode", "getFncr_state", "getFrom_dt", "getOff_cd", "getOp_dt", "getRegn_no", "getSr_no", "getState_cd", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class HpaDto implements Serializable {
    private final String appl_no;
    private final String fncr_add1;
    private final String fncr_add2;
    private final String fncr_add3;
    private final int fncr_district;
    private final String fncr_name;
    private final int fncr_pincode;
    private final String fncr_state;
    private final String from_dt;
    private final int off_cd;
    private final String op_dt;
    private final String regn_no;
    private final int sr_no;
    private final String state_cd;

    public HpaDto(String appl_no, String fncr_add1, String fncr_add2, String fncr_add3, int i, String fncr_name, int i2, String fncr_state, String from_dt, int i3, String op_dt, String regn_no, int i4, String state_cd) {
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(fncr_add1, "fncr_add1");
        Intrinsics.checkNotNullParameter(fncr_add2, "fncr_add2");
        Intrinsics.checkNotNullParameter(fncr_add3, "fncr_add3");
        Intrinsics.checkNotNullParameter(fncr_name, "fncr_name");
        Intrinsics.checkNotNullParameter(fncr_state, "fncr_state");
        Intrinsics.checkNotNullParameter(from_dt, "from_dt");
        Intrinsics.checkNotNullParameter(op_dt, "op_dt");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        this.appl_no = appl_no;
        this.fncr_add1 = fncr_add1;
        this.fncr_add2 = fncr_add2;
        this.fncr_add3 = fncr_add3;
        this.fncr_district = i;
        this.fncr_name = fncr_name;
        this.fncr_pincode = i2;
        this.fncr_state = fncr_state;
        this.from_dt = from_dt;
        this.off_cd = i3;
        this.op_dt = op_dt;
        this.regn_no = regn_no;
        this.sr_no = i4;
        this.state_cd = state_cd;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppl_no() {
        return this.appl_no;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getOff_cd() {
        return this.off_cd;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getOp_dt() {
        return this.op_dt;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getSr_no() {
        return this.sr_no;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFncr_add1() {
        return this.fncr_add1;
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
    public final String getFncr_name() {
        return this.fncr_name;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getFncr_pincode() {
        return this.fncr_pincode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getFncr_state() {
        return this.fncr_state;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getFrom_dt() {
        return this.from_dt;
    }

    public final HpaDto copy(String appl_no, String fncr_add1, String fncr_add2, String fncr_add3, int fncr_district, String fncr_name, int fncr_pincode, String fncr_state, String from_dt, int off_cd, String op_dt, String regn_no, int sr_no, String state_cd) {
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(fncr_add1, "fncr_add1");
        Intrinsics.checkNotNullParameter(fncr_add2, "fncr_add2");
        Intrinsics.checkNotNullParameter(fncr_add3, "fncr_add3");
        Intrinsics.checkNotNullParameter(fncr_name, "fncr_name");
        Intrinsics.checkNotNullParameter(fncr_state, "fncr_state");
        Intrinsics.checkNotNullParameter(from_dt, "from_dt");
        Intrinsics.checkNotNullParameter(op_dt, "op_dt");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        return new HpaDto(appl_no, fncr_add1, fncr_add2, fncr_add3, fncr_district, fncr_name, fncr_pincode, fncr_state, from_dt, off_cd, op_dt, regn_no, sr_no, state_cd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HpaDto)) {
            return false;
        }
        HpaDto hpaDto = (HpaDto) other;
        return Intrinsics.areEqual(this.appl_no, hpaDto.appl_no) && Intrinsics.areEqual(this.fncr_add1, hpaDto.fncr_add1) && Intrinsics.areEqual(this.fncr_add2, hpaDto.fncr_add2) && Intrinsics.areEqual(this.fncr_add3, hpaDto.fncr_add3) && this.fncr_district == hpaDto.fncr_district && Intrinsics.areEqual(this.fncr_name, hpaDto.fncr_name) && this.fncr_pincode == hpaDto.fncr_pincode && Intrinsics.areEqual(this.fncr_state, hpaDto.fncr_state) && Intrinsics.areEqual(this.from_dt, hpaDto.from_dt) && this.off_cd == hpaDto.off_cd && Intrinsics.areEqual(this.op_dt, hpaDto.op_dt) && Intrinsics.areEqual(this.regn_no, hpaDto.regn_no) && this.sr_no == hpaDto.sr_no && Intrinsics.areEqual(this.state_cd, hpaDto.state_cd);
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

    public final String getFncr_name() {
        return this.fncr_name;
    }

    public final int getFncr_pincode() {
        return this.fncr_pincode;
    }

    public final String getFncr_state() {
        return this.fncr_state;
    }

    public final String getFrom_dt() {
        return this.from_dt;
    }

    public final int getOff_cd() {
        return this.off_cd;
    }

    public final String getOp_dt() {
        return this.op_dt;
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

    public int hashCode() {
        return (((((((((((((((((((((((((this.appl_no.hashCode() * 31) + this.fncr_add1.hashCode()) * 31) + this.fncr_add2.hashCode()) * 31) + this.fncr_add3.hashCode()) * 31) + Integer.hashCode(this.fncr_district)) * 31) + this.fncr_name.hashCode()) * 31) + Integer.hashCode(this.fncr_pincode)) * 31) + this.fncr_state.hashCode()) * 31) + this.from_dt.hashCode()) * 31) + Integer.hashCode(this.off_cd)) * 31) + this.op_dt.hashCode()) * 31) + this.regn_no.hashCode()) * 31) + Integer.hashCode(this.sr_no)) * 31) + this.state_cd.hashCode();
    }

    public String toString() {
        return "HpaDto(appl_no=" + this.appl_no + ", fncr_add1=" + this.fncr_add1 + ", fncr_add2=" + this.fncr_add2 + ", fncr_add3=" + this.fncr_add3 + ", fncr_district=" + this.fncr_district + ", fncr_name=" + this.fncr_name + ", fncr_pincode=" + this.fncr_pincode + ", fncr_state=" + this.fncr_state + ", from_dt=" + this.from_dt + ", off_cd=" + this.off_cd + ", op_dt=" + this.op_dt + ", regn_no=" + this.regn_no + ", sr_no=" + this.sr_no + ", state_cd=" + this.state_cd + ')';
    }
}
