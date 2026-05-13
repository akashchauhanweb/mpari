package com.zepto;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.zepto.u3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public class r3 {
    public final AccessibilityNodeInfo a;
    public int b = -1;
    public int c = -1;

    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;
        public static final a e = new a(1, null);
        public static final a f = new a(2, null);
        public static final a g = new a(4, null);
        public static final a h = new a(8, null);
        public static final a i = new a(16, null);
        public static final a j = new a(32, null);
        public static final a k = new a(64, null);
        public static final a l = new a(128, null);
        public static final a m = new a(256, (CharSequence) null, u3.b.class);
        public static final a n = new a(ConstantsKt.MINIMUM_BLOCK_SIZE, (CharSequence) null, u3.b.class);
        public static final a o = new a(1024, (CharSequence) null, u3.c.class);
        public static final a p = new a(2048, (CharSequence) null, u3.c.class);
        public static final a q = new a(ConstantsKt.DEFAULT_BLOCK_SIZE, null);
        public static final a r = new a(ConstantsKt.DEFAULT_BUFFER_SIZE, null);
        public static final a s = new a(16384, null);
        public static final a t = new a(32768, null);
        public static final a u = new a(65536, null);
        public static final a v = new a(131072, (CharSequence) null, u3.g.class);
        public static final a w = new a(262144, null);
        public static final a x = new a(524288, null);
        public static final a y = new a(1048576, null);
        public static final a z = new a(2097152, (CharSequence) null, u3.h.class);
        public final Object a;
        public final int b;
        public final Class c;
        public final u3 d;

        static {
            int i2 = Build.VERSION.SDK_INT;
            A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, u3.e.class);
            C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            G = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            H = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            I = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            J = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, u3.f.class);
            M = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, u3.d.class);
            N = new a(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            O = new a(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            P = new a(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            Q = new a(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            R = new a(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            S = new a(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            T = new a(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            U = new a(i2 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        }

        public a(int i2, CharSequence charSequence) {
            this(null, i2, charSequence, null, null);
        }

        public a a(CharSequence charSequence, u3 u3Var) {
            return new a(null, this.b, charSequence, u3Var, this.c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            if (this.d == null) {
                return false;
            }
            Class cls = this.c;
            if (cls != null) {
                try {
                    wb0.a(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    throw null;
                } catch (Exception e2) {
                    Class cls2 = this.c;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e2);
                }
            }
            return this.d.a(view, null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.a;
            return obj2 == null ? aVar.a == null : obj2.equals(aVar.a);
        }

        public int hashCode() {
            Object obj = this.a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String strH = r3.h(this.b);
            if (strH.equals("ACTION_UNKNOWN") && c() != null) {
                strH = c().toString();
            }
            sb.append(strH);
            return sb.toString();
        }

        public a(int i2, CharSequence charSequence, u3 u3Var) {
            this(null, i2, charSequence, u3Var, null);
        }

        public a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public a(int i2, CharSequence charSequence, Class cls) {
            this(null, i2, charSequence, null, cls);
        }

        public a(Object obj, int i2, CharSequence charSequence, u3 u3Var, Class cls) {
            this.b = i2;
            this.d = u3Var;
            if (obj == null) {
                this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            } else {
                this.a = obj;
            }
            this.c = cls;
        }
    }

    public static class b {
        public static Bundle a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtras();
        }
    }

    public static class c {
        public final Object a;

        public c(Object obj) {
            this.a = obj;
        }

        public static c a(int i, int i2, boolean z) {
            return new c(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
        }

        public static c b(int i, int i2, boolean z, int i3) {
            return new c(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }
    }

    public static class d {
        public final Object a;

        public d(Object obj) {
            this.a = obj;
        }

        public static d a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new d(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    public r3(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    public static r3 I() {
        return x0(AccessibilityNodeInfo.obtain());
    }

    public static r3 J(View view) {
        return x0(AccessibilityNodeInfo.obtain(view));
    }

    public static r3 K(r3 r3Var) {
        return x0(AccessibilityNodeInfo.obtain(r3Var.a));
    }

    public static String h(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case ConstantsKt.MINIMUM_BLOCK_SIZE /* 512 */:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case ConstantsKt.DEFAULT_BLOCK_SIZE /* 4096 */:
                return "ACTION_SCROLL_FORWARD";
            case ConstantsKt.DEFAULT_BUFFER_SIZE /* 8192 */:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public static ClickableSpan[] n(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public static r3 x0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new r3(accessibilityNodeInfo);
    }

    public boolean A() {
        return this.a.isFocusable();
    }

    public boolean B() {
        return this.a.isFocused();
    }

    public boolean C() {
        return this.a.isLongClickable();
    }

    public boolean D() {
        return this.a.isPassword();
    }

    public boolean E() {
        return this.a.isScrollable();
    }

    public boolean F() {
        return this.a.isSelected();
    }

    public boolean G() {
        return this.a.isShowingHintText();
    }

    public boolean H() {
        return this.a.isVisibleToUser();
    }

    public boolean L(int i, Bundle bundle) {
        return this.a.performAction(i, bundle);
    }

    public void M() {
    }

    public boolean N(a aVar) {
        return this.a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.a);
    }

    public void O(boolean z) {
        this.a.setAccessibilityFocused(z);
    }

    public final void P(int i, boolean z) {
        Bundle bundleP = p();
        if (bundleP != null) {
            int i2 = bundleP.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            bundleP.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public void Q(Rect rect) {
        this.a.setBoundsInParent(rect);
    }

    public void R(Rect rect) {
        this.a.setBoundsInScreen(rect);
    }

    public void S(boolean z) {
        this.a.setCheckable(z);
    }

    public void T(boolean z) {
        this.a.setChecked(z);
    }

    public void U(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public void V(boolean z) {
        this.a.setClickable(z);
    }

    public void W(Object obj) {
        this.a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((c) obj).a);
    }

    public void X(Object obj) {
        this.a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((d) obj).a);
    }

    public void Y(CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }

    public void Z(boolean z) {
        this.a.setDismissable(z);
    }

    public void a(int i) {
        this.a.addAction(i);
    }

    public void a0(boolean z) {
        this.a.setEnabled(z);
    }

    public void b(a aVar) {
        this.a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.a);
    }

    public void b0(CharSequence charSequence) {
        this.a.setError(charSequence);
    }

    public void c(View view) {
        this.a.addChild(view);
    }

    public void c0(boolean z) {
        this.a.setFocusable(z);
    }

    public void d(View view, int i) {
        this.a.addChild(view, i);
    }

    public void d0(boolean z) {
        this.a.setFocused(z);
    }

    public void e(CharSequence charSequence, View view) {
    }

    public void e0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a.setHeading(z);
        } else {
            P(2, z);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof r3)) {
            return false;
        }
        r3 r3Var = (r3) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            if (r3Var.a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(r3Var.a)) {
            return false;
        }
        return this.c == r3Var.c && this.b == r3Var.b;
    }

    public final List f(String str) {
        ArrayList<Integer> integerArrayList = b.a(this.a).getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        b.a(this.a).putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public void f0(CharSequence charSequence) {
        this.a.setHintText(charSequence);
    }

    public List g() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new a(actionList.get(i)));
        }
        return arrayList;
    }

    public void g0(View view) {
        this.a.setLabelFor(view);
    }

    public void h0(int i) {
        this.a.setMaxTextLength(i);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public int i() {
        return this.a.getActions();
    }

    public void i0(CharSequence charSequence) {
        this.a.setPackageName(charSequence);
    }

    public void j(Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    public void j0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a.setPaneTitle(charSequence);
        } else {
            b.a(this.a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void k(Rect rect) {
        this.a.getBoundsInScreen(rect);
    }

    public void k0(View view) {
        this.b = -1;
        this.a.setParent(view);
    }

    public int l() {
        return this.a.getChildCount();
    }

    public void l0(View view, int i) {
        this.b = i;
        this.a.setParent(view, i);
    }

    public CharSequence m() {
        return this.a.getClassName();
    }

    public void m0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a.setScreenReaderFocusable(z);
        } else {
            P(1, z);
        }
    }

    public void n0(boolean z) {
        this.a.setScrollable(z);
    }

    public CharSequence o() {
        return this.a.getContentDescription();
    }

    public void o0(boolean z) {
        this.a.setSelected(z);
    }

    public Bundle p() {
        return b.a(this.a);
    }

    public void p0(boolean z) {
        this.a.setShowingHintText(z);
    }

    public CharSequence q() {
        return this.a.getPackageName();
    }

    public void q0(View view) {
        this.c = -1;
        this.a.setSource(view);
    }

    public CharSequence r() {
        if (!u()) {
            return this.a.getText();
        }
        List listF = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List listF2 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List listF3 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List listF4 = f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.a.getText(), 0, this.a.getText().length()));
        for (int i = 0; i < listF.size(); i++) {
            spannableString.setSpan(new w2(((Integer) listF4.get(i)).intValue(), this, p().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) listF.get(i)).intValue(), ((Integer) listF2.get(i)).intValue(), ((Integer) listF3.get(i)).intValue());
        }
        return spannableString;
    }

    public void r0(View view, int i) {
        this.c = i;
        this.a.setSource(view, i);
    }

    public String s() {
        return c80.c() ? this.a.getUniqueId() : b.a(this.a).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void s0(CharSequence charSequence) {
        if (c80.b()) {
            this.a.setStateDescription(charSequence);
        } else {
            b.a(this.a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public String t() {
        return this.a.getViewIdResourceName();
    }

    public void t0(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        j(rect);
        sb.append("; boundsInParent: " + rect);
        k(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(q());
        sb.append("; className: ");
        sb.append(m());
        sb.append("; text: ");
        sb.append(r());
        sb.append("; contentDescription: ");
        sb.append(o());
        sb.append("; viewId: ");
        sb.append(t());
        sb.append("; uniqueId: ");
        sb.append(s());
        sb.append("; checkable: ");
        sb.append(w());
        sb.append("; checked: ");
        sb.append(x());
        sb.append("; focusable: ");
        sb.append(A());
        sb.append("; focused: ");
        sb.append(B());
        sb.append("; selected: ");
        sb.append(F());
        sb.append("; clickable: ");
        sb.append(y());
        sb.append("; longClickable: ");
        sb.append(C());
        sb.append("; enabled: ");
        sb.append(z());
        sb.append("; password: ");
        sb.append(D());
        sb.append("; scrollable: " + E());
        sb.append("; [");
        List listG = g();
        for (int i = 0; i < listG.size(); i++) {
            a aVar = (a) listG.get(i);
            String strH = h(aVar.b());
            if (strH.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                strH = aVar.c().toString();
            }
            sb.append(strH);
            if (i != listG.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean u() {
        return !f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public void u0(View view) {
        this.a.setTraversalAfter(view);
    }

    public boolean v() {
        return this.a.isAccessibilityFocused();
    }

    public void v0(boolean z) {
        this.a.setVisibleToUser(z);
    }

    public boolean w() {
        return this.a.isCheckable();
    }

    public AccessibilityNodeInfo w0() {
        return this.a;
    }

    public boolean x() {
        return this.a.isChecked();
    }

    public boolean y() {
        return this.a.isClickable();
    }

    public boolean z() {
        return this.a.isEnabled();
    }
}
