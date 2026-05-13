package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.AadhaarVerification;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.InputFilter;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.google.gson.Gson;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.AadarkycVerify;
import com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse;
import com.nic.mparivahan.VahanEkyc.EkYCService;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.eKycResponse;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.ApiMessage;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.DOAadhaarResponse;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.DOEkyc;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.Data;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.EkycVerifyResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.ApFacelessCheckModel;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.AadhaarVerification.ToAadharVerification;
import com.zepto.e47;
import com.zepto.em7;
import com.zepto.f47;
import com.zepto.jd7;
import com.zepto.jh;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.s14;
import com.zepto.si2;
import com.zepto.ta3;
import com.zepto.vh7;
import com.zepto.wa3;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0015J\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u001e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tJ\u0016\u0010\u0012\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\tR\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R.\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010A\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0016\u0010C\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010<R\u0016\u0010E\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010<R\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010U\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010Y\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010<\u001a\u0004\bW\u0010>\"\u0004\bX\u0010@R\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010<\u001a\u0004\b[\u0010>\"\u0004\b\\\u0010@R\u0016\u0010^\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010<R$\u0010f\u001a\u0004\u0018\u00010_8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010n\u001a\u00020g8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010v\u001a\u00020o8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010z\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010<\u001a\u0004\bx\u0010>\"\u0004\by\u0010@R'\u0010\u0082\u0001\u001a\u0004\u0018\u00010{8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R&\u0010\u0086\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010<\u001a\u0005\b\u0084\u0001\u0010>\"\u0005\b\u0085\u0001\u0010@R&\u0010\u008a\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010<\u001a\u0005\b\u0088\u0001\u0010>\"\u0005\b\u0089\u0001\u0010@R&\u0010\u008e\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010<\u001a\u0005\b\u008c\u0001\u0010>\"\u0005\b\u008d\u0001\u0010@R&\u0010\u0092\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008f\u0001\u0010<\u001a\u0005\b\u0090\u0001\u0010>\"\u0005\b\u0091\u0001\u0010@R&\u0010\u0096\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0093\u0001\u0010<\u001a\u0005\b\u0094\u0001\u0010>\"\u0005\b\u0095\u0001\u0010@R,\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001¨\u0006¡\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/AadhaarVerification/ToAadharVerification;", "Lcom/zepto/pq;", "", "h2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "i2", "", "isFaceless", "name", "address", "k2", "mobile_no", "z2", "Lcom/zepto/jh;", "C", "Lcom/zepto/jh;", "F1", "()Lcom/zepto/jh;", "m2", "(Lcom/zepto/jh;)V", "binding", "Lcom/zepto/f47;", "D", "Lcom/zepto/f47;", "L1", "()Lcom/zepto/f47;", "q2", "(Lcom/zepto/f47;)V", "mView", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "N1", "()Landroid/app/ProgressDialog;", "t2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/nic/mparivahan/VahanEkyc/EkYCService;", "F", "Lcom/nic/mparivahan/VahanEkyc/EkYCService;", "P1", "()Lcom/nic/mparivahan/VahanEkyc/EkYCService;", "v2", "(Lcom/nic/mparivahan/VahanEkyc/EkYCService;)V", "retrofitService_one", "Ljava/util/HashMap;", "G", "Ljava/util/HashMap;", "Q1", "()Ljava/util/HashMap;", "setServiceSelection_HashMap", "(Ljava/util/HashMap;)V", "serviceSelection_HashMap", "H", "Ljava/lang/String;", "getOff_code", "()Ljava/lang/String;", "r2", "(Ljava/lang/String;)V", "off_code", "I", "adahar_no", "J", "txnNo", "Lcom/zepto/ld7;", "K", "Lcom/zepto/ld7;", "S1", "()Lcom/zepto/ld7;", "y2", "(Lcom/zepto/ld7;)V", "viewModelv1", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "L", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "O1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "u2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "M", "M1", "s2", "owner_name_addhaar", "N", "E1", "l2", "O", "RC", "Lcom/nic/mparivahan/VahanEkyc/AadarkycVerify$dOEkyc;", "P", "Lcom/nic/mparivahan/VahanEkyc/AadarkycVerify$dOEkyc;", "I1", "()Lcom/nic/mparivahan/VahanEkyc/AadarkycVerify$dOEkyc;", "setDOAuthOTP", "(Lcom/nic/mparivahan/VahanEkyc/AadarkycVerify$dOEkyc;)V", "dOAuthOTP", "Lcom/zepto/wa3;", "Q", "Lcom/zepto/wa3;", "K1", "()Lcom/zepto/wa3;", "p2", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/vh7;", "R", "Lcom/zepto/vh7;", "getSession", "()Lcom/zepto/vh7;", "w2", "(Lcom/zepto/vh7;)V", "session", "S", "getPurCode", "setPurCode", "purCode", "Landroid/app/Dialog;", "T", "Landroid/app/Dialog;", "H1", "()Landroid/app/Dialog;", "setD", "(Landroid/app/Dialog;)V", "d", "U", "getType", "setType", "type", "V", "getFlage", "setFlage", "flage", "W", "R1", "x2", "stateCode", "X", "G1", "n2", "chassiNo", "Y", "getRc_number", "setRc_number", "rc_number", "Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;", "Z", "Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;", "J1", "()Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;", "o2", "(Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;)V", "doAadhaarResponse", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ToAadharVerification extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public jh binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public f47 mView;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public EkYCService retrofitService_one;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ld7 viewModelv1;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public AadarkycVerify.dOEkyc dOAuthOTP;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public vh7 session;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public Dialog d;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String stateCode;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String chassiNo;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public DoAadhaarResponse doAadhaarResponse;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public HashMap serviceSelection_HashMap = new HashMap();

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String adahar_no = "";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String txnNo = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String owner_name_addhaar = "NA";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String address = "NA";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String RC = "";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String purCode = "";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String type = "A";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String flage = "";

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String rc_number = "";

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
        public final void a(EkycVerifyResponse ekycVerifyResponse) {
            DOEkyc dOEkyc;
            DOAadhaarResponse dOAadhaarResponse;
            DOEkyc dOEkyc2;
            DOEkyc dOEkyc3;
            DOEkyc dOEkyc4;
            DOEkyc dOEkyc5;
            DOEkyc dOEkyc6;
            DOEkyc dOEkyc7;
            DOEkyc dOEkyc8;
            ToAadharVerification.this.N1().dismiss();
            if (ekycVerifyResponse == null) {
                ToAadharVerification.this.N1().dismiss();
                ToAadharVerification toAadharVerification = ToAadharVerification.this;
                toAadharVerification.i2(toAadharVerification, "Unable to verify the request, Please try after some time");
                return;
            }
            ApiMessage apiMessage = ekycVerifyResponse.getApiMessage();
            if (apiMessage == null || apiMessage.getStatusCode() != 200) {
                Log.e("Calling Otp", "calling otp");
                ToAadharVerification toAadharVerification2 = ToAadharVerification.this;
                ApiMessage apiMessage2 = ekycVerifyResponse.getApiMessage();
                toAadharVerification2.i2(toAadharVerification2, String.valueOf(apiMessage2 != null ? apiMessage2.getDeveloperMessage() : null));
                return;
            }
            Data data = ekycVerifyResponse.getData();
            DOAadhaarResponse dOAadhaarResponse2 = data != null ? data.getDOAadhaarResponse() : null;
            if (String.valueOf(dOAadhaarResponse2 != null ? dOAadhaarResponse2.getStatus() : null).length() == 0) {
                return;
            }
            if (StringsKt__StringsJVMKt.equals(String.valueOf(dOAadhaarResponse2 != null ? dOAadhaarResponse2.getStatus() : null), "Y", true)) {
                try {
                    new vh7(ToAadharVerification.this).f(ToAadharVerification.this.txnNo);
                    if (String.valueOf((dOAadhaarResponse2 == null || (dOEkyc8 = dOAadhaarResponse2.getDOEkyc()) == null) ? null : dOEkyc8.getName()).length() != 0) {
                        ToAadharVerification.this.s2(String.valueOf((dOAadhaarResponse2 == null || (dOEkyc = dOAadhaarResponse2.getDOEkyc()) == null) ? null : dOEkyc.getName()));
                    }
                    ToAadharVerification toAadharVerification3 = ToAadharVerification.this;
                    StringBuilder sb = new StringBuilder();
                    sb.append((dOAadhaarResponse2 == null || (dOEkyc7 = dOAadhaarResponse2.getDOEkyc()) == null) ? null : dOEkyc7.getHouse());
                    sb.append(' ');
                    sb.append((dOAadhaarResponse2 == null || (dOEkyc6 = dOAadhaarResponse2.getDOEkyc()) == null) ? null : dOEkyc6.getStreet());
                    sb.append(' ');
                    sb.append((dOAadhaarResponse2 == null || (dOEkyc5 = dOAadhaarResponse2.getDOEkyc()) == null) ? null : dOEkyc5.getLocalityIfAny());
                    sb.append(' ');
                    sb.append((dOAadhaarResponse2 == null || (dOEkyc4 = dOAadhaarResponse2.getDOEkyc()) == null) ? null : dOEkyc4.getDist());
                    sb.append(' ');
                    sb.append((dOAadhaarResponse2 == null || (dOEkyc3 = dOAadhaarResponse2.getDOEkyc()) == null) ? null : dOEkyc3.getState());
                    sb.append(' ');
                    sb.append((dOAadhaarResponse2 == null || (dOEkyc2 = dOAadhaarResponse2.getDOEkyc()) == null) ? null : Integer.valueOf(dOEkyc2.getPincode()));
                    toAadharVerification3.l2(sb.toString());
                    Data data2 = ekycVerifyResponse.getData();
                    DOEkyc dOEkyc9 = (data2 == null || (dOAadhaarResponse = data2.getDOAadhaarResponse()) == null) ? null : dOAadhaarResponse.getDOEkyc();
                    Intrinsics.checkNotNull(dOEkyc9);
                    DOEkyc dOEkycCopy = dOEkyc9.copy((33538046 & 1) != 0 ? dOEkyc9.aadhaarNo : Long.parseLong(ToAadharVerification.this.F1().i.getText().toString()), (33538046 & 2) != 0 ? dOEkyc9.address : null, (33538046 & 4) != 0 ? dOEkyc9.careOf : null, (33538046 & 8) != 0 ? dOEkyc9.code : null, (33538046 & 16) != 0 ? dOEkyc9.dist : null, (33538046 & 32) != 0 ? dOEkyc9.dob : null, (33538046 & 64) != 0 ? dOEkyc9.email : null, (33538046 & 128) != 0 ? dOEkyc9.errorCode : null, (33538046 & 256) != 0 ? dOEkyc9.gender : null, (33538046 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? dOEkyc9.house : null, (33538046 & 1024) != 0 ? dOEkyc9.landMark : null, (33538046 & 2048) != 0 ? dOEkyc9.localityIfAny : null, (33538046 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? dOEkyc9.name : null, (33538046 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? dOEkyc9.phone : 0, (33538046 & 16384) != 0 ? dOEkyc9.pht : " ", (33538046 & 32768) != 0 ? dOEkyc9.pincode : 0, (33538046 & 65536) != 0 ? dOEkyc9.postOffice : null, (33538046 & 131072) != 0 ? dOEkyc9.reason : null, (33538046 & 262144) != 0 ? dOEkyc9.state : null, (33538046 & 524288) != 0 ? dOEkyc9.status : null, (33538046 & 1048576) != 0 ? dOEkyc9.street : null, (33538046 & 2097152) != 0 ? dOEkyc9.subDist : null, (33538046 & 4194304) != 0 ? dOEkyc9.villageTownCity : null, (33538046 & 8388608) != 0 ? dOEkyc9.vtcCode : null, (33538046 & 16777216) != 0 ? dOEkyc9.xmlUID : null);
                    Gson gson = new Gson();
                    ToAadharVerification toAadharVerification4 = ToAadharVerification.this;
                    AadarkycVerify.dOEkyc dOAuthOTP = toAadharVerification4.getDOAuthOTP();
                    String finalxml = dOAadhaarResponse2 != null ? dOAadhaarResponse2.getFinalxml() : null;
                    Data data3 = ekycVerifyResponse.getData();
                    toAadharVerification4.o2(new DoAadhaarResponse(dOAuthOTP, dOEkycCopy, finalxml, String.valueOf(data3 != null ? data3.getRegNo() : null), dOAadhaarResponse2 != null ? dOAadhaarResponse2.getStatus() : null, ToAadharVerification.this.txnNo));
                    ToAadharVerification toAadharVerification5 = ToAadharVerification.this;
                    Data data4 = ekycVerifyResponse.getData();
                    toAadharVerification5.RC = String.valueOf(data4 != null ? data4.getRegNo() : null);
                    ld7 ld7VarS1 = ToAadharVerification.this.S1();
                    ToAadharVerification toAadharVerification6 = ToAadharVerification.this;
                    String json = gson.toJson(toAadharVerification6.getDoAadhaarResponse());
                    Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                    ld7VarS1.m1(toAadharVerification6, json);
                } catch (Exception e) {
                    ToAadharVerification.this.N1().dismiss();
                    e.printStackTrace();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((EkycVerifyResponse) obj);
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
            ToAadharVerification.this.N1().dismiss();
            ToAadharVerification toAadharVerification = ToAadharVerification.this;
            toAadharVerification.i2(toAadharVerification, "Unable to verify the request, Please try after some time");
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
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
        public final void a(Boolean bool) {
            if (ToAadharVerification.this.N1().isShowing()) {
                ToAadharVerification.this.N1().dismiss();
            }
            Intrinsics.checkNotNull(bool);
            if (!bool.booleanValue()) {
                ToAadharVerification toAadharVerification = ToAadharVerification.this;
                toAadharVerification.i2(toAadharVerification, "Unable to verify the Aadhaar, Please try after some time");
                return;
            }
            ld7 ld7VarS1 = ToAadharVerification.this.S1();
            ToAadharVerification toAadharVerification2 = ToAadharVerification.this;
            ld7VarS1.n(toAadharVerification2, toAadharVerification2.R1());
            ld7 ld7VarS12 = ToAadharVerification.this.S1();
            ToAadharVerification toAadharVerification3 = ToAadharVerification.this;
            ld7VarS12.p1(toAadharVerification3, toAadharVerification3.R1());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Boolean) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
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
            Dialog d;
            if (ToAadharVerification.this.N1().isShowing()) {
                ToAadharVerification.this.N1().dismiss();
            }
            if (StringsKt__StringsJVMKt.equals(str, "Error", true)) {
                ToAadharVerification toAadharVerification = ToAadharVerification.this;
                toAadharVerification.i2(toAadharVerification, "Unable to verify the Aadhaar, Please try after some time");
                return;
            }
            if (ToAadharVerification.this.getD() != null && (d = ToAadharVerification.this.getD()) != null) {
                d.dismiss();
            }
            ToAadharVerification toAadharVerification2 = ToAadharVerification.this;
            toAadharVerification2.i2(toAadharVerification2, str.toString());
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(ApFacelessCheckModel apFacelessCheckModel) {
            ToAadharVerification.this.N1().dismiss();
            try {
                String facelesswithaadharonly = apFacelessCheckModel.getFacelesswithaadharonly();
                if (facelesswithaadharonly != null && facelesswithaadharonly.length() != 0) {
                    List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) apFacelessCheckModel.getFacelesswithaadharonly(), new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default, 10));
                    Iterator it = listSplit$default.iterator();
                    while (it.hasNext()) {
                        arrayList.add(StringsKt__StringsKt.trim((CharSequence) it.next()).toString());
                    }
                    if (arrayList.contains(VContant.INSTANCE.g(ToAadharVerification.this.getServiceSelection_HashMap()))) {
                        ToAadharVerification toAadharVerification = ToAadharVerification.this;
                        toAadharVerification.k2(true, toAadharVerification.getOwner_name_addhaar(), ToAadharVerification.this.getAddress());
                        return;
                    } else {
                        ToAadharVerification toAadharVerification2 = ToAadharVerification.this;
                        toAadharVerification2.k2(true, toAadharVerification2.getOwner_name_addhaar(), ToAadharVerification.this.getAddress());
                        return;
                    }
                }
                ToAadharVerification toAadharVerification3 = ToAadharVerification.this;
                toAadharVerification3.k2(true, toAadharVerification3.getOwner_name_addhaar(), ToAadharVerification.this.getAddress());
            } catch (Exception e) {
                ToAadharVerification toAadharVerification4 = ToAadharVerification.this;
                toAadharVerification4.k2(true, toAadharVerification4.getOwner_name_addhaar(), ToAadharVerification.this.getAddress());
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ApFacelessCheckModel) obj);
            return Unit.INSTANCE;
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

    public static final class g extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ TextView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(TextView textView, TextView textView2) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = textView2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.b.setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.a.setText("Time remaining : " + (j / ((long) 1000)));
            this.b.setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    public static final class h extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ TextView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(TextView textView, TextView textView2) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = textView2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.b.setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.a.setText("Time remaining : " + (j / ((long) 1000)));
            this.b.setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    public static final void A2(EditText enterOtp, ImageView shownPin, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        Intrinsics.checkNotNullParameter(shownPin, "$shownPin");
        if (enterOtp.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            shownPin.setImageResource(R.drawable.pass_visible);
            enterOtp.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            shownPin.setImageResource(R.drawable.mvvm_visibility);
            enterOtp.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public static final void B2(ToAadharVerification this$0, TextView time_text, TextView resendOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(time_text, "$time_text");
        Intrinsics.checkNotNullParameter(resendOtp, "$resendOtp");
        this$0.N1().show();
        new h(time_text, resendOtp).start();
        new SecureRandom().nextInt(1410065407);
        this$0.N1().show();
        this$0.L1().l(this$0, this$0.F1().i.getText().toString(), this$0.rc_number, this$0.G1(), this$0.type, VContant.INSTANCE.g(this$0.serviceSelection_HashMap), this$0.R1());
    }

    public static final void C2(EditText enterOtp, ToAadharVerification this$0, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = enterOtp.getText().toString();
        if (string.length() == 0) {
            Toast.makeText(this$0, "Please enter the OTP", 0).show();
            return;
        }
        if (string.length() < 6) {
            Toast.makeText(this$0, "Please enter the valid OTP", 0).show();
            return;
        }
        this$0.N1().show();
        if (this$0.F1().C.isChecked()) {
            this$0.type = "V";
        }
        vh7 vh7Var = new vh7(this$0);
        vh7Var.a();
        this$0.L1().n(this$0, this$0.F1().i.getText().toString(), this$0.rc_number, this$0.G1(), this$0.type, VContant.INSTANCE.g(this$0.serviceSelection_HashMap), string, vh7Var.a(), this$0.R1());
    }

    public static final void D2(EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        enterOtp.setText("");
    }

    public static final void E2(ToAadharVerification this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.d;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public static final void T1(ToAadharVerification this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void U1(ToAadharVerification this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.h2();
    }

    public static final void V1(ToAadharVerification this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.F1().f.setText("");
    }

    public static final void W1(ToAadharVerification this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.N1().dismiss();
        this$0.k2(true, this$0.owner_name_addhaar, this$0.address);
    }

    public static final void X1(ToAadharVerification this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.F1().C.isChecked()) {
            this$0.type = "V";
        }
        this$0.N1().show();
        this$0.L1().l(this$0, this$0.F1().i.getText().toString(), this$0.rc_number, this$0.G1(), this$0.type, VContant.INSTANCE.g(this$0.serviceSelection_HashMap), this$0.R1());
    }

    public static final void Y1(ToAadharVerification this$0, eKycResponse ekycresponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.N1().dismiss();
        try {
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.ApiMessage apiMessage = ekycresponse.getApiMessage();
            if (apiMessage == null || apiMessage.getStatusCode() != 200) {
                com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.ApiMessage apiMessage2 = ekycresponse.getApiMessage();
                this$0.i2(this$0, String.valueOf(apiMessage2 != null ? apiMessage2.getDeveloperMessage() : null));
                return;
            }
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.Data data = ekycresponse.getData();
            this$0.txnNo = String.valueOf(data != null ? data.getTxNo() : null);
            vh7 vh7Var = new vh7(this$0);
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.Data data2 = ekycresponse.getData();
            vh7Var.f(String.valueOf(data2 != null ? data2.getTxNo() : null));
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.Data data3 = ekycresponse.getData();
            this$0.z2(this$0, String.valueOf(data3 != null ? data3.getLastFourMobileNumber() : null));
        } catch (Exception unused) {
            this$0.i2(this$0, "Unable to process the request, Please try after some time");
        }
    }

    public static final void Z1(ToAadharVerification this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.N1().dismiss();
        this$0.i2(this$0, "Unable to process the request, Please try after some time");
    }

    public static final void a2(ToAadharVerification this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Editable text = this$0.F1().i.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0 && this$0.F1().c.isChecked()) {
            this$0.i2(this$0, "Please enter the Aadhaar Number");
            return;
        }
        if (this$0.F1().i.getText().length() < 12 && this$0.F1().c.isChecked()) {
            this$0.i2(this$0, "Please enter the valid Aadhaar Number");
            return;
        }
        if (this$0.F1().i.getText().length() > 12 && this$0.F1().c.isChecked()) {
            this$0.i2(this$0, "Please enter the valid Aadhaar Number");
            return;
        }
        Editable text2 = this$0.F1().i.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        if (text2.length() == 0 && this$0.F1().C.isChecked()) {
            this$0.i2(this$0, "Please enter the Virtual Id");
            return;
        }
        if (this$0.F1().i.getText().length() < 16 && this$0.F1().C.isChecked()) {
            this$0.i2(this$0, "Please enter the valid Virtual Id");
            return;
        }
        if (!this$0.F1().d.isChecked() && this$0.F1().C.isChecked()) {
            this$0.i2(this$0, "Please agree with VID based e-KYC consent");
            return;
        }
        if (!this$0.F1().d.isChecked() && this$0.F1().c.isChecked()) {
            this$0.i2(this$0, "Please agree with Aadhaar based e-KYC consent");
            return;
        }
        String str = this$0.F1().C.isChecked() ? "V" : "A";
        this$0.N1().show();
        this$0.L1().l(this$0, this$0.F1().i.getText().toString(), this$0.rc_number, this$0.G1(), str, VContant.INSTANCE.g(this$0.serviceSelection_HashMap), this$0.R1());
    }

    public static final void b2(ToAadharVerification this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.F1().i.getText().clear();
    }

    public static final void c2(ToAadharVerification this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        final Dialog dialog = new Dialog(this$0);
        dialog.setContentView(R.layout.term_cond_aadhar_dialog);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        View viewFindViewById = dialog.findViewById(R.id.cancelIv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        View viewFindViewById2 = dialog.findViewById(R.id.termConditionWv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        WebView webView = (WebView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById3;
        if (this$0.F1().C.isChecked()) {
            textView.setText("VID based e-KYC consent");
        } else {
            textView.setText("Aadhaar based e-KYC consent");
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yg6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ToAadharVerification.d2(dialog, view2);
            }
        });
        webView.loadUrl(s14.a.g() + this$0.K1().d() + "/mparivahan-info-terms-of-use-aadhaar.html");
        webView.clearCache(true);
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d2(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    public static final void e2(ToAadharVerification this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.F1().C.setChecked(false);
            this$0.F1().c.setChecked(true);
            this$0.F1().i.setHint("Enter Aadhaar Number");
            this$0.F1().i.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(12)});
        }
    }

    public static final void f2(ToAadharVerification this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.F1().c.setChecked(false);
            this$0.F1().C.setChecked(true);
            this$0.F1().i.setHint("Enter VID Number");
            this$0.F1().i.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(16)});
        }
    }

    public static final void g2(ToAadharVerification this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.F1().f.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            this$0.F1().r.setImageResource(R.drawable.pass_visible);
            this$0.F1().f.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            this$0.F1().r.setImageResource(R.drawable.mvvm_visibility);
            this$0.F1().f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    private final void h2() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: renamed from: E1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    public final jh F1() {
        jh jhVar = this.binding;
        if (jhVar != null) {
            return jhVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final String G1() {
        String str = this.chassiNo;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chassiNo");
        return null;
    }

    /* JADX INFO: renamed from: H1, reason: from getter */
    public final Dialog getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: I1, reason: from getter */
    public final AadarkycVerify.dOEkyc getDOAuthOTP() {
        return this.dOAuthOTP;
    }

    /* JADX INFO: renamed from: J1, reason: from getter */
    public final DoAadhaarResponse getDoAadhaarResponse() {
        return this.doAadhaarResponse;
    }

    public final wa3 K1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final f47 L1() {
        f47 f47Var = this.mView;
        if (f47Var != null) {
            return f47Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mView");
        return null;
    }

    /* JADX INFO: renamed from: M1, reason: from getter */
    public final String getOwner_name_addhaar() {
        return this.owner_name_addhaar;
    }

    public final ProgressDialog N1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final VahanProService O1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final EkYCService P1() {
        EkYCService ekYCService = this.retrofitService_one;
        if (ekYCService != null) {
            return ekYCService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService_one");
        return null;
    }

    /* JADX INFO: renamed from: Q1, reason: from getter */
    public final HashMap getServiceSelection_HashMap() {
        return this.serviceSelection_HashMap;
    }

    public final String R1() {
        String str = this.stateCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stateCode");
        return null;
    }

    public final ld7 S1() {
        ld7 ld7Var = this.viewModelv1;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelv1");
        return null;
    }

    public final void i2(Context context, String message) {
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
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sg6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToAadharVerification.j2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void k2(boolean isFaceless, String name, String address) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(address, "address");
        Dialog dialog = this.d;
        if (dialog != null && dialog != null) {
            dialog.dismiss();
        }
        Intent intent = new Intent(this, (Class<?>) ToAadharVerification.class);
        intent.putExtra(VContant.AUTHMODE, "A");
        intent.putExtra(VContant.ACTIVITY, this.flage);
        intent.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, name);
        intent.putExtra(VContant.NEXGEN_addahar_address, address);
        intent.putExtra("AadhaarDetails", this.doAadhaarResponse);
        if (this.serviceSelection_HashMap.containsKey(VContant.M_VALUE)) {
            intent.putExtra(VContant.M_VALUE, (String) this.serviceSelection_HashMap.get(VContant.M_VALUE));
        }
        setResult(-1, intent);
        finish();
    }

    public final void l2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.address = str;
    }

    public final void m2(jh jhVar) {
        Intrinsics.checkNotNullParameter(jhVar, "<set-?>");
        this.binding = jhVar;
    }

    public final void n2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.chassiNo = str;
    }

    public final void o2(DoAadhaarResponse doAadhaarResponse) {
        this.doAadhaarResponse = doAadhaarResponse;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vahan_process_with_adhar);
        jh jhVarC = jh.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(jhVarC, "inflate(...)");
        m2(jhVarC);
        setContentView(F1().b());
        ta3.a.N2(this, F1());
        p2(new wa3(this));
        v2(EkYCService.INSTANCE.a(this));
        u2(VahanProService.INSTANCE.a(this));
        t2(new ProgressDialog(this));
        N1().setMessage("Please wait...");
        N1().setCancelable(false);
        N1().setCanceledOnTouchOutside(false);
        new SecureRandom().nextInt(1410065407);
        w2(new vh7(this));
        if (getIntent() != null) {
            si2 si2Var = (si2) getIntent().getParcelableExtra(VContant.AAHARAUTH);
            Intrinsics.checkNotNull(si2Var);
            this.rc_number = si2Var.g();
            this.serviceSelection_HashMap = si2Var.h();
            r2(si2Var.e());
            this.purCode = si2Var.f();
            x2(si2Var.i());
            n2(si2Var.c());
            this.flage = si2Var.d();
        }
        String str = this.rc_number;
        if (str != null && str.length() != 0) {
            F1().z.setText(this.rc_number.toString());
        }
        F1().b.setText("Aadhar based eKYC of New Owner (Buyer)");
        F1().v.i.setText(String.valueOf(K1().b("toSellerHeader", "Transfer of Ownership \n(Buyer)")));
        F1().v.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.og6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToAadharVerification.T1(this.a, view);
            }
        });
        F1().v.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ch6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToAadharVerification.U1(this.a, view);
            }
        });
        q2((f47) new z(this, new em7(new e47(P1()))).a(f47.class));
        y2((ld7) new z(this, new kd7(new jd7(O1()))).a(ld7.class));
        F1().y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dh6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToAadharVerification.a2(this.a, view);
            }
        });
        F1().w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.eh6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToAadharVerification.b2(this.a, view);
            }
        });
        F1().t.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fh6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToAadharVerification.c2(this.a, view);
            }
        });
        F1().c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.gh6
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ToAadharVerification.e2(this.a, compoundButton, z);
            }
        });
        F1().C.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.hh6
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ToAadharVerification.f2(this.a, compoundButton, z);
            }
        });
        F1().r.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pg6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToAadharVerification.g2(this.a, view);
            }
        });
        F1().x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qg6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToAadharVerification.V1(this.a, view);
            }
        });
        L1().g().g(this, new f(new a()));
        L1().h().g(this, new f(new b()));
        S1().k1().g(this, new f(new c()));
        S1().l1().g(this, new f(new d()));
        S1().u().g(this, new f(new e()));
        S1().v().g(this, new mf4() { // from class: com.zepto.rg6
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                ToAadharVerification.W1(this.a, (String) obj);
            }
        });
        F1().p.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zg6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToAadharVerification.X1(this.a, view);
            }
        });
        L1().i().g(this, new mf4() { // from class: com.zepto.ah6
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                ToAadharVerification.Y1(this.a, (eKycResponse) obj);
            }
        });
        L1().j().g(this, new mf4() { // from class: com.zepto.bh6
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                ToAadharVerification.Z1(this.a, (String) obj);
            }
        });
    }

    public final void p2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void q2(f47 f47Var) {
        Intrinsics.checkNotNullParameter(f47Var, "<set-?>");
        this.mView = f47Var;
    }

    public final void r2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void s2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.owner_name_addhaar = str;
    }

    public final void t2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void u2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void v2(EkYCService ekYCService) {
        Intrinsics.checkNotNullParameter(ekYCService, "<set-?>");
        this.retrofitService_one = ekYCService;
    }

    public final void w2(vh7 vh7Var) {
        Intrinsics.checkNotNullParameter(vh7Var, "<set-?>");
        this.session = vh7Var;
    }

    public final void x2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCode = str;
    }

    public final void y2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModelv1 = ld7Var;
    }

    public final void z2(Context context, String mobile_no) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        Dialog dialog = new Dialog(context);
        this.d = dialog;
        dialog.setContentView(R.layout.aadhaar_diloge);
        Dialog dialog2 = this.d;
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(false);
        }
        Dialog dialog3 = this.d;
        if (dialog3 != null) {
            dialog3.setCancelable(false);
        }
        Dialog dialog4 = this.d;
        Window window = dialog4 != null ? dialog4.getWindow() : null;
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Dialog dialog5 = this.d;
        LinearLayout linearLayout = dialog5 != null ? (LinearLayout) dialog5.findViewById(R.id.pop_up_close) : null;
        Intrinsics.checkNotNull(linearLayout, "null cannot be cast to non-null type android.widget.LinearLayout");
        Dialog dialog6 = this.d;
        final TextView textView = dialog6 != null ? (TextView) dialog6.findViewById(R.id.resendOtp) : null;
        Intrinsics.checkNotNull(textView, "null cannot be cast to non-null type android.widget.TextView");
        Dialog dialog7 = this.d;
        final ImageView imageView = dialog7 != null ? (ImageView) dialog7.findViewById(R.id.showmpin) : null;
        Intrinsics.checkNotNull(imageView, "null cannot be cast to non-null type android.widget.ImageView");
        Dialog dialog8 = this.d;
        TextView textView2 = dialog8 != null ? (TextView) dialog8.findViewById(R.id.submitOtp) : null;
        Intrinsics.checkNotNull(textView2, "null cannot be cast to non-null type android.widget.TextView");
        Dialog dialog9 = this.d;
        final EditText editText = dialog9 != null ? (EditText) dialog9.findViewById(R.id.enterOtp) : null;
        Intrinsics.checkNotNull(editText, "null cannot be cast to non-null type android.widget.EditText");
        Dialog dialog10 = this.d;
        final TextView textView3 = dialog10 != null ? (TextView) dialog10.findViewById(R.id.time_text) : null;
        Intrinsics.checkNotNull(textView3, "null cannot be cast to non-null type android.widget.TextView");
        Dialog dialog11 = this.d;
        TextView textView4 = dialog11 != null ? (TextView) dialog11.findViewById(R.id.txt_reset) : null;
        Intrinsics.checkNotNull(textView4, "null cannot be cast to non-null type android.widget.TextView");
        Dialog dialog12 = this.d;
        TextView textView5 = dialog12 != null ? (TextView) dialog12.findViewById(R.id.disPlay_mobile) : null;
        Intrinsics.checkNotNull(textView5, "null cannot be cast to non-null type android.widget.TextView");
        textView5.setText("OTP has been sent on your aadhar linked mobile number  \n+91 XXXXXX" + mobile_no);
        new g(textView3, textView).start();
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tg6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToAadharVerification.A2(editText, imageView, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ug6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToAadharVerification.B2(this.a, textView3, textView, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vg6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToAadharVerification.C2(editText, this, view);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wg6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToAadharVerification.D2(editText, view);
            }
        });
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xg6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToAadharVerification.E2(this.a, view);
            }
        });
        Dialog dialog13 = this.d;
        if (dialog13 != null) {
            dialog13.show();
        }
    }
}
