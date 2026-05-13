package com.zepto;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h24 {
    public final Context a;
    public final Intent b;
    public k24 c;
    public final List d;
    public Bundle e;

    public static final class a {
        public final int a;
        public final Bundle b;

        public a(int i, Bundle bundle) {
            this.a = i;
            this.b = bundle;
        }

        public final Bundle a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }
    }

    public h24(Context context) {
        Intent launchIntentForPackage;
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        if (context instanceof Activity) {
            launchIntentForPackage = new Intent(context, context.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.b = launchIntentForPackage;
        this.d = new ArrayList();
    }

    public static /* synthetic */ h24 g(h24 h24Var, int i, Bundle bundle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        return h24Var.f(i, bundle);
    }

    public final h24 a(int i, Bundle bundle) {
        this.d.add(new a(i, bundle));
        if (this.c != null) {
            h();
        }
        return this;
    }

    public final dd6 b() {
        if (this.c == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link".toString());
        }
        if (!(!this.d.isEmpty())) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link".toString());
        }
        c();
        dd6 dd6VarM = dd6.u(this.a).m(new Intent(this.b));
        Intrinsics.checkNotNullExpressionValue(dd6VarM, "create(context)\n        …rentStack(Intent(intent))");
        int iZ = dd6VarM.z();
        for (int i = 0; i < iZ; i++) {
            Intent intentW = dd6VarM.w(i);
            if (intentW != null) {
                intentW.putExtra("android-support-nav:controller:deepLinkIntent", this.b);
            }
        }
        return dd6VarM;
    }

    public final void c() {
        ArrayList arrayList = new ArrayList();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        j24 j24Var = null;
        for (a aVar : this.d) {
            int iB = aVar.b();
            Bundle bundleA = aVar.a();
            j24 j24VarD = d(iB);
            if (j24VarD == null) {
                throw new IllegalArgumentException("Navigation destination " + j24.m.b(this.a, iB) + " cannot be found in the navigation graph " + this.c);
            }
            for (int i : j24VarD.w(j24Var)) {
                arrayList.add(Integer.valueOf(i));
                arrayList2.add(bundleA);
            }
            j24Var = j24VarD;
        }
        this.b.putExtra("android-support-nav:controller:deepLinkIds", CollectionsKt___CollectionsKt.toIntArray(arrayList));
        this.b.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList2);
    }

    public final j24 d(int i) {
        ArrayDeque arrayDeque = new ArrayDeque();
        k24 k24Var = this.c;
        Intrinsics.checkNotNull(k24Var);
        arrayDeque.add(k24Var);
        while (!arrayDeque.isEmpty()) {
            j24 j24Var = (j24) arrayDeque.removeFirst();
            if (j24Var.P() == i) {
                return j24Var;
            }
            if (j24Var instanceof k24) {
                Iterator it = ((k24) j24Var).iterator();
                while (it.hasNext()) {
                    arrayDeque.add((j24) it.next());
                }
            }
        }
        return null;
    }

    public final h24 e(Bundle bundle) {
        this.e = bundle;
        this.b.putExtra("android-support-nav:controller:deepLinkExtras", bundle);
        return this;
    }

    public final h24 f(int i, Bundle bundle) {
        this.d.clear();
        this.d.add(new a(i, bundle));
        if (this.c != null) {
            h();
        }
        return this;
    }

    public final void h() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            int iB = ((a) it.next()).b();
            if (d(iB) == null) {
                throw new IllegalArgumentException("Navigation destination " + j24.m.b(this.a, iB) + " cannot be found in the navigation graph " + this.c);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h24(d24 navController) {
        this(navController.B());
        Intrinsics.checkNotNullParameter(navController, "navController");
        this.c = navController.F();
    }
}
