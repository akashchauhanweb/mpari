package com.nic.mparivahan.Citizen.Interfaces;

import android.content.Context;
import com.zepto.hz0;
import com.zepto.nd5;
import com.zepto.yf4;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¨\u0006\t"}, d2 = {"Lcom/nic/mparivahan/Citizen/Interfaces/ReverseGeoCoding;", "", "", "lon", "lat", "Lretrofit2/Call;", "Lcom/zepto/nd5;", "reversegeocoding", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public interface ReverseGeoCoding {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.nic.mparivahan.Citizen.Interfaces.ReverseGeoCoding$a, reason: from kotlin metadata */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        public static yf4 b;
        public static ReverseGeoCoding c;

        static {
            yf4.a aVarF = new yf4.a().f(2L, TimeUnit.MINUTES);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            b = aVarF.L(60L, timeUnit).O(60L, timeUnit).c();
        }

        public final ReverseGeoCoding a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (c == null) {
                yf4.a aVar = new yf4.a();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                c = (ReverseGeoCoding) new Retrofit.Builder().baseUrl("https://reversegeocoding.nic.in").addConverterFactory(GsonConverterFactory.create()).client(aVar.f(30L, timeUnit).L(15L, timeUnit).O(15L, timeUnit).a(hz0.a.e()).c()).build().create(ReverseGeoCoding.class);
            }
            ReverseGeoCoding reverseGeoCoding = c;
            Intrinsics.checkNotNull(reverseGeoCoding);
            return reverseGeoCoding;
        }
    }

    @GET("/GetVillageDetails/api/GeoData/getVillageDetails")
    Call<nd5> reversegeocoding(@Query("lon") String lon, @Query("lat") String lat);
}
