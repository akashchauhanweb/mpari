package com.zepto;

import android.content.Context;
import android.util.Log;
import com.nic.mparivahan.Welcome.Model.NapixTokenModel;
import com.nic.mparivahan.Welcome.NapixService;
import com.zepto.nu5;
import com.zepto.s14;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u14 {
    public static final a a = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: com.zepto.u14$a$a, reason: collision with other inner class name */
        public static final class C0123a implements Callback {
            public final /* synthetic */ Context a;

            public C0123a(Context context) {
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

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            nu5.a aVar = nu5.a;
            s14.a aVar2 = s14.a;
            Log.e("grant_type", String.valueOf(aVar.a(aVar2.l()).get("KEY")));
            Log.e("scope", String.valueOf(aVar.a(aVar2.h()).get("KEY")));
            NapixService.INSTANCE.a().getToken("client_credentials", "napix", String.valueOf(aVar.a(aVar2.l()).get("KEY")), String.valueOf(aVar.a(aVar2.h()).get("KEY"))).enqueue(new C0123a(context));
        }
    }
}
