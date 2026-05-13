package com.nic.mparivahan.DLServicesAuth.View;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.nic.mparivahan.Account.Model.OtpVerifyResult;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.DLServicesAuth.CheckEligibility.FromEligCheck;
import com.nic.mparivahan.DLServicesAuth.Model.CustomState.CustomState;
import com.nic.mparivahan.DLServicesAuth.Model.RTO.DlLastRtoDetailsDto;
import com.nic.mparivahan.DLServicesAuth.Model.ServiceCheckPojo;
import com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithMobile;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.DlCombineServices.CombineReq;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName;
import com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity;
import com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity;
import com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity;
import com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity;
import com.nic.mparivahan.dlservices.ui.hillService.HillReligion;
import com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity;
import com.nic.mparivahan.dlservices.ui.mobileupdate.SarathiMobileUpdateActivity;
import com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity;
import com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.sarathithreeservices.adharmobile.MobUpdateAdhar;
import com.zepto.cf2;
import com.zepto.df2;
import com.zepto.ef2;
import com.zepto.lr1;
import com.zepto.mf4;
import com.zepto.mt6;
import com.zepto.nr1;
import com.zepto.o40;
import com.zepto.op5;
import com.zepto.rq1;
import com.zepto.s14;
import com.zepto.ta3;
import com.zepto.tx3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.ws6;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0002\u008b\u0002B\t¢\u0006\u0006\b\u0089\u0002\u0010\u008a\u0002J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\f\u001a\u00020\bH\u0002J>\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\bH\u0002J\b\u0010\u0013\u001a\u00020\bH\u0002J\u0012\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0017\u001a\u00020\bH\u0014J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004J\u0016\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0004R\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010<\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010@\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00107\u001a\u0004\b>\u00109\"\u0004\b?\u0010;R$\u0010D\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u00107\u001a\u0004\bB\u00109\"\u0004\bC\u0010;R\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010\\\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010d\u001a\u00020]8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010l\u001a\u00020e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010t\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR2\u0010|\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040u8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R'\u0010\u0084\u0001\u001a\u00020}8\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R&\u0010\u0088\u0001\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0085\u0001\u00107\u001a\u0005\b\u0086\u0001\u00109\"\u0005\b\u0087\u0001\u0010;R&\u0010\u008c\u0001\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0089\u0001\u00107\u001a\u0005\b\u008a\u0001\u00109\"\u0005\b\u008b\u0001\u0010;R&\u0010\u0090\u0001\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008d\u0001\u00107\u001a\u0005\b\u008e\u0001\u00109\"\u0005\b\u008f\u0001\u0010;R&\u0010\u0094\u0001\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0091\u0001\u00107\u001a\u0005\b\u0092\u0001\u00109\"\u0005\b\u0093\u0001\u0010;R&\u0010\u0098\u0001\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0095\u0001\u00107\u001a\u0005\b\u0096\u0001\u00109\"\u0005\b\u0097\u0001\u0010;R&\u0010\u009c\u0001\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0099\u0001\u00107\u001a\u0005\b\u009a\u0001\u00109\"\u0005\b\u009b\u0001\u0010;R&\u0010 \u0001\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009d\u0001\u00107\u001a\u0005\b\u009e\u0001\u00109\"\u0005\b\u009f\u0001\u0010;R*\u0010¨\u0001\u001a\u00030¡\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R*\u0010¬\u0001\u001a\u00030¡\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b©\u0001\u0010£\u0001\u001a\u0006\bª\u0001\u0010¥\u0001\"\u0006\b«\u0001\u0010§\u0001R*\u0010´\u0001\u001a\u00030\u00ad\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001R*\u0010¸\u0001\u001a\u00030\u00ad\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bµ\u0001\u0010¯\u0001\u001a\u0006\b¶\u0001\u0010±\u0001\"\u0006\b·\u0001\u0010³\u0001R&\u0010¼\u0001\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¹\u0001\u00107\u001a\u0005\bº\u0001\u00109\"\u0005\b»\u0001\u0010;R*\u0010Ä\u0001\u001a\u00030½\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÅ\u0001\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001\"\u0006\bÉ\u0001\u0010Ê\u0001R/\u0010Î\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bË\u0001\u0010Æ\u0001\u001a\u0006\bÌ\u0001\u0010È\u0001\"\u0006\bÍ\u0001\u0010Ê\u0001R/\u0010Ò\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÏ\u0001\u0010Æ\u0001\u001a\u0006\bÐ\u0001\u0010È\u0001\"\u0006\bÑ\u0001\u0010Ê\u0001R&\u0010Ö\u0001\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÓ\u0001\u00107\u001a\u0005\bÔ\u0001\u00109\"\u0005\bÕ\u0001\u0010;R*\u0010Ý\u0001\u001a\u00030×\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bØ\u0001\u0010\u009d\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001\"\u0006\bÛ\u0001\u0010Ü\u0001R*\u0010å\u0001\u001a\u00030Þ\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bß\u0001\u0010à\u0001\u001a\u0006\bá\u0001\u0010â\u0001\"\u0006\bã\u0001\u0010ä\u0001R*\u0010í\u0001\u001a\u00030æ\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bç\u0001\u0010è\u0001\u001a\u0006\bé\u0001\u0010ê\u0001\"\u0006\bë\u0001\u0010ì\u0001R)\u0010ô\u0001\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bî\u0001\u0010ï\u0001\u001a\u0006\bð\u0001\u0010ñ\u0001\"\u0006\bò\u0001\u0010ó\u0001R*\u0010ü\u0001\u001a\u00030õ\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bö\u0001\u0010÷\u0001\u001a\u0006\bø\u0001\u0010ù\u0001\"\u0006\bú\u0001\u0010û\u0001R&\u0010\u0080\u0002\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bý\u0001\u00107\u001a\u0005\bþ\u0001\u00109\"\u0005\bÿ\u0001\u0010;R&\u0010\u0084\u0002\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0081\u0002\u00107\u001a\u0005\b\u0082\u0002\u00109\"\u0005\b\u0083\u0002\u0010;R/\u0010\u0088\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0085\u0002\u0010Æ\u0001\u001a\u0006\b\u0086\u0002\u0010È\u0001\"\u0006\b\u0087\u0002\u0010Ê\u0001¨\u0006\u008c\u0002"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/View/SarthiProcessWithMobile;", "Lcom/zepto/o40;", "Landroid/content/Intent;", "intent", "", "lastEndRTO", "lastEndState", "purCode", "", "G2", "message", "e3", "g3", "Ljava/util/ArrayList;", "multiList", "", "serialNo", "H2", "b3", "g2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "fdate", "f2", "Landroid/content/Context;", "context", "mobile_no", "N3", "Lcom/zepto/op5;", "F", "Lcom/zepto/op5;", "i2", "()Lcom/zepto/op5;", "m3", "(Lcom/zepto/op5;)V", "binding", "Lcom/zepto/nr1;", "G", "Lcom/zepto/nr1;", "m2", "()Lcom/zepto/nr1;", "p3", "(Lcom/zepto/nr1;)V", "dlServicesViewModel", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "H", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "A2", "()Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "I3", "(Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;)V", "retrofitService", "I", "Ljava/lang/String;", "getDlNo", "()Ljava/lang/String;", "setDlNo", "(Ljava/lang/String;)V", "dlNo", "J", "getDob", "setDob", "dob", "K", "getRecord_id", "G3", "record_id", "Landroid/widget/EditText;", "L", "Landroid/widget/EditText;", "getMob_number", "()Landroid/widget/EditText;", "y3", "(Landroid/widget/EditText;)V", "mob_number", "Landroid/widget/Button;", "M", "Landroid/widget/Button;", "getReset_button", "()Landroid/widget/Button;", "H3", "(Landroid/widget/Button;)V", "reset_button", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "N", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "l2", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "o3", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "dlDetails", "Landroid/app/ProgressDialog;", "O", "Landroid/app/ProgressDialog;", "w2", "()Landroid/app/ProgressDialog;", "C3", "(Landroid/app/ProgressDialog;)V", "pDialog", "Landroid/widget/LinearLayout;", "P", "Landroid/widget/LinearLayout;", "getLl_home", "()Landroid/widget/LinearLayout;", "t3", "(Landroid/widget/LinearLayout;)V", "ll_home", "Lcom/zepto/ws6;", "Q", "Lcom/zepto/ws6;", "C2", "()Lcom/zepto/ws6;", "K3", "(Lcom/zepto/ws6;)V", "sessionManager", "Ljava/util/HashMap;", "R", "Ljava/util/HashMap;", "getWhatServiceRequired", "()Ljava/util/HashMap;", "setWhatServiceRequired", "(Ljava/util/HashMap;)V", "whatServiceRequired", "Lcom/zepto/wl5;", "S", "Lcom/zepto/wl5;", "B2", "()Lcom/zepto/wl5;", "J3", "(Lcom/zepto/wl5;)V", "sarthiSession", "T", "j2", "setBioRecGenesis", "bioRecGenesis", "U", "getLastEndorseRtoCode", "setLastEndorseRtoCode", "lastEndorseRtoCode", "V", "getLastEndorseStateCode", "setLastEndorseStateCode", "lastEndorseStateCode", "W", "getLastEndorsedState", "setLastEndorsedState", "lastEndorsedState", "X", "getLastEndorsedRTO", "setLastEndorsedRTO", "lastEndorsedRTO", "Y", "D2", "setState_value", "state_value", "Z", "getMobNo", "x3", "mobNo", "Landroid/widget/ProgressBar;", "a0", "Landroid/widget/ProgressBar;", "x2", "()Landroid/widget/ProgressBar;", "D3", "(Landroid/widget/ProgressBar;)V", "pb_pwm", "b0", "y2", "E3", "pr_pwm", "Landroid/widget/TextView;", "c0", "Landroid/widget/TextView;", "F2", "()Landroid/widget/TextView;", "M3", "(Landroid/widget/TextView;)V", "txt_reset", "d0", "E2", "L3", "submitOtp", "e0", "h2", "setAllowAddrChangeAtDlservReqst", "allowAddrChangeAtDlservReqst", "Lcom/zepto/wa3;", "f0", "Lcom/zepto/wa3;", "n2", "()Lcom/zepto/wa3;", "r3", "(Lcom/zepto/wa3;)V", "langSession", "g0", "Ljava/util/ArrayList;", "t2", "()Ljava/util/ArrayList;", "z3", "(Ljava/util/ArrayList;)V", "h0", "v2", "B3", "multiListName", "i0", "u2", "A3", "multiListCode", "j0", "getServiceSelect", "setServiceSelect", "serviceSelect", "", "k0", "k2", "()Z", "n3", "(Z)V", "COA", "Lcom/zepto/ef2;", "l0", "Lcom/zepto/ef2;", "q2", "()Lcom/zepto/ef2;", "v3", "(Lcom/zepto/ef2;)V", "mFormEligVM", "Lcom/nic/mparivahan/DLServicesAuth/CheckEligibility/FromEligCheck;", "m0", "Lcom/nic/mparivahan/DLServicesAuth/CheckEligibility/FromEligCheck;", "r2", "()Lcom/nic/mparivahan/DLServicesAuth/CheckEligibility/FromEligCheck;", "w3", "(Lcom/nic/mparivahan/DLServicesAuth/CheckEligibility/FromEligCheck;)V", "mFormsInterface", "n0", "Landroid/content/Context;", "p2", "()Landroid/content/Context;", "u3", "(Landroid/content/Context;)V", "mContext", "Lcom/nic/mparivahan/dlservices/widget/CustomWegetLayout;", "o0", "Lcom/nic/mparivahan/dlservices/widget/CustomWegetLayout;", "z2", "()Lcom/nic/mparivahan/dlservices/widget/CustomWegetLayout;", "F3", "(Lcom/nic/mparivahan/dlservices/widget/CustomWegetLayout;)V", "Proceed", "p0", "s2", "setMultiCheck", "multiCheck", "q0", "getFlag", "q3", "flag", "r0", "o2", "s3", "listHeaderSteps", "<init>", "()V", "a", "app_release"}, k = 1, mv = {1, 9, 0})
public final class SarthiProcessWithMobile extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public op5 binding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public nr1 dlServicesViewModel;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public DlServiceInt retrofitService;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String dlNo;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String dob;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String record_id;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public EditText mob_number;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public Button reset_button;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public DldetobjX dlDetails;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public LinearLayout ll_home;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public ProgressBar pb_pwm;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public ProgressBar pr_pwm;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public TextView txt_reset;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public TextView submitOtp;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public ArrayList multiList;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public ArrayList multiListName;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public ArrayList multiListCode;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public boolean COA;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public ef2 mFormEligVM;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public FromEligCheck mFormsInterface;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public CustomWegetLayout Proceed;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public ArrayList listHeaderSteps;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public HashMap whatServiceRequired = new HashMap();

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String bioRecGenesis = "";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String lastEndorseRtoCode = "";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String lastEndorseStateCode = "";

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String lastEndorsedState = "";

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String lastEndorsedRTO = "";

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String state_value = "";

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String mobNo = "";

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public String allowAddrChangeAtDlservReqst = "allowAddrChange";

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public String serviceSelect = "";

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public String multiCheck = "valid";

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public String flag = "";

    public final class a extends RecyclerView.h {
        public ArrayList d;
        public final /* synthetic */ SarthiProcessWithMobile e;

        /* JADX INFO: renamed from: com.nic.mparivahan.DLServicesAuth.View.SarthiProcessWithMobile$a$a, reason: collision with other inner class name */
        public final class C0048a extends RecyclerView.d0 {
            public final CheckBox u;
            public final TextView v;
            public final ImageView w;
            public final LinearLayout x;
            public final /* synthetic */ a y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0048a(a aVar, View ItemView) {
                super(ItemView);
                Intrinsics.checkNotNullParameter(ItemView, "ItemView");
                this.y = aVar;
                View viewFindViewById = this.a.findViewById(R.id.service_check_box);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                this.u = (CheckBox) viewFindViewById;
                View viewFindViewById2 = this.a.findViewById(R.id.service_txt);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                this.v = (TextView) viewFindViewById2;
                View viewFindViewById3 = this.a.findViewById(R.id.rightStatePin);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
                this.w = (ImageView) viewFindViewById3;
                View viewFindViewById4 = this.a.findViewById(R.id.multi_layout);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
                this.x = (LinearLayout) viewFindViewById4;
            }

            public final LinearLayout O() {
                return this.x;
            }

            public final ImageView P() {
                return this.w;
            }

            public final TextView Q() {
                return this.v;
            }
        }

        public a(SarthiProcessWithMobile sarthiProcessWithMobile, ArrayList mList) {
            Intrinsics.checkNotNullParameter(mList, "mList");
            this.e = sarthiProcessWithMobile;
            this.d = mList;
        }

        public static final void C(SarthiProcessWithMobile this$0, C0048a holder, a this$1, String mModel, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(holder, "$holder");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(mModel, "$mModel");
            if (Intrinsics.areEqual(this$0.getMultiCheck(), holder.Q().getText())) {
                Toast.makeText(this$0, "You can not deselect the " + ((Object) holder.Q().getText()) + " Service", 1).show();
                return;
            }
            if (Intrinsics.areEqual(this$0.getState_value(), "differ") && Intrinsics.areEqual(holder.Q().getText(), this$0.n2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                this$0.n3(true);
                Toast.makeText(this$0, "You can not deselect the " + ((Object) holder.Q().getText()) + " Service", 1).show();
                return;
            }
            if (!this$0.o2().contains(holder.Q().getText().toString())) {
                this$0.o2().add(holder.Q().getText().toString());
            } else if (!Intrinsics.areEqual(this$0.getBioRecGenesis(), "S") || !Intrinsics.areEqual(this$0.getAllowAddrChangeAtDlservReqst(), "Y") || !Intrinsics.areEqual(holder.Q().getText(), this$0.n2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                this$0.o2().remove(holder.Q().getText().toString());
            } else if (holder.Q().getCurrentTextColor() == -1) {
                this$0.q3("0");
            } else {
                this$0.q3(VContant.MAINSCREEN);
            }
            if (!this$0.v2().contains(holder.Q().getText().toString())) {
                holder.O().setBackgroundResource(R.drawable.sign_in_new);
                holder.Q().setTextColor(-1);
                holder.P().setImageDrawable(null);
                this$1.E(mModel, holder);
                this$0.v2().add(holder.Q().getText().toString());
                if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.n2().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                    this$0.u2().add("513");
                    return;
                }
                if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.n2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                    this$0.u2().add("514");
                    return;
                }
                if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.n2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                    this$0.u2().add("537");
                    return;
                }
                if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.n2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                    this$0.u2().add("515");
                    return;
                }
                if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.n2().b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                    this$0.u2().add("516");
                    return;
                }
                if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.n2().b("check_dl_serv_extract_dl", "DL Extract"))) {
                    this$0.u2().add("523");
                    return;
                }
                if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.n2().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                    this$0.u2().add("524");
                    return;
                } else if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.n2().b("change_name_dl", "Change of Name in DL"))) {
                    this$0.u2().add("526");
                    return;
                } else {
                    if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.n2().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                        this$0.u2().add("548");
                        return;
                    }
                    return;
                }
            }
            if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.n2().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                this$0.u2().remove("513");
            } else if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.n2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                this$0.u2().remove("514");
            } else if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.n2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                this$0.u2().remove("537");
            } else if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.n2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                this$0.u2().remove("515");
            } else if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.n2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                this$0.u2().remove("516");
            } else if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.n2().b("check_dl_serv_extract_dl", "DL Extract"))) {
                this$0.u2().remove("523");
            } else if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.n2().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                this$0.u2().remove("524");
            } else if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.n2().b("change_name_dl", "Change of Name in DL"))) {
                this$0.u2().remove("526");
            } else if (Intrinsics.areEqual(holder.Q().getText().toString(), this$0.n2().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                this$0.u2().remove("548");
            }
            if (!Intrinsics.areEqual(this$0.getBioRecGenesis(), "S") || !Intrinsics.areEqual(this$0.getAllowAddrChangeAtDlservReqst(), "Y") || !CollectionsKt___CollectionsKt.contains(this$0.v2(), this$0.n2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                this$0.v2().remove(holder.Q().getText().toString());
                holder.O().setBackgroundResource(R.drawable.multi_serv_background);
                holder.Q().setTextColor(-16777216);
                holder.P().setImageDrawable(null);
                this$1.F(mModel, holder);
                return;
            }
            if (!Intrinsics.areEqual(holder.Q().getText().toString(), this$0.n2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                this$0.v2().remove(holder.Q().getText().toString());
                holder.O().setBackgroundResource(R.drawable.multi_serv_background);
                holder.Q().setTextColor(-16777216);
                holder.P().setImageDrawable(null);
                this$1.F(mModel, holder);
                return;
            }
            if (holder.Q().getCurrentTextColor() == -1) {
                holder.O().setBackgroundResource(R.drawable.multi_serv_background);
                holder.Q().setTextColor(-16777216);
                holder.P().setImageDrawable(null);
                this$1.F(mModel, holder);
                tx3.a.d(false);
                this$0.u2().remove("515");
                return;
            }
            holder.O().setBackgroundResource(R.drawable.sign_in_new);
            holder.Q().setTextColor(-1);
            holder.P().setImageDrawable(null);
            this$1.E(mModel, holder);
            this$0.u2().add("515");
            tx3.a.d(true);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public void p(final C0048a holder, int i) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Object obj = this.d.get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            final String str = (String) obj;
            F(str, holder);
            holder.Q().setText(str);
            if (Intrinsics.areEqual(this.e.getMultiCheck(), holder.Q().getText())) {
                holder.O().setBackgroundResource(R.drawable.sign_in_new);
                holder.Q().setTextColor(-1);
                holder.P().setImageDrawable(null);
                if (Intrinsics.areEqual(this.e.getMultiCheck(), this.e.n2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                    holder.P().setImageDrawable(this.e.p2().getResources().getDrawable(R.drawable.renmulti));
                    if (!CollectionsKt___CollectionsKt.contains(this.e.u2(), this.e.n2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                        this.e.u2().add("514");
                    }
                    if (!CollectionsKt___CollectionsKt.contains(this.e.v2(), this.e.n2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                        ArrayList arrayListV2 = this.e.v2();
                        String strB = this.e.n2().b("check_dl_serv_renewal_dl", "Renewal of DL");
                        Intrinsics.checkNotNull(strB);
                        arrayListV2.add(strB);
                        ArrayList arrayListO2 = this.e.o2();
                        String strB2 = this.e.n2().b("check_dl_serv_renewal_dl", "Renewal of DL");
                        Intrinsics.checkNotNull(strB2);
                        arrayListO2.add(strB2);
                    }
                }
                if (Intrinsics.areEqual(this.e.getMultiCheck(), this.e.n2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                    holder.P().setImageDrawable(this.e.p2().getResources().getDrawable(R.drawable.iclearnermulti));
                    if (!CollectionsKt___CollectionsKt.contains(this.e.u2(), this.e.n2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                        this.e.u2().add("537");
                    }
                    if (!CollectionsKt___CollectionsKt.contains(this.e.v2(), this.e.n2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                        ArrayList arrayListV22 = this.e.v2();
                        String strB3 = this.e.n2().b("revalidtion_expired_dl", "Re-Validation of Expired DL");
                        Intrinsics.checkNotNull(strB3);
                        arrayListV22.add(strB3);
                        ArrayList arrayListO22 = this.e.o2();
                        String strB4 = this.e.n2().b("revalidtion_expired_dl", "Re-Validation of Expired DL");
                        Intrinsics.checkNotNull(strB4);
                        arrayListO22.add(strB4);
                    }
                }
            }
            if (Intrinsics.areEqual(this.e.getState_value(), "differ") && Intrinsics.areEqual(holder.Q().getText(), this.e.n2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                this.e.n3(true);
                this.e.v2().add(str);
                this.e.o2().add(str);
                holder.O().setBackgroundResource(R.drawable.sign_in_new);
                holder.Q().setTextColor(-1);
                holder.P().setImageDrawable(null);
                if (!CollectionsKt___CollectionsKt.contains(this.e.u2(), this.e.n2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                    this.e.u2().add("515");
                }
                E(str, holder);
            }
            if (Intrinsics.areEqual(this.e.getBioRecGenesis(), "S") && Intrinsics.areEqual(this.e.getAllowAddrChangeAtDlservReqst(), "Y") && Intrinsics.areEqual(holder.Q().getText(), this.e.n2().b("check_dl_serv_change_addr", "Change of Address in DL")) && !this.e.getCOA()) {
                ArrayList arrayListV23 = this.e.v2();
                String strB5 = this.e.n2().b("check_dl_serv_change_addr", "Change of Address in DL");
                Intrinsics.checkNotNull(strB5);
                arrayListV23.add(strB5);
                ArrayList arrayListO23 = this.e.o2();
                String strB6 = this.e.n2().b("check_dl_serv_change_addr", "Change of Address in DL");
                Intrinsics.checkNotNull(strB6);
                arrayListO23.add(strB6);
                this.e.q3("0");
            }
            LinearLayout linearLayoutO = holder.O();
            final SarthiProcessWithMobile sarthiProcessWithMobile = this.e;
            linearLayoutO.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vl5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SarthiProcessWithMobile.a.C(sarthiProcessWithMobile, holder, this, str, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public C0048a r(ViewGroup parent, int i) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.multi_service, parent, false);
            Intrinsics.checkNotNull(viewInflate);
            return new C0048a(this, viewInflate);
        }

        public final void E(String str, C0048a c0048a) {
            if (Intrinsics.areEqual(str, this.e.n2().b("check_dl_serv_change_addr", "Issue of Duplicate DL"))) {
                c0048a.P().setImageDrawable(this.e.p2().getResources().getDrawable(R.drawable.icdlmulti));
                return;
            }
            if (Intrinsics.areEqual(str, this.e.n2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                c0048a.P().setImageDrawable(this.e.p2().getResources().getDrawable(R.drawable.renmulti));
                return;
            }
            if (Intrinsics.areEqual(str, this.e.n2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                c0048a.P().setImageDrawable(this.e.p2().getResources().getDrawable(R.drawable.iclearnermulti));
                return;
            }
            if (Intrinsics.areEqual(str, this.e.n2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                c0048a.P().setImageDrawable(this.e.p2().getResources().getDrawable(R.drawable.coamulti));
                return;
            }
            if (Intrinsics.areEqual(str, this.e.n2().b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                c0048a.P().setImageDrawable(this.e.p2().getResources().getDrawable(R.drawable.icrepmulti));
                return;
            }
            if (Intrinsics.areEqual(str, this.e.n2().b("check_dl_serv_extract_dl", "DL Extract"))) {
                c0048a.P().setImageDrawable(this.e.p2().getResources().getDrawable(R.drawable.icrepmulti));
                return;
            }
            if (Intrinsics.areEqual(str, this.e.n2().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                c0048a.P().setImageDrawable(this.e.p2().getResources().getDrawable(R.drawable.endormulti));
            } else if (Intrinsics.areEqual(str, this.e.n2().b("change_name_dl", "Change of Name in DL"))) {
                c0048a.P().setImageDrawable(this.e.p2().getResources().getDrawable(R.drawable.iclearnermulti));
            } else if (Intrinsics.areEqual(str, this.e.n2().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                c0048a.P().setImageDrawable(this.e.p2().getResources().getDrawable(R.drawable.dobmulti));
            }
        }

        public final void F(String str, C0048a c0048a) {
            if (Intrinsics.areEqual(str, this.e.n2().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                c0048a.P().setImageDrawable(this.e.p2().getResources().getDrawable(R.drawable.ic_newdriving));
                return;
            }
            if (Intrinsics.areEqual(str, this.e.n2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                c0048a.P().setImageDrawable(this.e.p2().getResources().getDrawable(R.drawable.ic_learnerr));
                return;
            }
            if (Intrinsics.areEqual(str, this.e.n2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                c0048a.P().setImageDrawable(this.e.p2().getResources().getDrawable(R.drawable.ic_learnerr));
                return;
            }
            if (Intrinsics.areEqual(str, this.e.n2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                c0048a.P().setImageDrawable(this.e.p2().getResources().getDrawable(R.drawable.mvvm_ic_addres));
                return;
            }
            if (Intrinsics.areEqual(str, this.e.n2().b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                c0048a.P().setImageDrawable(this.e.p2().getResources().getDrawable(R.drawable.ic_exxtract));
                return;
            }
            if (Intrinsics.areEqual(str, this.e.n2().b("check_dl_serv_extract_dl", "DL Extract"))) {
                c0048a.P().setImageDrawable(this.e.p2().getResources().getDrawable(R.drawable.mvvm_ic_addres));
                return;
            }
            if (Intrinsics.areEqual(str, this.e.n2().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                c0048a.P().setImageDrawable(this.e.p2().getResources().getDrawable(R.drawable.endorsedl));
            } else if (Intrinsics.areEqual(str, this.e.n2().b("change_name_dl", "Change of Name in DL"))) {
                c0048a.P().setImageDrawable(this.e.p2().getResources().getDrawable(R.drawable.coname));
            } else if (Intrinsics.areEqual(str, this.e.n2().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                c0048a.P().setImageDrawable(this.e.p2().getResources().getDrawable(R.drawable.codob));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int e() {
            return this.d.size();
        }
    }

    public static final class b extends Lambda implements Function1 {
        public static final b c = new b();

        public b() {
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

    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            if (s.length() < 10) {
                SarthiProcessWithMobile.this.i2().h.setAlpha(0.6f);
                return;
            }
            SarthiProcessWithMobile sarthiProcessWithMobile = SarthiProcessWithMobile.this;
            sarthiProcessWithMobile.x3(String.valueOf(sarthiProcessWithMobile.i2().n.getText()));
            SarthiProcessWithMobile.this.i2().h.setAlpha(1.0f);
        }
    }

    public static final class d extends Lambda implements Function1 {
        public static final d c = new d();

        public d() {
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

    public static final class e extends Lambda implements Function1 {
        public static final e c = new e();

        public e() {
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

    public static final class f extends Lambda implements Function1 {

        public static final class a extends Lambda implements Function1 {
            public static final a c = new a();

            public a() {
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
            SarthiProcessWithMobile.this.x2().setVisibility(8);
            SarthiProcessWithMobile.this.i2().t.setAlpha(1.0f);
            SarthiProcessWithMobile.this.i2().h.setAlpha(1.0f);
            SarthiProcessWithMobile.this.i2().h.setClickable(true);
            SarthiProcessWithMobile.this.i2().t.setClickable(true);
            try {
                if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL001", true)) {
                    SarthiProcessWithMobile.this.G3(String.valueOf(sendOtpResult.getRecordId()));
                    SarthiProcessWithMobile sarthiProcessWithMobile = SarthiProcessWithMobile.this;
                    sarthiProcessWithMobile.N3(sarthiProcessWithMobile, String.valueOf(sarthiProcessWithMobile.i2().n.getText()));
                } else if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL099", true)) {
                    mt6.a.c(SarthiProcessWithMobile.this, sendOtpResult.getStatusDesc());
                } else {
                    SarthiProcessWithMobile sarthiProcessWithMobile2 = SarthiProcessWithMobile.this;
                    String strB = sarthiProcessWithMobile2.n2().b("nex_parivahan", SarthiProcessWithMobile.this.getString(R.string.app_name));
                    Intrinsics.checkNotNull(strB);
                    String statusDesc = sendOtpResult.getStatusDesc();
                    String strB2 = SarthiProcessWithMobile.this.n2().b("btn_ok", SarthiProcessWithMobile.this.getString(R.string.ok_txt));
                    Intrinsics.checkNotNull(strB2);
                    o40.q1(sarthiProcessWithMobile2, strB, statusDesc, 1, strB2, null, a.c, 16, null);
                }
            } catch (Exception unused) {
                SarthiProcessWithMobile.this.x2().setVisibility(8);
                SarthiProcessWithMobile.this.i2().t.setAlpha(1.0f);
                SarthiProcessWithMobile.this.i2().h.setAlpha(1.0f);
                SarthiProcessWithMobile.this.i2().h.setClickable(true);
                SarthiProcessWithMobile.this.i2().t.setClickable(true);
                SarthiProcessWithMobile sarthiProcessWithMobile3 = SarthiProcessWithMobile.this;
                String strB3 = sarthiProcessWithMobile3.n2().b("label_went_wrong", SarthiProcessWithMobile.this.getString(R.string.something_please_try_after_some_time));
                Intrinsics.checkNotNull(strB3);
                sarthiProcessWithMobile3.e3(strB3);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SendOtpResult) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class g extends CountDownTimer {
        public g() {
            super(30000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            SarthiProcessWithMobile.this.i2().s.setVisibility(0);
            SarthiProcessWithMobile.this.i2().q.setText("0");
            SarthiProcessWithMobile.this.i2().q.setVisibility(8);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            SarthiProcessWithMobile.this.i2().q.setText(SarthiProcessWithMobile.this.n2().b("time_remaining", SarthiProcessWithMobile.this.getString(R.string.time_remaining)) + " : " + (j / ((long) 1000)));
            SarthiProcessWithMobile.this.i2().s.setVisibility(8);
            SarthiProcessWithMobile.this.i2().q.setVisibility(0);
        }
    }

    public static final class h extends Lambda implements Function1 {
        public static final h c = new h();

        public h() {
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

    public static final class i extends Lambda implements Function1 {
        public static final i c = new i();

        public i() {
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

    public static final class k extends Lambda implements Function1 {
        public static final k c = new k();

        public k() {
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

    public static final class m extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ SarthiProcessWithMobile b;
        public final /* synthetic */ Ref.ObjectRef c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(TextView textView, SarthiProcessWithMobile sarthiProcessWithMobile, Ref.ObjectRef objectRef) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = sarthiProcessWithMobile;
            this.c = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.CountDownTimer
        public void onFinish() {
            ((TextView) this.c.element).setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.a.setText(this.b.n2().b("time_remaining", this.b.getString(R.string.time_remaining)) + " : " + (j / ((long) 1000)));
            ((TextView) this.c.element).setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    public static final class n extends CountDownTimer {
        public final /* synthetic */ TextView a;
        public final /* synthetic */ SarthiProcessWithMobile b;
        public final /* synthetic */ Ref.ObjectRef c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(TextView textView, SarthiProcessWithMobile sarthiProcessWithMobile, Ref.ObjectRef objectRef) {
            super(30000L, 1000L);
            this.a = textView;
            this.b = sarthiProcessWithMobile;
            this.c = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.CountDownTimer
        public void onFinish() {
            ((TextView) this.c.element).setVisibility(0);
            this.a.setText("0");
            this.a.setVisibility(8);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.a.setText(this.b.n2().b("time_remaining", this.b.getString(R.string.time_remaining)) + " : " + (j / ((long) 1000)));
            ((TextView) this.c.element).setVisibility(8);
            this.a.setVisibility(0);
        }
    }

    private final void G2(Intent intent, String lastEndRTO, String lastEndState, String purCode) {
        B2().q("NA", "N", "NA", "NA");
        try {
            intent.putExtra("DL", this.dlNo);
            intent.putExtra("dob", this.dob);
            intent.putExtra("DLDetails", l2());
            intent.putExtra("Mobile_no", this.mobNo);
            intent.putExtra("lastEndorsedRTO", lastEndRTO);
            intent.putExtra("lastEndorsedState", lastEndState);
            intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRtoCode);
            intent.putExtra("lastEndorseStateCode", this.lastEndorseStateCode);
            intent.putExtra("whatServiceRequired", this.whatServiceRequired);
            intent.putExtra("state_value", this.state_value);
            intent.putExtra("purCode", purCode);
            intent.putExtra("bioRecGenesis", this.bioRecGenesis);
            intent.putExtra("allowAddrChangeAtDlservReqst", this.allowAddrChangeAtDlservReqst);
            intent.putExtra("eKYCId", "NA");
            intent.putExtra("eKYCOpted", "N");
            intent.putExtra("eKYCGender", "NA");
            intent.putExtra("eKYCapplicantPhoto", "NA");
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void H2(Intent intent, String lastEndRTO, String lastEndState, String purCode, ArrayList multiList, int serialNo) {
        if (u2().size() > 1) {
            wl5 wl5VarB2 = B2();
            String strB = n2().b("dl_services", getString(R.string.dl_services));
            Intrinsics.checkNotNull(strB);
            wl5VarB2.t(strB, VContant.MULTISERVICE_PURPOSE_CODE);
        }
        B2().q("NA", "N", "NA", "NA");
        try {
            intent.putExtra("DL", this.dlNo);
            intent.putExtra("dob", this.dob);
            intent.putExtra("DLDetails", l2());
            intent.putExtra("Mobile_no", this.mobNo);
            intent.putExtra("lastEndorsedRTO", lastEndRTO);
            intent.putExtra("lastEndorsedState", lastEndState);
            intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRtoCode);
            intent.putExtra("lastEndorseStateCode", this.lastEndorseStateCode);
            intent.putExtra("whatServiceRequired", this.whatServiceRequired);
            intent.putExtra("state_value", this.state_value);
            intent.putExtra("purCode", purCode);
            intent.putExtra("bioRecGenesis", this.bioRecGenesis);
            intent.putExtra("allowAddrChangeAtDlservReqst", this.allowAddrChangeAtDlservReqst);
            intent.putExtra("multiList", multiList);
            intent.putExtra("serialNo", serialNo);
            intent.putExtra("COA", this.COA);
            intent.putExtra("metaflag", this.flag);
            intent.putExtra("listHeaderSteps", o2());
            intent.putExtra("eKYCId", "NA");
            intent.putExtra("eKYCOpted", "N");
            intent.putExtra("eKYCGender", "NA");
            intent.putExtra("eKYCapplicantPhoto", "NA");
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final void I2(SarthiProcessWithMobile this$0, CustomState customState) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (StringsKt__StringsJVMKt.equals(customState.getStatus_code(), "00", true)) {
                this$0.allowAddrChangeAtDlservReqst = customState.getCustomSt().get(0).getAllowAddrChangeAtDlservReqst();
            }
        } catch (Exception unused) {
            this$0.e3(this$0.getString(R.string.something_please_try_after_some_time));
        }
    }

    public static final void J2(SarthiProcessWithMobile this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.n2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        if (this$0.i2().h.getAlpha() == 1.0f) {
            if (!this$0.i2().i.isChecked()) {
                Toast.makeText(this$0, this$0.n2().b("plz_accept_term_conditions", this$0.getString(R.string.pls_enter_term_conditions)), 0).show();
                return;
            }
            if (this$0.mobNo.length() < 10) {
                String strB = this$0.n2().b("nex_parivahan", this$0.getString(R.string.app_name));
                Intrinsics.checkNotNull(strB);
                String strB2 = this$0.n2().b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no));
                Intrinsics.checkNotNull(strB2);
                String strB3 = this$0.n2().b("btn_ok", this$0.getString(R.string.ok_txt));
                Intrinsics.checkNotNull(strB3);
                o40.q1(this$0, strB, strB2, 1, strB3, null, d.c, 16, null);
                return;
            }
            if (mt6.a.t(this$0.mobNo)) {
                this$0.i2().t.setAlpha(0.5f);
                this$0.i2().h.setAlpha(0.5f);
                this$0.i2().h.setClickable(false);
                this$0.i2().t.setClickable(false);
                this$0.x2().setVisibility(0);
                this$0.m2().F(this$0, this$0.mobNo, this$0.C2().k().toString());
                return;
            }
            String strB4 = this$0.n2().b("nex_parivahan", this$0.getString(R.string.app_name));
            Intrinsics.checkNotNull(strB4);
            String strB5 = this$0.n2().b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no));
            Intrinsics.checkNotNull(strB5);
            String strB6 = this$0.n2().b("btn_ok", this$0.getString(R.string.ok_txt));
            Intrinsics.checkNotNull(strB6);
            o40.q1(this$0, strB4, strB5, 1, strB6, null, e.c, 16, null);
        }
    }

    public static final void K2(SarthiProcessWithMobile this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.g2();
        String strB = this$0.n2().b("nex_parivahan", this$0.getString(R.string.app_name));
        Intrinsics.checkNotNull(strB);
        String strB2 = this$0.n2().b("label_log_unbl_veri_otp", this$0.getString(R.string.unable_verifiy_otp));
        Intrinsics.checkNotNull(strB2);
        String strB3 = this$0.n2().b("btn_ok", this$0.getString(R.string.ok_txt));
        Intrinsics.checkNotNull(strB3);
        o40.q1(this$0, strB, strB2, 1, strB3, null, b.c, 16, null);
    }

    public static final void L2(SarthiProcessWithMobile this$0, DlLastRtoDetailsDto dlLastRtoDetailsDto) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.g2();
        if (Intrinsics.areEqual(this$0.B2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            this$0.g3();
            return;
        }
        try {
            if (dlLastRtoDetailsDto.getStatus_code().equals("00") && dlLastRtoDetailsDto.getStatus_desc().equals("success") && dlLastRtoDetailsDto.getResult() != null) {
                if (StringsKt__StringsJVMKt.equals$default((String) this$0.whatServiceRequired.get("537"), "RE-VALIDATION OF EXPIRED DL", false, 2, null)) {
                    if (!StringsKt__StringsJVMKt.equals(this$0.state_value, "same", true)) {
                        this$0.setIntent(new Intent(this$0, (Class<?>) ChangeOfAddressActivity.class));
                        Intent intent = this$0.getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                        this$0.G2(intent, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "537");
                        this$0.finish();
                    } else if (StringsKt__StringsJVMKt.equals(this$0.bioRecGenesis, "S", true) && StringsKt__StringsJVMKt.equals(this$0.allowAddrChangeAtDlservReqst, "Y", true)) {
                        this$0.setIntent(new Intent(this$0, (Class<?>) ChangeOfAddressActivity.class));
                        Intent intent2 = this$0.getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
                        this$0.G2(intent2, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "537");
                        this$0.finish();
                    } else {
                        this$0.setIntent(new Intent(this$0, (Class<?>) RenewalOfDLActivity.class));
                        Intent intent3 = this$0.getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent3, "getIntent(...)");
                        this$0.G2(intent3, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "537");
                        this$0.finish();
                    }
                } else if (StringsKt__StringsJVMKt.equals$default((String) this$0.whatServiceRequired.get("526"), "Change of Name in DL", false, 2, null)) {
                    this$0.setIntent(new Intent(this$0, (Class<?>) ChangeOfName.class));
                    Intent intent4 = this$0.getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent4, "getIntent(...)");
                    this$0.G2(intent4, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "526");
                    this$0.finish();
                } else if (StringsKt__StringsJVMKt.equals$default((String) this$0.whatServiceRequired.get("548"), "Change of Date of Birth in DL", false, 2, null)) {
                    this$0.setIntent(new Intent(this$0, (Class<?>) DobChangeActivity.class));
                    Intent intent5 = this$0.getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent5, "getIntent(...)");
                    this$0.G2(intent5, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "548");
                    this$0.finish();
                } else if (StringsKt__StringsJVMKt.equals$default((String) this$0.whatServiceRequired.get("524"), "Endorsement to Drive in Hill Region", false, 2, null)) {
                    this$0.setIntent(new Intent(this$0, (Class<?>) HillReligion.class));
                    Intent intent6 = this$0.getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent6, "getIntent(...)");
                    this$0.G2(intent6, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "524");
                    this$0.finish();
                } else if (StringsKt__StringsJVMKt.equals$default((String) this$0.whatServiceRequired.get("514"), "Renewal of DL", false, 2, null)) {
                    if (!StringsKt__StringsJVMKt.equals(this$0.state_value, "same", true)) {
                        this$0.setIntent(new Intent(this$0, (Class<?>) ChangeOfAddressActivity.class));
                        Intent intent7 = this$0.getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent7, "getIntent(...)");
                        this$0.G2(intent7, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "514");
                        this$0.finish();
                    } else if (StringsKt__StringsJVMKt.equals(this$0.bioRecGenesis, "S", true) && StringsKt__StringsJVMKt.equals(this$0.allowAddrChangeAtDlservReqst, "Y", true)) {
                        this$0.setIntent(new Intent(this$0, (Class<?>) ChangeOfAddressActivity.class));
                        Intent intent8 = this$0.getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent8, "getIntent(...)");
                        this$0.G2(intent8, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "514");
                        this$0.finish();
                    } else {
                        this$0.setIntent(new Intent(this$0, (Class<?>) RenewalOfDLActivity.class));
                        Intent intent9 = this$0.getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent9, "getIntent(...)");
                        this$0.G2(intent9, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "514");
                        this$0.finish();
                    }
                } else if (StringsKt__StringsJVMKt.equals$default((String) this$0.whatServiceRequired.get("515"), "Change of Address in DL", false, 2, null)) {
                    this$0.setIntent(new Intent(this$0, (Class<?>) ChangeOfAddressActivity.class));
                    Intent intent10 = this$0.getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent10, "getIntent(...)");
                    this$0.G2(intent10, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "515");
                    this$0.finish();
                } else if (StringsKt__StringsJVMKt.equals$default((String) this$0.whatServiceRequired.get("513"), "Issue of Duplicate DL", false, 2, null)) {
                    if (!StringsKt__StringsJVMKt.equals(this$0.state_value, "same", true)) {
                        this$0.setIntent(new Intent(this$0, (Class<?>) ChangeOfAddressActivity.class));
                        Intent intent11 = this$0.getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent11, "getIntent(...)");
                        this$0.G2(intent11, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "513");
                        this$0.finish();
                    } else if (StringsKt__StringsJVMKt.equals(this$0.bioRecGenesis, "S", true) && StringsKt__StringsJVMKt.equals(this$0.allowAddrChangeAtDlservReqst, "Y", true)) {
                        this$0.setIntent(new Intent(this$0, (Class<?>) ChangeOfAddressActivity.class));
                        Intent intent12 = this$0.getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent12, "getIntent(...)");
                        this$0.G2(intent12, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "513");
                        this$0.finish();
                    } else {
                        this$0.setIntent(new Intent(this$0, (Class<?>) DLDuplicateActivity.class));
                        Intent intent13 = this$0.getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent13, "getIntent(...)");
                        this$0.G2(intent13, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "513");
                        this$0.finish();
                    }
                } else if (StringsKt__StringsJVMKt.equals$default((String) this$0.whatServiceRequired.get("516"), "Replacement of DL", false, 2, null)) {
                    if (!StringsKt__StringsJVMKt.equals(this$0.state_value, "same", true)) {
                        this$0.setIntent(new Intent(this$0, (Class<?>) ChangeOfAddressActivity.class));
                        Intent intent14 = this$0.getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent14, "getIntent(...)");
                        this$0.G2(intent14, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "516");
                        this$0.finish();
                    } else if (StringsKt__StringsJVMKt.equals(this$0.bioRecGenesis, "S", true) && StringsKt__StringsJVMKt.equals(this$0.allowAddrChangeAtDlservReqst, "Y", true)) {
                        this$0.setIntent(new Intent(this$0, (Class<?>) ChangeOfAddressActivity.class));
                        Intent intent15 = this$0.getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent15, "getIntent(...)");
                        this$0.G2(intent15, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "516");
                        this$0.finish();
                    } else {
                        this$0.setIntent(new Intent(this$0, (Class<?>) DLReplecementActivity.class));
                        Intent intent16 = this$0.getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent16, "getIntent(...)");
                        this$0.G2(intent16, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "516");
                        this$0.finish();
                    }
                } else if (StringsKt__StringsJVMKt.equals$default((String) this$0.whatServiceRequired.get("523"), "DL Extract", false, 2, null)) {
                    if (StringsKt__StringsJVMKt.equals(this$0.bioRecGenesis, "S", true) && StringsKt__StringsJVMKt.equals(this$0.allowAddrChangeAtDlservReqst, "Y", true)) {
                        this$0.setIntent(new Intent(this$0, (Class<?>) ChangeOfAddressActivity.class));
                        Intent intent17 = this$0.getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent17, "getIntent(...)");
                        this$0.G2(intent17, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "523");
                        this$0.finish();
                    } else {
                        this$0.setIntent(new Intent(this$0, (Class<?>) DLExtractActivity.class));
                        Intent intent18 = this$0.getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent18, "getIntent(...)");
                        this$0.G2(intent18, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "523");
                        this$0.finish();
                    }
                } else if (!StringsKt__StringsJVMKt.equals$default((String) this$0.whatServiceRequired.get("525"), "International Driving Permit", false, 2, null)) {
                    this$0.u1(this$0.n2().b("service_is_not_present", this$0.getString(R.string.unable_to_get_details)), this$0.i2().b());
                } else if (StringsKt__StringsJVMKt.equals(this$0.bioRecGenesis, "S", true) && StringsKt__StringsJVMKt.equals(this$0.allowAddrChangeAtDlservReqst, "Y", true)) {
                    this$0.setIntent(new Intent(this$0, (Class<?>) ChangeOfAddressActivity.class));
                    Intent intent19 = this$0.getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent19, "getIntent(...)");
                    this$0.G2(intent19, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "525");
                    this$0.finish();
                } else {
                    this$0.setIntent(new Intent(this$0, (Class<?>) DLIdpActivity.class));
                    Intent intent20 = this$0.getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent20, "getIntent(...)");
                    this$0.G2(intent20, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "525");
                    this$0.finish();
                }
            }
        } catch (Exception unused) {
            this$0.g2();
            String strB = this$0.n2().b("label_went_wrong", this$0.getString(R.string.something_please_try_after_some_time));
            Intrinsics.checkNotNull(strB);
            this$0.e3(strB);
        }
    }

    public static final void M2(SarthiProcessWithMobile this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.g2();
        String strB = this$0.n2().b("label_went_wrong", this$0.getString(R.string.something_please_try_after_some_time));
        Intrinsics.checkNotNull(strB);
        this$0.e3(strB);
    }

    public static final void N2(SarthiProcessWithMobile this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.n2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
            return;
        }
        new SarathiMobileUpdateActivity();
        try {
            Intent intent = new Intent(this$0, (Class<?>) MobUpdateAdhar.class);
            intent.putExtra("DLDetails", this$0.l2());
            intent.putExtra("DL", this$0.dlNo);
            intent.putExtra("dob", this$0.f2(this$0.l2().getBioObj().getBioDob()));
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final void O2(SarthiProcessWithMobile this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(this$0.B2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                final Dialog dialog = new Dialog(this$0);
                dialog.setContentView(R.layout.layout_multi);
                Window window = dialog.getWindow();
                Intrinsics.checkNotNull(window);
                window.setBackgroundDrawable(new ColorDrawable(0));
                View viewFindViewById = dialog.findViewById(R.id.service_label_cross);
                Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
                View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
                Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) viewFindViewById2;
                View viewFindViewById3 = dialog.findViewById(R.id.service_label_list);
                Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
                View viewFindViewById4 = dialog.findViewById(R.id.service_label_list_serial);
                Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
                View viewFindViewById5 = dialog.findViewById(R.id.dl_services);
                Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.TextView");
                textView.setText(this$0.n2().b("btn_ok", "OK"));
                ((TextView) viewFindViewById5).setText(this$0.n2().b("title_dl_services", "Driving Licence Services"));
                ((ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wk5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        SarthiProcessWithMobile.P2(dialog, view2);
                    }
                });
                ((TextView) viewFindViewById4).setText(R.string.multi_string_serial);
                ((TextView) viewFindViewById3).setText(this$0.n2().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL") + '\n' + this$0.n2().b("check_dl_serv_renewal_dl", "Renewal of DL") + '\n' + this$0.n2().b("check_dl_serv_change_addr", "Change of Address in DL") + '\n' + this$0.n2().b("check_dl_serv_replacement_dl", "Replacement of DL") + '\n' + this$0.n2().b("hill_region_title", "Endorsement to Drive in Hill Region") + '\n' + this$0.n2().b("change_name_dl", "Change of Name in DL") + '\n' + this$0.n2().b("change_birth_dl", "Change of Date of Birth in DL") + '\n' + this$0.n2().b("label_international_driv_permit", "International Driving Permit"));
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xk5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        SarthiProcessWithMobile.Q2(dialog, view2);
                    }
                });
                Window window2 = dialog.getWindow();
                Intrinsics.checkNotNull(window2);
                window2.setGravity(48);
                window2.setLayout(-2, -2);
                dialog.show();
            } catch (Exception unused) {
            }
        }
    }

    public static final void O3(EditText enterOtp, ImageView shownPin, View view) {
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

    public static final void P2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void P3(SarthiProcessWithMobile this$0, TextView time_text, Ref.ObjectRef resendOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(time_text, "$time_text");
        Intrinsics.checkNotNullParameter(resendOtp, "$resendOtp");
        this$0.C3(new ProgressDialog(this$0));
        this$0.w2().setMessage(this$0.n2().b("label_challan_please_wait", this$0.getString(R.string.please_wait)));
        this$0.w2().setCancelable(false);
        this$0.w2().setCanceledOnTouchOutside(false);
        this$0.m2().D(this$0, String.valueOf(this$0.record_id));
        new n(time_text, this$0, resendOtp).start();
    }

    public static final void Q2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void Q3(SarthiProcessWithMobile this$0, EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.n2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
            return;
        }
        Editable text = enterOtp.getText();
        Intrinsics.checkNotNull(text);
        if (text.length() == 0) {
            Toast.makeText(this$0, this$0.n2().b("label_log_entr_otp", this$0.getString(R.string.pls_enter_otp)), 0).show();
            return;
        }
        Editable text2 = enterOtp.getText();
        Intrinsics.checkNotNull(text2);
        if (text2.length() < 6) {
            Toast.makeText(this$0, this$0.n2().b("label_log_entr_val_otp", this$0.getString(R.string.pls_enter_valid_otp)), 0).show();
            return;
        }
        this$0.E2().setAlpha(0.5f);
        this$0.F2().setAlpha(0.5f);
        this$0.E2().setClickable(false);
        this$0.F2().setClickable(false);
        this$0.y2().setVisibility(0);
        nr1 nr1VarM2 = this$0.m2();
        String string = enterOtp.getText().toString();
        String str = this$0.record_id;
        Intrinsics.checkNotNull(str);
        nr1VarM2.G(this$0, string, str);
    }

    public static final void R2(SarthiProcessWithMobile this$0, ServiceCheckPojo serviceCheckPojo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.z2().c(false);
        try {
            if (!Intrinsics.areEqual(serviceCheckPojo.getStatus_code(), "00")) {
                this$0.e3(serviceCheckPojo.getResult());
                return;
            }
            ArrayList arrayListV2 = this$0.v2();
            if (arrayListV2 != null && !arrayListV2.isEmpty() && this$0.v2().size() != 0) {
                if (Intrinsics.areEqual(this$0.v2().get(0), this$0.n2().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                    this$0.setIntent(new Intent(this$0, (Class<?>) DLDuplicateActivity.class));
                    Intent intent = this$0.getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                    this$0.H2(intent, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "513", this$0.v2(), 1);
                    this$0.finish();
                    return;
                }
                if (Intrinsics.areEqual(this$0.v2().get(0), this$0.n2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                    this$0.setIntent(new Intent(this$0, (Class<?>) RenewalOfDLActivity.class));
                    Intent intent2 = this$0.getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
                    this$0.H2(intent2, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "514", this$0.v2(), 1);
                    this$0.finish();
                    return;
                }
                if (Intrinsics.areEqual(this$0.v2().get(0), this$0.n2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                    this$0.setIntent(new Intent(this$0, (Class<?>) RenewalOfDLActivity.class));
                    Intent intent3 = this$0.getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent3, "getIntent(...)");
                    this$0.H2(intent3, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "537", this$0.v2(), 1);
                    this$0.finish();
                    return;
                }
                if (Intrinsics.areEqual(this$0.v2().get(0), this$0.n2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                    if (Intrinsics.areEqual(this$0.flag, "0")) {
                        ArrayList arrayListO2 = this$0.o2();
                        TypeIntrinsics.asMutableCollection(arrayListO2).remove(this$0.n2().b("check_dl_serv_change_addr", "Change of Address in DL"));
                    }
                    this$0.setIntent(new Intent(this$0, (Class<?>) ChangeOfAddressActivity.class));
                    Intent intent4 = this$0.getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent4, "getIntent(...)");
                    this$0.H2(intent4, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "515", this$0.v2(), 1);
                    this$0.finish();
                    return;
                }
                if (Intrinsics.areEqual(this$0.v2().get(0), this$0.n2().b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                    this$0.setIntent(new Intent(this$0, (Class<?>) DLReplecementActivity.class));
                    Intent intent5 = this$0.getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent5, "getIntent(...)");
                    this$0.H2(intent5, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "516", this$0.v2(), 1);
                    this$0.finish();
                    return;
                }
                if (Intrinsics.areEqual(this$0.v2().get(0), this$0.n2().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                    this$0.setIntent(new Intent(this$0, (Class<?>) HillReligion.class));
                    Intent intent6 = this$0.getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent6, "getIntent(...)");
                    this$0.H2(intent6, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "524", this$0.v2(), 1);
                    this$0.finish();
                    return;
                }
                if (Intrinsics.areEqual(this$0.v2().get(0), this$0.n2().b("change_name_dl", "Change of Name in DL"))) {
                    this$0.setIntent(new Intent(this$0, (Class<?>) ChangeOfName.class));
                    Intent intent7 = this$0.getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent7, "getIntent(...)");
                    this$0.H2(intent7, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "526", this$0.v2(), 1);
                    this$0.finish();
                    return;
                }
                if (Intrinsics.areEqual(this$0.v2().get(0), this$0.n2().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                    this$0.setIntent(new Intent(this$0, (Class<?>) DobChangeActivity.class));
                    Intent intent8 = this$0.getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent8, "getIntent(...)");
                    this$0.H2(intent8, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "548", this$0.v2(), 1);
                    this$0.finish();
                    return;
                }
                if (Intrinsics.areEqual(this$0.v2().get(0), this$0.n2().b("check_dl_serv_extract_dl", "DL Extract"))) {
                    this$0.setIntent(new Intent(this$0, (Class<?>) DLExtractActivity.class));
                    Intent intent9 = this$0.getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent9, "getIntent(...)");
                    this$0.H2(intent9, this$0.lastEndorsedRTO, this$0.lastEndorsedState, "523", this$0.v2(), 1);
                    return;
                }
                return;
            }
            Toast.makeText(this$0, "Please select at least one service", 1).show();
        } catch (Exception unused) {
        }
    }

    public static final void R3(EditText enterOtp, View view) {
        Intrinsics.checkNotNullParameter(enterOtp, "$enterOtp");
        enterOtp.setText("");
    }

    public static final void S2(SarthiProcessWithMobile this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Toast.makeText(this$0, "hello", 0).show();
        this$0.z2().c(false);
        this$0.e3(this$0.n2().b("service_is_not_present", this$0.getString(R.string.unable_to_get_details)));
    }

    public static final void S3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void T2(SarthiProcessWithMobile this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void U2(SarthiProcessWithMobile this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        final Dialog dialog = new Dialog(this$0);
        dialog.setContentView(R.layout.term_cond_dialog);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        String str = s14.a.g() + this$0.n2().d() + "/mparivahan-info-terms-of-use.html";
        View viewFindViewById = dialog.findViewById(R.id.cancelIv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = dialog.findViewById(R.id.termConditionWv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ((ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zk5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SarthiProcessWithMobile.V2(dialog, view2);
            }
        });
        ((WebView) viewFindViewById2).loadUrl(str);
        dialog.show();
    }

    public static final void V2(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    public static final void W2(SarthiProcessWithMobile this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.x2().setVisibility(8);
        this$0.i2().t.setAlpha(1.0f);
        this$0.i2().h.setAlpha(1.0f);
        this$0.i2().h.setClickable(true);
        this$0.i2().t.setClickable(true);
        String strB = this$0.n2().b("label_went_wrong", this$0.getString(R.string.something_please_try_after_some_time));
        Intrinsics.checkNotNull(strB);
        this$0.e3(strB);
    }

    public static final void X2(SarthiProcessWithMobile this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.y2().setVisibility(0);
        this$0.m2().D(this$0, String.valueOf(this$0.record_id));
        this$0.new g().start();
    }

    public static final void Y2(SarthiProcessWithMobile this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.i2().i.setChecked(false);
    }

    public static final void Z2(SarthiProcessWithMobile this$0, OtpVerifyResult otpVerifyResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (StringsKt__StringsJVMKt.equals(otpVerifyResult.getStatusCode(), "AL001", true)) {
                nr1 nr1VarM2 = this$0.m2();
                String str = this$0.dlNo;
                Intrinsics.checkNotNull(str);
                nr1VarM2.x(this$0, str, this$0.l2().getBioObj().getBioDob());
            } else {
                this$0.g2();
                this$0.e3(otpVerifyResult.getStatusDesc());
            }
        } catch (Exception unused) {
            this$0.g2();
            String strB = this$0.n2().b("label_went_wrong", this$0.getString(R.string.something_please_try_after_some_time));
            Intrinsics.checkNotNull(strB);
            this$0.e3(strB);
        }
    }

    public static final void a3(SarthiProcessWithMobile this$0, ResendOtp resendOtp) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.g2();
        try {
            if (StringsKt__StringsJVMKt.equals(resendOtp.getStatusCode(), "AL001", true)) {
                String strB = this$0.n2().b("nex_parivahan", this$0.getString(R.string.app_name));
                Intrinsics.checkNotNull(strB);
                String strB2 = this$0.n2().b("otp_resent", this$0.getString(R.string.otp_resent));
                Intrinsics.checkNotNull(strB2);
                String strB3 = this$0.n2().b("btn_ok", this$0.getString(R.string.ok_txt));
                Intrinsics.checkNotNull(strB3);
                o40.q1(this$0, strB, strB2, 1, strB3, null, h.c, 16, null);
            } else if (StringsKt__StringsJVMKt.equals(resendOtp.getStatusCode(), "AL002", true)) {
                String strB4 = this$0.n2().b("nex_parivahan", this$0.getString(R.string.app_name));
                Intrinsics.checkNotNull(strB4);
                String statusDesc = resendOtp.getStatusDesc();
                String strB5 = this$0.n2().b("btn_ok", this$0.getString(R.string.ok_txt));
                Intrinsics.checkNotNull(strB5);
                o40.q1(this$0, strB4, statusDesc, 1, strB5, null, i.c, 16, null);
            } else {
                String strB6 = this$0.n2().b("nex_parivahan", this$0.getString(R.string.app_name));
                Intrinsics.checkNotNull(strB6);
                String statusDesc2 = resendOtp.getStatusDesc();
                String strB7 = this$0.n2().b("btn_ok", this$0.getString(R.string.ok_txt));
                Intrinsics.checkNotNull(strB7);
                o40.q1(this$0, strB6, statusDesc2, 1, strB7, null, j.c, 16, null);
            }
        } catch (Exception unused) {
            this$0.g2();
            String strB8 = this$0.n2().b("nex_parivahan", this$0.getString(R.string.app_name));
            Intrinsics.checkNotNull(strB8);
            String strB9 = this$0.n2().b("label_log_unbl_veri_otp", this$0.getString(R.string.unable_verifiy_otp));
            Intrinsics.checkNotNull(strB9);
            String strB10 = this$0.n2().b("btn_ok", this$0.getString(R.string.ok_txt));
            Intrinsics.checkNotNull(strB10);
            o40.q1(this$0, strB8, strB9, 1, strB10, null, k.c, 16, null);
        }
    }

    private final void b3() {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.layout_multi);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.service_label_cross);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.service_label_list);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById4 = dialog.findViewById(R.id.service_label_list_serial);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById5 = dialog.findViewById(R.id.dl_services);
        Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.TextView");
        textView.setText(n2().b("btn_ok", "OK"));
        ((TextView) viewFindViewById5).setText(n2().b("title_dl_services", "Driving Licence Services"));
        ((ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ml5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithMobile.c3(dialog, view);
            }
        });
        ((TextView) viewFindViewById3).setText(n2().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL") + '\n' + n2().b("check_dl_serv_renewal_dl", "Renewal of DL") + '\n' + n2().b("check_dl_serv_change_addr", "Change of Address in DL") + '\n' + n2().b("check_dl_serv_replacement_dl", "Replacement of DL") + '\n' + n2().b("hill_region_title", "Endorsement to Drive in Hill Region") + '\n' + n2().b("change_name_dl", "Change of Name in DL") + '\n' + n2().b("change_birth_dl", "Change of Date of Birth in DL") + '\n' + n2().b("label_international_driv_permit", "International Driving Permit"));
        ((TextView) viewFindViewById4).setText(R.string.multi_string_serial);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nl5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithMobile.d3(dialog, view);
            }
        });
        Window window2 = dialog.getWindow();
        Intrinsics.checkNotNull(window2);
        window2.setGravity(48);
        window2.setLayout(-2, -2);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void e3(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        dialog.setCanceledOnTouchOutside(false);
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(n2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(n2().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yk5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithMobile.f3(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void g3() {
        final Dialog dialog = new Dialog(this, android.R.style.Theme.Black.NoTitleBar.Fullscreen);
        dialog.setContentView(R.layout.service_selection);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(-1));
        dialog.setCanceledOnTouchOutside(false);
        View viewFindViewById = dialog.findViewById(R.id.service_selection);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_proceed);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type com.nic.mparivahan.dlservices.widget.CustomWegetLayout");
        F3((CustomWegetLayout) viewFindViewById2);
        z2().setText(n2().b("button_proceed", getString(R.string.proceed)));
        View viewFindViewById3 = dialog.findViewById(R.id.dl_number_new);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById4 = dialog.findViewById(R.id.cancelIv);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.ImageView");
        View viewFindViewById5 = dialog.findViewById(R.id.pop_up_reset);
        Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type com.nic.mparivahan.dlservices.widget.CustomWegetLayout");
        CustomWegetLayout customWegetLayout = (CustomWegetLayout) viewFindViewById5;
        customWegetLayout.setText(n2().b("button_cancel", getString(R.string.cancel)));
        customWegetLayout.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bl5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithMobile.h3(dialog, view);
            }
        });
        View viewFindViewById6 = dialog.findViewById(R.id.select_Service_apply);
        Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById6).setText(n2().b("select_service_to_apply", "Select the service to apply"));
        View viewFindViewById7 = dialog.findViewById(R.id.service_label);
        Intrinsics.checkNotNull(viewFindViewById7, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById7;
        View viewFindViewById8 = dialog.findViewById(R.id.service_label_dl);
        Intrinsics.checkNotNull(viewFindViewById8, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById8;
        textView2.setPaintFlags(textView2.getPaintFlags() | 8);
        textView2.setText(StringsKt__StringsKt.trim((CharSequence) String.valueOf(this.dlNo)).toString());
        textView.setPaintFlags(textView.getPaintFlags() | 8);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cl5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithMobile.i3(this.a, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dl5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithMobile.j3(this.a, view);
            }
        });
        ((ImageView) viewFindViewById4).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.el5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithMobile.k3(dialog, this, view);
            }
        });
        StringBuilder sb = new StringBuilder();
        sb.append(n2().b("dl_no", "DL No. : "));
        sb.append(' ');
        String str = this.dlNo;
        Intrinsics.checkNotNull(str);
        sb.append(StringsKt__StringsKt.trim((CharSequence) str).toString());
        ((TextView) viewFindViewById3).setText(sb.toString());
        z2().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fl5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithMobile.l3(this.a, view);
            }
        });
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(null);
        CollectionsKt__MutableCollectionsJVMKt.sort(t2());
        recyclerView.setAdapter(new a(this, t2()));
        dialog.show();
    }

    public static final void h3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void i3(SarthiProcessWithMobile this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.b3();
    }

    public static final void j3(SarthiProcessWithMobile this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) DlServiceDetailsActivity.class);
            intent.putExtra("DL", this$0.dlNo);
            intent.putExtra("dob", this$0.dob);
            intent.putExtra("DLDetails", this$0.l2());
            intent.putExtra("Mobile_no", this$0.C2().l());
            intent.putExtra("lastEndorsedRTO", this$0.lastEndorsedRTO);
            intent.putExtra("lastEndorsedState", this$0.lastEndorsedState);
            intent.putExtra("lastEndorsedRTOCode", this$0.lastEndorsedRTO);
            intent.putExtra("lastEndorseStateCode", this$0.lastEndorseStateCode);
            intent.putExtra("whatServiceRequired", this$0.whatServiceRequired);
            intent.putExtra("multiList", this$0.v2());
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final void k3(Dialog d2, SarthiProcessWithMobile this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        this$0.finish();
    }

    public static final void l3(SarthiProcessWithMobile this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.z2().c(true);
        this$0.q2().m(this$0.u2(), this$0.B2().n());
    }

    public final DlServiceInt A2() {
        DlServiceInt dlServiceInt = this.retrofitService;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final void A3(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.multiListCode = arrayList;
    }

    public final wl5 B2() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final void B3(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.multiListName = arrayList;
    }

    public final ws6 C2() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final void C3(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    /* JADX INFO: renamed from: D2, reason: from getter */
    public final String getState_value() {
        return this.state_value;
    }

    public final void D3(ProgressBar progressBar) {
        Intrinsics.checkNotNullParameter(progressBar, "<set-?>");
        this.pb_pwm = progressBar;
    }

    public final TextView E2() {
        TextView textView = this.submitOtp;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("submitOtp");
        return null;
    }

    public final void E3(ProgressBar progressBar) {
        Intrinsics.checkNotNullParameter(progressBar, "<set-?>");
        this.pr_pwm = progressBar;
    }

    public final TextView F2() {
        TextView textView = this.txt_reset;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txt_reset");
        return null;
    }

    public final void F3(CustomWegetLayout customWegetLayout) {
        Intrinsics.checkNotNullParameter(customWegetLayout, "<set-?>");
        this.Proceed = customWegetLayout;
    }

    public final void G3(String str) {
        this.record_id = str;
    }

    public final void H3(Button button) {
        Intrinsics.checkNotNullParameter(button, "<set-?>");
        this.reset_button = button;
    }

    public final void I3(DlServiceInt dlServiceInt) {
        Intrinsics.checkNotNullParameter(dlServiceInt, "<set-?>");
        this.retrofitService = dlServiceInt;
    }

    public final void J3(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final void K3(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final void L3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.submitOtp = textView;
    }

    public final void M3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txt_reset = textView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, android.widget.TextView] */
    public final void N3(Context context, String mobile_no) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mobile_no, "mobile_no");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.validateotp);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pr_pwm);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        E3((ProgressBar) viewFindViewById);
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewFindViewById2;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        View viewFindViewById3 = dialog.findViewById(R.id.resendOtp);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        objectRef.element = (TextView) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.showmpin);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.ImageView");
        final ImageView imageView2 = (ImageView) viewFindViewById4;
        View viewFindViewById5 = dialog.findViewById(R.id.submitOtp);
        Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.TextView");
        L3((TextView) viewFindViewById5);
        View viewFindViewById6 = dialog.findViewById(R.id.enterOtp);
        Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText = (EditText) viewFindViewById6;
        View viewFindViewById7 = dialog.findViewById(R.id.time_text);
        Intrinsics.checkNotNull(viewFindViewById7, "null cannot be cast to non-null type android.widget.TextView");
        final TextView textView = (TextView) viewFindViewById7;
        View viewFindViewById8 = dialog.findViewById(R.id.txt_reset);
        Intrinsics.checkNotNull(viewFindViewById8, "null cannot be cast to non-null type android.widget.TextView");
        M3((TextView) viewFindViewById8);
        View viewFindViewById9 = dialog.findViewById(R.id.disPlay_mobile);
        Intrinsics.checkNotNull(viewFindViewById9, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById9;
        View viewFindViewById10 = dialog.findViewById(R.id.disPlay);
        Intrinsics.checkNotNull(viewFindViewById10, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById11 = dialog.findViewById(R.id.enter_otp_txt);
        Intrinsics.checkNotNull(viewFindViewById11, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById10).setText(n2().b("otp_verification", getString(R.string.otp_verification)));
        E2().setText(n2().b("vahan_btn_submit", getString(R.string.submit)));
        F2().setText(n2().b("btn_reset", getString(R.string.reset)));
        ((TextView) objectRef.element).setText(n2().b("label_resend_otp", getString(R.string.resend_otp)));
        editText.setHint(n2().b("edit_enter_otp", getString(R.string.enter_otp)));
        ((TextView) viewFindViewById11).setText(n2().b("edit_enter_otp", getString(R.string.enter_otp)));
        try {
            if (mobile_no.length() == 10) {
                StringBuilder sb = new StringBuilder();
                sb.append(n2().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
                sb.append("\n+91 - XXXXXX");
                String strSubstring = mobile_no.substring(6, 10);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(strSubstring);
                textView2.setText(sb.toString());
            } else {
                textView2.setText(n2().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
            }
        } catch (Exception unused) {
            textView2.setText(n2().b("label_otp_sent_to_mobile", getString(R.string.otp_sent)));
        }
        new m(textView, this, objectRef).start();
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gl5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithMobile.O3(editText, imageView2, view);
            }
        });
        ((TextView) objectRef.element).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hl5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithMobile.P3(this.a, textView, objectRef, view);
            }
        });
        E2().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.il5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithMobile.Q3(this.a, editText, view);
            }
        });
        F2().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jl5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithMobile.R3(editText, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kl5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithMobile.S3(dialog, view);
            }
        });
        dialog.show();
    }

    public final String f2(String fdate) {
        Intrinsics.checkNotNullParameter(fdate, "fdate");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy");
        try {
            Date date = simpleDateFormat.parse(fdate);
            Intrinsics.checkNotNullExpressionValue(date, "parse(...)");
            String str = simpleDateFormat2.format(date);
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        } catch (Exception unused) {
            return fdate;
        }
    }

    public final void g2() {
        E2().setAlpha(1.0f);
        F2().setAlpha(1.0f);
        y2().setVisibility(4);
        E2().setClickable(true);
        F2().setClickable(true);
    }

    /* JADX INFO: renamed from: h2, reason: from getter */
    public final String getAllowAddrChangeAtDlservReqst() {
        return this.allowAddrChangeAtDlservReqst;
    }

    public final op5 i2() {
        op5 op5Var = this.binding;
        if (op5Var != null) {
            return op5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    /* JADX INFO: renamed from: j2, reason: from getter */
    public final String getBioRecGenesis() {
        return this.bioRecGenesis;
    }

    /* JADX INFO: renamed from: k2, reason: from getter */
    public final boolean getCOA() {
        return this.COA;
    }

    public final DldetobjX l2() {
        DldetobjX dldetobjX = this.dlDetails;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlDetails");
        return null;
    }

    public final nr1 m2() {
        nr1 nr1Var = this.dlServicesViewModel;
        if (nr1Var != null) {
            return nr1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlServicesViewModel");
        return null;
    }

    public final void m3(op5 op5Var) {
        Intrinsics.checkNotNullParameter(op5Var, "<set-?>");
        this.binding = op5Var;
    }

    public final wa3 n2() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final void n3(boolean z) {
        this.COA = z;
    }

    public final ArrayList o2() {
        ArrayList arrayList = this.listHeaderSteps;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("listHeaderSteps");
        return null;
    }

    public final void o3(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dlDetails = dldetobjX;
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        op5 op5VarC = op5.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(op5VarC, "inflate(...)");
        m3(op5VarC);
        setContentView(i2().b());
        ta3.a.u0(this, i2());
        u3(this);
        I3(DlServiceInt.INSTANCE.a(this));
        J3(new wl5(this));
        K3(new ws6(this));
        r3(new wa3(this));
        B3(new ArrayList());
        s3(new ArrayList());
        A3(new ArrayList());
        w3(FromEligCheck.INSTANCE.b(this));
        v3((ef2) new z(this, new df2(new cf2(r2()))).a(ef2.class));
        B2().q("NA", "N", "NA", "NA");
        if (getIntent() != null) {
            this.bioRecGenesis = String.valueOf(getIntent().getStringExtra("bioRecGenesis"));
            this.lastEndorseRtoCode = String.valueOf(getIntent().getStringExtra("lastEndorsedRTOCode"));
            this.lastEndorseStateCode = String.valueOf(getIntent().getStringExtra("lastEndorseStateCode"));
            this.lastEndorsedState = String.valueOf(getIntent().getStringExtra("lastEndorsedState"));
            this.lastEndorsedRTO = String.valueOf(getIntent().getStringExtra("lastEndorsedRTO"));
            this.state_value = String.valueOf(getIntent().getStringExtra("state_value"));
            this.dob = String.valueOf(getIntent().getStringExtra("dob"));
            this.dlNo = String.valueOf(getIntent().getStringExtra("DL"));
            Serializable serializableExtra = getIntent().getSerializableExtra("DLDetails");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
            o3((DldetobjX) serializableExtra);
            Serializable serializableExtra2 = getIntent().getSerializableExtra("whatServiceRequired");
            Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type java.util.HashMap<kotlin.String?, kotlin.String?>");
            this.whatServiceRequired = (HashMap) serializableExtra2;
            Serializable serializableExtra3 = getIntent().getSerializableExtra("multiList");
            Intrinsics.checkNotNull(serializableExtra3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
            z3((ArrayList) serializableExtra3);
            this.multiCheck = String.valueOf(getIntent().getStringExtra("multiCheck"));
        }
        View viewFindViewById = findViewById(R.id.mob_number);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        y3((EditText) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.reset_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        H3((Button) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.pb_pwm);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        D3((ProgressBar) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.ll_home);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        t3((LinearLayout) viewFindViewById4);
        i2().b.setPaintFlags(i2().b.getPaintFlags() | 8);
        try {
            AppCompatEditText appCompatEditText = i2().n;
            StringBuilder sb = new StringBuilder();
            sb.append("XXXXXX");
            String strSubstring = l2().getBioObj().getBioMobileNo().substring(6, 10);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(strSubstring);
            appCompatEditText.setText(sb.toString());
            this.mobNo = l2().getBioObj().getBioMobileNo();
            i2().h.setAlpha(1.0f);
        } catch (Exception unused) {
            i2().n.setText((CharSequence) null);
        }
        p3((nr1) new z(this, new rq1(new lr1(A2(), this))).a(nr1.class));
        try {
            i2().f.setText(this.dlNo);
            i2().e.setText(n2().b("dl_no", "DL No.") + this.dlNo);
        } catch (Exception unused2) {
        }
        m2().j(this, this.lastEndorseStateCode);
        m2().C().g(this, new mf4() { // from class: com.zepto.pk5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SarthiProcessWithMobile.I2(this.a, (CustomState) obj);
            }
        });
        i2().h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sl5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithMobile.J2(this.a, view);
            }
        });
        i2().b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tl5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithMobile.U2(this.a, view);
            }
        });
        m2().u().g(this, new l(new f()));
        m2().t().g(this, new mf4() { // from class: com.zepto.ul5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SarthiProcessWithMobile.W2(this.a, (String) obj);
            }
        });
        i2().s.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qk5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithMobile.X2(this.a, view);
            }
        });
        i2().t.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rk5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithMobile.Y2(this.a, view);
            }
        });
        m2().E().g(this, new mf4() { // from class: com.zepto.sk5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SarthiProcessWithMobile.Z2(this.a, (OtpVerifyResult) obj);
            }
        });
        m2().w().g(this, new mf4() { // from class: com.zepto.tk5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SarthiProcessWithMobile.a3(this.a, (ResendOtp) obj);
            }
        });
        m2().v().g(this, new mf4() { // from class: com.zepto.uk5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SarthiProcessWithMobile.K2(this.a, (String) obj);
            }
        });
        m2().l().g(this, new mf4() { // from class: com.zepto.vk5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SarthiProcessWithMobile.L2(this.a, (DlLastRtoDetailsDto) obj);
            }
        });
        m2().m().g(this, new mf4() { // from class: com.zepto.al5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SarthiProcessWithMobile.M2(this.a, (String) obj);
            }
        });
        i2().n.addTextChangedListener(new c());
        i2().A.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ll5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithMobile.N2(this.a, view);
            }
        });
        i2().o.h.setVisibility(8);
        if (Intrinsics.areEqual(B2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            TextView textView = i2().o.g;
            String strB = n2().b("dl_services", getString(R.string.dl_services));
            Intrinsics.checkNotNull(strB);
            textView.setText(strB);
            i2().o.f.setVisibility(8);
            i2().o.g.setPaintFlags(i2().o.g.getPaintFlags() | 8);
        } else {
            i2().o.g.setText(B2().k());
            i2().o.f.setVisibility(8);
        }
        i2().o.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ol5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithMobile.O2(this.a, view);
            }
        });
        q2().k().g(this, new mf4() { // from class: com.zepto.pl5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SarthiProcessWithMobile.R2(this.a, (ServiceCheckPojo) obj);
            }
        });
        q2().i().g(this, new mf4() { // from class: com.zepto.ql5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SarthiProcessWithMobile.S2(this.a, (String) obj);
            }
        });
        i2().o.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rl5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SarthiProcessWithMobile.T2(this.a, view);
            }
        });
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() {
        super.onResume();
        try {
            if (Intrinsics.areEqual(B2().i(), "U") && B2().j().length() > 0) {
                AppCompatEditText appCompatEditText = i2().n;
                StringBuilder sb = new StringBuilder();
                sb.append("XXXXXX");
                String strSubstring = B2().j().substring(6, 10);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(strSubstring);
                appCompatEditText.setText(sb.toString());
                this.mobNo = StringsKt__StringsKt.trim((CharSequence) B2().j()).toString();
            }
        } catch (Exception unused) {
        }
        i2().n.setFocusable(String.valueOf(i2().n.getText()).length() <= 5);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        Gson gson = new Gson();
        CombineReq combineReq = new CombineReq(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 1023, null);
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        editorEdit.putString("MultiService", gson.toJson(combineReq));
        editorEdit.commit();
        SharedPreferences.Editor editorEdit2 = getSharedPreferences("MultiService", 0).edit();
        editorEdit2.clear();
        editorEdit2.apply();
    }

    public final Context p2() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final void p3(nr1 nr1Var) {
        Intrinsics.checkNotNullParameter(nr1Var, "<set-?>");
        this.dlServicesViewModel = nr1Var;
    }

    public final ef2 q2() {
        ef2 ef2Var = this.mFormEligVM;
        if (ef2Var != null) {
            return ef2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mFormEligVM");
        return null;
    }

    public final void q3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.flag = str;
    }

    public final FromEligCheck r2() {
        FromEligCheck fromEligCheck = this.mFormsInterface;
        if (fromEligCheck != null) {
            return fromEligCheck;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mFormsInterface");
        return null;
    }

    public final void r3(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    /* JADX INFO: renamed from: s2, reason: from getter */
    public final String getMultiCheck() {
        return this.multiCheck;
    }

    public final void s3(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.listHeaderSteps = arrayList;
    }

    public final ArrayList t2() {
        ArrayList arrayList = this.multiList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiList");
        return null;
    }

    public final void t3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.ll_home = linearLayout;
    }

    public final ArrayList u2() {
        ArrayList arrayList = this.multiListCode;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiListCode");
        return null;
    }

    public final void u3(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final ArrayList v2() {
        ArrayList arrayList = this.multiListName;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiListName");
        return null;
    }

    public final void v3(ef2 ef2Var) {
        Intrinsics.checkNotNullParameter(ef2Var, "<set-?>");
        this.mFormEligVM = ef2Var;
    }

    public final ProgressDialog w2() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final void w3(FromEligCheck fromEligCheck) {
        Intrinsics.checkNotNullParameter(fromEligCheck, "<set-?>");
        this.mFormsInterface = fromEligCheck;
    }

    public final ProgressBar x2() {
        ProgressBar progressBar = this.pb_pwm;
        if (progressBar != null) {
            return progressBar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pb_pwm");
        return null;
    }

    public final void x3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobNo = str;
    }

    public final ProgressBar y2() {
        ProgressBar progressBar = this.pr_pwm;
        if (progressBar != null) {
            return progressBar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pr_pwm");
        return null;
    }

    public final void y3(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.mob_number = editText;
    }

    public final CustomWegetLayout z2() {
        CustomWegetLayout customWegetLayout = this.Proceed;
        if (customWegetLayout != null) {
            return customWegetLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("Proceed");
        return null;
    }

    public final void z3(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.multiList = arrayList;
    }
}
