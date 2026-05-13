package com.zepto;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: loaded from: classes.dex */
public class ur extends SeekBar {
    public final vr a;

    public ur(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zy4.J);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.a.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.g(canvas);
    }

    public ur(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        jf6.a(this, getContext());
        vr vrVar = new vr(this);
        this.a = vrVar;
        vrVar.c(attributeSet, i);
    }
}
