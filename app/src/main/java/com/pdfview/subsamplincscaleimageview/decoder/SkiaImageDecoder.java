package com.pdfview.subsamplincscaleimageview.decoder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.zepto.ix2;
import com.zepto.t86;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class SkiaImageDecoder implements ix2 {
    public final Bitmap.Config a;

    @Keep
    public SkiaImageDecoder() {
        this(null);
    }

    @Override // com.zepto.ix2
    public Bitmap a(Context context, Uri uri) throws Throwable {
        InputStream inputStreamOpenInputStream;
        Bitmap bitmapDecodeFile;
        String string = uri.toString();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = this.a;
        if (string.startsWith("android.resource://")) {
            String authority = uri.getAuthority();
            Resources resources = context.getPackageName().equals(authority) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            int size = pathSegments.size();
            int identifier = 0;
            if (size == 2 && pathSegments.get(0).equals("drawable")) {
                identifier = resources.getIdentifier(pathSegments.get(1), "drawable", authority);
            } else if (size == 1 && TextUtils.isDigitsOnly(pathSegments.get(0))) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                }
            }
            bitmapDecodeFile = BitmapFactory.decodeResource(context.getResources(), identifier, options);
        } else {
            InputStream inputStream = null;
            if (string.startsWith("file:///android_asset/")) {
                bitmapDecodeFile = BitmapFactory.decodeStream(context.getAssets().open(string.substring(22)), null, options);
            } else if (string.startsWith("file://")) {
                bitmapDecodeFile = BitmapFactory.decodeFile(string.substring(7), options);
            } else {
                try {
                    inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (Exception unused2) {
                        }
                    }
                    bitmapDecodeFile = bitmapDecodeStream;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStreamOpenInputStream;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception unused3) {
                        }
                    }
                    throw th;
                }
            }
        }
        if (bitmapDecodeFile != null) {
            return bitmapDecodeFile;
        }
        throw new RuntimeException("Skia image region decoder returned null bitmap - image format may not be supported");
    }

    public SkiaImageDecoder(Bitmap.Config config) {
        Bitmap.Config preferredBitmapConfig = t86.getPreferredBitmapConfig();
        if (config != null) {
            this.a = config;
        } else if (preferredBitmapConfig != null) {
            this.a = preferredBitmapConfig;
        } else {
            this.a = Bitmap.Config.RGB_565;
        }
    }
}
