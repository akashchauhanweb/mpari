package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.newlearner.DataClass.CampDetailsResponseModal;
import com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class zz5 extends RecyclerView.h {
    public final LearnerLicenceAadharScreen d;
    public final ArrayList e;
    public final wa3 f;
    public final a06 g;
    public int h;

    public static final class a extends RecyclerView.d0 {
        public final TextView A;
        public final TextView B;
        public final TextView C;
        public final TextView D;
        public final TextView E;
        public final AppCompatRadioButton u;
        public final TextView v;
        public final TextView w;
        public final TextView x;
        public final TextView y;
        public final TextView z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R.id.selectCampRb);
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatRadioButton");
            this.u = (AppCompatRadioButton) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R.id.campAddressTv);
            Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
            this.v = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R.id.campAddressValueTv);
            Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
            this.w = (TextView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(R.id.serviceTypeTv);
            Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
            this.x = (TextView) viewFindViewById4;
            View viewFindViewById5 = itemView.findViewById(R.id.serviceTypeValueTv);
            Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.TextView");
            this.y = (TextView) viewFindViewById5;
            View viewFindViewById6 = itemView.findViewById(R.id.campKendraNameTv);
            Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.TextView");
            this.z = (TextView) viewFindViewById6;
            View viewFindViewById7 = itemView.findViewById(R.id.campKendraNameValueTv);
            Intrinsics.checkNotNull(viewFindViewById7, "null cannot be cast to non-null type android.widget.TextView");
            this.A = (TextView) viewFindViewById7;
            View viewFindViewById8 = itemView.findViewById(R.id.campStartDateTv);
            Intrinsics.checkNotNull(viewFindViewById8, "null cannot be cast to non-null type android.widget.TextView");
            this.B = (TextView) viewFindViewById8;
            View viewFindViewById9 = itemView.findViewById(R.id.campStartDateValueTv);
            Intrinsics.checkNotNull(viewFindViewById9, "null cannot be cast to non-null type android.widget.TextView");
            this.C = (TextView) viewFindViewById9;
            View viewFindViewById10 = itemView.findViewById(R.id.campEndDateTv);
            Intrinsics.checkNotNull(viewFindViewById10, "null cannot be cast to non-null type android.widget.TextView");
            this.D = (TextView) viewFindViewById10;
            View viewFindViewById11 = itemView.findViewById(R.id.campEndDateValueTv);
            Intrinsics.checkNotNull(viewFindViewById11, "null cannot be cast to non-null type android.widget.TextView");
            this.E = (TextView) viewFindViewById11;
        }

        public final TextView O() {
            return this.w;
        }

        public final TextView P() {
            return this.E;
        }

        public final TextView Q() {
            return this.A;
        }

        public final TextView R() {
            return this.C;
        }

        public final AppCompatRadioButton S() {
            return this.u;
        }

        public final TextView T() {
            return this.y;
        }
    }

    public zz5(LearnerLicenceAadharScreen activity, ArrayList sevaCampList, wa3 langSession, a06 itemListner) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(sevaCampList, "sevaCampList");
        Intrinsics.checkNotNullParameter(langSession, "langSession");
        Intrinsics.checkNotNullParameter(itemListner, "itemListner");
        this.d = activity;
        this.e = sevaCampList;
        this.f = langSession;
        this.g = itemListner;
        this.h = -1;
    }

    public static final void C(zz5 this$0, a holder, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        if (z) {
            int iK = holder.k();
            this$0.h = iK;
            this$0.g.k(iK);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void p(final a holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.e.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        CampDetailsResponseModal campDetailsResponseModal = (CampDetailsResponseModal) obj;
        holder.S().setChecked(i == this.h);
        if (kt6.d(campDetailsResponseModal.getCmServType())) {
            holder.T().setText(campDetailsResponseModal.getCmServType());
        } else {
            holder.T().setText("");
        }
        if (kt6.d(campDetailsResponseModal.getCmAddress())) {
            holder.O().setText(campDetailsResponseModal.getCmAddress());
        } else {
            holder.O().setText("");
        }
        if (kt6.d(campDetailsResponseModal.getCmCampAbbrv())) {
            holder.Q().setText(campDetailsResponseModal.getCmCampAbbrv());
        } else {
            holder.Q().setText("");
        }
        if (kt6.d(campDetailsResponseModal.getCmSuboffcd())) {
            holder.R().setText(campDetailsResponseModal.getCmSuboffcd());
        } else {
            holder.R().setText("");
        }
        if (kt6.d(campDetailsResponseModal.getCmInstituteCode())) {
            holder.P().setText(campDetailsResponseModal.getCmInstituteCode());
        } else {
            holder.P().setText("");
        }
        holder.S().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.yz5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                zz5.C(this.a, holder, compoundButton, z);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_sewa_camp, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.e.size();
    }
}
