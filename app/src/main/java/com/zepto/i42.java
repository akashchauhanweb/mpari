package com.zepto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice;
import com.nic.mparivahan.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i42 extends RecyclerView.h {
    public final ArrayList d;
    public final Context e;
    public final String f;
    public String g;

    public static final class a extends RecyclerView.d0 {
        public final TextView u;
        public final RecyclerView v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View viewFindViewById = this.a.findViewById(R.id.vehicle_title);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (TextView) viewFindViewById;
            View viewFindViewById2 = this.a.findViewById(R.id.es_vahan_recyclerView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (RecyclerView) viewFindViewById2;
        }

        public final TextView O() {
            return this.u;
        }

        public final RecyclerView P() {
            return this.v;
        }
    }

    public i42(ArrayList mList, Context mContext, String State_code) {
        Intrinsics.checkNotNullParameter(mList, "mList");
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(State_code, "State_code");
        this.d = mList;
        this.e = mContext;
        this.f = State_code;
        this.g = "T";
    }

    public final String A(int i, Context mContext) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        wa3 wa3Var = new wa3(mContext);
        HashMap map = new HashMap();
        map.put(0, String.valueOf(wa3Var.b("common_services", "Common Services")));
        map.put(1, String.valueOf(wa3Var.b("common_services", "Common Services")));
        map.put(2, String.valueOf(wa3Var.b("commercial_services", "Commercial Services")));
        map.put(3, String.valueOf(wa3Var.b("others_vahan", "Others")));
        return String.valueOf(map.get(Integer.valueOf(i)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void p(a holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.d.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        ArrayList arrayList = (ArrayList) obj;
        if (arrayList.size() > 0) {
            holder.O().setText(A(((Enabledservice) arrayList.get(0)).getServSection(), this.e));
            holder.P().setLayoutManager(new GridLayoutManager(this.e, 4));
            holder.P().setAdapter(new h42(arrayList, this.e, this.f.toString()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.vahan_section_item_main, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
