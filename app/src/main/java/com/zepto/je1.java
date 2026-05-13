package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class je1 extends BaseAdapter {
    public static final int d = 4;
    public final Calendar a;
    public final int b;
    public final int c;

    public je1() {
        Calendar calendarI = xs6.i();
        this.a = calendarI;
        this.b = calendarI.getMaximum(7);
        this.c = calendarI.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i) {
        if (i >= this.b) {
            return null;
        }
        return Integer.valueOf(b(i));
    }

    public final int b(int i) {
        int i2 = i + this.c;
        int i3 = this.b;
        return i2 > i3 ? i2 - i3 : i2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(p05.t, viewGroup, false);
        }
        this.a.set(7, b(i));
        textView.setText(this.a.getDisplayName(7, d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(b15.l), this.a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public je1(int i) {
        Calendar calendarI = xs6.i();
        this.a = calendarI;
        this.b = calendarI.getMaximum(7);
        this.c = i;
    }
}
