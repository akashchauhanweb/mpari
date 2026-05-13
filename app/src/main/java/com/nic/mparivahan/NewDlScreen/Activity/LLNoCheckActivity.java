package com.nic.mparivahan.NewDlScreen.Activity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.format.DateFormat;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.LLServices.GetLlPojo.LlstoDisplayMap;
import com.nic.mparivahan.NewDlScreen.Activity.LLNoCheckActivity;
import com.nic.mparivahan.NewDlScreen.Modal.CheckLLExitModal;
import com.nic.mparivahan.NewDlScreen.Modal.LLDetailsResultModal;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.ui.editlearnerlicence.Service.NewDLService;
import com.zepto.e9;
import com.zepto.kt6;
import com.zepto.mf4;
import com.zepto.n74;
import com.zepto.o74;
import com.zepto.pq;
import com.zepto.t84;
import com.zepto.ta3;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bD\u0010EJ\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J<\u0010\u000e\u001a\u00020\u00022\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n2\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\nH\u0003R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R*\u0010\u001b\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006F"}, d2 = {"Lcom/nic/mparivahan/NewDlScreen/Activity/LLNoCheckActivity;", "Lcom/zepto/pq;", "", "t1", "s1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/LLServices/GetLlPojo/LlstoDisplayMap;", "Lkotlin/collections/ArrayList;", "llstoDisplayMap", "Lcom/nic/mparivahan/NewDlScreen/Modal/LLDetailsResultModal;", "llDetailsResultModal", "B1", "Lcom/zepto/e9;", "C", "Lcom/zepto/e9;", "binding", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "D", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "q1", "()Landroid/app/ProgressDialog;", "z1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/wa3;", "F", "Lcom/zepto/wa3;", "p1", "()Lcom/zepto/wa3;", "y1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/wl5;", "G", "Lcom/zepto/wl5;", "r1", "()Lcom/zepto/wl5;", "A1", "(Lcom/zepto/wl5;)V", "sarthiSession", "Landroid/content/Context;", "H", "Landroid/content/Context;", "mContext", "Lcom/zepto/t84;", "I", "Lcom/zepto/t84;", "viewModal", "Lcom/nic/mparivahan/dlservices/ui/editlearnerlicence/Service/NewDLService;", "J", "Lcom/nic/mparivahan/dlservices/ui/editlearnerlicence/Service/NewDLService;", "service", "Landroid/content/SharedPreferences;", "K", "Landroid/content/SharedPreferences;", "pref", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class LLNoCheckActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public e9 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public t84 viewModal;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public NewDLService service;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public SharedPreferences pref;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(CheckLLExitModal checkLLExitModal) {
            try {
                if (LLNoCheckActivity.this.q1().isShowing()) {
                    LLNoCheckActivity.this.q1().dismiss();
                }
                if (Intrinsics.areEqual(checkLLExitModal.getStatusDesc(), "success")) {
                    ArrayList<LLDetailsResultModal> lLDetails = checkLLExitModal.getLLDetails();
                    Intrinsics.checkNotNull(lLDetails);
                    if (lLDetails.size() > 0) {
                        LLNoCheckActivity.this.B1(checkLLExitModal.getLLDetails().get(0).getLlstoDisplayMap(), checkLLExitModal.getLLDetails());
                        return;
                    }
                    return;
                }
                ArrayList<LLDetailsResultModal> lLDetails2 = checkLLExitModal.getLLDetails();
                Intrinsics.checkNotNull(lLDetails2);
                if (kt6.d(lLDetails2.get(0).getError())) {
                    Toast.makeText(LLNoCheckActivity.this, checkLLExitModal.getLLDetails().get(0).getError(), 0).show();
                    return;
                }
                if (kt6.d(checkLLExitModal.getLLDetails().get(0).getDobError())) {
                    Toast.makeText(LLNoCheckActivity.this, checkLLExitModal.getLLDetails().get(0).getDobError(), 0).show();
                    return;
                }
                if (kt6.d(checkLLExitModal.getLLDetails().get(0).getDateNotMatchError())) {
                    Toast.makeText(LLNoCheckActivity.this, checkLLExitModal.getLLDetails().get(0).getDateNotMatchError(), 0).show();
                    return;
                }
                if (kt6.d(checkLLExitModal.getLLDetails().get(0).getInvalidLLNo())) {
                    Toast.makeText(LLNoCheckActivity.this, checkLLExitModal.getLLDetails().get(0).getInvalidLLNo(), 0).show();
                    return;
                }
                if (kt6.d(checkLLExitModal.getLLDetails().get(0).getAlreadyApplied())) {
                    Toast.makeText(LLNoCheckActivity.this, checkLLExitModal.getLLDetails().get(0).getAlreadyApplied(), 0).show();
                } else if (kt6.d(checkLLExitModal.getLLDetails().get(0).getAlreadyHavingDL())) {
                    Toast.makeText(LLNoCheckActivity.this, checkLLExitModal.getLLDetails().get(0).getAlreadyHavingDL(), 0).show();
                } else if (kt6.d(checkLLExitModal.getLLDetails().get(0).getDlAppliedAfterFewDays())) {
                    Toast.makeText(LLNoCheckActivity.this, checkLLExitModal.getLLDetails().get(0).getDlAppliedAfterFewDays(), 0).show();
                }
            } catch (Exception unused) {
                if (LLNoCheckActivity.this.q1().isShowing()) {
                    LLNoCheckActivity.this.q1().dismiss();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CheckLLExitModal) obj);
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
            if (LLNoCheckActivity.this.q1().isShowing()) {
                LLNoCheckActivity.this.q1().dismiss();
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

    public static final void C1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void D1(Dialog d, LLNoCheckActivity this$0, ArrayList arrayList, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) NewDLPersonalDetailsActivity.class);
        intent.putParcelableArrayListExtra("LLDetails", arrayList);
        e9 e9Var = this$0.binding;
        e9 e9Var2 = null;
        if (e9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            e9Var = null;
        }
        intent.putExtra("llNo", e9Var.A.getText().toString());
        e9 e9Var3 = this$0.binding;
        if (e9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            e9Var2 = e9Var3;
        }
        intent.putExtra("dob", e9Var2.B.getText().toString());
        this$0.startActivity(intent);
    }

    private final void s1() {
        this.mContext = this;
        Context context = this.mContext;
        NewDLService newDLService = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        A1(new wl5(context));
        Context context2 = this.mContext;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context2 = null;
        }
        y1(new wa3(context2));
        e9 e9Var = this.binding;
        if (e9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            e9Var = null;
        }
        e9Var.C.f.setText(r1().k());
        z1(new ProgressDialog(this));
        q1().setMessage(p1().b("label_challan_please_wait", getString(R.string.please_wait)));
        q1().setCancelable(true);
        q1().setCanceledOnTouchOutside(true);
        NewDLService.Companion companion = NewDLService.INSTANCE;
        Context context3 = this.mContext;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context3 = null;
        }
        this.service = companion.a(context3);
        NewDLService newDLService2 = this.service;
        if (newDLService2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("service");
        } else {
            newDLService = newDLService2;
        }
        this.viewModal = (t84) new z(this, new n74(new o74(newDLService))).a(t84.class);
    }

    private final void t1() {
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.u83
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                LLNoCheckActivity.u1(this.a, datePicker, i, i2, i3);
            }
        };
        e9 e9Var = this.binding;
        e9 e9Var2 = null;
        if (e9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            e9Var = null;
        }
        e9Var.B.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.v83
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLNoCheckActivity.v1(this.a, onDateSetListener, view);
            }
        });
        e9 e9Var3 = this.binding;
        if (e9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            e9Var3 = null;
        }
        e9Var3.x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.w83
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLNoCheckActivity.w1(this.a, view);
            }
        });
        e9 e9Var4 = this.binding;
        if (e9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            e9Var2 = e9Var4;
        }
        e9Var2.y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.x83
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLNoCheckActivity.x1(this.a, view);
            }
        });
    }

    public static final void u1(LLNoCheckActivity this$0, DatePicker datePicker, int i, int i2, int i3) {
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
        e9 e9Var = this$0.binding;
        if (e9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            e9Var = null;
        }
        e9Var.B.setText(str + '-' + str2 + '-' + str3);
    }

    public static final void v1(LLNoCheckActivity this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListener, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void w1(LLNoCheckActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        e9 e9Var = this$0.binding;
        e9 e9Var2 = null;
        if (e9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            e9Var = null;
        }
        e9Var.A.setText("");
        e9 e9Var3 = this$0.binding;
        if (e9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            e9Var2 = e9Var3;
        }
        e9Var2.B.setText("");
    }

    public static final void x1(LLNoCheckActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Context context = null;
        Context context2 = null;
        Context context3 = null;
        Context context4 = null;
        e9 e9Var = null;
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Context context5 = this$0.mContext;
            if (context5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            } else {
                context = context5;
            }
            Toast.makeText(context, this$0.p1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
            return;
        }
        e9 e9Var2 = this$0.binding;
        if (e9Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            e9Var2 = null;
        }
        Editable text = e9Var2.A.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0) {
            Context context6 = this$0.mContext;
            if (context6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            } else {
                context2 = context6;
            }
            Toast.makeText(context2, this$0.p1().b("pls_enter_lln", this$0.getString(R.string.pls_enter_learner_driving_license_number)), 0).show();
            return;
        }
        e9 e9Var3 = this$0.binding;
        if (e9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            e9Var3 = null;
        }
        if (e9Var3.A.getText().length() < 10) {
            Context context7 = this$0.mContext;
            if (context7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            } else {
                context3 = context7;
            }
            Toast.makeText(context3, this$0.p1().b("dl_validation_msg", this$0.getString(R.string.validate_message_dl)), 0).show();
            return;
        }
        e9 e9Var4 = this$0.binding;
        if (e9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            e9Var4 = null;
        }
        CharSequence text2 = e9Var4.B.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        if (text2.length() == 0) {
            Context context8 = this$0.mContext;
            if (context8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            } else {
                context4 = context8;
            }
            Toast.makeText(context4, this$0.p1().b("please_enter_bd", this$0.getString(R.string.please_enter_bd)), 0).show();
            return;
        }
        this$0.q1().show();
        t84 t84Var = this$0.viewModal;
        if (t84Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModal");
            t84Var = null;
        }
        e9 e9Var5 = this$0.binding;
        if (e9Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            e9Var5 = null;
        }
        String string = e9Var5.A.getText().toString();
        e9 e9Var6 = this$0.binding;
        if (e9Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            e9Var = e9Var6;
        }
        t84Var.g(string, e9Var.B.getText().toString());
    }

    public final void A1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final void B1(ArrayList llstoDisplayMap, final ArrayList llDetailsResultModal) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.confirm_new_dl_popup);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.llNoValue);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = dialog.findViewById(R.id.oldLlNoValue);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.covsValue);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.equCovsValue);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView4 = (TextView) viewFindViewById4;
        View viewFindViewById5 = dialog.findViewById(R.id.issueDateValue);
        Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView5 = (TextView) viewFindViewById5;
        View viewFindViewById6 = dialog.findViewById(R.id.expireOnValue);
        Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView6 = (TextView) viewFindViewById6;
        View viewFindViewById7 = dialog.findViewById(R.id.llNoTv);
        Intrinsics.checkNotNull(viewFindViewById7, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById8 = dialog.findViewById(R.id.covs);
        Intrinsics.checkNotNull(viewFindViewById8, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById9 = dialog.findViewById(R.id.equCovs);
        Intrinsics.checkNotNull(viewFindViewById9, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById10 = dialog.findViewById(R.id.issueDate);
        Intrinsics.checkNotNull(viewFindViewById10, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById11 = dialog.findViewById(R.id.expireOn);
        Intrinsics.checkNotNull(viewFindViewById11, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById11).setText(p1().b("dl_expire_on", getString(R.string.expire_on)));
        ((TextView) viewFindViewById10).setText(p1().b("issue_date", getString(R.string.issue_date_sarthi)) + " :");
        ((TextView) viewFindViewById7).setText(p1().b("ll_number", getString(R.string.ll_no)));
        ((TextView) viewFindViewById8).setText(p1().b("dl_covs", getString(R.string.covs)));
        ((TextView) viewFindViewById9).setText(p1().b("dl_equ_covs", getString(R.string.equ_covs)));
        if (kt6.d(((LlstoDisplayMap) llstoDisplayMap.get(0)).getLlNumber())) {
            textView.setText(((LlstoDisplayMap) llstoDisplayMap.get(0)).getLlNumber());
        } else {
            textView.setText("");
        }
        if (kt6.d(((LlstoDisplayMap) llstoDisplayMap.get(0)).getOldLLNumber())) {
            textView2.setText(((LlstoDisplayMap) llstoDisplayMap.get(0)).getOldLLNumber());
        } else {
            textView2.setText("");
        }
        if (kt6.d(((LlstoDisplayMap) llstoDisplayMap.get(0)).getCovs())) {
            textView3.setText(((LlstoDisplayMap) llstoDisplayMap.get(0)).getCovs());
        } else {
            textView3.setText("");
        }
        if (kt6.d(((LlstoDisplayMap) llstoDisplayMap.get(0)).getEquivalentCovs())) {
            textView4.setText(((LlstoDisplayMap) llstoDisplayMap.get(0)).getEquivalentCovs());
        } else {
            textView4.setText("");
        }
        if (kt6.d(((LlstoDisplayMap) llstoDisplayMap.get(0)).getIssueDate())) {
            textView5.setText(((LlstoDisplayMap) llstoDisplayMap.get(0)).getIssueDate());
        } else {
            textView5.setText("");
        }
        if (kt6.d(((LlstoDisplayMap) llstoDisplayMap.get(0)).getExpiresOn())) {
            textView6.setText(((LlstoDisplayMap) llstoDisplayMap.get(0)).getExpiresOn());
        } else {
            textView6.setText("");
        }
        View viewFindViewById12 = dialog.findViewById(R.id.confirmTv);
        Intrinsics.checkNotNull(viewFindViewById12, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView7 = (TextView) viewFindViewById12;
        View viewFindViewById13 = dialog.findViewById(R.id.cancelTv);
        Intrinsics.checkNotNull(viewFindViewById13, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView8 = (TextView) viewFindViewById13;
        textView8.setText(p1().b("button_cancel", getString(R.string.cancel)));
        textView7.setText(p1().b("btn_ok", getString(R.string.ok_txt)));
        View viewFindViewById14 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById14, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById14).setText(p1().b("nex_parivahan", "NextGen mParivahan"));
        textView7.setText(p1().b("button_proceed", "Proceed"));
        textView8.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.s83
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLNoCheckActivity.C1(dialog, view);
            }
        });
        textView7.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.t83
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLNoCheckActivity.D1(dialog, this, llDetailsResultModal, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        e9 e9VarX = e9.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(e9VarX, "inflate(...)");
        this.binding = e9VarX;
        t84 t84Var = null;
        if (e9VarX == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            e9VarX = null;
        }
        setContentView(e9VarX.m());
        ta3.a aVar = ta3.a;
        e9 e9Var = this.binding;
        if (e9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            e9Var = null;
        }
        aVar.e(this, e9Var);
        SharedPreferences sharedPreferences = getSharedPreferences("AddVehicleClass", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.pref = sharedPreferences;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
            sharedPreferences = null;
        }
        sharedPreferences.edit().clear().apply();
        s1();
        t1();
        t84 t84Var2 = this.viewModal;
        if (t84Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModal");
            t84Var2 = null;
        }
        t84Var2.i().g(this, new c(new a()));
        t84 t84Var3 = this.viewModal;
        if (t84Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModal");
        } else {
            t84Var = t84Var3;
        }
        t84Var.m().g(this, new c(new b()));
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
