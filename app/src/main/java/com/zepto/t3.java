package com.zepto;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* JADX INFO: loaded from: classes.dex */
public abstract class t3 {

    public static class a {
        public static int a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        public static int b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        public static void c(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollX(i);
        }

        public static void d(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    public static class b {
        public static void a(AccessibilityRecord accessibilityRecord, View view, int i) {
            accessibilityRecord.setSource(view, i);
        }
    }

    public static void a(AccessibilityRecord accessibilityRecord, int i) {
        a.c(accessibilityRecord, i);
    }

    public static void b(AccessibilityRecord accessibilityRecord, int i) {
        a.d(accessibilityRecord, i);
    }

    public static void c(AccessibilityRecord accessibilityRecord, View view, int i) {
        b.a(accessibilityRecord, view, i);
    }
}
