package com.zepto;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dashboard.DashBoardAlertViewDetails;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.Document;
import com.nic.mparivahan.RC.Model.NrvDetails;
import com.nic.mparivahan.RC.Model.RcModelsDet;
import com.nic.mparivahan.RC.RcInterface.RcService;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.su5;
import java.util.ArrayList;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
public final class ln2 extends RecyclerView.h {
    public ArrayList d;
    public final Context e;
    public final uh1 f;
    public final nq6 g;
    public final br6 h;
    public RcService i;
    public DatabaseHelper j;
    public ws6 k;

    public static final class a extends RecyclerView.d0 {
        public AppCompatImageView A;
        public TextView B;
        public final TextView u;
        public final LinearLayout v;
        public final TextView w;
        public ProgressBar x;
        public TextView y;
        public AppCompatImageView z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View viewFindViewById = this.a.findViewById(R.id.vehicle_text_alerts);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (TextView) viewFindViewById;
            View viewFindViewById2 = this.a.findViewById(R.id.insurance_layout);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (LinearLayout) viewFindViewById2;
            View viewFindViewById3 = this.a.findViewById(R.id.expire_insurance);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.w = (TextView) viewFindViewById3;
            View viewFindViewById4 = this.a.findViewById(R.id.progress_bar);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.x = (ProgressBar) viewFindViewById4;
            View viewFindViewById5 = this.a.findViewById(R.id.service_name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.y = (TextView) viewFindViewById5;
            View viewFindViewById6 = this.a.findViewById(R.id.viewmore);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            this.z = (AppCompatImageView) viewFindViewById6;
            View viewFindViewById7 = this.a.findViewById(R.id.refresh);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
            this.A = (AppCompatImageView) viewFindViewById7;
            View viewFindViewById8 = this.a.findViewById(R.id.notify);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
            this.B = (TextView) viewFindViewById8;
        }

        public final TextView O() {
            return this.w;
        }

        public final LinearLayout P() {
            return this.v;
        }

        public final TextView Q() {
            return this.B;
        }

        public final ProgressBar R() {
            return this.x;
        }

        public final AppCompatImageView S() {
            return this.A;
        }

        public final TextView T() {
            return this.y;
        }

        public final TextView U() {
            return this.u;
        }

