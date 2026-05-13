package com.nic.mparivahan.dlservices.data.network;

import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.dlservices.data.RenewalServicesFiles.DuplicateDlGenReq;
import com.nic.mparivahan.dlservices.data.RenewalServicesFiles.RenewalCOAGenReq;
import com.nic.mparivahan.dlservices.data.RenewalServicesFilesCoa.DuplicateDlCoaReq;
import com.nic.mparivahan.dlservices.data.RenewalServicesFilesCoa.RenewalCOAReq;
import com.nic.mparivahan.dlservices.data.RenewalServicesFilesCoa.ReplaceDlCoaReq;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.DuplicateDlRequest;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetReasonsTransWiseRequest;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.ReplacementDlRequest;
import com.nic.mparivahan.dlservices.data.model.idp.GetNatVisaIssbleForNatCodeRequest;
import com.nic.mparivahan.dlservices.data.model.idp.GetNatVisaIssbleForNatCodeResponse;
import com.nic.mparivahan.dlservices.data.model.idp.IdpRequestGetNations;
import com.nic.mparivahan.dlservices.data.model.mobupdate.DlGetMobileRequest;
import com.nic.mparivahan.dlservices.data.model.mobupdate.DlUpdateMobileRequest;
import com.nic.mparivahan.dlservices.data.model.savelog.SaveLogReq;
import com.nic.mparivahan.dlservices.data.model.savelog.SaveLogResponse;
import com.nic.mparivahan.dlservices.data.repo.hillpackage.HillRequest;
import com.nic.mparivahan.dlservices.ui.changeName.ChangeOfNameRequest;
import com.nic.mparivahan.dlservices.ui.dlextract.DlExRequest;
import com.nic.mparivahan.dlservices.ui.dlextract.NonSarathi.DlExRequestGen;
import com.zepto.ia5;
import com.zepto.lc5;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u000f2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0013\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00122\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00152\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0003\u001a\u00020\u0018H§@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00152\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0017J'\u0010\u001f\u001a\u00020\u00062\b\b\u0001\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J'\u0010\"\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020!2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J'\u0010%\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020$2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u001d\u0010)\u001a\u00020(2\b\b\u0001\u0010\u0003\u001a\u00020'H§@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001d\u0010+\u001a\u00020(2\b\b\u0001\u0010\u0003\u001a\u00020'H§@ø\u0001\u0000¢\u0006\u0004\b+\u0010*J'\u0010-\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020,2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b-\u0010.J'\u00100\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020/2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b0\u00101J'\u00103\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u0002022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b3\u00104J'\u00103\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u0002052\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b3\u00106J'\u00103\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u0002072\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b3\u00108J'\u00103\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u0002092\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b3\u0010:J'\u00103\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020;2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b3\u0010<J'\u00103\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020=2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b3\u0010>J'\u00103\u001a\u00020\u00062\b\b\u0001\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b3\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006?"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/network/DlExtraService;", "", "Lcom/nic/mparivahan/dlservices/data/model/duplicatedl/GetReasonsTransWiseRequest;", "params", "", "timestamp", "Lcom/nic/mparivahan/Security/SecModle/SecurityModle;", "getReasonsTransWise", "(Lcom/nic/mparivahan/dlservices/data/model/duplicatedl/GetReasonsTransWiseRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/nic/mparivahan/dlservices/data/model/duplicatedl/DuplicateDlRequest;", "getAckDetForGivenDLNumber", "(Lcom/nic/mparivahan/dlservices/data/model/duplicatedl/DuplicateDlRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/nic/mparivahan/dlservices/data/model/duplicatedl/ReplacementDlRequest;", "getAckDetForGivenDLNumberReplacment", "(Lcom/nic/mparivahan/dlservices/data/model/duplicatedl/ReplacementDlRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/nic/mparivahan/dlservices/ui/dlextract/DlExRequest;", "getAckDlExtract", "(Lcom/nic/mparivahan/dlservices/ui/dlextract/DlExRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/nic/mparivahan/dlservices/ui/dlextract/NonSarathi/DlExRequestGen;", "getAckDlExtractGen", "(Lcom/nic/mparivahan/dlservices/ui/dlextract/NonSarathi/DlExRequestGen;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/nic/mparivahan/dlservices/data/model/idp/IdpRequestGetNations;", "getNationsToApplyFor", "(Lcom/nic/mparivahan/dlservices/data/model/idp/IdpRequestGetNations;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/nic/mparivahan/dlservices/data/model/idp/GetNatVisaIssbleForNatCodeRequest;", "Lcom/nic/mparivahan/dlservices/data/model/idp/GetNatVisaIssbleForNatCodeResponse;", "getNatVisaIssbleForNatCode", "(Lcom/nic/mparivahan/dlservices/data/model/idp/GetNatVisaIssbleForNatCodeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getIdpCovGrades", "Lcom/zepto/lc5;", "request", "getAckDetForGivenDLNumberIdp", "(Lcom/zepto/lc5;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/nic/mparivahan/dlservices/data/model/mobupdate/DlGetMobileRequest;", "getMobileDetails", "(Lcom/nic/mparivahan/dlservices/data/model/mobupdate/DlGetMobileRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/nic/mparivahan/dlservices/data/model/mobupdate/DlUpdateMobileRequest;", "getUpdateMobile", "(Lcom/nic/mparivahan/dlservices/data/model/mobupdate/DlUpdateMobileRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/nic/mparivahan/dlservices/data/model/savelog/SaveLogReq;", "Lcom/nic/mparivahan/dlservices/data/model/savelog/SaveLogResponse;", "saveLogRequest", "(Lcom/nic/mparivahan/dlservices/data/model/savelog/SaveLogReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateLogRequest", "Lcom/nic/mparivahan/dlservices/data/repo/hillpackage/HillRequest;", "hillRequest", "(Lcom/nic/mparivahan/dlservices/data/repo/hillpackage/HillRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/nic/mparivahan/dlservices/ui/changeName/ChangeOfNameRequest;", "nameRequest", "(Lcom/nic/mparivahan/dlservices/ui/changeName/ChangeOfNameRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/nic/mparivahan/dlservices/data/RenewalServicesFilesCoa/RenewalCOAReq;", "getAckDetForGivenDLNumberRenewal", "(Lcom/nic/mparivahan/dlservices/data/RenewalServicesFilesCoa/RenewalCOAReq;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/nic/mparivahan/dlservices/data/RenewalServicesFiles/RenewalCOAGenReq;", "(Lcom/nic/mparivahan/dlservices/data/RenewalServicesFiles/RenewalCOAGenReq;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/nic/mparivahan/dlservices/data/RenewalServicesFiles/DuplicateDlGenReq;", "(Lcom/nic/mparivahan/dlservices/data/RenewalServicesFiles/DuplicateDlGenReq;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/nic/mparivahan/dlservices/data/RenewalServicesFilesCoa/DuplicateDlCoaReq;", "(Lcom/nic/mparivahan/dlservices/data/RenewalServicesFilesCoa/DuplicateDlCoaReq;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zepto/ia5;", "(Lcom/zepto/ia5;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/nic/mparivahan/dlservices/data/RenewalServicesFilesCoa/ReplaceDlCoaReq;", "(Lcom/nic/mparivahan/dlservices/data/RenewalServicesFilesCoa/ReplaceDlCoaReq;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {1, 9, 0})
public interface DlExtraService {
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    Object getAckDetForGivenDLNumber(@Body DuplicateDlRequest duplicateDlRequest, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    Object getAckDetForGivenDLNumberIdp(@Body lc5 lc5Var, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    Object getAckDetForGivenDLNumberRenewal(@Body DuplicateDlGenReq duplicateDlGenReq, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    Object getAckDetForGivenDLNumberRenewal(@Body RenewalCOAGenReq renewalCOAGenReq, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    Object getAckDetForGivenDLNumberRenewal(@Body DuplicateDlCoaReq duplicateDlCoaReq, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    Object getAckDetForGivenDLNumberRenewal(@Body RenewalCOAReq renewalCOAReq, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    Object getAckDetForGivenDLNumberRenewal(@Body ReplaceDlCoaReq replaceDlCoaReq, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    Object getAckDetForGivenDLNumberRenewal(@Body ia5 ia5Var, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    Object getAckDetForGivenDLNumberRenewal(@Body lc5 lc5Var, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    Object getAckDetForGivenDLNumberReplacment(@Body ReplacementDlRequest replacementDlRequest, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    Object getAckDlExtract(@Body DlExRequest dlExRequest, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    Object getAckDlExtractGen(@Body DlExRequestGen dlExRequestGen, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/ServicesOnDL/getIdpCovGrades")
    Object getIdpCovGrades(@Body IdpRequestGetNations idpRequestGetNations, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/ServiceOnMobNoUpd/getMobileNumUpd")
    Object getMobileDetails(@Body DlGetMobileRequest dlGetMobileRequest, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("/sarathiWS/rsServices/ServicesOnDL/getNatVisaIssbleForNatCode")
    Object getNatVisaIssbleForNatCode(@Body GetNatVisaIssbleForNatCodeRequest getNatVisaIssbleForNatCodeRequest, Continuation<? super GetNatVisaIssbleForNatCodeResponse> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/ServicesOnDL/getNationsToApplyFor")
    Object getNationsToApplyFor(@Body IdpRequestGetNations idpRequestGetNations, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/ServicesOnDL/getReasonsTransWise")
    Object getReasonsTransWise(@Body GetReasonsTransWiseRequest getReasonsTransWiseRequest, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/ServiceOnMobNoUpd/updateMobileNumber")
    Object getUpdateMobile(@Body DlUpdateMobileRequest dlUpdateMobileRequest, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    Object hillRequest(@Body HillRequest hillRequest, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    Object nameRequest(@Body ChangeOfNameRequest changeOfNameRequest, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("audit/apis/saveSarathiLogDetails/v1.0")
    Object saveLogRequest(@Body SaveLogReq saveLogReq, Continuation<? super SaveLogResponse> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("")
    Object updateLogRequest(@Body SaveLogReq saveLogReq, Continuation<? super SaveLogResponse> continuation);
}
