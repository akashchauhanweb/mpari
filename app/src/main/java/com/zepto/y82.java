package com.zepto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.FessMultiModel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class y82 extends RecyclerView.h {
    public final ArrayList d;
    public final Context e;

    public static final class a extends RecyclerView.d0 {
        public final RecyclerView u;
        public final TextView v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View viewFindViewById = this.a.findViewById(R.id.feeRecycle);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (RecyclerView) viewFindViewById;
            View viewFindViewById2 = this.a.findViewById(R.id.titledec);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (TextView) viewFindViewById2;
        }

        public final RecyclerView O() {
            return this.u;
        }

        public final TextView P() {
            return this.v;
        }
    }

    public y82(ArrayList arrayList, Context mContext) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.d = arrayList;
        this.e = mContext;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void p(a holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        new wa3(this.e);
        holder.O().setLayoutManager(new GridLayoutManager(this.e, 2));
        holder.O().setHasFixedSize(true);
        ArrayList arrayList = this.d;
        FessMultiModel fessMultiModel = arrayList != null ? (FessMultiModel) arrayList.get(i) : null;
        holder.P().setText(fessMultiModel != null ? fessMultiModel.getService_name() : null);
        Intrinsics.checkNotNull(fessMultiModel);
        holder.O().setAdapter(new mx3(fessMultiModel.getArrayList(), this.e));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.fee_adapter_item, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        ArrayList arrayList = this.d;
        Intrinsics.checkNotNull(arrayList);
        return arrayList.size();
    }
}
