package com.nic.mparivahan.NewDlScreen.Modal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/nic/mparivahan/NewDlScreen/Modal/CheckCovs;", "Landroid/os/Parcelable;", "covCode", "", "covAbbrDesc", "(Ljava/lang/String;Ljava/lang/String;)V", "getCovAbbrDesc", "()Ljava/lang/String;", "setCovAbbrDesc", "(Ljava/lang/String;)V", "getCovCode", "setCovCode", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CheckCovs implements Parcelable {
    public static final Parcelable.Creator<CheckCovs> CREATOR = new a();

    @xy5("covAbbrDesc")
    private String covAbbrDesc;

    @xy5("covCode")
    private String covCode;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CheckCovs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CheckCovs(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CheckCovs[] newArray(int i) {
            return new CheckCovs[i];
        }
    }

    public CheckCovs() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CheckCovs copy$default(CheckCovs checkCovs, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkCovs.covCode;
        }
        if ((i & 2) != 0) {
            str2 = checkCovs.covAbbrDesc;
        }
        return checkCovs.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCovCode() {
        return this.covCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCovAbbrDesc() {
        return this.covAbbrDesc;
    }

    public final CheckCovs copy(String covCode, String covAbbrDesc) {
        return new CheckCovs(covCode, covAbbrDesc);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckCovs)) {
            return false;
        }
        CheckCovs checkCovs = (CheckCovs) other;
        return Intrinsics.areEqual(this.covCode, checkCovs.covCode) && Intrinsics.areEqual(this.covAbbrDesc, checkCovs.covAbbrDesc);
    }

    public final String getCovAbbrDesc() {
        return this.covAbbrDesc;
    }

    public final String getCovCode() {
        return this.covCode;
    }

    public int hashCode() {
        String str = this.covCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.covAbbrDesc;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setCovAbbrDesc(String str) {
        this.covAbbrDesc = str;
    }

    public final void setCovCode(String str) {
        this.covCode = str;
    }

    public String toString() {
        return "CheckCovs(covCode=" + this.covCode + ", covAbbrDesc=" + this.covAbbrDesc + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.covCode);
        parcel.writeString(this.covAbbrDesc);
    }

    public CheckCovs(String str, String str2) {
        this.covCode = str;
        this.covAbbrDesc = str2;
    }

    public /* synthetic */ CheckCovs(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
