package com.nic.mparivahan.DLServicesAuth.CheckEligibility;

import android.content.Context;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.ff2;
import com.zepto.hz0;
import com.zepto.i22;
import com.zepto.lc5;
import com.zepto.s14;
import com.zepto.tz;
import com.zepto.yf4;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH'J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH'¨\u0006\r"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/CheckEligibility/FromEligCheck;", "", "Lcom/zepto/lc5;", "body", "Lretrofit2/Call;", "Lcom/zepto/ff2;", "FormOneInter", "request", "", "timestamp", "Lcom/nic/mparivahan/Security/SecModle/SecurityModle;", "ServiceCheck", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public interface FromEligCheck {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.nic.mparivahan.DLServicesAuth.CheckEligibility.FromEligCheck$a, reason: from kotlin metadata */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        public static FromEligCheck b;

        public final FromEligCheck a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (b == null) {
                yf4.a aVarF = new yf4.a().a(new i22(context)).a(new tz(context)).f(2L, TimeUnit.MINUTES);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                b = (FromEligCheck) new Retrofit.Builder().baseUrl(s14.a.j()).addConverterFactory(GsonConverterFactory.create()).client(aVarF.L(60L, timeUnit).O(60L, timeUnit).a(hz0.a.e()).c()).build().create(FromEligCheck.class);
            }
            FromEligCheck fromEligCheck = b;
            Intrinsics.checkNotNull(fromEligCheck);
            return fromEligCheck;
        }

        public final FromEligCheck b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (b == null) {
                yf4.a aVarF = new yf4.a().a(new i22(context)).a(new tz(context)).f(2L, TimeUnit.MINUTES);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                b = (FromEligCheck) new Retrofit.Builder().baseUrl(s14.a.j()).addConverterFactory(GsonConverterFactory.create()).client(aVarF.L(60L, timeUnit).O(60L, timeUnit).a(hz0.a.e()).c()).build().create(FromEligCheck.class);
            }
            FromEligCheck fromEligCheck = b;
            Intrinsics.checkNotNull(fromEligCheck);
            return fromEligCheck;
        }
    }

    @POST("sarathiWS/ServicesOnDL/checkFORM1ReqFOrDLServReq")
    Call<ff2> FormOneInter(@Body lc5 body);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/ServicesOnDL/checkFORM1ReqFOrDLServReq")
    Call<SecurityModle> FormOneInter(@Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/ServicesOnDL/checkSelctedTransAllowdForST")
    Call<SecurityModle> ServiceCheck(@Body lc5 request, @Header("timestamp") String timestamp);
}
