package com.nic.mparivahan.Echallan.Echallan.Networking;

import android.content.Context;
import com.nic.mparivahan.Echallan.Echallan.Model.PaymentEtransPgi;
import com.zepto.hz0;
import com.zepto.lc5;
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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¨\u0006\u000b"}, d2 = {"Lcom/nic/mparivahan/Echallan/Echallan/Networking/StagingEchallanService;", "", "Lcom/zepto/lc5;", "requestBody", "", "auth", "Lretrofit2/Call;", "Lcom/nic/mparivahan/Echallan/Echallan/Model/PaymentEtransPgi;", "paymentEtransPgi", "verifyEtransPgiPayment", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public interface StagingEchallanService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.nic.mparivahan.Echallan.Echallan.Networking.StagingEchallanService$a, reason: from kotlin metadata */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        public static StagingEchallanService b;

        public final StagingEchallanService a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            yf4.a aVar = new yf4.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            yf4 yf4VarC = aVar.f(60L, timeUnit).L(60L, timeUnit).O(60L, timeUnit).a(hz0.a.e()).c();
            if (b == null) {
                b = (StagingEchallanService) new Retrofit.Builder().baseUrl("https://staging.parivahan.gov.in/echallan/mparivahan-api/").addConverterFactory(GsonConverterFactory.create()).addConverterFactory(ScalarsConverterFactory.create()).client(yf4VarC).build().create(StagingEchallanService.class);
            }
            StagingEchallanService stagingEchallanService = b;
            Intrinsics.checkNotNull(stagingEchallanService);
            return stagingEchallanService;
        }
    }

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("payment-etrans-pgi")
    Call<PaymentEtransPgi> paymentEtransPgi(@Body lc5 requestBody, @Header("Authorization") String auth);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("verify-challan-etrans-pgi-payment-details")
    Call<PaymentEtransPgi> verifyEtransPgiPayment(@Body lc5 requestBody, @Header("Authorization") String auth);
}
