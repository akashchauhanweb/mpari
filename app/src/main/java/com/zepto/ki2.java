package com.zepto;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public class ki2 extends Service implements LocationListener {
    public final Context a;
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;
    public Location e;
    public double f;
    public double g;
    public double h;
    public LocationManager i;

    public ki2(Context context) {
        this.a = context;
        a();
    }

    public Location a() {
        if (this.i != null && (yy0.a(this, "android.permission.ACCESS_FINE_LOCATION") == 0 || yy0.a(this, "android.permission.ACCESS_COARSE_LOCATION") == 0)) {
            this.i.removeUpdates(this);
        }
        if (yy0.a(this.a, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            yy0.a(this.a, "android.permission.ACCESS_COARSE_LOCATION");
        }
        try {
            LocationManager locationManager = (LocationManager) this.a.getSystemService("location");
            this.i = locationManager;
            this.b = locationManager.isProviderEnabled("gps");
            boolean zIsProviderEnabled = this.i.isProviderEnabled("network");
            this.c = zIsProviderEnabled;
            boolean z = this.b;
            if (z || zIsProviderEnabled) {
                this.d = true;
                if (z) {
                    this.i.requestLocationUpdates("network", 10000L, 10.0f, this);
                    LocationManager locationManager2 = this.i;
                    if (locationManager2 != null) {
                        Location lastKnownLocation = locationManager2.getLastKnownLocation("network");
                        this.e = lastKnownLocation;
                        if (lastKnownLocation != null) {
                            this.f = lastKnownLocation.getLatitude();
                            this.g = this.e.getLongitude();
                        }
                    }
                }
                if (this.c && this.e == null) {
                    this.i.requestLocationUpdates("gps", 10000L, 10.0f, this);
                    LocationManager locationManager3 = this.i;
                    if (locationManager3 != null) {
                        Location lastKnownLocation2 = locationManager3.getLastKnownLocation("gps");
                        this.e = lastKnownLocation2;
                        if (lastKnownLocation2 != null) {
                            this.f = lastKnownLocation2.getLatitude();
                            this.g = this.e.getLongitude();
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.e;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        this.h = location.getSpeed();
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
