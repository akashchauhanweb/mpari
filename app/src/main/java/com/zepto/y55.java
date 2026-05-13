package com.zepto;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
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
import de.hdodenhof.circleimageview.CircleImageView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y55 extends RecyclerView.h {
    public final Context d;
    public final ArrayList e;
    public final d65 f;
    public wa3 g;

    public static final class a extends RecyclerView.d0 {
        public final CircleImageView u;
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
            this.u = (CircleImageView) viewFindViewById;
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

        public final CircleImageView O() {
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

    public y55(Context context, ArrayList mList, d65 mRecentSearchInterface) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mList, "mList");
        Intrinsics.checkNotNullParameter(mRecentSearchInterface, "mRecentSearchInterface");
        this.d = context;
        this.e = mList;
        this.f = mRecentSearchInterface;
    }

    public static final void G(View view) {
    }

    public static final void H(final y55 this$0, a holder, final RecentSearch ItemsViewModel, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(ItemsViewModel, "$ItemsViewModel");
        PopupMenu popupMenu = new PopupMenu(this$0.d, holder.P());
        popupMenu.inflate(R.menu.recent_dl_menu);
        MenuItem menuItemFindItem = popupMenu.getMenu().findItem(R.id.menu1);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem, "findItem(...)");
        MenuItem menuItemFindItem2 = popupMenu.getMenu().findItem(R.id.menu2);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem2, "findItem(...)");
        this$0.K(new wa3(this$0.d));
        menuItemFindItem.setTitle(this$0.E().b("label_view", "View"));
        menuItemFindItem2.setTitle(this$0.E().b("delete", "Delete"));
        popupMenu.setGravity(8388613);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.zepto.x55
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return y55.I(this.a, ItemsViewModel, menuItem);
            }
        });
        popupMenu.show();
    }

    public static final boolean I(y55 this$0, RecentSearch ItemsViewModel, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(ItemsViewModel, "$ItemsViewModel");
        switch (menuItem.getItemId()) {
            case R.id.menu1 /* 2131363697 */:
                this$0.f.u(ItemsViewModel.getSearchNumber());
                break;
            case R.id.menu2 /* 2131363698 */:
                this$0.f.I(ItemsViewModel.getSearchNumber());
                break;
        }
        return false;
    }

    public final Bitmap D(String str) {
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final wa3 E() {
        wa3 wa3Var = this.g;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
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
        String driverImage = recentSearch.getDriverImage();
        if (driverImage == null || driverImage.length() == 0) {
            holder.O().setImageResource(R.drawable.calendar);
        } else {
            holder.O().setImageBitmap(D(recentSearch.getDriverImage()));
        }
        holder.a.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.v55
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y55.G(view);
            }
        });
        holder.P().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.w55
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y55.H(this.a, holder, recentSearch, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.recent_dl_search_item, parent, false);
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
