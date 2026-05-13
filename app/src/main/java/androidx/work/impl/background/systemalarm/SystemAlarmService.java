package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.work.impl.background.systemalarm.d;
import com.zepto.ff3;
import com.zepto.pu7;
import com.zepto.rn3;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends ff3 implements d.c {
    public static final String d = rn3.i("SystemAlarmService");
    public d b;
    public boolean c;

    @Override // androidx.work.impl.background.systemalarm.d.c
    public void a() {
        this.c = true;
        rn3.e().a(d, "All commands completed in dispatcher");
        pu7.a();
        stopSelf();
    }

    public final void e() {
        d dVar = new d(this);
        this.b = dVar;
        dVar.m(this);
    }

    @Override // com.zepto.ff3, android.app.Service
    public void onCreate() {
        super.onCreate();
        e();
        this.c = false;
    }

    @Override // com.zepto.ff3, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.c = true;
        this.b.k();
    }

    @Override // com.zepto.ff3, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.c) {
            rn3.e().f(d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.b.k();
            e();
            this.c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.b.a(intent, i2);
        return 3;
    }
}
