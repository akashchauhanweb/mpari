package com.zepto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sos.SModle.MparRelation;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class z75 extends BaseAdapter {
    public Context a;
    public ArrayList b;

    public z75(Context context, ArrayList arrayList) {
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
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (view == null) {
            view = LayoutInflater.from(this.a).inflate(R.layout.coustome_spinner1, parent, false);
        }
        Intrinsics.checkNotNull(view);
        View viewFindViewById = view.findViewById(R.id.text_blood);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById;
        ArrayList arrayList = this.b;
        Intrinsics.checkNotNull(arrayList);
        MparRelation mparRelation = (MparRelation) arrayList.get(i);
        textView.setText(String.valueOf(mparRelation != null ? mparRelation.getRelName() : null));
        return view;
    }
}
