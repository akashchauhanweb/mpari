package com.nic.mparivahan.dlservices.ui.hillService;

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
import com.nic.mparivahan.ClServices.ClInterface.ClInter;
import com.nic.mparivahan.DLServicesAuth.View.DlServiceDetailsActivity;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.DlCombineServices.CombineReq;
import com.nic.mparivahan.DlCombineServices.CombineServiceInterface;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.DlLog.DlLogCapture;
import com.nic.mparivahan.dlservices.data.model.DlSubmitResult;
import com.nic.mparivahan.dlservices.data.model.ResultItemSubmit;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse;
import com.nic.mparivahan.dlservices.data.repo.hillpackage.HZDriMaster;
import com.nic.mparivahan.dlservices.data.repo.hillpackage.HillResponse;
import com.nic.mparivahan.dlservices.data.repo.hillpackage.HillTrResponse;
import com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity;
import com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName;
import com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity;
import com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity;
import com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity;
import com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity;
import com.nic.mparivahan.dlservices.ui.hillService.HillReligion;
import com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity;
import com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity;
import com.zepto.cs0;
import com.zepto.ds0;
import com.zepto.fs0;
import com.zepto.hm2;
import com.zepto.j18;
import com.zepto.jl0;
import com.zepto.k76;
import com.zepto.kd1;
import com.zepto.kl0;
import com.zepto.lq7;
import com.zepto.mf4;
import com.zepto.mt6;
import com.zepto.o40;
import com.zepto.sn0;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.ws6;
import com.zepto.zb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bû\u0001\u0010ü\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J6\u0010\u0012\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0002J\u0012\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014J\u0010\u0010\u0016\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R2\u0010*\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010;\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010,\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010?\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010,\u001a\u0004\b=\u00108\"\u0004\b>\u0010:R$\u0010C\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010,\u001a\u0004\bA\u00108\"\u0004\bB\u0010:R\"\u0010G\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010,\u001a\u0004\bE\u00108\"\u0004\bF\u0010:R\"\u0010K\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010,\u001a\u0004\bI\u00108\"\u0004\bJ\u0010:R\"\u0010O\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010,\u001a\u0004\bM\u00108\"\u0004\bN\u0010:R\"\u0010S\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010,\u001a\u0004\bQ\u00108\"\u0004\bR\u0010:R\"\u0010W\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010,\u001a\u0004\bU\u00108\"\u0004\bV\u0010:R\"\u0010[\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010,\u001a\u0004\bY\u00108\"\u0004\bZ\u0010:R\"\u0010b\u001a\u00020\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010+\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010f\u001a\u00020\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010+\u001a\u0004\bd\u0010_\"\u0004\be\u0010aR\"\u0010n\u001a\u00020g8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010v\u001a\u00020o8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u0016\u0010z\u001a\u00020w8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bx\u0010yR+\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020{0\u00108\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R*\u0010\u008a\u0001\u001a\u00030\u0083\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R*\u0010\u0092\u0001\u001a\u00030\u008b\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R4\u0010\u009b\u0001\u001a\r \u0094\u0001*\u0005\u0018\u00010\u0093\u00010\u0093\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R&\u0010\u009f\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009c\u0001\u0010,\u001a\u0005\b\u009d\u0001\u00108\"\u0005\b\u009e\u0001\u0010:R-\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0005\b \u0001\u0010}\u001a\u0005\b¡\u0001\u0010\u007f\"\u0006\b¢\u0001\u0010\u0081\u0001R-\u0010§\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0005\b¤\u0001\u0010}\u001a\u0005\b¥\u0001\u0010\u007f\"\u0006\b¦\u0001\u0010\u0081\u0001R*\u0010®\u0001\u001a\u00030¨\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b©\u0001\u0010\u0084\u0001\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R&\u0010²\u0001\u001a\u00020\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¯\u0001\u0010+\u001a\u0005\b°\u0001\u0010_\"\u0005\b±\u0001\u0010aR&\u0010¶\u0001\u001a\u00020\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b³\u0001\u0010+\u001a\u0005\b´\u0001\u0010_\"\u0005\bµ\u0001\u0010aR(\u0010º\u0001\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b·\u0001\u0010,\u001a\u0005\b¸\u0001\u00108\"\u0005\b¹\u0001\u0010:R(\u0010¾\u0001\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b»\u0001\u0010,\u001a\u0005\b¼\u0001\u00108\"\u0005\b½\u0001\u0010:R\u001a\u0010Â\u0001\u001a\u00030¿\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R*\u0010Ê\u0001\u001a\u00030Ã\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R&\u0010Î\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bË\u0001\u0010,\u001a\u0005\bÌ\u0001\u00108\"\u0005\bÍ\u0001\u0010:R&\u0010Ò\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÏ\u0001\u0010,\u001a\u0005\bÐ\u0001\u00108\"\u0005\bÑ\u0001\u0010:R&\u0010Ö\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÓ\u0001\u0010,\u001a\u0005\bÔ\u0001\u00108\"\u0005\bÕ\u0001\u0010:R&\u0010Ú\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b×\u0001\u0010,\u001a\u0005\bØ\u0001\u00108\"\u0005\bÙ\u0001\u0010:R&\u0010Þ\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÛ\u0001\u0010,\u001a\u0005\bÜ\u0001\u00108\"\u0005\bÝ\u0001\u0010:R&\u0010â\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bß\u0001\u0010,\u001a\u0005\bà\u0001\u00108\"\u0005\bá\u0001\u0010:R&\u0010æ\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bã\u0001\u0010,\u001a\u0005\bä\u0001\u00108\"\u0005\bå\u0001\u0010:R&\u0010ê\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bç\u0001\u0010,\u001a\u0005\bè\u0001\u00108\"\u0005\bé\u0001\u0010:R&\u0010î\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bë\u0001\u0010,\u001a\u0005\bì\u0001\u00108\"\u0005\bí\u0001\u0010:R&\u0010ò\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bï\u0001\u0010,\u001a\u0005\bð\u0001\u00108\"\u0005\bñ\u0001\u0010:R*\u0010ú\u0001\u001a\u00030ó\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bô\u0001\u0010õ\u0001\u001a\u0006\bö\u0001\u0010÷\u0001\"\u0006\bø\u0001\u0010ù\u0001¨\u0006ý\u0001"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/hillService/HillReligion;", "Lcom/zepto/o40;", "", "v2", "n2", "k2", "", "message", "F2", "u2", "H2", "Landroid/content/Intent;", "intent", "lastEndRTO", "lastEndState", "purCode", "Ljava/util/ArrayList;", "multiList", "m2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "G2", "Lcom/zepto/zb;", "F", "Lcom/zepto/zb;", "mBinding", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "G", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "R1", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "I2", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "dlDetails", "Ljava/util/HashMap;", "H", "Ljava/util/HashMap;", "getWhatServiceRequired", "()Ljava/util/HashMap;", "setWhatServiceRequired", "(Ljava/util/HashMap;)V", "whatServiceRequired", "I", "Ljava/lang/String;", "willingToRelocate", "Lcom/zepto/wl5;", "J", "Lcom/zepto/wl5;", "g2", "()Lcom/zepto/wl5;", "Q2", "(Lcom/zepto/wl5;)V", "sarthiSession", "K", "S1", "()Ljava/lang/String;", "setDlNo", "(Ljava/lang/String;)V", "dlNo", "L", "T1", "setDob", "dob", "M", "e2", "setMobile_no", "Mobile_no", "N", "W1", "setLastEndorseRto", "lastEndorseRto", "O", "X1", "setLastEndorseState", "lastEndorseState", "P", "V1", "setLastEndorseRTOCode", "lastEndorseRTOCode", "Q", "Y1", "setLastEndorseStateCode", "lastEndorseStateCode", "R", "getState_value", "setState_value", "state_value", "S", "i2", "T2", "schoolName", "", "T", "h2", "()I", "R2", "(I)V", "schoolCode", "U", "getSchoolCodePosition", "S2", "schoolCodePosition", "Lcom/zepto/ws6;", "V", "Lcom/zepto/ws6;", "d2", "()Lcom/zepto/ws6;", "setMSessionmanger", "(Lcom/zepto/ws6;)V", "mSessionmanger", "Lcom/zepto/wa3;", "W", "Lcom/zepto/wa3;", "U1", "()Lcom/zepto/wa3;", "J2", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/j18;", "X", "Lcom/zepto/j18;", "viewModel", "Lcom/nic/mparivahan/dlservices/data/repo/hillpackage/HZDriMaster;", "Y", "Ljava/util/ArrayList;", "j2", "()Ljava/util/ArrayList;", "U2", "(Ljava/util/ArrayList;)V", "stateList", "Lcom/zepto/kl0;", "Z", "Lcom/zepto/kl0;", "a2", "()Lcom/zepto/kl0;", "L2", "(Lcom/zepto/kl0;)V", "mClDlViewModel", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "a0", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "b2", "()Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "M2", "(Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;)V", "mClInter", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "b0", "Ljava/util/Calendar;", "getCal", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "c0", "getAppCategory", "setAppCategory", "appCategory", "d0", "f2", "P2", "multiListName", "e0", "Z1", "K2", "listHeaderSteps", "", "f0", "getCOA", "()Z", "setCOA", "(Z)V", "COA", "g0", "getWidthPixels", "setWidthPixels", "widthPixels", "h0", "getSerialNo", "setSerialNo", "serialNo", "i0", "getBioRecGenesis", "setBioRecGenesis", "bioRecGenesis", "j0", "getAllowAddrChangeAtDlservReqst", "setAllowAddrChangeAtDlservReqst", "allowAddrChangeAtDlservReqst", "Lcom/zepto/fs0;", "k0", "Lcom/zepto/fs0;", "mCombineViewModel", "Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;", "l0", "Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;", "c2", "()Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;", "N2", "(Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;)V", "mCombineServiceInterface", "m0", "getMetaflag", "setMetaflag", "metaflag", "n0", "getForm1FlagDLserReq", "setForm1FlagDLserReq", "form1FlagDLserReq", "o0", "getSubmitFormOne", "setSubmitFormOne", "submitFormOne", "p0", "getAString", "setAString", "aString", "q0", "getBString", "setBString", "bString", "r0", "getCString", "setCString", "cString", "s0", "getDString", "setDString", "dString", "t0", "getEString", "setEString", "eString", "u0", "getFString", "setFString", "fString", "v0", "getGString", "setGString", "gString", "Landroid/content/Context;", "w0", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "O2", "(Landroid/content/Context;)V", "mContext", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class HillReligion extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public zb mBinding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public DldetobjX dlDetails;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String dlNo;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String dob;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public int schoolCode;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public int schoolCodePosition;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public ws6 mSessionmanger;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public j18 viewModel;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public ArrayList stateList;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public kl0 mClDlViewModel;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public ClInter mClInter;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public ArrayList multiListName;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public ArrayList listHeaderSteps;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public boolean COA;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public int widthPixels;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public int serialNo;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public String bioRecGenesis;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public String allowAddrChangeAtDlservReqst;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public fs0 mCombineViewModel;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public CombineServiceInterface mCombineServiceInterface;

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public HashMap whatServiceRequired = new HashMap();

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String willingToRelocate = "Y";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String Mobile_no = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String lastEndorseRto = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String lastEndorseState = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String lastEndorseRTOCode = "";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String lastEndorseStateCode = "";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String state_value = "";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String schoolName = "";

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public String appCategory = "G";

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public String metaflag = "";

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public String form1FlagDLserReq = "N";

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public String submitFormOne = "N";

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public String aString = "";

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public String bString = "";

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public String cString = "";

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    public String dString = "";

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    public String eString = "";

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    public String fString = "";

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public String gString = "N";

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(HillTrResponse hillTrResponse) {
            try {
                zb zbVar = null;
                if (!StringsKt__StringsJVMKt.equals(hillTrResponse.getStatus_code(), "00", true)) {
                    zb zbVar2 = HillReligion.this.mBinding;
                    if (zbVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    } else {
                        zbVar = zbVar2;
                    }
                    zbVar.D.setVisibility(8);
                    return;
                }
                HillReligion.this.U2(hillTrResponse.getHZDriMaster());
                HillReligion.this.j2().add(0, new HZDriMaster("Select", 0));
                HillReligion hillReligion = HillReligion.this;
                hm2 hm2Var = new hm2(hillReligion, hillReligion.j2());
                zb zbVar3 = HillReligion.this.mBinding;
                if (zbVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    zbVar = zbVar3;
                }
                zbVar.D.setAdapter((SpinnerAdapter) hm2Var);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((HillTrResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            HillReligion hillReligion = HillReligion.this;
            hillReligion.T2(((HZDriMaster) hillReligion.j2().get(i)).getHZDriSchName());
            HillReligion hillReligion2 = HillReligion.this;
            hillReligion2.R2(((HZDriMaster) hillReligion2.j2().get(i)).getHZDriSchcode());
            HillReligion.this.S2(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(HillResponse hillResponse) throws Throwable {
            List<ResultItemSubmit> result;
            zb zbVar = null;
            try {
                zb zbVar2 = HillReligion.this.mBinding;
                if (zbVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    zbVar2 = null;
                }
                zbVar2.E.c(false);
                DlSubmitResult dlSubmitresult = hillResponse.getDlSubmitresult();
                if (!StringsKt__StringsJVMKt.equals$default(dlSubmitresult != null ? dlSubmitresult.getStatusCode() : null, "00", false, 2, null)) {
                    DlSubmitResult dlSubmitresult2 = hillResponse.getDlSubmitresult();
                    String reqStatus = dlSubmitresult2 != null ? dlSubmitresult2.getReqStatus() : null;
                    if (reqStatus != null && reqStatus.length() != 0) {
                        HillReligion hillReligion = HillReligion.this;
                        DlSubmitResult dlSubmitresult3 = hillResponse.getDlSubmitresult();
                        String reqStatus2 = dlSubmitresult3 != null ? dlSubmitresult3.getReqStatus() : null;
                        Intrinsics.checkNotNull(reqStatus2);
                        hillReligion.G2(reqStatus2);
                        return;
                    }
                    HillReligion hillReligion2 = HillReligion.this;
                    hillReligion2.G2(hillReligion2.U1().b("service_is_not_present", HillReligion.this.getString(R.string.unable_to_get_details)));
                    return;
                }
                DlSubmitResult dlSubmitresult4 = hillResponse.getDlSubmitresult();
                if (dlSubmitresult4 == null || (result = dlSubmitresult4.getResult()) == null || !(!result.isEmpty())) {
                    return;
                }
                DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity = new DLServiceAcknowlegementActivity();
                ResultItemSubmit resultItemSubmit = hillResponse.getDlSubmitresult().getResult().get(0);
                if (resultItemSubmit != null) {
                    HillReligion hillReligion3 = HillReligion.this;
                    try {
                        DlLogCapture.Companion companion = DlLogCapture.INSTANCE;
                        String applicationDate = resultItemSubmit.getApplicationDate();
                        String applicationNo = resultItemSubmit.getApplicationNo();
                        Intrinsics.checkNotNull(applicationNo);
                        long j = Long.parseLong(applicationNo);
                        int i = Integer.parseInt(hillReligion3.d2().k());
                        String dateofBirth = resultItemSubmit.getDateofBirth();
                        String dlno = resultItemSubmit.getDlno();
                        Intrinsics.checkNotNull(dlno);
                        String applicantGender = resultItemSubmit.getApplicantGender();
                        String mobile_no = hillReligion3.getMobile_no();
                        Intrinsics.checkNotNull(mobile_no);
                        companion.a(hillReligion3, "1234", "S", applicationDate, j, i, dateofBirth, dlno, "N", "N", applicantGender, mobile_no, false, "524", hillReligion3.getLastEndorseRTOCode(), hillReligion3.getLastEndorseStateCode());
                    } catch (Exception unused) {
                    }
                    if (!Intrinsics.areEqual(hillReligion3.g2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                        hillReligion3.P2(new ArrayList());
                        hillReligion3.f2().add(hillReligion3.g2().k());
                    }
                    dLServiceAcknowlegementActivity.K2(hillReligion3, resultItemSubmit, hillReligion3.getLastEndorseRTOCode(), hillReligion3.R1(), hillReligion3.getDlNo(), hillReligion3.getDob(), hillReligion3.getMobile_no(), hillReligion3.getLastEndorseRto(), hillReligion3.getLastEndorseState(), hillReligion3.getLastEndorseStateCode(), hillReligion3.f2());
                }
            } catch (Exception unused2) {
                zb zbVar3 = HillReligion.this.mBinding;
                if (zbVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    zbVar = zbVar3;
                }
                zbVar.E.c(false);
                HillReligion hillReligion4 = HillReligion.this;
                hillReligion4.G2(hillReligion4.U1().b("service_is_not_present", HillReligion.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((HillResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public final /* synthetic */ Ref.ObjectRef e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Ref.ObjectRef objectRef) {
            super(1);
            this.e = objectRef;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(String it) {
            j18 j18Var;
            j18 j18Var2;
            Intrinsics.checkNotNullParameter(it, "it");
            if (StringsKt__StringsJVMKt.equals(it, "yes", true)) {
                zb zbVar = null;
                if (Intrinsics.areEqual(HillReligion.this.willingToRelocate, "Y")) {
                    if (!com.nic.mparivahan.a.a.a(HillReligion.this)) {
                        Toast.makeText(HillReligion.this.getApplicationContext(), HillReligion.this.U1().b("service_is_not_present", HillReligion.this.getString(R.string.unable_to_get_details)), 0).show();
                        return;
                    }
                    zb zbVar2 = HillReligion.this.mBinding;
                    if (zbVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        zbVar2 = null;
                    }
                    zbVar2.E.c(true);
                    j18 j18Var3 = HillReligion.this.viewModel;
                    if (j18Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        j18Var2 = null;
                    } else {
                        j18Var2 = j18Var3;
                    }
                    String dlNo = HillReligion.this.getDlNo();
                    String dob = HillReligion.this.getDob();
                    String lastEndorseRTOCode = HillReligion.this.getLastEndorseRTOCode();
                    String str = (String) this.e.element;
                    String str2 = HillReligion.this.willingToRelocate;
                    String mobile_no = HillReligion.this.getMobile_no();
                    zb zbVar3 = HillReligion.this.mBinding;
                    if (zbVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        zbVar3 = null;
                    }
                    String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(zbVar3.x.getText())).toString();
                    zb zbVar4 = HillReligion.this.mBinding;
                    if (zbVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        zbVar4 = null;
                    }
                    String string2 = zbVar4.U.getText().toString();
                    zb zbVar5 = HillReligion.this.mBinding;
                    if (zbVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        zbVar5 = null;
                    }
                    String string3 = zbVar5.U.getText().toString();
                    zb zbVar6 = HillReligion.this.mBinding;
                    if (zbVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    } else {
                        zbVar = zbVar6;
                    }
                    j18Var2.h(dlNo, dob, lastEndorseRTOCode, "G", str, str2, mobile_no, "Y", string, string2, string3, zbVar.X.getText().toString(), HillReligion.this.getSchoolName(), String.valueOf(HillReligion.this.getSchoolCode()), "mobSARATHI", "10.248.210.8", "657d1c758e2e95af0014e16f5109f933", "sarathiservice", HillReligion.this.g2().f(), HillReligion.this.g2().g(), HillReligion.this.g2().e(), HillReligion.this.g2().h());
                    return;
                }
                if (!com.nic.mparivahan.a.a.a(HillReligion.this)) {
                    Toast.makeText(HillReligion.this.getApplicationContext(), HillReligion.this.U1().b("service_is_not_present", HillReligion.this.getString(R.string.unable_to_get_details)), 0).show();
                    return;
                }
                zb zbVar7 = HillReligion.this.mBinding;
                if (zbVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    zbVar7 = null;
                }
                zbVar7.E.c(true);
                zb zbVar8 = HillReligion.this.mBinding;
                if (zbVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    zbVar8 = null;
                }
                zbVar8.E.c(true);
                j18 j18Var4 = HillReligion.this.viewModel;
                if (j18Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    j18Var = null;
                } else {
                    j18Var = j18Var4;
                }
                String dlNo2 = HillReligion.this.getDlNo();
                String dob2 = HillReligion.this.getDob();
                String lastEndorseRTOCode2 = HillReligion.this.getLastEndorseRTOCode();
                String str3 = (String) this.e.element;
                String str4 = HillReligion.this.willingToRelocate;
                String mobile_no2 = HillReligion.this.getMobile_no();
                zb zbVar9 = HillReligion.this.mBinding;
                if (zbVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    zbVar9 = null;
                }
                String string4 = StringsKt__StringsKt.trim((CharSequence) String.valueOf(zbVar9.x.getText())).toString();
                zb zbVar10 = HillReligion.this.mBinding;
                if (zbVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    zbVar10 = null;
                }
                String string5 = zbVar10.U.getText().toString();
                zb zbVar11 = HillReligion.this.mBinding;
                if (zbVar11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    zbVar11 = null;
                }
                String string6 = zbVar11.U.getText().toString();
                zb zbVar12 = HillReligion.this.mBinding;
                if (zbVar12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    zbVar = zbVar12;
                }
                j18Var.h(dlNo2, dob2, lastEndorseRTOCode2, "G", str3, str4, mobile_no2, "Y", string4, string5, string6, zbVar.X.getText().toString(), HillReligion.this.getSchoolName(), String.valueOf(HillReligion.this.getSchoolCode()), "mobSARATHI", "10.248.210.8", "657d1c758e2e95af0014e16f5109f933", "sarathiservice", HillReligion.this.g2().f(), HillReligion.this.g2().g(), HillReligion.this.g2().e(), HillReligion.this.g2().h());
            }
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

    public static final void A2(HillReligion this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) DlServiceDetailsActivity.class);
            intent.putExtra("DL", this$0.dlNo);
            intent.putExtra("dob", this$0.dob);
            intent.putExtra("DLDetails", this$0.R1());
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

    public static final void B2(HillReligion this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(this$0.g2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                if (this$0.Z1().size() > 1) {
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
                    TextView textView2 = (TextView) viewFindViewById3;
                    View viewFindViewById4 = dialog.findViewById(R.id.service_label_list_serial);
                    Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView3 = (TextView) viewFindViewById4;
                    View viewFindViewById5 = dialog.findViewById(R.id.dl_services);
                    Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.TextView");
                    textView.setText(this$0.U1().b("btn_ok", "OK"));
                    ((TextView) viewFindViewById5).setText(this$0.U1().b("title_dl_services", "Driving Licence Services"));
                    ((ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tm2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            HillReligion.C2(dialog, view2);
                        }
                    });
                    int size = this$0.Z1().size();
                    String str = "";
                    int i = 0;
                    String string = "";
                    while (i < size) {
                        str = str + ((String) this$0.Z1().get(i)) + '\n';
                        StringBuilder sb = new StringBuilder();
                        sb.append(string);
                        i++;
                        sb.append(i);
                        sb.append(".\n");
                        string = sb.toString();
                    }
                    textView2.setText(str);
                    textView3.setText(string);
                    textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.um2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            HillReligion.D2(dialog, view2);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void E2(HillReligion this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [T, java.lang.String] */
    private final void F2(String message) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        if (Intrinsics.areEqual(this.willingToRelocate, "Y")) {
            zb zbVar = this.mBinding;
            if (zbVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                zbVar = null;
            }
            objectRef.element = String.valueOf(zbVar.K.getText());
        } else {
            objectRef.element = "NA";
        }
        try {
            String strB = U1().b("nex_parivahan", getString(R.string.app_name));
            Intrinsics.checkNotNull(strB);
            o40.q1(this, strB, message, 0, null, null, new d(objectRef), 24, null);
        } catch (Exception unused) {
        }
    }

    private final void H2() {
        fs0 fs0Var;
        zb zbVar;
        String strValueOf = "";
        try {
            if (f2().size() > this.serialNo) {
                CombineReq combineReq = (CombineReq) new Gson().fromJson(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getString("MultiService", ""), CombineReq.class);
                CombineReq combineReq2 = new CombineReq(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 1023, null);
                combineReq2.setPofbirth(combineReq.getPofbirth());
                combineReq2.setCountry(combineReq.getCountry());
                combineReq2.setPassno(combineReq.getPassno());
                combineReq2.setPassvaltill(combineReq.getPassvaltill());
                combineReq2.setVisano(combineReq.getVisano());
                combineReq2.setVisavaltill(combineReq.getVisavaltill());
                combineReq2.setTovisit(combineReq.getTovisit());
                combineReq2.setIscountryrestricted(combineReq.getIscountryrestricted());
                combineReq2.setCountryRestrictedReason(combineReq.getCountryRestrictedReason());
                combineReq2.setDlSerdisqualified(combineReq.isDlSerdisqualified());
                combineReq2.setDlSerdisqualifiedReason(combineReq.getDlSerdisqualifiedReason());
                combineReq2.setForAdd1(combineReq.getForAdd1());
                combineReq2.setForAdd2(combineReq.getForAdd2());
                combineReq2.setForAdd3(combineReq.getForAdd3());
                combineReq2.setForAddPinCode(combineReq.getForAddPinCode());
                combineReq2.setForNationMobNum(combineReq.getForNationMobNum());
                combineReq2.setEmailID(combineReq.getEmailID());
                combineReq2.setAppliedIdpfromIndEmb(combineReq.getAppliedIdpfromIndEmb());
                combineReq2.setIndEmbName(combineReq.getIndEmbName());
                combineReq2.setEmbPlace(combineReq.getEmbPlace());
                combineReq2.setDateOfVerifEmb(combineReq.getDateOfVerifEmb());
                combineReq2.setEmbEndorseNo(combineReq.getEmbEndorseNo());
                combineReq2.setIdpcountryapplyfrom(combineReq.getIdpcountryapplyfrom());
                combineReq2.setDupDlReasonName(combineReq.getDupDlReasonName());
                combineReq2.setDupDlReasonCode(combineReq.getDupDlReasonCode());
                combineReq2.setDleDlReasonCode(combineReq.getDleDlReasonCode());
                combineReq2.setDleDlReasonName(combineReq.getDleDlReasonName());
                combineReq2.setApplcatgDLserReq(combineReq.getApplcatgDLserReq());
                combineReq2.setDlHolderAltMobMum(combineReq.getDlHolderAltMobMum());
                combineReq2.setWilltoDonateOrgans(combineReq.getWilltoDonateOrgans());
                combineReq2.setRelationType(combineReq.getRelationType());
                combineReq2.setConDlReasonCode(combineReq.getConDlReasonCode());
                combineReq2.setConDlReasonName(combineReq.getConDlReasonName());
                combineReq2.setDlHolderNaturalName(combineReq.getDlHolderNaturalName());
                combineReq2.setConEffdate(combineReq.getConEffdate());
                combineReq2.setApplFirstName(combineReq.getApplFirstName());
                combineReq2.setApplLastName(combineReq.getApplLastName());
                combineReq2.setRelFirstName(combineReq.getRelFirstName());
                combineReq2.setRelLastName(combineReq.getRelLastName());
                combineReq2.setMobileNumber(combineReq.getMobileNumber());
                combineReq2.setChangeOfAddReq(combineReq.getChangeOfAddReq());
                combineReq2.setPerHouseNo(combineReq.getPerHouseNo());
                combineReq2.setPerStreet(combineReq.getPerStreet());
                combineReq2.setPerLocation(combineReq.getPerLocation());
                combineReq2.setPermVillageOrTown(combineReq.getPermVillageOrTown());
                combineReq2.setPerSubDistrict(combineReq.getPerSubDistrict());
                combineReq2.setPerDistrict(combineReq.getPerDistrict());
                combineReq2.setPerState(combineReq.getPerState());
                combineReq2.setPerPinCode(combineReq.getPerPinCode());
                combineReq2.setPresHouseNo(combineReq.getPresHouseNo());
                combineReq2.setPresStreet(combineReq.getPresStreet());
                combineReq2.setPresLocation(combineReq.getPresLocation());
                combineReq2.setPresVillageOrTown(combineReq.getPresVillageOrTown());
                combineReq2.setPresSubDistrict(combineReq.getPresSubDistrict());
                combineReq2.setPresDistrict(combineReq.getPresDistrict());
                combineReq2.setPresState(combineReq.getPresState());
                combineReq2.setPresPincode(combineReq.getPresPincode());
                combineReq2.setApplDateOfBirth(combineReq.getApplDateOfBirth());
                combineReq2.setCodobDlReasonName(combineReq.getCodobDlReasonName());
                combineReq2.setCodobDlReasonCode(combineReq.getCodobDlReasonCode());
                combineReq2.setDeclaringcheck("Y");
                zb zbVar2 = this.mBinding;
                if (zbVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    zbVar2 = null;
                }
                combineReq2.setHillcertificate(StringsKt__StringsKt.trim((CharSequence) String.valueOf(zbVar2.x.getText())).toString());
                zb zbVar3 = this.mBinding;
                if (zbVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    zbVar3 = null;
                }
                combineReq2.setHillissueDate(zbVar3.U.getText().toString());
                zb zbVar4 = this.mBinding;
                if (zbVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    zbVar4 = null;
                }
                combineReq2.setHillvalidFrom(zbVar4.U.getText().toString());
                zb zbVar5 = this.mBinding;
                if (zbVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    zbVar5 = null;
                }
                combineReq2.setHillvalidTo(zbVar5.X.getText().toString());
                combineReq2.setHilldrivingschool(this.schoolName);
                combineReq2.setHillissby(String.valueOf(this.schoolCode));
                if (Intrinsics.areEqual(this.willingToRelocate, "Y")) {
                    combineReq2.setWilltoDonateOrgans("Y");
                    zb zbVar6 = this.mBinding;
                    if (zbVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        zbVar = null;
                    } else {
                        zbVar = zbVar6;
                    }
                    combineReq2.setDlHolderAltMobMum(String.valueOf(zbVar.K.getText()));
                } else {
                    combineReq2.setWilltoDonateOrgans("N");
                    combineReq2.setDlHolderAltMobMum("NA");
                }
                SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit();
                editorEdit.putString("MultiService", new Gson().toJson(combineReq2));
                editorEdit.commit();
                if (Intrinsics.areEqual(f2().get(this.serialNo), U1().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                    setIntent(new Intent(this, (Class<?>) DLDuplicateActivity.class));
                    Intent intent = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                    m2(intent, this.lastEndorseRTOCode, this.lastEndorseState, "513", f2());
                    return;
                }
                if (Intrinsics.areEqual(f2().get(this.serialNo), U1().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                    setIntent(new Intent(this, (Class<?>) RenewalOfDLActivity.class));
                    Intent intent2 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
                    m2(intent2, this.lastEndorseRTOCode, this.lastEndorseState, "514", f2());
                    return;
                }
                if (Intrinsics.areEqual(f2().get(this.serialNo), U1().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                    setIntent(new Intent(this, (Class<?>) RenewalOfDLActivity.class));
                    Intent intent3 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent3, "getIntent(...)");
                    m2(intent3, this.lastEndorseRTOCode, this.lastEndorseState, "537", f2());
                    return;
                }
                if (Intrinsics.areEqual(f2().get(this.serialNo), U1().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                    setIntent(new Intent(this, (Class<?>) ChangeOfAddressActivity.class));
                    Intent intent4 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent4, "getIntent(...)");
                    m2(intent4, this.lastEndorseRTOCode, this.lastEndorseState, "515", f2());
                    return;
                }
                if (Intrinsics.areEqual(f2().get(this.serialNo), U1().b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                    setIntent(new Intent(this, (Class<?>) DLReplecementActivity.class));
                    Intent intent5 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent5, "getIntent(...)");
                    m2(intent5, this.lastEndorseRTOCode, this.lastEndorseState, "516", f2());
                    return;
                }
                if (Intrinsics.areEqual(f2().get(this.serialNo), U1().b("check_dl_serv_extract_dl", "DL Extract"))) {
                    setIntent(new Intent(this, (Class<?>) DLExtractActivity.class));
                    Intent intent6 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent6, "getIntent(...)");
                    m2(intent6, this.lastEndorseRTOCode, this.lastEndorseState, "523", f2());
                    return;
                }
                if (Intrinsics.areEqual(f2().get(this.serialNo), U1().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                    setIntent(new Intent(this, (Class<?>) HillReligion.class));
                    Intent intent7 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent7, "getIntent(...)");
                    m2(intent7, this.lastEndorseRTOCode, this.lastEndorseState, "524", f2());
                    return;
                }
                if (Intrinsics.areEqual(f2().get(this.serialNo), U1().b("change_name_dl", "Change of Name in DL"))) {
                    setIntent(new Intent(this, (Class<?>) ChangeOfName.class));
                    Intent intent8 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent8, "getIntent(...)");
                    m2(intent8, this.lastEndorseRTOCode, this.lastEndorseState, "526", f2());
                    return;
                }
                if (Intrinsics.areEqual(f2().get(this.serialNo), U1().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                    setIntent(new Intent(this, (Class<?>) DobChangeActivity.class));
                    Intent intent9 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent9, "getIntent(...)");
                    m2(intent9, this.lastEndorseRTOCode, this.lastEndorseState, "548", f2());
                    return;
                }
                return;
            }
            if (!com.nic.mparivahan.a.a.a(this)) {
                Toast.makeText(getApplicationContext(), U1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
                return;
            }
            CombineReq combineReq3 = (CombineReq) new Gson().fromJson(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getString("MultiService", ""), CombineReq.class);
            zb zbVar7 = this.mBinding;
            if (zbVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                zbVar7 = null;
            }
            zbVar7.E.c(true);
            if (Intrinsics.areEqual(this.willingToRelocate, "Y")) {
                zb zbVar8 = this.mBinding;
                if (zbVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    zbVar8 = null;
                }
                strValueOf = String.valueOf(zbVar8.K.getText());
            }
            String str = strValueOf;
            ArrayList arrayList = new ArrayList();
            int size = R1().getDlcovs().size();
            for (int i = 0; i < size; i++) {
                arrayList.add(String.valueOf(R1().getDlcovs().get(i).getDcCovcd()));
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
            ArrayList arrayListF2 = f2();
            String applcatgDLserReq = combineReq3.getApplcatgDLserReq();
            Intrinsics.checkNotNull(applcatgDLserReq);
            String str4 = this.dlNo;
            Intrinsics.checkNotNull(str4);
            String str5 = this.dob;
            Intrinsics.checkNotNull(str5);
            String str6 = this.lastEndorseRTOCode;
            String str7 = this.willingToRelocate;
            Intrinsics.checkNotNull(str7);
            String relationType = combineReq3.getRelationType();
            Intrinsics.checkNotNull(relationType);
            String strValueOf2 = String.valueOf(combineReq3.getConDlReasonCode());
            Intrinsics.checkNotNull(strValueOf2);
            String conDlReasonName = combineReq3.getConDlReasonName();
            Intrinsics.checkNotNull(conDlReasonName);
            String dlHolderNaturalName = combineReq3.getDlHolderNaturalName();
            Intrinsics.checkNotNull(dlHolderNaturalName);
            String conEffdate = combineReq3.getConEffdate();
            Intrinsics.checkNotNull(conEffdate);
            String applFirstName = combineReq3.getApplFirstName();
            Intrinsics.checkNotNull(applFirstName);
            String applLastName = combineReq3.getApplLastName();
            Intrinsics.checkNotNull(applLastName);
            String relFirstName = combineReq3.getRelFirstName();
            Intrinsics.checkNotNull(relFirstName);
            String relLastName = combineReq3.getRelLastName();
            Intrinsics.checkNotNull(relLastName);
            String str8 = this.Mobile_no;
            Intrinsics.checkNotNull(str8);
            String changeOfAddReq = combineReq3.getChangeOfAddReq();
            Intrinsics.checkNotNull(changeOfAddReq);
            String perHouseNo = combineReq3.getPerHouseNo();
            Intrinsics.checkNotNull(perHouseNo);
            String perStreet = combineReq3.getPerStreet();
            Intrinsics.checkNotNull(perStreet);
            String perLocation = combineReq3.getPerLocation();
            Intrinsics.checkNotNull(perLocation);
            String permVillageOrTown = combineReq3.getPermVillageOrTown();
            Intrinsics.checkNotNull(permVillageOrTown);
            String perSubDistrict = combineReq3.getPerSubDistrict();
            Intrinsics.checkNotNull(perSubDistrict);
            String perDistrict = combineReq3.getPerDistrict();
            Intrinsics.checkNotNull(perDistrict);
            String perState = combineReq3.getPerState();
            Intrinsics.checkNotNull(perState);
            String perPinCode = combineReq3.getPerPinCode();
            Intrinsics.checkNotNull(perPinCode);
            String presHouseNo = combineReq3.getPresHouseNo();
            Intrinsics.checkNotNull(presHouseNo);
            String presStreet = combineReq3.getPresStreet();
            Intrinsics.checkNotNull(presStreet);
            String presLocation = combineReq3.getPresLocation();
            Intrinsics.checkNotNull(presLocation);
            String presVillageOrTown = combineReq3.getPresVillageOrTown();
            Intrinsics.checkNotNull(presVillageOrTown);
            String presSubDistrict = combineReq3.getPresSubDistrict();
            Intrinsics.checkNotNull(presSubDistrict);
            String presDistrict = combineReq3.getPresDistrict();
            Intrinsics.checkNotNull(presDistrict);
            String presState = combineReq3.getPresState();
            Intrinsics.checkNotNull(presState);
            String presPincode = combineReq3.getPresPincode();
            Intrinsics.checkNotNull(presPincode);
            String dleDlReasonCode = combineReq3.getDleDlReasonCode();
            Intrinsics.checkNotNull(dleDlReasonCode);
            String dleDlReasonName = combineReq3.getDleDlReasonName();
            Intrinsics.checkNotNull(dleDlReasonName);
            String dupDlReasonName = combineReq3.getDupDlReasonName();
            Intrinsics.checkNotNull(dupDlReasonName);
            String dupDlReasonCode = combineReq3.getDupDlReasonCode();
            Intrinsics.checkNotNull(dupDlReasonCode);
            String applDateOfBirth = combineReq3.getApplDateOfBirth();
            Intrinsics.checkNotNull(applDateOfBirth);
            String codobDlReasonName = combineReq3.getCodobDlReasonName();
            Intrinsics.checkNotNull(codobDlReasonName);
            String codobDlReasonCode = combineReq3.getCodobDlReasonCode();
            Intrinsics.checkNotNull(codobDlReasonCode);
            zb zbVar9 = this.mBinding;
            if (zbVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                zbVar9 = null;
            }
            String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(zbVar9.x.getText())).toString();
            zb zbVar10 = this.mBinding;
            if (zbVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                zbVar10 = null;
            }
            String string2 = zbVar10.U.getText().toString();
            zb zbVar11 = this.mBinding;
            if (zbVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                zbVar11 = null;
            }
            String string3 = zbVar11.U.getText().toString();
            zb zbVar12 = this.mBinding;
            if (zbVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                zbVar12 = null;
            }
            String string4 = zbVar12.X.getText().toString();
            String str9 = this.schoolName;
            String strValueOf3 = String.valueOf(this.schoolCode);
            String pofbirth = combineReq3.getPofbirth();
            Intrinsics.checkNotNull(pofbirth);
            String country = combineReq3.getCountry();
            Intrinsics.checkNotNull(country);
            String passno = combineReq3.getPassno();
            Intrinsics.checkNotNull(passno);
            String passvaltill = combineReq3.getPassvaltill();
            Intrinsics.checkNotNull(passvaltill);
            String visano = combineReq3.getVisano();
            Intrinsics.checkNotNull(visano);
            String visavaltill = combineReq3.getVisavaltill();
            Intrinsics.checkNotNull(visavaltill);
            String tovisit = combineReq3.getTovisit();
            Intrinsics.checkNotNull(tovisit);
            String iscountryrestricted = combineReq3.getIscountryrestricted();
            Intrinsics.checkNotNull(iscountryrestricted);
            String countryRestrictedReason = combineReq3.getCountryRestrictedReason();
            Intrinsics.checkNotNull(countryRestrictedReason);
            String strIsDlSerdisqualified = combineReq3.isDlSerdisqualified();
            Intrinsics.checkNotNull(strIsDlSerdisqualified);
            String dlSerdisqualifiedReason = combineReq3.getDlSerdisqualifiedReason();
            Intrinsics.checkNotNull(dlSerdisqualifiedReason);
            String forAdd1 = combineReq3.getForAdd1();
            Intrinsics.checkNotNull(forAdd1);
            String forAdd2 = combineReq3.getForAdd2();
            Intrinsics.checkNotNull(forAdd2);
            String forAdd3 = combineReq3.getForAdd3();
            Intrinsics.checkNotNull(forAdd3);
            String forAddPinCode = combineReq3.getForAddPinCode();
            Intrinsics.checkNotNull(forAddPinCode);
            String forNationMobNum = combineReq3.getForNationMobNum();
            Intrinsics.checkNotNull(forNationMobNum);
            String emailID = combineReq3.getEmailID();
            Intrinsics.checkNotNull(emailID);
            String appliedIdpfromIndEmb = combineReq3.getAppliedIdpfromIndEmb();
            Intrinsics.checkNotNull(appliedIdpfromIndEmb);
            String indEmbName = combineReq3.getIndEmbName();
            Intrinsics.checkNotNull(indEmbName);
            String embPlace = combineReq3.getEmbPlace();
            Intrinsics.checkNotNull(embPlace);
            String dateOfVerifEmb = combineReq3.getDateOfVerifEmb();
            Intrinsics.checkNotNull(dateOfVerifEmb);
            String embEndorseNo = combineReq3.getEmbEndorseNo();
            Intrinsics.checkNotNull(embEndorseNo);
            String idpcountryapplyfrom = combineReq3.getIdpcountryapplyfrom();
            Intrinsics.checkNotNull(idpcountryapplyfrom);
            fs0Var.g(z, arrayList, str2, str3, arrayListF2, "mobSARATHI", "657d1c758e2e95af0014e16f5109f933", "10.248.210.8", "sarathiservice", applcatgDLserReq, str, str4, str5, str6, str7, relationType, strValueOf2, conDlReasonName, dlHolderNaturalName, conEffdate, applFirstName, applLastName, relFirstName, relLastName, str8, changeOfAddReq, perHouseNo, perStreet, perLocation, permVillageOrTown, perSubDistrict, perDistrict, perState, perPinCode, presHouseNo, presStreet, presLocation, presVillageOrTown, presSubDistrict, presDistrict, presState, presPincode, dleDlReasonCode, dleDlReasonName, dupDlReasonName, dupDlReasonCode, applDateOfBirth, codobDlReasonName, codobDlReasonCode, "Y", string, string2, string3, string4, str9, strValueOf3, pofbirth, country, passno, passvaltill, visano, visavaltill, tovisit, iscountryrestricted, countryRestrictedReason, strIsDlSerdisqualified, dlSerdisqualifiedReason, forAdd1, forAdd2, forAdd3, forAddPinCode, forNationMobNum, emailID, appliedIdpfromIndEmb, indEmbName, embPlace, dateOfVerifEmb, embEndorseNo, idpcountryapplyfrom, g2().f(), g2().g(), g2().e(), g2().h());
        } catch (Exception unused) {
        }
    }

    private final void k2() {
        J2(new wa3(this));
        this.viewModel = (j18) new z(this).a(j18.class);
        M2(ClInter.INSTANCE.a(this));
        L2((kl0) new z(this, new sn0(new jl0(b2()))).a(kl0.class));
        zb zbVar = null;
        if (getIntent() != null) {
            try {
                this.dlNo = String.valueOf(getIntent().getStringExtra("DL"));
                this.dob = String.valueOf(getIntent().getStringExtra("dob"));
                this.Mobile_no = String.valueOf(getIntent().getStringExtra("Mobile_no"));
                Serializable serializableExtra = getIntent().getSerializableExtra("DLDetails");
                Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
                I2((DldetobjX) serializableExtra);
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
                zb zbVar2 = this.mBinding;
                if (zbVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    zbVar2 = null;
                }
                zbVar2.y.setText(U1().b("dl_no", "DL No. : ") + ' ' + this.dlNo);
            } catch (Exception unused) {
            }
        }
        zb zbVar3 = this.mBinding;
        if (zbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar3 = null;
        }
        TextView textView = zbVar3.Z;
        zb zbVar4 = this.mBinding;
        if (zbVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar4 = null;
        }
        textView.setPaintFlags(zbVar4.Z.getPaintFlags() | 8);
        zb zbVar5 = this.mBinding;
        if (zbVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar5 = null;
        }
        zbVar5.Z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.om2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HillReligion.l2(this.a, view);
            }
        });
        a2().m(this, this.lastEndorseStateCode);
        a2().q().g(this, new f(new a()));
        zb zbVar6 = this.mBinding;
        if (zbVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            zbVar = zbVar6;
        }
        zbVar.D.setOnItemSelectedListener(new b());
    }

    public static final void l2(HillReligion this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) DlServiceDetailsActivity.class);
        intent.putExtra("DL", this$0.dlNo);
        intent.putExtra("dob", this$0.dob);
        intent.putExtra("DLDetails", this$0.R1());
        intent.putExtra("Mobile_no", this$0.Mobile_no);
        intent.putExtra("lastEndorsedRTO", this$0.lastEndorseRto);
        intent.putExtra("lastEndorsedState", this$0.lastEndorseState);
        intent.putExtra("lastEndorsedRTOCode", this$0.lastEndorseRTOCode);
        intent.putExtra("lastEndorseStateCode", this$0.lastEndorseStateCode);
        intent.putExtra("whatServiceRequired", this$0.whatServiceRequired);
        this$0.startActivity(intent);
    }

    private final void m2(Intent intent, String lastEndRTO, String lastEndState, String purCode, ArrayList multiList) {
        try {
            intent.putExtra("DL", this.dlNo);
            intent.putExtra("dob", this.dob);
            intent.putExtra("DLDetails", R1());
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
            intent.putExtra("listHeaderSteps", Z1());
            intent.putExtra("serialNo", this.serialNo + 1);
            intent.putExtra("COA", this.COA);
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void n2() {
        zb zbVar = this.mBinding;
        zb zbVar2 = null;
        if (zbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar = null;
        }
        zbVar.N.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xm2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HillReligion.o2(this.a, view);
            }
        });
        zb zbVar3 = this.mBinding;
        if (zbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar3 = null;
        }
        zbVar3.a0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jm2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HillReligion.p2(this.a, view);
            }
        });
        zb zbVar4 = this.mBinding;
        if (zbVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar4 = null;
        }
        zbVar4.J.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.km2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HillReligion.q2(this.a, view);
            }
        });
        zb zbVar5 = this.mBinding;
        if (zbVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar5 = null;
        }
        zbVar5.E.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lm2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HillReligion.r2(this.a, view);
            }
        });
        final DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.mm2
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                HillReligion.s2(this.a, datePicker, i, i2, i3);
            }
        };
        zb zbVar6 = this.mBinding;
        if (zbVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            zbVar2 = zbVar6;
        }
        zbVar2.U.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nm2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HillReligion.t2(this.a, onDateSetListener, view);
            }
        });
    }

    public static final void o2(HillReligion this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void p2(HillReligion this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.willingToRelocate = "Y";
        zb zbVar = this$0.mBinding;
        zb zbVar2 = null;
        if (zbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar = null;
        }
        zbVar.J.setChecked(false);
        zb zbVar3 = this$0.mBinding;
        if (zbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar3 = null;
        }
        zbVar3.a0.setChecked(true);
        zb zbVar4 = this$0.mBinding;
        if (zbVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar4 = null;
        }
        zbVar4.K.setText((CharSequence) null);
        zb zbVar5 = this$0.mBinding;
        if (zbVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            zbVar2 = zbVar5;
        }
        zbVar2.K.setVisibility(0);
    }

    public static final void q2(HillReligion this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.willingToRelocate = "N";
        zb zbVar = this$0.mBinding;
        zb zbVar2 = null;
        if (zbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar = null;
        }
        zbVar.J.setChecked(true);
        zb zbVar3 = this$0.mBinding;
        if (zbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar3 = null;
        }
        zbVar3.a0.setChecked(false);
        zb zbVar4 = this$0.mBinding;
        if (zbVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar4 = null;
        }
        zbVar4.K.setText((CharSequence) null);
        zb zbVar5 = this$0.mBinding;
        if (zbVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            zbVar2 = zbVar5;
        }
        zbVar2.K.setVisibility(8);
    }

    public static final void r2(HillReligion this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(this$0.g2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            this$0.u2();
            return;
        }
        zb zbVar = this$0.mBinding;
        zb zbVar2 = null;
        if (zbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar = null;
        }
        if (String.valueOf(zbVar.x.getText()).length() == 0) {
            Toast.makeText(this$0, this$0.getString(R.string.enter_certificate_name), 1).show();
            return;
        }
        zb zbVar3 = this$0.mBinding;
        if (zbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar3 = null;
        }
        if (String.valueOf(zbVar3.x.getText()).length() < 3) {
            Toast.makeText(this$0, this$0.getString(R.string.enter_valid_certificate_name), 1).show();
            return;
        }
        zb zbVar4 = this$0.mBinding;
        if (zbVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar4 = null;
        }
        String string = zbVar4.U.getText().toString();
        if (string == null || string.length() == 0) {
            Toast.makeText(this$0, this$0.getString(R.string.enter_issue_date), 1).show();
            return;
        }
        if (this$0.schoolCodePosition == 0) {
            Toast.makeText(this$0, "Please select issued by", 1).show();
            return;
        }
        if (!Intrinsics.areEqual(this$0.willingToRelocate, "Y")) {
            String strB = this$0.U1().b("label_want_to_proceed", this$0.getString(R.string.are_you_want_to_proceed));
            Intrinsics.checkNotNull(strB);
            this$0.F2(strB);
            return;
        }
        zb zbVar5 = this$0.mBinding;
        if (zbVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar5 = null;
        }
        Editable text = zbVar5.K.getText();
        Intrinsics.checkNotNull(text);
        if (text.length() == 0) {
            this$0.G2(this$0.U1().b("edit_dl_serv_emer_cont_no", this$0.getString(R.string.emergency_contact)));
            return;
        }
        zb zbVar6 = this$0.mBinding;
        if (zbVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar6 = null;
        }
        Editable text2 = zbVar6.K.getText();
        Intrinsics.checkNotNull(text2);
        if (text2.length() < 10) {
            this$0.G2(this$0.U1().b("label_log_entr_vali_mobno", this$0.getString(R.string.plz_select_bank)));
            return;
        }
        mt6.a aVar = mt6.a;
        zb zbVar7 = this$0.mBinding;
        if (zbVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            zbVar2 = zbVar7;
        }
        if (!aVar.t(String.valueOf(zbVar2.K.getText()))) {
            this$0.G2(this$0.U1().b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no)));
            return;
        }
        String strB2 = this$0.U1().b("label_want_to_proceed", this$0.getString(R.string.are_you_want_to_proceed));
        Intrinsics.checkNotNull(strB2);
        this$0.F2(strB2);
    }

    public static final void s2(HillReligion this$0, DatePicker datePicker, int i, int i2, int i3) {
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
        zb zbVar = this$0.mBinding;
        zb zbVar2 = null;
        if (zbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar = null;
        }
        zbVar.U.setText(str + '-' + str2 + '-' + str3);
        int i4 = Integer.parseInt(str3) + 1;
        zb zbVar3 = this$0.mBinding;
        if (zbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            zbVar2 = zbVar3;
        }
        zbVar2.X.setText(str + '-' + str2 + '-' + i4);
    }

    public static final void t2(HillReligion this$0, DatePickerDialog.OnDateSetListener dateSetListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListener, "$dateSetListener");
        this$0.o1();
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, dateSetListener, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    private final void u2() {
        zb zbVar = this.mBinding;
        zb zbVar2 = null;
        if (zbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar = null;
        }
        if (String.valueOf(zbVar.x.getText()).length() == 0) {
            Toast.makeText(this, getString(R.string.enter_certificate_number), 1).show();
            return;
        }
        zb zbVar3 = this.mBinding;
        if (zbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar3 = null;
        }
        if (String.valueOf(zbVar3.x.getText()).length() < 3) {
            Toast.makeText(this, getString(R.string.enter_valid_certificate_name), 1).show();
            return;
        }
        zb zbVar4 = this.mBinding;
        if (zbVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar4 = null;
        }
        String string = zbVar4.U.getText().toString();
        if (string == null || string.length() == 0) {
            Toast.makeText(this, getString(R.string.enter_issue_date), 1).show();
            return;
        }
        if (this.schoolCodePosition == 0) {
            Toast.makeText(this, "Please select issued by", 1).show();
            return;
        }
        if (!Intrinsics.areEqual(this.willingToRelocate, "Y")) {
            H2();
            return;
        }
        zb zbVar5 = this.mBinding;
        if (zbVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar5 = null;
        }
        Editable text = zbVar5.K.getText();
        Intrinsics.checkNotNull(text);
        if (text.length() == 0) {
            G2(U1().b("edit_dl_serv_emer_cont_no", getString(R.string.emergency_contact)));
            return;
        }
        zb zbVar6 = this.mBinding;
        if (zbVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar6 = null;
        }
        Editable text2 = zbVar6.K.getText();
        Intrinsics.checkNotNull(text2);
        if (text2.length() < 10) {
            G2(U1().b("label_log_entr_vali_mobno", getString(R.string.plz_select_bank)));
            return;
        }
        mt6.a aVar = mt6.a;
        zb zbVar7 = this.mBinding;
        if (zbVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            zbVar2 = zbVar7;
        }
        if (aVar.t(String.valueOf(zbVar2.K.getText()))) {
            H2();
        } else {
            G2(U1().b("label_log_entr_vali_mobno", getString(R.string.enter_mobile_no)));
        }
    }

    private final void v2() {
        N2(CombineServiceInterface.INSTANCE.a(this));
        fs0 fs0Var = (fs0) new z(this, new ds0(new cs0(c2()))).a(fs0.class);
        this.mCombineViewModel = fs0Var;
        fs0 fs0Var2 = null;
        if (fs0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCombineViewModel");
            fs0Var = null;
        }
        fs0Var.i().g(this, new mf4() { // from class: com.zepto.vm2
            @Override // com.zepto.mf4
            public final void a(Object obj) throws Throwable {
                HillReligion.w2(this.a, (GetAckDetForGivenDLNumberResponse) obj);
            }
        });
        fs0 fs0Var3 = this.mCombineViewModel;
        if (fs0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCombineViewModel");
        } else {
            fs0Var2 = fs0Var3;
        }
        fs0Var2.h().g(this, new mf4() { // from class: com.zepto.wm2
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                HillReligion.x2(this.a, (String) obj);
            }
        });
    }

    /* JADX WARN: Not initialized variable reg: 26, insn: 0x0263: MOVE (r3 I:??[OBJECT, ARRAY]) = (r26 I:??[OBJECT, ARRAY]), block:B:58:0x0263 */
    public static final void w2(HillReligion this$0, GetAckDetForGivenDLNumberResponse getAckDetForGivenDLNumberResponse) throws Throwable {
        int i;
        zb zbVar;
        String str;
        String str2;
        List<ResultItemSubmit> result;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        zb zbVar2 = this$0.mBinding;
        if (zbVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar2 = null;
        }
        HillReligion hillReligion = null;
        zbVar2.E.c(false);
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
                            if (CollectionsKt___CollectionsKt.contains(this$0.f2(), this$0.U1().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                                str3 = "513,";
                            }
                            if (CollectionsKt___CollectionsKt.contains(this$0.f2(), this$0.U1().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                                str3 = str3 + "514,";
                            }
                            if (CollectionsKt___CollectionsKt.contains(this$0.f2(), this$0.U1().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                                str3 = str3 + "537,";
                            }
                            if (CollectionsKt___CollectionsKt.contains(this$0.f2(), this$0.U1().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                                str3 = str3 + "515,";
                            }
                            if (CollectionsKt___CollectionsKt.contains(this$0.f2(), this$0.U1().b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                                str3 = str3 + "516,";
                            }
                            if (CollectionsKt___CollectionsKt.contains(this$0.f2(), this$0.U1().b("check_dl_serv_extract_dl", "DL Extract"))) {
                                str3 = str3 + "523,";
                            }
                            if (CollectionsKt___CollectionsKt.contains(this$0.f2(), this$0.U1().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                                str3 = str3 + "524,";
                            }
                            if (CollectionsKt___CollectionsKt.contains(this$0.f2(), this$0.U1().b("change_name_dl", "Change of Name in DL"))) {
                                str3 = str3 + "526,";
                            }
                            if (CollectionsKt___CollectionsKt.contains(this$0.f2(), this$0.U1().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                                str3 = str3 + "548";
                            }
                            String strSubstring = str3.substring(0, str3.length() - 1);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                            try {
                                DlLogCapture.Companion companion = DlLogCapture.INSTANCE;
                                String applicationDate = resultItemSubmit.getApplicationDate();
                                String applicationNo = resultItemSubmit.getApplicationNo();
                                Intrinsics.checkNotNull(applicationNo);
                                long j = Long.parseLong(applicationNo);
                                int i2 = Integer.parseInt(this$0.d2().k());
                                String dateofBirth = resultItemSubmit.getDateofBirth();
                                String dlno = resultItemSubmit.getDlno();
                                Intrinsics.checkNotNull(dlno);
                                String applicantGender = resultItemSubmit.getApplicantGender();
                                String str4 = this$0.Mobile_no;
                                Intrinsics.checkNotNull(str4);
                                try {
                                    try {
                                        companion.a(this$0, "1234", "S", applicationDate, j, i2, dateofBirth, dlno, "N", "N", applicantGender, str4, false, strSubstring, this$0.lastEndorseRTOCode, this$0.lastEndorseStateCode);
                                    } catch (Exception unused) {
                                    }
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                            }
                            dLServiceAcknowlegementActivity.K2(this$0, resultItemSubmit, this$0.lastEndorseRTOCode, this$0.R1(), this$0.dlNo, this$0.dob, this$0.Mobile_no, this$0.lastEndorseRto, this$0.lastEndorseState, this$0.lastEndorseStateCode, this$0.Z1());
                            return;
                        }
                        return;
                    } catch (Exception unused4) {
                        zbVar = null;
                        hillReligion = this$0;
                        i = R.string.unable_to_get_details;
                        str = "service_is_not_present";
                    }
                } else {
                    zbVar = null;
                    hillReligion = this$0;
                    DlSubmitResult dlSubmitresult3 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                    String reqStatus = dlSubmitresult3 != null ? dlSubmitresult3.getReqStatus() : null;
                    if (reqStatus != null && reqStatus.length() != 0) {
                        DlSubmitResult dlSubmitresult4 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                        String reqStatus2 = dlSubmitresult4 != null ? dlSubmitresult4.getReqStatus() : null;
                        Intrinsics.checkNotNull(reqStatus2);
                        hillReligion.G2(reqStatus2);
                        return;
                    }
                    wa3 wa3VarU1 = this$0.U1();
                    i = R.string.unable_to_get_details;
                    try {
                        str = "service_is_not_present";
                        try {
                            hillReligion.G2(wa3VarU1.b(str, hillReligion.getString(R.string.unable_to_get_details)));
                            return;
                        } catch (Exception unused5) {
                        }
                    } catch (Exception unused6) {
                        str = "service_is_not_present";
                    }
                }
            } catch (Exception unused7) {
                str = str2;
                i = R.string.unable_to_get_details;
            }
        } catch (Exception unused8) {
            i = R.string.unable_to_get_details;
            zbVar = null;
            str = "service_is_not_present";
            hillReligion = this$0;
        }
        zb zbVar3 = hillReligion.mBinding;
        if (zbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar3 = zbVar;
        }
        zbVar3.E.c(false);
        hillReligion.G2(this$0.U1().b(str, hillReligion.getString(i)));
    }

    public static final void x2(HillReligion this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        zb zbVar = this$0.mBinding;
        if (zbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar = null;
        }
        zbVar.E.c(false);
        this$0.G2(this$0.U1().b("service_is_not_present", this$0.getString(R.string.unable_to_get_details)));
    }

    public static final void y2(HillReligion this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void z2(HillReligion this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) DlServiceDetailsActivity.class);
            intent.putExtra("DL", this$0.dlNo);
            intent.putExtra("dob", this$0.dob);
            intent.putExtra("DLDetails", this$0.R1());
            intent.putExtra("Mobile_no", this$0.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this$0.lastEndorseRto);
            intent.putExtra("lastEndorsedState", this$0.lastEndorseState);
            intent.putExtra("lastEndorsedRTOCode", this$0.lastEndorseRTOCode);
            intent.putExtra("lastEndorseStateCode", this$0.lastEndorseStateCode);
            intent.putExtra("whatServiceRequired", this$0.whatServiceRequired);
            if (Intrinsics.areEqual(this$0.g2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", this$0.f2());
            }
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public final void G2(String message) {
        if (message != null) {
            String strB = U1().b("nex_parivahan", getString(R.string.app_name));
            Intrinsics.checkNotNull(strB);
            String strB2 = U1().b("btn_ok", getString(R.string.ok_txt));
            Intrinsics.checkNotNull(strB2);
            o40.q1(this, strB, message, 1, strB2, null, e.c, 16, null);
        }
    }

    public final void I2(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dlDetails = dldetobjX;
    }

    public final void J2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void K2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.listHeaderSteps = arrayList;
    }

    public final void L2(kl0 kl0Var) {
        Intrinsics.checkNotNullParameter(kl0Var, "<set-?>");
        this.mClDlViewModel = kl0Var;
    }

    public final void M2(ClInter clInter) {
        Intrinsics.checkNotNullParameter(clInter, "<set-?>");
        this.mClInter = clInter;
    }

    public final void N2(CombineServiceInterface combineServiceInterface) {
        Intrinsics.checkNotNullParameter(combineServiceInterface, "<set-?>");
        this.mCombineServiceInterface = combineServiceInterface;
    }

    public final void O2(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void P2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.multiListName = arrayList;
    }

    public final void Q2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final DldetobjX R1() {
        DldetobjX dldetobjX = this.dlDetails;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlDetails");
        return null;
    }

    public final void R2(int i) {
        this.schoolCode = i;
    }

    /* JADX INFO: renamed from: S1, reason: from getter */
    public final String getDlNo() {
        return this.dlNo;
    }

    public final void S2(int i) {
        this.schoolCodePosition = i;
    }

    /* JADX INFO: renamed from: T1, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    public final void T2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.schoolName = str;
    }

    public final wa3 U1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final void U2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.stateList = arrayList;
    }

    /* JADX INFO: renamed from: V1, reason: from getter */
    public final String getLastEndorseRTOCode() {
        return this.lastEndorseRTOCode;
    }

    /* JADX INFO: renamed from: W1, reason: from getter */
    public final String getLastEndorseRto() {
        return this.lastEndorseRto;
    }

    /* JADX INFO: renamed from: X1, reason: from getter */
    public final String getLastEndorseState() {
        return this.lastEndorseState;
    }

    /* JADX INFO: renamed from: Y1, reason: from getter */
    public final String getLastEndorseStateCode() {
        return this.lastEndorseStateCode;
    }

    public final ArrayList Z1() {
        ArrayList arrayList = this.listHeaderSteps;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("listHeaderSteps");
        return null;
    }

    public final kl0 a2() {
        kl0 kl0Var = this.mClDlViewModel;
        if (kl0Var != null) {
            return kl0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mClDlViewModel");
        return null;
    }

    public final ClInter b2() {
        ClInter clInter = this.mClInter;
        if (clInter != null) {
            return clInter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mClInter");
        return null;
    }

    public final CombineServiceInterface c2() {
        CombineServiceInterface combineServiceInterface = this.mCombineServiceInterface;
        if (combineServiceInterface != null) {
            return combineServiceInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mCombineServiceInterface");
        return null;
    }

    public final ws6 d2() {
        ws6 ws6Var = this.mSessionmanger;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSessionmanger");
        return null;
    }

    /* JADX INFO: renamed from: e2, reason: from getter */
    public final String getMobile_no() {
        return this.Mobile_no;
    }

    public final ArrayList f2() {
        ArrayList arrayList = this.multiListName;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiListName");
        return null;
    }

    public final wl5 g2() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    /* JADX INFO: renamed from: h2, reason: from getter */
    public final int getSchoolCode() {
        return this.schoolCode;
    }

    /* JADX INFO: renamed from: i2, reason: from getter */
    public final String getSchoolName() {
        return this.schoolName;
    }

    public final ArrayList j2() {
        ArrayList arrayList = this.stateList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stateList");
        return null;
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lq7 lq7VarF = kd1.f(this, R.layout.activity_hill_religion);
        Intrinsics.checkNotNullExpressionValue(lq7VarF, "setContentView(...)");
        this.mBinding = (zb) lq7VarF;
        Q2(new wl5(this));
        O2(this);
        k2();
        n2();
        ta3.a aVar = ta3.a;
        zb zbVar = this.mBinding;
        zb zbVar2 = null;
        if (zbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar = null;
        }
        aVar.T0(this, zbVar);
        if (Intrinsics.areEqual(g2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            v2();
        }
        zb zbVar3 = this.mBinding;
        if (zbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar3 = null;
        }
        zbVar3.H.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.im2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HillReligion.y2(this.a, view);
            }
        });
        j18 j18Var = this.viewModel;
        if (j18Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            j18Var = null;
        }
        j18Var.g().g(this, new f(new c()));
        if (Intrinsics.areEqual(g2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                N2(CombineServiceInterface.INSTANCE.a(this));
                this.mCombineViewModel = (fs0) new z(this, new ds0(new cs0(c2()))).a(fs0.class);
                this.serialNo = getIntent().getIntExtra("serialNo", 0);
                Serializable serializableExtra = getIntent().getSerializableExtra("multiList");
                Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                P2((ArrayList) serializableExtra);
                Serializable serializableExtra2 = getIntent().getSerializableExtra("listHeaderSteps");
                Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                K2((ArrayList) serializableExtra2);
                Serializable serializableExtra3 = getIntent().getSerializableExtra("COA");
                Intrinsics.checkNotNull(serializableExtra3, "null cannot be cast to non-null type kotlin.Boolean");
                this.COA = ((Boolean) serializableExtra3).booleanValue();
                String stringExtra = getIntent().getStringExtra("metaflag");
                Intrinsics.checkNotNull(stringExtra, "null cannot be cast to non-null type kotlin.String");
                this.metaflag = stringExtra;
                this.bioRecGenesis = String.valueOf(getIntent().getStringExtra("bioRecGenesis"));
                this.allowAddrChangeAtDlservReqst = String.valueOf(getIntent().getStringExtra("allowAddrChangeAtDlservReqst"));
                if (this.serialNo == f2().size()) {
                    zb zbVar4 = this.mBinding;
                    if (zbVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        zbVar4 = null;
                    }
                    zbVar4.E.setText(U1().b("vahan_btn_submit", "Submit"));
                    zb zbVar5 = this.mBinding;
                    if (zbVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        zbVar5 = null;
                    }
                    zbVar5.z.setVisibility(0);
                    this.willingToRelocate = "Y";
                } else {
                    zb zbVar6 = this.mBinding;
                    if (zbVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        zbVar6 = null;
                    }
                    zbVar6.E.setText(U1().b("btn_dl_serv_next", "Next"));
                    zb zbVar7 = this.mBinding;
                    if (zbVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        zbVar7 = null;
                    }
                    zbVar7.z.setVisibility(8);
                    this.willingToRelocate = "N";
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    WindowMetrics maximumWindowMetrics = getWindowManager().getMaximumWindowMetrics();
                    Intrinsics.checkNotNullExpressionValue(maximumWindowMetrics, "getMaximumWindowMetrics(...)");
                    Rect bounds = maximumWindowMetrics.getBounds();
                    Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
                    this.widthPixels = bounds.right;
                } else {
                    this.widthPixels = getResources().getDisplayMetrics().widthPixels;
                }
                if (this.serialNo == f2().size()) {
                    zb zbVar8 = this.mBinding;
                    if (zbVar8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        zbVar8 = null;
                    }
                    zbVar8.E.setText(U1().b("vahan_btn_submit", "Submit"));
                } else {
                    zb zbVar9 = this.mBinding;
                    if (zbVar9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        zbVar9 = null;
                    }
                    zbVar9.E.setText(U1().b("btn_dl_serv_next", "Next"));
                }
            } catch (Exception unused) {
            }
        }
        if (Intrinsics.areEqual(g2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                if (Z1().size() == 1) {
                    zb zbVar10 = this.mBinding;
                    if (zbVar10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        zbVar10 = null;
                    }
                    zbVar10.H.g.setText((CharSequence) Z1().get(0));
                } else {
                    zb zbVar11 = this.mBinding;
                    if (zbVar11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        zbVar11 = null;
                    }
                    TextView textView = zbVar11.H.g;
                    String strB = U1().b("dl_services", getString(R.string.dl_services));
                    Intrinsics.checkNotNull(strB);
                    textView.setText(strB);
                    zb zbVar12 = this.mBinding;
                    if (zbVar12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        zbVar12 = null;
                    }
                    TextView textView2 = zbVar12.H.g;
                    zb zbVar13 = this.mBinding;
                    if (zbVar13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        zbVar13 = null;
                    }
                    textView2.setPaintFlags(zbVar13.H.g.getPaintFlags() | 8);
                }
            } catch (Exception unused2) {
            }
        } else {
            zb zbVar14 = this.mBinding;
            if (zbVar14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                zbVar14 = null;
            }
            zbVar14.H.g.setText(U1().b("hill_region_title", "Endorsement to Drive in Hill Region"));
        }
        zb zbVar15 = this.mBinding;
        if (zbVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar15 = null;
        }
        zbVar15.H.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pm2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HillReligion.z2(this.a, view);
            }
        });
        zb zbVar16 = this.mBinding;
        if (zbVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar16 = null;
        }
        zbVar16.H.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qm2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HillReligion.A2(this.a, view);
            }
        });
        zb zbVar17 = this.mBinding;
        if (zbVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar17 = null;
        }
        zbVar17.H.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rm2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HillReligion.B2(this.a, view);
            }
        });
        if (Intrinsics.areEqual(g2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                if (Z1().size() > 1) {
                    zb zbVar18 = this.mBinding;
                    if (zbVar18 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        zbVar18 = null;
                    }
                    zbVar18.I.setLayoutManager(new LinearLayoutManager(this, 0, false));
                    ArrayList arrayListZ1 = Z1();
                    int i = this.serialNo;
                    int i2 = this.widthPixels;
                    String strB2 = U1().b("hill_region_title", "Endorsement to Drive in Hill Region");
                    Intrinsics.checkNotNull(strB2);
                    k76 k76Var = new k76(arrayListZ1, this, i, i2, strB2);
                    zb zbVar19 = this.mBinding;
                    if (zbVar19 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        zbVar19 = null;
                    }
                    zbVar19.I.setAdapter(k76Var);
                }
            } catch (Exception unused3) {
            }
        } else {
            zb zbVar20 = this.mBinding;
            if (zbVar20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                zbVar20 = null;
            }
            zbVar20.H.g.setText(U1().b("hill_region_title", "Endorsement to Drive in Hill Region"));
        }
        zb zbVar21 = this.mBinding;
        if (zbVar21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar21 = null;
        }
        zbVar21.H.e.setVisibility(8);
        zb zbVar22 = this.mBinding;
        if (zbVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar22 = null;
        }
        zbVar22.Z.setVisibility(0);
        zb zbVar23 = this.mBinding;
        if (zbVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar23 = null;
        }
        zbVar23.y.setVisibility(0);
        zb zbVar24 = this.mBinding;
        if (zbVar24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            zbVar24 = null;
        }
        zbVar24.F.g.setText(U1().b("hill_region_title", "Endorsement to Drive in Hill Region"));
        zb zbVar25 = this.mBinding;
        if (zbVar25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            zbVar2 = zbVar25;
        }
        zbVar2.H.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sm2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HillReligion.E2(this.a, view);
            }
        });
    }
}
