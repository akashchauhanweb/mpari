package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.AadhaarOtpValidation;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.provider.Settings;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.z;
import com.nic.mparivahan.Account.Model.GetCitizenDetails;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.GenerateUserVerify;
import com.nic.mparivahan.VahanServices.VahanModel.Vahangenotp;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.AadhaarOtpValidation.SellerBuyerToGenerateOTPScreen;
import com.nic.mparivahan.VahanServices.VahanView.VahanGenerateOTPScreenV1;
import com.nic.mparivahan.VahanServices.updateMobileNo.VahanUpdateMobileActivity;
import com.zepto.al7;
import com.zepto.bg7;
import com.zepto.bl7;
import com.zepto.gd1;
import com.zepto.gh;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.kk7;
import com.zepto.ld7;
import com.zepto.lk7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.s14;
import com.zepto.si2;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.ws6;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u0099\u0002\u0010\u009a\u0002J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0015J\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tJ \u0010\u000f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0007J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010&\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010:\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u0010)\u001a\u0004\b8\u0010+\"\u0004\b9\u0010-R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010j\u001a\u00020c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010r\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR>\u0010{\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0sj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR%\u0010\u0082\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R&\u0010\u0086\u0001\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010)\u001a\u0005\b\u0084\u0001\u0010+\"\u0005\b\u0085\u0001\u0010-R'\u0010\u008a\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0005\b\u0087\u0001\u0010}\u001a\u0005\b\u0088\u0001\u0010\u007f\"\u0006\b\u0089\u0001\u0010\u0081\u0001R'\u0010\u008e\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0005\b\u008b\u0001\u0010}\u001a\u0005\b\u008c\u0001\u0010\u007f\"\u0006\b\u008d\u0001\u0010\u0081\u0001R'\u0010\u0092\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0005\b\u008f\u0001\u0010}\u001a\u0005\b\u0090\u0001\u0010\u007f\"\u0006\b\u0091\u0001\u0010\u0081\u0001R'\u0010\u0096\u0001\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0005\b\u0093\u0001\u0010}\u001a\u0005\b\u0094\u0001\u0010\u007f\"\u0006\b\u0095\u0001\u0010\u0081\u0001R&\u0010\u009a\u0001\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0097\u0001\u0010)\u001a\u0005\b\u0098\u0001\u0010+\"\u0005\b\u0099\u0001\u0010-R*\u0010¢\u0001\u001a\u00030\u009b\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R*\u0010¦\u0001\u001a\u00030\u009b\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b£\u0001\u0010\u009d\u0001\u001a\u0006\b¤\u0001\u0010\u009f\u0001\"\u0006\b¥\u0001\u0010¡\u0001R&\u0010ª\u0001\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b§\u0001\u0010)\u001a\u0005\b¨\u0001\u0010+\"\u0005\b©\u0001\u0010-R*\u0010²\u0001\u001a\u00030«\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R*\u0010º\u0001\u001a\u00030³\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001R&\u0010¾\u0001\u001a\u00020c8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b»\u0001\u0010e\u001a\u0005\b¼\u0001\u0010g\"\u0005\b½\u0001\u0010iR&\u0010Â\u0001\u001a\u00020c8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¿\u0001\u0010e\u001a\u0005\bÀ\u0001\u0010g\"\u0005\bÁ\u0001\u0010iR*\u0010Æ\u0001\u001a\u00030\u009b\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÃ\u0001\u0010\u009d\u0001\u001a\u0006\bÄ\u0001\u0010\u009f\u0001\"\u0006\bÅ\u0001\u0010¡\u0001R&\u0010Ê\u0001\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÇ\u0001\u0010)\u001a\u0005\bÈ\u0001\u0010+\"\u0005\bÉ\u0001\u0010-R&\u0010Î\u0001\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bË\u0001\u0010)\u001a\u0005\bÌ\u0001\u0010+\"\u0005\bÍ\u0001\u0010-R&\u0010Ò\u0001\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÏ\u0001\u0010)\u001a\u0005\bÐ\u0001\u0010+\"\u0005\bÑ\u0001\u0010-R&\u0010Ö\u0001\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÓ\u0001\u0010)\u001a\u0005\bÔ\u0001\u0010+\"\u0005\bÕ\u0001\u0010-R(\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b×\u0001\u0010Ø\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001\"\u0006\bÛ\u0001\u0010Ü\u0001R*\u0010ä\u0001\u001a\u00030Ý\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÞ\u0001\u0010ß\u0001\u001a\u0006\bà\u0001\u0010á\u0001\"\u0006\bâ\u0001\u0010ã\u0001R*\u0010ì\u0001\u001a\u00030å\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bæ\u0001\u0010ç\u0001\u001a\u0006\bè\u0001\u0010é\u0001\"\u0006\bê\u0001\u0010ë\u0001R&\u0010ð\u0001\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bí\u0001\u0010]\u001a\u0005\bî\u0001\u0010_\"\u0005\bï\u0001\u0010aR'\u0010ô\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bñ\u0001\u0010}\u001a\u0005\bò\u0001\u0010\u007f\"\u0006\bó\u0001\u0010\u0081\u0001R'\u0010ø\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bõ\u0001\u0010}\u001a\u0005\bö\u0001\u0010\u007f\"\u0006\b÷\u0001\u0010\u0081\u0001R'\u0010ü\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bù\u0001\u0010}\u001a\u0005\bú\u0001\u0010\u007f\"\u0006\bû\u0001\u0010\u0081\u0001R*\u0010\u0084\u0002\u001a\u00030ý\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bþ\u0001\u0010ÿ\u0001\u001a\u0006\b\u0080\u0002\u0010\u0081\u0002\"\u0006\b\u0082\u0002\u0010\u0083\u0002R*\u0010\u008c\u0002\u001a\u00030\u0085\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0086\u0002\u0010\u0087\u0002\u001a\u0006\b\u0088\u0002\u0010\u0089\u0002\"\u0006\b\u008a\u0002\u0010\u008b\u0002R'\u0010\u0090\u0002\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u008d\u0002\u0010}\u001a\u0005\b\u008e\u0002\u0010\u007f\"\u0006\b\u008f\u0002\u0010\u0081\u0001R,\u0010\u0098\u0002\u001a\u0005\u0018\u00010\u0091\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0092\u0002\u0010\u0093\u0002\u001a\u0006\b\u0094\u0002\u0010\u0095\u0002\"\u0006\b\u0096\u0002\u0010\u0097\u0002¨\u0006\u009b\u0002"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/SellerAndBuyer/AadhaarOtpValidation/SellerBuyerToGenerateOTPScreen;", "Lcom/zepto/pq;", "", "y2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "z2", "p3", "mobile_no", "developermess", "r3", "Lcom/zepto/ld7;", "viewModelv1", "D1", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "C", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "getBottom", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "D2", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V", "bottom", "Landroidx/appcompat/widget/AppCompatButton;", "D", "Landroidx/appcompat/widget/AppCompatButton;", "L1", "()Landroidx/appcompat/widget/AppCompatButton;", "J2", "(Landroidx/appcompat/widget/AppCompatButton;)V", "generateOtp", "E", "U1", "V2", "reset", "Landroid/widget/TextView;", "F", "Landroid/widget/TextView;", "d2", "()Landroid/widget/TextView;", "g3", "(Landroid/widget/TextView;)V", "txtVehicleNumber", "Landroid/widget/CheckBox;", "G", "Landroid/widget/CheckBox;", "b2", "()Landroid/widget/CheckBox;", "e3", "(Landroid/widget/CheckBox;)V", "term_condition", "H", "I1", "G2", "edit_mobile_number", "Landroidx/appcompat/widget/AppCompatImageView;", "I", "Landroidx/appcompat/widget/AppCompatImageView;", "N1", "()Landroidx/appcompat/widget/AppCompatImageView;", "L2", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "mvvm_back", "Landroid/widget/RelativeLayout;", "J", "Landroid/widget/RelativeLayout;", "O1", "()Landroid/widget/RelativeLayout;", "M2", "(Landroid/widget/RelativeLayout;)V", "nexGenHolder", "Landroid/app/ProgressDialog;", "K", "Landroid/app/ProgressDialog;", "Q1", "()Landroid/app/ProgressDialog;", "Q2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/al7;", "L", "Lcom/zepto/al7;", "i2", "()Lcom/zepto/al7;", "n3", "(Lcom/zepto/al7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "M", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "V1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "W2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;)V", "retrofitService", "Lcom/nic/mparivahan/MyTextView;", "N", "Lcom/nic/mparivahan/MyTextView;", "E1", "()Lcom/nic/mparivahan/MyTextView;", "B2", "(Lcom/nic/mparivahan/MyTextView;)V", "agreeTermCond", "Lcom/zepto/ws6;", "O", "Lcom/zepto/ws6;", "getSession_manger", "()Lcom/zepto/ws6;", "Z2", "(Lcom/zepto/ws6;)V", "session_manger", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "P", "Ljava/util/HashMap;", "W1", "()Ljava/util/HashMap;", "setServiceSelection_HashMap", "(Ljava/util/HashMap;)V", "serviceSelection_HashMap", "Q", "Ljava/lang/String;", "M1", "()Ljava/lang/String;", "K2", "(Ljava/lang/String;)V", "mobile_number", "R", "getSelectedServiceTv", "X2", "selectedServiceTv", "S", "P1", "O2", "off_code", "T", "S1", "S2", "purCode", "U", "Z1", "b3", "stateCode", "V", "G1", "E2", "chassiNo", "W", "getEnterMobileTv", "H2", "enterMobileTv", "Landroid/widget/LinearLayout;", "X", "Landroid/widget/LinearLayout;", "getTermCndLl", "()Landroid/widget/LinearLayout;", "d3", "(Landroid/widget/LinearLayout;)V", "termCndLl", "Y", "getVerifyOtpLl", "k3", "verifyOtpLl", "Z", "getDisPlay", "F2", "disPlay", "Landroid/widget/EditText;", "a0", "Landroid/widget/EditText;", "J1", "()Landroid/widget/EditText;", "I2", "(Landroid/widget/EditText;)V", "enterOtp", "Landroid/widget/ImageView;", "b0", "Landroid/widget/ImageView;", "Y1", "()Landroid/widget/ImageView;", "a3", "(Landroid/widget/ImageView;)V", "shownPin", "c0", "c2", "f3", "time_text", "d0", "T1", "U2", "resendOtp", "e0", "getVerifyOtpBtn", "j3", "verifyOtpBtn", "f0", "a2", "c3", "submitOtp", "g0", "e2", "h3", "txt_reset", "h0", "f2", "i3", "update_mob", "i0", "getNote_text", "N2", "note_text", "j0", "Lcom/zepto/ld7;", "j2", "()Lcom/zepto/ld7;", "o3", "(Lcom/zepto/ld7;)V", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "k0", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "R1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "R2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "proservice", "Lcom/zepto/lk7;", "l0", "Lcom/zepto/lk7;", "h2", "()Lcom/zepto/lk7;", "m3", "(Lcom/zepto/lk7;)V", "verifyOtpViewModel", "m0", "g2", "l3", "verifyOtpRetrofitService", "n0", "getOtpId", "P2", "otpId", "o0", "getRcNo", "T2", "rcNo", "p0", "getRc_number", "setRc_number", "rc_number", "Lcom/zepto/gh;", "q0", "Lcom/zepto/gh;", "F1", "()Lcom/zepto/gh;", "C2", "(Lcom/zepto/gh;)V", "binding", "Lcom/zepto/wa3;", "r0", "Lcom/zepto/wa3;", "X1", "()Lcom/zepto/wa3;", "Y2", "(Lcom/zepto/wa3;)V", "session", "s0", "K1", "setFlage", "flage", "Landroid/app/Dialog;", "t0", "Landroid/app/Dialog;", "H1", "()Landroid/app/Dialog;", "setD", "(Landroid/app/Dialog;)V", "d", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class SellerBuyerToGenerateOTPScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public CoordinatorLayout bottom;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public AppCompatButton generateOtp;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public AppCompatButton reset;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public TextView txtVehicleNumber;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public CheckBox term_condition;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public TextView edit_mobile_number;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public AppCompatImageView mvvm_back;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public RelativeLayout nexGenHolder;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public al7 viewModel;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public VahanServiceConnection retrofitService;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public MyTextView agreeTermCond;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public ws6 session_manger;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String mobile_number;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public TextView selectedServiceTv;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String purCode;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String stateCode;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String chassiNo;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public TextView enterMobileTv;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public LinearLayout termCndLl;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public LinearLayout verifyOtpLl;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public TextView disPlay;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public EditText enterOtp;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public ImageView shownPin;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public MyTextView time_text;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public MyTextView resendOtp;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public LinearLayout verifyOtpBtn;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public TextView submitOtp;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public TextView txt_reset;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public TextView update_mob;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public TextView note_text;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public ld7 viewModelv1;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public VahanProService proservice;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public lk7 verifyOtpViewModel;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public VahanServiceConnection verifyOtpRetrofitService;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public gh binding;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    public Dialog d;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public HashMap serviceSelection_HashMap = new HashMap();

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public String otpId = "";

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public String rcNo = "";

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public String rc_number = "";

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    public String flage = "";

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
            try {
                SellerBuyerToGenerateOTPScreen.this.Q1().dismiss();
            } catch (Exception e) {
                e.printStackTrace();
            }
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
        public final void a(Vahangenotp vahangenotp) {
            try {
                SellerBuyerToGenerateOTPScreen.this.Q1().dismiss();
                if (vahangenotp.getApiMessage().getStatusCode() == 200) {
                    SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen = SellerBuyerToGenerateOTPScreen.this;
                    sellerBuyerToGenerateOTPScreen.r3(sellerBuyerToGenerateOTPScreen, sellerBuyerToGenerateOTPScreen.I1().getText().toString(), String.valueOf(vahangenotp.getApiMessage().getDeveloperMessage()));
                } else {
                    Toast.makeText(SellerBuyerToGenerateOTPScreen.this.getApplicationContext(), vahangenotp.getApiMessage().getDeveloperMessage(), 1).show();
                }
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(SellerBuyerToGenerateOTPScreen.this.getApplicationContext(), "Unable to send the OTP, Please try after some times", 1).show();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Vahangenotp) obj);
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
            try {
                SellerBuyerToGenerateOTPScreen.this.Q1().dismiss();
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(SellerBuyerToGenerateOTPScreen.this.getApplicationContext(), "Unable to send the OTP, Please try after some times", 1).show();
            }
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
        public final void a(SendOtpResult sendOtpResult) {
            try {
                SellerBuyerToGenerateOTPScreen.this.Q1().dismiss();
                if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL001", true)) {
                    SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen = SellerBuyerToGenerateOTPScreen.this;
                    sellerBuyerToGenerateOTPScreen.r3(sellerBuyerToGenerateOTPScreen, sellerBuyerToGenerateOTPScreen.I1().getText().toString(), " ");
                    SellerBuyerToGenerateOTPScreen.this.P2(String.valueOf(sendOtpResult.getRecordId()));
                    SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen2 = SellerBuyerToGenerateOTPScreen.this;
                    sellerBuyerToGenerateOTPScreen2.T2(sellerBuyerToGenerateOTPScreen2.d2().getText().toString());
                } else if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL022", true) || StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL014", true)) {
                    Toast.makeText(SellerBuyerToGenerateOTPScreen.this.getApplicationContext(), sendOtpResult.getStatusDesc().toString(), 1).show();
                } else if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL099", true)) {
                    Toast.makeText(SellerBuyerToGenerateOTPScreen.this.getApplicationContext(), "Unable to send the OTP, Please try after some times!", 1).show();
                } else {
                    Toast.makeText(SellerBuyerToGenerateOTPScreen.this.getApplicationContext(), "Unable to send the OTP, Please try after some times!", 1).show();
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(SellerBuyerToGenerateOTPScreen.this.getApplicationContext(), "Unable to send the OTP, Please try after some times", 1).show();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SendOtpResult) obj);
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
            SellerBuyerToGenerateOTPScreen.this.Q1().dismiss();
            SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen = SellerBuyerToGenerateOTPScreen.this;
            sellerBuyerToGenerateOTPScreen.p3(sellerBuyerToGenerateOTPScreen, sellerBuyerToGenerateOTPScreen.getString(R.string.service_unavable_please_try));
        }
    }

    public static final class f extends CountDownTimer {
        public f() {
            super(30000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            SellerBuyerToGenerateOTPScreen.this.T1().setVisibility(0);
            SellerBuyerToGenerateOTPScreen.this.c2().setText("0");
            SellerBuyerToGenerateOTPScreen.this.c2().setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            SellerBuyerToGenerateOTPScreen.this.c2().setText("Time remaining : " + (j / ((long) 1000)));
            SellerBuyerToGenerateOTPScreen.this.T1().setVisibility(8);
            SellerBuyerToGenerateOTPScreen.this.c2().setVisibility(0);
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
        public final void a(Vahangenotp vahangenotp) {
            try {
                SellerBuyerToGenerateOTPScreen.this.Q1().dismiss();
                if (vahangenotp.getApiMessage().getStatusCode() == 200) {
                    SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen = SellerBuyerToGenerateOTPScreen.this;
                    sellerBuyerToGenerateOTPScreen.z2(sellerBuyerToGenerateOTPScreen, sellerBuyerToGenerateOTPScreen.X1().b("label_log_resend_otp", "We have resent the OTP Verification to your mobile number"));
                } else {
                    SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen2 = SellerBuyerToGenerateOTPScreen.this;
                    sellerBuyerToGenerateOTPScreen2.z2(sellerBuyerToGenerateOTPScreen2, "Unable to send the OTP, Please try after some time");
                }
            } catch (Exception e) {
                e.printStackTrace();
                SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen3 = SellerBuyerToGenerateOTPScreen.this;
                sellerBuyerToGenerateOTPScreen3.z2(sellerBuyerToGenerateOTPScreen3, "Unable to send the OTP, Please try after some time");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Vahangenotp) obj);
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
            try {
                if (SellerBuyerToGenerateOTPScreen.this.Q1().isShowing()) {
                    SellerBuyerToGenerateOTPScreen.this.Q1().dismiss();
                }
                if (SellerBuyerToGenerateOTPScreen.this.getD() != null) {
                    Dialog d = SellerBuyerToGenerateOTPScreen.this.getD();
                    Intrinsics.checkNotNull(d);
                    d.dismiss();
                }
                Toast.makeText(SellerBuyerToGenerateOTPScreen.this, str, 0).show();
                Intent intent = new Intent(SellerBuyerToGenerateOTPScreen.this, (Class<?>) VahanGenerateOTPScreenV1.class);
                intent.putExtra(VContant.AUTHMODE, "M");
                intent.putExtra(VContant.ACTIVITY, SellerBuyerToGenerateOTPScreen.this.getFlage());
                if (SellerBuyerToGenerateOTPScreen.this.getServiceSelection_HashMap().containsKey(VContant.M_VALUE)) {
                    intent.putExtra(VContant.M_VALUE, (String) SellerBuyerToGenerateOTPScreen.this.getServiceSelection_HashMap().get(VContant.M_VALUE));
                }
                SellerBuyerToGenerateOTPScreen.this.setResult(-1, intent);
                SellerBuyerToGenerateOTPScreen.this.finish();
            } catch (Exception e) {
                if (SellerBuyerToGenerateOTPScreen.this.Q1().isShowing()) {
                    SellerBuyerToGenerateOTPScreen.this.Q1().dismiss();
                }
                e.printStackTrace();
                SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen = SellerBuyerToGenerateOTPScreen.this;
                sellerBuyerToGenerateOTPScreen.z2(sellerBuyerToGenerateOTPScreen, sellerBuyerToGenerateOTPScreen.X1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
            }
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
            SellerBuyerToGenerateOTPScreen.this.Q1().dismiss();
            if (StringsKt__StringsJVMKt.equals(str, "ERROR", true)) {
                SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen = SellerBuyerToGenerateOTPScreen.this;
                sellerBuyerToGenerateOTPScreen.z2(sellerBuyerToGenerateOTPScreen, sellerBuyerToGenerateOTPScreen.X1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
            } else {
                SellerBuyerToGenerateOTPScreen sellerBuyerToGenerateOTPScreen2 = SellerBuyerToGenerateOTPScreen.this;
                sellerBuyerToGenerateOTPScreen2.z2(sellerBuyerToGenerateOTPScreen2, str);
            }
        }
    }

    public static final class j extends Lambda implements Function1 {
        public j() {
            super(1);
        }

        public final void a(GetCitizenDetails getCitizenDetails) {
            try {
                if (StringsKt__StringsJVMKt.equals(getCitizenDetails.getStatusCode(), "CTZN001", true)) {
                    SellerBuyerToGenerateOTPScreen.this.i2().m(SellerBuyerToGenerateOTPScreen.this, String.valueOf(getCitizenDetails.getMparCitizenUser().getCtzMobile()), String.valueOf(getCitizenDetails.getMparCitizenUser().getCtzRecordId()));
                } else if (StringsKt__StringsJVMKt.equals(getCitizenDetails.getStatusCode(), "CTZN099", true)) {
                    SellerBuyerToGenerateOTPScreen.this.Q1().dismiss();
                } else {
                    SellerBuyerToGenerateOTPScreen.this.Q1().dismiss();
                    Toast.makeText(SellerBuyerToGenerateOTPScreen.this.getApplicationContext(), "Unable to send the OTP, Please try after some times!", 1).show();
                }
            } catch (Exception e) {
                e.printStackTrace();
                SellerBuyerToGenerateOTPScreen.this.Q1().dismiss();
                Toast.makeText(SellerBuyerToGenerateOTPScreen.this.getApplicationContext(), "Unable to send the OTP, Please try after some times", 1).show();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetCitizenDetails) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class k implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public k(Function1 function) {
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

    public static final class l extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ TextView d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(TextView textView, Ref.ObjectRef objectRef, Context context, TextView textView2) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = objectRef;
            this.c = context;
            this.d = textView2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.d.setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.a.setText(((wa3) this.b.element).b("time_remaining", this.c.getString(R.string.time_remaining)) + " : " + (j / ((long) 1000)));
            this.d.setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    public static final class m extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ TextView d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(TextView textView, Ref.ObjectRef objectRef, Context context, TextView textView2) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = objectRef;
            this.c = context;
            this.d = textView2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.d.setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.a.setText(((wa3) this.b.element).b("time_remaining", this.c.getString(R.string.time_remaining)) + " : " + (j / ((long) 1000)));
            this.d.setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void k2(SellerBuyerToGenerateOTPScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void l2(SellerBuyerToGenerateOTPScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.y2();
    }

    public static final void m2(SellerBuyerToGenerateOTPScreen this$0, View view) {
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
        ((ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jx5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SellerBuyerToGenerateOTPScreen.n2(dialog, view2);
            }
        });
        ((WebView) viewFindViewById2).loadUrl(str);
        dialog.show();
    }

    public static final void n2(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    public static final void o2(SellerBuyerToGenerateOTPScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.Q1().show();
        this$0.new f().start();
        this$0.h2().j(this$0, this$0.otpId);
    }

    public static final void p2(SellerBuyerToGenerateOTPScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.J1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            this$0.Y1().setImageResource(R.drawable.pass_visible);
            this$0.J1().setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            this$0.Y1().setImageResource(R.drawable.mvvm_visibility);
            this$0.J1().setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public static final void q2(SellerBuyerToGenerateOTPScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.J1().getText().toString();
        if (string.length() == 0) {
            this$0.z2(this$0, this$0.X1().b("label_log_entr_otp", "Please enter the OTP"));
            return;
        }
        if (string.length() < 6) {
            this$0.z2(this$0, this$0.X1().b("label_log_entr_otp", "Please enter the valid OTP"));
            return;
        }
        if (this$0.Q1().isShowing()) {
            this$0.Q1().dismiss();
        }
        this$0.Q1().show();
        this$0.h2().l(this$0, string, this$0.otpId);
    }

    public static final void q3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void r2(SellerBuyerToGenerateOTPScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.J1().setText("");
    }

    public static final void s2(SellerBuyerToGenerateOTPScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = StringsKt__StringsKt.trim((CharSequence) this$0.I1().getText().toString()).toString();
        if (string.length() < 10) {
            Toast.makeText(this$0, "Invalid mobile number", 0).show();
            return;
        }
        this$0.Q1().show();
        ws6 ws6Var = new ws6(this$0);
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        arrayList.add(this$0.S1());
        this$0.j2().B1(this$0, new GenerateUserVerify(" ", "M", this$0.G1(), Settings.Secure.getString(this$0.getContentResolver(), "android_id"), "No", " ", ws6Var.l(), string, " ", true, arrayList, this$0.rc_number, this$0.Z1(), ws6Var.e(), "", ws6Var.k()));
    }

    public static final void s3(EditText enterOtp, ImageView shownPin, View view) {
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

    public static final void t2(SellerBuyerToGenerateOTPScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.b2().isChecked()) {
            this$0.b2().setChecked(false);
        }
    }

    public static final void t3(SellerBuyerToGenerateOTPScreen this$0, TextView time_text, Ref.ObjectRef langSession, Context context, TextView resendOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(time_text, "$time_text");
        Intrinsics.checkNotNullParameter(langSession, "$langSession");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(resendOtp, "$resendOtp");
        this$0.Q1().show();
        new m(time_text, langSession, context, resendOtp).start();
        this$0.Q1().show();
        ws6 ws6Var = new ws6(this$0);
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        arrayList.add(this$0.S1());
        this$0.j2().A1(this$0, new GenerateUserVerify(" ", "M", this$0.G1(), Settings.Secure.getString(this$0.getContentResolver(), "android_id"), "No", " ", ws6Var.l(), this$0.M1().toString(), " ", true, arrayList, this$0.rc_number, this$0.Z1(), ws6Var.e(), "", ws6Var.k()));
    }

    public static final void u2(SellerBuyerToGenerateOTPScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) VahanUpdateMobileActivity.class));
        this$0.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void u3(EditText enterOtp, Context context, Ref.ObjectRef langSession, SellerBuyerToGenerateOTPScreen this$0, String mobile_no, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(langSession, "$langSession");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mobile_no, "$mobile_no");
        String string = enterOtp.getText().toString();
        if (string.length() == 0) {
            Toast.makeText(context, ((wa3) langSession.element).b("label_log_entr_otp", context.getString(R.string.pls_enter_otp)), 0).show();
            return;
        }
        if (string.length() < 4) {
            Toast.makeText(context, ((wa3) langSession.element).b("label_log_entr_val_otp", "Please enter the valid OTP"), 0).show();
            return;
        }
        if (this$0.Q1().isShowing()) {
            this$0.Q1().dismiss();
        }
        this$0.Q1().show();
        this$0.j2().C1(this$0, mobile_no, this$0.rc_number, this$0.Z1(), "M", this$0.S1(), string, "", new ws6(this$0).k(), this$0.G1());
    }

    public static final void v2(SellerBuyerToGenerateOTPScreen this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.L1().setEnabled(true);
            this$0.L1().setAlpha(1.0f);
        } else {
            if (z) {
                return;
            }
            this$0.L1().setEnabled(false);
            this$0.L1().setAlpha(0.5f);
        }
    }

    public static final void v3(EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        enterOtp.setText("");
    }

    public static final void w2(SellerBuyerToGenerateOTPScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.Q1().dismiss();
            if (!gd1.a.m(str)) {
                this$0.K2(str.toString());
                String strM1 = this$0.M1();
                if (strM1 == null || strM1.length() == 0 || StringsKt__StringsJVMKt.equals(this$0.M1(), "null", true)) {
                    this$0.I1().setText("NA");
                } else {
                    this$0.I1().setText(this$0.M1());
                }
            }
        } catch (Exception e2) {
            this$0.Q1().dismiss();
            e2.printStackTrace();
        }
    }

    public static final void w3(SellerBuyerToGenerateOTPScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.d;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public static final void x2(SellerBuyerToGenerateOTPScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.Q1().dismiss();
    }

    private final void y2() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void B2(MyTextView myTextView) {
        Intrinsics.checkNotNullParameter(myTextView, "<set-?>");
        this.agreeTermCond = myTextView;
    }

    public final void C2(gh ghVar) {
        Intrinsics.checkNotNullParameter(ghVar, "<set-?>");
        this.binding = ghVar;
    }

    public final void D1(ld7 viewModelv1) {
        Intrinsics.checkNotNullParameter(viewModelv1, "viewModelv1");
        Q1().show();
        viewModelv1.A0(this, this.rc_number, Z1(), G1(), P1());
    }

    public final void D2(CoordinatorLayout coordinatorLayout) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "<set-?>");
        this.bottom = coordinatorLayout;
    }

    public final MyTextView E1() {
        MyTextView myTextView = this.agreeTermCond;
        if (myTextView != null) {
            return myTextView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("agreeTermCond");
        return null;
    }

    public final void E2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.chassiNo = str;
    }

    public final gh F1() {
        gh ghVar = this.binding;
        if (ghVar != null) {
            return ghVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void F2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.disPlay = textView;
    }

    public final String G1() {
        String str = this.chassiNo;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chassiNo");
        return null;
    }

    public final void G2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.edit_mobile_number = textView;
    }

    /* JADX INFO: renamed from: H1, reason: from getter */
    public final Dialog getD() {
        return this.d;
    }

    public final void H2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.enterMobileTv = textView;
    }

    public final TextView I1() {
        TextView textView = this.edit_mobile_number;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("edit_mobile_number");
        return null;
    }

    public final void I2(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.enterOtp = editText;
    }

    public final EditText J1() {
        EditText editText = this.enterOtp;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("enterOtp");
        return null;
    }

    public final void J2(AppCompatButton appCompatButton) {
        Intrinsics.checkNotNullParameter(appCompatButton, "<set-?>");
        this.generateOtp = appCompatButton;
    }

    /* JADX INFO: renamed from: K1, reason: from getter */
    public final String getFlage() {
        return this.flage;
    }

    public final void K2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobile_number = str;
    }

    public final AppCompatButton L1() {
        AppCompatButton appCompatButton = this.generateOtp;
        if (appCompatButton != null) {
            return appCompatButton;
        }
        Intrinsics.throwUninitializedPropertyAccessException("generateOtp");
        return null;
    }

    public final void L2(AppCompatImageView appCompatImageView) {
        Intrinsics.checkNotNullParameter(appCompatImageView, "<set-?>");
        this.mvvm_back = appCompatImageView;
    }

    public final String M1() {
        String str = this.mobile_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mobile_number");
        return null;
    }

    public final void M2(RelativeLayout relativeLayout) {
        Intrinsics.checkNotNullParameter(relativeLayout, "<set-?>");
        this.nexGenHolder = relativeLayout;
    }

    public final AppCompatImageView N1() {
        AppCompatImageView appCompatImageView = this.mvvm_back;
        if (appCompatImageView != null) {
            return appCompatImageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mvvm_back");
        return null;
    }

    public final void N2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.note_text = textView;
    }

    public final RelativeLayout O1() {
        RelativeLayout relativeLayout = this.nexGenHolder;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nexGenHolder");
        return null;
    }

    public final void O2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final String P1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    public final void P2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.otpId = str;
    }

    public final ProgressDialog Q1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final void Q2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final VahanProService R1() {
        VahanProService vahanProService = this.proservice;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("proservice");
        return null;
    }

    public final void R2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.proservice = vahanProService;
    }

    public final String S1() {
        String str = this.purCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("purCode");
        return null;
    }

    public final void S2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.purCode = str;
    }

    public final MyTextView T1() {
        MyTextView myTextView = this.resendOtp;
        if (myTextView != null) {
            return myTextView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("resendOtp");
        return null;
    }

    public final void T2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rcNo = str;
    }

    public final AppCompatButton U1() {
        AppCompatButton appCompatButton = this.reset;
        if (appCompatButton != null) {
            return appCompatButton;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reset");
        return null;
    }

    public final void U2(MyTextView myTextView) {
        Intrinsics.checkNotNullParameter(myTextView, "<set-?>");
        this.resendOtp = myTextView;
    }

    public final VahanServiceConnection V1() {
        VahanServiceConnection vahanServiceConnection = this.retrofitService;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final void V2(AppCompatButton appCompatButton) {
        Intrinsics.checkNotNullParameter(appCompatButton, "<set-?>");
        this.reset = appCompatButton;
    }

    /* JADX INFO: renamed from: W1, reason: from getter */
    public final HashMap getServiceSelection_HashMap() {
        return this.serviceSelection_HashMap;
    }

    public final void W2(VahanServiceConnection vahanServiceConnection) {
        Intrinsics.checkNotNullParameter(vahanServiceConnection, "<set-?>");
        this.retrofitService = vahanServiceConnection;
    }

    public final wa3 X1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final void X2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.selectedServiceTv = textView;
    }

    public final ImageView Y1() {
        ImageView imageView = this.shownPin;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shownPin");
        return null;
    }

    public final void Y2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final String Z1() {
        String str = this.stateCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stateCode");
        return null;
    }

    public final void Z2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.session_manger = ws6Var;
    }

    public final TextView a2() {
        TextView textView = this.submitOtp;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("submitOtp");
        return null;
    }

    public final void a3(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.shownPin = imageView;
    }

    public final CheckBox b2() {
        CheckBox checkBox = this.term_condition;
        if (checkBox != null) {
            return checkBox;
        }
        Intrinsics.throwUninitializedPropertyAccessException("term_condition");
        return null;
    }

    public final void b3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCode = str;
    }

    public final MyTextView c2() {
        MyTextView myTextView = this.time_text;
        if (myTextView != null) {
            return myTextView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("time_text");
        return null;
    }

    public final void c3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.submitOtp = textView;
    }

    public final TextView d2() {
        TextView textView = this.txtVehicleNumber;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtVehicleNumber");
        return null;
    }

    public final void d3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.termCndLl = linearLayout;
    }

    public final TextView e2() {
        TextView textView = this.txt_reset;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txt_reset");
        return null;
    }

    public final void e3(CheckBox checkBox) {
        Intrinsics.checkNotNullParameter(checkBox, "<set-?>");
        this.term_condition = checkBox;
    }

    public final TextView f2() {
        TextView textView = this.update_mob;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("update_mob");
        return null;
    }

    public final void f3(MyTextView myTextView) {
        Intrinsics.checkNotNullParameter(myTextView, "<set-?>");
        this.time_text = myTextView;
    }

    public final VahanServiceConnection g2() {
        VahanServiceConnection vahanServiceConnection = this.verifyOtpRetrofitService;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("verifyOtpRetrofitService");
        return null;
    }

    public final void g3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtVehicleNumber = textView;
    }

    public final lk7 h2() {
        lk7 lk7Var = this.verifyOtpViewModel;
        if (lk7Var != null) {
            return lk7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("verifyOtpViewModel");
        return null;
    }

    public final void h3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txt_reset = textView;
    }

    public final al7 i2() {
        al7 al7Var = this.viewModel;
        if (al7Var != null) {
            return al7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void i3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.update_mob = textView;
    }

    public final ld7 j2() {
        ld7 ld7Var = this.viewModelv1;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelv1");
        return null;
    }

    public final void j3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.verifyOtpBtn = linearLayout;
    }

    public final void k3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.verifyOtpLl = linearLayout;
    }

    public final void l3(VahanServiceConnection vahanServiceConnection) {
        Intrinsics.checkNotNullParameter(vahanServiceConnection, "<set-?>");
        this.verifyOtpRetrofitService = vahanServiceConnection;
    }

    public final void m3(lk7 lk7Var) {
        Intrinsics.checkNotNullParameter(lk7Var, "<set-?>");
        this.verifyOtpViewModel = lk7Var;
    }

    public final void n3(al7 al7Var) {
        Intrinsics.checkNotNullParameter(al7Var, "<set-?>");
        this.viewModel = al7Var;
    }

    public final void o3(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModelv1 = ld7Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vahan_generate_o_t_p_screen);
        gh ghVarC = gh.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ghVarC, "inflate(...)");
        C2(ghVarC);
        setContentView(F1().b());
        getWindow().addFlags(128);
        Y2(new wa3(this));
        View viewFindViewById = findViewById(R.id.bottom);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        D2((CoordinatorLayout) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.generate_otp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        J2((AppCompatButton) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.reset_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        V2((AppCompatButton) viewFindViewById3);
        ta3.a.M2(this, F1(), U1(), L1());
        View viewFindViewById4 = findViewById(R.id.txt_vehicle_number);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        g3((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.term_condition);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        e3((CheckBox) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.edit_mobile_number);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        G2((TextView) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.mvvm_back);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        L2((AppCompatImageView) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.nexGenHolder);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        M2((RelativeLayout) viewFindViewById8);
        View viewFindViewById9 = findViewById(R.id.agreeTermCond);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        B2((MyTextView) viewFindViewById9);
        View viewFindViewById10 = findViewById(R.id.selectedServiceTv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        X2((TextView) viewFindViewById10);
        View viewFindViewById11 = findViewById(R.id.note_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        N2((TextView) viewFindViewById11);
        R2(VahanProService.INSTANCE.a(this));
        this.d = new Dialog(this);
        o3((ld7) new z(this, new kd7(new jd7(R1()))).a(ld7.class));
        VahanServiceConnection.Companion companion = VahanServiceConnection.INSTANCE;
        W2(companion.a(this));
        l3(companion.a(this));
        View viewFindViewById12 = findViewById(R.id.enterMobileTv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        H2((TextView) viewFindViewById12);
        View viewFindViewById13 = findViewById(R.id.termCndLl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        d3((LinearLayout) viewFindViewById13);
        View viewFindViewById14 = findViewById(R.id.verifyOtpLl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        k3((LinearLayout) viewFindViewById14);
        View viewFindViewById15 = findViewById(R.id.disPlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
        F2((TextView) viewFindViewById15);
        View viewFindViewById16 = findViewById(R.id.enterOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "findViewById(...)");
        I2((EditText) viewFindViewById16);
        View viewFindViewById17 = findViewById(R.id.showmpin);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById17, "findViewById(...)");
        a3((ImageView) viewFindViewById17);
        View viewFindViewById18 = findViewById(R.id.time_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById18, "findViewById(...)");
        f3((MyTextView) viewFindViewById18);
        View viewFindViewById19 = findViewById(R.id.resendOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById19, "findViewById(...)");
        U2((MyTextView) viewFindViewById19);
        View viewFindViewById20 = findViewById(R.id.verifyOtpBtn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById20, "findViewById(...)");
        j3((LinearLayout) viewFindViewById20);
        View viewFindViewById21 = findViewById(R.id.submitOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById21, "findViewById(...)");
        c3((TextView) viewFindViewById21);
        View viewFindViewById22 = findViewById(R.id.txt_reset);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById22, "findViewById(...)");
        h3((TextView) viewFindViewById22);
        View viewFindViewById23 = findViewById(R.id.update_mob);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById23, "findViewById(...)");
        i3((TextView) viewFindViewById23);
        L1().setEnabled(false);
        L1().setAlpha(0.5f);
        Q2(new ProgressDialog(this));
        Q1().setMessage("Please wait...");
        Q1().setCancelable(false);
        Q1().setCanceledOnTouchOutside(false);
        Z2(new ws6(this));
        m3((lk7) new z(this, new kk7(new bg7(g2()))).a(lk7.class));
        n3((al7) new z(this, new bl7(new bg7(V1()))).a(al7.class));
        if (getIntent() != null) {
            si2 si2Var = (si2) getIntent().getParcelableExtra(VContant.MOBAUTH);
            Intrinsics.checkNotNull(si2Var);
            this.rc_number = si2Var.g();
            this.serviceSelection_HashMap = si2Var.h();
            O2(si2Var.e());
            S2(si2Var.f());
            b3(si2Var.i());
            E2(si2Var.c());
            this.flage = si2Var.d();
            String str = this.rc_number;
            if (str != null && str.length() != 0) {
                d2().setText(this.rc_number.toString());
            }
            D1(j2());
        }
        if (this.serviceSelection_HashMap.size() > 0) {
            F1().p.i.setText(String.valueOf(X1().b("toSellerHeader", "Transfer of Ownership \n(Seller)")));
        }
        N1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zw5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerBuyerToGenerateOTPScreen.k2(this.a, view);
            }
        });
        O1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ox5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerBuyerToGenerateOTPScreen.l2(this.a, view);
            }
        });
        L1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.px5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerBuyerToGenerateOTPScreen.s2(this.a, view);
            }
        });
        U1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qx5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerBuyerToGenerateOTPScreen.t2(this.a, view);
            }
        });
        f2().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rx5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerBuyerToGenerateOTPScreen.u2(this.a, view);
            }
        });
        b2().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.sx5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SellerBuyerToGenerateOTPScreen.v2(this.a, compoundButton, z);
            }
        });
        j2().x0().g(this, new mf4() { // from class: com.zepto.tx5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SellerBuyerToGenerateOTPScreen.w2(this.a, (String) obj);
            }
        });
        j2().y0().g(this, new mf4() { // from class: com.zepto.ax5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SellerBuyerToGenerateOTPScreen.x2(this.a, (String) obj);
            }
        });
        i2().h().g(this, new k(new j()));
        j2().d1().g(this, new k(new a()));
        j2().i1().g(this, new k(new b()));
        j2().j1().g(this, new k(new c()));
        i2().i().g(this, new k(new d()));
        i2().g().g(this, new k(new e()));
        E1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bx5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerBuyerToGenerateOTPScreen.m2(this.a, view);
            }
        });
        T1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cx5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerBuyerToGenerateOTPScreen.o2(this.a, view);
            }
        });
        Y1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kx5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerBuyerToGenerateOTPScreen.p2(this.a, view);
            }
        });
        j2().g1().g(this, new k(new g()));
        a2().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mx5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerBuyerToGenerateOTPScreen.q2(this.a, view);
            }
        });
        j2().e1().g(this, new k(new h()));
        j2().f1().g(this, new k(new i()));
        e2().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nx5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerBuyerToGenerateOTPScreen.r2(this.a, view);
            }
        });
    }

    public final void p3(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dx5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerBuyerToGenerateOTPScreen.q3(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, com.zepto.wa3] */
    public final void r3(final Context context, final String mobile_no, String developermess) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        Intrinsics.checkNotNullParameter(developermess, "developermess");
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.setContentView(R.layout.validateotp);
        }
        Dialog dialog2 = this.d;
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(false);
        }
        Dialog dialog3 = this.d;
        if (dialog3 != null) {
            dialog3.setCancelable(false);
        }
        Dialog dialog4 = this.d;
        Window window = dialog4 != null ? dialog4.getWindow() : null;
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Dialog dialog5 = this.d;
        ImageView imageView = dialog5 != null ? (ImageView) dialog5.findViewById(R.id.pop_up_close) : null;
        Intrinsics.checkNotNull(imageView, "null cannot be cast to non-null type android.widget.ImageView");
        Dialog dialog6 = this.d;
        TextView textView = dialog6 != null ? (TextView) dialog6.findViewById(R.id.resendOtp) : null;
        Intrinsics.checkNotNull(textView, "null cannot be cast to non-null type android.widget.TextView");
        Dialog dialog7 = this.d;
        final ImageView imageView2 = dialog7 != null ? (ImageView) dialog7.findViewById(R.id.showmpin) : null;
        Intrinsics.checkNotNull(imageView2, "null cannot be cast to non-null type android.widget.ImageView");
        Dialog dialog8 = this.d;
        TextView textView2 = dialog8 != null ? (TextView) dialog8.findViewById(R.id.submitOtp) : null;
        Intrinsics.checkNotNull(textView2, "null cannot be cast to non-null type android.widget.TextView");
        Dialog dialog9 = this.d;
        final EditText editText = dialog9 != null ? (EditText) dialog9.findViewById(R.id.enterOtp) : null;
        Intrinsics.checkNotNull(editText, "null cannot be cast to non-null type android.widget.EditText");
        Dialog dialog10 = this.d;
        TextView textView3 = dialog10 != null ? (TextView) dialog10.findViewById(R.id.time_text) : null;
        Intrinsics.checkNotNull(textView3, "null cannot be cast to non-null type android.widget.TextView");
        Dialog dialog11 = this.d;
        TextView textView4 = dialog11 != null ? (TextView) dialog11.findViewById(R.id.txt_reset) : null;
        Intrinsics.checkNotNull(textView4, "null cannot be cast to non-null type android.widget.TextView");
        Dialog dialog12 = this.d;
        TextView textView5 = dialog12 != null ? (TextView) dialog12.findViewById(R.id.disPlay_mobile) : null;
        Intrinsics.checkNotNull(textView5, "null cannot be cast to non-null type android.widget.TextView");
        Dialog dialog13 = this.d;
        TextView textView6 = dialog13 != null ? (TextView) dialog13.findViewById(R.id.enter_otp_txt) : null;
        Intrinsics.checkNotNull(textView6, "null cannot be cast to non-null type android.widget.TextView");
        Dialog dialog14 = this.d;
        TextView textView7 = dialog14 != null ? (TextView) dialog14.findViewById(R.id.disPlay) : null;
        Intrinsics.checkNotNull(textView7, "null cannot be cast to non-null type android.widget.TextView");
        Dialog dialog15 = this.d;
        Intrinsics.checkNotNull(dialog15 != null ? (TextView) dialog15.findViewById(R.id.otpdisplay) : null, "null cannot be cast to non-null type android.widget.TextView");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? wa3Var = new wa3(context);
        objectRef.element = wa3Var;
        ImageView imageView3 = imageView;
        textView6.setText(wa3Var.b("edit_enter_otp", context.getString(R.string.enter_otp)));
        textView7.setText(((wa3) objectRef.element).b("otp_verification", context.getString(R.string.otp_verification)));
        textView2.setText(((wa3) objectRef.element).b("vahan_btn_submit", context.getString(R.string.submit)));
        textView4.setText(((wa3) objectRef.element).b("btn_reset", context.getString(R.string.reset)));
        textView.setText(((wa3) objectRef.element).b("label_resend_otp", context.getString(R.string.resend_otp)));
        editText.setHint(((wa3) objectRef.element).b("edit_enter_otp", context.getString(R.string.enter_otp)));
        String strReplace = "";
        int i2 = 0;
        for (int length = mobile_no.length(); i2 < length; length = length) {
            mobile_no.charAt(i2);
            strReplace = new Regex("\\d(?=\\d{4})").replace(new Regex("[^0-9]").replace(mobile_no, ""), "X");
            i2++;
        }
        textView5.setText(((wa3) objectRef.element).b("label_otp_sent_to_mobile", context.getString(R.string.otp_sent)) + "\n+91 " + strReplace);
        new l(textView3, objectRef, context, textView).start();
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ex5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerBuyerToGenerateOTPScreen.s3(editText, imageView2, view);
            }
        });
        final TextView textView8 = textView3;
        final TextView textView9 = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fx5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerBuyerToGenerateOTPScreen.t3(this.a, textView8, objectRef, context, textView9, view);
            }
        });
        final EditText editText2 = editText;
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gx5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerBuyerToGenerateOTPScreen.u3(editText2, context, objectRef, this, mobile_no, view);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hx5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerBuyerToGenerateOTPScreen.v3(editText, view);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ix5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerBuyerToGenerateOTPScreen.w3(this.a, view);
            }
        });
        Dialog dialog16 = this.d;
        if (dialog16 != null) {
            dialog16.show();
        }
    }

    public final void z2(Context context, String message) {
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
        ((TextView) viewFindViewById).setText(X1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(X1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lx5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerBuyerToGenerateOTPScreen.A2(dialog, view);
            }
        });
        dialog.show();
    }
}
