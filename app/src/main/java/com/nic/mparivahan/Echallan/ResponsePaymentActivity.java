package com.nic.mparivahan.Echallan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Echallan.echallanLog.SaveLog;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.az1;
import com.zepto.kc0;
import com.zepto.kt6;
import com.zepto.pq;
import com.zepto.wa3;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bR\u0010SJ\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0003J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\u000b\u001a\u00020\u0002H\u0017R\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\"\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\"\u0010%\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\r\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u0011R\"\u0010)\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\r\u001a\u0004\b'\u0010\u000f\"\u0004\b(\u0010\u0011R\"\u0010-\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\r\u001a\u0004\b+\u0010\u000f\"\u0004\b,\u0010\u0011R\"\u00101\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\r\u001a\u0004\b/\u0010\u000f\"\u0004\b0\u0010\u0011R\"\u00105\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\r\u001a\u0004\b3\u0010\u000f\"\u0004\b4\u0010\u0011R\"\u00109\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\r\u001a\u0004\b7\u0010\u000f\"\u0004\b8\u0010\u0011R\"\u0010=\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010\r\u001a\u0004\b;\u0010\u000f\"\u0004\b<\u0010\u0011R\"\u0010A\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010\r\u001a\u0004\b?\u0010\u000f\"\u0004\b@\u0010\u0011R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0016\u0010K\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010\rR\u0016\u0010O\u001a\u00020L8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010Q\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010\r¨\u0006T"}, d2 = {"Lcom/nic/mparivahan/Echallan/ResponsePaymentActivity;", "Lcom/zepto/pq;", "", "n1", "", "transactionStatusValue", "l1", "r1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "C", "Ljava/lang/String;", "getChallanNoValue", "()Ljava/lang/String;", "setChallanNoValue", "(Ljava/lang/String;)V", "challanNoValue", "D", "getVehicleNoValue", "setVehicleNoValue", "vehicleNoValue", "E", "getTransactionIdValue", "setTransactionIdValue", "transactionIdValue", "F", "getTransactionStatusValue", "setTransactionStatusValue", "G", "getReceiptUrlValue", "setReceiptUrlValue", "receiptUrlValue", "H", "getAmountValue", "setAmountValue", "amountValue", "I", "getPaymentDate", "setPaymentDate", "paymentDate", "J", "getReceiptNo", "setReceiptNo", "receiptNo", "K", "getDeptCd", "setDeptCd", "deptCd", "L", "getRtoCd", "setRtoCd", "rtoCd", "M", "getChallanDate", "setChallanDate", "challanDate", "N", "getStateCd", "setStateCd", "stateCd", "O", "getInputType", "setInputType", "inputType", "Lcom/zepto/wa3;", "P", "Lcom/zepto/wa3;", "m1", "()Lcom/zepto/wa3;", "s1", "(Lcom/zepto/wa3;)V", "langSession", "Q", "fromActivity", "Lcom/zepto/kc0;", "R", "Lcom/zepto/kc0;", "binding", "S", "paymentType", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nResponsePaymentActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponsePaymentActivity.kt\ncom/nic/mparivahan/Echallan/ResponsePaymentActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,341:1\n1#2:342\n*E\n"})
public final class ResponsePaymentActivity extends pq {

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public kc0 binding;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public String challanNoValue = "";

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String vehicleNoValue = "";

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String transactionIdValue = "";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String transactionStatusValue = "";

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String receiptUrlValue = "";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String amountValue = "";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String paymentDate = "";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String receiptNo = "";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String deptCd = "";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String rtoCd = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String challanDate = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String stateCd = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String inputType = "";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String fromActivity = "";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String paymentType = "";

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void n1() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.ResponsePaymentActivity.n1():void");
    }

    public static final void o1(ResponsePaymentActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void p1(ResponsePaymentActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.r1();
    }

    public static final void q1(ResponsePaymentActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!Intrinsics.areEqual(this$0.transactionStatusValue, "Cash") && !Intrinsics.areEqual(this$0.transactionStatusValue, "Success")) {
            if (kt6.d(this$0.fromActivity) && Intrinsics.areEqual(this$0.fromActivity, VContant.VERIFY_PAYMENT)) {
                Intent intent = new Intent(this$0, (Class<?>) VerifyPaymentChallan.class);
                intent.setFlags(67108864);
                this$0.startActivity(intent);
                this$0.finish();
                return;
            }
            Intent intent2 = new Intent(this$0, (Class<?>) PaymentSearchChallan.class);
            intent2.setFlags(67108864);
            this$0.startActivity(intent2);
            this$0.finish();
            return;
        }
        if (this$0.receiptUrlValue.length() > 0) {
            Intent intent3 = new Intent(this$0, (Class<?>) PrintChallanWebView.class);
            intent3.putExtra("challanPdfUrl", this$0.receiptUrlValue);
            intent3.putExtra("challan_receipt_url", "");
            intent3.putExtra("challanNo", this$0.challanNoValue);
            intent3.putExtra("fromActivity", "byPassPayment");
            this$0.startActivity(intent3);
            return;
        }
        if (kt6.d(this$0.fromActivity) && Intrinsics.areEqual(this$0.fromActivity, VContant.VERIFY_PAYMENT)) {
            Intent intent4 = new Intent(this$0, (Class<?>) VerifyPaymentChallan.class);
            intent4.setFlags(67108864);
            this$0.startActivity(intent4);
            this$0.finish();
            return;
        }
        Intent intent5 = new Intent(this$0, (Class<?>) PaymentSearchChallan.class);
        intent5.setFlags(67108864);
        this$0.startActivity(intent5);
        this$0.finish();
    }

    private final void r1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void l1(String transactionStatusValue) throws Throwable {
        String str = "";
        try {
            if (kt6.d(this.challanNoValue)) {
                SimpleDateFormat simpleDateFormat = Intrinsics.areEqual(this.paymentType, "eTrans") ? new SimpleDateFormat("yyyy-MM-dd hh:mm:ss") : new SimpleDateFormat("dd-MM-yyyy hh:mm:ssaa");
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd");
                Date date = simpleDateFormat2.parse(this.challanDate);
                Intrinsics.checkNotNull(date, "null cannot be cast to non-null type java.util.Date");
                String str2 = simpleDateFormat3.format(date);
                if (!Intrinsics.areEqual(this.paymentDate, "")) {
                    Date date2 = simpleDateFormat.parse(this.paymentDate);
                    str = date2 != null ? simpleDateFormat3.format(date2) : null;
                }
                String str3 = str;
                String str4 = StringsKt__StringsJVMKt.equals(this.inputType, "Challan", true) ? "CH" : this.inputType;
                String str5 = this.amountValue;
                if (!kt6.d(str3)) {
                    SaveLog.Companion companion = SaveLog.INSTANCE;
                    Intrinsics.checkNotNull(str2);
                    companion.a(this, str2, Integer.parseInt(this.deptCd), this.vehicleNoValue, "", Integer.parseInt(this.rtoCd), this.stateCd, this.transactionIdValue, this.challanNoValue, transactionStatusValue, str4, "", Double.parseDouble(str5));
                } else {
                    SaveLog.Companion companion2 = SaveLog.INSTANCE;
                    Intrinsics.checkNotNull(str2);
                    int i = Integer.parseInt(this.deptCd);
                    String str6 = this.vehicleNoValue;
                    Intrinsics.checkNotNull(str3);
                    companion2.a(this, str2, i, str6, str3, Integer.parseInt(this.rtoCd), this.stateCd, this.transactionIdValue, this.challanNoValue, transactionStatusValue, str4, "", Double.parseDouble(str5));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final wa3 m1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        Intent intent = new Intent(this, (Class<?>) PaymentSearchChallan.class);
        intent.setFlags(67108864);
        startActivity(intent);
        finish();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        kc0 kc0VarC = kc0.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(kc0VarC, "inflate(...)");
        this.binding = kc0VarC;
        kc0 kc0Var = null;
        if (kc0VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            kc0VarC = null;
        }
        setContentView(kc0VarC.b());
        az1.a aVar = az1.a;
        kc0 kc0Var2 = this.binding;
        if (kc0Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            kc0Var = kc0Var2;
        }
        aVar.e(this, kc0Var);
        s1(new wa3(this));
        String stringExtra = getIntent().getStringExtra("challanNo");
        Intrinsics.checkNotNull(stringExtra);
        this.challanNoValue = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("vehicleNo");
        Intrinsics.checkNotNull(stringExtra2);
        this.vehicleNoValue = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("transactionId");
        Intrinsics.checkNotNull(stringExtra3);
        this.transactionIdValue = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("status");
        Intrinsics.checkNotNull(stringExtra4);
        this.transactionStatusValue = stringExtra4;
        String stringExtra5 = getIntent().getStringExtra("challanPdfUrl");
        Intrinsics.checkNotNull(stringExtra5);
        this.receiptUrlValue = stringExtra5;
        String stringExtra6 = getIntent().getStringExtra("amount");
        Intrinsics.checkNotNull(stringExtra6);
        this.amountValue = stringExtra6;
        if (getIntent().hasExtra("paymentDate")) {
            String stringExtra7 = getIntent().getStringExtra("paymentDate");
            Intrinsics.checkNotNull(stringExtra7);
            this.paymentDate = stringExtra7;
        }
        if (getIntent().hasExtra("receiptNo")) {
            String stringExtra8 = getIntent().getStringExtra("receiptNo");
            Intrinsics.checkNotNull(stringExtra8);
            this.receiptNo = stringExtra8;
        }
        if (getIntent().hasExtra("dptCd")) {
            String stringExtra9 = getIntent().getStringExtra("dptCd");
            Intrinsics.checkNotNull(stringExtra9);
            this.deptCd = stringExtra9;
        }
        if (getIntent().hasExtra("rtoCd")) {
            String stringExtra10 = getIntent().getStringExtra("rtoCd");
            Intrinsics.checkNotNull(stringExtra10);
            this.rtoCd = stringExtra10;
        }
        if (getIntent().hasExtra("challanDate")) {
            String stringExtra11 = getIntent().getStringExtra("challanDate");
            Intrinsics.checkNotNull(stringExtra11);
            this.challanDate = stringExtra11;
        }
        if (getIntent().hasExtra("stateCd")) {
            String stringExtra12 = getIntent().getStringExtra("stateCd");
            Intrinsics.checkNotNull(stringExtra12);
            this.stateCd = stringExtra12;
        }
        if (getIntent().hasExtra("searchType")) {
            String stringExtra13 = getIntent().getStringExtra("searchType");
            Intrinsics.checkNotNull(stringExtra13);
            this.inputType = stringExtra13;
        }
        if (getIntent().hasExtra("paymentType")) {
            String stringExtra14 = getIntent().getStringExtra("paymentType");
            Intrinsics.checkNotNull(stringExtra14);
            this.paymentType = stringExtra14;
        }
        if (getIntent().hasExtra("fromActivity")) {
            String stringExtra15 = getIntent().getStringExtra("fromActivity");
            Intrinsics.checkNotNull(stringExtra15);
            this.fromActivity = stringExtra15;
        }
        n1();
    }

    public final void s1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }
}
