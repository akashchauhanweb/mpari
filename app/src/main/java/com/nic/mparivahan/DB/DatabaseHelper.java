package com.nic.mparivahan.DB;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.nic.mparivahan.APIConstant;
import com.nic.mparivahan.APIController;
import com.nic.mparivahan.Dl.Model.DLDocument;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.RC.Model.Document;
import com.nic.mparivahan.RC.Model.NrvDetails;
import com.nic.mparivahan.RC.Model.RecentSearch;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class DatabaseHelper extends SQLiteOpenHelper {
    public static DatabaseHelper e;
    public static SQLiteDatabase f;
    public Context c;

    public DatabaseHelper(Context context) {
        super(context, APIController.a().MParivahanDB(), (SQLiteDatabase.CursorFactory) null, 31);
        this.c = context;
        e = this;
    }

    public static DatabaseHelper D0(Context context) {
        if (e == null) {
            e = new DatabaseHelper(context);
            M0();
        }
        return e;
    }

    public static void M0() {
        if (f == null) {
            f = e.getWritableDatabase();
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0064: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:14:0x0064 */
    public ArrayList A0() throws Throwable {
        SQLiteDatabase readableDatabase;
        Cursor cursorQuery;
        Cursor cursor;
        Gson gson;
        Cursor cursor2 = null;
        try {
            try {
                readableDatabase = getReadableDatabase();
            } catch (Exception e2) {
                e = e2;
                cursorQuery = null;
                readableDatabase = null;
            } catch (Throwable th) {
                th = th;
                readableDatabase = null;
            }
            try {
                gson = new Gson();
                cursorQuery = readableDatabase.query("DL_DETAILS_TABLE", new String[]{"DL_ID", "DL_DETAILS", "DL_DOC_Id", "DL_DOB"}, null, null, null, null, null, null);
            } catch (Exception e3) {
                e = e3;
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor2 != null && !cursor2.isClosed()) {
                    cursor2.close();
                }
                if (readableDatabase != null) {
                    readableDatabase.close();
                }
                throw th;
            }
            try {
                if (cursorQuery.getCount() <= 0) {
                    if (!cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                    readableDatabase.close();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                if (cursorQuery.moveToLast()) {
                    DldetobjX dldetobjX = null;
                    do {
                        String string = cursorQuery.getString(0);
                        byte[] blob = cursorQuery.getBlob(1);
                        String string2 = cursorQuery.getString(3);
                        if (blob != null) {
                            dldetobjX = (DldetobjX) gson.fromJson(new String(blob), new TypeToken<DldetobjX>() { // from class: com.nic.mparivahan.DB.DatabaseHelper.9
                            }.getType());
                        }
                        arrayList.add(new DLDocument(string, dldetobjX, string2));
                    } while (cursorQuery.moveToNext());
                }
                if (!cursorQuery.isClosed()) {
                    cursorQuery.close();
                }
                readableDatabase.close();
                return arrayList;
            } catch (Exception e4) {
                e = e4;
                e.printStackTrace();
                if (cursorQuery != null && !cursorQuery.isClosed()) {
                    cursorQuery.close();
                }
                if (readableDatabase != null) {
                    readableDatabase.close();
                }
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor2 = cursor;
        }
    }

    public ArrayList B() throws Throwable {
        Cursor cursorRawQuery;
        Throwable th;
        SQLiteDatabase readableDatabase;
        try {
            readableDatabase = getReadableDatabase();
            try {
                cursorRawQuery = readableDatabase.rawQuery(APIConstant.a().setrcDetTable1(), null);
            } catch (Exception e2) {
                e = e2;
                cursorRawQuery = null;
            } catch (Throwable th2) {
                cursorRawQuery = null;
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
            readableDatabase = null;
            cursorRawQuery = null;
        } catch (Throwable th3) {
            cursorRawQuery = null;
            th = th3;
            readableDatabase = null;
        }
        if (cursorRawQuery == null) {
            if (cursorRawQuery != null && !cursorRawQuery.isClosed()) {
                cursorRawQuery.close();
            }
            readableDatabase.close();
            return null;
        }
        try {
            try {
                if (cursorRawQuery.getCount() <= 0) {
                    if (!cursorRawQuery.isClosed()) {
                        cursorRawQuery.close();
                    }
                    readableDatabase.close();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                Gson gson = new Gson();
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        String string = cursorRawQuery.getString(0);
                        byte[] blob = cursorRawQuery.getBlob(1);
                        if (blob != null) {
                            NrvDetails nrvDetails = (NrvDetails) gson.fromJson(new String(blob), new TypeToken<NrvDetails>() { // from class: com.nic.mparivahan.DB.DatabaseHelper.6
                            }.getType());
                            if (e(nrvDetails) || j(nrvDetails) || w(nrvDetails)) {
                                arrayList.add(new Document(nrvDetails, string));
                            }
                        }
                    } while (cursorRawQuery.moveToNext());
                }
                if (!cursorRawQuery.isClosed()) {
                    cursorRawQuery.close();
                }
                readableDatabase.close();
                return arrayList;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e4) {
            e = e4;
            e.printStackTrace();
            if (cursorRawQuery != null && !cursorRawQuery.isClosed()) {
                cursorRawQuery.close();
            }
            if (readableDatabase != null) {
                readableDatabase.close();
            }
            return null;
        }
        th = th4;
        if (cursorRawQuery != null && !cursorRawQuery.isClosed()) {
            cursorRawQuery.close();
        }
        if (readableDatabase != null) {
            readableDatabase.close();
        }
        throw th;
    }

    public String B0(String str) throws Throwable {
        SQLiteDatabase readableDatabase;
        Throwable th;
        Cursor cursorQuery;
        try {
            readableDatabase = getReadableDatabase();
            try {
                cursorQuery = readableDatabase.query("DL_DETAILS_TABLE", new String[]{"DL_ID", "DL_DOC_Id"}, "DL_ID=?", new String[]{String.valueOf(str)}, null, null, null, null);
            } catch (Exception e2) {
                e = e2;
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
                cursorQuery = null;
            }
        } catch (Exception e3) {
            e = e3;
            cursorQuery = null;
            readableDatabase = null;
        } catch (Throwable th3) {
            readableDatabase = null;
            th = th3;
            cursorQuery = null;
        }
        if (cursorQuery == null) {
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            readableDatabase.close();
            return "0";
        }
        try {
            try {
                if (cursorQuery.getCount() <= 0) {
                    if (!cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                    readableDatabase.close();
                    return "0";
                }
                cursorQuery.moveToFirst();
                String string = cursorQuery.getString(1);
                if (string != null) {
                    if (!cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                    readableDatabase.close();
                    return string;
                }
                if (!cursorQuery.isClosed()) {
                    cursorQuery.close();
                }
                readableDatabase.close();
                return "0";
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e4) {
            e = e4;
            e.printStackTrace();
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            if (readableDatabase != null) {
                readableDatabase.close();
            }
            return null;
        }
        th = th4;
        if (cursorQuery != null && !cursorQuery.isClosed()) {
            cursorQuery.close();
        }
        if (readableDatabase != null) {
            readableDatabase.close();
        }
        throw th;
    }

    public String C0(String str) throws Throwable {
        SQLiteDatabase readableDatabase;
        Throwable th;
        Cursor cursorQuery;
        try {
            readableDatabase = getReadableDatabase();
            try {
                cursorQuery = readableDatabase.query("RC_DETAILS_TABLE", new String[]{"RC_ID", "RC_DOC_Id"}, "RC_ID=?", new String[]{str.trim()}, null, null, null, null);
            } catch (Exception e2) {
                e = e2;
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
                cursorQuery = null;
            }
        } catch (Exception e3) {
            e = e3;
            cursorQuery = null;
            readableDatabase = null;
        } catch (Throwable th3) {
            readableDatabase = null;
            th = th3;
            cursorQuery = null;
        }
        if (cursorQuery == null) {
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            readableDatabase.close();
            return "0";
        }
        try {
            try {
                if (cursorQuery.getCount() <= 0) {
                    if (!cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                    readableDatabase.close();
                    return "0";
                }
                cursorQuery.moveToFirst();
                String string = cursorQuery.getString(1);
                if (!cursorQuery.isClosed()) {
                    cursorQuery.close();
                }
                readableDatabase.close();
                return string;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e4) {
            e = e4;
            e.printStackTrace();
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            if (readableDatabase != null) {
                readableDatabase.close();
            }
            return null;
        }
        th = th4;
        if (cursorQuery != null && !cursorQuery.isClosed()) {
            cursorQuery.close();
        }
        if (readableDatabase != null) {
            readableDatabase.close();
        }
        throw th;
    }

    public ArrayList D() throws Throwable {
        Cursor cursorRawQuery;
        Throwable th;
        SQLiteDatabase readableDatabase;
        try {
            readableDatabase = getReadableDatabase();
            try {
                cursorRawQuery = readableDatabase.rawQuery(APIConstant.a().setrcDetTable1(), null);
            } catch (Exception e2) {
                e = e2;
                cursorRawQuery = null;
            } catch (Throwable th2) {
                cursorRawQuery = null;
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
            readableDatabase = null;
            cursorRawQuery = null;
        } catch (Throwable th3) {
            cursorRawQuery = null;
            th = th3;
            readableDatabase = null;
        }
        if (cursorRawQuery == null) {
            if (cursorRawQuery != null && !cursorRawQuery.isClosed()) {
                cursorRawQuery.close();
            }
            readableDatabase.close();
            return null;
        }
        try {
            try {
                if (cursorRawQuery.getCount() <= 0) {
                    if (!cursorRawQuery.isClosed()) {
                        cursorRawQuery.close();
                    }
                    readableDatabase.close();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                Gson gson = new Gson();
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        String string = cursorRawQuery.getString(0);
                        byte[] blob = cursorRawQuery.getBlob(1);
                        if (blob != null) {
                            NrvDetails nrvDetails = (NrvDetails) gson.fromJson(new String(blob), new TypeToken<NrvDetails>() { // from class: com.nic.mparivahan.DB.DatabaseHelper.7
                            }.getType());
                            if (e(nrvDetails) || j(nrvDetails) || w(nrvDetails) || m(nrvDetails) || n(nrvDetails)) {
                                arrayList.add(new Document(nrvDetails, string));
                            }
                        }
                    } while (cursorRawQuery.moveToNext());
                }
                if (!cursorRawQuery.isClosed()) {
                    cursorRawQuery.close();
                }
                readableDatabase.close();
                return arrayList;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e4) {
            e = e4;
            e.printStackTrace();
            if (cursorRawQuery != null && !cursorRawQuery.isClosed()) {
                cursorRawQuery.close();
            }
            if (readableDatabase != null) {
                readableDatabase.close();
            }
            return null;
        }
        th = th4;
        if (cursorRawQuery != null && !cursorRawQuery.isClosed()) {
            cursorRawQuery.close();
        }
        if (readableDatabase != null) {
            readableDatabase.close();
        }
        throw th;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int E0() throws java.lang.Throwable {
        /*
            r4 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.getReadableDatabase()     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L22
            com.nic.mparivahan.APIConstant r2 = com.nic.mparivahan.APIConstant.a()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            java.lang.String r2 = r2.rcId()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            android.database.Cursor r0 = r1.rawQuery(r2, r0)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            int r0 = r0.getCount()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            r1.close()
            return r0
        L19:
            r0 = move-exception
            goto L30
        L1b:
            r0 = move-exception
            goto L26
        L1d:
            r1 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
            goto L30
        L22:
            r1 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
        L26:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L2e
            r1.close()
        L2e:
            r0 = 0
            return r0
        L30:
            if (r1 == 0) goto L35
            r1.close()
        L35:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DB.DatabaseHelper.E0():int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r15v9 */
    public NrvDetails F0(String str) throws Throwable {
        SQLiteDatabase readableDatabase;
        Throwable th;
        ?? r15;
        Cursor cursorQuery;
        try {
            try {
                readableDatabase = getReadableDatabase();
            } catch (CursorIndexOutOfBoundsException e2) {
                e = e2;
                cursorQuery = null;
                readableDatabase = null;
            } catch (Exception e3) {
                e = e3;
                cursorQuery = null;
                readableDatabase = null;
            } catch (Throwable th2) {
                readableDatabase = null;
                th = th2;
                r15 = 0;
            }
            try {
                Gson gson = new Gson();
                cursorQuery = readableDatabase.query("RC_DETAILS_TABLE", new String[]{"RC_ID", "RC_DETAILS"}, "RC_ID=?", new String[]{String.valueOf(str)}, null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        cursorQuery.moveToFirst();
                    } catch (CursorIndexOutOfBoundsException e4) {
                        e = e4;
                        e.printStackTrace();
                        if (cursorQuery != null && !cursorQuery.isClosed()) {
                            cursorQuery.close();
                        }
                        if (readableDatabase != null) {
                            readableDatabase.close();
                        }
                        return null;
                    } catch (Exception e5) {
                        e = e5;
                        e.printStackTrace();
                        if (cursorQuery != null && !cursorQuery.isClosed()) {
                            cursorQuery.close();
                        }
                        if (readableDatabase != null) {
                            readableDatabase.close();
                        }
                        return null;
                    }
                }
                byte[] blob = cursorQuery.getBlob(1);
                NrvDetails nrvDetails = blob != null ? (NrvDetails) gson.fromJson(new String(blob), new TypeToken<NrvDetails>() { // from class: com.nic.mparivahan.DB.DatabaseHelper.1
                }.getType()) : null;
                if (!cursorQuery.isClosed()) {
                    cursorQuery.close();
                }
                readableDatabase.close();
                return nrvDetails;
            } catch (CursorIndexOutOfBoundsException e6) {
                e = e6;
                cursorQuery = null;
            } catch (Exception e7) {
                e = e7;
                cursorQuery = null;
            } catch (Throwable th3) {
                th = th3;
                r15 = 0;
                if (r15 != 0 && !r15.isClosed()) {
                    r15.close();
                }
                if (readableDatabase != null) {
                    readableDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            r15 = str;
        }
    }

    public ArrayList G0() throws Throwable {
        Cursor cursor;
        Throwable th;
        SQLiteDatabase readableDatabase;
        Cursor cursorRawQuery;
        ArrayList arrayList = null;
        try {
            try {
                readableDatabase = getReadableDatabase();
                try {
                    cursorRawQuery = readableDatabase.rawQuery(APIConstant.a().getRCList(), null);
                    if (cursorRawQuery != null) {
                        try {
                            Gson gson = new Gson();
                            ArrayList arrayList2 = new ArrayList();
                            if (cursorRawQuery.moveToFirst()) {
                                do {
                                    byte[] blob = cursorRawQuery.getBlob(1);
                                    if (blob != null) {
                                        arrayList2.add((NrvDetails) gson.fromJson(new String(blob), new TypeToken<NrvDetails>() { // from class: com.nic.mparivahan.DB.DatabaseHelper.2
                                        }.getType()));
                                    }
                                } while (cursorRawQuery.moveToNext());
                            }
                            arrayList = arrayList2;
                        } catch (Exception e2) {
                            e = e2;
                            e.printStackTrace();
                            if (cursorRawQuery != null && !cursorRawQuery.isClosed()) {
                                cursorRawQuery.close();
                            }
                            if (readableDatabase != null) {
                                readableDatabase.close();
                            }
                            return null;
                        }
                    }
                    if (cursorRawQuery != null && !cursorRawQuery.isClosed()) {
                        cursorRawQuery.close();
                    }
                    readableDatabase.close();
                    return arrayList;
                } catch (Exception e3) {
                    e = e3;
                    cursorRawQuery = null;
                } catch (Throwable th2) {
                    cursor = null;
                    th = th2;
                    if (cursor != null && !cursor.isClosed()) {
                        cursor.close();
                    }
                    if (readableDatabase != null) {
                        readableDatabase.close();
                    }
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                readableDatabase = null;
                cursorRawQuery = null;
            } catch (Throwable th3) {
                cursor = null;
                th = th3;
                readableDatabase = null;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public ArrayList H0() throws Throwable {
        Cursor cursor;
        Throwable th;
        SQLiteDatabase readableDatabase;
        Cursor cursorRawQuery;
        ArrayList arrayList = null;
        try {
            try {
                readableDatabase = getReadableDatabase();
            } catch (Exception e2) {
                e = e2;
                readableDatabase = null;
                cursorRawQuery = null;
            } catch (Throwable th2) {
                cursor = null;
                th = th2;
                readableDatabase = null;
            }
            try {
                cursorRawQuery = readableDatabase.rawQuery(APIConstant.a().setrcDetTable(), null);
                if (cursorRawQuery != null) {
                    try {
                        Gson gson = new Gson();
                        ArrayList arrayList2 = new ArrayList();
                        if (cursorRawQuery.moveToFirst()) {
                            NrvDetails nrvDetails = null;
                            do {
                                String string = cursorRawQuery.getString(0);
                                byte[] blob = cursorRawQuery.getBlob(1);
                                if (blob != null) {
                                    nrvDetails = (NrvDetails) gson.fromJson(new String(blob), new TypeToken<NrvDetails>() { // from class: com.nic.mparivahan.DB.DatabaseHelper.5
                                    }.getType());
                                }
                                arrayList2.add(new Document(nrvDetails, string));
                            } while (cursorRawQuery.moveToNext());
                        }
                        arrayList = arrayList2;
                    } catch (Exception e3) {
                        e = e3;
                        e.printStackTrace();
                        if (cursorRawQuery != null && !cursorRawQuery.isClosed()) {
                            cursorRawQuery.close();
                        }
                        if (readableDatabase != null) {
                            readableDatabase.close();
                        }
                        return null;
                    }
                }
                if (cursorRawQuery != null && !cursorRawQuery.isClosed()) {
                    cursorRawQuery.close();
                }
                readableDatabase.close();
                return arrayList;
            } catch (Exception e4) {
                e = e4;
                cursorRawQuery = null;
            } catch (Throwable th3) {
                cursor = null;
                th = th3;
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
                if (readableDatabase != null) {
                    readableDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public ArrayList I0(String str) {
        ArrayList arrayList = null;
        try {
            try {
                SQLiteDatabase readableDatabase = getReadableDatabase();
                f = readableDatabase;
                Cursor cursorRawQuery = readableDatabase.rawQuery(APIConstant.a().getRecentList() + " = '" + str + "' ORDER BY ID DESC limit 5;", null);
                if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
                    ArrayList arrayList2 = new ArrayList();
                    do {
                        RecentSearch recentSearch = new RecentSearch();
                        recentSearch.setSearchNumber(cursorRawQuery.getString(0));
                        recentSearch.setSearchUserName(cursorRawQuery.getString(1));
                        recentSearch.setDriverImage(cursorRawQuery.getString(2));
                        arrayList2.add(recentSearch);
                    } while (cursorRawQuery.moveToNext());
                    arrayList = arrayList2;
                }
                SQLiteDatabase sQLiteDatabase = f;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                return arrayList;
            } catch (Exception e2) {
                e2.printStackTrace();
                SQLiteDatabase sQLiteDatabase2 = f;
                if (sQLiteDatabase2 != null) {
                    sQLiteDatabase2.close();
                }
                return null;
            }
        } catch (Throwable th) {
            SQLiteDatabase sQLiteDatabase3 = f;
            if (sQLiteDatabase3 != null) {
                sQLiteDatabase3.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.nic.mparivahan.RC.Model.NrvDetails J0(java.lang.String r7) throws java.lang.Throwable {
        /*
            r6 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r6.getReadableDatabase()     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L77
            r2.<init>()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L77
            com.nic.mparivahan.APIConstant r3 = com.nic.mparivahan.APIConstant.a()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L77
            java.lang.String r3 = r3.rcDetTable()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L77
            r2.append(r3)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L77
            java.lang.String r3 = "RC_ID"
            r2.append(r3)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L77
            java.lang.String r3 = " ='"
            r2.append(r3)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L77
            r2.append(r7)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L77
            java.lang.String r7 = "'"
            r2.append(r7)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L77
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L77
            android.database.Cursor r7 = r1.rawQuery(r7, r0)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L77
            if (r7 == 0) goto L63
            com.google.gson.Gson r2 = new com.google.gson.Gson     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            r2.<init>()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            boolean r3 = r7.moveToFirst()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            if (r3 == 0) goto L63
        L3c:
            r3 = 1
            byte[] r3 = r7.getBlob(r3)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            if (r3 == 0) goto L5d
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            com.nic.mparivahan.DB.DatabaseHelper$4 r3 = new com.nic.mparivahan.DB.DatabaseHelper$4     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            r3.<init>()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            java.lang.reflect.Type r3 = r3.getType()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            java.lang.Object r3 = r2.fromJson(r4, r3)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            com.nic.mparivahan.RC.Model.NrvDetails r3 = (com.nic.mparivahan.RC.Model.NrvDetails) r3     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            r0 = r3
            goto L5d
        L59:
            r0 = move-exception
            goto L96
        L5b:
            r2 = move-exception
            goto L82
        L5d:
            boolean r3 = r7.moveToNext()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            if (r3 != 0) goto L3c
        L63:
            if (r7 == 0) goto L6e
            boolean r2 = r7.isClosed()
            if (r2 != 0) goto L6e
            r7.close()
        L6e:
            r1.close()
            return r0
        L72:
            r7 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
            goto L96
        L77:
            r2 = move-exception
            r7 = r0
            goto L82
        L7a:
            r7 = move-exception
            r1 = r0
            r0 = r7
            r7 = r1
            goto L96
        L7f:
            r2 = move-exception
            r7 = r0
            r1 = r7
        L82:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L59
            if (r7 == 0) goto L90
            boolean r2 = r7.isClosed()
            if (r2 != 0) goto L90
            r7.close()
        L90:
            if (r1 == 0) goto L95
            r1.close()
        L95:
            return r0
        L96:
            if (r7 == 0) goto La1
            boolean r2 = r7.isClosed()
            if (r2 != 0) goto La1
            r7.close()
        La1:
            if (r1 == 0) goto La6
            r1.close()
        La6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DB.DatabaseHelper.J0(java.lang.String):com.nic.mparivahan.RC.Model.NrvDetails");
    }

    public int K0(Date date, Date date2) {
        try {
            long time = date.getTime();
            long time2 = date2.getTime();
            return (int) ((time > time2 ? time - time2 : time2 - time) / 86400000);
        } catch (Exception unused) {
            return 0;
        }
    }

    public boolean L0(String str) {
        return str.equals(null) || str.equals("null") || str.equals(" ") || str.equals("") || str.equalsIgnoreCase("NA") || str.isEmpty();
    }

    public int N0(String str, String str2, String str3) {
        SQLiteDatabase writableDatabase = null;
        try {
            try {
                writableDatabase = getWritableDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put("RECENT_SEARCH_TIME_STAMP", str2);
                contentValues.put("RECENT_SEARCH_USER_NAME", str3);
                int iUpdate = writableDatabase.update("RECENT_SEARCH_TABLE", contentValues, "RECENT_SEARCH_NUMBER=?", new String[]{String.valueOf(str)});
                writableDatabase.close();
                return iUpdate;
            } catch (Exception e2) {
                e2.printStackTrace();
                if (writableDatabase != null) {
                    writableDatabase.close();
                }
                return 0;
            }
        } catch (Throwable th) {
            if (writableDatabase != null) {
                writableDatabase.close();
            }
            throw th;
        }
    }

    public long O0(String str, DldetobjX dldetobjX, String str2, String str3) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                try {
                    try {
                        Gson gson = new Gson();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("DL_ID", str.trim());
                        contentValues.put("DL_DOC_Id", str2.trim());
                        if (str3 != null) {
                            contentValues.put("DL_DOB", str3.trim());
                        }
                        if (dldetobjX != null) {
                            contentValues.put("DL_DETAILS", gson.toJson(dldetobjX).getBytes());
                        }
                        try {
                            SQLiteDatabase readableDatabase = getReadableDatabase();
                            try {
                                Cursor cursorRawQuery = readableDatabase.rawQuery(APIConstant.a().dlDetails() + " ='" + str + "'", null);
                                if (cursorRawQuery == null) {
                                    long jInsert = readableDatabase.insert("DL_DETAILS_TABLE", null, contentValues);
                                    readableDatabase.close();
                                    return jInsert;
                                }
                                if (cursorRawQuery.getCount() > 0) {
                                    long jUpdate = readableDatabase.update("DL_DETAILS_TABLE", contentValues, "DL_ID=?", new String[]{str});
                                    readableDatabase.close();
                                    return jUpdate;
                                }
                                long jInsert2 = readableDatabase.insert("DL_DETAILS_TABLE", null, contentValues);
                                readableDatabase.close();
                                return jInsert2;
                            } catch (Exception e2) {
                                e = e2;
                                sQLiteDatabase = readableDatabase;
                                e.printStackTrace();
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                                return -1L;
                            } catch (Throwable th) {
                                th = th;
                                sQLiteDatabase = readableDatabase;
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            sQLiteDatabase = writableDatabase;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteDatabase = writableDatabase;
                    }
                } catch (Exception e4) {
                    e = e4;
                    sQLiteDatabase = writableDatabase;
                    e.printStackTrace();
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    return -1L;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    public int P(String str) {
        SQLiteDatabase readableDatabase = null;
        try {
            try {
                readableDatabase = getReadableDatabase();
                int count = readableDatabase.query("RECENT_SEARCH_TABLE", null, "RECENT_SEARCH_NUMBER=?", new String[]{String.valueOf(str)}, null, null, null, null).getCount();
                readableDatabase.close();
                return count;
            } catch (Exception e2) {
                e2.printStackTrace();
                if (readableDatabase != null) {
                    readableDatabase.close();
                }
                return 0;
            }
        } catch (Throwable th) {
            if (readableDatabase != null) {
                readableDatabase.close();
            }
            throw th;
        }
    }

    public long P0(String str, DldetobjX dldetobjX) throws Throwable {
        SQLiteDatabase writableDatabase;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                writableDatabase = getWritableDatabase();
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            try {
                Gson gson = new Gson();
                ContentValues contentValues = new ContentValues();
                contentValues.put("DL_ID", str.trim());
                contentValues.put("DL_DOB", dldetobjX.getBioObj().getBioDob());
                contentValues.put("DL_DETAILS", gson.toJson(dldetobjX).getBytes());
                try {
                    SQLiteDatabase readableDatabase = getReadableDatabase();
                    try {
                        Cursor cursorRawQuery = readableDatabase.rawQuery(APIConstant.a().dlSelQuery() + " ='" + str + "'", null);
                        if (cursorRawQuery == null) {
                            long jInsert = readableDatabase.insert("DL_DETAILS_TABLE", null, contentValues);
                            readableDatabase.close();
                            return jInsert;
                        }
                        if (cursorRawQuery.getCount() > 0) {
                            long jUpdate = readableDatabase.update("DL_DETAILS_TABLE", contentValues, "DL_ID=?", new String[]{str});
                            readableDatabase.close();
                            return jUpdate;
                        }
                        long jInsert2 = readableDatabase.insert("DL_DETAILS_TABLE", null, contentValues);
                        readableDatabase.close();
                        return jInsert2;
                    } catch (Exception e3) {
                        e = e3;
                        sQLiteDatabase = readableDatabase;
                        e.printStackTrace();
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                        return -1L;
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteDatabase = readableDatabase;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                        throw th;
                    }
                } catch (Exception e4) {
                    e = e4;
                    sQLiteDatabase = writableDatabase;
                }
            } catch (Throwable th3) {
                th = th3;
                sQLiteDatabase = writableDatabase;
            }
        } catch (Exception e5) {
            e = e5;
            sQLiteDatabase = writableDatabase;
            e.printStackTrace();
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            return -1L;
        }
    }

    public long Q0(String str, DldetobjX dldetobjX, String str2, String str3) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                try {
                    try {
                        Gson gson = new Gson();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("DL_ID", str.trim());
                        contentValues.put("DL_DOC_Id", str2.trim());
                        if (str3 != null) {
                            contentValues.put("DL_DOB", str3.trim());
                        }
                        if (dldetobjX != null) {
                            contentValues.put("DL_DETAILS", gson.toJson(dldetobjX).getBytes());
                        }
                        try {
                            SQLiteDatabase readableDatabase = getReadableDatabase();
                            try {
                                Cursor cursorRawQuery = readableDatabase.rawQuery(APIConstant.a().dlDetTable() + "DL_DOC_Id ='" + str2 + "'", null);
                                if (cursorRawQuery == null) {
                                    long jInsert = readableDatabase.insert("DL_DETAILS_TABLE", null, contentValues);
                                    readableDatabase.close();
                                    return jInsert;
                                }
                                if (cursorRawQuery.getCount() > 0) {
                                    long jUpdate = readableDatabase.update("DL_DETAILS_TABLE", contentValues, "DL_DOC_Id=?", new String[]{str2});
                                    readableDatabase.close();
                                    return jUpdate;
                                }
                                long jInsert2 = readableDatabase.insert("DL_DETAILS_TABLE", null, contentValues);
                                readableDatabase.close();
                                return jInsert2;
                            } catch (Exception e2) {
                                e = e2;
                                sQLiteDatabase = readableDatabase;
                                e.printStackTrace();
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                                return -1L;
                            } catch (Throwable th) {
                                sQLiteDatabase = readableDatabase;
                                th = th;
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            sQLiteDatabase = writableDatabase;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteDatabase = writableDatabase;
                    }
                } catch (Exception e4) {
                    e = e4;
                    sQLiteDatabase = writableDatabase;
                    e.printStackTrace();
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    return -1L;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    public long R0(String str, String str2, NrvDetails nrvDetails, int i) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                try {
                    try {
                        Gson gson = new Gson();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("RC_ID", str);
                        contentValues.put("RC_DOC_Id", str2);
                        if (nrvDetails != null) {
                            contentValues.put("RC_DETAILS", gson.toJson(nrvDetails).getBytes());
                        }
                        contentValues.put("RC_STATUS", Integer.valueOf(i));
                        try {
                            SQLiteDatabase readableDatabase = getReadableDatabase();
                            try {
                                Cursor cursorRawQuery = readableDatabase.rawQuery(APIConstant.a().rcQuery() + "RC_ID ='" + str + "'", null);
                                if (cursorRawQuery == null) {
                                    long jInsert = readableDatabase.insert("RC_DETAILS_TABLE", null, contentValues);
                                    readableDatabase.close();
                                    return jInsert;
                                }
                                if (cursorRawQuery.getCount() > 0) {
                                    long jUpdate = readableDatabase.update("RC_DETAILS_TABLE", contentValues, "RC_ID=?", new String[]{String.valueOf(str)});
                                    readableDatabase.close();
                                    return jUpdate;
                                }
                                long jInsert2 = readableDatabase.insert("RC_DETAILS_TABLE", null, contentValues);
                                readableDatabase.close();
                                return jInsert2;
                            } catch (Exception e2) {
                                e = e2;
                                sQLiteDatabase = readableDatabase;
                                e.printStackTrace();
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                                return -1L;
                            } catch (Throwable th) {
                                th = th;
                                sQLiteDatabase = readableDatabase;
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            sQLiteDatabase = writableDatabase;
                        }
                    } catch (SQLiteConstraintException e4) {
                        e = e4;
                        sQLiteDatabase = writableDatabase;
                        e.printStackTrace();
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                        return -1L;
                    } catch (Exception e5) {
                        e = e5;
                        sQLiteDatabase = writableDatabase;
                        Toast.makeText(this.c, e.getMessage(), 0).show();
                        e.printStackTrace();
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                        return -1L;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase = writableDatabase;
                }
            } catch (SQLiteConstraintException e6) {
                e = e6;
            } catch (Exception e7) {
                e = e7;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[PHI: r0
      0x0050: PHI (r0v4 android.database.sqlite.SQLiteDatabase) = (r0v3 android.database.sqlite.SQLiteDatabase), (r0v5 android.database.sqlite.SQLiteDatabase) binds: [B:16:0x004e, B:20:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void S0(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) throws java.lang.Throwable {
        /*
            r4 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.getWritableDatabase()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c android.database.sqlite.SQLiteConstraintException -> L54
            com.google.gson.Gson r2 = new com.google.gson.Gson     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34 android.database.sqlite.SQLiteConstraintException -> L37
            r2.<init>()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34 android.database.sqlite.SQLiteConstraintException -> L37
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34 android.database.sqlite.SQLiteConstraintException -> L37
            r2.<init>()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34 android.database.sqlite.SQLiteConstraintException -> L37
            java.lang.String r3 = "RECENT_SEARCH_NUMBER"
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34 android.database.sqlite.SQLiteConstraintException -> L37
            java.lang.String r5 = "RECENT_SEARCH_USER_NAME"
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34 android.database.sqlite.SQLiteConstraintException -> L37
            java.lang.String r5 = "RECENT_SEARCH_TYPE"
            r2.put(r5, r7)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34 android.database.sqlite.SQLiteConstraintException -> L37
            java.lang.String r5 = "RECENT_SEARCH_TIME_STAMP"
            r2.put(r5, r8)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34 android.database.sqlite.SQLiteConstraintException -> L37
            java.lang.String r5 = "RECENT_SEARCH_IMAGE"
            r2.put(r5, r9)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34 android.database.sqlite.SQLiteConstraintException -> L37
            java.lang.String r5 = "RECENT_SEARCH_TABLE"
            r1.insert(r5, r0, r2)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L34 android.database.sqlite.SQLiteConstraintException -> L37
            r1.close()
            goto L5b
        L31:
            r5 = move-exception
            r0 = r1
            goto L5c
        L34:
            r5 = move-exception
            r0 = r1
            goto L3d
        L37:
            r5 = move-exception
            r0 = r1
            goto L55
        L3a:
            r5 = move-exception
            goto L5c
        L3c:
            r5 = move-exception
        L3d:
            android.content.Context r6 = r4.c     // Catch: java.lang.Throwable -> L3a
            java.lang.String r7 = r5.getMessage()     // Catch: java.lang.Throwable -> L3a
            r8 = 0
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r7, r8)     // Catch: java.lang.Throwable -> L3a
            r6.show()     // Catch: java.lang.Throwable -> L3a
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L5b
        L50:
            r0.close()
            goto L5b
        L54:
            r5 = move-exception
        L55:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L5b
            goto L50
        L5b:
            return
        L5c:
            if (r0 == 0) goto L61
            r0.close()
        L61:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DB.DatabaseHelper.S0(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public long T0(String str, DldetobjX dldetobjX) throws Throwable {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                try {
                    try {
                        Gson gson = new Gson();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("DL_ID", str);
                        if (dldetobjX != null) {
                            contentValues.put("DL_DETAILS", gson.toJson(dldetobjX).getBytes());
                        }
                        try {
                            SQLiteDatabase readableDatabase = getReadableDatabase();
                            try {
                                Cursor cursorRawQuery = readableDatabase.rawQuery(APIConstant.a().dlDetTable() + "DL_ID ='" + str + "'", null);
                                if (cursorRawQuery == null) {
                                    long jInsert = readableDatabase.insert("DL_DETAILS_TABLE", null, contentValues);
                                    readableDatabase.close();
                                    return jInsert;
                                }
                                if (cursorRawQuery.getCount() > 0) {
                                    long jUpdate = readableDatabase.update("DL_DETAILS_TABLE", contentValues, "DL_ID=?", new String[]{String.valueOf(str)});
                                    readableDatabase.close();
                                    return jUpdate;
                                }
                                long jInsert2 = readableDatabase.insert("DL_DETAILS_TABLE", null, contentValues);
                                Log.v("DL_DETAILS_TABLE", "Count : " + jInsert2);
                                readableDatabase.close();
                                return jInsert2;
                            } catch (Exception e2) {
                                e = e2;
                                sQLiteDatabase = readableDatabase;
                                e.printStackTrace();
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                                return -1L;
                            } catch (Throwable th) {
                                th = th;
                                sQLiteDatabase = readableDatabase;
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            sQLiteDatabase = writableDatabase;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteDatabase = writableDatabase;
                    }
                } catch (Exception e4) {
                    e = e4;
                    sQLiteDatabase = writableDatabase;
                    e.printStackTrace();
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    return -1L;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    public boolean U(String str) {
        try {
            Date date = new Date();
            Date date2 = new SimpleDateFormat("dd-MMM-yyyy").parse(str);
            if (date2.before(date)) {
                return true;
            }
            if (date2.after(date)) {
                if (K0(date2, date) < 30) {
                    return true;
                }
            }
            return false;
        } catch (ParseException e2) {
            e2.printStackTrace();
            return false;
        } catch (Exception e3) {
            e3.printStackTrace();
            return false;
        }
    }

    public int U0(String str, NrvDetails nrvDetails) {
        SQLiteDatabase writableDatabase = null;
        try {
            try {
                writableDatabase = getWritableDatabase();
                Gson gson = new Gson();
                ContentValues contentValues = new ContentValues();
                contentValues.put("RC_DETAILS", gson.toJson(nrvDetails).getBytes());
                int iUpdate = writableDatabase.update("RC_DETAILS_TABLE", contentValues, "RC_ID=?", new String[]{String.valueOf(str)});
                writableDatabase.close();
                return iUpdate;
            } catch (Exception e2) {
                e2.printStackTrace();
                if (writableDatabase != null) {
                    writableDatabase.close();
                }
                return 0;
            }
        } catch (Throwable th) {
            if (writableDatabase != null) {
                writableDatabase.close();
            }
            throw th;
        }
    }

    public long d(String str, NrvDetails nrvDetails, int i) throws Throwable {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                try {
                    try {
                        Gson gson = new Gson();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("RC_ID", str);
                        if (nrvDetails != null) {
                            contentValues.put("RC_DETAILS", gson.toJson(nrvDetails).getBytes());
                        }
                        contentValues.put("RC_STATUS", Integer.valueOf(i));
                        try {
                            SQLiteDatabase readableDatabase = getReadableDatabase();
                            try {
                                Cursor cursorRawQuery = readableDatabase.rawQuery(APIConstant.a().rcDetail20() + "RC_ID ='" + str + "'", null);
                                if (cursorRawQuery == null) {
                                    long jInsert = readableDatabase.insert("RC_DETAILS_TABLE", null, contentValues);
                                    readableDatabase.close();
                                    return jInsert;
                                }
                                if (cursorRawQuery.getCount() > 0) {
                                    long jUpdate = readableDatabase.update("RC_DETAILS_TABLE", contentValues, "RC_ID=?", new String[]{String.valueOf(str)});
                                    readableDatabase.close();
                                    return jUpdate;
                                }
                                long jInsert2 = readableDatabase.insert("RC_DETAILS_TABLE", null, contentValues);
                                readableDatabase.close();
                                return jInsert2;
                            } catch (Exception e2) {
                                e = e2;
                                sQLiteDatabase = readableDatabase;
                                e.printStackTrace();
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                                return -1L;
                            } catch (Throwable th) {
                                th = th;
                                sQLiteDatabase = readableDatabase;
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            sQLiteDatabase = writableDatabase;
                        }
                    } catch (SQLiteConstraintException e4) {
                        e = e4;
                        sQLiteDatabase = writableDatabase;
                        e.printStackTrace();
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                        return -1L;
                    } catch (Exception e5) {
                        e = e5;
                        sQLiteDatabase = writableDatabase;
                        Toast.makeText(this.c, e.getMessage(), 0).show();
                        e.printStackTrace();
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                        return -1L;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase = writableDatabase;
                }
            } catch (SQLiteConstraintException e6) {
                e = e6;
            } catch (Exception e7) {
                e = e7;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void d0(String str) {
        SQLiteDatabase writableDatabase = null;
        try {
            try {
                writableDatabase = getWritableDatabase();
                writableDatabase.delete("RECENT_SEARCH_TABLE", "RECENT_SEARCH_NUMBER = ?", new String[]{str});
                writableDatabase.close();
            } catch (Exception e2) {
                e2.printStackTrace();
                if (writableDatabase == null) {
                    return;
                }
            }
            writableDatabase.close();
        } catch (Throwable th) {
            if (writableDatabase != null) {
                writableDatabase.close();
            }
            throw th;
        }
    }

    public boolean e(NrvDetails nrvDetails) {
        try {
            return U(nrvDetails.getRc_insurance_upto().trim());
        } catch (Exception unused) {
            return false;
        }
    }

    public void e0() {
        SQLiteDatabase writableDatabase = null;
        try {
            try {
                writableDatabase = getWritableDatabase();
                writableDatabase.execSQL(APIConstant.a().dlDetailsTable());
                writableDatabase.execSQL(APIConstant.a().dlTable());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } finally {
            writableDatabase.close();
        }
    }

    public boolean j(NrvDetails nrvDetails) {
        try {
            return U(nrvDetails.getRc_tax_upto().trim());
        } catch (Exception unused) {
            return false;
        }
    }

    public void k0() {
        SQLiteDatabase writableDatabase = null;
        try {
            try {
                writableDatabase = getWritableDatabase();
                writableDatabase.execSQL(APIConstant.a().dropDlTable());
                writableDatabase.execSQL(APIConstant.a().rcTable());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } finally {
            writableDatabase.close();
        }
    }

    public boolean m(NrvDetails nrvDetails) {
        try {
            if (L0(nrvDetails.getRc_np_upto())) {
                return false;
            }
            return U(nrvDetails.getRc_np_upto().trim());
        } catch (Exception unused) {
            return false;
        }
    }

    public void m0() {
        SQLiteDatabase writableDatabase = null;
        try {
            try {
                writableDatabase = getWritableDatabase();
                writableDatabase.execSQL(APIConstant.a().dropDlTable());
                writableDatabase.execSQL(APIConstant.a().rcDropShareTable());
                writableDatabase.execSQL(APIConstant.a().dlDetailsTable());
                writableDatabase.execSQL(APIConstant.a().rcRecenTable());
                writableDatabase.execSQL(APIConstant.a().rcTable());
                writableDatabase.execSQL(APIConstant.a().dlTable());
                writableDatabase.execSQL(APIConstant.a().rcShareTable());
                writableDatabase.execSQL(APIConstant.a().recentSearchTable());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } finally {
            writableDatabase.close();
        }
    }

    public boolean n(NrvDetails nrvDetails) {
        try {
            if (L0(nrvDetails.getRc_permit_valid_upto())) {
                return false;
            }
            return U(nrvDetails.getRc_permit_valid_upto().trim());
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(APIConstant.a().rcTable());
        sQLiteDatabase.execSQL(APIConstant.a().dlTable());
        sQLiteDatabase.execSQL(APIConstant.a().rcShareTable());
        sQLiteDatabase.execSQL(APIConstant.a().recentSearchTable());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL(APIConstant.a().dropDlTable());
        sQLiteDatabase.execSQL(APIConstant.a().rcDropShareTable());
        sQLiteDatabase.execSQL(APIConstant.a().dlDetailsTable());
        sQLiteDatabase.execSQL(APIConstant.a().rcRecenTable());
        onCreate(sQLiteDatabase);
    }

    public void p0(String str) {
        SQLiteDatabase writableDatabase = null;
        try {
            try {
                writableDatabase = getWritableDatabase();
                writableDatabase.delete("RC_DETAILS_TABLE", "RC_ID = ?", new String[]{str});
                writableDatabase.close();
            } catch (Exception e2) {
                e2.printStackTrace();
                if (writableDatabase == null) {
                    return;
                }
            }
            writableDatabase.close();
        } catch (Throwable th) {
            if (writableDatabase != null) {
                writableDatabase.close();
            }
            throw th;
        }
    }

    public boolean w(NrvDetails nrvDetails) {
        try {
            return U(nrvDetails.getRc_pucc_upto().trim());
        } catch (Exception unused) {
            return false;
        }
    }

    public void x0(String str, String str2) {
        SQLiteDatabase writableDatabase = null;
        try {
            try {
                writableDatabase = getWritableDatabase();
                writableDatabase.delete("RECENT_SEARCH_TABLE", "RECENT_SEARCH_NUMBER = ? and RECENT_SEARCH_TYPE = ?", new String[]{str, str2});
                writableDatabase.close();
            } catch (Exception e2) {
                e2.printStackTrace();
                if (writableDatabase == null) {
                    return;
                }
            }
            writableDatabase.close();
        } catch (Throwable th) {
            if (writableDatabase != null) {
                writableDatabase.close();
            }
            throw th;
        }
    }

    public DldetobjX y0() throws Throwable {
        SQLiteDatabase readableDatabase;
        Throwable th;
        Cursor cursorQuery;
        Gson gson;
        DldetobjX dldetobjX = null;
        try {
            readableDatabase = getReadableDatabase();
            try {
                gson = new Gson();
                cursorQuery = readableDatabase.query("DL_DETAILS_TABLE", new String[]{"DL_ID", "DL_DETAILS"}, null, null, null, null, null, null);
            } catch (Exception e2) {
                e = e2;
                cursorQuery = null;
            } catch (Throwable th2) {
                cursorQuery = null;
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
            cursorQuery = null;
            readableDatabase = null;
        } catch (Throwable th3) {
            readableDatabase = null;
            th = th3;
            cursorQuery = null;
        }
        try {
            try {
                if (cursorQuery.getCount() <= 0) {
                    if (!cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                    readableDatabase.close();
                    return null;
                }
                if (cursorQuery.moveToLast()) {
                    DldetobjX dldetobjX2 = null;
                    do {
                        byte[] blob = cursorQuery.getBlob(1);
                        if (blob != null) {
                            dldetobjX2 = (DldetobjX) gson.fromJson(new String(blob), new TypeToken<DldetobjX>() { // from class: com.nic.mparivahan.DB.DatabaseHelper.3
                            }.getType());
                        }
                    } while (cursorQuery.moveToNext());
                    dldetobjX = dldetobjX2;
                }
                if (!cursorQuery.isClosed()) {
                    cursorQuery.close();
                }
                readableDatabase.close();
                return dldetobjX;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e4) {
            e = e4;
            Log.e("Count-->Exception ", "null");
            e.printStackTrace();
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            if (readableDatabase != null) {
                readableDatabase.close();
            }
            return null;
        }
        th = th4;
        if (cursorQuery != null && !cursorQuery.isClosed()) {
            cursorQuery.close();
        }
        if (readableDatabase != null) {
            readableDatabase.close();
        }
        throw th;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0064: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:14:0x0064 */
    public ArrayList z0() throws Throwable {
        SQLiteDatabase readableDatabase;
        Cursor cursorQuery;
        Cursor cursor;
        Gson gson;
        Cursor cursor2 = null;
        try {
            try {
                readableDatabase = getReadableDatabase();
            } catch (Exception e2) {
                e = e2;
                cursorQuery = null;
                readableDatabase = null;
            } catch (Throwable th) {
                th = th;
                readableDatabase = null;
            }
            try {
                gson = new Gson();
                cursorQuery = readableDatabase.query("DL_DETAILS_TABLE", new String[]{"DL_ID", "DL_DETAILS", "DL_DOC_Id", "DL_DOB"}, null, null, null, null, null, null);
            } catch (Exception e3) {
                e = e3;
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor2 != null && !cursor2.isClosed()) {
                    cursor2.close();
                }
                if (readableDatabase != null) {
                    readableDatabase.close();
                }
                throw th;
            }
            try {
                if (cursorQuery.getCount() <= 0) {
                    if (!cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                    readableDatabase.close();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                if (cursorQuery.moveToLast()) {
                    DldetobjX dldetobjX = null;
                    do {
                        String string = cursorQuery.getString(0);
                        byte[] blob = cursorQuery.getBlob(1);
                        String string2 = cursorQuery.getString(3);
                        if (blob != null) {
                            dldetobjX = (DldetobjX) gson.fromJson(new String(blob), new TypeToken<DldetobjX>() { // from class: com.nic.mparivahan.DB.DatabaseHelper.8
                            }.getType());
                        }
                        if (string2 == null) {
                            if (!cursorQuery.isClosed()) {
                                cursorQuery.close();
                            }
                            readableDatabase.close();
                            return null;
                        }
                        arrayList.add(new DLDocument(string, dldetobjX, string2));
                    } while (cursorQuery.moveToNext());
                }
                if (!cursorQuery.isClosed()) {
                    cursorQuery.close();
                }
                readableDatabase.close();
                return arrayList;
            } catch (Exception e4) {
                e = e4;
                e.printStackTrace();
                if (cursorQuery != null && !cursorQuery.isClosed()) {
                    cursorQuery.close();
                }
                if (readableDatabase != null) {
                    readableDatabase.close();
                }
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor2 = cursor;
        }
    }
}
