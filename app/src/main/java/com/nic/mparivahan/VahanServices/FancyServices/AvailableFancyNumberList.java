package com.nic.mparivahan.VahanServices.FancyServices;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyModel.AvailableFancyModel;
import com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyModel.Data;
import com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyNumberList;
import com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyService.AvailableFancyService;
import com.zepto.a20;
import com.zepto.b20;
import com.zepto.mf4;
import com.zepto.o10;
import com.zepto.p10;
import com.zepto.pq;
import com.zepto.r6;
import com.zepto.ta3;
import com.zepto.wa3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b_\u0010`J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0016\u0010\u000e\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0003J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0015R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R2\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\f0\u001aj\b\u0012\u0004\u0012\u00020\f`\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\"\u0010A\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010E\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010<\u001a\u0004\bC\u0010>\"\u0004\bD\u0010@R2\u0010I\u001a\u0012\u0012\u0004\u0012\u00020\f0\u001aj\b\u0012\u0004\u0012\u00020\f`\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010\u001d\u001a\u0004\bG\u0010\u001f\"\u0004\bH\u0010!R2\u0010M\u001a\u0012\u0012\u0004\u0012\u00020\f0\u001aj\b\u0012\u0004\u0012\u00020\f`\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010\u001d\u001a\u0004\bK\u0010\u001f\"\u0004\bL\u0010!R\"\u0010U\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010;\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010^\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010;\u001a\u0004\b\\\u0010X\"\u0004\b]\u0010Z¨\u0006a"}, d2 = {"Lcom/nic/mparivahan/VahanServices/FancyServices/AvailableFancyNumberList;", "Lcom/zepto/pq;", "", "z1", "", "takeLast", "o1", "", "page", "u1", "E1", "", "Lcom/nic/mparivahan/VahanServices/FancyServices/AvailableFancyModel/Data;", "searchList", "F1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/r6;", "C", "Lcom/zepto/r6;", "q1", "()Lcom/zepto/r6;", "H1", "(Lcom/zepto/r6;)V", "binding", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "D", "Ljava/util/ArrayList;", "v1", "()Ljava/util/ArrayList;", "L1", "(Ljava/util/ArrayList;)V", "pendingsearchList", "Lcom/zepto/o10;", "E", "Lcom/zepto/o10;", "p1", "()Lcom/zepto/o10;", "G1", "(Lcom/zepto/o10;)V", "adapter", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "w1", "()Landroid/app/ProgressDialog;", "M1", "(Landroid/app/ProgressDialog;)V", "progressDialog", "Lcom/nic/mparivahan/VahanServices/FancyServices/AvailableFancyService/AvailableFancyService;", "G", "Lcom/nic/mparivahan/VahanServices/FancyServices/AvailableFancyService/AvailableFancyService;", "retrofitService", "Lcom/zepto/b20;", "H", "Lcom/zepto/b20;", "viewModel", "I", "Ljava/lang/String;", "y1", "()Ljava/lang/String;", "O1", "(Ljava/lang/String;)V", "stateCode", "J", "x1", "N1", "rtoCode", "K", "r1", "I1", "fancySearchArray", "L", "getFullDataFancyNumber", "setFullDataFancyNumber", "fullDataFancyNumber", "Lcom/zepto/wa3;", "M", "Lcom/zepto/wa3;", "s1", "()Lcom/zepto/wa3;", "J1", "(Lcom/zepto/wa3;)V", "langSession", "N", "t1", "()I", "K1", "(I)V", "O", "getPageSize", "setPageSize", "pageSize", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class AvailableFancyNumberList extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public r6 binding;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public o10 adapter;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog progressDialog;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public AvailableFancyService retrofitService;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public b20 viewModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String stateCode;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String rtoCode;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ArrayList pendingsearchList = new ArrayList();

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ArrayList fancySearchArray = new ArrayList();

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public ArrayList fullDataFancyNumber = new ArrayList();

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public int page = 1;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public int pageSize = 100;

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
            AvailableFancyNumberList.this.I1(new ArrayList());
            for (Data data : AvailableFancyNumberList.this.getPendingsearchList()) {
                String lowerCase = data.getReg_no().toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                String strTakeLast = StringsKt___StringsKt.takeLast(lowerCase, 4);
                Intrinsics.checkNotNull(charSequence);
                if (StringsKt__StringsKt.contains((CharSequence) strTakeLast, charSequence, true)) {
                    AvailableFancyNumberList.this.getFancySearchArray().add(data);
                }
            }
            if (!AvailableFancyNumberList.this.getFancySearchArray().isEmpty()) {
                AvailableFancyNumberList.this.p1().A(AvailableFancyNumberList.this.getFancySearchArray());
            }
            if (String.valueOf(AvailableFancyNumberList.this.q1().c.getText()).length() == 0) {
                AvailableFancyNumberList.this.p1().C(AvailableFancyNumberList.this.getFancySearchArray());
                AvailableFancyNumberList.this.K1(1);
                AvailableFancyNumberList availableFancyNumberList = AvailableFancyNumberList.this;
                availableFancyNumberList.u1(availableFancyNumberList.getPage());
            }
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(AvailableFancyModel availableFancyModel) {
            try {
                Intrinsics.checkNotNull(availableFancyModel);
                if (!StringsKt__StringsJVMKt.equals(availableFancyModel.getStatus(), "SUCCESS", true)) {
                    if (AvailableFancyNumberList.this.w1().isShowing()) {
                        AvailableFancyNumberList.this.w1().dismiss();
                        return;
                    }
                    return;
                }
                AvailableFancyNumberList availableFancyNumberList = AvailableFancyNumberList.this;
                List<Data> data = availableFancyModel.getData();
                Intrinsics.checkNotNull(data, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyModel.Data>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyModel.Data> }");
                availableFancyNumberList.L1((ArrayList) data);
                if (AvailableFancyNumberList.this.getPendingsearchList().size() > 0) {
                    AvailableFancyNumberList availableFancyNumberList2 = AvailableFancyNumberList.this;
                    availableFancyNumberList2.F1(availableFancyNumberList2.getPendingsearchList());
                }
                if (AvailableFancyNumberList.this.w1().isShowing()) {
                    AvailableFancyNumberList.this.w1().dismiss();
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (AvailableFancyNumberList.this.w1().isShowing()) {
                    AvailableFancyNumberList.this.w1().dismiss();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AvailableFancyModel) obj);
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
            if (AvailableFancyNumberList.this.w1().isShowing()) {
                AvailableFancyNumberList.this.w1().dismiss();
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

    public static final void A1(AvailableFancyNumberList this$0, NestedScrollView v, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(v, "v");
        if (i2 == v.getChildAt(0).getMeasuredHeight() - v.getMeasuredHeight()) {
            int i5 = this$0.page + 1;
            this$0.page = i5;
            this$0.u1(i5);
        }
    }

    public static final void B1(AvailableFancyNumberList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void C1(AvailableFancyNumberList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.E1();
    }

    public static final void D1(AvailableFancyNumberList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (String.valueOf(this$0.q1().c.getText()).length() == 0) {
            Toast.makeText(this$0, this$0.s1().b("please_enter_4_digit_reg_no", this$0.getString(R.string.please_enter_4_digit_reg_no)), 1).show();
        } else {
            this$0.o1(String.valueOf(this$0.q1().c.getText()));
        }
    }

    private final void E1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F1(List searchList) {
        o10 o10VarP1 = p1();
        o10VarP1.B(searchList);
        o10VarP1.j();
    }

    private final void z1() {
        q1().d.setOnScrollChangeListener(new NestedScrollView.c() { // from class: com.zepto.q10
            @Override // androidx.core.widget.NestedScrollView.c
            public final void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                AvailableFancyNumberList.A1(this.a, nestedScrollView, i, i2, i3, i4);
            }
        });
        AvailableFancyService availableFancyService = this.retrofitService;
        if (availableFancyService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            availableFancyService = null;
        }
        this.viewModel = (b20) new z(this, new p10(new a20(availableFancyService))).a(b20.class);
        q1().f.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.r10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AvailableFancyNumberList.B1(this.a, view);
            }
        });
        q1().f.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.s10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AvailableFancyNumberList.C1(this.a, view);
            }
        });
        q1().b.setLayoutManager(new LinearLayoutManager(this));
        G1(new o10(this, new ArrayList()));
        q1().b.setAdapter(p1());
        u1(this.page);
        q1().e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.t10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AvailableFancyNumberList.D1(this.a, view);
            }
        });
        q1().c.addTextChangedListener(new a());
    }

    public final void G1(o10 o10Var) {
        Intrinsics.checkNotNullParameter(o10Var, "<set-?>");
        this.adapter = o10Var;
    }

    public final void H1(r6 r6Var) {
        Intrinsics.checkNotNullParameter(r6Var, "<set-?>");
        this.binding = r6Var;
    }

    public final void I1(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.fancySearchArray = arrayList;
    }

    public final void J1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void K1(int i) {
        this.page = i;
    }

    public final void L1(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.pendingsearchList = arrayList;
    }

    public final void M1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.progressDialog = progressDialog;
    }

    public final void N1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoCode = str;
    }

    public final void O1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCode = str;
    }

    public final void o1(String takeLast) {
        this.fancySearchArray = new ArrayList();
        for (Data data : this.pendingsearchList) {
            String lowerCase = data.getReg_no().toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
            String lowerCase2 = takeLast.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase()");
            if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) lowerCase2, false, 2, (Object) null)) {
                this.fancySearchArray.add(data);
            }
        }
        if (this.fancySearchArray.isEmpty()) {
            Toast.makeText(getApplicationContext(), s1().b("no_data_found", getString(R.string.no_data_found)), 0).show();
        } else {
            p1().A(this.fancySearchArray);
        }
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        r6 r6VarC = r6.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(r6VarC, "inflate(...)");
        H1(r6VarC);
        setContentView(q1().b());
        J1(new wa3(this));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String string = extras.getString("stateCode", "HR");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            O1(string);
            String string2 = extras.getString("rtoCode", "0");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            N1(string2);
        }
        q1().f.i.setText("Available Fancy No. Status");
        ta3.a.K(this, q1());
        M1(new ProgressDialog(this));
        w1().setCancelable(false);
        w1().setCanceledOnTouchOutside(false);
        this.retrofitService = AvailableFancyService.INSTANCE.a(this);
        z1();
        b20 b20Var = this.viewModel;
        b20 b20Var2 = null;
        if (b20Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            b20Var = null;
        }
        b20Var.g().g(this, new d(new b()));
        b20 b20Var3 = this.viewModel;
        if (b20Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            b20Var2 = b20Var3;
        }
        b20Var2.h().g(this, new d(new c()));
    }

    public final o10 p1() {
        o10 o10Var = this.adapter;
        if (o10Var != null) {
            return o10Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    public final r6 q1() {
        r6 r6Var = this.binding;
        if (r6Var != null) {
            return r6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    /* JADX INFO: renamed from: r1, reason: from getter */
    public final ArrayList getFancySearchArray() {
        return this.fancySearchArray;
    }

    public final wa3 s1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    /* JADX INFO: renamed from: t1, reason: from getter */
    public final int getPage() {
        return this.page;
    }

    public final void u1(int page) {
        try {
            w1().show();
            b20 b20Var = this.viewModel;
            if (b20Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                b20Var = null;
            }
            b20Var.i(y1(), x1(), String.valueOf(this.pageSize), String.valueOf(page));
        } catch (Exception e) {
            e.printStackTrace();
            if (w1().isShowing()) {
                w1().dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: v1, reason: from getter */
    public final ArrayList getPendingsearchList() {
        return this.pendingsearchList;
    }

    public final ProgressDialog w1() {
        ProgressDialog progressDialog = this.progressDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("progressDialog");
        return null;
    }

    public final String x1() {
        String str = this.rtoCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rtoCode");
        return null;
    }

    public final String y1() {
        String str = this.stateCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stateCode");
        return null;
    }
}
