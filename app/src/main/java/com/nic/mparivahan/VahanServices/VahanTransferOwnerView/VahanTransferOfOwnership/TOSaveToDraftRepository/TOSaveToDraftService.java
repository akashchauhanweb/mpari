package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOSaveToDraftRepository;

import android.content.Context;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¨\u0006\n"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOSaveToDraftRepository/TOSaveToDraftService;", "", "Lcom/zepto/lc5;", "request", "", "timestamp", "Lretrofit2/Call;", "Lcom/nic/mparivahan/Security/SecModle/SecurityModle;", "savetoDrfatTO", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public interface TOSaveToDraftService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOSaveToDraftRepository.TOSaveToDraftService$a, reason: from kotlin metadata */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        public static TOSaveToDraftService b;

        public final TOSaveToDraftService a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            zr2 zr2VarD = new zr2(null, 1, 0 == true ? 1 : 0).d(zr2.a.BODY);
            yf4.a aVarA = new yf4.a().a(new i22(context)).a(new tz(context));
            TimeUnit timeUnit = TimeUnit.SECONDS;
            yf4 yf4VarC = aVarA.f(60L, timeUnit).L(40L, timeUnit).O(40L, timeUnit).a(zr2VarD).c();
            if (b == null) {
                b = (TOSaveToDraftService) new Retrofit.Builder().baseUrl(s14.a.m()).addConverterFactory(GsonConverterFactory.create()).client(yf4VarC).build().create(TOSaveToDraftService.class);
            }
            TOSaveToDraftService tOSaveToDraftService = b;
            Intrinsics.checkNotNull(tOSaveToDraftService);
            return tOSaveToDraftService;
        }
    }

    @Headers({"Content-Type: application/json"})
    @POST("vahan/vahancapi/to/toDraft")
    Call<SecurityModle> savetoDrfatTO(@Body lc5 request, @Header("timestamp") String timestamp);
}
