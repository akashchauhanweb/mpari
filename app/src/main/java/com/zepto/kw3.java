package com.zepto;

import ai.protectt.app.security.main.scan.ScanUtils;
import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class kw3 {
    public static final a a = new a(null);
    public static String b = "IsMockDetected";
    public static kw3 c;
    public static Context d;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kw3 a() {
            return kw3.c;
        }

        public final Context b() {
            return kw3.d;
        }

        public final String c() {
            return kw3.b;
        }

        public final kw3 d(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            f(context);
            if (a() == null) {
                e(new kw3(context));
            }
            kw3 kw3VarA = a();
            Intrinsics.checkNotNull(kw3VarA);
            return kw3VarA;
        }

        public final void e(kw3 kw3Var) {
            kw3.c = kw3Var;
        }

        public final void f(Context context) {
            kw3.d = context;
        }
    }

    public static final class b implements LocationListener {
        public final /* synthetic */ if5 a;

        public b(if5 if5Var) {
            this.a = if5Var;
        }

        public final String a(Context context, String str) {
            try {
                PackageManager packageManager = context.getPackageManager();
                Intrinsics.checkNotNullExpressionValue(packageManager, "context.getPackageManager()");
                try {
                    return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128)).toString();
                } catch (PackageManager.NameNotFoundException unused) {
                    nn3.a.f(kw3.a.c(), Intrinsics.stringPlus("unable to find packageName :: ", str));
                    return str;
                }
            } catch (Exception e) {
                nn3.c(nn3.a, kw3.a.c(), Intrinsics.stringPlus("", e), null, 4, null);
                return str;
            }
        }

        public final List b(Context context) {
            ArrayList arrayList = new ArrayList();
            try {
                List<ApplicationInfo> installedApplications = context.getPackageManager().getInstalledApplications(128);
                Intrinsics.checkNotNullExpressionValue(installedApplications, "context.getPackageManage…ageManager.GET_META_DATA)");
                for (ApplicationInfo applicationInfo : installedApplications) {
                    if ((applicationInfo.flags & 1) == 0 && c(context, applicationInfo.packageName, "android.permission.ACCESS_MOCK_LOCATION")) {
                        String str = applicationInfo.packageName;
                        Intrinsics.checkNotNullExpressionValue(str, "aPackage.packageName");
                        arrayList.add(a(context, str));
                    }
                }
            } catch (Exception e) {
                nn3.c(nn3.a, kw3.a.c(), e.toString(), null, 4, null);
            }
            return arrayList;
        }

        public final boolean c(Context context, String str, String str2) {
            try {
                PackageManager packageManager = context.getPackageManager();
                Intrinsics.checkNotNullExpressionValue(packageManager, "context.getPackageManager()");
                try {
                    Intrinsics.checkNotNull(str);
                    PackageInfo packageInfo = packageManager.getPackageInfo(str, ConstantsKt.DEFAULT_BLOCK_SIZE);
                    Intrinsics.checkNotNullExpressionValue(packageInfo, "packageManager.getPackag…eManager.GET_PERMISSIONS)");
                    String[] strArr = packageInfo.requestedPermissions;
                    if (strArr != null) {
                        Intrinsics.checkNotNullExpressionValue(strArr, "packageInfo.requestedPermissions");
                        int length = strArr.length;
                        int i = 0;
                        while (i < length) {
                            String str3 = strArr[i];
                            i++;
                            if (Intrinsics.areEqual(str3, str2)) {
                                return true;
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    nn3.a.f(kw3.a.c(), Intrinsics.stringPlus("unable to find packageName :: ", str));
                }
            } catch (Exception e) {
                nn3.c(nn3.a, kw3.a.c(), e.toString(), null, 4, null);
            }
            return false;
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location currentLocation) {
            Object objInvoke;
            Intrinsics.checkNotNullParameter(currentLocation, "currentLocation");
            try {
                nn3.a.f(kw3.a.c(), "Latitude :" + currentLocation.getLatitude() + " Longitude : " + currentLocation.getLongitude());
                String str = "";
                int i = Build.VERSION.SDK_INT;
                if (i <= 30) {
                    str = "isFromMockProvider";
                } else if (i >= 31) {
                    str = "isMock";
                }
                boolean zBooleanValue = false;
                try {
                    try {
                        objInvoke = currentLocation.getClass().getDeclaredMethod(str, new Class[0]).invoke(currentLocation, new Object[0]);
                    } catch (Exception e) {
                        nn3.c(nn3.a, kw3.a.c(), e.toString(), null, 4, null);
                    }
                } catch (Exception e2) {
                    nn3.c(nn3.a, kw3.a.c(), Intrinsics.stringPlus("Catch statement --", e2), null, 4, null);
                }
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                zBooleanValue = ((Boolean) objInvoke).booleanValue();
                nn3 nn3Var = nn3.a;
                a aVar = kw3.a;
                nn3Var.f(aVar.c(), Intrinsics.stringPlus("Mock is ==", Boolean.valueOf(zBooleanValue)));
                if (zBooleanValue) {
                    ScanUtils scanUtils = ScanUtils.a;
                    if5 if5Var = this.a;
                    Context contextB = aVar.b();
                    Intrinsics.checkNotNull(contextB);
                    scanUtils.b0(if5Var, b(contextB).toString());
                }
            } catch (Exception e3) {
                nn3.c(nn3.a, kw3.a.c(), e3.toString(), null, 4, null);
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String provider) {
            Intrinsics.checkNotNullParameter(provider, "provider");
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String provider) {
            Intrinsics.checkNotNullParameter(provider, "provider");
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    public kw3(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void h(LocationManager mLocationManager, long j, float f, kw3 this$0, if5 mt) {
        Intrinsics.checkNotNullParameter(mLocationManager, "$mLocationManager");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mt, "$mt");
        mLocationManager.requestLocationUpdates("gps", j, f, this$0.i(mt));
        mLocationManager.requestLocationUpdates("network", j, f, this$0.i(mt));
        mLocationManager.requestLocationUpdates("gps", j, f, this$0.i(mt));
    }

    public final void g(final if5 mt, Context mockContext, Activity currentActivity) {
        Intrinsics.checkNotNullParameter(mt, "mt");
        Intrinsics.checkNotNullParameter(mockContext, "mockContext");
        Intrinsics.checkNotNullParameter(currentActivity, "currentActivity");
        final long j = 100;
        final float f = 500.0f;
        try {
            Object systemService = mockContext.getSystemService("location");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
            }
            final LocationManager locationManager = (LocationManager) systemService;
            if (yy0.a(mockContext, "android.permission.ACCESS_FINE_LOCATION") != 0 || yy0.a(mockContext, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
                nn3.a.f(b, "You need to give Location Permission******");
                return;
            }
            nn3.a.f("MockDetection", "You need to give Location Permission granted******");
            try {
                currentActivity.runOnUiThread(new Runnable() { // from class: com.zepto.jw3
                    @Override // java.lang.Runnable
                    public final void run() {
                        kw3.h(locationManager, j, f, this, mt);
                    }
                });
            } catch (Exception unused) {
                nn3.a.f(b, "Exception In Mock Location");
            }
        } catch (Exception e) {
            nn3.c(nn3.a, b, e.toString(), null, 4, null);
        }
    }

    public final LocationListener i(if5 if5Var) {
        return new b(if5Var);
    }
}
