package com.zepto;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class y60 {

    @xy5("appHashOne")
    private String appHashOne;

    @xy5("appHashThree")
    private String appHashThree;

    @xy5("appHashTwo")
    private String appHashTwo;

    @xy5("appName")
    private String appName;

    @xy5("appPackage")
    private String appPackage;

    @xy5("appVersion")
    private String appVersion;

    public y60() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final String getAppHashOne() {
        return this.appHashOne;
    }

    public final String getAppHashThree() {
        return this.appHashThree;
    }

    public final String getAppHashTwo() {
        return this.appHashTwo;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getAppPackage() {
        return this.appPackage;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final void setAppHashOne(String str) {
        this.appHashOne = str;
    }

    public final void setAppHashThree(String str) {
        this.appHashThree = str;
    }

    public final void setAppHashTwo(String str) {
        this.appHashTwo = str;
    }

    public final void setAppName(String str) {
        this.appName = str;
    }

    public final void setAppPackage(String str) {
        this.appPackage = str;
    }

    public final void setAppVersion(String str) {
        this.appVersion = str;
    }

    public y60(String str, String str2, String str3, String str4, String str5, String str6) {
        this.appName = str;
        this.appPackage = str2;
        this.appVersion = str3;
        this.appHashOne = str4;
        this.appHashTwo = str5;
        this.appHashThree = str6;
    }

    public /* synthetic */ y60(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
