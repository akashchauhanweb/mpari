package com.zepto;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kp5 extends SQLiteOpenHelper {
    public static final String f = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";
    public static int g = 5;
    public static final a h;
    public static final a i;
    public static final a j;
    public static final a k;
    public static final a l;
    public static final List m;
    public final int c;
    public boolean e;

    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() { // from class: com.zepto.fp5
            @Override // com.zepto.kp5.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                kp5.B(sQLiteDatabase);
            }
        };
        h = aVar;
        a aVar2 = new a() { // from class: com.zepto.gp5
            @Override // com.zepto.kp5.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                kp5.D(sQLiteDatabase);
            }
        };
        i = aVar2;
        a aVar3 = new a() { // from class: com.zepto.hp5
            @Override // com.zepto.kp5.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        j = aVar3;
        a aVar4 = new a() { // from class: com.zepto.ip5
            @Override // com.zepto.kp5.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                kp5.U(sQLiteDatabase);
            }
        };
        k = aVar4;
        a aVar5 = new a() { // from class: com.zepto.jp5
            @Override // com.zepto.kp5.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                kp5.d0(sQLiteDatabase);
            }
        };
        l = aVar5;
        m = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public kp5(Context context, String str, int i2) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i2);
        this.e = false;
        this.c = i2;
    }

    public static /* synthetic */ void B(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    public static /* synthetic */ void D(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    public static /* synthetic */ void U(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    public static /* synthetic */ void d0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f);
    }

    public final void e0(SQLiteDatabase sQLiteDatabase, int i2) {
        w(sQLiteDatabase);
        k0(sQLiteDatabase, 0, i2);
    }

    public final void k0(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        List list = m;
        if (i3 <= list.size()) {
            while (i2 < i3) {
                ((a) m.get(i2)).a(sQLiteDatabase);
                i2++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i2 + " to " + i3 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.e = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        e0(sQLiteDatabase, this.c);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        e0(sQLiteDatabase, i3);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        w(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        w(sQLiteDatabase);
        k0(sQLiteDatabase, i2, i3);
    }

    public final void w(SQLiteDatabase sQLiteDatabase) {
        if (this.e) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }
}
