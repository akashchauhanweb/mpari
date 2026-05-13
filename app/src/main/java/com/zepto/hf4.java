package com.zepto;

import android.os.IBinder;
import com.zepto.vw2;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class hf4 extends vw2.a {
    public final Object a;

    public hf4(Object obj) {
        this.a = obj;
    }

    public static Object j(vw2 vw2Var) {
        if (vw2Var instanceof hf4) {
            return ((hf4) vw2Var).a;
        }
        IBinder iBinderAsBinder = vw2Var.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        iu4.i(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }

    public static vw2 p0(Object obj) {
        return new hf4(obj);
    }
}
