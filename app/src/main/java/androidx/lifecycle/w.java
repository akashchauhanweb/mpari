package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.z;
import com.zepto.cm5;
import com.zepto.em5;
import com.zepto.fm5;
import com.zepto.h31;
import com.zepto.np;
import com.zepto.zq7;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class w extends z.d implements z.b {
    public Application b;
    public final z.b c;
    public Bundle d;
    public h e;
    public cm5 f;

    public w(Application application, em5 owner, Bundle bundle) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f = owner.o();
        this.e = owner.g0();
        this.d = bundle;
        this.b = application;
        this.c = application != null ? z.a.f.b(application) : new z.a();
    }

    @Override // androidx.lifecycle.z.b
    public zq7 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.z.b
    public zq7 b(Class modelClass, h31 extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.a(z.c.d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(v.a) == null || extras.a(v.b) == null) {
            if (this.e != null) {
                return d(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(z.a.h);
        boolean zIsAssignableFrom = np.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || application == null) ? fm5.c(modelClass, fm5.b) : fm5.c(modelClass, fm5.a);
        return constructorC == null ? this.c.b(modelClass, extras) : (!zIsAssignableFrom || application == null) ? fm5.d(modelClass, constructorC, v.a(extras)) : fm5.d(modelClass, constructorC, application, v.a(extras));
    }

    @Override // androidx.lifecycle.z.d
    public void c(zq7 viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        if (this.e != null) {
            cm5 cm5Var = this.f;
            Intrinsics.checkNotNull(cm5Var);
            h hVar = this.e;
            Intrinsics.checkNotNull(hVar);
            g.a(viewModel, cm5Var, hVar);
        }
    }

    public final zq7 d(String key, Class modelClass) {
        zq7 zq7VarD;
        Application application;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        h hVar = this.e;
        if (hVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = np.class.isAssignableFrom(modelClass);
        Constructor constructorC = (!zIsAssignableFrom || this.b == null) ? fm5.c(modelClass, fm5.b) : fm5.c(modelClass, fm5.a);
        if (constructorC == null) {
            return this.b != null ? this.c.a(modelClass) : z.c.b.a().a(modelClass);
        }
        cm5 cm5Var = this.f;
        Intrinsics.checkNotNull(cm5Var);
        u uVarB = g.b(cm5Var, hVar, key, this.d);
        if (!zIsAssignableFrom || (application = this.b) == null) {
            zq7VarD = fm5.d(modelClass, constructorC, uVarB.i());
        } else {
            Intrinsics.checkNotNull(application);
            zq7VarD = fm5.d(modelClass, constructorC, application, uVarB.i());
        }
        zq7VarD.f("androidx.lifecycle.savedstate.vm.tag", uVarB);
        return zq7VarD;
    }
}
