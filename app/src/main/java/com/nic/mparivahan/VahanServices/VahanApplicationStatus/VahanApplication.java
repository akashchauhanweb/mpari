package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.method.DigitsKeyListener;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.z;
import com.google.gson.Gson;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.ApplicationStatusModel.AppliByRcModle;
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanApplication;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.ApplStatusCurrentListModel;
import com.nic.mparivahan.VahanServices.VahanModel.ApplStatusTransListModel;
import com.nic.mparivahan.VahanServices.VahanModel.ApplicationStatusSuccessModel;
import com.nic.mparivahan.VahanServices.VahanModel.FinalRequestSubmitResponse;
import com.nic.mparivahan.VahanServices.VahanModel.RequireDataForBePaymet;
import com.nic.mparivahan.VahanServices.VahanMultiService.ApplicationStatus.VahanMultiServiceApplicationTransactionStatus;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequestfinal;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationService;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationServiceOtp;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.zepto.bx;
import com.zepto.ev;
import com.zepto.fv6;
import com.zepto.jd7;
import com.zepto.jv;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.pw;
import com.zepto.qw;
import com.zepto.rv6;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.yy0;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bm\u0010nJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0003J\b\u0010\n\u001a\u00020\u0002H\u0002J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0003J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J\u0012\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0015J\u001e\u0010\u0019\u001a\u00020\b2\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017J\u000e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0014\u0010;\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010:R\u0016\u0010?\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010:R\u0016\u0010A\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010:R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010O\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010:\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010f\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR6\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010l¨\u0006o"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanApplicationStatus/VahanApplication;", "Lcom/zepto/pq;", "", "F1", "", "rcNo", "chassisNo", "y1", "", "Y1", "O1", "Landroid/content/Context;", "context", "it", "V1", "applNo", "stateCd", "x1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/VahanModel/ApplStatusTransListModel;", "Lkotlin/collections/ArrayList;", "transList", "z1", "Lcom/nic/mparivahan/VahanServices/VahanModel/RequireDataForBePaymet;", "payment_response", "P1", "Lcom/zepto/bx;", "C", "Lcom/zepto/bx;", "binding", "Lcom/zepto/jv;", "D", "Lcom/zepto/jv;", "viewModel", "Lcom/zepto/ev;", "E", "Lcom/zepto/ev;", "otpViewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationService;", "F", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationService;", "retrofitService", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationServiceOtp;", "G", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationServiceOtp;", "otpRetrofitService", "Landroid/app/ProgressDialog;", "H", "Landroid/app/ProgressDialog;", "B1", "()Landroid/app/ProgressDialog;", "R1", "(Landroid/app/ProgressDialog;)V", "pDialog", "I", "Ljava/lang/String;", "digit", "J", "ownerName", "K", "stateCdFromApplNo", "L", "tabSelected", "Lcom/zepto/wa3;", "M", "Lcom/zepto/wa3;", "A1", "()Lcom/zepto/wa3;", "Q1", "(Lcom/zepto/wa3;)V", "languageSession", "N", "getPurposeCode", "()Ljava/lang/String;", "setPurposeCode", "(Ljava/lang/String;)V", "purposeCode", "Lcom/zepto/ld7;", "O", "Lcom/zepto/ld7;", "D1", "()Lcom/zepto/ld7;", "T1", "(Lcom/zepto/ld7;)V", "slotViewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "P", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "C1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "S1", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "slotService", "Q", "Lcom/nic/mparivahan/VahanServices/VahanModel/RequireDataForBePaymet;", "getReqBeforPayment", "()Lcom/nic/mparivahan/VahanServices/VahanModel/RequireDataForBePaymet;", "setReqBeforPayment", "(Lcom/nic/mparivahan/VahanServices/VahanModel/RequireDataForBePaymet;)V", "reqBeforPayment", "R", "Ljava/util/ArrayList;", "E1", "()Ljava/util/ArrayList;", "U1", "(Ljava/util/ArrayList;)V", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nVahanApplication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VahanApplication.kt\ncom/nic/mparivahan/VahanServices/VahanApplicationStatus/VahanApplication\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,623:1\n260#2:624\n260#2:625\n260#2:626\n260#2:627\n*S KotlinDebug\n*F\n+ 1 VahanApplication.kt\ncom/nic/mparivahan/VahanServices/VahanApplicationStatus/VahanApplication\n*L\n379#1:624\n388#1:625\n413#1:626\n432#1:627\n*E\n"})
public final class VahanApplication extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public bx binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public jv viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ev otpViewModel;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ApplicationService retrofitService;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ApplicationServiceOtp otpRetrofitService;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public wa3 languageSession;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public ld7 slotViewModel;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public VahanProService slotService;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public RequireDataForBePaymet reqBeforPayment;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public ArrayList transList;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public final String digit = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String ownerName = "";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String stateCdFromApplNo = "";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String tabSelected = "ApplicationNo";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String purposeCode = "";

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(ApplicationStatusSuccessModel applicationStatusSuccessModel) {
            try {
                if (applicationStatusSuccessModel.getTransList().size() <= 0) {
                    if (VahanApplication.this.B1().isShowing()) {
                        VahanApplication.this.B1().dismiss();
                    }
                    VahanApplication vahanApplication = VahanApplication.this;
                    vahanApplication.V1(vahanApplication, vahanApplication.A1().b("no_application_status", "No application status found for this application no."));
                    return;
                }
                VahanApplication.this.U1(applicationStatusSuccessModel.getTransList());
                bx bxVar = null;
                if (VahanApplication.this.z1(applicationStatusSuccessModel.getTransList())) {
                    ld7 ld7VarD1 = VahanApplication.this.D1();
                    VahanApplication vahanApplication2 = VahanApplication.this;
                    bx bxVar2 = vahanApplication2.binding;
                    if (bxVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        bxVar = bxVar2;
                    }
                    ld7VarD1.x(vahanApplication2, String.valueOf(bxVar.l.getText()));
                    return;
                }
                if (VahanApplication.this.B1().isShowing()) {
                    VahanApplication.this.B1().dismiss();
                }
                ArrayList arrayList = new ArrayList();
                ArrayList<ApplStatusCurrentListModel> currentlist = applicationStatusSuccessModel.getTransList().get(0).getCurrentlist();
                int size = currentlist.size();
                for (int i = 0; i < size; i++) {
                    if (VContant.INSTANCE.H(String.valueOf(currentlist.get(i).getPurCd()))) {
                        arrayList.add(String.valueOf(currentlist.get(i).getPurCd()));
                    }
                }
                if (arrayList.size() > 1) {
                    Intent intent = new Intent(VahanApplication.this, (Class<?>) VahanMultiServiceApplicationTransactionStatus.class);
                    intent.putExtra("transList", new Gson().toJson(applicationStatusSuccessModel.getTransList()));
                    bx bxVar3 = VahanApplication.this.binding;
                    if (bxVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        bxVar3 = null;
                    }
                    intent.putExtra("applicationNo", String.valueOf(bxVar3.l.getText()));
                    intent.putExtra("ownerName", VahanApplication.this.ownerName);
                    intent.putExtra("stateCd", VahanApplication.this.stateCdFromApplNo);
                    bx bxVar4 = VahanApplication.this.binding;
                    if (bxVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        bxVar = bxVar4;
                    }
                    intent.putExtra("regNo", String.valueOf(bxVar.n.getText()));
                    VahanApplication.this.startActivity(intent);
                    return;
                }
                Intent intent2 = new Intent(VahanApplication.this, (Class<?>) VahanApplicationTransactionStatus.class);
                intent2.putExtra("transList", new Gson().toJson(applicationStatusSuccessModel.getTransList()));
                bx bxVar5 = VahanApplication.this.binding;
                if (bxVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    bxVar5 = null;
                }
                intent2.putExtra("applicationNo", String.valueOf(bxVar5.l.getText()));
                intent2.putExtra("ownerName", VahanApplication.this.ownerName);
                intent2.putExtra("stateCd", VahanApplication.this.stateCdFromApplNo);
                bx bxVar6 = VahanApplication.this.binding;
                if (bxVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    bxVar = bxVar6;
                }
                intent2.putExtra("regNo", String.valueOf(bxVar.n.getText()));
                VahanApplication.this.startActivity(intent2);
            } catch (Exception e) {
                if (VahanApplication.this.B1().isShowing()) {
                    VahanApplication.this.B1().dismiss();
                }
                e.printStackTrace();
                VahanApplication vahanApplication3 = VahanApplication.this;
                vahanApplication3.V1(vahanApplication3, vahanApplication3.getString(R.string.service_unavable_please_try));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ApplicationStatusSuccessModel) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            if (VahanApplication.this.B1().isShowing()) {
                VahanApplication.this.B1().dismiss();
            }
            VahanApplication vahanApplication = VahanApplication.this;
            vahanApplication.V1(vahanApplication, vahanApplication.A1().b("no_application_status", "No application status found for this application no."));
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(AppliByRcModle appliByRcModle) {
            if (VahanApplication.this.B1().isShowing()) {
                VahanApplication.this.B1().dismiss();
            }
            try {
                if (appliByRcModle.get1().getCurrentlist().size() <= 0) {
                    VahanApplication vahanApplication = VahanApplication.this;
                    vahanApplication.V1(vahanApplication, vahanApplication.A1().b("no_application_with_rc", "No application status found for this vehicle no."));
                } else {
                    Intent intent = new Intent(VahanApplication.this, (Class<?>) ApplStatusApplicationList.class);
                    intent.putExtra("current", appliByRcModle);
                    VahanApplication.this.startActivity(intent);
                    VahanApplication.this.finish();
                }
            } catch (Exception e) {
                e.printStackTrace();
                VahanApplication vahanApplication2 = VahanApplication.this;
                vahanApplication2.V1(vahanApplication2, vahanApplication2.getString(R.string.service_unavable_please_try));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AppliByRcModle) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            if (VahanApplication.this.B1().isShowing()) {
                VahanApplication.this.B1().dismiss();
            }
            VahanApplication vahanApplication = VahanApplication.this;
            vahanApplication.V1(vahanApplication, vahanApplication.A1().b("no_application_with_rc", "No application status found for this vehicle no."));
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(FinalRequestSubmitResponse finalRequestSubmitResponse) {
            VahanApplication.this.B1().dismiss();
            if (VahanApplication.this.B1().isShowing()) {
                VahanApplication.this.B1().dismiss();
            }
            VahanApplication vahanApplication = VahanApplication.this;
            bx bxVar = vahanApplication.binding;
            if (bxVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bxVar = null;
            }
            vahanApplication.x1(String.valueOf(bxVar.l.getText()), VahanApplication.this.stateCdFromApplNo);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((FinalRequestSubmitResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            VahanApplication.this.B1().dismiss();
            if (VahanApplication.this.B1().isShowing()) {
                VahanApplication.this.B1().dismiss();
            }
            Intent intent = new Intent(VahanApplication.this, (Class<?>) VahanApplicationTransactionStatus.class);
            intent.putExtra("transList", new Gson().toJson(VahanApplication.this.getTransList()));
            bx bxVar = VahanApplication.this.binding;
            bx bxVar2 = null;
            if (bxVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bxVar = null;
            }
            intent.putExtra("applicationNo", String.valueOf(bxVar.l.getText()));
            intent.putExtra("ownerName", VahanApplication.this.ownerName);
            intent.putExtra("stateCd", VahanApplication.this.stateCdFromApplNo);
            bx bxVar3 = VahanApplication.this.binding;
            if (bxVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                bxVar2 = bxVar3;
            }
            intent.putExtra("regNo", String.valueOf(bxVar2.n.getText()));
            VahanApplication.this.startActivity(intent);
            VahanApplication.this.finish();
        }
    }

    public static final class g implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public g(Function1 function) {
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
        ApplicationService applicationService = this.retrofitService;
        bx bxVar = null;
        if (applicationService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            applicationService = null;
        }
        this.viewModel = (jv) new z(this, new rv6(new qw(applicationService))).a(jv.class);
        ApplicationServiceOtp applicationServiceOtp = this.otpRetrofitService;
        if (applicationServiceOtp == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpRetrofitService");
            applicationServiceOtp = null;
        }
        this.otpViewModel = (ev) new z(this, new fv6(new pw(applicationServiceOtp))).a(ev.class);
        S1(VahanProService.INSTANCE.a(this));
        T1((ld7) new z(this, new kd7(new jd7(C1()))).a(ld7.class));
        bx bxVar2 = this.binding;
        if (bxVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar2 = null;
        }
        bxVar2.e.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xv6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplication.G1(this.a, view);
            }
        });
        bx bxVar3 = this.binding;
        if (bxVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar3 = null;
        }
        bxVar3.e.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yv6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplication.H1(this.a, view);
            }
        });
        bx bxVar4 = this.binding;
        if (bxVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar4 = null;
        }
        bxVar4.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zv6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplication.I1(this.a, view);
            }
        });
        bx bxVar5 = this.binding;
        if (bxVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar5 = null;
        }
        bxVar5.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.aw6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplication.J1(this.a, view);
            }
        });
        bx bxVar6 = this.binding;
        if (bxVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar6 = null;
        }
        bxVar6.n.setKeyListener(DigitsKeyListener.getInstance(this.digit));
        bx bxVar7 = this.binding;
        if (bxVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar7 = null;
        }
        bxVar7.n.setRawInputType(ConstantsKt.DEFAULT_BLOCK_SIZE);
        bx bxVar8 = this.binding;
        if (bxVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar8 = null;
        }
        bxVar8.m.setKeyListener(DigitsKeyListener.getInstance(this.digit));
        bx bxVar9 = this.binding;
        if (bxVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar9 = null;
        }
        bxVar9.m.setRawInputType(ConstantsKt.DEFAULT_BLOCK_SIZE);
        bx bxVar10 = this.binding;
        if (bxVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar10 = null;
        }
        bxVar10.l.setKeyListener(DigitsKeyListener.getInstance(this.digit));
        bx bxVar11 = this.binding;
        if (bxVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar11 = null;
        }
        bxVar11.l.setRawInputType(ConstantsKt.DEFAULT_BLOCK_SIZE);
        bx bxVar12 = this.binding;
        if (bxVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar12 = null;
        }
        bxVar12.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bw6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplication.K1(this.a, view);
            }
        });
        bx bxVar13 = this.binding;
        if (bxVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            bxVar = bxVar13;
        }
        bxVar.p.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cw6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplication.L1(this.a, view);
            }
        });
    }

    public static final void G1(VahanApplication this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.O1();
    }

    public static final void H1(VahanApplication this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void I1(VahanApplication this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.Y1()) {
            bx bxVar = null;
            if (Intrinsics.areEqual(this$0.tabSelected, "ApplicationNo")) {
                bx bxVar2 = this$0.binding;
                if (bxVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    bxVar = bxVar2;
                }
                this$0.x1(String.valueOf(bxVar.l.getText()), this$0.stateCdFromApplNo);
                return;
            }
            bx bxVar3 = this$0.binding;
            if (bxVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bxVar3 = null;
            }
            String strValueOf = String.valueOf(bxVar3.n.getText());
            bx bxVar4 = this$0.binding;
            if (bxVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                bxVar = bxVar4;
            }
            this$0.y1(strValueOf, String.valueOf(bxVar.m.getText()));
        }
    }

    public static final void J1(VahanApplication this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void K1(VahanApplication this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        bx bxVar = this$0.binding;
        bx bxVar2 = null;
        if (bxVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar = null;
        }
        if (bxVar.d.isSelected()) {
            bx bxVar3 = this$0.binding;
            if (bxVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bxVar3 = null;
            }
            bxVar3.d.setChecked(false);
            bx bxVar4 = this$0.binding;
            if (bxVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bxVar4 = null;
            }
            bxVar4.d.setSelected(false);
            bx bxVar5 = this$0.binding;
            if (bxVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                bxVar2 = bxVar5;
            }
            bxVar2.c.setBackgroundResource(R.drawable.corner_circle_bg_14);
            return;
        }
        bx bxVar6 = this$0.binding;
        if (bxVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar6 = null;
        }
        bxVar6.d.setChecked(true);
        bx bxVar7 = this$0.binding;
        if (bxVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar7 = null;
        }
        bxVar7.d.setSelected(true);
        bx bxVar8 = this$0.binding;
        if (bxVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar8 = null;
        }
        bxVar8.c.setBackgroundResource(R.drawable.corner_circle_14_selected);
        bx bxVar9 = this$0.binding;
        if (bxVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar9 = null;
        }
        bxVar9.p.setChecked(false);
        bx bxVar10 = this$0.binding;
        if (bxVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar10 = null;
        }
        bxVar10.p.setSelected(false);
        bx bxVar11 = this$0.binding;
        if (bxVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar11 = null;
        }
        bxVar11.o.setBackgroundResource(R.drawable.corner_circle_bg_14);
        bx bxVar12 = this$0.binding;
        if (bxVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar12 = null;
        }
        bxVar12.l.setVisibility(0);
        bx bxVar13 = this$0.binding;
        if (bxVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar13 = null;
        }
        bxVar13.b.setVisibility(0);
        bx bxVar14 = this$0.binding;
        if (bxVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar14 = null;
        }
        bxVar14.j.setVisibility(8);
        bx bxVar15 = this$0.binding;
        if (bxVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar15 = null;
        }
        bxVar15.n.setVisibility(8);
        bx bxVar16 = this$0.binding;
        if (bxVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar16 = null;
        }
        bxVar16.f.setVisibility(8);
        bx bxVar17 = this$0.binding;
        if (bxVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            bxVar2 = bxVar17;
        }
        bxVar2.m.setVisibility(8);
        this$0.tabSelected = "ApplicationNo";
    }

    public static final void L1(VahanApplication this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        bx bxVar = this$0.binding;
        bx bxVar2 = null;
        if (bxVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar = null;
        }
        if (bxVar.p.isSelected()) {
            bx bxVar3 = this$0.binding;
            if (bxVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bxVar3 = null;
            }
            bxVar3.p.setChecked(false);
            bx bxVar4 = this$0.binding;
            if (bxVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                bxVar4 = null;
            }
            bxVar4.p.setSelected(false);
            bx bxVar5 = this$0.binding;
            if (bxVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                bxVar2 = bxVar5;
            }
            bxVar2.o.setBackgroundResource(R.drawable.corner_circle_bg_14);
            return;
        }
        bx bxVar6 = this$0.binding;
        if (bxVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar6 = null;
        }
        bxVar6.d.setChecked(false);
        bx bxVar7 = this$0.binding;
        if (bxVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar7 = null;
        }
        bxVar7.d.setSelected(false);
        bx bxVar8 = this$0.binding;
        if (bxVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar8 = null;
        }
        bxVar8.c.setBackgroundResource(R.drawable.corner_circle_bg_14);
        bx bxVar9 = this$0.binding;
        if (bxVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar9 = null;
        }
        bxVar9.p.setChecked(true);
        bx bxVar10 = this$0.binding;
        if (bxVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar10 = null;
        }
        bxVar10.p.setSelected(true);
        bx bxVar11 = this$0.binding;
        if (bxVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar11 = null;
        }
        bxVar11.o.setBackgroundResource(R.drawable.corner_circle_14_selected);
        bx bxVar12 = this$0.binding;
        if (bxVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar12 = null;
        }
        bxVar12.l.setVisibility(8);
        bx bxVar13 = this$0.binding;
        if (bxVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar13 = null;
        }
        bxVar13.b.setVisibility(8);
        bx bxVar14 = this$0.binding;
        if (bxVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar14 = null;
        }
        bxVar14.j.setVisibility(0);
        bx bxVar15 = this$0.binding;
        if (bxVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar15 = null;
        }
        bxVar15.n.setVisibility(0);
        bx bxVar16 = this$0.binding;
        if (bxVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar16 = null;
        }
        bxVar16.f.setVisibility(0);
        bx bxVar17 = this$0.binding;
        if (bxVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            bxVar2 = bxVar17;
        }
        bxVar2.m.setVisibility(0);
        this$0.tabSelected = "Vehicle";
    }

    public static final void M1(VahanApplication this$0, RequireDataForBePaymet requireDataForBePaymet) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (requireDataForBePaymet != null) {
            try {
                this$0.reqBeforPayment = requireDataForBePaymet;
                Intrinsics.checkNotNull(requireDataForBePaymet);
                this$0.P1(requireDataForBePaymet);
            } catch (Exception unused) {
                this$0.B1().dismiss();
            }
        }
    }

    public static final void N1(VahanApplication this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B1().dismiss();
    }

    private final void O1() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V1(Context context, String it) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        wa3 wa3Var = new wa3(context);
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        textView2.setVisibility(8);
        textView.setText(wa3Var.b("btn_ok", getString(R.string.ok_text)));
        ((TextView) viewFindViewById4).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        textView.setBackground(yy0.e(this, R.drawable.shape_red));
        textView.setTextColor(yy0.c(this, R.color.white));
        ((TextView) viewFindViewById).setText(it);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vv6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplication.W1(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wv6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplication.X1(dialog, view);
            }
        });
        dialog.show();
    }

    public static final void W1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void X1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean Y1() {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanApplication.Y1():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x1(String applNo, String stateCd) {
        B1().show();
        ev evVar = this.otpViewModel;
        if (evVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
            evVar = null;
        }
        evVar.o(this, applNo, stateCd);
    }

    public final wa3 A1() {
        wa3 wa3Var = this.languageSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageSession");
        return null;
    }

    public final ProgressDialog B1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final VahanProService C1() {
        VahanProService vahanProService = this.slotService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("slotService");
        return null;
    }

    public final ld7 D1() {
        ld7 ld7Var = this.slotViewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("slotViewModel");
        return null;
    }

    /* JADX INFO: renamed from: E1, reason: from getter */
    public final ArrayList getTransList() {
        return this.transList;
    }

    public final void P1(RequireDataForBePaymet payment_response) {
        Intrinsics.checkNotNullParameter(payment_response, "payment_response");
        bx bxVar = this.binding;
        if (bxVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar = null;
        }
        D1().y1(new BeforePaymentRequestfinal("", String.valueOf(bxVar.l.getText()), null, 0, null, " ", " ", null, null, 0, " ", 0, " ", " ", null, "", "", "", "", this.purposeCode, payment_response.getRcpt_dt().toString(), payment_response.getReturn_rcpt_no(), String.valueOf(payment_response.getRcpt_amt()), 0, payment_response.getRegn_no().toString(), payment_response.getState_cd(), "", "", "", 0));
    }

    public final void Q1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }

    public final void R1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void S1(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.slotService = vahanProService;
    }

    public final void T1(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.slotViewModel = ld7Var;
    }

    public final void U1(ArrayList arrayList) {
        this.transList = arrayList;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.application_status_new);
        bx bxVarC = bx.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(bxVarC, "inflate(...)");
        this.binding = bxVarC;
        ev evVar = null;
        if (bxVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVarC = null;
        }
        setContentView(bxVarC.b());
        getWindow().addFlags(128);
        ta3.a aVar = ta3.a;
        bx bxVar = this.binding;
        if (bxVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            bxVar = null;
        }
        aVar.c2(this, bxVar);
        Q1(new wa3(this));
        this.retrofitService = ApplicationService.INSTANCE.a(this);
        this.otpRetrofitService = ApplicationServiceOtp.INSTANCE.a(this);
        R1(new ProgressDialog(this));
        B1().setMessage(A1().b("label_challan_please_wait", "Please wait..."));
        B1().setCancelable(false);
        B1().setCanceledOnTouchOutside(false);
        F1();
        ev evVar2 = this.otpViewModel;
        if (evVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
            evVar2 = null;
        }
        evVar2.n().g(this, new g(new a()));
        ev evVar3 = this.otpViewModel;
        if (evVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
            evVar3 = null;
        }
        evVar3.k().g(this, new g(new b()));
        ev evVar4 = this.otpViewModel;
        if (evVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
            evVar4 = null;
        }
        evVar4.m().g(this, new g(new c()));
        ev evVar5 = this.otpViewModel;
        if (evVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
        } else {
            evVar = evVar5;
        }
        evVar.l().g(this, new g(new d()));
        D1().Z().g(this, new mf4() { // from class: com.zepto.sv6
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanApplication.M1(this.a, (RequireDataForBePaymet) obj);
            }
        });
        D1().a0().g(this, new mf4() { // from class: com.zepto.uv6
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanApplication.N1(this.a, (String) obj);
            }
        });
        D1().V().g(this, new g(new e()));
        D1().W().g(this, new g(new f()));
    }

    public final void y1(String rcNo, String chassisNo) {
        B1().show();
        ev evVar = this.otpViewModel;
        if (evVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpViewModel");
            evVar = null;
        }
        evVar.p(this, rcNo, chassisNo);
    }

    public final boolean z1(ArrayList transList) {
        Intrinsics.checkNotNullParameter(transList, "transList");
        if (transList.size() > 0 && transList.size() > 0 && ((ApplStatusTransListModel) transList.get(0)).getCurrentlist().size() > 0) {
            ArrayList<ApplStatusCurrentListModel> currentlist = ((ApplStatusTransListModel) transList.get(0)).getCurrentlist();
            int size = currentlist.size();
            for (int i = 0; i < size; i++) {
                Log.e("Pending2", "119");
                if (VContant.INSTANCE.H(String.valueOf(currentlist.get(i).getPurCd()))) {
                    String string = currentlist.get(i).getStatusDesc().toString();
                    this.purposeCode = String.valueOf(currentlist.get(i).getPurCd());
                    return StringsKt__StringsKt.contains((CharSequence) string, (CharSequence) "Please do final submit", true) || StringsKt__StringsKt.contains((CharSequence) string, (CharSequence) "final submit", true);
                }
            }
        }
        return false;
    }
}
