package com.zepto;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.nic.mparivahan.APIController;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.DPTNotice.NoticeSearchList;
import com.nic.mparivahan.Echallan.PaymentSearchChallanList;
import com.nic.mparivahan.Echallan.ReprintReceiptActivity;
import com.nic.mparivahan.Echallan.SearchChallanListActivity;
import com.nic.mparivahan.Echallan.SearchPrintChallanListActivity;
import com.nic.mparivahan.Echallan.SearchPrintReceiptListActivity;
import com.nic.mparivahan.Echallan.TranscationStatusActivity;
import com.nic.mparivahan.Echallan.VerifyPaymentChallanList;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.Document;
import com.nic.mparivahan.RC.Model.NrvDetails;
import com.nic.mparivahan.RC.Model.RcModelsDet;
import com.nic.mparivahan.RC.RcInterface.RcService;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.lc5;
import com.zepto.su5;
import com.zepto.z45;
import java.util.ArrayList;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class b31 extends RecyclerView.h {
    public ArrayList d;
    public final Context e;
    public int f;
    public String g;
    public RcService h;
    public DatabaseHelper i;
    public wa3 j;
    public ws6 k;

    public static final class a extends RecyclerView.d0 {
        public final TextView u;
        public final TextView v;
        public final LinearLayout w;
        public final LinearLayout x;
        public ProgressBar y;
        public TextView z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View viewFindViewById = this.a.findViewById(R.id.rc_number);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (TextView) viewFindViewById;
            View viewFindViewById2 = this.a.findViewById(R.id.viewdetails);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (TextView) viewFindViewById2;
            View viewFindViewById3 = this.a.findViewById(R.id.linear_parent);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.w = (LinearLayout) viewFindViewById3;
            View viewFindViewById4 = this.a.findViewById(R.id.delet_icon);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.x = (LinearLayout) viewFindViewById4;
            View viewFindViewById5 = this.a.findViewById(R.id.progress_bar);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.y = (ProgressBar) viewFindViewById5;
            View viewFindViewById6 = this.a.findViewById(R.id.tv_vehicle_no);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            this.z = (TextView) viewFindViewById6;
        }

        public final LinearLayout O() {
            return this.x;
        }

        public final LinearLayout P() {
            return this.w;
        }

        public final TextView Q() {
            return this.u;
        }

        public final TextView R() {
            return this.z;
        }

        public final TextView S() {
            return this.v;
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ String a;
        public final /* synthetic */ b31 b;
        public final /* synthetic */ int c;

        public b(String str, b31 b31Var, int i) {
            this.a = str;
            this.b = b31Var;
            this.c = i;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            Log.e("Error -- >001", String.valueOf(th != null ? th.getMessage() : null));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                su5.a aVar = su5.a;
                String str = this.a;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) RcModelsDet.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                RcModelsDet rcModelsDet = (RcModelsDet) objFromJson;
                if (!StringsKt__StringsJVMKt.equals(rcModelsDet.getStatusCode(), "NP001", true) || this.b.C().U0(StringsKt__StringsKt.trim((CharSequence) ((Document) this.b.d.get(this.c)).getRc()).toString(), rcModelsDet.getNrvDetails()) <= 0) {
                    return;
                }
                this.b.k(this.c);
            } catch (Exception unused) {
            }
        }
    }

    public b31(ArrayList rc_details, Context context, int i, String name) {
        Intrinsics.checkNotNullParameter(rc_details, "rc_details");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        this.d = rc_details;
        this.e = context;
        this.f = i;
        this.g = name;
        this.i = DatabaseHelper.D0(context);
        this.k = new ws6(context);
    }

    public static final void G(b31 this$0, int i, String rc_numer, View view) {
        String strSubstring;
        String rc_eng_no;
        String rc_eng_no2;
        String rc_chasi_no;
        String rc_chasi_no2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rc_numer, "$rc_numer");
        String str = " ";
        try {
            NrvDetails nrvDetails = ((Document) this$0.d.get(i)).getNrvDetails();
            Integer numValueOf = null;
            String strValueOf = String.valueOf(nrvDetails != null ? nrvDetails.getRc_chasi_no() : null);
            NrvDetails nrvDetails2 = ((Document) this$0.d.get(i)).getNrvDetails();
            Integer numValueOf2 = (nrvDetails2 == null || (rc_chasi_no2 = nrvDetails2.getRc_chasi_no()) == null) ? null : Integer.valueOf(rc_chasi_no2.length());
            Intrinsics.checkNotNull(numValueOf2);
            int iIntValue = numValueOf2.intValue() - 5;
            NrvDetails nrvDetails3 = ((Document) this$0.d.get(i)).getNrvDetails();
            Integer numValueOf3 = (nrvDetails3 == null || (rc_chasi_no = nrvDetails3.getRc_chasi_no()) == null) ? null : Integer.valueOf(rc_chasi_no.length());
            Intrinsics.checkNotNull(numValueOf3);
            strSubstring = strValueOf.substring(iIntValue, numValueOf3.intValue());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            try {
                NrvDetails nrvDetails4 = ((Document) this$0.d.get(i)).getNrvDetails();
                String strValueOf2 = String.valueOf(nrvDetails4 != null ? nrvDetails4.getRc_eng_no() : null);
                NrvDetails nrvDetails5 = ((Document) this$0.d.get(i)).getNrvDetails();
                Integer numValueOf4 = (nrvDetails5 == null || (rc_eng_no2 = nrvDetails5.getRc_eng_no()) == null) ? null : Integer.valueOf(rc_eng_no2.length());
                Intrinsics.checkNotNull(numValueOf4);
                int iIntValue2 = numValueOf4.intValue() - 5;
                NrvDetails nrvDetails6 = ((Document) this$0.d.get(i)).getNrvDetails();
                if (nrvDetails6 != null && (rc_eng_no = nrvDetails6.getRc_eng_no()) != null) {
                    numValueOf = Integer.valueOf(rc_eng_no.length());
                }
                Intrinsics.checkNotNull(numValueOf);
                String strSubstring2 = strValueOf2.substring(iIntValue2, numValueOf.intValue());
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                str = strSubstring2;
            } catch (Exception e) {
                e = e;
                e.printStackTrace();
            }
        } catch (Exception e2) {
            e = e2;
            strSubstring = " ";
        }
        if (this$0.f == 1) {
            Intent intent = new Intent(this$0.e, (Class<?>) SearchChallanListActivity.class);
            intent.putExtra("inputengineno", str);
            intent.putExtra("inputchassisno", strSubstring);
            intent.putExtra("inputValue", rc_numer);
            intent.putExtra("inputType", "RC");
            this$0.e.startActivity(intent);
        }
        if (this$0.f == 2) {
            Intent intent2 = new Intent(this$0.e, (Class<?>) SearchPrintReceiptListActivity.class);
            intent2.putExtra("inputengineno", str);
            intent2.putExtra("inputchassisno", strSubstring);
            intent2.putExtra("inputValue", rc_numer);
            intent2.putExtra("inputType", "RC");
            intent2.putExtra("Service_name", this$0.g);
            this$0.e.startActivity(intent2);
        }
        if (this$0.f == 3) {
            Intent intent3 = new Intent(this$0.e, (Class<?>) SearchPrintChallanListActivity.class);
            intent3.putExtra("inputengineno", str);
            intent3.putExtra("inputchassisno", strSubstring);
            intent3.putExtra("inputValue", rc_numer);
            intent3.putExtra("inputType", "RC");
            intent3.putExtra("Service_name", this$0.g);
            this$0.e.startActivity(intent3);
        }
        if (this$0.f == 10) {
            Intent intent4 = new Intent(this$0.e, (Class<?>) PaymentSearchChallanList.class);
            intent4.putExtra("inputengineno", str);
            intent4.putExtra("inputchassisno", strSubstring);
            intent4.putExtra("inputValue", rc_numer);
            intent4.putExtra("inputType", "RC");
            this$0.e.startActivity(intent4);
        }
        if (this$0.f == 11) {
            Intent intent5 = new Intent(this$0.e, (Class<?>) TranscationStatusActivity.class);
            intent5.putExtra("inputengineno", str);
            intent5.putExtra("inputchassisno", strSubstring);
            intent5.putExtra("inputValue", rc_numer);
            intent5.putExtra("inputType", "RC");
            this$0.e.startActivity(intent5);
        }
        if (this$0.f == 12) {
            Intent intent6 = new Intent(this$0.e, (Class<?>) ReprintReceiptActivity.class);
            intent6.putExtra("inputengineno", str);
            intent6.putExtra("inputchassisno", strSubstring);
            intent6.putExtra("inputValue", rc_numer);
            intent6.putExtra("inputType", "RC");
            intent6.putExtra("Service_name", this$0.g);
            this$0.e.startActivity(intent6);
        }
        if (this$0.f == 13) {
            Intent intent7 = new Intent(this$0.e, (Class<?>) VerifyPaymentChallanList.class);
            intent7.putExtra("inputengineno", str);
            intent7.putExtra("inputchassisno", strSubstring);
            intent7.putExtra("inputValue", rc_numer);
            intent7.putExtra("inputType", "RC");
            this$0.e.startActivity(intent7);
        }
        if (this$0.f == 15) {
            Intent intent8 = new Intent(this$0.e, (Class<?>) NoticeSearchList.class);
            intent8.putExtra("inputengineno", str);
            intent8.putExtra("inputchassisno", strSubstring);
            intent8.putExtra("inputValue", rc_numer);
            intent8.putExtra("inputType", "RC");
            this$0.e.startActivity(intent8);
        }
    }

    public final DatabaseHelper C() {
        return this.i;
    }

    public final wa3 D() {
        wa3 wa3Var = this.j;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSess");
        return null;
    }

    public final RcService E() {
        RcService rcService = this.h;
        if (rcService != null) {
            return rcService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcService");
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void p(a holder, final int i) throws Throwable {
        Intrinsics.checkNotNullParameter(holder, "holder");
        try {
            I(new wa3(this.e));
            holder.R().setText(D().b("label_challan_vehicle_no", "Vehicle No"));
            holder.O().setVisibility(8);
            Log.e("Check Value", String.valueOf(this.f));
            if (this.f == 1) {
                holder.S().setText(D().b("label_view_challan", this.e.getString(R.string.show_recent_challan)));
            }
            if (this.f == 2) {
                if (gd1.a.m(this.g)) {
                    holder.S().setText(D().b("label_challan_view_receipt", "View Receipt"));
                } else {
                    holder.S().setText(D().b("View_Payment_Receipt", this.g));
                }
            }
            if (this.f == 3) {
                if (gd1.a.m(this.g)) {
                    holder.S().setText(D().b("label_view_challan", this.e.getString(R.string.show_recent_challan)));
                } else {
                    holder.S().setText(D().b("label_challan_download", this.g));
                }
            }
            if (this.f == 10) {
                holder.S().setText(D().b("label_view_challan", this.e.getString(R.string.show_recent_challan)));
            }
            if (this.f == 11) {
                holder.S().setText(D().b("label_challan_payment_status", "Payment Status"));
            }
            if (this.f == 12) {
                holder.S().setText(D().b("label_challan_reprint_receipt", "Reprint Receipt"));
            }
            if (this.f == 13) {
                holder.S().setText(D().b("label_verify_payment_status", "Verify Payment Status"));
            }
            if (this.f == 15) {
                holder.S().setText("Notice Status");
            }
            final String rc = ((Document) this.d.get(i)).getRc();
            NrvDetails nrvDetailsJ0 = this.i.J0(rc);
            if (rc != null && (true ^ StringsKt__StringsJVMKt.isBlank(rc))) {
                holder.Q().setText(((Document) this.d.get(i)).getRc());
            }
            if (nrvDetailsJ0 != null) {
                nrvDetailsJ0.getRc_owner_name();
                nrvDetailsJ0.getRc_present_address();
                nrvDetailsJ0.getRc_regn_dt();
                nrvDetailsJ0.getRc_fit_upto();
            } else {
                String string = Settings.Secure.getString(this.e.getContentResolver(), "android_id");
                String strC0 = this.i.C0(StringsKt__StringsKt.trim((CharSequence) ((Document) this.d.get(i)).getRc()).toString());
                lc5.a aVar = lc5.Companion;
                ls3 ls3VarB = ls3.g.b("application/json");
                z45.a aVar2 = z45.a;
                String strK = this.k.k();
                Intrinsics.checkNotNull(strC0);
                Intrinsics.checkNotNull(string);
                String string2 = aVar2.e(strK, strC0, string, this.k.l(), this.k.e()).toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                lc5 lc5VarD = aVar.d(ls3VarB, string2);
                J(RcService.INSTANCE.a(this.e));
                String strValueOf = String.valueOf(System.currentTimeMillis());
                E().UpdateVirtualRC(s14.a.u() + APIController.a().VirtualRC(), lc5VarD, strValueOf).enqueue(new b(strValueOf, this, i));
            }
            holder.P().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.a31
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b31.G(this.a, i, rc, view);
                }
            });
        } catch (Exception e) {
            Log.e("Adaptererror", e.toString());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (this.d.size() > 1) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.rc_item_alert_create, parent, false);
            Intrinsics.checkNotNull(viewInflate);
            return new a(viewInflate);
        }
        View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.rc_create1, parent, false);
        Intrinsics.checkNotNull(viewInflate2);
        return new a(viewInflate2);
    }

    public final void I(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.j = wa3Var;
    }

    public final void J(RcService rcService) {
        Intrinsics.checkNotNullParameter(rcService, "<set-?>");
        this.h = rcService;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
