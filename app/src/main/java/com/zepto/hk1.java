package com.zepto;

import android.app.AlertDialog;

/* JADX INFO: loaded from: classes.dex */
public final class hk1 {
    private AlertDialog vulnerabilityAlert;
    private Integer vulnerabilityCode;

    public hk1(Integer num, AlertDialog alertDialog) {
        this.vulnerabilityCode = num;
        this.vulnerabilityAlert = alertDialog;
    }

    public final AlertDialog getVulnerabilityAlert() {
        return this.vulnerabilityAlert;
    }

    public final Integer getVulnerabilityCode() {
        return this.vulnerabilityCode;
    }

    public final void setVulnerabilityAlert(AlertDialog alertDialog) {
        this.vulnerabilityAlert = alertDialog;
    }

    public final void setVulnerabilityCode(Integer num) {
        this.vulnerabilityCode = num;
    }
}
