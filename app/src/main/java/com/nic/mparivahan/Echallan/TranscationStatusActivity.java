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
import com.nic.mparivahan.Echallan.Networking.SearchChallanService;
import com.nic.mparivahan.Echallan.TranscationStatusActivity;
import com.nic.mparivahan.R;
import com.zepto.az1;
import com.zepto.cz1;
import com.zepto.dz1;
import com.zepto.ez1;
import com.zepto.fz1;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.wa3;
import com.zepto.yl6;
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
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bS\u0010TJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\tH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0015J\u000e\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012R\"\u0010\u001f\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010#\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\"\u0010'\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR\"\u0010+\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR2\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u00060,j\b\u0012\u0004\u0012\u00020\u0006`-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u00128\u0002X\u0082D¢\u0006\u0006\n\u0004\b9\u0010\u001aR\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006U"}, d2 = {"Lcom/nic/mparivahan/Echallan/TranscationStatusActivity;", "Lcom/zepto/pq;", "", "v1", "t1", "", "Lcom/nic/mparivahan/Echallan/Echallan/Model/ChallanListResultModal;", "searchList", "D1", "", "I1", "C1", "r1", "B1", "q1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "string", "A1", "Landroid/content/Context;", "context", "message", "G1", "C", "Ljava/lang/String;", "getInputValue", "()Ljava/lang/String;", "setInputValue", "(Ljava/lang/String;)V", "inputValue", "D", "getInputType", "setInputType", "inputType", "E", "getEngineNo", "setEngineNo", "engineNo", "F", "getChassisNo", "setChassisNo", "chassisNo", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "G", "Ljava/util/ArrayList;", "s1", "()Ljava/util/ArrayList;", "E1", "(Ljava/util/ArrayList;)V", "allChallanList", "Lcom/zepto/yl6;", "H", "Lcom/zepto/yl6;", "adapter", "I", "digit", "Lcom/zepto/cz1;", "J", "Lcom/zepto/cz1;", "binding", "Lcom/nic/mparivahan/Echallan/Networking/SearchChallanService;", "K", "Lcom/nic/mparivahan/Echallan/Networking/SearchChallanService;", "retrofitService", "Lcom/zepto/fz1;", "L", "Lcom/zepto/fz1;", "viewModel", "Lcom/zepto/wa3;", "M", "Lcom/zepto/wa3;", "u1", "()Lcom/zepto/wa3;", "F1", "(Lcom/zepto/wa3;)V", "langSession", "Landroid/text/TextWatcher;", "N", "Landroid/text/TextWatcher;", "inputTextWatcher", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTranscationStatusActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TranscationStatusActivity.kt\ncom/nic/mparivahan/Echallan/TranscationStatusActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,535:1\n260#2:536\n*S KotlinDebug\n*F\n+ 1 TranscationStatusActivity.kt\ncom/nic/mparivahan/Echallan/TranscationStatusActivity\n*L\n289#1:536\n*E\n"})
public final class TranscationStatusActivity extends pq {

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public yl6 adapter;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public cz1 binding;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public SearchChallanService retrofitService;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public fz1 viewModel;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public String inputValue = "";

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String inputType = "";

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String engineNo = "";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String chassisNo = "";

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ArrayList allChallanList = new ArrayList();

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public final String digit = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
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
            cz1 cz1Var = TranscationStatusActivity.this.binding;
            if (cz1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cz1Var = null;
            }
            cz1Var.c.setError(null);
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
            cz1 cz1Var = null;
            try {
                int status = challanListModal.getStatus();
                if (status != 200) {
                    if (status != 404) {
                        cz1 cz1Var2 = TranscationStatusActivity.this.binding;
                        if (cz1Var2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            cz1Var2 = null;
                        }
                        ProgressBar progressBar = cz1Var2.d;
                        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                        if (progressBar.getVisibility() == 0) {
                            cz1 cz1Var3 = TranscationStatusActivity.this.binding;
                            if (cz1Var3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                cz1Var3 = null;
                            }
                            cz1Var3.d.setVisibility(8);
                        }
                        TranscationStatusActivity.this.r1();
                        return;
                    }
                    cz1 cz1Var4 = TranscationStatusActivity.this.binding;
                    if (cz1Var4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        cz1Var4 = null;
                    }
                    ProgressBar progressBar2 = cz1Var4.d;
                    Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                    if (progressBar2.getVisibility() == 0) {
                        cz1 cz1Var5 = TranscationStatusActivity.this.binding;
                        if (cz1Var5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            cz1Var5 = null;
                        }
                        cz1Var5.d.setVisibility(8);
                    }
                    TranscationStatusActivity.this.r1();
                    TranscationStatusActivity transcationStatusActivity = TranscationStatusActivity.this;
                    transcationStatusActivity.G1(transcationStatusActivity, challanListModal.getMessage());
                    return;
                }
                TranscationStatusActivity.this.E1(challanListModal.getResult());
                if (TranscationStatusActivity.this.getAllChallanList().size() > 1) {
                    cz1 cz1Var6 = TranscationStatusActivity.this.binding;
                    if (cz1Var6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        cz1Var6 = null;
                    }
                    cz1Var6.h.setText(TranscationStatusActivity.this.u1().b("label_challan_totals", TranscationStatusActivity.this.getString(R.string.total_challans)) + ' ' + TranscationStatusActivity.this.getAllChallanList().size());
                } else if (TranscationStatusActivity.this.getAllChallanList().size() == 0) {
                    cz1 cz1Var7 = TranscationStatusActivity.this.binding;
                    if (cz1Var7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        cz1Var7 = null;
                    }
                    cz1Var7.h.setText(TranscationStatusActivity.this.u1().b("label_challan_total", TranscationStatusActivity.this.getString(R.string.total_challan)) + " 0");
                } else {
                    cz1 cz1Var8 = TranscationStatusActivity.this.binding;
                    if (cz1Var8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        cz1Var8 = null;
                    }
                    cz1Var8.h.setText(TranscationStatusActivity.this.u1().b("label_challan_total", TranscationStatusActivity.this.getString(R.string.total_challan)) + ' ' + TranscationStatusActivity.this.getAllChallanList().size());
                }
                TranscationStatusActivity transcationStatusActivity2 = TranscationStatusActivity.this;
                transcationStatusActivity2.D1(transcationStatusActivity2.getAllChallanList());
                cz1 cz1Var9 = TranscationStatusActivity.this.binding;
                if (cz1Var9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cz1Var9 = null;
                }
                ProgressBar progressBar3 = cz1Var9.d;
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                if (progressBar3.getVisibility() == 0) {
                    cz1 cz1Var10 = TranscationStatusActivity.this.binding;
                    if (cz1Var10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        cz1Var10 = null;
                    }
                    cz1Var10.d.setVisibility(8);
                }
                TranscationStatusActivity.this.r1();
            } catch (Exception e) {
                e.printStackTrace();
                cz1 cz1Var11 = TranscationStatusActivity.this.binding;
                if (cz1Var11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cz1Var11 = null;
                }
                ProgressBar progressBar4 = cz1Var11.d;
                Intrinsics.checkNotNullExpressionValue(progressBar4, "progressBar");
                if (progressBar4.getVisibility() == 0) {
                    cz1 cz1Var12 = TranscationStatusActivity.this.binding;
                    if (cz1Var12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        cz1Var = cz1Var12;
                    }
                    cz1Var.d.setVisibility(8);
                }
                TranscationStatusActivity.this.r1();
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
            cz1 cz1Var = TranscationStatusActivity.this.binding;
            cz1 cz1Var2 = null;
            if (cz1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cz1Var = null;
            }
            ProgressBar progressBar = cz1Var.d;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                cz1 cz1Var3 = TranscationStatusActivity.this.binding;
                if (cz1Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    cz1Var2 = cz1Var3;
                }
                cz1Var2.d.setVisibility(8);
            }
            TranscationStatusActivity.this.r1();
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

