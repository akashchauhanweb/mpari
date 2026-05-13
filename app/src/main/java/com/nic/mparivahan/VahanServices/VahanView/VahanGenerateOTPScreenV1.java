package com.nic.mparivahan.VahanServices.VahanView;

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
import android.util.Log;
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
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b\u009a\u0002\u0010\u009b\u0002J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0015J\u001c\u0010\n\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\bJ \u0010\u0012\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0007J\u000e\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010)\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010=\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010,\u001a\u0004\b;\u0010.\"\u0004\b<\u00100R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010U\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010]\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010e\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010m\u001a\u00020f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010u\u001a\u00020n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR>\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`v8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R&\u0010\u0083\u0001\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R&\u0010\u0087\u0001\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010,\u001a\u0005\b\u0085\u0001\u0010.\"\u0005\b\u0086\u0001\u00100R(\u0010\u008b\u0001\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0088\u0001\u0010~\u001a\u0006\b\u0089\u0001\u0010\u0080\u0001\"\u0006\b\u008a\u0001\u0010\u0082\u0001R(\u0010\u008f\u0001\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u008c\u0001\u0010~\u001a\u0006\b\u008d\u0001\u0010\u0080\u0001\"\u0006\b\u008e\u0001\u0010\u0082\u0001R(\u0010\u0093\u0001\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0090\u0001\u0010~\u001a\u0006\b\u0091\u0001\u0010\u0080\u0001\"\u0006\b\u0092\u0001\u0010\u0082\u0001R(\u0010\u0097\u0001\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0094\u0001\u0010~\u001a\u0006\b\u0095\u0001\u0010\u0080\u0001\"\u0006\b\u0096\u0001\u0010\u0082\u0001R&\u0010\u009b\u0001\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0098\u0001\u0010,\u001a\u0005\b\u0099\u0001\u0010.\"\u0005\b\u009a\u0001\u00100R*\u0010£\u0001\u001a\u00030\u009c\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R*\u0010§\u0001\u001a\u00030\u009c\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¤\u0001\u0010\u009e\u0001\u001a\u0006\b¥\u0001\u0010 \u0001\"\u0006\b¦\u0001\u0010¢\u0001R&\u0010«\u0001\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¨\u0001\u0010,\u001a\u0005\b©\u0001\u0010.\"\u0005\bª\u0001\u00100R*\u0010³\u0001\u001a\u00030¬\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R*\u0010»\u0001\u001a\u00030´\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R&\u0010¿\u0001\u001a\u00020f8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¼\u0001\u0010h\u001a\u0005\b½\u0001\u0010j\"\u0005\b¾\u0001\u0010lR&\u0010Ã\u0001\u001a\u00020f8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÀ\u0001\u0010h\u001a\u0005\bÁ\u0001\u0010j\"\u0005\bÂ\u0001\u0010lR*\u0010Ç\u0001\u001a\u00030\u009c\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÄ\u0001\u0010\u009e\u0001\u001a\u0006\bÅ\u0001\u0010 \u0001\"\u0006\bÆ\u0001\u0010¢\u0001R&\u0010Ë\u0001\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÈ\u0001\u0010,\u001a\u0005\bÉ\u0001\u0010.\"\u0005\bÊ\u0001\u00100R&\u0010Ï\u0001\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÌ\u0001\u0010,\u001a\u0005\bÍ\u0001\u0010.\"\u0005\bÎ\u0001\u00100R&\u0010Ó\u0001\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÐ\u0001\u0010,\u001a\u0005\bÑ\u0001\u0010.\"\u0005\bÒ\u0001\u00100R&\u0010×\u0001\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÔ\u0001\u0010,\u001a\u0005\bÕ\u0001\u0010.\"\u0005\bÖ\u0001\u00100R(\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bØ\u0001\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001R*\u0010å\u0001\u001a\u00030Þ\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bß\u0001\u0010à\u0001\u001a\u0006\bá\u0001\u0010â\u0001\"\u0006\bã\u0001\u0010ä\u0001R*\u0010í\u0001\u001a\u00030æ\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bç\u0001\u0010è\u0001\u001a\u0006\bé\u0001\u0010ê\u0001\"\u0006\bë\u0001\u0010ì\u0001R&\u0010ñ\u0001\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bî\u0001\u0010`\u001a\u0005\bï\u0001\u0010b\"\u0005\bð\u0001\u0010dR(\u0010õ\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bò\u0001\u0010~\u001a\u0006\bó\u0001\u0010\u0080\u0001\"\u0006\bô\u0001\u0010\u0082\u0001R(\u0010ù\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bö\u0001\u0010~\u001a\u0006\b÷\u0001\u0010\u0080\u0001\"\u0006\bø\u0001\u0010\u0082\u0001R(\u0010ý\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bú\u0001\u0010~\u001a\u0006\bû\u0001\u0010\u0080\u0001\"\u0006\bü\u0001\u0010\u0082\u0001R*\u0010\u0085\u0002\u001a\u00030þ\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÿ\u0001\u0010\u0080\u0002\u001a\u0006\b\u0081\u0002\u0010\u0082\u0002\"\u0006\b\u0083\u0002\u0010\u0084\u0002R*\u0010\u008d\u0002\u001a\u00030\u0086\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0087\u0002\u0010\u0088\u0002\u001a\u0006\b\u0089\u0002\u0010\u008a\u0002\"\u0006\b\u008b\u0002\u0010\u008c\u0002R(\u0010\u0091\u0002\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u008e\u0002\u0010~\u001a\u0006\b\u008f\u0002\u0010\u0080\u0001\"\u0006\b\u0090\u0002\u0010\u0082\u0001R,\u0010\u0099\u0002\u001a\u0005\u0018\u00010\u0092\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0093\u0002\u0010\u0094\u0002\u001a\u0006\b\u0095\u0002\u0010\u0096\u0002\"\u0006\b\u0097\u0002\u0010\u0098\u0002¨\u0006\u009c\u0002"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanView/VahanGenerateOTPScreenV1;", "Lcom/zepto/pq;", "", "z2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Ljava/util/HashMap;", "", "serviceSelection_HashMap", "E1", "Landroid/content/Context;", "context", "message", "A2", "q3", "mobile_no", "developermess", "s3", "Lcom/zepto/ld7;", "viewModelv1", "D1", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "C", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "getBottom", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "E2", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V", "bottom", "Landroidx/appcompat/widget/AppCompatButton;", "D", "Landroidx/appcompat/widget/AppCompatButton;", "M1", "()Landroidx/appcompat/widget/AppCompatButton;", "K2", "(Landroidx/appcompat/widget/AppCompatButton;)V", "generateOtp", "E", "V1", "W2", "reset", "Landroid/widget/TextView;", "F", "Landroid/widget/TextView;", "e2", "()Landroid/widget/TextView;", "h3", "(Landroid/widget/TextView;)V", "txtVehicleNumber", "Landroid/widget/CheckBox;", "G", "Landroid/widget/CheckBox;", "c2", "()Landroid/widget/CheckBox;", "f3", "(Landroid/widget/CheckBox;)V", "term_condition", "H", "J1", "H2", "edit_mobile_number", "Landroidx/appcompat/widget/AppCompatImageView;", "I", "Landroidx/appcompat/widget/AppCompatImageView;", "O1", "()Landroidx/appcompat/widget/AppCompatImageView;", "M2", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "mvvm_back", "Landroid/widget/RelativeLayout;", "J", "Landroid/widget/RelativeLayout;", "P1", "()Landroid/widget/RelativeLayout;", "N2", "(Landroid/widget/RelativeLayout;)V", "nexGenHolder", "Landroid/app/ProgressDialog;", "K", "Landroid/app/ProgressDialog;", "R1", "()Landroid/app/ProgressDialog;", "R2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/al7;", "L", "Lcom/zepto/al7;", "j2", "()Lcom/zepto/al7;", "o3", "(Lcom/zepto/al7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "M", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "W1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "X2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;)V", "retrofitService", "Lcom/nic/mparivahan/MyTextView;", "N", "Lcom/nic/mparivahan/MyTextView;", "F1", "()Lcom/nic/mparivahan/MyTextView;", "C2", "(Lcom/nic/mparivahan/MyTextView;)V", "agreeTermCond", "Lcom/zepto/ws6;", "O", "Lcom/zepto/ws6;", "getSession_manger", "()Lcom/zepto/ws6;", "a3", "(Lcom/zepto/ws6;)V", "session_manger", "Lkotlin/collections/HashMap;", "P", "Ljava/util/HashMap;", "X1", "()Ljava/util/HashMap;", "setServiceSelection_HashMap", "(Ljava/util/HashMap;)V", "Q", "Ljava/lang/String;", "N1", "()Ljava/lang/String;", "L2", "(Ljava/lang/String;)V", "mobile_number", "R", "getSelectedServiceTv", "Y2", "selectedServiceTv", "S", "Q1", "P2", "off_code", "T", "T1", "T2", "purCode", "U", "a2", "c3", "stateCode", "V", "H1", "F2", "chassiNo", "W", "getEnterMobileTv", "I2", "enterMobileTv", "Landroid/widget/LinearLayout;", "X", "Landroid/widget/LinearLayout;", "getTermCndLl", "()Landroid/widget/LinearLayout;", "e3", "(Landroid/widget/LinearLayout;)V", "termCndLl", "Y", "getVerifyOtpLl", "l3", "verifyOtpLl", "Z", "getDisPlay", "G2", "disPlay", "Landroid/widget/EditText;", "a0", "Landroid/widget/EditText;", "K1", "()Landroid/widget/EditText;", "J2", "(Landroid/widget/EditText;)V", "enterOtp", "Landroid/widget/ImageView;", "b0", "Landroid/widget/ImageView;", "Z1", "()Landroid/widget/ImageView;", "b3", "(Landroid/widget/ImageView;)V", "shownPin", "c0", "d2", "g3", "time_text", "d0", "U1", "V2", "resendOtp", "e0", "getVerifyOtpBtn", "k3", "verifyOtpBtn", "f0", "b2", "d3", "submitOtp", "g0", "f2", "i3", "txt_reset", "h0", "g2", "j3", "update_mob", "i0", "getNote_text", "O2", "note_text", "j0", "Lcom/zepto/ld7;", "k2", "()Lcom/zepto/ld7;", "p3", "(Lcom/zepto/ld7;)V", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "k0", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "S1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "S2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "proservice", "Lcom/zepto/lk7;", "l0", "Lcom/zepto/lk7;", "i2", "()Lcom/zepto/lk7;", "n3", "(Lcom/zepto/lk7;)V", "verifyOtpViewModel", "m0", "h2", "m3", "verifyOtpRetrofitService", "n0", "getOtpId", "Q2", "otpId", "o0", "getRcNo", "U2", "rcNo", "p0", "getRc_number", "setRc_number", "rc_number", "Lcom/zepto/gh;", "q0", "Lcom/zepto/gh;", "G1", "()Lcom/zepto/gh;", "D2", "(Lcom/zepto/gh;)V", "binding", "Lcom/zepto/wa3;", "r0", "Lcom/zepto/wa3;", "Y1", "()Lcom/zepto/wa3;", "Z2", "(Lcom/zepto/wa3;)V", "session", "s0", "L1", "setFlage", "flage", "Landroid/app/Dialog;", "t0", "Landroid/app/Dialog;", "I1", "()Landroid/app/Dialog;", "setD", "(Landroid/app/Dialog;)V", "d", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanGenerateOTPScreenV1 extends pq {

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
                VahanGenerateOTPScreenV1.this.R1().dismiss();
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
                VahanGenerateOTPScreenV1.this.R1().dismiss();
                if (vahangenotp.getApiMessage().getStatusCode() == 200) {
                    VahanGenerateOTPScreenV1 vahanGenerateOTPScreenV1 = VahanGenerateOTPScreenV1.this;
                    vahanGenerateOTPScreenV1.s3(vahanGenerateOTPScreenV1, vahanGenerateOTPScreenV1.J1().getText().toString(), String.valueOf(vahangenotp.getApiMessage().getDeveloperMessage()));
                    VahanGenerateOTPScreenV1 vahanGenerateOTPScreenV12 = VahanGenerateOTPScreenV1.this;
                    vahanGenerateOTPScreenV12.U2(vahanGenerateOTPScreenV12.e2().getText().toString());
                } else {
                    Toast.makeText(VahanGenerateOTPScreenV1.this.getApplicationContext(), vahangenotp.getApiMessage().getDeveloperMessage(), 1).show();
                }
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(VahanGenerateOTPScreenV1.this.getApplicationContext(), "Unable to send the OTP, Please try after some times", 1).show();
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
                VahanGenerateOTPScreenV1.this.R1().dismiss();
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(VahanGenerateOTPScreenV1.this.getApplicationContext(), "Unable to send the OTP, Please try after some times", 1).show();
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
                VahanGenerateOTPScreenV1.this.R1().dismiss();
                if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL001", true)) {
                    VahanGenerateOTPScreenV1 vahanGenerateOTPScreenV1 = VahanGenerateOTPScreenV1.this;
                    vahanGenerateOTPScreenV1.s3(vahanGenerateOTPScreenV1, vahanGenerateOTPScreenV1.J1().getText().toString(), " ");
                    VahanGenerateOTPScreenV1.this.Q2(String.valueOf(sendOtpResult.getRecordId()));
                    VahanGenerateOTPScreenV1 vahanGenerateOTPScreenV12 = VahanGenerateOTPScreenV1.this;
                    vahanGenerateOTPScreenV12.U2(vahanGenerateOTPScreenV12.e2().getText().toString());
                } else if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL022", true) || StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL014", true)) {
                    Toast.makeText(VahanGenerateOTPScreenV1.this.getApplicationContext(), sendOtpResult.getStatusDesc().toString(), 1).show();
                } else if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL099", true)) {
                    Toast.makeText(VahanGenerateOTPScreenV1.this.getApplicationContext(), "Unable to send the OTP, Please try after some times!", 1).show();
                } else {
                    Toast.makeText(VahanGenerateOTPScreenV1.this.getApplicationContext(), "Unable to send the OTP, Please try after some times!", 1).show();
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(VahanGenerateOTPScreenV1.this.getApplicationContext(), "Unable to send the OTP, Please try after some times", 1).show();
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
            VahanGenerateOTPScreenV1.this.R1().dismiss();
            VahanGenerateOTPScreenV1 vahanGenerateOTPScreenV1 = VahanGenerateOTPScreenV1.this;
            vahanGenerateOTPScreenV1.q3(vahanGenerateOTPScreenV1, vahanGenerateOTPScreenV1.getString(R.string.service_unavable_please_try));
        }
    }

    public static final class f extends CountDownTimer {
        public f() {
            super(30000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            VahanGenerateOTPScreenV1.this.U1().setVisibility(0);
            VahanGenerateOTPScreenV1.this.d2().setText("0");
            VahanGenerateOTPScreenV1.this.d2().setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            VahanGenerateOTPScreenV1.this.d2().setText("Time remaining : " + (j / ((long) 1000)));
            VahanGenerateOTPScreenV1.this.U1().setVisibility(8);
            VahanGenerateOTPScreenV1.this.d2().setVisibility(0);
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
                VahanGenerateOTPScreenV1.this.R1().dismiss();
                if (vahangenotp.getApiMessage().getStatusCode() == 200) {
                    VahanGenerateOTPScreenV1 vahanGenerateOTPScreenV1 = VahanGenerateOTPScreenV1.this;
                    vahanGenerateOTPScreenV1.A2(vahanGenerateOTPScreenV1, vahanGenerateOTPScreenV1.Y1().b("label_log_resend_otp", "We have resent the OTP Verification to your mobile number"));
                } else {
                    VahanGenerateOTPScreenV1 vahanGenerateOTPScreenV12 = VahanGenerateOTPScreenV1.this;
                    vahanGenerateOTPScreenV12.A2(vahanGenerateOTPScreenV12, "Unable to send the OTP, Please try after some time");
                }
            } catch (Exception e) {
                e.printStackTrace();
                VahanGenerateOTPScreenV1 vahanGenerateOTPScreenV13 = VahanGenerateOTPScreenV1.this;
                vahanGenerateOTPScreenV13.A2(vahanGenerateOTPScreenV13, "Unable to send the OTP, Please try after some time");
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
                if (VahanGenerateOTPScreenV1.this.R1().isShowing()) {
                    VahanGenerateOTPScreenV1.this.R1().dismiss();
                }
                if (VahanGenerateOTPScreenV1.this.getD() != null) {
                    Dialog d = VahanGenerateOTPScreenV1.this.getD();
                    Intrinsics.checkNotNull(d);
                    d.dismiss();
                }
                Toast.makeText(VahanGenerateOTPScreenV1.this, str, 0).show();
                Intent intent = new Intent(VahanGenerateOTPScreenV1.this, (Class<?>) VahanGenerateOTPScreenV1.class);
                intent.putExtra(VContant.AUTHMODE, "M");
                intent.putExtra(VContant.ACTIVITY, VahanGenerateOTPScreenV1.this.getFlage());
                if (VahanGenerateOTPScreenV1.this.getServiceSelection_HashMap().containsKey(VContant.M_VALUE)) {
                    intent.putExtra(VContant.M_VALUE, (String) VahanGenerateOTPScreenV1.this.getServiceSelection_HashMap().get(VContant.M_VALUE));
                }
                VahanGenerateOTPScreenV1.this.setResult(-1, intent);
                VahanGenerateOTPScreenV1.this.finish();
            } catch (Exception e) {
                if (VahanGenerateOTPScreenV1.this.R1().isShowing()) {
                    VahanGenerateOTPScreenV1.this.R1().dismiss();
                }
                e.printStackTrace();
                VahanGenerateOTPScreenV1 vahanGenerateOTPScreenV1 = VahanGenerateOTPScreenV1.this;
                vahanGenerateOTPScreenV1.A2(vahanGenerateOTPScreenV1, vahanGenerateOTPScreenV1.Y1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
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
            VahanGenerateOTPScreenV1.this.R1().dismiss();
            if (StringsKt__StringsJVMKt.equals(str, "ERROR", true)) {
                VahanGenerateOTPScreenV1 vahanGenerateOTPScreenV1 = VahanGenerateOTPScreenV1.this;
                vahanGenerateOTPScreenV1.A2(vahanGenerateOTPScreenV1, vahanGenerateOTPScreenV1.Y1().b("label_log_unbl_veri_otp", "Unable to Verify the OTP, Please try after some time."));
            } else {
                VahanGenerateOTPScreenV1 vahanGenerateOTPScreenV12 = VahanGenerateOTPScreenV1.this;
                vahanGenerateOTPScreenV12.A2(vahanGenerateOTPScreenV12, str);
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
                    VahanGenerateOTPScreenV1.this.j2().m(VahanGenerateOTPScreenV1.this, String.valueOf(getCitizenDetails.getMparCitizenUser().getCtzMobile()), String.valueOf(getCitizenDetails.getMparCitizenUser().getCtzRecordId()));
                } else if (StringsKt__StringsJVMKt.equals(getCitizenDetails.getStatusCode(), "CTZN099", true)) {
                    VahanGenerateOTPScreenV1.this.R1().dismiss();
                } else {
                    VahanGenerateOTPScreenV1.this.R1().dismiss();
                    Toast.makeText(VahanGenerateOTPScreenV1.this.getApplicationContext(), "Unable to send the OTP, Please try after some times!", 1).show();
                }
            } catch (Exception e) {
                e.printStackTrace();
                VahanGenerateOTPScreenV1.this.R1().dismiss();
                Toast.makeText(VahanGenerateOTPScreenV1.this.getApplicationContext(), "Unable to send the OTP, Please try after some times", 1).show();
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
    public static final void B2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void l2(VahanGenerateOTPScreenV1 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Log.e("TagTest", "calling");
        Intent intent = new Intent(this$0, (Class<?>) VahanGenerateOTPScreenV1.class);
        intent.putExtra(VContant.AUTHMODE, "A");
        intent.putExtra(VContant.ACTIVITY, this$0.flage);
        if (this$0.serviceSelection_HashMap.containsKey(VContant.M_VALUE)) {
            intent.putExtra(VContant.M_VALUE, (String) this$0.serviceSelection_HashMap.get(VContant.M_VALUE));
        }
        this$0.setResult(-1, intent);
        this$0.finish();
    }

    public static final void m2(VahanGenerateOTPScreenV1 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.z2();
    }

    public static final void n2(VahanGenerateOTPScreenV1 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        final Dialog dialog = new Dialog(this$0);
        dialog.setContentView(R.layout.term_cond_dialog);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        String str = s14.a.g() + this$0.Y1().d() + "/mparivahan-info-terms-of-use.html";
        View viewFindViewById = dialog.findViewById(R.id.cancelIv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = dialog.findViewById(R.id.termConditionWv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ((ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.o57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                VahanGenerateOTPScreenV1.o2(dialog, view2);
            }
        });
        ((WebView) viewFindViewById2).loadUrl(str);
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o2(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    public static final void p2(VahanGenerateOTPScreenV1 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.R1().show();
        this$0.new f().start();
        this$0.i2().j(this$0, this$0.otpId);
    }

    public static final void q2(VahanGenerateOTPScreenV1 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.K1().getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
            this$0.Z1().setImageResource(R.drawable.pass_visible);
            this$0.K1().setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            this$0.Z1().setImageResource(R.drawable.mvvm_visibility);
            this$0.K1().setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public static final void r2(VahanGenerateOTPScreenV1 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.K1().getText().toString();
        if (string.length() == 0) {
            this$0.A2(this$0, this$0.Y1().b("label_log_entr_otp", "Please enter the OTP"));
            return;
        }
        if (string.length() < 6) {
            this$0.A2(this$0, this$0.Y1().b("label_log_entr_otp", "Please enter the valid OTP"));
            return;
        }
        if (this$0.R1().isShowing()) {
            this$0.R1().dismiss();
        }
        this$0.R1().show();
        this$0.i2().l(this$0, string, this$0.otpId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void s2(VahanGenerateOTPScreenV1 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.K1().setText("");
    }

    public static final void t2(VahanGenerateOTPScreenV1 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = StringsKt__StringsKt.trim((CharSequence) this$0.J1().getText().toString()).toString();
        if (string.length() < 10) {
            Toast.makeText(this$0, "Invalid mobile number", 0).show();
            return;
        }
        this$0.R1().show();
        ws6 ws6Var = new ws6(this$0);
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        arrayList.add(this$0.T1());
        this$0.k2().B1(this$0, new GenerateUserVerify(" ", "M", this$0.H1(), Settings.Secure.getString(this$0.getContentResolver(), "android_id"), "No", " ", ws6Var.l(), string, " ", true, arrayList, this$0.rc_number, this$0.a2(), ws6Var.e(), "", ws6Var.k()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t3(EditText enterOtp, ImageView shownPin, View view) {
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

    public static final void u2(VahanGenerateOTPScreenV1 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.c2().isChecked()) {
            this$0.c2().setChecked(false);
        }
    }

    public static final void u3(VahanGenerateOTPScreenV1 this$0, TextView time_text, Ref.ObjectRef langSession, Context context, TextView resendOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(time_text, "$time_text");
        Intrinsics.checkNotNullParameter(langSession, "$langSession");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(resendOtp, "$resendOtp");
        this$0.R1().show();
        new m(time_text, langSession, context, resendOtp).start();
        this$0.R1().show();
        ws6 ws6Var = new ws6(this$0);
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        arrayList.add(this$0.T1());
        this$0.k2().A1(this$0, new GenerateUserVerify(" ", "M", this$0.H1(), Settings.Secure.getString(this$0.getContentResolver(), "android_id"), "No", " ", ws6Var.l(), this$0.N1().toString(), " ", true, arrayList, this$0.rc_number, this$0.a2(), ws6Var.e(), "", ws6Var.k()));
    }

    public static final void v2(VahanGenerateOTPScreenV1 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) VahanUpdateMobileActivity.class));
        this$0.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void v3(EditText enterOtp, Context context, Ref.ObjectRef langSession, VahanGenerateOTPScreenV1 this$0, String mobile_no, View view) {
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
        if (this$0.R1().isShowing()) {
            this$0.R1().dismiss();
        }
        this$0.R1().show();
        this$0.k2().C1(this$0, mobile_no, this$0.rc_number, this$0.a2(), "M", this$0.T1(), string, "", new ws6(this$0).k(), this$0.H1());
    }

    public static final void w2(VahanGenerateOTPScreenV1 this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.M1().setEnabled(true);
            this$0.M1().setAlpha(1.0f);
        } else {
            if (z) {
                return;
            }
            this$0.M1().setEnabled(false);
            this$0.M1().setAlpha(0.5f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w3(EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        enterOtp.setText("");
    }

    public static final void x2(VahanGenerateOTPScreenV1 this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.R1().dismiss();
            if (!gd1.a.m(str)) {
                this$0.L2(str.toString());
                String strN1 = this$0.N1();
                if (strN1 == null || strN1.length() == 0 || StringsKt__StringsJVMKt.equals(this$0.N1(), "null", true)) {
                    this$0.J1().setText("NA");
                } else {
                    this$0.J1().setText(this$0.N1());
                }
            }
        } catch (Exception e2) {
            this$0.R1().dismiss();
            e2.printStackTrace();
        }
    }

    public static final void x3(VahanGenerateOTPScreenV1 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.d;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public static final void y2(VahanGenerateOTPScreenV1 this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.R1().dismiss();
    }

    private final void z2() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void A2(Context context, String message) {
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
        ((TextView) viewFindViewById).setText(Y1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(Y1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.n57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreenV1.B2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void C2(MyTextView myTextView) {
        Intrinsics.checkNotNullParameter(myTextView, "<set-?>");
        this.agreeTermCond = myTextView;
    }

    public final void D1(ld7 viewModelv1) {
        Intrinsics.checkNotNullParameter(viewModelv1, "viewModelv1");
        R1().show();
        viewModelv1.A0(this, this.rc_number, a2(), H1(), Q1());
    }

    public final void D2(gh ghVar) {
        Intrinsics.checkNotNullParameter(ghVar, "<set-?>");
        this.binding = ghVar;
    }

    public final String E1(HashMap serviceSelection_HashMap) {
        Intrinsics.checkNotNullParameter(serviceSelection_HashMap, "serviceSelection_HashMap");
        return serviceSelection_HashMap.containsKey(VContant.DUPLICATE_RC) ? ta3.a.P(this, "Issue of Duplicate RC") : serviceSelection_HashMap.containsKey(VContant.TRANFER_OF_OWNERSHIP) ? ta3.a.P(this, "Transfer of Ownership") : serviceSelection_HashMap.containsKey(VContant.CHANGE_OF_ADDRESS) ? ta3.a.P(this, "Change of Address in RC") : serviceSelection_HashMap.containsKey(VContant.HYPOTHICATION_TERMINATION) ? ta3.a.P(this, "Hypothecation Termination") : serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_CONTINUATION) ? ta3.a.P(this, "Hypothecation Continuation") : serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_ADDITION) ? ta3.a.P(this, "Hypothecation Addition") : serviceSelection_HashMap.containsKey(VContant.RCPARTICULAR) ? ta3.a.P(this, "RC Particulars against Fee") : serviceSelection_HashMap.containsKey(VContant.NOC) ? ta3.a.P(this, "No Objection Certificate (NOC)") : serviceSelection_HashMap.containsKey(VContant.DUPLICATE_FITNESS) ? ta3.a.P(this, "Duplicate Fitness Certificate") : serviceSelection_HashMap.containsKey(VContant.DUPLICATE_PERMIT) ? ta3.a.P(this, "Duplicate Permit Certificate") : serviceSelection_HashMap.containsKey(VContant.RC_SURRENDER) ? ta3.a.P(this, "RC Surrender") : serviceSelection_HashMap.containsKey(VContant.RC_CANCALATION) ? ta3.a.P(this, "RC Cancellation") : serviceSelection_HashMap.containsKey(VContant.PAY_TAX) ? ta3.a.P(this, "Pay Tax") : serviceSelection_HashMap.containsKey(VContant.PAY_TAXASS) ? ta3.a.P(this, "Tax Assessment") : serviceSelection_HashMap.containsKey(VContant.RC_RELEASE) ? ta3.a.P(this, "RC Release") : serviceSelection_HashMap.containsKey(VContant.Temp_Permit) ? ta3.a.P(this, "Temporary Permit") : serviceSelection_HashMap.containsKey(VContant.NP_Permit) ? ta3.a.P(this, "Renewal of NP Authorization Permit") : serviceSelection_HashMap.containsKey(VContant.PERMIT_RENEWAL) ? ta3.a.P(this, "Permit Renewal") : serviceSelection_HashMap.containsKey(VContant.Nominee_Addition) ? ta3.a.P(this, "Addition of Nominee") : serviceSelection_HashMap.containsKey(VContant.COMPOUND_FEE) ? ta3.a.P(this, "Compounding Fee Payment") : serviceSelection_HashMap.containsKey(VContant.MISELL_PAYMENT) ? ta3.a.P(this, "Miscellaneous Fee Payment") : serviceSelection_HashMap.containsKey(VContant.ALTERATION) ? ta3.a.P(this, "Alteration of Vehicle") : serviceSelection_HashMap.containsKey(VContant.MULTI_SELECT_SERVICE) ? ta3.a.P(this, "RC Services") : serviceSelection_HashMap.containsKey(VContant.SPEICAL_PERMIT) ? ta3.a.P(this, "Special Permit") : "";
    }

    public final void E2(CoordinatorLayout coordinatorLayout) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "<set-?>");
        this.bottom = coordinatorLayout;
    }

    public final MyTextView F1() {
        MyTextView myTextView = this.agreeTermCond;
        if (myTextView != null) {
            return myTextView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("agreeTermCond");
        return null;
    }

    public final void F2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.chassiNo = str;
    }

    public final gh G1() {
        gh ghVar = this.binding;
        if (ghVar != null) {
            return ghVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void G2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.disPlay = textView;
    }

    public final String H1() {
        String str = this.chassiNo;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chassiNo");
        return null;
    }

    public final void H2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.edit_mobile_number = textView;
    }

    /* JADX INFO: renamed from: I1, reason: from getter */
    public final Dialog getD() {
        return this.d;
    }

    public final void I2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.enterMobileTv = textView;
    }

    public final TextView J1() {
        TextView textView = this.edit_mobile_number;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("edit_mobile_number");
        return null;
    }

    public final void J2(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.enterOtp = editText;
    }

    public final EditText K1() {
        EditText editText = this.enterOtp;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("enterOtp");
        return null;
    }

    public final void K2(AppCompatButton appCompatButton) {
        Intrinsics.checkNotNullParameter(appCompatButton, "<set-?>");
        this.generateOtp = appCompatButton;
    }

    /* JADX INFO: renamed from: L1, reason: from getter */
    public final String getFlage() {
        return this.flage;
    }

    public final void L2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobile_number = str;
    }

    public final AppCompatButton M1() {
        AppCompatButton appCompatButton = this.generateOtp;
        if (appCompatButton != null) {
            return appCompatButton;
        }
        Intrinsics.throwUninitializedPropertyAccessException("generateOtp");
        return null;
    }

    public final void M2(AppCompatImageView appCompatImageView) {
        Intrinsics.checkNotNullParameter(appCompatImageView, "<set-?>");
        this.mvvm_back = appCompatImageView;
    }

    public final String N1() {
        String str = this.mobile_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mobile_number");
        return null;
    }

    public final void N2(RelativeLayout relativeLayout) {
        Intrinsics.checkNotNullParameter(relativeLayout, "<set-?>");
        this.nexGenHolder = relativeLayout;
    }

    public final AppCompatImageView O1() {
        AppCompatImageView appCompatImageView = this.mvvm_back;
        if (appCompatImageView != null) {
            return appCompatImageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mvvm_back");
        return null;
    }

    public final void O2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.note_text = textView;
    }

    public final RelativeLayout P1() {
        RelativeLayout relativeLayout = this.nexGenHolder;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nexGenHolder");
        return null;
    }

    public final void P2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final String Q1() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    public final void Q2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.otpId = str;
    }

    public final ProgressDialog R1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final void R2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final VahanProService S1() {
        VahanProService vahanProService = this.proservice;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("proservice");
        return null;
    }

    public final void S2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.proservice = vahanProService;
    }

    public final String T1() {
        String str = this.purCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("purCode");
        return null;
    }

    public final void T2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.purCode = str;
    }

    public final MyTextView U1() {
        MyTextView myTextView = this.resendOtp;
        if (myTextView != null) {
            return myTextView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("resendOtp");
        return null;
    }

    public final void U2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rcNo = str;
    }

    public final AppCompatButton V1() {
        AppCompatButton appCompatButton = this.reset;
        if (appCompatButton != null) {
            return appCompatButton;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reset");
        return null;
    }

    public final void V2(MyTextView myTextView) {
        Intrinsics.checkNotNullParameter(myTextView, "<set-?>");
        this.resendOtp = myTextView;
    }

    public final VahanServiceConnection W1() {
        VahanServiceConnection vahanServiceConnection = this.retrofitService;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final void W2(AppCompatButton appCompatButton) {
        Intrinsics.checkNotNullParameter(appCompatButton, "<set-?>");
        this.reset = appCompatButton;
    }

    /* JADX INFO: renamed from: X1, reason: from getter */
    public final HashMap getServiceSelection_HashMap() {
        return this.serviceSelection_HashMap;
    }

    public final void X2(VahanServiceConnection vahanServiceConnection) {
        Intrinsics.checkNotNullParameter(vahanServiceConnection, "<set-?>");
        this.retrofitService = vahanServiceConnection;
    }

    public final wa3 Y1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final void Y2(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.selectedServiceTv = textView;
    }

    public final ImageView Z1() {
        ImageView imageView = this.shownPin;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shownPin");
        return null;
    }

    public final void Z2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final String a2() {
        String str = this.stateCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stateCode");
        return null;
    }

    public final void a3(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.session_manger = ws6Var;
    }

    public final TextView b2() {
        TextView textView = this.submitOtp;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("submitOtp");
        return null;
    }

    public final void b3(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.shownPin = imageView;
    }

    public final CheckBox c2() {
        CheckBox checkBox = this.term_condition;
        if (checkBox != null) {
            return checkBox;
        }
        Intrinsics.throwUninitializedPropertyAccessException("term_condition");
        return null;
    }

    public final void c3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCode = str;
    }

    public final MyTextView d2() {
        MyTextView myTextView = this.time_text;
        if (myTextView != null) {
            return myTextView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("time_text");
        return null;
    }

    public final void d3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.submitOtp = textView;
    }

    public final TextView e2() {
        TextView textView = this.txtVehicleNumber;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtVehicleNumber");
        return null;
    }

    public final void e3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.termCndLl = linearLayout;
    }

    public final TextView f2() {
        TextView textView = this.txt_reset;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txt_reset");
        return null;
    }

    public final void f3(CheckBox checkBox) {
        Intrinsics.checkNotNullParameter(checkBox, "<set-?>");
        this.term_condition = checkBox;
    }

    public final TextView g2() {
        TextView textView = this.update_mob;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("update_mob");
        return null;
    }

    public final void g3(MyTextView myTextView) {
        Intrinsics.checkNotNullParameter(myTextView, "<set-?>");
        this.time_text = myTextView;
    }

    public final VahanServiceConnection h2() {
        VahanServiceConnection vahanServiceConnection = this.verifyOtpRetrofitService;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("verifyOtpRetrofitService");
        return null;
    }

    public final void h3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtVehicleNumber = textView;
    }

    public final lk7 i2() {
        lk7 lk7Var = this.verifyOtpViewModel;
        if (lk7Var != null) {
            return lk7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("verifyOtpViewModel");
        return null;
    }

    public final void i3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txt_reset = textView;
    }

    public final al7 j2() {
        al7 al7Var = this.viewModel;
        if (al7Var != null) {
            return al7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void j3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.update_mob = textView;
    }

    public final ld7 k2() {
        ld7 ld7Var = this.viewModelv1;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelv1");
        return null;
    }

    public final void k3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.verifyOtpBtn = linearLayout;
    }

    public final void l3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.verifyOtpLl = linearLayout;
    }

    public final void m3(VahanServiceConnection vahanServiceConnection) {
        Intrinsics.checkNotNullParameter(vahanServiceConnection, "<set-?>");
        this.verifyOtpRetrofitService = vahanServiceConnection;
    }

    public final void n3(lk7 lk7Var) {
        Intrinsics.checkNotNullParameter(lk7Var, "<set-?>");
        this.verifyOtpViewModel = lk7Var;
    }

    public final void o3(al7 al7Var) {
        Intrinsics.checkNotNullParameter(al7Var, "<set-?>");
        this.viewModel = al7Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vahan_generate_o_t_p_screen);
        gh ghVarC = gh.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ghVarC, "inflate(...)");
        D2(ghVarC);
        setContentView(G1().b());
        getWindow().addFlags(128);
        Z2(new wa3(this));
        View viewFindViewById = findViewById(R.id.bottom);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        E2((CoordinatorLayout) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.generate_otp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        K2((AppCompatButton) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.reset_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        W2((AppCompatButton) viewFindViewById3);
        ta3.a.M2(this, G1(), V1(), M1());
        View viewFindViewById4 = findViewById(R.id.txt_vehicle_number);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        h3((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.term_condition);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        f3((CheckBox) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.edit_mobile_number);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        H2((TextView) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.mvvm_back);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        M2((AppCompatImageView) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.nexGenHolder);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        N2((RelativeLayout) viewFindViewById8);
        View viewFindViewById9 = findViewById(R.id.agreeTermCond);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        C2((MyTextView) viewFindViewById9);
        View viewFindViewById10 = findViewById(R.id.selectedServiceTv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        Y2((TextView) viewFindViewById10);
        View viewFindViewById11 = findViewById(R.id.note_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        O2((TextView) viewFindViewById11);
        S2(VahanProService.INSTANCE.a(this));
        this.d = new Dialog(this);
        O1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.i57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreenV1.l2(this.a, view);
            }
        });
        p3((ld7) new z(this, new kd7(new jd7(S1()))).a(ld7.class));
        VahanServiceConnection.Companion companion = VahanServiceConnection.INSTANCE;
        X2(companion.a(this));
        m3(companion.a(this));
        View viewFindViewById12 = findViewById(R.id.enterMobileTv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        I2((TextView) viewFindViewById12);
        View viewFindViewById13 = findViewById(R.id.termCndLl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        e3((LinearLayout) viewFindViewById13);
        View viewFindViewById14 = findViewById(R.id.verifyOtpLl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        l3((LinearLayout) viewFindViewById14);
        View viewFindViewById15 = findViewById(R.id.disPlay);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
        G2((TextView) viewFindViewById15);
        View viewFindViewById16 = findViewById(R.id.enterOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "findViewById(...)");
        J2((EditText) viewFindViewById16);
        View viewFindViewById17 = findViewById(R.id.showmpin);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById17, "findViewById(...)");
        b3((ImageView) viewFindViewById17);
        View viewFindViewById18 = findViewById(R.id.time_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById18, "findViewById(...)");
        g3((MyTextView) viewFindViewById18);
        View viewFindViewById19 = findViewById(R.id.resendOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById19, "findViewById(...)");
        V2((MyTextView) viewFindViewById19);
        View viewFindViewById20 = findViewById(R.id.verifyOtpBtn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById20, "findViewById(...)");
        k3((LinearLayout) viewFindViewById20);
        View viewFindViewById21 = findViewById(R.id.submitOtp);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById21, "findViewById(...)");
        d3((TextView) viewFindViewById21);
        View viewFindViewById22 = findViewById(R.id.txt_reset);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById22, "findViewById(...)");
        i3((TextView) viewFindViewById22);
        View viewFindViewById23 = findViewById(R.id.update_mob);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById23, "findViewById(...)");
        j3((TextView) viewFindViewById23);
        M1().setEnabled(false);
        M1().setAlpha(0.5f);
        R2(new ProgressDialog(this));
        R1().setMessage("Please wait...");
        R1().setCancelable(false);
        R1().setCanceledOnTouchOutside(false);
        a3(new ws6(this));
        n3((lk7) new z(this, new kk7(new bg7(h2()))).a(lk7.class));
        o3((al7) new z(this, new bl7(new bg7(W1()))).a(al7.class));
        if (getIntent() != null) {
            si2 si2Var = (si2) getIntent().getParcelableExtra(VContant.MOBAUTH);
            Intrinsics.checkNotNull(si2Var);
            this.rc_number = si2Var.g();
            this.serviceSelection_HashMap = si2Var.h();
            P2(si2Var.e());
            T2(si2Var.f());
            c3(si2Var.i());
            F2(si2Var.c());
            this.flage = si2Var.d();
            String str = this.rc_number;
            if (str != null && str.length() != 0) {
                e2().setText(this.rc_number.toString());
            }
            D1(k2());
        }
        if (this.serviceSelection_HashMap.size() > 0) {
            if (this.serviceSelection_HashMap.containsKey(VContant.M_VALUE)) {
                G1().p.i.setText(VContant.INSTANCE.L(this, T1()));
            } else {
                G1().p.i.setText(E1(this.serviceSelection_HashMap));
            }
        }
        if (this.serviceSelection_HashMap.containsKey(VContant.MULTI_SELECT_SERVICE)) {
            G1().p.e.setVisibility(8);
        }
        P1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.x57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreenV1.m2(this.a, view);
            }
        });
        M1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.y57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreenV1.t2(this.a, view);
            }
        });
        V1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.z57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreenV1.u2(this.a, view);
            }
        });
        g2().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.a67
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreenV1.v2(this.a, view);
            }
        });
        c2().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.b67
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                VahanGenerateOTPScreenV1.w2(this.a, compoundButton, z);
            }
        });
        k2().x0().g(this, new mf4() { // from class: com.zepto.c67
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanGenerateOTPScreenV1.x2(this.a, (String) obj);
            }
        });
        k2().y0().g(this, new mf4() { // from class: com.zepto.j57
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanGenerateOTPScreenV1.y2(this.a, (String) obj);
            }
        });
        j2().h().g(this, new k(new j()));
        k2().d1().g(this, new k(new a()));
        k2().i1().g(this, new k(new b()));
        k2().j1().g(this, new k(new c()));
        j2().i().g(this, new k(new d()));
        j2().g().g(this, new k(new e()));
        F1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.k57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreenV1.n2(this.a, view);
            }
        });
        U1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.l57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreenV1.p2(this.a, view);
            }
        });
        Z1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.t57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreenV1.q2(this.a, view);
            }
        });
        k2().g1().g(this, new k(new g()));
        b2().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.v57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreenV1.r2(this.a, view);
            }
        });
        k2().e1().g(this, new k(new h()));
        k2().f1().g(this, new k(new i()));
        f2().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.w57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreenV1.s2(this.a, view);
            }
        });
    }

    public final void p3(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModelv1 = ld7Var;
    }

    public final void q3(Context context, String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.m57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreenV1.r3(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, com.zepto.wa3] */
    public final void s3(final Context context, final String mobile_no, String developermess) {
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
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.p57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreenV1.t3(editText, imageView2, view);
            }
        });
        final TextView textView8 = textView3;
        final TextView textView9 = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.q57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreenV1.u3(this.a, textView8, objectRef, context, textView9, view);
            }
        });
        final EditText editText2 = editText;
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.r57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreenV1.v3(editText2, context, objectRef, this, mobile_no, view);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.s57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreenV1.w3(editText, view);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.u57
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanGenerateOTPScreenV1.x3(this.a, view);
            }
        });
        Dialog dialog16 = this.d;
        if (dialog16 != null) {
            dialog16.show();
        }
    }
}
