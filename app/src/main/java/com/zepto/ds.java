package com.zepto;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ds implements ke1 {
    public final SQLiteDatabase a;

    public ds(Context context) {
        this.a = new vd1(context).getWritableDatabase();
    }

    @Override // com.zepto.ke1
    public void a(int i, long j, long j2) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("downloaded_bytes", Long.valueOf(j));
            contentValues.put("last_modified_at", Long.valueOf(j2));
            this.a.update("prdownloader", contentValues, "id = ? ", new String[]{String.valueOf(i)});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.zepto.cw1] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // com.zepto.ke1
    public cw1 b(int i) throws Throwable {
        cw1 cw1Var;
        ?? r0 = 0;
        r0 = 0;
        r0 = 0;
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = this.a.rawQuery("SELECT * FROM prdownloader WHERE id = " + i, null);
                if (cursorRawQuery != null) {
                    try {
                        try {
                            if (cursorRawQuery.moveToFirst()) {
                                cw1Var = new cw1();
                                try {
                                    cw1Var.m(i);
                                    cw1Var.p(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("url")));
                                    cw1Var.k(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("etag")));
                                    cw1Var.i(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("dir_path")));
                                    cw1Var.l(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("file_name")));
                                    cw1Var.o(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("total_bytes")));
                                    cw1Var.j(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("downloaded_bytes")));
                                    cw1Var.n(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("last_modified_at")));
                                    r0 = cw1Var;
                                } catch (Exception e) {
                                    e = e;
                                    cursor = cursorRawQuery;
                                    e.printStackTrace();
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    r0 = cw1Var;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            r0 = cursorRawQuery;
                            if (r0 != 0) {
                                r0.close();
                            }
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        cw1Var = null;
                    }
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (Exception e3) {
                e = e3;
                cw1Var = null;
            }
            return r0;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.zepto.ke1
    public List c(int i) {
        ArrayList arrayList = new ArrayList();
        long j = ((long) (i * 86400)) * 1000;
        Cursor cursorRawQuery = null;
        try {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis() - j;
                cursorRawQuery = this.a.rawQuery("SELECT * FROM prdownloader WHERE last_modified_at <= " + jCurrentTimeMillis, null);
                if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
                    do {
                        cw1 cw1Var = new cw1();
                        cw1Var.m(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("id")));
                        cw1Var.p(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("url")));
                        cw1Var.k(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("etag")));
                        cw1Var.i(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("dir_path")));
                        cw1Var.l(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("file_name")));
                        cw1Var.o(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("total_bytes")));
                        cw1Var.j(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("downloaded_bytes")));
                        cw1Var.n(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("last_modified_at")));
                        arrayList.add(cw1Var);
                    } while (cursorRawQuery.moveToNext());
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (cursorRawQuery != null) {
                }
            }
            return arrayList;
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
    }

    @Override // com.zepto.ke1
    public void d(cw1 cw1Var) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(cw1Var.e()));
            contentValues.put("url", cw1Var.h());
            contentValues.put("etag", cw1Var.c());
            contentValues.put("dir_path", cw1Var.a());
            contentValues.put("file_name", cw1Var.d());
            contentValues.put("total_bytes", Long.valueOf(cw1Var.g()));
            contentValues.put("downloaded_bytes", Long.valueOf(cw1Var.b()));
            contentValues.put("last_modified_at", Long.valueOf(cw1Var.f()));
            this.a.insert("prdownloader", null, contentValues);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.zepto.ke1
    public void remove(int i) {
        try {
            this.a.execSQL("DELETE FROM prdownloader WHERE id = " + i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
