package com.nic.mparivahan.DPTNotice.Services;

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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¨\u0006\r"}, d2 = {"Lcom/nic/mparivahan/DPTNotice/Services/NoticeService;", "", "Lcom/zepto/lc5;", "request", "", "timestamp", "Lretrofit2/Call;", "Lcom/nic/mparivahan/Security/SecModle/SecurityModle;", "getNoticeListUsingNoticeNo", "getNoticeListUsingVehicleNo", "getVirtualCourt", "verifyPaymentStatus", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public interface NoticeService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.nic.mparivahan.DPTNotice.Services.NoticeService$a, reason: from kotlin metadata */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        public static NoticeService b;

        public final NoticeService a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            yf4.a aVarA = new yf4.a().b(new i22(context)).a(new tz(context));
            TimeUnit timeUnit = TimeUnit.SECONDS;
            yf4 yf4VarC = aVarA.f(60L, timeUnit).L(60L, timeUnit).O(60L, timeUnit).a(hz0.a.e()).c();
            if (b == null) {
                b = (NoticeService) new Retrofit.Builder().baseUrl(s14.a.b()).addConverterFactory(GsonConverterFactory.create()).addConverterFactory(ScalarsConverterFactory.create()).client(yf4VarC).build().create(NoticeService.class);
            }
            NoticeService noticeService = b;
            Intrinsics.checkNotNull(noticeService);
            return noticeService;
        }
    }

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("get-notice-details")
    Call<SecurityModle> getNoticeListUsingNoticeNo(@Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("get-notice-detail")
    Call<SecurityModle> getNoticeListUsingVehicleNo(@Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("get-vcourt-notice-details")
    Call<SecurityModle> getVirtualCourt(@Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("notice-payment-verify")
    Call<SecurityModle> verifyPaymentStatus(@Body lc5 request, @Header("timestamp") String timestamp);
}
