package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Tax.PayTaxActivity;
import com.nic.mparivahan.VahanServices.SlotAppointmentBookingActivity;
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanApplicationTransactionStatus;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.ApplStatusTransListModel;
import com.nic.mparivahan.VahanServices.VahanModel.FeesModle;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.OwnerDetailPuccPermit;
import com.nic.mparivahan.VahanServices.VahanModel.RequireDataForBePaymet;
import com.nic.mparivahan.VahanServices.VahanModel.SlotUserDataModel;
import com.nic.mparivahan.VahanServices.VahanPayment.VahanPayment;
import com.nic.mparivahan.VahanServices.VahanPayment.VahanPaymentStatusScreen;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequestfinal;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.PaymentBeforeUrlResponse;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationService;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationServiceOtp;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection;
import com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI;
import com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload;
import com.nic.mparivahan.VahanServices.VahanView.VahanGenerateOTPScreenV1;
import com.nic.mparivahan.VahanServices.VahanView.VahanProcessWithAdharV1;
import com.nic.mparivahan.VahanServices.VahanViewModel.PendingTransTaxBreakUpModel;
import com.nic.mparivahan.VahanServices.VahanViewModel.VahanPendingTransBankModel;
import com.zepto.al7;
import com.zepto.bg7;
import com.zepto.bl7;
import com.zepto.db3;
import com.zepto.e03;
import com.zepto.gd1;
import com.zepto.gf;
import com.zepto.hf;
import com.zepto.hz0;
import com.zepto.jd7;
import com.zepto.jv;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf;
import com.zepto.mf4;
import com.zepto.of;
import com.zepto.pq;
import com.zepto.qw;
import com.zepto.rv6;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.yy0;
import java.lang.reflect.Type;
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
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bå\u0001\u0010æ\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0003J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0003J\u001a\u0010\r\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0003J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\u0012\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0014\u001a\u00020\u0002H\u0014J\b\u0010\u0015\u001a\u00020\u0002H\u0014J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0005J\u001e\u0010 \u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0005J\u000e\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!J\u0006\u0010$\u001a\u00020\u0002R\u0014\u0010'\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-R\u0016\u00102\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010-R\u0016\u00104\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010-R\u0016\u00106\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010-R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010D\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010-\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR&\u0010J\u001a\u0012\u0012\u0004\u0012\u00020F0Ej\b\u0012\u0004\u0012\u00020F`G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010N\u001a\u00020K8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bL\u0010MR2\u0010S\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050Oj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\"\u0010[\u001a\u00020T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010_\u001a\u00020T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010V\u001a\u0004\b]\u0010X\"\u0004\b^\u0010ZR\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010o\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010w\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR$\u0010\u007f\u001a\u0004\u0018\u00010x8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R&\u0010\u0083\u0001\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010-\u001a\u0005\b\u0081\u0001\u0010A\"\u0005\b\u0082\u0001\u0010CR*\u0010\u008b\u0001\u001a\u00030\u0084\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R*\u0010\u0093\u0001\u001a\u00030\u008c\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R&\u0010\u0097\u0001\u001a\u00020T8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0094\u0001\u0010V\u001a\u0005\b\u0095\u0001\u0010X\"\u0005\b\u0096\u0001\u0010ZR&\u0010\u009b\u0001\u001a\u00020T8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0098\u0001\u0010V\u001a\u0005\b\u0099\u0001\u0010X\"\u0005\b\u009a\u0001\u0010ZR%\u0010\u009e\u0001\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\bV\u0010r\u001a\u0005\b\u009c\u0001\u0010t\"\u0005\b\u009d\u0001\u0010vR&\u0010¢\u0001\u001a\u00020h8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009f\u0001\u0010j\u001a\u0005\b \u0001\u0010l\"\u0005\b¡\u0001\u0010nR&\u0010¦\u0001\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b£\u0001\u0010-\u001a\u0005\b¤\u0001\u0010A\"\u0005\b¥\u0001\u0010CR&\u0010ª\u0001\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b§\u0001\u0010-\u001a\u0005\b¨\u0001\u0010A\"\u0005\b©\u0001\u0010CR&\u0010®\u0001\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b«\u0001\u0010-\u001a\u0005\b¬\u0001\u0010A\"\u0005\b\u00ad\u0001\u0010CR&\u0010²\u0001\u001a\u00020T8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¯\u0001\u0010V\u001a\u0005\b°\u0001\u0010X\"\u0005\b±\u0001\u0010ZR&\u0010¶\u0001\u001a\u00020T8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b³\u0001\u0010V\u001a\u0005\b´\u0001\u0010X\"\u0005\bµ\u0001\u0010ZR&\u0010¸\u0001\u001a\u00020T8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b·\u0001\u0010V\u001a\u0005\b¸\u0001\u0010X\"\u0005\b¹\u0001\u0010ZR&\u0010½\u0001\u001a\u00020T8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bº\u0001\u0010V\u001a\u0005\b»\u0001\u0010X\"\u0005\b¼\u0001\u0010ZR&\u0010Á\u0001\u001a\u00020T8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¾\u0001\u0010V\u001a\u0005\b¿\u0001\u0010X\"\u0005\bÀ\u0001\u0010ZR&\u0010Å\u0001\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÂ\u0001\u0010-\u001a\u0005\bÃ\u0001\u0010A\"\u0005\bÄ\u0001\u0010CR\u001a\u0010É\u0001\u001a\u00030Æ\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001R\u001a\u0010Í\u0001\u001a\u00030Ê\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R(\u0010\"\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÎ\u0001\u0010Ï\u0001\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\"\u0006\bÒ\u0001\u0010Ó\u0001R&\u0010×\u0001\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÔ\u0001\u0010-\u001a\u0005\bÕ\u0001\u0010A\"\u0005\bÖ\u0001\u0010CR(\u0010Û\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bØ\u0001\u0010-\u001a\u0005\bÙ\u0001\u0010A\"\u0005\bÚ\u0001\u0010CR#\u0010à\u0001\u001a\f\u0012\u0005\u0012\u00030Ý\u0001\u0018\u00010Ü\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÞ\u0001\u0010ß\u0001R&\u0010ä\u0001\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bá\u0001\u0010-\u001a\u0005\bâ\u0001\u0010A\"\u0005\bã\u0001\u0010C¨\u0006ç\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanApplicationStatus/VahanApplicationTransactionStatus;", "Lcom/zepto/pq;", "", "m2", "E2", "", "appl_no", "T1", "it", "H2", "b3", "Landroid/content/Context;", "context", "L2", "G2", "e3", "S1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onStart", "onResume", "onBackPressed", "message", "f3", "h3", "V1", "rc_chasi_no", "O2", "authMode", "purCode", "m_value", "F2", "Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;", "paymentRequest", "U1", "K2", "C", "Landroid/content/Context;", "mContext", "Lcom/zepto/db3;", "D", "Lcom/zepto/db3;", "binding", "E", "Ljava/lang/String;", "applNo", "F", "ownerName", "G", "stateCd", "H", "registratioNo", "I", "paymentUrl", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "J", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "a2", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "P2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "nrvDetails", "K", "d2", "()Ljava/lang/String;", "S2", "(Ljava/lang/String;)V", "p_code", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/VahanModel/ApplStatusTransListModel;", "Lkotlin/collections/ArrayList;", "L", "Ljava/util/ArrayList;", "transList", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationServiceOtp;", "M", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationServiceOtp;", "otpRetrofitService", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "N", "Ljava/util/HashMap;", "stateList", "", "O", "Z", "getFacelesstransaction", "()Z", "setFacelesstransaction", "(Z)V", "facelesstransaction", "P", "getAppointmentpending", "setAppointmentpending", "appointmentpending", "Landroid/app/ProgressDialog;", "Q", "Landroid/app/ProgressDialog;", "c2", "()Landroid/app/ProgressDialog;", "R2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/ld7;", "R", "Lcom/zepto/ld7;", "k2", "()Lcom/zepto/ld7;", "Z2", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "S", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "g2", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "V2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Lcom/nic/mparivahan/VahanServices/VahanModel/RequireDataForBePaymet;", "T", "Lcom/nic/mparivahan/VahanServices/VahanModel/RequireDataForBePaymet;", "getReqBeforPayment", "()Lcom/nic/mparivahan/VahanServices/VahanModel/RequireDataForBePaymet;", "setReqBeforPayment", "(Lcom/nic/mparivahan/VahanServices/VahanModel/RequireDataForBePaymet;)V", "reqBeforPayment", "U", "f2", "setPur_code", "pur_code", "Lcom/zepto/al7;", "V", "Lcom/zepto/al7;", "l2", "()Lcom/zepto/al7;", "a3", "(Lcom/zepto/al7;)V", "viewModel1", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "W", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "h2", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "W2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;)V", "retrofitService1", "X", "getIsdocuploadpending", "setIsdocuploadpending", "isdocuploadpending", "Y", "getIsrtorejection", "setIsrtorejection", "isrtorejection", "i2", "X2", "slotService", "a0", "j2", "Y2", "slotViewModel", "b0", "getCurrent_status", "setCurrent_status", "current_status", "c0", "getAuthStatus", "setAuthStatus", "authStatus", "d0", "getTotal_amount", "setTotal_amount", "total_amount", "e0", "getSlotFlag", "setSlotFlag", "slotFlag", "f0", "getPaymentFlag", "T2", "paymentFlag", "g0", "isAppPending", "setAppPending", "h0", "getAppointmentRequired", "setAppointmentRequired", "appointmentRequired", "i0", "getDocumentsRequired", "setDocumentsRequired", "documentsRequired", "j0", "b2", "Q2", "off_code", "Lcom/zepto/jv;", "k0", "Lcom/zepto/jv;", "viewModelPayment", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationService;", "l0", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationService;", "paymentService", "m0", "Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;", "e2", "()Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;", "U2", "(Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;)V", "n0", "Y1", "setChassino", "chassino", "o0", "getCurrentl", "setCurrentl", "currentl", "Lcom/zepto/of;", "Landroid/content/Intent;", "p0", "Lcom/zepto/of;", "launcher", "q0", "Z1", "setMethorName", "methorName", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanApplicationTransactionStatus extends pq {

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public db3 binding;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public NrvDetails nrvDetails;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ApplicationServiceOtp otpRetrofitService;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public boolean facelesstransaction;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public boolean appointmentpending;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public ld7 viewModel;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public VahanProService retrofitService;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public RequireDataForBePaymet reqBeforPayment;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public al7 viewModel1;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public VahanServiceConnection retrofitService1;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public boolean isdocuploadpending;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public boolean isrtorejection;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public VahanProService slotService;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public ld7 slotViewModel;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public boolean slotFlag;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public boolean paymentFlag;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public boolean isAppPending;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public jv viewModelPayment;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public ApplicationService paymentService;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public BeforePaymentRequest paymentRequest;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public of launcher;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public final Context mContext = this;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String applNo = "";

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String ownerName = "";

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String stateCd = "";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String registratioNo = "";

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String paymentUrl = "";

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String p_code = "0";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public ArrayList transList = new ArrayList();

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public HashMap stateList = new HashMap();

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String pur_code = "0";

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String current_status = " ";

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public String authStatus = "M";

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public String total_amount = " ";

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public boolean appointmentRequired = true;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public boolean documentsRequired = true;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public String chassino = "00000";

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public String currentl = "00000";

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public String methorName = "";

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
            if (VahanApplicationTransactionStatus.this.c2().isShowing()) {
                VahanApplicationTransactionStatus.this.c2().dismiss();
            }
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

        public final void invoke(String str) {
            if (VahanApplicationTransactionStatus.this.c2().isShowing()) {
                VahanApplicationTransactionStatus.this.c2().dismiss();
            }
            if (str.equals("Error")) {
                VahanApplicationTransactionStatus.this.b3("Not able to verify payment from bank. Please try again later");
            } else {
                VahanApplicationTransactionStatus.this.b3(str);
            }
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(OwnerDetailPuccPermit ownerDetailPuccPermit) {
            try {
                String regn_no = ownerDetailPuccPermit.getRegn_no();
                if (regn_no != null && regn_no.length() != 0) {
                    Intrinsics.checkNotNull(ownerDetailPuccPermit);
                    VahanApplicationTransactionStatus.this.P2(VContant.INSTANCE.c(ownerDetailPuccPermit.copy(((-32769) & 1) != 0 ? ownerDetailPuccPermit.aadhar_no : null, ((-32769) & 2) != 0 ? ownerDetailPuccPermit.ac_fitted : null, ((-32769) & 4) != 0 ? ownerDetailPuccPermit.annual_income : null, ((-32769) & 8) != 0 ? ownerDetailPuccPermit.appl_no : null, ((-32769) & 16) != 0 ? ownerDetailPuccPermit.audio_fitted : null, ((-32769) & 32) != 0 ? ownerDetailPuccPermit.body_type : null, ((-32769) & 64) != 0 ? ownerDetailPuccPermit.c_add1 : null, ((-32769) & 128) != 0 ? ownerDetailPuccPermit.c_add2 : null, ((-32769) & 256) != 0 ? ownerDetailPuccPermit.c_add3 : null, ((-32769) & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.c_district : null, ((-32769) & 1024) != 0 ? ownerDetailPuccPermit.c_district_name : null, ((-32769) & 2048) != 0 ? ownerDetailPuccPermit.c_off_cd : null, ((-32769) & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.c_pincode : null, ((-32769) & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.c_state : null, ((-32769) & 16384) != 0 ? ownerDetailPuccPermit.c_state_name : null, ((-32769) & 32768) != 0 ? ownerDetailPuccPermit.chasi_no : VahanApplicationTransactionStatus.this.getChassino(), ((-32769) & 65536) != 0 ? ownerDetailPuccPermit.chasi_no_original : null, ((-32769) & 131072) != 0 ? ownerDetailPuccPermit.color : null, ((-32769) & 262144) != 0 ? ownerDetailPuccPermit.conditionstatus : null, ((-32769) & 524288) != 0 ? ownerDetailPuccPermit.cubic_cap : null, ((-32769) & 1048576) != 0 ? ownerDetailPuccPermit.dealer_cd : null, ((-32769) & 2097152) != 0 ? ownerDetailPuccPermit.dept_cd : null, ((-32769) & 4194304) != 0 ? ownerDetailPuccPermit.dlRequired : null, ((-32769) & 8388608) != 0 ? ownerDetailPuccPermit.dlValidationRequired : null, ((-32769) & 16777216) != 0 ? ownerDetailPuccPermit.dl_no : null, ((-32769) & 33554432) != 0 ? ownerDetailPuccPermit.dlr_add1 : null, ((-32769) & 67108864) != 0 ? ownerDetailPuccPermit.dlr_add2 : null, ((-32769) & 134217728) != 0 ? ownerDetailPuccPermit.dlr_add3 : null, ((-32769) & 268435456) != 0 ? ownerDetailPuccPermit.dlr_city : null, ((-32769) & 536870912) != 0 ? ownerDetailPuccPermit.dlr_district : null, ((-32769) & 1073741824) != 0 ? ownerDetailPuccPermit.dlr_name : null, ((-32769) & IntCompanionObject.MIN_VALUE) != 0 ? ownerDetailPuccPermit.dlr_pincode : null, ((-1) & 1) != 0 ? ownerDetailPuccPermit.email_id : null, ((-1) & 2) != 0 ? ownerDetailPuccPermit.eng_no : null, ((-1) & 4) != 0 ? ownerDetailPuccPermit.eng_no_original : null, ((-1) & 8) != 0 ? ownerDetailPuccPermit.eng_no_orignal : null, ((-1) & 16) != 0 ? ownerDetailPuccPermit.f_name : null, ((-1) & 32) != 0 ? ownerDetailPuccPermit.fit_upto : null, ((-1) & 64) != 0 ? ownerDetailPuccPermit.fit_uptoAsDate : null, ((-1) & 128) != 0 ? ownerDetailPuccPermit.fit_upto_desc : null, ((-1) & 256) != 0 ? ownerDetailPuccPermit.flag : null, ((-1) & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.floor_area : null, ((-1) & 1024) != 0 ? ownerDetailPuccPermit.formatRegn_dt : null, ((-1) & 2048) != 0 ? ownerDetailPuccPermit.fuel : null, ((-1) & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.fuel_descr : null, ((-1) & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.garage_add : null, ((-1) & 16384) != 0 ? ownerDetailPuccPermit.gcw : null, ((-1) & 32768) != 0 ? ownerDetailPuccPermit.height : null, ((-1) & 65536) != 0 ? ownerDetailPuccPermit.hp : null, ((-1) & 131072) != 0 ? ownerDetailPuccPermit.imported_vch : null, ((-1) & 262144) != 0 ? ownerDetailPuccPermit.laser_code : null, ((-1) & 524288) != 0 ? ownerDetailPuccPermit.ld_wt : null, ((-1) & 1048576) != 0 ? ownerDetailPuccPermit.length : null, ((-1) & 2097152) != 0 ? ownerDetailPuccPermit.maker : null, ((-1) & 4194304) != 0 ? ownerDetailPuccPermit.maker_name : null, ((-1) & 8388608) != 0 ? ownerDetailPuccPermit.manu_mon : null, ((-1) & 16777216) != 0 ? ownerDetailPuccPermit.manu_yr : null, ((-1) & 33554432) != 0 ? ownerDetailPuccPermit.mobileNoEditable : null, ((-1) & 67108864) != 0 ? ownerDetailPuccPermit.mobile_no : null, ((-1) & 134217728) != 0 ? ownerDetailPuccPermit.model_cd : null, ((-1) & 268435456) != 0 ? ownerDetailPuccPermit.model_name : null, ((-1) & 536870912) != 0 ? ownerDetailPuccPermit.no_cyl : null, ((-1) & 1073741824) != 0 ? ownerDetailPuccPermit.no_of_axles : null, ((-1) & IntCompanionObject.MIN_VALUE) != 0 ? ownerDetailPuccPermit.norms : null, ((-1) & 1) != 0 ? ownerDetailPuccPermit.norms_descr : null, ((-1) & 2) != 0 ? ownerDetailPuccPermit.numberOfTyres : null, ((-1) & 4) != 0 ? ownerDetailPuccPermit.off_cd : null, ((-1) & 8) != 0 ? ownerDetailPuccPermit.off_name : null, ((-1) & 16) != 0 ? ownerDetailPuccPermit.op_dt : null, ((-1) & 32) != 0 ? ownerDetailPuccPermit.other_criteria : null, ((-1) & 64) != 0 ? ownerDetailPuccPermit.ownerCatg : null, ((-1) & 128) != 0 ? ownerDetailPuccPermit.ownerIdentification : null, ((-1) & 256) != 0 ? ownerDetailPuccPermit.owner_cd : null, ((-1) & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.owner_cd_descr : null, ((-1) & 1024) != 0 ? ownerDetailPuccPermit.owner_ctg : null, ((-1) & 2048) != 0 ? ownerDetailPuccPermit.owner_name : null, ((-1) & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.owner_sr : null, ((-1) & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.p_add1 : null, ((-1) & 16384) != 0 ? ownerDetailPuccPermit.p_add2 : null, ((-1) & 32768) != 0 ? ownerDetailPuccPermit.p_add3 : null, ((-1) & 65536) != 0 ? ownerDetailPuccPermit.p_district : null, ((-1) & 131072) != 0 ? ownerDetailPuccPermit.p_district_name : null, ((-1) & 262144) != 0 ? ownerDetailPuccPermit.p_pincode : null, ((-1) & 524288) != 0 ? ownerDetailPuccPermit.p_state : null, ((-1) & 1048576) != 0 ? ownerDetailPuccPermit.p_state_name : null, ((-1) & 2097152) != 0 ? ownerDetailPuccPermit.pan_no : null, ((-1) & 4194304) != 0 ? ownerDetailPuccPermit.passport_no : null, ((-1) & 8388608) != 0 ? ownerDetailPuccPermit.permitDetailEntity : null, ((-1) & 16777216) != 0 ? ownerDetailPuccPermit.permit_rto_cd : null, ((-1) & 33554432) != 0 ? ownerDetailPuccPermit.purchase_date : null, ((-1) & 67108864) != 0 ? ownerDetailPuccPermit.purchase_dt : null, ((-1) & 134217728) != 0 ? ownerDetailPuccPermit.ration_card_no : null, ((-1) & 268435456) != 0 ? ownerDetailPuccPermit.regn_dt : null, ((-1) & 536870912) != 0 ? ownerDetailPuccPermit.regn_dtAsDate : null, ((-1) & 1073741824) != 0 ? ownerDetailPuccPermit.regn_no : null, ((-1) & IntCompanionObject.MIN_VALUE) != 0 ? ownerDetailPuccPermit.regn_type : null, (IntCompanionObject.MAX_VALUE & 1) != 0 ? ownerDetailPuccPermit.regn_type_descr : null, (IntCompanionObject.MAX_VALUE & 2) != 0 ? ownerDetailPuccPermit.regn_upto : null, (IntCompanionObject.MAX_VALUE & 4) != 0 ? ownerDetailPuccPermit.regn_uptoAsDate : null, (IntCompanionObject.MAX_VALUE & 8) != 0 ? ownerDetailPuccPermit.returnMessge : null, (IntCompanionObject.MAX_VALUE & 16) != 0 ? ownerDetailPuccPermit.sale_amt : null, (IntCompanionObject.MAX_VALUE & 32) != 0 ? ownerDetailPuccPermit.seat_cap : null, (IntCompanionObject.MAX_VALUE & 64) != 0 ? ownerDetailPuccPermit.sleeper_cap : null, (IntCompanionObject.MAX_VALUE & 128) != 0 ? ownerDetailPuccPermit.stand_cap : null, (IntCompanionObject.MAX_VALUE & 256) != 0 ? ownerDetailPuccPermit.state_cd : null, (IntCompanionObject.MAX_VALUE & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.state_name : null, (IntCompanionObject.MAX_VALUE & 1024) != 0 ? ownerDetailPuccPermit.status : null, (IntCompanionObject.MAX_VALUE & 2048) != 0 ? ownerDetailPuccPermit.tax_mode : null, (IntCompanionObject.MAX_VALUE & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.transport_catg : null, (IntCompanionObject.MAX_VALUE & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.unld_wt : null, (IntCompanionObject.MAX_VALUE & 16384) != 0 ? ownerDetailPuccPermit.vch_catg : null, (IntCompanionObject.MAX_VALUE & 32768) != 0 ? ownerDetailPuccPermit.vch_catg_desc : null, (IntCompanionObject.MAX_VALUE & 65536) != 0 ? ownerDetailPuccPermit.vch_purchase_as : null, (IntCompanionObject.MAX_VALUE & 131072) != 0 ? ownerDetailPuccPermit.vch_purchase_asCode : null, (IntCompanionObject.MAX_VALUE & 262144) != 0 ? ownerDetailPuccPermit.vehType : null, (IntCompanionObject.MAX_VALUE & 524288) != 0 ? ownerDetailPuccPermit.vehTypeAsInt : null, (IntCompanionObject.MAX_VALUE & 1048576) != 0 ? ownerDetailPuccPermit.vh_class : null, (IntCompanionObject.MAX_VALUE & 2097152) != 0 ? ownerDetailPuccPermit.vh_class_desc : null, (IntCompanionObject.MAX_VALUE & 4194304) != 0 ? ownerDetailPuccPermit.video_fitted : null, (IntCompanionObject.MAX_VALUE & 8388608) != 0 ? ownerDetailPuccPermit.voter_id : null, (IntCompanionObject.MAX_VALUE & 16777216) != 0 ? ownerDetailPuccPermit.vtInsuranceCommonDto : null, (IntCompanionObject.MAX_VALUE & 33554432) != 0 ? ownerDetailPuccPermit.vtpucc : null, (IntCompanionObject.MAX_VALUE & 67108864) != 0 ? ownerDetailPuccPermit.wheelbase : null, (IntCompanionObject.MAX_VALUE & 134217728) != 0 ? ownerDetailPuccPermit.width : null, (IntCompanionObject.MAX_VALUE & 268435456) != 0 ? ownerDetailPuccPermit.vTHypthEntity : null, (IntCompanionObject.MAX_VALUE & 536870912) != 0 ? ownerDetailPuccPermit.latesttaxdetails : null, (IntCompanionObject.MAX_VALUE & 1073741824) != 0 ? ownerDetailPuccPermit.permitDetailDto : null)));
                    if (!gd1.a.m(String.valueOf(VahanApplicationTransactionStatus.this.a2().getRc_off_cd()))) {
                        VahanApplicationTransactionStatus vahanApplicationTransactionStatus = VahanApplicationTransactionStatus.this;
                        vahanApplicationTransactionStatus.Q2(String.valueOf(vahanApplicationTransactionStatus.a2().getRc_off_cd()));
                    }
                    ld7 ld7VarK2 = VahanApplicationTransactionStatus.this.k2();
                    VahanApplicationTransactionStatus vahanApplicationTransactionStatus2 = VahanApplicationTransactionStatus.this;
                    ld7VarK2.t1(vahanApplicationTransactionStatus2, vahanApplicationTransactionStatus2.registratioNo, StringsKt__StringsKt.trim((CharSequence) VahanApplicationTransactionStatus.this.stateCd).toString(), StringsKt__StringsKt.trim((CharSequence) VahanApplicationTransactionStatus.this.getPur_code().toString()).toString());
                    if (StringsKt__StringsJVMKt.equals(VahanApplicationTransactionStatus.this.getMethorName(), VContant.PAYMENT, true)) {
                        VahanApplicationTransactionStatus vahanApplicationTransactionStatus3 = VahanApplicationTransactionStatus.this;
                        vahanApplicationTransactionStatus3.S2(vahanApplicationTransactionStatus3.getPur_code());
                        VahanApplicationTransactionStatus.this.G2();
                    }
                    if (StringsKt__StringsJVMKt.equals(VahanApplicationTransactionStatus.this.getMethorName(), VContant.UPLOADDOC, true)) {
                        VahanApplicationTransactionStatus.this.e3();
                    }
                    if (StringsKt__StringsJVMKt.equals(VahanApplicationTransactionStatus.this.getMethorName(), VContant.BOOKSLOT, true)) {
                        VahanApplicationTransactionStatus.this.S1();
                        return;
                    }
                    return;
                }
                VahanApplicationTransactionStatus.this.c2().dismiss();
            } catch (Exception e) {
                VahanApplicationTransactionStatus.this.c2().dismiss();
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OwnerDetailPuccPermit) obj);
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
            VahanApplicationTransactionStatus.this.c2().dismiss();
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(PendingTransTaxBreakUpModel pendingTransTaxBreakUpModel) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("renderChckBtn", pendingTransTaxBreakUpModel.getRenderChckBtn());
                jSONObject.put("renderFeeTable", pendingTransTaxBreakUpModel.getRenderFeeTable());
                jSONObject.put("renderTaxTable", pendingTransTaxBreakUpModel.getRenderTaxTable());
                jSONObject.put("state_cd", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getState_cd());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("applNo", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getApplNo());
                jSONObject2.put("finalTaxAmount", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getFinalTaxAmount());
                jSONObject2.put("no_adv_units", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getNo_adv_units());
                jSONObject2.put("off_cd", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getOff_cd());
                jSONObject2.put("pur_cd", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getPur_cd());
                jSONObject2.put("regnNo", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getRegnNo());
                jSONObject2.put("state_cd", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getState_cd());
                jSONObject2.put("taxPurcdDesc", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getTaxPurcdDesc());
                jSONObject2.put("totalAmount", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getTotalAmount());
                jSONObject2.put("totalPaybaleInterest", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getTotalPaybaleInterest());
                jSONObject2.put("totalPaybalePenalty", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getTotalPaybalePenalty());
                jSONObject2.put("totalPaybaleTax", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getTotalPaybaleTax());
                jSONObject2.put("totalPaybaleTax1", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getTotalPaybaleTax1());
                jSONObject2.put("totalPaybaleTax2", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getTotalPaybaleTax2());
                jSONObject2.put("totalAmount", pendingTransTaxBreakUpModel.getTax_pay_dobj().get(0).getTotalAmount());
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject2);
                jSONObject.put("tax_pay_dobj", jSONArray);
                jv jvVar = VahanApplicationTransactionStatus.this.viewModelPayment;
                if (jvVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModelPayment");
                    jvVar = null;
                }
                jvVar.F(VahanApplicationTransactionStatus.this, jSONObject);
            } catch (Exception e) {
                if (VahanApplicationTransactionStatus.this.c2().isShowing()) {
                    VahanApplicationTransactionStatus.this.c2().dismiss();
                }
                VahanApplicationTransactionStatus.this.b3("Unable to proceed further, Please try after sometime");
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((PendingTransTaxBreakUpModel) obj);
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
            if (VahanApplicationTransactionStatus.this.c2().isShowing()) {
                VahanApplicationTransactionStatus.this.c2().dismiss();
            }
            if (str.equals("Error")) {
                VahanApplicationTransactionStatus.this.b3("Unable to proceed further, Please try after sometime");
            } else {
                VahanApplicationTransactionStatus.this.b3(str);
            }
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        public final void a(VahanPendingTransBankModel vahanPendingTransBankModel) {
            VahanApplicationTransactionStatus.this.paymentUrl = vahanPendingTransBankModel.getReturnUrl();
            if (StringsKt__StringsKt.contains$default((CharSequence) VahanApplicationTransactionStatus.this.getPur_code(), (CharSequence) ".0", false, 2, (Object) null)) {
                String strSubstring = VahanApplicationTransactionStatus.this.getPur_code().substring(0, VahanApplicationTransactionStatus.this.getPur_code().length() - 2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                StringsKt__StringsKt.trim((CharSequence) strSubstring).toString();
            } else {
                StringsKt__StringsKt.trim((CharSequence) VahanApplicationTransactionStatus.this.getPur_code()).toString();
            }
            VahanApplicationTransactionStatus.this.T2(true);
            if (VahanApplicationTransactionStatus.this.c2().isShowing()) {
                VahanApplicationTransactionStatus.this.c2().dismiss();
            }
            VahanApplicationTransactionStatus.this.K2();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((VahanPendingTransBankModel) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class h extends Lambda implements Function1 {
        public h() {
            super(1);
        }

        public final void a(SlotUserDataModel slotUserDataModel) {
            try {
                if (VahanApplicationTransactionStatus.this.c2().isShowing()) {
                    VahanApplicationTransactionStatus.this.c2().dismiss();
                }
                Intent intent = new Intent(VahanApplicationTransactionStatus.this, (Class<?>) SlotAppointmentBookingActivity.class);
                intent.putExtra("appl_no", slotUserDataModel.getAppl_no());
                intent.putExtra("stateCd", slotUserDataModel.getState_cd());
                intent.putExtra("purCd", VahanApplicationTransactionStatus.this.getP_code());
                intent.putExtra("offCd", slotUserDataModel.getOff_cd());
                intent.putExtra("rcNo", slotUserDataModel.getRegn_no());
                intent.putExtra("vehicleClass", slotUserDataModel.getOwner_dobj().getVh_class());
                intent.putExtra("vehicleCat", slotUserDataModel.getOwner_dobj().getVch_catg());
                intent.putExtra("ownerName", slotUserDataModel.getOwner_dobj().getOwner_name());
                intent.putExtra("vehicleClassDes", slotUserDataModel.getOwner_dobj().getVh_class_desc());
                intent.putStringArrayListExtra("availableDates", slotUserDataModel.getAvailableDates());
                intent.putStringArrayListExtra("alreadyBookedDates", slotUserDataModel.getAlreadyBookedDates());
                intent.putStringArrayListExtra("holidayDeclareDates", slotUserDataModel.getHolidayDeclareDates());
                intent.putExtra("RC", VahanApplicationTransactionStatus.this.registratioNo);
                intent.putExtra("RcDetails", VahanApplicationTransactionStatus.this.a2());
                intent.putExtra(VContant.NEXGEN_isFACELESS, false);
                intent.putExtra(VContant.NEXGEN_addahar_name, "NA");
                intent.putExtra(VContant.NEXGEN_addahar_address, "NA");
                VahanApplicationTransactionStatus.this.startActivity(intent);
                VahanApplicationTransactionStatus.this.finish();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SlotUserDataModel) obj);
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

        public final void invoke(String str) {
            try {
                if (VahanApplicationTransactionStatus.this.c2().isShowing()) {
                    VahanApplicationTransactionStatus.this.c2().dismiss();
                }
                if (StringsKt__StringsJVMKt.equals(str, "Internet Issue", true)) {
                    VahanApplicationTransactionStatus vahanApplicationTransactionStatus = VahanApplicationTransactionStatus.this;
                    Toast.makeText(vahanApplicationTransactionStatus, vahanApplicationTransactionStatus.getString(R.string.no_internet), 0).show();
                    return;
                }
                if (str != null && !StringsKt__StringsJVMKt.isBlank(str)) {
                    VahanApplicationTransactionStatus.this.H2(str);
                    return;
                }
                VahanApplicationTransactionStatus vahanApplicationTransactionStatus2 = VahanApplicationTransactionStatus.this;
                vahanApplicationTransactionStatus2.H2(vahanApplicationTransactionStatus2.getString(R.string.service_unavable_please_try));
            } catch (Exception e) {
                e.printStackTrace();
            }
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

    public static final void A2(VahanApplicationTransactionStatus this$0, RequireDataForBePaymet requireDataForBePaymet) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (requireDataForBePaymet != null) {
            this$0.reqBeforPayment = requireDataForBePaymet;
            if (StringsKt__StringsKt.contains$default((CharSequence) this$0.pur_code, (CharSequence) ".0", false, 2, (Object) null)) {
                String str = this$0.pur_code;
                String strSubstring = str.substring(0, str.length() - 2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                this$0.p_code = StringsKt__StringsKt.trim((CharSequence) strSubstring).toString();
            } else {
                this$0.p_code = StringsKt__StringsKt.trim((CharSequence) this$0.pur_code).toString();
            }
            if (this$0.paymentFlag) {
                try {
                    String str2 = this$0.applNo;
                    String strValueOf = String.valueOf(requireDataForBePaymet.getOff_cd());
                    String str3 = this$0.pur_code;
                    Double dValueOf = Double.valueOf(0.0d);
                    String regn_no = requireDataForBePaymet.getRegn_no();
                    String str4 = this$0.stateCd;
                    String rc_vh_class_cd = this$0.a2().getRc_vh_class_cd();
                    BeforePaymentRequest beforePaymentRequest = new BeforePaymentRequest(null, null, "", str2, null, 0, null, " ", " ", null, null, 0, " ", 0, " ", " ", null, strValueOf, " ", " ", " ", str3, "", "", dValueOf, 0, regn_no, str4, " ", " ", " ", rc_vh_class_cd != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd)) : null, null, null, null, null, null, null, null, null, null, null, null);
                    Intent intent = new Intent(this$0, (Class<?>) VahanPendingTransactionPayment.class);
                    intent.putExtra(VContant.NEXGEN_INTENT_CODE, "");
                    intent.putExtra(VContant.NEXGEN_isFACELESS, false);
                    intent.putExtra(VContant.APP_NO, this$0.applNo);
                    intent.putExtra("state_code", requireDataForBePaymet.getState_cd());
                    intent.putExtra("rc_number", requireDataForBePaymet.getRegn_no());
                    intent.putExtra(VContant.PURPOSE_CODE, this$0.p_code);
                    intent.putExtra("URL", this$0.paymentUrl);
                    intent.putExtra(VContant.FINAL_SUBMIT, beforePaymentRequest);
                    intent.putExtra("RC", requireDataForBePaymet.getRegn_no());
                    intent.putExtra("RcDetails", this$0.a2());
                    intent.putExtra(VContant.NEXGEN_addahar_name, "");
                    intent.putExtra(VContant.NEXGEN_addahar_address, "");
                    this$0.startActivity(intent);
                    this$0.finish();
                    return;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    if (this$0.c2().isShowing()) {
                        this$0.c2().dismiss();
                    }
                    this$0.b3(this$0.getString(R.string.service_unavable_please_try));
                    return;
                }
            }
            if (this$0.slotFlag) {
                String str5 = this$0.applNo;
                String strValueOf2 = String.valueOf(requireDataForBePaymet.getOff_cd());
                String str6 = this$0.p_code;
                RequireDataForBePaymet requireDataForBePaymet2 = this$0.reqBeforPayment;
                String strValueOf3 = String.valueOf(requireDataForBePaymet2 != null ? requireDataForBePaymet2.getRcpt_dt() : null);
                RequireDataForBePaymet requireDataForBePaymet3 = this$0.reqBeforPayment;
                String strValueOf4 = String.valueOf(requireDataForBePaymet3 != null ? requireDataForBePaymet3.getReturn_rcpt_no() : null);
                RequireDataForBePaymet requireDataForBePaymet4 = this$0.reqBeforPayment;
                Intrinsics.checkNotNull(requireDataForBePaymet4 != null ? Integer.valueOf(requireDataForBePaymet4.getRcpt_amt()) : null);
                Double dValueOf2 = Double.valueOf(r5.intValue());
                String regn_no2 = requireDataForBePaymet.getRegn_no();
                RequireDataForBePaymet requireDataForBePaymet5 = this$0.reqBeforPayment;
                String strValueOf5 = String.valueOf(requireDataForBePaymet5 != null ? requireDataForBePaymet5.getState_cd() : null);
                String rc_vh_class_cd2 = this$0.a2().getRc_vh_class_cd();
                try {
                    this$0.U1(new BeforePaymentRequest(null, null, "", str5, null, 0, null, " ", " ", null, null, 0, " ", 0, " ", " ", null, strValueOf2, " ", " ", " ", str6, strValueOf3, strValueOf4, dValueOf2, 0, regn_no2, strValueOf5, " ", " ", " ", rc_vh_class_cd2 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd2)) : null, null, null, null, null, null, null, null, null, null, null, null));
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                this$0.T1(this$0.applNo);
                return;
            }
            String str7 = this$0.applNo;
            String strValueOf6 = String.valueOf(requireDataForBePaymet.getOff_cd());
            String str8 = this$0.p_code;
            RequireDataForBePaymet requireDataForBePaymet6 = this$0.reqBeforPayment;
            String strValueOf7 = String.valueOf(requireDataForBePaymet6 != null ? requireDataForBePaymet6.getRcpt_dt() : null);
            RequireDataForBePaymet requireDataForBePaymet7 = this$0.reqBeforPayment;
            String strValueOf8 = String.valueOf(requireDataForBePaymet7 != null ? requireDataForBePaymet7.getReturn_rcpt_no() : null);
            RequireDataForBePaymet requireDataForBePaymet8 = this$0.reqBeforPayment;
            Intrinsics.checkNotNull(requireDataForBePaymet8 != null ? Integer.valueOf(requireDataForBePaymet8.getRcpt_amt()) : null);
            Double dValueOf3 = Double.valueOf(r7.intValue());
            String regn_no3 = requireDataForBePaymet.getRegn_no();
            RequireDataForBePaymet requireDataForBePaymet9 = this$0.reqBeforPayment;
            String strValueOf9 = String.valueOf(requireDataForBePaymet9 != null ? requireDataForBePaymet9.getState_cd() : null);
            String rc_vh_class_cd3 = this$0.a2().getRc_vh_class_cd();
            BeforePaymentRequest beforePaymentRequest2 = new BeforePaymentRequest(null, null, "", str7, null, 0, null, " ", " ", null, null, 0, " ", 0, " ", " ", null, strValueOf6, " ", " ", " ", str8, strValueOf7, strValueOf8, dValueOf3, 0, regn_no3, strValueOf9, " ", " ", " ", rc_vh_class_cd3 != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd3)) : null, null, null, null, null, null, null, null, null, null, null, null);
            Intent intent2 = new Intent(this$0, (Class<?>) VahanDmsAPI.class);
            intent2.putExtra("state_code", requireDataForBePaymet.getState_cd());
            intent2.putExtra(VContant.APP_NO, this$0.applNo);
            intent2.putExtra("rc_number", this$0.registratioNo);
            intent2.putExtra(VContant.PURPOSE_CODE, this$0.p_code.toString());
            intent2.putExtra("off_code", String.valueOf(requireDataForBePaymet.getOff_cd()));
            intent2.putExtra(VContant.FINAL_SUBMIT, beforePaymentRequest2);
            intent2.putExtra(VContant.NEXGEN_isFACELESS, this$0.facelesstransaction);
            intent2.putExtra("RC", this$0.registratioNo);
            intent2.putExtra("RcDetails", this$0.a2());
            RequireDataForBePaymet requireDataForBePaymet10 = this$0.reqBeforPayment;
            intent2.putExtra("vahlogReptDate", String.valueOf(requireDataForBePaymet10 != null ? requireDataForBePaymet10.getRcpt_dt() : null));
            Intrinsics.checkNotNull(this$0.reqBeforPayment);
            intent2.putExtra("vahlogFeeAmt", r0.getRcpt_amt());
            RequireDataForBePaymet requireDataForBePaymet11 = this$0.reqBeforPayment;
            Intrinsics.checkNotNull(requireDataForBePaymet11);
            intent2.putExtra("vahlogReptNo", requireDataForBePaymet11.getReturn_rcpt_no());
            intent2.putExtra(VContant.NEXGEN_addahar_name, "NA");
            intent2.putExtra(VContant.NEXGEN_addahar_address, "NA");
            this$0.startActivity(intent2);
            this$0.finish();
        }
    }

    public static final void B2(VahanApplicationTransactionStatus this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.c2().dismiss();
    }

    public static final void C2(VahanApplicationTransactionStatus this$0, RequireDataForBePaymet requireDataForBePaymet) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.c2().dismiss();
        if (requireDataForBePaymet != null) {
            try {
                this$0.reqBeforPayment = requireDataForBePaymet;
                this$0.total_amount = String.valueOf(requireDataForBePaymet.getRcpt_amt());
                String str = this$0.applNo;
                String strValueOf = String.valueOf(requireDataForBePaymet.getOff_cd());
                String str2 = this$0.p_code;
                RequireDataForBePaymet requireDataForBePaymet2 = this$0.reqBeforPayment;
                String strValueOf2 = String.valueOf(requireDataForBePaymet2 != null ? requireDataForBePaymet2.getRcpt_dt() : null);
                RequireDataForBePaymet requireDataForBePaymet3 = this$0.reqBeforPayment;
                String strValueOf3 = String.valueOf(requireDataForBePaymet3 != null ? requireDataForBePaymet3.getReturn_rcpt_no() : null);
                RequireDataForBePaymet requireDataForBePaymet4 = this$0.reqBeforPayment;
                Intrinsics.checkNotNull(requireDataForBePaymet4 != null ? Integer.valueOf(requireDataForBePaymet4.getRcpt_amt()) : null);
                Double dValueOf = Double.valueOf(r15.intValue());
                String regn_no = requireDataForBePaymet.getRegn_no();
                RequireDataForBePaymet requireDataForBePaymet5 = this$0.reqBeforPayment;
                String strValueOf4 = String.valueOf(requireDataForBePaymet5 != null ? requireDataForBePaymet5.getState_cd() : null);
                String rc_vh_class_cd = this$0.a2().getRc_vh_class_cd();
                this$0.U2(new BeforePaymentRequest(null, null, "", str, null, 0, null, " ", " ", null, null, 0, " ", 0, " ", " ", null, strValueOf, " ", " ", " ", str2, strValueOf2, strValueOf3, dValueOf, 0, regn_no, strValueOf4, " ", " ", " ", rc_vh_class_cd != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd)) : null, null, null, null, null, null, null, null, null, null, null, null));
            } catch (Exception unused) {
            }
        }
    }

    public static final void D2(VahanApplicationTransactionStatus this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.c2().isShowing()) {
            this$0.c2().dismiss();
        }
    }

    private final void E2() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H2(String it) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        textView2.setVisibility(8);
        textView.setText("Ok");
        textView.setBackground(yy0.e(this, R.drawable.shape_red));
        textView.setTextColor(yy0.c(this, R.color.white));
        ((TextView) viewFindViewById).setText(it);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rw6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplicationTransactionStatus.I2(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sw6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplicationTransactionStatus.J2(dialog, view);
            }
        });
        dialog.show();
    }

    public static final void I2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void J2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void M2(Dialog d2, VahanApplicationTransactionStatus this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        try {
            this$0.c2().show();
            jv jvVar = this$0.viewModelPayment;
            if (jvVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModelPayment");
                jvVar = null;
            }
            jvVar.A(this$0, this$0.p_code, this$0.applNo, this$0.b2(), this$0.stateCd, this$0.registratioNo);
        } catch (Exception unused) {
            this$0.c2().dismiss();
        }
    }

    public static final void N2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void T1(String appl_no) {
        try {
            j2().m(this, appl_no);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void W1(Dialog d2, Context context, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(context, "$context");
        d2.dismiss();
        ((Activity) context).finish();
    }

    public static final void X1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b3(String it) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        textView2.setVisibility(8);
        textView.setText("Ok");
        textView.setBackground(yy0.e(this, R.drawable.shape_red));
        textView.setTextColor(yy0.c(this, R.color.white));
        ((TextView) viewFindViewById).setText(it);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yw6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplicationTransactionStatus.c3(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zw6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplicationTransactionStatus.d3(dialog, view);
            }
        });
        dialog.show();
    }

    public static final void c3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void d3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void g3(Dialog d2, VahanApplicationTransactionStatus this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        this$0.finish();
    }

    public static final void i3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0c07 A[Catch: Exception -> 0x0442, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x0442, blocks: (B:103:0x03ee, B:106:0x03fa, B:108:0x0406, B:111:0x0410, B:113:0x0418, B:116:0x0422, B:119:0x0431, B:121:0x043d, B:126:0x044a, B:128:0x044e, B:129:0x0452, B:131:0x045c, B:132:0x0460, B:134:0x046a, B:135:0x046e, B:137:0x047f, B:138:0x0483, B:140:0x048e, B:141:0x0492, B:143:0x049f, B:144:0x04a3, B:146:0x04b0, B:147:0x04b4, B:149:0x04c4, B:150:0x04c8, B:152:0x04d2, B:153:0x04d6, B:155:0x04e0, B:156:0x04e4, B:158:0x04ee, B:160:0x04f2, B:161:0x04f6, B:162:0x04fd, B:164:0x0501, B:166:0x0505, B:168:0x0509, B:170:0x050d, B:171:0x0511, B:173:0x051b, B:174:0x051f, B:176:0x0529, B:178:0x052d, B:179:0x0531, B:180:0x0539, B:182:0x053d, B:184:0x0541, B:186:0x0545, B:187:0x0549, B:189:0x0553, B:190:0x0557, B:192:0x0561, B:193:0x0565, B:195:0x056f, B:196:0x0573, B:198:0x057d, B:199:0x0581, B:201:0x058b, B:202:0x058f, B:204:0x0599, B:205:0x059d, B:207:0x05ae, B:208:0x05b2, B:210:0x05bf, B:211:0x05c3, B:213:0x05d0, B:214:0x05d4, B:216:0x05e4, B:217:0x05e8, B:219:0x05f3, B:220:0x05f7, B:222:0x0608, B:223:0x060c, B:225:0x0619, B:226:0x061d, B:228:0x062a, B:229:0x062e, B:231:0x063e, B:232:0x0642, B:234:0x064c, B:235:0x0650, B:237:0x065b, B:239:0x065f, B:240:0x0663, B:241:0x066a, B:243:0x066e, B:245:0x0672, B:246:0x0676, B:247:0x067f, B:249:0x0683, B:250:0x0687, B:252:0x0691, B:254:0x0695, B:256:0x0699, B:258:0x069d, B:259:0x06a1, B:261:0x06ab, B:262:0x06af, B:264:0x06b9, B:265:0x06bd, B:267:0x06c7, B:268:0x06cb, B:270:0x06d5, B:271:0x06d9, B:273:0x06e3, B:274:0x06e7, B:276:0x06f1, B:277:0x06f5, B:279:0x0706, B:280:0x070a, B:282:0x0717, B:283:0x071b, B:285:0x0728, B:286:0x072c, B:288:0x073c, B:289:0x0740, B:291:0x074b, B:292:0x074f, B:294:0x0760, B:295:0x0764, B:297:0x0771, B:298:0x0775, B:300:0x0782, B:301:0x0786, B:303:0x0796, B:304:0x079a, B:306:0x07a4, B:307:0x07a8, B:309:0x07b3, B:310:0x07b7, B:312:0x07c1, B:313:0x07c5, B:315:0x07cf, B:317:0x07d3, B:318:0x07d7, B:320:0x07e2, B:322:0x07e6, B:324:0x07ea, B:326:0x07ee, B:327:0x07f2, B:329:0x07fc, B:330:0x0800, B:332:0x080a, B:333:0x080e, B:335:0x0818, B:336:0x081c, B:338:0x0826, B:339:0x082a, B:341:0x0834, B:342:0x0838, B:344:0x0842, B:345:0x0846, B:347:0x0857, B:348:0x085b, B:350:0x0868, B:351:0x086c, B:353:0x0879, B:354:0x087d, B:356:0x088d, B:357:0x0891, B:359:0x089c, B:360:0x08a0, B:362:0x08b6, B:363:0x08ba, B:365:0x08c4, B:366:0x08c8, B:368:0x08de, B:370:0x08e2, B:371:0x08e6, B:372:0x08ef, B:374:0x08f3, B:375:0x08f7, B:377:0x0908, B:378:0x090c, B:380:0x0919, B:381:0x091d, B:383:0x092a, B:384:0x092e, B:386:0x093e, B:387:0x0942, B:389:0x094c, B:390:0x0950, B:392:0x095b, B:393:0x095f, B:395:0x0969, B:397:0x096d, B:399:0x0971, B:401:0x0975, B:403:0x0979, B:404:0x097d, B:406:0x0987, B:407:0x098b, B:409:0x0995, B:410:0x0999, B:412:0x09a3, B:413:0x09a7, B:415:0x09b1, B:416:0x09b5, B:418:0x09c6, B:419:0x09ca, B:421:0x09d5, B:422:0x09d9, B:424:0x09e6, B:425:0x09ea, B:427:0x09f7, B:428:0x09fb, B:430:0x0a0b, B:431:0x0a0f, B:433:0x0a20, B:434:0x0a24, B:436:0x0a31, B:437:0x0a35, B:439:0x0a42, B:440:0x0a46, B:442:0x0a56, B:443:0x0a5a, B:445:0x0a64, B:446:0x0a68, B:448:0x0a73, B:450:0x0a77, B:451:0x0a7b, B:452:0x0a82, B:454:0x0a86, B:457:0x0a8c, B:459:0x0a90, B:460:0x0a94, B:462:0x0aa5, B:463:0x0aa9, B:465:0x0ab6, B:466:0x0aba, B:468:0x0ac7, B:469:0x0acb, B:471:0x0adb, B:472:0x0adf, B:474:0x0ae9, B:475:0x0aed, B:477:0x0af8, B:478:0x0afc, B:479:0x0b04, B:481:0x0b08, B:482:0x0b0c, B:483:0x0b15, B:485:0x0b1d, B:486:0x0b21, B:488:0x0b2b, B:489:0x0b2f, B:491:0x0b39, B:492:0x0b3d, B:494:0x0b47, B:495:0x0b4b, B:497:0x0b55, B:498:0x0b59, B:500:0x0b63, B:501:0x0b67, B:503:0x0b70, B:504:0x0b74, B:506:0x0b7d, B:508:0x0b81, B:509:0x0b85, B:510:0x0b8e, B:512:0x0b92, B:513:0x0b96, B:515:0x0ba0, B:516:0x0ba4, B:518:0x0bae, B:519:0x0bb2, B:521:0x0bbc, B:522:0x0bc0, B:524:0x0bca, B:525:0x0bce, B:527:0x0bd8, B:528:0x0bdc, B:530:0x0be5, B:531:0x0be9, B:533:0x0bf2, B:535:0x0bf6, B:536:0x0bfa, B:540:0x0c07, B:547:0x0c16, B:556:0x0c2b, B:562:0x0c3a), top: B:681:0x03ee }] */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0c16 A[Catch: Exception -> 0x0442, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x0442, blocks: (B:103:0x03ee, B:106:0x03fa, B:108:0x0406, B:111:0x0410, B:113:0x0418, B:116:0x0422, B:119:0x0431, B:121:0x043d, B:126:0x044a, B:128:0x044e, B:129:0x0452, B:131:0x045c, B:132:0x0460, B:134:0x046a, B:135:0x046e, B:137:0x047f, B:138:0x0483, B:140:0x048e, B:141:0x0492, B:143:0x049f, B:144:0x04a3, B:146:0x04b0, B:147:0x04b4, B:149:0x04c4, B:150:0x04c8, B:152:0x04d2, B:153:0x04d6, B:155:0x04e0, B:156:0x04e4, B:158:0x04ee, B:160:0x04f2, B:161:0x04f6, B:162:0x04fd, B:164:0x0501, B:166:0x0505, B:168:0x0509, B:170:0x050d, B:171:0x0511, B:173:0x051b, B:174:0x051f, B:176:0x0529, B:178:0x052d, B:179:0x0531, B:180:0x0539, B:182:0x053d, B:184:0x0541, B:186:0x0545, B:187:0x0549, B:189:0x0553, B:190:0x0557, B:192:0x0561, B:193:0x0565, B:195:0x056f, B:196:0x0573, B:198:0x057d, B:199:0x0581, B:201:0x058b, B:202:0x058f, B:204:0x0599, B:205:0x059d, B:207:0x05ae, B:208:0x05b2, B:210:0x05bf, B:211:0x05c3, B:213:0x05d0, B:214:0x05d4, B:216:0x05e4, B:217:0x05e8, B:219:0x05f3, B:220:0x05f7, B:222:0x0608, B:223:0x060c, B:225:0x0619, B:226:0x061d, B:228:0x062a, B:229:0x062e, B:231:0x063e, B:232:0x0642, B:234:0x064c, B:235:0x0650, B:237:0x065b, B:239:0x065f, B:240:0x0663, B:241:0x066a, B:243:0x066e, B:245:0x0672, B:246:0x0676, B:247:0x067f, B:249:0x0683, B:250:0x0687, B:252:0x0691, B:254:0x0695, B:256:0x0699, B:258:0x069d, B:259:0x06a1, B:261:0x06ab, B:262:0x06af, B:264:0x06b9, B:265:0x06bd, B:267:0x06c7, B:268:0x06cb, B:270:0x06d5, B:271:0x06d9, B:273:0x06e3, B:274:0x06e7, B:276:0x06f1, B:277:0x06f5, B:279:0x0706, B:280:0x070a, B:282:0x0717, B:283:0x071b, B:285:0x0728, B:286:0x072c, B:288:0x073c, B:289:0x0740, B:291:0x074b, B:292:0x074f, B:294:0x0760, B:295:0x0764, B:297:0x0771, B:298:0x0775, B:300:0x0782, B:301:0x0786, B:303:0x0796, B:304:0x079a, B:306:0x07a4, B:307:0x07a8, B:309:0x07b3, B:310:0x07b7, B:312:0x07c1, B:313:0x07c5, B:315:0x07cf, B:317:0x07d3, B:318:0x07d7, B:320:0x07e2, B:322:0x07e6, B:324:0x07ea, B:326:0x07ee, B:327:0x07f2, B:329:0x07fc, B:330:0x0800, B:332:0x080a, B:333:0x080e, B:335:0x0818, B:336:0x081c, B:338:0x0826, B:339:0x082a, B:341:0x0834, B:342:0x0838, B:344:0x0842, B:345:0x0846, B:347:0x0857, B:348:0x085b, B:350:0x0868, B:351:0x086c, B:353:0x0879, B:354:0x087d, B:356:0x088d, B:357:0x0891, B:359:0x089c, B:360:0x08a0, B:362:0x08b6, B:363:0x08ba, B:365:0x08c4, B:366:0x08c8, B:368:0x08de, B:370:0x08e2, B:371:0x08e6, B:372:0x08ef, B:374:0x08f3, B:375:0x08f7, B:377:0x0908, B:378:0x090c, B:380:0x0919, B:381:0x091d, B:383:0x092a, B:384:0x092e, B:386:0x093e, B:387:0x0942, B:389:0x094c, B:390:0x0950, B:392:0x095b, B:393:0x095f, B:395:0x0969, B:397:0x096d, B:399:0x0971, B:401:0x0975, B:403:0x0979, B:404:0x097d, B:406:0x0987, B:407:0x098b, B:409:0x0995, B:410:0x0999, B:412:0x09a3, B:413:0x09a7, B:415:0x09b1, B:416:0x09b5, B:418:0x09c6, B:419:0x09ca, B:421:0x09d5, B:422:0x09d9, B:424:0x09e6, B:425:0x09ea, B:427:0x09f7, B:428:0x09fb, B:430:0x0a0b, B:431:0x0a0f, B:433:0x0a20, B:434:0x0a24, B:436:0x0a31, B:437:0x0a35, B:439:0x0a42, B:440:0x0a46, B:442:0x0a56, B:443:0x0a5a, B:445:0x0a64, B:446:0x0a68, B:448:0x0a73, B:450:0x0a77, B:451:0x0a7b, B:452:0x0a82, B:454:0x0a86, B:457:0x0a8c, B:459:0x0a90, B:460:0x0a94, B:462:0x0aa5, B:463:0x0aa9, B:465:0x0ab6, B:466:0x0aba, B:468:0x0ac7, B:469:0x0acb, B:471:0x0adb, B:472:0x0adf, B:474:0x0ae9, B:475:0x0aed, B:477:0x0af8, B:478:0x0afc, B:479:0x0b04, B:481:0x0b08, B:482:0x0b0c, B:483:0x0b15, B:485:0x0b1d, B:486:0x0b21, B:488:0x0b2b, B:489:0x0b2f, B:491:0x0b39, B:492:0x0b3d, B:494:0x0b47, B:495:0x0b4b, B:497:0x0b55, B:498:0x0b59, B:500:0x0b63, B:501:0x0b67, B:503:0x0b70, B:504:0x0b74, B:506:0x0b7d, B:508:0x0b81, B:509:0x0b85, B:510:0x0b8e, B:512:0x0b92, B:513:0x0b96, B:515:0x0ba0, B:516:0x0ba4, B:518:0x0bae, B:519:0x0bb2, B:521:0x0bbc, B:522:0x0bc0, B:524:0x0bca, B:525:0x0bce, B:527:0x0bd8, B:528:0x0bdc, B:530:0x0be5, B:531:0x0be9, B:533:0x0bf2, B:535:0x0bf6, B:536:0x0bfa, B:540:0x0c07, B:547:0x0c16, B:556:0x0c2b, B:562:0x0c3a), top: B:681:0x03ee }] */
    /* JADX WARN: Removed duplicated region for block: B:560:0x0c36 A[Catch: Exception -> 0x0cae, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0cae, blocks: (B:96:0x03bb, B:98:0x03c9, B:100:0x03db, B:538:0x0c03, B:542:0x0c0b, B:545:0x0c12, B:549:0x0c1a, B:552:0x0c21, B:560:0x0c36, B:564:0x0c3e), top: B:663:0x03bb }] */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0c3a A[Catch: Exception -> 0x0442, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x0442, blocks: (B:103:0x03ee, B:106:0x03fa, B:108:0x0406, B:111:0x0410, B:113:0x0418, B:116:0x0422, B:119:0x0431, B:121:0x043d, B:126:0x044a, B:128:0x044e, B:129:0x0452, B:131:0x045c, B:132:0x0460, B:134:0x046a, B:135:0x046e, B:137:0x047f, B:138:0x0483, B:140:0x048e, B:141:0x0492, B:143:0x049f, B:144:0x04a3, B:146:0x04b0, B:147:0x04b4, B:149:0x04c4, B:150:0x04c8, B:152:0x04d2, B:153:0x04d6, B:155:0x04e0, B:156:0x04e4, B:158:0x04ee, B:160:0x04f2, B:161:0x04f6, B:162:0x04fd, B:164:0x0501, B:166:0x0505, B:168:0x0509, B:170:0x050d, B:171:0x0511, B:173:0x051b, B:174:0x051f, B:176:0x0529, B:178:0x052d, B:179:0x0531, B:180:0x0539, B:182:0x053d, B:184:0x0541, B:186:0x0545, B:187:0x0549, B:189:0x0553, B:190:0x0557, B:192:0x0561, B:193:0x0565, B:195:0x056f, B:196:0x0573, B:198:0x057d, B:199:0x0581, B:201:0x058b, B:202:0x058f, B:204:0x0599, B:205:0x059d, B:207:0x05ae, B:208:0x05b2, B:210:0x05bf, B:211:0x05c3, B:213:0x05d0, B:214:0x05d4, B:216:0x05e4, B:217:0x05e8, B:219:0x05f3, B:220:0x05f7, B:222:0x0608, B:223:0x060c, B:225:0x0619, B:226:0x061d, B:228:0x062a, B:229:0x062e, B:231:0x063e, B:232:0x0642, B:234:0x064c, B:235:0x0650, B:237:0x065b, B:239:0x065f, B:240:0x0663, B:241:0x066a, B:243:0x066e, B:245:0x0672, B:246:0x0676, B:247:0x067f, B:249:0x0683, B:250:0x0687, B:252:0x0691, B:254:0x0695, B:256:0x0699, B:258:0x069d, B:259:0x06a1, B:261:0x06ab, B:262:0x06af, B:264:0x06b9, B:265:0x06bd, B:267:0x06c7, B:268:0x06cb, B:270:0x06d5, B:271:0x06d9, B:273:0x06e3, B:274:0x06e7, B:276:0x06f1, B:277:0x06f5, B:279:0x0706, B:280:0x070a, B:282:0x0717, B:283:0x071b, B:285:0x0728, B:286:0x072c, B:288:0x073c, B:289:0x0740, B:291:0x074b, B:292:0x074f, B:294:0x0760, B:295:0x0764, B:297:0x0771, B:298:0x0775, B:300:0x0782, B:301:0x0786, B:303:0x0796, B:304:0x079a, B:306:0x07a4, B:307:0x07a8, B:309:0x07b3, B:310:0x07b7, B:312:0x07c1, B:313:0x07c5, B:315:0x07cf, B:317:0x07d3, B:318:0x07d7, B:320:0x07e2, B:322:0x07e6, B:324:0x07ea, B:326:0x07ee, B:327:0x07f2, B:329:0x07fc, B:330:0x0800, B:332:0x080a, B:333:0x080e, B:335:0x0818, B:336:0x081c, B:338:0x0826, B:339:0x082a, B:341:0x0834, B:342:0x0838, B:344:0x0842, B:345:0x0846, B:347:0x0857, B:348:0x085b, B:350:0x0868, B:351:0x086c, B:353:0x0879, B:354:0x087d, B:356:0x088d, B:357:0x0891, B:359:0x089c, B:360:0x08a0, B:362:0x08b6, B:363:0x08ba, B:365:0x08c4, B:366:0x08c8, B:368:0x08de, B:370:0x08e2, B:371:0x08e6, B:372:0x08ef, B:374:0x08f3, B:375:0x08f7, B:377:0x0908, B:378:0x090c, B:380:0x0919, B:381:0x091d, B:383:0x092a, B:384:0x092e, B:386:0x093e, B:387:0x0942, B:389:0x094c, B:390:0x0950, B:392:0x095b, B:393:0x095f, B:395:0x0969, B:397:0x096d, B:399:0x0971, B:401:0x0975, B:403:0x0979, B:404:0x097d, B:406:0x0987, B:407:0x098b, B:409:0x0995, B:410:0x0999, B:412:0x09a3, B:413:0x09a7, B:415:0x09b1, B:416:0x09b5, B:418:0x09c6, B:419:0x09ca, B:421:0x09d5, B:422:0x09d9, B:424:0x09e6, B:425:0x09ea, B:427:0x09f7, B:428:0x09fb, B:430:0x0a0b, B:431:0x0a0f, B:433:0x0a20, B:434:0x0a24, B:436:0x0a31, B:437:0x0a35, B:439:0x0a42, B:440:0x0a46, B:442:0x0a56, B:443:0x0a5a, B:445:0x0a64, B:446:0x0a68, B:448:0x0a73, B:450:0x0a77, B:451:0x0a7b, B:452:0x0a82, B:454:0x0a86, B:457:0x0a8c, B:459:0x0a90, B:460:0x0a94, B:462:0x0aa5, B:463:0x0aa9, B:465:0x0ab6, B:466:0x0aba, B:468:0x0ac7, B:469:0x0acb, B:471:0x0adb, B:472:0x0adf, B:474:0x0ae9, B:475:0x0aed, B:477:0x0af8, B:478:0x0afc, B:479:0x0b04, B:481:0x0b08, B:482:0x0b0c, B:483:0x0b15, B:485:0x0b1d, B:486:0x0b21, B:488:0x0b2b, B:489:0x0b2f, B:491:0x0b39, B:492:0x0b3d, B:494:0x0b47, B:495:0x0b4b, B:497:0x0b55, B:498:0x0b59, B:500:0x0b63, B:501:0x0b67, B:503:0x0b70, B:504:0x0b74, B:506:0x0b7d, B:508:0x0b81, B:509:0x0b85, B:510:0x0b8e, B:512:0x0b92, B:513:0x0b96, B:515:0x0ba0, B:516:0x0ba4, B:518:0x0bae, B:519:0x0bb2, B:521:0x0bbc, B:522:0x0bc0, B:524:0x0bca, B:525:0x0bce, B:527:0x0bd8, B:528:0x0bdc, B:530:0x0be5, B:531:0x0be9, B:533:0x0bf2, B:535:0x0bf6, B:536:0x0bfa, B:540:0x0c07, B:547:0x0c16, B:556:0x0c2b, B:562:0x0c3a), top: B:681:0x03ee }] */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0c88 A[Catch: Exception -> 0x0c9b, TRY_LEAVE, TryCatch #1 {Exception -> 0x0c9b, blocks: (B:585:0x0c6d, B:593:0x0c84, B:595:0x0c88, B:599:0x0c90, B:584:0x0c6a), top: B:665:0x0c84 }] */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0c9f  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x0c71 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:669:0x0c4d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:679:0x0c5f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r8v20, types: [android.view.View, android.widget.LinearLayout] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m2() {
        /*
            Method dump skipped, instruction units count: 3441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanApplicationTransactionStatus.m2():void");
    }

    public static final void n2(VahanApplicationTransactionStatus this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void o2(VahanApplicationTransactionStatus this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.E2();
    }

    public static final void p2(final VahanApplicationTransactionStatus this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        db3 db3Var = this$0.binding;
        if (db3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            db3Var = null;
        }
        db3Var.x.setVisibility(8);
        final Dialog dialog = new Dialog(this$0.mContext, android.R.style.Theme.Black.NoTitleBar.Fullscreen);
        dialog.setContentView(R.layout.layout_download_documents);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.id_statusDocumentCancel);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ((ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qw6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                VahanApplicationTransactionStatus.q2(dialog, this$0, view2);
            }
        });
        dialog.show();
    }

    public static final void q2(Dialog d2, VahanApplicationTransactionStatus this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        db3 db3Var = this$0.binding;
        if (db3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            db3Var = null;
        }
        db3Var.x.setVisibility(0);
    }

    public static final void r2(VahanApplicationTransactionStatus this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.c2().dismiss();
    }

    public static final void s2(VahanApplicationTransactionStatus this$0, FeesModle feesModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.c2().dismiss();
        try {
            this$0.total_amount = String.valueOf(feesModle.get(0).getTotalAmount());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void t2(VahanApplicationTransactionStatus this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.c2().dismiss();
    }

    public static final void u2(VahanApplicationTransactionStatus this$0, gf result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.d() == -1) {
            Intent intentC = result.c();
            Intrinsics.checkNotNull(intentC);
            this$0.methorName = String.valueOf(intentC.getStringExtra(VContant.M_VALUE));
            this$0.c2().show();
            this$0.k2().G0(this$0, this$0.registratioNo, this$0.stateCd, this$0.chassino, this$0.pur_code);
        }
    }

    public static final void v2(VahanApplicationTransactionStatus this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (this$0.isAppPending || StringsKt__StringsKt.contains$default((CharSequence) this$0.current_status, (CharSequence) "ONLINE TRANSACTION FAIL", false, 2, (Object) null)) {
                this$0.b3("Fee payment is pending, Kindly complete fee payment");
            } else {
                this$0.F2(this$0.authStatus, this$0.pur_code, VContant.UPLOADDOC);
            }
        } catch (Exception unused) {
        }
    }

    public static final void w2(VahanApplicationTransactionStatus this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (this$0.isdocuploadpending) {
                this$0.b3("Document upload is pending, Kindly complete document upload");
            } else {
                this$0.F2(this$0.authStatus, this$0.pur_code, VContant.BOOKSLOT);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void x2(VahanApplicationTransactionStatus this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.F2(this$0.authStatus, this$0.pur_code, VContant.PAYMENT);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void y2(VahanApplicationTransactionStatus this$0, PaymentBeforeUrlResponse paymentBeforeUrlResponse) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.c2().dismiss();
        String returnUrl = paymentBeforeUrlResponse.getReturnUrl();
        if (returnUrl == null || returnUrl.length() == 0) {
            return;
        }
        try {
            String str = this$0.applNo;
            String strValueOf = String.valueOf(this$0.a2().getRc_off_cd());
            String str2 = this$0.p_code;
            Double dValueOf = Double.valueOf(0.0d);
            String str3 = this$0.registratioNo;
            String str4 = this$0.stateCd;
            String rc_vh_class_cd = this$0.a2().getRc_vh_class_cd();
            this$0.U2(new BeforePaymentRequest(null, null, "", str, null, 0, null, " ", " ", null, null, 0, " ", 0, " ", " ", null, strValueOf, " ", " ", " ", str2, " ", " ", dValueOf, 0, str3, str4, " ", " ", " ", rc_vh_class_cd != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd)) : null, null, null, null, null, null, null, null, null, null, null, null));
            boolean zEquals = this$0.total_amount.equals("0");
            String str5 = VContant.NEXGEN_addahar_name;
            if (!zEquals) {
                if (!this$0.total_amount.equals("0.0")) {
                    Intent intent = new Intent(this$0, (Class<?>) VahanPayment.class);
                    intent.putExtra(VContant.NEXGEN_INTENT_CODE, this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE));
                    if (this$0.authStatus.equals("Mobile")) {
                        intent.putExtra(VContant.NEXGEN_isFACELESS, false);
                        z2 = true;
                    } else {
                        z2 = true;
                        intent.putExtra(VContant.NEXGEN_isFACELESS, true);
                    }
                    if (!StringsKt__StringsJVMKt.equals(this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RCPARTICULAR_CODE, z2) && !StringsKt__StringsJVMKt.equals(this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHECATION_CONTINUATION_CODE, z2)) {
                        intent.putExtra(VContant.APP_NO, this$0.applNo);
                    }
                    intent.putExtra("state_code", this$0.stateCd);
                    intent.putExtra("rc_number", this$0.registratioNo);
                    intent.putExtra(VContant.PURPOSE_CODE, this$0.p_code);
                    intent.putExtra("URL", paymentBeforeUrlResponse.getReturnUrl());
                    intent.putExtra(VContant.FINAL_SUBMIT, this$0.e2());
                    intent.putExtra("RC", this$0.registratioNo);
                    intent.putExtra("RcDetails", this$0.a2());
                    intent.putExtra(VContant.NEXGEN_addahar_name, " ");
                    intent.putExtra(VContant.NEXGEN_addahar_address, " ");
                    this$0.startActivity(intent);
                    this$0.finish();
                    return;
                }
                str5 = VContant.NEXGEN_addahar_name;
            }
            String str6 = str5;
            Intent intent2 = new Intent(this$0, (Class<?>) VahanPaymentStatusScreen.class);
            intent2.putExtra(VContant.NEXGEN_INTENT_CODE, this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE));
            if (this$0.authStatus.equals("Mobile")) {
                intent2.putExtra(VContant.NEXGEN_isFACELESS, false);
                z = true;
            } else {
                z = true;
                intent2.putExtra(VContant.NEXGEN_isFACELESS, true);
            }
            if (!StringsKt__StringsJVMKt.equals(this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.RCPARTICULAR_CODE, z) && !StringsKt__StringsJVMKt.equals(this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE), VContant.HYPOTHECATION_CONTINUATION_CODE, z)) {
                intent2.putExtra(VContant.APP_NO, this$0.applNo);
            }
            intent2.putExtra("state_code", this$0.stateCd);
            intent2.putExtra("rc_number", this$0.registratioNo);
            intent2.putExtra(VContant.PURPOSE_CODE, this$0.p_code);
            intent2.putExtra("EncString", paymentBeforeUrlResponse.getReturnUrl());
            intent2.putExtra(VContant.FINAL_SUBMIT, this$0.e2());
            intent2.putExtra("RC", this$0.registratioNo);
            intent2.putExtra("RcDetails", this$0.a2());
            intent2.putExtra(str6, " ");
            intent2.putExtra(VContant.NEXGEN_addahar_address, " ");
            this$0.startActivity(intent2);
            this$0.finish();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void z2(VahanApplicationTransactionStatus this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.c2().dismiss();
        if (str.equals("Error")) {
            this$0.f3(this$0, this$0.getString(R.string.service_unavable_please_try));
            return;
        }
        Intrinsics.checkNotNull(str);
        if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "re-verify", false, 2, (Object) null)) {
            this$0.L2(str, this$0);
        } else {
            this$0.h3(this$0, str);
        }
    }

    public final void F2(String authMode, String purCode, String m_value) {
        Intrinsics.checkNotNullParameter(authMode, "authMode");
        Intrinsics.checkNotNullParameter(purCode, "purCode");
        Intrinsics.checkNotNullParameter(m_value, "m_value");
        if (StringsKt__StringsKt.contains$default((CharSequence) b2().toString(), (CharSequence) ".", false, 2, (Object) null)) {
            Q2(String.valueOf((int) Double.parseDouble(b2())));
            Log.e("off_code-", b2());
        } else {
            Q2(b2().toString());
        }
        Log.e("off_code", b2());
        if (!StringsKt__StringsJVMKt.equals(StringsKt__StringsKt.trim((CharSequence) authMode).toString(), "Mobile", true)) {
            try {
                HashMap map = new HashMap();
                map.clear();
                map.put(VContant.M_VALUE, m_value);
                Intent intent = new Intent(this, (Class<?>) VahanProcessWithAdharV1.class);
                e03.a aVar = e03.a;
                String str = this.registratioNo;
                String strB2 = b2();
                Intrinsics.checkNotNull(strB2);
                intent.putExtra(VContant.AAHARAUTH, aVar.a(str, map, strB2, this.stateCd, this.chassino, VContant.APPLICATION_SCREEN, purCode));
                of ofVar = this.launcher;
                Intrinsics.checkNotNull(ofVar);
                ofVar.a(intent);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        try {
            HashMap map2 = new HashMap();
            map2.clear();
            map2.put(VContant.M_VALUE, m_value);
            Intent intent2 = new Intent(this, (Class<?>) VahanGenerateOTPScreenV1.class);
            e03.a aVar2 = e03.a;
            String str2 = this.registratioNo;
            String strB22 = b2();
            Intrinsics.checkNotNull(strB22);
            intent2.putExtra(VContant.MOBAUTH, aVar2.a(str2, map2, strB22, this.stateCd, this.chassino, VContant.APPLICATION_SCREEN, purCode));
            of ofVar2 = this.launcher;
            Intrinsics.checkNotNull(ofVar2);
            ofVar2.a(intent2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void G2() {
        if (StringsKt__StringsJVMKt.equals(this.methorName, VContant.PAYMENT, true)) {
            try {
                if (!this.isAppPending && !StringsKt__StringsKt.contains$default((CharSequence) this.current_status, (CharSequence) "ONLINE TRANSACTION FAIL", false, 2, (Object) null)) {
                    c2().show();
                    jv jvVar = this.viewModelPayment;
                    if (jvVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModelPayment");
                        jvVar = null;
                    }
                    jvVar.A(this, this.p_code, this.applNo, b2(), this.stateCd, this.registratioNo);
                    return;
                }
                if (this.p_code.equals(VContant.Tax_PURPOSE_CODE)) {
                    if (this.p_code.equals(VContant.Tax_PURPOSE_CODE)) {
                        O2(String.valueOf(a2().getRc_chasi_no()));
                    }
                } else {
                    if (gd1.a.m(this.authStatus)) {
                        return;
                    }
                    if (this.authStatus.equals("Mobile")) {
                        c2().show();
                        k2().z(this, new BeforePaymentRequest(null, null, "M", this.applNo, null, 0, null, " ", " ", null, null, 0, " ", 0, " ", " ", null, b2(), hz0.a.r(), " ", " ", this.p_code, "", " ", Double.valueOf(0.0d), 0, this.registratioNo, this.stateCd, " ", " ", " ", 0, null, null, null, null, null, null, null, null, null, null, null));
                    } else {
                        c2().show();
                        k2().z(this, new BeforePaymentRequest(null, null, "A", this.applNo, null, 0, null, " ", " ", null, null, 0, " ", 0, " ", " ", null, b2(), hz0.a.r(), " ", " ", this.p_code, "", " ", Double.valueOf(0.0d), 0, this.registratioNo, this.stateCd, " ", " ", " ", 0, null, null, null, null, null, null, null, null, null, null, null));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void K2() {
        try {
            String str = this.applNo;
            String strValueOf = String.valueOf(a2().getRc_off_cd());
            String str2 = this.pur_code;
            Double dValueOf = Double.valueOf(0.0d);
            String strValueOf2 = String.valueOf(a2().getRc_regn_no());
            String str3 = this.stateCd;
            String rc_vh_class_cd = a2().getRc_vh_class_cd();
            BeforePaymentRequest beforePaymentRequest = new BeforePaymentRequest(null, null, "", str, null, 0, null, " ", " ", null, null, 0, " ", 0, " ", " ", null, strValueOf, " ", " ", " ", str2, "", "", dValueOf, 0, strValueOf2, str3, " ", " ", " ", rc_vh_class_cd != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd)) : null, null, null, null, null, null, null, null, null, null, null, null);
            Intent intent = new Intent(this, (Class<?>) VahanPendingTransactionPayment.class);
            intent.putExtra(VContant.NEXGEN_INTENT_CODE, "");
            intent.putExtra(VContant.NEXGEN_isFACELESS, false);
            intent.putExtra(VContant.APP_NO, this.applNo);
            intent.putExtra("state_code", a2().getState_cd());
            intent.putExtra("rc_number", a2().getRc_regn_no());
            intent.putExtra(VContant.PURPOSE_CODE, this.p_code);
            intent.putExtra("URL", this.paymentUrl);
            intent.putExtra(VContant.FINAL_SUBMIT, beforePaymentRequest);
            intent.putExtra("RC", a2().getRc_regn_no());
            intent.putExtra("RcDetails", a2());
            intent.putExtra(VContant.NEXGEN_addahar_name, "");
            intent.putExtra(VContant.NEXGEN_addahar_address, "");
            startActivity(intent);
            finish();
        } catch (Exception e2) {
            e2.printStackTrace();
            if (c2().isShowing()) {
                c2().dismiss();
            }
            b3(getString(R.string.service_unavable_please_try));
        }
    }

    public final void L2(String it, Context context) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.redirect_check_pending);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        wa3 wa3Var = new wa3(context);
        textView.setText(wa3Var.b("button_proceed", "Procced"));
        ((TextView) viewFindViewById4).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        textView2.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        textView.setTextColor(yy0.c(this, R.color.white));
        ((TextView) viewFindViewById).setText(it + "\n Click Procced to re-verify");
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ww6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplicationTransactionStatus.M2(dialog, this, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xw6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplicationTransactionStatus.N2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void O2(String rc_chasi_no) {
        Intrinsics.checkNotNullParameter(rc_chasi_no, "rc_chasi_no");
        HashMap map = new HashMap();
        map.put(VContant.PAY_TAX, VContant.PAY_TAX_CODE);
        setIntent(new Intent(this, (Class<?>) PayTaxActivity.class));
        getIntent().putExtra("RC", this.registratioNo);
        getIntent().putExtra("State", this.stateCd);
        getIntent().putExtra("map", map);
        getIntent().putExtra("off_code", b2());
        Intent intent = getIntent();
        String strSubstring = rc_chasi_no.substring(rc_chasi_no.toString().length() - 5);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        intent.putExtra("chassis_no", strSubstring);
        getIntent().putExtra(VContant.NEXGEN_isFACELESS, false);
        getIntent().putExtra(VContant.NEXGEN_addahar_name, "NA");
        getIntent().putExtra(VContant.NEXGEN_addahar_address, "NA");
        startActivity(getIntent());
        finish();
    }

    public final void P2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.nrvDetails = nrvDetails;
    }

    public final void Q2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    public final void R2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void S1() {
        if (this.isAppPending) {
            b3("Fee payment is pending, Kindly complete fee payment");
        } else {
            if (this.isdocuploadpending) {
                b3("Document upload is pending, Kindly complete document upload");
                return;
            }
            this.slotFlag = true;
            c2().show();
            k2().w(this, this.applNo);
        }
    }

    public final void S2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.p_code = str;
    }

    public final void T2(boolean z) {
        this.paymentFlag = z;
    }

    public final void U1(BeforePaymentRequest paymentRequest) {
        Intrinsics.checkNotNullParameter(paymentRequest, "paymentRequest");
        if (StringsKt__StringsKt.contains$default((CharSequence) this.current_status, (CharSequence) "final submit", false, 2, (Object) null)) {
            Log.e("FinalSubmit", "Running");
            j2().y1(new BeforePaymentRequestfinal(paymentRequest.getAadharauth(), this.applNo, paymentRequest.getChanngeOfAdressDto(), paymentRequest.getComp_cd(), paymentRequest.getDurcdto(), paymentRequest.getFir_dt(), paymentRequest.getFir_no(), paymentRequest.getHpaDto(), paymentRequest.getHptDto(), paymentRequest.getIdv(), String.valueOf(paymentRequest.getIns_from()), paymentRequest.getIns_type(), String.valueOf(paymentRequest.getIns_upto()), paymentRequest.getMsg().toString(), paymentRequest.getNocDto(), paymentRequest.getOff_cd().toString(), paymentRequest.getOp_dt().toString(), paymentRequest.getPolice_station().toString(), paymentRequest.getPolicy_no().toString(), paymentRequest.getPur_cd().toString(), String.valueOf(paymentRequest.getRcp_dt()), String.valueOf(paymentRequest.getRcpt_NO()), String.valueOf(paymentRequest.getRcpt_amt()), paymentRequest.getReason(), paymentRequest.getRegn_no().toString(), paymentRequest.getState_cd().toString(), paymentRequest.getState_header().toString(), paymentRequest.getStatus().toString(), paymentRequest.getTax_mode().toString(), paymentRequest.getVh_class()));
        }
    }

    public final void U2(BeforePaymentRequest beforePaymentRequest) {
        Intrinsics.checkNotNullParameter(beforePaymentRequest, "<set-?>");
        this.paymentRequest = beforePaymentRequest;
    }

    public final void V1(final Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.cancle);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        wa3 wa3Var = new wa3(context);
        ((TextView) viewFindViewById4).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(wa3Var.b("btn_ok", context.getString(R.string.ok_txt)));
        textView2.setText(wa3Var.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jw6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplicationTransactionStatus.W1(dialog, context, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uw6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplicationTransactionStatus.X1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void V2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final void W2(VahanServiceConnection vahanServiceConnection) {
        Intrinsics.checkNotNullParameter(vahanServiceConnection, "<set-?>");
        this.retrofitService1 = vahanServiceConnection;
    }

    public final void X2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.slotService = vahanProService;
    }

    /* JADX INFO: renamed from: Y1, reason: from getter */
    public final String getChassino() {
        return this.chassino;
    }

    public final void Y2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.slotViewModel = ld7Var;
    }

    /* JADX INFO: renamed from: Z1, reason: from getter */
    public final String getMethorName() {
        return this.methorName;
    }

    public final void Z2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    public final NrvDetails a2() {
        NrvDetails nrvDetails = this.nrvDetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nrvDetails");
        return null;
    }

    public final void a3(al7 al7Var) {
        Intrinsics.checkNotNullParameter(al7Var, "<set-?>");
        this.viewModel1 = al7Var;
    }

    public final String b2() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    public final ProgressDialog c2() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    /* JADX INFO: renamed from: d2, reason: from getter */
    public final String getP_code() {
        return this.p_code;
    }

    public final BeforePaymentRequest e2() {
        BeforePaymentRequest beforePaymentRequest = this.paymentRequest;
        if (beforePaymentRequest != null) {
            return beforePaymentRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paymentRequest");
        return null;
    }

    public final void e3() {
        if (this.isAppPending) {
            b3("Fee payment is pending, Kindly complete fee payment");
            return;
        }
        if (!this.isrtorejection) {
            c2().show();
            k2().w(this, this.applNo);
            return;
        }
        Intent intent = new Intent(this, (Class<?>) VahanDmsReupload.class);
        intent.putExtra("state_code", this.stateCd);
        intent.putExtra(VContant.APP_NO, this.applNo);
        intent.putExtra("rc_number", this.registratioNo);
        intent.putExtra(VContant.PURPOSE_CODE, this.pur_code.toString());
        startActivity(intent);
        finish();
    }

    /* JADX INFO: renamed from: f2, reason: from getter */
    public final String getPur_code() {
        return this.pur_code;
    }

    public final void f3(Context context, String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bx6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplicationTransactionStatus.g3(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final VahanProService g2() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final VahanServiceConnection h2() {
        VahanServiceConnection vahanServiceConnection = this.retrofitService1;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService1");
        return null;
    }

    public final void h3(Context context, String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ax6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplicationTransactionStatus.i3(dialog, view);
            }
        });
        dialog.show();
    }

    public final VahanProService i2() {
        VahanProService vahanProService = this.slotService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("slotService");
        return null;
    }

    public final ld7 j2() {
        ld7 ld7Var = this.slotViewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("slotViewModel");
        return null;
    }

    public final ld7 k2() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final al7 l2() {
        al7 al7Var = this.viewModel1;
        if (al7Var != null) {
            return al7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel1");
        return null;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        V1(this, new wa3(this).b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_aplication_transaction_status);
        db3 db3VarC = db3.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(db3VarC, "inflate(...)");
        this.binding = db3VarC;
        jv jvVar = null;
        if (db3VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            db3VarC = null;
        }
        setContentView(db3VarC.b());
        getWindow().addFlags(128);
        VahanProService.Companion companion = VahanProService.INSTANCE;
        X2(companion.a(this));
        this.otpRetrofitService = ApplicationServiceOtp.INSTANCE.a(this);
        this.paymentService = ApplicationService.INSTANCE.a(this);
        Y2((ld7) new z(this, new kd7(new jd7(i2()))).a(ld7.class));
        ApplicationService applicationService = this.paymentService;
        if (applicationService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paymentService");
            applicationService = null;
        }
        this.viewModelPayment = (jv) new z(this, new rv6(new qw(applicationService))).a(jv.class);
        R2(new ProgressDialog(this));
        c2().setMessage("Please wait...");
        c2().setCancelable(false);
        c2().setCanceledOnTouchOutside(false);
        V2(companion.a(this));
        W2(VahanServiceConnection.INSTANCE.a(this));
        a3((al7) new z(this, new bl7(new bg7(h2()))).a(al7.class));
        Z2((ld7) new z(this, new kd7(new jd7(g2()))).a(ld7.class));
        ta3.a aVar = ta3.a;
        db3 db3Var = this.binding;
        if (db3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            db3Var = null;
        }
        aVar.d2(this, db3Var);
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("applicationNo");
            Intrinsics.checkNotNull(stringExtra);
            this.applNo = stringExtra;
            String stringExtra2 = getIntent().getStringExtra("ownerName");
            Intrinsics.checkNotNull(stringExtra2);
            this.ownerName = stringExtra2;
            String stringExtra3 = getIntent().getStringExtra("stateCd");
            Intrinsics.checkNotNull(stringExtra3);
            this.stateCd = stringExtra3;
            String stringExtra4 = getIntent().getStringExtra("regNo");
            Intrinsics.checkNotNull(stringExtra4);
            this.registratioNo = stringExtra4;
            Type type = new TypeToken<ArrayList<ApplStatusTransListModel>>() { // from class: com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanApplicationTransactionStatus$onCreate$type$1
            }.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            Object objFromJson = new Gson().fromJson(getIntent().getStringExtra("transList"), type);
            Intrinsics.checkNotNull(objFromJson, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.VahanServices.VahanModel.ApplStatusTransListModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.VahanServices.VahanModel.ApplStatusTransListModel> }");
            this.transList = (ArrayList) objFromJson;
        }
        if (!gd1.a.m(((ApplStatusTransListModel) this.transList.get(0)).getCurrentlist().get(0).getChassisNo())) {
            String chassisNo = ((ApplStatusTransListModel) this.transList.get(0)).getCurrentlist().get(0).getChassisNo();
            this.currentl = chassisNo;
            Intrinsics.checkNotNull(chassisNo);
            String str = this.currentl;
            Integer numValueOf = str != null ? Integer.valueOf(str.length()) : null;
            Intrinsics.checkNotNull(numValueOf);
            int iIntValue = numValueOf.intValue() - 5;
            String str2 = this.currentl;
            Intrinsics.checkNotNull(str2);
            String strSubstring = chassisNo.substring(iIntValue, str2.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            this.chassino = strSubstring;
        }
        this.stateList = VContant.INSTANCE.m(this.stateList);
        m2();
        jv jvVar2 = this.viewModelPayment;
        if (jvVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModelPayment");
            jvVar2 = null;
        }
        jvVar2.z().g(this, new j(new e()));
        jv jvVar3 = this.viewModelPayment;
        if (jvVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModelPayment");
            jvVar3 = null;
        }
        jvVar3.y().g(this, new j(new f()));
        db3 db3Var2 = this.binding;
        if (db3Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            db3Var2 = null;
        }
        db3Var2.x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cx6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplicationTransactionStatus.p2(this.a, view);
            }
        });
        db3 db3Var3 = this.binding;
        if (db3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            db3Var3 = null;
        }
        db3Var3.Z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gx6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplicationTransactionStatus.v2(this.a, view);
            }
        });
        db3 db3Var4 = this.binding;
        if (db3Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            db3Var4 = null;
        }
        db3Var4.L.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hx6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplicationTransactionStatus.w2(this.a, view);
            }
        });
        db3 db3Var5 = this.binding;
        if (db3Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            db3Var5 = null;
        }
        db3Var5.q.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ix6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanApplicationTransactionStatus.x2(this.a, view);
            }
        });
        k2().D0().g(this, new mf4() { // from class: com.zepto.jx6
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanApplicationTransactionStatus.y2(this.a, (PaymentBeforeUrlResponse) obj);
            }
        });
        k2().E0().g(this, new mf4() { // from class: com.zepto.kw6
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanApplicationTransactionStatus.z2(this.a, (String) obj);
            }
        });
        jv jvVar4 = this.viewModelPayment;
        if (jvVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModelPayment");
            jvVar4 = null;
        }
        jvVar4.C().g(this, new j(new g()));
        j2().H0().g(this, new j(new a()));
        jv jvVar5 = this.viewModelPayment;
        if (jvVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModelPayment");
        } else {
            jvVar = jvVar5;
        }
        jvVar.B().g(this, new j(new b()));
        k2().Y().g(this, new mf4() { // from class: com.zepto.lw6
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanApplicationTransactionStatus.A2(this.a, (RequireDataForBePaymet) obj);
            }
        });
        k2().b0().g(this, new mf4() { // from class: com.zepto.mw6
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanApplicationTransactionStatus.B2(this.a, (String) obj);
            }
        });
        k2().Z().g(this, new mf4() { // from class: com.zepto.nw6
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanApplicationTransactionStatus.C2(this.a, (RequireDataForBePaymet) obj);
            }
        });
        k2().a0().g(this, new mf4() { // from class: com.zepto.ow6
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanApplicationTransactionStatus.r2(this.a, (String) obj);
            }
        });
        k2().J0().g(this, new j(new c()));
        l2().k().g(this, new j(new d()));
        k2().T().g(this, new mf4() { // from class: com.zepto.dx6
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanApplicationTransactionStatus.s2(this.a, (FeesModle) obj);
            }
        });
        k2().U().g(this, new mf4() { // from class: com.zepto.ex6
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanApplicationTransactionStatus.t2(this.a, (String) obj);
            }
        });
        this.launcher = B0(new mf(), new hf() { // from class: com.zepto.fx6
            @Override // com.zepto.hf
            public final void a(Object obj) {
                VahanApplicationTransactionStatus.u2(this.a, (gf) obj);
            }
        });
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() {
        super.onResume();
        j2().Y0().g(this, new j(new h()));
        j2().X0().g(this, new j(new i()));
        j2().K0().g(this, new mf4() { // from class: com.zepto.pw6
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanApplicationTransactionStatus.D2(this.a, (String) obj);
            }
        });
    }

    @Override // com.zepto.pq, com.zepto.yf2, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
