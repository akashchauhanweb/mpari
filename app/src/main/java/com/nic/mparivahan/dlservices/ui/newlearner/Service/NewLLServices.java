package com.nic.mparivahan.dlservices.ui.newlearner.Service;

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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'J\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¨\u0006\u0012"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/newlearner/Service/NewLLServices;", "", "Lcom/zepto/lc5;", "params", "", "timestamp", "Lretrofit2/Call;", "Lcom/nic/mparivahan/Security/SecModle/SecurityModle;", "getCampList", "getLearnerLicenceClass", "getBloodGroup", "getCountry", "getEducationQual", "getDrivingSchool", "submitNewLL", "checkLLUploadPhotoSign", "checkLLDownloadAppNo", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public interface NewLLServices {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.nic.mparivahan.dlservices.ui.newlearner.Service.NewLLServices$a, reason: from kotlin metadata */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        public static NewLLServices b;

        public final NewLLServices a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (b == null) {
                yf4.a aVarF = new yf4.a().a(new i22(context)).a(new tz(context)).f(2L, TimeUnit.MINUTES);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                b = (NewLLServices) new Retrofit.Builder().baseUrl(s14.a.m()).addConverterFactory(GsonConverterFactory.create()).client(aVarF.L(60L, timeUnit).O(60L, timeUnit).a(hz0.a.e()).c()).build().create(NewLLServices.class);
            }
            NewLLServices newLLServices = b;
            Intrinsics.checkNotNull(newLLServices);
            return newLLServices;
        }
    }

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiservice/rsServices/ServiceOnPrint/getForm3Print")
    Call<SecurityModle> checkLLDownloadAppNo(@Body lc5 params, @Header("timestamp") String timestamp);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiservice/rsServices/uploadingPhotoAndSignature/getImage")
    Call<SecurityModle> checkLLUploadPhotoSign(@Body lc5 params, @Header("timestamp") String timestamp);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/bloodGroups/master")
    Call<SecurityModle> getBloodGroup(@Body lc5 params, @Header("timestamp") String timestamp);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/newLLCampService/camps")
    Call<SecurityModle> getCampList(@Body lc5 params, @Header("timestamp") String timestamp);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/masters/countries")
    Call<SecurityModle> getCountry(@Body lc5 params, @Header("timestamp") String timestamp);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/getSeDschoolsList/dschools")
    Call<SecurityModle> getDrivingSchool(@Body lc5 params, @Header("timestamp") String timestamp);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/newLL/qualmast")
    Call<SecurityModle> getEducationQual(@Body lc5 params, @Header("timestamp") String timestamp);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/getNtCovsByApplCatg/covs")
    Call<SecurityModle> getLearnerLicenceClass(@Body lc5 params, @Header("timestamp") String timestamp);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/licenceServices/newLL")
    Call<SecurityModle> submitNewLL(@Body lc5 params, @Header("timestamp") String timestamp);
}
