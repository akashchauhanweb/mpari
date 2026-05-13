package com.zepto;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public final class xu3 extends bp3 implements ah1 {
    public final Throwable e;
    public final String f;

    public xu3(Throwable th, String str) {
        this.e = th;
        this.f = str;
    }

    @Override // com.zepto.bp3
    public bp3 B0() {
        return this;
    }

    @Override // com.zepto.sz0
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public Void x0(CoroutineContext coroutineContext, Runnable runnable) {
        E0();
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Void E0() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.e
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f
            if (r1 == 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.e
            r1.<init>(r0, r2)
            throw r1
        L36:
            com.zepto.ep3.d()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.xu3.E0():java.lang.Void");
    }

    @Override // com.zepto.ah1
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public Void D(long j, ya0 ya0Var) {
        E0();
        throw new KotlinNothingValueException();
    }

    @Override // com.zepto.sz0
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        if (this.e != null) {
            str = ", cause=" + this.e;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    @Override // com.zepto.sz0
    public boolean z0(CoroutineContext coroutineContext) {
        E0();
        throw new KotlinNothingValueException();
    }
}
