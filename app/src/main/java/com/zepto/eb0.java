package com.zepto;

import android.os.CancellationSignal;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class eb0 {
    public final c a = new a();
    public CancellationSignal b;
    public db0 c;

    public class a implements c {
        public a() {
        }

        @Override // com.zepto.eb0.c
        public CancellationSignal a() {
            return b.b();
        }

        @Override // com.zepto.eb0.c
        public db0 b() {
            return new db0();
        }
    }

    public static class b {
        public static void a(CancellationSignal cancellationSignal) {
            cancellationSignal.cancel();
        }

        public static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    public interface c {
        CancellationSignal a();

        db0 b();
    }

    public void a() {
        CancellationSignal cancellationSignal = this.b;
        if (cancellationSignal != null) {
            try {
                b.a(cancellationSignal);
            } catch (NullPointerException e) {
                Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
            }
            this.b = null;
        }
        db0 db0Var = this.c;
        if (db0Var != null) {
            try {
                db0Var.a();
            } catch (NullPointerException e2) {
                Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e2);
            }
            this.c = null;
        }
    }

    public CancellationSignal b() {
        if (this.b == null) {
            this.b = this.a.a();
        }
        return this.b;
    }

    public db0 c() {
        if (this.c == null) {
            this.c = this.a.b();
        }
        return this.c;
    }
}
