package com.zepto;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public abstract class vo6 {
    public static boolean a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !h(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    public static int b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !h(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    public static ColorStateList c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (!h(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        int i2 = typedValue.type;
        if (i2 != 2) {
            return (i2 < 28 || i2 > 31) ? rr0.d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme) : d(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
    }

    public static ColorStateList d(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static rt0 e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (h(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return rt0.b(typedValue.data);
            }
            rt0 rt0VarG = rt0.g(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (rt0VarG != null) {
                return rt0VarG;
            }
        }
        return rt0.b(i2);
    }

    public static float f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !h(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static int g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !h(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static boolean h(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray i(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
