package com.zepto;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class gh2 {

    public class a implements Runnable {
        public final /* synthetic */ int c;
        public final /* synthetic */ ArrayList e;
        public final /* synthetic */ ArrayList f;
        public final /* synthetic */ ArrayList g;
        public final /* synthetic */ ArrayList h;

        public a(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.c = i;
            this.e = arrayList;
            this.f = arrayList2;
            this.g = arrayList3;
            this.h = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.c; i++) {
                dq7.I0((View) this.e.get(i), (String) this.f.get(i));
                dq7.I0((View) this.g.get(i), (String) this.h.get(i));
            }
        }
    }

    public static void d(List list, View view) {
        int size = list.size();
        if (g(list, view, size)) {
            return;
        }
        if (dq7.K(view) != null) {
            list.add(view);
        }
        for (int i = size; i < list.size(); i++) {
            View view2 = (View) list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!g(list, childAt, size) && dq7.K(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    public static boolean g(List list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    public static boolean i(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public abstract Object f(Object obj);

    public void h(View view, Rect rect) {
        if (dq7.T(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object j(Object obj, Object obj2, Object obj3);

    public abstract Object k(Object obj, Object obj2, Object obj3);

    public ArrayList l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
            arrayList2.add(dq7.K(view));
            dq7.I0(view, null);
        }
        return arrayList2;
    }

    public abstract void m(Object obj, View view, ArrayList arrayList);

    public abstract void n(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    public abstract void o(Object obj, Rect rect);

    public abstract void p(Object obj, View view);

    public abstract void q(sf2 sf2Var, Object obj, db0 db0Var, Runnable runnable);

    public void r(View view, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = (View) arrayList.get(i);
            String strK = dq7.K(view2);
            arrayList4.add(strK);
            if (strK != null) {
                dq7.I0(view2, null);
                String str = (String) map.get(strK);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i2))) {
                        dq7.I0((View) arrayList2.get(i2), strK);
                        break;
                    }
                    i2++;
                }
            }
        }
        hh4.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void s(Object obj, View view, ArrayList arrayList);

    public abstract void t(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract Object u(Object obj);
}
