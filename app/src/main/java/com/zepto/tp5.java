package com.zepto;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.Echallan.Echallan.Model.ChallanListResultModal;
import com.nic.mparivahan.Echallan.Echallan.NewChallanLessDetails;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tp5 extends RecyclerView.h {
    public final Context d;
    public ArrayList e;
    public final int f;
    public final String g;
    public final wa3 h;
    public final String i;

    public static final class a extends RecyclerView.d0 {
        public final MyTextView u;
        public final AppCompatTextView v;
        public final AppCompatTextView w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R.id.challanNoTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (MyTextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R.id.viewDetailsTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (AppCompatTextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R.id.viewTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.w = (AppCompatTextView) viewFindViewById3;
        }

        public final MyTextView O() {
            return this.u;
        }

        public final AppCompatTextView P() {
            return this.v;
        }

        public final AppCompatTextView Q() {
            return this.w;
        }
    }

    public tp5(Context context, ArrayList searchList, int i, String inputType, wa3 langSession, String chassisNo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(searchList, "searchList");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        Intrinsics.checkNotNullParameter(langSession, "langSession");
        Intrinsics.checkNotNullParameter(chassisNo, "chassisNo");
        this.d = context;
        this.e = searchList;
        this.f = i;
        this.g = inputType;
        this.h = langSession;
        this.i = chassisNo;
    }

    public static final void E(tp5 this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0.d, (Class<?>) NewChallanLessDetails.class);
        intent.putExtra("selectedData", (Parcelable) this$0.e.get(i));
        intent.putExtra("inputType", this$0.g);
        if (kt6.d(this$0.i)) {
            intent.putExtra("inputchassisno", this$0.i);
        }
        intent.putExtra("fromActivity", "searchChallan");
        this$0.d.startActivity(intent);
    }

    public final void B(List searchList) {
        Intrinsics.checkNotNullParameter(searchList, "searchList");
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.addAll(searchList);
        j();
    }

    public final void C(List searchList) {
        Intrinsics.checkNotNullParameter(searchList, "searchList");
        this.e.addAll(searchList);
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void p(a holder, final int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.e.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        ChallanListResultModal challanListResultModal = (ChallanListResultModal) obj;
        if (challanListResultModal.getChallanNo().length() > 0) {
            holder.O().setText(challanListResultModal.getChallanNo());
        }
        if (this.f == 0) {
            holder.P().setVisibility(8);
        } else {
            holder.P().setVisibility(0);
        }
        holder.Q().setText(this.h.b("label_challan_view_details", this.d.getString(R.string.view_Details)));
        holder.Q().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sp5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tp5.E(this.a, i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_search_challan_list, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    public final void G(List searchList) {
        Intrinsics.checkNotNullParameter(searchList, "searchList");
        this.e = (ArrayList) searchList;
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.e.size();
    }
}
