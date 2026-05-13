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
import com.nic.mparivahan.FetchVahanLog.FetchVahanViews.VehicleTransactionDetails;
import com.nic.mparivahan.FetchVahanLog.Pojo.VahanLog;
import com.nic.mparivahan.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class ja2 extends RecyclerView.h {
    public final ArrayList d;
    public final Context e;
    public final ps1 f;

    public static final class a extends RecyclerView.d0 {
        public final TextView A;
        public final ImageView B;
        public final TextView C;
        public final TextView D;
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
            View viewFindViewById = this.a.findViewById(R.id.vahan_number);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (TextView) viewFindViewById;
            View viewFindViewById2 = this.a.findViewById(R.id.vahan_app_no);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (TextView) viewFindViewById2;
            View viewFindViewById3 = this.a.findViewById(R.id.vahan_app_date);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.w = (TextView) viewFindViewById3;
            View viewFindViewById4 = this.a.findViewById(R.id.vahan_rcpt_no);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.x = (TextView) viewFindViewById4;
            View viewFindViewById5 = this.a.findViewById(R.id.vahan_amount);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.y = (TextView) viewFindViewById5;
            View viewFindViewById6 = this.a.findViewById(R.id.vahan_rcp_date);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            this.z = (TextView) viewFindViewById6;
            View viewFindViewById7 = this.a.findViewById(R.id.vahan_rcp_tm);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
            this.A = (TextView) viewFindViewById7;
            View viewFindViewById8 = this.a.findViewById(R.id.vahan_option_menu);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
            this.B = (ImageView) viewFindViewById8;
            View viewFindViewById9 = this.a.findViewById(R.id.vehiclenumner);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
            this.C = (TextView) viewFindViewById9;
            View viewFindViewById10 = this.a.findViewById(R.id.issue);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
            this.D = (TextView) viewFindViewById10;
        }

        public final TextView O() {
            return this.D;
        }

        public final ImageView P() {
            return this.B;
        }

        public final TextView Q() {
            return this.y;
        }

        public final TextView R() {
            return this.w;
        }

        public final TextView S() {
            return this.v;
        }

        public final TextView T() {
            return this.u;
        }

        public final TextView U() {
            return this.z;
        }

        public final TextView V() {
            return this.A;
        }

        public final TextView W() {
            return this.x;
        }

        public final TextView X() {
            return this.C;
        }
    }

    public ja2(ArrayList mList, Context mContext, ps1 mDltVhnTrans) {
        Intrinsics.checkNotNullParameter(mList, "mList");
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mDltVhnTrans, "mDltVhnTrans");
        this.d = mList;
        this.e = mContext;
        this.f = mDltVhnTrans;
    }

    public static final void G(final ja2 this$0, final a holder, final wa3 langSession, final VahanLog mModel, final int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(langSession, "$langSession");
        Intrinsics.checkNotNullParameter(mModel, "$mModel");
        PopupMenu popupMenu = new PopupMenu(this$0.e, holder.P());
        popupMenu.inflate(R.menu.vahan_log_menu);
        MenuItem menuItemFindItem = popupMenu.getMenu().findItem(R.id.status);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem, "findItem(...)");
        MenuItem menuItemFindItem2 = popupMenu.getMenu().findItem(R.id.view);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem2, "findItem(...)");
        MenuItem menuItemFindItem3 = popupMenu.getMenu().findItem(R.id.menu2);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem3, "findItem(...)");
        MenuItem menuItemFindItem4 = popupMenu.getMenu().findItem(R.id.menu4);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem4, "findItem(...)");
        menuItemFindItem.setTitle(langSession.b("btn_challan_status", "Status"));
        menuItemFindItem2.setTitle(langSession.b("label_view", "View"));
        menuItemFindItem3.setTitle(langSession.b("label_share", "Share"));
        menuItemFindItem4.setTitle(langSession.b("delete", "Delete"));
        popupMenu.setGravity(8388613);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.zepto.ga2
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return ja2.H(this.a, mModel, holder, langSession, i, menuItem);
            }
        });
        popupMenu.show();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final boolean H(final ja2 this$0, VahanLog mModel, a holder, wa3 langSession, final int i, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mModel, "$mModel");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(langSession, "$langSession");
        switch (menuItem.getItemId()) {
            case R.id.menu2 /* 2131363698 */:
                Intent intent = new Intent("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", ((Object) holder.T().getText()) + "\nApplication No. : " + ((Object) holder.S().getText()) + "\nApplication Date : " + ((Object) holder.R().getText()) + "\nReceipt No. : " + ((Object) holder.W().getText()) + "\nReceipt Date : " + ((Object) holder.U().getText()) + "\nTransaction Name : " + ((Object) holder.V().getText()) + "\nAmount : " + ((Object) holder.Q().getText()));
                intent.setType("text/plain");
                this$0.e.startActivity(Intent.createChooser(intent, "Share"));
                return false;
            case R.id.menu4 /* 2131363700 */:
                final Ref.IntRef intRef = new Ref.IntRef();
                intRef.element = mModel.getVahlogRecordId();
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
                ((TextView) viewFindViewById).setText(langSession.b(va3.a.A0(), "Are you sure, You want to delete ?"));
                textView.setText(langSession.b("radio_dl_serv_yes", "Yes"));
                textView2.setText(langSession.b("radio_dl_serv_no", "No"));
                ((TextView) viewFindViewById4).setText(langSession.b("nex_parivahan", "NextGen mParivahan"));
                textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ha2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ja2.I(dialog, view);
                    }
                });
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ia2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ja2.J(dialog, this$0, intRef, i, view);
                    }
                });
                dialog.show();
                return false;
            case R.id.status /* 2131364812 */:
                ps1 ps1Var = this$0.f;
                String string = mModel.getVahlogApplNo().toString();
                String strSubstring = mModel.getVahlogApplNo().toString().substring(0, 2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                ps1Var.Z(string, strSubstring);
                return false;
            case R.id.view /* 2131365824 */:
                Intent intent2 = new Intent(this$0.e, (Class<?>) VehicleTransactionDetails.class);
                intent2.putExtra("vehicleno", mModel.getVahlogRcNumber());
                intent2.putExtra("ApplicationNo", mModel.getVahlogApplNo());
                intent2.putExtra("ApplicationDate", holder.R().getText());
                intent2.putExtra("ReceiptNo", holder.W().getText());
                intent2.putExtra("ReceiptDate", holder.U().getText());
                intent2.putExtra("TransactionName", holder.V().getText());
                intent2.putExtra("Amount", holder.Q().getText());
                this$0.e.startActivity(intent2);
                return false;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void J(Dialog d, ja2 this$0, Ref.IntRef recordId, int i, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(recordId, "$recordId");
        d.dismiss();
        this$0.f.D(Integer.valueOf(recordId.element), i);
    }

    public final String E(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, yyyy hh:mm:ss");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date date = simpleDateFormat.parse(str);
            Intrinsics.checkNotNullExpressionValue(date, "parse(...)");
            return simpleDateFormat2.format(date);
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void p(final a holder, final int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        try {
            Object obj = this.d.get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            final VahanLog vahanLog = (VahanLog) obj;
            final wa3 wa3Var = new wa3(this.e);
            holder.T().setText("Vehicle No. : " + vahanLog.getVahlogRcNumber());
            if (vahanLog.getVahlogReptDate() == null || StringsKt__StringsKt.trim((CharSequence) vahanLog.getVahlogReptDate()).toString().length() == 0) {
                holder.U().setText("NA");
            } else {
                holder.U().setText(E(vahanLog.getVahlogReptDate()));
            }
            if (vahanLog.getVahlogApplDate() == null || StringsKt__StringsKt.trim((CharSequence) vahanLog.getVahlogApplDate()).toString().length() == 0) {
                holder.R().setText("NA");
            } else {
                holder.R().setText(E(vahanLog.getVahlogApplDate()));
            }
            holder.S().setText(vahanLog.getVahlogRcNumber());
            if (vahanLog.getVahlogReptNo() == null || StringsKt__StringsKt.trim((CharSequence) vahanLog.getVahlogReptNo()).toString().length() == 0) {
                holder.W().setText("NA");
            } else {
                holder.W().setText(vahanLog.getVahlogReptNo());
            }
            if (vahanLog.getVahlogFeeAmt() == null) {
                holder.Q().setText("NA");
            } else {
                holder.Q().setText(vahanLog.getVahlogFeeAmt());
            }
            if (vahanLog.getVahlogPurCd() == 3) {
                holder.V().setText(wa3Var.b("issue_of_duplicate_rc", "Issue of Duplicate RC"));
            } else if (vahanLog.getVahlogPurCd() == 4) {
                holder.V().setText(wa3Var.b("change_of_address_in_rc2", "Change of Address in RC"));
            } else if (vahanLog.getVahlogPurCd() == 6) {
                holder.V().setText(wa3Var.b("hypothecation_addition", "Hypothecation Addition"));
            } else if (vahanLog.getVahlogPurCd() == 7) {
                holder.V().setText(wa3Var.b("hypothecation_termination", "Hypothecation Termination"));
            } else if (vahanLog.getVahlogPurCd() == 8) {
                holder.V().setText(wa3Var.b("hypothecation_continuation", "Hypothecation Continuation"));
            } else if (vahanLog.getVahlogPurCd() == 9) {
                holder.V().setText(wa3Var.b("issue_of_noc", "Issue of NOC"));
            } else if (vahanLog.getVahlogPurCd() == 13) {
                holder.V().setText(wa3Var.b("rc_perticular", "RC Particulars"));
            } else if (vahanLog.getVahlogPurCd() == 102) {
                holder.V().setText(wa3Var.b("label_dispose_applicationl", "Dispose Application"));
            } else {
                holder.V().setText("NA");
            }
            holder.X().setText(vahanLog.getVahlogRcNumber());
            holder.O().setText(holder.V().getText().toString());
            holder.P().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fa2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ja2.G(this.a, holder, wa3Var, vahanLog, i, view);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.vahan_log_adapter, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    public final void L(int i) {
        this.d.remove(i);
        n(i);
        m(i, this.d.size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
