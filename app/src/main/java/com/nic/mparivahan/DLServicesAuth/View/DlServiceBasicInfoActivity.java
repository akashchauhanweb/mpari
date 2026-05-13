package com.nic.mparivahan.DLServicesAuth.View;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.DLServicesAuth.Model.RTO.DlLastRtoDetailsDto;
import com.nic.mparivahan.DLServicesAuth.Model.RTO.Result;
import com.nic.mparivahan.DLServicesAuth.View.DlServiceBasicInfoActivity;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Dl.Model.BioImgObjX;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.R;
import com.nic.mparivahan.a;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.zepto.kt6;
import com.zepto.lr1;
import com.zepto.mf4;
import com.zepto.mr1;
import com.zepto.nr1;
import com.zepto.o40;
import com.zepto.rq1;
import com.zepto.sq1;
import com.zepto.wl5;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bi\u0010jJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u001a\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010 \u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010$\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR$\u0010(\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u001fR\"\u0010,\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR\"\u00100\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001b\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001fR\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR2\u0010`\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b0Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010g¨\u0006k"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/View/DlServiceBasicInfoActivity;", "Lcom/zepto/o40;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/content/Context;", "context", "", "message", "Q1", "Lcom/zepto/sq1;", "F", "Lcom/zepto/sq1;", "E1", "()Lcom/zepto/sq1;", "S1", "(Lcom/zepto/sq1;)V", "binding", "", "G", "Ljava/lang/Integer;", "isMobileOrAadhar", "()Ljava/lang/Integer;", "setMobileOrAadhar", "(Ljava/lang/Integer;)V", "H", "Ljava/lang/String;", "getDlNo", "()Ljava/lang/String;", "setDlNo", "(Ljava/lang/String;)V", "dlNo", "I", "getDob", "setDob", "dob", "J", "getMobile_no", "setMobile_no", "Mobile_no", "K", "getLastEndorseRtoCode", "setLastEndorseRtoCode", "lastEndorseRtoCode", "L", "getLastEndorseStateCode", "setLastEndorseStateCode", "lastEndorseStateCode", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "M", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "F1", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "T1", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "dlDetails", "Lcom/zepto/wl5;", "N", "Lcom/zepto/wl5;", "K1", "()Lcom/zepto/wl5;", "Y1", "(Lcom/zepto/wl5;)V", "sarthiSession", "Lcom/zepto/nr1;", "O", "Lcom/zepto/nr1;", "G1", "()Lcom/zepto/nr1;", "U1", "(Lcom/zepto/nr1;)V", "dlServicesViewModel", "Landroid/widget/ImageView;", "P", "Landroid/widget/ImageView;", "I1", "()Landroid/widget/ImageView;", "W1", "(Landroid/widget/ImageView;)V", "mvvm_back", "Landroid/widget/LinearLayout;", "Q", "Landroid/widget/LinearLayout;", "H1", "()Landroid/widget/LinearLayout;", "V1", "(Landroid/widget/LinearLayout;)V", "ll_home", "Ljava/util/HashMap;", "R", "Ljava/util/HashMap;", "getWhatServiceRequired", "()Ljava/util/HashMap;", "setWhatServiceRequired", "(Ljava/util/HashMap;)V", "whatServiceRequired", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "S", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "J1", "()Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "X1", "(Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;)V", "retrofitService", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class DlServiceBasicInfoActivity extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public sq1 binding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public Integer isMobileOrAadhar;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String dlNo;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String dob;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String Mobile_no;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public DldetobjX dlDetails;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public nr1 dlServicesViewModel;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public ImageView mvvm_back;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public LinearLayout ll_home;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public DlServiceInt retrofitService;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String lastEndorseRtoCode = "";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String lastEndorseStateCode = "";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public HashMap whatServiceRequired = new HashMap();

    public static final void L1(DlServiceBasicInfoActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void M1(DlServiceBasicInfoActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    public static final void N1(DlServiceBasicInfoActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.E1().g.c(true);
        mr1.a aVar = mr1.a;
        StringsKt__StringsKt.trim((CharSequence) String.valueOf(aVar.b(aVar.g(9999.0d, 99999.0d)))).toString();
        if (!a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), "Please Check Your Internet connection", 1).show();
            return;
        }
        nr1 nr1VarG1 = this$0.G1();
        String str = this$0.dlNo;
        Intrinsics.checkNotNull(str);
        nr1VarG1.x(this$0, str, this$0.F1().getBioObj().getBioDob());
    }

    public static final void O1(DlServiceBasicInfoActivity this$0, DlLastRtoDetailsDto dlLastRtoDetailsDto) {
        List<Result> result;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.E1().g.c(false);
        try {
            if (dlLastRtoDetailsDto.getStatus_code().equals("00") && dlLastRtoDetailsDto.getStatus_desc().equals("success") && (result = dlLastRtoDetailsDto.getResult()) != null) {
                String rtoCode = result.get(0).getRtoCode();
                Intrinsics.checkNotNull(rtoCode);
                this$0.lastEndorseRtoCode = rtoCode;
                String stCode = result.get(0).getStCode();
                Intrinsics.checkNotNull(stCode);
                this$0.lastEndorseStateCode = stCode;
                Intent intent = new Intent(this$0, (Class<?>) DlServiceDetailsActivity.class);
                intent.putExtra("DL", this$0.dlNo);
                intent.putExtra("dob", this$0.dob);
                intent.putExtra("DLDetails", this$0.F1());
                intent.putExtra("Mobile_no", this$0.Mobile_no);
                intent.putExtra("lastEndorsedRTO", result.get(0).getLastEndRTO());
                intent.putExtra("lastEndorsedState", result.get(0).getLastEndState());
                intent.putExtra("lastEndorsedRTOCode", this$0.lastEndorseRtoCode);
                intent.putExtra("lastEndorseStateCode", this$0.lastEndorseStateCode);
                intent.putExtra("whatServiceRequired", this$0.whatServiceRequired);
                this$0.startActivity(intent);
            }
        } catch (Exception unused) {
            this$0.Q1(this$0, this$0.getString(R.string.service_unavable_please_try));
        }
    }

    public static final void P1(DlServiceBasicInfoActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.Q1(this$0, this$0.getString(R.string.service_unavable_please_try));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public final sq1 E1() {
        sq1 sq1Var = this.binding;
        if (sq1Var != null) {
            return sq1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final DldetobjX F1() {
        DldetobjX dldetobjX = this.dlDetails;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlDetails");
        return null;
    }

    public final nr1 G1() {
        nr1 nr1Var = this.dlServicesViewModel;
        if (nr1Var != null) {
            return nr1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlServicesViewModel");
        return null;
    }

    public final LinearLayout H1() {
        LinearLayout linearLayout = this.ll_home;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ll_home");
        return null;
    }

    public final ImageView I1() {
        ImageView imageView = this.mvvm_back;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mvvm_back");
        return null;
    }

    public final DlServiceInt J1() {
        DlServiceInt dlServiceInt = this.retrofitService;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final wl5 K1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final void Q1(Context context, String message) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pp1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlServiceBasicInfoActivity.R1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void S1(sq1 sq1Var) {
        Intrinsics.checkNotNullParameter(sq1Var, "<set-?>");
        this.binding = sq1Var;
    }

    public final void T1(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dlDetails = dldetobjX;
    }

    public final void U1(nr1 nr1Var) {
        Intrinsics.checkNotNullParameter(nr1Var, "<set-?>");
        this.dlServicesViewModel = nr1Var;
    }

    public final void V1(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.ll_home = linearLayout;
    }

    public final void W1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.mvvm_back = imageView;
    }

    public final void X1(DlServiceInt dlServiceInt) {
        Intrinsics.checkNotNullParameter(dlServiceInt, "<set-?>");
        this.retrofitService = dlServiceInt;
    }

    public final void Y1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dl_services_10);
        sq1 sq1VarC = sq1.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(sq1VarC, "inflate(...)");
        S1(sq1VarC);
        setContentView(E1().b());
        Y1(new wl5(this));
        X1(DlServiceInt.INSTANCE.a(this));
        U1((nr1) new z(this, new rq1(new lr1(J1(), this))).a(nr1.class));
        Integer numValueOf = Integer.valueOf(getIntent().getIntExtra("isMobileOrAadhar", -1));
        this.isMobileOrAadhar = numValueOf;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            E1().j.setVisibility(4);
        }
        try {
            this.dlNo = String.valueOf(getIntent().getStringExtra("DL"));
            this.dob = String.valueOf(getIntent().getStringExtra("dob"));
            this.Mobile_no = String.valueOf(getIntent().getStringExtra("Mobile_no"));
            Serializable serializableExtra = getIntent().getSerializableExtra("DLDetails");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
            T1((DldetobjX) serializableExtra);
            Serializable serializableExtra2 = getIntent().getSerializableExtra("whatServiceRequired");
            Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type java.util.HashMap<kotlin.String?, kotlin.String?>");
            this.whatServiceRequired = (HashMap) serializableExtra2;
            E1().s.setText("DL No.: " + this.dlNo);
            E1().i.setText(K1().k());
            BioImgObjX bioImgObj = F1().getBioImgObj();
            if ((bioImgObj != null ? bioImgObj.getBiPhoto() : null) == null) {
                E1().h.setVisibility(8);
                E1().d.setVisibility(0);
            } else {
                E1().h.setVisibility(0);
                E1().d.setVisibility(8);
                E1().f.setImageBitmap(kt6.a(F1().getBioImgObj().getBiPhoto()));
            }
        } catch (Exception unused) {
        }
        View viewFindViewById = findViewById(R.id.mvvm_back);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        W1((ImageView) viewFindViewById);
        I1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kp1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlServiceBasicInfoActivity.L1(this.a, view);
            }
        });
        View viewFindViewById2 = findViewById(R.id.ll_home);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        V1((LinearLayout) viewFindViewById2);
        H1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lp1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlServiceBasicInfoActivity.M1(this.a, view);
            }
        });
        try {
            E1().e.setText(F1().getDlobj().getDlIssuedt());
            E1().b.setText(F1().getBioObj().getBioFullName());
            if (Intrinsics.areEqual(F1().getBioObj().getBioDependentRelation(), "F") || Intrinsics.areEqual(F1().getBioObj().getBioDependentRelation(), "f")) {
                E1().v.setText("Father's Name");
            } else if (Intrinsics.areEqual(F1().getBioObj().getBioDependentRelation(), "H") || Intrinsics.areEqual(F1().getBioObj().getBioDependentRelation(), "h")) {
                E1().v.setText("Husband's Name");
            } else if (Intrinsics.areEqual(F1().getBioObj().getBioDependentRelation(), "G") || Intrinsics.areEqual(F1().getBioObj().getBioDependentRelation(), "g")) {
                E1().v.setText("Guardian's Name");
            } else if (Intrinsics.areEqual(F1().getBioObj().getBioDependentRelation(), "M") || Intrinsics.areEqual(F1().getBioObj().getBioDependentRelation(), "m")) {
                E1().v.setText("Mother's Name");
            } else {
                E1().v.setText("on/Wife/Daughter of");
            }
            E1().u.setText(F1().getBioObj().getBioSwdFullName());
            if (F1().getBioObj().getBioAadhaarName() != null) {
                E1().t.setText(String.valueOf(F1().getBioObj().getBioAadhaarName()));
                E1().r.setText(String.valueOf(F1().getBioObj().getBioPerDetAadhaar()));
            }
        } catch (Exception unused2) {
        }
        E1().g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mp1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlServiceBasicInfoActivity.N1(this.a, view);
            }
        });
        G1().l().g(this, new mf4() { // from class: com.zepto.np1
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                DlServiceBasicInfoActivity.O1(this.a, (DlLastRtoDetailsDto) obj);
            }
        });
        G1().t().g(this, new mf4() { // from class: com.zepto.op1
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                DlServiceBasicInfoActivity.P1(this.a, (String) obj);
            }
        });
    }
}
