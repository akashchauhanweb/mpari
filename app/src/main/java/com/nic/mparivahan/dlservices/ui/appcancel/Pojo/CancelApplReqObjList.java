package com.nic.mparivahan.dlservices.ui.appcancel.Pojo;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/appcancel/Pojo/CancelApplReqObjList;", "Landroid/os/Parcelable;", "trtrcd", "", "covs", "", "covcd", "transaction", "trans", "slno", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCovcd", "()Ljava/lang/String;", "getCovs", "getSlno", "getTrans", "getTransaction", "getTrtrcd", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CancelApplReqObjList implements Parcelable {
    public static final Parcelable.Creator<CancelApplReqObjList> CREATOR = new a();
    private final String covcd;
    private final String covs;
    private final String slno;
    private final String trans;
    private final String transaction;
    private final int trtrcd;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CancelApplReqObjList createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CancelApplReqObjList(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CancelApplReqObjList[] newArray(int i) {
            return new CancelApplReqObjList[i];
        }
    }

    public CancelApplReqObjList() {
        this(0, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ CancelApplReqObjList copy$default(CancelApplReqObjList cancelApplReqObjList, int i, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cancelApplReqObjList.trtrcd;
        }
        if ((i2 & 2) != 0) {
            str = cancelApplReqObjList.covs;
        }
        String str6 = str;
        if ((i2 & 4) != 0) {
            str2 = cancelApplReqObjList.covcd;
        }
        String str7 = str2;
        if ((i2 & 8) != 0) {
            str3 = cancelApplReqObjList.transaction;
        }
        String str8 = str3;
        if ((i2 & 16) != 0) {
            str4 = cancelApplReqObjList.trans;
        }
        String str9 = str4;
        if ((i2 & 32) != 0) {
            str5 = cancelApplReqObjList.slno;
        }
        return cancelApplReqObjList.copy(i, str6, str7, str8, str9, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTrtrcd() {
        return this.trtrcd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCovs() {
        return this.covs;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCovcd() {
        return this.covcd;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTransaction() {
        return this.transaction;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTrans() {
        return this.trans;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSlno() {
        return this.slno;
    }

    public final CancelApplReqObjList copy(int trtrcd, String covs, String covcd, String transaction, String trans, String slno) {
        Intrinsics.checkNotNullParameter(covs, "covs");
        Intrinsics.checkNotNullParameter(covcd, "covcd");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(trans, "trans");
        Intrinsics.checkNotNullParameter(slno, "slno");
        return new CancelApplReqObjList(trtrcd, covs, covcd, transaction, trans, slno);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CancelApplReqObjList)) {
            return false;
        }
        CancelApplReqObjList cancelApplReqObjList = (CancelApplReqObjList) other;
        return this.trtrcd == cancelApplReqObjList.trtrcd && Intrinsics.areEqual(this.covs, cancelApplReqObjList.covs) && Intrinsics.areEqual(this.covcd, cancelApplReqObjList.covcd) && Intrinsics.areEqual(this.transaction, cancelApplReqObjList.transaction) && Intrinsics.areEqual(this.trans, cancelApplReqObjList.trans) && Intrinsics.areEqual(this.slno, cancelApplReqObjList.slno);
    }

    public final String getCovcd() {
        return this.covcd;
    }

    public final String getCovs() {
        return this.covs;
    }

    public final String getSlno() {
        return this.slno;
    }

    public final String getTrans() {
        return this.trans;
    }

    public final String getTransaction() {
        return this.transaction;
    }

    public final int getTrtrcd() {
        return this.trtrcd;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.trtrcd) * 31) + this.covs.hashCode()) * 31) + this.covcd.hashCode()) * 31) + this.transaction.hashCode()) * 31) + this.trans.hashCode()) * 31) + this.slno.hashCode();
    }

    public String toString() {
        return "CancelApplReqObjList(trtrcd=" + this.trtrcd + ", covs=" + this.covs + ", covcd=" + this.covcd + ", transaction=" + this.transaction + ", trans=" + this.trans + ", slno=" + this.slno + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.trtrcd);
        parcel.writeString(this.covs);
        parcel.writeString(this.covcd);
        parcel.writeString(this.transaction);
        parcel.writeString(this.trans);
        parcel.writeString(this.slno);
    }

    public CancelApplReqObjList(int i, String covs, String covcd, String transaction, String trans, String slno) {
        Intrinsics.checkNotNullParameter(covs, "covs");
        Intrinsics.checkNotNullParameter(covcd, "covcd");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(trans, "trans");
        Intrinsics.checkNotNullParameter(slno, "slno");
        this.trtrcd = i;
        this.covs = covs;
        this.covcd = covcd;
        this.transaction = transaction;
        this.trans = trans;
        this.slno = slno;
    }

    public /* synthetic */ CancelApplReqObjList(int i, String str, String str2, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) == 0 ? str5 : "");
    }
}
