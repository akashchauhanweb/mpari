package com.nic.mparivahan.ServiceWithdrawnScreen.Activity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.R;
import com.nic.mparivahan.ServiceWithdrawnScreen.Activity.ApplicationDetails;
import com.nic.mparivahan.ServiceWithdrawnScreen.Modal.ApplicationEligilityResultModal;
import com.nic.mparivahan.ServiceWithdrawnScreen.Modal.CheckApplicationEligibilityModal;
import com.nic.mparivahan.dlservices.ui.editlearnerlicence.Service.ServiceWithdrawn;
import com.zepto.dz5;
import com.zepto.ez5;
import com.zepto.gz5;
import com.zepto.hz5;
import com.zepto.kt6;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.va3;
import com.zepto.wa3;
import com.zepto.wl5;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bA\u0010BJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0003J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\b\u0010\b\u001a\u00020\u0002H\u0002R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00107R\u0016\u0010<\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00107R\u0016\u0010>\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00107R\u0016\u0010@\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00107¨\u0006C"}, d2 = {"Lcom/nic/mparivahan/ServiceWithdrawnScreen/Activity/ApplicationDetails;", "Lcom/zepto/pq;", "", "z1", "G1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "v1", "Lcom/zepto/dz5;", "C", "Lcom/zepto/dz5;", "binding", "Landroid/app/ProgressDialog;", "D", "Landroid/app/ProgressDialog;", "dialog", "Landroid/content/Context;", "E", "Landroid/content/Context;", "mContext", "Lcom/zepto/wl5;", "F", "Lcom/zepto/wl5;", "y1", "()Lcom/zepto/wl5;", "F1", "(Lcom/zepto/wl5;)V", "sarathiSession", "Lcom/zepto/wa3;", "G", "Lcom/zepto/wa3;", "x1", "()Lcom/zepto/wa3;", "E1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/hz5;", "H", "Lcom/zepto/hz5;", "viewModal", "Lcom/nic/mparivahan/dlservices/ui/editlearnerlicence/Service/ServiceWithdrawn;", "I", "Lcom/nic/mparivahan/dlservices/ui/editlearnerlicence/Service/ServiceWithdrawn;", "service", "Ljava/util/Calendar;", "J", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "", "K", "Ljava/lang/String;", "dateformate", "L", "fatherName", "M", "fullName", "N", "relationType", "O", "mobileNo", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ApplicationDetails extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public dz5 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ProgressDialog dialog;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wl5 sarathiSession;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public hz5 viewModal;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ServiceWithdrawn service;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public Calendar cal;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String dateformate;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String fatherName;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String fullName;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String relationType;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String mobileNo;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(CheckApplicationEligibilityModal checkApplicationEligibilityModal) {
            ProgressDialog progressDialog = null;
            try {
                ProgressDialog progressDialog2 = ApplicationDetails.this.dialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog2 = null;
                }
                if (progressDialog2.isShowing()) {
                    ProgressDialog progressDialog3 = ApplicationDetails.this.dialog;
                    if (progressDialog3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                        progressDialog3 = null;
                    }
                    progressDialog3.dismiss();
                }
                if (!StringsKt__StringsJVMKt.equals(checkApplicationEligibilityModal.getStatusCd(), "00", true)) {
                    ApplicationDetails applicationDetails = ApplicationDetails.this;
                    ArrayList<ApplicationEligilityResultModal> result = checkApplicationEligibilityModal.getResult();
                    Intrinsics.checkNotNull(result);
                    Toast.makeText(applicationDetails, result.get(0).getErrorMsg(), 0).show();
                    return;
                }
                ApplicationDetails applicationDetails2 = ApplicationDetails.this;
                StringBuilder sb = new StringBuilder();
                ArrayList<ApplicationEligilityResultModal> result2 = checkApplicationEligibilityModal.getResult();
                Intrinsics.checkNotNull(result2);
                sb.append(result2.get(0).getFName());
                sb.append(' ');
                sb.append(checkApplicationEligibilityModal.getResult().get(0).getMName());
                sb.append(' ');
                sb.append(checkApplicationEligibilityModal.getResult().get(0).getLName());
                applicationDetails2.fullName = sb.toString();
                ApplicationDetails.this.fatherName = checkApplicationEligibilityModal.getResult().get(0).getRelativeFName() + ' ' + checkApplicationEligibilityModal.getResult().get(0).getRelativeMName() + ' ' + checkApplicationEligibilityModal.getResult().get(0).getRelativeLName();
                ApplicationDetails.this.relationType = checkApplicationEligibilityModal.getResult().get(0).getRelationType();
                ApplicationDetails.this.mobileNo = checkApplicationEligibilityModal.getResult().get(0).getMobileNo();
                ApplicationDetails.this.G1();
            } catch (Exception unused) {
                ProgressDialog progressDialog4 = ApplicationDetails.this.dialog;
                if (progressDialog4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog4 = null;
                }
                if (progressDialog4.isShowing()) {
                    ProgressDialog progressDialog5 = ApplicationDetails.this.dialog;
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
            a((CheckApplicationEligibilityModal) obj);
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

    public ApplicationDetails() {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
        this.cal = calendar;
        this.fatherName = "";
        this.fullName = "";
        this.relationType = "";
        this.mobileNo = "";
    }

    public static final void A1(ApplicationDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void B1(ApplicationDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.v1();
    }

    public static final void C1(ApplicationDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ProgressDialog progressDialog = null;
        try {
            dz5 dz5Var = this$0.binding;
            if (dz5Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dz5Var = null;
            }
            if (dz5Var.c.getText().toString().length() == 0) {
                Toast.makeText(this$0, this$0.x1().b(va3.a.E(), this$0.getString(R.string.enter_application_no)), 1).show();
                return;
            }
            dz5 dz5Var2 = this$0.binding;
            if (dz5Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dz5Var2 = null;
            }
            if (dz5Var2.b.getText().toString().length() != 0) {
                dz5 dz5Var3 = this$0.binding;
                if (dz5Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dz5Var3 = null;
                }
                if (!Intrinsics.areEqual(dz5Var3.b.getText().toString(), "")) {
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
                    hz5 hz5Var = this$0.viewModal;
                    if (hz5Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModal");
                        hz5Var = null;
                    }
                    dz5 dz5Var4 = this$0.binding;
                    if (dz5Var4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dz5Var4 = null;
                    }
                    String string = dz5Var4.c.getText().toString();
                    String str = this$0.dateformate;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dateformate");
                        str = null;
                    }
                    hz5Var.g(string, str);
                    return;
                }
            }
            Toast.makeText(this$0, this$0.x1().b("edit_dl_serv_dob", this$0.getString(R.string.enter_dob)), 1).show();
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

    public static final void D1(ApplicationDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G1() {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.confirm_diloge_choose_sarthi);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.fullNameTv);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = dialog.findViewById(R.id.fullNameValueTv);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.fatherNameValueTv);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.fatherNameTv);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView4 = (TextView) viewFindViewById4;
        View viewFindViewById5 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView5 = (TextView) viewFindViewById5;
        View viewFindViewById6 = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView6 = (TextView) viewFindViewById6;
        textView5.setText(x1().b("btn_ok", getString(R.string.ok_txt)));
        if (kt6.d(this.relationType)) {
            textView4.setText(this.relationType + " Name");
        }
        textView.setText(x1().b("FULL_NAME_SARTHI", getString(R.string.full_name_cancel)));
        textView2.setText(": " + this.fullName);
        textView3.setText(": " + this.fatherName);
        View viewFindViewById7 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById7, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById7).setText(x1().b("nex_parivahan", "NextGen mParivahan"));
        textView5.setText(x1().b("button_proceed", "Proceed"));
        textView6.setText(x1().b("button_cancel", getString(R.string.cancel)));
        textView6.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplicationDetails.H1(dialog, view);
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplicationDetails.I1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void H1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void I1(Dialog d, ApplicationDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) OtpVerification.class);
        dz5 dz5Var = this$0.binding;
        String str = null;
        if (dz5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dz5Var = null;
        }
        intent.putExtra("applNo", StringsKt__StringsKt.trim((CharSequence) dz5Var.c.getText().toString()).toString());
        intent.putExtra("fullName", this$0.fullName);
        intent.putExtra("fatherName", this$0.fatherName);
        intent.putExtra("mobileNo", this$0.mobileNo);
        String str2 = this$0.dateformate;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dateformate");
        } else {
            str = str2;
        }
        intent.putExtra("dob", str);
        this$0.startActivity(intent);
    }

    public static final void w1(ApplicationDetails this$0, DatePicker datePicker, int i, int i2, int i3) {
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
        String str = ((String) charSequence) + '-' + ((String) charSequence2) + '-' + ((String) charSequence3);
        this$0.dateformate = str;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dateformate");
            str = null;
        }
        Log.e("Date-", str);
        dz5 dz5Var = this$0.binding;
        if (dz5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dz5Var = null;
        }
        TextView textView = dz5Var.b;
        String str3 = this$0.dateformate;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dateformate");
        } else {
            str2 = str3;
        }
        textView.setText(str2);
    }

    private final void z1() {
        this.mContext = this;
        Context context = this.mContext;
        dz5 dz5Var = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        F1(new wl5(context));
        dz5 dz5Var2 = this.binding;
        if (dz5Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dz5Var2 = null;
        }
        dz5Var2.g.f.setText(y1().k());
        dz5 dz5Var3 = this.binding;
        if (dz5Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dz5Var3 = null;
        }
        dz5Var3.g.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplicationDetails.A1(this.a, view);
            }
        });
        Context context2 = this.mContext;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context2 = null;
        }
        E1(new wa3(context2));
        ServiceWithdrawn.Companion companion = ServiceWithdrawn.INSTANCE;
        Context context3 = this.mContext;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context3 = null;
        }
        this.service = companion.a(context3);
        ServiceWithdrawn serviceWithdrawn = this.service;
        if (serviceWithdrawn == null) {
            Intrinsics.throwUninitializedPropertyAccessException("service");
            serviceWithdrawn = null;
        }
        this.viewModal = (hz5) new z(this, new ez5(new gz5(serviceWithdrawn))).a(hz5.class);
        dz5 dz5Var4 = this.binding;
        if (dz5Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dz5Var4 = null;
        }
        dz5Var4.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplicationDetails.B1(this.a, view);
            }
        });
        dz5 dz5Var5 = this.binding;
        if (dz5Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dz5Var5 = null;
        }
        dz5Var5.l.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplicationDetails.C1(this.a, view);
            }
        });
        dz5 dz5Var6 = this.binding;
        if (dz5Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            dz5Var = dz5Var6;
        }
        dz5Var.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplicationDetails.D1(this.a, view);
            }
        });
    }

    public final void E1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void F1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarathiSession = wl5Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dz5 dz5VarC = dz5.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(dz5VarC, "inflate(...)");
        this.binding = dz5VarC;
        hz5 hz5Var = null;
        if (dz5VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dz5VarC = null;
        }
        setContentView(dz5VarC.b());
        E1(new wa3(this));
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.dialog = progressDialog;
        progressDialog.setMessage(x1().b("label_challan_getting_details", "Getting details..."));
        ProgressDialog progressDialog2 = this.dialog;
        if (progressDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog2 = null;
        }
        progressDialog2.setCanceledOnTouchOutside(false);
        ProgressDialog progressDialog3 = this.dialog;
        if (progressDialog3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog3 = null;
        }
        progressDialog3.setCancelable(false);
        z1();
        ta3.a aVar = ta3.a;
        dz5 dz5Var = this.binding;
        if (dz5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dz5Var = null;
        }
        aVar.p(this, dz5Var);
        hz5 hz5Var2 = this.viewModal;
        if (hz5Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModal");
        } else {
            hz5Var = hz5Var2;
        }
        hz5Var.k().g(this, new b(new a()));
    }

    public final void v1() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.vv
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                ApplicationDetails.w1(this.a, datePicker, i, i2, i3);
            }
        }, this.cal.get(1), this.cal.get(2), this.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public final wa3 x1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final wl5 y1() {
        wl5 wl5Var = this.sarathiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarathiSession");
        return null;
    }
}
