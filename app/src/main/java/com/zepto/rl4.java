package com.zepto;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.PassangerResultActivity;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.VaSplPassengerdto;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class rl4 extends RecyclerView.h {
    public ArrayList d;
    public final PassangerResultActivity e;

    public static final class a extends RecyclerView.d0 {
        public final TextView A;
        public final ImageView u;
        public final ImageView v;
        public final TextView w;
        public final TextView x;
        public final TextView y;
        public final TextView z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View viewFindViewById = this.a.findViewById(R.id.update);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (ImageView) viewFindViewById;
            View viewFindViewById2 = this.a.findViewById(R.id.delet);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (ImageView) viewFindViewById2;
            View viewFindViewById3 = this.a.findViewById(R.id.full_name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.w = (TextView) viewFindViewById3;
            View viewFindViewById4 = this.a.findViewById(R.id.phone_number);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.x = (TextView) viewFindViewById4;
            View viewFindViewById5 = this.a.findViewById(R.id.relation_name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.y = (TextView) viewFindViewById5;
            View viewFindViewById6 = this.a.findViewById(R.id.age);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            this.z = (TextView) viewFindViewById6;
            View viewFindViewById7 = this.a.findViewById(R.id.gender);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
            this.A = (TextView) viewFindViewById7;
        }

        public final TextView O() {
            return this.z;
        }

        public final TextView P() {
            return this.w;
        }

        public final TextView Q() {
            return this.A;
        }

        public final TextView R() {
            return this.x;
        }
    }

    public rl4(ArrayList contactlist, PassangerResultActivity addContact) {
        Intrinsics.checkNotNullParameter(contactlist, "contactlist");
        Intrinsics.checkNotNullParameter(addContact, "addContact");
        this.d = contactlist;
        this.e = addContact;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void p(a holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        try {
            String passengerName = ((VaSplPassengerdto) this.d.get(i)).getPassengerName();
            String passengerAddress = ((VaSplPassengerdto) this.d.get(i)).getPassengerAddress();
            holder.P().setText(String.valueOf(passengerName));
            holder.R().setText("Address: " + passengerAddress);
            holder.O().setText(String.valueOf(((VaSplPassengerdto) this.d.get(i)).getPassengerAge()));
            holder.Q().setText(String.valueOf(((VaSplPassengerdto) this.d.get(i)).getPassengerGender()));
        } catch (Exception e) {
            Log.e("AdapterEoor", e.toString());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.passanger_list_item, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
