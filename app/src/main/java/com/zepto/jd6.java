package com.zepto;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Tax.Model.TaxCalModleItem;
import com.nic.mparivahan.Tax.Model.TaxModes;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class jd6 extends RecyclerView.h {
    public ArrayList d;
    public final a e;
    public final Context f;

    public interface a {
        void t(int i, String str);
    }

    public static final class b extends RecyclerView.d0 {
        public final TextView A;
        public final TextView B;
        public final TextView C;
        public final TextView D;
        public final TextView E;
        public final TextView F;
        public final TextView G;
        public final TextView H;
        public final TextView I;
        public final TextView J;
        public final LinearLayout K;
        public Spinner L;
        public final Spinner M;
        public final TextView N;
        public final TextView O;
        public final TextView P;
        public final TextView Q;
        public final TextView R;
        public final TextView S;
        public final TextView T;
        public final TextView U;
        public final TextView V;
        public final TextView W;
        public final TextView u;
        public final TextView v;
        public final TextView w;
        public final TextView x;
        public final TextView y;
        public final TextView z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View viewFindViewById = this.a.findViewById(R.id.total_amount);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (TextView) viewFindViewById;
            View viewFindViewById2 = this.a.findViewById(R.id.total_amount_txt);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (TextView) viewFindViewById2;
            View viewFindViewById3 = this.a.findViewById(R.id.additionalamount);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.w = (TextView) viewFindViewById3;
            View viewFindViewById4 = this.a.findViewById(R.id.additionalamount_txt);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.x = (TextView) viewFindViewById4;
            View viewFindViewById5 = this.a.findViewById(R.id.interest);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.y = (TextView) viewFindViewById5;
            View viewFindViewById6 = this.a.findViewById(R.id.interest_txt);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            this.z = (TextView) viewFindViewById6;
            View viewFindViewById7 = this.a.findViewById(R.id.rebate);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
            this.A = (TextView) viewFindViewById7;
            View viewFindViewById8 = this.a.findViewById(R.id.rebate_txt);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
            this.B = (TextView) viewFindViewById8;
            View viewFindViewById9 = this.a.findViewById(R.id.surcharge);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
            this.C = (TextView) viewFindViewById9;
            View viewFindViewById10 = this.a.findViewById(R.id.surcharge_txt);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
            this.D = (TextView) viewFindViewById10;
            View viewFindViewById11 = this.a.findViewById(R.id.penality_txt);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
            this.E = (TextView) viewFindViewById11;
            View viewFindViewById12 = this.a.findViewById(R.id.tax_amount_txt);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
            this.F = (TextView) viewFindViewById12;
            View viewFindViewById13 = this.a.findViewById(R.id.selectcalcultaxupto);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
            this.G = (TextView) viewFindViewById13;
            View viewFindViewById14 = this.a.findViewById(R.id.tax_upto_txt);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
            this.H = (TextView) viewFindViewById14;
            View viewFindViewById15 = this.a.findViewById(R.id.taxhead);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
            this.I = (TextView) viewFindViewById15;
            View viewFindViewById16 = this.a.findViewById(R.id.taxmode);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "findViewById(...)");
            this.J = (TextView) viewFindViewById16;
            View viewFindViewById17 = this.a.findViewById(R.id.linear_account);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById17, "findViewById(...)");
            this.K = (LinearLayout) viewFindViewById17;
            View viewFindViewById18 = this.a.findViewById(R.id.tax_mode_spinner);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById18, "findViewById(...)");
            this.L = (Spinner) viewFindViewById18;
            View viewFindViewById19 = this.a.findViewById(R.id.purposeSpinner);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById19, "findViewById(...)");
            this.M = (Spinner) viewFindViewById19;
            View viewFindViewById20 = this.a.findViewById(R.id.selecttaxfrom);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById20, "findViewById(...)");
            this.N = (TextView) viewFindViewById20;
            View viewFindViewById21 = this.a.findViewById(R.id.taxfrom);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById21, "findViewById(...)");
            this.O = (TextView) viewFindViewById21;
            View viewFindViewById22 = this.a.findViewById(R.id.selectcalcultaxupto);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById22, "findViewById(...)");
            this.P = (TextView) viewFindViewById22;
            View viewFindViewById23 = this.a.findViewById(R.id.taxamount);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById23, "findViewById(...)");
            this.Q = (TextView) viewFindViewById23;
            View viewFindViewById24 = this.a.findViewById(R.id.penality);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById24, "findViewById(...)");
            this.R = (TextView) viewFindViewById24;
            View viewFindViewById25 = this.a.findViewById(R.id.surcharge);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById25, "findViewById(...)");
            this.S = (TextView) viewFindViewById25;
            View viewFindViewById26 = this.a.findViewById(R.id.rebate);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById26, "findViewById(...)");
            this.T = (TextView) viewFindViewById26;
            View viewFindViewById27 = this.a.findViewById(R.id.interest);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById27, "findViewById(...)");
            this.U = (TextView) viewFindViewById27;
            View viewFindViewById28 = this.a.findViewById(R.id.additionalamount);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById28, "findViewById(...)");
            this.V = (TextView) viewFindViewById28;
            View viewFindViewById29 = this.a.findViewById(R.id.total_amount);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById29, "findViewById(...)");
            this.W = (TextView) viewFindViewById29;
        }

        public final TextView O() {
            return this.w;
        }

        public final TextView P() {
            return this.V;
        }

        public final TextView Q() {
            return this.x;
        }

        public final TextView R() {
            return this.y;
        }

        public final TextView S() {
            return this.U;
        }

        public final TextView T() {
            return this.z;
        }

        public final LinearLayout U() {
            return this.K;
        }

        public final TextView V() {
            return this.R;
        }

        public final TextView W() {
            return this.E;
        }

        public final TextView X() {
            return this.A;
        }

        public final TextView Y() {
            return this.T;
        }

        public final TextView Z() {
            return this.B;
        }

        public final TextView a0() {
            return this.G;
        }

        public final TextView b0() {
            return this.C;
        }

        public final TextView c0() {
            return this.S;
        }

        public final TextView d0() {
            return this.D;
        }

        public final TextView e0() {
            return this.F;
        }

        public final TextView f0() {
            return this.P;
        }

        public final TextView g0() {
            return this.H;
        }

        public final Spinner h0() {
            return this.L;
        }

        public final TextView i0() {
            return this.Q;
        }

        public final TextView j0() {
            return this.N;
        }

        public final TextView k0() {
            return this.O;
        }

        public final TextView l0() {
            return this.I;
        }

        public final TextView m0() {
            return this.J;
        }

        public final TextView n0() {
            return this.u;
        }

        public final TextView o0() {
            return this.v;
        }

        public final TextView p0() {
            return this.W;
        }
    }

    public static final class c implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ b a;
        public final /* synthetic */ String b;
        public final /* synthetic */ jd6 c;
        public final /* synthetic */ int d;

        public c(b bVar, String str, jd6 jd6Var, int i) {
            this.a = bVar;
            this.b = str;
            this.c = jd6Var;
            this.d = i;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Log.e("Postion --", String.valueOf(this.a.h0().getSelectedItemPosition()));
            if (this.a.h0().getSelectedItemPosition() == 0) {
                Object selectedItem = this.a.h0().getSelectedItem();
                Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.Tax.Model.TaxModes");
                if (StringsKt__StringsJVMKt.equals(((TaxModes) selectedItem).getTax_mode(), this.b, true)) {
                    return;
                }
                this.c.B().t(this.d, "Select Tax Mode");
                return;
            }
            Object selectedItem2 = this.a.h0().getSelectedItem();
            Intrinsics.checkNotNull(selectedItem2, "null cannot be cast to non-null type com.nic.mparivahan.Tax.Model.TaxModes");
            TaxModes taxModes = (TaxModes) selectedItem2;
            if (StringsKt__StringsJVMKt.equals(taxModes.getTax_mode(), this.b, true)) {
                return;
            }
            this.c.B().t(this.d, String.valueOf(taxModes.getTax_mode()));
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public jd6(ArrayList list, a listener, Context context) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = list;
        this.e = listener;
        this.f = context;
    }

    public final int A(String mode, List list) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        IntRange indices = list != null ? CollectionsKt__CollectionsKt.getIndices(list) : null;
        Intrinsics.checkNotNull(indices);
        int first = indices.getFirst();
        int last = indices.getLast();
        if (first <= last) {
            while (!StringsKt__StringsJVMKt.equals$default(((TaxModes) list.get(first)).getTax_mode(), StringsKt__StringsKt.trim((CharSequence) mode).toString(), false, 2, null)) {
                if (first != last) {
                    first++;
                }
            }
            return first;
        }
        return 0;
    }

    public final a B() {
        return this.e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void p(b holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        wa3 wa3Var = new wa3(this.f);
        holder.l0().setText(wa3Var.b(va3.a.K(), this.f.getString(R.string.mv_tax)));
        holder.m0().setText(wa3Var.b("tax_mode", this.f.getString(R.string.tax_mode)));
        holder.j0().setText(wa3Var.b("lbl_tax_from", this.f.getString(R.string.tax_from_date)));
        holder.g0().setText(wa3Var.b("tax_upto", this.f.getString(R.string.tax_upto)));
        holder.a0().setText(wa3Var.b("tax_upto", this.f.getString(R.string.tax_upto)));
        holder.e0().setText(wa3Var.b("lbl_tax_amount", this.f.getString(R.string.tax_amount)));
        holder.i0().setText(wa3Var.b("vahan_amount", this.f.getString(R.string.amount)));
        holder.W().setText(wa3Var.b("lbl_penality", this.f.getString(R.string.penalty)));
        holder.V().setText(wa3Var.b("vahan_amount", this.f.getString(R.string.amount)));
        holder.d0().setText(wa3Var.b("lbl_surcharge", this.f.getString(R.string.surcharge)));
        holder.b0().setText(wa3Var.b("vahan_amount", this.f.getString(R.string.amount)));
        holder.Z().setText(wa3Var.b("lbl_rebate", this.f.getString(R.string.rebate)));
        holder.X().setText(wa3Var.b("vahan_amount", this.f.getString(R.string.amount)));
        holder.T().setText(wa3Var.b("lbl_interest", this.f.getString(R.string.interest)));
        holder.R().setText(wa3Var.b("vahan_amount", this.f.getString(R.string.amount)));
        holder.Q().setText(wa3Var.b("additional_amount1", this.f.getString(R.string.additional_amount1)));
        holder.O().setText(wa3Var.b("vahan_amount", this.f.getString(R.string.amount)));
        holder.o0().setText(wa3Var.b("total_amount", this.f.getString(R.string.total_amount)));
        holder.n0().setText(wa3Var.b("vahan_amount", this.f.getString(R.string.amount)));
        holder.k0().setText(wa3Var.b("lbl_tax_from", this.f.getString(R.string.tax_from_date)));
        try {
            String strValueOf = String.valueOf(((TaxCalModleItem) this.d.get(i)).getTax_HEAD());
            boolean status = ((TaxCalModleItem) this.d.get(i)).getStatus();
            holder.l0().setText(strValueOf);
            String strValueOf2 = String.valueOf(((TaxCalModleItem) this.d.get(i)).getTax_MODE());
            ArrayList<TaxModes> listTaxModes = ((TaxCalModleItem) this.d.get(i)).getListTaxModes();
            Intrinsics.checkNotNull(listTaxModes);
            TaxModes taxModes = new TaxModes("Select Tax Mode", "Select Tax Mode");
            if (!StringsKt__StringsJVMKt.equals$default(listTaxModes.get(0).getTax_mode(), "Select Tax Mode", false, 2, null)) {
                listTaxModes.add(0, taxModes);
            }
            holder.h0().setAdapter((SpinnerAdapter) new pd6(this.f, listTaxModes));
            holder.h0().setSelection(A(String.valueOf(((TaxCalModleItem) this.d.get(i)).getTax_MODE()), listTaxModes));
            if (status) {
                holder.U().setVisibility(0);
                try {
                    holder.h0().setEnabled(false);
                    Object obj = this.d.get(i);
                    Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                    E(holder, (TaxCalModleItem) obj);
                } catch (Exception unused) {
                }
            } else {
                holder.U().setVisibility(8);
            }
            Spinner spinnerH0 = holder.h0();
            if (spinnerH0 == null) {
                return;
            }
            spinnerH0.setOnItemSelectedListener(new c(holder, strValueOf2, this, i));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public b r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.tax_calculate_item, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new b(viewInflate);
    }

    public final void E(b holder, TaxCalModleItem item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.f0().setText(item.getTax_UPTO());
        holder.j0().setText(item.getTax_FROM());
        holder.i0().setText(String.valueOf(item.getAmount()));
        holder.V().setText(String.valueOf(item.getPenalty()));
        holder.c0().setText(String.valueOf(item.getSurcharge()));
        holder.Y().setText(String.valueOf(item.getRebate()));
        holder.S().setText(String.valueOf(item.getInterest()));
        holder.P().setText(String.valueOf(item.getAmount1()));
        holder.p0().setText(String.valueOf(item.getGamount()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
