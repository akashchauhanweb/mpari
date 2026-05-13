package com.nic.mparivahan.Echallan;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Echallan.Echallan.Model.ChallanListModal;
import com.nic.mparivahan.Echallan.Echallan.Model.ChallanListResultModal;
import com.nic.mparivahan.Echallan.Networking.SearchChallanService;
import com.nic.mparivahan.Echallan.PaymentSearchChallanList;
import com.nic.mparivahan.R;
import com.zepto.az1;
import com.zepto.dz1;
import com.zepto.ez1;
import com.zepto.fz1;
import com.zepto.i54;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.wa3;
import com.zepto.xf;
import com.zepto.yy0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
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
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bt\u0010uJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0003J\u0016\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0003J\b\u0010\f\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\u0002H\u0003J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0015J\u000e\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010'\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010+\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\"\u0010/\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010$\"\u0004\b.\u0010&R\"\u00103\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\"\u001a\u0004\b1\u0010$\"\u0004\b2\u0010&R2\u0010<\u001a\u0012\u0012\u0004\u0012\u00020\u000604j\b\u0012\u0004\u0012\u00020\u0006`58\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R2\u0010@\u001a\u0012\u0012\u0004\u0012\u00020\u000604j\b\u0012\u0004\u0012\u00020\u0006`58\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00107\u001a\u0004\b>\u00109\"\u0004\b?\u0010;R2\u0010D\u001a\u0012\u0012\u0004\u0012\u00020\u000604j\b\u0012\u0004\u0012\u00020\u0006`58\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u00107\u001a\u0004\bB\u00109\"\u0004\bC\u0010;R\"\u0010K\u001a\u00020E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u00106\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010O\u001a\u00020E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u00106\u001a\u0004\bM\u0010H\"\u0004\bN\u0010JR\"\u0010S\u001a\u00020E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u00106\u001a\u0004\bQ\u0010H\"\u0004\bR\u0010JR\"\u0010W\u001a\u00020E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u00106\u001a\u0004\bU\u0010H\"\u0004\bV\u0010JR\u0014\u0010Y\u001a\u00020\u00128\u0002X\u0082D¢\u0006\u0006\n\u0004\bX\u0010\"R\u0016\u0010]\u001a\u00020Z8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010a\u001a\u00020^8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010e\u001a\u00020b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bc\u0010dR\"\u0010m\u001a\u00020f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0016\u0010o\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010\"R\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010r¨\u0006v"}, d2 = {"Lcom/nic/mparivahan/Echallan/PaymentSearchChallanList;", "Lcom/zepto/pq;", "", "v1", "B1", "", "Lcom/nic/mparivahan/Echallan/Echallan/Model/ChallanListResultModal;", "searchList", "M1", "", "K1", "t1", "S1", "u1", "L1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "string", "J1", "Landroid/content/Context;", "context", "message", "Q1", "Lcom/zepto/i54;", "C", "Lcom/zepto/i54;", "adapter", "Landroid/widget/RelativeLayout;", "D", "Landroid/widget/RelativeLayout;", "nexGenHolder", "E", "Ljava/lang/String;", "getInputValue", "()Ljava/lang/String;", "setInputValue", "(Ljava/lang/String;)V", "inputValue", "F", "getInputType", "setInputType", "inputType", "G", "getEngineNo", "setEngineNo", "engineNo", "H", "getChassisNo", "setChassisNo", "chassisNo", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "I", "Ljava/util/ArrayList;", "z1", "()Ljava/util/ArrayList;", "setPendingsearchList", "(Ljava/util/ArrayList;)V", "pendingsearchList", "J", "x1", "setDisposeChallanList", "disposeChallanList", "K", "w1", "N1", "challanList", "", "L", "A1", "()I", "setTabClicked", "(I)V", "tabClicked", "M", "getAllTotalChallan", "setAllTotalChallan", "allTotalChallan", "N", "getPendingTotalChallan", "P1", "pendingTotalChallan", "O", "getDisposeTotalChallan", "setDisposeTotalChallan", "disposeTotalChallan", "P", "digit", "Lcom/nic/mparivahan/Echallan/Networking/SearchChallanService;", "Q", "Lcom/nic/mparivahan/Echallan/Networking/SearchChallanService;", "retrofitService", "Lcom/zepto/fz1;", "R", "Lcom/zepto/fz1;", "viewModel", "Lcom/zepto/xf;", "S", "Lcom/zepto/xf;", "binding", "Lcom/zepto/wa3;", "T", "Lcom/zepto/wa3;", "y1", "()Lcom/zepto/wa3;", "O1", "(Lcom/zepto/wa3;)V", "langSession", "U", "serviceCode", "Landroid/text/TextWatcher;", "V", "Landroid/text/TextWatcher;", "inputTextWatcher", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPaymentSearchChallanList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSearchChallanList.kt\ncom/nic/mparivahan/Echallan/PaymentSearchChallanList\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,948:1\n260#2:949\n*S KotlinDebug\n*F\n+ 1 PaymentSearchChallanList.kt\ncom/nic/mparivahan/Echallan/PaymentSearchChallanList\n*L\n186#1:949\n*E\n"})
public final class PaymentSearchChallanList extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public i54 adapter;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public RelativeLayout nexGenHolder;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public int allTotalChallan;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public int pendingTotalChallan;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public int disposeTotalChallan;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public SearchChallanService retrofitService;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public fz1 viewModel;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public xf binding;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String inputValue = "";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String inputType = "";

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String engineNo = "";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String chassisNo = "";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ArrayList pendingsearchList = new ArrayList();

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ArrayList disposeChallanList = new ArrayList();

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ArrayList challanList = new ArrayList();

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public int tabClicked = 1;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public final String digit = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String serviceCode = "";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
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
            xf xfVar = PaymentSearchChallanList.this.binding;
            if (xfVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                xfVar = null;
            }
            xfVar.g.setError(null);
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
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
            xf xfVar = null;
            try {
                int status = challanListModal.getStatus();
                if (status == 200) {
                    PaymentSearchChallanList.this.N1(challanListModal.getResult());
                    int size = PaymentSearchChallanList.this.getChallanList().size();
                    for (int i = 0; i < size; i++) {
                        if (StringsKt__StringsJVMKt.equals(((ChallanListResultModal) PaymentSearchChallanList.this.getChallanList().get(i)).getStatus(), "Pending", true)) {
                            PaymentSearchChallanList.this.getPendingsearchList().add(PaymentSearchChallanList.this.getChallanList().get(i));
                        }
                    }
                    if (PaymentSearchChallanList.this.getPendingsearchList().size() > 0) {
                        PaymentSearchChallanList paymentSearchChallanList = PaymentSearchChallanList.this;
                        paymentSearchChallanList.P1(paymentSearchChallanList.getPendingsearchList().size());
                    }
                    if (PaymentSearchChallanList.this.getTabClicked() == 1) {
                        PaymentSearchChallanList.this.u1();
                        PaymentSearchChallanList paymentSearchChallanList2 = PaymentSearchChallanList.this;
                        paymentSearchChallanList2.M1(paymentSearchChallanList2.getPendingsearchList());
                    }
                    xf xfVar2 = PaymentSearchChallanList.this.binding;
                    if (xfVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        xfVar2 = null;
                    }
                    ProgressBar progressBar = xfVar2.i;
                    Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                    if (progressBar.getVisibility() == 0) {
                        xf xfVar3 = PaymentSearchChallanList.this.binding;
                        if (xfVar3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            xfVar3 = null;
                        }
                        xfVar3.i.setVisibility(8);
                        return;
                    }
                    return;
                }
                if (status != 404) {
                    xf xfVar4 = PaymentSearchChallanList.this.binding;
                    if (xfVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        xfVar4 = null;
                    }
                    ProgressBar progressBar2 = xfVar4.i;
                    Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                    if (progressBar2.getVisibility() == 0) {
                        xf xfVar5 = PaymentSearchChallanList.this.binding;
                        if (xfVar5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            xfVar5 = null;
                        }
                        xfVar5.i.setVisibility(8);
                    }
                    PaymentSearchChallanList.this.getChallanList().clear();
                    if (PaymentSearchChallanList.this.getTabClicked() == 1) {
                        PaymentSearchChallanList.this.u1();
                        PaymentSearchChallanList paymentSearchChallanList3 = PaymentSearchChallanList.this;
                        paymentSearchChallanList3.Q1(paymentSearchChallanList3, paymentSearchChallanList3.y1().b("error_msg_record_not_found", PaymentSearchChallanList.this.getString(R.string.service_unavable_please_try)));
                        return;
                    }
                    return;
                }
                xf xfVar6 = PaymentSearchChallanList.this.binding;
                if (xfVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    xfVar6 = null;
                }
                ProgressBar progressBar3 = xfVar6.i;
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                if (progressBar3.getVisibility() == 0) {
                    xf xfVar7 = PaymentSearchChallanList.this.binding;
                    if (xfVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        xfVar7 = null;
                    }
                    xfVar7.i.setVisibility(8);
                }
                PaymentSearchChallanList.this.getChallanList().clear();
                if (PaymentSearchChallanList.this.getTabClicked() == 1) {
                    PaymentSearchChallanList.this.u1();
                    PaymentSearchChallanList paymentSearchChallanList4 = PaymentSearchChallanList.this;
                    paymentSearchChallanList4.Q1(paymentSearchChallanList4, challanListModal.getMessage());
                }
            } catch (Exception e) {
                e.printStackTrace();
                xf xfVar8 = PaymentSearchChallanList.this.binding;
                if (xfVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    xfVar8 = null;
                }
                ProgressBar progressBar4 = xfVar8.i;
                Intrinsics.checkNotNullExpressionValue(progressBar4, "progressBar");
                if (progressBar4.getVisibility() == 0) {
                    xf xfVar9 = PaymentSearchChallanList.this.binding;
                    if (xfVar9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        xfVar = xfVar9;
                    }
                    xfVar.i.setVisibility(8);
                }
                PaymentSearchChallanList.this.getChallanList().clear();
                if (PaymentSearchChallanList.this.getTabClicked() == 1) {
                    PaymentSearchChallanList.this.u1();
                    PaymentSearchChallanList paymentSearchChallanList5 = PaymentSearchChallanList.this;
                    paymentSearchChallanList5.Q1(paymentSearchChallanList5, paymentSearchChallanList5.y1().b("error_msg_record_not_found", PaymentSearchChallanList.this.getString(R.string.service_unavable_please_try)));
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ChallanListModal) obj);
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
            xf xfVar = PaymentSearchChallanList.this.binding;
            xf xfVar2 = null;
            if (xfVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                xfVar = null;
            }
            ProgressBar progressBar = xfVar.i;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                xf xfVar3 = PaymentSearchChallanList.this.binding;
                if (xfVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    xfVar2 = xfVar3;
                }
                xfVar2.i.setVisibility(8);
            }
            PaymentSearchChallanList.this.getChallanList().clear();
            PaymentSearchChallanList.this.getDisposeChallanList().clear();
            PaymentSearchChallanList.this.getPendingsearchList().clear();
            PaymentSearchChallanList.this.u1();
            PaymentSearchChallanList paymentSearchChallanList = PaymentSearchChallanList.this;
            paymentSearchChallanList.Q1(paymentSearchChallanList, paymentSearchChallanList.y1().b("error_msg_record_not_found", PaymentSearchChallanList.this.getString(R.string.service_unavable_please_try)));
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

    private final void B1() {
        SearchChallanService searchChallanService = this.retrofitService;
        RelativeLayout relativeLayout = null;
        if (searchChallanService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            searchChallanService = null;
        }
        this.viewModel = (fz1) new z(this, new ez1(new dz1(searchChallanService))).a(fz1.class);
        View viewFindViewById = findViewById(R.id.nexGenHolder);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.nexGenHolder = (RelativeLayout) viewFindViewById;
        if (this.inputType.length() > 0) {
            String str = this.inputType;
            if (Intrinsics.areEqual(str, "Challan")) {
                xf xfVar = this.binding;
                if (xfVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    xfVar = null;
                }
                xfVar.g.setHint(getString(R.string.enter_challan_notice_no));
                xf xfVar2 = this.binding;
                if (xfVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    xfVar2 = null;
                }
                xfVar2.g.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(30)});
                xf xfVar3 = this.binding;
                if (xfVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    xfVar3 = null;
                }
                xfVar3.k.setVisibility(8);
                xf xfVar4 = this.binding;
                if (xfVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    xfVar4 = null;
                }
                xfVar4.n.setVisibility(8);
            } else if (Intrinsics.areEqual(str, "RC")) {
                xf xfVar5 = this.binding;
                if (xfVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    xfVar5 = null;
                }
                xfVar5.g.setHint(y1().b("label_challan_enter_vehicle_no", getString(R.string.enter_vehicle_number)));
                xf xfVar6 = this.binding;
                if (xfVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    xfVar6 = null;
                }
                xfVar6.g.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(10)});
                xf xfVar7 = this.binding;
                if (xfVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    xfVar7 = null;
                }
                xfVar7.k.setVisibility(8);
                xf xfVar8 = this.binding;
                if (xfVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    xfVar8 = null;
                }
                xfVar8.n.setVisibility(0);
                xf xfVar9 = this.binding;
                if (xfVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    xfVar9 = null;
                }
                xfVar9.g.setInputType(0);
            } else {
                xf xfVar10 = this.binding;
                if (xfVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    xfVar10 = null;
                }
                xfVar10.g.setHint(y1().b("label_challan_enter_dl_no", getString(R.string.enter_dl_number)));
                xf xfVar11 = this.binding;
                if (xfVar11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    xfVar11 = null;
                }
                xfVar11.g.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(16)});
                xf xfVar12 = this.binding;
                if (xfVar12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    xfVar12 = null;
                }
                xfVar12.k.setVisibility(8);
                xf xfVar13 = this.binding;
                if (xfVar13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    xfVar13 = null;
                }
                xfVar13.n.setVisibility(0);
            }
        }
        if (this.inputValue.length() > 0) {
            xf xfVar14 = this.binding;
            if (xfVar14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                xfVar14 = null;
            }
            xfVar14.g.setText(this.inputValue);
        }
        xf xfVar15 = this.binding;
        if (xfVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar15 = null;
        }
        xfVar15.c.setLayoutManager(new LinearLayoutManager(this));
        this.adapter = new i54(this, new ArrayList(), 0, this.inputType, y1(), this.serviceCode, this.chassisNo);
        xf xfVar16 = this.binding;
        if (xfVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar16 = null;
        }
        RecyclerView recyclerView = xfVar16.c;
        i54 i54Var = this.adapter;
        if (i54Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            i54Var = null;
        }
        recyclerView.setAdapter(i54Var);
        xf xfVar17 = this.binding;
        if (xfVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar17 = null;
        }
        xfVar17.m.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yn4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentSearchChallanList.C1(this.a, view);
            }
        });
        xf xfVar18 = this.binding;
        if (xfVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar18 = null;
        }
        xfVar18.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zn4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentSearchChallanList.D1(this.a, view);
            }
        });
        xf xfVar19 = this.binding;
        if (xfVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar19 = null;
        }
        xfVar19.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ao4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentSearchChallanList.E1(this.a, view);
            }
        });
        xf xfVar20 = this.binding;
        if (xfVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar20 = null;
        }
        xfVar20.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bo4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentSearchChallanList.F1(this.a, view);
            }
        });
        xf xfVar21 = this.binding;
        if (xfVar21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar21 = null;
        }
        xfVar21.j.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.co4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentSearchChallanList.G1(this.a, view);
            }
        });
        xf xfVar22 = this.binding;
        if (xfVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar22 = null;
        }
        xfVar22.g.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zepto.do4
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return PaymentSearchChallanList.H1(this.a, textView, i, keyEvent);
            }
        });
        xf xfVar23 = this.binding;
        if (xfVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar23 = null;
        }
        xfVar23.g.addTextChangedListener(this.inputTextWatcher);
        RelativeLayout relativeLayout2 = this.nexGenHolder;
        if (relativeLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nexGenHolder");
        } else {
            relativeLayout = relativeLayout2;
        }
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.eo4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentSearchChallanList.I1(this.a, view);
            }
        });
    }

    public static final void C1(PaymentSearchChallanList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void D1(PaymentSearchChallanList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.tabClicked = 0;
        xf xfVar = this$0.binding;
        xf xfVar2 = null;
        if (xfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar = null;
        }
        xfVar.b.setBackground(yy0.e(this$0, R.drawable.rectangle_bg_15_with_two_corner));
        xf xfVar3 = this$0.binding;
        if (xfVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar3 = null;
        }
        xfVar3.h.setBackground(yy0.e(this$0, R.drawable.rectanlge_without_corner_unselected));
        xf xfVar4 = this$0.binding;
        if (xfVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar4 = null;
        }
        xfVar4.d.setBackground(yy0.e(this$0, R.drawable.rectangle_bg_two_corner_right));
        xf xfVar5 = this$0.binding;
        if (xfVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar5 = null;
        }
        xfVar5.b.setTextColor(yy0.c(this$0, R.color.white));
        xf xfVar6 = this$0.binding;
        if (xfVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar6 = null;
        }
        xfVar6.d.setTextColor(yy0.c(this$0, R.color.dove_grey));
        xf xfVar7 = this$0.binding;
        if (xfVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar7 = null;
        }
        xfVar7.h.setTextColor(yy0.c(this$0, R.color.dove_grey));
        int i = this$0.allTotalChallan;
        if (i > 1) {
            xf xfVar8 = this$0.binding;
            if (xfVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                xfVar2 = xfVar8;
            }
            xfVar2.n.setText(this$0.y1().b("label_challan_totals", this$0.getString(R.string.total_challans)) + ' ' + this$0.allTotalChallan);
        } else if (i == 0) {
            xf xfVar9 = this$0.binding;
            if (xfVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                xfVar2 = xfVar9;
            }
            xfVar2.n.setText(this$0.y1().b("label_challan_total", this$0.getString(R.string.total_challan)) + " 0");
        } else {
            xf xfVar10 = this$0.binding;
            if (xfVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                xfVar2 = xfVar10;
            }
            xfVar2.n.setText(this$0.y1().b("label_challan_total", this$0.getString(R.string.total_challan)) + ' ' + this$0.allTotalChallan);
        }
        this$0.M1(this$0.challanList);
        this$0.u1();
    }

    public static final void E1(PaymentSearchChallanList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.tabClicked = 1;
        xf xfVar = this$0.binding;
        xf xfVar2 = null;
        if (xfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar = null;
        }
        xfVar.b.setBackground(yy0.e(this$0, R.drawable.rectangle_bg_two_corner_left_crystal_white));
        xf xfVar3 = this$0.binding;
        if (xfVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar3 = null;
        }
        xfVar3.h.setBackground(yy0.e(this$0, R.drawable.rectangle_without_corner_selected));
        xf xfVar4 = this$0.binding;
        if (xfVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar4 = null;
        }
        xfVar4.d.setBackground(yy0.e(this$0, R.drawable.rectangle_bg_two_corner_right));
        xf xfVar5 = this$0.binding;
        if (xfVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar5 = null;
        }
        xfVar5.h.setTextColor(yy0.c(this$0, R.color.white));
        xf xfVar6 = this$0.binding;
        if (xfVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar6 = null;
        }
        xfVar6.d.setTextColor(yy0.c(this$0, R.color.dove_grey));
        xf xfVar7 = this$0.binding;
        if (xfVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar7 = null;
        }
        xfVar7.b.setTextColor(yy0.c(this$0, R.color.dove_grey));
        int i = this$0.pendingTotalChallan;
        if (i > 1) {
            xf xfVar8 = this$0.binding;
            if (xfVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                xfVar2 = xfVar8;
            }
            xfVar2.n.setText(this$0.y1().b("label_challan_totals", this$0.getString(R.string.total_challans)) + ' ' + this$0.pendingTotalChallan);
        } else if (i == 0) {
            xf xfVar9 = this$0.binding;
            if (xfVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                xfVar2 = xfVar9;
            }
            xfVar2.n.setText(this$0.y1().b("label_challan_total", this$0.getString(R.string.total_challan)) + " 0");
        } else {
            xf xfVar10 = this$0.binding;
            if (xfVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                xfVar2 = xfVar10;
            }
            xfVar2.n.setText(this$0.y1().b("label_challan_total", this$0.getString(R.string.total_challan)) + ' ' + this$0.pendingTotalChallan);
        }
        this$0.M1(this$0.pendingsearchList);
        this$0.u1();
    }

    public static final void F1(PaymentSearchChallanList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.tabClicked = 2;
        xf xfVar = this$0.binding;
        xf xfVar2 = null;
        if (xfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar = null;
        }
        xfVar.d.setBackground(yy0.e(this$0, R.drawable.rectangle_bg_15_right_dodger_blue));
        xf xfVar3 = this$0.binding;
        if (xfVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar3 = null;
        }
        xfVar3.b.setBackground(yy0.e(this$0, R.drawable.rectangle_bg_two_corner_left_crystal_white));
        xf xfVar4 = this$0.binding;
        if (xfVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar4 = null;
        }
        xfVar4.h.setBackground(yy0.e(this$0, R.drawable.rectangle_without_corner_left_unselected));
        xf xfVar5 = this$0.binding;
        if (xfVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar5 = null;
        }
        xfVar5.b.setTextColor(yy0.c(this$0, R.color.dove_grey));
        xf xfVar6 = this$0.binding;
        if (xfVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar6 = null;
        }
        xfVar6.h.setTextColor(yy0.c(this$0, R.color.dove_grey));
        xf xfVar7 = this$0.binding;
        if (xfVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar7 = null;
        }
        xfVar7.d.setTextColor(yy0.c(this$0, R.color.white));
        int i = this$0.disposeTotalChallan;
        if (i > 1) {
            xf xfVar8 = this$0.binding;
            if (xfVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                xfVar2 = xfVar8;
            }
            xfVar2.n.setText(this$0.y1().b("label_challan_totals", this$0.getString(R.string.total_challans)) + ' ' + this$0.disposeTotalChallan);
        } else if (i == 0) {
            xf xfVar9 = this$0.binding;
            if (xfVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                xfVar2 = xfVar9;
            }
            xfVar2.n.setText(this$0.y1().b("label_challan_total", this$0.getString(R.string.total_challan)) + " 0");
        } else {
            xf xfVar10 = this$0.binding;
            if (xfVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                xfVar2 = xfVar10;
            }
            xfVar2.n.setText(this$0.y1().b("label_challan_total", this$0.getString(R.string.total_challan)) + ' ' + this$0.disposeTotalChallan);
        }
        this$0.M1(this$0.disposeChallanList);
        this$0.u1();
    }

    public static final void G1(PaymentSearchChallanList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        xf xfVar = this$0.binding;
        xf xfVar2 = null;
        if (xfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar = null;
        }
        String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(xfVar.g.getText())).toString();
        if (!this$0.S1()) {
            if (Intrinsics.areEqual(this$0.inputType, "RC")) {
                this$0.onBackPressed();
                return;
            }
            this$0.inputValue = string;
            this$0.disposeChallanList = new ArrayList();
            this$0.pendingsearchList = new ArrayList();
            this$0.challanList = new ArrayList();
            this$0.allTotalChallan = 0;
            this$0.pendingTotalChallan = 0;
            this$0.disposeTotalChallan = 0;
            this$0.t1();
            return;
        }
        String str = this$0.inputType;
        if (Intrinsics.areEqual(str, "Challan")) {
            xf xfVar3 = this$0.binding;
            if (xfVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                xfVar3 = null;
            }
            xfVar3.g.setError(this$0.y1().b("label_challan_please_enter_challan_no", this$0.getString(R.string.please_enter_challan_no)));
            xf xfVar4 = this$0.binding;
            if (xfVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                xfVar2 = xfVar4;
            }
            xfVar2.g.requestFocus();
            return;
        }
        if (Intrinsics.areEqual(str, "RC")) {
            xf xfVar5 = this$0.binding;
            if (xfVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                xfVar5 = null;
            }
            xfVar5.g.setError(this$0.y1().b("label_challan_please_enter_vehicle_no", this$0.getString(R.string.please_enter_vehicle_no)));
            xf xfVar6 = this$0.binding;
            if (xfVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                xfVar2 = xfVar6;
            }
            xfVar2.g.requestFocus();
            return;
        }
        xf xfVar7 = this$0.binding;
        if (xfVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar7 = null;
        }
        xfVar7.g.setError(this$0.y1().b("label_challan_valid_dl_no", this$0.getString(R.string.please_enter_valid_dl_number)));
        xf xfVar8 = this$0.binding;
        if (xfVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            xfVar2 = xfVar8;
        }
        xfVar2.g.requestFocus();
    }

    public static final boolean H1(PaymentSearchChallanList this$0, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i != 6) {
            return false;
        }
        xf xfVar = this$0.binding;
        xf xfVar2 = null;
        if (xfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar = null;
        }
        String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(xfVar.g.getText())).toString();
        if (!this$0.S1()) {
            if (Intrinsics.areEqual(this$0.inputType, "RC")) {
                this$0.onBackPressed();
            } else {
                this$0.inputValue = string;
                this$0.disposeChallanList.clear();
                this$0.pendingsearchList.clear();
                this$0.challanList.clear();
                this$0.allTotalChallan = 0;
                this$0.pendingTotalChallan = 0;
                this$0.disposeTotalChallan = 0;
                this$0.t1();
            }
            return true;
        }
        String str = this$0.inputType;
        if (Intrinsics.areEqual(str, "Challan")) {
            xf xfVar3 = this$0.binding;
            if (xfVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                xfVar3 = null;
            }
            xfVar3.g.setError(this$0.y1().b("label_challan_please_enter_challan_no", this$0.getString(R.string.please_enter_challan_no)));
            xf xfVar4 = this$0.binding;
            if (xfVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                xfVar2 = xfVar4;
            }
            xfVar2.g.requestFocus();
        } else if (Intrinsics.areEqual(str, "RC")) {
            xf xfVar5 = this$0.binding;
            if (xfVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                xfVar5 = null;
            }
            xfVar5.g.setError(this$0.y1().b("label_challan_please_enter_vehicle_no", this$0.getString(R.string.please_enter_vehicle_no)));
            xf xfVar6 = this$0.binding;
            if (xfVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                xfVar2 = xfVar6;
            }
            xfVar2.g.requestFocus();
        } else {
            xf xfVar7 = this$0.binding;
            if (xfVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                xfVar7 = null;
            }
            xfVar7.g.setError(this$0.y1().b("label_challan_valid_dl_no", this$0.getString(R.string.please_enter_valid_dl_number)));
            xf xfVar8 = this$0.binding;
            if (xfVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                xfVar2 = xfVar8;
            }
            xfVar2.g.requestFocus();
        }
        return true;
    }

    public static final void I1(PaymentSearchChallanList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.L1();
    }

    private final boolean K1() {
        Object systemService = getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    private final void L1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M1(List searchList) {
        i54 i54Var = this.adapter;
        if (i54Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            i54Var = null;
        }
        i54Var.B(searchList);
        i54Var.j();
    }

    public static final void R1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final boolean S1() {
        String strSubstring;
        xf xfVar = this.binding;
        xf xfVar2 = null;
        if (xfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar = null;
        }
        String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(xfVar.g.getText())).toString();
        char[] charArray = string.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        if (string.length() <= 0 || string.length() <= 2) {
            strSubstring = "";
        } else {
            xf xfVar3 = this.binding;
            if (xfVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                xfVar3 = null;
            }
            strSubstring = StringsKt__StringsKt.trim((CharSequence) String.valueOf(xfVar3.g.getText())).toString().substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        if (Intrinsics.areEqual(this.inputType, "Challan")) {
            if (string.length() == 0) {
                xf xfVar4 = this.binding;
                if (xfVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    xfVar4 = null;
                }
                xfVar4.g.setError(getString(R.string.please_enter_challan_notice_no));
                xf xfVar5 = this.binding;
                if (xfVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    xfVar2 = xfVar5;
                }
                xfVar2.g.requestFocus();
                return true;
            }
            Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(string);
            if (intOrNull != null) {
                if (intOrNull.intValue() < 5) {
                    xf xfVar6 = this.binding;
                    if (xfVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        xfVar6 = null;
                    }
                    xfVar6.g.setError(getString(R.string.enter_min_notice_no));
                    xf xfVar7 = this.binding;
                    if (xfVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        xfVar2 = xfVar7;
                    }
                    xfVar2.g.requestFocus();
                    return true;
                }
            } else {
                if (!J1(strSubstring)) {
                    xf xfVar8 = this.binding;
                    if (xfVar8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        xfVar8 = null;
                    }
                    xfVar8.g.setError(y1().b("label_challan_enter_first_two_char_as_state", getString(R.string.please_enter_correct_challan_no)));
                    xf xfVar9 = this.binding;
                    if (xfVar9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        xfVar2 = xfVar9;
                    }
                    xfVar2.g.requestFocus();
                    return true;
                }
                if (string.length() < 12) {
                    xf xfVar10 = this.binding;
                    if (xfVar10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        xfVar10 = null;
                    }
                    xfVar10.g.setError(y1().b("label_challan_min_length_validation", getString(R.string.min_length_challan_no)));
                    xf xfVar11 = this.binding;
                    if (xfVar11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        xfVar2 = xfVar11;
                    }
                    xfVar2.g.requestFocus();
                    return true;
                }
                if (string.length() > 30) {
                    xf xfVar12 = this.binding;
                    if (xfVar12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        xfVar12 = null;
                    }
                    xfVar12.g.setError(y1().b("label_challan_max_length_validation", getString(R.string.max_length_challan_no)));
                    xf xfVar13 = this.binding;
                    if (xfVar13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        xfVar2 = xfVar13;
                    }
                    xfVar2.g.requestFocus();
                    return true;
                }
            }
        } else if (Intrinsics.areEqual(this.inputType, "RC")) {
            if (string.length() == 0) {
                xf xfVar14 = this.binding;
                if (xfVar14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    xfVar14 = null;
                }
                xfVar14.g.setError(y1().b("label_challan_please_enter_vehicle_no", getString(R.string.please_enter_vehicle_no)));
                xf xfVar15 = this.binding;
                if (xfVar15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    xfVar2 = xfVar15;
                }
                xfVar2.g.requestFocus();
                return true;
            }
            int length = charArray.length;
            if (length >= 0 && length < 4) {
                xf xfVar16 = this.binding;
                if (xfVar16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    xfVar16 = null;
                }
                xfVar16.g.setError(y1().b("label_challan_min_char_vehicle_no", getString(R.string.rc_min_valid)));
                xf xfVar17 = this.binding;
                if (xfVar17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    xfVar2 = xfVar17;
                }
                xfVar2.g.requestFocus();
                return true;
            }
            if (string.length() > 10) {
                xf xfVar18 = this.binding;
                if (xfVar18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    xfVar18 = null;
                }
                xfVar18.g.setError(y1().b("label_challan_rc_validation", getString(R.string.rc_text)));
                xf xfVar19 = this.binding;
                if (xfVar19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    xfVar2 = xfVar19;
                }
                xfVar2.g.requestFocus();
                return true;
            }
            if (!new Regex("[a-zA-Z0-9]*").matches(string)) {
                xf xfVar20 = this.binding;
                if (xfVar20 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    xfVar20 = null;
                }
                xfVar20.g.setError(y1().b("label_challan_invalid_vehicle_no", getString(R.string.invalid_rc_no)));
                xf xfVar21 = this.binding;
                if (xfVar21 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    xfVar2 = xfVar21;
                }
                xfVar2.g.requestFocus();
                return true;
            }
        } else if (Intrinsics.areEqual(this.inputType, "DL")) {
            if (string.length() == 0) {
                xf xfVar22 = this.binding;
                if (xfVar22 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    xfVar22 = null;
                }
                xfVar22.g.setError(y1().b("label_challan_valid_dl_no", getString(R.string.please_enter_valid_dl_number)));
                xf xfVar23 = this.binding;
                if (xfVar23 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    xfVar2 = xfVar23;
                }
                xfVar2.g.requestFocus();
                return true;
            }
            if (string.length() < 10) {
                xf xfVar24 = this.binding;
                if (xfVar24 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    xfVar24 = null;
                }
                xfVar24.g.setError(y1().b("label_challan_min_char_dl_validation", "Please enter minimum 10 characters of DL number"));
                xf xfVar25 = this.binding;
                if (xfVar25 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    xfVar2 = xfVar25;
                }
                xfVar2.g.requestFocus();
                return true;
            }
        }
        return false;
    }

    private final void t1() {
        if (K1()) {
            v1();
        } else {
            Q1(this, y1().b("error_msg_record_not_found", getString(R.string.service_unavable_please_try)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u1() {
        xf xfVar = null;
        if (this.tabClicked != 1 || this.pendingsearchList.size() <= 0) {
            if (this.tabClicked == 1 && this.pendingsearchList.size() == 0) {
                xf xfVar2 = this.binding;
                if (xfVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    xfVar2 = null;
                }
                xfVar2.n.setText(y1().b("label_challan_total", getString(R.string.total_challan)) + " 0");
                xf xfVar3 = this.binding;
                if (xfVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    xfVar3 = null;
                }
                xfVar3.f.setVisibility(0);
                xf xfVar4 = this.binding;
                if (xfVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    xfVar = xfVar4;
                }
                xfVar.c.setVisibility(8);
                return;
            }
            return;
        }
        int i = this.pendingTotalChallan;
        if (i > 1) {
            xf xfVar5 = this.binding;
            if (xfVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                xfVar5 = null;
            }
            xfVar5.n.setText(y1().b("label_challan_totals", getString(R.string.total_challans)) + ' ' + this.pendingTotalChallan);
        } else if (i == 0) {
            xf xfVar6 = this.binding;
            if (xfVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                xfVar6 = null;
            }
            xfVar6.n.setText(y1().b("label_challan_total", getString(R.string.total_challan)) + " 0");
        } else {
            xf xfVar7 = this.binding;
            if (xfVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                xfVar7 = null;
            }
            xfVar7.n.setText(y1().b("label_challan_total", getString(R.string.total_challan)) + ' ' + this.pendingTotalChallan);
        }
        xf xfVar8 = this.binding;
        if (xfVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar8 = null;
        }
        xfVar8.f.setVisibility(8);
        xf xfVar9 = this.binding;
        if (xfVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            xfVar = xfVar9;
        }
        xfVar.c.setVisibility(0);
    }

    private final void v1() {
        fz1 fz1Var;
        xf xfVar = null;
        try {
            xf xfVar2 = this.binding;
            if (xfVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                xfVar2 = null;
            }
            xfVar2.i.setVisibility(0);
            fz1 fz1Var2 = this.viewModel;
            if (fz1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                fz1Var = null;
            } else {
                fz1Var = fz1Var2;
            }
            fz1Var.l(this, this.inputType, this.inputValue, 1, this.engineNo, this.chassisNo);
        } catch (Exception e) {
            e.printStackTrace();
            xf xfVar3 = this.binding;
            if (xfVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                xfVar3 = null;
            }
            ProgressBar progressBar = xfVar3.i;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                xf xfVar4 = this.binding;
                if (xfVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    xfVar = xfVar4;
                }
                xfVar.i.setVisibility(8);
            }
            if (this.tabClicked == 0) {
                u1();
            }
        }
    }

    /* JADX INFO: renamed from: A1, reason: from getter */
    public final int getTabClicked() {
        return this.tabClicked;
    }

    public final boolean J1(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        int length = string.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = string.charAt(i);
            if (('A' > cCharAt || cCharAt >= '[') && ('a' > cCharAt || cCharAt >= '{')) {
                return false;
            }
        }
        return true;
    }

    public final void N1(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.challanList = arrayList;
    }

    public final void O1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void P1(int i) {
        this.pendingTotalChallan = i;
    }

    public final void Q1(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        textView.setText(y1().b("label_challan_ok_dialog_text", getString(R.string.ok_txt)));
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(y1().b("nex_parivahan", getString(R.string.app_name)));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fo4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaymentSearchChallanList.R1(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        xf xfVarC = xf.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(xfVarC, "inflate(...)");
        this.binding = xfVarC;
        fz1 fz1Var = null;
        if (xfVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVarC = null;
        }
        setContentView(xfVarC.b());
        az1.a aVar = az1.a;
        xf xfVar = this.binding;
        if (xfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar = null;
        }
        aVar.b(this, xfVar);
        O1(new wa3(this));
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
        if (getIntent().hasExtra("Service_code")) {
            String stringExtra5 = getIntent().getStringExtra("Service_code");
            Intrinsics.checkNotNull(stringExtra5);
            this.serviceCode = stringExtra5;
        }
        this.retrofitService = SearchChallanService.INSTANCE.a(this);
        xf xfVar2 = this.binding;
        if (xfVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xfVar2 = null;
        }
        xfVar2.m.i.setText(y1().b("label_challan_payment_search", "Challan Details"));
        B1();
        t1();
        fz1 fz1Var2 = this.viewModel;
        if (fz1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            fz1Var2 = null;
        }
        fz1Var2.i().g(this, new d(new b()));
        fz1 fz1Var3 = this.viewModel;
        if (fz1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            fz1Var = fz1Var3;
        }
        fz1Var.h().g(this, new d(new c()));
    }

    /* JADX INFO: renamed from: w1, reason: from getter */
    public final ArrayList getChallanList() {
        return this.challanList;
    }

    /* JADX INFO: renamed from: x1, reason: from getter */
    public final ArrayList getDisposeChallanList() {
        return this.disposeChallanList;
    }

    public final wa3 y1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    /* JADX INFO: renamed from: z1, reason: from getter */
    public final ArrayList getPendingsearchList() {
        return this.pendingsearchList;
    }
}
