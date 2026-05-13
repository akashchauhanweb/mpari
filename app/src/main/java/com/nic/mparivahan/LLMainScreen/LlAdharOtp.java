package com.nic.mparivahan.LLMainScreen;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.DLServicesAuth.Model.CustomState.CustomState;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycModel.ApiMessage;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycModel.Data;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycModel.eKycResponse;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse.DOAadhaarResponse;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse.DOEkyc;
import com.nic.mparivahan.DLServicesAuth.Wrapper.EkycResponse.EkycVerifyResponse;
import com.nic.mparivahan.DLServicesAuth.eKyc.AadharInterface;
import com.nic.mparivahan.DLServicesAuth.eKyc.AdharKyc.AdrInterface;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.DOEkycX;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.OtpAdharRes;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.TokenGeneration;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.UserFullDetails;
import com.nic.mparivahan.DLServicesAuth.eKyc.Pojo.SubmitAdharApi;
import com.nic.mparivahan.LLMainScreen.LlAdharOtp;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.LLServices.UI.ChangeAddressLL;
import com.nic.mparivahan.LLServices.UI.ChangeNameLL;
import com.nic.mparivahan.LLServices.UI.DuplicateLL;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.Aadarkyc;
import com.nic.mparivahan.VahanEkyc.AadarkycVerify;
import com.nic.mparivahan.VahanEkyc.EkYCService;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.zepto.aj5;
import com.zepto.jd7;
import com.zepto.jl;
import com.zepto.kd7;
import com.zepto.kl;
import com.zepto.lc;
import com.zepto.ld7;
import com.zepto.ll;
import com.zepto.lr1;
import com.zepto.mf4;
import com.zepto.ml;
import com.zepto.nr1;
import com.zepto.ol;
import com.zepto.pl;
import com.zepto.pq;
import com.zepto.qi5;
import com.zepto.rq1;
import com.zepto.vh7;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.ws6;
import com.zepto.yi5;
import com.zepto.zi5;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.ParseException;
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
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bß\u0001\u0010à\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014J\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0016\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fR\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010;\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010?\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00106\u001a\u0004\b=\u00108\"\u0004\b>\u0010:R\"\u0010C\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u00106\u001a\u0004\bA\u00108\"\u0004\bB\u0010:R\"\u0010G\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u00106\u001a\u0004\bE\u00108\"\u0004\bF\u0010:R\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NRF\u0010X\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f0Pj\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f`Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010_\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010o\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010w\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010\u007f\u001a\u00020x8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R*\u0010\u0087\u0001\u001a\u00030\u0080\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R&\u0010\u008b\u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0088\u0001\u00106\u001a\u0005\b\u0089\u0001\u00108\"\u0005\b\u008a\u0001\u0010:R*\u0010\u0093\u0001\u001a\u00030\u008c\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R*\u0010\u009b\u0001\u001a\u00030\u0094\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R*\u0010£\u0001\u001a\u00030\u009c\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R*\u0010«\u0001\u001a\u00030¤\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R&\u0010¯\u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¬\u0001\u00106\u001a\u0005\b\u00ad\u0001\u00108\"\u0005\b®\u0001\u0010:R&\u0010³\u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b°\u0001\u00106\u001a\u0005\b±\u0001\u00108\"\u0005\b²\u0001\u0010:R&\u0010·\u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b´\u0001\u00106\u001a\u0005\bµ\u0001\u00108\"\u0005\b¶\u0001\u0010:R&\u0010»\u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¸\u0001\u00106\u001a\u0005\b¹\u0001\u00108\"\u0005\bº\u0001\u0010:R)\u0010Â\u0001\u001a\u00030¼\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b½\u0001\u0010@\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001R*\u0010Ê\u0001\u001a\u00030Ã\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R*\u0010Ò\u0001\u001a\u00030Ë\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001R\u0018\u0010Ô\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÓ\u0001\u00106R\u0018\u0010Ö\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÕ\u0001\u00106R\u0018\u0010Ø\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b×\u0001\u00106R\u0018\u0010Ú\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÙ\u0001\u00106R\u001a\u0010Þ\u0001\u001a\u00030Û\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÜ\u0001\u0010Ý\u0001¨\u0006á\u0001"}, d2 = {"Lcom/nic/mparivahan/LLMainScreen/LlAdharOtp;", "Lcom/zepto/pq;", "", "Z1", "h2", "A1", "Y1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "f2", "mobile_no", "F2", "fdate", "E1", "aadhaarNumber", "D1", "Lcom/zepto/lc;", "C", "Lcom/zepto/lc;", "F1", "()Lcom/zepto/lc;", "j2", "(Lcom/zepto/lc;)V", "binding", "Lcom/zepto/wl5;", "D", "Lcom/zepto/wl5;", "U1", "()Lcom/zepto/wl5;", "A2", "(Lcom/zepto/wl5;)V", "sarthiSession", "Lcom/zepto/ws6;", "E", "Lcom/zepto/ws6;", "W1", "()Lcom/zepto/ws6;", "C2", "(Lcom/zepto/ws6;)V", "sessionManager", "Lcom/zepto/wa3;", "F", "Lcom/zepto/wa3;", "I1", "()Lcom/zepto/wa3;", "o2", "(Lcom/zepto/wa3;)V", "langSession", "G", "Ljava/lang/String;", "getMobNo", "()Ljava/lang/String;", "setMobNo", "(Ljava/lang/String;)V", "mobNo", "H", "X1", "D2", "txnNo", "I", "getOwner_name_addhaar", "w2", "owner_name_addhaar", "J", "getAddress", "i2", "address", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "K", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "J1", "()Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "p2", "(Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;)V", "llDetails", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "L", "Ljava/util/HashMap;", "getWhatServiceRequired", "()Ljava/util/HashMap;", "setWhatServiceRequired", "(Ljava/util/HashMap;)V", "whatServiceRequired", "M", "Landroid/content/Context;", "O1", "()Landroid/content/Context;", "u2", "(Landroid/content/Context;)V", "mContext", "Landroid/app/ProgressDialog;", "N", "Landroid/app/ProgressDialog;", "Q1", "()Landroid/app/ProgressDialog;", "x2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/aj5;", "O", "Lcom/zepto/aj5;", "P1", "()Lcom/zepto/aj5;", "v2", "(Lcom/zepto/aj5;)V", "mView", "Lcom/nic/mparivahan/VahanEkyc/EkYCService;", "P", "Lcom/nic/mparivahan/VahanEkyc/EkYCService;", "T1", "()Lcom/nic/mparivahan/VahanEkyc/EkYCService;", "z2", "(Lcom/nic/mparivahan/VahanEkyc/EkYCService;)V", "retrofitService_one", "Lcom/zepto/ll;", "Q", "Lcom/zepto/ll;", "M1", "()Lcom/zepto/ll;", "s2", "(Lcom/zepto/ll;)V", "mAadharViewModel", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/AadharInterface;", "R", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/AadharInterface;", "K1", "()Lcom/nic/mparivahan/DLServicesAuth/eKyc/AadharInterface;", "q2", "(Lcom/nic/mparivahan/DLServicesAuth/eKyc/AadharInterface;)V", "mAadharInterface", "S", "getAllowAddrChangeAtDlservReqst", "setAllowAddrChangeAtDlservReqst", "allowAddrChangeAtDlservReqst", "Lcom/zepto/nr1;", "T", "Lcom/zepto/nr1;", "G1", "()Lcom/zepto/nr1;", "k2", "(Lcom/zepto/nr1;)V", "dlServicesViewModel", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "U", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "R1", "()Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "y2", "(Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;)V", "retrofitService", "Lcom/zepto/ml;", "V", "Lcom/zepto/ml;", "N1", "()Lcom/zepto/ml;", "t2", "(Lcom/zepto/ml;)V", "mAadharViewModel2", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/AdharKyc/AdrInterface;", "W", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/AdharKyc/AdrInterface;", "L1", "()Lcom/nic/mparivahan/DLServicesAuth/eKyc/AdharKyc/AdrInterface;", "r2", "(Lcom/nic/mparivahan/DLServicesAuth/eKyc/AdharKyc/AdrInterface;)V", "mAadharInterface2", "X", "getType", "setType", "type", "Y", "getEKYCId", "m2", "eKYCId", "Z", "H1", "n2", "ePhoto", "a0", "getEKYCGender", "l2", "eKYCGender", "", "b0", "V1", "()I", "B2", "(I)V", "serviceCode", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "c0", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "S1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "setRetrofitServiceVahan", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitServiceVahan", "Lcom/zepto/ld7;", "d0", "Lcom/zepto/ld7;", "getViewModelv1", "()Lcom/zepto/ld7;", "E2", "(Lcom/zepto/ld7;)V", "viewModelv1", "e0", "tokenAdhar", "f0", "traceId", "g0", "tokenService", "h0", "nk", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkycX;", "i0", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkycX;", "adharData", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class LlAdharOtp extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public lc binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String txnNo;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public FetchLlDetails llDetails;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public aj5 mView;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public EkYCService retrofitService_one;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public ll mAadharViewModel;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public AadharInterface mAadharInterface;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public nr1 dlServicesViewModel;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public DlServiceInt retrofitService;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public ml mAadharViewModel2;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public AdrInterface mAadharInterface2;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public int serviceCode;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public VahanProService retrofitServiceVahan;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public ld7 viewModelv1;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public DOEkycX adharData;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String mobNo = "";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String owner_name_addhaar = "NA";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String address = "NA";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public HashMap whatServiceRequired = new HashMap();

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String allowAddrChangeAtDlservReqst = "allowAddrChange";

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String type = "A";

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String eKYCId = "NA";

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String ePhoto = "NA";

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String eKYCGender = "NA";

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public String tokenAdhar = "";

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public String traceId = "";

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public String tokenService = "";

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public String nk = "";

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(TokenGeneration tokenGeneration) {
            try {
                if (StringsKt__StringsJVMKt.equals(tokenGeneration.getStatus(), "Success", true)) {
                    LlAdharOtp.this.tokenAdhar = tokenGeneration.getAuthorization();
                    LlAdharOtp.this.traceId = tokenGeneration.getTraceId();
                    LlAdharOtp.this.tokenService = tokenGeneration.getServiceId();
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

    public static final class b extends Lambda implements Function1 {
        public b() {
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
            LlAdharOtp.this.Q1().cancel();
            try {
                if (StringsKt__StringsJVMKt.equals(otpAdharRes.getStatus(), "Success", true)) {
                    LlAdharOtp.this.D2(StringsKt__StringsKt.trim((CharSequence) otpAdharRes.getTxnNo()).toString());
                    LlAdharOtp llAdharOtp = LlAdharOtp.this;
                    llAdharOtp.F2(llAdharOtp, otpAdharRes.getDOAuthOTP().getLast_four_mobile());
                } else {
                    LlAdharOtp llAdharOtp2 = LlAdharOtp.this;
                    llAdharOtp2.f2(llAdharOtp2, "Unable to process the request, Please try after some time");
                }
            } catch (Exception unused) {
                LlAdharOtp llAdharOtp3 = LlAdharOtp.this;
                llAdharOtp3.f2(llAdharOtp3, "Unable to process the request, Please try after some time");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OtpAdharRes) obj);
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
            LlAdharOtp.this.Q1().cancel();
            LlAdharOtp llAdharOtp = LlAdharOtp.this;
            llAdharOtp.f2(llAdharOtp, "Unable to process the request, Please try after some time");
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
        public final void a(UserFullDetails userFullDetails) {
            try {
                Log.d("userDetails_api", userFullDetails.toString());
                if (!StringsKt__StringsJVMKt.equals(userFullDetails.getStatus(), "Y", true)) {
                    LlAdharOtp.this.Q1().dismiss();
                    LlAdharOtp llAdharOtp = LlAdharOtp.this;
                    llAdharOtp.f2(llAdharOtp, "Unable to proceed your request, Please try after some time");
                    return;
                }
                LlAdharOtp.this.adharData = userFullDetails.getDOEkyc();
                String house = userFullDetails.getDOEkyc().getHouse() != null ? userFullDetails.getDOEkyc().getHouse() : "NA";
                String landMark = userFullDetails.getDOEkyc().getLandMark() != null ? userFullDetails.getDOEkyc().getLandMark() : "NA";
                String localityIfAny = userFullDetails.getDOEkyc().getLocalityIfAny() != null ? userFullDetails.getDOEkyc().getLocalityIfAny() : "NA";
                String name = userFullDetails.getDOEkyc().getName() != null ? userFullDetails.getDOEkyc().getName() : "NA";
                userFullDetails.getDOEkyc().getPhone();
                String strValueOf = String.valueOf(userFullDetails.getDOEkyc().getPhone());
                if (userFullDetails.getDOEkyc().getPht() != null) {
                    LlAdharOtp.this.n2(userFullDetails.getDOEkyc().getPht());
                }
                String pincode = userFullDetails.getDOEkyc().getPincode() != null ? userFullDetails.getDOEkyc().getPincode() : "NA";
                String state = userFullDetails.getDOEkyc().getState() != null ? userFullDetails.getDOEkyc().getState() : "NA";
                String street = userFullDetails.getDOEkyc().getStreet() != null ? userFullDetails.getDOEkyc().getStreet() : "NA";
                String status = userFullDetails.getDOEkyc().getStatus() != null ? userFullDetails.getDOEkyc().getStatus() : "NA";
                String villageTownCity = userFullDetails.getDOEkyc().getVillageTownCity() != null ? userFullDetails.getDOEkyc().getVillageTownCity() : "NA";
                String xmlUID = userFullDetails.getDOEkyc().getXmlUID() != null ? userFullDetails.getDOEkyc().getXmlUID() : "NA";
                String code = userFullDetails.getDOEkyc().getCode() != null ? userFullDetails.getDOEkyc().getCode() : "NA";
                if (userFullDetails.getDOEkyc().getGender() != null && StringsKt__StringsJVMKt.equals(userFullDetails.getDOEkyc().getGender(), "M", true)) {
                    LlAdharOtp.this.l2("M");
                }
                if (Intrinsics.areEqual(LlAdharOtp.this.U1().b(), VContant.MAINSCREEN)) {
                    LlAdharOtp.this.B2(514);
                } else if (Intrinsics.areEqual(LlAdharOtp.this.U1().b(), VContant.APPLICATION_SCREEN)) {
                    LlAdharOtp.this.B2(513);
                } else if (Intrinsics.areEqual(LlAdharOtp.this.U1().b(), "3")) {
                    LlAdharOtp.this.B2(515);
                } else if (Intrinsics.areEqual(LlAdharOtp.this.U1().b(), "4")) {
                    LlAdharOtp.this.B2(525);
                } else if (Intrinsics.areEqual(LlAdharOtp.this.U1().b(), VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE)) {
                    LlAdharOtp.this.B2(523);
                } else if (Intrinsics.areEqual(LlAdharOtp.this.U1().b(), VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE)) {
                    LlAdharOtp.this.B2(516);
                } else {
                    LlAdharOtp llAdharOtp2 = LlAdharOtp.this;
                    llAdharOtp2.B2(Integer.parseInt(llAdharOtp2.U1().b()));
                }
                ll llVarM1 = LlAdharOtp.this.M1();
                String string = StringsKt__StringsKt.trim((CharSequence) LlAdharOtp.this.F1().d.getText().toString()).toString();
                String careOf = userFullDetails.getDOEkyc().getCareOf();
                Intrinsics.checkNotNull(careOf);
                String string2 = StringsKt__StringsKt.trim((CharSequence) careOf).toString();
                String dist = userFullDetails.getDOEkyc().getDist();
                String dob = userFullDetails.getDOEkyc().getDob();
                String gender = userFullDetails.getDOEkyc().getGender();
                String ePhoto = LlAdharOtp.this.getEPhoto();
                String string3 = StringsKt__StringsKt.trim((CharSequence) LlAdharOtp.this.J1().getLearningLicence()).toString();
                String string4 = StringsKt__StringsKt.trim((CharSequence) LlAdharOtp.this.J1().getFullName()).toString();
                LlAdharOtp llAdharOtp3 = LlAdharOtp.this;
                String strE1 = llAdharOtp3.E1(StringsKt__StringsKt.trim((CharSequence) llAdharOtp3.J1().getDateOfBirth()).toString());
                Intrinsics.checkNotNull(strE1);
                String swdFullName = LlAdharOtp.this.J1().getApplicantAddress().getSwdFullName();
                int serviceCode = LlAdharOtp.this.getServiceCode();
                String txnNo = LlAdharOtp.this.getTxnNo();
                Intrinsics.checkNotNull(txnNo);
                llVarM1.q(string, string2, code, dist, dob, gender, house, landMark, localityIfAny, name, strValueOf, ePhoto, pincode, state, status, street, villageTownCity, xmlUID, string3, string4, strE1, swdFullName, serviceCode, "Y", txnNo, StringsKt__StringsKt.trim((CharSequence) LlAdharOtp.this.F1().d.getText().toString()).toString(), LlAdharOtp.this.J1().getState().getStCd());
            } catch (Exception unused) {
                LlAdharOtp.this.Q1().dismiss();
                LlAdharOtp llAdharOtp4 = LlAdharOtp.this;
                llAdharOtp4.f2(llAdharOtp4, "Unable to proceed your request, Please try after some time");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((UserFullDetails) obj);
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
            LlAdharOtp.this.Q1().dismiss();
            LlAdharOtp llAdharOtp = LlAdharOtp.this;
            llAdharOtp.f2(llAdharOtp, "Unable to proceed your request, Please try after some time");
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
        public final void a(SubmitAdharApi submitAdharApi) {
            LlAdharOtp.this.Q1().dismiss();
            try {
                if (StringsKt__StringsJVMKt.equals(submitAdharApi.getStatusCode(), "EKYC001", true)) {
                    try {
                        LlAdharOtp.this.m2(StringsKt__StringsKt.trim((CharSequence) String.valueOf(submitAdharApi.getEkycId())).toString());
                        LlAdharOtp.this.h2();
                    } catch (Exception unused) {
                        LlAdharOtp.this.U1().q("NA", "N", "NA", "NA");
                    }
                } else {
                    LlAdharOtp llAdharOtp = LlAdharOtp.this;
                    llAdharOtp.f2(llAdharOtp, submitAdharApi.getStatusDesc());
                }
            } catch (Exception unused2) {
                LlAdharOtp.this.U1().q("NA", "N", "NA", "NA");
                LlAdharOtp llAdharOtp2 = LlAdharOtp.this;
                llAdharOtp2.f2(llAdharOtp2, llAdharOtp2.I1().b("service_is_not_present", LlAdharOtp.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SubmitAdharApi) obj);
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
        public final void a(AadarkycVerify.Response response) {
            AadarkycVerify.dOEkyc dOAuthOTP;
            AadarkycVerify.dOEkyc dOAuthOTP2;
            String last_four_mobile;
            AadarkycVerify.dOEkyc dOAuthOTP3;
            AadarkycVerify.dOEkyc dOAuthOTP4;
            Log.e("adhResp_kyc", response.toString());
            LlAdharOtp.this.Q1().dismiss();
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
                            LlAdharOtp.this.D2(String.valueOf(doAadhaarResponse.getTxnNo()));
                            String txnNo = LlAdharOtp.this.getTxnNo();
                            Intrinsics.checkNotNull(txnNo);
                            Log.d("txnNo", txnNo);
                            LlAdharOtp llAdharOtp = LlAdharOtp.this;
                            AadarkycVerify.dOEkyc dOAuthOTP5 = doAadhaarResponse.getDOAuthOTP();
                            llAdharOtp.F2(llAdharOtp, String.valueOf(dOAuthOTP5 != null ? dOAuthOTP5.getLast_four_mobile() : null));
                            return;
                        }
                    }
                }
                Log.e("CCTVlOGE", "3");
                String reason = doAadhaarResponse != null ? doAadhaarResponse.getReason() : null;
                if (reason != null && reason.length() != 0) {
                    Log.v("reason fail", String.valueOf(doAadhaarResponse != null ? doAadhaarResponse.getReason() : null));
                    if (StringsKt__StringsKt.contains((CharSequence) String.valueOf(doAadhaarResponse != null ? doAadhaarResponse.getReason() : null), (CharSequence) "Invalid Auth Xml Format", true)) {
                        LlAdharOtp llAdharOtp2 = LlAdharOtp.this;
                        llAdharOtp2.f2(llAdharOtp2, "Invalid Aadhaar No.\nPlease try again");
                        return;
                    } else {
                        LlAdharOtp llAdharOtp3 = LlAdharOtp.this;
                        llAdharOtp3.f2(llAdharOtp3, String.valueOf(doAadhaarResponse != null ? doAadhaarResponse.getReason() : null));
                        return;
                    }
                }
                LlAdharOtp llAdharOtp4 = LlAdharOtp.this;
                llAdharOtp4.f2(llAdharOtp4, llAdharOtp4.I1().b("service_is_not_present", LlAdharOtp.this.getString(R.string.unable_to_get_details)));
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
            Log.e("adhResp_kyc_err", str.toString());
            LlAdharOtp.this.Q1().dismiss();
        }
    }

    public static final class i extends Lambda implements Function1 {
        public i() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
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
        public final void a(com.nic.mparivahan.VahanEkyc.Aadarkyc.Response r33) {
            /*
                Method dump skipped, instruction units count: 1052
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.LLMainScreen.LlAdharOtp.i.a(com.nic.mparivahan.VahanEkyc.Aadarkyc$Response):void");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Aadarkyc.Response) obj);
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
            LlAdharOtp.this.Q1().dismiss();
        }
    }

    public static final class k extends Lambda implements Function1 {
        public k() {
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
        public final void a(SubmitAdharApi submitAdharApi) {
            LlAdharOtp.this.Q1().dismiss();
            try {
                Log.e("adhResp_submit", submitAdharApi.toString());
                if (!StringsKt__StringsJVMKt.equals(submitAdharApi.getStatusCode(), "EKYC001", true)) {
                    LlAdharOtp llAdharOtp = LlAdharOtp.this;
                    llAdharOtp.f2(llAdharOtp, submitAdharApi.getStatusDesc());
                    return;
                }
                try {
                    LlAdharOtp.this.m2(StringsKt__StringsKt.trim((CharSequence) String.valueOf(submitAdharApi.getEkycId())).toString());
                    if (Intrinsics.areEqual(LlAdharOtp.this.U1().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                        return;
                    }
                    if (Intrinsics.areEqual(LlAdharOtp.this.U1().b(), "574")) {
                        Intent intent = new Intent(LlAdharOtp.this, (Class<?>) ChangeNameLL.class);
                        intent.putExtra("LLDetails", LlAdharOtp.this.J1());
                        intent.putExtra("Mobile_no", LlAdharOtp.this.W1().l());
                        LlAdharOtp.this.startActivity(intent);
                        LlAdharOtp.this.finish();
                    } else if (Intrinsics.areEqual(LlAdharOtp.this.U1().b(), "504")) {
                        Intent intent2 = new Intent(LlAdharOtp.this, (Class<?>) ChangeAddressLL.class);
                        intent2.putExtra("LLDetails", LlAdharOtp.this.J1());
                        intent2.putExtra("Mobile_no", LlAdharOtp.this.W1().l());
                        LlAdharOtp.this.startActivity(intent2);
                        LlAdharOtp.this.startActivity(intent2);
                        LlAdharOtp.this.finish();
                    } else if (Intrinsics.areEqual(LlAdharOtp.this.U1().b(), "502")) {
                        Intent intent3 = new Intent(LlAdharOtp.this, (Class<?>) DuplicateLL.class);
                        intent3.putExtra("LLDetails", LlAdharOtp.this.J1());
                        intent3.putExtra("Mobile_no", LlAdharOtp.this.W1().l());
                        LlAdharOtp.this.startActivity(intent3);
                        LlAdharOtp.this.startActivity(intent3);
                        LlAdharOtp.this.finish();
                    }
                    LlAdharOtp.this.finish();
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                LlAdharOtp llAdharOtp2 = LlAdharOtp.this;
                llAdharOtp2.f2(llAdharOtp2, llAdharOtp2.I1().b("service_is_not_present", LlAdharOtp.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SubmitAdharApi) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class l extends Lambda implements Function1 {
        public l() {
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
            LlAdharOtp.this.Q1().dismiss();
            try {
                Log.e("adhResp_submit_err", str.toString());
                LlAdharOtp llAdharOtp = LlAdharOtp.this;
                llAdharOtp.f2(llAdharOtp, llAdharOtp.I1().b("service_is_not_present", LlAdharOtp.this.getString(R.string.unable_to_get_details)));
            } catch (Exception unused) {
            }
        }
    }

    public static final class m implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public m(Function1 function) {
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

    public static final class n extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ TextView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(TextView textView, TextView textView2) {
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

    public static final class o extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ TextView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(TextView textView, TextView textView2) {
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

    public static final void B1(LlAdharOtp this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.F1().d.getText().clear();
    }

    public static final void C1(LlAdharOtp this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Editable text = this$0.F1().d.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0 && this$0.F1().b.isChecked()) {
            this$0.f2(this$0, "Please enter the Aadhaar Number");
            return;
        }
        if (this$0.F1().d.getText().length() < 12 && this$0.F1().b.isChecked()) {
            this$0.f2(this$0, "Please enter the valid Aadhaar Number");
            return;
        }
        if (this$0.F1().d.getText().length() > 12 && this$0.F1().b.isChecked()) {
            this$0.f2(this$0, "Please enter the valid Aadhaar Number");
            return;
        }
        Editable text2 = this$0.F1().d.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        if (text2.length() == 0 && this$0.F1().j.isChecked()) {
            this$0.f2(this$0, "Please enter the Virtual Id");
            return;
        }
        if (this$0.F1().d.getText().length() < 16 && this$0.F1().j.isChecked()) {
            this$0.f2(this$0, "Please enter the valid Virtual Id");
            return;
        }
        if (!this$0.F1().c.isChecked() && this$0.F1().j.isChecked()) {
            this$0.f2(this$0, "Please agree with VID based e-KYC consent");
            return;
        }
        if (!this$0.F1().c.isChecked() && this$0.F1().b.isChecked()) {
            this$0.f2(this$0, "Please agree with Aadhaar based e-KYC consent");
            return;
        }
        this$0.Q1().show();
        int iNextInt = new Random().nextInt(1410065407);
        String strC = qi5.a.c(this$0);
        Intrinsics.checkNotNull(strC);
        this$0.nk = strC;
        this$0.N1().o(this$0.D1(StringsKt__StringsKt.trim((CharSequence) this$0.F1().d.getText().toString()).toString()), "sarEtrans25Ms", this$0.nk, String.valueOf(iNextInt));
    }

    public static final void G2(final EditText enterOtp, LlAdharOtp this$0, TextView txt_reset, ImageView ok_button, final Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(txt_reset, "$txt_reset");
        Intrinsics.checkNotNullParameter(ok_button, "$ok_button");
        Intrinsics.checkNotNullParameter(d2, "$d");
        String string = enterOtp.getText().toString();
        if (string.length() == 0) {
            Toast.makeText(this$0, this$0.I1().b("label_log_entr_otp", this$0.getString(R.string.pls_enter_otp)), 0).show();
        } else if (string.length() < 6) {
            Toast.makeText(this$0, this$0.I1().b("label_log_entr_val_otp", this$0.getString(R.string.pls_enter_valid_otp)), 0).show();
        } else {
            this$0.Q1().show();
            this$0.N1().p(this$0.D1(StringsKt__StringsKt.trim((CharSequence) this$0.F1().d.getText().toString()).toString()), "sarEtrans25Ms", enterOtp.getText().toString(), String.valueOf(this$0.txnNo), this$0.nk);
        }
        txt_reset.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fg3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LlAdharOtp.H2(enterOtp, view2);
            }
        });
        ok_button.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gg3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LlAdharOtp.I2(d2, view2);
            }
        });
    }

    public static final void H2(EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        enterOtp.setText("");
    }

    public static final void I2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(EditText enterOtp, ImageView shownPin, View view) {
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

    public static final void K2(LlAdharOtp this$0, TextView time_text, TextView resendOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(time_text, "$time_text");
        Intrinsics.checkNotNullParameter(resendOtp, "$resendOtp");
        this$0.Q1().show();
        new o(time_text, resendOtp).start();
        String string = StringsKt__StringsKt.trim((CharSequence) this$0.F1().d.getText().toString()).toString();
        Charset charsetForName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
        byte[] bytes = string.getBytes(charsetForName);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        Base64.encodeToString(bytes, 0);
        int iNextInt = new SecureRandom().nextInt(1410065407);
        String strC = qi5.a.c(this$0);
        Intrinsics.checkNotNull(strC);
        this$0.nk = strC;
        this$0.N1().o(this$0.D1(StringsKt__StringsKt.trim((CharSequence) this$0.F1().d.getText().toString()).toString()), "sarEtrans25Ms", this$0.nk, String.valueOf(iNextInt));
    }

    private final void Y1() {
        try {
            u2(this);
            A2(new wl5(O1()));
            C2(new ws6(O1()));
            o2(new wa3(O1()));
            z2(EkYCService.INSTANCE.a(this));
            x2(new ProgressDialog(O1()));
            Q1().setMessage(I1().b("label_challan_please_wait", "Please wait..."));
            Q1().setCancelable(false);
            Q1().setCanceledOnTouchOutside(false);
            if (getIntent() != null) {
                Serializable serializableExtra = getIntent().getSerializableExtra("LLDetails");
                Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails");
                p2((FetchLlDetails) serializableExtra);
            }
            y2(DlServiceInt.INSTANCE.a(O1()));
            k2((nr1) new z(this, new rq1(new lr1(R1(), this))).a(nr1.class));
            v2((aj5) new z(this, new zi5(new yi5(T1()))).a(aj5.class));
            E2((ld7) new z(this, new kd7(new jd7(S1()))).a(ld7.class));
            q2(AadharInterface.INSTANCE.a(O1()));
            s2((ll) new z(this, new jl(new kl(K1()))).a(ll.class));
            r2(AdrInterface.INSTANCE.a(O1()));
            t2((ml) new z(this, new ol(new pl(L1()))).a(ml.class));
            F1().g.setText(J1().getLearningLicence());
            F1().e.g.setText(U1().k());
        } catch (Exception e2) {
            Log.e("error_adhar", e2.getLocalizedMessage());
        }
    }

    public static final void a2(LlAdharOtp this$0, CustomState customState) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (StringsKt__StringsJVMKt.equals(customState.getStatus_code(), "00", true)) {
                this$0.allowAddrChangeAtDlservReqst = customState.getCustomSt().get(0).getAllowAddrChangeAtDlservReqst();
            }
        } catch (Exception unused) {
        }
    }

    public static final void b2(LlAdharOtp this$0, eKycResponse ekycresponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.Q1().dismiss();
        Log.d("adhar_resp", ekycresponse.toString());
        try {
            ApiMessage apiMessage = ekycresponse.getApiMessage();
            if (apiMessage == null || apiMessage.getStatusCode() != 200) {
                ApiMessage apiMessage2 = ekycresponse.getApiMessage();
                this$0.f2(this$0, String.valueOf(apiMessage2 != null ? apiMessage2.getDeveloperMessage() : null));
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
            this$0.F2(this$0, String.valueOf(data3 != null ? data3.getLastFourMobileNumber() : null));
        } catch (Exception unused) {
            this$0.f2(this$0, "Unable to process the request, Please try after some time");
        }
    }

    public static final void c2(LlAdharOtp this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.Q1().dismiss();
        this$0.f2(this$0, "Unable to process the request, Please try after some time");
    }

    public static final void d2(LlAdharOtp this$0, EkycVerifyResponse ekycVerifyResponse) {
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
        DOEkyc dOEkyc11;
        DOEkyc dOEkyc12;
        DOEkyc dOEkyc13;
        DOEkyc dOEkyc14;
        DOEkyc dOEkyc15;
        DOEkyc dOEkyc16;
        DOEkyc dOEkyc17;
        DOEkyc dOEkyc18;
        DOEkyc dOEkyc19;
        DOEkyc dOEkyc20;
        DOEkyc dOEkyc21;
        DOEkyc dOEkyc22;
        DOEkyc dOEkyc23;
        DOEkyc dOEkyc24;
        DOEkyc dOEkyc25;
        DOEkyc dOEkyc26;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (ekycVerifyResponse != null) {
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
                            if (String.valueOf((dOAadhaarResponse == null || (dOEkyc26 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc26.getName()).length() != 0) {
                                this$0.owner_name_addhaar = String.valueOf((dOAadhaarResponse == null || (dOEkyc = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc.getName());
                            }
                            if (String.valueOf((dOAadhaarResponse == null || (dOEkyc25 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc25.getGender()).length() != 0) {
                                this$0.eKYCGender = String.valueOf((dOAadhaarResponse == null || (dOEkyc2 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc2.getGender());
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append((dOAadhaarResponse == null || (dOEkyc24 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc24.getHouse());
                            sb.append(' ');
                            sb.append((dOAadhaarResponse == null || (dOEkyc23 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc23.getStreet());
                            sb.append(' ');
                            sb.append((dOAadhaarResponse == null || (dOEkyc22 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc22.getLocalityIfAny());
                            sb.append(' ');
                            sb.append((dOAadhaarResponse == null || (dOEkyc21 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc21.getDist());
                            sb.append(' ');
                            sb.append((dOAadhaarResponse == null || (dOEkyc20 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc20.getState());
                            sb.append(' ');
                            sb.append((dOAadhaarResponse == null || (dOEkyc19 = dOAadhaarResponse.getDOEkyc()) == null) ? null : Integer.valueOf(dOEkyc19.getPincode()));
                            this$0.address = sb.toString();
                            ll llVarM1 = this$0.M1();
                            String string = StringsKt__StringsKt.trim((CharSequence) this$0.F1().d.getText().toString()).toString();
                            String strValueOf = String.valueOf((dOAadhaarResponse == null || (dOEkyc18 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc18.getCareOf());
                            String strValueOf2 = String.valueOf((dOAadhaarResponse == null || (dOEkyc17 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc17.getCode());
                            String strValueOf3 = String.valueOf((dOAadhaarResponse == null || (dOEkyc16 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc16.getDist());
                            String strValueOf4 = String.valueOf((dOAadhaarResponse == null || (dOEkyc15 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc15.getDob());
                            String strValueOf5 = String.valueOf((dOAadhaarResponse == null || (dOEkyc14 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc14.getGender());
                            String strValueOf6 = String.valueOf((dOAadhaarResponse == null || (dOEkyc13 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc13.getHouse());
                            String strValueOf7 = String.valueOf((dOAadhaarResponse == null || (dOEkyc12 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc12.getLandMark());
                            String strValueOf8 = String.valueOf((dOAadhaarResponse == null || (dOEkyc11 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc11.getLocalityIfAny());
                            String strValueOf9 = String.valueOf((dOAadhaarResponse == null || (dOEkyc10 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc10.getName());
                            String strValueOf10 = String.valueOf((dOAadhaarResponse == null || (dOEkyc9 = dOAadhaarResponse.getDOEkyc()) == null) ? null : Integer.valueOf(dOEkyc9.getPhone()));
                            String strValueOf11 = String.valueOf((dOAadhaarResponse == null || (dOEkyc8 = dOAadhaarResponse.getDOEkyc()) == null) ? null : Integer.valueOf(dOEkyc8.getPincode()));
                            String strValueOf12 = String.valueOf((dOAadhaarResponse == null || (dOEkyc7 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc7.getState());
                            String strValueOf13 = String.valueOf((dOAadhaarResponse == null || (dOEkyc6 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc6.getStatus());
                            String strValueOf14 = String.valueOf((dOAadhaarResponse == null || (dOEkyc5 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc5.getStreet());
                            String strValueOf15 = String.valueOf((dOAadhaarResponse == null || (dOEkyc4 = dOAadhaarResponse.getDOEkyc()) == null) ? null : dOEkyc4.getVillageTownCity());
                            if (dOAadhaarResponse != null && (dOEkyc3 = dOAadhaarResponse.getDOEkyc()) != null) {
                                xmlUID = dOEkyc3.getXmlUID();
                            }
                            String strValueOf16 = String.valueOf(xmlUID);
                            String string2 = StringsKt__StringsKt.trim((CharSequence) this$0.J1().getLearningLicence()).toString();
                            String string3 = StringsKt__StringsKt.trim((CharSequence) this$0.J1().getFullName()).toString();
                            String strE1 = this$0.E1(StringsKt__StringsKt.trim((CharSequence) this$0.J1().getDateOfBirth()).toString());
                            Intrinsics.checkNotNull(strE1);
                            String swdFullName = this$0.J1().getApplicantAddress().getSwdFullName();
                            int i2 = this$0.serviceCode;
                            String str2 = this$0.txnNo;
                            Intrinsics.checkNotNull(str2);
                            llVarM1.p(string, strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, strValueOf6, strValueOf7, strValueOf8, strValueOf9, strValueOf10, "NA", strValueOf11, strValueOf12, strValueOf13, strValueOf14, strValueOf15, strValueOf16, string2, string3, strE1, swdFullName, i2, "Y", str2, StringsKt__StringsKt.trim((CharSequence) this$0.F1().d.getText().toString()).toString(), this$0.J1().getState().getStCd());
                            return;
                        } catch (Exception e2) {
                            this$0.Q1().dismiss();
                            e2.printStackTrace();
                            return;
                        }
                    }
                }
                this$0.Q1().dismiss();
                String reason = dOAadhaarResponse != null ? dOAadhaarResponse.getReason() : null;
                if (reason != null && reason.length() != 0) {
                    this$0.f2(this$0, String.valueOf(dOAadhaarResponse != null ? dOAadhaarResponse.getReason() : null));
                    return;
                }
                this$0.f2(this$0, "Unable to verify the request, Please try after some time");
            } catch (Exception unused) {
            }
        }
    }

    public static final void e2(LlAdharOtp this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.Q1().dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public final void A1() {
        F1().h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lg3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlAdharOtp.B1(this.a, view);
            }
        });
        F1().i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mg3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlAdharOtp.C1(this.a, view);
            }
        });
    }

    public final void A2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final void B2(int i2) {
        this.serviceCode = i2;
    }

    public final void C2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final String D1(String aadhaarNumber) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
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

    public final void D2(String str) {
        this.txnNo = str;
    }

    public final String E1(String fdate) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy");
        try {
            Date date = simpleDateFormat.parse(fdate);
            Intrinsics.checkNotNullExpressionValue(date, "parse(...)");
            return simpleDateFormat2.format(date);
        } catch (ParseException unused) {
            return null;
        }
    }

    public final void E2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModelv1 = ld7Var;
    }

    public final lc F1() {
        lc lcVar = this.binding;
        if (lcVar != null) {
            return lcVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void F2(Context context, String mobile_no) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.validateotp);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        final ImageView imageView = (ImageView) viewFindViewById;
        View viewFindViewById2 = dialog.findViewById(R.id.resendOtp);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        final TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.showmpin);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.ImageView");
        final ImageView imageView2 = (ImageView) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.submitOtp);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById4;
        View viewFindViewById5 = dialog.findViewById(R.id.enterOtp);
        Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText = (EditText) viewFindViewById5;
        View viewFindViewById6 = dialog.findViewById(R.id.time_text);
        Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.TextView");
        final TextView textView3 = (TextView) viewFindViewById6;
        View viewFindViewById7 = dialog.findViewById(R.id.txt_reset);
        Intrinsics.checkNotNull(viewFindViewById7, "null cannot be cast to non-null type android.widget.TextView");
        final TextView textView4 = (TextView) viewFindViewById7;
        View viewFindViewById8 = dialog.findViewById(R.id.disPlay_mobile);
        Intrinsics.checkNotNull(viewFindViewById8, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById8).setText("OTP has been sent on your aadhar linked mobile number  \n+91 XXXXXX" + mobile_no);
        new n(textView3, textView).start();
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.og3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlAdharOtp.J2(editText, imageView2, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pg3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlAdharOtp.K2(this.a, textView3, textView, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.eg3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlAdharOtp.G2(editText, this, textView4, imageView, dialog, view);
            }
        });
        dialog.show();
    }

    public final nr1 G1() {
        nr1 nr1Var = this.dlServicesViewModel;
        if (nr1Var != null) {
            return nr1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlServicesViewModel");
        return null;
    }

    /* JADX INFO: renamed from: H1, reason: from getter */
    public final String getEPhoto() {
        return this.ePhoto;
    }

    public final wa3 I1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final FetchLlDetails J1() {
        FetchLlDetails fetchLlDetails = this.llDetails;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("llDetails");
        return null;
    }

    public final AadharInterface K1() {
        AadharInterface aadharInterface = this.mAadharInterface;
        if (aadharInterface != null) {
            return aadharInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAadharInterface");
        return null;
    }

    public final AdrInterface L1() {
        AdrInterface adrInterface = this.mAadharInterface2;
        if (adrInterface != null) {
            return adrInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAadharInterface2");
        return null;
    }

    public final ll M1() {
        ll llVar = this.mAadharViewModel;
        if (llVar != null) {
            return llVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAadharViewModel");
        return null;
    }

    public final ml N1() {
        ml mlVar = this.mAadharViewModel2;
        if (mlVar != null) {
            return mlVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAadharViewModel2");
        return null;
    }

    public final Context O1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final aj5 P1() {
        aj5 aj5Var = this.mView;
        if (aj5Var != null) {
            return aj5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mView");
        return null;
    }

    public final ProgressDialog Q1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final DlServiceInt R1() {
        DlServiceInt dlServiceInt = this.retrofitService;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final VahanProService S1() {
        VahanProService vahanProService = this.retrofitServiceVahan;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitServiceVahan");
        return null;
    }

    public final EkYCService T1() {
        EkYCService ekYCService = this.retrofitService_one;
        if (ekYCService != null) {
            return ekYCService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService_one");
        return null;
    }

    public final wl5 U1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    /* JADX INFO: renamed from: V1, reason: from getter */
    public final int getServiceCode() {
        return this.serviceCode;
    }

    public final ws6 W1() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    /* JADX INFO: renamed from: X1, reason: from getter */
    public final String getTxnNo() {
        return this.txnNo;
    }

    public final void Z1() {
        N1().i().g(this, new m(new g()));
        N1().j().g(this, new m(new h()));
        N1().k().g(this, new m(new i()));
        N1().j().g(this, new m(new j()));
        M1().l().g(this, new m(new k()));
        M1().h().g(this, new m(new l()));
        G1().j(O1(), J1().getState().getStCd());
        G1().C().g(this, new mf4() { // from class: com.zepto.dg3
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                LlAdharOtp.a2(this.a, (CustomState) obj);
            }
        });
        P1().j().g(this, new mf4() { // from class: com.zepto.hg3
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                LlAdharOtp.b2(this.a, (eKycResponse) obj);
            }
        });
        P1().i().g(this, new mf4() { // from class: com.zepto.ig3
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                LlAdharOtp.c2(this.a, (String) obj);
            }
        });
        P1().h().g(this, new mf4() { // from class: com.zepto.jg3
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                LlAdharOtp.d2(this.a, (EkycVerifyResponse) obj);
            }
        });
        P1().g().g(this, new mf4() { // from class: com.zepto.kg3
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                LlAdharOtp.e2(this.a, (String) obj);
            }
        });
        N1().m().g(this, new m(new a()));
        N1().g().g(this, new m(new b()));
        N1().h().g(this, new m(new c()));
        N1().n().g(this, new m(new d()));
        N1().l().g(this, new m(new e()));
        M1().m().g(this, new m(new f()));
    }

    public final void f2(Context context, String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ng3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlAdharOtp.g2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void h2() {
        if (Intrinsics.areEqual(U1().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            return;
        }
        if (Intrinsics.areEqual(U1().b(), "574")) {
            Intent intent = new Intent(this, (Class<?>) ChangeNameLL.class);
            intent.putExtra("LLDetails", J1());
            intent.putExtra("Mobile_no", W1().l());
            startActivity(intent);
            finish();
        } else if (Intrinsics.areEqual(U1().b(), "504")) {
            Intent intent2 = new Intent(this, (Class<?>) ChangeAddressLL.class);
            intent2.putExtra("LLDetails", J1());
            intent2.putExtra("Mobile_no", W1().l());
            startActivity(intent2);
            finish();
        } else if (Intrinsics.areEqual(U1().b(), "502")) {
            Intent intent3 = new Intent(this, (Class<?>) DuplicateLL.class);
            intent3.putExtra("LLDetails", J1());
            intent3.putExtra("Mobile_no", W1().l());
            startActivity(intent3);
            finish();
        }
        finish();
    }

    public final void i2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.address = str;
    }

    public final void j2(lc lcVar) {
        Intrinsics.checkNotNullParameter(lcVar, "<set-?>");
        this.binding = lcVar;
    }

    public final void k2(nr1 nr1Var) {
        Intrinsics.checkNotNullParameter(nr1Var, "<set-?>");
        this.dlServicesViewModel = nr1Var;
    }

    public final void l2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eKYCGender = str;
    }

    public final void m2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eKYCId = str;
    }

    public final void n2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ePhoto = str;
    }

    public final void o2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lc lcVarC = lc.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(lcVarC, "inflate(...)");
        j2(lcVarC);
        setContentView(F1().b());
        Y1();
        A1();
        Z1();
    }

    public final void p2(FetchLlDetails fetchLlDetails) {
        Intrinsics.checkNotNullParameter(fetchLlDetails, "<set-?>");
        this.llDetails = fetchLlDetails;
    }

    public final void q2(AadharInterface aadharInterface) {
        Intrinsics.checkNotNullParameter(aadharInterface, "<set-?>");
        this.mAadharInterface = aadharInterface;
    }

    public final void r2(AdrInterface adrInterface) {
        Intrinsics.checkNotNullParameter(adrInterface, "<set-?>");
        this.mAadharInterface2 = adrInterface;
    }

    public final void s2(ll llVar) {
        Intrinsics.checkNotNullParameter(llVar, "<set-?>");
        this.mAadharViewModel = llVar;
    }

    public final void t2(ml mlVar) {
        Intrinsics.checkNotNullParameter(mlVar, "<set-?>");
        this.mAadharViewModel2 = mlVar;
    }

    public final void u2(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void v2(aj5 aj5Var) {
        Intrinsics.checkNotNullParameter(aj5Var, "<set-?>");
        this.mView = aj5Var;
    }

    public final void w2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.owner_name_addhaar = str;
    }

    public final void x2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void y2(DlServiceInt dlServiceInt) {
        Intrinsics.checkNotNullParameter(dlServiceInt, "<set-?>");
        this.retrofitService = dlServiceInt;
    }

    public final void z2(EkYCService ekYCService) {
        Intrinsics.checkNotNullParameter(ekYCService, "<set-?>");
        this.retrofitService_one = ekYCService;
    }
}
