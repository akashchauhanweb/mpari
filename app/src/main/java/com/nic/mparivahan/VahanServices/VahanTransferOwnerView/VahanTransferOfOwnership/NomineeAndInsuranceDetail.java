package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.SpinnerAdapter;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.NomineeAndInsuranceDetail;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOCommonService.TOCommonService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOSaveToDraftRepository.TOSaveToDraftService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.Relation;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.ToCommonModel2;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.a85;
import com.zepto.fc6;
import com.zepto.fe;
import com.zepto.gc6;
import com.zepto.hc6;
import com.zepto.ii6;
import com.zepto.kt6;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.qb6;
import com.zepto.rb6;
import com.zepto.sb6;
import com.zepto.t72;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wb0;
import com.zepto.wm6;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\"\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bq\u0010rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010-\u001a\n &*\u0004\u0018\u00010%0%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00104\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010P\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010/\u001a\u0004\bN\u00101\"\u0004\bO\u00103R\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010\\\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010/\u001a\u0004\bZ\u00101\"\u0004\b[\u00103R\"\u0010`\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010/\u001a\u0004\b^\u00101\"\u0004\b_\u00103R\"\u0010d\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010/\u001a\u0004\bb\u00101\"\u0004\bc\u00103R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010m\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010p¨\u0006s"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/NomineeAndInsuranceDetail;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lcom/zepto/fe;", "binding", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "rcdetails", "f2", "", "strNum", "", "F1", "C", "Lcom/zepto/fe;", "w1", "()Lcom/zepto/fe;", "U1", "(Lcom/zepto/fe;)V", "Lcom/zepto/hc6;", "D", "Lcom/zepto/hc6;", "C1", "()Lcom/zepto/hc6;", "c2", "(Lcom/zepto/hc6;)V", "toSaveToDraftViewModel", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOSaveToDraftRepository/TOSaveToDraftService;", "E", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOSaveToDraftRepository/TOSaveToDraftService;", "D1", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOSaveToDraftRepository/TOSaveToDraftService;", "d2", "(Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOSaveToDraftRepository/TOSaveToDraftService;)V", "tosavetodraftService", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "F", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "G", "Ljava/lang/String;", "x1", "()Ljava/lang/String;", "V1", "(Ljava/lang/String;)V", "formated_date", "Lcom/zepto/sb6;", "H", "Lcom/zepto/sb6;", "E1", "()Lcom/zepto/sb6;", "e2", "(Lcom/zepto/sb6;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOCommonService/TOCommonService;", "I", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOCommonService/TOCommonService;", "B1", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOCommonService/TOCommonService;", "b2", "(Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOCommonService/TOCommonService;)V", "retrofitService", "Landroid/app/ProgressDialog;", "J", "Landroid/app/ProgressDialog;", "z1", "()Landroid/app/ProgressDialog;", "Y1", "(Landroid/app/ProgressDialog;)V", "pDialog", "K", "getRelationWithNomineeGet", "a2", "relationWithNomineeGet", "Lcom/zepto/wa3;", "L", "Lcom/zepto/wa3;", "y1", "()Lcom/zepto/wa3;", "W1", "(Lcom/zepto/wa3;)V", "languageSession", "M", "getOff_code", "X1", "off_code", "N", "v1", "T1", "aadhar_name", "O", "u1", "S1", "aadhar_address", "P", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "A1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "Z1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "Q", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class NomineeAndInsuranceDetail extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public fe binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public hc6 toSaveToDraftViewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public TOSaveToDraftService tosavetodraftService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String formated_date;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public sb6 viewModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public TOCommonService retrofitService;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String relationWithNomineeGet;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public wa3 languageSession;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public boolean isFaceless;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(ToCommonModel2 toCommonModel2) {
            NomineeAndInsuranceDetail.this.z1().dismiss();
            try {
                ArrayList<Relation> relation = toCommonModel2.getData().getRelation();
                relation.add(0, new Relation(0, "Select Relation With Nominee"));
                NomineeAndInsuranceDetail.this.w1().z.setAdapter((SpinnerAdapter) new a85(NomineeAndInsuranceDetail.this, relation));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ToCommonModel2) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            NomineeAndInsuranceDetail.this.z1().dismiss();
        }
    }

    public static final class c implements AdapterView.OnItemSelectedListener {
        public c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            NomineeAndInsuranceDetail.this.a2(String.valueOf(adapterView != null ? adapterView.getItemAtPosition(i) : null));
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        public final void a(gc6 gc6Var) {
            NomineeAndInsuranceDetail.this.z1().dismiss();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            wb0.a(obj);
            a(null);
            return Unit.INSTANCE;
        }
    }

    public static final class e implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public e(Function1 function) {
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

    public static final void G1(NomineeAndInsuranceDetail this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.A1().getRc_regn_no());
        intent.putExtra("RcDetails", this$0.A1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.v1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.u1());
        this$0.startActivity(intent);
    }

    public static final void H1(NomineeAndInsuranceDetail this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void I1(NomineeAndInsuranceDetail this$0, DatePicker datePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cal.set(1, i);
        this$0.cal.set(2, i2);
        this$0.cal.set(5, i3);
        new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence charSequence = DateFormat.format("dd", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence2 = DateFormat.format("MM", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence3 = DateFormat.format("yyyy", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence3, "null cannot be cast to non-null type kotlin.String");
        this$0.V1(((String) charSequence3) + '-' + ((String) charSequence2) + '-' + ((String) charSequence));
        this$0.w1().m.setText(this$0.x1());
    }

    public static final void J1(NomineeAndInsuranceDetail this$0, DatePickerDialog.OnDateSetListener dateSetListenerinsuranceUpto, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListenerinsuranceUpto, "$dateSetListenerinsuranceUpto");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListenerinsuranceUpto, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void K1(NomineeAndInsuranceDetail this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.w1().d.setChecked(false);
            this$0.w1().e.setChecked(true);
            this$0.w1().t.setVisibility(0);
        }
    }

    public static final void L1(NomineeAndInsuranceDetail this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.w1().d.setChecked(true);
            this$0.w1().e.setChecked(false);
            this$0.w1().t.setVisibility(8);
        }
    }

    public static final void M1(NomineeAndInsuranceDetail this$0, View view) {
        ii6 ii6Var;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.w1().s.getText().length() < 2 && this$0.w1().e.isChecked()) {
            Toast.makeText(this$0, this$0.y1().b("to_validation_nomineeName", this$0.getString(R.string.to_validation_nomineeName)), 0).show();
            return;
        }
        if (this$0.w1().z.getSelectedItemPosition() == 0 && this$0.w1().e.isChecked()) {
            Toast.makeText(this$0, this$0.y1().b("to_validation_nomineeRelation", this$0.getString(R.string.to_validation_nomineeRelation)), 0).show();
            return;
        }
        if (this$0.w1().q.getText().length() < 2 && this$0.w1().e.isChecked()) {
            Toast.makeText(this$0, this$0.y1().b("to_validation_nomineeDOB", this$0.getString(R.string.to_validation_nomineeDOB)), 0).show();
            return;
        }
        this$0.z1().show();
        ii6 ii6VarM = new wm6(this$0).m();
        String strP = new wm6(this$0).p();
        if (this$0.F1(ii6VarM.s())) {
            String strA = ii6VarM.a();
            String strB = ii6VarM.b();
            String strC = ii6VarM.c();
            String strD = ii6VarM.d();
            String strE = ii6VarM.e();
            String strF = ii6VarM.f();
            int iG = ii6VarM.g();
            String strH = ii6VarM.h();
            String strI = ii6VarM.i();
            String strJ = ii6VarM.j();
            Intrinsics.checkNotNull(strP);
            ii6Var = new ii6("", strA, strB, strC, strD, strE, strF, iG, strH, strI, strJ, "", true, "", Integer.parseInt(strP), "", ii6VarM.l(), 0, "", ii6VarM.m(), ii6VarM.n(), ii6VarM.o(), ii6VarM.p(), ii6VarM.q(), ii6VarM.r(), ii6VarM.s(), ii6VarM.t(), ii6VarM.u(), ii6VarM.v(), ii6VarM.w(), ii6VarM.x(), ii6VarM.y(), ii6VarM.z(), "", ii6VarM.A(), "", ii6VarM.k());
        } else {
            String strA2 = ii6VarM.a();
            String strB2 = ii6VarM.b();
            String strC2 = ii6VarM.c();
            String strD2 = ii6VarM.d();
            String strE2 = ii6VarM.e();
            String strF2 = ii6VarM.f();
            int iG2 = ii6VarM.g();
            String strH2 = ii6VarM.h();
            String strI2 = ii6VarM.i();
            String strJ2 = ii6VarM.j();
            Intrinsics.checkNotNull(strP);
            ii6Var = new ii6("", strA2, strB2, strC2, strD2, strE2, strF2, iG2, strH2, strI2, strJ2, "", true, "", Integer.parseInt(strP), "", ii6VarM.l(), 0, "", ii6VarM.m(), ii6VarM.n(), ii6VarM.o(), ii6VarM.p(), ii6VarM.q(), ii6VarM.r(), null, ii6VarM.t(), ii6VarM.u(), ii6VarM.v(), ii6VarM.w(), ii6VarM.x(), ii6VarM.y(), ii6VarM.z(), "", ii6VarM.A(), "", ii6VarM.k());
        }
        this$0.C1().i(ii6Var);
    }

    public static final void N1(NomineeAndInsuranceDetail this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void O1(NomineeAndInsuranceDetail this$0, DatePicker datePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cal.set(1, i);
        this$0.cal.set(2, i2);
        this$0.cal.set(5, i3);
        new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence charSequence = DateFormat.format("dd", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence2 = DateFormat.format("MM", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence3 = DateFormat.format("yyyy", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence3, "null cannot be cast to non-null type kotlin.String");
        this$0.V1(((String) charSequence3) + '-' + ((String) charSequence2) + '-' + ((String) charSequence));
        this$0.w1().q.setText(this$0.x1());
    }

    public static final void P1(NomineeAndInsuranceDetail this$0, DatePickerDialog.OnDateSetListener dateSetListenerNominee, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListenerNominee, "$dateSetListenerNominee");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListenerNominee, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void Q1(NomineeAndInsuranceDetail this$0, DatePicker datePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cal.set(1, i);
        this$0.cal.set(2, i2);
        this$0.cal.set(5, i3);
        new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence charSequence = DateFormat.format("dd", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence2 = DateFormat.format("MM", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence3 = DateFormat.format("yyyy", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence3, "null cannot be cast to non-null type kotlin.String");
        this$0.V1(((String) charSequence3) + '-' + ((String) charSequence2) + '-' + ((String) charSequence));
        this$0.w1().j.setText(this$0.x1());
    }

    public static final void R1(NomineeAndInsuranceDetail this$0, DatePickerDialog.OnDateSetListener dateSetListenerinsuranceFrom, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListenerinsuranceFrom, "$dateSetListenerinsuranceFrom");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListenerinsuranceFrom, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public final NrvDetails A1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final TOCommonService B1() {
        TOCommonService tOCommonService = this.retrofitService;
        if (tOCommonService != null) {
            return tOCommonService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final hc6 C1() {
        hc6 hc6Var = this.toSaveToDraftViewModel;
        if (hc6Var != null) {
            return hc6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("toSaveToDraftViewModel");
        return null;
    }

    public final TOSaveToDraftService D1() {
        TOSaveToDraftService tOSaveToDraftService = this.tosavetodraftService;
        if (tOSaveToDraftService != null) {
            return tOSaveToDraftService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tosavetodraftService");
        return null;
    }

    public final sb6 E1() {
        sb6 sb6Var = this.viewModel;
        if (sb6Var != null) {
            return sb6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final boolean F1(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            Double.parseDouble(strNum);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void S1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void T1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void U1(fe feVar) {
        Intrinsics.checkNotNullParameter(feVar, "<set-?>");
        this.binding = feVar;
    }

    public final void V1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.formated_date = str;
    }

    public final void W1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }

    public final void X1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void Y1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void Z1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void a2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.relationWithNomineeGet = str;
    }

    public final void b2(TOCommonService tOCommonService) {
        Intrinsics.checkNotNullParameter(tOCommonService, "<set-?>");
        this.retrofitService = tOCommonService;
    }

    public final void c2(hc6 hc6Var) {
        Intrinsics.checkNotNullParameter(hc6Var, "<set-?>");
        this.toSaveToDraftViewModel = hc6Var;
    }

    public final void d2(TOSaveToDraftService tOSaveToDraftService) {
        Intrinsics.checkNotNullParameter(tOSaveToDraftService, "<set-?>");
        this.tosavetodraftService = tOSaveToDraftService;
    }

    public final void e2(sb6 sb6Var) {
        Intrinsics.checkNotNullParameter(sb6Var, "<set-?>");
        this.viewModel = sb6Var;
    }

    public final void f2(fe binding, NrvDetails rcdetails) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(rcdetails, "rcdetails");
        if (kt6.d(rcdetails.getRc_insurance_upto()) && kt6.d(rcdetails.getRc_insurance_from())) {
            binding.i.setVisibility(0);
            binding.p.setText("");
            binding.j.setText(rcdetails.getRc_insurance_from());
            binding.m.setText(rcdetails.getRc_insurance_upto());
            binding.o.setText(rcdetails.getRc_insurance_comp());
            binding.u.setText(rcdetails.getRc_insurance_policy_no());
        }
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fe feVarC = fe.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(feVarC, "inflate(...)");
        U1(feVarC);
        setContentView(w1().b());
        W1(new wa3(this));
        ta3.a.Z1(this, w1());
        b2(TOCommonService.INSTANCE.a(this));
        d2(TOSaveToDraftService.INSTANCE.a(this));
        X1(String.valueOf(getIntent().getStringExtra("off_code")));
        T1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        S1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        Z1((NrvDetails) serializableExtra);
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        w1().D.i.setText(y1().b("label_transfer_ownership", "Transfer of Ownership"));
        w1().H.setText(y1().b("vehicle_no", "Vehicle No.:") + ' ' + A1().getRc_regn_no());
        w1().I.setText(y1().b("view_vehicle_details", "View Vehicle Details"));
        w1().I.setPaintFlags(w1().I.getPaintFlags() | 8);
        w1().I.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ka4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NomineeAndInsuranceDetail.G1(this.a, view);
            }
        });
        Y1(new ProgressDialog(this));
        z1().setMessage("Please wait...");
        z1().setCancelable(false);
        z1().setCanceledOnTouchOutside(false);
        e2((sb6) new z(this, new rb6(new qb6(B1()))).a(sb6.class));
        c2((hc6) new z(this, new t72(new fc6(D1()))).a(hc6.class));
        try {
            z1().show();
            E1().g();
            f2(w1(), A1());
        } catch (Exception unused) {
        }
        w1().D.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pa4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NomineeAndInsuranceDetail.H1(this.a, view);
            }
        });
        E1().i().g(this, new e(new a()));
        E1().h().g(this, new e(new b()));
        w1().e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.qa4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                NomineeAndInsuranceDetail.K1(this.a, compoundButton, z);
            }
        });
        w1().d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.ra4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                NomineeAndInsuranceDetail.L1(this.a, compoundButton, z);
            }
        });
        w1().z.setOnItemSelectedListener(new c());
        w1().C.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sa4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NomineeAndInsuranceDetail.M1(this.a, view);
            }
        });
        C1().h().g(this, new e(new d()));
        w1().w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ta4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NomineeAndInsuranceDetail.N1(this.a, view);
            }
        });
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.ua4
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                NomineeAndInsuranceDetail.O1(this.a, datePicker, i, i2, i3);
            }
        };
        w1().q.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.va4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NomineeAndInsuranceDetail.P1(this.a, onDateSetListener, view);
            }
        });
        final DatePickerDialog.OnDateSetListener onDateSetListener2 = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.la4
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                NomineeAndInsuranceDetail.Q1(this.a, datePicker, i, i2, i3);
            }
        };
        w1().j.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ma4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NomineeAndInsuranceDetail.R1(this.a, onDateSetListener2, view);
            }
        });
        final DatePickerDialog.OnDateSetListener onDateSetListener3 = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.na4
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                NomineeAndInsuranceDetail.I1(this.a, datePicker, i, i2, i3);
            }
        };
        w1().m.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.oa4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NomineeAndInsuranceDetail.J1(this.a, onDateSetListener3, view);
            }
        });
    }

    public final String u1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String v1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final fe w1() {
        fe feVar = this.binding;
        if (feVar != null) {
            return feVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final String x1() {
        String str = this.formated_date;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("formated_date");
        return null;
    }

    public final wa3 y1() {
        wa3 wa3Var = this.languageSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageSession");
        return null;
    }

    public final ProgressDialog z1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }
}
