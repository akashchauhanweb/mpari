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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 %2\u00020\u0001:\u0001&B\u0017\u0012\u0006\u0010 \u001a\u00020\u0019\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0088\u0001\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0088\u0001\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0002R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006'"}, d2 = {"Lcom/nic/mparivahan/DlLog/kycPackage/SaveKycRes;", "Landroidx/work/Worker;", "Landroidx/work/c$a;", "p", "", "appUid", "appName", "appDob", "appGender", "appRelation", "appRelName", "appHouse", "appStreet", "appLm", "appLoc", "appVtc", "appDist", "appState", "appPc", "appPhoto", "appMobileNum", "", "r", "Lorg/json/JSONObject;", "s", "Landroid/content/Context;", "f", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "g", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class SaveKycRes extends Worker {

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
    public SaveKycRes(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.context = context;
    }

    @Override // androidx.work.Worker
    public c.a p() {
        try {
            r(String.valueOf(f().m("appUid")), String.valueOf(f().m("appName")), String.valueOf(f().m("appDob")), String.valueOf(f().m("appGender")), String.valueOf(f().m("appRelation")), String.valueOf(f().m("appRelName")), String.valueOf(f().m("appHouse")), String.valueOf(f().m("appStreet")), String.valueOf(f().m("appLm")), String.valueOf(f().m("appLoc")), String.valueOf(f().m("appVtc")), String.valueOf(f().m("appDist")), String.valueOf(f().m("appState")), String.valueOf(f().m("appPc")), String.valueOf(f().m("appPhoto")), String.valueOf(f().m("appMobileNum")));
        } catch (Exception unused) {
        }
        c.a aVarC = c.a.c();
        Intrinsics.checkNotNullExpressionValue(aVarC, "success(...)");
        return aVarC;
    }

    public final void r(String appUid, String appName, String appDob, String appGender, String appRelation, String appRelName, String appHouse, String appStreet, String appLm, String appLoc, String appVtc, String appDist, String appState, String appPc, String appPhoto, String appMobileNum) {
        DlLogInterface dlLogInterfaceB = DlLogInterface.INSTANCE.b(this.context);
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = s(appUid, appName, appDob, appGender, appRelation, appRelName, appHouse, appStreet, appLm, appLoc, appVtc, appDist, appState, appPc, appPhoto, appMobileNum).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        dlLogInterfaceB.saveKycReq(lc5VarD, strValueOf).enqueue(new b(strValueOf));
    }

    public final JSONObject s(String appUid, String appName, String appDob, String appGender, String appRelation, String appRelName, String appHouse, String appStreet, String appLm, String appLoc, String appVtc, String appDist, String appState, String appPc, String appPhoto, String appMobileNum) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("appUid", appUid);
            jSONObject2.put("appName", appName);
            jSONObject2.put("appDob", appDob);
            jSONObject2.put("appGender", appGender);
            jSONObject2.put("appRelation", appRelation);
            jSONObject2.put("appRelName", appRelName);
            jSONObject2.put("appHouse", appHouse);
            jSONObject2.put("appStreet", appStreet);
            jSONObject2.put("appLm", appLm);
            jSONObject2.put("appLoc", appLoc);
            jSONObject2.put("appVtc", appVtc);
            jSONObject2.put("appDist", appDist);
            jSONObject2.put("appState", appState);
            jSONObject2.put("appPc", appPc);
            jSONObject2.put("appPhoto", appPhoto);
            jSONObject2.put("appMobileNum", appMobileNum);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("applAadhaar", jSONObject2);
            return jSONObject3;
        } catch (Exception unused) {
            return jSONObject;
        }
    }
}
