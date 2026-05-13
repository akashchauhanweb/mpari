package com.zepto;

import android.database.Cursor;
import android.widget.Filter;

/* JADX INFO: loaded from: classes.dex */
public class a41 extends Filter {
    public a a;

    public interface a {
        void a(Cursor cursor);

        Cursor b();

        CharSequence c(Cursor cursor);

        Cursor d(CharSequence charSequence);
    }

    public a41(a aVar) {
        this.a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.a.c((Cursor) obj);
    }

    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorD = this.a.d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorD != null) {
            filterResults.count = cursorD.getCount();
            filterResults.values = cursorD;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor cursorB = this.a.b();
        Object obj = filterResults.values;
        if (obj == null || obj == cursorB) {
            return;
        }
        this.a.a((Cursor) obj);
    }
}
