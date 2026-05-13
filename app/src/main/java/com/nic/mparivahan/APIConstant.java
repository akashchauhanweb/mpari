package com.nic.mparivahan;

/* JADX INFO: loaded from: classes.dex */
public class APIConstant {
    public static APIConstant a;

    static {
        System.loadLibrary("cons-arch");
    }

    public static APIConstant a() {
        if (a == null) {
            a = new APIConstant();
        }
        return a;
    }

    public native String dlDetTable();

    public native String dlDetails();

    public native String dlDetailsTable();

    public native String dlSelQuery();

    public native String dlTable();

    public native String dropDlTable();

    public native String getRCList();

    public native String getRecentList();

    public native String rcDetTable();

    public native String rcDetail20();

    public native String rcDropShareTable();

    public native String rcId();

    public native String rcQuery();

    public native String rcRecenTable();

    public native String rcShareTable();

    public native String rcTable();

    public native String recentSearchTable();

    public native String setrcDetTable();

    public native String setrcDetTable1();
}
