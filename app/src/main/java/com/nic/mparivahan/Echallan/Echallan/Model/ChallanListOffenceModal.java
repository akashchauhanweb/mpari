package com.nic.mparivahan.Echallan.Echallan.Model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/nic/mparivahan/Echallan/Echallan/Model/ChallanListOffenceModal;", "Landroid/os/Parcelable;", "offenceName", "", "offenceId", "", "(Ljava/lang/String;I)V", "getOffenceId", "()I", "getOffenceName", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ChallanListOffenceModal implements Parcelable {
    public static final Parcelable.Creator<ChallanListOffenceModal> CREATOR = new a();

    @xy5("offence_id")
    private final int offenceId;

    @xy5("offence_name")
    private final String offenceName;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChallanListOffenceModal createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChallanListOffenceModal(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ChallanListOffenceModal[] newArray(int i) {
            return new ChallanListOffenceModal[i];
        }
    }

    public ChallanListOffenceModal() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ChallanListOffenceModal copy$default(ChallanListOffenceModal challanListOffenceModal, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = challanListOffenceModal.offenceName;
        }
        if ((i2 & 2) != 0) {
            i = challanListOffenceModal.offenceId;
        }
        return challanListOffenceModal.copy(str, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOffenceName() {
        return this.offenceName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getOffenceId() {
        return this.offenceId;
    }

    public final ChallanListOffenceModal copy(String offenceName, int offenceId) {
        Intrinsics.checkNotNullParameter(offenceName, "offenceName");
        return new ChallanListOffenceModal(offenceName, offenceId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallanListOffenceModal)) {
            return false;
        }
        ChallanListOffenceModal challanListOffenceModal = (ChallanListOffenceModal) other;
        return Intrinsics.areEqual(this.offenceName, challanListOffenceModal.offenceName) && this.offenceId == challanListOffenceModal.offenceId;
    }

    public final int getOffenceId() {
        return this.offenceId;
    }

    public final String getOffenceName() {
        return this.offenceName;
    }

    public int hashCode() {
        return (this.offenceName.hashCode() * 31) + Integer.hashCode(this.offenceId);
    }

    public String toString() {
        return "ChallanListOffenceModal(offenceName=" + this.offenceName + ", offenceId=" + this.offenceId + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.offenceName);
        parcel.writeInt(this.offenceId);
    }

    public ChallanListOffenceModal(String offenceName, int i) {
        Intrinsics.checkNotNullParameter(offenceName, "offenceName");
        this.offenceName = offenceName;
        this.offenceId = i;
    }

    public /* synthetic */ ChallanListOffenceModal(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }
}
