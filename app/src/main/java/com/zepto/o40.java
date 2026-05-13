package com.zepto;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.snackbar.Snackbar;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o40 extends pq {
    public static final a E = new a(null);
    public Context C;
    public wa3 D;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ void q1(o40 o40Var, String str, String str2, int i, String str3, String str4, Function1 function1, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sarathiCustomDailog");
        }
        if ((i2 & 8) != 0) {
            wa3 wa3Var = o40Var.D;
            Intrinsics.checkNotNull(wa3Var);
            str3 = wa3Var.b("button_proceed", "Proceed");
            Intrinsics.checkNotNull(str3);
        }
        String str5 = str3;
        if ((i2 & 16) != 0) {
            wa3 wa3Var2 = o40Var.D;
            Intrinsics.checkNotNull(wa3Var2);
            str4 = wa3Var2.b("button_cancel", "Cancel");
            Intrinsics.checkNotNull(str4);
        }
        o40Var.p1(str, str2, i, str5, str4, function1);
    }

    public static final void r1(Function1 onProceed, o40 this$0, Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(onProceed, "$onProceed");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        onProceed.invoke("Yes");
        this$0.n1(this$0);
        dialog.dismiss();
    }

    public static final void s1(Function1 onProceed, Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(onProceed, "$onProceed");
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        onProceed.invoke("No");
        dialog.dismiss();
    }

    public static final void t1(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    public static final void v1(Snackbar snack, View view) {
        Intrinsics.checkNotNullParameter(snack, "$snack");
        snack.x();
    }

    public static final void x1(Snackbar snackbar, View view) {
        Intrinsics.checkNotNullParameter(snackbar, "$snackbar");
        snackbar.x();
    }

    @Override // com.zepto.pq
    public boolean c1() {
        onBackPressed();
        return true;
    }

    public final void n1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("vibrator");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        ((Vibrator) systemService).vibrate(50L);
    }

    public final void o1() {
        Object systemService = getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        View currentFocus = getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(this);
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.C = this;
        this.D = new wa3(this);
    }

    public final void p1(String title, String message, int i, String yesMsg, String cancelMsg, final Function1 onProceed) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(yesMsg, "yesMsg");
        Intrinsics.checkNotNullParameter(cancelMsg, "cancelMsg");
        Intrinsics.checkNotNullParameter(onProceed, "onProceed");
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.setContentView(R.layout.sarathi_confirm_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Window window2 = dialog.getWindow();
        WindowManager.LayoutParams attributes = window2 != null ? window2.getAttributes() : null;
        if (attributes != null) {
            attributes.windowAnimations = R.style.PauseDialogAnimation;
        }
        MyTextView myTextView = (MyTextView) dialog.findViewById(R.id.sarathi_popup_title);
        MyTextView myTextView2 = (MyTextView) dialog.findViewById(R.id.sarathi_popup_message);
        TextView textView = (TextView) dialog.findViewById(R.id.sarathi_pop_up_proceed);
        TextView textView2 = (TextView) dialog.findViewById(R.id.sarathi_pop_up_cancel);
        LinearLayout linearLayout = (LinearLayout) dialog.findViewById(R.id.cancel);
        textView.setText(yesMsg);
        textView2.setText(cancelMsg);
        myTextView.setText(title);
        myTextView2.setText(message);
        if (i == 1) {
            textView2.setVisibility(8);
        } else if (i == 2) {
            textView.setVisibility(8);
        } else if (i == 10) {
            linearLayout.setVisibility(0);
            textView2.setText("Add");
            textView2.setBackground(getResources().getDrawable(R.drawable.background_shape_blue));
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.j40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o40.r1(onProceed, this, dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.k40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o40.s1(onProceed, dialog, view);
            }
        });
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.l40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o40.t1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void u1(String str, View view) {
        if (view == null) {
            return;
        }
        Intrinsics.checkNotNull(str);
        final Snackbar snackbarL0 = Snackbar.l0(view, str, 6000);
        Intrinsics.checkNotNullExpressionValue(snackbarL0, "make(...)");
        snackbarL0.n0("Close", new View.OnClickListener() { // from class: com.zepto.n40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                o40.v1(snackbarL0, view2);
            }
        });
        View viewG = snackbarL0.G();
        Context context = this.C;
        Intrinsics.checkNotNull(context);
        viewG.setBackgroundColor(yy0.c(context, R.color.never_mix));
        snackbarL0.o0(-1);
        View viewG2 = snackbarL0.G();
        Intrinsics.checkNotNullExpressionValue(viewG2, "getView(...)");
        TextView textView = (TextView) viewG2.findViewById(R.id.snackbar_text);
        Context context2 = this.C;
        Intrinsics.checkNotNull(context2);
        textView.setTextColor(yy0.c(context2, R.color.white));
        textView.setMaxLines(5);
        snackbarL0.W();
    }

    public final void w1(String str, View view) {
        if (view != null) {
            Intrinsics.checkNotNull(str);
            final Snackbar snackbarL0 = Snackbar.l0(view, str, 3000);
            Intrinsics.checkNotNullExpressionValue(snackbarL0, "make(...)");
            snackbarL0.n0("", new View.OnClickListener() { // from class: com.zepto.m40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    o40.x1(snackbarL0, view2);
                }
            });
            View viewG = snackbarL0.G();
            Context context = this.C;
            Intrinsics.checkNotNull(context);
            viewG.setBackgroundColor(yy0.c(context, R.color.never_mix));
            snackbarL0.o0(-1);
            snackbarL0.W();
        }
    }
}
