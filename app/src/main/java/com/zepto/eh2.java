package com.zepto;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class eh2 {
    public static final eh2 a;
    public static final gh2 b;
    public static final gh2 c;

    static {
        eh2 eh2Var = new eh2();
        a = eh2Var;
        b = new fh2();
        c = eh2Var.b();
    }

    public static final void a(sf2 inFragment, sf2 outFragment, boolean z, nx sharedElements, boolean z2) {
        Intrinsics.checkNotNullParameter(inFragment, "inFragment");
        Intrinsics.checkNotNullParameter(outFragment, "outFragment");
        Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
        if (z) {
            outFragment.y();
        } else {
            inFragment.y();
        }
    }

    public static final void c(nx nxVar, nx namedViews) {
        Intrinsics.checkNotNullParameter(nxVar, "<this>");
        Intrinsics.checkNotNullParameter(namedViews, "namedViews");
        int size = nxVar.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!namedViews.containsKey((String) nxVar.m(size))) {
                nxVar.k(size);
            }
        }
    }

    public static final void d(List views, int i) {
        Intrinsics.checkNotNullParameter(views, "views");
        Iterator it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }

    public final gh2 b() {
        try {
            Intrinsics.checkNotNull(hh2.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (gh2) hh2.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
