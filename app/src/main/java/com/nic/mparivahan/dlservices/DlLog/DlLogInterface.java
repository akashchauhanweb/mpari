package com.nic.mparivahan.dlservices.DlLog;

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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¨\u0006\u000e"}, d2 = {"Lcom/nic/mparivahan/dlservices/DlLog/DlLogInterface;", "", "Lcom/zepto/lc5;", "request", "", "timestamp", "Lretrofit2/Call;", "Lcom/nic/mparivahan/Security/SecModle/SecurityModle;", "saveSarathiLog", "saveOtpReqInter", "saveOtpResInter", "saveKycReq", "saveKycRes", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public interface DlLogInterface {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.nic.mparivahan.dlservices.DlLog.DlLogInterface$a, reason: from kotlin metadata */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        public static DlLogInterface b;

        public final DlLogInterface a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            zr2 zr2VarD = new zr2(null, 1, null).d(zr2.a.BODY);
            yf4.a aVarF = new yf4.a().b(new i22(context)).a(new tz(context)).f(2L, TimeUnit.MINUTES);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Object objCreate = new Retrofit.Builder().baseUrl(s14.a.t()).addConverterFactory(GsonConverterFactory.create()).client(aVarF.L(60L, timeUnit).O(60L, timeUnit).a(zr2VarD).c()).build().create(DlLogInterface.class);
            Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
            return (DlLogInterface) objCreate;
        }

        public final DlLogInterface b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (b == null) {
                yf4.a aVarF = new yf4.a().b(new i22(context)).a(new tz(context)).f(2L, TimeUnit.MINUTES);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                b = (DlLogInterface) new Retrofit.Builder().baseUrl(s14.a.j()).addConverterFactory(GsonConverterFactory.create()).client(aVarF.L(60L, timeUnit).O(60L, timeUnit).a(hz0.a.e()).c()).build().create(DlLogInterface.class);
            }
            DlLogInterface dlLogInterface = b;
            Intrinsics.checkNotNull(dlLogInterface);
            return dlLogInterface;
        }
    }

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("apis/sarathi/dladharvalidation/apis/services/saveekycreq")
    Call<SecurityModle> saveKycReq(@Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("apis/sarathi/dladharvalidation/apis/services/saveadhardtls")
    Call<SecurityModle> saveKycRes(@Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("apis/sarathi/dladharvalidation/apis/services/saveaotpreq")
    Call<SecurityModle> saveOtpReqInter(@Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("apis/sarathi/dladharvalidation/apis/services/saveaotpres")
    Call<SecurityModle> saveOtpResInter(@Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("service/saveSarathiLogDetails")
    Call<SecurityModle> saveSarathiLog(@Body lc5 request, @Header("timestamp") String timestamp);
}
