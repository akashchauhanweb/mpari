package com.zepto;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice;
import com.nic.mparivahan.Echallan.PaymentSearchChallan;
import com.nic.mparivahan.Echallan.SearchChallanOnlineActivity;
import com.nic.mparivahan.Echallan.SearchPrintChallanActivity;
import com.nic.mparivahan.Echallan.SearchPrintReceiptActivity;
import com.nic.mparivahan.Echallan.VerifyPaymentChallan;
import com.nic.mparivahan.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
public final class j32 extends RecyclerView.h {
    public final List d;
    public final Context e;
    public final String f;
    public String g;

    public static final class a extends RecyclerView.d0 {
        public final TextView u;
        public final LinearLayout v;
        public final ImageView w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View viewFindViewById = this.a.findViewById(R.id.es_sarathi_service_name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (TextView) viewFindViewById;
            View viewFindViewById2 = this.a.findViewById(R.id.layout_es_sarathi);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (LinearLayout) viewFindViewById2;
            View viewFindViewById3 = this.a.findViewById(R.id.es_image);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.w = (ImageView) viewFindViewById3;
        }

        public final ImageView O() {
            return this.w;
        }

        public final TextView P() {
            return this.u;
        }

        public final LinearLayout Q() {
            return this.v;
        }
    }

    public j32(List mList, Context mContext, String State_code) {
        Intrinsics.checkNotNullParameter(mList, "mList");
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(State_code, "State_code");
        this.d = mList;
        this.e = mContext;
        this.f = State_code;
        this.g = "T";
    }

    public static final void C(j32 this$0, Enabledservice mModel, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mModel, "$mModel");
        this$0.E(mModel.getServCode(), mModel.getServName().toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void p(a holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final Enabledservice enabledservice = (Enabledservice) this.d.get(i);
        holder.P().setText(ta3.a.N(this.e, enabledservice.getServCode(), enabledservice.getServName()));
        F(enabledservice.getServCode(), holder);
        holder.Q().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.i32
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j32.C(this.a, enabledservice, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.es_sarathi_adapter, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    public final void E(String service_code, String service_name) {
        Intrinsics.checkNotNullParameter(service_code, "service_code");
        Intrinsics.checkNotNullParameter(service_name, "service_name");
        if (Intrinsics.areEqual(service_code, "111")) {
            Intent intent = new Intent(this.e, (Class<?>) SearchChallanOnlineActivity.class);
            intent.putExtra("Service_name", service_name);
            intent.putExtra("Service_code", service_code);
            this.e.startActivity(intent);
        }
        if (Intrinsics.areEqual(service_code, "112")) {
            Intent intent2 = new Intent(this.e, (Class<?>) PaymentSearchChallan.class);
            intent2.putExtra("Service_name", service_name);
            intent2.putExtra("Service_code", service_code);
            this.e.startActivity(intent2);
        }
        if (Intrinsics.areEqual(service_code, "113")) {
            Intent intent3 = new Intent(this.e, (Class<?>) VerifyPaymentChallan.class);
            intent3.putExtra("Service_name", service_name);
            intent3.putExtra("Service_code", service_code);
            this.e.startActivity(intent3);
        }
        if (Intrinsics.areEqual(service_code, "114")) {
            Intent intent4 = new Intent(this.e, (Class<?>) SearchPrintChallanActivity.class);
            intent4.putExtra("Service_name", service_name);
            intent4.putExtra("Service_code", service_code);
            this.e.startActivity(intent4);
        }
        if (StringsKt__StringsJVMKt.equals(service_code, "115", true)) {
            Intent intent5 = new Intent(this.e, (Class<?>) SearchPrintReceiptActivity.class);
            intent5.putExtra("Service_name", service_name);
            intent5.putExtra("Service_code", service_code);
            this.e.startActivity(intent5);
        }
    }

    public final void F(String service_code, a holder) {
        Intrinsics.checkNotNullParameter(service_code, "service_code");
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (service_code.equals("111")) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.ic_status));
        }
        if (service_code.equals("112")) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.ic_challan_paymnet));
        }
        if (service_code.equals("113")) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.ic_verify));
        }
        if (service_code.equals("114")) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.ic_challan_paymnet));
        }
        if (service_code.equals("115")) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.print_receipt));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
