package com.zepto;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.widget.RemoteViews;
import com.nic.mparivahan.R;
import com.zepto.ae4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jm3 {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RemoteViews a(String str, String str2, Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.notification_application_submit);
            remoteViews.setTextViewText(R.id.title, str);
            remoteViews.setTextViewText(R.id.message, str2);
            return remoteViews;
        }

        public final void b(String str, String str2, Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String strValueOf = String.valueOf(Random.INSTANCE.nextInt(0, 1000));
            ae4.e eVarT = new ae4.e(context, strValueOf).w(R.mipmap.ic_launcher).f(false).A(new long[]{1000, 1000, 1000, 1000, 1000}).t(true);
            Intrinsics.checkNotNullExpressionValue(eVarT, "setOnlyAlertOnce(...)");
            ae4.e eVarI = eVarT.i(a(str, str2, context));
            Intrinsics.checkNotNull(eVarI);
            Object systemService = context.getSystemService("notification");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            notificationManager.createNotificationChannel(new NotificationChannel(strValueOf, "mParivahan", 4));
            notificationManager.notify(Integer.parseInt(strValueOf), eVarI.b());
        }
    }
}
