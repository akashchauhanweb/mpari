package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.format.DateFormat;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DRcModle.DReasonResponse;
import com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.IsueOfDuplicateMultiServiceTO;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.b23;
import com.zepto.cg7;
import com.zepto.gz3;
import com.zepto.hz0;
import com.zepto.jd7;
import com.zepto.k18;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.sx3;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.y67;
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
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0015R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010;\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u0010*\u001a\u0004\b9\u0010,\"\u0004\b:\u0010.R\"\u0010?\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010*\u001a\u0004\b=\u0010,\"\u0004\b>\u0010.R\"\u0010C\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010*\u001a\u0004\bA\u0010,\"\u0004\bB\u0010.R*\u0010L\u001a\n E*\u0004\u0018\u00010D0D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010P\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010*\u001a\u0004\bN\u0010,\"\u0004\bO\u0010.R\"\u0010T\u001a\u00020Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R*\u0010g\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010`8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR$\u0010o\u001a\u0004\u0018\u00010h8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010w\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010\u007f\u001a\u00020x8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R(\u0010\u0083\u0001\u001a\u0004\u0018\u00010h8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010j\u001a\u0005\b\u0081\u0001\u0010l\"\u0005\b\u0082\u0001\u0010n¨\u0006\u0086\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerView/IsueOfDuplicateMultiServiceTO;", "Lcom/zepto/pq;", "", "H1", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/b23;", "C", "Lcom/zepto/b23;", "r1", "()Lcom/zepto/b23;", "K1", "(Lcom/zepto/b23;)V", "binding", "Lcom/zepto/ld7;", "D", "Lcom/zepto/ld7;", "z1", "()Lcom/zepto/ld7;", "T1", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "E", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "y1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "S1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "v1", "()Landroid/app/ProgressDialog;", "P1", "(Landroid/app/ProgressDialog;)V", "pDialog", "", "G", "Ljava/lang/String;", "w1", "()Ljava/lang/String;", "Q1", "(Ljava/lang/String;)V", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "H", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "x1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "R1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "I", "u1", "O1", "off_code", "J", "q1", "J1", "aadhar_name", "K", "p1", "I1", "aadhar_address", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "L", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "M", "getFormated_date", "L1", "formated_date", "", "N", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "Lcom/zepto/wa3;", "O", "Lcom/zepto/wa3;", "s1", "()Lcom/zepto/wa3;", "M1", "(Lcom/zepto/wa3;)V", "languageKeySession", "Ljava/util/ArrayList;", "P", "Ljava/util/ArrayList;", "getMultiServiceList", "()Ljava/util/ArrayList;", "setMultiServiceList", "(Ljava/util/ArrayList;)V", "multiServiceList", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "Q", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "getMultiServiceobj", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "setMultiServiceobj", "(Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;)V", "multiServiceobj", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "R", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "getViewModelMulti", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "U1", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;)V", "viewModelMulti", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "S", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "t1", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "N1", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;)V", "multiService", "T", "getDraftObj", "setDraftObj", "draftObj", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class IsueOfDuplicateMultiServiceTO extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public b23 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ld7 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String formated_date;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public MultiServiceDraftTO multiServiceobj;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public MultiSelectionViewModel viewModelMulti;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public MultiService multiService;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public MultiServiceDraftTO draftObj;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public ArrayList multiServiceList = new ArrayList();

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(DReasonResponse dReasonResponse) {
            IsueOfDuplicateMultiServiceTO.this.v1().dismiss();
            try {
                if (dReasonResponse.size() > 0) {
                    dReasonResponse.add(0, new DReasonResponseItem("Select Reason", null));
                    IsueOfDuplicateMultiServiceTO isueOfDuplicateMultiServiceTO = IsueOfDuplicateMultiServiceTO.this;
                    Intrinsics.checkNotNull(dReasonResponse);
                    IsueOfDuplicateMultiServiceTO.this.r1().h.setAdapter((SpinnerAdapter) new cg7(isueOfDuplicateMultiServiceTO, dReasonResponse));
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
            IsueOfDuplicateMultiServiceTO.this.v1().dismiss();
        }
    }

    public static final class c implements AdapterView.OnItemSelectedListener {
        public c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            Object selectedItem = IsueOfDuplicateMultiServiceTO.this.r1().h.getSelectedItem();
            Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem");
            DReasonResponseItem dReasonResponseItem = (DReasonResponseItem) selectedItem;
            if (StringsKt__StringsJVMKt.equals(dReasonResponseItem.getReason_desc(), "OTHER", true) || StringsKt__StringsJVMKt.equals(dReasonResponseItem.getReason_desc(), "TORN", true)) {
                IsueOfDuplicateMultiServiceTO.this.r1().e.setVisibility(8);
            } else {
                IsueOfDuplicateMultiServiceTO.this.r1().e.setVisibility(0);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
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

    public static final void A1(IsueOfDuplicateMultiServiceTO this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.w1());
        intent.putExtra("RcDetails", this$0.x1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.q1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.p1());
        this$0.startActivity(intent);
    }

    public static final void B1(IsueOfDuplicateMultiServiceTO this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            gz3.a.g(this$0, this$0.multiServiceList);
        } catch (Exception unused) {
        }
    }

    public static final void C1(IsueOfDuplicateMultiServiceTO this$0, DatePicker datePicker, int i, int i2, int i3) {
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
        this$0.L1(((String) charSequence3) + '-' + ((String) charSequence2) + '-' + ((String) charSequence));
        this$0.r1().c.setText(simpleDateFormat.format(this$0.cal.getTime()));
    }

    public static final void D1(IsueOfDuplicateMultiServiceTO this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListener, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void E1(IsueOfDuplicateMultiServiceTO this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        wa3 wa3Var = new wa3(this$0);
        try {
            String string = this$0.r1().i.getText().toString();
            String string2 = this$0.r1().d.getText().toString();
            String string3 = this$0.r1().c.getText().toString();
            String string4 = this$0.r1().f.getText().toString();
            Object selectedItem = this$0.r1().h.getSelectedItem();
            Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem");
            DReasonResponseItem dReasonResponseItem = (DReasonResponseItem) selectedItem;
            if (this$0.r1().h.getSelectedItemPosition() == 0) {
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
            k18.a aVar = k18.a;
            String strH = aVar.h(string3);
            int i = Integer.parseInt(this$0.u1());
            String strR = hz0.a.r();
            int i2 = Integer.parseInt("3");
            String strH2 = aVar.h(string3);
            String strValueOf = String.valueOf(dReasonResponseItem.getReason_desc());
            String strW1 = this$0.w1();
            String strValueOf2 = String.valueOf(this$0.x1().getState_cd());
            String rc_vh_class_cd = this$0.x1().getRc_vh_class_cd();
            Intrinsics.checkNotNull(rc_vh_class_cd);
            Durcdto durcdto = new Durcdto("", 0, strH, string2, 0, " ", 0, " ", string, i, strR, string4, string2, i2, strH2, " ", 0, strValueOf, strW1, strValueOf2, "", "", "", Integer.parseInt(rc_vh_class_cd));
            MultiServiceDraftTO multiServiceDraftTO = this$0.multiServiceobj;
            Intrinsics.checkNotNull(multiServiceDraftTO);
            this$0.draftObj = MultiServiceDraftTO.copy$default(multiServiceDraftTO, null, null, null, null, null, durcdto, null, null, 0, null, null, null, null, null, null, null, 65503, null);
            Intent intent = new Intent();
            intent.setClass(this$0, Class.forName("com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView." + VContant.INSTANCE.u("3", this$0.multiServiceList, "S")));
            intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, this$0.multiServiceList);
            intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, this$0.draftObj);
            intent.putExtra("RC", this$0.w1());
            intent.putExtra("RcDetails", this$0.x1());
            intent.putExtra("off_code", this$0.u1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
            intent.putExtra(VContant.NEXGEN_addahar_name, this$0.q1());
            intent.putExtra(VContant.NEXGEN_addahar_address, this$0.p1());
            this$0.startActivity(intent);
            this$0.finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void F1(IsueOfDuplicateMultiServiceTO this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VUtility.INSTANCE.y(this$0, this$0.s1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void G1(IsueOfDuplicateMultiServiceTO this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.H1();
    }

    private final void H1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void I1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void J1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void K1(b23 b23Var) {
        Intrinsics.checkNotNullParameter(b23Var, "<set-?>");
        this.binding = b23Var;
    }

    public final void L1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.formated_date = str;
    }

    public final void M1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void N1(MultiService multiService) {
        Intrinsics.checkNotNullParameter(multiService, "<set-?>");
        this.multiService = multiService;
    }

    public final void O1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void P1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void Q1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void R1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void S1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void T1(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    public final void U1(MultiSelectionViewModel multiSelectionViewModel) {
        Intrinsics.checkNotNullParameter(multiSelectionViewModel, "<set-?>");
        this.viewModelMulti = multiSelectionViewModel;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, s1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.issueofduplicate_rc_multi);
        b23 b23VarC = b23.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(b23VarC, "inflate(...)");
        K1(b23VarC);
        setContentView(r1().b());
        getWindow().addFlags(128);
        ta3.a.G2(this, r1());
        S1(VahanProService.INSTANCE.a(this));
        M1(new wa3(this));
        P1(new ProgressDialog(this));
        v1().setMessage("Please wait...");
        v1().setCancelable(false);
        v1().setCanceledOnTouchOutside(false);
        T1((ld7) new z(this, new kd7(new jd7(y1()))).a(ld7.class));
        N1(MultiService.INSTANCE.a(this));
        U1((MultiSelectionViewModel) new z(this, new y67(new sx3(t1()))).a(MultiSelectionViewModel.class));
        O1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        J1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        I1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Q1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        R1((NrvDetails) serializableExtra);
        Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO");
        this.multiServiceobj = (MultiServiceDraftTO) serializableExtra2;
        ArrayList arrayList = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        this.multiServiceList = arrayList;
        Intrinsics.checkNotNull(arrayList);
        if (arrayList.size() <= 1) {
            M1(new wa3(this));
            r1().l.i.setText(s1().b("issue_of_duplicate_rc", getString(R.string.vahan_duplicate_rc)));
        } else {
            r1().l.i.setText(String.valueOf(s1().b("toSellerHeader", "Transfer of Ownership \n(Seller)")));
        }
        if (this.isFaceless) {
            r1().g.e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.INSTANCE;
        boolean z = this.isFaceless;
        LinearLayout appMent = r1().g.b;
        Intrinsics.checkNotNullExpressionValue(appMent, "appMent");
        companion.M(z, appMent);
        M1(new wa3(this));
        r1().l.e.setVisibility(0);
        r1().l.e.setText(w1());
        SpannableString spannableString = new SpannableString(w1());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        r1().l.e.setText(spannableString);
        r1().u.setText(s1().b("view_vehicle_details", "View Vehicle Details"));
        r1().u.setPaintFlags(r1().u.getPaintFlags() | 8);
        r1().l.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.l23
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IsueOfDuplicateMultiServiceTO.A1(this.a, view);
            }
        });
        r1().l.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.m23
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IsueOfDuplicateMultiServiceTO.B1(this.a, view);
            }
        });
        try {
            v1().show();
            z1().N0(this, "3");
        } catch (Exception e) {
            e.printStackTrace();
        }
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.n23
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                IsueOfDuplicateMultiServiceTO.C1(this.a, datePicker, i, i2, i3);
            }
        };
        r1().c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.o23
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IsueOfDuplicateMultiServiceTO.D1(this.a, onDateSetListener, view);
            }
        });
        z1().L().g(this, new d(new a()));
        z1().M().g(this, new d(new b()));
        r1().h.setOnItemSelectedListener(new c());
        r1().b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.p23
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IsueOfDuplicateMultiServiceTO.E1(this.a, view);
            }
        });
        r1().l.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.q23
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IsueOfDuplicateMultiServiceTO.F1(this.a, view);
            }
        });
        r1().l.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.r23
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IsueOfDuplicateMultiServiceTO.G1(this.a, view);
            }
        });
    }

    public final String p1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String q1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final b23 r1() {
        b23 b23Var = this.binding;
        if (b23Var != null) {
            return b23Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final wa3 s1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final MultiService t1() {
        MultiService multiService = this.multiService;
        if (multiService != null) {
            return multiService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiService");
        return null;
    }

    public final String u1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    public final ProgressDialog v1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String w1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails x1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final VahanProService y1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final ld7 z1() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }
}
