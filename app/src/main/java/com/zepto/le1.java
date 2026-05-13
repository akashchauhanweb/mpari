package com.zepto;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class le1 {
    public static String a(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
