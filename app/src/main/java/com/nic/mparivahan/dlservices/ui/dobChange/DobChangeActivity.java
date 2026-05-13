package com.nic.mparivahan.dlservices.ui.dobChange;

import android.app.DatePickerDialog;
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
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowMetrics;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.gson.Gson;
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
import com.zepto.cs0;
import com.zepto.d86;
import com.zepto.ds0;
import com.zepto.fs0;
import com.zepto.k76;
import com.zepto.mf4;
import com.zepto.mt6;
import com.zepto.o40;
import com.zepto.oq;
import com.zepto.qd0;
import com.zepto.rb1;
import com.zepto.ta3;
import com.zepto.vf;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.ws6;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
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
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bç\u0001\u0010è\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0003J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J6\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0002J\u0012\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014J\u0010\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0007R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R \u0010-\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010*\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R*\u00106\u001a\n /*\u0004\u0018\u00010.0.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0016\u00109\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010;\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00108R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010I\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u00108\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010M\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u00108\u001a\u0004\bK\u0010F\"\u0004\bL\u0010HR$\u0010Q\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u00108\u001a\u0004\bO\u0010F\"\u0004\bP\u0010HR\"\u0010U\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u00108\u001a\u0004\bS\u0010F\"\u0004\bT\u0010HR\"\u0010Y\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u00108\u001a\u0004\bW\u0010F\"\u0004\bX\u0010HR\"\u0010]\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u00108\u001a\u0004\b[\u0010F\"\u0004\b\\\u0010HR\"\u0010a\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u00108\u001a\u0004\b_\u0010F\"\u0004\b`\u0010HR\"\u0010e\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u00108\u001a\u0004\bc\u0010F\"\u0004\bd\u0010HR\"\u0010m\u001a\u00020f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR2\u0010u\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\"\u0010}\u001a\u00020v8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R$\u0010\u0081\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b~\u00108\u001a\u0004\b\u007f\u0010F\"\u0005\b\u0080\u0001\u0010HR&\u0010\u0085\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u00108\u001a\u0005\b\u0083\u0001\u0010F\"\u0005\b\u0084\u0001\u0010HR&\u0010\u0089\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0086\u0001\u00108\u001a\u0005\b\u0087\u0001\u0010F\"\u0005\b\u0088\u0001\u0010HR&\u0010\u008d\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008a\u0001\u00108\u001a\u0005\b\u008b\u0001\u0010F\"\u0005\b\u008c\u0001\u0010HR&\u0010\u0091\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008e\u0001\u00108\u001a\u0005\b\u008f\u0001\u0010F\"\u0005\b\u0090\u0001\u0010HR&\u0010\u0095\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0092\u0001\u00108\u001a\u0005\b\u0093\u0001\u0010F\"\u0005\b\u0094\u0001\u0010HR&\u0010\u0099\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0096\u0001\u00108\u001a\u0005\b\u0097\u0001\u0010F\"\u0005\b\u0098\u0001\u0010HR&\u0010\u009d\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009a\u0001\u00108\u001a\u0005\b\u009b\u0001\u0010F\"\u0005\b\u009c\u0001\u0010HR&\u0010¡\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009e\u0001\u00108\u001a\u0005\b\u009f\u0001\u0010F\"\u0005\b \u0001\u0010HR*\u0010©\u0001\u001a\u00030¢\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R&\u0010\u00ad\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bª\u0001\u00108\u001a\u0005\b«\u0001\u0010F\"\u0005\b¬\u0001\u0010HR/\u0010´\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001R/\u0010¸\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bµ\u0001\u0010¯\u0001\u001a\u0006\b¶\u0001\u0010±\u0001\"\u0006\b·\u0001\u0010³\u0001R)\u0010¿\u0001\u001a\u00030¹\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bº\u0001\u0010~\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R)\u0010Æ\u0001\u001a\u00030À\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bÁ\u0001\u0010&\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0006\bÄ\u0001\u0010Å\u0001R)\u0010Ê\u0001\u001a\u00030À\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bÇ\u0001\u0010&\u001a\u0006\bÈ\u0001\u0010Ã\u0001\"\u0006\bÉ\u0001\u0010Å\u0001R(\u0010Î\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bË\u0001\u00108\u001a\u0005\bÌ\u0001\u0010F\"\u0005\bÍ\u0001\u0010HR(\u0010Ò\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÏ\u0001\u00108\u001a\u0005\bÐ\u0001\u0010F\"\u0005\bÑ\u0001\u0010HR&\u0010Ö\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÓ\u0001\u00108\u001a\u0005\bÔ\u0001\u0010F\"\u0005\bÕ\u0001\u0010HR(\u0010Ú\u0001\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b×\u0001\u00108\u001a\u0005\bØ\u0001\u0010F\"\u0005\bÙ\u0001\u0010HR\u001a\u0010Þ\u0001\u001a\u00030Û\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÜ\u0001\u0010Ý\u0001R*\u0010æ\u0001\u001a\u00030ß\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bà\u0001\u0010á\u0001\u001a\u0006\bâ\u0001\u0010ã\u0001\"\u0006\bä\u0001\u0010å\u0001¨\u0006é\u0001"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/dobChange/DobChangeActivity;", "Lcom/zepto/o40;", "", "S1", "r2", "i2", "T1", "B2", "D2", "Landroid/content/Intent;", "intent", "", "lastEndRTO", "lastEndState", "purCode", "Ljava/util/ArrayList;", "multiList", "q2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "message", "C2", "date", "U1", "Lcom/zepto/vf;", "F", "Lcom/zepto/vf;", "binding", "Lcom/zepto/wa3;", "G", "Lcom/zepto/wa3;", "langSession", "Lcom/zepto/rb1;", "H", "Lcom/zepto/rb1;", "viewModel", "Lcom/zepto/qd0;", "I", "Lcom/zepto/qd0;", "chnageDobViewModel", "", "Lcom/nic/mparivahan/dlservices/data/model/duplicatedl/ReasonsMasterItem;", "J", "Ljava/util/List;", "mReasonList", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "K", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "L", "Ljava/lang/String;", "formated_date", "M", "willingToDonate", "Lcom/zepto/ws6;", "N", "Lcom/zepto/ws6;", "e2", "()Lcom/zepto/ws6;", "setMSessionmanger", "(Lcom/zepto/ws6;)V", "mSessionmanger", "O", "W1", "()Ljava/lang/String;", "setDlNo", "(Ljava/lang/String;)V", "dlNo", "P", "X1", "setDob", "dob", "Q", "f2", "setMobile_no", "Mobile_no", "R", "Z1", "setLastEndorseRto", "lastEndorseRto", "S", "a2", "setLastEndorseState", "lastEndorseState", "T", "Y1", "setLastEndorseRTOCode", "lastEndorseRTOCode", "U", "b2", "setLastEndorseStateCode", "lastEndorseStateCode", "V", "getState_value", "setState_value", "state_value", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "W", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "V1", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "F2", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "dlDetails", "Ljava/util/HashMap;", "X", "Ljava/util/HashMap;", "getWhatServiceRequired", "()Ljava/util/HashMap;", "setWhatServiceRequired", "(Ljava/util/HashMap;)V", "whatServiceRequired", "Lcom/zepto/wl5;", "Y", "Lcom/zepto/wl5;", "h2", "()Lcom/zepto/wl5;", "K2", "(Lcom/zepto/wl5;)V", "sarthiSession", "Z", "getForm1FlagDLserReq", "setForm1FlagDLserReq", "form1FlagDLserReq", "a0", "getSubmitFormOne", "setSubmitFormOne", "submitFormOne", "b0", "getAString", "setAString", "aString", "c0", "getBString", "setBString", "bString", "d0", "getCString", "setCString", "cString", "e0", "getDString", "setDString", "dString", "f0", "getEString", "setEString", "eString", "g0", "getFString", "setFString", "fString", "h0", "getGString", "setGString", "gString", "Landroid/content/Context;", "i0", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "I2", "(Landroid/content/Context;)V", "mContext", "j0", "getAppCategory", "E2", "appCategory", "k0", "Ljava/util/ArrayList;", "g2", "()Ljava/util/ArrayList;", "J2", "(Ljava/util/ArrayList;)V", "multiListName", "l0", "c2", "G2", "listHeaderSteps", "", "m0", "getCOA", "()Z", "setCOA", "(Z)V", "COA", "", "n0", "getWidthPixels", "()I", "setWidthPixels", "(I)V", "widthPixels", "o0", "getSerialNo", "setSerialNo", "serialNo", "p0", "getBioRecGenesis", "setBioRecGenesis", "bioRecGenesis", "q0", "getReasonName", "setReasonName", "reasonName", "r0", "getMetaflag", "setMetaflag", "metaflag", "s0", "getAllowAddrChangeAtDlservReqst", "setAllowAddrChangeAtDlservReqst", "allowAddrChangeAtDlservReqst", "Lcom/zepto/fs0;", "t0", "Lcom/zepto/fs0;", "mCombineViewModel", "Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;", "u0", "Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;", "d2", "()Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;", "H2", "(Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;)V", "mCombineServiceInterface", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDobChangeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DobChangeActivity.kt\ncom/nic/mparivahan/dlservices/ui/dobChange/DobChangeActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1616:1\n1855#2,2:1617\n*S KotlinDebug\n*F\n+ 1 DobChangeActivity.kt\ncom/nic/mparivahan/dlservices/ui/dobChange/DobChangeActivity\n*L\n925#1:1617,2\n*E\n"})
public final class DobChangeActivity extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public vf binding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public rb1 viewModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public qd0 chnageDobViewModel;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public List mReasonList;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String formated_date;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ws6 mSessionmanger;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String dlNo;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String dob;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public DldetobjX dlDetails;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public ArrayList multiListName;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public ArrayList listHeaderSteps;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public boolean COA;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public int widthPixels;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public int serialNo;

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    public fs0 mCombineViewModel;

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    public CombineServiceInterface mCombineServiceInterface;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String willingToDonate = "Y";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String Mobile_no = "";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String lastEndorseRto = "";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String lastEndorseState = "";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String lastEndorseRTOCode = "";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String lastEndorseStateCode = "";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String state_value = "";

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public HashMap whatServiceRequired = new HashMap();

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String form1FlagDLserReq = "N";

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String submitFormOne = "N";

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String aString = "";

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public String bString = "";

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public String cString = "";

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public String dString = "";

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public String eString = "";

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public String fString = "";

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public String gString = "N";

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public String appCategory = "0";

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public String bioRecGenesis = "";

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public String reasonName = "";

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public String metaflag = "";

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
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
            DobChangeActivity.this.E2(((AppCatPojo) ((ArrayList) this.b.element).get(i)).getAppCode());
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(GetReasonsTransWiseResponse getReasonsTransWiseResponse) {
            try {
                if (StringsKt__StringsJVMKt.equals$default(getReasonsTransWiseResponse.getStatusCode(), "00", false, 2, null)) {
                    DobChangeActivity.this.mReasonList = getReasonsTransWiseResponse.getReasonsMaster();
                } else {
                    DobChangeActivity.this.C2(getReasonsTransWiseResponse.getStatusDesc());
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

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(GetAckDetForGivenDLNumberResponse getAckDetForGivenDLNumberResponse) throws Throwable {
            List<ResultItemSubmit> result;
            wa3 wa3Var = null;
            try {
                try {
                    vf vfVar = DobChangeActivity.this.binding;
                    if (vfVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        vfVar = null;
                    }
                    vfVar.l.c(false);
                    DlSubmitResult dlSubmitresult = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                    if (StringsKt__StringsJVMKt.equals$default(dlSubmitresult != null ? dlSubmitresult.getStatusCode() : null, "00", false, 2, null)) {
                        DlSubmitResult dlSubmitresult2 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                        if (dlSubmitresult2 != null && (result = dlSubmitresult2.getResult()) != null && (!result.isEmpty())) {
                            DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity = new DLServiceAcknowlegementActivity();
                            ResultItemSubmit resultItemSubmit = getAckDetForGivenDLNumberResponse.getDlSubmitresult().getResult().get(0);
                            if (resultItemSubmit != null) {
                                DobChangeActivity dobChangeActivity = DobChangeActivity.this;
                                try {
                                    DlLogCapture.Companion companion = DlLogCapture.INSTANCE;
                                    String applicationDate = resultItemSubmit.getApplicationDate();
                                    String applicationNo = resultItemSubmit.getApplicationNo();
                                    Intrinsics.checkNotNull(applicationNo);
                                    long j = Long.parseLong(applicationNo);
                                    int i = Integer.parseInt(dobChangeActivity.e2().k());
                                    String dateofBirth = resultItemSubmit.getDateofBirth();
                                    String dlno = resultItemSubmit.getDlno();
                                    Intrinsics.checkNotNull(dlno);
                                    String applicantGender = resultItemSubmit.getApplicantGender();
                                    String mobile_no = dobChangeActivity.getMobile_no();
                                    Intrinsics.checkNotNull(mobile_no);
                                    companion.a(dobChangeActivity, "1234", "S", applicationDate, j, i, dateofBirth, dlno, "N", "N", applicantGender, mobile_no, false, "548", dobChangeActivity.getLastEndorseRTOCode(), dobChangeActivity.getLastEndorseStateCode());
                                } catch (Exception e) {
                                    Log.d("valiii", e.getLocalizedMessage());
                                }
                                if (!Intrinsics.areEqual(dobChangeActivity.h2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                                    dobChangeActivity.J2(new ArrayList());
                                    dobChangeActivity.g2().add(dobChangeActivity.h2().k());
                                }
                                dLServiceAcknowlegementActivity.K2(dobChangeActivity, resultItemSubmit, dobChangeActivity.getLastEndorseRTOCode(), dobChangeActivity.V1(), dobChangeActivity.getDlNo(), dobChangeActivity.getDob(), dobChangeActivity.getMobile_no(), dobChangeActivity.getLastEndorseRto(), dobChangeActivity.getLastEndorseState(), dobChangeActivity.getLastEndorseStateCode(), dobChangeActivity.g2());
                            }
                        }
                    } else {
                        DlSubmitResult dlSubmitresult3 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                        String reqStatus = dlSubmitresult3 != null ? dlSubmitresult3.getReqStatus() : null;
                        if (reqStatus == null || reqStatus.length() == 0) {
                            DobChangeActivity dobChangeActivity2 = DobChangeActivity.this;
                            wa3 wa3Var2 = dobChangeActivity2.langSession;
                            if (wa3Var2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                                wa3Var2 = null;
                            }
                            dobChangeActivity2.C2(wa3Var2.b("service_is_not_present", DobChangeActivity.this.getString(R.string.unable_to_get_details)));
                        } else {
                            DobChangeActivity dobChangeActivity3 = DobChangeActivity.this;
                            DlSubmitResult dlSubmitresult4 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                            String reqStatus2 = dlSubmitresult4 != null ? dlSubmitresult4.getReqStatus() : null;
                            Intrinsics.checkNotNull(reqStatus2);
                            dobChangeActivity3.C2(reqStatus2);
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            } catch (Exception unused) {
                vf vfVar2 = DobChangeActivity.this.binding;
                if (vfVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    vfVar2 = null;
                }
                vfVar2.l.c(false);
                DobChangeActivity dobChangeActivity4 = DobChangeActivity.this;
                wa3 wa3Var3 = dobChangeActivity4.langSession;
                if (wa3Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("langSession");
                } else {
                    wa3Var = wa3Var3;
                }
                dobChangeActivity4.C2(wa3Var.b("service_is_not_present", DobChangeActivity.this.getString(R.string.unable_to_get_details)));
            }
            Log.e("Response", getAckDetForGivenDLNumberResponse.toString());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((GetAckDetForGivenDLNumberResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d implements d86.b {
        public d() {
        }

        @Override // com.zepto.d86.b
        public void a(String str, int i) {
            ReasonsMasterItem reasonsMasterItem;
            List list = DobChangeActivity.this.mReasonList;
            vf vfVar = null;
            Integer reasonCode = (list == null || (reasonsMasterItem = (ReasonsMasterItem) list.get(i)) == null) ? null : reasonsMasterItem.getReasonCode();
            vf vfVar2 = DobChangeActivity.this.binding;
            if (vfVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                vfVar2 = null;
            }
            vfVar2.j.setText(str);
            vf vfVar3 = DobChangeActivity.this.binding;
            if (vfVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                vfVar3 = null;
            }
            vfVar3.j.setContentDescription("" + reasonCode);
            vf vfVar4 = DobChangeActivity.this.binding;
            if (vfVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                vfVar4 = null;
            }
            if (StringsKt__StringsJVMKt.equals(vfVar4.j.getText().toString(), "Miscellaneous", true)) {
                vf vfVar5 = DobChangeActivity.this.binding;
                if (vfVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    vfVar = vfVar5;
                }
                vfVar.k.setVisibility(0);
                return;
            }
            vf vfVar6 = DobChangeActivity.this.binding;
            if (vfVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                vfVar = vfVar6;
            }
            vfVar.k.setVisibility(8);
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

    public static final class f implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public f(Function1 function) {
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

    public static final void A2(DobChangeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) DlServiceDetailsActivity.class);
            intent.putExtra("DL", this$0.dlNo);
            intent.putExtra("dob", this$0.dob);
            intent.putExtra("DLDetails", this$0.V1());
            intent.putExtra("Mobile_no", this$0.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this$0.lastEndorseRto);
            intent.putExtra("lastEndorsedState", this$0.lastEndorseState);
            intent.putExtra("lastEndorsedRTOCode", this$0.lastEndorseRTOCode);
            intent.putExtra("lastEndorseStateCode", this$0.lastEndorseStateCode);
            intent.putExtra("whatServiceRequired", this$0.whatServiceRequired);
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void B2() {
        ArrayList arrayList = new ArrayList();
        List<ReasonsMasterItem> list = this.mReasonList;
        if (list != null) {
            for (ReasonsMasterItem reasonsMasterItem : list) {
                arrayList.add(String.valueOf(reasonsMasterItem != null ? reasonsMasterItem.getReasonName() : null));
            }
        }
        d86 d86VarA = d86.INSTANCE.a("Select Reason", arrayList);
        d86VarA.k2(I0(), "ReasonPicker");
        d86VarA.n2(new d());
    }

    private final void D2() {
        fs0 fs0Var;
        String str;
        wa3 wa3Var = null;
        wa3 wa3Var2 = null;
        vf vfVar = null;
        try {
            if (g2().size() <= this.serialNo) {
                CombineReq combineReq = (CombineReq) new Gson().fromJson(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getString("MultiService", ""), CombineReq.class);
                if (!com.nic.mparivahan.a.a.a(this)) {
                    Context applicationContext = getApplicationContext();
                    wa3 wa3Var3 = this.langSession;
                    if (wa3Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("langSession");
                    } else {
                        wa3Var = wa3Var3;
                    }
                    Toast.makeText(applicationContext, wa3Var.b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
                    return;
                }
                vf vfVar2 = this.binding;
                if (vfVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    vfVar2 = null;
                }
                vfVar2.l.c(true);
                ArrayList arrayList = new ArrayList();
                int size = V1().getDlcovs().size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(String.valueOf(V1().getDlcovs().get(i).getDcCovcd()));
                }
                fs0 fs0Var2 = this.mCombineViewModel;
                if (fs0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCombineViewModel");
                    fs0Var = null;
                } else {
                    fs0Var = fs0Var2;
                }
                boolean z = this.COA;
                String str2 = this.bioRecGenesis;
                Intrinsics.checkNotNull(str2);
                String str3 = this.allowAddrChangeAtDlservReqst;
                Intrinsics.checkNotNull(str3);
                ArrayList arrayListG2 = g2();
                String str4 = this.appCategory;
                String str5 = this.dlNo;
                Intrinsics.checkNotNull(str5);
                String string = StringsKt__StringsKt.trim((CharSequence) str5).toString();
                String str6 = this.dob;
                Intrinsics.checkNotNull(str6);
                String strU1 = U1(str6);
                String string2 = StringsKt__StringsKt.trim((CharSequence) this.lastEndorseRTOCode).toString();
                String relationType = combineReq.getRelationType();
                Intrinsics.checkNotNull(relationType);
                String strValueOf = String.valueOf(combineReq.getConDlReasonCode());
                String conDlReasonName = combineReq.getConDlReasonName();
                Intrinsics.checkNotNull(conDlReasonName);
                String applFirstName = combineReq.getApplFirstName();
                Intrinsics.checkNotNull(applFirstName);
                String conEffdate = combineReq.getConEffdate();
                Intrinsics.checkNotNull(conEffdate);
                String applFirstName2 = combineReq.getApplFirstName();
                Intrinsics.checkNotNull(applFirstName2);
                String applLastName = combineReq.getApplLastName();
                Intrinsics.checkNotNull(applLastName);
                String relFirstName = combineReq.getRelFirstName();
                Intrinsics.checkNotNull(relFirstName);
                String relLastName = combineReq.getRelLastName();
                Intrinsics.checkNotNull(relLastName);
                String str7 = this.Mobile_no;
                Intrinsics.checkNotNull(str7);
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
                String str8 = this.formated_date;
                if (str8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("formated_date");
                    str = null;
                } else {
                    str = str8;
                }
                String str9 = this.reasonName;
                Intrinsics.checkNotNull(str9);
                vf vfVar3 = this.binding;
                if (vfVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    vfVar = vfVar3;
                }
                String string3 = vfVar.j.getContentDescription().toString();
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
                fs0Var.g(z, arrayList, str2, str3, arrayListG2, "mobSARATHI", "657d1c758e2e95af0014e16f5109f933", "10.248.210.8", "sarathiservice", str4, "NA", string, strU1, string2, "N", relationType, strValueOf, conDlReasonName, applFirstName, conEffdate, applFirstName2, applLastName, relFirstName, relLastName, str7, changeOfAddReq, perHouseNo, perStreet, perLocation, permVillageOrTown, perSubDistrict, perDistrict, perState, perPinCode, presHouseNo, presStreet, presLocation, presVillageOrTown, presSubDistrict, presDistrict, presState, presPincode, dleDlReasonCode, dleDlReasonName, dupDlReasonName, dupDlReasonCode, str, str9, string3, declaringcheck, hillcertificate, hillissueDate, hillvalidFrom, hillvalidTo, hilldrivingschool, hillissby, pofbirth, country, passno, passvaltill, visano, visavaltill, tovisit, iscountryrestricted, countryRestrictedReason, strIsDlSerdisqualified, dlSerdisqualifiedReason, forAdd1, forAdd2, forAdd3, forAddPinCode, forNationMobNum, emailID, appliedIdpfromIndEmb, indEmbName, embPlace, dateOfVerifEmb, embEndorseNo, idpcountryapplyfrom, h2().f(), h2().g(), h2().e(), h2().h());
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
            String str10 = this.formated_date;
            if (str10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("formated_date");
                str10 = null;
            }
            combineReq3.setApplDateOfBirth(str10);
            combineReq3.setCodobDlReasonName(this.reasonName);
            vf vfVar4 = this.binding;
            if (vfVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                vfVar4 = null;
            }
            combineReq3.setCodobDlReasonCode(vfVar4.j.getContentDescription().toString());
            combineReq3.setDupDlReasonName(combineReq2.getDupDlReasonName());
            combineReq3.setDupDlReasonCode(combineReq2.getDupDlReasonCode());
            combineReq3.setDleDlReasonCode(combineReq2.getDleDlReasonCode());
            combineReq3.setDleDlReasonName(combineReq2.getDleDlReasonName());
            combineReq3.setApplcatgDLserReq(combineReq2.getApplcatgDLserReq());
            combineReq3.setDlHolderAltMobMum(combineReq2.getDlHolderAltMobMum());
            combineReq3.setWilltoDonateOrgans(combineReq2.getWilltoDonateOrgans());
            combineReq3.setRelationType(combineReq2.getRelationType());
            combineReq3.setConDlReasonCode(combineReq2.getConDlReasonCode());
            combineReq3.setConDlReasonName(combineReq2.getConDlReasonName());
            combineReq3.setDlHolderNaturalName(combineReq2.getDlHolderNaturalName());
            combineReq3.setConEffdate(combineReq2.getConEffdate());
            combineReq3.setApplFirstName(combineReq2.getApplFirstName());
            combineReq3.setApplLastName(combineReq2.getApplLastName());
            combineReq3.setRelFirstName(combineReq2.getRelFirstName());
            combineReq3.setRelLastName(combineReq2.getRelLastName());
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
            combineReq3.setDeclaringcheck(combineReq2.getDeclaringcheck());
            combineReq3.setHillcertificate(combineReq2.getHillcertificate());
            combineReq3.setHillissueDate(combineReq2.getHillissueDate());
            combineReq3.setHillvalidFrom(combineReq2.getHillvalidFrom());
            combineReq3.setHillvalidTo(combineReq2.getHillvalidTo());
            combineReq3.setHilldrivingschool(combineReq2.getHilldrivingschool());
            combineReq3.setHillissby(combineReq2.getHillissby());
            if (Intrinsics.areEqual(this.willingToDonate, "Y")) {
                combineReq3.setWilltoDonateOrgans("Y");
                vf vfVar5 = this.binding;
                if (vfVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    vfVar5 = null;
                }
                combineReq3.setDlHolderAltMobMum(String.valueOf(vfVar5.q.getText()));
            } else {
                combineReq3.setWilltoDonateOrgans("N");
                combineReq3.setDlHolderAltMobMum("NA");
            }
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit();
            editorEdit.putString("MultiService", new Gson().toJson(combineReq3));
            editorEdit.commit();
            Object obj = g2().get(this.serialNo);
            wa3 wa3Var4 = this.langSession;
            if (wa3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                wa3Var4 = null;
            }
            if (Intrinsics.areEqual(obj, wa3Var4.b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                setIntent(new Intent(this, (Class<?>) DLDuplicateActivity.class));
                Intent intent = getIntent();
                Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                q2(intent, this.lastEndorseRTOCode, this.lastEndorseState, "513", g2());
                return;
            }
            Object obj2 = g2().get(this.serialNo);
            wa3 wa3Var5 = this.langSession;
            if (wa3Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                wa3Var5 = null;
            }
            if (Intrinsics.areEqual(obj2, wa3Var5.b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                setIntent(new Intent(this, (Class<?>) RenewalOfDLActivity.class));
                Intent intent2 = getIntent();
                Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
                q2(intent2, this.lastEndorseRTOCode, this.lastEndorseState, "514", g2());
                return;
            }
            Object obj3 = g2().get(this.serialNo);
            wa3 wa3Var6 = this.langSession;
            if (wa3Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                wa3Var6 = null;
            }
            if (Intrinsics.areEqual(obj3, wa3Var6.b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                setIntent(new Intent(this, (Class<?>) RenewalOfDLActivity.class));
                Intent intent3 = getIntent();
                Intrinsics.checkNotNullExpressionValue(intent3, "getIntent(...)");
                q2(intent3, this.lastEndorseRTOCode, this.lastEndorseState, "537", g2());
                return;
            }
            Object obj4 = g2().get(this.serialNo);
            wa3 wa3Var7 = this.langSession;
            if (wa3Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                wa3Var7 = null;
            }
            if (Intrinsics.areEqual(obj4, wa3Var7.b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                setIntent(new Intent(this, (Class<?>) ChangeOfAddressActivity.class));
                Intent intent4 = getIntent();
                Intrinsics.checkNotNullExpressionValue(intent4, "getIntent(...)");
                q2(intent4, this.lastEndorseRTOCode, this.lastEndorseState, "515", g2());
                return;
            }
            Object obj5 = g2().get(this.serialNo);
            wa3 wa3Var8 = this.langSession;
            if (wa3Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                wa3Var8 = null;
            }
            if (Intrinsics.areEqual(obj5, wa3Var8.b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                setIntent(new Intent(this, (Class<?>) DLReplecementActivity.class));
                Intent intent5 = getIntent();
                Intrinsics.checkNotNullExpressionValue(intent5, "getIntent(...)");
                q2(intent5, this.lastEndorseRTOCode, this.lastEndorseState, "516", g2());
                return;
            }
            Object obj6 = g2().get(this.serialNo);
            wa3 wa3Var9 = this.langSession;
            if (wa3Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                wa3Var9 = null;
            }
            if (Intrinsics.areEqual(obj6, wa3Var9.b("check_dl_serv_extract_dl", "DL Extract"))) {
                setIntent(new Intent(this, (Class<?>) DLExtractActivity.class));
                Intent intent6 = getIntent();
                Intrinsics.checkNotNullExpressionValue(intent6, "getIntent(...)");
                q2(intent6, this.lastEndorseRTOCode, this.lastEndorseState, "523", g2());
                return;
            }
            Object obj7 = g2().get(this.serialNo);
            wa3 wa3Var10 = this.langSession;
            if (wa3Var10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                wa3Var10 = null;
            }
            if (Intrinsics.areEqual(obj7, wa3Var10.b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                setIntent(new Intent(this, (Class<?>) HillReligion.class));
                Intent intent7 = getIntent();
                Intrinsics.checkNotNullExpressionValue(intent7, "getIntent(...)");
                q2(intent7, this.lastEndorseRTOCode, this.lastEndorseState, "524", g2());
                return;
            }
            Object obj8 = g2().get(this.serialNo);
            wa3 wa3Var11 = this.langSession;
            if (wa3Var11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                wa3Var11 = null;
            }
            if (Intrinsics.areEqual(obj8, wa3Var11.b("change_name_dl", "Change of Name in DL"))) {
                setIntent(new Intent(this, (Class<?>) ChangeOfName.class));
                Intent intent8 = getIntent();
                Intrinsics.checkNotNullExpressionValue(intent8, "getIntent(...)");
                q2(intent8, this.lastEndorseRTOCode, this.lastEndorseState, "526", g2());
                return;
            }
            Object obj9 = g2().get(this.serialNo);
            wa3 wa3Var12 = this.langSession;
            if (wa3Var12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
            } else {
                wa3Var2 = wa3Var12;
            }
            if (Intrinsics.areEqual(obj9, wa3Var2.b("change_birth_dl", "Change of Date of Birth in DL"))) {
                setIntent(new Intent(this, (Class<?>) DobChangeActivity.class));
                Intent intent9 = getIntent();
                Intrinsics.checkNotNullExpressionValue(intent9, "getIntent(...)");
                q2(intent9, this.lastEndorseRTOCode, this.lastEndorseState, "548", g2());
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.ArrayList] */
    private final void S1() {
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
        vf vfVar = this.binding;
        vf vfVar2 = null;
        if (vfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar = null;
        }
        vfVar.t.setAdapter((SpinnerAdapter) oqVar);
        int size = ((ArrayList) objectRef.element).size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) h2().a()).toString(), StringsKt__StringsKt.trim((CharSequence) ((AppCatPojo) ((ArrayList) objectRef.element).get(i)).getAppCode()).toString())) {
                vf vfVar3 = this.binding;
                if (vfVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    vfVar3 = null;
                }
                vfVar3.t.setSelection(i);
            } else {
                i++;
            }
        }
        vf vfVar4 = this.binding;
        if (vfVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar4 = null;
        }
        vfVar4.t.setOnItemSelectedListener(new a(objectRef));
        if (StringsKt__StringsJVMKt.equals$default(this.bioRecGenesis, "S", false, 2, null)) {
            vf vfVar5 = this.binding;
            if (vfVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                vfVar2 = vfVar5;
            }
            vfVar2.t.setEnabled(true);
            return;
        }
        if (this.appCategory.equals("0")) {
            vf vfVar6 = this.binding;
            if (vfVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                vfVar2 = vfVar6;
            }
            vfVar2.t.setEnabled(true);
            return;
        }
        vf vfVar7 = this.binding;
        if (vfVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            vfVar2 = vfVar7;
        }
        vfVar2.t.setEnabled(false);
    }

    private final void T1() {
        String strValueOf;
        qd0 qd0Var;
        String str;
        try {
            if (Intrinsics.areEqual(this.willingToDonate, "Y")) {
                vf vfVar = this.binding;
                if (vfVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    vfVar = null;
                }
                strValueOf = String.valueOf(vfVar.q.getText());
            } else {
                strValueOf = "NA";
            }
            String str2 = strValueOf;
            vf vfVar2 = this.binding;
            if (vfVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                vfVar2 = null;
            }
            vfVar2.l.c(true);
            qd0 qd0Var2 = this.chnageDobViewModel;
            if (qd0Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chnageDobViewModel");
                qd0Var = null;
            } else {
                qd0Var = qd0Var2;
            }
            String str3 = this.dlNo;
            String str4 = this.dob;
            Intrinsics.checkNotNull(str4);
            String strU1 = U1(str4);
            String str5 = this.lastEndorseRTOCode;
            vf vfVar3 = this.binding;
            if (vfVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                vfVar3 = null;
            }
            String string = vfVar3.j.getContentDescription().toString();
            vf vfVar4 = this.binding;
            if (vfVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                vfVar4 = null;
            }
            String string2 = vfVar4.j.getText().toString();
            String str6 = this.willingToDonate;
            String str7 = this.Mobile_no;
            Intrinsics.checkNotNull(str7);
            String str8 = this.formated_date;
            if (str8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("formated_date");
                str = null;
            } else {
                str = str8;
            }
            qd0Var.g(str3, strU1, str5, string, string2, str6, str2, str7, str, "G", h2().f(), h2().g(), h2().e(), h2().h());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void i2() {
        vf vfVar;
        this.viewModel = (rb1) new z(this).a(rb1.class);
        if (getIntent() != null) {
            try {
                this.dlNo = String.valueOf(getIntent().getStringExtra("DL"));
                this.dob = String.valueOf(getIntent().getStringExtra("dob"));
                this.Mobile_no = String.valueOf(getIntent().getStringExtra("Mobile_no"));
                Serializable serializableExtra = getIntent().getSerializableExtra("DLDetails");
                Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
                F2((DldetobjX) serializableExtra);
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
                vf vfVar2 = this.binding;
                if (vfVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    vfVar2 = null;
                }
                TextView textView = vfVar2.f;
                StringBuilder sb = new StringBuilder();
                wa3 wa3Var = this.langSession;
                if (wa3Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("langSession");
                    wa3Var = null;
                }
                sb.append(wa3Var.b("dl_no", "DL No. : "));
                sb.append(' ');
                sb.append(this.dlNo);
                textView.setText(sb.toString());
            } catch (Exception unused) {
            }
        }
        if (Intrinsics.areEqual(h2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                this.serialNo = getIntent().getIntExtra("serialNo", 0);
                Serializable serializableExtra3 = getIntent().getSerializableExtra("multiList");
                Intrinsics.checkNotNull(serializableExtra3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                J2((ArrayList) serializableExtra3);
                Serializable serializableExtra4 = getIntent().getSerializableExtra("listHeaderSteps");
                Intrinsics.checkNotNull(serializableExtra4, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                G2((ArrayList) serializableExtra4);
                Serializable serializableExtra5 = getIntent().getSerializableExtra("COA");
                Intrinsics.checkNotNull(serializableExtra5, "null cannot be cast to non-null type kotlin.Boolean");
                this.COA = ((Boolean) serializableExtra5).booleanValue();
                String stringExtra6 = getIntent().getStringExtra("metaflag");
                Intrinsics.checkNotNull(stringExtra6, "null cannot be cast to non-null type kotlin.String");
                this.metaflag = stringExtra6;
                this.bioRecGenesis = String.valueOf(getIntent().getStringExtra("bioRecGenesis"));
                this.allowAddrChangeAtDlservReqst = String.valueOf(getIntent().getStringExtra("allowAddrChangeAtDlservReqst"));
                H2(CombineServiceInterface.INSTANCE.a(this));
                this.mCombineViewModel = (fs0) new z(this, new ds0(new cs0(d2()))).a(fs0.class);
                if (Build.VERSION.SDK_INT >= 30) {
                    WindowMetrics maximumWindowMetrics = getWindowManager().getMaximumWindowMetrics();
                    Intrinsics.checkNotNullExpressionValue(maximumWindowMetrics, "getMaximumWindowMetrics(...)");
                    Rect bounds = maximumWindowMetrics.getBounds();
                    Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
                    int i = bounds.right;
                    this.widthPixels = i;
                    Log.d("Width", String.valueOf(i));
                } else {
                    int i2 = getResources().getDisplayMetrics().widthPixels;
                    this.widthPixels = i2;
                    Log.d("Width 1", String.valueOf(i2));
                }
                if (Intrinsics.areEqual(h2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                    try {
                        if (c2().size() > 1) {
                            vf vfVar3 = this.binding;
                            if (vfVar3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                vfVar3 = null;
                            }
                            vfVar3.o.setLayoutManager(new LinearLayoutManager(this, 0, false));
                            ArrayList arrayListC2 = c2();
                            int i3 = this.serialNo;
                            int i4 = this.widthPixels;
                            wa3 wa3Var2 = this.langSession;
                            if (wa3Var2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                                wa3Var2 = null;
                            }
                            String strB = wa3Var2.b("change_birth_dl", "Change of Date of Birth in DL");
                            Intrinsics.checkNotNull(strB);
                            k76 k76Var = new k76(arrayListC2, this, i3, i4, strB);
                            vf vfVar4 = this.binding;
                            if (vfVar4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                vfVar4 = null;
                            }
                            vfVar4.o.setAdapter(k76Var);
                        }
                    } catch (Exception unused2) {
                    }
                }
                if (this.serialNo == g2().size()) {
                    vf vfVar5 = this.binding;
                    if (vfVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        vfVar5 = null;
                    }
                    vfVar5.x.setVisibility(0);
                    vf vfVar6 = this.binding;
                    if (vfVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        vfVar6 = null;
                    }
                    vfVar6.b.setVisibility(0);
                    vf vfVar7 = this.binding;
                    if (vfVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        vfVar7 = null;
                    }
                    CustomWegetLayout customWegetLayout = vfVar7.l;
                    wa3 wa3Var3 = this.langSession;
                    if (wa3Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("langSession");
                        wa3Var3 = null;
                    }
                    customWegetLayout.setText(wa3Var3.b("vahan_btn_submit", "Submit"));
                    vf vfVar8 = this.binding;
                    if (vfVar8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        vfVar8 = null;
                    }
                    vfVar8.h.setVisibility(0);
                    this.willingToDonate = "Y";
                } else {
                    vf vfVar9 = this.binding;
                    if (vfVar9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        vfVar9 = null;
                    }
                    CustomWegetLayout customWegetLayout2 = vfVar9.l;
                    wa3 wa3Var4 = this.langSession;
                    if (wa3Var4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("langSession");
                        wa3Var4 = null;
                    }
                    customWegetLayout2.setText(wa3Var4.b("btn_dl_serv_next", "Next"));
                    vf vfVar10 = this.binding;
                    if (vfVar10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        vfVar10 = null;
                    }
                    vfVar10.x.setVisibility(8);
                    vf vfVar11 = this.binding;
                    if (vfVar11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        vfVar11 = null;
                    }
                    vfVar11.b.setVisibility(8);
                    vf vfVar12 = this.binding;
                    if (vfVar12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        vfVar12 = null;
                    }
                    vfVar12.h.setVisibility(8);
                    this.willingToDonate = "N";
                }
            } catch (Exception unused3) {
            }
        }
        if (Intrinsics.areEqual(h2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                if (c2().size() == 1) {
                    vf vfVar13 = this.binding;
                    if (vfVar13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        vfVar13 = null;
                    }
                    vfVar13.n.g.setText((CharSequence) c2().get(0));
                    vf vfVar14 = this.binding;
                    if (vfVar14 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        vfVar14 = null;
                    }
                    vfVar14.n.f.setVisibility(8);
                } else {
                    vf vfVar15 = this.binding;
                    if (vfVar15 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        vfVar15 = null;
                    }
                    TextView textView2 = vfVar15.n.g;
                    wa3 wa3Var5 = this.langSession;
                    if (wa3Var5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("langSession");
                        wa3Var5 = null;
                    }
                    String strB2 = wa3Var5.b("dl_services", getString(R.string.dl_services));
                    Intrinsics.checkNotNull(strB2);
                    textView2.setText(strB2);
                    vf vfVar16 = this.binding;
                    if (vfVar16 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        vfVar16 = null;
                    }
                    vfVar16.n.f.setVisibility(8);
                    vf vfVar17 = this.binding;
                    if (vfVar17 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        vfVar17 = null;
                    }
                    TextView textView3 = vfVar17.n.g;
                    vf vfVar18 = this.binding;
                    if (vfVar18 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        vfVar18 = null;
                    }
                    textView3.setPaintFlags(vfVar18.n.g.getPaintFlags() | 8);
                }
            } catch (Exception unused4) {
            }
        } else {
            vf vfVar19 = this.binding;
            if (vfVar19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                vfVar19 = null;
            }
            TextView textView4 = vfVar19.n.g;
            wa3 wa3Var6 = this.langSession;
            if (wa3Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                wa3Var6 = null;
            }
            textView4.setText(wa3Var6.b("change_birth_dl", "Change of Date of Birth in DL"));
        }
        this.chnageDobViewModel = (qd0) new z(this).a(qd0.class);
        if (com.nic.mparivahan.a.a.a(this)) {
            rb1 rb1Var = this.viewModel;
            if (rb1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                rb1Var = null;
            }
            rb1Var.r("548");
        } else {
            Context applicationContext = getApplicationContext();
            wa3 wa3Var7 = this.langSession;
            if (wa3Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
                wa3Var7 = null;
            }
            Toast.makeText(applicationContext, wa3Var7.b("service_is_not_present", getString(R.string.unable_to_get_details)), 0).show();
        }
        vf vfVar20 = this.binding;
        if (vfVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar20 = null;
        }
        vfVar20.j.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.et1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DobChangeActivity.j2(this.a, view);
            }
        });
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.ft1
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i5, int i6, int i7) {
                DobChangeActivity.k2(this.a, datePicker, i5, i6, i7);
            }
        };
        vf vfVar21 = this.binding;
        if (vfVar21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar21 = null;
        }
        vfVar21.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gt1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DobChangeActivity.l2(this.a, onDateSetListener, view);
            }
        });
        vf vfVar22 = this.binding;
        if (vfVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar22 = null;
        }
        vfVar22.l.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ht1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DobChangeActivity.m2(this.a, view);
            }
        });
        vf vfVar23 = this.binding;
        if (vfVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar23 = null;
        }
        vfVar23.z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.it1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DobChangeActivity.n2(this.a, view);
            }
        });
        vf vfVar24 = this.binding;
        if (vfVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar24 = null;
        }
        vfVar24.p.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.us1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DobChangeActivity.o2(this.a, view);
            }
        });
        vf vfVar25 = this.binding;
        if (vfVar25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar = null;
        } else {
            vfVar = vfVar25;
        }
        vfVar.s.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vs1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DobChangeActivity.p2(this.a, view);
            }
        });
    }

    public static final void j2(DobChangeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B2();
    }

    public static final void k2(DobChangeActivity this$0, DatePicker datePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cal.set(1, i);
        this$0.cal.set(2, i2);
        this$0.cal.set(5, i3);
        CharSequence charSequence = DateFormat.format("dd", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type kotlin.String");
        String str = (String) charSequence;
        CharSequence charSequence2 = DateFormat.format("MM", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) charSequence2;
        CharSequence charSequence3 = DateFormat.format("yyyy", this$0.cal.getTime());
        Intrinsics.checkNotNull(charSequence3, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) charSequence3;
        this$0.formated_date = str + '-' + str2 + '-' + str3;
        vf vfVar = this$0.binding;
        if (vfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar = null;
        }
        vfVar.e.setText(str + '-' + str2 + '-' + str3);
    }

    public static final void l2(DobChangeActivity this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        this$0.o1();
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListener, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    public static final void m2(DobChangeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        vf vfVar = this$0.binding;
        wa3 wa3Var = null;
        if (vfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar = null;
        }
        Editable text = vfVar.j.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0) {
            wa3 wa3Var2 = this$0.langSession;
            if (wa3Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
            } else {
                wa3Var = wa3Var2;
            }
            Toast.makeText(this$0, wa3Var.b("label_select_reason", this$0.getString(R.string.sel_rsn)), 1).show();
            return;
        }
        vf vfVar2 = this$0.binding;
        if (vfVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar2 = null;
        }
        if (vfVar2.k.getVisibility() == 0) {
            vf vfVar3 = this$0.binding;
            if (vfVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                vfVar3 = null;
            }
            Editable text2 = vfVar3.i.getText();
            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
            if (text2.length() == 0) {
                wa3 wa3Var3 = this$0.langSession;
                if (wa3Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("langSession");
                } else {
                    wa3Var = wa3Var3;
                }
                this$0.C2(wa3Var.b("label_dl_serv_enter_reas_manul", this$0.getString(R.string.enter_Reason)));
                return;
            }
            return;
        }
        vf vfVar4 = this$0.binding;
        if (vfVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar4 = null;
        }
        CharSequence text3 = vfVar4.e.getText();
        Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
        if (text3.length() == 0) {
            wa3 wa3Var4 = this$0.langSession;
            if (wa3Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
            } else {
                wa3Var = wa3Var4;
            }
            Toast.makeText(this$0, wa3Var.b("please_enter_bd", this$0.getString(R.string.please_enter_bd)), 1).show();
            return;
        }
        if (!Intrinsics.areEqual(this$0.willingToDonate, "Y")) {
            if (Intrinsics.areEqual(this$0.h2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                this$0.D2();
                return;
            } else {
                this$0.T1();
                return;
            }
        }
        vf vfVar5 = this$0.binding;
        if (vfVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar5 = null;
        }
        Editable text4 = vfVar5.q.getText();
        Intrinsics.checkNotNull(text4);
        if (text4.length() == 0) {
            wa3 wa3Var5 = this$0.langSession;
            if (wa3Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
            } else {
                wa3Var = wa3Var5;
            }
            this$0.C2(wa3Var.b("edit_dl_serv_emer_cont_no", this$0.getString(R.string.emergency_contact)));
            return;
        }
        vf vfVar6 = this$0.binding;
        if (vfVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar6 = null;
        }
        Editable text5 = vfVar6.q.getText();
        Intrinsics.checkNotNull(text5);
        if (text5.length() < 10) {
            wa3 wa3Var6 = this$0.langSession;
            if (wa3Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("langSession");
            } else {
                wa3Var = wa3Var6;
            }
            this$0.C2(wa3Var.b("label_log_entr_vali_mobno", this$0.getString(R.string.plz_select_bank)));
            return;
        }
        mt6.a aVar = mt6.a;
        vf vfVar7 = this$0.binding;
        if (vfVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar7 = null;
        }
        if (aVar.t(String.valueOf(vfVar7.q.getText()))) {
            if (Intrinsics.areEqual(this$0.h2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                this$0.D2();
                return;
            } else {
                this$0.T1();
                return;
            }
        }
        wa3 wa3Var7 = this$0.langSession;
        if (wa3Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
        } else {
            wa3Var = wa3Var7;
        }
        this$0.C2(wa3Var.b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no)));
    }

    public static final void n2(DobChangeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.willingToDonate = "Y";
        vf vfVar = this$0.binding;
        vf vfVar2 = null;
        if (vfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar = null;
        }
        vfVar.p.setChecked(false);
        vf vfVar3 = this$0.binding;
        if (vfVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar3 = null;
        }
        vfVar3.z.setChecked(true);
        vf vfVar4 = this$0.binding;
        if (vfVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar4 = null;
        }
        vfVar4.q.setText((CharSequence) null);
        vf vfVar5 = this$0.binding;
        if (vfVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            vfVar2 = vfVar5;
        }
        vfVar2.q.setVisibility(0);
    }

    public static final void o2(DobChangeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.willingToDonate = "N";
        vf vfVar = this$0.binding;
        vf vfVar2 = null;
        if (vfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar = null;
        }
        vfVar.p.setChecked(true);
        vf vfVar3 = this$0.binding;
        if (vfVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar3 = null;
        }
        vfVar3.z.setChecked(false);
        vf vfVar4 = this$0.binding;
        if (vfVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar4 = null;
        }
        vfVar4.q.setText((CharSequence) null);
        vf vfVar5 = this$0.binding;
        if (vfVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            vfVar2 = vfVar5;
        }
        vfVar2.q.setVisibility(8);
    }

    public static final void p2(DobChangeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        vf vfVar = this$0.binding;
        if (vfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar = null;
        }
        vfVar.z.setChecked(true);
        vf vfVar2 = this$0.binding;
        if (vfVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar2 = null;
        }
        vfVar2.p.setChecked(false);
        vf vfVar3 = this$0.binding;
        if (vfVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar3 = null;
        }
        vfVar3.i.setText((CharSequence) null);
        vf vfVar4 = this$0.binding;
        if (vfVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar4 = null;
        }
        vfVar4.j.setText((CharSequence) null);
        vf vfVar5 = this$0.binding;
        if (vfVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar5 = null;
        }
        vfVar5.j.setContentDescription(null);
        vf vfVar6 = this$0.binding;
        if (vfVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar6 = null;
        }
        vfVar6.k.setVisibility(8);
        this$0.willingToDonate = "Y";
        vf vfVar7 = this$0.binding;
        if (vfVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar7 = null;
        }
        vfVar7.q.setText((CharSequence) null);
        vf vfVar8 = this$0.binding;
        if (vfVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar8 = null;
        }
        vfVar8.q.setVisibility(0);
        vf vfVar9 = this$0.binding;
        if (vfVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar9 = null;
        }
        vfVar9.e.setText((CharSequence) null);
    }

    private final void q2(Intent intent, String lastEndRTO, String lastEndState, String purCode, ArrayList multiList) {
        try {
            intent.putExtra("DL", this.dlNo);
            intent.putExtra("dob", this.dob);
            intent.putExtra("DLDetails", V1());
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
            intent.putExtra("listHeaderSteps", c2());
            intent.putExtra("serialNo", this.serialNo + 1);
            intent.putExtra("COA", this.COA);
            startActivity(intent);
        } catch (Exception e2) {
            Log.d("error_val", e2.getLocalizedMessage());
        }
    }

    private final void r2() {
        fs0 fs0Var = this.mCombineViewModel;
        fs0 fs0Var2 = null;
        if (fs0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCombineViewModel");
            fs0Var = null;
        }
        fs0Var.i().g(this, new mf4() { // from class: com.zepto.ys1
            @Override // com.zepto.mf4
            public final void a(Object obj) throws Throwable {
                DobChangeActivity.s2(this.a, (GetAckDetForGivenDLNumberResponse) obj);
            }
        });
        fs0 fs0Var3 = this.mCombineViewModel;
        if (fs0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCombineViewModel");
        } else {
            fs0Var2 = fs0Var3;
        }
        fs0Var2.h().g(this, new mf4() { // from class: com.zepto.zs1
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                DobChangeActivity.t2(this.a, (String) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void s2(com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity r28, com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 773
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity.s2(com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity, com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse):void");
    }

    public static final void t2(DobChangeActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        vf vfVar = this$0.binding;
        wa3 wa3Var = null;
        if (vfVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar = null;
        }
        vfVar.l.c(false);
        wa3 wa3Var2 = this$0.langSession;
        if (wa3Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("langSession");
        } else {
            wa3Var = wa3Var2;
        }
        this$0.C2(wa3Var.b("service_is_not_present", this$0.getString(R.string.unable_to_get_details)));
    }

    public static final void u2(DobChangeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void v2(DobChangeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void w2(DobChangeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) DlServiceDetailsActivity.class);
            intent.putExtra("DL", this$0.dlNo);
            intent.putExtra("dob", this$0.dob);
            intent.putExtra("DLDetails", this$0.V1());
            intent.putExtra("Mobile_no", this$0.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this$0.lastEndorseRto);
            intent.putExtra("lastEndorsedState", this$0.lastEndorseState);
            intent.putExtra("lastEndorsedRTOCode", this$0.lastEndorseRTOCode);
            intent.putExtra("lastEndorseStateCode", this$0.lastEndorseStateCode);
            intent.putExtra("whatServiceRequired", this$0.whatServiceRequired);
            if (Intrinsics.areEqual(this$0.h2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", this$0.g2());
            }
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final void x2(DobChangeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(this$0.h2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                if (this$0.c2().size() > 1) {
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
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ws1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            DobChangeActivity.y2(dialog, view2);
                        }
                    });
                    int size = this$0.c2().size();
                    String str = "";
                    int i = 0;
                    String string = "";
                    while (i < size) {
                        str = str + ((String) this$0.c2().get(i)) + '\n';
                        StringBuilder sb = new StringBuilder();
                        sb.append(string);
                        i++;
                        sb.append(i);
                        sb.append(".\n");
                        string = sb.toString();
                    }
                    textView2.setText(str);
                    textView3.setText(string);
                    textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xs1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            DobChangeActivity.z2(dialog, view2);
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

    public static final void y2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public final void C2(String message) {
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
            o40.q1(this, strB, message, 1, strB2, null, e.c, 16, null);
        }
    }

    public final void E2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appCategory = str;
    }

    public final void F2(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dlDetails = dldetobjX;
    }

    public final void G2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.listHeaderSteps = arrayList;
    }

    public final void H2(CombineServiceInterface combineServiceInterface) {
        Intrinsics.checkNotNullParameter(combineServiceInterface, "<set-?>");
        this.mCombineServiceInterface = combineServiceInterface;
    }

    public final void I2(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void J2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.multiListName = arrayList;
    }

    public final void K2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final String U1(String date) {
        Intrinsics.checkNotNullParameter(date, "date");
        try {
            String str = new SimpleDateFormat("dd-MM-yyyy").format(new SimpleDateFormat("yyyy-MM-dd").parse(date));
            Intrinsics.checkNotNull(str);
            return str;
        } catch (Exception e2) {
            e2.printStackTrace();
            return date;
        }
    }

    public final DldetobjX V1() {
        DldetobjX dldetobjX = this.dlDetails;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlDetails");
        return null;
    }

    /* JADX INFO: renamed from: W1, reason: from getter */
    public final String getDlNo() {
        return this.dlNo;
    }

    /* JADX INFO: renamed from: X1, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    /* JADX INFO: renamed from: Y1, reason: from getter */
    public final String getLastEndorseRTOCode() {
        return this.lastEndorseRTOCode;
    }

    /* JADX INFO: renamed from: Z1, reason: from getter */
    public final String getLastEndorseRto() {
        return this.lastEndorseRto;
    }

    /* JADX INFO: renamed from: a2, reason: from getter */
    public final String getLastEndorseState() {
        return this.lastEndorseState;
    }

    /* JADX INFO: renamed from: b2, reason: from getter */
    public final String getLastEndorseStateCode() {
        return this.lastEndorseStateCode;
    }

    public final ArrayList c2() {
        ArrayList arrayList = this.listHeaderSteps;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("listHeaderSteps");
        return null;
    }

    public final CombineServiceInterface d2() {
        CombineServiceInterface combineServiceInterface = this.mCombineServiceInterface;
        if (combineServiceInterface != null) {
            return combineServiceInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mCombineServiceInterface");
        return null;
    }

    public final ws6 e2() {
        ws6 ws6Var = this.mSessionmanger;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSessionmanger");
        return null;
    }

    /* JADX INFO: renamed from: f2, reason: from getter */
    public final String getMobile_no() {
        return this.Mobile_no;
    }

    public final ArrayList g2() {
        ArrayList arrayList = this.multiListName;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiListName");
        return null;
    }

    public final wl5 h2() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        vf vfVarC = vf.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(vfVarC, "inflate(...)");
        this.binding = vfVarC;
        vf vfVar = null;
        if (vfVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVarC = null;
        }
        setContentView(vfVarC.b());
        I2(this);
        this.langSession = new wa3(this);
        K2(new wl5(this));
        vf vfVar2 = this.binding;
        if (vfVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar2 = null;
        }
        vfVar2.j.setText((CharSequence) null);
        vf vfVar3 = this.binding;
        if (vfVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar3 = null;
        }
        vfVar3.j.setContentDescription(null);
        ta3.a aVar = ta3.a;
        vf vfVar4 = this.binding;
        if (vfVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar4 = null;
        }
        aVar.r0(this, vfVar4);
        i2();
        rb1 rb1Var = this.viewModel;
        if (rb1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            rb1Var = null;
        }
        rb1Var.q().g(this, new f(new b()));
        vf vfVar5 = this.binding;
        if (vfVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar5 = null;
        }
        vfVar5.m.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ts1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DobChangeActivity.u2(this.a, view);
            }
        });
        qd0 qd0Var = this.chnageDobViewModel;
        if (qd0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chnageDobViewModel");
            qd0Var = null;
        }
        qd0Var.h().g(this, new f(new c()));
        vf vfVar6 = this.binding;
        if (vfVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar6 = null;
        }
        vfVar6.n.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.at1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DobChangeActivity.v2(this.a, view);
            }
        });
        vf vfVar7 = this.binding;
        if (vfVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar7 = null;
        }
        vfVar7.n.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bt1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DobChangeActivity.w2(this.a, view);
            }
        });
        vf vfVar8 = this.binding;
        if (vfVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar8 = null;
        }
        vfVar8.n.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ct1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DobChangeActivity.x2(this.a, view);
            }
        });
        if (Intrinsics.areEqual(h2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            r2();
        }
        S1();
        vf vfVar9 = this.binding;
        if (vfVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar9 = null;
        }
        TextView textView = vfVar9.y;
        vf vfVar10 = this.binding;
        if (vfVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar10 = null;
        }
        textView.setPaintFlags(vfVar10.y.getPaintFlags() | 8);
        vf vfVar11 = this.binding;
        if (vfVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar11 = null;
        }
        vfVar11.y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dt1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DobChangeActivity.A2(this.a, view);
            }
        });
        vf vfVar12 = this.binding;
        if (vfVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar12 = null;
        }
        vfVar12.n.e.setVisibility(8);
        vf vfVar13 = this.binding;
        if (vfVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar13 = null;
        }
        vfVar13.m.g.setText(h2().k());
        vf vfVar14 = this.binding;
        if (vfVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vfVar14 = null;
        }
        vfVar14.y.setVisibility(0);
        vf vfVar15 = this.binding;
        if (vfVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            vfVar = vfVar15;
        }
        vfVar.f.setVisibility(0);
    }
}
