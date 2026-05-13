package com.zepto;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public interface xz {
    public static final a c = new a(null);
    public static final xz a = new a.C0131a();
    public static final xz b = new w33(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);

    public static final class a {

        /* JADX INFO: renamed from: com.zepto.xz$a$a, reason: collision with other inner class name */
        public static final class C0131a implements xz {
            @Override // com.zepto.xz
            public kc5 a(bf5 bf5Var, ld5 response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return null;
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    kc5 a(bf5 bf5Var, ld5 ld5Var);
}
