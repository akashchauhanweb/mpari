package com.nic.mparivahan.VahanServices.VahanView;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.z;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.EkYCService;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.StateCostForDms;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationAdditionActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationContinuationActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationTerminationActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.TransferOwnerShipActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanDuplicateRcActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanNocActivity;
import com.nic.mparivahan.VahanServices.VahanView.VahanAdharOtpVerificationScreen;
import com.zepto.e47;
import com.zepto.em7;
import com.zepto.f47;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.lk7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.ws6;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0015J\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u001c\u0010\u000e\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\fH\u0007JJ\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\t2\"\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\fj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tR\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010(\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00104\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010\u001f\u001a\u0004\b2\u0010!\"\u0004\b3\u0010#R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010H\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010\u001f\u001a\u0004\bF\u0010!\"\u0004\bG\u0010#R\"\u0010L\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010\u001f\u001a\u0004\bJ\u0010!\"\u0004\bK\u0010#R\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010X\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010\u0018\u001a\u0004\bV\u0010\u001a\"\u0004\bW\u0010\u001cR\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010\u0018\u001a\u0004\bb\u0010\u001a\"\u0004\bc\u0010\u001cR\"\u0010l\u001a\u00020e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010t\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010|\u001a\u00020u8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R'\u0010\u0084\u0001\u001a\u00020}8\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R*\u0010\u008c\u0001\u001a\u00030\u0085\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R*\u0010\u0094\u0001\u001a\u00030\u008d\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R&\u0010\u0098\u0001\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0095\u0001\u0010\u0018\u001a\u0005\b\u0096\u0001\u0010\u001a\"\u0005\b\u0097\u0001\u0010\u001cR&\u0010\u009c\u0001\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0099\u0001\u0010\u0018\u001a\u0005\b\u009a\u0001\u0010\u001a\"\u0005\b\u009b\u0001\u0010\u001cR&\u0010 \u0001\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009d\u0001\u0010\u0018\u001a\u0005\b\u009e\u0001\u0010\u001a\"\u0005\b\u009f\u0001\u0010\u001cR&\u0010¤\u0001\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¡\u0001\u0010\u0018\u001a\u0005\b¢\u0001\u0010\u001a\"\u0005\b£\u0001\u0010\u001cR&\u0010¨\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¥\u0001\u0010\u001f\u001a\u0005\b¦\u0001\u0010!\"\u0005\b§\u0001\u0010#R*\u0010°\u0001\u001a\u00030©\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R\u001d\u0010¶\u0001\u001a\u00030±\u00018\u0006¢\u0006\u0010\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001RD\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\fj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R&\u0010À\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b½\u0001\u0010\u001f\u001a\u0005\b¾\u0001\u0010!\"\u0005\b¿\u0001\u0010#R%\u0010\u0014\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÁ\u0001\u0010\u001f\u001a\u0005\bÂ\u0001\u0010!\"\u0005\bÃ\u0001\u0010#¨\u0006Æ\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanView/VahanAdharOtpVerificationScreen;", "Lcom/zepto/pq;", "", "U1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "V1", "Ljava/util/HashMap;", "serviceSelection_HashMap", "p1", "rc_number", "Lkotlin/collections/HashMap;", "", "isFaceless", "name", "address", "X1", "Landroid/widget/TextView;", "C", "Landroid/widget/TextView;", "L1", "()Landroid/widget/TextView;", "t2", "(Landroid/widget/TextView;)V", "verify_user", "D", "Ljava/lang/String;", "A1", "()Ljava/lang/String;", "h2", "(Ljava/lang/String;)V", "param", "E", "B1", "i2", "RC", "Landroid/widget/EditText;", "F", "Landroid/widget/EditText;", "u1", "()Landroid/widget/EditText;", "c2", "(Landroid/widget/EditText;)V", "enterOtp", "G", "x1", "setOtpId", "otpId", "Lcom/zepto/ld7;", "H", "Lcom/zepto/ld7;", "N1", "()Lcom/zepto/ld7;", "u2", "(Lcom/zepto/ld7;)V", "viewModelv1", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "I", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "E1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "l2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "J", "getTxnNo", "p2", "txnNo", "K", "q1", "Y1", "adahar_no", "Lcom/zepto/f47;", "L", "Lcom/zepto/f47;", "getMView", "()Lcom/zepto/f47;", "d2", "(Lcom/zepto/f47;)V", "mView", "M", "D1", "k2", "resendOtp", "Lcom/zepto/lk7;", "N", "Lcom/zepto/lk7;", "M1", "()Lcom/zepto/lk7;", "setViewModel", "(Lcom/zepto/lk7;)V", "viewModel", "O", "t1", "b2", "disPlay", "Landroid/app/ProgressDialog;", "P", "Landroid/app/ProgressDialog;", "z1", "()Landroid/app/ProgressDialog;", "g2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Landroidx/appcompat/widget/AppCompatImageView;", "Q", "Landroidx/appcompat/widget/AppCompatImageView;", "s1", "()Landroidx/appcompat/widget/AppCompatImageView;", "Z1", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "backButton", "Landroid/widget/RelativeLayout;", "R", "Landroid/widget/RelativeLayout;", "v1", "()Landroid/widget/RelativeLayout;", "e2", "(Landroid/widget/RelativeLayout;)V", "nexGenHolder", "Landroid/widget/ImageView;", "S", "Landroid/widget/ImageView;", "H1", "()Landroid/widget/ImageView;", "n2", "(Landroid/widget/ImageView;)V", "showmpin", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "T", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "getDatabaseHelper", "()Lcom/nic/mparivahan/DB/DatabaseHelper;", "a2", "(Lcom/nic/mparivahan/DB/DatabaseHelper;)V", "databaseHelper", "Lcom/zepto/ws6;", "U", "Lcom/zepto/ws6;", "getUserSessionManager", "()Lcom/zepto/ws6;", "s2", "(Lcom/zepto/ws6;)V", "userSessionManager", "V", "K1", "r2", "txt_vehicle_number", "W", "J1", "q2", "txt_reset", "X", "I1", "o2", "time_text", "Y", "F1", "m2", "selectedServiceTv", "Z", "w1", "f2", "off_code", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "a0", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "C1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "j2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "Lcom/nic/mparivahan/VahanEkyc/EkYCService;", "b0", "Lcom/nic/mparivahan/VahanEkyc/EkYCService;", "getRetrofitService_one", "()Lcom/nic/mparivahan/VahanEkyc/EkYCService;", "retrofitService_one", "c0", "Ljava/util/HashMap;", "G1", "()Ljava/util/HashMap;", "setServiceSelection_HashMap", "(Ljava/util/HashMap;)V", "d0", "y1", "setOwner_name_addhaar", "owner_name_addhaar", "e0", "r1", "setAddress", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanAdharOtpVerificationScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public TextView verify_user;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public String param;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String RC;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public EditText enterOtp;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String otpId;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ld7 viewModelv1;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String txnNo;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String adahar_no;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public f47 mView;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public TextView resendOtp;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public lk7 viewModel;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public TextView disPlay;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public AppCompatImageView backButton;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public RelativeLayout nexGenHolder;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public ImageView showmpin;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public DatabaseHelper databaseHelper;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public ws6 userSessionManager;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public TextView txt_vehicle_number;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public TextView txt_reset;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public TextView time_text;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public TextView selectedServiceTv;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public final EkYCService retrofitService_one = EkYCService.INSTANCE.a(this);

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public HashMap serviceSelection_HashMap = new HashMap();

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public String owner_name_addhaar = "NA";

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public String address = "NA";

    public static final class a extends CountDownTimer {
        public a() {
            super(30000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            VahanAdharOtpVerificationScreen.this.D1().setVisibility(0);
            VahanAdharOtpVerificationScreen.this.I1().setText("0");
            VahanAdharOtpVerificationScreen.this.I1().setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            VahanAdharOtpVerificationScreen.this.I1().setText("Time remaining : " + (j / ((long) 1000)));
            VahanAdharOtpVerificationScreen.this.D1().setVisibility(8);
            VahanAdharOtpVerificationScreen.this.I1().setVisibility(0);
        }
    }

    public static final class b extends CountDownTimer {
        public b() {
            super(30000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            VahanAdharOtpVerificationScreen.this.D1().setVisibility(0);
            VahanAdharOtpVerificationScreen.this.I1().setText("0");
            VahanAdharOtpVerificationScreen.this.I1().setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            VahanAdharOtpVerificationScreen.this.I1().setText("Time remaining : " + (j / ((long) 1000)));
            VahanAdharOtpVerificationScreen.this.D1().setVisibility(8);
            VahanAdharOtpVerificationScreen.this.I1().setVisibility(0);
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(StateCostForDms stateCostForDms) {
            VahanAdharOtpVerificationScreen.this.z1().dismiss();
            try {
                String faceless_service_purcd = stateCostForDms.getFaceless_service_purcd();
                if (faceless_service_purcd != null && faceless_service_purcd.length() != 0) {
                    List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) stateCostForDms.getFaceless_service_purcd(), new String[]{","}, false, 0, 6, (Object) null);
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default, 10));
                    Iterator it = listSplit$default.iterator();
                    while (it.hasNext()) {
                        arrayList.add(StringsKt__StringsKt.trim((CharSequence) it.next()).toString());
                    }
                    if (arrayList.contains(VContant.INSTANCE.g(VahanAdharOtpVerificationScreen.this.getServiceSelection_HashMap()))) {
                        VahanAdharOtpVerificationScreen vahanAdharOtpVerificationScreen = VahanAdharOtpVerificationScreen.this;
                        vahanAdharOtpVerificationScreen.X1(vahanAdharOtpVerificationScreen.B1(), VahanAdharOtpVerificationScreen.this.getServiceSelection_HashMap(), true, VahanAdharOtpVerificationScreen.this.getOwner_name_addhaar(), VahanAdharOtpVerificationScreen.this.getAddress());
                        return;
                    } else {
                        VahanAdharOtpVerificationScreen vahanAdharOtpVerificationScreen2 = VahanAdharOtpVerificationScreen.this;
                        vahanAdharOtpVerificationScreen2.X1(vahanAdharOtpVerificationScreen2.B1(), VahanAdharOtpVerificationScreen.this.getServiceSelection_HashMap(), false, VahanAdharOtpVerificationScreen.this.getOwner_name_addhaar(), VahanAdharOtpVerificationScreen.this.getAddress());
                        return;
                    }
                }
                VahanAdharOtpVerificationScreen vahanAdharOtpVerificationScreen3 = VahanAdharOtpVerificationScreen.this;
                vahanAdharOtpVerificationScreen3.X1(vahanAdharOtpVerificationScreen3.B1(), VahanAdharOtpVerificationScreen.this.getServiceSelection_HashMap(), false, VahanAdharOtpVerificationScreen.this.getOwner_name_addhaar(), VahanAdharOtpVerificationScreen.this.getAddress());
            } catch (Exception e) {
                VahanAdharOtpVerificationScreen vahanAdharOtpVerificationScreen4 = VahanAdharOtpVerificationScreen.this;
                vahanAdharOtpVerificationScreen4.X1(vahanAdharOtpVerificationScreen4.B1(), VahanAdharOtpVerificationScreen.this.getServiceSelection_HashMap(), false, VahanAdharOtpVerificationScreen.this.getOwner_name_addhaar(), VahanAdharOtpVerificationScreen.this.getAddress());
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((StateCostForDms) obj);
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
            VahanAdharOtpVerificationScreen.this.z1().dismiss();
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

    public static final void O1(VahanAdharOtpVerificationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void P1(VahanAdharOtpVerificationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.U1();
    }

    public static final void Q1(VahanAdharOtpVerificationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.u1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            this$0.H1().setImageResource(R.drawable.pass_visible);
            this$0.u1().setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            this$0.H1().setImageResource(R.drawable.mvvm_visibility);
            this$0.u1().setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public static final void R1(VahanAdharOtpVerificationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.z1().show();
        this$0.new b().start();
        this$0.M1().j(this$0, this$0.x1());
    }

    public static final void S1(VahanAdharOtpVerificationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.u1().setText("");
    }

    public static final void T1(VahanAdharOtpVerificationScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.u1().getText().toString();
        if (string == null || string.length() == 0) {
            this$0.V1(this$0, "Please enter the OTP");
            return;
        }
        if (string.length() < 6) {
            this$0.V1(this$0, "Please enter the valid OTP");
            return;
        }
        this$0.z1().show();
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] bytes = this$0.q1().getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        encoder.encodeToString(bytes);
    }

    private final void U1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public final String A1() {
        String str = this.param;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("param");
        return null;
    }

    public final String B1() {
        String str = this.RC;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("RC");
        return null;
    }

    public final NrvDetails C1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final TextView D1() {
        TextView textView = this.resendOtp;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("resendOtp");
        return null;
    }

    public final VahanProService E1() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final TextView F1() {
        TextView textView = this.selectedServiceTv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("selectedServiceTv");
        return null;
    }

    /* JADX INFO: renamed from: G1, reason: from getter */
    public final HashMap getServiceSelection_HashMap() {
        return this.serviceSelection_HashMap;
    }

    public final ImageView H1() {
        ImageView imageView = this.showmpin;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("showmpin");
        return null;
    }

    public final TextView I1() {
        TextView textView = this.time_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("time_text");
        return null;
    }

    public final TextView J1() {
        TextView textView = this.txt_reset;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txt_reset");
        return null;
    }

    public final TextView K1() {
        TextView textView = this.txt_vehicle_number;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txt_vehicle_number");
        return null;
    }

    public final TextView L1() {
        TextView textView = this.verify_user;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("verify_user");
        return null;
    }

    public final lk7 M1() {
        lk7 lk7Var = this.viewModel;
        if (lk7Var != null) {
            return lk7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final ld7 N1() {
        ld7 ld7Var = this.viewModelv1;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelv1");
        return null;
    }

    public final void V1(Context context, String message) {
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
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wu6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanAdharOtpVerificationScreen.W1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void X1(String rc_number, HashMap serviceSelection_HashMap, boolean isFaceless, String name, String address) {
        Class cls;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(rc_number, "rc_number");
        Intrinsics.checkNotNullParameter(serviceSelection_HashMap, "serviceSelection_HashMap");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(address, "address");
        if (serviceSelection_HashMap.containsKey(VContant.DUPLICATE_RC)) {
            Intent intent = new Intent(this, (Class<?>) VahanDuplicateRcActivity.class);
            intent.putExtra("RC", rc_number);
            intent.putExtra("RcDetails", C1());
            intent.putExtra("map", serviceSelection_HashMap);
            intent.putExtra("off_code", w1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent.putExtra(VContant.NEXGEN_addahar_name, name);
            intent.putExtra(VContant.NEXGEN_addahar_address, address);
            startActivity(intent);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.TRANFER_OF_OWNERSHIP)) {
            Intent intent2 = new Intent(this, (Class<?>) TransferOwnerShipActivity.class);
            intent2.putExtra("RC", rc_number);
            intent2.putExtra("RcDetails", C1());
            intent2.putExtra("map", serviceSelection_HashMap);
            intent2.putExtra("off_code", w1());
            intent2.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent2.putExtra(VContant.NEXGEN_addahar_name, name);
            intent2.putExtra(VContant.NEXGEN_addahar_address, address);
            startActivity(intent2);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.CHANGE_OF_ADDRESS)) {
            Intent intent3 = new Intent(this, (Class<?>) VahanChangeOfAddress.class);
            intent3.putExtra("RC", rc_number);
            intent3.putExtra("RcDetails", C1());
            intent3.putExtra("map", serviceSelection_HashMap);
            intent3.putExtra("off_code", w1());
            intent3.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent3.putExtra(VContant.NEXGEN_addahar_name, name);
            intent3.putExtra(VContant.NEXGEN_addahar_address, address);
            startActivity(intent3);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.HYPOTHICATION_TERMINATION)) {
            Intent intent4 = new Intent(this, (Class<?>) HypothecationTerminationActivity.class);
            intent4.putExtra("RC", rc_number);
            intent4.putExtra("RcDetails", C1());
            intent4.putExtra("map", serviceSelection_HashMap);
            intent4.putExtra("off_code", w1());
            intent4.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent4.putExtra(VContant.NEXGEN_addahar_name, name);
            intent4.putExtra(VContant.NEXGEN_addahar_address, address);
            startActivity(intent4);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_CONTINUATION)) {
            Intent intent5 = new Intent(this, (Class<?>) HypothecationContinuationActivity.class);
            intent5.putExtra("RC", rc_number);
            cls = HypothecationContinuationActivity.class;
            intent5.putExtra("RcDetails", C1());
            intent5.putExtra("map", serviceSelection_HashMap);
            intent5.putExtra("off_code", w1());
            intent5.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent5.putExtra(VContant.NEXGEN_addahar_name, name);
            intent5.putExtra(VContant.NEXGEN_addahar_address, address);
            startActivity(intent5);
            finish();
        } else {
            cls = HypothecationContinuationActivity.class;
        }
        if (serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_ADDITION)) {
            Intent intent6 = new Intent(this, (Class<?>) HypothecationAdditionActivity.class);
            intent6.putExtra("RC", rc_number);
            intent6.putExtra("RcDetails", C1());
            intent6.putExtra("map", serviceSelection_HashMap);
            intent6.putExtra("off_code", w1());
            intent6.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent6.putExtra(VContant.NEXGEN_addahar_name, name);
            intent6.putExtra(VContant.NEXGEN_addahar_address, address);
            startActivity(intent6);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.RCPARTICULAR)) {
            Intent intent7 = new Intent(this, (Class<?>) VahanDetailsForRcParticulara.class);
            str = "map";
            intent7.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.RCPARTICULAR_CODE);
            intent7.putExtra(VContant.PURPOSE_CODE, VContant.RCPARTICULAR_PURPOSE_CODE);
            intent7.putExtra("state_code", C1().getState_cd());
            intent7.putExtra("rc_number", rc_number);
            intent7.putExtra("RcDetails", C1());
            intent7.putExtra(VContant.SERVICE_NAME, "RC Particular");
            intent7.putExtra("off_code", w1());
            intent7.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent7.putExtra(VContant.NEXGEN_addahar_name, name);
            intent7.putExtra(VContant.NEXGEN_addahar_address, address);
            startActivity(intent7);
            finish();
        } else {
            str = "map";
        }
        if (serviceSelection_HashMap.containsKey(VContant.NOC)) {
            Intent intent8 = new Intent(this, (Class<?>) VahanNocActivity.class);
            intent8.putExtra("RC", rc_number);
            intent8.putExtra("RcDetails", C1());
            str2 = str;
            intent8.putExtra(str2, serviceSelection_HashMap);
            intent8.putExtra("off_code", w1());
            intent8.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent8.putExtra(VContant.NEXGEN_addahar_name, name);
            intent8.putExtra(VContant.NEXGEN_addahar_address, address);
            startActivity(intent8);
            finish();
        } else {
            str2 = str;
        }
        if (serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_CONTINUATION)) {
            Intent intent9 = new Intent(this, (Class<?>) cls);
            intent9.putExtra("RC", rc_number);
            intent9.putExtra("RcDetails", C1());
            intent9.putExtra(str2, serviceSelection_HashMap);
            intent9.putExtra("off_code", w1());
            intent9.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent9.putExtra(VContant.NEXGEN_addahar_name, name);
            intent9.putExtra(VContant.NEXGEN_addahar_address, address);
            startActivity(intent9);
            finish();
        }
    }

    public final void Y1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.adahar_no = str;
    }

    public final void Z1(AppCompatImageView appCompatImageView) {
        Intrinsics.checkNotNullParameter(appCompatImageView, "<set-?>");
        this.backButton = appCompatImageView;
    }

    public final void a2(DatabaseHelper databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "<set-?>");
        this.databaseHelper = databaseHelper;
    }

    public final void b2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.disPlay = textView;
    }

    public final void c2(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.enterOtp = editText;
    }

    public final void d2(f47 f47Var) {
        Intrinsics.checkNotNullParameter(f47Var, "<set-?>");
        this.mView = f47Var;
    }

    public final void e2(RelativeLayout relativeLayout) {
        Intrinsics.checkNotNullParameter(relativeLayout, "<set-?>");
        this.nexGenHolder = relativeLayout;
    }

    public final void f2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void g2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void h2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.param = str;
    }

    public final void i2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.RC = str;
    }

    public final void j2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void k2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.resendOtp = textView;
    }

    public final void l2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void m2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.selectedServiceTv = textView;
    }

    public final void n2(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.showmpin = imageView;
    }

    public final void o2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.time_text = textView;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vahan_adahar_otp_verification_screen);
        View viewFindViewById = findViewById(R.id.verify_user);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        t2((TextView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.enterOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        c2((EditText) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.disPlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        b2((TextView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.resendOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        k2((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.showmpin);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        n2((ImageView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.txt_reset);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        q2((TextView) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.time_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        o2((TextView) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.selectedServiceTv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        m2((TextView) viewFindViewById8);
        View viewFindViewById9 = findViewById(R.id.txt_vehicle_number);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        r2((TextView) viewFindViewById9);
        g2(new ProgressDialog(this));
        z1().setMessage("Please wait...");
        z1().setCancelable(false);
        z1().setCanceledOnTouchOutside(false);
        s2(new ws6(this));
        DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(this);
        Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
        a2(databaseHelperD0);
        l2(VahanProService.INSTANCE.a(this));
        u2((ld7) new z(this, new kd7(new jd7(E1()))).a(ld7.class));
        View viewFindViewById10 = findViewById(R.id.mvvm_back);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        Z1((AppCompatImageView) viewFindViewById10);
        View viewFindViewById11 = findViewById(R.id.nexGenHolder);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        e2((RelativeLayout) viewFindViewById11);
        s1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qu6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanAdharOtpVerificationScreen.O1(this.a, view);
            }
        });
        d2((f47) new z(this, new em7(new e47(this.retrofitService_one))).a(f47.class));
        v1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ru6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanAdharOtpVerificationScreen.P1(this.a, view);
            }
        });
        new a().start();
        H1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.su6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanAdharOtpVerificationScreen.Q1(this.a, view);
            }
        });
        new ws6(this);
        Intent intent = getIntent();
        if (intent != null) {
            try {
                f2(String.valueOf(intent.getStringExtra("off_code")));
                Serializable serializableExtra = intent.getSerializableExtra("RcDetails");
                Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
                j2((NrvDetails) serializableExtra);
                i2(String.valueOf(intent.getStringExtra("RC")));
                h2(String.valueOf(intent.getStringExtra("Mobile_No")));
                t1().setText("OTP has been sent on your aadhar linked mobile number xxxxxx" + A1());
                HashMap map = (HashMap) intent.getSerializableExtra("map");
                Intrinsics.checkNotNull(map);
                this.serviceSelection_HashMap = map;
                p2(String.valueOf(intent.getStringExtra("txnNo")));
                Y1(String.valueOf(intent.getStringExtra("adahar_no")));
                K1().setText(B1().toString());
                p1(this.serviceSelection_HashMap);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        D1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tu6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanAdharOtpVerificationScreen.R1(this.a, view);
            }
        });
        J1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uu6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanAdharOtpVerificationScreen.S1(this.a, view);
            }
        });
        L1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vu6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanAdharOtpVerificationScreen.T1(this.a, view);
            }
        });
        N1().l0().g(this, new e(new c()));
        N1().m0().g(this, new e(new d()));
    }

    public final void p1(HashMap serviceSelection_HashMap) {
        Intrinsics.checkNotNullParameter(serviceSelection_HashMap, "serviceSelection_HashMap");
        if (serviceSelection_HashMap.containsKey(VContant.DUPLICATE_RC)) {
            F1().setText("Issue of Duplicate RC");
        }
        if (serviceSelection_HashMap.containsKey(VContant.TRANFER_OF_OWNERSHIP)) {
            F1().setText("Transfer of Ownership");
        }
        if (serviceSelection_HashMap.containsKey(VContant.CHANGE_OF_ADDRESS)) {
            F1().setText("Change of Address In RC");
        }
        if (serviceSelection_HashMap.containsKey(VContant.HYPOTHICATION_TERMINATION)) {
            F1().setText("Hypothecation Termination");
        }
        if (serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_CONTINUATION)) {
            F1().setText("Hypothecation Continuation");
        }
        if (serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_ADDITION)) {
            F1().setText("Hypothecation Addition");
        }
        if (serviceSelection_HashMap.containsKey(VContant.RCPARTICULAR)) {
            F1().setText("RC Particular of Vehicle");
        }
    }

    public final void p2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.txnNo = str;
    }

    public final String q1() {
        String str = this.adahar_no;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adahar_no");
        return null;
    }

    public final void q2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txt_reset = textView;
    }

    /* JADX INFO: renamed from: r1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    public final void r2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txt_vehicle_number = textView;
    }

    public final AppCompatImageView s1() {
        AppCompatImageView appCompatImageView = this.backButton;
        if (appCompatImageView != null) {
            return appCompatImageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("backButton");
        return null;
    }

    public final void s2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.userSessionManager = ws6Var;
    }

    public final TextView t1() {
        TextView textView = this.disPlay;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("disPlay");
        return null;
    }

    public final void t2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.verify_user = textView;
    }

    public final EditText u1() {
        EditText editText = this.enterOtp;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("enterOtp");
        return null;
    }

    public final void u2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModelv1 = ld7Var;
    }

    public final RelativeLayout v1() {
        RelativeLayout relativeLayout = this.nexGenHolder;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nexGenHolder");
        return null;
    }

    public final String w1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    public final String x1() {
        String str = this.otpId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("otpId");
        return null;
    }

    /* JADX INFO: renamed from: y1, reason: from getter */
    public final String getOwner_name_addhaar() {
        return this.owner_name_addhaar;
    }

    public final ProgressDialog z1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }
}
