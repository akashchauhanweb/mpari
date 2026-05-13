package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import com.zepto.of1;
import com.zepto.og1;
import com.zepto.p73;
import com.zepto.we3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static /* synthetic */ String e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    public static /* synthetic */ String f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
    }

    public static /* synthetic */ String g(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
    }

    public static /* synthetic */ String h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? i(installerPackageName) : "";
    }

    public static String i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(og1.c());
        arrayList.add(of1.g());
        arrayList.add(we3.b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(we3.b("fire-core", "20.4.2"));
        arrayList.add(we3.b("device-name", i(Build.PRODUCT)));
        arrayList.add(we3.b("device-model", i(Build.DEVICE)));
        arrayList.add(we3.b("device-brand", i(Build.BRAND)));
        arrayList.add(we3.c("android-target-sdk", new we3.a() { // from class: com.zepto.ic2
            @Override // com.zepto.we3.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.e((Context) obj);
            }
        }));
        arrayList.add(we3.c("android-min-sdk", new we3.a() { // from class: com.zepto.jc2
            @Override // com.zepto.we3.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.f((Context) obj);
            }
        }));
        arrayList.add(we3.c("android-platform", new we3.a() { // from class: com.zepto.kc2
            @Override // com.zepto.we3.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.g((Context) obj);
            }
        }));
        arrayList.add(we3.c("android-installer", new we3.a() { // from class: com.zepto.lc2
            @Override // com.zepto.we3.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.h((Context) obj);
            }
        }));
        String strA = p73.a();
        if (strA != null) {
            arrayList.add(we3.b("kotlin", strA));
        }
        return arrayList;
    }
}
