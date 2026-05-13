package com.nic.mparivahan.AddCov.View;

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
import com.nic.mparivahan.AddCov.AddCovInterface;
import com.nic.mparivahan.AddCov.PojoClass.ApplStatusDetails;
import com.nic.mparivahan.AddCov.PojoClass.DataRequestPojo;
import com.nic.mparivahan.AddCov.View.CovApplication;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.zepto.lr1;
import com.zepto.mf4;
import com.zepto.mt6;
import com.zepto.nr1;
import com.zepto.o40;
import com.zepto.pi;
import com.zepto.q44;
import com.zepto.qi;
import com.zepto.r8;
import com.zepto.ri;
import com.zepto.rq1;
import com.zepto.ta3;
import com.zepto.va3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.ws6;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\by\u0010zJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\u001a\u0010\r\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000bH\u0007J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0007R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010-\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010U\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010\\\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u0010`\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010W\u001a\u0004\b^\u0010Y\"\u0004\b_\u0010[R\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010p\u001a\u00020i8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\u0016\u0010r\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bq\u0010WR\u0016\u0010t\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bs\u0010WR\u0016\u0010v\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bu\u0010WR\u0016\u0010x\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bw\u0010W¨\u0006{"}, d2 = {"Lcom/nic/mparivahan/AddCov/View/CovApplication;", "Lcom/zepto/o40;", "", "Y1", "I1", "N1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "c2", "mobile_no", "o2", "onBackPressed", "date", "M1", "Lcom/zepto/qi;", "F", "Lcom/zepto/qi;", "mAddCovModel", "Lcom/nic/mparivahan/AddCov/AddCovInterface;", "G", "Lcom/nic/mparivahan/AddCov/AddCovInterface;", "mAddCovInterface", "Landroid/app/ProgressDialog;", "H", "Landroid/app/ProgressDialog;", "dialog", "Lcom/zepto/wa3;", "I", "Lcom/zepto/wa3;", "Q1", "()Lcom/zepto/wa3;", "f2", "(Lcom/zepto/wa3;)V", "langSession", "J", "Landroid/content/Context;", "T1", "()Landroid/content/Context;", "i2", "(Landroid/content/Context;)V", "mContext", "Lcom/zepto/wl5;", "K", "Lcom/zepto/wl5;", "W1", "()Lcom/zepto/wl5;", "m2", "(Lcom/zepto/wl5;)V", "sahi_session", "Lcom/zepto/r8;", "L", "Lcom/zepto/r8;", "S1", "()Lcom/zepto/r8;", "h2", "(Lcom/zepto/r8;)V", "mBinding", "Lcom/zepto/nr1;", "M", "Lcom/zepto/nr1;", "P1", "()Lcom/zepto/nr1;", "e2", "(Lcom/zepto/nr1;)V", "dlServicesViewModel", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "N", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "V1", "()Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "l2", "(Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;)V", "retrofitService", "Lcom/zepto/ws6;", "O", "Lcom/zepto/ws6;", "X1", "()Lcom/zepto/ws6;", "n2", "(Lcom/zepto/ws6;)V", "sessionManager", "P", "Ljava/lang/String;", "getRecord_id", "()Ljava/lang/String;", "k2", "(Ljava/lang/String;)V", "record_id", "Q", "U1", "j2", "mobileNumber", "Lcom/nic/mparivahan/AddCov/PojoClass/ApplStatusDetails;", "R", "Lcom/nic/mparivahan/AddCov/PojoClass/ApplStatusDetails;", "R1", "()Lcom/nic/mparivahan/AddCov/PojoClass/ApplStatusDetails;", "g2", "(Lcom/nic/mparivahan/AddCov/PojoClass/ApplStatusDetails;)V", "mApplStatusDetails", "Ljava/util/Calendar;", "S", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "T", "dateformate", "U", "appNo", "V", "dob", "W", "newdob", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class CovApplication extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public qi mAddCovModel;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public AddCovInterface mAddCovInterface;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ProgressDialog dialog;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public wl5 sahi_session;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public r8 mBinding;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public nr1 dlServicesViewModel;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public DlServiceInt retrofitService;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String record_id;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String mobileNumber;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public ApplStatusDetails mApplStatusDetails;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public Calendar cal;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String dateformate;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String appNo;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String dob;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String newdob;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            ProgressDialog progressDialog = CovApplication.this.dialog;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            progressDialog.dismiss();
            try {
                if (StringsKt__StringsKt.contains$default((CharSequence) str.toString(), (CharSequence) "status_code", false, 2, (Object) null)) {
                    String string = new JSONObject(str).getString("status_desc");
                    CovApplication covApplication = CovApplication.this;
                    covApplication.c2(covApplication.T1(), string);
                } else {
                    CovApplication covApplication2 = CovApplication.this;
                    covApplication2.c2(covApplication2.T1(), CovApplication.this.Q1().b("error_msg_record_not_found", "Record not found"));
                }
            } catch (Exception unused) {
                CovApplication covApplication3 = CovApplication.this;
                covApplication3.c2(covApplication3.T1(), CovApplication.this.Q1().b("error_msg_record_not_found", "Record not found"));
            }
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
            ProgressDialog progressDialog = CovApplication.this.dialog;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            progressDialog.dismiss();
            CovApplication covApplication = CovApplication.this;
            covApplication.c2(covApplication.T1(), "Something went wrong, Try after some time");
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(DataRequestPojo dataRequestPojo) {
            ProgressDialog progressDialog = CovApplication.this.dialog;
            String str = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            progressDialog.dismiss();
            try {
                if (!Intrinsics.areEqual(dataRequestPojo.getStatus_code(), "00")) {
                    String status_desc = dataRequestPojo.getStatus_desc();
                    if (status_desc != null && status_desc.length() != 0) {
                        CovApplication covApplication = CovApplication.this;
                        covApplication.c2(covApplication.T1(), dataRequestPojo.getStatus_desc());
                        return;
                    }
                    CovApplication covApplication2 = CovApplication.this;
                    covApplication2.c2(covApplication2.T1(), CovApplication.this.Q1().b("error_msg_record_not_found", "Record not found"));
                    return;
                }
                CovApplication.this.g2(dataRequestPojo.getApplStatus_Details());
                ApplStatusDetails applStatus_Details = dataRequestPojo.getApplStatus_Details();
                Intrinsics.checkNotNull(applStatus_Details);
                String mobileNO = applStatus_Details.getMobileNO();
                if (mobileNO != null && mobileNO.length() != 0) {
                    CovApplication covApplication3 = CovApplication.this;
                    ApplStatusDetails applStatus_Details2 = dataRequestPojo.getApplStatus_Details();
                    Intrinsics.checkNotNull(applStatus_Details2);
                    covApplication3.j2(applStatus_Details2.getMobileNO());
                    nr1 nr1VarP1 = CovApplication.this.P1();
                    CovApplication covApplication4 = CovApplication.this;
                    String mobileNumber = covApplication4.getMobileNumber();
                    Intrinsics.checkNotNull(mobileNumber);
                    nr1VarP1.F(covApplication4, mobileNumber, CovApplication.this.X1().k());
                    return;
                }
                Intent intent = new Intent(CovApplication.this, (Class<?>) CovDetails.class);
                intent.putExtra("ApplStatusDetails", CovApplication.this.R1());
                String str2 = CovApplication.this.appNo;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("appNo");
                    str2 = null;
                }
                intent.putExtra("app_number", str2);
                String str3 = CovApplication.this.newdob;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("newdob");
                } else {
                    str = str3;
                }
                intent.putExtra("newdob", str);
                CovApplication.this.startActivity(intent);
                CovApplication.this.finish();
            } catch (Exception e) {
                e.printStackTrace();
                CovApplication covApplication5 = CovApplication.this;
                covApplication5.c2(covApplication5.T1(), CovApplication.this.Q1().b("error_msg_record_not_found", "Record not found"));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DataRequestPojo) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {

        public static final class a extends Lambda implements Function1 {
            public static final a c = new a();

            public a() {
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

        public d() {
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
            ProgressDialog progressDialog = CovApplication.this.dialog;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            progressDialog.dismiss();
            try {
                if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL001", true)) {
                    CovApplication.this.k2(String.valueOf(sendOtpResult.getRecordId()));
                    CovApplication covApplication = CovApplication.this;
                    String mobileNumber = covApplication.getMobileNumber();
                    Intrinsics.checkNotNull(mobileNumber);
                    covApplication.o2(covApplication, StringsKt__StringsKt.trim((CharSequence) mobileNumber).toString());
                } else if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL099", true)) {
                    mt6.a.c(CovApplication.this, sendOtpResult.getStatusDesc());
                } else {
                    CovApplication covApplication2 = CovApplication.this;
                    String strB = covApplication2.Q1().b("nex_parivahan", CovApplication.this.getString(R.string.app_name));
                    Intrinsics.checkNotNull(strB);
                    String statusDesc = sendOtpResult.getStatusDesc();
                    String strB2 = CovApplication.this.Q1().b("btn_ok", CovApplication.this.getString(R.string.ok_txt));
                    Intrinsics.checkNotNull(strB2);
                    o40.q1(covApplication2, strB, statusDesc, 1, strB2, null, a.c, 16, null);
                }
            } catch (Exception unused) {
                CovApplication covApplication3 = CovApplication.this;
                Context contextT1 = covApplication3.T1();
                String strB3 = CovApplication.this.Q1().b("label_went_wrong", CovApplication.this.getString(R.string.something_please_try_after_some_time));
                Intrinsics.checkNotNull(strB3);
                covApplication3.c2(contextT1, strB3);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SendOtpResult) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            ProgressDialog progressDialog = CovApplication.this.dialog;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            progressDialog.dismiss();
            CovApplication covApplication = CovApplication.this;
            Context contextT1 = covApplication.T1();
            String strB = CovApplication.this.Q1().b("record_error_msg", CovApplication.this.T1().getString(R.string.service_unavable_please_try));
            Intrinsics.checkNotNull(strB);
            covApplication.c2(contextT1, strB);
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        public final void a(OtpVerifyResult otpVerifyResult) {
            Log.e("sub", otpVerifyResult.toString());
            ProgressDialog progressDialog = CovApplication.this.dialog;
            ProgressDialog progressDialog2 = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            progressDialog.dismiss();
            try {
                if (!StringsKt__StringsJVMKt.equals(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    CovApplication covApplication = CovApplication.this;
                    covApplication.c2(covApplication.T1(), otpVerifyResult.getStatusDesc());
                    return;
                }
                Intent intent = new Intent(CovApplication.this, (Class<?>) CovDetails.class);
                intent.putExtra("ApplStatusDetails", CovApplication.this.R1());
                String str = CovApplication.this.appNo;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("appNo");
                    str = null;
                }
                intent.putExtra("app_number", str);
                String str2 = CovApplication.this.newdob;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("newdob");
                    str2 = null;
                }
                intent.putExtra("newdob", str2);
                CovApplication.this.startActivity(intent);
                CovApplication.this.finish();
            } catch (Exception unused) {
                ProgressDialog progressDialog3 = CovApplication.this.dialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    progressDialog2 = progressDialog3;
                }
                progressDialog2.dismiss();
                CovApplication covApplication2 = CovApplication.this;
                Context contextT1 = covApplication2.T1();
                String strB = CovApplication.this.Q1().b("label_went_wrong", CovApplication.this.getString(R.string.something_please_try_after_some_time));
                Intrinsics.checkNotNull(strB);
                covApplication2.c2(contextT1, strB);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OtpVerifyResult) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class g extends Lambda implements Function1 {

        public static final class a extends Lambda implements Function1 {
            public static final a c = new a();

            public a() {
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

        public g() {
            super(1);
        }

        public final void a(ResendOtp resendOtp) {
            ProgressDialog progressDialog = CovApplication.this.dialog;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            progressDialog.dismiss();
            try {
                if (StringsKt__StringsJVMKt.equals(resendOtp.getStatusCode(), "AL001", true)) {
                    CovApplication covApplication = CovApplication.this;
                    String strB = covApplication.Q1().b("nex_parivahan", CovApplication.this.getString(R.string.app_name));
                    Intrinsics.checkNotNull(strB);
                    String strB2 = CovApplication.this.Q1().b("otp_resent", CovApplication.this.getString(R.string.otp_resent));
                    Intrinsics.checkNotNull(strB2);
                    String strB3 = CovApplication.this.Q1().b("btn_ok", CovApplication.this.getString(R.string.ok_txt));
                    Intrinsics.checkNotNull(strB3);
                    o40.q1(covApplication, strB, strB2, 1, strB3, null, a.c, 16, null);
                } else if (StringsKt__StringsJVMKt.equals(resendOtp.getStatusCode(), "AL002", true)) {
                    CovApplication covApplication2 = CovApplication.this;
                    String strB4 = covApplication2.Q1().b("nex_parivahan", CovApplication.this.getString(R.string.app_name));
                    Intrinsics.checkNotNull(strB4);
                    String statusDesc = resendOtp.getStatusDesc();
                    String strB5 = CovApplication.this.Q1().b("btn_ok", CovApplication.this.getString(R.string.ok_txt));
                    Intrinsics.checkNotNull(strB5);
                    o40.q1(covApplication2, strB4, statusDesc, 1, strB5, null, b.c, 16, null);
                } else {
                    CovApplication covApplication3 = CovApplication.this;
                    String strB6 = covApplication3.Q1().b("nex_parivahan", CovApplication.this.getString(R.string.app_name));
                    Intrinsics.checkNotNull(strB6);
                    String statusDesc2 = resendOtp.getStatusDesc();
                    String strB7 = CovApplication.this.Q1().b("btn_ok", CovApplication.this.getString(R.string.ok_txt));
                    Intrinsics.checkNotNull(strB7);
                    o40.q1(covApplication3, strB6, statusDesc2, 1, strB7, null, c.c, 16, null);
                }
            } catch (Exception unused) {
                CovApplication covApplication4 = CovApplication.this;
                String strB8 = covApplication4.Q1().b("nex_parivahan", CovApplication.this.getString(R.string.app_name));
                Intrinsics.checkNotNull(strB8);
                String strB9 = CovApplication.this.Q1().b("label_log_unbl_veri_otp", CovApplication.this.getString(R.string.unable_verifiy_otp));
                Intrinsics.checkNotNull(strB9);
                String strB10 = CovApplication.this.Q1().b("btn_ok", CovApplication.this.getString(R.string.ok_txt));
                Intrinsics.checkNotNull(strB10);
                o40.q1(covApplication4, strB8, strB9, 1, strB10, null, d.c, 16, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ResendOtp) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class h extends Lambda implements Function1 {

        public static final class a extends Lambda implements Function1 {
            public static final a c = new a();

            public a() {
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

        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            ProgressDialog progressDialog = CovApplication.this.dialog;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            progressDialog.dismiss();
            CovApplication covApplication = CovApplication.this;
            String strB = covApplication.Q1().b("nex_parivahan", CovApplication.this.getString(R.string.app_name));
            Intrinsics.checkNotNull(strB);
            String strB2 = CovApplication.this.Q1().b("label_log_unbl_veri_otp", CovApplication.this.getString(R.string.unable_verifiy_otp));
            Intrinsics.checkNotNull(strB2);
            String strB3 = CovApplication.this.Q1().b("btn_ok", CovApplication.this.getString(R.string.ok_txt));
            Intrinsics.checkNotNull(strB3);
            o40.q1(covApplication, strB, strB2, 1, strB3, null, a.c, 16, null);
        }
    }

    public static final class i implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public i(Function1 function) {
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

    public static final class j extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ CovApplication b;
        public final /* synthetic */ TextView c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(TextView textView, CovApplication covApplication, TextView textView2) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = covApplication;
            this.c = textView2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.c.setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            Log.e("calling", "321");
            this.a.setText(this.b.Q1().b("time_remaining", this.b.getString(R.string.time_remaining)) + " : " + (j / ((long) 1000)));
            this.c.setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    public static final class k extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ CovApplication b;
        public final /* synthetic */ TextView c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(TextView textView, CovApplication covApplication, TextView textView2) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = covApplication;
            this.c = textView2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.c.setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.a.setText(this.b.Q1().b("time_remaining", this.b.getString(R.string.time_remaining)) + " : " + (j / ((long) 1000)));
            this.c.setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    public CovApplication() {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
        this.cal = calendar;
    }

    private final void N1() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.n01
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                CovApplication.O1(this.a, datePicker, i2, i3, i4);
            }
        }, this.cal.get(1), this.cal.get(2), this.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void O1(CovApplication this$0, DatePicker datePicker, int i2, int i3, int i4) {
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
        TextView textView = this$0.S1().b;
        String str3 = this$0.dateformate;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dateformate");
        } else {
            str2 = str3;
        }
        textView.setText(str2);
    }

    private final void Y1() {
        i2(this);
        f2(new wa3(this));
        m2(new wl5(T1()));
        n2(new ws6(T1()));
        this.mAddCovInterface = AddCovInterface.INSTANCE.a(T1());
        AddCovInterface addCovInterface = this.mAddCovInterface;
        if (addCovInterface == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAddCovInterface");
            addCovInterface = null;
        }
        this.mAddCovModel = (qi) new z(this, new pi(new ri(addCovInterface))).a(qi.class);
        l2(DlServiceInt.INSTANCE.a(T1()));
        e2((nr1) new z(this, new rq1(new lr1(V1(), this))).a(nr1.class));
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.dialog = progressDialog;
        progressDialog.setMessage(Q1().b("label_challan_please_wait", "Please wait..."));
    }

    public static final void Z1(CovApplication this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void a2(CovApplication this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.appNo = this$0.S1().c.getText().toString();
        this$0.dob = this$0.S1().b.getText().toString();
        String str = this$0.appNo;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appNo");
            str = null;
        }
        if (Intrinsics.areEqual(str, "")) {
            Toast.makeText(this$0, this$0.Q1().b(va3.a.E(), this$0.getString(R.string.enter_application_no)), 1).show();
            return;
        }
        String str3 = this$0.dob;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dob");
            str3 = null;
        }
        if (Intrinsics.areEqual(str3, "")) {
            Toast.makeText(this$0, this$0.Q1().b("edit_dl_serv_dob", this$0.getString(R.string.enter_dob)), 1).show();
            return;
        }
        if (!q44.a.a(this$0)) {
            Toast.makeText(this$0, this$0.Q1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
            return;
        }
        ProgressDialog progressDialog = this$0.dialog;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog = null;
        }
        progressDialog.show();
        String str4 = this$0.dob;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dob");
            str4 = null;
        }
        this$0.newdob = this$0.M1(str4);
        qi qiVar = this$0.mAddCovModel;
        if (qiVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAddCovModel");
            qiVar = null;
        }
        String str5 = this$0.appNo;
        if (str5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appNo");
            str5 = null;
        }
        String str6 = this$0.dob;
        if (str6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dob");
        } else {
            str2 = str6;
        }
        qiVar.g(this$0, str5, this$0.M1(str2), this$0.W1().n());
    }

    public static final void b2(CovApplication this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.N1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p2(EditText enterOtp, ImageView shownPin, View view) {
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

    public static final void q2(CovApplication this$0, TextView time_text, TextView resendOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(time_text, "$time_text");
        Intrinsics.checkNotNullParameter(resendOtp, "$resendOtp");
        ProgressDialog progressDialog = this$0.dialog;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog = null;
        }
        progressDialog.show();
        this$0.P1().D(this$0, String.valueOf(this$0.record_id));
        new k(time_text, this$0, resendOtp).start();
    }

    public static final void r2(CovApplication this$0, EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.Q1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
            return;
        }
        Editable text = enterOtp.getText();
        Intrinsics.checkNotNull(text);
        if (text.length() == 0) {
            Toast.makeText(this$0, this$0.Q1().b("label_log_entr_otp", this$0.getString(R.string.pls_enter_otp)), 0).show();
            return;
        }
        Editable text2 = enterOtp.getText();
        Intrinsics.checkNotNull(text2);
        if (text2.length() < 6) {
            Toast.makeText(this$0, this$0.Q1().b("label_log_entr_val_otp", this$0.getString(R.string.pls_enter_valid_otp)), 0).show();
            return;
        }
        ProgressDialog progressDialog = this$0.dialog;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog = null;
        }
        progressDialog.show();
        nr1 nr1VarP1 = this$0.P1();
        String string = enterOtp.getText().toString();
        String str = this$0.record_id;
        Intrinsics.checkNotNull(str);
        nr1VarP1.G(this$0, string, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s2(EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        enterOtp.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public final void I1() {
        qi qiVar = this.mAddCovModel;
        qi qiVar2 = null;
        if (qiVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAddCovModel");
            qiVar = null;
        }
        qiVar.n().g(this, new i(new a()));
        qi qiVar3 = this.mAddCovModel;
        if (qiVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAddCovModel");
            qiVar3 = null;
        }
        qiVar3.m().g(this, new i(new b()));
        qi qiVar4 = this.mAddCovModel;
        if (qiVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAddCovModel");
        } else {
            qiVar2 = qiVar4;
        }
        qiVar2.l().g(this, new i(new c()));
        P1().u().g(this, new i(new d()));
        P1().t().g(this, new i(new e()));
        P1().E().g(this, new i(new f()));
        P1().w().g(this, new i(new g()));
        P1().v().g(this, new i(new h()));
    }

    public final String M1(String date) {
        Intrinsics.checkNotNullParameter(date, "date");
        try {
            String str = new SimpleDateFormat("dd/MM/yyyy").format(new SimpleDateFormat("dd-MM-yyyy").parse(date));
            Intrinsics.checkNotNull(str);
            return str;
        } catch (Exception e2) {
            e2.printStackTrace();
            return date;
        }
    }

    public final nr1 P1() {
        nr1 nr1Var = this.dlServicesViewModel;
        if (nr1Var != null) {
            return nr1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlServicesViewModel");
        return null;
    }

    public final wa3 Q1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final ApplStatusDetails R1() {
        ApplStatusDetails applStatusDetails = this.mApplStatusDetails;
        if (applStatusDetails != null) {
            return applStatusDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mApplStatusDetails");
        return null;
    }

    public final r8 S1() {
        r8 r8Var = this.mBinding;
        if (r8Var != null) {
            return r8Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    public final Context T1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    /* JADX INFO: renamed from: U1, reason: from getter */
    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final DlServiceInt V1() {
        DlServiceInt dlServiceInt = this.retrofitService;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final wl5 W1() {
        wl5 wl5Var = this.sahi_session;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sahi_session");
        return null;
    }

    public final ws6 X1() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final void c2(Context context, String message) {
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
        ((TextView) viewFindViewById3).setText(Q1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(Q1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.m01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CovApplication.d2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void e2(nr1 nr1Var) {
        Intrinsics.checkNotNullParameter(nr1Var, "<set-?>");
        this.dlServicesViewModel = nr1Var;
    }

    public final void f2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void g2(ApplStatusDetails applStatusDetails) {
        Intrinsics.checkNotNullParameter(applStatusDetails, "<set-?>");
        this.mApplStatusDetails = applStatusDetails;
    }

    public final void h2(r8 r8Var) {
        Intrinsics.checkNotNullParameter(r8Var, "<set-?>");
        this.mBinding = r8Var;
    }

    public final void i2(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void j2(String str) {
        this.mobileNumber = str;
    }

    public final void k2(String str) {
        this.record_id = str;
    }

    public final void l2(DlServiceInt dlServiceInt) {
        Intrinsics.checkNotNullParameter(dlServiceInt, "<set-?>");
        this.retrofitService = dlServiceInt;
    }

    public final void m2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sahi_session = wl5Var;
    }

    public final void n2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final void o2(Context context, String mobile_no) {
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
        View viewFindViewById2 = dialog.findViewById(R.id.resendOtp);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        final TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.showmpin);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.ImageView");
        final ImageView imageView2 = (ImageView) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.submitOtp);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById4;
        View viewFindViewById5 = dialog.findViewById(R.id.enterOtp);
        Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText = (EditText) viewFindViewById5;
        View viewFindViewById6 = dialog.findViewById(R.id.time_text);
        Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.TextView");
        final TextView textView3 = (TextView) viewFindViewById6;
        View viewFindViewById7 = dialog.findViewById(R.id.txt_reset);
        Intrinsics.checkNotNull(viewFindViewById7, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView4 = (TextView) viewFindViewById7;
        View viewFindViewById8 = dialog.findViewById(R.id.disPlay_mobile);
        Intrinsics.checkNotNull(viewFindViewById8, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView5 = (TextView) viewFindViewById8;
        View viewFindViewById9 = dialog.findViewById(R.id.disPlay);
        Intrinsics.checkNotNull(viewFindViewById9, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById10 = dialog.findViewById(R.id.enter_otp_txt);
        Intrinsics.checkNotNull(viewFindViewById10, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById9).setText(Q1().b("otp_verification", getString(R.string.otp_verification)));
        textView2.setText(Q1().b("vahan_btn_submit", getString(R.string.submit)));
        textView4.setText(Q1().b("btn_reset", getString(R.string.reset)));
        textView.setText(Q1().b("label_resend_otp", getString(R.string.resend_otp)));
        editText.setHint(Q1().b("edit_enter_otp", getString(R.string.enter_otp)));
        ((TextView) viewFindViewById10).setText(Q1().b("edit_enter_otp", getString(R.string.enter_otp)));
        try {
            if (mobile_no.length() == 10) {
                StringBuilder sb = new StringBuilder();
                sb.append(Q1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
                sb.append("\n+91 - XXXXXX");
                String strSubstring = mobile_no.substring(6, 10);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(strSubstring);
                textView5.setText(sb.toString());
            } else {
                textView5.setText(Q1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
            }
        } catch (Exception unused) {
            textView5.setText(Q1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
        }
        new j(textView3, this, textView).start();
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.h01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CovApplication.p2(editText, imageView2, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.i01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CovApplication.q2(this.a, textView3, textView, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.j01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CovApplication.r2(this.a, editText, view);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.k01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CovApplication.s2(editText, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.l01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CovApplication.t2(dialog, view);
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
        r8 r8VarC = r8.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(r8VarC, "inflate(...)");
        h2(r8VarC);
        setContentView(S1().b());
        Y1();
        ta3.a.t(this, S1());
        I1();
        S1().g.f.setText(W1().k());
        S1().g.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.e01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CovApplication.Z1(this.a, view);
            }
        });
        S1().l.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.f01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CovApplication.a2(this.a, view);
            }
        });
        S1().e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.g01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CovApplication.b2(this.a, view);
            }
        });
    }
}
