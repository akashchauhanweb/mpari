package com.zepto;

import android.content.Context;
import android.hardware.display.DisplayManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
public final class pp5 {
    public static final a c = new a(null);
    public static pp5 d;
    public static String e;
    public final String a = "ScreenSharingDetection";
    public DisplayManager b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final pp5 a() {
            return pp5.d;
        }

        public final String b() {
            return pp5.e;
        }

        public final void c() {
            d(new pp5());
        }

        public final void d(pp5 pp5Var) {
            pp5.d = pp5Var;
        }

        public final void e(String str) {
            pp5.e = str;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int c;
        public final /* synthetic */ Context f;
        public final /* synthetic */ if5 g;

        public static final class a extends SuspendLambda implements Function2 {
            public int c;
            public final /* synthetic */ if5 e;
            public final /* synthetic */ Ref.ObjectRef f;
            public final /* synthetic */ pp5 g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(if5 if5Var, Ref.ObjectRef objectRef, pp5 pp5Var, Continuation continuation) {
                super(2, continuation);
                this.e = if5Var;
                this.f = objectRef;
                this.g = pp5Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(yz0 yz0Var, Continuation continuation) {
                return ((a) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.e, this.f, this.g, continuation);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0164 A[Catch: Exception -> 0x00b1, TryCatch #0 {Exception -> 0x00b1, blocks: (B:5:0x000c, B:7:0x004a, B:11:0x011a, B:13:0x012c, B:15:0x013e, B:17:0x014e, B:20:0x0160, B:21:0x0164, B:23:0x0174, B:10:0x00b4), top: B:30:0x000c }] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 428
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.zepto.pp5.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: com.zepto.pp5$b$b, reason: collision with other inner class name */
        public static final class C0114b implements DisplayManager.DisplayListener {
            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayAdded(int i) {
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayChanged(int i) {
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayRemoved(int i) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, if5 if5Var, Continuation continuation) {
            super(2, continuation);
            this.f = context;
            this.g = if5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yz0 yz0Var, Continuation continuation) {
            return ((b) create(yz0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return pp5.this.new b(this.f, this.g, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:51:0x01d9  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01db  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x01e8 A[Catch: Exception -> 0x00c7, TryCatch #0 {Exception -> 0x00c7, blocks: (B:5:0x0018, B:7:0x0029, B:11:0x0056, B:13:0x005e, B:15:0x0064, B:17:0x006a, B:22:0x00cf, B:26:0x00db, B:28:0x00e1, B:29:0x00e5, B:31:0x00eb, B:33:0x00fb, B:35:0x0109, B:40:0x013d, B:42:0x019d, B:44:0x01b6, B:49:0x01d3, B:53:0x01dc, B:55:0x01e8, B:59:0x01f5, B:61:0x0207, B:70:0x0222, B:73:0x022a, B:74:0x026e, B:41:0x0173, B:75:0x0281, B:76:0x02b0, B:77:0x02c2, B:78:0x02c9, B:25:0x00d8, B:10:0x0052, B:79:0x02ca, B:80:0x02d1), top: B:86:0x0018 }] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x01f4  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0207 A[Catch: Exception -> 0x00c7, TryCatch #0 {Exception -> 0x00c7, blocks: (B:5:0x0018, B:7:0x0029, B:11:0x0056, B:13:0x005e, B:15:0x0064, B:17:0x006a, B:22:0x00cf, B:26:0x00db, B:28:0x00e1, B:29:0x00e5, B:31:0x00eb, B:33:0x00fb, B:35:0x0109, B:40:0x013d, B:42:0x019d, B:44:0x01b6, B:49:0x01d3, B:53:0x01dc, B:55:0x01e8, B:59:0x01f5, B:61:0x0207, B:70:0x0222, B:73:0x022a, B:74:0x026e, B:41:0x0173, B:75:0x0281, B:76:0x02b0, B:77:0x02c2, B:78:0x02c9, B:25:0x00d8, B:10:0x0052, B:79:0x02ca, B:80:0x02d1), top: B:86:0x0018 }] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0219  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x021c A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0228 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r5v20, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r5v30, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v11, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 750
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zepto.pp5.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void e(Context context, if5 rule) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rule, "rule");
        f80.d(qj2.c, null, null, new b(context, rule, null), 3, null);
    }

    public final DisplayManager f() {
        return this.b;
    }

    public final String g() {
        return this.a;
    }

    public final void h(DisplayManager displayManager) {
        this.b = displayManager;
    }
}
