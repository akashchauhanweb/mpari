package com.nic.mparivahan.VahanServices.FancyServices;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.FancyServices.FancyFeeReceipt;
import com.nic.mparivahan.VahanServices.FancyServices.FancyFeesRepository.FancyFeesServices;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.zepto.e82;
import com.zepto.f82;
import com.zepto.g82;
import com.zepto.gd1;
import com.zepto.jd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.xb;
import com.zepto.yh7;
import com.zepto.yy0;
import com.zepto.zk7;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bV\u0010WJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0002J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010=\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010U\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T¨\u0006X"}, d2 = {"Lcom/nic/mparivahan/VahanServices/FancyServices/FancyFeeReceipt;", "Lcom/zepto/pq;", "", "C1", "", "W1", "J1", "", "it", "T1", "pfileName", "s1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/xb;", "C", "Lcom/zepto/xb;", "u1", "()Lcom/zepto/xb;", "L1", "(Lcom/zepto/xb;)V", "binding", "Lcom/zepto/ld7;", "D", "Lcom/zepto/ld7;", "B1", "()Lcom/zepto/ld7;", "S1", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "E", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "y1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "P1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "w1", "()Landroid/app/ProgressDialog;", "N1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Landroid/widget/ImageView;", "G", "Landroid/widget/ImageView;", "t1", "()Landroid/widget/ImageView;", "K1", "(Landroid/widget/ImageView;)V", "back_image", "H", "Ljava/lang/String;", "A1", "()Ljava/lang/String;", "R1", "(Ljava/lang/String;)V", "stateCode", "Lcom/zepto/g82;", "I", "Lcom/zepto/g82;", "x1", "()Lcom/zepto/g82;", "O1", "(Lcom/zepto/g82;)V", "receiptViewModle", "Lcom/nic/mparivahan/VahanServices/FancyServices/FancyFeesRepository/FancyFeesServices;", "J", "Lcom/nic/mparivahan/VahanServices/FancyServices/FancyFeesRepository/FancyFeesServices;", "z1", "()Lcom/nic/mparivahan/VahanServices/FancyServices/FancyFeesRepository/FancyFeesServices;", "Q1", "(Lcom/nic/mparivahan/VahanServices/FancyServices/FancyFeesRepository/FancyFeesServices;)V", "retrofitServiceFees", "Lcom/zepto/wa3;", "K", "Lcom/zepto/wa3;", "v1", "()Lcom/zepto/wa3;", "M1", "(Lcom/zepto/wa3;)V", "langSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class FancyFeeReceipt extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public xb binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ld7 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ImageView back_image;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String stateCode;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public g82 receiptViewModle;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public FancyFeesServices retrofitServiceFees;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public wa3 langSession;

    public static final class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            if (FancyFeeReceipt.this.u1().f.getSelectedItemPosition() != 0) {
                Object selectedItem = FancyFeeReceipt.this.u1().f.getSelectedItem();
                Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
                FancyFeeReceipt fancyFeeReceipt = FancyFeeReceipt.this;
                Object obj = ((ArrayList) selectedItem).get(0);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                fancyFeeReceipt.R1((String) obj);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
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
            try {
                FancyFeeReceipt.this.w1().dismiss();
                if (gd1.a.m(str)) {
                    FancyFeeReceipt.this.T1("Unable to download the receipt");
                } else {
                    FancyFeeReceipt fancyFeeReceipt = FancyFeeReceipt.this;
                    Intrinsics.checkNotNull(str);
                    fancyFeeReceipt.s1(StringsKt__StringsKt.trim((CharSequence) str).toString());
                }
            } catch (Exception unused) {
            }
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            FancyFeeReceipt.this.w1().dismiss();
            if (StringsKt__StringsJVMKt.equals(str, "Error", true)) {
                FancyFeeReceipt.this.T1("Unable to download the receipt");
            } else {
                FancyFeeReceipt.this.T1(str);
            }
        }
    }

    public static final class d implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public d(Function1 function) {
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

    private final void C1() {
        u1().g.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.b82
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FancyFeeReceipt.D1(this.a, view);
            }
        });
        u1().g.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.c82
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FancyFeeReceipt.E1(this.a, view);
            }
        });
        u1().c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.d82
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FancyFeeReceipt.F1(this.a, view);
            }
        });
    }

    public static final void D1(FancyFeeReceipt this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void E1(FancyFeeReceipt this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.J1();
    }

    public static final void F1(FancyFeeReceipt this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object selectedItem = this$0.u1().f.getSelectedItem();
        Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
        Object obj = ((ArrayList) selectedItem).get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        this$0.R1((String) obj);
        if (this$0.W1()) {
            this$0.w1().show();
            this$0.x1().j(this$0.A1(), String.valueOf(this$0.u1().h.getText()));
        }
    }

    public static final void G1(FancyFeeReceipt this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void H1(FancyFeeReceipt this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.w1().dismiss();
    }

    public static final void I1(FancyFeeReceipt this$0, VahanStateModle vahanStateModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.w1().dismiss();
        try {
            VahanStateModleSubList vahanStateModleSubList = new VahanStateModleSubList();
            vahanStateModleSubList.clear();
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            Intrinsics.checkNotNull(vahanStateModle);
            vahanStateModle.add(0, vahanStateModleSubList);
            this$0.u1().f.setAdapter((SpinnerAdapter) new yh7(this$0, vahanStateModle));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void J1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T1(String it) {
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
        textView.setText(v1().b("btn_ok", getString(R.string.ok_txt)));
        textView.setBackground(yy0.e(this, R.drawable.shape_red));
        textView.setTextColor(yy0.c(this, R.color.white));
        ((TextView) viewFindViewById).setText(it);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.z72
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FancyFeeReceipt.U1(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.a82
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FancyFeeReceipt.V1(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final boolean W1() {
        if (u1().f.getSelectedItemPosition() == 0) {
            Toast.makeText(this, v1().b("label_log_sel_state", getString(R.string.please_selecr_State)), 0).show();
            return false;
        }
        if (String.valueOf(u1().h.getText()).length() >= 4) {
            return true;
        }
        u1().h.setError(v1().b("please_enter_valid_recpt_no", getString(R.string.please_enter_valid_recpt_no)));
        u1().h.requestFocus();
        w1().dismiss();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s1(String pfileName) {
        try {
            Method method = StrictMode.class.getMethod("disableDeathOnFileUriExposure", new Class[0]);
            Intrinsics.checkNotNullExpressionValue(method, "getMethod(...)");
            method.invoke(null, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        File file = new File(externalStoragePublicDirectory, '/' + (pfileName + ".pdf"));
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.fromFile(file), "application/pdf");
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this, v1().b("pdf_not_found", getString(R.string.pdf_not_found)), 1).show();
        }
    }

    public final String A1() {
        String str = this.stateCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stateCode");
        return null;
    }

    public final ld7 B1() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void K1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.back_image = imageView;
    }

    public final void L1(xb xbVar) {
        Intrinsics.checkNotNullParameter(xbVar, "<set-?>");
        this.binding = xbVar;
    }

    public final void M1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void N1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void O1(g82 g82Var) {
        Intrinsics.checkNotNullParameter(g82Var, "<set-?>");
        this.receiptViewModle = g82Var;
    }

    public final void P1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void Q1(FancyFeesServices fancyFeesServices) {
        Intrinsics.checkNotNullParameter(fancyFeesServices, "<set-?>");
        this.retrofitServiceFees = fancyFeesServices;
    }

    public final void R1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCode = str;
    }

    public final void S1(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        xb xbVarC = xb.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(xbVarC, "inflate(...)");
        L1(xbVarC);
        setContentView(u1().b());
        P1(VahanProService.INSTANCE.a(this));
        View viewFindViewById = findViewById(R.id.mvvm_back);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        K1((ImageView) viewFindViewById);
        ta3.a.P0(this, u1());
        u1().g.i.setText(getIntent().getStringExtra("ServiceName"));
        M1(new wa3(this));
        N1(new ProgressDialog(this));
        w1().setMessage(v1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        w1().setCancelable(false);
        w1().setCanceledOnTouchOutside(false);
        S1((ld7) new z(this, new zk7(new jd7(y1()))).a(ld7.class));
        Q1(FancyFeesServices.INSTANCE.a(this));
        O1((g82) new z(this, new e82(new f82(z1()))).a(g82.class));
        C1();
        t1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.w72
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FancyFeeReceipt.G1(this.a, view);
            }
        });
        try {
            w1().show();
            B1().a1(this);
        } catch (Exception unused) {
        }
        B1().b1().g(this, new mf4() { // from class: com.zepto.x72
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                FancyFeeReceipt.H1(this.a, (String) obj);
            }
        });
        B1().Z0().g(this, new mf4() { // from class: com.zepto.y72
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                FancyFeeReceipt.I1(this.a, (VahanStateModle) obj);
            }
        });
        Spinner spinner = u1().f;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(new a());
        }
        x1().h().g(this, new d(new b()));
        x1().i().g(this, new d(new c()));
    }

    public final ImageView t1() {
        ImageView imageView = this.back_image;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("back_image");
        return null;
    }

    public final xb u1() {
        xb xbVar = this.binding;
        if (xbVar != null) {
            return xbVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final wa3 v1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final ProgressDialog w1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final g82 x1() {
        g82 g82Var = this.receiptViewModle;
        if (g82Var != null) {
            return g82Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("receiptViewModle");
        return null;
    }

    public final VahanProService y1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final FancyFeesServices z1() {
        FancyFeesServices fancyFeesServices = this.retrofitServiceFees;
        if (fancyFeesServices != null) {
            return fancyFeesServices;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitServiceFees");
        return null;
    }
}
