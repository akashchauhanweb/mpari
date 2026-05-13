package com.nic.mparivahan.Checkpost;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Checkpost.CheckPostModel.CheckPostReceiptDetailNew;
import com.nic.mparivahan.Checkpost.CheckPostReceiptStatus;
import com.nic.mparivahan.Checkpost.CheckPostRepository.CheckPostService;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.zepto.i7;
import com.zepto.jd7;
import com.zepto.jj0;
import com.zepto.kd7;
import com.zepto.kt6;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.oj0;
import com.zepto.pj0;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.yh7;
import com.zepto.yy0;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bI\u0010JJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010@\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010\u0011\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006K"}, d2 = {"Lcom/nic/mparivahan/Checkpost/CheckPostReceiptStatus;", "Lcom/zepto/pq;", "", "z1", "", "P1", "", "it", "M1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/i7;", "C", "Lcom/zepto/i7;", "binding", "D", "Ljava/lang/String;", "inputType", "Lcom/zepto/wa3;", "E", "Lcom/zepto/wa3;", "u1", "()Lcom/zepto/wa3;", "H1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/pj0;", "F", "Lcom/zepto/pj0;", "s1", "()Lcom/zepto/pj0;", "F1", "(Lcom/zepto/pj0;)V", "checkpostViewModel", "Lcom/nic/mparivahan/Checkpost/CheckPostRepository/CheckPostService;", "G", "Lcom/nic/mparivahan/Checkpost/CheckPostRepository/CheckPostService;", "v1", "()Lcom/nic/mparivahan/Checkpost/CheckPostRepository/CheckPostService;", "I1", "(Lcom/nic/mparivahan/Checkpost/CheckPostRepository/CheckPostService;)V", "mRcService", "Lcom/zepto/ld7;", "H", "Lcom/zepto/ld7;", "y1", "()Lcom/zepto/ld7;", "L1", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "I", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "w1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "J1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "J", "x1", "()Ljava/lang/String;", "K1", "(Ljava/lang/String;)V", "stateCode", "Landroid/app/ProgressDialog;", "K", "Landroid/app/ProgressDialog;", "t1", "()Landroid/app/ProgressDialog;", "G1", "(Landroid/app/ProgressDialog;)V", "dialog", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class CheckPostReceiptStatus extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public i7 binding;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public pj0 checkpostViewModel;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public CheckPostService mRcService;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ld7 viewModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ProgressDialog dialog;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String inputType = "Receipt";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String stateCode = "";

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
            i7 i7Var = CheckPostReceiptStatus.this.binding;
            if (i7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                i7Var = null;
            }
            i7Var.d.setError(null);
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            i7 i7Var = CheckPostReceiptStatus.this.binding;
            i7 i7Var2 = null;
            if (i7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                i7Var = null;
            }
            if (i7Var.g.getSelectedItemPosition() != 0) {
                i7 i7Var3 = CheckPostReceiptStatus.this.binding;
                if (i7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    i7Var3 = null;
                }
                Log.e("stateInfo", i7Var3.g.getSelectedItem().toString());
                i7 i7Var4 = CheckPostReceiptStatus.this.binding;
                if (i7Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    i7Var2 = i7Var4;
                }
                Object selectedItem = i7Var2.g.getSelectedItem();
                Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
                ArrayList arrayList = (ArrayList) selectedItem;
                Object obj = arrayList.get(0);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                Log.e("stateInfo2", (String) obj);
                CheckPostReceiptStatus checkPostReceiptStatus = CheckPostReceiptStatus.this;
                Object obj2 = arrayList.get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                checkPostReceiptStatus.K1((String) obj2);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(CheckPostReceiptDetailNew checkPostReceiptDetailNew) {
            if (checkPostReceiptDetailNew.size() <= 0) {
                CheckPostReceiptStatus checkPostReceiptStatus = CheckPostReceiptStatus.this;
                checkPostReceiptStatus.M1(checkPostReceiptStatus.u1().b("record_error_msg", CheckPostReceiptStatus.this.getString(R.string.service_unavable_please_try)));
                CheckPostReceiptStatus.this.t1().dismiss();
                return;
            }
            CheckPostReceiptStatus.this.t1().dismiss();
            Intent intent = new Intent(CheckPostReceiptStatus.this, (Class<?>) CheckPostSearchList.class);
            i7 i7Var = CheckPostReceiptStatus.this.binding;
            if (i7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                i7Var = null;
            }
            intent.putExtra("vehReciptNo", i7Var.d.getText().toString());
            intent.putExtra("stateCode", CheckPostReceiptStatus.this.getStateCode());
            intent.putExtra("inputType", CheckPostReceiptStatus.this.inputType);
            CheckPostReceiptStatus.this.startActivity(intent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CheckPostReceiptDetailNew) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        public final void a(CheckPostReceiptDetailNew checkPostReceiptDetailNew) {
            if (checkPostReceiptDetailNew.size() <= 0) {
                CheckPostReceiptStatus checkPostReceiptStatus = CheckPostReceiptStatus.this;
                checkPostReceiptStatus.M1(checkPostReceiptStatus.u1().b("record_error_msg", CheckPostReceiptStatus.this.getString(R.string.service_unavable_please_try)));
                CheckPostReceiptStatus.this.t1().dismiss();
                return;
            }
            CheckPostReceiptStatus.this.t1().dismiss();
            Intent intent = new Intent(CheckPostReceiptStatus.this, (Class<?>) CheckPostSearchList.class);
            i7 i7Var = CheckPostReceiptStatus.this.binding;
            if (i7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                i7Var = null;
            }
            intent.putExtra("vehReciptNo", i7Var.b.getText().toString());
            intent.putExtra("stateCode", CheckPostReceiptStatus.this.getStateCode());
            intent.putExtra("inputType", CheckPostReceiptStatus.this.inputType);
            CheckPostReceiptStatus.this.startActivity(intent);
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
            Log.e("ErrorCheck", str);
            if (CheckPostReceiptStatus.this.t1().isShowing()) {
                CheckPostReceiptStatus.this.t1().dismiss();
                CheckPostReceiptStatus.this.M1("Record Not Available");
            }
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
            Log.e("ErrorCheck", str);
            if (CheckPostReceiptStatus.this.t1().isShowing()) {
                CheckPostReceiptStatus.this.t1().dismiss();
                CheckPostReceiptStatus checkPostReceiptStatus = CheckPostReceiptStatus.this;
                checkPostReceiptStatus.M1(checkPostReceiptStatus.u1().b("record_error_msg", CheckPostReceiptStatus.this.getString(R.string.service_unavable_please_try)));
            }
        }
    }

    public static final class g implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public g(Function1 function) {
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

    public static final void A1(CheckPostReceiptStatus this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        i7 i7Var = this$0.binding;
        i7 i7Var2 = null;
        if (i7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i7Var = null;
        }
        if (i7Var.e.isSelected()) {
            this$0.inputType = "";
            i7 i7Var3 = this$0.binding;
            if (i7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                i7Var3 = null;
            }
            i7Var3.e.setChecked(false);
            i7 i7Var4 = this$0.binding;
            if (i7Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                i7Var4 = null;
            }
            i7Var4.e.setSelected(false);
            i7 i7Var5 = this$0.binding;
            if (i7Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                i7Var2 = i7Var5;
            }
            i7Var2.f.setBackgroundResource(R.drawable.corner_circle_bg_14);
            return;
        }
        i7 i7Var6 = this$0.binding;
        if (i7Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i7Var6 = null;
        }
        i7Var6.e.setChecked(true);
        i7 i7Var7 = this$0.binding;
        if (i7Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i7Var7 = null;
        }
        i7Var7.e.setSelected(true);
        i7 i7Var8 = this$0.binding;
        if (i7Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i7Var8 = null;
        }
        i7Var8.n.setChecked(false);
        i7 i7Var9 = this$0.binding;
        if (i7Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i7Var9 = null;
        }
        i7Var9.n.setSelected(false);
        i7 i7Var10 = this$0.binding;
        if (i7Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i7Var10 = null;
        }
        i7Var10.f.setBackgroundResource(R.drawable.corner_circle_14_selected);
        i7 i7Var11 = this$0.binding;
        if (i7Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i7Var11 = null;
        }
        i7Var11.m.setBackgroundResource(R.drawable.corner_circle_bg_14);
        i7 i7Var12 = this$0.binding;
        if (i7Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i7Var12 = null;
        }
        Editable text = i7Var12.d.getText();
        if (text != null) {
            text.clear();
        }
        i7 i7Var13 = this$0.binding;
        if (i7Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i7Var13 = null;
        }
        i7Var13.d.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(15)});
        i7 i7Var14 = this$0.binding;
        if (i7Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i7Var14 = null;
        }
        i7Var14.d.setVisibility(0);
        this$0.inputType = "Receipt";
        i7 i7Var15 = this$0.binding;
        if (i7Var15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i7Var15 = null;
        }
        i7Var15.d.setHint(this$0.u1().b("enter_FancyRecpNo", this$0.getString(R.string.enter_receipt_number)));
        i7 i7Var16 = this$0.binding;
        if (i7Var16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i7Var16 = null;
        }
        i7Var16.d.setError(null);
        i7 i7Var17 = this$0.binding;
        if (i7Var17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            i7Var2 = i7Var17;
        }
        i7Var2.l.setVisibility(8);
    }

    public static final void B1(CheckPostReceiptStatus this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        i7 i7Var = this$0.binding;
        i7 i7Var2 = null;
        if (i7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i7Var = null;
        }
        if (i7Var.n.isSelected()) {
            this$0.inputType = "";
            i7 i7Var3 = this$0.binding;
            if (i7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                i7Var3 = null;
            }
            i7Var3.n.setChecked(false);
            i7 i7Var4 = this$0.binding;
            if (i7Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                i7Var4 = null;
            }
            i7Var4.n.setSelected(false);
            i7 i7Var5 = this$0.binding;
            if (i7Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                i7Var2 = i7Var5;
            }
            i7Var2.m.setBackgroundResource(R.drawable.corner_circle_bg_14);
            return;
        }
        i7 i7Var6 = this$0.binding;
        if (i7Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i7Var6 = null;
        }
        i7Var6.e.setChecked(false);
        i7 i7Var7 = this$0.binding;
        if (i7Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i7Var7 = null;
        }
        i7Var7.e.setSelected(false);
        i7 i7Var8 = this$0.binding;
        if (i7Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i7Var8 = null;
        }
        i7Var8.n.setChecked(true);
        i7 i7Var9 = this$0.binding;
        if (i7Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i7Var9 = null;
        }
        i7Var9.n.setSelected(true);
        i7 i7Var10 = this$0.binding;
        if (i7Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i7Var10 = null;
        }
        i7Var10.f.setBackgroundResource(R.drawable.corner_circle_bg_14);
        i7 i7Var11 = this$0.binding;
        if (i7Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i7Var11 = null;
        }
        i7Var11.m.setBackgroundResource(R.drawable.corner_circle_14_selected);
        i7 i7Var12 = this$0.binding;
        if (i7Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i7Var12 = null;
        }
        Editable text = i7Var12.d.getText();
        if (text != null) {
            text.clear();
        }
        i7 i7Var13 = this$0.binding;
        if (i7Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i7Var13 = null;
        }
        i7Var13.d.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(10)});
        i7 i7Var14 = this$0.binding;
        if (i7Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i7Var14 = null;
        }
        i7Var14.d.setHint(this$0.getString(R.string.enter_vehicle_number));
        this$0.inputType = "Vehicle";
        i7 i7Var15 = this$0.binding;
        if (i7Var15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i7Var15 = null;
        }
        i7Var15.d.setError(null);
        i7 i7Var16 = this$0.binding;
        if (i7Var16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i7Var16 = null;
        }
        i7Var16.l.setVisibility(0);
        i7 i7Var17 = this$0.binding;
        if (i7Var17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i7Var17 = null;
        }
        i7Var17.d.setVisibility(8);
        i7 i7Var18 = this$0.binding;
        if (i7Var18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            i7Var2 = i7Var18;
        }
        i7Var2.c.setClickable(true);
        Log.e("butvehicle", this$0.inputType + "selected");
    }

    public static final void C1(CheckPostReceiptStatus this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.P1() || !kt6.d(this$0.inputType)) {
            if (Intrinsics.areEqual(this$0.inputType, "")) {
                this$0.M1(this$0.u1().b("label_challan_please_select_one_search_type", "Please select one search type"));
                return;
            }
            return;
        }
        i7 i7Var = null;
        if (Intrinsics.areEqual(this$0.inputType, "Vehicle")) {
            this$0.t1().show();
            pj0 pj0VarS1 = this$0.s1();
            String str = this$0.stateCode;
            i7 i7Var2 = this$0.binding;
            if (i7Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                i7Var = i7Var2;
            }
            pj0VarS1.l(str, StringsKt__StringsKt.trim((CharSequence) i7Var.b.getText().toString()).toString());
            return;
        }
        if (Intrinsics.areEqual(this$0.inputType, "Receipt")) {
            this$0.t1().show();
            pj0 pj0VarS12 = this$0.s1();
            i7 i7Var3 = this$0.binding;
            if (i7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                i7Var = i7Var3;
            }
            pj0VarS12.k(StringsKt__StringsKt.trim((CharSequence) i7Var.d.getText().toString()).toString());
        }
    }

    public static final void D1(CheckPostReceiptStatus this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void E1(CheckPostReceiptStatus this$0, VahanStateModle vahanStateModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.t1().dismiss();
        Log.e("got state", vahanStateModle.toString());
        try {
            VahanStateModleSubList vahanStateModleSubList = new VahanStateModleSubList();
            vahanStateModleSubList.clear();
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            Intrinsics.checkNotNull(vahanStateModle);
            vahanStateModle.add(0, vahanStateModleSubList);
            yh7 yh7Var = new yh7(this$0, vahanStateModle);
            i7 i7Var = this$0.binding;
            if (i7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                i7Var = null;
            }
            i7Var.g.setAdapter((SpinnerAdapter) yh7Var);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void N1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void O1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void z1() {
        I1(CheckPostService.INSTANCE.a(this));
        F1((pj0) new z(this, new oj0(new jj0(v1()))).a(pj0.class));
        i7 i7Var = this.binding;
        i7 i7Var2 = null;
        if (i7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i7Var = null;
        }
        i7Var.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ej0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckPostReceiptStatus.A1(this.a, view);
            }
        });
        i7 i7Var3 = this.binding;
        if (i7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i7Var3 = null;
        }
        i7Var3.n.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckPostReceiptStatus.B1(this.a, view);
            }
        });
        i7 i7Var4 = this.binding;
        if (i7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i7Var4 = null;
        }
        i7Var4.c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckPostReceiptStatus.C1(this.a, view);
            }
        });
        i7 i7Var5 = this.binding;
        if (i7Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            i7Var2 = i7Var5;
        }
        i7Var2.d.addTextChangedListener(new a());
    }

    public final void F1(pj0 pj0Var) {
        Intrinsics.checkNotNullParameter(pj0Var, "<set-?>");
        this.checkpostViewModel = pj0Var;
    }

    public final void G1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.dialog = progressDialog;
    }

    public final void H1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void I1(CheckPostService checkPostService) {
        Intrinsics.checkNotNullParameter(checkPostService, "<set-?>");
        this.mRcService = checkPostService;
    }

    public final void J1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void K1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCode = str;
    }

    public final void L1(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    public final void M1(String it) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
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
        View viewFindViewById3 = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        textView2.setVisibility(8);
        textView.setText(u1().b("btn_ok", getString(R.string.ok_txt)));
        textView.setBackground(yy0.e(this, R.drawable.shape_red));
        textView.setTextColor(yy0.c(this, R.color.white));
        ((TextView) viewFindViewById).setText(it);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckPostReceiptStatus.N1(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ij0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckPostReceiptStatus.O1(dialog, view);
            }
        });
        dialog.show();
    }

    public final boolean P1() {
        i7 i7Var = null;
        if (Intrinsics.areEqual(this.inputType, "Vehicle")) {
            i7 i7Var2 = this.binding;
            if (i7Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                i7Var2 = null;
            }
            if (i7Var2.g.getSelectedItemPosition() == 0) {
                Toast.makeText(this, u1().b("label_log_sel_state", getString(R.string.please_selecr_State)), 0).show();
                return true;
            }
            i7 i7Var3 = this.binding;
            if (i7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                i7Var3 = null;
            }
            if (i7Var3.b.length() < 3) {
                i7 i7Var4 = this.binding;
                if (i7Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    i7Var4 = null;
                }
                i7Var4.b.setError(u1().b("enter_vehicle_no", getString(R.string.enter_rc_no_for_pending_transaction)));
                i7 i7Var5 = this.binding;
                if (i7Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    i7Var = i7Var5;
                }
                i7Var.b.requestFocus();
                return true;
            }
            i7 i7Var6 = this.binding;
            if (i7Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                i7Var6 = null;
            }
            Editable text = i7Var6.b.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            if (!new Regex("[a-zA-Z0-9]*").matches(text)) {
                i7 i7Var7 = this.binding;
                if (i7Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    i7Var7 = null;
                }
                i7Var7.d.setError(u1().b("label_challan_invalid_vehicle_no", getString(R.string.invalid_rc_no)));
                i7 i7Var8 = this.binding;
                if (i7Var8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    i7Var = i7Var8;
                }
                i7Var.d.requestFocus();
                return true;
            }
            i7 i7Var9 = this.binding;
            if (i7Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                i7Var9 = null;
            }
            if (i7Var9.b.getText().toString().length() < 5) {
                i7 i7Var10 = this.binding;
                if (i7Var10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    i7Var10 = null;
                }
                i7Var10.b.setError(u1().b("label_challan_valid_chassis_no", "Please enter the valid last 5 digit of chassis no."));
                i7 i7Var11 = this.binding;
                if (i7Var11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    i7Var = i7Var11;
                }
                i7Var.b.requestFocus();
                return true;
            }
        } else if (Intrinsics.areEqual(this.inputType, "Receipt")) {
            i7 i7Var12 = this.binding;
            if (i7Var12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                i7Var12 = null;
            }
            if (i7Var12.d.getText().length() == 0) {
                i7 i7Var13 = this.binding;
                if (i7Var13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    i7Var13 = null;
                }
                i7Var13.d.setError(u1().b("pls_enter_FancyRecpNo", getString(R.string.please_enter_rcpt_no)));
                i7 i7Var14 = this.binding;
                if (i7Var14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    i7Var = i7Var14;
                }
                i7Var.d.requestFocus();
                return true;
            }
            i7 i7Var15 = this.binding;
            if (i7Var15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                i7Var15 = null;
            }
            if (i7Var15.d.getText().length() < 5) {
                i7 i7Var16 = this.binding;
                if (i7Var16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    i7Var16 = null;
                }
                i7Var16.d.setError(u1().b("please_enter_rcpt_no5_char", getString(R.string.please_enter5_char_rcpt_no)));
                i7 i7Var17 = this.binding;
                if (i7Var17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    i7Var = i7Var17;
                }
                i7Var.d.requestFocus();
                return true;
            }
        }
        return false;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        i7 i7VarC = i7.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(i7VarC, "inflate(...)");
        this.binding = i7VarC;
        i7 i7Var = null;
        if (i7VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i7VarC = null;
        }
        setContentView(i7VarC.b());
        H1(new wa3(this));
        J1(VahanProService.INSTANCE.a(this));
        ta3.a aVar = ta3.a;
        i7 i7Var2 = this.binding;
        if (i7Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i7Var2 = null;
        }
        aVar.X(this, i7Var2);
        G1(new ProgressDialog(this));
        t1().setMessage(u1().b("label_challan_please_wait", "Please wait..."));
        t1().setCancelable(false);
        t1().setCanceledOnTouchOutside(false);
        L1((ld7) new z(this, new kd7(new jd7(w1()))).a(ld7.class));
        z1();
        i7 i7Var3 = this.binding;
        if (i7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i7Var3 = null;
        }
        i7Var3.k.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckPostReceiptStatus.D1(this.a, view);
            }
        });
        try {
            t1().show();
            y1().a1(this);
        } catch (Exception unused) {
        }
        y1().Z0().g(this, new mf4() { // from class: com.zepto.dj0
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                CheckPostReceiptStatus.E1(this.a, (VahanStateModle) obj);
            }
        });
        i7 i7Var4 = this.binding;
        if (i7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            i7Var = i7Var4;
        }
        Spinner spinner = i7Var.g;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(new b());
        }
        s1().g().g(this, new g(new c()));
        s1().i().g(this, new g(new d()));
        s1().h().g(this, new g(new e()));
        s1().j().g(this, new g(new f()));
    }

    public final pj0 s1() {
        pj0 pj0Var = this.checkpostViewModel;
        if (pj0Var != null) {
            return pj0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("checkpostViewModel");
        return null;
    }

    public final ProgressDialog t1() {
        ProgressDialog progressDialog = this.dialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dialog");
        return null;
    }

    public final wa3 u1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final CheckPostService v1() {
        CheckPostService checkPostService = this.mRcService;
        if (checkPostService != null) {
            return checkPostService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRcService");
        return null;
    }

    public final VahanProService w1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    /* JADX INFO: renamed from: x1, reason: from getter */
    public final String getStateCode() {
        return this.stateCode;
    }

    public final ld7 y1() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }
}
