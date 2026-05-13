package com.nic.mparivahan.dlservices.newlearner;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.DlLog.DlLogUpdate;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.a;
import com.nic.mparivahan.dlservices.data.model.ApplFlowStatusListItem;
import com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.data.model.temp.PhotoDto;
import com.nic.mparivahan.dlservices.newlearner.DataClass.CheckPhotoSignResponseModal;
import com.nic.mparivahan.dlservices.newlearner.LLPhotoSign;
import com.nic.mparivahan.dlservices.ui.DLServiceFinalSubmitedActivity;
import com.nic.mparivahan.dlservices.ui.acknow.DlApplStatusResponse;
import com.nic.mparivahan.dlservices.ui.acknow.OlaMast;
import com.nic.mparivahan.dlservices.ui.acknow.ResponseBody;
import com.nic.mparivahan.dlservices.ui.acknow.ResponseMessage;
import com.nic.mparivahan.dlservices.ui.acknow.TransReqItem;
import com.nic.mparivahan.dlservices.ui.newlearner.Service.NewLLServices;
import com.zepto.aj0;
import com.zepto.gf;
import com.zepto.hf;
import com.zepto.i94;
import com.zepto.j94;
import com.zepto.k94;
import com.zepto.kt6;
import com.zepto.mf;
import com.zepto.mf4;
import com.zepto.of;
import com.zepto.ox2;
import com.zepto.pq;
import com.zepto.st6;
import com.zepto.sw4;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.wm1;
import com.zepto.ws6;
import com.zepto.z9;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \u008d\u00012\u00020\u0001:\u0002\u008e\u0001B\t¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\u00022\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\u0012\u0010\u0013\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0012\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014J\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\r\u001a\u0004\u0018\u00010\fJ/\u0010#\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00101R\u0016\u00109\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00101R\u0016\u0010:\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00101R\u0016\u0010<\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u00101R\u0016\u0010>\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u00101R\"\u0010D\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u00101\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0016\u0010F\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u00101R\u0016\u0010H\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u00101R\u0016\u0010J\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u00101R\u0016\u0010L\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u00101R$\u0010P\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u00101\u001a\u0004\bN\u0010A\"\u0004\bO\u0010CR$\u0010T\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u00101\u001a\u0004\bR\u0010A\"\u0004\bS\u0010CR\"\u0010X\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u00101\u001a\u0004\bV\u0010A\"\u0004\bW\u0010CR\u0016\u0010Z\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u00101R\"\u0010^\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u00101\u001a\u0004\b\\\u0010A\"\u0004\b]\u0010CR\"\u0010b\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u00101\u001a\u0004\b`\u0010A\"\u0004\ba\u0010CR\"\u0010j\u001a\u00020c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010r\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u0018\u0010v\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010z\u001a\u00020w8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bx\u0010yR\u0016\u0010~\u001a\u00020{8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b|\u0010}R(\u0010\u0084\u0001\u001a\u0013\u0012\u000f\u0012\r \u0081\u0001*\u0005\u0018\u00010\u0080\u00010\u0080\u00010\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R:\u0010\u008a\u0001\u001a\u0013\u0012\u000f\u0012\r \u0081\u0001*\u0005\u0018\u00010\u0080\u00010\u0080\u00010\u007f8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0083\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001¨\u0006\u008f\u0001"}, d2 = {"Lcom/nic/mparivahan/dlservices/newlearner/LLPhotoSign;", "Lcom/zepto/pq;", "", "d2", "e2", "f2", "c2", "W1", "", "Lcom/nic/mparivahan/dlservices/data/model/ApplFlowStatusListItem;", "applFlowStatusList", "I2", "", "message", "x2", "M2", "J2", "K2", "N2", "z2", "", "visible", "H2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "B2", "", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "acCd", "w2", "(Ljava/lang/Integer;)V", "Lcom/zepto/z9;", "C", "Lcom/zepto/z9;", "mBinding", "Lcom/zepto/wm1;", "D", "Lcom/zepto/wm1;", "viewModel", "E", "Ljava/lang/String;", "imgType", "F", "I", "mStatus", "G", "mApplNo", "H", "mApplDob", "mApplName", "J", "mApplFather", "K", "mApplRtoName", "L", "getLastEndorseRTOCode", "()Ljava/lang/String;", "F2", "(Ljava/lang/String;)V", "lastEndorseRTOCode", "M", "stateCode", "N", "serviceCode", "O", "mApplPhoto", "P", "mApplSign", "Q", "getDob", "setDob", "dob", "R", "getMobile_no", "setMobile_no", "Mobile_no", "S", "getLastEndorseRto", "setLastEndorseRto", "lastEndorseRto", "T", "aadharPhoto", "U", "getClPhoto", "setClPhoto", "clPhoto", "V", "X1", "D2", "app_date", "Lcom/zepto/ws6;", "W", "Lcom/zepto/ws6;", "b2", "()Lcom/zepto/ws6;", "G2", "(Lcom/zepto/ws6;)V", "mSessionmanger", "Lcom/zepto/wa3;", "X", "Lcom/zepto/wa3;", "a2", "()Lcom/zepto/wa3;", "E2", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/sw4;", "Y", "Lcom/zepto/sw4;", "mProgressApplication", "Lcom/nic/mparivahan/dlservices/ui/newlearner/Service/NewLLServices;", "Z", "Lcom/nic/mparivahan/dlservices/ui/newlearner/Service/NewLLServices;", "service", "Lcom/zepto/j94;", "a0", "Lcom/zepto/j94;", "learnerLicenceVM", "Lcom/zepto/of;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "b0", "Lcom/zepto/of;", "startForProfileImageResult", "c0", "Z1", "()Lcom/zepto/of;", "setGetDocLauncher", "(Lcom/zepto/of;)V", "getDocLauncher", "<init>", "()V", "d0", "a", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLLPhotoSign.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLPhotoSign.kt\ncom/nic/mparivahan/dlservices/newlearner/LLPhotoSign\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,817:1\n1#2:818\n*E\n"})
public final class LLPhotoSign extends pq {

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int e0 = 7091;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public z9 mBinding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public wm1 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String imgType;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String mApplNo;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String mApplDob;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String mApplName;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String mApplFather;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String mApplRtoName;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String stateCode;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String serviceCode;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String app_date;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public ws6 mSessionmanger;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public sw4 mProgressApplication;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public NewLLServices service;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public j94 learnerLicenceVM;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public final of startForProfileImageResult;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public of getDocLauncher;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public int mStatus = -1;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String lastEndorseRTOCode = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String mApplPhoto = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String mApplSign = "";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String dob = "";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String Mobile_no = "";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String lastEndorseRto = "";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String aadharPhoto = "";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String clPhoto = "";

