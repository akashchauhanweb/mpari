package com.nic.mparivahan.dlservices.ui.mobileupdate;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.mobupdate.GetMobDetailsResponse;
import com.nic.mparivahan.dlservices.ui.mobileupdate.SarathiMobileUpdateActivity;
import com.zepto.kd1;
import com.zepto.lq7;
import com.zepto.mf4;
import com.zepto.mt6;
import com.zepto.o40;
import com.zepto.ta3;
import com.zepto.tf;
import com.zepto.vm1;
import com.zepto.wa3;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b:\u0010;J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR2\u0010'\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010\u0016R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006<"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/mobileupdate/SarathiMobileUpdateActivity;", "Lcom/zepto/o40;", "", "F1", "G1", "H1", "", "message", "N1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "M1", "Lcom/zepto/tf;", "F", "Lcom/zepto/tf;", "mBinding", "Lcom/zepto/vm1;", "G", "Lcom/zepto/vm1;", "updateMobVm", "H", "Ljava/lang/String;", "getDlNo", "()Ljava/lang/String;", "setDlNo", "(Ljava/lang/String;)V", "dlNo", "I", "getDob", "setDob", "dob", "Ljava/util/HashMap;", "J", "Ljava/util/HashMap;", "getWhatServiceRequired", "()Ljava/util/HashMap;", "setWhatServiceRequired", "(Ljava/util/HashMap;)V", "whatServiceRequired", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "K", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "D1", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "O1", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "dlDetails", "L", "rtoCode", "Lcom/zepto/wa3;", "M", "Lcom/zepto/wa3;", "E1", "()Lcom/zepto/wa3;", "P1", "(Lcom/zepto/wa3;)V", "langSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class SarathiMobileUpdateActivity extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public tf mBinding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public vm1 updateMobVm;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String dlNo;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String dob;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public DldetobjX dlDetails;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public HashMap whatServiceRequired = new HashMap();

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String rtoCode = "";

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(GetMobDetailsResponse getMobDetailsResponse) {
            try {
                if (getMobDetailsResponse.getErrorMsg() != null) {
                    SarathiMobileUpdateActivity.this.M1(getMobDetailsResponse.getErrorMsg().toString());
                    return;
                }
                tf tfVar = SarathiMobileUpdateActivity.this.mBinding;
                tf tfVar2 = null;
                if (tfVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    tfVar = null;
                }
                tfVar.H.setAlpha(1.0f);
                if (getMobDetailsResponse.getOldMobNum() != null) {
                    try {
                        tf tfVar3 = SarathiMobileUpdateActivity.this.mBinding;
                        if (tfVar3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            tfVar3 = null;
                        }
                        AppCompatEditText appCompatEditText = tfVar3.D;
                        StringBuilder sb = new StringBuilder();
                        sb.append("XXXXXX");
                        String strSubstring = getMobDetailsResponse.getOldMobNum().toString().substring(6, 10);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb.append(strSubstring);
                        appCompatEditText.setText(sb.toString());
                    } catch (Exception unused) {
                        tf tfVar4 = SarathiMobileUpdateActivity.this.mBinding;
                        if (tfVar4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        } else {
                            tfVar2 = tfVar4;
                        }
                        tfVar2.D.setText("NA");
                    }
                }
            } catch (Exception unused2) {
                SarathiMobileUpdateActivity sarathiMobileUpdateActivity = SarathiMobileUpdateActivity.this;
                String string = sarathiMobileUpdateActivity.getString(R.string.service_unavable_please_try);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                sarathiMobileUpdateActivity.M1(string);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetMobDetailsResponse) obj);
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
            tf tfVar = SarathiMobileUpdateActivity.this.mBinding;
            if (tfVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                tfVar = null;
            }
            tfVar.H.setAlpha(0.5f);
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (StringsKt__StringsJVMKt.equals(it, "yes", true)) {
                SarthiOTPMobile sarthiOTPMobile = new SarthiOTPMobile();
                SarathiMobileUpdateActivity sarathiMobileUpdateActivity = SarathiMobileUpdateActivity.this;
                tf tfVar = sarathiMobileUpdateActivity.mBinding;
                tf tfVar2 = null;
                if (tfVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    tfVar = null;
                }
                String strValueOf = String.valueOf(tfVar.C.getText());
                tf tfVar3 = SarathiMobileUpdateActivity.this.mBinding;
                if (tfVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    tfVar2 = tfVar3;
                }
                sarthiOTPMobile.l2(sarathiMobileUpdateActivity, strValueOf, String.valueOf(tfVar2.D.getText()), SarathiMobileUpdateActivity.this.D1());
            }
        }
    }

    public static final class d implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public d(Function1 function) {
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

    private final void F1() {
        if (getIntent() != null) {
            Serializable serializableExtra = getIntent().getSerializableExtra("DLDetails");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
            O1((DldetobjX) serializableExtra);
            this.dlNo = D1().getDlobj().getDlLicno();
            this.dob = D1().getBioObj().getBioDob();
            this.rtoCode = D1().getDlobj().getDlRtoCode();
            tf tfVar = null;
            try {
                tf tfVar2 = this.mBinding;
                if (tfVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    tfVar2 = null;
                }
                AppCompatEditText appCompatEditText = tfVar2.D;
                StringBuilder sb = new StringBuilder();
                sb.append("XXXXXX");
                String strSubstring = D1().getBioObj().getBioMobileNo().substring(6, 10);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(strSubstring);
                appCompatEditText.setText(sb.toString());
            } catch (Exception unused) {
                tf tfVar3 = this.mBinding;
                if (tfVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    tfVar3 = null;
                }
                tfVar3.D.setText("NA");
            }
            tf tfVar4 = this.mBinding;
            if (tfVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                tfVar4 = null;
            }
            tfVar4.x.setText(E1().b("dl_no", "DL No. : ") + " : " + this.dlNo);
            tf tfVar5 = this.mBinding;
            if (tfVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                tfVar = tfVar5;
            }
            tfVar.B.g.setText(E1().b("label_dl_serv_update_mob", "Update Mobile Number"));
        }
    }

    private final void G1() {
        this.updateMobVm = (vm1) new z(this).a(vm1.class);
        vm1 vm1Var = null;
        if (com.nic.mparivahan.a.a.a(this)) {
            vm1 vm1Var2 = this.updateMobVm;
            if (vm1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("updateMobVm");
                vm1Var2 = null;
            }
            String str = this.dob;
            Intrinsics.checkNotNull(str);
            String str2 = this.dlNo;
            Intrinsics.checkNotNull(str2);
            vm1Var2.j(str, "DL", true, str2);
        } else {
            Toast.makeText(getApplicationContext(), E1().b("service_is_not_present", ""), 0).show();
        }
        vm1 vm1Var3 = this.updateMobVm;
        if (vm1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("updateMobVm");
        } else {
            vm1Var = vm1Var3;
        }
        vm1Var.h().g(this, new d(new a()));
    }

    private final void H1() {
        tf tfVar = this.mBinding;
        tf tfVar2 = null;
        if (tfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            tfVar = null;
        }
        tfVar.B.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.si5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarathiMobileUpdateActivity.I1(this.a, view);
            }
        });
        tf tfVar3 = this.mBinding;
        if (tfVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            tfVar3 = null;
        }
        tfVar3.B.c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ti5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarathiMobileUpdateActivity.J1(view);
            }
        });
        tf tfVar4 = this.mBinding;
        if (tfVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            tfVar4 = null;
        }
        tfVar4.w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ui5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarathiMobileUpdateActivity.K1(this.a, view);
            }
        });
        tf tfVar5 = this.mBinding;
        if (tfVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            tfVar2 = tfVar5;
        }
        tfVar2.H.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vi5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarathiMobileUpdateActivity.L1(this.a, view);
            }
        });
    }

    public static final void I1(SarathiMobileUpdateActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void J1(View view) {
    }

    public static final void K1(SarathiMobileUpdateActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void L1(SarathiMobileUpdateActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        tf tfVar = this$0.mBinding;
        tf tfVar2 = null;
        if (tfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            tfVar = null;
        }
        if (tfVar.H.getAlpha() == 0.5f) {
            return;
        }
        tf tfVar3 = this$0.mBinding;
        if (tfVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            tfVar3 = null;
        }
        Editable text = tfVar3.C.getText();
        Intrinsics.checkNotNull(text);
        if (text.length() == 0) {
            String strB = this$0.E1().b("label_mb", "Please enter the mobile number");
            tf tfVar4 = this$0.mBinding;
            if (tfVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                tfVar2 = tfVar4;
            }
            this$0.w1(strB, tfVar2.m());
            return;
        }
        tf tfVar5 = this$0.mBinding;
        if (tfVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            tfVar5 = null;
        }
        Editable text2 = tfVar5.C.getText();
        Intrinsics.checkNotNull(text2);
        if (text2.length() < 10) {
            String strB2 = this$0.E1().b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no));
            tf tfVar6 = this$0.mBinding;
            if (tfVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                tfVar2 = tfVar6;
            }
            this$0.w1(strB2, tfVar2.m());
            return;
        }
        mt6.a aVar = mt6.a;
        tf tfVar7 = this$0.mBinding;
        if (tfVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            tfVar7 = null;
        }
        if (aVar.t(String.valueOf(tfVar7.C.getText()))) {
            String strB3 = this$0.E1().b("label_want_to_proceed", "Are you sure, You want to proceed ?");
            Intrinsics.checkNotNull(strB3);
            this$0.N1(strB3);
        } else {
            String strB4 = this$0.E1().b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no));
            tf tfVar8 = this$0.mBinding;
            if (tfVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                tfVar2 = tfVar8;
            }
            this$0.w1(strB4, tfVar2.m());
        }
    }

    private final void N1(String message) {
        String strB = E1().b("nex_parivahan", getString(R.string.app_name));
        Intrinsics.checkNotNull(strB);
        o40.q1(this, strB, message, 0, null, null, new c(), 24, null);
    }

    public final DldetobjX D1() {
        DldetobjX dldetobjX = this.dlDetails;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlDetails");
        return null;
    }

    public final wa3 E1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final void M1(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String strB = E1().b("nex_parivahan", getString(R.string.app_name));
        Intrinsics.checkNotNull(strB);
        String strB2 = E1().b("btn_ok", getString(R.string.ok_txt));
        Intrinsics.checkNotNull(strB2);
        o40.q1(this, strB, message, 1, strB2, null, new b(), 16, null);
    }

    public final void O1(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dlDetails = dldetobjX;
    }

    public final void P1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lq7 lq7VarF = kd1.f(this, R.layout.activity_sarathi_mobile_update);
        Intrinsics.checkNotNullExpressionValue(lq7VarF, "setContentView(...)");
        this.mBinding = (tf) lq7VarF;
        P1(new wa3(this));
        ta3.a aVar = ta3.a;
        tf tfVar = this.mBinding;
        if (tfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            tfVar = null;
        }
        aVar.s1(this, tfVar);
        F1();
        G1();
        H1();
    }
}
