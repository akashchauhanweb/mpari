package com.zepto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class zn extends RecyclerView.h {
    public final Context d;
    public final ArrayList e;

    public static final class a extends RecyclerView.d0 {
        public TextView u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R.id.service_txt);
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
            this.u = (TextView) viewFindViewById;
        }

        public final TextView O() {
            return this.u;
        }
    }

    public zn(Context context, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = context;
        this.e = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void p(a holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        TextView textViewO = holder.O();
        StringBuilder sb = new StringBuilder();
        sb.append(i + 1);
        sb.append(". ");
        ArrayList arrayList = this.e;
        Intrinsics.checkNotNull(arrayList);
        sb.append(((NonUploaded) arrayList.get(i)).getCatName());
        textViewO.setText(sb.toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.alert_list_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new a(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        ArrayList arrayList = this.e;
        Intrinsics.checkNotNull(arrayList);
        return arrayList.size();
    }
}
