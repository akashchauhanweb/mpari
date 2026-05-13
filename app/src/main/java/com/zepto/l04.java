package com.zepto;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.NrvDetails;
import com.nic.mparivahan.RC.SharedRcScreen;
import com.nic.mparivahan.RC.VirtualRcScreen;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class l04 extends RecyclerView.h {
    public final ArrayList d;
    public final Context e;
    public final uh1 f;

    public static final class a extends RecyclerView.d0 {
        public final TextView A;
        public final TextView B;
        public final LinearLayout C;
        public final ImageView D;
        public final ImageView E;
        public final TextView u;
        public final ImageView v;
        public final ImageView w;
        public final TextView x;
        public final TextView y;
        public final TextView z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View viewFindViewById = this.a.findViewById(R.id.shared_rc);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (TextView) viewFindViewById;
            View viewFindViewById2 = this.a.findViewById(R.id.update);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (ImageView) viewFindViewById2;
            View viewFindViewById3 = this.a.findViewById(R.id.delet);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.w = (ImageView) viewFindViewById3;
            View viewFindViewById4 = this.a.findViewById(R.id.rc_number);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.x = (TextView) viewFindViewById4;
            View viewFindViewById5 = this.a.findViewById(R.id.owner_name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.y = (TextView) viewFindViewById5;
            View viewFindViewById6 = this.a.findViewById(R.id.address);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            this.z = (TextView) viewFindViewById6;
            View viewFindViewById7 = this.a.findViewById(R.id.issue_date);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
            this.A = (TextView) viewFindViewById7;
            View viewFindViewById8 = this.a.findViewById(R.id.valid_upto);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
            this.B = (TextView) viewFindViewById8;
            View viewFindViewById9 = this.a.findViewById(R.id.linear_parent);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
            this.C = (LinearLayout) viewFindViewById9;
            View viewFindViewById10 = this.a.findViewById(R.id.share_doc);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
            this.D = (ImageView) viewFindViewById10;
            View viewFindViewById11 = this.a.findViewById(R.id.option_menu);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
            this.E = (ImageView) viewFindViewById11;
        }

        public final TextView O() {
            return this.z;
        }

        public final ImageView P() {
            return this.w;
        }

        public final TextView Q() {
            return this.A;
        }

        public final LinearLayout R() {
            return this.C;
        }

        public final ImageView S() {
            return this.E;
        }

        public final TextView T() {
            return this.y;
        }

        public final TextView U() {
            return this.x;
        }

        public final ImageView V() {
            return this.D;
        }

        public final ImageView W() {
            return this.v;
        }

        public final TextView X() {
            return this.B;
        }
    }

    public l04(ArrayList rc_details, Context context, uh1 deletMyRcRcDeletListner) {
        Intrinsics.checkNotNullParameter(rc_details, "rc_details");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deletMyRcRcDeletListner, "deletMyRcRcDeletListner");
        this.d = rc_details;
        this.e = context;
        this.f = deletMyRcRcDeletListner;
    }

    public static final void H(l04 this$0, String str, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0.e, (Class<?>) SharedRcScreen.class);
        intent.putExtra("RcNumber", str);
        this$0.e.startActivity(intent);
    }

    public static final void I(l04 this$0, String str, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0.e, (Class<?>) VirtualRcScreen.class);
        intent.putExtra("RcNumber", str);
        this$0.e.startActivity(intent);
    }

    public static final void J(l04 this$0, String str, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f.p(str, i);
    }

    public static final void K(l04 this$0, String str, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f.S(str, i);
    }

    public static final void L(final l04 this$0, a holder, final String str, final int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        PopupMenu popupMenu = new PopupMenu(this$0.e, holder.S());
        popupMenu.inflate(R.menu.menu_item_option);
        Intrinsics.checkNotNullExpressionValue(popupMenu.getMenu().findItem(R.id.menu1), "findItem(...)");
        Intrinsics.checkNotNullExpressionValue(popupMenu.getMenu().findItem(R.id.menu2), "findItem(...)");
        Intrinsics.checkNotNullExpressionValue(popupMenu.getMenu().findItem(R.id.menu3), "findItem(...)");
        Intrinsics.checkNotNullExpressionValue(popupMenu.getMenu().findItem(R.id.menu4), "findItem(...)");
        popupMenu.setGravity(8388613);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.zepto.k04
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return l04.M(this.a, str, i, menuItem);
            }
        });
        popupMenu.show();
    }

    public static final boolean M(l04 this$0, String str, int i, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        switch (menuItem.getItemId()) {
            case R.id.menu1 /* 2131363697 */:
                Intent intent = new Intent(this$0.e, (Class<?>) VirtualRcScreen.class);
                intent.putExtra("RcNumber", str);
                this$0.e.startActivity(intent);
                break;
            case R.id.menu2 /* 2131363698 */:
                Intent intent2 = new Intent(this$0.e, (Class<?>) SharedRcScreen.class);
                intent2.putExtra("RcNumber", str);
                this$0.e.startActivity(intent2);
                break;
            case R.id.menu3 /* 2131363699 */:
                this$0.f.S(str, i);
                break;
            case R.id.menu4 /* 2131363700 */:
                this$0.f.p(str, i);
                break;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(final a holder, final int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        try {
            final String rc_regn_no = ((NrvDetails) this.d.get(i)).getRc_regn_no();
            String rc_owner_name = ((NrvDetails) this.d.get(i)).getRc_owner_name();
            String rc_present_address = ((NrvDetails) this.d.get(i)).getRc_present_address();
            String rc_regn_dt = ((NrvDetails) this.d.get(i)).getRc_regn_dt();
            String rc_fit_upto = ((NrvDetails) this.d.get(i)).getRc_fit_upto();
            holder.U().setText(rc_regn_no);
            holder.T().setText(rc_owner_name);
            holder.O().setText(rc_present_address);
            holder.Q().setText("Issue Date : " + rc_regn_dt);
            holder.X().setText("Valid Upto : " + rc_fit_upto);
            holder.V().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.f04
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    l04.H(this.a, rc_regn_no, view);
                }
            });
            holder.R().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.g04
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    l04.I(this.a, rc_regn_no, view);
                }
            });
            holder.P().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.h04
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    l04.J(this.a, rc_regn_no, i, view);
                }
            });
            holder.W().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.i04
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    l04.K(this.a, rc_regn_no, i, view);
                }
            });
            holder.S().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.j04
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    l04.L(this.a, holder, rc_regn_no, i, view);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.myrc_item, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    public final void O(int i) {
        this.d.remove(i);
        n(i);
        m(i, this.d.size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
