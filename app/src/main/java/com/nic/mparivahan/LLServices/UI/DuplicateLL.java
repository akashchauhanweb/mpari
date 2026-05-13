package com.nic.mparivahan.LLServices.UI;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.CheckFormOne.SubmitFormOne.Other.SubmitInterface;
import com.nic.mparivahan.CheckFormOne.SubmitFormOne.Pojo.SubmitResponse;
import com.nic.mparivahan.DLServicesAuth.CheckEligibility.FormOneRequest;
import com.nic.mparivahan.DLServicesAuth.CheckEligibility.FromEligCheck;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.LLMainScreen.LlApplicationNumber;
import com.nic.mparivahan.LLMainScreen.LlDetails;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.LLServices.LlInterface;
import com.nic.mparivahan.LLServices.SubmitLlServiceAPI;
import com.nic.mparivahan.LLServices.SubmitServiceAssets.DuplicateLlRequest;
import com.nic.mparivahan.LLServices.UI.DuplicateLL;
import com.nic.mparivahan.R;
import com.zepto.cf2;
import com.zepto.df2;
import com.zepto.dm3;
import com.zepto.ef2;
import com.zepto.ff2;
import com.zepto.hl3;
import com.zepto.mf4;
import com.zepto.nb;
import com.zepto.pq;
import com.zepto.q86;
import com.zepto.r86;
import com.zepto.s86;
import com.zepto.ta3;
import com.zepto.uj3;
import com.zepto.wa3;
import com.zepto.wb0;
import com.zepto.wl5;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b£\u0001\u0010¤\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fR\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010M\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010,\u001a\u0004\bK\u0010.\"\u0004\bL\u00100R\"\u0010U\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0016\u0010X\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bV\u0010WR\"\u0010^\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010W\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010b\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010W\u001a\u0004\b`\u0010[\"\u0004\ba\u0010]R\"\u0010f\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010W\u001a\u0004\bd\u0010[\"\u0004\be\u0010]R\"\u0010j\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010W\u001a\u0004\bh\u0010[\"\u0004\bi\u0010]R\"\u0010n\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010W\u001a\u0004\bl\u0010[\"\u0004\bm\u0010]R\"\u0010r\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010W\u001a\u0004\bp\u0010[\"\u0004\bq\u0010]R\"\u0010v\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010W\u001a\u0004\bt\u0010[\"\u0004\bu\u0010]R\"\u0010z\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010W\u001a\u0004\bx\u0010[\"\u0004\by\u0010]R\"\u0010~\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b{\u0010W\u001a\u0004\b|\u0010[\"\u0004\b}\u0010]R)\u0010\u0086\u0001\u001a\u00020\u007f8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R*\u0010\u008e\u0001\u001a\u00030\u0087\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R*\u0010\u0096\u0001\u001a\u00030\u008f\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R*\u0010\u009e\u0001\u001a\u00030\u0097\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0018\u0010 \u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u009f\u0001\u0010WR\u0018\u0010¢\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b¡\u0001\u0010W¨\u0006¥\u0001"}, d2 = {"Lcom/nic/mparivahan/LLServices/UI/DuplicateLL;", "Lcom/zepto/pq;", "", "N1", "M1", "Lcom/nic/mparivahan/DLServicesAuth/CheckEligibility/FormOneRequest;", "t1", "u1", "Lcom/nic/mparivahan/LLServices/SubmitServiceAssets/DuplicateLlRequest;", "y1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "T1", "R1", "Lcom/zepto/nb;", "C", "Lcom/zepto/nb;", "B1", "()Lcom/zepto/nb;", "X1", "(Lcom/zepto/nb;)V", "mBinding", "D", "Landroid/content/Context;", "C1", "()Landroid/content/Context;", "Y1", "(Landroid/content/Context;)V", "mContext", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "J1", "()Landroid/app/ProgressDialog;", "f2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/wa3;", "F", "Lcom/zepto/wa3;", "L1", "()Lcom/zepto/wa3;", "h2", "(Lcom/zepto/wa3;)V", "session", "Lcom/zepto/wl5;", "G", "Lcom/zepto/wl5;", "K1", "()Lcom/zepto/wl5;", "g2", "(Lcom/zepto/wl5;)V", "sarathiSession", "Lcom/zepto/dm3;", "H", "Lcom/zepto/dm3;", "G1", "()Lcom/zepto/dm3;", "c2", "(Lcom/zepto/dm3;)V", "mLlViewModel", "Lcom/nic/mparivahan/LLServices/LlInterface;", "I", "Lcom/nic/mparivahan/LLServices/LlInterface;", "F1", "()Lcom/nic/mparivahan/LLServices/LlInterface;", "b2", "(Lcom/nic/mparivahan/LLServices/LlInterface;)V", "mLlInterface", "J", "z1", "V1", "langSession", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "K", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "A1", "()Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "W1", "(Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;)V", "llDetails", "L", "Ljava/lang/String;", "Mobile_no", "M", "getForm1FlagDLserReq", "()Ljava/lang/String;", "setForm1FlagDLserReq", "(Ljava/lang/String;)V", "form1FlagDLserReq", "N", "getSubmitFormOne", "i2", "submitFormOne", "O", "getAString", "setAString", "aString", "P", "getBString", "setBString", "bString", "Q", "getCString", "setCString", "cString", "R", "getDString", "setDString", "dString", "S", "getEString", "setEString", "eString", "T", "getFString", "setFString", "fString", "U", "getGString", "setGString", "gString", "Lcom/zepto/s86;", "V", "Lcom/zepto/s86;", "H1", "()Lcom/zepto/s86;", "d2", "(Lcom/zepto/s86;)V", "mSubmitFormVM", "Lcom/nic/mparivahan/CheckFormOne/SubmitFormOne/Other/SubmitInterface;", "W", "Lcom/nic/mparivahan/CheckFormOne/SubmitFormOne/Other/SubmitInterface;", "I1", "()Lcom/nic/mparivahan/CheckFormOne/SubmitFormOne/Other/SubmitInterface;", "e2", "(Lcom/nic/mparivahan/CheckFormOne/SubmitFormOne/Other/SubmitInterface;)V", "mSubmitInterface", "Lcom/zepto/ef2;", "X", "Lcom/zepto/ef2;", "D1", "()Lcom/zepto/ef2;", "Z1", "(Lcom/zepto/ef2;)V", "mFormEligVM", "Lcom/nic/mparivahan/DLServicesAuth/CheckEligibility/FromEligCheck;", "Y", "Lcom/nic/mparivahan/DLServicesAuth/CheckEligibility/FromEligCheck;", "E1", "()Lcom/nic/mparivahan/DLServicesAuth/CheckEligibility/FromEligCheck;", "a2", "(Lcom/nic/mparivahan/DLServicesAuth/CheckEligibility/FromEligCheck;)V", "mFormsInterface", "Z", "selectedRtoCd", "a0", "selectedRtoName", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class DuplicateLL extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public nb mBinding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wl5 sarathiSession;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public dm3 mLlViewModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public LlInterface mLlInterface;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public FetchLlDetails llDetails;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String Mobile_no;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String form1FlagDLserReq = "N";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String submitFormOne = "N";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String aString = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String bString = "";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String cString = "";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String dString = "";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String eString = "";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String fString = "";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String gString = "N";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public s86 mSubmitFormVM;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public SubmitInterface mSubmitInterface;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public ef2 mFormEligVM;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public FromEligCheck mFormsInterface;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String selectedRtoCd;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String selectedRtoName;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(ff2 ff2Var) {
            try {
                throw null;
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            wb0.a(obj);
            a(null);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(SubmitLlServiceAPI submitLlServiceAPI) {
            DuplicateLL.this.B1().y.c(false);
            try {
                String string = submitLlServiceAPI.getApplicationNumber().toString();
                if (string != null && string.length() != 0) {
                    Intent intent = new Intent(DuplicateLL.this, (Class<?>) LlApplicationNumber.class);
                    intent.putExtra("LLDetails", DuplicateLL.this.A1());
                    String str = DuplicateLL.this.Mobile_no;
                    String str2 = null;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("Mobile_no");
                        str = null;
                    }
                    intent.putExtra("Mobile_no", str);
                    String str3 = DuplicateLL.this.selectedRtoCd;
                    if (str3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("selectedRtoCd");
                        str3 = null;
                    }
                    intent.putExtra("selectedRtoCd", str3);
                    String str4 = DuplicateLL.this.selectedRtoName;
                    if (str4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("selectedRtoName");
                    } else {
                        str2 = str4;
                    }
                    intent.putExtra("selectedRtoName", str2);
                    intent.putExtra("appNumber", submitLlServiceAPI.getApplicationNumber());
                    DuplicateLL.this.startActivity(intent);
                }
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SubmitLlServiceAPI) obj);
            return Unit.INSTANCE;
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
        public final void invoke(String str) {
            DuplicateLL.this.B1().y.c(false);
            DuplicateLL duplicateLL = DuplicateLL.this;
            duplicateLL.T1(duplicateLL, duplicateLL.z1().b("service_is_not_present", DuplicateLL.this.getString(R.string.unable_to_get_details)));
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
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
        public final void a(SubmitResponse submitResponse) {
            DuplicateLL.this.J1().dismiss();
            try {
                if (Intrinsics.areEqual(submitResponse.getStatus_code(), "00")) {
                    DuplicateLL.this.i2("Y");
                    DuplicateLL.this.B1().y.setText(DuplicateLL.this.z1().b("vahan_btn_submit", "Submit"));
                    DuplicateLL duplicateLL = DuplicateLL.this;
                    duplicateLL.T1(duplicateLL, submitResponse.getFoneObject().get(0).getMsg());
                } else {
                    DuplicateLL duplicateLL2 = DuplicateLL.this;
                    duplicateLL2.R1(duplicateLL2, submitResponse.getFoneObject().get(0).getMsg());
                }
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SubmitResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
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
        public final void invoke(String str) {
            DuplicateLL.this.J1().dismiss();
            DuplicateLL duplicateLL = DuplicateLL.this;
            duplicateLL.T1(duplicateLL, duplicateLL.z1().b("service_is_not_present", DuplicateLL.this.getString(R.string.unable_to_get_details)));
        }
    }

    public static final class f implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public f(Function1 function) {
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

    private final void M1() {
        Y1(this);
        h2(new wa3(C1()));
        g2(new wl5(C1()));
        V1(new wa3(C1()));
        f2(new ProgressDialog(this));
        J1().setMessage(z1().b("label_challan_please_wait", "Please wait..."));
        J1().setCancelable(false);
        J1().setCanceledOnTouchOutside(false);
        B1().A.g.setText(K1().k());
        B1().I.setPaintFlags(B1().I.getPaintFlags() | 8);
        b2(LlInterface.INSTANCE.a(C1()));
        c2((dm3) new z(this, new uj3(new hl3(F1()))).a(dm3.class));
        try {
            this.Mobile_no = String.valueOf(getIntent().getStringExtra("Mobile_no"));
            this.selectedRtoCd = String.valueOf(getIntent().getStringExtra("selectedRtoCd"));
            this.selectedRtoName = String.valueOf(getIntent().getStringExtra("selectedRtoName"));
            Serializable serializableExtra = getIntent().getSerializableExtra("LLDetails");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails");
            W1((FetchLlDetails) serializableExtra);
            B1().F.setText("LL No. : " + StringsKt__StringsKt.trim((CharSequence) A1().getLearningLicence()).toString());
        } catch (Exception unused) {
        }
        a2(FromEligCheck.INSTANCE.a(this));
        Z1((ef2) new z(this, new df2(new cf2(E1()))).a(ef2.class));
        D1().h(t1());
        D1().j().g(this, new f(new a()));
        e2(SubmitInterface.INSTANCE.a(this));
        d2((s86) new z(this, new q86(new r86(I1()))).a(s86.class));
    }

    private final void N1() {
        try {
            B1().F.setVisibility(8);
            B1().I.setVisibility(8);
            B1().B.g.setText(K1().k());
            B1().B.h.setPaintFlags(8 | B1().B.h.getPaintFlags());
            B1().B.h.setText(StringsKt__StringsKt.trim((CharSequence) A1().getLearningLicence()).toString());
            B1().B.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.py1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DuplicateLL.O1(this.a, view);
                }
            });
        } catch (Exception unused) {
        }
    }

    public static final void O1(DuplicateLL this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) LlDetails.class);
            intent.putExtra("LLDetails", this$0.A1());
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final void P1(DuplicateLL this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void Q1(DuplicateLL this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void S1(Dialog d2, DuplicateLL this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final FormOneRequest t1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(502);
        String str = this.selectedRtoCd;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectedRtoCd");
            str = null;
        }
        return new FormOneRequest("mobSARATHI", "657d1c758e2e95af0014e16f5109f933", "10.248.210.8", "sarathiservice", str, arrayList);
    }

    public static final void v1(DuplicateLL this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void w1(DuplicateLL this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) LlDetails.class);
            intent.putExtra("LLDetails", this$0.A1());
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final void x1(DuplicateLL this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = StringsKt__StringsKt.trim((CharSequence) this$0.B1().w.getText().toString()).toString();
        if (string == null || string.length() == 0) {
            this$0.T1(this$0.C1(), this$0.z1().b("label_dl_serv_enter_reas_manul", this$0.getString(R.string.enter_Reason)));
            return;
        }
        if (this$0.B1().w.getText().toString().length() < 10) {
            this$0.T1(this$0.C1(), this$0.getString(R.string.pls_enter_valid_reason));
            return;
        }
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.C1(), this$0.L1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
            return;
        }
        try {
            this$0.B1().y.c(true);
            this$0.G1().p(this$0, this$0.y1());
        } catch (Exception unused) {
        }
    }

    public final FetchLlDetails A1() {
        FetchLlDetails fetchLlDetails = this.llDetails;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("llDetails");
        return null;
    }

    public final nb B1() {
        nb nbVar = this.mBinding;
        if (nbVar != null) {
            return nbVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    public final Context C1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final ef2 D1() {
        ef2 ef2Var = this.mFormEligVM;
        if (ef2Var != null) {
            return ef2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mFormEligVM");
        return null;
    }

    public final FromEligCheck E1() {
        FromEligCheck fromEligCheck = this.mFormsInterface;
        if (fromEligCheck != null) {
            return fromEligCheck;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mFormsInterface");
        return null;
    }

    public final LlInterface F1() {
        LlInterface llInterface = this.mLlInterface;
        if (llInterface != null) {
            return llInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mLlInterface");
        return null;
    }

    public final dm3 G1() {
        dm3 dm3Var = this.mLlViewModel;
        if (dm3Var != null) {
            return dm3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mLlViewModel");
        return null;
    }

    public final s86 H1() {
        s86 s86Var = this.mSubmitFormVM;
        if (s86Var != null) {
            return s86Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSubmitFormVM");
        return null;
    }

    public final SubmitInterface I1() {
        SubmitInterface submitInterface = this.mSubmitInterface;
        if (submitInterface != null) {
            return submitInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSubmitInterface");
        return null;
    }

    public final ProgressDialog J1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final wl5 K1() {
        wl5 wl5Var = this.sarathiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarathiSession");
        return null;
    }

    public final wa3 L1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final void R1(Context context, String message) {
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
        ((TextView) viewFindViewById3).setText(L1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(L1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qy1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DuplicateLL.S1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final void T1(Context context, String message) {
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
        ((TextView) viewFindViewById3).setText(L1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(L1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.oy1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DuplicateLL.U1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void V1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void W1(FetchLlDetails fetchLlDetails) {
        Intrinsics.checkNotNullParameter(fetchLlDetails, "<set-?>");
        this.llDetails = fetchLlDetails;
    }

    public final void X1(nb nbVar) {
        Intrinsics.checkNotNullParameter(nbVar, "<set-?>");
        this.mBinding = nbVar;
    }

    public final void Y1(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void Z1(ef2 ef2Var) {
        Intrinsics.checkNotNullParameter(ef2Var, "<set-?>");
        this.mFormEligVM = ef2Var;
    }

    public final void a2(FromEligCheck fromEligCheck) {
        Intrinsics.checkNotNullParameter(fromEligCheck, "<set-?>");
        this.mFormsInterface = fromEligCheck;
    }

    public final void b2(LlInterface llInterface) {
        Intrinsics.checkNotNullParameter(llInterface, "<set-?>");
        this.mLlInterface = llInterface;
    }

    public final void c2(dm3 dm3Var) {
        Intrinsics.checkNotNullParameter(dm3Var, "<set-?>");
        this.mLlViewModel = dm3Var;
    }

    public final void d2(s86 s86Var) {
        Intrinsics.checkNotNullParameter(s86Var, "<set-?>");
        this.mSubmitFormVM = s86Var;
    }

    public final void e2(SubmitInterface submitInterface) {
        Intrinsics.checkNotNullParameter(submitInterface, "<set-?>");
        this.mSubmitInterface = submitInterface;
    }

    public final void f2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void g2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarathiSession = wl5Var;
    }

    public final void h2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final void i2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.submitFormOne = str;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        nb nbVarX = nb.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(nbVarX, "inflate(...)");
        X1(nbVarX);
        setContentView(B1().m());
        M1();
        u1();
        ta3.a.H0(this, B1());
        B1().A.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jy1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DuplicateLL.P1(this.a, view);
            }
        });
        B1().B.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ky1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DuplicateLL.Q1(this.a, view);
            }
        });
        G1().l().g(this, new f(new b()));
        G1().i().g(this, new f(new c()));
        H1().i().g(this, new f(new d()));
        H1().h().g(this, new f(new e()));
        N1();
    }

    public final void u1() {
        B1().C.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ly1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DuplicateLL.v1(this.a, view);
            }
        });
        B1().I.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.my1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DuplicateLL.w1(this.a, view);
            }
        });
        B1().y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ny1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DuplicateLL.x1(this.a, view);
            }
        });
    }

    public final DuplicateLlRequest y1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("duplicateLL");
        String string = StringsKt__StringsKt.trim((CharSequence) A1().getLearningLicence()).toString();
        String string2 = StringsKt__StringsKt.trim((CharSequence) A1().getDateOfBirth()).toString();
        String stCd = A1().getState().getStCd();
        String str = this.selectedRtoCd;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectedRtoCd");
            str = null;
        }
        return new DuplicateLlRequest("UmangOD", "2335647e653c970102713f68f6aad970", "164.100.161.142", "SarathiMobileService", string, string2, stCd, str, "duplicateLL", StringsKt__StringsKt.trim((CharSequence) B1().w.getText().toString()).toString(), arrayList);
    }

    public final wa3 z1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }
}
