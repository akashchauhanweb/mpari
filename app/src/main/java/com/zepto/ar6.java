package com.zepto;

import com.google.gson.Gson;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileUserDetails;
import com.zepto.gd1;
import com.zepto.lc5;
import com.zepto.tu5;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class ar6 extends zq7 {
    public final xq6 d;
    public final oy3 e;
    public final oy3 f;
    public final oy3 g;
    public oy3 h;
    public final oy3 i;
    public final oy3 j;

    public static final class a implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ ar6 b;

        public a(String str, ar6 ar6Var) {
            this.a = str;
            this.b = ar6Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.g().k("Service temporarily unavailable. Please try again later.");
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    this.b.g().k("Unable to Update the mobile no.");
                    e.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = this.a;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) UpdateMobileUserDetails.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            UpdateMobileUserDetails updateMobileUserDetails = (UpdateMobileUserDetails) objFromJson;
            gd1.a aVar2 = gd1.a;
            if (aVar2.m(updateMobileUserDetails.getErrorcode())) {
                this.b.h().k(updateMobileUserDetails);
            } else if (aVar2.m(updateMobileUserDetails.getErrorDesc())) {
                this.b.g().k("Unable to update the mobile no.");
            } else {
                this.b.g().k(String.valueOf(updateMobileUserDetails.getErrorDesc()));
            }
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ ar6 b;

        public b(Ref.ObjectRef objectRef, ar6 ar6Var) {
            this.a = objectRef;
            this.b = ar6Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.i().k("Error");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = (String) this.a.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                JSONObject jSONObject = new JSONObject(strValueOf);
                if (!jSONObject.has("errorcode")) {
                    this.b.j().k(strValueOf);
                } else if (jSONObject.getInt("errorcode") == 400) {
                    this.b.j().k(jSONObject.getString("errorDesc"));
                }
            } catch (Exception unused) {
                this.b.i().k("Error");
            }
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ ar6 b;

        public c(Ref.ObjectRef objectRef, ar6 ar6Var) {
            this.a = objectRef;
            this.b = ar6Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.l().k("Unable to update the mobile no, Please try after some time!");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = (String) this.a.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                try {
                    JSONObject jSONObject = new JSONObject(strValueOf);
                    if (jSONObject.has("errorcode")) {
                        if (jSONObject.getInt("errorcode") == 400) {
                            this.b.l().k(jSONObject.getString("errorDesc"));
                        } else {
                            this.b.l().k("Unable to update the mobile no, Please try after some time!");
                        }
                    }
                } catch (Exception unused) {
                    Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) Boolean.TYPE);
                    Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                    this.b.m().k(Boolean.valueOf(((Boolean) objFromJson).booleanValue()));
                }
            } catch (Exception unused2) {
                this.b.l().k("Unable to update the mobile no, Please try after some time!");
            }
        }
    }

    public ar6(xq6 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
        this.g = new oy3();
        this.h = new oy3();
        this.i = new oy3();
        this.j = new oy3();
    }

    public final oy3 g() {
        return this.f;
    }

    public final oy3 h() {
        return this.e;
    }

    public final oy3 i() {
        return this.j;
    }

    public final oy3 j() {
        return this.i;
    }

    public final void k(String regNo, String chasiNo, String engineNo, String regnDate, String regnUpto) {
        Intrinsics.checkNotNullParameter(regNo, "regNo");
        Intrinsics.checkNotNullParameter(chasiNo, "chasiNo");
        Intrinsics.checkNotNullParameter(engineNo, "engineNo");
        Intrinsics.checkNotNullParameter(regnDate, "regnDate");
        Intrinsics.checkNotNullParameter(regnUpto, "regnUpto");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.g0(regNo, chasiNo, engineNo, regnDate, regnUpto).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.a(aVar.d(ls3VarB, string), strValueOf).enqueue(new a(strValueOf, this));
    }

    public final oy3 l() {
        return this.h;
    }

    public final oy3 m() {
        return this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void n(JSONObject requestObj) {
        Intrinsics.checkNotNullParameter(requestObj, "requestObj");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = requestObj.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.b(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new b(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void o(JSONObject requestObj) {
        Intrinsics.checkNotNullParameter(requestObj, "requestObj");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = requestObj.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.c(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new c(objectRef, this));
    }
}
