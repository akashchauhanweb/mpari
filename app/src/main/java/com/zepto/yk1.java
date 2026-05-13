package com.zepto;

import android.app.Application;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.data.model.DlStatusRequest;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class yk1 extends np {
    public final Application e;
    public ms3 f;
    public ms3 g;
    public ms3 h;

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

        public final void a(DlApplStatusDto dlApplStatusDto) {
            ((ms3) this.receiver).m(dlApplStatusDto);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DlApplStatusDto) obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements Function1 {
        public c(Object obj) {
            super(1, obj, ms3.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public final void a(DlApplStatusDto dlApplStatusDto) {
            ((ms3) this.receiver).m(dlApplStatusDto);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DlApplStatusDto) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public d(Function1 function) {
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
    public yk1(Application app) {
        super(app);
        Intrinsics.checkNotNullParameter(app, "app");
        this.e = app;
        this.f = new ms3();
        this.g = new ms3();
        this.h = new ms3();
    }

    public final void g(String applNo, String dob) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(dob, "dob");
        this.g.n(new qr1(this.e, applNo, dob).a(), new d(new a(this.g)));
    }

    public final void h(String applNo, String dob) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(dob, "dob");
        this.f.n(new hp1(this.e, new DlStatusRequest(applNo, st6.k(dob, "dd-MM-yyyy", "dd/MM/yyyy"))).b(), new d(new b(this.f)));
    }

    public final void i(String applNo, String dob) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(dob, "dob");
        this.h.n(new hp1(this.e, new DlStatusRequest(applNo, dob)).b(), new d(new c(this.h)));
    }

    public final ms3 j() {
        return this.g;
    }

    public final ms3 k() {
        return this.h;
    }

    public final ms3 l() {
        return this.f;
    }
}
