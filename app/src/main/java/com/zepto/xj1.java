package com.zepto;

import java.util.HashMap;
import java.util.Map;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xj1 {
    public static final Map a;

    public static class a {
    }

    public static class b {
    }

    public static class c {
    }

    public static class d {
    }

    public static class e {
    }

    public static class f {
    }

    public static class g {
    }

    public static class h {
    }

    public static class i {
    }

    public static class j {
    }

    public static class k {
    }

    public static class l {
    }

    static {
        HashMap map = new HashMap();
        a = map;
        map.put(a().b(), new d());
        map.put(b().b(), new e());
        map.put(c().b(), new f());
        map.put(d().b(), new g());
        map.put(e().b(), new h());
        map.put(j().b(), new i());
        map.put(f().b(), new j());
        map.put(g().b(), new k());
        map.put(h().b(), new l());
        map.put(i().b(), new a());
        map.put(k().b(), new b());
        map.put(l().b(), new c());
    }

    public static wj1 a() {
        return new oo3();
    }

    public static wj1 b() {
        return new fg5();
    }

    public static wj1 c() {
        return new gg5();
    }

    public static wj1 d() {
        return new hg5();
    }

    public static wj1 e() {
        return new ig5();
    }

    public static wj1 f() {
        return new jg5(224);
    }

    public static wj1 g() {
        return new jg5(256);
    }

    public static wj1 h() {
        return new jg5(384);
    }

    public static wj1 i() {
        return new jg5(ConstantsKt.MINIMUM_BLOCK_SIZE);
    }

    public static wj1 j() {
        return new kg5();
    }

    public static wj1 k() {
        return new lg5(128);
    }

    public static wj1 l() {
        return new lg5(256);
    }
}
