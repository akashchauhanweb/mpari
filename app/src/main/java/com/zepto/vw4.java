package com.zepto;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* JADX INFO: loaded from: classes.dex */
public abstract class vw4 {
    public static PropertyValuesHolder a(Property property, Path path) {
        return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
    }
}
