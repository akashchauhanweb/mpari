package com.nic.mparivahan.Language;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.method.DigitsKeyListener;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Account.SignService;
import com.nic.mparivahan.Account.View.ChangeMpinOtpVerif;
import com.nic.mparivahan.Account.View.SignInScreen;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Language.ChangeMpinActivity;
import com.nic.mparivahan.R;
import com.zepto.a26;
import com.zepto.c26;
import com.zepto.gd1;
import com.zepto.hz0;
import com.zepto.mf4;
import com.zepto.p26;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.va3;
import com.zepto.wa3;
import com.zepto.ws6;
import com.zepto.zd0;
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
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b6\u00107J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\u001e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\fR\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/nic/mparivahan/Language/ChangeMpinActivity;", "Lcom/zepto/pq;", "", "w1", "", "J1", "D1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "title", "", "value", "q1", "message", "E1", "Lcom/zepto/zd0;", "C", "Lcom/zepto/zd0;", "binding", "Lcom/zepto/wa3;", "D", "Lcom/zepto/wa3;", "u1", "()Lcom/zepto/wa3;", "H1", "(Lcom/zepto/wa3;)V", "session", "E", "Ljava/lang/String;", "digit", "Lcom/zepto/p26;", "F", "Lcom/zepto/p26;", "v1", "()Lcom/zepto/p26;", "I1", "(Lcom/zepto/p26;)V", "viewModel", "Lcom/nic/mparivahan/Account/SignService;", "G", "Lcom/nic/mparivahan/Account/SignService;", "retrofitService", "Landroid/app/ProgressDialog;", "H", "Landroid/app/ProgressDialog;", "t1", "()Landroid/app/ProgressDialog;", "G1", "(Landroid/app/ProgressDialog;)V", "pDialog", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ChangeMpinActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public zd0 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public final String digit = "0123456789";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public p26 viewModel;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public SignService retrofitService;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    public static final class a extends Lambda implements Function1 {
        public final /* synthetic */ ws6 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ws6 ws6Var) {
            super(1);
            this.e = ws6Var;
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
                ChangeMpinActivity.this.t1().dismiss();
                if (!StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL001", true)) {
                    if (gd1.a.m(sendOtpResult.getStatusDesc())) {
                        Toast.makeText(ChangeMpinActivity.this.getApplicationContext(), ChangeMpinActivity.this.u1().b("label_log_unbl_reset", "Unable to reset the MPIN, Please try after sometime."), 1).show();
                        return;
                    } else {
                        ChangeMpinActivity changeMpinActivity = ChangeMpinActivity.this;
                        changeMpinActivity.E1(changeMpinActivity, sendOtpResult.getStatusDesc());
                        return;
                    }
                }
                Intent intent = new Intent(ChangeMpinActivity.this, (Class<?>) ChangeMpinOtpVerif.class);
                intent.putExtra("otpId", String.valueOf(sendOtpResult.getRecordId()));
                intent.putExtra("MobileNumber", this.e.l());
                intent.putExtra("RecreateFlag", 0);
                zd0 zd0Var = ChangeMpinActivity.this.binding;
                if (zd0Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    zd0Var = null;
                }
                intent.putExtra("NewMpin", zd0Var.d.getText().toString());
                intent.putExtra("title", "Change ");
                ChangeMpinActivity.this.startActivity(intent);
            } catch (Exception unused) {
                Toast.makeText(ChangeMpinActivity.this.getApplicationContext(), ChangeMpinActivity.this.u1().b("label_log_unbl_reset", "Unable to reset the MPIN, Please try after sometime."), 1).show();
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

    public static final void A1(ChangeMpinActivity this$0, ws6 session_manger, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(session_manger, "$session_manger");
        ws6 ws6Var = new ws6(this$0);
        if (this$0.J1()) {
            int i = Integer.parseInt(session_manger.m());
            zd0 zd0Var = this$0.binding;
            zd0 zd0Var2 = null;
            if (zd0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                zd0Var = null;
            }
            if (i != Integer.parseInt(zd0Var.e.getText().toString())) {
                String strB = this$0.u1().b(va3.a.c0(), "Old MPIN does not match. Please try again.");
                Intrinsics.checkNotNull(strB);
                this$0.q1(this$0, strB, 0);
                return;
            }
            hz0.a aVar = hz0.a;
            zd0 zd0Var3 = this$0.binding;
            if (zd0Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                zd0Var3 = null;
            }
            if (aVar.M(zd0Var3.d.getText().toString(), ws6Var.m())) {
                Toast.makeText(this$0.getApplicationContext(), this$0.u1().b(va3.a.m0(), "The mPin You Have Entered Matches With the Previous mPin"), 1).show();
                return;
            }
            zd0 zd0Var4 = this$0.binding;
            if (zd0Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                zd0Var4 = null;
            }
            if (aVar.N(zd0Var4.d.getText().toString())) {
                Toast.makeText(this$0.getApplicationContext(), this$0.u1().b(va3.a.n0(), "Please choose a more diverse password. Avoid using all the same digits."), 1).show();
                return;
            }
            zd0 zd0Var5 = this$0.binding;
            if (zd0Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                zd0Var5 = null;
            }
            if (aVar.L(zd0Var5.d.getText().toString())) {
                this$0.E1(this$0, "Password must not be a simple sequence of numbers.");
                return;
            }
            zd0 zd0Var6 = this$0.binding;
            if (zd0Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                zd0Var2 = zd0Var6;
            }
            if (aVar.K(zd0Var2.d.getText().toString())) {
                this$0.E1(this$0, "Password must not contain more than two repeated digits in sequence.");
            } else {
                this$0.t1().show();
                this$0.v1().B(session_manger.l(), session_manger.k());
            }
        }
    }

    public static final void B1(ChangeMpinActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void C1(ChangeMpinActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.D1();
    }

    private final void D1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    private final boolean J1() {
        zd0 zd0Var = this.binding;
        zd0 zd0Var2 = null;
        if (zd0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zd0Var = null;
        }
        if (zd0Var.e.getText().toString().length() == 0) {
            zd0 zd0Var3 = this.binding;
            if (zd0Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                zd0Var3 = null;
            }
            zd0Var3.e.setError(u1().b(va3.a.s(), "Please enter the old MPIN"));
            zd0 zd0Var4 = this.binding;
            if (zd0Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                zd0Var2 = zd0Var4;
            }
            zd0Var2.e.requestFocus();
            return false;
        }
        zd0 zd0Var5 = this.binding;
        if (zd0Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zd0Var5 = null;
        }
        if (zd0Var5.e.getText().length() < 6) {
            zd0 zd0Var6 = this.binding;
            if (zd0Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                zd0Var6 = null;
            }
            zd0Var6.e.setError(u1().b(va3.a.y0(), "Please enter 6 digit MPIN"));
            zd0 zd0Var7 = this.binding;
            if (zd0Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                zd0Var2 = zd0Var7;
            }
            zd0Var2.e.requestFocus();
            return false;
        }
        zd0 zd0Var8 = this.binding;
        if (zd0Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zd0Var8 = null;
        }
        if (zd0Var8.d.getText().toString().length() == 0) {
            zd0 zd0Var9 = this.binding;
            if (zd0Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                zd0Var9 = null;
            }
            zd0Var9.d.setError(u1().b(va3.a.x0(), "Please enter the new MPIN"));
            zd0 zd0Var10 = this.binding;
            if (zd0Var10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                zd0Var2 = zd0Var10;
            }
            zd0Var2.d.requestFocus();
            return false;
        }
        zd0 zd0Var11 = this.binding;
        if (zd0Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zd0Var11 = null;
        }
        if (zd0Var11.d.getText().length() < 6) {
            zd0 zd0Var12 = this.binding;
            if (zd0Var12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                zd0Var12 = null;
            }
            zd0Var12.d.setError(u1().b(va3.a.y0(), "Please enter 6 digit MPIN"));
            zd0 zd0Var13 = this.binding;
            if (zd0Var13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                zd0Var2 = zd0Var13;
            }
            zd0Var2.d.requestFocus();
            return false;
        }
        zd0 zd0Var14 = this.binding;
        if (zd0Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zd0Var14 = null;
        }
        if (zd0Var14.c.getText().toString().length() == 0) {
            zd0 zd0Var15 = this.binding;
            if (zd0Var15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                zd0Var15 = null;
            }
            zd0Var15.c.setError(u1().b(va3.a.v0(), "Please enter the confirm MPIN"));
            zd0 zd0Var16 = this.binding;
            if (zd0Var16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                zd0Var2 = zd0Var16;
            }
            zd0Var2.c.requestFocus();
            return false;
        }
        zd0 zd0Var17 = this.binding;
        if (zd0Var17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zd0Var17 = null;
        }
        if (zd0Var17.c.getText().length() < 6) {
            zd0 zd0Var18 = this.binding;
            if (zd0Var18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                zd0Var18 = null;
            }
            zd0Var18.c.setError(u1().b(va3.a.y0(), "Please enter 6 digit MPIN"));
            zd0 zd0Var19 = this.binding;
            if (zd0Var19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                zd0Var2 = zd0Var19;
            }
            zd0Var2.c.requestFocus();
            return false;
        }
        zd0 zd0Var20 = this.binding;
        if (zd0Var20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zd0Var20 = null;
        }
        String string = zd0Var20.d.getText().toString();
        zd0 zd0Var21 = this.binding;
        if (zd0Var21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zd0Var21 = null;
        }
        if (!Intrinsics.areEqual(string, zd0Var21.c.getText().toString())) {
            zd0 zd0Var22 = this.binding;
            if (zd0Var22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                zd0Var22 = null;
            }
            zd0Var22.c.setError(u1().b(va3.a.w0(), "Please enter correct MPIN"));
            zd0 zd0Var23 = this.binding;
            if (zd0Var23 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                zd0Var2 = zd0Var23;
            }
            zd0Var2.c.requestFocus();
            return false;
        }
        zd0 zd0Var24 = this.binding;
        if (zd0Var24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zd0Var24 = null;
        }
        String string2 = StringsKt__StringsKt.trim((CharSequence) zd0Var24.e.getText().toString()).toString();
        zd0 zd0Var25 = this.binding;
        if (zd0Var25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zd0Var25 = null;
        }
        if (!Intrinsics.areEqual(string2, zd0Var25.d.getText().toString())) {
            return true;
        }
        zd0 zd0Var26 = this.binding;
        if (zd0Var26 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zd0Var26 = null;
        }
        zd0Var26.d.setError(u1().b(va3.a.b0(), "Old MPIN & New MPIN can not be same"));
        zd0 zd0Var27 = this.binding;
        if (zd0Var27 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            zd0Var2 = zd0Var27;
        }
        zd0Var2.c.requestFocus();
        return false;
    }

    public static final void r1(Dialog dialog, int i, ChangeMpinActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dialog.dismiss();
        if (i == 1) {
            Intent intent = new Intent(this$0, (Class<?>) SignInScreen.class);
            intent.addFlags(67108864);
            this$0.startActivity(intent);
            this$0.finish();
        }
    }

    private final void w1() {
        final ws6 ws6Var = new ws6(this);
        zd0 zd0Var = this.binding;
        zd0 zd0Var2 = null;
        if (zd0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zd0Var = null;
        }
        zd0Var.e.setKeyListener(DigitsKeyListener.getInstance(this.digit));
        zd0 zd0Var3 = this.binding;
        if (zd0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zd0Var3 = null;
        }
        zd0Var3.e.setRawInputType(2);
        zd0 zd0Var4 = this.binding;
        if (zd0Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zd0Var4 = null;
        }
        zd0Var4.d.setKeyListener(DigitsKeyListener.getInstance(this.digit));
        zd0 zd0Var5 = this.binding;
        if (zd0Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zd0Var5 = null;
        }
        zd0Var5.d.setRawInputType(2);
        zd0 zd0Var6 = this.binding;
        if (zd0Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zd0Var6 = null;
        }
        zd0Var6.c.setKeyListener(DigitsKeyListener.getInstance(this.digit));
        zd0 zd0Var7 = this.binding;
        if (zd0Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zd0Var7 = null;
        }
        zd0Var7.c.setRawInputType(2);
        zd0 zd0Var8 = this.binding;
        if (zd0Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zd0Var8 = null;
        }
        zd0Var8.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeMpinActivity.x1(this.a, view);
            }
        });
        zd0 zd0Var9 = this.binding;
        if (zd0Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zd0Var9 = null;
        }
        zd0Var9.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeMpinActivity.y1(this.a, view);
            }
        });
        zd0 zd0Var10 = this.binding;
        if (zd0Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zd0Var10 = null;
        }
        zd0Var10.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.td0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeMpinActivity.z1(this.a, view);
            }
        });
        zd0 zd0Var11 = this.binding;
        if (zd0Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zd0Var11 = null;
        }
        zd0Var11.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ud0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeMpinActivity.A1(this.a, ws6Var, view);
            }
        });
        zd0 zd0Var12 = this.binding;
        if (zd0Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zd0Var12 = null;
        }
        zd0Var12.i.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeMpinActivity.B1(this.a, view);
            }
        });
        zd0 zd0Var13 = this.binding;
        if (zd0Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            zd0Var2 = zd0Var13;
        }
        zd0Var2.i.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeMpinActivity.C1(this.a, view);
            }
        });
        v1().w().g(this, new b(new a(ws6Var)));
    }

    public static final void x1(ChangeMpinActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        zd0 zd0Var = this$0.binding;
        zd0 zd0Var2 = null;
        if (zd0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zd0Var = null;
        }
        if (zd0Var.e.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            zd0 zd0Var3 = this$0.binding;
            if (zd0Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                zd0Var3 = null;
            }
            zd0Var3.e.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            zd0 zd0Var4 = this$0.binding;
            if (zd0Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                zd0Var2 = zd0Var4;
            }
            zd0Var2.h.setImageResource(R.drawable.pass_visible);
            return;
        }
        zd0 zd0Var5 = this$0.binding;
        if (zd0Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zd0Var5 = null;
        }
        zd0Var5.e.setTransformationMethod(PasswordTransformationMethod.getInstance());
        zd0 zd0Var6 = this$0.binding;
        if (zd0Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            zd0Var2 = zd0Var6;
        }
        zd0Var2.h.setImageResource(R.drawable.mvvm_visibility);
    }

    public static final void y1(ChangeMpinActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        zd0 zd0Var = this$0.binding;
        zd0 zd0Var2 = null;
        if (zd0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zd0Var = null;
        }
        if (zd0Var.d.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            zd0 zd0Var3 = this$0.binding;
            if (zd0Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                zd0Var3 = null;
            }
            zd0Var3.d.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            zd0 zd0Var4 = this$0.binding;
            if (zd0Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                zd0Var2 = zd0Var4;
            }
            zd0Var2.g.setImageResource(R.drawable.pass_visible);
            return;
        }
        zd0 zd0Var5 = this$0.binding;
        if (zd0Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zd0Var5 = null;
        }
        zd0Var5.d.setTransformationMethod(PasswordTransformationMethod.getInstance());
        zd0 zd0Var6 = this$0.binding;
        if (zd0Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            zd0Var2 = zd0Var6;
        }
        zd0Var2.g.setImageResource(R.drawable.mvvm_visibility);
    }

    public static final void z1(ChangeMpinActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        zd0 zd0Var = this$0.binding;
        zd0 zd0Var2 = null;
        if (zd0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zd0Var = null;
        }
        if (zd0Var.c.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            zd0 zd0Var3 = this$0.binding;
            if (zd0Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                zd0Var3 = null;
            }
            zd0Var3.c.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            zd0 zd0Var4 = this$0.binding;
            if (zd0Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                zd0Var2 = zd0Var4;
            }
            zd0Var2.f.setImageResource(R.drawable.pass_visible);
            return;
        }
        zd0 zd0Var5 = this$0.binding;
        if (zd0Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zd0Var5 = null;
        }
        zd0Var5.c.setTransformationMethod(PasswordTransformationMethod.getInstance());
        zd0 zd0Var6 = this$0.binding;
        if (zd0Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            zd0Var2 = zd0Var6;
        }
        zd0Var2.f.setImageResource(R.drawable.mvvm_visibility);
    }

    public final void E1(Context context, String message) {
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
        ((TextView) viewFindViewById4).setText(u1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(u1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeMpinActivity.F1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void G1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void H1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final void I1(p26 p26Var) {
        Intrinsics.checkNotNullParameter(p26Var, "<set-?>");
        this.viewModel = p26Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_mpin);
        zd0 zd0VarC = zd0.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(zd0VarC, "inflate(...)");
        this.binding = zd0VarC;
        SignService signService = null;
        if (zd0VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zd0VarC = null;
        }
        setContentView(zd0VarC.b());
        ta3.a aVar = ta3.a;
        zd0 zd0Var = this.binding;
        if (zd0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zd0Var = null;
        }
        aVar.O(this, zd0Var);
        H1(new wa3(this));
        zd0 zd0Var2 = this.binding;
        if (zd0Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zd0Var2 = null;
        }
        zd0Var2.i.i.setText(u1().b(va3.a.d(), "Change MPIN"));
        G1(new ProgressDialog(this));
        t1().setMessage(u1().b("label_challan_please_wait", "Please wait..."));
        t1().setCancelable(false);
        t1().setCanceledOnTouchOutside(false);
        this.retrofitService = SignService.INSTANCE.a(this);
        SignService signService2 = this.retrofitService;
        if (signService2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        } else {
            signService = signService2;
        }
        I1((p26) new z(this, new a26(new c26(signService))).a(p26.class));
        w1();
    }

    public final void q1(Context context, String title, final int value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.mvvm_number_dialog);
        View viewFindViewById = dialog.findViewById(R.id.txt_dialog);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(title);
        View viewFindViewById2 = dialog.findViewById(R.id.ok);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        textView.setText(u1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeMpinActivity.r1(dialog, value, this, view);
            }
        });
        dialog.show();
    }

    public final ProgressDialog t1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final wa3 u1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final p26 v1() {
        p26 p26Var = this.viewModel;
        if (p26Var != null) {
            return p26Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }
}
