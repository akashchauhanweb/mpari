package com.zepto;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class tf3 {
    private String AppIName;
    private Drawable AppIcon;
    private String AppPackageName;
    private String TypeOfPermission;

    public final String getAppIName() {
        return this.AppIName;
    }

    public final Drawable getAppIcon() {
        return this.AppIcon;
    }

    public final String getAppPackageName() {
        return this.AppPackageName;
    }

    public final String getTypeOfPermission() {
        return this.TypeOfPermission;
    }

    public final void setAppIName(String str) {
        this.AppIName = str;
    }

    public final void setAppIcon(Drawable drawable) {
        this.AppIcon = drawable;
    }

    public final void setAppPackageName(String str) {
        this.AppPackageName = str;
    }

    public final void setTypeOfPermission(String str) {
        this.TypeOfPermission = str;
    }
}
