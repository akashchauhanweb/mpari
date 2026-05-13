package com.zepto;

import com.nic.mparivahan.APIController;
import com.nic.mparivahan.Welcome.NapixService;
import com.zepto.nu5;
import com.zepto.s14;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class t14 {
    public final NapixService a;

    public t14(NapixService retrofitService) {
        Intrinsics.checkNotNullParameter(retrofitService, "retrofitService");
        this.a = retrofitService;
    }

    public final Call a(String grant_type, String scope) {
        Intrinsics.checkNotNullParameter(grant_type, "grant_type");
        Intrinsics.checkNotNullParameter(scope, "scope");
        NapixService napixService = this.a;
        String strNChallanGrant = APIController.a().NChallanGrant();
        Intrinsics.checkNotNullExpressionValue(strNChallanGrant, "NChallanGrant(...)");
        String strNChallanScope = APIController.a().NChallanScope();
        Intrinsics.checkNotNullExpressionValue(strNChallanScope, "NChallanScope(...)");
        return napixService.getChallNapix(grant_type, scope, strNChallanGrant, strNChallanScope);
    }

    public final Call b(String grant_type, String scope) {
        Intrinsics.checkNotNullParameter(grant_type, "grant_type");
        Intrinsics.checkNotNullParameter(scope, "scope");
        NapixService napixService = this.a;
        String strGetSarClientId = APIController.a().GetSarClientId();
        Intrinsics.checkNotNullExpressionValue(strGetSarClientId, "GetSarClientId(...)");
        String strGetSarClientSecret = APIController.a().GetSarClientSecret();
        Intrinsics.checkNotNullExpressionValue(strGetSarClientSecret, "GetSarClientSecret(...)");
        return napixService.getSarathiToken(grant_type, scope, strGetSarClientId, strGetSarClientSecret);
    }

    public final Call c(String grant_type, String scope) {
        Intrinsics.checkNotNullParameter(grant_type, "grant_type");
        Intrinsics.checkNotNullParameter(scope, "scope");
        NapixService napixService = this.a;
        nu5.a aVar = nu5.a;
        s14.a aVar2 = s14.a;
        return napixService.getToken(grant_type, scope, String.valueOf(aVar.a(aVar2.l()).get("KEY")), String.valueOf(aVar.a(aVar2.h()).get("KEY")));
    }
}
