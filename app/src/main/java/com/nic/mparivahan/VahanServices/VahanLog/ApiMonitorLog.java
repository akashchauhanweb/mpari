package com.nic.mparivahan.VahanServices.VahanLog;

import android.content.Context;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import com.zepto.ih4;
import com.zepto.iy7;
import com.zepto.lx0;
import com.zepto.s44;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanLog/ApiMonitorLog;", "Landroidx/work/Worker;", "Landroidx/work/c$a;", "p", "Landroid/content/Context;", "f", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "g", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ApiMonitorLog extends Worker {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public Context context;

    /* JADX INFO: renamed from: com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context, String apiProvider, String apiName, String apiCode, String apiReason) throws Throwable {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(apiProvider, "apiProvider");
            Intrinsics.checkNotNullParameter(apiName, "apiName");
            Intrinsics.checkNotNullParameter(apiCode, "apiCode");
            Intrinsics.checkNotNullParameter(apiReason, "apiReason");
            b bVarA = new b.a().b("servapilogApiProvider", apiProvider).b("servapilogApiName", apiName).b("servapilogCode", apiCode).b("servapilogReason", apiReason).b("servapilogDeviceOsType", "Android").a();
            Intrinsics.checkNotNullExpressionValue(bVarA, "build(...)");
            iy7.c(context).a((ih4) ((ih4.a) ((ih4.a) new ih4.a(ApiMonitorLog.class).j(bVarA)).h(new lx0.a().b(s44.CONNECTED).a())).a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiMonitorLog(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.context = context;
    }

    @Override // androidx.work.Worker
    public c.a p() {
        try {
            f().m("servapilogApiProvider");
            f().m("servapilogApiName");
            f().m("servapilogCode");
            f().m("servapilogReason");
            f().m("servapilogDeviceOsType");
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("eRRO", Unit.INSTANCE.toString());
        }
        c.a aVarC = c.a.c();
        Intrinsics.checkNotNullExpressionValue(aVarC, "success(...)");
        return aVarC;
    }
}
