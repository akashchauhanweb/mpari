package com.zepto;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.zepto.ae4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class be4 implements zd4 {
    public final Context a;
    public final Notification.Builder b;
    public final ae4.e c;
    public RemoteViews d;
    public RemoteViews e;
    public final List f = new ArrayList();
    public final Bundle g = new Bundle();
    public int h;
    public RemoteViews i;

    public static class a {
        public static Notification a(Notification.Builder builder) {
            return builder.build();
        }

        public static Notification.Builder b(Notification.Builder builder, int i) {
            return builder.setPriority(i);
        }

        public static Notification.Builder c(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSubText(charSequence);
        }

        public static Notification.Builder d(Notification.Builder builder, boolean z) {
            return builder.setUsesChronometer(z);
        }
    }

    public static class b {
        public static Notification.Builder a(Notification.Builder builder, boolean z) {
            return builder.setShowWhen(z);
        }
    }

    public static class c {
        public static Notification.Builder a(Notification.Builder builder, Bundle bundle) {
            return builder.setExtras(bundle);
        }
    }

    public static class d {
        public static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        public static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        public static Notification.Action.Builder e(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i, charSequence, pendingIntent);
        }

        public static String f(Notification notification) {
            return notification.getGroup();
        }

        public static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        public static Notification.Builder h(Notification.Builder builder, boolean z) {
            return builder.setGroupSummary(z);
        }

        public static Notification.Builder i(Notification.Builder builder, boolean z) {
            return builder.setLocalOnly(z);
        }

        public static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    public static class e {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        public static Notification.Builder c(Notification.Builder builder, int i) {
            return builder.setColor(i);
        }

        public static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        public static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        public static Notification.Builder f(Notification.Builder builder, int i) {
            return builder.setVisibility(i);
        }
    }

    public static class f {
        public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        public static Notification.Builder b(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    public static class g {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
            return builder.setAllowGeneratedReplies(z);
        }

        public static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        public static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        public static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    public static class h {
        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static Notification.Builder b(Notification.Builder builder, int i) {
            return builder.setBadgeIconType(i);
        }

        public static Notification.Builder c(Notification.Builder builder, boolean z) {
            return builder.setColorized(z);
        }

        public static Notification.Builder d(Notification.Builder builder, int i) {
            return builder.setGroupAlertBehavior(i);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        public static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        public static Notification.Builder g(Notification.Builder builder, long j) {
            return builder.setTimeoutAfter(j);
        }
    }

    public static class i {
        public static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, int i) {
            return builder.setSemanticAction(i);
        }
    }

    public static class j {
        public static Notification.Builder a(Notification.Builder builder, boolean z) {
            return builder.setAllowSystemGeneratedContextualActions(z);
        }

        public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z) {
            return builder.setContextual(z);
        }

        public static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    public static class k {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
            return builder.setAuthenticationRequired(z);
        }

        public static Notification.Builder b(Notification.Builder builder, int i) {
            return builder.setForegroundServiceBehavior(i);
        }
    }

    public be4(ae4.e eVar) {
        int i2;
        this.c = eVar;
        Context context = eVar.a;
        this.a = context;
        Notification.Builder builderA = h.a(context, eVar.K);
        this.b = builderA;
        Notification notification = eVar.R;
        builderA.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.e).setContentText(eVar.f).setContentInfo(eVar.k).setContentIntent(eVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.h, (notification.flags & 128) != 0).setLargeIcon(eVar.j).setNumber(eVar.l).setProgress(eVar.t, eVar.u, eVar.v);
        a.b(a.d(a.c(builderA, eVar.q), eVar.o), eVar.m);
        Iterator it = eVar.b.iterator();
        while (it.hasNext()) {
            b((ae4.a) it.next());
        }
        Bundle bundle = eVar.D;
        if (bundle != null) {
            this.g.putAll(bundle);
        }
        int i3 = Build.VERSION.SDK_INT;
        this.d = eVar.H;
        this.e = eVar.I;
        b.a(this.b, eVar.n);
        d.i(this.b, eVar.z);
        d.g(this.b, eVar.w);
        d.j(this.b, eVar.y);
        d.h(this.b, eVar.x);
        this.h = eVar.O;
        e.b(this.b, eVar.C);
        e.c(this.b, eVar.E);
        e.f(this.b, eVar.F);
        e.d(this.b, eVar.G);
        e.e(this.b, notification.sound, notification.audioAttributes);
        List listE = i3 < 28 ? e(g(eVar.c), eVar.U) : eVar.U;
        if (listE != null && !listE.isEmpty()) {
            Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                e.a(this.b, (String) it2.next());
            }
        }
        this.i = eVar.J;
        if (eVar.d.size() > 0) {
            Bundle bundle2 = eVar.c().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i4 = 0; i4 < eVar.d.size(); i4++) {
                bundle4.putBundle(Integer.toString(i4), ce4.a((ae4.a) eVar.d.get(i4)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.c().putBundle("android.car.EXTENSIONS", bundle2);
            this.g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i5 = Build.VERSION.SDK_INT;
        Object obj = eVar.T;
        if (obj != null) {
            f.b(this.b, obj);
        }
        c.a(this.b, eVar.D);
        g.e(this.b, eVar.s);
        RemoteViews remoteViews = eVar.H;
        if (remoteViews != null) {
            g.c(this.b, remoteViews);
        }
        RemoteViews remoteViews2 = eVar.I;
        if (remoteViews2 != null) {
            g.b(this.b, remoteViews2);
        }
        RemoteViews remoteViews3 = eVar.J;
        if (remoteViews3 != null) {
            g.d(this.b, remoteViews3);
        }
        h.b(this.b, eVar.L);
        h.e(this.b, eVar.r);
        h.f(this.b, eVar.M);
        h.g(this.b, eVar.N);
        h.d(this.b, eVar.O);
        if (eVar.B) {
            h.c(this.b, eVar.A);
        }
        if (!TextUtils.isEmpty(eVar.K)) {
            this.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i5 >= 28) {
            Iterator it3 = eVar.c.iterator();
            if (it3.hasNext()) {
                wb0.a(it3.next());
                throw null;
            }
        }
        if (i5 >= 29) {
            j.a(this.b, eVar.Q);
            j.b(this.b, ae4.d.a(null));
        }
        if (i5 >= 31 && (i2 = eVar.P) != 0) {
            k.b(this.b, i2);
        }
        if (eVar.S) {
            if (this.c.x) {
                this.h = 2;
            } else {
                this.h = 1;
            }
            this.b.setVibrate(null);
            this.b.setSound(null);
            int i6 = notification.defaults & (-4);
            notification.defaults = i6;
            this.b.setDefaults(i6);
            if (TextUtils.isEmpty(this.c.w)) {
                d.g(this.b, "silent");
            }
            h.d(this.b, this.h);
        }
    }

    public static List e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        qx qxVar = new qx(list.size() + list2.size());
        qxVar.addAll(list);
        qxVar.addAll(list2);
        return new ArrayList(qxVar);
    }

    public static List g(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        wb0.a(it.next());
        throw null;
    }

    @Override // com.zepto.zd4
    public Notification.Builder a() {
        return this.b;
    }

    public final void b(ae4.a aVar) {
        IconCompat iconCompatD = aVar.d();
        Notification.Action.Builder builderA = f.a(iconCompatD != null ? iconCompatD.l() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : e85.b(aVar.e())) {
                d.c(builderA, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i2 = Build.VERSION.SDK_INT;
        g.a(builderA, aVar.b());
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i2 >= 28) {
            i.b(builderA, aVar.f());
        }
        if (i2 >= 29) {
            j.c(builderA, aVar.j());
        }
        if (i2 >= 31) {
            k.a(builderA, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        d.b(builderA, bundle);
        d.a(this.b, d.d(builderA));
    }

    public Notification c() {
        Bundle bundleA;
        RemoteViews remoteViewsF;
        RemoteViews remoteViewsD;
        ae4.f fVar = this.c.p;
        if (fVar != null) {
            fVar.b(this);
        }
        RemoteViews remoteViewsE = fVar != null ? fVar.e(this) : null;
        Notification notificationD = d();
        if (remoteViewsE != null) {
            notificationD.contentView = remoteViewsE;
        } else {
            RemoteViews remoteViews = this.c.H;
            if (remoteViews != null) {
                notificationD.contentView = remoteViews;
            }
        }
        if (fVar != null && (remoteViewsD = fVar.d(this)) != null) {
            notificationD.bigContentView = remoteViewsD;
        }
        if (fVar != null && (remoteViewsF = this.c.p.f(this)) != null) {
            notificationD.headsUpContentView = remoteViewsF;
        }
        if (fVar != null && (bundleA = ae4.a(notificationD)) != null) {
            fVar.a(bundleA);
        }
        return notificationD;
    }

    public Notification d() {
        return a.a(this.b);
    }

    public Context f() {
        return this.a;
    }
}
