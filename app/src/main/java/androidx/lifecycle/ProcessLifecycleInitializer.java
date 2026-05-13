package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.p;
import com.zepto.df3;
import com.zepto.is;
import com.zepto.qy2;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u00070\u0006H\u0016¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lcom/zepto/qy2;", "Lcom/zepto/df3;", "Landroid/content/Context;", "context", "c", "", "Ljava/lang/Class;", "a", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
public final class ProcessLifecycleInitializer implements qy2 {
    @Override // com.zepto.qy2
    public List a() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // com.zepto.qy2
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public df3 b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        is isVarE = is.e(context);
        Intrinsics.checkNotNullExpressionValue(isVarE, "getInstance(context)");
        if (!isVarE.g(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
        }
        j.a(context);
        p.b bVar = p.i;
        bVar.b(context);
        return bVar.a();
    }
}
