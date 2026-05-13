package com.nic.mparivahan.VahanServices.TransferOfPermit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.TransferOfPermit.TransferOfPermit;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import com.zepto.pq;
import com.zepto.ug;
import com.zepto.vh7;
import com.zepto.wa3;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bH\u0010IJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0003R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010'\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR\"\u0010+\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\u001cR\"\u0010/\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010\u0018\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\"\u00103\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R>\u0010?\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001607j\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016`88\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006J"}, d2 = {"Lcom/nic/mparivahan/VahanServices/TransferOfPermit/TransferOfPermit;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "rcdetails", "r1", "Lcom/zepto/ug;", "C", "Lcom/zepto/ug;", "binding", "Lcom/zepto/wa3;", "D", "Lcom/zepto/wa3;", "n1", "()Lcom/zepto/wa3;", "x1", "(Lcom/zepto/wa3;)V", "languageKeySession", "", "E", "Ljava/lang/String;", "o1", "()Ljava/lang/String;", "z1", "(Ljava/lang/String;)V", "rc_number", "F", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "p1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "A1", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "G", "getOff_code", "y1", "off_code", "H", "m1", "w1", "aadhar_name", "I", "l1", "v1", "aadhar_address", "", "J", "Z", "isFaceless", "()Z", "setFaceless", "(Z)V", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "K", "Ljava/util/HashMap;", "getServiceSelection_HashMap", "()Ljava/util/HashMap;", "setServiceSelection_HashMap", "(Ljava/util/HashMap;)V", "serviceSelection_HashMap", "Lcom/zepto/vh7;", "L", "Lcom/zepto/vh7;", "q1", "()Lcom/zepto/vh7;", "B1", "(Lcom/zepto/vh7;)V", "session", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class TransferOfPermit extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ug binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public HashMap serviceSelection_HashMap = new HashMap();

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public vh7 session;

    public static final void s1(TransferOfPermit this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void t1(TransferOfPermit this$0, NrvDetails rcdetails, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rcdetails, "$rcdetails");
        Intent intent = new Intent(this$0, (Class<?>) VahanVehicleDetailsService.class);
        intent.putExtra("RC", this$0.o1());
        intent.putExtra("RcDetails", rcdetails);
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.m1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.l1());
        this$0.startActivity(intent);
    }

    public static final void u1(TransferOfPermit this$0, NrvDetails rcdetails, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rcdetails, "$rcdetails");
        Intent intent = new Intent(this$0, (Class<?>) TransferOfPermitDetailActivity.class);
        intent.putExtra("RC", rcdetails.getRc_regn_no());
        intent.putExtra("RcDetails", rcdetails);
        intent.putExtra("off_code", rcdetails.getRc_off_cd());
        intent.putExtra("map", this$0.serviceSelection_HashMap);
        intent.putExtra(VContant.NEXGEN_isFACELESS, this$0.isFaceless);
        intent.putExtra(VContant.NEXGEN_addahar_name, this$0.m1());
        intent.putExtra(VContant.NEXGEN_addahar_address, this$0.l1());
        this$0.startActivity(intent);
    }

    public final void A1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void B1(vh7 vh7Var) {
        Intrinsics.checkNotNullParameter(vh7Var, "<set-?>");
        this.session = vh7Var;
    }

    public final String l1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String m1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final wa3 n1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final String o1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, n1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ug ugVarX = ug.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ugVarX, "inflate(...)");
        this.binding = ugVarX;
        if (ugVarX == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ugVarX = null;
        }
        setContentView(ugVarX.m());
        x1(new wa3(this));
        B1(new vh7(this));
        y1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        w1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        v1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        z1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        A1((NrvDetails) serializableExtra);
        HashMap map = (HashMap) getIntent().getSerializableExtra("map");
        Intrinsics.checkNotNull(map);
        this.serviceSelection_HashMap = map;
        r1(p1());
    }

    public final NrvDetails p1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final vh7 q1() {
        vh7 vh7Var = this.session;
        if (vh7Var != null) {
            return vh7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final void r1(final NrvDetails rcdetails) {
        String strN = VContant.INSTANCE.n(this, q1());
        ug ugVar = this.binding;
        ug ugVar2 = null;
        if (ugVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ugVar = null;
        }
        ugVar.A.i.setText(strN);
        ug ugVar3 = this.binding;
        if (ugVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ugVar3 = null;
        }
        ugVar3.A.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferOfPermit.s1(this.a, view);
            }
        });
        if (rcdetails != null) {
            String rc_permit_no = rcdetails.getRc_permit_no();
            Intrinsics.checkNotNull(rc_permit_no);
            if (rc_permit_no.length() > 0) {
                ug ugVar4 = this.binding;
                if (ugVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ugVar4 = null;
                }
                ugVar4.y.setText(rcdetails.getRc_permit_no());
            }
            String rc_permit_valid_upto = rcdetails.getRc_permit_valid_upto();
            Intrinsics.checkNotNull(rc_permit_valid_upto);
            if (rc_permit_valid_upto.length() > 0) {
                ug ugVar5 = this.binding;
                if (ugVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ugVar5 = null;
                }
                ugVar5.E.setText(rcdetails.getRc_permit_valid_upto());
            }
            String rc_permit_valid_from = rcdetails.getRc_permit_valid_from();
            Intrinsics.checkNotNull(rc_permit_valid_from);
            if (rc_permit_valid_from.length() > 0) {
                ug ugVar6 = this.binding;
                if (ugVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ugVar6 = null;
                }
                ugVar6.C.setText(rcdetails.getRc_permit_valid_from());
            }
        }
        ug ugVar7 = this.binding;
        if (ugVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ugVar7 = null;
        }
        ugVar7.F.setText(n1().b("vehicle_no", "Vehicle No.:") + ' ' + o1());
        ug ugVar8 = this.binding;
        if (ugVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ugVar8 = null;
        }
        ugVar8.G.setText(n1().b("view_vehicle_details", "View Vehicle Details"));
        ug ugVar9 = this.binding;
        if (ugVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ugVar9 = null;
        }
        TextView textView = ugVar9.G;
        ug ugVar10 = this.binding;
        if (ugVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ugVar10 = null;
        }
        textView.setPaintFlags(ugVar10.G.getPaintFlags() | 8);
        ug ugVar11 = this.binding;
        if (ugVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ugVar11 = null;
        }
        ugVar11.G.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferOfPermit.t1(this.a, rcdetails, view);
            }
        });
        ug ugVar12 = this.binding;
        if (ugVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ugVar2 = ugVar12;
        }
        ugVar2.w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rm6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferOfPermit.u1(this.a, rcdetails, view);
            }
        });
    }

    public final void v1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void w1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void x1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void y1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void z1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }
}
