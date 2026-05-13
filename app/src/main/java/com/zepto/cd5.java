package com.zepto;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class cd5 {
    public static cd5 i;
    public WeakHashMap a;
    public w26 b;
    public e56 c;
    public final WeakHashMap d = new WeakHashMap(0);
    public TypedValue e;
    public boolean f;
    public c g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static final a j = new a(6);

    public static class a extends no3 {
        public a(int i) {
            super(i);
        }

        public static int h(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        public PorterDuffColorFilter i(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) c(Integer.valueOf(h(i, mode)));
        }

        public PorterDuffColorFilter j(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) d(Integer.valueOf(h(i, mode)), porterDuffColorFilter);
        }
    }

    public interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface c {
        boolean a(Context context, int i, Drawable drawable);

        PorterDuff.Mode b(int i);

        Drawable c(cd5 cd5Var, Context context, int i);

        ColorStateList d(Context context, int i);

        boolean e(Context context, int i, Drawable drawable);
    }

    public static long d(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    public static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized cd5 g() {
        try {
            if (i == null) {
                cd5 cd5Var = new cd5();
                i = cd5Var;
                o(cd5Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }

    public static synchronized PorterDuffColorFilter k(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterI;
        a aVar = j;
        porterDuffColorFilterI = aVar.i(i2, mode);
        if (porterDuffColorFilterI == null) {
            porterDuffColorFilterI = new PorterDuffColorFilter(i2, mode);
            aVar.j(i2, mode, porterDuffColorFilterI);
        }
        return porterDuffColorFilterI;
    }

    public static void o(cd5 cd5Var) {
    }

    public static boolean p(Drawable drawable) {
        return (drawable instanceof om7) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    public static void v(Drawable drawable, jg6 jg6Var, int[] iArr) {
        int[] state = drawable.getState();
        if (zw1.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = jg6Var.d;
        if (z || jg6Var.c) {
            drawable.setColorFilter(f(z ? jg6Var.a : null, jg6Var.c ? jg6Var.b : h, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    public final synchronized boolean a(Context context, long j2, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            io3 io3Var = (io3) this.d.get(context);
            if (io3Var == null) {
                io3Var = new io3();
                this.d.put(context, io3Var);
            }
            io3Var.h(j2, new WeakReference(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(Context context, int i2, ColorStateList colorStateList) {
        if (this.a == null) {
            this.a = new WeakHashMap();
        }
        e56 e56Var = (e56) this.a.get(context);
        if (e56Var == null) {
            e56Var = new e56();
            this.a.put(context, e56Var);
        }
        e56Var.a(i2, colorStateList);
    }

    public final void c(Context context) {
        if (this.f) {
            return;
        }
        this.f = true;
        Drawable drawableI = i(context, mz4.a);
        if (drawableI == null || !p(drawableI)) {
            this.f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    public final Drawable e(Context context, int i2) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i2, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        c cVar = this.g;
        Drawable drawableC = cVar == null ? null : cVar.c(this, context, i2);
        if (drawableC != null) {
            drawableC.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, jD, drawableC);
        }
        return drawableC;
    }

    public final synchronized Drawable h(Context context, long j2) {
        io3 io3Var = (io3) this.d.get(context);
        if (io3Var == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) io3Var.d(j2);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            io3Var.i(j2);
        }
        return null;
    }

    public synchronized Drawable i(Context context, int i2) {
        return j(context, i2, false);
    }

    public synchronized Drawable j(Context context, int i2, boolean z) {
        Drawable drawableQ;
        try {
            c(context);
            drawableQ = q(context, i2);
            if (drawableQ == null) {
                drawableQ = e(context, i2);
            }
            if (drawableQ == null) {
                drawableQ = yy0.e(context, i2);
            }
            if (drawableQ != null) {
                drawableQ = u(context, i2, z, drawableQ);
            }
            if (drawableQ != null) {
                zw1.b(drawableQ);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableQ;
    }

    public synchronized ColorStateList l(Context context, int i2) {
        ColorStateList colorStateListM;
        colorStateListM = m(context, i2);
        if (colorStateListM == null) {
            c cVar = this.g;
            colorStateListM = cVar == null ? null : cVar.d(context, i2);
            if (colorStateListM != null) {
                b(context, i2, colorStateListM);
            }
        }
        return colorStateListM;
    }

    public final ColorStateList m(Context context, int i2) {
        e56 e56Var;
        WeakHashMap weakHashMap = this.a;
        if (weakHashMap == null || (e56Var = (e56) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) e56Var.e(i2);
    }

    public PorterDuff.Mode n(int i2) {
        c cVar = this.g;
        if (cVar == null) {
            return null;
        }
        return cVar.b(i2);
    }

    public final Drawable q(Context context, int i2) {
        int next;
        w26 w26Var = this.b;
        if (w26Var == null || w26Var.isEmpty()) {
            return null;
        }
        e56 e56Var = this.c;
        if (e56Var != null) {
            String str = (String) e56Var.e(i2);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.b.get(str) == null)) {
                return null;
            }
        } else {
            this.c = new e56();
        }
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long jD = d(typedValue);
        Drawable drawableH = h(context, jD);
        if (drawableH != null) {
            return drawableH;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.c.a(i2, name);
                b bVar = (b) this.b.get(name);
                if (bVar != null) {
                    drawableH = bVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableH != null) {
                    drawableH.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, jD, drawableH);
                }
            } catch (Exception e) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e);
            }
        }
        if (drawableH == null) {
            this.c.a(i2, "appcompat_skip_skip");
        }
        return drawableH;
    }

    public synchronized void r(Context context) {
        io3 io3Var = (io3) this.d.get(context);
        if (io3Var != null) {
            io3Var.a();
        }
    }

    public synchronized Drawable s(Context context, pm7 pm7Var, int i2) {
        try {
            Drawable drawableQ = q(context, i2);
            if (drawableQ == null) {
                drawableQ = pm7Var.a(i2);
            }
            if (drawableQ == null) {
                return null;
            }
            return u(context, i2, false, drawableQ);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void t(c cVar) {
        this.g = cVar;
    }

    public final Drawable u(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList colorStateListL = l(context, i2);
        if (colorStateListL == null) {
            c cVar = this.g;
            if ((cVar == null || !cVar.e(context, i2, drawable)) && !w(context, i2, drawable) && z) {
                return null;
            }
            return drawable;
        }
        if (zw1.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable drawableR = tw1.r(drawable);
        tw1.o(drawableR, colorStateListL);
        PorterDuff.Mode modeN = n(i2);
        if (modeN == null) {
            return drawableR;
        }
        tw1.p(drawableR, modeN);
        return drawableR;
    }

    public boolean w(Context context, int i2, Drawable drawable) {
        c cVar = this.g;
        return cVar != null && cVar.a(context, i2, drawable);
    }
}
