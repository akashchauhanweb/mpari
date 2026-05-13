package com.nic.mparivahan.LLMainScreen;

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
import com.nic.mparivahan.LLMainScreen.LlApplicationNumber;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.LLServices.UI.LlDocumentUpload;
import com.nic.mparivahan.LLServices.UI.LlPayment;
import com.nic.mparivahan.LLServices.UI.LlPhotoSignature;
import com.nic.mparivahan.LLServices.UI.LlSlots;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.ApplFlowStatusListItem;
import com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.ui.DLServiceFinalSubmitedActivity;
import com.zepto.mf4;
import com.zepto.nc;
import com.zepto.pq;
import com.zepto.st6;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.yk1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0012\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0017\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010D\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010GR\"\u0010L\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010?\u001a\u0004\bJ\u0010A\"\u0004\bK\u0010CR\"\u0010P\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010?\u001a\u0004\bN\u0010A\"\u0004\bO\u0010CR\"\u0010T\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010?\u001a\u0004\bR\u0010A\"\u0004\bS\u0010CR\"\u0010X\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010?\u001a\u0004\bV\u0010A\"\u0004\bW\u0010CR\"\u0010\\\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010?\u001a\u0004\bZ\u0010A\"\u0004\b[\u0010CR\"\u0010`\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010?\u001a\u0004\b^\u0010A\"\u0004\b_\u0010CR\"\u0010d\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010?\u001a\u0004\bb\u0010A\"\u0004\bc\u0010CR\"\u0010h\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010?\u001a\u0004\bf\u0010A\"\u0004\bg\u0010CR\"\u0010p\u001a\u00020i8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010x\u001a\u00020q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\"\u0010|\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\by\u0010?\u001a\u0004\bz\u0010A\"\u0004\b{\u0010CR#\u0010\u0080\u0001\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b}\u0010?\u001a\u0004\b~\u0010A\"\u0004\b\u007f\u0010C¨\u0006\u0083\u0001"}, d2 = {"Lcom/nic/mparivahan/LLMainScreen/LlApplicationNumber;", "Lcom/zepto/pq;", "", "A1", "y1", "", "Lcom/nic/mparivahan/dlservices/data/model/ApplFlowStatusListItem;", "applFlowStatusList", "Y1", "c2", "a2", "b2", "d2", "", "message", "G1", "Landroidx/constraintlayout/widget/ConstraintLayout;", "containerView", "z1", "Ljava/io/File;", "file", "Z1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "", "acCd", "C1", "(Ljava/lang/Integer;)V", "Lcom/zepto/nc;", "C", "Lcom/zepto/nc;", "q1", "()Lcom/zepto/nc;", "N1", "(Lcom/zepto/nc;)V", "mBinding", "Lcom/zepto/wa3;", "D", "Lcom/zepto/wa3;", "x1", "()Lcom/zepto/wa3;", "W1", "(Lcom/zepto/wa3;)V", "session", "Landroid/content/Context;", "E", "Landroid/content/Context;", "r1", "()Landroid/content/Context;", "O1", "(Landroid/content/Context;)V", "mContext", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "t1", "()Landroid/app/ProgressDialog;", "Q1", "(Landroid/app/ProgressDialog;)V", "pDialog", "G", "Ljava/lang/String;", "getApplicationNumber", "()Ljava/lang/String;", "setApplicationNumber", "(Ljava/lang/String;)V", "applicationNumber", "Lcom/zepto/yk1;", "H", "Lcom/zepto/yk1;", "viewModel", "I", "getDlValue", "J1", "dlValue", "J", "o1", "K1", "dobValue", "K", "getFatherName", "L1", "fatherName", "L", "getClName", "I1", "clName", "M", "getRtoCode", "R1", "rtoCode", "N", "getStateCode", "X1", "stateCode", "O", "getRtoName", "S1", "rtoName", "P", "s1", "P1", "Mobile_no", "Lcom/zepto/wl5;", "Q", "Lcom/zepto/wl5;", "u1", "()Lcom/zepto/wl5;", "T1", "(Lcom/zepto/wl5;)V", "sarthiSession", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "R", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "p1", "()Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "M1", "(Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;)V", "llDetails", "S", "v1", "U1", "selectedRtoCd", "T", "w1", "V1", "selectedRtoName", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class LlApplicationNumber extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public nc mBinding;

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
    public String rtoCode;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String stateCode;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String rtoName;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String Mobile_no;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public FetchLlDetails llDetails;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String selectedRtoCd;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String selectedRtoName;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(DlApplStatusDto dlApplStatusDto) {
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            LlApplicationNumber.this.q1().E.c(false);
            if (!StringsKt__StringsJVMKt.equals$default(dlApplStatusDto.getStatusCode(), "00", false, 2, null)) {
                Toast.makeText(LlApplicationNumber.this, dlApplStatusDto.getStatusDesc(), 1).show();
                return;
            }
            if (dlApplStatusDto.getApplStatusDetails() == null || !(!r0.isEmpty()) || (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) == null || (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) == null || !(!applFlowStatusList.isEmpty())) {
                return;
            }
            LlApplicationNumber.this.Y1(applStatusDetailsItem.getApplFlowStatusList());
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

    private final void A1() {
        q1().B.g.setText(new wl5(this).k());
        q1().B.h.setPaintFlags(q1().B.h.getPaintFlags() | 8);
        q1().B.h.setText(StringsKt__StringsKt.trim((CharSequence) p1().getLearningLicence()).toString());
        q1().B.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tg3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlApplicationNumber.B1(this.a, view);
            }
        });
    }

    public static final void B1(LlApplicationNumber this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) LlDetails.class);
            intent.putExtra("LLDetails", this$0.p1());
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final void D1(LlApplicationNumber this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (st6.e(this$0)) {
            ConstraintLayout containerCl = this$0.q1().x;
            Intrinsics.checkNotNullExpressionValue(containerCl, "containerCl");
            this$0.z1(containerCl);
        }
    }

    public static final void E1(LlApplicationNumber this$0, View view) {
        String strK;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = this$0.applicationNumber;
        if (str == null || (strK = st6.k(this$0.o1(), "dd-MM-yyyy", "dd-MM-yyyy")) == null) {
            return;
        }
        this$0.q1().E.c(true);
        yk1 yk1Var = this$0.viewModel;
        if (yk1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            yk1Var = null;
        }
        yk1Var.h(str, strK);
    }

    public static final void F1(LlApplicationNumber this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    private final void G1(String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ug3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlApplicationNumber.H1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void H1(Dialog d, LlApplicationNumber this$0, View view) {
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
            C1(acCd);
        }
    }

    private final void Z1(File file) {
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

    private final void a2() {
        try {
            Intent intent = new Intent(this, (Class<?>) LlDocumentUpload.class);
            intent.putExtra("dl_st_appl_ackno_no", this.applicationNumber);
            intent.putExtra("dl_st_appl_ackno_no_dob", StringsKt__StringsKt.trim((CharSequence) p1().getDateOfBirth()).toString());
            intent.putExtra("DL", StringsKt__StringsKt.trim((CharSequence) p1().getLearningLicence()).toString());
            intent.putExtra("dob", StringsKt__StringsKt.trim((CharSequence) p1().getDateOfBirth()).toString());
            intent.putExtra("Mobile_no", s1());
            intent.putExtra("lastEndorsedRTO", w1());
            intent.putExtra("lastEndorsedRTOCode", v1());
            intent.putExtra("LLDetails", p1());
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void b2() {
        try {
            Intent intent = new Intent(this, (Class<?>) LlPayment.class);
            intent.putExtra("dl_st_appl_ackno_no", this.applicationNumber);
            intent.putExtra("dl_st_appl_ackno_no_dob", StringsKt__StringsKt.trim((CharSequence) p1().getDateOfBirth()).toString());
            intent.putExtra("DL", StringsKt__StringsKt.trim((CharSequence) p1().getLearningLicence()).toString());
            intent.putExtra("dob", StringsKt__StringsKt.trim((CharSequence) p1().getDateOfBirth()).toString());
            intent.putExtra("Mobile_no", s1());
            intent.putExtra("lastEndorsedRTO", w1());
            intent.putExtra("lastEndorsedRTOCode", v1());
            intent.putExtra("LLDetails", p1());
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void c2() {
        try {
            Intent intent = new Intent(this, (Class<?>) LlPhotoSignature.class);
            intent.putExtra("dl_st_appl_ackno_no", this.applicationNumber);
            intent.putExtra("dl_st_appl_ackno_no_dob", StringsKt__StringsKt.trim((CharSequence) p1().getDateOfBirth()).toString());
            intent.putExtra("DL", StringsKt__StringsKt.trim((CharSequence) p1().getLearningLicence()).toString());
            intent.putExtra("dob", StringsKt__StringsKt.trim((CharSequence) p1().getDateOfBirth()).toString());
            intent.putExtra("Mobile_no", s1());
            intent.putExtra("lastEndorsedRTO", w1());
            intent.putExtra("lastEndorsedRTOCode", v1());
            intent.putExtra("LLDetails", p1());
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void d2() {
        try {
            Intent intent = new Intent(this, (Class<?>) LlSlots.class);
            intent.putExtra("dl_st_appl_ackno_no", this.applicationNumber);
            intent.putExtra("dl_st_appl_ackno_no_dob", StringsKt__StringsKt.trim((CharSequence) p1().getDateOfBirth()).toString());
            intent.putExtra("DL", StringsKt__StringsKt.trim((CharSequence) p1().getLearningLicence()).toString());
            intent.putExtra("dob", StringsKt__StringsKt.trim((CharSequence) p1().getDateOfBirth()).toString());
            intent.putExtra("Mobile_no", s1());
            intent.putExtra("lastEndorsedRTO", w1());
            intent.putExtra("lastEndorsedRTOCode", v1());
            intent.putExtra("LLDetails", p1());
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void y1() {
        O1(this);
        W1(new wa3(r1()));
        T1(new wl5(r1()));
        Q1(new ProgressDialog(r1()));
        t1().setMessage(x1().b("label_challan_please_wait", getString(R.string.please_wait)));
        t1().setCancelable(false);
        t1().setCanceledOnTouchOutside(false);
        this.viewModel = (yk1) new z(this).a(yk1.class);
        try {
            Serializable serializableExtra = getIntent().getSerializableExtra("LLDetails");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails");
            M1((FetchLlDetails) serializableExtra);
            this.applicationNumber = String.valueOf(getIntent().getStringExtra("appNumber"));
            P1(String.valueOf(getIntent().getStringExtra("Mobile_no")));
            U1(String.valueOf(getIntent().getStringExtra("selectedRtoCd")));
            V1(String.valueOf(getIntent().getStringExtra("selectedRtoName")));
            K1(StringsKt__StringsKt.trim((CharSequence) p1().getDateOfBirth()).toString());
            J1(StringsKt__StringsKt.trim((CharSequence) p1().getLearningLicence()).toString());
            L1(StringsKt__StringsKt.trim((CharSequence) p1().getApplicantAddress().getSwdFullName()).toString());
            I1(StringsKt__StringsKt.trim((CharSequence) p1().getFullName()).toString());
            R1(v1());
            S1(w1());
            X1(p1().getState().getStCd());
            q1().G.setText(u1().k());
        } catch (Exception unused) {
        }
        yk1 yk1Var = this.viewModel;
        if (yk1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            yk1Var = null;
        }
        yk1Var.l().g(this, new b(new a()));
    }

    private final void z1(ConstraintLayout containerView) {
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
            Z1(file2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void C1(Integer acCd) {
        if (acCd != null && acCd.intValue() == 135) {
            c2();
            return;
        }
        if (acCd != null && acCd.intValue() == 134) {
            b2();
            return;
        }
        if (acCd != null && acCd.intValue() == 123) {
            a2();
            return;
        }
        if (acCd != null && acCd.intValue() == 371) {
            d2();
        } else if (acCd != null && acCd.intValue() == 455) {
            G1(x1().b("label_e_sign", getString(R.string.esign)));
        }
    }

    public final void I1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clName = str;
    }

    public final void J1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dlValue = str;
    }

    public final void K1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dobValue = str;
    }

    public final void L1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fatherName = str;
    }

    public final void M1(FetchLlDetails fetchLlDetails) {
        Intrinsics.checkNotNullParameter(fetchLlDetails, "<set-?>");
        this.llDetails = fetchLlDetails;
    }

    public final void N1(nc ncVar) {
        Intrinsics.checkNotNullParameter(ncVar, "<set-?>");
        this.mBinding = ncVar;
    }

    public final void O1(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void P1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.Mobile_no = str;
    }

    public final void Q1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void R1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoCode = str;
    }

    public final void S1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoName = str;
    }

    public final void T1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final void U1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.selectedRtoCd = str;
    }

    public final void V1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.selectedRtoName = str;
    }

    public final void W1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final void X1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCode = str;
    }

    public final String o1() {
        String str = this.dobValue;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dobValue");
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
        nc ncVarX = nc.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ncVarX, "inflate(...)");
        N1(ncVarX);
        setContentView(q1().m());
        y1();
        ta3.a.n1(this, q1());
        if (StringsKt__StringsJVMKt.equals(this.applicationNumber, "", true)) {
            q1().w.setText(x1().b("label_app_for_four", getString(R.string.lbl4)));
        } else {
            String str = x1().b("label_app_for_four", getString(R.string.lbl4)) + '\n' + x1().b("label_app_for_three", getString(R.string.lbl3));
            q1().w.setText(str + ' ' + this.applicationNumber);
        }
        q1().F.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qg3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlApplicationNumber.D1(this.a, view);
            }
        });
        q1().E.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rg3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlApplicationNumber.E1(this.a, view);
            }
        });
        A1();
        q1().B.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sg3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlApplicationNumber.F1(this.a, view);
            }
        });
    }

    public final FetchLlDetails p1() {
        FetchLlDetails fetchLlDetails = this.llDetails;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("llDetails");
        return null;
    }

    public final nc q1() {
        nc ncVar = this.mBinding;
        if (ncVar != null) {
            return ncVar;
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

    public final wl5 u1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final String v1() {
        String str = this.selectedRtoCd;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("selectedRtoCd");
        return null;
    }

    public final String w1() {
        String str = this.selectedRtoName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("selectedRtoName");
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
}
