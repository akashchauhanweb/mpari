package androidx.work;

import android.net.Network;
import com.zepto.hz7;
import com.zepto.se2;
import com.zepto.tw4;
import com.zepto.uc6;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerParameters {
    public UUID a;
    public b b;
    public Set c;
    public a d;
    public int e;
    public Executor f;
    public uc6 g;
    public hz7 h;
    public tw4 i;
    public se2 j;
    public int k;

    public static class a {
        public List a = Collections.emptyList();
        public List b = Collections.emptyList();
        public Network c;
    }

    public WorkerParameters(UUID uuid, b bVar, Collection collection, a aVar, int i, int i2, Executor executor, uc6 uc6Var, hz7 hz7Var, tw4 tw4Var, se2 se2Var) {
        this.a = uuid;
        this.b = bVar;
        this.c = new HashSet(collection);
        this.d = aVar;
        this.e = i;
        this.k = i2;
        this.f = executor;
        this.g = uc6Var;
        this.h = hz7Var;
        this.i = tw4Var;
        this.j = se2Var;
    }

    public Executor a() {
        return this.f;
    }

    public se2 b() {
        return this.j;
    }

    public UUID c() {
        return this.a;
    }

    public b d() {
        return this.b;
    }

    public uc6 e() {
        return this.g;
    }

    public hz7 f() {
        return this.h;
    }
}
