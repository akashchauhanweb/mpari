package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.SpinnerAdapter;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOCommonService.TOCommonService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOPurposeData.TOPurposeResponseData.Data;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOPurposeData.TOPurposeResponseData.TOPurposeResponseData;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOPurposeData.TOPurposeService.TOPurposeService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.OwnerCatagory;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.OwnerShipType;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.ToCommonModel2;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.VahanTransferOfOwnerShipActivity;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.bc6;
import com.zepto.cc6;
import com.zepto.dc6;
import com.zepto.ec6;
import com.zepto.gi7;
import com.zepto.gm7;
import com.zepto.jh6;
import com.zepto.mf4;
import com.zepto.mt6;
import com.zepto.pq;
import com.zepto.qb6;
import com.zepto.rb6;
import com.zepto.sb6;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wm6;
import com.zepto.yj4;
import com.zepto.zj4;
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
import kotlin.text.CharsKt__CharKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u00107\u001a\n 0*\u0004\u0018\u00010/0/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010C\u001a\u00020@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010J\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010:\u001a\u0004\bH\u0010<\"\u0004\bI\u0010>R\"\u0010N\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010:\u001a\u0004\bL\u0010<\"\u0004\bM\u0010>R\"\u0010R\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010:\u001a\u0004\bP\u0010<\"\u0004\bQ\u0010>R\"\u0010V\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010:\u001a\u0004\bT\u0010<\"\u0004\bU\u0010>R\"\u0010Z\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010:\u001a\u0004\bX\u0010<\"\u0004\bY\u0010>R\"\u0010^\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010:\u001a\u0004\b\\\u0010<\"\u0004\b]\u0010>R\"\u0010f\u001a\u00020_8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010j\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010:\u001a\u0004\bh\u0010<\"\u0004\bi\u0010>R\"\u0010n\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bk\u0010:\u001a\u0004\bl\u0010<\"\u0004\bm\u0010>R\"\u0010v\u001a\u00020o8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010~\u001a\u00020w8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R%\u0010\u0082\u0001\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b\u007f\u0010:\u001a\u0005\b\u0080\u0001\u0010<\"\u0005\b\u0081\u0001\u0010>R&\u0010\u0086\u0001\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010:\u001a\u0005\b\u0084\u0001\u0010<\"\u0005\b\u0085\u0001\u0010>R&\u0010\u008a\u0001\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010:\u001a\u0005\b\u0088\u0001\u0010<\"\u0005\b\u0089\u0001\u0010>¨\u0006\u008d\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/VahanTransferOfOwnerShipActivity;", "Lcom/zepto/pq;", "", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/gi7;", "C", "Lcom/zepto/gi7;", "q1", "()Lcom/zepto/gi7;", "Q1", "(Lcom/zepto/gi7;)V", "binding", "Lcom/zepto/sb6;", "D", "Lcom/zepto/sb6;", "H1", "()Lcom/zepto/sb6;", "h2", "(Lcom/zepto/sb6;)V", "viewModelTO", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOCommonService/TOCommonService;", "E", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOCommonService/TOCommonService;", "F1", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOCommonService/TOCommonService;", "f2", "(Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOCommonService/TOCommonService;)V", "retrofitServiceTO", "Lcom/zepto/ec6;", "F", "Lcom/zepto/ec6;", "G1", "()Lcom/zepto/ec6;", "g2", "(Lcom/zepto/ec6;)V", "viewModelPurposeTO", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOPurposeData/TOPurposeService/TOPurposeService;", "G", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOPurposeData/TOPurposeService/TOPurposeService;", "E1", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOPurposeData/TOPurposeService/TOPurposeService;", "e2", "(Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/TOPurposeData/TOPurposeService/TOPurposeService;)V", "retrofitServicePurposeTO", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "H", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "", "I", "Ljava/lang/String;", "t1", "()Ljava/lang/String;", "T1", "(Ljava/lang/String;)V", "formated_date", "", "J", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "K", "B1", "b2", "rc_number", "L", "w1", "W1", "off_code", "M", "r1", "R1", "chasis_no", "N", "s1", "S1", "chasis_no5", "O", "D1", "d2", "reg_no", "P", "x1", "X1", "office_code", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "Q", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "C1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "c2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "R", "p1", "P1", "aadhar_name", "S", "o1", "O1", "aadhar_address", "Lcom/zepto/wa3;", "T", "Lcom/zepto/wa3;", "u1", "()Lcom/zepto/wa3;", "U1", "(Lcom/zepto/wa3;)V", "languageSession", "Landroid/app/ProgressDialog;", "U", "Landroid/app/ProgressDialog;", "z1", "()Landroid/app/ProgressDialog;", "Z1", "(Landroid/app/ProgressDialog;)V", "pDialog", "V", "A1", "a2", "purposeGet", "W", "y1", "Y1", "ownershipTypeGet", "X", "v1", "V1", "newOwnerCatagoryGet", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanTransferOfOwnerShipActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public gi7 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public sb6 viewModelTO;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public TOCommonService retrofitServiceTO;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ec6 viewModelPurposeTO;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public TOPurposeService retrofitServicePurposeTO;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String formated_date;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String chasis_no;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String chasis_no5;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String reg_no;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String office_code;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public wa3 languageSession;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String purposeGet;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String ownershipTypeGet;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String newOwnerCatagoryGet;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(ToCommonModel2 toCommonModel2) {
            VahanTransferOfOwnerShipActivity.this.z1().dismiss();
            try {
                Integer rc_owner_srNo = VahanTransferOfOwnerShipActivity.this.C1().getRc_owner_srNo();
                VahanTransferOfOwnerShipActivity.this.q1().d.setText(String.valueOf(rc_owner_srNo != null ? Integer.valueOf(rc_owner_srNo.intValue() + 1) : null));
                ArrayList<OwnerCatagory> ownerCatagory = toCommonModel2.getData().getOwnerCatagory();
                ownerCatagory.add(0, new OwnerCatagory(0, "Select Owner Category"));
                VahanTransferOfOwnerShipActivity.this.q1().k.setAdapter((SpinnerAdapter) new yj4(VahanTransferOfOwnerShipActivity.this, ownerCatagory));
                ArrayList<OwnerShipType> ownerShipType = toCommonModel2.getData().getOwnerShipType();
                ownerShipType.add(0, new OwnerShipType("Select Ownership Type", 0));
                VahanTransferOfOwnerShipActivity.this.q1().p.setAdapter((SpinnerAdapter) new zj4(VahanTransferOfOwnerShipActivity.this, ownerShipType));
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
            VahanTransferOfOwnerShipActivity.this.z1().dismiss();
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(TOPurposeResponseData tOPurposeResponseData) {
            try {
                ArrayList<Data> data = tOPurposeResponseData.getData();
                if (data != null) {
                    data.add(0, new Data(0, "Select Purpose", "0"));
                }
                VahanTransferOfOwnerShipActivity vahanTransferOfOwnerShipActivity = VahanTransferOfOwnerShipActivity.this;
                Intrinsics.checkNotNull(data);
                VahanTransferOfOwnerShipActivity.this.q1().t.setAdapter((SpinnerAdapter) new bc6(vahanTransferOfOwnerShipActivity, data));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((TOPurposeResponseData) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d implements AdapterView.OnItemSelectedListener {
        public d() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            VahanTransferOfOwnerShipActivity.this.a2(String.valueOf(adapterView != null ? adapterView.getItemAtPosition(i) : null));
            Log.e("whichPurpose", VahanTransferOfOwnerShipActivity.this.A1());
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class e implements AdapterView.OnItemSelectedListener {
        public e() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            VahanTransferOfOwnerShipActivity.this.Y1(String.valueOf(adapterView != null ? adapterView.getItemAtPosition(i) : null));
            Log.e("whichPurpose2", VahanTransferOfOwnerShipActivity.this.y1());
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
            VahanTransferOfOwnerShipActivity.this.V1(String.valueOf(adapterView != null ? adapterView.getItemAtPosition(i) : null));
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
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

    public static final void I1(VahanTransferOfOwnerShipActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.B1());
        intent.putExtra("RcDetails", this$0.C1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.p1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.o1());
        this$0.startActivity(intent);
    }

    public static final void J1(VahanTransferOfOwnerShipActivity this$0, DatePicker datePicker, int i, int i2, int i3) {
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
        this$0.T1(((String) charSequence3) + '-' + ((String) charSequence2) + '-' + ((String) charSequence));
        this$0.q1().B.setText(this$0.t1().toString());
    }

    public static final void K1(VahanTransferOfOwnerShipActivity this$0, DatePickerDialog.OnDateSetListener dateSetListenerNominee, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListenerNominee, "$dateSetListenerNominee");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListenerNominee, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void L1(VahanTransferOfOwnerShipActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VUtility.INSTANCE.y(this$0, this$0.u1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void M1(VahanTransferOfOwnerShipActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object selectedItem = this$0.q1().p.getSelectedItem();
        Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.OwnerShipType");
        OwnerShipType ownerShipType = (OwnerShipType) selectedItem;
        if (this$0.q1().t.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.u1().b("to_validation_purpose", this$0.getString(R.string.to_validation_purpose)), 0).show();
            return;
        }
        if (this$0.q1().p.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.u1().b("to_validation_ownershipType", this$0.getString(R.string.to_validation_ownershipType)), 0).show();
            return;
        }
        if (this$0.q1().k.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.u1().b("to_validation_newOwnerCat", this$0.getString(R.string.to_validation_newOwnerCat)), 0).show();
            return;
        }
        if (this$0.q1().m.getText().length() < 2) {
            Toast.makeText(this$0, this$0.u1().b("to_validation_newOwnerName", this$0.getString(R.string.to_validation_newOwnerName)), 0).show();
            return;
        }
        if (this$0.q1().f.getText().length() == 0 && StringsKt__StringsJVMKt.equals(ownerShipType.getCodeDescription(), "INDIVIDUAL", true)) {
            Toast.makeText(this$0, this$0.u1().b("please_enter_father_husband_name", this$0.getString(R.string.please_enter_father_husband_name)), 0).show();
            return;
        }
        if (this$0.q1().z.getText().length() < 1) {
            Toast.makeText(this$0, this$0.u1().b("to_validation_saleAmount", this$0.getString(R.string.to_validation_saleAmount)), 0).show();
            return;
        }
        if (CharsKt__CharKt.equals(this$0.q1().z.getText().toString().charAt(0), '0', true)) {
            Toast.makeText(this$0, this$0.u1().b("please_enter_valid_sale_amount", this$0.getString(R.string.please_enter_valid_sale_amount)), 0).show();
            return;
        }
        if (this$0.q1().B.getText().length() < 2) {
            Toast.makeText(this$0, this$0.u1().b("to_validation_saleDate", this$0.getString(R.string.please_enter_valid_sale_amount)), 0).show();
            return;
        }
        mt6.a aVar = mt6.a;
        if (!aVar.t(this$0.q1().h.getText().toString())) {
            Toast.makeText(this$0, this$0.u1().b("label_log_entr_vali_mobno", this$0.getString(R.string.please_enter_the_valid)), 1).show();
            return;
        }
        if (this$0.q1().b.length() > 0 && !aVar.u(this$0.q1().b.getText().toString())) {
            Toast.makeText(this$0, this$0.u1().b("label_log_entr_valid_email", this$0.getString(R.string.label_log_entr_valid_email)), 1).show();
            return;
        }
        new wm6(this$0).r(this$0.q1(), this$0.C1().getState_cd(), this$0.s1(), this$0.D1(), this$0.x1(), this$0.A1(), this$0.y1(), this$0.v1());
        if (this$0.isFaceless) {
            Intent intent = new Intent(this$0, (Class<?>) gm7.class);
            intent.putExtra("stateCd", this$0.C1().getState_cd());
            intent.putExtra("off_code", this$0.w1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
            intent.putExtra("RcDetails", this$0.C1());
            intent.putExtra(VContant.NEXGEN_addahar_name, this$0.p1());
            intent.putExtra(VContant.NEXGEN_addahar_address, this$0.o1());
            this$0.startActivity(intent);
            return;
        }
        Intent intent2 = new Intent(this$0, (Class<?>) jh6.class);
        intent2.putExtra("stateCd", this$0.C1().getState_cd());
        intent2.putExtra("off_code", this$0.w1());
        intent2.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent2.putExtra("RcDetails", this$0.C1());
        intent2.putExtra(VContant.NEXGEN_addahar_name, this$0.p1());
        intent2.putExtra(VContant.NEXGEN_addahar_address, this$0.o1());
        intent2.putExtra("MobNo", this$0.q1().h.getText().toString());
        this$0.startActivity(intent2);
    }

    public static final void N1(VahanTransferOfOwnerShipActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.q1().m.setText("");
        this$0.q1().f.setText("");
        this$0.q1().z.setText("");
        this$0.q1().r.setText("");
        this$0.q1().b.setText("");
        this$0.q1().h.setText("");
    }

    public final String A1() {
        String str = this.purposeGet;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("purposeGet");
        return null;
    }

    public final String B1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails C1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final String D1() {
        String str = this.reg_no;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reg_no");
        return null;
    }

    public final TOPurposeService E1() {
        TOPurposeService tOPurposeService = this.retrofitServicePurposeTO;
        if (tOPurposeService != null) {
            return tOPurposeService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitServicePurposeTO");
        return null;
    }

    public final TOCommonService F1() {
        TOCommonService tOCommonService = this.retrofitServiceTO;
        if (tOCommonService != null) {
            return tOCommonService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitServiceTO");
        return null;
    }

    public final ec6 G1() {
        ec6 ec6Var = this.viewModelPurposeTO;
        if (ec6Var != null) {
            return ec6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelPurposeTO");
        return null;
    }

    public final sb6 H1() {
        sb6 sb6Var = this.viewModelTO;
        if (sb6Var != null) {
            return sb6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelTO");
        return null;
    }

    public final void O1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void P1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void Q1(gi7 gi7Var) {
        Intrinsics.checkNotNullParameter(gi7Var, "<set-?>");
        this.binding = gi7Var;
    }

    public final void R1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.chasis_no = str;
    }

    public final void S1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.chasis_no5 = str;
    }

    public final void T1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.formated_date = str;
    }

    public final void U1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }

    public final void V1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.newOwnerCatagoryGet = str;
    }

    public final void W1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void X1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.office_code = str;
    }

    public final void Y1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ownershipTypeGet = str;
    }

    public final void Z1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void a2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.purposeGet = str;
    }

    public final void b2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void c2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void d2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reg_no = str;
    }

    public final void e2(TOPurposeService tOPurposeService) {
        Intrinsics.checkNotNullParameter(tOPurposeService, "<set-?>");
        this.retrofitServicePurposeTO = tOPurposeService;
    }

    public final void f2(TOCommonService tOCommonService) {
        Intrinsics.checkNotNullParameter(tOCommonService, "<set-?>");
        this.retrofitServiceTO = tOCommonService;
    }

    public final void g2(ec6 ec6Var) {
        Intrinsics.checkNotNullParameter(ec6Var, "<set-?>");
        this.viewModelPurposeTO = ec6Var;
    }

    public final void h2(sb6 sb6Var) {
        Intrinsics.checkNotNullParameter(sb6Var, "<set-?>");
        this.viewModelTO = sb6Var;
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
        VUtility.INSTANCE.y(this, u1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gi7 gi7VarC = gi7.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(gi7VarC, "inflate(...)");
        Q1(gi7VarC);
        setContentView(q1().b());
        ta3.a.p2(this, q1());
        f2(TOCommonService.INSTANCE.a(this));
        e2(TOPurposeService.INSTANCE.a(this));
        U1(new wa3(this));
        W1(String.valueOf(getIntent().getStringExtra("off_code")));
        P1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        O1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        b2(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        c2((NrvDetails) serializableExtra);
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        R1(String.valueOf(C1().getRc_chasi_no()));
        X1(String.valueOf(C1().getRc_off_cd()));
        d2(String.valueOf(C1().getRc_regn_no()));
        String strSubstring = r1().substring(r1().length() - 5);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        S1(strSubstring);
        U1(new wa3(this));
        q1().D.setText(u1().b("vehicle_no", "Vehicle No.:") + ' ' + B1());
        q1().E.setText(u1().b("view_vehicle_details", "View Vehicle Details"));
        q1().E.setPaintFlags(q1().E.getPaintFlags() | 8);
        q1().E.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ai7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanTransferOfOwnerShipActivity.I1(this.a, view);
            }
        });
        Z1(new ProgressDialog(this));
        z1().setMessage(u1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        z1().setCancelable(false);
        z1().setCanceledOnTouchOutside(false);
        h2((sb6) new z(this, new rb6(new qb6(F1()))).a(sb6.class));
        g2((ec6) new z(this, new dc6(new cc6(E1()))).a(ec6.class));
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.bi7
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                VahanTransferOfOwnerShipActivity.J1(this.a, datePicker, i, i2, i3);
            }
        };
        q1().B.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ci7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanTransferOfOwnerShipActivity.K1(this.a, onDateSetListener, view);
            }
        });
        try {
            z1().show();
            H1().g();
        } catch (Exception unused) {
        }
        try {
            G1().g(String.valueOf(C1().getState_cd()));
        } catch (Exception unused2) {
        }
        q1().j.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.di7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanTransferOfOwnerShipActivity.L1(this.a, view);
            }
        });
        H1().i().g(this, new g(new a()));
        H1().h().g(this, new g(new b()));
        G1().h().g(this, new g(new c()));
        q1().t.setOnItemSelectedListener(new d());
        q1().p.setOnItemSelectedListener(new e());
        q1().k.setOnItemSelectedListener(new f());
        q1().o.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ei7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanTransferOfOwnerShipActivity.M1(this.a, view);
            }
        });
        q1().v.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fi7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanTransferOfOwnerShipActivity.N1(this.a, view);
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

    public final gi7 q1() {
        gi7 gi7Var = this.binding;
        if (gi7Var != null) {
            return gi7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final String r1() {
        String str = this.chasis_no;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chasis_no");
        return null;
    }

    public final String s1() {
        String str = this.chasis_no5;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chasis_no5");
        return null;
    }

    public final String t1() {
        String str = this.formated_date;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("formated_date");
        return null;
    }

    public final wa3 u1() {
        wa3 wa3Var = this.languageSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageSession");
        return null;
    }

    public final String v1() {
        String str = this.newOwnerCatagoryGet;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("newOwnerCatagoryGet");
        return null;
    }

    public final String w1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    public final String x1() {
        String str = this.office_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("office_code");
        return null;
    }

    public final String y1() {
        String str = this.ownershipTypeGet;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ownershipTypeGet");
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
