package com.zepto;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
public class bq6 implements Spannable {
    public boolean c = false;
    public Spannable e;

    public static class a {
        public static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        public static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    public static class b {
        public boolean a(CharSequence charSequence) {
            return false;
        }
    }

    public static class c extends b {
        @Override // com.zepto.bq6.b
        public boolean a(CharSequence charSequence) {
            return cq6.a(charSequence);
        }
    }

    public bq6(Spannable spannable) {
        this.e = spannable;
    }

    public static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    public final void a() {
        Spannable spannable = this.e;
        if (!this.c && c().a(spannable)) {
            this.e = new SpannableString(spannable);
        }
        this.c = true;
    }

    public Spannable b() {
        return this.e;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.e.charAt(i);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.a(this.e);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.b(this.e);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.e.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.e.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.e.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i, int i2, Class cls) {
        return this.e.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.e.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.e.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.e.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.e.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.e.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.e.toString();
    }

    public bq6(CharSequence charSequence) {
        this.e = new SpannableString(charSequence);
    }
}
