package com.nic.mparivahan.dlservices.ui.renewalofdl;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.Window;
import android.view.WindowMetrics;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.gson.Gson;
import com.nic.mparivahan.DLServicesAuth.View.DlServiceDetailsActivity;
import com.nic.mparivahan.Dl.Model.BioImgObjX;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.DlCombineServices.CombineReq;
import com.nic.mparivahan.DlCombineServices.CombineServiceInterface;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.DlLog.DlLogCapture;
import com.nic.mparivahan.dlservices.RenewalCOA.RenCOAInterface;
import com.nic.mparivahan.dlservices.data.model.AppCatPojo;
import com.nic.mparivahan.dlservices.data.model.DlAddress;
import com.nic.mparivahan.dlservices.data.model.DlRenewalSaveDto;
import com.nic.mparivahan.dlservices.data.model.DlSubmitResult;
import com.nic.mparivahan.dlservices.data.model.ResultItemSubmit;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse;
import com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity;
import com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName;
import com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity;
import com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity;
import com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity;
import com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity;
import com.nic.mparivahan.dlservices.ui.hillService.HillReligion;
import com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity;
import com.nic.mparivahan.dlservices.ui.renewalofdl.Revalidation.RenewalCoaValidation;
import com.nic.mparivahan.dlservices.ui.renewalofdl.Revalidation.RenewalGenY;
import com.nic.mparivahan.dlservices.ui.renewalofdl.Revalidation.SelectRenewalCoalist;
import com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity;
import com.zepto.ba;
import com.zepto.cs0;
import com.zepto.ds0;
import com.zepto.fs0;
import com.zepto.i85;
import com.zepto.j85;
import com.zepto.k76;
import com.zepto.kd1;
import com.zepto.kt6;
import com.zepto.lq7;
import com.zepto.mf4;
import com.zepto.o40;
import com.zepto.oq;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.wo1;
import com.zepto.ws6;
import java.io.Serializable;
import java.util.ArrayList;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\bO\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bÅ\u0002\u0010Æ\u0002J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J6\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014H\u0002J\u0012\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010H\u0002J\u0012\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001c\u001a\u00020\u0002H\u0007J\u0010\u0010\u001d\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010R\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010,\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u00100\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010'\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R\"\u00104\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010'\u001a\u0004\b2\u0010)\"\u0004\b3\u0010+R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010H\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010'\u001a\u0004\bF\u0010)\"\u0004\bG\u0010+R\"\u0010L\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010'\u001a\u0004\bJ\u0010)\"\u0004\bK\u0010+R\"\u0010P\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010'\u001a\u0004\bN\u0010)\"\u0004\bO\u0010+R\"\u0010T\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010'\u001a\u0004\bR\u0010)\"\u0004\bS\u0010+R\"\u0010X\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010'\u001a\u0004\bV\u0010)\"\u0004\bW\u0010+R\"\u0010\\\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010'\u001a\u0004\bZ\u0010)\"\u0004\b[\u0010+R\"\u0010\u0013\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010'\u001a\u0004\b^\u0010)\"\u0004\b_\u0010+R\u0016\u0010c\u001a\u00020`8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\ba\u0010bR\"\u0010k\u001a\u00020d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010o\u001a\u00020d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010f\u001a\u0004\bm\u0010h\"\u0004\bn\u0010jR2\u0010w\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00100p8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010\u007f\u001a\u00020x8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R*\u0010\u0087\u0001\u001a\u00030\u0080\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R*\u0010\u008f\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R(\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0090\u0001\u0010'\u001a\u0005\b\u0091\u0001\u0010)\"\u0005\b\u0092\u0001\u0010+R(\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0094\u0001\u0010'\u001a\u0005\b\u0095\u0001\u0010)\"\u0005\b\u0096\u0001\u0010+R(\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0098\u0001\u0010'\u001a\u0005\b\u0099\u0001\u0010)\"\u0005\b\u009a\u0001\u0010+R(\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009c\u0001\u0010'\u001a\u0005\b\u009d\u0001\u0010)\"\u0005\b\u009e\u0001\u0010+R(\u0010£\u0001\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b \u0001\u0010'\u001a\u0005\b¡\u0001\u0010)\"\u0005\b¢\u0001\u0010+R(\u0010§\u0001\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¤\u0001\u0010'\u001a\u0005\b¥\u0001\u0010)\"\u0005\b¦\u0001\u0010+R(\u0010«\u0001\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¨\u0001\u0010'\u001a\u0005\b©\u0001\u0010)\"\u0005\bª\u0001\u0010+R(\u0010¯\u0001\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¬\u0001\u0010'\u001a\u0005\b\u00ad\u0001\u0010)\"\u0005\b®\u0001\u0010+R(\u0010³\u0001\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b°\u0001\u0010'\u001a\u0005\b±\u0001\u0010)\"\u0005\b²\u0001\u0010+R(\u0010·\u0001\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b´\u0001\u0010'\u001a\u0005\bµ\u0001\u0010)\"\u0005\b¶\u0001\u0010+R(\u0010»\u0001\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¸\u0001\u0010'\u001a\u0005\b¹\u0001\u0010)\"\u0005\bº\u0001\u0010+R(\u0010¿\u0001\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¼\u0001\u0010'\u001a\u0005\b½\u0001\u0010)\"\u0005\b¾\u0001\u0010+R(\u0010Ã\u0001\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÀ\u0001\u0010'\u001a\u0005\bÁ\u0001\u0010)\"\u0005\bÂ\u0001\u0010+R(\u0010Ç\u0001\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÄ\u0001\u0010'\u001a\u0005\bÅ\u0001\u0010)\"\u0005\bÆ\u0001\u0010+R(\u0010Ë\u0001\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÈ\u0001\u0010'\u001a\u0005\bÉ\u0001\u0010)\"\u0005\bÊ\u0001\u0010+R(\u0010Ï\u0001\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÌ\u0001\u0010'\u001a\u0005\bÍ\u0001\u0010)\"\u0005\bÎ\u0001\u0010+R(\u0010Ó\u0001\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÐ\u0001\u0010'\u001a\u0005\bÑ\u0001\u0010)\"\u0005\bÒ\u0001\u0010+R(\u0010×\u0001\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÔ\u0001\u0010'\u001a\u0005\bÕ\u0001\u0010)\"\u0005\bÖ\u0001\u0010+R*\u0010ß\u0001\u001a\u00030Ø\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÙ\u0001\u0010Ú\u0001\u001a\u0006\bÛ\u0001\u0010Ü\u0001\"\u0006\bÝ\u0001\u0010Þ\u0001R&\u0010ã\u0001\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bà\u0001\u0010'\u001a\u0005\bá\u0001\u0010)\"\u0005\bâ\u0001\u0010+R&\u0010ç\u0001\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bä\u0001\u0010'\u001a\u0005\bå\u0001\u0010)\"\u0005\bæ\u0001\u0010+R&\u0010ë\u0001\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bè\u0001\u0010'\u001a\u0005\bé\u0001\u0010)\"\u0005\bê\u0001\u0010+R&\u0010ï\u0001\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bì\u0001\u0010'\u001a\u0005\bí\u0001\u0010)\"\u0005\bî\u0001\u0010+R&\u0010ó\u0001\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bð\u0001\u0010'\u001a\u0005\bñ\u0001\u0010)\"\u0005\bò\u0001\u0010+R&\u0010÷\u0001\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bô\u0001\u0010'\u001a\u0005\bõ\u0001\u0010)\"\u0005\bö\u0001\u0010+R&\u0010û\u0001\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bø\u0001\u0010'\u001a\u0005\bù\u0001\u0010)\"\u0005\bú\u0001\u0010+R&\u0010ÿ\u0001\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bü\u0001\u0010'\u001a\u0005\bý\u0001\u0010)\"\u0005\bþ\u0001\u0010+R&\u0010\u0083\u0002\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0002\u0010'\u001a\u0005\b\u0081\u0002\u0010)\"\u0005\b\u0082\u0002\u0010+R&\u0010\u0087\u0002\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0084\u0002\u0010'\u001a\u0005\b\u0085\u0002\u0010)\"\u0005\b\u0086\u0002\u0010+R*\u0010\u008f\u0002\u001a\u00030\u0088\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0089\u0002\u0010\u008a\u0002\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002\"\u0006\b\u008d\u0002\u0010\u008e\u0002R/\u0010\u0096\u0002\u001a\b\u0012\u0004\u0012\u00020\u00100\u00148\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0090\u0002\u0010\u0091\u0002\u001a\u0006\b\u0092\u0002\u0010\u0093\u0002\"\u0006\b\u0094\u0002\u0010\u0095\u0002R/\u0010\u009a\u0002\u001a\b\u0012\u0004\u0012\u00020\u00100\u00148\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0097\u0002\u0010\u0091\u0002\u001a\u0006\b\u0098\u0002\u0010\u0093\u0002\"\u0006\b\u0099\u0002\u0010\u0095\u0002R*\u0010¡\u0002\u001a\u00030\u009b\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009c\u0002\u0010\u0090\u0001\u001a\u0006\b\u009d\u0002\u0010\u009e\u0002\"\u0006\b\u009f\u0002\u0010 \u0002R)\u0010¨\u0002\u001a\u00030¢\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b£\u0002\u00101\u001a\u0006\b¤\u0002\u0010¥\u0002\"\u0006\b¦\u0002\u0010§\u0002R)\u0010¬\u0002\u001a\u00030¢\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b©\u0002\u00101\u001a\u0006\bª\u0002\u0010¥\u0002\"\u0006\b«\u0002\u0010§\u0002R&\u0010°\u0002\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u00ad\u0002\u0010'\u001a\u0005\b®\u0002\u0010)\"\u0005\b¯\u0002\u0010+R\u001a\u0010´\u0002\u001a\u00030±\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b²\u0002\u0010³\u0002R*\u0010¼\u0002\u001a\u00030µ\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¶\u0002\u0010·\u0002\u001a\u0006\b¸\u0002\u0010¹\u0002\"\u0006\bº\u0002\u0010»\u0002R*\u0010Ä\u0002\u001a\u00030½\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¾\u0002\u0010¿\u0002\u001a\u0006\bÀ\u0002\u0010Á\u0002\"\u0006\bÂ\u0002\u0010Ã\u0002¨\u0006Ç\u0002"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/renewalofdl/RenewalOfDLActivity;", "Lcom/zepto/o40;", "", "J2", "O1", "H2", "B2", "Lcom/nic/mparivahan/dlservices/ui/renewalofdl/RenewalValidation;", "V2", "Lcom/nic/mparivahan/dlservices/ui/renewalofdl/Revalidation/RenewalGenY;", "T2", "Lcom/nic/mparivahan/dlservices/ui/renewalofdl/Revalidation/RenewalCoaValidation;", "U2", "W2", "Landroid/content/Intent;", "intent", "", "lastEndRTO", "lastEndState", "purCode", "Ljava/util/ArrayList;", "multiList", "G2", "message", "Q2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "S2", "O2", "Lcom/zepto/ba;", "F", "Lcom/zepto/ba;", "R1", "()Lcom/zepto/ba;", "Y2", "(Lcom/zepto/ba;)V", "binding", "G", "Ljava/lang/String;", "U1", "()Ljava/lang/String;", "setDlNo", "(Ljava/lang/String;)V", "dlNo", "H", "V1", "setDob", "dob", "I", "getRto_cd", "setRto_cd", "rto_cd", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "J", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "T1", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "Z2", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "dlDetails", "Landroid/widget/LinearLayout;", "K", "Landroid/widget/LinearLayout;", "getLl_home", "()Landroid/widget/LinearLayout;", "c3", "(Landroid/widget/LinearLayout;)V", "ll_home", "L", "f2", "setMobile_no", "Mobile_no", "M", "Y1", "setLastEndorseRto", "lastEndorseRto", "N", "Z1", "setLastEndorseState", "lastEndorseState", "O", "a2", "setLastEndorseStateCode", "lastEndorseStateCode", "P", "X1", "setLastEndorseRTOCode", "lastEndorseRTOCode", "Q", "z2", "setState_value", "state_value", "R", "x2", "setPurCode", "Lcom/zepto/wo1;", "S", "Lcom/zepto/wo1;", "viewModel", "Lcom/nic/mparivahan/dlservices/data/model/DlAddress;", "T", "Lcom/nic/mparivahan/dlservices/data/model/DlAddress;", "getPresentAdd", "()Lcom/nic/mparivahan/dlservices/data/model/DlAddress;", "setPresentAdd", "(Lcom/nic/mparivahan/dlservices/data/model/DlAddress;)V", "presentAdd", "U", "getPermanentAdd", "setPermanentAdd", "permanentAdd", "Ljava/util/HashMap;", "V", "Ljava/util/HashMap;", "A2", "()Ljava/util/HashMap;", "setWhatServiceRequired", "(Ljava/util/HashMap;)V", "whatServiceRequired", "Lcom/zepto/wl5;", "W", "Lcom/zepto/wl5;", "y2", "()Lcom/zepto/wl5;", "j3", "(Lcom/zepto/wl5;)V", "sarthiSession", "Lcom/nic/mparivahan/dlservices/RenewalCOA/a;", "X", "Lcom/nic/mparivahan/dlservices/RenewalCOA/a;", "getMRenCOAVM", "()Lcom/nic/mparivahan/dlservices/RenewalCOA/a;", "g3", "(Lcom/nic/mparivahan/dlservices/RenewalCOA/a;)V", "mRenCOAVM", "Lcom/nic/mparivahan/dlservices/RenewalCOA/RenCOAInterface;", "Y", "Lcom/nic/mparivahan/dlservices/RenewalCOA/RenCOAInterface;", "d2", "()Lcom/nic/mparivahan/dlservices/RenewalCOA/RenCOAInterface;", "f3", "(Lcom/nic/mparivahan/dlservices/RenewalCOA/RenCOAInterface;)V", "mRenCOAInterface", "Z", "i2", "setPerHouseNo", "perHouseNo", "a0", "m2", "setPerStreet", "perStreet", "b0", "j2", "setPerLocation", "perLocation", "c0", "o2", "setPermVillageOrTown", "permVillageOrTown", "d0", "n2", "setPerSubDistrict", "perSubDistrict", "e0", "h2", "setPerDistrict", "perDistrict", "f0", "l2", "setPerState", "perState", "g0", "k2", "setPerPinCode", "perPinCode", "h0", "q2", "setPresHouseNo", "presHouseNo", "i0", "u2", "setPresStreet", "presStreet", "j0", "r2", "setPresLocation", "presLocation", "k0", "w2", "setPresVillageOrTown", "presVillageOrTown", "l0", "v2", "setPresSubDistrict", "presSubDistrict", "m0", "p2", "setPresDistrict", "presDistrict", "n0", "t2", "setPresState", "presState", "o0", "s2", "setPresPincode", "presPincode", "p0", "S1", "setBioRecGenesis", "bioRecGenesis", "q0", "P1", "setAllowAddrChangeAtDlservReqst", "allowAddrChangeAtDlservReqst", "Lcom/zepto/ws6;", "r0", "Lcom/zepto/ws6;", "e2", "()Lcom/zepto/ws6;", "h3", "(Lcom/zepto/ws6;)V", "mSessionmanger", "s0", "Q1", "X2", "appCategory", "t0", "getForm1FlagDLserReq", "setForm1FlagDLserReq", "form1FlagDLserReq", "u0", "getSubmitFormOne", "setSubmitFormOne", "submitFormOne", "v0", "getAString", "setAString", "aString", "w0", "getBString", "setBString", "bString", "x0", "getCString", "setCString", "cString", "y0", "getDString", "setDString", "dString", "z0", "getEString", "setEString", "eString", "A0", "getFString", "setFString", "fString", "B0", "getGString", "setGString", "gString", "Landroid/content/Context;", "C0", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "e3", "(Landroid/content/Context;)V", "mContext", "D0", "Ljava/util/ArrayList;", "g2", "()Ljava/util/ArrayList;", "i3", "(Ljava/util/ArrayList;)V", "multiListName", "E0", "b2", "b3", "listHeaderSteps", "", "F0", "getCOA", "()Z", "setCOA", "(Z)V", "COA", "", "G0", "getWidthPixels", "()I", "setWidthPixels", "(I)V", "widthPixels", "H0", "getSerialNo", "setSerialNo", "serialNo", "I0", "getMetaflag", "setMetaflag", "metaflag", "Lcom/zepto/fs0;", "J0", "Lcom/zepto/fs0;", "mCombineViewModel", "Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;", "K0", "Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;", "c2", "()Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;", "d3", "(Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;)V", "mCombineServiceInterface", "Lcom/zepto/wa3;", "L0", "Lcom/zepto/wa3;", "W1", "()Lcom/zepto/wa3;", "a3", "(Lcom/zepto/wa3;)V", "langSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRenewalOfDLActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenewalOfDLActivity.kt\ncom/nic/mparivahan/dlservices/ui/renewalofdl/RenewalOfDLActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,2338:1\n260#2:2339\n*S KotlinDebug\n*F\n+ 1 RenewalOfDLActivity.kt\ncom/nic/mparivahan/dlservices/ui/renewalofdl/RenewalOfDLActivity\n*L\n1659#1:2339\n*E\n"})
public final class RenewalOfDLActivity extends o40 {

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    public ArrayList multiListName;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    public ArrayList listHeaderSteps;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ba binding;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    public boolean COA;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String dlNo;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    public int widthPixels;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String dob;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    public int serialNo;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public DldetobjX dlDetails;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    public fs0 mCombineViewModel;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public LinearLayout ll_home;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    public CombineServiceInterface mCombineServiceInterface;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String Mobile_no;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public wo1 viewModel;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public com.nic.mparivahan.dlservices.RenewalCOA.a mRenCOAVM;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public RenCOAInterface mRenCOAInterface;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public String bioRecGenesis;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public String allowAddrChangeAtDlservReqst;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public ws6 mSessionmanger;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String rto_cd = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String lastEndorseRto = "";

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String lastEndorseState = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String lastEndorseStateCode = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String lastEndorseRTOCode = "";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String state_value = "";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String purCode = "0";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public DlAddress presentAdd = new DlAddress("", "", "", "", "", "", "", "");

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public DlAddress permanentAdd = new DlAddress("", "", "", "", "", "", "", "");

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public HashMap whatServiceRequired = new HashMap();

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String perHouseNo = "";

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String perStreet = "";

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String perLocation = "";

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public String permVillageOrTown = "";

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public String perSubDistrict = "";

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public String perDistrict = "";

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public String perState = "";

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public String perPinCode = "";

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public String presHouseNo = "";

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public String presStreet = "";

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public String presLocation = "";

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public String presVillageOrTown = "";

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public String presSubDistrict = "";

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public String presDistrict = "";

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public String presState = "";

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public String presPincode = "";

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    public String appCategory = "0";

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    public String form1FlagDLserReq = "N";

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    public String submitFormOne = "N";

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public String aString = "";

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    public String bString = "";

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    public String cString = "";

