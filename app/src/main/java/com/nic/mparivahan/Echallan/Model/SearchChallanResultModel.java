package com.nic.mparivahan.Echallan.Model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.nic.mparivahan.Echallan.Echallan.Model.ChallanListOffenceModal;
import com.zepto.xy5;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bç\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0014\u001a\u00020\r\u0012\b\b\u0001\u0010\u0015\u001a\u00020\r\u0012\b\b\u0001\u0010\u0016\u001a\u00020\r\u0012\b\b\u0001\u0010\u0017\u001a\u00020\r\u0012\u0018\b\u0002\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001b¢\u0006\u0002\u0010\u001cJ\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\rHÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\rHÆ\u0003J\t\u0010>\u001a\u00020\rHÆ\u0003J\t\u0010?\u001a\u00020\rHÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\rHÆ\u0003J\u0019\u0010B\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001bHÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003Jë\u0001\u0010J\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\r2\b\b\u0003\u0010\u000e\u001a\u00020\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u00032\b\b\u0003\u0010\u0010\u001a\u00020\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u00032\b\b\u0003\u0010\u0012\u001a\u00020\u00032\b\b\u0003\u0010\u0013\u001a\u00020\u00032\b\b\u0003\u0010\u0014\u001a\u00020\r2\b\b\u0003\u0010\u0015\u001a\u00020\r2\b\b\u0003\u0010\u0016\u001a\u00020\r2\b\b\u0003\u0010\u0017\u001a\u00020\r2\u0018\b\u0002\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001bHÆ\u0001J\t\u0010K\u001a\u00020\rHÖ\u0001J\u0013\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010OHÖ\u0003J\t\u0010P\u001a\u00020\rHÖ\u0001J\t\u0010Q\u001a\u00020\u0003HÖ\u0001J\u0019\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0016\u0010\u0015\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR&\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u0016\u0010\u0017\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0016\u0010\u0016\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001eR\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001eR\u0016\u0010\u0014\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"¨\u0006W"}, d2 = {"Lcom/nic/mparivahan/Echallan/Model/SearchChallanResultModel;", "Landroid/os/Parcelable;", "ownerName", "", "amount", "challanNo", "dateTime", "docNo", "stateCd", "dptCd", "pdfUrl", "rtoCd", "paymentEligible", "", "statusTxt", "paymentDate", "paymentSource", "transactionId", "receiptUrl", "challanStatus", "vcourt_eligible", "court_status", "sent_to_vcourt", "paymentGateway", "offences", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/Echallan/Echallan/Model/ChallanListOffenceModal;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/util/ArrayList;)V", "getAmount", "()Ljava/lang/String;", "getChallanNo", "getChallanStatus", "getCourt_status", "()I", "getDateTime", "getDocNo", "getDptCd", "getOffences", "()Ljava/util/ArrayList;", "getOwnerName", "getPaymentDate", "getPaymentEligible", "getPaymentGateway", "getPaymentSource", "getPdfUrl", "getReceiptUrl", "getRtoCd", "getSent_to_vcourt", "getStateCd", "getStatusTxt", "getTransactionId", "getVcourt_eligible", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SearchChallanResultModel implements Parcelable {
    public static final Parcelable.Creator<SearchChallanResultModel> CREATOR = new a();

    @xy5("amount")
    private final String amount;

    @xy5("challan_no")
    private final String challanNo;

    @xy5("status")
    private final String challanStatus;

    @xy5("court_status")
    private final int court_status;

    @xy5("date_time")
    private final String dateTime;

    @xy5("doc_no")
    private final String docNo;

    @xy5("dpt_cd")
    private final String dptCd;

    @xy5("offences")
    private final ArrayList<ChallanListOffenceModal> offences;

    @xy5("owner_name")
    private final String ownerName;

    @xy5("payment_date")
    private final String paymentDate;

    @xy5("payment_eligible")
    private final int paymentEligible;

    @xy5("payment_gateway")
    private final int paymentGateway;

    @xy5("payment_source")
    private final String paymentSource;

    @xy5("pdf_url")
    private final String pdfUrl;

    @xy5("receipt_url")
    private final String receiptUrl;

    @xy5("rto_cd")
    private final String rtoCd;

    @xy5("sent_to_vcourt")
    private final int sent_to_vcourt;

    @xy5("state_cd")
    private final String stateCd;

    @xy5("status_txt")
    private final String statusTxt;

    @xy5("transaction_id")
    private final String transactionId;

    @xy5("vcourt_eligible")
    private final int vcourt_eligible;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SearchChallanResultModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            int i = parcel.readInt();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i6);
            int i7 = 0;
            while (i7 != i6) {
                arrayList.add(ChallanListOffenceModal.CREATOR.createFromParcel(parcel));
                i7++;
                i6 = i6;
            }
            return new SearchChallanResultModel(string, string2, string3, string4, string5, string6, string7, string8, string9, i, string10, string11, string12, string13, string14, string15, i2, i3, i4, i5, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SearchChallanResultModel[] newArray(int i) {
            return new SearchChallanResultModel[i];
        }
    }

    public SearchChallanResultModel(String ownerName, String amount, String challanNo, String dateTime, String docNo, String stateCd, String dptCd, String pdfUrl, String rtoCd, int i, String statusTxt, String paymentDate, String paymentSource, String transactionId, String receiptUrl, String challanStatus, int i2, int i3, int i4, int i5, ArrayList<ChallanListOffenceModal> offences) {
        Intrinsics.checkNotNullParameter(ownerName, "ownerName");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(challanNo, "challanNo");
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        Intrinsics.checkNotNullParameter(docNo, "docNo");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(dptCd, "dptCd");
        Intrinsics.checkNotNullParameter(pdfUrl, "pdfUrl");
        Intrinsics.checkNotNullParameter(rtoCd, "rtoCd");
        Intrinsics.checkNotNullParameter(statusTxt, "statusTxt");
        Intrinsics.checkNotNullParameter(paymentDate, "paymentDate");
        Intrinsics.checkNotNullParameter(paymentSource, "paymentSource");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(receiptUrl, "receiptUrl");
        Intrinsics.checkNotNullParameter(challanStatus, "challanStatus");
        Intrinsics.checkNotNullParameter(offences, "offences");
        this.ownerName = ownerName;
        this.amount = amount;
        this.challanNo = challanNo;
        this.dateTime = dateTime;
        this.docNo = docNo;
        this.stateCd = stateCd;
        this.dptCd = dptCd;
        this.pdfUrl = pdfUrl;
        this.rtoCd = rtoCd;
        this.paymentEligible = i;
        this.statusTxt = statusTxt;
        this.paymentDate = paymentDate;
        this.paymentSource = paymentSource;
        this.transactionId = transactionId;
        this.receiptUrl = receiptUrl;
        this.challanStatus = challanStatus;
        this.vcourt_eligible = i2;
        this.court_status = i3;
        this.sent_to_vcourt = i4;
        this.paymentGateway = i5;
        this.offences = offences;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOwnerName() {
        return this.ownerName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getPaymentEligible() {
        return this.paymentEligible;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getStatusTxt() {
        return this.statusTxt;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPaymentDate() {
        return this.paymentDate;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getPaymentSource() {
        return this.paymentSource;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getReceiptUrl() {
        return this.receiptUrl;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getChallanStatus() {
        return this.challanStatus;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getVcourt_eligible() {
        return this.vcourt_eligible;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getCourt_status() {
        return this.court_status;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getSent_to_vcourt() {
        return this.sent_to_vcourt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getPaymentGateway() {
        return this.paymentGateway;
    }

    public final ArrayList<ChallanListOffenceModal> component21() {
        return this.offences;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChallanNo() {
        return this.challanNo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDateTime() {
        return this.dateTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDocNo() {
        return this.docNo;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStateCd() {
        return this.stateCd;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDptCd() {
        return this.dptCd;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPdfUrl() {
        return this.pdfUrl;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRtoCd() {
        return this.rtoCd;
    }

    public final SearchChallanResultModel copy(String ownerName, String amount, String challanNo, String dateTime, String docNo, String stateCd, String dptCd, String pdfUrl, String rtoCd, int paymentEligible, String statusTxt, String paymentDate, String paymentSource, String transactionId, String receiptUrl, String challanStatus, int vcourt_eligible, int court_status, int sent_to_vcourt, int paymentGateway, ArrayList<ChallanListOffenceModal> offences) {
        Intrinsics.checkNotNullParameter(ownerName, "ownerName");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(challanNo, "challanNo");
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        Intrinsics.checkNotNullParameter(docNo, "docNo");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(dptCd, "dptCd");
        Intrinsics.checkNotNullParameter(pdfUrl, "pdfUrl");
        Intrinsics.checkNotNullParameter(rtoCd, "rtoCd");
        Intrinsics.checkNotNullParameter(statusTxt, "statusTxt");
        Intrinsics.checkNotNullParameter(paymentDate, "paymentDate");
        Intrinsics.checkNotNullParameter(paymentSource, "paymentSource");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(receiptUrl, "receiptUrl");
        Intrinsics.checkNotNullParameter(challanStatus, "challanStatus");
        Intrinsics.checkNotNullParameter(offences, "offences");
        return new SearchChallanResultModel(ownerName, amount, challanNo, dateTime, docNo, stateCd, dptCd, pdfUrl, rtoCd, paymentEligible, statusTxt, paymentDate, paymentSource, transactionId, receiptUrl, challanStatus, vcourt_eligible, court_status, sent_to_vcourt, paymentGateway, offences);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchChallanResultModel)) {
            return false;
        }
        SearchChallanResultModel searchChallanResultModel = (SearchChallanResultModel) other;
        return Intrinsics.areEqual(this.ownerName, searchChallanResultModel.ownerName) && Intrinsics.areEqual(this.amount, searchChallanResultModel.amount) && Intrinsics.areEqual(this.challanNo, searchChallanResultModel.challanNo) && Intrinsics.areEqual(this.dateTime, searchChallanResultModel.dateTime) && Intrinsics.areEqual(this.docNo, searchChallanResultModel.docNo) && Intrinsics.areEqual(this.stateCd, searchChallanResultModel.stateCd) && Intrinsics.areEqual(this.dptCd, searchChallanResultModel.dptCd) && Intrinsics.areEqual(this.pdfUrl, searchChallanResultModel.pdfUrl) && Intrinsics.areEqual(this.rtoCd, searchChallanResultModel.rtoCd) && this.paymentEligible == searchChallanResultModel.paymentEligible && Intrinsics.areEqual(this.statusTxt, searchChallanResultModel.statusTxt) && Intrinsics.areEqual(this.paymentDate, searchChallanResultModel.paymentDate) && Intrinsics.areEqual(this.paymentSource, searchChallanResultModel.paymentSource) && Intrinsics.areEqual(this.transactionId, searchChallanResultModel.transactionId) && Intrinsics.areEqual(this.receiptUrl, searchChallanResultModel.receiptUrl) && Intrinsics.areEqual(this.challanStatus, searchChallanResultModel.challanStatus) && this.vcourt_eligible == searchChallanResultModel.vcourt_eligible && this.court_status == searchChallanResultModel.court_status && this.sent_to_vcourt == searchChallanResultModel.sent_to_vcourt && this.paymentGateway == searchChallanResultModel.paymentGateway && Intrinsics.areEqual(this.offences, searchChallanResultModel.offences);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getChallanNo() {
        return this.challanNo;
    }

    public final String getChallanStatus() {
        return this.challanStatus;
    }

    public final int getCourt_status() {
        return this.court_status;
    }

    public final String getDateTime() {
        return this.dateTime;
    }

    public final String getDocNo() {
        return this.docNo;
    }

    public final String getDptCd() {
        return this.dptCd;
    }

    public final ArrayList<ChallanListOffenceModal> getOffences() {
        return this.offences;
    }

    public final String getOwnerName() {
        return this.ownerName;
    }

    public final String getPaymentDate() {
        return this.paymentDate;
    }

    public final int getPaymentEligible() {
        return this.paymentEligible;
    }

    public final int getPaymentGateway() {
        return this.paymentGateway;
    }

    public final String getPaymentSource() {
        return this.paymentSource;
    }

    public final String getPdfUrl() {
        return this.pdfUrl;
    }

    public final String getReceiptUrl() {
        return this.receiptUrl;
    }

    public final String getRtoCd() {
        return this.rtoCd;
    }

    public final int getSent_to_vcourt() {
        return this.sent_to_vcourt;
    }

    public final String getStateCd() {
        return this.stateCd;
    }

    public final String getStatusTxt() {
        return this.statusTxt;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final int getVcourt_eligible() {
        return this.vcourt_eligible;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((this.ownerName.hashCode() * 31) + this.amount.hashCode()) * 31) + this.challanNo.hashCode()) * 31) + this.dateTime.hashCode()) * 31) + this.docNo.hashCode()) * 31) + this.stateCd.hashCode()) * 31) + this.dptCd.hashCode()) * 31) + this.pdfUrl.hashCode()) * 31) + this.rtoCd.hashCode()) * 31) + Integer.hashCode(this.paymentEligible)) * 31) + this.statusTxt.hashCode()) * 31) + this.paymentDate.hashCode()) * 31) + this.paymentSource.hashCode()) * 31) + this.transactionId.hashCode()) * 31) + this.receiptUrl.hashCode()) * 31) + this.challanStatus.hashCode()) * 31) + Integer.hashCode(this.vcourt_eligible)) * 31) + Integer.hashCode(this.court_status)) * 31) + Integer.hashCode(this.sent_to_vcourt)) * 31) + Integer.hashCode(this.paymentGateway)) * 31) + this.offences.hashCode();
    }

    public String toString() {
        return "SearchChallanResultModel(ownerName=" + this.ownerName + ", amount=" + this.amount + ", challanNo=" + this.challanNo + ", dateTime=" + this.dateTime + ", docNo=" + this.docNo + ", stateCd=" + this.stateCd + ", dptCd=" + this.dptCd + ", pdfUrl=" + this.pdfUrl + ", rtoCd=" + this.rtoCd + ", paymentEligible=" + this.paymentEligible + ", statusTxt=" + this.statusTxt + ", paymentDate=" + this.paymentDate + ", paymentSource=" + this.paymentSource + ", transactionId=" + this.transactionId + ", receiptUrl=" + this.receiptUrl + ", challanStatus=" + this.challanStatus + ", vcourt_eligible=" + this.vcourt_eligible + ", court_status=" + this.court_status + ", sent_to_vcourt=" + this.sent_to_vcourt + ", paymentGateway=" + this.paymentGateway + ", offences=" + this.offences + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ownerName);
        parcel.writeString(this.amount);
        parcel.writeString(this.challanNo);
        parcel.writeString(this.dateTime);
        parcel.writeString(this.docNo);
        parcel.writeString(this.stateCd);
        parcel.writeString(this.dptCd);
        parcel.writeString(this.pdfUrl);
        parcel.writeString(this.rtoCd);
        parcel.writeInt(this.paymentEligible);
        parcel.writeString(this.statusTxt);
        parcel.writeString(this.paymentDate);
        parcel.writeString(this.paymentSource);
        parcel.writeString(this.transactionId);
        parcel.writeString(this.receiptUrl);
        parcel.writeString(this.challanStatus);
        parcel.writeInt(this.vcourt_eligible);
        parcel.writeInt(this.court_status);
        parcel.writeInt(this.sent_to_vcourt);
        parcel.writeInt(this.paymentGateway);
        ArrayList<ChallanListOffenceModal> arrayList = this.offences;
        parcel.writeInt(arrayList.size());
        Iterator<ChallanListOffenceModal> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ SearchChallanResultModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, String str10, String str11, String str12, String str13, String str14, String str15, int i2, int i3, int i4, int i5, ArrayList arrayList, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, (i6 & 256) != 0 ? "" : str9, i, (i6 & 1024) != 0 ? "" : str10, (i6 & 2048) != 0 ? "" : str11, (i6 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? "" : str12, (i6 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? "" : str13, (i6 & 16384) != 0 ? "" : str14, str15, i2, i3, i4, i5, (i6 & 1048576) != 0 ? new ArrayList() : arrayList);
    }
}
