package com.nic.mparivahan.VahanServices.VahanService;

import android.content.Context;
import com.zepto.hz0;
import com.zepto.nd5;
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
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¨\u0006\n"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanService/DownloadReceiptService;", "", "", "param", "param1", "param2", "Lretrofit2/Call;", "Lcom/zepto/nd5;", "validateDownloadReceipt", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public interface DownloadReceiptService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.nic.mparivahan.VahanServices.VahanService.DownloadReceiptService$a, reason: from kotlin metadata */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        public static DownloadReceiptService b;

        public final DownloadReceiptService a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            yf4.a aVarA = new yf4.a().a(new tz(context));
            TimeUnit timeUnit = TimeUnit.SECONDS;
            yf4 yf4VarC = aVarA.f(60L, timeUnit).L(60L, timeUnit).O(60L, timeUnit).a(hz0.a.e()).c();
            if (b == null) {
                b = (DownloadReceiptService) new Retrofit.Builder().baseUrl(s14.a.i()).addConverterFactory(GsonConverterFactory.create()).addConverterFactory(ScalarsConverterFactory.create()).client(yf4VarC).build().create(DownloadReceiptService.class);
            }
            DownloadReceiptService downloadReceiptService = b;
            Intrinsics.checkNotNull(downloadReceiptService);
            return downloadReceiptService;
        }
    }

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @GET("reprintreciept/{param}/{param1}/{param2}")
    Call<nd5> validateDownloadReceipt(@Path(encoded = true, value = "param") String param, @Path(encoded = true, value = "param1") String param1, @Path(encoded = true, value = "param2") String param2);
}
