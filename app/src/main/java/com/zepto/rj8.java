package com.zepto;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class rj8 extends xk8 {
    public final z68 a;
    public final rh8 b;
    public final /* synthetic */ vk8 c;

    public rj8(vk8 vk8Var, z68 z68Var, rh8 rh8Var) {
        this.c = vk8Var;
        this.a = z68Var;
        this.b = rh8Var;
    }

    public void b(Bundle bundle) {
        this.c.a.s(this.b);
        this.a.d("onRequestInfo", new Object[0]);
    }

    public void w(Bundle bundle) {
        this.c.a.s(this.b);
        this.a.d("onCompleteUpdate", new Object[0]);
    }
}
