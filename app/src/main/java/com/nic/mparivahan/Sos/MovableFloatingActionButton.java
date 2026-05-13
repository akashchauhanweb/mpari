package com.nic.mparivahan.Sos;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: loaded from: classes2.dex */
public class MovableFloatingActionButton extends FloatingActionButton implements View.OnTouchListener {
    public float s;
    public float t;
    public float u;
    public float v;

    public MovableFloatingActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        n();
    }

    private void n() {
        setOnTouchListener(this);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.s = motionEvent.getRawX();
            this.t = motionEvent.getRawY();
            this.u = view.getX() - this.s;
            this.v = view.getY() - this.t;
            return true;
        }
        if (action != 2) {
            if (action != 1) {
                return super.onTouchEvent(motionEvent);
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float f = rawX - this.s;
            float f2 = rawY - this.t;
            if (Math.abs(f) >= 10.0f || Math.abs(f2) >= 10.0f) {
                return true;
            }
            return performClick();
        }
        int width = view.getWidth();
        int height = view.getHeight();
        View view2 = (View) view.getParent();
        int width2 = view2.getWidth();
        int height2 = view2.getHeight();
        view.animate().x(Math.min(width2 - width, Math.max(0.0f, motionEvent.getRawX() + this.u))).y(Math.min(height2 - height, Math.max(0.0f, motionEvent.getRawY() + this.v))).setDuration(0L).start();
        return true;
    }
}
