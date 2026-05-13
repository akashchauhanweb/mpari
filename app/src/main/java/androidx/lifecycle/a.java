package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.z;
import com.zepto.cm5;
import com.zepto.em5;
import com.zepto.h31;
import com.zepto.zq7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends z.d implements z.b {
    public static final C0012a e = new C0012a(null);
    public cm5 b;
    public h c;
    public Bundle d;

    /* JADX INFO: renamed from: androidx.lifecycle.a$a, reason: collision with other inner class name */
    public static final class C0012a {
        public C0012a() {
        }

        public /* synthetic */ C0012a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(em5 owner, Bundle bundle) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.b = owner.o();
        this.c = owner.g0();
        this.d = bundle;
    }

    private final zq7 d(String str, Class cls) {
        cm5 cm5Var = this.b;
        Intrinsics.checkNotNull(cm5Var);
        h hVar = this.c;
        Intrinsics.checkNotNull(hVar);
        u uVarB = g.b(cm5Var, hVar, str, this.d);
        zq7 zq7VarE = e(str, cls, uVarB.i());
        zq7VarE.f("androidx.lifecycle.savedstate.vm.tag", uVarB);
        return zq7VarE;
    }

    @Override // androidx.lifecycle.z.b
    public zq7 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.c != null) {
            return d(canonicalName, modelClass);
        }
        throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.z.b
    public zq7 b(Class modelClass, h31 extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.a(z.c.d);
        if (str != null) {
            return this.b != null ? d(str, modelClass) : e(str, modelClass, v.a(extras));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.z.d
    public void c(zq7 viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        cm5 cm5Var = this.b;
        if (cm5Var != null) {
            Intrinsics.checkNotNull(cm5Var);
            h hVar = this.c;
            Intrinsics.checkNotNull(hVar);
            g.a(viewModel, cm5Var, hVar);
        }
    }

    public abstract zq7 e(String str, Class cls, s sVar);
}
