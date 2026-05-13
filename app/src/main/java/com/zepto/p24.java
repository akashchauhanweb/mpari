package com.zepto;

import com.zepto.u24;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class p24 {
    public static /* synthetic */ u24 a(u24.l lVar, String str, String str2) {
        if (str == null || !str.startsWith("java")) {
            return lVar.a(str, str2);
        }
        try {
            return lVar.a("j$" + str.substring(4), str2);
        } catch (RuntimeException e) {
            if (e.getCause() instanceof ClassNotFoundException) {
                return lVar.a(str, str2);
            }
            throw e;
        }
    }
}
