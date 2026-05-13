package com.zepto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Tax.Model.TaxModes;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class pd6 extends BaseAdapter {
    public Context a;
    public ArrayList b;

    public pd6(Context context, ArrayList arrayList) {
        this.a = context;
        this.b = arrayList;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList arrayList = this.b;
        Intrinsics.checkNotNull(arrayList);
        return arrayList.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        ArrayList arrayList = this.b;
        Intrinsics.checkNotNull(arrayList);
        Object obj = arrayList.get(i);
        Intrinsics.checkNotNull(obj);
        return obj;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup parent) {
        TaxModes taxModes;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (view == null) {
            view = LayoutInflater.from(this.a).inflate(R.layout.spinner3, parent, false);
        }
        Intrinsics.checkNotNull(view);
        View viewFindViewById = view.findViewById(R.id.text_blood);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById;
        ArrayList arrayList = this.b;
        textView.setText(String.valueOf((arrayList == null || (taxModes = (TaxModes) arrayList.get(i)) == null) ? null : taxModes.getDescr()));
        return view;
    }
}
