package com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.EkYCService;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.eKycResponse;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.EkycVerifyResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.OwnerDetailPuccPermit;
import com.nic.mparivahan.VahanServices.VahanService.UpdateMobileUpdated;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanCommonConfirmationScreen;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileUpdateModel.OwnerDetailEntity;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.AadharrValidateForMobileRes;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.ApiMessage;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.ApiMessageX;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.Data;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.MobileViewModel.UpdateRegisterResponse;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.VahanValidateUpdateMobileActivity;
import com.zepto.al7;
import com.zepto.bg7;
import com.zepto.bl7;
import com.zepto.e47;
import com.zepto.eh;
import com.zepto.em7;
import com.zepto.f47;
import com.zepto.gf;
import com.zepto.hf;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.kk7;
import com.zepto.kt6;
import com.zepto.ld7;
import com.zepto.lk7;
import com.zepto.mf;
import com.zepto.mf4;
import com.zepto.mt6;
import com.zepto.of;
import com.zepto.pq;
import com.zepto.s14;
import com.zepto.ta3;
import com.zepto.vh7;
import com.zepto.vq6;
import com.zepto.wa3;
import com.zepto.wq6;
import com.zepto.ws6;
import com.zepto.yy0;
import com.zepto.zq6;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0003J\b\u0010\u0005\u001a\u00020\u0002H\u0003J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0003J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\u0012\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000bH\u0007J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u000bJ\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u000bJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u000bJ\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000bH\u0007R\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0016\u0010,\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010'R\u0016\u0010.\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010'R\u0016\u00100\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010'R\u0016\u00102\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010'R\u0016\u00104\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010'R\"\u0010:\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010'\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010>\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010'\u001a\u0004\b<\u00107\"\u0004\b=\u00109R\"\u0010B\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010'\u001a\u0004\b@\u00107\"\u0004\bA\u00109R\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\"\u0010^\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010f\u001a\u00020_8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010n\u001a\u00020g8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010r\u001a\u00020_8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bo\u0010a\u001a\u0004\bp\u0010c\"\u0004\bq\u0010eR\"\u0010z\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR%\u0010\u0082\u0001\u001a\u00020{8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R&\u0010\u0086\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010'\u001a\u0005\b\u0084\u0001\u00107\"\u0005\b\u0085\u0001\u00109R,\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R%\u0010\u0091\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b$\u0010'\u001a\u0005\b\u008f\u0001\u00107\"\u0005\b\u0090\u0001\u00109R&\u0010\u0095\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0092\u0001\u0010'\u001a\u0005\b\u0093\u0001\u00107\"\u0005\b\u0094\u0001\u00109R&\u0010\u0099\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0096\u0001\u0010'\u001a\u0005\b\u0097\u0001\u00107\"\u0005\b\u0098\u0001\u00109R(\u0010\u009f\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u009a\u0001\u0010$\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R*\u0010§\u0001\u001a\u00030 \u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R*\u0010¯\u0001\u001a\u00030¨\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R#\u0010´\u0001\u001a\f\u0012\u0005\u0012\u00030±\u0001\u0018\u00010°\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R&\u0010¸\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bµ\u0001\u0010'\u001a\u0005\b¶\u0001\u00107\"\u0005\b·\u0001\u00109RG\u0010Á\u0001\u001a \u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0¹\u0001j\u000f\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b`º\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001\"\u0006\b¿\u0001\u0010À\u0001R\u001a\u0010Å\u0001\u001a\u00030Â\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R\u001a\u0010É\u0001\u001a\u00030Æ\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001R\u0018\u0010Ë\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÊ\u0001\u0010'R-\u0010Ñ\u0001\u001a\u0016\u0012\u0005\u0012\u00030Í\u00010Ì\u0001j\n\u0012\u0005\u0012\u00030Í\u0001`Î\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÏ\u0001\u0010Ð\u0001¨\u0006Ô\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/updateMobileNo/UpdateMobileNumber/VahanValidateUpdateMobileActivity;", "Lcom/zepto/pq;", "", "W1", "A2", "j2", "Q1", "", "U2", "V2", "T2", "", "it", "", "showHomePage", "O2", "u2", "R1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "Landroid/content/Context;", "context", "mobile_no", "c3", "message", "v2", "R2", "G1", "W2", "Lcom/zepto/eh;", "C", "Lcom/zepto/eh;", "binding", "D", "Z", "isAadharEnable", "E", "Ljava/lang/String;", "regNo", "F", "stateCd", "G", "stateName", "H", "ownerName", "I", "mobileNo", "J", "aadharNo", "K", "emailId", "L", "getOtpId", "()Ljava/lang/String;", "C2", "(Ljava/lang/String;)V", "otpId", "M", "getRcNo", "D2", "rcNo", "N", "U1", "setChassiNo", "chassiNo", "Lcom/zepto/wq6;", "O", "Lcom/zepto/wq6;", "h2", "()Lcom/zepto/wq6;", "M2", "(Lcom/zepto/wq6;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/UpdateMobileUpdated;", "P", "Lcom/nic/mparivahan/VahanServices/VahanService/UpdateMobileUpdated;", "b2", "()Lcom/nic/mparivahan/VahanServices/VahanService/UpdateMobileUpdated;", "G2", "(Lcom/nic/mparivahan/VahanServices/VahanService/UpdateMobileUpdated;)V", "retrofitService", "Landroid/app/ProgressDialog;", "Q", "Landroid/app/ProgressDialog;", "dialog", "Lcom/zepto/lk7;", "R", "Lcom/zepto/lk7;", "g2", "()Lcom/zepto/lk7;", "L2", "(Lcom/zepto/lk7;)V", "verifyOtpViewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "S", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "f2", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "K2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;)V", "verifyOtpRetrofitService", "Lcom/zepto/al7;", "T", "Lcom/zepto/al7;", "i2", "()Lcom/zepto/al7;", "N2", "(Lcom/zepto/al7;)V", "viewModel1", "U", "c2", "H2", "retrofitService1", "Landroid/app/Dialog;", "V", "Landroid/app/Dialog;", "V1", "()Landroid/app/Dialog;", "z2", "(Landroid/app/Dialog;)V", "d", "Lcom/zepto/wa3;", "W", "Lcom/zepto/wa3;", "X1", "()Lcom/zepto/wa3;", "B2", "(Lcom/zepto/wa3;)V", "languageKeySession", "X", "Z1", "E2", "rc_number", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "Y", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "a2", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "F2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "Y1", "setOff_code", "off_code", "a0", "T1", "y2", "aadhar_name", "b0", "S1", "x2", "aadhar_address", "c0", "s2", "()Z", "setFaceless", "(Z)V", "isFaceless", "Lcom/zepto/ld7;", "d0", "Lcom/zepto/ld7;", "e2", "()Lcom/zepto/ld7;", "J2", "(Lcom/zepto/ld7;)V", "vahanViewModle", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "e0", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "d2", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "I2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "vahanService", "Lcom/zepto/of;", "Landroid/content/Intent;", "f0", "Lcom/zepto/of;", "launcherAadhaar", "g0", "getAuthMode", "setAuthMode", "authMode", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "h0", "Ljava/util/HashMap;", "getServiceSelectionHashMap", "()Ljava/util/HashMap;", "setServiceSelectionHashMap", "(Ljava/util/HashMap;)V", "serviceSelectionHashMap", "Lcom/zepto/f47;", "i0", "Lcom/zepto/f47;", "mView", "Lcom/nic/mparivahan/VahanEkyc/EkYCService;", "j0", "Lcom/nic/mparivahan/VahanEkyc/EkYCService;", "retrofitService_one", "k0", "txnNo", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/updateMobileNo/UpdateMobileNumber/MobileUpdateModel/OwnerDetailEntity;", "Lkotlin/collections/ArrayList;", "l0", "Ljava/util/ArrayList;", "receivedOwnerObjList", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nVahanValidateUpdateMobileActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VahanValidateUpdateMobileActivity.kt\ncom/nic/mparivahan/VahanServices/updateMobileNo/UpdateMobileNumber/VahanValidateUpdateMobileActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1129:1\n1855#2,2:1130\n*S KotlinDebug\n*F\n+ 1 VahanValidateUpdateMobileActivity.kt\ncom/nic/mparivahan/VahanServices/updateMobileNo/UpdateMobileNumber/VahanValidateUpdateMobileActivity\n*L\n135#1:1130,2\n*E\n"})
public final class VahanValidateUpdateMobileActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public eh binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public boolean isAadharEnable;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public wq6 viewModel;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public UpdateMobileUpdated retrofitService;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public ProgressDialog dialog;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public lk7 verifyOtpViewModel;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public VahanServiceConnection verifyOtpRetrofitService;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public al7 viewModel1;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public VahanServiceConnection retrofitService1;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public Dialog d;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public wa3 languageKeySession;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String rc_number;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public ld7 vahanViewModle;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public VahanProService vahanService;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public of launcherAadhaar;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public f47 mView;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public EkYCService retrofitService_one;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String regNo = "";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String stateCd = "";

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String stateName = "";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String ownerName = "";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String mobileNo = "";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String aadharNo = "";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String emailId = "";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String otpId = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String rcNo = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String chassiNo = "";

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String off_code = "";

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public String authMode = "";

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public HashMap serviceSelectionHashMap = new HashMap();

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public String txnNo = "";

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public ArrayList receivedOwnerObjList = new ArrayList();

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            ProgressDialog progressDialog = VahanValidateUpdateMobileActivity.this.dialog;
            ProgressDialog progressDialog2 = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog3 = VahanValidateUpdateMobileActivity.this.dialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    progressDialog2 = progressDialog3;
                }
                progressDialog2.dismiss();
            }
            VahanValidateUpdateMobileActivity.this.O2(str, 0);
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(AadharrValidateForMobileRes aadharrValidateForMobileRes) {
            ProgressDialog progressDialog = VahanValidateUpdateMobileActivity.this.dialog;
            eh ehVar = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog2 = VahanValidateUpdateMobileActivity.this.dialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog2 = null;
                }
                progressDialog2.dismiss();
            }
            ApiMessage apiMessage = aadharrValidateForMobileRes.getApiMessage();
            if (apiMessage == null || apiMessage.getStatusCode() != 200) {
                return;
            }
            eh ehVar2 = VahanValidateUpdateMobileActivity.this.binding;
            if (ehVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar2 = null;
            }
            ehVar2.f.setFocusable(0);
            eh ehVar3 = VahanValidateUpdateMobileActivity.this.binding;
            if (ehVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar3 = null;
            }
            ehVar3.m.setFocusable(0);
            eh ehVar4 = VahanValidateUpdateMobileActivity.this.binding;
            if (ehVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar4 = null;
            }
            ehVar4.b.setFocusable(0);
            eh ehVar5 = VahanValidateUpdateMobileActivity.this.binding;
            if (ehVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar5 = null;
            }
            ehVar5.h.setVisibility(8);
            eh ehVar6 = VahanValidateUpdateMobileActivity.this.binding;
            if (ehVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar6 = null;
            }
            ehVar6.g.setVisibility(8);
            eh ehVar7 = VahanValidateUpdateMobileActivity.this.binding;
            if (ehVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ehVar = ehVar7;
            }
            ehVar.o.setVisibility(0);
            VahanValidateUpdateMobileActivity.this.Q1();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AadharrValidateForMobileRes) obj);
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
            ProgressDialog progressDialog = VahanValidateUpdateMobileActivity.this.dialog;
            ProgressDialog progressDialog2 = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog3 = VahanValidateUpdateMobileActivity.this.dialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    progressDialog2 = progressDialog3;
                }
                progressDialog2.dismiss();
            }
            VahanValidateUpdateMobileActivity.this.O2(str, 0);
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
            ProgressDialog progressDialog = VahanValidateUpdateMobileActivity.this.dialog;
            ProgressDialog progressDialog2 = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog3 = VahanValidateUpdateMobileActivity.this.dialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    progressDialog2 = progressDialog3;
                }
                progressDialog2.dismiss();
            }
            VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity = VahanValidateUpdateMobileActivity.this;
            vahanValidateUpdateMobileActivity.G1(vahanValidateUpdateMobileActivity, str);
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(OwnerDetailPuccPermit ownerDetailPuccPermit) {
            ProgressDialog progressDialog = null;
            try {
                String regn_no = ownerDetailPuccPermit.getRegn_no();
                if (regn_no != null && regn_no.length() != 0) {
                    Intrinsics.checkNotNull(ownerDetailPuccPermit);
                    VahanValidateUpdateMobileActivity.this.F2(VContant.INSTANCE.c(ownerDetailPuccPermit.copy(((-32769) & 1) != 0 ? ownerDetailPuccPermit.aadhar_no : null, ((-32769) & 2) != 0 ? ownerDetailPuccPermit.ac_fitted : null, ((-32769) & 4) != 0 ? ownerDetailPuccPermit.annual_income : null, ((-32769) & 8) != 0 ? ownerDetailPuccPermit.appl_no : null, ((-32769) & 16) != 0 ? ownerDetailPuccPermit.audio_fitted : null, ((-32769) & 32) != 0 ? ownerDetailPuccPermit.body_type : null, ((-32769) & 64) != 0 ? ownerDetailPuccPermit.c_add1 : null, ((-32769) & 128) != 0 ? ownerDetailPuccPermit.c_add2 : null, ((-32769) & 256) != 0 ? ownerDetailPuccPermit.c_add3 : null, ((-32769) & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.c_district : null, ((-32769) & 1024) != 0 ? ownerDetailPuccPermit.c_district_name : null, ((-32769) & 2048) != 0 ? ownerDetailPuccPermit.c_off_cd : null, ((-32769) & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.c_pincode : null, ((-32769) & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.c_state : null, ((-32769) & 16384) != 0 ? ownerDetailPuccPermit.c_state_name : null, ((-32769) & 32768) != 0 ? ownerDetailPuccPermit.chasi_no : VahanValidateUpdateMobileActivity.this.getChassiNo(), ((-32769) & 65536) != 0 ? ownerDetailPuccPermit.chasi_no_original : null, ((-32769) & 131072) != 0 ? ownerDetailPuccPermit.color : null, ((-32769) & 262144) != 0 ? ownerDetailPuccPermit.conditionstatus : null, ((-32769) & 524288) != 0 ? ownerDetailPuccPermit.cubic_cap : null, ((-32769) & 1048576) != 0 ? ownerDetailPuccPermit.dealer_cd : null, ((-32769) & 2097152) != 0 ? ownerDetailPuccPermit.dept_cd : null, ((-32769) & 4194304) != 0 ? ownerDetailPuccPermit.dlRequired : null, ((-32769) & 8388608) != 0 ? ownerDetailPuccPermit.dlValidationRequired : null, ((-32769) & 16777216) != 0 ? ownerDetailPuccPermit.dl_no : null, ((-32769) & 33554432) != 0 ? ownerDetailPuccPermit.dlr_add1 : null, ((-32769) & 67108864) != 0 ? ownerDetailPuccPermit.dlr_add2 : null, ((-32769) & 134217728) != 0 ? ownerDetailPuccPermit.dlr_add3 : null, ((-32769) & 268435456) != 0 ? ownerDetailPuccPermit.dlr_city : null, ((-32769) & 536870912) != 0 ? ownerDetailPuccPermit.dlr_district : null, ((-32769) & 1073741824) != 0 ? ownerDetailPuccPermit.dlr_name : null, ((-32769) & IntCompanionObject.MIN_VALUE) != 0 ? ownerDetailPuccPermit.dlr_pincode : null, ((-1) & 1) != 0 ? ownerDetailPuccPermit.email_id : null, ((-1) & 2) != 0 ? ownerDetailPuccPermit.eng_no : null, ((-1) & 4) != 0 ? ownerDetailPuccPermit.eng_no_original : null, ((-1) & 8) != 0 ? ownerDetailPuccPermit.eng_no_orignal : null, ((-1) & 16) != 0 ? ownerDetailPuccPermit.f_name : null, ((-1) & 32) != 0 ? ownerDetailPuccPermit.fit_upto : null, ((-1) & 64) != 0 ? ownerDetailPuccPermit.fit_uptoAsDate : null, ((-1) & 128) != 0 ? ownerDetailPuccPermit.fit_upto_desc : null, ((-1) & 256) != 0 ? ownerDetailPuccPermit.flag : null, ((-1) & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.floor_area : null, ((-1) & 1024) != 0 ? ownerDetailPuccPermit.formatRegn_dt : null, ((-1) & 2048) != 0 ? ownerDetailPuccPermit.fuel : null, ((-1) & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.fuel_descr : null, ((-1) & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.garage_add : null, ((-1) & 16384) != 0 ? ownerDetailPuccPermit.gcw : null, ((-1) & 32768) != 0 ? ownerDetailPuccPermit.height : null, ((-1) & 65536) != 0 ? ownerDetailPuccPermit.hp : null, ((-1) & 131072) != 0 ? ownerDetailPuccPermit.imported_vch : null, ((-1) & 262144) != 0 ? ownerDetailPuccPermit.laser_code : null, ((-1) & 524288) != 0 ? ownerDetailPuccPermit.ld_wt : null, ((-1) & 1048576) != 0 ? ownerDetailPuccPermit.length : null, ((-1) & 2097152) != 0 ? ownerDetailPuccPermit.maker : null, ((-1) & 4194304) != 0 ? ownerDetailPuccPermit.maker_name : null, ((-1) & 8388608) != 0 ? ownerDetailPuccPermit.manu_mon : null, ((-1) & 16777216) != 0 ? ownerDetailPuccPermit.manu_yr : null, ((-1) & 33554432) != 0 ? ownerDetailPuccPermit.mobileNoEditable : null, ((-1) & 67108864) != 0 ? ownerDetailPuccPermit.mobile_no : null, ((-1) & 134217728) != 0 ? ownerDetailPuccPermit.model_cd : null, ((-1) & 268435456) != 0 ? ownerDetailPuccPermit.model_name : null, ((-1) & 536870912) != 0 ? ownerDetailPuccPermit.no_cyl : null, ((-1) & 1073741824) != 0 ? ownerDetailPuccPermit.no_of_axles : null, ((-1) & IntCompanionObject.MIN_VALUE) != 0 ? ownerDetailPuccPermit.norms : null, ((-1) & 1) != 0 ? ownerDetailPuccPermit.norms_descr : null, ((-1) & 2) != 0 ? ownerDetailPuccPermit.numberOfTyres : null, ((-1) & 4) != 0 ? ownerDetailPuccPermit.off_cd : null, ((-1) & 8) != 0 ? ownerDetailPuccPermit.off_name : null, ((-1) & 16) != 0 ? ownerDetailPuccPermit.op_dt : null, ((-1) & 32) != 0 ? ownerDetailPuccPermit.other_criteria : null, ((-1) & 64) != 0 ? ownerDetailPuccPermit.ownerCatg : null, ((-1) & 128) != 0 ? ownerDetailPuccPermit.ownerIdentification : null, ((-1) & 256) != 0 ? ownerDetailPuccPermit.owner_cd : null, ((-1) & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.owner_cd_descr : null, ((-1) & 1024) != 0 ? ownerDetailPuccPermit.owner_ctg : null, ((-1) & 2048) != 0 ? ownerDetailPuccPermit.owner_name : null, ((-1) & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.owner_sr : null, ((-1) & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.p_add1 : null, ((-1) & 16384) != 0 ? ownerDetailPuccPermit.p_add2 : null, ((-1) & 32768) != 0 ? ownerDetailPuccPermit.p_add3 : null, ((-1) & 65536) != 0 ? ownerDetailPuccPermit.p_district : null, ((-1) & 131072) != 0 ? ownerDetailPuccPermit.p_district_name : null, ((-1) & 262144) != 0 ? ownerDetailPuccPermit.p_pincode : null, ((-1) & 524288) != 0 ? ownerDetailPuccPermit.p_state : null, ((-1) & 1048576) != 0 ? ownerDetailPuccPermit.p_state_name : null, ((-1) & 2097152) != 0 ? ownerDetailPuccPermit.pan_no : null, ((-1) & 4194304) != 0 ? ownerDetailPuccPermit.passport_no : null, ((-1) & 8388608) != 0 ? ownerDetailPuccPermit.permitDetailEntity : null, ((-1) & 16777216) != 0 ? ownerDetailPuccPermit.permit_rto_cd : null, ((-1) & 33554432) != 0 ? ownerDetailPuccPermit.purchase_date : null, ((-1) & 67108864) != 0 ? ownerDetailPuccPermit.purchase_dt : null, ((-1) & 134217728) != 0 ? ownerDetailPuccPermit.ration_card_no : null, ((-1) & 268435456) != 0 ? ownerDetailPuccPermit.regn_dt : null, ((-1) & 536870912) != 0 ? ownerDetailPuccPermit.regn_dtAsDate : null, ((-1) & 1073741824) != 0 ? ownerDetailPuccPermit.regn_no : null, ((-1) & IntCompanionObject.MIN_VALUE) != 0 ? ownerDetailPuccPermit.regn_type : null, (IntCompanionObject.MAX_VALUE & 1) != 0 ? ownerDetailPuccPermit.regn_type_descr : null, (IntCompanionObject.MAX_VALUE & 2) != 0 ? ownerDetailPuccPermit.regn_upto : null, (IntCompanionObject.MAX_VALUE & 4) != 0 ? ownerDetailPuccPermit.regn_uptoAsDate : null, (IntCompanionObject.MAX_VALUE & 8) != 0 ? ownerDetailPuccPermit.returnMessge : null, (IntCompanionObject.MAX_VALUE & 16) != 0 ? ownerDetailPuccPermit.sale_amt : null, (IntCompanionObject.MAX_VALUE & 32) != 0 ? ownerDetailPuccPermit.seat_cap : null, (IntCompanionObject.MAX_VALUE & 64) != 0 ? ownerDetailPuccPermit.sleeper_cap : null, (IntCompanionObject.MAX_VALUE & 128) != 0 ? ownerDetailPuccPermit.stand_cap : null, (IntCompanionObject.MAX_VALUE & 256) != 0 ? ownerDetailPuccPermit.state_cd : null, (IntCompanionObject.MAX_VALUE & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.state_name : null, (IntCompanionObject.MAX_VALUE & 1024) != 0 ? ownerDetailPuccPermit.status : null, (IntCompanionObject.MAX_VALUE & 2048) != 0 ? ownerDetailPuccPermit.tax_mode : null, (IntCompanionObject.MAX_VALUE & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.transport_catg : null, (IntCompanionObject.MAX_VALUE & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.unld_wt : null, (IntCompanionObject.MAX_VALUE & 16384) != 0 ? ownerDetailPuccPermit.vch_catg : null, (IntCompanionObject.MAX_VALUE & 32768) != 0 ? ownerDetailPuccPermit.vch_catg_desc : null, (IntCompanionObject.MAX_VALUE & 65536) != 0 ? ownerDetailPuccPermit.vch_purchase_as : null, (IntCompanionObject.MAX_VALUE & 131072) != 0 ? ownerDetailPuccPermit.vch_purchase_asCode : null, (IntCompanionObject.MAX_VALUE & 262144) != 0 ? ownerDetailPuccPermit.vehType : null, (IntCompanionObject.MAX_VALUE & 524288) != 0 ? ownerDetailPuccPermit.vehTypeAsInt : null, (IntCompanionObject.MAX_VALUE & 1048576) != 0 ? ownerDetailPuccPermit.vh_class : null, (IntCompanionObject.MAX_VALUE & 2097152) != 0 ? ownerDetailPuccPermit.vh_class_desc : null, (IntCompanionObject.MAX_VALUE & 4194304) != 0 ? ownerDetailPuccPermit.video_fitted : null, (IntCompanionObject.MAX_VALUE & 8388608) != 0 ? ownerDetailPuccPermit.voter_id : null, (IntCompanionObject.MAX_VALUE & 16777216) != 0 ? ownerDetailPuccPermit.vtInsuranceCommonDto : null, (IntCompanionObject.MAX_VALUE & 33554432) != 0 ? ownerDetailPuccPermit.vtpucc : null, (IntCompanionObject.MAX_VALUE & 67108864) != 0 ? ownerDetailPuccPermit.wheelbase : null, (IntCompanionObject.MAX_VALUE & 134217728) != 0 ? ownerDetailPuccPermit.width : null, (IntCompanionObject.MAX_VALUE & 268435456) != 0 ? ownerDetailPuccPermit.vTHypthEntity : null, (IntCompanionObject.MAX_VALUE & 536870912) != 0 ? ownerDetailPuccPermit.latesttaxdetails : null, (IntCompanionObject.MAX_VALUE & 1073741824) != 0 ? ownerDetailPuccPermit.permitDetailDto : null)));
                    JSONObject jSONObject = new JSONObject();
                    eh ehVar = VahanValidateUpdateMobileActivity.this.binding;
                    if (ehVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        ehVar = null;
                    }
                    jSONObject.put("aadharNo", String.valueOf(ehVar.b.getText()));
                    eh ehVar2 = VahanValidateUpdateMobileActivity.this.binding;
                    if (ehVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        ehVar2 = null;
                    }
                    jSONObject.put("mobileNo", String.valueOf(ehVar2.f.getText()));
                    jSONObject.put("regnNo", VahanValidateUpdateMobileActivity.this.regNo);
                    jSONObject.put("stateCode", VahanValidateUpdateMobileActivity.this.stateCd);
                    eh ehVar3 = VahanValidateUpdateMobileActivity.this.binding;
                    if (ehVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        ehVar3 = null;
                    }
                    jSONObject.put("nameAsAadhae", String.valueOf(ehVar3.m.getText()));
                    NrvDetails rcdetails = VahanValidateUpdateMobileActivity.this.getRcdetails();
                    Intrinsics.checkNotNull(rcdetails);
                    jSONObject.put("officeCode", rcdetails.getRc_off_cd());
                    jSONObject.put("purposeCode", VContant.UPDATE_MOBILE_PURPOSE_CODE);
                    VahanValidateUpdateMobileActivity.this.h2().p(jSONObject);
                }
            } catch (Exception e) {
                ProgressDialog progressDialog2 = VahanValidateUpdateMobileActivity.this.dialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    progressDialog = progressDialog2;
                }
                progressDialog.dismiss();
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OwnerDetailPuccPermit) obj);
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
            ProgressDialog progressDialog = VahanValidateUpdateMobileActivity.this.dialog;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            progressDialog.dismiss();
            if (StringsKt__StringsJVMKt.equals(str, "error", true)) {
                VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity = VahanValidateUpdateMobileActivity.this;
                vahanValidateUpdateMobileActivity.R2(vahanValidateUpdateMobileActivity, vahanValidateUpdateMobileActivity.X1().b("record_error_msg", VahanValidateUpdateMobileActivity.this.getString(R.string.service_unavable_please_try)));
            } else {
                VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity2 = VahanValidateUpdateMobileActivity.this;
                vahanValidateUpdateMobileActivity2.R2(vahanValidateUpdateMobileActivity2, str);
            }
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
        public final void a(SendOtpResult sendOtpResult) {
            try {
                ProgressDialog progressDialog = VahanValidateUpdateMobileActivity.this.dialog;
                eh ehVar = null;
                if (progressDialog == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog = null;
                }
                progressDialog.dismiss();
                if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL001", true)) {
                    VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity = VahanValidateUpdateMobileActivity.this;
                    eh ehVar2 = vahanValidateUpdateMobileActivity.binding;
                    if (ehVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        ehVar = ehVar2;
                    }
                    vahanValidateUpdateMobileActivity.c3(vahanValidateUpdateMobileActivity, String.valueOf(ehVar.g.getText()));
                    VahanValidateUpdateMobileActivity.this.C2(String.valueOf(sendOtpResult.getRecordId()));
                    VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity2 = VahanValidateUpdateMobileActivity.this;
                    vahanValidateUpdateMobileActivity2.D2(vahanValidateUpdateMobileActivity2.regNo);
                    return;
                }
                if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL022", true)) {
                    Toast.makeText(VahanValidateUpdateMobileActivity.this.getApplicationContext(), sendOtpResult.getStatusDesc().toString(), 1).show();
                    return;
                }
                if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL014", true)) {
                    Toast.makeText(VahanValidateUpdateMobileActivity.this.getApplicationContext(), sendOtpResult.getStatusDesc().toString(), 1).show();
                } else if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL099", true)) {
                    Toast.makeText(VahanValidateUpdateMobileActivity.this.getApplicationContext(), "Unable to send the OTP, Please try after some times!", 1).show();
                } else {
                    Toast.makeText(VahanValidateUpdateMobileActivity.this.getApplicationContext(), "Unable to send the OTP, Please try after some times!", 1).show();
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(VahanValidateUpdateMobileActivity.this.getApplicationContext(), "Unable to send the OTP, Please try after some times", 1).show();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SendOtpResult) obj);
            return Unit.INSTANCE;
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
        public final void a(OtpVerifyResult otpVerifyResult) {
            ProgressDialog progressDialog = null;
            try {
                if (!StringsKt__StringsJVMKt.equals(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    ProgressDialog progressDialog2 = VahanValidateUpdateMobileActivity.this.dialog;
                    if (progressDialog2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                        progressDialog2 = null;
                    }
                    if (progressDialog2.isShowing()) {
                        ProgressDialog progressDialog3 = VahanValidateUpdateMobileActivity.this.dialog;
                        if (progressDialog3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("dialog");
                            progressDialog3 = null;
                        }
                        progressDialog3.dismiss();
                    }
                    VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity = VahanValidateUpdateMobileActivity.this;
                    vahanValidateUpdateMobileActivity.v2(vahanValidateUpdateMobileActivity, otpVerifyResult.getStatusDesc());
                    return;
                }
                ProgressDialog progressDialog4 = VahanValidateUpdateMobileActivity.this.dialog;
                if (progressDialog4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog4 = null;
                }
                if (progressDialog4.isShowing()) {
                    ProgressDialog progressDialog5 = VahanValidateUpdateMobileActivity.this.dialog;
                    if (progressDialog5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                        progressDialog5 = null;
                    }
                    progressDialog5.dismiss();
                }
                if (VahanValidateUpdateMobileActivity.this.V1().isShowing()) {
                    VahanValidateUpdateMobileActivity.this.V1().dismiss();
                }
                VahanValidateUpdateMobileActivity.this.Q1();
            } catch (Exception unused) {
                ProgressDialog progressDialog6 = VahanValidateUpdateMobileActivity.this.dialog;
                if (progressDialog6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog6 = null;
                }
                if (progressDialog6.isShowing()) {
                    ProgressDialog progressDialog7 = VahanValidateUpdateMobileActivity.this.dialog;
                    if (progressDialog7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    } else {
                        progressDialog = progressDialog7;
                    }
                    progressDialog.dismiss();
                }
                VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity2 = VahanValidateUpdateMobileActivity.this;
                vahanValidateUpdateMobileActivity2.v2(vahanValidateUpdateMobileActivity2, "Unable to Verify the OTP, Please try after some time");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OtpVerifyResult) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class i extends Lambda implements Function1 {
        public i() {
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
        public final void a(ResendOtp resendOtp) {
            ProgressDialog progressDialog = null;
            try {
                if (StringsKt__StringsJVMKt.equals(resendOtp.getStatusCode(), "AL001", true)) {
                    ProgressDialog progressDialog2 = VahanValidateUpdateMobileActivity.this.dialog;
                    if (progressDialog2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialog");
                        progressDialog2 = null;
                    }
                    progressDialog2.dismiss();
                    VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity = VahanValidateUpdateMobileActivity.this;
                    vahanValidateUpdateMobileActivity.v2(vahanValidateUpdateMobileActivity, "We have resent the OTP to your Mobile Number");
                    return;
                }
                if (StringsKt__StringsJVMKt.equals(resendOtp.getStatusCode(), "AL002", true)) {
                    VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity2 = VahanValidateUpdateMobileActivity.this;
                    vahanValidateUpdateMobileActivity2.v2(vahanValidateUpdateMobileActivity2, resendOtp.getStatusDesc());
                    return;
                }
                ProgressDialog progressDialog3 = VahanValidateUpdateMobileActivity.this.dialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog3 = null;
                }
                progressDialog3.dismiss();
                VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity3 = VahanValidateUpdateMobileActivity.this;
                vahanValidateUpdateMobileActivity3.v2(vahanValidateUpdateMobileActivity3, resendOtp.getStatusDesc());
            } catch (Exception unused) {
                ProgressDialog progressDialog4 = VahanValidateUpdateMobileActivity.this.dialog;
                if (progressDialog4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    progressDialog = progressDialog4;
                }
                progressDialog.dismiss();
                VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity4 = VahanValidateUpdateMobileActivity.this;
                vahanValidateUpdateMobileActivity4.v2(vahanValidateUpdateMobileActivity4, "Unable to Verify the OTP, Please try after some time");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ResendOtp) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class j extends Lambda implements Function1 {
        public j() {
            super(1);
        }

        public final void a(UpdateRegisterResponse updateRegisterResponse) {
            ProgressDialog progressDialog = VahanValidateUpdateMobileActivity.this.dialog;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog2 = VahanValidateUpdateMobileActivity.this.dialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog2 = null;
                }
                progressDialog2.dismiss();
            }
            ApiMessageX apiMessage = updateRegisterResponse.getApiMessage();
            if (apiMessage == null || apiMessage.getStatusCode() != 200) {
                return;
            }
            if (!VahanValidateUpdateMobileActivity.this.getIsFaceless()) {
                VahanValidateUpdateMobileActivity.this.O2(updateRegisterResponse.getApiMessage().getDeveloperMessage(), 1);
                return;
            }
            Object obj = VahanValidateUpdateMobileActivity.this.receivedOwnerObjList.get(0);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            OwnerDetailEntity ownerDetailEntity = (OwnerDetailEntity) obj;
            OwnerDetailEntity ownerDetailEntityCopy = ownerDetailEntity.copy((IntCompanionObject.MAX_VALUE & 1) != 0 ? ownerDetailEntity.regn_no : null, (IntCompanionObject.MAX_VALUE & 2) != 0 ? ownerDetailEntity.state_cd : null, (IntCompanionObject.MAX_VALUE & 4) != 0 ? ownerDetailEntity.state_name : null, (IntCompanionObject.MAX_VALUE & 8) != 0 ? ownerDetailEntity.owner_name : null, (IntCompanionObject.MAX_VALUE & 16) != 0 ? ownerDetailEntity.off_cd : null, (IntCompanionObject.MAX_VALUE & 32) != 0 ? ownerDetailEntity.off_name : null, (IntCompanionObject.MAX_VALUE & 64) != 0 ? ownerDetailEntity.purchase_dt : null, (IntCompanionObject.MAX_VALUE & 128) != 0 ? ownerDetailEntity.f_name : null, (IntCompanionObject.MAX_VALUE & 256) != 0 ? ownerDetailEntity.c_add1 : null, (IntCompanionObject.MAX_VALUE & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailEntity.c_add2 : null, (IntCompanionObject.MAX_VALUE & 1024) != 0 ? ownerDetailEntity.c_add3 : null, (IntCompanionObject.MAX_VALUE & 2048) != 0 ? ownerDetailEntity.c_district_name : null, (IntCompanionObject.MAX_VALUE & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailEntity.c_state : null, (IntCompanionObject.MAX_VALUE & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailEntity.c_state_name : null, (IntCompanionObject.MAX_VALUE & 16384) != 0 ? ownerDetailEntity.p_add1 : null, (IntCompanionObject.MAX_VALUE & 32768) != 0 ? ownerDetailEntity.p_add2 : null, (IntCompanionObject.MAX_VALUE & 65536) != 0 ? ownerDetailEntity.p_add3 : null, (IntCompanionObject.MAX_VALUE & 131072) != 0 ? ownerDetailEntity.p_district_name : null, (IntCompanionObject.MAX_VALUE & 262144) != 0 ? ownerDetailEntity.p_state : null, (IntCompanionObject.MAX_VALUE & 524288) != 0 ? ownerDetailEntity.p_state_name : null, (IntCompanionObject.MAX_VALUE & 1048576) != 0 ? ownerDetailEntity.regn_type : null, (IntCompanionObject.MAX_VALUE & 2097152) != 0 ? ownerDetailEntity.vh_class_desc : null, (IntCompanionObject.MAX_VALUE & 4194304) != 0 ? ownerDetailEntity.vch_catg : null, (IntCompanionObject.MAX_VALUE & 8388608) != 0 ? ownerDetailEntity.fit_upto : null, (IntCompanionObject.MAX_VALUE & 16777216) != 0 ? ownerDetailEntity.regn_upto : null, (IntCompanionObject.MAX_VALUE & 33554432) != 0 ? ownerDetailEntity.norms_descr : null, (IntCompanionObject.MAX_VALUE & 67108864) != 0 ? ownerDetailEntity.regn_dt : null, (IntCompanionObject.MAX_VALUE & 134217728) != 0 ? ownerDetailEntity.fuel_descr : null, (IntCompanionObject.MAX_VALUE & 268435456) != 0 ? ownerDetailEntity.maker_name : null, (IntCompanionObject.MAX_VALUE & 536870912) != 0 ? ownerDetailEntity.model_name : null, (IntCompanionObject.MAX_VALUE & 1073741824) != 0 ? ownerDetailEntity.catg_desc : null, (IntCompanionObject.MAX_VALUE & IntCompanionObject.MIN_VALUE) != 0 ? ownerDetailEntity.chasi_no : VahanValidateUpdateMobileActivity.this.getChassiNo(), (15 & 1) != 0 ? ownerDetailEntity.eng_no : null, (15 & 2) != 0 ? ownerDetailEntity.owner_sr : null, (15 & 4) != 0 ? ownerDetailEntity.vh_class : null, (15 & 8) != 0 ? ownerDetailEntity.seat_cap : null);
            VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity = VahanValidateUpdateMobileActivity.this;
            VContant.Companion companion = VContant.INSTANCE;
            eh ehVar = vahanValidateUpdateMobileActivity.binding;
            if (ehVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar = null;
            }
            vahanValidateUpdateMobileActivity.F2(companion.d(ownerDetailEntityCopy, String.valueOf(ehVar.f.getText())));
            Intent intent = new Intent(VahanValidateUpdateMobileActivity.this, (Class<?>) VahanCommonConfirmationScreen.class);
            intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.UPDATE_MOBILE_CODE);
            intent.putExtra(VContant.UPDATE_MOBILE_CODE, updateRegisterResponse.getData());
            Data data = updateRegisterResponse.getData();
            intent.putExtra(VContant.APP_NO, data != null ? data.getApplNo() : null);
            NrvDetails rcdetails = VahanValidateUpdateMobileActivity.this.getRcdetails();
            intent.putExtra("state_code", rcdetails != null ? rcdetails.getState_cd() : null);
            intent.putExtra("rc_number", VahanValidateUpdateMobileActivity.this.Z1());
            intent.putExtra(VContant.PURPOSE_CODE, VContant.UPDATE_MOBILE_PURPOSE_CODE);
            intent.putExtra("off_code", VahanValidateUpdateMobileActivity.this.getOff_code());
            intent.putExtra(VContant.NEXGEN_isFACELESS, VahanValidateUpdateMobileActivity.this.getIsFaceless());
            intent.putExtra("RC", VahanValidateUpdateMobileActivity.this.Z1());
            intent.putExtra("RcDetails", VahanValidateUpdateMobileActivity.this.getRcdetails());
            intent.putExtra(VContant.NEXGEN_addahar_name, VahanValidateUpdateMobileActivity.this.T1());
            intent.putExtra(VContant.NEXGEN_addahar_address, VahanValidateUpdateMobileActivity.this.S1());
            VahanValidateUpdateMobileActivity.this.startActivity(intent);
            VahanValidateUpdateMobileActivity.this.finish();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((UpdateRegisterResponse) obj);
            return Unit.INSTANCE;
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
        public final void a(eKycResponse ekycresponse) {
            ProgressDialog progressDialog = VahanValidateUpdateMobileActivity.this.dialog;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog2 = VahanValidateUpdateMobileActivity.this.dialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog2 = null;
                }
                progressDialog2.dismiss();
            }
            try {
                com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.ApiMessage apiMessage = ekycresponse.getApiMessage();
                if (apiMessage == null || apiMessage.getStatusCode() != 200) {
                    VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity = VahanValidateUpdateMobileActivity.this;
                    com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.ApiMessage apiMessage2 = ekycresponse.getApiMessage();
                    vahanValidateUpdateMobileActivity.v2(vahanValidateUpdateMobileActivity, String.valueOf(apiMessage2 != null ? apiMessage2.getDeveloperMessage() : null));
                    return;
                }
                VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity2 = VahanValidateUpdateMobileActivity.this;
                com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.Data data = ekycresponse.getData();
                vahanValidateUpdateMobileActivity2.txnNo = String.valueOf(data != null ? data.getTxNo() : null);
                vh7 vh7Var = new vh7(VahanValidateUpdateMobileActivity.this);
                com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.Data data2 = ekycresponse.getData();
                vh7Var.f(String.valueOf(data2 != null ? data2.getTxNo() : null));
                VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity3 = VahanValidateUpdateMobileActivity.this;
                com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.Data data3 = ekycresponse.getData();
                vahanValidateUpdateMobileActivity3.W2(vahanValidateUpdateMobileActivity3, String.valueOf(data3 != null ? data3.getLastFourMobileNumber() : null));
            } catch (Exception e) {
                e.printStackTrace();
                VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity4 = VahanValidateUpdateMobileActivity.this;
                vahanValidateUpdateMobileActivity4.v2(vahanValidateUpdateMobileActivity4, "Unable to process the request, Please try after some time");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((eKycResponse) obj);
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
            ProgressDialog progressDialog = VahanValidateUpdateMobileActivity.this.dialog;
            ProgressDialog progressDialog2 = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog3 = VahanValidateUpdateMobileActivity.this.dialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    progressDialog2 = progressDialog3;
                }
                progressDialog2.dismiss();
            }
            VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity = VahanValidateUpdateMobileActivity.this;
            vahanValidateUpdateMobileActivity.v2(vahanValidateUpdateMobileActivity, "Unable to process the request, Please try after some time");
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
        public final void a(EkycVerifyResponse ekycVerifyResponse) {
            ProgressDialog progressDialog = VahanValidateUpdateMobileActivity.this.dialog;
            eh ehVar = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog2 = VahanValidateUpdateMobileActivity.this.dialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog2 = null;
                }
                progressDialog2.dismiss();
            }
            try {
                com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.ApiMessage apiMessage = ekycVerifyResponse.getApiMessage();
                if (apiMessage == null || apiMessage.getStatusCode() != 200) {
                    Log.e("Calling Otp", "calling otp");
                    VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity = VahanValidateUpdateMobileActivity.this;
                    com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.ApiMessage apiMessage2 = ekycVerifyResponse.getApiMessage();
                    vahanValidateUpdateMobileActivity.v2(vahanValidateUpdateMobileActivity, String.valueOf(apiMessage2 != null ? apiMessage2.getDeveloperMessage() : null));
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                eh ehVar2 = VahanValidateUpdateMobileActivity.this.binding;
                if (ehVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ehVar2 = null;
                }
                jSONObject.put("aadharNo", String.valueOf(ehVar2.b.getText()));
                eh ehVar3 = VahanValidateUpdateMobileActivity.this.binding;
                if (ehVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ehVar3 = null;
                }
                jSONObject.put("mobileNo", String.valueOf(ehVar3.f.getText()));
                jSONObject.put("regnNo", VahanValidateUpdateMobileActivity.this.regNo);
                jSONObject.put("stateCode", VahanValidateUpdateMobileActivity.this.stateCd);
                eh ehVar4 = VahanValidateUpdateMobileActivity.this.binding;
                if (ehVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    ehVar = ehVar4;
                }
                jSONObject.put("nameAsAadhae", String.valueOf(ehVar.m.getText()));
                jSONObject.put("officeCode", VahanValidateUpdateMobileActivity.this.getOff_code());
                jSONObject.put("purposeCode", VContant.UPDATE_MOBILE_PURPOSE_CODE);
                VahanValidateUpdateMobileActivity.this.h2().p(jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((EkycVerifyResponse) obj);
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
            ProgressDialog progressDialog = VahanValidateUpdateMobileActivity.this.dialog;
            ProgressDialog progressDialog2 = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog3 = VahanValidateUpdateMobileActivity.this.dialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    progressDialog2 = progressDialog3;
                }
                progressDialog2.dismiss();
            }
            VahanValidateUpdateMobileActivity vahanValidateUpdateMobileActivity = VahanValidateUpdateMobileActivity.this;
            vahanValidateUpdateMobileActivity.v2(vahanValidateUpdateMobileActivity, "Unable to verify the request, Please try after some time");
        }
    }

    public static final class o implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public o(Function1 function) {
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

    public static final class p extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ TextView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(TextView textView, TextView textView2) {
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

    public static final class q extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ TextView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(TextView textView, TextView textView2) {
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

    public static final class r extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ TextView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(TextView textView, TextView textView2) {
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

    public static final class s extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ TextView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(TextView textView, TextView textView2) {
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
        if (this.isAadharEnable) {
            return;
        }
        eh ehVar = this.binding;
        eh ehVar2 = null;
        if (ehVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar = null;
        }
        ehVar.m.setText(this.ownerName);
        eh ehVar3 = this.binding;
        if (ehVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ehVar2 = ehVar3;
        }
        ehVar2.f.setText(this.mobileNo);
    }

    public static final void H1(Dialog d2, VahanValidateUpdateMobileActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        this$0.finish();
    }

    public static final void P2(Dialog d2, int i2, VahanValidateUpdateMobileActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        if (i2 == 1) {
            this$0.u2();
        }
    }

    public static final void Q2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void S2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void X2(EditText enterOtp, ImageView shownPin, View view) {
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

    public static final void Y2(VahanValidateUpdateMobileActivity this$0, TextView time_text, TextView resendOtp, View view) {
        f47 f47Var;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(time_text, "$time_text");
        Intrinsics.checkNotNullParameter(resendOtp, "$resendOtp");
        ProgressDialog progressDialog = this$0.dialog;
        eh ehVar = null;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog = null;
        }
        if (progressDialog.isShowing()) {
            ProgressDialog progressDialog2 = this$0.dialog;
            if (progressDialog2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog2 = null;
            }
            progressDialog2.dismiss();
        }
        new q(time_text, resendOtp).start();
        ProgressDialog progressDialog3 = this$0.dialog;
        if (progressDialog3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog3 = null;
        }
        progressDialog3.show();
        if (this$0.V1().isShowing()) {
            this$0.V1().dismiss();
        }
        this$0.serviceSelectionHashMap.put(VContant.UPDATE_MOBILE, VContant.UPDATE_MOBILE_CODE);
        f47 f47Var2 = this$0.mView;
        if (f47Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            f47Var = null;
        } else {
            f47Var = f47Var2;
        }
        eh ehVar2 = this$0.binding;
        if (ehVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ehVar = ehVar2;
        }
        f47Var.l(this$0, String.valueOf(ehVar.b.getText()), this$0.Z1(), this$0.chassiNo, "A", VContant.INSTANCE.g(this$0.serviceSelectionHashMap), this$0.stateCd);
    }

    public static final void Z2(EditText enterOtp, VahanValidateUpdateMobileActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = enterOtp.getText().toString();
        if (string.length() == 0) {
            Toast.makeText(this$0, "Please enter the OTP", 0).show();
            return;
        }
        if (string.length() < 6) {
            Toast.makeText(this$0, "Please enter the valid OTP", 0).show();
            return;
        }
        ProgressDialog progressDialog = this$0.dialog;
        eh ehVar = null;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog = null;
        }
        if (progressDialog.isShowing()) {
            ProgressDialog progressDialog2 = this$0.dialog;
            if (progressDialog2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog2 = null;
            }
            progressDialog2.dismiss();
        }
        ProgressDialog progressDialog3 = this$0.dialog;
        if (progressDialog3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog3 = null;
        }
        progressDialog3.show();
        this$0.V1().dismiss();
        vh7 vh7Var = new vh7(this$0);
        this$0.serviceSelectionHashMap.put(VContant.UPDATE_MOBILE, VContant.UPDATE_MOBILE_CODE);
        vh7Var.a();
        f47 f47Var = this$0.mView;
        if (f47Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            f47Var = null;
        }
        eh ehVar2 = this$0.binding;
        if (ehVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ehVar = ehVar2;
        }
        f47Var.n(this$0, String.valueOf(ehVar.b.getText()), this$0.Z1(), this$0.chassiNo, "A", VContant.INSTANCE.g(this$0.serviceSelectionHashMap), string, vh7Var.a(), this$0.stateCd);
    }

    public static final void a3(EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        enterOtp.setText("");
    }

    public static final void b3(VahanValidateUpdateMobileActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.V1().dismiss();
    }

    public static final void d3(EditText enterOtp, ImageView shownPin, View view) {
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

    public static final void e3(VahanValidateUpdateMobileActivity this$0, TextView time_text, TextView resendOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(time_text, "$time_text");
        Intrinsics.checkNotNullParameter(resendOtp, "$resendOtp");
        ProgressDialog progressDialog = this$0.dialog;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog = null;
        }
        progressDialog.show();
        new s(time_text, resendOtp).start();
        this$0.g2().j(this$0, this$0.otpId);
    }

    public static final void f3(EditText enterOtp, VahanValidateUpdateMobileActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = enterOtp.getText().toString();
        if (string.length() == 0) {
            Toast.makeText(this$0, "Please enter the OTP", 0).show();
            return;
        }
        if (string.length() < 6) {
            Toast.makeText(this$0, "Please enter the valid OTP", 0).show();
            return;
        }
        ProgressDialog progressDialog = this$0.dialog;
        ProgressDialog progressDialog2 = null;
        if (progressDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog = null;
        }
        if (progressDialog.isShowing()) {
            ProgressDialog progressDialog3 = this$0.dialog;
            if (progressDialog3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog3 = null;
            }
            progressDialog3.dismiss();
        }
        ProgressDialog progressDialog4 = this$0.dialog;
        if (progressDialog4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        } else {
            progressDialog2 = progressDialog4;
        }
        progressDialog2.show();
        this$0.g2().l(this$0, string, this$0.otpId);
    }

    public static final void g3(EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        enterOtp.setText("");
    }

    public static final void h3(VahanValidateUpdateMobileActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.V1().dismiss();
    }

    private final void j2() {
        i2().i().g(this, new o(new g()));
        g2().k().g(this, new o(new h()));
        g2().i().g(this, new o(new i()));
        eh ehVar = this.binding;
        eh ehVar2 = null;
        if (ehVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar = null;
        }
        ehVar.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xj7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanValidateUpdateMobileActivity.l2(this.a, view);
            }
        });
        M2((wq6) new z(this, new zq6(new vq6(b2()))).a(wq6.class));
        eh ehVar3 = this.binding;
        if (ehVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar3 = null;
        }
        ehVar3.q.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yj7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanValidateUpdateMobileActivity.n2(this.a, view);
            }
        });
        eh ehVar4 = this.binding;
        if (ehVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar4 = null;
        }
        ehVar4.q.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zj7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanValidateUpdateMobileActivity.o2(this.a, view);
            }
        });
        eh ehVar5 = this.binding;
        if (ehVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar5 = null;
        }
        ehVar5.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dj7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanValidateUpdateMobileActivity.p2(this.a, view);
            }
        });
        eh ehVar6 = this.binding;
        if (ehVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar6 = null;
        }
        ehVar6.c.setVisibility(8);
        eh ehVar7 = this.binding;
        if (ehVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar7 = null;
        }
        ehVar7.b.setVisibility(8);
        if (this.isAadharEnable) {
            eh ehVar8 = this.binding;
            if (ehVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar8 = null;
            }
            ehVar8.c.setVisibility(0);
            eh ehVar9 = this.binding;
            if (ehVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar9 = null;
            }
            ehVar9.b.setVisibility(0);
            eh ehVar10 = this.binding;
            if (ehVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar10 = null;
            }
            ehVar10.h.setVisibility(8);
            eh ehVar11 = this.binding;
            if (ehVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar11 = null;
            }
            ehVar11.g.setVisibility(8);
            eh ehVar12 = this.binding;
            if (ehVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar12 = null;
            }
            ehVar12.o.setVisibility(0);
            eh ehVar13 = this.binding;
            if (ehVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar13 = null;
            }
            ehVar13.j.setVisibility(0);
            eh ehVar14 = this.binding;
            if (ehVar14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar14 = null;
            }
            ehVar14.i.setVisibility(0);
            eh ehVar15 = this.binding;
            if (ehVar15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar15 = null;
            }
            ehVar15.s.setText("Validate with Aadhaar");
        } else {
            eh ehVar16 = this.binding;
            if (ehVar16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar16 = null;
            }
            ehVar16.f.setFocusable(0);
            eh ehVar17 = this.binding;
            if (ehVar17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar17 = null;
            }
            ehVar17.m.setFocusable(0);
            eh ehVar18 = this.binding;
            if (ehVar18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar18 = null;
            }
            ehVar18.c.setVisibility(8);
            eh ehVar19 = this.binding;
            if (ehVar19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar19 = null;
            }
            ehVar19.b.setVisibility(8);
            eh ehVar20 = this.binding;
            if (ehVar20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar20 = null;
            }
            ehVar20.h.setVisibility(0);
            eh ehVar21 = this.binding;
            if (ehVar21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar21 = null;
            }
            ehVar21.g.setVisibility(0);
            eh ehVar22 = this.binding;
            if (ehVar22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar22 = null;
            }
            ehVar22.o.setVisibility(0);
            eh ehVar23 = this.binding;
            if (ehVar23 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar23 = null;
            }
            ehVar23.k.setText("Owner Name (As per Vahan)");
            eh ehVar24 = this.binding;
            if (ehVar24 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar24 = null;
            }
            ehVar24.k.setText(X1().b("label_dl_ownername_as_aadhaar", "Owner Name (As per Vahan)"));
            eh ehVar25 = this.binding;
            if (ehVar25 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar25 = null;
            }
            ehVar25.l.setText(X1().b("lbl_owner_Mobile_no_as_per_Aadhaar", "Existing Mobile No (As per Vahan)"));
            eh ehVar26 = this.binding;
            if (ehVar26 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar26 = null;
            }
            ehVar26.j.setVisibility(0);
            eh ehVar27 = this.binding;
            if (ehVar27 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar27 = null;
            }
            ehVar27.i.setVisibility(0);
            eh ehVar28 = this.binding;
            if (ehVar28 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar28 = null;
            }
            ehVar28.s.setText("Update Mobile No.");
        }
        eh ehVar29 = this.binding;
        if (ehVar29 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar29 = null;
        }
        ehVar29.s.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ej7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanValidateUpdateMobileActivity.q2(this.a, view);
            }
        });
        h2().k().g(this, new o(new j()));
        h2().j().g(this, new o(new a()));
        h2().n().g(this, new o(new b()));
        h2().m().g(this, new o(new c()));
        h2().i().g(this, new o(new d()));
        eh ehVar30 = this.binding;
        if (ehVar30 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar30 = null;
        }
        ehVar30.o.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fj7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanValidateUpdateMobileActivity.r2(this.a, view);
            }
        });
        e2().I0().g(this, new o(new e()));
        e2().H0().g(this, new o(new f()));
        eh ehVar31 = this.binding;
        if (ehVar31 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ehVar2 = ehVar31;
        }
        ehVar2.n.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gj7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanValidateUpdateMobileActivity.k2(this.a, view);
            }
        });
    }

    public static final void k2(VahanValidateUpdateMobileActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        eh ehVar = this$0.binding;
        eh ehVar2 = null;
        if (ehVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar = null;
        }
        if (ehVar.b.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            eh ehVar3 = this$0.binding;
            if (ehVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar3 = null;
            }
            ehVar3.n.setImageResource(R.drawable.pass_visible);
            eh ehVar4 = this$0.binding;
            if (ehVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ehVar2 = ehVar4;
            }
            ehVar2.b.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            return;
        }
        eh ehVar5 = this$0.binding;
        if (ehVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar5 = null;
        }
        ehVar5.n.setImageResource(R.drawable.mvvm_visibility);
        eh ehVar6 = this$0.binding;
        if (ehVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ehVar2 = ehVar6;
        }
        ehVar2.b.setTransformationMethod(PasswordTransformationMethod.getInstance());
    }

    public static final void l2(VahanValidateUpdateMobileActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        final Dialog dialog = new Dialog(this$0);
        dialog.setContentView(R.layout.term_cond_dialog);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        String str = s14.a.g() + this$0.X1().d() + "/mparivahan-info-terms-of-use.html";
        View viewFindViewById = dialog.findViewById(R.id.cancelIv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = dialog.findViewById(R.id.termConditionWv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ((ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mj7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                VahanValidateUpdateMobileActivity.m2(dialog, view2);
            }
        });
        ((WebView) viewFindViewById2).loadUrl(str);
        dialog.show();
    }

    public static final void m2(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    public static final void n2(VahanValidateUpdateMobileActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void o2(VahanValidateUpdateMobileActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.u2();
    }

    public static final void p2(VahanValidateUpdateMobileActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void q2(VahanValidateUpdateMobileActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        eh ehVar = this$0.binding;
        eh ehVar2 = null;
        if (ehVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar = null;
        }
        if (Intrinsics.areEqual(ehVar.s.getText().toString(), "Validate with Aadhaar")) {
            if (this$0.T2()) {
                eh ehVar3 = this$0.binding;
                if (ehVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    ehVar2 = ehVar3;
                }
                this$0.mobileNo = String.valueOf(ehVar2.f.getText());
                this$0.R1();
                return;
            }
            return;
        }
        if (this$0.isAadharEnable) {
            if (this$0.V2()) {
                this$0.Q1();
            }
        } else if (this$0.U2()) {
            ProgressDialog progressDialog = this$0.dialog;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            progressDialog.show();
            ws6 ws6Var = new ws6(this$0);
            eh ehVar4 = this$0.binding;
            if (ehVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ehVar2 = ehVar4;
            }
            this$0.i2().m(this$0, String.valueOf(ehVar2.g.getText()), ws6Var.k());
        }
    }

    public static final void r2(VahanValidateUpdateMobileActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        eh ehVar = this$0.binding;
        eh ehVar2 = null;
        if (ehVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar = null;
        }
        CheckBox checkBox = ehVar.p;
        eh ehVar3 = this$0.binding;
        if (ehVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ehVar2 = ehVar3;
        }
        checkBox.setChecked(!ehVar2.p.isChecked());
    }

    public static final void t2(VahanValidateUpdateMobileActivity this$0, gf result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.d() == -1) {
            Intent intentC = result.c();
            Intrinsics.checkNotNull(intentC);
            this$0.authMode = String.valueOf(intentC.getStringExtra(VContant.AUTHMODE));
            this$0.isFaceless = intentC.getBooleanExtra(VContant.NEXGEN_isFACELESS, true);
            this$0.y2(String.valueOf(intentC.getStringExtra(VContant.NEXGEN_addahar_name)));
            this$0.x2(String.valueOf(intentC.getStringExtra(VContant.NEXGEN_addahar_address)));
            ProgressDialog progressDialog = this$0.dialog;
            ProgressDialog progressDialog2 = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog3 = this$0.dialog;
                if (progressDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog3 = null;
                }
                progressDialog3.dismiss();
                ProgressDialog progressDialog4 = this$0.dialog;
                if (progressDialog4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    progressDialog2 = progressDialog4;
                }
                progressDialog2.show();
            }
            ld7 ld7VarE2 = this$0.e2();
            String str = this$0.regNo;
            String str2 = this$0.stateCd;
            String strSubstring = this$0.chassiNo.substring(r8.length() - 5, this$0.chassiNo.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            ld7VarE2.F0(this$0, str, str2, VContant.UPDATE_MOBILE_PURPOSE_CODE, strSubstring);
        }
    }

    private final void u2() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public static final void w2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public final void B2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageKeySession = wa3Var;
    }

    public final void C2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.otpId = str;
    }

    public final void D2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rcNo = str;
    }

    public final void E2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void F2(NrvDetails nrvDetails) {
        this.rcdetails = nrvDetails;
    }

    public final void G1(Context context, String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rj7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanValidateUpdateMobileActivity.H1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final void G2(UpdateMobileUpdated updateMobileUpdated) {
        Intrinsics.checkNotNullParameter(updateMobileUpdated, "<set-?>");
        this.retrofitService = updateMobileUpdated;
    }

    public final void H2(VahanServiceConnection vahanServiceConnection) {
        Intrinsics.checkNotNullParameter(vahanServiceConnection, "<set-?>");
        this.retrofitService1 = vahanServiceConnection;
    }

    public final void I2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.vahanService = vahanProService;
    }

    public final void J2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.vahanViewModle = ld7Var;
    }

    public final void K2(VahanServiceConnection vahanServiceConnection) {
        Intrinsics.checkNotNullParameter(vahanServiceConnection, "<set-?>");
        this.verifyOtpRetrofitService = vahanServiceConnection;
    }

    public final void L2(lk7 lk7Var) {
        Intrinsics.checkNotNullParameter(lk7Var, "<set-?>");
        this.verifyOtpViewModel = lk7Var;
    }

    public final void M2(wq6 wq6Var) {
        Intrinsics.checkNotNullParameter(wq6Var, "<set-?>");
        this.viewModel = wq6Var;
    }

    public final void N2(al7 al7Var) {
        Intrinsics.checkNotNullParameter(al7Var, "<set-?>");
        this.viewModel1 = al7Var;
    }

    public final void O2(String it, final int showHomePage) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById3;
        textView2.setVisibility(8);
        textView.setText("Ok");
        textView.setBackground(yy0.e(this, R.drawable.shape_red));
        textView.setTextColor(yy0.c(this, R.color.white));
        ((TextView) viewFindViewById).setText(it);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pj7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanValidateUpdateMobileActivity.P2(dialog, showHomePage, this, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qj7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanValidateUpdateMobileActivity.Q2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void Q1() {
        try {
            ProgressDialog progressDialog = this.dialog;
            eh ehVar = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog2 = this.dialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog2 = null;
                }
                progressDialog2.dismiss();
            }
            ProgressDialog progressDialog3 = this.dialog;
            if (progressDialog3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog3 = null;
            }
            progressDialog3.show();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("applNo", "");
            if (this.isAadharEnable) {
                jSONObject.put("authMode", "A");
                eh ehVar2 = this.binding;
                if (ehVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    ehVar = ehVar2;
                }
                jSONObject.put("mobileNo", String.valueOf(ehVar.f.getText()));
            } else {
                jSONObject.put("authMode", "M");
                eh ehVar3 = this.binding;
                if (ehVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    ehVar = ehVar3;
                }
                jSONObject.put("mobileNo", String.valueOf(ehVar.g.getText()));
            }
            jSONObject.put("regnNo", this.regNo);
            jSONObject.put("stateCode", this.stateCd);
            jSONObject.put("officeCode", this.off_code);
            jSONObject.put("purposeCode", VContant.UPDATE_MOBILE_PURPOSE_CODE);
            jSONObject.put("openDate", kt6.b());
            h2().o(jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void R1() {
        f47 f47Var;
        try {
            ProgressDialog progressDialog = this.dialog;
            eh ehVar = null;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog2 = this.dialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog2 = null;
                }
                progressDialog2.dismiss();
            }
            ProgressDialog progressDialog3 = this.dialog;
            if (progressDialog3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog3 = null;
            }
            progressDialog3.show();
            this.serviceSelectionHashMap.put(VContant.UPDATE_MOBILE, VContant.UPDATE_MOBILE_CODE);
            f47 f47Var2 = this.mView;
            if (f47Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mView");
                f47Var = null;
            } else {
                f47Var = f47Var2;
            }
            eh ehVar2 = this.binding;
            if (ehVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ehVar = ehVar2;
            }
            f47Var.l(this, String.valueOf(ehVar.b.getText()), Z1(), this.chassiNo, "A", VContant.INSTANCE.g(this.serviceSelectionHashMap), this.stateCd);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void R2(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        ((TextView) viewFindViewById).setText(message);
        wa3 wa3Var = new wa3(context);
        ((TextView) viewFindViewById3).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(wa3Var.b("btn_ok", context.getString(R.string.ok_txt)));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.oj7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanValidateUpdateMobileActivity.S2(dialog, view);
            }
        });
        dialog.show();
    }

    public final String S1() {
        String str = this.aadhar_address;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_address");
        return null;
    }

    public final String T1() {
        String str = this.aadhar_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aadhar_name");
        return null;
    }

    public final boolean T2() {
        eh ehVar = this.binding;
        eh ehVar2 = null;
        if (ehVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar = null;
        }
        if (String.valueOf(ehVar.b.getText()).length() == 0) {
            eh ehVar3 = this.binding;
            if (ehVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar3 = null;
            }
            ehVar3.b.setError(getString(R.string.enter_aadhar_no));
            eh ehVar4 = this.binding;
            if (ehVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ehVar2 = ehVar4;
            }
            ehVar2.b.requestFocus();
            return false;
        }
        eh ehVar5 = this.binding;
        if (ehVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar5 = null;
        }
        if (String.valueOf(ehVar5.m.getText()).length() == 0) {
            eh ehVar6 = this.binding;
            if (ehVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar6 = null;
            }
            ehVar6.m.setError(getString(R.string.enter_owner_name));
            eh ehVar7 = this.binding;
            if (ehVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ehVar2 = ehVar7;
            }
            ehVar2.m.requestFocus();
            return false;
        }
        eh ehVar8 = this.binding;
        if (ehVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar8 = null;
        }
        if (String.valueOf(ehVar8.f.getText()).length() != 0) {
            eh ehVar9 = this.binding;
            if (ehVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ehVar2 = ehVar9;
            }
            if (ehVar2.p.isChecked()) {
                return true;
            }
            Toast.makeText(this, "Please accept term & Condition", 0).show();
            return false;
        }
        eh ehVar10 = this.binding;
        if (ehVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar10 = null;
        }
        ehVar10.f.setError("Please enter the mobile no");
        eh ehVar11 = this.binding;
        if (ehVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ehVar2 = ehVar11;
        }
        ehVar2.f.requestFocus();
        return false;
    }

    /* JADX INFO: renamed from: U1, reason: from getter */
    public final String getChassiNo() {
        return this.chassiNo;
    }

    public final boolean U2() {
        eh ehVar = this.binding;
        eh ehVar2 = null;
        if (ehVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar = null;
        }
        if (String.valueOf(ehVar.m.getText()).length() == 0) {
            eh ehVar3 = this.binding;
            if (ehVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar3 = null;
            }
            ehVar3.m.setError(getString(R.string.enter_owner_name));
            eh ehVar4 = this.binding;
            if (ehVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ehVar2 = ehVar4;
            }
            ehVar2.m.requestFocus();
            return false;
        }
        eh ehVar5 = this.binding;
        if (ehVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar5 = null;
        }
        if (String.valueOf(ehVar5.g.getText()).length() == 0) {
            eh ehVar6 = this.binding;
            if (ehVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ehVar6 = null;
            }
            ehVar6.g.setError(getString(R.string.enter_mobile_no));
            eh ehVar7 = this.binding;
            if (ehVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ehVar2 = ehVar7;
            }
            ehVar2.g.requestFocus();
            return false;
        }
        mt6.a aVar = mt6.a;
        eh ehVar8 = this.binding;
        if (ehVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar8 = null;
        }
        if (aVar.t(String.valueOf(ehVar8.g.getText()))) {
            eh ehVar9 = this.binding;
            if (ehVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ehVar2 = ehVar9;
            }
            if (ehVar2.p.isChecked()) {
                return true;
            }
            Toast.makeText(this, "Please accept term & Condition", 0).show();
            return false;
        }
        eh ehVar10 = this.binding;
        if (ehVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar10 = null;
        }
        ehVar10.g.setError(getString(R.string.enter_mobile_no));
        eh ehVar11 = this.binding;
        if (ehVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ehVar2 = ehVar11;
        }
        ehVar2.g.requestFocus();
        return false;
    }

    public final Dialog V1() {
        Dialog dialog = this.d;
        if (dialog != null) {
            return dialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("d");
        return null;
    }

    public final boolean V2() {
        eh ehVar = this.binding;
        eh ehVar2 = null;
        if (ehVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar = null;
        }
        if (String.valueOf(ehVar.f.getText()).length() != 0) {
            eh ehVar3 = this.binding;
            if (ehVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                ehVar2 = ehVar3;
            }
            if (ehVar2.p.isChecked()) {
                return true;
            }
            Toast.makeText(this, "Please accept term & Condition", 0).show();
            return false;
        }
        eh ehVar4 = this.binding;
        if (ehVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar4 = null;
        }
        ehVar4.g.setError(getString(R.string.enter_mobile_no));
        eh ehVar5 = this.binding;
        if (ehVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ehVar2 = ehVar5;
        }
        ehVar2.g.requestFocus();
        return false;
    }

    public final void W1() {
        if (getIntent() != null) {
            this.isAadharEnable = getIntent().getBooleanExtra("isAadharEnable", false);
            if (getIntent().hasExtra("regNo")) {
                String stringExtra = getIntent().getStringExtra("regNo");
                Intrinsics.checkNotNull(stringExtra);
                this.regNo = stringExtra;
                eh ehVar = this.binding;
                if (ehVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ehVar = null;
                }
                ehVar.t.setText(X1().b("vehicle_no", "Vehicle No.:") + ' ' + this.regNo);
            }
            if (getIntent().hasExtra("stateCd")) {
                String stringExtra2 = getIntent().getStringExtra("stateCd");
                Intrinsics.checkNotNull(stringExtra2);
                this.stateCd = stringExtra2;
            }
            if (getIntent().hasExtra("stateName")) {
                String stringExtra3 = getIntent().getStringExtra("stateName");
                Intrinsics.checkNotNull(stringExtra3);
                this.stateName = stringExtra3;
            }
            if (getIntent().hasExtra("ownerName")) {
                String stringExtra4 = getIntent().getStringExtra("ownerName");
                Intrinsics.checkNotNull(stringExtra4);
                this.ownerName = stringExtra4;
            }
            if (getIntent().hasExtra("mobileNo")) {
                String stringExtra5 = getIntent().getStringExtra("mobileNo");
                Intrinsics.checkNotNull(stringExtra5);
                this.mobileNo = stringExtra5;
            }
            if (getIntent().hasExtra("aadharNo")) {
                String stringExtra6 = getIntent().getStringExtra("aadharNo");
                Intrinsics.checkNotNull(stringExtra6);
                this.aadharNo = stringExtra6;
            }
            if (getIntent().hasExtra("emailId")) {
                String stringExtra7 = getIntent().getStringExtra("emailId");
                Intrinsics.checkNotNull(stringExtra7);
                this.emailId = stringExtra7;
            }
            String stringExtra8 = getIntent().getStringExtra("chassiNo");
            Intrinsics.checkNotNull(stringExtra8);
            this.chassiNo = stringExtra8;
            A2();
        }
    }

    public final void W2(Context context, String mobile_no) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        z2(new Dialog(context));
        V1().setContentView(R.layout.aadhaar_diloge);
        V1().setCanceledOnTouchOutside(false);
        V1().setCancelable(false);
        Window window = V1().getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = V1().findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = V1().findViewById(R.id.resendOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        final TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = V1().findViewById(R.id.showmpin);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        final ImageView imageView = (ImageView) viewFindViewById3;
        View viewFindViewById4 = V1().findViewById(R.id.submitOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        View viewFindViewById5 = V1().findViewById(R.id.enterOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        final EditText editText = (EditText) viewFindViewById5;
        View viewFindViewById6 = V1().findViewById(R.id.time_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        final TextView textView2 = (TextView) viewFindViewById6;
        View viewFindViewById7 = V1().findViewById(R.id.txt_reset);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        View viewFindViewById8 = V1().findViewById(R.id.disPlay_mobile);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        ((TextView) viewFindViewById8).setText("OTP has been sent on your aadhar linked mobile number  \n+91 " + mobile_no);
        new p(textView2, textView).start();
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sj7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanValidateUpdateMobileActivity.X2(editText, imageView, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tj7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanValidateUpdateMobileActivity.Y2(this.a, textView2, textView, view);
            }
        });
        ((TextView) viewFindViewById4).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uj7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanValidateUpdateMobileActivity.Z2(editText, this, view);
            }
        });
        ((TextView) viewFindViewById7).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vj7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanValidateUpdateMobileActivity.a3(editText, view);
            }
        });
        ((LinearLayout) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wj7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanValidateUpdateMobileActivity.b3(this.a, view);
            }
        });
        V1().show();
    }

    public final wa3 X1() {
        wa3 wa3Var = this.languageKeySession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageKeySession");
        return null;
    }

    /* JADX INFO: renamed from: Y1, reason: from getter */
    public final String getOff_code() {
        return this.off_code;
    }

    public final String Z1() {
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    /* JADX INFO: renamed from: a2, reason: from getter */
    public final NrvDetails getRcdetails() {
        return this.rcdetails;
    }

    public final UpdateMobileUpdated b2() {
        UpdateMobileUpdated updateMobileUpdated = this.retrofitService;
        if (updateMobileUpdated != null) {
            return updateMobileUpdated;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final VahanServiceConnection c2() {
        VahanServiceConnection vahanServiceConnection = this.retrofitService1;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService1");
        return null;
    }

    public final void c3(Context context, String mobile_no) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        V1().setContentView(R.layout.validateotp);
        V1().setCanceledOnTouchOutside(false);
        V1().setCancelable(false);
        Window window = V1().getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = V1().findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        View viewFindViewById2 = V1().findViewById(R.id.resendOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        final TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = V1().findViewById(R.id.showmpin);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        final ImageView imageView2 = (ImageView) viewFindViewById3;
        View viewFindViewById4 = V1().findViewById(R.id.submitOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById4;
        View viewFindViewById5 = V1().findViewById(R.id.enterOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        final EditText editText = (EditText) viewFindViewById5;
        View viewFindViewById6 = V1().findViewById(R.id.time_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        final TextView textView3 = (TextView) viewFindViewById6;
        View viewFindViewById7 = V1().findViewById(R.id.txt_reset);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        TextView textView4 = (TextView) viewFindViewById7;
        View viewFindViewById8 = V1().findViewById(R.id.disPlay_mobile);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        TextView textView5 = (TextView) viewFindViewById8;
        int length = mobile_no.length();
        String strReplace = "";
        for (int i2 = 0; i2 < length; i2++) {
            mobile_no.charAt(i2);
            strReplace = new Regex("\\d(?=\\d{4})").replace(new Regex("[^0-9]").replace(mobile_no, ""), "X");
        }
        textView5.setText("OTP has been sent to your mobile \n+91 " + strReplace);
        new r(textView3, textView).start();
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hj7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanValidateUpdateMobileActivity.d3(editText, imageView2, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ij7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanValidateUpdateMobileActivity.e3(this.a, textView3, textView, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jj7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanValidateUpdateMobileActivity.f3(editText, this, view);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kj7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanValidateUpdateMobileActivity.g3(editText, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lj7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanValidateUpdateMobileActivity.h3(this.a, view);
            }
        });
        V1().show();
    }

    public final VahanProService d2() {
        VahanProService vahanProService = this.vahanService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vahanService");
        return null;
    }

    public final ld7 e2() {
        ld7 ld7Var = this.vahanViewModle;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vahanViewModle");
        return null;
    }

    public final VahanServiceConnection f2() {
        VahanServiceConnection vahanServiceConnection = this.verifyOtpRetrofitService;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("verifyOtpRetrofitService");
        return null;
    }

    public final lk7 g2() {
        lk7 lk7Var = this.verifyOtpViewModel;
        if (lk7Var != null) {
            return lk7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("verifyOtpViewModel");
        return null;
    }

    public final wq6 h2() {
        wq6 wq6Var = this.viewModel;
        if (wq6Var != null) {
            return wq6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final al7 i2() {
        al7 al7Var = this.viewModel1;
        if (al7Var != null) {
            return al7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel1");
        return null;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        VUtility.INSTANCE.y(this, X1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vahan_confirm_update_mobile);
        eh ehVarC = eh.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ehVarC, "inflate(...)");
        this.binding = ehVarC;
        f47 f47Var = null;
        if (ehVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVarC = null;
        }
        setContentView(ehVarC.b());
        ta3.a aVar = ta3.a;
        eh ehVar = this.binding;
        if (ehVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar = null;
        }
        aVar.A2(this, ehVar);
        eh ehVar2 = this.binding;
        if (ehVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ehVar2 = null;
        }
        ehVar2.q.i.setText(getString(R.string.update_mobile_no));
        B2(new wa3(this));
        this.off_code = String.valueOf(getIntent().getStringExtra("off_code"));
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        y2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        x2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        E2(String.valueOf(getIntent().getStringExtra("RC")));
        String stringExtra = getIntent().getStringExtra("OwnerDetails");
        if (stringExtra != null) {
            Object objFromJson = new Gson().fromJson(stringExtra, new TypeToken<ArrayList<OwnerDetailEntity>>() { // from class: com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.VahanValidateUpdateMobileActivity$onCreate$type$1
            }.getType());
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            ArrayList<OwnerDetailEntity> arrayList = (ArrayList) objFromJson;
            this.receivedOwnerObjList = arrayList;
            for (OwnerDetailEntity ownerDetailEntity : arrayList) {
                Log.d("SecondActivity", "Received: Name=" + ownerDetailEntity.getState_name() + ", Value=" + ownerDetailEntity.getMaker_name());
            }
        }
        z2(new Dialog(this));
        G2(UpdateMobileUpdated.INSTANCE.a(this));
        VahanServiceConnection.Companion companion = VahanServiceConnection.INSTANCE;
        H2(companion.a(this));
        K2(companion.a(this));
        this.retrofitService_one = EkYCService.INSTANCE.a(this);
        L2((lk7) new z(this, new kk7(new bg7(f2()))).a(lk7.class));
        N2((al7) new z(this, new bl7(new bg7(c2()))).a(al7.class));
        I2(VahanProService.INSTANCE.a(this));
        J2((ld7) new z(this, new kd7(new jd7(d2()))).a(ld7.class));
        EkYCService ekYCService = this.retrofitService_one;
        if (ekYCService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService_one");
            ekYCService = null;
        }
        this.mView = (f47) new z(this, new em7(new e47(ekYCService))).a(f47.class);
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.dialog = progressDialog;
        progressDialog.setCancelable(false);
        ProgressDialog progressDialog2 = this.dialog;
        if (progressDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog2 = null;
        }
        progressDialog2.setCanceledOnTouchOutside(false);
        ProgressDialog progressDialog3 = this.dialog;
        if (progressDialog3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            progressDialog3 = null;
        }
        progressDialog3.setMessage("Please wait...");
        W1();
        j2();
        this.launcherAadhaar = B0(new mf(), new hf() { // from class: com.zepto.cj7
            @Override // com.zepto.hf
            public final void a(Object obj) {
                VahanValidateUpdateMobileActivity.t2(this.a, (gf) obj);
            }
        });
        f47 f47Var2 = this.mView;
        if (f47Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            f47Var2 = null;
        }
        f47Var2.i().g(this, new o(new k()));
        f47 f47Var3 = this.mView;
        if (f47Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            f47Var3 = null;
        }
        f47Var3.j().g(this, new o(new l()));
        f47 f47Var4 = this.mView;
        if (f47Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
            f47Var4 = null;
        }
        f47Var4.g().g(this, new o(new m()));
        f47 f47Var5 = this.mView;
        if (f47Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        } else {
            f47Var = f47Var5;
        }
        f47Var.h().g(this, new o(new n()));
    }

    /* JADX INFO: renamed from: s2, reason: from getter */
    public final boolean getIsFaceless() {
        return this.isFaceless;
    }

    public final void v2(Context context, String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nj7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanValidateUpdateMobileActivity.w2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void x2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void y2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void z2(Dialog dialog) {
        Intrinsics.checkNotNullParameter(dialog, "<set-?>");
        this.d = dialog;
    }
}
