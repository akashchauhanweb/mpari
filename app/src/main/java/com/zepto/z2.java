package com.zepto;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class z2 {

    public static class a {
        public static boolean a(AccessibilityManager accessibilityManager, b bVar) {
            return accessibilityManager.addTouchExplorationStateChangeListener(new c(bVar));
        }

        public static boolean b(AccessibilityManager accessibilityManager, b bVar) {
            return accessibilityManager.removeTouchExplorationStateChangeListener(new c(bVar));
        }
    }

    public interface b {
        void onTouchExplorationStateChanged(boolean z);
    }

    public static final class c implements AccessibilityManager.TouchExplorationStateChangeListener {
        public final b a;

        public c(b bVar) {
            this.a = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.a.equals(((c) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            this.a.onTouchExplorationStateChanged(z);
        }
    }

    public static boolean a(AccessibilityManager accessibilityManager, b bVar) {
        return a.a(accessibilityManager, bVar);
    }

    public static boolean b(AccessibilityManager accessibilityManager, b bVar) {
        return a.b(accessibilityManager, bVar);
    }
}
