package com.nic.mparivahan.Account.View;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.AbtCntctTerms.AboutUs;
import com.nic.mparivahan.Account.CreateAccountServices;
import com.nic.mparivahan.Account.Model.GetCitizenDetails;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Account.Model.State;
import com.nic.mparivahan.Account.Model.StateMaster;
import com.nic.mparivahan.Account.Model.UserRegisterResult;
import com.nic.mparivahan.Account.View.CreateAccountScreen;
import com.nic.mparivahan.R;
import com.zepto.dl4;
import com.zepto.f11;
import com.zepto.gd1;
import com.zepto.hz0;
import com.zepto.mf4;
import com.zepto.mt6;
import com.zepto.p11;
import com.zepto.pq;
import com.zepto.q11;
import com.zepto.s14;
import com.zepto.t66;
import com.zepto.ta3;
import com.zepto.un7;
import com.zepto.va3;
import com.zepto.vn7;
import com.zepto.wa3;
import com.zepto.zy3;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0016\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\tR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010-\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010$\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\"\u00101\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010$\u001a\u0004\b/\u0010&\"\u0004\b0\u0010(R\"\u00105\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u0010$\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(R\"\u00109\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u0010$\u001a\u0004\b7\u0010&\"\u0004\b8\u0010(R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010]\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010T\u001a\u0004\b[\u0010V\"\u0004\b\\\u0010XR\"\u0010a\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010T\u001a\u0004\b_\u0010V\"\u0004\b`\u0010XR\"\u0010i\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010m\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010\u0014\u001a\u0004\bk\u0010\u0016\"\u0004\bl\u0010\u0018R\"\u0010u\u001a\u00020n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\"\u0010|\u001a\u00020v8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u00102\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R'\u0010\u0084\u0001\u001a\u00020}8\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u0087\u0001"}, d2 = {"Lcom/nic/mparivahan/Account/View/CreateAccountScreen;", "Lcom/zepto/pq;", "", "onBackPressed", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "title", "r1", "message", "R1", "Lcom/zepto/zy3;", "C", "Lcom/zepto/zy3;", "binding", "Landroid/widget/TextView;", "D", "Landroid/widget/TextView;", "C1", "()Landroid/widget/TextView;", "c2", "(Landroid/widget/TextView;)V", "redirectToSignScreen", "Landroid/widget/LinearLayout;", "E", "Landroid/widget/LinearLayout;", "H1", "()Landroid/widget/LinearLayout;", "h2", "(Landroid/widget/LinearLayout;)V", "submit", "Landroid/widget/EditText;", "F", "Landroid/widget/EditText;", "x1", "()Landroid/widget/EditText;", "X1", "(Landroid/widget/EditText;)V", "fullname", "G", "z1", "Z1", "mobile_number", "H", "A1", "a2", "mpin", "I", "u1", "U1", "confirmMpin", "J", "w1", "W1", "email", "Lcom/zepto/q11;", "K", "Lcom/zepto/q11;", "I1", "()Lcom/zepto/q11;", "i2", "(Lcom/zepto/q11;)V", "viewModel", "Lcom/nic/mparivahan/Account/CreateAccountServices;", "L", "Lcom/nic/mparivahan/Account/CreateAccountServices;", "D1", "()Lcom/nic/mparivahan/Account/CreateAccountServices;", "d2", "(Lcom/nic/mparivahan/Account/CreateAccountServices;)V", "retrofitService", "Landroid/app/ProgressDialog;", "M", "Landroid/app/ProgressDialog;", "B1", "()Landroid/app/ProgressDialog;", "b2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Landroid/widget/ImageView;", "N", "Landroid/widget/ImageView;", "t1", "()Landroid/widget/ImageView;", "T1", "(Landroid/widget/ImageView;)V", "backButton", "O", "F1", "f2", "showmpin", "P", "v1", "V1", "confirmShowMpin", "Landroid/widget/Spinner;", "Q", "Landroid/widget/Spinner;", "E1", "()Landroid/widget/Spinner;", "e2", "(Landroid/widget/Spinner;)V", "select_spinner", "R", "G1", "g2", "signUpTermCond", "Lcom/zepto/vn7;", "S", "Lcom/zepto/vn7;", "J1", "()Lcom/zepto/vn7;", "j2", "(Lcom/zepto/vn7;)V", "viewModelReg", "", "T", "getRootcondition", "()I", "setRootcondition", "(I)V", "rootcondition", "Lcom/zepto/wa3;", "U", "Lcom/zepto/wa3;", "y1", "()Lcom/zepto/wa3;", "Y1", "(Lcom/zepto/wa3;)V", "langSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class CreateAccountScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public zy3 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public TextView redirectToSignScreen;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public LinearLayout submit;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public EditText fullname;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public EditText mobile_number;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public EditText mpin;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public EditText confirmMpin;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public EditText email;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public q11 viewModel;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public CreateAccountServices retrofitService;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ImageView backButton;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public ImageView showmpin;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public ImageView confirmShowMpin;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public Spinner select_spinner;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public TextView signUpTermCond;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public vn7 viewModelReg;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public int rootcondition;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public wa3 langSession;

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
        public final void a(UserRegisterResult userRegisterResult) {
            try {
                if (StringsKt__StringsJVMKt.equals(userRegisterResult.getStatusCode(), "CTZN001", true)) {
                    CreateAccountScreen.this.I1().h(CreateAccountScreen.this.z1().getText().toString(), CreateAccountScreen.this);
                } else {
                    CreateAccountScreen.this.B1().dismiss();
                    CreateAccountScreen createAccountScreen = CreateAccountScreen.this;
                    createAccountScreen.R1(createAccountScreen, createAccountScreen.y1().b(va3.a.M0(), "Unable to register the user. Please try after some time"));
                }
            } catch (Exception unused) {
                CreateAccountScreen.this.B1().dismiss();
                CreateAccountScreen createAccountScreen2 = CreateAccountScreen.this;
                createAccountScreen2.R1(createAccountScreen2, createAccountScreen2.y1().b(va3.a.M0(), "Unable to register the user. Please try after some time"));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((UserRegisterResult) obj);
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
        public final void invoke(String str) {
            CreateAccountScreen.this.B1().dismiss();
            CreateAccountScreen createAccountScreen = CreateAccountScreen.this;
            createAccountScreen.R1(createAccountScreen, createAccountScreen.y1().b(va3.a.M0(), "Unable to register the user. Please try after some time"));
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(StateMaster stateMaster) {
            try {
                if (StringsKt__StringsJVMKt.equals(stateMaster.getStatusCode(), "MSTR001", true)) {
                    CreateAccountScreen.this.B1().dismiss();
                    ArrayList<State> states = stateMaster.getStates();
                    Intrinsics.checkNotNull(states, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.Account.Model.State>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.Account.Model.State> }");
                    states.add(0, new State(String.valueOf(CreateAccountScreen.this.y1().b("edit_dl_serv_selc_state", "Select State")), "0", false, false, 0));
                    CreateAccountScreen.this.E1().setAdapter((SpinnerAdapter) new t66(CreateAccountScreen.this, states));
                } else {
                    CreateAccountScreen.this.B1().dismiss();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(0, new State(String.valueOf(CreateAccountScreen.this.y1().b("edit_dl_serv_selc_state", "Select State")), "0", false, false, 0));
                    CreateAccountScreen.this.E1().setAdapter((SpinnerAdapter) new t66(CreateAccountScreen.this, arrayList));
                }
            } catch (Exception e) {
                CreateAccountScreen.this.B1().dismiss();
                e.printStackTrace();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(0, new State("Select State", "0", false, false, 0));
                CreateAccountScreen.this.E1().setAdapter((SpinnerAdapter) new t66(CreateAccountScreen.this, arrayList2));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((StateMaster) obj);
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
            CreateAccountScreen.this.B1().dismiss();
            ArrayList arrayList = new ArrayList();
            arrayList.add(0, new State("Select State", "0", false, false, 0));
            CreateAccountScreen.this.E1().setAdapter((SpinnerAdapter) new t66(CreateAccountScreen.this, arrayList));
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(GetCitizenDetails getCitizenDetails) {
            try {
                if (StringsKt__StringsJVMKt.equals(getCitizenDetails.getStatusCode(), "CTZN001", true) || StringsKt__StringsJVMKt.equals(getCitizenDetails.getStatusCode(), "CTZN099", true)) {
                    return;
                }
                CreateAccountScreen.this.B1().dismiss();
                Toast.makeText(CreateAccountScreen.this.getApplicationContext(), CreateAccountScreen.this.y1().b("label_log_unbl_sigin", "Unable to SignIn, Please try after some time"), 1).show();
            } catch (Exception e) {
                CreateAccountScreen.this.B1().dismiss();
                e.printStackTrace();
                Toast.makeText(CreateAccountScreen.this.getApplicationContext(), CreateAccountScreen.this.y1().b("label_log_unbl_sigin", "Unable to SignIn, Please try after some time"), 1).show();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetCitizenDetails) obj);
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
            CreateAccountScreen.this.B1().dismiss();
            Toast.makeText(CreateAccountScreen.this.getApplicationContext(), CreateAccountScreen.this.y1().b("label_log_unbl_sigin", "Unable to SignIn, Please try after some time"), 1).show();
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        public final void a(SendOtpResult sendOtpResult) {
            try {
                CreateAccountScreen.this.B1().dismiss();
                if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL001", true)) {
                    String string = CreateAccountScreen.this.x1().getText().toString();
                    String string2 = CreateAccountScreen.this.z1().getText().toString();
                    String string3 = CreateAccountScreen.this.A1().getText().toString();
                    String string4 = CreateAccountScreen.this.w1().getText().toString();
                    Object selectedItem = CreateAccountScreen.this.E1().getSelectedItem();
                    Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.Account.Model.State");
                    Intent intent = new Intent(CreateAccountScreen.this, (Class<?>) VerifyMobileNumberUserRegister.class);
                    intent.putExtra("Param", sendOtpResult.getParam());
                    intent.putExtra("FullName", string);
                    intent.putExtra("MobileNo", string2);
                    intent.putExtra("MPIN", string3);
                    intent.putExtra("Email", string4);
                    intent.putExtra("StateCode", ((State) selectedItem).getStateCode().toString());
                    intent.putExtra("otpId", String.valueOf(sendOtpResult.getRecordId()));
                    CreateAccountScreen.this.startActivity(intent);
                } else if (gd1.a.m(sendOtpResult.getStatusDesc())) {
                    Toast.makeText(CreateAccountScreen.this.getApplicationContext(), CreateAccountScreen.this.y1().b("label_log_unbl_sigup", "Unable to SignUp, Please try after some time"), 1).show();
                } else {
                    Toast.makeText(CreateAccountScreen.this.getApplicationContext(), sendOtpResult.getStatusDesc(), 1).show();
                }
            } catch (Exception unused) {
                Toast.makeText(CreateAccountScreen.this.getApplicationContext(), CreateAccountScreen.this.y1().b("label_log_unbl_sigup", "Unable to SignUp, Please try after some time"), 1).show();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SendOtpResult) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class h extends Lambda implements Function1 {
        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            CreateAccountScreen.this.B1().dismiss();
            Toast.makeText(CreateAccountScreen.this.getApplicationContext(), CreateAccountScreen.this.y1().b("label_log_unbl_sigup", "Unable to SignUp, Please try after some time"), 1).show();
        }
    }

    public static final class i extends Lambda implements Function1 {
        public i() {
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
        public final void a(GetCitizenDetails getCitizenDetails) {
            try {
                if (StringsKt__StringsJVMKt.equals(getCitizenDetails.getStatusCode(), "CTZN001", true)) {
                    CreateAccountScreen.this.B1().dismiss();
                    CreateAccountScreen createAccountScreen = CreateAccountScreen.this;
                    createAccountScreen.r1(createAccountScreen, hz0.a.F());
                } else if (StringsKt__StringsJVMKt.equals(getCitizenDetails.getStatusCode(), "CTZN099", true) || StringsKt__StringsJVMKt.equals(getCitizenDetails.getStatusCode(), "CTZN089", true)) {
                    try {
                        CreateAccountScreen.this.x1().getText().toString();
                        CreateAccountScreen.this.z1().getText().toString();
                        CreateAccountScreen.this.A1().getText().toString();
                        CreateAccountScreen.this.w1().getText().toString();
                        Object selectedItem = CreateAccountScreen.this.E1().getSelectedItem();
                        Intrinsics.checkNotNull(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.Account.Model.State");
                        CreateAccountScreen.this.I1().o(CreateAccountScreen.this.z1().getText().toString(), 101);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (gd1.a.m(getCitizenDetails.getStatusDesc())) {
                    CreateAccountScreen.this.B1().dismiss();
                    Toast.makeText(CreateAccountScreen.this.getApplicationContext(), CreateAccountScreen.this.y1().b("label_log_unbl_sigup", "Unable to SignUp, Please try after some time"), 1).show();
                } else {
                    Toast.makeText(CreateAccountScreen.this.getApplicationContext(), getCitizenDetails.getStatusDesc(), 1).show();
                }
            } catch (Exception e2) {
                CreateAccountScreen.this.B1().dismiss();
                e2.printStackTrace();
                Toast.makeText(CreateAccountScreen.this.getApplicationContext(), CreateAccountScreen.this.y1().b("label_log_unbl_sigup", "Unable to SignUp, Please try after some time"), 1).show();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetCitizenDetails) obj);
            return Unit.INSTANCE;
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

        public final void invoke(String str) {
            CreateAccountScreen.this.B1().dismiss();
            Toast.makeText(CreateAccountScreen.this.getApplicationContext(), CreateAccountScreen.this.y1().b("label_log_unbl_sigin", "Unable to SignIn, Please try after some time"), 1).show();
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

    public static final void K1(CreateAccountScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.A1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            this$0.F1().setImageResource(R.drawable.pass_visible);
            this$0.A1().setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            this$0.F1().setImageResource(R.drawable.mvvm_visibility);
            this$0.A1().setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public static final void L1(CreateAccountScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.u1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            this$0.v1().setImageResource(R.drawable.pass_visible);
            this$0.u1().setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            this$0.v1().setImageResource(R.drawable.mvvm_visibility);
            this$0.u1().setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public static final void M1(CreateAccountScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) SignInScreen.class));
        this$0.finish();
    }

    public static final void N1(CreateAccountScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) SignInScreen.class));
        this$0.finish();
    }

    public static final void O1(CreateAccountScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.x1().getText().toString();
        String string2 = this$0.z1().getText().toString();
        String string3 = this$0.A1().getText().toString();
        String string4 = this$0.u1().getText().toString();
        String string5 = this$0.w1().getText().toString();
        if (this$0.E1().getSelectedItemPosition() == 0) {
            Toast.makeText(this$0.getApplicationContext(), this$0.y1().b("label_log_sel_state", "Please select state"), 1).show();
            return;
        }
        if (string.length() < 3) {
            Toast.makeText(this$0.getApplicationContext(), this$0.y1().b("label_log_entr_name", "Please enter the full name"), 1).show();
            return;
        }
        if (string2 == null || string2.length() == 0 || string2.length() < 10) {
            Toast.makeText(this$0.getApplicationContext(), this$0.y1().b("label_log_entr_vali_mobno", "Please enter the valid mobile number"), 1).show();
            return;
        }
        if (string3.length() < 6) {
            Toast.makeText(this$0.getApplicationContext(), this$0.y1().b("label_log_entr_valid_dig_pin", "Please enter valid 6 digit MPIN"), 1).show();
            return;
        }
        if (string4.length() < 6) {
            Toast.makeText(this$0.getApplicationContext(), this$0.y1().b("label_log_entr_valid_dig_pin", "Please enter valid 6 digit MPIN"), 1).show();
            return;
        }
        if (!Intrinsics.areEqual(string3, string4)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.y1().b(va3.a.I(), "MPIN & confirm MPIN should be same"), 1).show();
            return;
        }
        if (string5 == null || string5.length() == 0) {
            Toast.makeText(this$0.getApplicationContext(), this$0.y1().b("label_log_entr_emaiid", "Please enter the email Id"), 1).show();
            return;
        }
        mt6.a aVar = mt6.a;
        if (!aVar.u(string5)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.y1().b("label_log_entr_valid_email", "Please enter the valid email Id"), 1).show();
            return;
        }
        if (!aVar.t(string2)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.y1().b("label_log_entr_vali_mobno", "Please enter the valid mobile number"), 1).show();
            return;
        }
        this$0.B1().show();
        if (this$0.rootcondition == 1) {
            this$0.I1().o(this$0.z1().getText().toString(), 101);
        } else {
            this$0.I1().g(string2, this$0);
        }
    }

    public static final void P1(CreateAccountScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        final Dialog dialog = new Dialog(this$0);
        dialog.setContentView(R.layout.term_cond_dialog);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        String str = s14.a.g() + this$0.y1().d() + "/mparivahan-info-terms-of-use.html";
        View viewFindViewById = dialog.findViewById(R.id.cancelIv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = dialog.findViewById(R.id.termConditionWv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        WebView webView = (WebView) viewFindViewById2;
        ((ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.o11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CreateAccountScreen.Q1(dialog, view2);
            }
        });
        webView.setWebViewClient(new AboutUs.a());
        webView.loadUrl(str);
        webView.clearCache(true);
        dialog.show();
    }

    public static final void Q1(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    public static final void S1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void s1(Dialog dialog, CreateAccountScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dialog.dismiss();
        this$0.startActivity(new Intent(this$0, (Class<?>) SignInScreen.class));
        this$0.finish();
    }

    public final EditText A1() {
        EditText editText = this.mpin;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mpin");
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

    public final TextView C1() {
        TextView textView = this.redirectToSignScreen;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("redirectToSignScreen");
        return null;
    }

    public final CreateAccountServices D1() {
        CreateAccountServices createAccountServices = this.retrofitService;
        if (createAccountServices != null) {
            return createAccountServices;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final Spinner E1() {
        Spinner spinner = this.select_spinner;
        if (spinner != null) {
            return spinner;
        }
        Intrinsics.throwUninitializedPropertyAccessException("select_spinner");
        return null;
    }

    public final ImageView F1() {
        ImageView imageView = this.showmpin;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("showmpin");
        return null;
    }

    public final TextView G1() {
        TextView textView = this.signUpTermCond;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("signUpTermCond");
        return null;
    }

    public final LinearLayout H1() {
        LinearLayout linearLayout = this.submit;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("submit");
        return null;
    }

    public final q11 I1() {
        q11 q11Var = this.viewModel;
        if (q11Var != null) {
            return q11Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final vn7 J1() {
        vn7 vn7Var = this.viewModelReg;
        if (vn7Var != null) {
            return vn7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelReg");
        return null;
    }

    public final void R1(Context context, String message) {
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
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(y1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(y1().b("btn_ok", "OK"));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.m11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateAccountScreen.S1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void T1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.backButton = imageView;
    }

    public final void U1(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.confirmMpin = editText;
    }

    public final void V1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.confirmShowMpin = imageView;
    }

    public final void W1(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.email = editText;
    }

    public final void X1(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.fullname = editText;
    }

    public final void Y1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void Z1(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.mobile_number = editText;
    }

    public final void a2(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.mpin = editText;
    }

    public final void b2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void c2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.redirectToSignScreen = textView;
    }

    public final void d2(CreateAccountServices createAccountServices) {
        Intrinsics.checkNotNullParameter(createAccountServices, "<set-?>");
        this.retrofitService = createAccountServices;
    }

    public final void e2(Spinner spinner) {
        Intrinsics.checkNotNullParameter(spinner, "<set-?>");
        this.select_spinner = spinner;
    }

    public final void f2(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.showmpin = imageView;
    }

    public final void g2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.signUpTermCond = textView;
    }

    public final void h2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.submit = linearLayout;
    }

    public final void i2(q11 q11Var) {
        Intrinsics.checkNotNullParameter(q11Var, "<set-?>");
        this.viewModel = q11Var;
    }

    public final void j2(vn7 vn7Var) {
        Intrinsics.checkNotNullParameter(vn7Var, "<set-?>");
        this.viewModelReg = vn7Var;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        startActivity(new Intent(this, (Class<?>) SignInScreen.class));
        finish();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        zy3 zy3VarC = zy3.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(zy3VarC, "inflate(...)");
        this.binding = zy3VarC;
        hz0.a aVar = hz0.a;
        aVar.k(this);
        zy3 zy3Var = this.binding;
        zy3 zy3Var2 = null;
        if (zy3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zy3Var = null;
        }
        setContentView(zy3Var.b());
        com.nic.mparivahan.Welcome.a.a.a(this);
        ta3.a aVar2 = ta3.a;
        zy3 zy3Var3 = this.binding;
        if (zy3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            zy3Var2 = zy3Var3;
        }
        aVar2.l0(this, zy3Var2);
        Y1(new wa3(this));
        View viewFindViewById = findViewById(R.id.sign_in);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        c2((TextView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.submit);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        h2((LinearLayout) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.full_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        X1((EditText) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.mobile_number);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        Z1((EditText) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.mpin);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        a2((EditText) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.confirmMpin);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        U1((EditText) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.email);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        W1((EditText) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.showmpin);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        f2((ImageView) viewFindViewById8);
        View viewFindViewById9 = findViewById(R.id.confirmShowMpin);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        V1((ImageView) viewFindViewById9);
        View viewFindViewById10 = findViewById(R.id.select_spinner);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        e2((Spinner) viewFindViewById10);
        View viewFindViewById11 = findViewById(R.id.signUpTermCond);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        g2((TextView) viewFindViewById11);
        d2(CreateAccountServices.INSTANCE.a(this));
        i2((q11) new z(this, new p11(new f11(D1()))).a(q11.class));
        j2((vn7) new z(this, new un7(new f11(D1()))).a(vn7.class));
        F1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.g11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateAccountScreen.K1(this.a, view);
            }
        });
        v1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.h11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateAccountScreen.L1(this.a, view);
            }
        });
        View viewFindViewById12 = findViewById(R.id.backButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        T1((ImageView) viewFindViewById12);
        t1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.i11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateAccountScreen.M1(this.a, view);
            }
        });
        b2(new ProgressDialog(this));
        B1().setMessage(y1().b("label_challan_please_wait", "Please wait..."));
        B1().setCancelable(false);
        B1().setCanceledOnTouchOutside(false);
        if (getIntent() != null) {
            this.rootcondition = getIntent().getIntExtra(aVar.l(), 0);
        }
        if (new dl4(this).e().equals("0")) {
            B1().show();
            I1().r();
        } else {
            B1().show();
            I1().r();
        }
        I1().n().g(this, new k(new g()));
        I1().i().g(this, new k(new h()));
        C1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.j11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateAccountScreen.N1(this.a, view);
            }
        });
        H1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.k11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateAccountScreen.O1(this.a, view);
            }
        });
        I1().m().g(this, new k(new i()));
        I1().l().g(this, new k(new j()));
        J1().n().g(this, new k(new a()));
        J1().m().g(this, new k(new b()));
        I1().p().g(this, new k(new c()));
        I1().s().g(this, new k(new d()));
        I1().k().g(this, new k(new e()));
        I1().j().g(this, new k(new f()));
        G1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.l11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateAccountScreen.P1(this.a, view);
            }
        });
    }

    public final void r1(Context context, String title) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.mvvm_number_dialog);
        View viewFindViewById = dialog.findViewById(R.id.txt_dialog);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(title);
        View viewFindViewById2 = dialog.findViewById(R.id.ok);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.n11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateAccountScreen.s1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final ImageView t1() {
        ImageView imageView = this.backButton;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("backButton");
        return null;
    }

    public final EditText u1() {
        EditText editText = this.confirmMpin;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("confirmMpin");
        return null;
    }

    public final ImageView v1() {
        ImageView imageView = this.confirmShowMpin;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("confirmShowMpin");
        return null;
    }

    public final EditText w1() {
        EditText editText = this.email;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("email");
        return null;
    }

    public final EditText x1() {
        EditText editText = this.fullname;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fullname");
        return null;
    }

    public final wa3 y1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final EditText z1() {
        EditText editText = this.mobile_number;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mobile_number");
        return null;
    }
}
