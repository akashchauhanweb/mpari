package com.nic.mparivahan.Language;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.nic.mparivahan.Account.View.DeleteAccount;
import com.nic.mparivahan.Language.SettingActivity;
import com.nic.mparivahan.R;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.uz5;
import com.zepto.ws6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0016\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\f\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/nic/mparivahan/Language/SettingActivity;", "Lcom/zepto/pq;", "", "q1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "title", "o1", "v1", "Lcom/zepto/uz5;", "C", "Lcom/zepto/uz5;", "binding", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class SettingActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public uz5 binding;

    public static final void p1(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    private final void q1() {
        final ws6 ws6Var = new ws6(this);
        uz5 uz5Var = this.binding;
        uz5 uz5Var2 = null;
        if (uz5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uz5Var = null;
        }
        uz5Var.m.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.oz5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.r1(this.a, view);
            }
        });
        uz5 uz5Var3 = this.binding;
        if (uz5Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uz5Var3 = null;
        }
        uz5Var3.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pz5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.s1(this.a, view);
            }
        });
        uz5 uz5Var4 = this.binding;
        if (uz5Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uz5Var4 = null;
        }
        uz5Var4.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qz5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.t1(ws6Var, this, view);
            }
        });
        uz5 uz5Var5 = this.binding;
        if (uz5Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            uz5Var2 = uz5Var5;
        }
        uz5Var2.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rz5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.u1(this.a, view);
            }
        });
    }

    public static final void r1(SettingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void s1(SettingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.v1(this$0);
    }

    public static final void t1(ws6 session_manger, SettingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(session_manger, "$session_manger");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (StringsKt__StringsJVMKt.equals(session_manger.m(), "null", true)) {
            this$0.o1(this$0, "You haven't set the MPIN yet, Please set MPIN.");
        } else {
            this$0.startActivity(new Intent(this$0, (Class<?>) ChangeMpinActivity.class));
        }
    }

    public static final void u1(SettingActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) DeleteAccount.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public final void o1(Context context, String title) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tz5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.p1(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_activity);
        uz5 uz5VarC = uz5.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(uz5VarC, "inflate(...)");
        this.binding = uz5VarC;
        uz5 uz5Var = null;
        if (uz5VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uz5VarC = null;
        }
        setContentView(uz5VarC.b());
        ta3.a aVar = ta3.a;
        uz5 uz5Var2 = this.binding;
        if (uz5Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            uz5Var = uz5Var2;
        }
        aVar.P1(this, uz5Var);
        q1();
    }

    public final void v1(Context context) {
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
        ((TextView) viewFindViewById).setText("Available Soon\n(Under Development)");
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sz5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingActivity.w1(dialog, view);
            }
        });
        dialog.show();
    }
}
