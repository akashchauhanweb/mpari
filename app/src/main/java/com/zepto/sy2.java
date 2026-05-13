package com.zepto;

import androidx.lifecycle.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
public final class sy2 {
    public final List a = new ArrayList();

    public final void a(KClass clazz, Function1 initializer) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.a.add(new ar7(JvmClassMappingKt.getJavaClass(clazz), initializer));
    }

    public final z.b b() {
        ar7[] ar7VarArr = (ar7[]) this.a.toArray(new ar7[0]);
        return new ry2((ar7[]) Arrays.copyOf(ar7VarArr, ar7VarArr.length));
    }
}
