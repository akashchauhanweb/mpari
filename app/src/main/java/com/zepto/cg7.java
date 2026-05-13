package com.zepto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DRcModle.DReasonResponse;
import com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class cg7 extends BaseAdapter {
    public Context a;
    public DReasonResponse b;

    public cg7(Context context, DReasonResponse state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.a = context;
        this.b = state;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        DReasonResponse dReasonResponse = this.b;
        Intrinsics.checkNotNull(dReasonResponse);
        return dReasonResponse.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        DReasonResponse dReasonResponse = this.b;
        Intrinsics.checkNotNull(dReasonResponse);
        DReasonResponseItem dReasonResponseItem = dReasonResponse.get(i);
        Intrinsics.checkNotNull(dReasonResponseItem);
        return dReasonResponseItem;
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
        ((TextView) viewFindViewById).setText(String.valueOf(this.b.get(i).getReason_desc()));
        return view;
    }
}
