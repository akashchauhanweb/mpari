package com.zepto;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.zepto.r3;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class x2 {
    public static final View.AccessibilityDelegate c = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate a;
    public final View.AccessibilityDelegate b;

    public static final class a extends View.AccessibilityDelegate {
        public final x2 a;

        public a(x2 x2Var) {
            this.a = x2Var;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            s3 s3VarB = this.a.b(view);
            if (s3VarB != null) {
                return (AccessibilityNodeProvider) s3VarB.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            r3 r3VarX0 = r3.x0(accessibilityNodeInfo);
            r3VarX0.m0(dq7.X(view));
            r3VarX0.e0(dq7.S(view));
            r3VarX0.j0(dq7.p(view));
            r3VarX0.s0(dq7.J(view));
            this.a.g(view, r3VarX0);
            r3VarX0.e(accessibilityNodeInfo.getText(), view);
            List listC = x2.c(view);
            for (int i = 0; i < listC.size(); i++) {
                r3VarX0.b((r3.a) listC.get(i));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.a.j(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.a.l(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.a.m(view, accessibilityEvent);
        }
    }

    public static class b {
        public static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        public static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }
    }

    public x2() {
        this(c);
    }

    public static List c(View view) {
        List list = (List) view.getTag(e05.H);
        return list == null ? Collections.emptyList() : list;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public s3 b(View view) {
        AccessibilityNodeProvider accessibilityNodeProviderA = b.a(this.a, view);
        if (accessibilityNodeProviderA != null) {
            return new s3(accessibilityNodeProviderA);
        }
        return null;
    }

    public View.AccessibilityDelegate d() {
        return this.b;
    }

    public final boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrN = r3.n(view.createAccessibilityNodeInfo().getText());
            for (int i = 0; clickableSpanArrN != null && i < clickableSpanArrN.length; i++) {
                if (clickableSpan.equals(clickableSpanArrN[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, r3 r3Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, r3Var.w0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i, Bundle bundle) {
        List listC = c(view);
        boolean zB = false;
        int i2 = 0;
        while (true) {
            if (i2 >= listC.size()) {
                break;
            }
            r3.a aVar = (r3.a) listC.get(i2);
            if (aVar.b() == i) {
                zB = aVar.d(view, bundle);
                break;
            }
            i2++;
        }
        if (!zB) {
            zB = b.b(this.a, view, i, bundle);
        }
        return (zB || i != e05.a || bundle == null) ? zB : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public final boolean k(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(e05.I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public void l(View view, int i) {
        this.a.sendAccessibilityEvent(view, i);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public x2(View.AccessibilityDelegate accessibilityDelegate) {
        this.a = accessibilityDelegate;
        this.b = new a(this);
    }
}
