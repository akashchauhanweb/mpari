package com.nic.mparivahan.ClServicesMainScreens;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
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
import com.nic.mparivahan.ClServices.ClInterface.ClInter;
import com.nic.mparivahan.ClServicesMainScreens.ClServicesMainScreen;
import com.nic.mparivahan.R;
import com.nic.mparivahan.a;
import com.zepto.c8;
import com.zepto.jl0;
import com.zepto.kd1;
import com.zepto.kl0;
import com.zepto.lq7;
import com.zepto.pq;
import com.zepto.sn0;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bK\u0010LJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0007R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R*\u0010J\u001a\n C*\u0004\u0018\u00010B0B8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I¨\u0006M"}, d2 = {"Lcom/nic/mparivahan/ClServicesMainScreens/ClServicesMainScreen;", "Lcom/zepto/pq;", "", "v1", "w1", "o1", "", "message", "C1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "date", "p1", "Lcom/zepto/c8;", "C", "Lcom/zepto/c8;", "clServiceBinding", "Landroid/content/Context;", "D", "Landroid/content/Context;", "s1", "()Landroid/content/Context;", "H1", "(Landroid/content/Context;)V", "mContext", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "t1", "()Landroid/app/ProgressDialog;", "I1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/wa3;", "F", "Lcom/zepto/wa3;", "q1", "()Lcom/zepto/wa3;", "E1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/wl5;", "G", "Lcom/zepto/wl5;", "u1", "()Lcom/zepto/wl5;", "J1", "(Lcom/zepto/wl5;)V", "sarthiSession", "Lcom/zepto/kl0;", "H", "Lcom/zepto/kl0;", "getMClDlViewModel", "()Lcom/zepto/kl0;", "F1", "(Lcom/zepto/kl0;)V", "mClDlViewModel", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "I", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "r1", "()Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "G1", "(Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;)V", "mClInter", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "J", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ClServicesMainScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public c8 clServiceBinding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public kl0 mClDlViewModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ClInter mClInter;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    public static final void A1(ClServicesMainScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!a.a.a(this$0)) {
            Toast.makeText(this$0.s1(), this$0.q1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
            return;
        }
        c8 c8Var = this$0.clServiceBinding;
        c8 c8Var2 = null;
        if (c8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clServiceBinding");
            c8Var = null;
        }
        Editable text = c8Var.A.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0) {
            this$0.C1(this$0.q1().b("pls_enter_con_lic_number", this$0.getString(R.string.pls_enter_conductor_driving_license_number)));
            return;
        }
        c8 c8Var3 = this$0.clServiceBinding;
        if (c8Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clServiceBinding");
            c8Var3 = null;
        }
        if (c8Var3.A.getText().length() < 10) {
            this$0.C1(this$0.q1().b("dl_validation_msg", this$0.getString(R.string.validate_message_dl)));
            return;
        }
        c8 c8Var4 = this$0.clServiceBinding;
        if (c8Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clServiceBinding");
            c8Var4 = null;
        }
        CharSequence text2 = c8Var4.B.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        if (text2.length() == 0) {
            this$0.C1(this$0.q1().b("please_enter_bd", this$0.getString(R.string.please_enter_bd)));
            return;
        }
        Intent intent = new Intent(this$0, (Class<?>) ClDetails.class);
        c8 c8Var5 = this$0.clServiceBinding;
        if (c8Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clServiceBinding");
            c8Var5 = null;
        }
        intent.putExtra("dlValue", StringsKt__StringsKt.trim((CharSequence) c8Var5.A.getText().toString()).toString());
        c8 c8Var6 = this$0.clServiceBinding;
        if (c8Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clServiceBinding");
        } else {
            c8Var2 = c8Var6;
        }
        intent.putExtra("dobValue", this$0.p1(c8Var2.B.getText().toString()));
        this$0.startActivity(intent);
    }

    public static final void B1(ClServicesMainScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final void C1(String message) {
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
        textView.setText(q1().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(q1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(q1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ip0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClServicesMainScreen.D1(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    private final void o1() {
    }

    private final void v1() {
        E1(new wa3(s1()));
        J1(new wl5(s1()));
        I1(new ProgressDialog(this));
        t1().setMessage(q1().b("label_challan_please_wait", getString(R.string.please_wait)));
        t1().setCancelable(false);
        t1().setCanceledOnTouchOutside(false);
        c8 c8Var = this.clServiceBinding;
        if (c8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clServiceBinding");
            c8Var = null;
        }
        c8Var.F.setText(u1().k());
        G1(ClInter.INSTANCE.a(s1()));
        F1((kl0) new z(this, new sn0(new jl0(r1()))).a(kl0.class));
    }

    private final void w1() {
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.ep0
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                ClServicesMainScreen.x1(this.a, datePicker, i, i2, i3);
            }
        };
        c8 c8Var = this.clServiceBinding;
        c8 c8Var2 = null;
        if (c8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clServiceBinding");
            c8Var = null;
        }
        c8Var.B.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClServicesMainScreen.y1(this.a, onDateSetListener, view);
            }
        });
        c8 c8Var3 = this.clServiceBinding;
        if (c8Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clServiceBinding");
            c8Var3 = null;
        }
        c8Var3.x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClServicesMainScreen.z1(this.a, view);
            }
        });
        c8 c8Var4 = this.clServiceBinding;
        if (c8Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clServiceBinding");
        } else {
            c8Var2 = c8Var4;
        }
        c8Var2.y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClServicesMainScreen.A1(this.a, view);
            }
        });
    }

    public static final void x1(ClServicesMainScreen this$0, DatePicker datePicker, int i, int i2, int i3) {
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
        c8 c8Var = this$0.clServiceBinding;
        if (c8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clServiceBinding");
            c8Var = null;
        }
        c8Var.B.setText(str + '-' + str2 + '-' + str3);
    }

    public static final void y1(ClServicesMainScreen this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListener, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void z1(ClServicesMainScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        c8 c8Var = this$0.clServiceBinding;
        c8 c8Var2 = null;
        if (c8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clServiceBinding");
            c8Var = null;
        }
        c8Var.A.setText("");
        c8 c8Var3 = this$0.clServiceBinding;
        if (c8Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clServiceBinding");
        } else {
            c8Var2 = c8Var3;
        }
        c8Var2.B.setText("");
    }

    public final void E1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void F1(kl0 kl0Var) {
        Intrinsics.checkNotNullParameter(kl0Var, "<set-?>");
        this.mClDlViewModel = kl0Var;
    }

    public final void G1(ClInter clInter) {
        Intrinsics.checkNotNullParameter(clInter, "<set-?>");
        this.mClInter = clInter;
    }

    public final void H1(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void I1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void J1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        H1(this);
        lq7 lq7VarF = kd1.f(this, R.layout.activity_cl_services_ms);
        Intrinsics.checkNotNullExpressionValue(lq7VarF, "setContentView(...)");
        this.clServiceBinding = (c8) lq7VarF;
        v1();
        w1();
        o1();
        ta3.a aVar = ta3.a;
        c8 c8Var = this.clServiceBinding;
        c8 c8Var2 = null;
        if (c8Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clServiceBinding");
            c8Var = null;
        }
        aVar.e0(this, c8Var);
        c8 c8Var3 = this.clServiceBinding;
        if (c8Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clServiceBinding");
        } else {
            c8Var2 = c8Var3;
        }
        c8Var2.D.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClServicesMainScreen.B1(this.a, view);
            }
        });
    }

    public final String p1(String date) {
        Intrinsics.checkNotNullParameter(date, "date");
        try {
            String str = new SimpleDateFormat("yyyy-MM-dd").format(new SimpleDateFormat("dd-MM-yyyy").parse(date));
            Intrinsics.checkNotNull(str);
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return p1(date);
        }
    }

    public final wa3 q1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
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

    public final Context s1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final ProgressDialog t1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final wl5 u1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }
}
