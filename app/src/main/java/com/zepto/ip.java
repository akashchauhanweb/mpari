package com.zepto;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class ip extends sn3 {
    public String a;

    public ip(String str) {
        this.a = str;
    }

    @Override // com.zepto.sn3
    public void b(String str) {
        Log.d("isoparser", String.valueOf(this.a) + ":" + str);
    }
}
