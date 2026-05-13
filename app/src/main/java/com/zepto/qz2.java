package com.zepto;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class qz2 implements View.OnTouchListener {
    public final Dialog a;
    public final int b;
    public final int c;
    public final int d;

    public qz2(Dialog dialog, Rect rect) {
        this.a = dialog;
        this.b = rect.left;
        this.c = rect.top;
        this.d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.b + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, this.c + viewFindViewById.getTop(), width, viewFindViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i = this.d;
            motionEventObtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.a.onTouchEvent(motionEventObtain);
    }
}
