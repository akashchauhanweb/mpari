package com.zepto;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class q60 extends AsyncTask {
    public final WeakReference a;
    public Bitmap b;
    public final RectF c;
    public final RectF d;
    public float e;
    public float f;
    public final int g;
    public final int h;
    public final Bitmap.CompressFormat i;
    public final int j;
    public final String k;
    public final String l;
    public final q62 m;
    public final p60 n;
    public int o;
    public int p;
    public int q;
    public int r;

    public q60(Context context, Bitmap bitmap, tx2 tx2Var, n31 n31Var, p60 p60Var) {
        this.a = new WeakReference(context);
        this.b = bitmap;
        this.c = tx2Var.a();
        this.d = tx2Var.c();
        this.e = tx2Var.d();
        this.f = tx2Var.b();
        this.g = n31Var.f();
        this.h = n31Var.g();
        this.i = n31Var.a();
        this.j = n31Var.b();
        this.k = n31Var.d();
        this.l = n31Var.e();
        this.m = n31Var.c();
        this.n = p60Var;
    }

    public final boolean a() throws Throwable {
        if (this.g > 0 && this.h > 0) {
            float fWidth = this.c.width() / this.e;
            float fHeight = this.c.height() / this.e;
            int i = this.g;
            if (fWidth > i || fHeight > this.h) {
                float fMin = Math.min(i / fWidth, this.h / fHeight);
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(this.b, Math.round(r2.getWidth() * fMin), Math.round(this.b.getHeight() * fMin), false);
                Bitmap bitmap = this.b;
                if (bitmap != bitmapCreateScaledBitmap) {
                    bitmap.recycle();
                }
                this.b = bitmapCreateScaledBitmap;
                this.e /= fMin;
            }
        }
        if (this.f != 0.0f) {
            Matrix matrix = new Matrix();
            matrix.setRotate(this.f, this.b.getWidth() / 2, this.b.getHeight() / 2);
            Bitmap bitmap2 = this.b;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), this.b.getHeight(), matrix, true);
            Bitmap bitmap3 = this.b;
            if (bitmap3 != bitmapCreateBitmap) {
                bitmap3.recycle();
            }
            this.b = bitmapCreateBitmap;
        }
        this.q = Math.round((this.c.left - this.d.left) / this.e);
        this.r = Math.round((this.c.top - this.d.top) / this.e);
        this.o = Math.round(this.c.width() / this.e);
        int iRound = Math.round(this.c.height() / this.e);
        this.p = iRound;
        boolean zE = e(this.o, iRound);
        Log.i("BitmapCropTask", "Should crop: " + zE);
        if (!zE) {
            ac2.a(this.k, this.l);
            return false;
        }
        r62 r62Var = new r62(this.k);
        d(Bitmap.createBitmap(this.b, this.q, this.r, this.o, this.p));
        if (!this.i.equals(Bitmap.CompressFormat.JPEG)) {
            return true;
        }
        lx2.b(r62Var, this.o, this.p, this.l);
        return true;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Throwable doInBackground(Void... voidArr) {
        Bitmap bitmap = this.b;
        if (bitmap == null) {
            return new NullPointerException("ViewBitmap is null");
        }
        if (bitmap.isRecycled()) {
            return new NullPointerException("ViewBitmap is recycled");
        }
        if (this.d.isEmpty()) {
            return new NullPointerException("CurrentImageRect is empty");
        }
        try {
            a();
            this.b = null;
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Throwable th) {
        p60 p60Var = this.n;
        if (p60Var != null) {
            if (th != null) {
                p60Var.a(th);
            } else {
                this.n.b(Uri.fromFile(new File(this.l)), this.q, this.r, this.o, this.p);
            }
        }
    }

    public final void d(Bitmap bitmap) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        FileOutputStream fileOutputStream;
        if (((Context) this.a.get()) == null) {
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(new File(this.l), false);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e) {
                e = e;
                byteArrayOutputStream = null;
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = null;
            }
        } catch (IOException e2) {
            e = e2;
            byteArrayOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = null;
        }
        try {
            bitmap.compress(this.i, this.j, byteArrayOutputStream);
            fileOutputStream.write(byteArrayOutputStream.toByteArray());
            bitmap.recycle();
            w60.c(fileOutputStream);
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            try {
                Log.e("BitmapCropTask", e.getLocalizedMessage());
                w60.c(fileOutputStream2);
            } catch (Throwable th3) {
                th = th3;
                w60.c(fileOutputStream2);
                w60.c(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream2 = fileOutputStream;
            w60.c(fileOutputStream2);
            w60.c(byteArrayOutputStream);
            throw th;
        }
        w60.c(byteArrayOutputStream);
    }

    public final boolean e(int i, int i2) {
        int iRound = Math.round(Math.max(i, i2) / 1000.0f) + 1;
        if (this.g > 0 && this.h > 0) {
            return true;
        }
        float f = iRound;
        return Math.abs(this.c.left - this.d.left) > f || Math.abs(this.c.top - this.d.top) > f || Math.abs(this.c.bottom - this.d.bottom) > f || Math.abs(this.c.right - this.d.right) > f || this.f != 0.0f;
    }
}
