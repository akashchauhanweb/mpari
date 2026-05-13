package com.nic.mparivahan.ClServices.View.clobileupdate;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.z;
import com.nic.mparivahan.ClServices.View.clobileupdate.ClMobileUpdateActivity;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.mobupdate.GetMobDetailsResponse;
import com.zepto.kd1;
import com.zepto.lq7;
import com.zepto.mf4;
import com.zepto.mt6;
import com.zepto.o40;
import com.zepto.v7;
import com.zepto.vm1;
import com.zepto.wa3;
import java.util.HashMap;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b6\u00107J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR$\u0010#\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR2\u0010+\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t0$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u0016R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/nic/mparivahan/ClServices/View/clobileupdate/ClMobileUpdateActivity;", "Lcom/zepto/o40;", "", "F1", "G1", "H1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "message", "L1", "M1", "Lcom/zepto/v7;", "F", "Lcom/zepto/v7;", "mBinding", "Lcom/zepto/vm1;", "G", "Lcom/zepto/vm1;", "updateMobVm", "H", "Ljava/lang/String;", "C1", "()Ljava/lang/String;", "setClNo", "(Ljava/lang/String;)V", "clNo", "I", "D1", "setDob", "dob", "J", "getMobile_no", "setMobile_no", "mobile_no", "Ljava/util/HashMap;", "K", "Ljava/util/HashMap;", "getWhatServiceRequired", "()Ljava/util/HashMap;", "setWhatServiceRequired", "(Ljava/util/HashMap;)V", "whatServiceRequired", "L", "rtoCode", "Lcom/zepto/wa3;", "M", "Lcom/zepto/wa3;", "E1", "()Lcom/zepto/wa3;", "N1", "(Lcom/zepto/wa3;)V", "langSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ClMobileUpdateActivity extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public v7 mBinding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public vm1 updateMobVm;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String clNo;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String dob;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String mobile_no;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public HashMap whatServiceRequired = new HashMap();

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String rtoCode = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public wa3 langSession;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(GetMobDetailsResponse getMobDetailsResponse) {
            try {
                if (getMobDetailsResponse.getErrorMsg() != null) {
                    ClMobileUpdateActivity.this.L1(getMobDetailsResponse.getErrorMsg().toString());
                    return;
                }
                v7 v7Var = ClMobileUpdateActivity.this.mBinding;
                v7 v7Var2 = null;
                if (v7Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    v7Var = null;
                }
                v7Var.H.setAlpha(1.0f);
                if (getMobDetailsResponse.getOldMobNum() != null) {
                    try {
                        v7 v7Var3 = ClMobileUpdateActivity.this.mBinding;
                        if (v7Var3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            v7Var3 = null;
                        }
                        AppCompatEditText appCompatEditText = v7Var3.D;
                        StringBuilder sb = new StringBuilder();
                        sb.append("XXXXXX");
                        String strSubstring = getMobDetailsResponse.getOldMobNum().toString().substring(6, 10);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb.append(strSubstring);
                        appCompatEditText.setText(sb.toString());
                    } catch (Exception unused) {
                        v7 v7Var4 = ClMobileUpdateActivity.this.mBinding;
                        if (v7Var4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        } else {
                            v7Var2 = v7Var4;
                        }
                        v7Var2.D.setText("NA");
                    }
                }
            } catch (Exception unused2) {
                ClMobileUpdateActivity clMobileUpdateActivity = ClMobileUpdateActivity.this;
                String string = clMobileUpdateActivity.getString(R.string.service_unavable_please_try);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                clMobileUpdateActivity.L1(string);
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
            v7 v7Var = ClMobileUpdateActivity.this.mBinding;
            if (v7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                v7Var = null;
            }
            v7Var.H.setAlpha(0.5f);
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
                ClOTPMobile clOTPMobile = new ClOTPMobile();
                ClMobileUpdateActivity clMobileUpdateActivity = ClMobileUpdateActivity.this;
                v7 v7Var = clMobileUpdateActivity.mBinding;
                v7 v7Var2 = null;
                if (v7Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    v7Var = null;
                }
                String strValueOf = String.valueOf(v7Var.C.getText());
                v7 v7Var3 = ClMobileUpdateActivity.this.mBinding;
                if (v7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    v7Var2 = v7Var3;
                }
                String strValueOf2 = String.valueOf(v7Var2.D.getText());
                String clNo = ClMobileUpdateActivity.this.getClNo();
                Intrinsics.checkNotNull(clNo);
                String dob = ClMobileUpdateActivity.this.getDob();
                Intrinsics.checkNotNull(dob);
                clOTPMobile.j2(clMobileUpdateActivity, strValueOf, strValueOf2, clNo, dob);
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
            this.dob = String.valueOf(getIntent().getStringExtra("dobValue"));
            this.clNo = String.valueOf(getIntent().getStringExtra("dlValue"));
            this.rtoCode = String.valueOf(getIntent().getStringExtra("rtoCode"));
            this.mobile_no = String.valueOf(getIntent().getStringExtra("Mobile_no"));
            v7 v7Var = null;
            try {
                v7 v7Var2 = this.mBinding;
                if (v7Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    v7Var2 = null;
                }
                AppCompatEditText appCompatEditText = v7Var2.D;
                StringBuilder sb = new StringBuilder();
                sb.append("XXXXXX");
                String str = this.mobile_no;
                Intrinsics.checkNotNull(str);
                String strSubstring = str.substring(6, 10);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(strSubstring);
                appCompatEditText.setText(sb.toString());
            } catch (Exception unused) {
                v7 v7Var3 = this.mBinding;
                if (v7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    v7Var3 = null;
                }
                v7Var3.D.setText("NA");
            }
            v7 v7Var4 = this.mBinding;
            if (v7Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                v7Var4 = null;
            }
            v7Var4.x.setText(E1().b("CL_NO", "CL No.") + " : " + this.clNo);
            v7 v7Var5 = this.mBinding;
            if (v7Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                v7Var = v7Var5;
            }
            v7Var.B.g.setText(E1().b("label_dl_serv_update_mob", "Update Mobile Number"));
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
            String str2 = this.clNo;
            Intrinsics.checkNotNull(str2);
            vm1Var2.j(str, "CL", true, str2);
        } else {
            Toast.makeText(getApplicationContext(), E1().b("service_is_not_present", getString(R.string.unable_to_get_details)), 0).show();
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
        v7 v7Var = this.mBinding;
        v7 v7Var2 = null;
        if (v7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            v7Var = null;
        }
        v7Var.B.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClMobileUpdateActivity.I1(this.a, view);
            }
        });
        v7 v7Var3 = this.mBinding;
        if (v7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            v7Var3 = null;
        }
        v7Var3.w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClMobileUpdateActivity.J1(this.a, view);
            }
        });
        v7 v7Var4 = this.mBinding;
        if (v7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            v7Var2 = v7Var4;
        }
        v7Var2.H.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClMobileUpdateActivity.K1(this.a, view);
            }
        });
    }

    public static final void I1(ClMobileUpdateActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void J1(ClMobileUpdateActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void K1(ClMobileUpdateActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        v7 v7Var = this$0.mBinding;
        v7 v7Var2 = null;
        if (v7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            v7Var = null;
        }
        if (v7Var.H.getAlpha() == 0.5f) {
            return;
        }
        v7 v7Var3 = this$0.mBinding;
        if (v7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            v7Var3 = null;
        }
        Editable text = v7Var3.C.getText();
        Intrinsics.checkNotNull(text);
        if (text.length() == 0) {
            String strB = this$0.E1().b("label_mb", "Please enter the mobile number");
            v7 v7Var4 = this$0.mBinding;
            if (v7Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                v7Var2 = v7Var4;
            }
            this$0.w1(strB, v7Var2.m());
            return;
        }
        v7 v7Var5 = this$0.mBinding;
        if (v7Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            v7Var5 = null;
        }
        Editable text2 = v7Var5.C.getText();
        Intrinsics.checkNotNull(text2);
        if (text2.length() < 10) {
            String strB2 = this$0.E1().b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no));
            v7 v7Var6 = this$0.mBinding;
            if (v7Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                v7Var2 = v7Var6;
            }
            this$0.w1(strB2, v7Var2.m());
            return;
        }
        mt6.a aVar = mt6.a;
        v7 v7Var7 = this$0.mBinding;
        if (v7Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            v7Var7 = null;
        }
        if (aVar.t(String.valueOf(v7Var7.C.getText()))) {
            String strB3 = this$0.E1().b("label_want_to_proceed", "Are you sure, You want to proceed ?");
            Intrinsics.checkNotNull(strB3);
            this$0.M1(strB3);
        } else {
            String strB4 = this$0.E1().b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no));
            v7 v7Var8 = this$0.mBinding;
            if (v7Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                v7Var2 = v7Var8;
            }
            this$0.w1(strB4, v7Var2.m());
        }
    }

    /* JADX INFO: renamed from: C1, reason: from getter */
    public final String getClNo() {
        return this.clNo;
    }

    /* JADX INFO: renamed from: D1, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    public final wa3 E1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final void L1(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String strB = E1().b("nex_parivahan", getString(R.string.app_name));
        Intrinsics.checkNotNull(strB);
        String strB2 = E1().b("btn_ok", getString(R.string.ok_txt));
        Intrinsics.checkNotNull(strB2);
        o40.q1(this, strB, message, 1, strB2, null, new b(), 16, null);
    }

    public final void M1(String message) {
        String strB = E1().b("nex_parivahan", getString(R.string.app_name));
        Intrinsics.checkNotNull(strB);
        o40.q1(this, strB, message, 0, null, null, new c(), 24, null);
    }

    public final void N1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lq7 lq7VarF = kd1.f(this, R.layout.activity_cl_mobile_update);
        Intrinsics.checkNotNullExpressionValue(lq7VarF, "setContentView(...)");
        this.mBinding = (v7) lq7VarF;
        N1(new wa3(this));
        F1();
        G1();
        H1();
    }
}
