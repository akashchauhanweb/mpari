package com.zepto;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public class yr {
    public static final RectF l = new RectF();
    public static ConcurrentHashMap m = new ConcurrentHashMap();
    public static ConcurrentHashMap n = new ConcurrentHashMap();
    public int a = 0;
    public boolean b = false;
    public float c = -1.0f;
    public float d = -1.0f;
    public float e = -1.0f;
    public int[] f = new int[0];
    public boolean g = false;
    public TextPaint h;
    public final TextView i;
    public final Context j;
    public final f k;

    public static final class a {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        public static int b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    public static final class b {
        public static boolean a(View view) {
            return view.isInLayout();
        }
    }

    public static final class c {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2, TextView textView, TextPaint textPaint, f fVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i2 == -1) {
                i2 = IntCompanionObject.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i2);
            try {
                fVar.a(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    public static class d extends f {
        @Override // com.zepto.yr.f
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) yr.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    public static class e extends d {
        @Override // com.zepto.yr.d, com.zepto.yr.f
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // com.zepto.yr.f
        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    public static class f {
        public abstract void a(StaticLayout.Builder builder, TextView textView);

        public boolean b(TextView textView) {
            return ((Boolean) yr.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public yr(TextView textView) {
        this.i = textView;
        this.j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.k = new e();
        } else {
            this.k = new d();
        }
    }

    public static Method k(String str) {
        try {
            Method declaredMethod = (Method) m.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                m.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    public static Object m(Object obj, String str, Object obj2) {
        try {
            return k(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return obj2;
        }
    }

    public void a() {
        if (n()) {
            if (this.b) {
                if (this.i.getMeasuredHeight() <= 0 || this.i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.k.b(this.i) ? 1048576 : (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fE = e(rectF);
                        if (fE != this.i.getTextSize()) {
                            t(0, fE);
                        }
                    } finally {
                    }
                }
            }
            this.b = true;
        }
    }

    public final int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    public final void c() {
        this.a = 0;
        this.d = -1.0f;
        this.e = -1.0f;
        this.c = -1.0f;
        this.f = new int[0];
        this.b = false;
    }

    public StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        return c.a(charSequence, alignment, i, i2, this.i, this.h, this.k);
    }

    public final int e(RectF rectF) {
        int length = this.f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = 1;
        int i2 = length - 1;
        int i3 = 0;
        while (i <= i2) {
            int i4 = (i + i2) / 2;
            if (x(this.f[i4], rectF)) {
                int i5 = i4 + 1;
                i3 = i;
                i = i5;
            } else {
                i3 = i4 - 1;
                i2 = i3;
            }
        }
        return this.f[i3];
    }

    public int f() {
        return Math.round(this.e);
    }

    public int g() {
        return Math.round(this.d);
    }

    public int h() {
        return Math.round(this.c);
    }

    public int[] i() {
        return this.f;
    }

    public int j() {
        return this.a;
    }

    public void l(int i) {
        TextPaint textPaint = this.h;
        if (textPaint == null) {
            this.h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.h.set(this.i.getPaint());
        this.h.setTextSize(i);
    }

    public boolean n() {
        return y() && this.a != 0;
    }

    public void o(AttributeSet attributeSet, int i) {
        int resourceId;
        Context context = this.j;
        int[] iArr = c25.g0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView = this.i;
        dq7.o0(textView, textView.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        int i2 = c25.l0;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            this.a = typedArrayObtainStyledAttributes.getInt(i2, 0);
        }
        int i3 = c25.k0;
        float dimension = typedArrayObtainStyledAttributes.hasValue(i3) ? typedArrayObtainStyledAttributes.getDimension(i3, -1.0f) : -1.0f;
        int i4 = c25.i0;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(i4) ? typedArrayObtainStyledAttributes.getDimension(i4, -1.0f) : -1.0f;
        int i5 = c25.h0;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(i5) ? typedArrayObtainStyledAttributes.getDimension(i5, -1.0f) : -1.0f;
        int i6 = c25.j0;
        if (typedArrayObtainStyledAttributes.hasValue(i6) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i6, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!y()) {
            this.a = 0;
            return;
        }
        if (this.a == 1) {
            if (!this.g) {
                DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    public void p(int i, int i2, int i3, int i4) {
        if (y()) {
            DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    public void q(int[] iArr, int i) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f = b(iArrCopyOf);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    public void r(int i) {
        if (y()) {
            if (i == 0) {
                c();
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
            DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        }
    }

    public final void s(float f2) {
        if (f2 != this.i.getPaint().getTextSize()) {
            this.i.getPaint().setTextSize(f2);
            boolean zA = b.a(this.i);
            if (this.i.getLayout() != null) {
                this.b = false;
                try {
                    Method methodK = k("nullLayouts");
                    if (methodK != null) {
                        methodK.invoke(this.i, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (zA) {
                    this.i.forceLayout();
                } else {
                    this.i.requestLayout();
                }
                this.i.invalidate();
            }
        }
    }

    public void t(int i, float f2) {
        Context context = this.j;
        s(TypedValue.applyDimension(i, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public final boolean u() {
        if (y() && this.a == 1) {
            if (!this.g || this.f.length == 0) {
                int iFloor = ((int) Math.floor((this.e - this.d) / this.c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round(this.d + (i * this.c));
                }
                this.f = b(iArr);
            }
            this.b = true;
        } else {
            this.b = false;
        }
        return this.b;
    }

    public final void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f = b(iArr);
            w();
        }
    }

    public final boolean w() {
        boolean z = this.f.length > 0;
        this.g = z;
        if (z) {
            this.a = 1;
            this.d = r0[0];
            this.e = r0[r1 - 1];
            this.c = -1.0f;
        }
        return z;
    }

    public final boolean x(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.i.getText();
        TransformationMethod transformationMethod = this.i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.i)) != null) {
            text = transformation;
        }
        int iB = a.b(this.i);
        l(i);
        StaticLayout staticLayoutD = d(text, (Layout.Alignment) m(this.i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), iB);
        return (iB == -1 || (staticLayoutD.getLineCount() <= iB && staticLayoutD.getLineEnd(staticLayoutD.getLineCount() - 1) == text.length())) && ((float) staticLayoutD.getHeight()) <= rectF.bottom;
    }

    public final boolean y() {
        return !(this.i instanceof AppCompatEditText);
    }

    public final void z(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        }
        if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
        this.a = 1;
        this.d = f2;
        this.e = f3;
        this.c = f4;
        this.g = false;
    }
}
