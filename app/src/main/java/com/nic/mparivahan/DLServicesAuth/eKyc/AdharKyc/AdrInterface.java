package com.nic.mparivahan.DLServicesAuth.eKyc.AdharKyc;

import android.content.Context;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.OtpAdharRes;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.TokenGeneration;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.UserFullDetails;
import com.zepto.hz0;
import com.zepto.lc5;
import com.zepto.nd5;
import com.zepto.s14;
import com.zepto.uz;
import com.zepto.yf4;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0002H'J0\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'J0\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'J0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'J0\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¨\u0006\u0014"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/eKyc/AdharKyc/AdrInterface;", "", "Lcom/zepto/lc5;", "body", "Lretrofit2/Call;", "Lcom/zepto/nd5;", "doSarAadhaarRequest", "request", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/TokenGeneration;", "tokenGeneration", "", "", "header", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/OtpAdharRes;", "newSarAadhaarRequest", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/UserFullDetails;", "aadhaarResponse", "newSarAadhaarRequestStaging", "aadhaarResponseStaging", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public interface AdrInterface {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.nic.mparivahan.DLServicesAuth.eKyc.AdharKyc.AdrInterface$a, reason: from kotlin metadata */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        public static AdrInterface b;

        public final AdrInterface a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (b == null) {
                yf4.a aVarF = new yf4.a().f(1L, TimeUnit.MINUTES);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                b = (AdrInterface) new Retrofit.Builder().baseUrl(s14.a.f()).addConverterFactory(GsonConverterFactory.create()).client(aVarF.L(30L, timeUnit).O(15L, timeUnit).a(new uz()).a(hz0.a.e()).c()).build().create(AdrInterface.class);
            }
            AdrInterface adrInterface = b;
            Intrinsics.checkNotNull(adrInterface);
            return adrInterface;
        }
    }

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/ekyc-authentication-api/public/aadharOtpGeneration")
    Call<UserFullDetails> aadhaarResponse(@HeaderMap Map<String, String> header, @Body lc5 body);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sapi/ekyc-authentication-api/public/aadharOtpGeneration")
    Call<UserFullDetails> aadhaarResponseStaging(@HeaderMap Map<String, String> header, @Body lc5 body);

    @Headers({"Accept:application/xml", "Content-Type:application/xml"})
    @POST("SarathiAadhaarService/aadhaar/authekyc/generateResponse")
    Call<nd5> doSarAadhaarRequest(@Body lc5 body);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/ekyc-authentication-api/public/aadharOtpGeneration")
    Call<OtpAdharRes> newSarAadhaarRequest(@HeaderMap Map<String, String> header, @Body lc5 body);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sapi/ekyc-authentication-api/public/aadharOtpGeneration")
    Call<OtpAdharRes> newSarAadhaarRequestStaging(@HeaderMap Map<String, String> header, @Body lc5 body);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("ekycauthentication/public/tokenGeneration")
    Call<TokenGeneration> tokenGeneration(@Body lc5 request);
}
