package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.AadhaarVerification;

import android.app.Activity;
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
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.AadhaarVerification.ToGenerateOTPScreenForResult;
import com.nic.mparivahan.VahanServices.updateMobileNo.VahanUpdateMobileActivity;
import com.zepto.al7;
import com.zepto.bg7;
import com.zepto.bl7;
import com.zepto.gh;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.kk7;
import com.zepto.ld7;
import com.zepto.lk7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.s14;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.ws6;
import java.io.Serializable;
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
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u009f\u0002\u0010 \u0002J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0015J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u001a\u0010\f\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH\u0007J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00108\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u0010'\u001a\u0004\b6\u0010)\"\u0004\b7\u0010+R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010p\u001a\u00020i8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR>\u0010y\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0qj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n`r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR#\u0010\u0080\u0001\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR&\u0010\u0084\u0001\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010'\u001a\u0005\b\u0082\u0001\u0010)\"\u0005\b\u0083\u0001\u0010+R*\u0010\u008c\u0001\u001a\u00030\u0085\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R&\u0010\u0090\u0001\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010{\u001a\u0005\b\u008e\u0001\u0010}\"\u0005\b\u008f\u0001\u0010\u007fR&\u0010\u0094\u0001\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010'\u001a\u0005\b\u0092\u0001\u0010)\"\u0005\b\u0093\u0001\u0010+R*\u0010\u009c\u0001\u001a\u00030\u0095\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R*\u0010 \u0001\u001a\u00030\u0095\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u0097\u0001\u001a\u0006\b\u009e\u0001\u0010\u0099\u0001\"\u0006\b\u009f\u0001\u0010\u009b\u0001R&\u0010¤\u0001\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¡\u0001\u0010'\u001a\u0005\b¢\u0001\u0010)\"\u0005\b£\u0001\u0010+R*\u0010¬\u0001\u001a\u00030¥\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R*\u0010´\u0001\u001a\u00030\u00ad\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001R&\u0010¸\u0001\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bµ\u0001\u0010c\u001a\u0005\b¶\u0001\u0010e\"\u0005\b·\u0001\u0010gR&\u0010¼\u0001\u001a\u00020a8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¹\u0001\u0010c\u001a\u0005\bº\u0001\u0010e\"\u0005\b»\u0001\u0010gR*\u0010À\u0001\u001a\u00030\u0095\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b½\u0001\u0010\u0097\u0001\u001a\u0006\b¾\u0001\u0010\u0099\u0001\"\u0006\b¿\u0001\u0010\u009b\u0001R&\u0010Ä\u0001\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÁ\u0001\u0010'\u001a\u0005\bÂ\u0001\u0010)\"\u0005\bÃ\u0001\u0010+R&\u0010È\u0001\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÅ\u0001\u0010'\u001a\u0005\bÆ\u0001\u0010)\"\u0005\bÇ\u0001\u0010+R&\u0010Ì\u0001\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÉ\u0001\u0010'\u001a\u0005\bÊ\u0001\u0010)\"\u0005\bË\u0001\u0010+R&\u0010Ð\u0001\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÍ\u0001\u0010'\u001a\u0005\bÎ\u0001\u0010)\"\u0005\bÏ\u0001\u0010+R*\u0010Ø\u0001\u001a\u00030Ñ\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÒ\u0001\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001\"\u0006\bÖ\u0001\u0010×\u0001R*\u0010à\u0001\u001a\u00030Ù\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÚ\u0001\u0010Û\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001\"\u0006\bÞ\u0001\u0010ß\u0001R*\u0010è\u0001\u001a\u00030á\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bâ\u0001\u0010ã\u0001\u001a\u0006\bä\u0001\u0010å\u0001\"\u0006\bæ\u0001\u0010ç\u0001R&\u0010ì\u0001\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bé\u0001\u0010[\u001a\u0005\bê\u0001\u0010]\"\u0005\bë\u0001\u0010_R&\u0010ð\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bí\u0001\u0010{\u001a\u0005\bî\u0001\u0010}\"\u0005\bï\u0001\u0010\u007fR&\u0010ô\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bñ\u0001\u0010{\u001a\u0005\bò\u0001\u0010}\"\u0005\bó\u0001\u0010\u007fR&\u0010ø\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bõ\u0001\u0010{\u001a\u0005\bö\u0001\u0010}\"\u0005\b÷\u0001\u0010\u007fR*\u0010\u0080\u0002\u001a\u00030ù\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bú\u0001\u0010û\u0001\u001a\u0006\bü\u0001\u0010ý\u0001\"\u0006\bþ\u0001\u0010ÿ\u0001R*\u0010\u0088\u0002\u001a\u00030\u0081\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0082\u0002\u0010\u0083\u0002\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002\"\u0006\b\u0086\u0002\u0010\u0087\u0002R2\u0010\u0090\u0002\u001a\u000b\u0012\u0004\u0012\u00020\n\u0018\u00010\u0089\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008a\u0002\u0010\u008b\u0002\u001a\u0006\b\u008c\u0002\u0010\u008d\u0002\"\u0006\b\u008e\u0002\u0010\u008f\u0002R*\u0010\u0093\u0002\u001a\u00030\u0091\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0092\u0002\u0010®\u0001\u001a\u0006\b\u0093\u0002\u0010\u0094\u0002\"\u0006\b\u0095\u0002\u0010\u0096\u0002R&\u0010\u009a\u0002\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0097\u0002\u0010{\u001a\u0005\b\u0098\u0002\u0010}\"\u0005\b\u0099\u0002\u0010\u007fR&\u0010\u009e\u0002\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009b\u0002\u0010{\u001a\u0005\b\u009c\u0002\u0010}\"\u0005\b\u009d\u0002\u0010\u007f¨\u0006¡\u0002"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanTransferOwnerView/VahanTransferOfOwnership/AadhaarVerification/ToGenerateOTPScreenForResult;", "Lcom/zepto/pq;", "", "p2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "Landroid/content/Context;", "context", "", "message", "q2", "g3", "mobile_no", "i3", "C1", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "C", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "getBottom", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "w2", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V", "bottom", "Landroidx/appcompat/widget/AppCompatButton;", "D", "Landroidx/appcompat/widget/AppCompatButton;", "I1", "()Landroidx/appcompat/widget/AppCompatButton;", "B2", "(Landroidx/appcompat/widget/AppCompatButton;)V", "generateOtp", "E", "Q1", "N2", "reset", "Landroid/widget/TextView;", "F", "Landroid/widget/TextView;", "X1", "()Landroid/widget/TextView;", "X2", "(Landroid/widget/TextView;)V", "txtVehicleNumber", "Landroid/widget/CheckBox;", "G", "Landroid/widget/CheckBox;", "V1", "()Landroid/widget/CheckBox;", "V2", "(Landroid/widget/CheckBox;)V", "term_condition", "H", "G1", "y2", "edit_mobile_number", "Landroidx/appcompat/widget/AppCompatImageView;", "I", "Landroidx/appcompat/widget/AppCompatImageView;", "K1", "()Landroidx/appcompat/widget/AppCompatImageView;", "D2", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "mvvm_back", "Landroid/widget/RelativeLayout;", "J", "Landroid/widget/RelativeLayout;", "L1", "()Landroid/widget/RelativeLayout;", "E2", "(Landroid/widget/RelativeLayout;)V", "nexGenHolder", "Landroid/app/ProgressDialog;", "K", "Landroid/app/ProgressDialog;", "M1", "()Landroid/app/ProgressDialog;", "I2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/al7;", "L", "Lcom/zepto/al7;", "c2", "()Lcom/zepto/al7;", "e3", "(Lcom/zepto/al7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "M", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "R1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "O2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;)V", "retrofitService", "Lcom/nic/mparivahan/MyTextView;", "N", "Lcom/nic/mparivahan/MyTextView;", "E1", "()Lcom/nic/mparivahan/MyTextView;", "u2", "(Lcom/nic/mparivahan/MyTextView;)V", "agreeTermCond", "Lcom/zepto/ws6;", "O", "Lcom/zepto/ws6;", "getSession_manger", "()Lcom/zepto/ws6;", "R2", "(Lcom/zepto/ws6;)V", "session_manger", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "P", "Ljava/util/HashMap;", "getServiceSelection_HashMap", "()Ljava/util/HashMap;", "setServiceSelection_HashMap", "(Ljava/util/HashMap;)V", "serviceSelection_HashMap", "Q", "Ljava/lang/String;", "J1", "()Ljava/lang/String;", "C2", "(Ljava/lang/String;)V", "mobile_number", "R", "getSelectedServiceTv", "P2", "selectedServiceTv", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "S", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "O1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "L2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "T", "getOff_code", "G2", "off_code", "U", "getEnterMobileTv", "z2", "enterMobileTv", "Landroid/widget/LinearLayout;", "V", "Landroid/widget/LinearLayout;", "getTermCndLl", "()Landroid/widget/LinearLayout;", "U2", "(Landroid/widget/LinearLayout;)V", "termCndLl", "W", "getVerifyOtpLl", "b3", "verifyOtpLl", "X", "getDisPlay", "x2", "disPlay", "Landroid/widget/EditText;", "Y", "Landroid/widget/EditText;", "H1", "()Landroid/widget/EditText;", "A2", "(Landroid/widget/EditText;)V", "enterOtp", "Landroid/widget/ImageView;", "Z", "Landroid/widget/ImageView;", "T1", "()Landroid/widget/ImageView;", "S2", "(Landroid/widget/ImageView;)V", "shownPin", "a0", "W1", "W2", "time_text", "b0", "P1", "M2", "resendOtp", "c0", "getVerifyOtpBtn", "a3", "verifyOtpBtn", "d0", "U1", "T2", "submitOtp", "e0", "Y1", "Y2", "txt_reset", "f0", "Z1", "Z2", "update_mob", "g0", "getNote_text", "F2", "note_text", "Lcom/zepto/ld7;", "h0", "Lcom/zepto/ld7;", "getViewModelv1", "()Lcom/zepto/ld7;", "f3", "(Lcom/zepto/ld7;)V", "viewModelv1", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "i0", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "N1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "J2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "proservice", "Lcom/zepto/lk7;", "j0", "Lcom/zepto/lk7;", "b2", "()Lcom/zepto/lk7;", "d3", "(Lcom/zepto/lk7;)V", "verifyOtpViewModel", "k0", "a2", "c3", "verifyOtpRetrofitService", "l0", "getOtpId", "H2", "otpId", "m0", "getRcNo", "K2", "rcNo", "n0", "getRc_number", "setRc_number", "rc_number", "Lcom/zepto/gh;", "o0", "Lcom/zepto/gh;", "F1", "()Lcom/zepto/gh;", "v2", "(Lcom/zepto/gh;)V", "binding", "Lcom/zepto/wa3;", "p0", "Lcom/zepto/wa3;", "S1", "()Lcom/zepto/wa3;", "Q2", "(Lcom/zepto/wa3;)V", "session", "Ljava/util/ArrayList;", "q0", "Ljava/util/ArrayList;", "getMultiServiceList", "()Ljava/util/ArrayList;", "setMultiServiceList", "(Ljava/util/ArrayList;)V", "multiServiceList", "", "r0", "isFaceless", "()Z", "setFaceless", "(Z)V", "s0", "getAadhar_name", "t2", "aadhar_name", "t0", "getAadhar_address", "s2", "aadhar_address", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ToGenerateOTPScreenForResult extends pq {

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
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public TextView enterMobileTv;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public LinearLayout termCndLl;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public LinearLayout verifyOtpLl;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public TextView disPlay;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public EditText enterOtp;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public ImageView shownPin;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public MyTextView time_text;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public MyTextView resendOtp;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public LinearLayout verifyOtpBtn;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public TextView submitOtp;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public TextView txt_reset;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public TextView update_mob;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public TextView note_text;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public ld7 viewModelv1;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public VahanProService proservice;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public lk7 verifyOtpViewModel;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public VahanServiceConnection verifyOtpRetrofitService;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public gh binding;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public boolean isFaceless;

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    public String aadhar_name;

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    public String aadhar_address;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public HashMap serviceSelection_HashMap = new HashMap();

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public String otpId = "";

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public String rcNo = "";

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public String rc_number = "";

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public ArrayList multiServiceList = new ArrayList();

    public static final class a extends CountDownTimer {
        public a() {
            super(30000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            ToGenerateOTPScreenForResult.this.P1().setVisibility(0);
            ToGenerateOTPScreenForResult.this.W1().setText("0");
            ToGenerateOTPScreenForResult.this.W1().setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            ToGenerateOTPScreenForResult.this.W1().setText("Time remaining : " + (j / ((long) 1000)));
            ToGenerateOTPScreenForResult.this.P1().setVisibility(8);
            ToGenerateOTPScreenForResult.this.W1().setVisibility(0);
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
        public final void a(ResendOtp resendOtp) {
            try {
                if (StringsKt__StringsJVMKt.equals(resendOtp.getStatusCode(), "AL001", true)) {
                    ToGenerateOTPScreenForResult.this.M1().dismiss();
                    ToGenerateOTPScreenForResult toGenerateOTPScreenForResult = ToGenerateOTPScreenForResult.this;
                    toGenerateOTPScreenForResult.q2(toGenerateOTPScreenForResult, toGenerateOTPScreenForResult.S1().b("label_log_resend_otp", "We have resent the OTP Verification to your mobile number"));
                } else if (StringsKt__StringsJVMKt.equals(resendOtp.getStatusCode(), "AL002", true)) {
                    ToGenerateOTPScreenForResult toGenerateOTPScreenForResult2 = ToGenerateOTPScreenForResult.this;
                    toGenerateOTPScreenForResult2.q2(toGenerateOTPScreenForResult2, resendOtp.getStatusDesc());
                } else {
                    ToGenerateOTPScreenForResult.this.M1().dismiss();
                    ToGenerateOTPScreenForResult toGenerateOTPScreenForResult3 = ToGenerateOTPScreenForResult.this;
                    toGenerateOTPScreenForResult3.q2(toGenerateOTPScreenForResult3, resendOtp.getStatusDesc());
                }
            } catch (Exception unused) {
                ToGenerateOTPScreenForResult.this.M1().dismiss();
                ToGenerateOTPScreenForResult toGenerateOTPScreenForResult4 = ToGenerateOTPScreenForResult.this;
                toGenerateOTPScreenForResult4.q2(toGenerateOTPScreenForResult4, "Unable to Verify the OTP, Please try after some time");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ResendOtp) obj);
            return Unit.INSTANCE;
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
        public final void a(OtpVerifyResult otpVerifyResult) {
            try {
                if (StringsKt__StringsJVMKt.equals(otpVerifyResult.getStatusCode(), "AL001", true)) {
                    if (ToGenerateOTPScreenForResult.this.M1().isShowing()) {
                        ToGenerateOTPScreenForResult.this.M1().dismiss();
                    }
                    ToGenerateOTPScreenForResult toGenerateOTPScreenForResult = ToGenerateOTPScreenForResult.this;
                    toGenerateOTPScreenForResult.C1(toGenerateOTPScreenForResult, "Mobile No has been successfully verified");
                    return;
                }
                if (ToGenerateOTPScreenForResult.this.M1().isShowing()) {
                    ToGenerateOTPScreenForResult.this.M1().dismiss();
                }
                ToGenerateOTPScreenForResult toGenerateOTPScreenForResult2 = ToGenerateOTPScreenForResult.this;
                toGenerateOTPScreenForResult2.q2(toGenerateOTPScreenForResult2, otpVerifyResult.getStatusDesc());
            } catch (Exception e) {
                if (ToGenerateOTPScreenForResult.this.M1().isShowing()) {
                    ToGenerateOTPScreenForResult.this.M1().dismiss();
                }
                e.printStackTrace();
                ToGenerateOTPScreenForResult toGenerateOTPScreenForResult3 = ToGenerateOTPScreenForResult.this;
                toGenerateOTPScreenForResult3.q2(toGenerateOTPScreenForResult3, toGenerateOTPScreenForResult3.S1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OtpVerifyResult) obj);
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
            ToGenerateOTPScreenForResult.this.M1().dismiss();
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(GetCitizenDetails getCitizenDetails) {
            try {
                if (StringsKt__StringsJVMKt.equals(getCitizenDetails.getStatusCode(), "CTZN001", true)) {
                    ToGenerateOTPScreenForResult.this.c2().m(ToGenerateOTPScreenForResult.this, String.valueOf(getCitizenDetails.getMparCitizenUser().getCtzMobile()), String.valueOf(getCitizenDetails.getMparCitizenUser().getCtzRecordId()));
                } else if (StringsKt__StringsJVMKt.equals(getCitizenDetails.getStatusCode(), "CTZN099", true)) {
                    ToGenerateOTPScreenForResult.this.M1().dismiss();
                } else {
                    ToGenerateOTPScreenForResult.this.M1().dismiss();
                    Toast.makeText(ToGenerateOTPScreenForResult.this.getApplicationContext(), "Unable to send the OTP, Please try after some times!", 1).show();
                }
            } catch (Exception e) {
                e.printStackTrace();
                ToGenerateOTPScreenForResult.this.M1().dismiss();
                Toast.makeText(ToGenerateOTPScreenForResult.this.getApplicationContext(), "Unable to send the OTP, Please try after some times", 1).show();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetCitizenDetails) obj);
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
        public final void a(SendOtpResult sendOtpResult) {
            try {
                ToGenerateOTPScreenForResult.this.M1().dismiss();
                if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL001", true)) {
                    ToGenerateOTPScreenForResult toGenerateOTPScreenForResult = ToGenerateOTPScreenForResult.this;
                    toGenerateOTPScreenForResult.i3(toGenerateOTPScreenForResult, toGenerateOTPScreenForResult.G1().getText().toString());
                    ToGenerateOTPScreenForResult.this.H2(String.valueOf(sendOtpResult.getRecordId()));
                    ToGenerateOTPScreenForResult toGenerateOTPScreenForResult2 = ToGenerateOTPScreenForResult.this;
                    toGenerateOTPScreenForResult2.K2(toGenerateOTPScreenForResult2.X1().getText().toString());
                } else if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL022", true) || StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL014", true)) {
                    Toast.makeText(ToGenerateOTPScreenForResult.this.getApplicationContext(), sendOtpResult.getStatusDesc().toString(), 1).show();
                } else if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL099", true)) {
                    Toast.makeText(ToGenerateOTPScreenForResult.this.getApplicationContext(), "Unable to send the OTP, Please try after some times!", 1).show();
                } else {
                    Toast.makeText(ToGenerateOTPScreenForResult.this.getApplicationContext(), "Unable to send the OTP, Please try after some times!", 1).show();
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(ToGenerateOTPScreenForResult.this.getApplicationContext(), "Unable to send the OTP, Please try after some times", 1).show();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SendOtpResult) obj);
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
            ToGenerateOTPScreenForResult toGenerateOTPScreenForResult = ToGenerateOTPScreenForResult.this;
            toGenerateOTPScreenForResult.g3(toGenerateOTPScreenForResult, toGenerateOTPScreenForResult.getString(R.string.service_unavable_please_try));
        }
    }

    public static final class h implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public h(Function1 function) {
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

    public static final class i extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ TextView d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(TextView textView, Ref.ObjectRef objectRef, Context context, TextView textView2) {
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

    public static final class j extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ TextView d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(TextView textView, Ref.ObjectRef objectRef, Context context, TextView textView2) {
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

    public static final void D1(Dialog d2, ToGenerateOTPScreenForResult this$0, Context context, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        d2.dismiss();
        Intent intentPutExtra = new Intent().putExtra("MESSAGE_CONTRACT", "AL001");
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        this$0.setResult(-1, intentPutExtra);
        ((Activity) context).finish();
    }

    public static final void d2(ToGenerateOTPScreenForResult this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void e2(ToGenerateOTPScreenForResult this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.p2();
    }

    public static final void f2(ToGenerateOTPScreenForResult this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.H1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            this$0.T1().setImageResource(R.drawable.pass_visible);
            this$0.H1().setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            this$0.T1().setImageResource(R.drawable.mvvm_visibility);
            this$0.H1().setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public static final void g2(ToGenerateOTPScreenForResult this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.H1().getText().toString();
        if (string.length() == 0) {
            this$0.q2(this$0, this$0.S1().b("label_log_entr_otp", "Please enter the OTP"));
            return;
        }
        if (string.length() < 6) {
            this$0.q2(this$0, this$0.S1().b("label_log_entr_otp", "Please enter the valid OTP"));
            return;
        }
        if (this$0.M1().isShowing()) {
            this$0.M1().dismiss();
        }
        this$0.M1().show();
        this$0.b2().l(this$0, string, this$0.otpId);
    }

    public static final void h2(ToGenerateOTPScreenForResult this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.H1().setText("");
    }

    public static final void h3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void i2(ToGenerateOTPScreenForResult this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = StringsKt__StringsKt.trim((CharSequence) this$0.G1().getText().toString()).toString();
        if (string.length() < 10) {
            Toast.makeText(this$0, "Invalid mobile number", 0).show();
            return;
        }
        this$0.M1().show();
        this$0.c2().m(this$0, string, new ws6(this$0).k());
    }

    public static final void j2(ToGenerateOTPScreenForResult this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.V1().isChecked()) {
            this$0.V1().setChecked(false);
        }
    }

    public static final void j3(EditText enterOtp, ImageView shownPin, View view) {
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

    public static final void k2(ToGenerateOTPScreenForResult this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) VahanUpdateMobileActivity.class));
        this$0.finish();
    }

    public static final void k3(ToGenerateOTPScreenForResult this$0, TextView time_text, Ref.ObjectRef langSession, Context context, TextView resendOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(time_text, "$time_text");
        Intrinsics.checkNotNullParameter(langSession, "$langSession");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(resendOtp, "$resendOtp");
        this$0.M1().show();
        new j(time_text, langSession, context, resendOtp).start();
        this$0.b2().j(this$0, this$0.otpId);
    }

    public static final void l2(ToGenerateOTPScreenForResult this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.I1().setEnabled(true);
            this$0.I1().setAlpha(1.0f);
        } else {
            if (z) {
                return;
            }
            this$0.I1().setEnabled(false);
            this$0.I1().setAlpha(0.5f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void l3(EditText enterOtp, Context context, Ref.ObjectRef langSession, ToGenerateOTPScreenForResult this$0, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(langSession, "$langSession");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = enterOtp.getText().toString();
        if (string.length() == 0) {
            Toast.makeText(context, ((wa3) langSession.element).b("label_log_entr_otp", context.getString(R.string.pls_enter_otp)), 0).show();
            return;
        }
        if (string.length() < 6) {
            Toast.makeText(context, ((wa3) langSession.element).b("label_log_entr_val_otp", "Please enter the valid OTP"), 0).show();
            return;
        }
        if (this$0.M1().isShowing()) {
            this$0.M1().dismiss();
        }
        this$0.M1().show();
        this$0.b2().l(this$0, string, this$0.otpId);
    }

    public static final void m2(ToGenerateOTPScreenForResult this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        final Dialog dialog = new Dialog(this$0);
        dialog.setContentView(R.layout.term_cond_dialog);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        String str = s14.a.g() + this$0.S1().d() + "/mparivahan-info-terms-of-use.html";
        View viewFindViewById = dialog.findViewById(R.id.cancelIv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = dialog.findViewById(R.id.termConditionWv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ((ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.oh6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ToGenerateOTPScreenForResult.n2(dialog, view2);
            }
        });
        ((WebView) viewFindViewById2).loadUrl(str);
        dialog.show();
    }

    public static final void m3(EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        enterOtp.setText("");
    }

    public static final void n2(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    public static final void n3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void o2(ToGenerateOTPScreenForResult this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.M1().show();
        this$0.new a().start();
        this$0.b2().j(this$0, this$0.otpId);
    }

    private final void p2() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public final void A2(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.enterOtp = editText;
    }

    public final void B2(AppCompatButton appCompatButton) {
        Intrinsics.checkNotNullParameter(appCompatButton, "<set-?>");
        this.generateOtp = appCompatButton;
    }

    public final void C1(final Context context, String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uh6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToGenerateOTPScreenForResult.D1(dialog, this, context, view);
            }
        });
        dialog.show();
    }

    public final void C2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobile_number = str;
    }

    public final void D2(AppCompatImageView appCompatImageView) {
        Intrinsics.checkNotNullParameter(appCompatImageView, "<set-?>");
        this.mvvm_back = appCompatImageView;
    }

    public final MyTextView E1() {
        MyTextView myTextView = this.agreeTermCond;
        if (myTextView != null) {
            return myTextView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("agreeTermCond");
        return null;
    }

    public final void E2(RelativeLayout relativeLayout) {
        Intrinsics.checkNotNullParameter(relativeLayout, "<set-?>");
        this.nexGenHolder = relativeLayout;
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
        this.note_text = textView;
    }

    public final TextView G1() {
        TextView textView = this.edit_mobile_number;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("edit_mobile_number");
        return null;
    }

    public final void G2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final EditText H1() {
        EditText editText = this.enterOtp;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("enterOtp");
        return null;
    }

    public final void H2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.otpId = str;
    }

    public final AppCompatButton I1() {
        AppCompatButton appCompatButton = this.generateOtp;
        if (appCompatButton != null) {
            return appCompatButton;
        }
        Intrinsics.throwUninitializedPropertyAccessException("generateOtp");
        return null;
    }

    public final void I2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final String J1() {
        String str = this.mobile_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mobile_number");
        return null;
    }

    public final void J2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.proservice = vahanProService;
    }

    public final AppCompatImageView K1() {
        AppCompatImageView appCompatImageView = this.mvvm_back;
        if (appCompatImageView != null) {
            return appCompatImageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mvvm_back");
        return null;
    }

    public final void K2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rcNo = str;
    }

    public final RelativeLayout L1() {
        RelativeLayout relativeLayout = this.nexGenHolder;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nexGenHolder");
        return null;
    }

    public final void L2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final ProgressDialog M1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final void M2(MyTextView myTextView) {
        Intrinsics.checkNotNullParameter(myTextView, "<set-?>");
        this.resendOtp = myTextView;
    }

    public final VahanProService N1() {
        VahanProService vahanProService = this.proservice;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("proservice");
        return null;
    }

    public final void N2(AppCompatButton appCompatButton) {
        Intrinsics.checkNotNullParameter(appCompatButton, "<set-?>");
        this.reset = appCompatButton;
    }

    public final NrvDetails O1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final void O2(VahanServiceConnection vahanServiceConnection) {
        Intrinsics.checkNotNullParameter(vahanServiceConnection, "<set-?>");
        this.retrofitService = vahanServiceConnection;
    }

    public final MyTextView P1() {
        MyTextView myTextView = this.resendOtp;
        if (myTextView != null) {
            return myTextView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("resendOtp");
        return null;
    }

    public final void P2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.selectedServiceTv = textView;
    }

    public final AppCompatButton Q1() {
        AppCompatButton appCompatButton = this.reset;
        if (appCompatButton != null) {
            return appCompatButton;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reset");
        return null;
    }

    public final void Q2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final VahanServiceConnection R1() {
        VahanServiceConnection vahanServiceConnection = this.retrofitService;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final void R2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.session_manger = ws6Var;
    }

    public final wa3 S1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final void S2(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.shownPin = imageView;
    }

    public final ImageView T1() {
        ImageView imageView = this.shownPin;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shownPin");
        return null;
    }

    public final void T2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.submitOtp = textView;
    }

    public final TextView U1() {
        TextView textView = this.submitOtp;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("submitOtp");
        return null;
    }

    public final void U2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.termCndLl = linearLayout;
    }

    public final CheckBox V1() {
        CheckBox checkBox = this.term_condition;
        if (checkBox != null) {
            return checkBox;
        }
        Intrinsics.throwUninitializedPropertyAccessException("term_condition");
        return null;
    }

    public final void V2(CheckBox checkBox) {
        Intrinsics.checkNotNullParameter(checkBox, "<set-?>");
        this.term_condition = checkBox;
    }

    public final MyTextView W1() {
        MyTextView myTextView = this.time_text;
        if (myTextView != null) {
            return myTextView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("time_text");
        return null;
    }

    public final void W2(MyTextView myTextView) {
        Intrinsics.checkNotNullParameter(myTextView, "<set-?>");
        this.time_text = myTextView;
    }

    public final TextView X1() {
        TextView textView = this.txtVehicleNumber;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtVehicleNumber");
        return null;
    }

    public final void X2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtVehicleNumber = textView;
    }

    public final TextView Y1() {
        TextView textView = this.txt_reset;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txt_reset");
        return null;
    }

    public final void Y2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txt_reset = textView;
    }

    public final TextView Z1() {
        TextView textView = this.update_mob;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("update_mob");
        return null;
    }

    public final void Z2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.update_mob = textView;
    }

    public final VahanServiceConnection a2() {
        VahanServiceConnection vahanServiceConnection = this.verifyOtpRetrofitService;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("verifyOtpRetrofitService");
        return null;
    }

    public final void a3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.verifyOtpBtn = linearLayout;
    }

    public final lk7 b2() {
        lk7 lk7Var = this.verifyOtpViewModel;
        if (lk7Var != null) {
            return lk7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("verifyOtpViewModel");
        return null;
    }

    public final void b3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.verifyOtpLl = linearLayout;
    }

    public final al7 c2() {
        al7 al7Var = this.viewModel;
        if (al7Var != null) {
            return al7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void c3(VahanServiceConnection vahanServiceConnection) {
        Intrinsics.checkNotNullParameter(vahanServiceConnection, "<set-?>");
        this.verifyOtpRetrofitService = vahanServiceConnection;
    }

    public final void d3(lk7 lk7Var) {
        Intrinsics.checkNotNullParameter(lk7Var, "<set-?>");
        this.verifyOtpViewModel = lk7Var;
    }

    public final void e3(al7 al7Var) {
        Intrinsics.checkNotNullParameter(al7Var, "<set-?>");
        this.viewModel = al7Var;
    }

    public final void f3(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModelv1 = ld7Var;
    }

    public final void g3(Context context, String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mh6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToGenerateOTPScreenForResult.h3(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, com.zepto.wa3] */
    public final void i3(final Context context, String mobile_no) {
        String mobile_no2 = mobile_no;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mobile_no2, "mobile_no");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.validateotp);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewFindViewById;
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
        TextView textView4 = (TextView) viewFindViewById7;
        View viewFindViewById8 = dialog.findViewById(R.id.disPlay_mobile);
        Intrinsics.checkNotNull(viewFindViewById8, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView5 = (TextView) viewFindViewById8;
        View viewFindViewById9 = dialog.findViewById(R.id.enter_otp_txt);
        Intrinsics.checkNotNull(viewFindViewById9, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById10 = dialog.findViewById(R.id.disPlay);
        Intrinsics.checkNotNull(viewFindViewById10, "null cannot be cast to non-null type android.widget.TextView");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? wa3Var = new wa3(context);
        objectRef.element = wa3Var;
        ((TextView) viewFindViewById9).setText(wa3Var.b("edit_enter_otp", context.getString(R.string.enter_otp)));
        ((TextView) viewFindViewById10).setText(((wa3) objectRef.element).b("otp_verification", context.getString(R.string.otp_verification)));
        textView2.setText(((wa3) objectRef.element).b("vahan_btn_submit", context.getString(R.string.submit)));
        textView4.setText(((wa3) objectRef.element).b("btn_reset", context.getString(R.string.reset)));
        textView.setText(((wa3) objectRef.element).b("label_resend_otp", context.getString(R.string.resend_otp)));
        editText.setHint(((wa3) objectRef.element).b("edit_enter_otp", context.getString(R.string.enter_otp)));
        int length = mobile_no.length();
        String strReplace = "";
        int i2 = 0;
        while (i2 < length) {
            mobile_no2.charAt(i2);
            strReplace = new Regex("\\d(?=\\d{4})").replace(new Regex("[^0-9]").replace(mobile_no2, ""), "X");
            i2++;
            mobile_no2 = mobile_no;
        }
        textView5.setText(((wa3) objectRef.element).b("label_otp_sent_to_mobile", context.getString(R.string.otp_sent)) + "\n+91 " + strReplace);
        new i(textView3, objectRef, context, textView).start();
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ph6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToGenerateOTPScreenForResult.j3(editText, imageView2, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qh6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToGenerateOTPScreenForResult.k3(this.a, textView3, objectRef, context, textView, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rh6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToGenerateOTPScreenForResult.l3(editText, context, objectRef, this, view);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sh6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToGenerateOTPScreenForResult.m3(editText, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.th6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToGenerateOTPScreenForResult.n3(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        if (M1().isShowing()) {
            M1().dismiss();
        }
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vahan_generate_o_t_p_screen);
        gh ghVarC = gh.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ghVarC, "inflate(...)");
        v2(ghVarC);
        setContentView(F1().b());
        getWindow().addFlags(128);
        Q2(new wa3(this));
        View viewFindViewById = findViewById(R.id.bottom);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        w2((CoordinatorLayout) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.generate_otp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        B2((AppCompatButton) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.reset_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        N2((AppCompatButton) viewFindViewById3);
        ta3.a.M2(this, F1(), Q1(), I1());
        View viewFindViewById4 = findViewById(R.id.txt_vehicle_number);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        X2((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.term_condition);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        V2((CheckBox) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.edit_mobile_number);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        y2((TextView) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.mvvm_back);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        D2((AppCompatImageView) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.nexGenHolder);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        E2((RelativeLayout) viewFindViewById8);
        View viewFindViewById9 = findViewById(R.id.agreeTermCond);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        u2((MyTextView) viewFindViewById9);
        View viewFindViewById10 = findViewById(R.id.selectedServiceTv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        P2((TextView) viewFindViewById10);
        View viewFindViewById11 = findViewById(R.id.note_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        F2((TextView) viewFindViewById11);
        J2(VahanProService.INSTANCE.a(this));
        f3((ld7) new z(this, new kd7(new jd7(N1()))).a(ld7.class));
        VahanServiceConnection.Companion companion = VahanServiceConnection.INSTANCE;
        O2(companion.a(this));
        O2(companion.a(this));
        c3(companion.a(this));
        View viewFindViewById12 = findViewById(R.id.enterMobileTv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        z2((TextView) viewFindViewById12);
        View viewFindViewById13 = findViewById(R.id.termCndLl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        U2((LinearLayout) viewFindViewById13);
        View viewFindViewById14 = findViewById(R.id.verifyOtpLl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        b3((LinearLayout) viewFindViewById14);
        View viewFindViewById15 = findViewById(R.id.disPlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
        x2((TextView) viewFindViewById15);
        View viewFindViewById16 = findViewById(R.id.enterOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "findViewById(...)");
        A2((EditText) viewFindViewById16);
        View viewFindViewById17 = findViewById(R.id.showmpin);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById17, "findViewById(...)");
        S2((ImageView) viewFindViewById17);
        View viewFindViewById18 = findViewById(R.id.time_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById18, "findViewById(...)");
        W2((MyTextView) viewFindViewById18);
        View viewFindViewById19 = findViewById(R.id.resendOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById19, "findViewById(...)");
        M2((MyTextView) viewFindViewById19);
        View viewFindViewById20 = findViewById(R.id.verifyOtpBtn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById20, "findViewById(...)");
        a3((LinearLayout) viewFindViewById20);
        View viewFindViewById21 = findViewById(R.id.submitOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById21, "findViewById(...)");
        T2((TextView) viewFindViewById21);
        View viewFindViewById22 = findViewById(R.id.txt_reset);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById22, "findViewById(...)");
        Y2((TextView) viewFindViewById22);
        View viewFindViewById23 = findViewById(R.id.update_mob);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById23, "findViewById(...)");
        Z2((TextView) viewFindViewById23);
        I1().setEnabled(false);
        I1().setAlpha(0.5f);
        I2(new ProgressDialog(this));
        M1().setMessage("Please wait...");
        M1().setCancelable(false);
        M1().setCanceledOnTouchOutside(false);
        R2(new ws6(this));
        Z1().setVisibility(8);
        d3((lk7) new z(this, new kk7(new bg7(a2()))).a(lk7.class));
        e3((al7) new z(this, new bl7(new bg7(R1()))).a(al7.class));
        G2(String.valueOf(getIntent().getStringExtra("off_code")));
        t2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        s2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        L2((NrvDetails) serializableExtra);
        this.isFaceless = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        C2(String.valueOf(getIntent().getStringExtra("MobNo")));
        try {
            F1().p.i.setText(String.valueOf(getIntent().getStringExtra("ServiceName")));
            F1().e.setText("New Owner(Buyer) Mobile No.");
        } catch (Exception unused) {
            F1().p.i.setText(new wa3(this).b("toSellerBuyer", getString(R.string.vahan_transfer_of_ownership)));
        }
        this.rc_number = String.valueOf(O1().getRc_regn_no());
        String strJ1 = J1();
        if (strJ1 == null || strJ1.length() == 0 || StringsKt__StringsJVMKt.equals(J1(), "null", true)) {
            G1().setText("NA");
        } else {
            G1().setText(J1());
        }
        String str = this.rc_number;
        if (str != null && str.length() != 0) {
            X1().setText(this.rc_number.toString());
        }
        K1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kh6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToGenerateOTPScreenForResult.d2(this.a, view);
            }
        });
        L1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wh6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToGenerateOTPScreenForResult.e2(this.a, view);
            }
        });
        I1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xh6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToGenerateOTPScreenForResult.i2(this.a, view);
            }
        });
        Q1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yh6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToGenerateOTPScreenForResult.j2(this.a, view);
            }
        });
        Z1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zh6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToGenerateOTPScreenForResult.k2(this.a, view);
            }
        });
        V1().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.ai6
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ToGenerateOTPScreenForResult.l2(this.a, compoundButton, z);
            }
        });
        c2().h().g(this, new h(new e()));
        c2().i().g(this, new h(new f()));
        c2().g().g(this, new h(new g()));
        E1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bi6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToGenerateOTPScreenForResult.m2(this.a, view);
            }
        });
        P1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ci6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToGenerateOTPScreenForResult.o2(this.a, view);
            }
        });
        T1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.di6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToGenerateOTPScreenForResult.f2(this.a, view);
            }
        });
        b2().i().g(this, new h(new b()));
        U1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lh6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToGenerateOTPScreenForResult.g2(this.a, view);
            }
        });
        b2().k().g(this, new h(new c()));
        b2().g().g(this, new h(new d()));
        Y1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vh6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToGenerateOTPScreenForResult.h2(this.a, view);
            }
        });
    }

    public final void q2(Context context, String message) {
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
        ((TextView) viewFindViewById).setText(S1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(S1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nh6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToGenerateOTPScreenForResult.r2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void s2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_address = str;
    }

    public final void t2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aadhar_name = str;
    }

    public final void u2(MyTextView myTextView) {
        Intrinsics.checkNotNullParameter(myTextView, "<set-?>");
        this.agreeTermCond = myTextView;
    }

    public final void v2(gh ghVar) {
        Intrinsics.checkNotNullParameter(ghVar, "<set-?>");
        this.binding = ghVar;
    }

    public final void w2(CoordinatorLayout coordinatorLayout) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "<set-?>");
        this.bottom = coordinatorLayout;
    }

    public final void x2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.disPlay = textView;
    }

    public final void y2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.edit_mobile_number = textView;
    }

    public final void z2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.enterMobileTv = textView;
    }
}
