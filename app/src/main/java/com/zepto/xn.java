package com.zepto;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
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

/* JADX INFO: loaded from: classes2.dex */
public final class xn extends RecyclerView.h {
    public ArrayList d;
    public final Context e;
    public RcService f;
    public DatabaseHelper g;
    public ws6 h;

    public static final class a extends RecyclerView.d0 {
        public final TextView u;
        public final LinearLayout v;
        public final TextView w;
        public ProgressBar x;
        public TextView y;
        public TextView z;

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
            this.z = (TextView) viewFindViewById6;
        }

        public final TextView O() {
            return this.w;
        }

        public final LinearLayout P() {
            return this.v;
        }

        public final ProgressBar Q() {
            return this.x;
        }

        public final TextView R() {
            return this.y;
        }

        public final TextView S() {
            return this.u;
        }

        public final TextView T() {
            return this.z;
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ a a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ xn c;
        public final /* synthetic */ int d;

        public b(a aVar, Ref.ObjectRef objectRef, xn xnVar, int i) {
            this.a = aVar;
            this.b = objectRef;
            this.c = xnVar;
            this.d = i;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.a.Q().setVisibility(8);
            Log.e("Error -- >001", String.valueOf(th != null ? th.getMessage() : null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            this.a.Q().setVisibility(8);
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
            if (!StringsKt__StringsJVMKt.equals(rcModelsDet.getStatusCode(), "NP001", true) || this.c.D().U0(StringsKt__StringsKt.trim((CharSequence) ((Document) this.c.d.get(this.d)).getRc()).toString(), rcModelsDet.getNrvDetails()) <= 0) {
                return;
            }
            this.c.k(this.d);
        }
    }

    public xn(ArrayList rc_details, Context context) {
        Intrinsics.checkNotNullParameter(rc_details, "rc_details");
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = rc_details;
        this.e = context;
        this.g = DatabaseHelper.D0(context);
        this.h = new ws6(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void G(xn this$0, Ref.ObjectRef rc_details_db, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rc_details_db, "$rc_details_db");
        Intent intent = new Intent(this$0.e, (Class<?>) DashBoardAlertViewDetails.class);
        NrvDetails nrvDetails = (NrvDetails) rc_details_db.element;
        intent.putExtra("RcNumber", nrvDetails != null ? nrvDetails.getRc_regn_no() : null);
        this$0.e.startActivity(intent);
    }

    public final void C(String change_color, TextView textView) {
        Intrinsics.checkNotNullParameter(change_color, "change_color");
        Intrinsics.checkNotNullParameter(textView, "textView");
        if (StringsKt__StringsKt.contains((CharSequence) change_color, (CharSequence) "Expired", true)) {
            textView.setTextColor(yy0.c(this.e, R.color.danger));
        }
        if (StringsKt__StringsKt.contains((CharSequence) change_color, (CharSequence) "Expiring", true)) {
            textView.setTextColor(yy0.c(this.e, R.color.vehicle_fit));
        }
    }

    public final DatabaseHelper D() {
        return this.g;
    }

    public final RcService E() {
        RcService rcService = this.f;
        if (rcService != null) {
            return rcService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcService");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0194 A[Catch: Exception -> 0x00e6, TryCatch #0 {Exception -> 0x00e6, blocks: (B:3:0x0005, B:6:0x002e, B:9:0x00e9, B:11:0x010d, B:13:0x0113, B:15:0x0120, B:17:0x0126, B:20:0x0136, B:22:0x013c, B:24:0x0142, B:26:0x014c, B:28:0x0169, B:29:0x016d, B:31:0x017b, B:107:0x0311, B:32:0x0184, B:33:0x0194, B:35:0x019a, B:37:0x01a0, B:39:0x01aa, B:41:0x01b0, B:43:0x01b6, B:45:0x01c0, B:47:0x01c8, B:48:0x01cc, B:50:0x01e8, B:51:0x01f1, B:53:0x01f7, B:55:0x01fd, B:57:0x0207, B:59:0x020d, B:61:0x0213, B:63:0x021d, B:65:0x022e, B:66:0x0232, B:68:0x0240, B:69:0x0249, B:71:0x024f, B:73:0x0255, B:75:0x025f, B:77:0x0265, B:79:0x026b, B:81:0x0275, B:83:0x028b, B:84:0x028f, B:86:0x029d, B:87:0x02a6, B:88:0x02ae, B:90:0x02b4, B:92:0x02ba, B:94:0x02c4, B:96:0x02ca, B:98:0x02d0, B:100:0x02da, B:102:0x02f0, B:103:0x02f4, B:105:0x0302, B:106:0x030a), top: B:111:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f1 A[Catch: Exception -> 0x00e6, TryCatch #0 {Exception -> 0x00e6, blocks: (B:3:0x0005, B:6:0x002e, B:9:0x00e9, B:11:0x010d, B:13:0x0113, B:15:0x0120, B:17:0x0126, B:20:0x0136, B:22:0x013c, B:24:0x0142, B:26:0x014c, B:28:0x0169, B:29:0x016d, B:31:0x017b, B:107:0x0311, B:32:0x0184, B:33:0x0194, B:35:0x019a, B:37:0x01a0, B:39:0x01aa, B:41:0x01b0, B:43:0x01b6, B:45:0x01c0, B:47:0x01c8, B:48:0x01cc, B:50:0x01e8, B:51:0x01f1, B:53:0x01f7, B:55:0x01fd, B:57:0x0207, B:59:0x020d, B:61:0x0213, B:63:0x021d, B:65:0x022e, B:66:0x0232, B:68:0x0240, B:69:0x0249, B:71:0x024f, B:73:0x0255, B:75:0x025f, B:77:0x0265, B:79:0x026b, B:81:0x0275, B:83:0x028b, B:84:0x028f, B:86:0x029d, B:87:0x02a6, B:88:0x02ae, B:90:0x02b4, B:92:0x02ba, B:94:0x02c4, B:96:0x02ca, B:98:0x02d0, B:100:0x02da, B:102:0x02f0, B:103:0x02f4, B:105:0x0302, B:106:0x030a), top: B:111:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0249 A[Catch: Exception -> 0x00e6, TryCatch #0 {Exception -> 0x00e6, blocks: (B:3:0x0005, B:6:0x002e, B:9:0x00e9, B:11:0x010d, B:13:0x0113, B:15:0x0120, B:17:0x0126, B:20:0x0136, B:22:0x013c, B:24:0x0142, B:26:0x014c, B:28:0x0169, B:29:0x016d, B:31:0x017b, B:107:0x0311, B:32:0x0184, B:33:0x0194, B:35:0x019a, B:37:0x01a0, B:39:0x01aa, B:41:0x01b0, B:43:0x01b6, B:45:0x01c0, B:47:0x01c8, B:48:0x01cc, B:50:0x01e8, B:51:0x01f1, B:53:0x01f7, B:55:0x01fd, B:57:0x0207, B:59:0x020d, B:61:0x0213, B:63:0x021d, B:65:0x022e, B:66:0x0232, B:68:0x0240, B:69:0x0249, B:71:0x024f, B:73:0x0255, B:75:0x025f, B:77:0x0265, B:79:0x026b, B:81:0x0275, B:83:0x028b, B:84:0x028f, B:86:0x029d, B:87:0x02a6, B:88:0x02ae, B:90:0x02b4, B:92:0x02ba, B:94:0x02c4, B:96:0x02ca, B:98:0x02d0, B:100:0x02da, B:102:0x02f0, B:103:0x02f4, B:105:0x0302, B:106:0x030a), top: B:111:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ae A[Catch: Exception -> 0x00e6, TryCatch #0 {Exception -> 0x00e6, blocks: (B:3:0x0005, B:6:0x002e, B:9:0x00e9, B:11:0x010d, B:13:0x0113, B:15:0x0120, B:17:0x0126, B:20:0x0136, B:22:0x013c, B:24:0x0142, B:26:0x014c, B:28:0x0169, B:29:0x016d, B:31:0x017b, B:107:0x0311, B:32:0x0184, B:33:0x0194, B:35:0x019a, B:37:0x01a0, B:39:0x01aa, B:41:0x01b0, B:43:0x01b6, B:45:0x01c0, B:47:0x01c8, B:48:0x01cc, B:50:0x01e8, B:51:0x01f1, B:53:0x01f7, B:55:0x01fd, B:57:0x0207, B:59:0x020d, B:61:0x0213, B:63:0x021d, B:65:0x022e, B:66:0x0232, B:68:0x0240, B:69:0x0249, B:71:0x024f, B:73:0x0255, B:75:0x025f, B:77:0x0265, B:79:0x026b, B:81:0x0275, B:83:0x028b, B:84:0x028f, B:86:0x029d, B:87:0x02a6, B:88:0x02ae, B:90:0x02b4, B:92:0x02ba, B:94:0x02c4, B:96:0x02ca, B:98:0x02d0, B:100:0x02da, B:102:0x02f0, B:103:0x02f4, B:105:0x0302, B:106:0x030a), top: B:111:0x0005 }] */
    /* JADX WARN: Type inference failed for: r10v5, types: [T, com.nic.mparivahan.RC.Model.NrvDetails] */
    /* JADX WARN: Type inference failed for: r2v27, types: [T, java.lang.String] */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p(com.zepto.xn.a r9, int r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 808
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zepto.xn.p(com.zepto.xn$a, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (this.d.size() > 1) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_alerts, parent, false);
            Intrinsics.checkNotNull(viewInflate);
            return new a(viewInflate);
        }
        View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_alert_single, parent, false);
        Intrinsics.checkNotNull(viewInflate2);
        return new a(viewInflate2);
    }

    public final void I(RcService rcService) {
        Intrinsics.checkNotNullParameter(rcService, "<set-?>");
        this.f = rcService;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
