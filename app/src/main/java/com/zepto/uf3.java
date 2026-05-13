package com.zepto;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public class uf3 implements s16 {
    public static Method G;
    public static Method H;
    public Runnable A;
    public final Handler B;
    public final Rect C;
    public Rect D;
    public boolean E;
    public PopupWindow F;
    public Context a;
    public ListAdapter b;
    public fx1 c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public View p;
    public int q;
    public DataSetObserver r;
    public View s;
    public Drawable t;
    public AdapterView.OnItemClickListener u;
    public AdapterView.OnItemSelectedListener v;
    public final i w;
    public final h x;
    public final g y;
    public final e z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewT = uf3.this.t();
            if (viewT == null || viewT.getWindowToken() == null) {
                return;
            }
            uf3.this.a();
        }
    }

    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            fx1 fx1Var;
            if (i == -1 || (fx1Var = uf3.this.c) == null) {
                return;
            }
            fx1Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static class c {
        public static int a(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    public static class d {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            uf3.this.r();
        }
    }

    public class f extends DataSetObserver {
        public f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (uf3.this.d()) {
                uf3.this.a();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            uf3.this.dismiss();
        }
    }

    public class g implements AbsListView.OnScrollListener {
        public g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || uf3.this.A() || uf3.this.F.getContentView() == null) {
                return;
            }
            uf3 uf3Var = uf3.this;
            uf3Var.B.removeCallbacks(uf3Var.w);
            uf3.this.w.run();
        }
    }

    public class h implements View.OnTouchListener {
        public h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = uf3.this.F) != null && popupWindow.isShowing() && x >= 0 && x < uf3.this.F.getWidth() && y >= 0 && y < uf3.this.F.getHeight()) {
                uf3 uf3Var = uf3.this;
                uf3Var.B.postDelayed(uf3Var.w, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            uf3 uf3Var2 = uf3.this;
            uf3Var2.B.removeCallbacks(uf3Var2.w);
            return false;
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            fx1 fx1Var = uf3.this.c;
            if (fx1Var == null || !dq7.T(fx1Var) || uf3.this.c.getCount() <= uf3.this.c.getChildCount()) {
                return;
            }
            int childCount = uf3.this.c.getChildCount();
            uf3 uf3Var = uf3.this;
            if (childCount <= uf3Var.o) {
                uf3Var.F.setInputMethodMode(2);
                uf3.this.a();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                H = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public uf3(Context context) {
        this(context, null, zy4.E);
    }

    public boolean A() {
        return this.F.getInputMethodMode() == 2;
    }

    public boolean B() {
        return this.E;
    }

    public final void C() {
        View view = this.p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.p);
            }
        }
    }

    public void D(View view) {
        this.s = view;
    }

    public void E(int i2) {
        this.F.setAnimationStyle(i2);
    }

    public void F(int i2) {
        Drawable background = this.F.getBackground();
        if (background == null) {
            R(i2);
            return;
        }
        background.getPadding(this.C);
        Rect rect = this.C;
        this.e = rect.left + rect.right + i2;
    }

    public void G(int i2) {
        this.l = i2;
    }

    public void H(Rect rect) {
        this.D = rect != null ? new Rect(rect) : null;
    }

    public void I(int i2) {
        this.F.setInputMethodMode(i2);
    }

    public void J(boolean z) {
        this.E = z;
        this.F.setFocusable(z);
    }

    public void K(PopupWindow.OnDismissListener onDismissListener) {
        this.F.setOnDismissListener(onDismissListener);
    }

    public void L(AdapterView.OnItemClickListener onItemClickListener) {
        this.u = onItemClickListener;
    }

    public void M(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.v = onItemSelectedListener;
    }

    public void N(boolean z) {
        this.k = true;
        this.j = z;
    }

    public final void O(boolean z) {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.F, z);
            return;
        }
        Method method = G;
        if (method != null) {
            try {
                method.invoke(this.F, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    public void P(int i2) {
        this.q = i2;
    }

    public void Q(int i2) {
        fx1 fx1Var = this.c;
        if (!d() || fx1Var == null) {
            return;
        }
        fx1Var.setListSelectionHidden(false);
        fx1Var.setSelection(i2);
        if (fx1Var.getChoiceMode() != 0) {
            fx1Var.setItemChecked(i2, true);
        }
    }

    public void R(int i2) {
        this.e = i2;
    }

    @Override // com.zepto.s16
    public void a() {
        int iQ = q();
        boolean zA = A();
        ft4.b(this.F, this.h);
        if (this.F.isShowing()) {
            if (dq7.T(t())) {
                int width = this.e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = t().getWidth();
                }
                int i2 = this.d;
                if (i2 == -1) {
                    if (!zA) {
                        iQ = -1;
                    }
                    if (zA) {
                        this.F.setWidth(this.e == -1 ? -1 : 0);
                        this.F.setHeight(0);
                    } else {
                        this.F.setWidth(this.e == -1 ? -1 : 0);
                        this.F.setHeight(-1);
                    }
                } else if (i2 != -2) {
                    iQ = i2;
                }
                this.F.setOutsideTouchable((this.n || this.m) ? false : true);
                this.F.update(t(), this.f, this.g, width < 0 ? -1 : width, iQ < 0 ? -1 : iQ);
                return;
            }
            return;
        }
        int width2 = this.e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = t().getWidth();
        }
        int i3 = this.d;
        if (i3 == -1) {
            iQ = -1;
        } else if (i3 != -2) {
            iQ = i3;
        }
        this.F.setWidth(width2);
        this.F.setHeight(iQ);
        O(true);
        this.F.setOutsideTouchable((this.n || this.m) ? false : true);
        this.F.setTouchInterceptor(this.x);
        if (this.k) {
            ft4.a(this.F, this.j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = H;
            if (method != null) {
                try {
                    method.invoke(this.F, this.D);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            d.a(this.F, this.D);
        }
        ft4.c(this.F, t(), this.f, this.g, this.l);
        this.c.setSelection(-1);
        if (!this.E || this.c.isInTouchMode()) {
            r();
        }
        if (this.E) {
            return;
        }
        this.B.post(this.z);
    }

    public void b(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    @Override // com.zepto.s16
    public boolean d() {
        return this.F.isShowing();
    }

    @Override // com.zepto.s16
    public void dismiss() {
        this.F.dismiss();
        C();
        this.F.setContentView(null);
        this.c = null;
        this.B.removeCallbacks(this.w);
    }

    public int e() {
        return this.f;
    }

    public Drawable g() {
        return this.F.getBackground();
    }

    @Override // com.zepto.s16
    public ListView h() {
        return this.c;
    }

    public void j(int i2) {
        this.g = i2;
        this.i = true;
    }

    public void l(int i2) {
        this.f = i2;
    }

    public int n() {
        if (this.i) {
            return this.g;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.r;
        if (dataSetObserver == null) {
            this.r = new f();
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.r);
        }
        fx1 fx1Var = this.c;
        if (fx1Var != null) {
            fx1Var.setAdapter(this.b);
        }
    }

    public final int q() {
        int measuredHeight;
        int i2;
        int iMakeMeasureSpec;
        View view;
        int i3;
        if (this.c == null) {
            Context context = this.a;
            this.A = new a();
            fx1 fx1VarS = s(context, !this.E);
            this.c = fx1VarS;
            Drawable drawable = this.t;
            if (drawable != null) {
                fx1VarS.setSelector(drawable);
            }
            this.c.setAdapter(this.b);
            this.c.setOnItemClickListener(this.u);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new b());
            this.c.setOnScrollListener(this.y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.v;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            fx1 fx1Var = this.c;
            View view2 = this.p;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i4 = this.q;
                if (i4 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(fx1Var, layoutParams);
                } else if (i4 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.q);
                } else {
                    linearLayout.addView(fx1Var, layoutParams);
                    linearLayout.addView(view2);
                }
                int i5 = this.e;
                if (i5 >= 0) {
                    i3 = Integer.MIN_VALUE;
                } else {
                    i5 = 0;
                    i3 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i5, i3), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = fx1Var;
            }
            this.F.setContentView(view);
        } else {
            View view3 = this.p;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.F.getBackground();
        if (background != null) {
            background.getPadding(this.C);
            Rect rect = this.C;
            int i6 = rect.top;
            i2 = rect.bottom + i6;
            if (!this.i) {
                this.g = -i6;
            }
        } else {
            this.C.setEmpty();
            i2 = 0;
        }
        int iU = u(t(), this.g, this.F.getInputMethodMode() == 2);
        if (this.m || this.d == -1) {
            return iU + i2;
        }
        int i7 = this.e;
        if (i7 == -2) {
            int i8 = this.a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8 - (rect2.left + rect2.right), IntCompanionObject.MIN_VALUE);
        } else if (i7 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else {
            int i9 = this.a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - (rect3.left + rect3.right), 1073741824);
        }
        int iD = this.c.d(iMakeMeasureSpec, 0, -1, iU - measuredHeight, -1);
        if (iD > 0) {
            measuredHeight += i2 + this.c.getPaddingTop() + this.c.getPaddingBottom();
        }
        return iD + measuredHeight;
    }

    public void r() {
        fx1 fx1Var = this.c;
        if (fx1Var != null) {
            fx1Var.setListSelectionHidden(true);
            fx1Var.requestLayout();
        }
    }

    public fx1 s(Context context, boolean z) {
        return new fx1(context, z);
    }

    public View t() {
        return this.s;
    }

    public final int u(View view, int i2, boolean z) {
        return c.a(this.F, view, i2, z);
    }

    public Object v() {
        if (d()) {
            return this.c.getSelectedItem();
        }
        return null;
    }

    public long w() {
        if (d()) {
            return this.c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int x() {
        if (d()) {
            return this.c.getSelectedItemPosition();
        }
        return -1;
    }

    public View y() {
        if (d()) {
            return this.c.getSelectedView();
        }
        return null;
    }

    public int z() {
        return this.e;
    }

    public uf3(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public uf3(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.d = -2;
        this.e = -2;
        this.h = 1002;
        this.l = 0;
        this.m = false;
        this.n = false;
        this.o = IntCompanionObject.MAX_VALUE;
        this.q = 0;
        this.w = new i();
        this.x = new h();
        this.y = new g();
        this.z = new e();
        this.C = new Rect();
        this.a = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c25.t1, i2, i3);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(c25.u1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(c25.v1, 0);
        this.g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        pr prVar = new pr(context, attributeSet, i2, i3);
        this.F = prVar;
        prVar.setInputMethodMode(1);
    }
}
