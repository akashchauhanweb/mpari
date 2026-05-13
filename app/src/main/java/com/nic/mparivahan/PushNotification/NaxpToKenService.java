package com.nic.mparivahan.PushNotification;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import com.nic.mparivahan.Welcome.Model.NapixTokenModel;
import com.nic.mparivahan.Welcome.NapixService;
import com.zepto.ih4;
import com.zepto.iy7;
import com.zepto.lx0;
import com.zepto.nu5;
import com.zepto.s14;
import com.zepto.s44;
import com.zepto.ws6;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/nic/mparivahan/PushNotification/NaxpToKenService;", "Landroidx/work/Worker;", "Landroidx/work/c$a;", "p", "Landroid/content/Context;", "context", "", "r", "f", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "g", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class NaxpToKenService extends Worker {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public Context context;

    /* JADX INFO: renamed from: com.nic.mparivahan.PushNotification.NaxpToKenService$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            iy7.c(context).a((ih4) ((ih4.a) new ih4.a(NaxpToKenService.class).h(new lx0.a().b(s44.CONNECTED).a())).a());
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Context a;

        public b(Context context) {
            this.a = context;
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
                ws6 ws6Var = new ws6(this.a);
                NapixTokenModel napixTokenModel = (NapixTokenModel) response.body();
                Intrinsics.checkNotNull(napixTokenModel);
                ws6Var.F(napixTokenModel.getAccess_token());
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NaxpToKenService(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.context = context;
    }

    @Override // androidx.work.Worker
    public c.a p() {
        try {
            r(this.context);
        } catch (Exception unused) {
        }
        c.a aVarC = c.a.c();
        Intrinsics.checkNotNullExpressionValue(aVarC, "success(...)");
        return aVarC;
    }

    public final void r(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        NapixService napixServiceA = NapixService.INSTANCE.a();
        nu5.a aVar = nu5.a;
        s14.a aVar2 = s14.a;
        napixServiceA.getToken("client_credentials", "napix", String.valueOf(aVar.a(aVar2.l()).get("KEY")), String.valueOf(aVar.a(aVar2.h()).get("KEY"))).enqueue(new b(context));
    }
}
