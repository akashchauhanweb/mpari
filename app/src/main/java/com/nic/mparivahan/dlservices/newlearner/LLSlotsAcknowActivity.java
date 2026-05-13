package com.nic.mparivahan.dlservices.newlearner;

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
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.data.model.ApplFlowStatusListItem;
import com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.newlearner.LLSlotsAcknowActivity;
import com.nic.mparivahan.dlservices.ui.DLServiceFinalSubmitedActivity;
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
import java.util.ArrayList;
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
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bx\u0010yJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\r\u001a\u00020\u00022\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0002J\u0012\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002J\u0012\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014J\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0007J\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0007J\u0006\u0010\u001b\u001a\u00020\u0002J\u0017\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010%\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001c2\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0!2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00101\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00100R$\u00109\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00100\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020\u001c8\u0002X\u0082D¢\u0006\u0006\n\u0004\b>\u00102R$\u0010C\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u00100\u001a\u0004\bA\u00106\"\u0004\bB\u00108R$\u0010G\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u00100\u001a\u0004\bE\u00106\"\u0004\bF\u00108R$\u0010K\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u00100\u001a\u0004\bI\u00106\"\u0004\bJ\u00108R\"\u0010O\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u00100\u001a\u0004\bM\u00106\"\u0004\bN\u00108R\"\u0010S\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u00100\u001a\u0004\bQ\u00106\"\u0004\bR\u00108R\"\u0010W\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u00100\u001a\u0004\bU\u00106\"\u0004\bV\u00108R\"\u0010[\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u00100\u001a\u0004\bY\u00106\"\u0004\bZ\u00108R\"\u0010c\u001a\u00020\\8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR(\u0010k\u001a\b\u0012\u0004\u0012\u00020\u000e0d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR(\u0010o\u001a\b\u0012\u0004\u0012\u00020\u000e0d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010f\u001a\u0004\bm\u0010h\"\u0004\bn\u0010jR\"\u0010w\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010v¨\u0006z"}, d2 = {"Lcom/nic/mparivahan/dlservices/newlearner/LLSlotsAcknowActivity;", "Lcom/zepto/o40;", "", "N1", "O1", "P1", "Landroid/content/Context;", "context", "K1", "U1", "", "Lcom/nic/mparivahan/dlservices/data/model/ApplFlowStatusListItem;", "applFlowStatusList", "d2", "", "message", "W1", "g2", "e2", "f2", "h2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "fdate", "J1", "I1", "Y1", "", "acCd", "T1", "(Ljava/lang/Integer;)V", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Lcom/zepto/na;", "F", "Lcom/zepto/na;", "mBinding", "Lcom/zepto/yk1;", "G", "Lcom/zepto/yk1;", "viewModel", "H", "Ljava/lang/String;", "mApplNo", "I", "mApplDob", "J", "getLastEndorseRTOCode", "()Ljava/lang/String;", "setLastEndorseRTOCode", "(Ljava/lang/String;)V", "lastEndorseRTOCode", "Landroid/app/ProgressDialog;", "K", "Landroid/app/ProgressDialog;", "pDialog", "L", "PERMISSION_CODE_READ_EXTERNAL_STORAGE", "M", "getDlNo", "setDlNo", "dlNo", "N", "getDob", "setDob", "dob", "O", "getMobile_no", "setMobile_no", "Mobile_no", "P", "getLastEndorseRto", "setLastEndorseRto", "lastEndorseRto", "Q", "getAadharPhoto", "setAadharPhoto", "aadharPhoto", "R", "getLastEndorseState", "setLastEndorseState", "lastEndorseState", "S", "getLastEndorseStateCode", "setLastEndorseStateCode", "lastEndorseStateCode", "Lcom/zepto/wa3;", "T", "Lcom/zepto/wa3;", "L1", "()Lcom/zepto/wa3;", "Z1", "(Lcom/zepto/wa3;)V", "langSession", "Ljava/util/ArrayList;", "U", "Ljava/util/ArrayList;", "getMultiListName", "()Ljava/util/ArrayList;", "b2", "(Ljava/util/ArrayList;)V", "multiListName", "V", "getListHeaderSteps", "a2", "listHeaderSteps", "Lcom/zepto/wl5;", "W", "Lcom/zepto/wl5;", "M1", "()Lcom/zepto/wl5;", "c2", "(Lcom/zepto/wl5;)V", "sarthiSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class LLSlotsAcknowActivity extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public na mBinding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public yk1 viewModel;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String mApplNo;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String mApplDob;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String lastEndorseRTOCode;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public final int PERMISSION_CODE_READ_EXTERNAL_STORAGE = 5001;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String dlNo = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String dob = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String Mobile_no = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String lastEndorseRto = "";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String aadharPhoto = "";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String lastEndorseState = "";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String lastEndorseStateCode = "";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public ArrayList multiListName;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public ArrayList listHeaderSteps;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public wl5 sarthiSession;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(DlApplStatusDto dlApplStatusDto) {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            na naVar = LLSlotsAcknowActivity.this.mBinding;
            if (naVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                naVar = null;
            }
            naVar.E.c(false);
            if (!StringsKt__StringsJVMKt.equals$default(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, null) || dlApplStatusDto == null || (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) == null || !(!applStatusDetails.isEmpty()) || (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) == null || (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) == null || !(!applFlowStatusList.isEmpty())) {
                return;
            }
            Log.e("before", applStatusDetailsItem.getApplFlowStatusList().toString());
            LLSlotsAcknowActivity.this.d2(applStatusDetailsItem.getApplFlowStatusList());
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
            ProgressDialog progressDialog = LLSlotsAcknowActivity.this.pDialog;
            String str = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog = null;
            }
            progressDialog.dismiss();
            if (jSONObject != null) {
                try {
                    Log.e("save_slot_pdf_res", jSONObject.toString());
                    ProgressDialog progressDialog2 = LLSlotsAcknowActivity.this.pDialog;
                    if (progressDialog2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                        progressDialog2 = null;
                    }
                    progressDialog2.dismiss();
                    if (jSONObject.has("Reportdets")) {
                        Log.v("Insode", "true");
                        String str2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/";
                        File file = new File(str2);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        String str3 = LLSlotsAcknowActivity.this.mApplNo;
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
                        LLSlotsAcknowActivity lLSlotsAcknowActivity = LLSlotsAcknowActivity.this;
                        lLSlotsAcknowActivity.U1(lLSlotsAcknowActivity);
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

    private final void K1(Context context) {
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
        Log.e("create pdf uri path==>", "" + uriF);
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
        try {
            na naVar = null;
            if (getIntent() != null) {
                Bundle extras = getIntent().getExtras();
                this.mApplNo = String.valueOf(extras != null ? extras.get("dl_st_appl_ackno_no") : null);
                Bundle extras2 = getIntent().getExtras();
                this.mApplDob = String.valueOf(extras2 != null ? extras2.get("dl_st_appl_ackno_no_dob") : null);
                Bundle extras3 = getIntent().getExtras();
                Object obj = extras3 != null ? extras3.get("slot-date") : null;
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                Bundle extras4 = getIntent().getExtras();
                Object obj2 = extras4 != null ? extras4.get("slot-time") : null;
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
                    naVar3 = null;
                }
                naVar3.x.setText(str2);
                this.dob = String.valueOf(getIntent().getStringExtra("dob"));
                this.Mobile_no = String.valueOf(getIntent().getStringExtra("Mobile_no"));
                String stringExtra = getIntent().getStringExtra("lastEndorsedRTO");
                Intrinsics.checkNotNull(stringExtra, "null cannot be cast to non-null type kotlin.String");
                this.lastEndorseRto = stringExtra;
                String stringExtra2 = getIntent().getStringExtra("aadharPhoto");
                Intrinsics.checkNotNull(stringExtra2);
                this.aadharPhoto = stringExtra2;
                this.lastEndorseRTOCode = String.valueOf(getIntent().getStringExtra("lastEndorseRTOCode"));
            }
            na naVar4 = this.mBinding;
            if (naVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                naVar = naVar4;
            }
            naVar.B.g.setText(M1().k());
        } catch (Exception unused) {
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
        naVar.A.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.y93
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLSlotsAcknowActivity.Q1(this.a, view);
            }
        });
        na naVar2 = this.mBinding;
        if (naVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            naVar2 = null;
        }
        naVar2.E.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.z93
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLSlotsAcknowActivity.R1(this.a, view);
            }
        });
        na naVar3 = this.mBinding;
        if (naVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            naVar3 = null;
        }
        naVar3.B.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.aa3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLSlotsAcknowActivity.S1(this.a, view);
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

    public static final void Q1(LLSlotsAcknowActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
            this$0.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, this$0.PERMISSION_CODE_READ_EXTERNAL_STORAGE);
        } else {
            this$0.Y1();
        }
    }

    public static final void R1(LLSlotsAcknowActivity this$0, View view) {
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
        String strJ1 = this$0.J1(str);
        if (strJ1 != null) {
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
            yk1Var.h(str2, strJ1);
        }
    }

    public static final void S1(LLSlotsAcknowActivity this$0, View view) {
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ba3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLSlotsAcknowActivity.V1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void V1(Dialog d, LLSlotsAcknowActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.K1(this$0);
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.x93
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLSlotsAcknowActivity.X1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void X1(Dialog d, LLSlotsAcknowActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d2(List applFlowStatusList) {
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
                Log.d("error_grv", VContant.MAINSCREEN);
                break;
            }
            i++;
        }
        if (acCd == null) {
            Log.d("error_grv", VContant.APPLICATION_SCREEN);
            new DLServiceFinalSubmitedActivity().G1(this);
        } else {
            Log.d("error_grv", "3");
            T1(acCd);
        }
    }

    private final void e2() {
        try {
            Intent intent = new Intent(this, (Class<?>) LLDocUpload.class);
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
            intent.putExtra("dl_st_appl_ackno_no_dob", I1(str2));
            intent.putExtra("dob", this.dob);
            intent.putExtra("Mobile_no", this.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
            intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
            intent.putExtra("aadharPhoto", this.aadharPhoto);
            startActivity(intent);
            finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void f2() {
        try {
            Intent intent = new Intent(this, (Class<?>) LLFeePayment.class);
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
            intent.putExtra("dl_st_appl_ackno_no_dob", I1(str2));
            intent.putExtra("dob", this.dob);
            intent.putExtra("Mobile_no", this.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
            intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
            intent.putExtra("aadharPhoto", this.aadharPhoto);
            startActivity(intent);
            finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void g2() {
        try {
            Intent intent = new Intent(this, (Class<?>) LLPhotoSign.class);
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
            intent.putExtra("dl_st_appl_ackno_no_dob", I1(str2));
            intent.putExtra("dob", this.dob);
            intent.putExtra("Mobile_no", this.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
            intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
            intent.putExtra("aadharPhoto", this.aadharPhoto);
            startActivity(intent);
            finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void h2() {
        try {
            Intent intent = new Intent(this, (Class<?>) LLSlots.class);
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
            intent.putExtra("aadharPhoto", this.aadharPhoto);
            intent.putExtra("dob", this.dob);
            intent.putExtra("Mobile_no", this.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
            intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
            startActivity(intent);
            finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final String I1(String fdate) {
        Log.e("slot-dob", String.valueOf(fdate));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Intrinsics.checkNotNull(fdate);
            Date date = simpleDateFormat.parse(fdate);
            Intrinsics.checkNotNull(date);
            return simpleDateFormat2.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final String J1(String fdate) {
        Log.e("slot-dob", String.valueOf(fdate));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Intrinsics.checkNotNull(fdate);
            Date date = simpleDateFormat.parse(fdate);
            Intrinsics.checkNotNull(date);
            return simpleDateFormat2.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
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
            g2();
            return;
        }
        if (acCd != null && acCd.intValue() == 134) {
            f2();
            return;
        }
        if (acCd != null && acCd.intValue() == 123) {
            e2();
            return;
        }
        if (acCd != null && acCd.intValue() == 371) {
            h2();
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

    public final void Z1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void a2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.listHeaderSteps = arrayList;
    }

    public final void b2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.multiListName = arrayList;
    }

    public final void c2(wl5 wl5Var) {
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
        if (naVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            naVar = null;
        }
        aVar.T1(this, naVar);
        Z1(new wa3(this));
        c2(new wl5(this));
        N1();
        O1();
        P1();
        if (Intrinsics.areEqual(M1().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                Serializable serializableExtra = getIntent().getSerializableExtra("multiList");
                Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                b2((ArrayList) serializableExtra);
                Serializable serializableExtra2 = getIntent().getSerializableExtra("listHeaderSteps");
                Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                a2((ArrayList) serializableExtra2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
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
