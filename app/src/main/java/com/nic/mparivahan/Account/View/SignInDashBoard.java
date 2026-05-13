package com.nic.mparivahan.Account.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.nic.mparivahan.Account.View.SignInDashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.a;
import com.zepto.hz0;
import com.zepto.pq;
import com.zepto.t5;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.yy3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0015R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/nic/mparivahan/Account/View/SignInDashBoard;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/widget/LinearLayout;", "C", "Landroid/widget/LinearLayout;", "l1", "()Landroid/widget/LinearLayout;", "q1", "(Landroid/widget/LinearLayout;)V", "redirectToSignInScreen", "Landroid/widget/TextView;", "D", "Landroid/widget/TextView;", "k1", "()Landroid/widget/TextView;", "p1", "(Landroid/widget/TextView;)V", "create_textview", "Lcom/zepto/yy3;", "E", "Lcom/zepto/yy3;", "binding", "Lcom/zepto/wa3;", "F", "Lcom/zepto/wa3;", "m1", "()Lcom/zepto/wa3;", "r1", "(Lcom/zepto/wa3;)V", "session", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class SignInDashBoard extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public LinearLayout redirectToSignInScreen;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public TextView create_textview;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public yy3 binding;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wa3 session;

    public static final void n1(SignInDashBoard this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (a.a.a(this$0)) {
            this$0.startActivity(new Intent(this$0, (Class<?>) CreateAccountScreen.class));
        } else {
            Toast.makeText(this$0, this$0.m1().b("label_log_check_internet", "Please check you internet connection"), 0).show();
        }
    }

    public static final void o1(SignInDashBoard this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) SignInScreen.class);
        hz0.a aVar = hz0.a;
        intent.putExtra(aVar.u(), aVar.v());
        this$0.startActivity(intent);
    }

    public final TextView k1() {
        TextView textView = this.create_textview;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("create_textview");
        return null;
    }

    public final LinearLayout l1() {
        LinearLayout linearLayout = this.redirectToSignInScreen;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("redirectToSignInScreen");
        return null;
    }

    public final wa3 m1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        yy3 yy3VarC = yy3.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(yy3VarC, "inflate(...)");
        this.binding = yy3VarC;
        hz0.a aVar = hz0.a;
        aVar.k(this);
        yy3 yy3Var = this.binding;
        yy3 yy3Var2 = null;
        if (yy3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            yy3Var = null;
        }
        setContentView(yy3Var.b());
        ta3.a aVar2 = ta3.a;
        yy3 yy3Var3 = this.binding;
        if (yy3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            yy3Var2 = yy3Var3;
        }
        aVar2.R1(this, yy3Var2);
        com.nic.mparivahan.Welcome.a.a.a(this);
        r1(new wa3(this));
        aVar.i(this);
        t5 t5VarU0 = U0();
        if (t5VarU0 != null) {
            t5VarU0.s(true);
        }
        View viewFindViewById = findViewById(R.id.sign_in);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        q1((LinearLayout) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.create_account);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        p1((TextView) viewFindViewById2);
        k1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.y16
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignInDashBoard.n1(this.a, view);
            }
        });
        l1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.z16
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignInDashBoard.o1(this.a, view);
            }
        });
    }

    public final void p1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.create_textview = textView;
    }

    public final void q1(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.redirectToSignInScreen = linearLayout;
    }

    public final void r1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }
}
