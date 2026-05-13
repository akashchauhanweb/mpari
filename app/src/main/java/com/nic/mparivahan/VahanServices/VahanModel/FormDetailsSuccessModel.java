package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\bA\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0016J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0010HÆ\u0003J\t\u0010B\u001a\u00020\u0012HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J·\u0001\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0013\u0010O\u001a\u00020\u00032\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Q\u001a\u00020\u0010HÖ\u0001J\t\u0010R\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010 R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\"\"\u0004\b.\u0010$R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\"\"\u0004\b0\u0010$R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\"\"\u0004\b2\u0010$R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\"\"\u0004\b4\u0010$R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\"\"\u0004\b6\u0010$R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\"\"\u0004\b8\u0010$R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\"\"\u0004\b:\u0010$R\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\"\"\u0004\b<\u0010$¨\u0006S"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/FormDetailsSuccessModel;", "", "renForm22", "", "renForm25", "renForm26", "renForm28", "renForm29", "renForm30", "renForm31", "renForm32", "renForm33", "renForm34", "renForm35", "renForm36", "pur_cd", "", "rcpt_no", "", "renderForm14", "errorcode", "errorDesc", "(ZZZZZZZZZZZZILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getErrorDesc", "()Ljava/lang/String;", "getErrorcode", "getPur_cd", "()I", "setPur_cd", "(I)V", "getRcpt_no", "setRcpt_no", "(Ljava/lang/String;)V", "getRenForm22", "()Z", "setRenForm22", "(Z)V", "getRenForm25", "setRenForm25", "getRenForm26", "setRenForm26", "getRenForm28", "setRenForm28", "getRenForm29", "setRenForm29", "getRenForm30", "setRenForm30", "getRenForm31", "setRenForm31", "getRenForm32", "setRenForm32", "getRenForm33", "setRenForm33", "getRenForm34", "setRenForm34", "getRenForm35", "setRenForm35", "getRenForm36", "setRenForm36", "getRenderForm14", "setRenderForm14", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FormDetailsSuccessModel {
    private final String errorDesc;
    private final String errorcode;
    private int pur_cd;
    private String rcpt_no;
    private boolean renForm22;
    private boolean renForm25;
    private boolean renForm26;
    private boolean renForm28;
    private boolean renForm29;
    private boolean renForm30;
    private boolean renForm31;
    private boolean renForm32;
    private boolean renForm33;
    private boolean renForm34;
    private boolean renForm35;
    private boolean renForm36;
    private boolean renderForm14;

    public FormDetailsSuccessModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i, String rcpt_no, boolean z13, String str, String str2) {
        Intrinsics.checkNotNullParameter(rcpt_no, "rcpt_no");
        this.renForm22 = z;
        this.renForm25 = z2;
        this.renForm26 = z3;
        this.renForm28 = z4;
        this.renForm29 = z5;
        this.renForm30 = z6;
        this.renForm31 = z7;
        this.renForm32 = z8;
        this.renForm33 = z9;
        this.renForm34 = z10;
        this.renForm35 = z11;
        this.renForm36 = z12;
        this.pur_cd = i;
        this.rcpt_no = rcpt_no;
        this.renderForm14 = z13;
        this.errorcode = str;
        this.errorDesc = str2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getRenForm22() {
        return this.renForm22;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getRenForm34() {
        return this.renForm34;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getRenForm35() {
        return this.renForm35;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getRenForm36() {
        return this.renForm36;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getPur_cd() {
        return this.pur_cd;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getRcpt_no() {
        return this.rcpt_no;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getRenderForm14() {
        return this.renderForm14;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getErrorcode() {
        return this.errorcode;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getErrorDesc() {
        return this.errorDesc;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getRenForm25() {
        return this.renForm25;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getRenForm26() {
        return this.renForm26;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getRenForm28() {
        return this.renForm28;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getRenForm29() {
        return this.renForm29;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getRenForm30() {
        return this.renForm30;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getRenForm31() {
        return this.renForm31;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getRenForm32() {
        return this.renForm32;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getRenForm33() {
        return this.renForm33;
    }

    public final FormDetailsSuccessModel copy(boolean renForm22, boolean renForm25, boolean renForm26, boolean renForm28, boolean renForm29, boolean renForm30, boolean renForm31, boolean renForm32, boolean renForm33, boolean renForm34, boolean renForm35, boolean renForm36, int pur_cd, String rcpt_no, boolean renderForm14, String errorcode, String errorDesc) {
        Intrinsics.checkNotNullParameter(rcpt_no, "rcpt_no");
        return new FormDetailsSuccessModel(renForm22, renForm25, renForm26, renForm28, renForm29, renForm30, renForm31, renForm32, renForm33, renForm34, renForm35, renForm36, pur_cd, rcpt_no, renderForm14, errorcode, errorDesc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormDetailsSuccessModel)) {
            return false;
        }
        FormDetailsSuccessModel formDetailsSuccessModel = (FormDetailsSuccessModel) other;
        return this.renForm22 == formDetailsSuccessModel.renForm22 && this.renForm25 == formDetailsSuccessModel.renForm25 && this.renForm26 == formDetailsSuccessModel.renForm26 && this.renForm28 == formDetailsSuccessModel.renForm28 && this.renForm29 == formDetailsSuccessModel.renForm29 && this.renForm30 == formDetailsSuccessModel.renForm30 && this.renForm31 == formDetailsSuccessModel.renForm31 && this.renForm32 == formDetailsSuccessModel.renForm32 && this.renForm33 == formDetailsSuccessModel.renForm33 && this.renForm34 == formDetailsSuccessModel.renForm34 && this.renForm35 == formDetailsSuccessModel.renForm35 && this.renForm36 == formDetailsSuccessModel.renForm36 && this.pur_cd == formDetailsSuccessModel.pur_cd && Intrinsics.areEqual(this.rcpt_no, formDetailsSuccessModel.rcpt_no) && this.renderForm14 == formDetailsSuccessModel.renderForm14 && Intrinsics.areEqual(this.errorcode, formDetailsSuccessModel.errorcode) && Intrinsics.areEqual(this.errorDesc, formDetailsSuccessModel.errorDesc);
    }

    public final String getErrorDesc() {
        return this.errorDesc;
    }

    public final String getErrorcode() {
        return this.errorcode;
    }

    public final int getPur_cd() {
        return this.pur_cd;
    }

    public final String getRcpt_no() {
        return this.rcpt_no;
    }

    public final boolean getRenForm22() {
        return this.renForm22;
    }

    public final boolean getRenForm25() {
        return this.renForm25;
    }

    public final boolean getRenForm26() {
        return this.renForm26;
    }

    public final boolean getRenForm28() {
        return this.renForm28;
    }

    public final boolean getRenForm29() {
        return this.renForm29;
    }

    public final boolean getRenForm30() {
        return this.renForm30;
    }

    public final boolean getRenForm31() {
        return this.renForm31;
    }

    public final boolean getRenForm32() {
        return this.renForm32;
    }

    public final boolean getRenForm33() {
        return this.renForm33;
    }

    public final boolean getRenForm34() {
        return this.renForm34;
    }

    public final boolean getRenForm35() {
        return this.renForm35;
    }

    public final boolean getRenForm36() {
        return this.renForm36;
    }

    public final boolean getRenderForm14() {
        return this.renderForm14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17, types: [int] */
    /* JADX WARN: Type inference failed for: r2v19, types: [int] */
    /* JADX WARN: Type inference failed for: r2v21, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    public int hashCode() {
        boolean z = this.renForm22;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.renForm25;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.renForm26;
        ?? r22 = z3;
        if (z3) {
            r22 = 1;
        }
        int i3 = (i2 + r22) * 31;
        boolean z4 = this.renForm28;
        ?? r23 = z4;
        if (z4) {
            r23 = 1;
        }
        int i4 = (i3 + r23) * 31;
        boolean z5 = this.renForm29;
        ?? r24 = z5;
        if (z5) {
            r24 = 1;
        }
        int i5 = (i4 + r24) * 31;
        boolean z6 = this.renForm30;
        ?? r25 = z6;
        if (z6) {
            r25 = 1;
        }
        int i6 = (i5 + r25) * 31;
        boolean z7 = this.renForm31;
        ?? r26 = z7;
        if (z7) {
            r26 = 1;
        }
        int i7 = (i6 + r26) * 31;
        boolean z8 = this.renForm32;
        ?? r27 = z8;
        if (z8) {
            r27 = 1;
        }
        int i8 = (i7 + r27) * 31;
        boolean z9 = this.renForm33;
        ?? r28 = z9;
        if (z9) {
            r28 = 1;
        }
        int i9 = (i8 + r28) * 31;
        boolean z10 = this.renForm34;
        ?? r29 = z10;
        if (z10) {
            r29 = 1;
        }
        int i10 = (i9 + r29) * 31;
        boolean z11 = this.renForm35;
        ?? r210 = z11;
        if (z11) {
            r210 = 1;
        }
        int i11 = (i10 + r210) * 31;
        boolean z12 = this.renForm36;
        ?? r211 = z12;
        if (z12) {
            r211 = 1;
        }
        int iHashCode = (((((i11 + r211) * 31) + Integer.hashCode(this.pur_cd)) * 31) + this.rcpt_no.hashCode()) * 31;
        boolean z13 = this.renderForm14;
        int i12 = (iHashCode + (z13 ? 1 : z13)) * 31;
        String str = this.errorcode;
        int iHashCode2 = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorDesc;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setPur_cd(int i) {
        this.pur_cd = i;
    }

    public final void setRcpt_no(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rcpt_no = str;
    }

    public final void setRenForm22(boolean z) {
        this.renForm22 = z;
    }

    public final void setRenForm25(boolean z) {
        this.renForm25 = z;
    }

    public final void setRenForm26(boolean z) {
        this.renForm26 = z;
    }

    public final void setRenForm28(boolean z) {
        this.renForm28 = z;
    }

    public final void setRenForm29(boolean z) {
        this.renForm29 = z;
    }

    public final void setRenForm30(boolean z) {
        this.renForm30 = z;
    }

    public final void setRenForm31(boolean z) {
        this.renForm31 = z;
    }

    public final void setRenForm32(boolean z) {
        this.renForm32 = z;
    }

    public final void setRenForm33(boolean z) {
        this.renForm33 = z;
    }

    public final void setRenForm34(boolean z) {
        this.renForm34 = z;
    }

    public final void setRenForm35(boolean z) {
        this.renForm35 = z;
    }

    public final void setRenForm36(boolean z) {
        this.renForm36 = z;
    }

    public final void setRenderForm14(boolean z) {
        this.renderForm14 = z;
    }

    public String toString() {
        return "FormDetailsSuccessModel(renForm22=" + this.renForm22 + ", renForm25=" + this.renForm25 + ", renForm26=" + this.renForm26 + ", renForm28=" + this.renForm28 + ", renForm29=" + this.renForm29 + ", renForm30=" + this.renForm30 + ", renForm31=" + this.renForm31 + ", renForm32=" + this.renForm32 + ", renForm33=" + this.renForm33 + ", renForm34=" + this.renForm34 + ", renForm35=" + this.renForm35 + ", renForm36=" + this.renForm36 + ", pur_cd=" + this.pur_cd + ", rcpt_no=" + this.rcpt_no + ", renderForm14=" + this.renderForm14 + ", errorcode=" + this.errorcode + ", errorDesc=" + this.errorDesc + ')';
    }
}
