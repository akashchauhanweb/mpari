package com.zepto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class sf5 extends RecyclerView.h {
    public final Context d;
    public final ArrayList e;

    public static final class a extends RecyclerView.d0 {
        public final MyTextView A;
        public final MyTextView B;
        public final MyTextView u;
        public final MyTextView v;
        public final MyTextView w;
        public final MyTextView x;
        public final MyTextView y;
        public final MyTextView z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R.id.state);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (MyTextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R.id.rto);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (MyTextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R.id.number_type);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.w = (MyTextView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(R.id.reg_start);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.x = (MyTextView) viewFindViewById4;
            View viewFindViewById5 = itemView.findViewById(R.id.reg_close);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.y = (MyTextView) viewFindViewById5;
            View viewFindViewById6 = itemView.findViewById(R.id.auction_start);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            this.z = (MyTextView) viewFindViewById6;
            View viewFindViewById7 = itemView.findViewById(R.id.auction_close);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
            this.A = (MyTextView) viewFindViewById7;
            View viewFindViewById8 = itemView.findViewById(R.id.auction_status);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
            this.B = (MyTextView) viewFindViewById8;
        }

        public final MyTextView O() {
            return this.u;
        }
    }

    public sf5(Context context, ArrayList searchList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(searchList, "searchList");
        this.d = context;
        this.e = searchList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void p(a holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.e.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        wb0.a(obj);
        holder.O();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.running_auction_list_item, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long f(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int g(int i) {
        return i;
    }
}
