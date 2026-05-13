package com.nic.mparivahan.Sos;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.location.Address;
import android.location.Geocoder;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.z;
import com.nic.mparivahan.Notifications.LocationNotiication;
import com.nic.mparivahan.Notifications.LocationResponse;
import com.nic.mparivahan.PushNotification.NaxpToKenService;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sos.SosHomeScreen;
import com.zepto.cn3;
import com.zepto.ig;
import com.zepto.ki2;
import com.zepto.l8;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.rm3;
import com.zepto.ta3;
import com.zepto.vm3;
import com.zepto.wa3;
import com.zepto.ws6;
import com.zepto.yy0;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bj\u0010kJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0006\u0010\u0006\u001a\u00020\u0004J/\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010J\b\u0010\u0014\u001a\u00020\u0004H\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0002J\u0012\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\nH\u0002J\u0012\u0010\u001c\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\nH\u0002J\u0012\u0010\u001d\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\nH\u0002J\u0012\u0010\u001e\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\nH\u0002R\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010.\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R\"\u00102\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u0010%\u001a\u0004\b0\u0010'\"\u0004\b1\u0010)R\u0014\u00105\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b3\u00104R\"\u00109\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u0010%\u001a\u0004\b7\u0010'\"\u0004\b8\u0010)R\u0014\u0010:\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b4\u00104R\"\u0010A\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010i\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010h¨\u0006l"}, d2 = {"Lcom/nic/mparivahan/Sos/SosHomeScreen;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "s1", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "", "lat", "lang", "w1", "onResume", "", "F1", "t1", "G1", "H1", "message", "T1", "M1", "O1", "Q1", "Lcom/zepto/ig;", "C", "Lcom/zepto/ig;", "binding", "Landroid/widget/LinearLayout;", "D", "Landroid/widget/LinearLayout;", "u1", "()Landroid/widget/LinearLayout;", "V1", "(Landroid/widget/LinearLayout;)V", "addcontactdetails", "E", "A1", "a2", "nexgenarrow", "F", "v1", "W1", "contact_amblunce", "G", "I", "CALL_PERMISSION_CODE", "H", "E1", "e2", "tapNotify", "LOCATION_PERMISSION_CODE", "J", "Ljava/lang/String;", "z1", "()Ljava/lang/String;", "Z1", "(Ljava/lang/String;)V", "myLocation", "Lcom/zepto/cn3;", "K", "Lcom/zepto/cn3;", "y1", "()Lcom/zepto/cn3;", "Y1", "(Lcom/zepto/cn3;)V", "mLocationViewModel", "Lcom/nic/mparivahan/Notifications/LocationNotiication;", "L", "Lcom/nic/mparivahan/Notifications/LocationNotiication;", "x1", "()Lcom/nic/mparivahan/Notifications/LocationNotiication;", "X1", "(Lcom/nic/mparivahan/Notifications/LocationNotiication;)V", "mLocationNotification", "Lcom/zepto/ws6;", "M", "Lcom/zepto/ws6;", "D1", "()Lcom/zepto/ws6;", "d2", "(Lcom/zepto/ws6;)V", "sessionManager", "Lcom/zepto/wa3;", "N", "Lcom/zepto/wa3;", "C1", "()Lcom/zepto/wa3;", "c2", "(Lcom/zepto/wa3;)V", "session", "Landroid/app/ProgressDialog;", "O", "Landroid/app/ProgressDialog;", "B1", "()Landroid/app/ProgressDialog;", "b2", "(Landroid/app/ProgressDialog;)V", "pDialog", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class SosHomeScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ig binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public LinearLayout addcontactdetails;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public LinearLayout nexgenarrow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public LinearLayout contact_amblunce;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public LinearLayout tapNotify;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String myLocation;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public cn3 mLocationViewModel;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public LocationNotiication mLocationNotification;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public final int CALL_PERMISSION_CODE = 24;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public final int LOCATION_PERMISSION_CODE = 23;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(LocationResponse locationResponse) {
            try {
                SosHomeScreen.this.B1().dismiss();
                if (StringsKt__StringsJVMKt.equals(locationResponse.getStatusCode(), "SOS001", true)) {
                    SosHomeScreen.this.O1(locationResponse.getStatusDesc().toString());
                } else {
                    SosHomeScreen.this.O1(locationResponse.getStatusDesc().toString());
                }
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((LocationResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            try {
                SosHomeScreen.this.B1().dismiss();
                SosHomeScreen sosHomeScreen = SosHomeScreen.this;
                sosHomeScreen.O1(sosHomeScreen.C1().b("label_not_find_location", "Not able to find your location\\nTry after some time"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static final class c implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.a = function;
        }

        @Override // com.zepto.mf4
        public final /* synthetic */ void a(Object obj) {
            this.a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof mf4) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    private final boolean F1() {
        return yy0.a(this, "android.permission.CALL_PHONE") == 0;
    }

    private final boolean G1() {
        return yy0.a(this, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    private final void H1() {
        l8.u(this, "android.permission.ACCESS_FINE_LOCATION");
        l8.s(this, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, this.LOCATION_PERMISSION_CODE);
    }

    public static final void I1(SosHomeScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) AddContactScreen.class));
    }

    public static final void J1(SosHomeScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void K1(SosHomeScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.F1()) {
            this$0.s1();
        } else {
            this$0.t1();
        }
    }

    public static final void L1(SosHomeScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.B1().show();
            Object systemService = this$0.getSystemService("location");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
            if (!((LocationManager) systemService).isProviderEnabled("gps")) {
                this$0.B1().dismiss();
                this$0.T1(this$0.C1().b("label_turn_on_your_loc", "Your location is off\nPlease turn on your location"));
            } else if (this$0.G1()) {
                new ki2(this$0);
                if (this$0.z1() == null) {
                    this$0.B1().dismiss();
                    this$0.O1(this$0.C1().b("label_not_find_location", "Not able to find your location\\nTry after some time"));
                } else if (Intrinsics.areEqual(this$0.z1(), this$0.getResources().getString(R.string.location_not_find))) {
                    this$0.B1().dismiss();
                    this$0.O1(this$0.z1());
                } else {
                    this$0.y1().i(Integer.parseInt(this$0.D1().k()), this$0.z1());
                }
            } else {
                this$0.B1().dismiss();
                this$0.Q1(this$0.C1().b("label_location", "Location"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void N1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O1(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        textView.setText(C1().b("btn_ok", "Ok"));
        ((TextView) viewFindViewById3).setText(C1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.r46
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SosHomeScreen.P1(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void R1(Dialog d, SosHomeScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.H1();
    }

    public static final void S1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void U1(SosHomeScreen this$0, Dialog d, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d, "$d");
        this$0.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        d.dismiss();
    }

    private final void t1() {
        l8.u(this, "android.permission.CALL_PHONE");
        l8.s(this, new String[]{"android.permission.CALL_PHONE"}, this.CALL_PERMISSION_CODE);
    }

    public final LinearLayout A1() {
        LinearLayout linearLayout = this.nexgenarrow;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nexgenarrow");
        return null;
    }

    public final ProgressDialog B1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final wa3 C1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final ws6 D1() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final LinearLayout E1() {
        LinearLayout linearLayout = this.tapNotify;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tapNotify");
        return null;
    }

    public final void M1(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(C1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(C1().b("btn_ok", "Ok"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.k46
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SosHomeScreen.N1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void Q1(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.informlocation);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.accept);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById3 = dialog.findViewById(R.id.deny);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.p46
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SosHomeScreen.R1(dialog, this, view);
            }
        });
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.q46
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SosHomeScreen.S1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void T1(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(C1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(C1().b("btn_ok", "Ok"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.j46
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SosHomeScreen.U1(this.a, dialog, view);
            }
        });
        dialog.show();
    }

    public final void V1(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.addcontactdetails = linearLayout;
    }

    public final void W1(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.contact_amblunce = linearLayout;
    }

    public final void X1(LocationNotiication locationNotiication) {
        Intrinsics.checkNotNullParameter(locationNotiication, "<set-?>");
        this.mLocationNotification = locationNotiication;
    }

    public final void Y1(cn3 cn3Var) {
        Intrinsics.checkNotNullParameter(cn3Var, "<set-?>");
        this.mLocationViewModel = cn3Var;
    }

    public final void Z1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.myLocation = str;
    }

    public final void a2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.nexgenarrow = linearLayout;
    }

    public final void b2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void c2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final void d2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final void e2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.tapNotify = linearLayout;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ig igVarC = ig.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(igVarC, "inflate(...)");
        this.binding = igVarC;
        ig igVar = null;
        if (igVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            igVarC = null;
        }
        setContentView(igVarC.b());
        c2(new wa3(this));
        b2(new ProgressDialog(this));
        B1().setMessage(C1().b("label_challan_please_wait", "Please wait..."));
        B1().setCancelable(false);
        B1().setCanceledOnTouchOutside(false);
        ta3.a aVar = ta3.a;
        ig igVar2 = this.binding;
        if (igVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            igVar = igVar2;
        }
        aVar.X1(this, igVar);
        d2(new ws6(this));
        X1(LocationNotiication.INSTANCE.a(this));
        Y1((cn3) new z(this, new rm3(new vm3(x1()))).a(cn3.class));
        View viewFindViewById = findViewById(R.id.addcontactdetails);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        V1((LinearLayout) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.contact_amblunce);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        W1((LinearLayout) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.nexgenarrow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        a2((LinearLayout) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.tap_notify);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        e2((LinearLayout) viewFindViewById4);
        u1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.l46
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SosHomeScreen.I1(this.a, view);
            }
        });
        A1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.m46
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SosHomeScreen.J1(this.a, view);
            }
        });
        v1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.n46
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SosHomeScreen.K1(this.a, view);
            }
        });
        y1().h().g(this, new c(new a()));
        y1().g().g(this, new c(new b()));
        E1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.o46
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SosHomeScreen.L1(this.a, view);
            }
        });
    }

    @Override // com.zepto.yf2, com.zepto.zt0, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == this.LOCATION_PERMISSION_CODE) {
            if (grantResults.length <= 0 || grantResults[0] != 0) {
                T1(C1().b("label_loc_permission_required", "Location permission Required\nAllow mParivahan App to detect your location"));
                return;
            }
            return;
        }
        if (requestCode == this.CALL_PERMISSION_CODE) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                s1();
            } else {
                M1(C1().b("label_phone_permission_required_to_call", "Phone permission Required to make call"));
            }
        }
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() {
        super.onResume();
        try {
            if (com.nic.mparivahan.a.a.a(this)) {
                NaxpToKenService.INSTANCE.a(this);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        ki2 ki2Var = new ki2(this);
        w1(ki2Var.f, ki2Var.g);
    }

    public final void s1() {
        Intent intent = new Intent("android.intent.action.CALL");
        intent.setData(Uri.parse("tel:102"));
        startActivity(intent);
    }

    public final LinearLayout u1() {
        LinearLayout linearLayout = this.addcontactdetails;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("addcontactdetails");
        return null;
    }

    public final LinearLayout v1() {
        LinearLayout linearLayout = this.contact_amblunce;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("contact_amblunce");
        return null;
    }

    public final void w1(double lat, double lang) {
        try {
            List<Address> fromLocation = new Geocoder(this, Locale.getDefault()).getFromLocation(lat, lang, 1);
            Intrinsics.checkNotNull(fromLocation, "null cannot be cast to non-null type kotlin.collections.List<android.location.Address>");
            if (fromLocation.isEmpty()) {
                Z1(String.valueOf(C1().b("label_not_find_location", getResources().getString(R.string.location_not_find))));
            } else {
                String addressLine = fromLocation.get(0).getAddressLine(0);
                Intrinsics.checkNotNullExpressionValue(addressLine, "getAddressLine(...)");
                Z1(addressLine);
            }
        } catch (IOException e) {
            Z1(String.valueOf(C1().b("label_not_find_location", getResources().getString(R.string.location_not_find))));
            e.printStackTrace();
        }
    }

    public final LocationNotiication x1() {
        LocationNotiication locationNotiication = this.mLocationNotification;
        if (locationNotiication != null) {
            return locationNotiication;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mLocationNotification");
        return null;
    }

    public final cn3 y1() {
        cn3 cn3Var = this.mLocationViewModel;
        if (cn3Var != null) {
            return cn3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mLocationViewModel");
        return null;
    }

    public final String z1() {
        String str = this.myLocation;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("myLocation");
        return null;
    }
}
