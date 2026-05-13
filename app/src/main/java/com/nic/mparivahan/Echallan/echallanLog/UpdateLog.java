package com.nic.mparivahan.Echallan.echallanLog;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import com.google.gson.Gson;
import com.nic.mparivahan.Echallan.Model.UpdateLogModel;
import com.nic.mparivahan.Echallan.Networking.SearchChallanService;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.ih4;
import com.zepto.iy7;
import com.zepto.lc5;
import com.zepto.ls3;
import com.zepto.lx0;
import com.zepto.s44;
import com.zepto.tu5;
import com.zepto.ws6;
import java.util.Base64;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J8\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, d2 = {"Lcom/nic/mparivahan/Echallan/echallanLog/UpdateLog;", "Landroidx/work/Worker;", "Landroidx/work/c$a;", "p", "", "paymentDate", "transId", "challanNo", "challanStatus", "receiptNo", "", "amount", "", "r", "Landroid/content/Context;", "f", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "g", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class UpdateLog extends Worker {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public Context context;

    /* JADX INFO: renamed from: com.nic.mparivahan.Echallan.echallanLog.UpdateLog$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context, String challanStatus, String challanPaymentDate, String challanReceiptNo, String challanTransId, String challanNo, double d) throws Throwable {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(challanStatus, "challanStatus");
            Intrinsics.checkNotNullParameter(challanPaymentDate, "challanPaymentDate");
            Intrinsics.checkNotNullParameter(challanReceiptNo, "challanReceiptNo");
            Intrinsics.checkNotNullParameter(challanTransId, "challanTransId");
            Intrinsics.checkNotNullParameter(challanNo, "challanNo");
            androidx.work.b bVarA = new b.a().b("paymentDate", challanPaymentDate).b("transId", challanTransId).b("challanNo", challanNo).b("challanStatus", challanStatus).b("receiptNo", challanReceiptNo).b("challanAmt", Double.valueOf(d)).a();
            Intrinsics.checkNotNullExpressionValue(bVarA, "build(...)");
            iy7.c(context).a((ih4) ((ih4.a) ((ih4.a) new ih4.a(UpdateLog.class).j(bVarA)).h(new lx0.a().b(s44.CONNECTED).a())).a());
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
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
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) UpdateLogModel.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateLog(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.context = context;
    }

    @Override // androidx.work.Worker
    public c.a p() {
        try {
            String strM = f().m("paymentDate");
            Intrinsics.checkNotNull(strM);
            String strM2 = f().m("transId");
            Intrinsics.checkNotNull(strM2);
            String strM3 = f().m("challanNo");
            Intrinsics.checkNotNull(strM3);
            String strM4 = f().m("challanStatus");
            Intrinsics.checkNotNull(strM4);
            String strM5 = f().m("receiptNo");
            Intrinsics.checkNotNull(strM5);
            r(strM, strM2, strM3, strM4, strM5, f().i("challanAmt", 0.0d));
        } catch (Exception e) {
            e.printStackTrace();
        }
        c.a aVarC = c.a.c();
        Intrinsics.checkNotNullExpressionValue(aVarC, "success(...)");
        return aVarC;
    }

    public final void r(String paymentDate, String transId, String challanNo, String challanStatus, String receiptNo, double amount) {
        ws6 ws6Var = new ws6(this.context);
        SearchChallanService searchChallanServiceB = SearchChallanService.INSTANCE.b(this.context);
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("echlogChallanStatus", challanStatus);
            jSONObject2.put("echlogCtzId", Long.parseLong(ws6Var.k()));
            jSONObject2.put("echlogMobileNo", ws6Var.l());
            jSONObject2.put("echlogPaymentDate", paymentDate);
            jSONObject2.put("echlogReceiptNo", receiptNo);
            jSONObject2.put("echlogTransId", transId);
            jSONObject2.put("echlogchallannumber", challanNo);
            jSONObject2.put("challanAmt", amount);
            jSONObject.put("Echallan", jSONObject2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String strValueOf = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        searchChallanServiceB.updateEchallanLog(aVar.d(ls3VarB, string), strValueOf).enqueue(new b(strValueOf));
    }
}
