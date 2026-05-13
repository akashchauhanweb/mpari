package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
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
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.AddressDetailTOO;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.f7;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.n07;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wm6;
import com.zepto.yh7;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bk\u0010lJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0016\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R*\u00109\u001a\n 2*\u0004\u0018\u000101018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010@\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010D\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010;\u001a\u0004\bB\u0010=\"\u0004\bC\u0010?R\"\u0010H\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010;\u001a\u0004\bF\u0010=\"\u0004\bG\u0010?R\"\u0010L\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010;\u001a\u0004\bJ\u0010=\"\u0004\bK\u0010?R\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010X\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010;\u001a\u0004\bV\u0010=\"\u0004\bW\u0010?R\"\u0010\\\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010;\u001a\u0004\bZ\u0010=\"\u0004\b[\u0010?R\"\u0010_\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010j\u001a\u00020c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010i¨\u0006m"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/AddressDetailTOO;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "", "State_code", "Lcom/nic/mparivahan/VahanServices/VahanModel/VahanStateModle;", "list", "B1", "Lcom/zepto/f7;", "C", "Lcom/zepto/f7;", "v1", "()Lcom/zepto/f7;", "Q1", "(Lcom/zepto/f7;)V", "binding", "Lcom/zepto/ld7;", "D", "Lcom/zepto/ld7;", "C1", "()Lcom/zepto/ld7;", "Z1", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "E", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "A1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "X1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "y1", "()Landroid/app/ProgressDialog;", "U1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "G", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "H", "Ljava/lang/String;", "x1", "()Ljava/lang/String;", "T1", "(Ljava/lang/String;)V", "off_code", "I", "getStateCd", "Y1", "stateCd", "J", "getCurrentDistrictGet", "R1", "currentDistrictGet", "K", "getPermanentDistrictGet", "V1", "permanentDistrictGet", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "L", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "z1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "W1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "M", "u1", "P1", "aadhar_name", "N", "t1", "O1", "aadhar_address", "O", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "Lcom/zepto/wa3;", "P", "Lcom/zepto/wa3;", "w1", "()Lcom/zepto/wa3;", "S1", "(Lcom/zepto/wa3;)V", "languageSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class AddressDetailTOO extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public f7 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ld7 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

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

    public static final class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            AddressDetailTOO.this.R1(String.valueOf(adapterView != null ? adapterView.getItemAtPosition(i) : null));
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
            AddressDetailTOO.this.V1(String.valueOf(adapterView != null ? adapterView.getItemAtPosition(i) : null));
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
            if (AddressDetailTOO.this.v1().e.getSelectedItemPosition() != 0) {
                AddressDetailTOO.this.y1().show();
                Object selectedItem = AddressDetailTOO.this.v1().e.getSelectedItem();
                Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                AddressDetailTOO.this.C1().r1(AddressDetailTOO.this, ((VahanStateModleSubList) selectedItem).get(0).toString());
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
            if (AddressDetailTOO.this.v1().v.getSelectedItemPosition() != 0) {
                AddressDetailTOO.this.y1().show();
                Object selectedItem = AddressDetailTOO.this.v1().v.getSelectedItem();
                Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                AddressDetailTOO.this.C1().s1(AddressDetailTOO.this, ((VahanStateModleSubList) selectedItem).get(0).toString());
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final void D1(AddressDetailTOO this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void E1(AddressDetailTOO this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.z1().getRc_regn_no());
        intent.putExtra("RcDetails", this$0.z1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.u1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.t1());
        this$0.startActivity(intent);
    }

    public static final void F1(AddressDetailTOO this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.y1().dismiss();
    }

    public static final void G1(AddressDetailTOO this$0, View view) {
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
        new wm6(this$0).q(this$0.v1(), ((VahanStateModleSubList) selectedItem3).get(0).toString(), ((VahanStateModleSubList) selectedItem4).get(0).toString(), String.valueOf(((DistictModleItem) selectedItem).getDist_cd()), String.valueOf(((DistictModleItem) selectedItem2).getDist_cd()));
        Intent intent = new Intent(this$0, (Class<?>) NomineeAndInsuranceDetail.class);
        intent.putExtra("off_code", this$0.x1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra("RcDetails", this$0.z1());
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.u1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.t1());
        this$0.startActivity(intent);
    }

    public static final void H1(AddressDetailTOO this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void I1(AddressDetailTOO this$0, CompoundButton compoundButton, boolean z) {
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

    public static final void J1(AddressDetailTOO this$0, VahanStateModle vahanStateModle) {
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
                int iB1 = this$0.B1(StringsKt__StringsKt.trim((CharSequence) String.valueOf(this$0.z1().getState_cd())).toString(), vahanStateModle);
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

    public static final void K1(AddressDetailTOO this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.y1().dismiss();
    }

    public static final void L1(AddressDetailTOO this$0, DistictModle distictModle) {
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

    public static final void M1(AddressDetailTOO this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.y1().dismiss();
    }

    public static final void N1(AddressDetailTOO this$0, DistictModle distictModle) {
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

    public final ld7 C1() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
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

    public final void Q1(f7 f7Var) {
        Intrinsics.checkNotNullParameter(f7Var, "<set-?>");
        this.binding = f7Var;
    }

    public final void R1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currentDistrictGet = str;
    }

    public final void S1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
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
        this.permanentDistrictGet = str;
    }

    public final void W1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void X1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void Y1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCd = str;
    }

    public final void Z1(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        f7 f7VarC = f7.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(f7VarC, "inflate(...)");
        Q1(f7VarC);
        setContentView(v1().b());
        ta3.a.n2(this, v1());
        S1(new wa3(this));
        X1(VahanProService.INSTANCE.a(this));
        U1(new ProgressDialog(this));
        y1().setMessage(w1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        y1().setCancelable(false);
        y1().setCanceledOnTouchOutside(false);
        Y1(String.valueOf(getIntent().getStringExtra("stateCd")));
        T1(String.valueOf(getIntent().getStringExtra("off_code")));
        P1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        O1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        W1((NrvDetails) serializableExtra);
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        Z1((ld7) new z(this, new kd7(new jd7(A1()))).a(ld7.class));
        v1().D.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddressDetailTOO.D1(this.a, view);
            }
        });
        v1().F.setPaintFlags(v1().F.getPaintFlags() | 8);
        v1().F.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddressDetailTOO.E1(this.a, view);
            }
        });
        v1().l.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddressDetailTOO.G1(this.a, view);
            }
        });
        v1().A.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddressDetailTOO.H1(this.a, view);
            }
        });
        try {
            y1().show();
            C1().a1(this);
        } catch (Exception unused) {
        }
        v1().B.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.sk
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                AddressDetailTOO.I1(this.a, compoundButton, z);
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
        C1().Z0().g(this, new mf4() { // from class: com.zepto.tk
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                AddressDetailTOO.J1(this.a, (VahanStateModle) obj);
            }
        });
        C1().b1().g(this, new mf4() { // from class: com.zepto.uk
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                AddressDetailTOO.K1(this.a, (String) obj);
            }
        });
        C1().H().g(this, new mf4() { // from class: com.zepto.vk
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                AddressDetailTOO.L1(this.a, (DistictModle) obj);
            }
        });
        C1().I().g(this, new mf4() { // from class: com.zepto.wk
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                AddressDetailTOO.M1(this.a, (String) obj);
            }
        });
        C1().J().g(this, new mf4() { // from class: com.zepto.nk
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                AddressDetailTOO.N1(this.a, (DistictModle) obj);
            }
        });
        C1().K().g(this, new mf4() { // from class: com.zepto.ok
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                AddressDetailTOO.F1(this.a, (String) obj);
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

    public final f7 v1() {
        f7 f7Var = this.binding;
        if (f7Var != null) {
            return f7Var;
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
