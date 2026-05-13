package com.nic.mparivahan.Account.View;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Account.SignService;
import com.nic.mparivahan.Account.View.DeleteAccount;
import com.nic.mparivahan.R;
import com.zepto.a26;
import com.zepto.c26;
import com.zepto.gd1;
import com.zepto.hz0;
import com.zepto.mf4;
import com.zepto.p26;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.ws6;
import com.zepto.y8;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b5\u00106J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bJ\b\u0010\f\u001a\u00020\u0004H\u0002R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/nic/mparivahan/Account/View/DeleteAccount;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/content/Context;", "context", "", "message", "n1", "x1", "u1", "Lcom/zepto/y8;", "C", "Lcom/zepto/y8;", "binding", "Lcom/zepto/wa3;", "D", "Lcom/zepto/wa3;", "q1", "()Lcom/zepto/wa3;", "z1", "(Lcom/zepto/wa3;)V", "languageKeySession", "Lcom/zepto/p26;", "E", "Lcom/zepto/p26;", "t1", "()Lcom/zepto/p26;", "C1", "(Lcom/zepto/p26;)V", "viewModel", "Lcom/nic/mparivahan/Account/SignService;", "F", "Lcom/nic/mparivahan/Account/SignService;", "retrofitService", "Lcom/zepto/ws6;", "G", "Lcom/zepto/ws6;", "s1", "()Lcom/zepto/ws6;", "B1", "(Lcom/zepto/ws6;)V", "sessionManager", "Landroid/app/ProgressDialog;", "H", "Landroid/app/ProgressDialog;", "r1", "()Landroid/app/ProgressDialog;", "A1", "(Landroid/app/ProgressDialog;)V", "pDialog", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class DeleteAccount extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public y8 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public p26 viewModel;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public SignService retrofitService;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void a(SendOtpResult sendOtpResult) {
            try {
                DeleteAccount.this.r1().dismiss();
                if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL001", true)) {
                    Intent intent = new Intent(DeleteAccount.this, (Class<?>) DeleteAccountVerify.class);
                    intent.putExtra("otpId", String.valueOf(sendOtpResult.getRecordId()));
                    intent.putExtra("MobileNumber", DeleteAccount.this.s1().l());
                    intent.putExtra("title", DeleteAccount.this.q1().b("delet_account", "Delete Account"));
                    DeleteAccount.this.startActivity(intent);
                    DeleteAccount.this.finish();
                } else if (gd1.a.m(sendOtpResult.getStatusDesc())) {
                    Toast.makeText(DeleteAccount.this.getApplicationContext(), DeleteAccount.this.q1().b("label_log_unbl_reset", "Unable to reset the MPIN, Please try after sometime."), 1).show();
                } else {
                    DeleteAccount deleteAccount = DeleteAccount.this;
                    deleteAccount.x1(deleteAccount, sendOtpResult.getStatusDesc());
                }
            } catch (Exception unused) {
                Toast.makeText(DeleteAccount.this.getApplicationContext(), DeleteAccount.this.q1().b("label_log_unbl_reset", "Unable to reset the MPIN, Please try after sometime."), 1).show();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SendOtpResult) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public b(Function1 function) {
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

    public static final void o1(Dialog d, DeleteAccount this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.r1().show();
        this$0.t1().g(this$0.s1().l(), this$0.s1().k().toString());
    }

    public static final void p1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void v1(DeleteAccount this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void w1(DeleteAccount this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.n1(this$0, this$0.q1().b("account_delete", this$0.getString(R.string.deletaccount)));
    }

    public static final void y1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public final void A1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void B1(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final void C1(p26 p26Var) {
        Intrinsics.checkNotNullParameter(p26Var, "<set-?>");
        this.viewModel = p26Var;
    }

    public final void n1(Context context, String message) {
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yh1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeleteAccount.o1(dialog, this, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zh1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeleteAccount.p1(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        y8 y8VarX = y8.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(y8VarX, "inflate(...)");
        this.binding = y8VarX;
        hz0.a.k(this);
        y8 y8Var = this.binding;
        y8 y8Var2 = null;
        if (y8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            y8Var = null;
        }
        setContentView(y8Var.m());
        ta3.a aVar = ta3.a;
        y8 y8Var3 = this.binding;
        if (y8Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            y8Var3 = null;
        }
        aVar.o0(this, y8Var3);
        z1(new wa3(this));
        B1(new ws6(this));
        A1(new ProgressDialog(this));
        r1().setMessage(q1().b("label_challan_please_wait", "Please wait..."));
        r1().setCancelable(false);
        r1().setCanceledOnTouchOutside(false);
        this.retrofitService = SignService.INSTANCE.a(this);
        SignService signService = this.retrofitService;
        if (signService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            signService = null;
        }
        C1((p26) new z(this, new a26(new c26(signService))).a(p26.class));
        u1();
        y8 y8Var4 = this.binding;
        if (y8Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            y8Var2 = y8Var4;
        }
        y8Var2.z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wh1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeleteAccount.w1(this.a, view);
            }
        });
        t1().h().g(this, new b(new a()));
    }

    public final wa3 q1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final ProgressDialog r1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final ws6 s1() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final p26 t1() {
        p26 p26Var = this.viewModel;
        if (p26Var != null) {
            return p26Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void u1() {
        y8 y8Var = this.binding;
        y8 y8Var2 = null;
        if (y8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            y8Var = null;
        }
        y8Var.D.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ai1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeleteAccount.v1(this.a, view);
            }
        });
        y8 y8Var3 = this.binding;
        if (y8Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            y8Var3 = null;
        }
        y8Var3.D.e.setVisibility(8);
        y8 y8Var4 = this.binding;
        if (y8Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            y8Var2 = y8Var4;
        }
        y8Var2.D.f.setText(getString(R.string.delete_account));
    }

    public final void x1(Context context, String message) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById4).setText(q1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(q1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xh1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeleteAccount.y1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void z1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }
}
