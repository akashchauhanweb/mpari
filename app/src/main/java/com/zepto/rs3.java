package com.zepto;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public abstract class rs3 {

    public static class a {
        public static int a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        public static CharSequence b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        public static ColorStateList c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        public static PorterDuff.Mode d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        public static int e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        public static CharSequence f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        public static MenuItem g(MenuItem menuItem, char c, int i) {
            return menuItem.setAlphabeticShortcut(c, i);
        }

        public static MenuItem h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        public static MenuItem i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        public static MenuItem j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        public static MenuItem k(MenuItem menuItem, char c, int i) {
            return menuItem.setNumericShortcut(c, i);
        }

        public static MenuItem l(MenuItem menuItem, char c, char c2, int i, int i2) {
            return menuItem.setShortcut(c, c2, i, i2);
        }

        public static MenuItem m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    public static MenuItem a(MenuItem menuItem, a6 a6Var) {
        if (menuItem instanceof h96) {
            return ((h96) menuItem).b(a6Var);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    public static void b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof h96) {
            ((h96) menuItem).setAlphabeticShortcut(c, i);
        } else {
            a.g(menuItem, c, i);
        }
    }

    public static void c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof h96) {
            ((h96) menuItem).setContentDescription(charSequence);
        } else {
            a.h(menuItem, charSequence);
        }
    }

    public static void d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof h96) {
            ((h96) menuItem).setIconTintList(colorStateList);
        } else {
            a.i(menuItem, colorStateList);
        }
    }

    public static void e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof h96) {
            ((h96) menuItem).setIconTintMode(mode);
        } else {
            a.j(menuItem, mode);
        }
    }

    public static void f(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof h96) {
            ((h96) menuItem).setNumericShortcut(c, i);
        } else {
            a.k(menuItem, c, i);
        }
    }

    public static void g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof h96) {
            ((h96) menuItem).setTooltipText(charSequence);
        } else {
            a.m(menuItem, charSequence);
        }
    }
}
