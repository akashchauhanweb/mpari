package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.zepto.br0;
import com.zepto.bz5;
import com.zepto.ee4;
import com.zepto.f85;
import com.zepto.ff5;
import com.zepto.ht3;
import com.zepto.ny5;
import com.zepto.q22;
import com.zepto.t82;
import com.zepto.tk1;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessagingService extends q22 {
    public static final Queue g = new ArrayDeque(10);
    public ff5 f;

    @Override // com.zepto.q22
    public Intent e(Intent intent) {
        return bz5.b().c();
    }

    @Override // com.zepto.q22
    public void f(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            p(intent);
            return;
        }
        if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            t(intent.getStringExtra("token"));
            return;
        }
        Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
    }

    public final boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue queue = g;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        Log.d("FirebaseMessaging", "Received duplicate message: " + str);
        return true;
    }

    public final void m(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (ee4.t(extras)) {
            ee4 ee4Var = new ee4(extras);
            ExecutorService executorServiceE = t82.e();
            try {
                if (new tk1(this, ee4Var, executorServiceE).a()) {
                    return;
                }
                executorServiceE.shutdown();
                if (ht3.A(intent)) {
                    ht3.t(intent);
                }
            } finally {
                executorServiceE.shutdown();
            }
        }
        r(new f85(extras));
    }

    public final String n(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    public final ff5 o(Context context) {
        if (this.f == null) {
            this.f = new ff5(context.getApplicationContext());
        }
        return this.f;
    }

    public final void p(Intent intent) {
        if (!l(intent.getStringExtra("google.message_id"))) {
            v(intent);
        }
        o(this).a(new br0(intent));
    }

    public void q() {
    }

    public void r(f85 f85Var) {
    }

    public void s(String str) {
    }

    public void t(String str) {
    }

    public void u(String str, Exception exc) {
    }

    public final void v(Intent intent) {
        String stringExtra;
        stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                q();
                break;
            case "gcm":
                ht3.v(intent);
                m(intent);
                break;
            case "send_error":
                u(n(intent), new ny5(intent.getStringExtra("error")));
                break;
            case "send_event":
                s(intent.getStringExtra("google.message_id"));
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                break;
        }
    }
}
