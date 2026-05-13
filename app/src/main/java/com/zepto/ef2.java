package com.zepto;

import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.DLServicesAuth.CheckEligibility.FormOneRequest;
import com.nic.mparivahan.DLServicesAuth.Model.ServiceCheckPojo;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.tu5;
import java.util.ArrayList;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public final class ef2 extends zq7 {
    public final cf2 d;
    public oy3 e;
    public final oy3 f;
    public final oy3 g;

    public static final class a implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ ef2 b;

        public a(String str, ef2 ef2Var) {
            this.a = str;
            this.b = ef2Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            Log.v("form_response4", "err");
            this.b.i().k("error");
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = this.a;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                Log.d("service_check", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) ff2.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                wb0.a(objFromJson);
                this.b.j().k(null);
                Log.v("service_response", String.valueOf((SecurityModle) response.body()));
            } catch (Exception unused) {
                this.b.i().k("error");
            }
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ ef2 b;

        public b(Ref.ObjectRef objectRef, ef2 ef2Var) {
            this.a = objectRef;
            this.b = ef2Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            Log.v("form_response4", "err");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
            Log.d("service_check", strValueOf);
            Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) ServiceCheckPojo.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.k().k((ServiceCheckPojo) objFromJson);
            Log.v("service_response", String.valueOf(response != null ? (SecurityModle) response.body() : null));
        }
    }

    public ef2(cf2 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
        this.g = new oy3();
    }

    public final String g(ArrayList arrayList, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("agentId", "mobSARATHI");
        jSONObject.put("agentPwd", "657d1c758e2e95af0014e16f5109f933");
        jSONObject.put("agentIpAddress", "10.248.210.8");
        jSONObject.put("agentServiceName", "sarathiservice");
        jSONObject.put("stCode", str);
        JSONArray jSONArray = new JSONArray();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            jSONArray.put(arrayList.get(i));
        }
        jSONObject.put("reqTrans", jSONArray);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void h(FormOneRequest mFormOneRequest) {
        Intrinsics.checkNotNullParameter(mFormOneRequest, "mFormOneRequest");
        lc5 lc5VarD = lc5.Companion.d(ls3.g.b("application/json"), l(mFormOneRequest));
        String strValueOf = String.valueOf(System.currentTimeMillis());
        this.d.a(lc5VarD, strValueOf).enqueue(new a(strValueOf, this));
    }

    public final oy3 i() {
        return this.f;
    }

    public final oy3 j() {
        return this.e;
    }

    public final oy3 k() {
        return this.g;
    }

    public final String l(FormOneRequest req) {
        Intrinsics.checkNotNullParameter(req, "req");
        String json = new Gson().toJson(req);
        Log.d("request_submit", req.toString());
        Intrinsics.checkNotNull(json);
        return json;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m(ArrayList selectedService, String state_code) {
        Intrinsics.checkNotNullParameter(selectedService, "selectedService");
        Intrinsics.checkNotNullParameter(state_code, "state_code");
        lc5 lc5VarD = lc5.Companion.d(ls3.g.b("application/json"), g(selectedService, state_code));
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? ValueOf = String.valueOf(System.currentTimeMillis());
        objectRef.element = ValueOf;
        this.d.b(lc5VarD, ValueOf).enqueue(new b(objectRef, this));
    }
}
