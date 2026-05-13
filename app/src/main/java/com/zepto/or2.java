package com.zepto;

import android.text.Html;
import android.text.Spanned;

/* JADX INFO: loaded from: classes.dex */
public abstract class or2 {

    public static class a {
        public static Spanned a(String str, int i) {
            return Html.fromHtml(str, i);
        }

        public static Spanned b(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i, imageGetter, tagHandler);
        }

        public static String c(Spanned spanned, int i) {
            return Html.toHtml(spanned, i);
        }
    }

    public static Spanned a(String str, int i) {
        return a.a(str, i);
    }
}
