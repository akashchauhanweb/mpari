package com.nic.mparivahan.Account.View.change;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Account.SignService;
import com.nic.mparivahan.Account.View.ForgotMpinScreen;
import com.nic.mparivahan.Account.View.change.CreateForgotMpin;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.ProfileDetails.ProfileInterface.UserBloodDetails;
import com.nic.mparivahan.R;
import com.zepto.a26;
import com.zepto.c26;
import com.zepto.fj4;
import com.zepto.gd1;
import com.zepto.gj4;
import com.zepto.hz0;
import com.zepto.mf4;
import com.zepto.p26;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.va3;
import com.zepto.wa3;
import com.zepto.ws6;
import com.zepto.wy3;
import com.zepto.xr6;
import com.zepto.yr6;
import com.zepto.zr6;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b~\u0010\u007fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u001a\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\"\u0010\u001d\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010!\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010-\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010$\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\"\u00101\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010$\u001a\u0004\b/\u0010&\"\u0004\b0\u0010(R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010i\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u0016\u0010m\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bk\u0010lR\"\u0010u\u001a\u00020n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\"\u0010}\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|¨\u0006\u0080\u0001"}, d2 = {"Lcom/nic/mparivahan/Account/View/change/CreateForgotMpin;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/content/Context;", "context", "", "message", "E1", "Landroid/widget/EditText;", "C", "Landroid/widget/EditText;", "u1", "()Landroid/widget/EditText;", "P1", "(Landroid/widget/EditText;)V", "mpinEditText", "D", "o1", "H1", "confirmMpinEt", "E", "Ljava/lang/String;", "t1", "()Ljava/lang/String;", "O1", "(Ljava/lang/String;)V", "mobile_number", "F", "q1", "K1", "EventSMS", "Landroid/widget/ImageView;", "G", "Landroid/widget/ImageView;", "n1", "()Landroid/widget/ImageView;", "G1", "(Landroid/widget/ImageView;)V", "backButton", "H", "x1", "S1", "showmpin", "I", "p1", "I1", "confirmShowMpin", "Lcom/zepto/gj4;", "J", "Lcom/zepto/gj4;", "getViewModel", "()Lcom/zepto/gj4;", "U1", "(Lcom/zepto/gj4;)V", "viewModel", "Lcom/zepto/p26;", "K", "Lcom/zepto/p26;", "z1", "()Lcom/zepto/p26;", "V1", "(Lcom/zepto/p26;)V", "viewModelOtp", "Lcom/nic/mparivahan/Account/SignService;", "L", "Lcom/nic/mparivahan/Account/SignService;", "w1", "()Lcom/nic/mparivahan/Account/SignService;", "R1", "(Lcom/nic/mparivahan/Account/SignService;)V", "retrofitService", "Lcom/zepto/ws6;", "M", "Lcom/zepto/ws6;", "y1", "()Lcom/zepto/ws6;", "T1", "(Lcom/zepto/ws6;)V", "userSessionManager", "Landroid/app/ProgressDialog;", "N", "Landroid/app/ProgressDialog;", "v1", "()Landroid/app/ProgressDialog;", "Q1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "O", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "getDatabaseHelper", "()Lcom/nic/mparivahan/DB/DatabaseHelper;", "J1", "(Lcom/nic/mparivahan/DB/DatabaseHelper;)V", "databaseHelper", "Lcom/zepto/wa3;", "P", "Lcom/zepto/wa3;", "r1", "()Lcom/zepto/wa3;", "L1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/wy3;", "Q", "Lcom/zepto/wy3;", "binding", "Lcom/zepto/zr6;", "R", "Lcom/zepto/zr6;", "getMUserBloodViewModel", "()Lcom/zepto/zr6;", "M1", "(Lcom/zepto/zr6;)V", "mUserBloodViewModel", "Lcom/nic/mparivahan/ProfileDetails/ProfileInterface/UserBloodDetails;", "S", "Lcom/nic/mparivahan/ProfileDetails/ProfileInterface/UserBloodDetails;", "s1", "()Lcom/nic/mparivahan/ProfileDetails/ProfileInterface/UserBloodDetails;", "N1", "(Lcom/nic/mparivahan/ProfileDetails/ProfileInterface/UserBloodDetails;)V", "mUserService", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class CreateForgotMpin extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public EditText mpinEditText;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public EditText confirmMpinEt;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String mobile_number;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String EventSMS;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ImageView backButton;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ImageView showmpin;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ImageView confirmShowMpin;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public gj4 viewModel;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public p26 viewModelOtp;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public SignService retrofitService;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ws6 userSessionManager;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public DatabaseHelper databaseHelper;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public wy3 binding;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public zr6 mUserBloodViewModel;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public UserBloodDetails mUserService;

    public static final class a implements ActionMode.Callback {
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

    public static final class b implements ActionMode.Callback {
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

    public static final class c extends Lambda implements Function1 {
        public c() {
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
                CreateForgotMpin.this.v1().dismiss();
                if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL001", true)) {
                    Intent intent = new Intent(CreateForgotMpin.this, (Class<?>) ForgotMpinScreen.class);
                    intent.putExtra("otpId", String.valueOf(sendOtpResult.getRecordId()));
                    intent.putExtra("MobileNumber", CreateForgotMpin.this.t1());
                    intent.putExtra("Mpin", CreateForgotMpin.this.u1().getText().toString());
                    intent.putExtra("RecreateFlag", 0);
                    intent.putExtra("title", CreateForgotMpin.this.r1().b("generate", "Generate"));
                    CreateForgotMpin.this.startActivity(intent);
                    CreateForgotMpin.this.finish();
                } else if (gd1.a.m(sendOtpResult.getStatusDesc())) {
                    Toast.makeText(CreateForgotMpin.this.getApplicationContext(), CreateForgotMpin.this.r1().b("label_log_unbl_reset", "Unable to reset the MPIN, Please try after sometime."), 1).show();
                } else {
                    CreateForgotMpin createForgotMpin = CreateForgotMpin.this;
                    createForgotMpin.E1(createForgotMpin, sendOtpResult.getStatusDesc());
                }
            } catch (Exception unused) {
                Toast.makeText(CreateForgotMpin.this.getApplicationContext(), CreateForgotMpin.this.r1().b("label_log_unbl_reset", "Unable to reset the MPIN, Please try after sometime."), 1).show();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SendOtpResult) obj);
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
            CreateForgotMpin.this.v1().dismiss();
        }
    }

    public static final class e implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public e(Function1 function) {
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

    public static final void A1(CreateForgotMpin this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void B1(CreateForgotMpin this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.u1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            this$0.x1().setImageResource(R.drawable.pass_visible);
            this$0.u1().setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            this$0.x1().setImageResource(R.drawable.mvvm_visibility);
            this$0.u1().setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public static final void C1(CreateForgotMpin this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.o1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            this$0.p1().setImageResource(R.drawable.pass_visible);
            this$0.o1().setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            this$0.p1().setImageResource(R.drawable.mvvm_visibility);
            this$0.o1().setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public static final void D1(CreateForgotMpin this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.u1().getText().toString();
        String string2 = this$0.o1().getText().toString();
        if (string == null || string.length() == 0) {
            Toast.makeText(this$0.getApplicationContext(), this$0.r1().b(va3.a.q(), "Please enter the MPIN"), 1).show();
            return;
        }
        if (string.length() < 6) {
            Toast.makeText(this$0.getApplicationContext(), this$0.r1().b(va3.a.u(), "Please enter the valid MPIN"), 1).show();
            return;
        }
        if (string2 == null || string2.length() == 0) {
            Toast.makeText(this$0.getApplicationContext(), this$0.r1().b(va3.a.f(), "Please enter the confirm MPIN"), 1).show();
            return;
        }
        if (string2.length() < 6) {
            Toast.makeText(this$0.getApplicationContext(), this$0.r1().b(va3.a.g(), "Please enter the valid confirm MPIN"), 1).show();
            return;
        }
        if (!Intrinsics.areEqual(string, string2)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.r1().b(va3.a.I(), "MPIN & confirm MPIN should be same"), 1).show();
            return;
        }
        hz0.a aVar = hz0.a;
        if (aVar.M(string, this$0.y1().m())) {
            this$0.E1(this$0, this$0.r1().b(va3.a.m0(), "The mPin You Have Entered Matches With the Previous mPin"));
            return;
        }
        if (aVar.N(string)) {
            this$0.E1(this$0, this$0.r1().b(va3.a.n0(), "Please choose a more diverse password./n Avoid using all the same digits."));
            return;
        }
        if (aVar.L(string)) {
            this$0.E1(this$0, "Password must not be a simple sequence of numbers.");
            return;
        }
        if (aVar.K(string)) {
            this$0.E1(this$0, "Password must not contain more than two repeated digits in sequence.");
            return;
        }
        try {
            if (this$0.q1().equals(aVar.p())) {
                this$0.v1().show();
                this$0.z1().H(this$0.t1(), this$0, aVar.p());
            } else {
                this$0.v1().show();
                this$0.z1().H(this$0.t1(), this$0, aVar.o());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public final void E1(Context context, String message) {
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
        ((TextView) viewFindViewById4).setText(r1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(r1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.v11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateForgotMpin.F1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void G1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.backButton = imageView;
    }

    public final void H1(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.confirmMpinEt = editText;
    }

    public final void I1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.confirmShowMpin = imageView;
    }

    public final void J1(DatabaseHelper databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "<set-?>");
        this.databaseHelper = databaseHelper;
    }

    public final void K1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.EventSMS = str;
    }

    public final void L1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void M1(zr6 zr6Var) {
        Intrinsics.checkNotNullParameter(zr6Var, "<set-?>");
        this.mUserBloodViewModel = zr6Var;
    }

    public final void N1(UserBloodDetails userBloodDetails) {
        Intrinsics.checkNotNullParameter(userBloodDetails, "<set-?>");
        this.mUserService = userBloodDetails;
    }

    public final void O1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobile_number = str;
    }

    public final void P1(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.mpinEditText = editText;
    }

    public final void Q1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void R1(SignService signService) {
        Intrinsics.checkNotNullParameter(signService, "<set-?>");
        this.retrofitService = signService;
    }

    public final void S1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.showmpin = imageView;
    }

    public final void T1(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.userSessionManager = ws6Var;
    }

    public final void U1(gj4 gj4Var) {
        Intrinsics.checkNotNullParameter(gj4Var, "<set-?>");
        this.viewModel = gj4Var;
    }

    public final void V1(p26 p26Var) {
        Intrinsics.checkNotNullParameter(p26Var, "<set-?>");
        this.viewModelOtp = p26Var;
    }

    public final ImageView n1() {
        ImageView imageView = this.backButton;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("backButton");
        return null;
    }

    public final EditText o1() {
        EditText editText = this.confirmMpinEt;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("confirmMpinEt");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        wy3 wy3VarC = wy3.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(wy3VarC, "inflate(...)");
        this.binding = wy3VarC;
        getWindow().setFlags(ConstantsKt.DEFAULT_BUFFER_SIZE, ConstantsKt.DEFAULT_BUFFER_SIZE);
        getWindow().addFlags(128);
        wy3 wy3Var = this.binding;
        wy3 wy3Var2 = null;
        if (wy3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wy3Var = null;
        }
        setContentView(wy3Var.b());
        com.nic.mparivahan.Welcome.a.a.a(this);
        ta3.a aVar = ta3.a;
        wy3 wy3Var3 = this.binding;
        if (wy3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            wy3Var3 = null;
        }
        aVar.m0(this, wy3Var3);
        L1(new wa3(this));
        R1(SignService.INSTANCE.a(this));
        View viewFindViewById = findViewById(R.id.mpinEditText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        P1((EditText) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.confirmMpinEt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        H1((EditText) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.showmpin);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        S1((ImageView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.confirmShowmpin);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        I1((ImageView) viewFindViewById4);
        DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(this);
        Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
        J1(databaseHelperD0);
        Q1(new ProgressDialog(this));
        v1().setMessage(r1().b("label_challan_please_wait", "Please wait..."));
        v1().setCancelable(false);
        v1().setCanceledOnTouchOutside(false);
        T1(new ws6(this));
        View viewFindViewById5 = findViewById(R.id.backButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        G1((ImageView) viewFindViewById5);
        N1(UserBloodDetails.INSTANCE.a(this));
        M1((zr6) new z(this, new xr6(new yr6(s1()))).a(zr6.class));
        V1((p26) new z(this, new a26(new c26(w1()))).a(p26.class));
        n1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.r11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateForgotMpin.A1(this.a, view);
            }
        });
        u1().setCustomSelectionActionModeCallback(new a());
        o1().setCustomSelectionActionModeCallback(new b());
        x1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.s11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateForgotMpin.B1(this.a, view);
            }
        });
        p1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.t11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateForgotMpin.C1(this.a, view);
            }
        });
        Intent intent = getIntent();
        if (intent != null) {
            try {
                O1(String.valueOf(intent.getStringExtra("Mobile_no")));
                K1(String.valueOf(intent.getStringExtra("Event")));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        U1((gj4) new z(this, new fj4(new c26(w1()))).a(gj4.class));
        wy3 wy3Var4 = this.binding;
        if (wy3Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            wy3Var2 = wy3Var4;
        }
        wy3Var2.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.u11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateForgotMpin.D1(this.a, view);
            }
        });
        z1().w().g(this, new e(new c()));
        z1().m().g(this, new e(new d()));
    }

    public final ImageView p1() {
        ImageView imageView = this.confirmShowMpin;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("confirmShowMpin");
        return null;
    }

    public final String q1() {
        String str = this.EventSMS;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("EventSMS");
        return null;
    }

    public final wa3 r1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final UserBloodDetails s1() {
        UserBloodDetails userBloodDetails = this.mUserService;
        if (userBloodDetails != null) {
            return userBloodDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mUserService");
        return null;
    }

    public final String t1() {
        String str = this.mobile_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mobile_number");
        return null;
    }

    public final EditText u1() {
        EditText editText = this.mpinEditText;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mpinEditText");
        return null;
    }

    public final ProgressDialog v1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final SignService w1() {
        SignService signService = this.retrofitService;
        if (signService != null) {
            return signService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final ImageView x1() {
        ImageView imageView = this.showmpin;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("showmpin");
        return null;
    }

    public final ws6 y1() {
        ws6 ws6Var = this.userSessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userSessionManager");
        return null;
    }

    public final p26 z1() {
        p26 p26Var = this.viewModelOtp;
        if (p26Var != null) {
            return p26Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelOtp");
        return null;
    }
}
