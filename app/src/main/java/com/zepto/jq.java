package com.zepto;

import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class jq {
    public final Set a;
    public final mh4 b;
    public final b c;

    public static final class a {
        public final Set a;
        public mh4 b;
        public b c;

        public a(Set topLevelDestinationIds) {
            Intrinsics.checkNotNullParameter(topLevelDestinationIds, "topLevelDestinationIds");
            HashSet hashSet = new HashSet();
            this.a = hashSet;
            hashSet.addAll(topLevelDestinationIds);
        }

        public final jq a() {
            return new jq(this.a, this.b, this.c, null);
        }

        public final a b(b bVar) {
            this.c = bVar;
            return this;
        }

        public final a c(mh4 mh4Var) {
            this.b = mh4Var;
            return this;
        }
    }

    public interface b {
        boolean a();
    }

    public /* synthetic */ jq(Set set, mh4 mh4Var, b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, mh4Var, bVar);
    }

    public final b a() {
        return this.c;
    }

    public final mh4 b() {
        return this.b;
    }

    public final boolean c(j24 destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (j24 j24Var : j24.m.c(destination)) {
            if (this.a.contains(Integer.valueOf(j24Var.P())) && (!(j24Var instanceof k24) || destination.P() == k24.s.a((k24) j24Var).P())) {
                return true;
            }
        }
        return false;
    }

    public jq(Set set, mh4 mh4Var, b bVar) {
        this.a = set;
        this.b = mh4Var;
        this.c = bVar;
    }
}
