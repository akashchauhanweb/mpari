package com.nic.mparivahan.ClServicesMainScreens;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.nic.mparivahan.ClServicesMainScreens.ClDetailsTop;
import com.zepto.o7;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import java.text.SimpleDateFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\bA\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b`\u0010aJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010/\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00103\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010*\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R\"\u00107\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010*\u001a\u0004\b5\u0010,\"\u0004\b6\u0010.R\"\u0010;\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u0010*\u001a\u0004\b9\u0010,\"\u0004\b:\u0010.R\"\u0010?\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010*\u001a\u0004\b=\u0010,\"\u0004\b>\u0010.R\"\u0010C\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010*\u001a\u0004\bA\u0010,\"\u0004\bB\u0010.R\"\u0010G\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010*\u001a\u0004\bE\u0010,\"\u0004\bF\u0010.R\"\u0010K\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010*\u001a\u0004\bI\u0010,\"\u0004\bJ\u0010.R\"\u0010O\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010*\u001a\u0004\bM\u0010,\"\u0004\bN\u0010.R\"\u0010S\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010*\u001a\u0004\bQ\u0010,\"\u0004\bR\u0010.R\"\u0010W\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010*\u001a\u0004\bU\u0010,\"\u0004\bV\u0010.R\"\u0010[\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010*\u001a\u0004\bY\u0010,\"\u0004\bZ\u0010.R\"\u0010_\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010*\u001a\u0004\b]\u0010,\"\u0004\b^\u0010.¨\u0006b"}, d2 = {"Lcom/nic/mparivahan/ClServicesMainScreens/ClDetailsTop;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "date", "o1", "Lcom/zepto/o7;", "C", "Lcom/zepto/o7;", "t1", "()Lcom/zepto/o7;", "I1", "(Lcom/zepto/o7;)V", "mBinding", "Landroid/content/Context;", "D", "Landroid/content/Context;", "u1", "()Landroid/content/Context;", "J1", "(Landroid/content/Context;)V", "mContext", "Lcom/zepto/wa3;", "E", "Lcom/zepto/wa3;", "getLangSession", "()Lcom/zepto/wa3;", "H1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/wl5;", "F", "Lcom/zepto/wl5;", "v1", "()Lcom/zepto/wl5;", "N1", "(Lcom/zepto/wl5;)V", "sarthiSession", "G", "Ljava/lang/String;", "q1", "()Ljava/lang/String;", "E1", "(Ljava/lang/String;)V", "dlValue", "H", "r1", "F1", "dobValue", "I", "s1", "G1", "fatherName", "J", "p1", "C1", "clName", "K", "getClPhoto", "D1", "clPhoto", "L", "getRtoCode", "L1", "rtoCode", "M", "getStateCode", "O1", "stateCode", "N", "getRtoName", "M1", "rtoName", "O", "getMobile_no", "K1", "Mobile_no", "P", "getAddress", "setAddress", "address", "Q", "getIssuing_authority", "setIssuing_authority", "issuing_authority", "R", "getValidity", "setValidity", "validity", "S", "getCl_Status", "setCl_Status", "cl_Status", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ClDetailsTop extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public o7 mBinding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String dlValue;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String dobValue;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String fatherName;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String clName;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String clPhoto;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String rtoCode;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String stateCode;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String rtoName;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String Mobile_no;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String address = "";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String issuing_authority = "";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String validity = "";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String cl_Status = "";

    public static final void A1(ClDetailsTop this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.t1().z.setVisibility(8);
        this$0.t1().C.setVisibility(0);
        this$0.t1().I.setVisibility(0);
    }

    public static final void B1(ClDetailsTop this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.t1().C.setVisibility(8);
        this$0.t1().z.setVisibility(0);
        this$0.t1().I.setVisibility(8);
    }

    public static final void w1(ClDetailsTop this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void x1(ClDetailsTop this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void y1(ClDetailsTop this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.t1().O.setVisibility(8);
        this$0.t1().P.setVisibility(0);
        this$0.t1().J.setVisibility(0);
    }

    public static final void z1(ClDetailsTop this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.t1().O.setVisibility(0);
        this$0.t1().P.setVisibility(8);
        this$0.t1().J.setVisibility(8);
    }

    public final void C1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clName = str;
    }

    public final void D1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clPhoto = str;
    }

    public final void E1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dlValue = str;
    }

    public final void F1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dobValue = str;
    }

    public final void G1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fatherName = str;
    }

    public final void H1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void I1(o7 o7Var) {
        Intrinsics.checkNotNullParameter(o7Var, "<set-?>");
        this.mBinding = o7Var;
    }

    public final void J1(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void K1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.Mobile_no = str;
    }

    public final void L1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoCode = str;
    }

    public final void M1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoName = str;
    }

    public final void N1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final void O1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCode = str;
    }

    public final String o1(String date) {
        Intrinsics.checkNotNullParameter(date, "date");
        try {
            String str = new SimpleDateFormat("dd-MM-yyyy").format(new SimpleDateFormat("yyyy-MM-dd").parse(date));
            Intrinsics.checkNotNull(str);
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return date;
        }
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        J1(this);
        o7 o7VarX = o7.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(o7VarX, "inflate(...)");
        I1(o7VarX);
        setContentView(t1().m());
        N1(new wl5(this));
        H1(new wa3(u1()));
        ta3.a.a0(this, t1());
        try {
            F1(String.valueOf(getIntent().getStringExtra("dobValue")));
            E1(String.valueOf(getIntent().getStringExtra("dlValue")));
            G1(String.valueOf(getIntent().getStringExtra("fatherName")));
            C1(String.valueOf(getIntent().getStringExtra("clName")));
            D1(String.valueOf(getIntent().getStringExtra("clPhoto")));
            L1(String.valueOf(getIntent().getStringExtra("rtoCode")));
            M1(String.valueOf(getIntent().getStringExtra("rtoName")));
            O1(String.valueOf(getIntent().getStringExtra("stateCode")));
            K1(String.valueOf(getIntent().getStringExtra("Mobile_no")));
            this.address = String.valueOf(getIntent().getStringExtra("address"));
            this.issuing_authority = String.valueOf(getIntent().getStringExtra("issuing_authority"));
            this.validity = String.valueOf(getIntent().getStringExtra("validity"));
            this.cl_Status = String.valueOf(getIntent().getStringExtra("cl_Status"));
            t1().m0.setText(p1());
            t1().k0.setText(s1());
            String strR1 = r1();
            if (strR1 == null || strR1.length() == 0) {
                t1().l0.setText("NA");
            } else {
                t1().l0.setText(o1(r1()));
            }
            t1().j0.setText(this.address);
            String str = this.validity;
            if (str == null || str.length() == 0) {
                t1().p0.setText("NA");
            } else {
                t1().p0.setText(o1(this.validity));
            }
            t1().i0.setText(this.issuing_authority);
            t1().o0.setText(this.cl_Status);
            t1().n0.setText("CL No. : " + q1());
            t1().L.g.setText(v1().k());
            t1().L.h.setText(StringsKt__StringsKt.trim((CharSequence) q1()).toString());
        } catch (Exception unused) {
        }
        t1().N.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClDetailsTop.w1(this.a, view);
            }
        });
        t1().L.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.el0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClDetailsTop.x1(this.a, view);
            }
        });
        t1().O.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClDetailsTop.y1(this.a, view);
            }
        });
        t1().P.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClDetailsTop.z1(this.a, view);
            }
        });
        t1().z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClDetailsTop.A1(this.a, view);
            }
        });
        t1().C.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.il0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClDetailsTop.B1(this.a, view);
            }
        });
    }

    public final String p1() {
        String str = this.clName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clName");
        return null;
    }

    public final String q1() {
        String str = this.dlValue;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlValue");
        return null;
    }

    public final String r1() {
        String str = this.dobValue;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dobValue");
        return null;
    }

    public final String s1() {
        String str = this.fatherName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fatherName");
        return null;
    }

    public final o7 t1() {
        o7 o7Var = this.mBinding;
        if (o7Var != null) {
            return o7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    public final Context u1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final wl5 v1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }
}
