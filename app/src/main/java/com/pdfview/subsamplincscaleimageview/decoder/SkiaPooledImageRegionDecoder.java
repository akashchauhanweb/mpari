package com.pdfview.subsamplincscaleimageview.decoder;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.zepto.rx2;
import com.zepto.t86;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes2.dex */
public class SkiaPooledImageRegionDecoder implements rx2 {
    public static final String i = "SkiaPooledImageRegionDecoder";
    public static boolean j;
    public b a;
    public final ReadWriteLock b;
    public final Bitmap.Config c;
    public Context d;
    public Uri e;
    public long f;
    public final Point g;
    public final AtomicBoolean h;

    public class a extends Thread {
        public a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (SkiaPooledImageRegionDecoder.this.a != null) {
                SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder = SkiaPooledImageRegionDecoder.this;
                if (!skiaPooledImageRegionDecoder.i(skiaPooledImageRegionDecoder.a.n(), SkiaPooledImageRegionDecoder.this.f)) {
                    return;
                }
                try {
                    if (SkiaPooledImageRegionDecoder.this.a != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        SkiaPooledImageRegionDecoder.this.j("Starting decoder");
                        SkiaPooledImageRegionDecoder.this.l();
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        SkiaPooledImageRegionDecoder.this.j("Started decoder, took " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + "ms");
                    }
                } catch (Exception e) {
                    SkiaPooledImageRegionDecoder.this.j("Failed to start decoder: " + e.getMessage());
                }
            }
        }
    }

    @Keep
    public SkiaPooledImageRegionDecoder() {
        this(null);
    }

    @Keep
    public static void setDebug(boolean z) {
        j = z;
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
            com.pdfview.subsamplincscaleimageview.decoder.SkiaPooledImageRegionDecoder$b r0 = r1.a     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            boolean r0 = com.pdfview.subsamplincscaleimageview.decoder.SkiaPooledImageRegionDecoder.b.f(r0)     // Catch: java.lang.Throwable -> Ld
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
        throw new UnsupportedOperationException("Method not decompiled: com.pdfview.subsamplincscaleimageview.decoder.SkiaPooledImageRegionDecoder.a():boolean");
    }

    @Override // com.zepto.rx2
    public Bitmap b(Rect rect, int i2) {
        j("Decode region " + rect + " on thread " + Thread.currentThread().getName());
        if (rect.width() < this.g.x || rect.height() < this.g.y) {
            n();
        }
        this.b.readLock().lock();
        try {
            b bVar = this.a;
            if (bVar != null) {
                BitmapRegionDecoder bitmapRegionDecoderG = bVar.g();
                if (bitmapRegionDecoderG != null) {
                    try {
                        if (!bitmapRegionDecoderG.isRecycled()) {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inSampleSize = i2;
                            options.inPreferredConfig = this.c;
                            Bitmap bitmapDecodeRegion = bitmapRegionDecoderG.decodeRegion(rect, options);
                            if (bitmapDecodeRegion != null) {
                                return bitmapDecodeRegion;
                            }
                            throw new RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
                        }
                    } finally {
                        this.a.m(bitmapRegionDecoderG);
                    }
                }
                if (bitmapRegionDecoderG != null) {
                }
            }
            throw new IllegalStateException("Cannot decode region after decoder has been recycled");
        } finally {
            this.b.readLock().unlock();
        }
    }

    @Override // com.zepto.rx2
    public synchronized void c() {
        this.b.writeLock().lock();
        try {
            b bVar = this.a;
            if (bVar != null) {
                bVar.l();
                this.a = null;
                this.d = null;
                this.e = null;
            }
        } finally {
            this.b.writeLock().unlock();
        }
    }

    @Override // com.zepto.rx2
    public Point d(Context context, Uri uri) throws IOException {
        this.d = context;
        this.e = uri;
        l();
        return this.g;
    }

    public boolean i(int i2, long j2) {
        if (i2 >= 4) {
            j("No additional decoders allowed, reached hard limit (4)");
            return false;
        }
        long j3 = ((long) i2) * j2;
        if (j3 > 20971520) {
            j("No additional encoders allowed, reached hard memory limit (20Mb)");
            return false;
        }
        if (i2 >= k()) {
            j("No additional encoders allowed, limited by CPU cores (" + k() + ")");
            return false;
        }
        if (m()) {
            j("No additional encoders allowed, memory is low");
            return false;
        }
        j("Additional decoder allowed, current count is " + i2 + ", estimated native memory " + (j3 / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) + "Mb");
        return true;
    }

    public final void j(String str) {
        if (j) {
            Log.d(i, str);
        }
    }

    public final int k() {
        return Runtime.getRuntime().availableProcessors();
    }

    public final void l() throws IOException {
        BitmapRegionDecoder bitmapRegionDecoderNewInstance;
        int identifier;
        String string = this.e.toString();
        boolean zStartsWith = string.startsWith("android.resource://");
        long length = LongCompanionObject.MAX_VALUE;
        if (zStartsWith) {
            String authority = this.e.getAuthority();
            Resources resources = this.d.getPackageName().equals(authority) ? this.d.getResources() : this.d.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = this.e.getPathSegments();
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
            try {
                length = this.d.getResources().openRawResourceFd(identifier).getLength();
            } catch (Exception unused2) {
            }
            bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(this.d.getResources().openRawResource(identifier), false);
        } else if (string.startsWith("file:///android_asset/")) {
            String strSubstring = string.substring(22);
            try {
                length = this.d.getAssets().openFd(strSubstring).getLength();
            } catch (Exception unused3) {
            }
            bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(this.d.getAssets().open(strSubstring, 1), false);
        } else if (string.startsWith("file://")) {
            BitmapRegionDecoder bitmapRegionDecoderNewInstance2 = BitmapRegionDecoder.newInstance(string.substring(7), false);
            try {
                File file = new File(string);
                if (file.exists()) {
                    length = file.length();
                }
            } catch (Exception unused4) {
            }
            bitmapRegionDecoderNewInstance = bitmapRegionDecoderNewInstance2;
        } else {
            InputStream inputStreamOpenInputStream = null;
            try {
                ContentResolver contentResolver = this.d.getContentResolver();
                inputStreamOpenInputStream = contentResolver.openInputStream(this.e);
                BitmapRegionDecoder bitmapRegionDecoderNewInstance3 = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream, false);
                try {
                    AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(this.e, "r");
                    if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                        length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                    }
                } catch (Exception unused5) {
                }
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (Exception unused6) {
                    }
                }
                bitmapRegionDecoderNewInstance = bitmapRegionDecoderNewInstance3;
            } catch (Throwable th) {
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (Exception unused7) {
                    }
                }
                throw th;
            }
        }
        this.f = length;
        this.g.set(bitmapRegionDecoderNewInstance.getWidth(), bitmapRegionDecoderNewInstance.getHeight());
        this.b.writeLock().lock();
        try {
            b bVar = this.a;
            if (bVar != null) {
                bVar.h(bitmapRegionDecoderNewInstance);
            }
        } finally {
            this.b.writeLock().unlock();
        }
    }

    public final boolean m() {
        ActivityManager activityManager = (ActivityManager) this.d.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    public final void n() {
        if (!this.h.compareAndSet(false, true) || this.f >= LongCompanionObject.MAX_VALUE) {
            return;
        }
        j("Starting lazy init of additional decoders");
        new a().start();
    }

    public SkiaPooledImageRegionDecoder(Bitmap.Config config) {
        this.a = new b(null);
        this.b = new ReentrantReadWriteLock(true);
        this.f = LongCompanionObject.MAX_VALUE;
        this.g = new Point(0, 0);
        this.h = new AtomicBoolean(false);
        Bitmap.Config preferredBitmapConfig = t86.getPreferredBitmapConfig();
        if (config != null) {
            this.c = config;
        } else if (preferredBitmapConfig != null) {
            this.c = preferredBitmapConfig;
        } else {
            this.c = Bitmap.Config.RGB_565;
        }
    }

    public static class b {
        public final Semaphore a;
        public final Map b;

        public b() {
            this.a = new Semaphore(0, true);
            this.b = new ConcurrentHashMap();
        }

        public final BitmapRegionDecoder g() {
            this.a.acquireUninterruptibly();
            return i();
        }

        public final synchronized void h(BitmapRegionDecoder bitmapRegionDecoder) {
            this.b.put(bitmapRegionDecoder, Boolean.FALSE);
            this.a.release();
        }

        public final synchronized BitmapRegionDecoder i() {
            for (Map.Entry entry : this.b.entrySet()) {
                if (!((Boolean) entry.getValue()).booleanValue()) {
                    entry.setValue(Boolean.TRUE);
                    return (BitmapRegionDecoder) entry.getKey();
                }
            }
            return null;
        }

        public final synchronized boolean j() {
            return this.b.isEmpty();
        }

        public final synchronized boolean k(BitmapRegionDecoder bitmapRegionDecoder) {
            for (Map.Entry entry : this.b.entrySet()) {
                if (bitmapRegionDecoder == entry.getKey()) {
                    if (!((Boolean) entry.getValue()).booleanValue()) {
                        return false;
                    }
                    entry.setValue(Boolean.FALSE);
                    return true;
                }
            }
            return false;
        }

        public final synchronized void l() {
            while (!this.b.isEmpty()) {
                BitmapRegionDecoder bitmapRegionDecoderG = g();
                bitmapRegionDecoderG.recycle();
                this.b.remove(bitmapRegionDecoderG);
            }
        }

        public final void m(BitmapRegionDecoder bitmapRegionDecoder) {
            if (k(bitmapRegionDecoder)) {
                this.a.release();
            }
        }

        public final synchronized int n() {
            return this.b.size();
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }
}
