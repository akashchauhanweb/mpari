package com.nic.mparivahan.LLServices.UI;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Base64;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.LLMainScreen.LlDetails;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.LLServices.UI.LlStoltsAck;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.ApplFlowStatusListItem;
import com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.ui.DLServiceFinalSubmitedActivity;
import com.zepto.kd;
import com.zepto.mf4;
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
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bh\u0010iJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\u000e\u001a\u00020\u00022\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0002J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002J\b\u0010\u0015\u001a\u00020\u0002H\u0002J\u0012\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010\u001b\u001a\u00020\u0002J\u0017\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010%\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001c2\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0!2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00101\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00100R$\u00109\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00100\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020\u001c8\u0002X\u0082D¢\u0006\u0006\n\u0004\b>\u00102R$\u0010C\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u00100\u001a\u0004\bA\u00106\"\u0004\bB\u00108R$\u0010G\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u00100\u001a\u0004\bE\u00106\"\u0004\bF\u00108R$\u0010K\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u00100\u001a\u0004\bI\u00106\"\u0004\bJ\u00108R\"\u0010O\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u00100\u001a\u0004\bM\u00106\"\u0004\bN\u00108R\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010f¨\u0006j"}, d2 = {"Lcom/nic/mparivahan/LLServices/UI/LlStoltsAck;", "Lcom/zepto/o40;", "", "V1", "P1", "Q1", "R1", "Landroid/content/Context;", "context", "L1", "Z1", "", "Lcom/nic/mparivahan/dlservices/data/model/ApplFlowStatusListItem;", "applFlowStatusList", "h2", "", "message", "b2", "k2", "i2", "j2", "l2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "fdate", "K1", "d2", "", "acCd", "X1", "(Ljava/lang/Integer;)V", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Lcom/zepto/kd;", "F", "Lcom/zepto/kd;", "cBinding", "Lcom/zepto/yk1;", "G", "Lcom/zepto/yk1;", "viewModel", "H", "Ljava/lang/String;", "mApplNo", "I", "mApplDob", "J", "getLastEndorseRTOCode", "()Ljava/lang/String;", "setLastEndorseRTOCode", "(Ljava/lang/String;)V", "lastEndorseRTOCode", "Landroid/app/ProgressDialog;", "K", "Landroid/app/ProgressDialog;", "pDialog", "L", "PERMISSION_CODE_READ_EXTERNAL_STORAGE", "M", "getDlNo", "setDlNo", "dlNo", "N", "getDob", "setDob", "dob", "O", "getMobile_no", "setMobile_no", "Mobile_no", "P", "getLastEndorseRto", "setLastEndorseRto", "lastEndorseRto", "Lcom/zepto/wa3;", "Q", "Lcom/zepto/wa3;", "M1", "()Lcom/zepto/wa3;", "e2", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/wl5;", "R", "Lcom/zepto/wl5;", "O1", "()Lcom/zepto/wl5;", "g2", "(Lcom/zepto/wl5;)V", "sarathiSession", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "S", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "N1", "()Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "f2", "(Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;)V", "llDetails", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class LlStoltsAck extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public kd cBinding;

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

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public wl5 sarathiSession;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public FetchLlDetails llDetails;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(DlApplStatusDto dlApplStatusDto) {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            kd kdVar = LlStoltsAck.this.cBinding;
            if (kdVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                kdVar = null;
            }
            kdVar.E.c(false);
            if (!StringsKt__StringsJVMKt.equals$default(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, null) || dlApplStatusDto == null || (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) == null || !(!applStatusDetails.isEmpty()) || (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) == null || (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) == null || !(!applFlowStatusList.isEmpty())) {
                return;
            }
            LlStoltsAck.this.h2(applStatusDetailsItem.getApplFlowStatusList());
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
            ProgressDialog progressDialog = LlStoltsAck.this.pDialog;
            String str = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog = null;
            }
            progressDialog.dismiss();
            if (jSONObject != null) {
                try {
                    ProgressDialog progressDialog2 = LlStoltsAck.this.pDialog;
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
                        String str3 = LlStoltsAck.this.mApplNo;
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
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        fileOutputStream.write(bArrDecode);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        LlStoltsAck llStoltsAck = LlStoltsAck.this;
                        llStoltsAck.Z1(llStoltsAck);
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

    private final void L1(Context context) {
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
            Toast.makeText(context, M1().b("label_no_app_avl_pdf", ""), 1).show();
        }
    }

    private final void P1() {
        if (getIntent() != null) {
            Bundle extras = getIntent().getExtras();
            kd kdVar = null;
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
            kd kdVar2 = this.cBinding;
            if (kdVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                kdVar2 = null;
            }
            kdVar2.w.setText(str);
            kd kdVar3 = this.cBinding;
            if (kdVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            } else {
                kdVar = kdVar3;
            }
            kdVar.x.setText(str2);
            Serializable serializableExtra = getIntent().getSerializableExtra("LLDetails");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails");
            f2((FetchLlDetails) serializableExtra);
        }
    }

    private final void Q1() {
        yk1 yk1Var = (yk1) new z(this).a(yk1.class);
        this.viewModel = yk1Var;
        if (yk1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            yk1Var = null;
        }
        yk1Var.l().g(this, new c(new a()));
    }

    private final void R1() {
        kd kdVar = this.cBinding;
        yk1 yk1Var = null;
        if (kdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            kdVar = null;
        }
        kdVar.A.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlStoltsAck.S1(this.a, view);
            }
        });
        kd kdVar2 = this.cBinding;
        if (kdVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            kdVar2 = null;
        }
        kdVar2.E.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlStoltsAck.T1(this.a, view);
            }
        });
        kd kdVar3 = this.cBinding;
        if (kdVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            kdVar3 = null;
        }
        kdVar3.B.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlStoltsAck.U1(this.a, view);
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

    public static final void S1(LlStoltsAck this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
            this$0.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, this$0.PERMISSION_CODE_READ_EXTERNAL_STORAGE);
        } else {
            this$0.d2();
        }
    }

    public static final void T1(LlStoltsAck this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.M1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        String str = this$0.mApplDob;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
            str = null;
        }
        String strK1 = this$0.K1(str);
        if (strK1 != null) {
            kd kdVar = this$0.cBinding;
            if (kdVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cBinding");
                kdVar = null;
            }
            kdVar.E.c(true);
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
            yk1Var.h(str2, strK1);
        }
    }

    public static final void U1(LlStoltsAck this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    private final void V1() {
        kd kdVar = this.cBinding;
        kd kdVar2 = null;
        if (kdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            kdVar = null;
        }
        kdVar.C.g.setText(O1().k());
        kd kdVar3 = this.cBinding;
        if (kdVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            kdVar3 = null;
        }
        TextView textView = kdVar3.C.h;
        kd kdVar4 = this.cBinding;
        if (kdVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            kdVar4 = null;
        }
        textView.setPaintFlags(kdVar4.C.h.getPaintFlags() | 8);
        kd kdVar5 = this.cBinding;
        if (kdVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            kdVar5 = null;
        }
        TextView textView2 = kdVar5.C.h;
        String str = this.dlNo;
        Intrinsics.checkNotNull(str);
        textView2.setText(StringsKt__StringsKt.trim((CharSequence) str).toString());
        kd kdVar6 = this.cBinding;
        if (kdVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            kdVar2 = kdVar6;
        }
        kdVar2.C.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlStoltsAck.W1(this.a, view);
            }
        });
    }

    public static final void W1(LlStoltsAck this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) LlDetails.class);
            intent.putExtra("LLDetails", this$0.N1());
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final void Y1(LlStoltsAck this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z1(Context context) {
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
        textView.setText(M1().b(va3.a.c(), "Open PDF"));
        ((TextView) viewFindViewById).setText(M1().b("label_pdf_saved_in_download", getString(R.string.pdf_file_Save)));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.am3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlStoltsAck.a2(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void a2(Dialog d, LlStoltsAck this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.L1(this$0);
    }

    private final void b2(String message) {
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
        ((TextView) viewFindViewById3).setText(M1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(M1().b("btn_dl_serv_next", "Next"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlStoltsAck.c2(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void c2(Dialog d, LlStoltsAck this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h2(List applFlowStatusList) {
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
            X1(acCd);
        }
    }

    private final void i2() {
        try {
            Intent intent = new Intent(this, (Class<?>) LlDocumentUpload.class);
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
            intent.putExtra("LLDetails", N1());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void j2() {
        try {
            Intent intent = new Intent(this, (Class<?>) LlPayment.class);
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
            intent.putExtra("LLDetails", N1());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void k2() {
        try {
            Intent intent = new Intent(this, (Class<?>) LlPhotoSignature.class);
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
            intent.putExtra("LLDetails", N1());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void l2() {
        try {
            Intent intent = new Intent(this, (Class<?>) LlSlots.class);
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
            intent.putExtra("LLDetails", N1());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    public final String K1(String fdate) {
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

    public final wa3 M1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final FetchLlDetails N1() {
        FetchLlDetails fetchLlDetails = this.llDetails;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("llDetails");
        return null;
    }

    public final wl5 O1() {
        wl5 wl5Var = this.sarathiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarathiSession");
        return null;
    }

    public final void X1(Integer acCd) {
        if (acCd != null && acCd.intValue() == 135) {
            k2();
            return;
        }
        if (acCd != null && acCd.intValue() == 134) {
            j2();
            return;
        }
        if (acCd != null && acCd.intValue() == 123) {
            i2();
            return;
        }
        if (acCd != null && acCd.intValue() == 371) {
            l2();
        } else if (acCd != null && acCd.intValue() == 455) {
            b2(M1().b("label_e_sign", getString(R.string.esign)));
        }
    }

    public final void d2() {
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

    public final void e2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void f2(FetchLlDetails fetchLlDetails) {
        Intrinsics.checkNotNullParameter(fetchLlDetails, "<set-?>");
        this.llDetails = fetchLlDetails;
    }

    public final void g2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarathiSession = wl5Var;
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        kd kdVarX = kd.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(kdVarX, "inflate(...)");
        this.cBinding = kdVarX;
        kd kdVar = null;
        if (kdVarX == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            kdVarX = null;
        }
        setContentView(kdVarX.m());
        e2(new wa3(this));
        g2(new wl5(this));
        ta3.a aVar = ta3.a;
        kd kdVar2 = this.cBinding;
        if (kdVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
            kdVar2 = null;
        }
        aVar.l1(this, kdVar2);
        P1();
        Q1();
        R1();
        V1();
        kd kdVar3 = this.cBinding;
        if (kdVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        } else {
            kdVar = kdVar3;
        }
        kdVar.C.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ul3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlStoltsAck.Y1(this.a, view);
            }
        });
    }

    @Override // com.zepto.yf2, com.zepto.zt0, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == this.PERMISSION_CODE_READ_EXTERNAL_STORAGE) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                d2();
            }
        }
    }
}
