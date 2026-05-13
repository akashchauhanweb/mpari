package com.nic.mparivahan.dlservices.ReplacementCOA;

import android.content.Context;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.gq6;
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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¨\u0006\n"}, d2 = {"Lcom/nic/mparivahan/dlservices/ReplacementCOA/RepCOAInterface;", "", "Lcom/zepto/lc5;", "request", "", "timestamp", "Lretrofit2/Call;", "Lcom/nic/mparivahan/Security/SecModle/SecurityModle;", "repCOAInterface", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public interface RepCOAInterface {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.nic.mparivahan.dlservices.ReplacementCOA.RepCOAInterface$a, reason: from kotlin metadata */
    public static final class Companion {
        public static RepCOAInterface b;
        public static final /* synthetic */ Companion a = new Companion();
        public static yf4 c = gq6.a();

        public final RepCOAInterface a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            yf4.a aVarF = new yf4.a().b(new i22(context)).a(new tz(context)).f(2L, TimeUnit.MINUTES);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            yf4 yf4VarC = aVarF.L(60L, timeUnit).O(60L, timeUnit).a(hz0.a.e()).c();
            if (b == null) {
                b = (RepCOAInterface) new Retrofit.Builder().baseUrl(s14.a.m()).addConverterFactory(GsonConverterFactory.create()).client(yf4VarC).build().create(RepCOAInterface.class);
            }
            RepCOAInterface repCOAInterface = b;
            Intrinsics.checkNotNull(repCOAInterface);
            return repCOAInterface;
        }
    }

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    Call<SecurityModle> repCOAInterface(@Body lc5 request, @Header("timestamp") String timestamp);
}
