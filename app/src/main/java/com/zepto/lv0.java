package com.zepto;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import com.github.dhaval2404.imagepicker.ImagePickerActivity;
import java.io.File;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
public final class lv0 extends z40 {
    public final int b;
    public final int c;
    public final long d;
    public final File e;
    public static final a g = new a(null);
    public static final String f = lv0.class.getSimpleName();

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends AsyncTask {
        public b() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public File doInBackground(Uri... params) {
            Intrinsics.checkNotNullParameter(params, "params");
            File fileK = yb2.a.k(lv0.this, params[0]);
            if (fileK != null) {
                return lv0.this.r(fileK);
            }
            return null;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(File file) {
            super.onPostExecute(file);
            if (file != null) {
                lv0.this.m(file);
            } else {
                lv0.this.d(y05.d);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv0(ImagePickerActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = activity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "activity.intent");
        Bundle extras = intent.getExtras();
        extras = extras == null ? new Bundle() : extras;
        Intrinsics.checkNotNullExpressionValue(extras, "activity.intent.extras ?: Bundle()");
        this.b = extras.getInt("extra.max_width", 0);
        this.c = extras.getInt("extra.max_height", 0);
        this.d = extras.getLong("extra.image_max_size", 0L);
        this.e = b(extras.getString("extra.save_directory"));
    }

    public final File i(File file, int i) {
        int i2;
        List listQ = q();
        if (i >= listQ.size()) {
            return null;
        }
        int[] iArr = (int[]) listQ.get(i);
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = this.b;
        if (i5 > 0 && (i2 = this.c) > 0 && (i3 > i5 || i4 > i2)) {
            i3 = i5;
            i4 = i2;
        }
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "file.absolutePath");
        if (StringsKt__StringsJVMKt.endsWith$default(absolutePath, ".png", false, 2, null)) {
            compressFormat = Bitmap.CompressFormat.PNG;
        }
        Bitmap.CompressFormat compressFormat2 = compressFormat;
        yb2 yb2Var = yb2.a;
        File fileF = yb2Var.f(this.e, yb2Var.e(file));
        if (fileF == null) {
            return null;
        }
        String absolutePath2 = fileF.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath2, "compressFile.absolutePath");
        return vx2.a.c(file, i3, i4, compressFormat2, absolutePath2);
    }

    public final void j(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        s(uri);
    }

    public final long k(Uri uri) {
        return yb2.a.j(this, uri) - this.d;
    }

    public final long l(File file) {
        return file.length() - this.d;
    }

    public final void m(File file) {
        ImagePickerActivity imagePickerActivityA = a();
        Uri uriFromFile = Uri.fromFile(file);
        Intrinsics.checkNotNullExpressionValue(uriFromFile, "Uri.fromFile(file)");
        imagePickerActivityA.j1(uriFromFile);
    }

    public final boolean n() {
        return this.d > 0;
    }

    public final boolean o(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        boolean z = n() && k(uri) > 0;
        if (z || this.b <= 0 || this.c <= 0) {
            return z;
        }
        Pair pairH = yb2.a.h(this, uri);
        return ((Number) pairH.getFirst()).intValue() > this.b || ((Number) pairH.getSecond()).intValue() > this.c;
    }

    public final boolean p(File file) {
        boolean z = n() && l(file) > 0;
        if (z || this.b <= 0 || this.c <= 0) {
            return z;
        }
        Pair pairI = yb2.a.i(file);
        return ((Number) pairI.getFirst()).intValue() > this.b || ((Number) pairI.getSecond()).intValue() > this.c;
    }

    public final List q() {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new int[][]{new int[]{2448, 3264}, new int[]{2008, 3032}, new int[]{1944, 2580}, new int[]{1680, 2240}, new int[]{1536, 2048}, new int[]{1200, 1600}, new int[]{1024, 1392}, new int[]{960, 1280}, new int[]{768, 1024}, new int[]{600, 800}, new int[]{480, 640}, new int[]{240, 320}, new int[]{120, 160}, new int[]{60, 80}, new int[]{30, 40}});
    }

    public final File r(File file) throws Throwable {
        int i;
        int i2 = 0;
        File fileI = null;
        int i3 = 0;
        while (true) {
            if (fileI != null) {
                fileI.delete();
            }
            fileI = i(file, i2);
            if (fileI == null) {
                if (i2 > 0) {
                    return i(file, i3);
                }
                return null;
            }
            if (this.d > 0) {
                long jL = l(fileI);
                i = (jL > ((long) 1048576) ? 3 : jL > ((long) 512000) ? 2 : 1) + i2;
            } else {
                i = i2 + 1;
            }
            if (!p(fileI)) {
                p62.a.a(file, fileI);
                return fileI;
            }
            int i4 = i;
            i3 = i2;
            i2 = i4;
        }
    }

    public final void s(Uri uri) {
        new b().execute(uri);
    }
}
