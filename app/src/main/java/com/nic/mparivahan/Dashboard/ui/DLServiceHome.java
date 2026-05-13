package com.nic.mparivahan.Dashboard.ui;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.z;
import com.nic.mparivahan.Account.Model.GetEnableStateModel;
import com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen;
import com.nic.mparivahan.Dashboard.a;
import com.nic.mparivahan.Dashboard.ui.DLServiceHome;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sarathithreeservices.view.ApplicationStatusActivity;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.Welcome.VersionService;
import com.zepto.kp7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.tu7;
import com.zepto.w8;
import com.zepto.wl5;
import com.zepto.z04;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/nic/mparivahan/Dashboard/ui/DLServiceHome;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/content/Context;", "context", "N1", "Lcom/zepto/tu7;", "C", "Lcom/zepto/tu7;", "y1", "()Lcom/zepto/tu7;", "Q1", "(Lcom/zepto/tu7;)V", "viewModel", "Lcom/nic/mparivahan/Welcome/VersionService;", "D", "Lcom/nic/mparivahan/Welcome/VersionService;", "retrofitService", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "x1", "()Landroid/app/ProgressDialog;", "P1", "(Landroid/app/ProgressDialog;)V", "pDialog", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class DLServiceHome extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public tu7 viewModel;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public VersionService retrofitService;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    public static final void A1(DLServiceHome this$0, GetEnableStateModel getEnableStateModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.x1().dismiss();
        if (StringsKt__StringsJVMKt.equals(getEnableStateModel.getStatusCode(), "MSTR001", true)) {
            a.a.d(this$0, getEnableStateModel.getStates());
        }
    }

    public static final void B1(DLServiceHome this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) ApplicationStatusActivity.class);
        new wl5(this$0).t("Application Status", VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE);
        this$0.startActivity(intent);
    }

    public static final void C1(DLServiceHome this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.N1(this$0);
    }

    public static final void D1(DLServiceHome this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.N1(this$0);
    }

    public static final void E1(DLServiceHome this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) DlServicesMainScreen.class);
        new wl5(this$0).t("Update Mobile Number", "10");
        this$0.startActivity(intent);
    }

    public static final void F1(DLServiceHome this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.x1().dismiss();
    }

    public static final void G1(DLServiceHome this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void H1(DLServiceHome this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) DlServicesMainScreen.class);
        new wl5(this$0).t("Renewal of DL", VContant.MAINSCREEN);
        this$0.startActivity(intent);
    }

    public static final void I1(DLServiceHome this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) DlServicesMainScreen.class);
        new wl5(this$0).t("Issue of Duplicate DL", VContant.APPLICATION_SCREEN);
        this$0.startActivity(intent);
    }

    public static final void J1(DLServiceHome this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) DlServicesMainScreen.class);
        new wl5(this$0).t("Change of Address in DL", "3");
        this$0.startActivity(intent);
    }

    public static final void K1(DLServiceHome this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) DlServicesMainScreen.class);
        new wl5(this$0).t("International Driving Permit", "4");
        this$0.startActivity(intent);
    }

    public static final void L1(DLServiceHome this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) DlServicesMainScreen.class);
        new wl5(this$0).t("DL Extract", VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE);
        this$0.startActivity(intent);
    }

    public static final void M1(DLServiceHome this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) DlServicesMainScreen.class);
        new wl5(this$0).t("Replacement of DL", VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE);
        this$0.startActivity(intent);
    }

    public static final void O1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void z1(DLServiceHome this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.x1().show();
        tu7 tu7VarY1 = this$0.y1();
        String string = a.a.b().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        tu7VarY1.j(string);
    }

    public final void N1(Context context) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fb1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLServiceHome.O1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void P1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void Q1(tu7 tu7Var) {
        Intrinsics.checkNotNullParameter(tu7Var, "<set-?>");
        this.viewModel = tu7Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_l_service_home);
        this.retrofitService = VersionService.INSTANCE.a(this);
        P1(new ProgressDialog(this));
        x1().setMessage("Please wait...");
        x1().setCancelable(false);
        x1().setCanceledOnTouchOutside(false);
        VersionService versionService = this.retrofitService;
        if (versionService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            versionService = null;
        }
        Q1((tu7) new z(this, new z04(new kp7(versionService))).a(tu7.class));
        w8 w8VarC = w8.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(w8VarC, "inflate(...)");
        setContentView(w8VarC.b());
        w8VarC.h.setText("Enrolled States");
        TextView textView = w8VarC.h;
        textView.setPaintFlags(textView.getPaintFlags() | 8);
        w8VarC.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ab1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLServiceHome.z1(this.a, view);
            }
        });
        y1().l().g(this, new mf4() { // from class: com.zepto.kb1
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                DLServiceHome.A1(this.a, (GetEnableStateModel) obj);
            }
        });
        y1().m().g(this, new mf4() { // from class: com.zepto.lb1
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                DLServiceHome.F1(this.a, (String) obj);
            }
        });
        w8VarC.k.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mb1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLServiceHome.G1(this.a, view);
            }
        });
        w8VarC.m.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nb1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLServiceHome.H1(this.a, view);
            }
        });
        w8VarC.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ob1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLServiceHome.I1(this.a, view);
            }
        });
        w8VarC.c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bb1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLServiceHome.J1(this.a, view);
            }
        });
        w8VarC.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cb1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLServiceHome.K1(this.a, view);
            }
        });
        w8VarC.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.db1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLServiceHome.L1(this.a, view);
            }
        });
        w8VarC.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.eb1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLServiceHome.M1(this.a, view);
            }
        });
        w8VarC.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gb1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLServiceHome.B1(this.a, view);
            }
        });
        w8VarC.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hb1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLServiceHome.C1(this.a, view);
            }
        });
        w8VarC.n.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ib1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLServiceHome.D1(this.a, view);
            }
        });
        w8VarC.j.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jb1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLServiceHome.E1(this.a, view);
            }
        });
    }

    public final ProgressDialog x1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final tu7 y1() {
        tu7 tu7Var = this.viewModel;
        if (tu7Var != null) {
            return tu7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }
}
