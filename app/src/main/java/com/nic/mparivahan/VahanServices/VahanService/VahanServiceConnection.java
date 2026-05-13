package com.nic.mparivahan.VahanServices.VahanService;

import android.content.Context;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.hz0;
import com.zepto.i22;
import com.zepto.lc5;
import com.zepto.s14;
import com.zepto.tz;
import com.zepto.yf4;
import com.zepto.zr2;
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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J,\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'¨\u0006\u0013"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "", "", "url", "Lcom/zepto/lc5;", "request", "timestamp", "Lretrofit2/Call;", "Lcom/nic/mparivahan/Security/SecModle/SecurityModle;", "getSendOtpRes", "verifyOtpDetails", "getResendOtp", "getRcValues", "saveVahanLog", "updateVahanLogs", "monotringLog", "usertype", "vttransappl", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public interface VahanServiceConnection {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection$a, reason: from kotlin metadata */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        public static VahanServiceConnection b;

        public final VahanServiceConnection a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            yf4.a aVarA = new yf4.a().a(new i22(context)).a(new tz(context));
            TimeUnit timeUnit = TimeUnit.SECONDS;
            yf4.a aVarO = aVarA.f(20L, timeUnit).L(20L, timeUnit).O(20L, timeUnit);
            hz0.a aVar = hz0.a;
            yf4 yf4VarC = aVarO.a(aVar.e()).e(aVar.s()).c();
            if (b == null) {
                b = (VahanServiceConnection) new Retrofit.Builder().baseUrl(s14.a.m()).addConverterFactory(GsonConverterFactory.create()).client(yf4VarC).build().create(VahanServiceConnection.class);
            }
            VahanServiceConnection vahanServiceConnection = b;
            Intrinsics.checkNotNull(vahanServiceConnection);
            return vahanServiceConnection;
        }

        public final VahanServiceConnection b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            zr2 zr2VarD = new zr2(null, 1, 0 == true ? 1 : 0).d(zr2.a.BODY);
            yf4.a aVarF = new yf4.a().b(new i22(context)).a(new tz(context)).f(30L, TimeUnit.MINUTES);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Object objCreate = new Retrofit.Builder().baseUrl(s14.a.m()).addConverterFactory(GsonConverterFactory.create()).client(aVarF.L(30L, timeUnit).O(30L, timeUnit).a(zr2VarD).c()).build().create(VahanServiceConnection.class);
            Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
            return (VahanServiceConnection) objCreate;
        }
    }

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/common/getv1ownerDetailsInurancePuccPermit")
    Call<SecurityModle> getRcValues(@Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST
    Call<SecurityModle> getResendOtp(@Url String url, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST
    Call<SecurityModle> getSendOtpRes(@Url String url, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST
    Call<SecurityModle> monotringLog(@Url String url, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST
    Call<SecurityModle> saveVahanLog(@Url String url, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST
    Call<SecurityModle> updateVahanLogs(@Url String url, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/common/usertype")
    Call<SecurityModle> usertype(@Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST
    Call<SecurityModle> verifyOtpDetails(@Url String url, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/common/vttransappl")
    Call<SecurityModle> vttransappl(@Body lc5 request, @Header("timestamp") String timestamp);
}
