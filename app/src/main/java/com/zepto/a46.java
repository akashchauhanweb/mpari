package com.zepto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.SlotDet;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a46 extends RecyclerView.h {
    public final Context d;
    public final ArrayList e;
    public final a f;

    public interface a {
        void i(int i, String str, int i2);
    }

    public static final class b extends RecyclerView.d0 {
        public final TextView u;
        public final TextView v;
        public final TextView w;
        public final ConstraintLayout x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.u = (TextView) view.findViewById(R.id.slot_numbers);
            this.v = (TextView) view.findViewById(R.id.slot_time);
            this.w = (TextView) view.findViewById(R.id.slots_count);
            this.x = (ConstraintLayout) view.findViewById(R.id.item_cl);
        }

        public final void O(SlotDet item) {
            Intrinsics.checkNotNullParameter(item, "item");
            R(item);
        }

        public final ConstraintLayout P() {
            return this.x;
        }

        public final TextView Q() {
            return this.w;
        }

        public final void R(SlotDet slotDet) {
            int slotNo = slotDet.getSlotNo();
            this.u.setText("Slot " + slotNo + ':');
            this.v.setText(slotDet.getTimeForDisp());
            this.w.setText("" + slotDet.getAvalableSeats());
        }
    }

    public a46(Context context, ArrayList arrayList, a itemListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(itemListener, "itemListener");
        this.d = context;
        this.e = arrayList;
        this.f = itemListener;
    }

    public static final void C(a46 this$0, int i, SlotDet slotDet, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f.i(i, slotDet.getQuotadt(), slotDet.getSlotNo());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void p(b holder, final int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ArrayList arrayList = this.e;
        final SlotDet slotDet = arrayList != null ? (SlotDet) arrayList.get(i) : null;
        if (slotDet != null) {
            holder.O(slotDet);
        }
        Integer numValueOf = slotDet != null ? Integer.valueOf(slotDet.getAvalableSeats()) : null;
        Intrinsics.checkNotNull(numValueOf);
        if (numValueOf.intValue() > 0) {
            holder.Q().setBackground(this.d.getResources().getDrawable(R.drawable.dl_slots_green));
        } else {
            holder.Q().setBackground(this.d.getResources().getDrawable(R.drawable.dl_slots_red));
        }
        holder.P().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.z36
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a46.C(this.a, i, slotDet, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public b r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_dl_renewal_slots, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new b(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        ArrayList arrayList = this.e;
        Integer numValueOf = arrayList != null ? Integer.valueOf(arrayList.size()) : null;
        Intrinsics.checkNotNull(numValueOf);
        return numValueOf.intValue();
    }
}
