package com.zepto;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class gu1 {
    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static long b(Context context, Uri uri) {
        return c(context, uri, "_size", 0L);
    }

    public static long c(Context context, Uri uri, String str, long j) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, new String[]{str}, null, null, null);
            return (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) ? j : cursorQuery.getLong(0);
        } catch (Exception e) {
            Log.w("DocumentFile", "Failed query: " + e);
            return j;
        } finally {
            a(cursorQuery);
        }
    }
}
