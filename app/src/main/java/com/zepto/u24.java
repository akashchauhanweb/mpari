package com.zepto;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class u24 {
    public static final l c = new l(null);
    public static final u24 d = new f();
    public static final u24 e = new i();
    public static final u24 f = new e();
    public static final u24 g = new h();
    public static final u24 h = new g();
    public static final u24 i = new d();
    public static final u24 j = new c();
    public static final u24 k = new b();
    public static final u24 l = new a();
    public static final u24 m = new k();
    public static final u24 n = new j();
    public final boolean a;
    public final String b = "nav_type";

    public static final class a extends u24 {
        public a() {
            super(true);
        }

        @Override // com.zepto.u24
        public String b() {
            return "boolean[]";
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean[] a(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (boolean[]) bundle.get(key);
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean[] j(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new boolean[]{((Boolean) u24.k.j(value)).booleanValue()};
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean[] g(String value, boolean[] zArr) {
            boolean[] zArrPlus;
            Intrinsics.checkNotNullParameter(value, "value");
            return (zArr == null || (zArrPlus = ArraysKt___ArraysJvmKt.plus(zArr, f(value))) == null) ? f(value) : zArrPlus;
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, boolean[] zArr) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putBooleanArray(key, zArr);
        }
    }

    public static final class b extends u24 {
        public b() {
            super(false);
        }

        @Override // com.zepto.u24
        public String b() {
            return "boolean";
        }

        @Override // com.zepto.u24
        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
            k(bundle, str, ((Boolean) obj).booleanValue());
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean a(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (Boolean) bundle.get(key);
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Boolean j(String value) {
            boolean z;
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.areEqual(value, "true")) {
                z = true;
            } else {
                if (!Intrinsics.areEqual(value, "false")) {
                    throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                }
                z = false;
            }
            return Boolean.valueOf(z);
        }

        public void k(Bundle bundle, String key, boolean z) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putBoolean(key, z);
        }
    }

    public static final class c extends u24 {
        public c() {
            super(true);
        }

        @Override // com.zepto.u24
        public String b() {
            return "float[]";
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public float[] a(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (float[]) bundle.get(key);
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public float[] j(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new float[]{((Number) u24.i.j(value)).floatValue()};
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public float[] g(String value, float[] fArr) {
            float[] fArrPlus;
            Intrinsics.checkNotNullParameter(value, "value");
            return (fArr == null || (fArrPlus = ArraysKt___ArraysJvmKt.plus(fArr, f(value))) == null) ? f(value) : fArrPlus;
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, float[] fArr) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putFloatArray(key, fArr);
        }
    }

    public static final class d extends u24 {
        public d() {
            super(false);
        }

        @Override // com.zepto.u24
        public String b() {
            return "float";
        }

        @Override // com.zepto.u24
        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
            k(bundle, str, ((Number) obj).floatValue());
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Float a(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = bundle.get(key);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Float");
            return (Float) obj;
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Float j(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return Float.valueOf(Float.parseFloat(value));
        }

        public void k(Bundle bundle, String key, float f) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putFloat(key, f);
        }
    }

    public static final class e extends u24 {
        public e() {
            super(true);
        }

        @Override // com.zepto.u24
        public String b() {
            return "integer[]";
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public int[] a(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (int[]) bundle.get(key);
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public int[] j(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new int[]{((Number) u24.d.j(value)).intValue()};
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int[] g(String value, int[] iArr) {
            int[] iArrPlus;
            Intrinsics.checkNotNullParameter(value, "value");
            return (iArr == null || (iArrPlus = ArraysKt___ArraysJvmKt.plus(iArr, f(value))) == null) ? f(value) : iArrPlus;
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, int[] iArr) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putIntArray(key, iArr);
        }
    }

    public static final class f extends u24 {
        public f() {
            super(false);
        }

        @Override // com.zepto.u24
        public String b() {
            return "integer";
        }

        @Override // com.zepto.u24
        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
            k(bundle, str, ((Number) obj).intValue());
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Integer a(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = bundle.get(key);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer j(String value) {
            int i;
            Intrinsics.checkNotNullParameter(value, "value");
            if (StringsKt__StringsJVMKt.startsWith$default(value, "0x", false, 2, null)) {
                String strSubstring = value.substring(2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                i = Integer.parseInt(strSubstring, CharsKt__CharJVMKt.checkRadix(16));
            } else {
                i = Integer.parseInt(value);
            }
            return Integer.valueOf(i);
        }

        public void k(Bundle bundle, String key, int i) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putInt(key, i);
        }
    }

    public static final class g extends u24 {
        public g() {
            super(true);
        }

        @Override // com.zepto.u24
        public String b() {
            return "long[]";
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public long[] a(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (long[]) bundle.get(key);
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public long[] j(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new long[]{((Number) u24.g.j(value)).longValue()};
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public long[] g(String value, long[] jArr) {
            long[] jArrPlus;
            Intrinsics.checkNotNullParameter(value, "value");
            return (jArr == null || (jArrPlus = ArraysKt___ArraysJvmKt.plus(jArr, f(value))) == null) ? f(value) : jArrPlus;
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, long[] jArr) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putLongArray(key, jArr);
        }
    }

    public static final class h extends u24 {
        public h() {
            super(false);
        }

        @Override // com.zepto.u24
        public String b() {
            return "long";
        }

        @Override // com.zepto.u24
        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
            k(bundle, str, ((Number) obj).longValue());
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Long a(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = bundle.get(key);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Long");
            return (Long) obj;
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Long j(String value) {
            String strSubstring;
            long j;
            Intrinsics.checkNotNullParameter(value, "value");
            if (StringsKt__StringsJVMKt.endsWith$default(value, "L", false, 2, null)) {
                strSubstring = value.substring(0, value.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                strSubstring = value;
            }
            if (StringsKt__StringsJVMKt.startsWith$default(value, "0x", false, 2, null)) {
                String strSubstring2 = strSubstring.substring(2);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                j = Long.parseLong(strSubstring2, CharsKt__CharJVMKt.checkRadix(16));
            } else {
                j = Long.parseLong(strSubstring);
            }
            return Long.valueOf(j);
        }

        public void k(Bundle bundle, String key, long j) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putLong(key, j);
        }
    }

    public static final class i extends u24 {
        public i() {
            super(false);
        }

        @Override // com.zepto.u24
        public String b() {
            return "reference";
        }

        @Override // com.zepto.u24
        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
            k(bundle, str, ((Number) obj).intValue());
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Integer a(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = bundle.get(key);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer j(String value) {
            int i;
            Intrinsics.checkNotNullParameter(value, "value");
            if (StringsKt__StringsJVMKt.startsWith$default(value, "0x", false, 2, null)) {
                String strSubstring = value.substring(2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                i = Integer.parseInt(strSubstring, CharsKt__CharJVMKt.checkRadix(16));
            } else {
                i = Integer.parseInt(value);
            }
            return Integer.valueOf(i);
        }

        public void k(Bundle bundle, String key, int i) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putInt(key, i);
        }
    }

    public static final class j extends u24 {
        public j() {
            super(true);
        }

        @Override // com.zepto.u24
        public String b() {
            return "string[]";
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public String[] a(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (String[]) bundle.get(key);
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public String[] j(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new String[]{value};
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public String[] g(String value, String[] strArr) {
            String[] strArr2;
            Intrinsics.checkNotNullParameter(value, "value");
            return (strArr == null || (strArr2 = (String[]) ArraysKt___ArraysJvmKt.plus((Object[]) strArr, (Object[]) f(value))) == null) ? f(value) : strArr2;
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, String[] strArr) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putStringArray(key, strArr);
        }
    }

    public static final class k extends u24 {
        public k() {
            super(true);
        }

        @Override // com.zepto.u24
        public String b() {
            return "string";
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public String a(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (String) bundle.get(key);
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public String j(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.areEqual(value, "null")) {
                return null;
            }
            return value;
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putString(key, str);
        }
    }

    public static final class l {
        public l() {
        }

        public /* synthetic */ l(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public u24 a(String str, String str2) {
            String strSubstring;
            u24 u24Var = u24.d;
            if (Intrinsics.areEqual(u24Var.b(), str)) {
                return u24Var;
            }
            u24 u24Var2 = u24.f;
            if (Intrinsics.areEqual(u24Var2.b(), str)) {
                return u24Var2;
            }
            u24 u24Var3 = u24.g;
            if (Intrinsics.areEqual(u24Var3.b(), str)) {
                return u24Var3;
            }
            u24 u24Var4 = u24.h;
            if (Intrinsics.areEqual(u24Var4.b(), str)) {
                return u24Var4;
            }
            u24 u24Var5 = u24.k;
            if (Intrinsics.areEqual(u24Var5.b(), str)) {
                return u24Var5;
            }
            u24 u24Var6 = u24.l;
            if (Intrinsics.areEqual(u24Var6.b(), str)) {
                return u24Var6;
            }
            u24 u24Var7 = u24.m;
            if (Intrinsics.areEqual(u24Var7.b(), str)) {
                return u24Var7;
            }
            u24 u24Var8 = u24.n;
            if (Intrinsics.areEqual(u24Var8.b(), str)) {
                return u24Var8;
            }
            u24 u24Var9 = u24.i;
            if (Intrinsics.areEqual(u24Var9.b(), str)) {
                return u24Var9;
            }
            u24 u24Var10 = u24.j;
            if (Intrinsics.areEqual(u24Var10.b(), str)) {
                return u24Var10;
            }
            u24 u24Var11 = u24.e;
            if (Intrinsics.areEqual(u24Var11.b(), str)) {
                return u24Var11;
            }
            if (str == null || str.length() == 0) {
                return u24Var7;
            }
            try {
                if (!StringsKt__StringsJVMKt.startsWith$default(str, ".", false, 2, null) || str2 == null) {
                    strSubstring = str;
                } else {
                    strSubstring = str2 + str;
                }
                if (StringsKt__StringsJVMKt.endsWith$default(str, "[]", false, 2, null)) {
                    strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Class<?> cls = Class.forName(strSubstring);
                    if (Parcelable.class.isAssignableFrom(cls)) {
                        Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                        return new n(cls);
                    }
                    if (Serializable.class.isAssignableFrom(cls)) {
                        Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        return new p(cls);
                    }
                } else {
                    Class<?> cls2 = Class.forName(strSubstring);
                    if (Parcelable.class.isAssignableFrom(cls2)) {
                        Intrinsics.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Any?>");
                        return new o(cls2);
                    }
                    if (Enum.class.isAssignableFrom(cls2)) {
                        Intrinsics.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>>");
                        return new m(cls2);
                    }
                    if (Serializable.class.isAssignableFrom(cls2)) {
                        Intrinsics.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        return new q(cls2);
                    }
                }
                throw new IllegalArgumentException(strSubstring + " is not Serializable or Parcelable.");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        public final u24 b(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                try {
                    try {
                        try {
                            u24 u24Var = u24.d;
                            u24Var.j(value);
                            Intrinsics.checkNotNull(u24Var, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                            return u24Var;
                        } catch (IllegalArgumentException unused) {
                            u24 u24Var2 = u24.i;
                            u24Var2.j(value);
                            Intrinsics.checkNotNull(u24Var2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                            return u24Var2;
                        }
                    } catch (IllegalArgumentException unused2) {
                        u24 u24Var3 = u24.m;
                        Intrinsics.checkNotNull(u24Var3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                        return u24Var3;
                    }
                } catch (IllegalArgumentException unused3) {
                    u24 u24Var4 = u24.g;
                    u24Var4.j(value);
                    Intrinsics.checkNotNull(u24Var4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                    return u24Var4;
                }
            } catch (IllegalArgumentException unused4) {
                u24 u24Var5 = u24.k;
                u24Var5.j(value);
                Intrinsics.checkNotNull(u24Var5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return u24Var5;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.zepto.u24 c(java.lang.Object r4) {
            /*
                Method dump skipped, instruction units count: 298
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zepto.u24.l.c(java.lang.Object):com.zepto.u24");
        }
    }

    public static final class m extends q {
        public final Class p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Class type) {
            super(false, type);
            Intrinsics.checkNotNullParameter(type, "type");
            if (type.isEnum()) {
                this.p = type;
                return;
            }
            throw new IllegalArgumentException((type + " is not an Enum type.").toString());
        }

        @Override // com.zepto.u24.q, com.zepto.u24
        public String b() {
            String name = this.p.getName();
            Intrinsics.checkNotNullExpressionValue(name, "type.name");
            return name;
        }

        @Override // com.zepto.u24.q
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public Enum j(String value) {
            Object obj;
            Intrinsics.checkNotNullParameter(value, "value");
            Object[] enumConstants = this.p.getEnumConstants();
            Intrinsics.checkNotNullExpressionValue(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    obj = null;
                    break;
                }
                obj = enumConstants[i];
                if (StringsKt__StringsJVMKt.equals(((Enum) obj).name(), value, true)) {
                    break;
                }
                i++;
            }
            Enum r3 = (Enum) obj;
            if (r3 != null) {
                return r3;
            }
            throw new IllegalArgumentException("Enum value " + value + " not found for type " + this.p.getName() + '.');
        }
    }

    public static final class n extends u24 {
        public final Class o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Class type) {
            super(true);
            Intrinsics.checkNotNullParameter(type, "type");
            if (!Parcelable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Parcelable.").toString());
            }
            try {
                Class<?> cls = Class.forName("[L" + type.getName() + ';');
                Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.ParcelableArrayType>>");
                this.o = cls;
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.zepto.u24
        public String b() {
            String name = this.o.getName();
            Intrinsics.checkNotNullExpressionValue(name, "arrayType.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Intrinsics.areEqual(n.class, obj.getClass())) {
                return false;
            }
            return Intrinsics.areEqual(this.o, ((n) obj).o);
        }

        public int hashCode() {
            return this.o.hashCode();
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Parcelable[] a(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (Parcelable[]) bundle.get(key);
        }

        @Override // com.zepto.u24
        public Parcelable[] j(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, Parcelable[] parcelableArr) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            this.o.cast(parcelableArr);
            bundle.putParcelableArray(key, parcelableArr);
        }
    }

    public static final class o extends u24 {
        public final Class o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Class type) {
            super(true);
            Intrinsics.checkNotNullParameter(type, "type");
            if (Parcelable.class.isAssignableFrom(type) || Serializable.class.isAssignableFrom(type)) {
                this.o = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Parcelable or Serializable.").toString());
        }

        @Override // com.zepto.u24
        public Object a(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return bundle.get(key);
        }

        @Override // com.zepto.u24
        public String b() {
            String name = this.o.getName();
            Intrinsics.checkNotNullExpressionValue(name, "type.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Intrinsics.areEqual(o.class, obj.getClass())) {
                return false;
            }
            return Intrinsics.areEqual(this.o, ((o) obj).o);
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: f */
        public Object j(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // com.zepto.u24
        public void h(Bundle bundle, String key, Object obj) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            this.o.cast(obj);
            if (obj == null || (obj instanceof Parcelable)) {
                bundle.putParcelable(key, (Parcelable) obj);
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) obj);
            }
        }

        public int hashCode() {
            return this.o.hashCode();
        }
    }

    public static final class p extends u24 {
        public final Class o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Class type) {
            super(true);
            Intrinsics.checkNotNullParameter(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            try {
                Class<?> cls = Class.forName("[L" + type.getName() + ';');
                Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.SerializableArrayType>>");
                this.o = cls;
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.zepto.u24
        public String b() {
            String name = this.o.getName();
            Intrinsics.checkNotNullExpressionValue(name, "arrayType.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Intrinsics.areEqual(p.class, obj.getClass())) {
                return false;
            }
            return Intrinsics.areEqual(this.o, ((p) obj).o);
        }

        public int hashCode() {
            return this.o.hashCode();
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Serializable[] a(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (Serializable[]) bundle.get(key);
        }

        @Override // com.zepto.u24
        public Serializable[] j(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.zepto.u24
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, Serializable[] serializableArr) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            this.o.cast(serializableArr);
            bundle.putSerializable(key, serializableArr);
        }
    }

    public u24(boolean z) {
        this.a = z;
    }

    public abstract Object a(Bundle bundle, String str);

    public abstract String b();

    public boolean c() {
        return this.a;
    }

    public final Object d(Bundle bundle, String key, String value) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Object objJ = j(value);
        h(bundle, key, objJ);
        return objJ;
    }

    public final Object e(Bundle bundle, String key, String str, Object obj) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!bundle.containsKey(key)) {
            throw new IllegalArgumentException("There is no previous value in this bundle.");
        }
        if (str == null) {
            return obj;
        }
        Object objG = g(str, obj);
        h(bundle, key, objG);
        return objG;
    }

    /* JADX INFO: renamed from: f */
    public abstract Object j(String str);

    public Object g(String value, Object obj) {
        Intrinsics.checkNotNullParameter(value, "value");
        return j(value);
    }

    public abstract void h(Bundle bundle, String str, Object obj);

    public String toString() {
        return b();
    }

    public static class q extends u24 {
        public final Class o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Class type) {
            super(true);
            Intrinsics.checkNotNullParameter(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            if (true ^ type.isEnum()) {
                this.o = type;
                return;
            }
            throw new IllegalArgumentException((type + " is an Enum. You should use EnumType instead.").toString());
        }

        @Override // com.zepto.u24
        public String b() {
            String name = this.o.getName();
            Intrinsics.checkNotNullExpressionValue(name, "type.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof q) {
                return Intrinsics.areEqual(this.o, ((q) obj).o);
            }
            return false;
        }

        public int hashCode() {
            return this.o.hashCode();
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Serializable a(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (Serializable) bundle.get(key);
        }

        @Override // com.zepto.u24
        public Serializable j(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // com.zepto.u24
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String key, Serializable value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.o.cast(value);
            bundle.putSerializable(key, value);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(boolean z, Class type) {
            super(z);
            Intrinsics.checkNotNullParameter(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                this.o = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }
    }
}
