package com.zepto;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public class sz extends bu7 {
    private Intent mResolutionIntent;

    public sz() {
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.mResolutionIntent != null ? "User needs to (re)enter credentials." : super.getMessage();
    }

    public Intent getResolutionIntent() {
        return this.mResolutionIntent;
    }

    public sz(Intent intent) {
        this.mResolutionIntent = intent;
    }

    public sz(m44 m44Var) {
        super(m44Var);
    }

    public sz(String str) {
        super(str);
    }

    public sz(String str, Exception exc) {
        super(str, exc);
    }
}
