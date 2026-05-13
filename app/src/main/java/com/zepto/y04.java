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
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.Account.SignService;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.SharedDoc;
import com.nic.mparivahan.RC.ShowSharedRcScreen;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.lc5;
import com.zepto.mt6;
import com.zepto.su5;
import com.zepto.z45;
import java.util.ArrayList;
import java.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class y04 extends RecyclerView.h {
    public final ArrayList d;
    public final Context e;
    public final vh1 f;

    public static final class a extends RecyclerView.d0 {
        public final TextView A;
        public final TextView B;
        public final LinearLayout C;
        public final TextView D;
        public final ImageView E;
        public final TextView F;
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
            View viewFindViewById6 = this.a.findViewById(R.id.mobile_number);
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
            View viewFindViewById10 = this.a.findViewById(R.id.mobile_number_tx);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
            this.D = (TextView) viewFindViewById10;
            View viewFindViewById11 = this.a.findViewById(R.id.option_menu);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
            this.E = (ImageView) viewFindViewById11;
            View viewFindViewById12 = this.a.findViewById(R.id.shared_to);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
            this.F = (TextView) viewFindViewById12;
        }

        public final ImageView O() {
            return this.w;
        }

        public final TextView P() {
            return this.A;
        }

        public final LinearLayout Q() {
            return this.C;
        }

        public final TextView R() {
            return this.D;
        }

        public final ImageView S() {
            return this.E;
        }

        public final TextView T() {
            return this.y;
        }

        public final TextView U() {
            return this.x;
        }

        public final TextView V() {
            return this.F;
        }

        public final TextView W() {
            return this.B;
        }
    }

    public static final class b implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ TextView b;
        public final /* synthetic */ TextView c;

        public b(Ref.ObjectRef objectRef, TextView textView, TextView textView2) {
            this.a = objectRef;
            this.b = textView;
            this.c = textView2;
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
                    this.b.setText("--");
                    this.c.setText("--");
                    return;
                }
            } else {
                securityModle = null;
            }
            su5.a aVar = su5.a;
            String str = (String) this.a.element;
            byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            String strValueOf = String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8)));
            Log.d("getRcDetails", strValueOf);
            JSONObject jSONObject = new JSONObject(strValueOf);
            if (jSONObject.has("statusCode") && StringsKt__StringsJVMKt.equals(jSONObject.getString("statusCode"), "CTZN001", true)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("mparCitizenUser");
                if (jSONObject2.has("ctzDispName")) {
                    this.b.setText(jSONObject2.getString("ctzDispName").toString());
                }
            }
        }
    }

    public y04(ArrayList shared_RcDetails, Context context, vh1 deletSharedRcDeletListner) {
        Intrinsics.checkNotNullParameter(shared_RcDetails, "shared_RcDetails");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deletSharedRcDeletListner, "deletSharedRcDeletListner");
        this.d = shared_RcDetails;
        this.e = context;
        this.f = deletSharedRcDeletListner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(View view) {
    }

    public static final void J(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void K(final y04 this$0, a holder, final Ref.ObjectRef languageKeySession, final String rc_numer, final int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(languageKeySession, "$languageKeySession");
        Intrinsics.checkNotNullParameter(rc_numer, "$rc_numer");
        PopupMenu popupMenu = new PopupMenu(this$0.e, holder.S());
        popupMenu.inflate(R.menu.recived_rc_menu);
        MenuItem menuItemFindItem = popupMenu.getMenu().findItem(R.id.menu1);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem, "findItem(...)");
        MenuItem menuItemFindItem2 = popupMenu.getMenu().findItem(R.id.menu3);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem2, "findItem(...)");
        menuItemFindItem.setTitle(((wa3) languageKeySession.element).b("label_view", "View"));
        menuItemFindItem2.setTitle(((wa3) languageKeySession.element).b("delete", "Delete"));
        popupMenu.setGravity(8388613);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.zepto.v04
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return y04.L(this.a, rc_numer, languageKeySession, i, menuItem);
            }
        });
        popupMenu.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean L(y04 this$0, String rc_numer, Ref.ObjectRef languageKeySession, int i, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rc_numer, "$rc_numer");
        Intrinsics.checkNotNullParameter(languageKeySession, "$languageKeySession");
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu1) {
            Intent intent = new Intent(this$0.e, (Class<?>) ShowSharedRcScreen.class);
            intent.putExtra("RcNumber", rc_numer);
            intent.putExtra("ShareRecivedFlag", false);
            this$0.e.startActivity(intent);
        } else if (itemId == R.id.menu3) {
            this$0.N(this$0.e, ((wa3) languageKeySession.element).b(va3.a.A0(), "Are you sure, you want to delete?"), String.valueOf(((SharedDoc) this$0.d.get(i)).getShrdId()), i);
        }
        return false;
    }

    private final void N(Context context, String str, final String str2, final int i) {
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
        ((TextView) viewFindViewById).setText(str);
        textView.setText(wa3Var.b("radio_dl_serv_yes", "Yes"));
        textView2.setText(wa3Var.b("radio_dl_serv_no", "No"));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.w04
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y04.O(dialog, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.x04
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y04.P(dialog, this, str2, i, view);
            }
        });
        dialog.show();
    }

    public static final void O(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void P(Dialog d, y04 this$0, String str, int i, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.f.Q(str, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.String] */
    public final void G(TextView ownername, TextView mobile_no, String id) {
        Intrinsics.checkNotNullParameter(ownername, "ownername");
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        Intrinsics.checkNotNullParameter(id, "id");
        String string = Settings.Secure.getString(this.e.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(this.e);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        mt6.a aVar2 = mt6.a;
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.h(id, string, ws6Var.l(), ws6Var.e()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        lc5 lc5VarD = aVar.d(ls3VarB, string2);
        SignService.INSTANCE.a(this.e).getUserDetails(s14.a.q() + "service/getCitizenUserDetails", lc5VarD, (String) objectRef.element).enqueue(new b(objectRef, ownername, mobile_no));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, com.zepto.wa3] */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void p(final a holder, final int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        try {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = new wa3(this.e);
            holder.V().setText(((wa3) objectRef.element).b("shared_to", "Shared to"));
            G(holder.T(), holder.R(), String.valueOf(((SharedDoc) this.d.get(i)).getShrdToCtz()));
            final String shrdDocNumber = ((SharedDoc) this.d.get(i)).getShrdDocNumber();
            String shrdCreatedAt = ((SharedDoc) this.d.get(i)).getShrdCreatedAt();
            String shrdExpireOn = ((SharedDoc) this.d.get(i)).getShrdExpireOn();
            z45.a aVar = z45.a;
            String strValueOf = String.valueOf(aVar.j(shrdExpireOn.toString(), "yyyy-MM-dd", "dd MMM,yyyy"));
            holder.U().setText(shrdDocNumber);
            holder.P().setText(((wa3) objectRef.element).b("shared_date", "Shared Date") + ' ' + aVar.k(shrdCreatedAt));
            holder.W().setText(((wa3) objectRef.element).b("label_dl_serv_valid_upto", "Valid Upto") + ' ' + strValueOf);
            holder.O().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.s04
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    y04.I(view);
                }
            });
            holder.Q().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.t04
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    y04.J(view);
                }
            });
            holder.S().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.u04
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    y04.K(this.a, holder, objectRef, shrdDocNumber, i, view);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public a r(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.mysharedrc_iem, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new a(viewInflate);
    }

    public final void Q(int i) {
        this.d.remove(i);
        n(i);
        m(i, this.d.size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int e() {
        return this.d.size();
    }
}
