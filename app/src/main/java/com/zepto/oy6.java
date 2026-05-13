package com.zepto;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.nic.mparivahan.R;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class oy6 extends ArrayAdapter {
    public final List a;
    public final Calendar b;
    public final List c;
    public final LayoutInflater d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy6(Context context, List monthlyDates, Calendar currentDate, List allSlots) {
        super(context, R.layout.single_cell_layout);
        Intrinsics.checkNotNullParameter(monthlyDates, "monthlyDates");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(allSlots, "allSlots");
        Intrinsics.checkNotNull(context);
        this.a = monthlyDates;
        this.b = currentDate;
        this.c = allSlots;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "from(...)");
        this.d = layoutInflaterFrom;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.a.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public Object getItem(int i) {
        return this.a.get(i);
    }

    @Override // android.widget.ArrayAdapter
    public int getPosition(Object obj) {
        return CollectionsKt___CollectionsKt.indexOf((List<? extends Object>) this.a, obj);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Date date = (Date) this.a.get(i);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i2 = calendar.get(5);
        int i3 = calendar.get(2) + 1;
        int i4 = calendar.get(1);
        int i5 = this.b.get(2) + 1;
        int i6 = this.b.get(1);
        if (view == null) {
            view = this.d.inflate(R.layout.single_cell_layout, parent, false);
        }
        Intrinsics.checkNotNull(view);
        View viewFindViewById = view.findViewById(R.id.calendar_date_id);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById;
        textView.setText(String.valueOf(i2));
        if (i3 == i5 && i4 == i6) {
            textView.setTextColor(Color.parseColor("#000000"));
        } else {
            textView.setAlpha(0.4f);
        }
        Calendar calendar2 = Calendar.getInstance();
        int size = this.c.size();
        for (int i7 = 0; i7 < size; i7++) {
            calendar2.setTime(((ca0) this.c.get(i7)).b());
            if (i2 == calendar2.get(5) && i3 == calendar2.get(2) + 1) {
                textView.setTextColor(getContext().getResources().getColor(R.color.white));
                textView.setBackground(((ca0) this.c.get(i7)).a());
            }
        }
        return view;
    }
}
