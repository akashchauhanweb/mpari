package com.nic.mparivahan.DPTNotice;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.z;
import com.nic.mparivahan.DPTNotice.DataClass.DPTNoticeDataModel;
import com.nic.mparivahan.DPTNotice.DataClass.DTPVerifyPaymentModal;
import com.nic.mparivahan.DPTNotice.NoticeDetailsActivity;
import com.nic.mparivahan.DPTNotice.Services.NoticeService;
import com.nic.mparivahan.Echallan.DTPNoticePaymentWebView;
import com.nic.mparivahan.Echallan.DTPNoticeVerifyWebView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.ec1;
import com.zepto.ge;
import com.zepto.kt6;
import com.zepto.lc1;
import com.zepto.mc1;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.wa3;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\"\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\u001a\u0010\u000f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR$\u0010&\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010\u001dR\u0016\u00106\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010\u001d¨\u00069"}, d2 = {"Lcom/nic/mparivahan/DPTNotice/NoticeDetailsActivity;", "Lcom/zepto/pq;", "", "v1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "", "fromVerifyPayment", "s1", "r1", "z1", "Lcom/zepto/ge;", "C", "Lcom/zepto/ge;", "binding", "Lcom/zepto/wa3;", "D", "Lcom/zepto/wa3;", "u1", "()Lcom/zepto/wa3;", "B1", "(Lcom/zepto/wa3;)V", "langSession", "E", "Ljava/lang/String;", "inputType", "Lcom/nic/mparivahan/DPTNotice/DataClass/DPTNoticeDataModel;", "F", "Lcom/nic/mparivahan/DPTNotice/DataClass/DPTNoticeDataModel;", "getSelectedNoticeData", "()Lcom/nic/mparivahan/DPTNotice/DataClass/DPTNoticeDataModel;", "setSelectedNoticeData", "(Lcom/nic/mparivahan/DPTNotice/DataClass/DPTNoticeDataModel;)V", "selectedNoticeData", "Lcom/nic/mparivahan/DPTNotice/Services/NoticeService;", "G", "Lcom/nic/mparivahan/DPTNotice/Services/NoticeService;", "retrofitService", "Lcom/zepto/mc1;", "H", "Lcom/zepto/mc1;", "viewModel", "Landroid/app/ProgressDialog;", "I", "Landroid/app/ProgressDialog;", "dialog", "J", "serviceName", "K", "serviceCode", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class NoticeDetailsActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ge binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public DPTNoticeDataModel selectedNoticeData;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public NoticeService retrofitService;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public mc1 viewModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ProgressDialog dialog;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String inputType = "";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String serviceName = "";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String serviceCode = "";

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(DTPVerifyPaymentModal dTPVerifyPaymentModal) {
            ProgressDialog progressDialog = null;
            try {
                ProgressDialog progressDialog2 = NoticeDetailsActivity.this.dialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog2 = null;
                }
                if (progressDialog2.isShowing()) {
                    ProgressDialog progressDialog3 = NoticeDetailsActivity.this.dialog;
                    if (progressDialog3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                        progressDialog3 = null;
                    }
                    progressDialog3.dismiss();
                }
                if (!StringsKt__StringsJVMKt.equals(dTPVerifyPaymentModal.getStatus(), "200", true)) {
                    if (StringsKt__StringsJVMKt.equals(dTPVerifyPaymentModal.getStatus(), "204", true)) {
                        NoticeDetailsActivity noticeDetailsActivity = NoticeDetailsActivity.this;
                        noticeDetailsActivity.z1(noticeDetailsActivity, dTPVerifyPaymentModal.getMessage());
                        return;
                    }
                    return;
                }
                Intent intent = new Intent(NoticeDetailsActivity.this, (Class<?>) DTPNoticeVerifyWebView.class);
                intent.putExtra("pgiUrl", dTPVerifyPaymentModal.getPgiUrl());
                intent.putExtra("fromActivity", "noticeDetails");
                intent.putExtra("searchType", NoticeDetailsActivity.this.serviceName);
                intent.putExtra("Service_code", NoticeDetailsActivity.this.serviceCode);
                NoticeDetailsActivity.this.startActivity(intent);
                NoticeDetailsActivity.this.finish();
            } catch (Exception e) {
                e.printStackTrace();
                ProgressDialog progressDialog4 = NoticeDetailsActivity.this.dialog;
                if (progressDialog4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog4 = null;
                }
                if (progressDialog4.isShowing()) {
                    ProgressDialog progressDialog5 = NoticeDetailsActivity.this.dialog;
                    if (progressDialog5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    } else {
                        progressDialog = progressDialog5;
                    }
                    progressDialog.dismiss();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DTPVerifyPaymentModal) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            ProgressDialog progressDialog = NoticeDetailsActivity.this.dialog;
            ProgressDialog progressDialog2 = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog3 = NoticeDetailsActivity.this.dialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    progressDialog2 = progressDialog3;
                }
                progressDialog2.dismiss();
            }
        }
    }

    public static final class c implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.a = function;
        }

        @Override // com.zepto.mf4
        public final /* synthetic */ void a(Object obj) {
            this.a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof mf4) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public static final void A1(Dialog d, NoticeDetailsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) NoticeSearch.class);
        intent.addFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    public static final void t1(Dialog d, int i, NoticeDetailsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        if (i == 1) {
            this$0.r1();
        }
    }

    private final void v1() {
        ge geVar = this.binding;
        ge geVar2 = null;
        if (geVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            geVar = null;
        }
        geVar.D.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ad4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeDetailsActivity.w1(this.a, view);
            }
        });
        NoticeService noticeService = this.retrofitService;
        if (noticeService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            noticeService = null;
        }
        this.viewModel = (mc1) new z(this, new lc1(new ec1(noticeService))).a(mc1.class);
        ge geVar3 = this.binding;
        if (geVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            geVar3 = null;
        }
        geVar3.l.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bd4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeDetailsActivity.x1(this.a, view);
            }
        });
        if (kt6.d(this.serviceCode) && (StringsKt__StringsJVMKt.equals(this.serviceCode, "111", true) || StringsKt__StringsJVMKt.equals(this.serviceCode, "112", true) || StringsKt__StringsJVMKt.equals(this.serviceCode, "112", true))) {
            ge geVar4 = this.binding;
            if (geVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                geVar4 = null;
            }
            geVar4.D.i.setText(u1().b("notice_details_lbl", getString(R.string.notice_details)));
        }
        if (kt6.d(this.serviceCode) && Intrinsics.areEqual(this.serviceCode, "111")) {
            ge geVar5 = this.binding;
            if (geVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                geVar5 = null;
            }
            geVar5.q.setVisibility(4);
        }
        ge geVar6 = this.binding;
        if (geVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            geVar6 = null;
        }
        geVar6.q.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cd4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeDetailsActivity.y1(this.a, view);
            }
        });
        try {
            DPTNoticeDataModel dPTNoticeDataModel = this.selectedNoticeData;
            Intrinsics.checkNotNull(dPTNoticeDataModel);
            if (kt6.d(dPTNoticeDataModel.getOwner_name())) {
                ge geVar7 = this.binding;
                if (geVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    geVar7 = null;
                }
                AppCompatTextView appCompatTextView = geVar7.p;
                DPTNoticeDataModel dPTNoticeDataModel2 = this.selectedNoticeData;
                Intrinsics.checkNotNull(dPTNoticeDataModel2);
                appCompatTextView.setText(dPTNoticeDataModel2.getOwner_name());
            }
            DPTNoticeDataModel dPTNoticeDataModel3 = this.selectedNoticeData;
            Intrinsics.checkNotNull(dPTNoticeDataModel3);
            if (kt6.d(dPTNoticeDataModel3.getDoc_no())) {
                ge geVar8 = this.binding;
                if (geVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    geVar8 = null;
                }
                AppCompatTextView appCompatTextView2 = geVar8.k;
                DPTNoticeDataModel dPTNoticeDataModel4 = this.selectedNoticeData;
                Intrinsics.checkNotNull(dPTNoticeDataModel4);
                appCompatTextView2.setText(dPTNoticeDataModel4.getDoc_no());
            }
            ge geVar9 = this.binding;
            if (geVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                geVar9 = null;
            }
            AppCompatTextView appCompatTextView3 = geVar9.i;
            DPTNoticeDataModel dPTNoticeDataModel5 = this.selectedNoticeData;
            Intrinsics.checkNotNull(dPTNoticeDataModel5);
            appCompatTextView3.setText(String.valueOf(dPTNoticeDataModel5.getChallan_no()));
            DPTNoticeDataModel dPTNoticeDataModel6 = this.selectedNoticeData;
            Intrinsics.checkNotNull(dPTNoticeDataModel6);
            if (kt6.d(dPTNoticeDataModel6.getDate_time())) {
                ge geVar10 = this.binding;
                if (geVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    geVar10 = null;
                }
                AppCompatTextView appCompatTextView4 = geVar10.e;
                DPTNoticeDataModel dPTNoticeDataModel7 = this.selectedNoticeData;
                Intrinsics.checkNotNull(dPTNoticeDataModel7);
                appCompatTextView4.setText(dPTNoticeDataModel7.getDate_time());
            }
            DPTNoticeDataModel dPTNoticeDataModel8 = this.selectedNoticeData;
            Intrinsics.checkNotNull(dPTNoticeDataModel8);
            if (kt6.d(dPTNoticeDataModel8.getStatus())) {
                ge geVar11 = this.binding;
                if (geVar11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    geVar11 = null;
                }
                AppCompatTextView appCompatTextView5 = geVar11.w;
                DPTNoticeDataModel dPTNoticeDataModel9 = this.selectedNoticeData;
                Intrinsics.checkNotNull(dPTNoticeDataModel9);
                appCompatTextView5.setText(dPTNoticeDataModel9.getStatus());
            }
            ge geVar12 = this.binding;
            if (geVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                geVar12 = null;
            }
            AppCompatTextView appCompatTextView6 = geVar12.c;
            DPTNoticeDataModel dPTNoticeDataModel10 = this.selectedNoticeData;
            Intrinsics.checkNotNull(dPTNoticeDataModel10);
            appCompatTextView6.setText(String.valueOf(dPTNoticeDataModel10.getAmount()));
            DPTNoticeDataModel dPTNoticeDataModel11 = this.selectedNoticeData;
            Intrinsics.checkNotNull(dPTNoticeDataModel11);
            if (kt6.d(dPTNoticeDataModel11.getOffence_name())) {
                ge geVar13 = this.binding;
                if (geVar13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    geVar13 = null;
                }
                AppCompatTextView appCompatTextView7 = geVar13.n;
                DPTNoticeDataModel dPTNoticeDataModel12 = this.selectedNoticeData;
                Intrinsics.checkNotNull(dPTNoticeDataModel12);
                appCompatTextView7.setText(dPTNoticeDataModel12.getOffence_name());
            }
            DPTNoticeDataModel dPTNoticeDataModel13 = this.selectedNoticeData;
            Intrinsics.checkNotNull(dPTNoticeDataModel13);
            if (kt6.d(Integer.valueOf(dPTNoticeDataModel13.getPayment_eligible()))) {
                DPTNoticeDataModel dPTNoticeDataModel14 = this.selectedNoticeData;
                Intrinsics.checkNotNull(dPTNoticeDataModel14);
                int payment_eligible = dPTNoticeDataModel14.getPayment_eligible();
                if (payment_eligible == 0) {
                    ge geVar14 = this.binding;
                    if (geVar14 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        geVar14 = null;
                    }
                    geVar14.q.setText(u1().b("label_challan_verify_payment", getString(R.string.verify_payment)));
                } else if (payment_eligible == 1) {
                    ge geVar15 = this.binding;
                    if (geVar15 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        geVar15 = null;
                    }
                    geVar15.q.setText(u1().b("label_challan_pay_now", getString(R.string.pay_now)));
                } else if (payment_eligible == 2) {
                    ge geVar16 = this.binding;
                    if (geVar16 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        geVar16 = null;
                    }
                    geVar16.q.setText(u1().b("label_challan_pay_status", getString(R.string.status)));
                }
            } else {
                ge geVar17 = this.binding;
                if (geVar17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    geVar17 = null;
                }
                geVar17.q.setVisibility(4);
            }
            DPTNoticeDataModel dPTNoticeDataModel15 = this.selectedNoticeData;
            Intrinsics.checkNotNull(dPTNoticeDataModel15);
            if (kt6.d(dPTNoticeDataModel15.getPdf_url())) {
                ge geVar18 = this.binding;
                if (geVar18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    geVar18 = null;
                }
                geVar18.l.setVisibility(0);
            } else {
                ge geVar19 = this.binding;
                if (geVar19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    geVar19 = null;
                }
                geVar19.l.setVisibility(8);
            }
            DPTNoticeDataModel dPTNoticeDataModel16 = this.selectedNoticeData;
            Intrinsics.checkNotNull(dPTNoticeDataModel16);
            if (dPTNoticeDataModel16.getState_cd().length() > 0) {
                ge geVar20 = this.binding;
                if (geVar20 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    geVar2 = geVar20;
                }
                AppCompatTextView appCompatTextView8 = geVar2.B;
                VContant.Companion companion = VContant.INSTANCE;
                DPTNoticeDataModel dPTNoticeDataModel17 = this.selectedNoticeData;
                Intrinsics.checkNotNull(dPTNoticeDataModel17);
                appCompatTextView8.setText(StringsKt__StringsKt.trim((CharSequence) companion.l(dPTNoticeDataModel17.getState_cd()).toString()).toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void w1(NoticeDetailsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void x1(NoticeDetailsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) DownloadNoticeActivity.class);
        DPTNoticeDataModel dPTNoticeDataModel = this$0.selectedNoticeData;
        intent.putExtra("challanPdfUrl", dPTNoticeDataModel != null ? dPTNoticeDataModel.getPdf_url() : null);
        DPTNoticeDataModel dPTNoticeDataModel2 = this$0.selectedNoticeData;
        intent.putExtra("challanNo", dPTNoticeDataModel2 != null ? dPTNoticeDataModel2.getDoc_no() : null);
        intent.putExtra("fromActivity", "noticeDetailsActivity");
        this$0.startActivity(intent);
    }

    public static final void y1(NoticeDetailsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DPTNoticeDataModel dPTNoticeDataModel = this$0.selectedNoticeData;
        Intrinsics.checkNotNull(dPTNoticeDataModel);
        int payment_eligible = dPTNoticeDataModel.getPayment_eligible();
        if (payment_eligible == 0) {
            this$0.s1(this$0, this$0.u1().b("label_challan_payment_verification", this$0.getString(R.string.payment_verification_in_progress)), 1);
            return;
        }
        if (payment_eligible == 1) {
            Intent intent = new Intent(this$0, (Class<?>) DTPNoticePaymentWebView.class);
            intent.putExtra("selectedData", this$0.selectedNoticeData);
            intent.putExtra("type", this$0.inputType);
            intent.putExtra("Service_code", this$0.serviceCode);
            this$0.startActivity(intent);
            return;
        }
        if (payment_eligible != 2) {
            return;
        }
        DPTNoticeDataModel dPTNoticeDataModel2 = this$0.selectedNoticeData;
        if (dPTNoticeDataModel2 != null && dPTNoticeDataModel2.getVcourt_eligible() == 1) {
            Intent intent2 = new Intent(this$0, (Class<?>) NoticeVirtualCourtActivity.class);
            DPTNoticeDataModel dPTNoticeDataModel3 = this$0.selectedNoticeData;
            intent2.putExtra("challanNo", dPTNoticeDataModel3 != null ? Integer.valueOf(dPTNoticeDataModel3.getChallan_no()) : null);
            this$0.startActivity(intent2);
            return;
        }
        DPTNoticeDataModel dPTNoticeDataModel4 = this$0.selectedNoticeData;
        String status_txt = dPTNoticeDataModel4 != null ? dPTNoticeDataModel4.getStatus_txt() : null;
        Intrinsics.checkNotNull(status_txt);
        if (status_txt.length() > 0) {
            DPTNoticeDataModel dPTNoticeDataModel5 = this$0.selectedNoticeData;
            this$0.s1(this$0, dPTNoticeDataModel5 != null ? dPTNoticeDataModel5.getStatus_txt() : null, 0);
        }
    }

    public final void B1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ge geVarC = ge.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(geVarC, "inflate(...)");
        this.binding = geVarC;
        mc1 mc1Var = null;
        if (geVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            geVarC = null;
        }
        setContentView(geVarC.b());
        B1(new wa3(this));
        this.selectedNoticeData = (DPTNoticeDataModel) getIntent().getParcelableExtra("selectedData");
        String stringExtra = getIntent().getStringExtra("inputType");
        Intrinsics.checkNotNull(stringExtra);
        this.inputType = stringExtra;
        this.retrofitService = NoticeService.INSTANCE.a(this);
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.dialog = progressDialog;
        progressDialog.setMessage(u1().b("label_challan_getting_details", "Getting details..."));
        ProgressDialog progressDialog2 = this.dialog;
        if (progressDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog2 = null;
        }
        progressDialog2.setCanceledOnTouchOutside(false);
        ProgressDialog progressDialog3 = this.dialog;
        if (progressDialog3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog3 = null;
        }
        progressDialog3.setCancelable(false);
        if (getIntent().hasExtra("serviceName")) {
            String stringExtra2 = getIntent().getStringExtra("serviceName");
            Intrinsics.checkNotNull(stringExtra2);
            this.serviceName = stringExtra2;
        }
        if (getIntent().hasExtra("Service_code")) {
            String stringExtra3 = getIntent().getStringExtra("Service_code");
            Intrinsics.checkNotNull(stringExtra3);
            this.serviceCode = stringExtra3;
        }
        v1();
        mc1 mc1Var2 = this.viewModel;
        if (mc1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            mc1Var2 = null;
        }
        mc1Var2.i().g(this, new c(new a()));
        mc1 mc1Var3 = this.viewModel;
        if (mc1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            mc1Var = mc1Var3;
        }
        mc1Var.g().g(this, new c(new b()));
    }

    public final void r1() {
        try {
            ProgressDialog progressDialog = this.dialog;
            mc1 mc1Var = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            progressDialog.show();
            mc1 mc1Var2 = this.viewModel;
            if (mc1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                mc1Var = mc1Var2;
            }
            DPTNoticeDataModel dPTNoticeDataModel = this.selectedNoticeData;
            Intrinsics.checkNotNull(dPTNoticeDataModel);
            mc1Var.m(String.valueOf(dPTNoticeDataModel.getChallan_no()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void s1(Context context, String message, final int fromVerifyPayment) {
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirm_echallan_msg_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.process);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById3 = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById4 = dialog.findViewById(R.id.close);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById4;
        View viewFindViewById5 = dialog.findViewById(R.id.btnHolderLl);
        Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.LinearLayout");
        View viewFindViewById6 = dialog.findViewById(R.id.titleTv);
        Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById6).setText(u1().b("nex_parivahan", getString(R.string.app_name)));
        ((TextView) viewFindViewById3).setText(message);
        textView.setText(u1().b("label_challan_ok_dialog_text", getString(R.string.ok_txt)));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dd4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeDetailsActivity.t1(dialog, fromVerifyPayment, this, view);
            }
        });
        dialog.show();
    }

    public final wa3 u1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final void z1(Context context, String message) {
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirm_echallan_msg_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        ((TextView) viewFindViewById).setText(message);
        textView.setText(u1().b("label_challan_ok_dialog_text", getString(R.string.ok_txt)));
        View viewFindViewById3 = dialog.findViewById(R.id.titleTv);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(u1().b("nex_parivahan", getString(R.string.app_name)));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoticeDetailsActivity.A1(dialog, this, view);
            }
        });
        dialog.show();
    }
}
