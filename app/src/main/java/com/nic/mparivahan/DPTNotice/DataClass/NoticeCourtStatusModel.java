package com.nic.mparivahan.DPTNotice.DataClass;

import androidx.annotation.Keep;
import com.zepto.xy5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/nic/mparivahan/DPTNotice/DataClass/NoticeCourtStatusModel;", "", "challan_no", "", "amount", "court_name", "", "court_address", "forword_date", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()I", "getChallan_no", "getCourt_address", "()Ljava/lang/String;", "getCourt_name", "getForword_date", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class NoticeCourtStatusModel {

    @xy5("amount")
    private final int amount;

    @xy5("challan_no")
    private final int challan_no;

    @xy5("court_address")
    private final String court_address;

    @xy5("court_name")
    private final String court_name;

    @xy5("forword_date")
    private final String forword_date;

    public NoticeCourtStatusModel() {
        this(0, 0, null, null, null, 31, null);
    }

    public static /* synthetic */ NoticeCourtStatusModel copy$default(NoticeCourtStatusModel noticeCourtStatusModel, int i, int i2, String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = noticeCourtStatusModel.challan_no;
        }
        if ((i3 & 2) != 0) {
            i2 = noticeCourtStatusModel.amount;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            str = noticeCourtStatusModel.court_name;
        }
        String str4 = str;
        if ((i3 & 8) != 0) {
            str2 = noticeCourtStatusModel.court_address;
        }
        String str5 = str2;
        if ((i3 & 16) != 0) {
            str3 = noticeCourtStatusModel.forword_date;
        }
        return noticeCourtStatusModel.copy(i, i4, str4, str5, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getChallan_no() {
        return this.challan_no;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCourt_name() {
        return this.court_name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCourt_address() {
        return this.court_address;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getForword_date() {
        return this.forword_date;
    }

    public final NoticeCourtStatusModel copy(int challan_no, int amount, String court_name, String court_address, String forword_date) {
        Intrinsics.checkNotNullParameter(court_name, "court_name");
        Intrinsics.checkNotNullParameter(court_address, "court_address");
        Intrinsics.checkNotNullParameter(forword_date, "forword_date");
        return new NoticeCourtStatusModel(challan_no, amount, court_name, court_address, forword_date);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoticeCourtStatusModel)) {
            return false;
        }
        NoticeCourtStatusModel noticeCourtStatusModel = (NoticeCourtStatusModel) other;
        return this.challan_no == noticeCourtStatusModel.challan_no && this.amount == noticeCourtStatusModel.amount && Intrinsics.areEqual(this.court_name, noticeCourtStatusModel.court_name) && Intrinsics.areEqual(this.court_address, noticeCourtStatusModel.court_address) && Intrinsics.areEqual(this.forword_date, noticeCourtStatusModel.forword_date);
    }

    public final int getAmount() {
        return this.amount;
    }

    public final int getChallan_no() {
        return this.challan_no;
    }

    public final String getCourt_address() {
        return this.court_address;
    }

    public final String getCourt_name() {
        return this.court_name;
    }

    public final String getForword_date() {
        return this.forword_date;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.challan_no) * 31) + Integer.hashCode(this.amount)) * 31) + this.court_name.hashCode()) * 31) + this.court_address.hashCode()) * 31) + this.forword_date.hashCode();
    }

    public String toString() {
        return "NoticeCourtStatusModel(challan_no=" + this.challan_no + ", amount=" + this.amount + ", court_name=" + this.court_name + ", court_address=" + this.court_address + ", forword_date=" + this.forword_date + ')';
    }

    public NoticeCourtStatusModel(int i, int i2, String court_name, String court_address, String forword_date) {
        Intrinsics.checkNotNullParameter(court_name, "court_name");
        Intrinsics.checkNotNullParameter(court_address, "court_address");
        Intrinsics.checkNotNullParameter(forword_date, "forword_date");
        this.challan_no = i;
        this.amount = i2;
        this.court_name = court_name;
        this.court_address = court_address;
        this.forword_date = forword_date;
    }

    public /* synthetic */ NoticeCourtStatusModel(int i, int i2, String str, String str2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) == 0 ? i2 : 0, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? "" : str3);
    }
}
