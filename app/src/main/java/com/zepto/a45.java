package com.zepto;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class a45 extends ConstraintLayout {
    public wq3 A;
    public final Runnable y;
    public int z;

    public a45(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(p05.n, this);
        dq7.u0(this, C());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m15.q5, i, 0);
        this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(m15.r5, 0);
        this.y = new Runnable() { // from class: com.zepto.z35
            @Override // java.lang.Runnable
            public final void run() {
                this.c.H();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    public static boolean G(View view) {
        return "skip".equals(view.getTag());
    }

    public final void B(List list, androidx.constraintlayout.widget.d dVar, int i) {
        Iterator it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            dVar.g(((View) it.next()).getId(), zz4.c, i, size);
            size += 360.0f / list.size();
        }
    }

    public final Drawable C() {
        wq3 wq3Var = new wq3();
        this.A = wq3Var;
        wq3Var.U(new c85(0.5f));
        this.A.W(ColorStateList.valueOf(-1));
        return this.A;
    }

    public int D(int i) {
        return i == 2 ? Math.round(this.z * 0.66f) : this.z;
    }

    public int E() {
        return this.z;
    }

    public void F(int i) {
        this.z = i;
        H();
    }

    public void H() {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.f(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != zz4.c && !G(childAt)) {
                int i2 = (Integer) childAt.getTag(zz4.m);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!map.containsKey(i2)) {
                    map.put(i2, new ArrayList());
                }
                ((List) map.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            B((List) entry.getValue(), dVar, D(((Integer) entry.getKey()).intValue()));
        }
        dVar.c(this);
    }

    public final void I() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.y);
            handler.post(this.y);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(dq7.k());
        }
        I();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        H();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        I();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.A.W(ColorStateList.valueOf(i));
    }
}
