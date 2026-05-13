package com.zepto;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ba0 extends androidx.recyclerview.widget.j {
    public androidx.recyclerview.widget.i f;
    public androidx.recyclerview.widget.i g;

    @Override // androidx.recyclerview.widget.j, androidx.recyclerview.widget.n
    public int[] c(RecyclerView.p layoutManager, View targetView) {
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        int[] iArr = new int[2];
        iArr[0] = layoutManager.p() ? r(targetView, m(layoutManager)) : 0;
        iArr[1] = layoutManager.q() ? r(targetView, o(layoutManager)) : 0;
        return iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.recyclerview.widget.i m(androidx.recyclerview.widget.RecyclerView.p r3) {
        /*
            r2 = this;
            androidx.recyclerview.widget.i r0 = r2.g
            java.lang.String r1 = "horizontalHelper"
            if (r0 == 0) goto L17
            if (r0 != 0) goto Lb
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        Lb:
            androidx.recyclerview.widget.RecyclerView$p r0 = r0.k()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            r0 = r0 ^ 1
            if (r0 == 0) goto L22
        L17:
            androidx.recyclerview.widget.i r3 = androidx.recyclerview.widget.i.a(r3)
            java.lang.String r0 = "OrientationHelper.create…ntalHelper(layoutManager)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            r2.g = r3
        L22:
            androidx.recyclerview.widget.i r3 = r2.g
            if (r3 != 0) goto L29
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L29:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.ba0.m(androidx.recyclerview.widget.RecyclerView$p):androidx.recyclerview.widget.i");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.recyclerview.widget.i o(androidx.recyclerview.widget.RecyclerView.p r3) {
        /*
            r2 = this;
            androidx.recyclerview.widget.i r0 = r2.f
            java.lang.String r1 = "verticalHelper"
            if (r0 == 0) goto L17
            if (r0 != 0) goto Lb
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        Lb:
            androidx.recyclerview.widget.RecyclerView$p r0 = r0.k()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            r0 = r0 ^ 1
            if (r0 == 0) goto L22
        L17:
            androidx.recyclerview.widget.i r3 = androidx.recyclerview.widget.i.c(r3)
            java.lang.String r0 = "OrientationHelper.create…icalHelper(layoutManager)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            r2.f = r3
        L22:
            androidx.recyclerview.widget.i r3 = r2.f
            if (r3 != 0) goto L29
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L29:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.ba0.o(androidx.recyclerview.widget.RecyclerView$p):androidx.recyclerview.widget.i");
    }

    public final int r(View view, androidx.recyclerview.widget.i iVar) {
        return iVar.g(view) - iVar.n();
    }
}
