package com.zepto;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import java.io.File;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class wb2 {
    public static final wb2 a = new wb2();

    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(android.content.Context r9, android.net.Uri r10, java.lang.String r11, java.lang.String[] r12) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            r6 = 0
            r2 = r10
            r4 = r11
            r5 = r12
            android.database.Cursor r9 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            if (r9 == 0) goto L2f
            boolean r10 = r9.moveToFirst()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
            if (r10 == 0) goto L2f
            int r10 = r9.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
            java.lang.String r10 = r9.getString(r10)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
            r9.close()
            return r10
        L2a:
            r10 = move-exception
            r7 = r9
            goto L40
        L2d:
            r10 = move-exception
            goto L39
        L2f:
            if (r9 == 0) goto L3f
        L31:
            r9.close()
            goto L3f
        L35:
            r10 = move-exception
            goto L40
        L37:
            r10 = move-exception
            r9 = r7
        L39:
            r10.printStackTrace()     // Catch: java.lang.Throwable -> L2a
            if (r9 == 0) goto L3f
            goto L31
        L3f:
            return r7
        L40:
            if (r7 == 0) goto L45
            r7.close()
        L45:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.wb2.a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public final String b(Context context, Uri uri) throws Throwable {
        String strC = c(context, uri);
        if (strC != null) {
            String str = Environment.getExternalStorageDirectory().toString() + "/Download/" + strC;
            if (new File(str).exists()) {
                return str;
            }
        }
        String id = DocumentsContract.getDocumentId(uri);
        Intrinsics.checkNotNullExpressionValue(id, "id");
        if (StringsKt__StringsKt.contains$default((CharSequence) id, (CharSequence) ":", false, 2, (Object) null)) {
            id = (String) StringsKt__StringsKt.split$default((CharSequence) id, new String[]{":"}, false, 0, 6, (Object) null).get(1);
        }
        Uri uri2 = Uri.parse("content://downloads/public_downloads");
        Long lValueOf = Long.valueOf(id);
        Intrinsics.checkNotNullExpressionValue(lValueOf, "java.lang.Long.valueOf(id)");
        Uri uriWithAppendedId = ContentUris.withAppendedId(uri2, lValueOf.longValue());
        Intrinsics.checkNotNullExpressionValue(uriWithAppendedId, "ContentUris.withAppended…ong.valueOf(id)\n        )");
        return a(context, uriWithAppendedId, null, null);
    }

    public final String c(Context context, Uri uri) throws Throwable {
        Cursor cursor = null;
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final String d(Context context, Uri uri) {
        List listEmptyList;
        String docId = DocumentsContract.getDocumentId(uri);
        Intrinsics.checkNotNullExpressionValue(docId, "docId");
        List<String> listSplit = new Regex(":").split(docId, 0);
        if (listSplit.isEmpty()) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        } else {
            ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    listEmptyList = CollectionsKt___CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                    break;
                }
            }
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        Object[] array = listEmptyList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) array;
        String str = strArr[0];
        return a(context, Intrinsics.areEqual("image", str) ? MediaStore.Images.Media.EXTERNAL_CONTENT_URI : Intrinsics.areEqual("video", str) ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : Intrinsics.areEqual("audio", str) ? MediaStore.Audio.Media.EXTERNAL_CONTENT_URI : null, "_id=?", new String[]{strArr[1]});
    }

    public final String e(Context context, Uri uri) {
        List listEmptyList;
        if (!DocumentsContract.isDocumentUri(context, uri)) {
            String scheme = uri.getScheme();
            Intrinsics.checkNotNull(scheme);
            if (StringsKt__StringsJVMKt.equals("content", scheme, true)) {
                return j(uri) ? uri.getLastPathSegment() : a(context, uri, null, null);
            }
            String scheme2 = uri.getScheme();
            Intrinsics.checkNotNull(scheme2);
            if (StringsKt__StringsJVMKt.equals("file", scheme2, true)) {
                return uri.getPath();
            }
        } else {
            if (i(uri)) {
                String docId = DocumentsContract.getDocumentId(uri);
                Intrinsics.checkNotNullExpressionValue(docId, "docId");
                List<String> listSplit = new Regex(":").split(docId, 0);
                if (listSplit.isEmpty()) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                    while (listIterator.hasPrevious()) {
                        if (listIterator.previous().length() != 0) {
                            listEmptyList = CollectionsKt___CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                }
                Object[] array = listEmptyList.toArray(new String[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr = (String[]) array;
                if (StringsKt__StringsJVMKt.equals("primary", strArr[0], true)) {
                    if (strArr.length <= 1) {
                        return Environment.getExternalStorageDirectory().toString() + "/";
                    }
                    return Environment.getExternalStorageDirectory().toString() + "/" + strArr[1];
                }
                String str = "storage/" + StringsKt__StringsJVMKt.replace$default(docId, ":", "/", false, 4, (Object) null);
                if (new File(str).exists()) {
                    return str;
                }
                return "/storage/sdcard/" + strArr[1];
            }
            if (h(uri)) {
                return b(context, uri);
            }
            if (k(uri)) {
                return d(context, uri);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String f(android.content.Context r6, android.net.Uri r7) throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
            com.zepto.yb2 r2 = com.zepto.yb2.a     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4c
            java.lang.String r3 = r2.d(r7)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4c
            android.content.ContentResolver r4 = r6.getContentResolver()     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4c
            java.io.InputStream r7 = r4.openInputStream(r7)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4c
            java.io.File r6 = r6.getCacheDir()     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L46
            java.lang.String r4 = "context.cacheDir"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L46
            java.io.File r6 = r2.f(r6, r3)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L46
            if (r6 != 0) goto L25
            if (r7 == 0) goto L24
            r7.close()     // Catch: java.io.IOException -> L24
        L24:
            return r0
        L25:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L44
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L44
            if (r7 == 0) goto L36
            r3 = 4096(0x1000, float:5.74E-42)
            kotlin.io.ByteStreamsKt.copyTo(r7, r2, r3)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L5b
            r3 = 1
            goto L37
        L33:
            r6 = move-exception
        L34:
            r0 = r7
            goto L50
        L36:
            r3 = r1
        L37:
            if (r7 == 0) goto L3c
            r7.close()     // Catch: java.io.IOException -> L3c
        L3c:
            r2.close()     // Catch: java.io.IOException -> L65
            r1 = r3
            goto L65
        L41:
            r6 = move-exception
            r2 = r0
            goto L34
        L44:
            r2 = r0
            goto L5b
        L46:
            r6 = r0
            r2 = r6
            goto L5b
        L49:
            r6 = move-exception
            r2 = r0
            goto L50
        L4c:
            r6 = r0
            r7 = r6
            r2 = r7
            goto L5b
        L50:
            if (r0 == 0) goto L55
            r0.close()     // Catch: java.io.IOException -> L55
        L55:
            if (r2 == 0) goto L5a
            r2.close()     // Catch: java.io.IOException -> L5a
        L5a:
            throw r6
        L5b:
            if (r7 == 0) goto L60
            r7.close()     // Catch: java.io.IOException -> L60
        L60:
            if (r2 == 0) goto L65
            r2.close()     // Catch: java.io.IOException -> L65
        L65:
            if (r1 == 0) goto L6e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            java.lang.String r0 = r6.getPath()
        L6e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.wb2.f(android.content.Context, android.net.Uri):java.lang.String");
    }

    public final String g(Context context, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String strE = e(context, uri);
        return strE == null ? f(context, uri) : strE;
    }

    public final boolean h(Uri uri) {
        return Intrinsics.areEqual("com.android.providers.downloads.documents", uri.getAuthority());
    }

    public final boolean i(Uri uri) {
        return Intrinsics.areEqual("com.android.externalstorage.documents", uri.getAuthority());
    }

    public final boolean j(Uri uri) {
        return Intrinsics.areEqual("com.google.android.apps.photos.content", uri.getAuthority());
    }

    public final boolean k(Uri uri) {
        return Intrinsics.areEqual("com.android.providers.media.documents", uri.getAuthority());
    }
}
