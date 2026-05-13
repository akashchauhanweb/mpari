package com.pdfview.subsamplincscaleimageview.decoder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.zepto.rx2;
import com.zepto.t86;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes2.dex */
public class SkiaImageRegionDecoder implements rx2 {
    public BitmapRegionDecoder a;
    public final ReadWriteLock b;
    public final Bitmap.Config c;

    @Keep
    public SkiaImageRegionDecoder() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
    @Override // com.zepto.rx2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean a() {
        /*
            r1 = this;
            monitor-enter(r1)
            android.graphics.BitmapRegionDecoder r0 = r1.a     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            boolean r0 = r0.isRecycled()     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto Lf
            r0 = 1
            goto L10
        Ld:
            r0 = move-exception
            goto L12
        Lf:
            r0 = 0
        L10:
            monitor-exit(r1)
            return r0
        L12:
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pdfview.subsamplincscaleimageview.decoder.SkiaImageRegionDecoder.a():boolean");
    }

    @Override // com.zepto.rx2
    public Bitmap b(Rect rect, int i) {
        e().lock();
        try {
            BitmapRegionDecoder bitmapRegionDecoder = this.a;
            if (bitmapRegionDecoder == null || bitmapRegionDecoder.isRecycled()) {
                throw new IllegalStateException("Cannot decode region after decoder has been recycled");
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i;
            options.inPreferredConfig = this.c;
            Bitmap bitmapDecodeRegion = this.a.decodeRegion(rect, options);
            if (bitmapDecodeRegion == null) {
                throw new RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
            }
            e().unlock();
            return bitmapDecodeRegion;
        } catch (Throwable th) {
            e().unlock();
            throw th;
        }
    }

    @Override // com.zepto.rx2
    public synchronized void c() {
        this.b.writeLock().lock();
        try {
            this.a.recycle();
            this.a = null;
        } finally {
            this.b.writeLock().unlock();
        }
    }

    @Override // com.zepto.rx2
    public Point d(Context context, Uri uri) {
        int identifier;
        String string = uri.toString();
        if (string.startsWith("android.resource://")) {
            String authority = uri.getAuthority();
            Resources resources = context.getPackageName().equals(authority) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            int size = pathSegments.size();
            if (size == 2 && pathSegments.get(0).equals("drawable")) {
                identifier = resources.getIdentifier(pathSegments.get(1), "drawable", authority);
            } else if (size == 1 && TextUtils.isDigitsOnly(pathSegments.get(0))) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    identifier = 0;
                }
            } else {
                identifier = 0;
            }
            this.a = BitmapRegionDecoder.newInstance(context.getResources().openRawResource(identifier), false);
        } else if (string.startsWith("file:///android_asset/")) {
            this.a = BitmapRegionDecoder.newInstance(context.getAssets().open(string.substring(22), 1), false);
        } else if (string.startsWith("file://")) {
            this.a = BitmapRegionDecoder.newInstance(string.substring(7), false);
        } else {
            InputStream inputStreamOpenInputStream = null;
            try {
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                this.a = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream, false);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (Exception unused2) {
                    }
                }
            } catch (Throwable th) {
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        }
        return new Point(this.a.getWidth(), this.a.getHeight());
    }

    public final Lock e() {
        return this.b.readLock();
    }

    public SkiaImageRegionDecoder(Bitmap.Config config) {
        this.b = new ReentrantReadWriteLock(true);
        Bitmap.Config preferredBitmapConfig = t86.getPreferredBitmapConfig();
        if (config != null) {
            this.c = config;
        } else if (preferredBitmapConfig != null) {
            this.c = preferredBitmapConfig;
        } else {
            this.c = Bitmap.Config.RGB_565;
        }
    }
}
