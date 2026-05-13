package com.yalantis.ucrop;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public Intent a = new Intent();
    public Bundle b;

    /* JADX INFO: renamed from: com.yalantis.ucrop.a$a, reason: collision with other inner class name */
    public static class C0064a {
        public final Bundle a = new Bundle();

        public Bundle a() {
            return this.a;
        }

        public void b(Bitmap.CompressFormat compressFormat) {
            this.a.putString("com.yalantis.ucrop.CompressionFormatName", compressFormat.name());
        }
    }

    public a(Uri uri, Uri uri2) {
        Bundle bundle = new Bundle();
        this.b = bundle;
        bundle.putParcelable("com.yalantis.ucrop.InputUri", uri);
        this.b.putParcelable("com.yalantis.ucrop.OutputUri", uri2);
    }

    public static a b(Uri uri, Uri uri2) {
        return new a(uri, uri2);
    }

    public Intent a(Context context) {
        this.a.setClass(context, UCropActivity.class);
        this.a.putExtras(this.b);
        return this.a;
    }

    public void c(Activity activity, int i) {
        activity.startActivityForResult(a(activity), i);
    }

    public a d(float f, float f2) {
        this.b.putFloat("com.yalantis.ucrop.AspectRatioX", f);
        this.b.putFloat("com.yalantis.ucrop.AspectRatioY", f2);
        return this;
    }

    public a e(int i, int i2) {
        if (i < 10) {
            i = 10;
        }
        if (i2 < 10) {
            i2 = 10;
        }
        this.b.putInt("com.yalantis.ucrop.MaxSizeX", i);
        this.b.putInt("com.yalantis.ucrop.MaxSizeY", i2);
        return this;
    }

    public a f(C0064a c0064a) {
        this.b.putAll(c0064a.a());
        return this;
    }
}
