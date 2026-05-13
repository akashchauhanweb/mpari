package com.zepto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.ui.newlearner.DataClass.Relationship;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b85 extends BaseAdapter {
    public Context a;
    public ArrayList b;

    public b85(Context context, ArrayList relationship) {
        Intrinsics.checkNotNullParameter(relationship, "relationship");
        this.a = context;
        this.b = relationship;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Object obj = this.b.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
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
            view = LayoutInflater.from(this.a).inflate(R.layout.coustome_spinner2, parent, false);
        }
        Intrinsics.checkNotNull(view);
        View viewFindViewById = view.findViewById(R.id.text_blood);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(((Relationship) this.b.get(i)).getRelationName().toString());
        return view;
    }
}
