package com.nic.mparivahan.dlservices.ui.slots;

import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.dlservices.ui.slots.model.SlotsDetRequest;
import com.nic.mparivahan.dlservices.ui.slots.model.SlotsInstRequest;
import com.nic.mparivahan.dlservices.ui.slots.model.SlotsRequest;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0002\u0010\bJ%\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0002\u0010\bJ%\u0010\n\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0002\u0010\bJ%\u0010\u000b\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\f2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0002\u0010\rJ%\u0010\u000e\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\f2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0002\u0010\rJ%\u0010\u000f\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00102\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J%\u0010\u0012\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00102\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/slots/DlSlotsService;", "", "getAcknowDetails", "Lcom/nic/mparivahan/Security/SecModle/SecurityModle;", "params", "Lcom/nic/mparivahan/dlservices/ui/slots/model/SlotsRequest;", "timestamp", "", "(Lcom/nic/mparivahan/dlservices/ui/slots/model/SlotsRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getApplDtDetSlots", "getLlDetSlots", "getLlSlotDet", "Lcom/nic/mparivahan/dlservices/ui/slots/model/SlotsDetRequest;", "(Lcom/nic/mparivahan/dlservices/ui/slots/model/SlotsDetRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSlotDet", "insLlSlotDet", "Lcom/nic/mparivahan/dlservices/ui/slots/model/SlotsInstRequest;", "(Lcom/nic/mparivahan/dlservices/ui/slots/model/SlotsInstRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insSlotDet", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface DlSlotsService {
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/slots/rsServices/SlotAckmntServ/dltprovnlreceipt")
    Object getAcknowDetails(@Body SlotsRequest slotsRequest, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/slots/rsServices/ApplcntDetails/getApplDtDet")
    Object getApplDtDetSlots(@Body SlotsRequest slotsRequest, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/slots/rsServices/ApplcntDetails/getApplDet")
    Object getLlDetSlots(@Body SlotsRequest slotsRequest, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/slots/rsServices/FetchSlotDet/getSltDet")
    Object getLlSlotDet(@Body SlotsDetRequest slotsDetRequest, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/slots/rsServices/FetchDTSlotDetails/getSlotDet")
    Object getSlotDet(@Body SlotsDetRequest slotsDetRequest, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/slots/rsServices/SaveSlotDetServ/insSltDet")
    Object insLlSlotDet(@Body SlotsInstRequest slotsInstRequest, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/slots/rsServices/SaveDTSlotDetServ/insSltDet")
    Object insSlotDet(@Body SlotsInstRequest slotsInstRequest, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);
}
