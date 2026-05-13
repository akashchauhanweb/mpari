package com.nic.mparivahan.VahanServices;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.z;
import com.nic.mparivahan.PdfViewer.PdfViewActivity;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DownloadFormsActivity;
import com.nic.mparivahan.VahanServices.VahanModel.FormDetailsSuccessModel;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.zepto.fb;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.s14;
import com.zepto.ta3;
import com.zepto.yy0;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bF\u0010GJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007H\u0003J\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u00103\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010.R\u0016\u00105\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010.R\u0016\u00107\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u0010.R\u0016\u0010:\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00102R\u0016\u0010<\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010.R2\u0010E\u001a\u0012\u0012\u0004\u0012\u0002080=j\b\u0012\u0004\u0012\u000208`>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006H"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DownloadFormsActivity;", "Lcom/zepto/pq;", "Lcom/nic/mparivahan/VahanServices/VahanModel/FormDetailsSuccessModel;", "it", "", "Y1", "H1", "", "appendedUrl", "formType", "applNumber", "C1", "D1", "V1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/fb;", "C", "Lcom/zepto/fb;", "binding", "Lcom/zepto/ld7;", "D", "Lcom/zepto/ld7;", "G1", "()Lcom/zepto/ld7;", "b2", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "E", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "F1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "a2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "E1", "()Landroid/app/ProgressDialog;", "Z1", "(Landroid/app/ProgressDialog;)V", "pDialog", "G", "Ljava/lang/String;", "stateCd", "H", "offCd", "I", "rcNo", "J", "applNo", "K", "baseUrl", "", "L", "purCd", "M", "receiptNo", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "N", "Ljava/util/ArrayList;", "getChecker", "()Ljava/util/ArrayList;", "setChecker", "(Ljava/util/ArrayList;)V", "checker", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class DownloadFormsActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public fb binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ld7 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String baseUrl;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public int purCd;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String stateCd = "";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String offCd = "";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String rcNo = "";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String applNo = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String receiptNo = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ArrayList checker = new ArrayList();

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(FormDetailsSuccessModel formDetailsSuccessModel) {
            if (DownloadFormsActivity.this.E1().isShowing()) {
                DownloadFormsActivity.this.E1().dismiss();
            }
            fb fbVar = DownloadFormsActivity.this.binding;
            if (fbVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fbVar = null;
            }
            fbVar.L.setVisibility(8);
            DownloadFormsActivity.this.purCd = formDetailsSuccessModel.getPur_cd();
            DownloadFormsActivity.this.receiptNo = formDetailsSuccessModel.getRcpt_no();
            DownloadFormsActivity.this.Y1(formDetailsSuccessModel);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((FormDetailsSuccessModel) obj);
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
            if (DownloadFormsActivity.this.E1().isShowing()) {
                DownloadFormsActivity.this.E1().dismiss();
            }
            fb fbVar = DownloadFormsActivity.this.binding;
            if (fbVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fbVar = null;
            }
            fbVar.L.setVisibility(0);
            DownloadFormsActivity.this.V1(str);
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

    private final void H1() {
        Z1(new ProgressDialog(this));
        E1().setMessage("Please wait...");
        E1().setCancelable(false);
        E1().setCanceledOnTouchOutside(false);
        b2((ld7) new z(this, new kd7(new jd7(F1()))).a(ld7.class));
        fb fbVar = this.binding;
        fb fbVar2 = null;
        if (fbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fbVar = null;
        }
        fbVar.A.setVisibility(8);
        fb fbVar3 = this.binding;
        if (fbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fbVar3 = null;
        }
        fbVar3.z.setVisibility(8);
        fb fbVar4 = this.binding;
        if (fbVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fbVar4 = null;
        }
        fbVar4.B.setVisibility(8);
        fb fbVar5 = this.binding;
        if (fbVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fbVar5 = null;
        }
        fbVar5.C.setVisibility(8);
        fb fbVar6 = this.binding;
        if (fbVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fbVar6 = null;
        }
        fbVar6.D.setVisibility(8);
        fb fbVar7 = this.binding;
        if (fbVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fbVar7 = null;
        }
        fbVar7.E.setVisibility(8);
        fb fbVar8 = this.binding;
        if (fbVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fbVar8 = null;
        }
        fbVar8.F.setVisibility(8);
        fb fbVar9 = this.binding;
        if (fbVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fbVar9 = null;
        }
        fbVar9.G.setVisibility(8);
        fb fbVar10 = this.binding;
        if (fbVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fbVar10 = null;
        }
        fbVar10.H.setVisibility(8);
        fb fbVar11 = this.binding;
        if (fbVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fbVar11 = null;
        }
        fbVar11.I.setVisibility(8);
        fb fbVar12 = this.binding;
        if (fbVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fbVar12 = null;
        }
        fbVar12.J.setVisibility(8);
        fb fbVar13 = this.binding;
        if (fbVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fbVar13 = null;
        }
        fbVar13.K.setVisibility(8);
        D1();
        fb fbVar14 = this.binding;
        if (fbVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fbVar14 = null;
        }
        fbVar14.A.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tv1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadFormsActivity.I1(this.a, view);
            }
        });
        fb fbVar15 = this.binding;
        if (fbVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fbVar15 = null;
        }
        fbVar15.z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wv1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadFormsActivity.M1(this.a, view);
            }
        });
        fb fbVar16 = this.binding;
        if (fbVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fbVar16 = null;
        }
        fbVar16.B.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xv1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadFormsActivity.N1(this.a, view);
            }
        });
        fb fbVar17 = this.binding;
        if (fbVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fbVar17 = null;
        }
        fbVar17.C.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yv1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadFormsActivity.O1(this.a, view);
            }
        });
        fb fbVar18 = this.binding;
        if (fbVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fbVar18 = null;
        }
        fbVar18.D.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zv1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadFormsActivity.P1(this.a, view);
            }
        });
        fb fbVar19 = this.binding;
        if (fbVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fbVar19 = null;
        }
        fbVar19.E.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mv1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadFormsActivity.Q1(this.a, view);
            }
        });
        fb fbVar20 = this.binding;
        if (fbVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fbVar20 = null;
        }
        fbVar20.F.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nv1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadFormsActivity.R1(this.a, view);
            }
        });
        fb fbVar21 = this.binding;
        if (fbVar21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fbVar21 = null;
        }
        fbVar21.G.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ov1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadFormsActivity.S1(this.a, view);
            }
        });
        fb fbVar22 = this.binding;
        if (fbVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fbVar22 = null;
        }
        fbVar22.H.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pv1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadFormsActivity.T1(this.a, view);
            }
        });
        fb fbVar23 = this.binding;
        if (fbVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fbVar23 = null;
        }
        fbVar23.I.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qv1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadFormsActivity.J1(this.a, view);
            }
        });
        fb fbVar24 = this.binding;
        if (fbVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fbVar24 = null;
        }
        fbVar24.J.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uv1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadFormsActivity.K1(this.a, view);
            }
        });
        fb fbVar25 = this.binding;
        if (fbVar25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fbVar2 = fbVar25;
        }
        fbVar2.K.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vv1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadFormsActivity.L1(this.a, view);
            }
        });
    }

    public static final void I1(DownloadFormsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        StringBuilder sb = new StringBuilder();
        String str = this$0.baseUrl;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseUrl");
            str = null;
        }
        sb.append(str);
        sb.append("getform_22_Fitness/");
        this$0.C1(sb.toString() + this$0.offCd + '/' + this$0.rcNo + '/' + this$0.applNo + '/' + this$0.purCd + '/' + this$0.receiptNo + '/' + this$0.stateCd, "Form22", this$0.applNo);
    }

    public static final void J1(DownloadFormsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        StringBuilder sb = new StringBuilder();
        String str = this$0.baseUrl;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseUrl");
            str = null;
        }
        sb.append(str);
        sb.append("getForm34HPAReport/");
        this$0.C1(sb.toString() + this$0.offCd + '/' + this$0.rcNo + '/' + this$0.applNo + '/' + this$0.purCd + '/' + this$0.receiptNo + '/' + this$0.stateCd, "Form34", this$0.applNo);
    }

    public static final void K1(DownloadFormsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        StringBuilder sb = new StringBuilder();
        String str = this$0.baseUrl;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseUrl");
            str = null;
        }
        sb.append(str);
        sb.append("getForm35HPTReport/");
        this$0.C1(sb.toString() + this$0.offCd + '/' + this$0.rcNo + '/' + this$0.applNo + '/' + this$0.purCd + '/' + this$0.receiptNo + '/' + this$0.stateCd, "Form35", this$0.applNo);
    }

    public static final void L1(DownloadFormsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        StringBuilder sb = new StringBuilder();
        String str = this$0.baseUrl;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseUrl");
            str = null;
        }
        sb.append(str);
        sb.append("getForm36HPAReport/");
        this$0.C1(sb.toString() + this$0.offCd + '/' + this$0.rcNo + '/' + this$0.applNo + '/' + this$0.purCd + '/' + this$0.receiptNo + '/' + this$0.stateCd, "Form36", this$0.applNo);
    }

    public static final void M1(DownloadFormsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        StringBuilder sb = new StringBuilder();
        String str = this$0.baseUrl;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseUrl");
            str = null;
        }
        sb.append(str);
        sb.append("getForm14Data/");
        this$0.C1(sb.toString() + this$0.offCd + '/' + this$0.rcNo + '/' + this$0.applNo + '/' + this$0.purCd + '/' + this$0.receiptNo + '/' + this$0.stateCd, "Form14", this$0.applNo);
    }

    public static final void N1(DownloadFormsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        StringBuilder sb = new StringBuilder();
        String str = this$0.baseUrl;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseUrl");
            str = null;
        }
        sb.append(str);
        sb.append("getForm26DRCReports/");
        this$0.C1(sb.toString() + this$0.offCd + '/' + this$0.rcNo + '/' + this$0.applNo + '/' + this$0.purCd + '/' + this$0.receiptNo + '/' + this$0.stateCd, "Form26", this$0.applNo);
    }

    public static final void O1(DownloadFormsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        StringBuilder sb = new StringBuilder();
        String str = this$0.baseUrl;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseUrl");
            str = null;
        }
        sb.append(str);
        sb.append("getForm28NOCReport/");
        this$0.C1(sb.toString() + this$0.offCd + '/' + this$0.rcNo + '/' + this$0.applNo + '/' + this$0.purCd + '/' + this$0.receiptNo + '/' + this$0.stateCd, "Form28", this$0.applNo);
    }

    public static final void P1(DownloadFormsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        StringBuilder sb = new StringBuilder();
        String str = this$0.baseUrl;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseUrl");
            str = null;
        }
        sb.append(str);
        sb.append("getFormTO29Report/");
        this$0.C1(sb.toString() + this$0.offCd + '/' + this$0.rcNo + '/' + this$0.applNo + '/' + this$0.purCd + '/' + this$0.receiptNo + '/' + this$0.stateCd, "Form29", this$0.applNo);
    }

    public static final void Q1(DownloadFormsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        StringBuilder sb = new StringBuilder();
        String str = this$0.baseUrl;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseUrl");
            str = null;
        }
        sb.append(str);
        sb.append("getFormTO30Report/");
        this$0.C1(sb.toString() + this$0.offCd + '/' + this$0.rcNo + '/' + this$0.applNo + '/' + this$0.purCd + '/' + this$0.receiptNo + '/' + this$0.stateCd, "Form30", this$0.applNo);
    }

    public static final void R1(DownloadFormsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        StringBuilder sb = new StringBuilder();
        String str = this$0.baseUrl;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseUrl");
            str = null;
        }
        sb.append(str);
        sb.append("getFormTO31Report/");
        this$0.C1(sb.toString() + this$0.offCd + '/' + this$0.rcNo + '/' + this$0.applNo + '/' + this$0.purCd + '/' + this$0.receiptNo + '/' + this$0.stateCd, "Form31", this$0.applNo);
    }

    public static final void S1(DownloadFormsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        StringBuilder sb = new StringBuilder();
        String str = this$0.baseUrl;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseUrl");
            str = null;
        }
        sb.append(str);
        sb.append("getform_32_TO_Report/");
        this$0.C1(sb.toString() + this$0.offCd + '/' + this$0.rcNo + '/' + this$0.applNo + '/' + this$0.purCd + '/' + this$0.receiptNo + '/' + this$0.stateCd, "Form32", this$0.applNo);
    }

    public static final void T1(DownloadFormsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        StringBuilder sb = new StringBuilder();
        String str = this$0.baseUrl;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseUrl");
            str = null;
        }
        sb.append(str);
        sb.append("getFormCA33Report/");
        this$0.C1(sb.toString() + this$0.offCd + '/' + this$0.rcNo + '/' + this$0.applNo + '/' + this$0.purCd + '/' + this$0.receiptNo + '/' + this$0.stateCd, "Form33", this$0.applNo);
    }

    public static final void U1(DownloadFormsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void W1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void X1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public final void C1(String appendedUrl, String formType, String applNumber) {
        Intent intent = new Intent(this, (Class<?>) PdfViewActivity.class);
        intent.putExtra("url", appendedUrl);
        intent.putExtra("formType", formType);
        intent.putExtra("applNo", applNumber);
        startActivity(intent);
    }

    public final void D1() {
        try {
            E1().show();
            G1().X(this, this.stateCd, this.offCd, this.applNo, this.rcNo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final ProgressDialog E1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final VahanProService F1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final ld7 G1() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void V1(String it) {
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rv1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadFormsActivity.W1(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sv1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadFormsActivity.X1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void Y1(FormDetailsSuccessModel it) {
        Intrinsics.checkNotNull(it);
        fb fbVar = null;
        if (it.getRenForm22()) {
            this.checker.add(1);
            fb fbVar2 = this.binding;
            if (fbVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fbVar2 = null;
            }
            fbVar2.A.setVisibility(0);
        } else {
            this.checker.add(2);
            fb fbVar3 = this.binding;
            if (fbVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fbVar3 = null;
            }
            fbVar3.A.setVisibility(8);
        }
        if (it.getRenderForm14()) {
            this.checker.add(1);
            fb fbVar4 = this.binding;
            if (fbVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fbVar4 = null;
            }
            fbVar4.z.setVisibility(0);
        } else {
            this.checker.add(2);
            fb fbVar5 = this.binding;
            if (fbVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fbVar5 = null;
            }
            fbVar5.z.setVisibility(8);
        }
        if (it.getRenForm26()) {
            this.checker.add(1);
            fb fbVar6 = this.binding;
            if (fbVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fbVar6 = null;
            }
            fbVar6.B.setVisibility(0);
        } else {
            this.checker.add(2);
            fb fbVar7 = this.binding;
            if (fbVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fbVar7 = null;
            }
            fbVar7.B.setVisibility(8);
        }
        if (it.getRenForm28()) {
            this.checker.add(1);
            fb fbVar8 = this.binding;
            if (fbVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fbVar8 = null;
            }
            fbVar8.C.setVisibility(0);
        } else {
            this.checker.add(2);
            fb fbVar9 = this.binding;
            if (fbVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fbVar9 = null;
            }
            fbVar9.C.setVisibility(8);
        }
        if (it.getRenForm29()) {
            this.checker.add(1);
            fb fbVar10 = this.binding;
            if (fbVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fbVar10 = null;
            }
            fbVar10.D.setVisibility(0);
        } else {
            this.checker.add(2);
            fb fbVar11 = this.binding;
            if (fbVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fbVar11 = null;
            }
            fbVar11.D.setVisibility(8);
        }
        if (it.getRenForm30()) {
            this.checker.add(1);
            fb fbVar12 = this.binding;
            if (fbVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fbVar12 = null;
            }
            fbVar12.E.setVisibility(0);
        } else {
            this.checker.add(2);
            fb fbVar13 = this.binding;
            if (fbVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fbVar13 = null;
            }
            fbVar13.E.setVisibility(8);
        }
        if (it.getRenForm31()) {
            this.checker.add(1);
            fb fbVar14 = this.binding;
            if (fbVar14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fbVar14 = null;
            }
            fbVar14.F.setVisibility(0);
        } else {
            this.checker.add(2);
            fb fbVar15 = this.binding;
            if (fbVar15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fbVar15 = null;
            }
            fbVar15.F.setVisibility(8);
        }
        if (it.getRenForm32()) {
            this.checker.add(1);
            fb fbVar16 = this.binding;
            if (fbVar16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fbVar16 = null;
            }
            fbVar16.G.setVisibility(0);
        } else {
            this.checker.add(2);
            fb fbVar17 = this.binding;
            if (fbVar17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fbVar17 = null;
            }
            fbVar17.G.setVisibility(8);
        }
        if (it.getRenForm33()) {
            this.checker.add(1);
            fb fbVar18 = this.binding;
            if (fbVar18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fbVar18 = null;
            }
            fbVar18.H.setVisibility(0);
        } else {
            this.checker.add(2);
            fb fbVar19 = this.binding;
            if (fbVar19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fbVar19 = null;
            }
            fbVar19.H.setVisibility(8);
        }
        if (it.getRenForm34()) {
            this.checker.add(1);
            fb fbVar20 = this.binding;
            if (fbVar20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fbVar20 = null;
            }
            fbVar20.I.setVisibility(0);
        } else {
            this.checker.add(2);
            fb fbVar21 = this.binding;
            if (fbVar21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fbVar21 = null;
            }
            fbVar21.I.setVisibility(8);
        }
        if (it.getRenForm35()) {
            this.checker.add(1);
            fb fbVar22 = this.binding;
            if (fbVar22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fbVar22 = null;
            }
            fbVar22.J.setVisibility(0);
        } else {
            this.checker.add(2);
            fb fbVar23 = this.binding;
            if (fbVar23 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fbVar23 = null;
            }
            fbVar23.J.setVisibility(8);
        }
        if (it.getRenForm36()) {
            this.checker.add(1);
            fb fbVar24 = this.binding;
            if (fbVar24 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fbVar24 = null;
            }
            fbVar24.K.setVisibility(0);
        } else {
            this.checker.add(2);
            fb fbVar25 = this.binding;
            if (fbVar25 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                fbVar25 = null;
            }
            fbVar25.K.setVisibility(8);
        }
        try {
            if (this.checker.size() <= 0 || this.checker.contains(1)) {
                return;
            }
            fb fbVar26 = this.binding;
            if (fbVar26 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fbVar = fbVar26;
            }
            fbVar.L.setVisibility(0);
        } catch (Exception unused) {
        }
    }

    public final void Z1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void a2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void b2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download_forms);
        fb fbVarC = fb.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(fbVarC, "inflate(...)");
        this.binding = fbVarC;
        fb fbVar = null;
        if (fbVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fbVarC = null;
        }
        setContentView(fbVarC.b());
        ta3.a aVar = ta3.a;
        fb fbVar2 = this.binding;
        if (fbVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fbVar2 = null;
        }
        aVar.E0(this, fbVar2);
        a2(VahanProService.INSTANCE.a(this));
        this.baseUrl = s14.a.i();
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("state_code");
            Intrinsics.checkNotNull(stringExtra);
            this.stateCd = stringExtra;
            String stringExtra2 = getIntent().getStringExtra("off_code");
            Intrinsics.checkNotNull(stringExtra2);
            this.offCd = stringExtra2;
            String stringExtra3 = getIntent().getStringExtra("rc_number");
            Intrinsics.checkNotNull(stringExtra3);
            this.rcNo = stringExtra3;
            String stringExtra4 = getIntent().getStringExtra("appl_no");
            Intrinsics.checkNotNull(stringExtra4);
            this.applNo = stringExtra4;
        }
        H1();
        fb fbVar3 = this.binding;
        if (fbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fbVar = fbVar3;
        }
        fbVar.M.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lv1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadFormsActivity.U1(this.a, view);
            }
        });
        G1().f0().g(this, new c(new a()));
        G1().e0().g(this, new c(new b()));
    }
}
