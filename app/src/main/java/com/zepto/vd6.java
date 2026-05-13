package com.zepto;

import android.os.Bundle;
import com.zepto.yp;

/* JADX INFO: loaded from: classes.dex */
public class vd6 implements yp.d {
    public static final vd6 c = a().a();
    public final String b;

    public static class a {
        public String a;

        public /* synthetic */ a(s18 s18Var) {
        }

        public vd6 a() {
            return new vd6(this.a, null);
        }
    }

    public /* synthetic */ vd6(String str, u18 u18Var) {
        this.b = str;
    }

    public static a a() {
        return new a(null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vd6) {
            return if4.a(this.b, ((vd6) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return if4.b(this.b);
    }
}
