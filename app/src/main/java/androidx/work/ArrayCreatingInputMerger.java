package androidx.work;

import androidx.work.b;
import com.zepto.zy2;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J&\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0002J\u001e\u0010\u000f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0002¨\u0006\u0012"}, d2 = {"Landroidx/work/ArrayCreatingInputMerger;", "Lcom/zepto/zy2;", "", "Landroidx/work/b;", "inputs", "a", "", "array1", "array2", "c", "array", "obj", "Ljava/lang/Class;", "valueClass", "b", "d", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
public final class ArrayCreatingInputMerger extends zy2 {
    @Override // com.zepto.zy2
    public b a(List inputs) throws Throwable {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        b.a aVar = new b.a();
        HashMap map = new HashMap();
        Iterator it = inputs.iterator();
        while (it.hasNext()) {
            Map mapK = ((b) it.next()).k();
            Intrinsics.checkNotNullExpressionValue(mapK, "input.keyValueMap");
            for (Map.Entry entry : mapK.entrySet()) {
                String key = (String) entry.getKey();
                Object value = entry.getValue();
                Class cls = value != null ? value.getClass() : String.class;
                Object obj = map.get(key);
                Intrinsics.checkNotNullExpressionValue(key, "key");
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (Intrinsics.areEqual(cls2, cls)) {
                        Intrinsics.checkNotNullExpressionValue(value, "value");
                        value = c(obj, value);
                    } else {
                        if (!Intrinsics.areEqual(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        value = b(obj, value, cls);
                    }
                } else if (!cls.isArray()) {
                    value = d(value, cls);
                }
                Intrinsics.checkNotNullExpressionValue(value, "if (existingValue == nul…      }\n                }");
                map.put(key, value);
            }
        }
        aVar.c(map);
        b bVarA = aVar.a();
        Intrinsics.checkNotNullExpressionValue(bVarA, "output.build()");
        return bVarA;
    }

    public final Object b(Object array, Object obj, Class valueClass) {
        int length = Array.getLength(array);
        Object newArray = Array.newInstance((Class<?>) valueClass, length + 1);
        System.arraycopy(array, 0, newArray, 0, length);
        Array.set(newArray, length, obj);
        Intrinsics.checkNotNullExpressionValue(newArray, "newArray");
        return newArray;
    }

    public final Object c(Object array1, Object array2) {
        int length = Array.getLength(array1);
        int length2 = Array.getLength(array2);
        Class<?> componentType = array1.getClass().getComponentType();
        Intrinsics.checkNotNull(componentType);
        Object newArray = Array.newInstance(componentType, length + length2);
        System.arraycopy(array1, 0, newArray, 0, length);
        System.arraycopy(array2, 0, newArray, length, length2);
        Intrinsics.checkNotNullExpressionValue(newArray, "newArray");
        return newArray;
    }

    public final Object d(Object obj, Class valueClass) {
        Object newArray = Array.newInstance((Class<?>) valueClass, 1);
        Array.set(newArray, 0, obj);
        Intrinsics.checkNotNullExpressionValue(newArray, "newArray");
        return newArray;
    }
}
