package com.nic.mparivahan.VahanServices.VahanMultiService;

import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanModel.FinalRequestSubmitResponse;
import com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.MultiBeforePaymentResponse;
import com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.MultiServiceBeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanMultiService.ErroModel.ApiMessage;
import com.nic.mparivahan.VahanServices.VahanMultiService.ErroModel.ErroMultiSelection;
import com.nic.mparivahan.VahanServices.VahanMultiService.FeeModel.FeeRequest;
import com.nic.mparivahan.VahanServices.VahanMultiService.FeeModel.FeesResponse;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.DraftResponse;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.MultiSelectRequest;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.MultiSelectionResp;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.SellerResponse;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.zepto.lc5;
import com.zepto.ls3;
import com.zepto.nd5;
import com.zepto.oy3;
import com.zepto.sx3;
import com.zepto.ze1;
import com.zepto.zq7;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class MultiSelectionViewModel extends zq7 {
    public final sx3 d;
    public final oy3 e;
    public final oy3 f;
    public final oy3 g;
    public final oy3 h;
    public final oy3 i;
    public final oy3 j;
    public final oy3 k;
    public final oy3 l;
    public final oy3 m;
    public final oy3 n;
    public final oy3 o;
    public final oy3 p;

    public static final class a implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ MultiSelectionViewModel b;

        public a(Ref.ObjectRef objectRef, MultiSelectionViewModel multiSelectionViewModel) {
            this.a = objectRef;
            this.b = multiSelectionViewModel;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.q().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    this.b.q().k("Error");
                    Log.e("BeforePayment_ERROR", e.getStackTrace().toString());
                    return;
                }
            } else {
                securityModle = null;
            }
            ze1.a aVar = ze1.a;
            String str = (String) this.a.element;
            Intrinsics.checkNotNull(securityModle);
            String data = securityModle.getData();
            Intrinsics.checkNotNull(data);
            Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) MultiBeforePaymentResponse.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.p().k((MultiBeforePaymentResponse) objFromJson);
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ MultiSelectionViewModel b;

        public b(Ref.ObjectRef objectRef, MultiSelectionViewModel multiSelectionViewModel) {
            this.a = objectRef;
            this.b = multiSelectionViewModel;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.i().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            try {
                Intrinsics.checkNotNull(response);
                if (response.isSuccessful() && response.code() == 200) {
                    SecurityModle securityModle = (SecurityModle) response.body();
                    ze1.a aVar = ze1.a;
                    String str = (String) this.a.element;
                    Intrinsics.checkNotNull(securityModle);
                    String data = securityModle.getData();
                    Intrinsics.checkNotNull(data);
                    Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) FeesResponse.class);
                    Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                    this.b.h().k((FeesResponse) objFromJson);
                } else if (response.code() == 400) {
                    this.b.i().k("error");
                }
            } catch (Exception e) {
                e.printStackTrace();
                this.b.i().k("error");
            }
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ MultiSelectionViewModel b;

        public c(Ref.ObjectRef objectRef, MultiSelectionViewModel multiSelectionViewModel) {
            this.a = objectRef;
            this.b = multiSelectionViewModel;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.m().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            try {
                Intrinsics.checkNotNull(response);
                if (response.isSuccessful() && response.code() == 200) {
                    SecurityModle securityModle = (SecurityModle) response.body();
                    ze1.a aVar = ze1.a;
                    String str = (String) this.a.element;
                    Intrinsics.checkNotNull(securityModle);
                    String data = securityModle.getData();
                    Intrinsics.checkNotNull(data);
                    String strA = aVar.a(str, data);
                    JSONObject jSONObject = new JSONObject(strA);
                    if (jSONObject.has("apiMessage")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("apiMessage");
                        if (jSONObject2.getInt("statusCode") == 400) {
                            this.b.m().k(jSONObject2.getString("developerMessage"));
                        } else {
                            Object objFromJson = new Gson().fromJson(strA, (Class<Object>) DraftResponse.class);
                            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                            this.b.l().k((DraftResponse) objFromJson);
                        }
                    } else {
                        this.b.m().k("error");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                this.b.m().k("error");
            }
        }
    }

    public static final class d implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ MultiSelectionViewModel b;

        public d(Ref.ObjectRef objectRef, MultiSelectionViewModel multiSelectionViewModel) {
            this.a = objectRef;
            this.b = multiSelectionViewModel;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.k().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.k().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            ze1.a aVar = ze1.a;
            String str = (String) this.a.element;
            Intrinsics.checkNotNull(securityModle);
            String data = securityModle.getData();
            Intrinsics.checkNotNull(data);
            Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) FinalRequestSubmitResponse.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.j().k((FinalRequestSubmitResponse) objFromJson);
        }
    }

    public MultiSelectionViewModel(sx3 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
        this.g = new oy3();
        this.h = new oy3();
        this.i = new oy3();
        this.j = new oy3();
        this.k = new oy3();
        this.l = new oy3();
        this.m = new oy3();
        this.n = new oy3();
        this.o = new oy3();
        this.p = new oy3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void g(MultiServiceBeforePaymentRequest param) {
        Intrinsics.checkNotNullParameter(param, "param");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        String json = new Gson().toJson(param);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        this.d.b(lc5.Companion.d(ls3.g.b("application/json"), json), (String) objectRef.element).enqueue(new a(objectRef, this));
    }

    public final oy3 h() {
        return this.i;
    }

    public final oy3 i() {
        return this.j;
    }

    public final oy3 j() {
        return this.m;
    }

    public final oy3 k() {
        return this.n;
    }

    public final oy3 l() {
        return this.g;
    }

    public final oy3 m() {
        return this.h;
    }

    public final oy3 n() {
        return this.e;
    }

    public final oy3 o() {
        return this.f;
    }

    public final oy3 p() {
        return this.k;
    }

    public final oy3 q() {
        return this.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void r(FeeRequest feeRequest) {
        Intrinsics.checkNotNullParameter(feeRequest, "feeRequest");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        String json = new Gson().toJson(feeRequest);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        this.d.d(lc5.Companion.d(ls3.g.b("application/json"), json), (String) objectRef.element).enqueue(new b(objectRef, this));
    }

    public final oy3 s() {
        return this.o;
    }

    public final oy3 t() {
        return this.p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void u(MultiSelectRequest multiSelectRequest) {
        Intrinsics.checkNotNullParameter(multiSelectRequest, "multiSelectRequest");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.c(lc5.Companion.d(ls3.g.b("application/json"), VUtility.INSTANCE.r(multiSelectRequest).toString()), (String) objectRef.element).enqueue(new Callback() { // from class: com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel$multSelectService$1
            @Override // retrofit2.Callback
            public void onFailure(Call call, Throwable th) {
                this.o().k(th != null ? th.getMessage() : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // retrofit2.Callback
            public void onResponse(Call call, Response response) {
                ApiMessage apiMessage;
                try {
                    Intrinsics.checkNotNull(response);
                    if (response.isSuccessful() && response.code() == 200) {
                        SecurityModle securityModle = (SecurityModle) response.body();
                        ze1.a aVar = ze1.a;
                        String str = (String) objectRef.element;
                        Intrinsics.checkNotNull(securityModle);
                        String data = securityModle.getData();
                        Intrinsics.checkNotNull(data);
                        Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) MultiSelectionResp.class);
                        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                        this.n().k((MultiSelectionResp) objFromJson);
                        return;
                    }
                    if (response.code() != 400) {
                        this.o().k("error");
                        return;
                    }
                    SecurityModle securityModle2 = (SecurityModle) response.body();
                    ze1.a aVar2 = ze1.a;
                    String str2 = (String) objectRef.element;
                    Intrinsics.checkNotNull(securityModle2);
                    String data2 = securityModle2.getData();
                    Intrinsics.checkNotNull(data2);
                    ErroMultiSelection erroMultiSelection = (ErroMultiSelection) new Gson().fromJson(aVar2.a(str2, data2), new TypeToken<ErroMultiSelection>() { // from class: com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel$multSelectService$1$onResponse$type$1
                    }.getType());
                    oy3 oy3VarO = this.o();
                    String developerMessage = (erroMultiSelection == null || (apiMessage = erroMultiSelection.getApiMessage()) == null) ? null : apiMessage.getDeveloperMessage();
                    Intrinsics.checkNotNull(developerMessage);
                    oy3VarO.k(developerMessage);
                } catch (Exception e) {
                    e.printStackTrace();
                    this.o().k("error");
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void v(MultiServiceDraft multiSelectRequest) {
        Intrinsics.checkNotNullParameter(multiSelectRequest, "multiSelectRequest");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        String json = new Gson().toJson(multiSelectRequest);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        this.d.e(lc5.Companion.d(ls3.g.b("application/json"), json), (String) objectRef.element).enqueue(new c(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void w(String requestParam, boolean z) {
        Intrinsics.checkNotNullParameter(requestParam, "requestParam");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5 lc5VarD = lc5.Companion.d(ls3.g.b("application/json"), requestParam.toString());
        (z ? this.d.a(lc5VarD, (String) objectRef.element) : this.d.a(lc5VarD, (String) objectRef.element)).enqueue(new Callback() { // from class: com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel$sellerDraft$1
            @Override // retrofit2.Callback
            public void onFailure(Call call, Throwable th) {
                this.t().k(th != null ? th.toString() : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // retrofit2.Callback
            public void onResponse(Call call, Response response) {
                ApiMessage apiMessage;
                developerMessage = null;
                String developerMessage = null;
                if (response != null) {
                    try {
                        if (response.code() == 200) {
                            SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                            ze1.a aVar = ze1.a;
                            String str = (String) objectRef.element;
                            Intrinsics.checkNotNull(securityModle);
                            String data = securityModle.getData();
                            Intrinsics.checkNotNull(data);
                            Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) SellerResponse.class);
                            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                            this.s().k((SellerResponse) objFromJson);
                            return;
                        }
                    } catch (Exception e) {
                        this.t().k("error");
                        e.printStackTrace();
                        Log.e("FinalRequest-ERROR", Unit.INSTANCE.toString());
                        return;
                    }
                }
                if ((response == null || response.code() != 400) && (response == null || response.code() != 409)) {
                    this.t().k("error");
                    return;
                }
                String.valueOf(response.errorBody());
                Gson gson = new Gson();
                Type type = new TypeToken<ErroMultiSelection>() { // from class: com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel$sellerDraft$1$onResponse$type$1
                }.getType();
                nd5 nd5VarErrorBody = response.errorBody();
                Intrinsics.checkNotNull(nd5VarErrorBody);
                ErroMultiSelection erroMultiSelection = (ErroMultiSelection) gson.fromJson(nd5VarErrorBody.charStream(), type);
                oy3 oy3VarT = this.t();
                if (erroMultiSelection != null && (apiMessage = erroMultiSelection.getApiMessage()) != null) {
                    developerMessage = apiMessage.getDeveloperMessage();
                }
                Intrinsics.checkNotNull(developerMessage);
                oy3VarT.k(developerMessage);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void x(MultiServiceBeforePaymentRequest finalSubmit) {
        Intrinsics.checkNotNullParameter(finalSubmit, "finalSubmit");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.f(lc5.Companion.d(ls3.g.b("application/json"), new Gson().toJson(finalSubmit).toString()), (String) objectRef.element).enqueue(new d(objectRef, this));
    }
}
