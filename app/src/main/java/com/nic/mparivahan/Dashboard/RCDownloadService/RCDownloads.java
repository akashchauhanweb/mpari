package com.nic.mparivahan.Dashboard.RCDownloadService;

import android.content.Context;
import android.provider.Settings;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import com.google.gson.Gson;
import com.nic.mparivahan.APIController;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.RC.Model.RcModelsDet;
import com.nic.mparivahan.RC.RcInterface.RcService;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.ih4;
import com.zepto.iy7;
import com.zepto.lc5;
import com.zepto.ls3;
import com.zepto.lx0;
import com.zepto.s14;
import com.zepto.s44;
import com.zepto.su5;
import com.zepto.ws6;
import com.zepto.z45;
import java.util.Base64;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/nic/mparivahan/Dashboard/RCDownloadService/RCDownloads;", "Landroidx/work/Worker;", "Landroidx/work/c$a;", "p", "", "doc_id", "", "r", "Landroid/content/Context;", "f", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "g", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class RCDownloads extends Worker {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public Context context;

    /* JADX INFO: renamed from: com.nic.mparivahan.Dashboard.RCDownloadService.RCDownloads$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context, String doc_id) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(doc_id, "doc_id");
            androidx.work.b bVarA = new b.a().b("RC", doc_id).a();
            Intrinsics.checkNotNullExpressionValue(bVarA, "build(...)");
            iy7.c(context).a((ih4) ((ih4.a) ((ih4.a) new ih4.a(RCDownloads.class).j(bVarA)).h(new lx0.a().b(s44.CONNECTED).a())).a());
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ Ref.ObjectRef b;

        public b(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
            this.a = objectRef;
            this.b = objectRef2;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            Log.e("Error -- >001", String.valueOf(th != null ? th.getMessage() : null));
        }

        /* JADX WARN: Multi-variable type inference failed */
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
            su5.a aVar = su5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) RcModelsDet.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            RcModelsDet rcModelsDet = (RcModelsDet) objFromJson;
            if (StringsKt__StringsJVMKt.equals(rcModelsDet.getStatusCode(), "NP001", true)) {
                DatabaseHelper databaseHelper = (DatabaseHelper) this.b.element;
                String rc_regn_no = rcModelsDet.getNrvDetails().getRc_regn_no();
                databaseHelper.U0(rc_regn_no != null ? StringsKt__StringsKt.trim((CharSequence) rc_regn_no).toString() : null, rcModelsDet.getNrvDetails());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RCDownloads(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.context = context;
    }

    @Override // androidx.work.Worker
    public c.a p() {
        try {
            r(String.valueOf(f().m("RC")));
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("eRRO", Unit.INSTANCE.toString());
        }
        c.a aVarC = c.a.c();
        Intrinsics.checkNotNullExpressionValue(aVarC, "success(...)");
        return aVarC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, com.nic.mparivahan.DB.DatabaseHelper] */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, java.lang.String] */
    public final void r(String doc_id) {
        Intrinsics.checkNotNullParameter(doc_id, "doc_id");
        ws6 ws6Var = new ws6(this.context);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new DatabaseHelper(this.context);
        String string = Settings.Secure.getString(this.context.getContentResolver(), "android_id");
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        z45.a aVar2 = z45.a;
        String strK = ws6Var.k();
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.e(strK, doc_id, string, ws6Var.l(), ws6Var.e()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string2);
        RcService rcServiceA = RcService.INSTANCE.a(this.context);
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = String.valueOf(System.currentTimeMillis());
        rcServiceA.UpdateVirtualRC(s14.a.u() + APIController.a().VirtualRC(), lc5VarD, (String) objectRef2.element).enqueue(new b(objectRef2, objectRef));
    }
}
