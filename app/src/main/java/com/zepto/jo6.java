package com.zepto;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public class jo6 {
    public static jo6 d;
    public final Context a;
    public final LocationManager b;
    public final a c = new a();

    public static class a {
        public boolean a;
        public long b;
    }

    public jo6(Context context, LocationManager locationManager) {
        this.a = context;
        this.b = locationManager;
    }

    public static jo6 a(Context context) {
        if (d == null) {
            Context applicationContext = context.getApplicationContext();
            d = new jo6(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return d;
    }

    public final Location b() {
        Location locationC = vq4.b(this.a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = vq4.b(this.a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (locationC2 == null || locationC == null) ? locationC2 != null ? locationC2 : locationC : locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    public final Location c(String str) {
        try {
            if (this.b.isProviderEnabled(str)) {
                return this.b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    public boolean d() {
        a aVar = this.c;
        if (e()) {
            return aVar.a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    public final boolean e() {
        return this.c.b > System.currentTimeMillis();
    }

    public final void f(Location location) {
        long j;
        a aVar = this.c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        io6 io6VarB = io6.b();
        io6VarB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        io6VarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = io6VarB.c == 1;
        long j2 = io6VarB.b;
        long j3 = io6VarB.a;
        io6VarB.a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j4 = io6VarB.b;
        if (j2 == -1 || j3 == -1) {
            j = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis <= j3) {
                j4 = jCurrentTimeMillis > j2 ? j3 : j2;
            }
            j = j4 + 60000;
        }
        aVar.a = z;
        aVar.b = j;
    }
}
