package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer;

import android.app.ProgressDialog;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import android.widget.Toast;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.DOEkyc;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModle;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.ld7;
import com.zepto.n07;
import com.zepto.pb6;
import com.zepto.pq;
import com.zepto.v1;
import com.zepto.wa3;
import com.zepto.yh7;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0016\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0016\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eR\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R*\u0010:\u001a\n 3*\u0004\u0018\u000102028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010A\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010E\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010<\u001a\u0004\bC\u0010>\"\u0004\bD\u0010@R\"\u0010I\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010<\u001a\u0004\bG\u0010>\"\u0004\bH\u0010@R\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010Y\u001a\u0004\u0018\u00010R8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010]\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010<\u001a\u0004\b[\u0010>\"\u0004\b\\\u0010@R\"\u0010a\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010<\u001a\u0004\b_\u0010>\"\u0004\b`\u0010@R\"\u0010d\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010o\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR*\u0010w\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010p8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR$\u0010\u007f\u001a\u0004\u0018\u00010x8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~¨\u0006\u0082\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/AadhaarAddressTO;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "", "State_code", "Lcom/nic/mparivahan/VahanServices/VahanModel/VahanStateModle;", "list", "y1", "z1", "Lcom/zepto/v1;", "C", "Lcom/zepto/v1;", "s1", "()Lcom/zepto/v1;", "L1", "(Lcom/zepto/v1;)V", "binding", "Lcom/zepto/ld7;", "D", "Lcom/zepto/ld7;", "A1", "()Lcom/zepto/ld7;", "T1", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "E", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "x1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "R1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "v1", "()Landroid/app/ProgressDialog;", "P1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "G", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "H", "Ljava/lang/String;", "u1", "()Ljava/lang/String;", "O1", "(Ljava/lang/String;)V", "off_code", "I", "getStateCd", "S1", "stateCd", "J", "getCurrentDistrictGet", "M1", "currentDistrictGet", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "K", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "w1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "Q1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;", "L", "Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;", "getGetAddharrdetails", "()Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;", "setGetAddharrdetails", "(Lcom/nic/mparivahan/VahanEkyc/AadharModle/DoAadhaarResponse;)V", "getAddharrdetails", "M", "r1", "K1", "aadhar_name", "N", "q1", "J1", "aadhar_address", "O", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "Lcom/zepto/wa3;", "P", "Lcom/zepto/wa3;", "t1", "()Lcom/zepto/wa3;", "N1", "(Lcom/zepto/wa3;)V", "languageSession", "Ljava/util/ArrayList;", "Q", "Ljava/util/ArrayList;", "getMultiServiceList", "()Ljava/util/ArrayList;", "setMultiServiceList", "(Ljava/util/ArrayList;)V", "multiServiceList", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "R", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "getMultiServiceobj", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "setMultiServiceobj", "(Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;)V", "multiServiceobj", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class AadhaarAddressTO extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public v1 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ld7 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String stateCd;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String currentDistrictGet;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public DoAadhaarResponse getAddharrdetails;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public wa3 languageSession;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public MultiServiceDraftTO multiServiceobj;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public ArrayList multiServiceList = new ArrayList();

    public static final class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            AadhaarAddressTO.this.M1(String.valueOf(adapterView != null ? adapterView.getItemAtPosition(i) : null));
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
            if (AadhaarAddressTO.this.s1().e.getSelectedItemPosition() != 0) {
                AadhaarAddressTO.this.v1().show();
                Object selectedItem = AadhaarAddressTO.this.s1().e.getSelectedItem();
                Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                AadhaarAddressTO.this.A1().r1(AadhaarAddressTO.this, ((VahanStateModleSubList) selectedItem).get(0).toString());
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class c implements AdapterView.OnItemSelectedListener {
        public c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            if (AadhaarAddressTO.this.s1().v.getSelectedItemPosition() != 0) {
                AadhaarAddressTO.this.v1().show();
                Object selectedItem = AadhaarAddressTO.this.s1().v.getSelectedItem();
                Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                AadhaarAddressTO.this.A1().s1(AadhaarAddressTO.this, ((VahanStateModleSubList) selectedItem).get(0).toString());
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final void B1(AadhaarAddressTO this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.w1().getRc_regn_no());
        intent.putExtra("RcDetails", this$0.w1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.r1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.q1());
        this$0.startActivity(intent);
    }

    public static final void C1(AadhaarAddressTO this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void D1(AadhaarAddressTO this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.s1().h.getText().length() < 2) {
            Toast.makeText(this$0, this$0.t1().b("please_enter_house_no_street_name", this$0.getString(R.string.please_enter_house_no_street_name)), 0).show();
            return;
        }
        if (this$0.s1().f.getText().length() < 2) {
            Toast.makeText(this$0, this$0.t1().b("please_enter_current_village_town_city", this$0.getString(R.string.please_enter_current_village_town_city)), 0).show();
            return;
        }
        if (this$0.s1().c.getText().length() < 2) {
            Toast.makeText(this$0, this$0.t1().b("please_enter_current_landmark_police_station", this$0.getString(R.string.please_enter_current_landmark_police_station)), 0).show();
            return;
        }
        if (this$0.s1().d.getText().length() < 2) {
            Toast.makeText(this$0, this$0.t1().b("please_enter_current_pin_code", this$0.getString(R.string.please_enter_current_pin_code)), 0).show();
            return;
        }
        if (this$0.s1().e.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.t1().b("select_state", this$0.getString(R.string.please_select_current_state)), 0).show();
            return;
        }
        if (this$0.s1().b.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.t1().b("select_district", this$0.getString(R.string.please_select_current_district)), 0).show();
            return;
        }
        Object selectedItem = this$0.s1().b.getSelectedItem();
        Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem");
        String string = this$0.s1().m.getText().toString();
        Object selectedItem2 = this$0.s1().e.getSelectedItem();
        Intrinsics.checkNotNull(selectedItem2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
        Object selectedItem3 = this$0.s1().v.getSelectedItem();
        Intrinsics.checkNotNull(selectedItem3, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
        new pb6(this$0).f(this$0.s1(), ((VahanStateModleSubList) selectedItem2).get(0).toString(), ((VahanStateModleSubList) selectedItem3).get(0).toString(), String.valueOf(((DistictModleItem) selectedItem).getDist_cd()), string);
        Intent intent = new Intent(this$0, (Class<?>) NomineeAndInsuranceDetailTOBuyer.class);
        intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, this$0.multiServiceList);
        intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, this$0.multiServiceobj);
        intent.putExtra("off_code", this$0.u1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra("RcDetails", this$0.w1());
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.r1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.q1());
        this$0.startActivity(intent);
    }

    public static final void E1(AadhaarAddressTO this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void F1(AadhaarAddressTO this$0, VahanStateModle vahanStateModle) {
        DOEkyc dOEkyc;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.v1().dismiss();
        try {
            VahanStateModleSubList vahanStateModleSubList = new VahanStateModleSubList();
            vahanStateModleSubList.clear();
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            Intrinsics.checkNotNull(vahanStateModle);
            vahanStateModle.add(0, vahanStateModleSubList);
            this$0.s1().e.setAdapter((SpinnerAdapter) new yh7(this$0, vahanStateModle));
            try {
                int iY1 = this$0.y1(StringsKt__StringsKt.trim((CharSequence) String.valueOf(this$0.w1().getState_cd())).toString(), vahanStateModle);
                this$0.s1().e.setSelection(iY1);
                this$0.s1().e.setEnabled(false);
                this$0.s1().v.setAdapter((SpinnerAdapter) new yh7(this$0, vahanStateModle));
                this$0.s1().v.setSelection(iY1);
                if (this$0.isFaceless) {
                    return;
                }
                DoAadhaarResponse doAadhaarResponse = this$0.getAddharrdetails;
                this$0.s1().v.setSelection(this$0.z1(StringsKt__StringsKt.trim((CharSequence) String.valueOf((doAadhaarResponse == null || (dOEkyc = doAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc.getState())).toString(), vahanStateModle));
                this$0.s1().v.setEnabled(false);
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        e2.printStackTrace();
    }

    public static final void G1(AadhaarAddressTO this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.v1().dismiss();
    }

    public static final void H1(AadhaarAddressTO this$0, DistictModle distictModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.v1().dismiss();
        try {
            DistictModleItem distictModleItem = new DistictModleItem("Select District", 0, "Select District");
            Intrinsics.checkNotNull(distictModle);
            distictModle.add(0, distictModleItem);
            this$0.s1().b.setAdapter((SpinnerAdapter) new n07(this$0, distictModle));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void I1(AadhaarAddressTO this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.v1().dismiss();
    }

    public final ld7 A1() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void J1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void K1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void L1(v1 v1Var) {
        Intrinsics.checkNotNullParameter(v1Var, "<set-?>");
        this.binding = v1Var;
    }

    public final void M1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currentDistrictGet = str;
    }

    public final void N1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }

    public final void O1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void P1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void Q1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void R1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void S1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCd = str;
    }

    public final void T1(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0210 A[Catch: Exception -> 0x01b2, TryCatch #1 {Exception -> 0x01b2, blocks: (B:6:0x018a, B:8:0x01a7, B:10:0x01ad, B:14:0x01b6, B:16:0x01bc, B:18:0x01c0, B:20:0x01c6, B:22:0x01cc, B:24:0x01d2, B:26:0x01e1, B:28:0x01e7, B:30:0x01ed, B:32:0x01f9, B:34:0x01ff, B:36:0x0205, B:67:0x026f, B:70:0x027b, B:72:0x0281, B:75:0x0288, B:77:0x0295, B:79:0x029b, B:83:0x02a3, B:85:0x02b0, B:87:0x02b6, B:89:0x02c0, B:91:0x02d1, B:93:0x02d7, B:94:0x02db, B:37:0x0210, B:39:0x0214, B:41:0x021a, B:43:0x0220, B:45:0x0226, B:47:0x0230, B:49:0x0236, B:51:0x023c, B:52:0x0240, B:54:0x0244, B:56:0x024a, B:58:0x0250, B:60:0x0256, B:62:0x0260, B:64:0x0266, B:66:0x026c), top: B:112:0x018a }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02bf  */
    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r5) {
        /*
            Method dump skipped, instruction units count: 943
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.AadhaarAddressTO.onCreate(android.os.Bundle):void");
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        VUtility.INSTANCE.y(this, t1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
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

    public final v1 s1() {
        v1 v1Var = this.binding;
        if (v1Var != null) {
            return v1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final wa3 t1() {
        wa3 wa3Var = this.languageSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageSession");
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

    public final NrvDetails w1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final VahanProService x1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final int y1(String State_code, VahanStateModle list) {
        Intrinsics.checkNotNullParameter(State_code, "State_code");
        Intrinsics.checkNotNullParameter(list, "list");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            VahanStateModleSubList vahanStateModleSubList = (VahanStateModleSubList) it.next();
            if (StringsKt__StringsKt.trim((CharSequence) vahanStateModleSubList.get(0).toString()).toString().equals(State_code)) {
                return list.indexOf((Object) vahanStateModleSubList);
            }
        }
        return 0;
    }

    public final int z1(String State_code, VahanStateModle list) {
        Intrinsics.checkNotNullParameter(State_code, "State_code");
        Intrinsics.checkNotNullParameter(list, "list");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            VahanStateModleSubList vahanStateModleSubList = (VahanStateModleSubList) it.next();
            if (StringsKt__StringsKt.trim((CharSequence) vahanStateModleSubList.get(1).toString()).toString().equals(State_code)) {
                return list.indexOf((Object) vahanStateModleSubList);
            }
        }
        return 0;
    }
}
