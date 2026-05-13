package com.zepto;

import androidx.lifecycle.z;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f24 extends zq7 implements w24 {
    public static final b e = new b(null);
    public static final z.b f = new a();
    public final Map d = new LinkedHashMap();

    public static final class a implements z.b {
        @Override // androidx.lifecycle.z.b
        public zq7 a(Class modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return new f24();
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f24 a(cr7 viewModelStore) {
            Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
            return (f24) new androidx.lifecycle.z(viewModelStore, f24.f, null, 4, null).a(f24.class);
        }
    }

    @Override // com.zepto.w24
    public cr7 a(String backStackEntryId) {
        Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
        cr7 cr7Var = (cr7) this.d.get(backStackEntryId);
        if (cr7Var != null) {
            return cr7Var;
        }
        cr7 cr7Var2 = new cr7();
        this.d.put(backStackEntryId, cr7Var2);
        return cr7Var2;
    }

    @Override // com.zepto.zq7
    public void e() {
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            ((cr7) it.next()).a();
        }
        this.d.clear();
    }

    public final void h(String backStackEntryId) {
        Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
        cr7 cr7Var = (cr7) this.d.remove(backStackEntryId);
        if (cr7Var != null) {
            cr7Var.a();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.d.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }
}
