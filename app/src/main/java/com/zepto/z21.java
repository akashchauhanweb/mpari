package com.zepto;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.nic.mparivahan.APIController;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.Document;
import com.nic.mparivahan.RC.Model.NrvDetails;
import com.nic.mparivahan.RC.Model.RcModelsDet;
import com.nic.mparivahan.RC.RcInterface.RcService;
import com.nic.mparivahan.RC.VirtualRcScreen;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.lc5;
import com.zepto.su5;
import com.zepto.z45;
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
public final class z21 extends RecyclerView.h {
    public ArrayList d;
    public final Context e;
    public final nq6 f;
    public RcService g;
    public DatabaseHelper h;
    public ws6 i;

    public static final class a extends RecyclerView.d0 {
        public TextView A;
        public final TextView u;
        public final LinearLayout v;
        public final LinearLayout w;
        public ProgressBar x;
        public ImageView y;
        public TextView z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View viewFindViewById = this.a.findViewById(R.id.rc_number);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (TextView) viewFindViewById;
            View viewFindViewById2 = this.a.findViewById(R.id.linear_parent);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (LinearLayout) viewFindViewById2;
            View viewFindViewById3 = this.a.findViewById(R.id.delet_icon);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.w = (LinearLayout) viewFindViewById3;
            View viewFindViewById4 = this.a.findViewById(R.id.progress_bar);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.x = (ProgressBar) viewFindViewById4;
            View viewFindViewById5 = this.a.findViewById(R.id.refresh);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.y = (ImageView) viewFindViewById5;
            View viewFindViewById6 = this.a.findViewById(R.id.viewdetails);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            this.z = (TextView) viewFindViewById6;
            View viewFindViewById7 = this.a.findViewById(R.id.tv_vehicle_no);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
            this.A = (TextView) viewFindViewById7;
        }

        public final LinearLayout O() {
            return this.w;
        }

        public final LinearLayout P() {
            return this.v;
        }

        public final ProgressBar Q() {
            return this.x;
        }

        public final TextView R() {
            return this.u;
        }

        public final ImageView S() {
            return this.y;
        }

        public final TextView T() {
            return this.A;
        }

