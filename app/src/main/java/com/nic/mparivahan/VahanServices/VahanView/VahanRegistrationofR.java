package com.nic.mparivahan.VahanServices.VahanView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.FeesDetailsScreen;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanView.VahanRegistrationofR;
import com.zepto.gd1;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.pq;
import com.zepto.r45;
import com.zepto.ta3;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bN\u0010OJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003J\b\u0010\t\u001a\u00020\u0002H\u0002J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0015J\u0006\u0010\r\u001a\u00020\u0002R\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010>\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010\u000f\u001a\u0004\b<\u0010\u0011\"\u0004\b=\u0010\u0013R\"\u0010B\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010I\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010\u000f\u001a\u0004\bG\u0010\u0011\"\u0004\bH\u0010\u0013R\"\u0010M\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010\u000f\u001a\u0004\bK\u0010\u0011\"\u0004\bL\u0010\u0013¨\u0006P"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanView/VahanRegistrationofR;", "Lcom/zepto/pq;", "", "G1", "", "rcNumber", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "rcdetails", "r1", "C1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "O1", "C", "Ljava/lang/String;", "w1", "()Ljava/lang/String;", "P1", "(Ljava/lang/String;)V", "rc_number", "D", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "x1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "Q1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "Lcom/zepto/r45;", "E", "Lcom/zepto/r45;", "u1", "()Lcom/zepto/r45;", "F1", "(Lcom/zepto/r45;)V", "binding", "Lcom/zepto/ld7;", "F", "Lcom/zepto/ld7;", "getViewModel", "()Lcom/zepto/ld7;", "S1", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "G", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "y1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "R1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Landroid/app/ProgressDialog;", "H", "Landroid/app/ProgressDialog;", "v1", "()Landroid/app/ProgressDialog;", "N1", "(Landroid/app/ProgressDialog;)V", "pDialog", "I", "getOff_code", "setOff_code", "off_code", "", "J", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "K", "t1", "E1", "aadhar_name", "L", "s1", "D1", "aadhar_address", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanRegistrationofR extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public r45 binding;

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

    public static final void A1(VahanRegistrationofR this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void B1(VahanRegistrationofR this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.C1();
    }

    private final void C1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    private final void G1() {
        u1().b0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vf7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanRegistrationofR.H1(this.a, view);
            }
        });
        u1().I0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wf7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanRegistrationofR.I1(this.a, view);
            }
        });
        u1().g0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xf7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanRegistrationofR.J1(this.a, view);
            }
        });
        u1().r0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yf7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanRegistrationofR.K1(this.a, view);
            }
        });
        u1().B.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zf7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanRegistrationofR.L1(this.a, view);
            }
        });
        u1().n.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ag7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanRegistrationofR.M1(this.a, view);
            }
        });
    }

    public static final void H1(VahanRegistrationofR this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.u1().I.getVisibility() == 0) {
            this$0.u1().I.setVisibility(8);
            this$0.u1().k.setImageResource(R.drawable.ic_arrow_down);
        } else {
            this$0.u1().I.setVisibility(0);
            this$0.u1().k.setImageResource(R.drawable.ic_arrow_up);
        }
        this$0.u1().L.setVisibility(8);
        this$0.u1().j.setImageResource(R.drawable.ic_arrow_down);
        this$0.u1().J.setVisibility(8);
        this$0.u1().h.setImageResource(R.drawable.ic_arrow_down);
        this$0.u1().K.setVisibility(8);
        this$0.u1().i.setImageResource(R.drawable.ic_arrow_down);
        this$0.u1().H.setVisibility(8);
        this$0.u1().g.setImageResource(R.drawable.ic_arrow_down);
        this$0.u1().G.setVisibility(8);
        this$0.u1().f.setImageResource(R.drawable.ic_arrow_down);
    }

    public static final void I1(VahanRegistrationofR this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.u1().L.getVisibility() == 0) {
            this$0.u1().L.setVisibility(8);
            this$0.u1().j.setImageResource(R.drawable.ic_arrow_down);
        } else {
            this$0.u1().L.setVisibility(0);
            this$0.u1().j.setImageResource(R.drawable.ic_arrow_up);
        }
        this$0.u1().I.setVisibility(8);
        this$0.u1().k.setImageResource(R.drawable.ic_arrow_down);
        this$0.u1().J.setVisibility(8);
        this$0.u1().h.setImageResource(R.drawable.ic_arrow_down);
        this$0.u1().K.setVisibility(8);
        this$0.u1().i.setImageResource(R.drawable.ic_arrow_down);
        this$0.u1().H.setVisibility(8);
        this$0.u1().g.setImageResource(R.drawable.ic_arrow_down);
        this$0.u1().G.setVisibility(8);
        this$0.u1().f.setImageResource(R.drawable.ic_arrow_down);
    }

    public static final void J1(VahanRegistrationofR this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.u1().J.getVisibility() == 0) {
            this$0.u1().J.setVisibility(8);
            this$0.u1().h.setImageResource(R.drawable.ic_arrow_down);
        } else {
            this$0.u1().J.setVisibility(0);
            this$0.u1().h.setImageResource(R.drawable.ic_arrow_up);
        }
        this$0.u1().I.setVisibility(8);
        this$0.u1().k.setImageResource(R.drawable.ic_arrow_down);
        this$0.u1().L.setVisibility(8);
        this$0.u1().j.setImageResource(R.drawable.ic_arrow_down);
        this$0.u1().K.setVisibility(8);
        this$0.u1().i.setImageResource(R.drawable.ic_arrow_down);
        this$0.u1().H.setVisibility(8);
        this$0.u1().g.setImageResource(R.drawable.ic_arrow_down);
        this$0.u1().G.setVisibility(8);
        this$0.u1().f.setImageResource(R.drawable.ic_arrow_down);
    }

    public static final void K1(VahanRegistrationofR this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.u1().K.getVisibility() == 0) {
            this$0.u1().K.setVisibility(8);
            this$0.u1().i.setImageResource(R.drawable.ic_arrow_down);
        } else {
            this$0.u1().K.setVisibility(0);
            this$0.u1().i.setImageResource(R.drawable.ic_arrow_up);
        }
        this$0.u1().I.setVisibility(8);
        this$0.u1().k.setImageResource(R.drawable.ic_arrow_down);
        this$0.u1().L.setVisibility(8);
        this$0.u1().j.setImageResource(R.drawable.ic_arrow_down);
        this$0.u1().J.setVisibility(8);
        this$0.u1().h.setImageResource(R.drawable.ic_arrow_down);
        this$0.u1().H.setVisibility(8);
        this$0.u1().g.setImageResource(R.drawable.ic_arrow_down);
        this$0.u1().G.setVisibility(8);
        this$0.u1().f.setImageResource(R.drawable.ic_arrow_down);
    }

    public static final void L1(VahanRegistrationofR this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.u1().H.getVisibility() == 0) {
            this$0.u1().H.setVisibility(8);
            this$0.u1().g.setImageResource(R.drawable.ic_arrow_down);
        } else {
            this$0.u1().H.setVisibility(0);
            this$0.u1().g.setImageResource(R.drawable.ic_arrow_up);
        }
        this$0.u1().I.setVisibility(8);
        this$0.u1().k.setImageResource(R.drawable.ic_arrow_down);
        this$0.u1().L.setVisibility(8);
        this$0.u1().j.setImageResource(R.drawable.ic_arrow_down);
        this$0.u1().J.setVisibility(8);
        this$0.u1().h.setImageResource(R.drawable.ic_arrow_down);
        this$0.u1().K.setVisibility(8);
        this$0.u1().i.setImageResource(R.drawable.ic_arrow_down);
        this$0.u1().G.setVisibility(8);
        this$0.u1().f.setImageResource(R.drawable.ic_arrow_down);
    }

    public static final void M1(VahanRegistrationofR this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.u1().G.getVisibility() == 0) {
            this$0.u1().G.setVisibility(8);
            this$0.u1().f.setImageResource(R.drawable.ic_arrow_down);
        } else {
            this$0.u1().G.setVisibility(0);
            this$0.u1().f.setImageResource(R.drawable.ic_arrow_up);
        }
        this$0.u1().I.setVisibility(8);
        this$0.u1().k.setImageResource(R.drawable.ic_arrow_down);
        this$0.u1().L.setVisibility(8);
        this$0.u1().j.setImageResource(R.drawable.ic_arrow_down);
        this$0.u1().J.setVisibility(8);
        this$0.u1().h.setImageResource(R.drawable.ic_arrow_down);
        this$0.u1().K.setVisibility(8);
        this$0.u1().i.setImageResource(R.drawable.ic_arrow_down);
        this$0.u1().H.setVisibility(8);
        this$0.u1().g.setImageResource(R.drawable.ic_arrow_down);
    }

    private final void r1(String rcNumber, NrvDetails rcdetails) {
        String rc_owner_name = rcdetails.getRc_owner_name();
        if (rc_owner_name == null || rc_owner_name.length() == 0) {
            u1().e0.setText("NA");
        } else {
            AppCompatTextView appCompatTextView = u1().e0;
            String rc_owner_name2 = rcdetails.getRc_owner_name();
            if (rc_owner_name2 == null) {
                rc_owner_name2 = null;
            }
            appCompatTextView.setText(rc_owner_name2);
        }
        String rc_f_name = rcdetails.getRc_f_name();
        if (rc_f_name == null || rc_f_name.length() == 0) {
            u1().E0.setText("NA");
        } else {
            AppCompatTextView appCompatTextView2 = u1().E0;
            String rc_f_name2 = rcdetails.getRc_f_name();
            if (rc_f_name2 == null) {
                rc_f_name2 = null;
            }
            appCompatTextView2.setText(rc_f_name2);
        }
        String rc_regn_no = rcdetails.getRc_regn_no();
        if (rc_regn_no == null || rc_regn_no.length() == 0) {
            u1().J0.setText("NA");
        } else {
            AppCompatTextView appCompatTextView3 = u1().J0;
            String rc_vh_class_desc = rcdetails.getRc_vh_class_desc();
            if (rc_vh_class_desc == null) {
                rc_vh_class_desc = null;
            }
            appCompatTextView3.setText(rc_vh_class_desc);
        }
        String rc_vch_catg_desc = rcdetails.getRc_vch_catg_desc();
        if (rc_vch_catg_desc == null || rc_vch_catg_desc.length() == 0) {
            u1().F0.setText("NA");
        } else {
            u1().F0.setText(rcdetails.getRc_vch_catg_desc().toString());
        }
        String rc_maker_desc = rcdetails.getRc_maker_desc();
        if (rc_maker_desc == null || rc_maker_desc.length() == 0) {
            u1().M.setText("NA");
        } else {
            u1().M.setText(rcdetails.getRc_maker_desc().toString());
        }
        String rc_maker_model = rcdetails.getRc_maker_model();
        if (rc_maker_model == null || rc_maker_model.length() == 0) {
            u1().O.setText("NA");
        } else {
            u1().O.setText(rcdetails.getRc_maker_model().toString());
        }
        String rc_regn_dt = rcdetails.getRc_regn_dt();
        if (rc_regn_dt == null || rc_regn_dt.length() == 0) {
            u1().x0.setText("NA");
        } else {
            u1().x0.setText(rcdetails.getRc_regn_dt().toString());
        }
        String rc_fuel_desc = rcdetails.getRc_fuel_desc();
        if (rc_fuel_desc == null || rc_fuel_desc.length() == 0) {
            u1().s.setText("NA");
        } else {
            u1().s.setText(rcdetails.getRc_fuel_desc().toString());
        }
        String rc_norms_desc = rcdetails.getRc_norms_desc();
        if (rc_norms_desc == null || rc_norms_desc.length() == 0) {
            u1().Z.setText("NA");
        } else {
            u1().Z.setText(rcdetails.getRc_norms_desc().toString());
        }
        gd1.a aVar = gd1.a;
        if (aVar.m(String.valueOf(rcdetails.getRc_tax_upto()))) {
            u1().L0.setText("NA");
        } else {
            u1().L0.setText(String.valueOf(rcdetails.getRc_tax_upto()));
        }
        if (aVar.m(String.valueOf(rcdetails.getRc_permit_no()))) {
            u1().k0.setText("NA");
        } else {
            u1().k0.setText(String.valueOf(rcdetails.getRc_permit_no()));
        }
        if (aVar.m(String.valueOf(rcdetails.getRc_permit_issue_dt()))) {
            u1().i0.setText("NA");
        } else {
            u1().i0.setText(String.valueOf(rcdetails.getRc_permit_issue_dt()));
        }
        if (aVar.m(String.valueOf(rcdetails.getRc_permit_type()))) {
            u1().m0.setText("NA");
        } else {
            u1().m0.setText(String.valueOf(rcdetails.getRc_permit_type()));
        }
        if (aVar.m(String.valueOf(rcdetails.getRc_permit_valid_from()))) {
            u1().p0.setText("NA");
        } else {
            u1().p0.setText(String.valueOf(rcdetails.getRc_permit_valid_from()));
        }
        if (aVar.m(String.valueOf(rcdetails.getRc_permit_valid_upto()))) {
            u1().n0.setText("NA");
        } else {
            u1().n0.setText(String.valueOf(rcdetails.getRc_permit_valid_upto()));
        }
        if (aVar.m(String.valueOf(rcdetails.getRc_np_no()))) {
            u1().T.setText("NA");
        } else {
            u1().T.setText(String.valueOf(rcdetails.getRc_np_no()));
        }
        String rc_np_issued_by = rcdetails.getRc_np_issued_by();
        if (rc_np_issued_by == null || rc_np_issued_by.length() == 0) {
            u1().R.setText("NA");
        } else {
            u1().R.setText(rcdetails.getRc_np_issued_by().toString());
        }
        String rc_np_upto = rcdetails.getRc_np_upto();
        if (rc_np_upto == null || rc_np_upto.length() == 0) {
            u1().U.setText("NA");
        } else {
            u1().U.setText(rcdetails.getRc_np_upto().toString());
        }
        if (aVar.m(String.valueOf(rcdetails.getRc_pucc_no()))) {
            u1().t0.setText("NA");
        } else {
            u1().t0.setText(String.valueOf(rcdetails.getRc_pucc_no()));
        }
        if (aVar.m(String.valueOf(rcdetails.getRc_pucc_upto()))) {
            u1().v0.setText("NA");
        } else {
            u1().v0.setText(String.valueOf(rcdetails.getRc_pucc_upto()));
        }
        if (aVar.m(rcdetails.getRc_insurance_policy_no())) {
            u1().D.setText("NA");
        } else {
            AppCompatTextView appCompatTextView4 = u1().D;
            String rc_insurance_policy_no = rcdetails.getRc_insurance_policy_no();
            if (rc_insurance_policy_no == null) {
                rc_insurance_policy_no = null;
            }
            appCompatTextView4.setText(rc_insurance_policy_no);
        }
        if (aVar.m(rcdetails.getRc_insurance_comp())) {
            u1().z.setText("NA");
        } else {
            AppCompatTextView appCompatTextView5 = u1().z;
            String rc_insurance_comp = rcdetails.getRc_insurance_comp();
            if (rc_insurance_comp == null) {
                rc_insurance_comp = null;
            }
            appCompatTextView5.setText(rc_insurance_comp);
        }
        if (aVar.m(rcdetails.getRc_insurance_upto())) {
            u1().F.setText("NA");
        } else {
            AppCompatTextView appCompatTextView6 = u1().F;
            String rc_insurance_upto = rcdetails.getRc_insurance_upto();
            if (rc_insurance_upto == null) {
                rc_insurance_upto = null;
            }
            appCompatTextView6.setText(rc_insurance_upto);
        }
        if (aVar.m(rcdetails.getRc_financer())) {
            u1().o.setText("NA");
        } else {
            AppCompatTextView appCompatTextView7 = u1().o;
            String rc_financer = rcdetails.getRc_financer();
            if (rc_financer == null) {
                rc_financer = null;
            }
            appCompatTextView7.setText(rc_financer);
        }
        if (aVar.m(rcdetails.getRc_fit_upto())) {
            u1().q.setText("NA");
            return;
        }
        AppCompatTextView appCompatTextView8 = u1().q;
        String rc_fit_upto = rcdetails.getRc_fit_upto();
        appCompatTextView8.setText(rc_fit_upto != null ? rc_fit_upto : null);
    }

    public static final void z1(VahanRegistrationofR this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setIntent(new Intent(this$0, (Class<?>) FeesDetailsScreen.class));
        this$0.getIntent().putExtra(VContant.NEXGEN_INTENT_CODE, VContant.RETENTION_REGISTRATION_NUMBER_CODE);
        this$0.getIntent().putExtra(VContant.PURPOSE_CODE, VContant.RETENTION_REGISTRATION_PURPOSE_CODE);
        this$0.getIntent().putExtra("state_code", this$0.x1().getState_cd());
        Intent intent = this$0.getIntent();
        if (intent != null) {
            intent.putExtra("rc_number", this$0.w1());
        }
        Intent intent2 = this$0.getIntent();
        if (intent2 != null) {
            intent2.putExtra("RC", this$0.w1());
        }
        Intent intent3 = this$0.getIntent();
        if (intent3 != null) {
            intent3.putExtra("RcDetails", this$0.x1());
        }
        this$0.getIntent().putExtra(VContant.SERVICE_NAME, VContant.RETENTION_NAME);
        Intent intent4 = this$0.getIntent();
        if (intent4 != null) {
            intent4.putExtra("off_code", this$0.off_code);
        }
        Intent intent5 = this$0.getIntent();
        if (intent5 != null) {
            intent5.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        }
        Intent intent6 = this$0.getIntent();
        if (intent6 != null) {
            intent6.putExtra(VContant.NEXGEN_addahar_name, this$0.t1());
        }
        Intent intent7 = this$0.getIntent();
        if (intent7 != null) {
            intent7.putExtra(VContant.NEXGEN_addahar_address, this$0.s1());
        }
        this$0.startActivity(this$0.getIntent());
        this$0.finish();
    }

    public final void D1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void E1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void F1(r45 r45Var) {
        Intrinsics.checkNotNullParameter(r45Var, "<set-?>");
        this.binding = r45Var;
    }

    public final void N1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void O1() {
        String rc_permit_issue_dt;
        String rc_permit_type;
        String rc_permit_valid_from;
        String rc_permit_valid_upto;
        String rc_np_no;
        String rc_np_issued_by;
        String rc_np_upto;
        String rc_permit_no = x1().getRc_permit_no();
        if ((rc_permit_no == null || rc_permit_no.length() == 0) && (((rc_permit_issue_dt = x1().getRc_permit_issue_dt()) == null || rc_permit_issue_dt.length() == 0) && (((rc_permit_type = x1().getRc_permit_type()) == null || rc_permit_type.length() == 0) && (((rc_permit_valid_from = x1().getRc_permit_valid_from()) == null || rc_permit_valid_from.length() == 0) && (((rc_permit_valid_upto = x1().getRc_permit_valid_upto()) == null || rc_permit_valid_upto.length() == 0) && (((rc_np_no = x1().getRc_np_no()) == null || rc_np_no.length() == 0) && (((rc_np_issued_by = x1().getRc_np_issued_by()) == null || rc_np_issued_by.length() == 0) && ((rc_np_upto = x1().getRc_np_upto()) == null || rc_np_upto.length() == 0)))))))) {
            u1().f0.setVisibility(8);
            return;
        }
        String rc_permit_no2 = x1().getRc_permit_no();
        if (rc_permit_no2 == null || rc_permit_no2.length() == 0) {
            u1().k0.setText("NA");
        } else {
            u1().k0.setText(String.valueOf(x1().getRc_permit_no()));
        }
        String rc_permit_issue_dt2 = x1().getRc_permit_issue_dt();
        if (rc_permit_issue_dt2 == null || rc_permit_issue_dt2.length() == 0) {
            u1().i0.setText("NA");
        } else {
            u1().i0.setText(String.valueOf(x1().getRc_permit_issue_dt()));
        }
        String rc_permit_type2 = x1().getRc_permit_type();
        if (rc_permit_type2 == null || rc_permit_type2.length() == 0) {
            u1().m0.setText("NA");
        } else {
            u1().m0.setText(String.valueOf(x1().getRc_permit_type()));
        }
        String rc_permit_valid_from2 = x1().getRc_permit_valid_from();
        if (rc_permit_valid_from2 == null || rc_permit_valid_from2.length() == 0) {
            u1().p0.setText("NA");
        } else {
            u1().p0.setText(String.valueOf(x1().getRc_permit_valid_from()));
        }
        String rc_permit_valid_upto2 = x1().getRc_permit_valid_upto();
        if (rc_permit_valid_upto2 == null || rc_permit_valid_upto2.length() == 0) {
            u1().n0.setText("NA");
        } else {
            u1().n0.setText(String.valueOf(x1().getRc_permit_valid_upto()));
        }
        String rc_np_no2 = x1().getRc_np_no();
        if (rc_np_no2 == null || rc_np_no2.length() == 0) {
            u1().T.setText("NA");
        } else {
            u1().T.setText(String.valueOf(x1().getRc_np_no()));
        }
        String rc_np_issued_by2 = x1().getRc_np_issued_by();
        if (rc_np_issued_by2 == null || rc_np_issued_by2.length() == 0) {
            u1().R.setText("NA");
        } else {
            u1().R.setText(String.valueOf(x1().getRc_np_issued_by()));
        }
        String rc_np_upto2 = x1().getRc_np_upto();
        if (rc_np_upto2 == null || rc_np_upto2.length() == 0) {
            u1().U.setText("NA");
        } else {
            u1().U.setText(String.valueOf(x1().getRc_np_upto()));
        }
    }

    public final void P1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void Q1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void R1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void S1(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rc_partucalar_layout);
        r45 r45VarC = r45.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(r45VarC, "inflate(...)");
        F1(r45VarC);
        setContentView(u1().b());
        ta3.a aVar = ta3.a;
        aVar.B2(this, u1());
        R1(VahanProService.INSTANCE.a(this));
        N1(new ProgressDialog(this));
        v1().setMessage("Please wait...");
        v1().setCancelable(false);
        v1().setCanceledOnTouchOutside(false);
        S1((ld7) new z(this, new kd7(new jd7(y1()))).a(ld7.class));
        P1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        Q1((NrvDetails) serializableExtra);
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        E1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        D1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        u1().K0.setText("Vehicle Details");
        u1().A0.i.setText(aVar.P(this, VContant.RETENTION_NAME));
        if (x1() != null) {
            try {
                this.off_code = String.valueOf(x1().getRc_off_cd());
                r1(w1(), x1());
                O1();
                if (t1().equals("NA") && s1().equals("NA")) {
                    u1().e.setVisibility(8);
                } else if (!t1().equals("NA") || s1().equals("NA")) {
                    u1().D0.setText(t1());
                    u1().B0.setText(s1());
                } else {
                    u1().d0.setVisibility(8);
                    u1().D0.setVisibility(8);
                    u1().B0.setText(s1());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        G1();
        u1().Y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sf7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanRegistrationofR.z1(this.a, view);
            }
        });
        u1().A0.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tf7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanRegistrationofR.A1(this.a, view);
            }
        });
        u1().A0.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uf7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanRegistrationofR.B1(this.a, view);
            }
        });
    }

    public final String s1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String t1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final r45 u1() {
        r45 r45Var = this.binding;
        if (r45Var != null) {
            return r45Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
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
}
