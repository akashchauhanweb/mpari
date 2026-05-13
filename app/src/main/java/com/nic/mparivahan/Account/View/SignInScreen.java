package com.nic.mparivahan.Account.View;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.provider.Settings;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.google.gson.Gson;
import com.nic.mparivahan.APIController;
import com.nic.mparivahan.Account.Model.GetCitizenDetails;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Account.Model.UserLoginModel;
import com.nic.mparivahan.Account.SignService;
import com.nic.mparivahan.Account.View.SignInScreen;
import com.nic.mparivahan.Account.View.change.CreateForgotMpin;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dashboard.RCDownloadService.RCDownloads;
import com.nic.mparivahan.Dashboard.RCDownloadService.SaveVirtualRCService;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Dl.DLServiceWithoutDobModel.BioObj;
import com.nic.mparivahan.Dl.DLServiceWithoutDobModel.DLWithoutdobModel;
import com.nic.mparivahan.Dl.DlInterface.DlService;
import com.nic.mparivahan.Echallan.SearchChallanOnlineActivity;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.GetVirtualDocDetails;
import com.nic.mparivahan.RC.Model.MparCitizenDocInfo;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.a26;
import com.zepto.c26;
import com.zepto.cq;
import com.zepto.dl4;
import com.zepto.fj4;
import com.zepto.gd1;
import com.zepto.gj4;
import com.zepto.hs1;
import com.zepto.hz0;
import com.zepto.k60;
import com.zepto.lc5;
import com.zepto.ls3;
import com.zepto.mf4;
import com.zepto.mt6;
import com.zepto.n72;
import com.zepto.np7;
import com.zepto.p26;
import com.zepto.pq;
import com.zepto.s14;
import com.zepto.ta3;
import com.zepto.tu5;
import com.zepto.u14;
import com.zepto.va3;
import com.zepto.wa3;
import com.zepto.ws6;
import com.zepto.xy3;
import com.zepto.yy0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.concurrent.Executor;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b \u0001\u0010¡\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0015J\b\u0010\b\u001a\u00020\u0002H\u0014J\u0016\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u0016\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012J\u001e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bR\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00104\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010+\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R\"\u00108\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u0010+\u001a\u0004\b6\u0010-\"\u0004\b7\u0010/R\"\u0010<\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010+\u001a\u0004\b:\u0010-\"\u0004\b;\u0010/R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010P\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010?\u001a\u0004\bN\u0010A\"\u0004\bO\u0010CR\"\u0010T\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010G\u001a\u0004\bR\u0010I\"\u0004\bS\u0010KR\"\u0010\\\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010d\u001a\u00020]8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010h\u001a\u00020]8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010_\u001a\u0004\bf\u0010a\"\u0004\bg\u0010cR\"\u0010p\u001a\u00020i8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010x\u001a\u00020q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u0016\u0010|\u001a\u00020y8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bz\u0010{R'\u0010\u0084\u0001\u001a\u00020}8\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001a\u0010\u0088\u0001\u001a\u00030\u0085\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R)\u0010\u008f\u0001\u001a\u00030\u0089\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u008a\u0001\u0010>\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R&\u0010\u0093\u0001\u001a\u00020i8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0090\u0001\u0010k\u001a\u0005\b\u0091\u0001\u0010m\"\u0005\b\u0092\u0001\u0010oR\u001a\u0010\u0097\u0001\u001a\u00030\u0094\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001a\u0010\u009b\u0001\u001a\u00030\u0098\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001a\u0010\u009f\u0001\u001a\u00030\u009c\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001¨\u0006¢\u0001"}, d2 = {"Lcom/nic/mparivahan/Account/View/SignInScreen;", "Lcom/zepto/pq;", "", "J0", "y1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "Landroid/content/Context;", "context", "", "title", "w1", "message", "Z1", "onBackPressed", "u1", "Lcom/nic/mparivahan/RC/Model/GetVirtualDocDetails;", "virtualdetails", "s2", "dl", "doc", "C1", "b2", "Lcom/zepto/p26;", "C", "Lcom/zepto/p26;", "P1", "()Lcom/zepto/p26;", "q2", "(Lcom/zepto/p26;)V", "viewModel", "Lcom/zepto/gj4;", "D", "Lcom/zepto/gj4;", "Q1", "()Lcom/zepto/gj4;", "r2", "(Lcom/zepto/gj4;)V", "viewModel1", "Landroid/widget/TextView;", "E", "Landroid/widget/TextView;", "B1", "()Landroid/widget/TextView;", "f2", "(Landroid/widget/TextView;)V", "create_account", "F", "O1", "p2", "user_name", "G", "A1", "e2", "change_account", "H", "J1", "k2", "redirectToforgotmpin", "Landroid/widget/LinearLayout;", "I", "Landroid/widget/LinearLayout;", "M1", "()Landroid/widget/LinearLayout;", "n2", "(Landroid/widget/LinearLayout;)V", "signInWithOtp", "Landroid/widget/EditText;", "J", "Landroid/widget/EditText;", "G1", "()Landroid/widget/EditText;", "h2", "(Landroid/widget/EditText;)V", "mobile_number", "K", "N1", "o2", "signWithMpin", "L", "H1", "i2", "mpinEditText", "Landroid/app/ProgressDialog;", "M", "Landroid/app/ProgressDialog;", "I1", "()Landroid/app/ProgressDialog;", "j2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Landroid/widget/ImageView;", "N", "Landroid/widget/ImageView;", "z1", "()Landroid/widget/ImageView;", "d2", "(Landroid/widget/ImageView;)V", "backButton", "O", "L1", "m2", "showmpin", "", "P", "Z", "getIsaccountChange", "()Z", "setIsaccountChange", "(Z)V", "isaccountChange", "Lcom/zepto/ws6;", "Q", "Lcom/zepto/ws6;", "K1", "()Lcom/zepto/ws6;", "l2", "(Lcom/zepto/ws6;)V", "sessionManager", "Lcom/zepto/xy3;", "R", "Lcom/zepto/xy3;", "binding", "Lcom/zepto/wa3;", "S", "Lcom/zepto/wa3;", "F1", "()Lcom/zepto/wa3;", "g2", "(Lcom/zepto/wa3;)V", "languageKeySession", "Lcom/nic/mparivahan/Account/SignService;", "T", "Lcom/nic/mparivahan/Account/SignService;", "retrofitService", "", "U", "D1", "()I", "setFlage", "(I)V", "flage", "V", "E1", "setIsforgotButtonClicked", "isforgotButtonClicked", "Lcom/zepto/k60;", "W", "Lcom/zepto/k60;", "biometricPrompt", "Ljava/util/concurrent/Executor;", "X", "Ljava/util/concurrent/Executor;", "executor", "Lcom/zepto/k60$a;", "Y", "Lcom/zepto/k60$a;", "callBack", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class SignInScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public p26 viewModel;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public gj4 viewModel1;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public TextView create_account;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public TextView user_name;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public TextView change_account;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public TextView redirectToforgotmpin;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public LinearLayout signInWithOtp;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public EditText mobile_number;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public LinearLayout signWithMpin;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public EditText mpinEditText;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ImageView backButton;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public ImageView showmpin;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public boolean isaccountChange;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public xy3 binding;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public SignService retrofitService;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public int flage;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public boolean isforgotButtonClicked;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public k60 biometricPrompt;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public Executor executor;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public k60.a callBack;

    public static final class a implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public a(Ref.ObjectRef objectRef, Context context, String str, String str2) {
            this.a = objectRef;
            this.b = context;
            this.c = str;
            this.d = str2;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            Intrinsics.checkNotNullParameter(call, "call");
            new DatabaseHelper(this.b).Q0(this.d, null, this.c, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                tu5.a aVar = tu5.a;
                String str = (String) this.a.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) DLWithoutdobModel.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                DLWithoutdobModel dLWithoutdobModel = (DLWithoutdobModel) objFromJson;
                if (gd1.a.m(dLWithoutdobModel.getDlobj().getDlLicno())) {
                    new DatabaseHelper(this.b).Q0(this.d, null, this.c, null);
                    return;
                }
                DatabaseHelper databaseHelper = new DatabaseHelper(this.b);
                String string = StringsKt__StringsKt.trim((CharSequence) dLWithoutdobModel.getDlobj().getDlLicno()).toString();
                String str2 = this.c;
                BioObj bioObj = dLWithoutdobModel.getBioObj();
                databaseHelper.Q0(string, null, str2, bioObj != null ? bioObj.getBioDob() : null);
            } catch (Exception e) {
                e.printStackTrace();
                new DatabaseHelper(this.b).Q0(this.d, null, this.c, null);
            }
        }
    }

    public static final class b extends k60.a {
        public b() {
        }

        @Override // com.zepto.k60.a
        public void a(int i, CharSequence errString) {
            Intrinsics.checkNotNullParameter(errString, "errString");
            super.a(i, errString);
        }

        @Override // com.zepto.k60.a
        public void b() {
            super.b();
        }

        @Override // com.zepto.k60.a
        public void c(k60.b result) {
            Intrinsics.checkNotNullParameter(result, "result");
            super.c(result);
            if (new ws6(SignInScreen.this).u()) {
                if (com.nic.mparivahan.a.a.a(SignInScreen.this)) {
                    SignInScreen.this.I1().show();
                    SignInScreen.this.Q1().p(SignInScreen.this, " ");
                } else {
                    SignInScreen.this.startActivity(new Intent(SignInScreen.this, (Class<?>) DashBoard.class));
                    SignInScreen.this.finish();
                }
            }
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            SignInScreen.this.I1().dismiss();
            u14.a.a(SignInScreen.this);
            Toast.makeText(SignInScreen.this.getApplicationContext(), SignInScreen.this.F1().b("service_is_not_present", SignInScreen.this.getString(R.string.unable_to_get_details)), 1).show();
        }
    }

    public static final class d extends Lambda implements Function1 {
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
        public final void a(GetCitizenDetails getCitizenDetails) {
            try {
                if (StringsKt__StringsJVMKt.equals(getCitizenDetails.getStatusCode(), "CTZN001", true)) {
                    SignInScreen.this.P1().C(SignInScreen.this.G1().getText().toString().toString());
                } else if (StringsKt__StringsJVMKt.equals(getCitizenDetails.getStatusCode(), "CTZN099", true)) {
                    SignInScreen.this.I1().dismiss();
                    if (StringsKt__StringsJVMKt.equals(getCitizenDetails.getStatusDesc(), "No Record(s) Found.", true)) {
                        SignInScreen signInScreen = SignInScreen.this;
                        String strB = signInScreen.F1().b("label_login_not_regt", SignInScreen.this.getApplicationContext().getString(R.string.mobile_number_not_registered));
                        Intrinsics.checkNotNull(strB);
                        signInScreen.u1(signInScreen, strB);
                    } else {
                        SignInScreen signInScreen2 = SignInScreen.this;
                        signInScreen2.u1(signInScreen2, getCitizenDetails.getStatusDesc().toString());
                    }
                } else {
                    SignInScreen.this.I1().dismiss();
                    Toast.makeText(SignInScreen.this.getApplicationContext(), SignInScreen.this.F1().b("service_is_not_present", SignInScreen.this.getString(R.string.unable_to_get_details)), 1).show();
                }
            } catch (Exception e) {
                SignInScreen.this.I1().dismiss();
                e.printStackTrace();
                u14.a.a(SignInScreen.this);
                Toast.makeText(SignInScreen.this.getApplicationContext(), SignInScreen.this.F1().b("service_is_not_present", SignInScreen.this.getString(R.string.unable_to_get_details)), 1).show();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetCitizenDetails) obj);
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
            SignInScreen.this.I1().dismiss();
            if (str.toString().equals(hz0.a.B())) {
                u14.a.a(SignInScreen.this);
            } else {
                Toast.makeText(SignInScreen.this.getApplicationContext(), SignInScreen.this.F1().b("service_is_not_present", SignInScreen.this.getString(R.string.unable_to_get_details)), 1).show();
            }
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
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
                    SignInScreen.this.I1().dismiss();
                    if (!SignInScreen.this.K1().u()) {
                        SignInScreen signInScreen = SignInScreen.this;
                        String strB = signInScreen.F1().b("label_log_set_mpin", "You haven't set the MPIN yet, Please request for new MPIN using 'Forgot security MPIN'");
                        Intrinsics.checkNotNull(strB);
                        signInScreen.w1(signInScreen, strB);
                    }
                } else if (StringsKt__StringsJVMKt.equals(getCitizenDetails.getStatusCode(), "CTZN099", true)) {
                    SignInScreen.this.I1().dismiss();
                    if (StringsKt__StringsJVMKt.equals(getCitizenDetails.getStatusDesc(), "No Record(s) Found.", true)) {
                        SignInScreen signInScreen2 = SignInScreen.this;
                        String strB2 = signInScreen2.F1().b("label_login_not_regt", SignInScreen.this.getApplicationContext().getString(R.string.mobile_number_not_registered));
                        Intrinsics.checkNotNull(strB2);
                        signInScreen2.u1(signInScreen2, strB2);
                    } else {
                        SignInScreen signInScreen3 = SignInScreen.this;
                        signInScreen3.u1(signInScreen3, getCitizenDetails.getStatusDesc().toString());
                    }
                } else {
                    SignInScreen.this.I1().dismiss();
                    Toast.makeText(SignInScreen.this.getApplicationContext(), SignInScreen.this.F1().b("service_is_not_present", SignInScreen.this.getString(R.string.unable_to_get_details)), 1).show();
                }
            } catch (Exception e) {
                SignInScreen.this.I1().dismiss();
                e.printStackTrace();
                Toast.makeText(SignInScreen.this.getApplicationContext(), SignInScreen.this.F1().b("service_is_not_present", SignInScreen.this.getString(R.string.unable_to_get_details)), 1).show();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetCitizenDetails) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            SignInScreen.this.I1().dismiss();
            Toast.makeText(SignInScreen.this.getApplicationContext(), SignInScreen.this.F1().b("service_is_not_present", SignInScreen.this.getString(R.string.unable_to_get_details)), 1).show();
        }
    }

    public static final class h extends Lambda implements Function1 {
        public h() {
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
            try {
                SignInScreen.this.I1().dismiss();
                if (!StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL001", true)) {
                    if (gd1.a.m(sendOtpResult.getStatusDesc())) {
                        Toast.makeText(SignInScreen.this.getApplicationContext(), SignInScreen.this.F1().b("label_log_unbl_reset", "Unable to reset the MPIN, Please try after sometime."), 1).show();
                        return;
                    } else {
                        SignInScreen signInScreen = SignInScreen.this;
                        signInScreen.Z1(signInScreen, sendOtpResult.getStatusDesc());
                        return;
                    }
                }
                Intent intent = new Intent(SignInScreen.this, (Class<?>) ForgotMpinScreen.class);
                intent.putExtra("otpId", String.valueOf(sendOtpResult.getRecordId()));
                intent.putExtra("MobileNumber", SignInScreen.this.G1().getText().toString());
                intent.putExtra("RecreateFlag", 0);
                if (SignInScreen.this.getIsforgotButtonClicked()) {
                    intent.putExtra("title", SignInScreen.this.F1().b("generate", "Generate"));
                } else {
                    intent.putExtra("title", SignInScreen.this.F1().b("title_forgot", "Forgot"));
                }
                SignInScreen.this.startActivity(intent);
            } catch (Exception unused) {
                Toast.makeText(SignInScreen.this.getApplicationContext(), SignInScreen.this.F1().b("label_log_unbl_reset", "Unable to reset the MPIN, Please try after sometime."), 1).show();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SendOtpResult) obj);
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
            SignInScreen.this.I1().dismiss();
            SignInScreen signInScreen = SignInScreen.this;
            signInScreen.Z1(signInScreen, signInScreen.F1().b(va3.a.N0(), "Unable to reset the MPIN, Please try after sometime."));
            if (com.nic.mparivahan.a.a.a(SignInScreen.this)) {
                u14.a.a(SignInScreen.this);
            }
        }
    }

    public static final class j extends Lambda implements Function1 {
        public j() {
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
                    Intent intent = new Intent(SignInScreen.this, (Class<?>) CreateForgotMpin.class);
                    intent.putExtra("Event", hz0.a.o());
                    intent.putExtra("Mobile_no", SignInScreen.this.G1().getText().toString());
                    SignInScreen.this.startActivity(intent);
                    SignInScreen.this.finish();
                } else if (StringsKt__StringsJVMKt.equals(getCitizenDetails.getStatusCode(), "CTZN099", true)) {
                    SignInScreen.this.I1().dismiss();
                    if (StringsKt__StringsJVMKt.equals(getCitizenDetails.getStatusDesc(), "No Record(s) Found.", true)) {
                        mt6.a aVar = mt6.a;
                        SignInScreen signInScreen = SignInScreen.this;
                        String strB = signInScreen.F1().b("label_login_not_regt", SignInScreen.this.getApplicationContext().getString(R.string.mobile_number_not_registered));
                        Intrinsics.checkNotNull(strB);
                        aVar.c(signInScreen, strB);
                    } else {
                        mt6.a.c(SignInScreen.this, getCitizenDetails.getStatusDesc().toString());
                    }
                } else if (StringsKt__StringsJVMKt.equals(getCitizenDetails.getStatusCode(), "CTZN028", true) || StringsKt__StringsJVMKt.equals(getCitizenDetails.getStatusCode(), "CTZN027", true)) {
                    SignInScreen.this.I1().dismiss();
                    if (!gd1.a.m(getCitizenDetails.getStatusDesc().toString())) {
                        SignInScreen signInScreen2 = SignInScreen.this;
                        signInScreen2.b2(signInScreen2, getCitizenDetails.getStatusDesc().toString());
                    }
                } else {
                    SignInScreen.this.I1().dismiss();
                    if (gd1.a.m(getCitizenDetails.getStatusDesc().toString())) {
                        Toast.makeText(SignInScreen.this.getApplicationContext(), SignInScreen.this.F1().b("label_log_unbl_reset", "Unable to reset the MPIN, Please try after sometime."), 1).show();
                    } else {
                        mt6.a.c(SignInScreen.this, getCitizenDetails.getStatusDesc().toString());
                    }
                }
            } catch (Exception unused) {
                SignInScreen.this.I1().dismiss();
                Toast.makeText(SignInScreen.this.getApplicationContext(), SignInScreen.this.F1().b("label_log_unbl_reset", "Unable to reset the MPIN, Please try after sometime."), 1).show();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetCitizenDetails) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class k extends Lambda implements Function1 {
        public k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            SignInScreen.this.I1().dismiss();
            if (com.nic.mparivahan.a.a.a(SignInScreen.this)) {
                u14.a.a(SignInScreen.this);
            }
            Toast.makeText(SignInScreen.this.getApplicationContext(), SignInScreen.this.F1().b(va3.a.N0(), "Unable to change/reset the MPIN, Please try after sometime."), 1).show();
        }
    }

    public static final class l implements ActionMode.Callback {
        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    public static final class m extends Lambda implements Function1 {
        public m() {
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
        public final void a(GetVirtualDocDetails getVirtualDocDetails) {
            SignInScreen.this.I1().dismiss();
            if (StringsKt__StringsJVMKt.equals(getVirtualDocDetails.getStatusCode(), "VTLD005", true)) {
                SignInScreen.this.I1().dismiss();
                if (SignInScreen.this.getFlage() == 1) {
                    SignInScreen.this.startActivity(new Intent(SignInScreen.this, (Class<?>) SearchChallanOnlineActivity.class));
                    SignInScreen.this.finish();
                    return;
                } else {
                    SignInScreen.this.startActivity(new Intent(SignInScreen.this, (Class<?>) DashBoard.class));
                    SignInScreen.this.finishAffinity();
                    return;
                }
            }
            if (!StringsKt__StringsJVMKt.equals(getVirtualDocDetails.getStatusCode(), "VTLD001", true)) {
                if (StringsKt__StringsJVMKt.equals(getVirtualDocDetails.getStatusCode(), "VTLD090", true)) {
                    SignInScreen.this.I1().dismiss();
                    SignInScreen signInScreen = SignInScreen.this;
                    signInScreen.Z1(signInScreen, getVirtualDocDetails.getStatusDesc());
                    return;
                }
                SignInScreen.this.I1().dismiss();
                if (SignInScreen.this.getFlage() == 1) {
                    SignInScreen.this.startActivity(new Intent(SignInScreen.this, (Class<?>) SearchChallanOnlineActivity.class));
                    SignInScreen.this.finish();
                    return;
                } else {
                    SignInScreen.this.startActivity(new Intent(SignInScreen.this, (Class<?>) DashBoard.class));
                    SignInScreen.this.finishAffinity();
                    return;
                }
            }
            if (getVirtualDocDetails.getMparCitizenDocInfo().size() > 12) {
                try {
                    SignInScreen signInScreen2 = SignInScreen.this;
                    Intrinsics.checkNotNull(getVirtualDocDetails);
                    signInScreen2.s2(getVirtualDocDetails);
                } catch (Exception unused) {
                }
            } else {
                SaveVirtualRCService.Companion aVar = SaveVirtualRCService.INSTANCE;
                SignInScreen signInScreen3 = SignInScreen.this;
                Intrinsics.checkNotNull(getVirtualDocDetails);
                aVar.a(signInScreen3, getVirtualDocDetails);
            }
            SignInScreen.this.I1().dismiss();
            if (SignInScreen.this.getFlage() == 1) {
                SignInScreen.this.startActivity(new Intent(SignInScreen.this, (Class<?>) SearchChallanOnlineActivity.class));
                SignInScreen.this.finish();
            } else {
                SignInScreen.this.startActivity(new Intent(SignInScreen.this, (Class<?>) DashBoard.class));
                SignInScreen.this.finishAffinity();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetVirtualDocDetails) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class n extends Lambda implements Function1 {
        public n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            u14.a.a(SignInScreen.this);
            SignInScreen.this.I1().dismiss();
            if (SignInScreen.this.getFlage() == 1) {
                SignInScreen.this.startActivity(new Intent(SignInScreen.this, (Class<?>) SearchChallanOnlineActivity.class));
                SignInScreen.this.finish();
            } else {
                SignInScreen.this.startActivity(new Intent(SignInScreen.this, (Class<?>) DashBoard.class));
                SignInScreen.this.finishAffinity();
            }
        }
    }

    public static final class o extends Lambda implements Function1 {
        public o() {
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
        public final void a(UserLoginModel userLoginModel) {
            try {
                if (StringsKt__StringsJVMKt.equals$default(userLoginModel.getStatusCode(), "CTZN001", false, 2, null)) {
                    new cq(SignInScreen.this);
                    new SimpleDateFormat("dd-MM-yyyy").format(new Date());
                    if (SignInScreen.this.Q1().g(SignInScreen.this)) {
                        SignInScreen.this.I1().dismiss();
                        if (SignInScreen.this.getFlage() == 1) {
                            SignInScreen.this.startActivity(new Intent(SignInScreen.this, (Class<?>) SearchChallanOnlineActivity.class));
                            SignInScreen.this.finish();
                        } else {
                            SignInScreen.this.startActivity(new Intent(SignInScreen.this, (Class<?>) DashBoard.class));
                            SignInScreen.this.finishAffinity();
                        }
                    } else {
                        SignInScreen.this.Q1().s(new ws6(SignInScreen.this).k(), SignInScreen.this);
                    }
                } else if (StringsKt__StringsJVMKt.equals$default(userLoginModel.getStatusCode(), "CTZN091", false, 2, null)) {
                    SignInScreen.this.I1().dismiss();
                    SignInScreen signInScreen = SignInScreen.this;
                    signInScreen.Z1(signInScreen, userLoginModel.getStatusDesc());
                } else if (StringsKt__StringsJVMKt.equals$default(userLoginModel.getStatusCode(), "CTZN085", false, 2, null)) {
                    SignInScreen.this.I1().dismiss();
                    SignInScreen signInScreen2 = SignInScreen.this;
                    signInScreen2.Z1(signInScreen2, userLoginModel.getStatusDesc());
                } else if (StringsKt__StringsJVMKt.equals$default(userLoginModel.getStatusCode(), "CTZN086", false, 2, null)) {
                    SignInScreen.this.I1().dismiss();
                    SignInScreen signInScreen3 = SignInScreen.this;
                    signInScreen3.Z1(signInScreen3, userLoginModel.getStatusDesc());
                } else if (StringsKt__StringsJVMKt.equals$default(userLoginModel.getStatusCode(), "CTZN028", false, 2, null) || StringsKt__StringsJVMKt.equals$default(userLoginModel.getStatusCode(), "CTZN027", false, 2, null)) {
                    SignInScreen.this.I1().dismiss();
                    SignInScreen signInScreen4 = SignInScreen.this;
                    signInScreen4.b2(signInScreen4, userLoginModel.getStatusDesc());
                } else if (!gd1.a.m(userLoginModel.getStatusDesc())) {
                    SignInScreen.this.I1().dismiss();
                    SignInScreen signInScreen5 = SignInScreen.this;
                    signInScreen5.Z1(signInScreen5, userLoginModel.getStatusDesc());
                }
            } catch (Exception unused) {
                SignInScreen.this.I1().show();
                SignInScreen.this.startActivity(new Intent(SignInScreen.this, (Class<?>) DashBoard.class));
                SignInScreen.this.finishAffinity();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((UserLoginModel) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class p extends Lambda implements Function1 {
        public p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            SignInScreen.this.I1().show();
            SignInScreen.this.startActivity(new Intent(SignInScreen.this, (Class<?>) DashBoard.class));
            SignInScreen.this.finishAffinity();
        }
    }

    public static final class q extends Lambda implements Function1 {
        public q() {
            super(1);
        }

        public final void a(SendOtpResult sendOtpResult) {
            try {
                SignInScreen.this.I1().dismiss();
                if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL001", true)) {
                    Intent intent = new Intent(SignInScreen.this, (Class<?>) OtpVerificationforLoginScreen.class);
                    intent.putExtra("Param", sendOtpResult.getParam());
                    intent.putExtra(hz0.a.u(), SignInScreen.this.getFlage());
                    intent.putExtra("otpId", String.valueOf(sendOtpResult.getRecordId()));
                    intent.putExtra("MobileNumber", SignInScreen.this.G1().getText().toString());
                    SignInScreen.this.startActivity(intent);
                    SignInScreen.this.finish();
                } else if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL022", true) || StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL099", true)) {
                    mt6.a.c(SignInScreen.this, sendOtpResult.getStatusDesc());
                } else if (gd1.a.m(sendOtpResult.getStatusDesc())) {
                    Toast.makeText(SignInScreen.this.getApplicationContext(), "Unable to Sign In, Please try after sometime.", 1).show();
                } else {
                    Toast.makeText(SignInScreen.this.getApplicationContext(), sendOtpResult.getStatusDesc(), 1).show();
                }
            } catch (Exception unused) {
                Toast.makeText(SignInScreen.this.getApplicationContext(), SignInScreen.this.F1().b("service_is_not_present", SignInScreen.this.getString(R.string.unable_to_get_details)), 1).show();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SendOtpResult) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class r implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public r(Function1 function) {
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

    private final void J0() {
        Executor executorH = yy0.h(this);
        Intrinsics.checkNotNullExpressionValue(executorH, "getMainExecutor(...)");
        this.executor = executorH;
        this.callBack = new b();
        Executor executor = this.executor;
        k60.a aVar = null;
        if (executor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("executor");
            executor = null;
        }
        k60.a aVar2 = this.callBack;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callBack");
        } else {
            aVar = aVar2;
        }
        this.biometricPrompt = new k60(this, executor, aVar);
    }

    public static final void R1(SignInScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isaccountChange = true;
        this$0.G1().setEnabled(true);
        this$0.G1().setClickable(true);
        this$0.G1().getText().clear();
        this$0.H1().getText().clear();
        this$0.O1().setVisibility(8);
        this$0.M1().setVisibility(0);
        xy3 xy3Var = this$0.binding;
        xy3 xy3Var2 = null;
        if (xy3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xy3Var = null;
        }
        xy3Var.e.setVisibility(8);
        xy3 xy3Var3 = this$0.binding;
        if (xy3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xy3Var3 = null;
        }
        xy3Var3.b.setVisibility(8);
        xy3 xy3Var4 = this$0.binding;
        if (xy3Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            xy3Var2 = xy3Var4;
        }
        xy3Var2.p.setVisibility(8);
    }

    public static final void S1(SignInScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finishAffinity();
        this$0.finish();
    }

    public static final void T1(SignInScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.H1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            this$0.L1().setImageResource(R.drawable.pass_visible);
            this$0.H1().setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            this$0.L1().setImageResource(R.drawable.mvvm_visibility);
            this$0.H1().setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public static final void U1(SignInScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (gd1.a.e(this$0)) {
                np7.a.c(this$0);
            } else {
                this$0.y1();
            }
        } catch (Exception unused) {
        }
    }

    public static final void V1(SignInScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0, this$0.F1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 0).show();
        } else {
            this$0.startActivity(new Intent(this$0, (Class<?>) CreateAccountScreen.class));
            this$0.finish();
        }
    }

    public static final void W1(SignInScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isforgotButtonClicked = false;
        String string = this$0.G1().getText().toString();
        if (string == null || string.length() == 0) {
            Toast.makeText(this$0.getApplicationContext(), this$0.F1().b("label_mb", "Please enter the mobile number"), 1).show();
            return;
        }
        if (string.length() < 10) {
            Toast.makeText(this$0.getApplicationContext(), this$0.F1().b("lbl_enter_valid_number", "Please enter the valid mobile number"), 1).show();
            return;
        }
        if (!mt6.a.t(string)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.F1().b("lbl_enter_valid_number", "Please enter the valid mobile number"), 1).show();
            return;
        }
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.F1().b("label_log_check_internet", "Please check your internet"), 1).show();
            return;
        }
        if (gd1.a.e(this$0)) {
            np7.a.c(this$0);
            return;
        }
        Intent intent = new Intent(this$0, (Class<?>) CreateForgotMpin.class);
        intent.putExtra("Event", hz0.a.o());
        intent.putExtra("Mobile_no", this$0.G1().getText().toString());
        this$0.startActivity(intent);
    }

    public static final void X1(SignInScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        gd1.a aVar = gd1.a;
        aVar.l(this$0);
        String string = this$0.G1().getText().toString();
        String string2 = this$0.H1().getText().toString();
        ws6 ws6Var = new ws6(this$0);
        if (string == null || string.length() == 0) {
            Toast.makeText(this$0.getApplicationContext(), this$0.F1().b("label_mb", "Please enter the mobile number"), 1).show();
            return;
        }
        if (string.length() < 10) {
            Toast.makeText(this$0.getApplicationContext(), this$0.F1().b("lbl_enter_valid_number", "Please enter the valid mobile number"), 1).show();
            return;
        }
        if (!mt6.a.t(string)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.F1().b("lbl_enter_valid_number", "Please enter the valid mobile number"), 1).show();
            return;
        }
        if (string2.length() == 0) {
            Toast.makeText(this$0.getApplicationContext(), this$0.F1().b("label_log_entr_six_mpin", "Please enter the 6 digit MPIN"), 1).show();
            return;
        }
        if (string2.length() < 6) {
            Toast.makeText(this$0.getApplicationContext(), this$0.F1().b("label_log_entr_six_mpin", "Please enter the 6 digit MPIN"), 1).show();
            return;
        }
        if (!ws6Var.u()) {
            this$0.I1().show();
            this$0.P1().i(string, this$0);
        } else if (!com.nic.mparivahan.a.a.a(this$0)) {
            this$0.startActivity(new Intent(this$0, (Class<?>) DashBoard.class));
            this$0.finish();
        } else if (aVar.e(this$0)) {
            np7.a.c(this$0);
        } else {
            this$0.I1().show();
            this$0.Q1().p(this$0, string2);
        }
    }

    public static final void Y1(SignInScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isforgotButtonClicked = true;
        gd1.a.l(this$0);
        String string = this$0.G1().getText().toString();
        if (string == null || string.length() == 0) {
            Toast.makeText(this$0.getApplicationContext(), this$0.F1().b("label_mb", "Please enter the mobile number"), 1).show();
            return;
        }
        if (string.length() < 10) {
            Toast.makeText(this$0.getApplicationContext(), this$0.F1().b("lbl_enter_valid_number", "Please enter the valid mobile number"), 1).show();
            return;
        }
        if (!mt6.a.t(string)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.F1().b("lbl_enter_valid_number", "Please enter the valid mobile number"), 1).show();
        } else if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.F1().b("label_log_check_internet", "Please check your internet connection"), 1).show();
        } else {
            this$0.I1().show();
            this$0.P1().j(string, this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void c2(SignInScreen this$0, Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intent intent = new Intent(this$0, (Class<?>) CreateAccountScreen.class);
        intent.putExtra(hz0.a.l(), 1);
        this$0.startActivity(intent);
        this$0.finish();
        d2.dismiss();
    }

    public static final void v1(Dialog dialog, SignInScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dialog.dismiss();
        this$0.startActivity(new Intent(this$0, (Class<?>) CreateAccountScreen.class));
        this$0.finish();
    }

    public static final void x1(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    public final TextView A1() {
        TextView textView = this.change_account;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("change_account");
        return null;
    }

    public final TextView B1() {
        TextView textView = this.create_account;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("create_account");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    public final void C1(String dl, String doc, Context context) {
        Intrinsics.checkNotNullParameter(dl, "dl");
        Intrinsics.checkNotNullParameter(doc, "doc");
        Intrinsics.checkNotNullParameter(context, "context");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(context);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        DlService dlServiceA = DlService.INSTANCE.a(context);
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        hs1.a aVar2 = hs1.a;
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.c(dl, null, context, string, ws6Var.l()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        dlServiceA.getDlDetailsWitoutDOB(s14.a.u() + APIController.a().GetLicenceDetails(), aVar.d(ls3VarB, string2), (String) objectRef.element).enqueue(new a(objectRef, context, doc, dl));
    }

    /* JADX INFO: renamed from: D1, reason: from getter */
    public final int getFlage() {
        return this.flage;
    }

    /* JADX INFO: renamed from: E1, reason: from getter */
    public final boolean getIsforgotButtonClicked() {
        return this.isforgotButtonClicked;
    }

    public final wa3 F1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    public final EditText G1() {
        EditText editText = this.mobile_number;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mobile_number");
        return null;
    }

    public final EditText H1() {
        EditText editText = this.mpinEditText;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mpinEditText");
        return null;
    }

    public final ProgressDialog I1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final TextView J1() {
        TextView textView = this.redirectToforgotmpin;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("redirectToforgotmpin");
        return null;
    }

    public final ws6 K1() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final ImageView L1() {
        ImageView imageView = this.showmpin;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("showmpin");
        return null;
    }

    public final LinearLayout M1() {
        LinearLayout linearLayout = this.signInWithOtp;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("signInWithOtp");
        return null;
    }

    public final LinearLayout N1() {
        LinearLayout linearLayout = this.signWithMpin;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("signWithMpin");
        return null;
    }

    public final TextView O1() {
        TextView textView = this.user_name;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("user_name");
        return null;
    }

    public final p26 P1() {
        p26 p26Var = this.viewModel;
        if (p26Var != null) {
            return p26Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final gj4 Q1() {
        gj4 gj4Var = this.viewModel1;
        if (gj4Var != null) {
            return gj4Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel1");
        return null;
    }

    public final void Z1(Context context, String message) {
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
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById4).setText(F1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(F1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.o26
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignInScreen.a2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void b2(Context context, String message) {
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
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById4).setText(F1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(F1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.f26
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignInScreen.c2(this.a, dialog, view);
            }
        });
        dialog.show();
    }

    public final void d2(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.backButton = imageView;
    }

    public final void e2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.change_account = textView;
    }

    public final void f2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.create_account = textView;
    }

    public final void g2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void h2(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.mobile_number = editText;
    }

    public final void i2(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.mpinEditText = editText;
    }

    public final void j2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void k2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.redirectToforgotmpin = textView;
    }

    public final void l2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final void m2(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.showmpin = imageView;
    }

    public final void n2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.signInWithOtp = linearLayout;
    }

    public final void o2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.signWithMpin = linearLayout;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        finishAffinity();
        finish();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        xy3 xy3VarC = xy3.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(xy3VarC, "inflate(...)");
        this.binding = xy3VarC;
        hz0.a aVar = hz0.a;
        aVar.k(this);
        xy3 xy3Var = this.binding;
        SignService signService = null;
        if (xy3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xy3Var = null;
        }
        setContentView(xy3Var.b());
        ta3.a aVar2 = ta3.a;
        xy3 xy3Var2 = this.binding;
        if (xy3Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xy3Var2 = null;
        }
        aVar2.S1(this, xy3Var2);
        com.nic.mparivahan.Welcome.a.a.a(this);
        g2(new wa3(this));
        aVar.i(this);
        View viewFindViewById = findViewById(R.id.sign_up_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        f2((TextView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.forgotmpin);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        k2((TextView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.signInWithOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        n2((LinearLayout) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.mobile_number);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        h2((EditText) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.mpinEditText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        i2((EditText) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.signWithMpin);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        o2((LinearLayout) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.backButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        d2((ImageView) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.showmpin);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        m2((ImageView) viewFindViewById8);
        View viewFindViewById9 = findViewById(R.id.user_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        p2((TextView) viewFindViewById9);
        View viewFindViewById10 = findViewById(R.id.change_account);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        e2((TextView) viewFindViewById10);
        j2(new ProgressDialog(this));
        I1().setMessage(F1().b("label_challan_please_wait", "Please wait..."));
        I1().setCancelable(false);
        I1().setCanceledOnTouchOutside(false);
        l2(new ws6(this));
        this.retrofitService = SignService.INSTANCE.a(this);
        try {
            J0();
            n72.a aVar3 = n72.a;
            xy3 xy3Var3 = this.binding;
            if (xy3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                xy3Var3 = null;
            }
            aVar3.a(this, xy3Var3);
        } catch (Exception unused) {
        }
        SignService signService2 = this.retrofitService;
        if (signService2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            signService2 = null;
        }
        r2((gj4) new z(this, new fj4(new c26(signService2))).a(gj4.class));
        new dl4(this).g(0);
        if (!K1().u()) {
            A1().setVisibility(4);
            xy3 xy3Var4 = this.binding;
            if (xy3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                xy3Var4 = null;
            }
            xy3Var4.e.setVisibility(8);
            xy3 xy3Var5 = this.binding;
            if (xy3Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                xy3Var5 = null;
            }
            xy3Var5.b.setVisibility(8);
            xy3 xy3Var6 = this.binding;
            if (xy3Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                xy3Var6 = null;
            }
            xy3Var6.p.setVisibility(8);
            O1().setText("Welcome to NextGen mParivahan");
            O1().setVisibility(0);
        }
        if (!K1().u() || K1().m() == null) {
            M1().setVisibility(0);
        } else {
            M1().setVisibility(8);
        }
        if (getIntent() != null) {
            this.flage = getIntent().getIntExtra(hz0.a.u(), 0);
        }
        A1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.d26
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignInScreen.R1(this.a, view);
            }
        });
        z1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.g26
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignInScreen.S1(this.a, view);
            }
        });
        L1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.h26
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignInScreen.T1(this.a, view);
            }
        });
        xy3 xy3Var7 = this.binding;
        if (xy3Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            xy3Var7 = null;
        }
        xy3Var7.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.i26
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignInScreen.U1(this.a, view);
            }
        });
        if (!K1().u()) {
            G1().setEnabled(true);
        } else if (K1().l() != null) {
            G1().setText(K1().l());
            G1().setEnabled(false);
            G1().setClickable(false);
            G1().setAlpha(1.0f);
            O1().setText(F1().b("label_log_welcome", "Welcome") + ' ' + K1().n());
        }
        B1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.j26
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignInScreen.V1(this.a, view);
            }
        });
        J1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.k26
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignInScreen.W1(this.a, view);
            }
        });
        N1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.l26
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignInScreen.X1(this.a, view);
            }
        });
        M1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.m26
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignInScreen.Y1(this.a, view);
            }
        });
        SignService signService3 = this.retrofitService;
        if (signService3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        } else {
            signService = signService3;
        }
        q2((p26) new z(this, new a26(new c26(signService))).a(p26.class));
        P1().v().g(this, new r(new q()));
        P1().l().g(this, new r(new c()));
        P1().s().g(this, new r(new d()));
        P1().r().g(this, new r(new e()));
        P1().o().g(this, new r(new f()));
        P1().n().g(this, new r(new g()));
        P1().w().g(this, new r(new h()));
        P1().m().g(this, new r(new i()));
        P1().q().g(this, new r(new j()));
        P1().p().g(this, new r(new k()));
        H1().setCustomSelectionActionModeCallback(new l());
        Q1().j().g(this, new r(new m()));
        Q1().k().g(this, new r(new n()));
        Q1().r().g(this, new r(new o()));
        Q1().q().g(this, new r(new p()));
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() {
        super.onResume();
        u14.a.a(this);
    }

    public final void p2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.user_name = textView;
    }

    public final void q2(p26 p26Var) {
        Intrinsics.checkNotNullParameter(p26Var, "<set-?>");
        this.viewModel = p26Var;
    }

    public final void r2(gj4 gj4Var) {
        Intrinsics.checkNotNullParameter(gj4Var, "<set-?>");
        this.viewModel1 = gj4Var;
    }

    public final void s2(GetVirtualDocDetails virtualdetails) {
        Intrinsics.checkNotNullParameter(virtualdetails, "virtualdetails");
        DatabaseHelper databaseHelper = new DatabaseHelper(this);
        ArrayList<MparCitizenDocInfo> mparCitizenDocInfo = virtualdetails.getMparCitizenDocInfo();
        if (mparCitizenDocInfo.size() > 0) {
            DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(this);
            Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
            databaseHelperD0.k0();
            databaseHelperD0.close();
        }
        int size = mparCitizenDocInfo.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (StringsKt__StringsJVMKt.equals(StringsKt__StringsKt.trim((CharSequence) mparCitizenDocInfo.get(i2).getDocType()).toString(), "RC", true)) {
                databaseHelper.R0(mparCitizenDocInfo.get(i2).getDocNumber(), String.valueOf(mparCitizenDocInfo.get(i2).getDocId()), null, 0);
                RCDownloads.INSTANCE.a(this, String.valueOf(mparCitizenDocInfo.get(i2).getDocId()));
            }
            if (StringsKt__StringsJVMKt.equals(StringsKt__StringsKt.trim((CharSequence) mparCitizenDocInfo.get(i2).getDocType()).toString(), "DL", true)) {
                gd1.a aVar = gd1.a;
                if (aVar.m(mparCitizenDocInfo.get(i2).getDocDob())) {
                    C1(mparCitizenDocInfo.get(i2).getDocNumber(), String.valueOf(mparCitizenDocInfo.get(i2).getDocId()), this);
                } else {
                    String docNumber = mparCitizenDocInfo.get(i2).getDocNumber();
                    if (aVar.m(mparCitizenDocInfo.get(i2).getDocDob()) || StringsKt__StringsJVMKt.equals(mparCitizenDocInfo.get(i2).getDocDob(), "null", true)) {
                        C1(docNumber, String.valueOf(mparCitizenDocInfo.get(i2).getDocId()), this);
                    } else {
                        databaseHelper.O0(docNumber, null, String.valueOf(mparCitizenDocInfo.get(i2).getDocId()), mparCitizenDocInfo.get(i2).getDocDob());
                    }
                }
            }
        }
        cq cqVar = new cq(this);
        String str = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        Intrinsics.checkNotNull(str);
        cqVar.h(str);
    }

    public final void u1(Context context, String title) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.e26
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignInScreen.v1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final void w1(Context context, String title) {
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
        TextView textView = (TextView) viewFindViewById2;
        textView.setText(F1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.n26
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SignInScreen.x1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void y1() {
        k60.d.a aVar = new k60.d.a();
        aVar.d(getString(R.string.title_biometric_dialog));
        aVar.c(getString(R.string.text_description_biometrics_dialog));
        aVar.b(33023);
        k60.d dVarA = aVar.a();
        Intrinsics.checkNotNullExpressionValue(dVarA, "build(...)");
        k60 k60Var = this.biometricPrompt;
        if (k60Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("biometricPrompt");
            k60Var = null;
        }
        k60Var.a(dVarA);
    }

    public final ImageView z1() {
        ImageView imageView = this.backButton;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("backButton");
        return null;
    }
}
