package com.zepto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ao extends RecyclerView.h {
    public final Context d;
    public final ArrayList e;
    public final ArrayList f;

    public static final class a extends RecyclerView.d0 {
        public TextView u;
        public TextView v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R.id.title_txt);
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
            this.u = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R.id.desc_txt);
            Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
            this.v = (TextView) viewFindViewById2;
        }

        public final TextView O() {
            return this.v;
        }

        public final TextView P() {
            return this.u;
        }
    }

    public ao(Context context, ArrayList arrayList, ArrayList arrayList2) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = context;
        this.e = arrayList;
        this.f = arrayList2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void p(a holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        TextView textViewP = holder.P();
        StringBuilder sb = new StringBuilder();
        sb.append(i + 1);
        sb.append(". ");
        ArrayList arrayList = this.e;
        Intrinsics.checkNotNull(arrayList);
        sb.append((String) arrayList.get(i));
        textViewP.setText(sb.toString());
        TextView textViewO = holder.O();
        ArrayList arrayList2 = this.f;
        Intrinsics.checkNotNull(arrayList2);
        textViewO.setText((CharSequence) arrayList2.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.alert_list_custom_items, parent, false);
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
