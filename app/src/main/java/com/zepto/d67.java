package com.zepto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModleItem;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class d67 extends BaseAdapter {
    public Context a;
    public ArrayList b;

    public d67(Context context, ArrayList state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.a = context;
        this.b = state;
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
        ((TextView) viewFindViewById).setText(((HTPModleItem) this.b.get(i)).getHp_type_descr().toString());
        return view;
    }
}
