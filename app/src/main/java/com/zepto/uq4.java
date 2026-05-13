package com.zepto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanModel.PendingTransRegNoDataModel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class uq4 extends RecyclerView.h {
    public final Context d;
    public final ArrayList e;
    public final b f;

    public static final class a extends RecyclerView.d0 {
        public final MyTextView u;
        public final AppCompatTextView v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R.id.transactionNo);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (MyTextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R.id.viewDetailsTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (AppCompatTextView) viewFindViewById2;
        }

        public final MyTextView O() {
            return this.u;
        }

        public final AppCompatTextView P() {
            return this.v;
        }
    }

    public interface b {
        void k(int i);
    }

    public uq4(Context context, ArrayList pendingList, b onItemListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pendingList, "pendingList");
        Intrinsics.checkNotNullParameter(onItemListener, "onItemListener");
        this.d = context;
        this.e = pendingList;
        this.f = onItemListener;
    }

    public static final void C(uq4 this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f.k(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void p(a holder, final int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.e.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        PendingTransRegNoDataModel pendingTransRegNoDataModel = (PendingTransRegNoDataModel) obj;
        if (pendingTransRegNoDataModel.getTransactionID().length() > 0) {
            holder.O().setText(pendingTransRegNoDataModel.getTransactionID());
        }
        holder.P().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tq4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                uq4.C(this.a, i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.raw_pending_transaction, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.e.size();
    }
}
