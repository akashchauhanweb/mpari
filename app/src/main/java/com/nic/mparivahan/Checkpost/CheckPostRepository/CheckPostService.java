package com.nic.mparivahan.Checkpost.CheckPostRepository;

import android.content.Context;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
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
import retrofit2.converter.scalars.ScalarsConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¨\u0006\u000b"}, d2 = {"Lcom/nic/mparivahan/Checkpost/CheckPostRepository/CheckPostService;", "", "Lcom/zepto/lc5;", "request", "", "timestamp", "Lretrofit2/Call;", "Lcom/nic/mparivahan/Security/SecModle/SecurityModle;", "getDetailsCheckPost", "getDetailsCheckPostVehicle", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public interface CheckPostService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.nic.mparivahan.Checkpost.CheckPostRepository.CheckPostService$a, reason: from kotlin metadata */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        public static CheckPostService b;

        public final CheckPostService a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            yf4.a aVarA = new yf4.a().a(new i22(context)).a(new tz(context));
            TimeUnit timeUnit = TimeUnit.SECONDS;
            yf4 yf4VarC = aVarA.f(60L, timeUnit).L(60L, timeUnit).O(60L, timeUnit).a(hz0.a.e()).c();
            if (b == null) {
                b = (CheckPostService) new Retrofit.Builder().baseUrl(s14.a.m()).addConverterFactory(GsonConverterFactory.create()).addConverterFactory(ScalarsConverterFactory.create()).client(yf4VarC).build().create(CheckPostService.class);
            }
            CheckPostService checkPostService = b;
            Intrinsics.checkNotNull(checkPostService);
            return checkPostService;
        }
    }

    @Headers({"Content-Type: application/json"})
    @POST("checkpost/checkpostSecureWs/reportServiceApi/report/checkReciptDtls")
    Call<SecurityModle> getDetailsCheckPost(@Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json"})
    @POST("checkpost/checkpostSecureWs/reportServiceApi/report/checkReciptDtls")
    Call<SecurityModle> getDetailsCheckPostVehicle(@Body lc5 request, @Header("timestamp") String timestamp);
}
