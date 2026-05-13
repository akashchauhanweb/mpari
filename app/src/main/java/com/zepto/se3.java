package com.zepto;

import com.zepto.f63;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class se3 extends e63 {
    public final zw4 a;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[f63.c.values().length];
            b = iArr;
            try {
                iArr[f63.c.SYMMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[f63.c.ASYMMETRIC_PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[qj4.values().length];
            a = iArr2;
            try {
                iArr2[qj4.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[qj4.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[qj4.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[qj4.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public se3(zw4 zw4Var, pu5 pu5Var) throws GeneralSecurityException {
        a(zw4Var, pu5Var);
        this.a = zw4Var;
    }

    public static void a(zw4 zw4Var, pu5 pu5Var) throws GeneralSecurityException {
        int i = a.b[zw4Var.d().ordinal()];
        if (i == 1 || i == 2) {
            pu5.b(pu5Var);
        }
    }
}
