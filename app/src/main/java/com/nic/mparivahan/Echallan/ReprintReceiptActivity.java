package com.nic.mparivahan.Echallan;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.provider.Settings;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Echallan.Echallan.Model.ChallanListModal;
import com.nic.mparivahan.Echallan.Echallan.Model.ChallanListResultModal;
import com.nic.mparivahan.Echallan.Echallan.Model.ChallanPdfDataModal;
import com.nic.mparivahan.Echallan.Networking.SearchChallanService;
import com.nic.mparivahan.Echallan.ReprintReceiptActivity;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanModel.GenerateUserVerify;
import com.nic.mparivahan.VahanServices.VahanModel.Vahangenotp;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.zepto.az1;
import com.zepto.bz1;
import com.zepto.dz1;
import com.zepto.ez1;
import com.zepto.fz1;
import com.zepto.hc5;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.kt6;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.wa3;
import com.zepto.ws6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b¢\u0001\u0010£\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\tH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0015J\u000e\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u000fJ\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u001e\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000fJ \u0010!\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000fH\u0007J\b\u0010\"\u001a\u00020\u0002H\u0007J\u0018\u0010$\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u000fH\u0007R\"\u0010+\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010/\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R\"\u00103\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010&\u001a\u0004\b1\u0010(\"\u0004\b2\u0010*R\"\u00107\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010&\u001a\u0004\b5\u0010(\"\u0004\b6\u0010*R\"\u0010;\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010&\u001a\u0004\b9\u0010(\"\u0004\b:\u0010*R2\u0010D\u001a\u0012\u0012\u0004\u0012\u00020\u00060<j\b\u0012\u0004\u0012\u00020\u0006`=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\bM\u0010&R\u0016\u0010R\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0016\u0010^\u001a\u00020[8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010b\u001a\u00020_8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b`\u0010aR\"\u0010f\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010U\u001a\u0004\bd\u0010W\"\u0004\be\u0010YR\"\u0010n\u001a\u00020g8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010v\u001a\u00020o8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010~\u001a\u00020w8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R%\u0010\u0082\u0001\u001a\u00020g8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\u007f\u0010i\u001a\u0005\b\u0080\u0001\u0010k\"\u0005\b\u0081\u0001\u0010mR&\u0010\u0086\u0001\u001a\u00020o8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010q\u001a\u0005\b\u0084\u0001\u0010s\"\u0005\b\u0085\u0001\u0010uR&\u0010\u008a\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010&\u001a\u0005\b\u0088\u0001\u0010(\"\u0005\b\u0089\u0001\u0010*R&\u0010\u008e\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010&\u001a\u0005\b\u008c\u0001\u0010(\"\u0005\b\u008d\u0001\u0010*R\u0017\u0010\u001a\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010&R\u0018\u0010\u0091\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010&R&\u0010\u0095\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0092\u0001\u0010&\u001a\u0005\b\u0093\u0001\u0010(\"\u0005\b\u0094\u0001\u0010*R,\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u0096\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010¡\u0001\u001a\u00030\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001¨\u0006¤\u0001"}, d2 = {"Lcom/nic/mparivahan/Echallan/ReprintReceiptActivity;", "Lcom/zepto/pq;", "", "P1", "H1", "", "Lcom/nic/mparivahan/Echallan/Echallan/Model/ChallanListResultModal;", "searchList", "c2", "", "m2", "W1", "C1", "V1", "A1", "", "message", "a2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "string", "U1", "Landroid/content/Context;", "context", "k2", "challanNo", "otp", "otpId", "B1", "vehicleNo", "challanNoValue", "challanStateCd", "D1", "X1", "developermess", "n2", "C", "Ljava/lang/String;", "getInputValue", "()Ljava/lang/String;", "setInputValue", "(Ljava/lang/String;)V", "inputValue", "D", "getInputType", "setInputType", "inputType", "E", "getEngineNo", "setEngineNo", "engineNo", "F", "getChassisNo", "setChassisNo", "chassisNo", "G", "L1", "setSelectedChallanNo", "selectedChallanNo", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "H", "Ljava/util/ArrayList;", "G1", "()Ljava/util/ArrayList;", "setDisposeChallanList", "(Ljava/util/ArrayList;)V", "disposeChallanList", "Lcom/zepto/hc5;", "I", "Lcom/zepto/hc5;", "E1", "()Lcom/zepto/hc5;", "d2", "(Lcom/zepto/hc5;)V", "adapter", "J", "digit", "Lcom/zepto/bz1;", "K", "Lcom/zepto/bz1;", "binding", "Lcom/zepto/wa3;", "L", "Lcom/zepto/wa3;", "M1", "()Lcom/zepto/wa3;", "setSession", "(Lcom/zepto/wa3;)V", "session", "Lcom/nic/mparivahan/Echallan/Networking/SearchChallanService;", "M", "Lcom/nic/mparivahan/Echallan/Networking/SearchChallanService;", "retrofitService", "Lcom/zepto/fz1;", "N", "Lcom/zepto/fz1;", "viewModel", "O", "I1", "e2", "langSession", "Lcom/zepto/ld7;", "P", "Lcom/zepto/ld7;", "getViewModelAddMob", "()Lcom/zepto/ld7;", "i2", "(Lcom/zepto/ld7;)V", "viewModelAddMob", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "Q", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "K1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "g2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitServiceAddMob", "Lcom/zepto/ws6;", "R", "Lcom/zepto/ws6;", "N1", "()Lcom/zepto/ws6;", "h2", "(Lcom/zepto/ws6;)V", "sessionManager", "S", "O1", "j2", "viewModelv1", "T", "J1", "f2", "proservice", "U", "getRecordId", "setRecordId", "recordId", "V", "getMobileNo", "setMobileNo", "mobileNo", "W", "X", "challanStateCdValue", "Y", "getRcNo", "setRcNo", "rcNo", "Landroid/app/Dialog;", "Z", "Landroid/app/Dialog;", "F1", "()Landroid/app/Dialog;", "setD", "(Landroid/app/Dialog;)V", "d", "Landroid/text/TextWatcher;", "a0", "Landroid/text/TextWatcher;", "inputTextWatcher", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nReprintReceiptActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReprintReceiptActivity.kt\ncom/nic/mparivahan/Echallan/ReprintReceiptActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1080:1\n260#2:1081\n260#2:1082\n*S KotlinDebug\n*F\n+ 1 ReprintReceiptActivity.kt\ncom/nic/mparivahan/Echallan/ReprintReceiptActivity\n*L\n515#1:1081\n814#1:1082\n*E\n"})
public final class ReprintReceiptActivity extends pq {

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public hc5 adapter;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public bz1 binding;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public SearchChallanService retrofitService;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public fz1 viewModel;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public ld7 viewModelAddMob;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public VahanProService retrofitServiceAddMob;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public ld7 viewModelv1;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public VahanProService proservice;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public Dialog d;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public String inputValue = "";

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String inputType = "";

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String engineNo = "";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String chassisNo = "";

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String selectedChallanNo = "";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ArrayList disposeChallanList = new ArrayList();

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public final String digit = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String recordId = "";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String mobileNo = "";

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String challanNo = "";

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String challanStateCdValue = "";

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String rcNo = "";

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public final TextWatcher inputTextWatcher = new a();

    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            bz1 bz1Var = ReprintReceiptActivity.this.binding;
            if (bz1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bz1Var = null;
            }
            bz1Var.c.setError(null);
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
            bz1 bz1Var = ReprintReceiptActivity.this.binding;
            bz1 bz1Var2 = null;
            if (bz1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bz1Var = null;
            }
            ProgressBar progressBar = bz1Var.d;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                bz1 bz1Var3 = ReprintReceiptActivity.this.binding;
                if (bz1Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    bz1Var2 = bz1Var3;
                }
                bz1Var2.d.setVisibility(8);
            }
            if (!StringsKt__StringsJVMKt.equals(str, "ERROR", true)) {
                ReprintReceiptActivity.this.a2(str);
            } else {
                ReprintReceiptActivity reprintReceiptActivity = ReprintReceiptActivity.this;
                reprintReceiptActivity.a2(reprintReceiptActivity.M1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
            }
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
        public final void a(ChallanListModal challanListModal) {
            Intrinsics.checkNotNull(challanListModal);
            bz1 bz1Var = null;
            if (challanListModal.getStatus() != 200) {
                if (challanListModal.getStatus() != 404) {
                    bz1 bz1Var2 = ReprintReceiptActivity.this.binding;
                    if (bz1Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        bz1Var2 = null;
                    }
                    ProgressBar progressBar = bz1Var2.d;
                    Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                    if (progressBar.getVisibility() == 0) {
                        bz1 bz1Var3 = ReprintReceiptActivity.this.binding;
                        if (bz1Var3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            bz1Var = bz1Var3;
                        }
                        bz1Var.d.setVisibility(8);
                    }
                    ReprintReceiptActivity.this.C1();
                    return;
                }
                bz1 bz1Var4 = ReprintReceiptActivity.this.binding;
                if (bz1Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bz1Var4 = null;
                }
                ProgressBar progressBar2 = bz1Var4.d;
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                if (progressBar2.getVisibility() == 0) {
                    bz1 bz1Var5 = ReprintReceiptActivity.this.binding;
                    if (bz1Var5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        bz1Var = bz1Var5;
                    }
                    bz1Var.d.setVisibility(8);
                }
                ReprintReceiptActivity.this.C1();
                ReprintReceiptActivity reprintReceiptActivity = ReprintReceiptActivity.this;
                reprintReceiptActivity.k2(reprintReceiptActivity, challanListModal.getMessage());
                return;
            }
            ArrayList<ChallanListResultModal> result = challanListModal.getResult();
            int size = result.size();
            for (int i = 0; i < size; i++) {
                if (StringsKt__StringsJVMKt.equals(result.get(i).getStatus(), "Disposed", true)) {
                    ReprintReceiptActivity.this.getDisposeChallanList().add(result.get(i));
                }
            }
            ReprintReceiptActivity reprintReceiptActivity2 = ReprintReceiptActivity.this;
            reprintReceiptActivity2.c2(reprintReceiptActivity2.getDisposeChallanList());
            ReprintReceiptActivity.this.C1();
            if (ReprintReceiptActivity.this.getDisposeChallanList().size() > 1) {
                bz1 bz1Var6 = ReprintReceiptActivity.this.binding;
                if (bz1Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bz1Var6 = null;
                }
                bz1Var6.i.setText(ReprintReceiptActivity.this.I1().b("label_challan_totals", ReprintReceiptActivity.this.getString(R.string.total_challans)) + ' ' + ReprintReceiptActivity.this.getDisposeChallanList().size());
            } else if (ReprintReceiptActivity.this.getDisposeChallanList().size() == 0) {
                bz1 bz1Var7 = ReprintReceiptActivity.this.binding;
                if (bz1Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bz1Var7 = null;
                }
                bz1Var7.i.setText(ReprintReceiptActivity.this.I1().b("label_challan_total", ReprintReceiptActivity.this.getString(R.string.total_challan)) + " 0");
            } else {
                bz1 bz1Var8 = ReprintReceiptActivity.this.binding;
                if (bz1Var8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bz1Var8 = null;
                }
                bz1Var8.i.setText(ReprintReceiptActivity.this.I1().b("label_challan_total", ReprintReceiptActivity.this.getString(R.string.total_challan)) + ' ' + ReprintReceiptActivity.this.getDisposeChallanList().size());
            }
            bz1 bz1Var9 = ReprintReceiptActivity.this.binding;
            if (bz1Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bz1Var9 = null;
            }
            ProgressBar progressBar3 = bz1Var9.d;
            Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
            if (progressBar3.getVisibility() == 0) {
                bz1 bz1Var10 = ReprintReceiptActivity.this.binding;
                if (bz1Var10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    bz1Var = bz1Var10;
                }
                bz1Var.d.setVisibility(8);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ChallanListModal) obj);
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

        public final void invoke(String str) {
            bz1 bz1Var = ReprintReceiptActivity.this.binding;
            bz1 bz1Var2 = null;
            if (bz1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bz1Var = null;
            }
            ProgressBar progressBar = bz1Var.d;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                bz1 bz1Var3 = ReprintReceiptActivity.this.binding;
                if (bz1Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    bz1Var2 = bz1Var3;
                }
                bz1Var2.d.setVisibility(8);
            }
            ReprintReceiptActivity.this.C1();
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(ChallanPdfDataModal challanPdfDataModal) {
            bz1 bz1Var = ReprintReceiptActivity.this.binding;
            bz1 bz1Var2 = null;
            if (bz1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bz1Var = null;
            }
            ProgressBar progressBar = bz1Var.d;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                bz1 bz1Var3 = ReprintReceiptActivity.this.binding;
                if (bz1Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    bz1Var2 = bz1Var3;
                }
                bz1Var2.d.setVisibility(8);
            }
            if (challanPdfDataModal.getStatus() != 200) {
                if (kt6.d(challanPdfDataModal.getMessage())) {
                    ReprintReceiptActivity.this.a2(challanPdfDataModal.getMessage());
                    return;
                }
                ReprintReceiptActivity reprintReceiptActivity = ReprintReceiptActivity.this;
                String strB = reprintReceiptActivity.M1().b("label_went_wrong", ReprintReceiptActivity.this.getString(R.string.something_please_try_after_some_time));
                Intrinsics.checkNotNull(strB);
                reprintReceiptActivity.a2(strB);
                return;
            }
            String receipt_url = challanPdfDataModal.getResults().getReceipt_url();
            if (!kt6.d(receipt_url)) {
                Toast.makeText(ReprintReceiptActivity.this, "Payment is pending so can't view payment receipt", 0).show();
                return;
            }
            String strA = com.zepto.j.a.a(receipt_url, "E@CHALLAN*#2017$");
            Intent intent = new Intent(ReprintReceiptActivity.this, (Class<?>) PrintChallanWebView.class);
            intent.putExtra("challanPdfUrl", "");
            intent.putExtra("challan_receipt_url", strA);
            intent.putExtra("challanNo", ReprintReceiptActivity.this.getSelectedChallanNo());
            intent.putExtra("fromActivity", "reprintReceiptActivity");
            ReprintReceiptActivity.this.startActivity(intent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ChallanPdfDataModal) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            bz1 bz1Var = ReprintReceiptActivity.this.binding;
            bz1 bz1Var2 = null;
            if (bz1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bz1Var = null;
            }
            ProgressBar progressBar = bz1Var.d;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                bz1 bz1Var3 = ReprintReceiptActivity.this.binding;
                if (bz1Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    bz1Var2 = bz1Var3;
                }
                bz1Var2.d.setVisibility(8);
            }
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
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
        public final void a(Vahangenotp vahangenotp) {
            try {
                bz1 bz1Var = ReprintReceiptActivity.this.binding;
                bz1 bz1Var2 = null;
                if (bz1Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bz1Var = null;
                }
                ProgressBar progressBar = bz1Var.d;
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                if (progressBar.getVisibility() == 0) {
                    bz1 bz1Var3 = ReprintReceiptActivity.this.binding;
                    if (bz1Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        bz1Var2 = bz1Var3;
                    }
                    bz1Var2.d.setVisibility(8);
                }
                if (vahangenotp.getApiMessage().getStatusCode() != 200) {
                    Toast.makeText(ReprintReceiptActivity.this.getApplicationContext(), vahangenotp.getApiMessage().getDeveloperMessage(), 1).show();
                } else {
                    ReprintReceiptActivity reprintReceiptActivity = ReprintReceiptActivity.this;
                    reprintReceiptActivity.n2(reprintReceiptActivity, String.valueOf(vahangenotp.getApiMessage().getDeveloperMessage()));
                }
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(ReprintReceiptActivity.this.getApplicationContext(), "Unable to send the OTP, Please try after some times", 1).show();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Vahangenotp) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class h extends Lambda implements Function1 {
        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            try {
                bz1 bz1Var = ReprintReceiptActivity.this.binding;
                bz1 bz1Var2 = null;
                if (bz1Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bz1Var = null;
                }
                ProgressBar progressBar = bz1Var.d;
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                if (progressBar.getVisibility() == 0) {
                    bz1 bz1Var3 = ReprintReceiptActivity.this.binding;
                    if (bz1Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        bz1Var2 = bz1Var3;
                    }
                    bz1Var2.d.setVisibility(8);
                }
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(ReprintReceiptActivity.this.getApplicationContext(), "Unable to send the OTP, Please try after some times", 1).show();
            }
        }
    }

    public static final class i extends Lambda implements Function1 {
        public i() {
            super(1);
        }

        public final void a(Vahangenotp vahangenotp) {
            try {
                bz1 bz1Var = ReprintReceiptActivity.this.binding;
                bz1 bz1Var2 = null;
                if (bz1Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bz1Var = null;
                }
                ProgressBar progressBar = bz1Var.d;
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                if (progressBar.getVisibility() == 0) {
                    bz1 bz1Var3 = ReprintReceiptActivity.this.binding;
                    if (bz1Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        bz1Var2 = bz1Var3;
                    }
                    bz1Var2.d.setVisibility(8);
                }
                if (vahangenotp.getApiMessage().getStatusCode() != 200) {
                    ReprintReceiptActivity.this.a2("Unable to send the OTP, Please try after some time");
                } else {
                    ReprintReceiptActivity reprintReceiptActivity = ReprintReceiptActivity.this;
                    reprintReceiptActivity.a2(reprintReceiptActivity.M1().b("label_log_resend_otp", "We have resent the OTP Verification to your mobile number"));
                }
            } catch (Exception e) {
                e.printStackTrace();
                ReprintReceiptActivity.this.a2("Unable to send the OTP, Please try after some time");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Vahangenotp) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class j extends Lambda implements Function1 {
        public j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            try {
                bz1 bz1Var = ReprintReceiptActivity.this.binding;
                bz1 bz1Var2 = null;
                if (bz1Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bz1Var = null;
                }
                ProgressBar progressBar = bz1Var.d;
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                if (progressBar.getVisibility() == 0) {
                    bz1 bz1Var3 = ReprintReceiptActivity.this.binding;
                    if (bz1Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        bz1Var2 = bz1Var3;
                    }
                    bz1Var2.d.setVisibility(8);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static final class k extends Lambda implements Function1 {
        public k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            bz1 bz1Var = null;
            try {
                bz1 bz1Var2 = ReprintReceiptActivity.this.binding;
                if (bz1Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bz1Var2 = null;
                }
                ProgressBar progressBar = bz1Var2.d;
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                if (progressBar.getVisibility() == 0) {
                    bz1 bz1Var3 = ReprintReceiptActivity.this.binding;
                    if (bz1Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        bz1Var3 = null;
                    }
                    bz1Var3.d.setVisibility(8);
                }
                if (ReprintReceiptActivity.this.getD() != null) {
                    Dialog d = ReprintReceiptActivity.this.getD();
                    Intrinsics.checkNotNull(d);
                    d.dismiss();
                }
                Toast.makeText(ReprintReceiptActivity.this, str, 0).show();
                ReprintReceiptActivity reprintReceiptActivity = ReprintReceiptActivity.this;
                reprintReceiptActivity.B1(reprintReceiptActivity.challanNo, "", "");
            } catch (Exception e) {
                bz1 bz1Var4 = ReprintReceiptActivity.this.binding;
                if (bz1Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bz1Var4 = null;
                }
                ProgressBar progressBar2 = bz1Var4.d;
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                if (progressBar2.getVisibility() == 0) {
                    bz1 bz1Var5 = ReprintReceiptActivity.this.binding;
                    if (bz1Var5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        bz1Var = bz1Var5;
                    }
                    bz1Var.d.setVisibility(8);
                }
                e.printStackTrace();
                ReprintReceiptActivity reprintReceiptActivity2 = ReprintReceiptActivity.this;
                reprintReceiptActivity2.a2(reprintReceiptActivity2.M1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
            }
        }
    }

    public static final class l implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public l(Function1 function) {
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

    public static final class m extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ wa3 b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ TextView d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(TextView textView, wa3 wa3Var, Context context, TextView textView2) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = wa3Var;
            this.c = context;
            this.d = textView2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.d.setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.a.setText(this.b.b("time_remaining", this.c.getString(R.string.time_remaining)) + " : " + (j / ((long) 1000)));
            this.d.setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    public static final class n extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ wa3 b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ TextView d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(TextView textView, wa3 wa3Var, Context context, TextView textView2) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = wa3Var;
            this.c = context;
            this.d = textView2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.d.setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.a.setText(this.b.b("time_remaining", this.c.getString(R.string.time_remaining)) + " : " + (j / ((long) 1000)));
            this.d.setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    private final void A1() {
        if (V1()) {
            H1();
        } else {
            k2(this, I1().b("error_msg_record_not_found", getString(R.string.service_unavable_please_try)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C1() {
        bz1 bz1Var = null;
        if (this.disposeChallanList.size() == 0) {
            bz1 bz1Var2 = this.binding;
            if (bz1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bz1Var2 = null;
            }
            bz1Var2.b.setVisibility(0);
            bz1 bz1Var3 = this.binding;
            if (bz1Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bz1Var3 = null;
            }
            bz1Var3.e.setVisibility(8);
            bz1 bz1Var4 = this.binding;
            if (bz1Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                bz1Var = bz1Var4;
            }
            bz1Var.i.setVisibility(8);
            return;
        }
        bz1 bz1Var5 = this.binding;
        if (bz1Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bz1Var5 = null;
        }
        bz1Var5.b.setVisibility(8);
        bz1 bz1Var6 = this.binding;
        if (bz1Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bz1Var6 = null;
        }
        bz1Var6.e.setVisibility(0);
        bz1 bz1Var7 = this.binding;
        if (bz1Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            bz1Var = bz1Var7;
        }
        bz1Var.i.setVisibility(0);
    }

    private final void P1() {
        SearchChallanService searchChallanService = this.retrofitService;
        bz1 bz1Var = null;
        if (searchChallanService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            searchChallanService = null;
        }
        this.viewModel = (fz1) new z(this, new ez1(new dz1(searchChallanService))).a(fz1.class);
        i2((ld7) new z(this, new kd7(new jd7(K1()))).a(ld7.class));
        j2((ld7) new z(this, new kd7(new jd7(J1()))).a(ld7.class));
        bz1 bz1Var2 = this.binding;
        if (bz1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bz1Var2 = null;
        }
        bz1Var2.h.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tb5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReprintReceiptActivity.Q1(this.a, view);
            }
        });
        bz1 bz1Var3 = this.binding;
        if (bz1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bz1Var3 = null;
        }
        bz1Var3.c.setKeyListener(DigitsKeyListener.getInstance(this.digit));
        bz1 bz1Var4 = this.binding;
        if (bz1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bz1Var4 = null;
        }
        bz1Var4.c.setRawInputType(ConstantsKt.DEFAULT_BLOCK_SIZE);
        bz1 bz1Var5 = this.binding;
        if (bz1Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bz1Var5 = null;
        }
        bz1Var5.h.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xb5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReprintReceiptActivity.R1(this.a, view);
            }
        });
        if (this.inputType.length() > 0) {
            String str = this.inputType;
            if (Intrinsics.areEqual(str, "Challan")) {
                bz1 bz1Var6 = this.binding;
                if (bz1Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bz1Var6 = null;
                }
                bz1Var6.c.setHint(I1().b("label_challan_enter_challan_no", getString(R.string.enter_challan_no)));
                bz1 bz1Var7 = this.binding;
                if (bz1Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bz1Var7 = null;
                }
                bz1Var7.c.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(30)});
                bz1 bz1Var8 = this.binding;
                if (bz1Var8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bz1Var8 = null;
                }
                bz1Var8.i.setVisibility(8);
            } else if (Intrinsics.areEqual(str, "RC")) {
                bz1 bz1Var9 = this.binding;
                if (bz1Var9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bz1Var9 = null;
                }
                bz1Var9.c.setHint(I1().b("label_challan_enter_vehicle_no", getString(R.string.enter_vehicle_number)));
                bz1 bz1Var10 = this.binding;
                if (bz1Var10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bz1Var10 = null;
                }
                bz1Var10.c.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(10)});
                bz1 bz1Var11 = this.binding;
                if (bz1Var11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bz1Var11 = null;
                }
                bz1Var11.i.setVisibility(0);
            } else {
                bz1 bz1Var12 = this.binding;
                if (bz1Var12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bz1Var12 = null;
                }
                bz1Var12.c.setHint(I1().b("label_challan_enter_dl_no", getString(R.string.enter_dl_number)));
                bz1 bz1Var13 = this.binding;
                if (bz1Var13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bz1Var13 = null;
                }
                bz1Var13.c.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(16)});
                bz1 bz1Var14 = this.binding;
                if (bz1Var14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bz1Var14 = null;
                }
                bz1Var14.i.setVisibility(0);
            }
        }
        if (this.inputValue.length() > 0) {
            bz1 bz1Var15 = this.binding;
            if (bz1Var15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bz1Var15 = null;
            }
            bz1Var15.c.setText(this.inputValue);
        }
        bz1 bz1Var16 = this.binding;
        if (bz1Var16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bz1Var16 = null;
        }
        bz1Var16.e.setLayoutManager(new LinearLayoutManager(this));
        d2(new hc5(this, new ArrayList(), I1(), this));
        bz1 bz1Var17 = this.binding;
        if (bz1Var17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bz1Var17 = null;
        }
        bz1Var17.e.setNestedScrollingEnabled(false);
        bz1 bz1Var18 = this.binding;
        if (bz1Var18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bz1Var18 = null;
        }
        bz1Var18.e.setAdapter(E1());
        bz1 bz1Var19 = this.binding;
        if (bz1Var19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bz1Var19 = null;
        }
        bz1Var19.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yb5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReprintReceiptActivity.S1(this.a, view);
            }
        });
        bz1 bz1Var20 = this.binding;
        if (bz1Var20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bz1Var20 = null;
        }
        bz1Var20.c.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zepto.zb5
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return ReprintReceiptActivity.T1(this.a, textView, i2, keyEvent);
            }
        });
        bz1 bz1Var21 = this.binding;
        if (bz1Var21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            bz1Var = bz1Var21;
        }
        bz1Var.c.addTextChangedListener(this.inputTextWatcher);
    }

    public static final void Q1(ReprintReceiptActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void R1(ReprintReceiptActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.W1();
    }

    public static final void S1(ReprintReceiptActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        bz1 bz1Var = this$0.binding;
        bz1 bz1Var2 = null;
        if (bz1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bz1Var = null;
        }
        String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(bz1Var.c.getText())).toString();
        if (!this$0.m2()) {
            this$0.inputValue = string;
            this$0.disposeChallanList.clear();
            this$0.A1();
            return;
        }
        String str = this$0.inputType;
        if (Intrinsics.areEqual(str, "Challan")) {
            bz1 bz1Var3 = this$0.binding;
            if (bz1Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bz1Var3 = null;
            }
            bz1Var3.c.setError(this$0.I1().b("label_challan_please_enter_challan_no", this$0.getString(R.string.please_enter_challan_no)));
            bz1 bz1Var4 = this$0.binding;
            if (bz1Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                bz1Var2 = bz1Var4;
            }
            bz1Var2.c.requestFocus();
            return;
        }
        if (Intrinsics.areEqual(str, "RC")) {
            bz1 bz1Var5 = this$0.binding;
            if (bz1Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bz1Var5 = null;
            }
            bz1Var5.c.setError(this$0.I1().b("label_challan_please_enter_vehicle_no", this$0.getString(R.string.please_enter_vehicle_no)));
            bz1 bz1Var6 = this$0.binding;
            if (bz1Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                bz1Var2 = bz1Var6;
            }
            bz1Var2.c.requestFocus();
            return;
        }
        bz1 bz1Var7 = this$0.binding;
        if (bz1Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bz1Var7 = null;
        }
        bz1Var7.c.setError(this$0.I1().b("label_challan_valid_dl_no", this$0.getString(R.string.please_enter_valid_dl_number)));
        bz1 bz1Var8 = this$0.binding;
        if (bz1Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            bz1Var2 = bz1Var8;
        }
        bz1Var2.c.requestFocus();
    }

    public static final boolean T1(ReprintReceiptActivity this$0, TextView textView, int i2, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i2 != 6) {
            return false;
        }
        bz1 bz1Var = this$0.binding;
        bz1 bz1Var2 = null;
        if (bz1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bz1Var = null;
        }
        String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(bz1Var.c.getText())).toString();
        if (!this$0.m2()) {
            this$0.inputValue = string;
            this$0.disposeChallanList.clear();
            this$0.A1();
            return true;
        }
        String str = this$0.inputType;
        if (Intrinsics.areEqual(str, "Challan")) {
            bz1 bz1Var3 = this$0.binding;
            if (bz1Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bz1Var3 = null;
            }
            bz1Var3.c.setError(this$0.I1().b("label_challan_please_enter_challan_no", this$0.getString(R.string.please_enter_challan_no)));
            bz1 bz1Var4 = this$0.binding;
            if (bz1Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                bz1Var2 = bz1Var4;
            }
            bz1Var2.c.requestFocus();
        } else if (Intrinsics.areEqual(str, "RC")) {
            bz1 bz1Var5 = this$0.binding;
            if (bz1Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bz1Var5 = null;
            }
            bz1Var5.c.setError(this$0.I1().b("label_challan_please_enter_vehicle_no", this$0.getString(R.string.please_enter_vehicle_no)));
            bz1 bz1Var6 = this$0.binding;
            if (bz1Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                bz1Var2 = bz1Var6;
            }
            bz1Var2.c.requestFocus();
        } else {
            bz1 bz1Var7 = this$0.binding;
            if (bz1Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bz1Var7 = null;
            }
            bz1Var7.c.setError(this$0.I1().b("label_challan_valid_dl_no", this$0.getString(R.string.please_enter_valid_dl_number)));
            bz1 bz1Var8 = this$0.binding;
            if (bz1Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                bz1Var2 = bz1Var8;
            }
            bz1Var2.c.requestFocus();
        }
        return true;
    }

    private final boolean V1() {
        Object systemService = getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    private final void W1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public static final void Y1(EditText enteredChassisNo, ReprintReceiptActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(enteredChassisNo, "$enteredChassisNo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (enteredChassisNo.getText().toString().length() < 5) {
            Toast.makeText(this$0.getApplicationContext(), this$0.M1().b("label_challan_valid_chassis_no", "Please enter the valid last 5 digit of chassis no."), 1).show();
            return;
        }
        this$0.chassisNo = enteredChassisNo.getText().toString();
        ArrayList arrayList = new ArrayList();
        arrayList.add("62");
        GenerateUserVerify generateUserVerify = new GenerateUserVerify(" ", "", enteredChassisNo.getText().toString(), Settings.Secure.getString(this$0.getContentResolver(), "android_id"), "No", " ", "", "", " ", true, arrayList, this$0.rcNo, this$0.challanStateCdValue, this$0.N1().e(), "", this$0.N1().k());
        bz1 bz1Var = this$0.binding;
        if (bz1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bz1Var = null;
        }
        bz1Var.d.setVisibility(0);
        this$0.O1().B1(this$0, generateUserVerify);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a2(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        dialog.setCanceledOnTouchOutside(false);
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById2;
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        ((TextView) viewFindViewById3).setText(I1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(I1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bc5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReprintReceiptActivity.b2(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c2(List searchList) {
        hc5 hc5VarE1 = E1();
        hc5VarE1.B(searchList);
        hc5VarE1.j();
    }

    public static final void l2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final boolean m2() {
        String strSubstring;
        bz1 bz1Var = this.binding;
        bz1 bz1Var2 = null;
        if (bz1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bz1Var = null;
        }
        String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(bz1Var.c.getText())).toString();
        char[] charArray = string.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        if (string.length() > 0) {
            bz1 bz1Var3 = this.binding;
            if (bz1Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bz1Var3 = null;
            }
            strSubstring = StringsKt__StringsKt.trim((CharSequence) String.valueOf(bz1Var3.c.getText())).toString().substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            strSubstring = "";
        }
        if (Intrinsics.areEqual(this.inputType, "Challan")) {
            if (string.length() == 0) {
                bz1 bz1Var4 = this.binding;
                if (bz1Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bz1Var4 = null;
                }
                bz1Var4.c.setError(getString(R.string.please_enter_challan_notice_no));
                bz1 bz1Var5 = this.binding;
                if (bz1Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    bz1Var2 = bz1Var5;
                }
                bz1Var2.c.requestFocus();
                return true;
            }
            Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(string);
            if (intOrNull != null) {
                if (intOrNull.intValue() < 5) {
                    bz1 bz1Var6 = this.binding;
                    if (bz1Var6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        bz1Var6 = null;
                    }
                    bz1Var6.c.setError(getString(R.string.enter_min_notice_no));
                    bz1 bz1Var7 = this.binding;
                    if (bz1Var7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        bz1Var2 = bz1Var7;
                    }
                    bz1Var2.c.requestFocus();
                    return true;
                }
            } else {
                if (!U1(strSubstring)) {
                    bz1 bz1Var8 = this.binding;
                    if (bz1Var8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        bz1Var8 = null;
                    }
                    bz1Var8.c.setError(I1().b("label_challan_enter_first_two_char_as_state", getString(R.string.please_enter_correct_challan_no)));
                    bz1 bz1Var9 = this.binding;
                    if (bz1Var9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        bz1Var2 = bz1Var9;
                    }
                    bz1Var2.c.requestFocus();
                    return true;
                }
                if (string.length() < 12) {
                    bz1 bz1Var10 = this.binding;
                    if (bz1Var10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        bz1Var10 = null;
                    }
                    bz1Var10.c.setError(I1().b("label_challan_min_length_validation", getString(R.string.min_length_challan_no)));
                    bz1 bz1Var11 = this.binding;
                    if (bz1Var11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        bz1Var2 = bz1Var11;
                    }
                    bz1Var2.c.requestFocus();
                    return true;
                }
                if (string.length() > 30) {
                    bz1 bz1Var12 = this.binding;
                    if (bz1Var12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        bz1Var12 = null;
                    }
                    bz1Var12.c.setError(I1().b("label_challan_max_length_validation", getString(R.string.max_length_challan_no)));
                    bz1 bz1Var13 = this.binding;
                    if (bz1Var13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        bz1Var2 = bz1Var13;
                    }
                    bz1Var2.c.requestFocus();
                    return true;
                }
            }
        } else if (Intrinsics.areEqual(this.inputType, "RC")) {
            if (string.length() == 0) {
                bz1 bz1Var14 = this.binding;
                if (bz1Var14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bz1Var14 = null;
                }
                bz1Var14.c.setError(I1().b("label_challan_please_enter_vehicle_no", getString(R.string.please_enter_vehicle_no)));
                bz1 bz1Var15 = this.binding;
                if (bz1Var15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    bz1Var2 = bz1Var15;
                }
                bz1Var2.c.requestFocus();
                return true;
            }
            int length = charArray.length;
            if (length >= 0 && length < 7) {
                bz1 bz1Var16 = this.binding;
                if (bz1Var16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bz1Var16 = null;
                }
                bz1Var16.c.setError(I1().b("label_challan_min_char_vehicle_no", getString(R.string.rc_min_valid)));
                bz1 bz1Var17 = this.binding;
                if (bz1Var17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    bz1Var2 = bz1Var17;
                }
                bz1Var2.c.requestFocus();
                return true;
            }
            if (string.length() > 10) {
                bz1 bz1Var18 = this.binding;
                if (bz1Var18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bz1Var18 = null;
                }
                bz1Var18.c.setError(I1().b("label_challan_rc_validation", getString(R.string.rc_text)));
                bz1 bz1Var19 = this.binding;
                if (bz1Var19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    bz1Var2 = bz1Var19;
                }
                bz1Var2.c.requestFocus();
                return true;
            }
            if (!new Regex("[a-zA-Z0-9]*").matches(string)) {
                bz1 bz1Var20 = this.binding;
                if (bz1Var20 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bz1Var20 = null;
                }
                bz1Var20.c.setError(I1().b("label_challan_invalid_vehicle_no", getString(R.string.invalid_rc_no)));
                bz1 bz1Var21 = this.binding;
                if (bz1Var21 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    bz1Var2 = bz1Var21;
                }
                bz1Var2.c.requestFocus();
                return true;
            }
        } else if (Intrinsics.areEqual(this.inputType, "DL")) {
            if (string.length() == 0) {
                bz1 bz1Var22 = this.binding;
                if (bz1Var22 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bz1Var22 = null;
                }
                bz1Var22.c.setError(I1().b("label_challan_valid_dl_no", getString(R.string.please_enter_valid_dl_number)));
                bz1 bz1Var23 = this.binding;
                if (bz1Var23 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    bz1Var2 = bz1Var23;
                }
                bz1Var2.c.requestFocus();
                return true;
            }
            if (string.length() < 10) {
                bz1 bz1Var24 = this.binding;
                if (bz1Var24 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bz1Var24 = null;
                }
                bz1Var24.c.setError(I1().b("label_challan_min_char_dl_validation", "Please enter minimum 10 characters of DL number"));
                bz1 bz1Var25 = this.binding;
                if (bz1Var25 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    bz1Var2 = bz1Var25;
                }
                bz1Var2.c.requestFocus();
                return true;
            }
        }
        return false;
    }

    public static final void o2(ReprintReceiptActivity this$0, TextView time_text, wa3 langSession, Context context, TextView resendOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(time_text, "$time_text");
        Intrinsics.checkNotNullParameter(langSession, "$langSession");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(resendOtp, "$resendOtp");
        new n(time_text, langSession, context, resendOtp).start();
        bz1 bz1Var = this$0.binding;
        if (bz1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bz1Var = null;
        }
        bz1Var.d.setVisibility(0);
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        arrayList.add("62");
        this$0.O1().A1(this$0, new GenerateUserVerify(" ", "", this$0.chassisNo, Settings.Secure.getString(this$0.getContentResolver(), "android_id"), "No", " ", "", "", " ", true, arrayList, this$0.rcNo, this$0.challanStateCdValue, this$0.N1().e(), "", this$0.N1().k()));
    }

    public static final void p2(EditText enterOtp, Context context, wa3 langSession, ReprintReceiptActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(langSession, "$langSession");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = enterOtp.getText().toString();
        if (string.length() == 0) {
            Toast.makeText(context, langSession.b("label_log_entr_otp", context.getString(R.string.pls_enter_otp)), 0).show();
            return;
        }
        if (string.length() < 4) {
            Toast.makeText(context, langSession.b("label_log_entr_val_otp", "Please enter the valid OTP"), 0).show();
            return;
        }
        bz1 bz1Var = this$0.binding;
        if (bz1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bz1Var = null;
        }
        bz1Var.d.setVisibility(0);
        this$0.O1().C1(this$0, "", this$0.rcNo, this$0.challanStateCdValue, "M", "62", string, "", new ws6(this$0).k(), this$0.chassisNo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q2(EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        enterOtp.setText("");
    }

    public static final void r2(ReprintReceiptActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.d;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s2(EditText enterOtp, ImageView shownPin, View view) {
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

    public final void B1(String challanNo, String otp, String otpId) {
        Intrinsics.checkNotNullParameter(challanNo, "challanNo");
        Intrinsics.checkNotNullParameter(otp, "otp");
        Intrinsics.checkNotNullParameter(otpId, "otpId");
        bz1 bz1Var = null;
        try {
            this.selectedChallanNo = challanNo;
            bz1 bz1Var2 = this.binding;
            if (bz1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bz1Var2 = null;
            }
            bz1Var2.d.setVisibility(0);
            fz1 fz1Var = this.viewModel;
            if (fz1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                fz1Var = null;
            }
            fz1Var.n(this, challanNo, otp, otpId, this.challanStateCdValue, this.rcNo, "62", this.chassisNo);
        } catch (Exception e2) {
            e2.printStackTrace();
            bz1 bz1Var3 = this.binding;
            if (bz1Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                bz1Var = bz1Var3;
            }
            bz1Var.d.setVisibility(8);
        }
    }

    public final void D1(String vehicleNo, String challanNoValue, String challanStateCd) {
        Intrinsics.checkNotNullParameter(vehicleNo, "vehicleNo");
        Intrinsics.checkNotNullParameter(challanNoValue, "challanNoValue");
        Intrinsics.checkNotNullParameter(challanStateCd, "challanStateCd");
        try {
            this.challanNo = challanNoValue;
            String strSubstring = StringsKt__StringsKt.trim((CharSequence) vehicleNo).toString().substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            this.challanStateCdValue = challanStateCd;
            this.rcNo = vehicleNo;
            bz1 bz1Var = this.binding;
            if (bz1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bz1Var = null;
            }
            bz1Var.d.setVisibility(0);
            if (StringsKt__StringsJVMKt.equals(strSubstring, "AP", true)) {
                B1(challanNoValue, "", "");
                return;
            }
            if (kt6.d(this.inputType) && !Intrinsics.areEqual(this.inputType, "RC")) {
                X1();
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add("62");
            GenerateUserVerify generateUserVerify = new GenerateUserVerify(" ", "", this.chassisNo, Settings.Secure.getString(getContentResolver(), "android_id"), "No", " ", "", "", " ", true, arrayList, vehicleNo, this.challanStateCdValue, N1().e(), "", N1().k());
            bz1 bz1Var2 = this.binding;
            if (bz1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bz1Var2 = null;
            }
            bz1Var2.d.setVisibility(0);
            O1().B1(this, generateUserVerify);
        } catch (Exception e2) {
            e2.printStackTrace();
            bz1 bz1Var3 = this.binding;
            if (bz1Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bz1Var3 = null;
            }
            ProgressBar progressBar = bz1Var3.d;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                bz1 bz1Var4 = this.binding;
                if (bz1Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bz1Var4 = null;
                }
                bz1Var4.d.setVisibility(8);
            }
        }
    }

    public final hc5 E1() {
        hc5 hc5Var = this.adapter;
        if (hc5Var != null) {
            return hc5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    /* JADX INFO: renamed from: F1, reason: from getter */
    public final Dialog getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: G1, reason: from getter */
    public final ArrayList getDisposeChallanList() {
        return this.disposeChallanList;
    }

    public final void H1() {
        fz1 fz1Var;
        bz1 bz1Var = null;
        try {
            bz1 bz1Var2 = this.binding;
            if (bz1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bz1Var2 = null;
            }
            bz1Var2.d.setVisibility(0);
            fz1 fz1Var2 = this.viewModel;
            if (fz1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                fz1Var = null;
            } else {
                fz1Var = fz1Var2;
            }
            fz1Var.l(this, this.inputType, this.inputValue, 1, this.engineNo, this.chassisNo);
        } catch (Exception e2) {
            e2.printStackTrace();
            bz1 bz1Var3 = this.binding;
            if (bz1Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bz1Var3 = null;
            }
            ProgressBar progressBar = bz1Var3.d;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                bz1 bz1Var4 = this.binding;
                if (bz1Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    bz1Var = bz1Var4;
                }
                bz1Var.d.setVisibility(8);
            }
        }
    }

    public final wa3 I1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final VahanProService J1() {
        VahanProService vahanProService = this.proservice;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("proservice");
        return null;
    }

    public final VahanProService K1() {
        VahanProService vahanProService = this.retrofitServiceAddMob;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitServiceAddMob");
        return null;
    }

    /* JADX INFO: renamed from: L1, reason: from getter */
    public final String getSelectedChallanNo() {
        return this.selectedChallanNo;
    }

    public final wa3 M1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final ws6 N1() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final ld7 O1() {
        ld7 ld7Var = this.viewModelv1;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelv1");
        return null;
    }

    public final boolean U1(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        int length = string.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = string.charAt(i2);
            if (('A' > cCharAt || cCharAt >= '[') && ('a' > cCharAt || cCharAt >= '{')) {
                return false;
            }
        }
        return true;
    }

    public final void X1() {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_enter_chassis_no);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.tv_chassi_no);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = dialog.findViewById(R.id.chassis_no_et);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        final EditText editText = (EditText) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.proceedBtn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        View viewFindViewById4 = dialog.findViewById(R.id.closeBtn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vb5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReprintReceiptActivity.Y1(editText, this, view);
            }
        });
        ((TextView) viewFindViewById4).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wb5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReprintReceiptActivity.Z1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void d2(hc5 hc5Var) {
        Intrinsics.checkNotNullParameter(hc5Var, "<set-?>");
        this.adapter = hc5Var;
    }

    public final void e2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void f2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.proservice = vahanProService;
    }

    public final void g2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitServiceAddMob = vahanProService;
    }

    public final void h2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final void i2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModelAddMob = ld7Var;
    }

    public final void j2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModelv1 = ld7Var;
    }

    public final void k2(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById2;
        textView.setText(I1().b("label_challan_ok_dialog_text", getString(R.string.ok_txt)));
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        ((TextView) viewFindViewById3).setText(I1().b("nex_parivahan", getString(R.string.app_name)));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ac5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReprintReceiptActivity.l2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void n2(final Context context, String developermess) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(developermess, "developermess");
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.setContentView(R.layout.validateotp);
        }
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
        ImageView imageView = dialog5 != null ? (ImageView) dialog5.findViewById(R.id.pop_up_close) : null;
        Intrinsics.checkNotNull(imageView);
        Dialog dialog6 = this.d;
        TextView textView = dialog6 != null ? (TextView) dialog6.findViewById(R.id.resendOtp) : null;
        Intrinsics.checkNotNull(textView);
        Dialog dialog7 = this.d;
        final ImageView imageView2 = dialog7 != null ? (ImageView) dialog7.findViewById(R.id.showmpin) : null;
        Intrinsics.checkNotNull(imageView2);
        Dialog dialog8 = this.d;
        TextView textView2 = dialog8 != null ? (TextView) dialog8.findViewById(R.id.submitOtp) : null;
        Intrinsics.checkNotNull(textView2);
        Dialog dialog9 = this.d;
        final EditText editText = dialog9 != null ? (EditText) dialog9.findViewById(R.id.enterOtp) : null;
        Intrinsics.checkNotNull(editText);
        Dialog dialog10 = this.d;
        final TextView textView3 = dialog10 != null ? (TextView) dialog10.findViewById(R.id.time_text) : null;
        Intrinsics.checkNotNull(textView3);
        Dialog dialog11 = this.d;
        TextView textView4 = dialog11 != null ? (TextView) dialog11.findViewById(R.id.txt_reset) : null;
        Intrinsics.checkNotNull(textView4);
        Dialog dialog12 = this.d;
        TextView textView5 = dialog12 != null ? (TextView) dialog12.findViewById(R.id.disPlay_mobile) : null;
        Intrinsics.checkNotNull(textView5);
        Dialog dialog13 = this.d;
        TextView textView6 = dialog13 != null ? (TextView) dialog13.findViewById(R.id.enter_otp_txt) : null;
        Intrinsics.checkNotNull(textView6);
        Dialog dialog14 = this.d;
        TextView textView7 = dialog14 != null ? (TextView) dialog14.findViewById(R.id.disPlay) : null;
        Intrinsics.checkNotNull(textView7);
        Dialog dialog15 = this.d;
        Intrinsics.checkNotNull(dialog15 != null ? (TextView) dialog15.findViewById(R.id.otpdisplay) : null);
        final wa3 wa3Var = new wa3(context);
        textView6.setText(wa3Var.b("edit_enter_otp", context.getString(R.string.enter_otp)));
        textView7.setText(wa3Var.b("otp_verification", context.getString(R.string.otp_verification)));
        textView2.setText(wa3Var.b("vahan_btn_submit", context.getString(R.string.submit)));
        textView4.setText(wa3Var.b("btn_reset", context.getString(R.string.reset)));
        textView.setText(wa3Var.b("label_resend_otp", context.getString(R.string.resend_otp)));
        editText.setHint(wa3Var.b("edit_enter_otp", context.getString(R.string.enter_otp)));
        textView5.setText(wa3Var.b("label_otp_sent_to_mobile", context.getString(R.string.otp_sent)));
        new m(textView3, wa3Var, context, textView).start();
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cc5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReprintReceiptActivity.s2(editText, imageView2, view);
            }
        });
        final TextView textView8 = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dc5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReprintReceiptActivity.o2(this.a, textView3, wa3Var, context, textView8, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ec5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReprintReceiptActivity.p2(editText, context, wa3Var, this, view);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fc5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReprintReceiptActivity.q2(editText, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ub5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReprintReceiptActivity.r2(this.a, view);
            }
        });
        Dialog dialog16 = this.d;
        if (dialog16 != null) {
            dialog16.show();
        }
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bz1 bz1VarC = bz1.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(bz1VarC, "inflate(...)");
        this.binding = bz1VarC;
        fz1 fz1Var = null;
        if (bz1VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bz1VarC = null;
        }
        setContentView(bz1VarC.b());
        e2(new wa3(this));
        h2(new ws6(this));
        az1.a aVar = az1.a;
        bz1 bz1Var = this.binding;
        if (bz1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bz1Var = null;
        }
        aVar.d(this, bz1Var);
        this.d = new Dialog(this);
        String stringExtra = getIntent().getStringExtra("inputValue");
        Intrinsics.checkNotNull(stringExtra);
        this.inputValue = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("inputType");
        Intrinsics.checkNotNull(stringExtra2);
        this.inputType = stringExtra2;
        if (getIntent().hasExtra("inputengineno")) {
            String stringExtra3 = getIntent().getStringExtra("inputengineno");
            Intrinsics.checkNotNull(stringExtra3);
            this.engineNo = stringExtra3;
        }
        if (getIntent().hasExtra("inputchassisno")) {
            String stringExtra4 = getIntent().getStringExtra("inputchassisno");
            Intrinsics.checkNotNull(stringExtra4);
            this.chassisNo = stringExtra4;
        }
        this.retrofitService = SearchChallanService.INSTANCE.a(this);
        VahanProService.Companion companion = VahanProService.INSTANCE;
        g2(companion.a(this));
        f2(companion.a(this));
        P1();
        A1();
        fz1 fz1Var2 = this.viewModel;
        if (fz1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fz1Var2 = null;
        }
        fz1Var2.i().g(this, new l(new c()));
        fz1 fz1Var3 = this.viewModel;
        if (fz1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fz1Var3 = null;
        }
        fz1Var3.h().g(this, new l(new d()));
        fz1 fz1Var4 = this.viewModel;
        if (fz1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fz1Var4 = null;
        }
        fz1Var4.m().g(this, new l(new e()));
        fz1 fz1Var5 = this.viewModel;
        if (fz1Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            fz1Var = fz1Var5;
        }
        fz1Var.r().g(this, new l(new f()));
        O1().i1().g(this, new l(new g()));
        O1().j1().g(this, new l(new h()));
        O1().g1().g(this, new l(new i()));
        O1().h1().g(this, new l(new j()));
        O1().e1().g(this, new l(new k()));
        O1().f1().g(this, new l(new b()));
    }
}
