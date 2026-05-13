package com.nic.mparivahan.DLServicesAuth.Forms;

import android.content.Context;
import com.zepto.hz0;
import com.zepto.yf4;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¨\u0006\u000b"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/Forms/FormsInterface;", "", "", "apl", "db", "Lretrofit2/Call;", "Lcom/nic/mparivahan/DLServicesAuth/Forms/FormsPojo;", "getForm2Data", "getForm1AData", "getForm1Data", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public interface FormsInterface {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.nic.mparivahan.DLServicesAuth.Forms.FormsInterface$a, reason: from kotlin metadata */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        public static FormsInterface b;

        public final FormsInterface a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (b == null) {
                yf4.a aVarF = new yf4.a().f(2L, TimeUnit.MINUTES);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                b = (FormsInterface) new Retrofit.Builder().baseUrl("https://sarathi.parivahan.gov.in/").addConverterFactory(GsonConverterFactory.create()).client(aVarF.L(60L, timeUnit).O(60L, timeUnit).a(hz0.a.e()).c()).build().create(FormsInterface.class);
            }
            FormsInterface formsInterface = b;
            Intrinsics.checkNotNull(formsInterface);
            return formsInterface;
        }
    }

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathiservice/rsServices/ServiceOnPrint/getForm1AData/{apl}/{db}")
    Call<FormsPojo> getForm1AData(@Path("apl") String apl, @Path("db") String db);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathiservice/rsServices/ServiceOnPrint/getForm1Data/{apl}/{db}")
    Call<FormsPojo> getForm1Data(@Path("apl") String apl, @Path("db") String db);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathiservice/rsServices/ServiceOnPrint/getForm2Data/{apl}/{db}")
    Call<FormsPojo> getForm2Data(@Path("apl") String apl, @Path("db") String db);
}
