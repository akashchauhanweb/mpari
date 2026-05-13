package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.zepto.ax0;
import com.zepto.e50;
import com.zepto.h16;
import com.zepto.jx0;
import com.zepto.kx0;
import com.zepto.lt7;
import com.zepto.mt7;
import com.zepto.mx0;
import com.zepto.ph4;
import com.zepto.sk2;
import com.zepto.u15;
import com.zepto.yw0;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static h16 x;
    public SparseArray a;
    public ArrayList b;
    public kx0 c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public d j;
    public ax0 k;
    public int l;
    public HashMap m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public SparseArray t;
    public c u;
    public int v;
    public int w;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[jx0.b.values().length];
            a = iArr;
            try {
                iArr[jx0.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[jx0.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[jx0.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[jx0.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class c implements e50.b {
        public ConstraintLayout a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public c(ConstraintLayout constraintLayout) {
            this.a = constraintLayout;
        }

        @Override // com.zepto.e50.b
        public final void a() {
            int childCount = this.a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.a.getChildAt(i);
            }
            int size = this.a.b.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((androidx.constraintlayout.widget.c) this.a.b.get(i2)).l(this.a);
                }
            }
        }

        @Override // com.zepto.e50.b
        public final void b(jx0 jx0Var, e50.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int i;
            int measuredHeight;
            int i2;
            if (jx0Var == null) {
                return;
            }
            if (jx0Var.V() == 8 && !jx0Var.j0()) {
                aVar.e = 0;
                aVar.f = 0;
                aVar.g = 0;
                return;
            }
            if (jx0Var.K() == null) {
                return;
            }
            jx0.b bVar = aVar.a;
            jx0.b bVar2 = aVar.b;
            int i3 = aVar.c;
            int i4 = aVar.d;
            int i5 = this.b + this.c;
            int i6 = this.d;
            View view = (View) jx0Var.s();
            int[] iArr = a.a;
            int i7 = iArr[bVar.ordinal()];
            if (i7 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            } else if (i7 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i6, -2);
            } else if (i7 == 3) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i6 + jx0Var.B(), -1);
            } else if (i7 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i6, -2);
                boolean z = jx0Var.w == 1;
                int i8 = aVar.j;
                if (i8 == e50.a.l || i8 == e50.a.m) {
                    boolean z2 = view.getMeasuredHeight() == jx0Var.x();
                    if (aVar.j == e50.a.m || !z || ((z && z2) || jx0Var.n0())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jx0Var.W(), 1073741824);
                    }
                }
            }
            int i9 = iArr[bVar2.ordinal()];
            if (i9 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            } else if (i9 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i5, -2);
            } else if (i9 == 3) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i5 + jx0Var.U(), -1);
            } else if (i9 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i5, -2);
                boolean z3 = jx0Var.x == 1;
                int i10 = aVar.j;
                if (i10 == e50.a.l || i10 == e50.a.m) {
                    boolean z4 = view.getMeasuredWidth() == jx0Var.W();
                    if (aVar.j == e50.a.m || !z3 || ((z3 && z4) || jx0Var.o0())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(jx0Var.x(), 1073741824);
                    }
                }
            }
            kx0 kx0Var = (kx0) jx0Var.K();
            if (kx0Var != null && ph4.b(ConstraintLayout.this.i, 256) && view.getMeasuredWidth() == jx0Var.W() && view.getMeasuredWidth() < kx0Var.W() && view.getMeasuredHeight() == jx0Var.x() && view.getMeasuredHeight() < kx0Var.x() && view.getBaseline() == jx0Var.p() && !jx0Var.m0() && d(jx0Var.C(), iMakeMeasureSpec, jx0Var.W()) && d(jx0Var.D(), iMakeMeasureSpec2, jx0Var.x())) {
                aVar.e = jx0Var.W();
                aVar.f = jx0Var.x();
                aVar.g = jx0Var.p();
                return;
            }
            jx0.b bVar3 = jx0.b.MATCH_CONSTRAINT;
            boolean z5 = bVar == bVar3;
            boolean z6 = bVar2 == bVar3;
            jx0.b bVar4 = jx0.b.MATCH_PARENT;
            boolean z7 = bVar2 == bVar4 || bVar2 == jx0.b.FIXED;
            boolean z8 = bVar == bVar4 || bVar == jx0.b.FIXED;
            boolean z9 = z5 && jx0Var.d0 > 0.0f;
            boolean z10 = z6 && jx0Var.d0 > 0.0f;
            if (view == null) {
                return;
            }
            b bVar5 = (b) view.getLayoutParams();
            int i11 = aVar.j;
            if (i11 != e50.a.l && i11 != e50.a.m && z5 && jx0Var.w == 0 && z6 && jx0Var.x == 0) {
                i2 = -1;
                measuredHeight = 0;
                baseline = 0;
                iMax = 0;
            } else {
                if ((view instanceof lt7) && (jx0Var instanceof mt7)) {
                    ((lt7) view).p((mt7) jx0Var, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                jx0Var.V0(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i12 = jx0Var.z;
                iMax = i12 > 0 ? Math.max(i12, measuredWidth) : measuredWidth;
                int i13 = jx0Var.A;
                if (i13 > 0) {
                    iMax = Math.min(i13, iMax);
                }
                int i14 = jx0Var.C;
                if (i14 > 0) {
                    measuredHeight = Math.max(i14, measuredHeight2);
                    i = iMakeMeasureSpec;
                } else {
                    i = iMakeMeasureSpec;
                    measuredHeight = measuredHeight2;
                }
                int i15 = jx0Var.D;
                if (i15 > 0) {
                    measuredHeight = Math.min(i15, measuredHeight);
                }
                if (!ph4.b(ConstraintLayout.this.i, 1)) {
                    if (z9 && z7) {
                        iMax = (int) ((measuredHeight * jx0Var.d0) + 0.5f);
                    } else if (z10 && z8) {
                        measuredHeight = (int) ((iMax / jx0Var.d0) + 0.5f);
                    }
                }
                if (measuredWidth != iMax || measuredHeight2 != measuredHeight) {
                    int iMakeMeasureSpec3 = measuredWidth != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, 1073741824) : i;
                    if (measuredHeight2 != measuredHeight) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    jx0Var.V0(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    iMax = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i2 = -1;
            }
            boolean z11 = baseline != i2;
            aVar.i = (iMax == aVar.c && measuredHeight == aVar.d) ? false : true;
            if (bVar5.g0) {
                z11 = true;
            }
            if (z11 && baseline != -1 && jx0Var.p() != baseline) {
                aVar.i = true;
            }
            aVar.e = iMax;
            aVar.f = measuredHeight;
            aVar.h = z11;
            aVar.g = baseline;
        }

        public void c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.b = i3;
            this.c = i4;
            this.d = i5;
            this.e = i6;
            this.f = i;
            this.g = i2;
        }

        public final boolean d(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new kx0();
        this.d = 0;
        this.e = 0;
        this.f = IntCompanionObject.MAX_VALUE;
        this.g = IntCompanionObject.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = new SparseArray();
        this.u = new c(this);
        this.v = 0;
        this.w = 0;
        q(attributeSet, 0, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static h16 getSharedValues() {
        if (x == null) {
            x = new h16();
        }
        return x;
    }

    private void q(AttributeSet attributeSet, int i, int i2) {
        this.c.B0(this);
        this.c.V1(this.u);
        this.a.put(getId(), this);
        this.j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, u15.n1, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == u15.x1) {
                    this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == u15.y1) {
                    this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == u15.v1) {
                    this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == u15.w1) {
                    this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == u15.g3) {
                    this.i = typedArrayObtainStyledAttributes.getInt(index, this.i);
                } else if (index == u15.b2) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            t(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.k = null;
                        }
                    }
                } else if (index == u15.F1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.j = dVar;
                        dVar.k(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.j = null;
                    }
                    this.l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.c.W1(this.i);
    }

    public final boolean A() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            w();
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    public void d(boolean z, View view, jx0 jx0Var, b bVar, SparseArray sparseArray) {
        jx0 jx0Var2;
        jx0 jx0Var3;
        jx0 jx0Var4;
        jx0 jx0Var5;
        int i;
        bVar.a();
        bVar.w0 = false;
        jx0Var.j1(view.getVisibility());
        if (bVar.j0) {
            jx0Var.T0(true);
            jx0Var.j1(8);
        }
        jx0Var.B0(view);
        if (view instanceof androidx.constraintlayout.widget.c) {
            ((androidx.constraintlayout.widget.c) view).j(jx0Var, this.c.P1());
        }
        if (bVar.h0) {
            sk2 sk2Var = (sk2) jx0Var;
            int i2 = bVar.s0;
            int i3 = bVar.t0;
            float f = bVar.u0;
            if (f != -1.0f) {
                sk2Var.z1(f);
                return;
            } else if (i2 != -1) {
                sk2Var.x1(i2);
                return;
            } else {
                if (i3 != -1) {
                    sk2Var.y1(i3);
                    return;
                }
                return;
            }
        }
        int i4 = bVar.l0;
        int i5 = bVar.m0;
        int i6 = bVar.n0;
        int i7 = bVar.o0;
        int i8 = bVar.p0;
        int i9 = bVar.q0;
        float f2 = bVar.r0;
        int i10 = bVar.p;
        if (i10 != -1) {
            jx0 jx0Var6 = (jx0) sparseArray.get(i10);
            if (jx0Var6 != null) {
                jx0Var.l(jx0Var6, bVar.r, bVar.q);
            }
        } else {
            if (i4 != -1) {
                jx0 jx0Var7 = (jx0) sparseArray.get(i4);
                if (jx0Var7 != null) {
                    yw0.b bVar2 = yw0.b.LEFT;
                    jx0Var.e0(bVar2, jx0Var7, bVar2, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i8);
                }
            } else if (i5 != -1 && (jx0Var2 = (jx0) sparseArray.get(i5)) != null) {
                jx0Var.e0(yw0.b.LEFT, jx0Var2, yw0.b.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i8);
            }
            if (i6 != -1) {
                jx0 jx0Var8 = (jx0) sparseArray.get(i6);
                if (jx0Var8 != null) {
                    jx0Var.e0(yw0.b.RIGHT, jx0Var8, yw0.b.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i9);
                }
            } else if (i7 != -1 && (jx0Var3 = (jx0) sparseArray.get(i7)) != null) {
                yw0.b bVar3 = yw0.b.RIGHT;
                jx0Var.e0(bVar3, jx0Var3, bVar3, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i9);
            }
            int i11 = bVar.i;
            if (i11 != -1) {
                jx0 jx0Var9 = (jx0) sparseArray.get(i11);
                if (jx0Var9 != null) {
                    yw0.b bVar4 = yw0.b.TOP;
                    jx0Var.e0(bVar4, jx0Var9, bVar4, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.x);
                }
            } else {
                int i12 = bVar.j;
                if (i12 != -1 && (jx0Var4 = (jx0) sparseArray.get(i12)) != null) {
                    jx0Var.e0(yw0.b.TOP, jx0Var4, yw0.b.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.x);
                }
            }
            int i13 = bVar.k;
            if (i13 != -1) {
                jx0 jx0Var10 = (jx0) sparseArray.get(i13);
                if (jx0Var10 != null) {
                    jx0Var.e0(yw0.b.BOTTOM, jx0Var10, yw0.b.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.z);
                }
            } else {
                int i14 = bVar.l;
                if (i14 != -1 && (jx0Var5 = (jx0) sparseArray.get(i14)) != null) {
                    yw0.b bVar5 = yw0.b.BOTTOM;
                    jx0Var.e0(bVar5, jx0Var5, bVar5, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.z);
                }
            }
            int i15 = bVar.m;
            if (i15 != -1) {
                z(jx0Var, bVar, sparseArray, i15, yw0.b.BASELINE);
            } else {
                int i16 = bVar.n;
                if (i16 != -1) {
                    z(jx0Var, bVar, sparseArray, i16, yw0.b.TOP);
                } else {
                    int i17 = bVar.o;
                    if (i17 != -1) {
                        z(jx0Var, bVar, sparseArray, i17, yw0.b.BOTTOM);
                    }
                }
            }
            if (f2 >= 0.0f) {
                jx0Var.M0(f2);
            }
            float f3 = bVar.H;
            if (f3 >= 0.0f) {
                jx0Var.d1(f3);
            }
        }
        if (z && ((i = bVar.X) != -1 || bVar.Y != -1)) {
            jx0Var.b1(i, bVar.Y);
        }
        if (bVar.e0) {
            jx0Var.P0(jx0.b.FIXED);
            jx0Var.k1(((ViewGroup.MarginLayoutParams) bVar).width);
            if (((ViewGroup.MarginLayoutParams) bVar).width == -2) {
                jx0Var.P0(jx0.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).width == -1) {
            if (bVar.a0) {
                jx0Var.P0(jx0.b.MATCH_CONSTRAINT);
            } else {
                jx0Var.P0(jx0.b.MATCH_PARENT);
            }
            jx0Var.o(yw0.b.LEFT).g = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            jx0Var.o(yw0.b.RIGHT).g = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        } else {
            jx0Var.P0(jx0.b.MATCH_CONSTRAINT);
            jx0Var.k1(0);
        }
        if (bVar.f0) {
            jx0Var.g1(jx0.b.FIXED);
            jx0Var.L0(((ViewGroup.MarginLayoutParams) bVar).height);
            if (((ViewGroup.MarginLayoutParams) bVar).height == -2) {
                jx0Var.g1(jx0.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).height == -1) {
            if (bVar.b0) {
                jx0Var.g1(jx0.b.MATCH_CONSTRAINT);
            } else {
                jx0Var.g1(jx0.b.MATCH_PARENT);
            }
            jx0Var.o(yw0.b.TOP).g = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            jx0Var.o(yw0.b.BOTTOM).g = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        } else {
            jx0Var.g1(jx0.b.MATCH_CONSTRAINT);
            jx0Var.L0(0);
        }
        jx0Var.D0(bVar.I);
        jx0Var.R0(bVar.L);
        jx0Var.i1(bVar.M);
        jx0Var.N0(bVar.N);
        jx0Var.e1(bVar.O);
        jx0Var.l1(bVar.d0);
        jx0Var.Q0(bVar.P, bVar.R, bVar.T, bVar.V);
        jx0Var.h1(bVar.Q, bVar.S, bVar.U, bVar.W);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((androidx.constraintlayout.widget.c) this.b.get(i)).m(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void forceLayout() {
        s();
        super.forceLayout();
    }

    public Object g(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap map = this.m;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.m.get(str);
    }

    public int getMaxHeight() {
        return this.g;
    }

    public int getMaxWidth() {
        return this.f;
    }

    public int getMinHeight() {
        return this.e;
    }

    public int getMinWidth() {
        return this.d;
    }

    public int getOptimizationLevel() {
        return this.c.J1();
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.c.o == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.c.o = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.c.o = "parent";
            }
        }
        if (this.c.t() == null) {
            kx0 kx0Var = this.c;
            kx0Var.C0(kx0Var.o);
            Log.v("ConstraintLayout", " setDebugName " + this.c.t());
        }
        for (jx0 jx0Var : this.c.r1()) {
            View view = (View) jx0Var.s();
            if (view != null) {
                if (jx0Var.o == null && (id = view.getId()) != -1) {
                    jx0Var.o = getContext().getResources().getResourceEntryName(id);
                }
                if (jx0Var.t() == null) {
                    jx0Var.C0(jx0Var.o);
                    Log.v("ConstraintLayout", " setDebugName " + jx0Var.t());
                }
            }
        }
        this.c.O(sb);
        return sb.toString();
    }

    public final jx0 k(int i) {
        if (i == 0) {
            return this.c;
        }
        View viewFindViewById = (View) this.a.get(i);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.c;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).v0;
    }

    public View l(int i) {
        return (View) this.a.get(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            b bVar = (b) childAt.getLayoutParams();
            jx0 jx0Var = bVar.v0;
            if ((childAt.getVisibility() != 8 || bVar.h0 || bVar.i0 || bVar.k0 || zIsInEditMode) && !bVar.j0) {
                int iX = jx0Var.X();
                int iY = jx0Var.Y();
                childAt.layout(iX, iY, jx0Var.W() + iX, jx0Var.x() + iY);
            }
        }
        int size = this.b.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((androidx.constraintlayout.widget.c) this.b.get(i6)).k(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.v == i) {
            int i3 = this.w;
        }
        if (!this.h) {
            int childCount = getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                }
                if (getChildAt(i4).isLayoutRequested()) {
                    this.h = true;
                    break;
                }
                i4++;
            }
        }
        this.v = i;
        this.w = i2;
        this.c.Y1(r());
        if (this.h) {
            this.h = false;
            if (A()) {
                this.c.a2();
            }
        }
        v(this.c, this.i, i, i2);
        u(i, i2, this.c.W(), this.c.x(), this.c.Q1(), this.c.O1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        jx0 jx0VarP = p(view);
        if ((view instanceof e) && !(jx0VarP instanceof sk2)) {
            b bVar = (b) view.getLayoutParams();
            sk2 sk2Var = new sk2();
            bVar.v0 = sk2Var;
            bVar.h0 = true;
            sk2Var.A1(bVar.Z);
        }
        if (view instanceof androidx.constraintlayout.widget.c) {
            androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) view;
            cVar.o();
            ((b) view.getLayoutParams()).i0 = true;
            if (!this.b.contains(cVar)) {
                this.b.add(cVar);
            }
        }
        this.a.put(view.getId(), view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.c.t1(p(view));
        this.b.remove(view);
        this.h = true;
    }

    public final jx0 p(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).v0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).v0;
        }
        return null;
    }

    public boolean r() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        s();
        super.requestLayout();
    }

    public final void s() {
        this.h = true;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
    }

    public void setConstraintSet(d dVar) {
        this.j = dVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        this.a.remove(getId());
        super.setId(i);
        this.a.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.g) {
            return;
        }
        this.g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f) {
            return;
        }
        this.f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.e) {
            return;
        }
        this.e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.d) {
            return;
        }
        this.d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(mx0 mx0Var) {
        ax0 ax0Var = this.k;
        if (ax0Var != null) {
            ax0Var.c(mx0Var);
        }
    }

    public void setOptimizationLevel(int i) {
        this.i = i;
        this.c.W1(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void t(int i) {
        this.k = new ax0(getContext(), this, i);
    }

    public void u(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        c cVar = this.u;
        int i5 = cVar.e;
        int iResolveSizeAndState = View.resolveSizeAndState(i3 + cVar.d, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int iMin = Math.min(this.f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.g, iResolveSizeAndState2);
        if (z) {
            iMin |= 16777216;
        }
        if (z2) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.n = iMin;
        this.o = iMin2;
    }

    public void v(kx0 kx0Var, int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i4 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.u.c(i2, i3, iMax, iMax2, paddingWidth, i4);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        int iMax5 = (iMax3 > 0 || iMax4 > 0) ? r() ? iMax4 : iMax3 : Math.max(0, getPaddingLeft());
        int i5 = size - paddingWidth;
        int i6 = size2 - i4;
        y(kx0Var, mode, i5, mode2, i6);
        kx0Var.R1(i, mode, i5, mode2, i6, this.n, this.o, iMax5, iMax);
    }

    public final void w() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            jx0 jx0VarP = p(getChildAt(i));
            if (jx0VarP != null) {
                jx0VarP.t0();
            }
        }
        if (zIsInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    x(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    k(childAt.getId()).C0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.l != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                getChildAt(i3).getId();
            }
        }
        d dVar = this.j;
        if (dVar != null) {
            dVar.d(this, true);
        }
        this.c.u1();
        int size = this.b.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                ((androidx.constraintlayout.widget.c) this.b.get(i4)).n(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5);
        }
        this.t.clear();
        this.t.put(0, this.c);
        this.t.put(getId(), this.c);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            this.t.put(childAt2.getId(), p(childAt2));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt3 = getChildAt(i7);
            jx0 jx0VarP2 = p(childAt3);
            if (jx0VarP2 != null) {
                b bVar = (b) childAt3.getLayoutParams();
                this.c.b(jx0VarP2);
                d(zIsInEditMode, childAt3, jx0VarP2, bVar, this.t);
            }
        }
    }

    public void x(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.m == null) {
                this.m = new HashMap();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.m.put(strSubstring, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r2
      0x003e: PHI (r2v4 com.zepto.jx0$b) = (r2v3 com.zepto.jx0$b), (r2v0 com.zepto.jx0$b) binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void y(com.zepto.kx0 r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$c r0 = r7.u
            int r1 = r0.e
            int r0 = r0.d
            com.zepto.jx0$b r2 = com.zepto.jx0.b.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L2e
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = r6
            goto L38
        L1a:
            int r9 = r7.f
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L38
        L23:
            com.zepto.jx0$b r9 = com.zepto.jx0.b.WRAP_CONTENT
            if (r3 != 0) goto L18
            int r10 = r7.d
            int r10 = java.lang.Math.max(r6, r10)
            goto L38
        L2e:
            com.zepto.jx0$b r9 = com.zepto.jx0.b.WRAP_CONTENT
            if (r3 != 0) goto L38
            int r10 = r7.d
            int r10 = java.lang.Math.max(r6, r10)
        L38:
            if (r11 == r5) goto L53
            if (r11 == 0) goto L48
            if (r11 == r4) goto L40
        L3e:
            r12 = r6
            goto L5d
        L40:
            int r11 = r7.g
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L5d
        L48:
            com.zepto.jx0$b r2 = com.zepto.jx0.b.WRAP_CONTENT
            if (r3 != 0) goto L3e
            int r11 = r7.e
            int r12 = java.lang.Math.max(r6, r11)
            goto L5d
        L53:
            com.zepto.jx0$b r2 = com.zepto.jx0.b.WRAP_CONTENT
            if (r3 != 0) goto L5d
            int r11 = r7.e
            int r12 = java.lang.Math.max(r6, r11)
        L5d:
            int r11 = r8.W()
            if (r10 != r11) goto L69
            int r11 = r8.x()
            if (r12 == r11) goto L6c
        L69:
            r8.N1()
        L6c:
            r8.m1(r6)
            r8.n1(r6)
            int r11 = r7.f
            int r11 = r11 - r0
            r8.X0(r11)
            int r11 = r7.g
            int r11 = r11 - r1
            r8.W0(r11)
            r8.a1(r6)
            r8.Z0(r6)
            r8.P0(r9)
            r8.k1(r10)
            r8.g1(r2)
            r8.L0(r12)
            int r9 = r7.d
            int r9 = r9 - r0
            r8.a1(r9)
            int r9 = r7.e
            int r9 = r9 - r1
            r8.Z0(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.y(com.zepto.kx0, int, int, int, int):void");
    }

    public final void z(jx0 jx0Var, b bVar, SparseArray sparseArray, int i, yw0.b bVar2) {
        View view = (View) this.a.get(i);
        jx0 jx0Var2 = (jx0) sparseArray.get(i);
        if (jx0Var2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.g0 = true;
        yw0.b bVar3 = yw0.b.BASELINE;
        if (bVar2 == bVar3) {
            b bVar4 = (b) view.getLayoutParams();
            bVar4.g0 = true;
            bVar4.v0.K0(true);
        }
        jx0Var.o(bVar3).b(jx0Var2.o(bVar2), bVar.D, bVar.C, true);
        jx0Var.K0(true);
        jx0Var.o(yw0.b.TOP).q();
        jx0Var.o(yw0.b.BOTTOM).q();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new kx0();
        this.d = 0;
        this.e = 0;
        this.f = IntCompanionObject.MAX_VALUE;
        this.g = IntCompanionObject.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = new SparseArray();
        this.u = new c(this);
        this.v = 0;
        this.w = 0;
        q(attributeSet, i, 0);
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean E;
        public boolean F;
        public float G;
        public float H;
        public String I;
        public float J;
        public int K;
        public float L;
        public float M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public int U;
        public float V;
        public float W;
        public int X;
        public int Y;
        public int Z;
        public int a;
        public boolean a0;
        public int b;
        public boolean b0;
        public float c;
        public String c0;
        public boolean d;
        public int d0;
        public int e;
        public boolean e0;
        public int f;
        public boolean f0;
        public int g;
        public boolean g0;
        public int h;
        public boolean h0;
        public int i;
        public boolean i0;
        public int j;
        public boolean j0;
        public int k;
        public boolean k0;
        public int l;
        public int l0;
        public int m;
        public int m0;
        public int n;
        public int n0;
        public int o;
        public int o0;
        public int p;
        public int p0;
        public int q;
        public int q0;
        public float r;
        public float r0;
        public int s;
        public int s0;
        public int t;
        public int t0;
        public int u;
        public float u0;
        public int v;
        public jx0 v0;
        public int w;
        public boolean w0;
        public int x;
        public int y;
        public int z;

        public static class a {
            public static final SparseIntArray a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                a = sparseIntArray;
                sparseIntArray.append(u15.R2, 64);
                sparseIntArray.append(u15.u2, 65);
                sparseIntArray.append(u15.D2, 8);
                sparseIntArray.append(u15.E2, 9);
                sparseIntArray.append(u15.G2, 10);
                sparseIntArray.append(u15.H2, 11);
                sparseIntArray.append(u15.N2, 12);
                sparseIntArray.append(u15.M2, 13);
                sparseIntArray.append(u15.k2, 14);
                sparseIntArray.append(u15.j2, 15);
                sparseIntArray.append(u15.f2, 16);
                sparseIntArray.append(u15.h2, 52);
                sparseIntArray.append(u15.g2, 53);
                sparseIntArray.append(u15.l2, 2);
                sparseIntArray.append(u15.n2, 3);
                sparseIntArray.append(u15.m2, 4);
                sparseIntArray.append(u15.W2, 49);
                sparseIntArray.append(u15.X2, 50);
                sparseIntArray.append(u15.r2, 5);
                sparseIntArray.append(u15.s2, 6);
                sparseIntArray.append(u15.t2, 7);
                sparseIntArray.append(u15.a2, 67);
                sparseIntArray.append(u15.o1, 1);
                sparseIntArray.append(u15.I2, 17);
                sparseIntArray.append(u15.J2, 18);
                sparseIntArray.append(u15.q2, 19);
                sparseIntArray.append(u15.p2, 20);
                sparseIntArray.append(u15.b3, 21);
                sparseIntArray.append(u15.e3, 22);
                sparseIntArray.append(u15.c3, 23);
                sparseIntArray.append(u15.Z2, 24);
                sparseIntArray.append(u15.d3, 25);
                sparseIntArray.append(u15.a3, 26);
                sparseIntArray.append(u15.Y2, 55);
                sparseIntArray.append(u15.f3, 54);
                sparseIntArray.append(u15.z2, 29);
                sparseIntArray.append(u15.O2, 30);
                sparseIntArray.append(u15.o2, 44);
                sparseIntArray.append(u15.B2, 45);
                sparseIntArray.append(u15.Q2, 46);
                sparseIntArray.append(u15.A2, 47);
                sparseIntArray.append(u15.P2, 48);
                sparseIntArray.append(u15.d2, 27);
                sparseIntArray.append(u15.c2, 28);
                sparseIntArray.append(u15.S2, 31);
                sparseIntArray.append(u15.v2, 32);
                sparseIntArray.append(u15.U2, 33);
                sparseIntArray.append(u15.T2, 34);
                sparseIntArray.append(u15.V2, 35);
                sparseIntArray.append(u15.x2, 36);
                sparseIntArray.append(u15.w2, 37);
                sparseIntArray.append(u15.y2, 38);
                sparseIntArray.append(u15.C2, 39);
                sparseIntArray.append(u15.L2, 40);
                sparseIntArray.append(u15.F2, 41);
                sparseIntArray.append(u15.i2, 42);
                sparseIntArray.append(u15.e2, 43);
                sparseIntArray.append(u15.K2, 51);
                sparseIntArray.append(u15.h3, 66);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = IntCompanionObject.MIN_VALUE;
            this.x = IntCompanionObject.MIN_VALUE;
            this.y = IntCompanionObject.MIN_VALUE;
            this.z = IntCompanionObject.MIN_VALUE;
            this.A = IntCompanionObject.MIN_VALUE;
            this.B = IntCompanionObject.MIN_VALUE;
            this.C = IntCompanionObject.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.a0 = false;
            this.b0 = false;
            this.c0 = null;
            this.d0 = 0;
            this.e0 = true;
            this.f0 = true;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = false;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = IntCompanionObject.MIN_VALUE;
            this.q0 = IntCompanionObject.MIN_VALUE;
            this.r0 = 0.5f;
            this.v0 = new jx0();
            this.w0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u15.n1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = a.a.get(index);
                switch (i2) {
                    case 1:
                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId;
                        if (resourceId == -1) {
                            this.p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.q);
                        break;
                    case 4:
                        float f = typedArrayObtainStyledAttributes.getFloat(index, this.r) % 360.0f;
                        this.r = f;
                        if (f < 0.0f) {
                            this.r = (360.0f - f) % 360.0f;
                        }
                        break;
                    case 5:
                        this.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                        break;
                    case 6:
                        this.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        break;
                    case 7:
                        this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                        this.e = resourceId2;
                        if (resourceId2 == -1) {
                            this.e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f);
                        this.f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.g);
                        this.g = resourceId4;
                        if (resourceId4 == -1) {
                            this.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.h);
                        this.h = resourceId5;
                        if (resourceId5 == -1) {
                            this.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId6;
                        if (resourceId6 == -1) {
                            this.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId7;
                        if (resourceId7 == -1) {
                            this.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.k);
                        this.k = resourceId8;
                        if (resourceId8 == -1) {
                            this.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.l);
                        this.l = resourceId9;
                        if (resourceId9 == -1) {
                            this.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.m);
                        this.m = resourceId10;
                        if (resourceId10 == -1) {
                            this.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId11;
                        if (resourceId11 == -1) {
                            this.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.t);
                        this.t = resourceId12;
                        if (resourceId12 == -1) {
                            this.t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.u);
                        this.u = resourceId13;
                        if (resourceId13 == -1) {
                            this.u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.v);
                        this.v = resourceId14;
                        if (resourceId14 == -1) {
                            this.v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case 22:
                        this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case 23:
                        this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case 24:
                        this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.z);
                        break;
                    case 25:
                        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.a0 = typedArrayObtainStyledAttributes.getBoolean(index, this.a0);
                        break;
                    case 28:
                        this.b0 = typedArrayObtainStyledAttributes.getBoolean(index, this.b0);
                        break;
                    case 29:
                        this.G = typedArrayObtainStyledAttributes.getFloat(index, this.G);
                        break;
                    case 30:
                        this.H = typedArrayObtainStyledAttributes.getFloat(index, this.H);
                        break;
                    case 31:
                        int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.P = i3;
                        if (i3 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.Q = i4;
                        if (i4 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.R) == -2) {
                                this.R = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.T) == -2) {
                                this.T = -2;
                            }
                        }
                        break;
                    case 35:
                        this.V = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.V));
                        this.P = 2;
                        break;
                    case 36:
                        try {
                            this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.S) == -2) {
                                this.S = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.U);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.U) == -2) {
                                this.U = -2;
                            }
                        }
                        break;
                    case 38:
                        this.W = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.W));
                        this.Q = 2;
                        break;
                    default:
                        switch (i2) {
                            case 44:
                                d.p(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.L = typedArrayObtainStyledAttributes.getFloat(index, this.L);
                                break;
                            case 46:
                                this.M = typedArrayObtainStyledAttributes.getFloat(index, this.M);
                                break;
                            case 47:
                                this.N = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.O = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.X = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                                break;
                            case 50:
                                this.Y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.Y);
                                break;
                            case 51:
                                this.c0 = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.n);
                                this.n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.o);
                                this.o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i2) {
                                    case 64:
                                        d.n(this, typedArrayObtainStyledAttributes, index, 0);
                                        this.E = true;
                                        break;
                                    case 65:
                                        d.n(this, typedArrayObtainStyledAttributes, index, 1);
                                        this.F = true;
                                        break;
                                    case 66:
                                        this.d0 = typedArrayObtainStyledAttributes.getInt(index, this.d0);
                                        break;
                                    case 67:
                                        this.d = typedArrayObtainStyledAttributes.getBoolean(index, this.d);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public void a() {
            this.h0 = false;
            this.e0 = true;
            this.f0 = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.a0) {
                this.e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.b0) {
                this.f0 = false;
                if (this.Q == 0) {
                    this.Q = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.e0 = false;
                if (i == 0 && this.P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.a0 = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f0 = false;
                if (i2 == 0 && this.Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.b0 = true;
                }
            }
            if (this.c == -1.0f && this.a == -1 && this.b == -1) {
                return;
            }
            this.h0 = true;
            this.e0 = true;
            this.f0 = true;
            if (!(this.v0 instanceof sk2)) {
                this.v0 = new sk2();
            }
            ((sk2) this.v0).A1(this.Z);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instruction units count: 259
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(int i, int i2) {
            super(i, i2);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = IntCompanionObject.MIN_VALUE;
            this.x = IntCompanionObject.MIN_VALUE;
            this.y = IntCompanionObject.MIN_VALUE;
            this.z = IntCompanionObject.MIN_VALUE;
            this.A = IntCompanionObject.MIN_VALUE;
            this.B = IntCompanionObject.MIN_VALUE;
            this.C = IntCompanionObject.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.a0 = false;
            this.b0 = false;
            this.c0 = null;
            this.d0 = 0;
            this.e0 = true;
            this.f0 = true;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = false;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = IntCompanionObject.MIN_VALUE;
            this.q0 = IntCompanionObject.MIN_VALUE;
            this.r0 = 0.5f;
            this.v0 = new jx0();
            this.w0 = false;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = IntCompanionObject.MIN_VALUE;
            this.x = IntCompanionObject.MIN_VALUE;
            this.y = IntCompanionObject.MIN_VALUE;
            this.z = IntCompanionObject.MIN_VALUE;
            this.A = IntCompanionObject.MIN_VALUE;
            this.B = IntCompanionObject.MIN_VALUE;
            this.C = IntCompanionObject.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.a0 = false;
            this.b0 = false;
            this.c0 = null;
            this.d0 = 0;
            this.e0 = true;
            this.f0 = true;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = false;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = IntCompanionObject.MIN_VALUE;
            this.q0 = IntCompanionObject.MIN_VALUE;
            this.r0 = 0.5f;
            this.v0 = new jx0();
            this.w0 = false;
        }
    }
}
