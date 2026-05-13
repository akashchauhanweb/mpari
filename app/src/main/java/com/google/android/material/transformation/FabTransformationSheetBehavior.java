package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import com.zepto.dq7;
import com.zepto.ex3;
import com.zepto.ht4;
import com.zepto.py4;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    public Map i;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public boolean L(View view, View view2, boolean z, boolean z2) {
        f0(view2, z);
        return super.L(view, view2, z, z2);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public FabTransformationBehavior.b d0(Context context, boolean z) {
        int i = z ? py4.d : py4.c;
        FabTransformationBehavior.b bVar = new FabTransformationBehavior.b();
        bVar.a = ex3.c(context, i);
        bVar.b = new ht4(17, 0.0f, 0.0f);
        return bVar;
    }

    public final void f0(View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.i = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (z) {
                        this.i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        dq7.B0(childAt, 4);
                    } else {
                        Map map = this.i;
                        if (map != null && map.containsKey(childAt)) {
                            dq7.B0(childAt, ((Integer) this.i.get(childAt)).intValue());
                        }
                    }
                }
            }
            if (z) {
                return;
            }
            this.i = null;
        }
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
