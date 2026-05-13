package com.zepto;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import com.zepto.kc5;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class v60 extends AsyncTask {
    public final Context a;
    public Uri b;
    public Uri c;
    public final int d;
    public final int e;
    public final u60 f;

    public static class a {
        public Bitmap a;
        public q62 b;
        public Exception c;

        public a(Bitmap bitmap, q62 q62Var) {
            this.a = bitmap;
            this.b = q62Var;
        }

        public a(Exception exc) {
            this.c = exc;
        }
    }

    public v60(Context context, Uri uri, Uri uri2, int i, int i2, u60 u60Var) {
        this.a = context;
        this.b = uri;
        this.c = uri2;
        this.d = i;
        this.e = i2;
        this.f = u60Var;
    }

    public final boolean a(Bitmap bitmap, BitmapFactory.Options options) {
        if (bitmap == null || bitmap.getByteCount() <= 104857600) {
            return false;
        }
        options.inSampleSize *= 2;
        return true;
    }

    public final void b(Uri uri, Uri uri2) throws Throwable {
        InputStream inputStreamOpenInputStream;
        FileOutputStream fileOutputStream;
        Log.d("BitmapWorkerTask", "copyFile");
        if (uri2 == null) {
            throw new NullPointerException("Output Uri is null - cannot copy image");
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            inputStreamOpenInputStream = this.a.getContentResolver().openInputStream(uri);
            try {
                fileOutputStream = new FileOutputStream(new File(uri2.getPath()));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenInputStream = null;
        }
        try {
            if (inputStreamOpenInputStream == null) {
                throw new NullPointerException("InputStream for given input Uri is null");
            }
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStreamOpenInputStream.read(bArr);
                if (i <= 0) {
                    w60.c(fileOutputStream);
                    w60.c(inputStreamOpenInputStream);
                    this.b = this.c;
                    return;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            w60.c(fileOutputStream2);
            w60.c(inputStreamOpenInputStream);
            this.b = this.c;
            throw th;
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a doInBackground(Void... voidArr) {
        InputStream inputStreamOpenInputStream;
        if (this.b == null) {
            return new a(new NullPointerException("Input Uri cannot be null"));
        }
        try {
            f();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            options.inSampleSize = w60.a(options, this.d, this.e);
            boolean z = false;
            options.inJustDecodeBounds = false;
            Bitmap bitmapDecodeStream = null;
            while (!z) {
                try {
                    inputStreamOpenInputStream = this.a.getContentResolver().openInputStream(this.b);
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                    } finally {
                        w60.c(inputStreamOpenInputStream);
                    }
                } catch (IOException e) {
                    Log.e("BitmapWorkerTask", "doInBackground: ImageDecoder.createSource: ", e);
                    return new a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.b + "]", e));
                } catch (OutOfMemoryError e2) {
                    Log.e("BitmapWorkerTask", "doInBackground: BitmapFactory.decodeFileDescriptor: ", e2);
                    options.inSampleSize *= 2;
                }
                if (options.outWidth == -1 || options.outHeight == -1) {
                    return new a(new IllegalArgumentException("Bounds for bitmap could not be retrieved from the Uri: [" + this.b + "]"));
                }
                w60.c(inputStreamOpenInputStream);
                if (!a(bitmapDecodeStream, options)) {
                    z = true;
                }
            }
            if (bitmapDecodeStream == null) {
                return new a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.b + "]"));
            }
            int iG = w60.g(this.a, this.b);
            int iE = w60.e(iG);
            int iF = w60.f(iG);
            q62 q62Var = new q62(iG, iE, iF);
            Matrix matrix = new Matrix();
            if (iE != 0) {
                matrix.preRotate(iE);
            }
            if (iF != 1) {
                matrix.postScale(iF, 1.0f);
            }
            return !matrix.isIdentity() ? new a(w60.h(bitmapDecodeStream, matrix), q62Var) : new a(bitmapDecodeStream, q62Var);
        } catch (IOException | NullPointerException e3) {
            return new a(e3);
        }
    }

    public final void d(Uri uri, Uri uri2) throws Throwable {
        Closeable closeable;
        ld5 ld5Var;
        Log.d("BitmapWorkerTask", "downloadFile");
        if (uri2 == null) {
            throw new NullPointerException("Output Uri is null - cannot download image");
        }
        yf4 yf4Var = new yf4();
        a80 a80Var = null;
        try {
            ld5 ld5VarExecute = yf4Var.a(new kc5.a().j(uri.toString()).b()).execute();
            try {
                a80 a80VarSource = ld5VarExecute.d().source();
                try {
                    OutputStream outputStreamOpenOutputStream = this.a.getContentResolver().openOutputStream(uri2);
                    if (outputStreamOpenOutputStream == null) {
                        throw new NullPointerException("OutputStream for given output Uri is null");
                    }
                    d36 d36VarG = zf4.g(outputStreamOpenOutputStream);
                    a80VarSource.T(d36VarG);
                    w60.c(a80VarSource);
                    w60.c(d36VarG);
                    w60.c(ld5VarExecute.d());
                    yf4Var.o().a();
                    this.b = this.c;
                } catch (Throwable th) {
                    th = th;
                    ld5Var = ld5VarExecute;
                    closeable = null;
                    a80Var = a80VarSource;
                    w60.c(a80Var);
                    w60.c(closeable);
                    if (ld5Var != null) {
                        w60.c(ld5Var.d());
                    }
                    yf4Var.o().a();
                    this.b = this.c;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                ld5Var = ld5VarExecute;
                closeable = null;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
            ld5Var = null;
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(a aVar) {
        Exception exc = aVar.c;
        if (exc != null) {
            this.f.a(exc);
            return;
        }
        u60 u60Var = this.f;
        Bitmap bitmap = aVar.a;
        q62 q62Var = aVar.b;
        String path = this.b.getPath();
        Uri uri = this.c;
        u60Var.b(bitmap, q62Var, path, uri == null ? null : uri.getPath());
    }

    public final void f() {
        String scheme = this.b.getScheme();
        Log.d("BitmapWorkerTask", "Uri scheme: " + scheme);
        if ("http".equals(scheme) || "https".equals(scheme)) {
            try {
                d(this.b, this.c);
                return;
            } catch (IOException | NullPointerException e) {
                Log.e("BitmapWorkerTask", "Downloading failed", e);
                throw e;
            }
        }
        if ("content".equals(scheme)) {
            try {
                b(this.b, this.c);
                return;
            } catch (IOException | NullPointerException e2) {
                Log.e("BitmapWorkerTask", "Copying failed", e2);
                throw e2;
            }
        }
        if ("file".equals(scheme)) {
            return;
        }
        Log.e("BitmapWorkerTask", "Invalid Uri scheme " + scheme);
        throw new IllegalArgumentException("Invalid Uri scheme" + scheme);
    }
}
