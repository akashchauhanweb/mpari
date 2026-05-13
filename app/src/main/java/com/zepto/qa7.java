package com.zepto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanModel.NocReasonModle;
import com.nic.mparivahan.VahanServices.VahanModel.NocReasonModleItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class qa7 extends BaseAdapter {
    public Context a;
    public NocReasonModle b;

    public qa7(Context context, NocReasonModle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.a = context;
        this.b = state;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        NocReasonModle nocReasonModle = this.b;
        Intrinsics.checkNotNull(nocReasonModle);
        return nocReasonModle.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        NocReasonModle nocReasonModle = this.b;
        Intrinsics.checkNotNull(nocReasonModle);
        NocReasonModleItem nocReasonModleItem = nocReasonModle.get(i);
        Intrinsics.checkNotNull(nocReasonModleItem);
        return nocReasonModleItem;
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
        ((TextView) viewFindViewById).setText(this.b.get(i).getDescr());
        return view;
    }
}
