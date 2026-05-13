package com.nic.mparivahan.dlservices.ui.changeName;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.WindowMetrics;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.gson.Gson;
import com.nic.mparivahan.ClServices.Pojo.NewClPojo.SpinnerPojo;
import com.nic.mparivahan.DLServicesAuth.View.DlServiceDetailsActivity;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.DlCombineServices.CombineReq;
import com.nic.mparivahan.DlCombineServices.CombineServiceInterface;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.DlLog.DlLogCapture;
import com.nic.mparivahan.dlservices.data.model.AppCatPojo;
import com.nic.mparivahan.dlservices.data.model.DlSubmitResult;
import com.nic.mparivahan.dlservices.data.model.ResultItemSubmit;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetReasonsTransWiseResponse;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.ReasonsMasterItem;
import com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity;
import com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName;
import com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity;
import com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity;
import com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity;
import com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity;
import com.nic.mparivahan.dlservices.ui.hillService.HillReligion;
import com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity;
import com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import com.nic.mparivahan.dlservices.widget.MyTextView;
import com.zepto.cs0;
import com.zepto.d86;
import com.zepto.ds0;
import com.zepto.fs0;
import com.zepto.g7;
import com.zepto.j54;
import com.zepto.k76;
import com.zepto.mf4;
import com.zepto.o40;
import com.zepto.oq;
import com.zepto.qd0;
import com.zepto.rb1;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.ws6;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bì\u0001\u0010í\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0003J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J6\u0010\u0013\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0011H\u0002J\u0012\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014J\u0010\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\rR\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R \u0010-\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010*\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R*\u00106\u001a\n /*\u0004\u0018\u00010.0.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010G\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u00108\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010K\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u00108\u001a\u0004\bI\u0010D\"\u0004\bJ\u0010FR$\u0010O\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u00108\u001a\u0004\bM\u0010D\"\u0004\bN\u0010FR\"\u0010S\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u00108\u001a\u0004\bQ\u0010D\"\u0004\bR\u0010FR\"\u0010W\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u00108\u001a\u0004\bU\u0010D\"\u0004\bV\u0010FR\"\u0010[\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u00108\u001a\u0004\bY\u0010D\"\u0004\bZ\u0010FR\"\u0010_\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u00108\u001a\u0004\b]\u0010D\"\u0004\b^\u0010FR\"\u0010c\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u00108\u001a\u0004\ba\u0010D\"\u0004\bb\u0010FR\"\u0010k\u001a\u00020d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR2\u0010s\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r0l8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010{\u001a\u00020t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\"\u0010\u007f\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b|\u00108\u001a\u0004\b}\u0010D\"\u0004\b~\u0010FR)\u0010\u0086\u0001\u001a\u00030\u0080\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0081\u0001\u0010&\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R&\u0010\u008a\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0087\u0001\u00108\u001a\u0005\b\u0088\u0001\u0010D\"\u0005\b\u0089\u0001\u0010FR&\u0010\u008e\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008b\u0001\u00108\u001a\u0005\b\u008c\u0001\u0010D\"\u0005\b\u008d\u0001\u0010FR&\u0010\u0092\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008f\u0001\u00108\u001a\u0005\b\u0090\u0001\u0010D\"\u0005\b\u0091\u0001\u0010FR&\u0010\u0096\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0093\u0001\u00108\u001a\u0005\b\u0094\u0001\u0010D\"\u0005\b\u0095\u0001\u0010FR&\u0010\u009a\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0097\u0001\u00108\u001a\u0005\b\u0098\u0001\u0010D\"\u0005\b\u0099\u0001\u0010FR&\u0010\u009e\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009b\u0001\u00108\u001a\u0005\b\u009c\u0001\u0010D\"\u0005\b\u009d\u0001\u0010FR&\u0010¢\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009f\u0001\u00108\u001a\u0005\b \u0001\u0010D\"\u0005\b¡\u0001\u0010FR&\u0010¦\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b£\u0001\u00108\u001a\u0005\b¤\u0001\u0010D\"\u0005\b¥\u0001\u0010FR&\u0010ª\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b§\u0001\u00108\u001a\u0005\b¨\u0001\u0010D\"\u0005\b©\u0001\u0010FR&\u0010®\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b«\u0001\u00108\u001a\u0005\b¬\u0001\u0010D\"\u0005\b\u00ad\u0001\u0010FR*\u0010¶\u0001\u001a\u00030¯\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R&\u0010º\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b·\u0001\u00108\u001a\u0005\b¸\u0001\u0010D\"\u0005\b¹\u0001\u0010FR/\u0010Á\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\u00118\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001\"\u0006\b¿\u0001\u0010À\u0001R/\u0010Å\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\u00118\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÂ\u0001\u0010¼\u0001\u001a\u0006\bÃ\u0001\u0010¾\u0001\"\u0006\bÄ\u0001\u0010À\u0001R)\u0010Ë\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÆ\u0001\u0010\u0081\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001\"\u0006\bÉ\u0001\u0010Ê\u0001R)\u0010Ï\u0001\u001a\u00030\u0080\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bÌ\u0001\u0010&\u001a\u0006\bÍ\u0001\u0010\u0083\u0001\"\u0006\bÎ\u0001\u0010\u0085\u0001R)\u0010Ó\u0001\u001a\u00030\u0080\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bÐ\u0001\u0010&\u001a\u0006\bÑ\u0001\u0010\u0083\u0001\"\u0006\bÒ\u0001\u0010\u0085\u0001R&\u0010×\u0001\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÔ\u0001\u00108\u001a\u0005\bÕ\u0001\u0010D\"\u0005\bÖ\u0001\u0010FR(\u0010Û\u0001\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bØ\u0001\u00108\u001a\u0005\bÙ\u0001\u0010D\"\u0005\bÚ\u0001\u0010FR(\u0010ß\u0001\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÜ\u0001\u00108\u001a\u0005\bÝ\u0001\u0010D\"\u0005\bÞ\u0001\u0010FR\u001a\u0010ã\u0001\u001a\u00030à\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bá\u0001\u0010â\u0001R*\u0010ë\u0001\u001a\u00030ä\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bå\u0001\u0010æ\u0001\u001a\u0006\bç\u0001\u0010è\u0001\"\u0006\bé\u0001\u0010ê\u0001¨\u0006î\u0001"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/changeName/ChangeOfName;", "Lcom/zepto/o40;", "", "N1", "o2", "r2", "d2", "t2", "", "n2", "v2", "Landroid/content/Intent;", "intent", "", "lastEndRTO", "lastEndState", "purCode", "Ljava/util/ArrayList;", "multiList", "m2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "message", "u2", "Lcom/zepto/g7;", "F", "Lcom/zepto/g7;", "binding", "Lcom/zepto/wa3;", "G", "Lcom/zepto/wa3;", "langSession", "Lcom/zepto/rb1;", "H", "Lcom/zepto/rb1;", "viewModel", "Lcom/zepto/qd0;", "I", "Lcom/zepto/qd0;", "chnageDobViewModel", "", "Lcom/nic/mparivahan/dlservices/data/model/duplicatedl/ReasonsMasterItem;", "J", "Ljava/util/List;", "mReasonList", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "K", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "L", "Ljava/lang/String;", "willingToDonate", "Lcom/zepto/ws6;", "M", "Lcom/zepto/ws6;", "Y1", "()Lcom/zepto/ws6;", "C2", "(Lcom/zepto/ws6;)V", "mSessionmanger", "N", "Q1", "()Ljava/lang/String;", "setDlNo", "(Ljava/lang/String;)V", "dlNo", "O", "R1", "setDob", "dob", "P", "Z1", "setMobile_no", "Mobile_no", "Q", "T1", "setLastEndorseRto", "lastEndorseRto", "R", "U1", "setLastEndorseState", "lastEndorseState", "S", "S1", "setLastEndorseRTOCode", "lastEndorseRTOCode", "T", "V1", "setLastEndorseStateCode", "lastEndorseStateCode", "U", "getState_value", "setState_value", "state_value", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "V", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "P1", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "y2", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "dlDetails", "Ljava/util/HashMap;", "W", "Ljava/util/HashMap;", "getWhatServiceRequired", "()Ljava/util/HashMap;", "setWhatServiceRequired", "(Ljava/util/HashMap;)V", "whatServiceRequired", "Lcom/zepto/wl5;", "X", "Lcom/zepto/wl5;", "c2", "()Lcom/zepto/wl5;", "G2", "(Lcom/zepto/wl5;)V", "sarthiSession", "Y", "b2", "F2", "relationCode", "", "Z", "O1", "()I", "x2", "(I)V", "code", "a0", "getReaonName", "E2", "reaonName", "b0", "getForm1FlagDLserReq", "setForm1FlagDLserReq", "form1FlagDLserReq", "c0", "getSubmitFormOne", "setSubmitFormOne", "submitFormOne", "d0", "getAString", "setAString", "aString", "e0", "getBString", "setBString", "bString", "f0", "getCString", "setCString", "cString", "g0", "getDString", "setDString", "dString", "h0", "getEString", "setEString", "eString", "i0", "getFString", "setFString", "fString", "j0", "getGString", "setGString", "gString", "Landroid/content/Context;", "k0", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "B2", "(Landroid/content/Context;)V", "mContext", "l0", "getAppCategory", "w2", "appCategory", "m0", "Ljava/util/ArrayList;", "a2", "()Ljava/util/ArrayList;", "D2", "(Ljava/util/ArrayList;)V", "multiListName", "n0", "W1", "z2", "listHeaderSteps", "o0", "getCOA", "()Z", "setCOA", "(Z)V", "COA", "p0", "getWidthPixels", "setWidthPixels", "widthPixels", "q0", "getSerialNo", "setSerialNo", "serialNo", "r0", "getMetaflag", "setMetaflag", "metaflag", "s0", "getBioRecGenesis", "setBioRecGenesis", "bioRecGenesis", "t0", "getAllowAddrChangeAtDlservReqst", "setAllowAddrChangeAtDlservReqst", "allowAddrChangeAtDlservReqst", "Lcom/zepto/fs0;", "u0", "Lcom/zepto/fs0;", "mCombineViewModel", "Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;", "v0", "Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;", "X1", "()Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;", "A2", "(Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;)V", "mCombineServiceInterface", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nChangeOfName.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeOfName.kt\ncom/nic/mparivahan/dlservices/ui/changeName/ChangeOfName\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1747:1\n1855#2,2:1748\n260#3:1750\n260#3:1751\n*S KotlinDebug\n*F\n+ 1 ChangeOfName.kt\ncom/nic/mparivahan/dlservices/ui/changeName/ChangeOfName\n*L\n924#1:1748,2\n962#1:1750\n979#1:1751\n*E\n"})
public final class ChangeOfName extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public g7 binding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public rb1 viewModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public qd0 chnageDobViewModel;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public List mReasonList;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ws6 mSessionmanger;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String dlNo;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String dob;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public DldetobjX dlDetails;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String relationCode;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public int code;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public ArrayList multiListName;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public ArrayList listHeaderSteps;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public boolean COA;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public int widthPixels;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public int serialNo;

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    public fs0 mCombineViewModel;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public CombineServiceInterface mCombineServiceInterface;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String willingToDonate = "Y";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String Mobile_no = "";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String lastEndorseRto = "";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String lastEndorseState = "";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String lastEndorseRTOCode = "";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String lastEndorseStateCode = "";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String state_value = "";

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public HashMap whatServiceRequired = new HashMap();

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String reaonName = "NA";

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String form1FlagDLserReq = "N";

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public String submitFormOne = "N";

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public String aString = "";

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public String bString = "";

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public String cString = "";

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public String dString = "";

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public String eString = "";

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public String fString = "";

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public String gString = "N";

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public String appCategory = "0";

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public String metaflag = "";

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    public String bioRecGenesis = "";

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    public String allowAddrChangeAtDlservReqst = "";

    public static final class a implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ Ref.ObjectRef b;

        public a(Ref.ObjectRef objectRef) {
            this.b = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            ChangeOfName.this.w2(((AppCatPojo) ((ArrayList) this.b.element).get(i)).getAppCode());
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ Ref.ObjectRef b;

        public b(Ref.ObjectRef objectRef) {
            this.b = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            ChangeOfName.this.F2(((SpinnerPojo) ((ArrayList) this.b.element).get(i)).getCode());
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(GetReasonsTransWiseResponse getReasonsTransWiseResponse) {
            try {
                if (StringsKt__StringsJVMKt.equals$default(getReasonsTransWiseResponse.getStatusCode(), "00", false, 2, null)) {
                    ChangeOfName.this.mReasonList = getReasonsTransWiseResponse.getReasonsMaster();
                } else {
                    ChangeOfName.this.u2(getReasonsTransWiseResponse.getStatusDesc());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetReasonsTransWiseResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        public final void a(GetAckDetForGivenDLNumberResponse getAckDetForGivenDLNumberResponse) throws Throwable {
            List<ResultItemSubmit> result;
            g7 g7Var = ChangeOfName.this.binding;
            wa3 wa3Var = null;
            if (g7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                g7Var = null;
            }
            g7Var.h.c(false);
            try {
                DlSubmitResult dlSubmitresult = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                if (!StringsKt__StringsJVMKt.equals$default(dlSubmitresult != null ? dlSubmitresult.getStatusCode() : null, "00", false, 2, null)) {
                    DlSubmitResult dlSubmitresult2 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                    String reqStatus = dlSubmitresult2 != null ? dlSubmitresult2.getReqStatus() : null;
                    if (reqStatus != null && reqStatus.length() != 0) {
                        ChangeOfName changeOfName = ChangeOfName.this;
                        DlSubmitResult dlSubmitresult3 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                        String reqStatus2 = dlSubmitresult3 != null ? dlSubmitresult3.getReqStatus() : null;
                        Intrinsics.checkNotNull(reqStatus2);
                        changeOfName.u2(reqStatus2);
                        return;
                    }
                    ChangeOfName changeOfName2 = ChangeOfName.this;
                    wa3 wa3Var2 = changeOfName2.langSession;
                    if (wa3Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("langSession");
                        wa3Var2 = null;
                    }
                    changeOfName2.u2(wa3Var2.b("service_is_not_present", ChangeOfName.this.getString(R.string.unable_to_get_details)));
                    return;
                }
                DlSubmitResult dlSubmitresult4 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                if (dlSubmitresult4 == null || (result = dlSubmitresult4.getResult()) == null || !(!result.isEmpty())) {
                    return;
                }
                DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity = new DLServiceAcknowlegementActivity();
                ResultItemSubmit resultItemSubmit = getAckDetForGivenDLNumberResponse.getDlSubmitresult().getResult().get(0);
                if (resultItemSubmit != null) {
                    ChangeOfName changeOfName3 = ChangeOfName.this;
                    try {
                        DlLogCapture.Companion companion = DlLogCapture.INSTANCE;
                        String applicationDate = resultItemSubmit.getApplicationDate();
                        String applicationNo = resultItemSubmit.getApplicationNo();
                        Intrinsics.checkNotNull(applicationNo);
                        long j = Long.parseLong(applicationNo);
                        int i = Integer.parseInt(changeOfName3.Y1().k());
                        String dateofBirth = resultItemSubmit.getDateofBirth();
                        String dlno = resultItemSubmit.getDlno();
                        Intrinsics.checkNotNull(dlno);
                        String applicantGender = resultItemSubmit.getApplicantGender();
                        String mobile_no = changeOfName3.getMobile_no();
                        Intrinsics.checkNotNull(mobile_no);
                        companion.a(changeOfName3, "1234", "S", applicationDate, j, i, dateofBirth, dlno, "N", "N", applicantGender, mobile_no, false, "526", changeOfName3.getLastEndorseRTOCode(), changeOfName3.getLastEndorseStateCode());
                    } catch (Exception unused) {
                    }
                    if (!Intrinsics.areEqual(changeOfName3.c2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                        changeOfName3.D2(new ArrayList());
                        changeOfName3.a2().add(changeOfName3.c2().k());
                    }
                    dLServiceAcknowlegementActivity.K2(changeOfName3, resultItemSubmit, changeOfName3.getLastEndorseRTOCode(), changeOfName3.P1(), changeOfName3.getDlNo(), changeOfName3.getDob(), changeOfName3.getMobile_no(), changeOfName3.getLastEndorseRto(), changeOfName3.getLastEndorseState(), changeOfName3.getLastEndorseStateCode(), changeOfName3.a2());
                }
            } catch (Exception unused2) {
                g7 g7Var2 = ChangeOfName.this.binding;
                if (g7Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    g7Var2 = null;
                }
                g7Var2.h.c(false);
                ChangeOfName changeOfName4 = ChangeOfName.this;
                wa3 wa3Var3 = changeOfName4.langSession;
                if (wa3Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("langSession");
                } else {
                    wa3Var = wa3Var3;
                }
                changeOfName4.u2(wa3Var.b("service_is_not_present", ChangeOfName.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((GetAckDetForGivenDLNumberResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e implements TextWatcher {
        public e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkNotNull(charSequence);
            if (charSequence.length() > 0) {
                g7 g7Var = ChangeOfName.this.binding;
                g7 g7Var2 = null;
                if (g7Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    g7Var = null;
                }
                if (g7Var.m.getText().toString().length() <= 0) {
                    g7 g7Var3 = ChangeOfName.this.binding;
                    if (g7Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        g7Var3 = null;
                    }
                    EditText editText = g7Var3.D;
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) charSequence);
                    sb.append(' ');
                    g7 g7Var4 = ChangeOfName.this.binding;
                    if (g7Var4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        g7Var4 = null;
                    }
                    sb.append((Object) g7Var4.m.getText());
                    g7 g7Var5 = ChangeOfName.this.binding;
                    if (g7Var5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        g7Var2 = g7Var5;
                    }
                    sb.append((Object) g7Var2.i.getText());
                    editText.setText(sb.toString());
                    return;
                }
                g7 g7Var6 = ChangeOfName.this.binding;
                if (g7Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    g7Var6 = null;
                }
                EditText editText2 = g7Var6.D;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) charSequence);
                sb2.append(' ');
                g7 g7Var7 = ChangeOfName.this.binding;
                if (g7Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    g7Var7 = null;
                }
                sb2.append((Object) g7Var7.m.getText());
                sb2.append(' ');
                g7 g7Var8 = ChangeOfName.this.binding;
                if (g7Var8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    g7Var2 = g7Var8;
                }
                sb2.append((Object) g7Var2.i.getText());
                editText2.setText(sb2.toString());
            }
        }
    }

    public static final class f implements TextWatcher {
        public f() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (String.valueOf(charSequence).length() > 0) {
                g7 g7Var = ChangeOfName.this.binding;
                g7 g7Var2 = null;
                if (g7Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    g7Var = null;
                }
                EditText editText = g7Var.D;
                StringBuilder sb = new StringBuilder();
                g7 g7Var3 = ChangeOfName.this.binding;
                if (g7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    g7Var3 = null;
                }
                sb.append((Object) g7Var3.e.getText());
                sb.append(' ');
                sb.append((Object) charSequence);
                sb.append(' ');
                g7 g7Var4 = ChangeOfName.this.binding;
                if (g7Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    g7Var2 = g7Var4;
                }
                sb.append((Object) g7Var2.i.getText());
                editText.setText(sb.toString());
            }
        }
    }

    public static final class g implements TextWatcher {
        public g() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (String.valueOf(charSequence).length() > 0) {
                g7 g7Var = ChangeOfName.this.binding;
                g7 g7Var2 = null;
                if (g7Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    g7Var = null;
                }
                if (g7Var.m.getText().toString().length() <= 0) {
                    g7 g7Var3 = ChangeOfName.this.binding;
                    if (g7Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        g7Var3 = null;
                    }
                    EditText editText = g7Var3.D;
                    StringBuilder sb = new StringBuilder();
                    g7 g7Var4 = ChangeOfName.this.binding;
                    if (g7Var4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        g7Var4 = null;
                    }
                    sb.append((Object) g7Var4.e.getText());
                    sb.append(' ');
                    g7 g7Var5 = ChangeOfName.this.binding;
                    if (g7Var5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        g7Var2 = g7Var5;
                    }
                    sb.append((Object) g7Var2.m.getText());
                    sb.append((Object) charSequence);
                    editText.setText(sb.toString());
                    return;
                }
                g7 g7Var6 = ChangeOfName.this.binding;
                if (g7Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    g7Var6 = null;
                }
                EditText editText2 = g7Var6.D;
                StringBuilder sb2 = new StringBuilder();
                g7 g7Var7 = ChangeOfName.this.binding;
                if (g7Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    g7Var7 = null;
                }
                sb2.append((Object) g7Var7.e.getText());
                sb2.append(' ');
                g7 g7Var8 = ChangeOfName.this.binding;
                if (g7Var8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    g7Var2 = g7Var8;
                }
                sb2.append((Object) g7Var2.m.getText());
                sb2.append(' ');
                sb2.append((Object) charSequence);
                editText2.setText(sb2.toString());
            }
        }
    }

    public static final class h implements d86.b {
        public h() {
        }

        @Override // com.zepto.d86.b
        public void a(String str, int i) {
            ReasonsMasterItem reasonsMasterItem;
            ReasonsMasterItem reasonsMasterItem2;
            ChangeOfName changeOfName = ChangeOfName.this;
            List list = changeOfName.mReasonList;
            g7 g7Var = null;
            Integer reasonCode = (list == null || (reasonsMasterItem2 = (ReasonsMasterItem) list.get(i)) == null) ? null : reasonsMasterItem2.getReasonCode();
            Intrinsics.checkNotNull(reasonCode);
            changeOfName.x2(reasonCode.intValue());
            ChangeOfName changeOfName2 = ChangeOfName.this;
            List list2 = changeOfName2.mReasonList;
            String reasonName = (list2 == null || (reasonsMasterItem = (ReasonsMasterItem) list2.get(i)) == null) ? null : reasonsMasterItem.getReasonName();
            Intrinsics.checkNotNull(reasonName);
            changeOfName2.E2(reasonName);
            g7 g7Var2 = ChangeOfName.this.binding;
            if (g7Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                g7Var2 = null;
            }
            g7Var2.f.setText(str);
            g7 g7Var3 = ChangeOfName.this.binding;
            if (g7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                g7Var3 = null;
            }
            g7Var3.f.setContentDescription("" + ChangeOfName.this.getCode());
            g7 g7Var4 = ChangeOfName.this.binding;
            if (g7Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                g7Var4 = null;
            }
            if (StringsKt__StringsJVMKt.equals(g7Var4.f.getText().toString(), "Miscellaneous", true)) {
                g7 g7Var5 = ChangeOfName.this.binding;
                if (g7Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    g7Var = g7Var5;
                }
                g7Var.g.setVisibility(0);
                return;
            }
            g7 g7Var6 = ChangeOfName.this.binding;
            if (g7Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                g7Var = g7Var6;
            }
            g7Var.g.setVisibility(8);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v44, types: [T, java.util.ArrayList] */
    private final void d2() {
        this.viewModel = (rb1) new z(this).a(rb1.class);
        g7 g7Var = null;
        if (getIntent() != null) {
            try {
                this.dlNo = String.valueOf(getIntent().getStringExtra("DL"));
                this.dob = String.valueOf(getIntent().getStringExtra("dob"));
                this.Mobile_no = String.valueOf(getIntent().getStringExtra("Mobile_no"));
                Serializable serializableExtra = getIntent().getSerializableExtra("DLDetails");
                Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
                y2((DldetobjX) serializableExtra);
                String stringExtra = getIntent().getStringExtra("lastEndorsedRTO");
                Intrinsics.checkNotNull(stringExtra, "null cannot be cast to non-null type kotlin.String");
                this.lastEndorseRto = stringExtra;
                String stringExtra2 = getIntent().getStringExtra("lastEndorsedRTOCode");
                Intrinsics.checkNotNull(stringExtra2, "null cannot be cast to non-null type kotlin.String");
                this.lastEndorseRTOCode = stringExtra2;
                String stringExtra3 = getIntent().getStringExtra("lastEndorsedState");
                Intrinsics.checkNotNull(stringExtra3, "null cannot be cast to non-null type kotlin.String");
                this.lastEndorseState = stringExtra3;
                String stringExtra4 = getIntent().getStringExtra("lastEndorseStateCode");
                Intrinsics.checkNotNull(stringExtra4, "null cannot be cast to non-null type kotlin.String");
                this.lastEndorseStateCode = stringExtra4;
                String stringExtra5 = getIntent().getStringExtra("state_value");
                Intrinsics.checkNotNull(stringExtra5, "null cannot be cast to non-null type kotlin.String");
                this.state_value = stringExtra5;
                Serializable serializableExtra2 = getIntent().getSerializableExtra("whatServiceRequired");
                Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type java.util.HashMap<kotlin.String?, kotlin.String?>");
                this.whatServiceRequired = (HashMap) serializableExtra2;
                g7 g7Var2 = this.binding;
                if (g7Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    g7Var2 = null;
                }
                g7Var2.c.setText("DL No. : " + this.dlNo);
            } catch (Exception unused) {
            }
            if (Intrinsics.areEqual(c2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                try {
                    this.serialNo = getIntent().getIntExtra("serialNo", 0);
                    Serializable serializableExtra3 = getIntent().getSerializableExtra("multiList");
                    Intrinsics.checkNotNull(serializableExtra3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                    D2((ArrayList) serializableExtra3);
                    Serializable serializableExtra4 = getIntent().getSerializableExtra("listHeaderSteps");
                    Intrinsics.checkNotNull(serializableExtra4, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                    z2((ArrayList) serializableExtra4);
                    Serializable serializableExtra5 = getIntent().getSerializableExtra("COA");
                    Intrinsics.checkNotNull(serializableExtra5, "null cannot be cast to non-null type kotlin.Boolean");
                    this.COA = ((Boolean) serializableExtra5).booleanValue();
                    String stringExtra6 = getIntent().getStringExtra("metaflag");
                    Intrinsics.checkNotNull(stringExtra6, "null cannot be cast to non-null type kotlin.String");
                    this.metaflag = stringExtra6;
                    this.bioRecGenesis = String.valueOf(getIntent().getStringExtra("bioRecGenesis"));
                    this.allowAddrChangeAtDlservReqst = String.valueOf(getIntent().getStringExtra("allowAddrChangeAtDlservReqst"));
                    A2(CombineServiceInterface.INSTANCE.a(this));
                    this.mCombineViewModel = (fs0) new z(this, new ds0(new cs0(X1()))).a(fs0.class);
                    if (Build.VERSION.SDK_INT >= 30) {
                        WindowMetrics maximumWindowMetrics = getWindowManager().getMaximumWindowMetrics();
                        Intrinsics.checkNotNullExpressionValue(maximumWindowMetrics, "getMaximumWindowMetrics(...)");
                        Rect bounds = maximumWindowMetrics.getBounds();
                        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
                        this.widthPixels = bounds.right;
                    } else {
                        this.widthPixels = getResources().getDisplayMetrics().widthPixels;
                    }
                    if (this.serialNo == a2().size()) {
                        g7 g7Var3 = this.binding;
                        if (g7Var3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            g7Var3 = null;
                        }
                        g7Var3.z.setVisibility(0);
                        g7 g7Var4 = this.binding;
                        if (g7Var4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            g7Var4 = null;
                        }
                        g7Var4.b.setVisibility(0);
                        g7 g7Var5 = this.binding;
                        if (g7Var5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            g7Var5 = null;
                        }
                        CustomWegetLayout customWegetLayout = g7Var5.h;
                        wa3 wa3Var = this.langSession;
                        if (wa3Var == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("langSession");
                            wa3Var = null;
                        }
                        customWegetLayout.setText(wa3Var.b("vahan_btn_submit", "Submit"));
                    } else {
                        g7 g7Var6 = this.binding;
                        if (g7Var6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            g7Var6 = null;
                        }
                        g7Var6.z.setVisibility(8);
                        g7 g7Var7 = this.binding;
                        if (g7Var7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            g7Var7 = null;
                        }
                        g7Var7.b.setVisibility(8);
                        g7 g7Var8 = this.binding;
                        if (g7Var8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            g7Var8 = null;
                        }
                        CustomWegetLayout customWegetLayout2 = g7Var8.h;
                        wa3 wa3Var2 = this.langSession;
                        if (wa3Var2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("langSession");
                            wa3Var2 = null;
                        }
                        customWegetLayout2.setText(wa3Var2.b("btn_dl_serv_next", "Next"));
                    }
                    if (Intrinsics.areEqual(c2().b(), VContant.MULTISERVICE_PURPOSE_CODE) && W1().size() > 1) {
                        g7 g7Var9 = this.binding;
                        if (g7Var9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            g7Var9 = null;
                        }
                        g7Var9.o.setLayoutManager(new LinearLayoutManager(this, 0, false));
                        ArrayList arrayListW1 = W1();
                        int i2 = this.serialNo;
                        int i3 = this.widthPixels;
                        wa3 wa3Var3 = this.langSession;
                        if (wa3Var3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("langSession");
                            wa3Var3 = null;
                        }
                        String strB = wa3Var3.b("change_name_dl", "Change of Name in DL");
                        Intrinsics.checkNotNull(strB);
                        k76 k76Var = new k76(arrayListW1, this, i2, i3, strB);
                        g7 g7Var10 = this.binding;
                        if (g7Var10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            g7Var10 = null;
                        }
                        g7Var10.o.setAdapter(k76Var);
                    }
                } catch (Exception unused2) {
                }
            }
            if (Intrinsics.areEqual(c2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                try {
                    if (W1().size() == 1) {
                        g7 g7Var11 = this.binding;
                        if (g7Var11 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            g7Var11 = null;
                        }
                        g7Var11.n.g.setText((CharSequence) W1().get(0));
                        g7 g7Var12 = this.binding;
                        if (g7Var12 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            g7Var12 = null;
                        }
                        g7Var12.n.f.setVisibility(8);
                    } else {
                        g7 g7Var13 = this.binding;
                        if (g7Var13 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            g7Var13 = null;
                        }
                        TextView textView = g7Var13.n.g;
                        wa3 wa3Var4 = this.langSession;
                        if (wa3Var4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("langSession");
                            wa3Var4 = null;
                        }
                        String strB2 = wa3Var4.b("dl_services", getString(R.string.dl_services));
                        Intrinsics.checkNotNull(strB2);
                        textView.setText(strB2);
                        g7 g7Var14 = this.binding;
                        if (g7Var14 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            g7Var14 = null;
                        }
                        g7Var14.n.f.setVisibility(8);
                        g7 g7Var15 = this.binding;
                        if (g7Var15 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            g7Var15 = null;
                        }
                        TextView textView2 = g7Var15.n.g;
                        g7 g7Var16 = this.binding;
                        if (g7Var16 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            g7Var16 = null;
                        }
                        textView2.setPaintFlags(g7Var16.n.g.getPaintFlags() | 8);
                    }
                } catch (Exception unused3) {
                }
            } else {
                g7 g7Var17 = this.binding;
                if (g7Var17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    g7Var17 = null;
                }
                g7Var17.n.g.setText(c2().k());
                g7 g7Var18 = this.binding;
                if (g7Var18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    g7Var18 = null;
                }
                g7Var18.n.f.setVisibility(8);
            }
        }
        this.chnageDobViewModel = (qd0) new z(this).a(qd0.class);
        if (com.nic.mparivahan.a.a.a(this)) {
            rb1 rb1Var = this.viewModel;
            if (rb1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                rb1Var = null;
            }
            rb1Var.r("526");
        } else {
            Context applicationContext = getApplicationContext();
            wa3 wa3Var5 = this.langSession;
            if (wa3Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                wa3Var5 = null;
            }
            Toast.makeText(applicationContext, wa3Var5.b("service_is_not_present", getString(R.string.unable_to_get_details)), 0).show();
        }
        g7 g7Var19 = this.binding;
        if (g7Var19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var19 = null;
        }
        g7Var19.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ci0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfName.h2(this.a, view);
            }
        });
        g7 g7Var20 = this.binding;
        if (g7Var20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var20 = null;
        }
        g7Var20.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.di0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfName.i2(this.a, view);
            }
        });
        g7 g7Var21 = this.binding;
        if (g7Var21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var21 = null;
        }
        g7Var21.q.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ei0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfName.j2(this.a, view);
            }
        });
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? arrayList = new ArrayList();
        objectRef.element = arrayList;
        arrayList.add(0, new SpinnerPojo("0", "Select relation"));
        ((ArrayList) objectRef.element).add(1, new SpinnerPojo("F", "Father Name"));
        ((ArrayList) objectRef.element).add(2, new SpinnerPojo("M", "Mother Name"));
        ((ArrayList) objectRef.element).add(3, new SpinnerPojo("H", "Husband Name"));
        ((ArrayList) objectRef.element).add(3, new SpinnerPojo("G", "Guardian Name"));
        j54 j54Var = new j54(this, (ArrayList) objectRef.element);
        g7 g7Var22 = this.binding;
        if (g7Var22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var22 = null;
        }
        g7Var22.v.setAdapter((SpinnerAdapter) j54Var);
        g7 g7Var23 = this.binding;
        if (g7Var23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var23 = null;
        }
        g7Var23.v.setOnItemSelectedListener(new b(objectRef));
        g7 g7Var24 = this.binding;
        if (g7Var24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var24 = null;
        }
        g7Var24.J.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfName.k2(view);
            }
        });
        g7 g7Var25 = this.binding;
        if (g7Var25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var25 = null;
        }
        g7Var25.n.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfName.l2(this.a, view);
            }
        });
        g7 g7Var26 = this.binding;
        if (g7Var26 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var26 = null;
        }
        g7Var26.n.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfName.e2(this.a, view);
            }
        });
        g7 g7Var27 = this.binding;
        if (g7Var27 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var27 = null;
        }
        g7Var27.n.e.setVisibility(8);
        g7 g7Var28 = this.binding;
        if (g7Var28 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var28 = null;
        }
        g7Var28.l.g.setText(c2().k());
        g7 g7Var29 = this.binding;
        if (g7Var29 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var29 = null;
        }
        g7Var29.J.setVisibility(0);
        g7 g7Var30 = this.binding;
        if (g7Var30 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            g7Var = g7Var30;
        }
        g7Var.c.setVisibility(0);
    }

    public static final void e2(ChangeOfName this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(this$0.c2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                if (this$0.W1().size() > 1) {
                    final Dialog dialog = new Dialog(this$0);
                    dialog.setContentView(R.layout.layout_multi);
                    Window window = dialog.getWindow();
                    Intrinsics.checkNotNull(window);
                    window.setBackgroundDrawable(new ColorDrawable(0));
                    View viewFindViewById = dialog.findViewById(R.id.service_label_cross);
                    Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
                    ImageView imageView = (ImageView) viewFindViewById;
                    View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
                    Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView = (TextView) viewFindViewById2;
                    View viewFindViewById3 = dialog.findViewById(R.id.service_label_list);
                    Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView2 = (TextView) viewFindViewById3;
                    View viewFindViewById4 = dialog.findViewById(R.id.service_label_list_serial);
                    Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView3 = (TextView) viewFindViewById4;
                    View viewFindViewById5 = dialog.findViewById(R.id.dl_services);
                    Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView4 = (TextView) viewFindViewById5;
                    wa3 wa3Var = this$0.langSession;
                    wa3 wa3Var2 = null;
                    if (wa3Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("langSession");
                        wa3Var = null;
                    }
                    textView.setText(wa3Var.b("btn_ok", "OK"));
                    wa3 wa3Var3 = this$0.langSession;
                    if (wa3Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("langSession");
                    } else {
                        wa3Var2 = wa3Var3;
                    }
                    textView4.setText(wa3Var2.b("title_dl_services", "Driving Licence Services"));
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zh0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            ChangeOfName.g2(dialog, view2);
                        }
                    });
                    int size = this$0.W1().size();
                    String str = "";
                    int i2 = 0;
                    String string = "";
                    while (i2 < size) {
                        str = str + ((String) this$0.W1().get(i2)) + '\n';
                        StringBuilder sb = new StringBuilder();
                        sb.append(string);
                        i2++;
                        sb.append(i2);
                        sb.append(".\n");
                        string = sb.toString();
                    }
                    textView2.setText(str);
                    textView3.setText(string);
                    textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ai0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            ChangeOfName.f2(dialog, view2);
                        }
                    });
                    Window window2 = dialog.getWindow();
                    Intrinsics.checkNotNull(window2);
                    window2.setGravity(48);
                    window2.setLayout(-2, -2);
                    dialog.show();
                }
            } catch (Exception unused) {
            }
        }
    }

    public static final void f2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void g2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void h2(ChangeOfName this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.t2();
    }

    public static final void i2(ChangeOfName this$0, View view) {
        rb1 rb1Var;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.n2()) {
            if (Intrinsics.areEqual(this$0.c2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                this$0.v2();
                return;
            }
            g7 g7Var = this$0.binding;
            g7 g7Var2 = null;
            if (g7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                g7Var = null;
            }
            g7Var.h.c(true);
            String str = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            rb1 rb1Var2 = this$0.viewModel;
            if (rb1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                rb1Var = null;
            } else {
                rb1Var = rb1Var2;
            }
            String str2 = this$0.appCategory;
            String str3 = this$0.dlNo;
            String str4 = this$0.dob;
            String str5 = this$0.lastEndorseRTOCode;
            String strB2 = this$0.b2();
            int i2 = this$0.code;
            String str6 = this$0.reaonName;
            g7 g7Var3 = this$0.binding;
            if (g7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                g7Var3 = null;
            }
            String string = g7Var3.D.getText().toString();
            g7 g7Var4 = this$0.binding;
            if (g7Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                g7Var4 = null;
            }
            String string2 = g7Var4.e.getText().toString();
            g7 g7Var5 = this$0.binding;
            if (g7Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                g7Var5 = null;
            }
            String string3 = g7Var5.i.getText().toString();
            g7 g7Var6 = this$0.binding;
            if (g7Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                g7Var6 = null;
            }
            String string4 = g7Var6.r.getText().toString();
            g7 g7Var7 = this$0.binding;
            if (g7Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                g7Var2 = g7Var7;
            }
            String string5 = g7Var2.s.getText().toString();
            String str7 = this$0.Mobile_no;
            Intrinsics.checkNotNull(str7);
            rb1Var.h(str2, "", str3, str4, str5, "N", strB2, i2, str6, string, str, string2, string3, string4, string5, str7, "mobSARATHI", "657d1c758e2e95af0014e16f5109f933", "10.248.210.8", "sarathiservice", this$0.c2().f(), this$0.c2().g(), this$0.c2().e(), this$0.c2().h());
        }
    }

    public static final void j2(ChangeOfName this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void k2(View view) {
    }

    public static final void l2(ChangeOfName this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) DlServiceDetailsActivity.class);
            intent.putExtra("DL", this$0.dlNo);
            intent.putExtra("dob", this$0.dob);
            intent.putExtra("DLDetails", this$0.P1());
            intent.putExtra("Mobile_no", this$0.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this$0.lastEndorseRto);
            intent.putExtra("lastEndorsedState", this$0.lastEndorseState);
            intent.putExtra("lastEndorsedRTOCode", this$0.lastEndorseRTOCode);
            intent.putExtra("lastEndorseStateCode", this$0.lastEndorseStateCode);
            intent.putExtra("whatServiceRequired", this$0.whatServiceRequired);
            if (Intrinsics.areEqual(this$0.c2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", this$0.a2());
            }
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final boolean n2() {
        g7 g7Var = this.binding;
        wa3 wa3Var = null;
        if (g7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var = null;
        }
        MyTextView txtAppCategory = g7Var.z;
        Intrinsics.checkNotNullExpressionValue(txtAppCategory, "txtAppCategory");
        if (txtAppCategory.getVisibility() == 0 && Intrinsics.areEqual(this.appCategory, "00")) {
            u2(getString(R.string.sel_app_category));
            return false;
        }
        if (this.code == 0) {
            wa3 wa3Var2 = this.langSession;
            if (wa3Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
            } else {
                wa3Var = wa3Var2;
            }
            Toast.makeText(this, wa3Var.b("label_select_reason", getString(R.string.sel_rsn)), 1).show();
            return false;
        }
        g7 g7Var2 = this.binding;
        if (g7Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var2 = null;
        }
        LinearLayout idDupdl = g7Var2.g;
        Intrinsics.checkNotNullExpressionValue(idDupdl, "idDupdl");
        if (idDupdl.getVisibility() == 0) {
            g7 g7Var3 = this.binding;
            if (g7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                g7Var3 = null;
            }
            if (g7Var3.d.getText().length() < 3) {
                wa3 wa3Var3 = this.langSession;
                if (wa3Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("langSession");
                } else {
                    wa3Var = wa3Var3;
                }
                Toast.makeText(this, wa3Var.b("label_dl_serv_enter_reas_manul", getString(R.string.enter_Reason)), 0).show();
                return false;
            }
        }
        g7 g7Var4 = this.binding;
        if (g7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var4 = null;
        }
        Editable text = g7Var4.e.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0) {
            wa3 wa3Var4 = this.langSession;
            if (wa3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
            } else {
                wa3Var = wa3Var4;
            }
            Toast.makeText(this, wa3Var.b("PLEASE_ENTER_FIRST_NAME", getString(R.string.enter_first_name)), 0).show();
            return false;
        }
        g7 g7Var5 = this.binding;
        if (g7Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var5 = null;
        }
        if (g7Var5.e.getText().length() < 3) {
            wa3 wa3Var5 = this.langSession;
            if (wa3Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
            } else {
                wa3Var = wa3Var5;
            }
            Toast.makeText(this, wa3Var.b("enter_valid_3_first_name", getString(R.string.enter_valid_3_first_name)), 0).show();
            return false;
        }
        g7 g7Var6 = this.binding;
        if (g7Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var6 = null;
        }
        Editable text2 = g7Var6.i.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        if (text2.length() == 0) {
            wa3 wa3Var6 = this.langSession;
            if (wa3Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
            } else {
                wa3Var = wa3Var6;
            }
            Toast.makeText(this, wa3Var.b("PLEASE_ENTER_LAST_NAME", getString(R.string.enter_last_name)), 0).show();
            return false;
        }
        g7 g7Var7 = this.binding;
        if (g7Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var7 = null;
        }
        if (g7Var7.i.getText().length() < 3) {
            wa3 wa3Var7 = this.langSession;
            if (wa3Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
            } else {
                wa3Var = wa3Var7;
            }
            Toast.makeText(this, wa3Var.b("enter_valid_3_last_name", getString(R.string.enter_valid_3_last_name)), 0).show();
            return false;
        }
        g7 g7Var8 = this.binding;
        if (g7Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var8 = null;
        }
        Editable text3 = g7Var8.D.getText();
        Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
        if (text3.length() == 0) {
            wa3 wa3Var8 = this.langSession;
            if (wa3Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
            } else {
                wa3Var = wa3Var8;
            }
            Toast.makeText(this, wa3Var.b("PLEASE_ENTER_FULL_NAME", getString(R.string.enter_full_name)), 0).show();
            return false;
        }
        g7 g7Var9 = this.binding;
        if (g7Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var9 = null;
        }
        if (g7Var9.D.getText().length() < 3) {
            wa3 wa3Var9 = this.langSession;
            if (wa3Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
            } else {
                wa3Var = wa3Var9;
            }
            Toast.makeText(this, wa3Var.b("enter_valid_3_full_name", getString(R.string.enter_valid_3_full_name)), 0).show();
            return false;
        }
        if (Intrinsics.areEqual(b2(), "0")) {
            wa3 wa3Var10 = this.langSession;
            if (wa3Var10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
            } else {
                wa3Var = wa3Var10;
            }
            Toast.makeText(this, wa3Var.b("PLEASE_SELECT_RELATION", getString(R.string.select_relation)), 1).show();
            return false;
        }
        g7 g7Var10 = this.binding;
        if (g7Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var10 = null;
        }
        Editable text4 = g7Var10.r.getText();
        Intrinsics.checkNotNullExpressionValue(text4, "getText(...)");
        if (text4.length() == 0) {
            wa3 wa3Var11 = this.langSession;
            if (wa3Var11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
            } else {
                wa3Var = wa3Var11;
            }
            Toast.makeText(this, wa3Var.b("PLEASE_ENTER_REL_FIRST_NAME", getString(R.string.rel_first_name)), 0).show();
            return false;
        }
        g7 g7Var11 = this.binding;
        if (g7Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var11 = null;
        }
        if (g7Var11.r.getText().length() < 3) {
            wa3 wa3Var12 = this.langSession;
            if (wa3Var12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
            } else {
                wa3Var = wa3Var12;
            }
            Toast.makeText(this, wa3Var.b("enter_valid_rel_3_first_name", getString(R.string.enter_valid_rel_3_first_name)), 0).show();
            return false;
        }
        g7 g7Var12 = this.binding;
        if (g7Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var12 = null;
        }
        Editable text5 = g7Var12.s.getText();
        Intrinsics.checkNotNullExpressionValue(text5, "getText(...)");
        if (text5.length() == 0) {
            wa3 wa3Var13 = this.langSession;
            if (wa3Var13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
            } else {
                wa3Var = wa3Var13;
            }
            Toast.makeText(this, wa3Var.b("PLEASE_ENTER_REL_LAST_NAME", getString(R.string.rel_last_name)), 0).show();
            return false;
        }
        g7 g7Var13 = this.binding;
        if (g7Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var13 = null;
        }
        if (g7Var13.s.getText().length() >= 3) {
            return true;
        }
        wa3 wa3Var14 = this.langSession;
        if (wa3Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
        } else {
            wa3Var = wa3Var14;
        }
        Toast.makeText(this, wa3Var.b("enter_valid_rel_3_last_name", getString(R.string.enter_valid_rel_3_last_name)), 0).show();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 26, insn: 0x027d: MOVE (r2 I:??[OBJECT, ARRAY]) = (r26 I:??[OBJECT, ARRAY]), block:B:94:0x027d */
    public static final void p2(ChangeOfName this$0, GetAckDetForGivenDLNumberResponse getAckDetForGivenDLNumberResponse) throws Throwable {
        int i2;
        g7 g7Var;
        String str;
        String str2;
        List<ResultItemSubmit> result;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        g7 g7Var2 = this$0.binding;
        if (g7Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var2 = null;
        }
        ChangeOfName changeOfName = null;
        g7Var2.h.c(false);
        try {
            DlSubmitResult dlSubmitresult = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
            try {
                if (StringsKt__StringsJVMKt.equals$default(dlSubmitresult != null ? dlSubmitresult.getStatusCode() : null, "00", false, 2, null)) {
                    try {
                        DlSubmitResult dlSubmitresult2 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                        if (dlSubmitresult2 == null || (result = dlSubmitresult2.getResult()) == null || !(!result.isEmpty())) {
                            return;
                        }
                        DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity = new DLServiceAcknowlegementActivity();
                        ResultItemSubmit resultItemSubmit = getAckDetForGivenDLNumberResponse.getDlSubmitresult().getResult().get(0);
                        if (resultItemSubmit != null) {
                            String str3 = "";
                            ArrayList arrayListA2 = this$0.a2();
                            wa3 wa3Var = this$0.langSession;
                            if (wa3Var == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                                wa3Var = null;
                            }
                            if (CollectionsKt___CollectionsKt.contains(arrayListA2, wa3Var.b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                                str3 = "513,";
                            }
                            ArrayList arrayListA22 = this$0.a2();
                            wa3 wa3Var2 = this$0.langSession;
                            if (wa3Var2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                                wa3Var2 = null;
                            }
                            if (CollectionsKt___CollectionsKt.contains(arrayListA22, wa3Var2.b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                                str3 = str3 + "514,";
                            }
                            ArrayList arrayListA23 = this$0.a2();
                            wa3 wa3Var3 = this$0.langSession;
                            if (wa3Var3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                                wa3Var3 = null;
                            }
                            if (CollectionsKt___CollectionsKt.contains(arrayListA23, wa3Var3.b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                                str3 = str3 + "537,";
                            }
                            ArrayList arrayListA24 = this$0.a2();
                            wa3 wa3Var4 = this$0.langSession;
                            if (wa3Var4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                                wa3Var4 = null;
                            }
                            if (CollectionsKt___CollectionsKt.contains(arrayListA24, wa3Var4.b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                                str3 = str3 + "515,";
                            }
                            ArrayList arrayListA25 = this$0.a2();
                            wa3 wa3Var5 = this$0.langSession;
                            if (wa3Var5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                                wa3Var5 = null;
                            }
                            if (CollectionsKt___CollectionsKt.contains(arrayListA25, wa3Var5.b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                                str3 = str3 + "516,";
                            }
                            ArrayList arrayListA26 = this$0.a2();
                            wa3 wa3Var6 = this$0.langSession;
                            if (wa3Var6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                                wa3Var6 = null;
                            }
                            if (CollectionsKt___CollectionsKt.contains(arrayListA26, wa3Var6.b("check_dl_serv_extract_dl", "DL Extract"))) {
                                str3 = str3 + "523,";
                            }
                            ArrayList arrayListA27 = this$0.a2();
                            wa3 wa3Var7 = this$0.langSession;
                            if (wa3Var7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                                wa3Var7 = null;
                            }
                            if (CollectionsKt___CollectionsKt.contains(arrayListA27, wa3Var7.b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                                str3 = str3 + "524,";
                            }
                            ArrayList arrayListA28 = this$0.a2();
                            wa3 wa3Var8 = this$0.langSession;
                            if (wa3Var8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                                wa3Var8 = null;
                            }
                            if (CollectionsKt___CollectionsKt.contains(arrayListA28, wa3Var8.b("change_name_dl", "Change of Name in DL"))) {
                                str3 = str3 + "526,";
                            }
                            ArrayList arrayListA29 = this$0.a2();
                            wa3 wa3Var9 = this$0.langSession;
                            if (wa3Var9 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                                wa3Var9 = null;
                            }
                            if (CollectionsKt___CollectionsKt.contains(arrayListA29, wa3Var9.b("change_birth_dl", "Change of Date of Birth in DL"))) {
                                str3 = str3 + "548";
                            }
                            String str4 = str3;
                            try {
                                DlLogCapture.Companion companion = DlLogCapture.INSTANCE;
                                String applicationDate = resultItemSubmit.getApplicationDate();
                                String applicationNo = resultItemSubmit.getApplicationNo();
                                Intrinsics.checkNotNull(applicationNo);
                                long j2 = Long.parseLong(applicationNo);
                                int i3 = Integer.parseInt(this$0.Y1().k());
                                String dateofBirth = resultItemSubmit.getDateofBirth();
                                String dlno = resultItemSubmit.getDlno();
                                Intrinsics.checkNotNull(dlno);
                                String applicantGender = resultItemSubmit.getApplicantGender();
                                String str5 = this$0.Mobile_no;
                                Intrinsics.checkNotNull(str5);
                                try {
                                    try {
                                        companion.a(this$0, "1234", "S", applicationDate, j2, i3, dateofBirth, dlno, "N", "N", applicantGender, str5, false, str4, this$0.lastEndorseRTOCode, this$0.lastEndorseStateCode);
                                    } catch (Exception unused) {
                                    }
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                            }
                            dLServiceAcknowlegementActivity.K2(this$0, resultItemSubmit, this$0.lastEndorseRTOCode, this$0.P1(), this$0.dlNo, this$0.dob, this$0.Mobile_no, this$0.lastEndorseRto, this$0.lastEndorseState, this$0.lastEndorseStateCode, this$0.W1());
                            return;
                        }
                        return;
                    } catch (Exception unused4) {
                        g7Var = null;
                        changeOfName = this$0;
                        i2 = R.string.unable_to_get_details;
                        str = "service_is_not_present";
                    }
                } else {
                    g7Var = null;
                    changeOfName = this$0;
                    DlSubmitResult dlSubmitresult3 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                    String reqStatus = dlSubmitresult3 != null ? dlSubmitresult3.getReqStatus() : null;
                    if (reqStatus != null && reqStatus.length() != 0) {
                        DlSubmitResult dlSubmitresult4 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                        String reqStatus2 = dlSubmitresult4 != null ? dlSubmitresult4.getReqStatus() : null;
                        Intrinsics.checkNotNull(reqStatus2);
                        changeOfName.u2(reqStatus2);
                        return;
                    }
                    wa3 wa3Var10 = changeOfName.langSession;
                    if (wa3Var10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("langSession");
                        wa3Var10 = null;
                    }
                    i2 = R.string.unable_to_get_details;
                    try {
                        str = "service_is_not_present";
                        try {
                            changeOfName.u2(wa3Var10.b(str, changeOfName.getString(R.string.unable_to_get_details)));
                            return;
                        } catch (Exception unused5) {
                        }
                    } catch (Exception unused6) {
                        str = "service_is_not_present";
                    }
                }
            } catch (Exception unused7) {
                str = str2;
                i2 = R.string.unable_to_get_details;
            }
        } catch (Exception unused8) {
            i2 = R.string.unable_to_get_details;
            g7Var = null;
            str = "service_is_not_present";
            changeOfName = this$0;
        }
        g7 g7Var3 = changeOfName.binding;
        if (g7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var3 = g7Var;
        }
        g7Var3.h.c(false);
        wa3 wa3Var11 = changeOfName.langSession;
        wa3 wa3Var12 = wa3Var11;
        if (wa3Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
            wa3Var12 = g7Var;
        }
        changeOfName.u2(wa3Var12.b(str, changeOfName.getString(i2)));
    }

    public static final void q2(ChangeOfName this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        g7 g7Var = this$0.binding;
        wa3 wa3Var = null;
        if (g7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var = null;
        }
        g7Var.h.c(false);
        wa3 wa3Var2 = this$0.langSession;
        if (wa3Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
        } else {
            wa3Var = wa3Var2;
        }
        this$0.u2(wa3Var.b("service_is_not_present", this$0.getString(R.string.unable_to_get_details)));
    }

    public static final void s2(ChangeOfName this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final void t2() {
        ArrayList arrayList = new ArrayList();
        List<ReasonsMasterItem> list = this.mReasonList;
        if (list != null) {
            for (ReasonsMasterItem reasonsMasterItem : list) {
                arrayList.add(String.valueOf(reasonsMasterItem != null ? reasonsMasterItem.getReasonName() : null));
            }
        }
        d86 d86VarA = d86.INSTANCE.a("Select Reason", arrayList);
        d86VarA.k2(I0(), "ReasonPicker");
        d86VarA.n2(new h());
    }

    public final void A2(CombineServiceInterface combineServiceInterface) {
        Intrinsics.checkNotNullParameter(combineServiceInterface, "<set-?>");
        this.mCombineServiceInterface = combineServiceInterface;
    }

    public final void B2(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void C2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.mSessionmanger = ws6Var;
    }

    public final void D2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.multiListName = arrayList;
    }

    public final void E2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reaonName = str;
    }

    public final void F2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.relationCode = str;
    }

    public final void G2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.ArrayList] */
    public final void N1() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? arrayList = new ArrayList();
        objectRef.element = arrayList;
        arrayList.add(0, new AppCatPojo("0", "Select Applicant Category"));
        ((ArrayList) objectRef.element).add(1, new AppCatPojo("G", "General"));
        ((ArrayList) objectRef.element).add(2, new AppCatPojo("R", "Repatriate"));
        ((ArrayList) objectRef.element).add(3, new AppCatPojo("T", "Refugees"));
        ((ArrayList) objectRef.element).add(4, new AppCatPojo("X", "Ex-Servicemen"));
        ((ArrayList) objectRef.element).add(5, new AppCatPojo("F", "Foreigners (Not Diplomats)"));
        ((ArrayList) objectRef.element).add(6, new AppCatPojo("D", "Diplomats (Foreigner)"));
        ((ArrayList) objectRef.element).add(7, new AppCatPojo("O", "OCI"));
        ((ArrayList) objectRef.element).add(8, new AppCatPojo("P", "Differently Abled"));
        oq oqVar = new oq(this, (ArrayList) objectRef.element);
        g7 g7Var = this.binding;
        g7 g7Var2 = null;
        if (g7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var = null;
        }
        g7Var.u.setAdapter((SpinnerAdapter) oqVar);
        int size = ((ArrayList) objectRef.element).size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) c2().a()).toString(), StringsKt__StringsKt.trim((CharSequence) ((AppCatPojo) ((ArrayList) objectRef.element).get(i2)).getAppCode()).toString())) {
                g7 g7Var3 = this.binding;
                if (g7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    g7Var3 = null;
                }
                g7Var3.u.setSelection(i2);
            } else {
                i2++;
            }
        }
        g7 g7Var4 = this.binding;
        if (g7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var4 = null;
        }
        g7Var4.u.setOnItemSelectedListener(new a(objectRef));
        if (StringsKt__StringsJVMKt.equals$default(this.bioRecGenesis, "S", false, 2, null)) {
            g7 g7Var5 = this.binding;
            if (g7Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                g7Var2 = g7Var5;
            }
            g7Var2.u.setEnabled(true);
            return;
        }
        if (Intrinsics.areEqual(this.appCategory, "0")) {
            g7 g7Var6 = this.binding;
            if (g7Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                g7Var2 = g7Var6;
            }
            g7Var2.u.setEnabled(true);
            return;
        }
        g7 g7Var7 = this.binding;
        if (g7Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            g7Var2 = g7Var7;
        }
        g7Var2.u.setEnabled(false);
    }

    /* JADX INFO: renamed from: O1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    public final DldetobjX P1() {
        DldetobjX dldetobjX = this.dlDetails;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlDetails");
        return null;
    }

    /* JADX INFO: renamed from: Q1, reason: from getter */
    public final String getDlNo() {
        return this.dlNo;
    }

    /* JADX INFO: renamed from: R1, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    /* JADX INFO: renamed from: S1, reason: from getter */
    public final String getLastEndorseRTOCode() {
        return this.lastEndorseRTOCode;
    }

    /* JADX INFO: renamed from: T1, reason: from getter */
    public final String getLastEndorseRto() {
        return this.lastEndorseRto;
    }

    /* JADX INFO: renamed from: U1, reason: from getter */
    public final String getLastEndorseState() {
        return this.lastEndorseState;
    }

    /* JADX INFO: renamed from: V1, reason: from getter */
    public final String getLastEndorseStateCode() {
        return this.lastEndorseStateCode;
    }

    public final ArrayList W1() {
        ArrayList arrayList = this.listHeaderSteps;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("listHeaderSteps");
        return null;
    }

    public final CombineServiceInterface X1() {
        CombineServiceInterface combineServiceInterface = this.mCombineServiceInterface;
        if (combineServiceInterface != null) {
            return combineServiceInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mCombineServiceInterface");
        return null;
    }

    public final ws6 Y1() {
        ws6 ws6Var = this.mSessionmanger;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSessionmanger");
        return null;
    }

    /* JADX INFO: renamed from: Z1, reason: from getter */
    public final String getMobile_no() {
        return this.Mobile_no;
    }

    public final ArrayList a2() {
        ArrayList arrayList = this.multiListName;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiListName");
        return null;
    }

    public final String b2() {
        String str = this.relationCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("relationCode");
        return null;
    }

    public final wl5 c2() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final void m2(Intent intent, String lastEndRTO, String lastEndState, String purCode, ArrayList multiList) {
        try {
            intent.putExtra("DL", this.dlNo);
            intent.putExtra("dob", this.dob);
            intent.putExtra("DLDetails", P1());
            intent.putExtra("Mobile_no", this.Mobile_no);
            intent.putExtra("lastEndorsedRTO", lastEndRTO);
            intent.putExtra("lastEndorsedState", lastEndState);
            intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
            intent.putExtra("lastEndorseStateCode", this.lastEndorseStateCode);
            intent.putExtra("whatServiceRequired", this.whatServiceRequired);
            intent.putExtra("state_value", this.state_value);
            intent.putExtra("purCode", purCode);
            intent.putExtra("bioRecGenesis", "S");
            intent.putExtra("allowAddrChangeAtDlservReqst", "N");
            intent.putExtra("metaflag", this.metaflag);
            intent.putExtra("multiList", multiList);
            intent.putExtra("listHeaderSteps", W1());
            intent.putExtra("serialNo", this.serialNo + 1);
            intent.putExtra("COA", this.COA);
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public final void o2() {
        fs0 fs0Var = this.mCombineViewModel;
        fs0 fs0Var2 = null;
        if (fs0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCombineViewModel");
            fs0Var = null;
        }
        fs0Var.i().g(this, new mf4() { // from class: com.zepto.ii0
            @Override // com.zepto.mf4
            public final void a(Object obj) throws Throwable {
                ChangeOfName.p2(this.a, (GetAckDetForGivenDLNumberResponse) obj);
            }
        });
        fs0 fs0Var3 = this.mCombineViewModel;
        if (fs0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCombineViewModel");
        } else {
            fs0Var2 = fs0Var3;
        }
        fs0Var2.h().g(this, new mf4() { // from class: com.zepto.ji0
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                ChangeOfName.q2(this.a, (String) obj);
            }
        });
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        g7 g7VarC = g7.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(g7VarC, "inflate(...)");
        this.binding = g7VarC;
        g7 g7Var = null;
        if (g7VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7VarC = null;
        }
        setContentView(g7VarC.b());
        B2(this);
        this.langSession = new wa3(this);
        G2(new wl5(this));
        C2(new ws6(this));
        g7 g7Var2 = this.binding;
        if (g7Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var2 = null;
        }
        g7Var2.f.setText((CharSequence) null);
        g7 g7Var3 = this.binding;
        if (g7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var3 = null;
        }
        g7Var3.f.setContentDescription(null);
        ta3.a aVar = ta3.a;
        g7 g7Var4 = this.binding;
        if (g7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var4 = null;
        }
        aVar.R(this, g7Var4);
        d2();
        r2();
        if (Intrinsics.areEqual(c2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            o2();
        }
        g7 g7Var5 = this.binding;
        if (g7Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var5 = null;
        }
        g7Var5.n.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfName.s2(this.a, view);
            }
        });
        N1();
        g7 g7Var6 = this.binding;
        if (g7Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var6 = null;
        }
        g7Var6.e.addTextChangedListener(new e());
        g7 g7Var7 = this.binding;
        if (g7Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            g7Var7 = null;
        }
        g7Var7.m.addTextChangedListener(new f());
        g7 g7Var8 = this.binding;
        if (g7Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            g7Var = g7Var8;
        }
        g7Var.i.addTextChangedListener(new g());
    }

    public final void r2() {
        rb1 rb1Var = this.viewModel;
        rb1 rb1Var2 = null;
        if (rb1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            rb1Var = null;
        }
        rb1Var.q().g(this, new j(new c()));
        rb1 rb1Var3 = this.viewModel;
        if (rb1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            rb1Var2 = rb1Var3;
        }
        rb1Var2.l().g(this, new j(new d()));
    }

    public final void u2(String message) {
        if (message != null) {
            wa3 wa3Var = this.langSession;
            wa3 wa3Var2 = null;
            if (wa3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                wa3Var = null;
            }
            String strB = wa3Var.b("nex_parivahan", getString(R.string.app_name));
            Intrinsics.checkNotNull(strB);
            wa3 wa3Var3 = this.langSession;
            if (wa3Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
            } else {
                wa3Var2 = wa3Var3;
            }
            String strB2 = wa3Var2.b("btn_ok", getString(R.string.ok_txt));
            Intrinsics.checkNotNull(strB2);
            o40.q1(this, strB, message, 1, strB2, null, i.c, 16, null);
        }
    }

    public final void v2() {
        wa3 wa3Var;
        fs0 fs0Var;
        g7 g7Var;
        wa3 wa3Var2;
        try {
            if (a2().size() <= this.serialNo) {
                g7 g7Var2 = this.binding;
                if (g7Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    g7Var2 = null;
                }
                g7Var2.h.c(true);
                CombineReq combineReq = (CombineReq) new Gson().fromJson(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getString("MultiService", ""), CombineReq.class);
                if (!com.nic.mparivahan.a.a.a(this)) {
                    Context applicationContext = getApplicationContext();
                    wa3 wa3Var3 = this.langSession;
                    if (wa3Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("langSession");
                        wa3Var = null;
                    } else {
                        wa3Var = wa3Var3;
                    }
                    Toast.makeText(applicationContext, wa3Var.b("service_is_not_present", getString(R.string.unable_to_get_details)), 0).show();
                    return;
                }
                g7 g7Var3 = this.binding;
                if (g7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    g7Var3 = null;
                }
                g7Var3.h.c(true);
                ArrayList arrayList = new ArrayList();
                int size = P1().getDlcovs().size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(String.valueOf(P1().getDlcovs().get(i2).getDcCovcd()));
                }
                fs0 fs0Var2 = this.mCombineViewModel;
                if (fs0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCombineViewModel");
                    fs0Var = null;
                } else {
                    fs0Var = fs0Var2;
                }
                boolean z = this.COA;
                String str = this.bioRecGenesis;
                Intrinsics.checkNotNull(str);
                String str2 = this.allowAddrChangeAtDlservReqst;
                Intrinsics.checkNotNull(str2);
                ArrayList arrayListA2 = a2();
                String applcatgDLserReq = combineReq.getApplcatgDLserReq();
                Intrinsics.checkNotNull(applcatgDLserReq);
                String dlHolderAltMobMum = combineReq.getDlHolderAltMobMum();
                Intrinsics.checkNotNull(dlHolderAltMobMum);
                String str3 = this.dlNo;
                Intrinsics.checkNotNull(str3);
                String str4 = this.dob;
                Intrinsics.checkNotNull(str4);
                String str5 = this.lastEndorseRTOCode;
                String willtoDonateOrgans = combineReq.getWilltoDonateOrgans();
                Intrinsics.checkNotNull(willtoDonateOrgans);
                String strB2 = b2();
                String strValueOf = String.valueOf(this.code);
                String str6 = this.reaonName;
                g7 g7Var4 = this.binding;
                if (g7Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    g7Var4 = null;
                }
                String string = g7Var4.D.getText().toString();
                String str7 = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
                Intrinsics.checkNotNullExpressionValue(str7, "format(...)");
                g7 g7Var5 = this.binding;
                if (g7Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    g7Var5 = null;
                }
                String string2 = g7Var5.e.getText().toString();
                g7 g7Var6 = this.binding;
                if (g7Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    g7Var6 = null;
                }
                String string3 = g7Var6.i.getText().toString();
                g7 g7Var7 = this.binding;
                if (g7Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    g7Var7 = null;
                }
                String string4 = g7Var7.r.getText().toString();
                g7 g7Var8 = this.binding;
                if (g7Var8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    g7Var = null;
                } else {
                    g7Var = g7Var8;
                }
                String string5 = g7Var.s.getText().toString();
                String str8 = this.Mobile_no;
                Intrinsics.checkNotNull(str8);
                String changeOfAddReq = combineReq.getChangeOfAddReq();
                Intrinsics.checkNotNull(changeOfAddReq);
                String perHouseNo = combineReq.getPerHouseNo();
                Intrinsics.checkNotNull(perHouseNo);
                String perStreet = combineReq.getPerStreet();
                Intrinsics.checkNotNull(perStreet);
                String perLocation = combineReq.getPerLocation();
                Intrinsics.checkNotNull(perLocation);
                String permVillageOrTown = combineReq.getPermVillageOrTown();
                Intrinsics.checkNotNull(permVillageOrTown);
                String perSubDistrict = combineReq.getPerSubDistrict();
                Intrinsics.checkNotNull(perSubDistrict);
                String perDistrict = combineReq.getPerDistrict();
                Intrinsics.checkNotNull(perDistrict);
                String perState = combineReq.getPerState();
                Intrinsics.checkNotNull(perState);
                String perPinCode = combineReq.getPerPinCode();
                Intrinsics.checkNotNull(perPinCode);
                String presHouseNo = combineReq.getPresHouseNo();
                Intrinsics.checkNotNull(presHouseNo);
                String presStreet = combineReq.getPresStreet();
                Intrinsics.checkNotNull(presStreet);
                String presLocation = combineReq.getPresLocation();
                Intrinsics.checkNotNull(presLocation);
                String presVillageOrTown = combineReq.getPresVillageOrTown();
                Intrinsics.checkNotNull(presVillageOrTown);
                String presSubDistrict = combineReq.getPresSubDistrict();
                Intrinsics.checkNotNull(presSubDistrict);
                String presDistrict = combineReq.getPresDistrict();
                Intrinsics.checkNotNull(presDistrict);
                String presState = combineReq.getPresState();
                Intrinsics.checkNotNull(presState);
                String presPincode = combineReq.getPresPincode();
                Intrinsics.checkNotNull(presPincode);
                String dleDlReasonCode = combineReq.getDleDlReasonCode();
                Intrinsics.checkNotNull(dleDlReasonCode);
                String dleDlReasonName = combineReq.getDleDlReasonName();
                Intrinsics.checkNotNull(dleDlReasonName);
                String dupDlReasonName = combineReq.getDupDlReasonName();
                Intrinsics.checkNotNull(dupDlReasonName);
                String dupDlReasonCode = combineReq.getDupDlReasonCode();
                Intrinsics.checkNotNull(dupDlReasonCode);
                String applDateOfBirth = combineReq.getApplDateOfBirth();
                Intrinsics.checkNotNull(applDateOfBirth);
                String codobDlReasonName = combineReq.getCodobDlReasonName();
                Intrinsics.checkNotNull(codobDlReasonName);
                String codobDlReasonCode = combineReq.getCodobDlReasonCode();
                Intrinsics.checkNotNull(codobDlReasonCode);
                String declaringcheck = combineReq.getDeclaringcheck();
                Intrinsics.checkNotNull(declaringcheck);
                String hillcertificate = combineReq.getHillcertificate();
                Intrinsics.checkNotNull(hillcertificate);
                String hillissueDate = combineReq.getHillissueDate();
                Intrinsics.checkNotNull(hillissueDate);
                String hillvalidFrom = combineReq.getHillvalidFrom();
                Intrinsics.checkNotNull(hillvalidFrom);
                String hillvalidTo = combineReq.getHillvalidTo();
                Intrinsics.checkNotNull(hillvalidTo);
                String hilldrivingschool = combineReq.getHilldrivingschool();
                Intrinsics.checkNotNull(hilldrivingschool);
                String hillissby = combineReq.getHillissby();
                Intrinsics.checkNotNull(hillissby);
                String pofbirth = combineReq.getPofbirth();
                Intrinsics.checkNotNull(pofbirth);
                String country = combineReq.getCountry();
                Intrinsics.checkNotNull(country);
                String passno = combineReq.getPassno();
                Intrinsics.checkNotNull(passno);
                String passvaltill = combineReq.getPassvaltill();
                Intrinsics.checkNotNull(passvaltill);
                String visano = combineReq.getVisano();
                Intrinsics.checkNotNull(visano);
                String visavaltill = combineReq.getVisavaltill();
                Intrinsics.checkNotNull(visavaltill);
                String tovisit = combineReq.getTovisit();
                Intrinsics.checkNotNull(tovisit);
                String iscountryrestricted = combineReq.getIscountryrestricted();
                Intrinsics.checkNotNull(iscountryrestricted);
                String countryRestrictedReason = combineReq.getCountryRestrictedReason();
                Intrinsics.checkNotNull(countryRestrictedReason);
                String strIsDlSerdisqualified = combineReq.isDlSerdisqualified();
                Intrinsics.checkNotNull(strIsDlSerdisqualified);
                String dlSerdisqualifiedReason = combineReq.getDlSerdisqualifiedReason();
                Intrinsics.checkNotNull(dlSerdisqualifiedReason);
                String forAdd1 = combineReq.getForAdd1();
                Intrinsics.checkNotNull(forAdd1);
                String forAdd2 = combineReq.getForAdd2();
                Intrinsics.checkNotNull(forAdd2);
                String forAdd3 = combineReq.getForAdd3();
                Intrinsics.checkNotNull(forAdd3);
                String forAddPinCode = combineReq.getForAddPinCode();
                Intrinsics.checkNotNull(forAddPinCode);
                String forNationMobNum = combineReq.getForNationMobNum();
                Intrinsics.checkNotNull(forNationMobNum);
                String emailID = combineReq.getEmailID();
                Intrinsics.checkNotNull(emailID);
                String appliedIdpfromIndEmb = combineReq.getAppliedIdpfromIndEmb();
                Intrinsics.checkNotNull(appliedIdpfromIndEmb);
                String indEmbName = combineReq.getIndEmbName();
                Intrinsics.checkNotNull(indEmbName);
                String embPlace = combineReq.getEmbPlace();
                Intrinsics.checkNotNull(embPlace);
                String dateOfVerifEmb = combineReq.getDateOfVerifEmb();
                Intrinsics.checkNotNull(dateOfVerifEmb);
                String embEndorseNo = combineReq.getEmbEndorseNo();
                Intrinsics.checkNotNull(embEndorseNo);
                String idpcountryapplyfrom = combineReq.getIdpcountryapplyfrom();
                Intrinsics.checkNotNull(idpcountryapplyfrom);
                fs0Var.g(z, arrayList, str, str2, arrayListA2, "mobSARATHI", "657d1c758e2e95af0014e16f5109f933", "10.248.210.8", "sarathiservice", applcatgDLserReq, dlHolderAltMobMum, str3, str4, str5, willtoDonateOrgans, strB2, strValueOf, str6, string, str7, string2, string3, string4, string5, str8, changeOfAddReq, perHouseNo, perStreet, perLocation, permVillageOrTown, perSubDistrict, perDistrict, perState, perPinCode, presHouseNo, presStreet, presLocation, presVillageOrTown, presSubDistrict, presDistrict, presState, presPincode, dleDlReasonCode, dleDlReasonName, dupDlReasonName, dupDlReasonCode, applDateOfBirth, codobDlReasonName, codobDlReasonCode, declaringcheck, hillcertificate, hillissueDate, hillvalidFrom, hillvalidTo, hilldrivingschool, hillissby, pofbirth, country, passno, passvaltill, visano, visavaltill, tovisit, iscountryrestricted, countryRestrictedReason, strIsDlSerdisqualified, dlSerdisqualifiedReason, forAdd1, forAdd2, forAdd3, forAddPinCode, forNationMobNum, emailID, appliedIdpfromIndEmb, indEmbName, embPlace, dateOfVerifEmb, embEndorseNo, idpcountryapplyfrom, c2().f(), c2().g(), c2().e(), c2().h());
                return;
            }
            CombineReq combineReq2 = (CombineReq) new Gson().fromJson(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getString("MultiService", ""), CombineReq.class);
            CombineReq combineReq3 = new CombineReq(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 1023, null);
            combineReq3.setPofbirth(combineReq2.getPofbirth());
            combineReq3.setCountry(combineReq2.getCountry());
            combineReq3.setPassno(combineReq2.getPassno());
            combineReq3.setPassvaltill(combineReq2.getPassvaltill());
            combineReq3.setVisano(combineReq2.getVisano());
            combineReq3.setVisavaltill(combineReq2.getVisavaltill());
            combineReq3.setTovisit(combineReq2.getTovisit());
            combineReq3.setIscountryrestricted(combineReq2.getIscountryrestricted());
            combineReq3.setCountryRestrictedReason(combineReq2.getCountryRestrictedReason());
            combineReq3.setDlSerdisqualified(combineReq2.isDlSerdisqualified());
            combineReq3.setDlSerdisqualifiedReason(combineReq2.getDlSerdisqualifiedReason());
            combineReq3.setForAdd1(combineReq2.getForAdd1());
            combineReq3.setForAdd2(combineReq2.getForAdd2());
            combineReq3.setForAdd3(combineReq2.getForAdd3());
            combineReq3.setForAddPinCode(combineReq2.getForAddPinCode());
            combineReq3.setForNationMobNum(combineReq2.getForNationMobNum());
            combineReq3.setEmailID(combineReq2.getEmailID());
            combineReq3.setAppliedIdpfromIndEmb(combineReq2.getAppliedIdpfromIndEmb());
            combineReq3.setIndEmbName(combineReq2.getIndEmbName());
            combineReq3.setEmbPlace(combineReq2.getEmbPlace());
            combineReq3.setDateOfVerifEmb(combineReq2.getDateOfVerifEmb());
            combineReq3.setEmbEndorseNo(combineReq2.getEmbEndorseNo());
            combineReq3.setIdpcountryapplyfrom(combineReq2.getIdpcountryapplyfrom());
            combineReq3.setDupDlReasonName(combineReq2.getDupDlReasonName());
            combineReq3.setDupDlReasonCode(combineReq2.getDupDlReasonCode());
            combineReq3.setDleDlReasonName(combineReq2.getDleDlReasonName());
            combineReq3.setDleDlReasonCode(combineReq2.getDleDlReasonCode());
            combineReq3.setApplcatgDLserReq(combineReq2.getApplcatgDLserReq());
            combineReq3.setDlHolderAltMobMum(combineReq2.getDlHolderAltMobMum());
            combineReq3.setWilltoDonateOrgans(combineReq2.getWilltoDonateOrgans());
            combineReq3.setMobileNumber(combineReq2.getMobileNumber());
            combineReq3.setChangeOfAddReq(combineReq2.getChangeOfAddReq());
            combineReq3.setPerHouseNo(combineReq2.getPerHouseNo());
            combineReq3.setPerStreet(combineReq2.getPerStreet());
            combineReq3.setPerLocation(combineReq2.getPerLocation());
            combineReq3.setPermVillageOrTown(combineReq2.getPermVillageOrTown());
            combineReq3.setPerSubDistrict(combineReq2.getPerSubDistrict());
            combineReq3.setPerDistrict(combineReq2.getPerDistrict());
            combineReq3.setPerState(combineReq2.getPerState());
            combineReq3.setPerPinCode(combineReq2.getPerPinCode());
            combineReq3.setPresHouseNo(combineReq2.getPresHouseNo());
            combineReq3.setPresStreet(combineReq2.getPresStreet());
            combineReq3.setPresLocation(combineReq2.getPresLocation());
            combineReq3.setPresVillageOrTown(combineReq2.getPresVillageOrTown());
            combineReq3.setPresSubDistrict(combineReq2.getPresSubDistrict());
            combineReq3.setPresDistrict(combineReq2.getPresDistrict());
            combineReq3.setPresState(combineReq2.getPresState());
            combineReq3.setPresPincode(combineReq2.getPresPincode());
            combineReq3.setApplDateOfBirth(combineReq2.getApplDateOfBirth());
            combineReq3.setCodobDlReasonCode(combineReq2.getCodobDlReasonCode());
            combineReq3.setCodobDlReasonName(combineReq2.getCodobDlReasonName());
            combineReq3.setDeclaringcheck(combineReq2.getDeclaringcheck());
            combineReq3.setHillcertificate(combineReq2.getHillcertificate());
            combineReq3.setHillissueDate(combineReq2.getHillissueDate());
            combineReq3.setHillvalidFrom(combineReq2.getHillvalidFrom());
            combineReq3.setHillvalidTo(combineReq2.getHillvalidTo());
            combineReq3.setHilldrivingschool(combineReq2.getHilldrivingschool());
            combineReq3.setHillissby(combineReq2.getHillissby());
            g7 g7Var9 = this.binding;
            if (g7Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                g7Var9 = null;
            }
            combineReq3.setApplFirstName(g7Var9.e.getText().toString());
            g7 g7Var10 = this.binding;
            if (g7Var10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                g7Var10 = null;
            }
            combineReq3.setApplLastName(g7Var10.i.getText().toString());
            g7 g7Var11 = this.binding;
            if (g7Var11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                g7Var11 = null;
            }
            combineReq3.setRelFirstName(g7Var11.r.getText().toString());
            g7 g7Var12 = this.binding;
            if (g7Var12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                g7Var12 = null;
            }
            combineReq3.setRelLastName(g7Var12.s.getText().toString());
            combineReq3.setConEffdate(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date()));
            combineReq3.setConDlReasonCode(Integer.valueOf(this.code));
            combineReq3.setRelationType(b2());
            g7 g7Var13 = this.binding;
            if (g7Var13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                g7Var13 = null;
            }
            combineReq3.setDlHolderNaturalName(g7Var13.D.getText().toString());
            combineReq3.setConDlReasonName(this.reaonName);
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit();
            editorEdit.putString("MultiService", new Gson().toJson(combineReq3));
            editorEdit.commit();
            Object obj = a2().get(this.serialNo);
            wa3 wa3Var4 = this.langSession;
            if (wa3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                wa3Var4 = null;
            }
            if (Intrinsics.areEqual(obj, wa3Var4.b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                setIntent(new Intent(this, (Class<?>) DLDuplicateActivity.class));
                Intent intent = getIntent();
                Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                m2(intent, this.lastEndorseRTOCode, this.lastEndorseState, "513", a2());
                return;
            }
            Object obj2 = a2().get(this.serialNo);
            wa3 wa3Var5 = this.langSession;
            if (wa3Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                wa3Var5 = null;
            }
            if (Intrinsics.areEqual(obj2, wa3Var5.b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                setIntent(new Intent(this, (Class<?>) RenewalOfDLActivity.class));
                Intent intent2 = getIntent();
                Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
                m2(intent2, this.lastEndorseRTOCode, this.lastEndorseState, "514", a2());
                return;
            }
            Object obj3 = a2().get(this.serialNo);
            wa3 wa3Var6 = this.langSession;
            if (wa3Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                wa3Var6 = null;
            }
            if (Intrinsics.areEqual(obj3, wa3Var6.b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                setIntent(new Intent(this, (Class<?>) RenewalOfDLActivity.class));
                Intent intent3 = getIntent();
                Intrinsics.checkNotNullExpressionValue(intent3, "getIntent(...)");
                m2(intent3, this.lastEndorseRTOCode, this.lastEndorseState, "537", a2());
                return;
            }
            Object obj4 = a2().get(this.serialNo);
            wa3 wa3Var7 = this.langSession;
            if (wa3Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                wa3Var7 = null;
            }
            if (Intrinsics.areEqual(obj4, wa3Var7.b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                setIntent(new Intent(this, (Class<?>) ChangeOfAddressActivity.class));
                Intent intent4 = getIntent();
                Intrinsics.checkNotNullExpressionValue(intent4, "getIntent(...)");
                m2(intent4, this.lastEndorseRTOCode, this.lastEndorseState, "515", a2());
                return;
            }
            Object obj5 = a2().get(this.serialNo);
            wa3 wa3Var8 = this.langSession;
            if (wa3Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                wa3Var8 = null;
            }
            if (Intrinsics.areEqual(obj5, wa3Var8.b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                setIntent(new Intent(this, (Class<?>) DLReplecementActivity.class));
                Intent intent5 = getIntent();
                Intrinsics.checkNotNullExpressionValue(intent5, "getIntent(...)");
                m2(intent5, this.lastEndorseRTOCode, this.lastEndorseState, "516", a2());
                return;
            }
            Object obj6 = a2().get(this.serialNo);
            wa3 wa3Var9 = this.langSession;
            if (wa3Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                wa3Var9 = null;
            }
            if (Intrinsics.areEqual(obj6, wa3Var9.b("check_dl_serv_extract_dl", "DL Extract"))) {
                setIntent(new Intent(this, (Class<?>) DLExtractActivity.class));
                Intent intent6 = getIntent();
                Intrinsics.checkNotNullExpressionValue(intent6, "getIntent(...)");
                m2(intent6, this.lastEndorseRTOCode, this.lastEndorseState, "523", a2());
                return;
            }
            Object obj7 = a2().get(this.serialNo);
            wa3 wa3Var10 = this.langSession;
            if (wa3Var10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                wa3Var10 = null;
            }
            if (Intrinsics.areEqual(obj7, wa3Var10.b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                setIntent(new Intent(this, (Class<?>) HillReligion.class));
                Intent intent7 = getIntent();
                Intrinsics.checkNotNullExpressionValue(intent7, "getIntent(...)");
                m2(intent7, this.lastEndorseRTOCode, this.lastEndorseState, "524", a2());
                return;
            }
            Object obj8 = a2().get(this.serialNo);
            wa3 wa3Var11 = this.langSession;
            if (wa3Var11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                wa3Var11 = null;
            }
            if (Intrinsics.areEqual(obj8, wa3Var11.b("change_name_dl", "Change of Name in DL"))) {
                setIntent(new Intent(this, (Class<?>) ChangeOfName.class));
                Intent intent8 = getIntent();
                Intrinsics.checkNotNullExpressionValue(intent8, "getIntent(...)");
                m2(intent8, this.lastEndorseRTOCode, this.lastEndorseState, "526", a2());
                return;
            }
            Object obj9 = a2().get(this.serialNo);
            wa3 wa3Var12 = this.langSession;
            if (wa3Var12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                wa3Var2 = null;
            } else {
                wa3Var2 = wa3Var12;
            }
            if (Intrinsics.areEqual(obj9, wa3Var2.b("change_birth_dl", "Change of Date of Birth in DL"))) {
                setIntent(new Intent(this, (Class<?>) DobChangeActivity.class));
                Intent intent9 = getIntent();
                Intrinsics.checkNotNullExpressionValue(intent9, "getIntent(...)");
                m2(intent9, this.lastEndorseRTOCode, this.lastEndorseState, "548", a2());
            }
        } catch (Exception unused) {
        }
    }

    public final void w2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appCategory = str;
    }

    public final void x2(int i2) {
        this.code = i2;
    }

    public final void y2(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dlDetails = dldetobjX;
    }

    public final void z2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.listHeaderSteps = arrayList;
    }
}