    /* JADX INFO: renamed from: y0, reason: from kotlin metadata */
    public String dString = "";

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    public String eString = "";

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    public String fString = "";

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    public String gString = "N";

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    public String metaflag = "";

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
            RenewalOfDLActivity.this.X2(((AppCatPojo) ((ArrayList) this.b.element).get(i)).getAppCode());
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(GetAckDetForGivenDLNumberResponse getAckDetForGivenDLNumberResponse) throws Throwable {
            List<ResultItemSubmit> result;
            try {
                RenewalOfDLActivity.this.R1().Q.c(false);
                DlSubmitResult dlSubmitresult = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                if (!StringsKt__StringsJVMKt.equals$default(dlSubmitresult != null ? dlSubmitresult.getStatusCode() : null, "00", false, 2, null)) {
                    DlSubmitResult dlSubmitresult2 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                    if (!StringsKt__StringsJVMKt.equals$default(dlSubmitresult2 != null ? dlSubmitresult2.getStatusCode() : null, "01", false, 2, null)) {
                        DlSubmitResult dlSubmitresult3 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                        if (StringsKt__StringsJVMKt.equals$default(dlSubmitresult3 != null ? dlSubmitresult3.getStatusCode() : null, "05", false, 2, null)) {
                            RenewalOfDLActivity.this.R1().Q.c(false);
                            RenewalOfDLActivity renewalOfDLActivity = RenewalOfDLActivity.this;
                            renewalOfDLActivity.O2(renewalOfDLActivity.W1().b("service_is_not_present", "Something went wrong,Please try after some time!"));
                            return;
                        } else {
                            RenewalOfDLActivity.this.R1().Q.c(false);
                            RenewalOfDLActivity renewalOfDLActivity2 = RenewalOfDLActivity.this;
                            DlSubmitResult dlSubmitresult4 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                            renewalOfDLActivity2.w1(dlSubmitresult4 != null ? dlSubmitresult4.getStatusDesc() : null, RenewalOfDLActivity.this.R1().m());
                            return;
                        }
                    }
                    RenewalOfDLActivity.this.R1().Q.c(false);
                    DlSubmitResult dlSubmitresult5 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                    Intrinsics.checkNotNull(dlSubmitresult5);
                    String reqStatus = dlSubmitresult5.getReqStatus();
                    if (reqStatus != null && reqStatus.length() != 0) {
                        RenewalOfDLActivity renewalOfDLActivity3 = RenewalOfDLActivity.this;
                        DlSubmitResult dlSubmitresult6 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                        Intrinsics.checkNotNull(dlSubmitresult6);
                        renewalOfDLActivity3.O2(dlSubmitresult6.getReqStatus());
                        return;
                    }
                    RenewalOfDLActivity renewalOfDLActivity4 = RenewalOfDLActivity.this;
                    renewalOfDLActivity4.O2(renewalOfDLActivity4.W1().b("service_is_not_present", "Something went wrong,Please try after some time!"));
                    return;
                }
                DlSubmitResult dlSubmitresult7 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                if (dlSubmitresult7 == null || (result = dlSubmitresult7.getResult()) == null || !(!result.isEmpty())) {
                    return;
                }
                DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity = new DLServiceAcknowlegementActivity();
                ResultItemSubmit resultItemSubmit = getAckDetForGivenDLNumberResponse.getDlSubmitresult().getResult().get(0);
                if (resultItemSubmit != null) {
                    RenewalOfDLActivity renewalOfDLActivity5 = RenewalOfDLActivity.this;
                    try {
                        DlLogCapture.Companion companion = DlLogCapture.INSTANCE;
                        String applicationDate = resultItemSubmit.getApplicationDate();
                        String applicationNo = resultItemSubmit.getApplicationNo();
                        Intrinsics.checkNotNull(applicationNo);
                        long j = Long.parseLong(applicationNo);
                        int i = Integer.parseInt(renewalOfDLActivity5.e2().k());
                        String dateofBirth = resultItemSubmit.getDateofBirth();
                        String dlno = resultItemSubmit.getDlno();
                        Intrinsics.checkNotNull(dlno);
                        String applicantGender = resultItemSubmit.getApplicantGender();
                        String mobile_no = renewalOfDLActivity5.getMobile_no();
                        Intrinsics.checkNotNull(mobile_no);
                        String purCode = renewalOfDLActivity5.getPurCode();
                        String lastEndorseRTOCode = renewalOfDLActivity5.getLastEndorseRTOCode();
                        Intrinsics.checkNotNull(lastEndorseRTOCode);
                        companion.a(renewalOfDLActivity5, "1234", "S", applicationDate, j, i, dateofBirth, dlno, "N", "N", applicantGender, mobile_no, false, purCode, lastEndorseRTOCode, renewalOfDLActivity5.getLastEndorseStateCode());
                    } catch (Exception unused) {
                    }
                    if (!Intrinsics.areEqual(renewalOfDLActivity5.y2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                        renewalOfDLActivity5.i3(new ArrayList());
                        renewalOfDLActivity5.g2().add(renewalOfDLActivity5.y2().k());
                    }
                    dLServiceAcknowlegementActivity.K2(renewalOfDLActivity5, resultItemSubmit, renewalOfDLActivity5.getLastEndorseRTOCode(), renewalOfDLActivity5.T1(), renewalOfDLActivity5.getDlNo(), renewalOfDLActivity5.getDob(), renewalOfDLActivity5.getMobile_no(), renewalOfDLActivity5.getLastEndorseRto(), renewalOfDLActivity5.getLastEndorseState(), renewalOfDLActivity5.getLastEndorseStateCode(), renewalOfDLActivity5.g2());
                }
            } catch (Exception unused2) {
                RenewalOfDLActivity.this.R1().Q.c(false);
                RenewalOfDLActivity renewalOfDLActivity6 = RenewalOfDLActivity.this;
                renewalOfDLActivity6.O2(renewalOfDLActivity6.W1().b("service_is_not_present", RenewalOfDLActivity.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((GetAckDetForGivenDLNumberResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(GetAckDetForGivenDLNumberResponse getAckDetForGivenDLNumberResponse) throws Throwable {
            List<ResultItemSubmit> result;
            try {
                RenewalOfDLActivity.this.R1().Q.c(false);
                DlSubmitResult dlSubmitresult = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                if (!StringsKt__StringsJVMKt.equals$default(dlSubmitresult != null ? dlSubmitresult.getStatusCode() : null, "00", false, 2, null)) {
                    DlSubmitResult dlSubmitresult2 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                    if (!StringsKt__StringsJVMKt.equals$default(dlSubmitresult2 != null ? dlSubmitresult2.getStatusCode() : null, "01", false, 2, null)) {
                        DlSubmitResult dlSubmitresult3 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                        if (StringsKt__StringsJVMKt.equals$default(dlSubmitresult3 != null ? dlSubmitresult3.getStatusCode() : null, "05", false, 2, null)) {
                            RenewalOfDLActivity.this.R1().Q.c(false);
                            RenewalOfDLActivity renewalOfDLActivity = RenewalOfDLActivity.this;
                            renewalOfDLActivity.O2(renewalOfDLActivity.W1().b("service_is_not_present", "Something went wrong,Please try after some time!"));
                            return;
                        } else {
                            RenewalOfDLActivity.this.R1().Q.c(false);
                            RenewalOfDLActivity renewalOfDLActivity2 = RenewalOfDLActivity.this;
                            DlSubmitResult dlSubmitresult4 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                            renewalOfDLActivity2.w1(dlSubmitresult4 != null ? dlSubmitresult4.getStatusDesc() : null, RenewalOfDLActivity.this.R1().m());
                            return;
                        }
                    }
                    RenewalOfDLActivity.this.R1().Q.c(false);
                    DlSubmitResult dlSubmitresult5 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                    Intrinsics.checkNotNull(dlSubmitresult5);
                    String reqStatus = dlSubmitresult5.getReqStatus();
                    if (reqStatus != null && reqStatus.length() != 0) {
                        RenewalOfDLActivity renewalOfDLActivity3 = RenewalOfDLActivity.this;
                        DlSubmitResult dlSubmitresult6 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                        Intrinsics.checkNotNull(dlSubmitresult6);
                        renewalOfDLActivity3.O2(dlSubmitresult6.getReqStatus());
                        return;
                    }
                    RenewalOfDLActivity renewalOfDLActivity4 = RenewalOfDLActivity.this;
                    renewalOfDLActivity4.O2(renewalOfDLActivity4.W1().b("service_is_not_present", "Something went wrong,Please try after some time!"));
                    return;
                }
                DlSubmitResult dlSubmitresult7 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                if (dlSubmitresult7 == null || (result = dlSubmitresult7.getResult()) == null || !(!result.isEmpty())) {
                    return;
                }
                DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity = new DLServiceAcknowlegementActivity();
                ResultItemSubmit resultItemSubmit = getAckDetForGivenDLNumberResponse.getDlSubmitresult().getResult().get(0);
                if (resultItemSubmit != null) {
                    RenewalOfDLActivity renewalOfDLActivity5 = RenewalOfDLActivity.this;
                    try {
                        DlLogCapture.Companion companion = DlLogCapture.INSTANCE;
                        String applicationDate = resultItemSubmit.getApplicationDate();
                        String applicationNo = resultItemSubmit.getApplicationNo();
                        Intrinsics.checkNotNull(applicationNo);
                        long j = Long.parseLong(applicationNo);
                        int i = Integer.parseInt(renewalOfDLActivity5.e2().k());
                        String dateofBirth = resultItemSubmit.getDateofBirth();
                        String dlno = resultItemSubmit.getDlno();
                        Intrinsics.checkNotNull(dlno);
                        String applicantGender = resultItemSubmit.getApplicantGender();
                        String mobile_no = renewalOfDLActivity5.getMobile_no();
                        Intrinsics.checkNotNull(mobile_no);
                        String purCode = renewalOfDLActivity5.getPurCode();
                        String lastEndorseRTOCode = renewalOfDLActivity5.getLastEndorseRTOCode();
                        Intrinsics.checkNotNull(lastEndorseRTOCode);
                        companion.a(renewalOfDLActivity5, "1234", "S", applicationDate, j, i, dateofBirth, dlno, "N", "N", applicantGender, mobile_no, false, purCode, lastEndorseRTOCode, renewalOfDLActivity5.getLastEndorseStateCode());
                    } catch (Exception unused) {
                    }
                    if (!Intrinsics.areEqual(renewalOfDLActivity5.y2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                        renewalOfDLActivity5.i3(new ArrayList());
                        renewalOfDLActivity5.g2().add(renewalOfDLActivity5.y2().k());
                    }
                    dLServiceAcknowlegementActivity.K2(renewalOfDLActivity5, resultItemSubmit, renewalOfDLActivity5.getLastEndorseRTOCode(), renewalOfDLActivity5.T1(), renewalOfDLActivity5.getDlNo(), renewalOfDLActivity5.getDob(), renewalOfDLActivity5.getMobile_no(), renewalOfDLActivity5.getLastEndorseRto(), renewalOfDLActivity5.getLastEndorseState(), renewalOfDLActivity5.getLastEndorseStateCode(), renewalOfDLActivity5.g2());
                }
            } catch (Exception unused2) {
                RenewalOfDLActivity.this.R1().Q.c(false);
                RenewalOfDLActivity renewalOfDLActivity6 = RenewalOfDLActivity.this;
                renewalOfDLActivity6.O2(renewalOfDLActivity6.W1().b("service_is_not_present", RenewalOfDLActivity.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((GetAckDetForGivenDLNumberResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        public final void a(GetAckDetForGivenDLNumberResponse getAckDetForGivenDLNumberResponse) throws Throwable {
            List<ResultItemSubmit> result;
            try {
                RenewalOfDLActivity.this.R1().Q.c(false);
                DlSubmitResult dlSubmitresult = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                if (!StringsKt__StringsJVMKt.equals$default(dlSubmitresult != null ? dlSubmitresult.getStatusCode() : null, "00", false, 2, null)) {
                    DlSubmitResult dlSubmitresult2 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                    if (!StringsKt__StringsJVMKt.equals$default(dlSubmitresult2 != null ? dlSubmitresult2.getStatusCode() : null, "01", false, 2, null)) {
                        DlSubmitResult dlSubmitresult3 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                        if (StringsKt__StringsJVMKt.equals$default(dlSubmitresult3 != null ? dlSubmitresult3.getStatusCode() : null, "05", false, 2, null)) {
                            RenewalOfDLActivity.this.R1().Q.c(false);
                            RenewalOfDLActivity renewalOfDLActivity = RenewalOfDLActivity.this;
                            renewalOfDLActivity.O2(renewalOfDLActivity.W1().b("service_is_not_present", "Something went wrong,Please try after some time!"));
                            return;
                        } else {
                            RenewalOfDLActivity.this.R1().Q.c(false);
                            RenewalOfDLActivity renewalOfDLActivity2 = RenewalOfDLActivity.this;
                            DlSubmitResult dlSubmitresult4 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                            renewalOfDLActivity2.w1(dlSubmitresult4 != null ? dlSubmitresult4.getStatusDesc() : null, RenewalOfDLActivity.this.R1().m());
                            return;
                        }
                    }
                    RenewalOfDLActivity.this.R1().Q.c(false);
                    DlSubmitResult dlSubmitresult5 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                    Intrinsics.checkNotNull(dlSubmitresult5);
                    String reqStatus = dlSubmitresult5.getReqStatus();
                    if (reqStatus != null && reqStatus.length() != 0) {
                        RenewalOfDLActivity renewalOfDLActivity3 = RenewalOfDLActivity.this;
                        DlSubmitResult dlSubmitresult6 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                        Intrinsics.checkNotNull(dlSubmitresult6);
                        renewalOfDLActivity3.O2(dlSubmitresult6.getReqStatus());
                        return;
                    }
                    RenewalOfDLActivity renewalOfDLActivity4 = RenewalOfDLActivity.this;
                    renewalOfDLActivity4.O2(renewalOfDLActivity4.W1().b("service_is_not_present", "Something went wrong,Please try after some time!"));
                    return;
                }
                DlSubmitResult dlSubmitresult7 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                if (dlSubmitresult7 == null || (result = dlSubmitresult7.getResult()) == null || !(!result.isEmpty())) {
                    return;
                }
                DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity = new DLServiceAcknowlegementActivity();
                ResultItemSubmit resultItemSubmit = getAckDetForGivenDLNumberResponse.getDlSubmitresult().getResult().get(0);
                if (resultItemSubmit != null) {
                    RenewalOfDLActivity renewalOfDLActivity5 = RenewalOfDLActivity.this;
                    try {
                        DlLogCapture.Companion companion = DlLogCapture.INSTANCE;
                        String applicationDate = resultItemSubmit.getApplicationDate();
                        String applicationNo = resultItemSubmit.getApplicationNo();
                        Intrinsics.checkNotNull(applicationNo);
                        long j = Long.parseLong(applicationNo);
                        int i = Integer.parseInt(renewalOfDLActivity5.e2().k());
                        String dateofBirth = resultItemSubmit.getDateofBirth();
                        String dlno = resultItemSubmit.getDlno();
                        Intrinsics.checkNotNull(dlno);
                        String applicantGender = resultItemSubmit.getApplicantGender();
                        String mobile_no = renewalOfDLActivity5.getMobile_no();
                        Intrinsics.checkNotNull(mobile_no);
                        String purCode = renewalOfDLActivity5.getPurCode();
                        String lastEndorseRTOCode = renewalOfDLActivity5.getLastEndorseRTOCode();
                        Intrinsics.checkNotNull(lastEndorseRTOCode);
                        companion.a(renewalOfDLActivity5, "1234", "S", applicationDate, j, i, dateofBirth, dlno, "N", "N", applicantGender, mobile_no, false, purCode, lastEndorseRTOCode, renewalOfDLActivity5.getLastEndorseStateCode());
                    } catch (Exception unused) {
                    }
                    if (!Intrinsics.areEqual(renewalOfDLActivity5.y2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                        renewalOfDLActivity5.i3(new ArrayList());
                        renewalOfDLActivity5.g2().add(renewalOfDLActivity5.y2().k());
                    }
                    dLServiceAcknowlegementActivity.K2(renewalOfDLActivity5, resultItemSubmit, renewalOfDLActivity5.getLastEndorseRTOCode(), renewalOfDLActivity5.T1(), renewalOfDLActivity5.getDlNo(), renewalOfDLActivity5.getDob(), renewalOfDLActivity5.getMobile_no(), renewalOfDLActivity5.getLastEndorseRto(), renewalOfDLActivity5.getLastEndorseState(), renewalOfDLActivity5.getLastEndorseStateCode(), renewalOfDLActivity5.g2());
                }
            } catch (Exception unused2) {
                RenewalOfDLActivity.this.R1().Q.c(false);
                RenewalOfDLActivity renewalOfDLActivity6 = RenewalOfDLActivity.this;
                renewalOfDLActivity6.O2(renewalOfDLActivity6.W1().b("service_is_not_present", RenewalOfDLActivity.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((GetAckDetForGivenDLNumberResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(GetAckDetForGivenDLNumberResponse getAckDetForGivenDLNumberResponse) throws Throwable {
            List<ResultItemSubmit> result;
            try {
                RenewalOfDLActivity.this.R1().Q.c(false);
                DlSubmitResult dlSubmitresult = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                if (!StringsKt__StringsJVMKt.equals$default(dlSubmitresult != null ? dlSubmitresult.getStatusCode() : null, "00", false, 2, null)) {
                    DlSubmitResult dlSubmitresult2 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                    if (!StringsKt__StringsJVMKt.equals$default(dlSubmitresult2 != null ? dlSubmitresult2.getStatusCode() : null, "01", false, 2, null)) {
                        DlSubmitResult dlSubmitresult3 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                        if (StringsKt__StringsJVMKt.equals$default(dlSubmitresult3 != null ? dlSubmitresult3.getStatusCode() : null, "05", false, 2, null)) {
                            RenewalOfDLActivity.this.R1().Q.c(false);
                            RenewalOfDLActivity renewalOfDLActivity = RenewalOfDLActivity.this;
                            renewalOfDLActivity.O2(renewalOfDLActivity.W1().b("service_is_not_present", "Something went wrong,Please try after some time!"));
                            return;
                        } else {
                            RenewalOfDLActivity.this.R1().Q.c(false);
                            RenewalOfDLActivity renewalOfDLActivity2 = RenewalOfDLActivity.this;
                            DlSubmitResult dlSubmitresult4 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                            renewalOfDLActivity2.w1(dlSubmitresult4 != null ? dlSubmitresult4.getStatusDesc() : null, RenewalOfDLActivity.this.R1().m());
                            return;
                        }
                    }
                    RenewalOfDLActivity.this.R1().Q.c(false);
                    DlSubmitResult dlSubmitresult5 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                    Intrinsics.checkNotNull(dlSubmitresult5);
                    String reqStatus = dlSubmitresult5.getReqStatus();
                    if (reqStatus != null && reqStatus.length() != 0) {
                        RenewalOfDLActivity renewalOfDLActivity3 = RenewalOfDLActivity.this;
                        DlSubmitResult dlSubmitresult6 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                        Intrinsics.checkNotNull(dlSubmitresult6);
                        renewalOfDLActivity3.O2(dlSubmitresult6.getReqStatus());
                        return;
                    }
                    RenewalOfDLActivity renewalOfDLActivity4 = RenewalOfDLActivity.this;
                    renewalOfDLActivity4.O2(renewalOfDLActivity4.W1().b("service_is_not_present", "Something went wrong,Please try after some time!"));
                    return;
                }
                DlSubmitResult dlSubmitresult7 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                if (dlSubmitresult7 == null || (result = dlSubmitresult7.getResult()) == null || !(!result.isEmpty())) {
                    return;
                }
                DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity = new DLServiceAcknowlegementActivity();
                ResultItemSubmit resultItemSubmit = getAckDetForGivenDLNumberResponse.getDlSubmitresult().getResult().get(0);
                if (resultItemSubmit != null) {
                    RenewalOfDLActivity renewalOfDLActivity5 = RenewalOfDLActivity.this;
                    try {
                        DlLogCapture.Companion companion = DlLogCapture.INSTANCE;
                        String applicationDate = resultItemSubmit.getApplicationDate();
                        String applicationNo = resultItemSubmit.getApplicationNo();
                        Intrinsics.checkNotNull(applicationNo);
                        long j = Long.parseLong(applicationNo);
                        int i = Integer.parseInt(renewalOfDLActivity5.e2().k());
                        String dateofBirth = resultItemSubmit.getDateofBirth();
                        String dlno = resultItemSubmit.getDlno();
                        Intrinsics.checkNotNull(dlno);
                        String applicantGender = resultItemSubmit.getApplicantGender();
                        String mobile_no = renewalOfDLActivity5.getMobile_no();
                        Intrinsics.checkNotNull(mobile_no);
                        String purCode = renewalOfDLActivity5.getPurCode();
                        String lastEndorseRTOCode = renewalOfDLActivity5.getLastEndorseRTOCode();
                        Intrinsics.checkNotNull(lastEndorseRTOCode);
                        companion.a(renewalOfDLActivity5, "1234", "S", applicationDate, j, i, dateofBirth, dlno, "N", "N", applicantGender, mobile_no, false, purCode, lastEndorseRTOCode, renewalOfDLActivity5.getLastEndorseStateCode());
                    } catch (Exception unused) {
                    }
                    if (!Intrinsics.areEqual(renewalOfDLActivity5.y2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                        renewalOfDLActivity5.i3(new ArrayList());
                        renewalOfDLActivity5.g2().add(renewalOfDLActivity5.y2().k());
                    }
                    dLServiceAcknowlegementActivity.K2(renewalOfDLActivity5, resultItemSubmit, renewalOfDLActivity5.getLastEndorseRTOCode(), renewalOfDLActivity5.T1(), renewalOfDLActivity5.getDlNo(), renewalOfDLActivity5.getDob(), renewalOfDLActivity5.getMobile_no(), renewalOfDLActivity5.getLastEndorseRto(), renewalOfDLActivity5.getLastEndorseState(), renewalOfDLActivity5.getLastEndorseStateCode(), renewalOfDLActivity5.g2());
                }
            } catch (Exception unused2) {
                RenewalOfDLActivity.this.R1().Q.c(false);
                RenewalOfDLActivity renewalOfDLActivity6 = RenewalOfDLActivity.this;
                renewalOfDLActivity6.O2(renewalOfDLActivity6.W1().b("service_is_not_present", RenewalOfDLActivity.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((GetAckDetForGivenDLNumberResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        public final void a(GetAckDetForGivenDLNumberResponse getAckDetForGivenDLNumberResponse) throws Throwable {
            List<ResultItemSubmit> result;
            try {
                RenewalOfDLActivity.this.R1().Q.c(false);
                DlSubmitResult dlSubmitresult = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                if (!StringsKt__StringsJVMKt.equals$default(dlSubmitresult != null ? dlSubmitresult.getStatusCode() : null, "00", false, 2, null)) {
                    DlSubmitResult dlSubmitresult2 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                    if (!StringsKt__StringsJVMKt.equals$default(dlSubmitresult2 != null ? dlSubmitresult2.getStatusCode() : null, "01", false, 2, null)) {
                        DlSubmitResult dlSubmitresult3 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                        if (StringsKt__StringsJVMKt.equals$default(dlSubmitresult3 != null ? dlSubmitresult3.getStatusCode() : null, "05", false, 2, null)) {
                            RenewalOfDLActivity.this.R1().Q.c(false);
                            RenewalOfDLActivity renewalOfDLActivity = RenewalOfDLActivity.this;
                            renewalOfDLActivity.O2(renewalOfDLActivity.W1().b("service_is_not_present", "Something went wrong,Please try after some time!"));
                            return;
                        } else {
                            RenewalOfDLActivity.this.R1().Q.c(false);
                            RenewalOfDLActivity renewalOfDLActivity2 = RenewalOfDLActivity.this;
                            DlSubmitResult dlSubmitresult4 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                            renewalOfDLActivity2.w1(dlSubmitresult4 != null ? dlSubmitresult4.getStatusDesc() : null, RenewalOfDLActivity.this.R1().m());
                            return;
                        }
                    }
                    RenewalOfDLActivity.this.R1().Q.c(false);
                    DlSubmitResult dlSubmitresult5 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                    Intrinsics.checkNotNull(dlSubmitresult5);
                    String reqStatus = dlSubmitresult5.getReqStatus();
                    if (reqStatus != null && reqStatus.length() != 0) {
                        RenewalOfDLActivity renewalOfDLActivity3 = RenewalOfDLActivity.this;
                        DlSubmitResult dlSubmitresult6 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                        Intrinsics.checkNotNull(dlSubmitresult6);
                        renewalOfDLActivity3.O2(dlSubmitresult6.getReqStatus());
                        return;
                    }
                    RenewalOfDLActivity renewalOfDLActivity4 = RenewalOfDLActivity.this;
                    renewalOfDLActivity4.O2(renewalOfDLActivity4.W1().b("service_is_not_present", "Something went wrong,Please try after some time!"));
                    return;
                }
                DlSubmitResult dlSubmitresult7 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                if (dlSubmitresult7 == null || (result = dlSubmitresult7.getResult()) == null || !(!result.isEmpty())) {
                    return;
                }
                DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity = new DLServiceAcknowlegementActivity();
                ResultItemSubmit resultItemSubmit = getAckDetForGivenDLNumberResponse.getDlSubmitresult().getResult().get(0);
                if (resultItemSubmit != null) {
                    RenewalOfDLActivity renewalOfDLActivity5 = RenewalOfDLActivity.this;
                    try {
                        DlLogCapture.Companion companion = DlLogCapture.INSTANCE;
                        String applicationDate = resultItemSubmit.getApplicationDate();
                        String applicationNo = resultItemSubmit.getApplicationNo();
                        Intrinsics.checkNotNull(applicationNo);
                        long j = Long.parseLong(applicationNo);
                        int i = Integer.parseInt(renewalOfDLActivity5.e2().k());
                        String dateofBirth = resultItemSubmit.getDateofBirth();
                        String dlno = resultItemSubmit.getDlno();
                        Intrinsics.checkNotNull(dlno);
                        String applicantGender = resultItemSubmit.getApplicantGender();
                        String mobile_no = renewalOfDLActivity5.getMobile_no();
                        Intrinsics.checkNotNull(mobile_no);
                        String purCode = renewalOfDLActivity5.getPurCode();
                        String lastEndorseRTOCode = renewalOfDLActivity5.getLastEndorseRTOCode();
                        Intrinsics.checkNotNull(lastEndorseRTOCode);
                        companion.a(renewalOfDLActivity5, "1234", "S", applicationDate, j, i, dateofBirth, dlno, "N", "N", applicantGender, mobile_no, false, purCode, lastEndorseRTOCode, renewalOfDLActivity5.getLastEndorseStateCode());
                    } catch (Exception unused) {
                    }
                    if (!Intrinsics.areEqual(renewalOfDLActivity5.y2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                        renewalOfDLActivity5.i3(new ArrayList());
                        renewalOfDLActivity5.g2().add(renewalOfDLActivity5.y2().k());
                    }
                    dLServiceAcknowlegementActivity.K2(renewalOfDLActivity5, resultItemSubmit, renewalOfDLActivity5.getLastEndorseRTOCode(), renewalOfDLActivity5.T1(), renewalOfDLActivity5.getDlNo(), renewalOfDLActivity5.getDob(), renewalOfDLActivity5.getMobile_no(), renewalOfDLActivity5.getLastEndorseRto(), renewalOfDLActivity5.getLastEndorseState(), renewalOfDLActivity5.getLastEndorseStateCode(), renewalOfDLActivity5.g2());
                }
            } catch (Exception unused2) {
                RenewalOfDLActivity.this.R1().Q.c(false);
                RenewalOfDLActivity renewalOfDLActivity6 = RenewalOfDLActivity.this;
                renewalOfDLActivity6.O2(renewalOfDLActivity6.W1().b("service_is_not_present", RenewalOfDLActivity.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((GetAckDetForGivenDLNumberResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        public final void a(DlRenewalSaveDto dlRenewalSaveDto) throws Throwable {
            ResultItemSubmit resultItemSubmit;
            try {
                RenewalOfDLActivity.this.R1().Q.c(false);
                DlSubmitResult result = dlRenewalSaveDto.getResult();
                Intrinsics.checkNotNull(result);
                if (!StringsKt__StringsJVMKt.equals$default(result.getStatusCode(), "00", false, 2, null)) {
                    DlSubmitResult result2 = dlRenewalSaveDto.getResult();
                    Intrinsics.checkNotNull(result2);
                    String reqStatus = result2.getReqStatus();
                    if (reqStatus != null && reqStatus.length() != 0) {
                        RenewalOfDLActivity renewalOfDLActivity = RenewalOfDLActivity.this;
                        DlSubmitResult result3 = dlRenewalSaveDto.getResult();
                        Intrinsics.checkNotNull(result3);
                        renewalOfDLActivity.Q2(result3.getReqStatus());
                        return;
                    }
                    RenewalOfDLActivity renewalOfDLActivity2 = RenewalOfDLActivity.this;
                    renewalOfDLActivity2.O2(renewalOfDLActivity2.W1().b("service_is_not_present", RenewalOfDLActivity.this.getString(R.string.unable_to_get_details)));
                    return;
                }
                DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity = new DLServiceAcknowlegementActivity();
                DlSubmitResult result4 = dlRenewalSaveDto.getResult();
                Intrinsics.checkNotNull(result4);
                List<ResultItemSubmit> result5 = result4.getResult();
                if (result5 == null || (resultItemSubmit = result5.get(0)) == null) {
                    return;
                }
                RenewalOfDLActivity renewalOfDLActivity3 = RenewalOfDLActivity.this;
                try {
                    DlLogCapture.Companion companion = DlLogCapture.INSTANCE;
                    String applicationDate = resultItemSubmit.getApplicationDate();
                    String applicationNo = resultItemSubmit.getApplicationNo();
                    Intrinsics.checkNotNull(applicationNo);
                    long j = Long.parseLong(applicationNo);
                    int i = Integer.parseInt(renewalOfDLActivity3.e2().k());
                    String dateofBirth = resultItemSubmit.getDateofBirth();
                    String dlno = resultItemSubmit.getDlno();
                    Intrinsics.checkNotNull(dlno);
                    String applicantGender = resultItemSubmit.getApplicantGender();
                    String mobile_no = renewalOfDLActivity3.getMobile_no();
                    Intrinsics.checkNotNull(mobile_no);
                    companion.a(renewalOfDLActivity3, "1234", "S", applicationDate, j, i, dateofBirth, dlno, "N", "N", applicantGender, mobile_no, false, renewalOfDLActivity3.getPurCode(), renewalOfDLActivity3.getLastEndorseRTOCode(), renewalOfDLActivity3.getLastEndorseStateCode());
                } catch (Exception unused) {
                }
                if (!Intrinsics.areEqual(renewalOfDLActivity3.y2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                    renewalOfDLActivity3.i3(new ArrayList());
                    renewalOfDLActivity3.g2().add(renewalOfDLActivity3.y2().k());
                }
                dLServiceAcknowlegementActivity.K2(renewalOfDLActivity3, resultItemSubmit, renewalOfDLActivity3.getLastEndorseRTOCode(), renewalOfDLActivity3.T1(), renewalOfDLActivity3.getDlNo(), renewalOfDLActivity3.getDob(), renewalOfDLActivity3.getMobile_no(), renewalOfDLActivity3.getLastEndorseRto(), renewalOfDLActivity3.getLastEndorseState(), renewalOfDLActivity3.getLastEndorseStateCode(), renewalOfDLActivity3.g2());
            } catch (Exception unused2) {
                RenewalOfDLActivity.this.R1().Q.c(false);
                RenewalOfDLActivity renewalOfDLActivity4 = RenewalOfDLActivity.this;
                renewalOfDLActivity4.O2(renewalOfDLActivity4.W1().b("service_is_not_present", RenewalOfDLActivity.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((DlRenewalSaveDto) obj);
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

        public final void invoke(String it) {
            wo1 wo1Var;
            wo1 wo1Var2;
            wo1 wo1Var3;
            wo1 wo1Var4;
            Intrinsics.checkNotNullParameter(it, "it");
            wo1 wo1Var5 = null;
            try {
                if (Intrinsics.areEqual(RenewalOfDLActivity.this.getState_value(), "same") && !Intrinsics.areEqual(RenewalOfDLActivity.this.getBioRecGenesis(), "S")) {
                    if (StringsKt__StringsJVMKt.equals(it, "yes", true)) {
                        RenewalOfDLActivity.this.R1().Q.c(true);
                        String string = StringsKt__StringsKt.trim((CharSequence) new Regex("[^A-Za-z0-9 ]").replace(RenewalOfDLActivity.this.T1().getDlobj().getDlLicno().toString(), "")).toString();
                        String string2 = RenewalOfDLActivity.this.getWhatServiceRequired().toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        if (StringsKt__StringsKt.contains$default((CharSequence) string2, (CharSequence) "537", false, 2, (Object) null)) {
                            RenewalValidation renewalValidationV2 = RenewalOfDLActivity.this.V2();
                            wo1 wo1Var6 = RenewalOfDLActivity.this.viewModel;
                            if (wo1Var6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            } else {
                                wo1Var5 = wo1Var6;
                            }
                            wo1Var5.o(renewalValidationV2);
                            return;
                        }
                        wo1 wo1Var7 = RenewalOfDLActivity.this.viewModel;
                        if (wo1Var7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            wo1Var4 = null;
                        } else {
                            wo1Var4 = wo1Var7;
                        }
                        String bioDob = RenewalOfDLActivity.this.T1().getBioObj().getBioDob();
                        String lastEndorseRTOCode = RenewalOfDLActivity.this.getLastEndorseRTOCode();
                        HashMap whatServiceRequired = RenewalOfDLActivity.this.getWhatServiceRequired();
                        String appCategory = RenewalOfDLActivity.this.getAppCategory();
                        String mobile_no = RenewalOfDLActivity.this.getMobile_no();
                        Intrinsics.checkNotNull(mobile_no);
                        wo1Var4.r(string, bioDob, lastEndorseRTOCode, whatServiceRequired, appCategory, mobile_no, RenewalOfDLActivity.this.y2().f(), RenewalOfDLActivity.this.y2().g(), RenewalOfDLActivity.this.y2().e(), RenewalOfDLActivity.this.y2().h());
                        return;
                    }
                    return;
                }
                if (Intrinsics.areEqual(RenewalOfDLActivity.this.getState_value(), "same") && Intrinsics.areEqual(RenewalOfDLActivity.this.getBioRecGenesis(), "S") && Intrinsics.areEqual(RenewalOfDLActivity.this.getAllowAddrChangeAtDlservReqst(), "Y")) {
                    RenewalOfDLActivity.this.R1().Q.c(true);
                    String string3 = RenewalOfDLActivity.this.getWhatServiceRequired().toString();
                    Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                    if (StringsKt__StringsKt.contains$default((CharSequence) string3, (CharSequence) "537", false, 2, (Object) null)) {
                        RenewalGenY renewalGenYT2 = RenewalOfDLActivity.this.T2();
                        wo1 wo1Var8 = RenewalOfDLActivity.this.viewModel;
                        if (wo1Var8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        } else {
                            wo1Var5 = wo1Var8;
                        }
                        wo1Var5.m(renewalGenYT2);
                        return;
                    }
                    wo1 wo1Var9 = RenewalOfDLActivity.this.viewModel;
                    if (wo1Var9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        wo1Var3 = null;
                    } else {
                        wo1Var3 = wo1Var9;
                    }
                    String string4 = StringsKt__StringsKt.trim((CharSequence) String.valueOf(RenewalOfDLActivity.this.getDlNo())).toString();
                    String dob = RenewalOfDLActivity.this.getDob();
                    Intrinsics.checkNotNull(dob);
                    String lastEndorseRTOCode2 = RenewalOfDLActivity.this.getLastEndorseRTOCode();
                    String perHouseNo = RenewalOfDLActivity.this.getPerHouseNo();
                    Intrinsics.checkNotNull(perHouseNo);
                    String perStreet = RenewalOfDLActivity.this.getPerStreet();
                    Intrinsics.checkNotNull(perStreet);
                    String perLocation = RenewalOfDLActivity.this.getPerLocation();
                    Intrinsics.checkNotNull(perLocation);
                    String permVillageOrTown = RenewalOfDLActivity.this.getPermVillageOrTown();
                    Intrinsics.checkNotNull(permVillageOrTown);
                    String perDistrict = RenewalOfDLActivity.this.getPerDistrict();
                    Intrinsics.checkNotNull(perDistrict);
                    String perSubDistrict = RenewalOfDLActivity.this.getPerSubDistrict();
                    Intrinsics.checkNotNull(perSubDistrict);
                    String perState = RenewalOfDLActivity.this.getPerState();
                    Intrinsics.checkNotNull(perState);
                    String perPinCode = RenewalOfDLActivity.this.getPerPinCode();
                    Intrinsics.checkNotNull(perPinCode);
                    String presHouseNo = RenewalOfDLActivity.this.getPresHouseNo();
                    Intrinsics.checkNotNull(presHouseNo);
                    String presStreet = RenewalOfDLActivity.this.getPresStreet();
                    Intrinsics.checkNotNull(presStreet);
                    String presLocation = RenewalOfDLActivity.this.getPresLocation();
                    Intrinsics.checkNotNull(presLocation);
                    String presVillageOrTown = RenewalOfDLActivity.this.getPresVillageOrTown();
                    Intrinsics.checkNotNull(presVillageOrTown);
                    String presSubDistrict = RenewalOfDLActivity.this.getPresSubDistrict();
                    Intrinsics.checkNotNull(presSubDistrict);
                    String presDistrict = RenewalOfDLActivity.this.getPresDistrict();
                    Intrinsics.checkNotNull(presDistrict);
                    String presState = RenewalOfDLActivity.this.getPresState();
                    Intrinsics.checkNotNull(presState);
                    String presPincode = RenewalOfDLActivity.this.getPresPincode();
                    Intrinsics.checkNotNull(presPincode);
                    String mobile_no2 = RenewalOfDLActivity.this.getMobile_no();
                    Intrinsics.checkNotNull(mobile_no2);
                    wo1Var3.p(string4, dob, lastEndorseRTOCode2, "NA", "N", perHouseNo, perStreet, perLocation, permVillageOrTown, perDistrict, perSubDistrict, perState, perPinCode, presHouseNo, presStreet, presLocation, presVillageOrTown, presSubDistrict, presDistrict, presState, presPincode, mobile_no2, "sarathiservice", "0.0.0.0", "d9fe1613399b0883e4ecf3f710e18317", "DelhTrans", "G", RenewalOfDLActivity.this.y2().f(), RenewalOfDLActivity.this.y2().e(), RenewalOfDLActivity.this.y2().g(), RenewalOfDLActivity.this.y2().h());
                    return;
                }
                if (Intrinsics.areEqual(RenewalOfDLActivity.this.getState_value(), "same") && Intrinsics.areEqual(RenewalOfDLActivity.this.getBioRecGenesis(), "S") && !Intrinsics.areEqual(RenewalOfDLActivity.this.getAllowAddrChangeAtDlservReqst(), "Y")) {
                    if (StringsKt__StringsJVMKt.equals(it, "yes", true)) {
                        RenewalOfDLActivity.this.R1().Q.c(true);
                        String string5 = StringsKt__StringsKt.trim((CharSequence) new Regex("[^A-Za-z0-9 ]").replace(RenewalOfDLActivity.this.T1().getDlobj().getDlLicno().toString(), "")).toString();
                        String string6 = RenewalOfDLActivity.this.getWhatServiceRequired().toString();
                        Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                        if (StringsKt__StringsKt.contains$default((CharSequence) string6, (CharSequence) "537", false, 2, (Object) null)) {
                            RenewalValidation renewalValidationV22 = RenewalOfDLActivity.this.V2();
                            wo1 wo1Var10 = RenewalOfDLActivity.this.viewModel;
                            if (wo1Var10 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            } else {
                                wo1Var5 = wo1Var10;
                            }
                            wo1Var5.o(renewalValidationV22);
                            return;
                        }
                        wo1 wo1Var11 = RenewalOfDLActivity.this.viewModel;
                        if (wo1Var11 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            wo1Var2 = null;
                        } else {
                            wo1Var2 = wo1Var11;
                        }
                        String bioDob2 = RenewalOfDLActivity.this.T1().getBioObj().getBioDob();
                        String lastEndorseRTOCode3 = RenewalOfDLActivity.this.getLastEndorseRTOCode();
                        HashMap whatServiceRequired2 = RenewalOfDLActivity.this.getWhatServiceRequired();
                        String appCategory2 = RenewalOfDLActivity.this.getAppCategory();
                        String mobile_no3 = RenewalOfDLActivity.this.getMobile_no();
                        Intrinsics.checkNotNull(mobile_no3);
                        wo1Var2.r(string5, bioDob2, lastEndorseRTOCode3, whatServiceRequired2, appCategory2, mobile_no3, RenewalOfDLActivity.this.y2().f(), RenewalOfDLActivity.this.y2().g(), RenewalOfDLActivity.this.y2().e(), RenewalOfDLActivity.this.y2().h());
                        return;
                    }
                    return;
                }
                RenewalOfDLActivity.this.R1().Q.c(true);
                String string7 = RenewalOfDLActivity.this.getWhatServiceRequired().toString();
                Intrinsics.checkNotNullExpressionValue(string7, "toString(...)");
                if (StringsKt__StringsKt.contains$default((CharSequence) string7, (CharSequence) "537", false, 2, (Object) null)) {
                    RenewalCoaValidation renewalCoaValidationU2 = RenewalOfDLActivity.this.U2();
                    wo1 wo1Var12 = RenewalOfDLActivity.this.viewModel;
                    if (wo1Var12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    } else {
                        wo1Var5 = wo1Var12;
                    }
                    wo1Var5.n(renewalCoaValidationU2);
                    return;
                }
                wo1 wo1Var13 = RenewalOfDLActivity.this.viewModel;
                if (wo1Var13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    wo1Var = null;
                } else {
                    wo1Var = wo1Var13;
                }
                String string8 = StringsKt__StringsKt.trim((CharSequence) String.valueOf(RenewalOfDLActivity.this.getDlNo())).toString();
                String dob2 = RenewalOfDLActivity.this.getDob();
                Intrinsics.checkNotNull(dob2);
                String lastEndorseRTOCode4 = RenewalOfDLActivity.this.getLastEndorseRTOCode();
                String perHouseNo2 = RenewalOfDLActivity.this.getPerHouseNo();
                Intrinsics.checkNotNull(perHouseNo2);
                String perStreet2 = RenewalOfDLActivity.this.getPerStreet();
                Intrinsics.checkNotNull(perStreet2);
                String perLocation2 = RenewalOfDLActivity.this.getPerLocation();
                Intrinsics.checkNotNull(perLocation2);
                String permVillageOrTown2 = RenewalOfDLActivity.this.getPermVillageOrTown();
                Intrinsics.checkNotNull(permVillageOrTown2);
                String perDistrict2 = RenewalOfDLActivity.this.getPerDistrict();
                Intrinsics.checkNotNull(perDistrict2);
                String perSubDistrict2 = RenewalOfDLActivity.this.getPerSubDistrict();
                Intrinsics.checkNotNull(perSubDistrict2);
                String perState2 = RenewalOfDLActivity.this.getPerState();
                Intrinsics.checkNotNull(perState2);
                String perPinCode2 = RenewalOfDLActivity.this.getPerPinCode();
                Intrinsics.checkNotNull(perPinCode2);
                String presHouseNo2 = RenewalOfDLActivity.this.getPresHouseNo();
                Intrinsics.checkNotNull(presHouseNo2);
                String presStreet2 = RenewalOfDLActivity.this.getPresStreet();
                Intrinsics.checkNotNull(presStreet2);
                String presLocation2 = RenewalOfDLActivity.this.getPresLocation();
                Intrinsics.checkNotNull(presLocation2);
                String presVillageOrTown2 = RenewalOfDLActivity.this.getPresVillageOrTown();
                Intrinsics.checkNotNull(presVillageOrTown2);
                String presSubDistrict2 = RenewalOfDLActivity.this.getPresSubDistrict();
                Intrinsics.checkNotNull(presSubDistrict2);
                String presDistrict2 = RenewalOfDLActivity.this.getPresDistrict();
                Intrinsics.checkNotNull(presDistrict2);
                String presState2 = RenewalOfDLActivity.this.getPresState();
                Intrinsics.checkNotNull(presState2);
                String presPincode2 = RenewalOfDLActivity.this.getPresPincode();
                Intrinsics.checkNotNull(presPincode2);
                String mobile_no4 = RenewalOfDLActivity.this.getMobile_no();
                Intrinsics.checkNotNull(mobile_no4);
                wo1Var.q(string8, dob2, lastEndorseRTOCode4, "NA", "N", perHouseNo2, perStreet2, perLocation2, permVillageOrTown2, perDistrict2, perSubDistrict2, perState2, perPinCode2, presHouseNo2, presStreet2, presLocation2, presVillageOrTown2, presSubDistrict2, presDistrict2, presState2, presPincode2, mobile_no4, "sarathiservice", "0.0.0.0", "d9fe1613399b0883e4ecf3f710e18317", "DelhTrans", "G", RenewalOfDLActivity.this.y2().f(), RenewalOfDLActivity.this.y2().e(), RenewalOfDLActivity.this.y2().g(), RenewalOfDLActivity.this.y2().h());
            } catch (Exception unused) {
            }
        }
    }

    public static final class i implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public i(Function1 function) {
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

    private final void B2() {
        f3(RenCOAInterface.INSTANCE.a(this));
        j3(new wl5(this));
        View viewFindViewById = findViewById(R.id.ll_home);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        c3((LinearLayout) viewFindViewById);
        this.viewModel = (wo1) new z(this).a(wo1.class);
        wo1 wo1Var = null;
        if (getIntent() != null) {
            try {
                this.bioRecGenesis = String.valueOf(getIntent().getStringExtra("bioRecGenesis"));
                this.allowAddrChangeAtDlservReqst = String.valueOf(getIntent().getStringExtra("allowAddrChangeAtDlservReqst"));
                this.dlNo = String.valueOf(getIntent().getStringExtra("DL"));
                this.dob = String.valueOf(getIntent().getStringExtra("dob"));
                this.Mobile_no = String.valueOf(getIntent().getStringExtra("Mobile_no"));
                Serializable serializableExtra = getIntent().getSerializableExtra("DLDetails");
                Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
                Z2((DldetobjX) serializableExtra);
                String stringExtra = getIntent().getStringExtra("purCode");
                Intrinsics.checkNotNull(stringExtra, "null cannot be cast to non-null type kotlin.String");
                this.purCode = stringExtra;
                String stringExtra2 = getIntent().getStringExtra("lastEndorsedRTO");
                Intrinsics.checkNotNull(stringExtra2, "null cannot be cast to non-null type kotlin.String");
                this.lastEndorseRto = stringExtra2;
                String stringExtra3 = getIntent().getStringExtra("lastEndorsedState");
                Intrinsics.checkNotNull(stringExtra3, "null cannot be cast to non-null type kotlin.String");
                this.lastEndorseState = stringExtra3;
                String stringExtra4 = getIntent().getStringExtra("lastEndorseStateCode");
                Intrinsics.checkNotNull(stringExtra4, "null cannot be cast to non-null type kotlin.String");
                this.lastEndorseStateCode = stringExtra4;
                String stringExtra5 = getIntent().getStringExtra("lastEndorsedRTOCode");
                Intrinsics.checkNotNull(stringExtra5, "null cannot be cast to non-null type kotlin.String");
                this.lastEndorseRTOCode = stringExtra5;
                String stringExtra6 = getIntent().getStringExtra("state_value");
                Intrinsics.checkNotNull(stringExtra6, "null cannot be cast to non-null type kotlin.String");
                this.state_value = stringExtra6;
                String str = this.lastEndorseState;
                if (str == null || str.length() == 0 || Intrinsics.areEqual(this.lastEndorseState, "")) {
                    R1().P.setText(y2().n());
                } else {
                    R1().P.setText(this.lastEndorseState);
                }
                String str2 = this.lastEndorseRto;
                if (str2 == null || str2.length() == 0 || Intrinsics.areEqual(this.lastEndorseRto, "")) {
                    R1().K.setText("NA");
                } else {
                    R1().K.setText(this.lastEndorseRto);
                }
                this.rto_cd = this.lastEndorseRTOCode;
                Serializable serializableExtra2 = getIntent().getSerializableExtra("whatServiceRequired");
                Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type java.util.HashMap<kotlin.String?, kotlin.String?>");
                this.whatServiceRequired = (HashMap) serializableExtra2;
                R1().y.setText(W1().b("dl_no", "DL No. : ") + ' ' + this.dlNo);
                if (!Intrinsics.areEqual(this.state_value, "same") || StringsKt__StringsJVMKt.equals(this.bioRecGenesis, "S", true)) {
                    this.presHouseNo = String.valueOf(getIntent().getStringExtra("presHouseNo"));
                    this.presStreet = String.valueOf(getIntent().getStringExtra("presStreet"));
                    this.presLocation = String.valueOf(getIntent().getStringExtra("presLocation"));
                    this.presVillageOrTown = String.valueOf(getIntent().getStringExtra("presVillageOrTown"));
                    this.presSubDistrict = String.valueOf(getIntent().getStringExtra("presSubDistrict"));
                    this.presDistrict = String.valueOf(getIntent().getStringExtra("presDistrict"));
                    this.presState = String.valueOf(getIntent().getStringExtra("presState"));
                    this.presPincode = String.valueOf(getIntent().getStringExtra("presPincode"));
                    this.perHouseNo = String.valueOf(getIntent().getStringExtra("perHouseNo"));
                    this.perStreet = String.valueOf(getIntent().getStringExtra("perStreet"));
                    this.perLocation = String.valueOf(getIntent().getStringExtra("perLocation"));
                    this.permVillageOrTown = String.valueOf(getIntent().getStringExtra("permVillageOrTown"));
                    this.perSubDistrict = String.valueOf(getIntent().getStringExtra("perSubDistrict"));
                    this.perDistrict = String.valueOf(getIntent().getStringExtra("perDistrict"));
                    this.perState = String.valueOf(getIntent().getStringExtra("perState"));
                    this.perPinCode = String.valueOf(getIntent().getStringExtra("perPinCode"));
                }
                BioImgObjX bioImgObj = T1().getBioImgObj();
                String biPhoto = bioImgObj != null ? bioImgObj.getBiPhoto() : null;
                if (biPhoto == null || biPhoto.length() == 0) {
                    R1().D.f.setVisibility(4);
                } else {
                    R1().D.f.setVisibility(0);
                    ImageView imageView = R1().D.b;
                    BioImgObjX bioImgObj2 = T1().getBioImgObj();
                    imageView.setImageBitmap(kt6.a(bioImgObj2 != null ? bioImgObj2.getBiPhoto() : null));
                }
            } catch (Exception unused) {
            }
        }
        R1().E.h.setText(StringsKt__StringsKt.trim((CharSequence) String.valueOf(this.dlNo)).toString());
        R1().E.h.setPaintFlags(R1().E.h.getPaintFlags() | 8);
        if (Intrinsics.areEqual(y2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                this.serialNo = getIntent().getIntExtra("serialNo", 0);
                Serializable serializableExtra3 = getIntent().getSerializableExtra("multiList");
                Intrinsics.checkNotNull(serializableExtra3, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                i3((ArrayList) serializableExtra3);
                Serializable serializableExtra4 = getIntent().getSerializableExtra("listHeaderSteps");
                Intrinsics.checkNotNull(serializableExtra4, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                b3((ArrayList) serializableExtra4);
                Serializable serializableExtra5 = getIntent().getSerializableExtra("COA");
                Intrinsics.checkNotNull(serializableExtra5, "null cannot be cast to non-null type kotlin.Boolean");
                this.COA = ((Boolean) serializableExtra5).booleanValue();
                String stringExtra7 = getIntent().getStringExtra("metaflag");
                Intrinsics.checkNotNull(stringExtra7, "null cannot be cast to non-null type kotlin.String");
                this.metaflag = stringExtra7;
                d3(CombineServiceInterface.INSTANCE.a(this));
                this.mCombineViewModel = (fs0) new z(this, new ds0(new cs0(c2()))).a(fs0.class);
                if (Build.VERSION.SDK_INT >= 30) {
                    WindowMetrics maximumWindowMetrics = getWindowManager().getMaximumWindowMetrics();
                    Intrinsics.checkNotNullExpressionValue(maximumWindowMetrics, "getMaximumWindowMetrics(...)");
                    Rect bounds = maximumWindowMetrics.getBounds();
                    Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
                    this.widthPixels = bounds.right;
                } else {
                    this.widthPixels = getResources().getDisplayMetrics().widthPixels;
                }
                if (Intrinsics.areEqual(y2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                    try {
                        if (b2().size() > 1) {
                            R1().F.setLayoutManager(new LinearLayoutManager(this, 0, false));
                            if (b2().contains("Re-Validation of Expired DL")) {
                                ArrayList arrayListB2 = b2();
                                int i2 = this.serialNo;
                                int i3 = this.widthPixels;
                                String strB = W1().b("revalidtion_expired_dl", "Re-Validation of Expired DL");
                                Intrinsics.checkNotNull(strB);
                                R1().F.setAdapter(new k76(arrayListB2, this, i2, i3, strB));
                            } else {
                                R1().F.setAdapter(new k76(b2(), this, this.serialNo, this.widthPixels, "Renewal of DL"));
                            }
                        }
                    } catch (Exception unused2) {
                    }
                }
                if (this.serialNo == g2().size()) {
                    R1().Q.setText(W1().b("vahan_btn_submit", "Submit"));
                    R1().b0.setVisibility(0);
                    R1().w.setVisibility(0);
                } else {
                    R1().b0.setVisibility(8);
                    R1().w.setVisibility(8);
                    R1().Q.setText(W1().b("btn_dl_serv_next", "Next"));
                }
            } catch (Exception unused3) {
            }
        }
        if (Intrinsics.areEqual(y2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                if (b2().size() == 1) {
                    R1().E.g.setText((CharSequence) b2().get(0));
                } else {
                    TextView textView = R1().E.g;
                    String strB2 = W1().b("dl_services", getString(R.string.dl_services));
                    Intrinsics.checkNotNull(strB2);
                    textView.setText(strB2);
                    R1().E.f.setVisibility(8);
                    R1().E.g.setPaintFlags(R1().E.g.getPaintFlags() | 8);
                }
            } catch (Exception unused4) {
            }
        } else {
            String string = this.whatServiceRequired.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            if (StringsKt__StringsKt.contains$default((CharSequence) string, (CharSequence) "537", false, 2, (Object) null)) {
                R1().E.g.setText(W1().b("revalidtion_expired_dl", "Re-Validation of Expired DL"));
            } else {
                R1().E.g.setText(W1().b("check_dl_serv_renewal_dl", "Renewal of DL"));
            }
        }
        g3((com.nic.mparivahan.dlservices.RenewalCOA.a) new z(this, new i85(new j85(d2()))).a(com.nic.mparivahan.dlservices.RenewalCOA.a.class));
        wo1 wo1Var2 = this.viewModel;
        if (wo1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            wo1Var2 = null;
        }
        wo1Var2.h().g(this, new i(new b()));
        wo1 wo1Var3 = this.viewModel;
        if (wo1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            wo1Var3 = null;
        }
        wo1Var3.j().g(this, new i(new c()));
        wo1 wo1Var4 = this.viewModel;
        if (wo1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            wo1Var4 = null;
        }
        wo1Var4.i().g(this, new i(new d()));
        wo1 wo1Var5 = this.viewModel;
        if (wo1Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            wo1Var5 = null;
        }
        wo1Var5.k().g(this, new i(new e()));
        wo1 wo1Var6 = this.viewModel;
        if (wo1Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            wo1Var = wo1Var6;
        }
        wo1Var.l().g(this, new i(new f()));
        R1().E.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.d95
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RenewalOfDLActivity.C2(this.a, view);
            }
        });
        R1().E.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.e95
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RenewalOfDLActivity.F2(this.a, view);
            }
        });
    }

    public static final void C2(RenewalOfDLActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(this$0.y2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                if (this$0.b2().size() > 1) {
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
                    textView.setText(this$0.W1().b("btn_ok", "OK"));
                    ((TextView) viewFindViewById5).setText(this$0.W1().b("title_dl_services", "Driving Licence Services"));
                    ((ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.g95
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            RenewalOfDLActivity.D2(dialog, view2);
                        }
                    });
                    int size = this$0.b2().size();
                    String str = "";
                    int i2 = 0;
                    String string = "";
                    while (i2 < size) {
                        str = str + ((String) this$0.b2().get(i2)) + '\n';
                        StringBuilder sb = new StringBuilder();
                        sb.append(string);
                        i2++;
                        sb.append(i2);
                        sb.append(".\n");
                        string = sb.toString();
                    }
                    textView2.setText(str);
                    textView3.setText(string);
                    textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.h95
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            RenewalOfDLActivity.E2(dialog, view2);
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

    public static final void D2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void E2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void F2(RenewalOfDLActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) DlServiceDetailsActivity.class);
            intent.putExtra("DL", this$0.dlNo);
            intent.putExtra("dob", this$0.dob);
            intent.putExtra("DLDetails", this$0.T1());
            intent.putExtra("Mobile_no", this$0.Mobile_no);
            intent.putExtra("lastEndorsedRTO", this$0.lastEndorseRto);
            intent.putExtra("lastEndorsedState", this$0.lastEndorseState);
            intent.putExtra("lastEndorsedRTOCode", this$0.lastEndorseRTOCode);
            intent.putExtra("lastEndorseStateCode", this$0.lastEndorseStateCode);
            intent.putExtra("whatServiceRequired", this$0.whatServiceRequired);
            if (Intrinsics.areEqual(this$0.y2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", this$0.g2());
            }
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void G2(Intent intent, String lastEndRTO, String lastEndState, String purCode, ArrayList multiList) {
        try {
            intent.putExtra("DL", this.dlNo);
            intent.putExtra("dob", this.dob);
            intent.putExtra("DLDetails", T1());
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
            intent.putExtra("listHeaderSteps", b2());
            intent.putExtra("serialNo", this.serialNo + 1);
            intent.putExtra("COA", this.COA);
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void H2() {
        R1().Q.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.a95
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RenewalOfDLActivity.I2(this.a, view);
            }
        });
        wo1 wo1Var = this.viewModel;
        if (wo1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            wo1Var = null;
        }
        wo1Var.g().g(this, new i(new g()));
    }

    public static final void I2(RenewalOfDLActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(this$0.y2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            this$0.W2();
        } else if (Intrinsics.areEqual(this$0.appCategory, "0")) {
            this$0.O2(this$0.W1().b("select_app_cat", this$0.getString(R.string.sel_app_category)));
        } else {
            this$0.S2();
        }
    }

    private final void J2() {
        fs0 fs0Var = this.mCombineViewModel;
        fs0 fs0Var2 = null;
        if (fs0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCombineViewModel");
            fs0Var = null;
        }
        fs0Var.i().g(this, new mf4() { // from class: com.zepto.b95
            @Override // com.zepto.mf4
            public final void a(Object obj) throws Throwable {
                RenewalOfDLActivity.K2(this.a, (GetAckDetForGivenDLNumberResponse) obj);
            }
        });
        fs0 fs0Var3 = this.mCombineViewModel;
        if (fs0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCombineViewModel");
        } else {
            fs0Var2 = fs0Var3;
        }
        fs0Var2.h().g(this, new mf4() { // from class: com.zepto.c95
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                RenewalOfDLActivity.L2(this.a, (String) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 23, insn: 0x0247: MOVE (r3 I:??[OBJECT, ARRAY]) = (r23 I:??[OBJECT, ARRAY]), block:B:55:0x0247 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v4 */
    public static final void K2(RenewalOfDLActivity this$0, GetAckDetForGivenDLNumberResponse getAckDetForGivenDLNumberResponse) throws Throwable {
        int i2;
        String str;
        String str2;
        List<ResultItemSubmit> result;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.R1().Q.c(false);
        RenewalOfDLActivity renewalOfDLActivity = 2132019422;
        try {
            DlSubmitResult dlSubmitresult = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
            try {
                if (StringsKt__StringsJVMKt.equals$default(dlSubmitresult != null ? dlSubmitresult.getStatusCode() : null, VContant.MULTISERVICE_PURPOSE_CODE, false, 2, null)) {
                    try {
                        DlSubmitResult dlSubmitresult2 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                        if (dlSubmitresult2 == null || (result = dlSubmitresult2.getResult()) == null || !(!result.isEmpty())) {
                            return;
                        }
                        DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity = new DLServiceAcknowlegementActivity();
                        ResultItemSubmit resultItemSubmit = getAckDetForGivenDLNumberResponse.getDlSubmitresult().getResult().get(0);
                        if (resultItemSubmit != null) {
                            String str3 = "";
                            if (CollectionsKt___CollectionsKt.contains(this$0.g2(), this$0.W1().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                                str3 = "513,";
                            }
                            if (CollectionsKt___CollectionsKt.contains(this$0.g2(), this$0.W1().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                                str3 = str3 + "514,";
                            }
                            if (CollectionsKt___CollectionsKt.contains(this$0.g2(), this$0.W1().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                                str3 = str3 + "537,";
                            }
                            if (CollectionsKt___CollectionsKt.contains(this$0.g2(), this$0.W1().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                                str3 = str3 + "515,";
                            }
                            if (CollectionsKt___CollectionsKt.contains(this$0.g2(), this$0.W1().b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                                str3 = str3 + "516,";
                            }
                            if (CollectionsKt___CollectionsKt.contains(this$0.g2(), this$0.W1().b("check_dl_serv_extract_dl", "DL Extract"))) {
                                str3 = str3 + "523,";
                            }
                            if (CollectionsKt___CollectionsKt.contains(this$0.g2(), this$0.W1().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                                str3 = str3 + "524,";
                            }
                            if (CollectionsKt___CollectionsKt.contains(this$0.g2(), this$0.W1().b("change_name_dl", "Change of Name in DL"))) {
                                str3 = str3 + "526,";
                            }
                            if (CollectionsKt___CollectionsKt.contains(this$0.g2(), this$0.W1().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                                str3 = str3 + "548";
                            }
                            String str4 = str3;
                            try {
                                DlLogCapture.Companion companion = DlLogCapture.INSTANCE;
                                String applicationDate = resultItemSubmit.getApplicationDate();
                                String applicationNo = resultItemSubmit.getApplicationNo();
                                Intrinsics.checkNotNull(applicationNo);
                                long j = Long.parseLong(applicationNo);
                                int i3 = Integer.parseInt(this$0.e2().k());
                                String dateofBirth = resultItemSubmit.getDateofBirth();
                                String dlno = resultItemSubmit.getDlno();
                                Intrinsics.checkNotNull(dlno);
                                String applicantGender = resultItemSubmit.getApplicantGender();
                                String str5 = this$0.Mobile_no;
                                Intrinsics.checkNotNull(str5);
                                try {
                                    try {
                                        companion.a(this$0, "1234", "S", applicationDate, j, i3, dateofBirth, dlno, "N", "N", applicantGender, str5, false, str4, this$0.lastEndorseRTOCode, this$0.lastEndorseStateCode);
                                    } catch (Exception unused) {
                                    }
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                            }
                            dLServiceAcknowlegementActivity.K2(this$0, resultItemSubmit, this$0.lastEndorseRTOCode, this$0.T1(), this$0.dlNo, this$0.dob, this$0.Mobile_no, this$0.lastEndorseRto, this$0.lastEndorseState, this$0.lastEndorseStateCode, this$0.b2());
                            return;
                        }
                        return;
                    } catch (Exception unused4) {
                        renewalOfDLActivity = this$0;
                        str = "service_is_not_present";
                        i2 = R.string.unable_to_get_details;
                        this$0.R1().Q.c(false);
                        renewalOfDLActivity.O2(this$0.W1().b(str, renewalOfDLActivity.getString(i2)));
                    }
                }
                renewalOfDLActivity = this$0;
                DlSubmitResult dlSubmitresult3 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                String reqStatus = dlSubmitresult3 != null ? dlSubmitresult3.getReqStatus() : null;
                if (reqStatus != null && reqStatus.length() != 0) {
                    DlSubmitResult dlSubmitresult4 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                    String reqStatus2 = dlSubmitresult4 != null ? dlSubmitresult4.getReqStatus() : null;
                    Intrinsics.checkNotNull(reqStatus2);
                    renewalOfDLActivity.O2(reqStatus2);
                    return;
                }
                wa3 wa3VarW1 = this$0.W1();
                i2 = R.string.unable_to_get_details;
                try {
                    str = "service_is_not_present";
                    try {
                        renewalOfDLActivity.O2(wa3VarW1.b(str, renewalOfDLActivity.getString(R.string.unable_to_get_details)));
                        return;
                    } catch (Exception unused5) {
                    }
                } catch (Exception unused6) {
                    str = "service_is_not_present";
                }
            } catch (Exception unused7) {
                str = str2;
            }
        } catch (Exception unused8) {
            i2 = R.string.unable_to_get_details;
            str = "service_is_not_present";
            renewalOfDLActivity = this$0;
        }
        this$0.R1().Q.c(false);
        renewalOfDLActivity.O2(this$0.W1().b(str, renewalOfDLActivity.getString(i2)));
    }

    public static final void L2(RenewalOfDLActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.R1().Q.c(false);
        this$0.O2(this$0.W1().b("service_is_not_present", this$0.getString(R.string.unable_to_get_details)));
    }

    public static final void M2(RenewalOfDLActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) DlServiceDetailsActivity.class);
        intent.putExtra("DL", this$0.dlNo);
        intent.putExtra("dob", this$0.dob);
        intent.putExtra("DLDetails", this$0.T1());
        intent.putExtra("Mobile_no", this$0.Mobile_no);
        intent.putExtra("lastEndorsedRTO", this$0.lastEndorseRto);
        intent.putExtra("lastEndorsedState", this$0.lastEndorseState);
        intent.putExtra("lastEndorsedRTOCode", this$0.lastEndorseRTOCode);
        intent.putExtra("lastEndorseStateCode", this$0.lastEndorseStateCode);
        intent.putExtra("whatServiceRequired", this$0.whatServiceRequired);
        this$0.startActivity(intent);
    }

    public static final void N2(RenewalOfDLActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.ArrayList] */
    private final void O1() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? arrayList = new ArrayList();
        objectRef.element = arrayList;
        arrayList.add(0, new AppCatPojo("0", "Select Category"));
        ((ArrayList) objectRef.element).add(1, new AppCatPojo("G", "General"));
        ((ArrayList) objectRef.element).add(2, new AppCatPojo("R", "Repatriate"));
        ((ArrayList) objectRef.element).add(3, new AppCatPojo("T", "Refugees"));
        ((ArrayList) objectRef.element).add(4, new AppCatPojo("X", "Ex-Servicemen"));
        ((ArrayList) objectRef.element).add(5, new AppCatPojo("F", "Foreigners (Not Diplomats)"));
        ((ArrayList) objectRef.element).add(6, new AppCatPojo("D", "Diplomats (Foreigner)"));
        ((ArrayList) objectRef.element).add(7, new AppCatPojo("O", "OCI"));
        ((ArrayList) objectRef.element).add(8, new AppCatPojo("P", "Differently Abled"));
        R1().O.setAdapter((SpinnerAdapter) new oq(this, (ArrayList) objectRef.element));
        int size = ((ArrayList) objectRef.element).size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) y2().a()).toString(), StringsKt__StringsKt.trim((CharSequence) ((AppCatPojo) ((ArrayList) objectRef.element).get(i2)).getAppCode()).toString())) {
                R1().O.setSelection(i2);
                break;
            }
            i2++;
        }
        R1().O.setOnItemSelectedListener(new a(objectRef));
        if (StringsKt__StringsJVMKt.equals$default(this.bioRecGenesis, "S", false, 2, null)) {
            R1().O.setEnabled(true);
        } else {
            R1().O.setEnabled(Intrinsics.areEqual(this.appCategory, "0"));
        }
    }

    public static final void P2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q2(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.y85
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RenewalOfDLActivity.R2(dialog, view);
            }
        });
        dialog.show();
    }

    public static final void R2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void W2() {
        if (Intrinsics.areEqual(this.appCategory, "0")) {
            TextView txtAppCategory = R1().b0;
            Intrinsics.checkNotNullExpressionValue(txtAppCategory, "txtAppCategory");
            if (txtAppCategory.getVisibility() == 0) {
                O2(getString(R.string.sel_app_category));
                return;
            }
        }
        try {
            if (g2().size() > this.serialNo) {
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
                combineReq2.setApplcatgDLserReq(combineReq.getApplcatgDLserReq());
                combineReq2.setDleDlReasonCode(combineReq.getDleDlReasonCode());
                combineReq2.setDleDlReasonName(combineReq.getDleDlReasonName());
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
                combineReq2.setDeclaringcheck(combineReq.getDeclaringcheck());
                combineReq2.setHillcertificate(combineReq.getHillcertificate());
                combineReq2.setHillissueDate(combineReq.getHillissueDate());
                combineReq2.setHillvalidFrom(combineReq.getHillvalidFrom());
                combineReq2.setHillvalidTo(combineReq.getHillvalidTo());
                combineReq2.setHilldrivingschool(combineReq.getHilldrivingschool());
                combineReq2.setHillissby(combineReq.getHillissby());
                combineReq2.setDupDlReasonName(combineReq.getDupDlReasonName());
                combineReq2.setDupDlReasonCode(combineReq.getDupDlReasonCode());
                combineReq2.setWilltoDonateOrgans(combineReq.getWilltoDonateOrgans());
                combineReq2.setDlHolderAltMobMum(combineReq.getDlHolderAltMobMum());
                SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit();
                editorEdit.putString("MultiService", new Gson().toJson(combineReq2));
                editorEdit.commit();
                if (Intrinsics.areEqual(g2().get(this.serialNo), W1().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                    setIntent(new Intent(this, (Class<?>) DLDuplicateActivity.class));
                    Intent intent = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                    G2(intent, this.lastEndorseRTOCode, this.lastEndorseState, "513", g2());
                    return;
                }
                if (Intrinsics.areEqual(g2().get(this.serialNo), W1().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                    setIntent(new Intent(this, (Class<?>) RenewalOfDLActivity.class));
                    Intent intent2 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
                    G2(intent2, this.lastEndorseRTOCode, this.lastEndorseState, "514", g2());
                    return;
                }
                if (Intrinsics.areEqual(g2().get(this.serialNo), W1().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                    setIntent(new Intent(this, (Class<?>) RenewalOfDLActivity.class));
                    Intent intent3 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent3, "getIntent(...)");
                    G2(intent3, this.lastEndorseRTOCode, this.lastEndorseState, "537", g2());
                    return;
                }
                if (Intrinsics.areEqual(g2().get(this.serialNo), W1().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                    setIntent(new Intent(this, (Class<?>) ChangeOfAddressActivity.class));
                    Intent intent4 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent4, "getIntent(...)");
                    G2(intent4, this.lastEndorseRTOCode, this.lastEndorseState, "515", g2());
                    return;
                }
                if (Intrinsics.areEqual(g2().get(this.serialNo), W1().b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                    setIntent(new Intent(this, (Class<?>) DLReplecementActivity.class));
                    Intent intent5 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent5, "getIntent(...)");
                    G2(intent5, this.lastEndorseRTOCode, this.lastEndorseState, "516", g2());
                    return;
                }
                if (Intrinsics.areEqual(g2().get(this.serialNo), W1().b("check_dl_serv_extract_dl", "DL Extract"))) {
                    setIntent(new Intent(this, (Class<?>) DLExtractActivity.class));
                    Intent intent6 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent6, "getIntent(...)");
                    G2(intent6, this.lastEndorseRTOCode, this.lastEndorseState, "523", g2());
                    return;
                }
                if (Intrinsics.areEqual(g2().get(this.serialNo), W1().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                    setIntent(new Intent(this, (Class<?>) HillReligion.class));
                    Intent intent7 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent7, "getIntent(...)");
                    G2(intent7, this.lastEndorseRTOCode, this.lastEndorseState, "524", g2());
                    return;
                }
                if (Intrinsics.areEqual(g2().get(this.serialNo), W1().b("change_name_dl", "Change of Name in DL"))) {
                    setIntent(new Intent(this, (Class<?>) ChangeOfName.class));
                    Intent intent8 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent8, "getIntent(...)");
                    G2(intent8, this.lastEndorseRTOCode, this.lastEndorseState, "526", g2());
                    return;
                }
                if (Intrinsics.areEqual(g2().get(this.serialNo), W1().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                    setIntent(new Intent(this, (Class<?>) DobChangeActivity.class));
                    Intent intent9 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent9, "getIntent(...)");
                    G2(intent9, this.lastEndorseRTOCode, this.lastEndorseState, "548", g2());
                    return;
                }
                return;
            }
            if (!com.nic.mparivahan.a.a.a(this)) {
                Toast.makeText(getApplicationContext(), W1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
                return;
            }
            String string = StringsKt__StringsKt.trim((CharSequence) new Regex("[^A-Za-z0-9 ]").replace(T1().getDlobj().getDlLicno(), "")).toString();
            CombineReq combineReq3 = (CombineReq) new Gson().fromJson(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getString("MultiService", ""), CombineReq.class);
            R1().Q.c(true);
            ArrayList arrayList = new ArrayList();
            int size = T1().getDlcovs().size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(String.valueOf(T1().getDlcovs().get(i2).getDcCovcd()));
            }
            fs0 fs0Var = this.mCombineViewModel;
            if (fs0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCombineViewModel");
                fs0Var = null;
            }
            fs0 fs0Var2 = fs0Var;
            boolean z = this.COA;
            String str = this.bioRecGenesis;
            Intrinsics.checkNotNull(str);
            String str2 = this.allowAddrChangeAtDlservReqst;
            Intrinsics.checkNotNull(str2);
            ArrayList arrayListG2 = g2();
            String str3 = this.appCategory;
            String dlHolderAltMobMum = combineReq3.getDlHolderAltMobMum();
            Intrinsics.checkNotNull(dlHolderAltMobMum);
            Intrinsics.checkNotNull(string);
            String bioDob = T1().getBioObj().getBioDob();
            Intrinsics.checkNotNull(bioDob);
            String str4 = this.lastEndorseRTOCode;
            String willtoDonateOrgans = combineReq3.getWilltoDonateOrgans();
            Intrinsics.checkNotNull(willtoDonateOrgans);
            String relationType = combineReq3.getRelationType();
            Intrinsics.checkNotNull(relationType);
            String strValueOf = String.valueOf(combineReq3.getConDlReasonCode());
            Intrinsics.checkNotNull(strValueOf);
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
            String str5 = this.Mobile_no;
            Intrinsics.checkNotNull(str5);
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
            String declaringcheck = combineReq3.getDeclaringcheck();
            Intrinsics.checkNotNull(declaringcheck);
            String hillcertificate = combineReq3.getHillcertificate();
            Intrinsics.checkNotNull(hillcertificate);
            String hillissueDate = combineReq3.getHillissueDate();
            Intrinsics.checkNotNull(hillissueDate);
            String hillvalidFrom = combineReq3.getHillvalidFrom();
            Intrinsics.checkNotNull(hillvalidFrom);
            String hillvalidTo = combineReq3.getHillvalidTo();
            Intrinsics.checkNotNull(hillvalidTo);
            String hilldrivingschool = combineReq3.getHilldrivingschool();
            Intrinsics.checkNotNull(hilldrivingschool);
            String hillissby = combineReq3.getHillissby();
            Intrinsics.checkNotNull(hillissby);
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
            fs0Var2.g(z, arrayList, str, str2, arrayListG2, "mobSARATHI", "657d1c758e2e95af0014e16f5109f933", "10.248.210.8", "sarathiservice", str3, dlHolderAltMobMum, string, bioDob, str4, willtoDonateOrgans, relationType, strValueOf, conDlReasonName, dlHolderNaturalName, conEffdate, applFirstName, applLastName, relFirstName, relLastName, str5, changeOfAddReq, perHouseNo, perStreet, perLocation, permVillageOrTown, perSubDistrict, perDistrict, perState, perPinCode, presHouseNo, presStreet, presLocation, presVillageOrTown, presSubDistrict, presDistrict, presState, presPincode, dleDlReasonCode, dleDlReasonName, dupDlReasonName, dupDlReasonCode, applDateOfBirth, codobDlReasonName, codobDlReasonCode, declaringcheck, hillcertificate, hillissueDate, hillvalidFrom, hillvalidTo, hilldrivingschool, hillissby, pofbirth, country, passno, passvaltill, visano, visavaltill, tovisit, iscountryrestricted, countryRestrictedReason, strIsDlSerdisqualified, dlSerdisqualifiedReason, forAdd1, forAdd2, forAdd3, forAddPinCode, forNationMobNum, emailID, appliedIdpfromIndEmb, indEmbName, embPlace, dateOfVerifEmb, embEndorseNo, idpcountryapplyfrom, y2().f(), y2().g(), y2().e(), y2().h());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: A2, reason: from getter */
    public final HashMap getWhatServiceRequired() {
        return this.whatServiceRequired;
    }

    public final void O2(String message) {
        try {
            final Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.msg_dialog);
            Window window = dialog.getWindow();
            Intrinsics.checkNotNull(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
            View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
            Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) viewFindViewById).setText(message);
            ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.f95
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RenewalOfDLActivity.P2(dialog, view);
                }
            });
            dialog.show();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: P1, reason: from getter */
    public final String getAllowAddrChangeAtDlservReqst() {
        return this.allowAddrChangeAtDlservReqst;
    }

    /* JADX INFO: renamed from: Q1, reason: from getter */
    public final String getAppCategory() {
        return this.appCategory;
    }

    public final ba R1() {
        ba baVar = this.binding;
        if (baVar != null) {
            return baVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    /* JADX INFO: renamed from: S1, reason: from getter */
    public final String getBioRecGenesis() {
        return this.bioRecGenesis;
    }

    public final void S2() {
        String strB = W1().b("nex_parivahan", getString(R.string.app_name));
        Intrinsics.checkNotNull(strB);
        String strB2 = W1().b("label_want_to_proceed", getString(R.string.are_you_want_to_proceed));
        Intrinsics.checkNotNull(strB2);
        o40.q1(this, strB, strB2, 0, null, null, new h(), 24, null);
    }

    public final DldetobjX T1() {
        DldetobjX dldetobjX = this.dlDetails;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlDetails");
        return null;
    }

    public final RenewalGenY T2() {
        SelectRenewalDLlist selectRenewalDLlist = new SelectRenewalDLlist("Re-Validation of Expired DL");
        ArrayList arrayList = new ArrayList();
        int size = T1().getDlcovs().size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(String.valueOf(T1().getDlcovs().get(i2).getDcCovcd()));
        }
        String string = StringsKt__StringsKt.trim((CharSequence) T1().getDlobj().getDlLicno()).toString();
        String bioDob = T1().getBioObj().getBioDob();
        String string2 = StringsKt__StringsKt.trim((CharSequence) this.lastEndorseRTOCode).toString();
        String str = this.Mobile_no;
        Intrinsics.checkNotNull(str);
        String str2 = this.perHouseNo;
        Intrinsics.checkNotNull(str2);
        String str3 = this.perStreet;
        Intrinsics.checkNotNull(str3);
        String str4 = this.perLocation;
        Intrinsics.checkNotNull(str4);
        String str5 = this.permVillageOrTown;
        Intrinsics.checkNotNull(str5);
        String str6 = this.perSubDistrict;
        Intrinsics.checkNotNull(str6);
        String str7 = this.perDistrict;
        Intrinsics.checkNotNull(str7);
        String str8 = this.perState;
        Intrinsics.checkNotNull(str8);
        String str9 = this.perPinCode;
        Intrinsics.checkNotNull(str9);
        String str10 = this.presHouseNo;
        Intrinsics.checkNotNull(str10);
        String str11 = this.presStreet;
        Intrinsics.checkNotNull(str11);
        String str12 = this.presLocation;
        Intrinsics.checkNotNull(str12);
        String str13 = this.presVillageOrTown;
        Intrinsics.checkNotNull(str13);
        String str14 = this.presSubDistrict;
        Intrinsics.checkNotNull(str14);
        String str15 = this.presDistrict;
        Intrinsics.checkNotNull(str15);
        String str16 = this.presState;
        Intrinsics.checkNotNull(str16);
        String str17 = this.presPincode;
        Intrinsics.checkNotNull(str17);
        return new RenewalGenY(string, bioDob, string2, "G", str, selectRenewalDLlist, arrayList, "NA", "N", "B", str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17);
    }

    /* JADX INFO: renamed from: U1, reason: from getter */
    public final String getDlNo() {
        return this.dlNo;
    }

    public final RenewalCoaValidation U2() {
        SelectRenewalCoalist selectRenewalCoalist = new SelectRenewalCoalist("Re-Validation of Expired DL", "CHANGE OF ADDRESS IN DL");
        ArrayList arrayList = new ArrayList();
        int size = T1().getDlcovs().size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(String.valueOf(T1().getDlcovs().get(i2).getDcCovcd()));
        }
        String string = StringsKt__StringsKt.trim((CharSequence) T1().getDlobj().getDlLicno()).toString();
        String bioDob = T1().getBioObj().getBioDob();
        String string2 = StringsKt__StringsKt.trim((CharSequence) this.lastEndorseRTOCode.toString()).toString();
        String str = this.Mobile_no;
        Intrinsics.checkNotNull(str);
        String str2 = this.perHouseNo;
        Intrinsics.checkNotNull(str2);
        String str3 = this.perStreet;
        Intrinsics.checkNotNull(str3);
        String str4 = this.perLocation;
        Intrinsics.checkNotNull(str4);
        String str5 = this.permVillageOrTown;
        Intrinsics.checkNotNull(str5);
        String str6 = this.perSubDistrict;
        Intrinsics.checkNotNull(str6);
        String str7 = this.perDistrict;
        Intrinsics.checkNotNull(str7);
        String str8 = this.perState;
        Intrinsics.checkNotNull(str8);
        String str9 = this.perPinCode;
        Intrinsics.checkNotNull(str9);
        String str10 = this.presHouseNo;
        Intrinsics.checkNotNull(str10);
        String str11 = this.presStreet;
        Intrinsics.checkNotNull(str11);
        String str12 = this.presLocation;
        Intrinsics.checkNotNull(str12);
        String str13 = this.presVillageOrTown;
        Intrinsics.checkNotNull(str13);
        String str14 = this.presSubDistrict;
        Intrinsics.checkNotNull(str14);
        String str15 = this.presDistrict;
        Intrinsics.checkNotNull(str15);
        String str16 = this.presState;
        Intrinsics.checkNotNull(str16);
        String str17 = this.presPincode;
        Intrinsics.checkNotNull(str17);
        return new RenewalCoaValidation(string, bioDob, string2, "G", str, selectRenewalCoalist, arrayList, "NA", "N", "B", str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17);
    }

    /* JADX INFO: renamed from: V1, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    public final RenewalValidation V2() {
        SelectRenewalDLlist selectRenewalDLlist = new SelectRenewalDLlist("Re-Validation of Expired DL");
        ArrayList arrayList = new ArrayList();
        int size = T1().getDlcovs().size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(String.valueOf(T1().getDlcovs().get(i2).getDcCovcd()));
        }
        String string = StringsKt__StringsKt.trim((CharSequence) T1().getDlobj().getDlLicno()).toString();
        String bioDob = T1().getBioObj().getBioDob();
        String string2 = StringsKt__StringsKt.trim((CharSequence) this.lastEndorseRTOCode.toString()).toString();
        String str = this.Mobile_no;
        Intrinsics.checkNotNull(str);
        return new RenewalValidation(string, bioDob, string2, "G", str, selectRenewalDLlist, arrayList);
    }

    public final wa3 W1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    /* JADX INFO: renamed from: X1, reason: from getter */
    public final String getLastEndorseRTOCode() {
        return this.lastEndorseRTOCode;
    }

    public final void X2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appCategory = str;
    }

    /* JADX INFO: renamed from: Y1, reason: from getter */
    public final String getLastEndorseRto() {
        return this.lastEndorseRto;
    }

    public final void Y2(ba baVar) {
        Intrinsics.checkNotNullParameter(baVar, "<set-?>");
        this.binding = baVar;
    }

    /* JADX INFO: renamed from: Z1, reason: from getter */
    public final String getLastEndorseState() {
        return this.lastEndorseState;
    }

    public final void Z2(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dlDetails = dldetobjX;
    }

    /* JADX INFO: renamed from: a2, reason: from getter */
    public final String getLastEndorseStateCode() {
        return this.lastEndorseStateCode;
    }

    public final void a3(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final ArrayList b2() {
        ArrayList arrayList = this.listHeaderSteps;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("listHeaderSteps");
        return null;
    }

    public final void b3(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.listHeaderSteps = arrayList;
    }

    public final CombineServiceInterface c2() {
        CombineServiceInterface combineServiceInterface = this.mCombineServiceInterface;
        if (combineServiceInterface != null) {
            return combineServiceInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mCombineServiceInterface");
        return null;
    }

    public final void c3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.ll_home = linearLayout;
    }

    public final RenCOAInterface d2() {
        RenCOAInterface renCOAInterface = this.mRenCOAInterface;
        if (renCOAInterface != null) {
            return renCOAInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRenCOAInterface");
        return null;
    }

    public final void d3(CombineServiceInterface combineServiceInterface) {
        Intrinsics.checkNotNullParameter(combineServiceInterface, "<set-?>");
        this.mCombineServiceInterface = combineServiceInterface;
    }

    public final ws6 e2() {
        ws6 ws6Var = this.mSessionmanger;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSessionmanger");
        return null;
    }

    public final void e3(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    /* JADX INFO: renamed from: f2, reason: from getter */
    public final String getMobile_no() {
        return this.Mobile_no;
    }

    public final void f3(RenCOAInterface renCOAInterface) {
        Intrinsics.checkNotNullParameter(renCOAInterface, "<set-?>");
        this.mRenCOAInterface = renCOAInterface;
    }

    public final ArrayList g2() {
        ArrayList arrayList = this.multiListName;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiListName");
        return null;
    }

    public final void g3(com.nic.mparivahan.dlservices.RenewalCOA.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.mRenCOAVM = aVar;
    }

    /* JADX INFO: renamed from: h2, reason: from getter */
    public final String getPerDistrict() {
        return this.perDistrict;
    }

    public final void h3(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.mSessionmanger = ws6Var;
    }

    /* JADX INFO: renamed from: i2, reason: from getter */
    public final String getPerHouseNo() {
        return this.perHouseNo;
    }

    public final void i3(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.multiListName = arrayList;
    }

    /* JADX INFO: renamed from: j2, reason: from getter */
    public final String getPerLocation() {
        return this.perLocation;
    }

    public final void j3(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    /* JADX INFO: renamed from: k2, reason: from getter */
    public final String getPerPinCode() {
        return this.perPinCode;
    }

    /* JADX INFO: renamed from: l2, reason: from getter */
    public final String getPerState() {
        return this.perState;
    }

    /* JADX INFO: renamed from: m2, reason: from getter */
    public final String getPerStreet() {
        return this.perStreet;
    }

    /* JADX INFO: renamed from: n2, reason: from getter */
    public final String getPerSubDistrict() {
        return this.perSubDistrict;
    }

    /* JADX INFO: renamed from: o2, reason: from getter */
    public final String getPermVillageOrTown() {
        return this.permVillageOrTown;
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lq7 lq7VarF = kd1.f(this, R.layout.activity_dl_renewal);
        Intrinsics.checkNotNullExpressionValue(lq7VarF, "setContentView(...)");
        Y2((ba) lq7VarF);
        e3(this);
        h3(new ws6(this));
        a3(new wa3(this));
        ta3.a.I1(this, R1());
        B2();
        H2();
        R1().c0.setPaintFlags(R1().c0.getPaintFlags() | 8);
        R1().c0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.x85
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RenewalOfDLActivity.M2(this.a, view);
            }
        });
        O1();
        if (Intrinsics.areEqual(y2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            J2();
        }
        R1().E.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.z85
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RenewalOfDLActivity.N2(this.a, view);
            }
        });
        R1().E.e.setVisibility(8);
        R1().D.g.setText(y2().k());
        R1().c0.setVisibility(0);
        R1().y.setVisibility(0);
    }

    /* JADX INFO: renamed from: p2, reason: from getter */
    public final String getPresDistrict() {
        return this.presDistrict;
    }

    /* JADX INFO: renamed from: q2, reason: from getter */
    public final String getPresHouseNo() {
        return this.presHouseNo;
    }

    /* JADX INFO: renamed from: r2, reason: from getter */
    public final String getPresLocation() {
        return this.presLocation;
    }

    /* JADX INFO: renamed from: s2, reason: from getter */
    public final String getPresPincode() {
        return this.presPincode;
    }

    /* JADX INFO: renamed from: t2, reason: from getter */
    public final String getPresState() {
        return this.presState;
    }

    /* JADX INFO: renamed from: u2, reason: from getter */
    public final String getPresStreet() {
        return this.presStreet;
    }

    /* JADX INFO: renamed from: v2, reason: from getter */
    public final String getPresSubDistrict() {
        return this.presSubDistrict;
    }

    /* JADX INFO: renamed from: w2, reason: from getter */
    public final String getPresVillageOrTown() {
        return this.presVillageOrTown;
    }

    /* JADX INFO: renamed from: x2, reason: from getter */
    public final String getPurCode() {
        return this.purCode;
    }

    public final wl5 y2() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    /* JADX INFO: renamed from: z2, reason: from getter */
    public final String getState_value() {
        return this.state_value;
    }
}
