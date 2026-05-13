package com.nic.mparivahan.ClServices.View.clobileupdate;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.ClServices.View.clobileupdate.ClOTPMobile;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.mobupdate.DlUpdateMobResponse;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.zepto.kd1;
import com.zepto.lq7;
import com.zepto.lr1;
import com.zepto.mf4;
import com.zepto.mt6;
import com.zepto.nr1;
import com.zepto.o40;
import com.zepto.rq1;
import com.zepto.vm1;
import com.zepto.wa3;
import com.zepto.ws6;
import com.zepto.x7;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b]\u0010^J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J.\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007J\u0012\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u0007R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00103\u001a\u0004\b9\u00105\"\u0004\b:\u00107R$\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u00103\u001a\u0004\b<\u00105\"\u0004\b=\u00107R$\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u00103\u001a\u0004\b?\u00105\"\u0004\b@\u00107R$\u0010D\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u00103\u001a\u0004\bB\u00105\"\u0004\bC\u00107R\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010\\\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[¨\u0006_"}, d2 = {"Lcom/nic/mparivahan/ClServices/View/clobileupdate/ClOTPMobile;", "Lcom/zepto/o40;", "", "P1", "Q1", "R1", "S1", "", "message", "a2", "Landroid/content/Context;", "context", "mobile", "oldMobile", "clNo", "dob", "j2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Z1", "X1", "Lcom/zepto/x7;", "F", "Lcom/zepto/x7;", "F1", "()Lcom/zepto/x7;", "b2", "(Lcom/zepto/x7;)V", "binding", "Lcom/zepto/nr1;", "G", "Lcom/zepto/nr1;", "H1", "()Lcom/zepto/nr1;", "c2", "(Lcom/zepto/nr1;)V", "dlServicesViewModel", "Lcom/zepto/vm1;", "H", "Lcom/zepto/vm1;", "updateMobVm", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "I", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "N1", "()Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "h2", "(Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;)V", "retrofitService", "J", "Ljava/lang/String;", "G1", "()Ljava/lang/String;", "setClNo", "(Ljava/lang/String;)V", "K", "I1", "setDob", "L", "K1", "setMobile", "M", "L1", "e2", "N", "getRecord_id", "g2", "record_id", "Lcom/zepto/ws6;", "O", "Lcom/zepto/ws6;", "O1", "()Lcom/zepto/ws6;", "i2", "(Lcom/zepto/ws6;)V", "sessionManager", "Lcom/zepto/wa3;", "P", "Lcom/zepto/wa3;", "J1", "()Lcom/zepto/wa3;", "d2", "(Lcom/zepto/wa3;)V", "langSession", "Landroid/app/ProgressDialog;", "Q", "Landroid/app/ProgressDialog;", "M1", "()Landroid/app/ProgressDialog;", "f2", "(Landroid/app/ProgressDialog;)V", "pDialog", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ClOTPMobile extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public x7 binding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public nr1 dlServicesViewModel;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public vm1 updateMobVm;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public DlServiceInt retrofitService;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String clNo;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String dob;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String mobile;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String oldMobile;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String record_id;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: com.nic.mparivahan.ClServices.View.clobileupdate.ClOTPMobile$a$a, reason: collision with other inner class name */
        public static final class C0045a extends Lambda implements Function1 {
            public static final C0045a c = new C0045a();

            public C0045a() {
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

        public final void a(SendOtpResult sendOtpResult) {
            try {
                if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL001", true)) {
                    ClOTPMobile.this.g2(String.valueOf(sendOtpResult.getRecordId()));
                } else if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL099", true)) {
                    mt6.a.c(ClOTPMobile.this, sendOtpResult.getStatusDesc());
                } else {
                    ClOTPMobile clOTPMobile = ClOTPMobile.this;
                    String strB = clOTPMobile.J1().b("nex_parivahan", ClOTPMobile.this.getString(R.string.app_name));
                    Intrinsics.checkNotNull(strB);
                    String statusDesc = sendOtpResult.getStatusDesc();
                    String strB2 = ClOTPMobile.this.J1().b("btn_ok", ClOTPMobile.this.getString(R.string.ok_txt));
                    Intrinsics.checkNotNull(strB2);
                    o40.q1(clOTPMobile, strB, statusDesc, 1, strB2, null, C0045a.c, 16, null);
                }
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SendOtpResult) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {

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

        public b() {
            super(1);
        }

        public final void a(OtpVerifyResult otpVerifyResult) {
            try {
                if (StringsKt__StringsJVMKt.equals(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    ClOTPMobile clOTPMobile = ClOTPMobile.this;
                    String strB = clOTPMobile.J1().b("label_want_to_proceed", "Are you sure, You want to proceed ?");
                    Intrinsics.checkNotNull(strB);
                    clOTPMobile.a2(strB);
                } else {
                    ClOTPMobile clOTPMobile2 = ClOTPMobile.this;
                    String strB2 = clOTPMobile2.J1().b("nex_parivahan", ClOTPMobile.this.getString(R.string.app_name));
                    Intrinsics.checkNotNull(strB2);
                    String statusDesc = otpVerifyResult.getStatusDesc();
                    Intrinsics.checkNotNull(statusDesc);
                    String strB3 = ClOTPMobile.this.J1().b("btn_ok", ClOTPMobile.this.getString(R.string.ok_txt));
                    Intrinsics.checkNotNull(strB3);
                    o40.q1(clOTPMobile2, strB2, statusDesc, 1, strB3, null, a.c, 16, null);
                }
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OtpVerifyResult) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1 {

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

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            ClOTPMobile.this.M1().dismiss();
            ClOTPMobile clOTPMobile = ClOTPMobile.this;
            String strB = clOTPMobile.J1().b("nex_parivahan", ClOTPMobile.this.getString(R.string.app_name));
            Intrinsics.checkNotNull(strB);
            String strB2 = ClOTPMobile.this.J1().b("service_is_not_present", ClOTPMobile.this.getString(R.string.unable_to_get_details));
            Intrinsics.checkNotNull(strB2);
            String strB3 = ClOTPMobile.this.J1().b("btn_ok", ClOTPMobile.this.getString(R.string.ok_txt));
            Intrinsics.checkNotNull(strB3);
            o40.q1(clOTPMobile, strB, strB2, 1, strB3, null, a.c, 16, null);
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

        /* JADX INFO: renamed from: com.nic.mparivahan.ClServices.View.clobileupdate.ClOTPMobile$d$d, reason: collision with other inner class name */
        public static final class C0046d extends Lambda implements Function1 {
            public static final C0046d c = new C0046d();

            public C0046d() {
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

        public final void a(ResendOtp resendOtp) {
            ClOTPMobile.this.M1().dismiss();
            try {
                if (StringsKt__StringsJVMKt.equals(resendOtp.getStatusCode(), "AL001", true)) {
                    ClOTPMobile clOTPMobile = ClOTPMobile.this;
                    String strB = clOTPMobile.J1().b("nex_parivahan", ClOTPMobile.this.getString(R.string.app_name));
                    Intrinsics.checkNotNull(strB);
                    String strB2 = ClOTPMobile.this.J1().b("btn_ok", "OK");
                    Intrinsics.checkNotNull(strB2);
                    o40.q1(clOTPMobile, strB, "OTP has been resent successfully.", 1, strB2, null, a.c, 16, null);
                } else if (StringsKt__StringsJVMKt.equals(resendOtp.getStatusCode(), "AL002", true)) {
                    ClOTPMobile clOTPMobile2 = ClOTPMobile.this;
                    String strB3 = clOTPMobile2.J1().b("nex_parivahan", ClOTPMobile.this.getString(R.string.app_name));
                    Intrinsics.checkNotNull(strB3);
                    String statusDesc = resendOtp.getStatusDesc();
                    String strB4 = ClOTPMobile.this.J1().b("btn_ok", ClOTPMobile.this.getString(R.string.ok_txt));
                    Intrinsics.checkNotNull(strB4);
                    o40.q1(clOTPMobile2, strB3, statusDesc, 1, strB4, null, b.c, 16, null);
                } else {
                    ClOTPMobile clOTPMobile3 = ClOTPMobile.this;
                    String strB5 = clOTPMobile3.J1().b("nex_parivahan", ClOTPMobile.this.getString(R.string.app_name));
                    Intrinsics.checkNotNull(strB5);
                    String statusDesc2 = resendOtp.getStatusDesc();
                    String strB6 = ClOTPMobile.this.J1().b("btn_ok", ClOTPMobile.this.getString(R.string.ok_txt));
                    Intrinsics.checkNotNull(strB6);
                    o40.q1(clOTPMobile3, strB5, statusDesc2, 1, strB6, null, c.c, 16, null);
                }
            } catch (Exception unused) {
                ClOTPMobile clOTPMobile4 = ClOTPMobile.this;
                String strB7 = clOTPMobile4.J1().b("nex_parivahan", ClOTPMobile.this.getString(R.string.app_name));
                Intrinsics.checkNotNull(strB7);
                String strB8 = ClOTPMobile.this.J1().b("service_is_not_present", ClOTPMobile.this.getString(R.string.unable_to_get_details));
                Intrinsics.checkNotNull(strB8);
                String strB9 = ClOTPMobile.this.J1().b("btn_ok", ClOTPMobile.this.getString(R.string.ok_txt));
                Intrinsics.checkNotNull(strB9);
                o40.q1(clOTPMobile4, strB7, strB8, 1, strB9, null, C0046d.c, 16, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ResendOtp) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
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
        public final void a(DlUpdateMobResponse dlUpdateMobResponse) {
            try {
                ClOTPMobile.this.F1().M.c(false);
                Integer errno = dlUpdateMobResponse.getErrno();
                if (errno != null && errno.intValue() == 1) {
                    ClOTPMobile clOTPMobile = ClOTPMobile.this;
                    clOTPMobile.X1(clOTPMobile, String.valueOf(dlUpdateMobResponse.getErrmsg()));
                } else {
                    String errmsg = dlUpdateMobResponse.getErrmsg();
                    if (errmsg != null) {
                        ClOTPMobile.this.Z1(errmsg);
                    }
                }
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DlUpdateMobResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends CountDownTimer {
        public f() {
            super(30000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            ClOTPMobile.this.F1().I.setVisibility(0);
            ClOTPMobile.this.F1().N.setText("0");
            ClOTPMobile.this.F1().N.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            ClOTPMobile.this.F1().N.setText(ClOTPMobile.this.J1().b("time_remaining", ClOTPMobile.this.getString(R.string.time_remaining)) + " : " + (j / ((long) 1000)));
            ClOTPMobile.this.F1().I.setVisibility(8);
            ClOTPMobile.this.F1().N.setVisibility(0);
        }
    }

    public static final class g extends Lambda implements Function1 {
        public static final g c = new g();

        public g() {
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

    public static final class h extends Lambda implements Function1 {
        public static final h c = new h();

        public h() {
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

    public static final class i extends Lambda implements Function1 {
        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ClOTPMobile.this.finish();
        }
    }

    public static final class j extends Lambda implements Function1 {
        public j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (StringsKt__StringsJVMKt.equals(it, "yes", true)) {
                ClOTPMobile.this.F1().M.c(true);
                String oldMobile = ClOTPMobile.this.getOldMobile();
                if (oldMobile != null && oldMobile.length() == 0) {
                    ClOTPMobile.this.e2("0");
                }
                vm1 vm1Var = ClOTPMobile.this.updateMobVm;
                if (vm1Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("updateMobVm");
                    vm1Var = null;
                }
                String dob = ClOTPMobile.this.getDob();
                Intrinsics.checkNotNull(dob);
                String oldMobile2 = ClOTPMobile.this.getOldMobile();
                Intrinsics.checkNotNull(oldMobile2);
                String clNo = ClOTPMobile.this.getClNo();
                Intrinsics.checkNotNull(clNo);
                String mobile = ClOTPMobile.this.getMobile();
                Intrinsics.checkNotNull(mobile);
                vm1Var.k(dob, "CL", oldMobile2, true, clNo, mobile);
            }
        }
    }

    public static final class k implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public k(Function1 function) {
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

    private final void P1() {
        f2(new ProgressDialog(this));
        M1().setMessage(J1().b("label_challan_please_wait", "Please wait..."));
        M1().setCancelable(false);
        M1().setCanceledOnTouchOutside(false);
        try {
            this.dob = String.valueOf(getIntent().getStringExtra("dobValue"));
            this.clNo = String.valueOf(getIntent().getStringExtra("dlValue"));
            this.mobile = String.valueOf(getIntent().getStringExtra("mobileNumber"));
            this.oldMobile = String.valueOf(getIntent().getStringExtra("old_mobile"));
            F1().G.setText(this.mobile);
            i2(new ws6(this));
            F1().L.setText(J1().b("label_dl_serv_update_mob", "Update Mobile Number"));
            F1().z.setText(this.clNo);
            F1().y.setText(J1().b("CL_NO", "CL No.") + " : " + this.clNo);
            F1().D.g.setText(J1().b("label_dl_serv_update_mob", "Update Mobile Number"));
        } catch (Exception unused) {
        }
    }

    private final void Q1() {
        c2((nr1) new z(this, new rq1(new lr1(N1(), this))).a(nr1.class));
        String str = this.mobile;
        if (str != null) {
            H1().F(this, str, O1().k());
        }
        H1().u().g(this, new k(new a()));
        H1().E().g(this, new k(new b()));
        H1().v().g(this, new k(new c()));
        H1().w().g(this, new k(new d()));
    }

    private final void S1() {
        F1().D.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.un0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClOTPMobile.T1(this.a, view);
            }
        });
        F1().I.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClOTPMobile.U1(this.a, view);
            }
        });
        F1().M.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClOTPMobile.V1(this.a, view);
            }
        });
        F1().J.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClOTPMobile.W1(this.a, view);
            }
        });
    }

    public static final void T1(ClOTPMobile this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void U1(ClOTPMobile this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.M1().show();
        this$0.H1().D(this$0, String.valueOf(this$0.record_id));
        this$0.new f().start();
    }

    public static final void V1(ClOTPMobile this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Editable text = this$0.F1().A.getText();
        Intrinsics.checkNotNull(text);
        if (text.length() == 0) {
            String strB = this$0.J1().b("nex_parivahan", this$0.getString(R.string.app_name));
            Intrinsics.checkNotNull(strB);
            String strB2 = this$0.J1().b("enter_otp", "Please enter OTP");
            Intrinsics.checkNotNull(strB2);
            String strB3 = this$0.J1().b("btn_ok", this$0.getString(R.string.ok_txt));
            Intrinsics.checkNotNull(strB3);
            o40.q1(this$0, strB, strB2, 1, strB3, null, g.c, 16, null);
            return;
        }
        Editable text2 = this$0.F1().A.getText();
        Intrinsics.checkNotNull(text2);
        if (text2.length() >= 6) {
            nr1 nr1VarH1 = this$0.H1();
            String strValueOf = String.valueOf(this$0.F1().A.getText());
            String str = this$0.record_id;
            Intrinsics.checkNotNull(str);
            nr1VarH1.G(this$0, strValueOf, str);
            return;
        }
        String strB4 = this$0.J1().b("nex_parivahan", this$0.getString(R.string.app_name));
        Intrinsics.checkNotNull(strB4);
        String strB5 = this$0.J1().b("enter_valid_otp", "Please enter the valid OTP");
        Intrinsics.checkNotNull(strB5);
        String strB6 = this$0.J1().b("btn_ok", this$0.getString(R.string.ok_txt));
        Intrinsics.checkNotNull(strB6);
        o40.q1(this$0, strB4, strB5, 1, strB6, null, h.c, 16, null);
    }

    public static final void W1(ClOTPMobile this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void Y1(ProgressBar pb_otp, ClOTPMobile this$0, View view) {
        Intrinsics.checkNotNullParameter(pb_otp, "$pb_otp");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        pb_otp.setVisibility(0);
        Toast.makeText(this$0.getApplicationContext(), this$0.J1().b("app_red", "Mobile No. is successfully updated \n App is redirecting to Dashboard"), 1).show();
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67141632);
        this$0.startActivity(intent);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a2(String message) {
        String strB = J1().b("nex_parivahan", getString(R.string.app_name));
        Intrinsics.checkNotNull(strB);
        o40.q1(this, strB, message, 0, null, null, new j(), 24, null);
    }

    public final x7 F1() {
        x7 x7Var = this.binding;
        if (x7Var != null) {
            return x7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    /* JADX INFO: renamed from: G1, reason: from getter */
    public final String getClNo() {
        return this.clNo;
    }

    public final nr1 H1() {
        nr1 nr1Var = this.dlServicesViewModel;
        if (nr1Var != null) {
            return nr1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlServicesViewModel");
        return null;
    }

    /* JADX INFO: renamed from: I1, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    public final wa3 J1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    /* JADX INFO: renamed from: K1, reason: from getter */
    public final String getMobile() {
        return this.mobile;
    }

    /* JADX INFO: renamed from: L1, reason: from getter */
    public final String getOldMobile() {
        return this.oldMobile;
    }

    public final ProgressDialog M1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final DlServiceInt N1() {
        DlServiceInt dlServiceInt = this.retrofitService;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final ws6 O1() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final void R1() {
        vm1 vm1Var = (vm1) new z(this).a(vm1.class);
        this.updateMobVm = vm1Var;
        if (vm1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("updateMobVm");
            vm1Var = null;
        }
        vm1Var.i().g(this, new k(new e()));
    }

    public final void X1(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_otp_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.pb_otp);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.ProgressBar");
        final ProgressBar progressBar = (ProgressBar) viewFindViewById3;
        progressBar.setVisibility(8);
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById4).setText(J1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(J1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClOTPMobile.Y1(progressBar, this, view);
            }
        });
        dialog.show();
    }

    public final void Z1(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String strB = J1().b("nex_parivahan", getString(R.string.app_name));
        Intrinsics.checkNotNull(strB);
        String strB2 = J1().b("btn_ok", getString(R.string.ok_txt));
        Intrinsics.checkNotNull(strB2);
        o40.q1(this, strB, message, 1, strB2, null, new i(), 16, null);
    }

    public final void b2(x7 x7Var) {
        Intrinsics.checkNotNullParameter(x7Var, "<set-?>");
        this.binding = x7Var;
    }

    public final void c2(nr1 nr1Var) {
        Intrinsics.checkNotNullParameter(nr1Var, "<set-?>");
        this.dlServicesViewModel = nr1Var;
    }

    public final void d2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void e2(String str) {
        this.oldMobile = str;
    }

    public final void f2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void g2(String str) {
        this.record_id = str;
    }

    public final void h2(DlServiceInt dlServiceInt) {
        Intrinsics.checkNotNullParameter(dlServiceInt, "<set-?>");
        this.retrofitService = dlServiceInt;
    }

    public final void i2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final void j2(Context context, String mobile, String oldMobile, String clNo, String dob) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mobile, "mobile");
        Intrinsics.checkNotNullParameter(oldMobile, "oldMobile");
        Intrinsics.checkNotNullParameter(clNo, "clNo");
        Intrinsics.checkNotNullParameter(dob, "dob");
        Intent intent = new Intent(context, (Class<?>) ClOTPMobile.class);
        intent.putExtra("mobileNumber", mobile);
        intent.putExtra("old_mobile", oldMobile);
        intent.putExtra("dlValue", clNo);
        intent.putExtra("dobValue", dob);
        context.startActivity(intent);
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cl_otpmobile);
        lq7 lq7VarF = kd1.f(this, R.layout.activity_cl_otpmobile);
        Intrinsics.checkNotNullExpressionValue(lq7VarF, "setContentView(...)");
        b2((x7) lq7VarF);
        h2(DlServiceInt.INSTANCE.a(this));
        d2(new wa3(this));
        P1();
        Q1();
        R1();
        S1();
    }
}
