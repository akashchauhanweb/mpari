package com.zepto;

import android.text.Editable;

/* JADX INFO: loaded from: classes.dex */
public final class g12 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile Editable.Factory b;
    public static Class c;

    public g12() {
        try {
            c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, g12.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (b == null) {
            synchronized (a) {
                try {
                    if (b == null) {
                        b = new g12();
                    }
                } finally {
                }
            }
        }
        return b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? d56.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
