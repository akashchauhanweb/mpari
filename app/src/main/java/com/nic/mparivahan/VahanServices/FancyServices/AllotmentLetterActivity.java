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
import android.text.Editable;
import android.text.method.DigitsKeyListener;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.FancyServices.AllotmentLetterActivity;
import com.nic.mparivahan.VahanServices.FancyServices.AllotmentLetterServices.AllotmentLetterRetrofitServices;
import com.zepto.gd1;
import com.zepto.i6;
import com.zepto.mf4;
import com.zepto.po;
import com.zepto.pq;
import com.zepto.qo;
import com.zepto.ro;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.yy0;
import java.io.File;
import java.lang.reflect.Method;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b>\u0010?J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0003J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0002J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lcom/nic/mparivahan/VahanServices/FancyServices/AllotmentLetterActivity;", "Lcom/zepto/pq;", "", "x1", "", "M1", "D1", "", "it", "J1", "pfileName", "r1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/i6;", "C", "Lcom/zepto/i6;", "binding", "Landroid/app/ProgressDialog;", "D", "Landroid/app/ProgressDialog;", "v1", "()Landroid/app/ProgressDialog;", "H1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/nic/mparivahan/VahanServices/FancyServices/AllotmentLetterServices/AllotmentLetterRetrofitServices;", "E", "Lcom/nic/mparivahan/VahanServices/FancyServices/AllotmentLetterServices/AllotmentLetterRetrofitServices;", "w1", "()Lcom/nic/mparivahan/VahanServices/FancyServices/AllotmentLetterServices/AllotmentLetterRetrofitServices;", "I1", "(Lcom/nic/mparivahan/VahanServices/FancyServices/AllotmentLetterServices/AllotmentLetterRetrofitServices;)V", "retrofitService", "Lcom/zepto/ro;", "F", "Lcom/zepto/ro;", "s1", "()Lcom/zepto/ro;", "E1", "(Lcom/zepto/ro;)V", "auctionViewModle", "G", "Ljava/lang/String;", "digit", "Landroid/widget/ImageView;", "H", "Landroid/widget/ImageView;", "t1", "()Landroid/widget/ImageView;", "F1", "(Landroid/widget/ImageView;)V", "back_image", "Lcom/zepto/wa3;", "I", "Lcom/zepto/wa3;", "u1", "()Lcom/zepto/wa3;", "G1", "(Lcom/zepto/wa3;)V", "languageSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class AllotmentLetterActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public i6 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public AllotmentLetterRetrofitServices retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ro auctionViewModle;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public final String digit = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ImageView back_image;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public wa3 languageSession;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            try {
                AllotmentLetterActivity.this.v1().dismiss();
                if (gd1.a.m(str)) {
                    return;
                }
                AllotmentLetterActivity.this.r1(StringsKt__StringsKt.trim((CharSequence) str.toString()).toString());
            } catch (Exception unused) {
            }
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
            AllotmentLetterActivity.this.v1().dismiss();
            if (StringsKt__StringsJVMKt.equals(str, "Error", true)) {
                return;
            }
            AllotmentLetterActivity.this.J1(str);
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

    public static final void A1(AllotmentLetterActivity this$0, View view) throws JSONException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.M1()) {
            this$0.v1().show();
            ro roVarS1 = this$0.s1();
            i6 i6Var = this$0.binding;
            if (i6Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                i6Var = null;
            }
            roVarS1.j(String.valueOf(i6Var.h.getText()));
        }
    }

    public static final void B1(AllotmentLetterActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void C1(AllotmentLetterActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final void D1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J1(String it) {
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AllotmentLetterActivity.K1(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ko
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AllotmentLetterActivity.L1(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    private final boolean M1() throws JSONException {
        v1().show();
        i6 i6Var = this.binding;
        i6 i6Var2 = null;
        if (i6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i6Var = null;
        }
        Editable text = i6Var.h.getText();
        Intrinsics.checkNotNull(text);
        if (text.length() != 0) {
            ro roVarS1 = s1();
            i6 i6Var3 = this.binding;
            if (i6Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                i6Var2 = i6Var3;
            }
            Editable text2 = i6Var2.h.getText();
            Intrinsics.checkNotNull(text2);
            roVarS1.j(text2.toString());
            return true;
        }
        i6 i6Var4 = this.binding;
        if (i6Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i6Var4 = null;
        }
        i6Var4.h.setError(u1().b("PLEASE_ENTER_APPLICATION", "Please enter valid Receipt Number"));
        i6 i6Var5 = this.binding;
        if (i6Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            i6Var2 = i6Var5;
        }
        i6Var2.h.requestFocus();
        v1().dismiss();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r1(String pfileName) {
        Log.e("callentered", "entered tp call");
        try {
            Method method = StrictMode.class.getMethod("disableDeathOnFileUriExposure", new Class[0]);
            Intrinsics.checkNotNullExpressionValue(method, "getMethod(...)");
            method.invoke(null, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.e("pdftest", "entered tp pdf");
        String str = pfileName + ".pdf";
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), '/' + str);
        Log.e("tesfile2", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + '/' + str);
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.fromFile(file), "application/pdf");
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this, "pdf not found", 1).show();
        }
    }

    private final void x1() {
        try {
            getIntent();
        } catch (Exception unused) {
        }
        i6 i6Var = this.binding;
        i6 i6Var2 = null;
        if (i6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i6Var = null;
        }
        i6Var.c.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AllotmentLetterActivity.y1(this.a, view);
            }
        });
        i6 i6Var3 = this.binding;
        if (i6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i6Var3 = null;
        }
        i6Var3.c.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AllotmentLetterActivity.z1(this.a, view);
            }
        });
        i6 i6Var4 = this.binding;
        if (i6Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i6Var4 = null;
        }
        i6Var4.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.no
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                AllotmentLetterActivity.A1(this.a, view);
            }
        });
        i6 i6Var5 = this.binding;
        if (i6Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i6Var5 = null;
        }
        i6Var5.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.oo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AllotmentLetterActivity.B1(this.a, view);
            }
        });
        i6 i6Var6 = this.binding;
        if (i6Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i6Var6 = null;
        }
        i6Var6.h.setKeyListener(DigitsKeyListener.getInstance(this.digit));
        i6 i6Var7 = this.binding;
        if (i6Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            i6Var2 = i6Var7;
        }
        i6Var2.h.setRawInputType(ConstantsKt.DEFAULT_BLOCK_SIZE);
    }

    public static final void y1(AllotmentLetterActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.D1();
    }

    public static final void z1(AllotmentLetterActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public final void E1(ro roVar) {
        Intrinsics.checkNotNullParameter(roVar, "<set-?>");
        this.auctionViewModle = roVar;
    }

    public final void F1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.back_image = imageView;
    }

    public final void G1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }

    public final void H1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void I1(AllotmentLetterRetrofitServices allotmentLetterRetrofitServices) {
        Intrinsics.checkNotNullParameter(allotmentLetterRetrofitServices, "<set-?>");
        this.retrofitService = allotmentLetterRetrofitServices;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        i6 i6VarC = i6.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(i6VarC, "inflate(...)");
        this.binding = i6VarC;
        i6 i6Var = null;
        if (i6VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i6VarC = null;
        }
        setContentView(i6VarC.b());
        G1(new wa3(this));
        View viewFindViewById = findViewById(R.id.mvvm_back);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        F1((ImageView) viewFindViewById);
        ta3.a aVar = ta3.a;
        i6 i6Var2 = this.binding;
        if (i6Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i6Var2 = null;
        }
        aVar.C(this, i6Var2);
        i6 i6Var3 = this.binding;
        if (i6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            i6Var = i6Var3;
        }
        i6Var.c.i.setText(getIntent().getStringExtra("ServiceName"));
        H1(new ProgressDialog(this));
        v1().setMessage(u1().b("label_challan_please_wait", "Please wait..."));
        v1().setCancelable(false);
        v1().setCanceledOnTouchOutside(false);
        I1(AllotmentLetterRetrofitServices.INSTANCE.a(this));
        E1((ro) new z(this, new po(new qo(w1()))).a(ro.class));
        x1();
        t1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.io
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AllotmentLetterActivity.C1(this.a, view);
            }
        });
        s1().i().g(this, new c(new a()));
        s1().h().g(this, new c(new b()));
    }

    public final ro s1() {
        ro roVar = this.auctionViewModle;
        if (roVar != null) {
            return roVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("auctionViewModle");
        return null;
    }

    public final ImageView t1() {
        ImageView imageView = this.back_image;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("back_image");
        return null;
    }

    public final wa3 u1() {
        wa3 wa3Var = this.languageSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageSession");
        return null;
    }

    public final ProgressDialog v1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final AllotmentLetterRetrofitServices w1() {
        AllotmentLetterRetrofitServices allotmentLetterRetrofitServices = this.retrofitService;
        if (allotmentLetterRetrofitServices != null) {
            return allotmentLetterRetrofitServices;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }
}
