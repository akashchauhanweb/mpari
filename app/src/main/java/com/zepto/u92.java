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
import com.nic.mparivahan.FetchChallanLog.PojoChallan.MparEchallanLog;
import com.nic.mparivahan.FetchVahanLog.FetchVahanViews.ChallantransactionDetails;
import com.nic.mparivahan.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
public final class u92 extends RecyclerView.h {
    public final ArrayList d;
    public final Context e;
    public final ms1 f;

    public static final class a extends RecyclerView.d0 {
        public final TextView u;
        public final TextView v;
        public final ImageView w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View viewFindViewById = this.a.findViewById(R.id.challan_number);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (TextView) viewFindViewById;
            View viewFindViewById2 = this.a.findViewById(R.id.chlln_status);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (TextView) viewFindViewById2;
            View viewFindViewById3 = this.a.findViewById(R.id.option_menu);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.w = (ImageView) viewFindViewById3;
        }

        public final TextView O() {
            return this.u;
        }

        public final TextView P() {
            return this.v;
        }

        public final ImageView Q() {
            return this.w;
        }
    }

    public u92(ArrayList mList, Context mContext, ms1 mDltChllnTransaction) {
        Intrinsics.checkNotNullParameter(mList, "mList");
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mDltChllnTransaction, "mDltChllnTransaction");
        this.d = mList;
        this.e = mContext;
        this.f = mDltChllnTransaction;
    }

    public static final void F(final u92 this$0, final a holder, final wa3 langSession, final MparEchallanLog mModel, final int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(langSession, "$langSession");
        Intrinsics.checkNotNullParameter(mModel, "$mModel");
        PopupMenu popupMenu = new PopupMenu(this$0.e, holder.Q());
        popupMenu.inflate(R.menu.menu_transaction);
        MenuItem menuItemFindItem = popupMenu.getMenu().findItem(R.id.menu2);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem, "findItem(...)");
        MenuItem menuItemFindItem2 = popupMenu.getMenu().findItem(R.id.view);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem2, "findItem(...)");
        MenuItem menuItemFindItem3 = popupMenu.getMenu().findItem(R.id.menu4);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem3, "findItem(...)");
        menuItemFindItem.setTitle(langSession.b("share", "Share"));
        menuItemFindItem2.setTitle(langSession.b("label_view", "View"));
        menuItemFindItem3.setTitle(langSession.b("delete", "Delete"));
        popupMenu.setGravity(8388613);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.zepto.r92
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return u92.G(this.a, mModel, holder, langSession, i, menuItem);
            }
        });
        popupMenu.show();
    }

    public static final boolean G(final u92 this$0, MparEchallanLog mModel, a holder, wa3 langSession, final int i, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mModel, "$mModel");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(langSession, "$langSession");
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu2) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", mModel.getEchlogDocType() + "\nChallan No. : " + ((Object) holder.O().getText()) + "\nChallan Date : " + mModel.getEchlogChallanDate() + "\nReceipt No. : " + mModel.getEchlogReceiptNo() + "\nPayment Date : " + mModel.getEchlogPaymentDate() + "\nChallan Status : " + ((Object) holder.P().getText()) + "\nAmount : " + mModel.getChallanAmt());
                intent.setType("text/plain");
                this$0.e.startActivity(Intent.createChooser(intent, "Share"));
            } catch (Exception unused) {
            }
        } else if (itemId == R.id.menu4) {
            final Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = mModel.getEchlogRecordId();
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
            ((TextView) viewFindViewById4).setText(langSession.b("nex_parivahan", "NextGen mParivahan"));
            ((TextView) viewFindViewById).setText(langSession.b(va3.a.A0(), "Are you sure, You want to delete ?"));
            textView.setText(langSession.b("radio_dl_serv_yes", "Yes"));
            textView2.setText(langSession.b("radio_dl_serv_no", "No"));
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.s92
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    u92.H(dialog, view);
                }
            });
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.t92
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    u92.I(dialog, this$0, intRef, i, view);
                }
            });
            dialog.show();
        } else if (itemId == R.id.view) {
            Intent intent2 = new Intent(this$0.e, (Class<?>) ChallantransactionDetails.class);
            intent2.putExtra("echlogchallannumber", mModel.getEchlogchallannumber());
            intent2.putExtra("echlogDocNumber", mModel.getEchlogDocNumber());
            intent2.putExtra("echlogStateCd", mModel.getEchlogStateCd());
            intent2.putExtra("echlogChallanDate", mModel.getEchlogChallanDate());
            intent2.putExtra("challanAmt", mModel.getChallanAmt());
            intent2.putExtra("echlogChallanStatus", mModel.getEchlogChallanStatus());
            intent2.putExtra("echlogPaymentDate", mModel.getEchlogPaymentDate());
            intent2.putExtra("echlogTransId", mModel.getEchlogTransId());
            intent2.putExtra("echlogReceiptNo", mModel.getEchlogReceiptNo());
            intent2.putExtra("doctype", mModel.getEchlogDocType());
            this$0.e.startActivity(intent2);
        }
        return false;
    }

    public static final void H(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void I(Dialog d, u92 this$0, Ref.IntRef recordId, int i, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(recordId, "$recordId");
        d.dismiss();
        this$0.f.a0(Long.valueOf(recordId.element), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void p(final a holder, final int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final wa3 wa3Var = new wa3(this.e);
        Object obj = this.d.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        final MparEchallanLog mparEchallanLog = (MparEchallanLog) obj;
        holder.O().setText(mparEchallanLog.getEchlogchallannumber());
        if (StringsKt__StringsJVMKt.equals(mparEchallanLog.getEchlogChallanStatus(), "disposed", true)) {
            holder.P().setText(wa3Var.b("tab_btn_challan_disposed", mparEchallanLog.getEchlogChallanStatus().toString()));
        } else {
            holder.P().setText(mparEchallanLog.getEchlogChallanStatus().toString());
        }
        holder.Q().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.q92
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u92.F(this.a, holder, wa3Var, mparEchallanLog, i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.fetch_chlln_transactions, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    public final void K(int i) {
        this.d.remove(i);
        n(i);
        m(i, this.d.size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
