package com.zepto;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class yb2 {
    public static final yb2 a = new yb2();

    public static /* synthetic */ File g(yb2 yb2Var, File file, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return yb2Var.f(file, str);
    }

    public final Bitmap.CompressFormat a(String extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        return StringsKt__StringsKt.contains((CharSequence) extension, (CharSequence) "png", true) ? Bitmap.CompressFormat.PNG : StringsKt__StringsKt.contains((CharSequence) extension, (CharSequence) "webp", true) ? Build.VERSION.SDK_INT >= 30 ? Bitmap.CompressFormat.WEBP_LOSSLESS : Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG;
    }

    public final du1 b(Context context, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (!m(uri)) {
            return du1.b(context, uri);
        }
        String strG = wb2.a.g(context, uri);
        if (strG != null) {
            return du1.a(new File(strG));
        }
        return null;
    }

    public final String c() {
        return "IMG_" + l();
    }

    public final String d(Uri uriImage) {
        Intrinsics.checkNotNullParameter(uriImage, "uriImage");
        String str = null;
        try {
            String path = uriImage.getPath();
            if (path != null && StringsKt__StringsKt.lastIndexOf$default((CharSequence) path, ".", 0, false, 6, (Object) null) != -1) {
                String strSubstring = path.substring(StringsKt__StringsKt.lastIndexOf$default((CharSequence) path, ".", 0, false, 6, (Object) null) + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
                str = strSubstring;
            }
        } catch (Exception unused) {
        }
        if (str == null || str.length() == 0) {
            str = "jpg";
        }
        return '.' + str;
    }

    public final String e(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        Uri uriFromFile = Uri.fromFile(file);
        Intrinsics.checkNotNullExpressionValue(uriFromFile, "Uri.fromFile(file)");
        return d(uriFromFile);
    }

    public final File f(File fileDir, String str) {
        Intrinsics.checkNotNullParameter(fileDir, "fileDir");
        if (str == null) {
            str = ".jpg";
        }
        try {
            String str2 = c() + str;
            if (!fileDir.exists()) {
                fileDir.mkdirs();
            }
            File file = new File(fileDir, str2);
            file.createNewFile();
            return file;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final Pair h(Context context, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri), null, options);
        return new Pair(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }

    public final Pair i(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        return new Pair(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }

    public final long j(Context context, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        du1 du1VarB = b(context, uri);
        if (du1VarB != null) {
            return du1VarB.c();
        }
        return 0L;
    }

    public final File k(Context context, Uri uri) {
        FileDescriptor fileDescriptor;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            File file = new File(context.getCacheDir(), "image_picker.png");
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            if (parcelFileDescriptorOpenFileDescriptor == null || (fileDescriptor = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()) == null) {
                return null;
            }
            FileChannel channel = new FileInputStream(fileDescriptor).getChannel();
            FileChannel channel2 = new FileOutputStream(file).getChannel();
            channel2.transferFrom(channel, 0L, channel.size());
            channel.close();
            channel2.close();
            return file;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final String l() {
        String str = new SimpleDateFormat("yyyyMMdd_HHmmssSSS", Locale.getDefault()).format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "SimpleDateFormat(timeFor…Default()).format(Date())");
        return str;
    }

    public final boolean m(Uri uri) {
        return StringsKt__StringsJVMKt.equals("file", uri.getScheme(), true);
    }
}
