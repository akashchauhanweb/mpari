package com.nic.mparivahan.dlservices.ui.dobChange.Service;

import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.dlservices.ui.dobChange.Repository.ChangeDobRequest;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/dobChange/Service/DobChangesService;", "", "changeDobForGivenDLNumber", "Lcom/nic/mparivahan/Security/SecModle/SecurityModle;", "params", "Lcom/nic/mparivahan/dlservices/ui/dobChange/Repository/ChangeDobRequest;", "timestamp", "", "(Lcom/nic/mparivahan/dlservices/ui/dobChange/Repository/ChangeDobRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface DobChangesService {
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    Object changeDobForGivenDLNumber(@Body ChangeDobRequest changeDobRequest, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);
}
