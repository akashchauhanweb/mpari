package com.zepto;

import android.content.Context;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.ui.slots.calendar.ExpandableHeightGridView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class u90 extends LinearLayout {
    public static final a k = new a(null);
    public ImageView a;
    public ImageView b;
    public TextView c;
    public TextView d;
    public ExpandableHeightGridView e;
    public final SimpleDateFormat f;
    public final Calendar g;
    public Context h;
    public mk2 i;
    public ArrayList j;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u90(Context context, ArrayList eventObjectses) {
        super(context);
        Intrinsics.checkNotNullParameter(eventObjectses, "eventObjectses");
        Locale locale = Locale.ENGLISH;
        this.f = new SimpleDateFormat("MMMM, yyyy", locale);
        this.g = Calendar.getInstance(locale);
        new ArrayList();
        this.j = eventObjectses;
        this.h = context;
        c();
        k();
        i();
        g();
        f();
    }

    public static final void h(u90 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.d();
    }

    public static final void j(u90 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.e();
    }

    public final void c() {
        Context context = getContext();
        Object systemService = context != null ? context.getSystemService("layout_inflater") : null;
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.calender_layout, this);
        View viewFindViewById = viewInflate.findViewById(R.id.previous_month);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        this.a = (ImageView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.next_month);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.ImageView");
        this.b = (ImageView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.display_current_year);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        this.c = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.display_current_date);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        this.d = (TextView) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(R.id.calendar_grid);
        Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type com.nic.mparivahan.dlservices.ui.slots.calendar.ExpandableHeightGridView");
        ExpandableHeightGridView expandableHeightGridView = (ExpandableHeightGridView) viewFindViewById5;
        this.e = expandableHeightGridView;
        if (expandableHeightGridView == null) {
            return;
        }
        expandableHeightGridView.setExpanded(true);
    }

    public void d() {
        this.g.add(2, 1);
        k();
    }

    public void e() {
        this.g.add(2, -1);
        k();
    }

    public final String f() {
        return new String[1][0];
    }

    public final void g() {
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.t90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    u90.h(this.a, view);
                }
            });
        }
    }

    public final ExpandableHeightGridView getCalendarGridView() {
        return this.e;
    }

    public final ArrayList<b46> getEventObjectses() {
        return this.j;
    }

    public final void i() {
        ImageView imageView = this.a;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.s90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    u90.j(this.a, view);
                }
            });
        }
    }

    public final void k() {
        ArrayList arrayList = new ArrayList();
        Object objClone = this.g.clone();
        Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type java.util.Calendar");
        Calendar calendar = (Calendar) objClone;
        calendar.set(5, 1);
        calendar.add(5, -(calendar.get(7) - 2));
        while (arrayList.size() < 42) {
            Date time = calendar.getTime();
            Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
            arrayList.add(time);
            calendar.add(5, 1);
        }
        Log.d("tag", "Year: " + this.g.get(1) + " Month: " + this.g.get(2));
        CharSequence charSequence = DateFormat.format("yyyy", this.g.getTime());
        CharSequence charSequence2 = DateFormat.format("MMMM", this.g.getTime());
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(charSequence);
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setText(charSequence2);
        }
        Context context = getContext();
        Calendar cal = this.g;
        Intrinsics.checkNotNullExpressionValue(cal, "cal");
        mk2 mk2Var = new mk2(context, arrayList, cal, this.j);
        this.i = mk2Var;
        ExpandableHeightGridView expandableHeightGridView = this.e;
        if (expandableHeightGridView == null) {
            return;
        }
        expandableHeightGridView.setAdapter((ListAdapter) mk2Var);
    }

    public final void setCalendarGridView(ExpandableHeightGridView expandableHeightGridView) {
        this.e = expandableHeightGridView;
    }

    public final void setEventObjectses(ArrayList<b46> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.j = arrayList;
    }

    public final void setSelectedDates(b46 eventObjectses) {
        Intrinsics.checkNotNullParameter(eventObjectses, "eventObjectses");
        this.j.add(eventObjectses);
        mk2 mk2Var = this.i;
        if (mk2Var != null) {
            mk2Var.notifyDataSetChanged();
        }
    }
}
