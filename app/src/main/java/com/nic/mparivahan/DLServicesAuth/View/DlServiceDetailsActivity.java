package com.nic.mparivahan.DLServicesAuth.View;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import com.nic.mparivahan.DLServicesAuth.View.DlServiceDetailsActivity;
import com.nic.mparivahan.Dl.Model.BioImgObjX;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.widget.MyTextView;
import com.zepto.kt6;
import com.zepto.o40;
import com.zepto.pq1;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.yy0;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bX\u0010YJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0015J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010+\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0012\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016R\"\u0010/\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0012\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010\u0016R\"\u00103\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0012\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u0010\u0016R\"\u00107\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0012\u001a\u0004\b5\u0010\u0014\"\u0004\b6\u0010\u0016R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R2\u0010G\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010V¨\u0006Z"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/View/DlServiceDetailsActivity;", "Lcom/zepto/o40;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "fdate", "I1", "Lcom/zepto/pq1;", "F", "Lcom/zepto/pq1;", "J1", "()Lcom/zepto/pq1;", "Y1", "(Lcom/zepto/pq1;)V", "binding", "G", "Ljava/lang/String;", "getDlNo", "()Ljava/lang/String;", "setDlNo", "(Ljava/lang/String;)V", "dlNo", "H", "getDob", "setDob", "dob", "I", "getMobile_no", "setMobile_no", "Mobile_no", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "J", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "K1", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "Z1", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "dlDetails", "K", "getLastEndorseRto", "setLastEndorseRto", "lastEndorseRto", "L", "getLastEndorseState", "setLastEndorseState", "lastEndorseState", "M", "getLastEndorseRTOCode", "setLastEndorseRTOCode", "lastEndorseRTOCode", "N", "getLastEndorseStateCode", "setLastEndorseStateCode", "lastEndorseStateCode", "Landroid/widget/LinearLayout;", "O", "Landroid/widget/LinearLayout;", "M1", "()Landroid/widget/LinearLayout;", "b2", "(Landroid/widget/LinearLayout;)V", "ll_home", "Ljava/util/HashMap;", "P", "Ljava/util/HashMap;", "getWhatServiceRequired", "()Ljava/util/HashMap;", "setWhatServiceRequired", "(Ljava/util/HashMap;)V", "whatServiceRequired", "Lcom/zepto/wl5;", "Q", "Lcom/zepto/wl5;", "N1", "()Lcom/zepto/wl5;", "c2", "(Lcom/zepto/wl5;)V", "sarthiSession", "Lcom/zepto/wa3;", "R", "Lcom/zepto/wa3;", "L1", "()Lcom/zepto/wa3;", "a2", "(Lcom/zepto/wa3;)V", "langSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class DlServiceDetailsActivity extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public pq1 binding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String dlNo;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String dob;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String Mobile_no;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public DldetobjX dlDetails;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public LinearLayout ll_home;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String lastEndorseRto = "";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String lastEndorseState = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String lastEndorseRTOCode = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String lastEndorseStateCode = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public HashMap whatServiceRequired = new HashMap();

    public static final void O1(View view) {
    }

    public static final void P1(DlServiceDetailsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.J1().B.getVisibility() == 0) {
            this$0.J1().B.setVisibility(8);
            this$0.J1().D.setImageResource(R.drawable.ic_arrow_down);
        } else {
            this$0.J1().B.setVisibility(0);
            this$0.J1().D.setImageResource(R.drawable.ic_arrow_up);
        }
    }

    public static final void Q1(DlServiceDetailsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.J1().N.setVisibility(8);
        this$0.J1().O.setVisibility(0);
        this$0.J1().J.setVisibility(0);
    }

    public static final void R1(DlServiceDetailsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.J1().N.setVisibility(0);
        this$0.J1().O.setVisibility(8);
        this$0.J1().J.setVisibility(8);
    }

    public static final void S1(DlServiceDetailsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.J1().z.setVisibility(8);
        this$0.J1().C.setVisibility(0);
        this$0.J1().I.setVisibility(0);
    }

    public static final void T1(DlServiceDetailsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.J1().C.setVisibility(8);
        this$0.J1().z.setVisibility(0);
        this$0.J1().I.setVisibility(8);
    }

    public static final void U1(DlServiceDetailsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.J1().z0.setVisibility(8);
        this$0.J1().A0.setVisibility(0);
        this$0.J1().K.setVisibility(0);
    }

    public static final void V1(DlServiceDetailsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.J1().z0.setVisibility(0);
        this$0.J1().A0.setVisibility(8);
        this$0.J1().K.setVisibility(8);
    }

    public static final void W1(DlServiceDetailsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void X1(DlServiceDetailsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public final String I1(String fdate) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy");
        try {
            Date date = simpleDateFormat.parse(fdate);
            Intrinsics.checkNotNullExpressionValue(date, "parse(...)");
            return simpleDateFormat2.format(date);
        } catch (ParseException unused) {
            return null;
        }
    }

    public final pq1 J1() {
        pq1 pq1Var = this.binding;
        if (pq1Var != null) {
            return pq1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final DldetobjX K1() {
        DldetobjX dldetobjX = this.dlDetails;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlDetails");
        return null;
    }

    public final wa3 L1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final LinearLayout M1() {
        LinearLayout linearLayout = this.ll_home;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ll_home");
        return null;
    }

    public final wl5 N1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final void Y1(pq1 pq1Var) {
        Intrinsics.checkNotNullParameter(pq1Var, "<set-?>");
        this.binding = pq1Var;
    }

    public final void Z1(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dlDetails = dldetobjX;
    }

    public final void a2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void b2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.ll_home = linearLayout;
    }

    public final void c2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pq1 pq1VarX = pq1.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(pq1VarX, "inflate(...)");
        Y1(pq1VarX);
        setContentView(J1().m());
        c2(new wl5(this));
        ta3.a.s0(this, J1());
        a2(new wa3(this));
        View viewFindViewById = findViewById(R.id.ll_home);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        b2((LinearLayout) viewFindViewById);
        M1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qp1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlServiceDetailsActivity.O1(view);
            }
        });
        try {
            J1().y0.g.setText(N1().k());
            this.dlNo = String.valueOf(getIntent().getStringExtra("DL"));
            this.dob = String.valueOf(getIntent().getStringExtra("dob"));
            this.Mobile_no = String.valueOf(getIntent().getStringExtra("Mobile_no"));
            Serializable serializableExtra = getIntent().getSerializableExtra("DLDetails");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
            Z1((DldetobjX) serializableExtra);
            String stringExtra = getIntent().getStringExtra("lastEndorsedRTO");
            Intrinsics.checkNotNull(stringExtra, "null cannot be cast to non-null type kotlin.String");
            this.lastEndorseRto = stringExtra;
            String stringExtra2 = getIntent().getStringExtra("lastEndorsedRTOCode");
            Intrinsics.checkNotNull(stringExtra2, "null cannot be cast to non-null type kotlin.String");
            this.lastEndorseRTOCode = stringExtra2;
            String stringExtra3 = getIntent().getStringExtra("lastEndorsedState");
            Intrinsics.checkNotNull(stringExtra3, "null cannot be cast to non-null type kotlin.String");
            this.lastEndorseState = stringExtra3;
            String stringExtra4 = getIntent().getStringExtra("lastEndorseStateCode");
            Intrinsics.checkNotNull(stringExtra4, "null cannot be cast to non-null type kotlin.String");
            this.lastEndorseStateCode = stringExtra4;
            J1().r0.setText(K1().getBioObj().getBioFullName());
            J1().p0.setText(K1().getBioObj().getBioSwdFullName());
            J1().q0.setText(I1(K1().getBioObj().getBioDob()));
            J1().o0.setText(K1().getBioObj().getBioBloodGroup());
            try {
                String bioPermAdd1 = K1().getBioObj().getBioPermAdd1();
                String strValueOf = "";
                String bioPermAdd12 = (bioPermAdd1 == null || bioPermAdd1.length() == 0) ? "" : K1().getBioObj().getBioPermAdd1();
                String bioPermAdd2 = K1().getBioObj().getBioPermAdd2();
                String bioPermAdd22 = (bioPermAdd2 == null || bioPermAdd2.length() == 0) ? "" : K1().getBioObj().getBioPermAdd2();
                String bioPermAdd3 = K1().getBioObj().getBioPermAdd3();
                String bioPermAdd32 = (bioPermAdd3 == null || bioPermAdd3.length() == 0) ? "" : K1().getBioObj().getBioPermAdd3();
                if (K1().getBioObj().getBioPermPin() != 0) {
                    strValueOf = String.valueOf(K1().getBioObj().getBioPermPin());
                }
                J1().m0.setText(bioPermAdd12 + ' ' + bioPermAdd22 + ' ' + bioPermAdd32 + ' ' + strValueOf);
            } catch (Exception unused) {
            }
            String dlIssuedt = K1().getDlobj().getDlIssuedt();
            if (dlIssuedt == null || dlIssuedt.length() == 0) {
                J1().s0.setText("NA");
            } else {
                J1().s0.setText(K1().getDlobj().getDlIssuedt());
            }
            String omRtoShortname = K1().getDlobj().getOmRtoShortname();
            if (omRtoShortname == null || omRtoShortname.length() == 0) {
                J1().n0.setText("NA");
            } else {
                J1().n0.setText(K1().getDlobj().getOmRtoShortname());
            }
            String dlNtValdtoDt = K1().getDlobj().getDlNtValdtoDt();
            if (dlNtValdtoDt == null || dlNtValdtoDt.length() == 0) {
                J1().w0.setText("NA");
            } else {
                J1().w0.setText(K1().getDlobj().getDlNtValdtoDt());
            }
            String dlTrValdtoDt = K1().getDlobj().getDlTrValdtoDt();
            if (dlTrValdtoDt == null || dlTrValdtoDt.length() == 0) {
                J1().x0.setText("NA");
            } else {
                J1().x0.setText(String.valueOf(K1().getDlobj().getDlTrValdtoDt()));
            }
            String stateName = K1().getDlobj().getStateName();
            if (stateName == null || stateName.length() == 0) {
                J1().u0.setText("NA");
            } else {
                J1().u0.setText(K1().getDlobj().getStateName());
            }
            String stateName2 = K1().getDlobj().getStateName();
            if (stateName2 == null || stateName2.length() == 0) {
                J1().u0.setText("NA");
            } else {
                J1().u0.setText(K1().getDlobj().getStateName());
            }
            J1().t0.setText(N1().m());
            J1().v0.setText(L1().b("logo_dl_details", "Driving Licence Details") + "\n\nDL No. " + this.dlNo);
            J1().R.setText(N1().k());
            BioImgObjX bioImgObj = K1().getBioImgObj();
            if ((bioImgObj != null ? bioImgObj.getBiPhoto() : null) == null) {
                J1().Q.setVisibility(8);
                J1().F.setVisibility(0);
            } else {
                J1().Q.setVisibility(0);
                J1().F.setVisibility(8);
                ImageView imageView = J1().H;
                BioImgObjX bioImgObj2 = K1().getBioImgObj();
                imageView.setImageBitmap(kt6.a(bioImgObj2 != null ? bioImgObj2.getBiPhoto() : null));
            }
            if (!K1().getDlcovs().isEmpty()) {
                int size = K1().getDlcovs().size();
                for (int i = 0; i < size; i++) {
                    LinearLayout linearLayout = new LinearLayout(this);
                    linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    MyTextView myTextView = new MyTextView(this);
                    MyTextView myTextView2 = new MyTextView(this);
                    myTextView.setLayoutParams(new TableLayout.LayoutParams(-2, -2, 1.0f));
                    myTextView2.setLayoutParams(new TableLayout.LayoutParams(-2, -2, 1.0f));
                    myTextView.setTextSize(14.0f);
                    myTextView2.setTextColor(yy0.c(this, R.color.dl_service_color));
                    myTextView.setTextColor(yy0.c(this, R.color.black));
                    myTextView.setGravity(8388611);
                    myTextView.setTypeface(Typeface.DEFAULT);
                    myTextView.setText(K1().getDlcovs().get(i).getCovdesc());
                    myTextView2.setText(K1().getDlcovs().get(i).getCovabbrv());
                    myTextView.setPadding(5, 5, 5, 5);
                    myTextView2.setPadding(5, 5, 5, 5);
                    linearLayout.addView(myTextView, 0);
                    linearLayout.addView(myTextView2, 0);
                    J1().K.addView(linearLayout);
                }
            }
        } catch (Exception unused2) {
        }
        J1().B0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rp1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlServiceDetailsActivity.P1(this.a, view);
            }
        });
        J1().N.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sp1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlServiceDetailsActivity.Q1(this.a, view);
            }
        });
        J1().O.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tp1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlServiceDetailsActivity.R1(this.a, view);
            }
        });
        J1().z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.up1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlServiceDetailsActivity.S1(this.a, view);
            }
        });
        J1().C.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vp1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlServiceDetailsActivity.T1(this.a, view);
            }
        });
        J1().z0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wp1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlServiceDetailsActivity.U1(this.a, view);
            }
        });
        J1().A0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xp1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlServiceDetailsActivity.V1(this.a, view);
            }
        });
        J1().M.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yp1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlServiceDetailsActivity.W1(this.a, view);
            }
        });
        J1().G.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zp1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlServiceDetailsActivity.X1(this.a, view);
            }
        });
    }
}
