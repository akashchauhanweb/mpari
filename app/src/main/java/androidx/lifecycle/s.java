package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import com.zepto.cm5;
import com.zepto.j80;
import com.zepto.oy3;
import com.zepto.ty3;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    public static final a f = new a(null);
    public static final Class[] g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    public final Map a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final cm5.c e;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new s();
                }
                HashMap map = new HashMap();
                for (String key : bundle2.keySet()) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    map.put(key, bundle2.get(key));
                }
                return new s(map);
            }
            ClassLoader classLoader = s.class.getClassLoader();
            Intrinsics.checkNotNull(classLoader);
            bundle.setClassLoader(classLoader);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = parcelableArrayList.get(i);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
            }
            return new s(linkedHashMap);
        }

        public final boolean b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : s.g) {
                Intrinsics.checkNotNull(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    public s(Map initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = linkedHashMap;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new cm5.c() { // from class: com.zepto.yl5
            @Override // com.zepto.cm5.c
            public final Bundle a() {
                return androidx.lifecycle.s.d(this.a);
            }
        };
        linkedHashMap.putAll(initialState);
    }

    public static final Bundle d(s this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        for (Map.Entry entry : MapsKt__MapsKt.toMap(this$0.b).entrySet()) {
            this$0.e((String) entry.getKey(), ((cm5.c) entry.getValue()).a());
        }
        Set<String> setKeySet = this$0.a.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(this$0.a.get(str));
        }
        return j80.a(TuplesKt.to("keys", arrayList), TuplesKt.to("values", arrayList2));
    }

    public final cm5.c c() {
        return this.e;
    }

    public final void e(String key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!f.b(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            Intrinsics.checkNotNull(obj);
            sb.append(obj.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        Object obj2 = this.c.get(key);
        oy3 oy3Var = obj2 instanceof oy3 ? (oy3) obj2 : null;
        if (oy3Var != null) {
            oy3Var.m(obj);
        } else {
            this.a.put(key, obj);
        }
        ty3 ty3Var = (ty3) this.d.get(key);
        if (ty3Var == null) {
            return;
        }
        ty3Var.setValue(obj);
    }

    public s() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new cm5.c() { // from class: com.zepto.yl5
            @Override // com.zepto.cm5.c
            public final Bundle a() {
                return androidx.lifecycle.s.d(this.a);
            }
        };
    }
}
