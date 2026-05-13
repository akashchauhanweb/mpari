package com.zepto;

import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.DPTNotice.DataClass.DTPVerifyPaymentModal;
import com.nic.mparivahan.DPTNotice.DataClass.NoticeListModel;
import com.nic.mparivahan.DPTNotice.DataClass.NoticeVirtualCourtModel;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.lc5;
import com.zepto.tu5;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public final class mc1 extends zq7 {
    public final ec1 d;
    public final oy3 e;
    public final oy3 f;
    public final oy3 g;
    public final oy3 h;

    public static final class a implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ mc1 b;

        public a(String str, mc1 mc1Var) {
            this.a = str;
            this.b = mc1Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.g().k("error");
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
                Log.d("Notice Res", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) NoticeListModel.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.h().k((NoticeListModel) objFromJson);
            } catch (Exception e) {
                e.printStackTrace();
                this.b.g().k("error");
            }
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ mc1 b;

        public b(String str, mc1 mc1Var) {
            this.a = str;
            this.b = mc1Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.g().k("error");
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
                Log.d("Notice Res", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) NoticeListModel.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.h().k((NoticeListModel) objFromJson);
            } catch (Exception e) {
                e.printStackTrace();
                this.b.g().k("error");
            }
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ mc1 b;

        public c(String str, mc1 mc1Var) {
            this.a = str;
            this.b = mc1Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.g().k("error");
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
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) DTPVerifyPaymentModal.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.i().k((DTPVerifyPaymentModal) objFromJson);
            } catch (Exception e) {
                e.printStackTrace();
                this.b.g().k("error");
            }
        }
    }

    public static final class d implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ mc1 b;

        public d(String str, mc1 mc1Var) {
            this.a = str;
            this.b = mc1Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.g().k("error");
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
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) NoticeVirtualCourtModel.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.j().k((NoticeVirtualCourtModel) objFromJson);
            } catch (Exception e) {
                e.printStackTrace();
                this.b.g().k("error");
            }
        }
    }

    public mc1(ec1 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
        this.g = new oy3();
        this.h = new oy3();
    }

    public final oy3 g() {
        return this.f;
    }

    public final oy3 h() {
        return this.e;
    }

    public final oy3 i() {
        return this.h;
    }

    public final oy3 j() {
        return this.g;
    }

    public final void k(String inputType, String inputValue) {
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        Intrinsics.checkNotNullParameter(inputValue, "inputValue");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("entity_type", inputType);
            jSONObject.put("entity_value", inputValue);
            String strValueOf = String.valueOf(System.currentTimeMillis());
            lc5.a aVar = lc5.Companion;
            ls3 ls3VarB = ls3.g.b("application/json");
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            this.d.c(aVar.d(ls3VarB, string), strValueOf).enqueue(new a(strValueOf, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void l(String inputType, String inputValue) {
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        Intrinsics.checkNotNullParameter(inputValue, "inputValue");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("entity_type", inputType);
            jSONObject.put("entity_value", inputValue);
            String strValueOf = String.valueOf(System.currentTimeMillis());
            lc5.a aVar = lc5.Companion;
            ls3 ls3VarB = ls3.g.b("application/json");
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            this.d.d(aVar.d(ls3VarB, string), strValueOf).enqueue(new b(strValueOf, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void m(String challanNo) {
        Intrinsics.checkNotNullParameter(challanNo, "challanNo");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("notice_no", challanNo);
            String strValueOf = String.valueOf(System.currentTimeMillis());
            lc5.a aVar = lc5.Companion;
            ls3 ls3VarB = ls3.g.b("application/json");
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            this.d.a(aVar.d(ls3VarB, string), strValueOf).enqueue(new c(strValueOf, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void n(String challanNo) {
        Intrinsics.checkNotNullParameter(challanNo, "challanNo");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("challan_no", challanNo);
            String strValueOf = String.valueOf(System.currentTimeMillis());
            lc5.a aVar = lc5.Companion;
            ls3 ls3VarB = ls3.g.b("application/json");
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            this.d.b(aVar.d(ls3VarB, string), strValueOf).enqueue(new d(strValueOf, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
