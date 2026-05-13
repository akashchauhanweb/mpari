package com.nic.mparivahan.ProfileDetails.ProfileInterface;

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
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J,\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'¨\u0006\u0011"}, d2 = {"Lcom/nic/mparivahan/ProfileDetails/ProfileInterface/UserBloodDetails;", "", "", "url", "Lcom/zepto/lc5;", "request", "timestamp", "Lretrofit2/Call;", "Lcom/nic/mparivahan/Security/SecModle/SecurityModle;", "getBloodDetails", "saveProfileDetails", "updateCitizenProfile", "getCitizenProfile", "uploadProfileImg", "fetchProfileImg", "updatestateInterface", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public interface UserBloodDetails {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.nic.mparivahan.ProfileDetails.ProfileInterface.UserBloodDetails$a, reason: from kotlin metadata */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        public static zr2 b = new zr2(null, 1, 0 == true ? 1 : 0).d(zr2.a.BODY);
        public static UserBloodDetails c;

        public final UserBloodDetails a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            yf4.a aVarF = new yf4.a().a(new i22(context)).a(new tz(context)).f(2L, TimeUnit.MINUTES);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            yf4 yf4VarC = aVarF.L(60L, timeUnit).O(60L, timeUnit).a(b).c();
            if (c == null) {
                c = (UserBloodDetails) new Retrofit.Builder().baseUrl(s14.a.q()).addConverterFactory(GsonConverterFactory.create()).client(yf4VarC).build().create(UserBloodDetails.class);
            }
            UserBloodDetails userBloodDetails = c;
            Intrinsics.checkNotNull(userBloodDetails);
            return userBloodDetails;
        }
    }

    @Headers({"Content-Type: application/json"})
    @POST("service/fetchCitizenImage")
    Call<SecurityModle> fetchProfileImg(@Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json"})
    @POST
    Call<SecurityModle> getBloodDetails(@Url String url, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("service/getCitizenProfile")
    Call<SecurityModle> getCitizenProfile(@Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("service/saveCitizenProfile")
    Call<SecurityModle> saveProfileDetails(@Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("service/updateCitizenProfile")
    Call<SecurityModle> updateCitizenProfile(@Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("service/updateCitizenUserDetails")
    Call<SecurityModle> updatestateInterface(@Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json"})
    @POST("service/uploadCitizenImage")
    Call<SecurityModle> uploadProfileImg(@Body lc5 request, @Header("timestamp") String timestamp);
}
