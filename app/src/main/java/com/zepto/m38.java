package com.zepto;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class m38 extends z38 {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ int c;

    public m38(Intent intent, Activity activity, int i) {
        this.a = intent;
        this.b = activity;
        this.c = i;
    }

    @Override // com.zepto.z38
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, this.c);
        }
    }
}
