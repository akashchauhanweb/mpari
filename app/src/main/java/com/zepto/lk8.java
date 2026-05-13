package com.zepto;

import android.app.PendingIntent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class lk8 extends rj8 {
    public final String d;
    public final /* synthetic */ vk8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk8(vk8 vk8Var, rh8 rh8Var, String str) {
        super(vk8Var, new z68("OnRequestInstallCallback"), rh8Var);
        this.e = vk8Var;
        this.d = str;
    }

    @Override // com.zepto.rj8, com.zepto.gl8
    public final void b(Bundle bundle) {
        super.b(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.b.d(new xz2(bundle.getInt("error.code", -2)));
            return;
        }
        this.b.e(av.h(this.d, bundle.getInt("version.code", -1), bundle.getInt("update.availability"), bundle.getInt("install.status", 0), bundle.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle.getInt("client.version.staleness")), bundle.getInt("in.app.update.priority", 0), bundle.getLong("bytes.downloaded"), bundle.getLong("total.bytes.to.download"), bundle.getLong("additional.size.required"), this.e.d.a(), (PendingIntent) bundle.getParcelable("blocking.intent"), (PendingIntent) bundle.getParcelable("nonblocking.intent"), (PendingIntent) bundle.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent")));
    }
}
