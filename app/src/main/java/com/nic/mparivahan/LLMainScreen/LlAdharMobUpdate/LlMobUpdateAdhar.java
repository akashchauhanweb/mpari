package com.nic.mparivahan.LLMainScreen.LlAdharMobUpdate;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.Html;
import android.text.InputFilter;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.z;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycModel.ApiMessage;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycModel.Data;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycModel.eKycResponse;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse.DOAadhaarResponse;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse.DOEkyc;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse.EkycVerifyResponse;
import com.nic.mparivahan.DLServicesAuth.eKyc.AdharKyc.AdrInterface;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.DOAuthOTP;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.DOEkycX;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.OtpAdharRes;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.TokenGeneration;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.UserFullDetails;
import com.nic.mparivahan.LLMainScreen.LlAdharMobUpdate.LlMobUpdateAdhar;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.Aadarkyc;
import com.nic.mparivahan.VahanEkyc.AadarkycVerify;
import com.nic.mparivahan.VahanEkyc.EkYCService;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.zepto.aj5;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.kt6;
import com.zepto.ld7;
import com.zepto.lr1;
import com.zepto.mf4;
import com.zepto.ml;
import com.zepto.nr1;
import com.zepto.o40;
import com.zepto.ol;
import com.zepto.pl;
import com.zepto.qi5;
import com.zepto.rq1;
import com.zepto.vh7;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.ws6;
import com.zepto.yi5;
import com.zepto.zc;
import com.zepto.zi5;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0016\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\rJ\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rR\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010>\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010B\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u00109\u001a\u0004\b@\u0010;\"\u0004\bA\u0010=R\"\u0010F\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u00109\u001a\u0004\bD\u0010;\"\u0004\bE\u0010=R\"\u0010J\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u00109\u001a\u0004\bH\u0010;\"\u0004\bI\u0010=R\"\u0010N\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u00109\u001a\u0004\bL\u0010;\"\u0004\bM\u0010=R\"\u0010R\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u00109\u001a\u0004\bP\u0010;\"\u0004\bQ\u0010=R\"\u0010V\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u00109\u001a\u0004\bT\u0010;\"\u0004\bU\u0010=RF\u0010_\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r0Wj\u0012\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r`X8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010f\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010n\u001a\u00020g8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010v\u001a\u00020o8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010~\u001a\u00020w8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R)\u0010\u0086\u0001\u001a\u00020\u007f8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R*\u0010\u008e\u0001\u001a\u00030\u0087\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R*\u0010\u0096\u0001\u001a\u00030\u008f\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R*\u0010\u009e\u0001\u001a\u00030\u0097\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R*\u0010¦\u0001\u001a\u00030\u009f\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R&\u0010ª\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b§\u0001\u00109\u001a\u0005\b¨\u0001\u0010;\"\u0005\b©\u0001\u0010=R*\u0010²\u0001\u001a\u00030«\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R*\u0010º\u0001\u001a\u00030³\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001R*\u0010Â\u0001\u001a\u00030»\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001R\u0018\u0010Ä\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÃ\u0001\u00109R\u0018\u0010Æ\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÅ\u0001\u00109R\u0018\u0010È\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÇ\u0001\u00109R\u0018\u0010Ê\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÉ\u0001\u00109R\u001a\u0010Î\u0001\u001a\u00030Ë\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001¨\u0006Ñ\u0001"}, d2 = {"Lcom/nic/mparivahan/LLMainScreen/LlAdharMobUpdate/LlMobUpdateAdhar;", "Lcom/zepto/o40;", "", "B2", "U1", "f2", "i2", "A2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "L2", "mobile_no", "j3", "aadhaarNumber", "l2", "Lcom/zepto/zc;", "F", "Lcom/zepto/zc;", "n2", "()Lcom/zepto/zc;", "Q2", "(Lcom/zepto/zc;)V", "binding", "Landroid/app/Dialog;", "G", "Landroid/app/Dialog;", "dial", "Lcom/zepto/wl5;", "H", "Lcom/zepto/wl5;", "y2", "()Lcom/zepto/wl5;", "f3", "(Lcom/zepto/wl5;)V", "sarthiSession", "Lcom/zepto/ws6;", "I", "Lcom/zepto/ws6;", "getSessionManager", "()Lcom/zepto/ws6;", "g3", "(Lcom/zepto/ws6;)V", "sessionManager", "Lcom/zepto/wa3;", "J", "Lcom/zepto/wa3;", "o2", "()Lcom/zepto/wa3;", "U2", "(Lcom/zepto/wa3;)V", "langSession", "K", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "type", "L", "z2", "h3", "txnNo", "M", "getAddress", "P2", "address", "N", "getEKYCId", "setEKYCId", "eKYCId", "O", "getEPhoto", "T2", "ePhoto", "P", "getEKYCGender", "S2", "eKYCGender", "Q", "getOwner_name_addhaar", "a3", "owner_name_addhaar", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "R", "Ljava/util/HashMap;", "getWhatServiceRequired", "()Ljava/util/HashMap;", "setWhatServiceRequired", "(Ljava/util/HashMap;)V", "whatServiceRequired", "S", "Landroid/content/Context;", "s2", "()Landroid/content/Context;", "Y2", "(Landroid/content/Context;)V", "mContext", "Landroid/app/ProgressDialog;", "T", "Landroid/app/ProgressDialog;", "u2", "()Landroid/app/ProgressDialog;", "b3", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/aj5;", "U", "Lcom/zepto/aj5;", "t2", "()Lcom/zepto/aj5;", "Z2", "(Lcom/zepto/aj5;)V", "mView", "Lcom/nic/mparivahan/VahanEkyc/EkYCService;", "V", "Lcom/nic/mparivahan/VahanEkyc/EkYCService;", "x2", "()Lcom/nic/mparivahan/VahanEkyc/EkYCService;", "e3", "(Lcom/nic/mparivahan/VahanEkyc/EkYCService;)V", "retrofitService_one", "Lcom/zepto/ml;", "W", "Lcom/zepto/ml;", "r2", "()Lcom/zepto/ml;", "X2", "(Lcom/zepto/ml;)V", "mAadharViewModel2", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/AdharKyc/AdrInterface;", "X", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/AdharKyc/AdrInterface;", "q2", "()Lcom/nic/mparivahan/DLServicesAuth/eKyc/AdharKyc/AdrInterface;", "W2", "(Lcom/nic/mparivahan/DLServicesAuth/eKyc/AdharKyc/AdrInterface;)V", "mAadharInterface2", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "Y", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "w2", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "d3", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitServiceVahan", "Lcom/zepto/ld7;", "Z", "Lcom/zepto/ld7;", "getViewModelv1", "()Lcom/zepto/ld7;", "i3", "(Lcom/zepto/ld7;)V", "viewModelv1", "Lcom/nic/mparivahan/VahanEkyc/Aadarkyc$DOEkyc;", "a0", "Lcom/nic/mparivahan/VahanEkyc/Aadarkyc$DOEkyc;", "m2", "()Lcom/nic/mparivahan/VahanEkyc/Aadarkyc$DOEkyc;", "N2", "(Lcom/nic/mparivahan/VahanEkyc/Aadarkyc$DOEkyc;)V", "aadhaarData", "b0", "getAadhaarLastFourDigitMobileNo", "O2", "aadhaarLastFourDigitMobileNo", "Lcom/zepto/nr1;", "c0", "Lcom/zepto/nr1;", "getDlServicesViewModel", "()Lcom/zepto/nr1;", "R2", "(Lcom/zepto/nr1;)V", "dlServicesViewModel", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "d0", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "v2", "()Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "c3", "(Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;)V", "retrofitService", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "e0", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "p2", "()Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "V2", "(Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;)V", "llDetails", "f0", "tokenAdhar", "g0", "traceId", "h0", "tokenService", "i0", "nk", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkycX;", "j0", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkycX;", "adharData", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class LlMobUpdateAdhar extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public zc binding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public Dialog dial;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String txnNo;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public aj5 mView;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public EkYCService retrofitService_one;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public ml mAadharViewModel2;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public AdrInterface mAadharInterface2;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public VahanProService retrofitServiceVahan;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public ld7 viewModelv1;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public Aadarkyc.DOEkyc aadhaarData;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public nr1 dlServicesViewModel;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public DlServiceInt retrofitService;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public FetchLlDetails llDetails;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public DOEkycX adharData;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String type = "A";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String address = "NA";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String eKYCId = "NA";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String ePhoto = "NA";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String eKYCGender = "NA";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String owner_name_addhaar = "NA";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public HashMap whatServiceRequired = new HashMap();

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String aadhaarLastFourDigitMobileNo = "";

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public String tokenAdhar = "";

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public String traceId = "";

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public String tokenService = "";

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public String nk = "";

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
        public final void a(OtpAdharRes otpAdharRes) {
            LlMobUpdateAdhar.this.u2().cancel();
            try {
                if (!StringsKt__StringsJVMKt.equals(otpAdharRes.getStatus(), "Success", true)) {
                    LlMobUpdateAdhar llMobUpdateAdhar = LlMobUpdateAdhar.this;
                    llMobUpdateAdhar.L2(llMobUpdateAdhar, "Unable to process the request, Please try after some time");
                    return;
                }
                LlMobUpdateAdhar.this.h3(StringsKt__StringsKt.trim((CharSequence) otpAdharRes.getTxnNo()).toString());
                LlMobUpdateAdhar llMobUpdateAdhar2 = LlMobUpdateAdhar.this;
                DOAuthOTP dOAuthOTP = otpAdharRes.getDOAuthOTP();
                llMobUpdateAdhar2.O2(String.valueOf(dOAuthOTP != null ? dOAuthOTP.getLast_four_mobile() : null));
                LlMobUpdateAdhar llMobUpdateAdhar3 = LlMobUpdateAdhar.this;
                llMobUpdateAdhar3.j3(llMobUpdateAdhar3, otpAdharRes.getDOAuthOTP().getLast_four_mobile());
            } catch (Exception unused) {
                LlMobUpdateAdhar llMobUpdateAdhar4 = LlMobUpdateAdhar.this;
                llMobUpdateAdhar4.L2(llMobUpdateAdhar4, "Unable to process the request, Please try after some time");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OtpAdharRes) obj);
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
            LlMobUpdateAdhar.this.u2().cancel();
            LlMobUpdateAdhar llMobUpdateAdhar = LlMobUpdateAdhar.this;
            llMobUpdateAdhar.L2(llMobUpdateAdhar, "Unable to process the request, Please try after some time");
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
        public final void a(UserFullDetails userFullDetails) {
            try {
                Log.d("userDetails_api", userFullDetails.toString());
                if (!StringsKt__StringsJVMKt.equals(userFullDetails.getStatus(), "Y", true)) {
                    LlMobUpdateAdhar.this.u2().dismiss();
                    LlMobUpdateAdhar llMobUpdateAdhar = LlMobUpdateAdhar.this;
                    llMobUpdateAdhar.L2(llMobUpdateAdhar, "Unable to proceed your request, Please try after some time");
                    return;
                }
                LlMobUpdateAdhar.this.adharData = userFullDetails.getDOEkyc();
                LlMobUpdateAdhar llMobUpdateAdhar2 = LlMobUpdateAdhar.this;
                DOEkycX dOEkycX = llMobUpdateAdhar2.adharData;
                Dialog dialog = null;
                if (dOEkycX == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adharData");
                    dOEkycX = null;
                }
                llMobUpdateAdhar2.S2(StringsKt__StringsKt.trim((CharSequence) dOEkycX.getGender()).toString());
                LlMobUpdateAdhar llMobUpdateAdhar3 = LlMobUpdateAdhar.this;
                DOEkycX dOEkycX2 = llMobUpdateAdhar3.adharData;
                if (dOEkycX2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adharData");
                    dOEkycX2 = null;
                }
                llMobUpdateAdhar3.T2(StringsKt__StringsKt.trim((CharSequence) dOEkycX2.getPht()).toString());
                Dialog dialog2 = LlMobUpdateAdhar.this.dial;
                if (dialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dial");
                    dialog2 = null;
                }
                if (dialog2.isShowing()) {
                    Dialog dialog3 = LlMobUpdateAdhar.this.dial;
                    if (dialog3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dial");
                    } else {
                        dialog = dialog3;
                    }
                    dialog.dismiss();
                }
                LlMobUpdateAdhar.this.f2();
            } catch (Exception unused) {
                LlMobUpdateAdhar.this.u2().dismiss();
                LlMobUpdateAdhar llMobUpdateAdhar4 = LlMobUpdateAdhar.this;
                llMobUpdateAdhar4.L2(llMobUpdateAdhar4, "Unable to proceed your request, Please try after some time");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((UserFullDetails) obj);
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
            LlMobUpdateAdhar.this.u2().dismiss();
            LlMobUpdateAdhar llMobUpdateAdhar = LlMobUpdateAdhar.this;
            llMobUpdateAdhar.L2(llMobUpdateAdhar, "Unable to proceed your request, Please try after some time");
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
        public final void a(AadarkycVerify.Response response) {
            AadarkycVerify.dOEkyc dOAuthOTP;
            String last_four_mobile;
            Log.e("response_1", response.toString());
            LlMobUpdateAdhar.this.u2().dismiss();
            AadarkycVerify.DoAadhaarResponse doAadhaarResponse = response.getDoAadhaarResponse();
            if (String.valueOf(doAadhaarResponse != null ? doAadhaarResponse.getStatus() : null).length() == 0) {
                return;
            }
            try {
                Log.e("CCTVlOGE", VContant.MAINSCREEN);
                if (doAadhaarResponse != null && (dOAuthOTP = doAadhaarResponse.getDOAuthOTP()) != null && Intrinsics.areEqual(dOAuthOTP.getMobileverify(), Boolean.TRUE)) {
                    AadarkycVerify.dOEkyc dOAuthOTP2 = doAadhaarResponse.getDOAuthOTP();
                    String last_four_mobile2 = dOAuthOTP2 != null ? dOAuthOTP2.getLast_four_mobile() : null;
                    if (last_four_mobile2 != null && last_four_mobile2.length() != 0) {
                        AadarkycVerify.dOEkyc dOAuthOTP3 = doAadhaarResponse.getDOAuthOTP();
                        if (StringsKt__StringsJVMKt.equals(dOAuthOTP3 != null ? dOAuthOTP3.getStatus() : null, "success", true)) {
                            Log.e("CCTVlOGE", VContant.APPLICATION_SCREEN);
                            AadarkycVerify.dOEkyc dOAuthOTP4 = doAadhaarResponse.getDOAuthOTP();
                            if (dOAuthOTP4 == null || (last_four_mobile = dOAuthOTP4.getLast_four_mobile()) == null || last_four_mobile.length() != 4) {
                                return;
                            }
                            LlMobUpdateAdhar.this.h3(String.valueOf(doAadhaarResponse.getTxnNo()));
                            String txnNo = LlMobUpdateAdhar.this.getTxnNo();
                            Intrinsics.checkNotNull(txnNo);
                            Log.d("txnNo", txnNo);
                            LlMobUpdateAdhar llMobUpdateAdhar = LlMobUpdateAdhar.this;
                            AadarkycVerify.dOEkyc dOAuthOTP5 = doAadhaarResponse.getDOAuthOTP();
                            llMobUpdateAdhar.O2(String.valueOf(dOAuthOTP5 != null ? dOAuthOTP5.getLast_four_mobile() : null));
                            LlMobUpdateAdhar llMobUpdateAdhar2 = LlMobUpdateAdhar.this;
                            AadarkycVerify.dOEkyc dOAuthOTP6 = doAadhaarResponse.getDOAuthOTP();
                            llMobUpdateAdhar2.j3(llMobUpdateAdhar2, String.valueOf(dOAuthOTP6 != null ? dOAuthOTP6.getLast_four_mobile() : null));
                            return;
                        }
                    }
                }
                Log.e("CCTVlOGE", "3");
                String reason = doAadhaarResponse != null ? doAadhaarResponse.getReason() : null;
                if (reason != null && reason.length() != 0) {
                    Log.v("reason fail", String.valueOf(doAadhaarResponse != null ? doAadhaarResponse.getReason() : null));
                    if (StringsKt__StringsKt.contains((CharSequence) String.valueOf(doAadhaarResponse != null ? doAadhaarResponse.getReason() : null), (CharSequence) "Invalid Auth Xml Format", true)) {
                        LlMobUpdateAdhar llMobUpdateAdhar3 = LlMobUpdateAdhar.this;
                        llMobUpdateAdhar3.L2(llMobUpdateAdhar3, "Invalid Aadhaar No.\nPlease try again");
                        return;
                    } else {
                        LlMobUpdateAdhar llMobUpdateAdhar4 = LlMobUpdateAdhar.this;
                        llMobUpdateAdhar4.L2(llMobUpdateAdhar4, String.valueOf(doAadhaarResponse != null ? doAadhaarResponse.getReason() : null));
                        return;
                    }
                }
                LlMobUpdateAdhar llMobUpdateAdhar5 = LlMobUpdateAdhar.this;
                llMobUpdateAdhar5.L2(llMobUpdateAdhar5, llMobUpdateAdhar5.o2().b("service_is_not_present", LlMobUpdateAdhar.this.getString(R.string.unable_to_get_details)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AadarkycVerify.Response) obj);
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
            Log.e("response_2", str.toString());
            LlMobUpdateAdhar.this.u2().dismiss();
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
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
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(com.nic.mparivahan.VahanEkyc.Aadarkyc.Response r7) {
            /*
                Method dump skipped, instruction units count: 498
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.LLMainScreen.LlAdharMobUpdate.LlMobUpdateAdhar.g.a(com.nic.mparivahan.VahanEkyc.Aadarkyc$Response):void");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Aadarkyc.Response) obj);
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
            if (LlMobUpdateAdhar.this.u2().isShowing()) {
                LlMobUpdateAdhar.this.u2().dismiss();
            }
            LlMobUpdateAdhar llMobUpdateAdhar = LlMobUpdateAdhar.this;
            llMobUpdateAdhar.L2(llMobUpdateAdhar, llMobUpdateAdhar.o2().b("service_is_not_present", LlMobUpdateAdhar.this.getString(R.string.unable_to_get_details)));
        }
    }

    public static final class i extends Lambda implements Function1 {
        public i() {
            super(1);
        }

        public final void a(TokenGeneration tokenGeneration) {
            try {
                if (StringsKt__StringsJVMKt.equals(tokenGeneration.getStatus(), "Success", true)) {
                    LlMobUpdateAdhar.this.tokenAdhar = tokenGeneration.getAuthorization();
                    LlMobUpdateAdhar.this.traceId = tokenGeneration.getTraceId();
                    LlMobUpdateAdhar.this.tokenService = tokenGeneration.getServiceId();
                }
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((TokenGeneration) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class j implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public j(Function1 function) {
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

    public static final class k extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ TextView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(TextView textView, TextView textView2) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = textView2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.b.setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.a.setText("Time remaining : " + (j / ((long) 1000)));
            this.b.setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    public static final class l extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ TextView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(TextView textView, TextView textView2) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = textView2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.b.setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.a.setText("Time remaining : " + (j / ((long) 1000)));
            this.b.setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    private final void A2() {
        g3(new ws6(this));
        U2(new wa3(this));
        e3(EkYCService.INSTANCE.a(this));
        d3(VahanProService.INSTANCE.a(this));
        b3(new ProgressDialog(this));
        u2().setMessage(o2().b("label_challan_please_wait", "Please wait..."));
        u2().setCancelable(false);
        u2().setCanceledOnTouchOutside(false);
        if (getIntent() != null) {
            Serializable serializableExtra = getIntent().getSerializableExtra("LLDetails");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails");
            V2((FetchLlDetails) serializableExtra);
        }
        n2().l.setText(StringsKt__StringsKt.trim((CharSequence) p2().getLearningLicence()).toString());
        c3(DlServiceInt.INSTANCE.a(s2()));
        R2((nr1) new z(this, new rq1(new lr1(v2(), this))).a(nr1.class));
        Z2((aj5) new z(this, new zi5(new yi5(x2()))).a(aj5.class));
        i3((ld7) new z(this, new kd7(new jd7(w2()))).a(ld7.class));
        W2(AdrInterface.INSTANCE.a(s2()));
        X2((ml) new z(this, new ol(new pl(q2()))).a(ml.class));
        n2().l.setText(StringsKt__StringsKt.trim((CharSequence) p2().getLearningLicence()).toString());
        n2().i.g.setText(y2().k());
    }

    private final void B2() {
        r2().i().g(this, new j(new e()));
        r2().j().g(this, new j(new f()));
        r2().k().g(this, new j(new g()));
        r2().j().g(this, new j(new h()));
        t2().j().g(this, new mf4() { // from class: com.zepto.zi3
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                LlMobUpdateAdhar.C2(this.a, (eKycResponse) obj);
            }
        });
        t2().i().g(this, new mf4() { // from class: com.zepto.aj3
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                LlMobUpdateAdhar.D2(this.a, (String) obj);
            }
        });
        t2().h().g(this, new mf4() { // from class: com.zepto.bj3
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                LlMobUpdateAdhar.E2(this.a, (EkycVerifyResponse) obj);
            }
        });
        t2().g().g(this, new mf4() { // from class: com.zepto.cj3
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                LlMobUpdateAdhar.F2(this.a, (String) obj);
            }
        });
        r2().m().g(this, new j(new i()));
        r2().g().g(this, new j(new a()));
        r2().h().g(this, new j(new b()));
        r2().n().g(this, new j(new c()));
        r2().l().g(this, new j(new d()));
    }

    public static final void C2(LlMobUpdateAdhar this$0, eKycResponse ekycresponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.u2().dismiss();
        Log.d("adhar_resp", ekycresponse.toString());
        try {
            ApiMessage apiMessage = ekycresponse.getApiMessage();
            if (apiMessage == null || apiMessage.getStatusCode() != 200) {
                ApiMessage apiMessage2 = ekycresponse.getApiMessage();
                this$0.L2(this$0, String.valueOf(apiMessage2 != null ? apiMessage2.getDeveloperMessage() : null));
                return;
            }
            Data data = ekycresponse.getData();
            String strValueOf = String.valueOf(data != null ? data.getTxNo() : null);
            this$0.txnNo = strValueOf;
            Intrinsics.checkNotNull(strValueOf);
            if (strValueOf.length() > 23) {
                String str = this$0.txnNo;
                Intrinsics.checkNotNull(str);
                if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "T", false, 2, (Object) null)) {
                    String str2 = this$0.txnNo;
                    Intrinsics.checkNotNull(str2);
                    String strSubstring = str2.substring(0, 23);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    this$0.txnNo = strSubstring;
                    Intrinsics.checkNotNull(strSubstring);
                    this$0.txnNo = StringsKt__StringsJVMKt.replace$default(strSubstring, "T", " ", false, 4, (Object) null);
                    Date date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS").parse(this$0.txnNo);
                    Intrinsics.checkNotNull(date, "null cannot be cast to non-null type java.util.Date");
                    String string = Long.toString(date.getTime() / 1000);
                    Intrinsics.checkNotNull(string);
                    String strValueOf2 = String.valueOf(Long.parseLong(string) * ((long) 1000));
                    this$0.txnNo = strValueOf2;
                    Log.e("time_Stamp_value", String.valueOf(strValueOf2));
                }
            }
            vh7 vh7Var = new vh7(this$0);
            Data data2 = ekycresponse.getData();
            vh7Var.f(String.valueOf(data2 != null ? data2.getTxNo() : null));
            Data data3 = ekycresponse.getData();
            this$0.j3(this$0, String.valueOf(data3 != null ? data3.getLastFourMobileNumber() : null));
        } catch (Exception unused) {
            this$0.L2(this$0, "Unable to process the request, Please try after some time");
        }
    }

    public static final void D2(LlMobUpdateAdhar this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.u2().dismiss();
        this$0.L2(this$0, "Unable to process the request, Please try after some time");
    }

    public static final void E2(LlMobUpdateAdhar this$0, EkycVerifyResponse ekycVerifyResponse) {
        DOEkyc dOEkyc;
        DOEkyc dOEkyc2;
        DOEkyc dOEkyc3;
        DOEkyc dOEkyc4;
        DOEkyc dOEkyc5;
        DOEkyc dOEkyc6;
        DOEkyc dOEkyc7;
        DOEkyc dOEkyc8;
        DOEkyc dOEkyc9;
        DOEkyc dOEkyc10;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Log.d("ekycVerifyResSarathi", ekycVerifyResponse.toString());
        try {
            com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse.Data data = ekycVerifyResponse.getData();
            DOAadhaarResponse dOAadhaarResponse = data != null ? data.getDOAadhaarResponse() : null;
            if (String.valueOf(dOAadhaarResponse != null ? dOAadhaarResponse.getStatus() : null).length() != 0) {
                if (StringsKt__StringsJVMKt.equals(String.valueOf(dOAadhaarResponse != null ? dOAadhaarResponse.getStatus() : null), "Y", true)) {
                    try {
                        vh7 vh7Var = new vh7(this$0);
                        String str = this$0.txnNo;
                        Intrinsics.checkNotNull(str);
                        vh7Var.f(str);
                        if (String.valueOf((dOAadhaarResponse == null || (dOEkyc10 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc10.getName()).length() != 0) {
                            this$0.owner_name_addhaar = String.valueOf((dOAadhaarResponse == null || (dOEkyc = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc.getName());
                        }
                        if (String.valueOf((dOAadhaarResponse == null || (dOEkyc9 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc9.getGender()).length() != 0) {
                            this$0.eKYCGender = String.valueOf((dOAadhaarResponse == null || (dOEkyc2 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc2.getGender());
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append((dOAadhaarResponse == null || (dOEkyc8 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc8.getHouse());
                        sb.append(' ');
                        sb.append((dOAadhaarResponse == null || (dOEkyc7 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc7.getStreet());
                        sb.append(' ');
                        sb.append((dOAadhaarResponse == null || (dOEkyc6 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc6.getLocalityIfAny());
                        sb.append(' ');
                        sb.append((dOAadhaarResponse == null || (dOEkyc5 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc5.getDist());
                        sb.append(' ');
                        sb.append((dOAadhaarResponse == null || (dOEkyc4 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc4.getState());
                        sb.append(' ');
                        if (dOAadhaarResponse != null && (dOEkyc3 = dOAadhaarResponse.getDOEkyc()) != null) {
                            objValueOf = Integer.valueOf(dOEkyc3.getPincode());
                        }
                        sb.append(objValueOf);
                        this$0.address = sb.toString();
                        return;
                    } catch (Exception e2) {
                        this$0.u2().dismiss();
                        e2.printStackTrace();
                        return;
                    }
                }
            }
            this$0.u2().dismiss();
            String reason = dOAadhaarResponse != null ? dOAadhaarResponse.getReason() : null;
            if (reason != null && reason.length() != 0) {
                this$0.L2(this$0, String.valueOf(dOAadhaarResponse != null ? dOAadhaarResponse.getReason() : null));
                return;
            }
            this$0.L2(this$0, "Unable to verify the request, Please try after some time");
        } catch (Exception unused) {
        }
    }

    public static final void F2(LlMobUpdateAdhar this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.u2().dismiss();
    }

    public static final void G2(LlMobUpdateAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void H2(LlMobUpdateAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void I2(LlMobUpdateAdhar this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.n2().o.setChecked(false);
            this$0.n2().b.setChecked(true);
            this$0.n2().g.setHint("Enter Aadhaar Number");
            this$0.n2().g.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(12)});
            this$0.n2().c.setText(Html.fromHtml("I have read and agree to <font color=\"#008ed8\"><b><u>Aadhaar based e-KYC consent</u></b></font>"));
            this$0.type = "A";
        }
    }

    public static final void J2(LlMobUpdateAdhar this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.n2().b.setChecked(false);
            this$0.n2().o.setChecked(true);
            this$0.n2().g.setHint("Enter VID Number");
            this$0.n2().g.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(16)});
            this$0.n2().c.setText(Html.fromHtml("I have read and agree to <font color=\"#008ed8\"><b><u>VID based e-KYC consent</u></b></font>"));
            this$0.type = "V";
        }
    }

    public static final void K2(LlMobUpdateAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.n2().g.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            this$0.n2().k.setImageResource(R.drawable.pass_visible);
            this$0.n2().g.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            this$0.n2().k.setImageResource(R.drawable.mvvm_visibility);
            this$0.n2().g.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U1() {
        final Dialog dialog = new Dialog(s2());
        dialog.setContentView(R.layout.user_adhar_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.txt_dl_holder_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        AppCompatTextView appCompatTextView = (AppCompatTextView) viewFindViewById;
        View viewFindViewById2 = dialog.findViewById(R.id.txt_dob_value);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.txt_relation);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.txt_gender);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        AppCompatTextView appCompatTextView4 = (AppCompatTextView) viewFindViewById4;
        View viewFindViewById5 = dialog.findViewById(R.id.close_request);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        CustomWegetLayout customWegetLayout = (CustomWegetLayout) viewFindViewById5;
        View viewFindViewById6 = dialog.findViewById(R.id.next_request);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        CustomWegetLayout customWegetLayout2 = (CustomWegetLayout) viewFindViewById6;
        View viewFindViewById7 = dialog.findViewById(R.id.iv_report_traffic_violation_icon_in);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById7;
        View viewFindViewById8 = dialog.findViewById(R.id.round_card_view_in);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        CardView cardView = (CardView) viewFindViewById8;
        View viewFindViewById9 = dialog.findViewById(R.id.txt_dl_no);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById9;
        try {
            String name = m2().getName();
            Intrinsics.checkNotNull(name);
            appCompatTextView.setText(StringsKt__StringsKt.trim((CharSequence) name).toString());
            appCompatTextView2.setText(m2().getDob());
            appCompatTextView3.setText(StringsKt__StringsKt.trim((CharSequence) m2().getCareOf()).toString());
            if (Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) m2().getGender()).toString(), "M")) {
                appCompatTextView4.setText("Male");
            } else {
                appCompatTextView4.setText("Female");
            }
            textView.setText("Ll No. " + StringsKt__StringsKt.trim((CharSequence) p2().getLearningLicence()).toString());
            String pht = m2().getPht();
            if (pht == null || pht.length() == 0 || Intrinsics.areEqual(m2().getPht(), "")) {
                cardView.setVisibility(8);
            } else {
                cardView.setVisibility(0);
                imageView.setImageBitmap(kt6.a(m2().getPht()));
            }
        } catch (Exception unused) {
        }
        customWegetLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ni3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlMobUpdateAdhar.W1(dialog, this, view);
            }
        });
        customWegetLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.oi3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlMobUpdateAdhar.V1(dialog, view);
            }
        });
        dialog.show();
    }

    public static final void V1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void W1(Dialog d2, LlMobUpdateAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        try {
            Intent intent = new Intent(this$0.s2(), (Class<?>) LlConfirmMobNo.class);
            intent.putExtra("LLDetails", this$0.p2());
            intent.putExtra("aadharData", this$0.m2());
            intent.putExtra("aadhaarLastFourDigitMobileNo", this$0.aadhaarLastFourDigitMobileNo);
            this$0.startActivity(intent);
            this$0.finish();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f2() {
        final Dialog dialog = new Dialog(s2());
        dialog.setContentView(R.layout.user_adhar_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.txt_dl_holder_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        AppCompatTextView appCompatTextView = (AppCompatTextView) viewFindViewById;
        View viewFindViewById2 = dialog.findViewById(R.id.txt_dob_value);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.txt_relation);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.txt_gender);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        AppCompatTextView appCompatTextView4 = (AppCompatTextView) viewFindViewById4;
        View viewFindViewById5 = dialog.findViewById(R.id.close_request);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        CustomWegetLayout customWegetLayout = (CustomWegetLayout) viewFindViewById5;
        View viewFindViewById6 = dialog.findViewById(R.id.next_request);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        CustomWegetLayout customWegetLayout2 = (CustomWegetLayout) viewFindViewById6;
        View viewFindViewById7 = dialog.findViewById(R.id.iv_report_traffic_violation_icon_in);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById7;
        View viewFindViewById8 = dialog.findViewById(R.id.round_card_view_in);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        CardView cardView = (CardView) viewFindViewById8;
        View viewFindViewById9 = dialog.findViewById(R.id.txt_dl_no);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById9;
        try {
            DOEkycX dOEkycX = this.adharData;
            DOEkycX dOEkycX2 = null;
            if (dOEkycX == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX = null;
            }
            String name = dOEkycX.getName();
            Intrinsics.checkNotNull(name);
            appCompatTextView.setText(StringsKt__StringsKt.trim((CharSequence) name).toString());
            DOEkycX dOEkycX3 = this.adharData;
            if (dOEkycX3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX3 = null;
            }
            appCompatTextView2.setText(dOEkycX3.getDob());
            DOEkycX dOEkycX4 = this.adharData;
            if (dOEkycX4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX4 = null;
            }
            appCompatTextView3.setText(StringsKt__StringsKt.trim((CharSequence) dOEkycX4.getCareOf()).toString());
            DOEkycX dOEkycX5 = this.adharData;
            if (dOEkycX5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX5 = null;
            }
            if (Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) dOEkycX5.getGender()).toString(), "M")) {
                appCompatTextView4.setText("Male");
            } else {
                appCompatTextView4.setText("Female");
            }
            textView.setText("Ll No. " + StringsKt__StringsKt.trim((CharSequence) p2().getLearningLicence()).toString());
            DOEkycX dOEkycX6 = this.adharData;
            if (dOEkycX6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX6 = null;
            }
            String pht = dOEkycX6.getPht();
            if (pht == null || pht.length() == 0) {
                cardView.setVisibility(8);
            } else {
                DOEkycX dOEkycX7 = this.adharData;
                if (dOEkycX7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adharData");
                } else {
                    dOEkycX2 = dOEkycX7;
                }
                if (Intrinsics.areEqual(dOEkycX2.getPht(), "")) {
                    cardView.setVisibility(8);
                } else {
                    cardView.setVisibility(0);
                    imageView.setImageBitmap(kt6.a(m2().getPht()));
                }
            }
        } catch (Exception unused) {
        }
        customWegetLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.li3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlMobUpdateAdhar.g2(dialog, this, view);
            }
        });
        customWegetLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mi3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlMobUpdateAdhar.h2(dialog, view);
            }
        });
        dialog.show();
    }

    public static final void g2(Dialog d2, LlMobUpdateAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        try {
            Intent intent = new Intent(this$0.s2(), (Class<?>) LlConfirmMobNo.class);
            intent.putExtra("LLDetails", this$0.p2());
            DOEkycX dOEkycX = this$0.adharData;
            if (dOEkycX == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX = null;
            }
            intent.putExtra("aadharData", dOEkycX);
            intent.putExtra("aadhaarLastFourDigitMobileNo", this$0.aadhaarLastFourDigitMobileNo);
            this$0.startActivity(intent);
            this$0.finish();
        } catch (Exception unused) {
        }
    }

    public static final void h2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void i2() {
        n2().m.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dj3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlMobUpdateAdhar.j2(this.a, view);
            }
        });
        n2().n.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ji3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlMobUpdateAdhar.k2(this.a, view);
            }
        });
    }

    public static final void j2(LlMobUpdateAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.n2().g.getText().clear();
    }

    public static final void k2(LlMobUpdateAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Editable text = this$0.n2().g.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0 && this$0.n2().b.isChecked()) {
            this$0.L2(this$0, "Please enter the Aadhaar Number");
            return;
        }
        if (this$0.n2().g.getText().length() < 12 && this$0.n2().b.isChecked()) {
            this$0.L2(this$0, "Please enter the valid Aadhaar Number");
            return;
        }
        if (this$0.n2().g.getText().length() > 12 && this$0.n2().b.isChecked()) {
            this$0.L2(this$0, "Please enter the valid Aadhaar Number");
            return;
        }
        Editable text2 = this$0.n2().g.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        if (text2.length() == 0 && this$0.n2().o.isChecked()) {
            this$0.L2(this$0, "Please enter the Virtual Id");
            return;
        }
        if (this$0.n2().g.getText().length() < 16 && this$0.n2().o.isChecked()) {
            this$0.L2(this$0, "Please enter the valid Virtual Id");
            return;
        }
        if (!this$0.n2().e.isChecked() && this$0.n2().o.isChecked()) {
            this$0.L2(this$0, "Please agree with VID based e-KYC consent");
            return;
        }
        if (!this$0.n2().e.isChecked() && this$0.n2().b.isChecked()) {
            this$0.L2(this$0, "Please agree with Aadhaar based e-KYC consent");
            return;
        }
        this$0.u2().show();
        int iNextInt = new Random().nextInt(1410065407);
        String string = StringsKt__StringsKt.trim((CharSequence) this$0.n2().g.getText().toString()).toString();
        Charset charsetForName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
        byte[] bytes = string.getBytes(charsetForName);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        Base64.encodeToString(bytes, 0);
        String strC = qi5.a.c(this$0);
        Intrinsics.checkNotNull(strC);
        this$0.nk = strC;
        this$0.r2().o(this$0.l2(StringsKt__StringsKt.trim((CharSequence) this$0.n2().g.getText().toString()).toString()), "sarEtrans25Ms", this$0.nk, String.valueOf(iNextInt));
    }

    public static final void k3(LlMobUpdateAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.dial;
        if (dialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dial");
            dialog = null;
        }
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l3(EditText enterOtp, ImageView shownPin, View view) {
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

    public static final void m3(LlMobUpdateAdhar this$0, TextView time_text, TextView resendOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(time_text, "$time_text");
        Intrinsics.checkNotNullParameter(resendOtp, "$resendOtp");
        this$0.u2().show();
        new l(time_text, resendOtp).start();
        String string = StringsKt__StringsKt.trim((CharSequence) this$0.n2().g.getText().toString()).toString();
        Charset charsetForName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
        byte[] bytes = string.getBytes(charsetForName);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        Base64.encodeToString(bytes, 0);
        int iNextInt = new Random().nextInt(1410065407);
        String strC = qi5.a.c(this$0);
        Intrinsics.checkNotNull(strC);
        this$0.nk = strC;
        this$0.r2().o(this$0.l2(StringsKt__StringsKt.trim((CharSequence) this$0.n2().g.getText().toString()).toString()), "sarEtrans25Ms", this$0.nk, String.valueOf(iNextInt));
    }

    public static final void n3(final EditText enterOtp, final LlMobUpdateAdhar this$0, TextView txt_reset, ImageView ok_button, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(txt_reset, "$txt_reset");
        Intrinsics.checkNotNullParameter(ok_button, "$ok_button");
        String string = enterOtp.getText().toString();
        if (string.length() == 0) {
            Toast.makeText(this$0, this$0.o2().b("label_log_entr_otp", this$0.getString(R.string.pls_enter_otp)), 0).show();
        } else if (string.length() < 6) {
            Toast.makeText(this$0, this$0.o2().b("label_log_entr_val_otp", this$0.getString(R.string.pls_enter_valid_otp)), 0).show();
        } else {
            this$0.u2().show();
            this$0.r2().p(this$0.l2(StringsKt__StringsKt.trim((CharSequence) this$0.n2().g.getText().toString()).toString()), "sarEtrans25Ms", enterOtp.getText().toString(), String.valueOf(this$0.txnNo), this$0.nk);
        }
        txt_reset.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ui3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LlMobUpdateAdhar.o3(enterOtp, view2);
            }
        });
        ok_button.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vi3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LlMobUpdateAdhar.p3(this.a, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o3(EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        enterOtp.setText("");
    }

    public static final void p3(LlMobUpdateAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.dial;
        if (dialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dial");
            dialog = null;
        }
        dialog.dismiss();
    }

    public final void L2(Context context, String message) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ki3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlMobUpdateAdhar.M2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void N2(Aadarkyc.DOEkyc dOEkyc) {
        Intrinsics.checkNotNullParameter(dOEkyc, "<set-?>");
        this.aadhaarData = dOEkyc;
    }

    public final void O2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhaarLastFourDigitMobileNo = str;
    }

    public final void P2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.address = str;
    }

    public final void Q2(zc zcVar) {
        Intrinsics.checkNotNullParameter(zcVar, "<set-?>");
        this.binding = zcVar;
    }

    public final void R2(nr1 nr1Var) {
        Intrinsics.checkNotNullParameter(nr1Var, "<set-?>");
        this.dlServicesViewModel = nr1Var;
    }

    public final void S2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eKYCGender = str;
    }

    public final void T2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ePhoto = str;
    }

    public final void U2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void V2(FetchLlDetails fetchLlDetails) {
        Intrinsics.checkNotNullParameter(fetchLlDetails, "<set-?>");
        this.llDetails = fetchLlDetails;
    }

    public final void W2(AdrInterface adrInterface) {
        Intrinsics.checkNotNullParameter(adrInterface, "<set-?>");
        this.mAadharInterface2 = adrInterface;
    }

    public final void X2(ml mlVar) {
        Intrinsics.checkNotNullParameter(mlVar, "<set-?>");
        this.mAadharViewModel2 = mlVar;
    }

    public final void Y2(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void Z2(aj5 aj5Var) {
        Intrinsics.checkNotNullParameter(aj5Var, "<set-?>");
        this.mView = aj5Var;
    }

    public final void a3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.owner_name_addhaar = str;
    }

    public final void b3(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void c3(DlServiceInt dlServiceInt) {
        Intrinsics.checkNotNullParameter(dlServiceInt, "<set-?>");
        this.retrofitService = dlServiceInt;
    }

    public final void d3(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitServiceVahan = vahanProService;
    }

    public final void e3(EkYCService ekYCService) {
        Intrinsics.checkNotNullParameter(ekYCService, "<set-?>");
        this.retrofitService_one = ekYCService;
    }

    public final void f3(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final void g3(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final void h3(String str) {
        this.txnNo = str;
    }

    public final void i3(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModelv1 = ld7Var;
    }

    public final void j3(Context context, String mobile_no) {
        String str;
        Dialog dialog;
        StringBuilder sb;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        Dialog dialog2 = new Dialog(context);
        this.dial = dialog2;
        dialog2.setContentView(R.layout.validateotp);
        Dialog dialog3 = this.dial;
        if (dialog3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dial");
            dialog3 = null;
        }
        dialog3.setCanceledOnTouchOutside(false);
        Dialog dialog4 = this.dial;
        if (dialog4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dial");
            dialog4 = null;
        }
        dialog4.setCancelable(false);
        Dialog dialog5 = this.dial;
        if (dialog5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dial");
            dialog5 = null;
        }
        Window window = dialog5.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Dialog dialog6 = this.dial;
        if (dialog6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dial");
            dialog6 = null;
        }
        View viewFindViewById = dialog6.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        final ImageView imageView = (ImageView) viewFindViewById;
        Dialog dialog7 = this.dial;
        if (dialog7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dial");
            dialog7 = null;
        }
        View viewFindViewById2 = dialog7.findViewById(R.id.resendOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        final TextView textView = (TextView) viewFindViewById2;
        Dialog dialog8 = this.dial;
        if (dialog8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dial");
            dialog8 = null;
        }
        View viewFindViewById3 = dialog8.findViewById(R.id.showmpin);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        final ImageView imageView2 = (ImageView) viewFindViewById3;
        Dialog dialog9 = this.dial;
        if (dialog9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dial");
            dialog9 = null;
        }
        View viewFindViewById4 = dialog9.findViewById(R.id.submitOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById4;
        Dialog dialog10 = this.dial;
        if (dialog10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dial");
            dialog10 = null;
        }
        View viewFindViewById5 = dialog10.findViewById(R.id.enterOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        final EditText editText = (EditText) viewFindViewById5;
        Dialog dialog11 = this.dial;
        if (dialog11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dial");
            dialog11 = null;
        }
        View viewFindViewById6 = dialog11.findViewById(R.id.time_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        final TextView textView3 = (TextView) viewFindViewById6;
        Dialog dialog12 = this.dial;
        if (dialog12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dial");
            dialog12 = null;
        }
        View viewFindViewById7 = dialog12.findViewById(R.id.txt_reset);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        final TextView textView4 = (TextView) viewFindViewById7;
        Dialog dialog13 = this.dial;
        if (dialog13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dial");
            dialog13 = null;
        }
        View viewFindViewById8 = dialog13.findViewById(R.id.disPlay_mobile);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        TextView textView5 = (TextView) viewFindViewById8;
        Dialog dialog14 = this.dial;
        if (dialog14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dial");
            dialog14 = null;
        }
        View viewFindViewById9 = dialog14.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        ((ImageView) viewFindViewById9).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pi3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlMobUpdateAdhar.k3(this.a, view);
            }
        });
        try {
            sb = new StringBuilder();
            str = "dial";
        } catch (Exception unused) {
            str = "dial";
        }
        try {
            sb.append(o2().b("label_otp_sent_to_mobile", context.getString(R.string.otp_sent)));
            sb.append("\n+91-XXXXXX");
            sb.append(mobile_no);
            textView5.setText(sb.toString());
        } catch (Exception unused2) {
            textView5.setText(o2().b("label_otp_sent_to_mobile", context.getString(R.string.otp_sent)));
        }
        new k(textView3, textView).start();
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qi3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlMobUpdateAdhar.l3(editText, imageView2, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ri3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlMobUpdateAdhar.m3(this.a, textView3, textView, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.si3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlMobUpdateAdhar.n3(editText, this, textView4, imageView, view);
            }
        });
        Dialog dialog15 = this.dial;
        if (dialog15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            dialog = null;
        } else {
            dialog = dialog15;
        }
        dialog.show();
    }

    public final String l2(String aadhaarNumber) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Intrinsics.checkNotNullParameter(aadhaarNumber, "aadhaarNumber");
        SecretKeySpec secretKeySpec = new SecretKeySpec(java.util.Base64.getDecoder().decode("mUI66/XQZ0KfpKwbfh3/LYcFTM1nnHl8kV0+PkD40fw="), "AES");
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, secretKeySpec, new GCMParameterSpec(128, bArr));
        byte[] bytes = aadhaarNumber.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrDoFinal = cipher.doFinal(bytes);
        byte[] bArr2 = new byte[bArrDoFinal.length + 16];
        System.arraycopy(bArr, 0, bArr2, 0, 16);
        System.arraycopy(bArrDoFinal, 0, bArr2, 16, bArrDoFinal.length);
        String strEncodeToString = java.util.Base64.getEncoder().encodeToString(bArr2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    public final Aadarkyc.DOEkyc m2() {
        Aadarkyc.DOEkyc dOEkyc = this.aadhaarData;
        if (dOEkyc != null) {
            return dOEkyc;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhaarData");
        return null;
    }

    public final zc n2() {
        zc zcVar = this.binding;
        if (zcVar != null) {
            return zcVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final wa3 o2() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        zc zcVarC = zc.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(zcVarC, "inflate(...)");
        Q2(zcVarC);
        setContentView(n2().b());
        Y2(this);
        U2(new wa3(s2()));
        f3(new wl5(s2()));
        n2().h.g.setText(o2().b("label_dl_serv_update_mob", "Update Mobile Number"));
        n2().h.h.setVisibility(8);
        n2().h.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ii3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlMobUpdateAdhar.G2(this.a, view);
            }
        });
        A2();
        i2();
        B2();
        n2().h.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ti3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlMobUpdateAdhar.H2(this.a, view);
            }
        });
        n2().b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.wi3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                LlMobUpdateAdhar.I2(this.a, compoundButton, z);
            }
        });
        n2().o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.xi3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                LlMobUpdateAdhar.J2(this.a, compoundButton, z);
            }
        });
        n2().k.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yi3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlMobUpdateAdhar.K2(this.a, view);
            }
        });
    }

    public final FetchLlDetails p2() {
        FetchLlDetails fetchLlDetails = this.llDetails;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("llDetails");
        return null;
    }

    public final AdrInterface q2() {
        AdrInterface adrInterface = this.mAadharInterface2;
        if (adrInterface != null) {
            return adrInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAadharInterface2");
        return null;
    }

    public final ml r2() {
        ml mlVar = this.mAadharViewModel2;
        if (mlVar != null) {
            return mlVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAadharViewModel2");
        return null;
    }

    public final Context s2() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final aj5 t2() {
        aj5 aj5Var = this.mView;
        if (aj5Var != null) {
            return aj5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mView");
        return null;
    }

    public final ProgressDialog u2() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final DlServiceInt v2() {
        DlServiceInt dlServiceInt = this.retrofitService;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final VahanProService w2() {
        VahanProService vahanProService = this.retrofitServiceVahan;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitServiceVahan");
        return null;
    }

    public final EkYCService x2() {
        EkYCService ekYCService = this.retrofitService_one;
        if (ekYCService != null) {
            return ekYCService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService_one");
        return null;
    }

    public final wl5 y2() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    /* JADX INFO: renamed from: z2, reason: from getter */
    public final String getTxnNo() {
        return this.txnNo;
    }
}
