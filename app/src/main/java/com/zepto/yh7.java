package com.zepto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class yh7 extends BaseAdapter {
    public Context a;
    public VahanStateModle b;

    public yh7(Context context, VahanStateModle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.a = context;
        this.b = state;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        VahanStateModle vahanStateModle = this.b;
        Intrinsics.checkNotNull(vahanStateModle);
        return vahanStateModle.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        VahanStateModle vahanStateModle = this.b;
        Intrinsics.checkNotNull(vahanStateModle);
        VahanStateModleSubList vahanStateModleSubList = vahanStateModle.get(i);
        Intrinsics.checkNotNull(vahanStateModleSubList);
        return vahanStateModleSubList;
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
        Context context = this.a;
        Intrinsics.checkNotNull(context);
        textView.setBackgroundColor(yy0.c(context, android.R.color.transparent));
        textView.setText(this.b.get(i).get(1).toString());
        return view;
    }
}
