package com.nic.mparivahan.Dashboard;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.z;
import com.nic.mparivahan.Account.Model.GetEnableStateModel;
import com.nic.mparivahan.Dashboard.VehicleServiceHome;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanApplication;
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanWithdraw;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanView.VahanMainViewScreen;
import com.nic.mparivahan.VahanServices.updateMobileNo.VahanUpdateMobileActivity;
import com.nic.mparivahan.Welcome.VersionService;
import com.zepto.kp7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.tu7;
import com.zepto.vh7;
import com.zepto.z04;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\ba\u0010bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0015J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\"\u0010\u0018\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\"\u0010\u001c\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\"\u0010 \u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000fR\"\u0010$\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\u000b\u001a\u0004\b\"\u0010\r\"\u0004\b#\u0010\u000fR\"\u0010(\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010\u000b\u001a\u0004\b&\u0010\r\"\u0004\b'\u0010\u000fR\"\u0010,\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010\u000b\u001a\u0004\b*\u0010\r\"\u0004\b+\u0010\u000fR\"\u00100\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010\u000b\u001a\u0004\b.\u0010\r\"\u0004\b/\u0010\u000fR\"\u00104\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010\u000b\u001a\u0004\b2\u0010\r\"\u0004\b3\u0010\u000fR\"\u00108\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u0010\u000b\u001a\u0004\b6\u0010\r\"\u0004\b7\u0010\u000fR\"\u0010<\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010\u000b\u001a\u0004\b:\u0010\r\"\u0004\b;\u0010\u000fR\"\u0010@\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010\u000b\u001a\u0004\b>\u0010\r\"\u0004\b?\u0010\u000fR\"\u0010D\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010\u000b\u001a\u0004\bB\u0010\r\"\u0004\bC\u0010\u000fR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0016\u0010X\u001a\u00020U8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bV\u0010WR\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_¨\u0006c"}, d2 = {"Lcom/nic/mparivahan/Dashboard/VehicleServiceHome;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/content/Context;", "context", "e2", "Landroid/widget/LinearLayout;", "C", "Landroid/widget/LinearLayout;", "H1", "()Landroid/widget/LinearLayout;", "p2", "(Landroid/widget/LinearLayout;)V", "nexgenarrow", "D", "K1", "s2", "pay_your_tax", "E", "C1", "k2", "d_rc", "F", "B1", "j2", "d_ht", "G", "D1", "l2", "d_to", "H", "z1", "h2", "change_of_address", "I", "A1", "i2", "d_ha", "J", "G1", "o2", "hc", "K", "I1", "q2", "noc", "L", "L1", "t2", "rc_partucular", "M", "y1", "g2", "applStatusLl", "N", "N1", "v2", "verifyPaymentLl", "O", "E1", "m2", "disposeAppLl", "P", "M1", "u2", "updateMobileLl", "Landroid/widget/TextView;", "Q", "Landroid/widget/TextView;", "F1", "()Landroid/widget/TextView;", "n2", "(Landroid/widget/TextView;)V", "enrolled_state_vahan", "Lcom/zepto/tu7;", "R", "Lcom/zepto/tu7;", "O1", "()Lcom/zepto/tu7;", "w2", "(Lcom/zepto/tu7;)V", "viewModel", "Lcom/nic/mparivahan/Welcome/VersionService;", "S", "Lcom/nic/mparivahan/Welcome/VersionService;", "retrofitService", "Landroid/app/ProgressDialog;", "T", "Landroid/app/ProgressDialog;", "J1", "()Landroid/app/ProgressDialog;", "r2", "(Landroid/app/ProgressDialog;)V", "pDialog", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VehicleServiceHome extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public LinearLayout nexgenarrow;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public LinearLayout pay_your_tax;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public LinearLayout d_rc;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public LinearLayout d_ht;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public LinearLayout d_to;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public LinearLayout change_of_address;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public LinearLayout d_ha;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public LinearLayout hc;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public LinearLayout noc;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public LinearLayout rc_partucular;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public LinearLayout applStatusLl;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public LinearLayout verifyPaymentLl;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public LinearLayout disposeAppLl;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public LinearLayout updateMobileLl;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public TextView enrolled_state_vahan;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public tu7 viewModel;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public VersionService retrofitService;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(GetEnableStateModel getEnableStateModel) {
            VehicleServiceHome.this.J1().dismiss();
            if (StringsKt__StringsJVMKt.equals(getEnableStateModel.getStatusCode(), "MSTR001", true)) {
                com.nic.mparivahan.Dashboard.a.a.d(VehicleServiceHome.this, getEnableStateModel.getStates());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetEnableStateModel) obj);
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
            VehicleServiceHome.this.J1().dismiss();
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

    public static final void P1(VehicleServiceHome this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.J1().show();
        tu7 tu7VarO1 = this$0.O1();
        String string = com.nic.mparivahan.Dashboard.a.a.c().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        tu7VarO1.j(string);
    }

    public static final void Q1(VehicleServiceHome this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.e2(this$0);
    }

    public static final void R1(VehicleServiceHome this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new vh7(this$0).h(VContant.CHANGE_OF_ADDRESS, VContant.CHANGE_OF_ADDRESS_CODE);
        this$0.startActivity(new Intent(this$0, (Class<?>) VahanMainViewScreen.class));
    }

    public static final void S1(VehicleServiceHome this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) VahanApplication.class));
    }

    public static final void T1(VehicleServiceHome this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.e2(this$0);
    }

    public static final void U1(VehicleServiceHome this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) VahanWithdraw.class));
    }

    public static final void V1(VehicleServiceHome this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) VahanUpdateMobileActivity.class));
    }

    public static final void W1(VehicleServiceHome this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void X1(VehicleServiceHome this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new vh7(this$0).h(VContant.NOC, VContant.NOC_CODE);
        this$0.startActivity(new Intent(this$0, (Class<?>) VahanMainViewScreen.class));
    }

    public static final void Y1(VehicleServiceHome this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new vh7(this$0).h(VContant.RCPARTICULAR, VContant.RCPARTICULAR_CODE);
        this$0.startActivity(new Intent(this$0, (Class<?>) VahanMainViewScreen.class));
    }

    public static final void Z1(VehicleServiceHome this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new vh7(this$0).h(VContant.HYPOTHECATION_CONTINUATION, VContant.HYPOTHECATION_CONTINUATION_CODE);
        this$0.startActivity(new Intent(this$0, (Class<?>) VahanMainViewScreen.class));
    }

    public static final void a2(VehicleServiceHome this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new vh7(this$0).h(VContant.HYPOTHECATION_ADDITION, VContant.HYPOTHECATION_ADDITION_CODE);
        this$0.startActivity(new Intent(this$0, (Class<?>) VahanMainViewScreen.class));
    }

    public static final void b2(VehicleServiceHome this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new vh7(this$0).h(VContant.DUPLICATE_RC, VContant.DUPLICATE_RC_CODE);
        this$0.startActivity(new Intent(this$0, (Class<?>) VahanMainViewScreen.class));
    }

    public static final void c2(VehicleServiceHome this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new vh7(this$0).h(VContant.HYPOTHICATION_TERMINATION, VContant.HYPOTHICATION_TERMINATION_CODE);
        this$0.startActivity(new Intent(this$0, (Class<?>) VahanMainViewScreen.class));
    }

    public static final void d2(VehicleServiceHome this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new vh7(this$0).h(VContant.TRANFER_OF_OWNERSHIP, VContant.TRANFER_OF_OWNERSHIP_CODE);
        this$0.startActivity(new Intent(this$0, (Class<?>) VahanMainViewScreen.class));
    }

    public static final void f2(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public final LinearLayout A1() {
        LinearLayout linearLayout = this.d_ha;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("d_ha");
        return null;
    }

    public final LinearLayout B1() {
        LinearLayout linearLayout = this.d_ht;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("d_ht");
        return null;
    }

    public final LinearLayout C1() {
        LinearLayout linearLayout = this.d_rc;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("d_rc");
        return null;
    }

    public final LinearLayout D1() {
        LinearLayout linearLayout = this.d_to;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("d_to");
        return null;
    }

    public final LinearLayout E1() {
        LinearLayout linearLayout = this.disposeAppLl;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("disposeAppLl");
        return null;
    }

    public final TextView F1() {
        TextView textView = this.enrolled_state_vahan;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("enrolled_state_vahan");
        return null;
    }

    public final LinearLayout G1() {
        LinearLayout linearLayout = this.hc;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hc");
        return null;
    }

    public final LinearLayout H1() {
        LinearLayout linearLayout = this.nexgenarrow;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nexgenarrow");
        return null;
    }

    public final LinearLayout I1() {
        LinearLayout linearLayout = this.noc;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("noc");
        return null;
    }

    public final ProgressDialog J1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final LinearLayout K1() {
        LinearLayout linearLayout = this.pay_your_tax;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pay_your_tax");
        return null;
    }

    public final LinearLayout L1() {
        LinearLayout linearLayout = this.rc_partucular;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_partucular");
        return null;
    }

    public final LinearLayout M1() {
        LinearLayout linearLayout = this.updateMobileLl;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("updateMobileLl");
        return null;
    }

    public final LinearLayout N1() {
        LinearLayout linearLayout = this.verifyPaymentLl;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("verifyPaymentLl");
        return null;
    }

    public final tu7 O1() {
        tu7 tu7Var = this.viewModel;
        if (tu7Var != null) {
            return tu7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void e2(Context context) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText("Available Soon\n(Under Development)");
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wm7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VehicleServiceHome.f2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void g2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.applStatusLl = linearLayout;
    }

    public final void h2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.change_of_address = linearLayout;
    }

    public final void i2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.d_ha = linearLayout;
    }

    public final void j2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.d_ht = linearLayout;
    }

    public final void k2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.d_rc = linearLayout;
    }

    public final void l2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.d_to = linearLayout;
    }

    public final void m2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.disposeAppLl = linearLayout;
    }

    public final void n2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.enrolled_state_vahan = textView;
    }

    public final void o2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.hc = linearLayout;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_service_home);
        this.retrofitService = VersionService.INSTANCE.a(this);
        View viewFindViewById = findViewById(R.id.nexgenarrow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        p2((LinearLayout) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.pay_your_tax);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        s2((LinearLayout) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.d_rc);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        k2((LinearLayout) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.d_ht);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        j2((LinearLayout) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.d_to);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        l2((LinearLayout) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.change_of_address);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        h2((LinearLayout) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.d_ha);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        i2((LinearLayout) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.hc);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        o2((LinearLayout) viewFindViewById8);
        View viewFindViewById9 = findViewById(R.id.noc);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        q2((LinearLayout) viewFindViewById9);
        View viewFindViewById10 = findViewById(R.id.rc_partucular);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        t2((LinearLayout) viewFindViewById10);
        View viewFindViewById11 = findViewById(R.id.applStatusLl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        g2((LinearLayout) viewFindViewById11);
        View viewFindViewById12 = findViewById(R.id.verifyPaymentLl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        v2((LinearLayout) viewFindViewById12);
        View viewFindViewById13 = findViewById(R.id.disposeAppLl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        m2((LinearLayout) viewFindViewById13);
        View viewFindViewById14 = findViewById(R.id.enrolled_state_vahan);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        n2((TextView) viewFindViewById14);
        View viewFindViewById15 = findViewById(R.id.mobile_update_service);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
        u2((LinearLayout) viewFindViewById15);
        r2(new ProgressDialog(this));
        J1().setMessage("Please wait...");
        J1().setCancelable(false);
        J1().setCanceledOnTouchOutside(false);
        VersionService versionService = this.retrofitService;
        if (versionService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            versionService = null;
        }
        w2((tu7) new z(this, new z04(new kp7(versionService))).a(tu7.class));
        F1().setText("Enrolled States");
        F1().setPaintFlags(F1().getPaintFlags() | 8);
        F1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qm7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VehicleServiceHome.P1(this.a, view);
            }
        });
        O1().l().g(this, new c(new a()));
        O1().m().g(this, new c(new b()));
        K1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cn7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VehicleServiceHome.Q1(this.a, view);
            }
        });
        H1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dn7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VehicleServiceHome.W1(this.a, view);
            }
        });
        I1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.en7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VehicleServiceHome.X1(this.a, view);
            }
        });
        L1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fn7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VehicleServiceHome.Y1(this.a, view);
            }
        });
        G1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rm7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VehicleServiceHome.Z1(this.a, view);
            }
        });
        A1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sm7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VehicleServiceHome.a2(this.a, view);
            }
        });
        C1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tm7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VehicleServiceHome.b2(this.a, view);
            }
        });
        B1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.um7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VehicleServiceHome.c2(this.a, view);
            }
        });
        D1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vm7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VehicleServiceHome.d2(this.a, view);
            }
        });
        z1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xm7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VehicleServiceHome.R1(this.a, view);
            }
        });
        y1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ym7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VehicleServiceHome.S1(this.a, view);
            }
        });
        N1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zm7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VehicleServiceHome.T1(this.a, view);
            }
        });
        E1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.an7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VehicleServiceHome.U1(this.a, view);
            }
        });
        M1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bn7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VehicleServiceHome.V1(this.a, view);
            }
        });
    }

    public final void p2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.nexgenarrow = linearLayout;
    }

    public final void q2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.noc = linearLayout;
    }

    public final void r2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void s2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.pay_your_tax = linearLayout;
    }

    public final void t2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.rc_partucular = linearLayout;
    }

    public final void u2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.updateMobileLl = linearLayout;
    }

    public final void v2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.verifyPaymentLl = linearLayout;
    }

    public final void w2(tu7 tu7Var) {
        Intrinsics.checkNotNullParameter(tu7Var, "<set-?>");
        this.viewModel = tu7Var;
    }

    public final LinearLayout y1() {
        LinearLayout linearLayout = this.applStatusLl;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("applStatusLl");
        return null;
    }

    public final LinearLayout z1() {
        LinearLayout linearLayout = this.change_of_address;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("change_of_address");
        return null;
    }
}
