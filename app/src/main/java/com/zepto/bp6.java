package com.zepto;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import com.zepto.ie2;
import com.zepto.je2;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class bp6 {
    public ConcurrentHashMap a = new ConcurrentHashMap();

    public class a implements b {
        public a() {
        }

        @Override // com.zepto.bp6.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(je2.b bVar) {
            return bVar.e();
        }

        @Override // com.zepto.bp6.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(je2.b bVar) {
            return bVar.f();
        }
    }

    public interface b {
        int a(Object obj);

        boolean b(Object obj);
    }

    public static Object d(Object[] objArr, int i, b bVar) {
        return e(objArr, (i & 1) == 0 ? 400 : 700, (i & 2) != 0, bVar);
    }

    public static Object e(Object[] objArr, int i, boolean z, b bVar) {
        Object obj = null;
        int i2 = IntCompanionObject.MAX_VALUE;
        for (Object obj2 : objArr) {
            int iAbs = (Math.abs(bVar.a(obj2) - i) * 2) + (bVar.b(obj2) == z ? 0 : 1);
            if (obj == null || i2 > iAbs) {
                obj = obj2;
                i2 = iAbs;
            }
        }
        return obj;
    }

    public abstract Typeface a(Context context, ie2.c cVar, Resources resources, int i);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, je2.b[] bVarArr, int i);

    public Typeface c(Context context, Resources resources, int i, String str, int i2) {
        File fileD = cp6.d(context);
        if (fileD == null) {
            return null;
        }
        try {
            if (cp6.b(fileD, resources, i)) {
                return Typeface.createFromFile(fileD.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileD.delete();
        }
    }

    public je2.b f(je2.b[] bVarArr, int i) {
        return (je2.b) d(bVarArr, i, new a());
    }
}
