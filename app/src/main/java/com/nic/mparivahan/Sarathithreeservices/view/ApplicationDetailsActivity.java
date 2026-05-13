package com.nic.mparivahan.Sarathithreeservices.view;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.FileProvider;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.nic.mparivahan.ClServices.Pojo.ClApplFlowStatus;
import com.nic.mparivahan.ClServices.View.ClDocumentsUpload;
import com.nic.mparivahan.ClServices.View.ClFeePayment;
import com.nic.mparivahan.ClServices.View.ClPhotoSignature;
import com.nic.mparivahan.ClServices.View.ClSots;
import com.nic.mparivahan.DLServicesAuth.Forms.FormsInterface;
import com.nic.mparivahan.DLServicesAuth.Forms.FormsPojo;
import com.nic.mparivahan.DLServicesAuth.Model.RTO.DlLastRtoDetailsDto;
import com.nic.mparivahan.DLServicesAuth.Model.RTO.Result;
import com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.LLServices.LlInterface;
import com.nic.mparivahan.LLServices.UI.LlDocumentUpload;
import com.nic.mparivahan.LLServices.UI.LlPayment;
import com.nic.mparivahan.LLServices.UI.LlPhotoSignature;
import com.nic.mparivahan.LLServices.UI.LlSlots;
import com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload;
import com.nic.mparivahan.NewDlScreen.DlAcknow.DlFeePayment;
import com.nic.mparivahan.NewDlScreen.DlAcknow.DlPhotoSign;
import com.nic.mparivahan.NewDlScreen.DlAcknow.DlSlots;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sarathithreeservices.model.ResponseBody;
import com.nic.mparivahan.Sarathithreeservices.model.TransReqItem;
import com.nic.mparivahan.Sarathithreeservices.model.app_status.ApplFlowStatus;
import com.nic.mparivahan.Sarathithreeservices.model.app_status.ApplStatusDetail;
import com.nic.mparivahan.Sarathithreeservices.model.app_status.GetAppStatusMain;
import com.nic.mparivahan.Sarathithreeservices.model.app_status.PendingAt;
import com.nic.mparivahan.Sarathithreeservices.model.slot_pdf.SlotPdfDownloadResponse;
import com.nic.mparivahan.Sarathithreeservices.network.GetApplStatusService;
import com.nic.mparivahan.Sarathithreeservices.view.ApplicationDetailsActivity;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.nic.mparivahan.dlservices.newlearner.LLDocUpload;
import com.nic.mparivahan.dlservices.newlearner.LLFeePayment;
import com.nic.mparivahan.dlservices.newlearner.LLPhotoSign;
import com.nic.mparivahan.dlservices.newlearner.LLSlots;
import com.nic.mparivahan.dlservices.ui.dms.DlDocActivity;
import com.nic.mparivahan.dlservices.ui.payment.DLRenewalFeePaymentActivity;
import com.nic.mparivahan.dlservices.ui.photoandsign.DlPhotoAndSignatureActivity;
import com.nic.mparivahan.dlservices.ui.slots.DlRenewalSlotsActivity;
import com.zepto.bj2;
import com.zepto.cx;
import com.zepto.dm3;
import com.zepto.dx;
import com.zepto.gd1;
import com.zepto.gf2;
import com.zepto.hl3;
import com.zepto.lf2;
import com.zepto.lh4;
import com.zepto.lr1;
import com.zepto.mf2;
import com.zepto.mf4;
import com.zepto.mr1;
import com.zepto.nr1;
import com.zepto.o40;
import com.zepto.o6;
import com.zepto.q44;
import com.zepto.rq1;
import com.zepto.sq4;
import com.zepto.st6;
import com.zepto.sw4;
import com.zepto.ta3;
import com.zepto.tt6;
import com.zepto.uj3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.xu;
import com.zepto.zu;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\t¢\u0006\u0006\bï\u0001\u0010ð\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0003J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\b\u0010\f\u001a\u00020\u0003H\u0002J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0003H\u0002J\b\u0010\u0019\u001a\u00020\u0003H\u0002J\b\u0010\u001a\u001a\u00020\u0003H\u0002J\b\u0010\u001b\u001a\u00020\u0003H\u0002J\b\u0010\u001c\u001a\u00020\u0003H\u0002J\b\u0010\u001d\u001a\u00020\u0003H\u0002J\b\u0010\u001e\u001a\u00020\u0003H\u0002J\b\u0010\u001f\u001a\u00020\u0003H\u0002J\b\u0010 \u001a\u00020\u0003H\u0002J\u001a\u0010#\u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u00142\u0006\u0010\"\u001a\u00020\u0014H\u0002J\u001a\u0010$\u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u00142\u0006\u0010\"\u001a\u00020\u0014H\u0002J\u001a\u0010%\u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u00142\u0006\u0010\"\u001a\u00020\u0014H\u0002J\b\u0010&\u001a\u00020\u0003H\u0002J\b\u0010'\u001a\u00020\u0003H\u0002J\b\u0010(\u001a\u00020\u0003H\u0002J\b\u0010)\u001a\u00020\u0003H\u0002J\b\u0010*\u001a\u00020\u0003H\u0002J\b\u0010+\u001a\u00020\u0003H\u0002J\b\u0010,\u001a\u00020\u0003H\u0002J\b\u0010-\u001a\u00020\u0003H\u0002J\b\u0010.\u001a\u00020\u0003H\u0002J\b\u0010/\u001a\u00020\u0003H\u0002J\b\u00100\u001a\u00020\u0003H\u0002J\b\u00101\u001a\u00020\u0003H\u0002J\u0012\u00104\u001a\u00020\u00032\b\u00103\u001a\u0004\u0018\u000102H\u0014J\b\u00105\u001a\u00020\u0003H\u0016J\u000e\u00106\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0014J\u000e\u00108\u001a\u00020\u00142\u0006\u00107\u001a\u00020\u0014J\u001a\u00109\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010!\u001a\u0004\u0018\u00010\u0014J/\u0010@\u001a\u00020\u00032\u0006\u0010;\u001a\u00020:2\u000e\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140<2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ)\u0010E\u001a\u00020\u00032\b\u0010B\u001a\u0004\u0018\u00010:2\u0006\u0010C\u001a\u00020:2\u0006\u0010D\u001a\u00020:H\u0016¢\u0006\u0004\bE\u0010FJ\u0010\u0010H\u001a\u00020\u00142\u0006\u0010G\u001a\u00020\u0014H\u0007R\u0016\u0010K\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010O\u001a\u00020L8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0016\u0010Y\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bX\u0010JR\u0016\u0010Z\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010JR\u0016\u0010^\u001a\u00020[8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\\\u0010]R\"\u0010f\u001a\u00020_8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0018\u0010j\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\"\u0010r\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u0016\u0010t\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bs\u0010JR\u0016\u0010v\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bu\u0010JR\u0016\u0010y\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010{\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010JR\u0016\u0010}\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010JR\u0016\u0010\u007f\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b~\u0010JR\u0016\u0010\u0081\u0001\u001a\u00020:8\u0002X\u0082D¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010XR\u0018\u0010\u0083\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010JR\u0018\u0010\u0085\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010JR\u0018\u0010\u0087\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010JR\u0018\u0010\u0089\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010JR)\u0010\u0090\u0001\u001a\u00030\u008a\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\bx\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R0\u0010\u0098\u0001\u001a\t\u0012\u0004\u0012\u00020\t0\u0091\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R*\u0010 \u0001\u001a\u00030\u0099\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R*\u0010¨\u0001\u001a\u00030¡\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R(\u0010®\u0001\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b©\u0001\u0010J\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R*\u0010¶\u0001\u001a\u00030¯\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R&\u0010º\u0001\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b·\u0001\u0010m\u001a\u0005\b¸\u0001\u0010o\"\u0005\b¹\u0001\u0010qR(\u0010¾\u0001\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b»\u0001\u0010J\u001a\u0006\b¼\u0001\u0010«\u0001\"\u0006\b½\u0001\u0010\u00ad\u0001R*\u0010Æ\u0001\u001a\u00030¿\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0006\bÄ\u0001\u0010Å\u0001R*\u0010Î\u0001\u001a\u00030Ç\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÈ\u0001\u0010É\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001\"\u0006\bÌ\u0001\u0010Í\u0001R*\u0010Ö\u0001\u001a\u00030Ï\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÐ\u0001\u0010Ñ\u0001\u001a\u0006\bÒ\u0001\u0010Ó\u0001\"\u0006\bÔ\u0001\u0010Õ\u0001R*\u0010Þ\u0001\u001a\u00030×\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bØ\u0001\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001R0\u0010â\u0001\u001a\t\u0012\u0004\u0012\u00020\u00140\u0091\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bß\u0001\u0010\u0093\u0001\u001a\u0006\bà\u0001\u0010\u0095\u0001\"\u0006\bá\u0001\u0010\u0097\u0001R0\u0010æ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00140\u0091\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bã\u0001\u0010\u0093\u0001\u001a\u0006\bä\u0001\u0010\u0095\u0001\"\u0006\bå\u0001\u0010\u0097\u0001R*\u0010î\u0001\u001a\u00030ç\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bè\u0001\u0010é\u0001\u001a\u0006\bê\u0001\u0010ë\u0001\"\u0006\bì\u0001\u0010í\u0001¨\u0006ñ\u0001"}, d2 = {"Lcom/nic/mparivahan/Sarathithreeservices/view/ApplicationDetailsActivity;", "Lcom/zepto/o40;", "Lcom/zepto/lh4;", "", "K2", "L2", "r2", "d2", "", "Lcom/nic/mparivahan/Sarathithreeservices/model/app_status/ApplFlowStatus;", "dlFlowDetails", "g2", "I2", "", "visible", "q3", "Landroid/content/Context;", "context", "h2", "b3", "", "fileName", "Q2", "p2", "e2", "N3", "D3", "E3", "O3", "M3", "K3", "J3", "L3", "message", "pdfUrl", "V2", "Z2", "X2", "v3", "x3", "w3", "y3", "F3", "H3", "G3", "I3", "B3", "z3", "A3", "C3", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "S2", "fdate", "o2", "T2", "", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "mCode", "position", "trCode", "J", "(Ljava/lang/Integer;II)V", "date", "f2", "F", "Ljava/lang/String;", "dlNo", "Lcom/zepto/nr1;", "G", "Lcom/zepto/nr1;", "dlServicesViewModel", "Lcom/zepto/o6;", "H", "Lcom/zepto/o6;", "x2", "()Lcom/zepto/o6;", "j3", "(Lcom/zepto/o6;)V", "mBinding", "I", "app_no", "dob", "Lcom/zepto/cx;", "K", "Lcom/zepto/cx;", "appStatusVM", "Lcom/nic/mparivahan/Sarathithreeservices/network/GetApplStatusService;", "L", "Lcom/nic/mparivahan/Sarathithreeservices/network/GetApplStatusService;", "q2", "()Lcom/nic/mparivahan/Sarathithreeservices/network/GetApplStatusService;", "d3", "(Lcom/nic/mparivahan/Sarathithreeservices/network/GetApplStatusService;)V", "appInfoService", "Lcom/zepto/sw4;", "M", "Lcom/zepto/sw4;", "mProgressApplication", "Lcom/zepto/wl5;", "N", "Lcom/zepto/wl5;", "H2", "()Lcom/zepto/wl5;", "u3", "(Lcom/zepto/wl5;)V", "sarthiSession", "O", "title_name", "P", "format_date", "Q", "Z", "check_status", "R", "fee_payment", "S", "slot_book", "T", "dir_path", "U", "PERMISSION_CODE_READ_EXTERNAL_STORAGE", "V", "lastEndorseRtoCode", "W", "lastEndorseStateCode", "X", "lastEndRTO", "Y", "lastEndState", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "F2", "()Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "s3", "(Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;)V", "retrofitService", "Ljava/util/ArrayList;", "a0", "Ljava/util/ArrayList;", "A2", "()Ljava/util/ArrayList;", "m3", "(Ljava/util/ArrayList;)V", "mListVal", "Lcom/zepto/mf2;", "b0", "Lcom/zepto/mf2;", "z2", "()Lcom/zepto/mf2;", "l3", "(Lcom/zepto/mf2;)V", "mFormsVM", "Lcom/nic/mparivahan/DLServicesAuth/Forms/FormsInterface;", "c0", "Lcom/nic/mparivahan/DLServicesAuth/Forms/FormsInterface;", "y2", "()Lcom/nic/mparivahan/DLServicesAuth/Forms/FormsInterface;", "k3", "(Lcom/nic/mparivahan/DLServicesAuth/Forms/FormsInterface;)V", "mFormsInterface", "d0", "getStatusAdapter", "()Ljava/lang/String;", "setStatusAdapter", "(Ljava/lang/String;)V", "statusAdapter", "Lcom/zepto/wa3;", "e0", "Lcom/zepto/wa3;", "u2", "()Lcom/zepto/wa3;", "g3", "(Lcom/zepto/wa3;)V", "langSession", "f0", "G2", "t3", "sarathiSession", "g0", "s2", "e3", "appliedService", "Lcom/nic/mparivahan/Sarathithreeservices/model/ResponseBody;", "h0", "Lcom/nic/mparivahan/Sarathithreeservices/model/ResponseBody;", "E2", "()Lcom/nic/mparivahan/Sarathithreeservices/model/ResponseBody;", "r3", "(Lcom/nic/mparivahan/Sarathithreeservices/model/ResponseBody;)V", "respBody", "Lcom/zepto/dm3;", "i0", "Lcom/zepto/dm3;", "C2", "()Lcom/zepto/dm3;", "o3", "(Lcom/zepto/dm3;)V", "mLlViewModel", "Lcom/nic/mparivahan/LLServices/LlInterface;", "j0", "Lcom/nic/mparivahan/LLServices/LlInterface;", "B2", "()Lcom/nic/mparivahan/LLServices/LlInterface;", "n3", "(Lcom/nic/mparivahan/LLServices/LlInterface;)V", "mLlInterface", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "k0", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "w2", "()Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "i3", "(Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;)V", "llDetails", "l0", "D2", "p3", "multiList", "m0", "v2", "h3", "listHeaderSteps", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "n0", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "t2", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "f3", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "dlDetails", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nApplicationDetailsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApplicationDetailsActivity.kt\ncom/nic/mparivahan/Sarathithreeservices/view/ApplicationDetailsActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2155:1\n1855#2,2:2156\n1#3:2158\n*S KotlinDebug\n*F\n+ 1 ApplicationDetailsActivity.kt\ncom/nic/mparivahan/Sarathithreeservices/view/ApplicationDetailsActivity\n*L\n633#1:2156,2\n*E\n"})
public final class ApplicationDetailsActivity extends o40 implements lh4 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String dlNo;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public nr1 dlServicesViewModel;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public o6 mBinding;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String app_no;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public cx appStatusVM;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public GetApplStatusService appInfoService;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public sw4 mProgressApplication;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String title_name;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String format_date;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String dir_path;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String lastEndorseRtoCode;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String lastEndorseStateCode;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String lastEndRTO;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String lastEndState;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public DlServiceInt retrofitService;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public ArrayList mListVal;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public mf2 mFormsVM;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public FormsInterface mFormsInterface;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public wl5 sarathiSession;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public ResponseBody respBody;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public dm3 mLlViewModel;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public LlInterface mLlInterface;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public FetchLlDetails llDetails;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public ArrayList multiList;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public ArrayList listHeaderSteps;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public DldetobjX dlDetails;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String dob = "";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public boolean check_status = true;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String fee_payment = VContant.MAINSCREEN;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String slot_book = VContant.MAINSCREEN;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public final int PERMISSION_CODE_READ_EXTERNAL_STORAGE = 5001;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public String statusAdapter = "0";

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public String appliedService = "";

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(FetchLlDetails fetchLlDetails) {
            ApplicationDetailsActivity.this.q3(false);
            try {
                if (StringsKt__StringsJVMKt.equals(fetchLlDetails.getLLDetails().get(0).getStatus_code(), "00", true)) {
                    ApplicationDetailsActivity applicationDetailsActivity = ApplicationDetailsActivity.this;
                    Intrinsics.checkNotNull(fetchLlDetails);
                    applicationDetailsActivity.i3(fetchLlDetails);
                }
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((FetchLlDetails) obj);
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
            ApplicationDetailsActivity.this.q3(false);
            ApplicationDetailsActivity.this.S2("Record not found");
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(DLServiceResponseModleV1 dLServiceResponseModleV1) {
            ApplicationDetailsActivity.this.q3(false);
            try {
                if (dLServiceResponseModleV1.getDldetobj().get(0).getErrorcd() == 0 || dLServiceResponseModleV1.getDldetobj().get(0).getErrorcd() == 1) {
                    ApplicationDetailsActivity.this.f3(dLServiceResponseModleV1.getDldetobj().get(0));
                } else if (gd1.a.m(dLServiceResponseModleV1.getStatusDesc())) {
                    ApplicationDetailsActivity.this.S2("Something went wrong.");
                } else {
                    ApplicationDetailsActivity.this.S2(String.valueOf(dLServiceResponseModleV1.getStatusDesc()));
                }
            } catch (Exception e) {
                ApplicationDetailsActivity.this.S2("Record not found");
                String message = e.getMessage();
                if (message != null) {
                    Log.d("DlServicesMainScreen_L", message);
                }
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DLServiceResponseModleV1) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        public final void a(DlLastRtoDetailsDto dlLastRtoDetailsDto) {
            List<Result> result;
            try {
                if (dlLastRtoDetailsDto.getStatus_code().equals("00") && dlLastRtoDetailsDto.getStatus_desc().equals("success") && (result = dlLastRtoDetailsDto.getResult()) != null) {
                    ApplicationDetailsActivity applicationDetailsActivity = ApplicationDetailsActivity.this;
                    String rtoCode = result.get(0).getRtoCode();
                    Intrinsics.checkNotNull(rtoCode);
                    applicationDetailsActivity.lastEndorseRtoCode = rtoCode;
                    ApplicationDetailsActivity applicationDetailsActivity2 = ApplicationDetailsActivity.this;
                    String stCode = result.get(0).getStCode();
                    Intrinsics.checkNotNull(stCode);
                    applicationDetailsActivity2.lastEndorseStateCode = stCode;
                    ApplicationDetailsActivity.this.lastEndRTO = String.valueOf(result.get(0).getLastEndRTO());
                    ApplicationDetailsActivity.this.lastEndState = String.valueOf(result.get(0).getLastEndState());
                }
            } catch (Exception unused) {
                ApplicationDetailsActivity.this.S2("Service temporarily unavailable, Please try again later.");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DlLastRtoDetailsDto) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
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
        public final void a(GetAppStatusMain getAppStatusMain) {
            String appPhotoBase64;
            ApplicationDetailsActivity.this.q3(false);
            try {
                if (!Intrinsics.areEqual(getAppStatusMain.getStatus_code(), "00") || !Intrinsics.areEqual(getAppStatusMain.getStatus_desc(), "Success")) {
                    ApplicationDetailsActivity.this.x2().v.setVisibility(8);
                    ApplicationDetailsActivity.this.x2().t.setVisibility(8);
                    ApplicationDetailsActivity applicationDetailsActivity = ApplicationDetailsActivity.this;
                    applicationDetailsActivity.T2(applicationDetailsActivity, getAppStatusMain.getStatus_desc());
                    return;
                }
                ApplicationDetailsActivity.this.x2().v.setVisibility(0);
                ApplicationDetailsActivity.this.x2().t.setVisibility(0);
                List<ApplStatusDetail> applStatus_Details = getAppStatusMain.getApplStatus_Details();
                ApplicationDetailsActivity.this.x2().g.setText(applStatus_Details.get(0).getApplno());
                ApplicationDetailsActivity.this.x2().c.setText(applStatus_Details.get(0).getApplName());
                ApplicationDetailsActivity.this.x2().e.setText(applStatus_Details.get(0).getDob());
                ApplicationDetailsActivity.this.x2().K.setText(applStatus_Details.get(0).getRtoCd());
                ApplicationDetailsActivity.this.x2().F.setText(applStatus_Details.get(0).getRtoName());
                List<List<String>> reqObjlst = applStatus_Details.get(0).getReqObjlst();
                String str = "";
                if (StringsKt__StringsJVMKt.equals(applStatus_Details.get(0).getEKYCOpted(), "YES", true)) {
                    String eKYCId = applStatus_Details.get(0).getEKYCId().length() > 0 ? applStatus_Details.get(0).getEKYCId() : "";
                    if (applStatus_Details.isEmpty() || (appPhotoBase64 = applStatus_Details.get(0).getAppPhotoBase64()) == null || appPhotoBase64.length() == 0) {
                        appPhotoBase64 = "";
                    }
                    ApplicationDetailsActivity.this.H2().q(eKYCId, "Y", "NA", appPhotoBase64);
                } else {
                    ApplicationDetailsActivity.this.H2().q("NA", "N", "NA", "NA");
                }
                ApplicationDetailsActivity.this.p3(new ArrayList());
                ApplicationDetailsActivity.this.h3(new ArrayList());
                Iterator<List<String>> it = reqObjlst.iterator();
                if (it.hasNext()) {
                    List<String> next = it.next();
                    str = next.get(1);
                    ApplicationDetailsActivity.this.x2().E.setVisibility(8);
                    if (next.size() >= 3) {
                        ApplicationDetailsActivity.this.dlNo = next.get(3);
                    }
                }
                if (reqObjlst.size() > 1) {
                    ApplicationDetailsActivity.this.G2().t("DL Services", VContant.MULTISERVICE_PURPOSE_CODE);
                    for (List<String> list : reqObjlst) {
                        ApplicationDetailsActivity.this.D2().add(list.get(1));
                        ApplicationDetailsActivity.this.v2().add(list.get(1));
                    }
                } else {
                    ApplicationDetailsActivity.this.G2().t(str, "0000");
                }
                int size = applStatus_Details.get(0).getReqObjlst().size();
                for (int i = 0; i < size; i++) {
                    if (reqObjlst.get(i).size() > 0) {
                        ApplicationDetailsActivity applicationDetailsActivity2 = ApplicationDetailsActivity.this;
                        applicationDetailsActivity2.e3(applicationDetailsActivity2.getAppliedService() + reqObjlst.get(i).get(0) + " . " + reqObjlst.get(i).get(1) + '\n');
                    }
                }
                ApplicationDetailsActivity.this.x2().r.setText(ApplicationDetailsActivity.this.getAppliedService());
                if (StringsKt__StringsKt.contains((CharSequence) getAppStatusMain.toString(), (CharSequence) "pendingAt", true)) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList<PendingAt> pendingAt = getAppStatusMain.getApplStatus_Details().get(0).getPendingAt();
                    if (pendingAt == null || pendingAt.isEmpty()) {
                        ApplicationDetailsActivity.this.x2().C.setText("Licence has been Approved");
                    } else {
                        ApplicationDetailsActivity.this.x2().I.setVisibility(0);
                        ApplicationDetailsActivity.this.x2().I.setLayoutManager(new LinearLayoutManager(ApplicationDetailsActivity.this));
                        ApplicationDetailsActivity.this.x2().I.setAdapter(null);
                        int size2 = pendingAt.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            if (!arrayList.contains(pendingAt.get(i2).getPending_at())) {
                                arrayList.add(pendingAt.get(i2).getPending_at());
                            }
                        }
                        ApplicationDetailsActivity.this.x2().I.setAdapter(new sq4(arrayList));
                        ApplicationDetailsActivity.this.x2().C.setText("Application Pending at RTO Side");
                    }
                } else {
                    ApplicationDetailsActivity.this.x2().I.setVisibility(8);
                    ApplicationDetailsActivity.this.x2().C.setText("Licence has been Approved");
                }
                if (applStatus_Details.get(0).getApplFlowStatusList().size() <= 0 || !(!applStatus_Details.get(0).getApplFlowStatusList().isEmpty())) {
                    return;
                }
                if (applStatus_Details.get(0).getApplFlowStatusList().get(0).getTrCd() != 552 && applStatus_Details.get(0).getApplFlowStatusList().get(0).getTrCd() != 553 && applStatus_Details.get(0).getApplFlowStatusList().get(0).getTrCd() != 554 && applStatus_Details.get(0).getApplFlowStatusList().get(0).getTrCd() != 559 && applStatus_Details.get(0).getApplFlowStatusList().get(0).getTrCd() != 551 && applStatus_Details.get(0).getApplFlowStatusList().get(0).getTrCd() != 502 && applStatus_Details.get(0).getApplFlowStatusList().get(0).getTrCd() != 504 && applStatus_Details.get(0).getApplFlowStatusList().get(0).getTrCd() != 574 && applStatus_Details.get(0).getApplFlowStatusList().get(0).getTrCd() != 511 && applStatus_Details.get(0).getApplFlowStatusList().get(0).getTrCd() != 501 && applStatus_Details.get(0).getApplFlowStatusList().get(0).getTrCd() != 509) {
                    ApplicationDetailsActivity.this.e2();
                    ApplicationDetailsActivity.this.g2(applStatus_Details.get(0).getApplFlowStatusList());
                    ApplicationDetailsActivity.this.x2().H.setLayoutManager(new LinearLayoutManager(ApplicationDetailsActivity.this));
                    ApplicationDetailsActivity.this.x2().H.setAdapter(null);
                    ApplicationDetailsActivity.this.m3(getAppStatusMain.getApplStatus_Details().get(0).getApplFlowStatusList());
                    ArrayList arrayListA2 = ApplicationDetailsActivity.this.A2();
                    ApplicationDetailsActivity applicationDetailsActivity3 = ApplicationDetailsActivity.this;
                    ApplicationDetailsActivity.this.x2().H.setAdapter(new xu(arrayListA2, applicationDetailsActivity3, applicationDetailsActivity3));
                    int size3 = ApplicationDetailsActivity.this.A2().size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        if (applStatus_Details.get(0).getApplFlowStatusList().get(i3).getAcCd() == 371 && StringsKt__StringsJVMKt.equals(applStatus_Details.get(0).getApplFlowStatusList().get(i3).getStatus(), "Completed", true)) {
                            ApplicationDetailsActivity.this.slot_book = "0";
                        }
                        if (applStatus_Details.get(0).getApplFlowStatusList().get(i3).getAcCd() == 134 && StringsKt__StringsJVMKt.equals(applStatus_Details.get(0).getApplFlowStatusList().get(i3).getStatus(), "Completed", true)) {
                            ApplicationDetailsActivity.this.fee_payment = "0";
                        }
                    }
                    return;
                }
                ApplicationDetailsActivity.this.g2(applStatus_Details.get(0).getApplFlowStatusList());
                ApplicationDetailsActivity.this.x2().H.setLayoutManager(new LinearLayoutManager(ApplicationDetailsActivity.this));
                ApplicationDetailsActivity.this.x2().H.setAdapter(null);
                ApplicationDetailsActivity.this.m3(getAppStatusMain.getApplStatus_Details().get(0).getApplFlowStatusList());
                ArrayList arrayList2 = new ArrayList();
                int size4 = ApplicationDetailsActivity.this.A2().size();
                for (int i4 = 0; i4 < size4; i4++) {
                    if (((ApplFlowStatus) ApplicationDetailsActivity.this.A2().get(i4)).getAcCd() != 455) {
                        ClApplFlowStatus clApplFlowStatus = new ClApplFlowStatus();
                        clApplFlowStatus.setAcCd(((ApplFlowStatus) ApplicationDetailsActivity.this.A2().get(i4)).getAcCd());
                        clApplFlowStatus.setAcDesc(((ApplFlowStatus) ApplicationDetailsActivity.this.A2().get(i4)).getAcDesc());
                        clApplFlowStatus.setFlowSlno(((ApplFlowStatus) ApplicationDetailsActivity.this.A2().get(i4)).getFlowSlno());
                        clApplFlowStatus.setStatus(((ApplFlowStatus) ApplicationDetailsActivity.this.A2().get(i4)).getStatus());
                        clApplFlowStatus.setTrCd(((ApplFlowStatus) ApplicationDetailsActivity.this.A2().get(i4)).getTrCd());
                        clApplFlowStatus.setTrName(((ApplFlowStatus) ApplicationDetailsActivity.this.A2().get(i4)).getTrName());
                        arrayList2.add(clApplFlowStatus);
                    }
                }
                ApplicationDetailsActivity applicationDetailsActivity4 = ApplicationDetailsActivity.this;
                ApplicationDetailsActivity.this.x2().H.setAdapter(new zu(arrayList2, applicationDetailsActivity4, applicationDetailsActivity4));
                ApplicationDetailsActivity.this.x2().t.setVisibility(8);
                if (applStatus_Details.get(0).getApplFlowStatusList().get(0).getTrCd() == 502 || applStatus_Details.get(0).getApplFlowStatusList().get(0).getTrCd() == 504 || applStatus_Details.get(0).getApplFlowStatusList().get(0).getTrCd() == 574) {
                    ApplicationDetailsActivity.this.d2();
                }
            } catch (Exception unused) {
                ApplicationDetailsActivity.this.x2().v.setVisibility(8);
                ApplicationDetailsActivity.this.x2().t.setVisibility(8);
                ApplicationDetailsActivity applicationDetailsActivity5 = ApplicationDetailsActivity.this;
                applicationDetailsActivity5.T2(applicationDetailsActivity5, "Record not found");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetAppStatusMain) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        public final void a(FormsPojo formsPojo) {
            ApplicationDetailsActivity.this.x2().b.setVisibility(8);
            try {
                if (StringsKt__StringsJVMKt.equals(formsPojo.getStatus_code(), "11", true)) {
                    ApplicationDetailsActivity applicationDetailsActivity = ApplicationDetailsActivity.this;
                    applicationDetailsActivity.Z2(applicationDetailsActivity.u2().b("label_form_download", ApplicationDetailsActivity.this.getString(R.string.form1_download)), formsPojo.getForm_report());
                } else {
                    Toast.makeText(ApplicationDetailsActivity.this, formsPojo.getStatus_desc(), 1).show();
                }
            } catch (Exception unused) {
                ApplicationDetailsActivity.this.S2("Record not found");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((FormsPojo) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        public final void a(FormsPojo formsPojo) {
            ApplicationDetailsActivity.this.x2().b.setVisibility(8);
            try {
                if (StringsKt__StringsJVMKt.equals(formsPojo.getStatus_code(), "11", true)) {
                    ApplicationDetailsActivity applicationDetailsActivity = ApplicationDetailsActivity.this;
                    applicationDetailsActivity.X2(applicationDetailsActivity.u2().b("label_form2_download", ApplicationDetailsActivity.this.getString(R.string.form2_download)), formsPojo.getForm_report());
                } else {
                    Toast.makeText(ApplicationDetailsActivity.this, formsPojo.getStatus_desc(), 1).show();
                }
            } catch (Exception unused) {
                ApplicationDetailsActivity.this.S2("Record not found");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((FormsPojo) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class h extends Lambda implements Function1 {
        public h() {
            super(1);
        }

        public final void a(FormsPojo formsPojo) {
            ApplicationDetailsActivity.this.x2().b.setVisibility(8);
            try {
                if (StringsKt__StringsJVMKt.equals(formsPojo.getStatus_code(), "11", true)) {
                    ApplicationDetailsActivity applicationDetailsActivity = ApplicationDetailsActivity.this;
                    applicationDetailsActivity.V2(applicationDetailsActivity.u2().b("label_form1_download", ApplicationDetailsActivity.this.getString(R.string.form1a_download)), formsPojo.getForm_report());
                } else {
                    Toast.makeText(ApplicationDetailsActivity.this, formsPojo.getStatus_desc(), 1).show();
                }
            } catch (Exception unused) {
                ApplicationDetailsActivity.this.S2("Record not found");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((FormsPojo) obj);
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
            ApplicationDetailsActivity.this.x2().b.setVisibility(8);
            ApplicationDetailsActivity.this.S2("Record not found");
        }
    }

    public static final class j extends Lambda implements Function1 {
        public static final j c = new j();

        public j() {
            super(1);
        }

        public final void invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
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

    private final void D3() {
        try {
            Intent intent = new Intent(this, (Class<?>) DlDocActivity.class);
            String str = this.app_no;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.dob);
            intent.putExtra("dl_st_dl_details_obj", t2());
            String str3 = this.dlNo;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dlNo");
                str3 = null;
            }
            intent.putExtra("DL", str3);
            intent.putExtra("dob", this.dob);
            intent.putExtra("DLDetails", t2());
            intent.putExtra("Mobile_no", t2().getBioObj().getBioMobileNo());
            String str4 = this.lastEndRTO;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastEndRTO");
                str4 = null;
            }
            intent.putExtra("lastEndorsedRTO", str4);
            String str5 = this.lastEndState;
            if (str5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastEndState");
                str5 = null;
            }
            intent.putExtra("lastEndorsedState", str5);
            String str6 = this.lastEndorseRtoCode;
            if (str6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastEndorseRtoCode");
                str6 = null;
            }
            intent.putExtra("lastEndorsedRTOCode", str6);
            String str7 = this.lastEndorseStateCode;
            if (str7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastEndorseStateCode");
            } else {
                str2 = str7;
            }
            intent.putExtra("lastEndorseStateCode", str2);
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void E3() {
        try {
            Intent intent = new Intent(this, (Class<?>) DLRenewalFeePaymentActivity.class);
            String str = this.app_no;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.dob);
            intent.putExtra("dl_st_dl_details_obj", t2());
            String str3 = this.dlNo;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dlNo");
                str3 = null;
            }
            intent.putExtra("DL", str3);
            intent.putExtra("dob", this.dob);
            intent.putExtra("DLDetails", t2());
            intent.putExtra("Mobile_no", t2().getBioObj().getBioMobileNo());
            String str4 = this.lastEndRTO;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastEndRTO");
                str4 = null;
            }
            intent.putExtra("lastEndorsedRTO", str4);
            String str5 = this.lastEndState;
            if (str5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastEndState");
                str5 = null;
            }
            intent.putExtra("lastEndorsedState", str5);
            String str6 = this.lastEndorseRtoCode;
            if (str6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastEndorseRtoCode");
                str6 = null;
            }
            intent.putExtra("lastEndorsedRTOCode", str6);
            String str7 = this.lastEndorseStateCode;
            if (str7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastEndorseStateCode");
            } else {
                str2 = str7;
            }
            intent.putExtra("lastEndorseStateCode", str2);
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    public static final void J2(ApplicationDetailsActivity this$0, SlotPdfDownloadResponse slotPdfDownloadResponse) throws IOException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.q3(false);
        if (!Intrinsics.areEqual(slotPdfDownloadResponse.getStatus_code(), "00")) {
            this$0.S2(slotPdfDownloadResponse.getStatus_desc());
            return;
        }
        this$0.dir_path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/";
        String str = this$0.dir_path;
        String str2 = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dir_path");
            str = null;
        }
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(tt6.a());
        String str3 = this$0.app_no;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("app_no");
            str3 = null;
        }
        sb.append(str3);
        sb.append(".pdf");
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        String str4 = this$0.dir_path;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dir_path");
        } else {
            str2 = str4;
        }
        sb2.append(str2);
        sb2.append(string);
        File file2 = new File(sb2.toString());
        if (!file2.exists()) {
            byte[] bArrDecode = Base64.decode(slotPdfDownloadResponse.getReportdets(), 0);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
            Log.v("apppl_Decode", bArrDecode.toString());
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            fileOutputStream.write(bArrDecode);
            fileOutputStream.flush();
            fileOutputStream.close();
        }
        this$0.Q2(string);
    }

    private final void K2() {
        t3(new wl5(this));
        x2().u.f.setText(u2().b("label_application_status", "Application Status"));
        Intent intent = getIntent();
        if (intent != null) {
            try {
                String stringExtra = intent.getStringExtra("app_no");
                Intrinsics.checkNotNull(stringExtra, "null cannot be cast to non-null type kotlin.String");
                this.app_no = stringExtra;
                if (intent.getStringExtra("statusAdapter") != null) {
                    String stringExtra2 = intent.getStringExtra("statusAdapter");
                    Intrinsics.checkNotNull(stringExtra2, "null cannot be cast to non-null type kotlin.String");
                    this.statusAdapter = stringExtra2;
                }
                if (this.statusAdapter.equals(VContant.MAINSCREEN)) {
                    String stringExtra3 = intent.getStringExtra("dob");
                    Intrinsics.checkNotNull(stringExtra3, "null cannot be cast to non-null type kotlin.String");
                    this.dob = stringExtra3;
                    String str = new SimpleDateFormat("dd-MM-yyyy").format(new SimpleDateFormat("yyyy-MM-dd").parse(this.dob));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    this.dob = str;
                } else {
                    Serializable serializableExtra = intent.getSerializableExtra("respBody");
                    Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Sarathithreeservices.model.ResponseBody");
                    r3((ResponseBody) serializableExtra);
                    String stringExtra4 = intent.getStringExtra("dob");
                    Intrinsics.checkNotNull(stringExtra4, "null cannot be cast to non-null type kotlin.String");
                    this.dob = stringExtra4;
                }
            } catch (Exception e2) {
                Log.d("errors", e2.getLocalizedMessage());
            }
        }
        try {
            this.appStatusVM = (cx) new z(this, new dx(new bj2(q2()))).a(cx.class);
            u3(new wl5(this));
            this.title_name = H2().k();
            AppCompatTextView appCompatTextView = x2().N;
            String str2 = this.title_name;
            String str3 = null;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("title_name");
                str2 = null;
            }
            appCompatTextView.setText(str2);
            String str4 = this.title_name;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("title_name");
                str4 = null;
            }
            if (Intrinsics.areEqual(str4, "Dispose Application")) {
                x2().j.setVisibility(0);
                x2().q.setVisibility(0);
                x2().i.setVisibility(0);
            } else {
                x2().j.setVisibility(8);
                x2().q.setVisibility(8);
                x2().i.setVisibility(8);
            }
            String str5 = this.app_no;
            if (str5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("app_no");
            } else {
                str3 = str5;
            }
            if (str3.length() > 0 || this.dob.length() > 0) {
                String str6 = new SimpleDateFormat("dd/MM/yyyy").format(new SimpleDateFormat("dd-MM-yyyy").parse(this.dob));
                Intrinsics.checkNotNullExpressionValue(str6, "format(...)");
                this.format_date = str6;
                r2();
            }
        } catch (Exception e3) {
            Log.d("errors1", e3.getLocalizedMessage());
        }
        I2();
    }

    private final void L2() {
        x2().i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplicationDetailsActivity.M2(this.a, view);
            }
        });
        x2().t.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.aw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplicationDetailsActivity.N2(this.a, view);
            }
        });
        x2().q.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplicationDetailsActivity.O2(this.a, view);
            }
        });
    }

    public static final void M2(ApplicationDetailsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void N2(ApplicationDetailsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.h2(this$0);
    }

    private final void N3() {
        try {
            Intent intent = new Intent(this, (Class<?>) DlPhotoAndSignatureActivity.class);
            String str = this.app_no;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.dob);
            intent.putExtra("dl_st_dl_details_obj", t2());
            String str3 = this.dlNo;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dlNo");
                str3 = null;
            }
            intent.putExtra("DL", str3);
            intent.putExtra("dob", this.dob);
            intent.putExtra("DLDetails", t2());
            intent.putExtra("Mobile_no", t2().getBioObj().getBioMobileNo());
            String str4 = this.lastEndRTO;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastEndRTO");
                str4 = null;
            }
            intent.putExtra("lastEndorsedRTO", str4);
            String str5 = this.lastEndState;
            if (str5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastEndState");
                str5 = null;
            }
            intent.putExtra("lastEndorsedState", str5);
            String str6 = this.lastEndorseRtoCode;
            if (str6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastEndorseRtoCode");
                str6 = null;
            }
            intent.putExtra("lastEndorsedRTOCode", str6);
            String str7 = this.lastEndorseStateCode;
            if (str7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastEndorseStateCode");
            } else {
                str2 = str7;
            }
            intent.putExtra("lastEndorseStateCode", str2);
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    public static final void O2(ApplicationDetailsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.b3(this$0);
    }

    private final void O3() {
        try {
            Intent intent = new Intent(this, (Class<?>) DlRenewalSlotsActivity.class);
            String str = this.app_no;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.dob);
            intent.putExtra("dl_st_dl_details_obj", t2());
            String str3 = this.dlNo;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dlNo");
                str3 = null;
            }
            intent.putExtra("DL", str3);
            intent.putExtra("dob", this.dob);
            intent.putExtra("DLDetails", t2());
            intent.putExtra("Mobile_no", t2().getBioObj().getBioMobileNo());
            String str4 = this.lastEndRTO;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastEndRTO");
                str4 = null;
            }
            intent.putExtra("lastEndorsedRTO", str4);
            String str5 = this.lastEndState;
            if (str5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastEndState");
                str5 = null;
            }
            intent.putExtra("lastEndorsedState", str5);
            String str6 = this.lastEndorseRtoCode;
            if (str6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastEndorseRtoCode");
                str6 = null;
            }
            intent.putExtra("lastEndorsedRTOCode", str6);
            String str7 = this.lastEndorseStateCode;
            if (str7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastEndorseStateCode");
            } else {
                str2 = str7;
            }
            intent.putExtra("lastEndorseStateCode", str2);
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    public static final void P2(ApplicationDetailsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void R2(ApplicationDetailsActivity this$0, String fileName, Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(fileName, "$fileName");
        Intrinsics.checkNotNullParameter(d2, "$d");
        this$0.p2(fileName);
        d2.dismiss();
    }

    public static final void U2(Dialog d2, ApplicationDetailsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        this$0.finish();
    }

    public static final void W2(Dialog d2, ApplicationDetailsActivity this$0, String pdfUrl, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(pdfUrl, "$pdfUrl");
        d2.dismiss();
        try {
            String str = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            File file2 = new File(str + (StringsKt__StringsKt.trim((CharSequence) this$0.x2().g.getText().toString()).toString() + '_' + jCurrentTimeMillis + ".pdf"));
            if (!file2.exists()) {
                byte[] bArrDecode = Base64.decode(pdfUrl, 0);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(bArrDecode);
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            Uri uriF = FileProvider.f(this$0, "com.nic.mparivahan.provider", new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc" + StringsKt__StringsKt.trim((CharSequence) this$0.x2().g.getText().toString()).toString() + '_' + jCurrentTimeMillis + ".pdf"));
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(uriF);
            Log.e("create pdf uri path==>", sb.toString());
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setDataAndType(uriF, "application/pdf");
                intent.setFlags(67108864);
                intent.addFlags(1);
                this$0.startActivity(intent);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            this$0.S2("Record not found");
        }
    }

    public static final void Y2(Dialog d2, ApplicationDetailsActivity this$0, String pdfUrl, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(pdfUrl, "$pdfUrl");
        d2.dismiss();
        try {
            String str = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            File file2 = new File(str + (StringsKt__StringsKt.trim((CharSequence) this$0.x2().g.getText().toString()).toString() + '_' + jCurrentTimeMillis + ".pdf"));
            if (!file2.exists()) {
                byte[] bArrDecode = Base64.decode(pdfUrl, 0);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(bArrDecode);
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            Uri uriF = FileProvider.f(this$0, "com.nic.mparivahan.provider", new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/" + StringsKt__StringsKt.trim((CharSequence) this$0.x2().g.getText().toString()).toString() + '_' + jCurrentTimeMillis + ".pdf"));
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(uriF);
            Log.e("create pdf uri path==>", sb.toString());
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setDataAndType(uriF, "application/pdf");
                intent.setFlags(67108864);
                intent.addFlags(1);
                this$0.startActivity(intent);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            this$0.S2("Record not found");
        }
    }

    public static final void a3(Dialog d2, ApplicationDetailsActivity this$0, String pdfUrl, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(pdfUrl, "$pdfUrl");
        d2.dismiss();
        try {
            String str = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            File file2 = new File(str + (StringsKt__StringsKt.trim((CharSequence) this$0.x2().g.getText().toString()).toString() + '_' + jCurrentTimeMillis + ".pdf"));
            if (!file2.exists()) {
                byte[] bArrDecode = Base64.decode(pdfUrl, 0);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(bArrDecode);
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            Uri uriF = FileProvider.f(this$0, "com.nic.mparivahan.provider", new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/" + StringsKt__StringsKt.trim((CharSequence) this$0.x2().g.getText().toString()).toString() + '_' + jCurrentTimeMillis + ".pdf"));
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setDataAndType(uriF, "application/pdf");
                intent.setFlags(67108864);
                intent.addFlags(1);
                this$0.startActivity(intent);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            this$0.S2("Record not found");
        }
    }

    public static final void c3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void i2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void j2(ApplicationDetailsActivity this$0, Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intent intent = new Intent();
        intent.setClass(this$0, DownloadApplicationActivity.class);
        String str = this$0.app_no;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("app_no");
            str = null;
        }
        intent.putExtra("app_no", str);
        intent.putExtra("dob", this$0.dob);
        this$0.startActivity(intent);
        d2.dismiss();
    }

    public static final void k2(ApplicationDetailsActivity this$0, Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d2, "$d");
        if (st6.e(this$0)) {
            if (q44.a.a(this$0)) {
                this$0.q3(true);
                cx cxVar = this$0.appStatusVM;
                String str = null;
                if (cxVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("appStatusVM");
                    cxVar = null;
                }
                String str2 = this$0.app_no;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("app_no");
                    str2 = null;
                }
                String str3 = this$0.format_date;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("format_date");
                } else {
                    str = str3;
                }
                cxVar.m(this$0, str2, str);
            } else {
                Toast.makeText(this$0, this$0.u2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
            }
            d2.dismiss();
        }
    }

    public static final void l2(ApplicationDetailsActivity this$0, Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d2, "$d");
        if (st6.e(this$0)) {
            d2.dismiss();
            if (!q44.a.a(this$0)) {
                Toast.makeText(this$0, this$0.u2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 0).show();
                return;
            }
            try {
                String strF2 = this$0.f2(this$0.x2().e.getText().toString());
                String string = this$0.x2().g.getText().toString();
                Charset charsetForName = Charset.forName("UTF-8");
                Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
                byte[] bytes = string.getBytes(charsetForName);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                String strEncodeToString = Base64.encodeToString(bytes, 0);
                Charset charsetForName2 = Charset.forName("UTF-8");
                Intrinsics.checkNotNullExpressionValue(charsetForName2, "forName(charsetName)");
                byte[] bytes2 = strF2.getBytes(charsetForName2);
                Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                String strEncodeToString2 = Base64.encodeToString(bytes2, 0);
                this$0.x2().b.setVisibility(0);
                mf2 mf2VarZ2 = this$0.z2();
                Intrinsics.checkNotNull(strEncodeToString);
                Intrinsics.checkNotNull(strEncodeToString2);
                mf2VarZ2.g(strEncodeToString, strEncodeToString2);
            } catch (Exception unused) {
            }
        }
    }

    public static final void m2(ApplicationDetailsActivity this$0, Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d2, "$d");
        if (st6.e(this$0)) {
            d2.dismiss();
            if (!q44.a.a(this$0)) {
                Toast.makeText(this$0, this$0.u2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 0).show();
                return;
            }
            try {
                String strF2 = this$0.f2(this$0.x2().e.getText().toString());
                String string = this$0.x2().g.getText().toString();
                Charset charsetForName = Charset.forName("UTF-8");
                Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
                byte[] bytes = string.getBytes(charsetForName);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                String strEncodeToString = Base64.encodeToString(bytes, 0);
                Charset charsetForName2 = Charset.forName("UTF-8");
                Intrinsics.checkNotNullExpressionValue(charsetForName2, "forName(charsetName)");
                byte[] bytes2 = strF2.getBytes(charsetForName2);
                Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                String strEncodeToString2 = Base64.encodeToString(bytes2, 0);
                this$0.x2().b.setVisibility(0);
                mf2 mf2VarZ2 = this$0.z2();
                Intrinsics.checkNotNull(strEncodeToString);
                Intrinsics.checkNotNull(strEncodeToString2);
                mf2VarZ2.i(strEncodeToString, strEncodeToString2);
            } catch (Exception unused) {
            }
        }
    }

    public static final void n2(ApplicationDetailsActivity this$0, Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d2, "$d");
        if (st6.e(this$0)) {
            d2.dismiss();
            if (!q44.a.a(this$0)) {
                Toast.makeText(this$0, this$0.u2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 0).show();
                return;
            }
            try {
                String strF2 = this$0.f2(this$0.x2().e.getText().toString());
                String string = this$0.x2().g.getText().toString();
                Charset charsetForName = Charset.forName("UTF-8");
                Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
                byte[] bytes = string.getBytes(charsetForName);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                String strEncodeToString = Base64.encodeToString(bytes, 0);
                Charset charsetForName2 = Charset.forName("UTF-8");
                Intrinsics.checkNotNullExpressionValue(charsetForName2, "forName(charsetName)");
                byte[] bytes2 = strF2.getBytes(charsetForName2);
                Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                String strEncodeToString2 = Base64.encodeToString(bytes2, 0);
                this$0.x2().b.setVisibility(0);
                mf2 mf2VarZ2 = this$0.z2();
                Intrinsics.checkNotNull(strEncodeToString);
                Intrinsics.checkNotNull(strEncodeToString2);
                mf2VarZ2.h(strEncodeToString, strEncodeToString2);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q3(boolean visible) {
        if (visible) {
            try {
                this.mProgressApplication = new sw4(this, R.string.please_wait_2, true);
            } catch (WindowManager.BadTokenException e2) {
                e2.printStackTrace();
                return;
            }
        }
        sw4 sw4Var = this.mProgressApplication;
        if (sw4Var != null) {
            if (visible) {
                sw4Var.b();
            } else {
                sw4Var.a();
            }
        }
    }

    public final ArrayList A2() {
        ArrayList arrayList = this.mListVal;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mListVal");
        return null;
    }

    public final void A3() {
        try {
            Intent intent = new Intent(this, (Class<?>) DlFeePayment.class);
            String str = this.app_no;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.dob);
            String str3 = this.dlNo;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dlNo");
            } else {
                str2 = str3;
            }
            intent.putExtra("DL", str2);
            intent.putExtra("dob", this.dob);
            intent.putExtra("Mobile_no", "NA");
            intent.putExtra("lastEndorsedRTO", StringsKt__StringsKt.trim((CharSequence) x2().F.getText().toString()).toString());
            intent.putExtra("lastEndorsedRTOCode", StringsKt__StringsKt.trim((CharSequence) x2().K.getText().toString()).toString());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    public final LlInterface B2() {
        LlInterface llInterface = this.mLlInterface;
        if (llInterface != null) {
            return llInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mLlInterface");
        return null;
    }

    public final void B3() {
        try {
            Intent intent = new Intent(this, (Class<?>) DlPhotoSign.class);
            String str = this.app_no;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.dob);
            String str3 = this.dlNo;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dlNo");
            } else {
                str2 = str3;
            }
            intent.putExtra("DL", str2);
            intent.putExtra("dob", this.dob);
            intent.putExtra("Mobile_no", "NA");
            intent.putExtra("lastEndorsedRTO", StringsKt__StringsKt.trim((CharSequence) x2().F.getText().toString()).toString());
            intent.putExtra("lastEndorsedRTOCode", StringsKt__StringsKt.trim((CharSequence) x2().K.getText().toString()).toString());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    public final dm3 C2() {
        dm3 dm3Var = this.mLlViewModel;
        if (dm3Var != null) {
            return dm3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mLlViewModel");
        return null;
    }

    public final void C3() {
        try {
            Intent intent = new Intent(this, (Class<?>) DlSlots.class);
            String str = this.app_no;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.dob);
            String str3 = this.dlNo;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dlNo");
            } else {
                str2 = str3;
            }
            intent.putExtra("DL", str2);
            intent.putExtra("dob", this.dob);
            intent.putExtra("Mobile_no", "NA");
            intent.putExtra("lastEndorsedRTO", StringsKt__StringsKt.trim((CharSequence) x2().F.getText().toString()).toString());
            intent.putExtra("lastEndorsedRTOCode", StringsKt__StringsKt.trim((CharSequence) x2().K.getText().toString()).toString());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    public final ArrayList D2() {
        ArrayList arrayList = this.multiList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiList");
        return null;
    }

    public final ResponseBody E2() {
        ResponseBody responseBody = this.respBody;
        if (responseBody != null) {
            return responseBody;
        }
        Intrinsics.throwUninitializedPropertyAccessException("respBody");
        return null;
    }

    public final DlServiceInt F2() {
        DlServiceInt dlServiceInt = this.retrofitService;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final void F3() {
        try {
            Intent intent = new Intent(this, (Class<?>) LlDocumentUpload.class);
            String str = this.app_no;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.dob);
            String str3 = this.dlNo;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dlNo");
            } else {
                str2 = str3;
            }
            intent.putExtra("DL", str2);
            intent.putExtra("dob", this.dob);
            intent.putExtra("lastEndorsedRTO", StringsKt__StringsKt.trim((CharSequence) x2().F.getText().toString()).toString());
            intent.putExtra("lastEndorsedRTOCode", StringsKt__StringsKt.trim((CharSequence) x2().K.getText().toString()).toString());
            intent.putExtra("LLDetails", w2());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    public final wl5 G2() {
        wl5 wl5Var = this.sarathiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarathiSession");
        return null;
    }

    public final void G3() {
        try {
            Intent intent = new Intent(this, (Class<?>) LlPayment.class);
            String str = this.app_no;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.dob);
            String str3 = this.dlNo;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dlNo");
            } else {
                str2 = str3;
            }
            intent.putExtra("DL", str2);
            intent.putExtra("dob", this.dob);
            intent.putExtra("lastEndorsedRTO", StringsKt__StringsKt.trim((CharSequence) x2().F.getText().toString()).toString());
            intent.putExtra("lastEndorsedRTOCode", StringsKt__StringsKt.trim((CharSequence) x2().K.getText().toString()).toString());
            intent.putExtra("LLDetails", w2());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    public final wl5 H2() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final void H3() {
        try {
            Intent intent = new Intent(this, (Class<?>) LlPhotoSignature.class);
            String str = this.app_no;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.dob);
            String str3 = this.dlNo;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dlNo");
            } else {
                str2 = str3;
            }
            intent.putExtra("DL", str2);
            intent.putExtra("dob", this.dob);
            intent.putExtra("lastEndorsedRTO", StringsKt__StringsKt.trim((CharSequence) x2().F.getText().toString()).toString());
            intent.putExtra("lastEndorsedRTOCode", StringsKt__StringsKt.trim((CharSequence) x2().K.getText().toString()).toString());
            intent.putExtra("LLDetails", w2());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    public final void I2() {
        cx cxVar = this.appStatusVM;
        if (cxVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appStatusVM");
            cxVar = null;
        }
        cxVar.l().g(this, new mf4() { // from class: com.zepto.kw
            @Override // com.zepto.mf4
            public final void a(Object obj) throws IOException {
                ApplicationDetailsActivity.J2(this.a, (SlotPdfDownloadResponse) obj);
            }
        });
    }

    public final void I3() {
        try {
            Intent intent = new Intent(this, (Class<?>) LlSlots.class);
            String str = this.app_no;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.dob);
            String str3 = this.dlNo;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dlNo");
            } else {
                str2 = str3;
            }
            intent.putExtra("DL", str2);
            intent.putExtra("dob", this.dob);
            intent.putExtra("lastEndorsedRTO", StringsKt__StringsKt.trim((CharSequence) x2().F.getText().toString()).toString());
            intent.putExtra("lastEndorsedRTOCode", StringsKt__StringsKt.trim((CharSequence) x2().K.getText().toString()).toString());
            intent.putExtra("LLDetails", w2());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    @Override // com.zepto.lh4
    public void J(Integer mCode, int position, int trCode) {
        if (mCode != null && mCode.intValue() == 135) {
            if (trCode != 501) {
                if (trCode != 502 && trCode != 504) {
                    if (trCode != 509) {
                        if (trCode == 511) {
                            B3();
                            return;
                        }
                        if (trCode != 559) {
                            if (trCode != 574) {
                                switch (trCode) {
                                    case 551:
                                    case 552:
                                    case 553:
                                    case 554:
                                        break;
                                    default:
                                        N3();
                                        break;
                                }
                            }
                        }
                        x3();
                        return;
                    }
                }
                H3();
                return;
            }
            L3();
            return;
        }
        if (mCode != null && mCode.intValue() == 123) {
            if (trCode != 501) {
                if (trCode != 502 && trCode != 504) {
                    if (trCode != 509) {
                        if (trCode == 511) {
                            z3();
                            return;
                        }
                        if (trCode != 559) {
                            if (trCode != 574) {
                                switch (trCode) {
                                    case 551:
                                    case 552:
                                    case 553:
                                    case 554:
                                        break;
                                    default:
                                        D3();
                                        break;
                                }
                            }
                        }
                        v3();
                        return;
                    }
                }
                F3();
                return;
            }
            J3();
            return;
        }
        if (mCode != null && mCode.intValue() == 134) {
            if (trCode != 501) {
                if (trCode != 502 && trCode != 504) {
                    if (trCode != 509) {
                        if (trCode == 511) {
                            A3();
                            return;
                        }
                        if (trCode != 559) {
                            if (trCode != 574) {
                                switch (trCode) {
                                    case 551:
                                    case 552:
                                    case 553:
                                    case 554:
                                        break;
                                    default:
                                        E3();
                                        break;
                                }
                            }
                        }
                        w3();
                        return;
                    }
                }
                G3();
                return;
            }
            K3();
            return;
        }
        if (mCode != null && mCode.intValue() == 371) {
            if (trCode != 501) {
                if (trCode != 502 && trCode != 504) {
                    if (trCode != 509) {
                        if (trCode == 511) {
                            C3();
                            return;
                        }
                        if (trCode != 559) {
                            if (trCode != 574) {
                                switch (trCode) {
                                    case 551:
                                    case 552:
                                    case 553:
                                    case 554:
                                        break;
                                    default:
                                        O3();
                                        break;
                                }
                            }
                        }
                        y3();
                        return;
                    }
                }
                I3();
                return;
            }
            M3();
            return;
        }
        if (mCode != null && mCode.intValue() == 133) {
            if (trCode != 501) {
                if (trCode != 502 && trCode != 504) {
                    if (trCode != 509) {
                        if (trCode == 511) {
                            C3();
                            return;
                        }
                        if (trCode != 559) {
                            if (trCode != 574) {
                                switch (trCode) {
                                    case 551:
                                    case 552:
                                    case 553:
                                    case 554:
                                        break;
                                    default:
                                        O3();
                                        break;
                                }
                            }
                        }
                        y3();
                        return;
                    }
                }
                I3();
                return;
            }
            M3();
            return;
        }
        if (mCode != null && mCode.intValue() == 132) {
            if (trCode != 501) {
                if (trCode != 502 && trCode != 504) {
                    if (trCode != 509) {
                        if (trCode == 511) {
                            C3();
                            return;
                        }
                        if (trCode != 559) {
                            if (trCode != 574) {
                                switch (trCode) {
                                    case 551:
                                    case 552:
                                    case 553:
                                    case 554:
                                        break;
                                    default:
                                        O3();
                                        break;
                                }
                            }
                        }
                        y3();
                        return;
                    }
                }
                I3();
                return;
            }
            M3();
        }
    }

    public final void J3() {
        try {
            Intent intent = new Intent(this, (Class<?>) LLDocUpload.class);
            String str = this.app_no;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.dob);
            intent.putExtra("dob", this.dob);
            intent.putExtra("Mobile_no", "NA");
            intent.putExtra("lastEndorsedRTO", StringsKt__StringsKt.trim((CharSequence) x2().F.getText().toString()).toString());
            intent.putExtra("lastEndorsedRTOCode", StringsKt__StringsKt.trim((CharSequence) x2().K.getText().toString()).toString());
            intent.putExtra("aadharPhoto", "");
            startActivity(intent);
            finish();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void K3() {
        try {
            Intent intent = new Intent(this, (Class<?>) LLFeePayment.class);
            String str = this.app_no;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.dob);
            intent.putExtra("dob", this.dob);
            intent.putExtra("Mobile_no", "NA");
            intent.putExtra("lastEndorsedRTO", StringsKt__StringsKt.trim((CharSequence) x2().F.getText().toString()).toString());
            intent.putExtra("lastEndorsedRTOCode", StringsKt__StringsKt.trim((CharSequence) x2().K.getText().toString()).toString());
            intent.putExtra("aadharPhoto", "");
            startActivity(intent);
            finish();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void L3() {
        try {
            Intent intent = new Intent(this, (Class<?>) LLPhotoSign.class);
            String str = this.app_no;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.dob);
            intent.putExtra("dob", this.dob);
            intent.putExtra("Mobile_no", "NA");
            intent.putExtra("lastEndorsedRTO", StringsKt__StringsKt.trim((CharSequence) x2().F.getText().toString()).toString());
            intent.putExtra("lastEndorsedRTOCode", StringsKt__StringsKt.trim((CharSequence) x2().K.getText().toString()).toString());
            intent.putExtra("aadharPhoto", "");
            startActivity(intent);
            finish();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void M3() {
        try {
            Intent intent = new Intent(this, (Class<?>) LLSlots.class);
            String str = this.app_no;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.dob);
            intent.putExtra("dob", this.dob);
            intent.putExtra("Mobile_no", "NA");
            intent.putExtra("lastEndorsedRTO", StringsKt__StringsKt.trim((CharSequence) x2().F.getText().toString()).toString());
            intent.putExtra("lastEndorsedRTOCode", StringsKt__StringsKt.trim((CharSequence) x2().K.getText().toString()).toString());
            intent.putExtra("aadharPhoto", "");
            startActivity(intent);
            finish();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void Q2(final String fileName) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        textView.setText(u2().b("button_open_pd", getString(R.string.open_pdf)));
        ((TextView) viewFindViewById).setText(u2().b("popup_pdf_desc", getString(R.string.pdf_description)));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplicationDetailsActivity.R2(this.a, fileName, dialog, view);
            }
        });
        dialog.show();
    }

    public final void S2(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        o40.q1(this, st6.n(), message, 1, st6.o(), null, j.c, 16, null);
    }

    public final void T2(Context context, String message) {
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
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(u2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(u2().b("btn_ok", "OK"));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplicationDetailsActivity.U2(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final void V2(String message, final String pdfUrl) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(u2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(u2().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplicationDetailsActivity.W2(dialog, this, pdfUrl, view);
            }
        });
        dialog.show();
    }

    public final void X2(String message, final String pdfUrl) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(u2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(u2().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplicationDetailsActivity.Y2(dialog, this, pdfUrl, view);
            }
        });
        dialog.show();
    }

    public final void Z2(String message, final String pdfUrl) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(u2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(u2().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplicationDetailsActivity.a3(dialog, this, pdfUrl, view);
            }
        });
        dialog.show();
    }

    public final void b3(Context context) {
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirm_dialog);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.msg_title);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_cancel);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        dialog.show();
        ((TextView) viewFindViewById).setText(getString(R.string.dispose_pop_msg));
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplicationDetailsActivity.c3(dialog, view);
            }
        });
    }

    public final void d2() {
        q3(true);
        dm3 dm3VarC2 = C2();
        List<TransReqItem> transReq = E2().getTransReq();
        Intrinsics.checkNotNull(transReq);
        TransReqItem transReqItem = transReq.get(0);
        Intrinsics.checkNotNull(transReqItem);
        dm3VarC2.j(this, StringsKt__StringsKt.trim((CharSequence) String.valueOf(transReqItem.getTrRefLicno())).toString(), this.dob, "mobSARATHI", "657d1c758e2e95af0014e16f5109f933", "10.248.210.8", "sarathiservice");
        C2().k().g(this, new k(new a()));
        C2().i().g(this, new k(new b()));
    }

    public final void d3(GetApplStatusService getApplStatusService) {
        Intrinsics.checkNotNullParameter(getApplStatusService, "<set-?>");
        this.appInfoService = getApplStatusService;
    }

    public final void e2() {
        this.dlServicesViewModel = (nr1) new z(this, new rq1(new lr1(F2(), this))).a(nr1.class);
        mr1.a aVar = mr1.a;
        StringsKt__StringsKt.trim((CharSequence) String.valueOf(aVar.b(aVar.g(9999.0d, 99999.0d)))).toString();
        q3(true);
        nr1 nr1Var = this.dlServicesViewModel;
        nr1 nr1Var2 = null;
        if (nr1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dlServicesViewModel");
            nr1Var = null;
        }
        String str = this.dlNo;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dlNo");
            str = null;
        }
        nr1Var.k(this, str, o2(this.dob));
        nr1 nr1Var3 = this.dlServicesViewModel;
        if (nr1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dlServicesViewModel");
            nr1Var3 = null;
        }
        nr1Var3.o().g(this, new k(new c()));
        nr1 nr1Var4 = this.dlServicesViewModel;
        if (nr1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dlServicesViewModel");
            nr1Var4 = null;
        }
        String str2 = this.dlNo;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dlNo");
            str2 = null;
        }
        nr1Var4.x(this, str2, this.dob);
        nr1 nr1Var5 = this.dlServicesViewModel;
        if (nr1Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dlServicesViewModel");
        } else {
            nr1Var2 = nr1Var5;
        }
        nr1Var2.l().g(this, new k(new d()));
    }

    public final void e3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appliedService = str;
    }

    public final String f2(String date) {
        Intrinsics.checkNotNullParameter(date, "date");
        try {
            String str = new SimpleDateFormat("dd-MM-yyyy").format(new SimpleDateFormat("dd/MM/yyyy").parse(date));
            Intrinsics.checkNotNull(str);
            return str;
        } catch (Exception e2) {
            e2.printStackTrace();
            return date;
        }
    }

    public final void f3(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dlDetails = dldetobjX;
    }

    public final void g2(List dlFlowDetails) {
        Iterator it = dlFlowDetails.iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (StringsKt__StringsJVMKt.equals(((ApplFlowStatus) it.next()).getStatus(), "pending", true)) {
                z = false;
            }
        }
        if (z) {
            x2().t.setVisibility(0);
            x2().M.setVisibility(8);
        } else {
            x2().B.setVisibility(8);
            x2().C.setVisibility(8);
        }
    }

    public final void g3(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h2(android.content.Context r18) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Sarathithreeservices.view.ApplicationDetailsActivity.h2(android.content.Context):void");
    }

    public final void h3(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.listHeaderSteps = arrayList;
    }

    public final void i3(FetchLlDetails fetchLlDetails) {
        Intrinsics.checkNotNullParameter(fetchLlDetails, "<set-?>");
        this.llDetails = fetchLlDetails;
    }

    public final void j3(o6 o6Var) {
        Intrinsics.checkNotNullParameter(o6Var, "<set-?>");
        this.mBinding = o6Var;
    }

    public final void k3(FormsInterface formsInterface) {
        Intrinsics.checkNotNullParameter(formsInterface, "<set-?>");
        this.mFormsInterface = formsInterface;
    }

    public final void l3(mf2 mf2Var) {
        Intrinsics.checkNotNullParameter(mf2Var, "<set-?>");
        this.mFormsVM = mf2Var;
    }

    public final void m3(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.mListVal = arrayList;
    }

    public final void n3(LlInterface llInterface) {
        Intrinsics.checkNotNullParameter(llInterface, "<set-?>");
        this.mLlInterface = llInterface;
    }

    public final String o2(String fdate) {
        Intrinsics.checkNotNullParameter(fdate, "fdate");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = simpleDateFormat.parse(fdate);
            Intrinsics.checkNotNullExpressionValue(date, "parse(...)");
            String str = simpleDateFormat2.format(date);
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        } catch (ParseException unused) {
            return "";
        }
    }

    public final void o3(dm3 dm3Var) {
        Intrinsics.checkNotNullParameter(dm3Var, "<set-?>");
        this.mLlViewModel = dm3Var;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        o6 o6VarC = o6.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(o6VarC, "inflate(...)");
        j3(o6VarC);
        setContentView(x2().b());
        ta3.a.H(this, x2());
        g3(new wa3(this));
        s3(DlServiceInt.INSTANCE.a(this));
        d3(GetApplStatusService.INSTANCE.a(this));
        k3(FormsInterface.INSTANCE.a(this));
        n3(LlInterface.INSTANCE.a(this));
        l3((mf2) new z(this, new lf2(new gf2(y2()))).a(mf2.class));
        o3((dm3) new z(this, new uj3(new hl3(B2()))).a(dm3.class));
        K2();
        L2();
        x2().u.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApplicationDetailsActivity.P2(this.a, view);
            }
        });
    }

    @Override // com.zepto.yf2, com.zepto.zt0, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == this.PERMISSION_CODE_READ_EXTERNAL_STORAGE) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                h2(this);
            }
        }
    }

    public final void p2(String fileName) {
        Uri uriF = FileProvider.f(this, "com.nic.mparivahan.debug.provider", new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/" + fileName));
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(uriF);
        Log.e("create pdf uri path==>", sb.toString());
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriF, "application/pdf");
            intent.setFlags(67108864);
            intent.addFlags(1);
            startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(this, u2().b("popup_pdf_error", ""), 1).show();
        }
    }

    public final void p3(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.multiList = arrayList;
    }

    public final GetApplStatusService q2() {
        GetApplStatusService getApplStatusService = this.appInfoService;
        if (getApplStatusService != null) {
            return getApplStatusService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appInfoService");
        return null;
    }

    public final void r2() {
        if (q44.a.a(this)) {
            q3(true);
            cx cxVar = this.appStatusVM;
            cx cxVar2 = null;
            if (cxVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appStatusVM");
                cxVar = null;
            }
            String str = this.app_no;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("app_no");
                str = null;
            }
            String str2 = this.format_date;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("format_date");
                str2 = null;
            }
            cxVar.h(this, str, str2);
            cx cxVar3 = this.appStatusVM;
            if (cxVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appStatusVM");
            } else {
                cxVar2 = cxVar3;
            }
            cxVar2.k().g(this, new k(new e()));
        } else {
            T2(this, "label_log_check_internet");
        }
        z2().k().g(this, new k(new f()));
        z2().m().g(this, new k(new g()));
        z2().l().g(this, new k(new h()));
        z2().j().g(this, new k(new i()));
    }

    public final void r3(ResponseBody responseBody) {
        Intrinsics.checkNotNullParameter(responseBody, "<set-?>");
        this.respBody = responseBody;
    }

    /* JADX INFO: renamed from: s2, reason: from getter */
    public final String getAppliedService() {
        return this.appliedService;
    }

    public final void s3(DlServiceInt dlServiceInt) {
        Intrinsics.checkNotNullParameter(dlServiceInt, "<set-?>");
        this.retrofitService = dlServiceInt;
    }

    public final DldetobjX t2() {
        DldetobjX dldetobjX = this.dlDetails;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlDetails");
        return null;
    }

    public final void t3(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarathiSession = wl5Var;
    }

    public final wa3 u2() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final void u3(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final ArrayList v2() {
        ArrayList arrayList = this.listHeaderSteps;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("listHeaderSteps");
        return null;
    }

    public final void v3() {
        try {
            Intent intent = new Intent(this, (Class<?>) ClDocumentsUpload.class);
            String str = this.app_no;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.dob);
            String str3 = this.dlNo;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dlNo");
            } else {
                str2 = str3;
            }
            intent.putExtra("DL", str2);
            intent.putExtra("dob", this.dob);
            intent.putExtra("lastEndorsedRTO", StringsKt__StringsKt.trim((CharSequence) x2().F.getText().toString()).toString());
            intent.putExtra("lastEndorsedRTOCode", StringsKt__StringsKt.trim((CharSequence) x2().K.getText().toString()).toString());
            intent.putExtra("clName", E2().getApdFirstName() + ' ' + E2().getApdLastName());
            intent.putExtra("clPhoto", "");
            String apdSwdFullName = E2().getApdSwdFullName();
            if (apdSwdFullName == null || apdSwdFullName.length() == 0) {
                intent.putExtra("fatherName", "NA");
            } else {
                intent.putExtra("fatherName", E2().getApdSwdFullName());
            }
            intent.putExtra("address", E2().getApdPermAdd1() + ' ' + E2().getApdPermAdd2());
            intent.putExtra("issuing_authority", x2().F.getText().toString());
            List<TransReqItem> transReq = E2().getTransReq();
            Intrinsics.checkNotNull(transReq);
            TransReqItem transReqItem = transReq.get(0);
            Intrinsics.checkNotNull(transReqItem);
            String trRefLicvalidDt = transReqItem.getTrRefLicvalidDt();
            if (trRefLicvalidDt == null || trRefLicvalidDt.length() == 0) {
                intent.putExtra("validity", "NA");
            } else {
                List<TransReqItem> transReq2 = E2().getTransReq();
                Intrinsics.checkNotNull(transReq2);
                TransReqItem transReqItem2 = transReq2.get(0);
                Intrinsics.checkNotNull(transReqItem2);
                String trRefLicvalidDt2 = transReqItem2.getTrRefLicvalidDt();
                Intrinsics.checkNotNull(trRefLicvalidDt2);
                String strSubstring = trRefLicvalidDt2.substring(0, 10);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                intent.putExtra("validity", strSubstring);
            }
            intent.putExtra("cl_Status", "Active");
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    public final FetchLlDetails w2() {
        FetchLlDetails fetchLlDetails = this.llDetails;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("llDetails");
        return null;
    }

    public final void w3() {
        try {
            Intent intent = new Intent(this, (Class<?>) ClFeePayment.class);
            String str = this.app_no;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.dob);
            String str3 = this.dlNo;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dlNo");
            } else {
                str2 = str3;
            }
            intent.putExtra("DL", str2);
            intent.putExtra("dob", this.dob);
            intent.putExtra("lastEndorsedRTO", StringsKt__StringsKt.trim((CharSequence) x2().F.getText().toString()).toString());
            intent.putExtra("lastEndorsedRTOCode", StringsKt__StringsKt.trim((CharSequence) x2().K.getText().toString()).toString());
            intent.putExtra("clName", E2().getApdFirstName() + ' ' + E2().getApdLastName());
            intent.putExtra("clPhoto", "");
            String apdSwdFullName = E2().getApdSwdFullName();
            if (apdSwdFullName == null || apdSwdFullName.length() == 0) {
                intent.putExtra("fatherName", "NA");
            } else {
                intent.putExtra("fatherName", E2().getApdSwdFullName());
            }
            intent.putExtra("address", E2().getApdPermAdd1() + ' ' + E2().getApdPermAdd2());
            intent.putExtra("issuing_authority", x2().F.getText().toString());
            List<TransReqItem> transReq = E2().getTransReq();
            Intrinsics.checkNotNull(transReq);
            TransReqItem transReqItem = transReq.get(0);
            Intrinsics.checkNotNull(transReqItem);
            String trRefLicvalidDt = transReqItem.getTrRefLicvalidDt();
            if (trRefLicvalidDt == null || trRefLicvalidDt.length() == 0) {
                intent.putExtra("validity", "NA");
            } else {
                List<TransReqItem> transReq2 = E2().getTransReq();
                Intrinsics.checkNotNull(transReq2);
                TransReqItem transReqItem2 = transReq2.get(0);
                Intrinsics.checkNotNull(transReqItem2);
                String trRefLicvalidDt2 = transReqItem2.getTrRefLicvalidDt();
                Intrinsics.checkNotNull(trRefLicvalidDt2);
                String strSubstring = trRefLicvalidDt2.substring(0, 10);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                intent.putExtra("validity", strSubstring);
            }
            intent.putExtra("cl_Status", "Active");
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    public final o6 x2() {
        o6 o6Var = this.mBinding;
        if (o6Var != null) {
            return o6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    public final void x3() {
        try {
            Intent intent = new Intent(this, (Class<?>) ClPhotoSignature.class);
            String str = this.app_no;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.dob);
            String str3 = this.dlNo;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dlNo");
            } else {
                str2 = str3;
            }
            intent.putExtra("DL", str2);
            intent.putExtra("dob", this.dob);
            intent.putExtra("lastEndorsedRTO", StringsKt__StringsKt.trim((CharSequence) x2().F.getText().toString()).toString());
            intent.putExtra("lastEndorsedRTOCode", StringsKt__StringsKt.trim((CharSequence) x2().K.getText().toString()).toString());
            intent.putExtra("clName", E2().getApdFirstName() + ' ' + E2().getApdLastName());
            intent.putExtra("clPhoto", "");
            String apdSwdFullName = E2().getApdSwdFullName();
            if (apdSwdFullName == null || apdSwdFullName.length() == 0) {
                intent.putExtra("fatherName", "NA");
            } else {
                intent.putExtra("fatherName", E2().getApdSwdFullName());
            }
            intent.putExtra("address", E2().getApdPermAdd1() + ' ' + E2().getApdPermAdd2());
            intent.putExtra("issuing_authority", x2().F.getText().toString());
            List<TransReqItem> transReq = E2().getTransReq();
            Intrinsics.checkNotNull(transReq);
            TransReqItem transReqItem = transReq.get(0);
            Intrinsics.checkNotNull(transReqItem);
            String trRefLicvalidDt = transReqItem.getTrRefLicvalidDt();
            if (trRefLicvalidDt == null || trRefLicvalidDt.length() == 0) {
                intent.putExtra("validity", "NA");
            } else {
                List<TransReqItem> transReq2 = E2().getTransReq();
                Intrinsics.checkNotNull(transReq2);
                TransReqItem transReqItem2 = transReq2.get(0);
                Intrinsics.checkNotNull(transReqItem2);
                String trRefLicvalidDt2 = transReqItem2.getTrRefLicvalidDt();
                Intrinsics.checkNotNull(trRefLicvalidDt2);
                String strSubstring = trRefLicvalidDt2.substring(0, 10);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                intent.putExtra("validity", strSubstring);
            }
            intent.putExtra("cl_Status", "Active");
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    public final FormsInterface y2() {
        FormsInterface formsInterface = this.mFormsInterface;
        if (formsInterface != null) {
            return formsInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mFormsInterface");
        return null;
    }

    public final void y3() {
        try {
            Intent intent = new Intent(this, (Class<?>) ClSots.class);
            String str = this.app_no;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.dob);
            String str3 = this.dlNo;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dlNo");
            } else {
                str2 = str3;
            }
            intent.putExtra("DL", str2);
            intent.putExtra("dob", this.dob);
            intent.putExtra("lastEndorsedRTO", StringsKt__StringsKt.trim((CharSequence) x2().F.getText().toString()).toString());
            intent.putExtra("lastEndorsedRTOCode", StringsKt__StringsKt.trim((CharSequence) x2().K.getText().toString()).toString());
            intent.putExtra("clName", E2().getApdFirstName() + ' ' + E2().getApdLastName());
            intent.putExtra("clPhoto", "");
            String apdSwdFullName = E2().getApdSwdFullName();
            if (apdSwdFullName == null || apdSwdFullName.length() == 0) {
                intent.putExtra("fatherName", "NA");
            } else {
                intent.putExtra("fatherName", E2().getApdSwdFullName());
            }
            intent.putExtra("address", E2().getApdPermAdd1() + ' ' + E2().getApdPermAdd2());
            intent.putExtra("issuing_authority", x2().F.getText().toString());
            List<TransReqItem> transReq = E2().getTransReq();
            Intrinsics.checkNotNull(transReq);
            TransReqItem transReqItem = transReq.get(0);
            Intrinsics.checkNotNull(transReqItem);
            String trRefLicvalidDt = transReqItem.getTrRefLicvalidDt();
            if (trRefLicvalidDt == null || trRefLicvalidDt.length() == 0) {
                intent.putExtra("validity", "NA");
            } else {
                List<TransReqItem> transReq2 = E2().getTransReq();
                Intrinsics.checkNotNull(transReq2);
                TransReqItem transReqItem2 = transReq2.get(0);
                Intrinsics.checkNotNull(transReqItem2);
                String trRefLicvalidDt2 = transReqItem2.getTrRefLicvalidDt();
                Intrinsics.checkNotNull(trRefLicvalidDt2);
                String strSubstring = trRefLicvalidDt2.substring(0, 10);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                intent.putExtra("validity", strSubstring);
            }
            intent.putExtra("cl_Status", "Active");
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    public final mf2 z2() {
        mf2 mf2Var = this.mFormsVM;
        if (mf2Var != null) {
            return mf2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mFormsVM");
        return null;
    }

    public final void z3() {
        try {
            Intent intent = new Intent(this, (Class<?>) DlDocUpload.class);
            String str = this.app_no;
            String str2 = null;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.dob);
            String str3 = this.dlNo;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dlNo");
            } else {
                str2 = str3;
            }
            intent.putExtra("DL", str2);
            intent.putExtra("dob", this.dob);
            intent.putExtra("Mobile_no", "NA");
            intent.putExtra("lastEndorsedRTO", StringsKt__StringsKt.trim((CharSequence) x2().F.getText().toString()).toString());
            intent.putExtra("lastEndorsedRTOCode", StringsKt__StringsKt.trim((CharSequence) x2().K.getText().toString()).toString());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }
}
