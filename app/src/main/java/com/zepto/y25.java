package com.zepto;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.provider.Settings;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.nic.mparivahan.APIController;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.Document;
import com.nic.mparivahan.RC.Model.NrvDetails;
import com.nic.mparivahan.RC.Model.RcModelsDet;
import com.nic.mparivahan.RC.RcInterface.RcService;
import com.nic.mparivahan.RC.SharedRcScreen;
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
public final class y25 extends RecyclerView.h {
    public ArrayList d;
    public final Context e;
    public final uh1 f;
    public DatabaseHelper g;
    public RcService h;
    public ws6 i;

    public static final class a extends RecyclerView.d0 {
        public final TextView A;
        public final TextView B;
        public final LinearLayout C;
        public final ImageView D;
        public final ImageView E;
        public final ProgressBar F;
        public final ImageView G;
        public final TextView u;
        public final ImageView v;
        public final ImageView w;
        public final TextView x;
        public final TextView y;
        public final TextView z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View ItemView) {
            super(ItemView);
            Intrinsics.checkNotNullParameter(ItemView, "ItemView");
            View viewFindViewById = this.a.findViewById(R.id.shared_rc);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.u = (TextView) viewFindViewById;
            View viewFindViewById2 = this.a.findViewById(R.id.update);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.v = (ImageView) viewFindViewById2;
            View viewFindViewById3 = this.a.findViewById(R.id.delet);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.w = (ImageView) viewFindViewById3;
            View viewFindViewById4 = this.a.findViewById(R.id.rc_number);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.x = (TextView) viewFindViewById4;
            View viewFindViewById5 = this.a.findViewById(R.id.owner_name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.y = (TextView) viewFindViewById5;
            View viewFindViewById6 = this.a.findViewById(R.id.address);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            this.z = (TextView) viewFindViewById6;
            View viewFindViewById7 = this.a.findViewById(R.id.issue_date);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
            this.A = (TextView) viewFindViewById7;
            View viewFindViewById8 = this.a.findViewById(R.id.valid_upto);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
            this.B = (TextView) viewFindViewById8;
            View viewFindViewById9 = this.a.findViewById(R.id.linear_parent);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
            this.C = (LinearLayout) viewFindViewById9;
            View viewFindViewById10 = this.a.findViewById(R.id.share_doc);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
            this.D = (ImageView) viewFindViewById10;
            View viewFindViewById11 = this.a.findViewById(R.id.option_menu);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
            this.E = (ImageView) viewFindViewById11;
            View viewFindViewById12 = this.a.findViewById(R.id.progress_bar);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
            this.F = (ProgressBar) viewFindViewById12;
            View viewFindViewById13 = this.a.findViewById(R.id.download_rc);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
            this.G = (ImageView) viewFindViewById13;
        }

        public final TextView O() {
            return this.z;
        }

        public final ImageView P() {
            return this.w;
        }

        public final ImageView Q() {
            return this.G;
        }

        public final TextView R() {
            return this.A;
        }

        public final LinearLayout S() {
            return this.C;
        }

        public final ImageView T() {
            return this.E;
        }

        public final TextView U() {
            return this.y;
        }

        public final ProgressBar V() {
            return this.F;
        }

        public final TextView W() {
            return this.x;
        }

        public final ImageView X() {
            return this.D;
        }

        public final ImageView Y() {
            return this.v;
        }

        public final TextView Z() {
            return this.B;
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ a a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ y25 c;
        public final /* synthetic */ int d;

        public b(a aVar, Ref.ObjectRef objectRef, y25 y25Var, int i) {
            this.a = aVar;
            this.b = objectRef;
            this.c = y25Var;
            this.d = i;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.a.V().setVisibility(8);
            this.a.Q().setVisibility(0);
            this.a.T().setVisibility(8);
            Log.e("Error -- >001", String.valueOf(th != null ? th.getMessage() : null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            this.a.V().setVisibility(8);
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    this.a.Q().setVisibility(0);
                    this.a.T().setVisibility(8);
                    Log.e("Error -- >002", e.toString());
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
            if (!StringsKt__StringsJVMKt.equals(rcModelsDet.getStatusCode(), "NP001", true)) {
                this.a.Q().setVisibility(0);
                this.a.T().setVisibility(8);
            } else if (this.c.K().U0(StringsKt__StringsKt.trim((CharSequence) ((Document) this.c.d.get(this.d)).getRc()).toString(), rcModelsDet.getNrvDetails()) > 0) {
                this.c.k(this.d);
            }
        }
    }

    public static final class c implements Callback {
        public final /* synthetic */ a a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ y25 c;
        public final /* synthetic */ int d;

        public c(a aVar, Ref.ObjectRef objectRef, y25 y25Var, int i) {
            this.a = aVar;
            this.b = objectRef;
            this.c = y25Var;
            this.d = i;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            this.a.V().setVisibility(8);
            this.a.Q().setVisibility(0);
            this.a.T().setVisibility(8);
            Log.e("Error -- >001", String.valueOf(th != null ? th.getMessage() : null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            this.a.V().setVisibility(8);
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e) {
                    this.a.Q().setVisibility(0);
                    this.a.T().setVisibility(8);
                    Log.e("Error -- >002", e.toString());
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
            if (!StringsKt__StringsJVMKt.equals(rcModelsDet.getStatusCode(), "NP001", true)) {
                this.a.Q().setVisibility(0);
                this.a.T().setVisibility(8);
            } else {
                this.a.T().setVisibility(0);
                if (this.c.K().U0(StringsKt__StringsKt.trim((CharSequence) ((Document) this.c.d.get(this.d)).getRc()).toString(), rcModelsDet.getNrvDetails()) > 0) {
                    this.c.k(this.d);
                }
            }
        }
    }

    public y25(ArrayList rc_details, Context context, uh1 deletMyRcRcDeletListner) {
        Intrinsics.checkNotNullParameter(rc_details, "rc_details");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deletMyRcRcDeletListner, "deletMyRcRcDeletListner");
        this.d = rc_details;
        this.e = context;
        this.f = deletMyRcRcDeletListner;
        this.g = DatabaseHelper.D0(context);
        this.i = new ws6(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(View view) {
    }

    public static final void P(View view) {
    }

    public static final void Q(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, java.lang.String] */
    public static final void R(a holder, y25 this$0, int i, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        holder.V().setVisibility(0);
        holder.Q().setVisibility(8);
        String string = Settings.Secure.getString(this$0.e.getContentResolver(), "android_id");
        String strC0 = this$0.g.C0(StringsKt__StringsKt.trim((CharSequence) ((Document) this$0.d.get(i)).getRc()).toString());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        z45.a aVar2 = z45.a;
        String strK = this$0.i.k();
        Intrinsics.checkNotNull(strC0);
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.e(strK, strC0, string, this$0.i.l(), this$0.i.e()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string2);
        this$0.Z(RcService.INSTANCE.a(this$0.e));
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        this$0.L().UpdateVirtualRC(s14.a.u() + APIController.a().VirtualRC(), lc5VarD, (String) objectRef.element).enqueue(new c(holder, objectRef, this$0, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void S(final y25 this$0, a holder, final Ref.ObjectRef languageKeySession, final Ref.ObjectRef rc_numer, final int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(languageKeySession, "$languageKeySession");
        Intrinsics.checkNotNullParameter(rc_numer, "$rc_numer");
        PopupMenu popupMenu = new PopupMenu(this$0.e, holder.T());
        popupMenu.setGravity(8388613);
        popupMenu.inflate(R.menu.menu_item_option);
        MenuItem menuItemFindItem = popupMenu.getMenu().findItem(R.id.menu1);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem, "findItem(...)");
        MenuItem menuItemFindItem2 = popupMenu.getMenu().findItem(R.id.menu2);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem2, "findItem(...)");
        MenuItem menuItemFindItem3 = popupMenu.getMenu().findItem(R.id.menu3);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem3, "findItem(...)");
        MenuItem menuItemFindItem4 = popupMenu.getMenu().findItem(R.id.menu4);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem4, "findItem(...)");
        menuItemFindItem.setTitle(((wa3) languageKeySession.element).b("label_view", "View"));
        menuItemFindItem2.setTitle(((wa3) languageKeySession.element).b("label_share", "Share"));
        menuItemFindItem3.setTitle(((wa3) languageKeySession.element).b(va3.a.j0(), "Refresh"));
        menuItemFindItem4.setTitle(((wa3) languageKeySession.element).b("delete", "Delete"));
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.zepto.v25
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return y25.T(this.a, rc_numer, i, languageKeySession, menuItem);
            }
        });
        popupMenu.show();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean T(y25 this$0, Ref.ObjectRef rc_numer, int i, Ref.ObjectRef languageKeySession, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rc_numer, "$rc_numer");
        Intrinsics.checkNotNullParameter(languageKeySession, "$languageKeySession");
        switch (menuItem.getItemId()) {
            case R.id.menu1 /* 2131363697 */:
                Intent intent = new Intent(this$0.e, (Class<?>) VirtualRcScreen.class);
                intent.putExtra("RcNumber", (String) rc_numer.element);
                this$0.e.startActivity(intent);
                return false;
            case R.id.menu2 /* 2131363698 */:
                if (com.nic.mparivahan.a.a.a(this$0.e)) {
                    Intent intent2 = new Intent(this$0.e, (Class<?>) SharedRcScreen.class);
                    intent2.putExtra("RcNumber", (String) rc_numer.element);
                    this$0.e.startActivity(intent2);
                } else {
                    Context context = this$0.e;
                    Toast.makeText(context, context.getString(R.string.kindly_check_your_internet_connection), 0).show();
                }
                return false;
            case R.id.menu3 /* 2131363699 */:
                this$0.f.S((String) rc_numer.element, i);
                return false;
            case R.id.menu4 /* 2131363700 */:
                this$0.V(this$0.e, ((wa3) languageKeySession.element).b(va3.a.A0(), "Are you sure, You want to delete ?"), (String) rc_numer.element, i);
                return false;
            default:
                return false;
        }
    }

    private final void V(Context context, String str, final String str2, final int i) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirmation_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        wa3 wa3Var = new wa3(context);
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
        ((TextView) viewFindViewById).setText(str);
        ((TextView) viewFindViewById4).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(wa3Var.b("radio_dl_serv_yes", "Yes"));
        textView2.setText(wa3Var.b("radio_dl_serv_no", "No"));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.w25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y25.W(dialog, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.x25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y25.X(dialog, this, str2, i, view);
            }
        });
        dialog.show();
    }

    public static final void W(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void X(Dialog d, y25 this$0, String str, int i, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.f.p(str, i);
    }

    public final DatabaseHelper K() {
        return this.g;
    }

    public final RcService L() {
        RcService rcService = this.h;
        if (rcService != null) {
            return rcService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcService");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.zepto.wa3] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v11, types: [T, java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void p(final a holder, final int i) throws Throwable {
        Intrinsics.checkNotNullParameter(holder, "holder");
        try {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = new wa3(this.e);
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            ?? rc = ((Document) this.d.get(i)).getRc();
            objectRef2.element = rc;
            NrvDetails nrvDetailsJ0 = this.g.J0(rc);
            if (objectRef2.element != 0 && (!StringsKt__StringsJVMKt.isBlank((CharSequence) r2))) {
                holder.W().setText(((Document) this.d.get(i)).getRc());
            }
            if (nrvDetailsJ0 != null) {
                String rc_regn_no = nrvDetailsJ0.getRc_regn_no();
                String rc_owner_name = nrvDetailsJ0.getRc_owner_name();
                String rc_present_address = nrvDetailsJ0.getRc_present_address();
                String rc_regn_dt = nrvDetailsJ0.getRc_regn_dt();
                String rc_fit_upto = nrvDetailsJ0.getRc_fit_upto();
                holder.W().setText(rc_regn_no);
                holder.U().setText(rc_owner_name);
                holder.O().setText(rc_present_address);
                holder.R().setText(((wa3) objectRef.element).b("issue_date", "Issue Date") + " - " + rc_regn_dt);
                holder.Z().setText(((wa3) objectRef.element).b("label_dl_serv_valid_upto", "Valid Upto") + " - " + rc_fit_upto);
            } else {
                String string = Settings.Secure.getString(this.e.getContentResolver(), "android_id");
                holder.V().setVisibility(0);
                String strC0 = this.g.C0(StringsKt__StringsKt.trim((CharSequence) ((Document) this.d.get(i)).getRc()).toString());
                lc5.a aVar = lc5.Companion;
                ls3 ls3VarB = ls3.g.b("application/json");
                z45.a aVar2 = z45.a;
                String strK = this.i.k();
                Intrinsics.checkNotNull(strC0);
                Intrinsics.checkNotNull(string);
                String string2 = aVar2.e(strK, strC0, string, this.i.l(), this.i.e()).toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                lc5 lc5VarD = aVar.d(ls3VarB, string2);
                Z(RcService.INSTANCE.a(this.e));
                Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                objectRef3.element = String.valueOf(System.currentTimeMillis());
                L().UpdateVirtualRC(s14.a.u() + APIController.a().VirtualRC(), lc5VarD, (String) objectRef3.element).enqueue(new b(holder, objectRef3, this, i));
            }
            holder.X().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.p25
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    y25.N(view);
                }
            });
            holder.S().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.q25
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    y25.O(view);
                }
            });
            holder.P().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.r25
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    y25.P(view);
                }
            });
            holder.Y().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.s25
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    y25.Q(view);
                }
            });
            holder.Q().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.t25
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Throwable {
                    y25.R(holder, this, i, view);
                }
            });
            holder.T().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.u25
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    y25.S(this.a, holder, objectRef, objectRef2, i, view);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_doc_item, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    public final void Y(int i) {
        this.d.remove(i);
        n(i);
        m(i, this.d.size());
    }

    public final void Z(RcService rcService) {
        Intrinsics.checkNotNullParameter(rcService, "<set-?>");
        this.h = rcService;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
