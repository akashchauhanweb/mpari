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
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.google.gson.Gson;
import com.nic.mparivahan.Account.Model.MparCitizenUser;
import com.nic.mparivahan.Account.SignService;
import com.nic.mparivahan.Account.View.CreateNewMPIN;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.ProfileDetails.ProfileInterface.UserBloodDetails;
import com.nic.mparivahan.PushNotification.NaxpToKenService;
import com.nic.mparivahan.R;
import com.zepto.c26;
import com.zepto.cq;
import com.zepto.fj4;
import com.zepto.gj4;
import com.zepto.hz0;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.pw4;
import com.zepto.ta3;
import com.zepto.va3;
import com.zepto.wa3;
import com.zepto.ws6;
import com.zepto.wy3;
import com.zepto.xr6;
import com.zepto.yr6;
import com.zepto.zr6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bx\u0010yJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\"\u0010\u001d\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010!\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010-\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010$\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\"\u00101\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010$\u001a\u0004\b/\u0010&\"\u0004\b0\u0010(R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0016\u0010e\u001a\u00020b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010g\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010\u0018R\"\u0010o\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010w\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010v¨\u0006z"}, d2 = {"Lcom/nic/mparivahan/Account/View/CreateNewMPIN;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/content/Context;", "context", "", "title", "p1", "Landroid/widget/EditText;", "C", "Landroid/widget/EditText;", "z1", "()Landroid/widget/EditText;", "T1", "(Landroid/widget/EditText;)V", "mpinEditText", "D", "s1", "L1", "confirmMpinEt", "E", "Ljava/lang/String;", "y1", "()Ljava/lang/String;", "S1", "(Ljava/lang/String;)V", "mobile_number", "F", "v1", "P1", "mParivhanUser", "Landroid/widget/ImageView;", "G", "Landroid/widget/ImageView;", "r1", "()Landroid/widget/ImageView;", "K1", "(Landroid/widget/ImageView;)V", "backButton", "H", "C1", "W1", "showmpin", "I", "t1", "M1", "confirmShowMpin", "Lcom/zepto/gj4;", "J", "Lcom/zepto/gj4;", "getViewModel", "()Lcom/zepto/gj4;", "Y1", "(Lcom/zepto/gj4;)V", "viewModel", "Lcom/nic/mparivahan/Account/SignService;", "K", "Lcom/nic/mparivahan/Account/SignService;", "B1", "()Lcom/nic/mparivahan/Account/SignService;", "V1", "(Lcom/nic/mparivahan/Account/SignService;)V", "retrofitService", "Lcom/zepto/ws6;", "L", "Lcom/zepto/ws6;", "D1", "()Lcom/zepto/ws6;", "X1", "(Lcom/zepto/ws6;)V", "userSessionManager", "Landroid/app/ProgressDialog;", "M", "Landroid/app/ProgressDialog;", "A1", "()Landroid/app/ProgressDialog;", "U1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "N", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "getDatabaseHelper", "()Lcom/nic/mparivahan/DB/DatabaseHelper;", "N1", "(Lcom/nic/mparivahan/DB/DatabaseHelper;)V", "databaseHelper", "Lcom/zepto/wa3;", "O", "Lcom/zepto/wa3;", "u1", "()Lcom/zepto/wa3;", "O1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/wy3;", "P", "Lcom/zepto/wy3;", "binding", "Q", "otpId", "Lcom/zepto/zr6;", "R", "Lcom/zepto/zr6;", "w1", "()Lcom/zepto/zr6;", "Q1", "(Lcom/zepto/zr6;)V", "mUserBloodViewModel", "Lcom/nic/mparivahan/ProfileDetails/ProfileInterface/UserBloodDetails;", "S", "Lcom/nic/mparivahan/ProfileDetails/ProfileInterface/UserBloodDetails;", "x1", "()Lcom/nic/mparivahan/ProfileDetails/ProfileInterface/UserBloodDetails;", "R1", "(Lcom/nic/mparivahan/ProfileDetails/ProfileInterface/UserBloodDetails;)V", "mUserService", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class CreateNewMPIN extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public EditText mpinEditText;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public EditText confirmMpinEt;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String mobile_number;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String mParivhanUser;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ImageView backButton;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ImageView showmpin;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ImageView confirmShowMpin;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public gj4 viewModel;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public SignService retrofitService;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public ws6 userSessionManager;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public DatabaseHelper databaseHelper;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public wy3 binding;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String otpId = "";

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

    public static final void E1(CreateNewMPIN this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) SignInScreen.class));
        this$0.finish();
    }

    public static final void F1(CreateNewMPIN this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.z1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            this$0.C1().setImageResource(R.drawable.pass_visible);
            this$0.z1().setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            this$0.C1().setImageResource(R.drawable.mvvm_visibility);
            this$0.z1().setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public static final void G1(CreateNewMPIN this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.s1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            this$0.t1().setImageResource(R.drawable.pass_visible);
            this$0.s1().setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            this$0.t1().setImageResource(R.drawable.mvvm_visibility);
            this$0.s1().setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public static final void H1(CreateNewMPIN this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.z1().getText().toString();
        String string2 = this$0.s1().getText().toString();
        if (string == null || string.length() == 0) {
            Toast.makeText(this$0.getApplicationContext(), this$0.u1().b(va3.a.q(), "Please enter the MPIN"), 1).show();
            return;
        }
        if (string.length() < 6) {
            Toast.makeText(this$0.getApplicationContext(), this$0.u1().b(va3.a.u(), "Please enter the valid MPIN"), 1).show();
            return;
        }
        if (string2 == null || string2.length() == 0) {
            Toast.makeText(this$0.getApplicationContext(), this$0.u1().b(va3.a.f(), "Please enter the confirm MPIN"), 1).show();
            return;
        }
        if (string2.length() < 6) {
            Toast.makeText(this$0.getApplicationContext(), this$0.u1().b(va3.a.g(), "Please enter the valid confirm MPIN"), 1).show();
            return;
        }
        if (!Intrinsics.areEqual(string, string2)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.u1().b(va3.a.I(), "MPIN & confirm MPIN should be same"), 1).show();
            return;
        }
        hz0.a aVar = hz0.a;
        if (aVar.M(string, this$0.D1().m())) {
            Toast.makeText(this$0.getApplicationContext(), this$0.u1().b(va3.a.m0(), "The mPin You Have Entered Matches With the Previous mPin"), 1).show();
            return;
        }
        if (aVar.N(string)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.u1().b(va3.a.n0(), "Please choose a more diverse password./n Avoid using all the same digits."), 1).show();
            return;
        }
        try {
            Object objFromJson = new Gson().fromJson(this$0.v1(), (Class<Object>) MparCitizenUser.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            MparCitizenUser mparCitizenUser = (MparCitizenUser) objFromJson;
            String string3 = Settings.Secure.getString(this$0.getContentResolver(), "android_id");
            pw4.a aVar2 = pw4.a;
            long ctzRecordId = mparCitizenUser.getCtzRecordId();
            String strY1 = this$0.y1();
            String strValueOf = String.valueOf(mparCitizenUser.getCtzDispName());
            String strValueOf2 = String.valueOf(mparCitizenUser.getCtzEmail());
            String strValueOf3 = String.valueOf(mparCitizenUser.getCtzStateCd());
            Intrinsics.checkNotNull(string3);
            String strValueOf4 = String.valueOf(mparCitizenUser.getCtzMobile());
            String str = this$0.otpId;
            wy3 wy3Var = this$0.binding;
            if (wy3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                wy3Var = null;
            }
            String string4 = aVar2.c(ctzRecordId, strY1, strValueOf, strValueOf2, strValueOf3, true, string3, strValueOf4, str, wy3Var.e.getText().toString()).toString();
            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
            this$0.A1().show();
            this$0.w1().v(string4, this$0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void I1(CreateNewMPIN this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.A1().dismiss();
        if (num == null || num.intValue() != 1) {
            this$0.A1().cancel();
            Toast.makeText(this$0.getApplicationContext(), this$0.u1().b("label_log_unbl_ctrt_mpin", "Unable to create the MPIN, Please try after some time"), 1).show();
            return;
        }
        Object objFromJson = new Gson().fromJson(this$0.v1(), (Class<Object>) MparCitizenUser.class);
        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
        MparCitizenUser mparCitizenUser = (MparCitizenUser) objFromJson;
        if (this$0.D1().u()) {
            this$0.D1().v();
            DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(this$0);
            Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
            databaseHelperD0.m0();
            databaseHelperD0.close();
            new cq(this$0).e();
            NaxpToKenService.INSTANCE.a(this$0);
        }
        this$0.D1().b(String.valueOf(mparCitizenUser.getCtzRecordId()), this$0.y1(), mparCitizenUser.getCtzDispName(), mparCitizenUser.getCtzEmail(), this$0.z1().getText().toString(), mparCitizenUser.getCtzStateCd(), Boolean.TRUE, Boolean.valueOf(mparCitizenUser.getCtzMpinStatus()));
        String strB = this$0.u1().b("label_log_mpin_rest_succ", "MPIN reset successfully!");
        Intrinsics.checkNotNull(strB);
        this$0.p1(this$0, strB);
    }

    public static final void J1(CreateNewMPIN this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.A1().cancel();
        Toast.makeText(this$0.getApplicationContext(), this$0.u1().b("label_log_unbl_ctrt_mpin", "Unable to create the MPIN, Please try after some time"), 1).show();
    }

    public static final void q1(Dialog dialog, CreateNewMPIN this$0, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dialog.dismiss();
        this$0.startActivity(new Intent(this$0, (Class<?>) SignInScreen.class));
        this$0.finish();
    }

    public final ProgressDialog A1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final SignService B1() {
        SignService signService = this.retrofitService;
        if (signService != null) {
            return signService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final ImageView C1() {
        ImageView imageView = this.showmpin;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("showmpin");
        return null;
    }

    public final ws6 D1() {
        ws6 ws6Var = this.userSessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userSessionManager");
        return null;
    }

    public final void K1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.backButton = imageView;
    }

    public final void L1(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.confirmMpinEt = editText;
    }

    public final void M1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.confirmShowMpin = imageView;
    }

    public final void N1(DatabaseHelper databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "<set-?>");
        this.databaseHelper = databaseHelper;
    }

    public final void O1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void P1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mParivhanUser = str;
    }

    public final void Q1(zr6 zr6Var) {
        Intrinsics.checkNotNullParameter(zr6Var, "<set-?>");
        this.mUserBloodViewModel = zr6Var;
    }

    public final void R1(UserBloodDetails userBloodDetails) {
        Intrinsics.checkNotNullParameter(userBloodDetails, "<set-?>");
        this.mUserService = userBloodDetails;
    }

    public final void S1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobile_number = str;
    }

    public final void T1(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.mpinEditText = editText;
    }

    public final void U1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void V1(SignService signService) {
        Intrinsics.checkNotNullParameter(signService, "<set-?>");
        this.retrofitService = signService;
    }

    public final void W1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.showmpin = imageView;
    }

    public final void X1(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.userSessionManager = ws6Var;
    }

    public final void Y1(gj4 gj4Var) {
        Intrinsics.checkNotNullParameter(gj4Var, "<set-?>");
        this.viewModel = gj4Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        wy3 wy3VarC = wy3.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(wy3VarC, "inflate(...)");
        this.binding = wy3VarC;
        hz0.a.k(this);
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
        O1(new wa3(this));
        V1(SignService.INSTANCE.a(this));
        View viewFindViewById = findViewById(R.id.mpinEditText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        T1((EditText) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.confirmMpinEt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        L1((EditText) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.showmpin);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        W1((ImageView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.confirmShowmpin);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        M1((ImageView) viewFindViewById4);
        DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(this);
        Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
        N1(databaseHelperD0);
        U1(new ProgressDialog(this));
        A1().setMessage(u1().b("label_challan_please_wait", "Please wait..."));
        A1().setCancelable(false);
        A1().setCanceledOnTouchOutside(false);
        this.otpId = String.valueOf(getIntent().getStringExtra("otpId"));
        X1(new ws6(this));
        View viewFindViewById5 = findViewById(R.id.backButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        K1((ImageView) viewFindViewById5);
        R1(UserBloodDetails.INSTANCE.a(this));
        Q1((zr6) new z(this, new xr6(new yr6(x1()))).a(zr6.class));
        r1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.w11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateNewMPIN.E1(this.a, view);
            }
        });
        z1().setCustomSelectionActionModeCallback(new a());
        s1().setCustomSelectionActionModeCallback(new b());
        C1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.x11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateNewMPIN.F1(this.a, view);
            }
        });
        t1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.y11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateNewMPIN.G1(this.a, view);
            }
        });
        Intent intent = getIntent();
        if (intent != null) {
            try {
                S1(String.valueOf(intent.getStringExtra("Mobile_no")));
                P1(String.valueOf(intent.getStringExtra("OTP")));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Y1((gj4) new z(this, new fj4(new c26(B1()))).a(gj4.class));
        wy3 wy3Var4 = this.binding;
        if (wy3Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            wy3Var2 = wy3Var4;
        }
        wy3Var2.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.z11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateNewMPIN.H1(this.a, view);
            }
        });
        w1().n().g(this, new mf4() { // from class: com.zepto.a21
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                CreateNewMPIN.I1(this.a, (Integer) obj);
            }
        });
        w1().i().g(this, new mf4() { // from class: com.zepto.b21
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                CreateNewMPIN.J1(this.a, (String) obj);
            }
        });
    }

    public final void p1(Context context, String title) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.succes_mpin);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.txt_dialog);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(title);
        View viewFindViewById2 = dialog.findViewById(R.id.ok);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        textView.setText(u1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.c21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateNewMPIN.q1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final ImageView r1() {
        ImageView imageView = this.backButton;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("backButton");
        return null;
    }

    public final EditText s1() {
        EditText editText = this.confirmMpinEt;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("confirmMpinEt");
        return null;
    }

    public final ImageView t1() {
        ImageView imageView = this.confirmShowMpin;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("confirmShowMpin");
        return null;
    }

    public final wa3 u1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final String v1() {
        String str = this.mParivhanUser;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mParivhanUser");
        return null;
    }

    public final zr6 w1() {
        zr6 zr6Var = this.mUserBloodViewModel;
        if (zr6Var != null) {
            return zr6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mUserBloodViewModel");
        return null;
    }

    public final UserBloodDetails x1() {
        UserBloodDetails userBloodDetails = this.mUserService;
        if (userBloodDetails != null) {
            return userBloodDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mUserService");
        return null;
    }

    public final String y1() {
        String str = this.mobile_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mobile_number");
        return null;
    }

    public final EditText z1() {
        EditText editText = this.mpinEditText;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mpinEditText");
        return null;
    }
}
