package com.nic.mparivahan.PushNotification;

import android.content.Context;
import android.provider.Settings;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import com.google.gson.Gson;
import com.nic.mparivahan.APIController;
import com.nic.mparivahan.Account.Model.UserLoginModel;
import com.nic.mparivahan.Account.SignService;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.cq;
import com.zepto.lc5;
import com.zepto.ls3;
import com.zepto.mt6;
import com.zepto.s14;
import com.zepto.tu5;
import com.zepto.ws6;
import java.util.Base64;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/nic/mparivahan/PushNotification/LoginServiceToken;", "Landroidx/work/Worker;", "Landroidx/work/c$a;", "p", "", "s", "Landroid/content/Context;", "f", "Landroid/content/Context;", "r", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "g", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class LoginServiceToken extends Worker {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public Context context;

    public static final class b implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ LoginServiceToken b;
        public final /* synthetic */ Ref.ObjectRef c;

        public b(Ref.ObjectRef objectRef, LoginServiceToken loginServiceToken, Ref.ObjectRef objectRef2) {
            this.a = objectRef;
            this.b = loginServiceToken;
            this.c = objectRef2;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            ws6 ws6Var = new ws6(this.b.getContext());
            if (ws6Var.u()) {
                ws6Var.v();
                DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(this.b.getContext());
                Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
                databaseHelperD0.m0();
                databaseHelperD0.close();
                new cq(this.b.getContext()).e();
                NaxpToKenService.INSTANCE.a(this.b.getContext());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    Log.d("loginToken-", e.getLocalizedMessage());
                    e.printStackTrace();
                    ws6 ws6Var = new ws6(this.b.getContext());
                    if (ws6Var.u()) {
                        ws6Var.v();
                        DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(this.b.getContext());
                        Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
                        databaseHelperD0.m0();
                        databaseHelperD0.close();
                        new cq(this.b.getContext()).e();
                        NaxpToKenService.INSTANCE.a(this.b.getContext());
                        return;
                    }
                    return;
                }
            } else {
                securityModle = null;
            }
            tu5.a aVar = tu5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) UserLoginModel.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            String token = ((UserLoginModel) objFromJson).getToken();
            if (token != null) {
                ((ws6) this.c.element).z(token);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginServiceToken(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.context = context;
    }

    @Override // androidx.work.Worker
    public c.a p() {
        try {
            s();
        } catch (Exception unused) {
        }
        c.a aVarC = c.a.c();
        Intrinsics.checkNotNullExpressionValue(aVarC, "success(...)");
        return aVarC;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, com.zepto.ws6] */
    public final void s() {
        String string = Settings.Secure.getString(this.context.getContentResolver(), "android_id");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = new ws6(this.context);
        SignService signServiceA = SignService.INSTANCE.a(this.context);
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        mt6.a aVar2 = mt6.a;
        String strK = ((ws6) objectRef2.element).k();
        String strL = ((ws6) objectRef2.element).l();
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.F(strK, strL, string, ((ws6) objectRef2.element).m(), this.context).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        signServiceA.getUserLogin(s14.a.q() + APIController.a().UserLogin(), aVar.d(ls3VarB, string2), (String) objectRef.element).enqueue(new b(objectRef, this, objectRef2));
    }
}
