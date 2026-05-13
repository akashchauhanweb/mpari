package com.zepto;

import android.app.job.JobInfo;
import com.zepto.j10;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class so5 {

    public static class a {
        public uq0 a;
        public Map b = new HashMap();

        public a a(mv4 mv4Var, b bVar) {
            this.b.put(mv4Var, bVar);
            return this;
        }

        public so5 b() {
            if (this.a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.b.keySet().size() < mv4.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.b;
            this.b = new HashMap();
            return so5.d(this.a, map);
        }

        public a c(uq0 uq0Var) {
            this.a = uq0Var;
            return this;
        }
    }

    public static abstract class b {

        public static abstract class a {
            public abstract b a();

            public abstract a b(long j);

            public abstract a c(Set set);

            public abstract a d(long j);
        }

        public static a a() {
            return new j10.b().c(Collections.emptySet());
        }

        public abstract long b();

        public abstract Set c();

        public abstract long d();
    }

    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public static a b() {
        return new a();
    }

    public static so5 d(uq0 uq0Var, Map map) {
        return new i10(uq0Var, map);
    }

    public static so5 f(uq0 uq0Var) {
        return b().a(mv4.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(mv4.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(mv4.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(uq0Var).b();
    }

    public static Set i(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    public final long a(int i, long j) {
        return (long) (Math.pow(3.0d, i - 1) * j * Math.max(1.0d, Math.log(10000.0d) / Math.log((j > 1 ? j : 2L) * ((long) r7))));
    }

    public JobInfo.Builder c(JobInfo.Builder builder, mv4 mv4Var, long j, int i) {
        builder.setMinimumLatency(g(mv4Var, j, i));
        j(builder, ((b) h().get(mv4Var)).c());
        return builder;
    }

    public abstract uq0 e();

    public long g(mv4 mv4Var, long j, int i) {
        long jA = j - e().a();
        b bVar = (b) h().get(mv4Var);
        return Math.min(Math.max(a(i, bVar.b()), jA), bVar.d());
    }

    public abstract Map h();

    public final void j(JobInfo.Builder builder, Set set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}
