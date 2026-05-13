package com.nic.mparivahan.DlLog;

import android.content.Context;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.ih4;
import com.zepto.iy7;
import com.zepto.lc5;
import com.zepto.ls3;
import com.zepto.lx0;
import com.zepto.mt6;
import com.zepto.s44;
import com.zepto.tu5;
import java.util.Base64;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J6\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/nic/mparivahan/DlLog/DlLogUpdate;", "Landroidx/work/Worker;", "Landroidx/work/c$a;", "p", "", "sarlogApplDate", "", "sarlogApplNo", "", "sarlogCtzId", "sarlogDlDob", "sarlogDlNumber", "sarlogRtoCd", "", "r", "Landroid/content/Context;", "f", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "g", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class DlLogUpdate extends Worker {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public Context context;

    /* JADX INFO: renamed from: com.nic.mparivahan.DlLog.DlLogUpdate$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context, String sarlogApplDate, long j, int i, String sarlogDlDob, String sarlogDlNumber, String sarlogRtoCd) throws Throwable {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sarlogApplDate, "sarlogApplDate");
            Intrinsics.checkNotNullParameter(sarlogDlDob, "sarlogDlDob");
            Intrinsics.checkNotNullParameter(sarlogDlNumber, "sarlogDlNumber");
            Intrinsics.checkNotNullParameter(sarlogRtoCd, "sarlogRtoCd");
            androidx.work.b bVarA = new b.a().b("sarlogApplDate", sarlogApplDate).b("sarlogApplNo", Long.valueOf(j)).b("sarlogCtzId", Integer.valueOf(i)).b("sarlogDlDob", sarlogDlDob).b("sarlogDlNumber", sarlogDlNumber).b("sarlogRtoCd", sarlogRtoCd).a();
            Intrinsics.checkNotNullExpressionValue(bVarA, "build(...)");
            iy7.c(context).a((ih4) ((ih4.a) ((ih4.a) new ih4.a(DlLogUpdate.class).j(bVarA)).h(new lx0.a().b(s44.CONNECTED).a())).a());
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            Log.e("DlUpdateErr", String.valueOf(th != null ? th.getMessage() : null));
        }

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
            String str = this.a;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            aVar.a(str, new String(bArrDecode, Charsets.UTF_8));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DlLogUpdate(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.context = context;
    }

    @Override // androidx.work.Worker
    public c.a p() {
        try {
            r(String.valueOf(f().m("sarlogApplDate")), f().l("sarlogApplNo", 0L), f().j("sarlogCtzId", 0), String.valueOf(f().m("sarlogDlDob")), String.valueOf(f().m("sarlogDlNumber")), String.valueOf(f().m("sarlogRtoCd")));
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("error", Unit.INSTANCE.toString());
        }
        c.a aVarC = c.a.c();
        Intrinsics.checkNotNullExpressionValue(aVarC, "success(...)");
        return aVarC;
    }

    public final void r(String sarlogApplDate, long sarlogApplNo, int sarlogCtzId, String sarlogDlDob, String sarlogDlNumber, String sarlogRtoCd) {
        Intrinsics.checkNotNullParameter(sarlogApplDate, "sarlogApplDate");
        Intrinsics.checkNotNullParameter(sarlogDlDob, "sarlogDlDob");
        Intrinsics.checkNotNullParameter(sarlogDlNumber, "sarlogDlNumber");
        Intrinsics.checkNotNullParameter(sarlogRtoCd, "sarlogRtoCd");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        DlLogUpdateInterface dlLogUpdateInterfaceA = DlLogUpdateInterface.INSTANCE.a(this.context);
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mt6.a.E(sarlogApplDate, sarlogApplNo, sarlogCtzId, sarlogDlDob, sarlogDlNumber, sarlogRtoCd).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        dlLogUpdateInterfaceA.updateSarathiLog(aVar.d(ls3VarB, string), strValueOf).enqueue(new b(strValueOf));
    }
}
