package com.zepto;

import android.util.Property;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class ak0 extends Property {
    public static final Property a = new ak0("childrenAlpha");

    public ak0(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(zz4.F);
        return f != null ? f : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(ViewGroup viewGroup, Float f) {
        float fFloatValue = f.floatValue();
        viewGroup.setTag(zz4.F, Float.valueOf(fFloatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(fFloatValue);
        }
    }
}
