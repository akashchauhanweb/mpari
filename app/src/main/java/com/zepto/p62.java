package com.zepto;

import android.util.Log;
import java.io.File;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class p62 {
    public static final p62 a = new p62();

    public final void a(File filePathOri, File filePathDest) throws Throwable {
        Intrinsics.checkNotNullParameter(filePathOri, "filePathOri");
        Intrinsics.checkNotNullParameter(filePathDest, "filePathDest");
        try {
            r62 r62Var = new r62(filePathOri);
            r62 r62Var2 = new r62(filePathDest);
            Iterator it = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"FNumber", "ExposureTime", "ISOSpeedRatings", "GPSAltitude", "GPSAltitudeRef", "FocalLength", "GPSDateStamp", "WhiteBalance", "GPSProcessingMethod", "GPSTimeStamp", "DateTime", "Flash", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "Make", "Model", "Orientation"}).iterator();
            while (it.hasNext()) {
                b(r62Var, r62Var2, (String) it.next());
            }
            r62Var2.V();
        } catch (Exception e) {
            Log.e("ExifDataCopier", "Error preserving Exif data on selected image: " + e);
        }
    }

    public final void b(r62 r62Var, r62 r62Var2, String str) {
        if (r62Var.j(str) != null) {
            r62Var2.Z(str, r62Var.j(str));
        }
    }
}
