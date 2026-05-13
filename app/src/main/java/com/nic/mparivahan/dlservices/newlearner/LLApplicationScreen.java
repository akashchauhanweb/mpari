package com.nic.mparivahan.dlservices.newlearner;

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
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.ApplFlowStatusListItem;
import com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.newlearner.LLApplicationScreen;
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
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b^\u0010_J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\r\u001a\u00020\u00022\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\u0012\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0012\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0015J\b\u0010\u0018\u001a\u00020\u0002H\u0017J\u0017\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010C\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010G\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010>\u001a\u0004\bE\u0010@\"\u0004\bF\u0010BR\u0016\u0010K\u001a\u00020H8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bI\u0010JR\"\u0010S\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0016\u0010U\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010>R\u0016\u0010W\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010>R\u0016\u0010Y\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010>R\u0016\u0010[\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010>R\u0016\u0010]\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010>¨\u0006`"}, d2 = {"Lcom/nic/mparivahan/dlservices/newlearner/LLApplicationScreen;", "Lcom/zepto/pq;", "", "t1", "Landroidx/constraintlayout/widget/ConstraintLayout;", "containerView", "v1", "Ljava/io/File;", "file", "I1", "", "Lcom/nic/mparivahan/dlservices/data/model/ApplFlowStatusListItem;", "applFlowStatusList", "H1", "L1", "J1", "K1", "M1", "", "message", "z1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "", "acCd", "w1", "(Ljava/lang/Integer;)V", "Lcom/zepto/g9;", "C", "Lcom/zepto/g9;", "o1", "()Lcom/zepto/g9;", "C1", "(Lcom/zepto/g9;)V", "mBinding", "Landroid/content/Context;", "D", "Landroid/content/Context;", "p1", "()Landroid/content/Context;", "D1", "(Landroid/content/Context;)V", "mContext", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "q1", "()Landroid/app/ProgressDialog;", "E1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/wa3;", "F", "Lcom/zepto/wa3;", "s1", "()Lcom/zepto/wa3;", "G1", "(Lcom/zepto/wa3;)V", "session", "G", "Ljava/lang/String;", "getApplicationNumber", "()Ljava/lang/String;", "setApplicationNumber", "(Ljava/lang/String;)V", "applicationNumber", "H", "n1", "B1", "dobValue", "Lcom/zepto/yk1;", "I", "Lcom/zepto/yk1;", "viewModel", "Lcom/zepto/wl5;", "J", "Lcom/zepto/wl5;", "r1", "()Lcom/zepto/wl5;", "F1", "(Lcom/zepto/wl5;)V", "sarthiSession", "K", "rtoCode", "L", "stateCode", "M", "rtoName", "N", "Mobile_no", "O", "aadharPhoto", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class LLApplicationScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public g9 mBinding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String dobValue;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public yk1 viewModel;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String applicationNumber = "";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String rtoCode = "";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String stateCode = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String rtoName = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String Mobile_no = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String aadharPhoto = "";

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(DlApplStatusDto dlApplStatusDto) {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            LLApplicationScreen.this.o1().D.c(false);
            if (!StringsKt__StringsJVMKt.equals$default(dlApplStatusDto.getStatusCode(), "00", false, 2, null) || (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) == null || !(!applStatusDetails.isEmpty()) || (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) == null || (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) == null || !(!applFlowStatusList.isEmpty())) {
                return;
            }
            LLApplicationScreen.this.H1(applStatusDetailsItem.getApplFlowStatusList());
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

    public static final void A1(Dialog d, LLApplicationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H1(List applFlowStatusList) {
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
            w1(acCd);
        }
    }

    private final void I1(File file) {
        Uri uriF = FileProvider.f(this, "com.nic.mparivahan.provider", file);
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriF, "image/*");
            intent.setFlags(67108864);
            intent.addFlags(1);
            startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(this, s1().b("popup_pdf_error", getString(R.string.pdf_error)), 1).show();
        }
    }

    private final void J1() {
        try {
            Intent intent = new Intent(this, (Class<?>) LLDocUpload.class);
            intent.putExtra("dl_st_appl_ackno_no", this.applicationNumber);
            intent.putExtra("dl_st_appl_ackno_no_dob", n1());
            intent.putExtra("dob", n1());
            intent.putExtra("Mobile_no", this.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this.rtoName);
            intent.putExtra("lastEndorsedRTOCode", this.rtoCode);
            intent.putExtra("aadharPhoto", this.aadharPhoto);
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void K1() {
        try {
            Intent intent = new Intent(this, (Class<?>) LLFeePayment.class);
            intent.putExtra("dl_st_appl_ackno_no", this.applicationNumber);
            intent.putExtra("dl_st_appl_ackno_no_dob", n1());
            intent.putExtra("dob", n1());
            intent.putExtra("Mobile_no", this.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this.rtoName);
            intent.putExtra("lastEndorsedRTOCode", this.rtoCode);
            intent.putExtra("aadharPhoto", this.aadharPhoto);
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void L1() {
        try {
            Intent intent = new Intent(this, (Class<?>) LLPhotoSign.class);
            intent.putExtra("dl_st_appl_ackno_no", this.applicationNumber);
            intent.putExtra("dl_st_appl_ackno_no_dob", n1());
            intent.putExtra("dob", n1());
            intent.putExtra("Mobile_no", this.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this.rtoName);
            intent.putExtra("lastEndorsedRTOCode", this.rtoCode);
            intent.putExtra("aadharPhoto", this.aadharPhoto);
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void M1() {
        try {
            Intent intent = new Intent(this, (Class<?>) LLSlots.class);
            intent.putExtra("dl_st_appl_ackno_no", this.applicationNumber);
            intent.putExtra("dl_st_appl_ackno_no_dob", n1());
            intent.putExtra("dob", n1());
            intent.putExtra("Mobile_no", this.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this.rtoName);
            intent.putExtra("lastEndorsedRTOCode", this.rtoCode);
            intent.putExtra("aadharPhoto", this.aadharPhoto);
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void t1() {
        D1(this);
        G1(new wa3(p1()));
        F1(new wl5(p1()));
        E1(new ProgressDialog(p1()));
        q1().setMessage(s1().b("label_challan_please_wait", getString(R.string.please_wait)));
        q1().setCancelable(false);
        q1().setCanceledOnTouchOutside(false);
        this.viewModel = (yk1) new z(this).a(yk1.class);
        try {
            this.applicationNumber = String.valueOf(getIntent().getStringExtra("appNumber"));
            B1(String.valueOf(getIntent().getStringExtra("dobValue")));
            String stringExtra = getIntent().getStringExtra("mobileNo");
            Intrinsics.checkNotNull(stringExtra);
            this.Mobile_no = stringExtra;
            String stringExtra2 = getIntent().getStringExtra("rtoName");
            Intrinsics.checkNotNull(stringExtra2);
            this.rtoName = stringExtra2;
            String stringExtra3 = getIntent().getStringExtra("rtoCd");
            Intrinsics.checkNotNull(stringExtra3);
            this.rtoCode = stringExtra3;
            String stringExtra4 = getIntent().getStringExtra("stateCd");
            Intrinsics.checkNotNull(stringExtra4);
            this.stateCode = stringExtra4;
            String stringExtra5 = getIntent().getStringExtra("aadharPhoto");
            Intrinsics.checkNotNull(stringExtra5);
            this.aadharPhoto = stringExtra5;
            o1().F.setText(r1().k());
        } catch (Exception e) {
            e.printStackTrace();
        }
        yk1 yk1Var = this.viewModel;
        if (yk1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            yk1Var = null;
        }
        yk1Var.l().g(this, new b(new a()));
        o1().B.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.s73
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLApplicationScreen.u1(this.a, view);
            }
        });
    }

    public static final void u1(LLApplicationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    private final void v1(ConstraintLayout containerView) {
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
            I1(file2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static final void x1(LLApplicationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (st6.e(this$0)) {
            ConstraintLayout containerCl = this$0.o1().x;
            Intrinsics.checkNotNullExpressionValue(containerCl, "containerCl");
            this$0.v1(containerCl);
        }
    }

    public static final void y1(LLApplicationScreen this$0, View view) {
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

    private final void z1(String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.t73
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLApplicationScreen.A1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final void B1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dobValue = str;
    }

    public final void C1(g9 g9Var) {
        Intrinsics.checkNotNullParameter(g9Var, "<set-?>");
        this.mBinding = g9Var;
    }

    public final void D1(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void E1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void F1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final void G1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
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
        g9 g9VarX = g9.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(g9VarX, "inflate(...)");
        C1(g9VarX);
        setContentView(o1().m());
        t1();
        if (StringsKt__StringsJVMKt.equals(this.applicationNumber, "", true)) {
            o1().w.setText(s1().b("label_app_for_four", getString(R.string.lbl4)));
        } else {
            String str = s1().b("label_app_for_four", getString(R.string.lbl4)) + '\n' + s1().b("label_app_for_three", getString(R.string.lbl3));
            o1().w.setText(str + ' ' + this.applicationNumber);
        }
        o1().E.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.q73
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLApplicationScreen.x1(this.a, view);
            }
        });
        o1().D.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.r73
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLApplicationScreen.y1(this.a, view);
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

    public final ProgressDialog q1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final wl5 r1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final wa3 s1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final void w1(Integer acCd) {
        if (acCd != null && acCd.intValue() == 135) {
            L1();
            return;
        }
        if (acCd != null && acCd.intValue() == 134) {
            K1();
            return;
        }
        if (acCd != null && acCd.intValue() == 123) {
            J1();
            return;
        }
        if ((acCd != null && acCd.intValue() == 371) || (acCd != null && acCd.intValue() == 132)) {
            M1();
        } else if (acCd != null && acCd.intValue() == 455) {
            z1(s1().b("label_e_sign", getString(R.string.esign)));
        }
    }
}
