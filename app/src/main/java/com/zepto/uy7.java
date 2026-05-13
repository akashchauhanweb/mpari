package com.zepto;

import java.util.Set;
import java.util.UUID;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class uy7 {
    public static final b d = new b(null);
    public final UUID a;
    public final yy7 b;
    public final Set c;

    public static abstract class a {
        public final Class a;
        public boolean b;
        public UUID c;
        public yy7 d;
        public final Set e;

        public a(Class workerClass) {
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            this.a = workerClass;
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID()");
            this.c = uuidRandomUUID;
            String string = this.c.toString();
            Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
            String name = workerClass.getName();
            Intrinsics.checkNotNullExpressionValue(name, "workerClass.name");
            this.d = new yy7(string, name);
            String name2 = workerClass.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "workerClass.name");
            this.e = SetsKt__SetsKt.mutableSetOf(name2);
        }

        public final uy7 a() {
            uy7 uy7VarB = b();
            lx0 lx0Var = this.d.j;
            boolean z = lx0Var.e() || lx0Var.f() || lx0Var.g() || lx0Var.h();
            yy7 yy7Var = this.d;
            if (yy7Var.q) {
                if (!(!z)) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
                }
                if (yy7Var.g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                }
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID()");
            i(uuidRandomUUID);
            return uy7VarB;
        }

        public abstract uy7 b();

        public final boolean c() {
            return this.b;
        }

        public final UUID d() {
            return this.c;
        }

        public final Set e() {
            return this.e;
        }

        public abstract a f();

        public final yy7 g() {
            return this.d;
        }

        public final a h(lx0 constraints) {
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            this.d.j = constraints;
            return f();
        }

        public final a i(UUID id) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.c = id;
            String string = id.toString();
            Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
            this.d = new yy7(string, this.d);
            return f();
        }

        public final a j(androidx.work.b inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.d.e = inputData;
            return f();
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public uy7(UUID id, yy7 workSpec, Set tags) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.a = id;
        this.b = workSpec;
        this.c = tags;
    }

    public UUID a() {
        return this.a;
    }

    public final String b() {
        String string = a().toString();
        Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
        return string;
    }

    public final Set c() {
        return this.c;
    }

    public final yy7 d() {
        return this.b;
    }
}
