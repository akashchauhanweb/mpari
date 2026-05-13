package com.nic.mparivahan.VahanServices.SpecialPermit;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicateFitnessService;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.CalculateValidity.CalValidity;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.FeeModel.ApiMessage;
import com.nic.mparivahan.VahanServices.SpecialPermit.SPermitBasicDetailActivity;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.zepto.j37;
import com.zepto.jg;
import com.zepto.mf4;
import com.zepto.n47;
import com.zepto.o47;
import com.zepto.pq;
import com.zepto.wa3;
import com.zepto.wd6;
import com.zepto.xd6;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bk\u0010lJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010$\u001a\n !*\u0004\u0018\u00010 0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010+\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R&\u0010@\u001a\u0012\u0012\u0004\u0012\u00020\t0<j\b\u0012\u0004\u0012\u00020\t`=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R&\u0010B\u001a\u0012\u0012\u0004\u0012\u00020\t0<j\b\u0012\u0004\u0012\u00020\t`=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010?R\u0016\u0010D\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010&R\u0016\u0010F\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010&R\u0016\u0010H\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010&R\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\"\u0010P\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010&\u001a\u0004\bN\u0010(\"\u0004\bO\u0010*R\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010\\\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010&\u001a\u0004\bZ\u0010(\"\u0004\b[\u0010*R\"\u0010`\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010&\u001a\u0004\b^\u0010(\"\u0004\b_\u0010*R\"\u0010d\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010&\u001a\u0004\bb\u0010(\"\u0004\bc\u0010*R\"\u0010j\u001a\u00020I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010K\u001a\u0004\bf\u0010g\"\u0004\bh\u0010i¨\u0006m"}, d2 = {"Lcom/nic/mparivahan/VahanServices/SpecialPermit/SPermitBasicDetailActivity;", "Lcom/zepto/pq;", "", "J1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "O1", "Lcom/zepto/jg;", "C", "Lcom/zepto/jg;", "binding", "Lcom/zepto/o47;", "D", "Lcom/zepto/o47;", "B1", "()Lcom/zepto/o47;", "S1", "(Lcom/zepto/o47;)V", "fitnessDraftViewModle", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "E", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "C1", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "T1", "(Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;)V", "fitnessService", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "F", "Ljava/util/Calendar;", "cal", "G", "Ljava/lang/String;", "D1", "()Ljava/lang/String;", "U1", "(Ljava/lang/String;)V", "formated_date", "Landroid/app/ProgressDialog;", "H", "Landroid/app/ProgressDialog;", "G1", "()Landroid/app/ProgressDialog;", "X1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/wa3;", "I", "Lcom/zepto/wa3;", "E1", "()Lcom/zepto/wa3;", "V1", "(Lcom/zepto/wa3;)V", "languageKeySession", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "J", "Ljava/util/ArrayList;", "serviceTypeArrayList", "K", "natureOfGoodsArrayList", "L", "periodModeSelectedValue", "M", "periodCountValue", "N", "validUpto", "", "O", "Z", "addPassengerEnable", "P", "H1", "Y1", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "Q", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "I1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "Z1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "R", "F1", "W1", "off_code", "S", "A1", "R1", "aadhar_name", "T", "z1", "Q1", "aadhar_address", "U", "N1", "()Z", "setFaceless", "(Z)V", "isFaceless", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class SPermitBasicDetailActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public jg binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public o47 fitnessDraftViewModle;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public DuplicateFitnessService fitnessService;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String formated_date;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public boolean addPassengerEnable;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ArrayList serviceTypeArrayList = new ArrayList();

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ArrayList natureOfGoodsArrayList = new ArrayList();

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String periodModeSelectedValue = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String periodCountValue = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String validUpto = "";

    public static final class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            jg jgVar = null;
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            SPermitBasicDetailActivity sPermitBasicDetailActivity = SPermitBasicDetailActivity.this;
            Object itemAtPosition = adapterView.getItemAtPosition(i);
            Intrinsics.checkNotNull(itemAtPosition, "null cannot be cast to non-null type kotlin.String");
            sPermitBasicDetailActivity.periodModeSelectedValue = (String) itemAtPosition;
            jg jgVar2 = SPermitBasicDetailActivity.this.binding;
            if (jgVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jgVar2 = null;
            }
            if (jgVar2.D.getSelectedItemPosition() != 0) {
                jg jgVar3 = SPermitBasicDetailActivity.this.binding;
                if (jgVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jgVar3 = null;
                }
                if (StringsKt__StringsJVMKt.equals(jgVar3.D.getSelectedItem().toString(), "Days", true)) {
                    ArrayList arrayListE = VContant.INSTANCE.E();
                    arrayListE.add(0, "Select Days");
                    Context applicationContext = SPermitBasicDetailActivity.this.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    wd6 wd6Var = new wd6(applicationContext, arrayListE);
                    jg jgVar4 = SPermitBasicDetailActivity.this.binding;
                    if (jgVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        jgVar = jgVar4;
                    }
                    jgVar.C.setAdapter((SpinnerAdapter) wd6Var);
                    return;
                }
                jg jgVar5 = SPermitBasicDetailActivity.this.binding;
                if (jgVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jgVar5 = null;
                }
                if (StringsKt__StringsJVMKt.equals(jgVar5.D.getSelectedItem().toString(), "Weeks", true)) {
                    ArrayList arrayListG = VContant.INSTANCE.G();
                    arrayListG.add(0, "Select Weeks");
                    Context applicationContext2 = SPermitBasicDetailActivity.this.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                    wd6 wd6Var2 = new wd6(applicationContext2, arrayListG);
                    jg jgVar6 = SPermitBasicDetailActivity.this.binding;
                    if (jgVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        jgVar = jgVar6;
                    }
                    jgVar.C.setAdapter((SpinnerAdapter) wd6Var2);
                    return;
                }
                jg jgVar7 = SPermitBasicDetailActivity.this.binding;
                if (jgVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jgVar7 = null;
                }
                if (StringsKt__StringsJVMKt.equals(jgVar7.D.getSelectedItem().toString(), "Months", true)) {
                    ArrayList arrayListF = VContant.INSTANCE.F();
                    arrayListF.add(0, "Select Months");
                    Context applicationContext3 = SPermitBasicDetailActivity.this.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext3, "getApplicationContext(...)");
                    wd6 wd6Var3 = new wd6(applicationContext3, arrayListF);
                    jg jgVar8 = SPermitBasicDetailActivity.this.binding;
                    if (jgVar8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        jgVar = jgVar8;
                    }
                    jgVar.C.setAdapter((SpinnerAdapter) wd6Var3);
                }
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            SPermitBasicDetailActivity sPermitBasicDetailActivity = SPermitBasicDetailActivity.this;
            Object itemAtPosition = adapterView.getItemAtPosition(i);
            Intrinsics.checkNotNull(itemAtPosition, "null cannot be cast to non-null type kotlin.String");
            sPermitBasicDetailActivity.periodCountValue = (String) itemAtPosition;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(SpecialPermitDetail specialPermitDetail) {
            if (SPermitBasicDetailActivity.this.G1().isShowing()) {
                SPermitBasicDetailActivity.this.G1().dismiss();
            }
            ApiMessage apiMessage = specialPermitDetail.getApiMessage();
            Intrinsics.checkNotNull(apiMessage);
            Integer statusCode = apiMessage.getStatusCode();
            if (statusCode != null && statusCode.intValue() == 200) {
                String allotmentOffice = specialPermitDetail.getData().getAllotmentOffice();
                Intrinsics.checkNotNull(allotmentOffice);
                jg jgVar = null;
                if (allotmentOffice.length() > 0) {
                    jg jgVar2 = SPermitBasicDetailActivity.this.binding;
                    if (jgVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        jgVar2 = null;
                    }
                    jgVar2.x.setText(specialPermitDetail.getData().getAllotmentOffice());
                }
                SPermitBasicDetailActivity.this.serviceTypeArrayList = specialPermitDetail.getData().getVmServiceType();
                SPermitBasicDetailActivity.this.natureOfGoodsArrayList = specialPermitDetail.getData().getNatureOfGoods();
                SPermitBasicDetailActivity.this.addPassengerEnable = specialPermitDetail.getData().getTmConfigSpecialPermitDetails().getPassengerListSpl();
                ArrayList<String> periodMode = specialPermitDetail.getData().getPeriodMode();
                periodMode.add(0, "Select Period Mode");
                xd6 xd6Var = new xd6(SPermitBasicDetailActivity.this, periodMode);
                jg jgVar3 = SPermitBasicDetailActivity.this.binding;
                if (jgVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    jgVar = jgVar3;
                }
                jgVar.D.setAdapter((SpinnerAdapter) xd6Var);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SpecialPermitDetail) obj);
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
            if (SPermitBasicDetailActivity.this.G1().isShowing()) {
                SPermitBasicDetailActivity.this.G1().dismiss();
            }
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
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
        public final void a(CalValidity calValidity) {
            if (SPermitBasicDetailActivity.this.G1().isShowing()) {
                SPermitBasicDetailActivity.this.G1().dismiss();
            }
            try {
                if (calValidity.getApiMessage().getStatusCode() != 200) {
                    if (calValidity.getApiMessage().getStatusCode() != 400 || calValidity.getApiMessage().getDeveloperMessage().length() <= 0) {
                        return;
                    }
                    SPermitBasicDetailActivity sPermitBasicDetailActivity = SPermitBasicDetailActivity.this;
                    sPermitBasicDetailActivity.O1(sPermitBasicDetailActivity, calValidity.getApiMessage().getDeveloperMessage());
                    return;
                }
                SPermitBasicDetailActivity.this.validUpto = String.valueOf(calValidity.getData().getValidUpto());
                Intent intent = new Intent(SPermitBasicDetailActivity.this, (Class<?>) SPermitRouteActivity.class);
                intent.putStringArrayListExtra("serviceType", SPermitBasicDetailActivity.this.serviceTypeArrayList);
                intent.putStringArrayListExtra("natureOfGoods", SPermitBasicDetailActivity.this.natureOfGoodsArrayList);
                jg jgVar = SPermitBasicDetailActivity.this.binding;
                jg jgVar2 = null;
                if (jgVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    jgVar = null;
                }
                intent.putExtra("validDate", jgVar.N.getText().toString());
                intent.putExtra("periodMode", SPermitBasicDetailActivity.this.periodModeSelectedValue);
                intent.putExtra("periodCount", SPermitBasicDetailActivity.this.periodCountValue);
                intent.putExtra("validUpto", SPermitBasicDetailActivity.this.validUpto);
                intent.putExtra("addPassangerEnable", SPermitBasicDetailActivity.this.addPassengerEnable);
                jg jgVar3 = SPermitBasicDetailActivity.this.binding;
                if (jgVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    jgVar2 = jgVar3;
                }
                intent.putExtra("allotmentOffice", jgVar2.x.getText().toString());
                intent.putExtra("RC", SPermitBasicDetailActivity.this.H1());
                intent.putExtra("RcDetails", SPermitBasicDetailActivity.this.I1());
                intent.putExtra("off_code", SPermitBasicDetailActivity.this.F1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, SPermitBasicDetailActivity.this.getIsFaceless());
                intent.putExtra(VContant.NEXGEN_addahar_name, SPermitBasicDetailActivity.this.A1());
                intent.putExtra(VContant.NEXGEN_addahar_address, SPermitBasicDetailActivity.this.z1());
                SPermitBasicDetailActivity.this.startActivity(intent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CalValidity) obj);
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
            if (SPermitBasicDetailActivity.this.G1().isShowing()) {
                SPermitBasicDetailActivity.this.G1().dismiss();
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

    private final void J1() {
        String strL = VContant.INSTANCE.L(this, VContant.SPEICAL_PERMIT_PURPOSE_CODE);
        jg jgVar = this.binding;
        jg jgVar2 = null;
        if (jgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jgVar = null;
        }
        jgVar.L.i.setText(strL);
        S1((o47) new z(this, new n47(new j37(C1()))).a(o47.class));
        try {
            G1().show();
            o47 o47VarB1 = B1();
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            o47VarB1.G(applicationContext, H1(), I1().getState_cd(), I1().getRc_off_cd());
        } catch (Exception e2) {
            e2.printStackTrace();
            if (G1().isShowing()) {
                G1().dismiss();
            }
        }
        jg jgVar3 = this.binding;
        if (jgVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jgVar3 = null;
        }
        jgVar3.z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sg5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SPermitBasicDetailActivity.K1(this.a, view);
            }
        });
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.tg5
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                SPermitBasicDetailActivity.L1(this.a, datePicker, i, i2, i3);
            }
        };
        jg jgVar4 = this.binding;
        if (jgVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jgVar4 = null;
        }
        jgVar4.N.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ug5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SPermitBasicDetailActivity.M1(this.a, onDateSetListener, view);
            }
        });
        jg jgVar5 = this.binding;
        if (jgVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jgVar5 = null;
        }
        jgVar5.D.setOnItemSelectedListener(new a());
        jg jgVar6 = this.binding;
        if (jgVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            jgVar2 = jgVar6;
        }
        jgVar2.C.setOnItemSelectedListener(new b());
    }

    public static final void K1(SPermitBasicDetailActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        jg jgVar = this$0.binding;
        jg jgVar2 = null;
        if (jgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jgVar = null;
        }
        CharSequence text = jgVar.N.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0) {
            Toast.makeText(this$0, this$0.E1().b("pls_enterTempValidFromDate", this$0.getString(R.string.please_select_form_date)), 1).show();
            return;
        }
        jg jgVar3 = this$0.binding;
        if (jgVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jgVar3 = null;
        }
        if (jgVar3.D.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.E1().b("pls_SelectTempPeriodMode", this$0.getString(R.string.pls_select_temp_period_mode)), 1).show();
            return;
        }
        jg jgVar4 = this$0.binding;
        if (jgVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jgVar4 = null;
        }
        if (jgVar4.C.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.E1().b("please_select_the_period", this$0.getString(R.string.please_select_the_period)), 1).show();
            return;
        }
        try {
            this$0.G1().show();
            o47 o47VarB1 = this$0.B1();
            Context applicationContext = this$0.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            String strValueOf = String.valueOf(this$0.I1().getState_cd());
            String strD1 = this$0.D1();
            jg jgVar5 = this$0.binding;
            if (jgVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                jgVar5 = null;
            }
            String string = jgVar5.D.getSelectedItem().toString();
            jg jgVar6 = this$0.binding;
            if (jgVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                jgVar2 = jgVar6;
            }
            o47VarB1.h(applicationContext, strValueOf, strD1, string, jgVar2.C.getSelectedItem().toString());
        } catch (Exception e2) {
            e2.printStackTrace();
            if (this$0.G1().isShowing()) {
                this$0.G1().dismiss();
            }
        }
    }

    public static final void L1(SPermitBasicDetailActivity this$0, DatePicker datePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cal.set(1, i);
        this$0.cal.set(2, i2);
        this$0.cal.set(5, i3);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence charSequence = DateFormat.format("dd", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence2 = DateFormat.format("MM", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence3 = DateFormat.format("yyyy", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence3, "null cannot be cast to non-null type kotlin.String");
        this$0.U1(((String) charSequence3) + '-' + ((String) charSequence2) + '-' + ((String) charSequence));
        jg jgVar = this$0.binding;
        if (jgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jgVar = null;
        }
        jgVar.N.setText(simpleDateFormat.format(this$0.cal.getTime()));
    }

    public static final void M1(SPermitBasicDetailActivity this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        try {
            DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListener, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
            datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis());
            datePickerDialog.show();
            datePickerDialog.getButton(-2).setTextColor(-16777216);
            datePickerDialog.getButton(-1).setTextColor(-65536);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void P1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public final String A1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final o47 B1() {
        o47 o47Var = this.fitnessDraftViewModle;
        if (o47Var != null) {
            return o47Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fitnessDraftViewModle");
        return null;
    }

    public final DuplicateFitnessService C1() {
        DuplicateFitnessService duplicateFitnessService = this.fitnessService;
        if (duplicateFitnessService != null) {
            return duplicateFitnessService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fitnessService");
        return null;
    }

    public final String D1() {
        String str = this.formated_date;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("formated_date");
        return null;
    }

    public final wa3 E1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final String F1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    public final ProgressDialog G1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String H1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails I1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    /* JADX INFO: renamed from: N1, reason: from getter */
    public final boolean getIsFaceless() {
        return this.isFaceless;
    }

    public final void O1(Context context, String message) {
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
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        wa3 wa3Var = new wa3(context);
        ((TextView) viewFindViewById3).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(wa3Var.b("btn_ok", context.getString(R.string.ok_txt)));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rg5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SPermitBasicDetailActivity.P1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void Q1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void R1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void S1(o47 o47Var) {
        Intrinsics.checkNotNullParameter(o47Var, "<set-?>");
        this.fitnessDraftViewModle = o47Var;
    }

    public final void T1(DuplicateFitnessService duplicateFitnessService) {
        Intrinsics.checkNotNullParameter(duplicateFitnessService, "<set-?>");
        this.fitnessService = duplicateFitnessService;
    }

    public final void U1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.formated_date = str;
    }

    public final void V1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void W1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void X1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void Y1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void Z1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        jg jgVarX = jg.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(jgVarX, "inflate(...)");
        this.binding = jgVarX;
        if (jgVarX == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            jgVarX = null;
        }
        setContentView(jgVarX.m());
        V1(new wa3(this));
        T1(DuplicateFitnessService.INSTANCE.a(this));
        W1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        R1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        Q1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Y1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        Z1((NrvDetails) serializableExtra);
        X1(new ProgressDialog(this));
        G1().setMessage(E1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        G1().setCancelable(false);
        G1().setCanceledOnTouchOutside(false);
        J1();
        B1().I().g(this, new g(new c()));
        B1().H().g(this, new g(new d()));
        B1().k().g(this, new g(new e()));
        B1().l().g(this, new g(new f()));
    }

    public final String z1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }
}
