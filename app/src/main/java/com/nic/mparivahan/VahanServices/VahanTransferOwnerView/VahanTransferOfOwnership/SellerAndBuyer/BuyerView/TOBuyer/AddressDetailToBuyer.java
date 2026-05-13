package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModle;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.AddressDetailToBuyer;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.n07;
import com.zepto.pb6;
import com.zepto.pq;
import com.zepto.vh7;
import com.zepto.w1;
import com.zepto.wa3;
import com.zepto.yh7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b{\u0010|J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0016\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R*\u00109\u001a\n 2*\u0004\u0018\u000101018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010@\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010D\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010;\u001a\u0004\bB\u0010=\"\u0004\bC\u0010?R\"\u0010H\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010;\u001a\u0004\bF\u0010=\"\u0004\bG\u0010?R\"\u0010L\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010;\u001a\u0004\bJ\u0010=\"\u0004\bK\u0010?R\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010X\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010;\u001a\u0004\bV\u0010=\"\u0004\bW\u0010?R\"\u0010\\\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010;\u001a\u0004\bZ\u0010=\"\u0004\b[\u0010?R\"\u0010_\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010j\u001a\u00020c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR*\u0010r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010k8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR$\u0010z\u001a\u0004\u0018\u00010s8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010y¨\u0006}"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/BuyerView/TOBuyer/AddressDetailToBuyer;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "", "State_code", "Lcom/nic/mparivahan/VahanServices/VahanModel/VahanStateModle;", "list", "B1", "Lcom/zepto/w1;", "C", "Lcom/zepto/w1;", "v1", "()Lcom/zepto/w1;", "R1", "(Lcom/zepto/w1;)V", "binding", "Lcom/zepto/ld7;", "D", "Lcom/zepto/ld7;", "D1", "()Lcom/zepto/ld7;", "a2", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "E", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "A1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "Y1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "y1", "()Landroid/app/ProgressDialog;", "V1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "G", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "H", "Ljava/lang/String;", "x1", "()Ljava/lang/String;", "U1", "(Ljava/lang/String;)V", "off_code", "I", "C1", "Z1", "stateCd", "J", "getCurrentDistrictGet", "S1", "currentDistrictGet", "K", "getPermanentDistrictGet", "W1", "permanentDistrictGet", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "L", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "z1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "X1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "M", "u1", "Q1", "aadhar_name", "N", "t1", "P1", "aadhar_address", "O", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "Lcom/zepto/wa3;", "P", "Lcom/zepto/wa3;", "w1", "()Lcom/zepto/wa3;", "T1", "(Lcom/zepto/wa3;)V", "languageSession", "Ljava/util/ArrayList;", "Q", "Ljava/util/ArrayList;", "getMultiServiceList", "()Ljava/util/ArrayList;", "setMultiServiceList", "(Ljava/util/ArrayList;)V", "multiServiceList", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "R", "Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "getMultiServiceobj", "()Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;", "setMultiServiceobj", "(Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/SellerModel/MultiServiceDraftTO;)V", "multiServiceobj", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class AddressDetailToBuyer extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public w1 binding;

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
    public String permanentDistrictGet;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public NrvDetails rcdetails;

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
            AddressDetailToBuyer.this.S1(String.valueOf(adapterView != null ? adapterView.getItemAtPosition(i) : null));
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
            AddressDetailToBuyer.this.W1(String.valueOf(adapterView != null ? adapterView.getItemAtPosition(i) : null));
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
            if (AddressDetailToBuyer.this.v1().e.getSelectedItemPosition() != 0) {
                AddressDetailToBuyer.this.y1().show();
                Object selectedItem = AddressDetailToBuyer.this.v1().e.getSelectedItem();
                Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                AddressDetailToBuyer.this.D1().r1(AddressDetailToBuyer.this, ((VahanStateModleSubList) selectedItem).get(0).toString());
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class d implements AdapterView.OnItemSelectedListener {
        public d() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            if (AddressDetailToBuyer.this.v1().v.getSelectedItemPosition() != 0) {
                AddressDetailToBuyer.this.y1().show();
                Object selectedItem = AddressDetailToBuyer.this.v1().v.getSelectedItem();
                Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                AddressDetailToBuyer.this.D1().s1(AddressDetailToBuyer.this, ((VahanStateModleSubList) selectedItem).get(0).toString());
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final void E1(AddressDetailToBuyer this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.z1().getRc_regn_no());
        intent.putExtra("RcDetails", this$0.z1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.u1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.t1());
        this$0.startActivity(intent);
    }

    public static final void F1(AddressDetailToBuyer this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void G1(AddressDetailToBuyer this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.y1().dismiss();
    }

    public static final void H1(AddressDetailToBuyer this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.v1().h.getText().length() < 2) {
            Toast.makeText(this$0, this$0.w1().b("please_enter_house_no_street_name", this$0.getString(R.string.please_enter_house_no_street_name)), 0).show();
            return;
        }
        if (this$0.v1().f.getText().length() < 2) {
            Toast.makeText(this$0, this$0.w1().b("please_enter_current_village_town_city", this$0.getString(R.string.please_enter_current_village_town_city)), 0).show();
            return;
        }
        if (this$0.v1().c.getText().length() < 2) {
            Toast.makeText(this$0, this$0.w1().b("please_enter_current_landmark_police_station", this$0.getString(R.string.please_enter_current_landmark_police_station)), 0).show();
            return;
        }
        if (this$0.v1().d.getText().length() < 2) {
            Toast.makeText(this$0, this$0.w1().b("please_enter_current_pin_code", this$0.getString(R.string.please_enter_current_pin_code)), 0).show();
            return;
        }
        if (this$0.v1().e.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.w1().b("select_state", this$0.getString(R.string.please_select_current_state)), 0).show();
            return;
        }
        if (this$0.v1().b.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.w1().b("select_district", this$0.getString(R.string.please_select_current_district)), 0).show();
            return;
        }
        if (this$0.v1().o.getText().length() < 2) {
            Toast.makeText(this$0, this$0.w1().b("please_enter_house_no_street_name", this$0.getString(R.string.please_enter_house_no_street_name)), 0).show();
            return;
        }
        if (this$0.v1().w.getText().length() < 2) {
            Toast.makeText(this$0, this$0.w1().b("please_enter_permanent_village_town_city", this$0.getString(R.string.please_enter_permanent_village_town_city)), 0).show();
            return;
        }
        if (this$0.v1().q.getText().length() < 2) {
            Toast.makeText(this$0, this$0.w1().b("please_enter_permanent_landmark_police_station", this$0.getString(R.string.please_enter_permanent_landmark_police_station)), 0).show();
            return;
        }
        if (this$0.v1().n.getText().length() < 2) {
            Toast.makeText(this$0, this$0.w1().b("please_enter_permanent_pin_code", this$0.getString(R.string.please_enter_permanent_pin_code)), 0).show();
            return;
        }
        if (this$0.v1().v.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.w1().b("select_pstate", this$0.getString(R.string.select_pstate)), 0).show();
            return;
        }
        if (this$0.v1().m.getSelectedItemPosition() == 0) {
            Toast.makeText(this$0, this$0.w1().b("select_pdistrict", this$0.getString(R.string.select_pdistrict)), 0).show();
            return;
        }
        Object selectedItem = this$0.v1().b.getSelectedItem();
        Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem");
        Object selectedItem2 = this$0.v1().m.getSelectedItem();
        Intrinsics.checkNotNull(selectedItem2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem");
        Object selectedItem3 = this$0.v1().e.getSelectedItem();
        Intrinsics.checkNotNull(selectedItem3, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
        Object selectedItem4 = this$0.v1().v.getSelectedItem();
        Intrinsics.checkNotNull(selectedItem4, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
        new pb6(this$0).e(this$0.v1(), ((VahanStateModleSubList) selectedItem3).get(0).toString(), ((VahanStateModleSubList) selectedItem4).get(0).toString(), String.valueOf(((DistictModleItem) selectedItem).getDist_cd()), String.valueOf(((DistictModleItem) selectedItem2).getDist_cd()));
        Intent intent = new Intent(this$0, (Class<?>) NomineeAndInsuranceDetailTOBuyer.class);
        intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, this$0.multiServiceList);
        intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, this$0.multiServiceobj);
        intent.putExtra("off_code", this$0.x1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra("RcDetails", this$0.z1());
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.u1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.t1());
        this$0.startActivity(intent);
    }

    public static final void I1(AddressDetailToBuyer this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void J1(AddressDetailToBuyer this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            String string = this$0.v1().h.getText().toString();
            String string2 = this$0.v1().c.getText().toString();
            String string3 = this$0.v1().f.getText().toString();
            String string4 = this$0.v1().d.getText().toString();
            if (string != null && string.length() != 0) {
                this$0.v1().o.setText(string);
            }
            if (string2 != null && string2.length() != 0) {
                this$0.v1().q.setText(string2);
            }
            if (string3 != null && string3.length() != 0) {
                this$0.v1().w.setText(string3);
            }
            if (string4 != null && string4.length() != 0) {
                this$0.v1().n.setText(string4);
            }
            if (this$0.v1().b.getSelectedItemPosition() > 0) {
                this$0.v1().m.setSelection(this$0.v1().b.getSelectedItemPosition());
            }
        }
    }

    public static final void K1(AddressDetailToBuyer this$0, VahanStateModle vahanStateModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.y1().dismiss();
        try {
            VahanStateModleSubList vahanStateModleSubList = new VahanStateModleSubList();
            vahanStateModleSubList.clear();
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            Intrinsics.checkNotNull(vahanStateModle);
            vahanStateModle.add(0, vahanStateModleSubList);
            this$0.v1().e.setAdapter((SpinnerAdapter) new yh7(this$0, vahanStateModle));
            try {
                int iB1 = this$0.B1(this$0.C1(), vahanStateModle);
                this$0.v1().e.setSelection(iB1);
                this$0.v1().e.setEnabled(false);
                this$0.v1().v.setAdapter((SpinnerAdapter) new yh7(this$0, vahanStateModle));
                this$0.v1().v.setSelection(iB1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void L1(AddressDetailToBuyer this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.y1().dismiss();
    }

    public static final void M1(AddressDetailToBuyer this$0, DistictModle distictModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.y1().dismiss();
        try {
            DistictModleItem distictModleItem = new DistictModleItem("Select District", 0, "Select District");
            Intrinsics.checkNotNull(distictModle);
            distictModle.add(0, distictModleItem);
            this$0.v1().b.setAdapter((SpinnerAdapter) new n07(this$0, distictModle));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void N1(AddressDetailToBuyer this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.y1().dismiss();
    }

    public static final void O1(AddressDetailToBuyer this$0, DistictModle distictModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.y1().dismiss();
        try {
            DistictModleItem distictModleItem = new DistictModleItem("Select District", 0, "Select District");
            Intrinsics.checkNotNull(distictModle);
            distictModle.add(0, distictModleItem);
            this$0.v1().m.setAdapter((SpinnerAdapter) new n07(this$0, distictModle));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final VahanProService A1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final int B1(String State_code, VahanStateModle list) {
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

    public final String C1() {
        String str = this.stateCd;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stateCd");
        return null;
    }

    public final ld7 D1() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void P1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void Q1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void R1(w1 w1Var) {
        Intrinsics.checkNotNullParameter(w1Var, "<set-?>");
        this.binding = w1Var;
    }

    public final void S1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currentDistrictGet = str;
    }

    public final void T1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }

    public final void U1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void V1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void W1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.permanentDistrictGet = str;
    }

    public final void X1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void Y1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void Z1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCd = str;
    }

    public final void a2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        w1 w1VarC = w1.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(w1VarC, "inflate(...)");
        R1(w1VarC);
        setContentView(v1().b());
        T1(new wa3(this));
        if (new vh7(this).b()) {
            v1().B.e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.INSTANCE;
        boolean z = this.isFaceless;
        LinearLayout appMent = v1().B.b;
        Intrinsics.checkNotNullExpressionValue(appMent, "appMent");
        companion.M(z, appMent);
        Y1(VahanProService.INSTANCE.a(this));
        V1(new ProgressDialog(this));
        y1().setMessage(w1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        y1().setCancelable(false);
        y1().setCanceledOnTouchOutside(false);
        Z1(String.valueOf(getIntent().getStringExtra("stateCd")));
        U1(String.valueOf(getIntent().getStringExtra("off_code")));
        Q1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        P1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        X1((NrvDetails) serializableExtra);
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO");
        this.multiServiceobj = (MultiServiceDraftTO) serializableExtra2;
        this.multiServiceList = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        v1().E.i.setText(String.valueOf(w1().b("toBuyerHeader", "Transfer of Ownership \n(Buyer)")));
        v1().E.e.setVisibility(0);
        v1().E.e.setText(z1().getRc_regn_no());
        SpannableString spannableString = new SpannableString(z1().getRc_regn_no());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        v1().E.e.setText(spannableString);
        v1().E.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddressDetailToBuyer.E1(this.a, view);
            }
        });
        a2((ld7) new z(this, new kd7(new jd7(A1()))).a(ld7.class));
        v1().E.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.al
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddressDetailToBuyer.F1(this.a, view);
            }
        });
        v1().l.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddressDetailToBuyer.H1(this.a, view);
            }
        });
        v1().A.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddressDetailToBuyer.I1(this.a, view);
            }
        });
        try {
            y1().show();
            D1().a1(this);
        } catch (Exception unused) {
        }
        v1().C.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.dl
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                AddressDetailToBuyer.J1(this.a, compoundButton, z2);
            }
        });
        Spinner spinner = v1().e;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(new c());
        }
        Spinner spinner2 = v1().v;
        if (spinner2 != null) {
            spinner2.setOnItemSelectedListener(new d());
        }
        D1().Z0().g(this, new mf4() { // from class: com.zepto.el
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                AddressDetailToBuyer.K1(this.a, (VahanStateModle) obj);
            }
        });
        D1().b1().g(this, new mf4() { // from class: com.zepto.fl
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                AddressDetailToBuyer.L1(this.a, (String) obj);
            }
        });
        D1().H().g(this, new mf4() { // from class: com.zepto.gl
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                AddressDetailToBuyer.M1(this.a, (DistictModle) obj);
            }
        });
        D1().I().g(this, new mf4() { // from class: com.zepto.hl
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                AddressDetailToBuyer.N1(this.a, (String) obj);
            }
        });
        D1().J().g(this, new mf4() { // from class: com.zepto.yk
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                AddressDetailToBuyer.O1(this.a, (DistictModle) obj);
            }
        });
        D1().K().g(this, new mf4() { // from class: com.zepto.zk
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                AddressDetailToBuyer.G1(this.a, (String) obj);
            }
        });
        v1().b.setOnItemSelectedListener(new a());
        v1().m.setOnItemSelectedListener(new b());
    }

    @Override // com.zepto.pq, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || keyCode != 4) {
            return super.onKeyDown(keyCode, event);
        }
        VUtility.INSTANCE.y(this, w1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    public final String t1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String u1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final w1 v1() {
        w1 w1Var = this.binding;
        if (w1Var != null) {
            return w1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final wa3 w1() {
        wa3 wa3Var = this.languageSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageSession");
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

    public final NrvDetails z1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }
}
