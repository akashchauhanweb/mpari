package com.nic.mparivahan.Sos.NetworkServices;

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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ,\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'¨\u0006\u000f"}, d2 = {"Lcom/nic/mparivahan/Sos/NetworkServices/SOSService;", "", "", "url", "Lcom/zepto/lc5;", "request", "timestamp", "Lretrofit2/Call;", "Lcom/nic/mparivahan/Security/SecModle/SecurityModle;", "getRelationMaster", "getContactList", "saveEmgContact", "updatesos", "deletContact", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public interface SOSService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.nic.mparivahan.Sos.NetworkServices.SOSService$a, reason: from kotlin metadata */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        public static SOSService b;

        public final SOSService a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            yf4.a aVarF = new yf4.a().a(new i22(context)).a(new tz(context)).f(2L, TimeUnit.MINUTES);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            yf4.a aVarO = aVarF.L(60L, timeUnit).O(60L, timeUnit);
            hz0.a aVar = hz0.a;
            yf4 yf4VarC = aVarO.a(aVar.e()).e(aVar.s()).c();
            if (b == null) {
                b = (SOSService) new Retrofit.Builder().baseUrl(s14.a.w()).addConverterFactory(GsonConverterFactory.create()).client(yf4VarC).build().create(SOSService.class);
            }
            SOSService sOSService = b;
            Intrinsics.checkNotNull(sOSService);
            return sOSService;
        }
    }

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("service/deleteSosContact")
    Call<SecurityModle> deletContact(@Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("service/getSosContact")
    Call<SecurityModle> getContactList(@Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST
    Call<SecurityModle> getRelationMaster(@Url String url, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("service/saveSosContact")
    Call<SecurityModle> saveEmgContact(@Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("service/updateSosContact")
    Call<SecurityModle> updatesos(@Body lc5 request, @Header("timestamp") String timestamp);
}
