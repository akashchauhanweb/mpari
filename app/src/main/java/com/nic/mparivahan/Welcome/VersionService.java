package com.nic.mparivahan.Welcome;

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
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ,\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'¨\u0006\u000e"}, d2 = {"Lcom/nic/mparivahan/Welcome/VersionService;", "", "", "url", "Lcom/zepto/lc5;", "request", "timestamp", "Lretrofit2/Call;", "Lcom/nic/mparivahan/Security/SecModle/SecurityModle;", "getVersion", "getServiceEnabledStates", "getStateMasterList", "getBannerList", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public interface VersionService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.nic.mparivahan.Welcome.VersionService$a, reason: from kotlin metadata */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        public static yf4 b;
        public static VersionService c;
        public static String d;

        static {
            yf4.a aVar = new yf4.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            b = aVar.f(60L, timeUnit).L(60L, timeUnit).O(60L, timeUnit).a(hz0.a.e()).c();
            d = String.valueOf(System.currentTimeMillis());
        }

        public final VersionService a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            yf4.a aVarA = new yf4.a().a(new i22(context)).a(new tz(context));
            TimeUnit timeUnit = TimeUnit.SECONDS;
            yf4 yf4VarC = aVarA.f(5L, timeUnit).L(5L, timeUnit).O(5L, timeUnit).a(hz0.a.e()).c();
            if (c == null) {
                c = (VersionService) new Retrofit.Builder().baseUrl(s14.a.r()).addConverterFactory(GsonConverterFactory.create()).client(yf4VarC).build().create(VersionService.class);
            }
            VersionService versionService = c;
            Intrinsics.checkNotNull(versionService);
            return versionService;
        }
    }

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST
    Call<SecurityModle> getBannerList(@Url String url, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("service/getServiceEnabledStates")
    Call<SecurityModle> getServiceEnabledStates(@Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("service/getStateMaster")
    Call<SecurityModle> getStateMasterList(@Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST
    Call<SecurityModle> getVersion(@Url String url, @Body lc5 request, @Header("timestamp") String timestamp);
}
