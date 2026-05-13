package androidx.lifecycle;

import androidx.lifecycle.h;
import com.zepto.df3;
import com.zepto.rt3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c implements k {
    public final e[] c;

    public c(e[] generatedAdapters) {
        Intrinsics.checkNotNullParameter(generatedAdapters, "generatedAdapters");
        this.c = generatedAdapters;
    }

    @Override // androidx.lifecycle.k
    public void e(df3 source, h.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        new rt3();
        e[] eVarArr = this.c;
        if (eVarArr.length > 0) {
            e eVar = eVarArr[0];
            throw null;
        }
        if (eVarArr.length <= 0) {
            return;
        }
        e eVar2 = eVarArr[0];
        throw null;
    }
}
