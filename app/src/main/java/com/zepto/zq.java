package com.zepto;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.lifecycle.h;
import com.zepto.d96;
import com.zepto.ed5;
import com.zepto.g63;
import com.zepto.z5;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.io.ConstantsKt;
import kotlin.time.DurationKt;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class zq extends yq implements e.a, LayoutInflater.Factory2 {
    public static final w26 j0 = new w26();
    public static final boolean k0 = false;
    public static final int[] l0 = {R.attr.windowBackground};
    public static final boolean m0 = !"robolectric".equals(Build.FINGERPRINT);
    public static final boolean n0 = true;
    public boolean A;
    public ViewGroup B;
    public TextView C;
    public View D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public u[] M;
    public u N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public Configuration S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public q X;
    public q Y;
    public boolean Z;
    public int a0;
    public final Runnable b0;
    public boolean c0;
    public Rect d0;
    public Rect e0;
    public cs f0;
    public gb3 g0;
    public OnBackInvokedDispatcher h0;
    public OnBackInvokedCallback i0;
    public final Object j;
    public final Context k;
    public Window l;
    public o m;
    public final sq n;
    public t5 o;
    public MenuInflater p;
    public CharSequence q;
    public ue1 r;
    public h s;
    public v t;
    public z5 u;
    public ActionBarContextView v;
    public PopupWindow w;
    public Runnable x;
    public lr7 y;
    public boolean z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            zq zqVar = zq.this;
            if ((zqVar.a0 & 1) != 0) {
                zqVar.i0(0);
            }
            zq zqVar2 = zq.this;
            if ((zqVar2.a0 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
                zqVar2.i0(108);
            }
            zq zqVar3 = zq.this;
            zqVar3.Z = false;
            zqVar3.a0 = 0;
        }
    }

    public class b implements cg4 {
        public b() {
        }

        @Override // com.zepto.cg4
        public qv7 a(View view, qv7 qv7Var) {
            int iL = qv7Var.l();
            int iF1 = zq.this.f1(qv7Var, null);
            if (iL != iF1) {
                qv7Var = qv7Var.q(qv7Var.j(), iF1, qv7Var.k(), qv7Var.i());
            }
            return dq7.c0(view, qv7Var);
        }
    }

    public class c implements ContentFrameLayout.a {
        public c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            zq.this.g0();
        }
    }

    public class d implements Runnable {

        public class a extends or7 {
            public a() {
            }

            @Override // com.zepto.nr7
            public void b(View view) {
                zq.this.v.setAlpha(1.0f);
                zq.this.y.h(null);
                zq.this.y = null;
            }

            @Override // com.zepto.or7, com.zepto.nr7
            public void c(View view) {
                zq.this.v.setVisibility(0);
            }
        }

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            zq zqVar = zq.this;
            zqVar.w.showAtLocation(zqVar.v, 55, 0, 0);
            zq.this.j0();
            if (!zq.this.U0()) {
                zq.this.v.setAlpha(1.0f);
                zq.this.v.setVisibility(0);
            } else {
                zq.this.v.setAlpha(0.0f);
                zq zqVar2 = zq.this;
                zqVar2.y = dq7.e(zqVar2.v).b(1.0f);
                zq.this.y.h(new a());
            }
        }
    }

    public class e extends or7 {
        public e() {
        }

        @Override // com.zepto.nr7
        public void b(View view) {
            zq.this.v.setAlpha(1.0f);
            zq.this.y.h(null);
            zq.this.y = null;
        }

        @Override // com.zepto.or7, com.zepto.nr7
        public void c(View view) {
            zq.this.v.setVisibility(0);
            if (zq.this.v.getParent() instanceof View) {
                dq7.n0((View) zq.this.v.getParent());
            }
        }
    }

    public class f implements v5 {
        public f() {
        }

        @Override // com.zepto.v5
        public void a(Drawable drawable, int i) {
            t5 t5VarS = zq.this.s();
            if (t5VarS != null) {
                t5VarS.v(drawable);
                t5VarS.u(i);
            }
        }

        @Override // com.zepto.v5
        public Context b() {
            return zq.this.o0();
        }
    }

    public interface g {
        boolean a(int i);

        View onCreatePanelView(int i);
    }

    public final class h implements i.a {
        public h() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
            zq.this.Z(eVar);
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackV0 = zq.this.v0();
            if (callbackV0 == null) {
                return true;
            }
            callbackV0.onMenuOpened(108, eVar);
            return true;
        }
    }

    public class i implements z5.a {
        public z5.a a;

        public class a extends or7 {
            public a() {
            }

            @Override // com.zepto.nr7
            public void b(View view) {
                zq.this.v.setVisibility(8);
                zq zqVar = zq.this;
                PopupWindow popupWindow = zqVar.w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (zqVar.v.getParent() instanceof View) {
                    dq7.n0((View) zq.this.v.getParent());
                }
                zq.this.v.k();
                zq.this.y.h(null);
                zq zqVar2 = zq.this;
                zqVar2.y = null;
                dq7.n0(zqVar2.B);
            }
        }

        public i(z5.a aVar) {
            this.a = aVar;
        }

        @Override // com.zepto.z5.a
        public void a(z5 z5Var) {
            this.a.a(z5Var);
            zq zqVar = zq.this;
            if (zqVar.w != null) {
                zqVar.l.getDecorView().removeCallbacks(zq.this.x);
            }
            zq zqVar2 = zq.this;
            if (zqVar2.v != null) {
                zqVar2.j0();
                zq zqVar3 = zq.this;
                zqVar3.y = dq7.e(zqVar3.v).b(0.0f);
                zq.this.y.h(new a());
            }
            zq zqVar4 = zq.this;
            sq sqVar = zqVar4.n;
            if (sqVar != null) {
                sqVar.n(zqVar4.u);
            }
            zq zqVar5 = zq.this;
            zqVar5.u = null;
            dq7.n0(zqVar5.B);
            zq.this.d1();
        }

        @Override // com.zepto.z5.a
        public boolean b(z5 z5Var, Menu menu) {
            return this.a.b(z5Var, menu);
        }

        @Override // com.zepto.z5.a
        public boolean c(z5 z5Var, MenuItem menuItem) {
            return this.a.c(z5Var, menuItem);
        }

        @Override // com.zepto.z5.a
        public boolean d(z5 z5Var, Menu menu) {
            dq7.n0(zq.this.B);
            return this.a.d(z5Var, menu);
        }
    }

    public static class j {
        public static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        public static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }

        public static void c(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        public static void d(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    public static class k {
        public static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        public static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    public static class l {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        public static lm3 b(Configuration configuration) {
            return lm3.b(configuration.getLocales().toLanguageTags());
        }

        public static void c(lm3 lm3Var) {
            LocaleList.setDefault(LocaleList.forLanguageTags(lm3Var.g()));
        }

        public static void d(Configuration configuration, lm3 lm3Var) {
            configuration.setLocales(LocaleList.forLanguageTags(lm3Var.g()));
        }
    }

    public static class m {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i2 = configuration2.colorMode;
            if (i != (i2 & 3)) {
                configuration3.colorMode |= i2 & 3;
            }
            int i3 = configuration.colorMode & 12;
            int i4 = configuration2.colorMode;
            if (i3 != (i4 & 12)) {
                configuration3.colorMode |= i4 & 12;
            }
        }
    }

    public static class n {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Object obj, final zq zqVar) {
            Objects.requireNonNull(zqVar);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: com.zepto.fr
                public final void onBackInvoked() {
                    zqVar.D0();
                }
            };
            cr.a(obj).registerOnBackInvokedCallback(DurationKt.NANOS_IN_MILLIS, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        public static void c(Object obj, Object obj2) {
            cr.a(obj).unregisterOnBackInvokedCallback(br.a(obj2));
        }
    }

    public class o extends yu7 {
        public g b;
        public boolean c;
        public boolean d;
        public boolean e;

        public o(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.d = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.d = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.c = true;
                callback.onContentChanged();
            } finally {
                this.c = false;
            }
        }

        public void d(Window.Callback callback, int i, Menu menu) {
            try {
                this.e = true;
                callback.onPanelClosed(i, menu);
            } finally {
                this.e = false;
            }
        }

        @Override // com.zepto.yu7, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.d ? a().dispatchKeyEvent(keyEvent) : zq.this.h0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // com.zepto.yu7, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || zq.this.G0(keyEvent.getKeyCode(), keyEvent);
        }

        public void e(g gVar) {
            this.b = gVar;
        }

        public final ActionMode f(ActionMode.Callback callback) {
            d96.a aVar = new d96.a(zq.this.k, callback);
            z5 z5VarX0 = zq.this.X0(aVar);
            if (z5VarX0 != null) {
                return aVar.e(z5VarX0);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.c) {
                a().onContentChanged();
            }
        }

        @Override // com.zepto.yu7, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // com.zepto.yu7, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            View viewOnCreatePanelView;
            g gVar = this.b;
            return (gVar == null || (viewOnCreatePanelView = gVar.onCreatePanelView(i)) == null) ? super.onCreatePanelView(i) : viewOnCreatePanelView;
        }

        @Override // com.zepto.yu7, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            zq.this.J0(i);
            return true;
        }

        @Override // com.zepto.yu7, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            if (this.e) {
                a().onPanelClosed(i, menu);
            } else {
                super.onPanelClosed(i, menu);
                zq.this.K0(i);
            }
        }

        @Override // com.zepto.yu7, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.e0(true);
            }
            g gVar = this.b;
            boolean zOnPreparePanel = gVar != null && gVar.a(i);
            if (!zOnPreparePanel) {
                zOnPreparePanel = super.onPreparePanel(i, view, menu);
            }
            if (eVar != null) {
                eVar.e0(false);
            }
            return zOnPreparePanel;
        }

        @Override // com.zepto.yu7, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
            androidx.appcompat.view.menu.e eVar;
            u uVarT0 = zq.this.t0(0, true);
            if (uVarT0 == null || (eVar = uVarT0.j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // com.zepto.yu7, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (zq.this.B0() && i == 0) ? f(callback) : super.onWindowStartingActionMode(callback, i);
        }
    }

    public class p extends q {
        public final PowerManager c;

        public p(Context context) {
            super();
            this.c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // com.zepto.zq.q
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // com.zepto.zq.q
        public int c() {
            return k.a(this.c) ? 2 : 1;
        }

        @Override // com.zepto.zq.q
        public void d() {
            zq.this.T();
        }
    }

    public abstract class q {
        public BroadcastReceiver a;

        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                q.this.d();
            }
        }

        public q() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.a;
            if (broadcastReceiver != null) {
                try {
                    zq.this.k.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.a == null) {
                this.a = new a();
            }
            zq.this.k.registerReceiver(this.a, intentFilterB);
        }
    }

    public class r extends q {
        public final jo6 c;

        public r(jo6 jo6Var) {
            super();
            this.c = jo6Var;
        }

        @Override // com.zepto.zq.q
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // com.zepto.zq.q
        public int c() {
            return this.c.d() ? 2 : 1;
        }

        @Override // com.zepto.zq.q
        public void d() {
            zq.this.T();
        }
    }

    public static class s {
        public static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    public class t extends ContentFrameLayout {
        public t(Context context) {
            super(context);
        }

        public final boolean b(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return zq.this.h0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            zq.this.b0(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(tr.b(getContext(), i));
        }
    }

    public static final class u {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public ViewGroup g;
        public View h;
        public View i;
        public androidx.appcompat.view.menu.e j;
        public androidx.appcompat.view.menu.c k;
        public Context l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public boolean q = false;
        public boolean r;
        public Bundle s;

        public u(int i) {
            this.a = i;
        }

        public androidx.appcompat.view.menu.j a(i.a aVar) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.l, r05.j);
                this.k = cVar;
                cVar.n(aVar);
                this.j.b(this.k);
            }
            return this.k.d(this.g);
        }

        public boolean b() {
            if (this.h == null) {
                return false;
            }
            return this.i != null || this.k.a().getCount() > 0;
        }

        public void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.Q(this.k);
            }
            this.j = eVar;
            if (eVar == null || (cVar = this.k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        public void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(zy4.a, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                themeNewTheme.applyStyle(i, true);
            }
            themeNewTheme.resolveAttribute(zy4.F, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                themeNewTheme.applyStyle(i2, true);
            } else {
                themeNewTheme.applyStyle(h15.b, true);
            }
            az0 az0Var = new az0(context, 0);
            az0Var.getTheme().setTo(themeNewTheme);
            this.l = az0Var;
            TypedArray typedArrayObtainStyledAttributes = az0Var.obtainStyledAttributes(c25.y0);
            this.b = typedArrayObtainStyledAttributes.getResourceId(c25.B0, 0);
            this.f = typedArrayObtainStyledAttributes.getResourceId(c25.A0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final class v implements i.a {
        public v() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
            androidx.appcompat.view.menu.e eVarF = eVar.F();
            boolean z2 = eVarF != eVar;
            zq zqVar = zq.this;
            if (z2) {
                eVar = eVarF;
            }
            u uVarM0 = zqVar.m0(eVar);
            if (uVarM0 != null) {
                if (!z2) {
                    zq.this.c0(uVarM0, z);
                } else {
                    zq.this.Y(uVarM0.a, uVarM0, eVarF);
                    zq.this.c0(uVarM0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackV0;
            if (eVar != eVar.F()) {
                return true;
            }
            zq zqVar = zq.this;
            if (!zqVar.G || (callbackV0 = zqVar.v0()) == null || zq.this.R) {
                return true;
            }
            callbackV0.onMenuOpened(108, eVar);
            return true;
        }
    }

    public zq(Activity activity, sq sqVar) {
        this(activity, null, sqVar, activity);
    }

    public static Configuration n0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f2 = configuration.fontScale;
            float f3 = configuration2.fontScale;
            if (f2 != f3) {
                configuration3.fontScale = f3;
            }
            int i2 = configuration.mcc;
            int i3 = configuration2.mcc;
            if (i2 != i3) {
                configuration3.mcc = i3;
            }
            int i4 = configuration.mnc;
            int i5 = configuration2.mnc;
            if (i4 != i5) {
                configuration3.mnc = i5;
            }
            l.a(configuration, configuration2, configuration3);
            int i6 = configuration.touchscreen;
            int i7 = configuration2.touchscreen;
            if (i6 != i7) {
                configuration3.touchscreen = i7;
            }
            int i8 = configuration.keyboard;
            int i9 = configuration2.keyboard;
            if (i8 != i9) {
                configuration3.keyboard = i9;
            }
            int i10 = configuration.keyboardHidden;
            int i11 = configuration2.keyboardHidden;
            if (i10 != i11) {
                configuration3.keyboardHidden = i11;
            }
            int i12 = configuration.navigation;
            int i13 = configuration2.navigation;
            if (i12 != i13) {
                configuration3.navigation = i13;
            }
            int i14 = configuration.navigationHidden;
            int i15 = configuration2.navigationHidden;
            if (i14 != i15) {
                configuration3.navigationHidden = i15;
            }
            int i16 = configuration.orientation;
            int i17 = configuration2.orientation;
            if (i16 != i17) {
                configuration3.orientation = i17;
            }
            int i18 = configuration.screenLayout & 15;
            int i19 = configuration2.screenLayout;
            if (i18 != (i19 & 15)) {
                configuration3.screenLayout |= i19 & 15;
            }
            int i20 = configuration.screenLayout & 192;
            int i21 = configuration2.screenLayout;
            if (i20 != (i21 & 192)) {
                configuration3.screenLayout |= i21 & 192;
            }
            int i22 = configuration.screenLayout & 48;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 48)) {
                configuration3.screenLayout |= i23 & 48;
            }
            int i24 = configuration.screenLayout & 768;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 768)) {
                configuration3.screenLayout |= i25 & 768;
            }
            m.a(configuration, configuration2, configuration3);
            int i26 = configuration.uiMode & 15;
            int i27 = configuration2.uiMode;
            if (i26 != (i27 & 15)) {
                configuration3.uiMode |= i27 & 15;
            }
            int i28 = configuration.uiMode & 48;
            int i29 = configuration2.uiMode;
            if (i28 != (i29 & 48)) {
                configuration3.uiMode |= i29 & 48;
            }
            int i30 = configuration.screenWidthDp;
            int i31 = configuration2.screenWidthDp;
            if (i30 != i31) {
                configuration3.screenWidthDp = i31;
            }
            int i32 = configuration.screenHeightDp;
            int i33 = configuration2.screenHeightDp;
            if (i32 != i33) {
                configuration3.screenHeightDp = i33;
            }
            int i34 = configuration.smallestScreenWidthDp;
            int i35 = configuration2.smallestScreenWidthDp;
            if (i34 != i35) {
                configuration3.smallestScreenWidthDp = i35;
            }
            j.b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    @Override // com.zepto.yq
    public void A(Bundle bundle) {
        k0();
    }

    public final void A0(int i2) {
        this.a0 = (1 << i2) | this.a0;
        if (this.Z) {
            return;
        }
        dq7.i0(this.l.getDecorView(), this.b0);
        this.Z = true;
    }

    @Override // com.zepto.yq
    public void B() {
        t5 t5VarS = s();
        if (t5VarS != null) {
            t5VarS.w(true);
        }
    }

    public boolean B0() {
        return this.z;
    }

    @Override // com.zepto.yq
    public void C(Bundle bundle) {
    }

    public int C0(Context context, int i2) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return r0(context).c();
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    return q0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i2;
    }

    @Override // com.zepto.yq
    public void D() {
        S(true, false);
    }

    public boolean D0() {
        boolean z = this.O;
        this.O = false;
        u uVarT0 = t0(0, false);
        if (uVarT0 != null && uVarT0.o) {
            if (!z) {
                c0(uVarT0, true);
            }
            return true;
        }
        z5 z5Var = this.u;
        if (z5Var != null) {
            z5Var.c();
            return true;
        }
        t5 t5VarS = s();
        return t5VarS != null && t5VarS.h();
    }

    @Override // com.zepto.yq
    public void E() {
        t5 t5VarS = s();
        if (t5VarS != null) {
            t5VarS.w(false);
        }
    }

    public boolean E0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            this.O = (keyEvent.getFlags() & 128) != 0;
        } else if (i2 == 82) {
            F0(0, keyEvent);
            return true;
        }
        return false;
    }

    public final boolean F0(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        u uVarT0 = t0(i2, true);
        if (uVarT0.o) {
            return false;
        }
        return P0(uVarT0, keyEvent);
    }

    public boolean G0(int i2, KeyEvent keyEvent) {
        t5 t5VarS = s();
        if (t5VarS != null && t5VarS.o(i2, keyEvent)) {
            return true;
        }
        u uVar = this.N;
        if (uVar != null && O0(uVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            u uVar2 = this.N;
            if (uVar2 != null) {
                uVar2.n = true;
            }
            return true;
        }
        if (this.N == null) {
            u uVarT0 = t0(0, true);
            P0(uVarT0, keyEvent);
            boolean zO0 = O0(uVarT0, keyEvent.getKeyCode(), keyEvent, 1);
            uVarT0.m = false;
            if (zO0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.zepto.yq
    public boolean H(int i2) {
        int iR0 = R0(i2);
        if (this.K && iR0 == 108) {
            return false;
        }
        if (this.G && iR0 == 1) {
            this.G = false;
        }
        if (iR0 == 1) {
            Z0();
            this.K = true;
            return true;
        }
        if (iR0 == 2) {
            Z0();
            this.E = true;
            return true;
        }
        if (iR0 == 5) {
            Z0();
            this.F = true;
            return true;
        }
        if (iR0 == 10) {
            Z0();
            this.I = true;
            return true;
        }
        if (iR0 == 108) {
            Z0();
            this.G = true;
            return true;
        }
        if (iR0 != 109) {
            return this.l.requestFeature(iR0);
        }
        Z0();
        this.H = true;
        return true;
    }

    public boolean H0(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            if (i2 == 82) {
                I0(0, keyEvent);
                return true;
            }
        } else if (D0()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean I0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            com.zepto.z5 r0 = r4.u
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            com.zepto.zq$u r2 = r4.t0(r5, r0)
            if (r5 != 0) goto L43
            com.zepto.ue1 r5 = r4.r
            if (r5 == 0) goto L43
            boolean r5 = r5.g()
            if (r5 == 0) goto L43
            android.content.Context r5 = r4.k
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L43
            com.zepto.ue1 r5 = r4.r
            boolean r5 = r5.b()
            if (r5 != 0) goto L3c
            boolean r5 = r4.R
            if (r5 != 0) goto L60
            boolean r5 = r4.P0(r2, r6)
            if (r5 == 0) goto L60
            com.zepto.ue1 r5 = r4.r
            boolean r0 = r5.f()
            goto L66
        L3c:
            com.zepto.ue1 r5 = r4.r
            boolean r0 = r5.e()
            goto L66
        L43:
            boolean r5 = r2.o
            if (r5 != 0) goto L62
            boolean r3 = r2.n
            if (r3 == 0) goto L4c
            goto L62
        L4c:
            boolean r5 = r2.m
            if (r5 == 0) goto L60
            boolean r5 = r2.r
            if (r5 == 0) goto L5c
            r2.m = r1
            boolean r5 = r4.P0(r2, r6)
            if (r5 == 0) goto L60
        L5c:
            r4.M0(r2, r6)
            goto L66
        L60:
            r0 = r1
            goto L66
        L62:
            r4.c0(r2, r0)
            r0 = r5
        L66:
            if (r0 == 0) goto L83
            android.content.Context r5 = r4.k
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L7c
            r5.playSoundEffect(r1)
            goto L83
        L7c:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.zq.I0(int, android.view.KeyEvent):boolean");
    }

    @Override // com.zepto.yq
    public void J(int i2) {
        k0();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.k).inflate(i2, viewGroup);
        this.m.c(this.l.getCallback());
    }

    public void J0(int i2) {
        t5 t5VarS;
        if (i2 != 108 || (t5VarS = s()) == null) {
            return;
        }
        t5VarS.i(true);
    }

    @Override // com.zepto.yq
    public void K(View view) {
        k0();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.m.c(this.l.getCallback());
    }

    public void K0(int i2) {
        if (i2 == 108) {
            t5 t5VarS = s();
            if (t5VarS != null) {
                t5VarS.i(false);
                return;
            }
            return;
        }
        if (i2 == 0) {
            u uVarT0 = t0(i2, true);
            if (uVarT0.o) {
                c0(uVarT0, false);
            }
        }
    }

    @Override // com.zepto.yq
    public void L(View view, ViewGroup.LayoutParams layoutParams) {
        k0();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.m.c(this.l.getCallback());
    }

    public void L0(ViewGroup viewGroup) {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // com.zepto.yq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void M(android.window.OnBackInvokedDispatcher r3) {
        /*
            r2 = this;
            super.M(r3)
            android.window.OnBackInvokedDispatcher r0 = r2.h0
            if (r0 == 0) goto L11
            android.window.OnBackInvokedCallback r1 = r2.i0
            if (r1 == 0) goto L11
            com.zepto.zq.n.c(r0, r1)
            r0 = 0
            r2.i0 = r0
        L11:
            if (r3 != 0) goto L2c
            java.lang.Object r0 = r2.j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L2c
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L2c
            java.lang.Object r3 = r2.j
            android.app.Activity r3 = (android.app.Activity) r3
            android.window.OnBackInvokedDispatcher r3 = com.zepto.zq.n.a(r3)
            r2.h0 = r3
            goto L2e
        L2c:
            r2.h0 = r3
        L2e:
            r2.d1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.zq.M(android.window.OnBackInvokedDispatcher):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M0(com.zepto.zq.u r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.zq.M0(com.zepto.zq$u, android.view.KeyEvent):void");
    }

    @Override // com.zepto.yq
    public void N(Toolbar toolbar) {
        if (this.j instanceof Activity) {
            t5 t5VarS = s();
            if (t5VarS instanceof av7) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.p = null;
            if (t5VarS != null) {
                t5VarS.n();
            }
            this.o = null;
            if (toolbar != null) {
                oi6 oi6Var = new oi6(toolbar, u0(), this.m);
                this.o = oi6Var;
                this.m.e(oi6Var.c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.m.e(null);
            }
            u();
        }
    }

    public final t5 N0() {
        return this.o;
    }

    @Override // com.zepto.yq
    public void O(int i2) {
        this.U = i2;
    }

    public final boolean O0(u uVar, int i2, KeyEvent keyEvent, int i3) {
        androidx.appcompat.view.menu.e eVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((uVar.m || P0(uVar, keyEvent)) && (eVar = uVar.j) != null) {
            zPerformShortcut = eVar.performShortcut(i2, keyEvent, i3);
        }
        if (zPerformShortcut && (i3 & 1) == 0 && this.r == null) {
            c0(uVar, true);
        }
        return zPerformShortcut;
    }

    @Override // com.zepto.yq
    public final void P(CharSequence charSequence) {
        this.q = charSequence;
        ue1 ue1Var = this.r;
        if (ue1Var != null) {
            ue1Var.setWindowTitle(charSequence);
            return;
        }
        if (N0() != null) {
            N0().y(charSequence);
            return;
        }
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final boolean P0(u uVar, KeyEvent keyEvent) {
        ue1 ue1Var;
        ue1 ue1Var2;
        ue1 ue1Var3;
        if (this.R) {
            return false;
        }
        if (uVar.m) {
            return true;
        }
        u uVar2 = this.N;
        if (uVar2 != null && uVar2 != uVar) {
            c0(uVar2, false);
        }
        Window.Callback callbackV0 = v0();
        if (callbackV0 != null) {
            uVar.i = callbackV0.onCreatePanelView(uVar.a);
        }
        int i2 = uVar.a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (ue1Var3 = this.r) != null) {
            ue1Var3.c();
        }
        if (uVar.i == null && (!z || !(N0() instanceof oi6))) {
            androidx.appcompat.view.menu.e eVar = uVar.j;
            if (eVar == null || uVar.r) {
                if (eVar == null && (!z0(uVar) || uVar.j == null)) {
                    return false;
                }
                if (z && this.r != null) {
                    if (this.s == null) {
                        this.s = new h();
                    }
                    this.r.a(uVar.j, this.s);
                }
                uVar.j.h0();
                if (!callbackV0.onCreatePanelMenu(uVar.a, uVar.j)) {
                    uVar.c(null);
                    if (z && (ue1Var = this.r) != null) {
                        ue1Var.a(null, this.s);
                    }
                    return false;
                }
                uVar.r = false;
            }
            uVar.j.h0();
            Bundle bundle = uVar.s;
            if (bundle != null) {
                uVar.j.R(bundle);
                uVar.s = null;
            }
            if (!callbackV0.onPreparePanel(0, uVar.i, uVar.j)) {
                if (z && (ue1Var2 = this.r) != null) {
                    ue1Var2.a(null, this.s);
                }
                uVar.j.g0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            uVar.p = z2;
            uVar.j.setQwertyMode(z2);
            uVar.j.g0();
        }
        uVar.m = true;
        uVar.n = false;
        this.N = uVar;
        return true;
    }

    public final void Q0(boolean z) {
        ue1 ue1Var = this.r;
        if (ue1Var == null || !ue1Var.g() || (ViewConfiguration.get(this.k).hasPermanentMenuKey() && !this.r.d())) {
            u uVarT0 = t0(0, true);
            uVarT0.q = true;
            c0(uVarT0, false);
            M0(uVarT0, null);
            return;
        }
        Window.Callback callbackV0 = v0();
        if (this.r.b() && z) {
            this.r.e();
            if (this.R) {
                return;
            }
            callbackV0.onPanelClosed(108, t0(0, true).j);
            return;
        }
        if (callbackV0 == null || this.R) {
            return;
        }
        if (this.Z && (this.a0 & 1) != 0) {
            this.l.getDecorView().removeCallbacks(this.b0);
            this.b0.run();
        }
        u uVarT02 = t0(0, true);
        androidx.appcompat.view.menu.e eVar = uVarT02.j;
        if (eVar == null || uVarT02.r || !callbackV0.onPreparePanel(0, uVarT02.i, eVar)) {
            return;
        }
        callbackV0.onMenuOpened(108, uVarT02.j);
        this.r.f();
    }

    public final boolean R(boolean z) {
        return S(z, true);
    }

    public final int R0(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i2 != 9) {
            return i2;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    public final boolean S(boolean z, boolean z2) {
        if (this.R) {
            return false;
        }
        int iX = X();
        int iC0 = C0(this.k, iX);
        lm3 lm3VarW = Build.VERSION.SDK_INT < 33 ? W(this.k) : null;
        if (!z2 && lm3VarW != null) {
            lm3VarW = s0(this.k.getResources().getConfiguration());
        }
        boolean zC1 = c1(iC0, lm3VarW, z);
        if (iX == 0) {
            r0(this.k).e();
        } else {
            q qVar = this.X;
            if (qVar != null) {
                qVar.a();
            }
        }
        if (iX == 3) {
            q0(this.k).e();
        } else {
            q qVar2 = this.Y;
            if (qVar2 != null) {
                qVar2.a();
            }
        }
        return zC1;
    }

    public void S0(Configuration configuration, lm3 lm3Var) {
        l.d(configuration, lm3Var);
    }

    public boolean T() {
        return R(true);
    }

    public void T0(lm3 lm3Var) {
        l.c(lm3Var);
    }

    public final void U() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.B.findViewById(R.id.content);
        View decorView = this.l.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.k.obtainStyledAttributes(c25.y0);
        typedArrayObtainStyledAttributes.getValue(c25.K0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(c25.L0, contentFrameLayout.getMinWidthMinor());
        int i2 = c25.I0;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            typedArrayObtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMajor());
        }
        int i3 = c25.J0;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            typedArrayObtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedWidthMinor());
        }
        int i4 = c25.G0;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            typedArrayObtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMajor());
        }
        int i5 = c25.H0;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            typedArrayObtainStyledAttributes.getValue(i5, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    public final boolean U0() {
        ViewGroup viewGroup;
        return this.A && (viewGroup = this.B) != null && dq7.U(viewGroup);
    }

    public final void V(Window window) {
        if (this.l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof o) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        o oVar = new o(callback);
        this.m = oVar;
        window.setCallback(oVar);
        lg6 lg6VarU = lg6.u(this.k, null, l0);
        Drawable drawableH = lg6VarU.h(0);
        if (drawableH != null) {
            window.setBackgroundDrawable(drawableH);
        }
        lg6VarU.w();
        this.l = window;
        if (Build.VERSION.SDK_INT < 33 || this.h0 != null) {
            return;
        }
        M(null);
    }

    public final boolean V0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.l.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || dq7.T((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    public lm3 W(Context context) {
        lm3 lm3VarR;
        if (Build.VERSION.SDK_INT >= 33 || (lm3VarR = yq.r()) == null) {
            return null;
        }
        lm3 lm3VarS0 = s0(context.getApplicationContext().getResources().getConfiguration());
        lm3 lm3VarB = om3.b(lm3VarR, lm3VarS0);
        return lm3VarB.e() ? lm3VarS0 : lm3VarB;
    }

    public boolean W0() {
        if (this.h0 == null) {
            return false;
        }
        u uVarT0 = t0(0, false);
        return (uVarT0 != null && uVarT0.o) || this.u != null;
    }

    public final int X() {
        int i2 = this.T;
        return i2 != -100 ? i2 : yq.m();
    }

    public z5 X0(z5.a aVar) {
        sq sqVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        z5 z5Var = this.u;
        if (z5Var != null) {
            z5Var.c();
        }
        i iVar = new i(aVar);
        t5 t5VarS = s();
        if (t5VarS != null) {
            z5 z5VarZ = t5VarS.z(iVar);
            this.u = z5VarZ;
            if (z5VarZ != null && (sqVar = this.n) != null) {
                sqVar.X(z5VarZ);
            }
        }
        if (this.u == null) {
            this.u = Y0(iVar);
        }
        d1();
        return this.u;
    }

    public void Y(int i2, u uVar, Menu menu) {
        if (menu == null) {
            if (uVar == null && i2 >= 0) {
                u[] uVarArr = this.M;
                if (i2 < uVarArr.length) {
                    uVar = uVarArr[i2];
                }
            }
            if (uVar != null) {
                menu = uVar.j;
            }
        }
        if ((uVar == null || uVar.o) && !this.R) {
            this.m.d(this.l.getCallback(), i2, menu);
        }
    }

    public z5 Y0(z5.a aVar) {
        z5 z5VarS;
        Context az0Var;
        sq sqVar;
        j0();
        z5 z5Var = this.u;
        if (z5Var != null) {
            z5Var.c();
        }
        if (!(aVar instanceof i)) {
            aVar = new i(aVar);
        }
        sq sqVar2 = this.n;
        if (sqVar2 == null || this.R) {
            z5VarS = null;
        } else {
            try {
                z5VarS = sqVar2.s(aVar);
            } catch (AbstractMethodError unused) {
                z5VarS = null;
            }
        }
        if (z5VarS != null) {
            this.u = z5VarS;
        } else {
            if (this.v == null) {
                if (this.J) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.k.getTheme();
                    theme.resolveAttribute(zy4.d, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.k.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        az0Var = new az0(this.k, 0);
                        az0Var.getTheme().setTo(themeNewTheme);
                    } else {
                        az0Var = this.k;
                    }
                    this.v = new ActionBarContextView(az0Var);
                    PopupWindow popupWindow = new PopupWindow(az0Var, (AttributeSet) null, zy4.f);
                    this.w = popupWindow;
                    ft4.b(popupWindow, 2);
                    this.w.setContentView(this.v);
                    this.w.setWidth(-1);
                    az0Var.getTheme().resolveAttribute(zy4.b, typedValue, true);
                    this.v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, az0Var.getResources().getDisplayMetrics()));
                    this.w.setHeight(-2);
                    this.x = new d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.B.findViewById(b05.h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(o0()));
                        this.v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.v != null) {
                j0();
                this.v.k();
                j66 j66Var = new j66(this.v.getContext(), this.v, aVar, this.w == null);
                if (aVar.b(j66Var, j66Var.e())) {
                    j66Var.k();
                    this.v.h(j66Var);
                    this.u = j66Var;
                    if (U0()) {
                        this.v.setAlpha(0.0f);
                        lr7 lr7VarB = dq7.e(this.v).b(1.0f);
                        this.y = lr7VarB;
                        lr7VarB.h(new e());
                    } else {
                        this.v.setAlpha(1.0f);
                        this.v.setVisibility(0);
                        if (this.v.getParent() instanceof View) {
                            dq7.n0((View) this.v.getParent());
                        }
                    }
                    if (this.w != null) {
                        this.l.getDecorView().post(this.x);
                    }
                } else {
                    this.u = null;
                }
            }
        }
        z5 z5Var2 = this.u;
        if (z5Var2 != null && (sqVar = this.n) != null) {
            sqVar.X(z5Var2);
        }
        d1();
        return this.u;
    }

    public void Z(androidx.appcompat.view.menu.e eVar) {
        if (this.L) {
            return;
        }
        this.L = true;
        this.r.l();
        Window.Callback callbackV0 = v0();
        if (callbackV0 != null && !this.R) {
            callbackV0.onPanelClosed(108, eVar);
        }
        this.L = false;
    }

    public final void Z0() {
        if (this.A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        u uVarM0;
        Window.Callback callbackV0 = v0();
        if (callbackV0 == null || this.R || (uVarM0 = m0(eVar.F())) == null) {
            return false;
        }
        return callbackV0.onMenuItemSelected(uVarM0.a, menuItem);
    }

    public final void a0() {
        q qVar = this.X;
        if (qVar != null) {
            qVar.a();
        }
        q qVar2 = this.Y;
        if (qVar2 != null) {
            qVar2.a();
        }
    }

    public final pq a1() {
        for (Context baseContext = this.k; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof pq) {
                return (pq) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        Q0(true);
    }

    public void b0(int i2) {
        c0(t0(i2, true), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b1(Configuration configuration) {
        Activity activity = (Activity) this.j;
        if (activity instanceof df3) {
            if (((df3) activity).g0().b().b(h.b.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.Q || this.R) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    public void c0(u uVar, boolean z) {
        ViewGroup viewGroup;
        ue1 ue1Var;
        if (z && uVar.a == 0 && (ue1Var = this.r) != null && ue1Var.b()) {
            Z(uVar.j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.k.getSystemService("window");
        if (windowManager != null && uVar.o && (viewGroup = uVar.g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                Y(uVar.a, uVar, null);
            }
        }
        uVar.m = false;
        uVar.n = false;
        uVar.o = false;
        uVar.h = null;
        uVar.q = true;
        if (this.N == uVar) {
            this.N = null;
        }
        if (uVar.a == 0) {
            d1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c1(int r9, com.zepto.lm3 r10, boolean r11) {
        /*
            r8 = this;
            android.content.Context r1 = r8.k
            r4 = 0
            r5 = 0
            r0 = r8
            r2 = r9
            r3 = r10
            android.content.res.Configuration r0 = r0.d0(r1, r2, r3, r4, r5)
            android.content.Context r1 = r8.k
            int r1 = r8.p0(r1)
            android.content.res.Configuration r2 = r8.S
            if (r2 != 0) goto L1f
            android.content.Context r2 = r8.k
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L1f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            com.zepto.lm3 r2 = r8.s0(r2)
            r5 = 0
            if (r10 != 0) goto L30
            r0 = r5
            goto L34
        L30:
            com.zepto.lm3 r0 = r8.s0(r0)
        L34:
            r6 = 0
            if (r3 == r4) goto L3a
            r3 = 512(0x200, float:7.17E-43)
            goto L3b
        L3a:
            r3 = r6
        L3b:
            if (r0 == 0) goto L45
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L45
            r3 = r3 | 8196(0x2004, float:1.1485E-41)
        L45:
            int r2 = ~r1
            r2 = r2 & r3
            r7 = 1
            if (r2 == 0) goto L6f
            if (r11 == 0) goto L6f
            boolean r11 = r8.P
            if (r11 == 0) goto L6f
            boolean r11 = com.zepto.zq.m0
            if (r11 != 0) goto L58
            boolean r11 = r8.Q
            if (r11 == 0) goto L6f
        L58:
            java.lang.Object r11 = r8.j
            boolean r2 = r11 instanceof android.app.Activity
            if (r2 == 0) goto L6f
            android.app.Activity r11 = (android.app.Activity) r11
            boolean r11 = r11.isChild()
            if (r11 != 0) goto L6f
            java.lang.Object r11 = r8.j
            android.app.Activity r11 = (android.app.Activity) r11
            com.zepto.l8.r(r11)
            r11 = r7
            goto L70
        L6f:
            r11 = r6
        L70:
            if (r11 != 0) goto L7d
            if (r3 == 0) goto L7d
            r11 = r3 & r1
            if (r11 != r3) goto L79
            r6 = r7
        L79:
            r8.e1(r4, r0, r6, r5)
            goto L7e
        L7d:
            r7 = r11
        L7e:
            if (r7 == 0) goto L9a
            java.lang.Object r11 = r8.j
            boolean r1 = r11 instanceof com.zepto.pq
            if (r1 == 0) goto L9a
            r1 = r3 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L8f
            com.zepto.pq r11 = (com.zepto.pq) r11
            r11.Z0(r9)
        L8f:
            r9 = r3 & 4
            if (r9 == 0) goto L9a
            java.lang.Object r9 = r8.j
            com.zepto.pq r9 = (com.zepto.pq) r9
            r9.Y0(r10)
        L9a:
            if (r7 == 0) goto Laf
            if (r0 == 0) goto Laf
            android.content.Context r9 = r8.k
            android.content.res.Resources r9 = r9.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            com.zepto.lm3 r9 = r8.s0(r9)
            r8.T0(r9)
        Laf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.zq.c1(int, com.zepto.lm3, boolean):boolean");
    }

    public final Configuration d0(Context context, int i2, lm3 lm3Var, Configuration configuration, boolean z) {
        int i3 = i2 != 1 ? i2 != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (lm3Var != null) {
            S0(configuration2, lm3Var);
        }
        return configuration2;
    }

    public void d1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean zW0 = W0();
            if (zW0 && this.i0 == null) {
                this.i0 = n.b(this.h0, this);
            } else {
                if (zW0 || (onBackInvokedCallback = this.i0) == null) {
                    return;
                }
                n.c(this.h0, onBackInvokedCallback);
            }
        }
    }

    @Override // com.zepto.yq
    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        k0();
        ((ViewGroup) this.B.findViewById(R.id.content)).addView(view, layoutParams);
        this.m.c(this.l.getCallback());
    }

    public final ViewGroup e0() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.k.obtainStyledAttributes(c25.y0);
        int i2 = c25.D0;
        if (!typedArrayObtainStyledAttributes.hasValue(i2)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(c25.M0, false)) {
            H(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i2, false)) {
            H(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(c25.E0, false)) {
            H(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(c25.F0, false)) {
            H(10);
        }
        this.J = typedArrayObtainStyledAttributes.getBoolean(c25.z0, false);
        typedArrayObtainStyledAttributes.recycle();
        l0();
        this.l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.k);
        if (this.K) {
            viewGroup = this.I ? (ViewGroup) layoutInflaterFrom.inflate(r05.o, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(r05.n, (ViewGroup) null);
        } else if (this.J) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(r05.f, (ViewGroup) null);
            this.H = false;
            this.G = false;
        } else if (this.G) {
            TypedValue typedValue = new TypedValue();
            this.k.getTheme().resolveAttribute(zy4.d, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new az0(this.k, typedValue.resourceId) : this.k).inflate(r05.p, (ViewGroup) null);
            ue1 ue1Var = (ue1) viewGroup.findViewById(b05.p);
            this.r = ue1Var;
            ue1Var.setWindowCallback(v0());
            if (this.H) {
                this.r.k(109);
            }
            if (this.E) {
                this.r.k(2);
            }
            if (this.F) {
                this.r.k(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.G + ", windowActionBarOverlay: " + this.H + ", android:windowIsFloating: " + this.J + ", windowActionModeOverlay: " + this.I + ", windowNoTitle: " + this.K + " }");
        }
        dq7.E0(viewGroup, new b());
        if (this.r == null) {
            this.C = (TextView) viewGroup.findViewById(b05.L);
        }
        bs7.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(b05.b);
        ViewGroup viewGroup2 = (ViewGroup) this.l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    public final void e1(int i2, lm3 lm3Var, boolean z, Configuration configuration) {
        Resources resources = this.k.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i2 | (resources.getConfiguration().uiMode & (-49));
        if (lm3Var != null) {
            S0(configuration2, lm3Var);
        }
        resources.updateConfiguration(configuration2, null);
        int i3 = this.U;
        if (i3 != 0) {
            this.k.setTheme(i3);
            this.k.getTheme().applyStyle(this.U, true);
        }
        if (z && (this.j instanceof Activity)) {
            b1(configuration2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View f0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        boolean zV0 = false;
        if (this.f0 == null) {
            String string = this.k.obtainStyledAttributes(c25.y0).getString(c25.C0);
            if (string == null) {
                this.f0 = new cs();
            } else {
                try {
                    this.f0 = (cs) this.k.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f0 = new cs();
                }
            }
        }
        boolean z2 = k0;
        if (z2) {
            if (this.g0 == null) {
                this.g0 = new gb3();
            }
            if (this.g0.a(attributeSet)) {
                z = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zV0 = V0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zV0 = true;
                }
                z = zV0;
            }
        } else {
            z = zV0;
        }
        return this.f0.r(view, str, context, attributeSet, z, z2, true, pm7.d());
    }

    public final int f1(qv7 qv7Var, Rect rect) {
        boolean z;
        boolean z2;
        int iL = qv7Var != null ? qv7Var.l() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.v.getLayoutParams();
            if (this.v.isShown()) {
                if (this.d0 == null) {
                    this.d0 = new Rect();
                    this.e0 = new Rect();
                }
                Rect rect2 = this.d0;
                Rect rect3 = this.e0;
                if (qv7Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(qv7Var.j(), qv7Var.l(), qv7Var.k(), qv7Var.i());
                }
                bs7.a(this.B, rect2, rect3);
                int i2 = rect2.top;
                int i3 = rect2.left;
                int i4 = rect2.right;
                qv7 qv7VarI = dq7.I(this.B);
                int iJ = qv7VarI == null ? 0 : qv7VarI.j();
                int iK = qv7VarI == null ? 0 : qv7VarI.k();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                if (i2 <= 0 || this.D != null) {
                    View view = this.D;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != iJ || marginLayoutParams2.rightMargin != iK) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = iJ;
                            marginLayoutParams2.rightMargin = iK;
                            this.D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.k);
                    this.D = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iJ;
                    layoutParams.rightMargin = iK;
                    this.B.addView(this.D, -1, layoutParams);
                }
                View view3 = this.D;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    g1(this.D);
                }
                if (!this.I && z) {
                    iL = 0;
                }
                z = z;
                z = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z = false;
            }
            if (z) {
                this.v.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.D;
        if (view4 != null) {
            view4.setVisibility(z ? 0 : 8);
        }
        return iL;
    }

    @Override // com.zepto.yq
    public Context g(Context context) {
        this.P = true;
        int iC0 = C0(context, X());
        if (yq.v(context)) {
            yq.Q(context);
        }
        lm3 lm3VarW = W(context);
        if (n0 && (context instanceof ContextThemeWrapper)) {
            try {
                s.a((ContextThemeWrapper) context, d0(context, iC0, lm3VarW, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof az0) {
            try {
                ((az0) context).a(d0(context, iC0, lm3VarW, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!m0) {
            return super.g(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = j.a(context, configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationD0 = d0(context, iC0, lm3VarW, !configuration2.equals(configuration3) ? n0(configuration2, configuration3) : null, true);
        az0 az0Var = new az0(context, h15.c);
        az0Var.a(configurationD0);
        try {
            if (context.getTheme() != null) {
                ed5.f.a(az0Var.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.g(az0Var);
    }

    public void g0() {
        androidx.appcompat.view.menu.e eVar;
        ue1 ue1Var = this.r;
        if (ue1Var != null) {
            ue1Var.l();
        }
        if (this.w != null) {
            this.l.getDecorView().removeCallbacks(this.x);
            if (this.w.isShowing()) {
                try {
                    this.w.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.w = null;
        }
        j0();
        u uVarT0 = t0(0, false);
        if (uVarT0 == null || (eVar = uVarT0.j) == null) {
            return;
        }
        eVar.close();
    }

    public final void g1(View view) {
        view.setBackgroundColor((dq7.M(view) & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? yy0.c(this.k, fz4.b) : yy0.c(this.k, fz4.a));
    }

    public boolean h0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.j;
        if (((obj instanceof g63.a) || (obj instanceof hr)) && (decorView = this.l.getDecorView()) != null && g63.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.m.b(this.l.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? E0(keyCode, keyEvent) : H0(keyCode, keyEvent);
    }

    public void i0(int i2) {
        u uVarT0;
        u uVarT02 = t0(i2, true);
        if (uVarT02.j != null) {
            Bundle bundle = new Bundle();
            uVarT02.j.T(bundle);
            if (bundle.size() > 0) {
                uVarT02.s = bundle;
            }
            uVarT02.j.h0();
            uVarT02.j.clear();
        }
        uVarT02.r = true;
        uVarT02.q = true;
        if ((i2 != 108 && i2 != 0) || this.r == null || (uVarT0 = t0(0, false)) == null) {
            return;
        }
        uVarT0.m = false;
        P0(uVarT0, null);
    }

    @Override // com.zepto.yq
    public View j(int i2) {
        k0();
        return this.l.findViewById(i2);
    }

    public void j0() {
        lr7 lr7Var = this.y;
        if (lr7Var != null) {
            lr7Var.c();
        }
    }

    public final void k0() {
        if (this.A) {
            return;
        }
        this.B = e0();
        CharSequence charSequenceU0 = u0();
        if (!TextUtils.isEmpty(charSequenceU0)) {
            ue1 ue1Var = this.r;
            if (ue1Var != null) {
                ue1Var.setWindowTitle(charSequenceU0);
            } else if (N0() != null) {
                N0().y(charSequenceU0);
            } else {
                TextView textView = this.C;
                if (textView != null) {
                    textView.setText(charSequenceU0);
                }
            }
        }
        U();
        L0(this.B);
        this.A = true;
        u uVarT0 = t0(0, false);
        if (this.R) {
            return;
        }
        if (uVarT0 == null || uVarT0.j == null) {
            A0(108);
        }
    }

    @Override // com.zepto.yq
    public Context l() {
        return this.k;
    }

    public final void l0() {
        if (this.l == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                V(((Activity) obj).getWindow());
            }
        }
        if (this.l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public u m0(Menu menu) {
        u[] uVarArr = this.M;
        int length = uVarArr != null ? uVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            u uVar = uVarArr[i2];
            if (uVar != null && uVar.j == menu) {
                return uVar;
            }
        }
        return null;
    }

    @Override // com.zepto.yq
    public final v5 n() {
        return new f();
    }

    @Override // com.zepto.yq
    public int o() {
        return this.T;
    }

    public final Context o0() {
        t5 t5VarS = s();
        Context contextK = t5VarS != null ? t5VarS.k() : null;
        return contextK == null ? this.k : contextK;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return f0(view, str, context, attributeSet);
    }

    public final int p0(Context context) {
        if (!this.W && (this.j instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.j.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.V = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.V = 0;
            }
        }
        this.W = true;
        return this.V;
    }

    @Override // com.zepto.yq
    public MenuInflater q() {
        if (this.p == null) {
            w0();
            t5 t5Var = this.o;
            this.p = new g96(t5Var != null ? t5Var.k() : this.k);
        }
        return this.p;
    }

    public final q q0(Context context) {
        if (this.Y == null) {
            this.Y = new p(context);
        }
        return this.Y;
    }

    public final q r0(Context context) {
        if (this.X == null) {
            this.X = new r(jo6.a(context));
        }
        return this.X;
    }

    @Override // com.zepto.yq
    public t5 s() {
        w0();
        return this.o;
    }

    public lm3 s0(Configuration configuration) {
        return l.b(configuration);
    }

    @Override // com.zepto.yq
    public void t() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.k);
        if (layoutInflaterFrom.getFactory() == null) {
            hb3.a(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof zq) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public u t0(int i2, boolean z) {
        u[] uVarArr = this.M;
        if (uVarArr == null || uVarArr.length <= i2) {
            u[] uVarArr2 = new u[i2 + 1];
            if (uVarArr != null) {
                System.arraycopy(uVarArr, 0, uVarArr2, 0, uVarArr.length);
            }
            this.M = uVarArr2;
            uVarArr = uVarArr2;
        }
        u uVar = uVarArr[i2];
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(i2);
        uVarArr[i2] = uVar2;
        return uVar2;
    }

    @Override // com.zepto.yq
    public void u() {
        if (N0() == null || s().l()) {
            return;
        }
        A0(0);
    }

    public final CharSequence u0() {
        Object obj = this.j;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.q;
    }

    public final Window.Callback v0() {
        return this.l.getCallback();
    }

    public final void w0() {
        k0();
        if (this.G && this.o == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                this.o = new av7((Activity) this.j, this.H);
            } else if (obj instanceof Dialog) {
                this.o = new av7((Dialog) this.j);
            }
            t5 t5Var = this.o;
            if (t5Var != null) {
                t5Var.r(this.c0);
            }
        }
    }

    @Override // com.zepto.yq
    public void x(Configuration configuration) {
        t5 t5VarS;
        if (this.G && this.A && (t5VarS = s()) != null) {
            t5VarS.m(configuration);
        }
        ir.b().g(this.k);
        this.S = new Configuration(this.k.getResources().getConfiguration());
        S(false, false);
    }

    public final boolean x0(u uVar) {
        View view = uVar.i;
        if (view != null) {
            uVar.h = view;
            return true;
        }
        if (uVar.j == null) {
            return false;
        }
        if (this.t == null) {
            this.t = new v();
        }
        View view2 = (View) uVar.a(this.t);
        uVar.h = view2;
        return view2 != null;
    }

    @Override // com.zepto.yq
    public void y(Bundle bundle) {
        String strC;
        this.P = true;
        R(false);
        l0();
        Object obj = this.j;
        if (obj instanceof Activity) {
            try {
                strC = v24.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                t5 t5VarN0 = N0();
                if (t5VarN0 == null) {
                    this.c0 = true;
                } else {
                    t5VarN0.r(true);
                }
            }
            yq.d(this);
        }
        this.S = new Configuration(this.k.getResources().getConfiguration());
        this.Q = true;
    }

    public final boolean y0(u uVar) {
        uVar.d(o0());
        uVar.g = new t(uVar.l);
        uVar.c = 81;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    @Override // com.zepto.yq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void z() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            com.zepto.yq.F(r3)
        L9:
            boolean r0 = r3.Z
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.l
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.b0
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.R = r0
            int r0 = r3.T
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            com.zepto.w26 r0 = com.zepto.zq.j0
            java.lang.Object r1 = r3.j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.T
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            com.zepto.w26 r0 = com.zepto.zq.j0
            java.lang.Object r1 = r3.j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            com.zepto.t5 r0 = r3.o
            if (r0 == 0) goto L5b
            r0.n()
        L5b:
            r3.a0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.zq.z():void");
    }

    public final boolean z0(u uVar) {
        Resources.Theme themeNewTheme;
        Context context = this.k;
        int i2 = uVar.a;
        if ((i2 == 0 || i2 == 108) && this.r != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(zy4.d, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(zy4.e, typedValue, true);
            } else {
                theme.resolveAttribute(zy4.e, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                az0 az0Var = new az0(context, 0);
                az0Var.getTheme().setTo(themeNewTheme);
                context = az0Var;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.V(this);
        uVar.c(eVar);
        return true;
    }

    public zq(Dialog dialog, sq sqVar) {
        this(dialog.getContext(), dialog.getWindow(), sqVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public zq(Context context, Window window, sq sqVar, Object obj) {
        pq pqVarA1;
        this.y = null;
        this.z = true;
        this.T = -100;
        this.b0 = new a();
        this.k = context;
        this.n = sqVar;
        this.j = obj;
        if (this.T == -100 && (obj instanceof Dialog) && (pqVarA1 = a1()) != null) {
            this.T = pqVarA1.S0().o();
        }
        if (this.T == -100) {
            w26 w26Var = j0;
            Integer num = (Integer) w26Var.get(obj.getClass().getName());
            if (num != null) {
                this.T = num.intValue();
                w26Var.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            V(window);
        }
        ir.h();
    }
}
