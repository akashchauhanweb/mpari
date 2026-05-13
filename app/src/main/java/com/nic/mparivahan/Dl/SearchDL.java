package com.nic.mparivahan.Dl;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.provider.Settings;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.z;
import com.google.gson.Gson;
import com.nic.mparivahan.APIController;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Account.SignService;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dl.DLServiceWithoutDobModel.BioImgObj;
import com.nic.mparivahan.Dl.DLServiceWithoutDobModel.DLWithoutdobModel;
import com.nic.mparivahan.Dl.DLServiceWithoutDobModel.Dlcov;
import com.nic.mparivahan.Dl.DLServiceWithoutDobModel.Dlobj;
import com.nic.mparivahan.Dl.DLWDLModel.BioObj;
import com.nic.mparivahan.Dl.DLWDLModel.DLServiceModelForRecentSear;
import com.nic.mparivahan.Dl.DlInterface.DlService;
import com.nic.mparivahan.Dl.Model.BioImgObjX;
import com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.Dl.SearchDL;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.CitizenDocInfoX;
import com.nic.mparivahan.RC.Model.CitzValidDoc;
import com.nic.mparivahan.RC.Model.ImpoundDlSuccessModel;
import com.nic.mparivahan.RC.RcInterface.RcImpoundService;
import com.nic.mparivahan.RC.ViewRcChallanActivity;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.zepto.a26;
import com.zepto.ag;
import com.zepto.c26;
import com.zepto.d65;
import com.zepto.gd1;
import com.zepto.hs1;
import com.zepto.hz0;
import com.zepto.is1;
import com.zepto.jp1;
import com.zepto.js1;
import com.zepto.k18;
import com.zepto.lc5;
import com.zepto.ls3;
import com.zepto.mf4;
import com.zepto.n35;
import com.zepto.o45;
import com.zepto.p26;
import com.zepto.p45;
import com.zepto.pq;
import com.zepto.q45;
import com.zepto.s14;
import com.zepto.su5;
import com.zepto.ta3;
import com.zepto.va3;
import com.zepto.wa3;
import com.zepto.ws6;
import de.hdodenhof.circleimageview.CircleImageView;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u00012\u00020\u0002B\t¢\u0006\u0006\bè\u0001\u0010é\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u001a\u0010\f\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\nJ\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u0012\u0010\u0012\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u0013\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0016J*\u0010\u0017\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015J6\u0010\u001c\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\nJ\u0018\u0010\u001f\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0014\u001a\u00020\nJ\u001a\u0010 \u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010?\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0016\u0010R\u001a\u00020P8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010^\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010U\u001a\u0004\b\\\u0010W\"\u0004\b]\u0010YR\"\u0010b\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010U\u001a\u0004\b`\u0010W\"\u0004\ba\u0010YR\"\u0010f\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010U\u001a\u0004\bd\u0010W\"\u0004\be\u0010YR\"\u0010j\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010U\u001a\u0004\bh\u0010W\"\u0004\bi\u0010YR\"\u0010n\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bk\u0010U\u001a\u0004\bl\u0010W\"\u0004\bm\u0010YR\"\u0010r\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bo\u0010U\u001a\u0004\bp\u0010W\"\u0004\bq\u0010YR\"\u0010v\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010U\u001a\u0004\bt\u0010W\"\u0004\bu\u0010YR\"\u0010z\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bw\u0010B\u001a\u0004\bx\u0010D\"\u0004\by\u0010FR%\u0010\u0082\u0001\u001a\u00020{8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R)\u0010\u0089\u0001\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R(\u0010\u001b\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u0084\u0001\u001a\u0006\b\u008b\u0001\u0010\u0086\u0001\"\u0006\b\u008c\u0001\u0010\u0088\u0001R*\u0010\u0094\u0001\u001a\u00030\u008d\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R&\u0010\u0098\u0001\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0095\u0001\u0010B\u001a\u0005\b\u0096\u0001\u0010D\"\u0005\b\u0097\u0001\u0010FR&\u0010\u009c\u0001\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0099\u0001\u0010B\u001a\u0005\b\u009a\u0001\u0010D\"\u0005\b\u009b\u0001\u0010FR4\u0010¥\u0001\u001a\r \u009e\u0001*\u0005\u0018\u00010\u009d\u00010\u009d\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R*\u0010\u00ad\u0001\u001a\u00030¦\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R(\u0010\u0014\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b®\u0001\u0010\u0084\u0001\u001a\u0006\b¯\u0001\u0010\u0086\u0001\"\u0006\b°\u0001\u0010\u0088\u0001R)\u0010·\u0001\u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001R&\u0010»\u0001\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¸\u0001\u0010B\u001a\u0005\b¹\u0001\u0010D\"\u0005\bº\u0001\u0010FR)\u0010¿\u0001\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¼\u0001\u0010\u0084\u0001\u001a\u0006\b½\u0001\u0010\u0086\u0001\"\u0006\b¾\u0001\u0010\u0088\u0001R\u001a\u0010Ã\u0001\u001a\u00030À\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R*\u0010Ë\u0001\u001a\u00030Ä\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÅ\u0001\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001\"\u0006\bÉ\u0001\u0010Ê\u0001R*\u0010Ó\u0001\u001a\u00030Ì\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÍ\u0001\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0006\bÑ\u0001\u0010Ò\u0001R\u001a\u0010×\u0001\u001a\u00030Ô\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÕ\u0001\u0010Ö\u0001R,\u0010ß\u0001\u001a\u0005\u0018\u00010Ø\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÙ\u0001\u0010Ú\u0001\u001a\u0006\bÛ\u0001\u0010Ü\u0001\"\u0006\bÝ\u0001\u0010Þ\u0001R&\u0010ã\u0001\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bà\u0001\u0010U\u001a\u0005\bá\u0001\u0010W\"\u0005\bâ\u0001\u0010YR&\u0010ç\u0001\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bä\u0001\u0010B\u001a\u0005\bå\u0001\u0010D\"\u0005\bæ\u0001\u0010F¨\u0006ê\u0001"}, d2 = {"Lcom/nic/mparivahan/Dl/SearchDL;", "Lcom/zepto/pq;", "Lcom/zepto/d65;", "", "T1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "Q2", "encodedImage", "Landroid/graphics/Bitmap;", "J1", "onBackPressed", "searchNumber", "u", "I", "dl_number", "", "forChallan", "L2", "doc_number", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "dlobj", "doc_id", "H1", "dl", "L1", "E2", "J2", "Lcom/zepto/is1;", "C", "Lcom/zepto/is1;", "b2", "()Lcom/zepto/is1;", "c3", "(Lcom/zepto/is1;)V", "mDlViewModel", "Lcom/nic/mparivahan/Dl/DlInterface/DlService;", "D", "Lcom/nic/mparivahan/Dl/DlInterface/DlService;", "a2", "()Lcom/nic/mparivahan/Dl/DlInterface/DlService;", "b3", "(Lcom/nic/mparivahan/Dl/DlInterface/DlService;)V", "mDlService", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "e2", "()Landroid/app/ProgressDialog;", "f3", "(Landroid/app/ProgressDialog;)V", "pDialog", "F", "Landroid/content/Context;", "Z1", "()Landroid/content/Context;", "a3", "(Landroid/content/Context;)V", "mContext", "Landroid/widget/LinearLayout;", "G", "Landroid/widget/LinearLayout;", "r2", "()Landroid/widget/LinearLayout;", "t3", "(Landroid/widget/LinearLayout;)V", "vehicleImpoundLl", "Lcom/zepto/o45;", "H", "Lcom/zepto/o45;", "f2", "()Lcom/zepto/o45;", "g3", "(Lcom/zepto/o45;)V", "rcImpoundModel", "Lcom/nic/mparivahan/RC/RcInterface/RcImpoundService;", "Lcom/nic/mparivahan/RC/RcInterface/RcImpoundService;", "rcImpoundService", "Landroid/widget/TextView;", "J", "Landroid/widget/TextView;", "k2", "()Landroid/widget/TextView;", "l3", "(Landroid/widget/TextView;)V", "txtDlHolderName", "K", "m2", "n3", "txtLicAuthCode", "L", "getTxtVehicleClass", "q3", "txtVehicleClass", "M", "o2", "p3", "txtLicValidityCode", "N", "n2", "o3", "txtLicAuthority", "O", "l2", "m3", "txtIssueDate", "P", "h2", "i3", "tap_to_dl_impound", "Q", "p2", "r3", "txt_dl_number", "R", "O1", "U2", "dl_layout", "Lde/hdodenhof/circleimageview/CircleImageView;", "S", "Lde/hdodenhof/circleimageview/CircleImageView;", "d2", "()Lde/hdodenhof/circleimageview/CircleImageView;", "e3", "(Lde/hdodenhof/circleimageview/CircleImageView;)V", "owner_image", "T", "Ljava/lang/String;", "N1", "()Ljava/lang/String;", "T2", "(Ljava/lang/String;)V", "dateValeMain", "U", "S1", "Y2", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "V", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "M1", "()Lcom/nic/mparivahan/DB/DatabaseHelper;", "S2", "(Lcom/nic/mparivahan/DB/DatabaseHelper;)V", "databaseHelper", "W", "Y1", "Z2", "ll_create_dl", "X", "s2", "u3", "viewChallanLl", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "Y", "Ljava/util/Calendar;", "K1", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "Lcom/zepto/ws6;", "Z", "Lcom/zepto/ws6;", "q2", "()Lcom/zepto/ws6;", "s3", "(Lcom/zepto/ws6;)V", "userSessionManager", "a0", "P1", "V2", "b0", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "R1", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "X2", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "dlobjx", "c0", "c2", "d3", "nexgenarrow", "d0", "Q1", "W2", "dl_number_intent", "Lcom/zepto/ag;", "e0", "Lcom/zepto/ag;", "binding", "Lcom/zepto/wa3;", "f0", "Lcom/zepto/wa3;", "g2", "()Lcom/zepto/wa3;", "h3", "(Lcom/zepto/wa3;)V", "session", "Lcom/zepto/p26;", "g0", "Lcom/zepto/p26;", "t2", "()Lcom/zepto/p26;", "v3", "(Lcom/zepto/p26;)V", "viewModel", "Lcom/nic/mparivahan/Account/SignService;", "h0", "Lcom/nic/mparivahan/Account/SignService;", "retrofitService", "Landroid/app/Dialog;", "i0", "Landroid/app/Dialog;", "getDiloge", "()Landroid/app/Dialog;", "setDiloge", "(Landroid/app/Dialog;)V", "diloge", "j0", "j2", "k3", "transvalidity_tv", "k0", "i2", "j3", "transport_layout", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSearchDL.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchDL.kt\ncom/nic/mparivahan/Dl/SearchDL\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,1564:1\n107#2:1565\n79#2,22:1566\n107#2:1588\n79#2,22:1589\n107#2:1611\n79#2,22:1612\n107#2:1634\n79#2,22:1635\n107#2:1657\n79#2,22:1658\n107#2:1680\n79#2,22:1681\n107#2:1703\n79#2,29:1704\n107#2:1733\n79#2,29:1734\n107#2:1763\n79#2,29:1764\n107#2:1793\n79#2,29:1794\n107#2:1823\n79#2,29:1824\n*S KotlinDebug\n*F\n+ 1 SearchDL.kt\ncom/nic/mparivahan/Dl/SearchDL\n*L\n1004#1:1565\n1004#1:1566,22\n1005#1:1588\n1005#1:1589,22\n1006#1:1611\n1006#1:1612,22\n1009#1:1634\n1009#1:1635,22\n1010#1:1657\n1010#1:1658,22\n1011#1:1680\n1011#1:1681,22\n1187#1:1703\n1187#1:1704,29\n1191#1:1733\n1191#1:1734,29\n1211#1:1763\n1211#1:1764,29\n1509#1:1793\n1509#1:1794,29\n1512#1:1823\n1512#1:1824,29\n*E\n"})
public final class SearchDL extends pq implements d65 {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public is1 mDlViewModel;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public DlService mDlService;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public LinearLayout vehicleImpoundLl;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public o45 rcImpoundModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public RcImpoundService rcImpoundService;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public TextView txtDlHolderName;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public TextView txtLicAuthCode;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public TextView txtVehicleClass;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public TextView txtLicValidityCode;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public TextView txtLicAuthority;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public TextView txtIssueDate;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public TextView tap_to_dl_impound;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public TextView txt_dl_number;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public LinearLayout dl_layout;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public CircleImageView owner_image;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String dateValeMain;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String doc_id;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public DatabaseHelper databaseHelper;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public LinearLayout ll_create_dl;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public LinearLayout viewChallanLl;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public ws6 userSessionManager;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String dl_number;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public DldetobjX dlobjx;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public LinearLayout nexgenarrow;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public String dl_number_intent;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public ag binding;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public p26 viewModel;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public SignService retrofitService;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public Dialog diloge;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public TextView transvalidity_tv;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public LinearLayout transport_layout;

