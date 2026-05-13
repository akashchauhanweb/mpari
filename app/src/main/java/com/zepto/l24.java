package com.zepto;

import android.os.Bundle;
import com.zepto.g34;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@g34.b("navigation")
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J*\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J$\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/zepto/l24;", "Lcom/zepto/g34;", "Lcom/zepto/k24;", "l", "", "Lcom/zepto/a24;", "entries", "Lcom/zepto/r24;", "navOptions", "Lcom/zepto/g34$a;", "navigatorExtras", "", "e", "entry", "m", "Lcom/zepto/h34;", "c", "Lcom/zepto/h34;", "navigatorProvider", "<init>", "(Lcom/zepto/h34;)V", "navigation-common_release"}, k = 1, mv = {1, 8, 0})
public class l24 extends g34 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final h34 navigatorProvider;

    public l24(h34 navigatorProvider) {
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        this.navigatorProvider = navigatorProvider;
    }

    @Override // com.zepto.g34
    public void e(List entries, r24 navOptions, g34.a navigatorExtras) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            m((a24) it.next(), navOptions, navigatorExtras);
        }
    }

    @Override // com.zepto.g34
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public k24 a() {
        return new k24(this);
    }

    public final void m(a24 entry, r24 navOptions, g34.a navigatorExtras) {
        j24 j24VarE = entry.e();
        Intrinsics.checkNotNull(j24VarE, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        k24 k24Var = (k24) j24VarE;
        Bundle bundleC = entry.c();
        int iV0 = k24Var.v0();
        String strW0 = k24Var.w0();
        if (iV0 == 0 && strW0 == null) {
            throw new IllegalStateException(("no start destination defined via app:startDestination for " + k24Var.O()).toString());
        }
        j24 j24VarS0 = strW0 != null ? k24Var.s0(strW0, false) : k24Var.q0(iV0, false);
        if (j24VarS0 != null) {
            this.navigatorProvider.d(j24VarS0.T()).e(CollectionsKt__CollectionsJVMKt.listOf(b().a(j24VarS0, j24VarS0.u(bundleC))), navOptions, navigatorExtras);
            return;
        }
        throw new IllegalArgumentException("navigation destination " + k24Var.u0() + " is not a direct child of this NavGraph");
    }
}
