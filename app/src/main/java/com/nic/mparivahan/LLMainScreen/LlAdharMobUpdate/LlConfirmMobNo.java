package com.nic.mparivahan.LLMainScreen.LlAdharMobUpdate;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.DOEkycX;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.LLMainScreen.LlAdharMobUpdate.LlConfirmMobNo;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.mobupdate.DlUpdateMobResponse;
import com.zepto.dg5;
import com.zepto.mf4;
import com.zepto.mt6;
import com.zepto.o40;
import com.zepto.tc;
import com.zepto.vm1;
import com.zepto.wa3;
import com.zepto.wl5;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bE\u0010FJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bJ\u001a\u0010\r\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010-\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\"\u0010@\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006G"}, d2 = {"Lcom/nic/mparivahan/LLMainScreen/LlAdharMobUpdate/LlConfirmMobNo;", "Lcom/zepto/o40;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/content/Context;", "context", "", "message", "P1", "fdate", "D1", "M1", "O1", "Lcom/zepto/tc;", "F", "Lcom/zepto/tc;", "E1", "()Lcom/zepto/tc;", "R1", "(Lcom/zepto/tc;)V", "binding", "Lcom/zepto/wl5;", "G", "Lcom/zepto/wl5;", "I1", "()Lcom/zepto/wl5;", "V1", "(Lcom/zepto/wl5;)V", "sarthiSession", "Lcom/zepto/wa3;", "H", "Lcom/zepto/wa3;", "F1", "()Lcom/zepto/wa3;", "S1", "(Lcom/zepto/wa3;)V", "langSession", "I", "Landroid/content/Context;", "H1", "()Landroid/content/Context;", "U1", "(Landroid/content/Context;)V", "mContext", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "J", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "G1", "()Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "T1", "(Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;)V", "llDetails", "Lcom/zepto/vm1;", "K", "Lcom/zepto/vm1;", "updateMobVm", "L", "Ljava/lang/String;", "getAadhaarLastFourDigitMobileNo", "()Ljava/lang/String;", "setAadhaarLastFourDigitMobileNo", "(Ljava/lang/String;)V", "aadhaarLastFourDigitMobileNo", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkycX;", "M", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkycX;", "adharData", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class LlConfirmMobNo extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public tc binding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public FetchLlDetails llDetails;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public vm1 updateMobVm;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String aadhaarLastFourDigitMobileNo = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public DOEkycX adharData;

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
        public final void a(DlUpdateMobResponse dlUpdateMobResponse) {
            try {
                LlConfirmMobNo.this.E1().I.c(false);
                Integer errno = dlUpdateMobResponse.getErrno();
                if (errno != null && errno.intValue() == 1) {
                    dg5.a.d(StringsKt__StringsKt.trim((CharSequence) LlConfirmMobNo.this.E1().D.getText().toString()).toString());
                    LlConfirmMobNo llConfirmMobNo = LlConfirmMobNo.this;
                    llConfirmMobNo.P1(llConfirmMobNo, String.valueOf(dlUpdateMobResponse.getErrmsg()));
                } else {
                    String errmsg = dlUpdateMobResponse.getErrmsg();
                    if (errmsg != null) {
                        LlConfirmMobNo.this.O1(errmsg);
                    }
                }
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DlUpdateMobResponse) obj);
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

        public final void invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            LlConfirmMobNo.this.finish();
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

    public static final void J1(LlConfirmMobNo this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void K1(LlConfirmMobNo this$0, View view) {
        String strSubstring;
        vm1 vm1Var;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.E1().D.getText().toString().length() > 8) {
            strSubstring = this$0.E1().D.getText().toString().substring(this$0.E1().D.getText().toString().length() - 4, this$0.E1().D.getText().toString().length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            strSubstring = "";
        }
        try {
            Editable text = this$0.E1().D.getText();
            Intrinsics.checkNotNull(text);
            if (text.length() == 0) {
                this$0.M1(this$0.H1(), this$0.F1().b("label_mb", "Please enter the mobile number"));
            } else {
                Editable text2 = this$0.E1().D.getText();
                Intrinsics.checkNotNull(text2);
                if (text2.length() < 10) {
                    this$0.M1(this$0.H1(), this$0.F1().b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no)));
                } else {
                    mt6.a aVar = mt6.a;
                    if (aVar.t(this$0.E1().D.getText().toString())) {
                        Editable text3 = this$0.E1().y.getText();
                        Intrinsics.checkNotNull(text3);
                        if (text3.length() == 0) {
                            this$0.M1(this$0.H1(), this$0.F1().b("label_mb", "Please enter the mobile number"));
                        } else {
                            Editable text4 = this$0.E1().y.getText();
                            Intrinsics.checkNotNull(text4);
                            if (text4.length() < 10 || !aVar.t(this$0.E1().y.getText().toString())) {
                                this$0.M1(this$0.H1(), this$0.F1().b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no)));
                            } else if (!Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) this$0.E1().D.getText().toString()).toString(), StringsKt__StringsKt.trim((CharSequence) this$0.E1().y.getText().toString()).toString())) {
                                this$0.M1(this$0.H1(), this$0.F1().b("same_mobile_number", this$0.getString(R.string.same_mobile_number)));
                            }
                        }
                    } else {
                        this$0.M1(this$0.H1(), this$0.F1().b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no)));
                    }
                }
            }
            DOEkycX dOEkycX = this$0.adharData;
            if (dOEkycX == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX = null;
            }
            if (dOEkycX.getPhone() == 0 && !Intrinsics.areEqual(strSubstring, this$0.aadhaarLastFourDigitMobileNo)) {
                this$0.M1(this$0.H1(), this$0.F1().b("adhar_same_mobile_number", this$0.getString(R.string.same_mobile_no)));
                return;
            }
            Editable text5 = this$0.E1().H.getText();
            Intrinsics.checkNotNull(text5);
            if (text5.length() == 0) {
                this$0.M1(this$0.H1(), this$0.F1().b("label_dl_serv_enter_reas_manul", this$0.getString(R.string.enter_Reason)));
                return;
            }
            this$0.E1().I.c(true);
            String string = StringsKt__StringsKt.trim((CharSequence) this$0.E1().D.getText().toString()).toString();
            vm1 vm1Var2 = this$0.updateMobVm;
            if (vm1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("updateMobVm");
                vm1Var = null;
            } else {
                vm1Var = vm1Var2;
            }
            String dateOfBirth = this$0.G1().getDateOfBirth();
            Intrinsics.checkNotNull(dateOfBirth);
            String strD1 = this$0.D1(dateOfBirth);
            String string2 = StringsKt__StringsKt.trim((CharSequence) this$0.G1().getLearningLicence()).toString();
            Intrinsics.checkNotNull(string2);
            vm1Var.k(strD1, "LL", "0", true, string2, string);
        } catch (Exception unused) {
        }
    }

    public static final void L1(LlConfirmMobNo this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void Q1(ProgressBar pb_otp, LlConfirmMobNo this$0, View view) {
        Intrinsics.checkNotNullParameter(pb_otp, "$pb_otp");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        pb_otp.setVisibility(0);
        if (!Intrinsics.areEqual(this$0.I1().b(), "204")) {
            this$0.finish();
            return;
        }
        Toast.makeText(this$0.getApplicationContext(), this$0.F1().b("app_red", "Mobile No. is successfully updated \n App is redirecting to Dashboard"), 1).show();
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67141632);
        this$0.startActivity(intent);
        this$0.finish();
    }

    public final String D1(String fdate) {
        Intrinsics.checkNotNullParameter(fdate, "fdate");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy");
        try {
            Date date = simpleDateFormat.parse(fdate);
            Intrinsics.checkNotNullExpressionValue(date, "parse(...)");
            String str = simpleDateFormat2.format(date);
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        } catch (Exception unused) {
            return fdate;
        }
    }

    public final tc E1() {
        tc tcVar = this.binding;
        if (tcVar != null) {
            return tcVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
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

    public final FetchLlDetails G1() {
        FetchLlDetails fetchLlDetails = this.llDetails;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("llDetails");
        return null;
    }

    public final Context H1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
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

    public final void M1(Context context, String message) {
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
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(F1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(F1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zg3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlConfirmMobNo.N1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void O1(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String strB = F1().b("nex_parivahan", getString(R.string.app_name));
        Intrinsics.checkNotNull(strB);
        String strB2 = F1().b("btn_ok", getString(R.string.ok_txt));
        Intrinsics.checkNotNull(strB2);
        o40.q1(this, strB, message, 1, strB2, null, new b(), 16, null);
    }

    public final void P1(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_otp_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.pb_otp);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.ProgressBar");
        final ProgressBar progressBar = (ProgressBar) viewFindViewById3;
        progressBar.setVisibility(8);
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById4).setText(F1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(F1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yg3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlConfirmMobNo.Q1(progressBar, this, view);
            }
        });
        dialog.show();
    }

    public final void R1(tc tcVar) {
        Intrinsics.checkNotNullParameter(tcVar, "<set-?>");
        this.binding = tcVar;
    }

    public final void S1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void T1(FetchLlDetails fetchLlDetails) {
        Intrinsics.checkNotNullParameter(fetchLlDetails, "<set-?>");
        this.llDetails = fetchLlDetails;
    }

    public final void U1(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void V1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tc tcVarX = tc.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(tcVarX, "inflate(...)");
        R1(tcVarX);
        setContentView(E1().m());
        U1(this);
        S1(new wa3(this));
        V1(new wl5(H1()));
        E1().S.g.setText(F1().b("label_dl_serv_update_mob", "Update Mobile Number"));
        E1().S.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vg3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlConfirmMobNo.J1(this.a, view);
            }
        });
        try {
            Serializable serializableExtra = getIntent().getSerializableExtra("LLDetails");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails");
            T1((FetchLlDetails) serializableExtra);
            this.aadhaarLastFourDigitMobileNo = String.valueOf(getIntent().getStringExtra("aadhaarLastFourDigitMobileNo"));
            Serializable serializableExtra2 = getIntent().getSerializableExtra("aadharData");
            Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.DOEkycX");
            this.adharData = (DOEkycX) serializableExtra2;
        } catch (Exception unused) {
        }
        vm1 vm1Var = (vm1) new z(this).a(vm1.class);
        this.updateMobVm = vm1Var;
        if (vm1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("updateMobVm");
            vm1Var = null;
        }
        vm1Var.i().g(this, new c(new a()));
        E1().I.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wg3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlConfirmMobNo.K1(this.a, view);
            }
        });
        E1().x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xg3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlConfirmMobNo.L1(this.a, view);
            }
        });
    }
}
