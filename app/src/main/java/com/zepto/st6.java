package com.zepto;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.s14;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class st6 {
    public static final String a = "NextGen mParivahan";
    public static final String b = "OK";
    public static final String c;
    public static final String d;
    public static String e;
    public static String f;
    public static String g;

    static {
        StringBuilder sb = new StringBuilder();
        s14.a aVar = s14.a;
        sb.append(aVar.z());
        sb.append("dms-sarthi/search-dms?applno=");
        c = sb.toString();
        d = aVar.B();
        e = VContant.APPLICATION_SCREEN;
        f = VContant.MAINSCREEN;
        g = "ANDROID";
    }

    public static final String a(Context context, Uri uri) {
        InputStream inputStreamOpenInputStream;
        Intrinsics.checkNotNullParameter(context, "context");
        new File(uri != null ? uri.getPath() : null);
        if (uri != null) {
            try {
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            } catch (FileNotFoundException e2) {
                e2.printStackTrace();
                return "";
            } catch (IOException e3) {
                e3.printStackTrace();
                return "";
            }
        } else {
            inputStreamOpenInputStream = null;
        }
        byte[] bArr = inputStreamOpenInputStream != null ? new byte[inputStreamOpenInputStream.available()] : null;
        if (inputStreamOpenInputStream != null) {
            inputStreamOpenInputStream.read(bArr);
        }
        String strEncodeToString = Base64.encodeToString(bArr, 0);
        Intrinsics.checkNotNull(strEncodeToString);
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(strEncodeToString, "\n", "", false, 4, (Object) null), "\r", "", false, 4, (Object) null);
        System.out.println(strReplace$default);
        return strReplace$default;
    }

    public static final String b(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap != null) {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 30, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        String strEncodeToString = Base64.encodeToString(byteArray, 0);
        Intrinsics.checkNotNull(strEncodeToString);
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(strEncodeToString, "\n", "", false, 4, (Object) null), "\r", "", false, 4, (Object) null);
        Intrinsics.checkNotNull(strReplace$default);
        return strReplace$default;
    }

    public static final Bitmap c(String base64) {
        Intrinsics.checkNotNullParameter(base64, "base64");
        byte[] bArrDecode = Base64.decode(base64, 0);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static final boolean d(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        aj0 aj0Var = aj0.a;
        if (!aj0Var.c() || aj0Var.b(activity)) {
            return true;
        }
        aj0Var.e(activity, 222);
        return false;
    }

    public static final boolean e(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        aj0 aj0Var = aj0.a;
        if (!aj0Var.c() || aj0Var.d(activity)) {
            return true;
        }
        aj0Var.f(activity, 666);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String f(android.graphics.Bitmap r7) {
        /*
            java.lang.String r0 = "image"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
            r2 = 100
            r7.compress(r1, r2, r0)
            byte[] r2 = r0.toByteArray()
            int r2 = r2.length
            int r2 = r2 / 1024
            r3 = 800(0x320, float:1.121E-42)
            if (r2 <= r3) goto L24
            r0.reset()
            r2 = 50
            r7.compress(r1, r2, r0)
        L24:
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream
            byte[] r1 = r0.toByteArray()
            r7.<init>(r1)
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r2 = 1
            r1.inJustDecodeBounds = r2
            r3 = 0
            android.graphics.BitmapFactory.decodeStream(r7, r3, r1)
            r7 = 0
            r1.inJustDecodeBounds = r7
            int r7 = r1.outWidth
            int r4 = r1.outHeight
            if (r7 <= r4) goto L4d
            float r5 = (float) r7
            r6 = 1139802112(0x43f00000, float:480.0)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L4d
            float r7 = (float) r7
            float r7 = r7 / r6
        L4b:
            int r7 = (int) r7
            goto L5a
        L4d:
            if (r7 >= r4) goto L59
            float r7 = (float) r4
            r5 = 1145569280(0x44480000, float:800.0)
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 <= 0) goto L59
            float r7 = (float) r4
            float r7 = r7 / r5
            goto L4b
        L59:
            r7 = r2
        L5a:
            if (r7 > 0) goto L5d
            goto L5e
        L5d:
            r2 = r7
        L5e:
            r1.inSampleSize = r2
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream
            byte[] r0 = r0.toByteArray()
            r7.<init>(r0)
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeStream(r7, r3, r1)
            java.lang.String r7 = g(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.st6.f(android.graphics.Bitmap):java.lang.String");
    }

    public static final String g(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Intrinsics.checkNotNull(bitmap);
        bitmap.compress(Bitmap.CompressFormat.JPEG, 70, byteArrayOutputStream);
        int i = 100;
        while (byteArrayOutputStream.toByteArray().length / 1024 > 100) {
            byteArrayOutputStream.reset();
            bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
            i -= 10;
        }
        return StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0), "\n", "", false, 4, (Object) null), "\r", "", false, 4, (Object) null);
    }

    public static final String h(String request, String key) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(key, "key");
        return j.a.b(request, key);
    }

    public static final String i(int i) {
        return j.a.b(String.valueOf(i), d);
    }

    public static final String j(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date date = simpleDateFormat.parse(str);
            Intrinsics.checkNotNullExpressionValue(date, "parse(...)");
            return simpleDateFormat2.format(date);
        } catch (ParseException unused) {
            return null;
        }
    }

    public static final String k(String str, String inFormType, String outFormType) {
        Intrinsics.checkNotNullParameter(inFormType, "inFormType");
        Intrinsics.checkNotNullParameter(outFormType, "outFormType");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(inFormType);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(outFormType);
        try {
            Date date = simpleDateFormat.parse(str);
            Intrinsics.checkNotNullExpressionValue(date, "parse(...)");
            return simpleDateFormat2.format(date);
        } catch (ParseException unused) {
            return null;
        }
    }

    public static final String l(int i) {
        String strSubstring = d.substring(0, r0.length() - 5);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring + i;
    }

    public static final String m() {
        return c;
    }

    public static final String n() {
        return a;
    }

    public static final String o() {
        return b;
    }

    public static final int p(double d2, double d3) {
        return (int) (((double) ((int) (Math.random() * ((d3 - d2) + ((double) 1))))) + d2);
    }

    public static final String q(Context context, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Cursor cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
        Intrinsics.checkNotNull(cursorQuery);
        int columnIndex = cursorQuery.getColumnIndex("_display_name");
        cursorQuery.moveToFirst();
        String string = cursorQuery.getString(columnIndex);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public static final String r(Context context, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        return String.valueOf(MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri)));
    }
}
