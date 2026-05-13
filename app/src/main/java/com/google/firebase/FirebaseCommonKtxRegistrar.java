package com.google.firebase;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.zepto.c70;
import com.zepto.cu0;
import com.zepto.g62;
import com.zepto.hf3;
import com.zepto.hi1;
import com.zepto.iu0;
import com.zepto.ky4;
import com.zepto.lp6;
import com.zepto.sz0;
import com.zepto.ut0;
import com.zepto.v30;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "", "Lcom/zepto/ut0;", "getComponents", "<init>", "()V", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 7, 1})
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    public static final class a implements iu0 {
        public static final a a = new a();

        @Override // com.zepto.iu0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final sz0 a(cu0 cu0Var) {
            Object objF = cu0Var.f(ky4.a(v30.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objF, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return g62.a((Executor) objF);
        }
    }

    public static final class b implements iu0 {
        public static final b a = new b();

        @Override // com.zepto.iu0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final sz0 a(cu0 cu0Var) {
            Object objF = cu0Var.f(ky4.a(hf3.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objF, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return g62.a((Executor) objF);
        }
    }

    public static final class c implements iu0 {
        public static final c a = new c();

        @Override // com.zepto.iu0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final sz0 a(cu0 cu0Var) {
            Object objF = cu0Var.f(ky4.a(c70.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objF, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return g62.a((Executor) objF);
        }
    }

    public static final class d implements iu0 {
        public static final d a = new d();

        @Override // com.zepto.iu0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final sz0 a(cu0 cu0Var) {
            Object objF = cu0Var.f(ky4.a(lp6.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objF, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return g62.a((Executor) objF);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ut0> getComponents() {
        ut0 ut0VarD = ut0.c(ky4.a(v30.class, sz0.class)).b(hi1.i(ky4.a(v30.class, Executor.class))).e(a.a).d();
        Intrinsics.checkNotNullExpressionValue(ut0VarD, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        ut0 ut0VarD2 = ut0.c(ky4.a(hf3.class, sz0.class)).b(hi1.i(ky4.a(hf3.class, Executor.class))).e(b.a).d();
        Intrinsics.checkNotNullExpressionValue(ut0VarD2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        ut0 ut0VarD3 = ut0.c(ky4.a(c70.class, sz0.class)).b(hi1.i(ky4.a(c70.class, Executor.class))).e(c.a).d();
        Intrinsics.checkNotNullExpressionValue(ut0VarD3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        ut0 ut0VarD4 = ut0.c(ky4.a(lp6.class, sz0.class)).b(hi1.i(ky4.a(lp6.class, Executor.class))).e(d.a).d();
        Intrinsics.checkNotNullExpressionValue(ut0VarD4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return CollectionsKt__CollectionsKt.listOf((Object[]) new ut0[]{ut0VarD, ut0VarD2, ut0VarD3, ut0VarD4});
    }
}
