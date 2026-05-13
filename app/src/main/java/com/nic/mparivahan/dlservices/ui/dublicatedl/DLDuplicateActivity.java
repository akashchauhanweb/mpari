package com.nic.mparivahan.dlservices.ui.dublicatedl;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.google.gson.Gson;
import com.nic.mparivahan.DLServicesAuth.View.DlServiceDetailsActivity;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.DlCombineServices.CombineReq;
import com.nic.mparivahan.DlCombineServices.CombineServiceInterface;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.DlLog.DlLogCapture;
import com.nic.mparivahan.dlservices.DupChangeAdd.DupChangeAddInterface;
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
import com.nic.mparivahan.dlservices.widget.MyTextView;
import com.zepto.d86;
import com.zepto.fs0;
import com.zepto.jb;
import com.zepto.kd1;
import com.zepto.lq7;
import com.zepto.mf4;
import com.zepto.mt6;
import com.zepto.o40;
import com.zepto.oq;
import com.zepto.qx1;
import com.zepto.rb1;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.ws6;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\bJ\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b°\u0002\u0010±\u0002J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J@\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0014j\b\u0012\u0004\u0012\u00020\b`\u0015H\u0002J\u0012\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014J\u0010\u0010\u001b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0006\u0010\u001c\u001a\u00020\bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+RF\u00105\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b0-j\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b`.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R \u0010:\u001a\f\u0012\u0006\u0012\u0004\u0018\u000107\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010K\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010<\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010O\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010<\u001a\u0004\bM\u0010H\"\u0004\bN\u0010JR$\u0010S\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010<\u001a\u0004\bQ\u0010H\"\u0004\bR\u0010JR$\u0010W\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010<\u001a\u0004\bU\u0010H\"\u0004\bV\u0010JR$\u0010[\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010<\u001a\u0004\bY\u0010H\"\u0004\bZ\u0010JR\"\u0010_\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010<\u001a\u0004\b]\u0010H\"\u0004\b^\u0010JR\"\u0010c\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010<\u001a\u0004\ba\u0010H\"\u0004\bb\u0010JR\"\u0010g\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010<\u001a\u0004\be\u0010H\"\u0004\bf\u0010JR\"\u0010k\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010<\u001a\u0004\bi\u0010H\"\u0004\bj\u0010JR\"\u0010o\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010<\u001a\u0004\bm\u0010H\"\u0004\bn\u0010JR\"\u0010w\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010\u007f\u001a\u00020x8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R(\u0010\u0083\u0001\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010<\u001a\u0005\b\u0081\u0001\u0010H\"\u0005\b\u0082\u0001\u0010JR(\u0010\u0087\u0001\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010<\u001a\u0005\b\u0085\u0001\u0010H\"\u0005\b\u0086\u0001\u0010JR(\u0010\u008b\u0001\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010<\u001a\u0005\b\u0089\u0001\u0010H\"\u0005\b\u008a\u0001\u0010JR(\u0010\u008f\u0001\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008c\u0001\u0010<\u001a\u0005\b\u008d\u0001\u0010H\"\u0005\b\u008e\u0001\u0010JR(\u0010\u0093\u0001\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0090\u0001\u0010<\u001a\u0005\b\u0091\u0001\u0010H\"\u0005\b\u0092\u0001\u0010JR(\u0010\u0097\u0001\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0094\u0001\u0010<\u001a\u0005\b\u0095\u0001\u0010H\"\u0005\b\u0096\u0001\u0010JR(\u0010\u009b\u0001\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0098\u0001\u0010<\u001a\u0005\b\u0099\u0001\u0010H\"\u0005\b\u009a\u0001\u0010JR(\u0010\u009f\u0001\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009c\u0001\u0010<\u001a\u0005\b\u009d\u0001\u0010H\"\u0005\b\u009e\u0001\u0010JR(\u0010£\u0001\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b \u0001\u0010<\u001a\u0005\b¡\u0001\u0010H\"\u0005\b¢\u0001\u0010JR(\u0010§\u0001\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¤\u0001\u0010<\u001a\u0005\b¥\u0001\u0010H\"\u0005\b¦\u0001\u0010JR(\u0010«\u0001\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¨\u0001\u0010<\u001a\u0005\b©\u0001\u0010H\"\u0005\bª\u0001\u0010JR(\u0010¯\u0001\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¬\u0001\u0010<\u001a\u0005\b\u00ad\u0001\u0010H\"\u0005\b®\u0001\u0010JR(\u0010³\u0001\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b°\u0001\u0010<\u001a\u0005\b±\u0001\u0010H\"\u0005\b²\u0001\u0010JR(\u0010·\u0001\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b´\u0001\u0010<\u001a\u0005\bµ\u0001\u0010H\"\u0005\b¶\u0001\u0010JR(\u0010»\u0001\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¸\u0001\u0010<\u001a\u0005\b¹\u0001\u0010H\"\u0005\bº\u0001\u0010JR(\u0010¿\u0001\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¼\u0001\u0010<\u001a\u0005\b½\u0001\u0010H\"\u0005\b¾\u0001\u0010JR%\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÀ\u0001\u0010<\u001a\u0005\bÁ\u0001\u0010H\"\u0005\bÂ\u0001\u0010JR*\u0010Ê\u0001\u001a\u00030Ã\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R*\u0010Ò\u0001\u001a\u00030Ë\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001R&\u0010Ö\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÓ\u0001\u0010<\u001a\u0005\bÔ\u0001\u0010H\"\u0005\bÕ\u0001\u0010JR&\u0010Ú\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b×\u0001\u0010<\u001a\u0005\bØ\u0001\u0010H\"\u0005\bÙ\u0001\u0010JR&\u0010Þ\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÛ\u0001\u0010<\u001a\u0005\bÜ\u0001\u0010H\"\u0005\bÝ\u0001\u0010JR&\u0010â\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bß\u0001\u0010<\u001a\u0005\bà\u0001\u0010H\"\u0005\bá\u0001\u0010JR&\u0010æ\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bã\u0001\u0010<\u001a\u0005\bä\u0001\u0010H\"\u0005\bå\u0001\u0010JR&\u0010ê\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bç\u0001\u0010<\u001a\u0005\bè\u0001\u0010H\"\u0005\bé\u0001\u0010JR&\u0010î\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bë\u0001\u0010<\u001a\u0005\bì\u0001\u0010H\"\u0005\bí\u0001\u0010JR&\u0010ò\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bï\u0001\u0010<\u001a\u0005\bð\u0001\u0010H\"\u0005\bñ\u0001\u0010JR&\u0010ö\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bó\u0001\u0010<\u001a\u0005\bô\u0001\u0010H\"\u0005\bõ\u0001\u0010JR&\u0010ú\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b÷\u0001\u0010<\u001a\u0005\bø\u0001\u0010H\"\u0005\bù\u0001\u0010JR*\u0010\u0082\u0002\u001a\u00030û\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bü\u0001\u0010ý\u0001\u001a\u0006\bþ\u0001\u0010ÿ\u0001\"\u0006\b\u0080\u0002\u0010\u0081\u0002R/\u0010\u0089\u0002\u001a\b\u0012\u0004\u0012\u00020\b0\u00148\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0083\u0002\u0010\u0084\u0002\u001a\u0006\b\u0085\u0002\u0010\u0086\u0002\"\u0006\b\u0087\u0002\u0010\u0088\u0002R9\u0010\u008d\u0002\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0014j\b\u0012\u0004\u0012\u00020\b`\u00158\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008a\u0002\u0010\u0084\u0002\u001a\u0006\b\u008b\u0002\u0010\u0086\u0002\"\u0006\b\u008c\u0002\u0010\u0088\u0002R*\u0010\u0094\u0002\u001a\u00030\u008e\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008f\u0002\u0010\u0084\u0001\u001a\u0006\b\u0090\u0002\u0010\u0091\u0002\"\u0006\b\u0092\u0002\u0010\u0093\u0002R&\u0010\u0098\u0002\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0095\u0002\u0010<\u001a\u0005\b\u0096\u0002\u0010H\"\u0005\b\u0097\u0002\u0010JR)\u0010\u009f\u0002\u001a\u00030\u0099\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u009a\u0002\u0010/\u001a\u0006\b\u009b\u0002\u0010\u009c\u0002\"\u0006\b\u009d\u0002\u0010\u009e\u0002R)\u0010£\u0002\u001a\u00030\u0099\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b \u0002\u0010/\u001a\u0006\b¡\u0002\u0010\u009c\u0002\"\u0006\b¢\u0002\u0010\u009e\u0002R\u001a\u0010§\u0002\u001a\u00030¤\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¥\u0002\u0010¦\u0002R*\u0010¯\u0002\u001a\u00030¨\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b©\u0002\u0010ª\u0002\u001a\u0006\b«\u0002\u0010¬\u0002\"\u0006\b\u00ad\u0002\u0010®\u0002¨\u0006²\u0002"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/dublicatedl/DLDuplicateActivity;", "Lcom/zepto/o40;", "", "D2", "S1", "m2", "t2", "w2", "", "message", "I2", "T1", "H2", "C2", "K2", "Landroid/content/Intent;", "intent", "lastEndRTO", "lastEndState", "purCode", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "multiList", "v2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "J2", "U1", "Lcom/zepto/jb;", "F", "Lcom/zepto/jb;", "mBinding", "Lcom/zepto/rb1;", "G", "Lcom/zepto/rb1;", "viewModel", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "H", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "V1", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "M2", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "dlDetails", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "I", "Ljava/util/HashMap;", "getWhatServiceRequired", "()Ljava/util/HashMap;", "setWhatServiceRequired", "(Ljava/util/HashMap;)V", "whatServiceRequired", "", "Lcom/nic/mparivahan/dlservices/data/model/duplicatedl/ReasonsMasterItem;", "J", "Ljava/util/List;", "mReasonList", "K", "Ljava/lang/String;", "willingToRelocate", "Lcom/zepto/wl5;", "L", "Lcom/zepto/wl5;", "l2", "()Lcom/zepto/wl5;", "V2", "(Lcom/zepto/wl5;)V", "sarthiSession", "M", "getBioRecGenesis", "()Ljava/lang/String;", "setBioRecGenesis", "(Ljava/lang/String;)V", "bioRecGenesis", "N", "getAllowAddrChangeAtDlservReqst", "setAllowAddrChangeAtDlservReqst", "allowAddrChangeAtDlservReqst", "O", "W1", "setDlNo", "dlNo", "P", "X1", "setDob", "dob", "Q", "i2", "setMobile_no", "Mobile_no", "R", "a2", "setLastEndorseRto", "lastEndorseRto", "S", "b2", "setLastEndorseState", "lastEndorseState", "T", "Z1", "setLastEndorseRTOCode", "lastEndorseRTOCode", "U", "c2", "setLastEndorseStateCode", "lastEndorseStateCode", "V", "getState_value", "setState_value", "state_value", "Lcom/zepto/qx1;", "W", "Lcom/zepto/qx1;", "g2", "()Lcom/zepto/qx1;", "S2", "(Lcom/zepto/qx1;)V", "mDupChangeAddVM", "Lcom/nic/mparivahan/dlservices/DupChangeAdd/DupChangeAddInterface;", "X", "Lcom/nic/mparivahan/dlservices/DupChangeAdd/DupChangeAddInterface;", "f2", "()Lcom/nic/mparivahan/dlservices/DupChangeAdd/DupChangeAddInterface;", "R2", "(Lcom/nic/mparivahan/dlservices/DupChangeAdd/DupChangeAddInterface;)V", "mDlService", "Y", "getPerHouseNo", "setPerHouseNo", "perHouseNo", "Z", "getPerStreet", "setPerStreet", "perStreet", "a0", "getPerLocation", "setPerLocation", "perLocation", "b0", "getPermVillageOrTown", "setPermVillageOrTown", "permVillageOrTown", "c0", "getPerSubDistrict", "setPerSubDistrict", "perSubDistrict", "d0", "getPerDistrict", "setPerDistrict", "perDistrict", "e0", "getPerState", "setPerState", "perState", "f0", "getPerPinCode", "setPerPinCode", "perPinCode", "g0", "getPresHouseNo", "setPresHouseNo", "presHouseNo", "h0", "getPresStreet", "setPresStreet", "presStreet", "i0", "getPresLocation", "setPresLocation", "presLocation", "j0", "getPresVillageOrTown", "setPresVillageOrTown", "presVillageOrTown", "k0", "getPresSubDistrict", "setPresSubDistrict", "presSubDistrict", "l0", "getPresDistrict", "setPresDistrict", "presDistrict", "m0", "getPresState", "setPresState", "presState", "n0", "getPresPincode", "setPresPincode", "presPincode", "o0", "k2", "setPurCode", "Lcom/zepto/ws6;", "p0", "Lcom/zepto/ws6;", "h2", "()Lcom/zepto/ws6;", "T2", "(Lcom/zepto/ws6;)V", "mSessionmanger", "Lcom/zepto/wa3;", "q0", "Lcom/zepto/wa3;", "Y1", "()Lcom/zepto/wa3;", "N2", "(Lcom/zepto/wa3;)V", "langSession", "r0", "getAppCategory", "L2", "appCategory", "s0", "getForm1FlagDLserReq", "setForm1FlagDLserReq", "form1FlagDLserReq", "t0", "getSubmitFormOne", "setSubmitFormOne", "submitFormOne", "u0", "getAString", "setAString", "aString", "v0", "getBString", "setBString", "bString", "w0", "getCString", "setCString", "cString", "x0", "getDString", "setDString", "dString", "y0", "getEString", "setEString", "eString", "z0", "getFString", "setFString", "fString", "A0", "getGString", "setGString", "gString", "Landroid/content/Context;", "B0", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "Q2", "(Landroid/content/Context;)V", "mContext", "C0", "Ljava/util/ArrayList;", "j2", "()Ljava/util/ArrayList;", "U2", "(Ljava/util/ArrayList;)V", "multiListName", "D0", "d2", "O2", "listHeaderSteps", "", "E0", "getCOA", "()Z", "setCOA", "(Z)V", "COA", "F0", "getMetaflag", "setMetaflag", "metaflag", "", "G0", "getWidthPixels", "()I", "setWidthPixels", "(I)V", "widthPixels", "H0", "getSerialNo", "setSerialNo", "serialNo", "Lcom/zepto/fs0;", "I0", "Lcom/zepto/fs0;", "mCombineViewModel", "Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;", "J0", "Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;", "e2", "()Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;", "P2", "(Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;)V", "mCombineServiceInterface", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDLDuplicateActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DLDuplicateActivity.kt\ncom/nic/mparivahan/dlservices/ui/dublicatedl/DLDuplicateActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1700:1\n1855#2,2:1701\n260#3:1703\n260#3:1704\n*S KotlinDebug\n*F\n+ 1 DLDuplicateActivity.kt\ncom/nic/mparivahan/dlservices/ui/dublicatedl/DLDuplicateActivity\n*L\n1158#1:1701,2\n1200#1:1703\n1222#1:1704\n*E\n"})
public final class DLDuplicateActivity extends o40 {

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    public ArrayList multiListName;

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    public ArrayList listHeaderSteps;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    public boolean COA;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public jb mBinding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public rb1 viewModel;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    public int widthPixels;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public DldetobjX dlDetails;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    public int serialNo;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    public fs0 mCombineViewModel;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public List mReasonList;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    public CombineServiceInterface mCombineServiceInterface;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String bioRecGenesis;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String allowAddrChangeAtDlservReqst;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String dlNo;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String dob;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public qx1 mDupChangeAddVM;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public DupChangeAddInterface mDlService;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public ws6 mSessionmanger;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public HashMap whatServiceRequired = new HashMap();

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String willingToRelocate = "Y";

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

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String perHouseNo = "";

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String perStreet = "";

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String perLocation = "";

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String permVillageOrTown = "";

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public String perSubDistrict = "";

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public String perDistrict = "";

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public String perState = "";

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public String perPinCode = "";

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public String presHouseNo = "";

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public String presStreet = "";

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public String presLocation = "";

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public String presVillageOrTown = "";

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public String presSubDistrict = "";

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public String presDistrict = "";

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public String presState = "";

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public String presPincode = "";

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public String purCode = "0";

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public String appCategory = "0";

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    public String form1FlagDLserReq = "N";

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    public String submitFormOne = "N";

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    public String aString = "";

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public String bString = "";

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    public String cString = "";

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    public String dString = "";

