package com.zepto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.ServiceWithdrawnScreen.Activity.SelectedWithdrawnList;
import com.nic.mparivahan.ServiceWithdrawnScreen.Modal.AppliedServiceResultModal;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes2.dex */
public final class sv5 extends RecyclerView.h {
    public final Context d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final SelectedWithdrawnList h;

    public static final class a extends RecyclerView.d0 {
        public final Spinner u;
        public final Spinner v;
        public final TextView w;
        public final TextView x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R.id.confirmationSpn);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (Spinner) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R.id.reasonRemarkSpn);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (Spinner) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R.id.transactionAppliedValue);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.w = (TextView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(R.id.appliedCov);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.x = (TextView) viewFindViewById4;
        }

        public final TextView O() {
            return this.x;
        }

        public final Spinner P() {
            return this.u;
        }

        public final Spinner Q() {
            return this.v;
        }

        public final TextView R() {
            return this.w;
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ sv5 b;
        public final /* synthetic */ Ref.ObjectRef c;
        public final /* synthetic */ AppliedServiceResultModal d;

        public b(Ref.ObjectRef objectRef, sv5 sv5Var, Ref.ObjectRef objectRef2, AppliedServiceResultModal appliedServiceResultModal) {
            this.a = objectRef;
            this.b = sv5Var;
            this.c = objectRef2;
            this.d = appliedServiceResultModal;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v2, types: [T, java.lang.Object, java.lang.String] */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            String str;
            String str2;
            Intrinsics.checkNotNull(adapterView);
            Object tag = adapterView.getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) tag).intValue();
            ?? string = adapterView.getItemAtPosition(i).toString();
            this.a.element = string;
            if (Intrinsics.areEqual((Object) string, "Select")) {
                return;
            }
            String str3 = (String) this.a.element;
            if (Intrinsics.areEqual(str3, "Yes")) {
                str2 = "Y";
            } else {
                if (!Intrinsics.areEqual(str3, "No")) {
                    str = "Select";
                    this.b.h.Y1(iIntValue, str, (String) this.c.element, this.d.getAppliedService(), this.d.getAppliedCov(), this.d.getStatus());
                }
                str2 = "N";
            }
            str = str2;
            this.b.h.Y1(iIntValue, str, (String) this.c.element, this.d.getAppliedService(), this.d.getAppliedCov(), this.d.getStatus());
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class c implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ sv5 c;
        public final /* synthetic */ AppliedServiceResultModal d;

        public c(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, sv5 sv5Var, AppliedServiceResultModal appliedServiceResultModal) {
            this.a = objectRef;
            this.b = objectRef2;
            this.c = sv5Var;
            this.d = appliedServiceResultModal;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v2, types: [T, java.lang.Object, java.lang.String] */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            String str;
            String str2;
            Intrinsics.checkNotNull(adapterView);
            Object tag = adapterView.getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) tag).intValue();
            ?? string = adapterView.getItemAtPosition(i).toString();
            this.a.element = string;
            if (Intrinsics.areEqual((Object) string, "Select")) {
                return;
            }
            String str3 = (String) this.b.element;
            if (Intrinsics.areEqual(str3, "Yes")) {
                str2 = "Y";
            } else {
                if (!Intrinsics.areEqual(str3, "No")) {
                    str = "Select";
                    this.c.h.Y1(iIntValue, str, (String) this.a.element, this.d.getAppliedService(), this.d.getAppliedCov(), this.d.getStatus());
                }
                str2 = "N";
            }
            str = str2;
            this.c.h.Y1(iIntValue, str, (String) this.a.element, this.d.getAppliedService(), this.d.getAppliedCov(), this.d.getStatus());
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public sv5(Context context, ArrayList list, ArrayList reasonList, ArrayList confirmationArray, SelectedWithdrawnList activity) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(reasonList, "reasonList");
        Intrinsics.checkNotNullParameter(confirmationArray, "confirmationArray");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.d = context;
        this.e = list;
        this.f = reasonList;
        this.g = confirmationArray;
        this.h = activity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void p(a holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = "";
        Object obj = this.e.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        AppliedServiceResultModal appliedServiceResultModal = (AppliedServiceResultModal) obj;
        holder.R().setText(appliedServiceResultModal.getAppliedService());
        if (!kt6.d(appliedServiceResultModal.getAppliedCov()) || appliedServiceResultModal.getAppliedCov() == "NA") {
            holder.O().setVisibility(8);
        } else {
            holder.O().setVisibility(0);
            holder.O().setText(this.d.getString(R.string.applied_cov) + ' ' + appliedServiceResultModal.getAppliedCov());
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.d, R.layout.service_withdrawn_spinner_item, this.f);
        arrayAdapter.setDropDownViewResource(R.layout.service_withdrawn_spinner_item);
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this.d, R.layout.service_withdrawn_spinner_item, this.g);
        arrayAdapter2.setDropDownViewResource(R.layout.service_withdrawn_spinner_item);
        holder.Q().setTag(Integer.valueOf(i));
        holder.P().setTag(Integer.valueOf(i));
        holder.Q().setAdapter((SpinnerAdapter) arrayAdapter);
        holder.P().setAdapter((SpinnerAdapter) arrayAdapter2);
        holder.P().setOnItemSelectedListener(new b(objectRef2, this, objectRef, appliedServiceResultModal));
        holder.Q().setOnItemSelectedListener(new c(objectRef, objectRef2, this, appliedServiceResultModal));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_applied_withdrawn_list, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    public final void D(ArrayList updatedList) {
        Intrinsics.checkNotNullParameter(updatedList, "updatedList");
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.addAll(updatedList);
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.e.size();
    }
}
