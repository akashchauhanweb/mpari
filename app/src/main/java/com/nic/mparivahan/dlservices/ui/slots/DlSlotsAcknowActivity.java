package com.nic.mparivahan.dlservices.ui.slots;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.ApplFlowStatusListItem;
import com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.ui.DLServiceFinalSubmitedActivity;
import com.nic.mparivahan.dlservices.ui.dms.DlDocActivity;
import com.nic.mparivahan.dlservices.ui.payment.DLRenewalFeePaymentActivity;
import com.nic.mparivahan.dlservices.ui.photoandsign.DlPhotoAndSignatureActivity;
import com.nic.mparivahan.dlservices.ui.slots.DlSlotsAcknowActivity;
import com.zepto.kd1;
import com.zepto.lq7;
import com.zepto.mf4;
import com.zepto.na;
import com.zepto.o40;
import com.zepto.ta3;
import com.zepto.va3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.yk1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
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
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bo\u0010pJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\r\u001a\u00020\u00022\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0002J\u0012\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002J\u0012\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eJ\u0006\u0010\u001a\u001a\u00020\u0002J\u0017\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010$\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001b2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u0010/R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010@\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010/\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020\u001b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bE\u00101R$\u0010J\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010/\u001a\u0004\bH\u0010=\"\u0004\bI\u0010?R$\u0010N\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010/\u001a\u0004\bL\u0010=\"\u0004\bM\u0010?R$\u0010R\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010/\u001a\u0004\bP\u0010=\"\u0004\bQ\u0010?R\"\u0010V\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010/\u001a\u0004\bT\u0010=\"\u0004\bU\u0010?R\"\u0010Z\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010/\u001a\u0004\bX\u0010=\"\u0004\bY\u0010?R\"\u0010^\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010/\u001a\u0004\b\\\u0010=\"\u0004\b]\u0010?R\"\u0010f\u001a\u00020_8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010n\u001a\u00020g8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010m¨\u0006q"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/slots/DlSlotsAcknowActivity;", "Lcom/zepto/o40;", "", "N1", "O1", "P1", "Landroid/content/Context;", "context", "J1", "U1", "", "Lcom/nic/mparivahan/dlservices/data/model/ApplFlowStatusListItem;", "applFlowStatusList", "c2", "", "message", "W1", "f2", "d2", "e2", "g2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "fdate", "I1", "Y1", "", "acCd", "T1", "(Ljava/lang/Integer;)V", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Lcom/zepto/na;", "F", "Lcom/zepto/na;", "mBinding", "Lcom/zepto/yk1;", "G", "Lcom/zepto/yk1;", "viewModel", "H", "Ljava/lang/String;", "mApplNo", "I", "mApplDob", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "J", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "K1", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "Z1", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "dlDetails", "K", "getLastEndorseRTOCode", "()Ljava/lang/String;", "setLastEndorseRTOCode", "(Ljava/lang/String;)V", "lastEndorseRTOCode", "Landroid/app/ProgressDialog;", "L", "Landroid/app/ProgressDialog;", "pDialog", "M", "PERMISSION_CODE_READ_EXTERNAL_STORAGE", "N", "getDlNo", "setDlNo", "dlNo", "O", "getDob", "setDob", "dob", "P", "getMobile_no", "setMobile_no", "Mobile_no", "Q", "getLastEndorseRto", "setLastEndorseRto", "lastEndorseRto", "R", "getLastEndorseState", "setLastEndorseState", "lastEndorseState", "S", "getLastEndorseStateCode", "setLastEndorseStateCode", "lastEndorseStateCode", "Lcom/zepto/wa3;", "T", "Lcom/zepto/wa3;", "L1", "()Lcom/zepto/wa3;", "a2", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/wl5;", "U", "Lcom/zepto/wl5;", "M1", "()Lcom/zepto/wl5;", "b2", "(Lcom/zepto/wl5;)V", "sarthiSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class DlSlotsAcknowActivity extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public na mBinding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public yk1 viewModel;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String mApplNo;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String mApplDob;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public DldetobjX dlDetails;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String lastEndorseRTOCode;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public final int PERMISSION_CODE_READ_EXTERNAL_STORAGE = 5001;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String dlNo = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String dob = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String Mobile_no = "";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String lastEndorseRto = "";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String lastEndorseState = "";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String lastEndorseStateCode = "";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public wl5 sarthiSession;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(DlApplStatusDto dlApplStatusDto) {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            na naVar = DlSlotsAcknowActivity.this.mBinding;
            if (naVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                naVar = null;
            }
            naVar.E.c(false);
            if (!StringsKt__StringsJVMKt.equals$default(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, null) || dlApplStatusDto == null || (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) == null || !(!applStatusDetails.isEmpty()) || (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) == null || (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) == null || !(!applFlowStatusList.isEmpty())) {
                return;
            }
            DlSlotsAcknowActivity.this.c2(applStatusDetailsItem.getApplFlowStatusList());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DlApplStatusDto) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(JSONObject jSONObject) {
            ProgressDialog progressDialog = DlSlotsAcknowActivity.this.pDialog;
            String str = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog = null;
            }
            progressDialog.dismiss();
            if (jSONObject != null) {
                try {
                    ProgressDialog progressDialog2 = DlSlotsAcknowActivity.this.pDialog;
                    if (progressDialog2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                        progressDialog2 = null;
                    }
                    progressDialog2.dismiss();
                    if (jSONObject.has("Reportdets")) {
                        String str2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/";
                        File file = new File(str2);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        String str3 = DlSlotsAcknowActivity.this.mApplNo;
                        if (str3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                        } else {
                            str = str3;
                        }
                        sb.append(str);
                        sb.append(".pdf");
                        File file2 = new File(sb.toString());
                        byte[] bArrDecode = Base64.decode(jSONObject.getString("Reportdets"), 0);
                        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                        Log.v("Decode", bArrDecode.toString());
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        fileOutputStream.write(bArrDecode);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        DlSlotsAcknowActivity dlSlotsAcknowActivity = DlSlotsAcknowActivity.this;
                        dlSlotsAcknowActivity.U1(dlSlotsAcknowActivity);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((JSONObject) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public c(Function1 function) {
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

    private final void J1(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString());
        sb.append("/mParivahan_doc/");
        String str = this.mApplNo;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
            str = null;
        }
        sb.append(str);
        sb.append(".pdf");
        Uri uriF = FileProvider.f(context, "com.nic.mparivahan.provider", new File(sb.toString()));
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriF, "application/pdf");
            intent.setFlags(67108864);
            intent.addFlags(1);
            context.startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(context, L1().b("label_no_app_avl_pdf", ""), 1).show();
        }
    }

    private final void N1() {
        if (getIntent() != null) {
            Bundle extras = getIntent().getExtras();
            na naVar = null;
            this.mApplNo = String.valueOf(extras != null ? extras.get("dl_st_appl_ackno_no") : null);
            Bundle extras2 = getIntent().getExtras();
            this.mApplDob = String.valueOf(extras2 != null ? extras2.get("dl_st_appl_ackno_no_dob") : null);
            Bundle extras3 = getIntent().getExtras();
            Serializable serializable = extras3 != null ? extras3.getSerializable("dl_st_dl_details_obj") : null;
            Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
            Z1((DldetobjX) serializable);
            Bundle extras4 = getIntent().getExtras();
            Object obj = extras4 != null ? extras4.get("slot-date") : null;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            Bundle extras5 = getIntent().getExtras();
            Object obj2 = extras5 != null ? extras5.get("slot-time") : null;
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj2;
            na naVar2 = this.mBinding;
            if (naVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                naVar2 = null;
            }
            naVar2.w.setText(str);
            na naVar3 = this.mBinding;
            if (naVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                naVar = naVar3;
            }
            naVar.x.setText(str2);
        }
    }

    private final void O1() {
        yk1 yk1Var = (yk1) new z(this).a(yk1.class);
        this.viewModel = yk1Var;
        if (yk1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            yk1Var = null;
        }
        yk1Var.l().g(this, new c(new a()));
    }

    private final void P1() {
        na naVar = this.mBinding;
        yk1 yk1Var = null;
        if (naVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            naVar = null;
        }
        naVar.A.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sr1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlSlotsAcknowActivity.Q1(this.a, view);
            }
        });
        na naVar2 = this.mBinding;
        if (naVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            naVar2 = null;
        }
        naVar2.E.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tr1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlSlotsAcknowActivity.R1(this.a, view);
            }
        });
        na naVar3 = this.mBinding;
        if (naVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            naVar3 = null;
        }
        naVar3.B.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ur1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlSlotsAcknowActivity.S1(this.a, view);
            }
        });
        yk1 yk1Var2 = this.viewModel;
        if (yk1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            yk1Var = yk1Var2;
        }
        yk1Var.j().g(this, new c(new b()));
    }

    public static final void Q1(DlSlotsAcknowActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
            this$0.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, this$0.PERMISSION_CODE_READ_EXTERNAL_STORAGE);
        } else {
            this$0.Y1();
        }
    }

    public static final void R1(DlSlotsAcknowActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.L1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        String str = this$0.mApplDob;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
            str = null;
        }
        String strI1 = this$0.I1(str);
        if (strI1 != null) {
            na naVar = this$0.mBinding;
            if (naVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                naVar = null;
            }
            naVar.E.c(true);
            yk1 yk1Var = this$0.viewModel;
            if (yk1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                yk1Var = null;
            }
            String str3 = this$0.mApplNo;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
            } else {
                str2 = str3;
            }
            yk1Var.h(str2, strI1);
        }
    }

    public static final void S1(DlSlotsAcknowActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U1(Context context) {
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        textView.setText(L1().b(va3.a.c(), "Open PDF"));
        ((TextView) viewFindViewById).setText(L1().b("label_pdf_saved_in_download", getString(R.string.pdf_file_Save)));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vr1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlSlotsAcknowActivity.V1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void V1(Dialog d, DlSlotsAcknowActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.J1(this$0);
    }

    private final void W1(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(L1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(L1().b("btn_dl_serv_next", "Next"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rr1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlSlotsAcknowActivity.X1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void X1(Dialog d, DlSlotsAcknowActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c2(List applFlowStatusList) {
        Integer acCd;
        int size = applFlowStatusList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                acCd = null;
                break;
            }
            Object obj = applFlowStatusList.get(i);
            Intrinsics.checkNotNull(obj);
            if (Intrinsics.areEqual(((ApplFlowStatusListItem) obj).getStatus(), "Pending")) {
                Object obj2 = applFlowStatusList.get(i);
                Intrinsics.checkNotNull(obj2);
                acCd = ((ApplFlowStatusListItem) obj2).getAcCd();
                break;
            }
            i++;
        }
        if (acCd == null) {
            new DLServiceFinalSubmitedActivity().G1(this);
        } else {
            T1(acCd);
        }
    }

    private final void d2() {
        Intent intent = new Intent(this, (Class<?>) DlDocActivity.class);
        String str = this.mApplNo;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
            str = null;
        }
        intent.putExtra("dl_st_appl_ackno_no", str);
        String str3 = this.mApplDob;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
        } else {
            str2 = str3;
        }
        intent.putExtra("dl_st_appl_ackno_no_dob", str2);
        intent.putExtra("dl_st_dl_details_obj", K1());
        intent.putExtra("DL", this.dlNo);
        intent.putExtra("dob", this.dob);
        intent.putExtra("DLDetails", K1());
        intent.putExtra("Mobile_no", this.Mobile_no);
        intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
        intent.putExtra("lastEndorsedState", this.lastEndorseState);
        intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
        intent.putExtra("lastEndorseStateCode", this.lastEndorseStateCode);
        startActivity(intent);
        finish();
    }

    private final void e2() {
        Intent intent = new Intent(this, (Class<?>) DLRenewalFeePaymentActivity.class);
        String str = this.mApplNo;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
            str = null;
        }
        intent.putExtra("dl_st_appl_ackno_no", str);
        String str3 = this.mApplDob;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
        } else {
            str2 = str3;
        }
        intent.putExtra("dl_st_appl_ackno_no_dob", str2);
        intent.putExtra("dl_st_dl_details_obj", K1());
        intent.putExtra("DL", this.dlNo);
        intent.putExtra("dob", this.dob);
        intent.putExtra("DLDetails", K1());
        intent.putExtra("Mobile_no", this.Mobile_no);
        intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
        intent.putExtra("lastEndorsedState", this.lastEndorseState);
        intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
        intent.putExtra("lastEndorseStateCode", this.lastEndorseStateCode);
        startActivity(intent);
        finish();
    }

    private final void f2() {
        Intent intent = new Intent(this, (Class<?>) DlPhotoAndSignatureActivity.class);
        String str = this.mApplNo;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
            str = null;
        }
        intent.putExtra("dl_st_appl_ackno_no", str);
        String str3 = this.mApplDob;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
        } else {
            str2 = str3;
        }
        intent.putExtra("dl_st_appl_ackno_no_dob", str2);
        intent.putExtra("dl_st_dl_details_obj", K1());
        intent.putExtra("DL", this.dlNo);
        intent.putExtra("dob", this.dob);
        intent.putExtra("DLDetails", K1());
        intent.putExtra("Mobile_no", this.Mobile_no);
        intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
        intent.putExtra("lastEndorsedState", this.lastEndorseState);
        intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
        intent.putExtra("lastEndorseStateCode", this.lastEndorseStateCode);
        startActivity(intent);
        finish();
    }

    private final void g2() {
        Intent intent = new Intent(this, (Class<?>) DlRenewalSlotsActivity.class);
        String str = this.mApplNo;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
            str = null;
        }
        intent.putExtra("dl_st_appl_ackno_no", str);
        String str3 = this.mApplDob;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
        } else {
            str2 = str3;
        }
        intent.putExtra("dl_st_appl_ackno_no_dob", str2);
        intent.putExtra("dl_st_dl_details_obj", K1());
        intent.putExtra("DL", this.dlNo);
        intent.putExtra("dob", this.dob);
        intent.putExtra("DLDetails", K1());
        intent.putExtra("Mobile_no", this.Mobile_no);
        intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
        intent.putExtra("lastEndorsedState", this.lastEndorseState);
        intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
        intent.putExtra("lastEndorseStateCode", this.lastEndorseStateCode);
        startActivity(intent);
        finish();
    }

    public final String I1(String fdate) {
        Log.e("slot-dob", String.valueOf(fdate));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date date = simpleDateFormat.parse(fdate);
            Intrinsics.checkNotNullExpressionValue(date, "parse(...)");
            return simpleDateFormat2.format(date);
        } catch (ParseException unused) {
            return null;
        }
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

    public final wl5 M1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final void T1(Integer acCd) {
        if (acCd != null && acCd.intValue() == 135) {
            f2();
            return;
        }
        if (acCd != null && acCd.intValue() == 134) {
            e2();
            return;
        }
        if (acCd != null && acCd.intValue() == 123) {
            d2();
            return;
        }
        if (acCd != null && acCd.intValue() == 371) {
            g2();
        } else if (acCd != null && acCd.intValue() == 455) {
            W1(L1().b("label_e_sign", getString(R.string.esign)));
        }
    }

    public final void Y1() {
        try {
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.pDialog = progressDialog;
            progressDialog.setMessage(getResources().getString(R.string.loading_msg));
            ProgressDialog progressDialog2 = this.pDialog;
            String str = null;
            if (progressDialog2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog2 = null;
            }
            progressDialog2.show();
            ProgressDialog progressDialog3 = this.pDialog;
            if (progressDialog3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog3 = null;
            }
            progressDialog3.setCancelable(false);
            ProgressDialog progressDialog4 = this.pDialog;
            if (progressDialog4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog4 = null;
            }
            progressDialog4.setCanceledOnTouchOutside(false);
            yk1 yk1Var = this.viewModel;
            if (yk1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                yk1Var = null;
            }
            String str2 = this.mApplDob;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                str2 = null;
            }
            String str3 = this.mApplNo;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
            } else {
                str = str3;
            }
            yk1Var.g(str2, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void Z1(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dlDetails = dldetobjX;
    }

    public final void a2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void b2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lq7 lq7VarF = kd1.f(this, R.layout.activity_dl_slots_acknow);
        Intrinsics.checkNotNullExpressionValue(lq7VarF, "setContentView(...)");
        na naVar = (na) lq7VarF;
        this.mBinding = naVar;
        ta3.a aVar = ta3.a;
        na naVar2 = null;
        if (naVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            naVar = null;
        }
        aVar.T1(this, naVar);
        a2(new wa3(this));
        b2(new wl5(this));
        N1();
        O1();
        P1();
        na naVar3 = this.mBinding;
        if (naVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            naVar3 = null;
        }
        naVar3.C.e.setVisibility(8);
        na naVar4 = this.mBinding;
        if (naVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            naVar4 = null;
        }
        naVar4.B.g.setVisibility(0);
        na naVar5 = this.mBinding;
        if (naVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            naVar2 = naVar5;
        }
        naVar2.B.g.setText(M1().k());
    }

    @Override // com.zepto.yf2, com.zepto.zt0, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == this.PERMISSION_CODE_READ_EXTERNAL_STORAGE) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                Y1();
            }
        }
    }
}
