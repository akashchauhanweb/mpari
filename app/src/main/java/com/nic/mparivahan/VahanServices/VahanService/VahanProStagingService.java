package com.nic.mparivahan.VahanServices.VahanService;

import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.lc5;
import kotlin.Metadata;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¨\u0006\t"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanService/VahanProStagingService;", "", "Lcom/zepto/lc5;", "request", "", "timestamp", "Lretrofit2/Call;", "Lcom/nic/mparivahan/Security/SecModle/SecurityModle;", "getValidateregandchasino", "app_release"}, k = 1, mv = {1, 9, 0})
public interface VahanProStagingService {
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/common/validateregandchasino")
    Call<SecurityModle> getValidateregandchasino(@Body lc5 request, @Header("timestamp") String timestamp);
}
