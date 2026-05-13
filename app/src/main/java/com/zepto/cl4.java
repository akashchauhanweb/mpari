package com.zepto;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class cl4 {
    public final DataSetObservable a = new DataSetObservable();
    public DataSetObserver b;

    public abstract void a(ViewGroup viewGroup, int i, Object obj);

    public void b(View view) {
    }

    public void c(ViewGroup viewGroup) {
        b(viewGroup);
    }

    public abstract int d();

    public int e(Object obj) {
        return -1;
    }

    public float f(int i) {
        return 1.0f;
    }

    public abstract Object g(ViewGroup viewGroup, int i);

    public abstract boolean h(View view, Object obj);

    public void i(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable j() {
        return null;
    }

    public void k(View view, int i, Object obj) {
    }

    public void l(ViewGroup viewGroup, int i, Object obj) {
        k(viewGroup, i, obj);
    }

    public void m(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.b = dataSetObserver;
        }
    }

    public void n(View view) {
    }

    public void o(ViewGroup viewGroup) {
        n(viewGroup);
    }
}
