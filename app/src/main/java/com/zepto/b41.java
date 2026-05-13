package com.zepto;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.util.Log;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class b41 {
    public static final Cursor a(Cursor c) {
        Intrinsics.checkNotNullParameter(c, "c");
        try {
            MatrixCursor matrixCursor = new MatrixCursor(c.getColumnNames(), c.getCount());
            while (c.moveToNext()) {
                Object[] objArr = new Object[c.getColumnCount()];
                int columnCount = c.getColumnCount();
                for (int i = 0; i < columnCount; i++) {
                    int type = c.getType(i);
                    if (type == 0) {
                        objArr[i] = null;
                    } else if (type == 1) {
                        objArr[i] = Long.valueOf(c.getLong(i));
                    } else if (type == 2) {
                        objArr[i] = Double.valueOf(c.getDouble(i));
                    } else if (type == 3) {
                        objArr[i] = c.getString(i);
                    } else {
                        if (type != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i] = c.getBlob(i);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            CloseableKt.closeFinally(c, null);
            return matrixCursor;
        } finally {
        }
    }

    public static final int b(Cursor cursor, String str) {
        return -1;
    }

    public static final int c(Cursor c, String name) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int columnIndex = c.getColumnIndex(name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c.getColumnIndex('`' + name + '`');
        return columnIndex2 >= 0 ? columnIndex2 : b(c, name);
    }

    public static final int d(Cursor c, String name) {
        String strJoinToString$default;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int iC = c(c, name);
        if (iC >= 0) {
            return iC;
        }
        try {
            String[] columnNames = c.getColumnNames();
            Intrinsics.checkNotNullExpressionValue(columnNames, "c.columnNames");
            strJoinToString$default = ArraysKt___ArraysKt.joinToString$default(columnNames, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            strJoinToString$default = "unknown";
        }
        throw new IllegalArgumentException("column '" + name + "' does not exist. Available columns: " + strJoinToString$default);
    }
}
