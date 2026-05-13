package androidx.work.impl;

import com.zepto.az7;
import com.zepto.da6;
import com.zepto.dz7;
import com.zepto.ea6;
import com.zepto.ez7;
import com.zepto.f13;
import com.zepto.jc6;
import com.zepto.je5;
import com.zepto.ki1;
import com.zepto.le5;
import com.zepto.li1;
import com.zepto.m45;
import com.zepto.n41;
import com.zepto.n45;
import com.zepto.n96;
import com.zepto.nu4;
import com.zepto.ny7;
import com.zepto.o96;
import com.zepto.ou4;
import com.zepto.oy7;
import com.zepto.qy7;
import com.zepto.rx7;
import com.zepto.ry7;
import com.zepto.sx7;
import com.zepto.tx7;
import com.zepto.ud1;
import com.zepto.ux7;
import com.zepto.vx7;
import com.zepto.wx7;
import com.zepto.zy7;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public volatile zy7 q;
    public volatile ki1 r;
    public volatile dz7 s;
    public volatile da6 t;
    public volatile ny7 u;
    public volatile qy7 v;
    public volatile nu4 w;

    public class a extends le5.b {
        public a(int i) {
            super(i);
        }

        @Override // com.zepto.le5.b
        public void a(n96 n96Var) {
            n96Var.r("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            n96Var.r("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            n96Var.r("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            n96Var.r("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            n96Var.r("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            n96Var.r("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            n96Var.r("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            n96Var.r("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            n96Var.r("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            n96Var.r("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            n96Var.r("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            n96Var.r("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            n96Var.r("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            n96Var.r("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            n96Var.r("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
        }

        @Override // com.zepto.le5.b
        public void b(n96 n96Var) {
            n96Var.r("DROP TABLE IF EXISTS `Dependency`");
            n96Var.r("DROP TABLE IF EXISTS `WorkSpec`");
            n96Var.r("DROP TABLE IF EXISTS `WorkTag`");
            n96Var.r("DROP TABLE IF EXISTS `SystemIdInfo`");
            n96Var.r("DROP TABLE IF EXISTS `WorkName`");
            n96Var.r("DROP TABLE IF EXISTS `WorkProgress`");
            n96Var.r("DROP TABLE IF EXISTS `Preference`");
            if (WorkDatabase_Impl.this.h != null) {
                int size = WorkDatabase_Impl.this.h.size();
                for (int i = 0; i < size; i++) {
                    ((je5.b) WorkDatabase_Impl.this.h.get(i)).b(n96Var);
                }
            }
        }

        @Override // com.zepto.le5.b
        public void c(n96 n96Var) {
            if (WorkDatabase_Impl.this.h != null) {
                int size = WorkDatabase_Impl.this.h.size();
                for (int i = 0; i < size; i++) {
                    ((je5.b) WorkDatabase_Impl.this.h.get(i)).a(n96Var);
                }
            }
        }

        @Override // com.zepto.le5.b
        public void d(n96 n96Var) {
            WorkDatabase_Impl.this.a = n96Var;
            n96Var.r("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.u(n96Var);
            if (WorkDatabase_Impl.this.h != null) {
                int size = WorkDatabase_Impl.this.h.size();
                for (int i = 0; i < size; i++) {
                    ((je5.b) WorkDatabase_Impl.this.h.get(i)).c(n96Var);
                }
            }
        }

        @Override // com.zepto.le5.b
        public void e(n96 n96Var) {
        }

        @Override // com.zepto.le5.b
        public void f(n96 n96Var) {
            n41.a(n96Var);
        }

        @Override // com.zepto.le5.b
        public le5.c g(n96 n96Var) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new jc6.a("work_spec_id", "TEXT", true, 1, null, 1));
            map.put("prerequisite_id", new jc6.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new jc6.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new jc6.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new jc6.e("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            hashSet2.add(new jc6.e("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
            jc6 jc6Var = new jc6("Dependency", map, hashSet, hashSet2);
            jc6 jc6VarA = jc6.a(n96Var, "Dependency");
            if (!jc6Var.equals(jc6VarA)) {
                return new le5.c(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + jc6Var + "\n Found:\n" + jc6VarA);
            }
            HashMap map2 = new HashMap(30);
            map2.put("id", new jc6.a("id", "TEXT", true, 1, null, 1));
            map2.put("state", new jc6.a("state", "INTEGER", true, 0, null, 1));
            map2.put("worker_class_name", new jc6.a("worker_class_name", "TEXT", true, 0, null, 1));
            map2.put("input_merger_class_name", new jc6.a("input_merger_class_name", "TEXT", true, 0, null, 1));
            map2.put("input", new jc6.a("input", "BLOB", true, 0, null, 1));
            map2.put("output", new jc6.a("output", "BLOB", true, 0, null, 1));
            map2.put("initial_delay", new jc6.a("initial_delay", "INTEGER", true, 0, null, 1));
            map2.put("interval_duration", new jc6.a("interval_duration", "INTEGER", true, 0, null, 1));
            map2.put("flex_duration", new jc6.a("flex_duration", "INTEGER", true, 0, null, 1));
            map2.put("run_attempt_count", new jc6.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            map2.put("backoff_policy", new jc6.a("backoff_policy", "INTEGER", true, 0, null, 1));
            map2.put("backoff_delay_duration", new jc6.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            map2.put("last_enqueue_time", new jc6.a("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
            map2.put("minimum_retention_duration", new jc6.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            map2.put("schedule_requested_at", new jc6.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            map2.put("run_in_foreground", new jc6.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            map2.put("out_of_quota_policy", new jc6.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            map2.put("period_count", new jc6.a("period_count", "INTEGER", true, 0, "0", 1));
            map2.put("generation", new jc6.a("generation", "INTEGER", true, 0, "0", 1));
            map2.put("next_schedule_time_override", new jc6.a("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
            map2.put("next_schedule_time_override_generation", new jc6.a("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
            map2.put("stop_reason", new jc6.a("stop_reason", "INTEGER", true, 0, "-256", 1));
            map2.put("required_network_type", new jc6.a("required_network_type", "INTEGER", true, 0, null, 1));
            map2.put("requires_charging", new jc6.a("requires_charging", "INTEGER", true, 0, null, 1));
            map2.put("requires_device_idle", new jc6.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            map2.put("requires_battery_not_low", new jc6.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            map2.put("requires_storage_not_low", new jc6.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            map2.put("trigger_content_update_delay", new jc6.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            map2.put("trigger_max_content_delay", new jc6.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            map2.put("content_uri_triggers", new jc6.a("content_uri_triggers", "BLOB", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new jc6.e("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
            hashSet4.add(new jc6.e("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
            jc6 jc6Var2 = new jc6("WorkSpec", map2, hashSet3, hashSet4);
            jc6 jc6VarA2 = jc6.a(n96Var, "WorkSpec");
            if (!jc6Var2.equals(jc6VarA2)) {
                return new le5.c(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + jc6Var2 + "\n Found:\n" + jc6VarA2);
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new jc6.a("tag", "TEXT", true, 1, null, 1));
            map3.put("work_spec_id", new jc6.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new jc6.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new jc6.e("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            jc6 jc6Var3 = new jc6("WorkTag", map3, hashSet5, hashSet6);
            jc6 jc6VarA3 = jc6.a(n96Var, "WorkTag");
            if (!jc6Var3.equals(jc6VarA3)) {
                return new le5.c(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + jc6Var3 + "\n Found:\n" + jc6VarA3);
            }
            HashMap map4 = new HashMap(3);
            map4.put("work_spec_id", new jc6.a("work_spec_id", "TEXT", true, 1, null, 1));
            map4.put("generation", new jc6.a("generation", "INTEGER", true, 2, "0", 1));
            map4.put("system_id", new jc6.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new jc6.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            jc6 jc6Var4 = new jc6("SystemIdInfo", map4, hashSet7, new HashSet(0));
            jc6 jc6VarA4 = jc6.a(n96Var, "SystemIdInfo");
            if (!jc6Var4.equals(jc6VarA4)) {
                return new le5.c(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + jc6Var4 + "\n Found:\n" + jc6VarA4);
            }
            HashMap map5 = new HashMap(2);
            map5.put("name", new jc6.a("name", "TEXT", true, 1, null, 1));
            map5.put("work_spec_id", new jc6.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new jc6.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new jc6.e("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            jc6 jc6Var5 = new jc6("WorkName", map5, hashSet8, hashSet9);
            jc6 jc6VarA5 = jc6.a(n96Var, "WorkName");
            if (!jc6Var5.equals(jc6VarA5)) {
                return new le5.c(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + jc6Var5 + "\n Found:\n" + jc6VarA5);
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new jc6.a("work_spec_id", "TEXT", true, 1, null, 1));
            map6.put("progress", new jc6.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new jc6.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            jc6 jc6Var6 = new jc6("WorkProgress", map6, hashSet10, new HashSet(0));
            jc6 jc6VarA6 = jc6.a(n96Var, "WorkProgress");
            if (!jc6Var6.equals(jc6VarA6)) {
                return new le5.c(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + jc6Var6 + "\n Found:\n" + jc6VarA6);
            }
            HashMap map7 = new HashMap(2);
            map7.put("key", new jc6.a("key", "TEXT", true, 1, null, 1));
            map7.put("long_value", new jc6.a("long_value", "INTEGER", false, 0, null, 1));
            jc6 jc6Var7 = new jc6("Preference", map7, new HashSet(0), new HashSet(0));
            jc6 jc6VarA7 = jc6.a(n96Var, "Preference");
            if (jc6Var7.equals(jc6VarA7)) {
                return new le5.c(true, null);
            }
            return new le5.c(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + jc6Var7 + "\n Found:\n" + jc6VarA7);
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    public ki1 C() {
        ki1 ki1Var;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            try {
                if (this.r == null) {
                    this.r = new li1(this);
                }
                ki1Var = this.r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ki1Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public nu4 D() {
        nu4 nu4Var;
        if (this.w != null) {
            return this.w;
        }
        synchronized (this) {
            try {
                if (this.w == null) {
                    this.w = new ou4(this);
                }
                nu4Var = this.w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nu4Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public da6 E() {
        da6 da6Var;
        if (this.t != null) {
            return this.t;
        }
        synchronized (this) {
            try {
                if (this.t == null) {
                    this.t = new ea6(this);
                }
                da6Var = this.t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return da6Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public ny7 F() {
        ny7 ny7Var;
        if (this.u != null) {
            return this.u;
        }
        synchronized (this) {
            try {
                if (this.u == null) {
                    this.u = new oy7(this);
                }
                ny7Var = this.u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ny7Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public qy7 G() {
        qy7 qy7Var;
        if (this.v != null) {
            return this.v;
        }
        synchronized (this) {
            try {
                if (this.v == null) {
                    this.v = new ry7(this);
                }
                qy7Var = this.v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qy7Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public zy7 H() {
        zy7 zy7Var;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            try {
                if (this.q == null) {
                    this.q = new az7(this);
                }
                zy7Var = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zy7Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public dz7 I() {
        dz7 dz7Var;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            try {
                if (this.s == null) {
                    this.s = new ez7(this);
                }
                dz7Var = this.s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dz7Var;
    }

    @Override // com.zepto.je5
    public f13 g() {
        return new f13(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // com.zepto.je5
    public o96 h(ud1 ud1Var) {
        return ud1Var.c.a(o96.b.a(ud1Var.a).d(ud1Var.b).c(new le5(ud1Var, new a(20), "7d73d21f1bd82c9e5268b6dcf9fde2cb", "3071c8717539de5d5353f4c8cd59a032")).b());
    }

    @Override // com.zepto.je5
    public List j(Map map) {
        return Arrays.asList(new rx7(), new sx7(), new tx7(), new ux7(), new vx7(), new wx7());
    }

    @Override // com.zepto.je5
    public Set o() {
        return new HashSet();
    }

    @Override // com.zepto.je5
    public Map p() {
        HashMap map = new HashMap();
        map.put(zy7.class, az7.A());
        map.put(ki1.class, li1.e());
        map.put(dz7.class, ez7.e());
        map.put(da6.class, ea6.j());
        map.put(ny7.class, oy7.c());
        map.put(qy7.class, ry7.c());
        map.put(nu4.class, ou4.c());
        map.put(m45.class, n45.a());
        return map;
    }
}
