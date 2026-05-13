package com.nic.mparivahan.ProfileDetails.ProfileService;

import android.content.Context;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import com.google.gson.Gson;
import com.nic.mparivahan.ProfileDetails.ProfileInterface.UserBloodDetails;
import com.nic.mparivahan.ProfileDetails.StateUpdate.StateUpdateResponse;
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
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/nic/mparivahan/ProfileDetails/ProfileService/SaveCitizenProfileService;", "Landroidx/work/Worker;", "Landroidx/work/c$a;", "p", "Landroid/content/Context;", "context", "", "doc_id", "", "r", "f", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "g", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class SaveCitizenProfileService extends Worker {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public Context context;

    /* JADX INFO: renamed from: com.nic.mparivahan.ProfileDetails.ProfileService.SaveCitizenProfileService$a, reason: from kotlin metadata */
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
            iy7.c(context).a((ih4) ((ih4.a) ((ih4.a) new ih4.a(SaveCitizenProfileService.class).j(bVarA)).h(new lx0.a().b(s44.CONNECTED).a())).a());
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ Context b;

        public b(Ref.ObjectRef objectRef, Context context) {
            this.a = objectRef;
            this.b = context;
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
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) StateUpdateResponse.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            StateUpdateResponse stateUpdateResponse = (StateUpdateResponse) objFromJson;
            if (StringsKt__StringsJVMKt.equals(stateUpdateResponse.getStatusCode(), "CTZN001", true)) {
                try {
                    ws6 ws6Var = new ws6(this.b);
                    ws6Var.b(String.valueOf(stateUpdateResponse.getMparCitizenUser().getCtzRecordId()), stateUpdateResponse.getMparCitizenUser().getCtzMobile(), stateUpdateResponse.getMparCitizenUser().getCtzDispName(), stateUpdateResponse.getMparCitizenUser().getCtzEmail(), ws6Var.m().toString(), stateUpdateResponse.getMparCitizenUser().getCtzStateCd(), Boolean.TRUE, Boolean.valueOf(stateUpdateResponse.getMparCitizenUser().getCtzMpinStatus()));
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveCitizenProfileService(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.context = context;
    }

    @Override // androidx.work.Worker
    public c.a p() {
        try {
            r(this.context, String.valueOf(f().m("RC")));
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
    public final void r(Context context, String doc_id) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(doc_id, "doc_id");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        UserBloodDetails.INSTANCE.a(context).updatestateInterface(lc5.Companion.d(ls3.g.b("application/json"), doc_id), (String) objectRef.element).enqueue(new b(objectRef, context));
    }
}
