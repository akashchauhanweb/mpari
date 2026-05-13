package com.zepto;

import android.content.Context;
import android.util.Log;
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
import com.nic.mparivahan.RC.Model.RecentSearch;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class c65 extends RecyclerView.h {
    public final Context d;
    public final ArrayList e;
    public final tb0 f;
    public wa3 g;

    public static final class a extends RecyclerView.d0 {
        public final ImageView u;
        public final TextView v;
        public final TextView w;
        public final LinearLayout x;
        public final ImageView y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View viewFindViewById = this.a.findViewById(R.id.owner_image);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (ImageView) viewFindViewById;
            View viewFindViewById2 = this.a.findViewById(R.id.txt_rc_number);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (TextView) viewFindViewById2;
            View viewFindViewById3 = this.a.findViewById(R.id.txt_rc_name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.w = (TextView) viewFindViewById3;
            View viewFindViewById4 = this.a.findViewById(R.id.recent_rc_layout);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.x = (LinearLayout) viewFindViewById4;
            View viewFindViewById5 = this.a.findViewById(R.id.option_menu);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.y = (ImageView) viewFindViewById5;
        }

        public final ImageView O() {
            return this.u;
        }

        public final ImageView P() {
            return this.y;
        }

        public final TextView Q() {
            return this.w;
        }

        public final TextView R() {
            return this.v;
        }
    }

    public c65(Context context, ArrayList mList, tb0 cellClickListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mList, "mList");
        Intrinsics.checkNotNullParameter(cellClickListener, "cellClickListener");
        this.d = context;
        this.e = mList;
        this.f = cellClickListener;
    }

    public static final void G(c65 this$0, RecentSearch ItemsViewModel, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(ItemsViewModel, "$ItemsViewModel");
        this$0.f.M(ItemsViewModel.getSearchNumber());
    }

    public static final void H(final c65 this$0, a holder, final RecentSearch ItemsViewModel, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(ItemsViewModel, "$ItemsViewModel");
        PopupMenu popupMenu = new PopupMenu(this$0.d, holder.P());
        popupMenu.inflate(R.menu.recent_rc_menu);
        MenuItem menuItemFindItem = popupMenu.getMenu().findItem(R.id.menu1);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem, "findItem(...)");
        MenuItem menuItemFindItem2 = popupMenu.getMenu().findItem(R.id.menu2);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem2, "findItem(...)");
        this$0.K(new wa3(this$0.d));
        menuItemFindItem.setTitle(this$0.D().b("label_view", "View"));
        menuItemFindItem2.setTitle(this$0.D().b("delete", "Delete"));
        popupMenu.setGravity(8388613);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.zepto.b65
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return c65.I(this.a, ItemsViewModel, menuItem);
            }
        });
        popupMenu.show();
    }

    public static final boolean I(c65 this$0, RecentSearch ItemsViewModel, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(ItemsViewModel, "$ItemsViewModel");
        switch (menuItem.getItemId()) {
            case R.id.menu1 /* 2131363697 */:
                this$0.f.M(ItemsViewModel.getSearchNumber());
                break;
            case R.id.menu2 /* 2131363698 */:
                tb0 tb0Var = this$0.f;
                String searchNumber = ItemsViewModel.getSearchNumber();
                tb0Var.x(searchNumber != null ? StringsKt__StringsKt.trim((CharSequence) searchNumber).toString() : null);
                break;
        }
        return false;
    }

    public final wa3 D() {
        wa3 wa3Var = this.g;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final void E(String vehicleClass, ImageView imageView) {
        Intrinsics.checkNotNullParameter(vehicleClass, "vehicleClass");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Log.e("Test", vehicleClass);
        if (StringsKt__StringsKt.contains((CharSequence) vehicleClass, (CharSequence) "MCYL", true) || StringsKt__StringsKt.contains((CharSequence) vehicleClass, (CharSequence) "MOTOR CYCLE", true) || StringsKt__StringsKt.contains((CharSequence) vehicleClass, (CharSequence) "M-CYCLE", true) || StringsKt__StringsKt.contains((CharSequence) vehicleClass, (CharSequence) "SCOOTER", true) || StringsKt__StringsKt.contains((CharSequence) vehicleClass, (CharSequence) "MOPED", true)) {
            imageView.setImageResource(R.drawable.scooter);
            return;
        }
        if (StringsKt__StringsKt.contains((CharSequence) vehicleClass, (CharSequence) "THREE WHEELER", true) || StringsKt__StringsKt.contains((CharSequence) vehicleClass, (CharSequence) "Three Wheeler", true) || StringsKt__StringsKt.contains((CharSequence) vehicleClass, (CharSequence) "e-Rickshaw", true)) {
            imageView.setImageResource(R.drawable.auto);
            return;
        }
        if (StringsKt__StringsKt.contains((CharSequence) vehicleClass, (CharSequence) "LMV", true) || StringsKt__StringsKt.contains((CharSequence) vehicleClass, (CharSequence) "MOTOR CAR", true) || StringsKt__StringsKt.contains((CharSequence) vehicleClass, (CharSequence) "MOTOR CAB", true)) {
            imageView.setImageResource(R.drawable.roundcar);
            return;
        }
        if (StringsKt__StringsKt.contains((CharSequence) vehicleClass, (CharSequence) "BUS", true)) {
            imageView.setImageResource(R.drawable.bus);
        } else if (StringsKt__StringsKt.contains((CharSequence) vehicleClass, (CharSequence) "GOODS CARRIER", true) || StringsKt__StringsKt.contains((CharSequence) vehicleClass, (CharSequence) "HEAVY GOODS VEHICLE", true)) {
            imageView.setImageResource(R.drawable.truck);
        } else {
            imageView.setImageResource(R.drawable.roundcar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void p(final a holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.e.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        final RecentSearch recentSearch = (RecentSearch) obj;
        holder.R().setText(recentSearch.getSearchNumber());
        holder.Q().setText(hs1.a.b(recentSearch.getSearchUserName()));
        try {
            E(String.valueOf(recentSearch.getDriverImage()), holder.O());
        } catch (Exception e) {
            e.printStackTrace();
        }
        holder.a.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.z55
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c65.G(this.a, recentSearch, view);
            }
        });
        holder.P().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.a65
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c65.H(this.a, holder, recentSearch, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.rc_recent_search, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    public final void K(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.g = wa3Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        if (this.e.size() < 5) {
            return this.e.size();
        }
        return 5;
    }
}
