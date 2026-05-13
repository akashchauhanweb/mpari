package com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.format.DateFormat;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DRcModle.DReasonResponse;
import com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.Confirmation.VahanMultiServiceConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.ChanngeOfAdressDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HpaDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.ApiMessage;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.Data;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.DraftResponse;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.IsueOfDuplicateMultiService;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.b23;
import com.zepto.cg7;
import com.zepto.ed5;
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
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0015J\u001e\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00103\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010?\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010.\u001a\u0004\b=\u00100\"\u0004\b>\u00102R\"\u0010C\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010.\u001a\u0004\bA\u00100\"\u0004\bB\u00102R\"\u0010G\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010.\u001a\u0004\bE\u00100\"\u0004\bF\u00102R*\u0010P\u001a\n I*\u0004\u0018\u00010H0H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010T\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010.\u001a\u0004\bR\u00100\"\u0004\bS\u00102R\"\u0010X\u001a\u00020U8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010c\u001a\u00020\\8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR*\u0010j\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR$\u0010r\u001a\u0004\u0018\u00010k8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010z\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR%\u0010\u0082\u0001\u001a\u00020{8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R(\u0010\u0086\u0001\u001a\u0004\u0018\u00010k8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010m\u001a\u0005\b\u0084\u0001\u0010o\"\u0005\b\u0085\u0001\u0010q¨\u0006\u0089\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiServiceActivity/IsueOfDuplicateMultiService;", "Lcom/zepto/pq;", "", "M1", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "purCode", "Ljava/util/ArrayList;", "purSel", "Y1", "Lcom/zepto/b23;", "C", "Lcom/zepto/b23;", "t1", "()Lcom/zepto/b23;", "P1", "(Lcom/zepto/b23;)V", "binding", "Lcom/zepto/ld7;", "D", "Lcom/zepto/ld7;", "B1", "()Lcom/zepto/ld7;", "Z1", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "E", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "A1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "X1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "x1", "()Landroid/app/ProgressDialog;", "U1", "(Landroid/app/ProgressDialog;)V", "pDialog", "G", "Ljava/lang/String;", "y1", "()Ljava/lang/String;", "V1", "(Ljava/lang/String;)V", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "H", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "z1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "W1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "I", "w1", "T1", "off_code", "J", "s1", "O1", "aadhar_name", "K", "r1", "N1", "aadhar_address", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "L", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "M", "getFormated_date", "Q1", "formated_date", "", "N", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "Lcom/zepto/wa3;", "O", "Lcom/zepto/wa3;", "u1", "()Lcom/zepto/wa3;", "R1", "(Lcom/zepto/wa3;)V", "languageKeySession", "P", "Ljava/util/ArrayList;", "getMultiServiceList", "()Ljava/util/ArrayList;", "setMultiServiceList", "(Ljava/util/ArrayList;)V", "multiServiceList", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;", "Q", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;", "getMultiServiceobj", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;", "setMultiServiceobj", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/Model/DraftModel/MultiServiceDraft;)V", "multiServiceobj", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "R", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "C1", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "a2", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;)V", "viewModelMulti", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "S", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "v1", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "S1", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;)V", "multiService", "T", "getDraftObj", "setDraftObj", "draftObj", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class IsueOfDuplicateMultiService extends pq {

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
    public MultiServiceDraft multiServiceobj;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public MultiSelectionViewModel viewModelMulti;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public MultiService multiService;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public MultiServiceDraft draftObj;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public ArrayList multiServiceList = new ArrayList();

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(DReasonResponse dReasonResponse) {
            IsueOfDuplicateMultiService.this.x1().dismiss();
            try {
                if (dReasonResponse.size() > 0) {
                    dReasonResponse.add(0, new DReasonResponseItem("Select Reason", null));
                    IsueOfDuplicateMultiService isueOfDuplicateMultiService = IsueOfDuplicateMultiService.this;
                    Intrinsics.checkNotNull(dReasonResponse);
                    IsueOfDuplicateMultiService.this.t1().h.setAdapter((SpinnerAdapter) new cg7(isueOfDuplicateMultiService, dReasonResponse));
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
            IsueOfDuplicateMultiService.this.x1().dismiss();
        }
    }

    public static final class c implements AdapterView.OnItemSelectedListener {
        public c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            Object selectedItem = IsueOfDuplicateMultiService.this.t1().h.getSelectedItem();
            Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem");
            DReasonResponseItem dReasonResponseItem = (DReasonResponseItem) selectedItem;
            if (StringsKt__StringsJVMKt.equals(dReasonResponseItem.getReason_desc(), "OTHER", true) || StringsKt__StringsJVMKt.equals(dReasonResponseItem.getReason_desc(), "TORN", true)) {
                IsueOfDuplicateMultiService.this.t1().e.setVisibility(8);
            } else {
                IsueOfDuplicateMultiService.this.t1().e.setVisibility(0);
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

    public static final void D1(IsueOfDuplicateMultiService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.y1());
        intent.putExtra("RcDetails", this$0.z1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.s1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.r1());
        this$0.startActivity(intent);
    }

    public static final void E1(IsueOfDuplicateMultiService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            gz3.a.g(this$0, this$0.multiServiceList);
        } catch (Exception unused) {
        }
    }

    public static final void F1(IsueOfDuplicateMultiService this$0, DatePicker datePicker, int i, int i2, int i3) {
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
        this$0.Q1(((String) charSequence3) + '-' + ((String) charSequence2) + '-' + ((String) charSequence));
        this$0.t1().c.setText(simpleDateFormat.format(this$0.cal.getTime()));
    }

    public static final void G1(IsueOfDuplicateMultiService this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListener, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void H1(IsueOfDuplicateMultiService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        wa3 wa3Var = new wa3(this$0);
        try {
            String string = this$0.t1().i.getText().toString();
            String string2 = this$0.t1().d.getText().toString();
            String string3 = this$0.t1().c.getText().toString();
            String string4 = this$0.t1().f.getText().toString();
            Object selectedItem = this$0.t1().h.getSelectedItem();
            Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem");
            DReasonResponseItem dReasonResponseItem = (DReasonResponseItem) selectedItem;
            if (this$0.t1().h.getSelectedItemPosition() == 0) {
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
            int i = Integer.parseInt(this$0.w1());
            String strR = hz0.a.r();
            int i2 = Integer.parseInt("3");
            String strH2 = aVar.h(string3);
            String strValueOf = String.valueOf(dReasonResponseItem.getReason_desc());
            String strY1 = this$0.y1();
            String strValueOf2 = String.valueOf(this$0.z1().getState_cd());
            String rc_vh_class_cd = this$0.z1().getRc_vh_class_cd();
            Intrinsics.checkNotNull(rc_vh_class_cd);
            Durcdto durcdto = new Durcdto("", 0, strH, string2, 0, " ", 0, " ", "", i, strR, string4, string2, i2, strH2, " ", 0, strValueOf, strY1, strValueOf2, "", "", "", Integer.parseInt(rc_vh_class_cd));
            MultiServiceDraft multiServiceDraft = this$0.multiServiceobj;
            Intrinsics.checkNotNull(multiServiceDraft);
            this$0.draftObj = multiServiceDraft.copy((2045 & 1) != 0 ? multiServiceDraft.applNo : null, (2045 & 2) != 0 ? multiServiceDraft.channgeOfAdressDto : null, (2045 & 4) != 0 ? multiServiceDraft.durcdto : durcdto, (2045 & 8) != 0 ? multiServiceDraft.hpaDto : null, (2045 & 16) != 0 ? multiServiceDraft.hptDto : null, (2045 & 32) != 0 ? multiServiceDraft.officeCode : 0, (2045 & 64) != 0 ? multiServiceDraft.openDate : null, (2045 & 128) != 0 ? multiServiceDraft.purposeCode : null, (2045 & 256) != 0 ? multiServiceDraft.regnNo : null, (2045 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? multiServiceDraft.stateCode : null, (2045 & 1024) != 0 ? multiServiceDraft.transferOwnershipDto : null);
            VContant.Companion companion = VContant.INSTANCE;
            if (StringsKt__StringsJVMKt.equals(companion.t("3", this$0.multiServiceList), VContant.REDIRECT, true)) {
                this$0.x1().show();
                MultiSelectionViewModel multiSelectionViewModelC1 = this$0.C1();
                MultiServiceDraft multiServiceDraft2 = this$0.draftObj;
                Intrinsics.checkNotNull(multiServiceDraft2);
                multiSelectionViewModelC1.v(multiServiceDraft2);
                return;
            }
            Intent intent = new Intent();
            if (companion.w("3", this$0.multiServiceList)) {
                intent.setClass(this$0, Class.forName("com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.TranferofOwnerShip." + companion.t("3", this$0.multiServiceList)));
            } else {
                intent.setClass(this$0, Class.forName("com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity." + companion.t("3", this$0.multiServiceList)));
            }
            intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, this$0.multiServiceList);
            intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, this$0.draftObj);
            intent.putExtra("RC", this$0.y1());
            intent.putExtra("RcDetails", this$0.z1());
            intent.putExtra("off_code", this$0.w1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
            intent.putExtra(VContant.NEXGEN_addahar_name, this$0.s1());
            intent.putExtra(VContant.NEXGEN_addahar_address, this$0.r1());
            this$0.startActivity(intent);
            this$0.finish();
        } catch (Exception unused) {
        }
    }

    public static final void I1(IsueOfDuplicateMultiService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VUtility.INSTANCE.y(this$0, this$0.u1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void J1(IsueOfDuplicateMultiService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.M1();
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
    public static final void K1(IsueOfDuplicateMultiService this$0, DraftResponse draftResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.x1().dismiss();
        ApiMessage apiMessage = draftResponse.getApiMessage();
        if (apiMessage == null || apiMessage.getStatusCode() != 200) {
            VContant.Companion companion = VContant.INSTANCE;
            ApiMessage apiMessage2 = draftResponse.getApiMessage();
            companion.N(this$0, apiMessage2 != null ? apiMessage2.getDeveloperMessage() : null);
            return;
        }
        Data data = draftResponse.getData();
        String strValueOf = String.valueOf(data != null ? data.getApplNo() : null);
        Data data2 = draftResponse.getData();
        if (data2 != null) {
            data2.getTransferOwnershipDto();
        }
        Data data3 = draftResponse.getData();
        ChanngeOfAdressDto channgeOfAdressDto = data3 != null ? data3.getChanngeOfAdressDto() : null;
        Data data4 = draftResponse.getData();
        HpaDto hpaDto = data4 != null ? data4.getHpaDto() : null;
        Data data5 = draftResponse.getData();
        HptDto hptDto = data5 != null ? data5.getHptDto() : null;
        Data data6 = draftResponse.getData();
        Durcdto durcdto = data6 != null ? data6.getDurcdto() : null;
        MultiServiceDraft multiServiceDraft = this$0.multiServiceobj;
        MultiServiceDraft multiServiceDraftCopy = multiServiceDraft != null ? multiServiceDraft.copy((2045 & 1) != 0 ? multiServiceDraft.applNo : strValueOf, (2045 & 2) != 0 ? multiServiceDraft.channgeOfAdressDto : channgeOfAdressDto, (2045 & 4) != 0 ? multiServiceDraft.durcdto : durcdto, (2045 & 8) != 0 ? multiServiceDraft.hpaDto : hpaDto, (2045 & 16) != 0 ? multiServiceDraft.hptDto : hptDto, (2045 & 32) != 0 ? multiServiceDraft.officeCode : 0, (2045 & 64) != 0 ? multiServiceDraft.openDate : null, (2045 & 128) != 0 ? multiServiceDraft.purposeCode : null, (2045 & 256) != 0 ? multiServiceDraft.regnNo : null, (2045 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? multiServiceDraft.stateCode : null, (2045 & 1024) != 0 ? multiServiceDraft.transferOwnershipDto : null) : null;
        Intent intent = new Intent(this$0, (Class<?>) VahanMultiServiceConfirmationScreen.class);
        intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, this$0.multiServiceList);
        intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, multiServiceDraftCopy);
        intent.putExtra("RcDetails", this$0.z1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.s1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.r1());
        this$0.startActivity(intent);
        this$0.finish();
    }

    public static final void L1(IsueOfDuplicateMultiService this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.x1().dismiss();
        VContant.INSTANCE.N(this$0, str);
    }

    private final void M1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final VahanProService A1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final ld7 B1() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final MultiSelectionViewModel C1() {
        MultiSelectionViewModel multiSelectionViewModel = this.viewModelMulti;
        if (multiSelectionViewModel != null) {
            return multiSelectionViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelMulti");
        return null;
    }

    public final void N1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void O1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void P1(b23 b23Var) {
        Intrinsics.checkNotNullParameter(b23Var, "<set-?>");
        this.binding = b23Var;
    }

    public final void Q1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.formated_date = str;
    }

    public final void R1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void S1(MultiService multiService) {
        Intrinsics.checkNotNullParameter(multiService, "<set-?>");
        this.multiService = multiService;
    }

    public final void T1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void U1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void V1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void W1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void X1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void Y1(String purCode, ArrayList purSel) {
        Intrinsics.checkNotNullParameter(purCode, "purCode");
        try {
            Intrinsics.checkNotNull(purSel);
            int iIndexOf = purSel.indexOf(purCode);
            if (purSel.size() == 4) {
                t1().k.b.setVisibility(0);
                TextView textView = t1().k.d;
                VContant.Companion companion = VContant.INSTANCE;
                Object obj = purSel.get(0);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                textView.setText(companion.D(this, (String) obj));
                TextView textView2 = t1().k.f;
                Object obj2 = purSel.get(1);
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                textView2.setText(companion.D(this, (String) obj2));
                TextView textView3 = t1().k.k;
                Object obj3 = purSel.get(2);
                Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                textView3.setText(companion.D(this, (String) obj3));
                TextView textView4 = t1().k.n;
                Object obj4 = purSel.get(3);
                Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                textView4.setText(companion.D(this, (String) obj4));
                if (iIndexOf == 3) {
                    t1().k.c.setChecked(true);
                    t1().k.e.setChecked(true);
                    t1().k.h.setChecked(true);
                    t1().k.m.setChecked(false);
                }
                if (iIndexOf == 2) {
                    t1().k.c.setChecked(true);
                    t1().k.e.setChecked(true);
                    t1().k.h.setChecked(false);
                    t1().k.m.setCheckMarkDrawable(ed5.e(getResources(), R.drawable.checkbox_multiservice, getTheme()));
                }
                if (iIndexOf == 1) {
                    t1().k.c.setChecked(true);
                    t1().k.e.setChecked(false);
                    Drawable drawableE = ed5.e(getResources(), R.drawable.checkbox_multiservice, getTheme());
                    t1().k.h.setCheckMarkDrawable(drawableE);
                    t1().k.m.setCheckMarkDrawable(drawableE);
                }
                if (iIndexOf == 0) {
                    t1().k.c.setChecked(false);
                    Drawable drawableE2 = ed5.e(getResources(), R.drawable.checkbox_multiservice, getTheme());
                    t1().k.e.setCheckMarkDrawable(drawableE2);
                    t1().k.h.setCheckMarkDrawable(drawableE2);
                    t1().k.m.setCheckMarkDrawable(drawableE2);
                }
            }
            if (purSel.size() == 3) {
                t1().k.u.setVisibility(0);
                TextView textView5 = t1().k.z;
                VContant.Companion companion2 = VContant.INSTANCE;
                Object obj5 = purSel.get(2);
                Intrinsics.checkNotNullExpressionValue(obj5, "get(...)");
                textView5.setText(companion2.D(this, (String) obj5));
                TextView textView6 = t1().k.w;
                Object obj6 = purSel.get(1);
                Intrinsics.checkNotNullExpressionValue(obj6, "get(...)");
                textView6.setText(companion2.D(this, (String) obj6));
                TextView textView7 = t1().k.j;
                Object obj7 = purSel.get(0);
                Intrinsics.checkNotNullExpressionValue(obj7, "get(...)");
                textView7.setText(companion2.D(this, (String) obj7));
                if (iIndexOf == 2) {
                    t1().k.i.setChecked(true);
                    t1().k.v.setChecked(true);
                    t1().k.y.setChecked(false);
                }
                if (iIndexOf == 1) {
                    t1().k.i.setChecked(true);
                    t1().k.v.setChecked(false);
                    t1().k.y.setCheckMarkDrawable(ed5.e(getResources(), R.drawable.checkbox_multiservice, getTheme()));
                }
                if (iIndexOf == 0) {
                    t1().k.i.setChecked(false);
                    Drawable drawableE3 = ed5.e(getResources(), R.drawable.checkbox_multiservice, getTheme());
                    t1().k.v.setCheckMarkDrawable(drawableE3);
                    t1().k.y.setCheckMarkDrawable(drawableE3);
                }
            }
            if (purSel.size() == 2) {
                t1().k.A.setVisibility(0);
                TextView textView8 = t1().k.t;
                VContant.Companion companion3 = VContant.INSTANCE;
                Object obj8 = purSel.get(1);
                Intrinsics.checkNotNullExpressionValue(obj8, "get(...)");
                textView8.setText(companion3.D(this, (String) obj8));
                TextView textView9 = t1().k.r;
                Object obj9 = purSel.get(0);
                Intrinsics.checkNotNullExpressionValue(obj9, "get(...)");
                textView9.setText(companion3.D(this, (String) obj9));
                if (iIndexOf == 1) {
                    t1().k.q.setChecked(true);
                    t1().k.s.setChecked(false);
                }
                if (iIndexOf == 0) {
                    t1().k.q.setChecked(false);
                    t1().k.s.setCheckMarkDrawable(ed5.e(getResources(), R.drawable.checkbox_multiservice, getTheme()));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void Z1(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    public final void a2(MultiSelectionViewModel multiSelectionViewModel) {
        Intrinsics.checkNotNullParameter(multiSelectionViewModel, "<set-?>");
        this.viewModelMulti = multiSelectionViewModel;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, u1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.issueofduplicate_rc_multi);
        b23 b23VarC = b23.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(b23VarC, "inflate(...)");
        P1(b23VarC);
        setContentView(t1().b());
        ta3.a.H2(this, t1());
        X1(VahanProService.INSTANCE.a(this));
        R1(new wa3(this));
        U1(new ProgressDialog(this));
        x1().setMessage("Please wait...");
        x1().setCancelable(false);
        x1().setCanceledOnTouchOutside(false);
        Z1((ld7) new z(this, new kd7(new jd7(A1()))).a(ld7.class));
        S1(MultiService.INSTANCE.a(this));
        a2((MultiSelectionViewModel) new z(this, new y67(new sx3(v1()))).a(MultiSelectionViewModel.class));
        T1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        O1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        N1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        V1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        W1((NrvDetails) serializableExtra);
        Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft");
        this.multiServiceobj = (MultiServiceDraft) serializableExtra2;
        ArrayList arrayList = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        this.multiServiceList = arrayList;
        Intrinsics.checkNotNull(arrayList);
        if (arrayList.size() <= 1) {
            R1(new wa3(this));
            t1().l.i.setText(u1().b("issue_of_duplicate_rc", getString(R.string.vahan_duplicate_rc)));
        } else {
            SpannableString spannableString = new SpannableString(u1().b("rcServices", getString(R.string.rc_service)));
            spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
            t1().l.i.setText(spannableString);
        }
        if (this.isFaceless) {
            t1().g.e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.INSTANCE;
        boolean z = this.isFaceless;
        LinearLayout appMent = t1().g.b;
        Intrinsics.checkNotNullExpressionValue(appMent, "appMent");
        companion.M(z, appMent);
        R1(new wa3(this));
        t1().l.e.setVisibility(0);
        t1().l.e.setText(y1());
        SpannableString spannableString2 = new SpannableString(y1());
        spannableString2.setSpan(new UnderlineSpan(), 0, spannableString2.length(), 0);
        t1().l.e.setText(spannableString2);
        t1().u.setText(u1().b("view_vehicle_details", "View Vehicle Details"));
        Y1("3", this.multiServiceList);
        t1().u.setPaintFlags(t1().u.getPaintFlags() | 8);
        t1().l.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.c23
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IsueOfDuplicateMultiService.D1(this.a, view);
            }
        });
        t1().l.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.d23
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IsueOfDuplicateMultiService.E1(this.a, view);
            }
        });
        try {
            x1().show();
            B1().N0(this, "3");
        } catch (Exception e) {
            e.printStackTrace();
        }
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.e23
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                IsueOfDuplicateMultiService.F1(this.a, datePicker, i, i2, i3);
            }
        };
        t1().c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.f23
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IsueOfDuplicateMultiService.G1(this.a, onDateSetListener, view);
            }
        });
        B1().L().g(this, new d(new a()));
        B1().M().g(this, new d(new b()));
        t1().h.setOnItemSelectedListener(new c());
        t1().b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.g23
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IsueOfDuplicateMultiService.H1(this.a, view);
            }
        });
        t1().l.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.h23
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IsueOfDuplicateMultiService.I1(this.a, view);
            }
        });
        t1().l.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.i23
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IsueOfDuplicateMultiService.J1(this.a, view);
            }
        });
        C1().l().g(this, new mf4() { // from class: com.zepto.j23
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                IsueOfDuplicateMultiService.K1(this.a, (DraftResponse) obj);
            }
        });
        C1().m().g(this, new mf4() { // from class: com.zepto.k23
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                IsueOfDuplicateMultiService.L1(this.a, (String) obj);
            }
        });
    }

    public final String r1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String s1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final b23 t1() {
        b23 b23Var = this.binding;
        if (b23Var != null) {
            return b23Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final wa3 u1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final MultiService v1() {
        MultiService multiService = this.multiService;
        if (multiService != null) {
            return multiService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiService");
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

    public final ProgressDialog x1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String y1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails z1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }
}
