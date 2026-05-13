package com.nic.mparivahan.dlservices.ui.acknow;

import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.dlservices.data.model.DlStatusDoc;
import com.nic.mparivahan.dlservices.data.model.DlStatusDocResponse;
import com.nic.mparivahan.dlservices.data.model.DlStatusRequest;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0002\u0010\bJ%\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u001b\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0004\u001a\u00020\u000eH§@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/acknow/DlApplStatusService;", "", "getApplicationStatus", "Lcom/nic/mparivahan/Security/SecModle/SecurityModle;", "params", "Lcom/nic/mparivahan/dlservices/ui/acknow/DlApplStatusRequest;", "timestamp", "", "(Lcom/nic/mparivahan/dlservices/ui/acknow/DlApplStatusRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDlStatus", "Lcom/nic/mparivahan/dlservices/data/model/DlStatusRequest;", "(Lcom/nic/mparivahan/dlservices/data/model/DlStatusRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDlStatusDoc", "Lcom/nic/mparivahan/dlservices/data/model/DlStatusDocResponse;", "Lcom/nic/mparivahan/dlservices/data/model/DlStatusDoc;", "(Lcom/nic/mparivahan/dlservices/data/model/DlStatusDoc;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface DlApplStatusService {
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/applDetails/uploadMicro/getApplicationInfo")
    Object getApplicationStatus(@Body DlApplStatusRequest dlApplStatusRequest, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/applicationStatus/applStatus")
    Object getDlStatus(@Body DlStatusRequest dlStatusRequest, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("/application/api/uploadMicro/validateAppl/v1")
    Object getDlStatusDoc(@Body DlStatusDoc dlStatusDoc, Continuation<? super DlStatusDocResponse> continuation);
}
