package com.zepto;

import android.os.Bundle;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x14 {
    public final int a;
    public r24 b;
    public Bundle c;

    public x14(int i, r24 r24Var, Bundle bundle) {
        this.a = i;
        this.b = r24Var;
        this.c = bundle;
    }

    public final Bundle a() {
        return this.c;
    }

    public final int b() {
        return this.a;
    }

    public final r24 c() {
        return this.b;
    }

    public final void d(Bundle bundle) {
        this.c = bundle;
    }

    public final void e(r24 r24Var) {
        this.b = r24Var;
    }

    public boolean equals(Object obj) {
        Set<String> setKeySet;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof x14)) {
            return false;
        }
        x14 x14Var = (x14) obj;
        if (this.a == x14Var.a && Intrinsics.areEqual(this.b, x14Var.b)) {
            if (Intrinsics.areEqual(this.c, x14Var.c)) {
                return true;
            }
            Bundle bundle = this.c;
            if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                if (setKeySet.isEmpty()) {
                    return true;
                }
                for (String str : setKeySet) {
                    Bundle bundle2 = this.c;
                    Object obj2 = bundle2 != null ? bundle2.get(str) : null;
                    Bundle bundle3 = x14Var.c;
                    if (!Intrinsics.areEqual(obj2, bundle3 != null ? bundle3.get(str) : null)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Set<String> setKeySet;
        int iHashCode = Integer.hashCode(this.a) * 31;
        r24 r24Var = this.b;
        int iHashCode2 = iHashCode + (r24Var != null ? r24Var.hashCode() : 0);
        Bundle bundle = this.c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            for (String str : setKeySet) {
                int i = iHashCode2 * 31;
                Bundle bundle2 = this.c;
                Object obj = bundle2 != null ? bundle2.get(str) : null;
                iHashCode2 = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return iHashCode2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(x14.class.getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.a));
        sb.append(")");
        if (this.b != null) {
            sb.append(" navOptions=");
            sb.append(this.b);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    public /* synthetic */ x14(int i, r24 r24Var, Bundle bundle, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : r24Var, (i2 & 4) != 0 ? null : bundle);
    }
}
