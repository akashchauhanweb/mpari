package com.nic.mparivahan.Welcome;

import com.nic.mparivahan.Welcome.Model.NapixTokenModel;
import com.zepto.hz0;
import com.zepto.s14;
import com.zepto.yf4;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J6\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J6\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'¨\u0006\r"}, d2 = {"Lcom/nic/mparivahan/Welcome/NapixService;", "", "", "grant_type", "scope", "client_id", "client_secret", "Lretrofit2/Call;", "Lcom/nic/mparivahan/Welcome/Model/NapixTokenModel;", "getToken", "getChallNapix", "getSarathiToken", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public interface NapixService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.nic.mparivahan.Welcome.NapixService$a, reason: from kotlin metadata */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        public static NapixService b;

        public final NapixService a() {
            yf4.a aVar = new yf4.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            yf4.a aVarO = aVar.f(30L, timeUnit).L(30L, timeUnit).O(30L, timeUnit);
            hz0.a aVar2 = hz0.a;
            yf4 yf4VarC = aVarO.a(aVar2.e()).e(aVar2.s()).c();
            if (b == null) {
                b = (NapixService) new Retrofit.Builder().baseUrl(s14.a.k()).addConverterFactory(GsonConverterFactory.create()).client(yf4VarC).build().create(NapixService.class);
            }
            NapixService napixService = b;
            Intrinsics.checkNotNull(napixService);
            return napixService;
        }
    }

    @FormUrlEncoded
    @POST("nic/parivahan/oauth2/token")
    Call<NapixTokenModel> getChallNapix(@Field("grant_type") String grant_type, @Field("scope") String scope, @Field("client_id") String client_id, @Field("client_secret") String client_secret);

    @FormUrlEncoded
    @POST("nic/parivahan/oauth2/token")
    Call<NapixTokenModel> getSarathiToken(@Field("grant_type") String grant_type, @Field("scope") String scope, @Field("client_id") String client_id, @Field("client_secret") String client_secret);

    @FormUrlEncoded
    @POST("nic/parivahan/oauth2/token")
    Call<NapixTokenModel> getToken(@Field("grant_type") String grant_type, @Field("scope") String scope, @Field("client_id") String client_id, @Field("client_secret") String client_secret);
}
