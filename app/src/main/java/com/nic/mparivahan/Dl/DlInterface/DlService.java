package com.nic.mparivahan.Dl.DlInterface;

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

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ,\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'¨\u0006\u0010"}, d2 = {"Lcom/nic/mparivahan/Dl/DlInterface/DlService;", "", "", "url", "Lcom/zepto/lc5;", "request", "timestamp", "Lretrofit2/Call;", "Lcom/nic/mparivahan/Security/SecModle/SecurityModle;", "getDlDetails_new", "createVirtualDoc", "getDlDetailsWitoutDOB", "getDlDetailsForRecentSearch", "dldetailWithOutDob", "updateVirtualDl", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public interface DlService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.nic.mparivahan.Dl.DlInterface.DlService$a, reason: from kotlin metadata */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        public static DlService b;

        public final DlService a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (b == null) {
                yf4.a aVarF = new yf4.a().a(new i22(context)).a(new tz(context)).f(2L, TimeUnit.MINUTES);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                yf4.a aVarO = aVarF.L(60L, timeUnit).O(60L, timeUnit);
                hz0.a aVar = hz0.a;
                b = (DlService) new Retrofit.Builder().baseUrl(s14.a.u()).addConverterFactory(GsonConverterFactory.create()).client(aVarO.a(aVar.e()).e(aVar.s()).c()).build().create(DlService.class);
            }
            DlService dlService = b;
            Intrinsics.checkNotNull(dlService);
            return dlService;
        }
    }

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST
    Call<SecurityModle> createVirtualDoc(@Url String url, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST
    Call<SecurityModle> dldetailWithOutDob(@Url String url, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST
    Call<SecurityModle> getDlDetailsForRecentSearch(@Url String url, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST
    Call<SecurityModle> getDlDetailsWitoutDOB(@Url String url, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST
    Call<SecurityModle> getDlDetails_new(@Url String url, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST
    Call<SecurityModle> updateVirtualDl(@Url String url, @Body lc5 request, @Header("timestamp") String timestamp);
}
