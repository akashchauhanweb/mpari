package com.zepto;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.Citizen.Activities.ViewComplaintDetails;
import com.nic.mparivahan.Citizen.Models.MparCitizenViolationX;
import com.nic.mparivahan.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xa5 extends RecyclerView.h {
    public final ArrayList d;
    public final Context e;

    public static final class a extends RecyclerView.d0 {
        public final TextView A;
        public final TextView B;
        public final TextView C;
        public final TextView D;
        public final TextView E;
        public final TextView u;
        public final TextView v;
        public final TextView w;
        public final TextView x;
        public final TextView y;
        public final TextView z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View viewFindViewById = this.a.findViewById(R.id.tv_report_id);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (TextView) viewFindViewById;
            View viewFindViewById2 = this.a.findViewById(R.id.tv_report_vehicle_no);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (TextView) viewFindViewById2;
            View viewFindViewById3 = this.a.findViewById(R.id.tv_report_location);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.w = (TextView) viewFindViewById3;
            View viewFindViewById4 = this.a.findViewById(R.id.txt_comp_status);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.x = (TextView) viewFindViewById4;
            View viewFindViewById5 = this.a.findViewById(R.id.txt_comp_date);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.y = (TextView) viewFindViewById5;
            View viewFindViewById6 = this.a.findViewById(R.id.tv_date_value);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            this.z = (TextView) viewFindViewById6;
            View viewFindViewById7 = this.a.findViewById(R.id.id_view_details);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
            this.A = (TextView) viewFindViewById7;
            View viewFindViewById8 = this.a.findViewById(R.id.tv_vehicle_no);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
            this.B = (TextView) viewFindViewById8;
            View viewFindViewById9 = this.a.findViewById(R.id.tv_status);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
            this.C = (TextView) viewFindViewById9;
            View viewFindViewById10 = this.a.findViewById(R.id.tv_location);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
            this.D = (TextView) viewFindViewById10;
            View viewFindViewById11 = this.a.findViewById(R.id.tv_date);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
            this.E = (TextView) viewFindViewById11;
        }

        public final TextView O() {
            return this.A;
        }

        public final TextView P() {
            return this.D;
        }

        public final TextView Q() {
            return this.C;
        }

        public final TextView R() {
            return this.B;
        }

        public final TextView S() {
            return this.E;
        }

        public final TextView T() {
            return this.z;
        }

        public final TextView U() {
            return this.y;
        }

        public final TextView V() {
            return this.u;
        }

        public final TextView W() {
            return this.w;
        }

        public final TextView X() {
            return this.x;
        }

        public final TextView Y() {
            return this.v;
        }
    }

    public xa5(ArrayList mList, Context mContext) {
        Intrinsics.checkNotNullParameter(mList, "mList");
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.d = mList;
        this.e = mContext;
    }

    public static final void D(xa5 this$0, MparCitizenViolationX mModel, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mModel, "$mModel");
        Intent intent = new Intent(this$0.e, (Class<?>) ViewComplaintDetails.class);
        intent.putExtra("vehicleNumber", mModel.getViolRegnNo());
        intent.putExtra("status", String.valueOf(mModel.getViolStatus()));
        intent.putExtra("location", mModel.getViolLocation().toString());
        intent.putExtra("violOffenceId", String.valueOf(mModel.getViolRecordId()));
        this$0.e.startActivity(intent);
    }

    public final String B(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date date = simpleDateFormat.parse(str);
            Intrinsics.checkNotNullExpressionValue(date, "parse(...)");
            return simpleDateFormat2.format(date);
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void p(a holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        wa3 wa3Var = new wa3(this.e);
        holder.R().setText(wa3Var.b("radio_btn_vehicle_no", "Vehicle Number"));
        holder.Q().setText(wa3Var.b("btn_challan_status", "Status"));
        holder.S().setText(wa3Var.b("cs_DateTime", "Date & Time"));
        holder.P().setText(wa3Var.b("cs_Location", "Location"));
        holder.O().setText(wa3Var.b("label_view", "View Details"));
        Object obj = this.d.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        final MparCitizenViolationX mparCitizenViolationX = (MparCitizenViolationX) obj;
        holder.V().setText(wa3Var.b("cs_trafficReport_ViolationID", "Violation ID") + " : # " + mparCitizenViolationX.getViolRecordId());
        holder.Y().setText(mparCitizenViolationX.getViolRegnNo());
        holder.W().setText(mparCitizenViolationX.getViolLocation());
        holder.T().setText(mparCitizenViolationX.getViolSubmittedAt());
        if (mparCitizenViolationX.getViolStatus() == 0) {
            holder.X().setText("Pending");
        } else if (mparCitizenViolationX.getViolStatus() == 1) {
            holder.X().setText("Active");
        } else if (mparCitizenViolationX.getViolStatus() == 2) {
            holder.X().setText("Action Taken");
        } else if (mparCitizenViolationX.getViolStatus() == 3) {
            holder.X().setText("Closed");
        } else if (mparCitizenViolationX.getViolStatus() == 4) {
            holder.X().setText("Rejected");
        }
        if (mparCitizenViolationX.getViolSubmittedAt().length() != 0) {
            TextView textViewU = holder.U();
            String strSubstring = mparCitizenViolationX.getViolSubmittedAt().substring(0, 10);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            textViewU.setText(B(strSubstring));
        }
        holder.a.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wa5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xa5.D(this.a, mparCitizenViolationX, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.report_list_item, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
