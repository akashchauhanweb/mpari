package com.zepto;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ig6 extends ContextWrapper {
    public static final Object c = new Object();
    public static ArrayList d;
    public final Resources a;
    public final Resources.Theme b;

    public ig6(Context context) {
        super(context);
        if (!pm7.d()) {
            this.a = new kg6(this, context.getResources());
            this.b = null;
            return;
        }
        pm7 pm7Var = new pm7(this, context.getResources());
        this.a = pm7Var;
        Resources.Theme themeNewTheme = pm7Var.newTheme();
        this.b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    public static boolean a(Context context) {
        if ((context instanceof ig6) || (context.getResources() instanceof kg6) || (context.getResources() instanceof pm7)) {
            return false;
        }
        return pm7.d();
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (c) {
            try {
                ArrayList arrayList = d;
                if (arrayList == null) {
                    d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            d.remove(size);
                        }
                    }
                    for (int size2 = d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) d.get(size2);
                        ig6 ig6Var = weakReference2 != null ? (ig6) weakReference2.get() : null;
                        if (ig6Var != null && ig6Var.getBaseContext() == context) {
                            return ig6Var;
                        }
                    }
                }
                ig6 ig6Var2 = new ig6(context);
                d.add(new WeakReference(ig6Var2));
                return ig6Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