        public final TextView U() {
            return this.z;
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ z21 b;
        public final /* synthetic */ int c;

        public b(Ref.ObjectRef objectRef, z21 z21Var, int i) {
            this.a = objectRef;
            this.b = z21Var;
            this.c = i;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            Log.e("Error -- >001", String.valueOf(th != null ? th.getMessage() : null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
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
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) RcModelsDet.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            RcModelsDet rcModelsDet = (RcModelsDet) objFromJson;
            if (!StringsKt__StringsJVMKt.equals(rcModelsDet.getStatusCode(), "NP001", true) || this.b.F().U0(StringsKt__StringsKt.trim((CharSequence) ((Document) this.b.d.get(this.c)).getRc()).toString(), rcModelsDet.getNrvDetails()) <= 0) {
                return;
            }
            this.b.k(this.c);
            this.b.f.f0(Integer.valueOf(this.c));
        }
    }

    public z21(ArrayList rc_details, Context context, nq6 updateDashboardRc) {
        Intrinsics.checkNotNullParameter(rc_details, "rc_details");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(updateDashboardRc, "updateDashboardRc");
        this.d = rc_details;
        this.e = context;
        this.f = updateDashboardRc;
        this.h = DatabaseHelper.D0(context);
        this.i = new ws6(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void I(z21 this$0, Ref.ObjectRef rc_numer, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rc_numer, "$rc_numer");
        Intent intent = new Intent(this$0.e, (Class<?>) VirtualRcScreen.class);
        intent.putExtra("RcNumber", (String) rc_numer.element);
        this$0.e.startActivity(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void J(z21 this$0, Ref.ObjectRef rc_numer, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rc_numer, "$rc_numer");
        this$0.f.B((String) rc_numer.element, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void K(a holder, z21 this$0, Ref.ObjectRef rc_details_db, int i, View view) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rc_details_db, "$rc_details_db");
        holder.Q().setVisibility(0);
        nq6 nq6Var = this$0.f;
        NrvDetails nrvDetails = (NrvDetails) rc_details_db.element;
        nq6Var.f(String.valueOf(nrvDetails != null ? nrvDetails.getRc_regn_no() : null), Integer.valueOf(i));
    }

    public final DatabaseHelper F() {
        return this.h;
    }

    public final RcService G() {
        RcService rcService = this.g;
        if (rcService != null) {
            return rcService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcService");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, com.nic.mparivahan.RC.Model.NrvDetails] */
    /* JADX WARN: Type inference failed for: r4v12, types: [T, java.lang.String] */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void p(final a holder, final int i) throws Throwable {
        Intrinsics.checkNotNullParameter(holder, "holder");
        try {
            wa3 wa3Var = new wa3(this.e);
            holder.T().setText(wa3Var.b("label_challan_vehicle_no", "Vehicle No"));
            holder.Q().setVisibility(8);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = ((Document) this.d.get(i)).getRc();
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = this.h.J0((String) objectRef.element);
            if (objectRef.element != 0 && (!StringsKt__StringsJVMKt.isBlank((CharSequence) r3))) {
                holder.R().setText(((Document) this.d.get(i)).getRc());
                holder.U().setText(wa3Var.b(va3.a.F(), "View Virtual RC"));
            }
            T t = objectRef2.element;
            if (t != 0) {
                NrvDetails nrvDetails = (NrvDetails) t;
                if (nrvDetails != null) {
                    nrvDetails.getRc_owner_name();
                }
                NrvDetails nrvDetails2 = (NrvDetails) objectRef2.element;
                if (nrvDetails2 != null) {
                    nrvDetails2.getRc_present_address();
                }
                NrvDetails nrvDetails3 = (NrvDetails) objectRef2.element;
                if (nrvDetails3 != null) {
                    nrvDetails3.getRc_regn_dt();
                }
                NrvDetails nrvDetails4 = (NrvDetails) objectRef2.element;
                if (nrvDetails4 != null) {
                    nrvDetails4.getRc_fit_upto();
                }
            } else {
                String string = Settings.Secure.getString(this.e.getContentResolver(), "android_id");
                String strC0 = this.h.C0(StringsKt__StringsKt.trim((CharSequence) ((Document) this.d.get(i)).getRc()).toString());
                lc5.a aVar = lc5.Companion;
                ls3 ls3VarB = ls3.g.b("application/json");
                z45.a aVar2 = z45.a;
                String strK = this.i.k();
                Intrinsics.checkNotNull(strC0);
                String string2 = aVar2.e(strK, strC0, string.toString(), this.i.l(), this.i.e()).toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                lc5 lc5VarD = aVar.d(ls3VarB, string2);
                N(RcService.INSTANCE.a(this.e));
                Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                objectRef3.element = String.valueOf(System.currentTimeMillis());
                G().UpdateVirtualRC(s14.a.u() + APIController.a().VirtualRC(), lc5VarD, (String) objectRef3.element).enqueue(new b(objectRef3, this, i));
            }
            holder.P().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.w21
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    z21.I(this.a, objectRef, view);
                }
            });
            holder.O().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.x21
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    z21.J(this.a, objectRef, i, view);
                }
            });
            holder.S().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.y21
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    z21.K(holder, this, objectRef2, i, view);
                }
            });
        } catch (Exception e) {
            Log.e("AdapterEoor", e.toString());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
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

    public final void M(int i) {
        this.d.remove(i);
        n(i);
        m(i, this.d.size());
    }

    public final void N(RcService rcService) {
        Intrinsics.checkNotNullParameter(rcService, "<set-?>");
        this.g = rcService;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
