package ai.protectt.app.security.common.helper;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.zepto.co3;
import com.zepto.nn3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0014\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0086D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lai/protectt/app/security/common/helper/LoggingService;", "Landroid/app/Service;", "Landroid/content/Intent;", "intent", "", "flags", "startId", "onStartCommand", "Landroid/os/IBinder;", "onBind", "", "onDestroy", "", "a", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "<init>", "()V", "app-security_release"}, k = 1, mv = {1, 6, 0})
public final class LoggingService extends Service {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String TAG = "LoggingService";

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        nn3.a.f("LoggingService", "onBind Called");
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        nn3.a.f("LoggingService", "onDestroy Called");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        nn3.a.f("LoggingService", "onStartCommand Called");
        co3 co3Var = co3.a;
        if (co3Var.s() == null || co3Var.r() == null) {
            return 1;
        }
        Context contextS = co3Var.s();
        Intrinsics.checkNotNull(contextS);
        Activity activityR = co3Var.r();
        Intrinsics.checkNotNull(activityR);
        co3Var.o(contextS, activityR);
        return 1;
    }
}
