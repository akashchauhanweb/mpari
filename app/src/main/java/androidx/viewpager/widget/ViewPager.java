package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.zepto.cg4;
import com.zepto.cl4;
import com.zepto.dq7;
import com.zepto.qv7;
import com.zepto.r3;
import com.zepto.wb0;
import com.zepto.x2;
import com.zepto.yy0;
import com.zepto.z1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public static final int[] f0 = {R.attr.layout_gravity};
    public static final Comparator g0 = new a();
    public static final Interpolator h0 = new b();
    public static final l i0 = new l();
    public int A;
    public int B;
    public int C;
    public float D;
    public float E;
    public float F;
    public float G;
    public int H;
    public VelocityTracker I;
    public int J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public EdgeEffect O;
    public EdgeEffect P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T;
    public List U;
    public i V;
    public i W;
    public int a;
    public List a0;
    public final ArrayList b;
    public int b0;
    public final f c;
    public ArrayList c0;
    public final Rect d;
    public final Runnable d0;
    public cl4 e;
    public int e0;
    public int f;
    public int g;
    public Parcelable h;
    public ClassLoader i;
    public Scroller j;
    public boolean k;
    public j l;
    public int m;
    public Drawable n;
    public int o;
    public int p;
    public float q;
    public float r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public boolean y;
    public boolean z;

    public static class a implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.b - fVar2.b;
        }
    }

    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.C();
        }
    }

    public class d implements cg4 {
        public final Rect a = new Rect();

        public d() {
        }

        @Override // com.zepto.cg4
        public qv7 a(View view, qv7 qv7Var) {
            qv7 qv7VarC0 = dq7.c0(view, qv7Var);
            if (qv7VarC0.p()) {
                return qv7VarC0;
            }
            Rect rect = this.a;
            rect.left = qv7VarC0.j();
            rect.top = qv7VarC0.l();
            rect.right = qv7VarC0.k();
            rect.bottom = qv7VarC0.i();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                qv7 qv7VarG = dq7.g(ViewPager.this.getChildAt(i), qv7VarC0);
                rect.left = Math.min(qv7VarG.j(), rect.left);
                rect.top = Math.min(qv7VarG.l(), rect.top);
                rect.right = Math.min(qv7VarG.k(), rect.right);
                rect.bottom = Math.min(qv7VarG.i(), rect.bottom);
            }
            return qv7VarC0.q(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    public static class f {
        public Object a;
        public int b;
        public boolean c;
        public float d;
        public float e;
    }

    public static class g extends ViewGroup.LayoutParams {
        public boolean a;
        public int b;
        public float c;
        public boolean d;
        public int e;
        public int f;

        public g() {
            super(-1, -1);
            this.c = 0.0f;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f0);
            this.b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public class h extends x2 {
        public h() {
        }

        @Override // com.zepto.x2
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            cl4 cl4Var;
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(n());
            if (accessibilityEvent.getEventType() != 4096 || (cl4Var = ViewPager.this.e) == null) {
                return;
            }
            accessibilityEvent.setItemCount(cl4Var.d());
            accessibilityEvent.setFromIndex(ViewPager.this.f);
            accessibilityEvent.setToIndex(ViewPager.this.f);
        }

        @Override // com.zepto.x2
        public void g(View view, r3 r3Var) {
            super.g(view, r3Var);
            r3Var.U(ViewPager.class.getName());
            r3Var.n0(n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                r3Var.a(ConstantsKt.DEFAULT_BLOCK_SIZE);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                r3Var.a(ConstantsKt.DEFAULT_BUFFER_SIZE);
            }
        }

        @Override // com.zepto.x2
        public boolean j(View view, int i, Bundle bundle) {
            if (super.j(view, i, bundle)) {
                return true;
            }
            if (i == 4096) {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f + 1);
                return true;
            }
            if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.f - 1);
            return true;
        }

        public final boolean n() {
            cl4 cl4Var = ViewPager.this.e;
            return cl4Var != null && cl4Var.d() > 1;
        }
    }

    public interface i {
        void a(int i, float f, int i2);

        void b(int i);

        void c(int i);
    }

    public class j extends DataSetObserver {
        public j() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.g();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.g();
        }
    }

    public static class k extends z1 {
        public static final Parcelable.Creator<k> CREATOR = new a();
        public int f;
        public Parcelable g;
        public ClassLoader h;

        public static class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public k createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new k(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public k[] newArray(int i) {
                return new k[i];
            }
        }

        public k(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f + "}";
        }

        @Override // com.zepto.z1, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f);
            parcel.writeParcelable(this.g, i);
        }

        public k(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f = parcel.readInt();
            this.g = parcel.readParcelable(classLoader);
            this.h = classLoader;
        }
    }

    public static class l implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z = gVar.a;
            return z != gVar2.a ? z ? 1 : -1 : gVar.e - gVar2.e;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new ArrayList();
        this.c = new f();
        this.d = new Rect();
        this.g = -1;
        this.h = null;
        this.i = null;
        this.q = -3.4028235E38f;
        this.r = Float.MAX_VALUE;
        this.x = 1;
        this.H = -1;
        this.Q = true;
        this.R = false;
        this.d0 = new c();
        this.e0 = 0;
        t();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.v != z) {
            this.v = z;
        }
    }

    public static boolean u(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    public final boolean A(int i2) {
        if (this.b.size() == 0) {
            if (this.Q) {
                return false;
            }
            this.S = false;
            w(0, 0.0f, 0);
            if (this.S) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f fVarR = r();
        int clientWidth = getClientWidth();
        int i3 = this.m;
        int i4 = clientWidth + i3;
        float f2 = clientWidth;
        int i5 = fVarR.b;
        float f3 = ((i2 / f2) - fVarR.e) / (fVarR.d + (i3 / f2));
        this.S = false;
        w(i5, f3, (int) (i4 * f3));
        if (this.S) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean B(float f2) {
        boolean z;
        boolean z2;
        float f3 = this.D - f2;
        this.D = f2;
        float scrollX = getScrollX() + f3;
        float clientWidth = getClientWidth();
        float f4 = this.q * clientWidth;
        float f5 = this.r * clientWidth;
        boolean z3 = false;
        f fVar = (f) this.b.get(0);
        ArrayList arrayList = this.b;
        f fVar2 = (f) arrayList.get(arrayList.size() - 1);
        if (fVar.b != 0) {
            f4 = fVar.e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (fVar2.b != this.e.d() - 1) {
            f5 = fVar2.e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f4) {
            if (z) {
                this.O.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z2) {
                this.P.onPull(Math.abs(scrollX - f5) / clientWidth);
                z3 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.D += scrollX - i2;
        scrollTo(i2, getScrollY());
        A(i2);
        return z3;
    }

    public void C() {
        D(this.f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cb A[PHI: r7 r10 r15
      0x00cb: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:64:0x00ef, B:61:0x00d9, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00cb: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:64:0x00ef, B:61:0x00d9, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00cb: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:64:0x00ef, B:61:0x00d9, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void D(int r18) {
        /*
            Method dump skipped, instruction units count: 615
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.D(int):void");
    }

    public final void E(int i2, int i3, int i4, int i5) {
        if (i3 > 0 && !this.b.isEmpty()) {
            if (!this.j.isFinished()) {
                this.j.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i3 - getPaddingLeft()) - getPaddingRight()) + i5)) * (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)), getScrollY());
                return;
            }
        }
        f fVarS = s(this.f);
        int iMin = (int) ((fVarS != null ? Math.min(fVarS.e, this.r) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            f(false);
            scrollTo(iMin, getScrollY());
        }
    }

    public final void F() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((g) getChildAt(i2).getLayoutParams()).a) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    public final void G(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public final boolean H() {
        this.H = -1;
        m();
        this.O.onRelease();
        this.P.onRelease();
        return this.O.isFinished() || this.P.isFinished();
    }

    public final void I(int i2, boolean z, int i3, boolean z2) {
        f fVarS = s(i2);
        int clientWidth = fVarS != null ? (int) (getClientWidth() * Math.max(this.q, Math.min(fVarS.e, this.r))) : 0;
        if (z) {
            M(clientWidth, 0, i3);
            if (z2) {
                j(i2);
                return;
            }
            return;
        }
        if (z2) {
            j(i2);
        }
        f(false);
        scrollTo(clientWidth, 0);
        A(clientWidth);
    }

    public void J(int i2, boolean z) {
        this.w = false;
        K(i2, z, false);
    }

    public void K(int i2, boolean z, boolean z2) {
        L(i2, z, z2, 0);
    }

    public void L(int i2, boolean z, boolean z2, int i3) {
        cl4 cl4Var = this.e;
        if (cl4Var == null || cl4Var.d() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.f == i2 && this.b.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= this.e.d()) {
            i2 = this.e.d() - 1;
        }
        int i4 = this.x;
        int i5 = this.f;
        if (i2 > i5 + i4 || i2 < i5 - i4) {
            for (int i6 = 0; i6 < this.b.size(); i6++) {
                ((f) this.b.get(i6)).c = true;
            }
        }
        boolean z3 = this.f != i2;
        if (!this.Q) {
            D(i2);
            I(i2, z, i3, z3);
        } else {
            this.f = i2;
            if (z3) {
                j(i2);
            }
            requestLayout();
        }
    }

    public void M(int i2, int i3, int i4) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.j;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.k ? this.j.getCurrX() : this.j.getStartX();
            this.j.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i5 = scrollX;
        int scrollY = getScrollY();
        int i6 = i2 - i5;
        int i7 = i3 - scrollY;
        if (i6 == 0 && i7 == 0) {
            f(false);
            C();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i8 = clientWidth / 2;
        float f2 = clientWidth;
        float f3 = i8;
        float fL = f3 + (l(Math.min(1.0f, (Math.abs(i6) * 1.0f) / f2)) * f3);
        int iAbs = Math.abs(i4);
        int iMin = Math.min(iAbs > 0 ? Math.round(Math.abs(fL / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i6) / ((f2 * this.e.f(this.f)) + this.m)) + 1.0f) * 100.0f), 600);
        this.k = false;
        this.j.startScroll(i5, scrollY, i6, i7, iMin);
        dq7.h0(this);
    }

    public final void N() {
        if (this.b0 != 0) {
            ArrayList arrayList = this.c0;
            if (arrayList == null) {
                this.c0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.c0.add(getChildAt(i2));
            }
            Collections.sort(this.c0, i0);
        }
    }

    public f a(int i2, int i3) {
        f fVar = new f();
        fVar.b = i2;
        fVar.a = this.e.g(this, i2);
        fVar.d = this.e.f(i2);
        if (i3 < 0 || i3 >= this.b.size()) {
            this.b.add(fVar);
        } else {
            this.b.add(i3, fVar);
        }
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i2, int i3) {
        f fVarQ;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (fVarQ = q(childAt)) != null && fVarQ.b == this.f) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList arrayList) {
        f fVarQ;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (fVarQ = q(childAt)) != null && fVarQ.b == this.f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean zU = gVar.a | u(view);
        gVar.a = zU;
        if (!this.u) {
            super.addView(view, i2, layoutParams);
        } else {
            if (zU) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            gVar.d = true;
            addViewInLayout(view, i2, layoutParams);
        }
    }

    public void b(i iVar) {
        if (this.U == null) {
            this.U = new ArrayList();
        }
        this.U.add(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(int r5) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.c(int):boolean");
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        if (this.e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i2 < 0 ? scrollX > ((int) (((float) clientWidth) * this.q)) : i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.r));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.k = true;
        if (this.j.isFinished() || !this.j.computeScrollOffset()) {
            f(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.j.getCurrX();
        int currY = this.j.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!A(currX)) {
                this.j.abortAnimation();
                scrollTo(0, currY);
            }
        }
        dq7.h0(this);
    }

    public final void d(f fVar, int i2, f fVar2) {
        int i3;
        int i4;
        f fVar3;
        f fVar4;
        int iD = this.e.d();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? this.m / clientWidth : 0.0f;
        if (fVar2 != null) {
            int i5 = fVar2.b;
            int i6 = fVar.b;
            if (i5 < i6) {
                float f3 = fVar2.e + fVar2.d + f2;
                int i7 = i5 + 1;
                int i8 = 0;
                while (i7 <= fVar.b && i8 < this.b.size()) {
                    Object obj = this.b.get(i8);
                    while (true) {
                        fVar4 = (f) obj;
                        if (i7 <= fVar4.b || i8 >= this.b.size() - 1) {
                            break;
                        }
                        i8++;
                        obj = this.b.get(i8);
                    }
                    while (i7 < fVar4.b) {
                        f3 += this.e.f(i7) + f2;
                        i7++;
                    }
                    fVar4.e = f3;
                    f3 += fVar4.d + f2;
                    i7++;
                }
            } else if (i5 > i6) {
                int size = this.b.size() - 1;
                float f4 = fVar2.e;
                while (true) {
                    i5--;
                    if (i5 < fVar.b || size < 0) {
                        break;
                    }
                    Object obj2 = this.b.get(size);
                    while (true) {
                        fVar3 = (f) obj2;
                        if (i5 >= fVar3.b || size <= 0) {
                            break;
                        }
                        size--;
                        obj2 = this.b.get(size);
                    }
                    while (i5 > fVar3.b) {
                        f4 -= this.e.f(i5) + f2;
                        i5--;
                    }
                    f4 -= fVar3.d + f2;
                    fVar3.e = f4;
                }
            }
        }
        int size2 = this.b.size();
        float f5 = fVar.e;
        int i9 = fVar.b;
        int i10 = i9 - 1;
        this.q = i9 == 0 ? f5 : -3.4028235E38f;
        int i11 = iD - 1;
        this.r = i9 == i11 ? (fVar.d + f5) - 1.0f : Float.MAX_VALUE;
        int i12 = i2 - 1;
        while (i12 >= 0) {
            f fVar5 = (f) this.b.get(i12);
            while (true) {
                i4 = fVar5.b;
                if (i10 <= i4) {
                    break;
                }
                f5 -= this.e.f(i10) + f2;
                i10--;
            }
            f5 -= fVar5.d + f2;
            fVar5.e = f5;
            if (i4 == 0) {
                this.q = f5;
            }
            i12--;
            i10--;
        }
        float f6 = fVar.e + fVar.d + f2;
        int i13 = fVar.b + 1;
        int i14 = i2 + 1;
        while (i14 < size2) {
            f fVar6 = (f) this.b.get(i14);
            while (true) {
                i3 = fVar6.b;
                if (i13 >= i3) {
                    break;
                }
                f6 += this.e.f(i13) + f2;
                i13++;
            }
            if (i3 == i11) {
                this.r = (fVar6.d + f6) - 1.0f;
            }
            fVar6.e = f6;
            f6 += fVar6.d + f2;
            i14++;
            i13++;
        }
        this.R = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || n(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f fVarQ;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (fVarQ = q(childAt)) != null && fVarQ.b == this.f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean zDraw;
        cl4 cl4Var;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0 && (overScrollMode != 1 || (cl4Var = this.e) == null || cl4Var.d() <= 1)) {
            this.O.finish();
            this.P.finish();
            return;
        }
        if (this.O.isFinished()) {
            zDraw = false;
        } else {
            int iSave = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((-height) + getPaddingTop(), this.q * width);
            this.O.setSize(height, width);
            zDraw = this.O.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        if (!this.P.isFinished()) {
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), (-(this.r + 1.0f)) * width2);
            this.P.setSize(height2, width2);
            zDraw |= this.P.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        if (zDraw) {
            dq7.h0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.n;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public boolean e(View view, boolean z, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && e(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i2);
    }

    public final void f(boolean z) {
        boolean z2 = this.e0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.j.isFinished()) {
                this.j.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.j.getCurrX();
                int currY = this.j.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        A(currX);
                    }
                }
            }
        }
        this.w = false;
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            f fVar = (f) this.b.get(i2);
            if (fVar.c) {
                fVar.c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                dq7.i0(this, this.d0);
            } else {
                this.d0.run();
            }
        }
    }

    public void g() {
        int iD = this.e.d();
        this.a = iD;
        boolean z = this.b.size() < (this.x * 2) + 1 && this.b.size() < iD;
        int iMax = this.f;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.b.size()) {
            f fVar = (f) this.b.get(i2);
            int iE = this.e.e(fVar.a);
            if (iE != -1) {
                if (iE == -2) {
                    this.b.remove(i2);
                    i2--;
                    if (!z2) {
                        this.e.o(this);
                        z2 = true;
                    }
                    this.e.a(this, fVar.b, fVar.a);
                    int i3 = this.f;
                    if (i3 == fVar.b) {
                        iMax = Math.max(0, Math.min(i3, iD - 1));
                    }
                } else {
                    int i4 = fVar.b;
                    if (i4 != iE) {
                        if (i4 == this.f) {
                            iMax = iE;
                        }
                        fVar.b = iE;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.e.c(this);
        }
        Collections.sort(this.b, g0);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                g gVar = (g) getChildAt(i5).getLayoutParams();
                if (!gVar.a) {
                    gVar.c = 0.0f;
                }
            }
            K(iMax, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public cl4 getAdapter() {
        return this.e;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        if (this.b0 == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((g) ((View) this.c0.get(i3)).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.f;
    }

    public int getOffscreenPageLimit() {
        return this.x;
    }

    public int getPageMargin() {
        return this.m;
    }

    public final int h(int i2, float f2, int i3, int i4) {
        if (Math.abs(i4) <= this.L || Math.abs(i3) <= this.J) {
            i2 += (int) (f2 + (i2 >= this.f ? 0.4f : 0.6f));
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.b.size() <= 0) {
            return i2;
        }
        return Math.max(((f) this.b.get(0)).b, Math.min(i2, ((f) this.b.get(r4.size() - 1)).b));
    }

    public final void i(int i2, float f2, int i3) {
        i iVar = this.V;
        if (iVar != null) {
            iVar.a(i2, f2, i3);
        }
        List list = this.U;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                i iVar2 = (i) this.U.get(i4);
                if (iVar2 != null) {
                    iVar2.a(i2, f2, i3);
                }
            }
        }
        i iVar3 = this.W;
        if (iVar3 != null) {
            iVar3.a(i2, f2, i3);
        }
    }

    public final void j(int i2) {
        i iVar = this.V;
        if (iVar != null) {
            iVar.c(i2);
        }
        List list = this.U;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                i iVar2 = (i) this.U.get(i3);
                if (iVar2 != null) {
                    iVar2.c(i2);
                }
            }
        }
        i iVar3 = this.W;
        if (iVar3 != null) {
            iVar3.c(i2);
        }
    }

    public final void k(int i2) {
        i iVar = this.V;
        if (iVar != null) {
            iVar.b(i2);
        }
        List list = this.U;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                i iVar2 = (i) this.U.get(i3);
                if (iVar2 != null) {
                    iVar2.b(i2);
                }
            }
        }
        i iVar3 = this.W;
        if (iVar3 != null) {
            iVar3.b(i2);
        }
    }

    public float l(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    public final void m() {
        this.y = false;
        this.z = false;
        VelocityTracker velocityTracker = this.I;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.I = null;
        }
    }

    public boolean n(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return keyEvent.hasModifiers(2) ? y() : c(17);
            }
            if (keyCode == 22) {
                return keyEvent.hasModifiers(2) ? z() : c(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return c(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return c(1);
                }
            }
        }
        return false;
    }

    public final Rect o(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.d0);
        Scroller scroller = this.j;
        if (scroller != null && !scroller.isFinished()) {
            this.j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i2;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.m <= 0 || this.n == null || this.b.size() <= 0 || this.e == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f4 = this.m / width;
        int i3 = 0;
        f fVar = (f) this.b.get(0);
        float f5 = fVar.e;
        int size = this.b.size();
        int i4 = fVar.b;
        int i5 = ((f) this.b.get(size - 1)).b;
        while (i4 < i5) {
            while (true) {
                i2 = fVar.b;
                if (i4 <= i2 || i3 >= size) {
                    break;
                }
                i3++;
                fVar = (f) this.b.get(i3);
            }
            if (i4 == i2) {
                float f6 = fVar.e;
                float f7 = fVar.d;
                f2 = (f6 + f7) * width;
                f5 = f6 + f7 + f4;
            } else {
                float f8 = this.e.f(i4);
                f2 = (f5 + f8) * width;
                f5 += f8 + f4;
            }
            if (this.m + f2 > scrollX) {
                f3 = f4;
                this.n.setBounds(Math.round(f2), this.o, Math.round(this.m + f2), this.p);
                this.n.draw(canvas);
            } else {
                f3 = f4;
            }
            if (f2 > scrollX + r2) {
                return;
            }
            i4++;
            f4 = f3;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action == 3 || action == 1) {
            H();
            return false;
        }
        if (action != 0) {
            if (this.y) {
                return true;
            }
            if (this.z) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.F = x;
            this.D = x;
            float y = motionEvent.getY();
            this.G = y;
            this.E = y;
            this.H = motionEvent.getPointerId(0);
            this.z = false;
            this.k = true;
            this.j.computeScrollOffset();
            if (this.e0 != 2 || Math.abs(this.j.getFinalX() - this.j.getCurrX()) <= this.M) {
                f(false);
                this.y = false;
            } else {
                this.j.abortAnimation();
                this.w = false;
                C();
                this.y = true;
                G(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.H;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f2 = x2 - this.D;
                float fAbs = Math.abs(f2);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.G);
                if (f2 != 0.0f && !v(this.D, f2) && e(this, false, (int) f2, (int) x2, (int) y2)) {
                    this.D = x2;
                    this.E = y2;
                    this.z = true;
                    return false;
                }
                int i3 = this.C;
                if (fAbs > i3 && fAbs * 0.5f > fAbs2) {
                    this.y = true;
                    G(true);
                    setScrollState(1);
                    float f3 = this.F;
                    float f4 = this.C;
                    this.D = f2 > 0.0f ? f3 + f4 : f3 - f4;
                    this.E = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i3) {
                    this.z = true;
                }
                if (this.y && B(x2)) {
                    dq7.h0(this);
                }
            }
        } else if (action == 6) {
            x(motionEvent);
        }
        if (this.I == null) {
            this.I = VelocityTracker.obtain();
        }
        this.I.addMovement(motionEvent);
        return this.y;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        g gVar;
        g gVar2;
        int i4;
        setMeasuredDimension(View.getDefaultSize(0, i2), View.getDefaultSize(0, i3));
        int measuredWidth = getMeasuredWidth();
        this.B = Math.min(measuredWidth / 10, this.A);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            boolean z = true;
            int i6 = 1073741824;
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8 && (gVar2 = (g) childAt.getLayoutParams()) != null && gVar2.a) {
                int i7 = gVar2.b;
                int i8 = i7 & 7;
                int i9 = i7 & 112;
                boolean z2 = i9 == 48 || i9 == 80;
                if (i8 != 3 && i8 != 5) {
                    z = false;
                }
                int i10 = IntCompanionObject.MIN_VALUE;
                if (z2) {
                    i4 = Integer.MIN_VALUE;
                    i10 = 1073741824;
                } else {
                    i4 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i11 = ((ViewGroup.LayoutParams) gVar2).width;
                if (i11 != -2) {
                    if (i11 == -1) {
                        i11 = paddingLeft;
                    }
                    i10 = 1073741824;
                } else {
                    i11 = paddingLeft;
                }
                int i12 = ((ViewGroup.LayoutParams) gVar2).height;
                if (i12 == -2) {
                    i12 = measuredHeight;
                    i6 = i4;
                } else if (i12 == -1) {
                    i12 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11, i10), View.MeasureSpec.makeMeasureSpec(i12, i6));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i5++;
        }
        this.s = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.t = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.u = true;
        C();
        this.u = false;
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8 && ((gVar = (g) childAt2.getLayoutParams()) == null || !gVar.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * gVar.c), 1073741824), this.t);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        int i5;
        f fVarQ;
        int childCount = getChildCount();
        if ((i2 & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i5 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
            i5 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (fVarQ = q(childAt)) != null && fVarQ.b == this.f && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i5;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.c());
        cl4 cl4Var = this.e;
        if (cl4Var != null) {
            cl4Var.i(kVar.g, kVar.h);
            K(kVar.f, false, true);
        } else {
            this.g = kVar.f;
            this.h = kVar.g;
            this.i = kVar.h;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        k kVar = new k(super.onSaveInstanceState());
        kVar.f = this.f;
        cl4 cl4Var = this.e;
        if (cl4Var != null) {
            kVar.g = cl4Var.j();
        }
        return kVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.m;
            E(i2, i4, i6, i6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0139  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public f p(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return q(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public f q(View view) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            f fVar = (f) this.b.get(i2);
            if (this.e.h(view, fVar.a)) {
                return fVar;
            }
        }
        return null;
    }

    public final f r() {
        int i2;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f3 = clientWidth > 0 ? this.m / clientWidth : 0.0f;
        int i3 = 0;
        boolean z = true;
        f fVar = null;
        int i4 = -1;
        float f4 = 0.0f;
        while (i3 < this.b.size()) {
            f fVar2 = (f) this.b.get(i3);
            if (!z && fVar2.b != (i2 = i4 + 1)) {
                fVar2 = this.c;
                fVar2.e = f2 + f4 + f3;
                fVar2.b = i2;
                fVar2.d = this.e.f(i2);
                i3--;
            }
            f fVar3 = fVar2;
            f2 = fVar3.e;
            float f5 = fVar3.d + f2 + f3;
            if (!z && scrollX < f2) {
                return fVar;
            }
            if (scrollX < f5 || i3 == this.b.size() - 1) {
                return fVar3;
            }
            int i5 = fVar3.b;
            float f6 = fVar3.d;
            i3++;
            z = false;
            i4 = i5;
            f4 = f6;
            fVar = fVar3;
        }
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.u) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public f s(int i2) {
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            f fVar = (f) this.b.get(i3);
            if (fVar.b == i2) {
                return fVar;
            }
        }
        return null;
    }

    public void setAdapter(cl4 cl4Var) {
        cl4 cl4Var2 = this.e;
        if (cl4Var2 != null) {
            cl4Var2.m(null);
            this.e.o(this);
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                f fVar = (f) this.b.get(i2);
                this.e.a(this, fVar.b, fVar.a);
            }
            this.e.c(this);
            this.b.clear();
            F();
            this.f = 0;
            scrollTo(0, 0);
        }
        this.e = cl4Var;
        this.a = 0;
        if (cl4Var != null) {
            if (this.l == null) {
                this.l = new j();
            }
            this.e.m(this.l);
            this.w = false;
            boolean z = this.Q;
            this.Q = true;
            this.a = this.e.d();
            if (this.g >= 0) {
                this.e.i(this.h, this.i);
                K(this.g, false, true);
                this.g = -1;
                this.h = null;
                this.i = null;
            } else if (z) {
                requestLayout();
            } else {
                C();
            }
        }
        List list = this.a0;
        if (list == null || list.isEmpty() || this.a0.size() <= 0) {
            return;
        }
        wb0.a(this.a0.get(0));
        throw null;
    }

    public void setCurrentItem(int i2) {
        this.w = false;
        K(i2, !this.Q, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i2 + " too small; defaulting to 1");
            i2 = 1;
        }
        if (i2 != this.x) {
            this.x = i2;
            C();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(i iVar) {
        this.V = iVar;
    }

    public void setPageMargin(int i2) {
        int i3 = this.m;
        this.m = i2;
        int width = getWidth();
        E(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.n = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i2) {
        if (this.e0 == i2) {
            return;
        }
        this.e0 = i2;
        k(i2);
    }

    public void t() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.j = new Scroller(context, h0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.C = viewConfiguration.getScaledPagingTouchSlop();
        this.J = (int) (400.0f * f2);
        this.K = viewConfiguration.getScaledMaximumFlingVelocity();
        this.O = new EdgeEffect(context);
        this.P = new EdgeEffect(context);
        this.L = (int) (25.0f * f2);
        this.M = (int) (2.0f * f2);
        this.A = (int) (f2 * 16.0f);
        dq7.q0(this, new h());
        if (dq7.z(this) == 0) {
            dq7.B0(this, 1);
        }
        dq7.E0(this, new d());
    }

    public final boolean v(float f2, float f3) {
        return (f2 < ((float) this.B) && f3 > 0.0f) || (f2 > ((float) (getWidth() - this.B)) && f3 < 0.0f);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void w(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r0 = r11.T
            r1 = 1
            if (r0 <= 0) goto L6b
            int r0 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = 0
        L1a:
            if (r6 >= r5) goto L6b
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r8 = (androidx.viewpager.widget.ViewPager.g) r8
            boolean r9 = r8.a
            if (r9 != 0) goto L2b
            goto L68
        L2b:
            int r8 = r8.b
            r8 = r8 & 7
            if (r8 == r1) goto L4f
            r9 = 3
            if (r8 == r9) goto L49
            r9 = 5
            if (r8 == r9) goto L39
            r8 = r2
            goto L5c
        L39:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
        L45:
            r10 = r8
            r8 = r2
            r2 = r10
            goto L5c
        L49:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L5c
        L4f:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
            goto L45
        L5c:
            int r2 = r2 + r0
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L67
            r7.offsetLeftAndRight(r2)
        L67:
            r2 = r8
        L68:
            int r6 = r6 + 1
            goto L1a
        L6b:
            r11.i(r12, r13, r14)
            r11.S = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.w(int, float, int):void");
    }

    public final void x(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.H) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.D = motionEvent.getX(i2);
            this.H = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.I;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean y() {
        int i2 = this.f;
        if (i2 <= 0) {
            return false;
        }
        J(i2 - 1, true);
        return true;
    }

    public boolean z() {
        cl4 cl4Var = this.e;
        if (cl4Var == null || this.f >= cl4Var.d() - 1) {
            return false;
        }
        J(this.f + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(yy0.e(getContext(), i2));
    }
}
