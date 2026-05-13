package com.zepto;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.zepto.ds4;
import com.zepto.pc5;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes2.dex */
public class ks3 extends uy0 {
    public static final String[] b = {"orientation"};

    public enum a {
        MICRO(3, 96, 96),
        MINI(1, ConstantsKt.MINIMUM_BLOCK_SIZE, 384),
        FULL(2, -1, -1);

        public final int c;
        public final int e;
        public final int f;

        a(int i, int i2, int i3) {
            this.c = i;
            this.e = i2;
            this.f = i3;
        }
    }

    public ks3(Context context) {
        super(context);
    }

    public static int k(ContentResolver contentResolver, Uri uri) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, b, null, null, null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                int i = cursorQuery.getInt(0);
                cursorQuery.close();
                return i;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return 0;
        } catch (RuntimeException unused) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return 0;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public static a l(int i, int i2) {
        a aVar = a.MICRO;
        if (i <= aVar.e && i2 <= aVar.f) {
            return aVar;
        }
        a aVar2 = a.MINI;
        return (i > aVar2.e || i2 > aVar2.f) ? a.FULL : aVar2;
    }

    @Override // com.zepto.uy0, com.zepto.pc5
    public boolean c(jc5 jc5Var) {
        Uri uri = jc5Var.d;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    @Override // com.zepto.uy0, com.zepto.pc5
    public pc5.a f(jc5 jc5Var, int i) {
        Bitmap thumbnail;
        ContentResolver contentResolver = this.a.getContentResolver();
        int iK = k(contentResolver, jc5Var.d);
        String type = contentResolver.getType(jc5Var.d);
        boolean z = type != null && type.startsWith("video/");
        if (jc5Var.c()) {
            a aVarL = l(jc5Var.h, jc5Var.i);
            if (!z && aVarL == a.FULL) {
                return new pc5.a(null, zf4.k(j(jc5Var)), ds4.e.DISK, iK);
            }
            long id = ContentUris.parseId(jc5Var.d);
            BitmapFactory.Options optionsD = pc5.d(jc5Var);
            optionsD.inJustDecodeBounds = true;
            pc5.a(jc5Var.h, jc5Var.i, aVarL.e, aVarL.f, optionsD, jc5Var);
            if (z) {
                thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, id, aVarL == a.FULL ? 1 : aVarL.c, optionsD);
            } else {
                thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, id, aVarL.c, optionsD);
            }
            if (thumbnail != null) {
                return new pc5.a(thumbnail, null, ds4.e.DISK, iK);
            }
        }
        return new pc5.a(null, zf4.k(j(jc5Var)), ds4.e.DISK, iK);
    }
}
