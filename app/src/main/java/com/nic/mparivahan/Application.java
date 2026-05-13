package com.nic.mparivahan;

import android.provider.Settings;
import android.util.Log;
import com.zepto.jt;
import com.zepto.qq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0086 J\t\u0010\u0005\u001a\u00020\u0004H\u0086 J\t\u0010\u0006\u001a\u00020\u0004H\u0086 J\t\u0010\u0007\u001a\u00020\u0004H\u0086 J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0004H\u0086 J\t\u0010\u000b\u001a\u00020\u0004H\u0086 ¨\u0006\f"}, d2 = {"Lcom/nic/mparivahan/Application;", "Landroid/app/Application;", "()V", "appNameProd", "", "channelIdProd", "channelLicenseKeyProd", "clientIdProd", "onCreate", "", "packageNameProd", "passwordProd", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Application extends android.app.Application {
    public Application() {
        try {
            System.loadLibrary("appprotectt");
        } catch (Exception e) {
            Log.d("Ex", e.getLocalizedMessage());
        }
    }

    public final native String appNameProd();

    public final native String channelIdProd();

    public final native String channelLicenseKeyProd();

    public final native String clientIdProd();

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        jt.a aVar = jt.c;
        aVar.m0(this);
        qq0 qq0Var = new qq0();
        qq0Var.setClientId(Integer.parseInt(clientIdProd()));
        qq0Var.setChannelId(Integer.parseInt(channelIdProd()));
        qq0Var.setAppName(appNameProd());
        qq0Var.setPackageName(packageNameProd());
        qq0Var.setPassword(passwordProd());
        qq0Var.setChannelLicenseKey(channelLicenseKeyProd());
        qq0Var.setMainAppVersionCode("227");
        qq0Var.setAppVersionName("2.0.135");
        aVar.y0(qq0Var);
        new jt(this).y1("LauncherActivity", R.layout.alert_layout_logo, R.mipmap.ic_launcher, 0, "release", 1, "prod", "2025-02-28 15:06:56");
        String string = Settings.Secure.getString(getContentResolver(), "android_id");
        Intrinsics.checkNotNull(string);
        aVar.W0(string);
    }

    public final native String packageNameProd();

    public final native String passwordProd();
}
