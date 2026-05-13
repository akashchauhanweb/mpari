package com.zepto;

import com.zepto.pl2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ql2 {
    public static final a c = new a(null);
    public long a;
    public final a80 b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ql2(a80 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.b = source;
        this.a = 262144;
    }

    public final pl2 a() {
        pl2.a aVar = new pl2.a();
        while (true) {
            String strB = b();
            if (strB.length() == 0) {
                return aVar.e();
            }
            aVar.c(strB);
        }
    }

    public final String b() {
        String strW = this.b.W(this.a);
        this.a -= (long) strW.length();
        return strW;
    }
}
