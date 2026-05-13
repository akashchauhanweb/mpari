package com.nic.mparivahan.ClServicesMainScreens;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.z;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.ClServices.View.ChangeNameCl;
import com.nic.mparivahan.ClServices.View.ChangeOfAddressCl;
import com.nic.mparivahan.ClServices.View.DuplicateCl;
import com.nic.mparivahan.ClServices.View.RenewalCl;
import com.nic.mparivahan.ClServices.View.clAdharMobUpdate.ClMobUpdateAdhar;
import com.nic.mparivahan.ClServicesMainScreens.MobileOtpScreen;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.zepto.dg5;
import com.zepto.hz0;
import com.zepto.kt6;
import com.zepto.lr1;
import com.zepto.mf4;
import com.zepto.mt6;
import com.zepto.nr1;
import com.zepto.pd;
import com.zepto.pq;
import com.zepto.rq1;
import com.zepto.s14;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.ws6;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\bJ\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0003J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\r\u001a\u00020\u0004H\u0014J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007H\u0007J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0007R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010U\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010]\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010a\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010X\u001a\u0004\b_\u0010Z\"\u0004\b`\u0010\\R\"\u0010e\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010P\u001a\u0004\bc\u0010R\"\u0004\bd\u0010TR\"\u0010i\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010P\u001a\u0004\bg\u0010R\"\u0004\bh\u0010TR\"\u0010m\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010P\u001a\u0004\bk\u0010R\"\u0004\bl\u0010TR\"\u0010q\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010P\u001a\u0004\bo\u0010R\"\u0004\bp\u0010TR\"\u0010u\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010P\u001a\u0004\bs\u0010R\"\u0004\bt\u0010TR\"\u0010y\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010P\u001a\u0004\bw\u0010R\"\u0004\bx\u0010TR\"\u0010}\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bz\u0010P\u001a\u0004\b{\u0010R\"\u0004\b|\u0010TR$\u0010\u0081\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b~\u0010P\u001a\u0004\b\u007f\u0010R\"\u0005\b\u0080\u0001\u0010TR&\u0010\u0085\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010P\u001a\u0005\b\u0083\u0001\u0010R\"\u0005\b\u0084\u0001\u0010TR&\u0010\u0089\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010P\u001a\u0005\b\u0087\u0001\u0010R\"\u0005\b\u0088\u0001\u0010TR&\u0010\u008d\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010P\u001a\u0005\b\u008b\u0001\u0010R\"\u0005\b\u008c\u0001\u0010TR&\u0010\u0091\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010P\u001a\u0005\b\u008f\u0001\u0010R\"\u0005\b\u0090\u0001\u0010TR&\u0010\u0095\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0092\u0001\u0010P\u001a\u0005\b\u0093\u0001\u0010R\"\u0005\b\u0094\u0001\u0010TR&\u0010\u0099\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0096\u0001\u0010P\u001a\u0005\b\u0097\u0001\u0010R\"\u0005\b\u0098\u0001\u0010TR&\u0010\u009d\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009a\u0001\u0010P\u001a\u0005\b\u009b\u0001\u0010R\"\u0005\b\u009c\u0001\u0010T¨\u0006 \u0001"}, d2 = {"Lcom/nic/mparivahan/ClServicesMainScreens/MobileOtpScreen;", "Lcom/zepto/pq;", "Landroid/content/Intent;", "intent", "", "R1", "Q1", "", "message", "Y1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "Landroid/content/Context;", "context", "mobile_no", "u2", "fdate", "w1", "Lcom/zepto/pd;", "C", "Lcom/zepto/pd;", "mbBinding", "D", "Landroid/content/Context;", "E1", "()Landroid/content/Context;", "h2", "(Landroid/content/Context;)V", "mContext", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "G1", "()Landroid/app/ProgressDialog;", "j2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/wa3;", "F", "Lcom/zepto/wa3;", "D1", "()Lcom/zepto/wa3;", "g2", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/wl5;", "G", "Lcom/zepto/wl5;", "K1", "()Lcom/zepto/wl5;", "o2", "(Lcom/zepto/wl5;)V", "sarthiSession", "Lcom/zepto/nr1;", "H", "Lcom/zepto/nr1;", "z1", "()Lcom/zepto/nr1;", "c2", "(Lcom/zepto/nr1;)V", "dlServicesViewModel", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "I", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "H1", "()Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "l2", "(Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;)V", "retrofitService", "Lcom/zepto/ws6;", "J", "Lcom/zepto/ws6;", "L1", "()Lcom/zepto/ws6;", "p2", "(Lcom/zepto/ws6;)V", "sessionManager", "K", "Ljava/lang/String;", "getRecord_id", "()Ljava/lang/String;", "k2", "(Ljava/lang/String;)V", "record_id", "Landroid/widget/TextView;", "L", "Landroid/widget/TextView;", "P1", "()Landroid/widget/TextView;", "t2", "(Landroid/widget/TextView;)V", "txt_reset", "M", "O1", "s2", "submitOtp", "N", "A1", "d2", "dlValue", "O", "B1", "e2", "dobValue", "P", "C1", "f2", "fatherName", "Q", "x1", "a2", "clName", "R", "y1", "b2", "clPhoto", "S", "I1", "m2", "rtoCode", "T", "J1", "n2", "rtoName", "U", "M1", "q2", "stateCode", "V", "N1", "r2", "stateName", "W", "getAddress", "setAddress", "address", "X", "getIssuing_authority", "setIssuing_authority", "issuing_authority", "Y", "getValidity", "setValidity", "validity", "Z", "getCl_Status", "setCl_Status", "cl_Status", "a0", "F1", "setMobNo", "mobNo", "b0", "getMobileNumber", "i2", "mobileNumber", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class MobileOtpScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public pd mbBinding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public nr1 dlServicesViewModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public DlServiceInt retrofitService;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String record_id;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public TextView txt_reset;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public TextView submitOtp;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String dlValue;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String dobValue;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String fatherName;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String clName;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String clPhoto;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String rtoCode;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String rtoName;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String stateCode;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String stateName;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String address = "";

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String issuing_authority = "";

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String validity = "";

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String cl_Status = "";

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String mobNo = "";

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String mobileNumber;

    public static final class a extends Lambda implements Function1 {
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
            MobileOtpScreen.this.G1().dismiss();
            try {
                if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL001", true)) {
                    MobileOtpScreen.this.k2(String.valueOf(sendOtpResult.getRecordId()));
                    MobileOtpScreen mobileOtpScreen = MobileOtpScreen.this;
                    mobileOtpScreen.u2(mobileOtpScreen, StringsKt__StringsKt.trim((CharSequence) mobileOtpScreen.getMobNo()).toString());
                } else if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL099", true)) {
                    mt6.a.c(MobileOtpScreen.this, sendOtpResult.getStatusDesc());
                } else {
                    MobileOtpScreen.this.Y1(sendOtpResult.getStatusDesc());
                }
            } catch (Exception unused) {
                MobileOtpScreen mobileOtpScreen2 = MobileOtpScreen.this;
                String strB = mobileOtpScreen2.D1().b("label_went_wrong", MobileOtpScreen.this.getString(R.string.something_please_try_after_some_time));
                Intrinsics.checkNotNull(strB);
                mobileOtpScreen2.Y1(strB);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SendOtpResult) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(OtpVerifyResult otpVerifyResult) {
            Log.e("sub", otpVerifyResult.toString());
            try {
                if (!StringsKt__StringsJVMKt.equals(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    MobileOtpScreen.this.Y1(otpVerifyResult.getStatusDesc());
                } else if (Intrinsics.areEqual(MobileOtpScreen.this.K1().b(), "559")) {
                    MobileOtpScreen.this.R1(new Intent(MobileOtpScreen.this, (Class<?>) ChangeNameCl.class));
                } else if (Intrinsics.areEqual(MobileOtpScreen.this.K1().b(), "552")) {
                    MobileOtpScreen.this.R1(new Intent(MobileOtpScreen.this, (Class<?>) RenewalCl.class));
                } else if (Intrinsics.areEqual(MobileOtpScreen.this.K1().b(), "553")) {
                    MobileOtpScreen.this.R1(new Intent(MobileOtpScreen.this, (Class<?>) ChangeOfAddressCl.class));
                } else {
                    MobileOtpScreen.this.R1(new Intent(MobileOtpScreen.this, (Class<?>) DuplicateCl.class));
                }
            } catch (Exception unused) {
                MobileOtpScreen mobileOtpScreen = MobileOtpScreen.this;
                String strB = mobileOtpScreen.D1().b("label_went_wrong", MobileOtpScreen.this.getString(R.string.something_please_try_after_some_time));
                Intrinsics.checkNotNull(strB);
                mobileOtpScreen.Y1(strB);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OtpVerifyResult) obj);
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

    public static final class d extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ MobileOtpScreen b;
        public final /* synthetic */ TextView c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(TextView textView, MobileOtpScreen mobileOtpScreen, TextView textView2) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = mobileOtpScreen;
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
            this.a.setText(this.b.D1().b("time_remaining", this.b.getString(R.string.time_remaining)) + " : " + (j / ((long) 1000)));
            this.c.setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    public static final class e extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ MobileOtpScreen b;
        public final /* synthetic */ TextView c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(TextView textView, MobileOtpScreen mobileOtpScreen, TextView textView2) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = mobileOtpScreen;
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
            this.a.setText(this.b.D1().b("time_remaining", this.b.getString(R.string.time_remaining)) + " : " + (j / ((long) 1000)));
            this.c.setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    private final void Q1() {
        h2(this);
        g2(new wa3(E1()));
        p2(new ws6(E1()));
        o2(new wl5(E1()));
        j2(new ProgressDialog(E1()));
        G1().setMessage(D1().b("label_challan_please_wait", getString(R.string.please_wait)));
        G1().setCancelable(false);
        G1().setCanceledOnTouchOutside(false);
        l2(DlServiceInt.INSTANCE.a(this));
        c2((nr1) new z(this, new rq1(new lr1(H1(), this))).a(nr1.class));
        try {
            e2(String.valueOf(getIntent().getStringExtra("dobValue")));
            d2(String.valueOf(getIntent().getStringExtra("dlValue")));
            f2(String.valueOf(getIntent().getStringExtra("fatherName")));
            a2(String.valueOf(getIntent().getStringExtra("clName")));
            b2(String.valueOf(getIntent().getStringExtra("clPhoto")));
            m2(String.valueOf(getIntent().getStringExtra("rtoCode")));
            n2(String.valueOf(getIntent().getStringExtra("rtoName")));
            q2(String.valueOf(getIntent().getStringExtra("stateCode")));
            r2(String.valueOf(getIntent().getStringExtra("stateName")));
            this.mobNo = String.valueOf(getIntent().getStringExtra("mobileNumber"));
            pd pdVar = this.mbBinding;
            if (pdVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
                pdVar = null;
            }
            pdVar.c.setText(StringsKt__StringsKt.trim((CharSequence) A1()).toString());
            pd pdVar2 = this.mbBinding;
            if (pdVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
                pdVar2 = null;
            }
            pdVar2.n.setText("CL No : " + A1());
            pd pdVar3 = this.mbBinding;
            if (pdVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
                pdVar3 = null;
            }
            pdVar3.h.g.setText(K1().k());
            String strY1 = y1();
            if (strY1 == null || strY1.length() == 0) {
                pd pdVar4 = this.mbBinding;
                if (pdVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
                    pdVar4 = null;
                }
                pdVar4.h.f.setVisibility(8);
            } else {
                pd pdVar5 = this.mbBinding;
                if (pdVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
                    pdVar5 = null;
                }
                pdVar5.h.f.setVisibility(0);
                pd pdVar6 = this.mbBinding;
                if (pdVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
                    pdVar6 = null;
                }
                pdVar6.h.b.setImageBitmap(kt6.a(y1()));
            }
            this.address = String.valueOf(getIntent().getStringExtra("address"));
            this.validity = String.valueOf(getIntent().getStringExtra("validity"));
            this.issuing_authority = String.valueOf(getIntent().getStringExtra("issuing_authority"));
            this.cl_Status = String.valueOf(getIntent().getStringExtra("cl_Status"));
            i2(String.valueOf(getIntent().getStringExtra("mobileNumber")));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        String str = this.mobNo;
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            Log.d("dob_Call_1111", this.mobNo);
            pd pdVar7 = this.mbBinding;
            if (pdVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
                pdVar7 = null;
            }
            pdVar7.i.setText(StringsKt__StringsKt.trim((CharSequence) this.mobNo).toString());
        } catch (Exception unused) {
            pd pdVar8 = this.mbBinding;
            if (pdVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
                pdVar8 = null;
            }
            pdVar8.i.setText((CharSequence) null);
        }
    }

    public static final void S1(MobileOtpScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void T1(MobileOtpScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.D1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        pd pdVar = this$0.mbBinding;
        pd pdVar2 = null;
        if (pdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
            pdVar = null;
        }
        if (!pdVar.e.isChecked()) {
            this$0.Y1(this$0.D1().b("plz_accept_term_conditions", this$0.getString(R.string.pls_enter_term_conditions)));
            return;
        }
        pd pdVar3 = this$0.mbBinding;
        if (pdVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
            pdVar3 = null;
        }
        if (String.valueOf(pdVar3.i.getText()).length() < 10) {
            pd pdVar4 = this$0.mbBinding;
            if (pdVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
                pdVar4 = null;
            }
            if (pdVar4.i.isFocusable()) {
                String strB = this$0.D1().b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no));
                Intrinsics.checkNotNull(strB);
                this$0.Y1(strB);
                return;
            }
        }
        pd pdVar5 = this$0.mbBinding;
        if (pdVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
            pdVar5 = null;
        }
        if (pdVar5.i.isFocusable()) {
            mt6.a aVar = mt6.a;
            pd pdVar6 = this$0.mbBinding;
            if (pdVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
            } else {
                pdVar2 = pdVar6;
            }
            if (!aVar.t(String.valueOf(pdVar2.i.getText()))) {
                String strB2 = this$0.D1().b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no));
                Intrinsics.checkNotNull(strB2);
                this$0.Y1(strB2);
                return;
            }
        }
        this$0.G1().show();
        this$0.z1().F(this$0, this$0.mobNo, this$0.L1().k());
    }

    public static final void U1(MobileOtpScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        pd pdVar = this$0.mbBinding;
        pd pdVar2 = null;
        if (pdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
            pdVar = null;
        }
        if (pdVar.i.isFocusable()) {
            pd pdVar3 = this$0.mbBinding;
            if (pdVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
                pdVar3 = null;
            }
            pdVar3.i.setText("");
        }
        pd pdVar4 = this$0.mbBinding;
        if (pdVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
        } else {
            pdVar2 = pdVar4;
        }
        pdVar2.e.setChecked(false);
    }

    public static final void V1(MobileOtpScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        final Dialog dialog = new Dialog(this$0.E1());
        dialog.setContentView(R.layout.term_cond_dialog);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        String str = s14.a.g() + hz0.a.m() + "/mparivahan-info-terms-of-use.html";
        View viewFindViewById = dialog.findViewById(R.id.cancelIv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = dialog.findViewById(R.id.termConditionWv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ((ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fw3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MobileOtpScreen.W1(dialog, view2);
            }
        });
        ((WebView) viewFindViewById2).loadUrl(str);
        dialog.show();
    }

    public static final void W1(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    public static final void X1(MobileOtpScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.D1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
            return;
        }
        try {
            Intent intent = new Intent(this$0, (Class<?>) ClMobUpdateAdhar.class);
            intent.putExtra("dlValue", this$0.A1());
            intent.putExtra("dobValue", this$0.w1(this$0.B1()));
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y1(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        dialog.setCanceledOnTouchOutside(false);
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(D1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(D1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ew3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobileOtpScreen.Z1(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void v2(MobileOtpScreen this$0, EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.D1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
            return;
        }
        Editable text = enterOtp.getText();
        Intrinsics.checkNotNull(text);
        if (text.length() == 0) {
            Toast.makeText(this$0, this$0.D1().b("label_log_entr_otp", this$0.getString(R.string.pls_enter_otp)), 0).show();
            return;
        }
        Editable text2 = enterOtp.getText();
        Intrinsics.checkNotNull(text2);
        if (text2.length() < 6) {
            Toast.makeText(this$0, this$0.D1().b("label_log_entr_val_otp", this$0.getString(R.string.pls_enter_valid_otp)), 0).show();
            return;
        }
        nr1 nr1VarZ1 = this$0.z1();
        String string = enterOtp.getText().toString();
        String str = this$0.record_id;
        Intrinsics.checkNotNull(str);
        nr1VarZ1.G(this$0, string, str);
    }

    public static final void w2(EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        enterOtp.setText("");
    }

    public static final void x2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void y2(EditText enterOtp, ImageView shownPin, View view) {
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

    public static final void z2(MobileOtpScreen this$0, TextView time_text, TextView resendOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(time_text, "$time_text");
        Intrinsics.checkNotNullParameter(resendOtp, "$resendOtp");
        this$0.z1().D(this$0, String.valueOf(this$0.record_id));
        new e(time_text, this$0, resendOtp).start();
    }

    public final String A1() {
        String str = this.dlValue;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlValue");
        return null;
    }

    public final String B1() {
        String str = this.dobValue;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dobValue");
        return null;
    }

    public final String C1() {
        String str = this.fatherName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fatherName");
        return null;
    }

    public final wa3 D1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final Context E1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    /* JADX INFO: renamed from: F1, reason: from getter */
    public final String getMobNo() {
        return this.mobNo;
    }

    public final ProgressDialog G1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final DlServiceInt H1() {
        DlServiceInt dlServiceInt = this.retrofitService;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final String I1() {
        String str = this.rtoCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rtoCode");
        return null;
    }

    public final String J1() {
        String str = this.rtoName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rtoName");
        return null;
    }

    public final wl5 K1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final ws6 L1() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final String M1() {
        String str = this.stateCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stateCode");
        return null;
    }

    public final String N1() {
        String str = this.stateName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stateName");
        return null;
    }

    public final TextView O1() {
        TextView textView = this.submitOtp;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("submitOtp");
        return null;
    }

    public final TextView P1() {
        TextView textView = this.txt_reset;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txt_reset");
        return null;
    }

    public final void R1(Intent intent) {
        try {
            intent.putExtra("dlValue", A1());
            intent.putExtra("dobValue", B1());
            intent.putExtra("fatherName", C1());
            intent.putExtra("clName", x1());
            intent.putExtra("clPhoto", y1());
            intent.putExtra("stateCode", M1());
            intent.putExtra("rtoCode", I1());
            intent.putExtra("rtoName", J1());
            intent.putExtra("stateName", N1());
            intent.putExtra("Mobile_no", this.mobNo);
            intent.putExtra("address", this.address);
            intent.putExtra("validity", this.validity);
            intent.putExtra("issuing_authority", this.issuing_authority);
            intent.putExtra("cl_Status", this.cl_Status);
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    public final void a2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clName = str;
    }

    public final void b2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clPhoto = str;
    }

    public final void c2(nr1 nr1Var) {
        Intrinsics.checkNotNullParameter(nr1Var, "<set-?>");
        this.dlServicesViewModel = nr1Var;
    }

    public final void d2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dlValue = str;
    }

    public final void e2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dobValue = str;
    }

    public final void f2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fatherName = str;
    }

    public final void g2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void h2(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void i2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobileNumber = str;
    }

    public final void j2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void k2(String str) {
        this.record_id = str;
    }

    public final void l2(DlServiceInt dlServiceInt) {
        Intrinsics.checkNotNullParameter(dlServiceInt, "<set-?>");
        this.retrofitService = dlServiceInt;
    }

    public final void m2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoCode = str;
    }

    public final void n2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoName = str;
    }

    public final void o2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pd pdVarC = pd.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(pdVarC, "inflate(...)");
        this.mbBinding = pdVarC;
        pd pdVar = null;
        if (pdVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
            pdVarC = null;
        }
        setContentView(pdVarC.b());
        Q1();
        ta3.a aVar = ta3.a;
        pd pdVar2 = this.mbBinding;
        if (pdVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
            pdVar2 = null;
        }
        aVar.b0(this, pdVar2);
        pd pdVar3 = this.mbBinding;
        if (pdVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
            pdVar3 = null;
        }
        pdVar3.h.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xv3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobileOtpScreen.S1(this.a, view);
            }
        });
        pd pdVar4 = this.mbBinding;
        if (pdVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
            pdVar4 = null;
        }
        pdVar4.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.aw3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobileOtpScreen.T1(this.a, view);
            }
        });
        z1().u().g(this, new c(new a()));
        z1().E().g(this, new c(new b()));
        pd pdVar5 = this.mbBinding;
        if (pdVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
            pdVar5 = null;
        }
        pdVar5.j.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bw3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobileOtpScreen.U1(this.a, view);
            }
        });
        pd pdVar6 = this.mbBinding;
        if (pdVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
            pdVar6 = null;
        }
        pdVar6.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cw3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobileOtpScreen.V1(this.a, view);
            }
        });
        pd pdVar7 = this.mbBinding;
        if (pdVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
        } else {
            pdVar = pdVar7;
        }
        pdVar.q.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dw3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobileOtpScreen.X1(this.a, view);
            }
        });
        dg5.a.c("");
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() {
        super.onResume();
        pd pdVar = null;
        try {
            dg5.a aVar = dg5.a;
            if (aVar.a().length() > 8) {
                pd pdVar2 = this.mbBinding;
                if (pdVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
                    pdVar2 = null;
                }
                pdVar2.i.setText(aVar.a());
                this.mobNo = StringsKt__StringsKt.trim((CharSequence) aVar.a()).toString();
            }
        } catch (Exception unused) {
        }
        pd pdVar3 = this.mbBinding;
        if (pdVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
            pdVar3 = null;
        }
        AppCompatEditText appCompatEditText = pdVar3.i;
        pd pdVar4 = this.mbBinding;
        if (pdVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mbBinding");
        } else {
            pdVar = pdVar4;
        }
        appCompatEditText.setFocusable(String.valueOf(pdVar.i.getText()).length() <= 8);
    }

    public final void p2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final void q2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCode = str;
    }

    public final void r2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateName = str;
    }

    public final void s2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.submitOtp = textView;
    }

    public final void t2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txt_reset = textView;
    }

    public final void u2(Context context, String mobile_no) {
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
        s2((TextView) viewFindViewById4);
        View viewFindViewById5 = dialog.findViewById(R.id.enterOtp);
        Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText = (EditText) viewFindViewById5;
        View viewFindViewById6 = dialog.findViewById(R.id.time_text);
        Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.TextView");
        final TextView textView2 = (TextView) viewFindViewById6;
        View viewFindViewById7 = dialog.findViewById(R.id.txt_reset);
        Intrinsics.checkNotNull(viewFindViewById7, "null cannot be cast to non-null type android.widget.TextView");
        t2((TextView) viewFindViewById7);
        View viewFindViewById8 = dialog.findViewById(R.id.disPlay_mobile);
        Intrinsics.checkNotNull(viewFindViewById8, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) viewFindViewById8;
        View viewFindViewById9 = dialog.findViewById(R.id.disPlay);
        Intrinsics.checkNotNull(viewFindViewById9, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById10 = dialog.findViewById(R.id.enter_otp_txt);
        Intrinsics.checkNotNull(viewFindViewById10, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById9).setText(D1().b("otp_verification", getString(R.string.otp_verification)));
        O1().setText(D1().b("vahan_btn_submit", getString(R.string.submit)));
        P1().setText(D1().b("btn_reset", getString(R.string.reset)));
        textView.setText(D1().b("label_resend_otp", getString(R.string.resend_otp)));
        editText.setHint(D1().b("edit_enter_otp", getString(R.string.enter_otp)));
        ((TextView) viewFindViewById10).setText(D1().b("edit_enter_otp", getString(R.string.enter_otp)));
        try {
            if (mobile_no.length() == 10) {
                StringBuilder sb = new StringBuilder();
                sb.append(D1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
                sb.append("\n+91 - XXXXXX");
                String strSubstring = mobile_no.substring(6, 10);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(strSubstring);
                textView3.setText(sb.toString());
            } else {
                textView3.setText(D1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
            }
        } catch (Exception unused) {
            textView3.setText(D1().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
        }
        new d(textView2, this, textView).start();
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gw3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobileOtpScreen.y2(editText, imageView2, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hw3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobileOtpScreen.z2(this.a, textView2, textView, view);
            }
        });
        O1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.iw3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobileOtpScreen.v2(this.a, editText, view);
            }
        });
        P1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yv3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobileOtpScreen.w2(editText, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zv3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobileOtpScreen.x2(dialog, view);
            }
        });
        dialog.show();
    }

    public final String w1(String fdate) {
        Intrinsics.checkNotNullParameter(fdate, "fdate");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy");
        try {
            Date date = simpleDateFormat.parse(fdate);
            Intrinsics.checkNotNull(date);
            String str = simpleDateFormat2.format(date);
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        } catch (Exception unused) {
            return fdate;
        }
    }

    public final String x1() {
        String str = this.clName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clName");
        return null;
    }

    public final String y1() {
        String str = this.clPhoto;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clPhoto");
        return null;
    }

    public final nr1 z1() {
        nr1 nr1Var = this.dlServicesViewModel;
        if (nr1Var != null) {
            return nr1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlServicesViewModel");
        return null;
    }
}
