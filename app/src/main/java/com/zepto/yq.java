package com.zepto;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.Toolbar;
import com.zepto.ls;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class yq {
    public static ls.a a = new ls.a(new ls.b());
    public static int b = -100;
    public static lm3 c = null;
    public static lm3 d = null;
    public static Boolean e = null;
    public static boolean f = false;
    public static final qx g = new qx();
    public static final Object h = new Object();
    public static final Object i = new Object();

    public static class a {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    public static class b {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    public static void F(yq yqVar) {
        synchronized (h) {
            G(yqVar);
        }
    }

    public static void G(yq yqVar) {
        synchronized (h) {
            try {
                Iterator it = g.iterator();
                while (it.hasNext()) {
                    yq yqVar2 = (yq) ((WeakReference) it.next()).get();
                    if (yqVar2 == yqVar || yqVar2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void I(boolean z) {
        pm7.c(z);
    }

    public static void Q(final Context context) {
        if (v(context)) {
            if (c80.c()) {
                if (f) {
                    return;
                }
                a.execute(new Runnable() { // from class: com.zepto.xq
                    @Override // java.lang.Runnable
                    public final void run() {
                        yq.w(context);
                    }
                });
                return;
            }
            synchronized (i) {
                try {
                    lm3 lm3Var = c;
                    if (lm3Var == null) {
                        if (d == null) {
                            d = lm3.b(ls.b(context));
                        }
                        if (d.e()) {
                        } else {
                            c = d;
                        }
                    } else if (!lm3Var.equals(d)) {
                        lm3 lm3Var2 = c;
                        d = lm3Var2;
                        ls.a(context, lm3Var2.g());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void d(yq yqVar) {
        synchronized (h) {
            G(yqVar);
            g.add(new WeakReference(yqVar));
        }
    }

    public static yq h(Activity activity, sq sqVar) {
        return new zq(activity, sqVar);
    }

    public static yq i(Dialog dialog, sq sqVar) {
        return new zq(dialog, sqVar);
    }

    public static lm3 k() {
        if (c80.c()) {
            Object objP = p();
            if (objP != null) {
                return lm3.h(b.a(objP));
            }
        } else {
            lm3 lm3Var = c;
            if (lm3Var != null) {
                return lm3Var;
            }
        }
        return lm3.d();
    }

    public static int m() {
        return b;
    }

    public static Object p() {
        Context contextL;
        Iterator it = g.iterator();
        while (it.hasNext()) {
            yq yqVar = (yq) ((WeakReference) it.next()).get();
            if (yqVar != null && (contextL = yqVar.l()) != null) {
                return contextL.getSystemService("locale");
            }
        }
        return null;
    }

    public static lm3 r() {
        return c;
    }

    public static boolean v(Context context) {
        if (e == null) {
            try {
                Bundle bundle = js.a(context).metaData;
                if (bundle != null) {
                    e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                e = Boolean.FALSE;
            }
        }
        return e.booleanValue();
    }

    public static /* synthetic */ void w(Context context) {
        ls.c(context);
        f = true;
    }

    public abstract void A(Bundle bundle);

    public abstract void B();

    public abstract void C(Bundle bundle);

    public abstract void D();

    public abstract void E();

    public abstract boolean H(int i2);

    public abstract void J(int i2);

    public abstract void K(View view);

    public abstract void L(View view, ViewGroup.LayoutParams layoutParams);

    public void M(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void N(Toolbar toolbar);

    public abstract void O(int i2);

    public abstract void P(CharSequence charSequence);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    public void f(Context context) {
    }

    public Context g(Context context) {
        f(context);
        return context;
    }

    public abstract View j(int i2);

    public abstract Context l();

    public abstract v5 n();

    public abstract int o();

    public abstract MenuInflater q();

    public abstract t5 s();

    public abstract void t();

    public abstract void u();

    public abstract void x(Configuration configuration);

    public abstract void y(Bundle bundle);

    public abstract void z();
}
