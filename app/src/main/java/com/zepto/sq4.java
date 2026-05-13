package com.zepto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class sq4 extends RecyclerView.h {
    public final ArrayList d;

    public static final class a extends RecyclerView.d0 {
        public final TextView u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View viewFindViewById = this.a.findViewById(R.id.app_status_name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (TextView) viewFindViewById;
        }

        public final TextView O() {
            return this.u;
        }
    }

    public sq4(ArrayList mList) {
        Intrinsics.checkNotNullParameter(mList, "mList");
        this.d = mList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void p(a holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.d.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        holder.O().setText((String) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.pending_status_adapter, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
