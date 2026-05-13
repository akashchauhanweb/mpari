package com.zepto;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.RenewalOfPermit.RenewalOfPermitAcitivty;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class r75 extends RecyclerView.h {
    public ArrayList d;
    public final RenewalOfPermitAcitivty e;

    public static final class a extends RecyclerView.d0 {
        public final CheckBox u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View viewFindViewById = this.a.findViewById(R.id.region_check);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (CheckBox) viewFindViewById;
        }

        public final CheckBox O() {
            return this.u;
        }
    }

    public r75(ArrayList contactlist, RenewalOfPermitAcitivty renewalPermit) {
        Intrinsics.checkNotNullParameter(contactlist, "contactlist");
        Intrinsics.checkNotNullParameter(renewalPermit, "renewalPermit");
        this.d = contactlist;
        this.e = renewalPermit;
    }

    public static final void C(r75 this$0, int i, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.e.k2(i, 1);
        } else {
            this$0.e.k2(i, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void p(a holder, final int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        try {
            Log.e("Status", String.valueOf(((HashMap) this.d.get(i)).get("Status")));
            holder.O().setText(String.valueOf((String) ((HashMap) this.d.get(i)).get("Regin")));
            holder.O().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.q75
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    r75.C(this.a, i, compoundButton, z);
                }
            });
        } catch (Exception e) {
            Log.e("AdapterError", e.toString());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.renewal_region_item, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
