package com.zepto;

import com.zepto.pl2;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes3.dex */
public final class kc5 {
    public k90 a;
    public final ds2 b;
    public final String c;
    public final pl2 d;
    public final lc5 e;
    public final Map f;

    public kc5(ds2 url, String method, pl2 headers, lc5 lc5Var, Map tags) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.b = url;
        this.c = method;
        this.d = headers;
        this.e = lc5Var;
        this.f = tags;
    }

    public final lc5 a() {
        return this.e;
    }

    public final k90 b() {
        k90 k90Var = this.a;
        if (k90Var != null) {
            return k90Var;
        }
        k90 k90VarB = k90.p.b(this.d);
        this.a = k90VarB;
        return k90VarB;
    }

    public final Map c() {
        return this.f;
    }

    public final String d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.d.j(name);
    }

    public final pl2 e() {
        return this.d;
    }

    public final List f(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.d.w(name);
    }

    public final boolean g() {
        return this.b.j();
    }

    public final String h() {
        return this.c;
    }

    public final a i() {
        return new a(this);
    }

    public final Object j(Class type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return type.cast(this.f.get(type));
    }

    public final ds2 k() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.c);
        sb.append(", url=");
        sb.append(this.b);
        if (this.d.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : this.d) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                Pair pair = (Pair) obj;
                String str = (String) pair.component1();
                String str2 = (String) pair.component2();
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        if (!this.f.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.f);
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static class a {
        public ds2 a;
        public String b;
        public pl2.a c;
        public lc5 d;
        public Map e;

        public a() {
            this.e = new LinkedHashMap();
            this.b = "GET";
            this.c = new pl2.a();
        }

        public a a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.c.a(name, value);
            return this;
        }

        public kc5 b() {
            ds2 ds2Var = this.a;
            if (ds2Var != null) {
                return new kc5(ds2Var, this.b, this.c.e(), this.d, et6.Q(this.e));
            }
            throw new IllegalStateException("url == null".toString());
        }

        public a c(k90 cacheControl) {
            Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            return string.length() == 0 ? g("Cache-Control") : d("Cache-Control", string);
        }

        public a d(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.c.i(name, value);
            return this;
        }

        public a e(pl2 headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.c = headers.n();
            return this;
        }

        public a f(String method, lc5 lc5Var) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (!(method.length() > 0)) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (lc5Var == null) {
                if (!(true ^ as2.e(method))) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!as2.b(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.b = method;
            this.d = lc5Var;
            return this;
        }

        public a g(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.c.h(name);
            return this;
        }

        public a h(Class type, Object obj) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (obj == null) {
                this.e.remove(type);
            } else {
                if (this.e.isEmpty()) {
                    this.e = new LinkedHashMap();
                }
                Map map = this.e;
                Object objCast = type.cast(obj);
                Intrinsics.checkNotNull(objCast);
                map.put(type, objCast);
            }
            return this;
        }

        public a i(ds2 url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.a = url;
            return this;
        }

        public a j(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            if (StringsKt__StringsJVMKt.startsWith(url, "ws:", true)) {
                StringBuilder sb = new StringBuilder();
                sb.append("http:");
                String strSubstring = url.substring(3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring);
                url = sb.toString();
            } else if (StringsKt__StringsJVMKt.startsWith(url, "wss:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("https:");
                String strSubstring2 = url.substring(4);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring2);
                url = sb2.toString();
            }
            return i(ds2.l.d(url));
        }

        public a(kc5 request) {
            Map mutableMap;
            Intrinsics.checkNotNullParameter(request, "request");
            this.e = new LinkedHashMap();
            this.a = request.k();
            this.b = request.h();
            this.d = request.a();
            if (request.c().isEmpty()) {
                mutableMap = new LinkedHashMap();
            } else {
                mutableMap = MapsKt__MapsKt.toMutableMap(request.c());
            }
            this.e = mutableMap;
            this.c = request.e().n();
        }
    }
}
