package com.zepto;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class si0 {
    public static final b b = new b(null);
    public static final c c = new c();
    public final Object a;

    public static final class a extends c {
        public final Throwable a;

        public a(Throwable th) {
            this.a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && Intrinsics.areEqual(this.a, ((a) obj).a);
        }

        public int hashCode() {
            Throwable th = this.a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // com.zepto.si0.c
        public String toString() {
            return "Closed(" + this.a + ')';
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Object a(Throwable th) {
            return si0.c(new a(th));
        }

        public final Object b() {
            return si0.c(si0.c);
        }

        public final Object c(Object obj) {
            return si0.c(obj);
        }
    }

    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    public /* synthetic */ si0(Object obj) {
        this.a = obj;
    }

    public static final /* synthetic */ si0 b(Object obj) {
        return new si0(obj);
    }

    public static Object c(Object obj) {
        return obj;
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof si0) && Intrinsics.areEqual(obj, ((si0) obj2).k());
    }

    public static final Throwable e(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.a;
        }
        return null;
    }

    public static final Object f(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj instanceof a;
    }

    public static final boolean i(Object obj) {
        return !(obj instanceof c);
    }

    public static String j(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.a, obj);
    }

    public int hashCode() {
        return g(this.a);
    }

    public final /* synthetic */ Object k() {
        return this.a;
    }

    public String toString() {
        return j(this.a);
    }
}
