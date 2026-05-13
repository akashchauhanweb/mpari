package com.zepto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanModel.RtoNameModle;
import com.nic.mparivahan.VahanServices.VahanModel.RtoNameModleItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ra7 extends BaseAdapter {
    public Context a;
    public RtoNameModle b;

    public ra7(Context context, RtoNameModle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.a = context;
        this.b = state;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        RtoNameModle rtoNameModle = this.b;
        Intrinsics.checkNotNull(rtoNameModle);
        return rtoNameModle.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        RtoNameModle rtoNameModle = this.b;
        Intrinsics.checkNotNull(rtoNameModle);
        RtoNameModleItem rtoNameModleItem = rtoNameModle.get(i);
        Intrinsics.checkNotNull(rtoNameModleItem);
        return rtoNameModleItem;
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
        ((TextView) viewFindViewById).setText(this.b.get(i).getOff_name().toString());
        return view;
    }
}
