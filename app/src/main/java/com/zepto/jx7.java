package com.zepto;

import com.zepto.nx0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class jx7 {
    public final List a;

    public static final class a extends Lambda implements Function1 {
        public static final a c = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(zw0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String simpleName = it.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "it.javaClass.simpleName");
            return simpleName;
        }
    }

    public static final class b implements od2 {
        public final /* synthetic */ od2[] a;

        public static final class a extends Lambda implements Function0 {
            public final /* synthetic */ od2[] c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(od2[] od2VarArr) {
                super(0);
                this.c = od2VarArr;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object[] invoke() {
                return new nx0[this.c.length];
            }
        }

        /* JADX INFO: renamed from: com.zepto.jx7$b$b, reason: collision with other inner class name */
        public static final class C0098b extends SuspendLambda implements Function3 {
            public int c;
            public /* synthetic */ Object e;
            public /* synthetic */ Object f;

            public C0098b(Continuation continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(pd2 pd2Var, Object[] objArr, Continuation continuation) {
                C0098b c0098b = new C0098b(continuation);
                c0098b.e = pd2Var;
                c0098b.f = objArr;
                return c0098b.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                nx0 nx0Var;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.c;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    pd2 pd2Var = (pd2) this.e;
                    nx0[] nx0VarArr = (nx0[]) ((Object[]) this.f);
                    int length = nx0VarArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            nx0Var = null;
                            break;
                        }
                        nx0Var = nx0VarArr[i2];
                        if (!Intrinsics.areEqual(nx0Var, nx0.a.a)) {
                            break;
                        }
                        i2++;
                    }
                    if (nx0Var == null) {
                        nx0Var = nx0.a.a;
                    }
                    this.c = 1;
                    if (pd2Var.c(nx0Var, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public b(od2[] od2VarArr) {
            this.a = od2VarArr;
        }

        @Override // com.zepto.od2
        public Object a(pd2 pd2Var, Continuation continuation) {
            od2[] od2VarArr = this.a;
            Object objA = bs0.a(pd2Var, od2VarArr, new a(od2VarArr), new C0098b(null), continuation);
            return objA == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
        }
    }

    public jx7(List controllers) {
        Intrinsics.checkNotNullParameter(controllers, "controllers");
        this.a = controllers;
    }

    public final boolean a(yy7 workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        List list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((zw0) obj).d(workSpec)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            rn3.e().a(kx7.a, "Work " + workSpec.a + " constrained by " + CollectionsKt___CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, a.c, 31, null));
        }
        return arrayList.isEmpty();
    }

    public final od2 b(yy7 spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        List list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((zw0) obj).c(spec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((zw0) it.next()).f());
        }
        return sd2.d(new b((od2[]) CollectionsKt___CollectionsKt.toList(arrayList2).toArray(new od2[0])));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jx7(ej6 trackers) {
        this(CollectionsKt__CollectionsKt.listOf((Object[]) new zw0[]{new i50(trackers.a()), new l50(trackers.b()), new o76(trackers.d()), new e44(trackers.c()), new t44(trackers.c()), new j44(trackers.c()), new i44(trackers.c())}));
        Intrinsics.checkNotNullParameter(trackers, "trackers");
    }
}
