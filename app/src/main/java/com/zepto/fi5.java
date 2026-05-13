package com.zepto;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.zepto.jn3;
import com.zepto.sq0;
import com.zepto.u42;
import com.zepto.w96;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class fi5 implements d52, w96, oq0 {
    public static final c22 i = c22.b("proto");
    public final kp5 c;
    public final uq0 e;
    public final uq0 f;
    public final e52 g;
    public final lx4 h;

    public interface b {
        Object a(Object obj);
    }

    public static class c {
        public final String a;
        public final String b;

        public c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    public interface d {
        Object a();
    }

    public fi5(uq0 uq0Var, uq0 uq0Var2, e52 e52Var, kp5 kp5Var, lx4 lx4Var) {
        this.c = kp5Var;
        this.e = uq0Var;
        this.f = uq0Var2;
        this.g = e52Var;
        this.h = lx4Var;
    }

    public static c22 D1(String str) {
        return str == null ? i : c22.b(str);
    }

    public static String E1(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((fr4) it.next()).c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object F1(Cursor cursor, b bVar) {
        try {
            return bVar.a(cursor);
        } finally {
            cursor.close();
        }
    }

    public static /* synthetic */ Object a1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public static /* synthetic */ Object b1(Throwable th) {
        throw new v96("Timed out while trying to acquire the lock.", th);
    }

    public static /* synthetic */ SQLiteDatabase c1(Throwable th) {
        throw new v96("Timed out while trying to open db.", th);
    }

    public static /* synthetic */ Long d1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static /* synthetic */ ag6 e1(long j, Cursor cursor) {
        cursor.moveToNext();
        return ag6.c().c(cursor.getLong(0)).b(j).a();
    }

    public static /* synthetic */ ag6 f1(final long j, SQLiteDatabase sQLiteDatabase) {
        return (ag6) F1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: com.zepto.wh5
            @Override // com.zepto.fi5.b
            public final Object a(Object obj) {
                return fi5.e1(j, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Long g1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    public static /* synthetic */ List i1(SQLiteDatabase sQLiteDatabase) {
        return (List) F1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: com.zepto.ci5
            @Override // com.zepto.fi5.b
            public final Object a(Object obj) {
                return fi5.j1((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ List j1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(qn6.a().b(cursor.getString(1)).d(pv4.b(cursor.getInt(2))).c(z1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    public static /* synthetic */ Object o1(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j), hashSet);
            }
            hashSet.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    public static /* synthetic */ byte[] q1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            byte[] bArr2 = (byte[]) arrayList.get(i2);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    public static /* synthetic */ Boolean t1(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    public static /* synthetic */ Object u1(String str, jn3.b bVar, long j, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) F1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.a())}), new b() { // from class: com.zepto.mh5
            @Override // com.zepto.fi5.b
            public final Object a(Object obj) {
                return fi5.t1((Cursor) obj);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.a())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.a()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    public static /* synthetic */ Object v1(long j, qn6 qn6Var, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{qn6Var.b(), String.valueOf(pv4.a(qn6Var.d()))}) < 1) {
            contentValues.put("backend_name", qn6Var.b());
            contentValues.put("priority", Integer.valueOf(pv4.a(qn6Var.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public static byte[] z1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    @Override // com.zepto.d52
    public void A(final qn6 qn6Var, final long j) {
        V0(new b() { // from class: com.zepto.fh5
            @Override // com.zepto.fi5.b
            public final Object a(Object obj) {
                return fi5.v1(j, qn6Var, (SQLiteDatabase) obj);
            }
        });
    }

    public final void A1(sq0.a aVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            aVar.a(mn3.c().c((String) entry.getKey()).b((List) entry.getValue()).a());
        }
    }

    public final byte[] B1(long j) {
        return (byte[]) F1(P0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), new b() { // from class: com.zepto.rh5
            @Override // com.zepto.fi5.b
            public final Object a(Object obj) {
                return fi5.q1((Cursor) obj);
            }
        });
    }

    public final Object C1(d dVar, b bVar) {
        long jA = this.f.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f.a() >= ((long) this.g.b()) + jA) {
                    return bVar.a(e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final jn3.b L0(int i2) {
        jn3.b bVar = jn3.b.REASON_UNKNOWN;
        if (i2 == bVar.a()) {
            return bVar;
        }
        jn3.b bVar2 = jn3.b.MESSAGE_TOO_OLD;
        if (i2 == bVar2.a()) {
            return bVar2;
        }
        jn3.b bVar3 = jn3.b.CACHE_FULL;
        if (i2 == bVar3.a()) {
            return bVar3;
        }
        jn3.b bVar4 = jn3.b.PAYLOAD_TOO_BIG;
        if (i2 == bVar4.a()) {
            return bVar4;
        }
        jn3.b bVar5 = jn3.b.MAX_RETRIES_REACHED;
        if (i2 == bVar5.a()) {
            return bVar5;
        }
        jn3.b bVar6 = jn3.b.INVALID_PAYLOD;
        if (i2 == bVar6.a()) {
            return bVar6;
        }
        jn3.b bVar7 = jn3.b.SERVER_ERROR;
        if (i2 == bVar7.a()) {
            return bVar7;
        }
        yn3.a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i2));
        return bVar;
    }

    @Override // com.zepto.d52
    public Iterable M(final qn6 qn6Var) {
        return (Iterable) V0(new b() { // from class: com.zepto.hh5
            @Override // com.zepto.fi5.b
            public final Object a(Object obj) {
                return this.a.k1(qn6Var, (SQLiteDatabase) obj);
            }
        });
    }

    public final void M0(final SQLiteDatabase sQLiteDatabase) {
        C1(new d() { // from class: com.zepto.zh5
            @Override // com.zepto.fi5.d
            public final Object a() {
                return fi5.a1(sQLiteDatabase);
            }
        }, new b() { // from class: com.zepto.ai5
            @Override // com.zepto.fi5.b
            public final Object a(Object obj) {
                return fi5.b1((Throwable) obj);
            }
        });
    }

    @Override // com.zepto.d52
    public Iterable N() {
        return (Iterable) V0(new b() { // from class: com.zepto.eh5
            @Override // com.zepto.fi5.b
            public final Object a(Object obj) {
                return fi5.i1((SQLiteDatabase) obj);
            }
        });
    }

    public final long N0(SQLiteDatabase sQLiteDatabase, qn6 qn6Var) {
        Long lU0 = U0(sQLiteDatabase, qn6Var);
        if (lU0 != null) {
            return lU0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", qn6Var.b());
        contentValues.put("priority", Integer.valueOf(pv4.a(qn6Var.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (qn6Var.c() != null) {
            contentValues.put("extras", Base64.encodeToString(qn6Var.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    public long O0() {
        return R0() * S0();
    }

    public SQLiteDatabase P0() {
        final kp5 kp5Var = this.c;
        Objects.requireNonNull(kp5Var);
        return (SQLiteDatabase) C1(new d() { // from class: com.zepto.ph5
            @Override // com.zepto.fi5.d
            public final Object a() {
                return kp5Var.getWritableDatabase();
            }
        }, new b() { // from class: com.zepto.xh5
            @Override // com.zepto.fi5.b
            public final Object a(Object obj) {
                return fi5.c1((Throwable) obj);
            }
        });
    }

    public final oj2 Q0() {
        return oj2.b().b(n76.c().b(O0()).c(e52.a.f()).a()).a();
    }

    public final long R0() {
        return P0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    public final long S0() {
        return P0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    public final ag6 T0() {
        final long jA = this.e.a();
        return (ag6) V0(new b() { // from class: com.zepto.vh5
            @Override // com.zepto.fi5.b
            public final Object a(Object obj) {
                return fi5.f1(jA, (SQLiteDatabase) obj);
            }
        });
    }

    public final Long U0(SQLiteDatabase sQLiteDatabase, qn6 qn6Var) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(qn6Var.b(), String.valueOf(pv4.a(qn6Var.d()))));
        if (qn6Var.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(qn6Var.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) F1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: com.zepto.uh5
            @Override // com.zepto.fi5.b
            public final Object a(Object obj) {
                return fi5.g1((Cursor) obj);
            }
        });
    }

    public Object V0(b bVar) {
        SQLiteDatabase sQLiteDatabaseP0 = P0();
        sQLiteDatabaseP0.beginTransaction();
        try {
            Object objA = bVar.a(sQLiteDatabaseP0);
            sQLiteDatabaseP0.setTransactionSuccessful();
            return objA;
        } finally {
            sQLiteDatabaseP0.endTransaction();
        }
    }

    public final boolean W0() {
        return R0() * S0() >= this.g.f();
    }

    public final List X0(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            fr4 fr4Var = (fr4) listIterator.next();
            if (map.containsKey(Long.valueOf(fr4Var.c()))) {
                u42.a aVarL = fr4Var.b().l();
                for (c cVar : (Set) map.get(Long.valueOf(fr4Var.c()))) {
                    aVarL.c(cVar.a, cVar.b);
                }
                listIterator.set(fr4.a(fr4Var.c(), fr4Var.d(), aVarL.d()));
            }
        }
        return list;
    }

    public final /* synthetic */ Object Y0(Cursor cursor) {
        while (cursor.moveToNext()) {
            d(cursor.getInt(0), jn3.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public final /* synthetic */ Integer Z0(long j, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j)};
        F1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: com.zepto.jh5
            @Override // com.zepto.fi5.b
            public final Object a(Object obj) {
                return this.a.Y0((Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.c.close();
    }

    @Override // com.zepto.oq0
    public void d(final long j, final jn3.b bVar, final String str) {
        V0(new b() { // from class: com.zepto.ei5
            @Override // com.zepto.fi5.b
            public final Object a(Object obj) {
                return fi5.u1(str, bVar, j, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.zepto.oq0
    public sq0 e() {
        final sq0.a aVarE = sq0.e();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (sq0) V0(new b() { // from class: com.zepto.lh5
            @Override // com.zepto.fi5.b
            public final Object a(Object obj) {
                return this.a.m1(str, map, aVarE, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.zepto.d52
    public void g0(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + E1(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            V0(new b() { // from class: com.zepto.ih5
                @Override // com.zepto.fi5.b
                public final Object a(Object obj) {
                    return this.a.s1(str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    @Override // com.zepto.d52
    public int h() {
        final long jA = this.e.a() - this.g.c();
        return ((Integer) V0(new b() { // from class: com.zepto.bi5
            @Override // com.zepto.fi5.b
            public final Object a(Object obj) {
                return this.a.Z0(jA, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    public final /* synthetic */ Boolean h1(qn6 qn6Var, SQLiteDatabase sQLiteDatabase) {
        Long lU0 = U0(sQLiteDatabase, qn6Var);
        return lU0 == null ? Boolean.FALSE : (Boolean) F1(P0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lU0.toString()}), new b() { // from class: com.zepto.qh5
            @Override // com.zepto.fi5.b
            public final Object a(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    @Override // com.zepto.d52
    public void i(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            P0().compileStatement("DELETE FROM events WHERE _id in " + E1(iterable)).execute();
        }
    }

    @Override // com.zepto.d52
    public long i0(qn6 qn6Var) {
        return ((Long) F1(P0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{qn6Var.b(), String.valueOf(pv4.a(qn6Var.d()))}), new b() { // from class: com.zepto.yh5
            @Override // com.zepto.fi5.b
            public final Object a(Object obj) {
                return fi5.d1((Cursor) obj);
            }
        })).longValue();
    }

    @Override // com.zepto.oq0
    public void j() {
        V0(new b() { // from class: com.zepto.gh5
            @Override // com.zepto.fi5.b
            public final Object a(Object obj) {
                return this.a.w1((SQLiteDatabase) obj);
            }
        });
    }

    public final /* synthetic */ List k1(qn6 qn6Var, SQLiteDatabase sQLiteDatabase) {
        List listX1 = x1(sQLiteDatabase, qn6Var, this.g.d());
        for (mv4 mv4Var : mv4.values()) {
            if (mv4Var != qn6Var.d()) {
                int iD = this.g.d() - listX1.size();
                if (iD <= 0) {
                    break;
                }
                listX1.addAll(x1(sQLiteDatabase, qn6Var.f(mv4Var), iD));
            }
        }
        return X0(listX1, y1(sQLiteDatabase, listX1));
    }

    public final /* synthetic */ sq0 l1(Map map, sq0.a aVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            jn3.b bVarL0 = L0(cursor.getInt(1));
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(jn3.c().c(bVarL0).b(j).a());
        }
        A1(aVar, map);
        aVar.e(T0());
        aVar.d(Q0());
        aVar.c((String) this.h.get());
        return aVar.b();
    }

    @Override // com.zepto.w96
    public Object m(w96.a aVar) {
        SQLiteDatabase sQLiteDatabaseP0 = P0();
        M0(sQLiteDatabaseP0);
        try {
            Object objExecute = aVar.execute();
            sQLiteDatabaseP0.setTransactionSuccessful();
            return objExecute;
        } finally {
            sQLiteDatabaseP0.endTransaction();
        }
    }

    public final /* synthetic */ sq0 m1(String str, final Map map, final sq0.a aVar, SQLiteDatabase sQLiteDatabase) {
        return (sq0) F1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: com.zepto.sh5
            @Override // com.zepto.fi5.b
            public final Object a(Object obj) {
                return this.a.l1(map, aVar, (Cursor) obj);
            }
        });
    }

    public final /* synthetic */ Object n1(List list, qn6 qn6Var, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            u42.a aVarK = u42.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z) {
                aVarK.h(new x12(D1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                aVarK.h(new x12(D1(cursor.getString(4)), B1(j)));
            }
            if (!cursor.isNull(6)) {
                aVarK.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(fr4.a(j, qn6Var, aVarK.d()));
        }
        return null;
    }

    public final /* synthetic */ Long p1(u42 u42Var, qn6 qn6Var, SQLiteDatabase sQLiteDatabase) {
        if (W0()) {
            d(1L, jn3.b.CACHE_FULL, u42Var.j());
            return -1L;
        }
        long jN0 = N0(sQLiteDatabase, qn6Var);
        int iE = this.g.e();
        byte[] bArrA = u42Var.e().a();
        boolean z = bArrA.length <= iE;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jN0));
        contentValues.put("transport_name", u42Var.j());
        contentValues.put("timestamp_ms", Long.valueOf(u42Var.f()));
        contentValues.put("uptime_ms", Long.valueOf(u42Var.k()));
        contentValues.put("payload_encoding", u42Var.e().b().a());
        contentValues.put("code", u42Var.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z));
        contentValues.put("payload", z ? bArrA : new byte[0]);
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z) {
            int iCeil = (int) Math.ceil(((double) bArrA.length) / ((double) iE));
            for (int i2 = 1; i2 <= iCeil; i2++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, (i2 - 1) * iE, Math.min(i2 * iE, bArrA.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i2));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : u42Var.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    public final /* synthetic */ Object r1(Cursor cursor) {
        while (cursor.moveToNext()) {
            d(cursor.getInt(0), jn3.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public final /* synthetic */ Object s1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        F1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: com.zepto.nh5
            @Override // com.zepto.fi5.b
            public final Object a(Object obj) {
                return this.a.r1((Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    @Override // com.zepto.d52
    public fr4 v(final qn6 qn6Var, final u42 u42Var) {
        yn3.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", qn6Var.d(), u42Var.j(), qn6Var.b());
        long jLongValue = ((Long) V0(new b() { // from class: com.zepto.th5
            @Override // com.zepto.fi5.b
            public final Object a(Object obj) {
                return this.a.p1(u42Var, qn6Var, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return fr4.a(jLongValue, qn6Var, u42Var);
    }

    @Override // com.zepto.d52
    public boolean w0(final qn6 qn6Var) {
        return ((Boolean) V0(new b() { // from class: com.zepto.di5
            @Override // com.zepto.fi5.b
            public final Object a(Object obj) {
                return this.a.h1(qn6Var, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    public final /* synthetic */ Object w1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.e.a()).execute();
        return null;
    }

    public final List x1(SQLiteDatabase sQLiteDatabase, final qn6 qn6Var, int i2) {
        final ArrayList arrayList = new ArrayList();
        Long lU0 = U0(sQLiteDatabase, qn6Var);
        if (lU0 == null) {
            return arrayList;
        }
        F1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lU0.toString()}, null, null, null, String.valueOf(i2)), new b() { // from class: com.zepto.oh5
            @Override // com.zepto.fi5.b
            public final Object a(Object obj) {
                return this.a.n1(arrayList, qn6Var, (Cursor) obj);
            }
        });
        return arrayList;
    }

    public final Map y1(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((fr4) list.get(i2)).c());
            if (i2 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        F1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new b() { // from class: com.zepto.kh5
            @Override // com.zepto.fi5.b
            public final Object a(Object obj) {
                return fi5.o1(map, (Cursor) obj);
            }
        });
        return map;
    }
}
