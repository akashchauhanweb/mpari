package com.zepto;

import android.util.Log;
import com.google.gson.Gson;
import com.nic.mparivahan.Citizen.Models.AccidentReportDetails;
import com.nic.mparivahan.Citizen.Models.ComplaintList;
import com.nic.mparivahan.Citizen.Models.GetDashboardPojo;
import com.nic.mparivahan.Citizen.Models.GetLastAccident;
import com.nic.mparivahan.Citizen.Models.GetLastViolation;
import com.nic.mparivahan.Citizen.Models.GetOffenceList;
import com.nic.mparivahan.Citizen.Models.GetStated;
import com.nic.mparivahan.Citizen.Models.GetTrafficFeedback;
import com.nic.mparivahan.Citizen.Models.GetViolationEvidenceResponse;
import com.nic.mparivahan.Citizen.Models.SaveVioFeedBack;
import com.nic.mparivahan.Citizen.Models.SubmitOffenceReport;
import com.nic.mparivahan.Citizen.Models.VerifyVehicleResponseModel;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.lc5;
import com.zepto.tu5;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public final class vf4 extends zq7 {
    public final oy3 A;
    public oy3 B;
    public final oy3 C;
    public oy3 D;
    public final oy3 E;
    public oy3 F;
    public final oy3 G;
    public final oy3 H;
    public final oy3 I;
    public final of4 d;
    public oy3 e;
    public final oy3 f;
    public oy3 g;
    public final oy3 h;
    public final oy3 i;
    public final oy3 j;
    public final oy3 k;
    public final oy3 l;
    public final oy3 m;
    public final oy3 n;
    public oy3 o;
    public final oy3 p;
    public oy3 q;
    public final oy3 r;
    public oy3 s;
    public final oy3 t;
    public oy3 u;
    public oy3 v;
    public final oy3 w;
    public oy3 x;
    public final oy3 y;
    public oy3 z;

    public static final class a implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ vf4 b;

        public a(Ref.ObjectRef objectRef, vf4 vf4Var) {
            this.a = objectRef;
            this.b = vf4Var;
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
                } catch (Exception unused) {
                    this.b.l().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) GetDashboardPojo.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.u().k((GetDashboardPojo) objFromJson);
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ vf4 b;

        public b(Ref.ObjectRef objectRef, vf4 vf4Var) {
            this.a = objectRef;
            this.b = vf4Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.F().k(th != null ? th.getMessage() : null);
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
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) AccidentReportDetails.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.E().k((AccidentReportDetails) objFromJson);
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ vf4 b;

        public c(Ref.ObjectRef objectRef, vf4 vf4Var) {
            this.a = objectRef;
            this.b = vf4Var;
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
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) ui2.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            wb0.a(objFromJson);
            this.b.v().k(null);
        }
    }

    public static final class d implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ vf4 b;

        public d(Ref.ObjectRef objectRef, vf4 vf4Var) {
            this.a = objectRef;
            this.b = vf4Var;
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
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) GetViolationEvidenceResponse.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.B().k((GetViolationEvidenceResponse) objFromJson);
        }
    }

    public static final class e implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ vf4 b;

        public e(Ref.ObjectRef objectRef, vf4 vf4Var) {
            this.a = objectRef;
            this.b = vf4Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.n().k(th != null ? th.getMessage() : null);
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
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) GetDashboardPojo.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.w().k((GetDashboardPojo) objFromJson);
        }
    }

    public static final class f implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ vf4 b;

        public f(Ref.ObjectRef objectRef, vf4 vf4Var) {
            this.a = objectRef;
            this.b = vf4Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.p().k(th != null ? th.getMessage() : null);
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
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) GetLastAccident.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.x().k((GetLastAccident) objFromJson);
        }
    }

    public static final class g implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ vf4 b;

        public g(Ref.ObjectRef objectRef, vf4 vf4Var) {
            this.a = objectRef;
            this.b = vf4Var;
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
                    e.printStackTrace();
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
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) GetLastViolation.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.y().k((GetLastViolation) objFromJson);
        }
    }

    public static final class h implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ vf4 b;

        public h(Ref.ObjectRef objectRef, vf4 vf4Var) {
            this.a = objectRef;
            this.b = vf4Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.r().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.r().k("Error");
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) GetStated.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.z().k((GetStated) objFromJson);
        }
    }

    public static final class i implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ vf4 b;

        public i(Ref.ObjectRef objectRef, vf4 vf4Var) {
            this.a = objectRef;
            this.b = vf4Var;
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
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) GetTrafficFeedback.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.A().k((GetTrafficFeedback) objFromJson);
        }
    }

    public static final class j implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ vf4 b;

        public j(Ref.ObjectRef objectRef, vf4 vf4Var) {
            this.a = objectRef;
            this.b = vf4Var;
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
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) GetViolationEvidenceResponse.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.B().k((GetViolationEvidenceResponse) objFromJson);
        }
    }

    public static final class k implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ vf4 b;

        public k(Ref.ObjectRef objectRef, vf4 vf4Var) {
            this.a = objectRef;
            this.b = vf4Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.H().k(th != null ? th.getMessage() : null);
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
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) ComplaintList.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.G().k((ComplaintList) objFromJson);
        }
    }

    public static final class l implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ vf4 b;

        public l(Ref.ObjectRef objectRef, vf4 vf4Var) {
            this.a = objectRef;
            this.b = vf4Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.O().k(th != null ? th.toString() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.b.O().k("error");
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
            Log.e("offences-", strValueOf);
            Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) GetOffenceList.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.N().k((GetOffenceList) objFromJson);
        }
    }

    public static final class m implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ vf4 b;

        public m(Ref.ObjectRef objectRef, vf4 vf4Var) {
            this.a = objectRef;
            this.b = vf4Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.Q().k(th != null ? th.getMessage() : null);
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
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) SaveVioFeedBack.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.P().k((SaveVioFeedBack) objFromJson);
        }
    }

    public static final class n implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ vf4 b;

        public n(Ref.ObjectRef objectRef, vf4 vf4Var) {
            this.a = objectRef;
            this.b = vf4Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.J().k(th != null ? th.getMessage() : null);
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
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) SubmitOffenceReport.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.K().k((SubmitOffenceReport) objFromJson);
        }
    }

    public static final class o implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ vf4 b;

        public o(Ref.ObjectRef objectRef, vf4 vf4Var) {
            this.a = objectRef;
            this.b = vf4Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.b.I().k(th != null ? th.getMessage() : null);
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
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) SaveVioFeedBack.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.L().k((SaveVioFeedBack) objFromJson);
        }
    }

    public static final class p implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ vf4 b;

        public p(Ref.ObjectRef objectRef, vf4 vf4Var) {
            this.a = objectRef;
            this.b = vf4Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            Log.e("timeout2", String.valueOf(th != null ? th.getMessage() : null));
            this.b.q().k(th != null ? th.getMessage() : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    Log.e("timeout1", e.toString());
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
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) SubmitOffenceReport.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            this.b.M().k((SubmitOffenceReport) objFromJson);
        }
    }

    public static final class q implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ vf4 b;

        public q(Ref.ObjectRef objectRef, vf4 vf4Var) {
            this.a = objectRef;
            this.b = vf4Var;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            oy3 oy3VarT = this.b.t();
            String message = t.getMessage();
            Intrinsics.checkNotNull(message);
            oy3VarT.k(message);
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
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) VerifyVehicleResponseModel.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                this.b.T().k((VerifyVehicleResponseModel) objFromJson);
            } catch (Exception e) {
                oy3 oy3VarT = this.b.t();
                String message = e.getMessage();
                Intrinsics.checkNotNull(message);
                oy3VarT.k(message);
            }
        }
    }

    public vf4(of4 repository) {
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
    }

    public final oy3 A() {
        return this.u;
    }

    public final oy3 B() {
        return this.v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void C(String cit_id) {
        Intrinsics.checkNotNullParameter(cit_id, "cit_id");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = tf4.a.k(cit_id).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.g(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new f(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void D(String cit_id) {
        Intrinsics.checkNotNullParameter(cit_id, "cit_id");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = tf4.a.l(cit_id).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.h(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new g(objectRef, this));
    }

    public final oy3 E() {
        return this.q;
    }

    public final oy3 F() {
        return this.r;
    }

    public final oy3 G() {
        return this.g;
    }

    public final oy3 H() {
        return this.h;
    }

    public final oy3 I() {
        return this.l;
    }

    public final oy3 J() {
        return this.p;
    }

    public final oy3 K() {
        return this.o;
    }

    public final oy3 L() {
        return this.k;
    }

    public final oy3 M() {
        return this.e;
    }

    public final oy3 N() {
        return this.i;
    }

    public final oy3 O() {
        return this.j;
    }

    public final oy3 P() {
        return this.m;
    }

    public final oy3 Q() {
        return this.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void R(String states) {
        Intrinsics.checkNotNullParameter(states, "states");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = tf4.a.o(states).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.j(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new h(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void S(String feedbackViolationId) {
        Intrinsics.checkNotNullParameter(feedbackViolationId, "feedbackViolationId");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = tf4.a.p(feedbackViolationId).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.k(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new i(objectRef, this));
    }

    public final oy3 T() {
        return this.H;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void U(String violationId) {
        Intrinsics.checkNotNullParameter(violationId, "violationId");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = tf4.a.r(violationId).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.l(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new j(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void V(String userId, String startDate, String endDate) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = tf4.a.m(userId, startDate, endDate).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.i(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new k(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void W(String stateCode) throws JSONException {
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("offenceStatus", 1);
        jSONObject.put("stateCd", stateCode);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("mparOffence", jSONObject);
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = jSONObject2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.e(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new l(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void X(String feedbackRemarks, String feedbackViolationId) {
        Intrinsics.checkNotNullParameter(feedbackRemarks, "feedbackRemarks");
        Intrinsics.checkNotNullParameter(feedbackViolationId, "feedbackViolationId");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = tf4.a.s(feedbackRemarks, feedbackViolationId).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.m(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new m(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17, types: [T, java.lang.String] */
    public final void Y(String userId, String disticId, String location, String locLat, String loc, String locLong, String regNo, String remarks, String stateCode, String updatedByName, String uploadedImgValue, String imageFileName, String uploadedVideoFilePath, String videoFileName, boolean z, String mid, String did, String tid) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(disticId, "disticId");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(locLat, "locLat");
        Intrinsics.checkNotNullParameter(loc, "loc");
        Intrinsics.checkNotNullParameter(locLong, "locLong");
        Intrinsics.checkNotNullParameter(regNo, "regNo");
        Intrinsics.checkNotNullParameter(remarks, "remarks");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        Intrinsics.checkNotNullParameter(updatedByName, "updatedByName");
        Intrinsics.checkNotNullParameter(uploadedImgValue, "uploadedImgValue");
        Intrinsics.checkNotNullParameter(imageFileName, "imageFileName");
        Intrinsics.checkNotNullParameter(uploadedVideoFilePath, "uploadedVideoFilePath");
        Intrinsics.checkNotNullParameter(videoFileName, "videoFileName");
        Intrinsics.checkNotNullParameter(mid, "mid");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(tid, "tid");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = tf4.a.z(userId, disticId, location, locLat, loc, locLong, regNo, remarks, stateCode, updatedByName, uploadedImgValue, imageFileName, uploadedVideoFilePath, videoFileName, z, mid, did, tid).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.n(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new n(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void Z(String feedbackRemarks, String feedbackViolationId) {
        Intrinsics.checkNotNullParameter(feedbackRemarks, "feedbackRemarks");
        Intrinsics.checkNotNullParameter(feedbackViolationId, "feedbackViolationId");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = tf4.a.A(feedbackRemarks, feedbackViolationId).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.o(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new o(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17, types: [T, java.lang.String] */
    public final void a0(String userId, String disticId, String location, String locLat, String loc, String locLong, int i2, String regNo, String remarks, String stateCode, String updatedByName, String uploadedImgValue, String imageFileName, String uploadedVideoFilePath, String videoFileName, boolean z, String mid, String did, String tid) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(disticId, "disticId");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(locLat, "locLat");
        Intrinsics.checkNotNullParameter(loc, "loc");
        Intrinsics.checkNotNullParameter(locLong, "locLong");
        Intrinsics.checkNotNullParameter(regNo, "regNo");
        Intrinsics.checkNotNullParameter(remarks, "remarks");
        Intrinsics.checkNotNullParameter(stateCode, "stateCode");
        Intrinsics.checkNotNullParameter(updatedByName, "updatedByName");
        Intrinsics.checkNotNullParameter(uploadedImgValue, "uploadedImgValue");
        Intrinsics.checkNotNullParameter(imageFileName, "imageFileName");
        Intrinsics.checkNotNullParameter(uploadedVideoFilePath, "uploadedVideoFilePath");
        Intrinsics.checkNotNullParameter(videoFileName, "videoFileName");
        Intrinsics.checkNotNullParameter(mid, "mid");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(tid, "tid");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = tf4.a.n(userId, disticId, location, locLat, loc, locLong, i2, regNo, remarks, stateCode, updatedByName, uploadedImgValue, imageFileName, uploadedVideoFilePath, videoFileName, z, mid, did, tid).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.p(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new p(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.String] */
    public final void b0(String vehicleNo, long j2, String mid, String did, String tid) {
        Intrinsics.checkNotNullParameter(vehicleNo, "vehicleNo");
        Intrinsics.checkNotNullParameter(mid, "mid");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(tid, "tid");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = tf4.a.q(vehicleNo, j2, mid, did, tid).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.q(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new q(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void g(String cit_id) {
        Intrinsics.checkNotNullParameter(cit_id, "cit_id");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = tf4.a.e(cit_id).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.a(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new a(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void h(String userId, String startDate, String endDate) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = tf4.a.f(userId, startDate, endDate).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.b(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new b(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void i(String feedbackAccidentId) {
        Intrinsics.checkNotNullParameter(feedbackAccidentId, "feedbackAccidentId");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = tf4.a.g(feedbackAccidentId).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.c(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new c(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void j(String violationId) {
        Intrinsics.checkNotNullParameter(violationId, "violationId");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = tf4.a.h(violationId).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.d(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new d(objectRef, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void k(String cit_id) {
        Intrinsics.checkNotNullParameter(cit_id, "cit_id");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = tf4.a.i(cit_id).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.d.f(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new e(objectRef, this));
    }

    public final oy3 l() {
        return this.E;
    }

    public final oy3 m() {
        return this.t;
    }

    public final oy3 n() {
        return this.C;
    }

    public final oy3 o() {
        return this.y;
    }

    public final oy3 p() {
        return this.A;
    }

    public final oy3 q() {
        return this.f;
    }

    public final oy3 r() {
        return this.G;
    }

    public final oy3 s() {
        return this.w;
    }

    public final oy3 t() {
        return this.I;
    }

    public final oy3 u() {
        return this.D;
    }

    public final oy3 v() {
        return this.s;
    }

    public final oy3 w() {
        return this.B;
    }

    public final oy3 x() {
        return this.z;
    }

    public final oy3 y() {
        return this.x;
    }

    public final oy3 z() {
        return this.F;
    }
}
