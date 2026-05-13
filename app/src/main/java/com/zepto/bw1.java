package com.zepto;

import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public class bw1 extends FutureTask implements Comparable {
    public final qw1 c;

    public bw1(qw1 qw1Var) {
        super(qw1Var, null);
        this.c = qw1Var;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(bw1 bw1Var) {
        qw1 qw1Var = this.c;
        nv4 nv4Var = qw1Var.c;
        qw1 qw1Var2 = bw1Var.c;
        nv4 nv4Var2 = qw1Var2.c;
        return nv4Var == nv4Var2 ? qw1Var.e - qw1Var2.e : nv4Var2.ordinal() - nv4Var.ordinal();
    }
}
