package com.nic.mparivahan.dlservices.ui.ViewDocs;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.format.DateFormat;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sarathithreeservices.model.GetApplInfoResponse;
import com.nic.mparivahan.Sarathithreeservices.model.ResponseBody;
import com.nic.mparivahan.Sarathithreeservices.model.ResponseMessage;
import com.nic.mparivahan.Sarathithreeservices.network.GetApplStatusService;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.nic.mparivahan.dlservices.ui.ViewDocs.AppNumberScreen;
import com.zepto.bj2;
import com.zepto.cx;
import com.zepto.dx;
import com.zepto.k6;
import com.zepto.lr1;
import com.zepto.mf4;
import com.zepto.mt6;
import com.zepto.nr1;
import com.zepto.o40;
import com.zepto.q44;
import com.zepto.rq1;
import com.zepto.ta3;
import com.zepto.va3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.ws6;
import com.zepto.yk1;
import java.util.Calendar;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u0016\u0010\u0012\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000eR\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010$R\u0016\u0010)\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010$R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0016\u0010?\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010$R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\"\u0010J\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010V\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u00108\u001a\u0004\bT\u0010:\"\u0004\bU\u0010<R\"\u0010^\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010f\u001a\u00020_8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010n\u001a\u00020g8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR$\u0010t\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010$\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010x\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bu\u0010$\u001a\u0004\bv\u0010q\"\u0004\bw\u0010sR$\u0010|\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010$\u001a\u0004\bz\u0010q\"\u0004\b{\u0010sR\u0017\u0010\u0080\u0001\u001a\u00020}8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b~\u0010\u007f¨\u0006\u0083\u0001"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/ViewDocs/AppNumberScreen;", "Lcom/zepto/o40;", "", "O1", "i2", "k2", "X1", "U1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "Landroid/content/Context;", "context", "", "message", "o2", "mobile_no", "C2", "Lcom/zepto/k6;", "F", "Lcom/zepto/k6;", "b2", "()Lcom/zepto/k6;", "t2", "(Lcom/zepto/k6;)V", "mBinding", "Ljava/util/Calendar;", "G", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "H", "Ljava/lang/String;", "dateformate", "I", "appNo", "J", "dob", "Lcom/zepto/cx;", "K", "Lcom/zepto/cx;", "appStatusVM", "Lcom/nic/mparivahan/Sarathithreeservices/network/GetApplStatusService;", "L", "Lcom/nic/mparivahan/Sarathithreeservices/network/GetApplStatusService;", "W1", "()Lcom/nic/mparivahan/Sarathithreeservices/network/GetApplStatusService;", "q2", "(Lcom/nic/mparivahan/Sarathithreeservices/network/GetApplStatusService;)V", "appInfoService", "Lcom/zepto/wl5;", "M", "Lcom/zepto/wl5;", "g2", "()Lcom/zepto/wl5;", "z2", "(Lcom/zepto/wl5;)V", "sarthiSession", "N", "title_name", "Lcom/zepto/yk1;", "O", "Lcom/zepto/yk1;", "viewModel", "P", "Landroid/content/Context;", "c2", "()Landroid/content/Context;", "u2", "(Landroid/content/Context;)V", "mContext", "Lcom/zepto/wa3;", "Q", "Lcom/zepto/wa3;", "a2", "()Lcom/zepto/wa3;", "s2", "(Lcom/zepto/wa3;)V", "langSession", "R", "f2", "y2", "sarathiSession", "Lcom/zepto/nr1;", "S", "Lcom/zepto/nr1;", "Z1", "()Lcom/zepto/nr1;", "r2", "(Lcom/zepto/nr1;)V", "dlServicesViewModel", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "T", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "e2", "()Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "x2", "(Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;)V", "retrofitService", "Lcom/zepto/ws6;", "U", "Lcom/zepto/ws6;", "h2", "()Lcom/zepto/ws6;", "A2", "(Lcom/zepto/ws6;)V", "sessionManager", "V", "getRecord_id", "()Ljava/lang/String;", "w2", "(Ljava/lang/String;)V", "record_id", "W", "d2", "v2", "mobileNumber", "X", "getStateCode", "B2", "stateCode", "Landroid/app/ProgressDialog;", "Y", "Landroid/app/ProgressDialog;", "dialog", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class AppNumberScreen extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public k6 mBinding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public Calendar cal;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String dateformate;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String appNo;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String dob;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public cx appStatusVM;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public GetApplStatusService appInfoService;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String title_name;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public yk1 viewModel;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public wl5 sarathiSession;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public nr1 dlServicesViewModel;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public DlServiceInt retrofitService;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String record_id;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String mobileNumber;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String stateCode;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public ProgressDialog dialog;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: com.nic.mparivahan.dlservices.ui.ViewDocs.AppNumberScreen$a$a, reason: collision with other inner class name */
        public static final class C0059a extends Lambda implements Function1 {
            public static final C0059a c = new C0059a();

            public C0059a() {
                super(1);
            }

            public final void invoke(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return Unit.INSTANCE;
            }
        }

        public a() {
            super(1);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void a(SendOtpResult sendOtpResult) {
            ProgressDialog progressDialog = AppNumberScreen.this.dialog;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            progressDialog.dismiss();
            try {
                if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL001", true)) {
                    AppNumberScreen.this.w2(String.valueOf(sendOtpResult.getRecordId()));
                    AppNumberScreen appNumberScreen = AppNumberScreen.this;
                    appNumberScreen.C2(appNumberScreen, StringsKt__StringsKt.trim((CharSequence) appNumberScreen.d2()).toString());
                } else if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL099", true)) {
                    mt6.a.c(AppNumberScreen.this, sendOtpResult.getStatusDesc());
                } else {
                    AppNumberScreen appNumberScreen2 = AppNumberScreen.this;
                    String strB = appNumberScreen2.a2().b("nex_parivahan", AppNumberScreen.this.getString(R.string.app_name));
                    Intrinsics.checkNotNull(strB);
                    String statusDesc = sendOtpResult.getStatusDesc();
                    String strB2 = AppNumberScreen.this.a2().b("btn_ok", AppNumberScreen.this.getString(R.string.ok_txt));
                    Intrinsics.checkNotNull(strB2);
                    o40.q1(appNumberScreen2, strB, statusDesc, 1, strB2, null, C0059a.c, 16, null);
                }
            } catch (Exception unused) {
                AppNumberScreen appNumberScreen3 = AppNumberScreen.this;
                Context contextC2 = appNumberScreen3.c2();
                String strB3 = AppNumberScreen.this.a2().b("label_went_wrong", AppNumberScreen.this.getString(R.string.something_please_try_after_some_time));
                Intrinsics.checkNotNull(strB3);
                appNumberScreen3.o2(contextC2, strB3);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SendOtpResult) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public static final b c = new b();

        public b() {
            super(1);
        }

        public final void invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public static final c c = new c();

        public c() {
            super(1);
        }

        public final void invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public static final d c = new d();

        public d() {
            super(1);
        }

        public final void invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function1 {
        public static final e c = new e();

        public e() {
            super(1);
        }

        public final void invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function1 {
        public static final f c = new f();

        public f() {
            super(1);
        }

        public final void invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        public final void a(GetApplInfoResponse getApplInfoResponse) {
            Integer statusCode;
            ProgressDialog progressDialog = AppNumberScreen.this.dialog;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            progressDialog.dismiss();
            try {
                ResponseMessage responseMessage = getApplInfoResponse.getResponseMessage();
                if (responseMessage != null && (statusCode = responseMessage.getStatusCode()) != null && statusCode.intValue() == 200) {
                    AppNumberScreen appNumberScreen = AppNumberScreen.this;
                    ResponseBody responseBody = getApplInfoResponse.getResponseBody();
                    Intrinsics.checkNotNull(responseBody);
                    appNumberScreen.B2(responseBody.getApdStateCd());
                    ResponseBody responseBody2 = getApplInfoResponse.getResponseBody();
                    Intrinsics.checkNotNull(responseBody2);
                    if (responseBody2.getApdMobileNo() == null) {
                        AppNumberScreen.this.v2("NA");
                    } else {
                        AppNumberScreen appNumberScreen2 = AppNumberScreen.this;
                        ResponseBody responseBody3 = getApplInfoResponse.getResponseBody();
                        Intrinsics.checkNotNull(responseBody3);
                        appNumberScreen2.v2(String.valueOf(responseBody3.getApdMobileNo()));
                    }
                    nr1 nr1VarZ1 = AppNumberScreen.this.Z1();
                    AppNumberScreen appNumberScreen3 = AppNumberScreen.this;
                    nr1VarZ1.F(appNumberScreen3, appNumberScreen3.d2(), AppNumberScreen.this.h2().k());
                    return;
                }
                AppNumberScreen appNumberScreen4 = AppNumberScreen.this;
                Context contextC2 = appNumberScreen4.c2();
                ResponseMessage responseMessage2 = getApplInfoResponse.getResponseMessage();
                appNumberScreen4.o2(contextC2, responseMessage2 != null ? responseMessage2.getDeveloperMessage() : null);
            } catch (Exception unused) {
                AppNumberScreen appNumberScreen5 = AppNumberScreen.this;
                appNumberScreen5.o2(appNumberScreen5.c2(), AppNumberScreen.this.a2().b("service_is_not_present", AppNumberScreen.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetApplInfoResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class h implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public h(Function1 function) {
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

    public static final class i extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ AppNumberScreen b;
        public final /* synthetic */ Ref.ObjectRef c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(TextView textView, AppNumberScreen appNumberScreen, Ref.ObjectRef objectRef) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = appNumberScreen;
            this.c = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.CountDownTimer
        public void onFinish() {
            ((TextView) this.c.element).setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            Log.e("calling", "321");
            this.a.setText(this.b.a2().b("time_remaining", this.b.getString(R.string.time_remaining)) + " : " + (j / ((long) 1000)));
            ((TextView) this.c.element).setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    public static final class j extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ AppNumberScreen b;
        public final /* synthetic */ Ref.ObjectRef c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(TextView textView, AppNumberScreen appNumberScreen, Ref.ObjectRef objectRef) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = appNumberScreen;
            this.c = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.CountDownTimer
        public void onFinish() {
            ((TextView) this.c.element).setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.a.setText(this.b.a2().b("time_remaining", this.b.getString(R.string.time_remaining)) + " : " + (j / ((long) 1000)));
            ((TextView) this.c.element).setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    public AppNumberScreen() {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
        this.cal = calendar;
    }

    public static final void D2(EditText enterOtp, ImageView shownPin, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        Intrinsics.checkNotNullParameter(shownPin, "$shownPin");
        if (enterOtp.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            shownPin.setImageResource(R.drawable.pass_visible);
            enterOtp.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            shownPin.setImageResource(R.drawable.mvvm_visibility);
            enterOtp.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public static final void E2(AppNumberScreen this$0, TextView time_text, Ref.ObjectRef resendOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(time_text, "$time_text");
        Intrinsics.checkNotNullParameter(resendOtp, "$resendOtp");
        ProgressDialog progressDialog = this$0.dialog;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog = null;
        }
        progressDialog.show();
        this$0.Z1().D(this$0, String.valueOf(this$0.record_id));
        new j(time_text, this$0, resendOtp).start();
    }

    public static final void F2(AppNumberScreen this$0, EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.a2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
            return;
        }
        Editable text = enterOtp.getText();
        Intrinsics.checkNotNull(text);
        if (text.length() == 0) {
            Toast.makeText(this$0, this$0.a2().b("label_log_entr_otp", this$0.getString(R.string.pls_enter_otp)), 0).show();
            return;
        }
        Editable text2 = enterOtp.getText();
        Intrinsics.checkNotNull(text2);
        if (text2.length() < 6) {
            Toast.makeText(this$0, this$0.a2().b("label_log_entr_val_otp", this$0.getString(R.string.pls_enter_valid_otp)), 0).show();
            return;
        }
        ProgressDialog progressDialog = this$0.dialog;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog = null;
        }
        progressDialog.show();
        nr1 nr1VarZ1 = this$0.Z1();
        String string = enterOtp.getText().toString();
        String str = this$0.record_id;
        Intrinsics.checkNotNull(str);
        nr1VarZ1.G(this$0, string, str);
    }

    public static final void G2(EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        enterOtp.setText("");
    }

    public static final void H2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void O1() {
        Z1().u().g(this, new h(new a()));
        Z1().t().g(this, new mf4() { // from class: com.zepto.ws
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                AppNumberScreen.P1(this.a, (String) obj);
            }
        });
        Z1().E().g(this, new mf4() { // from class: com.zepto.xs
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                AppNumberScreen.Q1(this.a, (OtpVerifyResult) obj);
            }
        });
        Z1().w().g(this, new mf4() { // from class: com.zepto.ys
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                AppNumberScreen.R1(this.a, (ResendOtp) obj);
            }
        });
        Z1().v().g(this, new mf4() { // from class: com.zepto.zs
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                AppNumberScreen.S1(this.a, (String) obj);
            }
        });
    }

    public static final void P1(AppNumberScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ProgressDialog progressDialog = this$0.dialog;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog = null;
        }
        progressDialog.dismiss();
        Context contextC2 = this$0.c2();
        String strB = this$0.a2().b("label_went_wrong", this$0.getString(R.string.something_please_try_after_some_time));
        Intrinsics.checkNotNull(strB);
        this$0.o2(contextC2, strB);
    }

    public static final void Q1(AppNumberScreen this$0, OtpVerifyResult otpVerifyResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ProgressDialog progressDialog = this$0.dialog;
        ProgressDialog progressDialog2 = null;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog = null;
        }
        progressDialog.dismiss();
        try {
            if (!StringsKt__StringsJVMKt.equals(otpVerifyResult.getStatusCode(), "AL001", true)) {
                this$0.o2(this$0.c2(), otpVerifyResult.getStatusDesc());
                return;
            }
            Intent intent = new Intent(this$0, (Class<?>) AppDetailsScreen.class);
            String str = this$0.appNo;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appNo");
                str = null;
            }
            intent.putExtra("app_no", str);
            String str2 = this$0.dob;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dob");
                str2 = null;
            }
            intent.putExtra("dob", str2);
            intent.putExtra("stateCode", this$0.stateCode);
            this$0.startActivity(intent);
            this$0.finish();
        } catch (Exception unused) {
            ProgressDialog progressDialog3 = this$0.dialog;
            if (progressDialog3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
            } else {
                progressDialog2 = progressDialog3;
            }
            progressDialog2.dismiss();
            Context contextC2 = this$0.c2();
            String strB = this$0.a2().b("label_went_wrong", this$0.getString(R.string.something_please_try_after_some_time));
            Intrinsics.checkNotNull(strB);
            this$0.o2(contextC2, strB);
        }
    }

    public static final void R1(AppNumberScreen this$0, ResendOtp resendOtp) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ProgressDialog progressDialog = this$0.dialog;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog = null;
        }
        progressDialog.dismiss();
        try {
            if (StringsKt__StringsJVMKt.equals(resendOtp.getStatusCode(), "AL001", true)) {
                String strB = this$0.a2().b("nex_parivahan", this$0.getString(R.string.app_name));
                Intrinsics.checkNotNull(strB);
                String strB2 = this$0.a2().b("otp_resent", this$0.getString(R.string.otp_resent));
                Intrinsics.checkNotNull(strB2);
                String strB3 = this$0.a2().b("btn_ok", this$0.getString(R.string.ok_txt));
                Intrinsics.checkNotNull(strB3);
                o40.q1(this$0, strB, strB2, 1, strB3, null, b.c, 16, null);
            } else if (StringsKt__StringsJVMKt.equals(resendOtp.getStatusCode(), "AL002", true)) {
                String strB4 = this$0.a2().b("nex_parivahan", this$0.getString(R.string.app_name));
                Intrinsics.checkNotNull(strB4);
                String statusDesc = resendOtp.getStatusDesc();
                String strB5 = this$0.a2().b("btn_ok", this$0.getString(R.string.ok_txt));
                Intrinsics.checkNotNull(strB5);
                o40.q1(this$0, strB4, statusDesc, 1, strB5, null, c.c, 16, null);
            } else {
                String strB6 = this$0.a2().b("nex_parivahan", this$0.getString(R.string.app_name));
                Intrinsics.checkNotNull(strB6);
                String statusDesc2 = resendOtp.getStatusDesc();
                String strB7 = this$0.a2().b("btn_ok", this$0.getString(R.string.ok_txt));
                Intrinsics.checkNotNull(strB7);
                o40.q1(this$0, strB6, statusDesc2, 1, strB7, null, d.c, 16, null);
            }
        } catch (Exception unused) {
            String strB8 = this$0.a2().b("nex_parivahan", this$0.getString(R.string.app_name));
            Intrinsics.checkNotNull(strB8);
            String strB9 = this$0.a2().b("label_log_unbl_veri_otp", this$0.getString(R.string.unable_verifiy_otp));
            Intrinsics.checkNotNull(strB9);
            String strB10 = this$0.a2().b("btn_ok", this$0.getString(R.string.ok_txt));
            Intrinsics.checkNotNull(strB10);
            o40.q1(this$0, strB8, strB9, 1, strB10, null, e.c, 16, null);
        }
    }

    public static final void S1(AppNumberScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ProgressDialog progressDialog = this$0.dialog;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog = null;
        }
        progressDialog.dismiss();
        String strB = this$0.a2().b("nex_parivahan", this$0.getString(R.string.app_name));
        Intrinsics.checkNotNull(strB);
        String strB2 = this$0.a2().b("label_log_unbl_veri_otp", this$0.getString(R.string.unable_verifiy_otp));
        Intrinsics.checkNotNull(strB2);
        String strB3 = this$0.a2().b("btn_ok", this$0.getString(R.string.ok_txt));
        Intrinsics.checkNotNull(strB3);
        o40.q1(this$0, strB, strB2, 1, strB3, null, f.c, 16, null);
    }

    private final void U1() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.bt
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                AppNumberScreen.V1(this.a, datePicker, i2, i3, i4);
            }
        }, this.cal.get(1), this.cal.get(2), this.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void V1(AppNumberScreen this$0, DatePicker datePicker, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cal.set(1, i2);
        this$0.cal.set(2, i3);
        this$0.cal.set(5, i4);
        CharSequence charSequence = DateFormat.format("dd", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence2 = DateFormat.format("MM", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence3 = DateFormat.format("yyyy", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence3, "null cannot be cast to non-null type kotlin.String");
        String str = ((String) charSequence) + '-' + ((String) charSequence2) + '-' + ((String) charSequence3);
        this$0.dateformate = str;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dateformate");
            str = null;
        }
        Log.e("Date-", str);
        TextView textView = this$0.b2().b;
        String str3 = this$0.dateformate;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dateformate");
        } else {
            str2 = str3;
        }
        textView.setText(str2);
    }

    private final void X1() {
        cx cxVar = this.appStatusVM;
        cx cxVar2 = null;
        if (cxVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appStatusVM");
            cxVar = null;
        }
        cxVar.j().g(this, new h(new g()));
        cx cxVar3 = this.appStatusVM;
        if (cxVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appStatusVM");
        } else {
            cxVar2 = cxVar3;
        }
        cxVar2.i().g(this, new mf4() { // from class: com.zepto.at
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                AppNumberScreen.Y1(this.a, (String) obj);
            }
        });
    }

    public static final void Y1(AppNumberScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ProgressDialog progressDialog = this$0.dialog;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog = null;
        }
        progressDialog.dismiss();
        this$0.o2(this$0.c2(), this$0.a2().b("service_is_not_present", this$0.getString(R.string.unable_to_get_details)));
    }

    private final void i2() {
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.dialog = progressDialog;
        progressDialog.setMessage(a2().b("label_challan_please_wait", "Please wait..."));
        ProgressDialog progressDialog2 = this.dialog;
        ProgressDialog progressDialog3 = null;
        if (progressDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog2 = null;
        }
        progressDialog2.setCanceledOnTouchOutside(false);
        ProgressDialog progressDialog4 = this.dialog;
        if (progressDialog4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        } else {
            progressDialog3 = progressDialog4;
        }
        progressDialog3.setCancelable(false);
        b2().g.f.setText(f2().k());
        b2().g.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppNumberScreen.j2(this.a, view);
            }
        });
        this.appStatusVM = (cx) new z(this, new dx(new bj2(W1()))).a(cx.class);
        z2(new wl5(this));
        this.title_name = g2().k();
        X1();
    }

    public static final void j2(AppNumberScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final void k2() {
        b2().e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ms
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppNumberScreen.l2(this.a, view);
            }
        });
        b2().l.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ts
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppNumberScreen.m2(this.a, view);
            }
        });
        b2().d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.us
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppNumberScreen.n2(this.a, view);
            }
        });
    }

    public static final void l2(AppNumberScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.U1();
    }

    public static final void m2(AppNumberScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.appNo = this$0.b2().c.getText().toString();
        this$0.dob = this$0.b2().b.getText().toString();
        String str = this$0.appNo;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appNo");
            str = null;
        }
        if (Intrinsics.areEqual(str, "")) {
            Toast.makeText(this$0, this$0.a2().b(va3.a.E(), this$0.getString(R.string.enter_application_no)), 1).show();
            return;
        }
        String str3 = this$0.dob;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dob");
            str3 = null;
        }
        if (Intrinsics.areEqual(str3, "")) {
            Toast.makeText(this$0, this$0.a2().b("edit_dl_serv_dob", this$0.getString(R.string.enter_dob)), 1).show();
            return;
        }
        if (!q44.a.a(this$0)) {
            Toast.makeText(this$0, this$0.a2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
            return;
        }
        ProgressDialog progressDialog = this$0.dialog;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog = null;
        }
        progressDialog.show();
        cx cxVar = this$0.appStatusVM;
        if (cxVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appStatusVM");
            cxVar = null;
        }
        String str4 = this$0.appNo;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appNo");
            str4 = null;
        }
        String str5 = this$0.dob;
        if (str5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dob");
        } else {
            str2 = str5;
        }
        cxVar.g(this$0, str4, str2);
    }

    public static final void n2(AppNumberScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public final void A2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final void B2(String str) {
        this.stateCode = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [T, android.widget.TextView] */
    public final void C2(Context context, String mobile_no) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.validateotp);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewFindViewById;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        View viewFindViewById2 = dialog.findViewById(R.id.resendOtp);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        objectRef.element = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.showmpin);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.ImageView");
        final ImageView imageView2 = (ImageView) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.submitOtp);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById4;
        View viewFindViewById5 = dialog.findViewById(R.id.enterOtp);
        Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText = (EditText) viewFindViewById5;
        View viewFindViewById6 = dialog.findViewById(R.id.time_text);
        Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.TextView");
        final TextView textView2 = (TextView) viewFindViewById6;
        View viewFindViewById7 = dialog.findViewById(R.id.txt_reset);
        Intrinsics.checkNotNull(viewFindViewById7, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) viewFindViewById7;
        View viewFindViewById8 = dialog.findViewById(R.id.disPlay_mobile);
        Intrinsics.checkNotNull(viewFindViewById8, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView4 = (TextView) viewFindViewById8;
        View viewFindViewById9 = dialog.findViewById(R.id.disPlay);
        Intrinsics.checkNotNull(viewFindViewById9, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById10 = dialog.findViewById(R.id.enter_otp_txt);
        Intrinsics.checkNotNull(viewFindViewById10, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById9).setText(a2().b("otp_verification", getString(R.string.otp_verification)));
        textView.setText(a2().b("vahan_btn_submit", getString(R.string.submit)));
        textView3.setText(a2().b("btn_reset", getString(R.string.reset)));
        ((TextView) objectRef.element).setText(a2().b("label_resend_otp", getString(R.string.resend_otp)));
        editText.setHint(a2().b("edit_enter_otp", getString(R.string.enter_otp)));
        ((TextView) viewFindViewById10).setText(a2().b("edit_enter_otp", getString(R.string.enter_otp)));
        try {
            if (mobile_no.length() == 10) {
                StringBuilder sb = new StringBuilder();
                sb.append(a2().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
                sb.append("\n+91 - XXXXXX");
                String strSubstring = mobile_no.substring(6, 10);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(strSubstring);
                textView4.setText(sb.toString());
            } else {
                textView4.setText(a2().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
            }
        } catch (Exception unused) {
            textView4.setText(a2().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
        }
        new i(textView2, this, objectRef).start();
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.os
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppNumberScreen.D2(editText, imageView2, view);
            }
        });
        ((TextView) objectRef.element).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ps
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppNumberScreen.E2(this.a, textView2, objectRef, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppNumberScreen.F2(this.a, editText, view);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppNumberScreen.G2(editText, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ss
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppNumberScreen.H2(dialog, view);
            }
        });
        dialog.show();
    }

    public final GetApplStatusService W1() {
        GetApplStatusService getApplStatusService = this.appInfoService;
        if (getApplStatusService != null) {
            return getApplStatusService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appInfoService");
        return null;
    }

    public final nr1 Z1() {
        nr1 nr1Var = this.dlServicesViewModel;
        if (nr1Var != null) {
            return nr1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlServicesViewModel");
        return null;
    }

    public final wa3 a2() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final k6 b2() {
        k6 k6Var = this.mBinding;
        if (k6Var != null) {
            return k6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    public final Context c2() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final String d2() {
        String str = this.mobileNumber;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mobileNumber");
        return null;
    }

    public final DlServiceInt e2() {
        DlServiceInt dlServiceInt = this.retrofitService;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final wl5 f2() {
        wl5 wl5Var = this.sarathiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarathiSession");
        return null;
    }

    public final wl5 g2() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final ws6 h2() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final void o2(Context context, String message) {
        Intrinsics.checkNotNull(context);
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
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(a2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(a2().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ns
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppNumberScreen.p2(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        k6 k6VarC = k6.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(k6VarC, "inflate(...)");
        t2(k6VarC);
        setContentView(b2().b());
        u2(this);
        y2(new wl5(c2()));
        A2(new ws6(c2()));
        ta3.a.n(this, b2());
        s2(new wa3(this));
        q2(GetApplStatusService.INSTANCE.a(c2()));
        this.viewModel = (yk1) new z(this).a(yk1.class);
        x2(DlServiceInt.INSTANCE.a(c2()));
        r2((nr1) new z(this, new rq1(new lr1(e2(), this))).a(nr1.class));
        i2();
        k2();
        O1();
    }

    public final void q2(GetApplStatusService getApplStatusService) {
        Intrinsics.checkNotNullParameter(getApplStatusService, "<set-?>");
        this.appInfoService = getApplStatusService;
    }

    public final void r2(nr1 nr1Var) {
        Intrinsics.checkNotNullParameter(nr1Var, "<set-?>");
        this.dlServicesViewModel = nr1Var;
    }

    public final void s2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void t2(k6 k6Var) {
        Intrinsics.checkNotNullParameter(k6Var, "<set-?>");
        this.mBinding = k6Var;
    }

    public final void u2(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void v2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobileNumber = str;
    }

    public final void w2(String str) {
        this.record_id = str;
    }

    public final void x2(DlServiceInt dlServiceInt) {
        Intrinsics.checkNotNullParameter(dlServiceInt, "<set-?>");
        this.retrofitService = dlServiceInt;
    }

    public final void y2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarathiSession = wl5Var;
    }

    public final void z2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }
}
