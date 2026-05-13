package com.nic.mparivahan.VahanServices;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanViewModel.SlotAppointmentModel;
import com.zepto.wa3;
import com.zepto.yy0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends RecyclerView.h {
    public final List d;
    public final InterfaceC0056a e;
    public final wa3 f;

    /* JADX INFO: renamed from: com.nic.mparivahan.VahanServices.a$a, reason: collision with other inner class name */
    public interface InterfaceC0056a {
        void C(int i, boolean z);
    }

    public static final class b extends RecyclerView.d0 implements View.OnClickListener {
        public final TextView u;
        public final TextView v;
        public final TextView w;
        public final CardView x;
        public final InterfaceC0056a y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View itemView, InterfaceC0056a onItemListener) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            Intrinsics.checkNotNullParameter(onItemListener, "onItemListener");
            View viewFindViewById = itemView.findViewById(R.id.slot_Number);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R.id.slot_time);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R.id.tv_seats);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.w = (TextView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(R.id.slot_cardView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.x = (CardView) viewFindViewById4;
            this.y = onItemListener;
            itemView.setOnClickListener(this);
        }

        public final TextView O() {
            return this.w;
        }

        public final TextView P() {
            return this.u;
        }

        public final TextView Q() {
            return this.v;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.y.C(k(), this.x.getCardBackgroundColor().equals(Integer.valueOf(yy0.c(this.a.getContext(), R.color.dateRed))));
        }
    }

    public a(List slots, InterfaceC0056a onItemListener, wa3 langSess) {
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(onItemListener, "onItemListener");
        Intrinsics.checkNotNullParameter(langSess, "langSess");
        this.d = slots;
        this.e = onItemListener;
        this.f = langSess;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void p(b holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.P().setText(this.f.b("label_slot", "Slot") + ' ' + (i + 1));
        holder.O().setText(((SlotAppointmentModel) this.d.get(i)).getAvail_seats());
        holder.Q().setText(((SlotAppointmentModel) this.d.get(i)).getSlot());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public b r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_slot_list, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new b(viewInflate, this.e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
