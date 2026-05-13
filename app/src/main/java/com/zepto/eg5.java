package com.zepto;

import ai.protectt.app.security.common.helper.NativeInteractor;
import android.os.Build;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class eg5 {
    public static final eg5 a = new eg5();
    public static final String b = "skip_share_pref";
    public static final String c = "location_denial_share_pref";
    public static final String d = ((Object) Build.BRAND) + " : " + ((Object) Build.MODEL);
    public static final String e = Intrinsics.stringPlus("Android", Build.VERSION.RELEASE);
    public static final String f = Build.SUPPORTED_ABIS[0];
    public static final String g;
    public static final String h;
    public static int i;
    public static int j;
    public static int k;
    public static int l;
    public static int m;
    public static final List n;

    public interface a {
        public static final C0078a a = C0078a.a;

        /* JADX INFO: renamed from: com.zepto.eg5$a$a, reason: collision with other inner class name */
        public static final class C0078a {
            public static final /* synthetic */ C0078a a = new C0078a();
        }
    }

    static {
        NativeInteractor nativeInteractor = NativeInteractor.a;
        g = nativeInteractor.m("YXBwX3Byb3RlY3R0X2p3dF90b2tlbg==");
        h = nativeInteractor.f1();
        n = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{-3, -8, -12, -100});
    }

    public final String a() {
        return f;
    }

    public final String b() {
        return d;
    }

    public final int c() {
        return k;
    }

    public final int d() {
        return i;
    }

    public final int e() {
        return j;
    }

    public final String f() {
        return g;
    }

    public final List g() {
        return n;
    }

    public final String h() {
        return c;
    }

    public final String i() {
        return e;
    }

    public final int j() {
        return m;
    }

    public final int k() {
        return l;
    }

    public final String l() {
        return b;
    }

    public final String m() {
        return h;
    }

    public final void n(int i2) {
        k = i2;
    }

    public final void o(int i2) {
        i = i2;
    }

    public final void p(int i2) {
        j = i2;
    }

    public final void q(int i2) {
        m = i2;
    }

    public final void r(int i2) {
        l = i2;
    }
}