        public final AppCompatImageView V() {
            return this.z;
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ a a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ ln2 c;
        public final /* synthetic */ int d;

        public b(a aVar, Ref.ObjectRef objectRef, ln2 ln2Var, int i) {
            this.a = aVar;
            this.b = objectRef;
            this.c = ln2Var;
            this.d = i;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.a.R().setVisibility(8);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            this.a.R().setVisibility(8);
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    return;
                }
            } else {
                securityModle = null;
            }
            su5.a aVar = su5.a;
            String str = (String) this.b.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) RcModelsDet.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            RcModelsDet rcModelsDet = (RcModelsDet) objFromJson;
            if (!StringsKt__StringsJVMKt.equals(rcModelsDet.getStatusCode(), "NP001", true) || this.c.E().U0(StringsKt__StringsKt.trim((CharSequence) ((Document) this.c.d.get(this.d)).getRc()).toString(), rcModelsDet.getNrvDetails()) <= 0) {
                return;
            }
            this.c.k(this.d);
        }
    }

    public ln2(ArrayList rc_details, Context context, uh1 deletMyRcRcDeletListner, nq6 updateDashboardRc, br6 updte) {
        Intrinsics.checkNotNullParameter(rc_details, "rc_details");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deletMyRcRcDeletListner, "deletMyRcRcDeletListner");
        Intrinsics.checkNotNullParameter(updateDashboardRc, "updateDashboardRc");
        Intrinsics.checkNotNullParameter(updte, "updte");
        this.d = rc_details;
        this.e = context;
        this.f = deletMyRcRcDeletListner;
        this.g = updateDashboardRc;
        this.h = updte;
        this.j = DatabaseHelper.D0(context);
        this.k = new ws6(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void H(ln2 this$0, Ref.ObjectRef rc_details_db, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rc_details_db, "$rc_details_db");
        Intent intent = new Intent(this$0.e, (Class<?>) DashBoardAlertViewDetails.class);
        NrvDetails nrvDetails = (NrvDetails) rc_details_db.element;
        intent.putExtra("RcNumber", nrvDetails != null ? nrvDetails.getRc_regn_no() : null);
        this$0.e.startActivity(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void I(a holder, ln2 this$0, Ref.ObjectRef rc_details_db, int i, View view) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rc_details_db, "$rc_details_db");
        holder.R().setVisibility(0);
        br6 br6Var = this$0.h;
        NrvDetails nrvDetails = (NrvDetails) rc_details_db.element;
        br6Var.f(String.valueOf(nrvDetails != null ? nrvDetails.getRc_regn_no() : null), Integer.valueOf(i));
    }

    public final void D(String change_color, TextView textView) {
        Intrinsics.checkNotNullParameter(change_color, "change_color");
        Intrinsics.checkNotNullParameter(textView, "textView");
        if (StringsKt__StringsKt.contains((CharSequence) change_color, (CharSequence) "Expired", true) || StringsKt__StringsKt.contains((CharSequence) change_color, (CharSequence) "पर समाप्त", true)) {
            textView.setTextColor(yy0.c(this.e, R.color.danger));
        }
        if (StringsKt__StringsKt.contains((CharSequence) change_color, (CharSequence) "Expiring", true)) {
            textView.setTextColor(yy0.c(this.e, R.color.vehicle_fit));
        }
    }

    public final DatabaseHelper E() {
        return this.j;
    }

    public final RcService F() {
        RcService rcService = this.i;
        if (rcService != null) {
            return rcService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcService");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01c2 A[Catch: Exception -> 0x010a, TryCatch #0 {Exception -> 0x010a, blocks: (B:3:0x0005, B:6:0x004d, B:9:0x010d, B:11:0x0131, B:13:0x0137, B:15:0x0144, B:17:0x014a, B:20:0x015a, B:22:0x0160, B:24:0x0166, B:26:0x0170, B:28:0x0197, B:29:0x019b, B:31:0x01a9, B:109:0x0391, B:32:0x01b2, B:33:0x01c2, B:35:0x01c8, B:37:0x01ce, B:39:0x01d8, B:41:0x01de, B:43:0x01e4, B:45:0x01ee, B:47:0x01f6, B:48:0x01fa, B:50:0x0220, B:51:0x0229, B:52:0x0239, B:54:0x023f, B:56:0x0245, B:58:0x024f, B:60:0x0255, B:62:0x025b, B:64:0x0265, B:66:0x0285, B:67:0x0289, B:69:0x0297, B:70:0x02a0, B:71:0x02b0, B:73:0x02b6, B:75:0x02bc, B:77:0x02c6, B:79:0x02cc, B:81:0x02d2, B:83:0x02dc, B:85:0x02f2, B:86:0x02f6, B:88:0x0304, B:89:0x030d, B:90:0x031d, B:92:0x0323, B:94:0x0329, B:96:0x0333, B:98:0x0339, B:100:0x033f, B:102:0x0349, B:104:0x0369, B:105:0x036d, B:107:0x037b, B:108:0x0383), top: B:113:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0239 A[Catch: Exception -> 0x010a, TryCatch #0 {Exception -> 0x010a, blocks: (B:3:0x0005, B:6:0x004d, B:9:0x010d, B:11:0x0131, B:13:0x0137, B:15:0x0144, B:17:0x014a, B:20:0x015a, B:22:0x0160, B:24:0x0166, B:26:0x0170, B:28:0x0197, B:29:0x019b, B:31:0x01a9, B:109:0x0391, B:32:0x01b2, B:33:0x01c2, B:35:0x01c8, B:37:0x01ce, B:39:0x01d8, B:41:0x01de, B:43:0x01e4, B:45:0x01ee, B:47:0x01f6, B:48:0x01fa, B:50:0x0220, B:51:0x0229, B:52:0x0239, B:54:0x023f, B:56:0x0245, B:58:0x024f, B:60:0x0255, B:62:0x025b, B:64:0x0265, B:66:0x0285, B:67:0x0289, B:69:0x0297, B:70:0x02a0, B:71:0x02b0, B:73:0x02b6, B:75:0x02bc, B:77:0x02c6, B:79:0x02cc, B:81:0x02d2, B:83:0x02dc, B:85:0x02f2, B:86:0x02f6, B:88:0x0304, B:89:0x030d, B:90:0x031d, B:92:0x0323, B:94:0x0329, B:96:0x0333, B:98:0x0339, B:100:0x033f, B:102:0x0349, B:104:0x0369, B:105:0x036d, B:107:0x037b, B:108:0x0383), top: B:113:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02b0 A[Catch: Exception -> 0x010a, TryCatch #0 {Exception -> 0x010a, blocks: (B:3:0x0005, B:6:0x004d, B:9:0x010d, B:11:0x0131, B:13:0x0137, B:15:0x0144, B:17:0x014a, B:20:0x015a, B:22:0x0160, B:24:0x0166, B:26:0x0170, B:28:0x0197, B:29:0x019b, B:31:0x01a9, B:109:0x0391, B:32:0x01b2, B:33:0x01c2, B:35:0x01c8, B:37:0x01ce, B:39:0x01d8, B:41:0x01de, B:43:0x01e4, B:45:0x01ee, B:47:0x01f6, B:48:0x01fa, B:50:0x0220, B:51:0x0229, B:52:0x0239, B:54:0x023f, B:56:0x0245, B:58:0x024f, B:60:0x0255, B:62:0x025b, B:64:0x0265, B:66:0x0285, B:67:0x0289, B:69:0x0297, B:70:0x02a0, B:71:0x02b0, B:73:0x02b6, B:75:0x02bc, B:77:0x02c6, B:79:0x02cc, B:81:0x02d2, B:83:0x02dc, B:85:0x02f2, B:86:0x02f6, B:88:0x0304, B:89:0x030d, B:90:0x031d, B:92:0x0323, B:94:0x0329, B:96:0x0333, B:98:0x0339, B:100:0x033f, B:102:0x0349, B:104:0x0369, B:105:0x036d, B:107:0x037b, B:108:0x0383), top: B:113:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x031d A[Catch: Exception -> 0x010a, TryCatch #0 {Exception -> 0x010a, blocks: (B:3:0x0005, B:6:0x004d, B:9:0x010d, B:11:0x0131, B:13:0x0137, B:15:0x0144, B:17:0x014a, B:20:0x015a, B:22:0x0160, B:24:0x0166, B:26:0x0170, B:28:0x0197, B:29:0x019b, B:31:0x01a9, B:109:0x0391, B:32:0x01b2, B:33:0x01c2, B:35:0x01c8, B:37:0x01ce, B:39:0x01d8, B:41:0x01de, B:43:0x01e4, B:45:0x01ee, B:47:0x01f6, B:48:0x01fa, B:50:0x0220, B:51:0x0229, B:52:0x0239, B:54:0x023f, B:56:0x0245, B:58:0x024f, B:60:0x0255, B:62:0x025b, B:64:0x0265, B:66:0x0285, B:67:0x0289, B:69:0x0297, B:70:0x02a0, B:71:0x02b0, B:73:0x02b6, B:75:0x02bc, B:77:0x02c6, B:79:0x02cc, B:81:0x02d2, B:83:0x02dc, B:85:0x02f2, B:86:0x02f6, B:88:0x0304, B:89:0x030d, B:90:0x031d, B:92:0x0323, B:94:0x0329, B:96:0x0333, B:98:0x0339, B:100:0x033f, B:102:0x0349, B:104:0x0369, B:105:0x036d, B:107:0x037b, B:108:0x0383), top: B:113:0x0005 }] */
    /* JADX WARN: Type inference failed for: r2v120, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, com.nic.mparivahan.RC.Model.NrvDetails] */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p(final com.zepto.ln2.a r11, final int r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.ln2.p(com.zepto.ln2$a, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (this.d.size() > 1) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_alerts, parent, false);
            Intrinsics.checkNotNull(viewInflate);
            return new a(viewInflate);
        }
        if (this.j.z0() != null) {
            View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_alerts, parent, false);
            Intrinsics.checkNotNull(viewInflate2);
            return new a(viewInflate2);
        }
        View viewInflate3 = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_alert_single, parent, false);
        Intrinsics.checkNotNull(viewInflate3);
        return new a(viewInflate3);
    }

    public final void K(RcService rcService) {
        Intrinsics.checkNotNullParameter(rcService, "<set-?>");
        this.i = rcService;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
