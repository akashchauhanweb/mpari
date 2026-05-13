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
import com.nic.mparivahan.Echallan.Echallan.NoticeChallanVehicleSearchList;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
public final class lc4 extends RecyclerView.h {
    public final Context d;
    public final ArrayList e;
    public final int f;
    public final String g;
    public final wa3 h;
    public final String i;
    public final NoticeChallanVehicleSearchList j;
    public final String k;

    public static final class a extends RecyclerView.d0 {
        public final MyTextView A;
        public final MyTextView B;
        public final AppCompatTextView C;
        public final AppCompatTextView D;
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
            View viewFindViewById6 = itemView.findViewById(R.id.stateNameTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            this.z = (MyTextView) viewFindViewById6;
            View viewFindViewById7 = itemView.findViewById(R.id.paymentSourceTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
            this.A = (MyTextView) viewFindViewById7;
            View viewFindViewById8 = itemView.findViewById(R.id.amountTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
            this.B = (MyTextView) viewFindViewById8;
            View viewFindViewById9 = itemView.findViewById(R.id.viewDetailsTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
            this.C = (AppCompatTextView) viewFindViewById9;
            View viewFindViewById10 = itemView.findViewById(R.id.viewTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
            this.D = (AppCompatTextView) viewFindViewById10;
        }

        public final MyTextView O() {
            return this.u;
        }

        public final AppCompatTextView P() {
            return this.C;
        }

        public final AppCompatTextView Q() {
            return this.D;
        }
    }

    public lc4(Context context, ArrayList searchList, int i, String inputType, wa3 langSession, String serviceCode, NoticeChallanVehicleSearchList activity, String chassisNo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(searchList, "searchList");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        Intrinsics.checkNotNullParameter(langSession, "langSession");
        Intrinsics.checkNotNullParameter(serviceCode, "serviceCode");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(chassisNo, "chassisNo");
        this.d = context;
        this.e = searchList;
        this.f = i;
        this.g = inputType;
        this.h = langSession;
        this.i = serviceCode;
        this.j = activity;
        this.k = chassisNo;
    }

    public static final void D(lc4 this$0, ChallanListResultModal model, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(model, "$model");
        if (StringsKt__StringsJVMKt.equals(this$0.i, "114", true) || StringsKt__StringsJVMKt.equals(this$0.i, "115", true)) {
            this$0.j.H1(model.getDocNo(), model.getChallanNo(), model.getStateCd());
            return;
        }
        Intent intent = new Intent(this$0.d, (Class<?>) NewChallanLessDetails.class);
        intent.putExtra("selectedData", (Parcelable) this$0.e.get(i));
        intent.putExtra("inputType", this$0.g);
        if (kt6.d(this$0.k)) {
            intent.putExtra("inputchassisno", this$0.k);
        }
        if (StringsKt__StringsJVMKt.equals(this$0.i, "111", true)) {
            intent.putExtra("fromActivity", "searchChallan");
        } else if (StringsKt__StringsJVMKt.equals(this$0.i, "112", true)) {
            intent.putExtra("fromActivity", "paymentChallan");
        } else if (StringsKt__StringsJVMKt.equals(this$0.i, "113", true)) {
            intent.putExtra("fromActivity", "verifyPaymentActivity");
        }
        this$0.d.startActivity(intent);
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
    public void p(a holder, final int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.e.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        final ChallanListResultModal challanListResultModal = (ChallanListResultModal) obj;
        if (challanListResultModal.getChallanNo().length() > 0) {
            holder.O().setText(challanListResultModal.getChallanNo());
        }
        if (this.f == 0) {
            holder.P().setVisibility(8);
        } else {
            holder.P().setVisibility(0);
        }
        if (StringsKt__StringsJVMKt.equals(this.i, "114", true)) {
            holder.Q().setText(this.h.b("label_challan_download", this.d.getString(R.string.challan_print)));
        } else if (StringsKt__StringsJVMKt.equals(this.i, "115", true)) {
            holder.Q().setText(this.h.b("View_Payment_Receipt", this.d.getString(R.string.view_payment_receipt)));
        } else {
            holder.Q().setText(this.h.b("label_challan_view_details", this.d.getString(R.string.view_Details)));
        }
        holder.Q().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lc4.D(this.a, challanListResultModal, i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_payment_search_challan, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.e.size();
    }
}
