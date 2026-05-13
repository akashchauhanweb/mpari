package com.nic.mparivahan.VahanServices.VahanView;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.PdfViewer.PdfViewActivity;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanModel.ApplicationStatusSuccessModel;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationServiceOtp;
import com.nic.mparivahan.VahanServices.VahanService.DownloadReceiptService;
import com.nic.mparivahan.VahanServices.VahanView.VahanDownloadReceiptActivity;
import com.zepto.ev;
import com.zepto.fv6;
import com.zepto.gb;
import com.zepto.kt6;
import com.zepto.mf4;
import com.zepto.p55;
import com.zepto.pq;
import com.zepto.pw;
import com.zepto.q55;
import com.zepto.r55;
import com.zepto.s14;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.yy0;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bE\u0010FJ\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0003J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0015R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010 \u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0016\u0010\"\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001bR\u0016\u0010$\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001bR\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006G"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanView/VahanDownloadReceiptActivity;", "Lcom/zepto/pq;", "", "u1", "", "H1", "q1", "z1", "", "it", "E1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/gb;", "C", "Lcom/zepto/gb;", "binding", "Landroid/app/ProgressDialog;", "D", "Landroid/app/ProgressDialog;", "s1", "()Landroid/app/ProgressDialog;", "B1", "(Landroid/app/ProgressDialog;)V", "pDialog", "E", "Ljava/lang/String;", "digit", "F", "engineNo", "G", "mobileNoValue", "H", "ownerName", "I", "stateCd", "Lcom/nic/mparivahan/VahanServices/VahanService/DownloadReceiptService;", "J", "Lcom/nic/mparivahan/VahanServices/VahanService/DownloadReceiptService;", "t1", "()Lcom/nic/mparivahan/VahanServices/VahanService/DownloadReceiptService;", "D1", "(Lcom/nic/mparivahan/VahanServices/VahanService/DownloadReceiptService;)V", "retrofitService", "Lcom/zepto/q55;", "K", "Lcom/zepto/q55;", "getReceiptViewModle", "()Lcom/zepto/q55;", "C1", "(Lcom/zepto/q55;)V", "receiptViewModle", "Lcom/zepto/wa3;", "L", "Lcom/zepto/wa3;", "r1", "()Lcom/zepto/wa3;", "A1", "(Lcom/zepto/wa3;)V", "languageSession", "Lcom/zepto/ev;", "M", "Lcom/zepto/ev;", "otpViewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationServiceOtp;", "N", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationServiceOtp;", "otpRetrofitService", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanDownloadReceiptActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public gb binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public final String digit = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String engineNo = "";

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String mobileNoValue = "";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String ownerName = "";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String stateCd = "";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public DownloadReceiptService retrofitService;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public q55 receiptViewModle;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public wa3 languageSession;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ev otpViewModel;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ApplicationServiceOtp otpRetrofitService;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(ApplicationStatusSuccessModel applicationStatusSuccessModel) {
            try {
                if (applicationStatusSuccessModel.getTransList().size() > 0) {
                    VahanDownloadReceiptActivity.this.q1();
                    return;
                }
                if (VahanDownloadReceiptActivity.this.s1().isShowing()) {
                    VahanDownloadReceiptActivity.this.s1().dismiss();
                }
                VahanDownloadReceiptActivity vahanDownloadReceiptActivity = VahanDownloadReceiptActivity.this;
                vahanDownloadReceiptActivity.E1(vahanDownloadReceiptActivity.r1().b("no_application_status", "No application status found for this application no."));
            } catch (Exception e) {
                if (VahanDownloadReceiptActivity.this.s1().isShowing()) {
                    VahanDownloadReceiptActivity.this.s1().dismiss();
                }
                e.printStackTrace();
                VahanDownloadReceiptActivity vahanDownloadReceiptActivity2 = VahanDownloadReceiptActivity.this;
                vahanDownloadReceiptActivity2.E1(vahanDownloadReceiptActivity2.getString(R.string.service_unavable_please_try));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ApplicationStatusSuccessModel) obj);
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
            if (VahanDownloadReceiptActivity.this.s1().isShowing()) {
                VahanDownloadReceiptActivity.this.s1().dismiss();
            }
            VahanDownloadReceiptActivity vahanDownloadReceiptActivity = VahanDownloadReceiptActivity.this;
            vahanDownloadReceiptActivity.E1(vahanDownloadReceiptActivity.r1().b("no_application_status", "No application status found for this application no."));
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void E1(String it) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        textView2.setVisibility(8);
        textView.setText("Ok");
        textView.setBackground(yy0.e(this, R.drawable.shape_red));
        textView.setTextColor(yy0.c(this, R.color.white));
        ((TextView) viewFindViewById).setText(it);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.h37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDownloadReceiptActivity.F1(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.i37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDownloadReceiptActivity.G1(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    private final boolean H1() {
        gb gbVar = this.binding;
        gb gbVar2 = null;
        if (gbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gbVar = null;
        }
        Editable text = gbVar.j.getText();
        Intrinsics.checkNotNull(text);
        if (text.length() == 0) {
            gb gbVar3 = this.binding;
            if (gbVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                gbVar3 = null;
            }
            gbVar3.j.setError(r1().b("PLEASE_ENTER_APPLICATION", getString(R.string.please_enter_valid_app_no)));
            gb gbVar4 = this.binding;
            if (gbVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                gbVar2 = gbVar4;
            }
            gbVar2.j.requestFocus();
            return false;
        }
        gb gbVar5 = this.binding;
        if (gbVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gbVar5 = null;
        }
        Editable text2 = gbVar5.l.getText();
        Intrinsics.checkNotNull(text2);
        if (text2.length() == 0) {
            gb gbVar6 = this.binding;
            if (gbVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                gbVar6 = null;
            }
            gbVar6.l.setError(r1().b("PLEASE_ENTER_REG", getString(R.string.please_enter_reg_no)));
            gb gbVar7 = this.binding;
            if (gbVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                gbVar2 = gbVar7;
            }
            gbVar2.l.requestFocus();
            return false;
        }
        gb gbVar8 = this.binding;
        if (gbVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gbVar8 = null;
        }
        if (String.valueOf(gbVar8.l.getText()).length() < 4) {
            gb gbVar9 = this.binding;
            if (gbVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                gbVar9 = null;
            }
            gbVar9.l.setError(r1().b("label_challan_invalid_vehicle_no", getString(R.string.invalid_rc_no)));
            gb gbVar10 = this.binding;
            if (gbVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                gbVar2 = gbVar10;
            }
            gbVar2.l.requestFocus();
            return false;
        }
        gb gbVar11 = this.binding;
        if (gbVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gbVar11 = null;
        }
        Editable text3 = gbVar11.k.getText();
        Intrinsics.checkNotNull(text3);
        if (text3.length() == 0) {
            gb gbVar12 = this.binding;
            if (gbVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                gbVar12 = null;
            }
            gbVar12.k.setError(r1().b("PLEASE_ENTER_CHASSI", getString(R.string.please_enter_chassis_no)));
            gb gbVar13 = this.binding;
            if (gbVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                gbVar2 = gbVar13;
            }
            gbVar2.k.requestFocus();
            return false;
        }
        gb gbVar14 = this.binding;
        if (gbVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gbVar14 = null;
        }
        if (String.valueOf(gbVar14.k.getText()).length() >= 5) {
            return true;
        }
        gb gbVar15 = this.binding;
        if (gbVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gbVar15 = null;
        }
        gbVar15.k.setError(r1().b("INVALID_CHASSI", getString(R.string.invalid_chassis_no)));
        gb gbVar16 = this.binding;
        if (gbVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            gbVar2 = gbVar16;
        }
        gbVar2.k.requestFocus();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q1() {
        gb gbVar = this.binding;
        gb gbVar2 = null;
        if (gbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gbVar = null;
        }
        String strValueOf = String.valueOf(gbVar.j.getText());
        gb gbVar3 = this.binding;
        if (gbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gbVar3 = null;
        }
        String strValueOf2 = String.valueOf(gbVar3.l.getText());
        gb gbVar4 = this.binding;
        if (gbVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            gbVar2 = gbVar4;
        }
        String str = s14.a.i() + "reprintreciept/" + strValueOf + '/' + strValueOf2 + '/' + String.valueOf(gbVar2.k.getText());
        Intent intent = new Intent(this, (Class<?>) PdfViewActivity.class);
        intent.putExtra("url", str);
        intent.putExtra("formType", "Fee Receipt");
        intent.putExtra("applNo", strValueOf2 + '_' + strValueOf);
        startActivity(intent);
    }

    private final void u1() {
        gb gbVar = null;
        try {
            if (getIntent() != null) {
                gb gbVar2 = this.binding;
                if (gbVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    gbVar2 = null;
                }
                gbVar2.c.i.setText(getIntent().getStringExtra("service_name"));
            } else {
                gb gbVar3 = this.binding;
                if (gbVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    gbVar3 = null;
                }
                gbVar3.c.i.setText("Print Receipt");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        gb gbVar4 = this.binding;
        if (gbVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gbVar4 = null;
        }
        gbVar4.c.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.d37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDownloadReceiptActivity.v1(this.a, view);
            }
        });
        gb gbVar5 = this.binding;
        if (gbVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gbVar5 = null;
        }
        gbVar5.c.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.e37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDownloadReceiptActivity.w1(this.a, view);
            }
        });
        gb gbVar6 = this.binding;
        if (gbVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gbVar6 = null;
        }
        gbVar6.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.f37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDownloadReceiptActivity.x1(this.a, view);
            }
        });
        gb gbVar7 = this.binding;
        if (gbVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gbVar7 = null;
        }
        gbVar7.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.g37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDownloadReceiptActivity.y1(this.a, view);
            }
        });
        gb gbVar8 = this.binding;
        if (gbVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gbVar8 = null;
        }
        gbVar8.l.setKeyListener(DigitsKeyListener.getInstance(this.digit));
        gb gbVar9 = this.binding;
        if (gbVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gbVar9 = null;
        }
        gbVar9.l.setRawInputType(ConstantsKt.DEFAULT_BLOCK_SIZE);
        gb gbVar10 = this.binding;
        if (gbVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gbVar10 = null;
        }
        gbVar10.j.setKeyListener(DigitsKeyListener.getInstance(this.digit));
        gb gbVar11 = this.binding;
        if (gbVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            gbVar = gbVar11;
        }
        gbVar.j.setRawInputType(ConstantsKt.DEFAULT_BLOCK_SIZE);
    }

    public static final void v1(VahanDownloadReceiptActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.z1();
    }

    public static final void w1(VahanDownloadReceiptActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void x1(VahanDownloadReceiptActivity this$0, View view) {
        String strSubstring;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.H1()) {
            this$0.s1().show();
            gb gbVar = this$0.binding;
            gb gbVar2 = null;
            if (gbVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                gbVar = null;
            }
            if (kt6.d(String.valueOf(gbVar.j.getText()))) {
                gb gbVar3 = this$0.binding;
                if (gbVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    gbVar3 = null;
                }
                strSubstring = String.valueOf(gbVar3.j.getText()).substring(0, 2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                strSubstring = "";
            }
            this$0.s1().show();
            ev evVar = this$0.otpViewModel;
            if (evVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
                evVar = null;
            }
            gb gbVar4 = this$0.binding;
            if (gbVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                gbVar2 = gbVar4;
            }
            evVar.o(this$0, String.valueOf(gbVar2.j.getText()), strSubstring);
        }
    }

    public static final void y1(VahanDownloadReceiptActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final void z1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void A1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }

    public final void B1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void C1(q55 q55Var) {
        Intrinsics.checkNotNullParameter(q55Var, "<set-?>");
        this.receiptViewModle = q55Var;
    }

    public final void D1(DownloadReceiptService downloadReceiptService) {
        Intrinsics.checkNotNullParameter(downloadReceiptService, "<set-?>");
        this.retrofitService = downloadReceiptService;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download_receipt);
        gb gbVarC = gb.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(gbVarC, "inflate(...)");
        this.binding = gbVarC;
        ev evVar = null;
        if (gbVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gbVarC = null;
        }
        setContentView(gbVarC.b());
        ta3.a aVar = ta3.a;
        gb gbVar = this.binding;
        if (gbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gbVar = null;
        }
        aVar.C2(this, gbVar);
        A1(new wa3(this));
        B1(new ProgressDialog(this));
        s1().setMessage(r1().b("label_challan_please_wait", "Please wait..."));
        s1().setCancelable(false);
        s1().setCanceledOnTouchOutside(false);
        D1(DownloadReceiptService.INSTANCE.a(this));
        C1((q55) new z(this, new r55(new p55(t1()))).a(q55.class));
        this.otpRetrofitService = ApplicationServiceOtp.INSTANCE.a(this);
        ApplicationServiceOtp applicationServiceOtp = this.otpRetrofitService;
        if (applicationServiceOtp == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpRetrofitService");
            applicationServiceOtp = null;
        }
        this.otpViewModel = (ev) new z(this, new fv6(new pw(applicationServiceOtp))).a(ev.class);
        u1();
        ev evVar2 = this.otpViewModel;
        if (evVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
            evVar2 = null;
        }
        evVar2.n().g(this, new c(new a()));
        ev evVar3 = this.otpViewModel;
        if (evVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
        } else {
            evVar = evVar3;
        }
        evVar.k().g(this, new c(new b()));
    }

    public final wa3 r1() {
        wa3 wa3Var = this.languageSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageSession");
        return null;
    }

    public final ProgressDialog s1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final DownloadReceiptService t1() {
        DownloadReceiptService downloadReceiptService = this.retrofitService;
        if (downloadReceiptService != null) {
            return downloadReceiptService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }
}
