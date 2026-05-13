package com.zepto;

import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public class mb3 implements Enumeration {
    public j0 a;
    public Object b = a();

    public mb3(byte[] bArr) {
        this.a = new j0(bArr, true);
    }

    public final Object a() {
        try {
            return this.a.P();
        } catch (IOException e) {
            throw new t0("malformed ASN.1: " + e, e);
        }
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.b != null;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        Object obj = this.b;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        this.b = a();
        return obj;
    }
}
