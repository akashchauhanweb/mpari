package com.zepto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sarathithreeservices.model.app_status.ApplFlowStatus;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public final class xu extends RecyclerView.h {
    public final ArrayList d;
    public final Context e;
    public final lh4 f;
    public int g;

    public static final class a extends RecyclerView.d0 {
        public final TextView u;
        public final TextView v;
        public final TextView w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View viewFindViewById = this.a.findViewById(R.id.app_ser_no);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (TextView) viewFindViewById;
            View viewFindViewById2 = this.a.findViewById(R.id.app_status_name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (TextView) viewFindViewById2;
            View viewFindViewById3 = this.a.findViewById(R.id.app_status_status);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.w = (TextView) viewFindViewById3;
        }

        public final TextView O() {
            return this.u;
        }

        public final TextView P() {
            return this.v;
        }

        public final TextView Q() {
            return this.w;
        }
    }

    public xu(ArrayList mList, Context mContext, lh4 mOpenScreen) {
        Intrinsics.checkNotNullParameter(mList, "mList");
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mOpenScreen, "mOpenScreen");
        this.d = mList;
        this.e = mContext;
        this.f = mOpenScreen;
    }

    public static final void C(a holder, xu this$0, ApplFlowStatus mModel, int i, View view) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mModel, "$mModel");
        if (Intrinsics.areEqual(holder.Q().getText(), this$0.e.getString(R.string.proceed_new))) {
            this$0.f.J(Integer.valueOf(mModel.getAcCd()), i, mModel.getTrCd());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void p(final a holder, final int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.d.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        final ApplFlowStatus applFlowStatus = (ApplFlowStatus) obj;
        holder.P().setText(applFlowStatus.getAcDesc());
        if (this.g == 0 && StringsKt__StringsJVMKt.equals(applFlowStatus.getStatus(), "Pending", true)) {
            holder.Q().setText(this.e.getString(R.string.proceed_new));
            holder.Q().setTextColor(yy0.c(this.e, R.color.never_mix));
            holder.O().setBackgroundResource(R.drawable.circle_white_gray);
            holder.O().setTextColor(yy0.c(this.e, R.color.white));
            this.g++;
        } else if (StringsKt__StringsJVMKt.equals(applFlowStatus.getStatus(), "Completed", true)) {
            holder.Q().setText("Completed");
            holder.Q().setTextColor(yy0.c(this.e, R.color.green));
            holder.O().setBackgroundResource(R.drawable.circle_blue);
            holder.O().setTextColor(yy0.c(this.e, R.color.blue_color));
        } else {
            holder.Q().setText(applFlowStatus.getStatus());
            holder.O().setBackgroundResource(R.drawable.circle_white_gray);
            holder.O().setTextColor(yy0.c(this.e, R.color.white));
            holder.Q().setTextColor(yy0.c(this.e, R.color.gray));
        }
        holder.Q().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xu.C(holder, this, applFlowStatus, i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.app_status_adapter, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
