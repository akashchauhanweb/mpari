package com.zepto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.ApplicationStatusModel.Currentlist;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes2.dex */
public final class ow extends RecyclerView.h {
    public ArrayList d;
    public final Context e;
    public final cv6 f;

    public static final class a extends RecyclerView.d0 {
        public final TextView u;
        public final LinearLayout v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View viewFindViewById = this.a.findViewById(R.id.rc_number);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (TextView) viewFindViewById;
            View viewFindViewById2 = this.a.findViewById(R.id.vehicle_linear);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (LinearLayout) viewFindViewById2;
        }

        public final LinearLayout O() {
            return this.v;
        }

        public final TextView P() {
            return this.u;
        }
    }

    public ow(ArrayList appList, Context context, cv6 updateDashboardRc) {
        Intrinsics.checkNotNullParameter(appList, "appList");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(updateDashboardRc, "updateDashboardRc");
        this.d = appList;
        this.e = context;
        this.f = updateDashboardRc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void C(ow this$0, Ref.ObjectRef app_no, int i, Ref.ObjectRef rc_number, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(app_no, "$app_no");
        Intrinsics.checkNotNullParameter(rc_number, "$rc_number");
        try {
            this$0.f.y((String) app_no.element, i, (String) rc_number.element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.String] */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void p(a holder, final int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        try {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = ((Currentlist) this.d.get(i)).getApplnolist().get(0).getAppl_no();
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = ((Currentlist) this.d.get(i)).getApplnolist().get(0).getRegno();
            holder.P().setText((CharSequence) objectRef.element);
            holder.O().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ow.C(this.a, objectRef, i, objectRef2, view);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.application_list_item, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
