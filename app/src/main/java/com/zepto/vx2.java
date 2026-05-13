package com.zepto;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vx2 {
    public static final vx2 a = new vx2();

    public final int a(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 >= i2 && i7 / i5 >= i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    public final boolean b(Bitmap bitmap, BitmapFactory.Options options) {
        int i = options.outWidth;
        int i2 = options.inSampleSize;
        int i3 = (i / i2) * (options.outHeight / i2);
        Bitmap.Config config = bitmap.getConfig();
        Intrinsics.checkNotNullExpressionValue(config, "candidate.config");
        return i3 * e(config) <= bitmap.getAllocationByteCount();
    }

    public final File c(File imageFile, float f, float f2, Bitmap.CompressFormat compressFormat, String destinationPath) throws Throwable {
        Intrinsics.checkNotNullParameter(imageFile, "imageFile");
        Intrinsics.checkNotNullParameter(compressFormat, "compressFormat");
        Intrinsics.checkNotNullParameter(destinationPath, "destinationPath");
        File parentFile = new File(destinationPath).getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(destinationPath);
            try {
                Bitmap bitmapD = d(imageFile, f, f2);
                if (bitmapD != null) {
                    bitmapD.compress(compressFormat, 100, fileOutputStream2);
                }
                fileOutputStream2.flush();
                fileOutputStream2.close();
                return new File(destinationPath);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final Bitmap d(File file, float f, float f2) {
        Bitmap bitmapCreateBitmap;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        int i = options.outHeight;
        int i2 = options.outWidth;
        float f3 = i2;
        float f4 = i;
        float f5 = f3 / f4;
        float f6 = f / f2;
        if (f4 > f2 || f3 > f) {
            if (f5 < f6) {
                i2 = (int) ((f2 / f4) * f3);
                i = (int) f2;
            } else {
                if (f5 > f6) {
                    f2 = (f / f3) * f4;
                }
                i = (int) f2;
                i2 = (int) f;
            }
        }
        options.inSampleSize = a(options, i2, i);
        options.inJustDecodeBounds = false;
        if (bitmapDecodeFile != null && b(bitmapDecodeFile, options)) {
            options.inMutable = true;
            options.inBitmap = bitmapDecodeFile;
        }
        options.inTempStorage = new byte[16384];
        try {
            bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            bitmapCreateBitmap = null;
        }
        Bitmap bitmap = bitmapCreateBitmap;
        float f7 = i2;
        float f8 = f7 / options.outWidth;
        float f9 = i;
        float f10 = f9 / options.outHeight;
        float f11 = f7 / 2.0f;
        float f12 = f9 / 2.0f;
        Matrix matrix = new Matrix();
        matrix.setScale(f8, f10, f11, f12);
        Intrinsics.checkNotNull(bitmap);
        Canvas canvas = new Canvas(bitmap);
        canvas.setMatrix(matrix);
        Intrinsics.checkNotNull(bitmapDecodeFile);
        canvas.drawBitmap(bitmapDecodeFile, f11 - (bitmapDecodeFile.getWidth() / 2), f12 - (bitmapDecodeFile.getHeight() / 2), new Paint(2));
        bitmapDecodeFile.recycle();
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), new Matrix(), true);
    }

    public final int e(Bitmap.Config config) {
        int i = ux2.a[config.ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3) ? 2 : 1;
        }
        return 4;
    }
}
