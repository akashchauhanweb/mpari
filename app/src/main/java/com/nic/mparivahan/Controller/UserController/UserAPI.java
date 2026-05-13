package com.nic.mparivahan.Controller.UserController;

import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.lc5;
import kotlin.Metadata;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J,\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'¨\u0006\u000f"}, d2 = {"Lcom/nic/mparivahan/Controller/UserController/UserAPI;", "", "", "url", "Lcom/zepto/lc5;", "request", "timestamp", "Lretrofit2/Call;", "Lcom/nic/mparivahan/Security/SecModle/SecurityModle;", "getBloodDetails", "saveProfileDetails", "updateCitizenProfile", "getCitizenProfile", "uploadProfileImg", "fetchProfileImg", "app_release"}, k = 1, mv = {1, 9, 0})
public interface UserAPI {
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("service/fetchCitizenImage")
    Call<SecurityModle> fetchProfileImg(@Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
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
    @POST("service/uploadCitizenImage")
    Call<SecurityModle> uploadProfileImg(@Body lc5 request, @Header("timestamp") String timestamp);
}
