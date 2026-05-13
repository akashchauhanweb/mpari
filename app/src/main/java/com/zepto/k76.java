package com.zepto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k76 extends RecyclerView.h {
    public final ArrayList d;
    public final Context e;
    public final int f;
    public final int g;
    public final String h;

    public static final class a extends RecyclerView.d0 {
        public final TextView u;
        public final ImageView v;
        public final View w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View viewFindViewById = this.a.findViewById(R.id.steps_text);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (TextView) viewFindViewById;
            View viewFindViewById2 = this.a.findViewById(R.id.steps_image);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (ImageView) viewFindViewById2;
            View viewFindViewById3 = this.a.findViewById(R.id.paymentView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.w = viewFindViewById3;
        }

        public final TextView O() {
            return this.u;
        }

        public final View P() {
            return this.w;
        }

        public final ImageView Q() {
            return this.v;
        }
    }

    public k76(ArrayList mList, Context mContext, int i, int i2, String name) {
        Intrinsics.checkNotNullParameter(mList, "mList");
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(name, "name");
        this.d = mList;
        this.e = mContext;
        this.f = i;
        this.g = i2;
        this.h = name;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void p(a holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.d.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        String str = (String) obj;
        if (Intrinsics.areEqual(this.h, str)) {
            holder.Q().setBackgroundResource(R.drawable.blacktwo);
        } else if (i < this.f - 1) {
            holder.Q().setBackgroundResource(R.drawable.check);
        } else {
            holder.Q().setBackgroundResource(R.drawable.black);
        }
        if (i == this.d.size() - 1) {
            holder.P().setVisibility(8);
        } else {
            holder.P().setVisibility(0);
        }
        if (this.d.size() == 2) {
            holder.P().setLayoutParams(new LinearLayout.LayoutParams((this.g / 2) + 30, 6));
        } else if (this.d.size() == 3) {
            holder.P().setLayoutParams(new LinearLayout.LayoutParams((this.g / 4) - 60, 6));
        } else {
            holder.P().setLayoutParams(new LinearLayout.LayoutParams(80, 6));
        }
        try {
            holder.O().setText(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.steps_layout, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
