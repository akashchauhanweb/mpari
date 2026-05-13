package com.nic.mparivahan.dlservices.ui.appcancel;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.ClServices.ClInterface.ClInter;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.nic.mparivahan.dlservices.ui.appcancel.ApplicationCancel;
import com.nic.mparivahan.dlservices.ui.appcancel.Pojo.DLDetailsForCancelApplPojo;
import com.zepto.jl0;
import com.zepto.kl0;
import com.zepto.lr1;
import com.zepto.mf4;
import com.zepto.n6;
import com.zepto.nr1;
import com.zepto.pq;
import com.zepto.rq1;
import com.zepto.sn0;
import com.zepto.ta3;
import com.zepto.va3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.ws6;
import java.util.Calendar;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\\\u0010]J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0016\u0010[\u001a\u00020X8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006^"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/appcancel/ApplicationCancel;", "Lcom/zepto/pq;", "", "u1", "m1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/n6;", "C", "Lcom/zepto/n6;", "p1", "()Lcom/zepto/n6;", "z1", "(Lcom/zepto/n6;)V", "mBinding", "Ljava/util/Calendar;", "D", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "", "E", "Ljava/lang/String;", "dateformate", "Landroid/content/Context;", "F", "Landroid/content/Context;", "mContext", "Lcom/zepto/wl5;", "G", "Lcom/zepto/wl5;", "t1", "()Lcom/zepto/wl5;", "D1", "(Lcom/zepto/wl5;)V", "sarathiSession", "Lcom/zepto/wa3;", "H", "Lcom/zepto/wa3;", "o1", "()Lcom/zepto/wa3;", "y1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/kl0;", "I", "Lcom/zepto/kl0;", "q1", "()Lcom/zepto/kl0;", "A1", "(Lcom/zepto/kl0;)V", "mClDlViewModel", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "J", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "r1", "()Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "B1", "(Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;)V", "mClInter", "Lcom/zepto/ws6;", "K", "Lcom/zepto/ws6;", "getSessionManager", "()Lcom/zepto/ws6;", "E1", "(Lcom/zepto/ws6;)V", "sessionManager", "Lcom/zepto/nr1;", "L", "Lcom/zepto/nr1;", "getDlServicesViewModel", "()Lcom/zepto/nr1;", "x1", "(Lcom/zepto/nr1;)V", "dlServicesViewModel", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "M", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "s1", "()Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "C1", "(Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;)V", "retrofitService", "Landroid/app/ProgressDialog;", "N", "Landroid/app/ProgressDialog;", "dialog", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ApplicationCancel extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public n6 mBinding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public Calendar cal;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String dateformate;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wl5 sarathiSession;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public kl0 mClDlViewModel;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ClInter mClInter;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public nr1 dlServicesViewModel;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public DlServiceInt retrofitService;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ProgressDialog dialog;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(DLDetailsForCancelApplPojo dLDetailsForCancelApplPojo) {
            ProgressDialog progressDialog = null;
            try {
                ProgressDialog progressDialog2 = ApplicationCancel.this.dialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog2 = null;
                }
                if (progressDialog2.isShowing()) {
                    ProgressDialog progressDialog3 = ApplicationCancel.this.dialog;
                    if (progressDialog3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                        progressDialog3 = null;
                    }
                    progressDialog3.dismiss();
                }
                if (StringsKt__StringsJVMKt.equals(dLDetailsForCancelApplPojo.getStatus_code(), "00", true)) {
                    Intent intent = new Intent(ApplicationCancel.this, (Class<?>) ApplicantDetails.class);
                    intent.putParcelableArrayListExtra("slotData", dLDetailsForCancelApplPojo.getSlot_Details());
                    intent.putExtra("applNo", ApplicationCancel.this.p1().c.getText().toString());
                    ApplicationCancel.this.startActivity(intent);
                }
            } catch (Exception e) {
                e.printStackTrace();
                ProgressDialog progressDialog4 = ApplicationCancel.this.dialog;
                if (progressDialog4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog4 = null;
                }
                if (progressDialog4.isShowing()) {
                    ProgressDialog progressDialog5 = ApplicationCancel.this.dialog;
                    if (progressDialog5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    } else {
                        progressDialog = progressDialog5;
                    }
                    progressDialog.dismiss();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DLDetailsForCancelApplPojo) obj);
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
            ProgressDialog progressDialog = ApplicationCancel.this.dialog;
            ProgressDialog progressDialog2 = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog3 = ApplicationCancel.this.dialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    progressDialog2 = progressDialog3;
                }
                progressDialog2.dismiss();
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

    public ApplicationCancel() {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
        this.cal = calendar;
    }

    private final void m1() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.ov
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                ApplicationCancel.n1(this.a, datePicker, i, i2, i3);
            }
        }, this.cal.get(1), this.cal.get(2), this.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void n1(ApplicationCancel this$0, DatePicker datePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cal.set(1, i);
        this$0.cal.set(2, i2);
        this$0.cal.set(5, i3);
        CharSequence charSequence = DateFormat.format("dd", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence2 = DateFormat.format("MM", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence3 = DateFormat.format("yyyy", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence3, "null cannot be cast to non-null type kotlin.String");
        this$0.dateformate = ((String) charSequence) + '/' + ((String) charSequence2) + '/' + ((String) charSequence3);
        TextView textView = this$0.p1().b;
        String str = this$0.dateformate;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dateformate");
            str = null;
        }
        textView.setText(str);
    }

    private final void u1() {
        this.mContext = this;
        Context context = this.mContext;
        Context context2 = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        D1(new wl5(context));
        Context context3 = this.mContext;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context3 = null;
        }
        y1(new wa3(context3));
        Context context4 = this.mContext;
        if (context4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context4 = null;
        }
        E1(new ws6(context4));
        DlServiceInt.Companion companion = DlServiceInt.INSTANCE;
        Context context5 = this.mContext;
        if (context5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        } else {
            context2 = context5;
        }
        C1(companion.a(context2));
        p1().g.f.setText(t1().k());
        p1().e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplicationCancel.v1(this.a, view);
            }
        });
        x1((nr1) new z(this, new rq1(new lr1(s1(), this))).a(nr1.class));
        B1(ClInter.INSTANCE.a(this));
        A1((kl0) new z(this, new sn0(new jl0(r1()))).a(kl0.class));
        p1().l.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplicationCancel.w1(this.a, view);
            }
        });
    }

    public static final void v1(ApplicationCancel this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m1();
    }

    public static final void w1(ApplicationCancel this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ProgressDialog progressDialog = null;
        try {
            if (this$0.p1().c.getText().toString().length() == 0) {
                Toast.makeText(this$0, this$0.o1().b(va3.a.E(), this$0.getString(R.string.enter_application_no)), 1).show();
                return;
            }
            if (this$0.p1().b.getText().toString().length() != 0 && !Intrinsics.areEqual(this$0.p1().b.getText().toString(), "")) {
                ProgressDialog progressDialog2 = this$0.dialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog2 = null;
                }
                if (progressDialog2.isShowing()) {
                    ProgressDialog progressDialog3 = this$0.dialog;
                    if (progressDialog3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                        progressDialog3 = null;
                    }
                    progressDialog3.dismiss();
                }
                ProgressDialog progressDialog4 = this$0.dialog;
                if (progressDialog4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog4 = null;
                }
                progressDialog4.show();
                kl0 kl0VarQ1 = this$0.q1();
                String string = this$0.p1().c.getText().toString();
                String str = this$0.dateformate;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dateformate");
                    str = null;
                }
                kl0VarQ1.k(this$0, string, str);
                return;
            }
            Toast.makeText(this$0, this$0.o1().b("edit_dl_serv_dob", this$0.getString(R.string.enter_dob)), 1).show();
        } catch (Exception e) {
            e.printStackTrace();
            ProgressDialog progressDialog5 = this$0.dialog;
            if (progressDialog5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog5 = null;
            }
            if (progressDialog5.isShowing()) {
                ProgressDialog progressDialog6 = this$0.dialog;
                if (progressDialog6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    progressDialog = progressDialog6;
                }
                progressDialog.dismiss();
            }
        }
    }

    public final void A1(kl0 kl0Var) {
        Intrinsics.checkNotNullParameter(kl0Var, "<set-?>");
        this.mClDlViewModel = kl0Var;
    }

    public final void B1(ClInter clInter) {
        Intrinsics.checkNotNullParameter(clInter, "<set-?>");
        this.mClInter = clInter;
    }

    public final void C1(DlServiceInt dlServiceInt) {
        Intrinsics.checkNotNullParameter(dlServiceInt, "<set-?>");
        this.retrofitService = dlServiceInt;
    }

    public final void D1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarathiSession = wl5Var;
    }

    public final void E1(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final wa3 o1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        n6 n6VarC = n6.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(n6VarC, "inflate(...)");
        z1(n6VarC);
        setContentView(p1().b());
        y1(new wa3(this));
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.dialog = progressDialog;
        progressDialog.setMessage(o1().b("label_challan_getting_details", "Please wait..."));
        ProgressDialog progressDialog2 = this.dialog;
        ProgressDialog progressDialog3 = null;
        if (progressDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog2 = null;
        }
        progressDialog2.setCanceledOnTouchOutside(false);
        ProgressDialog progressDialog4 = this.dialog;
        if (progressDialog4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        } else {
            progressDialog3 = progressDialog4;
        }
        progressDialog3.setCancelable(false);
        u1();
        ta3.a.E(this, p1());
        q1().o().g(this, new c(new a()));
        q1().l().g(this, new c(new b()));
    }

    public final n6 p1() {
        n6 n6Var = this.mBinding;
        if (n6Var != null) {
            return n6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    public final kl0 q1() {
        kl0 kl0Var = this.mClDlViewModel;
        if (kl0Var != null) {
            return kl0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mClDlViewModel");
        return null;
    }

    public final ClInter r1() {
        ClInter clInter = this.mClInter;
        if (clInter != null) {
            return clInter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mClInter");
        return null;
    }

    public final DlServiceInt s1() {
        DlServiceInt dlServiceInt = this.retrofitService;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final wl5 t1() {
        wl5 wl5Var = this.sarathiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarathiSession");
        return null;
    }

    public final void x1(nr1 nr1Var) {
        Intrinsics.checkNotNullParameter(nr1Var, "<set-?>");
        this.dlServicesViewModel = nr1Var;
    }

    public final void y1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void z1(n6 n6Var) {
        Intrinsics.checkNotNullParameter(n6Var, "<set-?>");
        this.mBinding = n6Var;
    }
}
