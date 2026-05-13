package com.nic.mparivahan.VahanServices.AadharFaceVerification;

import com.zepto.lc5;
import com.zepto.nd5;
import kotlin.Metadata;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¨\u0006\u0007"}, d2 = {"Lcom/nic/mparivahan/VahanServices/AadharFaceVerification/AadharFaceApiInterface;", "", "Lcom/zepto/lc5;", "body", "Lretrofit2/Call;", "Lcom/zepto/nd5;", "doGetResponse", "app_release"}, k = 1, mv = {1, 9, 0})
public interface AadharFaceApiInterface {
    @Headers({"Content-Type: application/xml"})
    @POST("VahanAadhaarServiceFace/aadhaarFace/authekycface/generateResponse")
    Call<nd5> doGetResponse(@Body lc5 body);
}
