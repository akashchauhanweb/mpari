package com.nic.mparivahan.dlservices.ui.replacementdl;

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
import android.view.View;
import android.view.Window;
import android.view.WindowMetrics;
import android.widget.AdapterView;
import android.widget.ImageView;
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
import com.nic.mparivahan.dlservices.ReplacementCOA.RepCOAInterface;
import com.nic.mparivahan.dlservices.data.model.AppCatPojo;
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
import com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity;
import com.zepto.ca5;
import com.zepto.cs0;
import com.zepto.da5;
import com.zepto.ds0;
import com.zepto.ea5;
import com.zepto.fs0;
import com.zepto.ha;
import com.zepto.k76;
import com.zepto.kd1;
import com.zepto.kt6;
import com.zepto.lq7;
import com.zepto.mf4;
import com.zepto.mt6;
import com.zepto.o40;
import com.zepto.oq;
import com.zepto.rb1;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.ws6;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\bZ\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b©\u0002\u0010ª\u0002J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J@\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0014j\b\u0012\u0004\u0012\u00020\b`\u0015H\u0002J\u0012\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014J\u0010\u0010\u001b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0006\u0010\u001c\u001a\u00020\bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R$\u0010+\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010/\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R$\u00103\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010&\u001a\u0004\b1\u0010(\"\u0004\b2\u0010*R$\u00107\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010&\u001a\u0004\b5\u0010(\"\u0004\b6\u0010*R$\u0010;\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010&\u001a\u0004\b9\u0010(\"\u0004\b:\u0010*RF\u0010D\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b0<j\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b`=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0018\u0010N\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010&R\u0018\u0010P\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010&R\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010\\\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010&\u001a\u0004\bZ\u0010(\"\u0004\b[\u0010*R\"\u0010`\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010&\u001a\u0004\b^\u0010(\"\u0004\b_\u0010*R\"\u0010d\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010&\u001a\u0004\bb\u0010(\"\u0004\bc\u0010*R$\u0010h\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010&\u001a\u0004\bf\u0010(\"\u0004\bg\u0010*R$\u0010l\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010&\u001a\u0004\bj\u0010(\"\u0004\bk\u0010*R$\u0010p\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010&\u001a\u0004\bn\u0010(\"\u0004\bo\u0010*R$\u0010t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010&\u001a\u0004\br\u0010(\"\u0004\bs\u0010*R$\u0010x\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010&\u001a\u0004\bv\u0010(\"\u0004\bw\u0010*R$\u0010|\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010&\u001a\u0004\bz\u0010(\"\u0004\b{\u0010*R%\u0010\u0080\u0001\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b}\u0010&\u001a\u0004\b~\u0010(\"\u0004\b\u007f\u0010*R(\u0010\u0084\u0001\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010&\u001a\u0005\b\u0082\u0001\u0010(\"\u0005\b\u0083\u0001\u0010*R(\u0010\u0088\u0001\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010&\u001a\u0005\b\u0086\u0001\u0010(\"\u0005\b\u0087\u0001\u0010*R(\u0010\u008c\u0001\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010&\u001a\u0005\b\u008a\u0001\u0010(\"\u0005\b\u008b\u0001\u0010*R(\u0010\u0090\u0001\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010&\u001a\u0005\b\u008e\u0001\u0010(\"\u0005\b\u008f\u0001\u0010*R(\u0010\u0094\u0001\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010&\u001a\u0005\b\u0092\u0001\u0010(\"\u0005\b\u0093\u0001\u0010*R(\u0010\u0098\u0001\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0095\u0001\u0010&\u001a\u0005\b\u0096\u0001\u0010(\"\u0005\b\u0097\u0001\u0010*R(\u0010\u009c\u0001\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0099\u0001\u0010&\u001a\u0005\b\u009a\u0001\u0010(\"\u0005\b\u009b\u0001\u0010*R(\u0010 \u0001\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009d\u0001\u0010&\u001a\u0005\b\u009e\u0001\u0010(\"\u0005\b\u009f\u0001\u0010*R(\u0010¤\u0001\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¡\u0001\u0010&\u001a\u0005\b¢\u0001\u0010(\"\u0005\b£\u0001\u0010*R&\u0010¨\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¥\u0001\u0010&\u001a\u0005\b¦\u0001\u0010(\"\u0005\b§\u0001\u0010*R%\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b©\u0001\u0010&\u001a\u0005\bª\u0001\u0010(\"\u0005\b«\u0001\u0010*R*\u0010³\u0001\u001a\u00030¬\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R*\u0010»\u0001\u001a\u00030´\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R*\u0010Ã\u0001\u001a\u00030¼\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R&\u0010Ç\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÄ\u0001\u0010&\u001a\u0005\bÅ\u0001\u0010(\"\u0005\bÆ\u0001\u0010*R*\u0010Ï\u0001\u001a\u00030È\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÉ\u0001\u0010Ê\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001\"\u0006\bÍ\u0001\u0010Î\u0001R&\u0010Ó\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÐ\u0001\u0010&\u001a\u0005\bÑ\u0001\u0010(\"\u0005\bÒ\u0001\u0010*R&\u0010×\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÔ\u0001\u0010&\u001a\u0005\bÕ\u0001\u0010(\"\u0005\bÖ\u0001\u0010*R&\u0010Û\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bØ\u0001\u0010&\u001a\u0005\bÙ\u0001\u0010(\"\u0005\bÚ\u0001\u0010*R&\u0010ß\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÜ\u0001\u0010&\u001a\u0005\bÝ\u0001\u0010(\"\u0005\bÞ\u0001\u0010*R&\u0010ã\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bà\u0001\u0010&\u001a\u0005\bá\u0001\u0010(\"\u0005\bâ\u0001\u0010*R&\u0010ç\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bä\u0001\u0010&\u001a\u0005\bå\u0001\u0010(\"\u0005\bæ\u0001\u0010*R&\u0010ë\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bè\u0001\u0010&\u001a\u0005\bé\u0001\u0010(\"\u0005\bê\u0001\u0010*R&\u0010ï\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bì\u0001\u0010&\u001a\u0005\bí\u0001\u0010(\"\u0005\bî\u0001\u0010*R&\u0010ó\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bð\u0001\u0010&\u001a\u0005\bñ\u0001\u0010(\"\u0005\bò\u0001\u0010*R*\u0010û\u0001\u001a\u00030ô\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bõ\u0001\u0010ö\u0001\u001a\u0006\b÷\u0001\u0010ø\u0001\"\u0006\bù\u0001\u0010ú\u0001R9\u0010\u0082\u0002\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0014j\b\u0012\u0004\u0012\u00020\b`\u00158\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bü\u0001\u0010ý\u0001\u001a\u0006\bþ\u0001\u0010ÿ\u0001\"\u0006\b\u0080\u0002\u0010\u0081\u0002R9\u0010\u0086\u0002\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0014j\b\u0012\u0004\u0012\u00020\b`\u00158\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0083\u0002\u0010ý\u0001\u001a\u0006\b\u0084\u0002\u0010ÿ\u0001\"\u0006\b\u0085\u0002\u0010\u0081\u0002R)\u0010\u008d\u0002\u001a\u00030\u0087\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0088\u0002\u0010y\u001a\u0006\b\u0089\u0002\u0010\u008a\u0002\"\u0006\b\u008b\u0002\u0010\u008c\u0002R&\u0010\u0091\u0002\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008e\u0002\u0010&\u001a\u0005\b\u008f\u0002\u0010(\"\u0005\b\u0090\u0002\u0010*R)\u0010\u0098\u0002\u001a\u00030\u0092\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0093\u0002\u0010,\u001a\u0006\b\u0094\u0002\u0010\u0095\u0002\"\u0006\b\u0096\u0002\u0010\u0097\u0002R)\u0010\u009c\u0002\u001a\u00030\u0092\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0099\u0002\u0010,\u001a\u0006\b\u009a\u0002\u0010\u0095\u0002\"\u0006\b\u009b\u0002\u0010\u0097\u0002R\u001a\u0010 \u0002\u001a\u00030\u009d\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009e\u0002\u0010\u009f\u0002R*\u0010¨\u0002\u001a\u00030¡\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¢\u0002\u0010£\u0002\u001a\u0006\b¤\u0002\u0010¥\u0002\"\u0006\b¦\u0002\u0010§\u0002¨\u0006«\u0002"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/replacementdl/DLReplecementActivity;", "Lcom/zepto/o40;", "", "w2", "R1", "j2", "k2", "n2", "", "message", "E2", "v2", "S2", "G2", "u2", "Landroid/content/Intent;", "intent", "lastEndRTO", "lastEndState", "purCode", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "multiList", "m2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "F2", "S1", "Lcom/zepto/ha;", "F", "Lcom/zepto/ha;", "mBinding", "Lcom/zepto/rb1;", "G", "Lcom/zepto/rb1;", "viewModel", "H", "Ljava/lang/String;", "getBioRecGenesis", "()Ljava/lang/String;", "setBioRecGenesis", "(Ljava/lang/String;)V", "bioRecGenesis", "I", "getAllowAddrChangeAtDlservReqst", "setAllowAddrChangeAtDlservReqst", "allowAddrChangeAtDlservReqst", "J", "U1", "setDlNo", "dlNo", "K", "V1", "setDob", "dob", "L", "f2", "setMobile_no", "Mobile_no", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "M", "Ljava/util/HashMap;", "getWhatServiceRequired", "()Ljava/util/HashMap;", "setWhatServiceRequired", "(Ljava/util/HashMap;)V", "whatServiceRequired", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "N", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "T1", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "I2", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "dlDetails", "O", "lastEndorseRTOCode", "P", "willingToRelocate", "Lcom/zepto/wl5;", "Q", "Lcom/zepto/wl5;", "i2", "()Lcom/zepto/wl5;", "R2", "(Lcom/zepto/wl5;)V", "sarthiSession", "R", "X1", "setLastEndorseRto", "lastEndorseRto", "S", "Y1", "setLastEndorseState", "lastEndorseState", "T", "Z1", "setLastEndorseStateCode", "lastEndorseStateCode", "U", "getPerHouseNo", "setPerHouseNo", "perHouseNo", "V", "getPerStreet", "setPerStreet", "perStreet", "W", "getPerLocation", "setPerLocation", "perLocation", "X", "getPermVillageOrTown", "setPermVillageOrTown", "permVillageOrTown", "Y", "getPerSubDistrict", "setPerSubDistrict", "perSubDistrict", "Z", "getPerDistrict", "setPerDistrict", "perDistrict", "a0", "getPerState", "setPerState", "perState", "b0", "getPerPinCode", "setPerPinCode", "perPinCode", "c0", "getPresHouseNo", "setPresHouseNo", "presHouseNo", "d0", "getPresStreet", "setPresStreet", "presStreet", "e0", "getPresLocation", "setPresLocation", "presLocation", "f0", "getPresVillageOrTown", "setPresVillageOrTown", "presVillageOrTown", "g0", "getPresSubDistrict", "setPresSubDistrict", "presSubDistrict", "h0", "getPresDistrict", "setPresDistrict", "presDistrict", "i0", "getPresState", "setPresState", "presState", "j0", "getPresPincode", "setPresPincode", "presPincode", "k0", "getState_value", "setState_value", "state_value", "l0", "h2", "setPurCode", "Lcom/zepto/da5;", "m0", "Lcom/zepto/da5;", "d2", "()Lcom/zepto/da5;", "O2", "(Lcom/zepto/da5;)V", "mRepCOAVM", "Lcom/nic/mparivahan/dlservices/ReplacementCOA/RepCOAInterface;", "n0", "Lcom/nic/mparivahan/dlservices/ReplacementCOA/RepCOAInterface;", "c2", "()Lcom/nic/mparivahan/dlservices/ReplacementCOA/RepCOAInterface;", "N2", "(Lcom/nic/mparivahan/dlservices/ReplacementCOA/RepCOAInterface;)V", "mRepCOAInterface", "Lcom/zepto/ws6;", "o0", "Lcom/zepto/ws6;", "e2", "()Lcom/zepto/ws6;", "P2", "(Lcom/zepto/ws6;)V", "mSessionmanger", "p0", "getAppCategory", "H2", "appCategory", "Lcom/zepto/wa3;", "q0", "Lcom/zepto/wa3;", "W1", "()Lcom/zepto/wa3;", "J2", "(Lcom/zepto/wa3;)V", "langSession", "r0", "getForm1FlagDLserReq", "setForm1FlagDLserReq", "form1FlagDLserReq", "s0", "getSubmitFormOne", "setSubmitFormOne", "submitFormOne", "t0", "getAString", "setAString", "aString", "u0", "getBString", "setBString", "bString", "v0", "getCString", "setCString", "cString", "w0", "getDString", "setDString", "dString", "x0", "getEString", "setEString", "eString", "y0", "getFString", "setFString", "fString", "z0", "getGString", "setGString", "gString", "Landroid/content/Context;", "A0", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "M2", "(Landroid/content/Context;)V", "mContext", "B0", "Ljava/util/ArrayList;", "g2", "()Ljava/util/ArrayList;", "Q2", "(Ljava/util/ArrayList;)V", "multiListName", "C0", "a2", "K2", "listHeaderSteps", "", "D0", "getCOA", "()Z", "setCOA", "(Z)V", "COA", "E0", "getMetaflag", "setMetaflag", "metaflag", "", "F0", "getWidthPixels", "()I", "setWidthPixels", "(I)V", "widthPixels", "G0", "getSerialNo", "setSerialNo", "serialNo", "Lcom/zepto/fs0;", "H0", "Lcom/zepto/fs0;", "mCombineViewModel", "Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;", "I0", "Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;", "b2", "()Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;", "L2", "(Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;)V", "mCombineServiceInterface", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class DLReplecementActivity extends o40 {

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    public ArrayList multiListName;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    public ArrayList listHeaderSteps;

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    public boolean COA;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ha mBinding;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    public int widthPixels;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public rb1 viewModel;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    public int serialNo;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String bioRecGenesis;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    public fs0 mCombineViewModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String allowAddrChangeAtDlservReqst;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    public CombineServiceInterface mCombineServiceInterface;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String dlNo;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String dob;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String Mobile_no;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public DldetobjX dlDetails;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public da5 mRepCOAVM;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public RepCOAInterface mRepCOAInterface;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public ws6 mSessionmanger;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public HashMap whatServiceRequired = new HashMap();

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String lastEndorseRTOCode = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String willingToRelocate = "Y";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String lastEndorseRto = "";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String lastEndorseState = "";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String lastEndorseStateCode = "";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String perHouseNo = "";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String perStreet = "";

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String perLocation = "";

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String permVillageOrTown = "";

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String perSubDistrict = "";

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String perDistrict = "";

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String perState = "";

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String perPinCode = "";

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public String presHouseNo = "";

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public String presStreet = "";

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public String presLocation = "";

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public String presVillageOrTown = "";

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public String presSubDistrict = "";

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public String presDistrict = "";

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public String presState = "";

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public String presPincode = "";

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public String state_value = "";

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public String purCode = "0";

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public String appCategory = "0";

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public String form1FlagDLserReq = "N";

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    public String submitFormOne = "N";

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    public String aString = "";

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    public String bString = "";

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public String cString = "";

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    public String dString = "";

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    public String eString = "";

    /* JADX INFO: renamed from: y0, reason: from kotlin metadata */
    public String fString = "";

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    public String gString = "N";

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
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
            DLReplecementActivity.this.H2(((AppCatPojo) ((ArrayList) this.b.element).get(i)).getAppCode());
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
                ha haVar = DLReplecementActivity.this.mBinding;
                if (haVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    haVar = null;
                }
                haVar.A.c(false);
                DlSubmitResult dlSubmitresult = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                if (!StringsKt__StringsJVMKt.equals$default(dlSubmitresult != null ? dlSubmitresult.getStatusCode() : null, "00", false, 2, null)) {
                    DlSubmitResult dlSubmitresult2 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                    String reqStatus = dlSubmitresult2 != null ? dlSubmitresult2.getReqStatus() : null;
                    if (reqStatus != null && reqStatus.length() != 0) {
                        DLReplecementActivity dLReplecementActivity = DLReplecementActivity.this;
                        DlSubmitResult dlSubmitresult3 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                        String reqStatus2 = dlSubmitresult3 != null ? dlSubmitresult3.getReqStatus() : null;
                        Intrinsics.checkNotNull(reqStatus2);
                        dLReplecementActivity.F2(reqStatus2);
                        return;
                    }
                    DLReplecementActivity dLReplecementActivity2 = DLReplecementActivity.this;
                    dLReplecementActivity2.F2(dLReplecementActivity2.W1().b("label_want_to_proceed", DLReplecementActivity.this.getString(R.string.unable_to_get_details)));
                    return;
                }
                DlSubmitResult dlSubmitresult4 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                if (dlSubmitresult4 == null || (result = dlSubmitresult4.getResult()) == null || !(!result.isEmpty())) {
                    return;
                }
                DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity = new DLServiceAcknowlegementActivity();
                ResultItemSubmit resultItemSubmit = getAckDetForGivenDLNumberResponse.getDlSubmitresult().getResult().get(0);
                if (resultItemSubmit != null) {
                    DLReplecementActivity dLReplecementActivity3 = DLReplecementActivity.this;
                    try {
                        DlLogCapture.Companion companion = DlLogCapture.INSTANCE;
                        String applicationDate = resultItemSubmit.getApplicationDate();
                        String applicationNo = resultItemSubmit.getApplicationNo();
                        Intrinsics.checkNotNull(applicationNo);
                        long j = Long.parseLong(applicationNo);
                        int i = Integer.parseInt(dLReplecementActivity3.e2().k());
                        String dateofBirth = resultItemSubmit.getDateofBirth();
                        String dlno = resultItemSubmit.getDlno();
                        Intrinsics.checkNotNull(dlno);
                        String applicantGender = resultItemSubmit.getApplicantGender();
                        String mobile_no = dLReplecementActivity3.getMobile_no();
                        Intrinsics.checkNotNull(mobile_no);
                        String purCode = dLReplecementActivity3.getPurCode();
                        String str = dLReplecementActivity3.lastEndorseRTOCode;
                        Intrinsics.checkNotNull(str);
                        companion.a(dLReplecementActivity3, "1234", "S", applicationDate, j, i, dateofBirth, dlno, "N", "N", applicantGender, mobile_no, false, purCode, str, dLReplecementActivity3.getLastEndorseStateCode());
                    } catch (Exception unused) {
                    }
                    if (!Intrinsics.areEqual(dLReplecementActivity3.i2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                        dLReplecementActivity3.Q2(new ArrayList());
                        dLReplecementActivity3.g2().add(dLReplecementActivity3.i2().k());
                    }
                    dLServiceAcknowlegementActivity.K2(dLReplecementActivity3, resultItemSubmit, dLReplecementActivity3.lastEndorseRTOCode, dLReplecementActivity3.T1(), dLReplecementActivity3.getDlNo(), dLReplecementActivity3.getDob(), dLReplecementActivity3.getMobile_no(), dLReplecementActivity3.getLastEndorseRto(), dLReplecementActivity3.getLastEndorseState(), dLReplecementActivity3.getLastEndorseStateCode(), dLReplecementActivity3.g2());
                }
            } catch (Exception unused2) {
                DLReplecementActivity dLReplecementActivity4 = DLReplecementActivity.this;
                dLReplecementActivity4.F2(dLReplecementActivity4.W1().b("service_is_not_present", DLReplecementActivity.this.getString(R.string.unable_to_get_details)));
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
            ResultItemSubmit resultItemSubmit;
            ha haVar = null;
            try {
                ha haVar2 = DLReplecementActivity.this.mBinding;
                if (haVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    haVar2 = null;
                }
                haVar2.A.c(false);
                DlSubmitResult dlSubmitresult = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                if (!StringsKt__StringsJVMKt.equals(dlSubmitresult != null ? dlSubmitresult.getStatusCode() : null, "00", true)) {
                    DlSubmitResult dlSubmitresult2 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                    String reqStatus = dlSubmitresult2 != null ? dlSubmitresult2.getReqStatus() : null;
                    if (reqStatus != null && reqStatus.length() != 0) {
                        DLReplecementActivity dLReplecementActivity = DLReplecementActivity.this;
                        DlSubmitResult dlSubmitresult3 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                        dLReplecementActivity.F2(dlSubmitresult3 != null ? dlSubmitresult3.getReqStatus() : null);
                        return;
                    }
                    DLReplecementActivity dLReplecementActivity2 = DLReplecementActivity.this;
                    dLReplecementActivity2.F2(dLReplecementActivity2.W1().b("label_want_to_proceed", DLReplecementActivity.this.getString(R.string.unable_to_get_details)));
                    return;
                }
                DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity = new DLServiceAcknowlegementActivity();
                DlSubmitResult dlSubmitresult4 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                if (dlSubmitresult4 == null || (result = dlSubmitresult4.getResult()) == null || (resultItemSubmit = result.get(0)) == null) {
                    return;
                }
                DLReplecementActivity dLReplecementActivity3 = DLReplecementActivity.this;
                DlLogCapture.Companion companion = DlLogCapture.INSTANCE;
                String strS1 = dLReplecementActivity3.S1();
                String applicationNo = resultItemSubmit.getApplicationNo();
                Intrinsics.checkNotNull(applicationNo);
                long j = Long.parseLong(applicationNo);
                int i = Integer.parseInt(dLReplecementActivity3.e2().k());
                String dateofBirth = resultItemSubmit.getDateofBirth();
                String dlno = resultItemSubmit.getDlno();
                Intrinsics.checkNotNull(dlno);
                String applicantGender = resultItemSubmit.getApplicantGender();
                String mobile_no = dLReplecementActivity3.getMobile_no();
                Intrinsics.checkNotNull(mobile_no);
                String purCode = dLReplecementActivity3.getPurCode();
                String str = dLReplecementActivity3.lastEndorseRTOCode;
                Intrinsics.checkNotNull(str);
                companion.a(dLReplecementActivity3, "1234", "S", strS1, j, i, dateofBirth, dlno, "N", "N", applicantGender, mobile_no, false, purCode, str, dLReplecementActivity3.getLastEndorseStateCode());
                if (!Intrinsics.areEqual(dLReplecementActivity3.i2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                    dLReplecementActivity3.Q2(new ArrayList());
                    dLReplecementActivity3.g2().add(dLReplecementActivity3.i2().k());
                }
                dLServiceAcknowlegementActivity.K2(dLReplecementActivity3, resultItemSubmit, dLReplecementActivity3.lastEndorseRTOCode, dLReplecementActivity3.T1(), dLReplecementActivity3.getDlNo(), dLReplecementActivity3.getDob(), dLReplecementActivity3.getMobile_no(), dLReplecementActivity3.getLastEndorseRto(), dLReplecementActivity3.getLastEndorseState(), dLReplecementActivity3.getLastEndorseStateCode(), dLReplecementActivity3.g2());
            } catch (Exception unused) {
                ha haVar3 = DLReplecementActivity.this.mBinding;
                if (haVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    haVar = haVar3;
                }
                haVar.A.c(false);
                DLReplecementActivity dLReplecementActivity4 = DLReplecementActivity.this;
                dLReplecementActivity4.F2(dLReplecementActivity4.W1().b("label_want_to_proceed", DLReplecementActivity.this.getString(R.string.unable_to_get_details)));
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
            ResultItemSubmit resultItemSubmit;
            ha haVar = null;
            try {
                ha haVar2 = DLReplecementActivity.this.mBinding;
                if (haVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    haVar2 = null;
                }
                haVar2.A.c(false);
                DlSubmitResult dlSubmitresult = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                if (!StringsKt__StringsJVMKt.equals(dlSubmitresult != null ? dlSubmitresult.getStatusCode() : null, "00", true)) {
                    DlSubmitResult dlSubmitresult2 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                    String reqStatus = dlSubmitresult2 != null ? dlSubmitresult2.getReqStatus() : null;
                    if (reqStatus != null && reqStatus.length() != 0) {
                        DLReplecementActivity dLReplecementActivity = DLReplecementActivity.this;
                        DlSubmitResult dlSubmitresult3 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                        dLReplecementActivity.F2(dlSubmitresult3 != null ? dlSubmitresult3.getReqStatus() : null);
                        return;
                    }
                    DLReplecementActivity dLReplecementActivity2 = DLReplecementActivity.this;
                    dLReplecementActivity2.F2(dLReplecementActivity2.W1().b("label_want_to_proceed", DLReplecementActivity.this.getString(R.string.unable_to_get_details)));
                    return;
                }
                DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity = new DLServiceAcknowlegementActivity();
                DlSubmitResult dlSubmitresult4 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                if (dlSubmitresult4 == null || (result = dlSubmitresult4.getResult()) == null || (resultItemSubmit = result.get(0)) == null) {
                    return;
                }
                DLReplecementActivity dLReplecementActivity3 = DLReplecementActivity.this;
                DlLogCapture.Companion companion = DlLogCapture.INSTANCE;
                String strS1 = dLReplecementActivity3.S1();
                String applicationNo = resultItemSubmit.getApplicationNo();
                Intrinsics.checkNotNull(applicationNo);
                long j = Long.parseLong(applicationNo);
                int i = Integer.parseInt(dLReplecementActivity3.e2().k());
                String dateofBirth = resultItemSubmit.getDateofBirth();
                String dlno = resultItemSubmit.getDlno();
                Intrinsics.checkNotNull(dlno);
                String applicantGender = resultItemSubmit.getApplicantGender();
                String mobile_no = dLReplecementActivity3.getMobile_no();
                Intrinsics.checkNotNull(mobile_no);
                String purCode = dLReplecementActivity3.getPurCode();
                String str = dLReplecementActivity3.lastEndorseRTOCode;
                Intrinsics.checkNotNull(str);
                companion.a(dLReplecementActivity3, "1234", "S", strS1, j, i, dateofBirth, dlno, "N", "N", applicantGender, mobile_no, false, purCode, str, dLReplecementActivity3.getLastEndorseStateCode());
                if (!Intrinsics.areEqual(dLReplecementActivity3.i2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                    dLReplecementActivity3.Q2(new ArrayList());
                    dLReplecementActivity3.g2().add(dLReplecementActivity3.i2().k());
                }
                dLServiceAcknowlegementActivity.K2(dLReplecementActivity3, resultItemSubmit, dLReplecementActivity3.lastEndorseRTOCode, dLReplecementActivity3.T1(), dLReplecementActivity3.getDlNo(), dLReplecementActivity3.getDob(), dLReplecementActivity3.getMobile_no(), dLReplecementActivity3.getLastEndorseRto(), dLReplecementActivity3.getLastEndorseState(), dLReplecementActivity3.getLastEndorseStateCode(), dLReplecementActivity3.g2());
            } catch (Exception unused) {
                ha haVar3 = DLReplecementActivity.this.mBinding;
                if (haVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    haVar = haVar3;
                }
                haVar.A.c(false);
                DLReplecementActivity dLReplecementActivity4 = DLReplecementActivity.this;
                dLReplecementActivity4.F2(dLReplecementActivity4.W1().b("label_want_to_proceed", DLReplecementActivity.this.getString(R.string.unable_to_get_details)));
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

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (StringsKt__StringsJVMKt.equals(it, "yes", true)) {
                ha haVar = DLReplecementActivity.this.mBinding;
                if (haVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    haVar = null;
                }
                haVar.A.c(true);
                if (Intrinsics.areEqual(DLReplecementActivity.this.willingToRelocate, "Y")) {
                    DLReplecementActivity.this.S2();
                } else {
                    DLReplecementActivity.this.v2();
                }
            }
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

        public final void invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (StringsKt__StringsJVMKt.equals(it, "yes", true)) {
                ha haVar = DLReplecementActivity.this.mBinding;
                if (haVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    haVar = null;
                }
                haVar.A.c(true);
                if (Intrinsics.areEqual(DLReplecementActivity.this.willingToRelocate, "Y")) {
                    DLReplecementActivity.this.S2();
                } else {
                    DLReplecementActivity.this.v2();
                }
            }
        }
    }

    public static final class g extends Lambda implements Function1 {
        public static final g c = new g();

        public g() {
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

    public static final class h implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public h(Function1 function) {
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

    public static final void A2(DLReplecementActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void B2(DLReplecementActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(this$0.i2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                if (this$0.a2().size() > 1) {
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
                    ((ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.s91
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            DLReplecementActivity.C2(dialog, view2);
                        }
                    });
                    int size = this$0.a2().size();
                    String str = "";
                    int i = 0;
                    String string = "";
                    while (i < size) {
                        str = str + ((String) this$0.a2().get(i)) + '\n';
                        StringBuilder sb = new StringBuilder();
                        sb.append(string);
                        i++;
                        sb.append(i);
                        sb.append(".\n");
                        string = sb.toString();
                    }
                    textView2.setText(str);
                    textView3.setText(string);
                    textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.t91
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            DLReplecementActivity.D2(dialog, view2);
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

    private final void E2(String message) {
        rb1 rb1Var;
        rb1 rb1Var2;
        try {
            if (Intrinsics.areEqual(this.state_value, "same") && !Intrinsics.areEqual(this.bioRecGenesis, "S")) {
                String strB = W1().b("nex_parivahan", getString(R.string.app_name));
                Intrinsics.checkNotNull(strB);
                o40.q1(this, strB, message, 0, null, null, new e(), 24, null);
                return;
            }
            String strValueOf = "NA";
            if (Intrinsics.areEqual(this.state_value, "same") && Intrinsics.areEqual(this.bioRecGenesis, "S") && Intrinsics.areEqual(this.allowAddrChangeAtDlservReqst, "Y")) {
                ha haVar = this.mBinding;
                if (haVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    haVar = null;
                }
                haVar.A.c(true);
                if (Intrinsics.areEqual(this.willingToRelocate, "Y")) {
                    ha haVar2 = this.mBinding;
                    if (haVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        haVar2 = null;
                    }
                    strValueOf = String.valueOf(haVar2.H.getText());
                }
                String str = strValueOf;
                rb1 rb1Var3 = this.viewModel;
                if (rb1Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    rb1Var2 = null;
                } else {
                    rb1Var2 = rb1Var3;
                }
                String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(this.dlNo)).toString();
                Intrinsics.checkNotNull(string);
                String str2 = this.dob;
                Intrinsics.checkNotNull(str2);
                String str3 = this.lastEndorseRTOCode;
                Intrinsics.checkNotNull(str3);
                String str4 = this.willingToRelocate;
                Intrinsics.checkNotNull(str4);
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
                rb1Var2.u(string, str2, str3, str, str4, "99", "B", str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, "G", "SarathiMobileService", "10.248.213.244", "975867c068a4e3e043058b5aaeebbeb5", "sakalaHR", i2().f(), i2().g(), i2().e(), i2().h());
                return;
            }
            if (Intrinsics.areEqual(this.state_value, "same") && Intrinsics.areEqual(this.bioRecGenesis, "S") && !Intrinsics.areEqual(this.allowAddrChangeAtDlservReqst, "Y")) {
                String strB2 = W1().b("nex_parivahan", getString(R.string.app_name));
                Intrinsics.checkNotNull(strB2);
                o40.q1(this, strB2, message, 0, null, null, new f(), 24, null);
                return;
            }
            ha haVar3 = this.mBinding;
            if (haVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                haVar3 = null;
            }
            haVar3.A.c(true);
            if (Intrinsics.areEqual(this.willingToRelocate, "Y")) {
                ha haVar4 = this.mBinding;
                if (haVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    haVar4 = null;
                }
                strValueOf = String.valueOf(haVar4.H.getText());
            }
            String str22 = strValueOf;
            rb1 rb1Var4 = this.viewModel;
            if (rb1Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                rb1Var = null;
            } else {
                rb1Var = rb1Var4;
            }
            String string2 = StringsKt__StringsKt.trim((CharSequence) String.valueOf(this.dlNo)).toString();
            Intrinsics.checkNotNull(string2);
            String str23 = this.dob;
            Intrinsics.checkNotNull(str23);
            String str24 = this.lastEndorseRTOCode;
            Intrinsics.checkNotNull(str24);
            String str25 = this.willingToRelocate;
            Intrinsics.checkNotNull(str25);
            String str26 = this.appCategory;
            String str27 = this.perHouseNo;
            Intrinsics.checkNotNull(str27);
            String str28 = this.perStreet;
            Intrinsics.checkNotNull(str28);
            String str29 = this.perLocation;
            Intrinsics.checkNotNull(str29);
            String str30 = this.permVillageOrTown;
            Intrinsics.checkNotNull(str30);
            String str31 = this.perDistrict;
            Intrinsics.checkNotNull(str31);
            String str32 = this.perSubDistrict;
            Intrinsics.checkNotNull(str32);
            String str33 = this.perState;
            Intrinsics.checkNotNull(str33);
            String str34 = this.perPinCode;
            Intrinsics.checkNotNull(str34);
            String str35 = this.presHouseNo;
            Intrinsics.checkNotNull(str35);
            String str36 = this.presStreet;
            Intrinsics.checkNotNull(str36);
            String str37 = this.presLocation;
            Intrinsics.checkNotNull(str37);
            String str38 = this.presVillageOrTown;
            Intrinsics.checkNotNull(str38);
            String str39 = this.presSubDistrict;
            Intrinsics.checkNotNull(str39);
            String str40 = this.presDistrict;
            Intrinsics.checkNotNull(str40);
            String str41 = this.presState;
            Intrinsics.checkNotNull(str41);
            String str42 = this.presPincode;
            Intrinsics.checkNotNull(str42);
            String str43 = this.Mobile_no;
            Intrinsics.checkNotNull(str43);
            rb1Var.v(string2, str23, str24, str22, str25, "99", "Reasons are not defined", str26, "B", str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, "SarathiMobileService", "10.248.213.244", "975867c068a4e3e043058b5aaeebbeb5", "sakalaHR", i2().f(), i2().g(), i2().e(), i2().h());
        } catch (Exception unused) {
        }
    }

    private final void G2() {
        ha haVar = this.mBinding;
        ha haVar2 = null;
        if (haVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar = null;
        }
        if (!haVar.w.isChecked()) {
            F2(W1().b("confirm_declaration", getString(R.string.confirm_dec)));
            return;
        }
        if (!Intrinsics.areEqual(this.willingToRelocate, "Y")) {
            if (!com.nic.mparivahan.a.a.a(this)) {
                Toast.makeText(getApplicationContext(), W1().b("label_want_to_proceed", getString(R.string.unable_to_get_details)), 0).show();
                return;
            } else if (Intrinsics.areEqual(this.appCategory, "0")) {
                F2(getString(R.string.sel_app_category));
                return;
            } else {
                u2();
                return;
            }
        }
        ha haVar3 = this.mBinding;
        if (haVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar3 = null;
        }
        Editable text = haVar3.H.getText();
        Intrinsics.checkNotNull(text);
        if (text.length() == 0) {
            F2(W1().b("edit_dl_serv_emer_cont_no", getString(R.string.emergency_contact)));
            return;
        }
        ha haVar4 = this.mBinding;
        if (haVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar4 = null;
        }
        Editable text2 = haVar4.H.getText();
        Intrinsics.checkNotNull(text2);
        if (text2.length() < 10) {
            F2(W1().b("edit_dl_serv_valid_emer_cont_no", getString(R.string.valid_emergency_con)));
            return;
        }
        mt6.a aVar = mt6.a;
        ha haVar5 = this.mBinding;
        if (haVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            haVar2 = haVar5;
        }
        if (!aVar.t(String.valueOf(haVar2.H.getText()))) {
            F2(W1().b("edit_dl_serv_valid_emer_cont_no", getString(R.string.valid_emergency_con)));
            return;
        }
        if (!com.nic.mparivahan.a.a.a(this)) {
            Toast.makeText(getApplicationContext(), W1().b("label_want_to_proceed", getString(R.string.unable_to_get_details)), 0).show();
        } else if (Intrinsics.areEqual(this.appCategory, "0")) {
            F2(getString(R.string.sel_app_category));
        } else {
            u2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.ArrayList] */
    private final void R1() {
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
        ha haVar = this.mBinding;
        ha haVar2 = null;
        if (haVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar = null;
        }
        haVar.M.setAdapter((SpinnerAdapter) oqVar);
        int size = ((ArrayList) objectRef.element).size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) i2().a()).toString(), StringsKt__StringsKt.trim((CharSequence) ((AppCatPojo) ((ArrayList) objectRef.element).get(i)).getAppCode()).toString())) {
                ha haVar3 = this.mBinding;
                if (haVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    haVar3 = null;
                }
                haVar3.M.setSelection(i);
            } else {
                i++;
            }
        }
        ha haVar4 = this.mBinding;
        if (haVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar4 = null;
        }
        haVar4.M.setOnItemSelectedListener(new a(objectRef));
        if (StringsKt__StringsJVMKt.equals$default(this.bioRecGenesis, "S", false, 2, null)) {
            ha haVar5 = this.mBinding;
            if (haVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                haVar2 = haVar5;
            }
            haVar2.M.setEnabled(true);
            return;
        }
        if (this.appCategory.equals("0")) {
            ha haVar6 = this.mBinding;
            if (haVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                haVar2 = haVar6;
            }
            haVar2.M.setEnabled(true);
            return;
        }
        ha haVar7 = this.mBinding;
        if (haVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            haVar2 = haVar7;
        }
        haVar2.M.setEnabled(false);
    }

    private final void j2() {
        this.viewModel = (rb1) new z(this).a(rb1.class);
        if (getIntent() != null) {
            try {
                this.bioRecGenesis = String.valueOf(getIntent().getStringExtra("bioRecGenesis"));
                this.allowAddrChangeAtDlservReqst = String.valueOf(getIntent().getStringExtra("allowAddrChangeAtDlservReqst"));
                String stringExtra = getIntent().getStringExtra("purCode");
                Intrinsics.checkNotNull(stringExtra, "null cannot be cast to non-null type kotlin.String");
                this.purCode = stringExtra;
                this.dlNo = String.valueOf(getIntent().getStringExtra("DL"));
                this.dob = String.valueOf(getIntent().getStringExtra("dob"));
                this.Mobile_no = String.valueOf(getIntent().getStringExtra("Mobile_no"));
                this.dlNo = String.valueOf(getIntent().getStringExtra("DL"));
                Serializable serializableExtra = getIntent().getSerializableExtra("DLDetails");
                Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
                I2((DldetobjX) serializableExtra);
                String stringExtra2 = getIntent().getStringExtra("state_value");
                Intrinsics.checkNotNull(stringExtra2, "null cannot be cast to non-null type kotlin.String");
                this.state_value = stringExtra2;
                String stringExtra3 = getIntent().getStringExtra("lastEndorsedRTOCode");
                Intrinsics.checkNotNull(stringExtra3, "null cannot be cast to non-null type kotlin.String");
                this.lastEndorseRTOCode = stringExtra3;
                Serializable serializableExtra2 = getIntent().getSerializableExtra("whatServiceRequired");
                Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type java.util.HashMap<kotlin.String?, kotlin.String?>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String?, kotlin.String?> }");
                this.whatServiceRequired = (HashMap) serializableExtra2;
                String stringExtra4 = getIntent().getStringExtra("lastEndorsedRTO");
                Intrinsics.checkNotNull(stringExtra4, "null cannot be cast to non-null type kotlin.String");
                this.lastEndorseRto = stringExtra4;
                String stringExtra5 = getIntent().getStringExtra("lastEndorsedState");
                Intrinsics.checkNotNull(stringExtra5, "null cannot be cast to non-null type kotlin.String");
                this.lastEndorseState = stringExtra5;
                String stringExtra6 = getIntent().getStringExtra("lastEndorseStateCode");
                Intrinsics.checkNotNull(stringExtra6, "null cannot be cast to non-null type kotlin.String");
                this.lastEndorseStateCode = stringExtra6;
                ha haVar = this.mBinding;
                ha haVar2 = null;
                if (haVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    haVar = null;
                }
                haVar.x.setText(W1().b("dl_no", "DL No. : ") + ' ' + this.dlNo);
                BioImgObjX bioImgObj = T1().getBioImgObj();
                String biPhoto = bioImgObj != null ? bioImgObj.getBiPhoto() : null;
                if (biPhoto == null || biPhoto.length() == 0) {
                    ha haVar3 = this.mBinding;
                    if (haVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    } else {
                        haVar2 = haVar3;
                    }
                    haVar2.C.f.setVisibility(4);
                } else {
                    ha haVar4 = this.mBinding;
                    if (haVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        haVar4 = null;
                    }
                    haVar4.C.f.setVisibility(0);
                    ha haVar5 = this.mBinding;
                    if (haVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        haVar5 = null;
                    }
                    ImageView imageView = haVar5.C.b;
                    BioImgObjX bioImgObj2 = T1().getBioImgObj();
                    imageView.setImageBitmap(kt6.a(bioImgObj2 != null ? bioImgObj2.getBiPhoto() : null));
                }
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
            } catch (Exception unused) {
            }
        }
        O2((da5) new z(this, new ea5(new ca5(c2()))).a(da5.class));
    }

    private final void k2() {
        ha haVar = this.mBinding;
        rb1 rb1Var = null;
        if (haVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar = null;
        }
        haVar.C.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ea1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLReplecementActivity.l2(this.a, view);
            }
        });
        rb1 rb1Var2 = this.viewModel;
        if (rb1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            rb1Var = rb1Var2;
        }
        rb1Var.p().g(this, new h(new b()));
    }

    public static final void l2(DLReplecementActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final void m2(Intent intent, String lastEndRTO, String lastEndState, String purCode, ArrayList multiList) {
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
            intent.putExtra("listHeaderSteps", a2());
            intent.putExtra("serialNo", this.serialNo + 1);
            intent.putExtra("COA", this.COA);
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void n2() {
        ha haVar = this.mBinding;
        rb1 rb1Var = null;
        if (haVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar = null;
        }
        haVar.E.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.y91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLReplecementActivity.t2(this.a, view);
            }
        });
        ha haVar2 = this.mBinding;
        if (haVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar2 = null;
        }
        haVar2.J.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.z91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLReplecementActivity.o2(this.a, view);
            }
        });
        ha haVar3 = this.mBinding;
        if (haVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar3 = null;
        }
        haVar3.S.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.aa1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLReplecementActivity.p2(this.a, view);
            }
        });
        ha haVar4 = this.mBinding;
        if (haVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar4 = null;
        }
        haVar4.G.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ba1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLReplecementActivity.q2(this.a, view);
            }
        });
        ha haVar5 = this.mBinding;
        if (haVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar5 = null;
        }
        haVar5.A.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ca1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLReplecementActivity.r2(this.a, view);
            }
        });
        O2((da5) new z(this, new ea5(new ca5(c2()))).a(da5.class));
        rb1 rb1Var2 = this.viewModel;
        if (rb1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            rb1Var2 = null;
        }
        rb1Var2.t().g(this, new h(new c()));
        rb1 rb1Var3 = this.viewModel;
        if (rb1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            rb1Var = rb1Var3;
        }
        rb1Var.s().g(this, new h(new d()));
        d2().g().g(this, new mf4() { // from class: com.zepto.da1
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                DLReplecementActivity.s2(this.a, (String) obj);
            }
        });
    }

    public static final void o2(DLReplecementActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ha haVar = this$0.mBinding;
        ha haVar2 = null;
        if (haVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar = null;
        }
        haVar.S.setChecked(true);
        ha haVar3 = this$0.mBinding;
        if (haVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar3 = null;
        }
        haVar3.G.setChecked(false);
        ha haVar4 = this$0.mBinding;
        if (haVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar4 = null;
        }
        haVar4.w.setChecked(false);
        this$0.willingToRelocate = "Y";
        ha haVar5 = this$0.mBinding;
        if (haVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            haVar2 = haVar5;
        }
        haVar2.H.setVisibility(0);
    }

    public static final void p2(DLReplecementActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.willingToRelocate = "Y";
        ha haVar = this$0.mBinding;
        ha haVar2 = null;
        if (haVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar = null;
        }
        haVar.G.setChecked(false);
        ha haVar3 = this$0.mBinding;
        if (haVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            haVar2 = haVar3;
        }
        haVar2.H.setVisibility(0);
    }

    public static final void q2(DLReplecementActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.willingToRelocate = "N";
        ha haVar = this$0.mBinding;
        ha haVar2 = null;
        if (haVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar = null;
        }
        haVar.S.setChecked(false);
        ha haVar3 = this$0.mBinding;
        if (haVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            haVar2 = haVar3;
        }
        haVar2.H.setVisibility(8);
    }

    public static final void r2(DLReplecementActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(this$0.i2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            this$0.G2();
            return;
        }
        ha haVar = this$0.mBinding;
        ha haVar2 = null;
        if (haVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar = null;
        }
        if (!haVar.w.isChecked()) {
            this$0.F2(this$0.W1().b("confirm_declaration", this$0.getString(R.string.confirm_dec)));
            return;
        }
        if (!Intrinsics.areEqual(this$0.willingToRelocate, "Y")) {
            if (!com.nic.mparivahan.a.a.a(this$0)) {
                Toast.makeText(this$0.getApplicationContext(), this$0.W1().b("label_want_to_proceed", this$0.getString(R.string.unable_to_get_details)), 0).show();
                return;
            } else {
                if (Intrinsics.areEqual(this$0.appCategory, "0")) {
                    this$0.F2(this$0.W1().b("select_app_cat", this$0.getString(R.string.sel_app_category)));
                    return;
                }
                String strB = this$0.W1().b("label_want_to_proceed", this$0.getString(R.string.are_you_want_to_proceed));
                Intrinsics.checkNotNull(strB);
                this$0.E2(strB);
                return;
            }
        }
        if (Intrinsics.areEqual(this$0.appCategory, "0")) {
            this$0.F2(this$0.W1().b("select_app_cat", this$0.getString(R.string.sel_app_category)));
            return;
        }
        ha haVar3 = this$0.mBinding;
        if (haVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar3 = null;
        }
        Editable text = haVar3.H.getText();
        Intrinsics.checkNotNull(text);
        if (text.length() == 0) {
            this$0.F2(this$0.W1().b("edit_dl_serv_emer_cont_no", this$0.getString(R.string.emergency_contact)));
            return;
        }
        ha haVar4 = this$0.mBinding;
        if (haVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar4 = null;
        }
        Editable text2 = haVar4.H.getText();
        Intrinsics.checkNotNull(text2);
        if (text2.length() < 10) {
            this$0.F2(this$0.W1().b("edit_dl_serv_valid_emer_cont_no", this$0.getString(R.string.valid_emergency_con)));
            return;
        }
        mt6.a aVar = mt6.a;
        ha haVar5 = this$0.mBinding;
        if (haVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            haVar2 = haVar5;
        }
        if (!aVar.t(String.valueOf(haVar2.H.getText()))) {
            this$0.F2(this$0.W1().b("edit_dl_serv_valid_emer_cont_no", this$0.getString(R.string.valid_emergency_con)));
        } else {
            if (!com.nic.mparivahan.a.a.a(this$0)) {
                Toast.makeText(this$0.getApplicationContext(), this$0.W1().b("label_want_to_proceed", this$0.getString(R.string.unable_to_get_details)), 0).show();
                return;
            }
            String strB2 = this$0.W1().b("label_want_to_proceed", this$0.getString(R.string.are_you_want_to_proceed));
            Intrinsics.checkNotNull(strB2);
            this$0.E2(strB2);
        }
    }

    public static final void s2(DLReplecementActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ha haVar = this$0.mBinding;
        if (haVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar = null;
        }
        haVar.A.c(false);
        this$0.F2(this$0.W1().b("label_want_to_proceed", this$0.getString(R.string.unable_to_get_details)));
    }

    public static final void t2(DLReplecementActivity this$0, View view) {
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
            if (Intrinsics.areEqual(this$0.i2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", this$0.g2());
            }
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void w2() {
        fs0 fs0Var = this.mCombineViewModel;
        fs0 fs0Var2 = null;
        if (fs0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCombineViewModel");
            fs0Var = null;
        }
        fs0Var.i().g(this, new mf4() { // from class: com.zepto.u91
            @Override // com.zepto.mf4
            public final void a(Object obj) throws Throwable {
                DLReplecementActivity.x2(this.a, (GetAckDetForGivenDLNumberResponse) obj);
            }
        });
        fs0 fs0Var3 = this.mCombineViewModel;
        if (fs0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCombineViewModel");
        } else {
            fs0Var2 = fs0Var3;
        }
        fs0Var2.h().g(this, new mf4() { // from class: com.zepto.v91
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                DLReplecementActivity.y2(this.a, (String) obj);
            }
        });
    }

    /* JADX WARN: Not initialized variable reg: 25, insn: 0x025a: MOVE (r3 I:??[OBJECT, ARRAY]) = (r25 I:??[OBJECT, ARRAY]), block:B:58:0x025a */
    public static final void x2(DLReplecementActivity this$0, GetAckDetForGivenDLNumberResponse getAckDetForGivenDLNumberResponse) throws Throwable {
        int i;
        ha haVar;
        String str;
        String str2;
        List<ResultItemSubmit> result;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ha haVar2 = this$0.mBinding;
        if (haVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar2 = null;
        }
        DLReplecementActivity dLReplecementActivity = null;
        haVar2.A.c(false);
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
                                int i2 = Integer.parseInt(this$0.e2().k());
                                String dateofBirth = resultItemSubmit.getDateofBirth();
                                String dlno = resultItemSubmit.getDlno();
                                Intrinsics.checkNotNull(dlno);
                                String applicantGender = resultItemSubmit.getApplicantGender();
                                String str5 = this$0.Mobile_no;
                                Intrinsics.checkNotNull(str5);
                                try {
                                    String str6 = this$0.lastEndorseRTOCode;
                                    Intrinsics.checkNotNull(str6);
                                    try {
                                        companion.a(this$0, "1234", "S", applicationDate, j, i2, dateofBirth, dlno, "N", "N", applicantGender, str5, false, str4, str6, this$0.lastEndorseStateCode);
                                    } catch (Exception unused) {
                                    }
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                            }
                            dLServiceAcknowlegementActivity.K2(this$0, resultItemSubmit, this$0.lastEndorseRTOCode, this$0.T1(), this$0.dlNo, this$0.dob, this$0.Mobile_no, this$0.lastEndorseRto, this$0.lastEndorseState, this$0.lastEndorseStateCode, this$0.a2());
                            return;
                        }
                        return;
                    } catch (Exception unused4) {
                        haVar = null;
                        dLReplecementActivity = this$0;
                        i = R.string.unable_to_get_details;
                        str = "service_is_not_present";
                    }
                } else {
                    haVar = null;
                    dLReplecementActivity = this$0;
                    DlSubmitResult dlSubmitresult3 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                    String reqStatus = dlSubmitresult3 != null ? dlSubmitresult3.getReqStatus() : null;
                    if (reqStatus != null && reqStatus.length() != 0) {
                        DlSubmitResult dlSubmitresult4 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                        String reqStatus2 = dlSubmitresult4 != null ? dlSubmitresult4.getReqStatus() : null;
                        Intrinsics.checkNotNull(reqStatus2);
                        dLReplecementActivity.F2(reqStatus2);
                        return;
                    }
                    wa3 wa3VarW1 = this$0.W1();
                    i = R.string.unable_to_get_details;
                    try {
                        str = "service_is_not_present";
                        try {
                            dLReplecementActivity.F2(wa3VarW1.b(str, dLReplecementActivity.getString(R.string.unable_to_get_details)));
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
            haVar = null;
            str = "service_is_not_present";
            dLReplecementActivity = this$0;
        }
        ha haVar3 = dLReplecementActivity.mBinding;
        if (haVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar3 = haVar;
        }
        haVar3.A.c(false);
        dLReplecementActivity.F2(this$0.W1().b(str, dLReplecementActivity.getString(i)));
    }

    public static final void y2(DLReplecementActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ha haVar = this$0.mBinding;
        if (haVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar = null;
        }
        haVar.A.c(false);
        this$0.F2(this$0.W1().b("service_is_not_present", this$0.getString(R.string.unable_to_get_details)));
    }

    public static final void z2(DLReplecementActivity this$0, View view) {
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

    public final void F2(String message) {
        if (message != null) {
            String strB = W1().b("nex_parivahan", getString(R.string.app_name));
            Intrinsics.checkNotNull(strB);
            String strB2 = W1().b("btn_ok", getString(R.string.ok_txt));
            Intrinsics.checkNotNull(strB2);
            o40.q1(this, strB, message, 1, strB2, null, g.c, 16, null);
        }
    }

    public final void H2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appCategory = str;
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

    public final void L2(CombineServiceInterface combineServiceInterface) {
        Intrinsics.checkNotNullParameter(combineServiceInterface, "<set-?>");
        this.mCombineServiceInterface = combineServiceInterface;
    }

    public final void M2(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void N2(RepCOAInterface repCOAInterface) {
        Intrinsics.checkNotNullParameter(repCOAInterface, "<set-?>");
        this.mRepCOAInterface = repCOAInterface;
    }

    public final void O2(da5 da5Var) {
        Intrinsics.checkNotNullParameter(da5Var, "<set-?>");
        this.mRepCOAVM = da5Var;
    }

    public final void P2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.mSessionmanger = ws6Var;
    }

    public final void Q2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.multiListName = arrayList;
    }

    public final void R2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final String S1() {
        try {
            String str = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        } catch (Exception e2) {
            e2.printStackTrace();
            return " ";
        }
    }

    public final void S2() {
        rb1 rb1Var;
        rb1 rb1Var2 = this.viewModel;
        ha haVar = null;
        if (rb1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            rb1Var = null;
        } else {
            rb1Var = rb1Var2;
        }
        String str = this.dlNo;
        String str2 = this.dob;
        String str3 = this.lastEndorseRTOCode;
        String str4 = this.willingToRelocate;
        ha haVar2 = this.mBinding;
        if (haVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            haVar = haVar2;
        }
        String strValueOf = String.valueOf(haVar.H.getText());
        String str5 = this.Mobile_no;
        Intrinsics.checkNotNull(str5);
        rb1Var.k(str, str2, str3, "99", "Reasons are not defined", str4, strValueOf, str5, i2().f(), i2().g(), i2().e(), i2().h());
    }

    public final DldetobjX T1() {
        DldetobjX dldetobjX = this.dlDetails;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlDetails");
        return null;
    }

    /* JADX INFO: renamed from: U1, reason: from getter */
    public final String getDlNo() {
        return this.dlNo;
    }

    /* JADX INFO: renamed from: V1, reason: from getter */
    public final String getDob() {
        return this.dob;
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
    public final String getLastEndorseRto() {
        return this.lastEndorseRto;
    }

    /* JADX INFO: renamed from: Y1, reason: from getter */
    public final String getLastEndorseState() {
        return this.lastEndorseState;
    }

    /* JADX INFO: renamed from: Z1, reason: from getter */
    public final String getLastEndorseStateCode() {
        return this.lastEndorseStateCode;
    }

    public final ArrayList a2() {
        ArrayList arrayList = this.listHeaderSteps;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("listHeaderSteps");
        return null;
    }

    public final CombineServiceInterface b2() {
        CombineServiceInterface combineServiceInterface = this.mCombineServiceInterface;
        if (combineServiceInterface != null) {
            return combineServiceInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mCombineServiceInterface");
        return null;
    }

    public final RepCOAInterface c2() {
        RepCOAInterface repCOAInterface = this.mRepCOAInterface;
        if (repCOAInterface != null) {
            return repCOAInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRepCOAInterface");
        return null;
    }

    public final da5 d2() {
        da5 da5Var = this.mRepCOAVM;
        if (da5Var != null) {
            return da5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRepCOAVM");
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

    /* JADX INFO: renamed from: h2, reason: from getter */
    public final String getPurCode() {
        return this.purCode;
    }

    public final wl5 i2() {
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
        lq7 lq7VarF = kd1.f(this, R.layout.activity_dl_replacement);
        Intrinsics.checkNotNullExpressionValue(lq7VarF, "setContentView(...)");
        this.mBinding = (ha) lq7VarF;
        M2(this);
        R2(new wl5(this));
        J2(new wa3(this));
        ta3.a aVar = ta3.a;
        ha haVar = this.mBinding;
        ha haVar2 = null;
        if (haVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar = null;
        }
        aVar.J1(this, haVar);
        P2(new ws6(this));
        N2(RepCOAInterface.INSTANCE.a(this));
        j2();
        k2();
        n2();
        ha haVar3 = this.mBinding;
        if (haVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar3 = null;
        }
        TextView textView = haVar3.R;
        ha haVar4 = this.mBinding;
        if (haVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar4 = null;
        }
        textView.setPaintFlags(haVar4.R.getPaintFlags() | 8);
        ha haVar5 = this.mBinding;
        if (haVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar5 = null;
        }
        haVar5.R.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.r91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLReplecementActivity.z2(this.a, view);
            }
        });
        R1();
        if (Intrinsics.areEqual(i2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            w2();
        }
        ha haVar6 = this.mBinding;
        if (haVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar6 = null;
        }
        haVar6.E.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.w91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLReplecementActivity.A2(this.a, view);
            }
        });
        ha haVar7 = this.mBinding;
        if (haVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar7 = null;
        }
        haVar7.E.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.x91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLReplecementActivity.B2(this.a, view);
            }
        });
        if (Intrinsics.areEqual(i2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                this.serialNo = getIntent().getIntExtra("serialNo", 0);
                Serializable serializableExtra = getIntent().getSerializableExtra("multiList");
                Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                Q2((ArrayList) serializableExtra);
                Serializable serializableExtra2 = getIntent().getSerializableExtra("listHeaderSteps");
                Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                K2((ArrayList) serializableExtra2);
                Serializable serializableExtra3 = getIntent().getSerializableExtra("COA");
                Intrinsics.checkNotNull(serializableExtra3, "null cannot be cast to non-null type kotlin.Boolean");
                this.COA = ((Boolean) serializableExtra3).booleanValue();
                String stringExtra = getIntent().getStringExtra("metaflag");
                Intrinsics.checkNotNull(stringExtra, "null cannot be cast to non-null type kotlin.String");
                this.metaflag = stringExtra;
                L2(CombineServiceInterface.INSTANCE.a(this));
                this.mCombineViewModel = (fs0) new z(this, new ds0(new cs0(b2()))).a(fs0.class);
                if (Build.VERSION.SDK_INT >= 30) {
                    WindowMetrics maximumWindowMetrics = getWindowManager().getMaximumWindowMetrics();
                    Intrinsics.checkNotNullExpressionValue(maximumWindowMetrics, "getMaximumWindowMetrics(...)");
                    Rect bounds = maximumWindowMetrics.getBounds();
                    Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
                    this.widthPixels = bounds.right;
                } else {
                    this.widthPixels = getResources().getDisplayMetrics().widthPixels;
                }
                if (Intrinsics.areEqual(i2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                    try {
                        if (a2().size() > 1) {
                            ha haVar8 = this.mBinding;
                            if (haVar8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                                haVar8 = null;
                            }
                            haVar8.F.setLayoutManager(new LinearLayoutManager(this, 0, false));
                            ArrayList arrayListA2 = a2();
                            int i = this.serialNo;
                            int i2 = this.widthPixels;
                            String strB = W1().b("check_dl_serv_replacement_dl", "Replacement of DL");
                            Intrinsics.checkNotNull(strB);
                            k76 k76Var = new k76(arrayListA2, this, i, i2, strB);
                            ha haVar9 = this.mBinding;
                            if (haVar9 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                                haVar9 = null;
                            }
                            haVar9.F.setAdapter(k76Var);
                        }
                    } catch (Exception unused) {
                    }
                }
                if (this.serialNo == g2().size()) {
                    ha haVar10 = this.mBinding;
                    if (haVar10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        haVar10 = null;
                    }
                    haVar10.A.setText(W1().b("vahan_btn_submit", "Submit"));
                    ha haVar11 = this.mBinding;
                    if (haVar11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        haVar11 = null;
                    }
                    haVar11.y.setVisibility(0);
                    this.willingToRelocate = "Y";
                } else {
                    ha haVar12 = this.mBinding;
                    if (haVar12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        haVar12 = null;
                    }
                    haVar12.A.setText(W1().b("btn_dl_serv_next", "Next"));
                    ha haVar13 = this.mBinding;
                    if (haVar13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        haVar13 = null;
                    }
                    haVar13.y.setVisibility(8);
                    this.willingToRelocate = "N";
                }
            } catch (Exception unused2) {
            }
        }
        if (Intrinsics.areEqual(i2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                if (a2().size() == 1) {
                    ha haVar14 = this.mBinding;
                    if (haVar14 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        haVar14 = null;
                    }
                    haVar14.E.g.setText((CharSequence) a2().get(0));
                } else {
                    ha haVar15 = this.mBinding;
                    if (haVar15 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        haVar15 = null;
                    }
                    TextView textView2 = haVar15.E.g;
                    String strB2 = W1().b("dl_services", getString(R.string.dl_services));
                    Intrinsics.checkNotNull(strB2);
                    textView2.setText(strB2);
                    ha haVar16 = this.mBinding;
                    if (haVar16 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        haVar16 = null;
                    }
                    TextView textView3 = haVar16.E.g;
                    ha haVar17 = this.mBinding;
                    if (haVar17 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        haVar17 = null;
                    }
                    textView3.setPaintFlags(haVar17.E.g.getPaintFlags() | 8);
                }
            } catch (Exception unused3) {
            }
        } else {
            ha haVar18 = this.mBinding;
            if (haVar18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                haVar18 = null;
            }
            haVar18.E.g.setText(W1().b("check_dl_serv_replacement_dl", "Replacement of DL"));
        }
        ha haVar19 = this.mBinding;
        if (haVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar19 = null;
        }
        haVar19.E.e.setVisibility(8);
        ha haVar20 = this.mBinding;
        if (haVar20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar20 = null;
        }
        haVar20.C.g.setText(i2().k());
        ha haVar21 = this.mBinding;
        if (haVar21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            haVar21 = null;
        }
        haVar21.R.setVisibility(0);
        ha haVar22 = this.mBinding;
        if (haVar22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            haVar2 = haVar22;
        }
        haVar2.x.setVisibility(0);
    }

    public final void u2() {
        fs0 fs0Var;
        String strValueOf = "";
        ha haVar = null;
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
                combineReq2.setDupDlReasonName("NA");
                combineReq2.setDupDlReasonCode("99");
                combineReq2.setApplcatgDLserReq(combineReq.getApplcatgDLserReq());
                combineReq2.setDleDlReasonCode(combineReq.getDleDlReasonCode());
                combineReq2.setDleDlReasonName(combineReq.getDleDlReasonName());
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
                combineReq2.setDeclaringcheck(combineReq.getDeclaringcheck());
                combineReq2.setHillcertificate(combineReq.getHillcertificate());
                combineReq2.setHillissueDate(combineReq.getHillissueDate());
                combineReq2.setHillvalidFrom(combineReq.getHillvalidFrom());
                combineReq2.setHillvalidTo(combineReq.getHillvalidTo());
                combineReq2.setHilldrivingschool(combineReq.getHilldrivingschool());
                combineReq2.setHillissby(combineReq.getHillissby());
                if (Intrinsics.areEqual(this.willingToRelocate, "Y")) {
                    combineReq2.setWilltoDonateOrgans("Y");
                    ha haVar2 = this.mBinding;
                    if (haVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    } else {
                        haVar = haVar2;
                    }
                    combineReq2.setDlHolderAltMobMum(String.valueOf(haVar.H.getText()));
                } else {
                    combineReq2.setWilltoDonateOrgans("N");
                    combineReq2.setDlHolderAltMobMum("NA");
                }
                SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit();
                editorEdit.putString("MultiService", new Gson().toJson(combineReq2));
                editorEdit.commit();
                if (Intrinsics.areEqual(g2().get(this.serialNo), W1().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                    setIntent(new Intent(this, (Class<?>) DLDuplicateActivity.class));
                    Intent intent = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                    String str = this.lastEndorseRTOCode;
                    Intrinsics.checkNotNull(str);
                    m2(intent, str, this.lastEndorseState, "513", g2());
                    return;
                }
                if (Intrinsics.areEqual(g2().get(this.serialNo), W1().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                    setIntent(new Intent(this, (Class<?>) RenewalOfDLActivity.class));
                    Intent intent2 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
                    String str2 = this.lastEndorseRTOCode;
                    Intrinsics.checkNotNull(str2);
                    m2(intent2, str2, this.lastEndorseState, "514", g2());
                    return;
                }
                if (Intrinsics.areEqual(g2().get(this.serialNo), W1().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                    setIntent(new Intent(this, (Class<?>) RenewalOfDLActivity.class));
                    Intent intent3 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent3, "getIntent(...)");
                    String str3 = this.lastEndorseRTOCode;
                    Intrinsics.checkNotNull(str3);
                    m2(intent3, str3, this.lastEndorseState, "537", g2());
                    return;
                }
                if (Intrinsics.areEqual(g2().get(this.serialNo), W1().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                    setIntent(new Intent(this, (Class<?>) ChangeOfAddressActivity.class));
                    Intent intent4 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent4, "getIntent(...)");
                    String str4 = this.lastEndorseRTOCode;
                    Intrinsics.checkNotNull(str4);
                    m2(intent4, str4, this.lastEndorseState, "515", g2());
                    return;
                }
                if (Intrinsics.areEqual(g2().get(this.serialNo), W1().b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                    setIntent(new Intent(this, (Class<?>) DLReplecementActivity.class));
                    Intent intent5 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent5, "getIntent(...)");
                    String str5 = this.lastEndorseRTOCode;
                    Intrinsics.checkNotNull(str5);
                    m2(intent5, str5, this.lastEndorseState, "516", g2());
                    return;
                }
                if (Intrinsics.areEqual(g2().get(this.serialNo), W1().b("check_dl_serv_extract_dl", "DL Extract"))) {
                    setIntent(new Intent(this, (Class<?>) DLExtractActivity.class));
                    Intent intent6 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent6, "getIntent(...)");
                    String str6 = this.lastEndorseRTOCode;
                    Intrinsics.checkNotNull(str6);
                    m2(intent6, str6, this.lastEndorseState, "523", g2());
                    return;
                }
                if (Intrinsics.areEqual(g2().get(this.serialNo), W1().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                    setIntent(new Intent(this, (Class<?>) HillReligion.class));
                    Intent intent7 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent7, "getIntent(...)");
                    String str7 = this.lastEndorseRTOCode;
                    Intrinsics.checkNotNull(str7);
                    m2(intent7, str7, this.lastEndorseState, "524", g2());
                    return;
                }
                if (Intrinsics.areEqual(g2().get(this.serialNo), W1().b("change_name_dl", "Change of Name in DL"))) {
                    setIntent(new Intent(this, (Class<?>) ChangeOfName.class));
                    Intent intent8 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent8, "getIntent(...)");
                    String str8 = this.lastEndorseRTOCode;
                    Intrinsics.checkNotNull(str8);
                    m2(intent8, str8, this.lastEndorseState, "526", g2());
                    return;
                }
                if (Intrinsics.areEqual(g2().get(this.serialNo), W1().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                    setIntent(new Intent(this, (Class<?>) DobChangeActivity.class));
                    Intent intent9 = getIntent();
                    Intrinsics.checkNotNullExpressionValue(intent9, "getIntent(...)");
                    String str9 = this.lastEndorseRTOCode;
                    Intrinsics.checkNotNull(str9);
                    m2(intent9, str9, this.lastEndorseState, "548", g2());
                    return;
                }
                return;
            }
            if (!com.nic.mparivahan.a.a.a(this)) {
                Toast.makeText(getApplicationContext(), W1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
                return;
            }
            CombineReq combineReq3 = (CombineReq) new Gson().fromJson(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getString("MultiService", ""), CombineReq.class);
            ha haVar3 = this.mBinding;
            if (haVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                haVar3 = null;
            }
            haVar3.A.c(true);
            if (Intrinsics.areEqual(this.willingToRelocate, "Y")) {
                ha haVar4 = this.mBinding;
                if (haVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    haVar4 = null;
                }
                strValueOf = String.valueOf(haVar4.H.getText());
            }
            String str10 = strValueOf;
            ArrayList arrayList = new ArrayList();
            int size = T1().getDlcovs().size();
            for (int i = 0; i < size; i++) {
                arrayList.add(String.valueOf(T1().getDlcovs().get(i).getDcCovcd()));
            }
            fs0 fs0Var2 = this.mCombineViewModel;
            if (fs0Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCombineViewModel");
                fs0Var = null;
            } else {
                fs0Var = fs0Var2;
            }
            boolean z = this.COA;
            String str11 = this.bioRecGenesis;
            Intrinsics.checkNotNull(str11);
            String str12 = this.allowAddrChangeAtDlservReqst;
            Intrinsics.checkNotNull(str12);
            ArrayList arrayListG2 = g2();
            String str13 = this.appCategory;
            String str14 = this.dlNo;
            Intrinsics.checkNotNull(str14);
            String str15 = this.dob;
            Intrinsics.checkNotNull(str15);
            String str16 = this.lastEndorseRTOCode;
            Intrinsics.checkNotNull(str16);
            String str17 = this.willingToRelocate;
            Intrinsics.checkNotNull(str17);
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
            String str18 = this.Mobile_no;
            Intrinsics.checkNotNull(str18);
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
            fs0Var.g(z, arrayList, str11, str12, arrayListG2, "mobSARATHI", "657d1c758e2e95af0014e16f5109f933", "10.248.210.8", "sarathiservice", str13, str10, str14, str15, str16, str17, relationType, strValueOf2, conDlReasonName, dlHolderNaturalName, conEffdate, applFirstName, applLastName, relFirstName, relLastName, str18, changeOfAddReq, perHouseNo, perStreet, perLocation, permVillageOrTown, perSubDistrict, perDistrict, perState, perPinCode, presHouseNo, presStreet, presLocation, presVillageOrTown, presSubDistrict, presDistrict, presState, presPincode, dleDlReasonCode, dleDlReasonName, "NA", "99", applDateOfBirth, codobDlReasonName, codobDlReasonCode, declaringcheck, hillcertificate, hillissueDate, hillvalidFrom, hillvalidTo, hilldrivingschool, hillissby, pofbirth, country, passno, passvaltill, visano, visavaltill, tovisit, iscountryrestricted, countryRestrictedReason, strIsDlSerdisqualified, dlSerdisqualifiedReason, forAdd1, forAdd2, forAdd3, forAddPinCode, forNationMobNum, emailID, appliedIdpfromIndEmb, indEmbName, embPlace, dateOfVerifEmb, embEndorseNo, idpcountryapplyfrom, i2().f(), i2().g(), i2().e(), i2().h());
        } catch (Exception unused) {
        }
    }

    public final void v2() {
        rb1 rb1Var = this.viewModel;
        if (rb1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            rb1Var = null;
        }
        String str = this.dlNo;
        String str2 = this.dob;
        String str3 = this.lastEndorseRTOCode;
        String str4 = this.willingToRelocate;
        String str5 = this.Mobile_no;
        Intrinsics.checkNotNull(str5);
        rb1Var.k(str, str2, str3, "99", "Reasons are not defined", str4, " ", str5, i2().f(), i2().g(), i2().e(), i2().h());
    }
}