    public static final class a implements Callback {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ SearchDL b;
        public final /* synthetic */ String c;

        public a(Ref.ObjectRef objectRef, SearchDL searchDL, String str) {
            this.a = objectRef;
            this.b = searchDL;
            this.c = str;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            Intrinsics.checkNotNullParameter(call, "call");
            this.b.e2().dismiss();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                su5.a aVar = su5.a;
                String str = (String) this.a.element;
                byte[] bArrDecode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
                Object objFromJson = new Gson().fromJson(String.valueOf(aVar.a(str, new String(bArrDecode, Charsets.UTF_8))), (Class<Object>) DLServiceModelForRecentSear.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
                DLServiceModelForRecentSear dLServiceModelForRecentSear = (DLServiceModelForRecentSear) objFromJson;
                if (dLServiceModelForRecentSear.getErrorcd() == 1) {
                    is1 is1VarB2 = this.b.b2();
                    String str2 = this.c;
                    BioObj bioObj = dLServiceModelForRecentSear.getBioObj();
                    is1VarB2.g(str2, String.valueOf(bioObj != null ? bioObj.getBioDob() : null), this.b.Z1());
                }
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
        public final void a(ResendOtp resendOtp) {
            SearchDL.this.e2().dismiss();
            try {
                if (StringsKt__StringsJVMKt.equals(resendOtp.getStatusCode(), "AL001", true)) {
                    SearchDL searchDL = SearchDL.this;
                    Toast.makeText(searchDL, searchDL.g2().b("label_log_resend_otp", "We have resent the OTP to your Mobile Number"), 1).show();
                } else if (gd1.a.m(resendOtp.getStatusDesc())) {
                    SearchDL.this.e2().dismiss();
                    SearchDL searchDL2 = SearchDL.this;
                    searchDL2.Q2(searchDL2, searchDL2.g2().b("label_log_invalid_otp", "The OTP you entered is invalid, Please enter the correct OTP"));
                } else {
                    Toast.makeText(SearchDL.this, resendOtp.getStatusDesc(), 1).show();
                }
            } catch (Exception unused) {
                SearchDL.this.e2().dismiss();
                SearchDL searchDL3 = SearchDL.this;
                searchDL3.Q2(searchDL3, searchDL3.g2().b("label_log_unbl_resend_otp", "Unable to resend the OTP, Please try after sometime."));
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
            SearchDL.this.e2().dismiss();
            SearchDL searchDL = SearchDL.this;
            searchDL.Q2(searchDL, searchDL.g2().b("label_log_unbl_resend_otp", "Unable to resend the OTP, Please try after sometime."));
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        public final void a(ImpoundDlSuccessModel impoundDlSuccessModel) {
            if (SearchDL.this.e2().isShowing()) {
                SearchDL.this.e2().dismiss();
            }
            try {
                int size = impoundDlSuccessModel.getResult().size();
                for (int i = 0; i < size; i++) {
                    if (StringsKt__StringsJVMKt.equals(impoundDlSuccessModel.getResult().get(i).getImpound_type(), "document", true)) {
                        SearchDL.this.r2().setVisibility(0);
                    }
                    StringsKt__StringsJVMKt.equals(impoundDlSuccessModel.getResult().get(i).getImpound_type(), "vehicle", true);
                }
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ImpoundDlSuccessModel) obj);
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
            if (SearchDL.this.e2().isShowing()) {
                SearchDL.this.e2().dismiss();
                SearchDL.this.r2().setVisibility(8);
            }
            SearchDL searchDL = SearchDL.this;
            searchDL.J2(searchDL, "No Vehicle or Seizure Document impound against the searched DL number.");
        }
    }

    public static final class f implements View.OnClickListener {
        public final /* synthetic */ k b;

        public f(k kVar) {
            this.b = kVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            DatePickerDialog datePickerDialog = new DatePickerDialog(SearchDL.this.Z1(), this.b, SearchDL.this.getCal().get(1), SearchDL.this.getCal().get(2), SearchDL.this.getCal().get(5));
            datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
            datePickerDialog.show();
        }
    }

    public static final class g implements TextWatcher {
        public final /* synthetic */ EditText a;

        public g(EditText editText) {
            this.a = editText;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            if (s.length() >= 2) {
                this.a.setFocusableInTouchMode(true);
            }
        }
    }

    public static final class h implements TextWatcher {
        public final /* synthetic */ EditText a;
        public final /* synthetic */ EditText b;

        public h(EditText editText, EditText editText2) {
            this.a = editText;
            this.b = editText2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            this.a.requestFocus();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            if (i == 1 && i2 == 0) {
                this.b.requestFocus();
            }
            String string = s.toString();
            int length = string.length() - 1;
            int i4 = 0;
            boolean z = false;
            while (i4 <= length) {
                boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i4 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i4++;
                } else {
                    z = true;
                }
            }
            if (string.subSequence(i4, length + 1).toString().length() == 2) {
                String string2 = s.toString();
                int length2 = string2.length() - 1;
                int i5 = 0;
                boolean z3 = false;
                while (i5 <= length2) {
                    boolean z4 = Intrinsics.compare((int) string2.charAt(!z3 ? i5 : length2), 32) <= 0;
                    if (z3) {
                        if (!z4) {
                            break;
                        } else {
                            length2--;
                        }
                    } else if (z4) {
                        i5++;
                    } else {
                        z3 = true;
                    }
                }
                int i6 = Integer.parseInt(string2.subSequence(i5, length2 + 1).toString());
                if (i6 == 0 || i6 > 31) {
                    this.a.setText("");
                }
            }
        }
    }

    public static final class i implements TextWatcher {
        public final /* synthetic */ EditText a;

        public i(EditText editText) {
            this.a = editText;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            if (s.length() >= 2) {
                this.a.setFocusableInTouchMode(true);
            }
        }
    }

    public static final class j implements TextWatcher {
        public final /* synthetic */ EditText a;
        public final /* synthetic */ EditText b;

        public j(EditText editText, EditText editText2) {
            this.a = editText;
            this.b = editText2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            this.a.requestFocus();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            if (i == 1 && i2 == 0) {
                this.b.requestFocus();
            }
            String string = s.toString();
            int length = string.length() - 1;
            int i4 = 0;
            boolean z = false;
            while (i4 <= length) {
                boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i4 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i4++;
                } else {
                    z = true;
                }
            }
            if (string.subSequence(i4, length + 1).toString().length() == 2) {
                String string2 = s.toString();
                int length2 = string2.length() - 1;
                int i5 = 0;
                boolean z3 = false;
                while (i5 <= length2) {
                    boolean z4 = Intrinsics.compare((int) string2.charAt(!z3 ? i5 : length2), 32) <= 0;
                    if (z3) {
                        if (!z4) {
                            break;
                        } else {
                            length2--;
                        }
                    } else if (z4) {
                        i5++;
                    } else {
                        z3 = true;
                    }
                }
                int i6 = Integer.parseInt(string2.subSequence(i5, length2 + 1).toString());
                if (i6 == 0 || i6 > 12) {
                    this.a.setText("");
                }
            }
        }
    }

