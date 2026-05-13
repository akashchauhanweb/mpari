package com.nic.mparivahan.VahanServices.DuplicateFitnessCertificateDownload.DFCService;

import android.content.Context;
import com.nic.mparivahan.VahanServices.DuplicateFitnessCertificateDownload.DFCModel.DFCModel;
import com.zepto.hz0;
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
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¨\u0006\b"}, d2 = {"Lcom/nic/mparivahan/VahanServices/DuplicateFitnessCertificateDownload/DFCService/DFCServices;", "", "", "applNo", "Lretrofit2/Call;", "Lcom/nic/mparivahan/VahanServices/DuplicateFitnessCertificateDownload/DFCModel/DFCModel;", "validateDownloadReceipt", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public interface DFCServices {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.nic.mparivahan.VahanServices.DuplicateFitnessCertificateDownload.DFCService.DFCServices$a, reason: from kotlin metadata */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        public static DFCServices b;

        public final DFCServices a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            yf4.a aVarA = new yf4.a().a(hz0.a.e());
            TimeUnit timeUnit = TimeUnit.SECONDS;
            yf4 yf4VarC = aVarA.f(60L, timeUnit).L(60L, timeUnit).O(60L, timeUnit).c();
            if (b == null) {
                b = (DFCServices) new Retrofit.Builder().baseUrl("https://staging.parivahan.gov.in/").addConverterFactory(GsonConverterFactory.create()).addConverterFactory(ScalarsConverterFactory.create()).client(yf4VarC).build().create(DFCServices.class);
            }
            DFCServices dFCServices = b;
            Intrinsics.checkNotNull(dFCServices);
            return dFCServices;
        }
    }

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @GET("vahancapi-common/printDupFitCertificate")
    Call<DFCModel> validateDownloadReceipt(@Query("applNo") String applNo);
}
