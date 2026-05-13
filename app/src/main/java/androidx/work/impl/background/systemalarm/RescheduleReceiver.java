package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.zepto.jy7;
import com.zepto.rn3;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = rn3.i("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        rn3.e().a(a, "Received intent " + intent);
        try {
            jy7.i(context).r(goAsync());
        } catch (IllegalStateException e) {
            rn3.e().d(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
