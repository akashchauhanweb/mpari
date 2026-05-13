package com.zepto;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class kx2 implements Closeable {
    public final URL c;
    public volatile Future e;
    public Task f;

    public kx2(URL url) {
        this.c = url;
    }

    public static kx2 m(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new kx2(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    public void B(ExecutorService executorService) {
        final rc6 rc6Var = new rc6();
        this.e = executorService.submit(new Runnable() { // from class: com.zepto.jx2
            @Override // java.lang.Runnable
            public final void run() {
                this.c.w(rc6Var);
            }
        });
        this.f = rc6Var.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.e.cancel(true);
    }

    public Bitmap e() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.c);
        }
        byte[] bArrJ = j();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrJ, 0, bArrJ.length);
        if (bitmapDecodeByteArray == null) {
            throw new IOException("Failed to decode image: " + this.c);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.c);
        }
        return bitmapDecodeByteArray;
    }

    public final byte[] j() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.c.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrD = r80.d(r80.b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + bArrD.length + " bytes from " + this.c);
            }
            if (bArrD.length <= 1048576) {
                return bArrD;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public Task n() {
        return (Task) iu4.i(this.f);
    }

    public final /* synthetic */ void w(rc6 rc6Var) {
        try {
            rc6Var.c(e());
        } catch (Exception e) {
            rc6Var.b(e);
        }
    }
}
