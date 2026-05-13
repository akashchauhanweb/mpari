package com.nic.mparivahan.VahanServices.VahanLog;

import android.content.Context;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import com.google.gson.Gson;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.VahanCaptureRes;
import com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection;
import com.zepto.ih4;
import com.zepto.iy7;
import com.zepto.lc5;
import com.zepto.ls3;
import com.zepto.lx0;
import com.zepto.mt6;
import com.zepto.s14;
import com.zepto.s44;
import com.zepto.tu5;
import com.zepto.ws6;
import java.util.Base64;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J.\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanLog/SaveVahanlog;", "Landroidx/work/Worker;", "Landroidx/work/c$a;", "p", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "rc_details", "", "isEKYC", "app_no", "pur_code", "rtocode", "", "r", "Landroid/content/Context;", "f", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "g", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class SaveVahanlog extends Worker {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public Context context;

    /* JADX INFO: renamed from: com.nic.mparivahan.VahanServices.VahanLog.SaveVahanlog$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context, NrvDetails rcdetails, boolean z, String app_no, String pur_code, String rtocode) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(rcdetails, "rcdetails");
            Intrinsics.checkNotNullParameter(app_no, "app_no");
            Intrinsics.checkNotNullParameter(pur_code, "pur_code");
            Intrinsics.checkNotNullParameter(rtocode, "rtocode");
            String json = new Gson().toJson(rcdetails);
            Log.e("json->", json);
            androidx.work.b bVarA = new b.a().b("RC", json).b("isEKYC", Boolean.valueOf(z)).b(VContant.APP_NO, app_no).b("PurCode", pur_code).b("rtocode", rtocode).a();
            Intrinsics.checkNotNullExpressionValue(bVarA, "build(...)");
            iy7.c(context).a((ih4) ((ih4.a) ((ih4.a) new ih4.a(SaveVahanlog.class).j(bVarA)).h(new lx0.a().b(s44.CONNECTED).a())).a());
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;

        public b(Ref.ObjectRef objectRef) {
            this.a = objectRef;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            Log.e("Login eRRO", String.valueOf(th != null ? th.getMessage() : null));
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
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) VahanCaptureRes.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveVahanlog(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.context = context;
    }

    @Override // androidx.work.Worker
    public c.a p() {
        try {
            Object objFromJson = new Gson().fromJson(f().m("RC"), (Class<Object>) NrvDetails.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            NrvDetails nrvDetails = (NrvDetails) objFromJson;
            boolean zH = f().h("isEKYC", false);
            String strValueOf = String.valueOf(f().m(VContant.APP_NO));
            String strValueOf2 = String.valueOf(f().m("PurCode"));
            String strValueOf3 = String.valueOf(f().m("rtocode"));
            if (zH) {
                r(nrvDetails, "Y", strValueOf, strValueOf2, strValueOf3);
            } else {
                r(nrvDetails, "N", strValueOf, strValueOf2, strValueOf3);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("eRRO", Unit.INSTANCE.toString());
        }
        c.a aVarC = c.a.c();
        Intrinsics.checkNotNullExpressionValue(aVarC, "success(...)");
        return aVarC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    public final void r(NrvDetails rc_details, String isEKYC, String app_no, String pur_code, String rtocode) {
        Intrinsics.checkNotNullParameter(rc_details, "rc_details");
        Intrinsics.checkNotNullParameter(isEKYC, "isEKYC");
        Intrinsics.checkNotNullParameter(app_no, "app_no");
        Intrinsics.checkNotNullParameter(pur_code, "pur_code");
        Intrinsics.checkNotNullParameter(rtocode, "rtocode");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        ws6 ws6Var = new ws6(this.context);
        VahanServiceConnection vahanServiceConnectionB = VahanServiceConnection.INSTANCE.b(this.context);
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mt6.a.C(ws6Var.k(), ws6Var.l(), rc_details, isEKYC, app_no, pur_code, rtocode).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        vahanServiceConnectionB.saveVahanLog(s14.a.t() + "service/saveVahanLogDetails", aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new b(objectRef));
    }
}
