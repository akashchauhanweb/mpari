package com.zepto;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes2.dex */
public final class sx2 {
    public final Uri a;
    public final Bitmap b;
    public final Integer c;
    public boolean d;
    public int e;
    public int f;
    public Rect g;
    public boolean h;

    public sx2(Uri uri) {
        String string = uri.toString();
        if (string.startsWith("file:///") && !new File(string.substring(7)).exists()) {
            try {
                uri = Uri.parse(URLDecoder.decode(string, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        this.b = null;
        this.a = uri;
        this.c = null;
        this.d = true;
    }

    public static sx2 a(String str) {
        if (str == null) {
            throw new NullPointerException("Asset name must not be null");
        }
        return m("file:///android_asset/" + str);
    }

    public static sx2 j(int i) {
        return new sx2(i);
    }

    public static sx2 m(String str) {
        if (str == null) {
            throw new NullPointerException("Uri must not be null");
        }
        if (!str.contains("://")) {
            if (str.startsWith("/")) {
                str = str.substring(1);
            }
            str = "file:///" + str;
        }
        return new sx2(Uri.parse(str));
    }

    public final Bitmap b() {
        return this.b;
    }

    public final Integer c() {
        return this.c;
    }

    public final int d() {
        return this.f;
    }

    public final Rect e() {
        return this.g;
    }

    public final int f() {
        return this.e;
    }

    public final boolean g() {
        return this.d;
    }

    public final Uri h() {
        return this.a;
    }

    public final boolean i() {
        return this.h;
    }

    public sx2 k(boolean z) {
        this.d = z;
        return this;
    }

    public sx2 l() {
        return k(true);
    }

    public sx2(int i) {
        this.b = null;
        this.a = null;
        this.c = Integer.valueOf(i);
        this.d = true;
    }
}
