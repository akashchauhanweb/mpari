package com.zepto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.Echallan.Echallan.Model.ChallanListResultModal;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class yl6 extends RecyclerView.h {
    public final Context d;
    public final ArrayList e;
    public final wa3 f;

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
            View viewFindViewById = itemView.findViewById(R.id.challanNoTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (MyTextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R.id.challanTimeTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (MyTextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R.id.dlRcNoTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.w = (MyTextView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(R.id.violatorNameTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.x = (MyTextView) viewFindViewById4;
            View viewFindViewById5 = itemView.findViewById(R.id.statusTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.y = (MyTextView) viewFindViewById5;
            View viewFindViewById6 = itemView.findViewById(R.id.dlRcNo);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            this.z = (MyTextView) viewFindViewById6;
            View viewFindViewById7 = itemView.findViewById(R.id.violatorName);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
            this.A = (MyTextView) viewFindViewById7;
            View viewFindViewById8 = itemView.findViewById(R.id.status);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
            this.B = (MyTextView) viewFindViewById8;
        }

        public final MyTextView O() {
            return this.u;
        }

        public final MyTextView P() {
            return this.v;
        }

        public final MyTextView Q() {
            return this.z;
        }

        public final MyTextView R() {
            return this.w;
        }

        public final MyTextView S() {
            return this.B;
        }

        public final MyTextView T() {
            return this.y;
        }

        public final MyTextView U() {
            return this.A;
        }

        public final MyTextView V() {
            return this.x;
        }
    }

    public yl6(Context context, ArrayList searchList, wa3 langSession) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(searchList, "searchList");
        Intrinsics.checkNotNullParameter(langSession, "langSession");
        this.d = context;
        this.e = searchList;
        this.f = langSession;
    }

    public final void A(List searchList) {
        Intrinsics.checkNotNullParameter(searchList, "searchList");
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.addAll(searchList);
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void p(a holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.e.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        ChallanListResultModal challanListResultModal = (ChallanListResultModal) obj;
        holder.Q().setText(this.f.b("lbl_rc_number", this.d.getString(R.string.rc_no)));
        holder.U().setText(this.f.b("label_challan_violator_name", this.d.getString(R.string.violator_name)));
        holder.S().setText(this.f.b("label_challan_pay_status", this.d.getString(R.string.status)));
        if (challanListResultModal.getChallanNo().length() > 0) {
            holder.O().setText(challanListResultModal.getChallanNo());
        }
        if (challanListResultModal.getDocNo().length() > 0) {
            holder.R().setText(challanListResultModal.getDocNo());
        }
        if (challanListResultModal.getAccusedName().length() > 0) {
            holder.V().setText(challanListResultModal.getAccusedName());
        }
        if (challanListResultModal.getStatus().length() > 0) {
            holder.T().setText(challanListResultModal.getStatus());
        }
        if (challanListResultModal.getChallanDateTime().length() > 0) {
            holder.P().setText(challanListResultModal.getChallanDateTime());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.echallan_payment_item_transcation_status, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.e.size();
    }
}
