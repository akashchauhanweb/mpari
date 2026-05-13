package com.zepto;

import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.Checkpost.CheckPostModel.CheckPostReceiptDetailNew;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.zepto.lc5;
import com.zepto.ze1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public final class pj0 extends zq7 {
    public final jj0 d;
    public final oy3 e;
    public final oy3 f;
    public final oy3 g;
    public final oy3 h;

    public static final class a implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ pj0 b;
        public final /* synthetic */ String c;

        public a(Ref.ObjectRef objectRef, pj0 pj0Var, String str) {
            this.a = objectRef;
            this.b = pj0Var;
            this.c = str;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.h().k("error");
            Log.e("testPostError", t.toString());
            Log.e("testPost", VUtility.INSTANCE.p(this.c).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    this.b.h().k("Error");
                    e.printStackTrace();
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
            Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) CheckPostReceiptDetailNew.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.g().k((CheckPostReceiptDetailNew) objFromJson);
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ pj0 b;

        public b(Ref.ObjectRef objectRef, pj0 pj0Var) {
            this.a = objectRef;
            this.b = pj0Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.j().k("error");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    this.b.j().k("No data available");
                    e.printStackTrace();
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
            Object objFromJson = new Gson().fromJson(aVar.a(str, data), (Class<Object>) CheckPostReceiptDetailNew.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.i().k((CheckPostReceiptDetailNew) objFromJson);
        }
    }

    public pj0(jj0 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.d = repository;
        this.e = new oy3();
        this.f = new oy3();
        this.g = new oy3();
        this.h = new oy3();
    }

    public final oy3 g() {
        return this.e;
    }

    public final oy3 h() {
        return this.f;
    }

    public final oy3 i() {
        return this.g;
    }

    public final oy3 j() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void k(String inputValue) {
        Intrinsics.checkNotNullParameter(inputValue, "inputValue");
        try {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = String.valueOf(System.currentTimeMillis());
            lc5.a aVar = lc5.Companion;
            ls3 ls3VarB = ls3.g.b("application/json");
            String string = VUtility.INSTANCE.p(inputValue).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            this.d.a(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new a(objectRef, this, inputValue));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.String] */
    public final void l(String stateCd, String regnNo) {
        Intrinsics.checkNotNullParameter(stateCd, "stateCd");
        Intrinsics.checkNotNullParameter(regnNo, "regnNo");
        Log.e("VehicleTest", stateCd + ':' + regnNo);
        try {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = String.valueOf(System.currentTimeMillis());
            lc5.a aVar = lc5.Companion;
            ls3 ls3VarB = ls3.g.b("application/json");
            String string = VUtility.INSTANCE.q(stateCd, regnNo).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            this.d.b(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new b(objectRef, this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