    /* JADX INFO: renamed from: com.nic.mparivahan.dlservices.newlearner.LLPhotoSign$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return LLPhotoSign.e0;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            LLPhotoSign.this.getGetDocLauncher().a(intent);
            LLPhotoSign.this.H2(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Intent) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            LLPhotoSign.this.startForProfileImageResult.a(intent);
            LLPhotoSign.this.H2(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Intent) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        public final void a(Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            LLPhotoSign.this.startForProfileImageResult.a(intent);
            LLPhotoSign.this.H2(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Intent) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(DlApplStatusResponse dlApplStatusResponse) {
            Integer statusCode;
            List<TransReqItem> transReq;
            TransReqItem transReqItem;
            try {
                ResponseMessage responseMessage = dlApplStatusResponse.getResponseMessage();
                if (responseMessage == null || (statusCode = responseMessage.getStatusCode()) == null || statusCode.intValue() != 200) {
                    return;
                }
                LLPhotoSign lLPhotoSign = LLPhotoSign.this;
                ResponseBody responseBody = dlApplStatusResponse.getResponseBody();
                String str = null;
                lLPhotoSign.mApplName = String.valueOf(responseBody != null ? responseBody.getApdFullName() : null);
                LLPhotoSign lLPhotoSign2 = LLPhotoSign.this;
                ResponseBody responseBody2 = dlApplStatusResponse.getResponseBody();
                lLPhotoSign2.mApplFather = String.valueOf(responseBody2 != null ? responseBody2.getApdSwdFullName() : null);
                LLPhotoSign lLPhotoSign3 = LLPhotoSign.this;
                ResponseBody responseBody3 = dlApplStatusResponse.getResponseBody();
                lLPhotoSign3.serviceCode = String.valueOf((responseBody3 == null || (transReq = responseBody3.getTransReq()) == null || (transReqItem = transReq.get(0)) == null) ? null : transReqItem.getTrTrCd());
                ResponseBody responseBody4 = dlApplStatusResponse.getResponseBody();
                OlaMast olaMast = responseBody4 != null ? responseBody4.getOlaMast() : null;
                LLPhotoSign lLPhotoSign4 = LLPhotoSign.this;
                StringBuilder sb = new StringBuilder();
                sb.append(olaMast != null ? olaMast.getOmPostaladd1() : null);
                sb.append(' ');
                sb.append(olaMast != null ? olaMast.getOmPostaladd2() : null);
                sb.append(' ');
                sb.append(olaMast != null ? olaMast.getOmPostaladd3() : null);
                lLPhotoSign4.mApplRtoName = sb.toString();
                LLPhotoSign.this.F2(String.valueOf(olaMast != null ? olaMast.getOmOfficecd() : null));
                LLPhotoSign.this.stateCode = String.valueOf(olaMast != null ? olaMast.getOmStCode() : null);
                z9 z9Var = LLPhotoSign.this.mBinding;
                if (z9Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    z9Var = null;
                }
                TextView textView = z9Var.D;
                String str2 = LLPhotoSign.this.mApplNo;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                    str2 = null;
                }
                textView.setText(str2);
                z9 z9Var2 = LLPhotoSign.this.mBinding;
                if (z9Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    z9Var2 = null;
                }
                TextView textView2 = z9Var2.F;
                String str3 = LLPhotoSign.this.mApplDob;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                    str3 = null;
                }
                textView2.setText(str3);
                z9 z9Var3 = LLPhotoSign.this.mBinding;
                if (z9Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    z9Var3 = null;
                }
                TextView textView3 = z9Var3.E;
                String str4 = LLPhotoSign.this.mApplName;
                if (str4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplName");
                    str4 = null;
                }
                textView3.setText(str4);
                z9 z9Var4 = LLPhotoSign.this.mBinding;
                if (z9Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    z9Var4 = null;
                }
                TextView textView4 = z9Var4.H;
                String str5 = LLPhotoSign.this.mApplFather;
                if (str5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplFather");
                    str5 = null;
                }
                textView4.setText(str5);
                z9 z9Var5 = LLPhotoSign.this.mBinding;
                if (z9Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    z9Var5 = null;
                }
                TextView textView5 = z9Var5.S;
                String str6 = LLPhotoSign.this.mApplRtoName;
                if (str6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplRtoName");
                    str6 = null;
                }
                textView5.setText(str6);
                LLPhotoSign.this.mStatus = 0;
                if (!a.a.a(LLPhotoSign.this)) {
                    Toast.makeText(LLPhotoSign.this.getApplicationContext(), LLPhotoSign.this.a2().b("label_log_check_internet", LLPhotoSign.this.getString(R.string.kindly_check_your_internet_connection)), 0).show();
                    return;
                }
                j94 j94Var = LLPhotoSign.this.learnerLicenceVM;
                if (j94Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("learnerLicenceVM");
                    j94Var = null;
                }
                String str7 = LLPhotoSign.this.mApplNo;
                if (str7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                } else {
                    str = str7;
                }
                j94Var.g(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DlApplStatusResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        public final void a(CheckPhotoSignResponseModal checkPhotoSignResponseModal) {
            try {
                z9 z9Var = null;
                if (kt6.d(checkPhotoSignResponseModal.getPhoto())) {
                    Bitmap bitmapC = st6.c(checkPhotoSignResponseModal.getPhoto());
                    z9 z9Var2 = LLPhotoSign.this.mBinding;
                    if (z9Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        z9Var2 = null;
                    }
                    z9Var2.u0.setImageBitmap(bitmapC);
                    z9 z9Var3 = LLPhotoSign.this.mBinding;
                    if (z9Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        z9Var3 = null;
                    }
                    z9Var3.O.setClickable(false);
                    z9 z9Var4 = LLPhotoSign.this.mBinding;
                    if (z9Var4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        z9Var4 = null;
                    }
                    z9Var4.P.setClickable(false);
                    z9 z9Var5 = LLPhotoSign.this.mBinding;
                    if (z9Var5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        z9Var5 = null;
                    }
                    z9Var5.O.setEnabled(false);
                    z9 z9Var6 = LLPhotoSign.this.mBinding;
                    if (z9Var6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        z9Var6 = null;
                    }
                    z9Var6.P.setEnabled(false);
                    z9 z9Var7 = LLPhotoSign.this.mBinding;
                    if (z9Var7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        z9Var7 = null;
                    }
                    z9Var7.P.setBackgroundResource(R.drawable.unselected_button_grey);
                    z9 z9Var8 = LLPhotoSign.this.mBinding;
                    if (z9Var8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        z9Var8 = null;
                    }
                    z9Var8.O.setBackgroundResource(R.drawable.unselected_button_grey);
                    LLPhotoSign.this.mApplPhoto = checkPhotoSignResponseModal.getPhoto();
                }
                if (kt6.d(checkPhotoSignResponseModal.getSignature())) {
                    Bitmap bitmapC2 = st6.c(checkPhotoSignResponseModal.getSignature());
                    z9 z9Var9 = LLPhotoSign.this.mBinding;
                    if (z9Var9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    } else {
                        z9Var = z9Var9;
                    }
                    z9Var.V.setImageBitmap(bitmapC2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CheckPhotoSignResponseModal) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
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
        public final void a(PhotoDto photoDto) {
            try {
                z9 z9Var = LLPhotoSign.this.mBinding;
                z9 z9Var2 = null;
                if (z9Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    z9Var = null;
                }
                z9Var.v0.c(false);
                String statusCode = photoDto.getStatusCode();
                if (statusCode == null || !statusCode.equals("00")) {
                    LLPhotoSign.this.z2(photoDto.getStatusDesc());
                    return;
                }
                LLPhotoSign lLPhotoSign = LLPhotoSign.this;
                lLPhotoSign.B2(lLPhotoSign, lLPhotoSign.a2().b("label_photo_sign_uploaded", LLPhotoSign.this.getString(R.string.photo_uploaded)));
                z9 z9Var3 = LLPhotoSign.this.mBinding;
                if (z9Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    z9Var3 = null;
                }
                z9Var3.W.setVisibility(0);
                z9 z9Var4 = LLPhotoSign.this.mBinding;
                if (z9Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    z9Var2 = z9Var4;
                }
                z9Var2.v0.setVisibility(8);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((PhotoDto) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class h extends Lambda implements Function1 {
        public h() {
            super(1);
        }

        public final void a(DlApplStatusDto dlApplStatusDto) throws Throwable {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            try {
                z9 z9Var = LLPhotoSign.this.mBinding;
                if (z9Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    z9Var = null;
                }
                z9Var.W.c(false);
                if (!StringsKt__StringsJVMKt.equals$default(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, null) || dlApplStatusDto == null || (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) == null || !(!applStatusDetails.isEmpty()) || (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) == null || (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) == null || !(!applFlowStatusList.isEmpty())) {
                    return;
                }
                Log.e("before", applStatusDetailsItem.getApplFlowStatusList().toString());
                LLPhotoSign.this.I2(applStatusDetailsItem.getApplFlowStatusList());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((DlApplStatusDto) obj);
            return Unit.INSTANCE;
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

    public LLPhotoSign() {
        of ofVarB0 = B0(new mf(), new hf() { // from class: com.zepto.h93
            @Override // com.zepto.hf
            public final void a(Object obj) {
                LLPhotoSign.L2(this.a, (gf) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarB0, "registerForActivityResult(...)");
        this.startForProfileImageResult = ofVarB0;
        of ofVarB02 = B0(new mf(), new hf() { // from class: com.zepto.i93
            @Override // com.zepto.hf
            public final void a(Object obj) {
                LLPhotoSign.Y1(this.a, (gf) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(ofVarB02, "registerForActivityResult(...)");
        this.getDocLauncher = ofVarB02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H2(boolean visible) {
        if (visible) {
            try {
                this.mProgressApplication = new sw4(this, R.string.please_wait_2, true);
            } catch (WindowManager.BadTokenException e2) {
                e2.printStackTrace();
                return;
            }
        }
        sw4 sw4Var = this.mProgressApplication;
        if (sw4Var != null) {
            if (visible) {
                sw4Var.b();
            } else {
                sw4Var.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I2(List applFlowStatusList) throws Throwable {
        String str;
        Integer acCd;
        String str2;
        int size = applFlowStatusList.size();
        int i2 = 0;
        while (true) {
            str = null;
            if (i2 >= size) {
                acCd = null;
                break;
            }
            Object obj = applFlowStatusList.get(i2);
            Intrinsics.checkNotNull(obj);
            if (Intrinsics.areEqual(((ApplFlowStatusListItem) obj).getStatus(), "Pending")) {
                Object obj2 = applFlowStatusList.get(i2);
                Intrinsics.checkNotNull(obj2);
                Integer acCd2 = ((ApplFlowStatusListItem) obj2).getAcCd();
                if (acCd2 == null || acCd2.intValue() != 455) {
                    break;
                }
            }
            i2++;
        }
        Object obj3 = applFlowStatusList.get(i2);
        Intrinsics.checkNotNull(obj3);
        acCd = ((ApplFlowStatusListItem) obj3).getAcCd();
        if (acCd == null) {
            new DLServiceFinalSubmitedActivity().G1(this);
            return;
        }
        try {
            DlLogUpdate.Companion companion = DlLogUpdate.INSTANCE;
            String str3 = this.mApplDob;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                str2 = null;
            } else {
                str2 = str3;
            }
            String str4 = this.mApplNo;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
            } else {
                str = str4;
            }
            long j = Long.parseLong(str);
            int i3 = Integer.parseInt(b2().k());
            String str5 = this.dob;
            Intrinsics.checkNotNull(str5);
            companion.a(this, str2, j, i3, str5, "", this.lastEndorseRTOCode);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        w2(acCd);
    }

    private final void J2() {
        try {
            Intent intent = new Intent(this, (Class<?>) LLDocUpload.class);
            String str = this.mApplNo;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.mApplDob;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
            } else {
                str2 = str3;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str2);
            intent.putExtra("dob", this.dob);
            intent.putExtra("Mobile_no", this.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
            intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
            intent.putExtra("aadharPhoto", this.aadharPhoto);
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void K2() {
        try {
            Intent intent = new Intent(this, (Class<?>) LLFeePayment.class);
            String str = this.mApplNo;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.mApplDob;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
            } else {
                str2 = str3;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str2);
            intent.putExtra("dob", this.dob);
            intent.putExtra("Mobile_no", this.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
            intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
            intent.putExtra("aadharPhoto", this.aadharPhoto);
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    public static final void L2(LLPhotoSign this$0, gf result) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            int iD = result.d();
            Intent intentC = result.c();
            if (iD != -1) {
                if (iD != 64) {
                    this$0.H2(false);
                    return;
                } else {
                    this$0.H2(false);
                    Toast.makeText(this$0, ox2.a.a(intentC), 0).show();
                    return;
                }
            }
            z9 z9Var = null;
            Uri data = intentC != null ? intentC.getData() : null;
            Intrinsics.checkNotNull(data);
            if (Build.VERSION.SDK_INT >= 28) {
                bitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(this$0.getContentResolver(), data));
                Intrinsics.checkNotNullExpressionValue(bitmap, "decodeBitmap(...)");
            } else {
                bitmap = MediaStore.Images.Media.getBitmap(this$0.getContentResolver(), data);
                Intrinsics.checkNotNullExpressionValue(bitmap, "getBitmap(...)");
            }
            String str = this$0.imgType;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgType");
                str = null;
            }
            if (Intrinsics.areEqual(str, "0")) {
                z9 z9Var2 = this$0.mBinding;
                if (z9Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    z9Var = z9Var2;
                }
                z9Var.u0.setImageBitmap(bitmap);
                this$0.mApplPhoto = st6.b(bitmap);
            } else if (Intrinsics.areEqual(str, VContant.MAINSCREEN)) {
                z9 z9Var3 = this$0.mBinding;
                if (z9Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    z9Var = z9Var3;
                }
                z9Var.V.setImageBitmap(bitmap);
                this$0.mApplSign = st6.b(bitmap);
            }
            this$0.H2(false);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void M2() {
        try {
            Intent intent = new Intent(this, (Class<?>) LLPhotoSign.class);
            String str = this.mApplNo;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.mApplDob;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
            } else {
                str2 = str3;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str2);
            intent.putExtra("dob", this.dob);
            intent.putExtra("Mobile_no", this.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
            intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
            intent.putExtra("aadharPhoto", this.aadharPhoto);
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void N2() {
        try {
            Intent intent = new Intent(this, (Class<?>) LLSlots.class);
            String str = this.mApplNo;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.mApplDob;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
            } else {
                str2 = str3;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str2);
            intent.putExtra("dob", this.dob);
            intent.putExtra("Mobile_no", this.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
            intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
            intent.putExtra("aadharPhoto", this.aadharPhoto);
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void W1() {
        if (st6.e(this)) {
            ox2.a.b(this).j().f(600).i().h(new b());
        }
    }

    public static final void Y1(LLPhotoSign this$0, gf result) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            int iD = result.d();
            Intent intentC = result.c();
            if (iD != -1) {
                if (iD != 64) {
                    this$0.H2(false);
                    return;
                } else {
                    this$0.H2(false);
                    Toast.makeText(this$0, ox2.a.a(intentC), 0).show();
                    return;
                }
            }
            z9 z9Var = null;
            Uri data = intentC != null ? intentC.getData() : null;
            Intrinsics.checkNotNull(data);
            if (Build.VERSION.SDK_INT >= 28) {
                bitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(this$0.getContentResolver(), data));
                Intrinsics.checkNotNullExpressionValue(bitmap, "decodeBitmap(...)");
            } else {
                bitmap = MediaStore.Images.Media.getBitmap(this$0.getContentResolver(), data);
                Intrinsics.checkNotNullExpressionValue(bitmap, "getBitmap(...)");
            }
            String str = this$0.imgType;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgType");
                str = null;
            }
            if (Intrinsics.areEqual(str, "0")) {
                z9 z9Var2 = this$0.mBinding;
                if (z9Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    z9Var = z9Var2;
                }
                z9Var.u0.setImageBitmap(bitmap);
                this$0.mApplPhoto = st6.b(bitmap);
            } else if (Intrinsics.areEqual(str, VContant.MAINSCREEN)) {
                z9 z9Var3 = this$0.mBinding;
                if (z9Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    z9Var = z9Var3;
                }
                z9Var.V.setImageBitmap(bitmap);
                this$0.mApplSign = st6.b(bitmap);
            }
            this$0.H2(false);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void c2() {
        if (aj0.a.a(this)) {
            ox2.a.b(this).e().f(600).i().h(new d());
        } else if (st6.d(this)) {
            ox2.a.b(this).e().f(600).i().h(new c());
        }
    }

    private final void d2() {
        wl5 wl5Var = new wl5(this);
        this.viewModel = (wm1) new z(this).a(wm1.class);
        this.service = NewLLServices.INSTANCE.a(this);
        NewLLServices newLLServices = this.service;
        wm1 wm1Var = null;
        if (newLLServices == null) {
            Intrinsics.throwUninitializedPropertyAccessException("service");
            newLLServices = null;
        }
        this.learnerLicenceVM = (j94) new z(this, new k94(new i94(newLLServices))).a(j94.class);
        z9 z9Var = this.mBinding;
        if (z9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var = null;
        }
        z9Var.v(this);
        if (getIntent() != null) {
            try {
                Bundle extras = getIntent().getExtras();
                this.mApplNo = String.valueOf(extras != null ? extras.get("dl_st_appl_ackno_no") : null);
                Bundle extras2 = getIntent().getExtras();
                this.mApplDob = String.valueOf(extras2 != null ? extras2.get("dl_st_appl_ackno_no_dob") : null);
                this.dob = String.valueOf(getIntent().getStringExtra("dob"));
                this.Mobile_no = String.valueOf(getIntent().getStringExtra("Mobile_no"));
                String stringExtra = getIntent().getStringExtra("lastEndorsedRTO");
                Intrinsics.checkNotNull(stringExtra, "null cannot be cast to non-null type kotlin.String");
                this.lastEndorseRto = stringExtra;
                String stringExtra2 = getIntent().getStringExtra("aadharPhoto");
                Intrinsics.checkNotNull(stringExtra2);
                this.aadharPhoto = stringExtra2;
                z9 z9Var2 = this.mBinding;
                if (z9Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    z9Var2 = null;
                }
                z9Var2.I.g.setText(wl5Var.k());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        String str = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        D2(str);
        z9 z9Var3 = this.mBinding;
        if (z9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var3 = null;
        }
        z9Var3.C.setText(X1());
        if (a.a.a(this)) {
            wm1 wm1Var2 = this.viewModel;
            if (wm1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                wm1Var2 = null;
            }
            String str2 = this.mApplNo;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
                str2 = null;
            }
            String str3 = this.mApplDob;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
                str3 = null;
            }
            wm1Var2.g(str2, str3);
        } else {
            Toast.makeText(getApplicationContext(), a2().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
        }
        wm1 wm1Var3 = this.viewModel;
        if (wm1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            wm1Var = wm1Var3;
        }
        wm1Var.k().g(this, new i(new e()));
    }

    private final void e2() {
        j94 j94Var = this.learnerLicenceVM;
        wm1 wm1Var = null;
        if (j94Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("learnerLicenceVM");
            j94Var = null;
        }
        j94Var.m().g(this, new i(new f()));
        wm1 wm1Var2 = this.viewModel;
        if (wm1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            wm1Var2 = null;
        }
        wm1Var2.m().g(this, new i(new g()));
        wm1 wm1Var3 = this.viewModel;
        if (wm1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            wm1Var = wm1Var3;
        }
        wm1Var.l().g(this, new i(new h()));
    }

    private final void f2() {
        z9 z9Var = null;
        if (Intrinsics.areEqual(this.aadharPhoto, "")) {
            z9 z9Var2 = this.mBinding;
            if (z9Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                z9Var2 = null;
            }
            z9Var2.O.setClickable(true);
            z9 z9Var3 = this.mBinding;
            if (z9Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                z9Var3 = null;
            }
            z9Var3.P.setClickable(true);
            z9 z9Var4 = this.mBinding;
            if (z9Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                z9Var4 = null;
            }
            z9Var4.O.setEnabled(true);
            z9 z9Var5 = this.mBinding;
            if (z9Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                z9Var5 = null;
            }
            z9Var5.P.setEnabled(true);
            this.mApplPhoto = "";
            z9 z9Var6 = this.mBinding;
            if (z9Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                z9Var6 = null;
            }
            z9Var6.P.setBackgroundResource(R.drawable.blue_drawable);
            z9 z9Var7 = this.mBinding;
            if (z9Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                z9Var7 = null;
            }
            z9Var7.O.setBackgroundResource(R.drawable.blue_drawable);
        } else {
            z9 z9Var8 = this.mBinding;
            if (z9Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                z9Var8 = null;
            }
            z9Var8.O.setClickable(false);
            z9 z9Var9 = this.mBinding;
            if (z9Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                z9Var9 = null;
            }
            z9Var9.P.setClickable(false);
            z9 z9Var10 = this.mBinding;
            if (z9Var10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                z9Var10 = null;
            }
            z9Var10.O.setEnabled(false);
            z9 z9Var11 = this.mBinding;
            if (z9Var11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                z9Var11 = null;
            }
            z9Var11.P.setEnabled(false);
            z9 z9Var12 = this.mBinding;
            if (z9Var12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                z9Var12 = null;
            }
            z9Var12.P.setBackgroundResource(R.drawable.unselected_button_grey);
            z9 z9Var13 = this.mBinding;
            if (z9Var13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                z9Var13 = null;
            }
            z9Var13.O.setBackgroundResource(R.drawable.unselected_button_grey);
            this.mApplPhoto = this.aadharPhoto;
            z9 z9Var14 = this.mBinding;
            if (z9Var14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                z9Var14 = null;
            }
            z9Var14.u0.setImageBitmap(kt6.a(this.aadharPhoto));
        }
        z9 z9Var15 = this.mBinding;
        if (z9Var15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var15 = null;
        }
        z9Var15.O.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.j93
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLPhotoSign.g2(this.a, view);
            }
        });
        z9 z9Var16 = this.mBinding;
        if (z9Var16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var16 = null;
        }
        z9Var16.P.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.r93
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLPhotoSign.o2(this.a, view);
            }
        });
        z9 z9Var17 = this.mBinding;
        if (z9Var17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var17 = null;
        }
        z9Var17.T.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.s93
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLPhotoSign.p2(this.a, view);
            }
        });
        z9 z9Var18 = this.mBinding;
        if (z9Var18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var18 = null;
        }
        z9Var18.U.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.z83
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLPhotoSign.q2(this.a, view);
            }
        });
        z9 z9Var19 = this.mBinding;
        if (z9Var19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var19 = null;
        }
        z9Var19.v0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.a93
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLPhotoSign.r2(this.a, view);
            }
        });
        z9 z9Var20 = this.mBinding;
        if (z9Var20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var20 = null;
        }
        z9Var20.I.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.b93
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLPhotoSign.s2(this.a, view);
            }
        });
        z9 z9Var21 = this.mBinding;
        if (z9Var21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var21 = null;
        }
        z9Var21.I.c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.c93
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLPhotoSign.t2(this.a, view);
            }
        });
        z9 z9Var22 = this.mBinding;
        if (z9Var22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var22 = null;
        }
        z9Var22.W.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.d93
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLPhotoSign.u2(this.a, view);
            }
        });
        z9 z9Var23 = this.mBinding;
        if (z9Var23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var23 = null;
        }
        z9Var23.w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.e93
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLPhotoSign.v2(this.a, view);
            }
        });
        z9 z9Var24 = this.mBinding;
        if (z9Var24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var24 = null;
        }
        z9Var24.x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.f93
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLPhotoSign.h2(this.a, view);
            }
        });
        z9 z9Var25 = this.mBinding;
        if (z9Var25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var25 = null;
        }
        z9Var25.y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.l93
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLPhotoSign.i2(this.a, view);
            }
        });
        z9 z9Var26 = this.mBinding;
        if (z9Var26 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var26 = null;
        }
        z9Var26.z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.m93
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLPhotoSign.j2(this.a, view);
            }
        });
        z9 z9Var27 = this.mBinding;
        if (z9Var27 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var27 = null;
        }
        z9Var27.B.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.n93
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLPhotoSign.k2(this.a, view);
            }
        });
        z9 z9Var28 = this.mBinding;
        if (z9Var28 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var28 = null;
        }
        z9Var28.A.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.o93
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLPhotoSign.l2(this.a, view);
            }
        });
        z9 z9Var29 = this.mBinding;
        if (z9Var29 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var29 = null;
        }
        z9Var29.X.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.p93
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLPhotoSign.m2(this.a, view);
            }
        });
        z9 z9Var30 = this.mBinding;
        if (z9Var30 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            z9Var = z9Var30;
        }
        z9Var.Y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.q93
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLPhotoSign.n2(this.a, view);
            }
        });
    }

    public static final void g2(LLPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.imgType = "0";
        this$0.c2();
    }

    public static final void h2(LLPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        z9 z9Var = this$0.mBinding;
        z9 z9Var2 = null;
        if (z9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var = null;
        }
        z9Var.x.setVisibility(8);
        z9 z9Var3 = this$0.mBinding;
        if (z9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var3 = null;
        }
        z9Var3.w.setVisibility(0);
        z9 z9Var4 = this$0.mBinding;
        if (z9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            z9Var2 = z9Var4;
        }
        z9Var2.J.setVisibility(8);
    }

    public static final void i2(LLPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        z9 z9Var = this$0.mBinding;
        z9 z9Var2 = null;
        if (z9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var = null;
        }
        z9Var.y.setVisibility(8);
        z9 z9Var3 = this$0.mBinding;
        if (z9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var3 = null;
        }
        z9Var3.z.setVisibility(0);
        z9 z9Var4 = this$0.mBinding;
        if (z9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            z9Var2 = z9Var4;
        }
        z9Var2.K.setVisibility(0);
    }

    public static final void j2(LLPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        z9 z9Var = this$0.mBinding;
        z9 z9Var2 = null;
        if (z9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var = null;
        }
        z9Var.z.setVisibility(8);
        z9 z9Var3 = this$0.mBinding;
        if (z9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var3 = null;
        }
        z9Var3.y.setVisibility(0);
        z9 z9Var4 = this$0.mBinding;
        if (z9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            z9Var2 = z9Var4;
        }
        z9Var2.K.setVisibility(8);
    }

    public static final void k2(LLPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        z9 z9Var = this$0.mBinding;
        z9 z9Var2 = null;
        if (z9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var = null;
        }
        z9Var.B.setVisibility(8);
        z9 z9Var3 = this$0.mBinding;
        if (z9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var3 = null;
        }
        z9Var3.A.setVisibility(0);
        z9 z9Var4 = this$0.mBinding;
        if (z9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            z9Var2 = z9Var4;
        }
        z9Var2.L.setVisibility(8);
    }

    public static final void l2(LLPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        z9 z9Var = this$0.mBinding;
        z9 z9Var2 = null;
        if (z9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var = null;
        }
        z9Var.A.setVisibility(8);
        z9 z9Var3 = this$0.mBinding;
        if (z9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var3 = null;
        }
        z9Var3.B.setVisibility(0);
        z9 z9Var4 = this$0.mBinding;
        if (z9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            z9Var2 = z9Var4;
        }
        z9Var2.L.setVisibility(0);
    }

    public static final void m2(LLPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        z9 z9Var = this$0.mBinding;
        z9 z9Var2 = null;
        if (z9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var = null;
        }
        z9Var.X.setVisibility(8);
        z9 z9Var3 = this$0.mBinding;
        if (z9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var3 = null;
        }
        z9Var3.Y.setVisibility(0);
        z9 z9Var4 = this$0.mBinding;
        if (z9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            z9Var2 = z9Var4;
        }
        z9Var2.M.setVisibility(0);
    }

    public static final void n2(LLPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        z9 z9Var = this$0.mBinding;
        z9 z9Var2 = null;
        if (z9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var = null;
        }
        z9Var.Y.setVisibility(8);
        z9 z9Var3 = this$0.mBinding;
        if (z9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var3 = null;
        }
        z9Var3.X.setVisibility(0);
        z9 z9Var4 = this$0.mBinding;
        if (z9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            z9Var2 = z9Var4;
        }
        z9Var2.M.setVisibility(8);
    }

    public static final void o2(LLPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.imgType = "0";
        this$0.W1();
    }

    public static final void p2(LLPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.imgType = VContant.MAINSCREEN;
        this$0.c2();
    }

    public static final void q2(LLPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.imgType = VContant.MAINSCREEN;
        this$0.W1();
    }

    public static final void r2(LLPhotoSign this$0, View view) {
        wm1 wm1Var;
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.a2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        if (this$0.mStatus == -1 || this$0.mApplPhoto.length() <= 0 || this$0.mApplSign.length() <= 0) {
            this$0.z2(this$0.a2().b("photo_signature", ""));
            return;
        }
        z9 z9Var = this$0.mBinding;
        if (z9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var = null;
        }
        z9Var.v0.c(true);
        wm1 wm1Var2 = this$0.viewModel;
        if (wm1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            wm1Var = null;
        } else {
            wm1Var = wm1Var2;
        }
        String str4 = this$0.mApplNo;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
            str = null;
        } else {
            str = str4;
        }
        String str5 = this$0.mApplDob;
        if (str5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
            str2 = null;
        } else {
            str2 = str5;
        }
        String str6 = this$0.stateCode;
        if (str6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateCode");
            str3 = null;
        } else {
            str3 = str6;
        }
        wm1Var.n(str, str2, str3, this$0.mApplPhoto, this$0.mApplSign, this$0.mStatus);
    }

    public static final void s2(LLPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void t2(LLPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    public static final void u2(LLPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        z9 z9Var = this$0.mBinding;
        String str = null;
        if (z9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var = null;
        }
        z9Var.W.c(true);
        wm1 wm1Var = this$0.viewModel;
        if (wm1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            wm1Var = null;
        }
        String str2 = this$0.mApplNo;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplNo");
            str2 = null;
        }
        String str3 = this$0.mApplDob;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mApplDob");
        } else {
            str = str3;
        }
        wm1Var.h(str2, str);
    }

    public static final void v2(LLPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        z9 z9Var = this$0.mBinding;
        z9 z9Var2 = null;
        if (z9Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var = null;
        }
        z9Var.w.setVisibility(8);
        z9 z9Var3 = this$0.mBinding;
        if (z9Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9Var3 = null;
        }
        z9Var3.x.setVisibility(0);
        z9 z9Var4 = this$0.mBinding;
        if (z9Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            z9Var2 = z9Var4;
        }
        z9Var2.J.setVisibility(0);
    }

    private final void x2(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.k93
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLPhotoSign.y2(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void y2(Dialog d2, LLPhotoSign this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z2(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        textView.setText(a2().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(a2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(a2().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.y83
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLPhotoSign.A2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void B2(Context context, String message) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.doc_uploading_diloge_ui);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Window window2 = dialog.getWindow();
        WindowManager.LayoutParams attributes = window2 != null ? window2.getAttributes() : null;
        if (attributes != null) {
            attributes.windowAnimations = R.style.PauseDialogAnimation;
        }
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        textView.setText(a2().b("btn_ok", "OK"));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.g93
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLPhotoSign.C2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void D2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.app_date = str;
    }

    public final void E2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void F2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lastEndorseRTOCode = str;
    }

    public final void G2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.mSessionmanger = ws6Var;
    }

    public final String X1() {
        String str = this.app_date;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("app_date");
        return null;
    }

    /* JADX INFO: renamed from: Z1, reason: from getter */
    public final of getGetDocLauncher() {
        return this.getDocLauncher;
    }

