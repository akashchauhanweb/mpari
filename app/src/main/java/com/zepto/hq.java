package com.zepto;

import android.content.Context;
import com.zepto.yf4;
import com.zepto.zr2;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hq {
    public static final a a = new a(null);
    public static zr2 b = new zr2(null, 1, null).d(zr2.a.BODY);
    public static yf4 c;
    public static yf4 d;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Retrofit a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            yf4.a aVarF = new yf4.a().a(new i22(context)).a(new tz(context)).f(2L, TimeUnit.MINUTES);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Retrofit retrofitBuild = new Retrofit.Builder().baseUrl(s14.a.j()).addConverterFactory(GsonConverterFactory.create()).client(aVarF.L(60L, timeUnit).O(60L, timeUnit).a(hz0.a.e()).c()).build();
            Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
            return retrofitBuild;
        }
    }

    static {
        yf4.a aVar = new yf4.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c = aVar.f(60L, timeUnit).L(60L, timeUnit).O(60L, timeUnit).a(b).c();
        d = gq6.a();
    }
}
