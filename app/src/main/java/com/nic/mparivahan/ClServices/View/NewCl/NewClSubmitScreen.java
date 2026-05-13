package com.nic.mparivahan.ClServices.View.NewCl;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.FileProvider;
import androidx.lifecycle.z;
import com.nic.mparivahan.ClServices.View.ClDocumentsUpload;
import com.nic.mparivahan.ClServices.View.ClFeePayment;
import com.nic.mparivahan.ClServices.View.ClPhotoSignature;
import com.nic.mparivahan.ClServices.View.ClSots;
import com.nic.mparivahan.ClServices.View.NewCl.NewClSubmitScreen;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.ApplFlowStatusListItem;
import com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.ui.DLServiceFinalSubmitedActivity;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.st6;
import com.zepto.ta3;
import com.zepto.ud;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.yk1;
import java.io.File;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bx\u0010yJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0012\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014J\u0017\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\"\u0010\u001f\u001a\u0004\u0018\u00010\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fJ\b\u0010 \u001a\u00020\u0002H\u0016R\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010G\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0016\u0010K\u001a\u00020H8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bI\u0010JR\"\u0010O\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010B\u001a\u0004\bM\u0010D\"\u0004\bN\u0010FR\"\u0010S\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010B\u001a\u0004\bQ\u0010D\"\u0004\bR\u0010FR\"\u0010W\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010B\u001a\u0004\bU\u0010D\"\u0004\bV\u0010FR\"\u0010[\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010B\u001a\u0004\bY\u0010D\"\u0004\bZ\u0010FR\"\u0010_\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010B\u001a\u0004\b]\u0010D\"\u0004\b^\u0010FR\"\u0010c\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010B\u001a\u0004\ba\u0010D\"\u0004\bb\u0010FR\"\u0010g\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u0010B\u001a\u0004\be\u0010D\"\u0004\bf\u0010FR\"\u0010k\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010B\u001a\u0004\bi\u0010D\"\u0004\bj\u0010FR\"\u0010o\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010B\u001a\u0004\bm\u0010D\"\u0004\bn\u0010FR\"\u0010w\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010v¨\u0006z"}, d2 = {"Lcom/nic/mparivahan/ClServices/View/NewCl/NewClSubmitScreen;", "Lcom/zepto/pq;", "", "y1", "", "Lcom/nic/mparivahan/dlservices/data/model/ApplFlowStatusListItem;", "applFlowStatusList", "T1", "X1", "V1", "W1", "Y1", "", "message", "D1", "Landroidx/constraintlayout/widget/ConstraintLayout;", "containerView", "z1", "Ljava/io/File;", "file", "U1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "acCd", "A1", "(Ljava/lang/Integer;)V", "fdate", "inFormType", "outFormType", "m1", "onBackPressed", "Lcom/zepto/ud;", "C", "Lcom/zepto/ud;", "q1", "()Lcom/zepto/ud;", "K1", "(Lcom/zepto/ud;)V", "mBinding", "Lcom/zepto/wa3;", "D", "Lcom/zepto/wa3;", "x1", "()Lcom/zepto/wa3;", "R1", "(Lcom/zepto/wa3;)V", "session", "Landroid/content/Context;", "E", "Landroid/content/Context;", "r1", "()Landroid/content/Context;", "L1", "(Landroid/content/Context;)V", "mContext", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "t1", "()Landroid/app/ProgressDialog;", "N1", "(Landroid/app/ProgressDialog;)V", "pDialog", "G", "Ljava/lang/String;", "getApplicationNumber", "()Ljava/lang/String;", "setApplicationNumber", "(Ljava/lang/String;)V", "applicationNumber", "Lcom/zepto/yk1;", "H", "Lcom/zepto/yk1;", "viewModel", "I", "o1", "H1", "dlValue", "J", "p1", "I1", "dobValue", "K", "getFatherName", "J1", "fatherName", "L", "getClName", "F1", "clName", "M", "n1", "G1", "clPhoto", "N", "u1", "O1", "rtoCode", "O", "getStateCode", "S1", "stateCode", "P", "v1", "P1", "rtoName", "Q", "s1", "M1", "Mobile_no", "Lcom/zepto/wl5;", "R", "Lcom/zepto/wl5;", "w1", "()Lcom/zepto/wl5;", "Q1", "(Lcom/zepto/wl5;)V", "sarthiSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class NewClSubmitScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ud mBinding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String applicationNumber = "";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public yk1 viewModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String dlValue;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String dobValue;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String fatherName;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String clName;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String clPhoto;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String rtoCode;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String stateCode;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String rtoName;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String Mobile_no;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public wl5 sarthiSession;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(DlApplStatusDto dlApplStatusDto) {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            NewClSubmitScreen.this.q1().D.c(false);
            if (!StringsKt__StringsJVMKt.equals$default(dlApplStatusDto.getStatusCode(), "00", false, 2, null) || (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) == null || !(!applStatusDetails.isEmpty()) || (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) == null || (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) == null || !(!applFlowStatusList.isEmpty())) {
                return;
            }
            NewClSubmitScreen.this.T1(applStatusDetailsItem.getApplFlowStatusList());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DlApplStatusDto) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.a = function;
        }

        @Override // com.zepto.mf4
        public final /* synthetic */ void a(Object obj) {
            this.a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof mf4) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public static final void B1(NewClSubmitScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (st6.e(this$0)) {
            ConstraintLayout containerCl = this$0.q1().x;
            Intrinsics.checkNotNullExpressionValue(containerCl, "containerCl");
            this$0.z1(containerCl);
        }
    }

    public static final void C1(NewClSubmitScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.q1().D.c(true);
        yk1 yk1Var = this$0.viewModel;
        if (yk1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            yk1Var = null;
        }
        yk1Var.i(this$0.applicationNumber, String.valueOf(this$0.m1(this$0.p1(), "dd-MM-yyyy", "dd/MM/yyyy")));
    }

    private final void D1(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.y54
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewClSubmitScreen.E1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void E1(Dialog d, NewClSubmitScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T1(List applFlowStatusList) {
        Integer acCd;
        int size = applFlowStatusList.size();
        for (int i = 0; i < size; i++) {
            Object obj = applFlowStatusList.get(i);
            Intrinsics.checkNotNull(obj);
            if (Intrinsics.areEqual(((ApplFlowStatusListItem) obj).getStatus(), "Pending")) {
                Object obj2 = applFlowStatusList.get(i);
                Intrinsics.checkNotNull(obj2);
                Integer acCd2 = ((ApplFlowStatusListItem) obj2).getAcCd();
                if (acCd2 == null || acCd2.intValue() != 455) {
                    Object obj3 = applFlowStatusList.get(i);
                    Intrinsics.checkNotNull(obj3);
                    acCd = ((ApplFlowStatusListItem) obj3).getAcCd();
                    break;
                }
            }
        }
        acCd = null;
        if (acCd == null) {
            new DLServiceFinalSubmitedActivity().G1(this);
        } else {
            A1(acCd);
        }
    }

    private final void V1() {
        try {
            Intent intent = new Intent(this, (Class<?>) ClDocumentsUpload.class);
            intent.putExtra("dl_st_appl_ackno_no", this.applicationNumber);
            intent.putExtra("dl_st_appl_ackno_no_dob", p1());
            intent.putExtra("DL", o1());
            intent.putExtra("dob", p1());
            intent.putExtra("Mobile_no", s1());
            intent.putExtra("lastEndorsedRTO", v1());
            intent.putExtra("lastEndorsedRTOCode", u1());
            intent.putExtra("clPhoto", n1());
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void W1() {
        try {
            Intent intent = new Intent(this, (Class<?>) ClFeePayment.class);
            intent.putExtra("dl_st_appl_ackno_no", this.applicationNumber);
            intent.putExtra("dl_st_appl_ackno_no_dob", p1());
            intent.putExtra("DL", o1());
            intent.putExtra("dob", p1());
            intent.putExtra("Mobile_no", s1());
            intent.putExtra("lastEndorsedRTO", v1());
            intent.putExtra("lastEndorsedRTOCode", u1());
            intent.putExtra("clPhoto", n1());
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void X1() {
        try {
            Intent intent = new Intent(this, (Class<?>) ClPhotoSignature.class);
            intent.putExtra("dl_st_appl_ackno_no", this.applicationNumber);
            intent.putExtra("dl_st_appl_ackno_no_dob", p1());
            intent.putExtra("DL", o1());
            intent.putExtra("dob", p1());
            intent.putExtra("Mobile_no", s1());
            intent.putExtra("lastEndorsedRTO", v1());
            intent.putExtra("lastEndorsedRTOCode", u1());
            intent.putExtra("clPhoto", n1());
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void Y1() {
        try {
            Intent intent = new Intent(this, (Class<?>) ClSots.class);
            intent.putExtra("dl_st_appl_ackno_no", this.applicationNumber);
            intent.putExtra("dl_st_appl_ackno_no_dob", p1());
            intent.putExtra("DL", o1());
            intent.putExtra("dob", p1());
            intent.putExtra("Mobile_no", s1());
            intent.putExtra("lastEndorsedRTO", v1());
            intent.putExtra("lastEndorsedRTOCode", u1());
            intent.putExtra("clPhoto", n1());
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void y1() {
        L1(this);
        R1(new wa3(r1()));
        Q1(new wl5(r1()));
        N1(new ProgressDialog(r1()));
        t1().setMessage(x1().b("label_challan_please_wait", getString(R.string.please_wait)));
        t1().setCancelable(false);
        t1().setCanceledOnTouchOutside(false);
        q1().F.setText(w1().k());
        this.viewModel = (yk1) new z(this).a(yk1.class);
        try {
            this.applicationNumber = String.valueOf(getIntent().getStringExtra("appNumber"));
            I1(String.valueOf(getIntent().getStringExtra("dobValue")));
            H1(String.valueOf(getIntent().getStringExtra("dlValue")));
            J1(String.valueOf(getIntent().getStringExtra("fatherName")));
            F1(String.valueOf(getIntent().getStringExtra("clName")));
            G1(String.valueOf(getIntent().getStringExtra("clPhoto")));
            O1(String.valueOf(getIntent().getStringExtra("rtoCode")));
            P1(String.valueOf(getIntent().getStringExtra("rtoName")));
            S1(String.valueOf(getIntent().getStringExtra("stateCode")));
            M1(String.valueOf(getIntent().getStringExtra("Mobile_no")));
            q1().F.setText(w1().k());
        } catch (Exception unused) {
        }
        yk1 yk1Var = this.viewModel;
        if (yk1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            yk1Var = null;
        }
        yk1Var.k().g(this, new b(new a()));
    }

    public final void A1(Integer acCd) {
        if (acCd != null && acCd.intValue() == 135) {
            X1();
            return;
        }
        if (acCd != null && acCd.intValue() == 134) {
            W1();
            return;
        }
        if (acCd != null && acCd.intValue() == 123) {
            V1();
            return;
        }
        if (acCd != null && acCd.intValue() == 371) {
            Y1();
        } else if (acCd != null && acCd.intValue() == 455) {
            D1(x1().b("label_e_sign", getString(R.string.esign)));
        }
    }

    public final void F1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clName = str;
    }

    public final void G1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clPhoto = str;
    }

    public final void H1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dlValue = str;
    }

    public final void I1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dobValue = str;
    }

    public final void J1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fatherName = str;
    }

    public final void K1(ud udVar) {
        Intrinsics.checkNotNullParameter(udVar, "<set-?>");
        this.mBinding = udVar;
    }

    public final void L1(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void M1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.Mobile_no = str;
    }

    public final void N1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void O1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoCode = str;
    }

    public final void P1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoName = str;
    }

    public final void Q1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final void R1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final void S1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCode = str;
    }

    public final void U1(File file) {
        Uri uriF = FileProvider.f(this, "com.nic.mparivahan.provider", file);
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriF, "image/*");
            intent.setFlags(67108864);
            intent.addFlags(1);
            startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(this, x1().b("popup_pdf_error", getString(R.string.pdf_error)), 1).show();
        }
    }

    public final String m1(String fdate, String inFormType, String outFormType) {
        Intrinsics.checkNotNullParameter(inFormType, "inFormType");
        Intrinsics.checkNotNullParameter(outFormType, "outFormType");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(inFormType);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(outFormType);
        try {
            Date date = simpleDateFormat.parse(fdate);
            Intrinsics.checkNotNullExpressionValue(date, "parse(...)");
            return simpleDateFormat2.format(date);
        } catch (ParseException unused) {
            return null;
        }
    }

    public final String n1() {
        String str = this.clPhoto;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clPhoto");
        return null;
    }

    public final String o1() {
        String str = this.dlValue;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlValue");
        return null;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ud udVarX = ud.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(udVarX, "inflate(...)");
        K1(udVarX);
        setContentView(q1().m());
        y1();
        ta3.a.Y1(this, q1());
        if (StringsKt__StringsJVMKt.equals(this.applicationNumber, "", true)) {
            q1().w.setText(x1().b("label_app_for_four", getString(R.string.lbl4)));
        } else {
            String str = x1().b("label_app_for_four", getString(R.string.lbl4)) + '\n' + x1().b("label_app_for_three", getString(R.string.lbl3));
            q1().w.setText(str + ' ' + this.applicationNumber);
        }
        q1().E.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.w54
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewClSubmitScreen.B1(this.a, view);
            }
        });
        q1().D.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.x54
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewClSubmitScreen.C1(this.a, view);
            }
        });
    }

    public final String p1() {
        String str = this.dobValue;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dobValue");
        return null;
    }

    public final ud q1() {
        ud udVar = this.mBinding;
        if (udVar != null) {
            return udVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    public final Context r1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final String s1() {
        String str = this.Mobile_no;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("Mobile_no");
        return null;
    }

    public final ProgressDialog t1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String u1() {
        String str = this.rtoCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rtoCode");
        return null;
    }

    public final String v1() {
        String str = this.rtoName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rtoName");
        return null;
    }

    public final wl5 w1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final wa3 x1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final void z1(ConstraintLayout containerView) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(containerView.getWidth(), containerView.getHeight(), Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            containerView.draw(new Canvas(bitmapCreateBitmap));
            String str = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "//";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(str + "screenshot" + this.applicationNumber + ".png");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 70, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            U1(file2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
