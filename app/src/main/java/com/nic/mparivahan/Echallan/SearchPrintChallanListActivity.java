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
import android.util.Log;
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
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Echallan.Echallan.Model.ChallanListModal;
import com.nic.mparivahan.Echallan.Echallan.Model.ChallanPdfDataModal;
import com.nic.mparivahan.Echallan.Networking.SearchChallanService;
import com.nic.mparivahan.Echallan.SearchPrintChallanListActivity;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanModel.GenerateUserVerify;
import com.nic.mparivahan.VahanServices.VahanModel.Vahangenotp;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.zepto.az1;
import com.zepto.cg;
import com.zepto.dz1;
import com.zepto.ez1;
import com.zepto.fz1;
import com.zepto.gd1;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.kt6;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.rq5;
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
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0016\u0010\f\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0003J\b\u0010\r\u001a\u00020\u0007H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0015J\u000e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u000fJ\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u001e\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000fJ \u0010!\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000fH\u0007J\b\u0010\"\u001a\u00020\u0002H\u0007J\u0018\u0010$\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u000fH\u0007R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010*R\"\u00101\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010*\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00105\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010*\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R\"\u00109\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010*\u001a\u0004\b7\u0010.\"\u0004\b8\u00100R\"\u0010=\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010*\u001a\u0004\b;\u0010.\"\u0004\b<\u00100R\"\u0010A\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010*\u001a\u0004\b?\u0010.\"\u0004\b@\u00100R2\u0010J\u001a\u0012\u0012\u0004\u0012\u00020\n0Bj\b\u0012\u0004\u0012\u00020\n`C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0016\u0010N\u001a\u00020K8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010R\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\"\u0010^\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010f\u001a\u00020_8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010j\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010*\u001a\u0004\bh\u0010.\"\u0004\bi\u00100R\"\u0010r\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010z\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\"\u0010~\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b{\u0010Y\u001a\u0004\b|\u0010[\"\u0004\b}\u0010]R%\u0010\u0082\u0001\u001a\u00020_8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\u007f\u0010a\u001a\u0005\b\u0080\u0001\u0010c\"\u0005\b\u0081\u0001\u0010eR\u0017\u0010\u001a\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010*R\u0018\u0010\u0085\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010*R&\u0010\u0089\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010*\u001a\u0005\b\u0087\u0001\u0010.\"\u0005\b\u0088\u0001\u00100R,\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001¨\u0006\u0098\u0001"}, d2 = {"Lcom/nic/mparivahan/Echallan/SearchPrintChallanListActivity;", "Lcom/zepto/pq;", "", "N1", "F1", "U1", "C1", "", "k2", "", "Lcom/nic/mparivahan/Echallan/Echallan/Model/ChallanListResultModal;", "searchList", "a2", "T1", "A1", "", "message", "Y1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "string", "S1", "Landroid/content/Context;", "context", "i2", "challanNo", "otp", "otpId", "B1", "vehicleNo", "challanNoValue", "challanStateCd", "D1", "V1", "developermess", "l2", "Lcom/zepto/cg;", "C", "Lcom/zepto/cg;", "binding", "D", "Ljava/lang/String;", "digit", "E", "getInputValue", "()Ljava/lang/String;", "setInputValue", "(Ljava/lang/String;)V", "inputValue", "F", "getInputType", "setInputType", "inputType", "G", "getEngineNo", "setEngineNo", "engineNo", "H", "getChassisNo", "setChassisNo", "chassisNo", "I", "K1", "setSelectedChallanNo", "selectedChallanNo", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "J", "Ljava/util/ArrayList;", "E1", "()Ljava/util/ArrayList;", "b2", "(Ljava/util/ArrayList;)V", "allChallanList", "Lcom/zepto/rq5;", "K", "Lcom/zepto/rq5;", "adapter", "Lcom/nic/mparivahan/Echallan/Networking/SearchChallanService;", "L", "Lcom/nic/mparivahan/Echallan/Networking/SearchChallanService;", "retrofitService", "Lcom/zepto/fz1;", "M", "Lcom/zepto/fz1;", "viewModel", "Lcom/zepto/ld7;", "N", "Lcom/zepto/ld7;", "getViewModelAddMob", "()Lcom/zepto/ld7;", "g2", "(Lcom/zepto/ld7;)V", "viewModelAddMob", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "O", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "J1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "e2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitServiceAddMob", "P", "getChallantitle", "setChallantitle", "challantitle", "Lcom/zepto/wa3;", "Q", "Lcom/zepto/wa3;", "H1", "()Lcom/zepto/wa3;", "c2", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/ws6;", "R", "Lcom/zepto/ws6;", "L1", "()Lcom/zepto/ws6;", "f2", "(Lcom/zepto/ws6;)V", "sessionManager", "S", "M1", "h2", "viewModelv1", "T", "I1", "d2", "proservice", "U", "V", "challanStateCdValue", "W", "getRcNo", "setRcNo", "rcNo", "Landroid/app/Dialog;", "X", "Landroid/app/Dialog;", "G1", "()Landroid/app/Dialog;", "setD", "(Landroid/app/Dialog;)V", "d", "Landroid/text/TextWatcher;", "Y", "Landroid/text/TextWatcher;", "inputTextWatcher", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSearchPrintChallanListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchPrintChallanListActivity.kt\ncom/nic/mparivahan/Echallan/SearchPrintChallanListActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1120:1\n260#2:1121\n260#2:1122\n*S KotlinDebug\n*F\n+ 1 SearchPrintChallanListActivity.kt\ncom/nic/mparivahan/Echallan/SearchPrintChallanListActivity\n*L\n550#1:1121\n851#1:1122\n*E\n"})
public final class SearchPrintChallanListActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public cg binding;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public rq5 adapter;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public SearchChallanService retrofitService;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public fz1 viewModel;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ld7 viewModelAddMob;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public VahanProService retrofitServiceAddMob;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public ld7 viewModelv1;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public VahanProService proservice;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public Dialog d;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public final String digit = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String inputValue = "";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String inputType = "";

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String engineNo = "";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String chassisNo = "";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String selectedChallanNo = "";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ArrayList allChallanList = new ArrayList();

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String challantitle = " ";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String challanNo = "";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String challanStateCdValue = "";

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String rcNo = "";

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
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
            cg cgVar = SearchPrintChallanListActivity.this.binding;
            if (cgVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cgVar = null;
            }
            cgVar.e.setError(null);
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
            cg cgVar = SearchPrintChallanListActivity.this.binding;
            cg cgVar2 = null;
            if (cgVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cgVar = null;
            }
            ProgressBar progressBar = cgVar.f;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                cg cgVar3 = SearchPrintChallanListActivity.this.binding;
                if (cgVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    cgVar2 = cgVar3;
                }
                cgVar2.f.setVisibility(8);
            }
            if (!StringsKt__StringsJVMKt.equals(str, "ERROR", true)) {
                SearchPrintChallanListActivity.this.Y1(str);
            } else {
                SearchPrintChallanListActivity searchPrintChallanListActivity = SearchPrintChallanListActivity.this;
                searchPrintChallanListActivity.Y1(searchPrintChallanListActivity.H1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
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
            cg cgVar = null;
            try {
                Intrinsics.checkNotNull(challanListModal);
                if (challanListModal.getStatus() != 200) {
                    if (challanListModal.getStatus() != 404) {
                        cg cgVar2 = SearchPrintChallanListActivity.this.binding;
                        if (cgVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            cgVar2 = null;
                        }
                        ProgressBar progressBar = cgVar2.f;
                        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                        if (progressBar.getVisibility() == 0) {
                            cg cgVar3 = SearchPrintChallanListActivity.this.binding;
                            if (cgVar3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                cgVar3 = null;
                            }
                            cgVar3.f.setVisibility(8);
                        }
                        SearchPrintChallanListActivity.this.getAllChallanList().clear();
                        SearchPrintChallanListActivity.this.C1();
                        return;
                    }
                    cg cgVar4 = SearchPrintChallanListActivity.this.binding;
                    if (cgVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        cgVar4 = null;
                    }
                    ProgressBar progressBar2 = cgVar4.f;
                    Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                    if (progressBar2.getVisibility() == 0) {
                        cg cgVar5 = SearchPrintChallanListActivity.this.binding;
                        if (cgVar5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            cgVar5 = null;
                        }
                        cgVar5.f.setVisibility(8);
                    }
                    SearchPrintChallanListActivity.this.getAllChallanList().clear();
                    SearchPrintChallanListActivity.this.C1();
                    SearchPrintChallanListActivity searchPrintChallanListActivity = SearchPrintChallanListActivity.this;
                    searchPrintChallanListActivity.i2(searchPrintChallanListActivity, challanListModal.getMessage());
                    return;
                }
                SearchPrintChallanListActivity.this.b2(challanListModal.getResult());
                SearchPrintChallanListActivity searchPrintChallanListActivity2 = SearchPrintChallanListActivity.this;
                searchPrintChallanListActivity2.a2(searchPrintChallanListActivity2.getAllChallanList());
                SearchPrintChallanListActivity.this.C1();
                if (SearchPrintChallanListActivity.this.getAllChallanList().size() > 1) {
                    cg cgVar6 = SearchPrintChallanListActivity.this.binding;
                    if (cgVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        cgVar6 = null;
                    }
                    cgVar6.j.setText(SearchPrintChallanListActivity.this.H1().b("label_challan_totals", SearchPrintChallanListActivity.this.getString(R.string.total_challans)) + ' ' + SearchPrintChallanListActivity.this.getAllChallanList().size());
                } else if (SearchPrintChallanListActivity.this.getAllChallanList().size() == 0) {
                    cg cgVar7 = SearchPrintChallanListActivity.this.binding;
                    if (cgVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        cgVar7 = null;
                    }
                    cgVar7.j.setText(SearchPrintChallanListActivity.this.H1().b("label_challan_total", SearchPrintChallanListActivity.this.getString(R.string.total_challan)) + " 0");
                } else {
                    cg cgVar8 = SearchPrintChallanListActivity.this.binding;
                    if (cgVar8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        cgVar8 = null;
                    }
                    cgVar8.j.setText(SearchPrintChallanListActivity.this.H1().b("label_challan_total", SearchPrintChallanListActivity.this.getString(R.string.total_challan)) + ' ' + SearchPrintChallanListActivity.this.getAllChallanList().size());
                }
                cg cgVar9 = SearchPrintChallanListActivity.this.binding;
                if (cgVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cgVar9 = null;
                }
                ProgressBar progressBar3 = cgVar9.f;
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                if (progressBar3.getVisibility() == 0) {
                    cg cgVar10 = SearchPrintChallanListActivity.this.binding;
                    if (cgVar10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        cgVar10 = null;
                    }
                    cgVar10.f.setVisibility(8);
                }
            } catch (Exception e) {
                e.printStackTrace();
                cg cgVar11 = SearchPrintChallanListActivity.this.binding;
                if (cgVar11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cgVar11 = null;
                }
                ProgressBar progressBar4 = cgVar11.f;
                Intrinsics.checkNotNullExpressionValue(progressBar4, "progressBar");
                if (progressBar4.getVisibility() == 0) {
                    cg cgVar12 = SearchPrintChallanListActivity.this.binding;
                    if (cgVar12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        cgVar = cgVar12;
                    }
                    cgVar.f.setVisibility(8);
                }
                SearchPrintChallanListActivity.this.getAllChallanList().clear();
                SearchPrintChallanListActivity.this.C1();
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
            cg cgVar = SearchPrintChallanListActivity.this.binding;
            cg cgVar2 = null;
            if (cgVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cgVar = null;
            }
            ProgressBar progressBar = cgVar.f;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                cg cgVar3 = SearchPrintChallanListActivity.this.binding;
                if (cgVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    cgVar2 = cgVar3;
                }
                cgVar2.f.setVisibility(8);
            }
            SearchPrintChallanListActivity.this.getAllChallanList().clear();
            SearchPrintChallanListActivity.this.C1();
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(ChallanPdfDataModal challanPdfDataModal) {
            cg cgVar = SearchPrintChallanListActivity.this.binding;
            cg cgVar2 = null;
            if (cgVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cgVar = null;
            }
            ProgressBar progressBar = cgVar.f;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                cg cgVar3 = SearchPrintChallanListActivity.this.binding;
                if (cgVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    cgVar2 = cgVar3;
                }
                cgVar2.f.setVisibility(8);
            }
            if (challanPdfDataModal.getStatus() != 200) {
                if (kt6.d(challanPdfDataModal.getMessage())) {
                    SearchPrintChallanListActivity.this.Y1(challanPdfDataModal.getMessage());
                    return;
                }
                SearchPrintChallanListActivity searchPrintChallanListActivity = SearchPrintChallanListActivity.this;
                String strB = searchPrintChallanListActivity.H1().b("label_went_wrong", SearchPrintChallanListActivity.this.getString(R.string.something_please_try_after_some_time));
                Intrinsics.checkNotNull(strB);
                searchPrintChallanListActivity.Y1(strB);
                return;
            }
            String pdf_url = challanPdfDataModal.getResults().getPdf_url();
            if (!kt6.d(pdf_url)) {
                Toast.makeText(SearchPrintChallanListActivity.this, "Payment is pending so can't view payment receipt", 0).show();
                return;
            }
            String strA = com.zepto.j.a.a(pdf_url, "E@CHALLAN*#2017$");
            Intent intent = new Intent(SearchPrintChallanListActivity.this, (Class<?>) PrintChallanWebView.class);
            intent.putExtra("challanPdfUrl", strA);
            intent.putExtra("challan_receipt_url", "");
            intent.putExtra("challanNo", SearchPrintChallanListActivity.this.getSelectedChallanNo());
            intent.putExtra("fromActivity", "printChallan");
            SearchPrintChallanListActivity.this.startActivity(intent);
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
            cg cgVar = SearchPrintChallanListActivity.this.binding;
            cg cgVar2 = null;
            if (cgVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cgVar = null;
            }
            ProgressBar progressBar = cgVar.f;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                cg cgVar3 = SearchPrintChallanListActivity.this.binding;
                if (cgVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    cgVar2 = cgVar3;
                }
                cgVar2.f.setVisibility(8);
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
                cg cgVar = SearchPrintChallanListActivity.this.binding;
                cg cgVar2 = null;
                if (cgVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cgVar = null;
                }
                ProgressBar progressBar = cgVar.f;
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                if (progressBar.getVisibility() == 0) {
                    cg cgVar3 = SearchPrintChallanListActivity.this.binding;
                    if (cgVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        cgVar2 = cgVar3;
                    }
                    cgVar2.f.setVisibility(8);
                }
                if (vahangenotp.getApiMessage().getStatusCode() != 200) {
                    Toast.makeText(SearchPrintChallanListActivity.this.getApplicationContext(), vahangenotp.getApiMessage().getDeveloperMessage(), 1).show();
                } else {
                    SearchPrintChallanListActivity searchPrintChallanListActivity = SearchPrintChallanListActivity.this;
                    searchPrintChallanListActivity.l2(searchPrintChallanListActivity, String.valueOf(vahangenotp.getApiMessage().getDeveloperMessage()));
                }
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(SearchPrintChallanListActivity.this.getApplicationContext(), "Unable to send the OTP, Please try after some times", 1).show();
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
                cg cgVar = SearchPrintChallanListActivity.this.binding;
                cg cgVar2 = null;
                if (cgVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cgVar = null;
                }
                ProgressBar progressBar = cgVar.f;
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                if (progressBar.getVisibility() == 0) {
                    cg cgVar3 = SearchPrintChallanListActivity.this.binding;
                    if (cgVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        cgVar2 = cgVar3;
                    }
                    cgVar2.f.setVisibility(8);
                }
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(SearchPrintChallanListActivity.this.getApplicationContext(), "Unable to send the OTP, Please try after some times", 1).show();
            }
        }
    }

    public static final class i extends Lambda implements Function1 {
        public i() {
            super(1);
        }

        public final void a(Vahangenotp vahangenotp) {
            try {
                cg cgVar = SearchPrintChallanListActivity.this.binding;
                cg cgVar2 = null;
                if (cgVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cgVar = null;
                }
                ProgressBar progressBar = cgVar.f;
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                if (progressBar.getVisibility() == 0) {
                    cg cgVar3 = SearchPrintChallanListActivity.this.binding;
                    if (cgVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        cgVar2 = cgVar3;
                    }
                    cgVar2.f.setVisibility(8);
                }
                if (vahangenotp.getApiMessage().getStatusCode() != 200) {
                    SearchPrintChallanListActivity.this.Y1("Unable to send the OTP, Please try after some time");
                } else {
                    SearchPrintChallanListActivity searchPrintChallanListActivity = SearchPrintChallanListActivity.this;
                    searchPrintChallanListActivity.Y1(searchPrintChallanListActivity.H1().b("label_log_resend_otp", "We have resent the OTP Verification to your mobile number"));
                }
            } catch (Exception e) {
                e.printStackTrace();
                SearchPrintChallanListActivity.this.Y1("Unable to send the OTP, Please try after some time");
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
                cg cgVar = SearchPrintChallanListActivity.this.binding;
                cg cgVar2 = null;
                if (cgVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cgVar = null;
                }
                ProgressBar progressBar = cgVar.f;
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                if (progressBar.getVisibility() == 0) {
                    cg cgVar3 = SearchPrintChallanListActivity.this.binding;
                    if (cgVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        cgVar2 = cgVar3;
                    }
                    cgVar2.f.setVisibility(8);
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
            cg cgVar = null;
            try {
                cg cgVar2 = SearchPrintChallanListActivity.this.binding;
                if (cgVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cgVar2 = null;
                }
                ProgressBar progressBar = cgVar2.f;
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                if (progressBar.getVisibility() == 0) {
                    cg cgVar3 = SearchPrintChallanListActivity.this.binding;
                    if (cgVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        cgVar3 = null;
                    }
                    cgVar3.f.setVisibility(8);
                }
                if (SearchPrintChallanListActivity.this.getD() != null) {
                    Dialog d = SearchPrintChallanListActivity.this.getD();
                    Intrinsics.checkNotNull(d);
                    d.dismiss();
                }
                Toast.makeText(SearchPrintChallanListActivity.this, str, 0).show();
                SearchPrintChallanListActivity searchPrintChallanListActivity = SearchPrintChallanListActivity.this;
                searchPrintChallanListActivity.B1(searchPrintChallanListActivity.challanNo, "", "");
            } catch (Exception e) {
                cg cgVar4 = SearchPrintChallanListActivity.this.binding;
                if (cgVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cgVar4 = null;
                }
                ProgressBar progressBar2 = cgVar4.f;
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                if (progressBar2.getVisibility() == 0) {
                    cg cgVar5 = SearchPrintChallanListActivity.this.binding;
                    if (cgVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        cgVar = cgVar5;
                    }
                    cgVar.f.setVisibility(8);
                }
                e.printStackTrace();
                SearchPrintChallanListActivity searchPrintChallanListActivity2 = SearchPrintChallanListActivity.this;
                searchPrintChallanListActivity2.Y1(searchPrintChallanListActivity2.H1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
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
        if (T1()) {
            F1();
        } else {
            i2(this, H1().b("error_msg_record_not_found", getString(R.string.service_unavable_please_try)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C1() {
        cg cgVar = null;
        if (this.allChallanList.size() != 0) {
            cg cgVar2 = this.binding;
            if (cgVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cgVar2 = null;
            }
            cgVar2.d.setVisibility(8);
            cg cgVar3 = this.binding;
            if (cgVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cgVar = cgVar3;
            }
            cgVar.b.setVisibility(0);
            return;
        }
        cg cgVar4 = this.binding;
        if (cgVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cgVar4 = null;
        }
        cgVar4.d.setVisibility(0);
        cg cgVar5 = this.binding;
        if (cgVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cgVar5 = null;
        }
        cgVar5.b.setVisibility(8);
        cg cgVar6 = this.binding;
        if (cgVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cgVar = cgVar6;
        }
        cgVar.j.setVisibility(8);
    }

    private final void F1() {
        fz1 fz1Var;
        cg cgVar = null;
        try {
            cg cgVar2 = this.binding;
            if (cgVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cgVar2 = null;
            }
            cgVar2.f.setVisibility(0);
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
            cg cgVar3 = this.binding;
            if (cgVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cgVar3 = null;
            }
            ProgressBar progressBar = cgVar3.f;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                cg cgVar4 = this.binding;
                if (cgVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    cgVar = cgVar4;
                }
                cgVar.f.setVisibility(8);
            }
            this.allChallanList.clear();
            C1();
        }
    }

    private final void N1() {
        cg cgVar = null;
        if (!gd1.a.m(this.challantitle)) {
            cg cgVar2 = this.binding;
            if (cgVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cgVar2 = null;
            }
            cgVar2.h.setText(H1().b("label_challan_download", this.challantitle));
        }
        g2((ld7) new z(this, new kd7(new jd7(J1()))).a(ld7.class));
        SearchChallanService searchChallanService = this.retrofitService;
        if (searchChallanService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            searchChallanService = null;
        }
        this.viewModel = (fz1) new z(this, new ez1(new dz1(searchChallanService))).a(fz1.class);
        h2((ld7) new z(this, new kd7(new jd7(I1()))).a(ld7.class));
        cg cgVar3 = this.binding;
        if (cgVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cgVar3 = null;
        }
        cgVar3.i.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bs5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchPrintChallanListActivity.O1(this.a, view);
            }
        });
        cg cgVar4 = this.binding;
        if (cgVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cgVar4 = null;
        }
        cgVar4.i.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fs5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchPrintChallanListActivity.P1(this.a, view);
            }
        });
        cg cgVar5 = this.binding;
        if (cgVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cgVar5 = null;
        }
        cgVar5.e.setKeyListener(DigitsKeyListener.getInstance(this.digit));
        cg cgVar6 = this.binding;
        if (cgVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cgVar6 = null;
        }
        cgVar6.e.setRawInputType(ConstantsKt.DEFAULT_BLOCK_SIZE);
        cg cgVar7 = this.binding;
        if (cgVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cgVar7 = null;
        }
        cgVar7.b.setNestedScrollingEnabled(false);
        F1();
        if (this.inputValue.length() > 0) {
            cg cgVar8 = this.binding;
            if (cgVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cgVar8 = null;
            }
            cgVar8.e.setText(this.inputValue);
            String str = this.inputType;
            if (Intrinsics.areEqual(str, "Challan")) {
                cg cgVar9 = this.binding;
                if (cgVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cgVar9 = null;
                }
                cgVar9.e.setHint(getString(R.string.enter_challan_notice_no));
                cg cgVar10 = this.binding;
                if (cgVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cgVar10 = null;
                }
                cgVar10.e.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(30)});
                cg cgVar11 = this.binding;
                if (cgVar11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cgVar11 = null;
                }
                cgVar11.j.setVisibility(8);
            } else if (Intrinsics.areEqual(str, "RC")) {
                cg cgVar12 = this.binding;
                if (cgVar12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cgVar12 = null;
                }
                cgVar12.e.setHint(H1().b("label_challan_enter_vehicle_no", getString(R.string.enter_vehicle_number)));
                cg cgVar13 = this.binding;
                if (cgVar13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cgVar13 = null;
                }
                cgVar13.e.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(10)});
                cg cgVar14 = this.binding;
                if (cgVar14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cgVar14 = null;
                }
                cgVar14.e.setInputType(0);
                cg cgVar15 = this.binding;
                if (cgVar15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cgVar15 = null;
                }
                cgVar15.j.setVisibility(0);
            } else {
                cg cgVar16 = this.binding;
                if (cgVar16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cgVar16 = null;
                }
                cgVar16.e.setHint(H1().b("label_challan_enter_dl_no", getString(R.string.enter_dl_number)));
                cg cgVar17 = this.binding;
                if (cgVar17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cgVar17 = null;
                }
                cgVar17.e.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(16)});
                cg cgVar18 = this.binding;
                if (cgVar18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cgVar18 = null;
                }
                cgVar18.j.setVisibility(0);
            }
        }
        cg cgVar19 = this.binding;
        if (cgVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cgVar19 = null;
        }
        cgVar19.b.setLayoutManager(new LinearLayoutManager(this));
        this.adapter = new rq5(this, new ArrayList(), 0, this.challantitle, H1(), this);
        cg cgVar20 = this.binding;
        if (cgVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cgVar20 = null;
        }
        RecyclerView recyclerView = cgVar20.b;
        rq5 rq5Var = this.adapter;
        if (rq5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            rq5Var = null;
        }
        recyclerView.setAdapter(rq5Var);
        cg cgVar21 = this.binding;
        if (cgVar21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cgVar21 = null;
        }
        cgVar21.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gs5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchPrintChallanListActivity.Q1(this.a, view);
            }
        });
        cg cgVar22 = this.binding;
        if (cgVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cgVar22 = null;
        }
        cgVar22.e.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zepto.hs5
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return SearchPrintChallanListActivity.R1(this.a, textView, i2, keyEvent);
            }
        });
        cg cgVar23 = this.binding;
        if (cgVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cgVar = cgVar23;
        }
        cgVar.e.addTextChangedListener(this.inputTextWatcher);
    }

    public static final void O1(SearchPrintChallanListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void P1(SearchPrintChallanListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.U1();
    }

    public static final void Q1(SearchPrintChallanListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        cg cgVar = this$0.binding;
        cg cgVar2 = null;
        if (cgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cgVar = null;
        }
        String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(cgVar.e.getText())).toString();
        if (!this$0.k2()) {
            if (Intrinsics.areEqual(this$0.inputType, "RC")) {
                this$0.onBackPressed();
                return;
            }
            this$0.inputValue = string;
            this$0.allChallanList.clear();
            this$0.A1();
            return;
        }
        String str = this$0.inputType;
        if (Intrinsics.areEqual(str, "Challan")) {
            cg cgVar3 = this$0.binding;
            if (cgVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cgVar3 = null;
            }
            cgVar3.e.setError(this$0.H1().b("label_challan_please_enter_challan_no", this$0.getString(R.string.please_enter_challan_no)));
            cg cgVar4 = this$0.binding;
            if (cgVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cgVar2 = cgVar4;
            }
            cgVar2.e.requestFocus();
            return;
        }
        if (Intrinsics.areEqual(str, "RC")) {
            cg cgVar5 = this$0.binding;
            if (cgVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cgVar5 = null;
            }
            cgVar5.e.setError(this$0.H1().b("label_challan_please_enter_vehicle_no", this$0.getString(R.string.please_enter_vehicle_no)));
            cg cgVar6 = this$0.binding;
            if (cgVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cgVar2 = cgVar6;
            }
            cgVar2.e.requestFocus();
            return;
        }
        cg cgVar7 = this$0.binding;
        if (cgVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cgVar7 = null;
        }
        cgVar7.e.setError(this$0.H1().b("label_challan_valid_dl_no", this$0.getString(R.string.please_enter_valid_dl_number)));
        cg cgVar8 = this$0.binding;
        if (cgVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cgVar2 = cgVar8;
        }
        cgVar2.e.requestFocus();
    }

    public static final boolean R1(SearchPrintChallanListActivity this$0, TextView textView, int i2, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i2 != 6) {
            return false;
        }
        cg cgVar = this$0.binding;
        cg cgVar2 = null;
        if (cgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cgVar = null;
        }
        String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(cgVar.e.getText())).toString();
        if (!this$0.k2()) {
            if (Intrinsics.areEqual(this$0.inputType, "RC")) {
                this$0.onBackPressed();
            } else {
                this$0.inputValue = string;
                this$0.allChallanList.clear();
                this$0.A1();
            }
            return true;
        }
        String str = this$0.inputType;
        if (Intrinsics.areEqual(str, "Challan")) {
            cg cgVar3 = this$0.binding;
            if (cgVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cgVar3 = null;
            }
            cgVar3.e.setError(this$0.H1().b("label_challan_please_enter_challan_no", this$0.getString(R.string.please_enter_challan_no)));
            cg cgVar4 = this$0.binding;
            if (cgVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cgVar2 = cgVar4;
            }
            cgVar2.e.requestFocus();
        } else if (Intrinsics.areEqual(str, "RC")) {
            cg cgVar5 = this$0.binding;
            if (cgVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cgVar5 = null;
            }
            cgVar5.e.setError(this$0.H1().b("label_challan_please_enter_vehicle_no", this$0.getString(R.string.please_enter_vehicle_no)));
            cg cgVar6 = this$0.binding;
            if (cgVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cgVar2 = cgVar6;
            }
            cgVar2.e.requestFocus();
        } else {
            cg cgVar7 = this$0.binding;
            if (cgVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cgVar7 = null;
            }
            cgVar7.e.setError(this$0.H1().b("label_challan_valid_dl_no", this$0.getString(R.string.please_enter_valid_dl_number)));
            cg cgVar8 = this$0.binding;
            if (cgVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cgVar2 = cgVar8;
            }
            cgVar2.e.requestFocus();
        }
        return true;
    }

    private final boolean T1() {
        Object systemService = getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    private final void U1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public static final void W1(EditText enteredChassisNo, SearchPrintChallanListActivity this$0, Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(enteredChassisNo, "$enteredChassisNo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d2, "$d");
        if (enteredChassisNo.getText().toString().length() < 5) {
            Toast.makeText(this$0.getApplicationContext(), this$0.H1().b("label_challan_valid_chassis_no", "Please enter the valid last 5 digit of chassis no."), 1).show();
            return;
        }
        d2.dismiss();
        this$0.chassisNo = enteredChassisNo.getText().toString();
        ArrayList arrayList = new ArrayList();
        arrayList.add("62");
        GenerateUserVerify generateUserVerify = new GenerateUserVerify(" ", "", enteredChassisNo.getText().toString(), Settings.Secure.getString(this$0.getContentResolver(), "android_id"), "No", " ", "", "", " ", true, arrayList, this$0.rcNo, this$0.challanStateCdValue, this$0.L1().e(), "", this$0.L1().k());
        cg cgVar = this$0.binding;
        if (cgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cgVar = null;
        }
        cgVar.f.setVisibility(0);
        this$0.M1().B1(this$0, generateUserVerify);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y1(String message) {
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
        ((TextView) viewFindViewById3).setText(H1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(H1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.js5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchPrintChallanListActivity.Z1(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a2(List searchList) {
        rq5 rq5Var = this.adapter;
        if (rq5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            rq5Var = null;
        }
        rq5Var.B(searchList);
        rq5Var.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final boolean k2() {
        String strSubstring;
        cg cgVar = this.binding;
        cg cgVar2 = null;
        if (cgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cgVar = null;
        }
        String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(cgVar.e.getText())).toString();
        char[] charArray = string.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        if (string.length() <= 0 || string.length() <= 2) {
            strSubstring = "";
        } else {
            cg cgVar3 = this.binding;
            if (cgVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cgVar3 = null;
            }
            strSubstring = StringsKt__StringsKt.trim((CharSequence) String.valueOf(cgVar3.e.getText())).toString().substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        if (Intrinsics.areEqual(this.inputType, "Challan")) {
            if (string.length() == 0) {
                cg cgVar4 = this.binding;
                if (cgVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cgVar4 = null;
                }
                cgVar4.e.setError(getString(R.string.please_enter_challan_notice_no));
                cg cgVar5 = this.binding;
                if (cgVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    cgVar2 = cgVar5;
                }
                cgVar2.e.requestFocus();
                return true;
            }
            Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(string);
            if (intOrNull != null) {
                if (intOrNull.intValue() < 5) {
                    cg cgVar6 = this.binding;
                    if (cgVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        cgVar6 = null;
                    }
                    cgVar6.e.setError(getString(R.string.enter_min_notice_no));
                    cg cgVar7 = this.binding;
                    if (cgVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        cgVar2 = cgVar7;
                    }
                    cgVar2.e.requestFocus();
                    return true;
                }
            } else {
                if (!S1(strSubstring)) {
                    cg cgVar8 = this.binding;
                    if (cgVar8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        cgVar8 = null;
                    }
                    cgVar8.e.setError(H1().b("label_challan_enter_first_two_char_as_state", getString(R.string.please_enter_correct_challan_no)));
                    cg cgVar9 = this.binding;
                    if (cgVar9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        cgVar2 = cgVar9;
                    }
                    cgVar2.e.requestFocus();
                    return true;
                }
                if (string.length() < 12) {
                    cg cgVar10 = this.binding;
                    if (cgVar10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        cgVar10 = null;
                    }
                    cgVar10.e.setError(H1().b("label_challan_min_length_validation", getString(R.string.min_length_challan_no)));
                    cg cgVar11 = this.binding;
                    if (cgVar11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        cgVar2 = cgVar11;
                    }
                    cgVar2.e.requestFocus();
                    return true;
                }
                if (string.length() > 30) {
                    cg cgVar12 = this.binding;
                    if (cgVar12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        cgVar12 = null;
                    }
                    cgVar12.e.setError(H1().b("label_challan_max_length_validation", getString(R.string.max_length_challan_no)));
                    cg cgVar13 = this.binding;
                    if (cgVar13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        cgVar2 = cgVar13;
                    }
                    cgVar2.e.requestFocus();
                    return true;
                }
            }
        } else if (Intrinsics.areEqual(this.inputType, "RC")) {
            if (string.length() == 0) {
                cg cgVar14 = this.binding;
                if (cgVar14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cgVar14 = null;
                }
                cgVar14.e.setError(H1().b("label_challan_please_enter_vehicle_no", getString(R.string.please_enter_vehicle_no)));
                cg cgVar15 = this.binding;
                if (cgVar15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    cgVar2 = cgVar15;
                }
                cgVar2.e.requestFocus();
                return true;
            }
            int length = charArray.length;
            if (length >= 0 && length < 7) {
                cg cgVar16 = this.binding;
                if (cgVar16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cgVar16 = null;
                }
                cgVar16.e.setError(H1().b("label_challan_min_char_vehicle_no", getString(R.string.rc_min_valid)));
                cg cgVar17 = this.binding;
                if (cgVar17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    cgVar2 = cgVar17;
                }
                cgVar2.e.requestFocus();
                return true;
            }
            if (string.length() > 10) {
                cg cgVar18 = this.binding;
                if (cgVar18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cgVar18 = null;
                }
                cgVar18.e.setError(H1().b("label_challan_rc_validation", getString(R.string.rc_text)));
                cg cgVar19 = this.binding;
                if (cgVar19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    cgVar2 = cgVar19;
                }
                cgVar2.e.requestFocus();
                return true;
            }
            if (!new Regex("[a-zA-Z0-9]*").matches(string)) {
                cg cgVar20 = this.binding;
                if (cgVar20 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cgVar20 = null;
                }
                cgVar20.e.setError(H1().b("label_challan_invalid_vehicle_no", getString(R.string.invalid_rc_no)));
                cg cgVar21 = this.binding;
                if (cgVar21 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    cgVar2 = cgVar21;
                }
                cgVar2.e.requestFocus();
                return true;
            }
        } else if (Intrinsics.areEqual(this.inputType, "DL")) {
            if (string.length() == 0) {
                cg cgVar22 = this.binding;
                if (cgVar22 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cgVar22 = null;
                }
                cgVar22.e.setError(H1().b("label_challan_valid_dl_no", getString(R.string.please_enter_valid_dl_number)));
                cg cgVar23 = this.binding;
                if (cgVar23 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    cgVar2 = cgVar23;
                }
                cgVar2.e.requestFocus();
                return true;
            }
            if (string.length() < 10) {
                cg cgVar24 = this.binding;
                if (cgVar24 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cgVar24 = null;
                }
                cgVar24.e.setError(H1().b("label_challan_min_char_dl_validation", "Please enter minimum 10 characters of DL number"));
                cg cgVar25 = this.binding;
                if (cgVar25 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    cgVar2 = cgVar25;
                }
                cgVar2.e.requestFocus();
                return true;
            }
        }
        return false;
    }

    public static final void m2(SearchPrintChallanListActivity this$0, TextView time_text, wa3 langSession, Context context, TextView resendOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(time_text, "$time_text");
        Intrinsics.checkNotNullParameter(langSession, "$langSession");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(resendOtp, "$resendOtp");
        new n(time_text, langSession, context, resendOtp).start();
        cg cgVar = this$0.binding;
        if (cgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cgVar = null;
        }
        cgVar.f.setVisibility(0);
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        arrayList.add("62");
        this$0.M1().A1(this$0, new GenerateUserVerify(" ", "", this$0.chassisNo, Settings.Secure.getString(this$0.getContentResolver(), "android_id"), "No", " ", "", "", " ", true, arrayList, this$0.rcNo, this$0.challanStateCdValue, this$0.L1().e(), "", this$0.L1().k()));
    }

    public static final void n2(EditText enterOtp, Context context, wa3 langSession, SearchPrintChallanListActivity this$0, View view) {
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
        cg cgVar = this$0.binding;
        if (cgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cgVar = null;
        }
        cgVar.f.setVisibility(0);
        this$0.M1().C1(this$0, "", this$0.rcNo, this$0.challanStateCdValue, "M", "62", string, "", new ws6(this$0).k(), this$0.chassisNo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o2(EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        enterOtp.setText("");
    }

    public static final void p2(SearchPrintChallanListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.d;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q2(EditText enterOtp, ImageView shownPin, View view) {
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
        cg cgVar = null;
        try {
            this.selectedChallanNo = challanNo;
            cg cgVar2 = this.binding;
            if (cgVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cgVar2 = null;
            }
            cgVar2.f.setVisibility(0);
            fz1 fz1Var = this.viewModel;
            if (fz1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                fz1Var = null;
            }
            fz1Var.n(this, challanNo, otp, otpId, this.challanStateCdValue, this.rcNo, "62", this.chassisNo);
        } catch (Exception e2) {
            e2.printStackTrace();
            cg cgVar3 = this.binding;
            if (cgVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cgVar = cgVar3;
            }
            cgVar.f.setVisibility(8);
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
            this.rcNo = vehicleNo;
            this.challanStateCdValue = challanStateCd;
            cg cgVar = this.binding;
            if (cgVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cgVar = null;
            }
            cgVar.f.setVisibility(0);
            if (StringsKt__StringsJVMKt.equals(strSubstring, "AP", true)) {
                B1(challanNoValue, "", "");
                return;
            }
            Log.d("Input Type", this.inputType + 'a');
            if (kt6.d(this.inputType) && !Intrinsics.areEqual(this.inputType, "RC")) {
                V1();
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add("62");
            GenerateUserVerify generateUserVerify = new GenerateUserVerify(" ", "", this.chassisNo, Settings.Secure.getString(getContentResolver(), "android_id"), "No", " ", "", "", " ", true, arrayList, vehicleNo, this.challanStateCdValue, L1().e(), "", L1().k());
            cg cgVar2 = this.binding;
            if (cgVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cgVar2 = null;
            }
            cgVar2.f.setVisibility(0);
            M1().B1(this, generateUserVerify);
        } catch (Exception e2) {
            e2.printStackTrace();
            cg cgVar3 = this.binding;
            if (cgVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cgVar3 = null;
            }
            ProgressBar progressBar = cgVar3.f;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                cg cgVar4 = this.binding;
                if (cgVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cgVar4 = null;
                }
                cgVar4.f.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: E1, reason: from getter */
    public final ArrayList getAllChallanList() {
        return this.allChallanList;
    }

    /* JADX INFO: renamed from: G1, reason: from getter */
    public final Dialog getD() {
        return this.d;
    }

    public final wa3 H1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final VahanProService I1() {
        VahanProService vahanProService = this.proservice;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("proservice");
        return null;
    }

    public final VahanProService J1() {
        VahanProService vahanProService = this.retrofitServiceAddMob;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitServiceAddMob");
        return null;
    }

    /* JADX INFO: renamed from: K1, reason: from getter */
    public final String getSelectedChallanNo() {
        return this.selectedChallanNo;
    }

    public final ws6 L1() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final ld7 M1() {
        ld7 ld7Var = this.viewModelv1;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelv1");
        return null;
    }

    public final boolean S1(String string) {
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

    public final void V1() {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_enter_chassis_no);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setLayout(-1, -2);
        View viewFindViewById = dialog.findViewById(R.id.tv_chassi_no);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = dialog.findViewById(R.id.chassis_no_et);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        final EditText editText = (EditText) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.proceedBtn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        View viewFindViewById4 = dialog.findViewById(R.id.closeBtn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ds5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchPrintChallanListActivity.W1(editText, this, dialog, view);
            }
        });
        ((TextView) viewFindViewById4).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.es5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchPrintChallanListActivity.X1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void b2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.allChallanList = arrayList;
    }

    public final void c2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void d2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.proservice = vahanProService;
    }

    public final void e2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitServiceAddMob = vahanProService;
    }

    public final void f2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final void g2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModelAddMob = ld7Var;
    }

    public final void h2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModelv1 = ld7Var;
    }

    public final void i2(Context context, String message) {
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
        textView.setText(H1().b("label_challan_ok_dialog_text", getString(R.string.ok_txt)));
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        ((TextView) viewFindViewById3).setText(H1().b("nex_parivahan", getString(R.string.app_name)));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.is5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchPrintChallanListActivity.j2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void l2(final Context context, String developermess) {
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
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ks5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchPrintChallanListActivity.q2(editText, imageView2, view);
            }
        });
        final TextView textView8 = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ls5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchPrintChallanListActivity.m2(this.a, textView3, wa3Var, context, textView8, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ms5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchPrintChallanListActivity.n2(editText, context, wa3Var, this, view);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ns5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchPrintChallanListActivity.o2(editText, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cs5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchPrintChallanListActivity.p2(this.a, view);
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
        cg cgVarC = cg.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(cgVarC, "inflate(...)");
        this.binding = cgVarC;
        c2(new wa3(this));
        f2(new ws6(this));
        cg cgVar = this.binding;
        fz1 fz1Var = null;
        if (cgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cgVar = null;
        }
        setContentView(cgVar.b());
        az1.a aVar = az1.a;
        cg cgVar2 = this.binding;
        if (cgVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cgVar2 = null;
        }
        aVar.i(this, cgVar2);
        this.d = new Dialog(this);
        cg cgVar3 = this.binding;
        if (cgVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cgVar3 = null;
        }
        cgVar3.i.i.setText(H1().b("label_challan_download", getString(R.string.challan_print)));
        try {
            String stringExtra = getIntent().getStringExtra("inputValue");
            Intrinsics.checkNotNull(stringExtra);
            this.inputValue = stringExtra;
            String stringExtra2 = getIntent().getStringExtra("inputType");
            Intrinsics.checkNotNull(stringExtra2);
            this.inputType = stringExtra2;
            String stringExtra3 = getIntent().getStringExtra("Service_name");
            Intrinsics.checkNotNull(stringExtra3);
            this.challantitle = stringExtra3;
            if (getIntent().hasExtra("inputengineno")) {
                String stringExtra4 = getIntent().getStringExtra("inputengineno");
                Intrinsics.checkNotNull(stringExtra4);
                this.engineNo = stringExtra4;
            }
            if (getIntent().hasExtra("inputchassisno")) {
                String stringExtra5 = getIntent().getStringExtra("inputchassisno");
                Intrinsics.checkNotNull(stringExtra5);
                this.chassisNo = stringExtra5;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.retrofitService = SearchChallanService.INSTANCE.a(this);
        VahanProService.Companion companion = VahanProService.INSTANCE;
        e2(companion.a(this));
        d2(companion.a(this));
        N1();
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
        M1().i1().g(this, new l(new g()));
        M1().j1().g(this, new l(new h()));
        M1().g1().g(this, new l(new i()));
        M1().h1().g(this, new l(new j()));
        M1().e1().g(this, new l(new k()));
        M1().f1().g(this, new l(new b()));
    }
}
