package com.nic.mparivahan.dlservices.ui.idp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.idp.IdpcovgradesItem;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends RecyclerView.h {
    public ArrayList d;
    public final DLIdpActivity e;
    public final InterfaceC0061a f;

    /* JADX INFO: renamed from: com.nic.mparivahan.dlservices.ui.idp.a$a, reason: collision with other inner class name */
    public interface InterfaceC0061a {
        void j(int i, boolean z);
    }

    public static final class b extends RecyclerView.d0 {
        public final CheckBox u;
        public final TextView v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View viewFindViewById = this.a.findViewById(R.id.cov_check_box);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (CheckBox) viewFindViewById;
            View viewFindViewById2 = this.a.findViewById(R.id.cov_txt);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (TextView) viewFindViewById2;
        }

        public final CheckBox O() {
            return this.u;
        }

        public final TextView P() {
            return this.v;
        }
    }

    public a(ArrayList arrayList, DLIdpActivity mContext, InterfaceC0061a onItemListener) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(onItemListener, "onItemListener");
        this.d = arrayList;
        this.e = mContext;
        this.f = onItemListener;
    }

    public static final void C(a this$0, int i, IdpcovgradesItem idpcovgradesItem, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f.j(i, z);
        if (idpcovgradesItem != null) {
            if (idpcovgradesItem.getStatus()) {
                ArrayList arrayList = this$0.d;
                if (arrayList != null) {
                }
                ArrayList arrayListW2 = this$0.e.getMIdpcovgradesItem();
                if (arrayListW2 != null) {
                }
                this$0.j();
                return;
            }
            ArrayList arrayList2 = this$0.d;
            if (arrayList2 != null) {
            }
            ArrayList arrayListW22 = this$0.e.getMIdpcovgradesItem();
            if (arrayListW22 != null) {
            }
            this$0.j();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void p(b holder, final int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ArrayList arrayList = this.d;
        final IdpcovgradesItem idpcovgradesItem = arrayList != null ? (IdpcovgradesItem) arrayList.get(i) : null;
        if (idpcovgradesItem != null) {
            holder.P().setText(idpcovgradesItem.getIdpcovgrdDesc());
            if (idpcovgradesItem.getStatus()) {
                holder.O().setChecked(true);
            }
        }
        holder.O().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.d01
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                com.nic.mparivahan.dlservices.ui.idp.a.C(this.a, i, idpcovgradesItem, compoundButton, z);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public b r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.cov_adapter, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new b(viewInflate);
    }

    public final void E(ArrayList arrayList) {
        if (arrayList != null) {
            this.d = arrayList;
        }
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        ArrayList arrayList = this.d;
        Intrinsics.checkNotNull(arrayList);
        return arrayList.size();
    }
}