    /* JADX INFO: renamed from: y0, reason: from kotlin metadata */
    public String eString = "";

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    public String fString = "";

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    public String gString = "N";

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
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
            DLDuplicateActivity.this.L2(((AppCatPojo) ((ArrayList) this.b.element).get(i)).getAppCode());
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
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

        public final void invoke(String it) {
            rb1 rb1Var;
            rb1 rb1Var2;
            Intrinsics.checkNotNullParameter(it, "it");
            if (StringsKt__StringsJVMKt.equals(it, "yes", true)) {
                jb jbVar = null;
                if (!Intrinsics.areEqual(DLDuplicateActivity.this.willingToRelocate, "Y")) {
                    if (!com.nic.mparivahan.a.a.a(DLDuplicateActivity.this)) {
                        Toast.makeText(DLDuplicateActivity.this.getApplicationContext(), DLDuplicateActivity.this.Y1().b("service_is_not_present", DLDuplicateActivity.this.getString(R.string.unable_to_get_details)), 0).show();
                        return;
                    }
                    jb jbVar2 = DLDuplicateActivity.this.mBinding;
                    if (jbVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        jbVar2 = null;
                    }
                    jbVar2.G.c(true);
                    jb jbVar3 = DLDuplicateActivity.this.mBinding;
                    if (jbVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        jbVar3 = null;
                    }
                    String string = jbVar3.E.getContentDescription().toString();
                    jb jbVar4 = DLDuplicateActivity.this.mBinding;
                    if (jbVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        jbVar4 = null;
                    }
                    jbVar4.G.c(true);
                    rb1 rb1Var3 = DLDuplicateActivity.this.viewModel;
                    if (rb1Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        rb1Var = null;
                    } else {
                        rb1Var = rb1Var3;
                    }
                    String dlNo = DLDuplicateActivity.this.getDlNo();
                    String dob = DLDuplicateActivity.this.getDob();
                    String lastEndorseRTOCode = DLDuplicateActivity.this.getLastEndorseRTOCode();
                    jb jbVar5 = DLDuplicateActivity.this.mBinding;
                    if (jbVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    } else {
                        jbVar = jbVar5;
                    }
                    String string2 = jbVar.E.getText().toString();
                    String str = DLDuplicateActivity.this.willingToRelocate;
                    String mobile_no = DLDuplicateActivity.this.getMobile_no();
                    Intrinsics.checkNotNull(mobile_no);
                    rb1Var.j(dlNo, dob, lastEndorseRTOCode, string, string2, str, " ", mobile_no, DLDuplicateActivity.this.l2().f(), DLDuplicateActivity.this.l2().g(), DLDuplicateActivity.this.l2().e(), DLDuplicateActivity.this.l2().h());
                    return;
                }
                if (!com.nic.mparivahan.a.a.a(DLDuplicateActivity.this)) {
                    Toast.makeText(DLDuplicateActivity.this.getApplicationContext(), DLDuplicateActivity.this.Y1().b("service_is_not_present", DLDuplicateActivity.this.getString(R.string.unable_to_get_details)), 0).show();
                    return;
                }
                jb jbVar6 = DLDuplicateActivity.this.mBinding;
                if (jbVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    jbVar6 = null;
                }
                jbVar6.G.c(true);
                jb jbVar7 = DLDuplicateActivity.this.mBinding;
                if (jbVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    jbVar7 = null;
                }
                String string3 = jbVar7.E.getContentDescription().toString();
                jb jbVar8 = DLDuplicateActivity.this.mBinding;
                if (jbVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    jbVar8 = null;
                }
                jbVar8.G.c(true);
                rb1 rb1Var4 = DLDuplicateActivity.this.viewModel;
                if (rb1Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    rb1Var2 = null;
                } else {
                    rb1Var2 = rb1Var4;
                }
                String dlNo2 = DLDuplicateActivity.this.getDlNo();
                String dob2 = DLDuplicateActivity.this.getDob();
                String lastEndorseRTOCode2 = DLDuplicateActivity.this.getLastEndorseRTOCode();
                jb jbVar9 = DLDuplicateActivity.this.mBinding;
                if (jbVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    jbVar9 = null;
                }
                String string4 = jbVar9.E.getText().toString();
                String str2 = DLDuplicateActivity.this.willingToRelocate;
                jb jbVar10 = DLDuplicateActivity.this.mBinding;
                if (jbVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    jbVar = jbVar10;
                }
                String strValueOf = String.valueOf(jbVar.N.getText());
                String mobile_no2 = DLDuplicateActivity.this.getMobile_no();
                Intrinsics.checkNotNull(mobile_no2);
                rb1Var2.j(dlNo2, dob2, lastEndorseRTOCode2, string3, string4, str2, strValueOf, mobile_no2, DLDuplicateActivity.this.l2().f(), DLDuplicateActivity.this.l2().g(), DLDuplicateActivity.this.l2().e(), DLDuplicateActivity.this.l2().h());
            }
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(GetAckDetForGivenDLNumberResponse getAckDetForGivenDLNumberResponse) throws Throwable {
            jb jbVar = null;
            try {
                jb jbVar2 = DLDuplicateActivity.this.mBinding;
                if (jbVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    jbVar2 = null;
                }
                jbVar2.G.c(false);
                DlSubmitResult dlSubmitresult = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                Intrinsics.checkNotNull(dlSubmitresult);
                if (!StringsKt__StringsJVMKt.equals(dlSubmitresult.getStatusCode(), "00", true)) {
                    DlSubmitResult dlSubmitresult2 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                    String reqStatus = dlSubmitresult2 != null ? dlSubmitresult2.getReqStatus() : null;
                    if (reqStatus != null && reqStatus.length() != 0) {
                        DLDuplicateActivity dLDuplicateActivity = DLDuplicateActivity.this;
                        DlSubmitResult dlSubmitresult3 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                        String reqStatus2 = dlSubmitresult3 != null ? dlSubmitresult3.getReqStatus() : null;
                        Intrinsics.checkNotNull(reqStatus2);
                        dLDuplicateActivity.J2(reqStatus2);
                        return;
                    }
                    DLDuplicateActivity dLDuplicateActivity2 = DLDuplicateActivity.this;
                    dLDuplicateActivity2.J2(dLDuplicateActivity2.Y1().b("service_is_not_present", DLDuplicateActivity.this.getString(R.string.unable_to_get_details)));
                    return;
                }
                DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity = new DLServiceAcknowlegementActivity();
                List<ResultItemSubmit> result = getAckDetForGivenDLNumberResponse.getDlSubmitresult().getResult();
                Intrinsics.checkNotNull(result);
                ResultItemSubmit resultItemSubmit = result.get(0);
                if (resultItemSubmit != null) {
                    DLDuplicateActivity dLDuplicateActivity3 = DLDuplicateActivity.this;
                    try {
                        DlLogCapture.Companion companion = DlLogCapture.INSTANCE;
                        String strU1 = dLDuplicateActivity3.U1();
                        String applicationNo = resultItemSubmit.getApplicationNo();
                        Intrinsics.checkNotNull(applicationNo);
                        long j = Long.parseLong(applicationNo);
                        int i = Integer.parseInt(dLDuplicateActivity3.h2().k());
                        String dateofBirth = resultItemSubmit.getDateofBirth();
                        String dlno = resultItemSubmit.getDlno();
                        Intrinsics.checkNotNull(dlno);
                        String applicantGender = resultItemSubmit.getApplicantGender();
                        String mobile_no = dLDuplicateActivity3.getMobile_no();
                        Intrinsics.checkNotNull(mobile_no);
                        companion.a(dLDuplicateActivity3, "1234", "S", strU1, j, i, dateofBirth, dlno, "N", "N", applicantGender, mobile_no, false, dLDuplicateActivity3.getPurCode(), dLDuplicateActivity3.getLastEndorseRTOCode(), dLDuplicateActivity3.getLastEndorseStateCode());
                    } catch (Exception e) {
                        Log.d("valiii", e.getLocalizedMessage());
                    }
                    if (!Intrinsics.areEqual(dLDuplicateActivity3.l2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                        dLDuplicateActivity3.U2(new ArrayList());
                        dLDuplicateActivity3.j2().add(dLDuplicateActivity3.l2().k());
                    }
                    dLServiceAcknowlegementActivity.K2(dLDuplicateActivity3, resultItemSubmit, dLDuplicateActivity3.getLastEndorseRTOCode(), dLDuplicateActivity3.V1(), dLDuplicateActivity3.getDlNo(), dLDuplicateActivity3.getDob(), dLDuplicateActivity3.getMobile_no(), dLDuplicateActivity3.getLastEndorseRto(), dLDuplicateActivity3.getLastEndorseState(), dLDuplicateActivity3.getLastEndorseStateCode(), dLDuplicateActivity3.j2());
                }
            } catch (Exception unused) {
                jb jbVar3 = DLDuplicateActivity.this.mBinding;
                if (jbVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    jbVar = jbVar3;
                }
                jbVar.G.c(false);
                DLDuplicateActivity dLDuplicateActivity4 = DLDuplicateActivity.this;
                dLDuplicateActivity4.J2(dLDuplicateActivity4.Y1().b("service_is_not_present", DLDuplicateActivity.this.getString(R.string.unable_to_get_details)));
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
            jb jbVar = null;
            try {
                jb jbVar2 = DLDuplicateActivity.this.mBinding;
                if (jbVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    jbVar2 = null;
                }
                jbVar2.G.c(false);
                DlSubmitResult dlSubmitresult = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                Intrinsics.checkNotNull(dlSubmitresult);
                if (!StringsKt__StringsJVMKt.equals(dlSubmitresult.getStatusCode(), "00", true)) {
                    DlSubmitResult dlSubmitresult2 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                    String reqStatus = dlSubmitresult2 != null ? dlSubmitresult2.getReqStatus() : null;
                    if (reqStatus != null && reqStatus.length() != 0) {
                        DLDuplicateActivity dLDuplicateActivity = DLDuplicateActivity.this;
                        DlSubmitResult dlSubmitresult3 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                        String reqStatus2 = dlSubmitresult3 != null ? dlSubmitresult3.getReqStatus() : null;
                        Intrinsics.checkNotNull(reqStatus2);
                        dLDuplicateActivity.J2(reqStatus2);
                        return;
                    }
                    DLDuplicateActivity dLDuplicateActivity2 = DLDuplicateActivity.this;
                    dLDuplicateActivity2.J2(dLDuplicateActivity2.Y1().b("service_is_not_present", DLDuplicateActivity.this.getString(R.string.unable_to_get_details)));
                    return;
                }
                DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity = new DLServiceAcknowlegementActivity();
                List<ResultItemSubmit> result = getAckDetForGivenDLNumberResponse.getDlSubmitresult().getResult();
                Intrinsics.checkNotNull(result);
                ResultItemSubmit resultItemSubmit = result.get(0);
                if (resultItemSubmit != null) {
                    DLDuplicateActivity dLDuplicateActivity3 = DLDuplicateActivity.this;
                    try {
                        DlLogCapture.Companion companion = DlLogCapture.INSTANCE;
                        String strU1 = dLDuplicateActivity3.U1();
                        String applicationNo = resultItemSubmit.getApplicationNo();
                        Intrinsics.checkNotNull(applicationNo);
                        long j = Long.parseLong(applicationNo);
                        int i = Integer.parseInt(dLDuplicateActivity3.h2().k());
                        String dateofBirth = resultItemSubmit.getDateofBirth();
                        String dlno = resultItemSubmit.getDlno();
                        Intrinsics.checkNotNull(dlno);
                        String applicantGender = resultItemSubmit.getApplicantGender();
                        String mobile_no = dLDuplicateActivity3.getMobile_no();
                        Intrinsics.checkNotNull(mobile_no);
                        companion.a(dLDuplicateActivity3, "1234", "S", strU1, j, i, dateofBirth, dlno, "N", "N", applicantGender, mobile_no, false, dLDuplicateActivity3.getPurCode(), dLDuplicateActivity3.getLastEndorseRTOCode(), dLDuplicateActivity3.getLastEndorseStateCode());
                    } catch (Exception e) {
                        Log.d("valiii", e.getLocalizedMessage());
                    }
                    if (!Intrinsics.areEqual(dLDuplicateActivity3.l2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                        dLDuplicateActivity3.U2(new ArrayList());
                        dLDuplicateActivity3.j2().add(dLDuplicateActivity3.l2().k());
                    }
                    dLServiceAcknowlegementActivity.K2(dLDuplicateActivity3, resultItemSubmit, dLDuplicateActivity3.getLastEndorseRTOCode(), dLDuplicateActivity3.V1(), dLDuplicateActivity3.getDlNo(), dLDuplicateActivity3.getDob(), dLDuplicateActivity3.getMobile_no(), dLDuplicateActivity3.getLastEndorseRto(), dLDuplicateActivity3.getLastEndorseState(), dLDuplicateActivity3.getLastEndorseStateCode(), dLDuplicateActivity3.j2());
                }
            } catch (Exception unused) {
                jb jbVar3 = DLDuplicateActivity.this.mBinding;
                if (jbVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    jbVar = jbVar3;
                }
                jbVar.G.c(false);
                DLDuplicateActivity dLDuplicateActivity4 = DLDuplicateActivity.this;
                dLDuplicateActivity4.J2(dLDuplicateActivity4.Y1().b("service_is_not_present", DLDuplicateActivity.this.getString(R.string.unable_to_get_details)));
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

        public final void a(GetReasonsTransWiseResponse getReasonsTransWiseResponse) {
            try {
                if (StringsKt__StringsJVMKt.equals$default(getReasonsTransWiseResponse.getStatusCode(), "00", false, 2, null)) {
                    DLDuplicateActivity.this.mReasonList = getReasonsTransWiseResponse.getReasonsMaster();
                } else {
                    DLDuplicateActivity.this.J2(getReasonsTransWiseResponse.getStatusDesc());
                }
            } catch (Exception unused) {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetReasonsTransWiseResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        public final void a(GetAckDetForGivenDLNumberResponse getAckDetForGivenDLNumberResponse) throws Throwable {
            List<ResultItemSubmit> result;
            jb jbVar = null;
            try {
                jb jbVar2 = DLDuplicateActivity.this.mBinding;
                if (jbVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    jbVar2 = null;
                }
                jbVar2.G.c(false);
                DlSubmitResult dlSubmitresult = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                if (!StringsKt__StringsJVMKt.equals$default(dlSubmitresult != null ? dlSubmitresult.getStatusCode() : null, "00", false, 2, null)) {
                    DlSubmitResult dlSubmitresult2 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                    String reqStatus = dlSubmitresult2 != null ? dlSubmitresult2.getReqStatus() : null;
                    if (reqStatus != null && reqStatus.length() != 0) {
                        DLDuplicateActivity dLDuplicateActivity = DLDuplicateActivity.this;
                        DlSubmitResult dlSubmitresult3 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                        String reqStatus2 = dlSubmitresult3 != null ? dlSubmitresult3.getReqStatus() : null;
                        Intrinsics.checkNotNull(reqStatus2);
                        dLDuplicateActivity.J2(reqStatus2);
                        return;
                    }
                    DLDuplicateActivity dLDuplicateActivity2 = DLDuplicateActivity.this;
                    dLDuplicateActivity2.J2(dLDuplicateActivity2.Y1().b("service_is_not_present", DLDuplicateActivity.this.getString(R.string.unable_to_get_details)));
                    return;
                }
                DlSubmitResult dlSubmitresult4 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                if (dlSubmitresult4 == null || (result = dlSubmitresult4.getResult()) == null || !(!result.isEmpty())) {
                    return;
                }
                DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity = new DLServiceAcknowlegementActivity();
                ResultItemSubmit resultItemSubmit = getAckDetForGivenDLNumberResponse.getDlSubmitresult().getResult().get(0);
                if (resultItemSubmit != null) {
                    DLDuplicateActivity dLDuplicateActivity3 = DLDuplicateActivity.this;
                    try {
                        DlLogCapture.Companion companion = DlLogCapture.INSTANCE;
                        String applicationDate = resultItemSubmit.getApplicationDate();
                        String applicationNo = resultItemSubmit.getApplicationNo();
                        Intrinsics.checkNotNull(applicationNo);
                        long j = Long.parseLong(applicationNo);
                        int i = Integer.parseInt(dLDuplicateActivity3.h2().k());
                        String dateofBirth = resultItemSubmit.getDateofBirth();
                        String dlno = resultItemSubmit.getDlno();
                        Intrinsics.checkNotNull(dlno);
                        String applicantGender = resultItemSubmit.getApplicantGender();
                        String mobile_no = dLDuplicateActivity3.getMobile_no();
                        Intrinsics.checkNotNull(mobile_no);
                        companion.a(dLDuplicateActivity3, "1234", "S", applicationDate, j, i, dateofBirth, dlno, "N", "N", applicantGender, mobile_no, false, dLDuplicateActivity3.getPurCode(), dLDuplicateActivity3.getLastEndorseRTOCode(), dLDuplicateActivity3.getLastEndorseStateCode());
                    } catch (Exception e) {
                        Log.d("valiii", e.getLocalizedMessage());
                    }
                    if (!Intrinsics.areEqual(dLDuplicateActivity3.l2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                        dLDuplicateActivity3.U2(new ArrayList());
                        dLDuplicateActivity3.j2().add(dLDuplicateActivity3.l2().k());
                    }
                    dLServiceAcknowlegementActivity.K2(dLDuplicateActivity3, resultItemSubmit, dLDuplicateActivity3.getLastEndorseRTOCode(), dLDuplicateActivity3.V1(), dLDuplicateActivity3.getDlNo(), dLDuplicateActivity3.getDob(), dLDuplicateActivity3.getMobile_no(), dLDuplicateActivity3.getLastEndorseRto(), dLDuplicateActivity3.getLastEndorseState(), dLDuplicateActivity3.getLastEndorseStateCode(), dLDuplicateActivity3.j2());
                }
            } catch (Exception unused) {
                jb jbVar3 = DLDuplicateActivity.this.mBinding;
                if (jbVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    jbVar = jbVar3;
                }
                jbVar.G.c(false);
                DLDuplicateActivity dLDuplicateActivity4 = DLDuplicateActivity.this;
                dLDuplicateActivity4.J2(dLDuplicateActivity4.Y1().b("service_is_not_present", DLDuplicateActivity.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((GetAckDetForGivenDLNumberResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class g implements d86.b {
        public g() {
        }

        @Override // com.zepto.d86.b
        public void a(String str, int i) {
            ReasonsMasterItem reasonsMasterItem;
            List list = DLDuplicateActivity.this.mReasonList;
            jb jbVar = null;
            Integer reasonCode = (list == null || (reasonsMasterItem = (ReasonsMasterItem) list.get(i)) == null) ? null : reasonsMasterItem.getReasonCode();
            jb jbVar2 = DLDuplicateActivity.this.mBinding;
            if (jbVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                jbVar2 = null;
            }
            jbVar2.E.setText(str);
            jb jbVar3 = DLDuplicateActivity.this.mBinding;
            if (jbVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                jbVar3 = null;
            }
            jbVar3.E.setContentDescription("" + reasonCode);
            jb jbVar4 = DLDuplicateActivity.this.mBinding;
            if (jbVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                jbVar4 = null;
            }
            if (StringsKt__StringsJVMKt.equals(jbVar4.E.getText().toString(), "Miscellaneous", true)) {
                jb jbVar5 = DLDuplicateActivity.this.mBinding;
                if (jbVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    jbVar = jbVar5;
                }
                jbVar.C.setVisibility(0);
                return;
            }
            jb jbVar6 = DLDuplicateActivity.this.mBinding;
            if (jbVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                jbVar6 = null;
            }
            if (StringsKt__StringsJVMKt.equals(jbVar6.E.getText().toString(), "Loss of DL/PSV Badge", true)) {
                jb jbVar7 = DLDuplicateActivity.this.mBinding;
                if (jbVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    jbVar = jbVar7;
                }
                jbVar.C.setVisibility(0);
                return;
            }
            jb jbVar8 = DLDuplicateActivity.this.mBinding;
            if (jbVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                jbVar = jbVar8;
            }
            jbVar.C.setVisibility(8);
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

    public static final void A2(DLDuplicateActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.H2();
    }

    public static final void B2(DLDuplicateActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(this$0.l2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            this$0.C2();
            return;
        }
        jb jbVar = this$0.mBinding;
        jb jbVar2 = null;
        if (jbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar = null;
        }
        Editable text = jbVar.E.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0) {
            Toast.makeText(this$0, this$0.Y1().b("label_select_reason", this$0.getString(R.string.sel_rsn)), 1).show();
            return;
        }
        jb jbVar3 = this$0.mBinding;
        if (jbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar3 = null;
        }
        if (jbVar3.C.getVisibility() != 0) {
            if (Intrinsics.areEqual(this$0.appCategory, "0")) {
                this$0.J2(this$0.Y1().b("select_app_cat", ""));
                return;
            }
            if (!Intrinsics.areEqual(this$0.willingToRelocate, "Y")) {
                String strB = this$0.Y1().b("label_want_to_proceed", this$0.getString(R.string.are_you_want_to_proceed));
                Intrinsics.checkNotNull(strB);
                this$0.I2(strB);
                return;
            }
            jb jbVar4 = this$0.mBinding;
            if (jbVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                jbVar4 = null;
            }
            Editable text2 = jbVar4.N.getText();
            Intrinsics.checkNotNull(text2);
            if (text2.length() == 0) {
                this$0.J2(this$0.Y1().b("edit_dl_serv_emer_cont_no", this$0.getString(R.string.emergency_contact)));
                return;
            }
            jb jbVar5 = this$0.mBinding;
            if (jbVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                jbVar5 = null;
            }
            Editable text3 = jbVar5.N.getText();
            Intrinsics.checkNotNull(text3);
            if (text3.length() < 10) {
                this$0.J2(this$0.Y1().b("label_log_entr_vali_mobno", this$0.getString(R.string.plz_select_bank)));
                return;
            }
            mt6.a aVar = mt6.a;
            jb jbVar6 = this$0.mBinding;
            if (jbVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                jbVar2 = jbVar6;
            }
            if (!aVar.t(String.valueOf(jbVar2.N.getText()))) {
                this$0.J2(this$0.Y1().b("label_log_entr_vali_mobno", this$0.getString(R.string.plz_select_bank)));
                return;
            }
            String strB2 = this$0.Y1().b("label_want_to_proceed", this$0.getString(R.string.are_you_want_to_proceed));
            Intrinsics.checkNotNull(strB2);
            this$0.I2(strB2);
            return;
        }
        if (Intrinsics.areEqual(this$0.appCategory, "0")) {
            this$0.J2(this$0.Y1().b("select_app_cat", this$0.getString(R.string.sel_app_category)));
            return;
        }
        jb jbVar7 = this$0.mBinding;
        if (jbVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar7 = null;
        }
        Editable text4 = jbVar7.z.getText();
        Intrinsics.checkNotNullExpressionValue(text4, "getText(...)");
        if (text4.length() == 0) {
            this$0.J2(this$0.Y1().b("label_dl_serv_enter_reas_manul", this$0.getString(R.string.enter_Reason)));
            return;
        }
        if (!Intrinsics.areEqual(this$0.willingToRelocate, "Y")) {
            String strB3 = this$0.Y1().b("label_want_to_proceed", this$0.getString(R.string.are_you_want_to_proceed));
            Intrinsics.checkNotNull(strB3);
            this$0.I2(strB3);
            return;
        }
        jb jbVar8 = this$0.mBinding;
        if (jbVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar8 = null;
        }
        Editable text5 = jbVar8.N.getText();
        Intrinsics.checkNotNull(text5);
        if (text5.length() == 0) {
            this$0.J2(this$0.Y1().b("edit_dl_serv_emer_cont_no", this$0.getString(R.string.emergency_contact)));
            return;
        }
        jb jbVar9 = this$0.mBinding;
        if (jbVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar9 = null;
        }
        Editable text6 = jbVar9.N.getText();
        Intrinsics.checkNotNull(text6);
        if (text6.length() < 10) {
            this$0.J2(this$0.Y1().b("label_log_entr_vali_mobno", this$0.getString(R.string.plz_select_bank)));
            return;
        }
        mt6.a aVar2 = mt6.a;
        jb jbVar10 = this$0.mBinding;
        if (jbVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            jbVar2 = jbVar10;
        }
        if (!aVar2.t(String.valueOf(jbVar2.N.getText()))) {
            this$0.J2(this$0.Y1().b("label_log_entr_vali_mobno", this$0.getString(R.string.enter_mobile_no)));
            return;
        }
        String strB4 = this$0.Y1().b("label_want_to_proceed", this$0.getString(R.string.are_you_want_to_proceed));
        Intrinsics.checkNotNull(strB4);
        this$0.I2(strB4);
    }

    private final void D2() {
        fs0 fs0Var = this.mCombineViewModel;
        fs0 fs0Var2 = null;
        if (fs0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCombineViewModel");
            fs0Var = null;
        }
        fs0Var.i().g(this, new mf4() { // from class: com.zepto.j71
            @Override // com.zepto.mf4
            public final void a(Object obj) throws Throwable {
                DLDuplicateActivity.E2(this.a, (GetAckDetForGivenDLNumberResponse) obj);
            }
        });
        fs0 fs0Var3 = this.mCombineViewModel;
        if (fs0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCombineViewModel");
        } else {
            fs0Var2 = fs0Var3;
        }
        fs0Var2.h().g(this, new mf4() { // from class: com.zepto.k71
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                DLDuplicateActivity.F2(this.a, (String) obj);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x02ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void E2(com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity r27, com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 725
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity.E2(com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity, com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse):void");
    }

    public static final void F2(DLDuplicateActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        jb jbVar = this$0.mBinding;
        if (jbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar = null;
        }
        jbVar.G.c(false);
        this$0.J2(this$0.Y1().b("service_is_not_present", this$0.getString(R.string.unable_to_get_details)));
    }

    public static final void G2(DLDuplicateActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final void H2() {
        ArrayList arrayList = new ArrayList();
        List<ReasonsMasterItem> list = this.mReasonList;
        if (list != null) {
            for (ReasonsMasterItem reasonsMasterItem : list) {
                arrayList.add(String.valueOf(reasonsMasterItem != null ? reasonsMasterItem.getReasonName() : null));
            }
        }
        d86 d86VarA = d86.INSTANCE.a("Select Reason", arrayList);
        d86VarA.k2(I0(), "ReasonPicker");
        d86VarA.n2(new g());
    }

    private final void I2(String message) {
        String strValueOf;
        rb1 rb1Var;
        rb1 rb1Var2;
        Log.d("valuesDup", this.state_value + '-' + this.allowAddrChangeAtDlservReqst + '-' + this.bioRecGenesis);
        jb jbVar = null;
        if (Intrinsics.areEqual(this.willingToRelocate, "Y")) {
            jb jbVar2 = this.mBinding;
            if (jbVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                jbVar2 = null;
            }
            strValueOf = String.valueOf(jbVar2.N.getText());
        } else {
            strValueOf = "NA";
        }
        String str = strValueOf;
        try {
            if (Intrinsics.areEqual(this.state_value, "same") && !Intrinsics.areEqual(this.bioRecGenesis, "S")) {
                T1(message);
                return;
            }
            if (Intrinsics.areEqual(this.state_value, "same") && Intrinsics.areEqual(this.bioRecGenesis, "S") && Intrinsics.areEqual(this.allowAddrChangeAtDlservReqst, "Y")) {
                jb jbVar3 = this.mBinding;
                if (jbVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    jbVar3 = null;
                }
                jbVar3.G.c(true);
                rb1 rb1Var3 = this.viewModel;
                if (rb1Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    rb1Var2 = null;
                } else {
                    rb1Var2 = rb1Var3;
                }
                String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(this.dlNo)).toString();
                String str2 = this.dob;
                Intrinsics.checkNotNull(str2);
                String str3 = this.lastEndorseRTOCode;
                String str4 = this.willingToRelocate;
                Intrinsics.checkNotNull(str4);
                jb jbVar4 = this.mBinding;
                if (jbVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    jbVar4 = null;
                }
                String string2 = jbVar4.E.getContentDescription().toString();
                jb jbVar5 = this.mBinding;
                if (jbVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    jbVar = jbVar5;
                }
                String string3 = jbVar.E.getText().toString();
                String str5 = this.perHouseNo;
                Intrinsics.checkNotNull(str5);
                String str6 = this.perStreet;
                Intrinsics.checkNotNull(str6);
                String str7 = this.perLocation;
                Intrinsics.checkNotNull(str7);
                String str8 = this.permVillageOrTown;
                Intrinsics.checkNotNull(str8);
                String str9 = this.perDistrict;
                Intrinsics.checkNotNull(str9);
                String str10 = this.perSubDistrict;
                Intrinsics.checkNotNull(str10);
                String str11 = this.perState;
                Intrinsics.checkNotNull(str11);
                String str12 = this.perPinCode;
                Intrinsics.checkNotNull(str12);
                String str13 = this.presHouseNo;
                Intrinsics.checkNotNull(str13);
                String str14 = this.presStreet;
                Intrinsics.checkNotNull(str14);
                String str15 = this.presLocation;
                Intrinsics.checkNotNull(str15);
                String str16 = this.presVillageOrTown;
                Intrinsics.checkNotNull(str16);
                String str17 = this.presSubDistrict;
                Intrinsics.checkNotNull(str17);
                String str18 = this.presDistrict;
                Intrinsics.checkNotNull(str18);
                String str19 = this.presState;
                Intrinsics.checkNotNull(str19);
                String str20 = this.presPincode;
                Intrinsics.checkNotNull(str20);
                String str21 = this.Mobile_no;
                Intrinsics.checkNotNull(str21);
                rb1Var2.g(string, str2, str3, str, str4, string2, string3, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, "SarathiMobileService", "10.248.213.244", "975867c068a4e3e043058b5aaeebbeb5", "sakalaHR", l2().f(), l2().g(), l2().e(), l2().h(), "G");
                return;
            }
            if (Intrinsics.areEqual(this.state_value, "same") && Intrinsics.areEqual(this.bioRecGenesis, "S") && !Intrinsics.areEqual(this.allowAddrChangeAtDlservReqst, "Y")) {
                T1(message);
                return;
            }
            if (!com.nic.mparivahan.a.a.a(this)) {
                Toast.makeText(getApplicationContext(), Y1().b("service_is_not_present", getString(R.string.unable_to_get_details)), 0).show();
                return;
            }
            jb jbVar6 = this.mBinding;
            if (jbVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                jbVar6 = null;
            }
            jbVar6.G.c(true);
            rb1 rb1Var4 = this.viewModel;
            if (rb1Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                rb1Var = null;
            } else {
                rb1Var = rb1Var4;
            }
            String string4 = StringsKt__StringsKt.trim((CharSequence) String.valueOf(this.dlNo)).toString();
            String str22 = this.dob;
            Intrinsics.checkNotNull(str22);
            String str23 = this.lastEndorseRTOCode;
            String str24 = this.willingToRelocate;
            Intrinsics.checkNotNull(str24);
            jb jbVar7 = this.mBinding;
            if (jbVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                jbVar7 = null;
            }
            String string5 = jbVar7.E.getContentDescription().toString();
            jb jbVar8 = this.mBinding;
            if (jbVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                jbVar = jbVar8;
            }
            String string6 = jbVar.E.getText().toString();
            String str25 = this.appCategory;
            String str26 = this.perHouseNo;
            Intrinsics.checkNotNull(str26);
            String str27 = this.perStreet;
            Intrinsics.checkNotNull(str27);
            String str28 = this.perLocation;
            Intrinsics.checkNotNull(str28);
            String str29 = this.permVillageOrTown;
            Intrinsics.checkNotNull(str29);
            String str30 = this.perDistrict;
            Intrinsics.checkNotNull(str30);
            String str31 = this.perSubDistrict;
            Intrinsics.checkNotNull(str31);
            String str32 = this.perState;
            Intrinsics.checkNotNull(str32);
            String str33 = this.perPinCode;
            Intrinsics.checkNotNull(str33);
            String str34 = this.presHouseNo;
            Intrinsics.checkNotNull(str34);
            String str35 = this.presStreet;
            Intrinsics.checkNotNull(str35);
            String str36 = this.presLocation;
            Intrinsics.checkNotNull(str36);
            String str37 = this.presVillageOrTown;
            Intrinsics.checkNotNull(str37);
            String str38 = this.presSubDistrict;
            Intrinsics.checkNotNull(str38);
            String str39 = this.presDistrict;
            Intrinsics.checkNotNull(str39);
            String str40 = this.presState;
            Intrinsics.checkNotNull(str40);
            String str41 = this.presPincode;
            Intrinsics.checkNotNull(str41);
            String str42 = this.Mobile_no;
            Intrinsics.checkNotNull(str42);
            rb1Var.i(string4, str22, str23, str, str24, string5, string6, str25, "B", str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, "SarathiMobileService", "10.248.213.244", "975867c068a4e3e043058b5aaeebbeb5", "sakalaHR", l2().f(), l2().g(), l2().e(), l2().h());
        } catch (Exception unused) {
        }
    }

    private final void K2() {
        fs0 fs0Var;
        jb jbVar;
        String strValueOf = "";
        try {
            if (j2().size() > this.serialNo) {
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
                jb jbVar2 = this.mBinding;
                if (jbVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    jbVar2 = null;
                }
                combineReq2.setDupDlReasonName(jbVar2.E.getText().toString());
                jb jbVar3 = this.mBinding;
                if (jbVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    jbVar3 = null;
                }
                combineReq2.setDupDlReasonCode(jbVar3.E.getContentDescription().toString());
                if (Intrinsics.areEqual(this.willingToRelocate, "Y")) {
                    combineReq2.setWilltoDonateOrgans("Y");
                    jb jbVar4 = this.mBinding;
                    if (jbVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        jbVar = null;
                    } else {
                        jbVar = jbVar4;
                    }
                    combineReq2.setDlHolderAltMobMum(String.valueOf(jbVar.N.getText()));
                } else {
                    combineReq2.setWilltoDonateOrgans("N");
                    combineReq2.setDlHolderAltMobMum("NA");
                }
                SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit();
                editorEdit.putString("MultiService", new Gson().toJson(combineReq2));
                editorEdit.commit();
                if (Intrinsics.areEqual(j2().get(this.serialNo), Y1().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                    setIntent(new Intent(this, (Class<?>) DLDuplicateActivity.class));
                    Intent intent = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                    v2(intent, this.lastEndorseRTOCode, this.lastEndorseState, "513", j2());
                    return;
                }
                if (Intrinsics.areEqual(j2().get(this.serialNo), Y1().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                    setIntent(new Intent(this, (Class<?>) RenewalOfDLActivity.class));
                    Intent intent2 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
                    v2(intent2, this.lastEndorseRTOCode, this.lastEndorseState, "514", j2());
                    return;
                }
                if (Intrinsics.areEqual(j2().get(this.serialNo), Y1().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                    setIntent(new Intent(this, (Class<?>) RenewalOfDLActivity.class));
                    Intent intent3 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent3, "getIntent(...)");
                    v2(intent3, this.lastEndorseRTOCode, this.lastEndorseState, "537", j2());
                    return;
                }
                if (Intrinsics.areEqual(j2().get(this.serialNo), Y1().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                    setIntent(new Intent(this, (Class<?>) ChangeOfAddressActivity.class));
                    Intent intent4 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent4, "getIntent(...)");
                    v2(intent4, this.lastEndorseRTOCode, this.lastEndorseState, "515", j2());
                    return;
                }
                if (Intrinsics.areEqual(j2().get(this.serialNo), Y1().b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                    setIntent(new Intent(this, (Class<?>) DLReplecementActivity.class));
                    Intent intent5 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent5, "getIntent(...)");
                    v2(intent5, this.lastEndorseRTOCode, this.lastEndorseState, "516", j2());
                    return;
                }
                if (Intrinsics.areEqual(j2().get(this.serialNo), Y1().b("check_dl_serv_extract_dl", "DL Extract"))) {
                    setIntent(new Intent(this, (Class<?>) DLExtractActivity.class));
                    Intent intent6 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent6, "getIntent(...)");
                    v2(intent6, this.lastEndorseRTOCode, this.lastEndorseState, "523", j2());
                    return;
                }
                if (Intrinsics.areEqual(j2().get(this.serialNo), Y1().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                    setIntent(new Intent(this, (Class<?>) HillReligion.class));
                    Intent intent7 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent7, "getIntent(...)");
                    v2(intent7, this.lastEndorseRTOCode, this.lastEndorseState, "524", j2());
                    return;
                }
                if (Intrinsics.areEqual(j2().get(this.serialNo), Y1().b("change_name_dl", "Change of Name in DL"))) {
                    setIntent(new Intent(this, (Class<?>) ChangeOfName.class));
                    Intent intent8 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent8, "getIntent(...)");
                    v2(intent8, this.lastEndorseRTOCode, this.lastEndorseState, "526", j2());
                    return;
                }
                if (Intrinsics.areEqual(j2().get(this.serialNo), Y1().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                    setIntent(new Intent(this, (Class<?>) DobChangeActivity.class));
                    Intent intent9 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent9, "getIntent(...)");
                    v2(intent9, this.lastEndorseRTOCode, this.lastEndorseState, "548", j2());
                    return;
                }
                return;
            }
            if (!com.nic.mparivahan.a.a.a(this)) {
                Toast.makeText(getApplicationContext(), Y1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
                return;
            }
            CombineReq combineReq3 = (CombineReq) new Gson().fromJson(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getString("MultiService", ""), CombineReq.class);
            if (Intrinsics.areEqual(this.willingToRelocate, "Y")) {
                jb jbVar5 = this.mBinding;
                if (jbVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    jbVar5 = null;
                }
                strValueOf = String.valueOf(jbVar5.N.getText());
            }
            String str = strValueOf;
            ArrayList arrayList = new ArrayList();
            int size = V1().getDlcovs().size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(String.valueOf(V1().getDlcovs().get(i2).getDcCovcd()));
            }
            jb jbVar6 = this.mBinding;
            if (jbVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                jbVar6 = null;
            }
            jbVar6.G.c(true);
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
            ArrayList arrayListJ2 = j2();
            String str4 = this.appCategory;
            String str5 = this.dlNo;
            Intrinsics.checkNotNull(str5);
            String str6 = this.dob;
            Intrinsics.checkNotNull(str6);
            String str7 = this.lastEndorseRTOCode;
            String str8 = this.willingToRelocate;
            Intrinsics.checkNotNull(str8);
            String relationType = combineReq3.getRelationType();
            Intrinsics.checkNotNull(relationType);
            String conDlReasonName = combineReq3.getConDlReasonName();
            Intrinsics.checkNotNull(conDlReasonName);
            String conDlReasonName2 = combineReq3.getConDlReasonName();
            Intrinsics.checkNotNull(conDlReasonName2);
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
            String str9 = this.Mobile_no;
            Intrinsics.checkNotNull(str9);
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
            jb jbVar7 = this.mBinding;
            if (jbVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                jbVar7 = null;
            }
            String string = jbVar7.E.getText().toString();
            jb jbVar8 = this.mBinding;
            if (jbVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                jbVar8 = null;
            }
            String string2 = jbVar8.E.getContentDescription().toString();
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
            fs0Var.g(z, arrayList, str2, str3, arrayListJ2, "mobSARATHI", "657d1c758e2e95af0014e16f5109f933", "10.248.210.8", "sarathiservice", str4, str, str5, str6, str7, str8, relationType, conDlReasonName, conDlReasonName2, dlHolderNaturalName, conEffdate, applFirstName, applLastName, relFirstName, relLastName, str9, changeOfAddReq, perHouseNo, perStreet, perLocation, permVillageOrTown, perSubDistrict, perDistrict, perState, perPinCode, presHouseNo, presStreet, presLocation, presVillageOrTown, presSubDistrict, presDistrict, presState, presPincode, dleDlReasonCode, dleDlReasonName, string, string2, applDateOfBirth, codobDlReasonName, codobDlReasonCode, declaringcheck, hillcertificate, hillissueDate, hillvalidFrom, hillvalidTo, hilldrivingschool, hillissby, pofbirth, country, passno, passvaltill, visano, visavaltill, tovisit, iscountryrestricted, countryRestrictedReason, strIsDlSerdisqualified, dlSerdisqualifiedReason, forAdd1, forAdd2, forAdd3, forAddPinCode, forNationMobNum, emailID, appliedIdpfromIndEmb, indEmbName, embPlace, dateOfVerifEmb, embEndorseNo, idpcountryapplyfrom, l2().f(), l2().g(), l2().e(), l2().h());
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.ArrayList] */
    private final void S1() {
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
        oq oqVar = new oq(this, (ArrayList) objectRef.element);
        jb jbVar = this.mBinding;
        jb jbVar2 = null;
        if (jbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar = null;
        }
        jbVar.S.setAdapter((SpinnerAdapter) oqVar);
        int size = ((ArrayList) objectRef.element).size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) l2().a()).toString(), StringsKt__StringsKt.trim((CharSequence) ((AppCatPojo) ((ArrayList) objectRef.element).get(i2)).getAppCode()).toString())) {
                jb jbVar3 = this.mBinding;
                if (jbVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    jbVar3 = null;
                }
                jbVar3.S.setSelection(i2);
            } else {
                i2++;
            }
        }
        jb jbVar4 = this.mBinding;
        if (jbVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar4 = null;
        }
        jbVar4.S.setOnItemSelectedListener(new a(objectRef));
        if (StringsKt__StringsJVMKt.equals$default(this.bioRecGenesis, "S", false, 2, null)) {
            jb jbVar5 = this.mBinding;
            if (jbVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                jbVar2 = jbVar5;
            }
            jbVar2.S.setEnabled(true);
            return;
        }
        jb jbVar6 = this.mBinding;
        if (jbVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            jbVar2 = jbVar6;
        }
        jbVar2.S.setEnabled(Intrinsics.areEqual(this.appCategory, "0"));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x053c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m2() {
        /*
            Method dump skipped, instruction units count: 1674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity.m2():void");
    }

    public static final void n2(DLDuplicateActivity this$0, View view) {
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

    public static final void o2(DLDuplicateActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        jb jbVar = this$0.mBinding;
        if (jbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar = null;
        }
        jbVar.G.c(false);
        this$0.J2(this$0.Y1().b("service_is_not_present", this$0.getString(R.string.unable_to_get_details)));
    }

    public static final void p2(DLDuplicateActivity this$0, View view) {
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

    public static final void q2(DLDuplicateActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(this$0.l2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                if (this$0.d2().size() > 1) {
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
                    textView.setText(this$0.Y1().b("btn_ok", "OK"));
                    ((TextView) viewFindViewById5).setText(this$0.Y1().b("title_dl_services", "Driving Licence Services"));
                    ((ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.b71
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            DLDuplicateActivity.r2(dialog, view2);
                        }
                    });
                    int size = this$0.d2().size();
                    String str = "";
                    int i2 = 0;
                    String string = "";
                    while (i2 < size) {
                        str = str + ((String) this$0.d2().get(i2)) + '\n';
                        StringBuilder sb = new StringBuilder();
                        sb.append(string);
                        i2++;
                        sb.append(i2);
                        sb.append(".\n");
                        string = sb.toString();
                    }
                    textView2.setText(str);
                    textView3.setText(string);
                    textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.c71
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            DLDuplicateActivity.s2(dialog, view2);
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

    public static final void r2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void s2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void t2() {
        jb jbVar = null;
        if (com.nic.mparivahan.a.a.a(this)) {
            rb1 rb1Var = this.viewModel;
            if (rb1Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                rb1Var = null;
            }
            rb1Var.r("513");
        } else {
            Toast.makeText(getApplicationContext(), Y1().b("service_is_not_present", getString(R.string.unable_to_get_details)), 0).show();
        }
        rb1 rb1Var2 = this.viewModel;
        if (rb1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            rb1Var2 = null;
        }
        rb1Var2.q().g(this, new i(new e()));
        rb1 rb1Var3 = this.viewModel;
        if (rb1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            rb1Var3 = null;
        }
        rb1Var3.o().g(this, new i(new f()));
        jb jbVar2 = this.mBinding;
        if (jbVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            jbVar = jbVar2;
        }
        jbVar.I.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.i71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLDuplicateActivity.u2(this.a, view);
            }
        });
    }

    public static final void u2(DLDuplicateActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final void v2(Intent intent, String lastEndRTO, String lastEndState, String purCode, ArrayList multiList) {
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
            intent.putExtra("bioRecGenesis", this.bioRecGenesis);
            intent.putExtra("allowAddrChangeAtDlservReqst", this.allowAddrChangeAtDlservReqst);
            intent.putExtra("metaflag", this.metaflag);
            intent.putExtra("multiList", multiList);
            intent.putExtra("listHeaderSteps", d2());
            intent.putExtra("COA", this.COA);
            intent.putExtra("serialNo", this.serialNo + 1);
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void w2() {
        jb jbVar = this.mBinding;
        jb jbVar2 = null;
        if (jbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar = null;
        }
        jbVar.P.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.d71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLDuplicateActivity.x2(this.a, view);
            }
        });
        jb jbVar3 = this.mBinding;
        if (jbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar3 = null;
        }
        jbVar3.a0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.e71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLDuplicateActivity.y2(this.a, view);
            }
        });
        jb jbVar4 = this.mBinding;
        if (jbVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar4 = null;
        }
        jbVar4.M.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.f71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLDuplicateActivity.z2(this.a, view);
            }
        });
        jb jbVar5 = this.mBinding;
        if (jbVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar5 = null;
        }
        jbVar5.E.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.g71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLDuplicateActivity.A2(this.a, view);
            }
        });
        jb jbVar6 = this.mBinding;
        if (jbVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            jbVar2 = jbVar6;
        }
        jbVar2.G.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.h71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLDuplicateActivity.B2(this.a, view);
            }
        });
    }

    public static final void x2(DLDuplicateActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        jb jbVar = this$0.mBinding;
        jb jbVar2 = null;
        if (jbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar = null;
        }
        jbVar.a0.setChecked(true);
        jb jbVar3 = this$0.mBinding;
        if (jbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar3 = null;
        }
        jbVar3.M.setChecked(false);
        jb jbVar4 = this$0.mBinding;
        if (jbVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar4 = null;
        }
        jbVar4.z.setText((CharSequence) null);
        jb jbVar5 = this$0.mBinding;
        if (jbVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar5 = null;
        }
        jbVar5.E.setText((CharSequence) null);
        jb jbVar6 = this$0.mBinding;
        if (jbVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar6 = null;
        }
        jbVar6.E.setContentDescription(null);
        jb jbVar7 = this$0.mBinding;
        if (jbVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar7 = null;
        }
        jbVar7.C.setVisibility(8);
        this$0.willingToRelocate = "Y";
        jb jbVar8 = this$0.mBinding;
        if (jbVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar8 = null;
        }
        jbVar8.N.setText((CharSequence) null);
        jb jbVar9 = this$0.mBinding;
        if (jbVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            jbVar2 = jbVar9;
        }
        jbVar2.N.setVisibility(0);
    }

    public static final void y2(DLDuplicateActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.willingToRelocate = "Y";
        jb jbVar = this$0.mBinding;
        jb jbVar2 = null;
        if (jbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar = null;
        }
        jbVar.M.setChecked(false);
        jb jbVar3 = this$0.mBinding;
        if (jbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar3 = null;
        }
        jbVar3.a0.setChecked(true);
        jb jbVar4 = this$0.mBinding;
        if (jbVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar4 = null;
        }
        jbVar4.N.setText((CharSequence) null);
        jb jbVar5 = this$0.mBinding;
        if (jbVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            jbVar2 = jbVar5;
        }
        jbVar2.N.setVisibility(0);
    }

    public static final void z2(DLDuplicateActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.willingToRelocate = "N";
        jb jbVar = this$0.mBinding;
        jb jbVar2 = null;
        if (jbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar = null;
        }
        jbVar.M.setChecked(true);
        jb jbVar3 = this$0.mBinding;
        if (jbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar3 = null;
        }
        jbVar3.a0.setChecked(false);
        jb jbVar4 = this$0.mBinding;
        if (jbVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar4 = null;
        }
        jbVar4.N.setText((CharSequence) null);
        jb jbVar5 = this$0.mBinding;
        if (jbVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            jbVar2 = jbVar5;
        }
        jbVar2.N.setVisibility(8);
    }

    public final void C2() {
        jb jbVar = this.mBinding;
        jb jbVar2 = null;
        if (jbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar = null;
        }
        Editable text = jbVar.E.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0) {
            Toast.makeText(this, Y1().b("label_select_reason", getString(R.string.sel_rsn)), 1).show();
            return;
        }
        jb jbVar3 = this.mBinding;
        if (jbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar3 = null;
        }
        if (jbVar3.C.getVisibility() != 0) {
            if (Intrinsics.areEqual(this.appCategory, "0")) {
                jb jbVar4 = this.mBinding;
                if (jbVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    jbVar4 = null;
                }
                MyTextView txtAppCategory = jbVar4.Y;
                Intrinsics.checkNotNullExpressionValue(txtAppCategory, "txtAppCategory");
                if (txtAppCategory.getVisibility() == 0) {
                    J2(getString(R.string.sel_app_category));
                    return;
                }
            }
            if (!Intrinsics.areEqual(this.willingToRelocate, "Y")) {
                K2();
                return;
            }
            jb jbVar5 = this.mBinding;
            if (jbVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                jbVar5 = null;
            }
            Editable text2 = jbVar5.N.getText();
            Intrinsics.checkNotNull(text2);
            if (text2.length() == 0) {
                J2(Y1().b("edit_dl_serv_emer_cont_no", getString(R.string.emergency_contact)));
                return;
            }
            jb jbVar6 = this.mBinding;
            if (jbVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                jbVar6 = null;
            }
            Editable text3 = jbVar6.N.getText();
            Intrinsics.checkNotNull(text3);
            if (text3.length() < 10) {
                J2(Y1().b("label_log_entr_vali_mobno", getString(R.string.plz_select_bank)));
                return;
            }
            mt6.a aVar = mt6.a;
            jb jbVar7 = this.mBinding;
            if (jbVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                jbVar2 = jbVar7;
            }
            if (aVar.t(String.valueOf(jbVar2.N.getText()))) {
                K2();
                return;
            } else {
                J2(Y1().b("label_log_entr_vali_mobno", getString(R.string.plz_select_bank)));
                return;
            }
        }
        if (Intrinsics.areEqual(this.appCategory, "0")) {
            jb jbVar8 = this.mBinding;
            if (jbVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                jbVar8 = null;
            }
            MyTextView txtAppCategory2 = jbVar8.Y;
            Intrinsics.checkNotNullExpressionValue(txtAppCategory2, "txtAppCategory");
            if (txtAppCategory2.getVisibility() == 0) {
                J2(getString(R.string.sel_app_category));
                return;
            }
        }
        jb jbVar9 = this.mBinding;
        if (jbVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar9 = null;
        }
        Editable text4 = jbVar9.z.getText();
        Intrinsics.checkNotNullExpressionValue(text4, "getText(...)");
        if (text4.length() == 0) {
            J2(Y1().b("label_dl_serv_enter_reas_manul", getString(R.string.enter_Reason)));
            return;
        }
        if (!Intrinsics.areEqual(this.willingToRelocate, "Y")) {
            K2();
            return;
        }
        jb jbVar10 = this.mBinding;
        if (jbVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar10 = null;
        }
        Editable text5 = jbVar10.N.getText();
        Intrinsics.checkNotNull(text5);
        if (text5.length() == 0) {
            J2(Y1().b("edit_dl_serv_emer_cont_no", getString(R.string.emergency_contact)));
            return;
        }
        jb jbVar11 = this.mBinding;
        if (jbVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar11 = null;
        }
        Editable text6 = jbVar11.N.getText();
        Intrinsics.checkNotNull(text6);
        if (text6.length() < 10) {
            J2(Y1().b("label_log_entr_vali_mobno", getString(R.string.plz_select_bank)));
            return;
        }
        mt6.a aVar2 = mt6.a;
        jb jbVar12 = this.mBinding;
        if (jbVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            jbVar2 = jbVar12;
        }
        if (aVar2.t(String.valueOf(jbVar2.N.getText()))) {
            K2();
        } else {
            J2(Y1().b("label_log_entr_vali_mobno", getString(R.string.enter_mobile_no)));
        }
    }

    public final void J2(String message) {
        if (message != null) {
            String strB = Y1().b("nex_parivahan", getString(R.string.app_name));
            Intrinsics.checkNotNull(strB);
            String strB2 = Y1().b("btn_ok", getString(R.string.ok_txt));
            Intrinsics.checkNotNull(strB2);
            o40.q1(this, strB, message, 1, strB2, null, h.c, 16, null);
        }
    }

    public final void L2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appCategory = str;
    }

    public final void M2(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dlDetails = dldetobjX;
    }

    public final void N2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void O2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.listHeaderSteps = arrayList;
    }

    public final void P2(CombineServiceInterface combineServiceInterface) {
        Intrinsics.checkNotNullParameter(combineServiceInterface, "<set-?>");
        this.mCombineServiceInterface = combineServiceInterface;
    }

    public final void Q2(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void R2(DupChangeAddInterface dupChangeAddInterface) {
        Intrinsics.checkNotNullParameter(dupChangeAddInterface, "<set-?>");
        this.mDlService = dupChangeAddInterface;
    }

    public final void S2(qx1 qx1Var) {
        Intrinsics.checkNotNullParameter(qx1Var, "<set-?>");
        this.mDupChangeAddVM = qx1Var;
    }

    public final void T1(String message) {
        String strB = Y1().b("nex_parivahan", getString(R.string.app_name));
        Intrinsics.checkNotNull(strB);
        o40.q1(this, strB, message, 0, null, null, new b(), 24, null);
    }

    public final void T2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.mSessionmanger = ws6Var;
    }

    public final String U1() {
        try {
            String str = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        } catch (Exception e2) {
            e2.printStackTrace();
            return " ";
        }
    }

    public final void U2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.multiListName = arrayList;
    }

    public final DldetobjX V1() {
        DldetobjX dldetobjX = this.dlDetails;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlDetails");
        return null;
    }

    public final void V2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    /* JADX INFO: renamed from: W1, reason: from getter */
    public final String getDlNo() {
        return this.dlNo;
    }

    /* JADX INFO: renamed from: X1, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    public final wa3 Y1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    /* JADX INFO: renamed from: Z1, reason: from getter */
    public final String getLastEndorseRTOCode() {
        return this.lastEndorseRTOCode;
    }

    /* JADX INFO: renamed from: a2, reason: from getter */
    public final String getLastEndorseRto() {
        return this.lastEndorseRto;
    }

    /* JADX INFO: renamed from: b2, reason: from getter */
    public final String getLastEndorseState() {
        return this.lastEndorseState;
    }

    /* JADX INFO: renamed from: c2, reason: from getter */
    public final String getLastEndorseStateCode() {
        return this.lastEndorseStateCode;
    }

    public final ArrayList d2() {
        ArrayList arrayList = this.listHeaderSteps;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("listHeaderSteps");
        return null;
    }

    public final CombineServiceInterface e2() {
        CombineServiceInterface combineServiceInterface = this.mCombineServiceInterface;
        if (combineServiceInterface != null) {
            return combineServiceInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mCombineServiceInterface");
        return null;
    }

    public final DupChangeAddInterface f2() {
        DupChangeAddInterface dupChangeAddInterface = this.mDlService;
        if (dupChangeAddInterface != null) {
            return dupChangeAddInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDlService");
        return null;
    }

    public final qx1 g2() {
        qx1 qx1Var = this.mDupChangeAddVM;
        if (qx1Var != null) {
            return qx1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDupChangeAddVM");
        return null;
    }

    public final ws6 h2() {
        ws6 ws6Var = this.mSessionmanger;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSessionmanger");
        return null;
    }

    /* JADX INFO: renamed from: i2, reason: from getter */
    public final String getMobile_no() {
        return this.Mobile_no;
    }

    public final ArrayList j2() {
        ArrayList arrayList = this.multiListName;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiListName");
        return null;
    }

    /* JADX INFO: renamed from: k2, reason: from getter */
    public final String getPurCode() {
        return this.purCode;
    }

    public final wl5 l2() {
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
        lq7 lq7VarF = kd1.f(this, R.layout.activity_duplicate_dl);
        Intrinsics.checkNotNullExpressionValue(lq7VarF, "setContentView(...)");
        this.mBinding = (jb) lq7VarF;
        Q2(this);
        R2(DupChangeAddInterface.INSTANCE.a(this));
        V2(new wl5(this));
        ta3.a aVar = ta3.a;
        jb jbVar = this.mBinding;
        jb jbVar2 = null;
        if (jbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            jbVar = null;
        }
        aVar.G0(this, jbVar);
        T2(new ws6(this));
        N2(new wa3(this));
        m2();
        t2();
        w2();
        S1();
        if (Intrinsics.areEqual(l2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            D2();
        }
        jb jbVar3 = this.mBinding;
        if (jbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            jbVar2 = jbVar3;
        }
        jbVar2.K.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.x61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLDuplicateActivity.G2(this.a, view);
            }
        });
    }
}
