package com.nic.mparivahan.VahanServices.VahanTransferOwnerView;

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
import com.google.gson.Gson;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DRcModle.DReasonResponse;
import com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicateFitnessService;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.ApiMessage;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DataX;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.Doclist;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DuplicateList;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DuplicatePermitDraft;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DuplicatePermitRe;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.DuplicatePermitResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanDuplicatePermitActivity;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanCommonConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.cg7;
import com.zepto.fh;
import com.zepto.gd1;
import com.zepto.hz0;
import com.zepto.id7;
import com.zepto.j37;
import com.zepto.jd7;
import com.zepto.k18;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.n47;
import com.zepto.o47;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.wa3;
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
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b~\u0010\u007fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0015J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010B\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010N\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010=\u001a\u0004\bL\u0010?\"\u0004\bM\u0010AR\"\u0010R\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010=\u001a\u0004\bP\u0010?\"\u0004\bQ\u0010AR\"\u0010V\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010=\u001a\u0004\bT\u0010?\"\u0004\bU\u0010AR*\u0010_\u001a\n X*\u0004\u0018\u00010W0W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010c\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010=\u001a\u0004\ba\u0010?\"\u0004\bb\u0010AR\"\u0010k\u001a\u00020d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010s\u001a\u00020l8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR2\u0010}\u001a\u0012\u0012\u0004\u0012\u00020u0tj\b\u0012\u0004\u0012\u00020u`v8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|¨\u0006\u0080\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanDuplicatePermitActivity;", "Lcom/zepto/pq;", "", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "V1", "Lcom/zepto/fh;", "C", "Lcom/zepto/fh;", "q1", "()Lcom/zepto/fh;", "J1", "(Lcom/zepto/fh;)V", "binding", "Lcom/zepto/ld7;", "D", "Lcom/zepto/ld7;", "A1", "()Lcom/zepto/ld7;", "U1", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "E", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "z1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "T1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Lcom/zepto/o47;", "F", "Lcom/zepto/o47;", "r1", "()Lcom/zepto/o47;", "K1", "(Lcom/zepto/o47;)V", "fitnessDraftViewModle", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "G", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "s1", "()Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;", "L1", "(Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicateFitnessService;)V", "fitnessService", "Landroid/app/ProgressDialog;", "H", "Landroid/app/ProgressDialog;", "w1", "()Landroid/app/ProgressDialog;", "Q1", "(Landroid/app/ProgressDialog;)V", "pDialog", "I", "Ljava/lang/String;", "x1", "()Ljava/lang/String;", "R1", "(Ljava/lang/String;)V", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "J", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "y1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "S1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "K", "v1", "P1", "off_code", "L", "p1", "I1", "aadhar_name", "M", "o1", "H1", "aadhar_address", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "N", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "O", "getFormated_date", "M1", "formated_date", "", "P", "Z", "B1", "()Z", "setFaceless", "(Z)V", "isFaceless", "Lcom/zepto/wa3;", "Q", "Lcom/zepto/wa3;", "t1", "()Lcom/zepto/wa3;", "N1", "(Lcom/zepto/wa3;)V", "languageKeySession", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/DuplicateFitness/DuplicatePermitModel/Doclist;", "Lkotlin/collections/ArrayList;", "R", "Ljava/util/ArrayList;", "u1", "()Ljava/util/ArrayList;", "O1", "(Ljava/util/ArrayList;)V", "list", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanDuplicatePermitActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public fh binding;

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

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String formated_date;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public ArrayList list = new ArrayList();

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
            VahanDuplicatePermitActivity.this.w1().dismiss();
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(DuplicateList duplicateList) {
            try {
                if (duplicateList.getData().getDoclist().size() > 0) {
                    VahanDuplicatePermitActivity.this.O1(duplicateList.getData().getDoclist());
                    VahanDuplicatePermitActivity.this.getList().add(0, new Doclist("Select Document", "Select Document"));
                    VahanDuplicatePermitActivity vahanDuplicatePermitActivity = VahanDuplicatePermitActivity.this;
                    VahanDuplicatePermitActivity.this.q1().j.setAdapter((SpinnerAdapter) new id7(vahanDuplicatePermitActivity, vahanDuplicatePermitActivity.getList()));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DuplicateList) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public static final c c = new c();

        public c() {
            super(1);
        }

        public final void invoke(String str) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        public final void a(DReasonResponse dReasonResponse) {
            VahanDuplicatePermitActivity.this.w1().dismiss();
            try {
                if (dReasonResponse.size() > 0) {
                    dReasonResponse.add(0, new DReasonResponseItem("Select Reason", null));
                    VahanDuplicatePermitActivity vahanDuplicatePermitActivity = VahanDuplicatePermitActivity.this;
                    Intrinsics.checkNotNull(dReasonResponse);
                    VahanDuplicatePermitActivity.this.q1().h.setAdapter((SpinnerAdapter) new cg7(vahanDuplicatePermitActivity, dReasonResponse));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DReasonResponse) obj);
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
            VahanDuplicatePermitActivity.this.w1().dismiss();
        }
    }

    public static final class f implements AdapterView.OnItemSelectedListener {
        public f() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            Object selectedItem = VahanDuplicatePermitActivity.this.q1().h.getSelectedItem();
            Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem");
            DReasonResponseItem dReasonResponseItem = (DReasonResponseItem) selectedItem;
            if (StringsKt__StringsJVMKt.equals(dReasonResponseItem.getReason_desc(), "OTHER", true) || StringsKt__StringsJVMKt.equals(dReasonResponseItem.getReason_desc(), "TORN", true)) {
                VahanDuplicatePermitActivity.this.q1().f.setVisibility(8);
            } else {
                VahanDuplicatePermitActivity.this.q1().f.setVisibility(0);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
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
        public final void a(DuplicatePermitResponse duplicatePermitResponse) {
            VahanDuplicatePermitActivity.this.w1().dismiss();
            gd1.a aVar = gd1.a;
            DataX data = duplicatePermitResponse.getData();
            if (aVar.m(data != null ? data.getApplNo() : null)) {
                VahanDuplicatePermitActivity vahanDuplicatePermitActivity = VahanDuplicatePermitActivity.this;
                ApiMessage apiMessage = duplicatePermitResponse.getApiMessage();
                vahanDuplicatePermitActivity.V1(vahanDuplicatePermitActivity, apiMessage != null ? apiMessage.getDeveloperMessage() : null);
                return;
            }
            Gson gson = new Gson();
            Object objFromJson = gson.fromJson(gson.toJson(duplicatePermitResponse), (Class<Object>) DuplicatePermitDraft.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            Intent intent = new Intent(VahanDuplicatePermitActivity.this, (Class<?>) VahanCommonConfirmationScreen.class);
            intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.DUPLICATE_PERMIT_CODE);
            intent.putExtra(VContant.DUPLICATE_PERMIT_CODE, (DuplicatePermitDraft) objFromJson);
            DataX data2 = duplicatePermitResponse.getData();
            intent.putExtra(VContant.APP_NO, data2 != null ? data2.getApplNo() : null);
            intent.putExtra("state_code", VahanDuplicatePermitActivity.this.y1().getState_cd());
            intent.putExtra("rc_number", VahanDuplicatePermitActivity.this.x1());
            intent.putExtra(VContant.PURPOSE_CODE, VContant.DUPLICATE_PERMIT_PURPOSE_CODE);
            intent.putExtra("off_code", VahanDuplicatePermitActivity.this.v1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, VahanDuplicatePermitActivity.this.getIsFaceless());
            intent.putExtra("RC", VahanDuplicatePermitActivity.this.x1());
            intent.putExtra("RcDetails", VahanDuplicatePermitActivity.this.y1());
            intent.putExtra(VContant.NEXGEN_addahar_name, VahanDuplicatePermitActivity.this.p1());
            intent.putExtra(VContant.NEXGEN_addahar_address, VahanDuplicatePermitActivity.this.o1());
            VahanDuplicatePermitActivity.this.startActivity(intent);
            VahanDuplicatePermitActivity.this.finish();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DuplicatePermitResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class h implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public h(Function1 function) {
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

    public static final void C1(VahanDuplicatePermitActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.x1());
        intent.putExtra("RcDetails", this$0.y1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.p1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.o1());
        this$0.startActivity(intent);
    }

    public static final void D1(VahanDuplicatePermitActivity this$0, DatePicker datePicker, int i, int i2, int i3) {
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
        this$0.M1(((String) charSequence3) + '-' + ((String) charSequence2) + '-' + ((String) charSequence));
        this$0.q1().d.setText(simpleDateFormat.format(this$0.cal.getTime()));
    }

    public static final void E1(VahanDuplicatePermitActivity this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListener, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void F1(VahanDuplicatePermitActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        wa3 wa3Var = new wa3(this$0);
        try {
            String string = this$0.q1().i.getText().toString();
            String string2 = this$0.q1().e.getText().toString();
            String string3 = this$0.q1().d.getText().toString();
            String string4 = this$0.q1().g.getText().toString();
            Object selectedItem = this$0.q1().h.getSelectedItem();
            Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem");
            DReasonResponseItem dReasonResponseItem = (DReasonResponseItem) selectedItem;
            Object selectedItem2 = this$0.q1().j.getSelectedItem();
            Intrinsics.checkNotNull(selectedItem2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.Doclist");
            Doclist doclist = (Doclist) selectedItem2;
            if (this$0.q1().j.getSelectedItemPosition() == 0) {
                Toast.makeText(this$0, wa3Var.b("pls_Select_dupPermitReqDoc", "Please select the Required Document"), 0).show();
                return;
            }
            if (this$0.q1().h.getSelectedItemPosition() == 0) {
                Toast.makeText(this$0, wa3Var.b("please_Select_the_reason", this$0.getString(R.string.please_Select_the_reason)), 0).show();
                return;
            }
            if (string.length() < 3) {
                Toast.makeText(this$0, wa3Var.b("please_enter_the_remark", this$0.getString(R.string.please_enter_the_remark)), 0).show();
                return;
            }
            if (string2.length() < 3 && (StringsKt__StringsJVMKt.equals(String.valueOf(dReasonResponseItem.getReason_desc()), "Lost", true) || StringsKt__StringsJVMKt.equals(String.valueOf(dReasonResponseItem.getReason_desc()), "THEFT", true))) {
                Toast.makeText(this$0, wa3Var.b("please_enter_the_valid_fir_no", this$0.getString(R.string.please_enter_the_valid_fir_no)), 0).show();
                return;
            }
            if (string3.length() < 3 && (StringsKt__StringsJVMKt.equals(String.valueOf(dReasonResponseItem.getReason_desc()), "Lost", true) || StringsKt__StringsJVMKt.equals(String.valueOf(dReasonResponseItem.getReason_desc()), "THEFT", true))) {
                Toast.makeText(this$0, wa3Var.b("please_enter_fir_date", this$0.getString(R.string.please_enter_fir_date)), 0).show();
                return;
            }
            if (string4.length() < 3 && (StringsKt__StringsJVMKt.equals(String.valueOf(dReasonResponseItem.getReason_desc()), "Lost", true) || StringsKt__StringsJVMKt.equals(String.valueOf(dReasonResponseItem.getReason_desc()), "THEFT", true))) {
                Toast.makeText(this$0, wa3Var.b("please_enter_police_station", this$0.getString(R.string.please_enter_police_station)), 0).show();
                return;
            }
            Object selectedItem3 = this$0.q1().j.getSelectedItem();
            Intrinsics.checkNotNull(selectedItem3, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicatePermitModel.Doclist");
            ArrayList arrayList = new ArrayList();
            arrayList.add((Doclist) selectedItem3);
            this$0.w1().show();
            this$0.r1().Q(this$0, new DuplicatePermitRe("", doclist.getDocId().toString(), arrayList, k18.a.h(string3), string2, Integer.parseInt(this$0.v1()), "", string4, "", Integer.parseInt(VContant.DUPLICATE_PERMIT_PURPOSE_CODE), String.valueOf(dReasonResponseItem.getReason_desc()), string, this$0.x1(), String.valueOf(this$0.y1().getState_cd()), "", hz0.a.r()));
        } catch (Exception unused) {
        }
    }

    public static final void G1(VahanDuplicatePermitActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VUtility.INSTANCE.y(this$0, this$0.t1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public final ld7 A1() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    /* JADX INFO: renamed from: B1, reason: from getter */
    public final boolean getIsFaceless() {
        return this.isFaceless;
    }

    public final void H1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void I1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void J1(fh fhVar) {
        Intrinsics.checkNotNullParameter(fhVar, "<set-?>");
        this.binding = fhVar;
    }

    public final void K1(o47 o47Var) {
        Intrinsics.checkNotNullParameter(o47Var, "<set-?>");
        this.fitnessDraftViewModle = o47Var;
    }

    public final void L1(DuplicateFitnessService duplicateFitnessService) {
        Intrinsics.checkNotNullParameter(duplicateFitnessService, "<set-?>");
        this.fitnessService = duplicateFitnessService;
    }

    public final void M1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.formated_date = str;
    }

    public final void N1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void O1(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.list = arrayList;
    }

    public final void P1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void Q1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void R1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void S1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void T1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void U1(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    public final void V1(Context context, String message) {
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.v37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDuplicatePermitActivity.W1(dialog, view);
            }
        });
        dialog.show();
    }

    public final String o1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, t1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vahan_duplicate_permit_activity);
        fh fhVarC = fh.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(fhVarC, "inflate(...)");
        J1(fhVarC);
        setContentView(q1().b());
        ta3.a.E2(this, q1());
        T1(VahanProService.INSTANCE.a(this));
        L1(DuplicateFitnessService.INSTANCE.a(this));
        N1(new wa3(this));
        Q1(new ProgressDialog(this));
        w1().setMessage(t1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        w1().setCancelable(false);
        w1().setCanceledOnTouchOutside(false);
        U1((ld7) new z(this, new kd7(new jd7(z1()))).a(ld7.class));
        K1((o47) new z(this, new n47(new j37(s1()))).a(o47.class));
        P1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        I1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        H1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        R1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        S1((NrvDetails) serializableExtra);
        N1(new wa3(this));
        q1().t.setText(t1().b("vehicle_no", "Vehicle No.:") + ' ' + x1());
        q1().u.setText(t1().b("view_vehicle_details", "View Vehicle Details"));
        q1().u.setPaintFlags(q1().u.getPaintFlags() | 8);
        q1().u.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.q37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDuplicatePermitActivity.C1(this.a, view);
            }
        });
        try {
            w1().show();
            r1().u(this, x1(), y1().getState_cd());
            A1().N0(this, "3");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.r37
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                VahanDuplicatePermitActivity.D1(this.a, datePicker, i, i2, i3);
            }
        };
        q1().d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.s37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDuplicatePermitActivity.E1(this.a, onDateSetListener, view);
            }
        });
        r1().q().g(this, new h(new b()));
        r1().r().g(this, new h(c.c));
        A1().L().g(this, new h(new d()));
        A1().M().g(this, new h(new e()));
        q1().h.setOnItemSelectedListener(new f());
        q1().c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.t37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDuplicatePermitActivity.F1(this.a, view);
            }
        });
        r1().o().g(this, new h(new g()));
        r1().p().g(this, new h(new a()));
        q1().m.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.u37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanDuplicatePermitActivity.G1(this.a, view);
            }
        });
    }

    public final String p1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final fh q1() {
        fh fhVar = this.binding;
        if (fhVar != null) {
            return fhVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final o47 r1() {
        o47 o47Var = this.fitnessDraftViewModle;
        if (o47Var != null) {
            return o47Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fitnessDraftViewModle");
        return null;
    }

    public final DuplicateFitnessService s1() {
        DuplicateFitnessService duplicateFitnessService = this.fitnessService;
        if (duplicateFitnessService != null) {
            return duplicateFitnessService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fitnessService");
        return null;
    }

    public final wa3 t1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    /* JADX INFO: renamed from: u1, reason: from getter */
    public final ArrayList getList() {
        return this.list;
    }

    public final String v1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    public final ProgressDialog w1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String x1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails y1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final VahanProService z1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }
}
