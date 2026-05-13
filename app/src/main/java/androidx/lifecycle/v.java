package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.h;
import androidx.lifecycle.z;
import com.zepto.am5;
import com.zepto.cm5;
import com.zepto.dr7;
import com.zepto.em5;
import com.zepto.h31;
import com.zepto.zl5;
import com.zepto.zq7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public static final h31.b a = new b();
    public static final h31.b b = new c();
    public static final h31.b c = new a();

    public static final class a implements h31.b {
    }

    public static final class b implements h31.b {
    }

    public static final class c implements h31.b {
    }

    public static final class d implements z.b {
        @Override // androidx.lifecycle.z.b
        public zq7 b(Class modelClass, h31 extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new am5();
        }
    }

    public static final s a(h31 h31Var) {
        Intrinsics.checkNotNullParameter(h31Var, "<this>");
        em5 em5Var = (em5) h31Var.a(a);
        if (em5Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        dr7 dr7Var = (dr7) h31Var.a(b);
        if (dr7Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) h31Var.a(c);
        String str = (String) h31Var.a(z.c.d);
        if (str != null) {
            return b(em5Var, dr7Var, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    public static final s b(em5 em5Var, dr7 dr7Var, String str, Bundle bundle) {
        zl5 zl5VarD = d(em5Var);
        am5 am5VarE = e(dr7Var);
        s sVar = (s) am5VarE.g().get(str);
        if (sVar != null) {
            return sVar;
        }
        s sVarA = s.f.a(zl5VarD.b(str), bundle);
        am5VarE.g().put(str, sVarA);
        return sVarA;
    }

    public static final void c(em5 em5Var) {
        Intrinsics.checkNotNullParameter(em5Var, "<this>");
        h.b bVarB = em5Var.g0().b();
        if (bVarB != h.b.INITIALIZED && bVarB != h.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (em5Var.o().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            zl5 zl5Var = new zl5(em5Var.o(), (dr7) em5Var);
            em5Var.o().h("androidx.lifecycle.internal.SavedStateHandlesProvider", zl5Var);
            em5Var.g0().a(new t(zl5Var));
        }
    }

    public static final zl5 d(em5 em5Var) {
        Intrinsics.checkNotNullParameter(em5Var, "<this>");
        cm5.c cVarC = em5Var.o().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        zl5 zl5Var = cVarC instanceof zl5 ? (zl5) cVarC : null;
        if (zl5Var != null) {
            return zl5Var;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final am5 e(dr7 dr7Var) {
        Intrinsics.checkNotNullParameter(dr7Var, "<this>");
        return (am5) new z(dr7Var, new d()).b("androidx.lifecycle.internal.SavedStateHandlesVM", am5.class);
    }
}
