package com.zepto;

import android.database.Cursor;
import com.zepto.yy7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class az7 implements zy7 {
    public final je5 a;
    public final u22 b;
    public final t22 c;
    public final f16 d;
    public final f16 e;
    public final f16 f;
    public final f16 g;
    public final f16 h;
    public final f16 i;
    public final f16 j;
    public final f16 k;
    public final f16 l;
    public final f16 m;
    public final f16 n;
    public final f16 o;
    public final f16 p;
    public final f16 q;
    public final f16 r;

    public class a extends f16 {
        public a(je5 je5Var) {
            super(je5Var);
        }

        @Override // com.zepto.f16
        public String e() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public class b extends f16 {
        public b(je5 je5Var) {
            super(je5Var);
        }

        @Override // com.zepto.f16
        public String e() {
            return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
        }
    }

    public class c extends f16 {
        public c(je5 je5Var) {
            super(je5Var);
        }

        @Override // com.zepto.f16
        public String e() {
            return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        }
    }

    public class d extends f16 {
        public d(je5 je5Var) {
            super(je5Var);
        }

        @Override // com.zepto.f16
        public String e() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    public class e extends f16 {
        public e(je5 je5Var) {
            super(je5Var);
        }

        @Override // com.zepto.f16
        public String e() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    public class f extends f16 {
        public f(je5 je5Var) {
            super(je5Var);
        }

        @Override // com.zepto.f16
        public String e() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public class g extends f16 {
        public g(je5 je5Var) {
            super(je5Var);
        }

        @Override // com.zepto.f16
        public String e() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    public class h extends f16 {
        public h(je5 je5Var) {
            super(je5Var);
        }

        @Override // com.zepto.f16
        public String e() {
            return "UPDATE workspec SET stop_reason=? WHERE id=?";
        }
    }

    public class i extends u22 {
        public i(je5 je5Var) {
            super(je5Var);
        }

        @Override // com.zepto.f16
        public String e() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // com.zepto.u22
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(r96 r96Var, yy7 yy7Var) throws Throwable {
            String str = yy7Var.a;
            if (str == null) {
                r96Var.C(1);
            } else {
                r96Var.s(1, str);
            }
            gz7 gz7Var = gz7.a;
            r96Var.X(2, gz7.j(yy7Var.b));
            String str2 = yy7Var.c;
            if (str2 == null) {
                r96Var.C(3);
            } else {
                r96Var.s(3, str2);
            }
            String str3 = yy7Var.d;
            if (str3 == null) {
                r96Var.C(4);
            } else {
                r96Var.s(4, str3);
            }
            byte[] bArrO = androidx.work.b.o(yy7Var.e);
            if (bArrO == null) {
                r96Var.C(5);
            } else {
                r96Var.f0(5, bArrO);
            }
            byte[] bArrO2 = androidx.work.b.o(yy7Var.f);
            if (bArrO2 == null) {
                r96Var.C(6);
            } else {
                r96Var.f0(6, bArrO2);
            }
            r96Var.X(7, yy7Var.g);
            r96Var.X(8, yy7Var.h);
            r96Var.X(9, yy7Var.i);
            r96Var.X(10, yy7Var.k);
            r96Var.X(11, gz7.a(yy7Var.l));
            r96Var.X(12, yy7Var.m);
            r96Var.X(13, yy7Var.n);
            r96Var.X(14, yy7Var.o);
            r96Var.X(15, yy7Var.p);
            r96Var.X(16, yy7Var.q ? 1L : 0L);
            r96Var.X(17, gz7.h(yy7Var.r));
            r96Var.X(18, yy7Var.g());
            r96Var.X(19, yy7Var.d());
            r96Var.X(20, yy7Var.e());
            r96Var.X(21, yy7Var.f());
            r96Var.X(22, yy7Var.h());
            lx0 lx0Var = yy7Var.j;
            if (lx0Var == null) {
                r96Var.C(23);
                r96Var.C(24);
                r96Var.C(25);
                r96Var.C(26);
                r96Var.C(27);
                r96Var.C(28);
                r96Var.C(29);
                r96Var.C(30);
                return;
            }
            r96Var.X(23, gz7.g(lx0Var.d()));
            r96Var.X(24, lx0Var.g() ? 1L : 0L);
            r96Var.X(25, lx0Var.h() ? 1L : 0L);
            r96Var.X(26, lx0Var.f() ? 1L : 0L);
            r96Var.X(27, lx0Var.i() ? 1L : 0L);
            r96Var.X(28, lx0Var.b());
            r96Var.X(29, lx0Var.a());
            byte[] bArrI = gz7.i(lx0Var.c());
            if (bArrI == null) {
                r96Var.C(30);
            } else {
                r96Var.f0(30, bArrI);
            }
        }
    }

    public class j extends t22 {
        public j(je5 je5Var) {
            super(je5Var);
        }

        @Override // com.zepto.f16
        public String e() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }
    }

    public class k extends f16 {
        public k(je5 je5Var) {
            super(je5Var);
        }

        @Override // com.zepto.f16
        public String e() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    public class l extends f16 {
        public l(je5 je5Var) {
            super(je5Var);
        }

        @Override // com.zepto.f16
        public String e() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    public class m extends f16 {
        public m(je5 je5Var) {
            super(je5Var);
        }

        @Override // com.zepto.f16
        public String e() {
            return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        }
    }

    public class n extends f16 {
        public n(je5 je5Var) {
            super(je5Var);
        }

        @Override // com.zepto.f16
        public String e() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    public class o extends f16 {
        public o(je5 je5Var) {
            super(je5Var);
        }

        @Override // com.zepto.f16
        public String e() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    public class p extends f16 {
        public p(je5 je5Var) {
            super(je5Var);
        }

        @Override // com.zepto.f16
        public String e() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    public class q extends f16 {
        public q(je5 je5Var) {
            super(je5Var);
        }

        @Override // com.zepto.f16
        public String e() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    public az7(je5 je5Var) {
        this.a = je5Var;
        this.b = new i(je5Var);
        this.c = new j(je5Var);
        this.d = new k(je5Var);
        this.e = new l(je5Var);
        this.f = new m(je5Var);
        this.g = new n(je5Var);
        this.h = new o(je5Var);
        this.i = new p(je5Var);
        this.j = new q(je5Var);
        this.k = new a(je5Var);
        this.l = new b(je5Var);
        this.m = new c(je5Var);
        this.n = new d(je5Var);
        this.o = new e(je5Var);
        this.p = new f(je5Var);
        this.q = new g(je5Var);
        this.r = new h(je5Var);
    }

    public static List A() {
        return Collections.emptyList();
    }

    @Override // com.zepto.zy7
    public void a(String str) {
        this.a.d();
        r96 r96VarB = this.d.b();
        if (str == null) {
            r96VarB.C(1);
        } else {
            r96VarB.s(1, str);
        }
        this.a.e();
        try {
            r96VarB.x();
            this.a.A();
        } finally {
            this.a.i();
            this.d.h(r96VarB);
        }
    }

    @Override // com.zepto.zy7
    public void b(String str, long j2) {
        this.a.d();
        r96 r96VarB = this.i.b();
        r96VarB.X(1, j2);
        if (str == null) {
            r96VarB.C(2);
        } else {
            r96VarB.s(2, str);
        }
        this.a.e();
        try {
            r96VarB.x();
            this.a.A();
        } finally {
            this.a.i();
            this.i.h(r96VarB);
        }
    }

    @Override // com.zepto.zy7
    public List c() throws Throwable {
        me5 me5Var;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        me5 me5VarJ = me5.j("SELECT * FROM workspec WHERE state=1", 0);
        this.a.d();
        Cursor cursorB = n41.b(this.a, me5VarJ, false, null);
        try {
            int iD = b41.d(cursorB, "id");
            int iD2 = b41.d(cursorB, "state");
            int iD3 = b41.d(cursorB, "worker_class_name");
            int iD4 = b41.d(cursorB, "input_merger_class_name");
            int iD5 = b41.d(cursorB, "input");
            int iD6 = b41.d(cursorB, "output");
            int iD7 = b41.d(cursorB, "initial_delay");
            int iD8 = b41.d(cursorB, "interval_duration");
            int iD9 = b41.d(cursorB, "flex_duration");
            int iD10 = b41.d(cursorB, "run_attempt_count");
            int iD11 = b41.d(cursorB, "backoff_policy");
            int iD12 = b41.d(cursorB, "backoff_delay_duration");
            int iD13 = b41.d(cursorB, "last_enqueue_time");
            int iD14 = b41.d(cursorB, "minimum_retention_duration");
            me5Var = me5VarJ;
            try {
                int iD15 = b41.d(cursorB, "schedule_requested_at");
                int iD16 = b41.d(cursorB, "run_in_foreground");
                int iD17 = b41.d(cursorB, "out_of_quota_policy");
                int iD18 = b41.d(cursorB, "period_count");
                int iD19 = b41.d(cursorB, "generation");
                int iD20 = b41.d(cursorB, "next_schedule_time_override");
                int iD21 = b41.d(cursorB, "next_schedule_time_override_generation");
                int iD22 = b41.d(cursorB, "stop_reason");
                int iD23 = b41.d(cursorB, "required_network_type");
                int iD24 = b41.d(cursorB, "requires_charging");
                int iD25 = b41.d(cursorB, "requires_device_idle");
                int iD26 = b41.d(cursorB, "requires_battery_not_low");
                int iD27 = b41.d(cursorB, "requires_storage_not_low");
                int iD28 = b41.d(cursorB, "trigger_content_update_delay");
                int iD29 = b41.d(cursorB, "trigger_max_content_delay");
                int iD30 = b41.d(cursorB, "content_uri_triggers");
                int i7 = iD14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string = cursorB.isNull(iD) ? null : cursorB.getString(iD);
                    by7 by7VarF = gz7.f(cursorB.getInt(iD2));
                    String string2 = cursorB.isNull(iD3) ? null : cursorB.getString(iD3);
                    String string3 = cursorB.isNull(iD4) ? null : cursorB.getString(iD4);
                    androidx.work.b bVarG = androidx.work.b.g(cursorB.isNull(iD5) ? null : cursorB.getBlob(iD5));
                    androidx.work.b bVarG2 = androidx.work.b.g(cursorB.isNull(iD6) ? null : cursorB.getBlob(iD6));
                    long j2 = cursorB.getLong(iD7);
                    long j3 = cursorB.getLong(iD8);
                    long j4 = cursorB.getLong(iD9);
                    int i8 = cursorB.getInt(iD10);
                    x30 x30VarC = gz7.c(cursorB.getInt(iD11));
                    long j5 = cursorB.getLong(iD12);
                    long j6 = cursorB.getLong(iD13);
                    int i9 = i7;
                    long j7 = cursorB.getLong(i9);
                    int i10 = iD;
                    int i11 = iD15;
                    long j8 = cursorB.getLong(i11);
                    iD15 = i11;
                    int i12 = iD16;
                    if (cursorB.getInt(i12) != 0) {
                        iD16 = i12;
                        i2 = iD17;
                        z = true;
                    } else {
                        iD16 = i12;
                        i2 = iD17;
                        z = false;
                    }
                    ij4 ij4VarE = gz7.e(cursorB.getInt(i2));
                    iD17 = i2;
                    int i13 = iD18;
                    int i14 = cursorB.getInt(i13);
                    iD18 = i13;
                    int i15 = iD19;
                    int i16 = cursorB.getInt(i15);
                    iD19 = i15;
                    int i17 = iD20;
                    long j9 = cursorB.getLong(i17);
                    iD20 = i17;
                    int i18 = iD21;
                    int i19 = cursorB.getInt(i18);
                    iD21 = i18;
                    int i20 = iD22;
                    int i21 = cursorB.getInt(i20);
                    iD22 = i20;
                    int i22 = iD23;
                    s44 s44VarD = gz7.d(cursorB.getInt(i22));
                    iD23 = i22;
                    int i23 = iD24;
                    if (cursorB.getInt(i23) != 0) {
                        iD24 = i23;
                        i3 = iD25;
                        z2 = true;
                    } else {
                        iD24 = i23;
                        i3 = iD25;
                        z2 = false;
                    }
                    if (cursorB.getInt(i3) != 0) {
                        iD25 = i3;
                        i4 = iD26;
                        z3 = true;
                    } else {
                        iD25 = i3;
                        i4 = iD26;
                        z3 = false;
                    }
                    if (cursorB.getInt(i4) != 0) {
                        iD26 = i4;
                        i5 = iD27;
                        z4 = true;
                    } else {
                        iD26 = i4;
                        i5 = iD27;
                        z4 = false;
                    }
                    if (cursorB.getInt(i5) != 0) {
                        iD27 = i5;
                        i6 = iD28;
                        z5 = true;
                    } else {
                        iD27 = i5;
                        i6 = iD28;
                        z5 = false;
                    }
                    long j10 = cursorB.getLong(i6);
                    iD28 = i6;
                    int i24 = iD29;
                    long j11 = cursorB.getLong(i24);
                    iD29 = i24;
                    int i25 = iD30;
                    iD30 = i25;
                    arrayList.add(new yy7(string, by7VarF, string2, string3, bVarG, bVarG2, j2, j3, j4, new lx0(s44VarD, z2, z3, z4, z5, j10, j11, gz7.b(cursorB.isNull(i25) ? null : cursorB.getBlob(i25))), i8, x30VarC, j5, j6, j7, j8, z, ij4VarE, i14, i16, j9, i19, i21));
                    iD = i10;
                    i7 = i9;
                }
                cursorB.close();
                me5Var.w();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorB.close();
                me5Var.w();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            me5Var = me5VarJ;
        }
    }

    @Override // com.zepto.zy7
    public void d(String str) {
        this.a.d();
        r96 r96VarB = this.g.b();
        if (str == null) {
            r96VarB.C(1);
        } else {
            r96VarB.s(1, str);
        }
        this.a.e();
        try {
            r96VarB.x();
            this.a.A();
        } finally {
            this.a.i();
            this.g.h(r96VarB);
        }
    }

    @Override // com.zepto.zy7
    public boolean e() {
        boolean z = false;
        me5 me5VarJ = me5.j("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.a.d();
        Cursor cursorB = n41.b(this.a, me5VarJ, false, null);
        try {
            if (cursorB.moveToFirst()) {
                if (cursorB.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            cursorB.close();
            me5VarJ.w();
        }
    }

    @Override // com.zepto.zy7
    public int f(String str, long j2) {
        this.a.d();
        r96 r96VarB = this.n.b();
        r96VarB.X(1, j2);
        if (str == null) {
            r96VarB.C(2);
        } else {
            r96VarB.s(2, str);
        }
        this.a.e();
        try {
            int iX = r96VarB.x();
            this.a.A();
            return iX;
        } finally {
            this.a.i();
            this.n.h(r96VarB);
        }
    }

    @Override // com.zepto.zy7
    public List g(String str) {
        me5 me5VarJ = me5.j("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            me5VarJ.C(1);
        } else {
            me5VarJ.s(1, str);
        }
        this.a.d();
        Cursor cursorB = n41.b(this.a, me5VarJ, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.isNull(0) ? null : cursorB.getString(0));
            }
            return arrayList;
        } finally {
            cursorB.close();
            me5VarJ.w();
        }
    }

    @Override // com.zepto.zy7
    public List h(String str) {
        me5 me5VarJ = me5.j("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            me5VarJ.C(1);
        } else {
            me5VarJ.s(1, str);
        }
        this.a.d();
        Cursor cursorB = n41.b(this.a, me5VarJ, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(new yy7.b(cursorB.isNull(0) ? null : cursorB.getString(0), gz7.f(cursorB.getInt(1))));
            }
            return arrayList;
        } finally {
            cursorB.close();
            me5VarJ.w();
        }
    }

    @Override // com.zepto.zy7
    public List i() throws Throwable {
        me5 me5Var;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        me5 me5VarJ = me5.j("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
        this.a.d();
        Cursor cursorB = n41.b(this.a, me5VarJ, false, null);
        try {
            int iD = b41.d(cursorB, "id");
            int iD2 = b41.d(cursorB, "state");
            int iD3 = b41.d(cursorB, "worker_class_name");
            int iD4 = b41.d(cursorB, "input_merger_class_name");
            int iD5 = b41.d(cursorB, "input");
            int iD6 = b41.d(cursorB, "output");
            int iD7 = b41.d(cursorB, "initial_delay");
            int iD8 = b41.d(cursorB, "interval_duration");
            int iD9 = b41.d(cursorB, "flex_duration");
            int iD10 = b41.d(cursorB, "run_attempt_count");
            int iD11 = b41.d(cursorB, "backoff_policy");
            int iD12 = b41.d(cursorB, "backoff_delay_duration");
            int iD13 = b41.d(cursorB, "last_enqueue_time");
            int iD14 = b41.d(cursorB, "minimum_retention_duration");
            me5Var = me5VarJ;
            try {
                int iD15 = b41.d(cursorB, "schedule_requested_at");
                int iD16 = b41.d(cursorB, "run_in_foreground");
                int iD17 = b41.d(cursorB, "out_of_quota_policy");
                int iD18 = b41.d(cursorB, "period_count");
                int iD19 = b41.d(cursorB, "generation");
                int iD20 = b41.d(cursorB, "next_schedule_time_override");
                int iD21 = b41.d(cursorB, "next_schedule_time_override_generation");
                int iD22 = b41.d(cursorB, "stop_reason");
                int iD23 = b41.d(cursorB, "required_network_type");
                int iD24 = b41.d(cursorB, "requires_charging");
                int iD25 = b41.d(cursorB, "requires_device_idle");
                int iD26 = b41.d(cursorB, "requires_battery_not_low");
                int iD27 = b41.d(cursorB, "requires_storage_not_low");
                int iD28 = b41.d(cursorB, "trigger_content_update_delay");
                int iD29 = b41.d(cursorB, "trigger_max_content_delay");
                int iD30 = b41.d(cursorB, "content_uri_triggers");
                int i7 = iD14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string = cursorB.isNull(iD) ? null : cursorB.getString(iD);
                    by7 by7VarF = gz7.f(cursorB.getInt(iD2));
                    String string2 = cursorB.isNull(iD3) ? null : cursorB.getString(iD3);
                    String string3 = cursorB.isNull(iD4) ? null : cursorB.getString(iD4);
                    androidx.work.b bVarG = androidx.work.b.g(cursorB.isNull(iD5) ? null : cursorB.getBlob(iD5));
                    androidx.work.b bVarG2 = androidx.work.b.g(cursorB.isNull(iD6) ? null : cursorB.getBlob(iD6));
                    long j2 = cursorB.getLong(iD7);
                    long j3 = cursorB.getLong(iD8);
                    long j4 = cursorB.getLong(iD9);
                    int i8 = cursorB.getInt(iD10);
                    x30 x30VarC = gz7.c(cursorB.getInt(iD11));
                    long j5 = cursorB.getLong(iD12);
                    long j6 = cursorB.getLong(iD13);
                    int i9 = i7;
                    long j7 = cursorB.getLong(i9);
                    int i10 = iD;
                    int i11 = iD15;
                    long j8 = cursorB.getLong(i11);
                    iD15 = i11;
                    int i12 = iD16;
                    if (cursorB.getInt(i12) != 0) {
                        iD16 = i12;
                        i2 = iD17;
                        z = true;
                    } else {
                        iD16 = i12;
                        i2 = iD17;
                        z = false;
                    }
                    ij4 ij4VarE = gz7.e(cursorB.getInt(i2));
                    iD17 = i2;
                    int i13 = iD18;
                    int i14 = cursorB.getInt(i13);
                    iD18 = i13;
                    int i15 = iD19;
                    int i16 = cursorB.getInt(i15);
                    iD19 = i15;
                    int i17 = iD20;
                    long j9 = cursorB.getLong(i17);
                    iD20 = i17;
                    int i18 = iD21;
                    int i19 = cursorB.getInt(i18);
                    iD21 = i18;
                    int i20 = iD22;
                    int i21 = cursorB.getInt(i20);
                    iD22 = i20;
                    int i22 = iD23;
                    s44 s44VarD = gz7.d(cursorB.getInt(i22));
                    iD23 = i22;
                    int i23 = iD24;
                    if (cursorB.getInt(i23) != 0) {
                        iD24 = i23;
                        i3 = iD25;
                        z2 = true;
                    } else {
                        iD24 = i23;
                        i3 = iD25;
                        z2 = false;
                    }
                    if (cursorB.getInt(i3) != 0) {
                        iD25 = i3;
                        i4 = iD26;
                        z3 = true;
                    } else {
                        iD25 = i3;
                        i4 = iD26;
                        z3 = false;
                    }
                    if (cursorB.getInt(i4) != 0) {
                        iD26 = i4;
                        i5 = iD27;
                        z4 = true;
                    } else {
                        iD26 = i4;
                        i5 = iD27;
                        z4 = false;
                    }
                    if (cursorB.getInt(i5) != 0) {
                        iD27 = i5;
                        i6 = iD28;
                        z5 = true;
                    } else {
                        iD27 = i5;
                        i6 = iD28;
                        z5 = false;
                    }
                    long j10 = cursorB.getLong(i6);
                    iD28 = i6;
                    int i24 = iD29;
                    long j11 = cursorB.getLong(i24);
                    iD29 = i24;
                    int i25 = iD30;
                    iD30 = i25;
                    arrayList.add(new yy7(string, by7VarF, string2, string3, bVarG, bVarG2, j2, j3, j4, new lx0(s44VarD, z2, z3, z4, z5, j10, j11, gz7.b(cursorB.isNull(i25) ? null : cursorB.getBlob(i25))), i8, x30VarC, j5, j6, j7, j8, z, ij4VarE, i14, i16, j9, i19, i21));
                    iD = i10;
                    i7 = i9;
                }
                cursorB.close();
                me5Var.w();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorB.close();
                me5Var.w();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            me5Var = me5VarJ;
        }
    }

    @Override // com.zepto.zy7
    public List j(long j2) throws Throwable {
        me5 me5Var;
        int iD;
        int iD2;
        int iD3;
        int iD4;
        int iD5;
        int iD6;
        int iD7;
        int iD8;
        int iD9;
        int iD10;
        int iD11;
        int iD12;
        int iD13;
        int iD14;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        me5 me5VarJ = me5.j("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        me5VarJ.X(1, j2);
        this.a.d();
        Cursor cursorB = n41.b(this.a, me5VarJ, false, null);
        try {
            iD = b41.d(cursorB, "id");
            iD2 = b41.d(cursorB, "state");
            iD3 = b41.d(cursorB, "worker_class_name");
            iD4 = b41.d(cursorB, "input_merger_class_name");
            iD5 = b41.d(cursorB, "input");
            iD6 = b41.d(cursorB, "output");
            iD7 = b41.d(cursorB, "initial_delay");
            iD8 = b41.d(cursorB, "interval_duration");
            iD9 = b41.d(cursorB, "flex_duration");
            iD10 = b41.d(cursorB, "run_attempt_count");
            iD11 = b41.d(cursorB, "backoff_policy");
            iD12 = b41.d(cursorB, "backoff_delay_duration");
            iD13 = b41.d(cursorB, "last_enqueue_time");
            iD14 = b41.d(cursorB, "minimum_retention_duration");
            me5Var = me5VarJ;
        } catch (Throwable th) {
            th = th;
            me5Var = me5VarJ;
        }
        try {
            int iD15 = b41.d(cursorB, "schedule_requested_at");
            int iD16 = b41.d(cursorB, "run_in_foreground");
            int iD17 = b41.d(cursorB, "out_of_quota_policy");
            int iD18 = b41.d(cursorB, "period_count");
            int iD19 = b41.d(cursorB, "generation");
            int iD20 = b41.d(cursorB, "next_schedule_time_override");
            int iD21 = b41.d(cursorB, "next_schedule_time_override_generation");
            int iD22 = b41.d(cursorB, "stop_reason");
            int iD23 = b41.d(cursorB, "required_network_type");
            int iD24 = b41.d(cursorB, "requires_charging");
            int iD25 = b41.d(cursorB, "requires_device_idle");
            int iD26 = b41.d(cursorB, "requires_battery_not_low");
            int iD27 = b41.d(cursorB, "requires_storage_not_low");
            int iD28 = b41.d(cursorB, "trigger_content_update_delay");
            int iD29 = b41.d(cursorB, "trigger_max_content_delay");
            int iD30 = b41.d(cursorB, "content_uri_triggers");
            int i7 = iD14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.isNull(iD) ? null : cursorB.getString(iD);
                by7 by7VarF = gz7.f(cursorB.getInt(iD2));
                String string2 = cursorB.isNull(iD3) ? null : cursorB.getString(iD3);
                String string3 = cursorB.isNull(iD4) ? null : cursorB.getString(iD4);
                androidx.work.b bVarG = androidx.work.b.g(cursorB.isNull(iD5) ? null : cursorB.getBlob(iD5));
                androidx.work.b bVarG2 = androidx.work.b.g(cursorB.isNull(iD6) ? null : cursorB.getBlob(iD6));
                long j3 = cursorB.getLong(iD7);
                long j4 = cursorB.getLong(iD8);
                long j5 = cursorB.getLong(iD9);
                int i8 = cursorB.getInt(iD10);
                x30 x30VarC = gz7.c(cursorB.getInt(iD11));
                long j6 = cursorB.getLong(iD12);
                long j7 = cursorB.getLong(iD13);
                int i9 = i7;
                long j8 = cursorB.getLong(i9);
                int i10 = iD;
                int i11 = iD15;
                long j9 = cursorB.getLong(i11);
                iD15 = i11;
                int i12 = iD16;
                if (cursorB.getInt(i12) != 0) {
                    iD16 = i12;
                    i2 = iD17;
                    z = true;
                } else {
                    iD16 = i12;
                    i2 = iD17;
                    z = false;
                }
                ij4 ij4VarE = gz7.e(cursorB.getInt(i2));
                iD17 = i2;
                int i13 = iD18;
                int i14 = cursorB.getInt(i13);
                iD18 = i13;
                int i15 = iD19;
                int i16 = cursorB.getInt(i15);
                iD19 = i15;
                int i17 = iD20;
                long j10 = cursorB.getLong(i17);
                iD20 = i17;
                int i18 = iD21;
                int i19 = cursorB.getInt(i18);
                iD21 = i18;
                int i20 = iD22;
                int i21 = cursorB.getInt(i20);
                iD22 = i20;
                int i22 = iD23;
                s44 s44VarD = gz7.d(cursorB.getInt(i22));
                iD23 = i22;
                int i23 = iD24;
                if (cursorB.getInt(i23) != 0) {
                    iD24 = i23;
                    i3 = iD25;
                    z2 = true;
                } else {
                    iD24 = i23;
                    i3 = iD25;
                    z2 = false;
                }
                if (cursorB.getInt(i3) != 0) {
                    iD25 = i3;
                    i4 = iD26;
                    z3 = true;
                } else {
                    iD25 = i3;
                    i4 = iD26;
                    z3 = false;
                }
                if (cursorB.getInt(i4) != 0) {
                    iD26 = i4;
                    i5 = iD27;
                    z4 = true;
                } else {
                    iD26 = i4;
                    i5 = iD27;
                    z4 = false;
                }
                if (cursorB.getInt(i5) != 0) {
                    iD27 = i5;
                    i6 = iD28;
                    z5 = true;
                } else {
                    iD27 = i5;
                    i6 = iD28;
                    z5 = false;
                }
                long j11 = cursorB.getLong(i6);
                iD28 = i6;
                int i24 = iD29;
                long j12 = cursorB.getLong(i24);
                iD29 = i24;
                int i25 = iD30;
                iD30 = i25;
                arrayList.add(new yy7(string, by7VarF, string2, string3, bVarG, bVarG2, j3, j4, j5, new lx0(s44VarD, z2, z3, z4, z5, j11, j12, gz7.b(cursorB.isNull(i25) ? null : cursorB.getBlob(i25))), i8, x30VarC, j6, j7, j8, j9, z, ij4VarE, i14, i16, j10, i19, i21));
                iD = i10;
                i7 = i9;
            }
            cursorB.close();
            me5Var.w();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            me5Var.w();
            throw th;
        }
    }

    @Override // com.zepto.zy7
    public by7 k(String str) {
        me5 me5VarJ = me5.j("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            me5VarJ.C(1);
        } else {
            me5VarJ.s(1, str);
        }
        this.a.d();
        by7 by7VarF = null;
        Cursor cursorB = n41.b(this.a, me5VarJ, false, null);
        try {
            if (cursorB.moveToFirst()) {
                Integer numValueOf = cursorB.isNull(0) ? null : Integer.valueOf(cursorB.getInt(0));
                if (numValueOf != null) {
                    gz7 gz7Var = gz7.a;
                    by7VarF = gz7.f(numValueOf.intValue());
                }
            }
            return by7VarF;
        } finally {
            cursorB.close();
            me5VarJ.w();
        }
    }

    @Override // com.zepto.zy7
    public List l(int i2) throws Throwable {
        me5 me5Var;
        int iD;
        int iD2;
        int iD3;
        int iD4;
        int iD5;
        int iD6;
        int iD7;
        int iD8;
        int iD9;
        int iD10;
        int iD11;
        int iD12;
        int iD13;
        int iD14;
        int i3;
        boolean z;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        me5 me5VarJ = me5.j("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
        me5VarJ.X(1, i2);
        this.a.d();
        Cursor cursorB = n41.b(this.a, me5VarJ, false, null);
        try {
            iD = b41.d(cursorB, "id");
            iD2 = b41.d(cursorB, "state");
            iD3 = b41.d(cursorB, "worker_class_name");
            iD4 = b41.d(cursorB, "input_merger_class_name");
            iD5 = b41.d(cursorB, "input");
            iD6 = b41.d(cursorB, "output");
            iD7 = b41.d(cursorB, "initial_delay");
            iD8 = b41.d(cursorB, "interval_duration");
            iD9 = b41.d(cursorB, "flex_duration");
            iD10 = b41.d(cursorB, "run_attempt_count");
            iD11 = b41.d(cursorB, "backoff_policy");
            iD12 = b41.d(cursorB, "backoff_delay_duration");
            iD13 = b41.d(cursorB, "last_enqueue_time");
            iD14 = b41.d(cursorB, "minimum_retention_duration");
            me5Var = me5VarJ;
        } catch (Throwable th) {
            th = th;
            me5Var = me5VarJ;
        }
        try {
            int iD15 = b41.d(cursorB, "schedule_requested_at");
            int iD16 = b41.d(cursorB, "run_in_foreground");
            int iD17 = b41.d(cursorB, "out_of_quota_policy");
            int iD18 = b41.d(cursorB, "period_count");
            int iD19 = b41.d(cursorB, "generation");
            int iD20 = b41.d(cursorB, "next_schedule_time_override");
            int iD21 = b41.d(cursorB, "next_schedule_time_override_generation");
            int iD22 = b41.d(cursorB, "stop_reason");
            int iD23 = b41.d(cursorB, "required_network_type");
            int iD24 = b41.d(cursorB, "requires_charging");
            int iD25 = b41.d(cursorB, "requires_device_idle");
            int iD26 = b41.d(cursorB, "requires_battery_not_low");
            int iD27 = b41.d(cursorB, "requires_storage_not_low");
            int iD28 = b41.d(cursorB, "trigger_content_update_delay");
            int iD29 = b41.d(cursorB, "trigger_max_content_delay");
            int iD30 = b41.d(cursorB, "content_uri_triggers");
            int i8 = iD14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.isNull(iD) ? null : cursorB.getString(iD);
                by7 by7VarF = gz7.f(cursorB.getInt(iD2));
                String string2 = cursorB.isNull(iD3) ? null : cursorB.getString(iD3);
                String string3 = cursorB.isNull(iD4) ? null : cursorB.getString(iD4);
                androidx.work.b bVarG = androidx.work.b.g(cursorB.isNull(iD5) ? null : cursorB.getBlob(iD5));
                androidx.work.b bVarG2 = androidx.work.b.g(cursorB.isNull(iD6) ? null : cursorB.getBlob(iD6));
                long j2 = cursorB.getLong(iD7);
                long j3 = cursorB.getLong(iD8);
                long j4 = cursorB.getLong(iD9);
                int i9 = cursorB.getInt(iD10);
                x30 x30VarC = gz7.c(cursorB.getInt(iD11));
                long j5 = cursorB.getLong(iD12);
                long j6 = cursorB.getLong(iD13);
                int i10 = i8;
                long j7 = cursorB.getLong(i10);
                int i11 = iD;
                int i12 = iD15;
                long j8 = cursorB.getLong(i12);
                iD15 = i12;
                int i13 = iD16;
                if (cursorB.getInt(i13) != 0) {
                    iD16 = i13;
                    i3 = iD17;
                    z = true;
                } else {
                    iD16 = i13;
                    i3 = iD17;
                    z = false;
                }
                ij4 ij4VarE = gz7.e(cursorB.getInt(i3));
                iD17 = i3;
                int i14 = iD18;
                int i15 = cursorB.getInt(i14);
                iD18 = i14;
                int i16 = iD19;
                int i17 = cursorB.getInt(i16);
                iD19 = i16;
                int i18 = iD20;
                long j9 = cursorB.getLong(i18);
                iD20 = i18;
                int i19 = iD21;
                int i20 = cursorB.getInt(i19);
                iD21 = i19;
                int i21 = iD22;
                int i22 = cursorB.getInt(i21);
                iD22 = i21;
                int i23 = iD23;
                s44 s44VarD = gz7.d(cursorB.getInt(i23));
                iD23 = i23;
                int i24 = iD24;
                if (cursorB.getInt(i24) != 0) {
                    iD24 = i24;
                    i4 = iD25;
                    z2 = true;
                } else {
                    iD24 = i24;
                    i4 = iD25;
                    z2 = false;
                }
                if (cursorB.getInt(i4) != 0) {
                    iD25 = i4;
                    i5 = iD26;
                    z3 = true;
                } else {
                    iD25 = i4;
                    i5 = iD26;
                    z3 = false;
                }
                if (cursorB.getInt(i5) != 0) {
                    iD26 = i5;
                    i6 = iD27;
                    z4 = true;
                } else {
                    iD26 = i5;
                    i6 = iD27;
                    z4 = false;
                }
                if (cursorB.getInt(i6) != 0) {
                    iD27 = i6;
                    i7 = iD28;
                    z5 = true;
                } else {
                    iD27 = i6;
                    i7 = iD28;
                    z5 = false;
                }
                long j10 = cursorB.getLong(i7);
                iD28 = i7;
                int i25 = iD29;
                long j11 = cursorB.getLong(i25);
                iD29 = i25;
                int i26 = iD30;
                iD30 = i26;
                arrayList.add(new yy7(string, by7VarF, string2, string3, bVarG, bVarG2, j2, j3, j4, new lx0(s44VarD, z2, z3, z4, z5, j10, j11, gz7.b(cursorB.isNull(i26) ? null : cursorB.getBlob(i26))), i9, x30VarC, j5, j6, j7, j8, z, ij4VarE, i15, i17, j9, i20, i22));
                iD = i11;
                i8 = i10;
            }
            cursorB.close();
            me5Var.w();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            me5Var.w();
            throw th;
        }
    }

    @Override // com.zepto.zy7
    public yy7 m(String str) throws Throwable {
        me5 me5Var;
        int iD;
        int iD2;
        int iD3;
        int iD4;
        int iD5;
        int iD6;
        int iD7;
        int iD8;
        int iD9;
        int iD10;
        int iD11;
        int iD12;
        int iD13;
        int iD14;
        yy7 yy7Var;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        me5 me5VarJ = me5.j("SELECT * FROM workspec WHERE id=?", 1);
        if (str == null) {
            me5VarJ.C(1);
        } else {
            me5VarJ.s(1, str);
        }
        this.a.d();
        Cursor cursorB = n41.b(this.a, me5VarJ, false, null);
        try {
            iD = b41.d(cursorB, "id");
            iD2 = b41.d(cursorB, "state");
            iD3 = b41.d(cursorB, "worker_class_name");
            iD4 = b41.d(cursorB, "input_merger_class_name");
            iD5 = b41.d(cursorB, "input");
            iD6 = b41.d(cursorB, "output");
            iD7 = b41.d(cursorB, "initial_delay");
            iD8 = b41.d(cursorB, "interval_duration");
            iD9 = b41.d(cursorB, "flex_duration");
            iD10 = b41.d(cursorB, "run_attempt_count");
            iD11 = b41.d(cursorB, "backoff_policy");
            iD12 = b41.d(cursorB, "backoff_delay_duration");
            iD13 = b41.d(cursorB, "last_enqueue_time");
            iD14 = b41.d(cursorB, "minimum_retention_duration");
            me5Var = me5VarJ;
        } catch (Throwable th) {
            th = th;
            me5Var = me5VarJ;
        }
        try {
            int iD15 = b41.d(cursorB, "schedule_requested_at");
            int iD16 = b41.d(cursorB, "run_in_foreground");
            int iD17 = b41.d(cursorB, "out_of_quota_policy");
            int iD18 = b41.d(cursorB, "period_count");
            int iD19 = b41.d(cursorB, "generation");
            int iD20 = b41.d(cursorB, "next_schedule_time_override");
            int iD21 = b41.d(cursorB, "next_schedule_time_override_generation");
            int iD22 = b41.d(cursorB, "stop_reason");
            int iD23 = b41.d(cursorB, "required_network_type");
            int iD24 = b41.d(cursorB, "requires_charging");
            int iD25 = b41.d(cursorB, "requires_device_idle");
            int iD26 = b41.d(cursorB, "requires_battery_not_low");
            int iD27 = b41.d(cursorB, "requires_storage_not_low");
            int iD28 = b41.d(cursorB, "trigger_content_update_delay");
            int iD29 = b41.d(cursorB, "trigger_max_content_delay");
            int iD30 = b41.d(cursorB, "content_uri_triggers");
            if (cursorB.moveToFirst()) {
                String string = cursorB.isNull(iD) ? null : cursorB.getString(iD);
                by7 by7VarF = gz7.f(cursorB.getInt(iD2));
                String string2 = cursorB.isNull(iD3) ? null : cursorB.getString(iD3);
                String string3 = cursorB.isNull(iD4) ? null : cursorB.getString(iD4);
                androidx.work.b bVarG = androidx.work.b.g(cursorB.isNull(iD5) ? null : cursorB.getBlob(iD5));
                androidx.work.b bVarG2 = androidx.work.b.g(cursorB.isNull(iD6) ? null : cursorB.getBlob(iD6));
                long j2 = cursorB.getLong(iD7);
                long j3 = cursorB.getLong(iD8);
                long j4 = cursorB.getLong(iD9);
                int i7 = cursorB.getInt(iD10);
                x30 x30VarC = gz7.c(cursorB.getInt(iD11));
                long j5 = cursorB.getLong(iD12);
                long j6 = cursorB.getLong(iD13);
                long j7 = cursorB.getLong(iD14);
                long j8 = cursorB.getLong(iD15);
                if (cursorB.getInt(iD16) != 0) {
                    i2 = iD17;
                    z = true;
                } else {
                    i2 = iD17;
                    z = false;
                }
                ij4 ij4VarE = gz7.e(cursorB.getInt(i2));
                int i8 = cursorB.getInt(iD18);
                int i9 = cursorB.getInt(iD19);
                long j9 = cursorB.getLong(iD20);
                int i10 = cursorB.getInt(iD21);
                int i11 = cursorB.getInt(iD22);
                s44 s44VarD = gz7.d(cursorB.getInt(iD23));
                if (cursorB.getInt(iD24) != 0) {
                    i3 = iD25;
                    z2 = true;
                } else {
                    i3 = iD25;
                    z2 = false;
                }
                if (cursorB.getInt(i3) != 0) {
                    i4 = iD26;
                    z3 = true;
                } else {
                    i4 = iD26;
                    z3 = false;
                }
                if (cursorB.getInt(i4) != 0) {
                    i5 = iD27;
                    z4 = true;
                } else {
                    i5 = iD27;
                    z4 = false;
                }
                if (cursorB.getInt(i5) != 0) {
                    i6 = iD28;
                    z5 = true;
                } else {
                    i6 = iD28;
                    z5 = false;
                }
                yy7Var = new yy7(string, by7VarF, string2, string3, bVarG, bVarG2, j2, j3, j4, new lx0(s44VarD, z2, z3, z4, z5, cursorB.getLong(i6), cursorB.getLong(iD29), gz7.b(cursorB.isNull(iD30) ? null : cursorB.getBlob(iD30))), i7, x30VarC, j5, j6, j7, j8, z, ij4VarE, i8, i9, j9, i10, i11);
            } else {
                yy7Var = null;
            }
            cursorB.close();
            me5Var.w();
            return yy7Var;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            me5Var.w();
            throw th;
        }
    }

    @Override // com.zepto.zy7
    public void n(String str, int i2) {
        this.a.d();
        r96 r96VarB = this.r.b();
        r96VarB.X(1, i2);
        if (str == null) {
            r96VarB.C(2);
        } else {
            r96VarB.s(2, str);
        }
        this.a.e();
        try {
            r96VarB.x();
            this.a.A();
        } finally {
            this.a.i();
            this.r.h(r96VarB);
        }
    }

    @Override // com.zepto.zy7
    public int o(String str) {
        this.a.d();
        r96 r96VarB = this.k.b();
        if (str == null) {
            r96VarB.C(1);
        } else {
            r96VarB.s(1, str);
        }
        this.a.e();
        try {
            int iX = r96VarB.x();
            this.a.A();
            return iX;
        } finally {
            this.a.i();
            this.k.h(r96VarB);
        }
    }

    @Override // com.zepto.zy7
    public int p(String str) {
        this.a.d();
        r96 r96VarB = this.f.b();
        if (str == null) {
            r96VarB.C(1);
        } else {
            r96VarB.s(1, str);
        }
        this.a.e();
        try {
            int iX = r96VarB.x();
            this.a.A();
            return iX;
        } finally {
            this.a.i();
            this.f.h(r96VarB);
        }
    }

    @Override // com.zepto.zy7
    public List q(String str) {
        me5 me5VarJ = me5.j("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            me5VarJ.C(1);
        } else {
            me5VarJ.s(1, str);
        }
        this.a.d();
        Cursor cursorB = n41.b(this.a, me5VarJ, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(androidx.work.b.g(cursorB.isNull(0) ? null : cursorB.getBlob(0)));
            }
            return arrayList;
        } finally {
            cursorB.close();
            me5VarJ.w();
        }
    }

    @Override // com.zepto.zy7
    public int r(String str) {
        this.a.d();
        r96 r96VarB = this.j.b();
        if (str == null) {
            r96VarB.C(1);
        } else {
            r96VarB.s(1, str);
        }
        this.a.e();
        try {
            int iX = r96VarB.x();
            this.a.A();
            return iX;
        } finally {
            this.a.i();
            this.j.h(r96VarB);
        }
    }

    @Override // com.zepto.zy7
    public int s() {
        me5 me5VarJ = me5.j("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", 0);
        this.a.d();
        Cursor cursorB = n41.b(this.a, me5VarJ, false, null);
        try {
            return cursorB.moveToFirst() ? cursorB.getInt(0) : 0;
        } finally {
            cursorB.close();
            me5VarJ.w();
        }
    }

    @Override // com.zepto.zy7
    public void t(String str, int i2) {
        this.a.d();
        r96 r96VarB = this.m.b();
        if (str == null) {
            r96VarB.C(1);
        } else {
            r96VarB.s(1, str);
        }
        r96VarB.X(2, i2);
        this.a.e();
        try {
            r96VarB.x();
            this.a.A();
        } finally {
            this.a.i();
            this.m.h(r96VarB);
        }
    }

    @Override // com.zepto.zy7
    public List u() throws Throwable {
        me5 me5Var;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        me5 me5VarJ = me5.j("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.d();
        Cursor cursorB = n41.b(this.a, me5VarJ, false, null);
        try {
            int iD = b41.d(cursorB, "id");
            int iD2 = b41.d(cursorB, "state");
            int iD3 = b41.d(cursorB, "worker_class_name");
            int iD4 = b41.d(cursorB, "input_merger_class_name");
            int iD5 = b41.d(cursorB, "input");
            int iD6 = b41.d(cursorB, "output");
            int iD7 = b41.d(cursorB, "initial_delay");
            int iD8 = b41.d(cursorB, "interval_duration");
            int iD9 = b41.d(cursorB, "flex_duration");
            int iD10 = b41.d(cursorB, "run_attempt_count");
            int iD11 = b41.d(cursorB, "backoff_policy");
            int iD12 = b41.d(cursorB, "backoff_delay_duration");
            int iD13 = b41.d(cursorB, "last_enqueue_time");
            int iD14 = b41.d(cursorB, "minimum_retention_duration");
            me5Var = me5VarJ;
            try {
                int iD15 = b41.d(cursorB, "schedule_requested_at");
                int iD16 = b41.d(cursorB, "run_in_foreground");
                int iD17 = b41.d(cursorB, "out_of_quota_policy");
                int iD18 = b41.d(cursorB, "period_count");
                int iD19 = b41.d(cursorB, "generation");
                int iD20 = b41.d(cursorB, "next_schedule_time_override");
                int iD21 = b41.d(cursorB, "next_schedule_time_override_generation");
                int iD22 = b41.d(cursorB, "stop_reason");
                int iD23 = b41.d(cursorB, "required_network_type");
                int iD24 = b41.d(cursorB, "requires_charging");
                int iD25 = b41.d(cursorB, "requires_device_idle");
                int iD26 = b41.d(cursorB, "requires_battery_not_low");
                int iD27 = b41.d(cursorB, "requires_storage_not_low");
                int iD28 = b41.d(cursorB, "trigger_content_update_delay");
                int iD29 = b41.d(cursorB, "trigger_max_content_delay");
                int iD30 = b41.d(cursorB, "content_uri_triggers");
                int i7 = iD14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string = cursorB.isNull(iD) ? null : cursorB.getString(iD);
                    by7 by7VarF = gz7.f(cursorB.getInt(iD2));
                    String string2 = cursorB.isNull(iD3) ? null : cursorB.getString(iD3);
                    String string3 = cursorB.isNull(iD4) ? null : cursorB.getString(iD4);
                    androidx.work.b bVarG = androidx.work.b.g(cursorB.isNull(iD5) ? null : cursorB.getBlob(iD5));
                    androidx.work.b bVarG2 = androidx.work.b.g(cursorB.isNull(iD6) ? null : cursorB.getBlob(iD6));
                    long j2 = cursorB.getLong(iD7);
                    long j3 = cursorB.getLong(iD8);
                    long j4 = cursorB.getLong(iD9);
                    int i8 = cursorB.getInt(iD10);
                    x30 x30VarC = gz7.c(cursorB.getInt(iD11));
                    long j5 = cursorB.getLong(iD12);
                    long j6 = cursorB.getLong(iD13);
                    int i9 = i7;
                    long j7 = cursorB.getLong(i9);
                    int i10 = iD;
                    int i11 = iD15;
                    long j8 = cursorB.getLong(i11);
                    iD15 = i11;
                    int i12 = iD16;
                    if (cursorB.getInt(i12) != 0) {
                        iD16 = i12;
                        i2 = iD17;
                        z = true;
                    } else {
                        iD16 = i12;
                        i2 = iD17;
                        z = false;
                    }
                    ij4 ij4VarE = gz7.e(cursorB.getInt(i2));
                    iD17 = i2;
                    int i13 = iD18;
                    int i14 = cursorB.getInt(i13);
                    iD18 = i13;
                    int i15 = iD19;
                    int i16 = cursorB.getInt(i15);
                    iD19 = i15;
                    int i17 = iD20;
                    long j9 = cursorB.getLong(i17);
                    iD20 = i17;
                    int i18 = iD21;
                    int i19 = cursorB.getInt(i18);
                    iD21 = i18;
                    int i20 = iD22;
                    int i21 = cursorB.getInt(i20);
                    iD22 = i20;
                    int i22 = iD23;
                    s44 s44VarD = gz7.d(cursorB.getInt(i22));
                    iD23 = i22;
                    int i23 = iD24;
                    if (cursorB.getInt(i23) != 0) {
                        iD24 = i23;
                        i3 = iD25;
                        z2 = true;
                    } else {
                        iD24 = i23;
                        i3 = iD25;
                        z2 = false;
                    }
                    if (cursorB.getInt(i3) != 0) {
                        iD25 = i3;
                        i4 = iD26;
                        z3 = true;
                    } else {
                        iD25 = i3;
                        i4 = iD26;
                        z3 = false;
                    }
                    if (cursorB.getInt(i4) != 0) {
                        iD26 = i4;
                        i5 = iD27;
                        z4 = true;
                    } else {
                        iD26 = i4;
                        i5 = iD27;
                        z4 = false;
                    }
                    if (cursorB.getInt(i5) != 0) {
                        iD27 = i5;
                        i6 = iD28;
                        z5 = true;
                    } else {
                        iD27 = i5;
                        i6 = iD28;
                        z5 = false;
                    }
                    long j10 = cursorB.getLong(i6);
                    iD28 = i6;
                    int i24 = iD29;
                    long j11 = cursorB.getLong(i24);
                    iD29 = i24;
                    int i25 = iD30;
                    iD30 = i25;
                    arrayList.add(new yy7(string, by7VarF, string2, string3, bVarG, bVarG2, j2, j3, j4, new lx0(s44VarD, z2, z3, z4, z5, j10, j11, gz7.b(cursorB.isNull(i25) ? null : cursorB.getBlob(i25))), i8, x30VarC, j5, j6, j7, j8, z, ij4VarE, i14, i16, j9, i19, i21));
                    iD = i10;
                    i7 = i9;
                }
                cursorB.close();
                me5Var.w();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorB.close();
                me5Var.w();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            me5Var = me5VarJ;
        }
    }

    @Override // com.zepto.zy7
    public List v(int i2) throws Throwable {
        me5 me5Var;
        int iD;
        int iD2;
        int iD3;
        int iD4;
        int iD5;
        int iD6;
        int iD7;
        int iD8;
        int iD9;
        int iD10;
        int iD11;
        int iD12;
        int iD13;
        int iD14;
        int i3;
        boolean z;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        me5 me5VarJ = me5.j("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        me5VarJ.X(1, i2);
        this.a.d();
        Cursor cursorB = n41.b(this.a, me5VarJ, false, null);
        try {
            iD = b41.d(cursorB, "id");
            iD2 = b41.d(cursorB, "state");
            iD3 = b41.d(cursorB, "worker_class_name");
            iD4 = b41.d(cursorB, "input_merger_class_name");
            iD5 = b41.d(cursorB, "input");
            iD6 = b41.d(cursorB, "output");
            iD7 = b41.d(cursorB, "initial_delay");
            iD8 = b41.d(cursorB, "interval_duration");
            iD9 = b41.d(cursorB, "flex_duration");
            iD10 = b41.d(cursorB, "run_attempt_count");
            iD11 = b41.d(cursorB, "backoff_policy");
            iD12 = b41.d(cursorB, "backoff_delay_duration");
            iD13 = b41.d(cursorB, "last_enqueue_time");
            iD14 = b41.d(cursorB, "minimum_retention_duration");
            me5Var = me5VarJ;
        } catch (Throwable th) {
            th = th;
            me5Var = me5VarJ;
        }
        try {
            int iD15 = b41.d(cursorB, "schedule_requested_at");
            int iD16 = b41.d(cursorB, "run_in_foreground");
            int iD17 = b41.d(cursorB, "out_of_quota_policy");
            int iD18 = b41.d(cursorB, "period_count");
            int iD19 = b41.d(cursorB, "generation");
            int iD20 = b41.d(cursorB, "next_schedule_time_override");
            int iD21 = b41.d(cursorB, "next_schedule_time_override_generation");
            int iD22 = b41.d(cursorB, "stop_reason");
            int iD23 = b41.d(cursorB, "required_network_type");
            int iD24 = b41.d(cursorB, "requires_charging");
            int iD25 = b41.d(cursorB, "requires_device_idle");
            int iD26 = b41.d(cursorB, "requires_battery_not_low");
            int iD27 = b41.d(cursorB, "requires_storage_not_low");
            int iD28 = b41.d(cursorB, "trigger_content_update_delay");
            int iD29 = b41.d(cursorB, "trigger_max_content_delay");
            int iD30 = b41.d(cursorB, "content_uri_triggers");
            int i8 = iD14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.isNull(iD) ? null : cursorB.getString(iD);
                by7 by7VarF = gz7.f(cursorB.getInt(iD2));
                String string2 = cursorB.isNull(iD3) ? null : cursorB.getString(iD3);
                String string3 = cursorB.isNull(iD4) ? null : cursorB.getString(iD4);
                androidx.work.b bVarG = androidx.work.b.g(cursorB.isNull(iD5) ? null : cursorB.getBlob(iD5));
                androidx.work.b bVarG2 = androidx.work.b.g(cursorB.isNull(iD6) ? null : cursorB.getBlob(iD6));
                long j2 = cursorB.getLong(iD7);
                long j3 = cursorB.getLong(iD8);
                long j4 = cursorB.getLong(iD9);
                int i9 = cursorB.getInt(iD10);
                x30 x30VarC = gz7.c(cursorB.getInt(iD11));
                long j5 = cursorB.getLong(iD12);
                long j6 = cursorB.getLong(iD13);
                int i10 = i8;
                long j7 = cursorB.getLong(i10);
                int i11 = iD;
                int i12 = iD15;
                long j8 = cursorB.getLong(i12);
                iD15 = i12;
                int i13 = iD16;
                if (cursorB.getInt(i13) != 0) {
                    iD16 = i13;
                    i3 = iD17;
                    z = true;
                } else {
                    iD16 = i13;
                    i3 = iD17;
                    z = false;
                }
                ij4 ij4VarE = gz7.e(cursorB.getInt(i3));
                iD17 = i3;
                int i14 = iD18;
                int i15 = cursorB.getInt(i14);
                iD18 = i14;
                int i16 = iD19;
                int i17 = cursorB.getInt(i16);
                iD19 = i16;
                int i18 = iD20;
                long j9 = cursorB.getLong(i18);
                iD20 = i18;
                int i19 = iD21;
                int i20 = cursorB.getInt(i19);
                iD21 = i19;
                int i21 = iD22;
                int i22 = cursorB.getInt(i21);
                iD22 = i21;
                int i23 = iD23;
                s44 s44VarD = gz7.d(cursorB.getInt(i23));
                iD23 = i23;
                int i24 = iD24;
                if (cursorB.getInt(i24) != 0) {
                    iD24 = i24;
                    i4 = iD25;
                    z2 = true;
                } else {
                    iD24 = i24;
                    i4 = iD25;
                    z2 = false;
                }
                if (cursorB.getInt(i4) != 0) {
                    iD25 = i4;
                    i5 = iD26;
                    z3 = true;
                } else {
                    iD25 = i4;
                    i5 = iD26;
                    z3 = false;
                }
                if (cursorB.getInt(i5) != 0) {
                    iD26 = i5;
                    i6 = iD27;
                    z4 = true;
                } else {
                    iD26 = i5;
                    i6 = iD27;
                    z4 = false;
                }
                if (cursorB.getInt(i6) != 0) {
                    iD27 = i6;
                    i7 = iD28;
                    z5 = true;
                } else {
                    iD27 = i6;
                    i7 = iD28;
                    z5 = false;
                }
                long j10 = cursorB.getLong(i7);
                iD28 = i7;
                int i25 = iD29;
                long j11 = cursorB.getLong(i25);
                iD29 = i25;
                int i26 = iD30;
                iD30 = i26;
                arrayList.add(new yy7(string, by7VarF, string2, string3, bVarG, bVarG2, j2, j3, j4, new lx0(s44VarD, z2, z3, z4, z5, j10, j11, gz7.b(cursorB.isNull(i26) ? null : cursorB.getBlob(i26))), i9, x30VarC, j5, j6, j7, j8, z, ij4VarE, i15, i17, j9, i20, i22));
                iD = i11;
                i8 = i10;
            }
            cursorB.close();
            me5Var.w();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            me5Var.w();
            throw th;
        }
    }

    @Override // com.zepto.zy7
    public void w(String str, androidx.work.b bVar) throws Throwable {
        this.a.d();
        r96 r96VarB = this.h.b();
        byte[] bArrO = androidx.work.b.o(bVar);
        if (bArrO == null) {
            r96VarB.C(1);
        } else {
            r96VarB.f0(1, bArrO);
        }
        if (str == null) {
            r96VarB.C(2);
        } else {
            r96VarB.s(2, str);
        }
        this.a.e();
        try {
            r96VarB.x();
            this.a.A();
        } finally {
            this.a.i();
            this.h.h(r96VarB);
        }
    }

    @Override // com.zepto.zy7
    public int x() {
        this.a.d();
        r96 r96VarB = this.o.b();
        this.a.e();
        try {
            int iX = r96VarB.x();
            this.a.A();
            return iX;
        } finally {
            this.a.i();
            this.o.h(r96VarB);
        }
    }

    @Override // com.zepto.zy7
    public int y(by7 by7Var, String str) {
        this.a.d();
        r96 r96VarB = this.e.b();
        r96VarB.X(1, gz7.j(by7Var));
        if (str == null) {
            r96VarB.C(2);
        } else {
            r96VarB.s(2, str);
        }
        this.a.e();
        try {
            int iX = r96VarB.x();
            this.a.A();
            return iX;
        } finally {
            this.a.i();
            this.e.h(r96VarB);
        }
    }

    @Override // com.zepto.zy7
    public void z(yy7 yy7Var) {
        this.a.d();
        this.a.e();
        try {
            this.b.j(yy7Var);
            this.a.A();
        } finally {
            this.a.i();
        }
    }
}
