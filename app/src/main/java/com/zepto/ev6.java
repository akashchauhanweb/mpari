package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanModel.ModifiedListOfDisposeApplModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ev6 extends RecyclerView.h {
    public final List d;
    public final a e;

    public interface a {
        void j(int i, boolean z);
    }

    public static final class b extends RecyclerView.d0 {
        public final CheckBox u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.u = (CheckBox) itemView.findViewById(R.id.cb);
        }

        public final CheckBox O() {
            return this.u;
        }
    }

    public ev6(List list, a onItemListener) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(onItemListener, "onItemListener");
        this.d = list;
        this.e = onItemListener;
    }

    public static final void C(ev6 this$0, int i, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.e.j(i, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void p(b holder, final int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (((ModifiedListOfDisposeApplModel) this.d.get(i)).getDescr().length() > 0) {
            holder.O().setText(((ModifiedListOfDisposeApplModel) this.d.get(i)).getDescr());
        }
        holder.O().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.dv6
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ev6.C(this.a, i, compoundButton, z);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public b r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.dispose_appl_item_row, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new b(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
