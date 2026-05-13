package com.zepto;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class vs3 extends uf3 implements ss3 {
    public static Method J;
    public ss3 I;

    public static class a {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    public static class b {
        public static void a(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    public static class c extends fx1 {
        public final int n;
        public final int o;
        public ss3 p;
        public MenuItem q;

        public static class a {
            public static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public c(Context context, boolean z) {
            super(context, z);
            if (1 == a.a(context.getResources().getConfiguration())) {
                this.n = 21;
                this.o = 22;
            } else {
                this.n = 22;
                this.o = 21;
            }
        }

        @Override // com.zepto.fx1
        public /* bridge */ /* synthetic */ int d(int i, int i2, int i3, int i4, int i5) {
            return super.d(i, i2, i3, i4, i5);
        }

        @Override // com.zepto.fx1
        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i) {
            return super.e(motionEvent, i);
        }

        @Override // com.zepto.fx1, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // com.zepto.fx1, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // com.zepto.fx1, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // com.zepto.fx1, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // com.zepto.fx1, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.d dVar;
            int headersCount;
            int iPointToPosition;
            int i;
            if (this.p != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    dVar = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    dVar = (androidx.appcompat.view.menu.d) adapter;
                    headersCount = 0;
                }
                androidx.appcompat.view.menu.g item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= dVar.getCount()) ? null : dVar.getItem(i);
                MenuItem menuItem = this.q;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.e eVarB = dVar.b();
                    if (menuItem != null) {
                        this.p.f(eVarB, menuItem);
                    }
                    this.q = item;
                    if (item != null) {
                        this.p.c(eVarB, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.n) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i != this.o) {
                return super.onKeyDown(i, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.d) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.d) adapter).b().e(false);
            return true;
        }

        @Override // com.zepto.fx1, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(ss3 ss3Var) {
            this.p = ss3Var;
        }

        @Override // com.zepto.fx1, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                J = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public vs3(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void S(Object obj) {
        a.a(this.F, (Transition) obj);
    }

    public void T(Object obj) {
        a.b(this.F, (Transition) obj);
    }

    public void U(ss3 ss3Var) {
        this.I = ss3Var;
    }

    public void V(boolean z) {
        if (Build.VERSION.SDK_INT > 28) {
            b.a(this.F, z);
            return;
        }
        Method method = J;
        if (method != null) {
            try {
                method.invoke(this.F, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // com.zepto.ss3
    public void c(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        ss3 ss3Var = this.I;
        if (ss3Var != null) {
            ss3Var.c(eVar, menuItem);
        }
    }

    @Override // com.zepto.ss3
    public void f(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        ss3 ss3Var = this.I;
        if (ss3Var != null) {
            ss3Var.f(eVar, menuItem);
        }
    }

    @Override // com.zepto.uf3
    public fx1 s(Context context, boolean z) {
        c cVar = new c(context, z);
        cVar.setHoverListener(this);
        return cVar;
    }
}
