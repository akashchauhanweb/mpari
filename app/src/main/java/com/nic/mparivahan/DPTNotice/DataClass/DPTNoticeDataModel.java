package com.nic.mparivahan.DPTNotice.DataClass;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\u0095\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\t\u00102\u001a\u00020\u0005HÖ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u00020\u0005HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001J\u0019\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014¨\u0006>"}, d2 = {"Lcom/nic/mparivahan/DPTNotice/DataClass/DPTNoticeDataModel;", "Landroid/os/Parcelable;", "offence_name", "", "amount", "", "challan_no", "status", "date_time", "doc_no", "state_cd", "rto_cd", "vcourt_eligible", "area_name", "payment_eligible", "status_txt", "pdf_url", "owner_name", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()I", "getArea_name", "()Ljava/lang/String;", "getChallan_no", "getDate_time", "getDoc_no", "getOffence_name", "getOwner_name", "getPayment_eligible", "getPdf_url", "getRto_cd", "getState_cd", "getStatus", "getStatus_txt", "getVcourt_eligible", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DPTNoticeDataModel implements Parcelable {
    public static final Parcelable.Creator<DPTNoticeDataModel> CREATOR = new a();

    @xy5("amount")
    private final int amount;

    @xy5("area_name")
    private final String area_name;

    @xy5("challan_no")
    private final int challan_no;

    @xy5("date_time")
    private final String date_time;

    @xy5("doc_no")
    private final String doc_no;

    @xy5("offence_name")
    private final String offence_name;

    @xy5("owner_name")
    private final String owner_name;

    @xy5("payment_eligible")
    private final int payment_eligible;

    @xy5("pdf_url")
    private final String pdf_url;

    @xy5("rto_cd")
    private final int rto_cd;

    @xy5("state_cd")
    private final String state_cd;

    @xy5("status")
    private final String status;

    @xy5("status_txt")
    private final String status_txt;

    @xy5("vcourt_eligible")
    private final int vcourt_eligible;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DPTNoticeDataModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DPTNoticeDataModel(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DPTNoticeDataModel[] newArray(int i) {
            return new DPTNoticeDataModel[i];
        }
    }

    public DPTNoticeDataModel(String offence_name, int i, int i2, String status, String date_time, String doc_no, String state_cd, int i3, int i4, String area_name, int i5, String status_txt, String pdf_url, String owner_name) {
        Intrinsics.checkNotNullParameter(offence_name, "offence_name");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(date_time, "date_time");
        Intrinsics.checkNotNullParameter(doc_no, "doc_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(area_name, "area_name");
        Intrinsics.checkNotNullParameter(status_txt, "status_txt");
        Intrinsics.checkNotNullParameter(pdf_url, "pdf_url");
        Intrinsics.checkNotNullParameter(owner_name, "owner_name");
        this.offence_name = offence_name;
        this.amount = i;
        this.challan_no = i2;
        this.status = status;
        this.date_time = date_time;
        this.doc_no = doc_no;
        this.state_cd = state_cd;
        this.rto_cd = i3;
        this.vcourt_eligible = i4;
        this.area_name = area_name;
        this.payment_eligible = i5;
        this.status_txt = status_txt;
        this.pdf_url = pdf_url;
        this.owner_name = owner_name;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOffence_name() {
        return this.offence_name;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getArea_name() {
        return this.area_name;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getPayment_eligible() {
        return this.payment_eligible;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getStatus_txt() {
        return this.status_txt;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getPdf_url() {
        return this.pdf_url;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getOwner_name() {
        return this.owner_name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getChallan_no() {
        return this.challan_no;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDate_time() {
        return this.date_time;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDoc_no() {
        return this.doc_no;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getState_cd() {
        return this.state_cd;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getRto_cd() {
        return this.rto_cd;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getVcourt_eligible() {
        return this.vcourt_eligible;
    }

    public final DPTNoticeDataModel copy(String offence_name, int amount, int challan_no, String status, String date_time, String doc_no, String state_cd, int rto_cd, int vcourt_eligible, String area_name, int payment_eligible, String status_txt, String pdf_url, String owner_name) {
        Intrinsics.checkNotNullParameter(offence_name, "offence_name");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(date_time, "date_time");
        Intrinsics.checkNotNullParameter(doc_no, "doc_no");
        Intrinsics.checkNotNullParameter(state_cd, "state_cd");
        Intrinsics.checkNotNullParameter(area_name, "area_name");
        Intrinsics.checkNotNullParameter(status_txt, "status_txt");
        Intrinsics.checkNotNullParameter(pdf_url, "pdf_url");
        Intrinsics.checkNotNullParameter(owner_name, "owner_name");
        return new DPTNoticeDataModel(offence_name, amount, challan_no, status, date_time, doc_no, state_cd, rto_cd, vcourt_eligible, area_name, payment_eligible, status_txt, pdf_url, owner_name);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DPTNoticeDataModel)) {
            return false;
        }
        DPTNoticeDataModel dPTNoticeDataModel = (DPTNoticeDataModel) other;
        return Intrinsics.areEqual(this.offence_name, dPTNoticeDataModel.offence_name) && this.amount == dPTNoticeDataModel.amount && this.challan_no == dPTNoticeDataModel.challan_no && Intrinsics.areEqual(this.status, dPTNoticeDataModel.status) && Intrinsics.areEqual(this.date_time, dPTNoticeDataModel.date_time) && Intrinsics.areEqual(this.doc_no, dPTNoticeDataModel.doc_no) && Intrinsics.areEqual(this.state_cd, dPTNoticeDataModel.state_cd) && this.rto_cd == dPTNoticeDataModel.rto_cd && this.vcourt_eligible == dPTNoticeDataModel.vcourt_eligible && Intrinsics.areEqual(this.area_name, dPTNoticeDataModel.area_name) && this.payment_eligible == dPTNoticeDataModel.payment_eligible && Intrinsics.areEqual(this.status_txt, dPTNoticeDataModel.status_txt) && Intrinsics.areEqual(this.pdf_url, dPTNoticeDataModel.pdf_url) && Intrinsics.areEqual(this.owner_name, dPTNoticeDataModel.owner_name);
    }

    public final int getAmount() {
        return this.amount;
    }

    public final String getArea_name() {
        return this.area_name;
    }

    public final int getChallan_no() {
        return this.challan_no;
    }

    public final String getDate_time() {
        return this.date_time;
    }

    public final String getDoc_no() {
        return this.doc_no;
    }

    public final String getOffence_name() {
        return this.offence_name;
    }

    public final String getOwner_name() {
        return this.owner_name;
    }

    public final int getPayment_eligible() {
        return this.payment_eligible;
    }

    public final String getPdf_url() {
        return this.pdf_url;
    }

    public final int getRto_cd() {
        return this.rto_cd;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getStatus_txt() {
        return this.status_txt;
    }

    public final int getVcourt_eligible() {
        return this.vcourt_eligible;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.offence_name.hashCode() * 31) + Integer.hashCode(this.amount)) * 31) + Integer.hashCode(this.challan_no)) * 31) + this.status.hashCode()) * 31) + this.date_time.hashCode()) * 31) + this.doc_no.hashCode()) * 31) + this.state_cd.hashCode()) * 31) + Integer.hashCode(this.rto_cd)) * 31) + Integer.hashCode(this.vcourt_eligible)) * 31) + this.area_name.hashCode()) * 31) + Integer.hashCode(this.payment_eligible)) * 31) + this.status_txt.hashCode()) * 31) + this.pdf_url.hashCode()) * 31) + this.owner_name.hashCode();
    }

    public String toString() {
        return "DPTNoticeDataModel(offence_name=" + this.offence_name + ", amount=" + this.amount + ", challan_no=" + this.challan_no + ", status=" + this.status + ", date_time=" + this.date_time + ", doc_no=" + this.doc_no + ", state_cd=" + this.state_cd + ", rto_cd=" + this.rto_cd + ", vcourt_eligible=" + this.vcourt_eligible + ", area_name=" + this.area_name + ", payment_eligible=" + this.payment_eligible + ", status_txt=" + this.status_txt + ", pdf_url=" + this.pdf_url + ", owner_name=" + this.owner_name + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.offence_name);
        parcel.writeInt(this.amount);
        parcel.writeInt(this.challan_no);
        parcel.writeString(this.status);
        parcel.writeString(this.date_time);
        parcel.writeString(this.doc_no);
        parcel.writeString(this.state_cd);
        parcel.writeInt(this.rto_cd);
        parcel.writeInt(this.vcourt_eligible);
        parcel.writeString(this.area_name);
        parcel.writeInt(this.payment_eligible);
        parcel.writeString(this.status_txt);
        parcel.writeString(this.pdf_url);
        parcel.writeString(this.owner_name);
    }

    public /* synthetic */ DPTNoticeDataModel(String str, int i, int i2, String str2, String str3, String str4, String str5, int i3, int i4, String str6, int i5, String str7, String str8, String str9, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? 0 : i, (i6 & 4) != 0 ? 0 : i2, (i6 & 8) != 0 ? "" : str2, (i6 & 16) != 0 ? "" : str3, (i6 & 32) != 0 ? "" : str4, (i6 & 64) != 0 ? "" : str5, i3, i4, (i6 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? "" : str6, (i6 & 1024) != 0 ? 0 : i5, (i6 & 2048) != 0 ? "" : str7, (i6 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? "" : str8, (i6 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? "" : str9);
    }
}
