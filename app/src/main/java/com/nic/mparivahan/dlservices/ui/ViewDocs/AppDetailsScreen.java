package com.nic.mparivahan.dlservices.ui.ViewDocs;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.z;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sarathithreeservices.model.app_status.ApplStatusDetail;
import com.nic.mparivahan.Sarathithreeservices.model.app_status.GetAppStatusMain;
import com.nic.mparivahan.Sarathithreeservices.network.GetApplStatusService;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.nic.mparivahan.dlservices.ui.ViewDocs.AppDetailsScreen;
import com.zepto.bj2;
import com.zepto.cx;
import com.zepto.dx;
import com.zepto.j6;
import com.zepto.mf4;
import com.zepto.o40;
import com.zepto.q44;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bV\u0010WJ\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\t\u001a\u00020\u0002H\u0016J\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fR\u0016\u0010\u0011\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u0016\u0010\u001d\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u0016\u0010\u001f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0010R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0016\u00105\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u0010\u0010R\u0016\u00107\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u0010\u0010R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010E\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010\u0010\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010Q\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010.\u001a\u0004\bO\u00100\"\u0004\bP\u00102R\u0016\u0010U\u001a\u00020R8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006X"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/ViewDocs/AppDetailsScreen;", "Lcom/zepto/o40;", "", "J1", "K1", "E1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "Landroid/content/Context;", "context", "", "message", "N1", "F", "Ljava/lang/String;", "dlNo", "Lcom/zepto/j6;", "G", "Lcom/zepto/j6;", "G1", "()Lcom/zepto/j6;", "R1", "(Lcom/zepto/j6;)V", "mBinding", "H", "app_no", "I", "stateCode", "J", "dob", "Lcom/zepto/cx;", "K", "Lcom/zepto/cx;", "appStatusVM", "Lcom/nic/mparivahan/Sarathithreeservices/network/GetApplStatusService;", "L", "Lcom/nic/mparivahan/Sarathithreeservices/network/GetApplStatusService;", "D1", "()Lcom/nic/mparivahan/Sarathithreeservices/network/GetApplStatusService;", "P1", "(Lcom/nic/mparivahan/Sarathithreeservices/network/GetApplStatusService;)V", "appInfoService", "Lcom/zepto/wl5;", "M", "Lcom/zepto/wl5;", "I1", "()Lcom/zepto/wl5;", "U1", "(Lcom/zepto/wl5;)V", "sarthiSession", "N", "title_name", "O", "format_date", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "P", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "getRetrofitService", "()Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "S1", "(Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;)V", "retrofitService", "Q", "getStatusAdapter", "()Ljava/lang/String;", "setStatusAdapter", "(Ljava/lang/String;)V", "statusAdapter", "Lcom/zepto/wa3;", "R", "Lcom/zepto/wa3;", "F1", "()Lcom/zepto/wa3;", "Q1", "(Lcom/zepto/wa3;)V", "langSession", "S", "H1", "T1", "sarathiSession", "Landroid/app/ProgressDialog;", "T", "Landroid/app/ProgressDialog;", "dialog", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class AppDetailsScreen extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String dlNo;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public j6 mBinding;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String app_no;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String stateCode;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public cx appStatusVM;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public GetApplStatusService appInfoService;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String title_name;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String format_date;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public DlServiceInt retrofitService;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public wl5 sarathiSession;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public ProgressDialog dialog;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String dob = "";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String statusAdapter = "0";

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

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
        public final void a(GetAppStatusMain getAppStatusMain) {
            ProgressDialog progressDialog = AppDetailsScreen.this.dialog;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            progressDialog.dismiss();
            try {
                if (Intrinsics.areEqual(getAppStatusMain.getStatus_code(), "00") && Intrinsics.areEqual(getAppStatusMain.getStatus_desc(), "Success")) {
                    AppDetailsScreen.this.G1().l.setVisibility(0);
                    AppDetailsScreen.this.G1().m.setVisibility(0);
                    List<ApplStatusDetail> applStatus_Details = getAppStatusMain.getApplStatus_Details();
                    AppDetailsScreen.this.G1().g.setText(applStatus_Details.get(0).getApplno());
                    AppDetailsScreen.this.G1().c.setText(applStatus_Details.get(0).getApplName());
                    AppDetailsScreen.this.G1().e.setText(applStatus_Details.get(0).getDob());
                    AppDetailsScreen.this.G1().r.setText(applStatus_Details.get(0).getRtoCd());
                    AppDetailsScreen.this.G1().p.setText(applStatus_Details.get(0).getRtoName());
                    Iterator<List<String>> it = applStatus_Details.get(0).getReqObjlst().iterator();
                    if (it.hasNext()) {
                        List<String> next = it.next();
                        AppDetailsScreen.this.G1().j.setText(next.get(0) + ".  " + next.get(1));
                        AppDetailsScreen.this.H1().t(next.get(1), "0000");
                        AppDetailsScreen.this.G1().o.setVisibility(8);
                        if (next.size() >= 3) {
                            AppDetailsScreen.this.dlNo = next.get(3);
                        }
                    }
                } else {
                    AppDetailsScreen.this.G1().l.setVisibility(0);
                    AppDetailsScreen.this.G1().m.setVisibility(0);
                    AppDetailsScreen appDetailsScreen = AppDetailsScreen.this;
                    appDetailsScreen.N1(appDetailsScreen, getAppStatusMain.getStatus_desc());
                }
            } catch (Exception unused) {
                AppDetailsScreen.this.G1().l.setVisibility(8);
                AppDetailsScreen.this.G1().m.setVisibility(8);
                AppDetailsScreen appDetailsScreen2 = AppDetailsScreen.this;
                appDetailsScreen2.N1(appDetailsScreen2, appDetailsScreen2.F1().b("service_is_not_present", AppDetailsScreen.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetAppStatusMain) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public b(Function1 function) {
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

    private final void E1() {
        cx cxVar = null;
        if (q44.a.a(this)) {
            ProgressDialog progressDialog = this.dialog;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            progressDialog.show();
            cx cxVar2 = this.appStatusVM;
            if (cxVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appStatusVM");
                cxVar2 = null;
            }
            String str = this.app_no;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("app_no");
                str = null;
            }
            String str2 = this.format_date;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("format_date");
                str2 = null;
            }
            cxVar2.h(this, str, str2);
        } else {
            N1(this, F1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)));
        }
        cx cxVar3 = this.appStatusVM;
        if (cxVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appStatusVM");
        } else {
            cxVar = cxVar3;
        }
        cxVar.k().g(this, new b(new a()));
    }

    private final void J1() {
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.dialog = progressDialog;
        progressDialog.setMessage(F1().b("label_challan_please_wait", "Please wait..."));
        T1(new wl5(this));
        G1().k.f.setText(H1().k());
        Intent intent = getIntent();
        if (intent != null) {
            try {
                String stringExtra = intent.getStringExtra("app_no");
                Intrinsics.checkNotNull(stringExtra, "null cannot be cast to non-null type kotlin.String");
                this.app_no = stringExtra;
                String stringExtra2 = intent.getStringExtra("stateCode");
                Intrinsics.checkNotNull(stringExtra2, "null cannot be cast to non-null type kotlin.String");
                this.stateCode = stringExtra2;
                if (intent.getStringExtra("statusAdapter") != null) {
                    String stringExtra3 = intent.getStringExtra("statusAdapter");
                    Intrinsics.checkNotNull(stringExtra3, "null cannot be cast to non-null type kotlin.String");
                    this.statusAdapter = stringExtra3;
                }
                if (Intrinsics.areEqual(this.statusAdapter, VContant.MAINSCREEN)) {
                    String stringExtra4 = intent.getStringExtra("dob");
                    Intrinsics.checkNotNull(stringExtra4, "null cannot be cast to non-null type kotlin.String");
                    this.dob = stringExtra4;
                    String str = new SimpleDateFormat("dd-MM-yyyy").format(new SimpleDateFormat("yyyy-MM-dd").parse(this.dob));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    this.dob = str;
                } else {
                    String stringExtra5 = intent.getStringExtra("dob");
                    Intrinsics.checkNotNull(stringExtra5, "null cannot be cast to non-null type kotlin.String");
                    this.dob = stringExtra5;
                }
            } catch (Exception e) {
                Log.d("errors", e.getLocalizedMessage());
            }
        }
        try {
            this.appStatusVM = (cx) new z(this, new dx(new bj2(D1()))).a(cx.class);
            U1(new wl5(this));
            this.title_name = I1().k();
            AppCompatTextView appCompatTextView = G1().t;
            String str2 = this.title_name;
            String str3 = null;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("title_name");
                str2 = null;
            }
            appCompatTextView.setText(str2);
            String str4 = this.app_no;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("app_no");
            } else {
                str3 = str4;
            }
            if (str3.length() <= 0 && this.dob.length() <= 0) {
                return;
            }
            String str5 = new SimpleDateFormat("dd/MM/yyyy").format(new SimpleDateFormat("dd-MM-yyyy").parse(this.dob));
            Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
            this.format_date = str5;
            E1();
        } catch (Exception e2) {
            Log.d("errors1", e2.getLocalizedMessage());
        }
    }

    private final void K1() {
        G1().i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppDetailsScreen.L1(this.a, view);
            }
        });
        G1().h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppDetailsScreen.M1(this.a, view);
            }
        });
    }

    public static final void L1(AppDetailsScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) ViewDocScreen.class);
        String str = this$0.app_no;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("app_no");
            str = null;
        }
        intent.putExtra("app_no", str);
        intent.putExtra("dob", this$0.dob);
        String str3 = this$0.stateCode;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateCode");
        } else {
            str2 = str3;
        }
        intent.putExtra("stateCode", str2);
        this$0.startActivity(intent);
    }

    public static final void M1(AppDetailsScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void O1(Dialog d, AppDetailsScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.finish();
    }

    public final GetApplStatusService D1() {
        GetApplStatusService getApplStatusService = this.appInfoService;
        if (getApplStatusService != null) {
            return getApplStatusService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appInfoService");
        return null;
    }

    public final wa3 F1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final j6 G1() {
        j6 j6Var = this.mBinding;
        if (j6Var != null) {
            return j6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    public final wl5 H1() {
        wl5 wl5Var = this.sarathiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarathiSession");
        return null;
    }

    public final wl5 I1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final void N1(Context context, String message) {
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
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(F1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(F1().b("btn_ok", "OK"));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.es
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppDetailsScreen.O1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final void P1(GetApplStatusService getApplStatusService) {
        Intrinsics.checkNotNullParameter(getApplStatusService, "<set-?>");
        this.appInfoService = getApplStatusService;
    }

    public final void Q1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void R1(j6 j6Var) {
        Intrinsics.checkNotNullParameter(j6Var, "<set-?>");
        this.mBinding = j6Var;
    }

    public final void S1(DlServiceInt dlServiceInt) {
        Intrinsics.checkNotNullParameter(dlServiceInt, "<set-?>");
        this.retrofitService = dlServiceInt;
    }

    public final void T1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarathiSession = wl5Var;
    }

    public final void U1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        j6 j6VarC = j6.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(j6VarC, "inflate(...)");
        R1(j6VarC);
        setContentView(G1().b());
        Q1(new wa3(this));
        S1(DlServiceInt.INSTANCE.a(this));
        P1(GetApplStatusService.INSTANCE.a(this));
        J1();
        K1();
        ta3.a.m(this, G1());
    }
}
