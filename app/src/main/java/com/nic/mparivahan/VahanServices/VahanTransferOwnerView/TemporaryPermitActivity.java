package com.nic.mparivahan.VahanServices.VahanTransferOwnerView;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.google.gson.Gson;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicateFitnessService;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.CalculateValidity.CalValidity;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.DetailModle.TmConfigurationTempPmt;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.PassangerResultActivity;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.ApiMessage;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.SubmitForTempPermit;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.TempSubmitResponse;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.TempDetailsModel;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.TemporaryPermitActivity;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanCommonConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.gd1;
import com.zepto.gf;
import com.zepto.hf;
import com.zepto.hz0;
import com.zepto.j37;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.le6;
import com.zepto.mf;
import com.zepto.mf4;
import com.zepto.n47;
import com.zepto.o47;
import com.zepto.of;
import com.zepto.pq;
import com.zepto.ta3;
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
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0015J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010B\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010N\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010=\u001a\u0004\bL\u0010?\"\u0004\bM\u0010AR\"\u0010R\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010=\u001a\u0004\bP\u0010?\"\u0004\bQ\u0010AR\"\u0010V\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010=\u001a\u0004\bT\u0010?\"\u0004\bU\u0010AR\"\u0010^\u001a\u00020W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R*\u0010g\u001a\n `*\u0004\u0018\u00010_0_8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010k\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010=\u001a\u0004\bi\u0010?\"\u0004\bj\u0010AR\"\u0010s\u001a\u00020l8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR2\u0010}\u001a\u0012\u0012\u0004\u0012\u00020u0tj\b\u0012\u0004\u0012\u00020u`v8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R5\u0010\u0082\u0001\u001a\u0012\u0012\u0004\u0012\u00020~0tj\b\u0012\u0004\u0012\u00020~`v8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u007f\u0010x\u001a\u0005\b\u0080\u0001\u0010z\"\u0005\b\u0081\u0001\u0010|R&\u0010\u0084\u0001\u001a\u00020W8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010Y\u001a\u0005\b\u0084\u0001\u0010[\"\u0005\b\u0085\u0001\u0010]R(\u0010\u008a\u0001\u001a\u0013\u0012\u000e\u0012\f `*\u0005\u0018\u00010\u0087\u00010\u0087\u00010\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001¨\u0006\u008d\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/TemporaryPermitActivity;", "Lcom/zepto/pq;", "", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "Y1", "Lcom/zepto/le6;", "C", "Lcom/zepto/le6;", "s1", "()Lcom/zepto/le6;", "M1", "(Lcom/zepto/le6;)V", "binding", "Lcom/zepto/ld7;", "D", "Lcom/zepto/ld7;", "getViewModel", "()Lcom/zepto/ld7;", "X1", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "E", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "C1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "W1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Lcom/zepto/o47;", "F", "Lcom/zepto/o47;", "t1", "()Lcom/zepto/o47;", "N1", "(Lcom/zepto/o47;)V", "fitnessDraftViewModle", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "G", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "u1", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "O1", "(Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;)V", "fitnessService", "Landroid/app/ProgressDialog;", "H", "Landroid/app/ProgressDialog;", "y1", "()Landroid/app/ProgressDialog;", "S1", "(Landroid/app/ProgressDialog;)V", "pDialog", "I", "Ljava/lang/String;", "z1", "()Ljava/lang/String;", "U1", "(Ljava/lang/String;)V", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "J", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "A1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "V1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "K", "x1", "R1", "off_code", "L", "r1", "L1", "aadhar_name", "M", "q1", "K1", "aadhar_address", "", "N", "Z", "D1", "()Z", "setFaceless", "(Z)V", "isFaceless", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "O", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "P", "v1", "P1", "formated_date", "Lcom/zepto/wa3;", "Q", "Lcom/zepto/wa3;", "w1", "()Lcom/zepto/wa3;", "Q1", "(Lcom/zepto/wa3;)V", "languageKeySession", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicatePermitModel/Doclist;", "Lkotlin/collections/ArrayList;", "R", "Ljava/util/ArrayList;", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "list", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/TempPermitModel/Submit/VaSplPassengerdto;", "S", "getPassangeList", "setPassangeList", "passangeList", "T", "isPassangerListAttach", "T1", "Lcom/zepto/of;", "Landroid/content/Intent;", "U", "Lcom/zepto/of;", "getResult", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class TemporaryPermitActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public le6 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ld7 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public o47 fitnessDraftViewModle;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public DuplicateFitnessService fitnessService;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String formated_date;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public boolean isPassangerListAttach;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public final of getResult;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public ArrayList list = new ArrayList();

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public ArrayList passangeList = new ArrayList();

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            TemporaryPermitActivity.this.y1().dismiss();
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
        public final void a(TempSubmitResponse tempSubmitResponse) {
            TemporaryPermitActivity.this.y1().dismiss();
            gd1.a aVar = gd1.a;
            Data data = tempSubmitResponse.getData();
            if (aVar.m(data != null ? data.getApplNo() : null)) {
                TemporaryPermitActivity temporaryPermitActivity = TemporaryPermitActivity.this;
                ApiMessage apiMessage = tempSubmitResponse.getApiMessage();
                temporaryPermitActivity.Y1(temporaryPermitActivity, apiMessage != null ? apiMessage.getDeveloperMessage() : null);
                return;
            }
            try {
                Gson gson = new Gson();
                Data data2 = (Data) gson.fromJson(gson.toJson(tempSubmitResponse.getData()).toString(), Data.class);
                Intent intent = new Intent(TemporaryPermitActivity.this, (Class<?>) VahanCommonConfirmationScreen.class);
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.TEMPERMIT_CODE);
                intent.putExtra(VContant.TEMPERMIT_CODE, data2);
                Data data3 = tempSubmitResponse.getData();
                intent.putExtra(VContant.APP_NO, data3 != null ? data3.getApplNo() : null);
                intent.putExtra("state_code", TemporaryPermitActivity.this.A1().getState_cd());
                intent.putExtra("rc_number", TemporaryPermitActivity.this.z1());
                intent.putExtra(VContant.PURPOSE_CODE, VContant.TempPermit_PURPOSE_CODE);
                intent.putExtra("off_code", TemporaryPermitActivity.this.x1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, TemporaryPermitActivity.this.getIsFaceless());
                intent.putExtra("RC", TemporaryPermitActivity.this.z1());
                intent.putExtra("RcDetails", TemporaryPermitActivity.this.A1());
                intent.putExtra(VContant.NEXGEN_addahar_name, TemporaryPermitActivity.this.r1());
                intent.putExtra(VContant.NEXGEN_addahar_address, TemporaryPermitActivity.this.q1());
                TemporaryPermitActivity.this.startActivity(intent);
                TemporaryPermitActivity.this.finish();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((TempSubmitResponse) obj);
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
            TemporaryPermitActivity.this.y1().dismiss();
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
            TemporaryPermitActivity.this.y1().dismiss();
        }
    }

    public static final class e implements AdapterView.OnItemSelectedListener {
        public e() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            if (TemporaryPermitActivity.this.s1().r.getSelectedItemPosition() != 0) {
                if (StringsKt__StringsJVMKt.equals(TemporaryPermitActivity.this.s1().r.getSelectedItem().toString(), "Days", true)) {
                    ArrayList arrayListE = VContant.INSTANCE.E();
                    arrayListE.add(0, "Select Days");
                    Context applicationContext = TemporaryPermitActivity.this.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    TemporaryPermitActivity.this.s1().q.setAdapter((SpinnerAdapter) new wd6(applicationContext, arrayListE));
                    TemporaryPermitActivity.this.s1().e.setText("");
                    TemporaryPermitActivity.this.s1().O.setText("");
                    TemporaryPermitActivity.this.s1().l.setVisibility(8);
                    TemporaryPermitActivity.this.s1().O.setVisibility(8);
                    return;
                }
                if (StringsKt__StringsJVMKt.equals(TemporaryPermitActivity.this.s1().r.getSelectedItem().toString(), "Weeks", true)) {
                    ArrayList arrayListG = VContant.INSTANCE.G();
                    arrayListG.add(0, "Select Weeks");
                    Context applicationContext2 = TemporaryPermitActivity.this.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                    TemporaryPermitActivity.this.s1().q.setAdapter((SpinnerAdapter) new wd6(applicationContext2, arrayListG));
                    TemporaryPermitActivity.this.s1().e.setText("");
                    TemporaryPermitActivity.this.s1().O.setText("");
                    TemporaryPermitActivity.this.s1().l.setVisibility(8);
                    TemporaryPermitActivity.this.s1().O.setVisibility(8);
                    return;
                }
                if (StringsKt__StringsJVMKt.equals(TemporaryPermitActivity.this.s1().r.getSelectedItem().toString(), "Months", true)) {
                    ArrayList arrayListF = VContant.INSTANCE.F();
                    arrayListF.add(0, "Select Months");
                    Context applicationContext3 = TemporaryPermitActivity.this.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext3, "getApplicationContext(...)");
                    TemporaryPermitActivity.this.s1().q.setAdapter((SpinnerAdapter) new wd6(applicationContext3, arrayListF));
                    TemporaryPermitActivity.this.s1().e.setText("");
                    TemporaryPermitActivity.this.s1().O.setText("");
                    TemporaryPermitActivity.this.s1().l.setVisibility(8);
                    TemporaryPermitActivity.this.s1().O.setVisibility(8);
                }
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class f implements AdapterView.OnItemSelectedListener {
        public f() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            TemporaryPermitActivity.this.s1().e.setText("");
            TemporaryPermitActivity.this.s1().O.setText("");
            TemporaryPermitActivity.this.s1().l.setVisibility(8);
            TemporaryPermitActivity.this.s1().O.setVisibility(8);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class g implements AdapterView.OnItemSelectedListener {
        public g() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            if (TemporaryPermitActivity.this.s1().m.getSelectedItemPosition() != 0) {
                TemporaryPermitActivity.this.y1().show();
                o47 o47VarT1 = TemporaryPermitActivity.this.t1();
                TemporaryPermitActivity temporaryPermitActivity = TemporaryPermitActivity.this;
                o47VarT1.i(temporaryPermitActivity, temporaryPermitActivity.s1().m.getSelectedItem().toString(), String.valueOf(TemporaryPermitActivity.this.A1().getState_cd()));
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class h extends Lambda implements Function1 {
        public h() {
            super(1);
        }

        public final void a(TempDetailsModel tempDetailsModel) {
            TmConfigurationTempPmt tmConfigurationTempPmt;
            try {
                TemporaryPermitActivity.this.y1().dismiss();
                com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.ApiMessage apiMessage = tempDetailsModel.getApiMessage();
                if (apiMessage == null || apiMessage.getStatusCode() != 200) {
                    return;
                }
                TextView textView = TemporaryPermitActivity.this.s1().p;
                com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Data data = tempDetailsModel.getData();
                String passengerListTemp = null;
                textView.setText(data != null ? data.getAllotmentOffice() : null);
                com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Data data2 = tempDetailsModel.getData();
                ArrayList<String> periodMode = data2 != null ? data2.getPeriodMode() : null;
                if (periodMode != null) {
                    periodMode.add(0, "Select Period Mode");
                }
                TemporaryPermitActivity.this.s1().r.setAdapter((SpinnerAdapter) new xd6(TemporaryPermitActivity.this, periodMode));
                com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Data data3 = tempDetailsModel.getData();
                ArrayList<String> natureOfGoods = data3 != null ? data3.getNatureOfGoods() : null;
                if (natureOfGoods != null) {
                    natureOfGoods.add(0, "Select Nature of Goods");
                }
                TemporaryPermitActivity.this.s1().m.setAdapter((SpinnerAdapter) new xd6(TemporaryPermitActivity.this, natureOfGoods));
                com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Data data4 = tempDetailsModel.getData();
                if ((data4 != null ? data4.getGoodsType() : null) == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(0, "Select Goods");
                    TemporaryPermitActivity.this.s1().b.setAdapter((SpinnerAdapter) new xd6(TemporaryPermitActivity.this, arrayList));
                } else {
                    com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Data data5 = tempDetailsModel.getData();
                    Object goodsType = data5 != null ? data5.getGoodsType() : null;
                    Intrinsics.checkNotNull(goodsType, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    ArrayList arrayList2 = (ArrayList) goodsType;
                    arrayList2.add(0, "Select Goods");
                    TemporaryPermitActivity.this.s1().b.setAdapter((SpinnerAdapter) new xd6(TemporaryPermitActivity.this, arrayList2));
                }
                com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Data data6 = tempDetailsModel.getData();
                ArrayList<String> purposeOfJourny = data6 != null ? data6.getPurposeOfJourny() : null;
                if (purposeOfJourny != null) {
                    purposeOfJourny.add(0, "Select Journey");
                }
                TemporaryPermitActivity.this.s1().k.setAdapter((SpinnerAdapter) new xd6(TemporaryPermitActivity.this, purposeOfJourny));
                com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Data data7 = tempDetailsModel.getData();
                ArrayList<String> vmServiceType = data7 != null ? data7.getVmServiceType() : null;
                if (vmServiceType != null) {
                    vmServiceType.add(0, "Select Service Type");
                }
                TemporaryPermitActivity.this.s1().B.setAdapter((SpinnerAdapter) new xd6(TemporaryPermitActivity.this, vmServiceType));
                com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Data data8 = tempDetailsModel.getData();
                if (data8 != null && (tmConfigurationTempPmt = data8.getTmConfigurationTempPmt()) != null) {
                    passengerListTemp = tmConfigurationTempPmt.getPassengerListTemp();
                }
                if (StringsKt__StringsJVMKt.equals(passengerListTemp, "true", true)) {
                    TemporaryPermitActivity.this.T1(true);
                    TemporaryPermitActivity.this.s1().c.setVisibility(0);
                } else {
                    TemporaryPermitActivity.this.T1(false);
                    TemporaryPermitActivity.this.s1().c.setVisibility(8);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((TempDetailsModel) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class i extends Lambda implements Function1 {
        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            TemporaryPermitActivity.this.y1().dismiss();
        }
    }

    public static final class j extends Lambda implements Function1 {
        public j() {
            super(1);
        }

        public final void a(CalValidity calValidity) {
            TemporaryPermitActivity.this.y1().dismiss();
            if (calValidity.getApiMessage().getStatusCode() == 200) {
                TemporaryPermitActivity.this.s1().l.setVisibility(0);
                TemporaryPermitActivity.this.s1().O.setVisibility(0);
                TemporaryPermitActivity.this.s1().O.setText(VContant.INSTANCE.q(calValidity.getData().getValidUpto()));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CalValidity) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class k extends Lambda implements Function1 {
        public k() {
            super(1);
        }

        public final void a(CalValidity calValidity) {
            TemporaryPermitActivity.this.y1().dismiss();
            if (calValidity.getApiMessage().getStatusCode() == 200) {
                com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.CalculateValidity.Data data = calValidity.getData();
                Object goodsType = data != null ? data.getGoodsType() : null;
                Intrinsics.checkNotNull(goodsType, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                ArrayList arrayList = (ArrayList) goodsType;
                arrayList.add(0, "Select Goods");
                TemporaryPermitActivity.this.s1().b.setAdapter((SpinnerAdapter) new xd6(TemporaryPermitActivity.this, arrayList));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CalValidity) obj);
            return Unit.INSTANCE;
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

    public TemporaryPermitActivity() {
        of ofVarB0 = B0(new mf(), new hf() { // from class: com.zepto.de6
            @Override // com.zepto.hf
            public final void a(Object obj) {
                TemporaryPermitActivity.B1(this.a, (gf) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarB0, "registerForActivityResult(...)");
        this.getResult = ofVarB0;
    }

    public static final void B1(TemporaryPermitActivity this$0, gf gfVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Log.e("Calling result...", "Running..");
        if (gfVar.d() == 78) {
            Intent intentC = gfVar.c();
            Serializable serializableExtra = intentC != null ? intentC.getSerializableExtra("input") : null;
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.VaSplPassengerdto>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.VaSplPassengerdto> }");
            ArrayList arrayList = (ArrayList) serializableExtra;
            this$0.passangeList = arrayList;
            if (arrayList.size() > 0) {
                this$0.s1().c.setText("View & Edit Passanger List");
            }
        }
    }

    public static final void E1(TemporaryPermitActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.z1());
        intent.putExtra("RcDetails", this$0.A1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.r1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.q1());
        this$0.startActivity(intent);
    }

    public static final void F1(TemporaryPermitActivity this$0, DatePicker datePicker, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cal.set(1, i2);
        this$0.cal.set(2, i3);
        this$0.cal.set(5, i4);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence charSequence = DateFormat.format("dd", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence2 = DateFormat.format("MM", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence3 = DateFormat.format("yyyy", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence3, "null cannot be cast to non-null type kotlin.String");
        this$0.P1(((String) charSequence3) + '-' + ((String) charSequence2) + '-' + ((String) charSequence));
        this$0.s1().e.setText(simpleDateFormat.format(this$0.cal.getTime()));
        this$0.y1().show();
        this$0.t1().g(this$0, String.valueOf(this$0.A1().getState_cd()), this$0.v1(), this$0.s1().r.getSelectedItem().toString(), this$0.s1().q.getSelectedItem().toString());
    }

    public static final void G1(TemporaryPermitActivity this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        try {
            if (this$0.s1().r.getSelectedItemPosition() == 0) {
                Toast.makeText(this$0, this$0.w1().b("pls_SelectTempPeriodMode", this$0.getString(R.string.pls_select_temp_period_mode)), 1).show();
            } else if (this$0.s1().q.getSelectedItemPosition() == 0) {
                Toast.makeText(this$0, this$0.w1().b("please_select_the_period", this$0.getString(R.string.please_select_the_period)), 1).show();
            } else {
                DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListener, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
                datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis());
                datePickerDialog.show();
                datePickerDialog.getButton(-2).setTextColor(-16777216);
                datePickerDialog.getButton(-1).setTextColor(-65536);
            }
        } catch (Exception unused) {
        }
    }

    public static final void H1(TemporaryPermitActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new wa3(this$0);
        try {
            if (this$0.s1().r.getSelectedItemPosition() == 0) {
                Toast.makeText(this$0, this$0.w1().b("pls_SelectTempPeriodMode", this$0.getString(R.string.pls_select_temp_period_mode)), 1).show();
                return;
            }
            if (this$0.s1().q.getSelectedItemPosition() == 0) {
                Toast.makeText(this$0, this$0.w1().b("please_select_the_period", this$0.getString(R.string.please_select_the_period)), 1).show();
                return;
            }
            if (this$0.s1().e.getText().length() <= 0) {
                Toast.makeText(this$0, this$0.w1().b("pls_enterTempValidFromDate", this$0.getString(R.string.please_select_form_date)), 1).show();
                return;
            }
            if (this$0.s1().E.getText().length() <= 3) {
                Toast.makeText(this$0, this$0.w1().b("pls_enterTempTravelFrom", this$0.getString(R.string.please_enter_travel_from)), 1).show();
                return;
            }
            if (this$0.s1().G.getText().length() <= 3) {
                Toast.makeText(this$0, this$0.w1().b("pls_enterTempTravelUpto", this$0.getString(R.string.please_enter_travel_upto)), 1).show();
                return;
            }
            if (this$0.s1().m.getSelectedItemPosition() == 0) {
                Toast.makeText(this$0, this$0.w1().b("pls_SelectTempNatureOfGoods", this$0.getString(R.string.please_select_nature_good)), 1).show();
                return;
            }
            if (this$0.s1().b.getSelectedItemPosition() == 0) {
                Toast.makeText(this$0, this$0.w1().b("pls_SelectTempGoods", this$0.getString(R.string.please_select_goods)), 1).show();
                return;
            }
            if (StringsKt__StringsJVMKt.equals(this$0.s1().b.getSelectedItem().toString(), "other", true) && this$0.s1().i.getText().toString().length() < 3) {
                Toast.makeText(this$0, this$0.w1().b("pls_enterTempGoodsDetails", this$0.getString(R.string.please_enter_goods_details)), 1).show();
                return;
            }
            if (this$0.s1().z.length() < 4) {
                Toast.makeText(this$0, this$0.w1().b("pls_enterTempRouteDesc", this$0.getString(R.string.please_enter_valid_route_desc)), 1).show();
                return;
            }
            if (this$0.s1().k.getSelectedItemPosition() == 0) {
                Toast.makeText(this$0, this$0.w1().b("pls_SelectTempPurposeJouener", this$0.getString(R.string.please_select_purpose_of_journey)), 1).show();
                return;
            }
            if (this$0.s1().x.getText().length() < 1) {
                Toast.makeText(this$0, this$0.w1().b("pls_enterTempRouteLength", this$0.getString(R.string.please_enter_route_length)), 1).show();
                return;
            }
            if (this$0.s1().B.getSelectedItemPosition() == 0) {
                Toast.makeText(this$0, this$0.w1().b("pls_SelectTempServiceType", this$0.getString(R.string.please_select_service_type)), 1).show();
                return;
            }
            if (this$0.isPassangerListAttach && this$0.passangeList.size() < 1) {
                Toast.makeText(this$0, this$0.w1().b("pls_AddTempPassenger", this$0.getString(R.string.please_add_passanger)), 1).show();
                return;
            }
            this$0.y1().show();
            String string = this$0.s1().p.getText().toString();
            String string2 = this$0.s1().i.getText().toString();
            String string3 = this$0.s1().m.getSelectedItem().toString();
            String string4 = this$0.s1().b.getSelectedItem().toString();
            String strR = hz0.a.r();
            String rc_off_cd = this$0.A1().getRc_off_cd();
            Integer numValueOf = rc_off_cd != null ? Integer.valueOf(Integer.parseInt(rc_off_cd)) : null;
            String string5 = this$0.s1().i.getText().toString();
            int i2 = Integer.parseInt(this$0.s1().q.getSelectedItem().toString());
            VContant.Companion companion = VContant.INSTANCE;
            SubmitForTempPermit submitForTempPermit = new SubmitForTempPermit(string, "", string2, string3, string4, "", strR, numValueOf, string5, i2, companion.x(this$0.s1().r.getSelectedItem().toString()), Integer.parseInt(VContant.TempPermit_PURPOSE_CODE), this$0.s1().k.getSelectedItem().toString(), String.valueOf(this$0.A1().getRc_regn_no()), this$0.s1().z.getText().toString(), String.valueOf(this$0.A1().getState_cd()), this$0.s1().E.getText().toString(), this$0.s1().G.getText().toString(), this$0.passangeList, String.valueOf(companion.p(this$0.s1().e.getText().toString())), this$0.s1().O.getText().toString());
            Gson gson = new Gson();
            o47 o47VarT1 = this$0.t1();
            String json = gson.toJson(submitForTempPermit);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            o47VarT1.j(this$0, json);
        } catch (Exception unused) {
        }
    }

    public static final void I1(TemporaryPermitActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) PassangerResultActivity.class);
        intent.putExtra("PassagerList", this$0.passangeList);
        intent.putExtra("SeatingCap", String.valueOf(this$0.A1().getSeat_cap()));
        this$0.getResult.a(intent);
    }

    public static final void J1(TemporaryPermitActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VUtility.INSTANCE.y(this$0, this$0.w1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public final NrvDetails A1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final VahanProService C1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    /* JADX INFO: renamed from: D1, reason: from getter */
    public final boolean getIsFaceless() {
        return this.isFaceless;
    }

    public final void K1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void L1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void M1(le6 le6Var) {
        Intrinsics.checkNotNullParameter(le6Var, "<set-?>");
        this.binding = le6Var;
    }

    public final void N1(o47 o47Var) {
        Intrinsics.checkNotNullParameter(o47Var, "<set-?>");
        this.fitnessDraftViewModle = o47Var;
    }

    public final void O1(DuplicateFitnessService duplicateFitnessService) {
        Intrinsics.checkNotNullParameter(duplicateFitnessService, "<set-?>");
        this.fitnessService = duplicateFitnessService;
    }

    public final void P1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.formated_date = str;
    }

    public final void Q1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void R1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void S1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void T1(boolean z) {
        this.isPassangerListAttach = z;
    }

    public final void U1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void V1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void W1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void X1(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    public final void Y1(Context context, String message) {
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ke6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TemporaryPermitActivity.Z1(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, w1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temporary_permit_activity);
        le6 le6VarC = le6.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(le6VarC, "inflate(...)");
        M1(le6VarC);
        setContentView(s1().b());
        W1(VahanProService.INSTANCE.a(this));
        O1(DuplicateFitnessService.INSTANCE.a(this));
        Q1(new wa3(this));
        ta3.a.U2(this, s1());
        S1(new ProgressDialog(this));
        y1().setMessage(w1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        y1().setCancelable(false);
        y1().setCanceledOnTouchOutside(false);
        X1((ld7) new z(this, new kd7(new jd7(C1()))).a(ld7.class));
        N1((o47) new z(this, new n47(new j37(u1()))).a(o47.class));
        R1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        L1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        K1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        U1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        V1((NrvDetails) serializableExtra);
        Q1(new wa3(this));
        s1().D.i.setText(VContant.INSTANCE.L(this, VContant.TempPermit_PURPOSE_CODE));
        s1().P.setText(w1().b("vehicle_no", "Vehicle No.:") + ' ' + z1());
        s1().Q.setText(w1().b("view_vehicle_details", "View Vehicle Details"));
        s1().Q.setPaintFlags(s1().Q.getPaintFlags() | 8);
        s1().Q.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ee6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TemporaryPermitActivity.E1(this.a, view);
            }
        });
        try {
            y1().show();
            t1().N(this, z1(), A1().getState_cd(), A1().getRc_off_cd());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.fe6
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                TemporaryPermitActivity.F1(this.a, datePicker, i2, i3, i4);
            }
        };
        s1().r.setOnItemSelectedListener(new e());
        s1().q.setOnItemSelectedListener(new f());
        s1().m.setOnItemSelectedListener(new g());
        s1().e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ge6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TemporaryPermitActivity.G1(this.a, onDateSetListener, view);
            }
        });
        t1().J().g(this, new l(new h()));
        t1().K().g(this, new l(new i()));
        t1().k().g(this, new l(new j()));
        t1().s().g(this, new l(new k()));
        t1().t().g(this, new l(new a()));
        s1().d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.he6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TemporaryPermitActivity.H1(this.a, view);
            }
        });
        s1().c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ie6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TemporaryPermitActivity.I1(this.a, view);
            }
        });
        t1().L().g(this, new l(new b()));
        t1().M().g(this, new l(new c()));
        t1().p().g(this, new l(new d()));
        s1().D.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.je6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TemporaryPermitActivity.J1(this.a, view);
            }
        });
    }

    public final String q1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String r1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final le6 s1() {
        le6 le6Var = this.binding;
        if (le6Var != null) {
            return le6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final o47 t1() {
        o47 o47Var = this.fitnessDraftViewModle;
        if (o47Var != null) {
            return o47Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fitnessDraftViewModle");
        return null;
    }

    public final DuplicateFitnessService u1() {
        DuplicateFitnessService duplicateFitnessService = this.fitnessService;
        if (duplicateFitnessService != null) {
            return duplicateFitnessService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fitnessService");
        return null;
    }

    public final String v1() {
        String str = this.formated_date;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("formated_date");
        return null;
    }

    public final wa3 w1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final String x1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    public final ProgressDialog y1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String z1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }
}
