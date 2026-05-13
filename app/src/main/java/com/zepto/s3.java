package com.zepto;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class s3 {
    public final Object a;

    public static class a extends AccessibilityNodeProvider {
        public final s3 a;

        public a(s3 s3Var) {
            this.a = s3Var;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            r3 r3VarB = this.a.b(i);
            if (r3VarB == null) {
                return null;
            }
            return r3VarB.w0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i) {
            List listC = this.a.c(str, i);
            if (listC == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listC.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((r3) listC.get(i2)).w0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.a.f(i, i2, bundle);
        }
    }

    public static class b extends a {
        public b(s3 s3Var) {
            super(s3Var);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            r3 r3VarD = this.a.d(i);
            if (r3VarD == null) {
                return null;
            }
            return r3VarD.w0();
        }
    }

    public static class c extends b {
        public c(s3 s3Var) {
            super(s3Var);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.a.a(i, r3.x0(accessibilityNodeInfo), str, bundle);
        }
    }

    public s3() {
        this.a = new c(this);
    }

    public void a(int i, r3 r3Var, String str, Bundle bundle) {
    }

    public r3 b(int i) {
        return null;
    }

    public List c(String str, int i) {
        return null;
    }

    public r3 d(int i) {
        return null;
    }

    public Object e() {
        return this.a;
    }

    public boolean f(int i, int i2, Bundle bundle) {
        return false;
    }

    public s3(Object obj) {
        this.a = obj;
    }
}
