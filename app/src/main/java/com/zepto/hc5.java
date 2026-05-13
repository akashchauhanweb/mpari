package com.zepto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.Echallan.Echallan.Model.ChallanListResultModal;
import com.nic.mparivahan.Echallan.ReprintReceiptActivity;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hc5 extends RecyclerView.h {
    public final Context d;
    public final ArrayList e;
    public final wa3 f;
    public final ReprintReceiptActivity g;

    public static final class a extends RecyclerView.d0 {
        public final MyTextView u;
        public final AppCompatTextView v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R.id.challanNoTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (MyTextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R.id.reprintReceiptTv);
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

    public hc5(Context context, ArrayList searchList, wa3 langSession, ReprintReceiptActivity activity) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(searchList, "searchList");
        Intrinsics.checkNotNullParameter(langSession, "langSession");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.d = context;
        this.e = searchList;
        this.f = langSession;
        this.g = activity;
    }

    public static final void D(hc5 this$0, ChallanListResultModal model, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(model, "$model");
        this$0.g.D1(model.getDocNo(), model.getChallanNo(), model.getStateCd());
    }

    public final void B(List searchList) {
        Intrinsics.checkNotNullParameter(searchList, "searchList");
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.addAll(searchList);
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void p(a holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.e.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        final ChallanListResultModal challanListResultModal = (ChallanListResultModal) obj;
        if (challanListResultModal.getChallanNo().length() > 0) {
            holder.O().setText(challanListResultModal.getChallanNo());
        }
        holder.P().setVisibility(0);
        holder.P().setText(this.f.b("label_challan_reprint_receipt", this.d.getString(R.string.reprint_receipt)));
        holder.P().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gc5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hc5.D(this.a, challanListResultModal, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.echallan_payment_item_reprint, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.e.size();
    }
}
