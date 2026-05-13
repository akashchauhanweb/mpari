package com.nic.mparivahan.DlLog.kycPackage;

import android.content.Context;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.dlservices.DlLog.DlLogInterface;
import com.zepto.lc5;
import com.zepto.ls3;
import com.zepto.tu5;
import java.util.Base64;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J.\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ0\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/nic/mparivahan/DlLog/kycPackage/SaveOtpRes;", "Landroidx/work/Worker;", "Landroidx/work/c$a;", "p", "", "avAadharno", "avRtoCode", "avTxn", "avExt1", "", "avAccd", "", "r", "Lorg/json/JSONObject;", "s", "Landroid/content/Context;", "f", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "g", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class SaveOtpRes extends Worker {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public Context context;

    public static final class b implements Callback {
        public final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
        }

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
            tu5.a aVar = tu5.a;
            String str = this.a;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Log.d("valiii", String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveOtpRes(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.context = context;
    }

    @Override // androidx.work.Worker
    public c.a p() {
        try {
            r(String.valueOf(f().m("avAadharno")), String.valueOf(f().m("avRtoCode")), String.valueOf(f().m("avTxn")), String.valueOf(f().m("avExt1")), f().j("avAccd", 0));
        } catch (Exception unused) {
        }
        c.a aVarC = c.a.c();
        Intrinsics.checkNotNullExpressionValue(aVarC, "success(...)");
        return aVarC;
    }

    public final void r(String avAadharno, String avRtoCode, String avTxn, String avExt1, int avAccd) {
        Intrinsics.checkNotNullParameter(avAadharno, "avAadharno");
        Intrinsics.checkNotNullParameter(avRtoCode, "avRtoCode");
        Intrinsics.checkNotNullParameter(avTxn, "avTxn");
        Intrinsics.checkNotNullParameter(avExt1, "avExt1");
        DlLogInterface dlLogInterfaceB = DlLogInterface.INSTANCE.b(this.context);
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = s(avAadharno, avRtoCode, avTxn, avExt1, avAccd).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        dlLogInterfaceB.saveOtpResInter(lc5VarD, strValueOf).enqueue(new b(strValueOf));
    }

    public final JSONObject s(String avAadharno, String avRtoCode, String avTxn, String avExt1, int avAccd) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("avAadharno", avAadharno);
            jSONObject2.put("avRtoCode", avRtoCode);
            jSONObject2.put("avTxn", avTxn);
            jSONObject2.put("avExt1", avExt1);
            jSONObject2.put("avAccd", avAccd);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("mSaveOtpRes", jSONObject2);
            return jSONObject3;
        } catch (Exception unused) {
            return jSONObject;
        }
    }
}
