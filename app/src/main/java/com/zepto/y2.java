package com.zepto;

import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class y2 {

    public static class a {
        public static int a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        public static void b(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    public static int a(AccessibilityEvent accessibilityEvent) {
        return a.a(accessibilityEvent);
    }

    public static void b(AccessibilityEvent accessibilityEvent, int i) {
        a.b(accessibilityEvent, i);
    }
}
