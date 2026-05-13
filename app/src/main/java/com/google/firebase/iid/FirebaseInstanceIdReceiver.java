package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.zepto.br0;
import com.zepto.cr0;
import com.zepto.gd6;
import com.zepto.ht3;
import com.zepto.s82;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends cr0 {
    public static Intent g(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // com.zepto.cr0
    public int b(Context context, br0 br0Var) {
        try {
            return ((Integer) gd6.a(new s82(context).k(br0Var.c()))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }

    @Override // com.zepto.cr0
    public void c(Context context, Bundle bundle) {
        Intent intentG = g(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (ht3.A(intentG)) {
            ht3.s(intentG);
        }
    }
}
