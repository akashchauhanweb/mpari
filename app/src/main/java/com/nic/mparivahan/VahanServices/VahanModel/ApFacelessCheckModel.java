package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0001HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003Jy\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\fHÖ\u0001J\t\u0010/\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012¨\u00060"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanModel/ApFacelessCheckModel;", "", "aadhaaraddresspermanent", "", "auth_signtaure_fornon_indv_vehicle", "buyer_exactname", "buyer_prcnt_match", "careof_name", "exactname", "facelesswithaadharonly", "", "partial_match", "", "self_name", "state_cd", "updatemoballowonadharfailed", "(ZZZLjava/lang/Object;ZZLjava/lang/String;IZLjava/lang/String;Z)V", "getAadhaaraddresspermanent", "()Z", "getAuth_signtaure_fornon_indv_vehicle", "getBuyer_exactname", "getBuyer_prcnt_match", "()Ljava/lang/Object;", "getCareof_name", "getExactname", "getFacelesswithaadharonly", "()Ljava/lang/String;", "getPartial_match", "()I", "getSelf_name", "getState_cd", "getUpdatemoballowonadharfailed", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ApFacelessCheckModel {
    private final boolean aadhaaraddresspermanent;
    private final boolean auth_signtaure_fornon_indv_vehicle;
    private final boolean buyer_exactname;
    private final Object buyer_prcnt_match;
    private final boolean careof_name;
    private final boolean exactname;
    private final String facelesswithaadharonly;
    private final int partial_match;
    private final boolean self_name;
    private final String state_cd;
    private final boolean updatemoballowonadharfailed;

    public ApFacelessCheckModel(boolean z, boolean z2, boolean z3, Object buyer_prcnt_match, boolean z4, boolean z5, String str, int i, boolean z6, String state_cd, boolean z7) {
        Intrinsics.checkNotNullParameter(buyer_prcnt_match, "buyer_prcnt_match");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        this.aadhaaraddresspermanent = z;
        this.auth_signtaure_fornon_indv_vehicle = z2;
        this.buyer_exactname = z3;
        this.buyer_prcnt_match = buyer_prcnt_match;
        this.careof_name = z4;
        this.exactname = z5;
        this.facelesswithaadharonly = str;
        this.partial_match = i;
        this.self_name = z6;
        this.state_cd = state_cd;
        this.updatemoballowonadharfailed = z7;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getAadhaaraddresspermanent() {
        return this.aadhaaraddresspermanent;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getUpdatemoballowonadharfailed() {
        return this.updatemoballowonadharfailed;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getAuth_signtaure_fornon_indv_vehicle() {
        return this.auth_signtaure_fornon_indv_vehicle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getBuyer_exactname() {
        return this.buyer_exactname;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Object getBuyer_prcnt_match() {
        return this.buyer_prcnt_match;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getCareof_name() {
        return this.careof_name;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getExactname() {
        return this.exactname;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFacelesswithaadharonly() {
        return this.facelesswithaadharonly;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getPartial_match() {
        return this.partial_match;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getSelf_name() {
        return this.self_name;
    }

    public final ApFacelessCheckModel copy(boolean aadhaaraddresspermanent, boolean auth_signtaure_fornon_indv_vehicle, boolean buyer_exactname, Object buyer_prcnt_match, boolean careof_name, boolean exactname, String facelesswithaadharonly, int partial_match, boolean self_name, String state_cd, boolean updatemoballowonadharfailed) {
        Intrinsics.checkNotNullParameter(buyer_prcnt_match, "buyer_prcnt_match");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        return new ApFacelessCheckModel(aadhaaraddresspermanent, auth_signtaure_fornon_indv_vehicle, buyer_exactname, buyer_prcnt_match, careof_name, exactname, facelesswithaadharonly, partial_match, self_name, state_cd, updatemoballowonadharfailed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApFacelessCheckModel)) {
            return false;
        }
        ApFacelessCheckModel apFacelessCheckModel = (ApFacelessCheckModel) other;
        return this.aadhaaraddresspermanent == apFacelessCheckModel.aadhaaraddresspermanent && this.auth_signtaure_fornon_indv_vehicle == apFacelessCheckModel.auth_signtaure_fornon_indv_vehicle && this.buyer_exactname == apFacelessCheckModel.buyer_exactname && Intrinsics.areEqual(this.buyer_prcnt_match, apFacelessCheckModel.buyer_prcnt_match) && this.careof_name == apFacelessCheckModel.careof_name && this.exactname == apFacelessCheckModel.exactname && Intrinsics.areEqual(this.facelesswithaadharonly, apFacelessCheckModel.facelesswithaadharonly) && this.partial_match == apFacelessCheckModel.partial_match && this.self_name == apFacelessCheckModel.self_name && Intrinsics.areEqual(this.state_cd, apFacelessCheckModel.state_cd) && this.updatemoballowonadharfailed == apFacelessCheckModel.updatemoballowonadharfailed;
    }

    public final boolean getAadhaaraddresspermanent() {
        return this.aadhaaraddresspermanent;
    }

    public final boolean getAuth_signtaure_fornon_indv_vehicle() {
        return this.auth_signtaure_fornon_indv_vehicle;
    }

    public final boolean getBuyer_exactname() {
        return this.buyer_exactname;
    }

    public final Object getBuyer_prcnt_match() {
        return this.buyer_prcnt_match;
    }

    public final boolean getCareof_name() {
        return this.careof_name;
    }

    public final boolean getExactname() {
        return this.exactname;
    }

    public final String getFacelesswithaadharonly() {
        return this.facelesswithaadharonly;
    }

    public final int getPartial_match() {
        return this.partial_match;
    }

    public final boolean getSelf_name() {
        return this.self_name;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final boolean getUpdatemoballowonadharfailed() {
        return this.updatemoballowonadharfailed;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v16, types: [int] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    public int hashCode() {
        boolean z = this.aadhaaraddresspermanent;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.auth_signtaure_fornon_indv_vehicle;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.buyer_exactname;
        ?? r22 = z3;
        if (z3) {
            r22 = 1;
        }
        int iHashCode = (((i2 + r22) * 31) + this.buyer_prcnt_match.hashCode()) * 31;
        boolean z4 = this.careof_name;
        ?? r23 = z4;
        if (z4) {
            r23 = 1;
        }
        int i3 = (iHashCode + r23) * 31;
        boolean z5 = this.exactname;
        ?? r24 = z5;
        if (z5) {
            r24 = 1;
        }
        int i4 = (i3 + r24) * 31;
        String str = this.facelesswithaadharonly;
        int iHashCode2 = (((i4 + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.partial_match)) * 31;
        boolean z6 = this.self_name;
        ?? r25 = z6;
        if (z6) {
            r25 = 1;
        }
        int iHashCode3 = (((iHashCode2 + r25) * 31) + this.state_cd.hashCode()) * 31;
        boolean z7 = this.updatemoballowonadharfailed;
        return iHashCode3 + (z7 ? 1 : z7);
    }

    public String toString() {
        return "ApFacelessCheckModel(aadhaaraddresspermanent=" + this.aadhaaraddresspermanent + ", auth_signtaure_fornon_indv_vehicle=" + this.auth_signtaure_fornon_indv_vehicle + ", buyer_exactname=" + this.buyer_exactname + ", buyer_prcnt_match=" + this.buyer_prcnt_match + ", careof_name=" + this.careof_name + ", exactname=" + this.exactname + ", facelesswithaadharonly=" + this.facelesswithaadharonly + ", partial_match=" + this.partial_match + ", self_name=" + this.self_name + ", state_cd=" + this.state_cd + ", updatemoballowonadharfailed=" + this.updatemoballowonadharfailed + ')';
    }
}
