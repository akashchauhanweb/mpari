package com.zepto;

import android.app.Application;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse;
import com.nic.mparivahan.dlservices.data.model.idp.GetIdpCovGradesResponse;
import com.nic.mparivahan.dlservices.data.model.idp.GetNationsToApplyForResponse;
import com.nic.mparivahan.dlservices.data.model.idp.IdpGenSubmit;
import com.nic.mparivahan.dlservices.data.model.idp.IdpSubmitRequest;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b91 extends np {
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

        public final void a(GetAckDetForGivenDLNumberResponse getAckDetForGivenDLNumberResponse) {
            ((ms3) this.receiver).m(getAckDetForGivenDLNumberResponse);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetAckDetForGivenDLNumberResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1 {
        public b(Object obj) {
            super(1, obj, ms3.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public final void a(GetAckDetForGivenDLNumberResponse getAckDetForGivenDLNumberResponse) {
            ((ms3) this.receiver).m(getAckDetForGivenDLNumberResponse);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetAckDetForGivenDLNumberResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements Function1 {
        public c(Object obj) {
            super(1, obj, ms3.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public final void a(GetIdpCovGradesResponse getIdpCovGradesResponse) {
            ((ms3) this.receiver).m(getIdpCovGradesResponse);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetIdpCovGradesResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class d extends FunctionReferenceImpl implements Function1 {
        public d(Object obj) {
            super(1, obj, ms3.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public final void a(GetNationsToApplyForResponse getNationsToApplyForResponse) {
            ((ms3) this.receiver).m(getNationsToApplyForResponse);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetNationsToApplyForResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public e(Function1 function) {
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
    public b91(Application app) {
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

    public final void g(IdpSubmitRequest reqObj) {
        Intrinsics.checkNotNullParameter(reqObj, "reqObj");
        try {
            this.i.n(new xi2(this.e, reqObj, null, null, null, null, 60, null).b(), new e(new a(this.i)));
        } catch (Exception unused) {
        }
    }

    public final void h(IdpGenSubmit reqObj) {
        Intrinsics.checkNotNullParameter(reqObj, "reqObj");
        try {
            this.i.n(new wi2(this.e, reqObj, null, null, null, null, 60, null).b(), new e(new b(this.i)));
        } catch (Exception unused) {
        }
    }

    public final ms3 i() {
        return this.i;
    }

    public final ms3 j() {
        return this.h;
    }

    public final ms3 k() {
        return this.f;
    }

    public final void l() {
        try {
            this.h.n(new gj2(this.e, null, null, null, null, 30, null).b(), new e(new c(this.h)));
        } catch (Exception unused) {
        }
    }

    public final void m() {
        try {
            this.f.n(new hj2(this.e, null, null, null, null, 30, null).b(), new e(new d(this.f)));
        } catch (Exception unused) {
        }
    }
}
