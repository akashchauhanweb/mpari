package com.zepto;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class qj0 {

    public static class a {
        public static Drawable a(CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    public static class b {
        public static void a(CheckedTextView checkedTextView, ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        public static void b(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    public static Drawable a(CheckedTextView checkedTextView) {
        return a.a(checkedTextView);
    }

    public static void b(CheckedTextView checkedTextView, ColorStateList colorStateList) {
        b.a(checkedTextView, colorStateList);
    }

    public static void c(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
        b.b(checkedTextView, mode);
    }
}
