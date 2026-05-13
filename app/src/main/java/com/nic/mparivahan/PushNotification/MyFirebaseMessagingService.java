package com.nic.mparivahan.PushNotification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import android.widget.RemoteViews;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.nic.mparivahan.Account.View.SignInScreen;
import com.nic.mparivahan.R;
import com.zepto.ae4;
import com.zepto.f85;
import com.zepto.hz0;
import com.zepto.v82;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002J\"\u0010\u000e\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u0002¨\u0006\u0013"}, d2 = {"Lcom/nic/mparivahan/PushNotification/MyFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "", "p0", "", "t", "Lcom/zepto/f85;", "remoteMessage", "r", "title", "message", "Landroid/widget/RemoteViews;", "w", "channel_id", "x", "<init>", "()V", "h", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void r(f85 remoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        try {
            String strValueOf = String.valueOf(Random.INSTANCE.nextInt(0, 1000));
            f85.b bVarC = remoteMessage.c();
            String strC = bVarC != null ? bVarC.c() : null;
            f85.b bVarC2 = remoteMessage.c();
            x(strC, bVarC2 != null ? bVarC2.a() : null, strValueOf);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void t(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        super.t(p0);
        v82 v82Var = new v82(this);
        Log.e("FcmTokenSession", p0.toString());
        v82Var.d(p0);
    }

    public final RemoteViews w(String title, String message) {
        RemoteViews remoteViews = new RemoteViews(getApplicationContext().getPackageName(), R.layout.notification);
        remoteViews.setTextViewText(R.id.title, title);
        remoteViews.setTextViewText(R.id.message, message);
        remoteViews.setImageViewResource(R.id.icon, R.drawable.app_icon);
        return remoteViews;
    }

    public final void x(String title, String message, String channel_id) {
        Intent intent;
        Intrinsics.checkNotNullParameter(channel_id, "channel_id");
        hz0.a aVar = hz0.a;
        if (StringsKt__StringsJVMKt.equals(title, aVar.q(), true)) {
            intent = new Intent(this, (Class<?>) SignInScreen.class);
            intent.putExtra(aVar.u(), aVar.t());
            intent.addFlags(67108864);
        } else {
            intent = new Intent(this, (Class<?>) SignInScreen.class);
            intent.putExtra(aVar.u(), aVar.v());
            intent.addFlags(67108864);
        }
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 1073741824);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        ae4.e eVarJ = new ae4.e(getApplicationContext(), channel_id).w(R.drawable.app_icon).f(false).A(new long[]{1000, 1000, 1000, 1000, 1000}).t(true).j(activity);
        Intrinsics.checkNotNullExpressionValue(eVarJ, "setContentIntent(...)");
        ae4.e eVarI = eVarJ.i(w(title, message));
        Intrinsics.checkNotNull(eVarI);
        Object systemService = getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        notificationManager.createNotificationChannel(new NotificationChannel(channel_id, "mParivahan", 4));
        notificationManager.notify(Integer.parseInt(channel_id), eVarI.b());
    }
}
