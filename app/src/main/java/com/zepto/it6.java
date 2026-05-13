package com.zepto;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class it6 {
    public static final String a = File.separator;

    public static final String a(Context context) {
        StringBuilder sb = new StringBuilder();
        File cacheDir = context.getCacheDir();
        Intrinsics.checkExpressionValueIsNotNull(cacheDir, "context.cacheDir");
        sb.append(cacheDir.getPath());
        String str = a;
        sb.append(str);
        sb.append("compressor");
        sb.append(str);
        return sb.toString();
    }

    public static final int b(BitmapFactory.Options options, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(options, "options");
        Pair pair = TuplesKt.to(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int iIntValue = ((Number) pair.component1()).intValue();
        int iIntValue2 = ((Number) pair.component2()).intValue();
        int i3 = 1;
        if (iIntValue > i2 || iIntValue2 > i) {
            int i4 = iIntValue / 2;
            int i5 = iIntValue2 / 2;
            while (i4 / i3 >= i2 && i5 / i3 >= i) {
                i3 *= 2;
            }
        }
        return i3;
    }

    public static final Bitmap.CompressFormat c(File compressFormat) {
        Intrinsics.checkParameterIsNotNull(compressFormat, "$this$compressFormat");
        String extension = FilesKt__UtilsKt.getExtension(compressFormat);
        if (extension == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = extension.toLowerCase();
        Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != 111145) {
            if (iHashCode == 3645340 && lowerCase.equals("webp")) {
                return Bitmap.CompressFormat.WEBP;
            }
        } else if (lowerCase.equals("png")) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    public static final File d(Context context, File imageFile) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(imageFile, "imageFile");
        return FilesKt__UtilsKt.copyTo$default(imageFile, new File(a(context) + imageFile.getName()), true, 0, 4, null);
    }

    public static final Bitmap e(File imageFile, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(imageFile, "imageFile");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(imageFile.getAbsolutePath(), options);
        options.inSampleSize = b(options, i, i2);
        options.inJustDecodeBounds = false;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(imageFile.getAbsolutePath(), options);
        Intrinsics.checkExpressionValueIsNotNull(bitmapDecodeFile, "BitmapFactory.decodeFile…eFile.absolutePath, this)");
        Intrinsics.checkExpressionValueIsNotNull(bitmapDecodeFile, "BitmapFactory.Options().…absolutePath, this)\n    }");
        return bitmapDecodeFile;
    }

    public static final Bitmap f(File imageFile, Bitmap bitmap) {
        Intrinsics.checkParameterIsNotNull(imageFile, "imageFile");
        Intrinsics.checkParameterIsNotNull(bitmap, "bitmap");
        int attributeInt = new ExifInterface(imageFile.getAbsolutePath()).getAttributeInt("Orientation", 0);
        Matrix matrix = new Matrix();
        if (attributeInt == 3) {
            matrix.postRotate(180.0f);
        } else if (attributeInt == 6) {
            matrix.postRotate(90.0f);
        } else if (attributeInt == 8) {
            matrix.postRotate(270.0f);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Intrinsics.checkExpressionValueIsNotNull(bitmapCreateBitmap, "Bitmap.createBitmap(bitm…map.height, matrix, true)");
        return bitmapCreateBitmap;
    }

    public static final String g(Bitmap.CompressFormat extension) {
        Intrinsics.checkParameterIsNotNull(extension, "$this$extension");
        int i = ht6.a[extension.ordinal()];
        return i != 1 ? i != 2 ? "jpg" : "webp" : "png";
    }

    public static final Bitmap h(File imageFile) {
        Intrinsics.checkParameterIsNotNull(imageFile, "imageFile");
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(imageFile.getAbsolutePath());
        Intrinsics.checkExpressionValueIsNotNull(bitmapDecodeFile, "this");
        return f(imageFile, bitmapDecodeFile);
    }

    public static final File i(File imageFile, Bitmap bitmap, Bitmap.CompressFormat format, int i) throws Throwable {
        File file;
        Intrinsics.checkParameterIsNotNull(imageFile, "imageFile");
        Intrinsics.checkParameterIsNotNull(bitmap, "bitmap");
        Intrinsics.checkParameterIsNotNull(format, "format");
        if (format == c(imageFile)) {
            file = imageFile;
        } else {
            StringBuilder sb = new StringBuilder();
            String absolutePath = imageFile.getAbsolutePath();
            Intrinsics.checkExpressionValueIsNotNull(absolutePath, "imageFile.absolutePath");
            sb.append(StringsKt__StringsKt.substringBeforeLast$default(absolutePath, ".", (String) null, 2, (Object) null));
            sb.append('.');
            sb.append(g(format));
            file = new File(sb.toString());
        }
        imageFile.delete();
        k(bitmap, file, format, i);
        return file;
    }

    public static /* synthetic */ File j(File file, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            compressFormat = c(file);
        }
        if ((i2 & 8) != 0) {
            i = 100;
        }
        return i(file, bitmap, compressFormat, i);
    }

    public static final void k(Bitmap bitmap, File destination, Bitmap.CompressFormat format, int i) throws Throwable {
        FileOutputStream fileOutputStream;
        Intrinsics.checkParameterIsNotNull(bitmap, "bitmap");
        Intrinsics.checkParameterIsNotNull(destination, "destination");
        Intrinsics.checkParameterIsNotNull(format, "format");
        File parentFile = destination.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(destination.getAbsolutePath());
        } catch (Throwable th) {
            th = th;
        }
        try {
            bitmap.compress(format, i, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                fileOutputStream2.flush();
                fileOutputStream2.close();
            }
            throw th;
        }
    }
}
