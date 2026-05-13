package com.zepto;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanModel.FeesModleItem;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class x82 extends RecyclerView.h {
    public final ArrayList d;
    public final Context e;

    public static final class a extends RecyclerView.d0 {
        public final TextView u;
        public final TextView v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View viewFindViewById = this.a.findViewById(R.id.feeTitle);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (TextView) viewFindViewById;
            View viewFindViewById2 = this.a.findViewById(R.id.fee_Value);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (TextView) viewFindViewById2;
        }

        public final TextView O() {
            return this.u;
        }

        public final TextView P() {
            return this.v;
        }
    }

    public x82(ArrayList language_modle, Context context) {
        Intrinsics.checkNotNullParameter(language_modle, "language_modle");
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = language_modle;
        this.e = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void p(a holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        new wa3(this.e);
        Object obj = this.d.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        FeesModleItem feesModleItem = (FeesModleItem) obj;
        holder.O().setText(feesModleItem.getFeeHeadDescr());
        holder.P().setText(String.valueOf(feesModleItem.getFeeAmount()));
        Log.e("title", feesModleItem.getFeeHeadDescr());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.fess_item, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
