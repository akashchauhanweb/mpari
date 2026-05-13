package com.nic.mparivahan.dlservices.newlearner;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.text.format.DateFormat;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.lifecycle.z;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.newlearner.DataClass.DownloadLLResponseModal;
import com.nic.mparivahan.dlservices.newlearner.LearnerLicenceDownloadActivity;
import com.nic.mparivahan.dlservices.ui.newlearner.Service.NewLLServices;
import com.zepto.gc;
import com.zepto.i94;
import com.zepto.j94;
import com.zepto.k94;
import com.zepto.kt6;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.st6;
import com.zepto.wa3;
import com.zepto.wl5;
import java.io.File;
import java.io.FileOutputStream;
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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u001e\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00069"}, d2 = {"Lcom/nic/mparivahan/dlservices/newlearner/LearnerLicenceDownloadActivity;", "Lcom/zepto/pq;", "", "s1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "llPrintStatus", "o1", "Lcom/zepto/gc;", "C", "Lcom/zepto/gc;", "binding", "Lcom/zepto/wa3;", "D", "Lcom/zepto/wa3;", "p1", "()Lcom/zepto/wa3;", "y1", "(Lcom/zepto/wa3;)V", "langSession", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "E", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "Lcom/zepto/j94;", "F", "Lcom/zepto/j94;", "learnerLicenceVM", "Lcom/nic/mparivahan/dlservices/ui/newlearner/Service/NewLLServices;", "G", "Lcom/nic/mparivahan/dlservices/ui/newlearner/Service/NewLLServices;", "service", "Lcom/zepto/wl5;", "H", "Lcom/zepto/wl5;", "r1", "()Lcom/zepto/wl5;", "A1", "(Lcom/zepto/wl5;)V", "sarthiSession", "Landroid/app/ProgressDialog;", "I", "Landroid/app/ProgressDialog;", "q1", "()Landroid/app/ProgressDialog;", "z1", "(Landroid/app/ProgressDialog;)V", "pDialog", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class LearnerLicenceDownloadActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public gc binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public j94 learnerLicenceVM;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public NewLLServices service;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(DownloadLLResponseModal downloadLLResponseModal) {
            try {
                if (LearnerLicenceDownloadActivity.this.q1().isShowing()) {
                    LearnerLicenceDownloadActivity.this.q1().dismiss();
                }
                if (StringsKt__StringsJVMKt.equals(downloadLLResponseModal.getStatus_code(), "00", true) && StringsKt__StringsJVMKt.equals(downloadLLResponseModal.getStatus_desc(), "Success", true) && kt6.d(downloadLLResponseModal.getLLPrintStatus())) {
                    LearnerLicenceDownloadActivity.this.o1(downloadLLResponseModal.getLLPrintStatus());
                } else if (kt6.d(downloadLLResponseModal.getStatus_desc())) {
                    Toast.makeText(LearnerLicenceDownloadActivity.this, downloadLLResponseModal.getStatus_desc(), 0).show();
                } else {
                    LearnerLicenceDownloadActivity learnerLicenceDownloadActivity = LearnerLicenceDownloadActivity.this;
                    Toast.makeText(learnerLicenceDownloadActivity, learnerLicenceDownloadActivity.p1().b("service_is_not_present", "Something went wrong,Please try after some time!"), 0).show();
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (LearnerLicenceDownloadActivity.this.q1().isShowing()) {
                    LearnerLicenceDownloadActivity.this.q1().dismiss();
                }
                LearnerLicenceDownloadActivity learnerLicenceDownloadActivity2 = LearnerLicenceDownloadActivity.this;
                Toast.makeText(learnerLicenceDownloadActivity2, learnerLicenceDownloadActivity2.p1().b("service_is_not_present", "Something went wrong,Please try after some time!"), 0).show();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DownloadLLResponseModal) obj);
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
            if (LearnerLicenceDownloadActivity.this.q1().isShowing()) {
                LearnerLicenceDownloadActivity.this.q1().dismiss();
            }
            LearnerLicenceDownloadActivity learnerLicenceDownloadActivity = LearnerLicenceDownloadActivity.this;
            Toast.makeText(learnerLicenceDownloadActivity, learnerLicenceDownloadActivity.p1().b("service_is_not_present", "Something went wrong,Please try after some time!"), 0).show();
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

    private final void s1() {
        y1(new wa3(this));
        A1(new wl5(this));
        gc gcVar = this.binding;
        gc gcVar2 = null;
        if (gcVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gcVar = null;
        }
        gcVar.B.f.setText(r1().k());
        z1(new ProgressDialog(this));
        q1().setMessage(p1().b("label_challan_please_wait", getString(R.string.please_wait)));
        q1().setCancelable(true);
        q1().setCanceledOnTouchOutside(true);
        this.service = NewLLServices.INSTANCE.a(this);
        NewLLServices newLLServices = this.service;
        if (newLLServices == null) {
            Intrinsics.throwUninitializedPropertyAccessException("service");
            newLLServices = null;
        }
        this.learnerLicenceVM = (j94) new z(this, new k94(new i94(newLLServices))).a(j94.class);
        gc gcVar3 = this.binding;
        if (gcVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gcVar3 = null;
        }
        gcVar3.x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ed3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenceDownloadActivity.t1(this.a, view);
            }
        });
        gc gcVar4 = this.binding;
        if (gcVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gcVar4 = null;
        }
        gcVar4.B.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fd3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenceDownloadActivity.u1(this.a, view);
            }
        });
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.gd3
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                LearnerLicenceDownloadActivity.v1(this.a, datePicker, i, i2, i3);
            }
        };
        gc gcVar5 = this.binding;
        if (gcVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gcVar5 = null;
        }
        gcVar5.z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hd3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenceDownloadActivity.w1(this.a, onDateSetListener, view);
            }
        });
        gc gcVar6 = this.binding;
        if (gcVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            gcVar2 = gcVar6;
        }
        gcVar2.y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.id3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenceDownloadActivity.x1(this.a, view);
            }
        });
    }

    public static final void t1(LearnerLicenceDownloadActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void u1(LearnerLicenceDownloadActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void v1(LearnerLicenceDownloadActivity this$0, DatePicker datePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cal.set(1, i);
        this$0.cal.set(2, i2);
        this$0.cal.set(5, i3);
        CharSequence charSequence = DateFormat.format("dd", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type kotlin.String");
        String str = (String) charSequence;
        CharSequence charSequence2 = DateFormat.format("MM", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) charSequence2;
        CharSequence charSequence3 = DateFormat.format("yyyy", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence3, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) charSequence3;
        gc gcVar = this$0.binding;
        if (gcVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gcVar = null;
        }
        gcVar.z.setText(str + '-' + str2 + '-' + str3);
    }

    public static final void w1(LearnerLicenceDownloadActivity this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListener, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void x1(LearnerLicenceDownloadActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        gc gcVar = this$0.binding;
        gc gcVar2 = null;
        if (gcVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gcVar = null;
        }
        if (gcVar.w.getText().toString().length() == 0) {
            Toast.makeText(this$0, this$0.p1().b("PLEASE_ENTER_APPLICATION", this$0.getString(R.string.please_enter_valid_app_no)), 0).show();
            return;
        }
        gc gcVar3 = this$0.binding;
        if (gcVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gcVar3 = null;
        }
        CharSequence text = gcVar3.z.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0) {
            Toast.makeText(this$0, this$0.p1().b("please_enter_bd", this$0.getString(R.string.please_enter_bd)), 0).show();
            return;
        }
        try {
            if (st6.e(this$0)) {
                this$0.q1().show();
                j94 j94Var = this$0.learnerLicenceVM;
                if (j94Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("learnerLicenceVM");
                    j94Var = null;
                }
                gc gcVar4 = this$0.binding;
                if (gcVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    gcVar4 = null;
                }
                String string = gcVar4.w.getText().toString();
                gc gcVar5 = this$0.binding;
                if (gcVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    gcVar2 = gcVar5;
                }
                j94Var.h(string, gcVar2.z.getText().toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (this$0.q1().isShowing()) {
                this$0.q1().dismiss();
            }
        }
    }

    public final void A1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final void o1(String llPrintStatus) {
        try {
            String str = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            StringBuilder sb = new StringBuilder();
            gc gcVar = this.binding;
            if (gcVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                gcVar = null;
            }
            sb.append((Object) gcVar.w.getText());
            sb.append(System.currentTimeMillis());
            String string = sb.toString();
            File file2 = new File(str + string);
            if (!file2.exists()) {
                byte[] bArrDecode = Base64.decode(llPrintStatus, 0);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(bArrDecode);
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            Uri uriF = FileProvider.f(this, "com.nic.mparivahan.provider", new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/" + string));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(uriF);
            Log.e("create pdf uri path==>", sb2.toString());
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setDataAndType(uriF, "application/pdf");
                intent.setFlags(67108864);
                intent.addFlags(1);
                startActivity(intent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gc gcVarX = gc.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(gcVarX, "inflate(...)");
        this.binding = gcVarX;
        j94 j94Var = null;
        if (gcVarX == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            gcVarX = null;
        }
        setContentView(gcVarX.m());
        s1();
        j94 j94Var2 = this.learnerLicenceVM;
        if (j94Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("learnerLicenceVM");
            j94Var2 = null;
        }
        j94Var2.q().g(this, new c(new a()));
        j94 j94Var3 = this.learnerLicenceVM;
        if (j94Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("learnerLicenceVM");
        } else {
            j94Var = j94Var3;
        }
        j94Var.w().g(this, new c(new b()));
    }

    public final wa3 p1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final ProgressDialog q1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final wl5 r1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final void y1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void z1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }
}
