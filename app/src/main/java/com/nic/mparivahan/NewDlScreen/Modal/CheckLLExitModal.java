package com.nic.mparivahan.NewDlScreen.Modal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.zepto.xy5;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bHÆ\u0003J;\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001R*\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006 "}, d2 = {"Lcom/nic/mparivahan/NewDlScreen/Modal/CheckLLExitModal;", "Landroid/os/Parcelable;", "statusCd", "", "statusDesc", "LLDetails", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/NewDlScreen/Modal/LLDetailsResultModal;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getLLDetails", "()Ljava/util/ArrayList;", "getStatusCd", "()Ljava/lang/String;", "getStatusDesc", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CheckLLExitModal implements Parcelable {
    public static final Parcelable.Creator<CheckLLExitModal> CREATOR = new a();

    @xy5("LLDetails")
    private final ArrayList<LLDetailsResultModal> LLDetails;

    @xy5("status_code")
    private final String statusCd;

    @xy5("status_desc")
    private final String statusDesc;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CheckLLExitModal createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(LLDetailsResultModal.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new CheckLLExitModal(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CheckLLExitModal[] newArray(int i) {
            return new CheckLLExitModal[i];
        }
    }

    public CheckLLExitModal() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckLLExitModal copy$default(CheckLLExitModal checkLLExitModal, String str, String str2, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkLLExitModal.statusCd;
        }
        if ((i & 2) != 0) {
            str2 = checkLLExitModal.statusDesc;
        }
        if ((i & 4) != 0) {
            arrayList = checkLLExitModal.LLDetails;
        }
        return checkLLExitModal.copy(str, str2, arrayList);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatusCd() {
        return this.statusCd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final ArrayList<LLDetailsResultModal> component3() {
        return this.LLDetails;
    }

    public final CheckLLExitModal copy(String statusCd, String statusDesc, ArrayList<LLDetailsResultModal> LLDetails) {
        Intrinsics.checkNotNullParameter(statusCd, "statusCd");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        return new CheckLLExitModal(statusCd, statusDesc, LLDetails);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckLLExitModal)) {
            return false;
        }
        CheckLLExitModal checkLLExitModal = (CheckLLExitModal) other;
        return Intrinsics.areEqual(this.statusCd, checkLLExitModal.statusCd) && Intrinsics.areEqual(this.statusDesc, checkLLExitModal.statusDesc) && Intrinsics.areEqual(this.LLDetails, checkLLExitModal.LLDetails);
    }

    public final ArrayList<LLDetailsResultModal> getLLDetails() {
        return this.LLDetails;
    }

    public final String getStatusCd() {
        return this.statusCd;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        int iHashCode = ((this.statusCd.hashCode() * 31) + this.statusDesc.hashCode()) * 31;
        ArrayList<LLDetailsResultModal> arrayList = this.LLDetails;
        return iHashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    public String toString() {
        return "CheckLLExitModal(statusCd=" + this.statusCd + ", statusDesc=" + this.statusDesc + ", LLDetails=" + this.LLDetails + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.statusCd);
        parcel.writeString(this.statusDesc);
        ArrayList<LLDetailsResultModal> arrayList = this.LLDetails;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList.size());
        Iterator<LLDetailsResultModal> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }

    public CheckLLExitModal(String statusCd, String statusDesc, ArrayList<LLDetailsResultModal> arrayList) {
        Intrinsics.checkNotNullParameter(statusCd, "statusCd");
        Intrinsics.checkNotNullParameter(statusDesc, "statusDesc");
        this.statusCd = statusCd;
        this.statusDesc = statusDesc;
        this.LLDetails = arrayList;
    }

    public /* synthetic */ CheckLLExitModal(String str, String str2, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : arrayList);
    }
}
