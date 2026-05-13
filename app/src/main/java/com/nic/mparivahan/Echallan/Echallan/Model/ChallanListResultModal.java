package com.nic.mparivahan.Echallan.Echallan.Model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.zepto.xy5;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0019\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eHÆ\u0003Js\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eHÆ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020&HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020&HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R&\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u00062"}, d2 = {"Lcom/nic/mparivahan/Echallan/Echallan/Model/ChallanListResultModal;", "Landroid/os/Parcelable;", "accusedName", "", "docNo", "dlNo", "stateCd", "challanNo", "challanDateTime", "status", "challanPlace", "offences", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/Echallan/Echallan/Model/ChallanListOffenceModal;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getAccusedName", "()Ljava/lang/String;", "getChallanDateTime", "getChallanNo", "getChallanPlace", "getDlNo", "getDocNo", "getOffences", "()Ljava/util/ArrayList;", "getStateCd", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ChallanListResultModal implements Parcelable {
    public static final Parcelable.Creator<ChallanListResultModal> CREATOR = new a();

    @xy5("accused_name")
    private final String accusedName;

    @xy5("challan_date_time")
    private final String challanDateTime;

    @xy5("challan_no")
    private final String challanNo;

    @xy5("challan_place")
    private final String challanPlace;

    @xy5("dl_no")
    private final String dlNo;

    @xy5("doc_no")
    private final String docNo;

    @xy5("offences")
    private final ArrayList<ChallanListOffenceModal> offences;

    @xy5("state_cd")
    private final String stateCd;

    @xy5("status")
    private final String status;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChallanListResultModal createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ChallanListOffenceModal.CREATOR.createFromParcel(parcel));
            }
            return new ChallanListResultModal(string, string2, string3, string4, string5, string6, string7, string8, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ChallanListResultModal[] newArray(int i) {
            return new ChallanListResultModal[i];
        }
    }

    public ChallanListResultModal() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccusedName() {
        return this.accusedName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDocNo() {
        return this.docNo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDlNo() {
        return this.dlNo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStateCd() {
        return this.stateCd;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getChallanNo() {
        return this.challanNo;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getChallanDateTime() {
        return this.challanDateTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getChallanPlace() {
        return this.challanPlace;
    }

    public final ArrayList<ChallanListOffenceModal> component9() {
        return this.offences;
    }

    public final ChallanListResultModal copy(String accusedName, String docNo, String dlNo, String stateCd, String challanNo, String challanDateTime, String status, String challanPlace, ArrayList<ChallanListOffenceModal> offences) {
        Intrinsics.checkNotNullParameter(accusedName, "accusedName");
        Intrinsics.checkNotNullParameter(docNo, "docNo");
        Intrinsics.checkNotNullParameter(dlNo, "dlNo");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(challanNo, "challanNo");
        Intrinsics.checkNotNullParameter(challanDateTime, "challanDateTime");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(challanPlace, "challanPlace");
        Intrinsics.checkNotNullParameter(offences, "offences");
        return new ChallanListResultModal(accusedName, docNo, dlNo, stateCd, challanNo, challanDateTime, status, challanPlace, offences);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallanListResultModal)) {
            return false;
        }
        ChallanListResultModal challanListResultModal = (ChallanListResultModal) other;
        return Intrinsics.areEqual(this.accusedName, challanListResultModal.accusedName) && Intrinsics.areEqual(this.docNo, challanListResultModal.docNo) && Intrinsics.areEqual(this.dlNo, challanListResultModal.dlNo) && Intrinsics.areEqual(this.stateCd, challanListResultModal.stateCd) && Intrinsics.areEqual(this.challanNo, challanListResultModal.challanNo) && Intrinsics.areEqual(this.challanDateTime, challanListResultModal.challanDateTime) && Intrinsics.areEqual(this.status, challanListResultModal.status) && Intrinsics.areEqual(this.challanPlace, challanListResultModal.challanPlace) && Intrinsics.areEqual(this.offences, challanListResultModal.offences);
    }

    public final String getAccusedName() {
        return this.accusedName;
    }

    public final String getChallanDateTime() {
        return this.challanDateTime;
    }

    public final String getChallanNo() {
        return this.challanNo;
    }

    public final String getChallanPlace() {
        return this.challanPlace;
    }

    public final String getDlNo() {
        return this.dlNo;
    }

    public final String getDocNo() {
        return this.docNo;
    }

    public final ArrayList<ChallanListOffenceModal> getOffences() {
        return this.offences;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((((((((((this.accusedName.hashCode() * 31) + this.docNo.hashCode()) * 31) + this.dlNo.hashCode()) * 31) + this.stateCd.hashCode()) * 31) + this.challanNo.hashCode()) * 31) + this.challanDateTime.hashCode()) * 31) + this.status.hashCode()) * 31) + this.challanPlace.hashCode()) * 31) + this.offences.hashCode();
    }

    public String toString() {
        return "ChallanListResultModal(accusedName=" + this.accusedName + ", docNo=" + this.docNo + ", dlNo=" + this.dlNo + ", stateCd=" + this.stateCd + ", challanNo=" + this.challanNo + ", challanDateTime=" + this.challanDateTime + ", status=" + this.status + ", challanPlace=" + this.challanPlace + ", offences=" + this.offences + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.accusedName);
        parcel.writeString(this.docNo);
        parcel.writeString(this.dlNo);
        parcel.writeString(this.stateCd);
        parcel.writeString(this.challanNo);
        parcel.writeString(this.challanDateTime);
        parcel.writeString(this.status);
        parcel.writeString(this.challanPlace);
        ArrayList<ChallanListOffenceModal> arrayList = this.offences;
        parcel.writeInt(arrayList.size());
        Iterator<ChallanListOffenceModal> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }

    public ChallanListResultModal(String accusedName, String docNo, String dlNo, String stateCd, String challanNo, String challanDateTime, String status, String challanPlace, ArrayList<ChallanListOffenceModal> offences) {
        Intrinsics.checkNotNullParameter(accusedName, "accusedName");
        Intrinsics.checkNotNullParameter(docNo, "docNo");
        Intrinsics.checkNotNullParameter(dlNo, "dlNo");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(challanNo, "challanNo");
        Intrinsics.checkNotNullParameter(challanDateTime, "challanDateTime");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(challanPlace, "challanPlace");
        Intrinsics.checkNotNullParameter(offences, "offences");
        this.accusedName = accusedName;
        this.docNo = docNo;
        this.dlNo = dlNo;
        this.stateCd = stateCd;
        this.challanNo = challanNo;
        this.challanDateTime = challanDateTime;
        this.status = status;
        this.challanPlace = challanPlace;
        this.offences = offences;
    }

    public /* synthetic */ ChallanListResultModal(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "", (i & 256) != 0 ? new ArrayList() : arrayList);
    }
}
