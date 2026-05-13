package com.nic.mparivahan.dlservices.data.network;

import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.dlservices.data.model.DlDist;
import com.nic.mparivahan.dlservices.data.model.DlImageVerification;
import com.nic.mparivahan.dlservices.data.model.DlLastRtoRequest;
import com.nic.mparivahan.dlservices.data.model.DlPhotoStatusResponse;
import com.nic.mparivahan.dlservices.data.model.DlRto;
import com.nic.mparivahan.dlservices.data.model.DlState;
import com.nic.mparivahan.dlservices.data.model.DlStatusResponse;
import com.nic.mparivahan.dlservices.data.model.DlTaluka;
import com.nic.mparivahan.dlservices.data.model.DlVillageOrTown;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0002\u0010\bJ%\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\rJ%\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0010H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J%\u0010\u0012\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0013H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J%\u0010\u0015\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0002\u0010\bJ%\u0010\u0016\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\u00172\b\b\u0001\u0010\f\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J%\u0010\u0019\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\u001a2\b\b\u0001\u0010\f\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ%\u0010\u001c\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\u001d2\b\b\u0001\u0010\f\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcom/nic/mparivahan/dlservices/data/network/DlOtherService;", "", "getCustomState", "Lcom/nic/mparivahan/dlservices/data/model/DlStatusResponse;", "url", "", "params", "Lcom/nic/mparivahan/dlservices/data/model/DlRto;", "(Ljava/lang/String;Lcom/nic/mparivahan/dlservices/data/model/DlRto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDistricts", "Lcom/nic/mparivahan/Security/SecModle/SecurityModle;", "Lcom/nic/mparivahan/dlservices/data/model/DlDist;", "timestamp", "(Lcom/nic/mparivahan/dlservices/data/model/DlDist;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getImageVerification", "Lcom/nic/mparivahan/dlservices/data/model/DlPhotoStatusResponse;", "Lcom/nic/mparivahan/dlservices/data/model/DlImageVerification;", "(Ljava/lang/String;Lcom/nic/mparivahan/dlservices/data/model/DlImageVerification;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastRto", "Lcom/nic/mparivahan/dlservices/data/model/DlLastRtoRequest;", "(Ljava/lang/String;Lcom/nic/mparivahan/dlservices/data/model/DlLastRtoRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRto", "getState", "Lcom/nic/mparivahan/dlservices/data/model/DlState;", "(Lcom/nic/mparivahan/dlservices/data/model/DlState;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSubDistricts", "Lcom/nic/mparivahan/dlservices/data/model/DlTaluka;", "(Lcom/nic/mparivahan/dlservices/data/model/DlTaluka;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVillageOrTown", "Lcom/nic/mparivahan/dlservices/data/model/DlVillageOrTown;", "(Lcom/nic/mparivahan/dlservices/data/model/DlVillageOrTown;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface DlOtherService {
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST
    Object getCustomState(@Url String str, @Body DlRto dlRto, Continuation<? super DlStatusResponse> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/getDistricts/distmast")
    Object getDistricts(@Body DlDist dlDist, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST
    Object getImageVerification(@Url String str, @Body DlImageVerification dlImageVerification, Continuation<? super DlPhotoStatusResponse> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST
    Object getLastRto(@Url String str, @Body DlLastRtoRequest dlLastRtoRequest, Continuation<? super DlStatusResponse> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST
    Object getRto(@Url String str, @Body DlRto dlRto, Continuation<? super DlStatusResponse> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/getSeStatesList/stateMast")
    Object getState(@Body DlState dlState, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/getSubDistricts/subDistmast")
    Object getSubDistricts(@Body DlTaluka dlTaluka, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);

    @Headers({"Accept:application/json", "Content-Type:application/json"})
    @POST("sarathi/sarathiWS/getVillageAndTown/villageOrTownMast")
    Object getVillageOrTown(@Body DlVillageOrTown dlVillageOrTown, @Header("timestamp") String str, Continuation<? super SecurityModle> continuation);
}
