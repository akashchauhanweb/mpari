package com.nic.mparivahan.NewDlScreen.DlAcknow;

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
import com.nic.mparivahan.ClServices.View.ClDocumentsUpload;
import com.nic.mparivahan.ClServices.View.ClFeePayment;
import com.nic.mparivahan.ClServices.View.ClPhotoSignature;
import com.nic.mparivahan.ClServices.View.ClSots;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.NewDlScreen.DlAcknow.DlSlotsNext;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.ApplFlowStatusListItem;
import com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.ui.DLServiceFinalSubmitedActivity;
import com.zepto.mf4;
import com.zepto.o40;
import com.zepto.ra;
import com.zepto.va3;
import com.zepto.wa3;
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
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bW\u0010XJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\r\u001a\u00020\u00022\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0002J\u0012\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002J\u0012\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eJ\u0006\u0010\u001a\u001a\u00020\u0002J\u0017\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010$\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001b2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u0010/R$\u00108\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010/\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\u001b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b=\u00101R$\u0010B\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010/\u001a\u0004\b@\u00105\"\u0004\bA\u00107R$\u0010F\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010/\u001a\u0004\bD\u00105\"\u0004\bE\u00107R$\u0010J\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010/\u001a\u0004\bH\u00105\"\u0004\bI\u00107R\"\u0010N\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010/\u001a\u0004\bL\u00105\"\u0004\bM\u00107R\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010U¨\u0006Y"}, d2 = {"Lcom/nic/mparivahan/NewDlScreen/DlAcknow/DlSlotsNext;", "Lcom/zepto/o40;", "", "L1", "M1", "N1", "Landroid/content/Context;", "context", "J1", "S1", "", "Lcom/nic/mparivahan/dlservices/data/model/ApplFlowStatusListItem;", "applFlowStatusList", "Y1", "", "message", "U1", "b2", "Z1", "a2", "c2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "fdate", "I1", "W1", "", "acCd", "R1", "(Ljava/lang/Integer;)V", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Lcom/zepto/ra;", "F", "Lcom/zepto/ra;", "cBinding", "Lcom/zepto/yk1;", "G", "Lcom/zepto/yk1;", "viewModel", "H", "Ljava/lang/String;", "mApplNo", "I", "mApplDob", "J", "getLastEndorseRTOCode", "()Ljava/lang/String;", "setLastEndorseRTOCode", "(Ljava/lang/String;)V", "lastEndorseRTOCode", "Landroid/app/ProgressDialog;", "K", "Landroid/app/ProgressDialog;", "pDialog", "L", "PERMISSION_CODE_READ_EXTERNAL_STORAGE", "M", "getDlNo", "setDlNo", "dlNo", "N", "getDob", "setDob", "dob", "O", "getMobile_no", "setMobile_no", "Mobile_no", "P", "getLastEndorseRto", "setLastEndorseRto", "lastEndorseRto", "Lcom/zepto/wa3;", "Q", "Lcom/zepto/wa3;", "K1", "()Lcom/zepto/wa3;", "X1", "(Lcom/zepto/wa3;)V", "langSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class DlSlotsNext extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ra cBinding;

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
    public wa3 langSession;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(DlApplStatusDto dlApplStatusDto) {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            ra raVar = DlSlotsNext.this.cBinding;
            if (raVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                raVar = null;
            }
            raVar.D.c(false);
            if (!StringsKt__StringsJVMKt.equals$default(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, null) || dlApplStatusDto == null || (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) == null || !(!applStatusDetails.isEmpty()) || (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) == null || (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) == null || !(!applFlowStatusList.isEmpty())) {
                return;
            }
            Log.e("before", applStatusDetailsItem.getApplFlowStatusList().toString());
            DlSlotsNext.this.Y1(applStatusDetailsItem.getApplFlowStatusList());
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
            ProgressDialog progressDialog = DlSlotsNext.this.pDialog;
            String str = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog = null;
            }
            progressDialog.dismiss();
            if (jSONObject != null) {
                try {
                    Log.e("save_slot_pdf_res", jSONObject.toString());
                    ProgressDialog progressDialog2 = DlSlotsNext.this.pDialog;
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
                        String str3 = DlSlotsNext.this.mApplNo;
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
                        DlSlotsNext dlSlotsNext = DlSlotsNext.this;
                        dlSlotsNext.S1(dlSlotsNext);
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
        Log.e("create pdf uri path==>", "" + uriF);
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriF, "application/pdf");
            intent.setFlags(67108864);
            intent.addFlags(1);
            context.startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(context, K1().b("label_no_app_avl_pdf", ""), 1).show();
        }
    }

    private final void L1() {
        if (getIntent() != null) {
            Bundle extras = getIntent().getExtras();
            ra raVar = null;
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
            ra raVar2 = this.cBinding;
            if (raVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                raVar2 = null;
            }
            raVar2.w.setText(str);
            ra raVar3 = this.cBinding;
            if (raVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            } else {
                raVar = raVar3;
            }
            raVar.x.setText(str2);
        }
    }

    private final void M1() {
        yk1 yk1Var = (yk1) new z(this).a(yk1.class);
        this.viewModel = yk1Var;
        if (yk1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            yk1Var = null;
        }
        yk1Var.l().g(this, new c(new a()));
    }

    private final void N1() {
        ra raVar = this.cBinding;
        yk1 yk1Var = null;
        if (raVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            raVar = null;
        }
        raVar.A.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zr1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlSlotsNext.O1(this.a, view);
            }
        });
        ra raVar2 = this.cBinding;
        if (raVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            raVar2 = null;
        }
        raVar2.D.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.as1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlSlotsNext.P1(this.a, view);
            }
        });
        ra raVar3 = this.cBinding;
        if (raVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            raVar3 = null;
        }
        raVar3.B.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bs1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlSlotsNext.Q1(this.a, view);
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

    public static final void O1(DlSlotsNext this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
            this$0.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, this$0.PERMISSION_CODE_READ_EXTERNAL_STORAGE);
        } else {
            this$0.W1();
        }
    }

    public static final void P1(DlSlotsNext this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.K1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 0).show();
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
            ra raVar = this$0.cBinding;
            if (raVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                raVar = null;
            }
            raVar.D.c(true);
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

    public static final void Q1(DlSlotsNext this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S1(Context context) {
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
        textView.setText(K1().b(va3.a.c(), "Open PDF"));
        ((TextView) viewFindViewById).setText(K1().b("label_pdf_saved_in_download", getString(R.string.pdf_file_Save)));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cs1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlSlotsNext.T1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void T1(Dialog d, DlSlotsNext this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.J1(this$0);
    }

    private final void U1(String message) {
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
        ((TextView) viewFindViewById3).setText(K1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(K1().b("btn_dl_serv_next", "Next"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yr1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlSlotsNext.V1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void V1(Dialog d, DlSlotsNext this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y1(List applFlowStatusList) {
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
            R1(acCd);
        }
    }

    private final void Z1() {
        Intent intent = new Intent(this, (Class<?>) ClDocumentsUpload.class);
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
        intent.putExtra("DL", this.dlNo);
        intent.putExtra("dob", this.dob);
        intent.putExtra("Mobile_no", this.Mobile_no);
        intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
        intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
        startActivity(intent);
        finish();
    }

    private final void a2() {
        Intent intent = new Intent(this, (Class<?>) ClFeePayment.class);
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
        intent.putExtra("DL", this.dlNo);
        intent.putExtra("dob", this.dob);
        intent.putExtra("Mobile_no", this.Mobile_no);
        intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
        intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
        startActivity(intent);
        finish();
    }

    private final void b2() {
        Intent intent = new Intent(this, (Class<?>) ClPhotoSignature.class);
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
        intent.putExtra("DL", this.dlNo);
        intent.putExtra("dob", this.dob);
        intent.putExtra("Mobile_no", this.Mobile_no);
        intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
        intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
        startActivity(intent);
        finish();
    }

    private final void c2() {
        Intent intent = new Intent(this, (Class<?>) ClSots.class);
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
        intent.putExtra("DL", this.dlNo);
        intent.putExtra("dob", this.dob);
        intent.putExtra("Mobile_no", this.Mobile_no);
        intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
        intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
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

    public final wa3 K1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final void R1(Integer acCd) {
        if (acCd != null && acCd.intValue() == 135) {
            b2();
            return;
        }
        if (acCd != null && acCd.intValue() == 134) {
            a2();
            return;
        }
        if (acCd != null && acCd.intValue() == 123) {
            Z1();
            return;
        }
        if (acCd != null && acCd.intValue() == 371) {
            c2();
        } else if (acCd != null && acCd.intValue() == 455) {
            U1(K1().b("label_e_sign", getString(R.string.esign)));
        }
    }

    public final void W1() {
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

    public final void X1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ra raVarX = ra.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(raVarX, "inflate(...)");
        this.cBinding = raVarX;
        if (raVarX == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            raVarX = null;
        }
        setContentView(raVarX.m());
        X1(new wa3(this));
        L1();
        M1();
        N1();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == this.PERMISSION_CODE_READ_EXTERNAL_STORAGE) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                W1();
            }
        }
    }
}
