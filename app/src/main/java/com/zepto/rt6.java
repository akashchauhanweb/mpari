package com.zepto;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rt6 {
    public static eo a(String str) {
        if (str.equals("SHA-1")) {
            return new eo(oe4.i, x41.e);
        }
        if (str.equals("SHA-224")) {
            return new eo(l14.f);
        }
        if (str.equals("SHA-256")) {
            return new eo(l14.c);
        }
        if (str.equals("SHA-384")) {
            return new eo(l14.d);
        }
        if (str.equals("SHA-512")) {
            return new eo(l14.e);
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + str);
    }

    public static wj1 b(eo eoVar) {
        if (eoVar.z().a0(oe4.i)) {
            return xj1.b();
        }
        if (eoVar.z().a0(l14.f)) {
            return xj1.c();
        }
        if (eoVar.z().a0(l14.c)) {
            return xj1.d();
        }
        if (eoVar.z().a0(l14.d)) {
            return xj1.e();
        }
        if (eoVar.z().a0(l14.e)) {
            return xj1.j();
        }
        throw new IllegalArgumentException("unrecognised OID in digest algorithm identifier: " + eoVar.z());
    }
}
