package com.nic.mparivahan.ClServicesMainScreens;

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
import com.nic.mparivahan.ClServicesMainScreens.ClSubmitScreen;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.ApplFlowStatusListItem;
import com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.ui.DLServiceFinalSubmitedActivity;
import com.zepto.i8;
import com.zepto.kt6;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.st6;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.yk1;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
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
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0012\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014J\u0017\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0002H\u0017J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\fH\u0007R\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010E\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0016\u0010I\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010HR\"\u0010M\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010@\u001a\u0004\bK\u0010B\"\u0004\bL\u0010DR\"\u0010Q\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010@\u001a\u0004\bO\u0010B\"\u0004\bP\u0010DR\"\u0010U\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010@\u001a\u0004\bS\u0010B\"\u0004\bT\u0010DR\"\u0010Y\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010@\u001a\u0004\bW\u0010B\"\u0004\bX\u0010DR\"\u0010]\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010@\u001a\u0004\b[\u0010B\"\u0004\b\\\u0010DR\"\u0010a\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010@\u001a\u0004\b_\u0010B\"\u0004\b`\u0010DR\"\u0010e\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010@\u001a\u0004\bc\u0010B\"\u0004\bd\u0010DR\"\u0010i\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010@\u001a\u0004\bg\u0010B\"\u0004\bh\u0010DR\"\u0010m\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010@\u001a\u0004\bk\u0010B\"\u0004\bl\u0010DR\"\u0010q\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010@\u001a\u0004\bo\u0010B\"\u0004\bp\u0010DR\"\u0010u\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010@\u001a\u0004\bs\u0010B\"\u0004\bt\u0010DR\"\u0010y\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010@\u001a\u0004\bw\u0010B\"\u0004\bx\u0010DR\"\u0010}\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bz\u0010@\u001a\u0004\b{\u0010B\"\u0004\b|\u0010DR(\u0010\u0085\u0001\u001a\u00020~8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001¨\u0006\u0088\u0001"}, d2 = {"Lcom/nic/mparivahan/ClServicesMainScreens/ClSubmitScreen;", "Lcom/zepto/pq;", "", "F1", "", "Lcom/nic/mparivahan/dlservices/data/model/ApplFlowStatusListItem;", "applFlowStatusList", "e2", "j2", "h2", "i2", "k2", "", "message", "L1", "Landroidx/constraintlayout/widget/ConstraintLayout;", "containerView", "G1", "Ljava/io/File;", "file", "g2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "acCd", "H1", "(Ljava/lang/Integer;)V", "onBackPressed", "date", "n1", "Lcom/zepto/i8;", "C", "Lcom/zepto/i8;", "w1", "()Lcom/zepto/i8;", "V1", "(Lcom/zepto/i8;)V", "mBinding", "Lcom/zepto/wa3;", "D", "Lcom/zepto/wa3;", "D1", "()Lcom/zepto/wa3;", "c2", "(Lcom/zepto/wa3;)V", "session", "Landroid/content/Context;", "E", "Landroid/content/Context;", "x1", "()Landroid/content/Context;", "W1", "(Landroid/content/Context;)V", "mContext", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "z1", "()Landroid/app/ProgressDialog;", "Y1", "(Landroid/app/ProgressDialog;)V", "pDialog", "G", "Ljava/lang/String;", "getApplicationNumber", "()Ljava/lang/String;", "setApplicationNumber", "(Ljava/lang/String;)V", "applicationNumber", "Lcom/zepto/yk1;", "H", "Lcom/zepto/yk1;", "viewModel", "I", "s1", "R1", "dlValue", "J", "t1", "S1", "dobValue", "K", "u1", "T1", "fatherName", "L", "p1", "O1", "clName", "M", "o1", "N1", "address", "N", "v1", "U1", "issuing_authority", "O", "E1", "f2", "validity", "P", "r1", "Q1", "cl_Status", "Q", "q1", "P1", "clPhoto", "R", "A1", "Z1", "rtoCode", "S", "getStateCode", "d2", "stateCode", "T", "B1", "a2", "rtoName", "U", "y1", "X1", "Mobile_no", "Lcom/zepto/wl5;", "V", "Lcom/zepto/wl5;", "C1", "()Lcom/zepto/wl5;", "b2", "(Lcom/zepto/wl5;)V", "sarthiSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ClSubmitScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public i8 mBinding;

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
    public String address;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String issuing_authority;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String validity;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String cl_Status;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String clPhoto;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String rtoCode;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String stateCode;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String rtoName;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String Mobile_no;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public wl5 sarthiSession;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(DlApplStatusDto dlApplStatusDto) {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            ClSubmitScreen.this.w1().D.c(false);
            if (!StringsKt__StringsJVMKt.equals$default(dlApplStatusDto.getStatusCode(), "00", false, 2, null) || (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) == null || !(!applStatusDetails.isEmpty()) || (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) == null || (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) == null || !(!applFlowStatusList.isEmpty())) {
                return;
            }
            ClSubmitScreen.this.e2(applStatusDetailsItem.getApplFlowStatusList());
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

    private final void F1() {
        W1(this);
        c2(new wa3(x1()));
        b2(new wl5(x1()));
        Y1(new ProgressDialog(x1()));
        z1().setMessage(D1().b("label_challan_please_wait", getString(R.string.please_wait)));
        z1().setCancelable(false);
        z1().setCanceledOnTouchOutside(false);
        this.viewModel = (yk1) new z(this).a(yk1.class);
        try {
            this.applicationNumber = String.valueOf(getIntent().getStringExtra("appNumber"));
            S1(String.valueOf(getIntent().getStringExtra("dobValue")));
            R1(String.valueOf(getIntent().getStringExtra("dlValue")));
            T1(String.valueOf(getIntent().getStringExtra("fatherName")));
            O1(String.valueOf(getIntent().getStringExtra("clName")));
            P1(String.valueOf(getIntent().getStringExtra("clPhoto")));
            Z1(String.valueOf(getIntent().getStringExtra("rtoCode")));
            a2(String.valueOf(getIntent().getStringExtra("rtoName")));
            d2(String.valueOf(getIntent().getStringExtra("stateCode")));
            X1(String.valueOf(getIntent().getStringExtra("Mobile_no")));
            N1(String.valueOf(getIntent().getStringExtra("address")));
            U1(String.valueOf(getIntent().getStringExtra("issuing_authority")));
            f2(String.valueOf(getIntent().getStringExtra("validity")));
            Q1(String.valueOf(getIntent().getStringExtra("cl_Status")));
            w1().F.setText(C1().k());
            String strQ1 = q1();
            if (strQ1 == null || strQ1.length() == 0) {
                w1().C.setVisibility(8);
            } else {
                w1().C.setVisibility(0);
                w1().z.setImageBitmap(kt6.a(q1()));
            }
        } catch (Exception unused) {
        }
        yk1 yk1Var = this.viewModel;
        if (yk1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            yk1Var = null;
        }
        yk1Var.l().g(this, new b(new a()));
    }

    private final void G1(ConstraintLayout containerView) {
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
            g2(file2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static final void I1(ClSubmitScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (st6.e(this$0)) {
            ConstraintLayout containerCl = this$0.w1().x;
            Intrinsics.checkNotNullExpressionValue(containerCl, "containerCl");
            this$0.G1(containerCl);
        }
    }

    public static final void J1(ClSubmitScreen this$0, View view) {
        String strK;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = this$0.applicationNumber;
        if (str == null || (strK = st6.k(this$0.t1(), "yyyy-MM-dd", "dd-MM-yyyy")) == null) {
            return;
        }
        this$0.w1().D.c(true);
        yk1 yk1Var = this$0.viewModel;
        if (yk1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            yk1Var = null;
        }
        yk1Var.h(str, strK);
    }

    public static final void K1(ClSubmitScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    private final void L1(String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClSubmitScreen.M1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void M1(Dialog d, ClSubmitScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e2(List applFlowStatusList) {
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
            H1(acCd);
        }
    }

    private final void g2(File file) {
        Uri uriF = FileProvider.f(this, "com.nic.mparivahan.provider", file);
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriF, "image/*");
            intent.setFlags(67108864);
            intent.addFlags(1);
            startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(this, D1().b("popup_pdf_error", getString(R.string.pdf_error)), 1).show();
        }
    }

    private final void h2() {
        try {
            Intent intent = new Intent(this, (Class<?>) ClDocumentsUpload.class);
            intent.putExtra("dl_st_appl_ackno_no", this.applicationNumber);
            intent.putExtra("dl_st_appl_ackno_no_dob", n1(t1()));
            intent.putExtra("DL", s1());
            intent.putExtra("clPhoto", q1());
            intent.putExtra("dob", n1(t1()));
            intent.putExtra("Mobile_no", y1());
            intent.putExtra("lastEndorsedRTO", B1());
            intent.putExtra("lastEndorsedRTOCode", A1());
            intent.putExtra("fatherName", u1());
            intent.putExtra("clName", p1());
            intent.putExtra("address", o1()).toString();
            intent.putExtra("issuing_authority", v1()).toString();
            intent.putExtra("validity", E1()).toString();
            intent.putExtra("cl_Status", r1()).toString();
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void i2() {
        try {
            Intent intent = new Intent(this, (Class<?>) ClFeePayment.class);
            intent.putExtra("dl_st_appl_ackno_no", this.applicationNumber);
            intent.putExtra("dl_st_appl_ackno_no_dob", n1(t1()));
            intent.putExtra("DL", s1());
            intent.putExtra("clPhoto", q1());
            intent.putExtra("dob", n1(t1()));
            intent.putExtra("Mobile_no", y1());
            intent.putExtra("lastEndorsedRTO", B1());
            intent.putExtra("lastEndorsedRTOCode", A1());
            intent.putExtra("fatherName", u1());
            intent.putExtra("clName", p1());
            intent.putExtra("address", o1()).toString();
            intent.putExtra("issuing_authority", v1()).toString();
            intent.putExtra("validity", E1()).toString();
            intent.putExtra("cl_Status", r1()).toString();
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void j2() {
        try {
            Intent intent = new Intent(this, (Class<?>) ClPhotoSignature.class);
            intent.putExtra("dl_st_appl_ackno_no", this.applicationNumber);
            intent.putExtra("dl_st_appl_ackno_no_dob", n1(t1()));
            intent.putExtra("DL", s1());
            intent.putExtra("dob", n1(t1()));
            intent.putExtra("Mobile_no", y1());
            intent.putExtra("lastEndorsedRTO", B1());
            intent.putExtra("lastEndorsedRTOCode", A1());
            intent.putExtra("clPhoto", q1());
            intent.putExtra("clName", p1());
            intent.putExtra("fatherName", u1());
            intent.putExtra("address", o1()).toString();
            intent.putExtra("issuing_authority", v1()).toString();
            intent.putExtra("validity", E1()).toString();
            intent.putExtra("cl_Status", r1()).toString();
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void k2() {
        try {
            Intent intent = new Intent(this, (Class<?>) ClSots.class);
            intent.putExtra("dl_st_appl_ackno_no", this.applicationNumber);
            intent.putExtra("dl_st_appl_ackno_no_dob", n1(t1()));
            intent.putExtra("DL", s1());
            intent.putExtra("clPhoto", q1());
            intent.putExtra("dob", n1(t1()));
            intent.putExtra("Mobile_no", y1());
            intent.putExtra("lastEndorsedRTO", B1());
            intent.putExtra("lastEndorsedRTOCode", A1());
            intent.putExtra("fatherName", u1());
            intent.putExtra("clName", p1());
            intent.putExtra("address", o1()).toString();
            intent.putExtra("issuing_authority", v1()).toString();
            intent.putExtra("validity", E1()).toString();
            intent.putExtra("cl_Status", r1()).toString();
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public final String A1() {
        String str = this.rtoCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rtoCode");
        return null;
    }

    public final String B1() {
        String str = this.rtoName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rtoName");
        return null;
    }

    public final wl5 C1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final wa3 D1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final String E1() {
        String str = this.validity;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("validity");
        return null;
    }

    public final void H1(Integer acCd) {
        if (acCd != null && acCd.intValue() == 135) {
            j2();
            return;
        }
        if (acCd != null && acCd.intValue() == 134) {
            i2();
            return;
        }
        if (acCd != null && acCd.intValue() == 123) {
            h2();
            return;
        }
        if (acCd != null && acCd.intValue() == 371) {
            k2();
        } else if (acCd != null && acCd.intValue() == 455) {
            L1(D1().b("label_e_sign", getString(R.string.esign)));
        }
    }

    public final void N1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.address = str;
    }

    public final void O1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clName = str;
    }

    public final void P1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clPhoto = str;
    }

    public final void Q1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cl_Status = str;
    }

    public final void R1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dlValue = str;
    }

    public final void S1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dobValue = str;
    }

    public final void T1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fatherName = str;
    }

    public final void U1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.issuing_authority = str;
    }

    public final void V1(i8 i8Var) {
        Intrinsics.checkNotNullParameter(i8Var, "<set-?>");
        this.mBinding = i8Var;
    }

    public final void W1(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void X1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.Mobile_no = str;
    }

    public final void Y1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void Z1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoCode = str;
    }

    public final void a2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoName = str;
    }

    public final void b2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final void c2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final void d2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCode = str;
    }

    public final void f2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.validity = str;
    }

    public final String n1(String date) {
        Intrinsics.checkNotNullParameter(date, "date");
        try {
            String str = new SimpleDateFormat("dd-MM-yyyy").format(new SimpleDateFormat("yyyy-MM-dd").parse(date));
            Intrinsics.checkNotNull(str);
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return n1(date);
        }
    }

    public final String o1() {
        String str = this.address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("address");
        return null;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        i8 i8VarX = i8.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(i8VarX, "inflate(...)");
        V1(i8VarX);
        setContentView(w1().m());
        F1();
        ta3.a.g0(this, w1());
        if (StringsKt__StringsJVMKt.equals(this.applicationNumber, "", true)) {
            w1().w.setText(D1().b("label_app_for_four", getString(R.string.lbl4)));
        } else {
            String str = D1().b("label_app_for_four", getString(R.string.lbl4)) + '\n' + D1().b("label_app_for_three", getString(R.string.lbl3));
            w1().w.setText(str + ' ' + this.applicationNumber);
        }
        w1().E.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClSubmitScreen.I1(this.a, view);
            }
        });
        w1().D.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClSubmitScreen.J1(this.a, view);
            }
        });
        w1().B.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClSubmitScreen.K1(this.a, view);
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
        String str = this.clPhoto;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clPhoto");
        return null;
    }

    public final String r1() {
        String str = this.cl_Status;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cl_Status");
        return null;
    }

    public final String s1() {
        String str = this.dlValue;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlValue");
        return null;
    }

    public final String t1() {
        String str = this.dobValue;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dobValue");
        return null;
    }

    public final String u1() {
        String str = this.fatherName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fatherName");
        return null;
    }

    public final String v1() {
        String str = this.issuing_authority;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("issuing_authority");
        return null;
    }

    public final i8 w1() {
        i8 i8Var = this.mBinding;
        if (i8Var != null) {
            return i8Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    public final Context x1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final String y1() {
        String str = this.Mobile_no;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("Mobile_no");
        return null;
    }

    public final ProgressDialog z1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }
}
