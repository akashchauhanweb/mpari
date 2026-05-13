package com.zepto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.nic.mparivahan.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class wr6 extends ArrayAdapter {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr6(Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        Intrinsics.checkNotNull(context);
        Intrinsics.checkNotNull(arrayList);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        a70 a70Var = (a70) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.custom_spinner, parent, false);
        }
        Intrinsics.checkNotNull(view);
        View viewFindViewById = view.findViewById(R.id.text_blood);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        Intrinsics.checkNotNull(a70Var);
        ((TextView) viewFindViewById).setText(a70Var.a().toString());
        return view;
    }
}
