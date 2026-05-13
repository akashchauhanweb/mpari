package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.h;
import com.zepto.cm5;
import com.zepto.cr7;
import com.zepto.df3;
import com.zepto.dr7;
import com.zepto.em5;
import com.zepto.zq7;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final g a = new g();

    public static final class a implements cm5.a {
        @Override // com.zepto.cm5.a
        public void a(em5 owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            if (!(owner instanceof dr7)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
            }
            cr7 cr7VarB0 = ((dr7) owner).b0();
            cm5 cm5VarO = owner.o();
            Iterator it = cr7VarB0.c().iterator();
            while (it.hasNext()) {
                zq7 zq7VarB = cr7VarB0.b((String) it.next());
                Intrinsics.checkNotNull(zq7VarB);
                g.a(zq7VarB, cm5VarO, owner.g0());
            }
            if (!cr7VarB0.c().isEmpty()) {
                cm5VarO.i(a.class);
            }
        }
    }

    public static final class b implements k {
        public final /* synthetic */ h c;
        public final /* synthetic */ cm5 e;

        public b(h hVar, cm5 cm5Var) {
            this.c = hVar;
            this.e = cm5Var;
        }

        @Override // androidx.lifecycle.k
        public void e(df3 source, h.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == h.a.ON_START) {
                this.c.d(this);
                this.e.i(a.class);
            }
        }
    }

    public static final void a(zq7 viewModel, cm5 registry, h lifecycle) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        u uVar = (u) viewModel.d("androidx.lifecycle.savedstate.vm.tag");
        if (uVar == null || uVar.j()) {
            return;
        }
        uVar.c(registry, lifecycle);
        a.c(registry, lifecycle);
    }

    public static final u b(cm5 registry, h lifecycle, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNull(str);
        u uVar = new u(str, s.f.a(registry.b(str), bundle));
        uVar.c(registry, lifecycle);
        a.c(registry, lifecycle);
        return uVar;
    }

    public final void c(cm5 cm5Var, h hVar) {
        h.b bVarB = hVar.b();
        if (bVarB == h.b.INITIALIZED || bVarB.b(h.b.STARTED)) {
            cm5Var.i(a.class);
        } else {
            hVar.a(new b(hVar, cm5Var));
        }
    }
}
