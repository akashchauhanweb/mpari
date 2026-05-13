package com.nic.mparivahan.NewDlScreen.DlAcknow;

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
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.NewDlScreen.DlAcknow.DlApplicationScreen;
import com.nic.mparivahan.NewDlScreen.Modal.LLDetailsResultModal;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.ApplFlowStatusListItem;
import com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.ui.DLServiceFinalSubmitedActivity;
import com.zepto.g9;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.st6;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.yk1;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bl\u0010mJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\r\u001a\u00020\u00022\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\u0012\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J\u0012\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0015J\u0017\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010A\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010E\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010<\u001a\u0004\bC\u0010>\"\u0004\bD\u0010@R\"\u0010I\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010<\u001a\u0004\bG\u0010>\"\u0004\bH\u0010@R\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010LR\"\u0010U\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010Y\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010<\u001a\u0004\bW\u0010>\"\u0004\bX\u0010@R\"\u0010]\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010<\u001a\u0004\b[\u0010>\"\u0004\b\\\u0010@R\"\u0010a\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010<\u001a\u0004\b_\u0010>\"\u0004\b`\u0010@R\"\u0010e\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010<\u001a\u0004\bc\u0010>\"\u0004\bd\u0010@R&\u0010k\u001a\u0012\u0012\u0004\u0012\u00020g0fj\b\u0012\u0004\u0012\u00020g`h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010j¨\u0006n"}, d2 = {"Lcom/nic/mparivahan/NewDlScreen/DlAcknow/DlApplicationScreen;", "Lcom/zepto/pq;", "", "w1", "Landroidx/constraintlayout/widget/ConstraintLayout;", "containerView", "x1", "Ljava/io/File;", "file", "P1", "", "Lcom/nic/mparivahan/dlservices/data/model/ApplFlowStatusListItem;", "applFlowStatusList", "O1", "R1", "Q1", "S1", "", "message", "B1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "acCd", "y1", "(Ljava/lang/Integer;)V", "Lcom/zepto/g9;", "C", "Lcom/zepto/g9;", "o1", "()Lcom/zepto/g9;", "F1", "(Lcom/zepto/g9;)V", "mBinding", "Landroid/content/Context;", "D", "Landroid/content/Context;", "p1", "()Landroid/content/Context;", "G1", "(Landroid/content/Context;)V", "mContext", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "r1", "()Landroid/app/ProgressDialog;", "I1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/wa3;", "F", "Lcom/zepto/wa3;", "v1", "()Lcom/zepto/wa3;", "M1", "(Lcom/zepto/wa3;)V", "session", "G", "Ljava/lang/String;", "getApplicationNumber", "()Ljava/lang/String;", "setApplicationNumber", "(Ljava/lang/String;)V", "applicationNumber", "H", "m1", "D1", "dlValue", "I", "n1", "E1", "dobValue", "Lcom/zepto/yk1;", "J", "Lcom/zepto/yk1;", "viewModel", "Lcom/zepto/wl5;", "K", "Lcom/zepto/wl5;", "u1", "()Lcom/zepto/wl5;", "L1", "(Lcom/zepto/wl5;)V", "sarthiSession", "L", "s1", "J1", "rtoCode", "M", "getStateCode", "N1", "stateCode", "N", "t1", "K1", "rtoName", "O", "q1", "H1", "Mobile_no", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/NewDlScreen/Modal/LLDetailsResultModal;", "Lkotlin/collections/ArrayList;", "P", "Ljava/util/ArrayList;", "llDetails", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class DlApplicationScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public g9 mBinding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String dlValue;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String dobValue;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public yk1 viewModel;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String rtoCode;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String stateCode;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String rtoName;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String Mobile_no;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String applicationNumber = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public ArrayList llDetails = new ArrayList();

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(DlApplStatusDto dlApplStatusDto) {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            DlApplicationScreen.this.o1().D.c(false);
            if (!StringsKt__StringsJVMKt.equals$default(dlApplStatusDto.getStatusCode(), "00", false, 2, null) || (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) == null || !(!applStatusDetails.isEmpty()) || (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) == null || (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) == null || !(!applFlowStatusList.isEmpty())) {
                return;
            }
            DlApplicationScreen.this.O1(applStatusDetailsItem.getApplFlowStatusList());
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

    public static final void A1(DlApplicationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = this$0.applicationNumber;
        this$0.o1().D.c(true);
        yk1 yk1Var = this$0.viewModel;
        if (yk1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            yk1Var = null;
        }
        yk1Var.h(str, this$0.n1());
    }

    private final void B1(String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bl1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlApplicationScreen.C1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void C1(Dialog d, DlApplicationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O1(List applFlowStatusList) {
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
            y1(acCd);
        }
    }

    private final void P1(File file) {
        Uri uriF = FileProvider.f(this, "com.nic.mparivahan.provider", file);
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriF, "image/*");
            intent.setFlags(67108864);
            intent.addFlags(1);
            startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(this, v1().b("popup_pdf_error", getString(R.string.pdf_error)), 1).show();
        }
    }

    private final void Q1() {
        Intent intent = new Intent(this, (Class<?>) DlDocUpload.class);
        intent.putExtra("dl_st_appl_ackno_no", this.applicationNumber);
        intent.putExtra("dl_st_appl_ackno_no_dob", n1());
        intent.putExtra("DL", m1());
        intent.putExtra("dob", n1());
        intent.putExtra("Mobile_no", q1());
        intent.putExtra("lastEndorsedRTO", t1());
        intent.putExtra("lastEndorsedRTOCode", s1());
        startActivity(intent);
    }

    private final void R1() {
        Intent intent = new Intent(this, (Class<?>) DlPhotoSign.class);
        intent.putExtra("dl_st_appl_ackno_no", this.applicationNumber);
        intent.putExtra("dl_st_appl_ackno_no_dob", n1());
        intent.putExtra("DL", m1());
        intent.putExtra("dob", n1());
        intent.putExtra("Mobile_no", q1());
        intent.putExtra("lastEndorsedRTO", t1());
        intent.putExtra("lastEndorsedRTOCode", s1());
        startActivity(intent);
    }

    private final void S1() {
        Intent intent = new Intent(this, (Class<?>) DlSlots.class);
        intent.putExtra("dl_st_appl_ackno_no", this.applicationNumber);
        intent.putExtra("dl_st_appl_ackno_no_dob", n1());
        intent.putExtra("DL", m1());
        intent.putExtra("dob", n1());
        intent.putExtra("Mobile_no", q1());
        intent.putExtra("lastEndorsedRTO", t1());
        intent.putExtra("lastEndorsedRTOCode", s1());
        startActivity(intent);
    }

    private final void w1() {
        G1(this);
        M1(new wa3(p1()));
        L1(new wl5(p1()));
        I1(new ProgressDialog(p1()));
        r1().setMessage(v1().b("label_challan_please_wait", getString(R.string.please_wait)));
        r1().setCancelable(false);
        r1().setCanceledOnTouchOutside(false);
        this.viewModel = (yk1) new z(this).a(yk1.class);
        try {
            if (getIntent().hasExtra("LLDetails")) {
                ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("LLDetails");
                Intrinsics.checkNotNull(parcelableArrayListExtra);
                this.llDetails = parcelableArrayListExtra;
            }
            this.applicationNumber = String.valueOf(getIntent().getStringExtra("appNumber"));
            E1(String.valueOf(getIntent().getStringExtra("dobValue")));
            D1(String.valueOf(getIntent().getStringExtra("dlValue")));
            H1(((LLDetailsResultModal) this.llDetails.get(0)).getMobileNumber());
            K1(((LLDetailsResultModal) this.llDetails.get(0)).getLlFromRTO1().get(0).getRtoName());
            J1(((LLDetailsResultModal) this.llDetails.get(0)).getLlFromRTO1().get(0).getRtoCode());
            N1(((LLDetailsResultModal) this.llDetails.get(0)).getLlFromState1().get(0).getLlFromState1Code());
            o1().F.setText(u1().k());
        } catch (Exception e) {
            e.printStackTrace();
        }
        yk1 yk1Var = this.viewModel;
        if (yk1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            yk1Var = null;
        }
        yk1Var.l().g(this, new b(new a()));
    }

    private final void x1(ConstraintLayout containerView) {
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
            P1(file2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static final void z1(DlApplicationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (st6.e(this$0)) {
            ConstraintLayout containerCl = this$0.o1().x;
            Intrinsics.checkNotNullExpressionValue(containerCl, "containerCl");
            this$0.x1(containerCl);
        }
    }

    public final void D1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dlValue = str;
    }

    public final void E1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dobValue = str;
    }

    public final void F1(g9 g9Var) {
        Intrinsics.checkNotNullParameter(g9Var, "<set-?>");
        this.mBinding = g9Var;
    }

    public final void G1(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void H1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.Mobile_no = str;
    }

    public final void I1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void J1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoCode = str;
    }

    public final void K1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoName = str;
    }

    public final void L1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final void M1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final void N1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCode = str;
    }

    public final String m1() {
        String str = this.dlValue;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlValue");
        return null;
    }

    public final String n1() {
        String str = this.dobValue;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dobValue");
        return null;
    }

    public final g9 o1() {
        g9 g9Var = this.mBinding;
        if (g9Var != null) {
            return g9Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        g9 g9VarX = g9.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(g9VarX, "inflate(...)");
        F1(g9VarX);
        setContentView(o1().m());
        w1();
        if (StringsKt__StringsJVMKt.equals(this.applicationNumber, "", true)) {
            o1().w.setText(v1().b("label_app_for_four", getString(R.string.lbl4)));
        } else {
            String str = v1().b("label_app_for_four", getString(R.string.lbl4)) + '\n' + v1().b("label_app_for_three", getString(R.string.lbl3));
            o1().w.setText(str + ' ' + this.applicationNumber);
        }
        o1().E.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zk1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlApplicationScreen.z1(this.a, view);
            }
        });
        o1().D.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.al1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlApplicationScreen.A1(this.a, view);
            }
        });
    }

    public final Context p1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final String q1() {
        String str = this.Mobile_no;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("Mobile_no");
        return null;
    }

    public final ProgressDialog r1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String s1() {
        String str = this.rtoCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rtoCode");
        return null;
    }

    public final String t1() {
        String str = this.rtoName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rtoName");
        return null;
    }

    public final wl5 u1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final wa3 v1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final void y1(Integer acCd) {
        if (acCd != null && acCd.intValue() == 135) {
            R1();
            return;
        }
        if (acCd != null && acCd.intValue() == 134) {
            Q1();
            return;
        }
        if (acCd != null && acCd.intValue() == 123) {
            Q1();
            return;
        }
        if (acCd != null && acCd.intValue() == 371) {
            S1();
        } else if (acCd != null && acCd.intValue() == 455) {
            B1(v1().b("label_e_sign", getString(R.string.esign)));
        }
    }
}
