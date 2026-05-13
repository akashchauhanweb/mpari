package com.zepto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyModel.Data;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class o10 extends RecyclerView.h {
    public final Context d;
    public final ArrayList e;

    public static final class a extends RecyclerView.d0 {
        public final MyTextView u;
        public final MyTextView v;
        public final MyTextView w;
        public final MyTextView x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R.id.tv_reg_no);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (MyTextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R.id.booking_fee);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (MyTextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R.id.category);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.w = (MyTextView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(R.id.number_type);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.x = (MyTextView) viewFindViewById4;
        }

        public final MyTextView O() {
            return this.v;
        }

        public final MyTextView P() {
            return this.w;
        }

        public final MyTextView Q() {
            return this.x;
        }

        public final MyTextView R() {
            return this.u;
        }
    }

    public o10(Context context, ArrayList searchList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(searchList, "searchList");
        this.d = context;
        this.e = searchList;
    }

    public final void A(List searchList) {
        Intrinsics.checkNotNullParameter(searchList, "searchList");
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.addAll(searchList);
        j();
    }

    public final void B(List searchList) {
        Intrinsics.checkNotNullParameter(searchList, "searchList");
        this.e.addAll(searchList);
        j();
    }

    public final void C(ArrayList searchList) {
        Intrinsics.checkNotNullParameter(searchList, "searchList");
        this.e.clear();
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void p(a holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.e.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        Data data = (Data) obj;
        holder.R().setText(data.getReg_no());
        holder.O().setText(String.valueOf(data.getBooking_fee()));
        holder.Q().setText(data.getNumber_type());
        holder.P().setText(data.getCategory());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.available_fancy_numbers, parent, false);
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
