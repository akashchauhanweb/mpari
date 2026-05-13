package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.NewDlScreen.Modal.DrivingSchoolDetRequestModal;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.newlearner.AddLLDrivingSchoolActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class vj extends RecyclerView.h {
    public final AddLLDrivingSchoolActivity d;
    public final ArrayList e;
    public final wa3 f;

    public static final class a extends RecyclerView.d0 {
        public final ImageView A;
        public final TextView B;
        public final TextView C;
        public final TextView D;
        public final TextView E;
        public final TextView F;
        public final TextView G;
        public final TextView u;
        public final TextView v;
        public final TextView w;
        public final TextView x;
        public final TextView y;
        public final TextView z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R.id.enrollmentNoValue);
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
            this.u = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R.id.enrollmentDateValue);
            Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
            this.v = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R.id.certificateNoValue);
            Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
            this.w = (TextView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(R.id.certificateDateValue);
            Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
            this.x = (TextView) viewFindViewById4;
            View viewFindViewById5 = itemView.findViewById(R.id.trainedFromValue);
            Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.TextView");
            this.y = (TextView) viewFindViewById5;
            View viewFindViewById6 = itemView.findViewById(R.id.trainedToValue);
            Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.TextView");
            this.z = (TextView) viewFindViewById6;
            View viewFindViewById7 = itemView.findViewById(R.id.editIv);
            Intrinsics.checkNotNull(viewFindViewById7, "null cannot be cast to non-null type android.widget.ImageView");
            this.A = (ImageView) viewFindViewById7;
            View viewFindViewById8 = itemView.findViewById(R.id.enrollmentNo);
            Intrinsics.checkNotNull(viewFindViewById8, "null cannot be cast to non-null type android.widget.TextView");
            this.B = (TextView) viewFindViewById8;
            View viewFindViewById9 = itemView.findViewById(R.id.enrollmentDate);
            Intrinsics.checkNotNull(viewFindViewById9, "null cannot be cast to non-null type android.widget.TextView");
            this.C = (TextView) viewFindViewById9;
            View viewFindViewById10 = itemView.findViewById(R.id.certificateNo);
            Intrinsics.checkNotNull(viewFindViewById10, "null cannot be cast to non-null type android.widget.TextView");
            this.D = (TextView) viewFindViewById10;
            View viewFindViewById11 = itemView.findViewById(R.id.certificateDate);
            Intrinsics.checkNotNull(viewFindViewById11, "null cannot be cast to non-null type android.widget.TextView");
            this.E = (TextView) viewFindViewById11;
            View viewFindViewById12 = itemView.findViewById(R.id.trainedFrom);
            Intrinsics.checkNotNull(viewFindViewById12, "null cannot be cast to non-null type android.widget.TextView");
            this.F = (TextView) viewFindViewById12;
            View viewFindViewById13 = itemView.findViewById(R.id.trainedTo);
            Intrinsics.checkNotNull(viewFindViewById13, "null cannot be cast to non-null type android.widget.TextView");
            this.G = (TextView) viewFindViewById13;
        }

        public final TextView O() {
            return this.E;
        }

        public final TextView P() {
            return this.x;
        }

        public final TextView Q() {
            return this.D;
        }

        public final TextView R() {
            return this.w;
        }

        public final ImageView S() {
            return this.A;
        }

        public final TextView T() {
            return this.C;
        }

        public final TextView U() {
            return this.v;
        }

        public final TextView V() {
            return this.B;
        }

        public final TextView W() {
            return this.u;
        }

        public final TextView X() {
            return this.F;
        }

        public final TextView Y() {
            return this.y;
        }

        public final TextView Z() {
            return this.G;
        }

        public final TextView a0() {
            return this.z;
        }
    }

    public vj(AddLLDrivingSchoolActivity context, ArrayList list, wa3 langSession) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(langSession, "langSession");
        this.d = context;
        this.e = list;
        this.f = langSession;
    }

    public static final void C(vj this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.d.D1(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void p(a holder, final int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.e.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        DrivingSchoolDetRequestModal drivingSchoolDetRequestModal = (DrivingSchoolDetRequestModal) obj;
        holder.V().setText(this.f.b("enrollment_no", this.d.getString(R.string.enrollment_no)));
        holder.T().setText(this.f.b("enrollement_date", this.d.getString(R.string.enrollment_date)));
        holder.Q().setText(this.f.b("certificate_no", this.d.getString(R.string.certificate_no)));
        holder.O().setText(this.f.b("certificate_date", this.d.getString(R.string.certificate_date)));
        holder.X().setText(this.f.b("trained_from", this.d.getString(R.string.trained_from)));
        holder.Z().setText(this.f.b("trained_to", this.d.getString(R.string.trained_to)));
        if (kt6.d(drivingSchoolDetRequestModal.getCertNo())) {
            holder.R().setText(drivingSchoolDetRequestModal.getCertNo());
        } else {
            holder.R().setText("NA");
        }
        if (kt6.d(drivingSchoolDetRequestModal.getCertDate())) {
            holder.P().setText(drivingSchoolDetRequestModal.getCertDate());
        } else {
            holder.P().setText("NA");
        }
        if (kt6.d(drivingSchoolDetRequestModal.getEnrollDate())) {
            holder.U().setText(drivingSchoolDetRequestModal.getEnrollDate());
        } else {
            holder.U().setText("NA");
        }
        if (kt6.d(drivingSchoolDetRequestModal.getEnrollNo())) {
            holder.W().setText(drivingSchoolDetRequestModal.getEnrollNo());
        } else {
            holder.W().setText("NA");
        }
        if (kt6.d(drivingSchoolDetRequestModal.getTrainTo())) {
            holder.a0().setText(drivingSchoolDetRequestModal.getTrainTo());
        } else {
            holder.a0().setText("NA");
        }
        if (kt6.d(drivingSchoolDetRequestModal.getTrainFrom())) {
            holder.Y().setText(drivingSchoolDetRequestModal.getTrainFrom());
        } else {
            holder.Y().setText("NA");
        }
        holder.S().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vj.C(this.a, i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_added_d_school, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.e.size();
    }
}
