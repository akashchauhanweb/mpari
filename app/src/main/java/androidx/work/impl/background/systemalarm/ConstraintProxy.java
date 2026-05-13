package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.zepto.lx0;
import com.zepto.rn3;
import com.zepto.s44;
import com.zepto.yy7;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintProxy extends BroadcastReceiver {
    public static final String a = rn3.i("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static void a(Context context, List list) {
        Iterator it = list.iterator();
        boolean zF = false;
        boolean zG = false;
        boolean zI = false;
        boolean z = false;
        while (it.hasNext()) {
            lx0 lx0Var = ((yy7) it.next()).j;
            zF |= lx0Var.f();
            zG |= lx0Var.g();
            zI |= lx0Var.i();
            z |= lx0Var.d() != s44.NOT_REQUIRED;
            if (zF && zG && zI && z) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.a(context, zF, zG, zI, z));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        rn3.e().a(a, "onReceive : " + intent);
        context.startService(a.a(context));
    }
}
