package com.nic.mparivahan.VahanServices.VahanLog;

import android.content.Context;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import com.google.gson.Gson;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.Model.DoorStepReq;
import com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection;
import com.zepto.ih4;
import com.zepto.iy7;
import com.zepto.lc5;
import com.zepto.ls3;
import com.zepto.lx0;
import com.zepto.mt6;
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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanLog/VahanDoorStep;", "Landroidx/work/Worker;", "Landroidx/work/c$a;", "p", "Lcom/nic/mparivahan/VahanServices/Model/DoorStepReq;", "doorstep", "", "r", "s", "Landroid/content/Context;", "f", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "g", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanDoorStep extends Worker {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public Context context;

    /* JADX INFO: renamed from: com.nic.mparivahan.VahanServices.VahanLog.VahanDoorStep$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context, DoorStepReq doorStepReq) throws Throwable {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(doorStepReq, "doorStepReq");
            androidx.work.b bVarA = new b.a().b("DoorStep", new Gson().toJson(doorStepReq)).a();
            Intrinsics.checkNotNullExpressionValue(bVarA, "build(...)");
            iy7.c(context).a((ih4) ((ih4.a) ((ih4.a) new ih4.a(VahanDoorStep.class).j(bVarA)).h(new lx0.a().b(s44.CONNECTED).a())).a());
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ VahanDoorStep b;
        public final /* synthetic */ DoorStepReq c;

        public b(Ref.ObjectRef objectRef, VahanDoorStep vahanDoorStep, DoorStepReq doorStepReq) {
            this.a = objectRef;
            this.b = vahanDoorStep;
            this.c = doorStepReq;
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
            Log.e("saveVahanLog", String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))));
            this.b.s(this.c);
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;

        public c(Ref.ObjectRef objectRef) {
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
            Log.e("saveVahanLog", String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VahanDoorStep(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.context = context;
    }

    @Override // androidx.work.Worker
    public c.a p() {
        try {
            Object objFromJson = new Gson().fromJson(f().m("DoorStep"), (Class<Object>) DoorStepReq.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            r((DoorStepReq) objFromJson);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("eRRO", Unit.INSTANCE.toString());
        }
        c.a aVarC = c.a.c();
        Intrinsics.checkNotNullExpressionValue(aVarC, "success(...)");
        return aVarC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void r(DoorStepReq doorstep) {
        Intrinsics.checkNotNullParameter(doorstep, "doorstep");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        ws6 ws6Var = new ws6(this.context);
        VahanServiceConnection vahanServiceConnectionB = VahanServiceConnection.INSTANCE.b(this.context);
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mt6.a.s(ws6Var.l()).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        vahanServiceConnectionB.usertype(aVar.d(ls3VarB, string), (String) objectRef.element).enqueue(new b(objectRef, this, doorstep));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void s(DoorStepReq doorstep) {
        Intrinsics.checkNotNullParameter(doorstep, "doorstep");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        VahanServiceConnection.INSTANCE.b(this.context).vttransappl(lc5.Companion.d(ls3.g.b("application/json"), new Gson().toJson(doorstep).toString()), (String) objectRef.element).enqueue(new c(objectRef));
    }
}
