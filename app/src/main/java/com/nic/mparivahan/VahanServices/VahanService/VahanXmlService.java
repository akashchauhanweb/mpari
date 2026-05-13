package com.nic.mparivahan.VahanServices.VahanService;

import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.DmsUrlModle;
import com.zepto.yf4;
import com.zepto.zr2;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'¨\u0006\u000b"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanService/VahanXmlService;", "", "", "state_code", "appl_no", "rc_no", VContant.PURPOSE_CODE, "Lretrofit2/Call;", "Lcom/nic/mparivahan/VahanServices/VahanModel/DmsUrlModle;", "getDmsUrl", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public interface VahanXmlService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.nic.mparivahan.VahanServices.VahanService.VahanXmlService$a, reason: from kotlin metadata */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        public static zr2 b = new zr2(null, 1, 0 == true ? 1 : 0).d(zr2.a.BODY);
        public static yf4 c;
        public static VahanXmlService d;

        static {
            yf4.a aVar = new yf4.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            c = aVar.f(15L, timeUnit).L(15L, timeUnit).O(15L, timeUnit).a(b).c();
        }

        public final VahanXmlService a() {
            if (d == null) {
                d = (VahanXmlService) new Retrofit.Builder().baseUrl("").addConverterFactory(GsonConverterFactory.create()).client(c).build().create(VahanXmlService.class);
            }
            VahanXmlService vahanXmlService = d;
            Intrinsics.checkNotNull(vahanXmlService);
            return vahanXmlService;
        }
    }

    @GET("vahancapi-common/api/perparedocument/{state_code}/{appl_no}/{rc_no}/{purpose_code}")
    Call<DmsUrlModle> getDmsUrl(@Path("state_code") String state_code, @Path("appl_no") String appl_no, @Path("rc_no") String rc_no, @Path(VContant.PURPOSE_CODE) String purpose_code);
}
