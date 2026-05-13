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
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes2.dex */
public final class e14 extends RecyclerView.h {
    public final ArrayList d;
    public final Context e;
    public final uh1 f;

    public static final class a extends RecyclerView.d0 {
        public final LinearLayout A;
        public final ImageView B;
        public final TextView u;
        public final TextView v;
        public final TextView w;
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
            View viewFindViewById2 = this.a.findViewById(R.id.rc_number);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (TextView) viewFindViewById2;
            View viewFindViewById3 = this.a.findViewById(R.id.owner_name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.w = (TextView) viewFindViewById3;
            View viewFindViewById4 = this.a.findViewById(R.id.address);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.x = (TextView) viewFindViewById4;
            View viewFindViewById5 = this.a.findViewById(R.id.issue_date);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.y = (TextView) viewFindViewById5;
            View viewFindViewById6 = this.a.findViewById(R.id.valid_upto);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            this.z = (TextView) viewFindViewById6;
            View viewFindViewById7 = this.a.findViewById(R.id.linear_parent);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
            this.A = (LinearLayout) viewFindViewById7;
            View viewFindViewById8 = this.a.findViewById(R.id.option_menu);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
            this.B = (ImageView) viewFindViewById8;
        }

        public final TextView O() {
            return this.x;
        }

        public final TextView P() {
            return this.y;
        }

        public final LinearLayout Q() {
            return this.A;
        }

        public final ImageView R() {
            return this.B;
        }

        public final TextView S() {
            return this.w;
        }

        public final TextView T() {
            return this.v;
        }

        public final TextView U() {
            return this.z;
        }
    }

    public e14(ArrayList rc_details, Context context, uh1 deletMyRcRcDeletListner) {
        Intrinsics.checkNotNullParameter(rc_details, "rc_details");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deletMyRcRcDeletListner, "deletMyRcRcDeletListner");
        this.d = rc_details;
        this.e = context;
        this.f = deletMyRcRcDeletListner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void F(final e14 this$0, a holder, Ref.ObjectRef session, final String str, final int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(session, "$session");
        PopupMenu popupMenu = new PopupMenu(this$0.e, holder.R());
        popupMenu.setGravity(8388613);
        popupMenu.inflate(R.menu.menu_item_option);
        MenuItem menuItemFindItem = popupMenu.getMenu().findItem(R.id.menu1);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem, "findItem(...)");
        MenuItem menuItemFindItem2 = popupMenu.getMenu().findItem(R.id.menu2);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem2, "findItem(...)");
        MenuItem menuItemFindItem3 = popupMenu.getMenu().findItem(R.id.menu3);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem3, "findItem(...)");
        MenuItem menuItemFindItem4 = popupMenu.getMenu().findItem(R.id.menu4);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem4, "findItem(...)");
        menuItemFindItem.setTitle(((wa3) session.element).b("label_view", "View"));
        menuItemFindItem2.setTitle(((wa3) session.element).b("label_share", "Share"));
        menuItemFindItem3.setTitle(((wa3) session.element).b(va3.a.j0(), "Refresh"));
        menuItemFindItem4.setTitle(((wa3) session.element).b("delete", "Delete"));
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.zepto.d14
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return e14.G(this.a, str, i, menuItem);
            }
        });
        popupMenu.show();
    }

    public static final boolean G(e14 this$0, String str, int i, MenuItem menuItem) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.zepto.wa3] */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void p(final a holder, final int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        try {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = new wa3(this.e);
            final String rc_regn_no = ((NrvDetails) this.d.get(i)).getRc_regn_no();
            String rc_owner_name = ((NrvDetails) this.d.get(i)).getRc_owner_name();
            String rc_present_address = ((NrvDetails) this.d.get(i)).getRc_present_address();
            String rc_regn_dt = ((NrvDetails) this.d.get(i)).getRc_regn_dt();
            String rc_fit_upto = ((NrvDetails) this.d.get(i)).getRc_fit_upto();
            holder.T().setText(rc_regn_no);
            holder.S().setText(rc_owner_name);
            holder.O().setText(rc_present_address);
            holder.P().setText(((wa3) objectRef.element).b("issue_date", "Issue Date") + " - " + rc_regn_dt);
            holder.U().setText(((wa3) objectRef.element).b("label_dl_serv_valid_upto", "Valid Upto") + " - " + rc_fit_upto);
            holder.Q().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.b14
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e14.E(view);
                }
            });
            holder.R().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.c14
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e14.F(this.a, holder, objectRef, rc_regn_no, i, view);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_virtual_rc_item, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    public final void I(int i) {
        this.d.remove(i);
        n(i);
        m(i, this.d.size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
