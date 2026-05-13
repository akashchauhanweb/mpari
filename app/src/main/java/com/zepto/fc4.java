package com.zepto;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.PushNoti.Pojo.Notification;
import com.nic.mparivahan.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes2.dex */
public final class fc4 extends RecyclerView.h {
    public final ArrayList d;
    public final Context e;
    public final ns1 f;
    public wa3 g;

    public static final class a extends RecyclerView.d0 {
        public final TextView u;
        public final TextView v;
        public final ImageView w;
        public final TextView x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View viewFindViewById = this.a.findViewById(R.id.not_text);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (TextView) viewFindViewById;
            View viewFindViewById2 = this.a.findViewById(R.id.not_date);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (TextView) viewFindViewById2;
            View viewFindViewById3 = this.a.findViewById(R.id.dlt_not);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.w = (ImageView) viewFindViewById3;
            View viewFindViewById4 = this.a.findViewById(R.id.title);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.x = (TextView) viewFindViewById4;
        }

        public final ImageView O() {
            return this.w;
        }

        public final TextView P() {
            return this.v;
        }

        public final TextView Q() {
            return this.u;
        }

        public final TextView R() {
            return this.x;
        }
    }

    public fc4(ArrayList mList, Context mContext, ns1 mDltNotInterface) {
        Intrinsics.checkNotNullParameter(mList, "mList");
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mDltNotInterface, "mDltNotInterface");
        this.d = mList;
        this.e = mContext;
        this.f = mDltNotInterface;
    }

    public static final void H(final fc4 this$0, final a holder, final Notification mModel, final int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(mModel, "$mModel");
        PopupMenu popupMenu = new PopupMenu(this$0.e, holder.O());
        popupMenu.inflate(R.menu.menu_tran_notifi);
        popupMenu.setGravity(8388613);
        MenuItem menuItemFindItem = popupMenu.getMenu().findItem(R.id.menu2);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem, "findItem(...)");
        MenuItem menuItemFindItem2 = popupMenu.getMenu().findItem(R.id.menu4);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem2, "findItem(...)");
        menuItemFindItem.setTitle(this$0.F().b("share", "Share"));
        menuItemFindItem2.setTitle(this$0.F().b("delete", "Delete"));
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.zepto.cc4
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return fc4.I(holder, this$0, mModel, i, menuItem);
            }
        });
        popupMenu.show();
    }

    public static final boolean I(a holder, final fc4 this$0, Notification mModel, final int i, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mModel, "$mModel");
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu2) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", holder.Q().getText().toString());
            intent.setType("text/plain");
            this$0.e.startActivity(Intent.createChooser(intent, "Share"));
        } else if (itemId == R.id.menu4) {
            final Ref.LongRef longRef = new Ref.LongRef();
            longRef.element = mModel.getPshnotId();
            Context context = this$0.e;
            Intrinsics.checkNotNull(context);
            final Dialog dialog = new Dialog(context);
            dialog.setContentView(R.layout.confirmation_dialog);
            Window window = dialog.getWindow();
            Intrinsics.checkNotNull(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
            View viewFindViewById2 = dialog.findViewById(R.id.pop_up_proceed);
            Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) viewFindViewById2;
            View viewFindViewById3 = dialog.findViewById(R.id.pop_up_cancel);
            Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView2 = (TextView) viewFindViewById3;
            View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
            Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
            textView2.setText(this$0.F().b("vahan_btn_cancel", "Cancel"));
            textView.setText(this$0.F().b("button_proceed", "Proceed"));
            ((TextView) viewFindViewById4).setText(this$0.F().b("nex_parivahan", "NextGen mParivahan"));
            ((TextView) viewFindViewById).setText(this$0.F().b(va3.a.A0(), "Are you sure, You want to delete ?"));
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dc4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fc4.J(dialog, view);
                }
            });
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ec4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fc4.K(dialog, this$0, longRef, i, view);
                }
            });
            dialog.show();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void K(Dialog d, fc4 this$0, Ref.LongRef recordId, int i, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(recordId, "$recordId");
        try {
            d.dismiss();
            this$0.f.F(recordId.element, i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final String E(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, yyyy hh:mm:ss");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy hh:mm");
        try {
            Date date = simpleDateFormat.parse(str);
            Intrinsics.checkNotNullExpressionValue(date, "parse(...)");
            return simpleDateFormat2.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final wa3 F() {
        wa3 wa3Var = this.g;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(final a holder, final int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.d.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        final Notification notification = (Notification) obj;
        try {
            N(new wa3(this.e));
            holder.Q().setText(notification.getPshnotTmplt().toString());
            if (!gd1.a.m(notification.getPshnotType())) {
                holder.R().setText(notification.getPshnotType());
            }
            if (notification.getPshnotSentAt().length() != 0) {
                if (notification.getPshnotSentAt().length() > 0) {
                    holder.P().setText(E(notification.getPshnotSentAt()));
                } else {
                    holder.P().setText("NA");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        holder.O().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bc4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fc4.H(this.a, holder, notification, i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.not_adapter, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    public final void M(int i) {
        this.d.remove(i);
        n(i);
        m(i, this.d.size());
    }

    public final void N(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.g = wa3Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
