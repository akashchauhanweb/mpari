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
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.FetchVahanLog.FetchVahanViews.DrivingLicenceTransactionDetails;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sarathithreeservices.view.ApplicationDetailsActivity;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.fetchSarathiLog.FetchSarthiPojo.SarathiLog;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class da2 extends RecyclerView.h {
    public final ArrayList d;
    public final Context e;
    public final os1 f;

    public static final class a extends RecyclerView.d0 {
        public final TextView A;
        public final LinearLayout B;
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
            this.B = (LinearLayout) viewFindViewById8;
            View viewFindViewById9 = this.a.findViewById(R.id.challan_number);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
            this.C = (TextView) viewFindViewById9;
            View viewFindViewById10 = this.a.findViewById(R.id.chlln_status);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
            this.D = (TextView) viewFindViewById10;
        }

        public final TextView O() {
            return this.C;
        }

        public final TextView P() {
            return this.D;
        }

        public final LinearLayout Q() {
            return this.B;
        }

        public final TextView R() {
            return this.y;
        }

        public final TextView S() {
            return this.w;
        }

        public final TextView T() {
            return this.v;
        }

        public final TextView U() {
            return this.u;
        }

        public final TextView V() {
            return this.z;
        }

        public final TextView W() {
            return this.A;
        }

        public final TextView X() {
            return this.x;
        }
    }

    public da2(ArrayList mList, Context mContext, os1 mDltSarInterface) {
        Intrinsics.checkNotNullParameter(mList, "mList");
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mDltSarInterface, "mDltSarInterface");
        this.d = mList;
        this.e = mContext;
        this.f = mDltSarInterface;
    }

    public static final void G(final da2 this$0, final a holder, final wa3 langSession, final SarathiLog mModel, final int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(langSession, "$langSession");
        Intrinsics.checkNotNullParameter(mModel, "$mModel");
        PopupMenu popupMenu = new PopupMenu(this$0.e, holder.Q());
        popupMenu.inflate(R.menu.menu_sar_tran);
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
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.zepto.aa2
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return da2.H(this.a, holder, mModel, langSession, i, menuItem);
            }
        });
        popupMenu.show();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final boolean H(final da2 this$0, a holder, SarathiLog mModel, wa3 langSession, final int i, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(mModel, "$mModel");
        Intrinsics.checkNotNullParameter(langSession, "$langSession");
        switch (menuItem.getItemId()) {
            case R.id.menu2 /* 2131363698 */:
                Intent intent = new Intent("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", ((Object) holder.U().getText()) + "\nApplication No. : " + ((Object) holder.T().getText()) + "\nApplication Date : " + ((Object) holder.S().getText()) + "\nTransaction Name : " + ((Object) holder.W().getText()));
                intent.setType("text/plain");
                this$0.e.startActivity(Intent.createChooser(intent, "Share"));
                return false;
            case R.id.menu4 /* 2131363700 */:
                final Ref.IntRef intRef = new Ref.IntRef();
                intRef.element = mModel.getSarlogRecordId();
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
                textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ba2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        da2.I(dialog, view);
                    }
                });
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ca2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        da2.J(dialog, this$0, intRef, i, view);
                    }
                });
                dialog.show();
                return false;
            case R.id.status /* 2131364812 */:
                Intent intent2 = new Intent(this$0.e, (Class<?>) ApplicationDetailsActivity.class);
                intent2.putExtra("app_no", holder.T().getText());
                intent2.putExtra("dob", mModel.getSarlogDlDob());
                intent2.putExtra("statusAdapter", VContant.MAINSCREEN);
                wl5 wl5Var = new wl5(this$0.e);
                String strB = langSession.b("label_application_status", "Application Status");
                Intrinsics.checkNotNull(strB);
                wl5Var.t(strB, VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE);
                this$0.e.startActivity(intent2);
                return false;
            case R.id.view /* 2131365824 */:
                try {
                    Intent intent3 = new Intent(this$0.e, (Class<?>) DrivingLicenceTransactionDetails.class);
                    intent3.putExtra("ApplicationNo", holder.T().getText());
                    intent3.putExtra("ApplicationDate", holder.S().getText());
                    intent3.putExtra("ReceiptNo", holder.X().getText());
                    intent3.putExtra("ReceiptDate", holder.V().getText());
                    intent3.putExtra("TransactionName", holder.W().getText());
                    intent3.putExtra("Amount", holder.R().getText());
                    intent3.putExtra("sarlogDlNumber", mModel.getSarlogDlNumber());
                    String sarlogFeeDate = mModel.getSarlogFeeDate();
                    if (sarlogFeeDate == null || sarlogFeeDate.length() == 0) {
                        intent3.putExtra("sarlogFeeDate", "NA");
                    } else {
                        intent3.putExtra("sarlogFeeDate", mModel.getSarlogFeeDate());
                    }
                    this$0.e.startActivity(intent3);
                    break;
                } catch (Exception unused) {
                }
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

    public static final void J(Dialog d, da2 this$0, Ref.IntRef recordId, int i, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(recordId, "$recordId");
        d.dismiss();
        this$0.f.E(Integer.valueOf(recordId.element), i);
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
            final SarathiLog sarathiLog = (SarathiLog) obj;
            holder.U().setText("DL No. : " + sarathiLog.getSarlogDlNumber());
            final wa3 wa3Var = new wa3(this.e);
            holder.V().setText("NA");
            if (sarathiLog.getSarlogApplDate() == null || sarathiLog.getSarlogApplDate().length() == 0) {
                holder.S().setText("NA");
            } else {
                holder.S().setText(E(sarathiLog.getSarlogApplDate()));
            }
            holder.T().setText(String.valueOf(sarathiLog.getSarlogApplNo()));
            holder.X().setText("NA");
            if (sarathiLog.getSarlogFeeAmt() == null) {
                holder.R().setText("NA");
            } else {
                holder.R().setText(sarathiLog.getSarlogFeeAmt().toString());
            }
            if (sarathiLog.getSarlogPurCd() == 515) {
                holder.W().setText(wa3Var.b("check_dl_serv_change_addr", "Change of Address in DL"));
            } else if (sarathiLog.getSarlogPurCd() == 516) {
                holder.W().setText(wa3Var.b("check_dl_serv_replacement_dl", "Replacement of DL"));
            } else if (sarathiLog.getSarlogPurCd() == 523) {
                holder.W().setText(wa3Var.b("check_dl_serv_extract_dl", "DL Extract"));
            } else if (sarathiLog.getSarlogPurCd() == 513) {
                holder.W().setText(wa3Var.b("check_dl_serv_change_addr", "Issue of Duplicate DL"));
            } else if (sarathiLog.getSarlogPurCd() == 514) {
                holder.W().setText(wa3Var.b("check_dl_serv_renewal_dl", "Renewal of DL"));
            } else if (sarathiLog.getSarlogPurCd() == 525) {
                holder.W().setText(wa3Var.b("check_dl_serv_intern_dl_perm", "International Driving Permit"));
            } else if (sarathiLog.getSarlogPurCd() == 513) {
                holder.W().setText(wa3Var.b("check_dl_serv_dupl_dl", "Issue of Dulicate DL"));
            } else {
                holder.W().setText("NA");
            }
            holder.O().setText(StringsKt__StringsKt.trim((CharSequence) sarathiLog.getSarlogDlNumber()).toString());
            holder.P().setText(holder.W().getText());
            holder.Q().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.z92
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    da2.G(this.a, holder, wa3Var, sarathiLog, i, view);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.fetch_sarathi_adapter, parent, false);
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
