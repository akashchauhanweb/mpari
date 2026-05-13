package com.nic.mparivahan.Checkpost;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.Checkpost.CheckPostModel.CheckPostReceiptDetailNew;
import com.nic.mparivahan.Checkpost.CheckPostRepository.CheckPostService;
import com.nic.mparivahan.Checkpost.CheckPostSearchList;
import com.nic.mparivahan.R;
import com.zepto.j7;
import com.zepto.jj0;
import com.zepto.mf4;
import com.zepto.oj0;
import com.zepto.pj0;
import com.zepto.pq;
import com.zepto.sj0;
import com.zepto.ta3;
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
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bJ\u0010KJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u0016\u0010\u0011\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0003J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0002R\"\u0010\u001c\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010 \u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\"\u0010$\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R&\u0010A\u001a\u0012\u0012\u0004\u0012\u00020\u000f0=j\b\u0012\u0004\u0012\u00020\u000f`>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bB\u0010\u0017R2\u0010I\u001a\u0012\u0012\u0004\u0012\u00020\u000f0=j\b\u0012\u0004\u0012\u00020\u000f`>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010@\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006L"}, d2 = {"Lcom/nic/mparivahan/Checkpost/CheckPostSearchList;", "Lcom/zepto/pq;", "", "t1", "", "D1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "B1", "", "Lcom/nic/mparivahan/Checkpost/CheckPostModel/CheckPostReceiptDetailNewItem;", "searchList", "y1", "o1", "q1", "p1", "w1", "C", "Ljava/lang/String;", "getVehReciptNo", "()Ljava/lang/String;", "setVehReciptNo", "(Ljava/lang/String;)V", "vehReciptNo", "D", "getStateCode", "setStateCode", "stateCode", "E", "getInputType", "setInputType", "inputType", "Lcom/zepto/j7;", "F", "Lcom/zepto/j7;", "binding", "Lcom/zepto/wa3;", "G", "Lcom/zepto/wa3;", "r1", "()Lcom/zepto/wa3;", "z1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/nic/mparivahan/Checkpost/CheckPostRepository/CheckPostService;", "H", "Lcom/nic/mparivahan/Checkpost/CheckPostRepository/CheckPostService;", "retrofitService", "Lcom/zepto/pj0;", "I", "Lcom/zepto/pj0;", "viewModel", "Lcom/zepto/sj0;", "J", "Lcom/zepto/sj0;", "adapter", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "K", "Ljava/util/ArrayList;", "noticeSearchArray", "L", "digit", "M", "s1", "()Ljava/util/ArrayList;", "A1", "(Ljava/util/ArrayList;)V", "pendingsearchList", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class CheckPostSearchList extends pq {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public j7 binding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public CheckPostService retrofitService;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public pj0 viewModel;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public sj0 adapter;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public String vehReciptNo = "";

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String stateCode = "";

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String inputType = "";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ArrayList noticeSearchArray = new ArrayList();

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public final String digit = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ArrayList pendingsearchList = new ArrayList();

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
            j7 j7Var = CheckPostSearchList.this.binding;
            if (j7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                j7Var = null;
            }
            j7Var.e.setError(null);
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(CheckPostReceiptDetailNew checkPostReceiptDetailNew) {
            try {
                j7 j7Var = CheckPostSearchList.this.binding;
                j7 j7Var2 = null;
                if (j7Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    j7Var = null;
                }
                j7Var.f.setVisibility(8);
                j7 j7Var3 = CheckPostSearchList.this.binding;
                if (j7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    j7Var3 = null;
                }
                j7Var3.c.setVisibility(8);
                j7 j7Var4 = CheckPostSearchList.this.binding;
                if (j7Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    j7Var4 = null;
                }
                j7Var4.d.setVisibility(0);
                j7 j7Var5 = CheckPostSearchList.this.binding;
                if (j7Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    j7Var2 = j7Var5;
                }
                j7Var2.k.setVisibility(0);
                CheckPostSearchList checkPostSearchList = CheckPostSearchList.this;
                Intrinsics.checkNotNull(checkPostReceiptDetailNew, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.Checkpost.CheckPostModel.CheckPostReceiptDetailNewItem>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.Checkpost.CheckPostModel.CheckPostReceiptDetailNewItem> }");
                checkPostSearchList.A1(checkPostReceiptDetailNew);
                CheckPostSearchList checkPostSearchList2 = CheckPostSearchList.this;
                checkPostSearchList2.y1(checkPostSearchList2.getPendingsearchList());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CheckPostReceiptDetailNew) obj);
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
            j7 j7Var = CheckPostSearchList.this.binding;
            j7 j7Var2 = null;
            if (j7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                j7Var = null;
            }
            j7Var.f.setVisibility(8);
            j7 j7Var3 = CheckPostSearchList.this.binding;
            if (j7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                j7Var3 = null;
            }
            j7Var3.c.setVisibility(0);
            j7 j7Var4 = CheckPostSearchList.this.binding;
            if (j7Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                j7Var4 = null;
            }
            j7Var4.d.setVisibility(8);
            j7 j7Var5 = CheckPostSearchList.this.binding;
            if (j7Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                j7Var2 = j7Var5;
            }
            j7Var2.k.setVisibility(8);
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        public final void a(CheckPostReceiptDetailNew checkPostReceiptDetailNew) {
            try {
                j7 j7Var = CheckPostSearchList.this.binding;
                j7 j7Var2 = null;
                if (j7Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    j7Var = null;
                }
                j7Var.f.setVisibility(8);
                j7 j7Var3 = CheckPostSearchList.this.binding;
                if (j7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    j7Var3 = null;
                }
                j7Var3.c.setVisibility(8);
                j7 j7Var4 = CheckPostSearchList.this.binding;
                if (j7Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    j7Var4 = null;
                }
                j7Var4.d.setVisibility(0);
                j7 j7Var5 = CheckPostSearchList.this.binding;
                if (j7Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    j7Var2 = j7Var5;
                }
                j7Var2.k.setVisibility(0);
                CheckPostSearchList checkPostSearchList = CheckPostSearchList.this;
                Intrinsics.checkNotNull(checkPostReceiptDetailNew, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.Checkpost.CheckPostModel.CheckPostReceiptDetailNewItem>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.Checkpost.CheckPostModel.CheckPostReceiptDetailNewItem> }");
                checkPostSearchList.A1(checkPostReceiptDetailNew);
                CheckPostSearchList checkPostSearchList2 = CheckPostSearchList.this;
                checkPostSearchList2.y1(checkPostSearchList2.getPendingsearchList());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CheckPostReceiptDetailNew) obj);
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

        public final void invoke(String str) {
            str.equals("SUCCESS");
            j7 j7Var = CheckPostSearchList.this.binding;
            j7 j7Var2 = null;
            if (j7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                j7Var = null;
            }
            j7Var.f.setVisibility(8);
            j7 j7Var3 = CheckPostSearchList.this.binding;
            if (j7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                j7Var3 = null;
            }
            j7Var3.c.setVisibility(0);
            j7 j7Var4 = CheckPostSearchList.this.binding;
            if (j7Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                j7Var4 = null;
            }
            j7Var4.d.setVisibility(8);
            j7 j7Var5 = CheckPostSearchList.this.binding;
            if (j7Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                j7Var2 = j7Var5;
            }
            j7Var2.k.setVisibility(8);
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

    public static final void C1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final boolean D1() {
        j7 j7Var = this.binding;
        j7 j7Var2 = null;
        if (j7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            j7Var = null;
        }
        String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(j7Var.e.getText())).toString();
        if (Intrinsics.areEqual(this.inputType, "Receipt")) {
            if (string.length() == 0) {
                j7 j7Var3 = this.binding;
                if (j7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    j7Var3 = null;
                }
                j7Var3.e.setError(r1().b("pls_enter_FancyRecpNo", getString(R.string.please_enter_rcpt_no)));
                j7 j7Var4 = this.binding;
                if (j7Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    j7Var2 = j7Var4;
                }
                j7Var2.e.requestFocus();
                return true;
            }
            if (string.length() < 5) {
                j7 j7Var5 = this.binding;
                if (j7Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    j7Var5 = null;
                }
                j7Var5.e.setError(r1().b("please_enter_rcpt_no5_char", getString(R.string.please_enter5_char_rcpt_no)));
                j7 j7Var6 = this.binding;
                if (j7Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    j7Var2 = j7Var6;
                }
                j7Var2.e.requestFocus();
                return true;
            }
        }
        if (!Intrinsics.areEqual(this.inputType, "Vehicle")) {
            return false;
        }
        if (string.length() == 0) {
            j7 j7Var7 = this.binding;
            if (j7Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                j7Var7 = null;
            }
            j7Var7.e.setError(r1().b("label_challan_please_enter_vehicle_no", getString(R.string.please_enter_vehicle_no)));
            j7 j7Var8 = this.binding;
            if (j7Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                j7Var2 = j7Var8;
            }
            j7Var2.e.requestFocus();
            return true;
        }
        if (string.length() >= 5) {
            return false;
        }
        j7 j7Var9 = this.binding;
        if (j7Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            j7Var9 = null;
        }
        j7Var9.e.setError(r1().b("please_enter_vehicle_no5_char", getString(R.string.please_enter5_char_vehicle_no)));
        j7 j7Var10 = this.binding;
        if (j7Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            j7Var2 = j7Var10;
        }
        j7Var2.e.requestFocus();
        return true;
    }

    private final void t1() {
        CheckPostService checkPostService = this.retrofitService;
        j7 j7Var = null;
        if (checkPostService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            checkPostService = null;
        }
        this.viewModel = (pj0) new z(this, new oj0(new jj0(checkPostService))).a(pj0.class);
        j7 j7Var2 = this.binding;
        if (j7Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            j7Var2 = null;
        }
        j7Var2.e.setKeyListener(DigitsKeyListener.getInstance(this.digit));
        j7 j7Var3 = this.binding;
        if (j7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            j7Var3 = null;
        }
        j7Var3.e.setRawInputType(ConstantsKt.DEFAULT_BLOCK_SIZE);
        if (this.inputType.length() > 0) {
            String str = this.inputType;
            if (Intrinsics.areEqual(str, "Receipt")) {
                j7 j7Var4 = this.binding;
                if (j7Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    j7Var4 = null;
                }
                j7Var4.e.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(15)});
                j7 j7Var5 = this.binding;
                if (j7Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    j7Var5 = null;
                }
                j7Var5.e.setHint(r1().b("enter_FancyRecpNo", getString(R.string.enter_receipt_number)));
                j7 j7Var6 = this.binding;
                if (j7Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    j7Var6 = null;
                }
                j7Var6.h.setVisibility(8);
            } else if (Intrinsics.areEqual(str, "Vehicle")) {
                j7 j7Var7 = this.binding;
                if (j7Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    j7Var7 = null;
                }
                j7Var7.e.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(15)});
                j7 j7Var8 = this.binding;
                if (j7Var8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    j7Var8 = null;
                }
                j7Var8.e.setHint(getString(R.string.enter_vehicle_number));
                j7 j7Var9 = this.binding;
                if (j7Var9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    j7Var9 = null;
                }
                j7Var9.h.setVisibility(8);
            }
        }
        if (this.vehReciptNo.length() > 0) {
            j7 j7Var10 = this.binding;
            if (j7Var10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                j7Var10 = null;
            }
            j7Var10.e.setText(this.vehReciptNo);
        }
        j7 j7Var11 = this.binding;
        if (j7Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            j7Var11 = null;
        }
        j7Var11.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckPostSearchList.u1(this.a, view);
            }
        });
        j7 j7Var12 = this.binding;
        if (j7Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            j7Var12 = null;
        }
        j7Var12.e.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zepto.mj0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return CheckPostSearchList.v1(this.a, textView, i, keyEvent);
            }
        });
        j7 j7Var13 = this.binding;
        if (j7Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            j7Var = j7Var13;
        }
        j7Var.e.addTextChangedListener(new a());
        o1();
    }

    public static final void u1(CheckPostSearchList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        j7 j7Var = null;
        if (Intrinsics.areEqual(this$0.inputType, "Vehicle") && !this$0.D1()) {
            j7 j7Var2 = this$0.binding;
            if (j7Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                j7Var = j7Var2;
            }
            this$0.vehReciptNo = StringsKt__StringsKt.trim((CharSequence) String.valueOf(j7Var.e.getText())).toString();
            this$0.o1();
            return;
        }
        if (Intrinsics.areEqual(this$0.inputType, "Receipt") && !this$0.D1()) {
            j7 j7Var3 = this$0.binding;
            if (j7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                j7Var = j7Var3;
            }
            this$0.vehReciptNo = StringsKt__StringsKt.trim((CharSequence) String.valueOf(j7Var.e.getText())).toString();
            this$0.o1();
            return;
        }
        if (Intrinsics.areEqual(this$0.inputType, "Receipt")) {
            j7 j7Var4 = this$0.binding;
            if (j7Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                j7Var4 = null;
            }
            j7Var4.e.setError(this$0.r1().b("pls_enter_FancyRecpNo", this$0.getString(R.string.please_enter_rcpt_no)));
            j7 j7Var5 = this$0.binding;
            if (j7Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                j7Var = j7Var5;
            }
            j7Var.e.requestFocus();
            return;
        }
        j7 j7Var6 = this$0.binding;
        if (j7Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            j7Var6 = null;
        }
        j7Var6.e.setError(this$0.r1().b("label_challan_please_enter_vehicle_no", this$0.getString(R.string.please_enter_vehicle_no)));
        j7 j7Var7 = this$0.binding;
        if (j7Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            j7Var = j7Var7;
        }
        j7Var.e.requestFocus();
    }

    public static final boolean v1(CheckPostSearchList this$0, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i != 6) {
            return false;
        }
        if (Intrinsics.areEqual(this$0.inputType, "Vehicle")) {
            this$0.onBackPressed();
        } else {
            j7 j7Var = null;
            if (!Intrinsics.areEqual(this$0.inputType, "Receipt") || this$0.D1()) {
                j7 j7Var2 = this$0.binding;
                if (j7Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    j7Var2 = null;
                }
                j7Var2.e.setError(this$0.r1().b("pls_enter_FancyRecpNo", this$0.getString(R.string.please_enter_rcpt_no)));
                j7 j7Var3 = this$0.binding;
                if (j7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    j7Var = j7Var3;
                }
                j7Var.e.requestFocus();
                return true;
            }
            j7 j7Var4 = this$0.binding;
            if (j7Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                j7Var = j7Var4;
            }
            this$0.vehReciptNo = StringsKt__StringsKt.trim((CharSequence) String.valueOf(j7Var.e.getText())).toString();
            this$0.o1();
        }
        return true;
    }

    public static final void x1(CheckPostSearchList this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public final void A1(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.pendingsearchList = arrayList;
    }

    public final void B1(Context context, String message) {
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
        textView.setText(r1().b("label_challan_ok_dialog_text", getString(R.string.ok_txt)));
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(r1().b("nex_parivahan", getString(R.string.app_name)));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckPostSearchList.C1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void o1() {
        if (!w1()) {
            B1(this, r1().b("error_msg_record_not_found", getString(R.string.service_unavable_please_try)));
        } else if (Intrinsics.areEqual(this.inputType, "Receipt")) {
            p1();
        } else if (Intrinsics.areEqual(this.inputType, "Vehicle")) {
            q1();
        }
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        j7 j7VarC = j7.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(j7VarC, "inflate(...)");
        this.binding = j7VarC;
        pj0 pj0Var = null;
        if (j7VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            j7VarC = null;
        }
        setContentView(j7VarC.b());
        ta3.a aVar = ta3.a;
        j7 j7Var = this.binding;
        if (j7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            j7Var = null;
        }
        aVar.Y(this, j7Var);
        z1(new wa3(this));
        String stringExtra = getIntent().getStringExtra("vehReciptNo");
        Intrinsics.checkNotNull(stringExtra);
        this.vehReciptNo = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("stateCode");
        Intrinsics.checkNotNull(stringExtra2);
        this.stateCode = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("inputType");
        Intrinsics.checkNotNull(stringExtra3);
        this.inputType = stringExtra3;
        Log.e("input1", stringExtra3);
        Log.e("input12", this.stateCode);
        Log.e("input123", this.vehReciptNo);
        this.retrofitService = CheckPostService.INSTANCE.a(this);
        j7 j7Var2 = this.binding;
        if (j7Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            j7Var2 = null;
        }
        j7Var2.j.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckPostSearchList.x1(this.a, view);
            }
        });
        j7 j7Var3 = this.binding;
        if (j7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            j7Var3 = null;
        }
        j7Var3.d.setLayoutManager(new LinearLayoutManager(this));
        this.adapter = new sj0(this, this.noticeSearchArray, this.inputType, r1());
        j7 j7Var4 = this.binding;
        if (j7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            j7Var4 = null;
        }
        RecyclerView recyclerView = j7Var4.d;
        sj0 sj0Var = this.adapter;
        if (sj0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            sj0Var = null;
        }
        recyclerView.setAdapter(sj0Var);
        t1();
        pj0 pj0Var2 = this.viewModel;
        if (pj0Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            pj0Var2 = null;
        }
        pj0Var2.g().g(this, new f(new b()));
        pj0 pj0Var3 = this.viewModel;
        if (pj0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            pj0Var3 = null;
        }
        pj0Var3.h().g(this, new f(new c()));
        pj0 pj0Var4 = this.viewModel;
        if (pj0Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            pj0Var4 = null;
        }
        pj0Var4.i().g(this, new f(new d()));
        pj0 pj0Var5 = this.viewModel;
        if (pj0Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            pj0Var = pj0Var5;
        }
        pj0Var.j().g(this, new f(new e()));
    }

    public final void p1() {
        try {
            j7 j7Var = this.binding;
            pj0 pj0Var = null;
            if (j7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                j7Var = null;
            }
            j7Var.f.setVisibility(0);
            pj0 pj0Var2 = this.viewModel;
            if (pj0Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                pj0Var = pj0Var2;
            }
            pj0Var.k(this.vehReciptNo);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void q1() {
        try {
            j7 j7Var = this.binding;
            pj0 pj0Var = null;
            if (j7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                j7Var = null;
            }
            j7Var.f.setVisibility(0);
            pj0 pj0Var2 = this.viewModel;
            if (pj0Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                pj0Var = pj0Var2;
            }
            pj0Var.l(this.stateCode, this.vehReciptNo);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final wa3 r1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    /* JADX INFO: renamed from: s1, reason: from getter */
    public final ArrayList getPendingsearchList() {
        return this.pendingsearchList;
    }

    public final boolean w1() {
        Object systemService = getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    public final void y1(List searchList) {
        sj0 sj0Var = this.adapter;
        if (sj0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            sj0Var = null;
        }
        sj0Var.B(searchList);
        sj0Var.j();
    }

    public final void z1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }
}
