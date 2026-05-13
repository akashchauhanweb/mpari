package androidx.work;

import androidx.work.b;
import com.zepto.zy2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\b"}, d2 = {"Landroidx/work/OverwritingInputMerger;", "Lcom/zepto/zy2;", "", "Landroidx/work/b;", "inputs", "a", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
public final class OverwritingInputMerger extends zy2 {
    @Override // com.zepto.zy2
    public b a(List inputs) throws Throwable {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        b.a aVar = new b.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = inputs.iterator();
        while (it.hasNext()) {
            Map mapK = ((b) it.next()).k();
            Intrinsics.checkNotNullExpressionValue(mapK, "input.keyValueMap");
            linkedHashMap.putAll(mapK);
        }
        aVar.c(linkedHashMap);
        b bVarA = aVar.a();
        Intrinsics.checkNotNullExpressionValue(bVarA, "output.build()");
        return bVarA;
    }
}
