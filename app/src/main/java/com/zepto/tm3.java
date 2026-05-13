package com.zepto;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.Task;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class tm3 {
    public final Context a;
    public bi2 b;
    public qm3 c;

    public static final class a extends qm3 {
        public final /* synthetic */ Function2 a;

        public a(Function2 function2) {
            this.a = function2;
        }

        @Override // com.zepto.qm3
        public void b(LocationResult locationResult) {
            Intrinsics.checkNotNullParameter(locationResult, "locationResult");
            super.b(locationResult);
            Intrinsics.checkNotNullExpressionValue(locationResult.c(), "getLocations(...)");
            if (!(!r0.isEmpty())) {
                Log.d("LocationHelper", "No location available");
                return;
            }
            for (Location location : locationResult.c()) {
                this.a.invoke(Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
            }
        }
    }

    public static final class b extends Lambda implements Function1 {
        public final /* synthetic */ Function2 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function2 function2) {
            super(1);
            this.c = function2;
        }

        public final void a(Location location) {
            if (location != null) {
                this.c.invoke(Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
            } else {
                Log.d("LocationHelper", "Last known location is null");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Location) obj);
            return Unit.INSTANCE;
        }
    }

    public tm3(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        bi2 bi2VarB = wm3.b(context);
        Intrinsics.checkNotNullExpressionValue(bi2VarB, "getFusedLocationProviderClient(...)");
        this.b = bi2VarB;
    }

    public static final void c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public final void b(Function2 onLocationReceived) {
        Intrinsics.checkNotNullParameter(onLocationReceived, "onLocationReceived");
        LocationRequest locationRequestC = LocationRequest.c();
        locationRequestC.q(60000L);
        locationRequestC.p(30000L);
        locationRequestC.r(100);
        Intrinsics.checkNotNullExpressionValue(locationRequestC, "apply(...)");
        if (yy0.a(this.a, "android.permission.ACCESS_FINE_LOCATION") != 0 && yy0.a(this.a, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            Log.e("LocationHelper", "Permissions not granted");
            return;
        }
        a aVar = new a(onLocationReceived);
        this.c = aVar;
        bi2 bi2Var = this.b;
        Intrinsics.checkNotNull(aVar);
        bi2Var.e(locationRequestC, aVar, Looper.getMainLooper());
        Task taskB = this.b.b();
        final b bVar = new b(onLocationReceived);
        taskB.f(new eh4() { // from class: com.zepto.sm3
            @Override // com.zepto.eh4
            public final void b(Object obj) {
                tm3.c(bVar, obj);
            }
        });
    }

    public final void d() {
        qm3 qm3Var = this.c;
        if (qm3Var != null) {
            this.b.d(qm3Var);
            this.c = null;
            Log.d("LocationHelper", "Location updates stopped");
        }
    }
}
