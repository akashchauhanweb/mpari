package com.nic.mparivahan.FetchVahanLog.Staging;

import com.nic.mparivahan.FetchVahanLog.Pojo.DltVhnTransaction;
import com.zepto.hz0;
import com.zepto.lc5;
import com.zepto.s14;
import com.zepto.yf4;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¨\u0006\n"}, d2 = {"Lcom/nic/mparivahan/FetchVahanLog/Staging/VahanInterfaceStaging;", "", "Lcom/zepto/lc5;", "request", "Lretrofit2/Call;", "Lcom/nic/mparivahan/FetchVahanLog/Pojo/DltVhnTransaction;", "dltVahanTransactionStag", "dltSarthiTransactionStag", "dltChallanTransactionStag", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public interface VahanInterfaceStaging {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.nic.mparivahan.FetchVahanLog.Staging.VahanInterfaceStaging$a, reason: from kotlin metadata */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        public static VahanInterfaceStaging b;
        public static yf4 c;

        static {
            yf4.a aVarF = new yf4.a().f(2L, TimeUnit.MINUTES);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            c = aVarF.L(60L, timeUnit).O(60L, timeUnit).a(hz0.a.e()).c();
        }

        public final VahanInterfaceStaging a() {
            if (b == null) {
                b = (VahanInterfaceStaging) new Retrofit.Builder().baseUrl(s14.a.t()).addConverterFactory(GsonConverterFactory.create()).client(c).build().create(VahanInterfaceStaging.class);
            }
            VahanInterfaceStaging vahanInterfaceStaging = b;
            Intrinsics.checkNotNull(vahanInterfaceStaging);
            return vahanInterfaceStaging;
        }
    }

    @Headers({"Content-Type: application/json"})
    @POST("manageEchallanLogStatus/v1.0")
    Call<DltVhnTransaction> dltChallanTransactionStag(@Body lc5 request);

    @Headers({"Content-Type: application/json"})
    @POST("manageSarathiLogStatus/v1.0")
    Call<DltVhnTransaction> dltSarthiTransactionStag(@Body lc5 request);

    @Headers({"Content-Type: application/json"})
    @POST("manageVahanLogStatus/v1.0")
    Call<DltVhnTransaction> dltVahanTransactionStag(@Body lc5 request);
}
