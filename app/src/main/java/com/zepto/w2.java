package com.zepto;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class w2 extends ClickableSpan {
    public final int a;
    public final r3 b;
    public final int c;

    public w2(int i, r3 r3Var, int i2) {
        this.a = i;
        this.b = r3Var;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.L(this.c, bundle);
    }
}
