package com.zepto;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.zepto.g63;
import com.zepto.z5;

/* JADX INFO: loaded from: classes.dex */
public abstract class hr extends fu0 implements sq {
    public yq d;
    public final g63.a e;

    public hr(Context context, int i) {
        super(context, f(context, i));
        this.e = new g63.a() { // from class: com.zepto.gr
            @Override // com.zepto.g63.a
            public final boolean r(KeyEvent keyEvent) {
                return this.a.g(keyEvent);
            }
        };
        yq yqVarE = e();
        yqVarE.O(f(context, i));
        yqVarE.y(null);
    }

    private static int f(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(zy4.y, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // com.zepto.sq
    public void X(z5 z5Var) {
    }

    @Override // com.zepto.fu0, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e().e(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        e().z();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return g63.e(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    public yq e() {
        if (this.d == null) {
            this.d = yq.i(this, this);
        }
        return this.d;
    }

    @Override // android.app.Dialog
    public View findViewById(int i) {
        return e().j(i);
    }

    public boolean g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean h(int i) {
        return e().H(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        e().u();
    }

    @Override // com.zepto.sq
    public void n(z5 z5Var) {
    }

    @Override // com.zepto.fu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        e().t();
        super.onCreate(bundle);
        e().y(bundle);
    }

    @Override // com.zepto.fu0, android.app.Dialog
    public void onStop() {
        super.onStop();
        e().E();
    }

    @Override // com.zepto.sq
    public z5 s(z5.a aVar) {
        return null;
    }

    @Override // com.zepto.fu0, android.app.Dialog
    public void setContentView(int i) {
        e().J(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().P(charSequence);
    }

    @Override // com.zepto.fu0, android.app.Dialog
    public void setContentView(View view) {
        e().K(view);
    }

    @Override // com.zepto.fu0, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e().L(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        e().P(getContext().getString(i));
    }
}
