package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.zepto.pv4;
import com.zepto.qn6;
import com.zepto.xn6;

/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static /* synthetic */ void b() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        xn6.f(context);
        qn6.a aVarD = qn6.a().b(queryParameter).d(pv4.b(iIntValue));
        if (queryParameter2 != null) {
            aVarD.c(Base64.decode(queryParameter2, 0));
        }
        xn6.c().e().v(aVarD.a(), i, new Runnable() { // from class: com.zepto.un
            @Override // java.lang.Runnable
            public final void run() {
                AlarmManagerSchedulerBroadcastReceiver.b();
            }
        });
    }
}
