package com.zepto;

import com.google.gson.Gson;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.DmsUpdateRequest;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.DmsUploadReq;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.DmsUploadRes;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.UpdateDocResponse;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.VahanDmsModleResponse;
import com.nic.mparivahan.VahanServices.DRcModle.DMSViewDocModle;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.zepto.lc5;
import com.zepto.tu5;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class qs1 extends zq7 {
    public final cc1 d;
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

    public static final class a implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ qs1 b;

        public a(Ref.ObjectRef objectRef, qs1 qs1Var) {
            this.a = objectRef;
            this.b = qs1Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.i().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
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
            if (securityModle != null) {
                try {
                    tu5.a aVar = tu5.a;
                    String str = (String) this.a.element;
                    byte[] bArrDecode = Base64.getDecoder().decode(securityModle.getData());
                    Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                    Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) VahanDmsModleResponse.class);
                    Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                    this.b.h().k((VahanDmsModleResponse) objFromJson);
                } catch (Exception unused2) {
                    this.b.i().k("error");
                }
            }
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ qs1 b;

        public b(Ref.ObjectRef objectRef, qs1 qs1Var) {
            this.a = objectRef;
            this.b = qs1Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.m().k(th != null ? th.toString() : null);
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
            if (securityModle != null) {
                try {
                    tu5.a aVar = tu5.a;
                    String str = (String) this.a.element;
                    byte[] bArrDecode = Base64.getDecoder().decode(securityModle.getData());
                    Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                    Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) VahanDmsModleResponse.class);
                    Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                    this.b.l().k((VahanDmsModleResponse) objFromJson);
                } catch (Exception unused2) {
                    this.b.m().k("error");
                }
            }
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ qs1 b;

        public c(Ref.ObjectRef objectRef, qs1 qs1Var) {
            this.a = objectRef;
            this.b = qs1Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.o().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.o().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            if (securityModle != null) {
                try {
                    tu5.a aVar = tu5.a;
                    String str = (String) this.a.element;
                    byte[] bArrDecode = Base64.getDecoder().decode(securityModle.getData());
                    Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                    Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) UpdateDocResponse.class);
                    Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                    this.b.n().k((UpdateDocResponse) objFromJson);
                } catch (Exception unused2) {
                    this.b.o().k("error");
                }
            }
        }
    }

    public static final class d implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ qs1 b;

        public d(Ref.ObjectRef objectRef, qs1 qs1Var) {
            this.a = objectRef;
            this.b = qs1Var;
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
            if (securityModle != null) {
                try {
                    tu5.a aVar = tu5.a;
                    String str = (String) this.a.element;
                    byte[] bArrDecode = Base64.getDecoder().decode(securityModle.getData());
                    Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                    Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) DmsUploadRes.class);
                    Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                    this.b.j().k((DmsUploadRes) objFromJson);
                } catch (Exception unused2) {
                    this.b.k().k("error");
                }
            }
        }
    }

    public static final class e implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ qs1 b;

        public e(Ref.ObjectRef objectRef, qs1 qs1Var) {
            this.a = objectRef;
            this.b = qs1Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.r().k(th != null ? th.toString() : null);
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
            if (securityModle != null) {
                try {
                    tu5.a aVar = tu5.a;
                    String str = (String) this.a.element;
                    byte[] bArrDecode = Base64.getDecoder().decode(securityModle.getData());
                    Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                    Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) DMSViewDocModle.class);
                    Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                    this.b.q().k((DMSViewDocModle) objFromJson);
                } catch (Exception unused2) {
                    this.b.r().k("error");
                }
            }
        }
    }

    public qs1(cc1 repository) {
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.String] */
    public final void g(String appNo, String purposeCode, String state, int i, int i2, NrvDetails rcdetails) {
        Intrinsics.checkNotNullParameter(appNo, "appNo");
        Intrinsics.checkNotNullParameter(purposeCode, "purposeCode");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(rcdetails, "rcdetails");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.i0(appNo, purposeCode, state, i, i2, rcdetails).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.b(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new a(objectRef, this));
    }

    public final oy3 h() {
        return this.e;
    }

    public final oy3 i() {
        return this.f;
    }

    public final oy3 j() {
        return this.g;
    }

    public final oy3 k() {
        return this.h;
    }

    public final oy3 l() {
        return this.i;
    }

    public final oy3 m() {
        return this.j;
    }

    public final oy3 n() {
        return this.m;
    }

    public final oy3 o() {
        return this.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.String] */
    public final void p(String appNo, String purposeCode, String state, int i, int i2, NrvDetails rcdetails) {
        Intrinsics.checkNotNullParameter(appNo, "appNo");
        Intrinsics.checkNotNullParameter(purposeCode, "purposeCode");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(rcdetails, "rcdetails");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.i0(appNo, purposeCode, state, i, i2, rcdetails).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.b(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new b(objectRef, this));
    }

    public final oy3 q() {
        return this.k;
    }

    public final oy3 r() {
        return this.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void s(DmsUpdateRequest dmsupdate) {
        Intrinsics.checkNotNullParameter(dmsupdate, "dmsupdate");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.a(lc5.Companion.d(ls3.g.b("application/json"), VUtility.INSTANCE.w(dmsupdate).toString()), (String) objectRef.element).enqueue(new c(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void t(DmsUploadReq upload_req) {
        Intrinsics.checkNotNullParameter(upload_req, "upload_req");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this.d.c(lc5.Companion.d(ls3.g.b("application/json"), VUtility.INSTANCE.x(upload_req).toString()), (String) objectRef.element).enqueue(new d(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void u(String bucketName, String fileName, String appNo) {
        Intrinsics.checkNotNullParameter(bucketName, "bucketName");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(appNo, "appNo");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = VUtility.INSTANCE.A0(bucketName, fileName, appNo).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.d(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new e(objectRef, this));
    }
}
