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
import com.nic.mparivahan.Tax.PayTaxActivity;
import com.nic.mparivahan.VahanServices.AlterationOfVehicle.VahanAlterationOfVehicle;
import com.nic.mparivahan.VahanServices.CompoundingFee.CompoundingFeeActivity;
import com.nic.mparivahan.VahanServices.MiscellaneousFeePayment.MiscellaneousFeePayment;
import com.nic.mparivahan.VahanServices.Nominee.NomineeActivity;
import com.nic.mparivahan.VahanServices.RenewalOfNpAuthorizationPermit.RenewalOfNPAuthorizationPermit;
import com.nic.mparivahan.VahanServices.RenewalOfPermit.RenewalOfPermitMainScreen;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiSelectionScreen;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationAdditionActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationContinuationActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.HypothecationTerminationActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.RCReleaseActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.TemporaryPermitActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanDuplicateFitnessActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanDuplicatePermitActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanDuplicateRcActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanNocActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanRcCancellationActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanRcSurrenderActivity;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.VahanTransferOfOwnerShipActivity;
import com.nic.mparivahan.VahanServices.VahanView.VahanGenerateOTPScreen;
import com.nic.mparivahan.VahanServices.updateMobileNo.UpdateMobileNumber.VahanUpdateMobiActivity;
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
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u008b\u0002\u0010\u008c\u0002J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0015J\u001c\u0010\n\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\bJ:\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\b2\"\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`\u00102\u0006\u0010\u0012\u001a\u00020\u0011J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\bH\u0007R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010*\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010>\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010-\u001a\u0004\b<\u0010/\"\u0004\b=\u00101R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010^\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010f\u001a\u00020_8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010n\u001a\u00020g8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010v\u001a\u00020o8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR>\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R&\u0010\u0083\u0001\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R&\u0010\u0087\u0001\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010-\u001a\u0005\b\u0085\u0001\u0010/\"\u0005\b\u0086\u0001\u00101R*\u0010\u008f\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R(\u0010\u0093\u0001\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0090\u0001\u0010~\u001a\u0006\b\u0091\u0001\u0010\u0080\u0001\"\u0006\b\u0092\u0001\u0010\u0082\u0001R&\u0010\u0097\u0001\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0094\u0001\u0010-\u001a\u0005\b\u0095\u0001\u0010/\"\u0005\b\u0096\u0001\u00101R*\u0010\u009f\u0001\u001a\u00030\u0098\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R*\u0010£\u0001\u001a\u00030\u0098\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b \u0001\u0010\u009a\u0001\u001a\u0006\b¡\u0001\u0010\u009c\u0001\"\u0006\b¢\u0001\u0010\u009e\u0001R&\u0010§\u0001\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¤\u0001\u0010-\u001a\u0005\b¥\u0001\u0010/\"\u0005\b¦\u0001\u00101R*\u0010¯\u0001\u001a\u00030¨\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R*\u0010·\u0001\u001a\u00030°\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001R&\u0010»\u0001\u001a\u00020g8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¸\u0001\u0010i\u001a\u0005\b¹\u0001\u0010k\"\u0005\bº\u0001\u0010mR&\u0010¿\u0001\u001a\u00020g8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¼\u0001\u0010i\u001a\u0005\b½\u0001\u0010k\"\u0005\b¾\u0001\u0010mR*\u0010Ã\u0001\u001a\u00030\u0098\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÀ\u0001\u0010\u009a\u0001\u001a\u0006\bÁ\u0001\u0010\u009c\u0001\"\u0006\bÂ\u0001\u0010\u009e\u0001R&\u0010Ç\u0001\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÄ\u0001\u0010-\u001a\u0005\bÅ\u0001\u0010/\"\u0005\bÆ\u0001\u00101R&\u0010Ë\u0001\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÈ\u0001\u0010-\u001a\u0005\bÉ\u0001\u0010/\"\u0005\bÊ\u0001\u00101R&\u0010Ï\u0001\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÌ\u0001\u0010-\u001a\u0005\bÍ\u0001\u0010/\"\u0005\bÎ\u0001\u00101R&\u0010Ó\u0001\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÐ\u0001\u0010-\u001a\u0005\bÑ\u0001\u0010/\"\u0005\bÒ\u0001\u00101R*\u0010Û\u0001\u001a\u00030Ô\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÕ\u0001\u0010Ö\u0001\u001a\u0006\b×\u0001\u0010Ø\u0001\"\u0006\bÙ\u0001\u0010Ú\u0001R*\u0010ã\u0001\u001a\u00030Ü\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÝ\u0001\u0010Þ\u0001\u001a\u0006\bß\u0001\u0010à\u0001\"\u0006\bá\u0001\u0010â\u0001R*\u0010ë\u0001\u001a\u00030ä\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bå\u0001\u0010æ\u0001\u001a\u0006\bç\u0001\u0010è\u0001\"\u0006\bé\u0001\u0010ê\u0001R&\u0010ï\u0001\u001a\u00020_8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bì\u0001\u0010a\u001a\u0005\bí\u0001\u0010c\"\u0005\bî\u0001\u0010eR(\u0010ó\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bð\u0001\u0010~\u001a\u0006\bñ\u0001\u0010\u0080\u0001\"\u0006\bò\u0001\u0010\u0082\u0001R(\u0010÷\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bô\u0001\u0010~\u001a\u0006\bõ\u0001\u0010\u0080\u0001\"\u0006\bö\u0001\u0010\u0082\u0001R'\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bø\u0001\u0010~\u001a\u0006\bù\u0001\u0010\u0080\u0001\"\u0006\bú\u0001\u0010\u0082\u0001R*\u0010\u0082\u0002\u001a\u00030û\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bü\u0001\u0010ý\u0001\u001a\u0006\bþ\u0001\u0010ÿ\u0001\"\u0006\b\u0080\u0002\u0010\u0081\u0002R*\u0010\u008a\u0002\u001a\u00030\u0083\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0084\u0002\u0010\u0085\u0002\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002\"\u0006\b\u0088\u0002\u0010\u0089\u0002¨\u0006\u008d\u0002"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanView/VahanGenerateOTPScreen;", "Lcom/zepto/pq;", "", "q2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Ljava/util/HashMap;", "", "serviceSelection_HashMap", "B1", "Landroid/content/Context;", "context", "message", "r2", "rc_number", "Lkotlin/collections/HashMap;", "", "isFaceless", "t2", "g3", "mobile_no", "i3", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "C", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "getBottom", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "w2", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V", "bottom", "Landroidx/appcompat/widget/AppCompatButton;", "D", "Landroidx/appcompat/widget/AppCompatButton;", "G1", "()Landroidx/appcompat/widget/AppCompatButton;", "B2", "(Landroidx/appcompat/widget/AppCompatButton;)V", "generateOtp", "E", "Q1", "N2", "reset", "Landroid/widget/TextView;", "F", "Landroid/widget/TextView;", "Y1", "()Landroid/widget/TextView;", "X2", "(Landroid/widget/TextView;)V", "txtVehicleNumber", "Landroid/widget/CheckBox;", "G", "Landroid/widget/CheckBox;", "W1", "()Landroid/widget/CheckBox;", "V2", "(Landroid/widget/CheckBox;)V", "term_condition", "H", "E1", "y2", "edit_mobile_number", "Landroidx/appcompat/widget/AppCompatImageView;", "I", "Landroidx/appcompat/widget/AppCompatImageView;", "I1", "()Landroidx/appcompat/widget/AppCompatImageView;", "D2", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "mvvm_back", "Landroid/widget/RelativeLayout;", "J", "Landroid/widget/RelativeLayout;", "J1", "()Landroid/widget/RelativeLayout;", "E2", "(Landroid/widget/RelativeLayout;)V", "nexGenHolder", "Landroid/app/ProgressDialog;", "K", "Landroid/app/ProgressDialog;", "L1", "()Landroid/app/ProgressDialog;", "I2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/al7;", "L", "Lcom/zepto/al7;", "d2", "()Lcom/zepto/al7;", "e3", "(Lcom/zepto/al7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "M", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "R1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "O2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;)V", "retrofitService", "Lcom/nic/mparivahan/MyTextView;", "N", "Lcom/nic/mparivahan/MyTextView;", "C1", "()Lcom/nic/mparivahan/MyTextView;", "u2", "(Lcom/nic/mparivahan/MyTextView;)V", "agreeTermCond", "Lcom/zepto/ws6;", "O", "Lcom/zepto/ws6;", "getSession_manger", "()Lcom/zepto/ws6;", "R2", "(Lcom/zepto/ws6;)V", "session_manger", "P", "Ljava/util/HashMap;", "S1", "()Ljava/util/HashMap;", "setServiceSelection_HashMap", "(Ljava/util/HashMap;)V", "Q", "Ljava/lang/String;", "H1", "()Ljava/lang/String;", "C2", "(Ljava/lang/String;)V", "mobile_number", "R", "getSelectedServiceTv", "P2", "selectedServiceTv", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "S", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "O1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "L2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "rcdetails", "T", "K1", "G2", "off_code", "U", "getEnterMobileTv", "z2", "enterMobileTv", "Landroid/widget/LinearLayout;", "V", "Landroid/widget/LinearLayout;", "getTermCndLl", "()Landroid/widget/LinearLayout;", "U2", "(Landroid/widget/LinearLayout;)V", "termCndLl", "W", "getVerifyOtpLl", "b3", "verifyOtpLl", "X", "getDisPlay", "x2", "disPlay", "Landroid/widget/EditText;", "Y", "Landroid/widget/EditText;", "F1", "()Landroid/widget/EditText;", "A2", "(Landroid/widget/EditText;)V", "enterOtp", "Landroid/widget/ImageView;", "Z", "Landroid/widget/ImageView;", "U1", "()Landroid/widget/ImageView;", "S2", "(Landroid/widget/ImageView;)V", "shownPin", "a0", "X1", "W2", "time_text", "b0", "P1", "M2", "resendOtp", "c0", "getVerifyOtpBtn", "a3", "verifyOtpBtn", "d0", "V1", "T2", "submitOtp", "e0", "Z1", "Y2", "txt_reset", "f0", "a2", "Z2", "update_mob", "g0", "getNote_text", "F2", "note_text", "Lcom/zepto/ld7;", "h0", "Lcom/zepto/ld7;", "getViewModelv1", "()Lcom/zepto/ld7;", "f3", "(Lcom/zepto/ld7;)V", "viewModelv1", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "i0", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "M1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "J2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "proservice", "Lcom/zepto/lk7;", "j0", "Lcom/zepto/lk7;", "c2", "()Lcom/zepto/lk7;", "d3", "(Lcom/zepto/lk7;)V", "verifyOtpViewModel", "k0", "b2", "c3", "verifyOtpRetrofitService", "l0", "getOtpId", "H2", "otpId", "m0", "N1", "K2", "rcNo", "n0", "getRc_number", "setRc_number", "Lcom/zepto/gh;", "o0", "Lcom/zepto/gh;", "D1", "()Lcom/zepto/gh;", "v2", "(Lcom/zepto/gh;)V", "binding", "Lcom/zepto/wa3;", "p0", "Lcom/zepto/wa3;", "T1", "()Lcom/zepto/wa3;", "Q2", "(Lcom/zepto/wa3;)V", "session", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanGenerateOTPScreen extends pq {

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

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public HashMap serviceSelection_HashMap = new HashMap();

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public String otpId = "";

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public String rcNo = "";

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public String rc_number = "";

    public static final class a extends CountDownTimer {
        public a() {
            super(30000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            VahanGenerateOTPScreen.this.P1().setVisibility(0);
            VahanGenerateOTPScreen.this.X1().setText("0");
            VahanGenerateOTPScreen.this.X1().setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            VahanGenerateOTPScreen.this.X1().setText("Time remaining : " + (j / ((long) 1000)));
            VahanGenerateOTPScreen.this.P1().setVisibility(8);
            VahanGenerateOTPScreen.this.X1().setVisibility(0);
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
                    VahanGenerateOTPScreen.this.L1().dismiss();
                    VahanGenerateOTPScreen vahanGenerateOTPScreen = VahanGenerateOTPScreen.this;
                    vahanGenerateOTPScreen.r2(vahanGenerateOTPScreen, vahanGenerateOTPScreen.T1().b("label_log_resend_otp", "We have resent the OTP Verification to your mobile number"));
                } else if (StringsKt__StringsJVMKt.equals(resendOtp.getStatusCode(), "AL002", true)) {
                    VahanGenerateOTPScreen vahanGenerateOTPScreen2 = VahanGenerateOTPScreen.this;
                    vahanGenerateOTPScreen2.r2(vahanGenerateOTPScreen2, resendOtp.getStatusDesc());
                } else {
                    VahanGenerateOTPScreen.this.L1().dismiss();
                    VahanGenerateOTPScreen vahanGenerateOTPScreen3 = VahanGenerateOTPScreen.this;
                    vahanGenerateOTPScreen3.r2(vahanGenerateOTPScreen3, resendOtp.getStatusDesc());
                }
            } catch (Exception unused) {
                VahanGenerateOTPScreen.this.L1().dismiss();
                VahanGenerateOTPScreen vahanGenerateOTPScreen4 = VahanGenerateOTPScreen.this;
                vahanGenerateOTPScreen4.r2(vahanGenerateOTPScreen4, "Unable to Verify the OTP, Please try after some time");
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
                    if (VahanGenerateOTPScreen.this.L1().isShowing()) {
                        VahanGenerateOTPScreen.this.L1().dismiss();
                    }
                    VahanGenerateOTPScreen vahanGenerateOTPScreen = VahanGenerateOTPScreen.this;
                    vahanGenerateOTPScreen.t2(vahanGenerateOTPScreen.getRcNo(), VahanGenerateOTPScreen.this.getServiceSelection_HashMap(), false);
                    return;
                }
                if (VahanGenerateOTPScreen.this.L1().isShowing()) {
                    VahanGenerateOTPScreen.this.L1().dismiss();
                }
                VahanGenerateOTPScreen vahanGenerateOTPScreen2 = VahanGenerateOTPScreen.this;
                vahanGenerateOTPScreen2.r2(vahanGenerateOTPScreen2, otpVerifyResult.getStatusDesc());
            } catch (Exception e) {
                if (VahanGenerateOTPScreen.this.L1().isShowing()) {
                    VahanGenerateOTPScreen.this.L1().dismiss();
                }
                e.printStackTrace();
                VahanGenerateOTPScreen vahanGenerateOTPScreen3 = VahanGenerateOTPScreen.this;
                vahanGenerateOTPScreen3.r2(vahanGenerateOTPScreen3, vahanGenerateOTPScreen3.T1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
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
            VahanGenerateOTPScreen.this.L1().dismiss();
            VahanGenerateOTPScreen vahanGenerateOTPScreen = VahanGenerateOTPScreen.this;
            vahanGenerateOTPScreen.r2(vahanGenerateOTPScreen, vahanGenerateOTPScreen.T1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(GetCitizenDetails getCitizenDetails) {
            try {
                if (StringsKt__StringsJVMKt.equals(getCitizenDetails.getStatusCode(), "CTZN001", true)) {
                    VahanGenerateOTPScreen.this.d2().m(VahanGenerateOTPScreen.this, String.valueOf(getCitizenDetails.getMparCitizenUser().getCtzMobile()), String.valueOf(getCitizenDetails.getMparCitizenUser().getCtzRecordId()));
                } else if (StringsKt__StringsJVMKt.equals(getCitizenDetails.getStatusCode(), "CTZN099", true)) {
                    VahanGenerateOTPScreen.this.L1().dismiss();
                } else {
                    VahanGenerateOTPScreen.this.L1().dismiss();
                    Toast.makeText(VahanGenerateOTPScreen.this.getApplicationContext(), "Unable to send the OTP, Please try after some times!", 1).show();
                }
            } catch (Exception e) {
                e.printStackTrace();
                VahanGenerateOTPScreen.this.L1().dismiss();
                Toast.makeText(VahanGenerateOTPScreen.this.getApplicationContext(), "Unable to send the OTP, Please try after some times", 1).show();
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
                VahanGenerateOTPScreen.this.L1().dismiss();
                if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL001", true)) {
                    VahanGenerateOTPScreen vahanGenerateOTPScreen = VahanGenerateOTPScreen.this;
                    vahanGenerateOTPScreen.i3(vahanGenerateOTPScreen, vahanGenerateOTPScreen.E1().getText().toString());
                    VahanGenerateOTPScreen.this.H2(String.valueOf(sendOtpResult.getRecordId()));
                    VahanGenerateOTPScreen vahanGenerateOTPScreen2 = VahanGenerateOTPScreen.this;
                    vahanGenerateOTPScreen2.K2(vahanGenerateOTPScreen2.Y1().getText().toString());
                } else if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL022", true) || StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL014", true)) {
                    Toast.makeText(VahanGenerateOTPScreen.this.getApplicationContext(), sendOtpResult.getStatusDesc().toString(), 1).show();
                } else if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL099", true)) {
                    Toast.makeText(VahanGenerateOTPScreen.this.getApplicationContext(), "Unable to send the OTP, Please try after some times!", 1).show();
                } else {
                    Toast.makeText(VahanGenerateOTPScreen.this.getApplicationContext(), "Unable to send the OTP, Please try after some times!", 1).show();
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(VahanGenerateOTPScreen.this.getApplicationContext(), "Unable to send the OTP, Please try after some times", 1).show();
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
            VahanGenerateOTPScreen.this.L1().dismiss();
            VahanGenerateOTPScreen vahanGenerateOTPScreen = VahanGenerateOTPScreen.this;
            vahanGenerateOTPScreen.g3(vahanGenerateOTPScreen, vahanGenerateOTPScreen.getString(R.string.service_unavable_please_try));
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

    public static final void e2(VahanGenerateOTPScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void f2(VahanGenerateOTPScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.q2();
    }

    public static final void g2(VahanGenerateOTPScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.F1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            this$0.U1().setImageResource(R.drawable.pass_visible);
            this$0.F1().setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            this$0.U1().setImageResource(R.drawable.mvvm_visibility);
            this$0.F1().setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public static final void h2(VahanGenerateOTPScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.F1().getText().toString();
        if (string.length() == 0) {
            this$0.r2(this$0, this$0.T1().b("label_log_entr_otp", "Please enter the OTP"));
            return;
        }
        if (string.length() < 6) {
            this$0.r2(this$0, this$0.T1().b("label_log_entr_otp", "Please enter the valid OTP"));
            return;
        }
        if (this$0.L1().isShowing()) {
            this$0.L1().dismiss();
        }
        this$0.L1().show();
        this$0.c2().l(this$0, string, this$0.otpId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void i2(VahanGenerateOTPScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.F1().setText("");
    }

    public static final void j2(VahanGenerateOTPScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = StringsKt__StringsKt.trim((CharSequence) this$0.E1().getText().toString()).toString();
        if (string.length() < 10) {
            Toast.makeText(this$0, "Invalid mobile number", 0).show();
            return;
        }
        this$0.L1().show();
        this$0.d2().m(this$0, string, new ws6(this$0).k());
    }

    /* JADX INFO: Access modifiers changed from: private */
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

    public static final void k2(VahanGenerateOTPScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.W1().isChecked()) {
            this$0.W1().setChecked(false);
        }
    }

    public static final void k3(VahanGenerateOTPScreen this$0, TextView time_text, Ref.ObjectRef langSession, Context context, TextView resendOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(time_text, "$time_text");
        Intrinsics.checkNotNullParameter(langSession, "$langSession");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(resendOtp, "$resendOtp");
        this$0.L1().show();
        new j(time_text, langSession, context, resendOtp).start();
        this$0.c2().j(this$0, this$0.otpId);
    }

    public static final void l2(VahanGenerateOTPScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) VahanUpdateMobileActivity.class));
        this$0.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void l3(EditText enterOtp, Context context, Ref.ObjectRef langSession, VahanGenerateOTPScreen this$0, View view) {
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
        if (this$0.L1().isShowing()) {
            this$0.L1().dismiss();
        }
        this$0.L1().show();
        this$0.c2().l(this$0, string, this$0.otpId);
    }

    public static final void m2(VahanGenerateOTPScreen this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.G1().setEnabled(true);
            this$0.G1().setAlpha(1.0f);
        } else {
            if (z) {
                return;
            }
            this$0.G1().setEnabled(false);
            this$0.G1().setAlpha(0.5f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m3(EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        enterOtp.setText("");
    }

    public static final void n2(VahanGenerateOTPScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        final Dialog dialog = new Dialog(this$0);
        dialog.setContentView(R.layout.term_cond_dialog);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        String str = s14.a.g() + this$0.T1().d() + "/mparivahan-info-terms-of-use.html";
        View viewFindViewById = dialog.findViewById(R.id.cancelIv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = dialog.findViewById(R.id.termConditionWv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ((ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.r47
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                VahanGenerateOTPScreen.o2(dialog, view2);
            }
        });
        ((WebView) viewFindViewById2).loadUrl(str);
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o2(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    public static final void p2(VahanGenerateOTPScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.L1().show();
        this$0.new a().start();
        this$0.c2().j(this$0, this$0.otpId);
    }

    private final void q2() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public final void A2(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.enterOtp = editText;
    }

    public final String B1(HashMap serviceSelection_HashMap) {
        Intrinsics.checkNotNullParameter(serviceSelection_HashMap, "serviceSelection_HashMap");
        return serviceSelection_HashMap.containsKey(VContant.DUPLICATE_RC) ? ta3.a.P(this, "Issue of Duplicate RC") : serviceSelection_HashMap.containsKey(VContant.TRANFER_OF_OWNERSHIP) ? ta3.a.P(this, "Transfer of Ownership") : serviceSelection_HashMap.containsKey(VContant.CHANGE_OF_ADDRESS) ? ta3.a.P(this, "Change of Address in RC") : serviceSelection_HashMap.containsKey(VContant.HYPOTHICATION_TERMINATION) ? ta3.a.P(this, "Hypothecation Termination") : serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_CONTINUATION) ? ta3.a.P(this, "Hypothecation Continuation") : serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_ADDITION) ? ta3.a.P(this, "Hypothecation Addition") : serviceSelection_HashMap.containsKey(VContant.RCPARTICULAR) ? ta3.a.P(this, "RC Particulars against Fee") : serviceSelection_HashMap.containsKey(VContant.NOC) ? ta3.a.P(this, "No Objection Certificate (NOC)") : serviceSelection_HashMap.containsKey(VContant.DUPLICATE_FITNESS) ? ta3.a.P(this, "Duplicate Fitness Certificate") : serviceSelection_HashMap.containsKey(VContant.DUPLICATE_PERMIT) ? ta3.a.P(this, "Duplicate Permit Certificate") : serviceSelection_HashMap.containsKey(VContant.RC_SURRENDER) ? ta3.a.P(this, "RC Surrender") : serviceSelection_HashMap.containsKey(VContant.RC_CANCALATION) ? ta3.a.P(this, "RC Cancellation") : serviceSelection_HashMap.containsKey(VContant.PAY_TAX) ? ta3.a.P(this, "Pay Tax") : serviceSelection_HashMap.containsKey(VContant.PAY_TAXASS) ? ta3.a.P(this, "Tax Assessment") : serviceSelection_HashMap.containsKey(VContant.RC_RELEASE) ? ta3.a.P(this, "RC Release") : serviceSelection_HashMap.containsKey(VContant.Temp_Permit) ? ta3.a.P(this, "Temporary Permit") : serviceSelection_HashMap.containsKey(VContant.NP_Permit) ? ta3.a.P(this, "Renewal of NP Authorization Permit") : serviceSelection_HashMap.containsKey(VContant.PERMIT_RENEWAL) ? ta3.a.P(this, "Permit Renewal") : serviceSelection_HashMap.containsKey(VContant.Nominee_Addition) ? ta3.a.P(this, "Addition of Nominee") : serviceSelection_HashMap.containsKey(VContant.COMPOUND_FEE) ? ta3.a.P(this, "Compounding Fee Payment") : serviceSelection_HashMap.containsKey(VContant.MISELL_PAYMENT) ? ta3.a.P(this, "Miscellaneous Fee Payment") : serviceSelection_HashMap.containsKey(VContant.ALTERATION) ? ta3.a.P(this, "Alteration of Vehicle") : serviceSelection_HashMap.containsKey(VContant.MULTI_SELECT_SERVICE) ? ta3.a.P(this, "RC Services") : "";
    }

    public final void B2(AppCompatButton appCompatButton) {
        Intrinsics.checkNotNullParameter(appCompatButton, "<set-?>");
        this.generateOtp = appCompatButton;
    }

    public final MyTextView C1() {
        MyTextView myTextView = this.agreeTermCond;
        if (myTextView != null) {
            return myTextView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("agreeTermCond");
        return null;
    }

    public final void C2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobile_number = str;
    }

    public final gh D1() {
        gh ghVar = this.binding;
        if (ghVar != null) {
            return ghVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void D2(AppCompatImageView appCompatImageView) {
        Intrinsics.checkNotNullParameter(appCompatImageView, "<set-?>");
        this.mvvm_back = appCompatImageView;
    }

    public final TextView E1() {
        TextView textView = this.edit_mobile_number;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("edit_mobile_number");
        return null;
    }

    public final void E2(RelativeLayout relativeLayout) {
        Intrinsics.checkNotNullParameter(relativeLayout, "<set-?>");
        this.nexGenHolder = relativeLayout;
    }

    public final EditText F1() {
        EditText editText = this.enterOtp;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("enterOtp");
        return null;
    }

    public final void F2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.note_text = textView;
    }

    public final AppCompatButton G1() {
        AppCompatButton appCompatButton = this.generateOtp;
        if (appCompatButton != null) {
            return appCompatButton;
        }
        Intrinsics.throwUninitializedPropertyAccessException("generateOtp");
        return null;
    }

    public final void G2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final String H1() {
        String str = this.mobile_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mobile_number");
        return null;
    }

    public final void H2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.otpId = str;
    }

    public final AppCompatImageView I1() {
        AppCompatImageView appCompatImageView = this.mvvm_back;
        if (appCompatImageView != null) {
            return appCompatImageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mvvm_back");
        return null;
    }

    public final void I2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final RelativeLayout J1() {
        RelativeLayout relativeLayout = this.nexGenHolder;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nexGenHolder");
        return null;
    }

    public final void J2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.proservice = vahanProService;
    }

    public final String K1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    public final void K2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rcNo = str;
    }

    public final ProgressDialog L1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final void L2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final VahanProService M1() {
        VahanProService vahanProService = this.proservice;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("proservice");
        return null;
    }

    public final void M2(MyTextView myTextView) {
        Intrinsics.checkNotNullParameter(myTextView, "<set-?>");
        this.resendOtp = myTextView;
    }

    /* JADX INFO: renamed from: N1, reason: from getter */
    public final String getRcNo() {
        return this.rcNo;
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

    /* JADX INFO: renamed from: S1, reason: from getter */
    public final HashMap getServiceSelection_HashMap() {
        return this.serviceSelection_HashMap;
    }

    public final void S2(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.shownPin = imageView;
    }

    public final wa3 T1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final void T2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.submitOtp = textView;
    }

    public final ImageView U1() {
        ImageView imageView = this.shownPin;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shownPin");
        return null;
    }

    public final void U2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.termCndLl = linearLayout;
    }

    public final TextView V1() {
        TextView textView = this.submitOtp;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("submitOtp");
        return null;
    }

    public final void V2(CheckBox checkBox) {
        Intrinsics.checkNotNullParameter(checkBox, "<set-?>");
        this.term_condition = checkBox;
    }

    public final CheckBox W1() {
        CheckBox checkBox = this.term_condition;
        if (checkBox != null) {
            return checkBox;
        }
        Intrinsics.throwUninitializedPropertyAccessException("term_condition");
        return null;
    }

    public final void W2(MyTextView myTextView) {
        Intrinsics.checkNotNullParameter(myTextView, "<set-?>");
        this.time_text = myTextView;
    }

    public final MyTextView X1() {
        MyTextView myTextView = this.time_text;
        if (myTextView != null) {
            return myTextView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("time_text");
        return null;
    }

    public final void X2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtVehicleNumber = textView;
    }

    public final TextView Y1() {
        TextView textView = this.txtVehicleNumber;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtVehicleNumber");
        return null;
    }

    public final void Y2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txt_reset = textView;
    }

    public final TextView Z1() {
        TextView textView = this.txt_reset;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txt_reset");
        return null;
    }

    public final void Z2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.update_mob = textView;
    }

    public final TextView a2() {
        TextView textView = this.update_mob;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("update_mob");
        return null;
    }

    public final void a3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.verifyOtpBtn = linearLayout;
    }

    public final VahanServiceConnection b2() {
        VahanServiceConnection vahanServiceConnection = this.verifyOtpRetrofitService;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("verifyOtpRetrofitService");
        return null;
    }

    public final void b3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.verifyOtpLl = linearLayout;
    }

    public final lk7 c2() {
        lk7 lk7Var = this.verifyOtpViewModel;
        if (lk7Var != null) {
            return lk7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("verifyOtpViewModel");
        return null;
    }

    public final void c3(VahanServiceConnection vahanServiceConnection) {
        Intrinsics.checkNotNullParameter(vahanServiceConnection, "<set-?>");
        this.verifyOtpRetrofitService = vahanServiceConnection;
    }

    public final al7 d2() {
        al7 al7Var = this.viewModel;
        if (al7Var != null) {
            return al7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.y47
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreen.h3(dialog, view);
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
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.t47
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreen.j3(editText, imageView2, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.u47
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreen.k3(this.a, textView3, objectRef, context, textView, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.v47
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreen.l3(editText, context, objectRef, this, view);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.w47
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreen.m3(editText, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.x47
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreen.n3(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vahan_generate_o_t_p_screen);
        gh ghVarC = gh.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ghVarC, "inflate(...)");
        v2(ghVarC);
        setContentView(D1().b());
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
        ta3.a.M2(this, D1(), Q1(), G1());
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
        f3((ld7) new z(this, new kd7(new jd7(M1()))).a(ld7.class));
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
        G1().setEnabled(false);
        G1().setAlpha(0.5f);
        I2(new ProgressDialog(this));
        L1().setMessage("Please wait...");
        L1().setCancelable(false);
        L1().setCanceledOnTouchOutside(false);
        R2(new ws6(this));
        d3((lk7) new z(this, new kk7(new bg7(b2()))).a(lk7.class));
        e3((al7) new z(this, new bl7(new bg7(R1()))).a(al7.class));
        this.rc_number = String.valueOf(getIntent().getStringExtra("RC"));
        C2(String.valueOf(getIntent().getStringExtra("Mobile_no")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        L2((NrvDetails) serializableExtra);
        HashMap map = (HashMap) getIntent().getSerializableExtra("map");
        Intrinsics.checkNotNull(map);
        this.serviceSelection_HashMap = map;
        G2(String.valueOf(getIntent().getStringExtra("off_code")));
        if (this.serviceSelection_HashMap.size() > 0) {
            D1().p.i.setText(B1(this.serviceSelection_HashMap));
        }
        if (this.serviceSelection_HashMap.containsKey(VContant.MULTI_SELECT_SERVICE)) {
            D1().p.e.setVisibility(8);
        }
        String strH1 = H1();
        if (strH1 == null || strH1.length() == 0 || StringsKt__StringsJVMKt.equals(H1(), "null", true)) {
            E1().setText("NA");
        } else {
            E1().setText(H1());
        }
        String str = this.rc_number;
        if (str != null && str.length() != 0) {
            Y1().setText(this.rc_number.toString());
        }
        I1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.p47
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreen.e2(this.a, view);
            }
        });
        J1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.a57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreen.f2(this.a, view);
            }
        });
        G1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.b57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreen.j2(this.a, view);
            }
        });
        Q1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.c57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreen.k2(this.a, view);
            }
        });
        a2().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.d57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreen.l2(this.a, view);
            }
        });
        W1().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.e57
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                VahanGenerateOTPScreen.m2(this.a, compoundButton, z);
            }
        });
        d2().h().g(this, new h(new e()));
        d2().i().g(this, new h(new f()));
        d2().g().g(this, new h(new g()));
        C1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.f57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreen.n2(this.a, view);
            }
        });
        P1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.g57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreen.p2(this.a, view);
            }
        });
        U1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.h57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreen.g2(this.a, view);
            }
        });
        c2().i().g(this, new h(new b()));
        V1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.q47
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreen.h2(this.a, view);
            }
        });
        c2().k().g(this, new h(new c()));
        c2().g().g(this, new h(new d()));
        Z1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.z47
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreen.i2(this.a, view);
            }
        });
    }

    public final void r2(Context context, String message) {
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
        ((TextView) viewFindViewById).setText(T1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(T1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.s47
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreen.s2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void t2(String rc_number, HashMap serviceSelection_HashMap, boolean isFaceless) {
        String str;
        String str2;
        String str3;
        String str4;
        String strSubstring;
        String strSubstring2;
        Intrinsics.checkNotNullParameter(rc_number, "rc_number");
        Intrinsics.checkNotNullParameter(serviceSelection_HashMap, "serviceSelection_HashMap");
        if (serviceSelection_HashMap.containsKey(VContant.DUPLICATE_RC)) {
            Intent intent = new Intent(this, (Class<?>) VahanDuplicateRcActivity.class);
            intent.putExtra("RC", rc_number);
            intent.putExtra("RcDetails", O1());
            intent.putExtra("map", serviceSelection_HashMap);
            intent.putExtra("off_code", K1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.CHANGE_OF_ADDRESS)) {
            Intent intent2 = new Intent(this, (Class<?>) VahanChangeOfAddress.class);
            intent2.putExtra("RC", rc_number);
            intent2.putExtra("RcDetails", O1());
            intent2.putExtra("map", serviceSelection_HashMap);
            intent2.putExtra("off_code", K1());
            intent2.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent2.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent2.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent2);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.HYPOTHICATION_TERMINATION)) {
            Intent intent3 = new Intent(this, (Class<?>) HypothecationTerminationActivity.class);
            intent3.putExtra("RC", rc_number);
            intent3.putExtra("RcDetails", O1());
            intent3.putExtra("map", serviceSelection_HashMap);
            intent3.putExtra("off_code", K1());
            intent3.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent3.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent3.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent3);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_CONTINUATION)) {
            Intent intent4 = new Intent(this, (Class<?>) HypothecationContinuationActivity.class);
            intent4.putExtra("RC", rc_number);
            intent4.putExtra("RcDetails", O1());
            intent4.putExtra("map", serviceSelection_HashMap);
            intent4.putExtra("off_code", K1());
            intent4.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent4.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent4.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent4);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_ADDITION)) {
            Intent intent5 = new Intent(this, (Class<?>) HypothecationAdditionActivity.class);
            intent5.putExtra("RC", rc_number);
            intent5.putExtra("RcDetails", O1());
            intent5.putExtra("map", serviceSelection_HashMap);
            intent5.putExtra("off_code", K1());
            intent5.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent5.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent5.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent5);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.RCPARTICULAR)) {
            Intent intent6 = new Intent(this, (Class<?>) VahanDetailsForRcParticulara.class);
            intent6.putExtra("RcDetails", O1());
            intent6.putExtra("RC", rc_number);
            intent6.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent6.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent6.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent6);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.NOC)) {
            Intent intent7 = new Intent(this, (Class<?>) VahanNocActivity.class);
            intent7.putExtra("RC", rc_number);
            intent7.putExtra("RcDetails", O1());
            intent7.putExtra("map", serviceSelection_HashMap);
            intent7.putExtra("off_code", K1());
            intent7.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent7.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent7.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent7);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_CONTINUATION)) {
            Intent intent8 = new Intent(this, (Class<?>) HypothecationContinuationActivity.class);
            intent8.putExtra("RC", rc_number);
            intent8.putExtra("RcDetails", O1());
            intent8.putExtra("map", serviceSelection_HashMap);
            intent8.putExtra("off_code", K1());
            intent8.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent8.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent8.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent8);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.DUPLICATE_FITNESS)) {
            Intent intent9 = new Intent(this, (Class<?>) VahanDuplicateFitnessActivity.class);
            intent9.putExtra("RC", rc_number);
            intent9.putExtra("RcDetails", O1());
            intent9.putExtra("map", serviceSelection_HashMap);
            intent9.putExtra("off_code", K1());
            intent9.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent9.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent9.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent9);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.RC_CANCALATION)) {
            Intent intent10 = new Intent(this, (Class<?>) VahanRcCancellationActivity.class);
            intent10.putExtra("RC", rc_number);
            intent10.putExtra("RcDetails", O1());
            intent10.putExtra("map", serviceSelection_HashMap);
            intent10.putExtra("off_code", K1());
            intent10.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent10.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent10.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent10);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.RC_SURRENDER)) {
            Intent intent11 = new Intent(this, (Class<?>) VahanRcSurrenderActivity.class);
            intent11.putExtra("RC", rc_number);
            intent11.putExtra("RcDetails", O1());
            intent11.putExtra("map", serviceSelection_HashMap);
            intent11.putExtra("off_code", K1());
            intent11.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent11.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent11.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent11);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.DUPLICATE_PERMIT)) {
            Intent intent12 = new Intent(this, (Class<?>) VahanDuplicatePermitActivity.class);
            intent12.putExtra("RC", rc_number);
            intent12.putExtra("RcDetails", O1());
            intent12.putExtra("map", serviceSelection_HashMap);
            intent12.putExtra("off_code", K1());
            intent12.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent12.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent12.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent12);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.PAY_TAX)) {
            Intent intent13 = new Intent(this, (Class<?>) PayTaxActivity.class);
            intent13.putExtra("RC", rc_number);
            intent13.putExtra("State", StringsKt__StringsKt.trim((CharSequence) String.valueOf(O1().getState_cd())).toString());
            intent13.putExtra("map", serviceSelection_HashMap);
            intent13.putExtra("off_code", K1());
            String rc_chasi_no = O1().getRc_chasi_no();
            if (rc_chasi_no != null) {
                str = "off_code";
                strSubstring2 = rc_chasi_no.substring(String.valueOf(O1().getRc_chasi_no()).length() - 5);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            } else {
                str = "off_code";
                strSubstring2 = null;
            }
            intent13.putExtra("chassis_no", strSubstring2);
            intent13.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent13.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent13.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent13);
            finish();
        } else {
            str = "off_code";
        }
        if (serviceSelection_HashMap.containsKey(VContant.PAY_TAXASS)) {
            Intent intent14 = new Intent(this, (Class<?>) PayTaxActivity.class);
            str2 = rc_number;
            intent14.putExtra("RC", str2);
            intent14.putExtra("State", StringsKt__StringsKt.trim((CharSequence) String.valueOf(O1().getState_cd())).toString());
            intent14.putExtra("map", serviceSelection_HashMap);
            str3 = str;
            intent14.putExtra(str3, K1());
            String rc_chasi_no2 = O1().getRc_chasi_no();
            if (rc_chasi_no2 != null) {
                strSubstring = rc_chasi_no2.substring(String.valueOf(O1().getRc_chasi_no()).length() - 5);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            } else {
                strSubstring = null;
            }
            intent14.putExtra("chassis_no", strSubstring);
            intent14.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent14.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent14.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent14);
            finish();
        } else {
            str2 = rc_number;
            str3 = str;
        }
        if (serviceSelection_HashMap.containsKey(VContant.RC_RELEASE)) {
            Intent intent15 = new Intent(this, (Class<?>) RCReleaseActivity.class);
            intent15.putExtra("RC", str2);
            str4 = "RcDetails";
            intent15.putExtra(str4, O1());
            intent15.putExtra("map", serviceSelection_HashMap);
            intent15.putExtra(str3, K1());
            intent15.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent15.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent15.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent15);
            finish();
        } else {
            str4 = "RcDetails";
        }
        if (serviceSelection_HashMap.containsKey(VContant.Temp_Permit)) {
            Intent intent16 = new Intent(this, (Class<?>) TemporaryPermitActivity.class);
            intent16.putExtra("RC", str2);
            intent16.putExtra(str4, O1());
            intent16.putExtra("map", serviceSelection_HashMap);
            intent16.putExtra(str3, K1());
            intent16.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent16.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent16.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent16);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.TRANFER_OF_OWNERSHIP)) {
            Intent intent17 = new Intent(this, (Class<?>) VahanTransferOfOwnerShipActivity.class);
            intent17.putExtra("RC", str2);
            intent17.putExtra(str4, O1());
            intent17.putExtra("map", serviceSelection_HashMap);
            intent17.putExtra(str3, K1());
            intent17.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent17.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent17.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent17);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.NP_Permit)) {
            Intent intent18 = new Intent(this, (Class<?>) RenewalOfNPAuthorizationPermit.class);
            intent18.putExtra("RC", str2);
            intent18.putExtra(str4, O1());
            intent18.putExtra("map", serviceSelection_HashMap);
            intent18.putExtra(str3, K1());
            intent18.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent18.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent18.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent18);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.PERMIT_RENEWAL)) {
            Intent intent19 = new Intent(this, (Class<?>) RenewalOfPermitMainScreen.class);
            intent19.putExtra("RC", str2);
            intent19.putExtra(str4, O1());
            intent19.putExtra("map", serviceSelection_HashMap);
            intent19.putExtra(str3, K1());
            intent19.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent19.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent19.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent19);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.COMPOUND_FEE)) {
            Intent intent20 = new Intent(this, (Class<?>) CompoundingFeeActivity.class);
            intent20.putExtra("RC", str2);
            intent20.putExtra(str4, O1());
            intent20.putExtra("map", serviceSelection_HashMap);
            intent20.putExtra(str3, K1());
            intent20.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent20.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent20.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent20);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.Nominee_Addition)) {
            Intent intent21 = new Intent(this, (Class<?>) NomineeActivity.class);
            intent21.putExtra("RC", str2);
            intent21.putExtra(str4, O1());
            intent21.putExtra("map", serviceSelection_HashMap);
            intent21.putExtra(str3, K1());
            intent21.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent21.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent21.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent21);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.MISELL_PAYMENT)) {
            Intent intent22 = new Intent(this, (Class<?>) MiscellaneousFeePayment.class);
            intent22.putExtra("RC", str2);
            intent22.putExtra(str4, O1());
            intent22.putExtra("map", serviceSelection_HashMap);
            intent22.putExtra(str3, K1());
            intent22.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent22.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent22.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent22);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.ALTERATION)) {
            Intent intent23 = new Intent(this, (Class<?>) VahanAlterationOfVehicle.class);
            intent23.putExtra("RC", str2);
            intent23.putExtra(str4, O1());
            intent23.putExtra("map", serviceSelection_HashMap);
            intent23.putExtra(str3, K1());
            intent23.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent23.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent23.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent23);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.UPDATE_MOBILE)) {
            Intent intent24 = new Intent(this, (Class<?>) VahanUpdateMobiActivity.class);
            intent24.putExtra("RC", str2);
            intent24.putExtra(str4, O1());
            intent24.putExtra("map", serviceSelection_HashMap);
            intent24.putExtra(str3, K1());
            intent24.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent24.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent24.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent24);
            finish();
        }
        if (serviceSelection_HashMap.containsKey(VContant.MULTI_SELECT_SERVICE)) {
            Intent intent25 = new Intent(this, (Class<?>) VahanMultiSelectionScreen.class);
            intent25.putExtra("RC", str2);
            intent25.putExtra(str4, O1());
            intent25.putExtra("map", serviceSelection_HashMap);
            intent25.putExtra(str3, K1());
            intent25.putExtra(VContant.NEXGEN_isFACELESS, isFaceless);
            intent25.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent25.putExtra(VContant.NEXGEN_addahar_address, "NA");
            startActivity(intent25);
            finish();
        }
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
