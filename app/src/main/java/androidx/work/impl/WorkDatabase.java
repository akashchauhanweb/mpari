package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.zepto.da6;
import com.zepto.dz7;
import com.zepto.fq0;
import com.zepto.fu3;
import com.zepto.gu3;
import com.zepto.hu3;
import com.zepto.ie5;
import com.zepto.iu3;
import com.zepto.je5;
import com.zepto.ju3;
import com.zepto.ki1;
import com.zepto.ku3;
import com.zepto.lu3;
import com.zepto.ly7;
import com.zepto.mu3;
import com.zepto.nu3;
import com.zepto.nu4;
import com.zepto.ny7;
import com.zepto.o96;
import com.zepto.ou3;
import com.zepto.ph2;
import com.zepto.qy7;
import com.zepto.wc5;
import com.zepto.xq0;
import com.zepto.zy7;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\nH&J\b\u0010\r\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u000eH&¨\u0006\u0014"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Lcom/zepto/je5;", "Lcom/zepto/zy7;", "H", "Lcom/zepto/ki1;", "C", "Lcom/zepto/dz7;", "I", "Lcom/zepto/da6;", "E", "Lcom/zepto/ny7;", "F", "Lcom/zepto/qy7;", "G", "Lcom/zepto/nu4;", "D", "<init>", "()V", "p", "a", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
public abstract class WorkDatabase extends je5 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: androidx.work.impl.WorkDatabase$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final o96 c(Context context, o96.b configuration) {
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            o96.b.a aVarA = o96.b.f.a(context);
            aVarA.d(configuration.b).c(configuration.c).e(true).a(true);
            return new ph2().a(aVarA.b());
        }

        public final WorkDatabase b(final Context context, Executor queryExecutor, xq0 clock, boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return (WorkDatabase) (z ? ie5.c(context, WorkDatabase.class).c() : ie5.a(context, WorkDatabase.class, "androidx.work.workdb").f(new o96.c() { // from class: com.zepto.nx7
                @Override // com.zepto.o96.c
                public final o96 a(o96.b bVar) {
                    return WorkDatabase.Companion.c(context, bVar);
                }
            })).g(queryExecutor).a(new fq0(clock)).b(ju3.c).b(new wc5(context, 2, 3)).b(ku3.c).b(lu3.c).b(new wc5(context, 5, 6)).b(mu3.c).b(nu3.c).b(ou3.c).b(new ly7(context)).b(new wc5(context, 10, 11)).b(fu3.c).b(gu3.c).b(hu3.c).b(iu3.c).e().d();
        }
    }

    public abstract ki1 C();

    public abstract nu4 D();

    public abstract da6 E();

    public abstract ny7 F();

    public abstract qy7 G();

    public abstract zy7 H();

    public abstract dz7 I();
}
