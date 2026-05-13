package com.nic.mparivahan.dlservices.newlearner;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.InputFilter;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.CurrentRTO;
import com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster;
import com.nic.mparivahan.DLServicesAuth.eKyc.AadharInterface;
import com.nic.mparivahan.DLServicesAuth.eKyc.AdharKyc.AdrInterface;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.DOEkycX;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.OtpAdharRes;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.TokenGeneration;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.UserFullDetails;
import com.nic.mparivahan.DLServicesAuth.eKyc.Pojo.CheckByState;
import com.nic.mparivahan.DLServicesAuth.eKyc.Pojo.SubmitAdharApi;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.Aadarkyc;
import com.nic.mparivahan.VahanEkyc.AadarkycVerify;
import com.nic.mparivahan.VahanEkyc.EkYCService;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.nic.mparivahan.dlservices.newlearner.DataClass.CampDetailsResponseModal;
import com.nic.mparivahan.dlservices.newlearner.DataClass.CampResponseModal;
import com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen;
import com.nic.mparivahan.dlservices.ui.newlearner.Service.NewLLServices;
import com.nic.mparivahan.dlservices.widget.MyTextView;
import com.zepto.a06;
import com.zepto.aj5;
import com.zepto.i94;
import com.zepto.ic;
import com.zepto.j94;
import com.zepto.jl;
import com.zepto.k94;
import com.zepto.kl;
import com.zepto.kt6;
import com.zepto.ll;
import com.zepto.lr1;
import com.zepto.mf4;
import com.zepto.ml;
import com.zepto.mt6;
import com.zepto.nr1;
import com.zepto.ol;
import com.zepto.pl;
import com.zepto.pq;
import com.zepto.qi5;
import com.zepto.rq1;
import com.zepto.s14;
import com.zepto.ta3;
import com.zepto.tx3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.ws6;
import com.zepto.yi5;
import com.zepto.zi5;
import com.zepto.zz5;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;
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
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\t¢\u0006\u0006\bä\u0001\u0010å\u0001J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0003J\b\u0010\u000b\u001a\u00020\u0005H\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002J\u0012\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0002J\u0012\u0010\u0011\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0002J\u0012\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0015J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\fH\u0007J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\fJ\u0018\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\fH\u0007J\u0018\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\fH\u0007J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH\u0017J\u000e\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\fR\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR(\u0010N\u001a\b\u0012\u0004\u0012\u00020G0F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0016\u0010Q\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010PR\"\u0010[\u001a\u00020T8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR$\u0010a\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010P\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0016\u0010e\u001a\u00020b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010g\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010HR\"\u0010k\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010P\u001a\u0004\bi\u0010^\"\u0004\bj\u0010`R\"\u0010q\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010H\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010y\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010\u0081\u0001\u001a\u00020z8\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R(\u0010\u0085\u0001\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010P\u001a\u0005\b\u0083\u0001\u0010^\"\u0005\b\u0084\u0001\u0010`R&\u0010\u0089\u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010P\u001a\u0005\b\u0087\u0001\u0010^\"\u0005\b\u0088\u0001\u0010`R&\u0010\u008d\u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010P\u001a\u0005\b\u008b\u0001\u0010^\"\u0005\b\u008c\u0001\u0010`R&\u0010\u0091\u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010P\u001a\u0005\b\u008f\u0001\u0010^\"\u0005\b\u0090\u0001\u0010`R*\u0010\u0099\u0001\u001a\u00030\u0092\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R*\u0010¡\u0001\u001a\u00030\u009a\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R*\u0010©\u0001\u001a\u00030¢\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R*\u0010±\u0001\u001a\u00030ª\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R*\u0010¹\u0001\u001a\u00030²\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R&\u0010½\u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bº\u0001\u0010P\u001a\u0005\b»\u0001\u0010^\"\u0005\b¼\u0001\u0010`R\u001a\u0010Á\u0001\u001a\u00030¾\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R\u001a\u0010Å\u0001\u001a\u00030Â\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R\u001f\u0010È\u0001\u001a\t\u0012\u0005\u0012\u00030Æ\u00010F8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\bÇ\u0001\u0010IR\u001a\u0010Ì\u0001\u001a\u00030É\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÊ\u0001\u0010Ë\u0001R\u0018\u0010Î\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÍ\u0001\u0010PR\u0018\u0010Ð\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÏ\u0001\u0010PR\u0019\u0010Ó\u0001\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÑ\u0001\u0010Ò\u0001R\u0018\u0010Õ\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÔ\u0001\u0010PR\u0018\u0010×\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÖ\u0001\u0010PR\u0018\u0010Ù\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bØ\u0001\u0010PR\u0018\u0010Û\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÚ\u0001\u0010PR\u001a\u0010ß\u0001\u001a\u00030Ü\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÝ\u0001\u0010Þ\u0001R\u001a\u0010ã\u0001\u001a\u00030à\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bá\u0001\u0010â\u0001¨\u0006æ\u0001"}, d2 = {"Lcom/nic/mparivahan/dlservices/newlearner/LearnerLicenceAadharScreen;", "Lcom/zepto/pq;", "Lcom/zepto/a06;", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/Pojo/CheckByState;", "checkByState", "", "x2", "h3", "e2", "i3", "y2", "f2", "", "stateCode", "s2", "message", "I2", "K2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "fdate", "h2", "Landroid/content/Context;", "context", "M2", "mobile_no", "j3", "p3", "", "position", "k", "aadhaarNumber", "g2", "Lcom/zepto/ic;", "C", "Lcom/zepto/ic;", "binding", "Landroid/app/ProgressDialog;", "D", "Landroid/app/ProgressDialog;", "pDialog", "Lcom/zepto/wa3;", "E", "Lcom/zepto/wa3;", "session", "Lcom/zepto/nr1;", "F", "Lcom/zepto/nr1;", "k2", "()Lcom/zepto/nr1;", "R2", "(Lcom/zepto/nr1;)V", "dlServicesViewModel", "Lcom/zepto/wl5;", "G", "Lcom/zepto/wl5;", "t2", "()Lcom/zepto/wl5;", "d3", "(Lcom/zepto/wl5;)V", "sarthiSession", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "H", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "q2", "()Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "b3", "(Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;)V", "retrofitService", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/DLServicesAuth/Model/GetCurrentRTO/RtosMaster;", "I", "Ljava/util/ArrayList;", "p2", "()Ljava/util/ArrayList;", "X2", "(Ljava/util/ArrayList;)V", "mRtosMaster", "J", "Ljava/lang/String;", "rto_code", "K", "rtoName", "Lcom/zepto/ws6;", "L", "Lcom/zepto/ws6;", "v2", "()Lcom/zepto/ws6;", "f3", "(Lcom/zepto/ws6;)V", "sessionManager", "M", "getRecord_id", "()Ljava/lang/String;", "a3", "(Ljava/lang/String;)V", "record_id", "Landroid/content/SharedPreferences;", "N", "Landroid/content/SharedPreferences;", "pref", "O", "generateOtpForMobile", "P", "getType", "setType", "type", "Q", "u2", "()I", "e3", "(I)V", "serviceCode", "Lcom/zepto/aj5;", "R", "Lcom/zepto/aj5;", "getMView", "()Lcom/zepto/aj5;", "Y2", "(Lcom/zepto/aj5;)V", "mView", "Lcom/nic/mparivahan/VahanEkyc/EkYCService;", "S", "Lcom/nic/mparivahan/VahanEkyc/EkYCService;", "r2", "()Lcom/nic/mparivahan/VahanEkyc/EkYCService;", "c3", "(Lcom/nic/mparivahan/VahanEkyc/EkYCService;)V", "retrofitService_one", "T", "w2", "g3", "txnNo", "U", "getOwner_name_addhaar", "Z2", "owner_name_addhaar", "V", "getAddress", "Q2", "address", "W", "getEKYCGender", "S2", "eKYCGender", "Lcom/zepto/ll;", "X", "Lcom/zepto/ll;", "n2", "()Lcom/zepto/ll;", "V2", "(Lcom/zepto/ll;)V", "mAadharViewModel", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/AadharInterface;", "Y", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/AadharInterface;", "l2", "()Lcom/nic/mparivahan/DLServicesAuth/eKyc/AadharInterface;", "T2", "(Lcom/nic/mparivahan/DLServicesAuth/eKyc/AadharInterface;)V", "mAadharInterface", "Lcom/zepto/ml;", "Z", "Lcom/zepto/ml;", "o2", "()Lcom/zepto/ml;", "W2", "(Lcom/zepto/ml;)V", "mAadharViewModel2", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/AdharKyc/AdrInterface;", "a0", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/AdharKyc/AdrInterface;", "m2", "()Lcom/nic/mparivahan/DLServicesAuth/eKyc/AdharKyc/AdrInterface;", "U2", "(Lcom/nic/mparivahan/DLServicesAuth/eKyc/AdharKyc/AdrInterface;)V", "mAadharInterface2", "Lcom/nic/mparivahan/VahanEkyc/Aadarkyc$DOEkyc;", "b0", "Lcom/nic/mparivahan/VahanEkyc/Aadarkyc$DOEkyc;", "i2", "()Lcom/nic/mparivahan/VahanEkyc/Aadarkyc$DOEkyc;", "O2", "(Lcom/nic/mparivahan/VahanEkyc/Aadarkyc$DOEkyc;)V", "aadhaarData", "c0", "j2", "P2", "aadhaarLastFourDigitMobileNo", "Lcom/zepto/j94;", "d0", "Lcom/zepto/j94;", "viewModal", "Lcom/nic/mparivahan/dlservices/ui/newlearner/Service/NewLLServices;", "e0", "Lcom/nic/mparivahan/dlservices/ui/newlearner/Service/NewLLServices;", "service", "Lcom/nic/mparivahan/dlservices/newlearner/DataClass/CampDetailsResponseModal;", "f0", "campList", "Lcom/zepto/zz5;", "g0", "Lcom/zepto/zz5;", "campAdapter", "h0", "cmCampDesc", "i0", "cmType", "j0", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/Pojo/CheckByState;", "aadharDataCheckByState", "k0", "tokenAdhar", "l0", "traceId", "m0", "tokenService", "n0", "nk", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkycX;", "o0", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkycX;", "adharData", "Landroid/app/Dialog;", "p0", "Landroid/app/Dialog;", "otpAdhar", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class LearnerLicenceAadharScreen extends pq implements a06 {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ic binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public nr1 dlServicesViewModel;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public DlServiceInt retrofitService;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ArrayList mRtosMaster;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String record_id;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public SharedPreferences pref;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public int generateOtpForMobile;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public aj5 mView;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public EkYCService retrofitService_one;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String txnNo;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public ll mAadharViewModel;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public AadharInterface mAadharInterface;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public ml mAadharViewModel2;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public AdrInterface mAadharInterface2;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public Aadarkyc.DOEkyc aadhaarData;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public j94 viewModal;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public NewLLServices service;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public ArrayList campList;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public zz5 campAdapter;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public CheckByState aadharDataCheckByState;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public DOEkycX adharData;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public Dialog otpAdhar;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String rto_code = "";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String rtoName = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String type = "A";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public int serviceCode = 501;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String owner_name_addhaar = "NA";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String address = "NA";

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String eKYCGender = "NA";

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public String aadhaarLastFourDigitMobileNo = "";

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public String cmCampDesc = "";

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public String cmType = "";

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public String tokenAdhar = "";

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public String traceId = "";

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public String tokenService = "";

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public String nk = "";

    public static final class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            LearnerLicenceAadharScreen learnerLicenceAadharScreen = LearnerLicenceAadharScreen.this;
            learnerLicenceAadharScreen.rto_code = i == 0 ? "0" : ((RtosMaster) learnerLicenceAadharScreen.p2().get(i)).getRto_code();
            LearnerLicenceAadharScreen learnerLicenceAadharScreen2 = LearnerLicenceAadharScreen.this;
            learnerLicenceAadharScreen2.rtoName = ((RtosMaster) learnerLicenceAadharScreen2.p2().get(i)).getRto_name();
            if (Intrinsics.areEqual(LearnerLicenceAadharScreen.this.rto_code, "") || Intrinsics.areEqual(LearnerLicenceAadharScreen.this.rto_code, "0")) {
                return;
            }
            LearnerLicenceAadharScreen.this.e2();
            if (Intrinsics.areEqual(LearnerLicenceAadharScreen.this.t2().n(), "GJ")) {
                LearnerLicenceAadharScreen.this.f2();
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
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
        public final void a(SubmitAdharApi submitAdharApi) {
            ProgressDialog progressDialog = LearnerLicenceAadharScreen.this.pDialog;
            wa3 wa3Var = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog = null;
            }
            progressDialog.dismiss();
            try {
                if (StringsKt__StringsJVMKt.equals(submitAdharApi.getStatusCode(), "EKYC001", true)) {
                    Intent intent = new Intent(LearnerLicenceAadharScreen.this, (Class<?>) PersonalDetailsScreen.class);
                    intent.putExtra("stateCd", LearnerLicenceAadharScreen.this.t2().n());
                    intent.putExtra("rtoCd", LearnerLicenceAadharScreen.this.rto_code);
                    intent.putExtra("rtoName", LearnerLicenceAadharScreen.this.rtoName);
                    intent.putExtra("inputMobileNo", "");
                    intent.putExtra("aadharData", LearnerLicenceAadharScreen.this.i2());
                    intent.putExtra("ekycId", submitAdharApi.getEkycId());
                    intent.putExtra("aadhaarLastFourDigitMobileNo", LearnerLicenceAadharScreen.this.getAadhaarLastFourDigitMobileNo());
                    intent.putExtra("dataFromAadhar", true);
                    intent.putExtra("campDesc", LearnerLicenceAadharScreen.this.cmCampDesc);
                    intent.putExtra("cmType", LearnerLicenceAadharScreen.this.cmType);
                    LearnerLicenceAadharScreen.this.startActivity(intent);
                } else {
                    LearnerLicenceAadharScreen learnerLicenceAadharScreen = LearnerLicenceAadharScreen.this;
                    learnerLicenceAadharScreen.M2(learnerLicenceAadharScreen, submitAdharApi.getStatusDesc());
                }
            } catch (Exception unused) {
                LearnerLicenceAadharScreen learnerLicenceAadharScreen2 = LearnerLicenceAadharScreen.this;
                wa3 wa3Var2 = learnerLicenceAadharScreen2.session;
                if (wa3Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("session");
                } else {
                    wa3Var = wa3Var2;
                }
                learnerLicenceAadharScreen2.M2(learnerLicenceAadharScreen2, wa3Var.b("service_is_not_present", LearnerLicenceAadharScreen.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SubmitAdharApi) obj);
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
            ProgressDialog progressDialog = LearnerLicenceAadharScreen.this.pDialog;
            wa3 wa3Var = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog = null;
            }
            progressDialog.dismiss();
            try {
                Log.e("adhResp_submit_err", str.toString());
                LearnerLicenceAadharScreen learnerLicenceAadharScreen = LearnerLicenceAadharScreen.this;
                wa3 wa3Var2 = learnerLicenceAadharScreen.session;
                if (wa3Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("session");
                } else {
                    wa3Var = wa3Var2;
                }
                learnerLicenceAadharScreen.M2(learnerLicenceAadharScreen, wa3Var.b("service_is_not_present", LearnerLicenceAadharScreen.this.getString(R.string.unable_to_get_details)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        public final void a(CampResponseModal campResponseModal) {
            ProgressDialog progressDialog = LearnerLicenceAadharScreen.this.pDialog;
            CheckByState checkByState = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog2 = LearnerLicenceAadharScreen.this.pDialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                    progressDialog2 = null;
                }
                progressDialog2.dismiss();
            }
            try {
                if (!Intrinsics.areEqual(campResponseModal.getStatus_code(), "00") || !StringsKt__StringsJVMKt.equals(campResponseModal.getStatus_desc(), "success", true)) {
                    ic icVar = LearnerLicenceAadharScreen.this.binding;
                    if (icVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        icVar = null;
                    }
                    icVar.i.setVisibility(8);
                    if (LearnerLicenceAadharScreen.this.aadharDataCheckByState == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("aadharDataCheckByState");
                    }
                    LearnerLicenceAadharScreen learnerLicenceAadharScreen = LearnerLicenceAadharScreen.this;
                    CheckByState checkByState2 = learnerLicenceAadharScreen.aadharDataCheckByState;
                    if (checkByState2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("aadharDataCheckByState");
                        checkByState2 = null;
                    }
                    learnerLicenceAadharScreen.x2(checkByState2);
                    return;
                }
                LearnerLicenceAadharScreen learnerLicenceAadharScreen2 = LearnerLicenceAadharScreen.this;
                List<CampDetailsResponseModal> campDetails = campResponseModal.getCampDetails();
                Intrinsics.checkNotNull(campDetails, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.dlservices.newlearner.DataClass.CampDetailsResponseModal>");
                learnerLicenceAadharScreen2.campList = (ArrayList) campDetails;
                ArrayList arrayList = LearnerLicenceAadharScreen.this.campList;
                if (arrayList == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("campList");
                    arrayList = null;
                }
                if (arrayList.size() > 0) {
                    ic icVar2 = LearnerLicenceAadharScreen.this.binding;
                    if (icVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        icVar2 = null;
                    }
                    icVar2.i.setVisibility(0);
                    LearnerLicenceAadharScreen.this.h3();
                    return;
                }
                ic icVar3 = LearnerLicenceAadharScreen.this.binding;
                if (icVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    icVar3 = null;
                }
                icVar3.i.setVisibility(8);
                if (LearnerLicenceAadharScreen.this.aadharDataCheckByState == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("aadharDataCheckByState");
                }
                LearnerLicenceAadharScreen learnerLicenceAadharScreen3 = LearnerLicenceAadharScreen.this;
                CheckByState checkByState3 = learnerLicenceAadharScreen3.aadharDataCheckByState;
                if (checkByState3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("aadharDataCheckByState");
                    checkByState3 = null;
                }
                learnerLicenceAadharScreen3.x2(checkByState3);
            } catch (Exception e) {
                e.printStackTrace();
                ProgressDialog progressDialog3 = LearnerLicenceAadharScreen.this.pDialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                    progressDialog3 = null;
                }
                if (progressDialog3.isShowing()) {
                    ProgressDialog progressDialog4 = LearnerLicenceAadharScreen.this.pDialog;
                    if (progressDialog4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                        progressDialog4 = null;
                    }
                    progressDialog4.dismiss();
                }
                if (LearnerLicenceAadharScreen.this.aadharDataCheckByState == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("aadharDataCheckByState");
                }
                LearnerLicenceAadharScreen learnerLicenceAadharScreen4 = LearnerLicenceAadharScreen.this;
                CheckByState checkByState4 = learnerLicenceAadharScreen4.aadharDataCheckByState;
                if (checkByState4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("aadharDataCheckByState");
                } else {
                    checkByState = checkByState4;
                }
                learnerLicenceAadharScreen4.x2(checkByState);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CampResponseModal) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(TokenGeneration tokenGeneration) {
            try {
                if (StringsKt__StringsJVMKt.equals(tokenGeneration.getStatus(), "Success", true)) {
                    LearnerLicenceAadharScreen.this.tokenAdhar = tokenGeneration.getAuthorization();
                    LearnerLicenceAadharScreen.this.traceId = tokenGeneration.getTraceId();
                    LearnerLicenceAadharScreen.this.tokenService = tokenGeneration.getServiceId();
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
        public final void a(OtpAdharRes otpAdharRes) {
            ProgressDialog progressDialog = LearnerLicenceAadharScreen.this.pDialog;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog = null;
            }
            progressDialog.cancel();
            try {
                if (StringsKt__StringsJVMKt.equals(otpAdharRes.getStatus(), "Success", true)) {
                    LearnerLicenceAadharScreen.this.g3(StringsKt__StringsKt.trim((CharSequence) otpAdharRes.getTxnNo()).toString());
                    LearnerLicenceAadharScreen.this.P2(otpAdharRes.getDOAuthOTP().getLast_four_mobile());
                    LearnerLicenceAadharScreen learnerLicenceAadharScreen = LearnerLicenceAadharScreen.this;
                    learnerLicenceAadharScreen.j3(learnerLicenceAadharScreen, otpAdharRes.getDOAuthOTP().getLast_four_mobile());
                } else {
                    LearnerLicenceAadharScreen learnerLicenceAadharScreen2 = LearnerLicenceAadharScreen.this;
                    learnerLicenceAadharScreen2.M2(learnerLicenceAadharScreen2, "Unable to process the request, Please try after some time");
                }
            } catch (Exception unused) {
                LearnerLicenceAadharScreen learnerLicenceAadharScreen3 = LearnerLicenceAadharScreen.this;
                learnerLicenceAadharScreen3.M2(learnerLicenceAadharScreen3, "Unable to process the request, Please try after some time");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OtpAdharRes) obj);
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
            ProgressDialog progressDialog = LearnerLicenceAadharScreen.this.pDialog;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog = null;
            }
            progressDialog.cancel();
            LearnerLicenceAadharScreen learnerLicenceAadharScreen = LearnerLicenceAadharScreen.this;
            learnerLicenceAadharScreen.M2(learnerLicenceAadharScreen, "Unable to process the request, Please try after some time");
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
        public final void a(UserFullDetails userFullDetails) {
            ProgressDialog progressDialog;
            String pht;
            try {
                Log.d("userDetails_api", userFullDetails.toString());
                DOEkycX dOEkyc = userFullDetails.getDOEkyc();
                if (!StringsKt__StringsJVMKt.equals(userFullDetails.getStatus(), "Y", true)) {
                    ProgressDialog progressDialog2 = LearnerLicenceAadharScreen.this.pDialog;
                    if (progressDialog2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                        progressDialog2 = null;
                    }
                    progressDialog2.dismiss();
                    String reason = dOEkyc.getReason();
                    if (reason != null && reason.length() != 0) {
                        LearnerLicenceAadharScreen learnerLicenceAadharScreen = LearnerLicenceAadharScreen.this;
                        learnerLicenceAadharScreen.M2(learnerLicenceAadharScreen, dOEkyc.getReason().toString());
                        return;
                    }
                    LearnerLicenceAadharScreen learnerLicenceAadharScreen2 = LearnerLicenceAadharScreen.this;
                    wa3 wa3Var = learnerLicenceAadharScreen2.session;
                    if (wa3Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("session");
                        wa3Var = null;
                    }
                    learnerLicenceAadharScreen2.M2(learnerLicenceAadharScreen2, wa3Var.b("service_is_not_present", LearnerLicenceAadharScreen.this.getString(R.string.unable_to_get_details)));
                    return;
                }
                LearnerLicenceAadharScreen.this.adharData = dOEkyc;
                String house = userFullDetails.getDOEkyc().getHouse() != null ? userFullDetails.getDOEkyc().getHouse() : "NA";
                String landMark = userFullDetails.getDOEkyc().getLandMark() != null ? userFullDetails.getDOEkyc().getLandMark() : "NA";
                String localityIfAny = userFullDetails.getDOEkyc().getLocalityIfAny() != null ? userFullDetails.getDOEkyc().getLocalityIfAny() : "NA";
                String name = userFullDetails.getDOEkyc().getName() != null ? userFullDetails.getDOEkyc().getName() : "NA";
                userFullDetails.getDOEkyc().getPhone();
                String strValueOf = String.valueOf(userFullDetails.getDOEkyc().getPhone());
                if (userFullDetails.getDOEkyc().getPht() != null) {
                    pht = userFullDetails.getDOEkyc().getPht();
                    Log.d("adhar_pht", pht);
                } else {
                    pht = "NA";
                }
                String pincode = userFullDetails.getDOEkyc().getPincode() != null ? userFullDetails.getDOEkyc().getPincode() : "NA";
                String state = userFullDetails.getDOEkyc().getState() != null ? userFullDetails.getDOEkyc().getState() : "NA";
                String street = userFullDetails.getDOEkyc().getStreet() != null ? userFullDetails.getDOEkyc().getStreet() : "NA";
                String status = userFullDetails.getDOEkyc().getStatus() != null ? userFullDetails.getDOEkyc().getStatus() : "NA";
                String villageTownCity = userFullDetails.getDOEkyc().getVillageTownCity() != null ? userFullDetails.getDOEkyc().getVillageTownCity() : "NA";
                String xmlUID = userFullDetails.getDOEkyc().getXmlUID() != null ? userFullDetails.getDOEkyc().getXmlUID() : "NA";
                String code = userFullDetails.getDOEkyc().getCode() != null ? userFullDetails.getDOEkyc().getCode() : "NA";
                if (userFullDetails.getDOEkyc().getGender() != null && StringsKt__StringsJVMKt.equals(userFullDetails.getDOEkyc().getGender(), "M", true)) {
                    LearnerLicenceAadharScreen.this.S2("M");
                }
                LearnerLicenceAadharScreen learnerLicenceAadharScreen3 = LearnerLicenceAadharScreen.this;
                learnerLicenceAadharScreen3.e3(Intrinsics.areEqual(learnerLicenceAadharScreen3.t2().n(), "HP") ? 509 : 501);
                ll llVarN2 = LearnerLicenceAadharScreen.this.n2();
                ic icVar = LearnerLicenceAadharScreen.this.binding;
                if (icVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    icVar = null;
                }
                String string = StringsKt__StringsKt.trim((CharSequence) icVar.m.getText().toString()).toString();
                String careOf = userFullDetails.getDOEkyc().getCareOf();
                String dist = userFullDetails.getDOEkyc().getDist();
                String dob = userFullDetails.getDOEkyc().getDob();
                String gender = userFullDetails.getDOEkyc().getGender();
                String string2 = StringsKt__StringsKt.trim((CharSequence) landMark).toString();
                String string3 = StringsKt__StringsKt.trim((CharSequence) localityIfAny).toString();
                String string4 = StringsKt__StringsKt.trim((CharSequence) name).toString();
                String string5 = StringsKt__StringsKt.trim((CharSequence) strValueOf).toString();
                String string6 = StringsKt__StringsKt.trim((CharSequence) pht).toString();
                String string7 = StringsKt__StringsKt.trim((CharSequence) pincode).toString();
                String string8 = StringsKt__StringsKt.trim((CharSequence) state).toString();
                String string9 = StringsKt__StringsKt.trim((CharSequence) status).toString();
                String string10 = StringsKt__StringsKt.trim((CharSequence) street).toString();
                String string11 = StringsKt__StringsKt.trim((CharSequence) villageTownCity).toString();
                String string12 = StringsKt__StringsKt.trim((CharSequence) xmlUID).toString();
                String string13 = StringsKt__StringsKt.trim((CharSequence) name).toString();
                String strH2 = LearnerLicenceAadharScreen.this.h2(userFullDetails.getDOEkyc().getDob());
                Intrinsics.checkNotNull(strH2);
                String string14 = StringsKt__StringsKt.trim((CharSequence) userFullDetails.getDOEkyc().getCareOf()).toString();
                int serviceCode = LearnerLicenceAadharScreen.this.getServiceCode();
                String txnNo = LearnerLicenceAadharScreen.this.getTxnNo();
                Intrinsics.checkNotNull(txnNo);
                ic icVar2 = LearnerLicenceAadharScreen.this.binding;
                if (icVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    icVar2 = null;
                }
                llVarN2.q(string, careOf, code, dist, dob, gender, house, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, "", string13, strH2, string14, serviceCode, "Y", txnNo, StringsKt__StringsKt.trim((CharSequence) icVar2.m.getText().toString()).toString(), LearnerLicenceAadharScreen.this.t2().n());
                LearnerLicenceAadharScreen.this.adharData = dOEkyc;
            } catch (Exception unused) {
                ProgressDialog progressDialog3 = LearnerLicenceAadharScreen.this.pDialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                    progressDialog = null;
                } else {
                    progressDialog = progressDialog3;
                }
                progressDialog.dismiss();
                LearnerLicenceAadharScreen learnerLicenceAadharScreen4 = LearnerLicenceAadharScreen.this;
                learnerLicenceAadharScreen4.M2(learnerLicenceAadharScreen4, "Unable to proceed your request, Please try after some time");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((UserFullDetails) obj);
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
            ProgressDialog progressDialog = LearnerLicenceAadharScreen.this.pDialog;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog = null;
            }
            progressDialog.dismiss();
            LearnerLicenceAadharScreen learnerLicenceAadharScreen = LearnerLicenceAadharScreen.this;
            learnerLicenceAadharScreen.M2(learnerLicenceAadharScreen, "Unable to proceed your request, Please try after some time");
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
        public final void a(SubmitAdharApi submitAdharApi) {
            ProgressDialog progressDialog = LearnerLicenceAadharScreen.this.pDialog;
            DOEkycX dOEkycX = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog = null;
            }
            progressDialog.dismiss();
            try {
                Log.e("adhResp_submit", submitAdharApi.toString());
                if (!StringsKt__StringsJVMKt.equals(submitAdharApi.getStatusCode(), "EKYC001", true)) {
                    LearnerLicenceAadharScreen learnerLicenceAadharScreen = LearnerLicenceAadharScreen.this;
                    learnerLicenceAadharScreen.M2(learnerLicenceAadharScreen, submitAdharApi.getStatusDesc());
                    return;
                }
                try {
                    Intent intent = new Intent(LearnerLicenceAadharScreen.this, (Class<?>) PersonalDetailsScreen.class);
                    intent.putExtra("stateCd", LearnerLicenceAadharScreen.this.t2().n());
                    intent.putExtra("rtoCd", LearnerLicenceAadharScreen.this.rto_code);
                    intent.putExtra("rtoName", LearnerLicenceAadharScreen.this.rtoName);
                    intent.putExtra("inputMobileNo", "");
                    DOEkycX dOEkycX2 = LearnerLicenceAadharScreen.this.adharData;
                    if (dOEkycX2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adharData");
                    } else {
                        dOEkycX = dOEkycX2;
                    }
                    intent.putExtra("aadharData", dOEkycX);
                    intent.putExtra("ekycId", submitAdharApi.getEkycId());
                    intent.putExtra("aadhaarLastFourDigitMobileNo", LearnerLicenceAadharScreen.this.getAadhaarLastFourDigitMobileNo());
                    intent.putExtra("dataFromAadhar", true);
                    intent.putExtra("campDesc", LearnerLicenceAadharScreen.this.cmCampDesc);
                    intent.putExtra("cmType", LearnerLicenceAadharScreen.this.cmType);
                    LearnerLicenceAadharScreen.this.startActivity(intent);
                } catch (Exception unused) {
                    LearnerLicenceAadharScreen.this.t2().q("NA", "N", "NA", "NA");
                }
            } catch (Exception unused2) {
                LearnerLicenceAadharScreen.this.t2().q("NA", "N", "NA", "NA");
                LearnerLicenceAadharScreen learnerLicenceAadharScreen2 = LearnerLicenceAadharScreen.this;
                learnerLicenceAadharScreen2.M2(learnerLicenceAadharScreen2, learnerLicenceAadharScreen2.getString(R.string.unable_to_get_details));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SubmitAdharApi) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class k extends Lambda implements Function1 {
        public k() {
            super(1);
        }

        public final void a(CurrentRTO currentRTO) {
            ProgressDialog progressDialog = LearnerLicenceAadharScreen.this.pDialog;
            wa3 wa3Var = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog = null;
            }
            progressDialog.dismiss();
            try {
                if (StringsKt__StringsJVMKt.equals(currentRTO.getStatus_code(), "00", true)) {
                    LearnerLicenceAadharScreen learnerLicenceAadharScreen = LearnerLicenceAadharScreen.this;
                    List<RtosMaster> rtosMaster = currentRTO.getRtosMaster();
                    Intrinsics.checkNotNull(rtosMaster, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster>");
                    learnerLicenceAadharScreen.X2((ArrayList) rtosMaster);
                    ArrayList arrayListP2 = LearnerLicenceAadharScreen.this.p2();
                    wa3 wa3Var2 = LearnerLicenceAadharScreen.this.session;
                    if (wa3Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("session");
                        wa3Var2 = null;
                    }
                    String strB = wa3Var2.b("select_rto", LearnerLicenceAadharScreen.this.getString(R.string.please_select_rto));
                    Intrinsics.checkNotNull(strB);
                    arrayListP2.add(0, new RtosMaster(strB, "0"));
                    LearnerLicenceAadharScreen.this.i3();
                    return;
                }
                LearnerLicenceAadharScreen learnerLicenceAadharScreen2 = LearnerLicenceAadharScreen.this;
                List<RtosMaster> rtosMaster2 = currentRTO.getRtosMaster();
                Intrinsics.checkNotNull(rtosMaster2, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster>");
                learnerLicenceAadharScreen2.X2((ArrayList) rtosMaster2);
                ArrayList arrayListP22 = LearnerLicenceAadharScreen.this.p2();
                wa3 wa3Var3 = LearnerLicenceAadharScreen.this.session;
                if (wa3Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("session");
                    wa3Var3 = null;
                }
                String strB2 = wa3Var3.b("select_rto", LearnerLicenceAadharScreen.this.getString(R.string.please_select_rto));
                Intrinsics.checkNotNull(strB2);
                arrayListP22.add(0, new RtosMaster(strB2, "0"));
                LearnerLicenceAadharScreen.this.i3();
            } catch (Exception unused) {
                ProgressDialog progressDialog2 = LearnerLicenceAadharScreen.this.pDialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                    progressDialog2 = null;
                }
                if (progressDialog2.isShowing()) {
                    ProgressDialog progressDialog3 = LearnerLicenceAadharScreen.this.pDialog;
                    if (progressDialog3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                        progressDialog3 = null;
                    }
                    progressDialog3.dismiss();
                }
                LearnerLicenceAadharScreen learnerLicenceAadharScreen3 = LearnerLicenceAadharScreen.this;
                wa3 wa3Var4 = learnerLicenceAadharScreen3.session;
                if (wa3Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("session");
                } else {
                    wa3Var = wa3Var4;
                }
                learnerLicenceAadharScreen3.I2(wa3Var.b("service_is_not_present", LearnerLicenceAadharScreen.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CurrentRTO) obj);
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

        public final void invoke(String str) {
            ProgressDialog progressDialog = LearnerLicenceAadharScreen.this.pDialog;
            wa3 wa3Var = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog = null;
            }
            progressDialog.dismiss();
            LearnerLicenceAadharScreen learnerLicenceAadharScreen = LearnerLicenceAadharScreen.this;
            wa3 wa3Var2 = learnerLicenceAadharScreen.session;
            if (wa3Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var = wa3Var2;
            }
            learnerLicenceAadharScreen.I2(wa3Var.b("service_is_not_present", LearnerLicenceAadharScreen.this.getString(R.string.unable_to_get_details)));
        }
    }

    public static final class m extends Lambda implements Function1 {
        public m() {
            super(1);
        }

        public final void a(CheckByState checkByState) {
            ProgressDialog progressDialog = LearnerLicenceAadharScreen.this.pDialog;
            ic icVar = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog2 = LearnerLicenceAadharScreen.this.pDialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                    progressDialog2 = null;
                }
                progressDialog2.dismiss();
            }
            try {
                LearnerLicenceAadharScreen learnerLicenceAadharScreen = LearnerLicenceAadharScreen.this;
                Intrinsics.checkNotNull(checkByState);
                learnerLicenceAadharScreen.aadharDataCheckByState = checkByState;
                if (!kt6.d(LearnerLicenceAadharScreen.this.t2().n()) || Intrinsics.areEqual(LearnerLicenceAadharScreen.this.t2().n(), "GJ")) {
                    return;
                }
                LearnerLicenceAadharScreen.this.x2(checkByState);
            } catch (Exception unused) {
                ic icVar2 = LearnerLicenceAadharScreen.this.binding;
                if (icVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    icVar2 = null;
                }
                icVar2.f.setVisibility(0);
                ic icVar3 = LearnerLicenceAadharScreen.this.binding;
                if (icVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    icVar3 = null;
                }
                icVar3.c.setVisibility(0);
                ic icVar4 = LearnerLicenceAadharScreen.this.binding;
                if (icVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    icVar4 = null;
                }
                icVar4.A.setVisibility(8);
                ic icVar5 = LearnerLicenceAadharScreen.this.binding;
                if (icVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    icVar5 = null;
                }
                icVar5.B.setVisibility(0);
                ic icVar6 = LearnerLicenceAadharScreen.this.binding;
                if (icVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    icVar6 = null;
                }
                icVar6.B.setChecked(true);
                ic icVar7 = LearnerLicenceAadharScreen.this.binding;
                if (icVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    icVar7 = null;
                }
                icVar7.o.setVisibility(0);
                ic icVar8 = LearnerLicenceAadharScreen.this.binding;
                if (icVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    icVar = icVar8;
                }
                icVar.b.setVisibility(8);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CheckByState) obj);
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
            ProgressDialog progressDialog = LearnerLicenceAadharScreen.this.pDialog;
            ic icVar = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog2 = LearnerLicenceAadharScreen.this.pDialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                    progressDialog2 = null;
                }
                progressDialog2.dismiss();
            }
            ic icVar2 = LearnerLicenceAadharScreen.this.binding;
            if (icVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar2 = null;
            }
            icVar2.f.setVisibility(0);
            ic icVar3 = LearnerLicenceAadharScreen.this.binding;
            if (icVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar3 = null;
            }
            icVar3.c.setVisibility(0);
            ic icVar4 = LearnerLicenceAadharScreen.this.binding;
            if (icVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar4 = null;
            }
            icVar4.A.setVisibility(8);
            ic icVar5 = LearnerLicenceAadharScreen.this.binding;
            if (icVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar5 = null;
            }
            icVar5.B.setVisibility(0);
            ic icVar6 = LearnerLicenceAadharScreen.this.binding;
            if (icVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar6 = null;
            }
            icVar6.B.setChecked(true);
            ic icVar7 = LearnerLicenceAadharScreen.this.binding;
            if (icVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar7 = null;
            }
            icVar7.o.setVisibility(0);
            ic icVar8 = LearnerLicenceAadharScreen.this.binding;
            if (icVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                icVar = icVar8;
            }
            icVar.b.setVisibility(8);
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
        public final void a(SendOtpResult sendOtpResult) {
            ProgressDialog progressDialog = LearnerLicenceAadharScreen.this.pDialog;
            wa3 wa3Var = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog = null;
            }
            progressDialog.dismiss();
            try {
                if (!StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL001", true)) {
                    if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL099", true)) {
                        mt6.a.c(LearnerLicenceAadharScreen.this, sendOtpResult.getStatusDesc());
                        return;
                    } else {
                        LearnerLicenceAadharScreen.this.K2(sendOtpResult.getStatusDesc());
                        return;
                    }
                }
                LearnerLicenceAadharScreen.this.a3(String.valueOf(sendOtpResult.getRecordId()));
                LearnerLicenceAadharScreen learnerLicenceAadharScreen = LearnerLicenceAadharScreen.this;
                ic icVar = learnerLicenceAadharScreen.binding;
                if (icVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    icVar = null;
                }
                learnerLicenceAadharScreen.p3(learnerLicenceAadharScreen, String.valueOf(icVar.q.getText()));
            } catch (Exception unused) {
                LearnerLicenceAadharScreen learnerLicenceAadharScreen2 = LearnerLicenceAadharScreen.this;
                wa3 wa3Var2 = learnerLicenceAadharScreen2.session;
                if (wa3Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("session");
                } else {
                    wa3Var = wa3Var2;
                }
                String strB = wa3Var.b("label_went_wrong", LearnerLicenceAadharScreen.this.getString(R.string.something_please_try_after_some_time));
                Intrinsics.checkNotNull(strB);
                learnerLicenceAadharScreen2.K2(strB);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SendOtpResult) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class p extends Lambda implements Function1 {
        public p() {
            super(1);
        }

        public final void a(OtpVerifyResult otpVerifyResult) {
            wa3 wa3Var = null;
            try {
                if (!StringsKt__StringsJVMKt.equals(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    LearnerLicenceAadharScreen.this.K2(otpVerifyResult.getStatusDesc());
                    return;
                }
                Dialog dialog = LearnerLicenceAadharScreen.this.otpAdhar;
                if (dialog == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("otpAdhar");
                    dialog = null;
                }
                if (dialog.isShowing()) {
                    Dialog dialog2 = LearnerLicenceAadharScreen.this.otpAdhar;
                    if (dialog2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("otpAdhar");
                        dialog2 = null;
                    }
                    dialog2.dismiss();
                }
                Intent intent = new Intent(LearnerLicenceAadharScreen.this, (Class<?>) PersonalDetailsScreen.class);
                intent.putExtra("stateCd", LearnerLicenceAadharScreen.this.t2().n());
                intent.putExtra("rtoCd", LearnerLicenceAadharScreen.this.rto_code);
                intent.putExtra("rtoName", LearnerLicenceAadharScreen.this.rtoName);
                ic icVar = LearnerLicenceAadharScreen.this.binding;
                if (icVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    icVar = null;
                }
                intent.putExtra("inputMobileNo", StringsKt__StringsKt.trim((CharSequence) String.valueOf(icVar.q.getText())).toString());
                intent.putExtra("dataFromAadhar", false);
                intent.putExtra("campDesc", LearnerLicenceAadharScreen.this.cmCampDesc);
                intent.putExtra("cmType", LearnerLicenceAadharScreen.this.cmType);
                LearnerLicenceAadharScreen.this.startActivity(intent);
            } catch (Exception unused) {
                LearnerLicenceAadharScreen learnerLicenceAadharScreen = LearnerLicenceAadharScreen.this;
                wa3 wa3Var2 = learnerLicenceAadharScreen.session;
                if (wa3Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("session");
                } else {
                    wa3Var = wa3Var2;
                }
                String strB = wa3Var.b("label_went_wrong", LearnerLicenceAadharScreen.this.getString(R.string.something_please_try_after_some_time));
                Intrinsics.checkNotNull(strB);
                learnerLicenceAadharScreen.K2(strB);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OtpVerifyResult) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class q extends Lambda implements Function1 {
        public q() {
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
            String last_four_mobile;
            ProgressDialog progressDialog = LearnerLicenceAadharScreen.this.pDialog;
            wa3 wa3Var = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog = null;
            }
            progressDialog.dismiss();
            if (response != null) {
                AadarkycVerify.DoAadhaarResponse doAadhaarResponse = response.getDoAadhaarResponse();
                if (String.valueOf(doAadhaarResponse != null ? doAadhaarResponse.getStatus() : null).length() == 0) {
                    return;
                }
                if (doAadhaarResponse != null) {
                    try {
                        AadarkycVerify.dOEkyc dOAuthOTP = doAadhaarResponse.getDOAuthOTP();
                        if (dOAuthOTP != null && Intrinsics.areEqual(dOAuthOTP.getMobileverify(), Boolean.TRUE)) {
                            AadarkycVerify.dOEkyc dOAuthOTP2 = doAadhaarResponse.getDOAuthOTP();
                            String last_four_mobile2 = dOAuthOTP2 != null ? dOAuthOTP2.getLast_four_mobile() : null;
                            if (last_four_mobile2 != null && last_four_mobile2.length() != 0) {
                                AadarkycVerify.dOEkyc dOAuthOTP3 = doAadhaarResponse.getDOAuthOTP();
                                if (StringsKt__StringsJVMKt.equals(dOAuthOTP3 != null ? dOAuthOTP3.getStatus() : null, "success", true)) {
                                    AadarkycVerify.dOEkyc dOAuthOTP4 = doAadhaarResponse.getDOAuthOTP();
                                    if (dOAuthOTP4 == null || (last_four_mobile = dOAuthOTP4.getLast_four_mobile()) == null || last_four_mobile.length() != 4) {
                                        return;
                                    }
                                    LearnerLicenceAadharScreen.this.g3(String.valueOf(doAadhaarResponse.getTxnNo()));
                                    LearnerLicenceAadharScreen learnerLicenceAadharScreen = LearnerLicenceAadharScreen.this;
                                    AadarkycVerify.dOEkyc dOAuthOTP5 = doAadhaarResponse.getDOAuthOTP();
                                    learnerLicenceAadharScreen.P2(String.valueOf(dOAuthOTP5 != null ? dOAuthOTP5.getLast_four_mobile() : null));
                                    LearnerLicenceAadharScreen learnerLicenceAadharScreen2 = LearnerLicenceAadharScreen.this;
                                    AadarkycVerify.dOEkyc dOAuthOTP6 = doAadhaarResponse.getDOAuthOTP();
                                    learnerLicenceAadharScreen2.j3(learnerLicenceAadharScreen2, String.valueOf(dOAuthOTP6 != null ? dOAuthOTP6.getLast_four_mobile() : null));
                                    return;
                                }
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                }
                String reason = doAadhaarResponse != null ? doAadhaarResponse.getReason() : null;
                if (reason != null && reason.length() != 0) {
                    Log.v("reason fail", String.valueOf(doAadhaarResponse != null ? doAadhaarResponse.getReason() : null));
                    if (StringsKt__StringsKt.contains((CharSequence) String.valueOf(doAadhaarResponse != null ? doAadhaarResponse.getReason() : null), (CharSequence) "Invalid Auth Xml Format", true)) {
                        LearnerLicenceAadharScreen learnerLicenceAadharScreen3 = LearnerLicenceAadharScreen.this;
                        learnerLicenceAadharScreen3.M2(learnerLicenceAadharScreen3, "Invalid Aadhaar No.\nPlease try again");
                        return;
                    } else {
                        LearnerLicenceAadharScreen learnerLicenceAadharScreen4 = LearnerLicenceAadharScreen.this;
                        learnerLicenceAadharScreen4.M2(learnerLicenceAadharScreen4, String.valueOf(doAadhaarResponse != null ? doAadhaarResponse.getReason() : null));
                        return;
                    }
                }
                LearnerLicenceAadharScreen learnerLicenceAadharScreen5 = LearnerLicenceAadharScreen.this;
                wa3 wa3Var2 = learnerLicenceAadharScreen5.session;
                if (wa3Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("session");
                } else {
                    wa3Var = wa3Var2;
                }
                learnerLicenceAadharScreen5.M2(learnerLicenceAadharScreen5, wa3Var.b("service_is_not_present", LearnerLicenceAadharScreen.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AadarkycVerify.Response) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class r extends Lambda implements Function1 {
        public r() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
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
        public final void a(com.nic.mparivahan.VahanEkyc.Aadarkyc.Response r35) {
            /*
                Method dump skipped, instruction units count: 880
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAadharScreen.r.a(com.nic.mparivahan.VahanEkyc.Aadarkyc$Response):void");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Aadarkyc.Response) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class s extends Lambda implements Function1 {
        public s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            ProgressDialog progressDialog = LearnerLicenceAadharScreen.this.pDialog;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog = null;
            }
            progressDialog.dismiss();
        }
    }

    public static final class t implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public t(Function1 function) {
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

    public static final class u extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ TextView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(TextView textView, TextView textView2) {
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

    public static final class v extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ TextView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(TextView textView, TextView textView2) {
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

    public static final class w extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ LearnerLicenceAadharScreen b;
        public final /* synthetic */ TextView c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(TextView textView, LearnerLicenceAadharScreen learnerLicenceAadharScreen, TextView textView2) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = learnerLicenceAadharScreen;
            this.c = textView2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.c.setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            Log.e("calling", "321");
            TextView textView = this.a;
            StringBuilder sb = new StringBuilder();
            wa3 wa3Var = this.b.session;
            if (wa3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
                wa3Var = null;
            }
            sb.append(wa3Var.b("time_remaining", this.b.getString(R.string.time_remaining)));
            sb.append(" : ");
            sb.append(j / ((long) 1000));
            textView.setText(sb.toString());
            this.c.setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    public static final class x extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ LearnerLicenceAadharScreen b;
        public final /* synthetic */ TextView c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(TextView textView, LearnerLicenceAadharScreen learnerLicenceAadharScreen, TextView textView2) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = learnerLicenceAadharScreen;
            this.c = textView2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.c.setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            TextView textView = this.a;
            StringBuilder sb = new StringBuilder();
            wa3 wa3Var = this.b.session;
            if (wa3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
                wa3Var = null;
            }
            sb.append(wa3Var.b("time_remaining", this.b.getString(R.string.time_remaining)));
            sb.append(" : ");
            sb.append(j / ((long) 1000));
            textView.setText(sb.toString());
            this.c.setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    public static final void A2(LearnerLicenceAadharScreen this$0, View view) {
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
        ic icVar = this$0.binding;
        wa3 wa3Var = null;
        if (icVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar = null;
        }
        if (icVar.z.isChecked()) {
            wa3 wa3Var2 = this$0.session;
            if (wa3Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
                wa3Var2 = null;
            }
            textView.setText(wa3Var2.b("vid_based_consent", "VID based e-KYC consent"));
        } else {
            wa3 wa3Var3 = this$0.session;
            if (wa3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
                wa3Var3 = null;
            }
            textView.setText(wa3Var3.b("aadhar_based_consent", "Aadhaar based e-KYC consent"));
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gc3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LearnerLicenceAadharScreen.B2(dialog, view2);
            }
        });
        StringBuilder sb = new StringBuilder();
        sb.append(s14.a.g());
        wa3 wa3Var4 = this$0.session;
        if (wa3Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
        } else {
            wa3Var = wa3Var4;
        }
        sb.append(wa3Var.d());
        sb.append("/mparivahan-info-terms-of-use-aadhaar.html");
        webView.loadUrl(sb.toString());
        webView.clearCache(true);
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B2(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    public static final void C2(LearnerLicenceAadharScreen this$0, RadioGroup radioGroup, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        wa3 wa3Var = null;
        if (i2 == R.id.withoutAadharRb) {
            ic icVar = this$0.binding;
            if (icVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar = null;
            }
            icVar.o.setVisibility(0);
            ic icVar2 = this$0.binding;
            if (icVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar2 = null;
            }
            icVar2.b.setVisibility(8);
            ic icVar3 = this$0.binding;
            if (icVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar3 = null;
            }
            TextView textView = icVar3.n;
            wa3 wa3Var2 = this$0.session;
            if (wa3Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var = wa3Var2;
            }
            textView.setText(wa3Var.b("btn_dl_serv_gen_otp", this$0.getString(R.string.generate_otp)));
            this$0.generateOtpForMobile = 1;
            return;
        }
        ic icVar4 = this$0.binding;
        if (icVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar4 = null;
        }
        icVar4.o.setVisibility(8);
        ic icVar5 = this$0.binding;
        if (icVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar5 = null;
        }
        icVar5.b.setVisibility(0);
        ic icVar6 = this$0.binding;
        if (icVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar6 = null;
        }
        TextView textView2 = icVar6.n;
        wa3 wa3Var3 = this$0.session;
        if (wa3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
        } else {
            wa3Var = wa3Var3;
        }
        textView2.setText(wa3Var.b("btn_dl_serv_gen_otp", this$0.getString(R.string.generate_otp)));
        this$0.generateOtpForMobile = 0;
    }

    public static final void D2(LearnerLicenceAadharScreen this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            ic icVar = this$0.binding;
            wa3 wa3Var = null;
            if (icVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar = null;
            }
            icVar.z.setChecked(false);
            ic icVar2 = this$0.binding;
            if (icVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar2 = null;
            }
            icVar2.d.setChecked(true);
            ic icVar3 = this$0.binding;
            if (icVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar3 = null;
            }
            EditText editText = icVar3.m;
            wa3 wa3Var2 = this$0.session;
            if (wa3Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
                wa3Var2 = null;
            }
            editText.setHint(wa3Var2.b("enter_id_no", this$0.getString(R.string.enter_vid)));
            ic icVar4 = this$0.binding;
            if (icVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar4 = null;
            }
            icVar4.m.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(12)});
            ic icVar5 = this$0.binding;
            if (icVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar5 = null;
            }
            MyTextView myTextView = icVar5.e;
            wa3 wa3Var3 = this$0.session;
            if (wa3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var = wa3Var3;
            }
            myTextView.setText(wa3Var.b("adhar_terms", this$0.getString(R.string.agree_with_aadhar_terms)));
            this$0.type = "A";
        }
    }

    public static final void E2(LearnerLicenceAadharScreen this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            ic icVar = this$0.binding;
            wa3 wa3Var = null;
            if (icVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar = null;
            }
            icVar.d.setChecked(false);
            ic icVar2 = this$0.binding;
            if (icVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar2 = null;
            }
            icVar2.z.setChecked(true);
            ic icVar3 = this$0.binding;
            if (icVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar3 = null;
            }
            EditText editText = icVar3.m;
            wa3 wa3Var2 = this$0.session;
            if (wa3Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
                wa3Var2 = null;
            }
            editText.setHint(wa3Var2.b("enter_id_no", this$0.getString(R.string.enter_vid)));
            ic icVar4 = this$0.binding;
            if (icVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar4 = null;
            }
            icVar4.m.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(16)});
            ic icVar5 = this$0.binding;
            if (icVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar5 = null;
            }
            MyTextView myTextView = icVar5.e;
            wa3 wa3Var3 = this$0.session;
            if (wa3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var = wa3Var3;
            }
            myTextView.setText(wa3Var.b("vid_terms", this$0.getString(R.string.agree_with_vid_terms)));
            this$0.type = "V";
        }
    }

    public static final void F2(LearnerLicenceAadharScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ic icVar = this$0.binding;
        wa3 wa3Var = null;
        wa3 wa3Var2 = null;
        wa3 wa3Var3 = null;
        wa3 wa3Var4 = null;
        wa3 wa3Var5 = null;
        wa3 wa3Var6 = null;
        wa3 wa3Var7 = null;
        wa3 wa3Var8 = null;
        wa3 wa3Var9 = null;
        wa3 wa3Var10 = null;
        ic icVar2 = null;
        ic icVar3 = null;
        wa3 wa3Var11 = null;
        ic icVar4 = null;
        if (icVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar = null;
        }
        CharSequence text = icVar.n.getText();
        wa3 wa3Var12 = this$0.session;
        if (wa3Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            wa3Var12 = null;
        }
        if (!text.equals(wa3Var12.b("btn_dl_serv_gen_otp", this$0.getString(R.string.generate_otp)))) {
            if (Intrinsics.areEqual(this$0.rto_code, "") || StringsKt__StringsJVMKt.equals(this$0.rto_code, "0", true)) {
                wa3 wa3Var13 = this$0.session;
                if (wa3Var13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("session");
                } else {
                    wa3Var = wa3Var13;
                }
                Toast.makeText(this$0, wa3Var.b("select_rto", this$0.getString(R.string.please_select_rto)), 0).show();
                return;
            }
            ic icVar5 = this$0.binding;
            if (icVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar5 = null;
            }
            if (icVar5.i.getVisibility() == 0 && kt6.c(this$0.cmCampDesc)) {
                Toast.makeText(this$0, "Please select at least one RTO Camps", 0).show();
                return;
            }
            Intent intent = new Intent(this$0, (Class<?>) PersonalDetailsScreen.class);
            intent.putExtra("stateCd", this$0.t2().n());
            intent.putExtra("rtoCd", this$0.rto_code);
            intent.putExtra("rtoName", this$0.rtoName);
            ic icVar6 = this$0.binding;
            if (icVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                icVar4 = icVar6;
            }
            intent.putExtra("inputMobileNo", StringsKt__StringsKt.trim((CharSequence) String.valueOf(icVar4.q.getText())).toString());
            intent.putExtra("dataFromAadhar", false);
            intent.putExtra("campDesc", this$0.cmCampDesc);
            intent.putExtra("cmType", this$0.cmType);
            this$0.startActivity(intent);
            return;
        }
        if (Intrinsics.areEqual(this$0.rto_code, "") || StringsKt__StringsJVMKt.equals(this$0.rto_code, "0", true)) {
            wa3 wa3Var14 = this$0.session;
            if (wa3Var14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var11 = wa3Var14;
            }
            Toast.makeText(this$0, wa3Var11.b("select_rto", this$0.getString(R.string.please_select_rto)), 0).show();
            return;
        }
        ic icVar7 = this$0.binding;
        if (icVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar7 = null;
        }
        if (icVar7.i.getVisibility() == 0 && kt6.c(this$0.cmCampDesc)) {
            Toast.makeText(this$0, "Please select at least one RTO Camps", 0).show();
            return;
        }
        ic icVar8 = this$0.binding;
        if (icVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar8 = null;
        }
        if (icVar8.o.getVisibility() == 0) {
            ic icVar9 = this$0.binding;
            if (icVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar9 = null;
            }
            if (String.valueOf(icVar9.q.getText()).length() == 0) {
                wa3 wa3Var15 = this$0.session;
                if (wa3Var15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("session");
                } else {
                    wa3Var2 = wa3Var15;
                }
                Toast.makeText(this$0, wa3Var2.b("edit_dl_serv_mob_no", this$0.getString(R.string.enter_mobile_no)), 0).show();
                return;
            }
        }
        ic icVar10 = this$0.binding;
        if (icVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar10 = null;
        }
        if (icVar10.o.getVisibility() == 0) {
            ic icVar11 = this$0.binding;
            if (icVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar11 = null;
            }
            if (String.valueOf(icVar11.q.getText()).length() < 9) {
                wa3 wa3Var16 = this$0.session;
                if (wa3Var16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("session");
                } else {
                    wa3Var3 = wa3Var16;
                }
                Toast.makeText(this$0, wa3Var3.b("edit_dl_serv_mob_no", this$0.getString(R.string.enter_mobile_no)), 0).show();
                return;
            }
        }
        ic icVar12 = this$0.binding;
        if (icVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar12 = null;
        }
        if (icVar12.b.getVisibility() == 0) {
            ic icVar13 = this$0.binding;
            if (icVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar13 = null;
            }
            Editable text2 = icVar13.m.getText();
            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
            if (text2.length() == 0) {
                ic icVar14 = this$0.binding;
                if (icVar14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    icVar14 = null;
                }
                if (icVar14.d.getVisibility() == 0) {
                    ic icVar15 = this$0.binding;
                    if (icVar15 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        icVar15 = null;
                    }
                    if (icVar15.d.isChecked()) {
                        wa3 wa3Var17 = this$0.session;
                        if (wa3Var17 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("session");
                        } else {
                            wa3Var4 = wa3Var17;
                        }
                        Toast.makeText(this$0, wa3Var4.b("aadhar_number_error_msg", "Please enter aadhaar number"), 0).show();
                        return;
                    }
                }
            }
        }
        ic icVar16 = this$0.binding;
        if (icVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar16 = null;
        }
        if (icVar16.b.getVisibility() == 0) {
            ic icVar17 = this$0.binding;
            if (icVar17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar17 = null;
            }
            if (icVar17.m.getText().length() < 12) {
                ic icVar18 = this$0.binding;
                if (icVar18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    icVar18 = null;
                }
                if (icVar18.d.getVisibility() == 0) {
                    ic icVar19 = this$0.binding;
                    if (icVar19 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        icVar19 = null;
                    }
                    if (icVar19.d.isChecked()) {
                        wa3 wa3Var18 = this$0.session;
                        if (wa3Var18 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("session");
                        } else {
                            wa3Var5 = wa3Var18;
                        }
                        Toast.makeText(this$0, wa3Var5.b("valid_aadhaar_no", "Please enter the valid Aadhaar Number"), 0).show();
                        return;
                    }
                }
            }
        }
        ic icVar20 = this$0.binding;
        if (icVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar20 = null;
        }
        if (icVar20.b.getVisibility() == 0) {
            ic icVar21 = this$0.binding;
            if (icVar21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar21 = null;
            }
            if (icVar21.m.getText().length() > 12) {
                ic icVar22 = this$0.binding;
                if (icVar22 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    icVar22 = null;
                }
                if (icVar22.d.getVisibility() == 0) {
                    ic icVar23 = this$0.binding;
                    if (icVar23 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        icVar23 = null;
                    }
                    if (icVar23.d.isChecked()) {
                        wa3 wa3Var19 = this$0.session;
                        if (wa3Var19 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("session");
                        } else {
                            wa3Var6 = wa3Var19;
                        }
                        Toast.makeText(this$0, wa3Var6.b("valid_aadhaar_no", "Please enter the valid Aadhaar Number"), 0).show();
                        return;
                    }
                }
            }
        }
        ic icVar24 = this$0.binding;
        if (icVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar24 = null;
        }
        if (icVar24.b.getVisibility() == 0) {
            ic icVar25 = this$0.binding;
            if (icVar25 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar25 = null;
            }
            Editable text3 = icVar25.m.getText();
            Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
            if (text3.length() == 0) {
                ic icVar26 = this$0.binding;
                if (icVar26 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    icVar26 = null;
                }
                if (icVar26.z.getVisibility() == 0) {
                    ic icVar27 = this$0.binding;
                    if (icVar27 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        icVar27 = null;
                    }
                    if (icVar27.z.isChecked()) {
                        wa3 wa3Var20 = this$0.session;
                        if (wa3Var20 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("session");
                        } else {
                            wa3Var7 = wa3Var20;
                        }
                        Toast.makeText(this$0, wa3Var7.b("enter_virtual_id", "Please enter the Virtual Id"), 0).show();
                        return;
                    }
                }
            }
        }
        ic icVar28 = this$0.binding;
        if (icVar28 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar28 = null;
        }
        if (icVar28.b.getVisibility() == 0) {
            ic icVar29 = this$0.binding;
            if (icVar29 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar29 = null;
            }
            if (icVar29.m.getText().length() < 16) {
                ic icVar30 = this$0.binding;
                if (icVar30 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    icVar30 = null;
                }
                if (icVar30.z.getVisibility() == 0) {
                    ic icVar31 = this$0.binding;
                    if (icVar31 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        icVar31 = null;
                    }
                    if (icVar31.z.isChecked()) {
                        wa3 wa3Var21 = this$0.session;
                        if (wa3Var21 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("session");
                        } else {
                            wa3Var8 = wa3Var21;
                        }
                        Toast.makeText(this$0, wa3Var8.b("enter_virtual_id", "Please enter the Virtual Id"), 0).show();
                        return;
                    }
                }
            }
        }
        ic icVar32 = this$0.binding;
        if (icVar32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar32 = null;
        }
        if (icVar32.b.getVisibility() == 0) {
            ic icVar33 = this$0.binding;
            if (icVar33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar33 = null;
            }
            if (!icVar33.k.isChecked()) {
                ic icVar34 = this$0.binding;
                if (icVar34 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    icVar34 = null;
                }
                if (icVar34.z.getVisibility() == 0) {
                    ic icVar35 = this$0.binding;
                    if (icVar35 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        icVar35 = null;
                    }
                    if (icVar35.z.isChecked()) {
                        wa3 wa3Var22 = this$0.session;
                        if (wa3Var22 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("session");
                        } else {
                            wa3Var9 = wa3Var22;
                        }
                        Toast.makeText(this$0, wa3Var9.b("agree_with_kyc", "Please agree with VID based e-KYC consent"), 0).show();
                        return;
                    }
                }
            }
        }
        ic icVar36 = this$0.binding;
        if (icVar36 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar36 = null;
        }
        if (icVar36.b.getVisibility() == 0) {
            ic icVar37 = this$0.binding;
            if (icVar37 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar37 = null;
            }
            if (!icVar37.k.isChecked()) {
                ic icVar38 = this$0.binding;
                if (icVar38 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    icVar38 = null;
                }
                if (icVar38.d.getVisibility() == 0) {
                    ic icVar39 = this$0.binding;
                    if (icVar39 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        icVar39 = null;
                    }
                    if (icVar39.d.isChecked()) {
                        wa3 wa3Var23 = this$0.session;
                        if (wa3Var23 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("session");
                        } else {
                            wa3Var10 = wa3Var23;
                        }
                        Toast.makeText(this$0, wa3Var10.b("agree_with_adhar_bases_kyc", "Please agree with Aadhaar based e-KYC consent"), 0).show();
                        return;
                    }
                }
            }
        }
        if (this$0.generateOtpForMobile == 1) {
            ProgressDialog progressDialog = this$0.pDialog;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog = null;
            }
            progressDialog.show();
            nr1 nr1VarK2 = this$0.k2();
            ic icVar40 = this$0.binding;
            if (icVar40 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                icVar2 = icVar40;
            }
            nr1VarK2.F(this$0, String.valueOf(icVar2.q.getText()), this$0.v2().k());
            return;
        }
        ProgressDialog progressDialog2 = this$0.pDialog;
        if (progressDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pDialog");
            progressDialog2 = null;
        }
        progressDialog2.show();
        int iNextInt = new Random().nextInt(1410065407);
        String strC = qi5.a.c(this$0);
        Intrinsics.checkNotNull(strC);
        this$0.nk = strC;
        Log.d("token_adhar", strC);
        ml mlVarO2 = this$0.o2();
        ic icVar41 = this$0.binding;
        if (icVar41 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            icVar3 = icVar41;
        }
        mlVarO2.o(this$0.g2(StringsKt__StringsKt.trim((CharSequence) icVar3.m.getText().toString()).toString()), "sarEtrans25Ms", this$0.nk, String.valueOf(iNextInt));
    }

    public static final void G2(LearnerLicenceAadharScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ic icVar = this$0.binding;
        if (icVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar = null;
        }
        icVar.q.setText("");
    }

    public static final void H2(LearnerLicenceAadharScreen this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        zz5 zz5Var = this$0.campAdapter;
        if (zz5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("campAdapter");
            zz5Var = null;
        }
        zz5Var.j();
    }

    public static final void J2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K2(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        dialog.setCanceledOnTouchOutside(false);
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById2;
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById3;
        wa3 wa3Var = this.session;
        wa3 wa3Var2 = null;
        if (wa3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            wa3Var = null;
        }
        textView2.setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        wa3 wa3Var3 = this.session;
        if (wa3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
        } else {
            wa3Var2 = wa3Var3;
        }
        textView.setText(wa3Var2.b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kc3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenceAadharScreen.L2(dialog, view);
            }
        });
        dialog.show();
    }

    public static final void L2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void N2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void k3(LearnerLicenceAadharScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.otpAdhar;
        if (dialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpAdhar");
            dialog = null;
        }
        dialog.dismiss();
    }

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

    public static final void m3(LearnerLicenceAadharScreen this$0, TextView time_text, TextView resendOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(time_text, "$time_text");
        Intrinsics.checkNotNullParameter(resendOtp, "$resendOtp");
        ProgressDialog progressDialog = this$0.pDialog;
        ic icVar = null;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pDialog");
            progressDialog = null;
        }
        progressDialog.show();
        new v(time_text, resendOtp).start();
        int iNextInt = new SecureRandom().nextInt(1410065407);
        String strC = qi5.a.c(this$0);
        Intrinsics.checkNotNull(strC);
        this$0.nk = strC;
        Log.d("token_adhar", strC);
        ml mlVarO2 = this$0.o2();
        ic icVar2 = this$0.binding;
        if (icVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            icVar = icVar2;
        }
        mlVarO2.o(this$0.g2(StringsKt__StringsKt.trim((CharSequence) icVar.m.getText().toString()).toString()), "sarEtrans25Ms", this$0.nk, String.valueOf(iNextInt));
    }

    public static final void n3(final EditText enterOtp, LearnerLicenceAadharScreen this$0, TextView txt_reset, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(txt_reset, "$txt_reset");
        String string = enterOtp.getText().toString();
        ic icVar = null;
        wa3 wa3Var = null;
        wa3 wa3Var2 = null;
        if (string.length() == 0) {
            wa3 wa3Var3 = this$0.session;
            if (wa3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var = wa3Var3;
            }
            Toast.makeText(this$0, wa3Var.b("label_log_entr_otp", this$0.getString(R.string.pls_enter_otp)), 0).show();
        } else if (string.length() < 6) {
            wa3 wa3Var4 = this$0.session;
            if (wa3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var2 = wa3Var4;
            }
            Toast.makeText(this$0, wa3Var2.b("label_log_entr_val_otp", this$0.getString(R.string.pls_enter_valid_otp)), 0).show();
        } else {
            ProgressDialog progressDialog = this$0.pDialog;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog = null;
            }
            progressDialog.show();
            ml mlVarO2 = this$0.o2();
            ic icVar2 = this$0.binding;
            if (icVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                icVar = icVar2;
            }
            mlVarO2.p(this$0.g2(StringsKt__StringsKt.trim((CharSequence) icVar.m.getText().toString()).toString()), "sarEtrans25Ms", enterOtp.getText().toString(), String.valueOf(this$0.txnNo), this$0.nk);
        }
        txt_reset.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fc3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LearnerLicenceAadharScreen.o3(enterOtp, view2);
            }
        });
    }

    public static final void o3(EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        enterOtp.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
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

    public static final void r3(LearnerLicenceAadharScreen this$0, TextView time_text, TextView resendOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(time_text, "$time_text");
        Intrinsics.checkNotNullParameter(resendOtp, "$resendOtp");
        this$0.k2().D(this$0, String.valueOf(this$0.record_id));
        new x(time_text, this$0, resendOtp).start();
    }

    public static final void s3(LearnerLicenceAadharScreen this$0, EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        wa3 wa3Var = null;
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Context applicationContext = this$0.getApplicationContext();
            wa3 wa3Var2 = this$0.session;
            if (wa3Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var = wa3Var2;
            }
            Toast.makeText(applicationContext, wa3Var.b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
            return;
        }
        Editable text = enterOtp.getText();
        Intrinsics.checkNotNull(text);
        if (text.length() == 0) {
            wa3 wa3Var3 = this$0.session;
            if (wa3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var = wa3Var3;
            }
            Toast.makeText(this$0, wa3Var.b("label_log_entr_otp", this$0.getString(R.string.pls_enter_otp)), 0).show();
            return;
        }
        Editable text2 = enterOtp.getText();
        Intrinsics.checkNotNull(text2);
        if (text2.length() < 6) {
            wa3 wa3Var4 = this$0.session;
            if (wa3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
            } else {
                wa3Var = wa3Var4;
            }
            Toast.makeText(this$0, wa3Var.b("label_log_entr_val_otp", this$0.getString(R.string.pls_enter_valid_otp)), 0).show();
            return;
        }
        nr1 nr1VarK2 = this$0.k2();
        String string = enterOtp.getText().toString();
        String str = this$0.record_id;
        Intrinsics.checkNotNull(str);
        nr1VarK2.G(this$0, string, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t3(EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        enterOtp.setText("");
    }

    public static final void u3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void y2() {
        d3(new wl5(this));
        ic icVar = this.binding;
        ic icVar2 = null;
        if (icVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar = null;
        }
        icVar.p.f.setText(t2().k());
        ic icVar3 = this.binding;
        if (icVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar3 = null;
        }
        icVar3.p.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lc3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenceAadharScreen.z2(this.a, view);
            }
        });
        this.session = new wa3(this);
        this.pDialog = new ProgressDialog(this);
        f3(new ws6(this));
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pDialog");
            progressDialog = null;
        }
        wa3 wa3Var = this.session;
        if (wa3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            wa3Var = null;
        }
        progressDialog.setMessage(wa3Var.b("label_challan_please_wait", getString(R.string.please_wait)));
        ProgressDialog progressDialog2 = this.pDialog;
        if (progressDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pDialog");
            progressDialog2 = null;
        }
        progressDialog2.setCancelable(false);
        ProgressDialog progressDialog3 = this.pDialog;
        if (progressDialog3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pDialog");
            progressDialog3 = null;
        }
        progressDialog3.setCanceledOnTouchOutside(false);
        b3(DlServiceInt.INSTANCE.a(this));
        R2((nr1) new z(this, new rq1(new lr1(q2(), this))).a(nr1.class));
        c3(EkYCService.INSTANCE.a(this));
        Y2((aj5) new z(this, new zi5(new yi5(r2()))).a(aj5.class));
        T2(AadharInterface.INSTANCE.a(this));
        V2((ll) new z(this, new jl(new kl(l2()))).a(ll.class));
        U2(AdrInterface.INSTANCE.a(this));
        W2((ml) new z(this, new ol(new pl(m2()))).a(ml.class));
        this.service = NewLLServices.INSTANCE.a(this);
        NewLLServices newLLServices = this.service;
        if (newLLServices == null) {
            Intrinsics.throwUninitializedPropertyAccessException("service");
            newLLServices = null;
        }
        this.viewModal = (j94) new z(this, new k94(new i94(newLLServices))).a(j94.class);
        s2(t2().n());
        tx3.a aVar = tx3.a;
        aVar.f("0");
        aVar.e("0");
        ic icVar4 = this.binding;
        if (icVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar4 = null;
        }
        icVar4.v.setOnItemSelectedListener(new a());
        ic icVar5 = this.binding;
        if (icVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar5 = null;
        }
        icVar5.x.setText(VContant.INSTANCE.l(t2().n()));
        ic icVar6 = this.binding;
        if (icVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar6 = null;
        }
        TextView textView = icVar6.n;
        wa3 wa3Var2 = this.session;
        if (wa3Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            wa3Var2 = null;
        }
        textView.setText(wa3Var2.b("btn_dl_serv_gen_otp", getString(R.string.generate_otp)));
        ic icVar7 = this.binding;
        if (icVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar7 = null;
        }
        MyTextView myTextView = icVar7.e;
        wa3 wa3Var3 = this.session;
        if (wa3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            wa3Var3 = null;
        }
        myTextView.setText(wa3Var3.b("adhar_terms", getString(R.string.agree_with_adhar_terms)));
        this.type = "A";
        ic icVar8 = this.binding;
        if (icVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar8 = null;
        }
        icVar8.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mc3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenceAadharScreen.A2(this.a, view);
            }
        });
        ic icVar9 = this.binding;
        if (icVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar9 = null;
        }
        icVar9.c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.zepto.nc3
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
                LearnerLicenceAadharScreen.C2(this.a, radioGroup, i2);
            }
        });
        ic icVar10 = this.binding;
        if (icVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar10 = null;
        }
        icVar10.d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.oc3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                LearnerLicenceAadharScreen.D2(this.a, compoundButton, z);
            }
        });
        ic icVar11 = this.binding;
        if (icVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar11 = null;
        }
        icVar11.z.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.ub3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                LearnerLicenceAadharScreen.E2(this.a, compoundButton, z);
            }
        });
        ic icVar12 = this.binding;
        if (icVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar12 = null;
        }
        icVar12.n.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vb3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenceAadharScreen.F2(this.a, view);
            }
        });
        ic icVar13 = this.binding;
        if (icVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            icVar2 = icVar13;
        }
        icVar2.t.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wb3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenceAadharScreen.G2(this.a, view);
            }
        });
    }

    public static final void z2(LearnerLicenceAadharScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public final void I2(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById2;
        wa3 wa3Var = this.session;
        wa3 wa3Var2 = null;
        if (wa3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            wa3Var = null;
        }
        textView2.setText(wa3Var.b("btn_ok", getString(R.string.ok_txt)));
        textView.setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        TextView textView3 = (TextView) viewFindViewById3;
        wa3 wa3Var3 = this.session;
        if (wa3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            wa3Var3 = null;
        }
        textView3.setText(wa3Var3.b("nex_parivahan", "NextGen mParivahan"));
        wa3 wa3Var4 = this.session;
        if (wa3Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
        } else {
            wa3Var2 = wa3Var4;
        }
        textView2.setText(wa3Var2.b("btn_ok", "OK"));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cc3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenceAadharScreen.J2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void M2(Context context, String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jc3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenceAadharScreen.N2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void O2(Aadarkyc.DOEkyc dOEkyc) {
        Intrinsics.checkNotNullParameter(dOEkyc, "<set-?>");
        this.aadhaarData = dOEkyc;
    }

    public final void P2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhaarLastFourDigitMobileNo = str;
    }

    public final void Q2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.address = str;
    }

    public final void R2(nr1 nr1Var) {
        Intrinsics.checkNotNullParameter(nr1Var, "<set-?>");
        this.dlServicesViewModel = nr1Var;
    }

    public final void S2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eKYCGender = str;
    }

    public final void T2(AadharInterface aadharInterface) {
        Intrinsics.checkNotNullParameter(aadharInterface, "<set-?>");
        this.mAadharInterface = aadharInterface;
    }

    public final void U2(AdrInterface adrInterface) {
        Intrinsics.checkNotNullParameter(adrInterface, "<set-?>");
        this.mAadharInterface2 = adrInterface;
    }

    public final void V2(ll llVar) {
        Intrinsics.checkNotNullParameter(llVar, "<set-?>");
        this.mAadharViewModel = llVar;
    }

    public final void W2(ml mlVar) {
        Intrinsics.checkNotNullParameter(mlVar, "<set-?>");
        this.mAadharViewModel2 = mlVar;
    }

    public final void X2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.mRtosMaster = arrayList;
    }

    public final void Y2(aj5 aj5Var) {
        Intrinsics.checkNotNullParameter(aj5Var, "<set-?>");
        this.mView = aj5Var;
    }

    public final void Z2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.owner_name_addhaar = str;
    }

    public final void a3(String str) {
        this.record_id = str;
    }

    public final void b3(DlServiceInt dlServiceInt) {
        Intrinsics.checkNotNullParameter(dlServiceInt, "<set-?>");
        this.retrofitService = dlServiceInt;
    }

    public final void c3(EkYCService ekYCService) {
        Intrinsics.checkNotNullParameter(ekYCService, "<set-?>");
        this.retrofitService_one = ekYCService;
    }

    public final void d3(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final void e2() {
        ProgressDialog progressDialog = this.pDialog;
        ProgressDialog progressDialog2 = null;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pDialog");
            progressDialog = null;
        }
        if (progressDialog.isShowing()) {
            ProgressDialog progressDialog3 = this.pDialog;
            if (progressDialog3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog3 = null;
            }
            progressDialog3.dismiss();
        }
        ProgressDialog progressDialog4 = this.pDialog;
        if (progressDialog4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        } else {
            progressDialog2 = progressDialog4;
        }
        progressDialog2.show();
        if (Intrinsics.areEqual(t2().n(), "HP")) {
            n2().g(t2().n(), 509, StringsKt__StringsKt.trim((CharSequence) this.rto_code).toString());
        } else {
            n2().g(t2().n(), this.serviceCode, StringsKt__StringsKt.trim((CharSequence) this.rto_code).toString());
        }
    }

    public final void e3(int i2) {
        this.serviceCode = i2;
    }

    public final void f2() {
        try {
            this.cmCampDesc = "";
            this.cmType = "";
            ic icVar = this.binding;
            j94 j94Var = null;
            if (icVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar = null;
            }
            icVar.i.setVisibility(8);
            ic icVar2 = this.binding;
            if (icVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar2 = null;
            }
            icVar2.c.setVisibility(8);
            ic icVar3 = this.binding;
            if (icVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar3 = null;
            }
            icVar3.A.setVisibility(8);
            ic icVar4 = this.binding;
            if (icVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar4 = null;
            }
            icVar4.B.setVisibility(8);
            ic icVar5 = this.binding;
            if (icVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar5 = null;
            }
            icVar5.o.setVisibility(8);
            ic icVar6 = this.binding;
            if (icVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar6 = null;
            }
            icVar6.b.setVisibility(8);
            ic icVar7 = this.binding;
            if (icVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar7 = null;
            }
            icVar7.f.setVisibility(8);
            ProgressDialog progressDialog = this.pDialog;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog2 = this.pDialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                    progressDialog2 = null;
                }
                progressDialog2.dismiss();
            }
            ProgressDialog progressDialog3 = this.pDialog;
            if (progressDialog3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog3 = null;
            }
            progressDialog3.show();
            j94 j94Var2 = this.viewModal;
            if (j94Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModal");
            } else {
                j94Var = j94Var2;
            }
            j94Var.i(StringsKt__StringsKt.trim((CharSequence) this.rto_code).toString());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void f3(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final String g2(String aadhaarNumber) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Intrinsics.checkNotNullParameter(aadhaarNumber, "aadhaarNumber");
        SecretKeySpec secretKeySpec = new SecretKeySpec(Base64.getDecoder().decode("mUI66/XQZ0KfpKwbfh3/LYcFTM1nnHl8kV0+PkD40fw="), "AES");
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
        String strEncodeToString = Base64.getEncoder().encodeToString(bArr2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    public final void g3(String str) {
        this.txnNo = str;
    }

    public final String h2(String fdate) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy");
        try {
            Intrinsics.checkNotNull(fdate);
            Date date = simpleDateFormat.parse(fdate);
            Intrinsics.checkNotNull(date);
            return simpleDateFormat2.format(date);
        } catch (ParseException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final void h3() {
        ArrayList arrayList = this.campList;
        zz5 zz5Var = null;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("campList");
            arrayList = null;
        }
        wa3 wa3Var = this.session;
        if (wa3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            wa3Var = null;
        }
        this.campAdapter = new zz5(this, arrayList, wa3Var, this);
        ic icVar = this.binding;
        if (icVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar = null;
        }
        icVar.j.setLayoutManager(new LinearLayoutManager(this, 1, false));
        ic icVar2 = this.binding;
        if (icVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar2 = null;
        }
        RecyclerView recyclerView = icVar2.j;
        zz5 zz5Var2 = this.campAdapter;
        if (zz5Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("campAdapter");
        } else {
            zz5Var = zz5Var2;
        }
        recyclerView.setAdapter(zz5Var);
    }

    public final Aadarkyc.DOEkyc i2() {
        Aadarkyc.DOEkyc dOEkyc = this.aadhaarData;
        if (dOEkyc != null) {
            return dOEkyc;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhaarData");
        return null;
    }

    public final void i3() {
        ArrayList arrayList = new ArrayList();
        int size = p2().size();
        int i2 = -1;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.addAll(CollectionsKt__CollectionsJVMKt.listOf(((RtosMaster) p2().get(i3)).getRto_name()));
            if (Intrinsics.areEqual(t2().n(), "DL") && Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) ((RtosMaster) p2().get(i3)).getRto_code()).toString(), "DL1")) {
                i2 = i3;
            }
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ic icVar = null;
        if (Intrinsics.areEqual(t2().n(), "DL")) {
            ic icVar2 = this.binding;
            if (icVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar2 = null;
            }
            icVar2.v.setClickable(false);
            ic icVar3 = this.binding;
            if (icVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar3 = null;
            }
            icVar3.v.setEnabled(false);
        }
        ic icVar4 = this.binding;
        if (icVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar4 = null;
        }
        icVar4.v.setAdapter((SpinnerAdapter) arrayAdapter);
        if (i2 > 0) {
            ic icVar5 = this.binding;
            if (icVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                icVar = icVar5;
            }
            icVar.v.setSelection(i2);
        }
    }

    /* JADX INFO: renamed from: j2, reason: from getter */
    public final String getAadhaarLastFourDigitMobileNo() {
        return this.aadhaarLastFourDigitMobileNo;
    }

    public final void j3(Context context, String mobile_no) {
        String str;
        ImageView imageView;
        Dialog dialog;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        Dialog dialog2 = new Dialog(context);
        this.otpAdhar = dialog2;
        dialog2.setContentView(R.layout.validateotp);
        Dialog dialog3 = this.otpAdhar;
        if (dialog3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpAdhar");
            dialog3 = null;
        }
        dialog3.setCanceledOnTouchOutside(false);
        Dialog dialog4 = this.otpAdhar;
        if (dialog4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpAdhar");
            dialog4 = null;
        }
        dialog4.setCancelable(false);
        Dialog dialog5 = this.otpAdhar;
        if (dialog5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpAdhar");
            dialog5 = null;
        }
        Window window = dialog5.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Dialog dialog6 = this.otpAdhar;
        if (dialog6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpAdhar");
            dialog6 = null;
        }
        View viewFindViewById = dialog6.findViewById(R.id.resendOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        final TextView textView = (TextView) viewFindViewById;
        Dialog dialog7 = this.otpAdhar;
        if (dialog7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpAdhar");
            dialog7 = null;
        }
        View viewFindViewById2 = dialog7.findViewById(R.id.showmpin);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ImageView imageView2 = (ImageView) viewFindViewById2;
        Dialog dialog8 = this.otpAdhar;
        if (dialog8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpAdhar");
            dialog8 = null;
        }
        View viewFindViewById3 = dialog8.findViewById(R.id.submitOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById3;
        Dialog dialog9 = this.otpAdhar;
        if (dialog9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpAdhar");
            dialog9 = null;
        }
        View viewFindViewById4 = dialog9.findViewById(R.id.enterOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        final EditText editText = (EditText) viewFindViewById4;
        Dialog dialog10 = this.otpAdhar;
        if (dialog10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpAdhar");
            dialog10 = null;
        }
        View viewFindViewById5 = dialog10.findViewById(R.id.time_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        final TextView textView3 = (TextView) viewFindViewById5;
        Dialog dialog11 = this.otpAdhar;
        if (dialog11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpAdhar");
            dialog11 = null;
        }
        View viewFindViewById6 = dialog11.findViewById(R.id.txt_reset);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        final TextView textView4 = (TextView) viewFindViewById6;
        Dialog dialog12 = this.otpAdhar;
        if (dialog12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpAdhar");
            dialog12 = null;
        }
        View viewFindViewById7 = dialog12.findViewById(R.id.disPlay_mobile);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        TextView textView5 = (TextView) viewFindViewById7;
        Dialog dialog13 = this.otpAdhar;
        if (dialog13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpAdhar");
            dialog13 = null;
        }
        View viewFindViewById8 = dialog13.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        ImageView imageView3 = (ImageView) viewFindViewById8;
        Dialog dialog14 = this.otpAdhar;
        if (dialog14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpAdhar");
            dialog14 = null;
        }
        View viewFindViewById9 = dialog14.findViewById(R.id.disPlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        TextView textView6 = (TextView) viewFindViewById9;
        Dialog dialog15 = this.otpAdhar;
        if (dialog15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpAdhar");
            str = "otpAdhar";
            dialog15 = null;
        } else {
            str = "otpAdhar";
        }
        View viewFindViewById10 = dialog15.findViewById(R.id.enter_otp_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        TextView textView7 = (TextView) viewFindViewById10;
        wa3 wa3Var = this.session;
        if (wa3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            imageView = imageView2;
            wa3Var = null;
        } else {
            imageView = imageView2;
        }
        textView6.setText(wa3Var.b("otp_verification", getString(R.string.otp_verification)));
        wa3 wa3Var2 = this.session;
        if (wa3Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            wa3Var2 = null;
        }
        textView7.setText(wa3Var2.b("edit_enter_otp", getString(R.string.enter_otp)));
        wa3 wa3Var3 = this.session;
        if (wa3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            wa3Var3 = null;
        }
        editText.setHint(wa3Var3.b("edit_enter_otp", getString(R.string.enter_otp)));
        wa3 wa3Var4 = this.session;
        if (wa3Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            wa3Var4 = null;
        }
        textView.setText(wa3Var4.b("label_resend_otp", getString(R.string.resend_otp)));
        wa3 wa3Var5 = this.session;
        if (wa3Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            wa3Var5 = null;
        }
        textView2.setText(wa3Var5.b("vahan_btn_submit", getString(R.string.submit)));
        wa3 wa3Var6 = this.session;
        if (wa3Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            wa3Var6 = null;
        }
        textView4.setText(wa3Var6.b("btn_reset", getString(R.string.reset)));
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tb3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenceAadharScreen.k3(this.a, view);
            }
        });
        try {
            StringBuilder sb = new StringBuilder();
            wa3 wa3Var7 = this.session;
            if (wa3Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
                wa3Var7 = null;
            }
            sb.append(wa3Var7.b("aadhar_otp_register_mobile_no", context.getString(R.string.aadhaar_otp_sent_registe)));
            sb.append("\n\n+91-XXXXXX");
            sb.append(mobile_no);
            textView5.setText(sb.toString());
        } catch (Exception unused) {
            wa3 wa3Var8 = this.session;
            if (wa3Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
                wa3Var8 = null;
            }
            textView5.setText(wa3Var8.b("aadhar_otp_register_mobile_no", context.getString(R.string.aadhaar_otp_sent_registe)));
        }
        new u(textView3, textView).start();
        final ImageView imageView4 = imageView;
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ec3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenceAadharScreen.l3(editText, imageView4, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hc3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenceAadharScreen.m3(this.a, textView3, textView, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ic3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenceAadharScreen.n3(editText, this, textView4, view);
            }
        });
        Dialog dialog16 = this.otpAdhar;
        if (dialog16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            dialog = null;
        } else {
            dialog = dialog16;
        }
        dialog.show();
    }

    @Override // com.zepto.a06
    public void k(int position) {
        ic icVar = this.binding;
        CheckByState checkByState = null;
        if (icVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar = null;
        }
        icVar.j.post(new Runnable() { // from class: com.zepto.dc3
            @Override // java.lang.Runnable
            public final void run() {
                LearnerLicenceAadharScreen.H2(this.c);
            }
        });
        ArrayList arrayList = this.campList;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("campList");
            arrayList = null;
        }
        if (arrayList.size() > 0) {
            ArrayList arrayList2 = this.campList;
            if (arrayList2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("campList");
                arrayList2 = null;
            }
            this.cmCampDesc = ((CampDetailsResponseModal) arrayList2.get(position)).getCmCampDesc();
            ArrayList arrayList3 = this.campList;
            if (arrayList3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("campList");
                arrayList3 = null;
            }
            this.cmType = ((CampDetailsResponseModal) arrayList3.get(position)).getCmType();
            tx3.a aVar = tx3.a;
            ArrayList arrayList4 = this.campList;
            if (arrayList4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("campList");
                arrayList4 = null;
            }
            aVar.f(((CampDetailsResponseModal) arrayList4.get(position)).getCmCampDesc());
            ArrayList arrayList5 = this.campList;
            if (arrayList5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("campList");
                arrayList5 = null;
            }
            aVar.e(((CampDetailsResponseModal) arrayList5.get(position)).getCmCampCode());
        }
        CheckByState checkByState2 = this.aadharDataCheckByState;
        if (checkByState2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("aadharDataCheckByState");
        } else {
            checkByState = checkByState2;
        }
        x2(checkByState);
    }

    public final nr1 k2() {
        nr1 nr1Var = this.dlServicesViewModel;
        if (nr1Var != null) {
            return nr1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlServicesViewModel");
        return null;
    }

    public final AadharInterface l2() {
        AadharInterface aadharInterface = this.mAadharInterface;
        if (aadharInterface != null) {
            return aadharInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAadharInterface");
        return null;
    }

    public final AdrInterface m2() {
        AdrInterface adrInterface = this.mAadharInterface2;
        if (adrInterface != null) {
            return adrInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAadharInterface2");
        return null;
    }

    public final ll n2() {
        ll llVar = this.mAadharViewModel;
        if (llVar != null) {
            return llVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAadharViewModel");
        return null;
    }

    public final ml o2() {
        ml mlVar = this.mAadharViewModel2;
        if (mlVar != null) {
            return mlVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAadharViewModel2");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ic icVarC = ic.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(icVarC, "inflate(...)");
        this.binding = icVarC;
        j94 j94Var = null;
        if (icVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVarC = null;
        }
        setContentView(icVarC.b());
        ta3.a aVar = ta3.a;
        ic icVar = this.binding;
        if (icVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar = null;
        }
        aVar.b1(this, icVar);
        SharedPreferences sharedPreferences = getSharedPreferences("AddLLVehicleClass", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.pref = sharedPreferences;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pref");
            sharedPreferences = null;
        }
        sharedPreferences.edit().clear().apply();
        y2();
        k2().y().g(this, new t(new k()));
        k2().A().g(this, new t(new l()));
        n2().j().g(this, new t(new m()));
        n2().i().g(this, new t(new n()));
        k2().u().g(this, new t(new o()));
        k2().E().g(this, new t(new p()));
        o2().i().g(this, new t(new q()));
        o2().k().g(this, new t(new r()));
        o2().j().g(this, new t(new s()));
        n2().l().g(this, new t(new b()));
        n2().h().g(this, new t(new c()));
        j94 j94Var2 = this.viewModal;
        if (j94Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModal");
        } else {
            j94Var = j94Var2;
        }
        j94Var.l().g(this, new t(new d()));
        o2().m().g(this, new t(new e()));
        o2().g().g(this, new t(new f()));
        o2().h().g(this, new t(new g()));
        o2().n().g(this, new t(new h()));
        o2().l().g(this, new t(new i()));
        n2().m().g(this, new t(new j()));
    }

    public final ArrayList p2() {
        ArrayList arrayList = this.mRtosMaster;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRtosMaster");
        return null;
    }

    public final void p3(Context context, String mobile_no) {
        wa3 wa3Var;
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
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        View viewFindViewById2 = dialog.findViewById(R.id.resendOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        final TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.showmpin);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        final ImageView imageView2 = (ImageView) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.submitOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById4;
        View viewFindViewById5 = dialog.findViewById(R.id.enterOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        final EditText editText = (EditText) viewFindViewById5;
        View viewFindViewById6 = dialog.findViewById(R.id.time_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        final TextView textView3 = (TextView) viewFindViewById6;
        View viewFindViewById7 = dialog.findViewById(R.id.txt_reset);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        TextView textView4 = (TextView) viewFindViewById7;
        View viewFindViewById8 = dialog.findViewById(R.id.disPlay_mobile);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        TextView textView5 = (TextView) viewFindViewById8;
        View viewFindViewById9 = dialog.findViewById(R.id.disPlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        TextView textView6 = (TextView) viewFindViewById9;
        View viewFindViewById10 = dialog.findViewById(R.id.enter_otp_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        TextView textView7 = (TextView) viewFindViewById10;
        wa3 wa3Var2 = this.session;
        if (wa3Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            wa3Var2 = null;
        }
        textView6.setText(wa3Var2.b("otp_verification", getString(R.string.otp_verification)));
        wa3 wa3Var3 = this.session;
        if (wa3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            wa3Var3 = null;
        }
        textView2.setText(wa3Var3.b("vahan_btn_submit", getString(R.string.submit)));
        wa3 wa3Var4 = this.session;
        if (wa3Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            wa3Var4 = null;
        }
        textView4.setText(wa3Var4.b("btn_reset", getString(R.string.reset)));
        wa3 wa3Var5 = this.session;
        if (wa3Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            wa3Var5 = null;
        }
        textView.setText(wa3Var5.b("label_resend_otp", getString(R.string.resend_otp)));
        wa3 wa3Var6 = this.session;
        if (wa3Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            wa3Var6 = null;
        }
        editText.setHint(wa3Var6.b("edit_enter_otp", getString(R.string.enter_otp)));
        wa3 wa3Var7 = this.session;
        if (wa3Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            wa3Var7 = null;
        }
        textView7.setText(wa3Var7.b("edit_enter_otp", getString(R.string.enter_otp)));
        try {
            if (mobile_no.length() == 10) {
                StringBuilder sb = new StringBuilder();
                wa3 wa3Var8 = this.session;
                if (wa3Var8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("session");
                    wa3Var8 = null;
                }
                sb.append(wa3Var8.b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
                sb.append("\n+91 - XXXXXX");
                String strSubstring = mobile_no.substring(6, 10);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(strSubstring);
                textView5.setText(sb.toString());
            } else {
                wa3 wa3Var9 = this.session;
                if (wa3Var9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("session");
                    wa3Var9 = null;
                }
                textView5.setText(wa3Var9.b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
            }
        } catch (Exception unused) {
            wa3 wa3Var10 = this.session;
            if (wa3Var10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("session");
                wa3Var = null;
            } else {
                wa3Var = wa3Var10;
            }
            textView5.setText(wa3Var.b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
        }
        new w(textView3, this, textView).start();
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xb3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenceAadharScreen.q3(editText, imageView2, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yb3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenceAadharScreen.r3(this.a, textView3, textView, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zb3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenceAadharScreen.s3(this.a, editText, view);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ac3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenceAadharScreen.t3(editText, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bc3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnerLicenceAadharScreen.u3(dialog, view);
            }
        });
        dialog.show();
    }

    public final DlServiceInt q2() {
        DlServiceInt dlServiceInt = this.retrofitService;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final EkYCService r2() {
        EkYCService ekYCService = this.retrofitService_one;
        if (ekYCService != null) {
            return ekYCService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService_one");
        return null;
    }

    public final void s2(String stateCode) {
        try {
            ProgressDialog progressDialog = this.pDialog;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog = null;
            }
            progressDialog.show();
            k2().h(this, stateCode);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final wl5 t2() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    /* JADX INFO: renamed from: u2, reason: from getter */
    public final int getServiceCode() {
        return this.serviceCode;
    }

    public final ws6 v2() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    /* JADX INFO: renamed from: w2, reason: from getter */
    public final String getTxnNo() {
        return this.txnNo;
    }

    public final void x2(CheckByState checkByState) {
        ic icVar = this.binding;
        ic icVar2 = null;
        if (icVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            icVar = null;
        }
        icVar.f.setVisibility(0);
        if (StringsKt__StringsJVMKt.equals(checkByState.getEkycRequired(), "N", true)) {
            ic icVar3 = this.binding;
            if (icVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar3 = null;
            }
            icVar3.c.setVisibility(0);
            ic icVar4 = this.binding;
            if (icVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar4 = null;
            }
            icVar4.A.setVisibility(8);
            ic icVar5 = this.binding;
            if (icVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar5 = null;
            }
            icVar5.B.setVisibility(0);
            ic icVar6 = this.binding;
            if (icVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar6 = null;
            }
            icVar6.B.setChecked(true);
            ic icVar7 = this.binding;
            if (icVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar7 = null;
            }
            icVar7.o.setVisibility(0);
            ic icVar8 = this.binding;
            if (icVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar8 = null;
            }
            icVar8.b.setVisibility(8);
        } else {
            ic icVar9 = this.binding;
            if (icVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar9 = null;
            }
            icVar9.c.setVisibility(0);
            ic icVar10 = this.binding;
            if (icVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar10 = null;
            }
            icVar10.A.setVisibility(0);
            ic icVar11 = this.binding;
            if (icVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar11 = null;
            }
            icVar11.B.setVisibility(0);
            ic icVar12 = this.binding;
            if (icVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar12 = null;
            }
            icVar12.o.setVisibility(8);
            ic icVar13 = this.binding;
            if (icVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                icVar13 = null;
            }
            icVar13.b.setVisibility(0);
        }
        if (kt6.d(t2().n()) && Intrinsics.areEqual(t2().n(), "GJ")) {
            ic icVar14 = this.binding;
            if (icVar14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                icVar2 = icVar14;
            }
            icVar2.f.requestFocus();
        }
    }
}
