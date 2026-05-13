package com.nic.mparivahan.dlservices.ui.appcancel.Pojo;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bHÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001R!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006 "}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/appcancel/Pojo/DLDetailsForCancelApplPojo;", "Landroid/os/Parcelable;", "status_code", "", "status_desc", "Slot_Details", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/dlservices/ui/appcancel/Pojo/CancelApplSlotDetailsPojo;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getSlot_Details", "()Ljava/util/ArrayList;", "getStatus_code", "()Ljava/lang/String;", "getStatus_desc", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DLDetailsForCancelApplPojo implements Parcelable {
    public static final Parcelable.Creator<DLDetailsForCancelApplPojo> CREATOR = new a();
    private final ArrayList<CancelApplSlotDetailsPojo> Slot_Details;
    private final String status_code;
    private final String status_desc;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DLDetailsForCancelApplPojo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(CancelApplSlotDetailsPojo.CREATOR.createFromParcel(parcel));
            }
            return new DLDetailsForCancelApplPojo(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DLDetailsForCancelApplPojo[] newArray(int i) {
            return new DLDetailsForCancelApplPojo[i];
        }
    }

    public DLDetailsForCancelApplPojo(String status_code, String status_desc, ArrayList<CancelApplSlotDetailsPojo> Slot_Details) {
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        Intrinsics.checkNotNullParameter(Slot_Details, "Slot_Details");
        this.status_code = status_code;
        this.status_desc = status_desc;
        this.Slot_Details = Slot_Details;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DLDetailsForCancelApplPojo copy$default(DLDetailsForCancelApplPojo dLDetailsForCancelApplPojo, String str, String str2, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dLDetailsForCancelApplPojo.status_code;
        }
        if ((i & 2) != 0) {
            str2 = dLDetailsForCancelApplPojo.status_desc;
        }
        if ((i & 4) != 0) {
            arrayList = dLDetailsForCancelApplPojo.Slot_Details;
        }
        return dLDetailsForCancelApplPojo.copy(str, str2, arrayList);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatus_code() {
        return this.status_code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus_desc() {
        return this.status_desc;
    }

    public final ArrayList<CancelApplSlotDetailsPojo> component3() {
        return this.Slot_Details;
    }

    public final DLDetailsForCancelApplPojo copy(String status_code, String status_desc, ArrayList<CancelApplSlotDetailsPojo> Slot_Details) {
        Intrinsics.checkNotNullParameter(status_code, "status_code");
        Intrinsics.checkNotNullParameter(status_desc, "status_desc");
        Intrinsics.checkNotNullParameter(Slot_Details, "Slot_Details");
        return new DLDetailsForCancelApplPojo(status_code, status_desc, Slot_Details);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DLDetailsForCancelApplPojo)) {
            return false;
        }
        DLDetailsForCancelApplPojo dLDetailsForCancelApplPojo = (DLDetailsForCancelApplPojo) other;
        return Intrinsics.areEqual(this.status_code, dLDetailsForCancelApplPojo.status_code) && Intrinsics.areEqual(this.status_desc, dLDetailsForCancelApplPojo.status_desc) && Intrinsics.areEqual(this.Slot_Details, dLDetailsForCancelApplPojo.Slot_Details);
    }

    public final ArrayList<CancelApplSlotDetailsPojo> getSlot_Details() {
        return this.Slot_Details;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (((this.status_code.hashCode() * 31) + this.status_desc.hashCode()) * 31) + this.Slot_Details.hashCode();
    }

    public String toString() {
        return "DLDetailsForCancelApplPojo(status_code=" + this.status_code + ", status_desc=" + this.status_desc + ", Slot_Details=" + this.Slot_Details + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.status_code);
        parcel.writeString(this.status_desc);
        ArrayList<CancelApplSlotDetailsPojo> arrayList = this.Slot_Details;
        parcel.writeInt(arrayList.size());
        Iterator<CancelApplSlotDetailsPojo> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ DLDetailsForCancelApplPojo(String str, String str2, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, arrayList);
    }
}
