package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import com.zepto.op7;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(op7 op7Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) op7Var.v(remoteActionCompat.a, 1);
        remoteActionCompat.b = op7Var.l(remoteActionCompat.b, 2);
        remoteActionCompat.c = op7Var.l(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent) op7Var.r(remoteActionCompat.d, 4);
        remoteActionCompat.e = op7Var.h(remoteActionCompat.e, 5);
        remoteActionCompat.f = op7Var.h(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, op7 op7Var) {
        op7Var.x(false, false);
        op7Var.M(remoteActionCompat.a, 1);
        op7Var.D(remoteActionCompat.b, 2);
        op7Var.D(remoteActionCompat.c, 3);
        op7Var.H(remoteActionCompat.d, 4);
        op7Var.z(remoteActionCompat.e, 5);
        op7Var.z(remoteActionCompat.f, 6);
    }
}