    public final wa3 a2() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final ws6 b2() {
        ws6 ws6Var = this.mSessionmanger;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSessionmanger");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dl_photo_sign);
        z9 z9VarX = z9.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(z9VarX, "inflate(...)");
        this.mBinding = z9VarX;
        if (z9VarX == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            z9VarX = null;
        }
        setContentView(z9VarX.m());
        G2(new ws6(this));
        E2(new wa3(this));
        d2();
        e2();
        f2();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 222) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                return;
            }
            Toast.makeText(this, a2().b("go_settings", ""), 0).show();
            return;
        }
        if (requestCode != 1001) {
            return;
        }
        if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
            return;
        }
        Toast.makeText(this, a2().b("per_denied", getString(R.string.permission)), 0).show();
    }

    public final void w2(Integer acCd) {
        if (acCd != null && acCd.intValue() == 135) {
            M2();
            return;
        }
        if (acCd != null && acCd.intValue() == 134) {
            K2();
            return;
        }
        if (acCd != null && acCd.intValue() == 123) {
            J2();
            return;
        }
        if ((acCd != null && acCd.intValue() == 371) || (acCd != null && acCd.intValue() == 132)) {
            N2();
        } else if (acCd != null && acCd.intValue() == 455) {
            x2(a2().b("label_e_sign", getString(R.string.esign)));
        }
    }
}
