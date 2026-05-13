package com.zepto;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* JADX INFO: loaded from: classes.dex */
public abstract class qe4 {
    public static ObjectAnimator a(Object obj, Property property, Path path) {
        return ObjectAnimator.ofObject(obj, (Property<Object, V>) property, (TypeConverter) null, path);
    }
}
