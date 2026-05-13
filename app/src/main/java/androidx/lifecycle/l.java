package androidx.lifecycle;

import com.zepto.b96;
import com.zepto.bf3;
import com.zepto.qk1;
import com.zepto.ye3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final ye3 a(h hVar) {
        i iVar;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        do {
            i iVar2 = (i) hVar.c().get();
            if (iVar2 != null) {
                return iVar2;
            }
            iVar = new i(hVar, b96.b(null, 1, null).plus(qk1.c().B0()));
        } while (!bf3.a(hVar.c(), null, iVar));
        iVar.j();
        return iVar;
    }
}
