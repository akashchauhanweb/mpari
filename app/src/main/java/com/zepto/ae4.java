package com.zepto;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class ae4 {

    public static class a {
        public final Bundle a;
        public IconCompat b;
        public final e85[] c;
        public final e85[] d;
        public boolean e;
        public boolean f;
        public final int g;
        public final boolean h;
        public int i;
        public CharSequence j;
        public PendingIntent k;
        public boolean l;

        public a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.c(null, "", i) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.k;
        }

        public boolean b() {
            return this.e;
        }

        public Bundle c() {
            return this.a;
        }

        public IconCompat d() {
            int i;
            if (this.b == null && (i = this.i) != 0) {
                this.b = IconCompat.c(null, "", i);
            }
            return this.b;
        }

        public e85[] e() {
            return this.c;
        }

        public int f() {
            return this.g;
        }

        public boolean g() {
            return this.f;
        }

        public CharSequence h() {
            return this.j;
        }

        public boolean i() {
            return this.l;
        }

        public boolean j() {
            return this.h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, e85[] e85VarArr, e85[] e85VarArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.f = true;
            this.b = iconCompat;
            if (iconCompat != null && iconCompat.g() == 2) {
                this.i = iconCompat.e();
            }
            this.j = e.d(charSequence);
            this.k = pendingIntent;
            this.a = bundle == null ? new Bundle() : bundle;
            this.c = e85VarArr;
            this.d = e85VarArr2;
            this.e = z;
            this.g = i;
            this.f = z2;
            this.h = z3;
            this.l = z4;
        }
    }

    public static class b extends f {
        public IconCompat e;
        public IconCompat f;
        public boolean g;
        public CharSequence h;
        public boolean i;

        public static class a {
            public static Notification.BigPictureStyle a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                return bigPictureStyle.bigPicture(bitmap);
            }

            public static Notification.BigPictureStyle b(Notification.Builder builder) {
                return new Notification.BigPictureStyle(builder);
            }

            public static Notification.BigPictureStyle c(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                return bigPictureStyle.setBigContentTitle(charSequence);
            }

            public static void d(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            public static void e(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* JADX INFO: renamed from: com.zepto.ae4$b$b, reason: collision with other inner class name */
        public static class C0065b {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        public static class c {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        @Override // com.zepto.ae4.f
        public void b(zd4 zd4Var) {
            int i = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle bigPictureStyleC = a.c(a.b(zd4Var.a()), this.b);
            IconCompat iconCompat = this.e;
            if (iconCompat != null) {
                if (i >= 31) {
                    c.a(bigPictureStyleC, this.e.m(zd4Var instanceof be4 ? ((be4) zd4Var).f() : null));
                } else if (iconCompat.g() == 1) {
                    bigPictureStyleC = a.a(bigPictureStyleC, this.e.d());
                }
            }
            if (this.g) {
                if (this.f == null) {
                    a.d(bigPictureStyleC, null);
                } else {
                    C0065b.a(bigPictureStyleC, this.f.m(zd4Var instanceof be4 ? ((be4) zd4Var).f() : null));
                }
            }
            if (this.d) {
                a.e(bigPictureStyleC, this.c);
            }
            if (i >= 31) {
                c.c(bigPictureStyleC, this.i);
                c.b(bigPictureStyleC, this.h);
            }
        }

        @Override // com.zepto.ae4.f
        public String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b h(Bitmap bitmap) {
            this.f = bitmap == null ? null : IconCompat.b(bitmap);
            this.g = true;
            return this;
        }

        public b i(Bitmap bitmap) {
            this.e = bitmap == null ? null : IconCompat.b(bitmap);
            return this;
        }
    }

    public static class c extends f {
        public CharSequence e;

        public static class a {
            public static Notification.BigTextStyle a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            public static Notification.BigTextStyle b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            public static Notification.BigTextStyle c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            public static Notification.BigTextStyle d(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setSummaryText(charSequence);
            }
        }

        @Override // com.zepto.ae4.f
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // com.zepto.ae4.f
        public void b(zd4 zd4Var) {
            Notification.BigTextStyle bigTextStyleA = a.a(a.c(a.b(zd4Var.a()), this.b), this.e);
            if (this.d) {
                a.d(bigTextStyleA, this.c);
            }
        }

        @Override // com.zepto.ae4.f
        public String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c h(CharSequence charSequence) {
            this.e = e.d(charSequence);
            return this;
        }
    }

    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    public static abstract class f {
        public e a;
        public CharSequence b;
        public CharSequence c;
        public boolean d = false;

        public void a(Bundle bundle) {
            if (this.d) {
                bundle.putCharSequence("android.summaryText", this.c);
            }
            CharSequence charSequence = this.b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
            }
        }

        public abstract void b(zd4 zd4Var);

        public abstract String c();

        public RemoteViews d(zd4 zd4Var) {
            return null;
        }

        public RemoteViews e(zd4 zd4Var) {
            return null;
        }

        public RemoteViews f(zd4 zd4Var) {
            return null;
        }

        public void g(e eVar) {
            if (this.a != eVar) {
                this.a = eVar;
                if (eVar != null) {
                    eVar.y(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static class e {
        public boolean A;
        public boolean B;
        public String C;
        public Bundle D;
        public int E;
        public int F;
        public Notification G;
        public RemoteViews H;
        public RemoteViews I;
        public RemoteViews J;
        public String K;
        public int L;
        public String M;
        public long N;
        public int O;
        public int P;
        public boolean Q;
        public Notification R;
        public boolean S;
        public Object T;
        public ArrayList U;
        public Context a;
        public ArrayList b;
        public ArrayList c;
        public ArrayList d;
        public CharSequence e;
        public CharSequence f;
        public PendingIntent g;
        public PendingIntent h;
        public RemoteViews i;
        public Bitmap j;
        public CharSequence k;
        public int l;
        public int m;
        public boolean n;
        public boolean o;
        public f p;
        public CharSequence q;
        public CharSequence r;
        public CharSequence[] s;
        public int t;
        public int u;
        public boolean v;
        public String w;
        public boolean x;
        public String y;
        public boolean z;

        public static class a {
            public static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            public static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i) {
                return builder.setContentType(i);
            }

            public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i) {
                return builder.setLegacyStreamType(i);
            }

            public static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i) {
                return builder.setUsage(i);
            }
        }

        public e(Context context, String str) {
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.n = true;
            this.z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.O = 0;
            this.P = 0;
            Notification notification = new Notification();
            this.R = notification;
            this.a = context;
            this.K = str;
            notification.when = System.currentTimeMillis();
            this.R.audioStreamType = -1;
            this.m = 0;
            this.U = new ArrayList();
            this.Q = true;
        }

        public static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public e A(long[] jArr) {
            this.R.vibrate = jArr;
            return this;
        }

        public e B(int i) {
            this.F = i;
            return this;
        }

        public e C(long j) {
            this.R.when = j;
            return this;
        }

        public e a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.b.add(new a(i, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new be4(this).c();
        }

        public Bundle c() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public final Bitmap e(Bitmap bitmap) {
            return bitmap;
        }

        public e f(boolean z) {
            o(16, z);
            return this;
        }

        public e g(String str) {
            this.K = str;
            return this;
        }

        public e h(int i) {
            this.E = i;
            return this;
        }

        public e i(RemoteViews remoteViews) {
            this.R.contentView = remoteViews;
            return this;
        }

        public e j(PendingIntent pendingIntent) {
            this.g = pendingIntent;
            return this;
        }

        public e k(CharSequence charSequence) {
            this.f = d(charSequence);
            return this;
        }

        public e l(CharSequence charSequence) {
            this.e = d(charSequence);
            return this;
        }

        public e m(int i) {
            Notification notification = this.R;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e n(PendingIntent pendingIntent) {
            this.R.deleteIntent = pendingIntent;
            return this;
        }

        public final void o(int i, boolean z) {
            if (z) {
                Notification notification = this.R;
                notification.flags = i | notification.flags;
            } else {
                Notification notification2 = this.R;
                notification2.flags = (~i) & notification2.flags;
            }
        }

        public e p(Bitmap bitmap) {
            this.j = e(bitmap);
            return this;
        }

        public e q(int i, int i2, int i3) {
            Notification notification = this.R;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            notification.flags = ((i2 == 0 || i3 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e r(boolean z) {
            this.z = z;
            return this;
        }

        public e s(int i) {
            this.l = i;
            return this;
        }

        public e t(boolean z) {
            o(8, z);
            return this;
        }

        public e u(int i) {
            this.m = i;
            return this;
        }

        public e v(boolean z) {
            this.n = z;
            return this;
        }

        public e w(int i) {
            this.R.icon = i;
            return this;
        }

        public e x(Uri uri) {
            Notification notification = this.R;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder builderE = a.e(a.c(a.b(), 4), 5);
            this.R.audioAttributes = a.a(builderE);
            return this;
        }

        public e y(f fVar) {
            if (this.p != fVar) {
                this.p = fVar;
                if (fVar != null) {
                    fVar.g(this);
                }
            }
            return this;
        }

        public e z(CharSequence charSequence) {
            this.R.tickerText = d(charSequence);
            return this;
        }

        public e(Context context) {
            this(context, null);
        }
    }
}
