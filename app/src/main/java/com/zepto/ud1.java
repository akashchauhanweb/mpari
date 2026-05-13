package com.zepto;

import android.content.Context;
import android.content.Intent;
import com.zepto.je5;
import com.zepto.o96;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class ud1 {
    public final Context a;
    public final String b;
    public final o96.c c;
    public final je5.e d;
    public final List e;
    public final boolean f;
    public final je5.d g;
    public final Executor h;
    public final Executor i;
    public final Intent j;
    public final boolean k;
    public final boolean l;
    public final Set m;
    public final String n;
    public final File o;
    public final Callable p;
    public final List q;
    public final List r;
    public final boolean s;

    public ud1(Context context, String str, o96.c sqliteOpenHelperFactory, je5.e migrationContainer, List list, boolean z, je5.d journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z2, boolean z3, Set set, String str2, File file, Callable callable, je5.f fVar, List typeConverters, List autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        this.a = context;
        this.b = str;
        this.c = sqliteOpenHelperFactory;
        this.d = migrationContainer;
        this.e = list;
        this.f = z;
        this.g = journalMode;
        this.h = queryExecutor;
        this.i = transactionExecutor;
        this.j = intent;
        this.k = z2;
        this.l = z3;
        this.m = set;
        this.n = str2;
        this.o = file;
        this.p = callable;
        this.q = typeConverters;
        this.r = autoMigrationSpecs;
        this.s = intent != null;
    }

    public boolean a(int i, int i2) {
        if ((i > i2 && this.l) || !this.k) {
            return false;
        }
        Set set = this.m;
        return set == null || !set.contains(Integer.valueOf(i));
    }
}
