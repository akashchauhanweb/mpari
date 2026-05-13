package com.nic.mparivahan.Dashboard.ui;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.z;
import com.google.android.material.navigation.NavigationView;
import com.nic.mparivahan.AbtCntctTerms.AboutUs;
import com.nic.mparivahan.AbtCntctTerms.ComplaintActivity;
import com.nic.mparivahan.Account.AbtCntctTerms.ContactUs;
import com.nic.mparivahan.Account.Model.LogoutModle;
import com.nic.mparivahan.Account.SignService;
import com.nic.mparivahan.Account.View.SignInScreen;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.InformationService.InformationalWebView;
import com.nic.mparivahan.Language.ChooseLanguagScreen;
import com.nic.mparivahan.Language.SettingActivity;
import com.nic.mparivahan.NearByPlaces.NearByPlaces;
import com.nic.mparivahan.NewDesignActivity.MyDocActivity;
import com.nic.mparivahan.ProfileDetails.Model.FetchProfileImgResponseModel;
import com.nic.mparivahan.ProfileDetails.ProfileInterface.UserBloodDetails;
import com.nic.mparivahan.ProfileDetails.ProfileViews.UserDetails;
import com.nic.mparivahan.PushNoti.NotViews.NotificationView;
import com.nic.mparivahan.PushNotification.NaxpToKenService;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sos.SosHomeScreen;
import com.nic.mparivahan.dlservices.widget.CircleImageView;
import com.zepto.a26;
import com.zepto.c26;
import com.zepto.cq;
import com.zepto.d24;
import com.zepto.dl4;
import com.zepto.e24;
import com.zepto.ec;
import com.zepto.f34;
import com.zepto.fc;
import com.zepto.gd1;
import com.zepto.hz0;
import com.zepto.jq;
import com.zepto.mf4;
import com.zepto.p26;
import com.zepto.pq;
import com.zepto.s14;
import com.zepto.st6;
import com.zepto.wa3;
import com.zepto.ws6;
import com.zepto.xr6;
import com.zepto.yr6;
import com.zepto.yy0;
import com.zepto.zc1;
import com.zepto.zr6;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0014J\b\u0010\f\u001a\u00020\u0002H\u0014J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005J\b\u0010\u0014\u001a\u00020\bH\u0016J\u000e\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00100R\u0016\u00105\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00100R\u0016\u00107\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00100R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u00100R\u0016\u0010K\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u00100R\u0016\u0010M\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bL\u00100R\"\u0010U\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010]\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0016\u0010a\u001a\u00020^8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b_\u0010`R\"\u0010i\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010q\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u0016\u0010u\u001a\u00020r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bs\u0010tR$\u0010}\u001a\u0004\u0018\u00010v8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R(\u0010\u0085\u0001\u001a\u00020~8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001a\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0019\u0010\u008b\u0001\u001a\u00020~8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0080\u0001R\u0019\u0010\u008d\u0001\u001a\u00020~8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u0080\u0001R\u0019\u0010\u008f\u0001\u001a\u00020~8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u0080\u0001R\u0019\u0010\u0091\u0001\u001a\u00020~8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0080\u0001R\u0019\u0010\u0093\u0001\u001a\u00020~8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0080\u0001¨\u0006\u0096\u0001"}, d2 = {"Lcom/nic/mparivahan/Dashboard/ui/DashBoard;", "Lcom/zepto/pq;", "", "u1", "S1", "", "ctzRecordId", "ctzMobileNo", "", "ctzMpinStatus", "X1", "onResume", "onPause", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "message", "L1", "c1", "W1", "Lcom/zepto/jq;", "C", "Lcom/zepto/jq;", "appBarConfiguration", "Landroidx/appcompat/widget/Toolbar;", "D", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroidx/drawerlayout/widget/DrawerLayout;", "E", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawerLayout", "Lcom/google/android/material/navigation/NavigationView;", "F", "Lcom/google/android/material/navigation/NavigationView;", "navigationView", "Lcom/zepto/ws6;", "G", "Lcom/zepto/ws6;", "z1", "()Lcom/zepto/ws6;", "T1", "(Lcom/zepto/ws6;)V", "Sessionmanger", "Landroid/widget/LinearLayout;", "H", "Landroid/widget/LinearLayout;", "virtual_doc", "I", "home_layout", "J", "ll_payment_bottom", "K", "ll_setting", "Landroid/widget/ImageView;", "L", "Landroid/widget/ImageView;", "getVirtual_rc", "()Landroid/widget/ImageView;", "V1", "(Landroid/widget/ImageView;)V", "virtual_rc", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "M", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "getDatabaseHelper", "()Lcom/nic/mparivahan/DB/DatabaseHelper;", "N1", "(Lcom/nic/mparivahan/DB/DatabaseHelper;)V", "databaseHelper", "N", "sos", "O", "notification", "P", "help", "Lcom/zepto/zr6;", "Q", "Lcom/zepto/zr6;", "v1", "()Lcom/zepto/zr6;", "O1", "(Lcom/zepto/zr6;)V", "mUserBloodViewModel", "Lcom/nic/mparivahan/ProfileDetails/ProfileInterface/UserBloodDetails;", "R", "Lcom/nic/mparivahan/ProfileDetails/ProfileInterface/UserBloodDetails;", "w1", "()Lcom/nic/mparivahan/ProfileDetails/ProfileInterface/UserBloodDetails;", "P1", "(Lcom/nic/mparivahan/ProfileDetails/ProfileInterface/UserBloodDetails;)V", "mUserService", "Lcom/nic/mparivahan/dlservices/widget/CircleImageView;", "S", "Lcom/nic/mparivahan/dlservices/widget/CircleImageView;", "userProfileImg", "Landroid/app/ProgressDialog;", "T", "Landroid/app/ProgressDialog;", "y1", "()Landroid/app/ProgressDialog;", "R1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/p26;", "U", "Lcom/zepto/p26;", "A1", "()Lcom/zepto/p26;", "U1", "(Lcom/zepto/p26;)V", "viewModel", "Lcom/nic/mparivahan/Account/SignService;", "V", "Lcom/nic/mparivahan/Account/SignService;", "retrofitService", "Landroid/app/Dialog;", "W", "Landroid/app/Dialog;", "getD", "()Landroid/app/Dialog;", "setD", "(Landroid/app/Dialog;)V", "d", "Landroid/widget/TextView;", "X", "Landroid/widget/TextView;", "x1", "()Landroid/widget/TextView;", "Q1", "(Landroid/widget/TextView;)V", "mobile_number", "Lcom/zepto/wa3;", "Y", "Lcom/zepto/wa3;", "langSession", "Z", "txt_home", "a0", "txt_profile", "b0", "txt_near_by", "c0", "text_setting", "d0", "text_help", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDashBoard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DashBoard.kt\ncom/nic/mparivahan/Dashboard/ui/DashBoard\n+ 2 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfigurationKt\n*L\n1#1,779:1\n299#2,8:780\n*S KotlinDebug\n*F\n+ 1 DashBoard.kt\ncom/nic/mparivahan/Dashboard/ui/DashBoard\n*L\n233#1:780,8\n*E\n"})
public final class DashBoard extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public jq appBarConfiguration;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public Toolbar toolbar;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public DrawerLayout drawerLayout;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public NavigationView navigationView;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ws6 Sessionmanger;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public LinearLayout virtual_doc;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public LinearLayout home_layout;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public LinearLayout ll_payment_bottom;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public LinearLayout ll_setting;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public ImageView virtual_rc;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public DatabaseHelper databaseHelper;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public LinearLayout sos;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public LinearLayout notification;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public LinearLayout help;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public zr6 mUserBloodViewModel;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public UserBloodDetails mUserService;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public CircleImageView userProfileImg;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public p26 viewModel;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public SignService retrofitService;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public Dialog d;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public TextView mobile_number;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public TextView txt_home;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public TextView txt_profile;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public TextView txt_near_by;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public TextView text_setting;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public TextView text_help;

    public static final class a extends Lambda implements Function0 {
        public static final a c = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(FetchProfileImgResponseModel fetchProfileImgResponseModel) {
            try {
                if (StringsKt__StringsJVMKt.equals(fetchProfileImgResponseModel.getStatusCode(), "CTZN001", true)) {
                    try {
                        cq cqVar = new cq(DashBoard.this);
                        String str = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
                        Intrinsics.checkNotNull(str);
                        cqVar.f(str);
                    } catch (Exception unused) {
                    }
                    DashBoard.this.z1().D(fetchProfileImgResponseModel.getCtzImage());
                    DashBoard.this.S1();
                } else {
                    DashBoard.this.S1();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((FetchProfileImgResponseModel) obj);
            return Unit.INSTANCE;
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
            DashBoard.this.S1();
        }
    }

    public static final class d implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public d(Function1 function) {
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

    public static final void B1(DashBoard this$0, LogoutModle logoutModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        wa3 wa3Var = null;
        try {
            this$0.y1().dismiss();
            if (!StringsKt__StringsJVMKt.equals(logoutModle.getStatusCode(), "CTZN001", true)) {
                wa3 wa3Var2 = this$0.langSession;
                if (wa3Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("langSession");
                    wa3Var2 = null;
                }
                this$0.L1(this$0, wa3Var2.b("label_went_wrong", "Unable to Logout, Please try after some time"));
                return;
            }
            wa3 wa3Var3 = this$0.langSession;
            if (wa3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                wa3Var3 = null;
            }
            this$0.L1(this$0, wa3Var3.b("logout_success", "You have been Successfully Logout"));
            this$0.startActivity(new Intent(this$0, (Class<?>) SignInScreen.class));
            this$0.finish();
            try {
                NaxpToKenService.INSTANCE.a(this$0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception unused) {
            wa3 wa3Var4 = this$0.langSession;
            if (wa3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
            } else {
                wa3Var = wa3Var4;
            }
            this$0.L1(this$0, wa3Var.b("label_went_wrong", "Unable to Logout, Please try after some time"));
        }
    }

    public static final void C1(DashBoard this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.y1().dismiss();
        Log.e("Logout Error", str.toString());
        wa3 wa3Var = this$0.langSession;
        if (wa3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
            wa3Var = null;
        }
        this$0.L1(this$0, wa3Var.b("label_went_wrong", "Unable to Logout, Please try after some time"));
    }

    public static final void D1(DashBoard this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            if (this$0.z1().u()) {
                this$0.startActivity(new Intent(this$0, (Class<?>) SosHomeScreen.class));
            }
        } else {
            wa3 wa3Var = this$0.langSession;
            if (wa3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                wa3Var = null;
            }
            Toast.makeText(this$0, wa3Var.b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public static final void E1(DashBoard this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            if (this$0.z1().u()) {
                this$0.startActivity(new Intent(this$0, (Class<?>) NotificationView.class));
            }
        } else {
            wa3 wa3Var = this$0.langSession;
            if (wa3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                wa3Var = null;
            }
            Toast.makeText(this$0, wa3Var.b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public static final void F1(DashBoard this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        new dl4(this$0).g(0);
        this$0.startActivity(intent);
        this$0.finishAffinity();
    }

    public static final void G1(DashBoard this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) SettingActivity.class));
    }

    public static final void H1(DashBoard this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) ComplaintActivity.class));
    }

    public static final boolean I1(DashBoard this$0, MenuItem it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        int itemId = it.getItemId();
        DrawerLayout drawerLayout = null;
        DrawerLayout drawerLayout2 = null;
        wa3 wa3Var = null;
        DrawerLayout drawerLayout3 = null;
        wa3 wa3Var2 = null;
        DrawerLayout drawerLayout4 = null;
        DrawerLayout drawerLayout5 = null;
        DrawerLayout drawerLayout6 = null;
        wa3 wa3Var3 = null;
        wa3 wa3Var4 = null;
        DrawerLayout drawerLayout7 = null;
        wa3 wa3Var5 = null;
        switch (itemId) {
            case R.id.language /* 2131363488 */:
                DrawerLayout drawerLayout8 = this$0.drawerLayout;
                if (drawerLayout8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("drawerLayout");
                } else {
                    drawerLayout = drawerLayout8;
                }
                drawerLayout.i();
                this$0.startActivity(new Intent(this$0, (Class<?>) ChooseLanguagScreen.class));
                break;
            case R.id.nav_about /* 2131363815 */:
                DrawerLayout drawerLayout9 = this$0.drawerLayout;
                if (drawerLayout9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("drawerLayout");
                    drawerLayout9 = null;
                }
                drawerLayout9.i();
                if (!com.nic.mparivahan.a.a.a(this$0)) {
                    wa3 wa3Var6 = this$0.langSession;
                    if (wa3Var6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("langSession");
                    } else {
                        wa3Var5 = wa3Var6;
                    }
                    Toast.makeText(this$0, wa3Var5.b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
                } else {
                    this$0.startActivity(new Intent(this$0, (Class<?>) AboutUs.class));
                }
                break;
            case R.id.nav_docs /* 2131363817 */:
                this$0.startActivity(new Intent(this$0, (Class<?>) MyDocActivity.class));
                break;
            case R.id.nav_help /* 2131363819 */:
                DrawerLayout drawerLayout10 = this$0.drawerLayout;
                if (drawerLayout10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("drawerLayout");
                } else {
                    drawerLayout7 = drawerLayout10;
                }
                drawerLayout7.i();
                this$0.startActivity(new Intent(this$0, (Class<?>) ContactUs.class));
                break;
            case R.id.privacy_policy /* 2131364253 */:
                DrawerLayout drawerLayout11 = this$0.drawerLayout;
                if (drawerLayout11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("drawerLayout");
                    drawerLayout11 = null;
                }
                drawerLayout11.i();
                if (!com.nic.mparivahan.a.a.a(this$0)) {
                    wa3 wa3Var7 = this$0.langSession;
                    if (wa3Var7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("langSession");
                    } else {
                        wa3Var4 = wa3Var7;
                    }
                    Toast.makeText(this$0, wa3Var4.b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
                } else {
                    String str = s14.a.g() + "english/mparivahan-info-privacy-policy.html";
                    Intent intent = new Intent(this$0, (Class<?>) InformationalWebView.class);
                    intent.putExtra("URL", str);
                    wa3 wa3Var8 = this$0.langSession;
                    if (wa3Var8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("langSession");
                    } else {
                        wa3Var3 = wa3Var8;
                    }
                    intent.putExtra("title", wa3Var3.b("privacy", this$0.getString(R.string.privacy)));
                    this$0.startActivity(intent);
                }
                break;
            case R.id.setting /* 2131364661 */:
                if (this$0.z1().u()) {
                    DrawerLayout drawerLayout12 = this$0.drawerLayout;
                    if (drawerLayout12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("drawerLayout");
                    } else {
                        drawerLayout6 = drawerLayout12;
                    }
                    drawerLayout6.i();
                    this$0.startActivity(new Intent(this$0, (Class<?>) SettingActivity.class));
                }
                break;
            case R.id.virtual_docs /* 2131365895 */:
                DrawerLayout drawerLayout13 = this$0.drawerLayout;
                if (drawerLayout13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("drawerLayout");
                } else {
                    drawerLayout5 = drawerLayout13;
                }
                drawerLayout5.i();
                this$0.startActivity(new Intent(this$0, (Class<?>) VirtualDocScreen.class));
                break;
            default:
                switch (itemId) {
                    case R.id.nav_logout /* 2131363823 */:
                        if (!com.nic.mparivahan.a.a.a(this$0)) {
                            wa3 wa3Var9 = this$0.langSession;
                            if (wa3Var9 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                            } else {
                                wa3Var2 = wa3Var9;
                            }
                            Toast.makeText(this$0, wa3Var2.b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
                        } else if (this$0.z1().u()) {
                            this$0.y1().show();
                            this$0.X1(this$0.z1().k(), this$0.z1().l(), this$0.z1().d());
                        }
                        break;
                    case R.id.nav_near /* 2131363824 */:
                        DrawerLayout drawerLayout14 = this$0.drawerLayout;
                        if (drawerLayout14 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("drawerLayout");
                        } else {
                            drawerLayout3 = drawerLayout14;
                        }
                        drawerLayout3.i();
                        this$0.startActivity(new Intent(this$0, (Class<?>) NearByPlaces.class));
                        break;
                    case R.id.nav_profile /* 2131363825 */:
                        if (!com.nic.mparivahan.a.a.a(this$0)) {
                            wa3 wa3Var10 = this$0.langSession;
                            if (wa3Var10 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                            } else {
                                wa3Var = wa3Var10;
                            }
                            Toast.makeText(this$0, wa3Var.b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
                        } else if (this$0.z1().u()) {
                            DrawerLayout drawerLayout15 = this$0.drawerLayout;
                            if (drawerLayout15 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("drawerLayout");
                            } else {
                                drawerLayout2 = drawerLayout15;
                            }
                            drawerLayout2.i();
                            this$0.startActivity(new Intent(this$0, (Class<?>) UserDetails.class));
                        }
                        break;
                    case R.id.nav_share /* 2131363826 */:
                        try {
                            DrawerLayout drawerLayout16 = this$0.drawerLayout;
                            if (drawerLayout16 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("drawerLayout");
                            } else {
                                drawerLayout4 = drawerLayout16;
                            }
                            drawerLayout4.i();
                            Intent intent2 = new Intent();
                            intent2.setAction("android.intent.action.SEND");
                            intent2.putExtra("android.intent.extra.TEXT", "This app empowers citizen with instant access to various information, services and utilities related to the Transport Sector, Download mParivahan app at: https://play.google.com/store/apps/details?id=com.nic.mparivahan");
                            intent2.setType("text/plain");
                            this$0.startActivity(intent2);
                        } catch (Exception unused) {
                            return true;
                        }
                        break;
                    case R.id.nav_ts /* 2131363827 */:
                        Intent intent3 = new Intent(this$0, (Class<?>) DashBoard.class);
                        new dl4(this$0).g(1);
                        this$0.startActivity(intent3);
                        this$0.finishAffinity();
                        break;
                }
                break;
        }
        return true;
    }

    public static final void J1(DashBoard this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) UserDetails.class));
    }

    public static final void K1(DashBoard this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) NearByPlaces.class));
    }

    public static final void M1(DashBoard this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.d;
        Intrinsics.checkNotNull(dialog);
        dialog.dismiss();
    }

    public final p26 A1() {
        p26 p26Var = this.viewModel;
        if (p26Var != null) {
            return p26Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void L1(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        Dialog dialog = new Dialog(context);
        this.d = dialog;
        Intrinsics.checkNotNull(dialog);
        dialog.setContentView(R.layout.msg_dialog);
        Dialog dialog2 = this.d;
        Intrinsics.checkNotNull(dialog2);
        Window window = dialog2.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Dialog dialog3 = this.d;
        Intrinsics.checkNotNull(dialog3);
        View viewFindViewById = dialog3.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById;
        Dialog dialog4 = this.d;
        Intrinsics.checkNotNull(dialog4);
        View viewFindViewById2 = dialog4.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById2;
        Dialog dialog5 = this.d;
        Intrinsics.checkNotNull(dialog5);
        View viewFindViewById3 = dialog5.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) viewFindViewById3;
        wa3 wa3Var = this.langSession;
        wa3 wa3Var2 = null;
        if (wa3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
            wa3Var = null;
        }
        textView3.setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        wa3 wa3Var3 = this.langSession;
        if (wa3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
        } else {
            wa3Var2 = wa3Var3;
        }
        textView2.setText(wa3Var2.b("btn_ok", "OK"));
        textView.setText(message);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pc1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DashBoard.M1(this.a, view);
            }
        });
        Dialog dialog6 = this.d;
        Intrinsics.checkNotNull(dialog6);
        dialog6.show();
    }

    public final void N1(DatabaseHelper databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "<set-?>");
        this.databaseHelper = databaseHelper;
    }

    public final void O1(zr6 zr6Var) {
        Intrinsics.checkNotNullParameter(zr6Var, "<set-?>");
        this.mUserBloodViewModel = zr6Var;
    }

    public final void P1(UserBloodDetails userBloodDetails) {
        Intrinsics.checkNotNullParameter(userBloodDetails, "<set-?>");
        this.mUserService = userBloodDetails;
    }

    public final void Q1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mobile_number = textView;
    }

    public final void R1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void S1() {
        CircleImageView circleImageView = null;
        if (z1().p().length() <= 0 || Intrinsics.areEqual(z1().p(), "0")) {
            CircleImageView circleImageView2 = this.userProfileImg;
            if (circleImageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userProfileImg");
            } else {
                circleImageView = circleImageView2;
            }
            circleImageView.setImageResource(R.drawable.avtar);
            return;
        }
        Bitmap bitmapC = st6.c(z1().p());
        if (bitmapC != null) {
            CircleImageView circleImageView3 = this.userProfileImg;
            if (circleImageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userProfileImg");
            } else {
                circleImageView = circleImageView3;
            }
            circleImageView.setImageBitmap(bitmapC);
        }
    }

    public final void T1(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.Sessionmanger = ws6Var;
    }

    public final void U1(p26 p26Var) {
        Intrinsics.checkNotNullParameter(p26Var, "<set-?>");
        this.viewModel = p26Var;
    }

    public final void V1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.virtual_rc = imageView;
    }

    public final void W1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, (Class<?>) DashBoard.class);
        intent.setFlags(268468224);
        context.startActivity(intent);
    }

    public final void X1(String ctzRecordId, String ctzMobileNo, boolean ctzMpinStatus) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ctzRecordId", Long.parseLong(ctzRecordId));
            jSONObject.put("ctzMobile", ctzMobileNo);
            jSONObject.put("ctzMpinStatus", ctzMpinStatus);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mparCitizenUser", jSONObject);
            A1().D(jSONObject2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.zepto.pq
    public boolean c1() {
        d24 d24VarA = fc.a(this, R.id.nav_host_fragment);
        jq jqVar = this.appBarConfiguration;
        if (jqVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appBarConfiguration");
            jqVar = null;
        }
        return e24.a(d24VarA, jqVar) || super.c1();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        d24 d24Var;
        LinearLayout linearLayout;
        super.onCreate(savedInstanceState);
        hz0.a aVar = hz0.a;
        aVar.k(this);
        setContentView(R.layout.activity_dash_board);
        aVar.i(this);
        T1(new ws6(this));
        this.langSession = new wa3(this);
        View viewFindViewById = findViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.toolbar = (Toolbar) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.virtual_doc);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.virtual_doc = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.home_layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.home_layout = (LinearLayout) viewFindViewById3;
        u1();
        View viewFindViewById4 = findViewById(R.id.ll_payment_bottom);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.ll_payment_bottom = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.ll_setting);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.ll_setting = (LinearLayout) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.v_rc);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        V1((ImageView) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.sos);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.sos = (LinearLayout) viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.notification);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.notification = (LinearLayout) viewFindViewById8;
        View viewFindViewById9 = findViewById(R.id.help);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.help = (LinearLayout) viewFindViewById9;
        R1(new ProgressDialog(this));
        ProgressDialog progressDialogY1 = y1();
        wa3 wa3Var = this.langSession;
        if (wa3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
            wa3Var = null;
        }
        progressDialogY1.setMessage(wa3Var.b("label_challan_please_wait", "Please wait..."));
        y1().setCancelable(false);
        y1().setCanceledOnTouchOutside(false);
        P1(UserBloodDetails.INSTANCE.a(this));
        this.retrofitService = SignService.INSTANCE.a(this);
        SignService signService = this.retrofitService;
        if (signService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            signService = null;
        }
        U1((p26) new z(this, new a26(new c26(signService))).a(p26.class));
        Toolbar toolbar = this.toolbar;
        if (toolbar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbar");
            toolbar = null;
        }
        e1(toolbar);
        if (com.nic.mparivahan.a.a.a(this)) {
            try {
                new SimpleDateFormat("dd-MM-yyyy").format(new Date()).equals(new cq(this).a());
            } catch (Exception unused) {
            }
        }
        O1((zr6) new z(this, new xr6(new yr6(w1()))).a(zr6.class));
        View viewFindViewById10 = findViewById(R.id.tv_version);
        Intrinsics.checkNotNull(viewFindViewById10, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById10).setText(getString(R.string.app_version));
        View viewFindViewById11 = findViewById(R.id.nav_view);
        Intrinsics.checkNotNull(viewFindViewById11, "null cannot be cast to non-null type com.google.android.material.navigation.NavigationView");
        this.navigationView = (NavigationView) viewFindViewById11;
        View viewFindViewById12 = findViewById(R.id.drawer_layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        this.drawerLayout = (DrawerLayout) viewFindViewById12;
        d24 d24VarA = fc.a(this, R.id.nav_host_fragment);
        NavigationView navigationView = this.navigationView;
        if (navigationView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationView");
            navigationView = null;
        }
        Menu menu = navigationView.getMenu();
        Intrinsics.checkNotNullExpressionValue(menu, "getMenu(...)");
        MenuItem menuItemFindItem = menu.findItem(R.id.nav_profile);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem, "findItem(...)");
        MenuItem menuItemFindItem2 = menu.findItem(R.id.nav_ts);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem2, "findItem(...)");
        MenuItem menuItemFindItem3 = menu.findItem(R.id.nav_docs);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem3, "findItem(...)");
        MenuItem menuItemFindItem4 = menu.findItem(R.id.virtual_docs);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem4, "findItem(...)");
        MenuItem menuItemFindItem5 = menu.findItem(R.id.nav_near);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem5, "findItem(...)");
        MenuItem menuItemFindItem6 = menu.findItem(R.id.nav_help);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem6, "findItem(...)");
        MenuItem menuItemFindItem7 = menu.findItem(R.id.nav_share);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem7, "findItem(...)");
        MenuItem menuItemFindItem8 = menu.findItem(R.id.nav_about);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem8, "findItem(...)");
        MenuItem menuItemFindItem9 = menu.findItem(R.id.setting);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem9, "findItem(...)");
        MenuItem menuItemFindItem10 = menu.findItem(R.id.nav_logout);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem10, "findItem(...)");
        MenuItem menuItemFindItem11 = menu.findItem(R.id.language);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem11, "findItem(...)");
        MenuItem menuItemFindItem12 = menu.findItem(R.id.privacy_policy);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem12, "findItem(...)");
        wa3 wa3Var2 = this.langSession;
        if (wa3Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
            wa3Var2 = null;
        }
        menuItemFindItem.setTitle(wa3Var2.b("my_profile", "My Profile"));
        wa3 wa3Var3 = this.langSession;
        if (wa3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
            wa3Var3 = null;
        }
        menuItemFindItem2.setTitle(wa3Var3.b("label_transport_services", getString(R.string.transport_service)));
        wa3 wa3Var4 = this.langSession;
        if (wa3Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
            wa3Var4 = null;
        }
        menuItemFindItem3.setTitle(wa3Var4.b("txt_md", getString(R.string.txt_md)));
        wa3 wa3Var5 = this.langSession;
        if (wa3Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
            wa3Var5 = null;
        }
        menuItemFindItem4.setTitle(wa3Var5.b("label_virtual_documents", getString(R.string.virtual_documents)));
        wa3 wa3Var6 = this.langSession;
        if (wa3Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
            wa3Var6 = null;
        }
        menuItemFindItem5.setTitle(wa3Var6.b("near_by", getString(R.string.near_by)));
        wa3 wa3Var7 = this.langSession;
        if (wa3Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
            wa3Var7 = null;
        }
        menuItemFindItem6.setTitle(wa3Var7.b("label_help_support", getString(R.string.menu_help)));
        wa3 wa3Var8 = this.langSession;
        if (wa3Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
            wa3Var8 = null;
        }
        menuItemFindItem7.setTitle(wa3Var8.b("label_share", getString(R.string.menu_share)));
        wa3 wa3Var9 = this.langSession;
        if (wa3Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
            wa3Var9 = null;
        }
        menuItemFindItem8.setTitle(wa3Var9.b("label_about_us", getString(R.string.about)));
        wa3 wa3Var10 = this.langSession;
        if (wa3Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
            wa3Var10 = null;
        }
        menuItemFindItem9.setTitle(wa3Var10.b("label_setting", getString(R.string.settings)));
        wa3 wa3Var11 = this.langSession;
        if (wa3Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
            wa3Var11 = null;
        }
        menuItemFindItem12.setTitle(wa3Var11.b("privacy", getString(R.string.privacy)));
        wa3 wa3Var12 = this.langSession;
        if (wa3Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
            wa3Var12 = null;
        }
        menuItemFindItem10.setTitle(wa3Var12.b("log_out", getString(R.string.log_out)));
        wa3 wa3Var13 = this.langSession;
        if (wa3Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
            wa3Var13 = null;
        }
        menuItemFindItem11.setTitle(wa3Var13.b("language", "Language"));
        Set of = SetsKt__SetsKt.setOf((Object[]) new Integer[]{Integer.valueOf(R.id.nav_home), Integer.valueOf(R.id.nav_profile), Integer.valueOf(R.id.nav_ts), Integer.valueOf(R.id.nav_docs), Integer.valueOf(R.id.virtual_docs), Integer.valueOf(R.id.nav_near), Integer.valueOf(R.id.nav_help), Integer.valueOf(R.id.nav_share), Integer.valueOf(R.id.nav_about), Integer.valueOf(R.id.language), Integer.valueOf(R.id.setting), Integer.valueOf(R.id.privacy_policy), Integer.valueOf(R.id.nav_logout)});
        DrawerLayout drawerLayout = this.drawerLayout;
        if (drawerLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("drawerLayout");
            drawerLayout = null;
        }
        jq jqVarA = new jq.a(of).c(drawerLayout).b(new zc1(a.c)).a();
        this.appBarConfiguration = jqVarA;
        if (jqVarA == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appBarConfiguration");
            d24Var = d24VarA;
            jqVarA = null;
        } else {
            d24Var = d24VarA;
        }
        ec.a(this, d24Var, jqVarA);
        NavigationView navigationView2 = this.navigationView;
        if (navigationView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationView");
            navigationView2 = null;
        }
        f34.a(navigationView2, d24Var);
        Toolbar toolbar2 = this.toolbar;
        if (toolbar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbar");
            toolbar2 = null;
        }
        toolbar2.setNavigationIcon(R.drawable.side_menu);
        Drawable drawableE = yy0.e(getApplicationContext(), R.drawable.mvvm_alarm);
        Toolbar toolbar3 = this.toolbar;
        if (toolbar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbar");
            toolbar3 = null;
        }
        toolbar3.setOverflowIcon(drawableE);
        DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(this);
        Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
        N1(databaseHelperD0);
        NavigationView navigationView3 = this.navigationView;
        if (navigationView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationView");
            navigationView3 = null;
        }
        View viewM = navigationView3.m(0);
        Intrinsics.checkNotNullExpressionValue(viewM, "getHeaderView(...)");
        View viewFindViewById13 = viewM.findViewById(R.id.full_name);
        Intrinsics.checkNotNull(viewFindViewById13, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById13;
        View viewFindViewById14 = viewM.findViewById(R.id.mobile_number);
        Intrinsics.checkNotNull(viewFindViewById14, "null cannot be cast to non-null type android.widget.TextView");
        Q1((TextView) viewFindViewById14);
        View viewFindViewById15 = viewM.findViewById(R.id.imageView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
        this.userProfileImg = (CircleImageView) viewFindViewById15;
        if (getApplicationContext() != null) {
            v1().k().g(this, new d(new b()));
            Unit unit = Unit.INSTANCE;
        }
        if (getApplicationContext() != null) {
            v1().h().g(this, new d(new c()));
            Unit unit2 = Unit.INSTANCE;
        }
        if (z1().u()) {
            if (z1().l().toString() != null) {
                textView.setText("+91 " + z1().l());
            }
            if (z1().n().toString() != null) {
                x1().setText(z1().n().toString());
            }
        }
        LinearLayout linearLayout2 = this.sos;
        if (linearLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sos");
            linearLayout2 = null;
        }
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.oc1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DashBoard.D1(this.a, view);
            }
        });
        LinearLayout linearLayout3 = this.notification;
        if (linearLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notification");
            linearLayout3 = null;
        }
        linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qc1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DashBoard.E1(this.a, view);
            }
        });
        LinearLayout linearLayout4 = this.home_layout;
        if (linearLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("home_layout");
            linearLayout4 = null;
        }
        linearLayout4.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rc1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DashBoard.F1(this.a, view);
            }
        });
        LinearLayout linearLayout5 = this.ll_setting;
        if (linearLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ll_setting");
            linearLayout5 = null;
        }
        linearLayout5.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sc1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DashBoard.G1(this.a, view);
            }
        });
        LinearLayout linearLayout6 = this.help;
        if (linearLayout6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("help");
            linearLayout6 = null;
        }
        linearLayout6.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tc1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DashBoard.H1(this.a, view);
            }
        });
        NavigationView navigationView4 = this.navigationView;
        if (navigationView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationView");
            navigationView4 = null;
        }
        navigationView4.setNavigationItemSelectedListener(new NavigationView.d() { // from class: com.zepto.uc1
            @Override // com.google.android.material.navigation.NavigationView.d
            public final boolean a(MenuItem menuItem) {
                return DashBoard.I1(this.a, menuItem);
            }
        });
        LinearLayout linearLayout7 = this.virtual_doc;
        if (linearLayout7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("virtual_doc");
            linearLayout7 = null;
        }
        linearLayout7.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vc1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DashBoard.J1(this.a, view);
            }
        });
        LinearLayout linearLayout8 = this.ll_payment_bottom;
        if (linearLayout8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ll_payment_bottom");
            linearLayout = null;
        } else {
            linearLayout = linearLayout8;
        }
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wc1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DashBoard.K1(this.a, view);
            }
        });
        A1().F().g(this, new mf4() { // from class: com.zepto.xc1
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                DashBoard.B1(this.a, (LogoutModle) obj);
            }
        });
        A1().E().g(this, new mf4() { // from class: com.zepto.yc1
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                DashBoard.C1(this.a, (String) obj);
            }
        });
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onPause() {
        super.onPause();
        Dialog dialog = this.d;
        if (dialog != null) {
            Intrinsics.checkNotNull(dialog);
            if (dialog.isShowing()) {
                Dialog dialog2 = this.d;
                Intrinsics.checkNotNull(dialog2);
                dialog2.dismiss();
            }
        }
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() {
        super.onResume();
        try {
            if (com.nic.mparivahan.a.a.a(this)) {
                NaxpToKenService.INSTANCE.a(this);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (z1().n().toString() != null) {
            x1().setText(z1().n().toString());
        }
        if (gd1.a.m(z1().p()) || Intrinsics.areEqual(z1().p(), "0")) {
            return;
        }
        S1();
    }

    public final void u1() {
        View viewFindViewById = findViewById(R.id.txt_home);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.txt_home = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.txt_profile);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.txt_profile = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.text_setting);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.text_setting = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.text_help);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.text_help = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.txt_near_by);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.txt_near_by = (TextView) viewFindViewById5;
        TextView textView = this.txt_home;
        wa3 wa3Var = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txt_home");
            textView = null;
        }
        wa3 wa3Var2 = this.langSession;
        if (wa3Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
            wa3Var2 = null;
        }
        textView.setText(wa3Var2.b("label_home", getString(R.string.home)));
        TextView textView2 = this.txt_profile;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txt_profile");
            textView2 = null;
        }
        wa3 wa3Var3 = this.langSession;
        if (wa3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
            wa3Var3 = null;
        }
        textView2.setText(wa3Var3.b("my_profile", "My Profile"));
        TextView textView3 = this.txt_near_by;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txt_near_by");
            textView3 = null;
        }
        wa3 wa3Var4 = this.langSession;
        if (wa3Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
            wa3Var4 = null;
        }
        textView3.setText(wa3Var4.b("label_near_by", "Near By"));
        TextView textView4 = this.text_setting;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("text_setting");
            textView4 = null;
        }
        wa3 wa3Var5 = this.langSession;
        if (wa3Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
            wa3Var5 = null;
        }
        textView4.setText(wa3Var5.b("label_setting", "Settings"));
        TextView textView5 = this.text_help;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("text_help");
            textView5 = null;
        }
        wa3 wa3Var6 = this.langSession;
        if (wa3Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
        } else {
            wa3Var = wa3Var6;
        }
        textView5.setText(wa3Var.b("help", "Help"));
    }

    public final zr6 v1() {
        zr6 zr6Var = this.mUserBloodViewModel;
        if (zr6Var != null) {
            return zr6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mUserBloodViewModel");
        return null;
    }

    public final UserBloodDetails w1() {
        UserBloodDetails userBloodDetails = this.mUserService;
        if (userBloodDetails != null) {
            return userBloodDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mUserService");
        return null;
    }

    public final TextView x1() {
        TextView textView = this.mobile_number;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mobile_number");
        return null;
    }

    public final ProgressDialog y1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final ws6 z1() {
        ws6 ws6Var = this.Sessionmanger;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("Sessionmanger");
        return null;
    }
}
