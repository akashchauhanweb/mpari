package com.zepto;

import android.app.Application;
import com.nic.mparivahan.dlservices.data.model.DistResponse;
import com.nic.mparivahan.dlservices.data.model.DlRenewalSaveDto;
import com.nic.mparivahan.dlservices.data.model.StateResponse;
import com.nic.mparivahan.dlservices.data.model.TalukaResponse;
import com.nic.mparivahan.dlservices.data.model.VillageOrTownResponse;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class xh0 extends np {
    public final Application e;
    public ms3 f;
    public ms3 g;
    public ms3 h;
    public ms3 i;
    public ms3 j;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {
        public a(Object obj) {
            super(1, obj, ms3.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public final void a(DistResponse distResponse) {
            ((ms3) this.receiver).m(distResponse);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DistResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1 {
        public b(Object obj) {
            super(1, obj, ms3.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public final void a(StateResponse stateResponse) {
            ((ms3) this.receiver).m(stateResponse);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((StateResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements Function1 {
        public c(Object obj) {
            super(1, obj, ms3.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public final void a(TalukaResponse talukaResponse) {
            ((ms3) this.receiver).m(talukaResponse);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((TalukaResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class d extends FunctionReferenceImpl implements Function1 {
        public d(Object obj) {
            super(1, obj, ms3.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public final void a(VillageOrTownResponse villageOrTownResponse) {
            ((ms3) this.receiver).m(villageOrTownResponse);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((VillageOrTownResponse) obj);
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

    public /* synthetic */ class f extends FunctionReferenceImpl implements Function1 {
        public f(Object obj) {
            super(1, obj, ms3.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
        }

        public final void a(DlRenewalSaveDto dlRenewalSaveDto) {
            ((ms3) this.receiver).m(dlRenewalSaveDto);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DlRenewalSaveDto) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh0(Application app) {
        super(app);
        Intrinsics.checkNotNullParameter(app, "app");
        this.e = app;
        this.f = new ms3();
        this.g = new ms3();
        this.h = new ms3();
        this.i = new ms3();
        this.j = new ms3();
    }

    public final void g(String stateCd) {
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        try {
            this.g.n(new dl1(this.e, stateCd, null, null, null, null, 60, null).b(), new e(new a(this.g)));
        } catch (Exception unused) {
        }
    }

    public final ms3 h() {
        return this.g;
    }

    public final ms3 i() {
        return this.f;
    }

    public final ms3 j() {
        return this.j;
    }

    public final ms3 k() {
        return this.h;
    }

    public final ms3 l() {
        return this.i;
    }

    public final void m() {
        try {
            this.f.n(new es1(this.e, null, null, null, null, 30, null).b(), new e(new b(this.f)));
        } catch (Exception unused) {
        }
    }

    public final void n(String stateCd, String distCd) {
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(distCd, "distCd");
        try {
            this.h.n(new fs1(this.e, stateCd, distCd, null, null, null, null, 120, null).b(), new e(new c(this.h)));
        } catch (Exception unused) {
        }
    }

    public final void o(String stateCd, String distCd, String subDistCd, String villageOrTown) {
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(distCd, "distCd");
        Intrinsics.checkNotNullParameter(subDistCd, "subDistCd");
        Intrinsics.checkNotNullParameter(villageOrTown, "villageOrTown");
        try {
            this.i.n(new ks1(this.e, stateCd, distCd, subDistCd, villageOrTown, null, null, null, null, 480, null).b(), new e(new d(this.i)));
        } catch (Exception unused) {
        }
    }

    public final void p(String dlno, String dob, String rtoCodeDLTr, String applcatgDLserReq, String changeOfAddReq, String perHouseNo, String perStreet, String perLocation, String permVillageOrTown, String perSubDistrict, String perDistrict, String perState, String perPinCode, String presHouseNo, String presStreet, String presLocation, String presVillageOrTown, String presSubDistrict, String presDistrict, String presState, String presPincode, String agentId, String agentIpAddress, String agentPwd, String agentServiceName, String mobileNumber, String eKYCId, String eKYCOpted, String eKYCGender, String eKYCPhoto) {
        Intrinsics.checkNotNullParameter(dlno, "dlno");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(rtoCodeDLTr, "rtoCodeDLTr");
        Intrinsics.checkNotNullParameter(applcatgDLserReq, "applcatgDLserReq");
        Intrinsics.checkNotNullParameter(changeOfAddReq, "changeOfAddReq");
        Intrinsics.checkNotNullParameter(perHouseNo, "perHouseNo");
        Intrinsics.checkNotNullParameter(perStreet, "perStreet");
        Intrinsics.checkNotNullParameter(perLocation, "perLocation");
        Intrinsics.checkNotNullParameter(permVillageOrTown, "permVillageOrTown");
        Intrinsics.checkNotNullParameter(perSubDistrict, "perSubDistrict");
        Intrinsics.checkNotNullParameter(perDistrict, "perDistrict");
        Intrinsics.checkNotNullParameter(perState, "perState");
        Intrinsics.checkNotNullParameter(perPinCode, "perPinCode");
        Intrinsics.checkNotNullParameter(presHouseNo, "presHouseNo");
        Intrinsics.checkNotNullParameter(presStreet, "presStreet");
        Intrinsics.checkNotNullParameter(presLocation, "presLocation");
        Intrinsics.checkNotNullParameter(presVillageOrTown, "presVillageOrTown");
        Intrinsics.checkNotNullParameter(presSubDistrict, "presSubDistrict");
        Intrinsics.checkNotNullParameter(presDistrict, "presDistrict");
        Intrinsics.checkNotNullParameter(presState, "presState");
        Intrinsics.checkNotNullParameter(presPincode, "presPincode");
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(agentIpAddress, "agentIpAddress");
        Intrinsics.checkNotNullParameter(agentPwd, "agentPwd");
        Intrinsics.checkNotNullParameter(agentServiceName, "agentServiceName");
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        Intrinsics.checkNotNullParameter(eKYCId, "eKYCId");
        Intrinsics.checkNotNullParameter(eKYCOpted, "eKYCOpted");
        Intrinsics.checkNotNullParameter(eKYCGender, "eKYCGender");
        Intrinsics.checkNotNullParameter(eKYCPhoto, "eKYCPhoto");
        try {
            this.j.n(new cl1(this.e, dlno, dob, rtoCodeDLTr, applcatgDLserReq, changeOfAddReq, perHouseNo, perStreet, perLocation, permVillageOrTown, perSubDistrict, perDistrict, perState, perPinCode, presHouseNo, presStreet, presLocation, presVillageOrTown, presSubDistrict, presDistrict, presState, presPincode, agentId, agentIpAddress, agentPwd, agentServiceName, mobileNumber, eKYCId, eKYCOpted, eKYCGender, eKYCPhoto).a(), new e(new f(this.j)));
        } catch (Exception unused) {
        }
    }
}
