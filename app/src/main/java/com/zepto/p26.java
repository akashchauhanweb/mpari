package com.zepto;

import android.content.Context;
import android.provider.Settings;
import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.Account.Model.GetCitizenDetails;
import com.nic.mparivahan.Account.Model.LogoutModle;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.RC.Model.CitzValidDoc;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.lc5;
import com.zepto.mt6;
import com.zepto.tu5;
import java.util.Base64;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public final class p26 extends zq7 {
    public final c26 d;
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
    public final oy3 q;
    public final oy3 r;
    public final oy3 s;
    public final oy3 t;
    public final oy3 u;
    public final oy3 v;
    public final oy3 w;
    public final oy3 x;
    public final oy3 y;

    public static final class a implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ p26 b;

        public a(Ref.ObjectRef objectRef, p26 p26Var) {
            this.a = objectRef;
            this.b = p26Var;
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
                } catch (Exception unused) {
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
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) SendOtpResult.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.h().k((SendOtpResult) objFromJson);
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ p26 b;

        public b(Ref.ObjectRef objectRef, p26 p26Var) {
            this.a = objectRef;
            this.b = p26Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.n().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response != null) {
                try {
                    if (response.isSuccessful()) {
                        SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                        tu5.a aVar = tu5.a;
                        String str = (String) this.a.element;
                        byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                        Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) GetCitizenDetails.class);
                        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                        this.b.o().k((GetCitizenDetails) objFromJson);
                        return;
                    }
                } catch (Exception unused) {
                    this.b.n().k("error");
                    return;
                }
            }
            String.valueOf(response != null ? response.errorBody() : null);
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ p26 b;

        public c(Ref.ObjectRef objectRef, p26 p26Var) {
            this.a = objectRef;
            this.b = p26Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.p().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.p().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) GetCitizenDetails.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.q().k((GetCitizenDetails) objFromJson);
        }
    }

    public static final class d implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ p26 b;

        public d(Ref.ObjectRef objectRef, p26 p26Var) {
            this.a = objectRef;
            this.b = p26Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.z().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.z().k("ERROR");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) ResendOtp.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.A().k((ResendOtp) objFromJson);
        }
    }

    public static final class e implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ p26 b;

        public e(Ref.ObjectRef objectRef, p26 p26Var) {
            this.a = objectRef;
            this.b = p26Var;
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
                } catch (Exception unused) {
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
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) SendOtpResult.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.w().k((SendOtpResult) objFromJson);
        }
    }

    public static final class f implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ p26 b;

        public f(Ref.ObjectRef objectRef, p26 p26Var) {
            this.a = objectRef;
            this.b = p26Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.l().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    this.b.l().k("Error");
                    Log.d("DecRes+", e.getLocalizedMessage());
                    e.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) SendOtpResult.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.v().k((SendOtpResult) objFromJson);
        }
    }

    public static final class g implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ p26 b;

        public g(Ref.ObjectRef objectRef, p26 p26Var) {
            this.a = objectRef;
            this.b = p26Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            this.b.E().k("Error");
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
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) LogoutModle.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.F().k((LogoutModle) objFromJson);
            } catch (Exception e) {
                e.printStackTrace();
                this.b.E().k("Error");
            }
        }
    }

    public static final class h implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ p26 b;

        public h(Ref.ObjectRef objectRef, p26 p26Var) {
            this.a = objectRef;
            this.b = p26Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.k().k(th != null ? th.getMessage() : null);
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
                    Log.e("ERROR", Unit.INSTANCE.toString());
                    this.b.k().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) CitzValidDoc.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.x().k((CitzValidDoc) objFromJson);
        }
    }

    public static final class i implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ p26 b;

        public i(Ref.ObjectRef objectRef, p26 p26Var) {
            this.a = objectRef;
            this.b = p26Var;
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
                } catch (Exception unused) {
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
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) SendOtpResult.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.w().k((SendOtpResult) objFromJson);
        }
    }

    public static final class j implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ p26 b;

        public j(Ref.ObjectRef objectRef, p26 p26Var) {
            this.a = objectRef;
            this.b = p26Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.t().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.t().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) SendOtpResult.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.u().k((SendOtpResult) objFromJson);
        }
    }

    public p26(c26 repository) {
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
        this.y = new oy3();
    }

    public final oy3 A() {
        return this.x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void B(String mobile_no, String id) {
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        Intrinsics.checkNotNullParameter(id, "id");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mt6.a.m(mobile_no, id).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.b(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new e(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void C(String mobile_no) {
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mt6.a.q(mobile_no).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.b(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new f(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void D(JSONObject objectValue) {
        Intrinsics.checkNotNullParameter(objectValue, "objectValue");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = objectValue.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.e(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new g(objectRef, this));
    }

    public final oy3 E() {
        return this.q;
    }

    public final oy3 F() {
        return this.p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.String] */
    public final void G(String otp, String otpid, String rc, String docType, String dob, Context context) {
        Intrinsics.checkNotNullParameter(otp, "otp");
        Intrinsics.checkNotNullParameter(otpid, "otpid");
        Intrinsics.checkNotNullParameter(rc, "rc");
        Intrinsics.checkNotNullParameter(docType, "docType");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intrinsics.checkNotNullParameter(context, "context");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(context);
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        mt6.a aVar2 = mt6.a;
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.y(otp, otpid, string, ws6Var.l(), ws6Var.e(), rc, ws6Var.k(), docType, dob).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.d.g(aVar.d(ls3VarB, string2), (String) objectRef.element).enqueue(new h(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void H(String mobile_no, Context context, String event) {
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(event, "event");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        new ws6(context);
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mt6.a.k(mobile_no, event).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.b(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new i(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void I(Context context, String mobile_no, int i2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        ws6 ws6Var = new ws6(context);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        if (i2 != 1) {
            mobile_no = ws6Var.l();
        }
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mt6.a.A(mobile_no, ws6Var.k()).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.b(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new j(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void g(String mobile_no, String id) {
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        Intrinsics.checkNotNullParameter(id, "id");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mt6.a.g(mobile_no, id).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.b(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new a(objectRef, this));
    }

    public final oy3 h() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void i(String mobile_no, Context context) {
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        Intrinsics.checkNotNullParameter(context, "context");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        mt6.a aVar2 = mt6.a;
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.i(mobile_no, string).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.d.c(aVar.d(ls3VarB, string2), (String) objectRef.element).enqueue(new b(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void j(String mobile_no, Context context) {
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        Intrinsics.checkNotNullParameter(context, "context");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        mt6.a aVar2 = mt6.a;
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.i(mobile_no, string).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.d.c(aVar.d(ls3VarB, string2), (String) objectRef.element).enqueue(new c(objectRef, this));
    }

    public final oy3 k() {
        return this.w;
    }

    public final oy3 l() {
        return this.f;
    }

    public final oy3 m() {
        return this.i;
    }

    public final oy3 n() {
        return this.o;
    }

    public final oy3 o() {
        return this.n;
    }

    public final oy3 p() {
        return this.m;
    }

    public final oy3 q() {
        return this.l;
    }

    public final oy3 r() {
        return this.k;
    }

    public final oy3 s() {
        return this.j;
    }

    public final oy3 t() {
        return this.s;
    }

    public final oy3 u() {
        return this.r;
    }

    public final oy3 v() {
        return this.e;
    }

    public final oy3 w() {
        return this.g;
    }

    public final oy3 x() {
        return this.v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void y(String smsId) {
        Intrinsics.checkNotNullParameter(smsId, "smsId");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mt6.a.r(smsId).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.a(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new d(objectRef, this));
    }

    public final oy3 z() {
        return this.y;
    }
}
