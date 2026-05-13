package com.nic.mparivahan.VahanServices.VahanService;

import android.content.Context;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyModel.FancyRto;
import com.zepto.hz0;
import com.zepto.i22;
import com.zepto.lc5;
import com.zepto.nd5;
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
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000 62\u00020\u0001:\u00017J,\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0004H'J,\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J\u0018\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00072\b\b\u0001\u0010.\u001a\u00020\u0002H'J,\u00101\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u00102\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u00103\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u00104\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'J,\u00105\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'¨\u00068"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationService;", "", "version", "Lcom/zepto/lc5;", "request", "timestamp", "Lretrofit2/Call;", "Lcom/nic/mparivahan/Security/SecModle/SecurityModle;", "getallowedservices", "getStateMasterList", "getdistict", "sendChangeOfAddress", "getFeesDetails", "getBeforPaymentUrl", "requestHptService", "gethptDetails", "getReson", "requestForduplicateRc", "body", "Lcom/zepto/nd5;", "doAadhaarRequest", "getSlotAppointmentByDate", "getCounterIdForSlot", "saveSlotAppointmentDetails", "afterPayment", "getOwnerDetails", "getNocReasonData", "getRtoNameForNoc", "checkPaymentStatusForSlot", "submitRequestForNocDraft", "submitFinalRequest", "checkStateCoustomization", "checkSlotEligibility", "getAadMobCheck", "getAadharFacelessAppCheck", "getValidateregandchasino", "getFormDetails", "requestForBefoPayment", "getStateCode", "getRcValues", "checkhold", "validateAadhaar", "eSign", "downloadNoc", "getclassDes", "url", "Lcom/nic/mparivahan/VahanServices/FancyServices/AvailableFancyModel/FancyRto;", "getRtoNameForFancy", "getMobileNoFromVehicle", "getAadMobCheckV1", "vahanGenerateOtp", "vahanVerifyOtp", "checkStateCoustomPermit", "b", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public interface VahanProService extends ApplicationService {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.nic.mparivahan.VahanServices.VahanService.VahanProService$a, reason: from kotlin metadata */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        public static VahanProService b;

        public final VahanProService a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            zr2 zr2VarD = new zr2(null, 1, null).d(zr2.a.BODY);
            yf4.a aVarA = new yf4.a().a(new i22(context)).a(new tz(context));
            TimeUnit timeUnit = TimeUnit.SECONDS;
            yf4 yf4VarC = aVarA.f(40L, timeUnit).L(40L, timeUnit).O(40L, timeUnit).a(zr2VarD).e(hz0.a.s()).c();
            if (b == null) {
                b = (VahanProService) new Retrofit.Builder().baseUrl(s14.a.o()).addConverterFactory(GsonConverterFactory.create()).client(yf4VarC).build().create(VahanProService.class);
            }
            VahanProService vahanProService = b;
            Intrinsics.checkNotNull(vahanProService);
            return vahanProService;
        }
    }

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/common/afterpayment{version}")
    Call<SecurityModle> afterPayment(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/bookappointment/checkSucessfulPaymentorNot{version}")
    Call<SecurityModle> checkPaymentStatusForSlot(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/bookappointment/getuserdetailsdobjdata{version}")
    Call<SecurityModle> checkSlotEligibility(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/masterConfig/fillpermittmonlinestateconfiguration{version}")
    Call<SecurityModle> checkStateCoustomPermit(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/masterconfig/fillvmonlineconfigurationdata{version}")
    Call<SecurityModle> checkStateCoustomization(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/common/checkhold{version}")
    Call<SecurityModle> checkhold(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/xml"})
    @POST("VahanAadhaarService/aadhaar/authekyc/generateResponse")
    Call<nd5> doAadhaarRequest(@Body lc5 body);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/common/getNOCCertificate{version}")
    Call<SecurityModle> downloadNoc(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/esign/getEsignUrl{version}")
    Call<SecurityModle> eSign(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/masterconfig/fillvmonlineservicechecksdata{version}")
    Call<SecurityModle> getAadMobCheck(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/masterconfig/authmodeservicecheck{version}")
    Call<SecurityModle> getAadMobCheckV1(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/masterconfig/fillvmauthenticationdata{version}")
    Call<SecurityModle> getAadharFacelessAppCheck(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/common/beforepayment{version}")
    Call<SecurityModle> getBeforPaymentUrl(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/bookappointment/getcounterbyservicesalloted{version}")
    Call<SecurityModle> getCounterIdForSlot(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/common/getfeedetails{version}")
    Call<SecurityModle> getFeesDetails(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/common/getprefilledforms{version}")
    Call<SecurityModle> getFormDetails(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/updatemobile/fetchMobileNo{version}")
    Call<SecurityModle> getMobileNoFromVehicle(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/noccancel/fillvmnocreasondata{version}")
    Call<SecurityModle> getNocReasonData(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/updatemobile/getMobileNo{version}")
    Call<SecurityModle> getOwnerDetails(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/common/getv1ownerDetailsInurancePuccPermit{version}")
    Call<SecurityModle> getRcValues(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/common/getdupreason{version}")
    Call<SecurityModle> getReson(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @GET
    Call<FancyRto> getRtoNameForFancy(@Url String url);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/common/getOfficeListByStateCode{version}")
    Call<SecurityModle> getRtoNameForNoc(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/bookappointment/getavailabledataforbookappt{version}")
    Call<SecurityModle> getSlotAppointmentByDate(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/masterconfig/getstate_cdOffcd{version}")
    Call<SecurityModle> getStateCode(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/common/getstates{version}")
    Call<SecurityModle> getStateMasterList(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/common/rtoservicecheck{version}")
    Call<SecurityModle> getValidateregandchasino(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/masterconfig/getallowedservicesbyregnno{version}")
    Call<SecurityModle> getallowedservices(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/updatemobile/getclassanddescription{version}")
    Call<SecurityModle> getclassDes(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/common/getdistrictlistbyStateCode{version}")
    Call<SecurityModle> getdistict(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/hpt/gethptdetails{version}")
    Call<SecurityModle> gethptDetails(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/masterconfig/getdatafrofinlsubmit{version}")
    Call<SecurityModle> requestForBefoPayment(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/common/duprcappl{version}")
    Call<SecurityModle> requestForduplicateRc(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/hpt/hptdraft{version}")
    Call<SecurityModle> requestHptService(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/bookappointment/savebookapptdetails{version}")
    Call<SecurityModle> saveSlotAppointmentDetails(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/coa/coadraft{version}")
    Call<SecurityModle> sendChangeOfAddress(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/common/finalsubmitduprc{version}")
    Call<SecurityModle> submitFinalRequest(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/noc/savenocdraft{version}")
    Call<SecurityModle> submitRequestForNocDraft(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/common/generatenewOtp{version}")
    Call<SecurityModle> vahanGenerateOtp(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/common/verifynewOtp{version}")
    Call<SecurityModle> vahanVerifyOtp(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("vahan/vahancapi/common/validateaadhaardatabyregno{version}")
    Call<SecurityModle> validateAadhaar(@Path(encoded = true, value = "version") String version, @Body lc5 request, @Header("timestamp") String timestamp);
}