    public static final class k implements DatePickerDialog.OnDateSetListener {
        public final /* synthetic */ EditText b;
        public final /* synthetic */ EditText c;
        public final /* synthetic */ EditText d;

        public k(EditText editText, EditText editText2, EditText editText3) {
            this.b = editText;
            this.c = editText2;
            this.d = editText3;
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker view, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(view, "view");
            SearchDL.this.getCal().set(1, i);
            SearchDL.this.getCal().set(2, i2);
            SearchDL.this.getCal().set(5, i3);
            CharSequence charSequence = DateFormat.format("dd", SearchDL.this.getCal().getTime());
            Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type kotlin.String");
            String str = (String) charSequence;
            CharSequence charSequence2 = DateFormat.format("MM", SearchDL.this.getCal().getTime());
            Intrinsics.checkNotNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) charSequence2;
            CharSequence charSequence3 = DateFormat.format("yyyy", SearchDL.this.getCal().getTime());
            Intrinsics.checkNotNull(charSequence3, "null cannot be cast to non-null type kotlin.String");
            String str3 = (String) charSequence3;
            try {
                this.b.setText(str);
                this.c.setText(str2);
                this.d.setText(str3);
                this.b.clearFocus();
                this.c.clearFocus();
                this.d.clearFocus();
            } catch (Exception unused) {
            }
        }
    }

    public static final class l implements View.OnClickListener {
        public final /* synthetic */ q b;

        public l(q qVar) {
            this.b = qVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            DatePickerDialog datePickerDialog = new DatePickerDialog(SearchDL.this.Z1(), this.b, SearchDL.this.getCal().get(1), SearchDL.this.getCal().get(2), SearchDL.this.getCal().get(5));
            datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
            datePickerDialog.show();
        }
    }

    public static final class m implements TextWatcher {
        public final /* synthetic */ EditText a;

        public m(EditText editText) {
            this.a = editText;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            if (s.length() >= 2) {
                this.a.setFocusableInTouchMode(true);
            }
        }
    }

    public static final class n implements TextWatcher {
        public final /* synthetic */ EditText a;
        public final /* synthetic */ EditText b;

