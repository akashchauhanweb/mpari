package com.nic.mparivahan.VahanServices.Model;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/nic/mparivahan/VahanServices/Model/VTHypthEntity;", "Ljava/io/Serializable;", "fncr_add1", "", "fncr_add2", "fncr_add3", "fncr_name", "fncr_state", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFncr_add1", "()Ljava/lang/String;", "getFncr_add2", "getFncr_add3", "getFncr_name", "getFncr_state", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VTHypthEntity implements Serializable {
    private final String fncr_add1;
    private final String fncr_add2;
    private final String fncr_add3;
    private final String fncr_name;
    private final String fncr_state;

    public VTHypthEntity(String str, String str2, String str3, String str4, String str5) {
        this.fncr_add1 = str;
        this.fncr_add2 = str2;
        this.fncr_add3 = str3;
        this.fncr_name = str4;
        this.fncr_state = str5;
    }

    public static /* synthetic */ VTHypthEntity copy$default(VTHypthEntity vTHypthEntity, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vTHypthEntity.fncr_add1;
        }
        if ((i & 2) != 0) {
            str2 = vTHypthEntity.fncr_add2;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = vTHypthEntity.fncr_add3;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = vTHypthEntity.fncr_name;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = vTHypthEntity.fncr_state;
        }
        return vTHypthEntity.copy(str, str6, str7, str8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFncr_add1() {
        return this.fncr_add1;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFncr_add2() {
        return this.fncr_add2;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFncr_add3() {
        return this.fncr_add3;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFncr_name() {
        return this.fncr_name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFncr_state() {
        return this.fncr_state;
    }

    public final VTHypthEntity copy(String fncr_add1, String fncr_add2, String fncr_add3, String fncr_name, String fncr_state) {
        return new VTHypthEntity(fncr_add1, fncr_add2, fncr_add3, fncr_name, fncr_state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VTHypthEntity)) {
            return false;
        }
        VTHypthEntity vTHypthEntity = (VTHypthEntity) other;
        return Intrinsics.areEqual(this.fncr_add1, vTHypthEntity.fncr_add1) && Intrinsics.areEqual(this.fncr_add2, vTHypthEntity.fncr_add2) && Intrinsics.areEqual(this.fncr_add3, vTHypthEntity.fncr_add3) && Intrinsics.areEqual(this.fncr_name, vTHypthEntity.fncr_name) && Intrinsics.areEqual(this.fncr_state, vTHypthEntity.fncr_state);
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

    public final String getFncr_name() {
        return this.fncr_name;
    }

    public final String getFncr_state() {
        return this.fncr_state;
    }

    public int hashCode() {
        String str = this.fncr_add1;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fncr_add2;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fncr_add3;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fncr_name;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fncr_state;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "VTHypthEntity(fncr_add1=" + this.fncr_add1 + ", fncr_add2=" + this.fncr_add2 + ", fncr_add3=" + this.fncr_add3 + ", fncr_name=" + this.fncr_name + ", fncr_state=" + this.fncr_state + ')';
    }
}
