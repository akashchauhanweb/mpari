package com.nic.mparivahan.LLMainScreen.LlMobileUpdate;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.z;
import com.nic.mparivahan.LLMainScreen.LlMobileUpdate.LlMobileUpdateActivity;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.mobupdate.GetMobDetailsResponse;
import com.zepto.bd;
import com.zepto.kd1;
import com.zepto.lq7;
import com.zepto.mf4;
import com.zepto.mt6;
import com.zepto.o40;
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
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b:\u0010;J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR2\u0010'\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u0016R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006<"}, d2 = {"Lcom/nic/mparivahan/LLMainScreen/LlMobileUpdate/LlMobileUpdateActivity;", "Lcom/zepto/o40;", "", "E1", "F1", "G1", "", "message", "L1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "K1", "Lcom/zepto/bd;", "F", "Lcom/zepto/bd;", "mBinding", "Lcom/zepto/vm1;", "G", "Lcom/zepto/vm1;", "updateMobVm", "H", "Ljava/lang/String;", "getLlNo", "()Ljava/lang/String;", "setLlNo", "(Ljava/lang/String;)V", "llNo", "I", "getDob", "setDob", "dob", "Ljava/util/HashMap;", "J", "Ljava/util/HashMap;", "getWhatServiceRequired", "()Ljava/util/HashMap;", "setWhatServiceRequired", "(Ljava/util/HashMap;)V", "whatServiceRequired", "K", "rtoCode", "Lcom/zepto/wa3;", "L", "Lcom/zepto/wa3;", "C1", "()Lcom/zepto/wa3;", "M1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "M", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "D1", "()Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "N1", "(Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;)V", "llDetails", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class LlMobileUpdateActivity extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public bd mBinding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public vm1 updateMobVm;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String llNo;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String dob;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public HashMap whatServiceRequired = new HashMap();

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String rtoCode = "";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public FetchLlDetails llDetails;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(GetMobDetailsResponse getMobDetailsResponse) {
            try {
                if (getMobDetailsResponse.getErrorMsg() != null) {
                    LlMobileUpdateActivity.this.K1(getMobDetailsResponse.getErrorMsg().toString());
                    return;
                }
                bd bdVar = LlMobileUpdateActivity.this.mBinding;
                bd bdVar2 = null;
                if (bdVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    bdVar = null;
                }
                bdVar.H.setAlpha(1.0f);
                if (getMobDetailsResponse.getOldMobNum() != null) {
                    try {
                        bd bdVar3 = LlMobileUpdateActivity.this.mBinding;
                        if (bdVar3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            bdVar3 = null;
                        }
                        AppCompatEditText appCompatEditText = bdVar3.D;
                        StringBuilder sb = new StringBuilder();
                        sb.append("XXXXXX");
                        String strSubstring = getMobDetailsResponse.getOldMobNum().toString().substring(6, 10);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb.append(strSubstring);
                        appCompatEditText.setText(sb.toString());
                    } catch (Exception unused) {
                        bd bdVar4 = LlMobileUpdateActivity.this.mBinding;
                        if (bdVar4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        } else {
                            bdVar2 = bdVar4;
                        }
                        bdVar2.D.setText("NA");
                    }
                }
            } catch (Exception unused2) {
                LlMobileUpdateActivity llMobileUpdateActivity = LlMobileUpdateActivity.this;
                String string = llMobileUpdateActivity.getString(R.string.service_unavable_please_try);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                llMobileUpdateActivity.K1(string);
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
            bd bdVar = LlMobileUpdateActivity.this.mBinding;
            if (bdVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                bdVar = null;
            }
            bdVar.H.setAlpha(0.5f);
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
                LlOtpMobile llOtpMobile = new LlOtpMobile();
                LlMobileUpdateActivity llMobileUpdateActivity = LlMobileUpdateActivity.this;
                bd bdVar = llMobileUpdateActivity.mBinding;
                bd bdVar2 = null;
                if (bdVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    bdVar = null;
                }
                String strValueOf = String.valueOf(bdVar.C.getText());
                bd bdVar3 = LlMobileUpdateActivity.this.mBinding;
                if (bdVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    bdVar2 = bdVar3;
                }
                llOtpMobile.l2(llMobileUpdateActivity, strValueOf, String.valueOf(bdVar2.D.getText()), LlMobileUpdateActivity.this.D1());
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

    private final void E1() {
        if (getIntent() != null) {
            Serializable serializableExtra = getIntent().getSerializableExtra("LLDetails");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails");
            N1((FetchLlDetails) serializableExtra);
            this.llNo = StringsKt__StringsKt.trim((CharSequence) D1().getLearningLicence()).toString();
            this.dob = StringsKt__StringsKt.trim((CharSequence) D1().getDateOfBirth()).toString();
            bd bdVar = null;
            try {
                bd bdVar2 = this.mBinding;
                if (bdVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    bdVar2 = null;
                }
                AppCompatEditText appCompatEditText = bdVar2.D;
                StringBuilder sb = new StringBuilder();
                sb.append("XXXXXX");
                String strSubstring = D1().getMobileNumber().substring(6, 10);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(strSubstring);
                appCompatEditText.setText(sb.toString());
            } catch (Exception unused) {
                bd bdVar3 = this.mBinding;
                if (bdVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    bdVar3 = null;
                }
                bdVar3.D.setText("NA");
            }
            bd bdVar4 = this.mBinding;
            if (bdVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                bdVar4 = null;
            }
            bdVar4.x.setText(" LL No. : " + this.llNo);
            bd bdVar5 = this.mBinding;
            if (bdVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                bdVar = bdVar5;
            }
            bdVar.B.g.setText(C1().b("label_dl_serv_update_mob", "Update Mobile Number"));
        }
    }

    private final void F1() {
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
            String str2 = this.llNo;
            Intrinsics.checkNotNull(str2);
            vm1Var2.j(str, "LL", true, str2);
        } else {
            Toast.makeText(getApplicationContext(), C1().b("service_is_not_present", ""), 0).show();
        }
        vm1 vm1Var3 = this.updateMobVm;
        if (vm1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("updateMobVm");
        } else {
            vm1Var = vm1Var3;
        }
        vm1Var.h().g(this, new d(new a()));
    }

    private final void G1() {
        bd bdVar = this.mBinding;
        bd bdVar2 = null;
        if (bdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            bdVar = null;
        }
        bdVar.B.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rj3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlMobileUpdateActivity.H1(this.a, view);
            }
        });
        bd bdVar3 = this.mBinding;
        if (bdVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            bdVar3 = null;
        }
        bdVar3.w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sj3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlMobileUpdateActivity.I1(this.a, view);
            }
        });
        bd bdVar4 = this.mBinding;
        if (bdVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            bdVar2 = bdVar4;
        }
        bdVar2.H.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tj3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlMobileUpdateActivity.J1(this.a, view);
            }
        });
    }

    public static final void H1(LlMobileUpdateActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void I1(LlMobileUpdateActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void J1(LlMobileUpdateActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        bd bdVar = this$0.mBinding;
        bd bdVar2 = null;
        if (bdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            bdVar = null;
        }
        if (bdVar.H.getAlpha() == 0.5f) {
            return;
        }
        bd bdVar3 = this$0.mBinding;
        if (bdVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            bdVar3 = null;
        }
        Editable text = bdVar3.C.getText();
        Intrinsics.checkNotNull(text);
        if (text.length() == 0) {
            String strB = this$0.C1().b("label_mb", "Please enter the mobile number");
            bd bdVar4 = this$0.mBinding;
            if (bdVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                bdVar2 = bdVar4;
            }
            this$0.w1(strB, bdVar2.m());
            return;
        }
        bd bdVar5 = this$0.mBinding;
        if (bdVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            bdVar5 = null;
        }
        Editable text2 = bdVar5.C.getText();
        Intrinsics.checkNotNull(text2);
        if (text2.length() < 10) {
            String strB2 = this$0.C1().b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no));
            bd bdVar6 = this$0.mBinding;
            if (bdVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                bdVar2 = bdVar6;
            }
            this$0.w1(strB2, bdVar2.m());
            return;
        }
        mt6.a aVar = mt6.a;
        bd bdVar7 = this$0.mBinding;
        if (bdVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            bdVar7 = null;
        }
        if (aVar.t(String.valueOf(bdVar7.C.getText()))) {
            String strB3 = this$0.C1().b("label_want_to_proceed", "Are you sure, You want to proceed ?");
            Intrinsics.checkNotNull(strB3);
            this$0.L1(strB3);
        } else {
            String strB4 = this$0.C1().b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no));
            bd bdVar8 = this$0.mBinding;
            if (bdVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                bdVar2 = bdVar8;
            }
            this$0.w1(strB4, bdVar2.m());
        }
    }

    private final void L1(String message) {
        String strB = C1().b("nex_parivahan", getString(R.string.app_name));
        Intrinsics.checkNotNull(strB);
        o40.q1(this, strB, message, 0, null, null, new c(), 24, null);
    }

    public final wa3 C1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final FetchLlDetails D1() {
        FetchLlDetails fetchLlDetails = this.llDetails;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("llDetails");
        return null;
    }

    public final void K1(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String strB = C1().b("nex_parivahan", getString(R.string.app_name));
        Intrinsics.checkNotNull(strB);
        String strB2 = C1().b("btn_ok", getString(R.string.ok_txt));
        Intrinsics.checkNotNull(strB2);
        o40.q1(this, strB, message, 1, strB2, null, new b(), 16, null);
    }

    public final void M1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void N1(FetchLlDetails fetchLlDetails) {
        Intrinsics.checkNotNullParameter(fetchLlDetails, "<set-?>");
        this.llDetails = fetchLlDetails;
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lq7 lq7VarF = kd1.f(this, R.layout.activity_ll_mobile_update);
        Intrinsics.checkNotNullExpressionValue(lq7VarF, "setContentView(...)");
        this.mBinding = (bd) lq7VarF;
        M1(new wa3(this));
        E1();
        F1();
        G1();
    }
}
