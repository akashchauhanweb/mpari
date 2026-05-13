package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.zepto.af3;
import com.zepto.b98;
import com.zepto.iu4;
import com.zepto.jd8;
import com.zepto.xe3;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class LifecycleCallback {
    public final af3 a;

    public LifecycleCallback(af3 af3Var) {
        this.a = af3Var;
    }

    public static af3 c(Activity activity) {
        return d(new xe3(activity));
    }

    public static af3 d(xe3 xe3Var) {
        if (xe3Var.d()) {
            return jd8.X1(xe3Var.b());
        }
        if (xe3Var.c()) {
            return b98.f(xe3Var.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static af3 getChimeraLifecycleFragmentImpl(xe3 xe3Var) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity b() {
        Activity activityD = this.a.d();
        iu4.i(activityD);
        return activityD;
    }

    public void e(int i, int i2, Intent intent) {
    }

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Bundle bundle) {
    }

    public void j() {
    }

    public void k() {
    }
}
