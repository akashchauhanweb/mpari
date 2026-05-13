package com.zepto;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class fu0 extends Dialog implements df3, gg4, em5 {
    public androidx.lifecycle.m a;
    public final dm5 b;
    public final eg4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu0(Context context, int i) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.b = dm5.d.a(this);
        this.c = new eg4(new Runnable() { // from class: com.zepto.eu0
            @Override // java.lang.Runnable
            public final void run() {
                fu0.d(this.c);
            }
        });
    }

    public static final void d(fu0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public final androidx.lifecycle.m b() {
        androidx.lifecycle.m mVar = this.a;
        if (mVar != null) {
            return mVar;
        }
        androidx.lifecycle.m mVar2 = new androidx.lifecycle.m(this);
        this.a = mVar2;
        return mVar2;
    }

    public void c() {
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window!!.decorView");
        ur7.a(decorView, this);
        Window window2 = getWindow();
        Intrinsics.checkNotNull(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window!!.decorView");
        vr7.a(decorView2, this);
        Window window3 = getWindow();
        Intrinsics.checkNotNull(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window!!.decorView");
        wr7.a(decorView3, this);
    }

    @Override // com.zepto.df3
    public androidx.lifecycle.h g0() {
        return b();
    }

    @Override // com.zepto.gg4
    public final eg4 m() {
        return this.c;
    }

    @Override // com.zepto.em5
    public cm5 o() {
        return this.b.b();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.c.k();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            eg4 eg4Var = this.c;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            eg4Var.n(onBackInvokedDispatcher);
        }
        this.b.d(bundle);
        b().i(h.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.b.e(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        b().i(h.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        b().i(h.a.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        c();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
