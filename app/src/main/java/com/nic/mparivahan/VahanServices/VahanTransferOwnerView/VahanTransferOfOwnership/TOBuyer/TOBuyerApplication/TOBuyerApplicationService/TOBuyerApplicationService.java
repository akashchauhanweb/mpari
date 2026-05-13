package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOBuyer.TOBuyerApplication.TOBuyerApplicationService;

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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¨\u0006\u000b"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOBuyer/TOBuyerApplication/TOBuyerApplicationService/TOBuyerApplicationService;", "", "Lcom/zepto/lc5;", "request", "", "timestamp", "Lretrofit2/Call;", "Lcom/nic/mparivahan/Security/SecModle/SecurityModle;", "getApplicantDetail", "getSelledetailsByRcChassis", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public interface TOBuyerApplicationService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOBuyer.TOBuyerApplication.TOBuyerApplicationService.TOBuyerApplicationService$a, reason: from kotlin metadata */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        public static TOBuyerApplicationService b;

        public final TOBuyerApplicationService a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            yf4.a aVarA = new yf4.a().a(new i22(context)).a(new tz(context));
            TimeUnit timeUnit = TimeUnit.SECONDS;
            yf4 yf4VarC = aVarA.f(60L, timeUnit).L(30L, timeUnit).O(30L, timeUnit).a(hz0.a.e()).c();
            if (b == null) {
                b = (TOBuyerApplicationService) new Retrofit.Builder().baseUrl(s14.a.m()).addConverterFactory(GsonConverterFactory.create()).addConverterFactory(ScalarsConverterFactory.create()).client(yf4VarC).build().create(TOBuyerApplicationService.class);
            }
            TOBuyerApplicationService tOBuyerApplicationService = b;
            Intrinsics.checkNotNull(tOBuyerApplicationService);
            return tOBuyerApplicationService;
        }
    }

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/to/fetchservices")
    Call<SecurityModle> getApplicantDetail(@Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/to/fetchserviceregnandchassis")
    Call<SecurityModle> getSelledetailsByRcChassis(@Body lc5 request, @Header("timestamp") String timestamp);
}
