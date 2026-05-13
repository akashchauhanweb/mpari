package com.zepto;

import android.content.Context;
import android.provider.Settings;
import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.Dl.DLServiceWithoutDobModel.DLWithoutdobModel;
import com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1;
import com.nic.mparivahan.Dl.Model.UpdateDocSuccessResponse;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.hs1;
import com.zepto.lc5;
import com.zepto.tu5;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public final class is1 extends zq7 {
    public final jp1 d;
    public oy3 e;
    public final oy3 f;
    public oy3 g;
    public oy3 h;
    public final oy3 i;
    public final oy3 j;
    public final oy3 k;
    public final oy3 l;
    public final oy3 m;
    public final oy3 n;
    public final oy3 o;
    public final oy3 p;
    public final oy3 q;
    public final oy3 r;
    public final oy3 s;
    public final oy3 t;
    public final oy3 u;
    public final oy3 v;
    public final oy3 w;
    public final oy3 x;

    public static final class a implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ is1 b;

        public a(Ref.ObjectRef objectRef, is1 is1Var) {
            this.a = objectRef;
            this.b = is1Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.w().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    Log.d("DlDetails", e.getLocalizedMessage());
                    this.b.w().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) DLServiceResponseModleV1.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.v().k((DLServiceResponseModleV1) objFromJson);
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ is1 b;

        public b(Ref.ObjectRef objectRef, is1 is1Var) {
            this.a = objectRef;
            this.b = is1Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.m().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    Log.d("DlDetails", e.getLocalizedMessage());
                    this.b.m().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) DLServiceResponseModleV1.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.l().k((DLServiceResponseModleV1) objFromJson);
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ is1 b;

        public c(Ref.ObjectRef objectRef, is1 is1Var) {
            this.a = objectRef;
            this.b = is1Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.s().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    Log.d("DlDetails", e.getLocalizedMessage());
                    this.b.s().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) DLServiceResponseModleV1.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.r().k((DLServiceResponseModleV1) objFromJson);
        }
    }

    public static final class d implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ is1 b;

        public d(Ref.ObjectRef objectRef, is1 is1Var) {
            this.a = objectRef;
            this.b = is1Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.o().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    Log.d("DlDetails", e.getLocalizedMessage());
                    this.b.o().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) DLServiceResponseModleV1.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.n().k((DLServiceResponseModleV1) objFromJson);
        }
    }

    public static final class e implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ is1 b;

        public e(Ref.ObjectRef objectRef, is1 is1Var) {
            this.a = objectRef;
            this.b = is1Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.u().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    e.printStackTrace();
                    this.b.u().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) DLServiceResponseModleV1.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.t().k((DLServiceResponseModleV1) objFromJson);
        }
    }

    public static final class f implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ is1 b;

        public f(Ref.ObjectRef objectRef, is1 is1Var) {
            this.a = objectRef;
            this.b = is1Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.A().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.A().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) DLWithoutdobModel.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.z().k((DLWithoutdobModel) objFromJson);
        }
    }

    public static final class g implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ is1 b;

        public g(Ref.ObjectRef objectRef, is1 is1Var) {
            this.a = objectRef;
            this.b = is1Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.x().k("error");
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
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) UpdateDocSuccessResponse.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.y().k((UpdateDocSuccessResponse) objFromJson);
            } catch (Exception unused) {
                this.b.x().k("error");
            }
        }
    }

    public is1(jp1 repository) {
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
        this.q = new oy3();
        this.r = new oy3();
        this.s = new oy3();
        this.t = new oy3();
        this.u = new oy3();
        this.v = new oy3();
        this.w = new oy3();
        this.x = new oy3();
    }

    public final oy3 A() {
        return this.t;
    }

    public final oy3 B() {
        return this.g;
    }

    public final oy3 C() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void D(String dl, String str, Context context) {
        Intrinsics.checkNotNullParameter(dl, "dl");
        Intrinsics.checkNotNullParameter(context, "context");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(context);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        hs1.a aVar2 = hs1.a;
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.c(dl, null, context, string, ws6Var.l()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.d.a(aVar.d(ls3VarB, string2), (String) objectRef.element).enqueue(new f(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.String] */
    public final void E(String docId, String docType, String docDob, Context context) {
        Intrinsics.checkNotNullParameter(docId, "docId");
        Intrinsics.checkNotNullParameter(docType, "docType");
        Intrinsics.checkNotNullParameter(docDob, "docDob");
        Intrinsics.checkNotNullParameter(context, "context");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(context);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        hs1.a aVar2 = hs1.a;
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.a(docId, docType, docDob, string, ws6Var.l(), ws6Var.e()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.d.c(aVar.d(ls3VarB, string2), (String) objectRef.element).enqueue(new g(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    public final void g(String dl, String dob, Context context) {
        Intrinsics.checkNotNullParameter(dl, "dl");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(context, "context");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(context);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        hs1.a aVar2 = hs1.a;
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.c(dl, dob, context, string, ws6Var.l()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.d.b(aVar.d(ls3VarB, string2), (String) objectRef.element).enqueue(new a(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    public final void h(String dl, String dob, Context context) {
        Intrinsics.checkNotNullParameter(dl, "dl");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(context, "context");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(context);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        hs1.a aVar2 = hs1.a;
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.c(dl, dob, context, string, ws6Var.l()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.d.b(aVar.d(ls3VarB, string2), (String) objectRef.element).enqueue(new b(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    public final void i(String dl, String dob, Context context) {
        Intrinsics.checkNotNullParameter(dl, "dl");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(context, "context");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(context);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        hs1.a aVar2 = hs1.a;
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.c(dl, dob, context, string, ws6Var.l()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.d.b(aVar.d(ls3VarB, string2), (String) objectRef.element).enqueue(new c(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    public final void j(String dl, String dob, Context context) {
        Intrinsics.checkNotNullParameter(dl, "dl");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(context, "context");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(context);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        hs1.a aVar2 = hs1.a;
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.c(dl, dob, context, string, ws6Var.l()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.d.b(aVar.d(ls3VarB, string2), (String) objectRef.element).enqueue(new d(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    public final void k(String dl, String dob, Context context) {
        Intrinsics.checkNotNullParameter(dl, "dl");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(context, "context");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(context);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        hs1.a aVar2 = hs1.a;
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.c(dl, dob, context, string, ws6Var.l()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.d.b(aVar.d(ls3VarB, string2), (String) objectRef.element).enqueue(new e(objectRef, this));
    }

    public final oy3 l() {
        return this.m;
    }

    public final oy3 m() {
        return this.n;
    }

    public final oy3 n() {
        return this.q;
    }

    public final oy3 o() {
        return this.r;
    }

    public final oy3 p() {
        return this.o;
    }

    public final oy3 q() {
        return this.p;
    }

    public final oy3 r() {
        return this.k;
    }

    public final oy3 s() {
        return this.l;
    }

    public final oy3 t() {
        return this.u;
    }

    public final oy3 u() {
        return this.v;
    }

    public final oy3 v() {
        return this.i;
    }

    public final oy3 w() {
        return this.j;
    }

    public final oy3 x() {
        return this.x;
    }

    public final oy3 y() {
        return this.w;
    }

    public final oy3 z() {
        return this.s;
    }
}