    private final boolean B1() {
        Object systemService = getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    private final void C1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D1(List searchList) {
        yl6 yl6Var = this.adapter;
        if (yl6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            yl6Var = null;
        }
        yl6Var.A(searchList);
        yl6Var.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final boolean I1() {
        String strSubstring;
        cz1 cz1Var = this.binding;
        cz1 cz1Var2 = null;
        if (cz1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cz1Var = null;
        }
        String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(cz1Var.c.getText())).toString();
        char[] charArray = string.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        if (string.length() > 0) {
            cz1 cz1Var3 = this.binding;
            if (cz1Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cz1Var3 = null;
            }
            strSubstring = StringsKt__StringsKt.trim((CharSequence) String.valueOf(cz1Var3.c.getText())).toString().substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            strSubstring = "";
        }
        if (Intrinsics.areEqual(this.inputType, "Challan")) {
            if (string.length() == 0) {
                cz1 cz1Var4 = this.binding;
                if (cz1Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cz1Var4 = null;
                }
                cz1Var4.c.setError(getString(R.string.please_enter_challan_notice_no));
                cz1 cz1Var5 = this.binding;
                if (cz1Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    cz1Var2 = cz1Var5;
                }
                cz1Var2.c.requestFocus();
                return true;
            }
            Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(string);
            if (intOrNull != null) {
                if (intOrNull.intValue() < 5) {
                    cz1 cz1Var6 = this.binding;
                    if (cz1Var6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        cz1Var6 = null;
                    }
                    cz1Var6.c.setError(getString(R.string.enter_min_notice_no));
                    cz1 cz1Var7 = this.binding;
                    if (cz1Var7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        cz1Var2 = cz1Var7;
                    }
                    cz1Var2.c.requestFocus();
                    return true;
                }
            } else {
                if (!A1(strSubstring)) {
                    cz1 cz1Var8 = this.binding;
                    if (cz1Var8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        cz1Var8 = null;
                    }
                    cz1Var8.c.setError(u1().b("label_challan_enter_first_two_char_as_state", getString(R.string.please_enter_correct_challan_no)));
                    cz1 cz1Var9 = this.binding;
                    if (cz1Var9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        cz1Var2 = cz1Var9;
                    }
                    cz1Var2.c.requestFocus();
                    return true;
                }
                if (string.length() < 12) {
                    cz1 cz1Var10 = this.binding;
                    if (cz1Var10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        cz1Var10 = null;
                    }
                    cz1Var10.c.setError(u1().b("label_challan_min_length_validation", getString(R.string.min_length_challan_no)));
                    cz1 cz1Var11 = this.binding;
                    if (cz1Var11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        cz1Var2 = cz1Var11;
                    }
                    cz1Var2.c.requestFocus();
                    return true;
                }
                if (string.length() > 30) {
                    cz1 cz1Var12 = this.binding;
                    if (cz1Var12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        cz1Var12 = null;
                    }
                    cz1Var12.c.setError(u1().b("label_challan_max_length_validation", getString(R.string.max_length_challan_no)));
                    cz1 cz1Var13 = this.binding;
                    if (cz1Var13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        cz1Var2 = cz1Var13;
                    }
                    cz1Var2.c.requestFocus();
                    return true;
                }
            }
        } else if (Intrinsics.areEqual(this.inputType, "RC")) {
            if (string.length() == 0) {
                cz1 cz1Var14 = this.binding;
                if (cz1Var14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cz1Var14 = null;
                }
                cz1Var14.c.setError(u1().b("label_challan_please_enter_vehicle_no", getString(R.string.please_enter_vehicle_no)));
                cz1 cz1Var15 = this.binding;
                if (cz1Var15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    cz1Var2 = cz1Var15;
                }
                cz1Var2.c.requestFocus();
                return true;
            }
            int length = charArray.length;
            if (length >= 0 && length < 7) {
                cz1 cz1Var16 = this.binding;
                if (cz1Var16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cz1Var16 = null;
                }
                cz1Var16.c.setError(u1().b("label_challan_min_char_vehicle_no", getString(R.string.rc_min_valid)));
                cz1 cz1Var17 = this.binding;
                if (cz1Var17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    cz1Var2 = cz1Var17;
                }
                cz1Var2.c.requestFocus();
                return true;
            }
            if (string.length() > 10) {
                cz1 cz1Var18 = this.binding;
                if (cz1Var18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cz1Var18 = null;
                }
                cz1Var18.c.setError(u1().b("label_challan_rc_validation", getString(R.string.rc_text)));
                cz1 cz1Var19 = this.binding;
                if (cz1Var19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    cz1Var2 = cz1Var19;
                }
                cz1Var2.c.requestFocus();
                return true;
            }
            if (!new Regex("[a-zA-Z0-9]*").matches(string)) {
                cz1 cz1Var20 = this.binding;
                if (cz1Var20 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cz1Var20 = null;
                }
                cz1Var20.c.setError(u1().b("label_challan_invalid_vehicle_no", getString(R.string.invalid_rc_no)));
                cz1 cz1Var21 = this.binding;
                if (cz1Var21 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    cz1Var2 = cz1Var21;
                }
                cz1Var2.c.requestFocus();
                return true;
            }
        } else if (Intrinsics.areEqual(this.inputType, "DL")) {
            if (string.length() == 0) {
                cz1 cz1Var22 = this.binding;
                if (cz1Var22 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cz1Var22 = null;
                }
                cz1Var22.c.setError(u1().b("label_challan_valid_dl_no", getString(R.string.please_enter_valid_dl_number)));
                cz1 cz1Var23 = this.binding;
                if (cz1Var23 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    cz1Var2 = cz1Var23;
                }
                cz1Var2.c.requestFocus();
                return true;
            }
            if (string.length() < 10) {
                cz1 cz1Var24 = this.binding;
                if (cz1Var24 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cz1Var24 = null;
                }
                cz1Var24.c.setError(u1().b("label_challan_min_char_dl_validation", "Please enter minimum 10 characters of DL number"));
                cz1 cz1Var25 = this.binding;
                if (cz1Var25 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    cz1Var2 = cz1Var25;
                }
                cz1Var2.c.requestFocus();
                return true;
            }
        }
        return false;
    }

    private final void q1() {
        if (B1()) {
            t1();
        } else {
            G1(this, u1().b("error_msg_record_not_found", getString(R.string.service_unavable_please_try)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r1() {
        cz1 cz1Var = null;
        if (this.allChallanList.size() == 0) {
            cz1 cz1Var2 = this.binding;
            if (cz1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cz1Var2 = null;
            }
            cz1Var2.b.setVisibility(0);
            cz1 cz1Var3 = this.binding;
            if (cz1Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cz1Var3 = null;
            }
            cz1Var3.i.setVisibility(8);
            cz1 cz1Var4 = this.binding;
            if (cz1Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cz1Var = cz1Var4;
            }
            cz1Var.h.setVisibility(8);
            return;
        }
        cz1 cz1Var5 = this.binding;
        if (cz1Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cz1Var5 = null;
        }
        cz1Var5.b.setVisibility(8);
        cz1 cz1Var6 = this.binding;
        if (cz1Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cz1Var6 = null;
        }
        cz1Var6.i.setVisibility(0);
        cz1 cz1Var7 = this.binding;
        if (cz1Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cz1Var = cz1Var7;
        }
        cz1Var.h.setVisibility(0);
    }

    private final void t1() {
        fz1 fz1Var;
        cz1 cz1Var = null;
        try {
            cz1 cz1Var2 = this.binding;
            if (cz1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cz1Var2 = null;
            }
            cz1Var2.d.setVisibility(0);
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
            cz1 cz1Var3 = this.binding;
            if (cz1Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cz1Var3 = null;
            }
            ProgressBar progressBar = cz1Var3.d;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                cz1 cz1Var4 = this.binding;
                if (cz1Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    cz1Var = cz1Var4;
                }
                cz1Var.d.setVisibility(8);
            }
        }
    }

    private final void v1() {
        SearchChallanService searchChallanService = this.retrofitService;
        cz1 cz1Var = null;
        if (searchChallanService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            searchChallanService = null;
        }
        this.viewModel = (fz1) new z(this, new ez1(new dz1(searchChallanService))).a(fz1.class);
        cz1 cz1Var2 = this.binding;
        if (cz1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cz1Var2 = null;
        }
        cz1Var2.g.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tl6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TranscationStatusActivity.w1(this.a, view);
            }
        });
        cz1 cz1Var3 = this.binding;
        if (cz1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cz1Var3 = null;
        }
        cz1Var3.c.setKeyListener(DigitsKeyListener.getInstance(this.digit));
        cz1 cz1Var4 = this.binding;
        if (cz1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cz1Var4 = null;
        }
        cz1Var4.c.setRawInputType(ConstantsKt.DEFAULT_BLOCK_SIZE);
        cz1 cz1Var5 = this.binding;
        if (cz1Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cz1Var5 = null;
        }
        cz1Var5.g.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ul6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TranscationStatusActivity.x1(this.a, view);
            }
        });
        if (this.inputType.length() > 0) {
            String str = this.inputType;
            if (Intrinsics.areEqual(str, "Challan")) {
                cz1 cz1Var6 = this.binding;
                if (cz1Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cz1Var6 = null;
                }
                cz1Var6.c.setHint(getString(R.string.enter_challan_notice_no));
                cz1 cz1Var7 = this.binding;
                if (cz1Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cz1Var7 = null;
                }
                cz1Var7.h.setVisibility(8);
                cz1 cz1Var8 = this.binding;
                if (cz1Var8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cz1Var8 = null;
                }
                cz1Var8.c.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(30)});
            } else if (Intrinsics.areEqual(str, "RC")) {
                cz1 cz1Var9 = this.binding;
                if (cz1Var9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cz1Var9 = null;
                }
                cz1Var9.c.setHint(u1().b("label_challan_enter_vehicle_no", getString(R.string.enter_vehicle_number)));
                cz1 cz1Var10 = this.binding;
                if (cz1Var10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cz1Var10 = null;
                }
                cz1Var10.c.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(10)});
                cz1 cz1Var11 = this.binding;
                if (cz1Var11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cz1Var11 = null;
                }
                cz1Var11.h.setVisibility(0);
            } else {
                cz1 cz1Var12 = this.binding;
                if (cz1Var12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cz1Var12 = null;
                }
                cz1Var12.c.setHint(u1().b("label_challan_enter_dl_no", getString(R.string.enter_dl_number)));
                cz1 cz1Var13 = this.binding;
                if (cz1Var13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cz1Var13 = null;
                }
                cz1Var13.c.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(16)});
                cz1 cz1Var14 = this.binding;
                if (cz1Var14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cz1Var14 = null;
                }
                cz1Var14.h.setVisibility(0);
            }
        }
        if (this.inputValue.length() > 0) {
            cz1 cz1Var15 = this.binding;
            if (cz1Var15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cz1Var15 = null;
            }
            cz1Var15.c.setText(this.inputValue);
        }
        cz1 cz1Var16 = this.binding;
        if (cz1Var16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cz1Var16 = null;
        }
        cz1Var16.i.setLayoutManager(new LinearLayoutManager(this));
        this.adapter = new yl6(this, new ArrayList(), u1());
        cz1 cz1Var17 = this.binding;
        if (cz1Var17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cz1Var17 = null;
        }
        cz1Var17.i.setNestedScrollingEnabled(false);
        cz1 cz1Var18 = this.binding;
        if (cz1Var18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cz1Var18 = null;
        }
        RecyclerView recyclerView = cz1Var18.i;
        yl6 yl6Var = this.adapter;
        if (yl6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            yl6Var = null;
        }
        recyclerView.setAdapter(yl6Var);
        cz1 cz1Var19 = this.binding;
        if (cz1Var19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cz1Var19 = null;
        }
        cz1Var19.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vl6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TranscationStatusActivity.y1(this.a, view);
            }
        });
        cz1 cz1Var20 = this.binding;
        if (cz1Var20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cz1Var20 = null;
        }
        cz1Var20.c.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zepto.wl6
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return TranscationStatusActivity.z1(this.a, textView, i, keyEvent);
            }
        });
        cz1 cz1Var21 = this.binding;
        if (cz1Var21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cz1Var = cz1Var21;
        }
        cz1Var.c.addTextChangedListener(this.inputTextWatcher);
    }

    public static final void w1(TranscationStatusActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void x1(TranscationStatusActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.C1();
    }

    public static final void y1(TranscationStatusActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        cz1 cz1Var = this$0.binding;
        cz1 cz1Var2 = null;
        if (cz1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cz1Var = null;
        }
        String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(cz1Var.c.getText())).toString();
        if (!this$0.I1()) {
            this$0.inputValue = string;
            this$0.allChallanList.clear();
            this$0.q1();
            return;
        }
        String str = this$0.inputType;
        if (Intrinsics.areEqual(str, "Challan")) {
            cz1 cz1Var3 = this$0.binding;
            if (cz1Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cz1Var3 = null;
            }
            cz1Var3.c.setError(this$0.u1().b("label_challan_please_enter_challan_no", this$0.getString(R.string.please_enter_challan_no)));
            cz1 cz1Var4 = this$0.binding;
            if (cz1Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cz1Var2 = cz1Var4;
            }
            cz1Var2.c.requestFocus();
            return;
        }
        if (Intrinsics.areEqual(str, "RC")) {
            cz1 cz1Var5 = this$0.binding;
            if (cz1Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cz1Var5 = null;
            }
            cz1Var5.c.setError(this$0.u1().b("label_challan_please_enter_vehicle_no", this$0.getString(R.string.please_enter_vehicle_no)));
            cz1 cz1Var6 = this$0.binding;
            if (cz1Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cz1Var2 = cz1Var6;
            }
            cz1Var2.c.requestFocus();
            return;
        }
        cz1 cz1Var7 = this$0.binding;
        if (cz1Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cz1Var7 = null;
        }
        cz1Var7.c.setError(this$0.u1().b("label_challan_valid_dl_no", this$0.getString(R.string.please_enter_valid_dl_number)));
        cz1 cz1Var8 = this$0.binding;
        if (cz1Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cz1Var2 = cz1Var8;
        }
        cz1Var2.c.requestFocus();
    }

    public static final boolean z1(TranscationStatusActivity this$0, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i != 6) {
            return false;
        }
        cz1 cz1Var = this$0.binding;
        cz1 cz1Var2 = null;
        if (cz1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cz1Var = null;
        }
        String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(cz1Var.c.getText())).toString();
        if (!this$0.I1()) {
            this$0.inputValue = string;
            this$0.allChallanList.clear();
            this$0.q1();
            return true;
        }
        String str = this$0.inputType;
        if (Intrinsics.areEqual(str, "Challan")) {
            cz1 cz1Var3 = this$0.binding;
            if (cz1Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cz1Var3 = null;
            }
            cz1Var3.c.setError(this$0.u1().b("label_challan_please_enter_challan_no", this$0.getString(R.string.please_enter_challan_no)));
            cz1 cz1Var4 = this$0.binding;
            if (cz1Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cz1Var2 = cz1Var4;
            }
            cz1Var2.c.requestFocus();
        } else if (Intrinsics.areEqual(str, "RC")) {
            cz1 cz1Var5 = this$0.binding;
            if (cz1Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cz1Var5 = null;
            }
            cz1Var5.c.setError(this$0.u1().b("label_challan_please_enter_vehicle_no", this$0.getString(R.string.please_enter_vehicle_no)));
            cz1 cz1Var6 = this$0.binding;
            if (cz1Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cz1Var2 = cz1Var6;
            }
            cz1Var2.c.requestFocus();
        } else {
            cz1 cz1Var7 = this$0.binding;
            if (cz1Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cz1Var7 = null;
            }
            cz1Var7.c.setError(this$0.u1().b("label_challan_valid_dl_no", this$0.getString(R.string.please_enter_valid_dl_number)));
            cz1 cz1Var8 = this$0.binding;
            if (cz1Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cz1Var2 = cz1Var8;
            }
            cz1Var2.c.requestFocus();
        }
        return true;
    }

    public final boolean A1(String string) {
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

    public final void E1(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.allChallanList = arrayList;
    }

    public final void F1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void G1(Context context, String message) {
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
        textView.setText(u1().b("label_challan_ok_dialog_text", getString(R.string.ok_txt)));
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(u1().b("nex_parivahan", getString(R.string.app_name)));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xl6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TranscationStatusActivity.H1(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cz1 cz1VarC = cz1.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(cz1VarC, "inflate(...)");
        this.binding = cz1VarC;
        fz1 fz1Var = null;
        if (cz1VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cz1VarC = null;
        }
        setContentView(cz1VarC.b());
        F1(new wa3(this));
        az1.a aVar = az1.a;
        cz1 cz1Var = this.binding;
        if (cz1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cz1Var = null;
        }
        aVar.k(this, cz1Var);
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
        v1();
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

    /* JADX INFO: renamed from: s1, reason: from getter */
    public final ArrayList getAllChallanList() {
        return this.allChallanList;
    }

    public final wa3 u1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }
}
