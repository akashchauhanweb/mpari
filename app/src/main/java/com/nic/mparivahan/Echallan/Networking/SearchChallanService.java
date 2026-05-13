package com.nic.mparivahan.Echallan.Networking;

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
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\bf\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J,\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J,\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J,\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¨\u0006\u0019"}, d2 = {"Lcom/nic/mparivahan/Echallan/Networking/SearchChallanService;", "", "Lcom/zepto/lc5;", "requestBody", "", "timestamp", "Lretrofit2/Call;", "Lcom/nic/mparivahan/Security/SecModle/SecurityModle;", "searchChallanData", "searchAllChallan", "getChallanList", "reqBody", "verifyChallanPayment", "getVirtualChallanDetails", "request", "saveEchallanLog", "updateEchallanLog", "paymentEtransPgi", "verifyEtransPgiPayment", "getChallanPdf", "url", "getSendOtpRes", "getResendOtp", "verifyOtpDetails", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public interface SearchChallanService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.nic.mparivahan.Echallan.Networking.SearchChallanService$a, reason: from kotlin metadata */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        public static SearchChallanService b;

        public final SearchChallanService a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            yf4.a aVarA = new yf4.a().b(new i22(context)).a(new tz(context));
            TimeUnit timeUnit = TimeUnit.SECONDS;
            yf4 yf4VarC = aVarA.f(60L, timeUnit).L(60L, timeUnit).O(60L, timeUnit).a(hz0.a.e()).c();
            if (b == null) {
                b = (SearchChallanService) new Retrofit.Builder().baseUrl(s14.a.d()).addConverterFactory(GsonConverterFactory.create()).addConverterFactory(ScalarsConverterFactory.create()).client(yf4VarC).build().create(SearchChallanService.class);
            }
            SearchChallanService searchChallanService = b;
            Intrinsics.checkNotNull(searchChallanService);
            return searchChallanService;
        }

        public final SearchChallanService b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            yf4.a aVarA = new yf4.a().b(new i22(context)).a(new tz(context));
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Object objCreate = new Retrofit.Builder().baseUrl(s14.a.c()).addConverterFactory(GsonConverterFactory.create()).addConverterFactory(ScalarsConverterFactory.create()).client(aVarA.f(60L, timeUnit).L(60L, timeUnit).O(60L, timeUnit).a(hz0.a.e()).c()).build().create(SearchChallanService.class);
            Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
            return (SearchChallanService) objCreate;
        }
    }

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("get-challans-list")
    Call<SecurityModle> getChallanList(@Body lc5 requestBody, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("get-challan-pdf")
    Call<SecurityModle> getChallanPdf(@Body lc5 requestBody, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST
    Call<SecurityModle> getResendOtp(@Url String url, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST
    Call<SecurityModle> getSendOtpRes(@Url String url, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("get-vcourt-challan-details")
    Call<SecurityModle> getVirtualChallanDetails(@Body lc5 reqBody, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("payment-etrans-pgi")
    Call<SecurityModle> paymentEtransPgi(@Body lc5 requestBody, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("saveEchallanLogDetails")
    Call<SecurityModle> saveEchallanLog(@Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("get-challans-detail")
    Call<SecurityModle> searchAllChallan(@Body lc5 requestBody, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("get-challans-detail")
    Call<SecurityModle> searchChallanData(@Body lc5 requestBody, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("updateEchallanLogDetails")
    Call<SecurityModle> updateEchallanLog(@Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("verify-challan-payment-details")
    Call<SecurityModle> verifyChallanPayment(@Body lc5 reqBody, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("verify-challan-etrans-pgi-payment-details")
    Call<SecurityModle> verifyEtransPgiPayment(@Body lc5 requestBody, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST
    Call<SecurityModle> verifyOtpDetails(@Url String url, @Body lc5 request, @Header("timestamp") String timestamp);
}
