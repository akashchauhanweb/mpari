package com.zepto;

import android.app.Application;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ds1 extends np {
    public final Application e;
    public ms3 f;
    public ms3 g;
    public ms3 h;
    public ms3 i;
    public ms3 j;
    public ms3 k;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {
        public a(Object obj) {
            super(1, obj, ms3.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public final void a(JSONObject jSONObject) {
            ((ms3) this.receiver).m(jSONObject);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((JSONObject) obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1 {
        public b(Object obj) {
            super(1, obj, ms3.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public final void a(JSONObject jSONObject) {
            ((ms3) this.receiver).m(jSONObject);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((JSONObject) obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements Function1 {
        public c(Object obj) {
            super(1, obj, ms3.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public final void a(JSONObject jSONObject) {
            ((ms3) this.receiver).m(jSONObject);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((JSONObject) obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class d extends FunctionReferenceImpl implements Function1 {
        public d(Object obj) {
            super(1, obj, ms3.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public final void a(JSONObject jSONObject) {
            ((ms3) this.receiver).m(jSONObject);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((JSONObject) obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class e extends FunctionReferenceImpl implements Function1 {
        public e(Object obj) {
            super(1, obj, ms3.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public final void a(JSONObject jSONObject) {
            ((ms3) this.receiver).m(jSONObject);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((JSONObject) obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class f extends FunctionReferenceImpl implements Function1 {
        public f(Object obj) {
            super(1, obj, ms3.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public final void a(JSONObject jSONObject) {
            ((ms3) this.receiver).m(jSONObject);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((JSONObject) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class g implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public g(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.a = function;
        }

        @Override // com.zepto.mf4
        public final /* synthetic */ void a(Object obj) {
            this.a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof mf4) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds1(Application app) {
        super(app);
        Intrinsics.checkNotNullParameter(app, "app");
        this.e = app;
        this.f = new ms3();
        this.g = new ms3();
        this.h = new ms3();
        this.i = new ms3();
        this.j = new ms3();
        this.k = new ms3();
    }

    public final void g(String applicationNumber, String dob) {
        Intrinsics.checkNotNullParameter(applicationNumber, "applicationNumber");
        Intrinsics.checkNotNullParameter(dob, "dob");
        this.f.n(new wr1(this.e, applicationNumber, dob).b(), new g(new a(this.f)));
    }

    public final ms3 h() {
        return this.f;
    }

    public final ms3 i() {
        return this.i;
    }

    public final ms3 j() {
        return this.j;
    }

    public final ms3 k() {
        return this.g;
    }

    public final ms3 l() {
        return this.k;
    }

    public final ms3 m() {
        return this.h;
    }

    public final void n(String applicationNumber, String dob) {
        Intrinsics.checkNotNullParameter(applicationNumber, "applicationNumber");
        Intrinsics.checkNotNullParameter(dob, "dob");
        this.i.n(new sl3(this.e, applicationNumber, dob).a(), new g(new b(this.i)));
    }

    public final void o(String rtocd, String campid, String campcd) {
        Intrinsics.checkNotNullParameter(rtocd, "rtocd");
        Intrinsics.checkNotNullParameter(campid, "campid");
        Intrinsics.checkNotNullParameter(campcd, "campcd");
        this.j.n(new tl3(this.e, rtocd, campid, campcd).a(), new g(new c(this.j)));
    }

    public final void p(String rtocd, String campid, String campcd) {
        Intrinsics.checkNotNullParameter(rtocd, "rtocd");
        Intrinsics.checkNotNullParameter(campid, "campid");
        Intrinsics.checkNotNullParameter(campcd, "campcd");
        this.g.n(new xr1(this.e, rtocd, campid, campcd).b(), new g(new d(this.g)));
    }

    public final void q(String rtocd, String applNo, String slotDate, String slotNo, String campid, String campcd) {
        Intrinsics.checkNotNullParameter(rtocd, "rtocd");
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(slotDate, "slotDate");
        Intrinsics.checkNotNullParameter(slotNo, "slotNo");
        Intrinsics.checkNotNullParameter(campid, "campid");
        Intrinsics.checkNotNullParameter(campcd, "campcd");
        this.k.n(new hi3(this.e, rtocd, applNo, slotDate, slotNo, campid, campcd).a(), new g(new e(this.k)));
    }

    public final void r(String rtocd, String applNo, String slotDate, String slotNo, String campid, String campcd) {
        Intrinsics.checkNotNullParameter(rtocd, "rtocd");
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(slotDate, "slotDate");
        Intrinsics.checkNotNullParameter(slotNo, "slotNo");
        Intrinsics.checkNotNullParameter(campid, "campid");
        Intrinsics.checkNotNullParameter(campcd, "campcd");
        this.h.n(new um1(this.e, rtocd, applNo, slotDate, slotNo, campid, campcd).b(), new g(new f(this.h)));
    }
}
