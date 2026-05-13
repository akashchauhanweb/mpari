package com.nic.mparivahan.VahanServices.VahanMultiService.ApplicationStatus;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
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
import com.nic.mparivahan.VahanServices.VahanApplicationStatus.VahanPendingTransactionPayment;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.ApplStatusTransListModel;
import com.nic.mparivahan.VahanServices.VahanModel.FeesModle;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.OwnerDetailPuccPermit;
import com.nic.mparivahan.VahanServices.VahanModel.RequireDataForBePaymet;
import com.nic.mparivahan.VahanServices.VahanModel.SlotUserDataModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.ApplicationStatus.VahanMultiServiceApplicationTransactionStatus;
import com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.MultiBeforePaymentResponse;
import com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.MultiServiceBeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.MultiServiceDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import com.nic.mparivahan.VahanServices.VahanMultiService.Payment.VahanMultiServicePayment;
import com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationService;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationServiceOtp;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection;
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
import com.zepto.sx3;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.y67;
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
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bú\u0001\u0010û\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0003J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0003J\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\fH\u0003J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\u0012\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0015\u001a\u00020\u0002H\u0014J\b\u0010\u0016\u001a\u00020\u0002H\u0014J\b\u0010\u0017\u001a\u00020\u0002H\u0016J\u001e\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\u001f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006J\u000e\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0006R\u0014\u0010$\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*R\u0016\u0010/\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010*R\u0016\u00101\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010*R\u0016\u00103\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010*R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010A\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010*\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R&\u0010G\u001a\u0012\u0012\u0004\u0012\u00020C0Bj\b\u0012\u0004\u0012\u00020C`D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010K\u001a\u00020H8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bI\u0010JR2\u0010P\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060Lj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010\\\u001a\u00020Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010S\u001a\u0004\bZ\u0010U\"\u0004\b[\u0010WR\"\u0010d\u001a\u00020]8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010l\u001a\u00020e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010t\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR$\u0010|\u001a\u0004\u0018\u00010u8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R#\u0010\u0080\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b}\u0010*\u001a\u0004\b~\u0010>\"\u0004\b\u007f\u0010@R*\u0010\u0088\u0001\u001a\u00030\u0081\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R*\u0010\u0090\u0001\u001a\u00030\u0089\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R&\u0010\u0094\u0001\u001a\u00020Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010S\u001a\u0005\b\u0092\u0001\u0010U\"\u0005\b\u0093\u0001\u0010WR&\u0010\u0098\u0001\u001a\u00020Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0095\u0001\u0010S\u001a\u0005\b\u0096\u0001\u0010U\"\u0005\b\u0097\u0001\u0010WR%\u0010\u009b\u0001\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\bS\u0010o\u001a\u0005\b\u0099\u0001\u0010q\"\u0005\b\u009a\u0001\u0010sR&\u0010\u009f\u0001\u001a\u00020e8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009c\u0001\u0010g\u001a\u0005\b\u009d\u0001\u0010i\"\u0005\b\u009e\u0001\u0010kR&\u0010£\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b \u0001\u0010*\u001a\u0005\b¡\u0001\u0010>\"\u0005\b¢\u0001\u0010@R&\u0010§\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¤\u0001\u0010*\u001a\u0005\b¥\u0001\u0010>\"\u0005\b¦\u0001\u0010@R&\u0010«\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¨\u0001\u0010*\u001a\u0005\b©\u0001\u0010>\"\u0005\bª\u0001\u0010@R&\u0010¯\u0001\u001a\u00020Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¬\u0001\u0010S\u001a\u0005\b\u00ad\u0001\u0010U\"\u0005\b®\u0001\u0010WR&\u0010³\u0001\u001a\u00020Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b°\u0001\u0010S\u001a\u0005\b±\u0001\u0010U\"\u0005\b²\u0001\u0010WR&\u0010µ\u0001\u001a\u00020Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b´\u0001\u0010S\u001a\u0005\bµ\u0001\u0010U\"\u0005\b¶\u0001\u0010WR&\u0010º\u0001\u001a\u00020Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b·\u0001\u0010S\u001a\u0005\b¸\u0001\u0010U\"\u0005\b¹\u0001\u0010WR&\u0010¾\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b»\u0001\u0010*\u001a\u0005\b¼\u0001\u0010>\"\u0005\b½\u0001\u0010@R\u001a\u0010Â\u0001\u001a\u00030¿\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u001a\u0010Æ\u0001\u001a\u00030Ã\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R*\u0010Î\u0001\u001a\u00030Ç\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÈ\u0001\u0010É\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001\"\u0006\bÌ\u0001\u0010Í\u0001R,\u0010Ö\u0001\u001a\u0005\u0018\u00010Ï\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÐ\u0001\u0010Ñ\u0001\u001a\u0006\bÒ\u0001\u0010Ó\u0001\"\u0006\bÔ\u0001\u0010Õ\u0001R*\u0010Þ\u0001\u001a\u00030×\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bØ\u0001\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001R*\u0010æ\u0001\u001a\u00030ß\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bà\u0001\u0010á\u0001\u001a\u0006\bâ\u0001\u0010ã\u0001\"\u0006\bä\u0001\u0010å\u0001R<\u0010ì\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010Bj\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`D8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bç\u0001\u0010F\u001a\u0006\bè\u0001\u0010é\u0001\"\u0006\bê\u0001\u0010ë\u0001R&\u0010ð\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bí\u0001\u0010*\u001a\u0005\bî\u0001\u0010>\"\u0005\bï\u0001\u0010@R#\u0010õ\u0001\u001a\f\u0012\u0005\u0012\u00030ò\u0001\u0018\u00010ñ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bó\u0001\u0010ô\u0001R&\u0010ù\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bö\u0001\u0010*\u001a\u0005\b÷\u0001\u0010>\"\u0005\bø\u0001\u0010@¨\u0006ü\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/VahanMultiService/ApplicationStatus/VahanMultiServiceApplicationTransactionStatus;", "Lcom/zepto/pq;", "", "w2", "O2", "X1", "", "appl_no", "W1", "it", "R2", "o3", "Landroid/content/Context;", "context", "U2", "r3", "Q2", "V1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onStart", "onResume", "onBackPressed", "authMode", "purCode", "m_value", "P2", "message", "s3", "u3", "Y1", "rc_chasi_no", "X2", "C", "Landroid/content/Context;", "mContext", "Lcom/zepto/db3;", "D", "Lcom/zepto/db3;", "binding", "E", "Ljava/lang/String;", "applNo", "F", "ownerName", "G", "stateCd", "H", "registratioNo", "I", "paymentUrl", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "J", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "h2", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "a3", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "nrvDetails", "K", "k2", "()Ljava/lang/String;", "d3", "(Ljava/lang/String;)V", "p_code", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/VahanServices/VahanModel/ApplStatusTransListModel;", "Lkotlin/collections/ArrayList;", "L", "Ljava/util/ArrayList;", "transList", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationServiceOtp;", "M", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationServiceOtp;", "otpRetrofitService", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "N", "Ljava/util/HashMap;", "stateList", "", "O", "Z", "getFacelesstransaction", "()Z", "setFacelesstransaction", "(Z)V", "facelesstransaction", "P", "getAppointmentpending", "setAppointmentpending", "appointmentpending", "Landroid/app/ProgressDialog;", "Q", "Landroid/app/ProgressDialog;", "j2", "()Landroid/app/ProgressDialog;", "c3", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/ld7;", "R", "Lcom/zepto/ld7;", "t2", "()Lcom/zepto/ld7;", "l3", "(Lcom/zepto/ld7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "S", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "o2", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "g3", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitService", "Lcom/nic/mparivahan/VahanServices/VahanModel/RequireDataForBePaymet;", "T", "Lcom/nic/mparivahan/VahanServices/VahanModel/RequireDataForBePaymet;", "n2", "()Lcom/nic/mparivahan/VahanServices/VahanModel/RequireDataForBePaymet;", "setReqBeforPayment", "(Lcom/nic/mparivahan/VahanServices/VahanModel/RequireDataForBePaymet;)V", "reqBeforPayment", "U", "m2", "setPur_code", "pur_code", "Lcom/zepto/al7;", "V", "Lcom/zepto/al7;", "u2", "()Lcom/zepto/al7;", "m3", "(Lcom/zepto/al7;)V", "viewModel1", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "W", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "p2", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "h3", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;)V", "retrofitService1", "X", "getIsdocuploadpending", "setIsdocuploadpending", "isdocuploadpending", "Y", "getIsrtorejection", "setIsrtorejection", "isrtorejection", "r2", "i3", "slotService", "a0", "s2", "j3", "slotViewModel", "b0", "getCurrent_status", "setCurrent_status", "current_status", "c0", "b2", "setAuthStatus", "authStatus", "d0", "getTotal_amount", "k3", "total_amount", "e0", "q2", "setSlotFlag", "slotFlag", "f0", "l2", "e3", "paymentFlag", "g0", "isAppPending", "setAppPending", "h0", "getAppointmentRequired", "setAppointmentRequired", "appointmentRequired", "i0", "i2", "b3", "off_code", "Lcom/zepto/jv;", "j0", "Lcom/zepto/jv;", "viewModelPayment", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationService;", "k0", "Lcom/nic/mparivahan/VahanServices/VahanService/ApplicationService;", "paymentService", "Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;", "l0", "Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;", "getPaymentRequest", "()Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;", "f3", "(Lcom/nic/mparivahan/VahanServices/VahanPaymentModel/BeforePaymentRequest;)V", "paymentRequest", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/MultiServiceBeforePaymentRequest;", "m0", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/MultiServiceBeforePaymentRequest;", "g2", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/MultiServiceBeforePaymentRequest;", "Z2", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/BeforePaymentModel/MultiServiceBeforePaymentRequest;)V", "mutipaymentRequest", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "n0", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "v2", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;", "n3", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiSelectionViewModel;)V", "viewModelMulti", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "o0", "Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "e2", "()Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;", "Y2", "(Lcom/nic/mparivahan/VahanServices/VahanMultiService/MultiService;)V", "multiService", "p0", "f2", "()Ljava/util/ArrayList;", "setMultiServiceList", "(Ljava/util/ArrayList;)V", "multiServiceList", "q0", "c2", "setChassino", "chassino", "Lcom/zepto/of;", "Landroid/content/Intent;", "r0", "Lcom/zepto/of;", "launcher", "s0", "d2", "setMethorName", "methorName", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VahanMultiServiceApplicationTransactionStatus extends pq {

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

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public String total_amount;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public boolean slotFlag;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public boolean paymentFlag;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public boolean isAppPending;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public String off_code;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public jv viewModelPayment;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public ApplicationService paymentService;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public BeforePaymentRequest paymentRequest;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public MultiServiceBeforePaymentRequest mutipaymentRequest;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public MultiSelectionViewModel viewModelMulti;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public MultiService multiService;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
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

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public boolean appointmentRequired = true;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public ArrayList multiServiceList = new ArrayList();

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public String chassino = " ";

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    public String methorName = "";

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(VahanPendingTransBankModel vahanPendingTransBankModel) {
            String string;
            VahanMultiServiceApplicationTransactionStatus.this.paymentUrl = vahanPendingTransBankModel.getReturnUrl();
            if (StringsKt__StringsKt.contains$default((CharSequence) VahanMultiServiceApplicationTransactionStatus.this.getPur_code(), (CharSequence) ".0", false, 2, (Object) null)) {
                String strSubstring = VahanMultiServiceApplicationTransactionStatus.this.getPur_code().substring(0, VahanMultiServiceApplicationTransactionStatus.this.getPur_code().length() - 2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                string = StringsKt__StringsKt.trim((CharSequence) strSubstring).toString();
            } else {
                string = StringsKt__StringsKt.trim((CharSequence) VahanMultiServiceApplicationTransactionStatus.this.getPur_code()).toString();
            }
            String str = string;
            VahanMultiServiceApplicationTransactionStatus.this.e3(true);
            ld7 ld7VarS2 = VahanMultiServiceApplicationTransactionStatus.this.s2();
            VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus = VahanMultiServiceApplicationTransactionStatus.this;
            ld7VarS2.F0(vahanMultiServiceApplicationTransactionStatus, vahanMultiServiceApplicationTransactionStatus.registratioNo, VahanMultiServiceApplicationTransactionStatus.this.stateCd, str, VahanMultiServiceApplicationTransactionStatus.this.getChassino());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((VahanPendingTransBankModel) obj);
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

        public final void invoke(String str) {
            if (VahanMultiServiceApplicationTransactionStatus.this.j2().isShowing()) {
                VahanMultiServiceApplicationTransactionStatus.this.j2().dismiss();
            }
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
            if (VahanMultiServiceApplicationTransactionStatus.this.j2().isShowing()) {
                VahanMultiServiceApplicationTransactionStatus.this.j2().dismiss();
            }
            if (str.equals("Error")) {
                VahanMultiServiceApplicationTransactionStatus.this.o3("Not able to verify payment from bank. Please try again later");
            } else {
                VahanMultiServiceApplicationTransactionStatus.this.o3(str);
            }
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        public final void a(OwnerDetailPuccPermit ownerDetailPuccPermit) {
            try {
                String regn_no = ownerDetailPuccPermit.getRegn_no();
                if (regn_no != null && regn_no.length() != 0) {
                    Intrinsics.checkNotNull(ownerDetailPuccPermit);
                    VahanMultiServiceApplicationTransactionStatus.this.a3(VContant.INSTANCE.c(ownerDetailPuccPermit.copy(((-32769) & 1) != 0 ? ownerDetailPuccPermit.aadhar_no : null, ((-32769) & 2) != 0 ? ownerDetailPuccPermit.ac_fitted : null, ((-32769) & 4) != 0 ? ownerDetailPuccPermit.annual_income : null, ((-32769) & 8) != 0 ? ownerDetailPuccPermit.appl_no : null, ((-32769) & 16) != 0 ? ownerDetailPuccPermit.audio_fitted : null, ((-32769) & 32) != 0 ? ownerDetailPuccPermit.body_type : null, ((-32769) & 64) != 0 ? ownerDetailPuccPermit.c_add1 : null, ((-32769) & 128) != 0 ? ownerDetailPuccPermit.c_add2 : null, ((-32769) & 256) != 0 ? ownerDetailPuccPermit.c_add3 : null, ((-32769) & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.c_district : null, ((-32769) & 1024) != 0 ? ownerDetailPuccPermit.c_district_name : null, ((-32769) & 2048) != 0 ? ownerDetailPuccPermit.c_off_cd : null, ((-32769) & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.c_pincode : null, ((-32769) & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.c_state : null, ((-32769) & 16384) != 0 ? ownerDetailPuccPermit.c_state_name : null, ((-32769) & 32768) != 0 ? ownerDetailPuccPermit.chasi_no : VahanMultiServiceApplicationTransactionStatus.this.getChassino(), ((-32769) & 65536) != 0 ? ownerDetailPuccPermit.chasi_no_original : null, ((-32769) & 131072) != 0 ? ownerDetailPuccPermit.color : null, ((-32769) & 262144) != 0 ? ownerDetailPuccPermit.conditionstatus : null, ((-32769) & 524288) != 0 ? ownerDetailPuccPermit.cubic_cap : null, ((-32769) & 1048576) != 0 ? ownerDetailPuccPermit.dealer_cd : null, ((-32769) & 2097152) != 0 ? ownerDetailPuccPermit.dept_cd : null, ((-32769) & 4194304) != 0 ? ownerDetailPuccPermit.dlRequired : null, ((-32769) & 8388608) != 0 ? ownerDetailPuccPermit.dlValidationRequired : null, ((-32769) & 16777216) != 0 ? ownerDetailPuccPermit.dl_no : null, ((-32769) & 33554432) != 0 ? ownerDetailPuccPermit.dlr_add1 : null, ((-32769) & 67108864) != 0 ? ownerDetailPuccPermit.dlr_add2 : null, ((-32769) & 134217728) != 0 ? ownerDetailPuccPermit.dlr_add3 : null, ((-32769) & 268435456) != 0 ? ownerDetailPuccPermit.dlr_city : null, ((-32769) & 536870912) != 0 ? ownerDetailPuccPermit.dlr_district : null, ((-32769) & 1073741824) != 0 ? ownerDetailPuccPermit.dlr_name : null, ((-32769) & IntCompanionObject.MIN_VALUE) != 0 ? ownerDetailPuccPermit.dlr_pincode : null, ((-1) & 1) != 0 ? ownerDetailPuccPermit.email_id : null, ((-1) & 2) != 0 ? ownerDetailPuccPermit.eng_no : null, ((-1) & 4) != 0 ? ownerDetailPuccPermit.eng_no_original : null, ((-1) & 8) != 0 ? ownerDetailPuccPermit.eng_no_orignal : null, ((-1) & 16) != 0 ? ownerDetailPuccPermit.f_name : null, ((-1) & 32) != 0 ? ownerDetailPuccPermit.fit_upto : null, ((-1) & 64) != 0 ? ownerDetailPuccPermit.fit_uptoAsDate : null, ((-1) & 128) != 0 ? ownerDetailPuccPermit.fit_upto_desc : null, ((-1) & 256) != 0 ? ownerDetailPuccPermit.flag : null, ((-1) & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.floor_area : null, ((-1) & 1024) != 0 ? ownerDetailPuccPermit.formatRegn_dt : null, ((-1) & 2048) != 0 ? ownerDetailPuccPermit.fuel : null, ((-1) & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.fuel_descr : null, ((-1) & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.garage_add : null, ((-1) & 16384) != 0 ? ownerDetailPuccPermit.gcw : null, ((-1) & 32768) != 0 ? ownerDetailPuccPermit.height : null, ((-1) & 65536) != 0 ? ownerDetailPuccPermit.hp : null, ((-1) & 131072) != 0 ? ownerDetailPuccPermit.imported_vch : null, ((-1) & 262144) != 0 ? ownerDetailPuccPermit.laser_code : null, ((-1) & 524288) != 0 ? ownerDetailPuccPermit.ld_wt : null, ((-1) & 1048576) != 0 ? ownerDetailPuccPermit.length : null, ((-1) & 2097152) != 0 ? ownerDetailPuccPermit.maker : null, ((-1) & 4194304) != 0 ? ownerDetailPuccPermit.maker_name : null, ((-1) & 8388608) != 0 ? ownerDetailPuccPermit.manu_mon : null, ((-1) & 16777216) != 0 ? ownerDetailPuccPermit.manu_yr : null, ((-1) & 33554432) != 0 ? ownerDetailPuccPermit.mobileNoEditable : null, ((-1) & 67108864) != 0 ? ownerDetailPuccPermit.mobile_no : null, ((-1) & 134217728) != 0 ? ownerDetailPuccPermit.model_cd : null, ((-1) & 268435456) != 0 ? ownerDetailPuccPermit.model_name : null, ((-1) & 536870912) != 0 ? ownerDetailPuccPermit.no_cyl : null, ((-1) & 1073741824) != 0 ? ownerDetailPuccPermit.no_of_axles : null, ((-1) & IntCompanionObject.MIN_VALUE) != 0 ? ownerDetailPuccPermit.norms : null, ((-1) & 1) != 0 ? ownerDetailPuccPermit.norms_descr : null, ((-1) & 2) != 0 ? ownerDetailPuccPermit.numberOfTyres : null, ((-1) & 4) != 0 ? ownerDetailPuccPermit.off_cd : null, ((-1) & 8) != 0 ? ownerDetailPuccPermit.off_name : null, ((-1) & 16) != 0 ? ownerDetailPuccPermit.op_dt : null, ((-1) & 32) != 0 ? ownerDetailPuccPermit.other_criteria : null, ((-1) & 64) != 0 ? ownerDetailPuccPermit.ownerCatg : null, ((-1) & 128) != 0 ? ownerDetailPuccPermit.ownerIdentification : null, ((-1) & 256) != 0 ? ownerDetailPuccPermit.owner_cd : null, ((-1) & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.owner_cd_descr : null, ((-1) & 1024) != 0 ? ownerDetailPuccPermit.owner_ctg : null, ((-1) & 2048) != 0 ? ownerDetailPuccPermit.owner_name : null, ((-1) & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.owner_sr : null, ((-1) & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.p_add1 : null, ((-1) & 16384) != 0 ? ownerDetailPuccPermit.p_add2 : null, ((-1) & 32768) != 0 ? ownerDetailPuccPermit.p_add3 : null, ((-1) & 65536) != 0 ? ownerDetailPuccPermit.p_district : null, ((-1) & 131072) != 0 ? ownerDetailPuccPermit.p_district_name : null, ((-1) & 262144) != 0 ? ownerDetailPuccPermit.p_pincode : null, ((-1) & 524288) != 0 ? ownerDetailPuccPermit.p_state : null, ((-1) & 1048576) != 0 ? ownerDetailPuccPermit.p_state_name : null, ((-1) & 2097152) != 0 ? ownerDetailPuccPermit.pan_no : null, ((-1) & 4194304) != 0 ? ownerDetailPuccPermit.passport_no : null, ((-1) & 8388608) != 0 ? ownerDetailPuccPermit.permitDetailEntity : null, ((-1) & 16777216) != 0 ? ownerDetailPuccPermit.permit_rto_cd : null, ((-1) & 33554432) != 0 ? ownerDetailPuccPermit.purchase_date : null, ((-1) & 67108864) != 0 ? ownerDetailPuccPermit.purchase_dt : null, ((-1) & 134217728) != 0 ? ownerDetailPuccPermit.ration_card_no : null, ((-1) & 268435456) != 0 ? ownerDetailPuccPermit.regn_dt : null, ((-1) & 536870912) != 0 ? ownerDetailPuccPermit.regn_dtAsDate : null, ((-1) & 1073741824) != 0 ? ownerDetailPuccPermit.regn_no : null, ((-1) & IntCompanionObject.MIN_VALUE) != 0 ? ownerDetailPuccPermit.regn_type : null, (IntCompanionObject.MAX_VALUE & 1) != 0 ? ownerDetailPuccPermit.regn_type_descr : null, (IntCompanionObject.MAX_VALUE & 2) != 0 ? ownerDetailPuccPermit.regn_upto : null, (IntCompanionObject.MAX_VALUE & 4) != 0 ? ownerDetailPuccPermit.regn_uptoAsDate : null, (IntCompanionObject.MAX_VALUE & 8) != 0 ? ownerDetailPuccPermit.returnMessge : null, (IntCompanionObject.MAX_VALUE & 16) != 0 ? ownerDetailPuccPermit.sale_amt : null, (IntCompanionObject.MAX_VALUE & 32) != 0 ? ownerDetailPuccPermit.seat_cap : null, (IntCompanionObject.MAX_VALUE & 64) != 0 ? ownerDetailPuccPermit.sleeper_cap : null, (IntCompanionObject.MAX_VALUE & 128) != 0 ? ownerDetailPuccPermit.stand_cap : null, (IntCompanionObject.MAX_VALUE & 256) != 0 ? ownerDetailPuccPermit.state_cd : null, (IntCompanionObject.MAX_VALUE & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.state_name : null, (IntCompanionObject.MAX_VALUE & 1024) != 0 ? ownerDetailPuccPermit.status : null, (IntCompanionObject.MAX_VALUE & 2048) != 0 ? ownerDetailPuccPermit.tax_mode : null, (IntCompanionObject.MAX_VALUE & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.transport_catg : null, (IntCompanionObject.MAX_VALUE & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.unld_wt : null, (IntCompanionObject.MAX_VALUE & 16384) != 0 ? ownerDetailPuccPermit.vch_catg : null, (IntCompanionObject.MAX_VALUE & 32768) != 0 ? ownerDetailPuccPermit.vch_catg_desc : null, (IntCompanionObject.MAX_VALUE & 65536) != 0 ? ownerDetailPuccPermit.vch_purchase_as : null, (IntCompanionObject.MAX_VALUE & 131072) != 0 ? ownerDetailPuccPermit.vch_purchase_asCode : null, (IntCompanionObject.MAX_VALUE & 262144) != 0 ? ownerDetailPuccPermit.vehType : null, (IntCompanionObject.MAX_VALUE & 524288) != 0 ? ownerDetailPuccPermit.vehTypeAsInt : null, (IntCompanionObject.MAX_VALUE & 1048576) != 0 ? ownerDetailPuccPermit.vh_class : null, (IntCompanionObject.MAX_VALUE & 2097152) != 0 ? ownerDetailPuccPermit.vh_class_desc : null, (IntCompanionObject.MAX_VALUE & 4194304) != 0 ? ownerDetailPuccPermit.video_fitted : null, (IntCompanionObject.MAX_VALUE & 8388608) != 0 ? ownerDetailPuccPermit.voter_id : null, (IntCompanionObject.MAX_VALUE & 16777216) != 0 ? ownerDetailPuccPermit.vtInsuranceCommonDto : null, (IntCompanionObject.MAX_VALUE & 33554432) != 0 ? ownerDetailPuccPermit.vtpucc : null, (IntCompanionObject.MAX_VALUE & 67108864) != 0 ? ownerDetailPuccPermit.wheelbase : null, (IntCompanionObject.MAX_VALUE & 134217728) != 0 ? ownerDetailPuccPermit.width : null, (IntCompanionObject.MAX_VALUE & 268435456) != 0 ? ownerDetailPuccPermit.vTHypthEntity : null, (IntCompanionObject.MAX_VALUE & 536870912) != 0 ? ownerDetailPuccPermit.latesttaxdetails : null, (IntCompanionObject.MAX_VALUE & 1073741824) != 0 ? ownerDetailPuccPermit.permitDetailDto : null)));
                    if (!gd1.a.m(String.valueOf(VahanMultiServiceApplicationTransactionStatus.this.h2().getRc_off_cd()))) {
                        VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus = VahanMultiServiceApplicationTransactionStatus.this;
                        vahanMultiServiceApplicationTransactionStatus.b3(String.valueOf(vahanMultiServiceApplicationTransactionStatus.h2().getRc_off_cd()));
                    }
                    ld7 ld7VarT2 = VahanMultiServiceApplicationTransactionStatus.this.t2();
                    VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus2 = VahanMultiServiceApplicationTransactionStatus.this;
                    ld7VarT2.t1(vahanMultiServiceApplicationTransactionStatus2, vahanMultiServiceApplicationTransactionStatus2.registratioNo, StringsKt__StringsKt.trim((CharSequence) VahanMultiServiceApplicationTransactionStatus.this.stateCd).toString(), StringsKt__StringsKt.trim((CharSequence) VahanMultiServiceApplicationTransactionStatus.this.getPur_code().toString()).toString());
                    if (StringsKt__StringsJVMKt.equals(VahanMultiServiceApplicationTransactionStatus.this.getMethorName(), VContant.PAYMENT, true)) {
                        VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus3 = VahanMultiServiceApplicationTransactionStatus.this;
                        vahanMultiServiceApplicationTransactionStatus3.d3(vahanMultiServiceApplicationTransactionStatus3.getPur_code());
                        VahanMultiServiceApplicationTransactionStatus.this.Q2();
                    }
                    if (StringsKt__StringsJVMKt.equals(VahanMultiServiceApplicationTransactionStatus.this.getMethorName(), VContant.UPLOADDOC, true)) {
                        VahanMultiServiceApplicationTransactionStatus.this.r3();
                    }
                    if (StringsKt__StringsJVMKt.equals(VahanMultiServiceApplicationTransactionStatus.this.getMethorName(), VContant.BOOKSLOT, true)) {
                        VahanMultiServiceApplicationTransactionStatus.this.V1();
                        return;
                    }
                    return;
                }
                VahanMultiServiceApplicationTransactionStatus.this.j2().dismiss();
            } catch (Exception e) {
                VahanMultiServiceApplicationTransactionStatus.this.j2().dismiss();
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OwnerDetailPuccPermit) obj);
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

        public final void invoke(String str) {
            VahanMultiServiceApplicationTransactionStatus.this.j2().dismiss();
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
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
                jv jvVar = VahanMultiServiceApplicationTransactionStatus.this.viewModelPayment;
                if (jvVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModelPayment");
                    jvVar = null;
                }
                jvVar.F(VahanMultiServiceApplicationTransactionStatus.this, jSONObject);
            } catch (Exception e) {
                if (VahanMultiServiceApplicationTransactionStatus.this.j2().isShowing()) {
                    VahanMultiServiceApplicationTransactionStatus.this.j2().dismiss();
                }
                VahanMultiServiceApplicationTransactionStatus.this.o3("Unable to proceed further, Please try after sometime");
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((PendingTransTaxBreakUpModel) obj);
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

        public final void invoke(String str) {
            if (VahanMultiServiceApplicationTransactionStatus.this.j2().isShowing()) {
                VahanMultiServiceApplicationTransactionStatus.this.j2().dismiss();
            }
            if (str.equals("Error")) {
                VahanMultiServiceApplicationTransactionStatus.this.o3("Unable to proceed further, Please try after sometime");
            } else {
                VahanMultiServiceApplicationTransactionStatus.this.o3(str);
            }
        }
    }

    public static final class h extends Lambda implements Function1 {
        public h() {
            super(1);
        }

        public final void a(OwnerDetailPuccPermit ownerDetailPuccPermit) {
            String str;
            try {
                String regn_no = ownerDetailPuccPermit.getRegn_no();
                if (regn_no != null && regn_no.length() != 0) {
                    Intrinsics.checkNotNull(ownerDetailPuccPermit);
                    OwnerDetailPuccPermit ownerDetailPuccPermitCopy = ownerDetailPuccPermit.copy(((-32769) & 1) != 0 ? ownerDetailPuccPermit.aadhar_no : null, ((-32769) & 2) != 0 ? ownerDetailPuccPermit.ac_fitted : null, ((-32769) & 4) != 0 ? ownerDetailPuccPermit.annual_income : null, ((-32769) & 8) != 0 ? ownerDetailPuccPermit.appl_no : null, ((-32769) & 16) != 0 ? ownerDetailPuccPermit.audio_fitted : null, ((-32769) & 32) != 0 ? ownerDetailPuccPermit.body_type : null, ((-32769) & 64) != 0 ? ownerDetailPuccPermit.c_add1 : null, ((-32769) & 128) != 0 ? ownerDetailPuccPermit.c_add2 : null, ((-32769) & 256) != 0 ? ownerDetailPuccPermit.c_add3 : null, ((-32769) & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.c_district : null, ((-32769) & 1024) != 0 ? ownerDetailPuccPermit.c_district_name : null, ((-32769) & 2048) != 0 ? ownerDetailPuccPermit.c_off_cd : null, ((-32769) & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.c_pincode : null, ((-32769) & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.c_state : null, ((-32769) & 16384) != 0 ? ownerDetailPuccPermit.c_state_name : null, ((-32769) & 32768) != 0 ? ownerDetailPuccPermit.chasi_no : VahanMultiServiceApplicationTransactionStatus.this.getChassino(), ((-32769) & 65536) != 0 ? ownerDetailPuccPermit.chasi_no_original : null, ((-32769) & 131072) != 0 ? ownerDetailPuccPermit.color : null, ((-32769) & 262144) != 0 ? ownerDetailPuccPermit.conditionstatus : null, ((-32769) & 524288) != 0 ? ownerDetailPuccPermit.cubic_cap : null, ((-32769) & 1048576) != 0 ? ownerDetailPuccPermit.dealer_cd : null, ((-32769) & 2097152) != 0 ? ownerDetailPuccPermit.dept_cd : null, ((-32769) & 4194304) != 0 ? ownerDetailPuccPermit.dlRequired : null, ((-32769) & 8388608) != 0 ? ownerDetailPuccPermit.dlValidationRequired : null, ((-32769) & 16777216) != 0 ? ownerDetailPuccPermit.dl_no : null, ((-32769) & 33554432) != 0 ? ownerDetailPuccPermit.dlr_add1 : null, ((-32769) & 67108864) != 0 ? ownerDetailPuccPermit.dlr_add2 : null, ((-32769) & 134217728) != 0 ? ownerDetailPuccPermit.dlr_add3 : null, ((-32769) & 268435456) != 0 ? ownerDetailPuccPermit.dlr_city : null, ((-32769) & 536870912) != 0 ? ownerDetailPuccPermit.dlr_district : null, ((-32769) & 1073741824) != 0 ? ownerDetailPuccPermit.dlr_name : null, ((-32769) & IntCompanionObject.MIN_VALUE) != 0 ? ownerDetailPuccPermit.dlr_pincode : null, ((-1) & 1) != 0 ? ownerDetailPuccPermit.email_id : null, ((-1) & 2) != 0 ? ownerDetailPuccPermit.eng_no : null, ((-1) & 4) != 0 ? ownerDetailPuccPermit.eng_no_original : null, ((-1) & 8) != 0 ? ownerDetailPuccPermit.eng_no_orignal : null, ((-1) & 16) != 0 ? ownerDetailPuccPermit.f_name : null, ((-1) & 32) != 0 ? ownerDetailPuccPermit.fit_upto : null, ((-1) & 64) != 0 ? ownerDetailPuccPermit.fit_uptoAsDate : null, ((-1) & 128) != 0 ? ownerDetailPuccPermit.fit_upto_desc : null, ((-1) & 256) != 0 ? ownerDetailPuccPermit.flag : null, ((-1) & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.floor_area : null, ((-1) & 1024) != 0 ? ownerDetailPuccPermit.formatRegn_dt : null, ((-1) & 2048) != 0 ? ownerDetailPuccPermit.fuel : null, ((-1) & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.fuel_descr : null, ((-1) & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.garage_add : null, ((-1) & 16384) != 0 ? ownerDetailPuccPermit.gcw : null, ((-1) & 32768) != 0 ? ownerDetailPuccPermit.height : null, ((-1) & 65536) != 0 ? ownerDetailPuccPermit.hp : null, ((-1) & 131072) != 0 ? ownerDetailPuccPermit.imported_vch : null, ((-1) & 262144) != 0 ? ownerDetailPuccPermit.laser_code : null, ((-1) & 524288) != 0 ? ownerDetailPuccPermit.ld_wt : null, ((-1) & 1048576) != 0 ? ownerDetailPuccPermit.length : null, ((-1) & 2097152) != 0 ? ownerDetailPuccPermit.maker : null, ((-1) & 4194304) != 0 ? ownerDetailPuccPermit.maker_name : null, ((-1) & 8388608) != 0 ? ownerDetailPuccPermit.manu_mon : null, ((-1) & 16777216) != 0 ? ownerDetailPuccPermit.manu_yr : null, ((-1) & 33554432) != 0 ? ownerDetailPuccPermit.mobileNoEditable : null, ((-1) & 67108864) != 0 ? ownerDetailPuccPermit.mobile_no : null, ((-1) & 134217728) != 0 ? ownerDetailPuccPermit.model_cd : null, ((-1) & 268435456) != 0 ? ownerDetailPuccPermit.model_name : null, ((-1) & 536870912) != 0 ? ownerDetailPuccPermit.no_cyl : null, ((-1) & 1073741824) != 0 ? ownerDetailPuccPermit.no_of_axles : null, ((-1) & IntCompanionObject.MIN_VALUE) != 0 ? ownerDetailPuccPermit.norms : null, ((-1) & 1) != 0 ? ownerDetailPuccPermit.norms_descr : null, ((-1) & 2) != 0 ? ownerDetailPuccPermit.numberOfTyres : null, ((-1) & 4) != 0 ? ownerDetailPuccPermit.off_cd : null, ((-1) & 8) != 0 ? ownerDetailPuccPermit.off_name : null, ((-1) & 16) != 0 ? ownerDetailPuccPermit.op_dt : null, ((-1) & 32) != 0 ? ownerDetailPuccPermit.other_criteria : null, ((-1) & 64) != 0 ? ownerDetailPuccPermit.ownerCatg : null, ((-1) & 128) != 0 ? ownerDetailPuccPermit.ownerIdentification : null, ((-1) & 256) != 0 ? ownerDetailPuccPermit.owner_cd : null, ((-1) & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.owner_cd_descr : null, ((-1) & 1024) != 0 ? ownerDetailPuccPermit.owner_ctg : null, ((-1) & 2048) != 0 ? ownerDetailPuccPermit.owner_name : null, ((-1) & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.owner_sr : null, ((-1) & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.p_add1 : null, ((-1) & 16384) != 0 ? ownerDetailPuccPermit.p_add2 : null, ((-1) & 32768) != 0 ? ownerDetailPuccPermit.p_add3 : null, ((-1) & 65536) != 0 ? ownerDetailPuccPermit.p_district : null, ((-1) & 131072) != 0 ? ownerDetailPuccPermit.p_district_name : null, ((-1) & 262144) != 0 ? ownerDetailPuccPermit.p_pincode : null, ((-1) & 524288) != 0 ? ownerDetailPuccPermit.p_state : null, ((-1) & 1048576) != 0 ? ownerDetailPuccPermit.p_state_name : null, ((-1) & 2097152) != 0 ? ownerDetailPuccPermit.pan_no : null, ((-1) & 4194304) != 0 ? ownerDetailPuccPermit.passport_no : null, ((-1) & 8388608) != 0 ? ownerDetailPuccPermit.permitDetailEntity : null, ((-1) & 16777216) != 0 ? ownerDetailPuccPermit.permit_rto_cd : null, ((-1) & 33554432) != 0 ? ownerDetailPuccPermit.purchase_date : null, ((-1) & 67108864) != 0 ? ownerDetailPuccPermit.purchase_dt : null, ((-1) & 134217728) != 0 ? ownerDetailPuccPermit.ration_card_no : null, ((-1) & 268435456) != 0 ? ownerDetailPuccPermit.regn_dt : null, ((-1) & 536870912) != 0 ? ownerDetailPuccPermit.regn_dtAsDate : null, ((-1) & 1073741824) != 0 ? ownerDetailPuccPermit.regn_no : null, ((-1) & IntCompanionObject.MIN_VALUE) != 0 ? ownerDetailPuccPermit.regn_type : null, (IntCompanionObject.MAX_VALUE & 1) != 0 ? ownerDetailPuccPermit.regn_type_descr : null, (IntCompanionObject.MAX_VALUE & 2) != 0 ? ownerDetailPuccPermit.regn_upto : null, (IntCompanionObject.MAX_VALUE & 4) != 0 ? ownerDetailPuccPermit.regn_uptoAsDate : null, (IntCompanionObject.MAX_VALUE & 8) != 0 ? ownerDetailPuccPermit.returnMessge : null, (IntCompanionObject.MAX_VALUE & 16) != 0 ? ownerDetailPuccPermit.sale_amt : null, (IntCompanionObject.MAX_VALUE & 32) != 0 ? ownerDetailPuccPermit.seat_cap : null, (IntCompanionObject.MAX_VALUE & 64) != 0 ? ownerDetailPuccPermit.sleeper_cap : null, (IntCompanionObject.MAX_VALUE & 128) != 0 ? ownerDetailPuccPermit.stand_cap : null, (IntCompanionObject.MAX_VALUE & 256) != 0 ? ownerDetailPuccPermit.state_cd : null, (IntCompanionObject.MAX_VALUE & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.state_name : null, (IntCompanionObject.MAX_VALUE & 1024) != 0 ? ownerDetailPuccPermit.status : null, (IntCompanionObject.MAX_VALUE & 2048) != 0 ? ownerDetailPuccPermit.tax_mode : null, (IntCompanionObject.MAX_VALUE & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.transport_catg : null, (IntCompanionObject.MAX_VALUE & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.unld_wt : null, (IntCompanionObject.MAX_VALUE & 16384) != 0 ? ownerDetailPuccPermit.vch_catg : null, (IntCompanionObject.MAX_VALUE & 32768) != 0 ? ownerDetailPuccPermit.vch_catg_desc : null, (IntCompanionObject.MAX_VALUE & 65536) != 0 ? ownerDetailPuccPermit.vch_purchase_as : null, (IntCompanionObject.MAX_VALUE & 131072) != 0 ? ownerDetailPuccPermit.vch_purchase_asCode : null, (IntCompanionObject.MAX_VALUE & 262144) != 0 ? ownerDetailPuccPermit.vehType : null, (IntCompanionObject.MAX_VALUE & 524288) != 0 ? ownerDetailPuccPermit.vehTypeAsInt : null, (IntCompanionObject.MAX_VALUE & 1048576) != 0 ? ownerDetailPuccPermit.vh_class : null, (IntCompanionObject.MAX_VALUE & 2097152) != 0 ? ownerDetailPuccPermit.vh_class_desc : null, (IntCompanionObject.MAX_VALUE & 4194304) != 0 ? ownerDetailPuccPermit.video_fitted : null, (IntCompanionObject.MAX_VALUE & 8388608) != 0 ? ownerDetailPuccPermit.voter_id : null, (IntCompanionObject.MAX_VALUE & 16777216) != 0 ? ownerDetailPuccPermit.vtInsuranceCommonDto : null, (IntCompanionObject.MAX_VALUE & 33554432) != 0 ? ownerDetailPuccPermit.vtpucc : null, (IntCompanionObject.MAX_VALUE & 67108864) != 0 ? ownerDetailPuccPermit.wheelbase : null, (IntCompanionObject.MAX_VALUE & 134217728) != 0 ? ownerDetailPuccPermit.width : null, (IntCompanionObject.MAX_VALUE & 268435456) != 0 ? ownerDetailPuccPermit.vTHypthEntity : null, (IntCompanionObject.MAX_VALUE & 536870912) != 0 ? ownerDetailPuccPermit.latesttaxdetails : null, (IntCompanionObject.MAX_VALUE & 1073741824) != 0 ? ownerDetailPuccPermit.permitDetailDto : null);
                    VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus = VahanMultiServiceApplicationTransactionStatus.this;
                    VContant.Companion companion = VContant.INSTANCE;
                    vahanMultiServiceApplicationTransactionStatus.a3(companion.c(ownerDetailPuccPermitCopy));
                    if (VahanMultiServiceApplicationTransactionStatus.this.getP_code().equals(VContant.Tax_PURPOSE_CODE)) {
                        VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus2 = VahanMultiServiceApplicationTransactionStatus.this;
                        vahanMultiServiceApplicationTransactionStatus2.X2(String.valueOf(vahanMultiServiceApplicationTransactionStatus2.h2().getRc_chasi_no()));
                        return;
                    }
                    if (VahanMultiServiceApplicationTransactionStatus.this.getPaymentFlag()) {
                        if (StringsKt__StringsKt.contains$default((CharSequence) VahanMultiServiceApplicationTransactionStatus.this.getPur_code(), (CharSequence) ".0", false, 2, (Object) null)) {
                            VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus3 = VahanMultiServiceApplicationTransactionStatus.this;
                            String strSubstring = vahanMultiServiceApplicationTransactionStatus3.getPur_code().substring(0, VahanMultiServiceApplicationTransactionStatus.this.getPur_code().length() - 2);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                            vahanMultiServiceApplicationTransactionStatus3.d3(StringsKt__StringsKt.trim((CharSequence) strSubstring).toString());
                        } else {
                            VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus4 = VahanMultiServiceApplicationTransactionStatus.this;
                            vahanMultiServiceApplicationTransactionStatus4.d3(StringsKt__StringsKt.trim((CharSequence) vahanMultiServiceApplicationTransactionStatus4.getPur_code()).toString());
                        }
                        try {
                            String regn_no2 = ownerDetailPuccPermit.getRegn_no();
                            if (regn_no2 != null && regn_no2.length() != 0) {
                                VahanMultiServiceApplicationTransactionStatus.this.a3(companion.c(ownerDetailPuccPermit.copy(((-32769) & 1) != 0 ? ownerDetailPuccPermit.aadhar_no : null, ((-32769) & 2) != 0 ? ownerDetailPuccPermit.ac_fitted : null, ((-32769) & 4) != 0 ? ownerDetailPuccPermit.annual_income : null, ((-32769) & 8) != 0 ? ownerDetailPuccPermit.appl_no : null, ((-32769) & 16) != 0 ? ownerDetailPuccPermit.audio_fitted : null, ((-32769) & 32) != 0 ? ownerDetailPuccPermit.body_type : null, ((-32769) & 64) != 0 ? ownerDetailPuccPermit.c_add1 : null, ((-32769) & 128) != 0 ? ownerDetailPuccPermit.c_add2 : null, ((-32769) & 256) != 0 ? ownerDetailPuccPermit.c_add3 : null, ((-32769) & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.c_district : null, ((-32769) & 1024) != 0 ? ownerDetailPuccPermit.c_district_name : null, ((-32769) & 2048) != 0 ? ownerDetailPuccPermit.c_off_cd : null, ((-32769) & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.c_pincode : null, ((-32769) & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.c_state : null, ((-32769) & 16384) != 0 ? ownerDetailPuccPermit.c_state_name : null, ((-32769) & 32768) != 0 ? ownerDetailPuccPermit.chasi_no : VahanMultiServiceApplicationTransactionStatus.this.getChassino(), ((-32769) & 65536) != 0 ? ownerDetailPuccPermit.chasi_no_original : null, ((-32769) & 131072) != 0 ? ownerDetailPuccPermit.color : null, ((-32769) & 262144) != 0 ? ownerDetailPuccPermit.conditionstatus : null, ((-32769) & 524288) != 0 ? ownerDetailPuccPermit.cubic_cap : null, ((-32769) & 1048576) != 0 ? ownerDetailPuccPermit.dealer_cd : null, ((-32769) & 2097152) != 0 ? ownerDetailPuccPermit.dept_cd : null, ((-32769) & 4194304) != 0 ? ownerDetailPuccPermit.dlRequired : null, ((-32769) & 8388608) != 0 ? ownerDetailPuccPermit.dlValidationRequired : null, ((-32769) & 16777216) != 0 ? ownerDetailPuccPermit.dl_no : null, ((-32769) & 33554432) != 0 ? ownerDetailPuccPermit.dlr_add1 : null, ((-32769) & 67108864) != 0 ? ownerDetailPuccPermit.dlr_add2 : null, ((-32769) & 134217728) != 0 ? ownerDetailPuccPermit.dlr_add3 : null, ((-32769) & 268435456) != 0 ? ownerDetailPuccPermit.dlr_city : null, ((-32769) & 536870912) != 0 ? ownerDetailPuccPermit.dlr_district : null, ((-32769) & 1073741824) != 0 ? ownerDetailPuccPermit.dlr_name : null, ((-32769) & IntCompanionObject.MIN_VALUE) != 0 ? ownerDetailPuccPermit.dlr_pincode : null, ((-1) & 1) != 0 ? ownerDetailPuccPermit.email_id : null, ((-1) & 2) != 0 ? ownerDetailPuccPermit.eng_no : null, ((-1) & 4) != 0 ? ownerDetailPuccPermit.eng_no_original : null, ((-1) & 8) != 0 ? ownerDetailPuccPermit.eng_no_orignal : null, ((-1) & 16) != 0 ? ownerDetailPuccPermit.f_name : null, ((-1) & 32) != 0 ? ownerDetailPuccPermit.fit_upto : null, ((-1) & 64) != 0 ? ownerDetailPuccPermit.fit_uptoAsDate : null, ((-1) & 128) != 0 ? ownerDetailPuccPermit.fit_upto_desc : null, ((-1) & 256) != 0 ? ownerDetailPuccPermit.flag : null, ((-1) & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.floor_area : null, ((-1) & 1024) != 0 ? ownerDetailPuccPermit.formatRegn_dt : null, ((-1) & 2048) != 0 ? ownerDetailPuccPermit.fuel : null, ((-1) & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.fuel_descr : null, ((-1) & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.garage_add : null, ((-1) & 16384) != 0 ? ownerDetailPuccPermit.gcw : null, ((-1) & 32768) != 0 ? ownerDetailPuccPermit.height : null, ((-1) & 65536) != 0 ? ownerDetailPuccPermit.hp : null, ((-1) & 131072) != 0 ? ownerDetailPuccPermit.imported_vch : null, ((-1) & 262144) != 0 ? ownerDetailPuccPermit.laser_code : null, ((-1) & 524288) != 0 ? ownerDetailPuccPermit.ld_wt : null, ((-1) & 1048576) != 0 ? ownerDetailPuccPermit.length : null, ((-1) & 2097152) != 0 ? ownerDetailPuccPermit.maker : null, ((-1) & 4194304) != 0 ? ownerDetailPuccPermit.maker_name : null, ((-1) & 8388608) != 0 ? ownerDetailPuccPermit.manu_mon : null, ((-1) & 16777216) != 0 ? ownerDetailPuccPermit.manu_yr : null, ((-1) & 33554432) != 0 ? ownerDetailPuccPermit.mobileNoEditable : null, ((-1) & 67108864) != 0 ? ownerDetailPuccPermit.mobile_no : null, ((-1) & 134217728) != 0 ? ownerDetailPuccPermit.model_cd : null, ((-1) & 268435456) != 0 ? ownerDetailPuccPermit.model_name : null, ((-1) & 536870912) != 0 ? ownerDetailPuccPermit.no_cyl : null, ((-1) & 1073741824) != 0 ? ownerDetailPuccPermit.no_of_axles : null, ((-1) & IntCompanionObject.MIN_VALUE) != 0 ? ownerDetailPuccPermit.norms : null, ((-1) & 1) != 0 ? ownerDetailPuccPermit.norms_descr : null, ((-1) & 2) != 0 ? ownerDetailPuccPermit.numberOfTyres : null, ((-1) & 4) != 0 ? ownerDetailPuccPermit.off_cd : null, ((-1) & 8) != 0 ? ownerDetailPuccPermit.off_name : null, ((-1) & 16) != 0 ? ownerDetailPuccPermit.op_dt : null, ((-1) & 32) != 0 ? ownerDetailPuccPermit.other_criteria : null, ((-1) & 64) != 0 ? ownerDetailPuccPermit.ownerCatg : null, ((-1) & 128) != 0 ? ownerDetailPuccPermit.ownerIdentification : null, ((-1) & 256) != 0 ? ownerDetailPuccPermit.owner_cd : null, ((-1) & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.owner_cd_descr : null, ((-1) & 1024) != 0 ? ownerDetailPuccPermit.owner_ctg : null, ((-1) & 2048) != 0 ? ownerDetailPuccPermit.owner_name : null, ((-1) & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.owner_sr : null, ((-1) & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.p_add1 : null, ((-1) & 16384) != 0 ? ownerDetailPuccPermit.p_add2 : null, ((-1) & 32768) != 0 ? ownerDetailPuccPermit.p_add3 : null, ((-1) & 65536) != 0 ? ownerDetailPuccPermit.p_district : null, ((-1) & 131072) != 0 ? ownerDetailPuccPermit.p_district_name : null, ((-1) & 262144) != 0 ? ownerDetailPuccPermit.p_pincode : null, ((-1) & 524288) != 0 ? ownerDetailPuccPermit.p_state : null, ((-1) & 1048576) != 0 ? ownerDetailPuccPermit.p_state_name : null, ((-1) & 2097152) != 0 ? ownerDetailPuccPermit.pan_no : null, ((-1) & 4194304) != 0 ? ownerDetailPuccPermit.passport_no : null, ((-1) & 8388608) != 0 ? ownerDetailPuccPermit.permitDetailEntity : null, ((-1) & 16777216) != 0 ? ownerDetailPuccPermit.permit_rto_cd : null, ((-1) & 33554432) != 0 ? ownerDetailPuccPermit.purchase_date : null, ((-1) & 67108864) != 0 ? ownerDetailPuccPermit.purchase_dt : null, ((-1) & 134217728) != 0 ? ownerDetailPuccPermit.ration_card_no : null, ((-1) & 268435456) != 0 ? ownerDetailPuccPermit.regn_dt : null, ((-1) & 536870912) != 0 ? ownerDetailPuccPermit.regn_dtAsDate : null, ((-1) & 1073741824) != 0 ? ownerDetailPuccPermit.regn_no : null, ((-1) & IntCompanionObject.MIN_VALUE) != 0 ? ownerDetailPuccPermit.regn_type : null, (IntCompanionObject.MAX_VALUE & 1) != 0 ? ownerDetailPuccPermit.regn_type_descr : null, (IntCompanionObject.MAX_VALUE & 2) != 0 ? ownerDetailPuccPermit.regn_upto : null, (IntCompanionObject.MAX_VALUE & 4) != 0 ? ownerDetailPuccPermit.regn_uptoAsDate : null, (IntCompanionObject.MAX_VALUE & 8) != 0 ? ownerDetailPuccPermit.returnMessge : null, (IntCompanionObject.MAX_VALUE & 16) != 0 ? ownerDetailPuccPermit.sale_amt : null, (IntCompanionObject.MAX_VALUE & 32) != 0 ? ownerDetailPuccPermit.seat_cap : null, (IntCompanionObject.MAX_VALUE & 64) != 0 ? ownerDetailPuccPermit.sleeper_cap : null, (IntCompanionObject.MAX_VALUE & 128) != 0 ? ownerDetailPuccPermit.stand_cap : null, (IntCompanionObject.MAX_VALUE & 256) != 0 ? ownerDetailPuccPermit.state_cd : null, (IntCompanionObject.MAX_VALUE & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.state_name : null, (IntCompanionObject.MAX_VALUE & 1024) != 0 ? ownerDetailPuccPermit.status : null, (IntCompanionObject.MAX_VALUE & 2048) != 0 ? ownerDetailPuccPermit.tax_mode : null, (IntCompanionObject.MAX_VALUE & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.transport_catg : null, (IntCompanionObject.MAX_VALUE & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.unld_wt : null, (IntCompanionObject.MAX_VALUE & 16384) != 0 ? ownerDetailPuccPermit.vch_catg : null, (IntCompanionObject.MAX_VALUE & 32768) != 0 ? ownerDetailPuccPermit.vch_catg_desc : null, (IntCompanionObject.MAX_VALUE & 65536) != 0 ? ownerDetailPuccPermit.vch_purchase_as : null, (IntCompanionObject.MAX_VALUE & 131072) != 0 ? ownerDetailPuccPermit.vch_purchase_asCode : null, (IntCompanionObject.MAX_VALUE & 262144) != 0 ? ownerDetailPuccPermit.vehType : null, (IntCompanionObject.MAX_VALUE & 524288) != 0 ? ownerDetailPuccPermit.vehTypeAsInt : null, (IntCompanionObject.MAX_VALUE & 1048576) != 0 ? ownerDetailPuccPermit.vh_class : null, (IntCompanionObject.MAX_VALUE & 2097152) != 0 ? ownerDetailPuccPermit.vh_class_desc : null, (IntCompanionObject.MAX_VALUE & 4194304) != 0 ? ownerDetailPuccPermit.video_fitted : null, (IntCompanionObject.MAX_VALUE & 8388608) != 0 ? ownerDetailPuccPermit.voter_id : null, (IntCompanionObject.MAX_VALUE & 16777216) != 0 ? ownerDetailPuccPermit.vtInsuranceCommonDto : null, (IntCompanionObject.MAX_VALUE & 33554432) != 0 ? ownerDetailPuccPermit.vtpucc : null, (IntCompanionObject.MAX_VALUE & 67108864) != 0 ? ownerDetailPuccPermit.wheelbase : null, (IntCompanionObject.MAX_VALUE & 134217728) != 0 ? ownerDetailPuccPermit.width : null, (IntCompanionObject.MAX_VALUE & 268435456) != 0 ? ownerDetailPuccPermit.vTHypthEntity : null, (IntCompanionObject.MAX_VALUE & 536870912) != 0 ? ownerDetailPuccPermit.latesttaxdetails : null, (IntCompanionObject.MAX_VALUE & 1073741824) != 0 ? ownerDetailPuccPermit.permitDetailDto : null)));
                                String str2 = VahanMultiServiceApplicationTransactionStatus.this.applNo;
                                String strValueOf = String.valueOf(ownerDetailPuccPermit.getOff_cd());
                                String pur_code = VahanMultiServiceApplicationTransactionStatus.this.getPur_code();
                                Double dValueOf = Double.valueOf(0.0d);
                                String regn_no3 = ownerDetailPuccPermit.getRegn_no();
                                String str3 = VahanMultiServiceApplicationTransactionStatus.this.stateCd;
                                String rc_vh_class_cd = VahanMultiServiceApplicationTransactionStatus.this.h2().getRc_vh_class_cd();
                                BeforePaymentRequest beforePaymentRequest = new BeforePaymentRequest(null, null, "", str2, null, 0, null, " ", " ", null, null, 0, " ", 0, " ", " ", null, strValueOf, " ", " ", " ", pur_code, "", "", dValueOf, 0, regn_no3, str3, " ", " ", " ", rc_vh_class_cd != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd)) : null, null, null, null, null, null, null, null, null, null, null, null);
                                Intent intent = new Intent(VahanMultiServiceApplicationTransactionStatus.this, (Class<?>) VahanPendingTransactionPayment.class);
                                intent.putExtra(VContant.NEXGEN_INTENT_CODE, "");
                                intent.putExtra(VContant.NEXGEN_isFACELESS, false);
                                intent.putExtra(VContant.APP_NO, VahanMultiServiceApplicationTransactionStatus.this.applNo);
                                intent.putExtra("state_code", ownerDetailPuccPermit.getState_cd());
                                intent.putExtra("rc_number", ownerDetailPuccPermit.getRegn_no());
                                intent.putExtra(VContant.PURPOSE_CODE, VahanMultiServiceApplicationTransactionStatus.this.getP_code());
                                intent.putExtra("URL", VahanMultiServiceApplicationTransactionStatus.this.paymentUrl);
                                intent.putExtra(VContant.FINAL_SUBMIT, beforePaymentRequest);
                                intent.putExtra("RC", ownerDetailPuccPermit.getRegn_no());
                                intent.putExtra("RcDetails", VahanMultiServiceApplicationTransactionStatus.this.h2());
                                intent.putExtra(VContant.NEXGEN_addahar_name, "");
                                intent.putExtra(VContant.NEXGEN_addahar_address, "");
                                VahanMultiServiceApplicationTransactionStatus.this.startActivity(intent);
                                VahanMultiServiceApplicationTransactionStatus.this.finish();
                                return;
                            }
                            VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus5 = VahanMultiServiceApplicationTransactionStatus.this;
                            vahanMultiServiceApplicationTransactionStatus5.o3(vahanMultiServiceApplicationTransactionStatus5.getString(R.string.service_unavable_please_try));
                            return;
                        } catch (Exception e) {
                            e.printStackTrace();
                            if (VahanMultiServiceApplicationTransactionStatus.this.j2().isShowing()) {
                                VahanMultiServiceApplicationTransactionStatus.this.j2().dismiss();
                            }
                            VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus6 = VahanMultiServiceApplicationTransactionStatus.this;
                            vahanMultiServiceApplicationTransactionStatus6.o3(vahanMultiServiceApplicationTransactionStatus6.getString(R.string.service_unavable_please_try));
                            return;
                        }
                    }
                    if (VahanMultiServiceApplicationTransactionStatus.this.getSlotFlag()) {
                        VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus7 = VahanMultiServiceApplicationTransactionStatus.this;
                        vahanMultiServiceApplicationTransactionStatus7.W1(vahanMultiServiceApplicationTransactionStatus7.applNo);
                        return;
                    }
                    MultiServiceDto multiServiceDto = new MultiServiceDto(null, companion.k(VahanMultiServiceApplicationTransactionStatus.this.getMultiServiceList()), VahanMultiServiceApplicationTransactionStatus.this.registratioNo, VahanMultiServiceApplicationTransactionStatus.this.stateCd, 0);
                    if (StringsKt__StringsJVMKt.equals(VahanMultiServiceApplicationTransactionStatus.this.getAuthStatus(), "Mobile", true)) {
                        VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus8 = VahanMultiServiceApplicationTransactionStatus.this;
                        String str4 = vahanMultiServiceApplicationTransactionStatus8.applNo;
                        str = VContant.NEXGEN_addahar_address;
                        int i = Integer.parseInt(VahanMultiServiceApplicationTransactionStatus.this.i2());
                        String strR = hz0.a.r();
                        ArrayList arrayListK = companion.k(VahanMultiServiceApplicationTransactionStatus.this.getMultiServiceList());
                        int i2 = Integer.parseInt(VContant.MULTISERVICE_PURPOSE_CODE);
                        RequireDataForBePaymet reqBeforPayment = VahanMultiServiceApplicationTransactionStatus.this.getReqBeforPayment();
                        String strValueOf2 = String.valueOf(reqBeforPayment != null ? reqBeforPayment.getRcpt_dt() : null);
                        RequireDataForBePaymet reqBeforPayment2 = VahanMultiServiceApplicationTransactionStatus.this.getReqBeforPayment();
                        String strValueOf3 = String.valueOf(reqBeforPayment2 != null ? reqBeforPayment2.getReturn_rcpt_no() : null);
                        RequireDataForBePaymet reqBeforPayment3 = VahanMultiServiceApplicationTransactionStatus.this.getReqBeforPayment();
                        Integer numValueOf = reqBeforPayment3 != null ? Integer.valueOf(reqBeforPayment3.getRcpt_amt()) : null;
                        Intrinsics.checkNotNull(numValueOf);
                        vahanMultiServiceApplicationTransactionStatus8.Z2(new MultiServiceBeforePaymentRequest(" ", "M", str4, true, null, " ", 22, null, null, "", "", false, null, null, 0, "", 1, "", false, "", multiServiceDto, false, i, strR, "", "", arrayListK, i2, strValueOf2, strValueOf3, numValueOf.intValue(), 0, VahanMultiServiceApplicationTransactionStatus.this.registratioNo, 0, VahanMultiServiceApplicationTransactionStatus.this.stateCd, "", "", "L", null, 1));
                    } else {
                        str = VContant.NEXGEN_addahar_address;
                        VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus9 = VahanMultiServiceApplicationTransactionStatus.this;
                        String str5 = vahanMultiServiceApplicationTransactionStatus9.applNo;
                        int i3 = Integer.parseInt(VahanMultiServiceApplicationTransactionStatus.this.i2());
                        String strR2 = hz0.a.r();
                        ArrayList arrayListK2 = companion.k(VahanMultiServiceApplicationTransactionStatus.this.getMultiServiceList());
                        int i4 = Integer.parseInt(VContant.MULTISERVICE_PURPOSE_CODE);
                        RequireDataForBePaymet reqBeforPayment4 = VahanMultiServiceApplicationTransactionStatus.this.getReqBeforPayment();
                        String strValueOf4 = String.valueOf(reqBeforPayment4 != null ? reqBeforPayment4.getRcpt_dt() : null);
                        RequireDataForBePaymet reqBeforPayment5 = VahanMultiServiceApplicationTransactionStatus.this.getReqBeforPayment();
                        String strValueOf5 = String.valueOf(reqBeforPayment5 != null ? reqBeforPayment5.getReturn_rcpt_no() : null);
                        RequireDataForBePaymet reqBeforPayment6 = VahanMultiServiceApplicationTransactionStatus.this.getReqBeforPayment();
                        Integer numValueOf2 = reqBeforPayment6 != null ? Integer.valueOf(reqBeforPayment6.getRcpt_amt()) : null;
                        Intrinsics.checkNotNull(numValueOf2);
                        vahanMultiServiceApplicationTransactionStatus9.Z2(new MultiServiceBeforePaymentRequest(" ", "A", str5, true, null, " ", 22, null, null, "", "", false, null, null, 0, "", 1, "", false, "", multiServiceDto, false, i3, strR2, "", "", arrayListK2, i4, strValueOf4, strValueOf5, numValueOf2.intValue(), 0, VahanMultiServiceApplicationTransactionStatus.this.registratioNo, 0, VahanMultiServiceApplicationTransactionStatus.this.stateCd, "", "", "L", null, 1));
                    }
                    Intent intent2 = new Intent(VahanMultiServiceApplicationTransactionStatus.this, (Class<?>) VahanMultiDmsAPI.class);
                    intent2.putExtra("state_code", ownerDetailPuccPermit.getState_cd());
                    intent2.putExtra(VContant.APP_NO, VahanMultiServiceApplicationTransactionStatus.this.applNo);
                    intent2.putExtra("rc_number", VahanMultiServiceApplicationTransactionStatus.this.registratioNo);
                    intent2.putExtra(VContant.PURPOSE_CODE, VahanMultiServiceApplicationTransactionStatus.this.getP_code().toString());
                    intent2.putExtra("off_code", String.valueOf(ownerDetailPuccPermit.getOff_cd()));
                    intent2.putExtra(VContant.FINAL_SUBMIT, VahanMultiServiceApplicationTransactionStatus.this.getMutipaymentRequest());
                    if (VahanMultiServiceApplicationTransactionStatus.this.getAuthStatus().equals("Mobile")) {
                        intent2.putExtra(VContant.NEXGEN_isFACELESS, false);
                    } else {
                        intent2.putExtra(VContant.NEXGEN_isFACELESS, true);
                    }
                    intent2.putExtra("RC", VahanMultiServiceApplicationTransactionStatus.this.registratioNo);
                    intent2.putExtra("RcDetails", VahanMultiServiceApplicationTransactionStatus.this.h2());
                    RequireDataForBePaymet reqBeforPayment7 = VahanMultiServiceApplicationTransactionStatus.this.getReqBeforPayment();
                    intent2.putExtra("vahlogReptDate", String.valueOf(reqBeforPayment7 != null ? reqBeforPayment7.getRcpt_dt() : null));
                    Intrinsics.checkNotNull(VahanMultiServiceApplicationTransactionStatus.this.getReqBeforPayment());
                    intent2.putExtra("vahlogFeeAmt", r4.getRcpt_amt());
                    RequireDataForBePaymet reqBeforPayment8 = VahanMultiServiceApplicationTransactionStatus.this.getReqBeforPayment();
                    Intrinsics.checkNotNull(reqBeforPayment8);
                    intent2.putExtra("vahlogReptNo", reqBeforPayment8.getReturn_rcpt_no());
                    intent2.putExtra(VContant.NEXGEN_addahar_name, "NA");
                    intent2.putExtra(str, "NA");
                    intent2.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, VahanMultiServiceApplicationTransactionStatus.this.getMultiServiceList());
                    VahanMultiServiceApplicationTransactionStatus.this.startActivity(intent2);
                    VahanMultiServiceApplicationTransactionStatus.this.finish();
                    return;
                }
                VahanMultiServiceApplicationTransactionStatus.this.j2().dismiss();
            } catch (Exception e2) {
                VahanMultiServiceApplicationTransactionStatus.this.j2().dismiss();
                e2.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OwnerDetailPuccPermit) obj);
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
            VahanMultiServiceApplicationTransactionStatus.this.j2().dismiss();
            VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus = VahanMultiServiceApplicationTransactionStatus.this;
            vahanMultiServiceApplicationTransactionStatus.s3(vahanMultiServiceApplicationTransactionStatus, vahanMultiServiceApplicationTransactionStatus.getString(R.string.service_unavable_please_try));
        }
    }

    public static final class j extends Lambda implements Function1 {
        public j() {
            super(1);
        }

        public final void a(SlotUserDataModel slotUserDataModel) {
            try {
                if (VahanMultiServiceApplicationTransactionStatus.this.j2().isShowing()) {
                    VahanMultiServiceApplicationTransactionStatus.this.j2().dismiss();
                }
                Intent intent = new Intent(VahanMultiServiceApplicationTransactionStatus.this, (Class<?>) SlotAppointmentBookingActivity.class);
                intent.putExtra("appl_no", slotUserDataModel.getAppl_no());
                intent.putExtra("stateCd", slotUserDataModel.getState_cd());
                intent.putExtra("purCd", VahanMultiServiceApplicationTransactionStatus.this.getP_code());
                intent.putExtra("offCd", slotUserDataModel.getOff_cd());
                intent.putExtra("rcNo", slotUserDataModel.getRegn_no());
                intent.putExtra("vehicleClass", slotUserDataModel.getOwner_dobj().getVh_class());
                intent.putExtra("vehicleCat", slotUserDataModel.getOwner_dobj().getVch_catg());
                intent.putExtra("ownerName", slotUserDataModel.getOwner_dobj().getOwner_name());
                intent.putExtra("vehicleClassDes", slotUserDataModel.getOwner_dobj().getVh_class_desc());
                intent.putStringArrayListExtra("availableDates", slotUserDataModel.getAvailableDates());
                intent.putStringArrayListExtra("alreadyBookedDates", slotUserDataModel.getAlreadyBookedDates());
                intent.putStringArrayListExtra("holidayDeclareDates", slotUserDataModel.getHolidayDeclareDates());
                intent.putExtra("RC", VahanMultiServiceApplicationTransactionStatus.this.registratioNo);
                intent.putExtra("RcDetails", VahanMultiServiceApplicationTransactionStatus.this.h2());
                intent.putExtra(VContant.NEXGEN_isFACELESS, false);
                intent.putExtra(VContant.NEXGEN_addahar_name, "NA");
                intent.putExtra(VContant.NEXGEN_addahar_address, "NA");
                VahanMultiServiceApplicationTransactionStatus.this.startActivity(intent);
                VahanMultiServiceApplicationTransactionStatus.this.finish();
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

    public static final class k extends Lambda implements Function1 {
        public k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            try {
                if (VahanMultiServiceApplicationTransactionStatus.this.j2().isShowing()) {
                    VahanMultiServiceApplicationTransactionStatus.this.j2().dismiss();
                }
                if (StringsKt__StringsJVMKt.equals(str, "Internet Issue", true)) {
                    VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus = VahanMultiServiceApplicationTransactionStatus.this;
                    Toast.makeText(vahanMultiServiceApplicationTransactionStatus, vahanMultiServiceApplicationTransactionStatus.getString(R.string.no_internet), 0).show();
                    return;
                }
                if (str != null && !StringsKt__StringsJVMKt.isBlank(str)) {
                    VahanMultiServiceApplicationTransactionStatus.this.R2(str);
                    return;
                }
                VahanMultiServiceApplicationTransactionStatus vahanMultiServiceApplicationTransactionStatus2 = VahanMultiServiceApplicationTransactionStatus.this;
                vahanMultiServiceApplicationTransactionStatus2.R2(vahanMultiServiceApplicationTransactionStatus2.getString(R.string.service_unavable_please_try));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static final class l implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public l(Function1 function) {
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

    public static final void A2(VahanMultiServiceApplicationTransactionStatus this$0, RequireDataForBePaymet requireDataForBePaymet) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.j2().dismiss();
        if (requireDataForBePaymet != null) {
            try {
                this$0.reqBeforPayment = requireDataForBePaymet;
                this$0.k3(String.valueOf(requireDataForBePaymet.getRcpt_amt()));
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
                String rc_vh_class_cd = this$0.h2().getRc_vh_class_cd();
                this$0.f3(new BeforePaymentRequest(null, null, "", str, null, 0, null, " ", " ", null, null, 0, " ", 0, " ", " ", null, strValueOf, " ", " ", " ", str2, strValueOf2, strValueOf3, dValueOf, 0, regn_no, strValueOf4, " ", " ", " ", rc_vh_class_cd != null ? Integer.valueOf(Integer.parseInt(rc_vh_class_cd)) : null, null, null, null, null, null, null, null, null, null, null, null));
            } catch (Exception unused) {
            }
        }
    }

    public static final void B2(VahanMultiServiceApplicationTransactionStatus this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.j2().dismiss();
    }

    public static final void C2(VahanMultiServiceApplicationTransactionStatus this$0, FeesModle feesModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.j2().dismiss();
        try {
            this$0.k3(String.valueOf(feesModle.get(0).getTotalAmount()));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void D2(VahanMultiServiceApplicationTransactionStatus this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.j2().dismiss();
    }

    public static final void E2(final VahanMultiServiceApplicationTransactionStatus this$0, View view) {
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
        ((ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.y87
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                VahanMultiServiceApplicationTransactionStatus.F2(dialog, this$0, view2);
            }
        });
        dialog.show();
    }

    public static final void F2(Dialog d2, VahanMultiServiceApplicationTransactionStatus this$0, View view) {
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

    public static final void G2(VahanMultiServiceApplicationTransactionStatus this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (this$0.isAppPending || StringsKt__StringsKt.contains$default((CharSequence) this$0.current_status, (CharSequence) "ONLINE TRANSACTION FAIL", false, 2, (Object) null)) {
                this$0.o3("Fee payment is pending, Kindly complete fee payment");
            } else {
                this$0.P2(this$0.authStatus, this$0.pur_code, VContant.UPLOADDOC);
            }
        } catch (Exception unused) {
        }
    }

    public static final void H2(VahanMultiServiceApplicationTransactionStatus this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (this$0.isdocuploadpending) {
                this$0.o3("Document upload is pending, Kindly complete document upload");
            } else {
                this$0.P2(this$0.authStatus, this$0.pur_code, VContant.BOOKSLOT);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void I2(VahanMultiServiceApplicationTransactionStatus this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.P2(this$0.authStatus, this$0.pur_code, VContant.PAYMENT);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void J2(VahanMultiServiceApplicationTransactionStatus this$0, MultiBeforePaymentResponse multiBeforePaymentResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.j2().dismiss();
        String returnUrl = multiBeforePaymentResponse.getReturnUrl();
        if (returnUrl == null || returnUrl.length() == 0) {
            return;
        }
        try {
            Intent intent = new Intent(this$0, (Class<?>) VahanMultiServicePayment.class);
            intent.putExtra(VContant.NEXGEN_INTENT_CODE, this$0.getIntent().getStringExtra(VContant.NEXGEN_INTENT_CODE));
            if (this$0.authStatus.equals("Mobile")) {
                intent.putExtra(VContant.NEXGEN_isFACELESS, false);
            } else {
                intent.putExtra(VContant.NEXGEN_isFACELESS, true);
            }
            intent.putExtra("state_code", this$0.stateCd);
            intent.putExtra("rc_number", this$0.registratioNo);
            intent.putExtra(VContant.PURPOSE_CODE, VContant.MULTISERVICE_PURPOSE_CODE);
            intent.putExtra("URL", multiBeforePaymentResponse.getReturnUrl());
            intent.putExtra(VContant.FINAL_SUBMIT, this$0.mutipaymentRequest);
            intent.putExtra("RC", this$0.registratioNo);
            intent.putExtra("RcDetails", this$0.h2());
            intent.putExtra(VContant.NEXGEN_addahar_name, " ");
            intent.putExtra(VContant.NEXGEN_addahar_address, " ");
            intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, this$0.multiServiceList);
            this$0.startActivity(intent);
            this$0.finish();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void K2(VahanMultiServiceApplicationTransactionStatus this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.j2().dismiss();
        if (str.equals("Error")) {
            this$0.s3(this$0, this$0.getString(R.string.service_unavable_please_try));
            return;
        }
        Intrinsics.checkNotNull(str);
        if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "re-verify", false, 2, (Object) null)) {
            this$0.U2(str, this$0);
        } else {
            this$0.u3(this$0, str);
        }
    }

    public static final void L2(VahanMultiServiceApplicationTransactionStatus this$0, RequireDataForBePaymet requireDataForBePaymet) {
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
            this$0.W1(this$0.applNo);
        }
    }

    public static final void M2(VahanMultiServiceApplicationTransactionStatus this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.j2().dismiss();
    }

    public static final void N2(VahanMultiServiceApplicationTransactionStatus this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.j2().isShowing()) {
            this$0.j2().dismiss();
        }
    }

    private final void O2() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q2() {
        if (StringsKt__StringsJVMKt.equals(this.methorName, VContant.PAYMENT, true)) {
            try {
                if (!StringsKt__StringsKt.contains$default((CharSequence) this.current_status, (CharSequence) "ONLINE TRANSACTION FAIL", false, 2, (Object) null)) {
                    j2().show();
                    jv jvVar = this.viewModelPayment;
                    if (jvVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModelPayment");
                        jvVar = null;
                    }
                    jvVar.A(this, this.p_code, this.applNo, i2(), this.stateCd, this.registratioNo);
                    return;
                }
                if (this.p_code.equals(VContant.Tax_PURPOSE_CODE)) {
                    X2(String.valueOf(h2().getRc_chasi_no()));
                    return;
                }
                if (gd1.a.m(this.authStatus)) {
                    return;
                }
                if (this.authStatus.equals("Mobile")) {
                    j2().show();
                    VContant.Companion companion = VContant.INSTANCE;
                    this.mutipaymentRequest = new MultiServiceBeforePaymentRequest(" ", "M", this.applNo, true, null, " ", 22, null, null, "", "", false, null, null, 0, "", 1, "", false, "", new MultiServiceDto(null, companion.k(this.multiServiceList), this.registratioNo, this.stateCd, 0), false, Integer.parseInt(i2()), hz0.a.r(), "", "", companion.k(this.multiServiceList), Integer.parseInt(VContant.MULTISERVICE_PURPOSE_CODE), "", "", 0, 0, this.registratioNo, 0, this.stateCd, "", "", "L", null, 1);
                    MultiSelectionViewModel multiSelectionViewModelV2 = v2();
                    MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequest = this.mutipaymentRequest;
                    Intrinsics.checkNotNull(multiServiceBeforePaymentRequest);
                    multiSelectionViewModelV2.g(multiServiceBeforePaymentRequest);
                    return;
                }
                j2().show();
                VContant.Companion companion2 = VContant.INSTANCE;
                this.mutipaymentRequest = new MultiServiceBeforePaymentRequest(" ", "M", this.applNo, true, null, " ", 22, null, null, "", "", false, null, null, 0, "", 1, "", false, "", new MultiServiceDto(null, companion2.k(this.multiServiceList), this.registratioNo, this.stateCd, 0), false, Integer.parseInt(i2()), hz0.a.r(), "", "", companion2.k(this.multiServiceList), Integer.parseInt(VContant.MULTISERVICE_PURPOSE_CODE), "", "", 0, 0, this.registratioNo, 0, this.stateCd, "", "", "L", null, 1);
                MultiSelectionViewModel multiSelectionViewModelV22 = v2();
                MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequest2 = this.mutipaymentRequest;
                Intrinsics.checkNotNull(multiServiceBeforePaymentRequest2);
                multiSelectionViewModelV22.g(multiServiceBeforePaymentRequest2);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R2(String it) {
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.v87
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMultiServiceApplicationTransactionStatus.S2(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.x87
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMultiServiceApplicationTransactionStatus.T2(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void U2(String it, Context context) {
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.s87
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMultiServiceApplicationTransactionStatus.V2(dialog, this, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.t87
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMultiServiceApplicationTransactionStatus.W2(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V1() {
        if (this.isAppPending) {
            o3("Fee payment is pending, Kindly complete fee payment");
        } else {
            if (this.isdocuploadpending) {
                o3("Document upload is pending, Kindly complete document upload");
                return;
            }
            this.slotFlag = true;
            j2().show();
            t2().w(this, this.applNo);
        }
    }

    public static final void V2(Dialog d2, VahanMultiServiceApplicationTransactionStatus this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        try {
            this$0.j2().show();
            jv jvVar = this$0.viewModelPayment;
            if (jvVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModelPayment");
                jvVar = null;
            }
            jvVar.A(this$0, this$0.p_code, this$0.applNo, this$0.i2(), this$0.stateCd, this$0.registratioNo);
        } catch (Exception unused) {
            this$0.j2().dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W1(String appl_no) {
        try {
            s2().m(this, appl_no);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void X1() {
        this.stateList.put("AN", "Andaman and Nicobar Islands");
        this.stateList.put("AP", "Andhra Pradesh");
        this.stateList.put("AR", "Arunachal Pradesh");
        this.stateList.put("AS", "Assam");
        this.stateList.put("BR", "Bihar");
        this.stateList.put("CG", "Chhattisgarh");
        this.stateList.put("CH", "Chandigarh");
        this.stateList.put("DH", "Dadra and Nagar Haveli");
        this.stateList.put("DD", "Daman and Diu");
        this.stateList.put("DL", "Delhi");
        this.stateList.put("GA", "Goa");
        this.stateList.put("GJ", "Gujarat");
        this.stateList.put("HR", "Haryana");
        this.stateList.put("HP", "Himachal Pradesh");
        this.stateList.put("JK", "Jammu and Kashmir");
        this.stateList.put("JH", "Jharkhand");
        this.stateList.put("KA", "Karnataka");
        this.stateList.put("KL", "Kerala");
        this.stateList.put("LD", "Lakshadweep");
        this.stateList.put("MP", "Madhya Pradesh");
        this.stateList.put("MH", "Maharashtra");
        this.stateList.put("MN", "Manipur");
        this.stateList.put("ML", "Meghalaya");
        this.stateList.put("MZ", "Mizoram");
        this.stateList.put("NL", "Nagaland");
        this.stateList.put("OR", "Odisha");
        this.stateList.put("PY", "Puducherry");
        this.stateList.put("PB", "Punjab");
        this.stateList.put("RJ", "Rajasthan");
        this.stateList.put("SK", "Sikkim");
        this.stateList.put("TN", "Tamil Nadu");
        this.stateList.put("TS", "Telangana");
        this.stateList.put("TR", "Tripura");
        this.stateList.put("UK", "Uttarakhand");
        this.stateList.put("UP", "Uttar Pradesh");
        this.stateList.put("WB", "West Bengal");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z1(Dialog d2, Context context, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(context, "$context");
        d2.dismiss();
        ((Activity) context).finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o3(String it) {
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.a97
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMultiServiceApplicationTransactionStatus.p3(dialog, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.b97
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMultiServiceApplicationTransactionStatus.q3(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r3() {
        boolean z;
        Object obj;
        if (this.isAppPending) {
            j2().dismiss();
            return;
        }
        if (!this.isrtorejection) {
            j2().show();
            t2().w(this, this.applNo);
            return;
        }
        if (this.p_code.equals(VContant.Tax_PURPOSE_CODE)) {
            X2(String.valueOf(h2().getRc_chasi_no()));
            return;
        }
        VContant.Companion companion = VContant.INSTANCE;
        MultiServiceDto multiServiceDto = new MultiServiceDto(null, companion.k(this.multiServiceList), this.registratioNo, this.stateCd, 0);
        if (StringsKt__StringsJVMKt.equals(this.authStatus, "Mobile", true)) {
            String str = this.applNo;
            int i2 = Integer.parseInt(i2());
            String strR = hz0.a.r();
            ArrayList arrayListK = companion.k(this.multiServiceList);
            int i3 = Integer.parseInt(VContant.MULTISERVICE_PURPOSE_CODE);
            RequireDataForBePaymet requireDataForBePaymet = this.reqBeforPayment;
            String strValueOf = String.valueOf(requireDataForBePaymet != null ? requireDataForBePaymet.getRcpt_dt() : null);
            RequireDataForBePaymet requireDataForBePaymet2 = this.reqBeforPayment;
            String strValueOf2 = String.valueOf(requireDataForBePaymet2 != null ? requireDataForBePaymet2.getReturn_rcpt_no() : null);
            RequireDataForBePaymet requireDataForBePaymet3 = this.reqBeforPayment;
            Integer numValueOf = requireDataForBePaymet3 != null ? Integer.valueOf(requireDataForBePaymet3.getRcpt_amt()) : null;
            Intrinsics.checkNotNull(numValueOf);
            z = true;
            obj = "Mobile";
            this.mutipaymentRequest = new MultiServiceBeforePaymentRequest(" ", "M", str, true, null, " ", 22, null, null, "", "", false, null, null, 0, "", 1, "", false, "", multiServiceDto, false, i2, strR, "", "", arrayListK, i3, strValueOf, strValueOf2, numValueOf.intValue(), 0, this.registratioNo, 0, this.stateCd, "", "", "L", null, 1);
        } else {
            z = true;
            obj = "Mobile";
            String str2 = this.applNo;
            int i4 = Integer.parseInt(i2());
            String strR2 = hz0.a.r();
            ArrayList arrayListK2 = companion.k(this.multiServiceList);
            int i5 = Integer.parseInt(VContant.MULTISERVICE_PURPOSE_CODE);
            RequireDataForBePaymet requireDataForBePaymet4 = this.reqBeforPayment;
            String strValueOf3 = String.valueOf(requireDataForBePaymet4 != null ? requireDataForBePaymet4.getRcpt_dt() : null);
            RequireDataForBePaymet requireDataForBePaymet5 = this.reqBeforPayment;
            String strValueOf4 = String.valueOf(requireDataForBePaymet5 != null ? requireDataForBePaymet5.getReturn_rcpt_no() : null);
            RequireDataForBePaymet requireDataForBePaymet6 = this.reqBeforPayment;
            Integer numValueOf2 = requireDataForBePaymet6 != null ? Integer.valueOf(requireDataForBePaymet6.getRcpt_amt()) : null;
            Intrinsics.checkNotNull(numValueOf2);
            this.mutipaymentRequest = new MultiServiceBeforePaymentRequest(" ", "A", str2, true, null, " ", 22, null, null, "", "", false, null, null, 0, "", 1, "", false, "", multiServiceDto, false, i4, strR2, "", "", arrayListK2, i5, strValueOf3, strValueOf4, numValueOf2.intValue(), 0, this.registratioNo, 0, this.stateCd, "", "", "L", null, 1);
        }
        Intent intent = new Intent(this, (Class<?>) VahanMultiDmsAPI.class);
        intent.putExtra("state_code", h2().getState_cd());
        intent.putExtra(VContant.APP_NO, this.applNo);
        intent.putExtra("rc_number", this.registratioNo);
        intent.putExtra(VContant.PURPOSE_CODE, this.p_code.toString());
        intent.putExtra("off_code", h2().getRc_off_cd());
        intent.putExtra(VContant.FINAL_SUBMIT, this.mutipaymentRequest);
        if (this.authStatus.equals(obj)) {
            intent.putExtra(VContant.NEXGEN_isFACELESS, false);
        } else {
            intent.putExtra(VContant.NEXGEN_isFACELESS, z);
        }
        intent.putExtra("RC", this.registratioNo);
        intent.putExtra("RcDetails", h2());
        RequireDataForBePaymet requireDataForBePaymet7 = this.reqBeforPayment;
        intent.putExtra("vahlogReptDate", String.valueOf(requireDataForBePaymet7 != null ? requireDataForBePaymet7.getRcpt_dt() : null));
        Intrinsics.checkNotNull(this.reqBeforPayment);
        intent.putExtra("vahlogFeeAmt", r2.getRcpt_amt());
        RequireDataForBePaymet requireDataForBePaymet8 = this.reqBeforPayment;
        Intrinsics.checkNotNull(requireDataForBePaymet8);
        intent.putExtra("vahlogReptNo", requireDataForBePaymet8.getReturn_rcpt_no());
        intent.putExtra(VContant.NEXGEN_addahar_name, "NA");
        intent.putExtra(VContant.NEXGEN_addahar_address, "NA");
        intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, this.multiServiceList);
        startActivity(intent);
        finish();
    }

    public static final void t3(Dialog d2, VahanMultiServiceApplicationTransactionStatus this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0c75 A[Catch: Exception -> 0x05b2, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x05b2, blocks: (B:176:0x05a2, B:178:0x05ad, B:181:0x05b5, B:183:0x05c2, B:184:0x05c6, B:186:0x05d3, B:187:0x05d7, B:189:0x05e4, B:190:0x05e8, B:192:0x05f3, B:193:0x05f7, B:195:0x0608, B:196:0x060c, B:198:0x0619, B:199:0x061d, B:201:0x062a, B:202:0x062e, B:204:0x063b, B:205:0x063f, B:207:0x0649, B:208:0x064d, B:210:0x0658, B:212:0x065c, B:213:0x0660, B:215:0x066d, B:217:0x0671, B:218:0x0675, B:223:0x0685, B:225:0x0689, B:227:0x068e, B:229:0x0692, B:230:0x0696, B:232:0x06a0, B:233:0x06a4, B:235:0x06ae, B:236:0x06b2, B:238:0x06bc, B:239:0x06c0, B:241:0x06ca, B:242:0x06ce, B:244:0x06d8, B:245:0x06dc, B:247:0x06e6, B:248:0x06ea, B:250:0x06fb, B:251:0x06ff, B:253:0x070c, B:254:0x0710, B:256:0x071d, B:257:0x0721, B:259:0x072e, B:260:0x0732, B:262:0x073d, B:263:0x0741, B:265:0x0752, B:266:0x0756, B:268:0x0763, B:269:0x0767, B:271:0x0774, B:272:0x0778, B:274:0x0785, B:275:0x0789, B:277:0x0793, B:278:0x0797, B:280:0x07a2, B:281:0x07a6, B:283:0x07b0, B:284:0x07b4, B:286:0x07be, B:288:0x07c3, B:290:0x07c7, B:292:0x07cb, B:293:0x07cf, B:295:0x07d9, B:296:0x07dd, B:298:0x07e7, B:299:0x07eb, B:301:0x07f5, B:302:0x07f9, B:304:0x0803, B:305:0x0807, B:307:0x0811, B:308:0x0815, B:310:0x081f, B:311:0x0823, B:313:0x0834, B:314:0x0838, B:316:0x0845, B:317:0x0849, B:319:0x0856, B:320:0x085a, B:322:0x0867, B:323:0x086b, B:325:0x0876, B:326:0x087a, B:328:0x0890, B:329:0x0894, B:331:0x089e, B:332:0x08a2, B:334:0x08b8, B:336:0x08bc, B:337:0x08c0, B:338:0x08c9, B:340:0x08cd, B:341:0x08d1, B:343:0x08e2, B:344:0x08e6, B:346:0x08f3, B:347:0x08f7, B:349:0x0904, B:350:0x0908, B:352:0x0915, B:353:0x0919, B:355:0x0923, B:356:0x0927, B:358:0x0932, B:359:0x0936, B:361:0x0940, B:363:0x0944, B:365:0x0948, B:367:0x094c, B:369:0x0950, B:370:0x0954, B:372:0x095e, B:373:0x0962, B:375:0x096c, B:376:0x0970, B:378:0x097a, B:379:0x097e, B:381:0x0988, B:382:0x098c, B:384:0x099d, B:385:0x09a1, B:387:0x09ac, B:388:0x09b0, B:390:0x09bd, B:391:0x09c1, B:393:0x09ce, B:394:0x09d2, B:396:0x09df, B:397:0x09e3, B:399:0x09f4, B:400:0x09f8, B:402:0x0a05, B:403:0x0a09, B:405:0x0a16, B:406:0x0a1a, B:408:0x0a27, B:409:0x0a2b, B:411:0x0a35, B:412:0x0a39, B:414:0x0a44, B:417:0x0a4a, B:419:0x0a4e, B:420:0x0a52, B:422:0x0a63, B:423:0x0a67, B:425:0x0a74, B:426:0x0a78, B:428:0x0a85, B:429:0x0a89, B:431:0x0a96, B:432:0x0a9a, B:434:0x0aa4, B:435:0x0aa8, B:437:0x0ab3, B:438:0x0ab7, B:439:0x0abf, B:441:0x0ac3, B:442:0x0ac7, B:443:0x0ad0, B:445:0x0ad4, B:446:0x0ad8, B:448:0x0ae2, B:449:0x0ae6, B:451:0x0af0, B:452:0x0af4, B:454:0x0b05, B:455:0x0b09, B:457:0x0b14, B:458:0x0b18, B:460:0x0b25, B:461:0x0b29, B:463:0x0b36, B:464:0x0b3a, B:466:0x0b47, B:467:0x0b4b, B:469:0x0b55, B:470:0x0b59, B:472:0x0b63, B:473:0x0b67, B:475:0x0b71, B:477:0x0b76, B:479:0x0b7a, B:481:0x0b7e, B:482:0x0b82, B:484:0x0b8c, B:485:0x0b90, B:486:0x0b98, B:488:0x0b9c, B:489:0x0ba0, B:490:0x0ba9, B:492:0x0bb1, B:493:0x0bb5, B:495:0x0bbf, B:496:0x0bc3, B:498:0x0bcd, B:499:0x0bd1, B:501:0x0bdb, B:502:0x0bdf, B:504:0x0be9, B:505:0x0bed, B:507:0x0bf7, B:508:0x0bfb, B:510:0x0c04, B:511:0x0c08, B:512:0x0c0f, B:514:0x0c13, B:515:0x0c17, B:517:0x0c21, B:518:0x0c25, B:520:0x0c2f, B:521:0x0c33, B:523:0x0c3d, B:524:0x0c41, B:526:0x0c4b, B:527:0x0c4f, B:529:0x0c59, B:530:0x0c5d, B:532:0x0c66, B:533:0x0c6a, B:537:0x0c75, B:544:0x0c84), top: B:655:0x05a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0c84 A[Catch: Exception -> 0x05b2, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x05b2, blocks: (B:176:0x05a2, B:178:0x05ad, B:181:0x05b5, B:183:0x05c2, B:184:0x05c6, B:186:0x05d3, B:187:0x05d7, B:189:0x05e4, B:190:0x05e8, B:192:0x05f3, B:193:0x05f7, B:195:0x0608, B:196:0x060c, B:198:0x0619, B:199:0x061d, B:201:0x062a, B:202:0x062e, B:204:0x063b, B:205:0x063f, B:207:0x0649, B:208:0x064d, B:210:0x0658, B:212:0x065c, B:213:0x0660, B:215:0x066d, B:217:0x0671, B:218:0x0675, B:223:0x0685, B:225:0x0689, B:227:0x068e, B:229:0x0692, B:230:0x0696, B:232:0x06a0, B:233:0x06a4, B:235:0x06ae, B:236:0x06b2, B:238:0x06bc, B:239:0x06c0, B:241:0x06ca, B:242:0x06ce, B:244:0x06d8, B:245:0x06dc, B:247:0x06e6, B:248:0x06ea, B:250:0x06fb, B:251:0x06ff, B:253:0x070c, B:254:0x0710, B:256:0x071d, B:257:0x0721, B:259:0x072e, B:260:0x0732, B:262:0x073d, B:263:0x0741, B:265:0x0752, B:266:0x0756, B:268:0x0763, B:269:0x0767, B:271:0x0774, B:272:0x0778, B:274:0x0785, B:275:0x0789, B:277:0x0793, B:278:0x0797, B:280:0x07a2, B:281:0x07a6, B:283:0x07b0, B:284:0x07b4, B:286:0x07be, B:288:0x07c3, B:290:0x07c7, B:292:0x07cb, B:293:0x07cf, B:295:0x07d9, B:296:0x07dd, B:298:0x07e7, B:299:0x07eb, B:301:0x07f5, B:302:0x07f9, B:304:0x0803, B:305:0x0807, B:307:0x0811, B:308:0x0815, B:310:0x081f, B:311:0x0823, B:313:0x0834, B:314:0x0838, B:316:0x0845, B:317:0x0849, B:319:0x0856, B:320:0x085a, B:322:0x0867, B:323:0x086b, B:325:0x0876, B:326:0x087a, B:328:0x0890, B:329:0x0894, B:331:0x089e, B:332:0x08a2, B:334:0x08b8, B:336:0x08bc, B:337:0x08c0, B:338:0x08c9, B:340:0x08cd, B:341:0x08d1, B:343:0x08e2, B:344:0x08e6, B:346:0x08f3, B:347:0x08f7, B:349:0x0904, B:350:0x0908, B:352:0x0915, B:353:0x0919, B:355:0x0923, B:356:0x0927, B:358:0x0932, B:359:0x0936, B:361:0x0940, B:363:0x0944, B:365:0x0948, B:367:0x094c, B:369:0x0950, B:370:0x0954, B:372:0x095e, B:373:0x0962, B:375:0x096c, B:376:0x0970, B:378:0x097a, B:379:0x097e, B:381:0x0988, B:382:0x098c, B:384:0x099d, B:385:0x09a1, B:387:0x09ac, B:388:0x09b0, B:390:0x09bd, B:391:0x09c1, B:393:0x09ce, B:394:0x09d2, B:396:0x09df, B:397:0x09e3, B:399:0x09f4, B:400:0x09f8, B:402:0x0a05, B:403:0x0a09, B:405:0x0a16, B:406:0x0a1a, B:408:0x0a27, B:409:0x0a2b, B:411:0x0a35, B:412:0x0a39, B:414:0x0a44, B:417:0x0a4a, B:419:0x0a4e, B:420:0x0a52, B:422:0x0a63, B:423:0x0a67, B:425:0x0a74, B:426:0x0a78, B:428:0x0a85, B:429:0x0a89, B:431:0x0a96, B:432:0x0a9a, B:434:0x0aa4, B:435:0x0aa8, B:437:0x0ab3, B:438:0x0ab7, B:439:0x0abf, B:441:0x0ac3, B:442:0x0ac7, B:443:0x0ad0, B:445:0x0ad4, B:446:0x0ad8, B:448:0x0ae2, B:449:0x0ae6, B:451:0x0af0, B:452:0x0af4, B:454:0x0b05, B:455:0x0b09, B:457:0x0b14, B:458:0x0b18, B:460:0x0b25, B:461:0x0b29, B:463:0x0b36, B:464:0x0b3a, B:466:0x0b47, B:467:0x0b4b, B:469:0x0b55, B:470:0x0b59, B:472:0x0b63, B:473:0x0b67, B:475:0x0b71, B:477:0x0b76, B:479:0x0b7a, B:481:0x0b7e, B:482:0x0b82, B:484:0x0b8c, B:485:0x0b90, B:486:0x0b98, B:488:0x0b9c, B:489:0x0ba0, B:490:0x0ba9, B:492:0x0bb1, B:493:0x0bb5, B:495:0x0bbf, B:496:0x0bc3, B:498:0x0bcd, B:499:0x0bd1, B:501:0x0bdb, B:502:0x0bdf, B:504:0x0be9, B:505:0x0bed, B:507:0x0bf7, B:508:0x0bfb, B:510:0x0c04, B:511:0x0c08, B:512:0x0c0f, B:514:0x0c13, B:515:0x0c17, B:517:0x0c21, B:518:0x0c25, B:520:0x0c2f, B:521:0x0c33, B:523:0x0c3d, B:524:0x0c41, B:526:0x0c4b, B:527:0x0c4f, B:529:0x0c59, B:530:0x0c5d, B:532:0x0c66, B:533:0x0c6a, B:537:0x0c75, B:544:0x0c84), top: B:655:0x05a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0caa A[Catch: Exception -> 0x0ced, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0ced, blocks: (B:541:0x0c7d, B:548:0x0c8c, B:558:0x0caa, B:562:0x0cb2), top: B:649:0x0c7d }] */
    /* JADX WARN: Removed duplicated region for block: B:667:0x0c9a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:669:0x0cd1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43, types: [int] */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v46 */
    /* JADX WARN: Type inference failed for: r11v48 */
    /* JADX WARN: Type inference failed for: r11v65 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r2v112 */
    /* JADX WARN: Type inference failed for: r2v113 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v86 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void w2() {
        /*
            Method dump skipped, instruction units count: 3546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanMultiService.ApplicationStatus.VahanMultiServiceApplicationTransactionStatus.w2():void");
    }

    public static final void x2(VahanMultiServiceApplicationTransactionStatus this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void y2(VahanMultiServiceApplicationTransactionStatus this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.O2();
    }

    public static final void z2(VahanMultiServiceApplicationTransactionStatus this$0, gf result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.d() == -1) {
            Intent intentC = result.c();
            Intrinsics.checkNotNull(intentC);
            this$0.methorName = String.valueOf(intentC.getStringExtra(VContant.M_VALUE));
            this$0.j2().show();
            this$0.t2().G0(this$0, this$0.registratioNo, this$0.stateCd, this$0.chassino, this$0.pur_code);
        }
    }

    public final void P2(String authMode, String purCode, String m_value) {
        Intrinsics.checkNotNullParameter(authMode, "authMode");
        Intrinsics.checkNotNullParameter(purCode, "purCode");
        Intrinsics.checkNotNullParameter(m_value, "m_value");
        if (StringsKt__StringsKt.contains$default((CharSequence) i2().toString(), (CharSequence) ".", false, 2, (Object) null)) {
            b3(String.valueOf((int) Double.parseDouble(i2())));
        } else {
            b3(i2().toString());
        }
        if (!StringsKt__StringsJVMKt.equals(StringsKt__StringsKt.trim((CharSequence) authMode).toString(), "Mobile", true)) {
            try {
                HashMap map = new HashMap();
                map.clear();
                map.put(VContant.M_VALUE, m_value);
                Intent intent = new Intent(this, (Class<?>) VahanProcessWithAdharV1.class);
                e03.a aVar = e03.a;
                String str = this.registratioNo;
                String strI2 = i2();
                Intrinsics.checkNotNull(strI2);
                intent.putExtra(VContant.AAHARAUTH, aVar.a(str, map, strI2, this.stateCd, this.chassino, VContant.APPLICATION_SCREEN, purCode));
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
            String strI22 = i2();
            Intrinsics.checkNotNull(strI22);
            intent2.putExtra(VContant.MOBAUTH, aVar2.a(str2, map2, strI22, this.stateCd, this.chassino, VContant.APPLICATION_SCREEN, purCode));
            of ofVar2 = this.launcher;
            Intrinsics.checkNotNull(ofVar2);
            ofVar2.a(intent2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void X2(String rc_chasi_no) {
        Intrinsics.checkNotNullParameter(rc_chasi_no, "rc_chasi_no");
        HashMap map = new HashMap();
        map.put(VContant.PAY_TAX, VContant.PAY_TAX_CODE);
        setIntent(new Intent(this, (Class<?>) PayTaxActivity.class));
        getIntent().putExtra("RC", this.registratioNo);
        getIntent().putExtra("State", this.stateCd);
        getIntent().putExtra("map", map);
        getIntent().putExtra("off_code", i2());
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

    public final void Y1(final Context context, String message) {
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.p87
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMultiServiceApplicationTransactionStatus.Z1(dialog, context, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.q87
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMultiServiceApplicationTransactionStatus.a2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void Y2(MultiService multiService) {
        Intrinsics.checkNotNullParameter(multiService, "<set-?>");
        this.multiService = multiService;
    }

    public final void Z2(MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequest) {
        this.mutipaymentRequest = multiServiceBeforePaymentRequest;
    }

    public final void a3(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.nrvDetails = nrvDetails;
    }

    /* JADX INFO: renamed from: b2, reason: from getter */
    public final String getAuthStatus() {
        return this.authStatus;
    }

    public final void b3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.off_code = str;
    }

    /* JADX INFO: renamed from: c2, reason: from getter */
    public final String getChassino() {
        return this.chassino;
    }

    public final void c3(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    /* JADX INFO: renamed from: d2, reason: from getter */
    public final String getMethorName() {
        return this.methorName;
    }

    public final void d3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.p_code = str;
    }

    public final MultiService e2() {
        MultiService multiService = this.multiService;
        if (multiService != null) {
            return multiService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiService");
        return null;
    }

    public final void e3(boolean z) {
        this.paymentFlag = z;
    }

    /* JADX INFO: renamed from: f2, reason: from getter */
    public final ArrayList getMultiServiceList() {
        return this.multiServiceList;
    }

    public final void f3(BeforePaymentRequest beforePaymentRequest) {
        Intrinsics.checkNotNullParameter(beforePaymentRequest, "<set-?>");
        this.paymentRequest = beforePaymentRequest;
    }

    /* JADX INFO: renamed from: g2, reason: from getter */
    public final MultiServiceBeforePaymentRequest getMutipaymentRequest() {
        return this.mutipaymentRequest;
    }

    public final void g3(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitService = vahanProService;
    }

    public final NrvDetails h2() {
        NrvDetails nrvDetails = this.nrvDetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nrvDetails");
        return null;
    }

    public final void h3(VahanServiceConnection vahanServiceConnection) {
        Intrinsics.checkNotNullParameter(vahanServiceConnection, "<set-?>");
        this.retrofitService1 = vahanServiceConnection;
    }

    public final String i2() {
        String str = this.off_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("off_code");
        return null;
    }

    public final void i3(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.slotService = vahanProService;
    }

    public final ProgressDialog j2() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final void j3(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.slotViewModel = ld7Var;
    }

    /* JADX INFO: renamed from: k2, reason: from getter */
    public final String getP_code() {
        return this.p_code;
    }

    public final void k3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.total_amount = str;
    }

    /* JADX INFO: renamed from: l2, reason: from getter */
    public final boolean getPaymentFlag() {
        return this.paymentFlag;
    }

    public final void l3(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModel = ld7Var;
    }

    /* JADX INFO: renamed from: m2, reason: from getter */
    public final String getPur_code() {
        return this.pur_code;
    }

    public final void m3(al7 al7Var) {
        Intrinsics.checkNotNullParameter(al7Var, "<set-?>");
        this.viewModel1 = al7Var;
    }

    /* JADX INFO: renamed from: n2, reason: from getter */
    public final RequireDataForBePaymet getReqBeforPayment() {
        return this.reqBeforPayment;
    }

    public final void n3(MultiSelectionViewModel multiSelectionViewModel) {
        Intrinsics.checkNotNullParameter(multiSelectionViewModel, "<set-?>");
        this.viewModelMulti = multiSelectionViewModel;
    }

    public final VahanProService o2() {
        VahanProService vahanProService = this.retrofitService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        Y1(this, new wa3(this).b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
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
        i3(companion.a(this));
        this.otpRetrofitService = ApplicationServiceOtp.INSTANCE.a(this);
        this.paymentService = ApplicationService.INSTANCE.a(this);
        j3((ld7) new z(this, new kd7(new jd7(r2()))).a(ld7.class));
        ApplicationService applicationService = this.paymentService;
        if (applicationService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paymentService");
            applicationService = null;
        }
        this.viewModelPayment = (jv) new z(this, new rv6(new qw(applicationService))).a(jv.class);
        Y2(MultiService.INSTANCE.a(this));
        n3((MultiSelectionViewModel) new z(this, new y67(new sx3(e2()))).a(MultiSelectionViewModel.class));
        c3(new ProgressDialog(this));
        j2().setMessage("Please wait...");
        j2().setCancelable(false);
        j2().setCanceledOnTouchOutside(false);
        g3(companion.a(this));
        h3(VahanServiceConnection.INSTANCE.a(this));
        m3((al7) new z(this, new bl7(new bg7(p2()))).a(al7.class));
        l3((ld7) new z(this, new kd7(new jd7(o2()))).a(ld7.class));
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
            Type type = new TypeToken<ArrayList<ApplStatusTransListModel>>() { // from class: com.nic.mparivahan.VahanServices.VahanMultiService.ApplicationStatus.VahanMultiServiceApplicationTransactionStatus$onCreate$type$1
            }.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            Object objFromJson = new Gson().fromJson(getIntent().getStringExtra("transList"), type);
            Intrinsics.checkNotNull(objFromJson, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.VahanServices.VahanModel.ApplStatusTransListModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.VahanServices.VahanModel.ApplStatusTransListModel> }");
            ArrayList arrayList = (ArrayList) objFromJson;
            this.transList = arrayList;
            String chassisNo = ((ApplStatusTransListModel) arrayList.get(0)).getCurrentlist().get(0).getChassisNo();
            Intrinsics.checkNotNull(chassisNo);
            String strSubstring = chassisNo.substring(chassisNo.length() - 5, chassisNo.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            this.chassino = strSubstring;
        }
        X1();
        w2();
        this.launcher = B0(new mf(), new hf() { // from class: com.zepto.l87
            @Override // com.zepto.hf
            public final void a(Object obj) {
                VahanMultiServiceApplicationTransactionStatus.z2(this.a, (gf) obj);
            }
        });
        jv jvVar2 = this.viewModelPayment;
        if (jvVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModelPayment");
            jvVar2 = null;
        }
        jvVar2.z().g(this, new l(new f()));
        jv jvVar3 = this.viewModelPayment;
        if (jvVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModelPayment");
            jvVar3 = null;
        }
        jvVar3.y().g(this, new l(new g()));
        db3 db3Var2 = this.binding;
        if (db3Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            db3Var2 = null;
        }
        db3Var2.x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.g97
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMultiServiceApplicationTransactionStatus.E2(this.a, view);
            }
        });
        db3 db3Var3 = this.binding;
        if (db3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            db3Var3 = null;
        }
        db3Var3.Z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.h97
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMultiServiceApplicationTransactionStatus.G2(this.a, view);
            }
        });
        db3 db3Var4 = this.binding;
        if (db3Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            db3Var4 = null;
        }
        db3Var4.L.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.i97
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMultiServiceApplicationTransactionStatus.H2(this.a, view);
            }
        });
        db3 db3Var5 = this.binding;
        if (db3Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            db3Var5 = null;
        }
        db3Var5.q.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.j97
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMultiServiceApplicationTransactionStatus.I2(this.a, view);
            }
        });
        v2().p().g(this, new mf4() { // from class: com.zepto.k97
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanMultiServiceApplicationTransactionStatus.J2(this.a, (MultiBeforePaymentResponse) obj);
            }
        });
        t2().E0().g(this, new mf4() { // from class: com.zepto.l97
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanMultiServiceApplicationTransactionStatus.K2(this.a, (String) obj);
            }
        });
        jv jvVar4 = this.viewModelPayment;
        if (jvVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModelPayment");
            jvVar4 = null;
        }
        jvVar4.C().g(this, new l(new a()));
        s2().H0().g(this, new l(new b()));
        jv jvVar5 = this.viewModelPayment;
        if (jvVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModelPayment");
        } else {
            jvVar = jvVar5;
        }
        jvVar.B().g(this, new l(new c()));
        t2().Y().g(this, new mf4() { // from class: com.zepto.m87
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanMultiServiceApplicationTransactionStatus.L2(this.a, (RequireDataForBePaymet) obj);
            }
        });
        t2().b0().g(this, new mf4() { // from class: com.zepto.n87
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanMultiServiceApplicationTransactionStatus.M2(this.a, (String) obj);
            }
        });
        t2().Z().g(this, new mf4() { // from class: com.zepto.o87
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanMultiServiceApplicationTransactionStatus.A2(this.a, (RequireDataForBePaymet) obj);
            }
        });
        t2().a0().g(this, new mf4() { // from class: com.zepto.w87
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanMultiServiceApplicationTransactionStatus.B2(this.a, (String) obj);
            }
        });
        t2().J0().g(this, new l(new d()));
        u2().k().g(this, new l(new e()));
        t2().T().g(this, new mf4() { // from class: com.zepto.e97
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanMultiServiceApplicationTransactionStatus.C2(this.a, (FeesModle) obj);
            }
        });
        t2().U().g(this, new mf4() { // from class: com.zepto.f97
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanMultiServiceApplicationTransactionStatus.D2(this.a, (String) obj);
            }
        });
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() {
        super.onResume();
        s2().I0().g(this, new l(new h()));
        u2().k().g(this, new l(new i()));
        s2().Y0().g(this, new l(new j()));
        s2().X0().g(this, new l(new k()));
        s2().K0().g(this, new mf4() { // from class: com.zepto.r87
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                VahanMultiServiceApplicationTransactionStatus.N2(this.a, (String) obj);
            }
        });
    }

    @Override // com.zepto.pq, com.zepto.yf2, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    public final VahanServiceConnection p2() {
        VahanServiceConnection vahanServiceConnection = this.retrofitService1;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService1");
        return null;
    }

    /* JADX INFO: renamed from: q2, reason: from getter */
    public final boolean getSlotFlag() {
        return this.slotFlag;
    }

    public final VahanProService r2() {
        VahanProService vahanProService = this.slotService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("slotService");
        return null;
    }

    public final ld7 s2() {
        ld7 ld7Var = this.slotViewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("slotViewModel");
        return null;
    }

    public final void s3(Context context, String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.z87
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMultiServiceApplicationTransactionStatus.t3(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final ld7 t2() {
        ld7 ld7Var = this.viewModel;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final al7 u2() {
        al7 al7Var = this.viewModel1;
        if (al7Var != null) {
            return al7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel1");
        return null;
    }

    public final void u3(Context context, String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.u87
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VahanMultiServiceApplicationTransactionStatus.v3(dialog, view);
            }
        });
        dialog.show();
    }

    public final MultiSelectionViewModel v2() {
        MultiSelectionViewModel multiSelectionViewModel = this.viewModelMulti;
        if (multiSelectionViewModel != null) {
            return multiSelectionViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelMulti");
        return null;
    }
}
