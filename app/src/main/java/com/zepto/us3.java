package com.zepto;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public abstract class us3 implements s16, androidx.appcompat.view.menu.i, AdapterView.OnItemClickListener {
    public Rect a;

    public static boolean A(androidx.appcompat.view.menu.e eVar) {
        int size = eVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = eVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public static androidx.appcompat.view.menu.d B(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (androidx.appcompat.view.menu.d) listAdapter;
    }

    public static int r(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    @Override // androidx.appcompat.view.menu.i
    public int c() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.i
    public void e(Context context, androidx.appcompat.view.menu.e eVar) {
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean l(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean m(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
        return false;
    }

    public abstract void o(androidx.appcompat.view.menu.e eVar);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        B(listAdapter).a.O((MenuItem) listAdapter.getItem(i), this, p() ? 0 : 4);
    }

    public boolean p() {
        return true;
    }

    public Rect q() {
        return this.a;
    }

    public abstract void s(View view);

    public void t(Rect rect) {
        this.a = rect;
    }

    public abstract void u(boolean z);

    public abstract void v(int i);

    public abstract void w(int i);

    public abstract void x(PopupWindow.OnDismissListener onDismissListener);

    public abstract void y(boolean z);

    public abstract void z(int i);
}
