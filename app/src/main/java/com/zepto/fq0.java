package com.zepto;

import com.zepto.je5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class fq0 extends je5.b {
    public final xq0 a;

    public fq0(xq0 clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.a = clock;
    }

    @Override // com.zepto.je5.b
    public void c(n96 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        super.c(db);
        db.g();
        try {
            db.r(e());
            db.Y();
        } finally {
            db.f();
        }
    }

    public final long d() {
        return this.a.a() - ox7.a;
    }

    public final String e() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + d() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }
}
