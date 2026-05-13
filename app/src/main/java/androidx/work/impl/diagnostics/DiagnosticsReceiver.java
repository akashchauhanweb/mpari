package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import com.zepto.ih4;
import com.zepto.iy7;
import com.zepto.rn3;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = rn3.i("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        rn3.e().a(a, "Requesting diagnostics");
        try {
            iy7.c(context).a(ih4.e(DiagnosticsWorker.class));
        } catch (IllegalStateException e) {
            rn3.e().d(a, "WorkManager is not initialized", e);
        }
    }
}
