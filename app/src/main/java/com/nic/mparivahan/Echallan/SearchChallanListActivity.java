package com.nic.mparivahan.Echallan;

import android.app.Dialog;
import android.app.ProgressDialog;
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
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Echallan.Echallan.Model.ChallanListModal;
import com.nic.mparivahan.Echallan.Echallan.Model.ChallanListResultModal;
import com.nic.mparivahan.Echallan.Networking.SearchChallanService;
import com.nic.mparivahan.Echallan.SearchChallanListActivity;
import com.nic.mparivahan.R;
import com.zepto.az1;
import com.zepto.dz1;
import com.zepto.ez1;
import com.zepto.fz1;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.sq5;
import com.zepto.tp5;
import com.zepto.wa3;
import com.zepto.yy0;
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
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0003J\u0016\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003J\u0016\u0010\t\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0003J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\u0012\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0015J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u000eR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010%\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010)\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\"\u0010-\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$R\"\u00101\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010 \u001a\u0004\b/\u0010\"\"\u0004\b0\u0010$R2\u0010:\u001a\u0012\u0012\u0004\u0012\u00020\u000602j\b\u0012\u0004\u0012\u00020\u0006`38\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R2\u0010>\u001a\u0012\u0012\u0004\u0012\u00020\u000602j\b\u0012\u0004\u0012\u00020\u0006`38\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u00105\u001a\u0004\b<\u00107\"\u0004\b=\u00109R2\u0010B\u001a\u0012\u0012\u0004\u0012\u00020\u000602j\b\u0012\u0004\u0012\u00020\u0006`38\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u00105\u001a\u0004\b@\u00107\"\u0004\bA\u00109R\"\u0010I\u001a\u00020C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010;\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010M\u001a\u00020C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010;\u001a\u0004\bK\u0010F\"\u0004\bL\u0010HR\"\u0010Q\u001a\u00020C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010;\u001a\u0004\bO\u0010F\"\u0004\bP\u0010HR\"\u0010U\u001a\u00020C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010;\u001a\u0004\bS\u0010F\"\u0004\bT\u0010HR\u0014\u0010W\u001a\u00020\u000e8\u0002X\u0082D¢\u0006\u0006\n\u0004\bV\u0010 R\"\u0010[\u001a\u00020C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010;\u001a\u0004\bY\u0010F\"\u0004\bZ\u0010HR\"\u0010_\u001a\u00020C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010;\u001a\u0004\b]\u0010F\"\u0004\b^\u0010HR\"\u0010b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0016\u0010i\u001a\u00020f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bg\u0010hR\"\u0010q\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u0016\u0010u\u001a\u00020r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010y\u001a\u00020v8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010}\u001a\u00020z8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010\u0081\u0001\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001¨\u0006\u0084\u0001"}, d2 = {"Lcom/nic/mparivahan/Echallan/SearchChallanListActivity;", "Lcom/zepto/pq;", "", "z1", "G1", "", "Lcom/nic/mparivahan/Echallan/Echallan/Model/ChallanListResultModal;", "searchList", "T1", "v1", "", "P1", "w1", "d2", "", "string", "O1", "x1", "S1", "Q1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "message", "b2", "Lcom/zepto/tp5;", "C", "Lcom/zepto/tp5;", "adapter", "D", "Ljava/lang/String;", "getInputValue", "()Ljava/lang/String;", "setInputValue", "(Ljava/lang/String;)V", "inputValue", "E", "getInputType", "setInputType", "inputType", "F", "getEngineNo", "setEngineNo", "engineNo", "G", "getChassisNo", "setChassisNo", "chassisNo", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "H", "Ljava/util/ArrayList;", "E1", "()Ljava/util/ArrayList;", "setPendingsearchList", "(Ljava/util/ArrayList;)V", "pendingsearchList", "I", "B1", "setDisposeChallanList", "disposeChallanList", "J", "y1", "U1", "allChallanList", "", "K", "F1", "()I", "setTabClicked", "(I)V", "tabClicked", "L", "A1", "V1", "allTotalChallan", "M", "getPendingTotalChallan", "Z1", "pendingTotalChallan", "N", "getDisposeTotalChallan", "W1", "disposeTotalChallan", "O", "digit", "P", "D1", "setOffsetValue", "offsetValue", "Q", "getTotalPageOffsetValue", "a2", "totalPageOffsetValue", "R", "Z", "isLoading", "()Z", "Y1", "(Z)V", "Lcom/zepto/sq5;", "S", "Lcom/zepto/sq5;", "binding", "Lcom/zepto/wa3;", "T", "Lcom/zepto/wa3;", "C1", "()Lcom/zepto/wa3;", "X1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/nic/mparivahan/Echallan/Networking/SearchChallanService;", "U", "Lcom/nic/mparivahan/Echallan/Networking/SearchChallanService;", "retrofitService", "Lcom/zepto/fz1;", "V", "Lcom/zepto/fz1;", "viewModel", "Landroid/app/ProgressDialog;", "W", "Landroid/app/ProgressDialog;", "progressDialog", "Landroid/text/TextWatcher;", "X", "Landroid/text/TextWatcher;", "inputTextWatcher", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSearchChallanListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchChallanListActivity.kt\ncom/nic/mparivahan/Echallan/SearchChallanListActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,832:1\n260#2:833\n260#2:834\n*S KotlinDebug\n*F\n+ 1 SearchChallanListActivity.kt\ncom/nic/mparivahan/Echallan/SearchChallanListActivity\n*L\n208#1:833\n539#1:834\n*E\n"})
public final class SearchChallanListActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public tp5 adapter;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public int tabClicked;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public int allTotalChallan;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public int pendingTotalChallan;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public int disposeTotalChallan;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public boolean isLoading;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public sq5 binding;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public SearchChallanService retrofitService;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public fz1 viewModel;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public ProgressDialog progressDialog;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String inputValue = "";

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String inputType = "";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String engineNo = "";

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String chassisNo = "";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ArrayList pendingsearchList = new ArrayList();

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ArrayList disposeChallanList = new ArrayList();

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ArrayList allChallanList = new ArrayList();

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public final String digit = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public int offsetValue = 1;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public int totalPageOffsetValue = 1;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
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
            sq5 sq5Var = SearchChallanListActivity.this.binding;
            if (sq5Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var = null;
            }
            sq5Var.g.setError(null);
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
            sq5 sq5Var = null;
            try {
                Intrinsics.checkNotNull(challanListModal);
                if (challanListModal.getStatus() != 200) {
                    if (challanListModal.getStatus() == 404) {
                        sq5 sq5Var2 = SearchChallanListActivity.this.binding;
                        if (sq5Var2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            sq5Var2 = null;
                        }
                        ProgressBar progressBar = sq5Var2.i;
                        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                        if (progressBar.getVisibility() == 0) {
                            sq5 sq5Var3 = SearchChallanListActivity.this.binding;
                            if (sq5Var3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                sq5Var3 = null;
                            }
                            sq5Var3.i.setVisibility(8);
                        }
                        SearchChallanListActivity.this.getAllChallanList().clear();
                        if (SearchChallanListActivity.this.getTabClicked() == 0) {
                            SearchChallanListActivity.this.x1();
                            SearchChallanListActivity searchChallanListActivity = SearchChallanListActivity.this;
                            searchChallanListActivity.b2(searchChallanListActivity, challanListModal.getMessage());
                            return;
                        }
                        return;
                    }
                    sq5 sq5Var4 = SearchChallanListActivity.this.binding;
                    if (sq5Var4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        sq5Var4 = null;
                    }
                    ProgressBar progressBar2 = sq5Var4.i;
                    Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                    if (progressBar2.getVisibility() == 0) {
                        sq5 sq5Var5 = SearchChallanListActivity.this.binding;
                        if (sq5Var5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            sq5Var5 = null;
                        }
                        sq5Var5.i.setVisibility(8);
                    }
                    SearchChallanListActivity.this.getAllChallanList().clear();
                    if (SearchChallanListActivity.this.getTabClicked() == 0) {
                        SearchChallanListActivity.this.x1();
                        SearchChallanListActivity searchChallanListActivity2 = SearchChallanListActivity.this;
                        searchChallanListActivity2.b2(searchChallanListActivity2, searchChallanListActivity2.C1().b("error_msg_record_not_found", SearchChallanListActivity.this.getString(R.string.service_unavable_please_try)));
                        return;
                    }
                    return;
                }
                SearchChallanListActivity.this.U1(challanListModal.getResult());
                SearchChallanListActivity searchChallanListActivity3 = SearchChallanListActivity.this;
                searchChallanListActivity3.V1(searchChallanListActivity3.getAllChallanList().size());
                if (challanListModal.getTotalChallan() > 20) {
                    SearchChallanListActivity.this.a2(challanListModal.getTotalChallan() / SearchChallanListActivity.this.getAllChallanList().size());
                }
                int size = SearchChallanListActivity.this.getAllChallanList().size();
                for (int i = 0; i < size; i++) {
                    if (StringsKt__StringsJVMKt.equals(((ChallanListResultModal) SearchChallanListActivity.this.getAllChallanList().get(i)).getStatus(), "Pending", true)) {
                        SearchChallanListActivity.this.getPendingsearchList().add(SearchChallanListActivity.this.getAllChallanList().get(i));
                    } else if (StringsKt__StringsJVMKt.equals(((ChallanListResultModal) SearchChallanListActivity.this.getAllChallanList().get(i)).getStatus(), "Disposed", true)) {
                        SearchChallanListActivity.this.getDisposeChallanList().add(SearchChallanListActivity.this.getAllChallanList().get(i));
                    }
                }
                if (SearchChallanListActivity.this.getPendingsearchList().size() > 0) {
                    SearchChallanListActivity searchChallanListActivity4 = SearchChallanListActivity.this;
                    searchChallanListActivity4.Z1(searchChallanListActivity4.getPendingsearchList().size());
                }
                if (SearchChallanListActivity.this.getDisposeChallanList().size() > 0) {
                    SearchChallanListActivity searchChallanListActivity5 = SearchChallanListActivity.this;
                    searchChallanListActivity5.W1(searchChallanListActivity5.getDisposeChallanList().size());
                }
                if (SearchChallanListActivity.this.getTabClicked() == 0) {
                    if (SearchChallanListActivity.this.getAllTotalChallan() > 1) {
                        sq5 sq5Var6 = SearchChallanListActivity.this.binding;
                        if (sq5Var6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            sq5Var6 = null;
                        }
                        sq5Var6.n.setText(SearchChallanListActivity.this.C1().b("label_challan_totals", SearchChallanListActivity.this.getString(R.string.total_challans)) + ' ' + SearchChallanListActivity.this.getAllTotalChallan());
                    } else if (SearchChallanListActivity.this.getAllTotalChallan() == 0) {
                        sq5 sq5Var7 = SearchChallanListActivity.this.binding;
                        if (sq5Var7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            sq5Var7 = null;
                        }
                        sq5Var7.n.setText(SearchChallanListActivity.this.C1().b("label_challan_total", SearchChallanListActivity.this.getString(R.string.total_challan)) + " 0");
                    } else {
                        sq5 sq5Var8 = SearchChallanListActivity.this.binding;
                        if (sq5Var8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            sq5Var8 = null;
                        }
                        sq5Var8.n.setText(SearchChallanListActivity.this.C1().b("label_challan_total", SearchChallanListActivity.this.getString(R.string.total_challan)) + ' ' + SearchChallanListActivity.this.getAllTotalChallan());
                    }
                    if (SearchChallanListActivity.this.getOffsetValue() == 1) {
                        SearchChallanListActivity searchChallanListActivity6 = SearchChallanListActivity.this;
                        searchChallanListActivity6.T1(searchChallanListActivity6.getAllChallanList());
                    } else {
                        SearchChallanListActivity searchChallanListActivity7 = SearchChallanListActivity.this;
                        searchChallanListActivity7.v1(searchChallanListActivity7.getAllChallanList());
                    }
                }
                SearchChallanListActivity.this.Y1(false);
                sq5 sq5Var9 = SearchChallanListActivity.this.binding;
                if (sq5Var9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    sq5Var9 = null;
                }
                ProgressBar progressBar3 = sq5Var9.i;
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                if (progressBar3.getVisibility() == 0) {
                    sq5 sq5Var10 = SearchChallanListActivity.this.binding;
                    if (sq5Var10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        sq5Var10 = null;
                    }
                    sq5Var10.i.setVisibility(8);
                }
                if (SearchChallanListActivity.this.getTabClicked() == 0) {
                    SearchChallanListActivity.this.x1();
                }
            } catch (Exception e) {
                e.printStackTrace();
                sq5 sq5Var11 = SearchChallanListActivity.this.binding;
                if (sq5Var11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    sq5Var11 = null;
                }
                ProgressBar progressBar4 = sq5Var11.i;
                Intrinsics.checkNotNullExpressionValue(progressBar4, "progressBar");
                if (progressBar4.getVisibility() == 0) {
                    sq5 sq5Var12 = SearchChallanListActivity.this.binding;
                    if (sq5Var12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        sq5Var = sq5Var12;
                    }
                    sq5Var.i.setVisibility(8);
                }
                SearchChallanListActivity.this.getAllChallanList().clear();
                if (SearchChallanListActivity.this.getTabClicked() == 0) {
                    SearchChallanListActivity.this.x1();
                    SearchChallanListActivity searchChallanListActivity8 = SearchChallanListActivity.this;
                    searchChallanListActivity8.b2(searchChallanListActivity8, searchChallanListActivity8.C1().b("error_msg_record_not_found", SearchChallanListActivity.this.getString(R.string.service_unavable_please_try)));
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
            sq5 sq5Var = SearchChallanListActivity.this.binding;
            sq5 sq5Var2 = null;
            if (sq5Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var = null;
            }
            ProgressBar progressBar = sq5Var.i;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                sq5 sq5Var3 = SearchChallanListActivity.this.binding;
                if (sq5Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    sq5Var2 = sq5Var3;
                }
                sq5Var2.i.setVisibility(8);
            }
            SearchChallanListActivity.this.getAllChallanList().clear();
            SearchChallanListActivity.this.getDisposeChallanList().clear();
            SearchChallanListActivity.this.getPendingsearchList().clear();
            if (SearchChallanListActivity.this.getTabClicked() == 0) {
                SearchChallanListActivity.this.x1();
                SearchChallanListActivity searchChallanListActivity = SearchChallanListActivity.this;
                searchChallanListActivity.b2(searchChallanListActivity, searchChallanListActivity.C1().b("error_msg_record_not_found", SearchChallanListActivity.this.getString(R.string.service_unavable_please_try)));
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

    private final void G1() {
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.progressDialog = progressDialog;
        progressDialog.setMessage("Please wait");
        ProgressDialog progressDialog2 = this.progressDialog;
        sq5 sq5Var = null;
        if (progressDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
            progressDialog2 = null;
        }
        progressDialog2.setCanceledOnTouchOutside(false);
        ProgressDialog progressDialog3 = this.progressDialog;
        if (progressDialog3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
            progressDialog3 = null;
        }
        progressDialog3.setCancelable(false);
        SearchChallanService searchChallanService = this.retrofitService;
        if (searchChallanService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            searchChallanService = null;
        }
        this.viewModel = (fz1) new z(this, new ez1(new dz1(searchChallanService))).a(fz1.class);
        sq5 sq5Var2 = this.binding;
        if (sq5Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var2 = null;
        }
        sq5Var2.g.setKeyListener(DigitsKeyListener.getInstance(this.digit));
        sq5 sq5Var3 = this.binding;
        if (sq5Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var3 = null;
        }
        sq5Var3.g.setRawInputType(ConstantsKt.DEFAULT_BLOCK_SIZE);
        sq5 sq5Var4 = this.binding;
        if (sq5Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var4 = null;
        }
        sq5Var4.c.setNestedScrollingEnabled(false);
        if (this.inputType.length() > 0) {
            String str = this.inputType;
            if (Intrinsics.areEqual(str, "Challan")) {
                sq5 sq5Var5 = this.binding;
                if (sq5Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    sq5Var5 = null;
                }
                sq5Var5.g.setHint(getString(R.string.enter_challan_notice_no));
                sq5 sq5Var6 = this.binding;
                if (sq5Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    sq5Var6 = null;
                }
                sq5Var6.g.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(30)});
                sq5 sq5Var7 = this.binding;
                if (sq5Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    sq5Var7 = null;
                }
                sq5Var7.k.setVisibility(8);
                sq5 sq5Var8 = this.binding;
                if (sq5Var8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    sq5Var8 = null;
                }
                sq5Var8.n.setVisibility(8);
            } else if (Intrinsics.areEqual(str, "RC")) {
                sq5 sq5Var9 = this.binding;
                if (sq5Var9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    sq5Var9 = null;
                }
                sq5Var9.g.setHint(C1().b("label_challan_enter_vehicle_no", getString(R.string.enter_vehicle_number)));
                sq5 sq5Var10 = this.binding;
                if (sq5Var10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    sq5Var10 = null;
                }
                sq5Var10.g.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(10)});
                sq5 sq5Var11 = this.binding;
                if (sq5Var11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    sq5Var11 = null;
                }
                sq5Var11.k.setVisibility(0);
                sq5 sq5Var12 = this.binding;
                if (sq5Var12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    sq5Var12 = null;
                }
                sq5Var12.n.setVisibility(0);
            } else {
                sq5 sq5Var13 = this.binding;
                if (sq5Var13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    sq5Var13 = null;
                }
                sq5Var13.g.setHint(C1().b("label_challan_enter_dl_no", getString(R.string.enter_dl_number)));
                sq5 sq5Var14 = this.binding;
                if (sq5Var14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    sq5Var14 = null;
                }
                sq5Var14.g.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(18)});
                sq5 sq5Var15 = this.binding;
                if (sq5Var15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    sq5Var15 = null;
                }
                sq5Var15.k.setVisibility(0);
                sq5 sq5Var16 = this.binding;
                if (sq5Var16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    sq5Var16 = null;
                }
                sq5Var16.n.setVisibility(0);
            }
        }
        if (this.inputValue.length() > 0) {
            sq5 sq5Var17 = this.binding;
            if (sq5Var17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var17 = null;
            }
            sq5Var17.g.setText(this.inputValue);
        }
        sq5 sq5Var18 = this.binding;
        if (sq5Var18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var18 = null;
        }
        sq5Var18.c.setLayoutManager(new LinearLayoutManager(this));
        this.adapter = new tp5(this, new ArrayList(), 0, this.inputType, C1(), this.chassisNo);
        sq5 sq5Var19 = this.binding;
        if (sq5Var19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var19 = null;
        }
        RecyclerView recyclerView = sq5Var19.c;
        tp5 tp5Var = this.adapter;
        if (tp5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            tp5Var = null;
        }
        recyclerView.setAdapter(tp5Var);
        sq5 sq5Var20 = this.binding;
        if (sq5Var20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var20 = null;
        }
        sq5Var20.m.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zp5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchChallanListActivity.H1(this.a, view);
            }
        });
        sq5 sq5Var21 = this.binding;
        if (sq5Var21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var21 = null;
        }
        sq5Var21.m.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.aq5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchChallanListActivity.I1(this.a, view);
            }
        });
        sq5 sq5Var22 = this.binding;
        if (sq5Var22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var22 = null;
        }
        sq5Var22.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bq5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchChallanListActivity.J1(this.a, view);
            }
        });
        sq5 sq5Var23 = this.binding;
        if (sq5Var23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var23 = null;
        }
        sq5Var23.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cq5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchChallanListActivity.K1(this.a, view);
            }
        });
        sq5 sq5Var24 = this.binding;
        if (sq5Var24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var24 = null;
        }
        sq5Var24.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dq5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchChallanListActivity.L1(this.a, view);
            }
        });
        sq5 sq5Var25 = this.binding;
        if (sq5Var25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var25 = null;
        }
        sq5Var25.j.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.eq5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchChallanListActivity.M1(this.a, view);
            }
        });
        sq5 sq5Var26 = this.binding;
        if (sq5Var26 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var26 = null;
        }
        sq5Var26.g.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zepto.fq5
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return SearchChallanListActivity.N1(this.a, textView, i, keyEvent);
            }
        });
        sq5 sq5Var27 = this.binding;
        if (sq5Var27 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            sq5Var = sq5Var27;
        }
        sq5Var.g.addTextChangedListener(this.inputTextWatcher);
        Q1();
    }

    public static final void H1(SearchChallanListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void I1(SearchChallanListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.S1();
    }

    public static final void J1(SearchChallanListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ProgressDialog progressDialog = this$0.progressDialog;
        ProgressDialog progressDialog2 = null;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
            progressDialog = null;
        }
        progressDialog.show();
        this$0.tabClicked = 0;
        this$0.offsetValue = 1;
        this$0.totalPageOffsetValue = 1;
        sq5 sq5Var = this$0.binding;
        if (sq5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var = null;
        }
        sq5Var.b.setBackground(yy0.e(this$0, R.drawable.rectangle_bg_15_with_two_corner));
        sq5 sq5Var2 = this$0.binding;
        if (sq5Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var2 = null;
        }
        sq5Var2.h.setBackground(yy0.e(this$0, R.drawable.rectanlge_without_corner_unselected));
        sq5 sq5Var3 = this$0.binding;
        if (sq5Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var3 = null;
        }
        sq5Var3.d.setBackground(yy0.e(this$0, R.drawable.rectangle_bg_two_corner_right));
        sq5 sq5Var4 = this$0.binding;
        if (sq5Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var4 = null;
        }
        sq5Var4.b.setTextColor(yy0.c(this$0, R.color.white));
        sq5 sq5Var5 = this$0.binding;
        if (sq5Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var5 = null;
        }
        sq5Var5.d.setTextColor(yy0.c(this$0, R.color.dove_grey));
        sq5 sq5Var6 = this$0.binding;
        if (sq5Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var6 = null;
        }
        sq5Var6.h.setTextColor(yy0.c(this$0, R.color.dove_grey));
        int i = this$0.allTotalChallan;
        if (i > 1) {
            sq5 sq5Var7 = this$0.binding;
            if (sq5Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var7 = null;
            }
            sq5Var7.n.setText(this$0.C1().b("label_challan_totals", this$0.getString(R.string.total_challans)) + ' ' + this$0.allTotalChallan);
        } else if (i == 0) {
            sq5 sq5Var8 = this$0.binding;
            if (sq5Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var8 = null;
            }
            sq5Var8.n.setText(this$0.C1().b("label_challan_total", this$0.getString(R.string.total_challan)) + " 0");
        } else {
            sq5 sq5Var9 = this$0.binding;
            if (sq5Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var9 = null;
            }
            sq5Var9.n.setText(this$0.C1().b("label_challan_total", this$0.getString(R.string.total_challan)) + ' ' + this$0.allTotalChallan);
        }
        tp5 tp5Var = this$0.adapter;
        if (tp5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            tp5Var = null;
        }
        tp5Var.G(this$0.allChallanList);
        ProgressDialog progressDialog3 = this$0.progressDialog;
        if (progressDialog3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
            progressDialog3 = null;
        }
        if (progressDialog3.isShowing()) {
            ProgressDialog progressDialog4 = this$0.progressDialog;
            if (progressDialog4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
            } else {
                progressDialog2 = progressDialog4;
            }
            progressDialog2.dismiss();
        }
    }

    public static final void K1(SearchChallanListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ProgressDialog progressDialog = this$0.progressDialog;
        ProgressDialog progressDialog2 = null;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
            progressDialog = null;
        }
        progressDialog.show();
        this$0.tabClicked = 1;
        this$0.offsetValue = 1;
        this$0.totalPageOffsetValue = 1;
        sq5 sq5Var = this$0.binding;
        if (sq5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var = null;
        }
        sq5Var.b.setBackground(yy0.e(this$0, R.drawable.rectangle_bg_two_corner_left_crystal_white));
        sq5 sq5Var2 = this$0.binding;
        if (sq5Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var2 = null;
        }
        sq5Var2.h.setBackground(yy0.e(this$0, R.drawable.rectangle_without_corner_selected));
        sq5 sq5Var3 = this$0.binding;
        if (sq5Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var3 = null;
        }
        sq5Var3.d.setBackground(yy0.e(this$0, R.drawable.rectangle_bg_two_corner_right));
        sq5 sq5Var4 = this$0.binding;
        if (sq5Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var4 = null;
        }
        sq5Var4.h.setTextColor(yy0.c(this$0, R.color.white));
        sq5 sq5Var5 = this$0.binding;
        if (sq5Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var5 = null;
        }
        sq5Var5.d.setTextColor(yy0.c(this$0, R.color.dove_grey));
        sq5 sq5Var6 = this$0.binding;
        if (sq5Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var6 = null;
        }
        sq5Var6.b.setTextColor(yy0.c(this$0, R.color.dove_grey));
        int i = this$0.pendingTotalChallan;
        if (i > 1) {
            sq5 sq5Var7 = this$0.binding;
            if (sq5Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var7 = null;
            }
            sq5Var7.n.setText(this$0.C1().b("label_challan_totals", this$0.getString(R.string.total_challans)) + ' ' + this$0.pendingTotalChallan);
        } else if (i == 0) {
            sq5 sq5Var8 = this$0.binding;
            if (sq5Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var8 = null;
            }
            sq5Var8.n.setText(this$0.C1().b("label_challan_total", this$0.getString(R.string.total_challan)) + " 0");
        } else {
            sq5 sq5Var9 = this$0.binding;
            if (sq5Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var9 = null;
            }
            sq5Var9.n.setText(this$0.C1().b("label_challan_total", this$0.getString(R.string.total_challan)) + ' ' + this$0.pendingTotalChallan);
        }
        tp5 tp5Var = this$0.adapter;
        if (tp5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            tp5Var = null;
        }
        tp5Var.G(this$0.pendingsearchList);
        ProgressDialog progressDialog3 = this$0.progressDialog;
        if (progressDialog3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
            progressDialog3 = null;
        }
        if (progressDialog3.isShowing()) {
            ProgressDialog progressDialog4 = this$0.progressDialog;
            if (progressDialog4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
            } else {
                progressDialog2 = progressDialog4;
            }
            progressDialog2.dismiss();
        }
    }

    public static final void L1(SearchChallanListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ProgressDialog progressDialog = this$0.progressDialog;
        ProgressDialog progressDialog2 = null;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
            progressDialog = null;
        }
        progressDialog.show();
        this$0.tabClicked = 2;
        this$0.offsetValue = 1;
        this$0.totalPageOffsetValue = 1;
        sq5 sq5Var = this$0.binding;
        if (sq5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var = null;
        }
        sq5Var.d.setBackground(yy0.e(this$0, R.drawable.rectangle_bg_15_right_dodger_blue));
        sq5 sq5Var2 = this$0.binding;
        if (sq5Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var2 = null;
        }
        sq5Var2.b.setBackground(yy0.e(this$0, R.drawable.rectangle_bg_two_corner_left_crystal_white));
        sq5 sq5Var3 = this$0.binding;
        if (sq5Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var3 = null;
        }
        sq5Var3.h.setBackground(yy0.e(this$0, R.drawable.rectangle_without_corner_left_unselected));
        sq5 sq5Var4 = this$0.binding;
        if (sq5Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var4 = null;
        }
        sq5Var4.b.setTextColor(yy0.c(this$0, R.color.dove_grey));
        sq5 sq5Var5 = this$0.binding;
        if (sq5Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var5 = null;
        }
        sq5Var5.h.setTextColor(yy0.c(this$0, R.color.dove_grey));
        sq5 sq5Var6 = this$0.binding;
        if (sq5Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var6 = null;
        }
        sq5Var6.d.setTextColor(yy0.c(this$0, R.color.white));
        int i = this$0.disposeTotalChallan;
        if (i > 1) {
            sq5 sq5Var7 = this$0.binding;
            if (sq5Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var7 = null;
            }
            sq5Var7.n.setText(this$0.C1().b("label_challan_totals", this$0.getString(R.string.total_challans)) + ' ' + this$0.disposeTotalChallan);
        } else if (i == 0) {
            sq5 sq5Var8 = this$0.binding;
            if (sq5Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var8 = null;
            }
            sq5Var8.n.setText(this$0.C1().b("label_challan_total", this$0.getString(R.string.total_challan)) + " 0");
        } else {
            sq5 sq5Var9 = this$0.binding;
            if (sq5Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var9 = null;
            }
            sq5Var9.n.setText(this$0.C1().b("label_challan_total", this$0.getString(R.string.total_challan)) + ' ' + this$0.disposeTotalChallan);
        }
        tp5 tp5Var = this$0.adapter;
        if (tp5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            tp5Var = null;
        }
        tp5Var.G(this$0.disposeChallanList);
        ProgressDialog progressDialog3 = this$0.progressDialog;
        if (progressDialog3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
            progressDialog3 = null;
        }
        if (progressDialog3.isShowing()) {
            ProgressDialog progressDialog4 = this$0.progressDialog;
            if (progressDialog4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
            } else {
                progressDialog2 = progressDialog4;
            }
            progressDialog2.dismiss();
        }
    }

    public static final void M1(SearchChallanListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        sq5 sq5Var = this$0.binding;
        sq5 sq5Var2 = null;
        if (sq5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var = null;
        }
        String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(sq5Var.g.getText())).toString();
        if (!this$0.d2()) {
            if (Intrinsics.areEqual(this$0.inputType, "RC")) {
                this$0.onBackPressed();
                return;
            }
            this$0.inputValue = string;
            this$0.disposeChallanList.clear();
            this$0.pendingsearchList.clear();
            this$0.allChallanList.clear();
            this$0.offsetValue = 1;
            this$0.totalPageOffsetValue = 1;
            this$0.allTotalChallan = 0;
            this$0.pendingTotalChallan = 0;
            this$0.disposeTotalChallan = 0;
            this$0.w1();
            return;
        }
        String str = this$0.inputType;
        if (Intrinsics.areEqual(str, "Challan")) {
            sq5 sq5Var3 = this$0.binding;
            if (sq5Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var3 = null;
            }
            sq5Var3.g.setError(this$0.C1().b("label_challan_please_enter_challan_no", this$0.getString(R.string.please_enter_challan_no)));
            sq5 sq5Var4 = this$0.binding;
            if (sq5Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                sq5Var2 = sq5Var4;
            }
            sq5Var2.g.requestFocus();
            return;
        }
        if (Intrinsics.areEqual(str, "RC")) {
            sq5 sq5Var5 = this$0.binding;
            if (sq5Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var5 = null;
            }
            sq5Var5.g.setError(this$0.C1().b("label_challan_please_enter_vehicle_no", this$0.getString(R.string.please_enter_vehicle_no)));
            sq5 sq5Var6 = this$0.binding;
            if (sq5Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                sq5Var2 = sq5Var6;
            }
            sq5Var2.g.requestFocus();
            return;
        }
        sq5 sq5Var7 = this$0.binding;
        if (sq5Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var7 = null;
        }
        sq5Var7.g.setError(this$0.C1().b("label_challan_valid_dl_no", this$0.getString(R.string.please_enter_valid_dl_number)));
        sq5 sq5Var8 = this$0.binding;
        if (sq5Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            sq5Var2 = sq5Var8;
        }
        sq5Var2.g.requestFocus();
    }

    public static final boolean N1(SearchChallanListActivity this$0, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i != 6) {
            return false;
        }
        sq5 sq5Var = this$0.binding;
        sq5 sq5Var2 = null;
        if (sq5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var = null;
        }
        String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(sq5Var.g.getText())).toString();
        if (!this$0.d2()) {
            if (Intrinsics.areEqual(this$0.inputType, "RC")) {
                this$0.onBackPressed();
            } else {
                this$0.inputValue = string;
                this$0.disposeChallanList.clear();
                this$0.pendingsearchList.clear();
                this$0.allChallanList.clear();
                this$0.offsetValue = 1;
                this$0.totalPageOffsetValue = 1;
                this$0.allTotalChallan = 0;
                this$0.pendingTotalChallan = 0;
                this$0.disposeTotalChallan = 0;
                this$0.w1();
            }
            return true;
        }
        String str = this$0.inputType;
        if (Intrinsics.areEqual(str, "Challan")) {
            sq5 sq5Var3 = this$0.binding;
            if (sq5Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var3 = null;
            }
            sq5Var3.g.setError(this$0.C1().b("label_challan_please_enter_challan_no", this$0.getString(R.string.please_enter_challan_no)));
            sq5 sq5Var4 = this$0.binding;
            if (sq5Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                sq5Var2 = sq5Var4;
            }
            sq5Var2.g.requestFocus();
        } else if (Intrinsics.areEqual(str, "RC")) {
            sq5 sq5Var5 = this$0.binding;
            if (sq5Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var5 = null;
            }
            sq5Var5.g.setError(this$0.C1().b("label_challan_please_enter_vehicle_no", this$0.getString(R.string.please_enter_vehicle_no)));
            sq5 sq5Var6 = this$0.binding;
            if (sq5Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                sq5Var2 = sq5Var6;
            }
            sq5Var2.g.requestFocus();
        } else {
            sq5 sq5Var7 = this$0.binding;
            if (sq5Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var7 = null;
            }
            sq5Var7.g.setError(this$0.C1().b("label_challan_valid_dl_no", this$0.getString(R.string.please_enter_valid_dl_number)));
            sq5 sq5Var8 = this$0.binding;
            if (sq5Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                sq5Var2 = sq5Var8;
            }
            sq5Var2.g.requestFocus();
        }
        return true;
    }

    private final boolean O1(String string) {
        int length = string.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = string.charAt(i);
            if (('A' > cCharAt || cCharAt >= '[') && ('a' > cCharAt || cCharAt >= '{')) {
                return false;
            }
        }
        return true;
    }

    private final boolean P1() {
        Object systemService = getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    public static final void R1(SearchChallanListActivity this$0, NestedScrollView v, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(v, "v");
        if (i2 == v.getChildAt(0).getMeasuredHeight() - v.getMeasuredHeight()) {
            int i5 = this$0.offsetValue + 1;
            this$0.offsetValue = i5;
            if (this$0.totalPageOffsetValue >= i5) {
                this$0.z1();
            }
        }
    }

    private final void S1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T1(List searchList) {
        tp5 tp5Var = this.adapter;
        sq5 sq5Var = null;
        if (tp5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            tp5Var = null;
        }
        tp5Var.B(searchList);
        tp5Var.j();
        sq5 sq5Var2 = this.binding;
        if (sq5Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var2 = null;
        }
        ProgressBar progressBar = sq5Var2.i;
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        if (progressBar.getVisibility() == 0) {
            sq5 sq5Var3 = this.binding;
            if (sq5Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                sq5Var = sq5Var3;
            }
            sq5Var.i.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final boolean d2() {
        String strSubstring;
        sq5 sq5Var = this.binding;
        sq5 sq5Var2 = null;
        if (sq5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var = null;
        }
        String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(sq5Var.g.getText())).toString();
        char[] charArray = string.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        if (string.length() <= 0 || string.length() <= 2) {
            strSubstring = "";
        } else {
            sq5 sq5Var3 = this.binding;
            if (sq5Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var3 = null;
            }
            strSubstring = StringsKt__StringsKt.trim((CharSequence) String.valueOf(sq5Var3.g.getText())).toString().substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        if (Intrinsics.areEqual(this.inputType, "Challan")) {
            if (string.length() == 0) {
                sq5 sq5Var4 = this.binding;
                if (sq5Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    sq5Var4 = null;
                }
                sq5Var4.g.setError(getString(R.string.please_enter_challan_notice_no));
                sq5 sq5Var5 = this.binding;
                if (sq5Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    sq5Var2 = sq5Var5;
                }
                sq5Var2.g.requestFocus();
                return true;
            }
            Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(string);
            if (intOrNull != null) {
                if (intOrNull.intValue() < 5) {
                    sq5 sq5Var6 = this.binding;
                    if (sq5Var6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        sq5Var6 = null;
                    }
                    sq5Var6.g.setError(getString(R.string.enter_min_notice_no));
                    sq5 sq5Var7 = this.binding;
                    if (sq5Var7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        sq5Var2 = sq5Var7;
                    }
                    sq5Var2.g.requestFocus();
                    return true;
                }
            } else {
                if (!O1(strSubstring)) {
                    sq5 sq5Var8 = this.binding;
                    if (sq5Var8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        sq5Var8 = null;
                    }
                    sq5Var8.g.setError(C1().b("label_challan_enter_first_two_char_as_state", getString(R.string.please_enter_correct_challan_no)));
                    sq5 sq5Var9 = this.binding;
                    if (sq5Var9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        sq5Var2 = sq5Var9;
                    }
                    sq5Var2.g.requestFocus();
                    return true;
                }
                if (string.length() < 12) {
                    sq5 sq5Var10 = this.binding;
                    if (sq5Var10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        sq5Var10 = null;
                    }
                    sq5Var10.g.setError(C1().b("label_challan_min_length_validation", getString(R.string.min_length_challan_no)));
                    sq5 sq5Var11 = this.binding;
                    if (sq5Var11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        sq5Var2 = sq5Var11;
                    }
                    sq5Var2.g.requestFocus();
                    return true;
                }
                if (string.length() > 30) {
                    sq5 sq5Var12 = this.binding;
                    if (sq5Var12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        sq5Var12 = null;
                    }
                    sq5Var12.g.setError(C1().b("label_challan_max_length_validation", getString(R.string.max_length_challan_no)));
                    sq5 sq5Var13 = this.binding;
                    if (sq5Var13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        sq5Var2 = sq5Var13;
                    }
                    sq5Var2.g.requestFocus();
                    return true;
                }
            }
        } else if (Intrinsics.areEqual(this.inputType, "RC")) {
            if (string.length() == 0) {
                sq5 sq5Var14 = this.binding;
                if (sq5Var14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    sq5Var14 = null;
                }
                sq5Var14.g.setError(C1().b("label_challan_please_enter_vehicle_no", getString(R.string.please_enter_vehicle_no)));
                sq5 sq5Var15 = this.binding;
                if (sq5Var15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    sq5Var2 = sq5Var15;
                }
                sq5Var2.g.requestFocus();
                return true;
            }
            int length = charArray.length;
            if (length >= 0 && length < 7) {
                sq5 sq5Var16 = this.binding;
                if (sq5Var16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    sq5Var16 = null;
                }
                sq5Var16.g.setError(C1().b("label_challan_min_char_vehicle_no", getString(R.string.rc_min_valid)));
                sq5 sq5Var17 = this.binding;
                if (sq5Var17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    sq5Var2 = sq5Var17;
                }
                sq5Var2.g.requestFocus();
                return true;
            }
            if (string.length() > 10) {
                sq5 sq5Var18 = this.binding;
                if (sq5Var18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    sq5Var18 = null;
                }
                sq5Var18.g.setError(C1().b("label_challan_rc_validation", getString(R.string.rc_text)));
                sq5 sq5Var19 = this.binding;
                if (sq5Var19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    sq5Var2 = sq5Var19;
                }
                sq5Var2.g.requestFocus();
                return true;
            }
            if (!new Regex("[a-zA-Z0-9]*").matches(string)) {
                sq5 sq5Var20 = this.binding;
                if (sq5Var20 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    sq5Var20 = null;
                }
                sq5Var20.g.setError(C1().b("label_challan_invalid_vehicle_no", getString(R.string.invalid_rc_no)));
                sq5 sq5Var21 = this.binding;
                if (sq5Var21 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    sq5Var2 = sq5Var21;
                }
                sq5Var2.g.requestFocus();
                return true;
            }
        } else if (Intrinsics.areEqual(this.inputType, "DL")) {
            if (string.length() == 0) {
                sq5 sq5Var22 = this.binding;
                if (sq5Var22 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    sq5Var22 = null;
                }
                sq5Var22.g.setError(C1().b("label_challan_valid_dl_no", getString(R.string.please_enter_valid_dl_number)));
                sq5 sq5Var23 = this.binding;
                if (sq5Var23 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    sq5Var2 = sq5Var23;
                }
                sq5Var2.g.requestFocus();
                return true;
            }
            if (string.length() < 10) {
                sq5 sq5Var24 = this.binding;
                if (sq5Var24 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    sq5Var24 = null;
                }
                sq5Var24.g.setError(C1().b("label_challan_min_char_dl_validation", "Please enter minimum 10 characters of DL number"));
                sq5 sq5Var25 = this.binding;
                if (sq5Var25 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    sq5Var2 = sq5Var25;
                }
                sq5Var2.g.requestFocus();
                return true;
            }
        }
        return false;
    }

    private final void w1() {
        if (P1()) {
            z1();
        } else {
            b2(this, C1().b("error_msg_record_not_found", getString(R.string.service_unavable_please_try)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x1() {
        sq5 sq5Var = null;
        if (Intrinsics.areEqual(this.inputType, "Challan")) {
            if (this.allChallanList.size() == 0) {
                sq5 sq5Var2 = this.binding;
                if (sq5Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    sq5Var2 = null;
                }
                sq5Var2.f.setVisibility(0);
                sq5 sq5Var3 = this.binding;
                if (sq5Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    sq5Var = sq5Var3;
                }
                sq5Var.c.setVisibility(8);
                return;
            }
            sq5 sq5Var4 = this.binding;
            if (sq5Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var4 = null;
            }
            sq5Var4.f.setVisibility(8);
            sq5 sq5Var5 = this.binding;
            if (sq5Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                sq5Var = sq5Var5;
            }
            sq5Var.c.setVisibility(0);
            return;
        }
        if (this.tabClicked == 0 && this.allChallanList.size() == 0) {
            sq5 sq5Var6 = this.binding;
            if (sq5Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var6 = null;
            }
            sq5Var6.n.setText(C1().b("label_challan_total", getString(R.string.total_challan)) + " 0");
            sq5 sq5Var7 = this.binding;
            if (sq5Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var7 = null;
            }
            sq5Var7.f.setVisibility(0);
            sq5 sq5Var8 = this.binding;
            if (sq5Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                sq5Var = sq5Var8;
            }
            sq5Var.c.setVisibility(8);
            return;
        }
        if (this.tabClicked == 1 && this.pendingsearchList.size() == 0) {
            sq5 sq5Var9 = this.binding;
            if (sq5Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var9 = null;
            }
            sq5Var9.n.setText(C1().b("label_challan_total", getString(R.string.total_challan)) + " 0");
            sq5 sq5Var10 = this.binding;
            if (sq5Var10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var10 = null;
            }
            sq5Var10.f.setVisibility(0);
            sq5 sq5Var11 = this.binding;
            if (sq5Var11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                sq5Var = sq5Var11;
            }
            sq5Var.c.setVisibility(8);
            return;
        }
        if (this.tabClicked == 2 && this.disposeChallanList.size() == 0) {
            sq5 sq5Var12 = this.binding;
            if (sq5Var12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var12 = null;
            }
            sq5Var12.n.setText(C1().b("label_challan_total", getString(R.string.total_challan)) + " 0");
            sq5 sq5Var13 = this.binding;
            if (sq5Var13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var13 = null;
            }
            sq5Var13.f.setVisibility(0);
            sq5 sq5Var14 = this.binding;
            if (sq5Var14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                sq5Var = sq5Var14;
            }
            sq5Var.c.setVisibility(8);
            return;
        }
        if (this.tabClicked == 0 && this.allChallanList.size() > 0) {
            int i = this.allTotalChallan;
            if (i > 1) {
                sq5 sq5Var15 = this.binding;
                if (sq5Var15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    sq5Var15 = null;
                }
                sq5Var15.n.setText(C1().b("label_challan_totals", getString(R.string.total_challans)) + ' ' + this.allTotalChallan);
            } else if (i == 0) {
                sq5 sq5Var16 = this.binding;
                if (sq5Var16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    sq5Var16 = null;
                }
                sq5Var16.n.setText(C1().b("label_challan_total", getString(R.string.total_challan)) + " 0");
            } else {
                sq5 sq5Var17 = this.binding;
                if (sq5Var17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    sq5Var17 = null;
                }
                sq5Var17.n.setText(C1().b("label_challan_total", getString(R.string.total_challan)) + ' ' + this.allTotalChallan);
            }
            sq5 sq5Var18 = this.binding;
            if (sq5Var18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var18 = null;
            }
            sq5Var18.f.setVisibility(8);
            sq5 sq5Var19 = this.binding;
            if (sq5Var19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                sq5Var = sq5Var19;
            }
            sq5Var.c.setVisibility(0);
            return;
        }
        if (this.tabClicked == 1 && this.pendingsearchList.size() > 0) {
            int i2 = this.pendingTotalChallan;
            if (i2 > 1) {
                sq5 sq5Var20 = this.binding;
                if (sq5Var20 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    sq5Var20 = null;
                }
                sq5Var20.n.setText(C1().b("label_challan_totals", getString(R.string.total_challans)) + ' ' + this.pendingTotalChallan);
            } else if (i2 == 0) {
                sq5 sq5Var21 = this.binding;
                if (sq5Var21 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    sq5Var21 = null;
                }
                sq5Var21.n.setText(C1().b("label_challan_total", getString(R.string.total_challan)) + " 0");
            } else {
                sq5 sq5Var22 = this.binding;
                if (sq5Var22 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    sq5Var22 = null;
                }
                sq5Var22.n.setText(C1().b("label_challan_total", getString(R.string.total_challan)) + ' ' + this.pendingTotalChallan);
            }
            sq5 sq5Var23 = this.binding;
            if (sq5Var23 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var23 = null;
            }
            sq5Var23.f.setVisibility(8);
            sq5 sq5Var24 = this.binding;
            if (sq5Var24 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                sq5Var = sq5Var24;
            }
            sq5Var.c.setVisibility(0);
            return;
        }
        if (this.tabClicked != 2 || this.disposeChallanList.size() <= 0) {
            return;
        }
        int i3 = this.disposeTotalChallan;
        if (i3 > 1) {
            sq5 sq5Var25 = this.binding;
            if (sq5Var25 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var25 = null;
            }
            sq5Var25.n.setText(C1().b("label_challan_totals", getString(R.string.total_challans)) + ' ' + this.disposeTotalChallan);
        } else if (i3 == 0) {
            sq5 sq5Var26 = this.binding;
            if (sq5Var26 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var26 = null;
            }
            sq5Var26.n.setText(C1().b("label_challan_totals", getString(R.string.total_challans)) + " 0");
        } else {
            sq5 sq5Var27 = this.binding;
            if (sq5Var27 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var27 = null;
            }
            sq5Var27.n.setText(C1().b("label_challan_total", getString(R.string.total_challan)) + ' ' + this.disposeTotalChallan);
        }
        sq5 sq5Var28 = this.binding;
        if (sq5Var28 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var28 = null;
        }
        sq5Var28.f.setVisibility(8);
        sq5 sq5Var29 = this.binding;
        if (sq5Var29 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            sq5Var = sq5Var29;
        }
        sq5Var.c.setVisibility(0);
    }

    private final void z1() {
        fz1 fz1Var;
        sq5 sq5Var = null;
        try {
            this.isLoading = true;
            sq5 sq5Var2 = this.binding;
            if (sq5Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var2 = null;
            }
            sq5Var2.i.setVisibility(0);
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
            sq5 sq5Var3 = this.binding;
            if (sq5Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                sq5Var3 = null;
            }
            ProgressBar progressBar = sq5Var3.i;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            if (progressBar.getVisibility() == 0) {
                sq5 sq5Var4 = this.binding;
                if (sq5Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    sq5Var = sq5Var4;
                }
                sq5Var.i.setVisibility(8);
            }
            x1();
        }
    }

    /* JADX INFO: renamed from: A1, reason: from getter */
    public final int getAllTotalChallan() {
        return this.allTotalChallan;
    }

    /* JADX INFO: renamed from: B1, reason: from getter */
    public final ArrayList getDisposeChallanList() {
        return this.disposeChallanList;
    }

    public final wa3 C1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    /* JADX INFO: renamed from: D1, reason: from getter */
    public final int getOffsetValue() {
        return this.offsetValue;
    }

    /* JADX INFO: renamed from: E1, reason: from getter */
    public final ArrayList getPendingsearchList() {
        return this.pendingsearchList;
    }

    /* JADX INFO: renamed from: F1, reason: from getter */
    public final int getTabClicked() {
        return this.tabClicked;
    }

    public final void Q1() {
        sq5 sq5Var = this.binding;
        if (sq5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var = null;
        }
        sq5Var.e.setOnScrollChangeListener(new NestedScrollView.c() { // from class: com.zepto.hq5
            @Override // androidx.core.widget.NestedScrollView.c
            public final void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                SearchChallanListActivity.R1(this.a, nestedScrollView, i, i2, i3, i4);
            }
        });
    }

    public final void U1(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.allChallanList = arrayList;
    }

    public final void V1(int i) {
        this.allTotalChallan = i;
    }

    public final void W1(int i) {
        this.disposeTotalChallan = i;
    }

    public final void X1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void Y1(boolean z) {
        this.isLoading = z;
    }

    public final void Z1(int i) {
        this.pendingTotalChallan = i;
    }

    public final void a2(int i) {
        this.totalPageOffsetValue = i;
    }

    public final void b2(Context context, String message) {
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
        textView.setText(C1().b("label_challan_ok_dialog_text", getString(R.string.ok_txt)));
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(C1().b("nex_parivahan", getString(R.string.app_name)));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gq5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchChallanListActivity.c2(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sq5 sq5VarC = sq5.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(sq5VarC, "inflate(...)");
        this.binding = sq5VarC;
        fz1 fz1Var = null;
        if (sq5VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5VarC = null;
        }
        setContentView(sq5VarC.b());
        X1(new wa3(this));
        az1.a aVar = az1.a;
        sq5 sq5Var = this.binding;
        if (sq5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            sq5Var = null;
        }
        aVar.h(this, sq5Var);
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
        G1();
        w1();
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

    public final void v1(List searchList) {
        tp5 tp5Var = this.adapter;
        if (tp5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            tp5Var = null;
        }
        tp5Var.C(searchList);
    }

    /* JADX INFO: renamed from: y1, reason: from getter */
    public final ArrayList getAllChallanList() {
        return this.allChallanList;
    }
}
