package com.zepto;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import com.zepto.dv7;
import com.zepto.qv7;
import com.zepto.r3;
import com.zepto.x2;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class dq7 {
    public static Field c;
    public static final AtomicInteger a = new AtomicInteger(1);
    public static WeakHashMap b = null;
    public static boolean d = false;
    public static final int[] e = {e05.b, e05.c, e05.n, e05.y, e05.B, e05.C, e05.D, e05.E, e05.F, e05.G, e05.d, e05.e, e05.f, e05.g, e05.h, e05.i, e05.j, e05.k, e05.l, e05.m, e05.o, e05.p, e05.q, e05.r, e05.s, e05.t, e05.u, e05.v, e05.w, e05.x, e05.z, e05.A};
    public static final ah4 f = new ah4() { // from class: com.zepto.cq7
        @Override // com.zepto.ah4
        public final ly0 a(ly0 ly0Var) {
            return dq7.Y(ly0Var);
        }
    };
    public static final e g = new e();

    public class a extends f {
        public a(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // com.zepto.dq7.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean d(View view) {
            return Boolean.valueOf(p.d(view));
        }

        @Override // com.zepto.dq7.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, Boolean bool) {
            p.i(view, bool.booleanValue());
        }

        @Override // com.zepto.dq7.f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    public class b extends f {
        public b(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // com.zepto.dq7.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence d(View view) {
            return p.b(view);
        }

        @Override // com.zepto.dq7.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, CharSequence charSequence) {
            p.h(view, charSequence);
        }

        @Override // com.zepto.dq7.f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    public class c extends f {
        public c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // com.zepto.dq7.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence d(View view) {
            return r.a(view);
        }

        @Override // com.zepto.dq7.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, CharSequence charSequence) {
            r.c(view, charSequence);
        }

        @Override // com.zepto.dq7.f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    public class d extends f {
        public d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // com.zepto.dq7.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean d(View view) {
            return Boolean.valueOf(p.c(view));
        }

        @Override // com.zepto.dq7.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, Boolean bool) {
            p.g(view, bool.booleanValue());
        }

        @Override // com.zepto.dq7.f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        public final WeakHashMap a = new WeakHashMap();

        public void a(View view) {
            this.a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (k.b(view)) {
                c(view);
            }
        }

        public final void b(View view, boolean z) {
            boolean z2 = view.isShown() && view.getWindowVisibility() == 0;
            if (z != z2) {
                dq7.Z(view, z2 ? 16 : 32);
                this.a.put(view, Boolean.valueOf(z2));
            }
        }

        public final void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void d(View view) {
            this.a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        public final void e(View view) {
            h.o(view.getViewTreeObserver(), this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry entry : this.a.entrySet()) {
                    b((View) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static abstract class f {
        public final int a;
        public final Class b;
        public final int c;
        public final int d;

        public f(int i, Class cls, int i2) {
            this(i, cls, 0, i2);
        }

        public boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public final boolean b() {
            return true;
        }

        public final boolean c() {
            return Build.VERSION.SDK_INT >= this.c;
        }

        public abstract Object d(View view);

        public abstract void e(View view, Object obj);

        public Object f(View view) {
            if (c()) {
                return d(view);
            }
            if (!b()) {
                return null;
            }
            Object tag = view.getTag(this.a);
            if (this.b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public void g(View view, Object obj) {
            if (c()) {
                e(view, obj);
            } else if (b() && h(f(view), obj)) {
                dq7.j(view);
                view.setTag(this.a, obj);
                dq7.Z(view, this.d);
            }
        }

        public abstract boolean h(Object obj, Object obj2);

        public f(int i, Class cls, int i2, int i3) {
            this.a = i;
            this.b = cls;
            this.d = i2;
            this.c = i3;
        }
    }

    public static class g {
        public static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    public static class h {
        public static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        public static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        public static int c(View view) {
            return view.getImportantForAccessibility();
        }

        public static int d(View view) {
            return view.getMinimumHeight();
        }

        public static int e(View view) {
            return view.getMinimumWidth();
        }

        public static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        public static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        public static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        public static boolean i(View view) {
            return view.hasTransientState();
        }

        public static boolean j(View view, int i, Bundle bundle) {
            return view.performAccessibilityAction(i, bundle);
        }

        public static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        public static void l(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        public static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void n(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        public static void p(View view) {
            view.requestFitSystemWindows();
        }

        public static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        public static void r(View view, boolean z) {
            view.setHasTransientState(z);
        }

        public static void s(View view, int i) {
            view.setImportantForAccessibility(i);
        }
    }

    public static class i {
        public static int a() {
            return View.generateViewId();
        }

        public static Display b(View view) {
            return view.getDisplay();
        }

        public static int c(View view) {
            return view.getLabelFor();
        }

        public static int d(View view) {
            return view.getLayoutDirection();
        }

        public static int e(View view) {
            return view.getPaddingEnd();
        }

        public static int f(View view) {
            return view.getPaddingStart();
        }

        public static boolean g(View view) {
            return view.isPaddingRelative();
        }

        public static void h(View view, int i) {
            view.setLabelFor(i);
        }

        public static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        public static void j(View view, int i) {
            view.setLayoutDirection(i);
        }

        public static void k(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }
    }

    public static class j {
        public static Rect a(View view) {
            return view.getClipBounds();
        }

        public static boolean b(View view) {
            return view.isInLayout();
        }

        public static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    public static class k {
        public static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        public static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        public static boolean c(View view) {
            return view.isLaidOut();
        }

        public static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        public static void e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }

        public static void f(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        public static void g(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    public static class l {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    public static class m {

        public class a implements View.OnApplyWindowInsetsListener {
            public qv7 a = null;
            public final /* synthetic */ View b;
            public final /* synthetic */ cg4 c;

            public a(View view, cg4 cg4Var) {
                this.b = view;
                this.c = cg4Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                qv7 qv7VarX = qv7.x(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    m.a(windowInsets, this.b);
                    if (qv7VarX.equals(this.a)) {
                        return this.c.a(view, qv7VarX).v();
                    }
                }
                this.a = qv7VarX;
                qv7 qv7VarA = this.c.a(view, qv7VarX);
                if (i >= 30) {
                    return qv7VarA.v();
                }
                dq7.n0(view);
                return qv7VarA.v();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(e05.S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static qv7 b(View view, qv7 qv7Var, Rect rect) {
            WindowInsets windowInsetsV = qv7Var.v();
            if (windowInsetsV != null) {
                return qv7.x(view.computeSystemWindowInsets(windowInsetsV, rect), view);
            }
            rect.setEmpty();
            return qv7Var;
        }

        public static boolean c(View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        public static boolean d(View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        public static boolean e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        public static boolean f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static qv7 j(View view) {
            return qv7.a.a(view);
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f) {
            view.setElevation(f);
        }

        public static void t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        public static void u(View view, cg4 cg4Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(e05.L, cg4Var);
            }
            if (cg4Var == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(e05.S));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, cg4Var));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f) {
            view.setTranslationZ(f);
        }

        public static void x(View view, float f) {
            view.setZ(f);
        }

        public static boolean y(View view, int i) {
            return view.startNestedScroll(i);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    public static class n {
        public static qv7 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            qv7 qv7VarW = qv7.w(rootWindowInsets);
            qv7VarW.t(qv7VarW);
            qv7VarW.d(view.getRootView());
            return qv7VarW;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i) {
            view.setScrollIndicators(i);
        }

        public static void d(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    public static class o {
        public static void a(View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        public static int b(View view) {
            return view.getImportantForAutofill();
        }

        public static int c(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean d(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean e(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View h(View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        public static boolean i(View view) {
            return view.restoreDefaultFocus();
        }

        public static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void k(View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        public static void l(View view, int i) {
            view.setImportantForAutofill(i);
        }

        public static void m(View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        public static void n(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        public static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static class p {
        public static void a(View view, final u uVar) {
            int i = e05.R;
            w26 w26Var = (w26) view.getTag(i);
            if (w26Var == null) {
                w26Var = new w26();
                view.setTag(i, w26Var);
            }
            Objects.requireNonNull(uVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener(uVar) { // from class: com.zepto.eq7
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    throw null;
                }
            };
            w26Var.put(uVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, u uVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            w26 w26Var = (w26) view.getTag(e05.R);
            if (w26Var == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) w26Var.get(uVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static <T> T f(View view, int i) {
            return (T) view.requireViewById(i);
        }

        public static void g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    public static class q {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        public static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    public static class r {
        public static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static rw7 b(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return rw7.e(windowInsetsController);
            }
            return null;
        }

        public static void c(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    public static final class s {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static ly0 b(View view, ly0 ly0Var) {
            ContentInfo contentInfoF = ly0Var.f();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoF);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoF ? ly0Var : ly0.g(contentInfoPerformReceiveContent);
        }

        public static void c(View view, String[] strArr, zg4 zg4Var) {
            if (zg4Var == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new t(zg4Var));
            }
        }
    }

    public static final class t implements OnReceiveContentListener {
        public final zg4 a;

        public t(zg4 zg4Var) {
            this.a = zg4Var;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            ly0 ly0VarG = ly0.g(contentInfo);
            ly0 ly0VarA = this.a.a(view, ly0VarG);
            if (ly0VarA == null) {
                return null;
            }
            return ly0VarA == ly0VarG ? contentInfo : ly0VarA.f();
        }
    }

    public interface u {
    }

    public static class v {
        public static final ArrayList d = new ArrayList();
        public WeakHashMap a = null;
        public SparseArray b = null;
        public WeakReference c = null;

        public static v a(View view) {
            int i = e05.Q;
            v vVar = (v) view.getTag(i);
            if (vVar != null) {
                return vVar;
            }
            v vVar2 = new v();
            view.setTag(i, vVar2);
            return vVar2;
        }

        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(viewC));
                }
            }
            return viewC != null;
        }

        public final View c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final SparseArray d() {
            if (this.b == null) {
                this.b = new SparseArray();
            }
            return this.b;
        }

        public final boolean e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(e05.R);
            if (arrayList == null || arrayList.size() - 1 < 0) {
                return false;
            }
            wb0.a(arrayList.get(size));
            throw null;
        }

        public boolean f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int iIndexOfKey;
            WeakReference weakReference2 = this.c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.c = new WeakReference(keyEvent);
            SparseArray sparseArrayD = d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && dq7.T(view)) {
                e(view, keyEvent);
            }
            return true;
        }

        public final void g() {
            WeakHashMap weakHashMap = this.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.a == null) {
                        this.a = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = d;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static int A(View view) {
        return o.b(view);
    }

    public static void A0(View view, boolean z) {
        h.r(view, z);
    }

    public static int B(View view) {
        return i.d(view);
    }

    public static void B0(View view, int i2) {
        h.s(view, i2);
    }

    public static int C(View view) {
        return h.d(view);
    }

    public static void C0(View view, int i2) {
        o.l(view, i2);
    }

    public static int D(View view) {
        return h.e(view);
    }

    public static void D0(View view, int i2) {
        i.h(view, i2);
    }

    public static String[] E(View view) {
        return Build.VERSION.SDK_INT >= 31 ? s.a(view) : (String[]) view.getTag(e05.N);
    }

    public static void E0(View view, cg4 cg4Var) {
        m.u(view, cg4Var);
    }

    public static int F(View view) {
        return i.e(view);
    }

    public static void F0(View view, int i2, int i3, int i4, int i5) {
        i.k(view, i2, i3, i4, i5);
    }

    public static int G(View view) {
        return i.f(view);
    }

    public static void G0(View view, boolean z) {
        p0().g(view, Boolean.valueOf(z));
    }

    public static ViewParent H(View view) {
        return h.f(view);
    }

    public static void H0(View view, int i2, int i3) {
        n.d(view, i2, i3);
    }

    public static qv7 I(View view) {
        return n.a(view);
    }

    public static void I0(View view, String str) {
        m.v(view, str);
    }

    public static CharSequence J(View view) {
        return (CharSequence) L0().f(view);
    }

    public static void J0(View view) {
        if (z(view) == 0) {
            B0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (z((View) parent) == 4) {
                B0(view, 2);
                return;
            }
        }
    }

    public static String K(View view) {
        return m.k(view);
    }

    public static void K0(View view, dv7.b bVar) {
        dv7.d(view, bVar);
    }

    public static rw7 L(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return r.b(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return zu7.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static f L0() {
        return new c(e05.P, CharSequence.class, 64, 30);
    }

    public static int M(View view) {
        return h.g(view);
    }

    public static void M0(View view) {
        m.z(view);
    }

    public static float N(View view) {
        return m.m(view);
    }

    public static boolean O(View view) {
        return m(view) != null;
    }

    public static boolean P(View view) {
        return g.a(view);
    }

    public static boolean Q(View view) {
        return h.h(view);
    }

    public static boolean R(View view) {
        return h.i(view);
    }

    public static boolean S(View view) {
        Boolean bool = (Boolean) b().f(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean T(View view) {
        return k.b(view);
    }

    public static boolean U(View view) {
        return k.c(view);
    }

    public static boolean V(View view) {
        return m.p(view);
    }

    public static boolean W(View view) {
        return i.g(view);
    }

    public static boolean X(View view) {
        Boolean bool = (Boolean) p0().f(view);
        return bool != null && bool.booleanValue();
    }

    public static /* synthetic */ ly0 Y(ly0 ly0Var) {
        return ly0Var;
    }

    public static void Z(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = p(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (o(view) != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                k.g(accessibilityEventObtain, i2);
                if (z) {
                    accessibilityEventObtain.getText().add(p(view));
                    J0(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i2 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                k.g(accessibilityEventObtain2, i2);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(p(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    k.e(view.getParent(), view, view, i2);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    public static void a0(View view, int i2) {
        view.offsetLeftAndRight(i2);
    }

    public static f b() {
        return new d(e05.J, Boolean.class, 28);
    }

    public static void b0(View view, int i2) {
        view.offsetTopAndBottom(i2);
    }

    public static int c(View view, CharSequence charSequence, u3 u3Var) {
        int iR = r(view, charSequence);
        if (iR != -1) {
            d(view, new r3.a(iR, charSequence, u3Var));
        }
        return iR;
    }

    public static qv7 c0(View view, qv7 qv7Var) {
        WindowInsets windowInsetsV = qv7Var.v();
        if (windowInsetsV != null) {
            WindowInsets windowInsetsB = l.b(view, windowInsetsV);
            if (!windowInsetsB.equals(windowInsetsV)) {
                return qv7.x(windowInsetsB, view);
            }
        }
        return qv7Var;
    }

    public static void d(View view, r3.a aVar) {
        j(view);
        l0(aVar.b(), view);
        q(view).add(aVar);
        Z(view, 0);
    }

    public static void d0(View view, r3 r3Var) {
        view.onInitializeAccessibilityNodeInfo(r3Var.w0());
    }

    public static lr7 e(View view) {
        if (b == null) {
            b = new WeakHashMap();
        }
        lr7 lr7Var = (lr7) b.get(view);
        if (lr7Var != null) {
            return lr7Var;
        }
        lr7 lr7Var2 = new lr7(view);
        b.put(view, lr7Var2);
        return lr7Var2;
    }

    public static f e0() {
        return new b(e05.K, CharSequence.class, 8, 28);
    }

    public static qv7 f(View view, qv7 qv7Var, Rect rect) {
        return m.b(view, qv7Var, rect);
    }

    public static boolean f0(View view, int i2, Bundle bundle) {
        return h.j(view, i2, bundle);
    }

    public static qv7 g(View view, qv7 qv7Var) {
        WindowInsets windowInsetsV = qv7Var.v();
        if (windowInsetsV != null) {
            WindowInsets windowInsetsA = l.a(view, windowInsetsV);
            if (!windowInsetsA.equals(windowInsetsV)) {
                return qv7.x(windowInsetsA, view);
            }
        }
        return qv7Var;
    }

    public static ly0 g0(View view, ly0 ly0Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + ly0Var + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return s.b(view, ly0Var);
        }
        zg4 zg4Var = (zg4) view.getTag(e05.M);
        if (zg4Var == null) {
            return x(view).a(ly0Var);
        }
        ly0 ly0VarA = zg4Var.a(view, ly0Var);
        if (ly0VarA == null) {
            return null;
        }
        return x(view).a(ly0VarA);
    }

    public static boolean h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return v.a(view).b(view, keyEvent);
    }

    public static void h0(View view) {
        h.k(view);
    }

    public static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return v.a(view).f(keyEvent);
    }

    public static void i0(View view, Runnable runnable) {
        h.m(view, runnable);
    }

    public static void j(View view) {
        x2 x2VarL = l(view);
        if (x2VarL == null) {
            x2VarL = new x2();
        }
        q0(view, x2VarL);
    }

    public static void j0(View view, Runnable runnable, long j2) {
        h.n(view, runnable, j2);
    }

    public static int k() {
        return i.a();
    }

    public static void k0(View view, int i2) {
        l0(i2, view);
        Z(view, 0);
    }

    public static x2 l(View view) {
        View.AccessibilityDelegate accessibilityDelegateM = m(view);
        if (accessibilityDelegateM == null) {
            return null;
        }
        return accessibilityDelegateM instanceof x2.a ? ((x2.a) accessibilityDelegateM).a : new x2(accessibilityDelegateM);
    }

    public static void l0(int i2, View view) {
        List listQ = q(view);
        for (int i3 = 0; i3 < listQ.size(); i3++) {
            if (((r3.a) listQ.get(i3)).b() == i2) {
                listQ.remove(i3);
                return;
            }
        }
    }

    public static View.AccessibilityDelegate m(View view) {
        return Build.VERSION.SDK_INT >= 29 ? q.a(view) : n(view);
    }

    public static void m0(View view, r3.a aVar, CharSequence charSequence, u3 u3Var) {
        if (u3Var == null && charSequence == null) {
            k0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, u3Var));
        }
    }

    public static View.AccessibilityDelegate n(View view) {
        if (d) {
            return null;
        }
        if (c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                d = true;
                return null;
            }
        }
        try {
            Object obj = c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            d = true;
            return null;
        }
    }

    public static void n0(View view) {
        l.c(view);
    }

    public static int o(View view) {
        return k.a(view);
    }

    public static void o0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            q.c(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    public static CharSequence p(View view) {
        return (CharSequence) e0().f(view);
    }

    public static f p0() {
        return new a(e05.O, Boolean.class, 28);
    }

    public static List q(View view) {
        int i2 = e05.H;
        ArrayList arrayList = (ArrayList) view.getTag(i2);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i2, arrayList2);
        return arrayList2;
    }

    public static void q0(View view, x2 x2Var) {
        if (x2Var == null && (m(view) instanceof x2.a)) {
            x2Var = new x2();
        }
        view.setAccessibilityDelegate(x2Var == null ? null : x2Var.d());
    }

    public static int r(View view, CharSequence charSequence) {
        List listQ = q(view);
        for (int i2 = 0; i2 < listQ.size(); i2++) {
            if (TextUtils.equals(charSequence, ((r3.a) listQ.get(i2)).c())) {
                return ((r3.a) listQ.get(i2)).b();
            }
        }
        int i3 = -1;
        int i4 = 0;
        while (true) {
            int[] iArr = e;
            if (i4 >= iArr.length || i3 != -1) {
                break;
            }
            int i5 = iArr[i4];
            boolean z = true;
            for (int i6 = 0; i6 < listQ.size(); i6++) {
                z &= ((r3.a) listQ.get(i6)).b() != i5;
            }
            if (z) {
                i3 = i5;
            }
            i4++;
        }
        return i3;
    }

    public static void r0(View view, boolean z) {
        b().g(view, Boolean.valueOf(z));
    }

    public static ColorStateList s(View view) {
        return m.g(view);
    }

    public static void s0(View view, int i2) {
        k.f(view, i2);
    }

    public static PorterDuff.Mode t(View view) {
        return m.h(view);
    }

    public static void t0(View view, CharSequence charSequence) {
        e0().g(view, charSequence);
        if (charSequence != null) {
            g.a(view);
        } else {
            g.d(view);
        }
    }

    public static Rect u(View view) {
        return j.a(view);
    }

    public static void u0(View view, Drawable drawable) {
        h.q(view, drawable);
    }

    public static Display v(View view) {
        return i.b(view);
    }

    public static void v0(View view, ColorStateList colorStateList) {
        m.q(view, colorStateList);
    }

    public static float w(View view) {
        return m.i(view);
    }

    public static void w0(View view, PorterDuff.Mode mode) {
        m.r(view, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ah4 x(View view) {
        return view instanceof ah4 ? (ah4) view : f;
    }

    public static void x0(View view, Rect rect) {
        j.c(view, rect);
    }

    public static boolean y(View view) {
        return h.b(view);
    }

    public static void y0(View view, float f2) {
        m.s(view, f2);
    }

    public static int z(View view) {
        return h.c(view);
    }

    public static void z0(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }
}
