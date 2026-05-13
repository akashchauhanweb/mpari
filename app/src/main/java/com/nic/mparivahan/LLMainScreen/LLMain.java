package com.nic.mparivahan.LLMainScreen;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.LLMainScreen.LLMain;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.LLServices.LlInterface;
import com.nic.mparivahan.R;
import com.zepto.dm3;
import com.zepto.hl3;
import com.zepto.kd1;
import com.zepto.lq7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.rc;
import com.zepto.ta3;
import com.zepto.uj3;
import com.zepto.wa3;
import com.zepto.wl5;
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
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bX\u0010YJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R*\u0010H\u001a\n A*\u0004\u0018\u00010@0@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010W\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010V¨\u0006Z"}, d2 = {"Lcom/nic/mparivahan/LLMainScreen/LLMain;", "Lcom/zepto/pq;", "", "o1", "y1", "z1", "", "message", "F1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/rc;", "C", "Lcom/zepto/rc;", "llServiceBinding", "Landroid/content/Context;", "D", "Landroid/content/Context;", "s1", "()Landroid/content/Context;", "J1", "(Landroid/content/Context;)V", "mContext", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "v1", "()Landroid/app/ProgressDialog;", "M1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/wa3;", "F", "Lcom/zepto/wa3;", "q1", "()Lcom/zepto/wa3;", "H1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/wl5;", "G", "Lcom/zepto/wl5;", "w1", "()Lcom/zepto/wl5;", "N1", "(Lcom/zepto/wl5;)V", "sarthiSession", "Lcom/zepto/dm3;", "H", "Lcom/zepto/dm3;", "u1", "()Lcom/zepto/dm3;", "L1", "(Lcom/zepto/dm3;)V", "mLlViewModel", "Lcom/nic/mparivahan/LLServices/LlInterface;", "I", "Lcom/nic/mparivahan/LLServices/LlInterface;", "t1", "()Lcom/nic/mparivahan/LLServices/LlInterface;", "K1", "(Lcom/nic/mparivahan/LLServices/LlInterface;)V", "mLlInterface", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "J", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "K", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "r1", "()Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "I1", "(Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;)V", "llDetails", "L", "Ljava/lang/String;", "x1", "()Ljava/lang/String;", "O1", "(Ljava/lang/String;)V", "state_Code", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class LLMain extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public rc llServiceBinding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public dm3 mLlViewModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public LlInterface mLlInterface;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public FetchLlDetails llDetails;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String state_Code;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(FetchLlDetails fetchLlDetails) {
            LLMain.this.v1().dismiss();
            try {
                if (StringsKt__StringsJVMKt.equals(fetchLlDetails.getLLDetails().get(0).getStatus_code(), "00", true)) {
                    LLMain lLMain = LLMain.this;
                    Intrinsics.checkNotNull(fetchLlDetails);
                    lLMain.I1(fetchLlDetails);
                    if (StringsKt__StringsJVMKt.equals(LLMain.this.x1(), LLMain.this.r1().getState().getStCd(), true)) {
                        Intent intent = new Intent(LLMain.this.s1(), (Class<?>) LlRto.class);
                        intent.putExtra("LLDetails", LLMain.this.r1());
                        LLMain.this.startActivity(intent);
                    } else {
                        LLMain.this.F1("Enter valid LL Number of " + LLMain.this.r1().getState().getStateName() + " State");
                    }
                } else {
                    LLMain lLMain2 = LLMain.this;
                    String strB = lLMain2.q1().b("no_detail_availbale", LLMain.this.getString(R.string.no_detals_avaliable));
                    Intrinsics.checkNotNull(strB);
                    lLMain2.F1(strB);
                }
            } catch (Exception e) {
                Log.d("ll_response_err", e.toString());
                LLMain lLMain3 = LLMain.this;
                String strB2 = lLMain3.q1().b("label_went_wrong", LLMain.this.getString(R.string.something_please_try_after_some_time));
                Intrinsics.checkNotNull(strB2);
                lLMain3.F1(strB2);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((FetchLlDetails) obj);
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
            LLMain.this.v1().dismiss();
            LLMain lLMain = LLMain.this;
            String strB = lLMain.q1().b("no_detail_availbale", LLMain.this.getString(R.string.no_detals_avaliable));
            Intrinsics.checkNotNull(strB);
            lLMain.F1(strB);
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

    public static final void A1(LLMain this$0, DatePicker datePicker, int i, int i2, int i3) {
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
        rc rcVar = this$0.llServiceBinding;
        if (rcVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("llServiceBinding");
            rcVar = null;
        }
        rcVar.B.setText(str + '-' + str2 + '-' + str3);
    }

    public static final void B1(LLMain this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListener, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void C1(LLMain this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        rc rcVar = this$0.llServiceBinding;
        rc rcVar2 = null;
        if (rcVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("llServiceBinding");
            rcVar = null;
        }
        rcVar.A.setText("");
        rc rcVar3 = this$0.llServiceBinding;
        if (rcVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("llServiceBinding");
        } else {
            rcVar2 = rcVar3;
        }
        rcVar2.B.setText("");
    }

    public static final void D1(LLMain this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.s1(), this$0.q1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
            return;
        }
        rc rcVar = this$0.llServiceBinding;
        rc rcVar2 = null;
        if (rcVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("llServiceBinding");
            rcVar = null;
        }
        Editable text = rcVar.A.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0) {
            this$0.F1(this$0.s1().getString(R.string.pls_enter_learner_driving_license_number));
            return;
        }
        rc rcVar3 = this$0.llServiceBinding;
        if (rcVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("llServiceBinding");
            rcVar3 = null;
        }
        if (rcVar3.A.getText().length() < 10) {
            this$0.F1(this$0.s1().getString(R.string.validate_message_dl));
            return;
        }
        rc rcVar4 = this$0.llServiceBinding;
        if (rcVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("llServiceBinding");
            rcVar4 = null;
        }
        CharSequence text2 = rcVar4.B.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        if (text2.length() == 0) {
            this$0.F1(this$0.s1().getString(R.string.please_enter_bd));
            return;
        }
        this$0.v1().show();
        dm3 dm3VarU1 = this$0.u1();
        rc rcVar5 = this$0.llServiceBinding;
        if (rcVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("llServiceBinding");
            rcVar5 = null;
        }
        String string = rcVar5.A.getText().toString();
        rc rcVar6 = this$0.llServiceBinding;
        if (rcVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("llServiceBinding");
        } else {
            rcVar2 = rcVar6;
        }
        dm3VarU1.j(this$0, string, rcVar2.B.getText().toString(), "mobSARATHI", "657d1c758e2e95af0014e16f5109f933", "10.248.210.8", "sarathiservice");
    }

    public static final void E1(LLMain this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F1(String message) {
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.n83
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLMain.G1(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    private final void o1() {
        u1().k().g(this, new c(new a()));
        u1().i().g(this, new c(new b()));
    }

    private final void y1() {
        H1(new wa3(s1()));
        N1(new wl5(s1()));
        rc rcVar = this.llServiceBinding;
        rc rcVar2 = null;
        if (rcVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("llServiceBinding");
            rcVar = null;
        }
        rcVar.F.setText(w1().k());
        M1(new ProgressDialog(this));
        v1().setMessage(q1().b("label_challan_please_wait", getString(R.string.please_wait)));
        v1().setCancelable(true);
        v1().setCanceledOnTouchOutside(true);
        O1(StringsKt__StringsKt.trim((CharSequence) String.valueOf(getIntent().getStringExtra("state_code"))).toString());
        rc rcVar3 = this.llServiceBinding;
        if (rcVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("llServiceBinding");
        } else {
            rcVar2 = rcVar3;
        }
        rcVar2.F.setText(w1().k());
        K1(LlInterface.INSTANCE.a(s1()));
        L1((dm3) new z(this, new uj3(new hl3(t1()))).a(dm3.class));
    }

    private final void z1() {
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.o83
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                LLMain.A1(this.a, datePicker, i, i2, i3);
            }
        };
        rc rcVar = this.llServiceBinding;
        rc rcVar2 = null;
        if (rcVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("llServiceBinding");
            rcVar = null;
        }
        rcVar.B.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.p83
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLMain.B1(this.a, onDateSetListener, view);
            }
        });
        rc rcVar3 = this.llServiceBinding;
        if (rcVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("llServiceBinding");
            rcVar3 = null;
        }
        rcVar3.x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.q83
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLMain.C1(this.a, view);
            }
        });
        rc rcVar4 = this.llServiceBinding;
        if (rcVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("llServiceBinding");
        } else {
            rcVar2 = rcVar4;
        }
        rcVar2.y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.r83
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLMain.D1(this.a, view);
            }
        });
    }

    public final void H1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void I1(FetchLlDetails fetchLlDetails) {
        Intrinsics.checkNotNullParameter(fetchLlDetails, "<set-?>");
        this.llDetails = fetchLlDetails;
    }

    public final void J1(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void K1(LlInterface llInterface) {
        Intrinsics.checkNotNullParameter(llInterface, "<set-?>");
        this.mLlInterface = llInterface;
    }

    public final void L1(dm3 dm3Var) {
        Intrinsics.checkNotNullParameter(dm3Var, "<set-?>");
        this.mLlViewModel = dm3Var;
    }

    public final void M1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void N1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final void O1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.state_Code = str;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        J1(this);
        lq7 lq7VarF = kd1.f(this, R.layout.activity_ll);
        Intrinsics.checkNotNullExpressionValue(lq7VarF, "setContentView(...)");
        this.llServiceBinding = (rc) lq7VarF;
        y1();
        z1();
        o1();
        rc rcVar = this.llServiceBinding;
        rc rcVar2 = null;
        if (rcVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("llServiceBinding");
            rcVar = null;
        }
        rcVar.D.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.m83
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLMain.E1(this.a, view);
            }
        });
        ta3.a aVar = ta3.a;
        rc rcVar3 = this.llServiceBinding;
        if (rcVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("llServiceBinding");
        } else {
            rcVar2 = rcVar3;
        }
        aVar.k1(this, rcVar2);
    }

    public final wa3 q1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final FetchLlDetails r1() {
        FetchLlDetails fetchLlDetails = this.llDetails;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("llDetails");
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

    public final LlInterface t1() {
        LlInterface llInterface = this.mLlInterface;
        if (llInterface != null) {
            return llInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mLlInterface");
        return null;
    }

    public final dm3 u1() {
        dm3 dm3Var = this.mLlViewModel;
        if (dm3Var != null) {
            return dm3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mLlViewModel");
        return null;
    }

    public final ProgressDialog v1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final wl5 w1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final String x1() {
        String str = this.state_Code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("state_Code");
        return null;
    }
}
