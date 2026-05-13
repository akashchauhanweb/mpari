package com.nic.mparivahan.Tax;

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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¨\u0006\u000e"}, d2 = {"Lcom/nic/mparivahan/Tax/PaytaxService;", "", "Lcom/zepto/lc5;", "request", "", "timestamp", "Lretrofit2/Call;", "Lcom/nic/mparivahan/Security/SecModle/SecurityModle;", "getafterpayment", "beforepayment", "getprintreciept", "gettaxModeListener", "getvahancapi", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public interface PaytaxService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.nic.mparivahan.Tax.PaytaxService$a, reason: from kotlin metadata */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        public static yf4 b;
        public static PaytaxService c;
        public static String d;

        static {
            yf4.a aVar = new yf4.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            b = aVar.f(60L, timeUnit).L(60L, timeUnit).O(60L, timeUnit).a(hz0.a.e()).c();
            d = String.valueOf(System.currentTimeMillis());
        }

        public final PaytaxService a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            yf4.a aVarA = new yf4.a().a(new i22(context)).a(new tz(context));
            TimeUnit timeUnit = TimeUnit.SECONDS;
            yf4 yf4VarC = aVarA.f(30L, timeUnit).L(30L, timeUnit).O(30L, timeUnit).a(hz0.a.e()).c();
            if (c == null) {
                c = (PaytaxService) new Retrofit.Builder().baseUrl(s14.a.m()).addConverterFactory(GsonConverterFactory.create()).client(yf4VarC).build().create(PaytaxService.class);
            }
            PaytaxService paytaxService = c;
            Intrinsics.checkNotNull(paytaxService);
            return paytaxService;
        }
    }

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/tax/beforepayment")
    Call<SecurityModle> beforepayment(@Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/tax/afterpayment")
    Call<SecurityModle> getafterpayment(@Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/tax/printreciept")
    Call<SecurityModle> getprintreciept(@Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/tax/taxModeListener")
    Call<SecurityModle> gettaxModeListener(@Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/tax/taxPurCdDesc")
    Call<SecurityModle> getvahancapi(@Body lc5 request, @Header("timestamp") String timestamp);
}
