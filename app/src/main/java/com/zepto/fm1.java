package com.zepto;

import android.app.Application;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.data.model.DlStatusRequest;
import com.nic.mparivahan.dlservices.data.model.UploadDocFlowResponse;
import com.nic.mparivahan.dlservices.data.model.temp.InsertedUploadDocResponse;
import com.nic.mparivahan.dlservices.data.model.temp.UploadDocListResponse;
import com.nic.mparivahan.dlservices.data.model.temp.UploadedDocResponse;
import com.nic.mparivahan.dlservices.ui.acknow.DlApplStatusResponse;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class fm1 extends np {
    public final Application e;
    public ms3 f;
    public ms3 g;
    public ms3 h;
    public ms3 i;
    public ms3 j;
    public ms3 k;
    public ms3 l;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {
        public a(Object obj) {
            super(1, obj, ms3.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public final void a(DlApplStatusResponse dlApplStatusResponse) {
            ((ms3) this.receiver).m(dlApplStatusResponse);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DlApplStatusResponse) obj);
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

        public final void a(UploadDocListResponse uploadDocListResponse) {
            ((ms3) this.receiver).m(uploadDocListResponse);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((UploadDocListResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class d extends FunctionReferenceImpl implements Function1 {
        public d(Object obj) {
            super(1, obj, ms3.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public final void a(UploadDocListResponse uploadDocListResponse) {
            ((ms3) this.receiver).m(uploadDocListResponse);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((UploadDocListResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class e extends FunctionReferenceImpl implements Function1 {
        public e(Object obj) {
            super(1, obj, ms3.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public final void a(InsertedUploadDocResponse insertedUploadDocResponse) {
            ((ms3) this.receiver).m(insertedUploadDocResponse);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InsertedUploadDocResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public f(Function1 function) {
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

    public /* synthetic */ class g extends FunctionReferenceImpl implements Function1 {
        public g(Object obj) {
            super(1, obj, ms3.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public final void a(UploadDocFlowResponse uploadDocFlowResponse) {
            ((ms3) this.receiver).m(uploadDocFlowResponse);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((UploadDocFlowResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class h extends FunctionReferenceImpl implements Function1 {
        public h(Object obj) {
            super(1, obj, ms3.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public final void a(UploadedDocResponse uploadedDocResponse) {
            ((ms3) this.receiver).m(uploadedDocResponse);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((UploadedDocResponse) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm1(Application app) {
        super(app);
        Intrinsics.checkNotNullParameter(app, "app");
        this.e = app;
        this.f = new ms3();
        this.g = new ms3();
        this.h = new ms3();
        this.i = new ms3();
        this.j = new ms3();
        this.k = new ms3();
        this.l = new ms3();
    }

    public final void g(String applNo, String dob) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(dob, "dob");
        try {
            this.f.n(new xk1(this.e, applNo, dob).b(), new f(new a(this.f)));
        } catch (Exception unused) {
        }
    }

    public final void h(String applNo, String dob) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(dob, "dob");
        try {
            this.g.n(new hp1(this.e, new DlStatusRequest(applNo, st6.k(dob, "dd-MM-yyyy", "dd/MM/yyyy"))).b(), new f(new b(this.g)));
        } catch (Exception unused) {
        }
    }

    public final void i(String applicationNumber, String stateCd, String serviceCode) {
        Intrinsics.checkNotNullParameter(applicationNumber, "applicationNumber");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(serviceCode, "serviceCode");
        try {
            this.i.n(new ro1(this.e, applicationNumber, stateCd, serviceCode).c(), new f(new c(this.i)));
        } catch (Exception unused) {
        }
    }

    public final ms3 j() {
        return this.i;
    }

    public final ms3 k() {
        return this.h;
    }

    public final ms3 l() {
        return this.j;
    }

    public final void m(String applicationNumber, String stateCd, String serviceCode, String apdApplicant) {
        Intrinsics.checkNotNullParameter(applicationNumber, "applicationNumber");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(serviceCode, "serviceCode");
        Intrinsics.checkNotNullParameter(apdApplicant, "apdApplicant");
        try {
            this.h.n(new so1(this.e, applicationNumber, stateCd, serviceCode, apdApplicant).d(), new f(new d(this.h)));
        } catch (Exception unused) {
        }
    }

    public final ms3 n() {
        return this.f;
    }

    public final ms3 o() {
        return this.g;
    }

    public final void p(String applicationNumber, String stateCd) {
        Intrinsics.checkNotNullParameter(applicationNumber, "applicationNumber");
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        try {
            this.j.n(new to1(this.e, applicationNumber, stateCd).b(), new f(new e(this.j)));
        } catch (Exception unused) {
        }
    }

    public final ms3 q() {
        return this.k;
    }

    public final void r(String applNo, String transCode, String stateCode, String rtoCode) {
        Intrinsics.checkNotNullParameter(applNo, "applNo");
        Intrinsics.checkNotNullParameter(transCode, "transCode");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        Intrinsics.checkNotNullParameter(rtoCode, "rtoCode");
        try {
            this.l.n(new ip1(this.e, applNo, transCode, stateCode, rtoCode, 0, null, 96, null).b(), new f(new g(this.l)));
        } catch (Exception unused) {
        }
    }

    public final void s(String rtoCode, List docs) {
        Intrinsics.checkNotNullParameter(rtoCode, "rtoCode");
        Intrinsics.checkNotNullParameter(docs, "docs");
        try {
            this.k.n(new uo1(this.e, rtoCode, docs).a(), new f(new h(this.k)));
        } catch (Exception unused) {
        }
    }
}
