package com.zepto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.SubcategoryMasterDataX;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class l27 extends BaseAdapter {
    public Context a;
    public List b;

    public l27(Context context, List list) {
        this.a = context;
        this.b = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List list = this.b;
        Intrinsics.checkNotNull(list);
        return list.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        List list = this.b;
        Intrinsics.checkNotNull(list);
        Object obj = list.get(i);
        Intrinsics.checkNotNull(obj);
        return obj;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup parent) {
        SubcategoryMasterDataX subcategoryMasterDataX;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (view == null) {
            view = LayoutInflater.from(this.a).inflate(R.layout.spinner12, parent, false);
        }
        Intrinsics.checkNotNull(view);
        View viewFindViewById = view.findViewById(R.id.text_blood);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById;
        List list = this.b;
        textView.setText(String.valueOf((list == null || (subcategoryMasterDataX = (SubcategoryMasterDataX) list.get(i)) == null) ? null : subcategoryMasterDataX.getSub_cat_name()));
        return view;
    }
}
