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
import android.text.method.DigitsKeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Echallan.Echallan.Model.ChallanListModal;
import com.nic.mparivahan.Echallan.Echallan.Model.ChallanListResultModal;
import com.nic.mparivahan.Echallan.Networking.SearchChallanService;
import com.nic.mparivahan.Echallan.VerifyPaymentChallanList;
import com.nic.mparivahan.R;
import com.zepto.az1;
import com.zepto.dz1;
import com.zepto.ez1;
import com.zepto.fz1;
import com.zepto.kt6;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.qo7;
import com.zepto.rh;
import com.zepto.wa3;
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
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b^\u0010_J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0003J\u0016\u0010\t\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0003J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0015J\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010+\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010/\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R\"\u00103\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010&\u001a\u0004\b1\u0010(\"\u0004\b2\u0010*R\"\u00107\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010&\u001a\u0004\b5\u0010(\"\u0004\b6\u0010*R2\u0010@\u001a\u0012\u0012\u0004\u0012\u00020\u000708j\b\u0012\u0004\u0012\u00020\u0007`98\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010G\u001a\u00020A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010:\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010K\u001a\u00020A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010:\u001a\u0004\bI\u0010D\"\u0004\bJ\u0010FR\u0014\u0010M\u001a\u00020\u00128\u0002X\u0082D¢\u0006\u0006\n\u0004\bL\u0010&R\u0016\u0010Q\u001a\u00020N8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010U\u001a\u00020R8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010Y\u001a\u00020V8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006`"}, d2 = {"Lcom/nic/mparivahan/Echallan/VerifyPaymentChallanList;", "Lcom/zepto/pq;", "", "D1", "t1", "w1", "", "Lcom/nic/mparivahan/Echallan/Echallan/Model/ChallanListResultModal;", "searchList", "E1", "", "C1", "q1", "J1", "r1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "string", "B1", "Landroid/content/Context;", "context", "message", "H1", "Lcom/zepto/qo7;", "C", "Lcom/zepto/qo7;", "adapter", "Lcom/zepto/wa3;", "D", "Lcom/zepto/wa3;", "s1", "()Lcom/zepto/wa3;", "F1", "(Lcom/zepto/wa3;)V", "langSession", "E", "Ljava/lang/String;", "getInputValue", "()Ljava/lang/String;", "setInputValue", "(Ljava/lang/String;)V", "inputValue", "F", "getInputType", "setInputType", "inputType", "G", "getEngineNo", "setEngineNo", "engineNo", "H", "getChassisNo", "setChassisNo", "chassisNo", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "I", "Ljava/util/ArrayList;", "u1", "()Ljava/util/ArrayList;", "setPendingsearchList", "(Ljava/util/ArrayList;)V", "pendingsearchList", "", "J", "v1", "()I", "setTabClicked", "(I)V", "tabClicked", "K", "getPendingTotalChallan", "G1", "pendingTotalChallan", "L", "digit", "Lcom/nic/mparivahan/Echallan/Networking/SearchChallanService;", "M", "Lcom/nic/mparivahan/Echallan/Networking/SearchChallanService;", "retrofitService", "Lcom/zepto/fz1;", "N", "Lcom/zepto/fz1;", "viewModel", "Lcom/zepto/rh;", "O", "Lcom/zepto/rh;", "binding", "Landroid/text/TextWatcher;", "P", "Landroid/text/TextWatcher;", "inputTextWatcher", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nVerifyPaymentChallanList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerifyPaymentChallanList.kt\ncom/nic/mparivahan/Echallan/VerifyPaymentChallanList\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,605:1\n260#2:606\n*S KotlinDebug\n*F\n+ 1 VerifyPaymentChallanList.kt\ncom/nic/mparivahan/Echallan/VerifyPaymentChallanList\n*L\n194#1:606\n*E\n"})
public final class VerifyPaymentChallanList extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public qo7 adapter;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public int pendingTotalChallan;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public SearchChallanService retrofitService;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public fz1 viewModel;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public rh binding;

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
    public int tabClicked = 1;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public final String digit = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
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
            rh rhVar = VerifyPaymentChallanList.this.binding;
            if (rhVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rhVar = null;
            }
            rhVar.d.setError(null);
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
            rh rhVar = null;
            try {
                Intrinsics.checkNotNull(challanListModal);
                if (challanListModal.getStatus() != 200) {
                    if (challanListModal.getStatus() != 404) {
                        rh rhVar2 = VerifyPaymentChallanList.this.binding;
                        if (rhVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            rhVar2 = null;
                        }
                        ProgressBar progressBar = rhVar2.e;
                        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                        if (progressBar.getVisibility() == 0) {
                            rh rhVar3 = VerifyPaymentChallanList.this.binding;
                            if (rhVar3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                rhVar3 = null;
                            }
                            rhVar3.e.setVisibility(8);
                        }
                        VerifyPaymentChallanList.this.getPendingsearchList().clear();
                        VerifyPaymentChallanList.this.r1();
                        return;
                    }
                    rh rhVar4 = VerifyPaymentChallanList.this.binding;
                    if (rhVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        rhVar4 = null;
                    }
                    ProgressBar progressBar2 = rhVar4.e;
                    Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                    if (progressBar2.getVisibility() == 0) {
                        rh rhVar5 = VerifyPaymentChallanList.this.binding;
                        if (rhVar5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            rhVar5 = null;
                        }
                        rhVar5.e.setVisibility(8);
                    }
                    VerifyPaymentChallanList.this.getPendingsearchList().clear();
                    VerifyPaymentChallanList.this.r1();
                    VerifyPaymentChallanList verifyPaymentChallanList = VerifyPaymentChallanList.this;
                    verifyPaymentChallanList.H1(verifyPaymentChallanList, challanListModal.getMessage());
                    return;
                }
                ArrayList<ChallanListResultModal> result = challanListModal.getResult();
                int size = result.size();
                for (int i = 0; i < size; i++) {
                    if (StringsKt__StringsJVMKt.equals(result.get(i).getStatus(), "Pending", true)) {
                        VerifyPaymentChallanList.this.getPendingsearchList().add(result.get(i));
                    }
                }
                VerifyPaymentChallanList verifyPaymentChallanList2 = VerifyPaymentChallanList.this;
                verifyPaymentChallanList2.G1(verifyPaymentChallanList2.getPendingsearchList().size());
                VerifyPaymentChallanList verifyPaymentChallanList3 = VerifyPaymentChallanList.this;
                verifyPaymentChallanList3.E1(verifyPaymentChallanList3.getPendingsearchList());
                VerifyPaymentChallanList.this.r1();
                if (VerifyPaymentChallanList.this.getTabClicked() == 1) {
                    if (VerifyPaymentChallanList.this.getPendingsearchList().size() > 1) {
                        rh rhVar6 = VerifyPaymentChallanList.this.binding;
                        if (rhVar6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            rhVar6 = null;
                        }
                        rhVar6.i.setText(VerifyPaymentChallanList.this.s1().b("label_challan_totals", VerifyPaymentChallanList.this.getString(R.string.total_challans)) + ' ' + VerifyPaymentChallanList.this.getPendingsearchList().size());
                    } else if (VerifyPaymentChallanList.this.getPendingsearchList().size() == 0) {
                        rh rhVar7 = VerifyPaymentChallanList.this.binding;
                        if (rhVar7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            rhVar7 = null;
                        }
                        rhVar7.i.setText(VerifyPaymentChallanList.this.s1().b("label_challan_total", VerifyPaymentChallanList.this.getString(R.string.total_challan)) + " 0");
                    } else {
                        rh rhVar8 = VerifyPaymentChallanList.this.binding;
                        if (rhVar8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            rhVar8 = null;
                        }
                        rhVar8.i.setText(VerifyPaymentChallanList.this.s1().b("label_challan_total", VerifyPaymentChallanList.this.getString(R.string.total_challan)) + ' ' + VerifyPaymentChallanList.this.getPendingsearchList().size());
                    }
                }
                rh rhVar9 = VerifyPaymentChallanList.this.binding;
                if (rhVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rhVar9 = null;
                }
                ProgressBar progressBar3 = rhVar9.e;
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                if (progressBar3.getVisibility() == 0) {
                    rh rhVar10 = VerifyPaymentChallanList.this.binding;
                    if (rhVar10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        rhVar10 = null;
                    }
                    rhVar10.e.setVisibility(8);
                }
            } catch (Exception e) {
                e.printStackTrace();
                rh rhVar11 = VerifyPaymentChallanList.this.binding;
                if (rhVar11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rhVar11 = null;
                }
                ProgressBar progressBar4 = rhVar11.e;
                Intrinsics.checkNotNullExpressionValue(progressBar4, "progressBar");
                if (progressBar4.getVisibility() == 0) {
                    rh rhVar12 = VerifyPaymentChallanList.this.binding;
                    if (rhVar12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        rhVar = rhVar12;
                    }
                    rhVar.e.setVisibility(8);
                }
                VerifyPaymentChallanList.this.getPendingsearchList().clear();
                VerifyPaymentChallanList.this.r1();
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

        public final void invoke(String str) {
            rh rhVar = VerifyPaymentChallanList.this.binding;
            rh rhVar2 = null;
            if (rhVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rhVar = null;
            }
            ProgressBar progressBar = rhVar.e;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                rh rhVar3 = VerifyPaymentChallanList.this.binding;
                if (rhVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    rhVar2 = rhVar3;
                }
                rhVar2.e.setVisibility(8);
            }
            VerifyPaymentChallanList.this.getPendingsearchList().clear();
            VerifyPaymentChallanList.this.r1();
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

    public static final boolean A1(VerifyPaymentChallanList this$0, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i != 6) {
            return false;
        }
        rh rhVar = this$0.binding;
        rh rhVar2 = null;
        if (rhVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rhVar = null;
        }
        String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(rhVar.d.getText())).toString();
        if (!this$0.J1()) {
            if (Intrinsics.areEqual(this$0.inputType, "RC")) {
                this$0.onBackPressed();
            } else {
                this$0.inputValue = string;
                this$0.pendingsearchList.clear();
                this$0.q1();
            }
            return true;
        }
        String str = this$0.inputType;
        if (Intrinsics.areEqual(str, "Challan")) {
            rh rhVar3 = this$0.binding;
            if (rhVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rhVar3 = null;
            }
            rhVar3.d.setError(this$0.s1().b("label_challan_please_enter_challan_no", this$0.getString(R.string.please_enter_challan_no)));
            rh rhVar4 = this$0.binding;
            if (rhVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                rhVar2 = rhVar4;
            }
            rhVar2.d.requestFocus();
        } else if (Intrinsics.areEqual(str, "RC")) {
            rh rhVar5 = this$0.binding;
            if (rhVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rhVar5 = null;
            }
            rhVar5.d.setError(this$0.s1().b("label_challan_please_enter_vehicle_no", this$0.getString(R.string.please_enter_vehicle_no)));
            rh rhVar6 = this$0.binding;
            if (rhVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                rhVar2 = rhVar6;
            }
            rhVar2.d.requestFocus();
        } else {
            rh rhVar7 = this$0.binding;
            if (rhVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rhVar7 = null;
            }
            rhVar7.d.setError(this$0.s1().b("label_challan_valid_dl_no", this$0.getString(R.string.please_enter_valid_dl_number)));
            rh rhVar8 = this$0.binding;
            if (rhVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                rhVar2 = rhVar8;
            }
            rhVar2.d.requestFocus();
        }
        return true;
    }

    private final boolean C1() {
        Object systemService = getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    private final void D1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E1(List searchList) {
        qo7 qo7Var = this.adapter;
        if (qo7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            qo7Var = null;
        }
        qo7Var.B(searchList);
        qo7Var.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final boolean J1() {
        String strSubstring;
        rh rhVar = this.binding;
        rh rhVar2 = null;
        if (rhVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rhVar = null;
        }
        String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(rhVar.d.getText())).toString();
        char[] charArray = string.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        if (string.length() <= 0 || string.length() <= 2) {
            strSubstring = "";
        } else {
            rh rhVar3 = this.binding;
            if (rhVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rhVar3 = null;
            }
            strSubstring = StringsKt__StringsKt.trim((CharSequence) String.valueOf(rhVar3.d.getText())).toString().substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        if (Intrinsics.areEqual(this.inputType, "Challan")) {
            if (string.length() == 0) {
                rh rhVar4 = this.binding;
                if (rhVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rhVar4 = null;
                }
                rhVar4.d.setError(getString(R.string.please_enter_challan_notice_no));
                rh rhVar5 = this.binding;
                if (rhVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    rhVar2 = rhVar5;
                }
                rhVar2.d.requestFocus();
                return true;
            }
            Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(string);
            if (intOrNull != null) {
                if (intOrNull.intValue() < 5) {
                    rh rhVar6 = this.binding;
                    if (rhVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        rhVar6 = null;
                    }
                    rhVar6.d.setError(getString(R.string.enter_min_notice_no));
                    rh rhVar7 = this.binding;
                    if (rhVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        rhVar2 = rhVar7;
                    }
                    rhVar2.d.requestFocus();
                    return true;
                }
            } else {
                if (!B1(strSubstring)) {
                    rh rhVar8 = this.binding;
                    if (rhVar8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        rhVar8 = null;
                    }
                    rhVar8.d.setError(s1().b("label_challan_enter_first_two_char_as_state", getString(R.string.please_enter_correct_challan_no)));
                    rh rhVar9 = this.binding;
                    if (rhVar9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        rhVar2 = rhVar9;
                    }
                    rhVar2.d.requestFocus();
                    return true;
                }
                if (string.length() < 12) {
                    rh rhVar10 = this.binding;
                    if (rhVar10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        rhVar10 = null;
                    }
                    rhVar10.d.setError(s1().b("label_challan_min_length_validation", getString(R.string.min_length_challan_no)));
                    rh rhVar11 = this.binding;
                    if (rhVar11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        rhVar2 = rhVar11;
                    }
                    rhVar2.d.requestFocus();
                    return true;
                }
                if (string.length() > 30) {
                    rh rhVar12 = this.binding;
                    if (rhVar12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        rhVar12 = null;
                    }
                    rhVar12.d.setError(s1().b("label_challan_max_length_validation", getString(R.string.max_length_challan_no)));
                    rh rhVar13 = this.binding;
                    if (rhVar13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        rhVar2 = rhVar13;
                    }
                    rhVar2.d.requestFocus();
                    return true;
                }
            }
        } else if (Intrinsics.areEqual(this.inputType, "RC")) {
            if (string.length() == 0) {
                rh rhVar14 = this.binding;
                if (rhVar14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rhVar14 = null;
                }
                rhVar14.d.setError(s1().b("label_challan_please_enter_vehicle_no", getString(R.string.please_enter_vehicle_no)));
                rh rhVar15 = this.binding;
                if (rhVar15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    rhVar2 = rhVar15;
                }
                rhVar2.d.requestFocus();
                return true;
            }
            int length = charArray.length;
            if (length >= 0 && length < 7) {
                rh rhVar16 = this.binding;
                if (rhVar16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rhVar16 = null;
                }
                rhVar16.d.setError(s1().b("label_challan_min_char_vehicle_no", getString(R.string.rc_min_valid)));
                rh rhVar17 = this.binding;
                if (rhVar17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    rhVar2 = rhVar17;
                }
                rhVar2.d.requestFocus();
                return true;
            }
            if (string.length() > 10) {
                rh rhVar18 = this.binding;
                if (rhVar18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rhVar18 = null;
                }
                rhVar18.d.setError(s1().b("label_challan_rc_validation", getString(R.string.rc_text)));
                rh rhVar19 = this.binding;
                if (rhVar19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    rhVar2 = rhVar19;
                }
                rhVar2.d.requestFocus();
                return true;
            }
            if (!new Regex("[a-zA-Z0-9]*").matches(string)) {
                rh rhVar20 = this.binding;
                if (rhVar20 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rhVar20 = null;
                }
                rhVar20.d.setError(s1().b("label_challan_invalid_vehicle_no", getString(R.string.invalid_rc_no)));
                rh rhVar21 = this.binding;
                if (rhVar21 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    rhVar2 = rhVar21;
                }
                rhVar2.d.requestFocus();
                return true;
            }
        } else if (Intrinsics.areEqual(this.inputType, "DL")) {
            if (string.length() == 0) {
                rh rhVar22 = this.binding;
                if (rhVar22 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rhVar22 = null;
                }
                rhVar22.d.setError(s1().b("label_challan_valid_dl_no", getString(R.string.please_enter_valid_dl_number)));
                rh rhVar23 = this.binding;
                if (rhVar23 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    rhVar2 = rhVar23;
                }
                rhVar2.d.requestFocus();
                return true;
            }
            if (string.length() < 10) {
                rh rhVar24 = this.binding;
                if (rhVar24 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rhVar24 = null;
                }
                rhVar24.d.setError(s1().b("label_challan_min_char_dl_validation", "Please enter minimum 10 characters of DL number"));
                rh rhVar25 = this.binding;
                if (rhVar25 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    rhVar2 = rhVar25;
                }
                rhVar2.d.requestFocus();
                return true;
            }
        }
        return false;
    }

    private final void q1() {
        if (C1()) {
            t1();
        } else {
            H1(this, s1().b("error_msg_record_not_found", getString(R.string.service_unavable_please_try)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r1() {
        rh rhVar = null;
        if (this.pendingsearchList.size() == 0) {
            rh rhVar2 = this.binding;
            if (rhVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rhVar2 = null;
            }
            rhVar2.c.setVisibility(0);
            rh rhVar3 = this.binding;
            if (rhVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rhVar3 = null;
            }
            rhVar3.b.setVisibility(8);
            rh rhVar4 = this.binding;
            if (rhVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                rhVar = rhVar4;
            }
            rhVar.i.setVisibility(8);
            return;
        }
        rh rhVar5 = this.binding;
        if (rhVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rhVar5 = null;
        }
        rhVar5.c.setVisibility(8);
        rh rhVar6 = this.binding;
        if (rhVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rhVar6 = null;
        }
        rhVar6.b.setVisibility(0);
        rh rhVar7 = this.binding;
        if (rhVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            rhVar = rhVar7;
        }
        rhVar.i.setVisibility(0);
    }

    private final void w1() {
        SearchChallanService searchChallanService = this.retrofitService;
        rh rhVar = null;
        if (searchChallanService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            searchChallanService = null;
        }
        this.viewModel = (fz1) new z(this, new ez1(new dz1(searchChallanService))).a(fz1.class);
        rh rhVar2 = this.binding;
        if (rhVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rhVar2 = null;
        }
        rhVar2.d.setKeyListener(DigitsKeyListener.getInstance(this.digit));
        rh rhVar3 = this.binding;
        if (rhVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rhVar3 = null;
        }
        rhVar3.d.setRawInputType(ConstantsKt.DEFAULT_BLOCK_SIZE);
        rh rhVar4 = this.binding;
        if (rhVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rhVar4 = null;
        }
        rhVar4.b.setNestedScrollingEnabled(false);
        rh rhVar5 = this.binding;
        if (rhVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rhVar5 = null;
        }
        rhVar5.g.setText(s1().b("label_verify_payment_status", "Verify Payment Status"));
        rh rhVar6 = this.binding;
        if (rhVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rhVar6 = null;
        }
        rhVar6.h.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yo7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyPaymentChallanList.x1(this.a, view);
            }
        });
        if (this.inputType.length() > 0) {
            String str = this.inputType;
            if (Intrinsics.areEqual(str, "Challan")) {
                rh rhVar7 = this.binding;
                if (rhVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rhVar7 = null;
                }
                rhVar7.d.setHint(getString(R.string.enter_challan_notice_no));
                rh rhVar8 = this.binding;
                if (rhVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rhVar8 = null;
                }
                rhVar8.d.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(30)});
                rh rhVar9 = this.binding;
                if (rhVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rhVar9 = null;
                }
                rhVar9.i.setVisibility(8);
            } else if (Intrinsics.areEqual(str, "RC")) {
                rh rhVar10 = this.binding;
                if (rhVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rhVar10 = null;
                }
                rhVar10.d.setHint(s1().b("label_challan_enter_vehicle_no", getString(R.string.enter_vehicle_number)));
                rh rhVar11 = this.binding;
                if (rhVar11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rhVar11 = null;
                }
                rhVar11.d.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(10)});
                rh rhVar12 = this.binding;
                if (rhVar12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rhVar12 = null;
                }
                rhVar12.d.setInputType(0);
                rh rhVar13 = this.binding;
                if (rhVar13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rhVar13 = null;
                }
                rhVar13.i.setVisibility(0);
            } else {
                rh rhVar14 = this.binding;
                if (rhVar14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rhVar14 = null;
                }
                rhVar14.d.setHint(s1().b("label_challan_enter_dl_no", getString(R.string.enter_dl_number)));
                rh rhVar15 = this.binding;
                if (rhVar15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rhVar15 = null;
                }
                rhVar15.d.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(16)});
                rh rhVar16 = this.binding;
                if (rhVar16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    rhVar16 = null;
                }
                rhVar16.i.setVisibility(0);
            }
        }
        if (this.inputValue.length() > 0) {
            rh rhVar17 = this.binding;
            if (rhVar17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rhVar17 = null;
            }
            rhVar17.d.setText(this.inputValue);
        }
        rh rhVar18 = this.binding;
        if (rhVar18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rhVar18 = null;
        }
        rhVar18.b.setLayoutManager(new LinearLayoutManager(this));
        this.adapter = new qo7(this, new ArrayList(), 0, this.inputType, s1(), this.chassisNo);
        rh rhVar19 = this.binding;
        if (rhVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rhVar19 = null;
        }
        RecyclerView recyclerView = rhVar19.b;
        qo7 qo7Var = this.adapter;
        if (qo7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            qo7Var = null;
        }
        recyclerView.setAdapter(qo7Var);
        rh rhVar20 = this.binding;
        if (rhVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rhVar20 = null;
        }
        rhVar20.h.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zo7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyPaymentChallanList.y1(this.a, view);
            }
        });
        rh rhVar21 = this.binding;
        if (rhVar21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rhVar21 = null;
        }
        rhVar21.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ap7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyPaymentChallanList.z1(this.a, view);
            }
        });
        rh rhVar22 = this.binding;
        if (rhVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rhVar22 = null;
        }
        rhVar22.d.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zepto.bp7
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return VerifyPaymentChallanList.A1(this.a, textView, i, keyEvent);
            }
        });
        rh rhVar23 = this.binding;
        if (rhVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            rhVar = rhVar23;
        }
        rhVar.d.addTextChangedListener(this.inputTextWatcher);
    }

    public static final void x1(VerifyPaymentChallanList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.D1();
    }

    public static final void y1(VerifyPaymentChallanList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void z1(VerifyPaymentChallanList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        rh rhVar = this$0.binding;
        rh rhVar2 = null;
        if (rhVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rhVar = null;
        }
        String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(rhVar.d.getText())).toString();
        if (!this$0.J1()) {
            if (Intrinsics.areEqual(this$0.inputType, "RC")) {
                this$0.onBackPressed();
                return;
            }
            this$0.inputValue = string;
            this$0.pendingsearchList.clear();
            this$0.q1();
            return;
        }
        String str = this$0.inputType;
        if (Intrinsics.areEqual(str, "Challan")) {
            rh rhVar3 = this$0.binding;
            if (rhVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rhVar3 = null;
            }
            rhVar3.d.setError(this$0.s1().b("label_challan_please_enter_challan_no", this$0.getString(R.string.please_enter_challan_no)));
            rh rhVar4 = this$0.binding;
            if (rhVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                rhVar2 = rhVar4;
            }
            rhVar2.d.requestFocus();
            return;
        }
        if (Intrinsics.areEqual(str, "RC")) {
            rh rhVar5 = this$0.binding;
            if (rhVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rhVar5 = null;
            }
            rhVar5.d.setError(this$0.s1().b("label_challan_please_enter_vehicle_no", this$0.getString(R.string.please_enter_vehicle_no)));
            rh rhVar6 = this$0.binding;
            if (rhVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                rhVar2 = rhVar6;
            }
            rhVar2.d.requestFocus();
            return;
        }
        rh rhVar7 = this$0.binding;
        if (rhVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rhVar7 = null;
        }
        rhVar7.d.setError(this$0.s1().b("label_challan_valid_dl_no", this$0.getString(R.string.please_enter_valid_dl_number)));
        rh rhVar8 = this$0.binding;
        if (rhVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            rhVar2 = rhVar8;
        }
        rhVar2.d.requestFocus();
    }

    public final boolean B1(String string) {
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

    public final void F1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void G1(int i) {
        this.pendingTotalChallan = i;
    }

    public final void H1(Context context, String message) {
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
        textView.setText(s1().b("label_challan_ok_dialog_text", getString(R.string.ok_txt)));
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(s1().b("nex_parivahan", getString(R.string.app_name)));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cp7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VerifyPaymentChallanList.I1(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        rh rhVarC = rh.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(rhVarC, "inflate(...)");
        this.binding = rhVarC;
        fz1 fz1Var = null;
        if (rhVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rhVarC = null;
        }
        setContentView(rhVarC.b());
        F1(new wa3(this));
        az1.a aVar = az1.a;
        rh rhVar = this.binding;
        if (rhVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            rhVar = null;
        }
        aVar.m(this, rhVar);
        String stringExtra = getIntent().getStringExtra("inputValue");
        Intrinsics.checkNotNull(stringExtra);
        this.inputValue = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("inputType");
        Intrinsics.checkNotNull(stringExtra2);
        this.inputType = stringExtra2;
        if (kt6.d(stringExtra2) && StringsKt__StringsJVMKt.equals(this.inputType, "RC", true)) {
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
        }
        this.retrofitService = SearchChallanService.INSTANCE.a(this);
        w1();
        q1();
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

    public final wa3 s1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final void t1() {
        fz1 fz1Var;
        rh rhVar = null;
        try {
            rh rhVar2 = this.binding;
            if (rhVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rhVar2 = null;
            }
            rhVar2.e.setVisibility(0);
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
            rh rhVar3 = this.binding;
            if (rhVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                rhVar3 = null;
            }
            ProgressBar progressBar = rhVar3.e;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                rh rhVar4 = this.binding;
                if (rhVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    rhVar = rhVar4;
                }
                rhVar.e.setVisibility(8);
            }
            this.pendingsearchList.clear();
            r1();
        }
    }

    /* JADX INFO: renamed from: u1, reason: from getter */
    public final ArrayList getPendingsearchList() {
        return this.pendingsearchList;
    }

    /* JADX INFO: renamed from: v1, reason: from getter */
    public final int getTabClicked() {
        return this.tabClicked;
    }
}
