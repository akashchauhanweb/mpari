package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.format.DateFormat;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse;
import com.nic.mparivahan.VahanServices.HPA.Network.HServices;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HtpTypeModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModleItem;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModle;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HpaDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.HypothecationAdditionActivityMultiServiceTO;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.d67;
import com.zepto.gz3;
import com.zepto.hz0;
import com.zepto.ir2;
import com.zepto.jw2;
import com.zepto.k18;
import com.zepto.kr2;
import com.zepto.mf4;
import com.zepto.n07;
import com.zepto.pq;
import com.zepto.sx3;
import com.zepto.wa3;
import com.zepto.wk2;
import com.zepto.y67;
import com.zepto.yh7;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u00100\u001a\n )*\u0004\u0018\u00010(0(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010<\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u00103\u001a\u0004\b:\u00105\"\u0004\b;\u00107R\"\u0010@\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u00103\u001a\u0004\b>\u00105\"\u0004\b?\u00107R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010L\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u00103\u001a\u0004\bJ\u00105\"\u0004\bK\u00107R\"\u0010P\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u00103\u001a\u0004\bN\u00105\"\u0004\bO\u00107R\"\u0010T\u001a\u00020Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R6\u0010h\u001a\u0016\u0012\u0004\u0012\u000201\u0018\u00010`j\n\u0012\u0004\u0012\u000201\u0018\u0001`a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR$\u0010p\u001a\u0004\u0018\u00010i8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010x\u001a\u00020q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR#\u0010\u0080\u0001\u001a\u00020y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR(\u0010\u0084\u0001\u001a\u0004\u0018\u00010i8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010k\u001a\u0005\b\u0082\u0001\u0010m\"\u0005\b\u0083\u0001\u0010oR,\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u0085\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001¨\u0006\u008f\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/HypothecationAdditionActivityMultiServiceTO;", "Lcom/zepto/pq;", "", "T1", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/jw2;", "C", "Lcom/zepto/jw2;", "x1", "()Lcom/zepto/jw2;", "W1", "(Lcom/zepto/jw2;)V", "binding", "Lcom/zepto/kr2;", "D", "Lcom/zepto/kr2;", "F1", "()Lcom/zepto/kr2;", "f2", "(Lcom/zepto/kr2;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/HPA/Network/HServices;", "E", "Lcom/nic/mparivahan/VahanServices/HPA/Network/HServices;", "E1", "()Lcom/nic/mparivahan/VahanServices/HPA/Network/HServices;", "e2", "(Lcom/nic/mparivahan/VahanServices/HPA/Network/HServices;)V", "retrofitService", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "B1", "()Landroid/app/ProgressDialog;", "b2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "G", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "", "H", "Ljava/lang/String;", "getFormated_date", "()Ljava/lang/String;", "X1", "(Ljava/lang/String;)V", "formated_date", "I", "C1", "c2", "rc_number", "J", "A1", "a2", "off_code", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "K", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "D1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "d2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "L", "w1", "V1", "aadhar_name", "M", "v1", "U1", "aadhar_address", "", "N", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "Lcom/zepto/wa3;", "O", "Lcom/zepto/wa3;", "y1", "()Lcom/zepto/wa3;", "Y1", "(Lcom/zepto/wa3;)V", "languageSession", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "P", "Ljava/util/ArrayList;", "getMultiServiceList", "()Ljava/util/ArrayList;", "setMultiServiceList", "(Ljava/util/ArrayList;)V", "multiServiceList", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "Q", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "getMultiServiceobj", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "setMultiServiceobj", "(Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;)V", "multiServiceobj", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "R", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "getViewModelMulti", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "g2", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;)V", "viewModelMulti", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "S", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "z1", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "Z1", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;)V", "multiService", "T", "getDraftObj", "setDraftObj", "draftObj", "Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;", "U", "Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;", "getGetAddharrdetails", "()Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;", "setGetAddharrdetails", "(Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;)V", "getAddharrdetails", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class HypothecationAdditionActivityMultiServiceTO extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public jw2 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public kr2 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public HServices retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String formated_date;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public wa3 languageSession;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public MultiServiceDraftTO multiServiceobj;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public MultiSelectionViewModel viewModelMulti;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public MultiService multiService;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public MultiServiceDraftTO draftObj;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public DoAadhaarResponse getAddharrdetails;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public ArrayList multiServiceList = new ArrayList();

    public static final class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            if (HypothecationAdditionActivityMultiServiceTO.this.x1().p.getSelectedItemPosition() != 0) {
                HypothecationAdditionActivityMultiServiceTO.this.B1().show();
                Object selectedItem = HypothecationAdditionActivityMultiServiceTO.this.x1().p.getSelectedItem();
                Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                HypothecationAdditionActivityMultiServiceTO.this.F1().q(((VahanStateModleSubList) selectedItem).get(0).toString());
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final void G1(HypothecationAdditionActivityMultiServiceTO this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            gz3.a.g(this$0, this$0.multiServiceList);
        } catch (Exception unused) {
        }
    }

    public static final void H1(HypothecationAdditionActivityMultiServiceTO this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.C1());
        intent.putExtra("RcDetails", this$0.D1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.w1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.v1());
        this$0.startActivity(intent);
    }

    public static final void I1(HypothecationAdditionActivityMultiServiceTO this$0, DatePicker datePicker, int i, int i2, int i3) {
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
        this$0.X1(((String) charSequence3) + '-' + ((String) charSequence2) + '-' + ((String) charSequence));
        this$0.x1().f.setText(simpleDateFormat.format(this$0.cal.getTime()));
    }

    public static final void J1(HypothecationAdditionActivityMultiServiceTO this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListener, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void K1(HypothecationAdditionActivityMultiServiceTO this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.x1().h.getText().toString();
        String string2 = this$0.x1().i.getText().toString();
        String string3 = this$0.x1().C.getText().toString();
        String string4 = this$0.x1().l.getText().toString();
        String string5 = this$0.x1().d.getText().toString();
        String string6 = this$0.x1().f.getText().toString();
        Object selectedItem = this$0.x1().p.getSelectedItem();
        Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
        VahanStateModleSubList vahanStateModleSubList = (VahanStateModleSubList) selectedItem;
        if (this$0.x1().k.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.y1().b("please_enter_hypothentication_type", this$0.getString(R.string.please_enter_hypothentication_type)), 0).show();
            return;
        }
        if (string.length() < 2) {
            Toast.makeText(this$0, this$0.y1().b("please_enter_the_financer_name", this$0.getString(R.string.please_enter_the_financer_name)), 0).show();
            return;
        }
        if (string2.length() < 2) {
            Toast.makeText(this$0, this$0.y1().b("please_enter_valid_house_no", this$0.getString(R.string.please_enter_valid_house_no)), 0).show();
            return;
        }
        if (string3.length() < 3) {
            Toast.makeText(this$0, this$0.y1().b("please_enter_village_town_city", this$0.getString(R.string.please_enter_village_town_city)), 0).show();
            return;
        }
        if (this$0.x1().p.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.y1().b("please_select_the_state", this$0.getString(R.string.please_select_the_state)), 0).show();
            return;
        }
        if (this$0.x1().c.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.y1().b("please_select_district", this$0.getString(R.string.please_select_district)), 0).show();
            return;
        }
        if (string5.length() < 6) {
            Toast.makeText(this$0, this$0.y1().b("please_enter_valid_pincode", this$0.getString(R.string.please_enter_valid_pincode)), 0).show();
            return;
        }
        if (this$0.x1().f.getText().length() < 2) {
            Toast.makeText(this$0, this$0.y1().b("please_select_date", this$0.getString(R.string.please_select_date)), 0).show();
            return;
        }
        try {
            hz0.a aVar = hz0.a;
            aVar.r();
            Object selectedItem2 = this$0.x1().k.getSelectedItem();
            Intrinsics.checkNotNull(selectedItem2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.HPTModel.HTPModleItem");
            Object selectedItem3 = this$0.x1().c.getSelectedItem();
            Intrinsics.checkNotNull(selectedItem3, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem");
            int dist_cd = ((DistictModleItem) selectedItem3).getDist_cd();
            int i = Integer.parseInt(string5);
            String string7 = vahanStateModleSubList.get(0).toString();
            String strH = k18.a.h(string6);
            String string8 = ((HTPModleItem) selectedItem2).getHp_type_cd().toString();
            int i2 = Integer.parseInt(this$0.A1());
            String strR = aVar.r();
            int i3 = Integer.parseInt(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE);
            String strC1 = this$0.C1();
            Integer rc_owner_srNo = this$0.D1().getRc_owner_srNo();
            HpaDto hpaDto = new HpaDto("", string2, string3, string4, dist_cd, string, i, string7, strH, string8, i2, strR, i3, strC1, rc_owner_srNo != null ? rc_owner_srNo.intValue() : 0, String.valueOf(this$0.D1().getState_cd()));
            MultiServiceDraftTO multiServiceDraftTO = this$0.multiServiceobj;
            Intrinsics.checkNotNull(multiServiceDraftTO);
            this$0.draftObj = MultiServiceDraftTO.copy$default(multiServiceDraftTO, null, null, null, null, null, null, hpaDto, null, 0, null, null, null, null, null, null, null, 65471, null);
            VContant.Companion companion = VContant.INSTANCE;
            if (StringsKt__StringsJVMKt.equals(companion.t(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE, this$0.multiServiceList), VContant.REDIRECT, true)) {
                return;
            }
            Intent intent = new Intent();
            intent.setClass(this$0, Class.forName("com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer." + companion.u(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE, this$0.multiServiceList, "B")));
            intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, this$0.multiServiceList);
            intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, this$0.draftObj);
            intent.putExtra("RC", this$0.C1());
            intent.putExtra("RcDetails", this$0.D1());
            intent.putExtra("off_code", this$0.A1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
            intent.putExtra(VContant.NEXGEN_addahar_name, this$0.w1());
            intent.putExtra(VContant.NEXGEN_addahar_address, this$0.v1());
            if (this$0.isFaceless) {
                intent.putExtra("AadhaarDetails", this$0.getAddharrdetails);
            }
            this$0.startActivity(intent);
            this$0.finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void L1(HypothecationAdditionActivityMultiServiceTO this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        VUtility.INSTANCE.y(this$0, this$0.y1().b("are_you_sure_you_want_to_leave", this$0.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    public static final void M1(HypothecationAdditionActivityMultiServiceTO this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.T1();
    }

    public static final void N1(HypothecationAdditionActivityMultiServiceTO this$0, VahanStateModle vahanStateModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B1().dismiss();
        try {
            VahanStateModleSubList vahanStateModleSubList = new VahanStateModleSubList();
            vahanStateModleSubList.clear();
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            Intrinsics.checkNotNull(vahanStateModle);
            vahanStateModle.add(0, vahanStateModleSubList);
            this$0.x1().p.setAdapter((SpinnerAdapter) new yh7(this$0, vahanStateModle));
            this$0.B1().show();
            this$0.F1().m();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void O1(HypothecationAdditionActivityMultiServiceTO this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B1().dismiss();
    }

    public static final void P1(HypothecationAdditionActivityMultiServiceTO this$0, DistictModle distictModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B1().dismiss();
        try {
            DistictModleItem distictModleItem = new DistictModleItem("Select District", 0, "Select District");
            Intrinsics.checkNotNull(distictModle);
            distictModle.add(0, distictModleItem);
            this$0.x1().c.setAdapter((SpinnerAdapter) new n07(this$0, distictModle));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void Q1(HypothecationAdditionActivityMultiServiceTO this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B1().dismiss();
    }

    public static final void R1(HypothecationAdditionActivityMultiServiceTO this$0, HtpTypeModle htpTypeModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B1().dismiss();
        try {
            Intrinsics.checkNotNull(htpTypeModle);
            htpTypeModle.add(0, new HTPModleItem("0", "Select Type"));
            this$0.x1().k.setAdapter((SpinnerAdapter) new d67(this$0, htpTypeModle));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void S1(HypothecationAdditionActivityMultiServiceTO this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B1().dismiss();
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, new HTPModleItem("0", "Select Type"));
        this$0.x1().k.setAdapter((SpinnerAdapter) new d67(this$0, arrayList));
    }

    private final void T1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final String A1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    public final ProgressDialog B1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String C1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails D1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final HServices E1() {
        HServices hServices = this.retrofitService;
        if (hServices != null) {
            return hServices;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final kr2 F1() {
        kr2 kr2Var = this.viewModel;
        if (kr2Var != null) {
            return kr2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void U1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void V1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void W1(jw2 jw2Var) {
        Intrinsics.checkNotNullParameter(jw2Var, "<set-?>");
        this.binding = jw2Var;
    }

    public final void X1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.formated_date = str;
    }

    public final void Y1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }

    public final void Z1(MultiService multiService) {
        Intrinsics.checkNotNullParameter(multiService, "<set-?>");
        this.multiService = multiService;
    }

    public final void a2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void b2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void c2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void d2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void e2(HServices hServices) {
        Intrinsics.checkNotNullParameter(hServices, "<set-?>");
        this.retrofitService = hServices;
    }

    public final void f2(kr2 kr2Var) {
        Intrinsics.checkNotNullParameter(kr2Var, "<set-?>");
        this.viewModel = kr2Var;
    }

    public final void g2(MultiSelectionViewModel multiSelectionViewModel) {
        Intrinsics.checkNotNullParameter(multiSelectionViewModel, "<set-?>");
        this.viewModelMulti = multiSelectionViewModel;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, y1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hyptaddition_multi);
        jw2 jw2VarC = jw2.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(jw2VarC, "inflate(...)");
        W1(jw2VarC);
        setContentView(x1().b());
        getWindow().addFlags(128);
        Y1(new wa3(this));
        b2(new ProgressDialog(this));
        B1().setMessage("Please wait...");
        B1().setCancelable(false);
        B1().setCanceledOnTouchOutside(false);
        e2(HServices.INSTANCE.a(this));
        f2((kr2) new z(this, new wk2(new ir2(E1()))).a(kr2.class));
        Z1(MultiService.INSTANCE.a(this));
        g2((MultiSelectionViewModel) new z(this, new y67(new sx3(z1()))).a(MultiSelectionViewModel.class));
        a2(String.valueOf(getIntent().getStringExtra("off_code")));
        V1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        U1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        c2(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        d2((NrvDetails) serializableExtra);
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO");
        this.multiServiceobj = (MultiServiceDraftTO) serializableExtra2;
        this.multiServiceList = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        try {
            if (this.isFaceless) {
                DoAadhaarResponse doAadhaarResponse = (DoAadhaarResponse) getIntent().getSerializableExtra("AadhaarDetails");
                this.getAddharrdetails = doAadhaarResponse;
                Log.e("getAddharrdetails-Addition", String.valueOf(doAadhaarResponse));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        x1().s.e.setVisibility(0);
        x1().s.e.setText(C1());
        SpannableString spannableString = new SpannableString(C1());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        x1().s.e.setText(spannableString);
        wa3 wa3Var = new wa3(this);
        ArrayList arrayList = this.multiServiceList;
        Intrinsics.checkNotNull(arrayList);
        if (arrayList.size() <= 1) {
            x1().s.i.setText(wa3Var.b("hypothecation_addition", getString(R.string.vahan_hypothecation_addition)));
        } else {
            x1().s.i.setText(String.valueOf(wa3Var.b("toBuyerHeader", "Transfer of Ownership \n(Buyer)")));
        }
        x1().s.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lt2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationAdditionActivityMultiServiceTO.G1(this.a, view);
            }
        });
        if (this.isFaceless) {
            x1().o.e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.INSTANCE;
        boolean z = this.isFaceless;
        LinearLayout appMent = x1().o.b;
        Intrinsics.checkNotNullExpressionValue(appMent, "appMent");
        companion.M(z, appMent);
        Serializable serializableExtra3 = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra3, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        d2((NrvDetails) serializableExtra3);
        x1().A.setText(y1().b("vehicle_no", "Vehicle No.:") + ' ' + C1());
        x1().B.setText(y1().b("view_vehicle_details", "View Vehicle Details"));
        x1().B.setPaintFlags(x1().B.getPaintFlags() | 8);
        x1().s.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.st2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationAdditionActivityMultiServiceTO.H1(this.a, view);
            }
        });
        x1().s.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tt2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationAdditionActivityMultiServiceTO.L1(this.a, view);
            }
        });
        x1().s.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ut2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationAdditionActivityMultiServiceTO.M1(this.a, view);
            }
        });
        try {
            B1().show();
            F1().o();
        } catch (Exception unused) {
        }
        F1().n().g(this, new mf4() { // from class: com.zepto.vt2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationAdditionActivityMultiServiceTO.N1(this.a, (VahanStateModle) obj);
            }
        });
        F1().p().g(this, new mf4() { // from class: com.zepto.wt2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationAdditionActivityMultiServiceTO.O1(this.a, (String) obj);
            }
        });
        F1().g().g(this, new mf4() { // from class: com.zepto.xt2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationAdditionActivityMultiServiceTO.P1(this.a, (DistictModle) obj);
            }
        });
        F1().h().g(this, new mf4() { // from class: com.zepto.mt2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationAdditionActivityMultiServiceTO.Q1(this.a, (String) obj);
            }
        });
        F1().i().g(this, new mf4() { // from class: com.zepto.nt2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationAdditionActivityMultiServiceTO.R1(this.a, (HtpTypeModle) obj);
            }
        });
        F1().j().g(this, new mf4() { // from class: com.zepto.ot2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HypothecationAdditionActivityMultiServiceTO.S1(this.a, (String) obj);
            }
        });
        Spinner spinner = x1().p;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(new a());
        }
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.pt2
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                HypothecationAdditionActivityMultiServiceTO.I1(this.a, datePicker, i, i2, i3);
            }
        };
        x1().f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qt2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationAdditionActivityMultiServiceTO.J1(this.a, onDateSetListener, view);
            }
        });
        x1().b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rt2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HypothecationAdditionActivityMultiServiceTO.K1(this.a, view);
            }
        });
    }

    public final String v1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String w1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final jw2 x1() {
        jw2 jw2Var = this.binding;
        if (jw2Var != null) {
            return jw2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
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

    public final MultiService z1() {
        MultiService multiService = this.multiService;
        if (multiService != null) {
            return multiService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiService");
        return null;
    }
}
