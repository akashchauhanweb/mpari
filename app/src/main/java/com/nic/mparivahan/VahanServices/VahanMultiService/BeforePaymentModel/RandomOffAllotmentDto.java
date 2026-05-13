package com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003Jc\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006*"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/RandomOffAllotmentDto;", "Ljava/io/Serializable;", "allotedOffcd", "", "appl_no", "", "noofassigneduser", "owner_offcd", "pendingforVerify", "regn_no", "state_cd", "valid", "", "workpercentage", "(ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;ZI)V", "getAllotedOffcd", "()I", "getAppl_no", "()Ljava/lang/String;", "getNoofassigneduser", "getOwner_offcd", "getPendingforVerify", "getRegn_no", "getState_cd", "getValid", "()Z", "getWorkpercentage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class RandomOffAllotmentDto implements Serializable {
    private final int allotedOffcd;
    private final String appl_no;
    private final int noofassigneduser;
    private final int owner_offcd;
    private final int pendingforVerify;
    private final String regn_no;
    private final String state_cd;
    private final boolean valid;
    private final int workpercentage;

    public RandomOffAllotmentDto(int i, String appl_no, int i2, int i3, int i4, String regn_no, String state_cd, boolean z, int i5) {
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        this.allotedOffcd = i;
        this.appl_no = appl_no;
        this.noofassigneduser = i2;
        this.owner_offcd = i3;
        this.pendingforVerify = i4;
        this.regn_no = regn_no;
        this.state_cd = state_cd;
        this.valid = z;
        this.workpercentage = i5;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAllotedOffcd() {
        return this.allotedOffcd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppl_no() {
        return this.appl_no;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getNoofassigneduser() {
        return this.noofassigneduser;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOwner_offcd() {
        return this.owner_offcd;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPendingforVerify() {
        return this.pendingforVerify;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRegn_no() {
        return this.regn_no;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getValid() {
        return this.valid;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getWorkpercentage() {
        return this.workpercentage;
    }

    public final RandomOffAllotmentDto copy(int allotedOffcd, String appl_no, int noofassigneduser, int owner_offcd, int pendingforVerify, String regn_no, String state_cd, boolean valid, int workpercentage) {
        Intrinsics.checkNotNullParameter(appl_no, "appl_no");
        Intrinsics.checkNotNullParameter(regn_no, "regn_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        return new RandomOffAllotmentDto(allotedOffcd, appl_no, noofassigneduser, owner_offcd, pendingforVerify, regn_no, state_cd, valid, workpercentage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RandomOffAllotmentDto)) {
            return false;
        }
        RandomOffAllotmentDto randomOffAllotmentDto = (RandomOffAllotmentDto) other;
        return this.allotedOffcd == randomOffAllotmentDto.allotedOffcd && Intrinsics.areEqual(this.appl_no, randomOffAllotmentDto.appl_no) && this.noofassigneduser == randomOffAllotmentDto.noofassigneduser && this.owner_offcd == randomOffAllotmentDto.owner_offcd && this.pendingforVerify == randomOffAllotmentDto.pendingforVerify && Intrinsics.areEqual(this.regn_no, randomOffAllotmentDto.regn_no) && Intrinsics.areEqual(this.state_cd, randomOffAllotmentDto.state_cd) && this.valid == randomOffAllotmentDto.valid && this.workpercentage == randomOffAllotmentDto.workpercentage;
    }

    public final int getAllotedOffcd() {
        return this.allotedOffcd;
    }

    public final String getAppl_no() {
        return this.appl_no;
    }

    public final int getNoofassigneduser() {
        return this.noofassigneduser;
    }

    public final int getOwner_offcd() {
        return this.owner_offcd;
    }

    public final int getPendingforVerify() {
        return this.pendingforVerify;
    }

    public final String getRegn_no() {
        return this.regn_no;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final boolean getValid() {
        return this.valid;
    }

    public final int getWorkpercentage() {
        return this.workpercentage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    public int hashCode() {
        int iHashCode = ((((((((((((Integer.hashCode(this.allotedOffcd) * 31) + this.appl_no.hashCode()) * 31) + Integer.hashCode(this.noofassigneduser)) * 31) + Integer.hashCode(this.owner_offcd)) * 31) + Integer.hashCode(this.pendingforVerify)) * 31) + this.regn_no.hashCode()) * 31) + this.state_cd.hashCode()) * 31;
        boolean z = this.valid;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode + r1) * 31) + Integer.hashCode(this.workpercentage);
    }

    public String toString() {
        return "RandomOffAllotmentDto(allotedOffcd=" + this.allotedOffcd + ", appl_no=" + this.appl_no + ", noofassigneduser=" + this.noofassigneduser + ", owner_offcd=" + this.owner_offcd + ", pendingforVerify=" + this.pendingforVerify + ", regn_no=" + this.regn_no + ", state_cd=" + this.state_cd + ", valid=" + this.valid + ", workpercentage=" + this.workpercentage + ')';
    }
}
