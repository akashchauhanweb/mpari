package com.zepto;

import android.content.Context;
import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.LLServices.SubmitLlServiceAPI;
import com.nic.mparivahan.LLServices.SubmitServiceAssets.ChangeAddressLlReq;
import com.nic.mparivahan.LLServices.SubmitServiceAssets.ChangeOfNameReq;
import com.nic.mparivahan.LLServices.SubmitServiceAssets.DuplicateLlRequest;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.lc5;
import com.zepto.tu5;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class dm3 extends zq7 {
    public final hl3 d;
    public oy3 e;
    public oy3 f;
    public final oy3 g;

    public static final class a implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ dm3 b;

        public a(String str, dm3 dm3Var) {
            this.a = str;
            this.b = dm3Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.i().k("error");
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.i().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = this.a;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
            Log.d("response = ", strValueOf);
            Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) SubmitLlServiceAPI.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            SubmitLlServiceAPI submitLlServiceAPI = (SubmitLlServiceAPI) objFromJson;
            Log.d("response", String.valueOf(response != null ? (SecurityModle) response.body() : null));
            this.b.l().k(submitLlServiceAPI);
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ dm3 b;

        public b(String str, dm3 dm3Var) {
            this.a = str;
            this.b = dm3Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.i().k("error");
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.i().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = this.a;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
            Log.d("response = ", strValueOf);
            Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) FetchLlDetails.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            FetchLlDetails fetchLlDetails = (FetchLlDetails) objFromJson;
            Log.d("response_ll", String.valueOf(response != null ? (SecurityModle) response.body() : null));
            this.b.k().k(fetchLlDetails);
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ dm3 b;

        public c(String str, dm3 dm3Var) {
            this.a = str;
            this.b = dm3Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.i().k("error");
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.i().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = this.a;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
            Log.d("response = ", strValueOf);
            Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) SubmitLlServiceAPI.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            SubmitLlServiceAPI submitLlServiceAPI = (SubmitLlServiceAPI) objFromJson;
            Log.d("response", String.valueOf(response != null ? (SecurityModle) response.body() : null));
            this.b.l().k(submitLlServiceAPI);
        }
    }

    public static final class d implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ dm3 b;

        public d(String str, dm3 dm3Var) {
            this.a = str;
            this.b = dm3Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.i().k("error");
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.i().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = this.a;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
            Log.d("response = ", strValueOf);
            Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) SubmitLlServiceAPI.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            SubmitLlServiceAPI submitLlServiceAPI = (SubmitLlServiceAPI) objFromJson;
            Log.d("response", String.valueOf(response != null ? (SecurityModle) response.body() : null));
            this.b.l().k(submitLlServiceAPI);
        }
    }

    public dm3(hl3 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
        this.g = new oy3();
    }

    public final void g(Context context, ChangeAddressLlReq mChangeAddressLlReq) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mChangeAddressLlReq, "mChangeAddressLlReq");
        lc5 lc5VarD = lc5.Companion.d(ls3.g.b("application/json"), h(mChangeAddressLlReq));
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.b(lc5VarD, strValueOf).enqueue(new a(strValueOf, this));
    }

    public final String h(ChangeAddressLlReq changeAddressLlReq) {
        String json = new Gson().toJson(changeAddressLlReq);
        Log.d("request_address_ll", changeAddressLlReq.toString());
        Intrinsics.checkNotNull(json);
        return json;
    }

    public final oy3 i() {
        return this.g;
    }

    public final void j(Context context, String learningLicence, String dateOfBirth, String agentId, String agentPwd, String agentIpAddress, String agentServiceName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(learningLicence, "learningLicence");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(agentId, "agentId");
        Intrinsics.checkNotNullParameter(agentPwd, "agentPwd");
        Intrinsics.checkNotNullParameter(agentIpAddress, "agentIpAddress");
        Intrinsics.checkNotNullParameter(agentServiceName, "agentServiceName");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = cz5.a.h(learningLicence, dateOfBirth, agentId, agentPwd, agentIpAddress, agentServiceName).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.a(lc5VarD, strValueOf).enqueue(new b(strValueOf, this));
    }

    public final oy3 k() {
        return this.e;
    }

    public final oy3 l() {
        return this.f;
    }

    public final String m(ChangeOfNameReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
        String json = new Gson().toJson(req);
        Log.d("request_name_ll", req.toString());
        Intrinsics.checkNotNull(json);
        return json;
    }

    public final String n(DuplicateLlRequest req) {
        Intrinsics.checkNotNullParameter(req, "req");
        String json = new Gson().toJson(req);
        Log.d("request_dup_ll", req.toString());
        Intrinsics.checkNotNull(json);
        return json;
    }

    public final void o(Context context, ChangeOfNameReq mChangeOfNameReq) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mChangeOfNameReq, "mChangeOfNameReq");
        lc5 lc5VarD = lc5.Companion.d(ls3.g.b("application/json"), m(mChangeOfNameReq));
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.b(lc5VarD, strValueOf).enqueue(new c(strValueOf, this));
    }

    public final void p(Context context, DuplicateLlRequest mDuplicateLlRequest) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mDuplicateLlRequest, "mDuplicateLlRequest");
        lc5 lc5VarD = lc5.Companion.d(ls3.g.b("application/json"), n(mDuplicateLlRequest));
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.b(lc5VarD, strValueOf).enqueue(new d(strValueOf, this));
    }
}
