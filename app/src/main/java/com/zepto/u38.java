package com.zepto;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class u38 extends z38 {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ af3 b;

    public u38(Intent intent, af3 af3Var, int i) {
        this.a = intent;
        this.b = af3Var;
    }

    @Override // com.zepto.z38
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