        public n(EditText editText, EditText editText2) {
            this.a = editText;
            this.b = editText2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            this.a.requestFocus();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            if (i == 1 && i2 == 0) {
                this.b.requestFocus();
            }
            String string = s.toString();
            int length = string.length() - 1;
            int i4 = 0;
            boolean z = false;
            while (i4 <= length) {
                boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i4 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i4++;
                } else {
                    z = true;
                }
            }
            if (string.subSequence(i4, length + 1).toString().length() == 2) {
                String string2 = s.toString();
                int length2 = string2.length() - 1;
                int i5 = 0;
                boolean z3 = false;
                while (i5 <= length2) {
                    boolean z4 = Intrinsics.compare((int) string2.charAt(!z3 ? i5 : length2), 32) <= 0;
                    if (z3) {
                        if (!z4) {
                            break;
                        } else {
                            length2--;
                        }
                    } else if (z4) {
                        i5++;
                    } else {
                        z3 = true;
                    }
                }
                int i6 = Integer.parseInt(string2.subSequence(i5, length2 + 1).toString());
                if (i6 == 0 || i6 > 31) {
                    this.a.setText("");
                }
            }
        }
    }

    public static final class o implements TextWatcher {
        public final /* synthetic */ EditText a;

        public o(EditText editText) {
            this.a = editText;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            if (s.length() >= 2) {
                this.a.setFocusableInTouchMode(true);
            }
        }
    }

    public static final class p implements TextWatcher {
        public final /* synthetic */ EditText a;
        public final /* synthetic */ EditText b;

        public p(EditText editText, EditText editText2) {
            this.a = editText;
            this.b = editText2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            this.a.requestFocus();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            if (i == 1 && i2 == 0) {
                this.b.requestFocus();
            }
            String string = s.toString();
            int length = string.length() - 1;
            int i4 = 0;
            boolean z = false;
            while (i4 <= length) {
                boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i4 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i4++;
                } else {
                    z = true;
                }
            }
            if (string.subSequence(i4, length + 1).toString().length() == 2) {
                String string2 = s.toString();
                int length2 = string2.length() - 1;
                int i5 = 0;
                boolean z3 = false;
                while (i5 <= length2) {
                    boolean z4 = Intrinsics.compare((int) string2.charAt(!z3 ? i5 : length2), 32) <= 0;
                    if (z3) {
                        if (!z4) {
                            break;
                        } else {
                            length2--;
                        }
                    } else if (z4) {
                        i5++;
                    } else {
                        z3 = true;
                    }
                }
                int i6 = Integer.parseInt(string2.subSequence(i5, length2 + 1).toString());
                if (i6 == 0 || i6 > 12) {
                    this.a.setText("");
                }
            }
        }
    }

    public static final class q implements DatePickerDialog.OnDateSetListener {
        public final /* synthetic */ EditText b;
        public final /* synthetic */ EditText c;
        public final /* synthetic */ EditText d;

        public q(EditText editText, EditText editText2, EditText editText3) {
            this.b = editText;
            this.c = editText2;
            this.d = editText3;
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker view, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(view, "view");
            SearchDL.this.getCal().set(1, i);
            SearchDL.this.getCal().set(2, i2);
            SearchDL.this.getCal().set(5, i3);
            CharSequence charSequence = DateFormat.format("dd", SearchDL.this.getCal().getTime());
            Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type kotlin.String");
            String str = (String) charSequence;
            CharSequence charSequence2 = DateFormat.format("MM", SearchDL.this.getCal().getTime());
            Intrinsics.checkNotNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) charSequence2;
            CharSequence charSequence3 = DateFormat.format("yyyy", SearchDL.this.getCal().getTime());
            Intrinsics.checkNotNull(charSequence3, "null cannot be cast to non-null type kotlin.String");
            String str3 = (String) charSequence3;
            try {
                this.b.setText(str);
                this.c.setText(str2);
                this.d.setText(str3);
                this.b.clearFocus();
                this.c.clearFocus();
                this.d.clearFocus();
            } catch (Exception unused) {
            }
        }
    }

    public static final class r implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public r(Function1 function) {
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

    public static final void A2(SearchDL this$0, SendOtpResult sendOtpResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.e2().dismiss();
            if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL001", true)) {
                this$0.diloge = n35.a.m(this$0, this$0, new ws6(this$0).l(), this$0.t2(), String.valueOf(sendOtpResult.getRecordId()), StringsKt__StringsKt.trim((CharSequence) this$0.p2().getText().toString()).toString(), "DL", this$0.N1(), this$0.e2());
            } else if (!gd1.a.m(sendOtpResult.getStatusDesc())) {
                this$0.Q2(this$0, sendOtpResult.getStatusDesc());
            }
        } catch (Exception unused) {
            this$0.e2().dismiss();
        }
    }

    public static final void B2(SearchDL this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.e2().dismiss();
        this$0.Q2(this$0, this$0.g2().b(va3.a.L0(), "Unable to create the virtual RC, Please try after some time"));
    }

    public static final void C2(SearchDL this$0, CitzValidDoc citzValidDoc) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (!StringsKt__StringsJVMKt.equals$default(citzValidDoc.getStatusCode(), "AL001", false, 2, null)) {
                this$0.e2().dismiss();
                Toast.makeText(this$0, citzValidDoc.getStatusDesc(), 1).show();
                return;
            }
            Dialog dialog = this$0.diloge;
            if (dialog != null) {
                Intrinsics.checkNotNull(dialog);
                dialog.dismiss();
                this$0.e2().dismiss();
            }
            gd1.a aVar = gd1.a;
            if (aVar.m(citzValidDoc.getParam())) {
                Dialog dialog2 = this$0.diloge;
                if (dialog2 != null) {
                    Intrinsics.checkNotNull(dialog2);
                    dialog2.dismiss();
                }
                CitizenDocInfoX citizenDocInfo = citzValidDoc.getCitizenDocInfo();
                this$0.Y2(String.valueOf(citizenDocInfo != null ? citizenDocInfo.getDocId() : null));
                this$0.b2().g(this$0.P1(), this$0.N1().toString(), this$0);
                return;
            }
            if (this$0.e2().isShowing()) {
                this$0.e2().dismiss();
            }
            if (aVar.m(citzValidDoc.getParam())) {
                Dialog dialog3 = this$0.diloge;
                if (dialog3 != null) {
                    Intrinsics.checkNotNull(dialog3);
                    dialog3.dismiss();
                }
                this$0.Q2(this$0.Z1(), this$0.g2().b(va3.a.K0(), "Unable to Create the Virtual DL, Please try after some time."));
                return;
            }
            Dialog dialog4 = this$0.diloge;
            if (dialog4 != null) {
                Intrinsics.checkNotNull(dialog4);
                dialog4.dismiss();
            }
            this$0.Q2(this$0, citzValidDoc.getParam());
        } catch (Exception unused) {
            if (this$0.e2().isShowing()) {
                this$0.e2().dismiss();
            }
            Dialog dialog5 = this$0.diloge;
            if (dialog5 != null) {
                Intrinsics.checkNotNull(dialog5);
                dialog5.dismiss();
            }
            this$0.Q2(this$0.Z1(), this$0.g2().b(va3.a.K0(), "Unable to Create the Virtual DL, Please try after some time."));
        }
    }

    public static final void D2(SearchDL this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Log.e("Test", str.toString());
        this$0.e2().dismiss();
        Dialog dialog = this$0.diloge;
        if (dialog != null) {
            Intrinsics.checkNotNull(dialog);
            dialog.dismiss();
        }
        this$0.Q2(this$0.Z1(), this$0.g2().b(va3.a.K0(), "Unable to Create the Virtual DL, Please try after some time."));
    }

    public static final boolean F2(TextView textView, int i2, KeyEvent keyEvent) {
        return i2 == 3 || i2 == 6 || (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66);
    }

    public static final boolean G2(EditText dobMonth, EditText dobDate, View view, int i2, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(dobMonth, "$dobMonth");
        Intrinsics.checkNotNullParameter(dobDate, "$dobDate");
        if (i2 != 67 || dobMonth.getText().length() != 0) {
            return false;
        }
        dobDate.requestFocus();
        return false;
    }

    public static final void H2(Dialog d2, SearchDL this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        this$0.finish();
    }

    public static final void I1(Dialog d2, SearchDL this$0, String str, DldetobjX dlobj, String str2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dlobj, "$dlobj");
        d2.dismiss();
        try {
            this$0.M1().O0(str, dlobj, str2, k18.a.g(dlobj.getBioObj().getBioDob().toString()));
            this$0.startActivity(new Intent(this$0, (Class<?>) DLVirtualRcScreen.class));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void I2(SearchDL this$0, EditText dobYear, EditText dobMonth, EditText dobDate, Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dobYear, "$dobYear");
        Intrinsics.checkNotNullParameter(dobMonth, "$dobMonth");
        Intrinsics.checkNotNullParameter(dobDate, "$dobDate");
        Intrinsics.checkNotNullParameter(d2, "$d");
        this$0.f3(new ProgressDialog(this$0.Z1()));
        this$0.e2().setMessage("Please wait...");
        this$0.e2().setCancelable(false);
        this$0.e2().setCanceledOnTouchOutside(false);
        String string = dobYear.getText().toString();
        int length = string.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i2 : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i2++;
            } else {
                z = true;
            }
        }
        if (string.subSequence(i2, length + 1).toString().length() > 0) {
            String string2 = dobMonth.getText().toString();
            int length2 = string2.length() - 1;
            int i3 = 0;
            boolean z3 = false;
            while (i3 <= length2) {
                boolean z4 = Intrinsics.compare((int) string2.charAt(!z3 ? i3 : length2), 32) <= 0;
                if (z3) {
                    if (!z4) {
                        break;
                    } else {
                        length2--;
                    }
                } else if (z4) {
                    i3++;
                } else {
                    z3 = true;
                }
            }
            if (string2.subSequence(i3, length2 + 1).toString().length() > 0) {
                String string3 = dobDate.getText().toString();
                int length3 = string3.length() - 1;
                int i4 = 0;
                boolean z5 = false;
                while (i4 <= length3) {
                    boolean z6 = Intrinsics.compare((int) string3.charAt(!z5 ? i4 : length3), 32) <= 0;
                    if (z5) {
                        if (!z6) {
                            break;
                        } else {
                            length3--;
                        }
                    } else if (z6) {
                        i4++;
                    } else {
                        z5 = true;
                    }
                }
                if (string3.subSequence(i4, length3 + 1).toString().length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    String string4 = dobYear.getText().toString();
                    int length4 = string4.length() - 1;
                    int i5 = 0;
                    boolean z7 = false;
                    while (i5 <= length4) {
                        boolean z8 = Intrinsics.compare((int) string4.charAt(!z7 ? i5 : length4), 32) <= 0;
                        if (z7) {
                            if (!z8) {
                                break;
                            } else {
                                length4--;
                            }
                        } else if (z8) {
                            i5++;
                        } else {
                            z7 = true;
                        }
                    }
                    sb.append(string4.subSequence(i5, length4 + 1).toString());
                    sb.append('-');
                    String string5 = dobMonth.getText().toString();
                    int length5 = string5.length() - 1;
                    int i6 = 0;
                    boolean z9 = false;
                    while (i6 <= length5) {
                        boolean z10 = Intrinsics.compare((int) string5.charAt(!z9 ? i6 : length5), 32) <= 0;
                        if (z9) {
                            if (!z10) {
                                break;
                            } else {
                                length5--;
                            }
                        } else if (z10) {
                            i6++;
                        } else {
                            z9 = true;
                        }
                    }
                    sb.append(string5.subSequence(i6, length5 + 1).toString());
                    sb.append('-');
                    String string6 = dobDate.getText().toString();
                    int length6 = string6.length() - 1;
                    int i7 = 0;
                    boolean z11 = false;
                    while (i7 <= length6) {
                        boolean z12 = Intrinsics.compare((int) string6.charAt(!z11 ? i7 : length6), 32) <= 0;
                        if (z11) {
                            if (!z12) {
                                break;
                            } else {
                                length6--;
                            }
                        } else if (z12) {
                            i7++;
                        } else {
                            z11 = true;
                        }
                    }
                    sb.append(string6.subSequence(i7, length6 + 1).toString());
                    String string7 = sb.toString();
                    d2.dismiss();
                    this$0.e2().show();
                    this$0.b2().k(this$0.Q1(), string7, this$0);
                    return;
                }
            }
        }
        Toast.makeText(this$0, this$0.g2().b("edit_dl_serv_dob", "Please enter the valid dob"), 0).show();
    }

    public static final void K2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final boolean M2(TextView textView, int i2, KeyEvent keyEvent) {
        return i2 == 3 || i2 == 6 || (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66);
    }

    public static final boolean N2(EditText dobMonth, EditText dobDate, View view, int i2, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(dobMonth, "$dobMonth");
        Intrinsics.checkNotNullParameter(dobDate, "$dobDate");
        if (i2 != 67 || dobMonth.getText().length() != 0) {
            return false;
        }
        dobDate.requestFocus();
        return false;
    }

    public static final void O2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void P2(String str, SearchDL this$0, EditText dobYear, EditText dobMonth, EditText dobDate, int i2, Dialog d2, String dl_number, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dobYear, "$dobYear");
        Intrinsics.checkNotNullParameter(dobMonth, "$dobMonth");
        Intrinsics.checkNotNullParameter(dobDate, "$dobDate");
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(dl_number, "$dl_number");
        if (str != null) {
            this$0.f3(new ProgressDialog(this$0.Z1()));
            this$0.e2().setMessage("Please wait...");
            this$0.e2().setCancelable(false);
            this$0.e2().setCanceledOnTouchOutside(false);
            String string = dobYear.getText().toString();
            int length = string.length() - 1;
            int i3 = 0;
            boolean z = false;
            while (i3 <= length) {
                boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i3 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i3++;
                } else {
                    z = true;
                }
            }
            if (string.subSequence(i3, length + 1).toString().length() > 0) {
                String string2 = dobMonth.getText().toString();
                int length2 = string2.length() - 1;
                int i4 = 0;
                boolean z3 = false;
                while (i4 <= length2) {
                    boolean z4 = Intrinsics.compare((int) string2.charAt(!z3 ? i4 : length2), 32) <= 0;
                    if (z3) {
                        if (!z4) {
                            break;
                        } else {
                            length2--;
                        }
                    } else if (z4) {
                        i4++;
                    } else {
                        z3 = true;
                    }
                }
                if (string2.subSequence(i4, length2 + 1).toString().length() > 0) {
                    String string3 = dobDate.getText().toString();
                    int length3 = string3.length() - 1;
                    int i5 = 0;
                    boolean z5 = false;
                    while (i5 <= length3) {
                        boolean z6 = Intrinsics.compare((int) string3.charAt(!z5 ? i5 : length3), 32) <= 0;
                        if (z5) {
                            if (!z6) {
                                break;
                            } else {
                                length3--;
                            }
                        } else if (z6) {
                            i5++;
                        } else {
                            z5 = true;
                        }
                    }
                    if (string3.subSequence(i5, length3 + 1).toString().length() > 0) {
                        if (i2 != 1) {
                            StringBuilder sb = new StringBuilder();
                            String string4 = dobYear.getText().toString();
                            int length4 = string4.length() - 1;
                            int i6 = 0;
                            boolean z7 = false;
                            while (i6 <= length4) {
                                boolean z8 = Intrinsics.compare((int) string4.charAt(!z7 ? i6 : length4), 32) <= 0;
                                if (z7) {
                                    if (!z8) {
                                        break;
                                    } else {
                                        length4--;
                                    }
                                } else if (z8) {
                                    i6++;
                                } else {
                                    z7 = true;
                                }
                            }
                            sb.append(string4.subSequence(i6, length4 + 1).toString());
                            sb.append('-');
                            String string5 = dobMonth.getText().toString();
                            int length5 = string5.length() - 1;
                            int i7 = 0;
                            boolean z9 = false;
                            while (i7 <= length5) {
                                boolean z10 = Intrinsics.compare((int) string5.charAt(!z9 ? i7 : length5), 32) <= 0;
                                if (z9) {
                                    if (!z10) {
                                        break;
                                    } else {
                                        length5--;
                                    }
                                } else if (z10) {
                                    i7++;
                                } else {
                                    z9 = true;
                                }
                            }
                            sb.append(string5.subSequence(i7, length5 + 1).toString());
                            sb.append('-');
                            String string6 = dobDate.getText().toString();
                            int length6 = string6.length() - 1;
                            int i8 = 0;
                            boolean z11 = false;
                            while (i8 <= length6) {
                                boolean z12 = Intrinsics.compare((int) string6.charAt(!z11 ? i8 : length6), 32) <= 0;
                                if (z11) {
                                    if (!z12) {
                                        break;
                                    } else {
                                        length6--;
                                    }
                                } else if (z12) {
                                    i8++;
                                } else {
                                    z11 = true;
                                }
                            }
                            sb.append(string6.subSequence(i8, length6 + 1).toString());
                            String string7 = sb.toString();
                            this$0.T2(k18.a.b(StringsKt__StringsKt.trim((CharSequence) this$0.N1()).toString()));
                            if (!Intrinsics.areEqual(string7, this$0.N1())) {
                                Toast.makeText(this$0, this$0.g2().b(va3.a.d0(), "Please enter the valid dob"), 0).show();
                                return;
                            }
                            d2.dismiss();
                            this$0.e2().show();
                            this$0.t2().I(this$0, this$0.q2().l(), 2);
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        String string8 = dobYear.getText().toString();
                        int length7 = string8.length() - 1;
                        int i9 = 0;
                        boolean z13 = false;
                        while (i9 <= length7) {
                            boolean z14 = Intrinsics.compare((int) string8.charAt(!z13 ? i9 : length7), 32) <= 0;
                            if (z13) {
                                if (!z14) {
                                    break;
                                } else {
                                    length7--;
                                }
                            } else if (z14) {
                                i9++;
                            } else {
                                z13 = true;
                            }
                        }
                        sb2.append(string8.subSequence(i9, length7 + 1).toString());
                        sb2.append('-');
                        String string9 = dobMonth.getText().toString();
                        int length8 = string9.length() - 1;
                        int i10 = 0;
                        boolean z15 = false;
                        while (i10 <= length8) {
                            boolean z16 = Intrinsics.compare((int) string9.charAt(!z15 ? i10 : length8), 32) <= 0;
                            if (z15) {
                                if (!z16) {
                                    break;
                                } else {
                                    length8--;
                                }
                            } else if (z16) {
                                i10++;
                            } else {
                                z15 = true;
                            }
                        }
                        sb2.append(string9.subSequence(i10, length8 + 1).toString());
                        sb2.append('-');
                        String string10 = dobDate.getText().toString();
                        int length9 = string10.length() - 1;
                        int i11 = 0;
                        boolean z17 = false;
                        while (i11 <= length9) {
                            boolean z18 = Intrinsics.compare((int) string10.charAt(!z17 ? i11 : length9), 32) <= 0;
                            if (z17) {
                                if (!z18) {
                                    break;
                                } else {
                                    length9--;
                                }
                            } else if (z18) {
                                i11++;
                            } else {
                                z17 = true;
                            }
                        }
                        sb2.append(string10.subSequence(i11, length9 + 1).toString());
                        String string11 = sb2.toString();
                        this$0.T2(k18.a.b(StringsKt__StringsKt.trim((CharSequence) this$0.N1()).toString()));
                        if (!Intrinsics.areEqual(string11, this$0.N1())) {
                            Toast.makeText(this$0, this$0.g2().b(va3.a.d0(), "Please enter the valid dob"), 0).show();
                            return;
                        }
                        d2.dismiss();
                        Intent intent = new Intent(this$0, (Class<?>) ViewRcChallanActivity.class);
                        intent.putExtra("rcNo", StringsKt__StringsKt.trim((CharSequence) dl_number).toString());
                        intent.putExtra("type", "DL");
                        this$0.startActivity(intent);
                        return;
                    }
                }
            }
            Toast.makeText(this$0, this$0.g2().b(va3.a.d0(), "Please enter the valid dob"), 0).show();
        }
    }

    public static final void R2(Dialog d2, SearchDL this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        this$0.finish();
    }

    private final void T1() {
        View viewFindViewById = findViewById(R.id.txt_dl_holder_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        l3((TextView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.txt_lic_auth);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        n3((TextView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.txt_vehicle_class);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        q3((TextView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.txt_lic_validity);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        p3((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.txt_lic_authority);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        o3((TextView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.txt_dl_number);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        r3((TextView) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.txt_issue_date);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        m3((TextView) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.owner_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        e3((CircleImageView) viewFindViewById8);
        View viewFindViewById9 = findViewById(R.id.dl_layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        U2((LinearLayout) viewFindViewById9);
        O1().setVisibility(4);
        View viewFindViewById10 = findViewById(R.id.ll_create_dl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        Z2((LinearLayout) viewFindViewById10);
        View viewFindViewById11 = findViewById(R.id.viewChallanLl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        u3((LinearLayout) viewFindViewById11);
        View viewFindViewById12 = findViewById(R.id.nexgenarrow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        d3((LinearLayout) viewFindViewById12);
        View viewFindViewById13 = findViewById(R.id.tv_tap_check_dl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        i3((TextView) viewFindViewById13);
        View viewFindViewById14 = findViewById(R.id.vehicleImpoundLl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        t3((LinearLayout) viewFindViewById14);
        View viewFindViewById15 = findViewById(R.id.transvalidity_tv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
        k3((TextView) viewFindViewById15);
        View viewFindViewById16 = findViewById(R.id.transport_layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "findViewById(...)");
        j3((LinearLayout) viewFindViewById16);
        h2().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zq5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchDL.U1(this.a, view);
            }
        });
        c2().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ar5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchDL.V1(this.a, view);
            }
        });
        Y1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.br5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchDL.W1(this.a, view);
            }
        });
        s2().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cr5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                SearchDL.X1(this.a, view);
            }
        });
    }

    public static final void U1(SearchDL this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (this$0.e2().isShowing()) {
                this$0.e2().dismiss();
            }
            this$0.e2().show();
            String string = Settings.Secure.getString(this$0.getContentResolver(), "android_id");
            ws6 ws6Var = new ws6(this$0);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("dl_no", this$0.P1());
            jSONObject.put("did", string);
            jSONObject.put("mid", ws6Var.l());
            jSONObject.put("tid", ws6Var.e());
            jSONObject.put("recordId", Long.parseLong(ws6Var.k()));
            this$0.f2().i(jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void V1(SearchDL this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void W1(SearchDL this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.L2(this$0, "DL Verification", this$0.P1(), 0);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void X1(SearchDL this$0, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            String strB0 = this$0.M1().B0(this$0.P1());
            Intrinsics.checkNotNullExpressionValue(strB0, "getDocIdByDL(...)");
            if (strB0.equals("0")) {
                this$0.L2(this$0, "Challan DL Verification", this$0.P1(), 1);
            } else {
                Intent intent = new Intent(this$0, (Class<?>) ViewRcChallanActivity.class);
                intent.putExtra("rcNo", StringsKt__StringsKt.trim((CharSequence) this$0.P1()).toString());
                intent.putExtra("type", "DL");
                this$0.startActivity(intent);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void u2(SearchDL this$0, DLWithoutdobModel dLWithoutdobModel) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.e2().dismiss();
        try {
            ag agVar = null;
            if (dLWithoutdobModel.getErrorcd() != 1) {
                if (gd1.a.m(dLWithoutdobModel.getStatusCode())) {
                    this$0.O1().setVisibility(4);
                    this$0.E2(this$0, this$0.Q1());
                    return;
                } else if (StringsKt__StringsJVMKt.equals$default(dLWithoutdobModel.getStatusCode(), "NR090", false, 2, null)) {
                    this$0.O1().setVisibility(4);
                    hz0.a.Q(this$0.Z1(), dLWithoutdobModel.getStatusDesc(), 1);
                    return;
                } else if (StringsKt__StringsJVMKt.equals$default(dLWithoutdobModel.getStatusCode(), "NR091", false, 2, null)) {
                    this$0.O1().setVisibility(4);
                    hz0.a.Q(this$0.Z1(), dLWithoutdobModel.getStatusDesc(), 2);
                    return;
                } else {
                    this$0.O1().setVisibility(4);
                    this$0.E2(this$0, this$0.Q1());
                    return;
                }
            }
            this$0.O1().setVisibility(0);
            this$0.p2().setText(dLWithoutdobModel.getDlobj().getDlLicno());
            this$0.T2(StringsKt__StringsKt.trim((CharSequence) dLWithoutdobModel.getBioObj().getBioDob()).toString());
            this$0.V2(StringsKt__StringsKt.trim((CharSequence) dLWithoutdobModel.getDlobj().getDlLicno().toString()).toString());
            gd1.a aVar = gd1.a;
            if (!aVar.m(dLWithoutdobModel.getDlobj().getDlStatus())) {
                hs1.a aVar2 = hs1.a;
                String dlStatus = dLWithoutdobModel.getDlobj().getDlStatus();
                ag agVar2 = this$0.binding;
                if (agVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    agVar2 = null;
                }
                TextView active = agVar2.b;
                Intrinsics.checkNotNullExpressionValue(active, "active");
                aVar2.d(dlStatus, active, this$0);
            }
            BioImgObj bioImgObj = dLWithoutdobModel.getBioImgObj();
            String biPhoto = bioImgObj != null ? bioImgObj.getBiPhoto() : null;
            if (biPhoto == null || biPhoto.length() == 0) {
                this$0.d2().setImageResource(R.drawable.ic_no_pic);
            } else {
                CircleImageView circleImageViewD2 = this$0.d2();
                BioImgObj bioImgObj2 = dLWithoutdobModel.getBioImgObj();
                circleImageViewD2.setImageBitmap(this$0.J1(bioImgObj2 != null ? bioImgObj2.getBiPhoto() : null));
            }
            Dlobj dlobj = dLWithoutdobModel.getDlobj();
            if (aVar.m(dlobj != null ? dlobj.getDlOldLicno() : null)) {
                ag agVar3 = this$0.binding;
                if (agVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    agVar3 = null;
                }
                agVar3.d.setVisibility(8);
            } else {
                ag agVar4 = this$0.binding;
                if (agVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    agVar4 = null;
                }
                MyTextView myTextView = agVar4.f;
                Dlobj dlobj2 = dLWithoutdobModel.getDlobj();
                myTextView.setText(dlobj2 != null ? dlobj2.getDlOldLicno() : null);
            }
            if (!StringsKt__StringsKt.contains$default((CharSequence) dLWithoutdobModel.toString(), (CharSequence) "bioFullName", false, 2, (Object) null) || dLWithoutdobModel.getBioObj().getBioNatName() == null) {
                this$0.k2().setText("NA");
            } else {
                this$0.k2().setText(hs1.a.b(dLWithoutdobModel.getBioObj().getBioNatName().toString()));
            }
            if (!StringsKt__StringsKt.contains$default((CharSequence) dLWithoutdobModel.toString(), (CharSequence) "dlRtoCode", false, 2, (Object) null) || dLWithoutdobModel.getDlobj().getDlRtoCode() == null) {
                this$0.m2().setText("NA");
            } else {
                this$0.m2().setText(dLWithoutdobModel.getDlobj().getDlRtoCode());
            }
            if (!StringsKt__StringsKt.contains$default((CharSequence) dLWithoutdobModel.toString(), (CharSequence) "dlIssuedt", false, 2, (Object) null) || dLWithoutdobModel.getDlobj().getDlIssuedt() == null) {
                this$0.l2().setText("NA");
            } else {
                this$0.l2().setText(k18.a.i(dLWithoutdobModel.getDlobj().getDlIssuedt()));
            }
            if (!StringsKt__StringsKt.contains$default((CharSequence) dLWithoutdobModel.toString(), (CharSequence) "dlNtValdtoDt", false, 2, (Object) null) || dLWithoutdobModel.getDlobj().getDlNtValdtoDt() == null) {
                this$0.o2().setText("NA");
            } else {
                this$0.o2().setText(k18.a.i(dLWithoutdobModel.getDlobj().getDlNtValdtoDt().toString()));
            }
            if (!StringsKt__StringsKt.contains$default((CharSequence) dLWithoutdobModel.toString(), (CharSequence) "dlTrValdtoDt", false, 2, (Object) null) || dLWithoutdobModel.getDlobj().getDlTrValdtoDt() == null) {
                this$0.i2().setVisibility(8);
            } else {
                this$0.j2().setText(k18.a.i(dLWithoutdobModel.getDlobj().getDlTrValdtoDt().toString()));
            }
            String omRtoFullname = dLWithoutdobModel.getDlobj().getOmRtoFullname();
            if (omRtoFullname == null || omRtoFullname.length() == 0) {
                String olaName = dLWithoutdobModel.getDlobj().getOlaName();
                if (olaName != null && olaName.length() != 0) {
                    this$0.n2().setText(dLWithoutdobModel.getDlobj().getOlaName());
                }
            } else {
                this$0.n2().setText(dLWithoutdobModel.getDlobj().getOmRtoFullname());
            }
            if (this$0.M1().P(dLWithoutdobModel.getDlobj().getDlLicno()) == 0) {
                BioImgObj bioImgObj3 = dLWithoutdobModel.getBioImgObj();
                if ((bioImgObj3 != null ? bioImgObj3.getBiPhoto() : null) != null) {
                    DatabaseHelper databaseHelperM1 = this$0.M1();
                    String dlLicno = dLWithoutdobModel.getDlobj().getDlLicno();
                    String bioFullName = dLWithoutdobModel.getBioObj().getBioFullName();
                    String str = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
                    BioImgObj bioImgObj4 = dLWithoutdobModel.getBioImgObj();
                    databaseHelperM1.S0(dlLicno, bioFullName, "DL", str, bioImgObj4 != null ? bioImgObj4.getBiPhoto() : null);
                } else {
                    this$0.M1().S0(dLWithoutdobModel.getDlobj().getDlLicno(), dLWithoutdobModel.getBioObj().getBioFullName(), "DL", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()), "");
                }
            } else {
                this$0.M1().N0(dLWithoutdobModel.getDlobj().getDlLicno(), new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()), dLWithoutdobModel.getBioObj().getBioFullName());
            }
            try {
                String str2 = "";
                List<Dlcov> dlcovs = dLWithoutdobModel.getDlcovs();
                int size = dlcovs.size();
                for (int i2 = 0; i2 < size; i2++) {
                    str2 = str2 + dlcovs.get(i2).getCovabbrv() + ", ";
                }
                if (gd1.a.m(str2)) {
                    ag agVar5 = this$0.binding;
                    if (agVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        agVar = agVar5;
                    }
                    agVar.G.setVisibility(8);
                    return;
                }
                ag agVar6 = this$0.binding;
                if (agVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    agVar = agVar6;
                }
                MyTextView myTextView2 = agVar.L;
                String strSubstring = StringsKt__StringsKt.trim((CharSequence) str2).toString().substring(0, str2.length() - 2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                myTextView2.setText(strSubstring);
            } catch (Exception unused) {
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            this$0.O1().setVisibility(4);
            this$0.E2(this$0, this$0.Q1());
        }
    }

    public static final void v2(SearchDL this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.e2().dismiss();
        this$0.O1().setVisibility(4);
        this$0.E2(this$0, this$0.Q1());
    }

    public static final void w2(SearchDL this$0, DLServiceResponseModleV1 dLServiceResponseModleV1) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.e2().dismiss();
        try {
            if (dLServiceResponseModleV1.getDldetobj().get(0).getErrorcd() == 0) {
                this$0.X2(dLServiceResponseModleV1.getDldetobj().get(0));
                this$0.H1(this$0.Z1(), this$0.g2().b(va3.a.k(), "Virtual DL Successfully Created!"), this$0.P1(), this$0.R1(), this$0.S1());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            this$0.O1().setVisibility(4);
            this$0.Q2(this$0.Z1(), this$0.g2().b("no_details", "No Details are available."));
        }
    }

    public static final void x2(SearchDL this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.e2().dismiss();
        this$0.O1().setVisibility(4);
        this$0.Q2(this$0.Z1(), this$0.g2().b("no_details", "No Details are available."));
    }

    public static final void y2(SearchDL this$0, DLServiceResponseModleV1 dLServiceResponseModleV1) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.e2().dismiss();
        try {
            if (dLServiceResponseModleV1.getDldetobj().get(0).getErrorcd() != 0) {
                this$0.O1().setVisibility(4);
                if (dLServiceResponseModleV1.getDldetobj().get(0).getErrorcd() == -2) {
                    this$0.Q2(this$0.Z1(), this$0.g2().b("kindly_etner_correct_details", "Kindly enter correct details"));
                    return;
                } else {
                    this$0.Q2(this$0.Z1(), this$0.g2().b("no_details", "No Details are available."));
                    return;
                }
            }
            this$0.O1().setVisibility(0);
            this$0.p2().setText(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlLicno());
            this$0.T2(StringsKt__StringsKt.trim((CharSequence) dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioDob()).toString());
            this$0.V2(StringsKt__StringsKt.trim((CharSequence) dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlLicno().toString()).toString());
            BioImgObjX bioImgObj = dLServiceResponseModleV1.getDldetobj().get(0).getBioImgObj();
            String biPhoto = bioImgObj != null ? bioImgObj.getBiPhoto() : null;
            if (biPhoto == null || biPhoto.length() == 0) {
                this$0.d2().setImageResource(R.drawable.ic_no_pic);
            } else {
                CircleImageView circleImageViewD2 = this$0.d2();
                BioImgObjX bioImgObj2 = dLServiceResponseModleV1.getDldetobj().get(0).getBioImgObj();
                circleImageViewD2.setImageBitmap(this$0.J1(bioImgObj2 != null ? bioImgObj2.getBiPhoto() : null));
            }
            if (!StringsKt__StringsKt.contains$default((CharSequence) dLServiceResponseModleV1.toString(), (CharSequence) "bioFullName", false, 2, (Object) null) || dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioNatName() == null) {
                this$0.k2().setText("NA");
            } else {
                this$0.k2().setText(hs1.a.b(dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioNatName().toString()));
            }
            if (!StringsKt__StringsKt.contains$default((CharSequence) dLServiceResponseModleV1.toString(), (CharSequence) "dlRtoCode", false, 2, (Object) null) || dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlRtoCode() == null) {
                this$0.m2().setText("NA");
            } else {
                this$0.m2().setText(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlRtoCode());
            }
            if (!StringsKt__StringsKt.contains$default((CharSequence) dLServiceResponseModleV1.toString(), (CharSequence) "dlIssuedt", false, 2, (Object) null) || dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlIssuedt() == null) {
                this$0.l2().setText("NA");
            } else {
                this$0.l2().setText(k18.a.i(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlIssuedt()));
            }
            if (!StringsKt__StringsKt.contains$default((CharSequence) dLServiceResponseModleV1.toString(), (CharSequence) "dlNtValdtoDt", false, 2, (Object) null) || dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlNtValdtoDt() == null) {
                this$0.o2().setText("NA");
            } else {
                this$0.o2().setText(k18.a.i(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlNtValdtoDt().toString()));
            }
            String omRtoFullname = dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getOmRtoFullname();
            if (omRtoFullname == null || omRtoFullname.length() == 0) {
                String olaName = dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getOlaName();
                if (olaName != null && olaName.length() != 0) {
                    this$0.n2().setText(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getOlaName());
                }
            } else {
                this$0.n2().setText(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getOmRtoFullname());
            }
            if (this$0.M1().P(dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioDlno()) != 0) {
                this$0.M1().N0(dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioDlno(), new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()), dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioFullName());
                return;
            }
            BioImgObjX bioImgObj3 = dLServiceResponseModleV1.getDldetobj().get(0).getBioImgObj();
            if ((bioImgObj3 != null ? bioImgObj3.getBiPhoto() : null) == null) {
                this$0.M1().S0(dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioDlno(), dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioFullName(), "DL", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()), "");
                return;
            }
            DatabaseHelper databaseHelperM1 = this$0.M1();
            String bioDlno = dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioDlno();
            String bioFullName = dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioFullName();
            String str = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
            BioImgObjX bioImgObj4 = dLServiceResponseModleV1.getDldetobj().get(0).getBioImgObj();
            databaseHelperM1.S0(bioDlno, bioFullName, "DL", str, bioImgObj4 != null ? bioImgObj4.getBiPhoto() : null);
        } catch (Exception e2) {
            e2.printStackTrace();
            this$0.O1().setVisibility(4);
            this$0.Q2(this$0.Z1(), this$0.g2().b("no_details", "No Details are available."));
        }
    }

    public static final void z2(SearchDL this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.e2().dismiss();
        this$0.O1().setVisibility(4);
        this$0.Q2(this$0.Z1(), this$0.g2().b("no_details", "No Details are available."));
    }

    public final void E2(Context context, String dl_number) {
        Intrinsics.checkNotNullParameter(dl_number, "dl_number");
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.mvvm_dl_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Window window2 = dialog.getWindow();
        Intrinsics.checkNotNull(window2);
        window2.setLayout(-1, -2);
        View viewFindViewById = dialog.findViewById(R.id.verify_card);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        View viewFindViewById2 = dialog.findViewById(R.id.cancel);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        View viewFindViewById3 = dialog.findViewById(R.id.applicant_year);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText = (EditText) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.applicant_month);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText2 = (EditText) viewFindViewById4;
        View viewFindViewById5 = dialog.findViewById(R.id.applicant_date);
        Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText3 = (EditText) viewFindViewById5;
        View viewFindViewById6 = dialog.findViewById(R.id.dob_cal);
        Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.ImageView");
        View viewFindViewById7 = dialog.findViewById(R.id.head);
        Intrinsics.checkNotNull(viewFindViewById7, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById8 = dialog.findViewById(R.id.verify_text_view);
        Intrinsics.checkNotNull(viewFindViewById8, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById9 = dialog.findViewById(R.id.cancle_txt);
        Intrinsics.checkNotNull(viewFindViewById9, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById7).setText(g2().b(va3.a.X0(), "Verify your DL"));
        ((TextView) viewFindViewById8).setText(g2().b("vahan_btn_verify", "Verify"));
        ((TextView) viewFindViewById9).setText(g2().b("button_cancel", "Cancel"));
        View viewFindViewById10 = dialog.findViewById(R.id.dob_badge);
        Intrinsics.checkNotNull(viewFindViewById10, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById10).setText(g2().b("edit_dl_serv_dob", "Please Enter Date of Birth"));
        ((ImageView) viewFindViewById6).setOnClickListener(new f(new k(editText3, editText2, editText)));
        editText3.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zepto.vq5
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return SearchDL.F2(textView, i2, keyEvent);
            }
        });
        editText3.addTextChangedListener(new g(editText2));
        editText3.addTextChangedListener(new h(editText3, editText2));
        editText2.addTextChangedListener(new i(editText));
        editText2.setOnKeyListener(new View.OnKeyListener() { // from class: com.zepto.wq5
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                return SearchDL.G2(editText2, editText3, view, i2, keyEvent);
            }
        });
        editText2.addTextChangedListener(new j(editText2, editText));
        ((CardView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xq5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchDL.H2(dialog, this, view);
            }
        });
        ((CardView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yq5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchDL.I2(this.a, editText, editText2, editText3, dialog, view);
            }
        });
        dialog.show();
    }

    public final void H1(Context context, String message, final String doc_number, final DldetobjX dlobj, final String doc_id) {
        Intrinsics.checkNotNullParameter(dlobj, "dlobj");
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCancelable(false);
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
        ((TextView) viewFindViewById3).setText(g2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(g2().b("btn_ok", "OK"));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fr5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchDL.I1(dialog, this, doc_number, dlobj, doc_id, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.d65
    public void I(String searchNumber) {
    }

    public final Bitmap J1(String encodedImage) {
        try {
            byte[] bArrDecode = android.util.Base64.decode(encodedImage, 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final void J2(Context context, String message) {
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
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById4).setText(g2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(g2().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dr5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchDL.K2(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: renamed from: K1, reason: from getter */
    public final Calendar getCal() {
        return this.cal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    public final void L1(String dl) {
        Intrinsics.checkNotNullParameter(dl, "dl");
        String string = Settings.Secure.getString(getContentResolver(), "android_id");
        ws6 ws6Var = new ws6(this);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = String.valueOf(System.currentTimeMillis());
        DlService dlServiceA = DlService.INSTANCE.a(Z1());
        lc5.a aVar = lc5.Companion;
        ls3 ls3VarB = ls3.g.b("application/json");
        hs1.a aVar2 = hs1.a;
        Context contextZ1 = Z1();
        Intrinsics.checkNotNull(string);
        String string2 = aVar2.c(dl, null, contextZ1, string, ws6Var.l()).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        dlServiceA.getDlDetailsForRecentSearch(s14.a.u() + APIController.a().GetLicenceDetails(), aVar.d(ls3VarB, string2), (String) objectRef.element).enqueue(new a(objectRef, this, dl));
    }

    public final void L2(Context context, final String message, final String dl_number, final int forChallan) {
        Intrinsics.checkNotNullParameter(dl_number, "dl_number");
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.mvvm_dl_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Window window2 = dialog.getWindow();
        Intrinsics.checkNotNull(window2);
        window2.setLayout(-1, -2);
        View viewFindViewById = dialog.findViewById(R.id.verify_card);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        CardView cardView = (CardView) viewFindViewById;
        View viewFindViewById2 = dialog.findViewById(R.id.cancel);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        View viewFindViewById3 = dialog.findViewById(R.id.applicant_year);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText = (EditText) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.applicant_month);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText2 = (EditText) viewFindViewById4;
        View viewFindViewById5 = dialog.findViewById(R.id.applicant_date);
        Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText3 = (EditText) viewFindViewById5;
        View viewFindViewById6 = dialog.findViewById(R.id.dob_cal);
        Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.ImageView");
        View viewFindViewById7 = dialog.findViewById(R.id.head);
        Intrinsics.checkNotNull(viewFindViewById7, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById8 = dialog.findViewById(R.id.verify_text_view);
        Intrinsics.checkNotNull(viewFindViewById8, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById9 = dialog.findViewById(R.id.cancle_txt);
        Intrinsics.checkNotNull(viewFindViewById9, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById7).setText(g2().b(va3.a.X0(), "Verify your DL"));
        ((TextView) viewFindViewById8).setText(g2().b("vahan_btn_verify", "Verify"));
        ((TextView) viewFindViewById9).setText(g2().b("button_cancel", "Cancel"));
        View viewFindViewById10 = dialog.findViewById(R.id.dob_badge);
        Intrinsics.checkNotNull(viewFindViewById10, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById10).setText(g2().b("edit_dl_serv_dob", "Please Enter Date of Birth"));
        ((ImageView) viewFindViewById6).setOnClickListener(new l(new q(editText3, editText2, editText)));
        editText3.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zepto.gr5
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return SearchDL.M2(textView, i2, keyEvent);
            }
        });
        editText3.addTextChangedListener(new m(editText2));
        editText3.addTextChangedListener(new n(editText3, editText2));
        editText2.addTextChangedListener(new o(editText));
        editText2.setOnKeyListener(new View.OnKeyListener() { // from class: com.zepto.hr5
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                return SearchDL.N2(editText2, editText3, view, i2, keyEvent);
            }
        });
        editText2.addTextChangedListener(new p(editText2, editText));
        ((CardView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ir5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchDL.O2(dialog, view);
            }
        });
        cardView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jr5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchDL.P2(message, this, editText, editText2, editText3, forChallan, dialog, dl_number, view);
            }
        });
        dialog.show();
    }

    public final DatabaseHelper M1() {
        DatabaseHelper databaseHelper = this.databaseHelper;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("databaseHelper");
        return null;
    }

    public final String N1() {
        String str = this.dateValeMain;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dateValeMain");
        return null;
    }

    public final LinearLayout O1() {
        LinearLayout linearLayout = this.dl_layout;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dl_layout");
        return null;
    }

    public final String P1() {
        String str = this.dl_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dl_number");
        return null;
    }

    public final String Q1() {
        String str = this.dl_number_intent;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dl_number_intent");
        return null;
    }

    public final void Q2(Context context, String message) {
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
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(g2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(g2().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uq5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchDL.R2(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final DldetobjX R1() {
        DldetobjX dldetobjX = this.dlobjx;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlobjx");
        return null;
    }

    public final String S1() {
        String str = this.doc_id;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("doc_id");
        return null;
    }

    public final void S2(DatabaseHelper databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "<set-?>");
        this.databaseHelper = databaseHelper;
    }

    public final void T2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dateValeMain = str;
    }

    public final void U2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.dl_layout = linearLayout;
    }

    public final void V2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dl_number = str;
    }

    public final void W2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dl_number_intent = str;
    }

    public final void X2(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dlobjx = dldetobjX;
    }

    public final LinearLayout Y1() {
        LinearLayout linearLayout = this.ll_create_dl;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ll_create_dl");
        return null;
    }

    public final void Y2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.doc_id = str;
    }

    public final Context Z1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final void Z2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.ll_create_dl = linearLayout;
    }

    public final DlService a2() {
        DlService dlService = this.mDlService;
        if (dlService != null) {
            return dlService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDlService");
        return null;
    }

    public final void a3(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final is1 b2() {
        is1 is1Var = this.mDlViewModel;
        if (is1Var != null) {
            return is1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDlViewModel");
        return null;
    }

    public final void b3(DlService dlService) {
        Intrinsics.checkNotNullParameter(dlService, "<set-?>");
        this.mDlService = dlService;
    }

    public final LinearLayout c2() {
        LinearLayout linearLayout = this.nexgenarrow;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nexgenarrow");
        return null;
    }

    public final void c3(is1 is1Var) {
        Intrinsics.checkNotNullParameter(is1Var, "<set-?>");
        this.mDlViewModel = is1Var;
    }

    public final CircleImageView d2() {
        CircleImageView circleImageView = this.owner_image;
        if (circleImageView != null) {
            return circleImageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("owner_image");
        return null;
    }

    public final void d3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.nexgenarrow = linearLayout;
    }

    public final ProgressDialog e2() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final void e3(CircleImageView circleImageView) {
        Intrinsics.checkNotNullParameter(circleImageView, "<set-?>");
        this.owner_image = circleImageView;
    }

    public final o45 f2() {
        o45 o45Var = this.rcImpoundModel;
        if (o45Var != null) {
            return o45Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcImpoundModel");
        return null;
    }

    public final void f3(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final wa3 g2() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final void g3(o45 o45Var) {
        Intrinsics.checkNotNullParameter(o45Var, "<set-?>");
        this.rcImpoundModel = o45Var;
    }

    public final TextView h2() {
        TextView textView = this.tap_to_dl_impound;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tap_to_dl_impound");
        return null;
    }

    public final void h3(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final LinearLayout i2() {
        LinearLayout linearLayout = this.transport_layout;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transport_layout");
        return null;
    }

    public final void i3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tap_to_dl_impound = textView;
    }

    public final TextView j2() {
        TextView textView = this.transvalidity_tv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transvalidity_tv");
        return null;
    }

    public final void j3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.transport_layout = linearLayout;
    }

    public final TextView k2() {
        TextView textView = this.txtDlHolderName;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtDlHolderName");
        return null;
    }

    public final void k3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.transvalidity_tv = textView;
    }

    public final TextView l2() {
        TextView textView = this.txtIssueDate;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtIssueDate");
        return null;
    }

    public final void l3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtDlHolderName = textView;
    }

    public final TextView m2() {
        TextView textView = this.txtLicAuthCode;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtLicAuthCode");
        return null;
    }

    public final void m3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtIssueDate = textView;
    }

    public final TextView n2() {
        TextView textView = this.txtLicAuthority;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtLicAuthority");
        return null;
    }

    public final void n3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtLicAuthCode = textView;
    }

    public final TextView o2() {
        TextView textView = this.txtLicValidityCode;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtLicValidityCode");
        return null;
    }

    public final void o3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtLicAuthority = textView;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ag agVarC = ag.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(agVarC, "inflate(...)");
        this.binding = agVarC;
        if (agVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            agVarC = null;
        }
        setContentView(agVarC.b());
        ta3.a aVar = ta3.a;
        ag agVar = this.binding;
        if (agVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            agVar = null;
        }
        aVar.M1(this, agVar);
        a3(this);
        h3(new wa3(Z1()));
        s3(new ws6(this));
        DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(Z1());
        Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
        S2(databaseHelperD0);
        b3(DlService.INSTANCE.a(Z1()));
        this.rcImpoundService = RcImpoundService.INSTANCE.a(Z1());
        W2(String.valueOf(getIntent().getStringExtra("DLNumber")));
        T1();
        f3(new ProgressDialog(Z1()));
        e2().setMessage(g2().b("label_challan_please_wait", "Please wait..."));
        e2().setCancelable(false);
        e2().setCanceledOnTouchOutside(false);
        this.retrofitService = SignService.INSTANCE.a(this);
        c3((is1) new z(this, new js1(new jp1(a2()))).a(is1.class));
        RcImpoundService rcImpoundService = this.rcImpoundService;
        if (rcImpoundService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rcImpoundService");
            rcImpoundService = null;
        }
        g3((o45) new z(this, new q45(new p45(rcImpoundService))).a(o45.class));
        SignService signService = this.retrofitService;
        if (signService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            signService = null;
        }
        v3((p26) new z(this, new a26(new c26(signService))).a(p26.class));
        String strQ1 = Q1();
        if (strQ1 != null && strQ1.length() != 0) {
            e2().show();
            b2().D(Q1(), null, Z1());
        }
        b2().z().g(this, new mf4() { // from class: com.zepto.tq5
            @Override // com.zepto.mf4
            public final void a(Object obj) throws Throwable {
                SearchDL.u2(this.a, (DLWithoutdobModel) obj);
            }
        });
        b2().A().g(this, new mf4() { // from class: com.zepto.er5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SearchDL.v2(this.a, (String) obj);
            }
        });
        b2().v().g(this, new mf4() { // from class: com.zepto.kr5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SearchDL.w2(this.a, (DLServiceResponseModleV1) obj);
            }
        });
        b2().w().g(this, new mf4() { // from class: com.zepto.lr5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SearchDL.x2(this.a, (String) obj);
            }
        });
        b2().t().g(this, new mf4() { // from class: com.zepto.mr5
            @Override // com.zepto.mf4
            public final void a(Object obj) throws Throwable {
                SearchDL.y2(this.a, (DLServiceResponseModleV1) obj);
            }
        });
        b2().u().g(this, new mf4() { // from class: com.zepto.nr5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SearchDL.z2(this.a, (String) obj);
            }
        });
        f2().h().g(this, new r(new d()));
        f2().g().g(this, new r(new e()));
        t2().u().g(this, new mf4() { // from class: com.zepto.or5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SearchDL.A2(this.a, (SendOtpResult) obj);
            }
        });
        t2().t().g(this, new mf4() { // from class: com.zepto.pr5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SearchDL.B2(this.a, (String) obj);
            }
        });
        t2().x().g(this, new mf4() { // from class: com.zepto.qr5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SearchDL.C2(this.a, (CitzValidDoc) obj);
            }
        });
        t2().k().g(this, new mf4() { // from class: com.zepto.rr5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SearchDL.D2(this.a, (String) obj);
            }
        });
        t2().A().g(this, new r(new b()));
        t2().z().g(this, new r(new c()));
    }

    public final TextView p2() {
        TextView textView = this.txt_dl_number;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txt_dl_number");
        return null;
    }

    public final void p3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtLicValidityCode = textView;
    }

    public final ws6 q2() {
        ws6 ws6Var = this.userSessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userSessionManager");
        return null;
    }

    public final void q3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtVehicleClass = textView;
    }

    public final LinearLayout r2() {
        LinearLayout linearLayout = this.vehicleImpoundLl;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vehicleImpoundLl");
        return null;
    }

    public final void r3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txt_dl_number = textView;
    }

    public final LinearLayout s2() {
        LinearLayout linearLayout = this.viewChallanLl;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewChallanLl");
        return null;
    }

    public final void s3(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.userSessionManager = ws6Var;
    }

    public final p26 t2() {
        p26 p26Var = this.viewModel;
        if (p26Var != null) {
            return p26Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void t3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.vehicleImpoundLl = linearLayout;
    }

    @Override // com.zepto.d65
    public void u(String searchNumber) {
        if (searchNumber != null) {
            e2().show();
            L1(searchNumber);
        }
    }

    public final void u3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.viewChallanLl = linearLayout;
    }

    public final void v3(p26 p26Var) {
        Intrinsics.checkNotNullParameter(p26Var, "<set-?>");
        this.viewModel = p26Var;
    }
}
