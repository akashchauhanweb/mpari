package com.nic.mparivahan.dlservices.data.network;

import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.dlservices.data.model.DlPhotoStatusFinalReqeust;
import com.nic.mparivahan.dlservices.data.model.DlRenewalInsertDocUpload;
import com.nic.mparivahan.dlservices.data.model.DlRenewalUploadDocFlow;
import com.nic.mparivahan.dlservices.data.model.UploadPhotoSignReqeust;
import com.nic.mparivahan.dlservices.data.model.temp.UploadDocListResponse;
import com.nic.mparivahan.dlservices.ui.dms.GetCustomRequest;
import com.nic.mparivahan.dlservices.ui.dms.GetDocProofRequest;
import com.nic.mparivahan.dlservices.ui.dms.GetDocRequest;
import com.nic.mparivahan.dlservices.ui.dms.GetDocRequestStaging;
import com.nic.mparivahan.dlservices.ui.dms.uploadmodel.DocUploadRequest;
import com.zepto.lc5;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J'\u0010\u0006\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0006\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u000eJ'\u0010\u0010\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u000f2\b\b\u0001\u0010\n\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0013\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00122\b\b\u0001\u0010\n\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00152\b\b\u0001\u0010\n\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00182\b\b\u0001\u0010\n\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001c\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u001b2\b\b\u0001\u0010\n\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001f\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u001e2\b\b\u0001\u0010\n\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u001e2\b\b\u0001\u0010\n\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b!\u0010 J'\u0010#\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\"2\b\b\u0001\u0010\n\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/network/DlRenewalServicesStatus;", "", "Lcom/zepto/lc5;", "request", "Lretrofit2/Call;", "Lcom/nic/mparivahan/dlservices/data/model/temp/UploadDocListResponse;", "getDlUploadDoc", "Lcom/nic/mparivahan/dlservices/ui/dms/GetDocRequestStaging;", "params", "", "timestamp", "Lcom/nic/mparivahan/Security/SecModle/SecurityModle;", "(Lcom/nic/mparivahan/dlservices/ui/dms/GetDocRequestStaging;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/nic/mparivahan/dlservices/ui/dms/GetDocRequest;", "(Lcom/nic/mparivahan/dlservices/ui/dms/GetDocRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/nic/mparivahan/dlservices/ui/dms/GetDocProofRequest;", "getDlListOfDoc", "(Lcom/nic/mparivahan/dlservices/ui/dms/GetDocProofRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/nic/mparivahan/dlservices/ui/dms/GetCustomRequest;", "getDlCustomUploadDoc", "(Lcom/nic/mparivahan/dlservices/ui/dms/GetCustomRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/nic/mparivahan/dlservices/data/model/DlRenewalInsertDocUpload;", "getDlInsertedUploadDoc", "(Lcom/nic/mparivahan/dlservices/data/model/DlRenewalInsertDocUpload;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/nic/mparivahan/dlservices/ui/dms/uploadmodel/DocUploadRequest;", "uploadDlDocuments", "(Lcom/nic/mparivahan/dlservices/ui/dms/uploadmodel/DocUploadRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/nic/mparivahan/dlservices/data/model/DlRenewalUploadDocFlow;", "uploadDlDocFlow", "(Lcom/nic/mparivahan/dlservices/data/model/DlRenewalUploadDocFlow;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/nic/mparivahan/dlservices/data/model/DlPhotoStatusFinalReqeust;", "getDlUploadPhotoSign", "(Lcom/nic/mparivahan/dlservices/data/model/DlPhotoStatusFinalReqeust;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDlStatusPhotoSign", "Lcom/nic/mparivahan/dlservices/data/model/UploadPhotoSignReqeust;", "uploadDlPhotoSign", "(Lcom/nic/mparivahan/dlservices/data/model/UploadPhotoSignReqeust;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {1, 9, 0})
public interface DlRenewalServicesStatus {
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/dmsRules/insertDoc/getCustomDocList")
    Object getDlCustomUploadDoc(@Body GetCustomRequest getCustomRequest, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/dmsRules/insertDoc/getInsertedDocs")
    Object getDlInsertedUploadDoc(@Body DlRenewalInsertDocUpload dlRenewalInsertDocUpload, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/dmsRules/ruleservices/getProofList")
    Object getDlListOfDoc(@Body GetDocProofRequest getDocProofRequest, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiservice/rsServices/uploadingPhotoAndSignature/getDetails")
    Object getDlStatusPhotoSign(@Body DlPhotoStatusFinalReqeust dlPhotoStatusFinalReqeust, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/dmsRules/ruleservices/documents")
    Object getDlUploadDoc(@Body GetDocRequest getDocRequest, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/dmsRules/ruleservices/documents")
    Object getDlUploadDoc(@Body GetDocRequestStaging getDocRequestStaging, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathiWS/rsServices/ServicesOnDL/getAckDetForGivenDLNumber")
    Call<UploadDocListResponse> getDlUploadDoc(@Body lc5 request);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiservice/rsServices/uploadingPhotoAndSignature/getImage")
    Object getDlUploadPhotoSign(@Body DlPhotoStatusFinalReqeust dlPhotoStatusFinalReqeust, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/applDetails/uploadMicro/updateUploadFlow")
    Object uploadDlDocFlow(@Body DlRenewalUploadDocFlow dlRenewalUploadDocFlow, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/dmsRules/insertDoc/manageDocs")
    Object uploadDlDocuments(@Body DocUploadRequest docUploadRequest, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/uploadingPhotoAndSignature/saveBiomtrics")
    Object uploadDlPhotoSign(@Body UploadPhotoSignReqeust uploadPhotoSignReqeust, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);
}
