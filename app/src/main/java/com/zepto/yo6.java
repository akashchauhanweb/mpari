package com.zepto;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.zepto.ie2;
import com.zepto.je2;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class yo6 extends xo6 {
    public final Class g;
    public final Constructor h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;
    public final Method m;

    public yo6() {
        Class clsT;
        Constructor constructorU;
        Method methodQ;
        Method methodR;
        Method methodV;
        Method methodP;
        Method methodS;
        try {
            clsT = t();
            constructorU = u(clsT);
            methodQ = q(clsT);
            methodR = r(clsT);
            methodV = v(clsT);
            methodP = p(clsT);
            methodS = s(clsT);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            clsT = null;
            constructorU = null;
            methodQ = null;
            methodR = null;
            methodV = null;
            methodP = null;
            methodS = null;
        }
        this.g = clsT;
        this.h = constructorU;
        this.i = methodQ;
        this.j = methodR;
        this.k = methodV;
        this.l = methodP;
        this.m = methodS;
    }

    @Override // com.zepto.xo6, com.zepto.bp6
    public Typeface a(Context context, ie2.c cVar, Resources resources, int i) {
        if (!o()) {
            return super.a(context, cVar, resources, i);
        }
        Object objJ = j();
        if (objJ == null) {
            return null;
        }
        for (ie2.d dVar : cVar.a()) {
            if (!l(context, objJ, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                k(objJ);
                return null;
            }
        }
        if (n(objJ)) {
            return h(objJ);
        }
        return null;
    }

    @Override // com.zepto.bp6
    public Typeface b(Context context, CancellationSignal cancellationSignal, je2.b[] bVarArr, int i) {
        Typeface typefaceH;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!o()) {
            je2.b bVarF = f(bVarArr, i);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarF.d(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(bVarF.e()).setItalic(bVarF.f()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map mapF = cp6.f(context, bVarArr, cancellationSignal);
        Object objJ = j();
        if (objJ == null) {
            return null;
        }
        boolean z = false;
        for (je2.b bVar : bVarArr) {
            ByteBuffer byteBuffer = (ByteBuffer) mapF.get(bVar.d());
            if (byteBuffer != null) {
                if (!m(objJ, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                    k(objJ);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            k(objJ);
            return null;
        }
        if (n(objJ) && (typefaceH = h(objJ)) != null) {
            return Typeface.create(typefaceH, i);
        }
        return null;
    }

    @Override // com.zepto.bp6
    public Typeface c(Context context, Resources resources, int i, String str, int i2) {
        if (!o()) {
            return super.c(context, resources, i, str, i2);
        }
        Object objJ = j();
        if (objJ == null) {
            return null;
        }
        if (!l(context, objJ, str, 0, -1, -1, null)) {
            k(objJ);
            return null;
        }
        if (n(objJ)) {
            return h(objJ);
        }
        return null;
    }

    public Typeface h(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final Object j() {
        try {
            return this.h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public final void k(Object obj) {
        try {
            this.l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean l(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean m(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.j.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean n(Object obj) {
        try {
            return ((Boolean) this.k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean o() {
        if (this.i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.i != null;
    }

    public Method p(Class cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    public Method q(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Method r(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method s(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Class t() {
        return Class.forName("android.graphics.FontFamily");
    }

    public Constructor u(Class cls) {
        return cls.getConstructor(new Class[0]);
    }

    public Method v(Class cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}
