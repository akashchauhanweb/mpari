package com.zepto;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.lang.ref.SoftReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public abstract class cr0 extends BroadcastReceiver {
    public static SoftReference a;

    public Executor a() {
        ExecutorService executorServiceUnconfigurableExecutorService;
        synchronized (cr0.class) {
            try {
                SoftReference softReference = a;
                executorServiceUnconfigurableExecutorService = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorServiceUnconfigurableExecutorService == null) {
                    mf8.a();
                    executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new m14("firebase-iid-executor")));
                    a = new SoftReference(executorServiceUnconfigurableExecutorService);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorServiceUnconfigurableExecutorService;
    }

    public abstract int b(Context context, br0 br0Var);

    public abstract void c(Context context, Bundle bundle);

    public final /* synthetic */ void d(Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            int iF = intent2 != null ? f(context, intent2) : e(context, intent);
            if (z) {
                pendingResult.setResultCode(iF);
            }
            pendingResult.finish();
        } catch (Throwable th) {
            pendingResult.finish();
            throw th;
        }
    }

    public final int e(Context context, Intent intent) {
        Task taskC;
        if (intent.getExtras() == null) {
            return 500;
        }
        br0 br0Var = new br0(intent);
        if (TextUtils.isEmpty(br0Var.d())) {
            taskC = gd6.e(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", br0Var.d());
            Integer numE = br0Var.e();
            if (numE != null) {
                bundle.putInt("google.product_id", numE.intValue());
            }
            bundle.putBoolean("supports_message_handled", true);
            taskC = em8.b(context).c(2, bundle);
        }
        int iB = b(context, br0Var);
        try {
            gd6.b(taskC, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e.toString()));
        }
        return iB;
    }

    public final int f(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        String action = intent.getAction();
        if (action == "com.google.firebase.messaging.NOTIFICATION_DISMISS" || (action != null && action.equals("com.google.firebase.messaging.NOTIFICATION_DISMISS"))) {
            c(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean zIsOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        a().execute(new Runnable() { // from class: com.zepto.xg8
            @Override // java.lang.Runnable
            public final void run() {
                this.c.d(intent, context, zIsOrderedBroadcast, pendingResultGoAsync);
            }
        });
    }
}
