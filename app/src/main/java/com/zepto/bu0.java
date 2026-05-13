package com.zepto;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.h;
import com.zepto.g63;

/* JADX INFO: loaded from: classes.dex */
public abstract class bu0 extends Activity implements df3, g63.a {
    public w26 a = new w26();
    public androidx.lifecycle.m b = new androidx.lifecycle.m(this);

    public static class a {
    }

    public static boolean l0(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return false;
        }
        String str = strArr[0];
        str.hashCode();
        switch (str) {
            case "--translation":
                if (Build.VERSION.SDK_INT >= 31) {
                    break;
                }
                break;
            case "--contentcapture":
                if (Build.VERSION.SDK_INT >= 29) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !g63.d(decorView, keyEvent)) {
            return g63.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !g63.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    public a i0(Class cls) {
        return (a) this.a.get(cls);
    }

    public void j0(a aVar) {
        this.a.put(aVar.getClass(), aVar);
    }

    public final boolean k0(String[] strArr) {
        return !l0(strArr);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.lifecycle.r.e(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.b.k(h.b.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.zepto.g63.a
    public boolean r(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
