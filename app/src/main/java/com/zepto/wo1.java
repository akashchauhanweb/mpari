package com.zepto;

import android.app.Application;
import com.nic.mparivahan.dlservices.data.model.DlRenewalSaveDto;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse;
import com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalValidation;
import com.nic.mparivahan.dlservices.ui.renewalofdl.Revalidation.RenewalCoaValidation;
import com.nic.mparivahan.dlservices.ui.renewalofdl.Revalidation.RenewalGenY;
import java.util.Map;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class wo1 extends np {
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

        public final void a(GetAckDetForGivenDLNumberResponse getAckDetForGivenDLNumberResponse) {
            ((ms3) this.receiver).m(getAckDetForGivenDLNumberResponse);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetAckDetForGivenDLNumberResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class d extends FunctionReferenceImpl implements Function1 {
        public d(Object obj) {
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

    public /* synthetic */ class e extends FunctionReferenceImpl implements Function1 {
        public e(Object obj) {
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
    public wo1(Application app) {
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

    public final ms3 g() {
        return this.f;
    }

    public final ms3 h() {
        return this.g;
    }

    public final ms3 i() {
        return this.h;
    }

    public final ms3 j() {
        return this.i;
    }

    public final ms3 k() {
        return this.j;
    }

    public final ms3 l() {
        return this.k;
    }

    public final void m(RenewalGenY reqObj) {
        Intrinsics.checkNotNullParameter(reqObj, "reqObj");
        try {
            this.i.n(new w85(this.e, reqObj, null, null, null, null, 60, null).b(), new f(new a(this.i)));
        } catch (Exception unused) {
        }
    }

    public final void n(RenewalCoaValidation reqObj) {
        Intrinsics.checkNotNullParameter(reqObj, "reqObj");
        try {
            this.h.n(new aa5(this.e, reqObj, null, null, null, null, 60, null).b(), new f(new b(this.h)));
        } catch (Exception unused) {
        }
    }

    public final void o(RenewalValidation reqObj) {
        Intrinsics.checkNotNullParameter(reqObj, "reqObj");
        try {
            this.g.n(new ba5(this.e, reqObj, null, null, null, null, 60, null).b(), new f(new c(this.g)));
        } catch (Exception unused) {
        }
    }

    public final void p(String dlno, String dob, String rtoCodeDLTr, String dlHolderAltMobMum, String willtoDonateOrgans, String perHouseNo, String perStreet, String perLocation, String permVillageOrTown, String perDistrict, String perSubDistrict, String perState, String perPinCode, String presHouseNo, String presStreet, String presLocation, String presVillageOrTown, String presSubDistrict, String presDistrict, String presState, String presPincode, String mobileNumber, String agentServiceName, String agentIpAddress, String agentPwd, String agentId, String applcatgDLserReq, String eKYCId, String eKYCGender, String eKYCOpted, String eKYCapplicantPhoto) {
        Intrinsics.checkNotNullParameter(dlno, "dlno");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(rtoCodeDLTr, "rtoCodeDLTr");
        Intrinsics.checkNotNullParameter(dlHolderAltMobMum, "dlHolderAltMobMum");
        Intrinsics.checkNotNullParameter(willtoDonateOrgans, "willtoDonateOrgans");
        Intrinsics.checkNotNullParameter(perHouseNo, "perHouseNo");
        Intrinsics.checkNotNullParameter(perStreet, "perStreet");
        Intrinsics.checkNotNullParameter(perLocation, "perLocation");
        Intrinsics.checkNotNullParameter(permVillageOrTown, "permVillageOrTown");
        Intrinsics.checkNotNullParameter(perDistrict, "perDistrict");
        Intrinsics.checkNotNullParameter(perSubDistrict, "perSubDistrict");
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
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        Intrinsics.checkNotNullParameter(agentServiceName, "agentServiceName");
        Intrinsics.checkNotNullParameter(agentIpAddress, "agentIpAddress");
        Intrinsics.checkNotNullParameter(agentPwd, "agentPwd");
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(applcatgDLserReq, "applcatgDLserReq");
        Intrinsics.checkNotNullParameter(eKYCId, "eKYCId");
        Intrinsics.checkNotNullParameter(eKYCGender, "eKYCGender");
        Intrinsics.checkNotNullParameter(eKYCOpted, "eKYCOpted");
        Intrinsics.checkNotNullParameter(eKYCapplicantPhoto, "eKYCapplicantPhoto");
        try {
            this.j.n(new k85(this.e, dlno, dob, rtoCodeDLTr, dlHolderAltMobMum, willtoDonateOrgans, perHouseNo, perStreet, perLocation, permVillageOrTown, perDistrict, perSubDistrict, perState, perPinCode, presHouseNo, presStreet, presLocation, presVillageOrTown, presSubDistrict, presDistrict, presState, presPincode, mobileNumber, agentServiceName, agentIpAddress, agentPwd, agentId, applcatgDLserReq, eKYCId, eKYCGender, eKYCOpted, eKYCapplicantPhoto).b(), new f(new d(this.j)));
        } catch (Exception unused) {
        }
    }

    public final void q(String dlno, String dob, String rtoCodeDLTr, String dlHolderAltMobMum, String willtoDonateOrgans, String perHouseNo, String perStreet, String perLocation, String permVillageOrTown, String perDistrict, String perSubDistrict, String perState, String perPinCode, String presHouseNo, String presStreet, String presLocation, String presVillageOrTown, String presSubDistrict, String presDistrict, String presState, String presPincode, String mobileNumber, String agentServiceName, String agentIpAddress, String agentPwd, String agentId, String applcatgDLserReq, String eKYCId, String eKYCGender, String eKYCOpted, String eKYCapplicantPhoto) {
        Intrinsics.checkNotNullParameter(dlno, "dlno");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(rtoCodeDLTr, "rtoCodeDLTr");
        Intrinsics.checkNotNullParameter(dlHolderAltMobMum, "dlHolderAltMobMum");
        Intrinsics.checkNotNullParameter(willtoDonateOrgans, "willtoDonateOrgans");
        Intrinsics.checkNotNullParameter(perHouseNo, "perHouseNo");
        Intrinsics.checkNotNullParameter(perStreet, "perStreet");
        Intrinsics.checkNotNullParameter(perLocation, "perLocation");
        Intrinsics.checkNotNullParameter(permVillageOrTown, "permVillageOrTown");
        Intrinsics.checkNotNullParameter(perDistrict, "perDistrict");
        Intrinsics.checkNotNullParameter(perSubDistrict, "perSubDistrict");
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
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        Intrinsics.checkNotNullParameter(agentServiceName, "agentServiceName");
        Intrinsics.checkNotNullParameter(agentIpAddress, "agentIpAddress");
        Intrinsics.checkNotNullParameter(agentPwd, "agentPwd");
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(applcatgDLserReq, "applcatgDLserReq");
        Intrinsics.checkNotNullParameter(eKYCId, "eKYCId");
        Intrinsics.checkNotNullParameter(eKYCGender, "eKYCGender");
        Intrinsics.checkNotNullParameter(eKYCOpted, "eKYCOpted");
        Intrinsics.checkNotNullParameter(eKYCapplicantPhoto, "eKYCapplicantPhoto");
        try {
            this.k.n(new l85(this.e, dlno, dob, rtoCodeDLTr, dlHolderAltMobMum, willtoDonateOrgans, perHouseNo, perStreet, perLocation, permVillageOrTown, perDistrict, perSubDistrict, perState, perPinCode, presHouseNo, presStreet, presLocation, presVillageOrTown, presSubDistrict, presDistrict, presState, presPincode, mobileNumber, agentServiceName, agentIpAddress, agentPwd, agentId, applcatgDLserReq, eKYCId, eKYCGender, eKYCOpted, eKYCapplicantPhoto).b(), new f(new e(this.k)));
        } catch (Exception unused) {
        }
    }

    public final void r(String dlNumber, String dob, String rtoCode, Map map, String applcatgDLserReq, String mobileNumber, String eKYCId, String eKYCOpted, String eKYCGender, String eKYCPhoto) {
        Intrinsics.checkNotNullParameter(dlNumber, "dlNumber");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(rtoCode, "rtoCode");
        Intrinsics.checkNotNullParameter(applcatgDLserReq, "applcatgDLserReq");
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        Intrinsics.checkNotNullParameter(eKYCId, "eKYCId");
        Intrinsics.checkNotNullParameter(eKYCOpted, "eKYCOpted");
        Intrinsics.checkNotNullParameter(eKYCGender, "eKYCGender");
        Intrinsics.checkNotNullParameter(eKYCPhoto, "eKYCPhoto");
        try {
            this.f.n(new vo1(this.e, dlNumber, dob, rtoCode, map, applcatgDLserReq, mobileNumber, eKYCId, eKYCOpted, eKYCGender, eKYCPhoto).b(), new f(new g(this.f)));
        } catch (Exception unused) {
        }
    }
}
