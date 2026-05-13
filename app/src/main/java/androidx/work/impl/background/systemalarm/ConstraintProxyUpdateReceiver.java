package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import com.zepto.jy7;
import com.zepto.rn3;
import com.zepto.wk4;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String a = rn3.i("ConstrntProxyUpdtRecvr");

    public class a implements Runnable {
        public final /* synthetic */ Intent c;
        public final /* synthetic */ Context e;
        public final /* synthetic */ BroadcastReceiver.PendingResult f;

        public a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.c = intent;
            this.e = context;
            this.f = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.c.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.c.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.c.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.c.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                rn3.e().a(ConstraintProxyUpdateReceiver.a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                wk4.c(this.e, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                wk4.c(this.e, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                wk4.c(this.e, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                wk4.c(this.e, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            jy7.i(context).o().c(new a(intent, context, goAsync()));
            return;
        }
        rn3.e().a(a, "Ignoring unknown action " + action);
    }
}
