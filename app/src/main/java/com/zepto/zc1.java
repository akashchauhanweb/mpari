package com.zepto;

import com.zepto.jq;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zc1 implements jq.b, FunctionAdapter {
    public final /* synthetic */ Function0 a;

    public zc1(Function0 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.a = function;
    }

    @Override // com.zepto.jq.b
    public final /* synthetic */ boolean a() {
        return ((Boolean) this.a.invoke()).booleanValue();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof jq.b) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
