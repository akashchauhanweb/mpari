package com.zepto;

import android.database.Cursor;
import com.zepto.jc6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class kc6 {
    public static final Map a(n96 n96Var, String str) {
        Cursor cursorR0 = n96Var.r0("PRAGMA table_info(`" + str + "`)");
        try {
            if (cursorR0.getColumnCount() <= 0) {
                Map mapEmptyMap = MapsKt__MapsKt.emptyMap();
                CloseableKt.closeFinally(cursorR0, null);
                return mapEmptyMap;
            }
            int columnIndex = cursorR0.getColumnIndex("name");
            int columnIndex2 = cursorR0.getColumnIndex("type");
            int columnIndex3 = cursorR0.getColumnIndex("notnull");
            int columnIndex4 = cursorR0.getColumnIndex("pk");
            int columnIndex5 = cursorR0.getColumnIndex("dflt_value");
            Map mapCreateMapBuilder = MapsKt__MapsJVMKt.createMapBuilder();
            while (cursorR0.moveToNext()) {
                String name = cursorR0.getString(columnIndex);
                String type = cursorR0.getString(columnIndex2);
                boolean z = cursorR0.getInt(columnIndex3) != 0;
                int i = cursorR0.getInt(columnIndex4);
                String string = cursorR0.getString(columnIndex5);
                Intrinsics.checkNotNullExpressionValue(name, "name");
                Intrinsics.checkNotNullExpressionValue(type, "type");
                mapCreateMapBuilder.put(name, new jc6.a(name, type, z, i, string, 2));
            }
            Map mapBuild = MapsKt__MapsJVMKt.build(mapCreateMapBuilder);
            CloseableKt.closeFinally(cursorR0, null);
            return mapBuild;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(cursorR0, th);
                throw th2;
            }
        }
    }

    public static final List b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        List listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i2 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(toColumnIndex)");
            listCreateListBuilder.add(new jc6.d(i, i2, string, string2));
        }
        return CollectionsKt___CollectionsKt.sorted(CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder));
    }

    public static final Set c(n96 n96Var, String str) {
        Cursor cursorR0 = n96Var.r0("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = cursorR0.getColumnIndex("id");
            int columnIndex2 = cursorR0.getColumnIndex("seq");
            int columnIndex3 = cursorR0.getColumnIndex("table");
            int columnIndex4 = cursorR0.getColumnIndex("on_delete");
            int columnIndex5 = cursorR0.getColumnIndex("on_update");
            List listB = b(cursorR0);
            cursorR0.moveToPosition(-1);
            Set setCreateSetBuilder = SetsKt__SetsJVMKt.createSetBuilder();
            while (cursorR0.moveToNext()) {
                if (cursorR0.getInt(columnIndex2) == 0) {
                    int i = cursorR0.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<jc6.d> arrayList3 = new ArrayList();
                    for (Object obj : listB) {
                        if (((jc6.d) obj).c() == i) {
                            arrayList3.add(obj);
                        }
                    }
                    for (jc6.d dVar : arrayList3) {
                        arrayList.add(dVar.b());
                        arrayList2.add(dVar.d());
                    }
                    String string = cursorR0.getString(columnIndex3);
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(tableColumnIndex)");
                    String string2 = cursorR0.getString(columnIndex4);
                    Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = cursorR0.getString(columnIndex5);
                    Intrinsics.checkNotNullExpressionValue(string3, "cursor.getString(onUpdateColumnIndex)");
                    setCreateSetBuilder.add(new jc6.c(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set setBuild = SetsKt__SetsJVMKt.build(setCreateSetBuilder);
            CloseableKt.closeFinally(cursorR0, null);
            return setBuild;
        } finally {
        }
    }

    public static final jc6.e d(n96 n96Var, String str, boolean z) {
        Cursor cursorR0 = n96Var.r0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorR0.getColumnIndex("seqno");
            int columnIndex2 = cursorR0.getColumnIndex("cid");
            int columnIndex3 = cursorR0.getColumnIndex("name");
            int columnIndex4 = cursorR0.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorR0.moveToNext()) {
                    if (cursorR0.getInt(columnIndex2) >= 0) {
                        int i = cursorR0.getInt(columnIndex);
                        String columnName = cursorR0.getString(columnIndex3);
                        String str2 = cursorR0.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i);
                        Intrinsics.checkNotNullExpressionValue(columnName, "columnName");
                        treeMap.put(numValueOf, columnName);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "columnsMap.values");
                List list = CollectionsKt___CollectionsKt.toList(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues2, "ordersMap.values");
                jc6.e eVar = new jc6.e(str, z, list, CollectionsKt___CollectionsKt.toList(collectionValues2));
                CloseableKt.closeFinally(cursorR0, null);
                return eVar;
            }
            CloseableKt.closeFinally(cursorR0, null);
            return null;
        } finally {
        }
    }

    public static final Set e(n96 n96Var, String str) {
        Cursor cursorR0 = n96Var.r0("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = cursorR0.getColumnIndex("name");
            int columnIndex2 = cursorR0.getColumnIndex("origin");
            int columnIndex3 = cursorR0.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                Set setCreateSetBuilder = SetsKt__SetsJVMKt.createSetBuilder();
                while (cursorR0.moveToNext()) {
                    if (Intrinsics.areEqual("c", cursorR0.getString(columnIndex2))) {
                        String name = cursorR0.getString(columnIndex);
                        boolean z = true;
                        if (cursorR0.getInt(columnIndex3) != 1) {
                            z = false;
                        }
                        Intrinsics.checkNotNullExpressionValue(name, "name");
                        jc6.e eVarD = d(n96Var, name, z);
                        if (eVarD == null) {
                            CloseableKt.closeFinally(cursorR0, null);
                            return null;
                        }
                        setCreateSetBuilder.add(eVarD);
                    }
                }
                Set setBuild = SetsKt__SetsJVMKt.build(setCreateSetBuilder);
                CloseableKt.closeFinally(cursorR0, null);
                return setBuild;
            }
            CloseableKt.closeFinally(cursorR0, null);
            return null;
        } finally {
        }
    }

    public static final jc6 f(n96 database, String tableName) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        return new jc6(tableName, a(database, tableName), c(database, tableName), e(database, tableName));
    }
}
