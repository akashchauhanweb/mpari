package com.zepto;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class eg2 extends bg2 {
    public final Activity a;
    public final Context b;
    public final Handler c;
    public final int d;
    public final mg2 e;

    public eg2(yf2 yf2Var) {
        this(yf2Var, yf2Var, new Handler(), 0);
    }

    public Activity e() {
        return this.a;
    }

    public Context f() {
        return this.b;
    }

    public Handler g() {
        return this.c;
    }

    public abstract void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Object i();

    public abstract LayoutInflater j();

    public void k(sf2 sf2Var, Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        yy0.m(this.b, intent, bundle);
    }

    public abstract void l();

    public eg2(Activity activity, Context context, Handler handler, int i) {
        this.e = new ng2();
        this.a = activity;
        this.b = (Context) lu4.h(context, "context == null");
        this.c = (Handler) lu4.h(handler, "handler == null");
        this.d = i;
    }
}
