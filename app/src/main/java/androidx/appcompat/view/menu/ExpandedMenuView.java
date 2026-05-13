package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.e;
import com.zepto.lg6;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements e.b, j, AdapterView.OnItemClickListener {
    public static final int[] c = {R.attr.background, R.attr.divider};
    public e a;
    public int b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean a(g gVar) {
        return this.a.N(gVar, 0);
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar) {
        this.a = eVar;
    }

    public int getWindowAnimations() {
        return this.b;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((g) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        lg6 lg6VarV = lg6.v(context, attributeSet, c, i, 0);
        if (lg6VarV.s(0)) {
            setBackgroundDrawable(lg6VarV.g(0));
        }
        if (lg6VarV.s(1)) {
            setDivider(lg6VarV.g(1));
        }
        lg6VarV.w();
    }
}
