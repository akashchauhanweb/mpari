package com.nic.mparivahan.AddCov.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails;
import com.nic.mparivahan.AddCov.View.CovDetails;
import com.zepto.pq;
import com.zepto.s8;
import com.zepto.ta3;
import com.zepto.wl5;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b,\u0010-J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010#\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/nic/mparivahan/AddCov/View/CovDetails;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "J1", "q1", "Lcom/zepto/s8;", "C", "Lcom/zepto/s8;", "A1", "()Lcom/zepto/s8;", "G1", "(Lcom/zepto/s8;)V", "mBinding", "Lcom/nic/mparivahan/AddCov/PojoClass/ApplStatusDetails;", "D", "Lcom/nic/mparivahan/AddCov/PojoClass/ApplStatusDetails;", "z1", "()Lcom/nic/mparivahan/AddCov/PojoClass/ApplStatusDetails;", "F1", "(Lcom/nic/mparivahan/AddCov/PojoClass/ApplStatusDetails;)V", "mApplStatusDetails", "", "E", "Ljava/lang/String;", "B1", "()Ljava/lang/String;", "H1", "(Ljava/lang/String;)V", "newdob", "F", "y1", "E1", "app", "Lcom/zepto/wl5;", "G", "Lcom/zepto/wl5;", "C1", "()Lcom/zepto/wl5;", "I1", "(Lcom/zepto/wl5;)V", "sahi_session", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class CovDetails extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public s8 mBinding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ApplStatusDetails mApplStatusDetails;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String newdob;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String app;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wl5 sahi_session;

    public static final void D1(CovDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void r1(CovDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.A1().z.setVisibility(8);
        this$0.A1().y.setVisibility(0);
        this$0.A1().S.setVisibility(8);
    }

    public static final void s1(CovDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.A1().z.setVisibility(0);
        this$0.A1().y.setVisibility(8);
        this$0.A1().S.setVisibility(0);
    }

    public static final void t1(CovDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.A1().Y.setVisibility(8);
        this$0.A1().X.setVisibility(0);
        this$0.A1().w.setVisibility(8);
    }

    public static final void u1(CovDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.A1().Y.setVisibility(0);
        this$0.A1().X.setVisibility(8);
        this$0.A1().w.setVisibility(0);
    }

    public static final void v1(CovDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.A1().f0.setVisibility(8);
        this$0.A1().e0.setVisibility(0);
        this$0.A1().x.setVisibility(8);
    }

    public static final void w1(CovDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.A1().f0.setVisibility(0);
        this$0.A1().e0.setVisibility(8);
        this$0.A1().x.setVisibility(0);
    }

    public static final void x1(CovDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) CovList.class);
        intent.putExtra("ApplStatusDetails", this$0.z1());
        intent.putExtra("app_number", this$0.y1());
        intent.putExtra("newdob", this$0.B1());
        this$0.startActivity(intent);
    }

    public final s8 A1() {
        s8 s8Var = this.mBinding;
        if (s8Var != null) {
            return s8Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    public final String B1() {
        String str = this.newdob;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("newdob");
        return null;
    }

    public final wl5 C1() {
        wl5 wl5Var = this.sahi_session;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sahi_session");
        return null;
    }

    public final void E1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.app = str;
    }

    public final void F1(ApplStatusDetails applStatusDetails) {
        Intrinsics.checkNotNullParameter(applStatusDetails, "<set-?>");
        this.mApplStatusDetails = applStatusDetails;
    }

    public final void G1(s8 s8Var) {
        Intrinsics.checkNotNullParameter(s8Var, "<set-?>");
        this.mBinding = s8Var;
    }

    public final void H1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.newdob = str;
    }

    public final void I1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sahi_session = wl5Var;
    }

    public final void J1() {
        try {
            A1().K.setText(z1().getApplName());
            A1().I0.setText(z1().getRelation());
            A1().N0.setText(z1().getSwdName());
            String gender = z1().getGender();
            if (!Intrinsics.areEqual(gender, "Male") && Intrinsics.areEqual(gender, "Female")) {
                A1().U.setChecked(false);
                A1().Q.setChecked(true);
            } else {
                A1().U.setChecked(true);
                A1().Q.setChecked(false);
            }
            A1().I.setText(z1().getDob());
            A1().L.setText(z1().getPlaceOfBirth());
            A1().P.setText(z1().getQualcd_Desc());
            A1().M.setText(z1().getBloodGroup());
            A1().O.setText(z1().getMobileNO());
            A1().N.setText(z1().getEmailId());
            String altMobileNumber = z1().getAltMobileNumber();
            if (altMobileNumber == null || altMobileNumber.length() == 0) {
                A1().J.setText("NA");
            } else {
                A1().J.setText(z1().getAltMobileNumber());
            }
            A1().h0.setText(z1().getStateCd());
            A1().g0.setText(z1().getRtoCd());
            A1().F.setText(z1().getPRESENT_State());
            A1().B.setText(z1().getPRESENT_DISTRICTCODE());
            A1().H.setText(z1().getPRESENT_SUBDICTCODE());
            A1().C.setText(z1().getPRESENT_ADD1());
            A1().C.setText(z1().getPRESENT_ADD1());
            A1().G.setText(z1().getPRESENT_ADD2());
            A1().D.setText(z1().getPRESENT_ADD3());
            A1().E.setText(z1().getPRESENT_PINCODE());
            A1().W.setText(z1().getPERMANENT_State());
            A1().V.setText(z1().getPERMANENT_DISTRICTCODE());
            A1().d0.setText(z1().getPERMANENT_SUBDICTCODE());
            A1().Z.setText(z1().getPERMANENT_ADD1());
            A1().c0.setText(z1().getPRESENT_ADD2());
            A1().a0.setText(z1().getPRESENT_ADD3());
            A1().b0.setText(z1().getPRESENT_PINCODE());
        } catch (Exception unused) {
        }
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        s8 s8VarX = s8.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(s8VarX, "inflate(...)");
        G1(s8VarX);
        setContentView(A1().m());
        I1(new wl5(this));
        ta3.a.k0(this, A1());
        if (getIntent() != null) {
            Serializable serializableExtra = getIntent().getSerializableExtra("ApplStatusDetails");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails");
            F1((ApplStatusDetails) serializableExtra);
            H1(String.valueOf(getIntent().getStringExtra("newdob")));
            E1(String.valueOf(getIntent().getStringExtra("app_number")));
        }
        q1();
        J1();
        A1().T.g.setText(C1().k());
        A1().T.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.o01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CovDetails.D1(this.a, view);
            }
        });
    }

    public final void q1() {
        A1().z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.p01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CovDetails.r1(this.a, view);
            }
        });
        A1().y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.q01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CovDetails.s1(this.a, view);
            }
        });
        A1().Y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.r01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CovDetails.t1(this.a, view);
            }
        });
        A1().X.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.s01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CovDetails.u1(this.a, view);
            }
        });
        A1().f0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.t01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CovDetails.v1(this.a, view);
            }
        });
        A1().e0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.u01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CovDetails.w1(this.a, view);
            }
        });
        A1().A.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.v01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CovDetails.x1(this.a, view);
            }
        });
    }

    public final String y1() {
        String str = this.app;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("app");
        return null;
    }

    public final ApplStatusDetails z1() {
        ApplStatusDetails applStatusDetails = this.mApplStatusDetails;
        if (applStatusDetails != null) {
            return applStatusDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mApplStatusDetails");
        return null;
    }
}
