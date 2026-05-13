package com.zepto;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class k87 extends RecyclerView.h {
    public final ArrayList d;
    public final Context e;
    public final rx3 f;

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

    public k87(ArrayList mList, Context mContext, rx3 multiSelected) {
        Intrinsics.checkNotNullParameter(mList, "mList");
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(multiSelected, "multiSelected");
        this.d = mList;
        this.e = mContext;
        this.f = multiSelected;
    }

    public static final void C(az5 mModel, k87 this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(mModel, "$mModel");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (mModel.b()) {
            if ((VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE.equals(String.valueOf(mModel.a())) || "3".equals(String.valueOf(mModel.a()))) && mModel.c()) {
                this$0.f.d0(String.valueOf(mModel.a()), i);
                return;
            }
            return;
        }
        if ((VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE.equals(String.valueOf(mModel.a())) || "3".equals(String.valueOf(mModel.a()))) && mModel.c()) {
            this$0.f.U(String.valueOf(mModel.a()), i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void p(a holder, final int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.d.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        final az5 az5Var = (az5) obj;
        holder.P().setText(ta3.a.k2(this.e, String.valueOf(az5Var.a()), "B"));
        if (az5Var.b()) {
            F(String.valueOf(az5Var.a()), holder);
        } else {
            E(String.valueOf(az5Var.a()), holder);
        }
        holder.Q().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.j87
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k87.C(az5Var, this, i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.multi_service_item, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    public final void E(String service_code, a holder) {
        Intrinsics.checkNotNullParameter(service_code, "service_code");
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (service_code.equals("3")) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.duplicate_rc));
            holder.Q().setBackgroundResource(R.drawable.round_shape_multi_selection);
            holder.P().setTextColor(Color.parseColor("#000000"));
        }
        if (service_code.equals("4")) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.mvvm_ic_addres));
            holder.Q().setBackgroundResource(R.drawable.round_shape_multi_selection);
            holder.P().setTextColor(Color.parseColor("#000000"));
        }
        if (service_code.equals(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE)) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.addition));
            holder.Q().setBackgroundResource(R.drawable.round_shape_multi_selection);
            holder.P().setTextColor(Color.parseColor("#000000"));
        }
        if (service_code.equals(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE)) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.term));
            holder.Q().setBackgroundResource(R.drawable.round_shape_multi_selection);
            holder.P().setTextColor(Color.parseColor("#000000"));
        }
        if (service_code.equals(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE)) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.ic_con));
            holder.Q().setBackgroundResource(R.drawable.round_shape_multi_selection);
            holder.P().setTextColor(Color.parseColor("#000000"));
        }
        if (service_code.equals(VContant.RCPARTICULAR_PURPOSE_CODE)) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.rc_partucalar));
            holder.Q().setBackgroundResource(R.drawable.round_shape_multi_selection);
            holder.P().setTextColor(Color.parseColor("#000000"));
        } else if (service_code.equals(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE)) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.transferofowner));
            holder.Q().setBackgroundResource(R.drawable.round_shape_multi_selection);
            holder.P().setTextColor(Color.parseColor("#000000"));
        }
    }

    public final void F(String service_code, a holder) {
        Intrinsics.checkNotNullParameter(service_code, "service_code");
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (service_code.equals("3")) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.select_dup));
            holder.Q().setBackgroundResource(R.drawable.corner_rectangle_bg_17);
            holder.P().setTextColor(Color.parseColor("#FFFFFF"));
        }
        if (service_code.equals("4")) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.select_coa));
            holder.Q().setBackgroundResource(R.drawable.corner_rectangle_bg_17);
            holder.P().setTextColor(Color.parseColor("#FFFFFF"));
        }
        if (service_code.equals(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE)) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.select_hpa));
            holder.Q().setBackgroundResource(R.drawable.corner_rectangle_bg_17);
            holder.P().setTextColor(Color.parseColor("#FFFFFF"));
        }
        if (service_code.equals(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE)) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.select_hpt));
            holder.Q().setBackgroundResource(R.drawable.corner_rectangle_bg_17);
            holder.P().setTextColor(Color.parseColor("#FFFFFF"));
        }
        if (service_code.equals(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE)) {
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.select_hpc));
            holder.Q().setBackgroundResource(R.drawable.corner_rectangle_bg_17);
            holder.P().setTextColor(Color.parseColor("#FFFFFF"));
        } else if (service_code.equals(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE)) {
            holder.Q().setBackgroundResource(R.drawable.corner_rectangle_bg_17);
            holder.O().setImageDrawable(this.e.getResources().getDrawable(R.drawable.select_to));
            holder.P().setTextColor(Color.parseColor("#FFFFFF"));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
