package com.nic.mparivahan.sarathithreeservices.adharmobile;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.z;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycModel.ApiMessage;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycModel.eKycResponse;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse.DOAadhaarResponse;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse.DOEkyc;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse.Data;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse.EkycVerifyResponse;
import com.nic.mparivahan.DLServicesAuth.eKyc.AdharKyc.AdrInterface;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.DOAuthOTP;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.DOEkycX;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.OtpAdharRes;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.UserFullDetails;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.Aadarkyc;
import com.nic.mparivahan.VahanEkyc.AadarkycVerify;
import com.nic.mparivahan.VahanEkyc.EkYCService;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.Welcome.Model.NapixTokenModel;
import com.nic.mparivahan.Welcome.NapixService;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar;
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
import com.zepto.od;
import com.zepto.ol;
import com.zepto.pl;
import com.zepto.qi5;
import com.zepto.rq1;
import com.zepto.s14;
import com.zepto.t14;
import com.zepto.ta3;
import com.zepto.v14;
import com.zepto.va3;
import com.zepto.vh7;
import com.zepto.w14;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.ws6;
import com.zepto.yi5;
import com.zepto.zi5;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u0082\u0002\u0010\u0083\u0002J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0016\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\rR\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010<\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010@\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00107\u001a\u0004\b>\u00109\"\u0004\b?\u0010;R\"\u0010D\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u00107\u001a\u0004\bB\u00109\"\u0004\bC\u0010;R\"\u0010H\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u00107\u001a\u0004\bF\u00109\"\u0004\bG\u0010;R\"\u0010L\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u00107\u001a\u0004\bJ\u00109\"\u0004\bK\u0010;R\"\u0010P\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u00107\u001a\u0004\bN\u00109\"\u0004\bO\u0010;R$\u0010T\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u00107\u001a\u0004\bR\u00109\"\u0004\bS\u0010;R$\u0010X\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u00107\u001a\u0004\bV\u00109\"\u0004\bW\u0010;R$\u0010\\\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u00107\u001a\u0004\bZ\u00109\"\u0004\b[\u0010;R\"\u0010`\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u00107\u001a\u0004\b^\u00109\"\u0004\b_\u0010;R\"\u0010d\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u00107\u001a\u0004\bb\u00109\"\u0004\bc\u0010;R\"\u0010l\u001a\u00020e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kRF\u0010u\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r0mj\u0012\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r`n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\"\u0010|\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R'\u0010\u0084\u0001\u001a\u00020}8\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R*\u0010\u008c\u0001\u001a\u00030\u0085\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R*\u0010\u0094\u0001\u001a\u00030\u008d\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R*\u0010\u009c\u0001\u001a\u00030\u0095\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R*\u0010¤\u0001\u001a\u00030\u009d\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R&\u0010¨\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¥\u0001\u00107\u001a\u0005\b¦\u0001\u00109\"\u0005\b§\u0001\u0010;R*\u0010°\u0001\u001a\u00030©\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R*\u0010¸\u0001\u001a\u00030±\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R&\u0010¼\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¹\u0001\u00107\u001a\u0005\bº\u0001\u00109\"\u0005\b»\u0001\u0010;R&\u0010À\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b½\u0001\u00107\u001a\u0005\b¾\u0001\u00109\"\u0005\b¿\u0001\u0010;R&\u0010Ä\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÁ\u0001\u00107\u001a\u0005\bÂ\u0001\u00109\"\u0005\bÃ\u0001\u0010;R&\u0010È\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÅ\u0001\u00107\u001a\u0005\bÆ\u0001\u00109\"\u0005\bÇ\u0001\u0010;R)\u0010Ï\u0001\u001a\u00030É\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bÊ\u0001\u0010'\u001a\u0006\bË\u0001\u0010Ì\u0001\"\u0006\bÍ\u0001\u0010Î\u0001R*\u0010×\u0001\u001a\u00030Ð\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÑ\u0001\u0010Ò\u0001\u001a\u0006\bÓ\u0001\u0010Ô\u0001\"\u0006\bÕ\u0001\u0010Ö\u0001R*\u0010ß\u0001\u001a\u00030Ø\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÙ\u0001\u0010Ú\u0001\u001a\u0006\bÛ\u0001\u0010Ü\u0001\"\u0006\bÝ\u0001\u0010Þ\u0001R&\u0010ã\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bà\u0001\u00107\u001a\u0005\bá\u0001\u00109\"\u0005\bâ\u0001\u0010;R*\u0010ë\u0001\u001a\u00030ä\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bå\u0001\u0010æ\u0001\u001a\u0006\bç\u0001\u0010è\u0001\"\u0006\bé\u0001\u0010ê\u0001R&\u0010ï\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bì\u0001\u00107\u001a\u0005\bí\u0001\u00109\"\u0005\bî\u0001\u0010;R\u0018\u0010ñ\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bð\u0001\u00107R\u001a\u0010õ\u0001\u001a\u00030ò\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bó\u0001\u0010ô\u0001R*\u0010ý\u0001\u001a\u00030ö\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b÷\u0001\u0010ø\u0001\u001a\u0006\bù\u0001\u0010ú\u0001\"\u0006\bû\u0001\u0010ü\u0001R\u0018\u0010\u0081\u0002\u001a\u00030þ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÿ\u0001\u0010\u0080\u0002¨\u0006\u0084\u0002"}, d2 = {"Lcom/nic/mparivahan/sarathithreeservices/adharmobile/MobUpdateAdhar;", "Lcom/zepto/o40;", "", "B2", "e2", "X1", "h2", "z2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "N2", "mobile_no", "n3", "Lcom/zepto/od;", "F", "Lcom/zepto/od;", "l2", "()Lcom/zepto/od;", "S2", "(Lcom/zepto/od;)V", "binding", "Landroid/app/Dialog;", "G", "Landroid/app/Dialog;", "dial", "Lcom/zepto/wl5;", "H", "Lcom/zepto/wl5;", "x2", "()Lcom/zepto/wl5;", "i3", "(Lcom/zepto/wl5;)V", "sarthiSession", "Lcom/zepto/ws6;", "I", "Lcom/zepto/ws6;", "getSessionManager", "()Lcom/zepto/ws6;", "k3", "(Lcom/zepto/ws6;)V", "sessionManager", "Lcom/zepto/wa3;", "J", "Lcom/zepto/wa3;", "n2", "()Lcom/zepto/wa3;", "X2", "(Lcom/zepto/wa3;)V", "langSession", "K", "Ljava/lang/String;", "getBioRecGenesis", "()Ljava/lang/String;", "setBioRecGenesis", "(Ljava/lang/String;)V", "bioRecGenesis", "L", "getLastEndorseRtoCode", "setLastEndorseRtoCode", "lastEndorseRtoCode", "M", "getLastEndorseStateCode", "setLastEndorseStateCode", "lastEndorseStateCode", "N", "getLastEndorsedState", "setLastEndorsedState", "lastEndorsedState", "O", "getLastEndorsedRTO", "setLastEndorsedRTO", "lastEndorsedRTO", "P", "getState_value", "setState_value", "state_value", "Q", "getDlNo", "setDlNo", "dlNo", "R", "getDob", "setDob", "dob", "S", "y2", "l3", "txnNo", "T", "getOwner_name_addhaar", "d3", "owner_name_addhaar", "U", "getAddress", "R2", "address", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "V", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "m2", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "T2", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "dlDetails", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "W", "Ljava/util/HashMap;", "getWhatServiceRequired", "()Ljava/util/HashMap;", "setWhatServiceRequired", "(Ljava/util/HashMap;)V", "whatServiceRequired", "X", "Landroid/content/Context;", "q2", "()Landroid/content/Context;", "a3", "(Landroid/content/Context;)V", "mContext", "Landroid/app/ProgressDialog;", "Y", "Landroid/app/ProgressDialog;", "t2", "()Landroid/app/ProgressDialog;", "e3", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/aj5;", "Z", "Lcom/zepto/aj5;", "r2", "()Lcom/zepto/aj5;", "b3", "(Lcom/zepto/aj5;)V", "mView", "Lcom/nic/mparivahan/VahanEkyc/EkYCService;", "a0", "Lcom/nic/mparivahan/VahanEkyc/EkYCService;", "w2", "()Lcom/nic/mparivahan/VahanEkyc/EkYCService;", "h3", "(Lcom/nic/mparivahan/VahanEkyc/EkYCService;)V", "retrofitService_one", "Lcom/zepto/ml;", "b0", "Lcom/zepto/ml;", "p2", "()Lcom/zepto/ml;", "Z2", "(Lcom/zepto/ml;)V", "mAadharViewModel2", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/AdharKyc/AdrInterface;", "c0", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/AdharKyc/AdrInterface;", "o2", "()Lcom/nic/mparivahan/DLServicesAuth/eKyc/AdharKyc/AdrInterface;", "Y2", "(Lcom/nic/mparivahan/DLServicesAuth/eKyc/AdharKyc/AdrInterface;)V", "mAadharInterface2", "d0", "getAllowAddrChangeAtDlservReqst", "setAllowAddrChangeAtDlservReqst", "allowAddrChangeAtDlservReqst", "Lcom/zepto/nr1;", "e0", "Lcom/zepto/nr1;", "getDlServicesViewModel", "()Lcom/zepto/nr1;", "U2", "(Lcom/zepto/nr1;)V", "dlServicesViewModel", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "f0", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "u2", "()Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "f3", "(Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;)V", "retrofitService", "g0", "getType", "setType", "type", "h0", "getEKYCId", "setEKYCId", "eKYCId", "i0", "getEPhoto", "W2", "ePhoto", "j0", "getEKYCGender", "V2", "eKYCGender", "", "k0", "getServiceCode", "()I", "j3", "(I)V", "serviceCode", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "l0", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "v2", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "g3", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitServiceVahan", "Lcom/zepto/ld7;", "m0", "Lcom/zepto/ld7;", "getViewModelv1", "()Lcom/zepto/ld7;", "m3", "(Lcom/zepto/ld7;)V", "viewModelv1", "n0", "getFlag", "setFlag", "flag", "Lcom/nic/mparivahan/VahanEkyc/Aadarkyc$DOEkyc;", "o0", "Lcom/nic/mparivahan/VahanEkyc/Aadarkyc$DOEkyc;", "k2", "()Lcom/nic/mparivahan/VahanEkyc/Aadarkyc$DOEkyc;", "P2", "(Lcom/nic/mparivahan/VahanEkyc/Aadarkyc$DOEkyc;)V", "aadhaarData", "p0", "getAadhaarLastFourDigitMobileNo", "Q2", "aadhaarLastFourDigitMobileNo", "q0", "nk", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkycX;", "r0", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkycX;", "adharData", "Lcom/zepto/v14;", "s0", "Lcom/zepto/v14;", "s2", "()Lcom/zepto/v14;", "c3", "(Lcom/zepto/v14;)V", "napixViewModel", "Lcom/nic/mparivahan/Welcome/NapixService;", "t0", "Lcom/nic/mparivahan/Welcome/NapixService;", "napixService", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class MobUpdateAdhar extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public od binding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public Dialog dial;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String dlNo;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String dob;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String txnNo;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public DldetobjX dlDetails;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public aj5 mView;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public EkYCService retrofitService_one;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public ml mAadharViewModel2;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public AdrInterface mAadharInterface2;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public nr1 dlServicesViewModel;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public DlServiceInt retrofitService;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public int serviceCode;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public VahanProService retrofitServiceVahan;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public ld7 viewModelv1;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public Aadarkyc.DOEkyc aadhaarData;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public DOEkycX adharData;

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    public v14 napixViewModel;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String bioRecGenesis = "";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String lastEndorseRtoCode = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String lastEndorseStateCode = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String lastEndorsedState = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String lastEndorsedRTO = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String state_value = "";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String owner_name_addhaar = "NA";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String address = "NA";

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public HashMap whatServiceRequired = new HashMap();

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public String allowAddrChangeAtDlservReqst = "allowAddrChange";

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public String type = "A";

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public String eKYCId = "NA";

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public String ePhoto = "NA";

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public String eKYCGender = "NA";

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public String flag = "";

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public String aadhaarLastFourDigitMobileNo = "";

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public String nk = "";

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    public final NapixService napixService = NapixService.INSTANCE.a();

    public static final class a extends Lambda implements Function1 {
        public a() {
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
            MobUpdateAdhar.this.t2().cancel();
            MobUpdateAdhar mobUpdateAdhar = MobUpdateAdhar.this;
            mobUpdateAdhar.N2(mobUpdateAdhar, "Unable to process the request, Please try after some time");
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(UserFullDetails userFullDetails) {
            try {
                Log.d("userDetails_api", userFullDetails.toString());
                if (!StringsKt__StringsJVMKt.equals(userFullDetails.getStatus(), "Y", true)) {
                    MobUpdateAdhar.this.t2().dismiss();
                    MobUpdateAdhar mobUpdateAdhar = MobUpdateAdhar.this;
                    mobUpdateAdhar.N2(mobUpdateAdhar.q2(), "Unable to proceed your request, Please try after some time");
                    return;
                }
                MobUpdateAdhar.this.adharData = userFullDetails.getDOEkyc();
                if (userFullDetails.getDOEkyc().getHouse() != null) {
                    userFullDetails.getDOEkyc().getHouse();
                }
                if (userFullDetails.getDOEkyc().getLandMark() != null) {
                    userFullDetails.getDOEkyc().getLandMark();
                }
                if (userFullDetails.getDOEkyc().getLocalityIfAny() != null) {
                    userFullDetails.getDOEkyc().getLocalityIfAny();
                }
                if (userFullDetails.getDOEkyc().getName() != null) {
                    userFullDetails.getDOEkyc().getName();
                }
                userFullDetails.getDOEkyc().getPhone();
                String.valueOf(userFullDetails.getDOEkyc().getPhone());
                if (userFullDetails.getDOEkyc().getPht() != null) {
                    userFullDetails.getDOEkyc().getPht();
                } else {
                    MobUpdateAdhar.this.W2(userFullDetails.getDOEkyc().getPht());
                }
                if (userFullDetails.getDOEkyc().getGender() != null && StringsKt__StringsJVMKt.equals(userFullDetails.getDOEkyc().getGender(), "M", true)) {
                    MobUpdateAdhar.this.V2("M");
                }
                if (Intrinsics.areEqual(MobUpdateAdhar.this.x2().b(), VContant.MAINSCREEN)) {
                    MobUpdateAdhar.this.j3(514);
                } else if (Intrinsics.areEqual(MobUpdateAdhar.this.x2().b(), VContant.APPLICATION_SCREEN)) {
                    MobUpdateAdhar.this.j3(513);
                } else if (Intrinsics.areEqual(MobUpdateAdhar.this.x2().b(), "3")) {
                    MobUpdateAdhar.this.j3(515);
                } else if (Intrinsics.areEqual(MobUpdateAdhar.this.x2().b(), "4")) {
                    MobUpdateAdhar.this.j3(525);
                } else if (Intrinsics.areEqual(MobUpdateAdhar.this.x2().b(), VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE)) {
                    MobUpdateAdhar.this.j3(523);
                } else if (Intrinsics.areEqual(MobUpdateAdhar.this.x2().b(), VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE)) {
                    MobUpdateAdhar.this.j3(516);
                } else {
                    MobUpdateAdhar mobUpdateAdhar2 = MobUpdateAdhar.this;
                    mobUpdateAdhar2.j3(Integer.parseInt(mobUpdateAdhar2.x2().b()));
                }
                Dialog dialog = MobUpdateAdhar.this.dial;
                Dialog dialog2 = null;
                if (dialog == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dial");
                    dialog = null;
                }
                if (dialog.isShowing()) {
                    Dialog dialog3 = MobUpdateAdhar.this.dial;
                    if (dialog3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dial");
                    } else {
                        dialog2 = dialog3;
                    }
                    dialog2.dismiss();
                }
                MobUpdateAdhar.this.e2();
            } catch (Exception unused) {
                MobUpdateAdhar.this.t2().dismiss();
                MobUpdateAdhar mobUpdateAdhar3 = MobUpdateAdhar.this;
                mobUpdateAdhar3.N2(mobUpdateAdhar3.q2(), "Unable to proceed your request, Please try after some time");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((UserFullDetails) obj);
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
            MobUpdateAdhar.this.t2().dismiss();
            MobUpdateAdhar mobUpdateAdhar = MobUpdateAdhar.this;
            mobUpdateAdhar.N2(mobUpdateAdhar.q2(), "Unable to proceed your request, Please try after some time");
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
        public final void a(AadarkycVerify.Response response) {
            AadarkycVerify.dOEkyc dOAuthOTP;
            AadarkycVerify.dOEkyc dOAuthOTP2;
            String last_four_mobile;
            AadarkycVerify.dOEkyc dOAuthOTP3;
            AadarkycVerify.dOEkyc dOAuthOTP4;
            MobUpdateAdhar.this.t2().dismiss();
            try {
                Log.e("response_1", response.toString());
                AadarkycVerify.DoAadhaarResponse doAadhaarResponse = response.getDoAadhaarResponse();
                if (String.valueOf(doAadhaarResponse != null ? doAadhaarResponse.getStatus() : null).length() == 0) {
                    return;
                }
                try {
                    Log.e("CCTVlOGE", VContant.MAINSCREEN);
                    if (doAadhaarResponse != null && (dOAuthOTP = doAadhaarResponse.getDOAuthOTP()) != null && Intrinsics.areEqual(dOAuthOTP.getMobileverify(), Boolean.TRUE)) {
                        String last_four_mobile2 = (doAadhaarResponse == null || (dOAuthOTP4 = doAadhaarResponse.getDOAuthOTP()) == null) ? null : dOAuthOTP4.getLast_four_mobile();
                        if (last_four_mobile2 != null && last_four_mobile2.length() != 0) {
                            if (StringsKt__StringsJVMKt.equals((doAadhaarResponse == null || (dOAuthOTP3 = doAadhaarResponse.getDOAuthOTP()) == null) ? null : dOAuthOTP3.getStatus(), "success", true)) {
                                Log.e("CCTVlOGE", VContant.APPLICATION_SCREEN);
                                if (doAadhaarResponse == null || (dOAuthOTP2 = doAadhaarResponse.getDOAuthOTP()) == null || (last_four_mobile = dOAuthOTP2.getLast_four_mobile()) == null || last_four_mobile.length() != 4) {
                                    return;
                                }
                                MobUpdateAdhar.this.l3(String.valueOf(doAadhaarResponse.getTxnNo()));
                                String txnNo = MobUpdateAdhar.this.getTxnNo();
                                Intrinsics.checkNotNull(txnNo);
                                Log.d("txnNo", txnNo);
                                MobUpdateAdhar mobUpdateAdhar = MobUpdateAdhar.this;
                                AadarkycVerify.dOEkyc dOAuthOTP5 = doAadhaarResponse.getDOAuthOTP();
                                mobUpdateAdhar.Q2(String.valueOf(dOAuthOTP5 != null ? dOAuthOTP5.getLast_four_mobile() : null));
                                MobUpdateAdhar mobUpdateAdhar2 = MobUpdateAdhar.this;
                                AadarkycVerify.dOEkyc dOAuthOTP6 = doAadhaarResponse.getDOAuthOTP();
                                mobUpdateAdhar2.n3(mobUpdateAdhar2, String.valueOf(dOAuthOTP6 != null ? dOAuthOTP6.getLast_four_mobile() : null));
                                return;
                            }
                        }
                    }
                    Log.e("CCTVlOGE", "3");
                    String reason = doAadhaarResponse != null ? doAadhaarResponse.getReason() : null;
                    if (reason != null && reason.length() != 0) {
                        Log.v("reason fail", String.valueOf(doAadhaarResponse != null ? doAadhaarResponse.getReason() : null));
                        if (StringsKt__StringsJVMKt.equals(String.valueOf(doAadhaarResponse != null ? doAadhaarResponse.getReason() : null), "Invalid Auth Xml Format.", true)) {
                            MobUpdateAdhar mobUpdateAdhar3 = MobUpdateAdhar.this;
                            mobUpdateAdhar3.N2(mobUpdateAdhar3, "Invalid Aadhaar No.\nPlease try again");
                            return;
                        } else {
                            MobUpdateAdhar mobUpdateAdhar4 = MobUpdateAdhar.this;
                            mobUpdateAdhar4.N2(mobUpdateAdhar4, String.valueOf(doAadhaarResponse != null ? doAadhaarResponse.getReason() : null));
                            return;
                        }
                    }
                    MobUpdateAdhar mobUpdateAdhar5 = MobUpdateAdhar.this;
                    mobUpdateAdhar5.N2(mobUpdateAdhar5, mobUpdateAdhar5.n2().b("service_is_not_present", MobUpdateAdhar.this.getString(R.string.unable_to_get_details)));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AadarkycVerify.Response) obj);
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
            Log.e("response_2", str.toString());
            MobUpdateAdhar.this.t2().dismiss();
            MobUpdateAdhar mobUpdateAdhar = MobUpdateAdhar.this;
            mobUpdateAdhar.N2(mobUpdateAdhar, mobUpdateAdhar.n2().b("service_is_not_present", MobUpdateAdhar.this.getString(R.string.unable_to_get_details)));
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
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
        public final void a(com.nic.mparivahan.VahanEkyc.Aadarkyc.Response r10) {
            /*
                Method dump skipped, instruction units count: 701
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar.f.a(com.nic.mparivahan.VahanEkyc.Aadarkyc$Response):void");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Aadarkyc.Response) obj);
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
            try {
                MobUpdateAdhar.this.t2().dismiss();
                Dialog dialog = MobUpdateAdhar.this.dial;
                Dialog dialog2 = null;
                if (dialog == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dial");
                    dialog = null;
                }
                if (dialog.isShowing()) {
                    Dialog dialog3 = MobUpdateAdhar.this.dial;
                    if (dialog3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dial");
                    } else {
                        dialog2 = dialog3;
                    }
                    dialog2.dismiss();
                }
                MobUpdateAdhar mobUpdateAdhar = MobUpdateAdhar.this;
                mobUpdateAdhar.N2(mobUpdateAdhar, mobUpdateAdhar.n2().b("service_is_not_present", MobUpdateAdhar.this.getString(R.string.unable_to_get_details)));
            } catch (Exception unused) {
            }
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
        public final void a(OtpAdharRes otpAdharRes) {
            MobUpdateAdhar.this.t2().cancel();
            try {
                if (!StringsKt__StringsJVMKt.equals(otpAdharRes.getStatus(), "Success", true)) {
                    MobUpdateAdhar mobUpdateAdhar = MobUpdateAdhar.this;
                    mobUpdateAdhar.N2(mobUpdateAdhar, "Unable to process the request, Please try after some time");
                    return;
                }
                MobUpdateAdhar.this.l3(StringsKt__StringsKt.trim((CharSequence) otpAdharRes.getTxnNo()).toString());
                MobUpdateAdhar mobUpdateAdhar2 = MobUpdateAdhar.this;
                DOAuthOTP dOAuthOTP = otpAdharRes.getDOAuthOTP();
                mobUpdateAdhar2.Q2(String.valueOf(dOAuthOTP != null ? dOAuthOTP.getLast_four_mobile() : null));
                MobUpdateAdhar mobUpdateAdhar3 = MobUpdateAdhar.this;
                mobUpdateAdhar3.n3(mobUpdateAdhar3, otpAdharRes.getDOAuthOTP().getLast_four_mobile());
            } catch (Exception unused) {
                MobUpdateAdhar mobUpdateAdhar4 = MobUpdateAdhar.this;
                mobUpdateAdhar4.N2(mobUpdateAdhar4, "Unable to process the request, Please try after some time");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OtpAdharRes) obj);
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

    public static final class j extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ TextView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(TextView textView, TextView textView2) {
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

    public static final void A2(NapixTokenModel napixTokenModel) {
        try {
            Log.d("sartoken", napixTokenModel.getAccess_token());
            va3.a.c1(napixTokenModel.getAccess_token());
        } catch (Exception unused) {
        }
    }

    private final void B2() {
        p2().i().g(this, new i(new d()));
        p2().j().g(this, new i(new e()));
        p2().k().g(this, new i(new f()));
        p2().j().g(this, new i(new g()));
        r2().j().g(this, new mf4() { // from class: com.zepto.zu3
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                MobUpdateAdhar.E2(this.a, (eKycResponse) obj);
            }
        });
        r2().i().g(this, new mf4() { // from class: com.zepto.av3
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                MobUpdateAdhar.F2(this.a, (String) obj);
            }
        });
        r2().h().g(this, new mf4() { // from class: com.zepto.bv3
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                MobUpdateAdhar.C2(this.a, (EkycVerifyResponse) obj);
            }
        });
        r2().g().g(this, new mf4() { // from class: com.zepto.cv3
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                MobUpdateAdhar.D2(this.a, (String) obj);
            }
        });
        p2().g().g(this, new i(new h()));
        p2().h().g(this, new i(new a()));
        p2().n().g(this, new i(new b()));
        p2().l().g(this, new i(new c()));
    }

    public static final void C2(MobUpdateAdhar this$0, EkycVerifyResponse ekycVerifyResponse) {
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
            Data data = ekycVerifyResponse.getData();
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
                        this$0.t2().dismiss();
                        e2.printStackTrace();
                        return;
                    }
                }
            }
            this$0.t2().dismiss();
            String reason = dOAadhaarResponse != null ? dOAadhaarResponse.getReason() : null;
            if (reason != null && reason.length() != 0) {
                this$0.N2(this$0, String.valueOf(dOAadhaarResponse != null ? dOAadhaarResponse.getReason() : null));
                return;
            }
            this$0.N2(this$0, "Unable to verify the request, Please try after some time");
        } catch (Exception unused) {
            this$0.N2(this$0, this$0.n2().b("service_is_not_present", this$0.getString(R.string.unable_to_get_details)));
        }
    }

    public static final void D2(MobUpdateAdhar this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.t2().dismiss();
    }

    public static final void E2(MobUpdateAdhar this$0, eKycResponse ekycresponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.t2().dismiss();
        Log.d("adhar_resp", ekycresponse.toString());
        try {
            ApiMessage apiMessage = ekycresponse.getApiMessage();
            if (apiMessage == null || apiMessage.getStatusCode() != 200) {
                ApiMessage apiMessage2 = ekycresponse.getApiMessage();
                this$0.N2(this$0, String.valueOf(apiMessage2 != null ? apiMessage2.getDeveloperMessage() : null));
                return;
            }
            com.nic.mparivahan.DLServicesAuth.Wrapper.EkycModel.Data data = ekycresponse.getData();
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
            com.nic.mparivahan.DLServicesAuth.Wrapper.EkycModel.Data data2 = ekycresponse.getData();
            vh7Var.f(String.valueOf(data2 != null ? data2.getTxNo() : null));
            com.nic.mparivahan.DLServicesAuth.Wrapper.EkycModel.Data data3 = ekycresponse.getData();
            this$0.n3(this$0, String.valueOf(data3 != null ? data3.getLastFourMobileNumber() : null));
        } catch (Exception unused) {
            this$0.N2(this$0, "Unable to process the request, Please try after some time");
        }
    }

    public static final void F2(MobUpdateAdhar this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.t2().dismiss();
        this$0.N2(this$0, "Unable to process the request, Please try after some time");
    }

    public static final void G2(MobUpdateAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void H2(MobUpdateAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void I2(MobUpdateAdhar this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            try {
                this$0.l2().p.setChecked(false);
                this$0.l2().b.setChecked(true);
                this$0.l2().g.setHint(this$0.n2().b("enter_aadhaar_no", this$0.getString(R.string.enter_aadhaar_no)));
                this$0.l2().g.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(12)});
                SpannableString spannableString = new SpannableString(this$0.n2().b("agree_with_aadhar_terms", this$0.getString(R.string.agree_with_aadhar_terms)));
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
                this$0.l2().c.setText(spannableString);
                this$0.type = "A";
            } catch (Exception unused) {
            }
        }
    }

    public static final void J2(MobUpdateAdhar this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            try {
                this$0.l2().b.setChecked(false);
                this$0.l2().p.setChecked(true);
                this$0.l2().g.setHint(this$0.n2().b("lbl_enter_vid_number", this$0.getString(R.string.enter_vid_number)));
                this$0.l2().g.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(16)});
                SpannableString spannableString = new SpannableString(this$0.n2().b("vid_terms_condition", this$0.getString(R.string.agree_with_vid_terms)));
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
                this$0.l2().c.setText(spannableString);
                this$0.type = "V";
            } catch (Exception unused) {
            }
        }
    }

    public static final void K2(MobUpdateAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        final Dialog dialog = new Dialog(this$0);
        dialog.setContentView(R.layout.term_cond_aadhar_dialog);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        View viewFindViewById = dialog.findViewById(R.id.cancelIv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        View viewFindViewById2 = dialog.findViewById(R.id.termConditionWv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        WebView webView = (WebView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById3;
        if (this$0.l2().p.isChecked()) {
            textView.setText(this$0.n2().b("vid_terms_condition", this$0.getString(R.string.vid_bases_ekyc)));
        } else {
            textView.setText(this$0.n2().b("aadhar_bases_ekyc", this$0.getString(R.string.aadhar_bases_ekyc)));
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wv3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MobUpdateAdhar.L2(dialog, view2);
            }
        });
        webView.loadUrl(s14.a.g() + this$0.n2().d() + "/mparivahan-info-terms-of-use-aadhaar.html");
        webView.clearCache(true);
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L2(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    public static final void M2(MobUpdateAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.l2().g.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            this$0.l2().k.setImageResource(R.drawable.pass_visible);
            this$0.l2().g.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            this$0.l2().k.setImageResource(R.drawable.mvvm_visibility);
            this$0.l2().g.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public static final void O2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X1() {
        final Dialog dialog = new Dialog(q2());
        dialog.setContentView(R.layout.user_adhar_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.tv_dl_holder_name);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
        View viewFindViewById2 = dialog.findViewById(R.id.txt_dob);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
        View viewFindViewById3 = dialog.findViewById(R.id.tv_rel);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
        View viewFindViewById4 = dialog.findViewById(R.id.tv_gen);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
        ((AppCompatTextView) viewFindViewById).setText(n2().b(va3.a.L(), getString(R.string.name)));
        ((AppCompatTextView) viewFindViewById2).setText(n2().b("lbl_dob", getString(R.string.date_of_birth)));
        ((AppCompatTextView) viewFindViewById3).setText(n2().b("relation", getString(R.string.relative_name)));
        ((AppCompatTextView) viewFindViewById4).setText(n2().b("appl_gender", getString(R.string.gender)));
        View viewFindViewById5 = dialog.findViewById(R.id.txt_dl_holder_name);
        Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
        AppCompatTextView appCompatTextView = (AppCompatTextView) viewFindViewById5;
        View viewFindViewById6 = dialog.findViewById(R.id.txt_dob_value);
        Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) viewFindViewById6;
        View viewFindViewById7 = dialog.findViewById(R.id.txt_relation);
        Intrinsics.checkNotNull(viewFindViewById7, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) viewFindViewById7;
        View viewFindViewById8 = dialog.findViewById(R.id.txt_gender);
        Intrinsics.checkNotNull(viewFindViewById8, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
        AppCompatTextView appCompatTextView4 = (AppCompatTextView) viewFindViewById8;
        View viewFindViewById9 = dialog.findViewById(R.id.close_request);
        Intrinsics.checkNotNull(viewFindViewById9, "null cannot be cast to non-null type com.nic.mparivahan.dlservices.widget.CustomWegetLayout");
        CustomWegetLayout customWegetLayout = (CustomWegetLayout) viewFindViewById9;
        View viewFindViewById10 = dialog.findViewById(R.id.next_request);
        Intrinsics.checkNotNull(viewFindViewById10, "null cannot be cast to non-null type com.nic.mparivahan.dlservices.widget.CustomWegetLayout");
        CustomWegetLayout customWegetLayout2 = (CustomWegetLayout) viewFindViewById10;
        View viewFindViewById11 = dialog.findViewById(R.id.iv_report_traffic_violation_icon_in);
        Intrinsics.checkNotNull(viewFindViewById11, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewFindViewById11;
        View viewFindViewById12 = dialog.findViewById(R.id.round_card_view_in);
        Intrinsics.checkNotNull(viewFindViewById12, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        CardView cardView = (CardView) viewFindViewById12;
        View viewFindViewById13 = dialog.findViewById(R.id.txt_dl_no);
        Intrinsics.checkNotNull(viewFindViewById13, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById13;
        customWegetLayout.setText(n2().b("vahan_btn_cancel", getString(R.string.cancel)));
        customWegetLayout2.setText(n2().b("button_proceed", getString(R.string.proceed)));
        try {
            String name = k2().getName();
            Intrinsics.checkNotNull(name);
            appCompatTextView.setText(StringsKt__StringsKt.trim((CharSequence) name).toString());
            appCompatTextView2.setText(k2().getDob());
            appCompatTextView3.setText(StringsKt__StringsKt.trim((CharSequence) k2().getCareOf()).toString());
            if (Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) k2().getGender()).toString(), "M")) {
                appCompatTextView4.setText("Male");
            } else {
                appCompatTextView4.setText("Female");
            }
            textView.setText(n2().b("dl_no", "DL No. : ") + ' ' + m2().getBioObj().getBioDlno());
            String pht = k2().getPht();
            if (pht == null || pht.length() == 0 || Intrinsics.areEqual(k2().getPht(), "")) {
                cardView.setVisibility(8);
            } else {
                cardView.setVisibility(0);
                imageView.setImageBitmap(kt6.a(k2().getPht()));
            }
        } catch (Exception unused) {
        }
        customWegetLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ev3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobUpdateAdhar.Y1(dialog, this, view);
            }
        });
        customWegetLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fv3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobUpdateAdhar.Z1(dialog, view);
            }
        });
        dialog.show();
    }

    public static final void Y1(Dialog d2, MobUpdateAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        try {
            Intent intent = new Intent(this$0.q2(), (Class<?>) ConfirmMobNo.class);
            intent.putExtra("aadharData", this$0.k2());
            intent.putExtra("DLDetails", this$0.m2());
            intent.putExtra("DL", this$0.dlNo);
            intent.putExtra("dob", this$0.dob);
            intent.putExtra("aadhaarLastFourDigitMobileNo", this$0.aadhaarLastFourDigitMobileNo);
            this$0.startActivity(intent);
            this$0.finish();
        } catch (Exception unused) {
        }
    }

    public static final void Z1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e2() {
        final Dialog dialog = new Dialog(q2());
        dialog.setContentView(R.layout.user_adhar_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.tv_dl_holder_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = dialog.findViewById(R.id.txt_dob);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        View viewFindViewById3 = dialog.findViewById(R.id.tv_rel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        View viewFindViewById4 = dialog.findViewById(R.id.tv_gen);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        ((AppCompatTextView) viewFindViewById).setText(n2().b(va3.a.L(), getString(R.string.name)));
        ((AppCompatTextView) viewFindViewById2).setText(n2().b("lbl_dob", getString(R.string.date_of_birth)));
        ((AppCompatTextView) viewFindViewById3).setText(n2().b("relation", getString(R.string.relative_name)));
        ((AppCompatTextView) viewFindViewById4).setText(n2().b("appl_gender", getString(R.string.gender)));
        View viewFindViewById5 = dialog.findViewById(R.id.txt_dl_holder_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        AppCompatTextView appCompatTextView = (AppCompatTextView) viewFindViewById5;
        View viewFindViewById6 = dialog.findViewById(R.id.txt_dob_value);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) viewFindViewById6;
        View viewFindViewById7 = dialog.findViewById(R.id.txt_relation);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) viewFindViewById7;
        View viewFindViewById8 = dialog.findViewById(R.id.txt_gender);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        AppCompatTextView appCompatTextView4 = (AppCompatTextView) viewFindViewById8;
        View viewFindViewById9 = dialog.findViewById(R.id.close_request);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        CustomWegetLayout customWegetLayout = (CustomWegetLayout) viewFindViewById9;
        View viewFindViewById10 = dialog.findViewById(R.id.next_request);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        CustomWegetLayout customWegetLayout2 = (CustomWegetLayout) viewFindViewById10;
        View viewFindViewById11 = dialog.findViewById(R.id.iv_report_traffic_violation_icon_in);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById11;
        View viewFindViewById12 = dialog.findViewById(R.id.round_card_view_in);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        CardView cardView = (CardView) viewFindViewById12;
        View viewFindViewById13 = dialog.findViewById(R.id.txt_dl_no);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById13;
        customWegetLayout.setText(n2().b("vahan_btn_cancel", getString(R.string.cancel)));
        customWegetLayout2.setText(n2().b("button_proceed", getString(R.string.proceed)));
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
            textView.setText(n2().b("dl_no", "DL No. : ") + ' ' + m2().getBioObj().getBioDlno());
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
                    dOEkycX7 = null;
                }
                if (Intrinsics.areEqual(dOEkycX7.getPht(), "")) {
                    cardView.setVisibility(8);
                } else {
                    cardView.setVisibility(0);
                    DOEkycX dOEkycX8 = this.adharData;
                    if (dOEkycX8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adharData");
                    } else {
                        dOEkycX2 = dOEkycX8;
                    }
                    imageView.setImageBitmap(kt6.a(dOEkycX2.getPht()));
                }
            }
        } catch (Exception unused) {
        }
        customWegetLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mv3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobUpdateAdhar.f2(dialog, this, view);
            }
        });
        customWegetLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nv3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobUpdateAdhar.g2(dialog, view);
            }
        });
        dialog.show();
    }

    public static final void f2(Dialog d2, MobUpdateAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        try {
            Intent intent = new Intent(this$0.q2(), (Class<?>) ConfirmMobNo.class);
            DOEkycX dOEkycX = this$0.adharData;
            if (dOEkycX == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX = null;
            }
            intent.putExtra("aadharData", dOEkycX);
            intent.putExtra("DLDetails", this$0.m2());
            intent.putExtra("DL", this$0.dlNo);
            intent.putExtra("dob", this$0.dob);
            intent.putExtra("aadhaarLastFourDigitMobileNo", this$0.aadhaarLastFourDigitMobileNo);
            this$0.startActivity(intent);
            this$0.finish();
        } catch (Exception unused) {
        }
    }

    public static final void g2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void h2() {
        l2().n.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tv3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobUpdateAdhar.i2(this.a, view);
            }
        });
        l2().o.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uv3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobUpdateAdhar.j2(this.a, view);
            }
        });
    }

    public static final void i2(MobUpdateAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.l2().g.getText().clear();
    }

    public static final void j2(MobUpdateAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Editable text = this$0.l2().g.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0 && this$0.l2().b.isChecked()) {
            this$0.N2(this$0, this$0.n2().b("aadhar_number_error_msg", "Please enter aadhaar number"));
            return;
        }
        if (this$0.l2().g.getText().length() < 12 && this$0.l2().b.isChecked()) {
            this$0.N2(this$0, this$0.n2().b("valid_aadhaar_no", "Please enter the valid Aadhaar Number"));
            return;
        }
        if (this$0.l2().g.getText().length() > 12 && this$0.l2().b.isChecked()) {
            this$0.N2(this$0, this$0.n2().b("valid_aadhaar_no", "Please enter the valid Aadhaar Number"));
            return;
        }
        Editable text2 = this$0.l2().g.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        if (text2.length() == 0 && this$0.l2().p.isChecked()) {
            this$0.N2(this$0, this$0.n2().b("enter_virtual_id", "Please enter the Virtual Id"));
            return;
        }
        if (this$0.l2().g.getText().length() < 16 && this$0.l2().p.isChecked()) {
            this$0.N2(this$0, this$0.n2().b("enter_valid_virtual_id", "Please enter the valid Virtual Id"));
            return;
        }
        if (!this$0.l2().e.isChecked() && this$0.l2().p.isChecked()) {
            this$0.N2(this$0, this$0.n2().b("agree_with_kyc", "Please agree with VID based e-KYC consent"));
            return;
        }
        if (!this$0.l2().e.isChecked() && this$0.l2().b.isChecked()) {
            this$0.N2(this$0, this$0.n2().b("agree_with_adhar_bases_kyc", "Please agree with Aadhaar based e-KYC consent"));
            return;
        }
        this$0.t2().show();
        try {
            int iNextInt = new SecureRandom().nextInt(1410065407);
            qi5.a aVar = qi5.a;
            String strC = aVar.c(this$0.q2());
            Intrinsics.checkNotNull(strC);
            this$0.nk = strC;
            this$0.p2().o(aVar.b(StringsKt__StringsKt.trim((CharSequence) this$0.l2().g.getText().toString()).toString()), "sarEtrans25Ms", this$0.nk, String.valueOf(iNextInt));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o3(EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        enterOtp.setText("");
    }

    public static final void p3(MobUpdateAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.dial;
        if (dialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dial");
            dialog = null;
        }
        dialog.dismiss();
    }

    public static final void q3(EditText enterOtp, ImageView shownPin, View view) {
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

    public static final void r3(MobUpdateAdhar this$0, TextView time_text, TextView resendOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(time_text, "$time_text");
        Intrinsics.checkNotNullParameter(resendOtp, "$resendOtp");
        try {
            this$0.t2().show();
            new k(time_text, resendOtp).start();
            String string = StringsKt__StringsKt.trim((CharSequence) this$0.l2().g.getText().toString()).toString();
            Charset charsetForName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
            byte[] bytes = string.getBytes(charsetForName);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            Base64.encodeToString(bytes, 0);
            int iNextInt = new Random().nextInt(1410065407);
            qi5.a aVar = qi5.a;
            String strC = aVar.c(this$0);
            Intrinsics.checkNotNull(strC);
            this$0.nk = strC;
            this$0.p2().o(aVar.b(StringsKt__StringsKt.trim((CharSequence) this$0.l2().g.getText().toString()).toString()), "sarEtrans25Ms", this$0.nk, String.valueOf(iNextInt));
        } catch (Exception unused) {
        }
    }

    public static final void s3(EditText enterOtp, final MobUpdateAdhar this$0, ImageView ok_button, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(ok_button, "$ok_button");
        try {
            String string = enterOtp.getText().toString();
            if (string.length() == 0) {
                Toast.makeText(this$0, this$0.n2().b("label_log_entr_otp", this$0.getString(R.string.pls_enter_otp)), 0).show();
            } else if (string.length() < 6) {
                Toast.makeText(this$0, this$0.n2().b("label_log_entr_val_otp", this$0.getString(R.string.pls_enter_valid_otp)), 0).show();
            } else {
                this$0.t2().show();
                this$0.p2().p(qi5.a.b(StringsKt__StringsKt.trim((CharSequence) this$0.l2().g.getText().toString()).toString()), "sarEtrans25Ms", enterOtp.getText().toString(), String.valueOf(this$0.txnNo), this$0.nk);
            }
            ok_button.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ov3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MobUpdateAdhar.t3(this.a, view2);
                }
            });
        } catch (Exception unused) {
        }
    }

    public static final void t3(MobUpdateAdhar this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.dial;
        if (dialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dial");
            dialog = null;
        }
        dialog.dismiss();
    }

    private final void z2() {
        k3(new ws6(this));
        X2(new wa3(this));
        h3(EkYCService.INSTANCE.a(this));
        g3(VahanProService.INSTANCE.a(this));
        e3(new ProgressDialog(this));
        t2().setMessage(n2().b("label_challan_please_wait", "Please wait..."));
        t2().setCancelable(false);
        t2().setCanceledOnTouchOutside(false);
        c3((v14) new z(this, new w14(new t14(this.napixService))).a(v14.class));
        s2().h();
        s2().g().g(this, new mf4() { // from class: com.zepto.vv3
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                MobUpdateAdhar.A2((NapixTokenModel) obj);
            }
        });
        if (Intrinsics.areEqual(x2().b(), VContant.MAINSCREEN)) {
            this.serviceCode = 514;
        } else if (Intrinsics.areEqual(x2().b(), VContant.APPLICATION_SCREEN)) {
            this.serviceCode = 513;
        } else if (Intrinsics.areEqual(x2().b(), "3")) {
            this.serviceCode = 515;
        } else if (Intrinsics.areEqual(x2().b(), "4")) {
            this.serviceCode = 525;
        } else if (Intrinsics.areEqual(x2().b(), VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE)) {
            this.serviceCode = 523;
        } else if (Intrinsics.areEqual(x2().b(), VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE)) {
            this.serviceCode = 516;
        } else {
            this.serviceCode = Integer.parseInt(x2().b());
        }
        if (getIntent() != null) {
            Serializable serializableExtra = getIntent().getSerializableExtra("DLDetails");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
            T2((DldetobjX) serializableExtra);
            this.dob = m2().getBioObj().getBioDob();
            this.dlNo = StringsKt__StringsKt.trim((CharSequence) m2().getDlobj().getDlLicno()).toString();
            String str = this.dob;
            Intrinsics.checkNotNull(str);
            Log.d("d11", str);
        }
        TextView textView = l2().m;
        String str2 = this.dlNo;
        Intrinsics.checkNotNull(str2);
        textView.setText(StringsKt__StringsKt.trim((CharSequence) str2).toString());
        f3(DlServiceInt.INSTANCE.a(q2()));
        U2((nr1) new z(this, new rq1(new lr1(u2(), this))).a(nr1.class));
        b3((aj5) new z(this, new zi5(new yi5(w2()))).a(aj5.class));
        m3((ld7) new z(this, new kd7(new jd7(v2()))).a(ld7.class));
        Y2(AdrInterface.INSTANCE.a(q2()));
        Z2((ml) new z(this, new ol(new pl(o2()))).a(ml.class));
        l2().m.setText(this.dlNo);
        l2().i.g.setText(x2().k());
    }

    public final void N2(Context context, String message) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById3 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById3;
        ((TextView) viewFindViewById2).setText(message);
        ((TextView) viewFindViewById).setText(n2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(n2().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dv3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobUpdateAdhar.O2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void P2(Aadarkyc.DOEkyc dOEkyc) {
        Intrinsics.checkNotNullParameter(dOEkyc, "<set-?>");
        this.aadhaarData = dOEkyc;
    }

    public final void Q2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhaarLastFourDigitMobileNo = str;
    }

    public final void R2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.address = str;
    }

    public final void S2(od odVar) {
        Intrinsics.checkNotNullParameter(odVar, "<set-?>");
        this.binding = odVar;
    }

    public final void T2(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dlDetails = dldetobjX;
    }

    public final void U2(nr1 nr1Var) {
        Intrinsics.checkNotNullParameter(nr1Var, "<set-?>");
        this.dlServicesViewModel = nr1Var;
    }

    public final void V2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eKYCGender = str;
    }

    public final void W2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ePhoto = str;
    }

    public final void X2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void Y2(AdrInterface adrInterface) {
        Intrinsics.checkNotNullParameter(adrInterface, "<set-?>");
        this.mAadharInterface2 = adrInterface;
    }

    public final void Z2(ml mlVar) {
        Intrinsics.checkNotNullParameter(mlVar, "<set-?>");
        this.mAadharViewModel2 = mlVar;
    }

    public final void a3(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void b3(aj5 aj5Var) {
        Intrinsics.checkNotNullParameter(aj5Var, "<set-?>");
        this.mView = aj5Var;
    }

    public final void c3(v14 v14Var) {
        Intrinsics.checkNotNullParameter(v14Var, "<set-?>");
        this.napixViewModel = v14Var;
    }

    public final void d3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.owner_name_addhaar = str;
    }

    public final void e3(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void f3(DlServiceInt dlServiceInt) {
        Intrinsics.checkNotNullParameter(dlServiceInt, "<set-?>");
        this.retrofitService = dlServiceInt;
    }

    public final void g3(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitServiceVahan = vahanProService;
    }

    public final void h3(EkYCService ekYCService) {
        Intrinsics.checkNotNullParameter(ekYCService, "<set-?>");
        this.retrofitService_one = ekYCService;
    }

    public final void i3(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final void j3(int i2) {
        this.serviceCode = i2;
    }

    public final Aadarkyc.DOEkyc k2() {
        Aadarkyc.DOEkyc dOEkyc = this.aadhaarData;
        if (dOEkyc != null) {
            return dOEkyc;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhaarData");
        return null;
    }

    public final void k3(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final od l2() {
        od odVar = this.binding;
        if (odVar != null) {
            return odVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void l3(String str) {
        this.txnNo = str;
    }

    public final DldetobjX m2() {
        DldetobjX dldetobjX = this.dlDetails;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlDetails");
        return null;
    }

    public final void m3(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModelv1 = ld7Var;
    }

    public final wa3 n2() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final void n3(Context context, String mobile_no) {
        ImageView imageView;
        int i2;
        String str;
        Dialog dialog;
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
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView2 = (ImageView) viewFindViewById;
        Dialog dialog7 = this.dial;
        if (dialog7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dial");
            dialog7 = null;
        }
        View viewFindViewById2 = dialog7.findViewById(R.id.resendOtp);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        final TextView textView = (TextView) viewFindViewById2;
        Dialog dialog8 = this.dial;
        if (dialog8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dial");
            dialog8 = null;
        }
        View viewFindViewById3 = dialog8.findViewById(R.id.showmpin);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.ImageView");
        final ImageView imageView3 = (ImageView) viewFindViewById3;
        Dialog dialog9 = this.dial;
        if (dialog9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dial");
            dialog9 = null;
        }
        View viewFindViewById4 = dialog9.findViewById(R.id.submitOtp);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById4;
        Dialog dialog10 = this.dial;
        if (dialog10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dial");
            dialog10 = null;
        }
        View viewFindViewById5 = dialog10.findViewById(R.id.enterOtp);
        Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText = (EditText) viewFindViewById5;
        Dialog dialog11 = this.dial;
        if (dialog11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dial");
            dialog11 = null;
        }
        View viewFindViewById6 = dialog11.findViewById(R.id.time_text);
        Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.TextView");
        final TextView textView3 = (TextView) viewFindViewById6;
        Dialog dialog12 = this.dial;
        if (dialog12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dial");
            dialog12 = null;
        }
        View viewFindViewById7 = dialog12.findViewById(R.id.txt_reset);
        Intrinsics.checkNotNull(viewFindViewById7, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView4 = (TextView) viewFindViewById7;
        Dialog dialog13 = this.dial;
        if (dialog13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dial");
            dialog13 = null;
        }
        View viewFindViewById8 = dialog13.findViewById(R.id.disPlay_mobile);
        Intrinsics.checkNotNull(viewFindViewById8, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView5 = (TextView) viewFindViewById8;
        Dialog dialog14 = this.dial;
        if (dialog14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dial");
            imageView = imageView2;
            i2 = R.id.pop_up_close;
            dialog14 = null;
        } else {
            imageView = imageView2;
            i2 = R.id.pop_up_close;
        }
        View viewFindViewById9 = dialog14.findViewById(i2);
        Intrinsics.checkNotNull(viewFindViewById9, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView4 = (ImageView) viewFindViewById9;
        Dialog dialog15 = this.dial;
        if (dialog15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dial");
            dialog15 = null;
        }
        View viewFindViewById10 = dialog15.findViewById(R.id.disPlay);
        Intrinsics.checkNotNull(viewFindViewById10, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView6 = (TextView) viewFindViewById10;
        Dialog dialog16 = this.dial;
        if (dialog16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dial");
            str = "dial";
            dialog16 = null;
        } else {
            str = "dial";
        }
        View viewFindViewById11 = dialog16.findViewById(R.id.enter_otp_txt);
        Intrinsics.checkNotNull(viewFindViewById11, "null cannot be cast to non-null type android.widget.TextView");
        textView4.setText(n2().b("btn_reset", getString(R.string.reset)));
        textView4.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gv3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobUpdateAdhar.o3(editText, view);
            }
        });
        textView2.setText(n2().b("vahan_btn_submit", getString(R.string.submit)));
        textView.setText(n2().b("label_resend_otp", getString(R.string.resend_otp)));
        textView6.setText(n2().b("otp_verification", getString(R.string.otp_verification)));
        ((TextView) viewFindViewById11).setText(n2().b("label_dl_serv_enter_otp", context.getString(R.string.enter_otp)));
        editText.setHint(n2().b("label_dl_serv_enter_otp", context.getString(R.string.enter_otp)));
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hv3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobUpdateAdhar.p3(this.a, view);
            }
        });
        try {
            textView5.setText(n2().b("label_otp_sent_to_mobile", context.getString(R.string.otp_sent)) + "\n+91-XXXXXX" + mobile_no);
        } catch (Exception unused) {
            textView5.setText(n2().b("label_otp_sent_to_mobile", context.getString(R.string.otp_sent)));
        }
        new j(textView3, textView).start();
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.iv3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobUpdateAdhar.q3(editText, imageView3, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kv3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobUpdateAdhar.r3(this.a, textView3, textView, view);
            }
        });
        final ImageView imageView5 = imageView;
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lv3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobUpdateAdhar.s3(editText, this, imageView5, view);
            }
        });
        Dialog dialog17 = this.dial;
        if (dialog17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            dialog = null;
        } else {
            dialog = dialog17;
        }
        dialog.show();
    }

    public final AdrInterface o2() {
        AdrInterface adrInterface = this.mAadharInterface2;
        if (adrInterface != null) {
            return adrInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAadharInterface2");
        return null;
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        od odVarC = od.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(odVarC, "inflate(...)");
        S2(odVarC);
        setContentView(l2().b());
        a3(this);
        X2(new wa3(q2()));
        i3(new wl5(this));
        ta3.a.q1(q2(), l2());
        try {
            l2().h.g.setText(n2().b("label_dl_serv_update_mob", "Update Mobile Number"));
            l2().h.h.setVisibility(8);
            l2().h.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yu3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MobUpdateAdhar.G2(this.a, view);
                }
            });
        } catch (Exception unused) {
        }
        z2();
        h2();
        B2();
        l2().h.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jv3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobUpdateAdhar.H2(this.a, view);
            }
        });
        l2().b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.pv3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MobUpdateAdhar.I2(this.a, compoundButton, z);
            }
        });
        l2().p.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.qv3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MobUpdateAdhar.J2(this.a, compoundButton, z);
            }
        });
        l2().c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rv3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobUpdateAdhar.K2(this.a, view);
            }
        });
        l2().k.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sv3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobUpdateAdhar.M2(this.a, view);
            }
        });
    }

    public final ml p2() {
        ml mlVar = this.mAadharViewModel2;
        if (mlVar != null) {
            return mlVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAadharViewModel2");
        return null;
    }

    public final Context q2() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final aj5 r2() {
        aj5 aj5Var = this.mView;
        if (aj5Var != null) {
            return aj5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mView");
        return null;
    }

    public final v14 s2() {
        v14 v14Var = this.napixViewModel;
        if (v14Var != null) {
            return v14Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("napixViewModel");
        return null;
    }

    public final ProgressDialog t2() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final DlServiceInt u2() {
        DlServiceInt dlServiceInt = this.retrofitService;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final VahanProService v2() {
        VahanProService vahanProService = this.retrofitServiceVahan;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitServiceVahan");
        return null;
    }

    public final EkYCService w2() {
        EkYCService ekYCService = this.retrofitService_one;
        if (ekYCService != null) {
            return ekYCService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService_one");
        return null;
    }

    public final wl5 x2() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    /* JADX INFO: renamed from: y2, reason: from getter */
    public final String getTxnNo() {
        return this.txnNo;
    }
}
