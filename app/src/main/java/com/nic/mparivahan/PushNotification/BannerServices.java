package com.nic.mparivahan.PushNotification;

import android.content.Context;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import com.google.gson.Gson;
import com.nic.mparivahan.PushNotification.BannerModel.BannerModel;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.Welcome.VersionService;
import com.zepto.dl4;
import com.zepto.ih4;
import com.zepto.iy7;
import com.zepto.lc5;
import com.zepto.ls3;
import com.zepto.lx0;
import com.zepto.mt6;
import com.zepto.s14;
import com.zepto.s44;
import com.zepto.tu5;
import java.util.Base64;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/nic/mparivahan/PushNotification/BannerServices;", "Landroidx/work/Worker;", "Landroidx/work/c$a;", "p", "Landroid/content/Context;", "context", "", "r", "f", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "g", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class BannerServices extends Worker {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public Context context;

    /* JADX INFO: renamed from: com.nic.mparivahan.PushNotification.BannerServices$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            iy7.c(context).a((ih4) ((ih4.a) new ih4.a(BannerServices.class).h(new lx0.a().b(s44.CONNECTED).a())).a());
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
        public void onFailure(Call call, Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = (String) this.a.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
                Log.e("Banner--> ", strValueOf);
                Object objFromJson = new Gson().fromJson(strValueOf, (Class<Object>) BannerModel.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                if (StringsKt__StringsJVMKt.equals$default(((BannerModel) objFromJson).getStatusCode(), "MSTR001", false, 2, null)) {
                    new dl4(this.b).h(strValueOf);
                }
            } catch (NullPointerException unused) {
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerServices(Context context, WorkerParameters workerParams) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void r(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        String string = mt6.a.o().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string);
        VersionService.INSTANCE.a(context).getBannerList(s14.a.a() + "getBanner/v1.0 ", lc5VarD, (String) objectRef.element).enqueue(new b(objectRef, context));
    }
}
