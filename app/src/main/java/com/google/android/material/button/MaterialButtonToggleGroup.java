package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.button.MaterialButton;
import com.zepto.a2;
import com.zepto.br3;
import com.zepto.dq7;
import com.zepto.e06;
import com.zepto.g15;
import com.zepto.if6;
import com.zepto.m15;
import com.zepto.oz0;
import com.zepto.r3;
import com.zepto.wp3;
import com.zepto.x2;
import com.zepto.xy4;
import com.zepto.zr7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final int k = g15.t;
    public final List a;
    public final e b;
    public final LinkedHashSet c;
    public final Comparator d;
    public Integer[] e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final int i;
    public Set j;

    public class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    public class b extends x2 {
        public b() {
        }

        @Override // com.zepto.x2
        public void g(View view, r3 r3Var) {
            super.g(view, r3Var);
            r3Var.X(r3.d.a(0, 1, MaterialButtonToggleGroup.this.i(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    public static class c {
        public static final oz0 e = new a2(0.0f);
        public oz0 a;
        public oz0 b;
        public oz0 c;
        public oz0 d;

        public c(oz0 oz0Var, oz0 oz0Var2, oz0 oz0Var3, oz0 oz0Var4) {
            this.a = oz0Var;
            this.b = oz0Var3;
            this.c = oz0Var4;
            this.d = oz0Var2;
        }

        public static c a(c cVar) {
            oz0 oz0Var = e;
            return new c(oz0Var, cVar.d, oz0Var, cVar.c);
        }

        public static c b(c cVar, View view) {
            return zr7.g(view) ? c(cVar) : d(cVar);
        }

        public static c c(c cVar) {
            oz0 oz0Var = cVar.a;
            oz0 oz0Var2 = cVar.d;
            oz0 oz0Var3 = e;
            return new c(oz0Var, oz0Var2, oz0Var3, oz0Var3);
        }

        public static c d(c cVar) {
            oz0 oz0Var = e;
            return new c(oz0Var, oz0Var, cVar.b, cVar.c);
        }

        public static c e(c cVar, View view) {
            return zr7.g(view) ? d(cVar) : c(cVar);
        }

        public static c f(c cVar) {
            oz0 oz0Var = cVar.a;
            oz0 oz0Var2 = e;
            return new c(oz0Var, oz0Var2, cVar.b, oz0Var2);
        }
    }

    public interface d {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    public class e implements MaterialButton.a {
        public e() {
        }

        @Override // com.google.android.material.button.MaterialButton.a
        public void a(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        public /* synthetic */ e(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, xy4.w);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (k(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (k(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && k(i2)) {
                i++;
            }
        }
        return i;
    }

    public static void p(e06.b bVar, c cVar) {
        if (cVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.B(cVar.a).t(cVar.d).F(cVar.b).x(cVar.c);
        }
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(dq7.k());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        e(materialButton.getId(), materialButton.isChecked());
        e06 shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.a.add(new c(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        materialButton.setEnabled(isEnabled());
        dq7.q0(materialButton, new b());
    }

    public void b(d dVar) {
        this.c.add(dVar);
    }

    public final void c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButtonH = h(i);
            int iMin = Math.min(materialButtonH.getStrokeWidth(), h(i - 1).getStrokeWidth());
            LinearLayout.LayoutParams layoutParamsD = d(materialButtonH);
            if (getOrientation() == 0) {
                wp3.c(layoutParamsD, 0);
                wp3.d(layoutParamsD, -iMin);
                layoutParamsD.topMargin = 0;
            } else {
                layoutParamsD.bottomMargin = 0;
                layoutParamsD.topMargin = -iMin;
                wp3.d(layoutParamsD, 0);
            }
            materialButtonH.setLayoutParams(layoutParamsD);
        }
        n(firstVisibleChildIndex);
    }

    public final LinearLayout.LayoutParams d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        r();
        super.dispatchDraw(canvas);
    }

    public final void e(int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.j);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        q(hashSet);
    }

    public void f() {
        q(new HashSet());
    }

    public final void g(int i, boolean z) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a(this, i, z);
        }
    }

    public int getCheckedButtonId() {
        if (!this.g || this.j.isEmpty()) {
            return -1;
        }
        return ((Integer) this.j.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = h(i).getId();
            if (this.j.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.e;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    public final MaterialButton h(int i) {
        return (MaterialButton) getChildAt(i);
    }

    public final int i(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) == view) {
                return i;
            }
            if ((getChildAt(i2) instanceof MaterialButton) && k(i2)) {
                i++;
            }
        }
        return -1;
    }

    public final c j(int i, int i2, int i3) {
        c cVar = (c) this.a.get(i);
        if (i2 == i3) {
            return cVar;
        }
        boolean z = getOrientation() == 0;
        if (i == i2) {
            return z ? c.e(cVar, this) : c.f(cVar);
        }
        if (i == i3) {
            return z ? c.b(cVar, this) : c.a(cVar);
        }
        return null;
    }

    public final boolean k(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public boolean l() {
        return this.g;
    }

    public void m(MaterialButton materialButton, boolean z) {
        if (this.f) {
            return;
        }
        e(materialButton.getId(), z);
    }

    public final void n(int i) {
        if (getChildCount() == 0 || i == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) h(i).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            wp3.c(layoutParams, 0);
            wp3.d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    public final void o(int i, boolean z) {
        View viewFindViewById = findViewById(i);
        if (viewFindViewById instanceof MaterialButton) {
            this.f = true;
            ((MaterialButton) viewFindViewById).setChecked(z);
            this.f = false;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.i;
        if (i != -1) {
            q(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        r3.x0(accessibilityNodeInfo).W(r3.c.b(1, getVisibleButtonCount(), false, l() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        s();
        c();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.a.remove(iIndexOfChild);
        }
        s();
        c();
    }

    public final void q(Set set) {
        Set set2 = this.j;
        this.j = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = h(i).getId();
            o(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                g(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    public final void r() {
        TreeMap treeMap = new TreeMap(this.d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(h(i), Integer.valueOf(i));
        }
        this.e = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    public void s() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButtonH = h(i);
            if (materialButtonH.getVisibility() != 8) {
                e06.b bVarV = materialButtonH.getShapeAppearanceModel().v();
                p(bVarV, j(i, firstVisibleChildIndex, lastVisibleChildIndex));
                materialButtonH.setShapeAppearanceModel(bVarV.m());
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            h(i).setEnabled(z);
        }
    }

    public void setSelectionRequired(boolean z) {
        this.h = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.g != z) {
            this.g = z;
            f();
        }
        t();
    }

    public final void t() {
        for (int i = 0; i < getChildCount(); i++) {
            h(i).setA11yClassName((this.g ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i) {
        int i2 = k;
        super(br3.c(context, attributeSet, i, i2), attributeSet, i);
        this.a = new ArrayList();
        this.b = new e(this, null);
        this.c = new LinkedHashSet();
        this.d = new a();
        this.f = false;
        this.j = new HashSet();
        TypedArray typedArrayI = if6.i(getContext(), attributeSet, m15.X2, i, i2, new int[0]);
        setSingleSelection(typedArrayI.getBoolean(m15.b3, false));
        this.i = typedArrayI.getResourceId(m15.Z2, -1);
        this.h = typedArrayI.getBoolean(m15.a3, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayI.getBoolean(m15.Y2, true));
        typedArrayI.recycle();
        dq7.B0(this, 1);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
