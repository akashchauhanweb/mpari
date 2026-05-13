package com.zepto;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class si8 extends ci8 {
    public static final WeakReference c = new WeakReference(null);
    public WeakReference b;

    public si8(byte[] bArr) {
        super(bArr);
        this.b = c;
    }

    @Override // com.zepto.ci8
    public final byte[] j() {
        byte[] bArrP0;
        synchronized (this) {
            try {
                bArrP0 = (byte[]) this.b.get();
                if (bArrP0 == null) {
                    bArrP0 = p0();
                    this.b = new WeakReference(bArrP0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrP0;
    }

    public abstract byte[] p0();
}
