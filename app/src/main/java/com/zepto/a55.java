package com.zepto;

import android.content.Context;
import android.provider.Settings;
import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.Account.Model.GetCitizenDetails;
import com.nic.mparivahan.RC.Model.GetSharedRecivedDoc;
import com.nic.mparivahan.RC.Model.GetVirtualDocDetails;
import com.nic.mparivahan.RC.Model.MyRcDeletResponse;
import com.nic.mparivahan.RC.Model.RcModelsDet;
import com.nic.mparivahan.RC.Model.SharedDocModle;
import com.nic.mparivahan.RC.Model.SharedRcDeletResponse;
import com.nic.mparivahan.RC.Model.ValidateRcSuccess;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.lc5;
import com.zepto.mt6;
import com.zepto.tu5;
import com.zepto.z45;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class a55 extends zq7 {
    public final oy3 A;
    public final oy3 B;
    public final oy3 C;
    public final oy3 D;
    public oy3 E;
    public final oy3 F;
    public oy3 G;
    public oy3 H;
    public oy3 I;
    public oy3 J;
    public final oy3 K;
    public final oy3 L;
    public final s45 d;
    public oy3 e;
    public oy3 f;
    public oy3 g;
    public oy3 h;
    public oy3 i;
    public oy3 j;
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
    public final oy3 z;

    public static final class a implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ a55 b;

        public a(Ref.ObjectRef objectRef, a55 a55Var) {
            this.a = objectRef;
            this.b = a55Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.y().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    this.b.y().k("error");
                    Log.d("RcDelete-", e.getLocalizedMessage());
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) MyRcDeletResponse.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.x().k((MyRcDeletResponse) objFromJson);
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ a55 b;

        public b(Ref.ObjectRef objectRef, a55 a55Var) {
            this.a = objectRef;
            this.b = a55Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.w().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    this.b.w().k("error");
                    Log.d("RcDelete-", e.getLocalizedMessage());
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) MyRcDeletResponse.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.v().k((MyRcDeletResponse) objFromJson);
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ a55 b;

        public c(Ref.ObjectRef objectRef, a55 a55Var) {
            this.a = objectRef;
            this.b = a55Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.A().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.A().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) MyRcDeletResponse.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.z().k((MyRcDeletResponse) objFromJson);
        }
    }

    public static final class d implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ a55 b;

        public d(Ref.ObjectRef objectRef, a55 a55Var) {
            this.a = objectRef;
            this.b = a55Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.C().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    this.b.C().k("error");
                    Log.d("deletSharedRc-", e.getLocalizedMessage());
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) SharedRcDeletResponse.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.B().k((SharedRcDeletResponse) objFromJson);
        }
    }

    public static final class e implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ a55 b;

        public e(Ref.ObjectRef objectRef, a55 a55Var) {
            this.a = objectRef;
            this.b = a55Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.K().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    this.b.K().k("error");
                    Log.d("deletSharedRc-", e.getLocalizedMessage());
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) SharedRcDeletResponse.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.J().k((SharedRcDeletResponse) objFromJson);
        }
    }

    public static final class f implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ a55 b;

        public f(Ref.ObjectRef objectRef, a55 a55Var) {
            this.a = objectRef;
            this.b = a55Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.q().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.q().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) RcModelsDet.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.p().k((RcModelsDet) objFromJson);
        }
    }

    public static final class g implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ a55 b;

        public g(Ref.ObjectRef objectRef, a55 a55Var) {
            this.a = objectRef;
            this.b = a55Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.W().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.W().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) ValidateRcSuccess.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.V().k((ValidateRcSuccess) objFromJson);
        }
    }

    public static final class h implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ a55 b;

        public h(Ref.ObjectRef objectRef, a55 a55Var) {
            this.a = objectRef;
            this.b = a55Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.S().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.S().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) RcModelsDet.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.R().k((RcModelsDet) objFromJson);
        }
    }

    public static final class i implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ a55 b;

        public i(Ref.ObjectRef objectRef, a55 a55Var) {
            this.a = objectRef;
            this.b = a55Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.S().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.S().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) RcModelsDet.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.R().k((RcModelsDet) objFromJson);
        }
    }

    public static final class j implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ a55 b;

        public j(Ref.ObjectRef objectRef, a55 a55Var) {
            this.a = objectRef;
            this.b = a55Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.t().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.t().k("error");
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
            this.b.u().k((GetCitizenDetails) objFromJson);
        }
    }

    public static final class k implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ a55 b;

        public k(Ref.ObjectRef objectRef, a55 a55Var) {
            this.a = objectRef;
            this.b = a55Var;
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
                } catch (Exception unused) {
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
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) RcModelsDet.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.O().k((RcModelsDet) objFromJson);
        }
    }

    public static final class l implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ a55 b;

        public l(Ref.ObjectRef objectRef, a55 a55Var) {
            this.a = objectRef;
            this.b = a55Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.E().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    Log.d("RecivedRc", e.getLocalizedMessage());
                    this.b.E().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) GetSharedRecivedDoc.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.D().k((GetSharedRecivedDoc) objFromJson);
        }
    }

    public static final class m implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ a55 b;

        public m(Ref.ObjectRef objectRef, a55 a55Var) {
            this.a = objectRef;
            this.b = a55Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.G().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.G().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) GetSharedRecivedDoc.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.F().k((GetSharedRecivedDoc) objFromJson);
        }
    }

    public static final class n implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ a55 b;

        public n(Ref.ObjectRef objectRef, a55 a55Var) {
            this.a = objectRef;
            this.b = a55Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.M().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    Log.d("VirtualRcDetails-", e.getLocalizedMessage());
                    this.b.M().k("error-->");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) GetVirtualDocDetails.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.L().k((GetVirtualDocDetails) objFromJson);
        }
    }

    public static final class o implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ a55 b;

        public o(Ref.ObjectRef objectRef, a55 a55Var) {
            this.a = objectRef;
            this.b = a55Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.I().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    Log.d("SharedDoc-", e.getLocalizedMessage());
                    this.b.I().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) SharedDocModle.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.H().k((SharedDocModle) objFromJson);
        }
    }

    public static final class p implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ a55 b;

        public p(Ref.ObjectRef objectRef, a55 a55Var) {
            this.a = objectRef;
            this.b = a55Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.T().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    this.b.T().k("error");
                    Log.d("virtualRcDoc", e.getLocalizedMessage());
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) MyRcDeletResponse.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.U().k((MyRcDeletResponse) objFromJson);
        }
    }

    public a55(s45 repository) {
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
        this.z = new oy3();
        this.A = new oy3();
        this.B = new oy3();
        this.C = new oy3();
        this.D = new oy3();
        this.E = new oy3();
        this.F = new oy3();
        this.G = new oy3();
        this.H = new oy3();
        this.I = new oy3();
        this.J = new oy3();
        this.K = new oy3();
        this.L = new oy3();
    }

    public final oy3 A() {
        return this.z;
    }

    public final oy3 B() {
        return this.u;
    }

    public final oy3 C() {
        return this.v;
    }

    public final oy3 D() {
        return this.q;
    }

    public final oy3 E() {
        return this.r;
    }

    public final oy3 F() {
        return this.o;
    }

    public final oy3 G() {
        return this.p;
    }

    public final oy3 H() {
        return this.m;
    }

    public final oy3 I() {
        return this.n;
    }

    public final oy3 J() {
        return this.s;
    }

    public final oy3 K() {
        return this.t;
    }

    public final oy3 L() {
        return this.w;
    }

    public final oy3 M() {
        return this.x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.String] */
    public final void N(String mString, String user_id, Context con) {
        Intrinsics.checkNotNullParameter(mString, "mString");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(con, "con");
        String string = Settings.Secure.getString(con.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(con);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        z45.a aVar2 = z45.a;
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.f(mString, user_id, string, ws6Var.l(), ws6Var.e()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.d.d(aVar.d(ls3VarB, string2), (String) objectRef.element).enqueue(new k(objectRef, this));
    }

    public final oy3 O() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    public final void P(String citizenId, Context con) {
        Intrinsics.checkNotNullParameter(citizenId, "citizenId");
        Intrinsics.checkNotNullParameter(con, "con");
        String string = Settings.Secure.getString(con.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(con);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        z45.a aVar2 = z45.a;
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.i(citizenId, string, ws6Var.l(), ws6Var.e()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.d.e(aVar.d(ls3VarB, string2), (String) objectRef.element).enqueue(new l(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    public final void Q(String citizenId, Context con) {
        Intrinsics.checkNotNullParameter(citizenId, "citizenId");
        Intrinsics.checkNotNullParameter(con, "con");
        String string = Settings.Secure.getString(con.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(con);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        z45.a aVar2 = z45.a;
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.i(citizenId, string, ws6Var.l(), ws6Var.e()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.d.e(aVar.d(ls3VarB, string2), (String) objectRef.element).enqueue(new m(objectRef, this));
    }

    public final oy3 R() {
        return this.G;
    }

    public final oy3 S() {
        return this.H;
    }

    public final oy3 T() {
        return this.D;
    }

    public final oy3 U() {
        return this.C;
    }

    public final oy3 V() {
        return this.g;
    }

    public final oy3 W() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    public final void X(String citizenId, Context con) {
        Intrinsics.checkNotNullParameter(citizenId, "citizenId");
        Intrinsics.checkNotNullParameter(con, "con");
        String string = Settings.Secure.getString(con.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(con);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        mt6.a aVar2 = mt6.a;
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.j(citizenId, string, ws6Var.l(), ws6Var.e()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.d.g(aVar.d(ls3VarB, string2), (String) objectRef.element).enqueue(new n(objectRef, this));
    }

    public final oy3 Y() {
        return this.j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.String] */
    public final void Z(String citizenId, String docnumber, String shared_id, String shared_days, Context con) {
        Intrinsics.checkNotNullParameter(citizenId, "citizenId");
        Intrinsics.checkNotNullParameter(docnumber, "docnumber");
        Intrinsics.checkNotNullParameter(shared_id, "shared_id");
        Intrinsics.checkNotNullParameter(shared_days, "shared_days");
        Intrinsics.checkNotNullParameter(con, "con");
        String string = Settings.Secure.getString(con.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(con);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        z45.a aVar2 = z45.a;
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.g(citizenId, docnumber, shared_id, shared_days, string, ws6Var.l(), ws6Var.e()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.d.h(aVar.d(ls3VarB, string2), (String) objectRef.element).enqueue(new o(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.String] */
    public final void a0(String doc_id, String docType, Context con) {
        Intrinsics.checkNotNullParameter(doc_id, "doc_id");
        Intrinsics.checkNotNullParameter(docType, "docType");
        Intrinsics.checkNotNullParameter(con, "con");
        String string = Settings.Secure.getString(con.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(con);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        z45.a aVar2 = z45.a;
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.c(doc_id, docType, string, ws6Var.l(), ws6Var.e(), ws6Var.k()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.d.i(aVar.d(ls3VarB, string2), (String) objectRef.element).enqueue(new p(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.String] */
    public final void g(String doc_id, Context con) {
        Intrinsics.checkNotNullParameter(doc_id, "doc_id");
        Intrinsics.checkNotNullParameter(con, "con");
        String string = Settings.Secure.getString(con.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(con);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        z45.a aVar2 = z45.a;
        Intrinsics.checkNotNull(string);
        this.d.b(aVar.d(ls3VarB, String.valueOf(aVar2.b(doc_id, string, ws6Var.l(), ws6Var.k(), "DL", ws6Var.e()))), (String) objectRef.element).enqueue(new a(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.String] */
    public final void h(String doc_id, Context con) {
        Intrinsics.checkNotNullParameter(doc_id, "doc_id");
        Intrinsics.checkNotNullParameter(con, "con");
        String string = Settings.Secure.getString(con.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(con);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        z45.a aVar2 = z45.a;
        Intrinsics.checkNotNull(string);
        this.d.b(aVar.d(ls3VarB, String.valueOf(aVar2.b(doc_id, string, ws6Var.l(), ws6Var.k(), "DL", ws6Var.e()))), (String) objectRef.element).enqueue(new b(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.String] */
    public final void i(String doc_id, Context con) {
        Intrinsics.checkNotNullParameter(doc_id, "doc_id");
        Intrinsics.checkNotNullParameter(con, "con");
        String string = Settings.Secure.getString(con.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(con);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        z45.a aVar2 = z45.a;
        Intrinsics.checkNotNull(string);
        this.d.b(aVar.d(ls3VarB, String.valueOf(aVar2.b(doc_id, string, ws6Var.l(), ws6Var.k(), "RC", ws6Var.e()))), (String) objectRef.element).enqueue(new c(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.String] */
    public final void j(String shared_id, String Citizen_id, Context con) {
        Intrinsics.checkNotNullParameter(shared_id, "shared_id");
        Intrinsics.checkNotNullParameter(Citizen_id, "Citizen_id");
        Intrinsics.checkNotNullParameter(con, "con");
        String string = Settings.Secure.getString(con.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(con);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        z45.a aVar2 = z45.a;
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.h(shared_id, Citizen_id, string, ws6Var.l(), ws6Var.e()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.d.c(aVar.d(ls3VarB, string2), (String) objectRef.element).enqueue(new d(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.String] */
    public final void k(String shared_id, String Citizen_id, Context con) {
        Intrinsics.checkNotNullParameter(shared_id, "shared_id");
        Intrinsics.checkNotNullParameter(Citizen_id, "Citizen_id");
        Intrinsics.checkNotNullParameter(con, "con");
        String string = Settings.Secure.getString(con.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(con);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        z45.a aVar2 = z45.a;
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.h(shared_id, Citizen_id, string, ws6Var.l(), ws6Var.e()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.d.c(aVar.d(ls3VarB, string2), (String) objectRef.element).enqueue(new e(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.String] */
    public final void l(String rc, Context con) {
        Intrinsics.checkNotNullParameter(rc, "rc");
        Intrinsics.checkNotNullParameter(con, "con");
        String string = Settings.Secure.getString(con.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(con);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        z45.a aVar2 = z45.a;
        String strK = ws6Var.k();
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.f(rc, strK, string, ws6Var.l(), ws6Var.e()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.d.d(aVar.d(ls3VarB, string2), (String) objectRef.element).enqueue(new f(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.String] */
    public final void m(String mString, String user_id, String chass, String engin_no, Context con, String type) {
        Intrinsics.checkNotNullParameter(mString, "mString");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(chass, "chass");
        Intrinsics.checkNotNullParameter(engin_no, "engin_no");
        Intrinsics.checkNotNullParameter(con, "con");
        Intrinsics.checkNotNullParameter(type, "type");
        String string = Settings.Secure.getString(con.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(con);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        z45.a aVar2 = z45.a;
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.a(mString, user_id, chass, engin_no, string, ws6Var.l().toString(), type, ws6Var.e()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.d.j(aVar.d(ls3VarB, string2), (String) objectRef.element).enqueue(new g(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.String] */
    public final void n(String recordId, String docId, Context con) {
        Intrinsics.checkNotNullParameter(recordId, "recordId");
        Intrinsics.checkNotNullParameter(docId, "docId");
        Intrinsics.checkNotNullParameter(con, "con");
        String string = Settings.Secure.getString(con.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(con);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        z45.a aVar2 = z45.a;
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.d(recordId, docId, string, ws6Var.l().toString(), ws6Var.e(), ws6Var.k()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.d.a(aVar.d(ls3VarB, string2), (String) objectRef.element).enqueue(new h(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.String] */
    public final void o(String recordId, String docId, Context con) {
        Intrinsics.checkNotNullParameter(recordId, "recordId");
        Intrinsics.checkNotNullParameter(docId, "docId");
        Intrinsics.checkNotNullParameter(con, "con");
        String string = Settings.Secure.getString(con.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(con);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        z45.a aVar2 = z45.a;
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.e(recordId, docId, string, ws6Var.l().toString(), ws6Var.e()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        this.d.a(aVar.d(ls3VarB, string2), (String) objectRef.element).enqueue(new i(objectRef, this));
    }

    public final oy3 p() {
        return this.I;
    }

    public final oy3 q() {
        return this.J;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void r(String mobile_no, Context context) {
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
        this.d.f(aVar.d(ls3VarB, string2), (String) objectRef.element).enqueue(new j(objectRef, this));
    }

    public final oy3 s() {
        return this.f;
    }

    public final oy3 t() {
        return this.l;
    }

    public final oy3 u() {
        return this.k;
    }

    public final oy3 v() {
        return this.K;
    }

    public final oy3 w() {
        return this.L;
    }

    public final oy3 x() {
        return this.A;
    }

    public final oy3 y() {
        return this.B;
    }

    public final oy3 z() {
        return this.y;
    }
}
