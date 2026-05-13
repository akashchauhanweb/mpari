package com.nic.mparivahan.VahanServices.VahanView;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.FileProvider;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanApplication;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanView.VahanFaceLessConfirmation;
import com.zepto.d07;
import com.zepto.pq;
import com.zepto.st6;
import com.zepto.ta3;
import com.zepto.wa3;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b<\u0010=J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0012\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010'\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010+\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\"\u0010/\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010$\"\u0004\b.\u0010&R\"\u00103\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010\"\u001a\u0004\b1\u0010$\"\u0004\b2\u0010&R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanView/VahanFaceLessConfirmation;", "Lcom/zepto/pq;", "", "C1", "Landroidx/constraintlayout/widget/ConstraintLayout;", "containerView", "w1", "Ljava/io/File;", "file", "J1", "onBackPressed", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "p1", "Lcom/zepto/d07;", "C", "Lcom/zepto/d07;", "t1", "()Lcom/zepto/d07;", "E1", "(Lcom/zepto/d07;)V", "binding", "D", "Ljava/lang/String;", "s1", "()Ljava/lang/String;", "D1", "(Ljava/lang/String;)V", "application", "E", "getState_code", "I1", "state_code", "F", "getRc_number", "H1", "rc_number", "G", "v1", "G1", VContant.PURPOSE_CODE, "Lcom/zepto/wa3;", "H", "Lcom/zepto/wa3;", "u1", "()Lcom/zepto/wa3;", "F1", "(Lcom/zepto/wa3;)V", "languageKeySession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanFaceLessConfirmation extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public d07 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String application;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String state_code;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String purpose_code;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public wa3 languageKeySession;

    public static final void A1(VahanFaceLessConfirmation this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    public static final void B1(VahanFaceLessConfirmation this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (st6.e(this$0)) {
            ConstraintLayout containerCl = this$0.t1().d;
            Intrinsics.checkNotNullExpressionValue(containerCl, "containerCl");
            this$0.w1(containerCl);
        }
    }

    private final void C1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    private final void J1(File file) {
        Uri uriF = FileProvider.f(this, "com.nic.mparivahan.provider", file);
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriF, "image/*");
            intent.setFlags(67108864);
            intent.addFlags(1);
            startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(this, "No Application available to view pdf", 1).show();
        }
    }

    public static final void q1(Dialog d, VahanFaceLessConfirmation this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    private final void w1(ConstraintLayout containerView) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(containerView.getWidth(), containerView.getHeight(), Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            containerView.draw(new Canvas(bitmapCreateBitmap));
            String str = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "//";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(str + "screenshot" + s1() + ".png");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 70, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            J1(file2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static final void x1(VahanFaceLessConfirmation this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) VahanApplication.class));
        this$0.finish();
    }

    public static final void y1(VahanFaceLessConfirmation this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.p1(this$0, this$0.u1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void z1(VahanFaceLessConfirmation this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.C1();
    }

    public final void D1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.application = str;
    }

    public final void E1(d07 d07Var) {
        Intrinsics.checkNotNullParameter(d07Var, "<set-?>");
        this.binding = d07Var;
    }

    public final void F1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void G1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.purpose_code = str;
    }

    public final void H1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void I1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.state_code = str;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        p1(this, u1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vahan_confirmation_faceless);
        d07 d07VarC = d07.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(d07VarC, "inflate(...)");
        E1(d07VarC);
        setContentView(t1().b());
        ta3.a.I2(this, t1());
        F1(new wa3(this));
        I1(String.valueOf(getIntent().getStringExtra("state_code")));
        H1(String.valueOf(getIntent().getStringExtra("rc_number")));
        D1(String.valueOf(getIntent().getStringExtra(VContant.APP_NO)));
        G1(String.valueOf(getIntent().getStringExtra(VContant.PURPOSE_CODE)));
        String strL = VContant.INSTANCE.L(this, v1());
        t1().g.i.setText(strL);
        t1().c.setText("Your application has been successfully submitted  " + strL + " with application no. " + s1() + " for further process. ");
        t1().b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.g47
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanFaceLessConfirmation.x1(this.a, view);
            }
        });
        t1().g.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.h47
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanFaceLessConfirmation.y1(this.a, view);
            }
        });
        t1().g.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.i47
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanFaceLessConfirmation.z1(this.a, view);
            }
        });
        t1().e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.j47
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanFaceLessConfirmation.A1(this.a, view);
            }
        });
        t1().f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.k47
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanFaceLessConfirmation.B1(this.a, view);
            }
        });
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        p1(this, u1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    public final void p1(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Dialog dialog = new Dialog(context);
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
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        wa3 wa3Var = new wa3(context);
        ((TextView) viewFindViewById4).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(wa3Var.b("btn_ok", context.getString(R.string.ok_txt)));
        textView2.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.l47
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanFaceLessConfirmation.q1(dialog, this, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.m47
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanFaceLessConfirmation.r1(dialog, view);
            }
        });
        dialog.show();
    }

    public final String s1() {
        String str = this.application;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("application");
        return null;
    }

    public final d07 t1() {
        d07 d07Var = this.binding;
        if (d07Var != null) {
            return d07Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final wa3 u1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final String v1() {
        String str = this.purpose_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(VContant.PURPOSE_CODE);
        return null;
    }
}
