package com.nic.mparivahan.VahanServices.VahanView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.gd1;
import com.zepto.ih2;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.wa3;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bN\u0010OJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003J\b\u0010\t\u001a\u00020\u0002H\u0002J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0015J\u0006\u0010\r\u001a\u00020\u0002R\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010>\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010\u000f\u001a\u0004\b<\u0010\u0011\"\u0004\b=\u0010\u0013R\"\u0010B\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010I\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010\u000f\u001a\u0004\bG\u0010\u0011\"\u0004\bH\u0010\u0013R\"\u0010M\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010\u000f\u001a\u0004\bK\u0010\u0011\"\u0004\bL\u0010\u0013¨\u0006P"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanView/VahanVehicleDetailsService;", "Lcom/zepto/pq;", "", "I1", "", "rcNumber", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "rcdetails", "s1", "E1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Q1", "C", "Ljava/lang/String;", "x1", "()Ljava/lang/String;", "R1", "(Ljava/lang/String;)V", "rc_number", "D", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "y1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "S1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "Lcom/zepto/ih2;", "E", "Lcom/zepto/ih2;", "v1", "()Lcom/zepto/ih2;", "H1", "(Lcom/zepto/ih2;)V", "binding", "Lcom/zepto/ld7;", "F", "Lcom/zepto/ld7;", "getViewModel", "()Lcom/zepto/ld7;", "U1", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "G", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "z1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "T1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Landroid/app/ProgressDialog;", "H", "Landroid/app/ProgressDialog;", "w1", "()Landroid/app/ProgressDialog;", "P1", "(Landroid/app/ProgressDialog;)V", "pDialog", "I", "getOff_code", "setOff_code", "off_code", "", "J", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "K", "u1", "G1", "aadhar_name", "L", "t1", "F1", "aadhar_address", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanVehicleDetailsService extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ih2 binding;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ld7 viewModel;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String off_code = "0";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String aadhar_address;

    public static final void A1(VahanVehicleDetailsService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void B1(VahanVehicleDetailsService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void C1(VahanVehicleDetailsService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void D1(VahanVehicleDetailsService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.E1();
    }

    private final void E1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    private final void I1() {
        v1().a0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ek7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanVehicleDetailsService.J1(this.a, view);
            }
        });
        v1().G0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanVehicleDetailsService.K1(this.a, view);
            }
        });
        v1().f0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanVehicleDetailsService.L1(this.a, view);
            }
        });
        v1().q0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanVehicleDetailsService.M1(this.a, view);
            }
        });
        v1().B.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ik7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanVehicleDetailsService.N1(this.a, view);
            }
        });
        v1().n.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanVehicleDetailsService.O1(this.a, view);
            }
        });
    }

    public static final void J1(VahanVehicleDetailsService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.v1().I.getVisibility() == 0) {
            this$0.v1().I.setVisibility(8);
            this$0.v1().k.setImageResource(R.drawable.ic_arrow_down);
        } else {
            this$0.v1().I.setVisibility(0);
            this$0.v1().k.setImageResource(R.drawable.ic_arrow_up);
        }
        this$0.v1().L.setVisibility(8);
        this$0.v1().j.setImageResource(R.drawable.ic_arrow_down);
        this$0.v1().J.setVisibility(8);
        this$0.v1().h.setImageResource(R.drawable.ic_arrow_down);
        this$0.v1().K.setVisibility(8);
        this$0.v1().i.setImageResource(R.drawable.ic_arrow_down);
        this$0.v1().H.setVisibility(8);
        this$0.v1().g.setImageResource(R.drawable.ic_arrow_down);
        this$0.v1().G.setVisibility(8);
        this$0.v1().f.setImageResource(R.drawable.ic_arrow_down);
    }

    public static final void K1(VahanVehicleDetailsService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.v1().L.getVisibility() == 0) {
            this$0.v1().L.setVisibility(8);
            this$0.v1().j.setImageResource(R.drawable.ic_arrow_down);
        } else {
            this$0.v1().L.setVisibility(0);
            this$0.v1().j.setImageResource(R.drawable.ic_arrow_up);
        }
        this$0.v1().I.setVisibility(8);
        this$0.v1().k.setImageResource(R.drawable.ic_arrow_down);
        this$0.v1().J.setVisibility(8);
        this$0.v1().h.setImageResource(R.drawable.ic_arrow_down);
        this$0.v1().K.setVisibility(8);
        this$0.v1().i.setImageResource(R.drawable.ic_arrow_down);
        this$0.v1().H.setVisibility(8);
        this$0.v1().g.setImageResource(R.drawable.ic_arrow_down);
        this$0.v1().G.setVisibility(8);
        this$0.v1().f.setImageResource(R.drawable.ic_arrow_down);
    }

    public static final void L1(VahanVehicleDetailsService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.v1().J.getVisibility() == 0) {
            this$0.v1().J.setVisibility(8);
            this$0.v1().h.setImageResource(R.drawable.ic_arrow_down);
        } else {
            this$0.v1().J.setVisibility(0);
            this$0.v1().h.setImageResource(R.drawable.ic_arrow_up);
        }
        this$0.v1().I.setVisibility(8);
        this$0.v1().k.setImageResource(R.drawable.ic_arrow_down);
        this$0.v1().L.setVisibility(8);
        this$0.v1().j.setImageResource(R.drawable.ic_arrow_down);
        this$0.v1().K.setVisibility(8);
        this$0.v1().i.setImageResource(R.drawable.ic_arrow_down);
        this$0.v1().H.setVisibility(8);
        this$0.v1().g.setImageResource(R.drawable.ic_arrow_down);
        this$0.v1().G.setVisibility(8);
        this$0.v1().f.setImageResource(R.drawable.ic_arrow_down);
    }

    public static final void M1(VahanVehicleDetailsService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.v1().K.getVisibility() == 0) {
            this$0.v1().K.setVisibility(8);
            this$0.v1().i.setImageResource(R.drawable.ic_arrow_down);
        } else {
            this$0.v1().K.setVisibility(0);
            this$0.v1().i.setImageResource(R.drawable.ic_arrow_up);
        }
        this$0.v1().I.setVisibility(8);
        this$0.v1().k.setImageResource(R.drawable.ic_arrow_down);
        this$0.v1().L.setVisibility(8);
        this$0.v1().j.setImageResource(R.drawable.ic_arrow_down);
        this$0.v1().J.setVisibility(8);
        this$0.v1().h.setImageResource(R.drawable.ic_arrow_down);
        this$0.v1().H.setVisibility(8);
        this$0.v1().g.setImageResource(R.drawable.ic_arrow_down);
        this$0.v1().G.setVisibility(8);
        this$0.v1().f.setImageResource(R.drawable.ic_arrow_down);
    }

    public static final void N1(VahanVehicleDetailsService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.v1().H.getVisibility() == 0) {
            this$0.v1().H.setVisibility(8);
            this$0.v1().g.setImageResource(R.drawable.ic_arrow_down);
        } else {
            this$0.v1().H.setVisibility(0);
            this$0.v1().g.setImageResource(R.drawable.ic_arrow_up);
        }
        this$0.v1().I.setVisibility(8);
        this$0.v1().k.setImageResource(R.drawable.ic_arrow_down);
        this$0.v1().L.setVisibility(8);
        this$0.v1().j.setImageResource(R.drawable.ic_arrow_down);
        this$0.v1().J.setVisibility(8);
        this$0.v1().h.setImageResource(R.drawable.ic_arrow_down);
        this$0.v1().K.setVisibility(8);
        this$0.v1().i.setImageResource(R.drawable.ic_arrow_down);
        this$0.v1().G.setVisibility(8);
        this$0.v1().f.setImageResource(R.drawable.ic_arrow_down);
    }

    public static final void O1(VahanVehicleDetailsService this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.v1().G.getVisibility() == 0) {
            this$0.v1().G.setVisibility(8);
            this$0.v1().f.setImageResource(R.drawable.ic_arrow_down);
        } else {
            this$0.v1().G.setVisibility(0);
            this$0.v1().f.setImageResource(R.drawable.ic_arrow_up);
        }
        this$0.v1().I.setVisibility(8);
        this$0.v1().k.setImageResource(R.drawable.ic_arrow_down);
        this$0.v1().L.setVisibility(8);
        this$0.v1().j.setImageResource(R.drawable.ic_arrow_down);
        this$0.v1().J.setVisibility(8);
        this$0.v1().h.setImageResource(R.drawable.ic_arrow_down);
        this$0.v1().K.setVisibility(8);
        this$0.v1().i.setImageResource(R.drawable.ic_arrow_down);
        this$0.v1().H.setVisibility(8);
        this$0.v1().g.setImageResource(R.drawable.ic_arrow_down);
    }

    private final void s1(String rcNumber, NrvDetails rcdetails) {
        Log.e("nrvDetails", rcdetails.toString());
        String rc_owner_name = rcdetails.getRc_owner_name();
        if (rc_owner_name == null || rc_owner_name.length() == 0) {
            v1().d0.setText("NA");
        } else {
            AppCompatTextView appCompatTextView = v1().d0;
            String rc_owner_name2 = rcdetails.getRc_owner_name();
            if (rc_owner_name2 == null) {
                rc_owner_name2 = null;
            }
            appCompatTextView.setText(rc_owner_name2);
        }
        String rc_f_name = rcdetails.getRc_f_name();
        if (rc_f_name == null || rc_f_name.length() == 0) {
            v1().C0.setText("NA");
        } else {
            AppCompatTextView appCompatTextView2 = v1().C0;
            String rc_f_name2 = rcdetails.getRc_f_name();
            if (rc_f_name2 == null) {
                rc_f_name2 = null;
            }
            appCompatTextView2.setText(rc_f_name2);
        }
        String rc_regn_no = rcdetails.getRc_regn_no();
        if (rc_regn_no == null || rc_regn_no.length() == 0) {
            v1().H0.setText("NA");
        } else {
            AppCompatTextView appCompatTextView3 = v1().H0;
            String rc_vh_class_desc = rcdetails.getRc_vh_class_desc();
            if (rc_vh_class_desc == null) {
                rc_vh_class_desc = null;
            }
            appCompatTextView3.setText(rc_vh_class_desc);
        }
        String rc_vch_catg_desc = rcdetails.getRc_vch_catg_desc();
        if (rc_vch_catg_desc == null || rc_vch_catg_desc.length() == 0) {
            v1().D0.setText("NA");
        } else {
            v1().D0.setText(rcdetails.getRc_vch_catg_desc().toString());
        }
        String rc_maker_desc = rcdetails.getRc_maker_desc();
        if (rc_maker_desc == null || rc_maker_desc.length() == 0) {
            v1().M.setText("NA");
        } else {
            v1().M.setText(rcdetails.getRc_maker_desc().toString());
        }
        String rc_maker_model = rcdetails.getRc_maker_model();
        if (rc_maker_model == null || rc_maker_model.length() == 0) {
            v1().O.setText("NA");
        } else {
            v1().O.setText(rcdetails.getRc_maker_model().toString());
        }
        String rc_regn_dt = rcdetails.getRc_regn_dt();
        if (rc_regn_dt == null || rc_regn_dt.length() == 0) {
            v1().v0.setText("NA");
        } else {
            v1().v0.setText(rcdetails.getRc_regn_dt().toString());
        }
        String rc_fuel_desc = rcdetails.getRc_fuel_desc();
        if (rc_fuel_desc == null || rc_fuel_desc.length() == 0) {
            v1().s.setText("NA");
        } else {
            v1().s.setText(rcdetails.getRc_fuel_desc().toString());
        }
        String rc_norms_desc = rcdetails.getRc_norms_desc();
        if (rc_norms_desc == null || rc_norms_desc.length() == 0) {
            v1().Y.setText("NA");
        } else {
            v1().Y.setText(rcdetails.getRc_norms_desc().toString());
        }
        gd1.a aVar = gd1.a;
        if (aVar.m(String.valueOf(rcdetails.getRc_tax_upto()))) {
            v1().K0.setText("NA");
        } else {
            v1().K0.setText(String.valueOf(rcdetails.getRc_tax_upto()));
        }
        if (aVar.m(String.valueOf(rcdetails.getRc_permit_no()))) {
            v1().j0.setText("NA");
        } else {
            v1().j0.setText(String.valueOf(rcdetails.getRc_permit_no()));
        }
        if (aVar.m(String.valueOf(rcdetails.getRc_permit_issue_dt()))) {
            v1().h0.setText("NA");
        } else {
            v1().h0.setText(String.valueOf(rcdetails.getRc_permit_issue_dt()));
        }
        if (aVar.m(String.valueOf(rcdetails.getRc_permit_type()))) {
            v1().l0.setText("NA");
        } else {
            v1().l0.setText(String.valueOf(rcdetails.getRc_permit_type()));
        }
        if (aVar.m(String.valueOf(rcdetails.getRc_permit_valid_from()))) {
            v1().o0.setText("NA");
        } else {
            v1().o0.setText(String.valueOf(rcdetails.getRc_permit_valid_from()));
        }
        if (aVar.m(String.valueOf(rcdetails.getRc_permit_valid_upto()))) {
            v1().m0.setText("NA");
        } else {
            v1().m0.setText(String.valueOf(rcdetails.getRc_permit_valid_upto()));
        }
        if (aVar.m(String.valueOf(rcdetails.getRc_np_no()))) {
            v1().T.setText("NA");
        } else {
            v1().T.setText(String.valueOf(rcdetails.getRc_np_no()));
        }
        String rc_np_issued_by = rcdetails.getRc_np_issued_by();
        if (rc_np_issued_by == null || rc_np_issued_by.length() == 0) {
            v1().R.setText("NA");
        } else {
            v1().R.setText(rcdetails.getRc_np_issued_by().toString());
        }
        String rc_np_upto = rcdetails.getRc_np_upto();
        if (rc_np_upto == null || rc_np_upto.length() == 0) {
            v1().U.setText("NA");
        } else {
            v1().U.setText(rcdetails.getRc_np_upto().toString());
        }
        if (aVar.m(String.valueOf(rcdetails.getRc_pucc_no()))) {
            v1().r0.setText("NA");
        } else {
            v1().r0.setText(String.valueOf(rcdetails.getRc_pucc_no()));
        }
        if (aVar.m(String.valueOf(rcdetails.getRc_pucc_upto()))) {
            v1().t0.setText("NA");
        } else {
            v1().t0.setText(String.valueOf(rcdetails.getRc_pucc_upto()));
        }
        if (aVar.m(rcdetails.getRc_insurance_policy_no())) {
            v1().D.setText("NA");
        } else {
            AppCompatTextView appCompatTextView4 = v1().D;
            String rc_insurance_policy_no = rcdetails.getRc_insurance_policy_no();
            if (rc_insurance_policy_no == null) {
                rc_insurance_policy_no = null;
            }
            appCompatTextView4.setText(rc_insurance_policy_no);
        }
        if (aVar.m(rcdetails.getRc_insurance_comp())) {
            v1().z.setText("NA");
        } else {
            AppCompatTextView appCompatTextView5 = v1().z;
            String rc_insurance_comp = rcdetails.getRc_insurance_comp();
            if (rc_insurance_comp == null) {
                rc_insurance_comp = null;
            }
            appCompatTextView5.setText(rc_insurance_comp);
        }
        if (aVar.m(rcdetails.getRc_insurance_upto())) {
            v1().F.setText("NA");
        } else {
            AppCompatTextView appCompatTextView6 = v1().F;
            String rc_insurance_upto = rcdetails.getRc_insurance_upto();
            if (rc_insurance_upto == null) {
                rc_insurance_upto = null;
            }
            appCompatTextView6.setText(rc_insurance_upto);
        }
        if (aVar.m(rcdetails.getRc_financer())) {
            v1().o.setText("NA");
        } else {
            AppCompatTextView appCompatTextView7 = v1().o;
            String rc_financer = rcdetails.getRc_financer();
            if (rc_financer == null) {
                rc_financer = null;
            }
            appCompatTextView7.setText(rc_financer);
        }
        if (aVar.m(rcdetails.getRc_fit_upto())) {
            v1().q.setText("NA");
            return;
        }
        AppCompatTextView appCompatTextView8 = v1().q;
        String rc_fit_upto = rcdetails.getRc_fit_upto();
        appCompatTextView8.setText(rc_fit_upto != null ? rc_fit_upto : null);
    }

    public final void F1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void G1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void H1(ih2 ih2Var) {
        Intrinsics.checkNotNullParameter(ih2Var, "<set-?>");
        this.binding = ih2Var;
    }

    public final void P1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void Q1() {
        String rc_permit_issue_dt;
        String rc_permit_type;
        String rc_permit_valid_from;
        String rc_permit_valid_upto;
        String rc_np_no;
        String rc_np_issued_by;
        String rc_np_upto;
        String rc_permit_no = y1().getRc_permit_no();
        if ((rc_permit_no == null || rc_permit_no.length() == 0) && (((rc_permit_issue_dt = y1().getRc_permit_issue_dt()) == null || rc_permit_issue_dt.length() == 0) && (((rc_permit_type = y1().getRc_permit_type()) == null || rc_permit_type.length() == 0) && (((rc_permit_valid_from = y1().getRc_permit_valid_from()) == null || rc_permit_valid_from.length() == 0) && (((rc_permit_valid_upto = y1().getRc_permit_valid_upto()) == null || rc_permit_valid_upto.length() == 0) && (((rc_np_no = y1().getRc_np_no()) == null || rc_np_no.length() == 0) && (((rc_np_issued_by = y1().getRc_np_issued_by()) == null || rc_np_issued_by.length() == 0) && ((rc_np_upto = y1().getRc_np_upto()) == null || rc_np_upto.length() == 0)))))))) {
            v1().e0.setVisibility(8);
            return;
        }
        String rc_permit_no2 = y1().getRc_permit_no();
        if (rc_permit_no2 == null || rc_permit_no2.length() == 0) {
            v1().j0.setText("NA");
        } else {
            v1().j0.setText(String.valueOf(y1().getRc_permit_no()));
        }
        String rc_permit_issue_dt2 = y1().getRc_permit_issue_dt();
        if (rc_permit_issue_dt2 == null || rc_permit_issue_dt2.length() == 0) {
            v1().h0.setText("NA");
        } else {
            v1().h0.setText(String.valueOf(y1().getRc_permit_issue_dt()));
        }
        String rc_permit_type2 = y1().getRc_permit_type();
        if (rc_permit_type2 == null || rc_permit_type2.length() == 0) {
            v1().l0.setText("NA");
        } else {
            v1().l0.setText(String.valueOf(y1().getRc_permit_type()));
        }
        String rc_permit_valid_from2 = y1().getRc_permit_valid_from();
        if (rc_permit_valid_from2 == null || rc_permit_valid_from2.length() == 0) {
            v1().o0.setText("NA");
        } else {
            v1().o0.setText(String.valueOf(y1().getRc_permit_valid_from()));
        }
        String rc_permit_valid_upto2 = y1().getRc_permit_valid_upto();
        if (rc_permit_valid_upto2 == null || rc_permit_valid_upto2.length() == 0) {
            v1().m0.setText("NA");
        } else {
            v1().m0.setText(String.valueOf(y1().getRc_permit_valid_upto()));
        }
        String rc_np_no2 = y1().getRc_np_no();
        if (rc_np_no2 == null || rc_np_no2.length() == 0) {
            v1().T.setText("NA");
        } else {
            v1().T.setText(String.valueOf(y1().getRc_np_no()));
        }
        String rc_np_issued_by2 = y1().getRc_np_issued_by();
        if (rc_np_issued_by2 == null || rc_np_issued_by2.length() == 0) {
            v1().R.setText("NA");
        } else {
            v1().R.setText(String.valueOf(y1().getRc_np_issued_by()));
        }
        String rc_np_upto2 = y1().getRc_np_upto();
        if (rc_np_upto2 == null || rc_np_upto2.length() == 0) {
            v1().U.setText("NA");
        } else {
            v1().U.setText(String.valueOf(y1().getRc_np_upto()));
        }
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

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_vehicle_details);
        ih2 ih2VarC = ih2.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ih2VarC, "inflate(...)");
        H1(ih2VarC);
        setContentView(v1().b());
        ta3.a.X2(this, v1());
        T1(VahanProService.INSTANCE.a(this));
        P1(new ProgressDialog(this));
        w1().setMessage("Please wait...");
        w1().setCancelable(false);
        w1().setCanceledOnTouchOutside(false);
        U1((ld7) new z(this, new kd7(new jd7(z1()))).a(ld7.class));
        R1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        S1((NrvDetails) serializableExtra);
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        G1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        F1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        wa3 wa3Var = new wa3(this);
        v1().J0.setText(wa3Var.b("vehicle_no", "Vehicle No.:") + ' ' + x1());
        v1().y0.i.setText(wa3Var.b("vehicle_details", "Vehicle Details"));
        v1().c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ak7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanVehicleDetailsService.A1(this.a, view);
            }
        });
        try {
            this.off_code = y1().getRc_off_cd();
            s1(x1(), y1());
            Q1();
            if (u1().equals("NA") && t1().equals("NA")) {
                v1().e.setVisibility(8);
            } else if (!u1().equals("NA") || t1().equals("NA")) {
                v1().B0.setText(u1());
                v1().z0.setText(t1());
            } else {
                v1().c0.setVisibility(8);
                v1().B0.setVisibility(8);
                v1().z0.setText(t1());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        I1();
        v1().X.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanVehicleDetailsService.B1(this.a, view);
            }
        });
        v1().y0.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ck7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanVehicleDetailsService.C1(this.a, view);
            }
        });
        v1().y0.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dk7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanVehicleDetailsService.D1(this.a, view);
            }
        });
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

    public final ih2 v1() {
        ih2 ih2Var = this.binding;
        if (ih2Var != null) {
            return ih2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
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
