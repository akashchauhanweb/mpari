package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.gson.Gson;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.ApplicationStatusModel.AppliByRcModle;
import com.nic.mparivahan.VahanServices.ApplicationStatusModel.Currentlist;
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.ApplStatusApplicationList;
import com.nic.mparivahan.VahanServices.VahanModel.ApplicationStatusSuccessModel;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationServiceOtp;
import com.zepto.cv6;
import com.zepto.ev;
import com.zepto.fv6;
import com.zepto.m6;
import com.zepto.mf4;
import com.zepto.ow;
import com.zepto.pq;
import com.zepto.pw;
import com.zepto.wa3;
import com.zepto.yy0;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b@\u0010AJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0003J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\"\u0010\u0011\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010;\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00103\u001a\u0004\b9\u00105\"\u0004\b:\u00107R\"\u0010?\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u00103\u001a\u0004\b=\u00105\"\u0004\b>\u00107¨\u0006B"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanApplicationStatus/ApplStatusApplicationList;", "Lcom/zepto/pq;", "Lcom/zepto/cv6;", "", "applNo", "stateCd", "", "n1", "it", "C1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "application_no", "", "position", "rcno", "y", "Lcom/zepto/m6;", "C", "Lcom/zepto/m6;", "q1", "()Lcom/zepto/m6;", "y1", "(Lcom/zepto/m6;)V", "binding", "Lcom/nic/mparivahan/VahanServices/ApplicationStatusModel/AppliByRcModle;", "D", "Lcom/nic/mparivahan/VahanServices/ApplicationStatusModel/AppliByRcModle;", "o1", "()Lcom/nic/mparivahan/VahanServices/ApplicationStatusModel/AppliByRcModle;", "w1", "(Lcom/nic/mparivahan/VahanServices/ApplicationStatusModel/AppliByRcModle;)V", "applicationList", "Lcom/zepto/ev;", "E", "Lcom/zepto/ev;", "otpViewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationServiceOtp;", "F", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationServiceOtp;", "otpRetrofitService", "Landroid/app/ProgressDialog;", "G", "Landroid/app/ProgressDialog;", "r1", "()Landroid/app/ProgressDialog;", "z1", "(Landroid/app/ProgressDialog;)V", "pDialog", "H", "Ljava/lang/String;", "p1", "()Ljava/lang/String;", "x1", "(Ljava/lang/String;)V", "I", "s1", "A1", "rc_no", "J", "t1", "B1", "state_code", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ApplStatusApplicationList extends pq implements cv6 {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public m6 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public AppliByRcModle applicationList;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ev otpViewModel;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ApplicationServiceOtp otpRetrofitService;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String application_no;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String rc_no;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String state_code;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(ApplicationStatusSuccessModel applicationStatusSuccessModel) {
            if (ApplStatusApplicationList.this.r1().isShowing()) {
                ApplStatusApplicationList.this.r1().dismiss();
            }
            try {
                if (applicationStatusSuccessModel.getTransList().size() <= 0) {
                    ApplStatusApplicationList.this.C1("No application status found for this application no.");
                    return;
                }
                Intent intent = new Intent(ApplStatusApplicationList.this, (Class<?>) VahanApplicationTransactionStatus.class);
                intent.putExtra("transList", new Gson().toJson(applicationStatusSuccessModel.getTransList()));
                intent.putExtra("applicationNo", ApplStatusApplicationList.this.p1());
                intent.putExtra("ownerName", "--");
                intent.putExtra("stateCd", ApplStatusApplicationList.this.t1());
                intent.putExtra("regNo", ApplStatusApplicationList.this.s1());
                ApplStatusApplicationList.this.startActivity(intent);
            } catch (Exception e) {
                e.printStackTrace();
                ApplStatusApplicationList applStatusApplicationList = ApplStatusApplicationList.this;
                applStatusApplicationList.C1(applStatusApplicationList.getString(R.string.service_unavable_please_try));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ApplicationStatusSuccessModel) obj);
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
            if (ApplStatusApplicationList.this.r1().isShowing()) {
                ApplStatusApplicationList.this.r1().dismiss();
            }
            ApplStatusApplicationList.this.C1("No application status found for this application no.");
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void C1(String it) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        textView2.setVisibility(8);
        textView.setText("Ok");
        textView.setBackground(yy0.e(this, R.drawable.shape_red));
        textView.setTextColor(yy0.c(this, R.color.white));
        ((TextView) viewFindViewById).setText(it);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplStatusApplicationList.D1(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.iv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplStatusApplicationList.E1(dialog, view);
            }
        });
        dialog.show();
    }

    public static final void D1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    private final void n1(String applNo, String stateCd) {
        r1().show();
        x1(applNo);
        B1(stateCd);
        ev evVar = this.otpViewModel;
        if (evVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
            evVar = null;
        }
        evVar.o(this, applNo, stateCd);
    }

    public static final void u1(ApplStatusApplicationList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void v1(ApplStatusApplicationList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public final void A1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_no = str;
    }

    public final void B1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.state_code = str;
    }

    public final AppliByRcModle o1() {
        AppliByRcModle appliByRcModle = this.applicationList;
        if (appliByRcModle != null) {
            return appliByRcModle;
        }
        Intrinsics.throwUninitializedPropertyAccessException("applicationList");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appl_status_application_list);
        m6 m6VarC = m6.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m6VarC, "inflate(...)");
        y1(m6VarC);
        setContentView(q1().b());
        q1().b.i.setText(new wa3(this).b("label_application_status", "Application Status"));
        z1(new ProgressDialog(this));
        r1().setMessage("Please wait...");
        r1().setCancelable(false);
        r1().setCanceledOnTouchOutside(false);
        this.otpRetrofitService = ApplicationServiceOtp.INSTANCE.a(this);
        ev evVar = null;
        try {
            ApplicationServiceOtp applicationServiceOtp = this.otpRetrofitService;
            if (applicationServiceOtp == null) {
                Intrinsics.throwUninitializedPropertyAccessException("otpRetrofitService");
                applicationServiceOtp = null;
            }
            this.otpViewModel = (ev) new z(this, new fv6(new pw(applicationServiceOtp))).a(ev.class);
            q1().d.setLayoutManager(new LinearLayoutManager(this, 1, false));
            Serializable serializableExtra = getIntent().getSerializableExtra("current");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.ApplicationStatusModel.AppliByRcModle");
            w1((AppliByRcModle) serializableExtra);
            ArrayList<Currentlist> currentlist = o1().get1().getCurrentlist();
            if (currentlist.size() > 0) {
                q1().d.setAdapter(new ow(currentlist, this, this));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        ev evVar2 = this.otpViewModel;
        if (evVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
            evVar2 = null;
        }
        evVar2.n().g(this, new c(new a()));
        ev evVar3 = this.otpViewModel;
        if (evVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
        } else {
            evVar = evVar3;
        }
        evVar.k().g(this, new c(new b()));
        q1().b.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplStatusApplicationList.u1(this.a, view);
            }
        });
        q1().b.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplStatusApplicationList.v1(this.a, view);
            }
        });
    }

    public final String p1() {
        String str = this.application_no;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("application_no");
        return null;
    }

    public final m6 q1() {
        m6 m6Var = this.binding;
        if (m6Var != null) {
            return m6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final ProgressDialog r1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String s1() {
        String str = this.rc_no;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_no");
        return null;
    }

    public final String t1() {
        String str = this.state_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("state_code");
        return null;
    }

    public final void w1(AppliByRcModle appliByRcModle) {
        Intrinsics.checkNotNullParameter(appliByRcModle, "<set-?>");
        this.applicationList = appliByRcModle;
    }

    public final void x1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.application_no = str;
    }

    @Override // com.zepto.cv6
    public void y(String application_no, int position, String rcno) {
        Intrinsics.checkNotNullParameter(rcno, "rcno");
        A1(rcno);
        String strValueOf = String.valueOf(application_no);
        String strSubstring = String.valueOf(application_no).substring(0, 2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        n1(strValueOf, strSubstring);
    }

    public final void y1(m6 m6Var) {
        Intrinsics.checkNotNullParameter(m6Var, "<set-?>");
        this.binding = m6Var;
    }

    public final void z1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }
}
