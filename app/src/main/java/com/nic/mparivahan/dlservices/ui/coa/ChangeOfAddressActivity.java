package com.nic.mparivahan.dlservices.ui.coa;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowMetrics;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.gson.Gson;
import com.nic.mparivahan.DLServicesAuth.View.DlServiceDetailsActivity;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.DOEkycX;
import com.nic.mparivahan.Dl.Model.BioImgObjX;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.DlCombineServices.CombineReq;
import com.nic.mparivahan.DlCombineServices.CombineServiceInterface;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.DlLog.DlLogCapture;
import com.nic.mparivahan.dlservices.data.model.AppCatPojo;
import com.nic.mparivahan.dlservices.data.model.DistResponse;
import com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem;
import com.nic.mparivahan.dlservices.data.model.DlAddress;
import com.nic.mparivahan.dlservices.data.model.DlRenewalSaveDto;
import com.nic.mparivahan.dlservices.data.model.DlSubmitResult;
import com.nic.mparivahan.dlservices.data.model.ResultItemSubmit;
import com.nic.mparivahan.dlservices.data.model.StateMasterItem;
import com.nic.mparivahan.dlservices.data.model.StateResponse;
import com.nic.mparivahan.dlservices.data.model.TalukaMasterItem;
import com.nic.mparivahan.dlservices.data.model.TalukaResponse;
import com.nic.mparivahan.dlservices.data.model.VillageOrTownMasterItem;
import com.nic.mparivahan.dlservices.data.model.VillageOrTownResponse;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse;
import com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity;
import com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName;
import com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity;
import com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity;
import com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity;
import com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity;
import com.nic.mparivahan.dlservices.ui.hillService.HillReligion;
import com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity;
import com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity;
import com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity;
import com.zepto.a7;
import com.zepto.cs0;
import com.zepto.d86;
import com.zepto.ds0;
import com.zepto.fs0;
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
import com.zepto.ws6;
import com.zepto.xh0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
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
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bª\u0002\u0010«\u0002J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0003J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0002J\b\u0010\u0017\u001a\u00020\u0002H\u0002J\b\u0010\u0018\u001a\u00020\u0002H\u0002J\b\u0010\u0019\u001a\u00020\u0002H\u0002J\b\u0010\u001a\u001a\u00020\u0002H\u0002J\b\u0010\u001b\u001a\u00020\u0002H\u0002J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u0012\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u000eH\u0002J6\u0010&\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0$H\u0002J\u0012\u0010)\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010'H\u0014R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R \u00102\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010/\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R \u00105\u001a\f\u0012\u0006\u0012\u0004\u0018\u000103\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00101R \u00107\u001a\f\u0012\u0006\u0012\u0004\u0018\u000103\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00101R \u0010:\u001a\f\u0012\u0006\u0012\u0004\u0018\u000108\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00101R \u0010<\u001a\f\u0012\u0006\u0012\u0004\u0018\u000108\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00101R \u0010?\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010=\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00101R \u0010A\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010=\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00101R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010H\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010T\u001a\u00020I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010K\u001a\u0004\bR\u0010M\"\u0004\bS\u0010OR\"\u0010Z\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010G\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010^\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010G\u001a\u0004\b\\\u0010W\"\u0004\b]\u0010YR$\u0010b\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010G\u001a\u0004\b`\u0010W\"\u0004\ba\u0010YR$\u0010f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010G\u001a\u0004\bd\u0010W\"\u0004\be\u0010YR$\u0010j\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010G\u001a\u0004\bh\u0010W\"\u0004\bi\u0010YR\"\u0010n\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010G\u001a\u0004\bl\u0010W\"\u0004\bm\u0010YR\"\u0010r\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010G\u001a\u0004\bp\u0010W\"\u0004\bq\u0010YR\"\u0010v\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010G\u001a\u0004\bt\u0010W\"\u0004\bu\u0010YR\"\u0010z\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010G\u001a\u0004\bx\u0010W\"\u0004\by\u0010YR\"\u0010~\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b{\u0010G\u001a\u0004\b|\u0010W\"\u0004\b}\u0010YR%\u0010\u0082\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u007f\u0010G\u001a\u0005\b\u0080\u0001\u0010W\"\u0005\b\u0081\u0001\u0010YR%\u0010#\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010G\u001a\u0005\b\u0084\u0001\u0010W\"\u0005\b\u0085\u0001\u0010YR:\u0010\u008d\u0001\u001a\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0086\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R*\u0010\u0095\u0001\u001a\u00030\u008e\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R*\u0010\u009d\u0001\u001a\u00030\u0096\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R*\u0010¥\u0001\u001a\u00030\u009e\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R*\u0010\u00ad\u0001\u001a\u00030¦\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R&\u0010±\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b®\u0001\u0010G\u001a\u0005\b¯\u0001\u0010W\"\u0005\b°\u0001\u0010YR&\u0010µ\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b²\u0001\u0010G\u001a\u0005\b³\u0001\u0010W\"\u0005\b´\u0001\u0010YR&\u0010¹\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¶\u0001\u0010G\u001a\u0005\b·\u0001\u0010W\"\u0005\b¸\u0001\u0010YR*\u0010Á\u0001\u001a\u00030º\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001\"\u0006\b¿\u0001\u0010À\u0001R&\u0010Å\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÂ\u0001\u0010G\u001a\u0005\bÃ\u0001\u0010W\"\u0005\bÄ\u0001\u0010YR&\u0010É\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÆ\u0001\u0010G\u001a\u0005\bÇ\u0001\u0010W\"\u0005\bÈ\u0001\u0010YR&\u0010Í\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÊ\u0001\u0010G\u001a\u0005\bË\u0001\u0010W\"\u0005\bÌ\u0001\u0010YR&\u0010Ñ\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÎ\u0001\u0010G\u001a\u0005\bÏ\u0001\u0010W\"\u0005\bÐ\u0001\u0010YR&\u0010Õ\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÒ\u0001\u0010G\u001a\u0005\bÓ\u0001\u0010W\"\u0005\bÔ\u0001\u0010YR&\u0010Ù\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÖ\u0001\u0010G\u001a\u0005\b×\u0001\u0010W\"\u0005\bØ\u0001\u0010YR&\u0010Ý\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÚ\u0001\u0010G\u001a\u0005\bÛ\u0001\u0010W\"\u0005\bÜ\u0001\u0010YR&\u0010á\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÞ\u0001\u0010G\u001a\u0005\bß\u0001\u0010W\"\u0005\bà\u0001\u0010YR&\u0010å\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bâ\u0001\u0010G\u001a\u0005\bã\u0001\u0010W\"\u0005\bä\u0001\u0010YR*\u0010í\u0001\u001a\u00030æ\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bç\u0001\u0010è\u0001\u001a\u0006\bé\u0001\u0010ê\u0001\"\u0006\bë\u0001\u0010ì\u0001R/\u0010ô\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0$8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bî\u0001\u0010ï\u0001\u001a\u0006\bð\u0001\u0010ñ\u0001\"\u0006\bò\u0001\u0010ó\u0001R/\u0010ø\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0$8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bõ\u0001\u0010ï\u0001\u001a\u0006\bö\u0001\u0010ñ\u0001\"\u0006\b÷\u0001\u0010ó\u0001R(\u0010þ\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bù\u0001\u0010w\u001a\u0006\bú\u0001\u0010û\u0001\"\u0006\bü\u0001\u0010ý\u0001R)\u0010\u0085\u0002\u001a\u00030ÿ\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0080\u0002\u00106\u001a\u0006\b\u0081\u0002\u0010\u0082\u0002\"\u0006\b\u0083\u0002\u0010\u0084\u0002R)\u0010\u0089\u0002\u001a\u00030ÿ\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0086\u0002\u00106\u001a\u0006\b\u0087\u0002\u0010\u0082\u0002\"\u0006\b\u0088\u0002\u0010\u0084\u0002R&\u0010\u008d\u0002\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008a\u0002\u0010G\u001a\u0005\b\u008b\u0002\u0010W\"\u0005\b\u008c\u0002\u0010YR\u001a\u0010\u0091\u0002\u001a\u00030\u008e\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008f\u0002\u0010\u0090\u0002R*\u0010\u0099\u0002\u001a\u00030\u0092\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0093\u0002\u0010\u0094\u0002\u001a\u0006\b\u0095\u0002\u0010\u0096\u0002\"\u0006\b\u0097\u0002\u0010\u0098\u0002R\u0018\u0010\u009b\u0002\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009a\u0002\u0010GR\u0018\u0010\u009d\u0002\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009c\u0002\u0010GR*\u0010¥\u0002\u001a\u00030\u009e\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009f\u0002\u0010 \u0002\u001a\u0006\b¡\u0002\u0010¢\u0002\"\u0006\b£\u0002\u0010¤\u0002R\u001a\u0010©\u0002\u001a\u00030¦\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b§\u0002\u0010¨\u0002¨\u0006¬\u0002"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/coa/ChangeOfAddressActivity;", "Lcom/zepto/o40;", "", "m4", "L3", "z2", "h3", "U3", "m3", "q3", "V3", "", "p3", "W3", "", "fromWhere", "P3", "Q3", "villaOrTown", "K2", "d3", "R3", "A2", "B2", "C2", "D2", "E2", "F2", "Landroid/content/Intent;", "intent", "n3", "message", "S3", "lastEndRTO", "lastEndState", "purCode", "Ljava/util/ArrayList;", "multiList", "o3", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/xh0;", "F", "Lcom/zepto/xh0;", "viewModel", "", "Lcom/nic/mparivahan/dlservices/data/model/StateMasterItem;", "G", "Ljava/util/List;", "mStateList", "Lcom/nic/mparivahan/dlservices/data/model/DistrictsMasterItem;", "H", "mCurrDistList", "I", "mPermDistList", "Lcom/nic/mparivahan/dlservices/data/model/TalukaMasterItem;", "J", "mCurrTalukaList", "K", "mPermTalukaList", "Lcom/nic/mparivahan/dlservices/data/model/VillageOrTownMasterItem;", "L", "mCurrVillageOrTownList", "M", "mPermVillageOrTownList", "Lcom/zepto/a7;", "N", "Lcom/zepto/a7;", "mBinding", "O", "Ljava/lang/String;", "isCurrentOrPermanentAddress", "Lcom/nic/mparivahan/dlservices/data/model/DlAddress;", "P", "Lcom/nic/mparivahan/dlservices/data/model/DlAddress;", "e3", "()Lcom/nic/mparivahan/dlservices/data/model/DlAddress;", "setPresentAdd", "(Lcom/nic/mparivahan/dlservices/data/model/DlAddress;)V", "presentAdd", "Q", "c3", "setPermanentAdd", "permanentAdd", "R", "I2", "()Ljava/lang/String;", "Z3", "(Ljava/lang/String;)V", "bioRecGenesis", "S", "G2", "X3", "allowAddrChangeAtDlservReqst", "T", "M2", "setDlNo", "dlNo", "U", "N2", "setDob", "dob", "V", "Y2", "setMobile_no", "mobile_no", "W", "getRto_cd", "setRto_cd", "rto_cd", "X", "Q2", "setLastEndorseRto", "lastEndorseRto", "Y", "R2", "setLastEndorseState", "lastEndorseState", "Z", "S2", "setLastEndorseStateCode", "lastEndorseStateCode", "a0", "P2", "setLastEndorseRTOCode", "lastEndorseRTOCode", "b0", "getState_value", "setState_value", "state_value", "c0", "f3", "setPurCode", "Ljava/util/HashMap;", "d0", "Ljava/util/HashMap;", "getWhatServiceRequired", "()Ljava/util/HashMap;", "setWhatServiceRequired", "(Ljava/util/HashMap;)V", "whatServiceRequired", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "e0", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "L2", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "b4", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "dlDetails", "Lcom/zepto/wl5;", "f0", "Lcom/zepto/wl5;", "g3", "()Lcom/zepto/wl5;", "l4", "(Lcom/zepto/wl5;)V", "sarthiSession", "Landroid/widget/ProgressBar;", "g0", "Landroid/widget/ProgressBar;", "W2", "()Landroid/widget/ProgressBar;", "g4", "(Landroid/widget/ProgressBar;)V", "mProgressBar", "Lcom/zepto/ws6;", "h0", "Lcom/zepto/ws6;", "X2", "()Lcom/zepto/ws6;", "h4", "(Lcom/zepto/ws6;)V", "mSessionmanger", "i0", "J2", "a4", "currStateCd", "j0", "b3", "k4", "perStateCd", "k0", "H2", "Y3", "appCategory", "Lcom/zepto/wa3;", "l0", "Lcom/zepto/wa3;", "O2", "()Lcom/zepto/wa3;", "c4", "(Lcom/zepto/wa3;)V", "langSession", "m0", "getForm1FlagDLserReq", "setForm1FlagDLserReq", "form1FlagDLserReq", "n0", "getSubmitFormOne", "setSubmitFormOne", "submitFormOne", "o0", "getAString", "setAString", "aString", "p0", "getBString", "setBString", "bString", "q0", "getCString", "setCString", "cString", "r0", "getDString", "setDString", "dString", "s0", "getEString", "setEString", "eString", "t0", "getFString", "setFString", "fString", "u0", "getGString", "setGString", "gString", "Landroid/content/Context;", "v0", "Landroid/content/Context;", "V2", "()Landroid/content/Context;", "f4", "(Landroid/content/Context;)V", "mContext", "w0", "Ljava/util/ArrayList;", "Z2", "()Ljava/util/ArrayList;", "i4", "(Ljava/util/ArrayList;)V", "multiListName", "x0", "T2", "d4", "listHeaderSteps", "y0", "getCOA", "()Z", "setCOA", "(Z)V", "COA", "", "z0", "getWidthPixels", "()I", "setWidthPixels", "(I)V", "widthPixels", "A0", "getSerialNo", "setSerialNo", "serialNo", "B0", "getMetaflag", "setMetaflag", "metaflag", "Lcom/zepto/fs0;", "C0", "Lcom/zepto/fs0;", "mCombineViewModel", "Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;", "D0", "Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;", "U2", "()Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;", "e4", "(Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;)V", "mCombineServiceInterface", "E0", "presSelectedVillOrTown", "F0", "permSelectedVillOrTown", "Landroid/app/ProgressDialog;", "G0", "Landroid/app/ProgressDialog;", "a3", "()Landroid/app/ProgressDialog;", "j4", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkycX;", "H0", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewAdharApi/DOEkycX;", "adharData", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nChangeOfAddressActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeOfAddressActivity.kt\ncom/nic/mparivahan/dlservices/ui/coa/ChangeOfAddressActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2956:1\n1855#2,2:2957\n1855#2,2:2959\n1855#2,2:2961\n1855#2,2:2963\n1855#2,2:2965\n1855#2,2:2967\n1855#2,2:2969\n*S KotlinDebug\n*F\n+ 1 ChangeOfAddressActivity.kt\ncom/nic/mparivahan/dlservices/ui/coa/ChangeOfAddressActivity\n*L\n2247#1:2957,2\n2303#1:2959,2\n2305#1:2961,2\n2360#1:2963,2\n2368#1:2965,2\n2513#1:2967,2\n2515#1:2969,2\n*E\n"})
public final class ChangeOfAddressActivity extends o40 {

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    public int serialNo;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    public fs0 mCombineViewModel;

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    public CombineServiceInterface mCombineServiceInterface;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public xh0 viewModel;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public List mStateList;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public List mCurrDistList;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    public DOEkycX adharData;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public List mPermDistList;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public List mCurrTalukaList;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public List mPermTalukaList;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public List mCurrVillageOrTownList;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public List mPermVillageOrTownList;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public a7 mBinding;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String bioRecGenesis;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String allowAddrChangeAtDlservReqst;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String dlNo;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String dob;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String mobile_no;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public DldetobjX dlDetails;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public ProgressBar mProgressBar;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public ws6 mSessionmanger;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public String currStateCd;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public String perStateCd;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    public ArrayList multiListName;

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    public ArrayList listHeaderSteps;

    /* JADX INFO: renamed from: y0, reason: from kotlin metadata */
    public boolean COA;

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    public int widthPixels;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String isCurrentOrPermanentAddress = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public DlAddress presentAdd = new DlAddress("", "", "", "", "", "", "", "");

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public DlAddress permanentAdd = new DlAddress("", "", "", "", "", "", "", "");

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String rto_cd = "";

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String lastEndorseRto = "";

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String lastEndorseState = "";

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String lastEndorseStateCode = "";

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String lastEndorseRTOCode = "";

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String state_value = "";

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public String purCode = "0";

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public HashMap whatServiceRequired = new HashMap();

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public String appCategory = "0";

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public String form1FlagDLserReq = "N";

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public String submitFormOne = "N";

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public String aString = "";

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public String bString = "";

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public String cString = "";

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public String dString = "";

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    public String eString = "";

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    public String fString = "";

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    public String gString = "N";

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    public String metaflag = "";

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    public String presSelectedVillOrTown = "";

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    public String permSelectedVillOrTown = "";

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
            ChangeOfAddressActivity.this.Y3(((AppCatPojo) ((ArrayList) this.b.element).get(i)).getAppCode());
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(StateResponse stateResponse) {
            ChangeOfAddressActivity.this.a3().dismiss();
            try {
                ChangeOfAddressActivity.this.W2().setVisibility(8);
                if (!Intrinsics.areEqual(stateResponse.getStatusCode(), "00")) {
                    ChangeOfAddressActivity changeOfAddressActivity = ChangeOfAddressActivity.this;
                    changeOfAddressActivity.S3(changeOfAddressActivity.O2().b("no_details", ChangeOfAddressActivity.this.getString(R.string.no_Details_are_avail)));
                    return;
                }
                if (stateResponse.getStateMaster() == null || !(!r0.isEmpty())) {
                    return;
                }
                ChangeOfAddressActivity.this.mStateList = stateResponse.getStateMaster();
                ArrayList arrayList = new ArrayList();
                List<StateMasterItem> list = ChangeOfAddressActivity.this.mStateList;
                xh0 xh0Var = null;
                if (list != null) {
                    for (StateMasterItem stateMasterItem : list) {
                        arrayList.add(String.valueOf(stateMasterItem != null ? stateMasterItem.getStateName() : null));
                    }
                }
                String stateName = "";
                List list2 = ChangeOfAddressActivity.this.mStateList;
                Intrinsics.checkNotNull(list2);
                int size = list2.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    String lastEndorseStateCode = ChangeOfAddressActivity.this.getLastEndorseStateCode();
                    List list3 = ChangeOfAddressActivity.this.mStateList;
                    Intrinsics.checkNotNull(list3);
                    Object obj = list3.get(i);
                    Intrinsics.checkNotNull(obj);
                    if (Intrinsics.areEqual(lastEndorseStateCode, ((StateMasterItem) obj).getStateCode())) {
                        ChangeOfAddressActivity changeOfAddressActivity2 = ChangeOfAddressActivity.this;
                        List list4 = changeOfAddressActivity2.mStateList;
                        Intrinsics.checkNotNull(list4);
                        Object obj2 = list4.get(i);
                        Intrinsics.checkNotNull(obj2);
                        String stateCode = ((StateMasterItem) obj2).getStateCode();
                        Intrinsics.checkNotNull(stateCode);
                        changeOfAddressActivity2.a4(stateCode);
                        ChangeOfAddressActivity changeOfAddressActivity3 = ChangeOfAddressActivity.this;
                        List list5 = changeOfAddressActivity3.mStateList;
                        Intrinsics.checkNotNull(list5);
                        Object obj3 = list5.get(i);
                        Intrinsics.checkNotNull(obj3);
                        String stateCode2 = ((StateMasterItem) obj3).getStateCode();
                        Intrinsics.checkNotNull(stateCode2);
                        changeOfAddressActivity3.k4(stateCode2);
                        List list6 = ChangeOfAddressActivity.this.mStateList;
                        Intrinsics.checkNotNull(list6);
                        Object obj4 = list6.get(i);
                        Intrinsics.checkNotNull(obj4);
                        stateName = ((StateMasterItem) obj4).getStateName();
                        Intrinsics.checkNotNull(stateName);
                        break;
                    }
                    i++;
                }
                a7 a7Var = ChangeOfAddressActivity.this.mBinding;
                if (a7Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var = null;
                }
                a7Var.y.setText(stateName);
                a7 a7Var2 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var2 = null;
                }
                a7Var2.y.setContentDescription(ChangeOfAddressActivity.this.J2());
                ChangeOfAddressActivity.this.A2();
                String strJ2 = ChangeOfAddressActivity.this.J2();
                ChangeOfAddressActivity changeOfAddressActivity4 = ChangeOfAddressActivity.this;
                changeOfAddressActivity4.a3().dismiss();
                xh0 xh0Var2 = changeOfAddressActivity4.viewModel;
                if (xh0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    xh0Var2 = null;
                }
                xh0Var2.g(strJ2);
                a7 a7Var3 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var3 = null;
                }
                a7Var3.G.setText(stateName);
                a7 a7Var4 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var4 = null;
                }
                a7Var4.G.setContentDescription(ChangeOfAddressActivity.this.b3());
                ChangeOfAddressActivity.this.D2();
                String strB3 = ChangeOfAddressActivity.this.b3();
                ChangeOfAddressActivity changeOfAddressActivity5 = ChangeOfAddressActivity.this;
                changeOfAddressActivity5.a3().dismiss();
                xh0 xh0Var3 = changeOfAddressActivity5.viewModel;
                if (xh0Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    xh0Var = xh0Var3;
                }
                xh0Var.g(strB3);
            } catch (Exception unused) {
                ChangeOfAddressActivity changeOfAddressActivity6 = ChangeOfAddressActivity.this;
                changeOfAddressActivity6.S3(changeOfAddressActivity6.O2().b("service_is_not_present", ChangeOfAddressActivity.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((StateResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(DistResponse distResponse) {
            String distName;
            String distName2;
            String distCode;
            String distCode2;
            ChangeOfAddressActivity.this.a3().dismiss();
            try {
                ChangeOfAddressActivity.this.W2().setVisibility(8);
                xh0 xh0Var = null;
                if (!Intrinsics.areEqual(distResponse != null ? distResponse.getStatusCode() : null, "00")) {
                    ChangeOfAddressActivity changeOfAddressActivity = ChangeOfAddressActivity.this;
                    changeOfAddressActivity.S3(changeOfAddressActivity.O2().b("no_details", ChangeOfAddressActivity.this.getString(R.string.unable_to_get_details)));
                    return;
                }
                ChangeOfAddressActivity.this.mCurrDistList = distResponse.getDistMaster();
                ChangeOfAddressActivity.this.mPermDistList = distResponse.getDistMaster();
                if (Intrinsics.areEqual(ChangeOfAddressActivity.this.g3().g(), "Y")) {
                    DOEkycX dOEkycX = ChangeOfAddressActivity.this.adharData;
                    if (dOEkycX == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adharData");
                        dOEkycX = null;
                    }
                    if (kt6.d(dOEkycX.getDist())) {
                        List list = ChangeOfAddressActivity.this.mCurrDistList;
                        Intrinsics.checkNotNull(list);
                        int size = list.size();
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            distName = "";
                            if (i2 >= size) {
                                distName2 = "";
                                distCode = distName2;
                                break;
                            }
                            DOEkycX dOEkycX2 = ChangeOfAddressActivity.this.adharData;
                            if (dOEkycX2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                                dOEkycX2 = null;
                            }
                            String dist = dOEkycX2.getDist();
                            List list2 = ChangeOfAddressActivity.this.mCurrDistList;
                            Intrinsics.checkNotNull(list2);
                            Object obj = list2.get(i2);
                            Intrinsics.checkNotNull(obj);
                            if (Intrinsics.areEqual(dist, ((DistrictsMasterItem) obj).getDistName())) {
                                List list3 = ChangeOfAddressActivity.this.mCurrDistList;
                                Intrinsics.checkNotNull(list3);
                                Object obj2 = list3.get(i2);
                                Intrinsics.checkNotNull(obj2);
                                distName2 = ((DistrictsMasterItem) obj2).getDistName();
                                Intrinsics.checkNotNull(distName2);
                                List list4 = ChangeOfAddressActivity.this.mCurrDistList;
                                Intrinsics.checkNotNull(list4);
                                Object obj3 = list4.get(i2);
                                Intrinsics.checkNotNull(obj3);
                                distCode = ((DistrictsMasterItem) obj3).getDistCode();
                                Intrinsics.checkNotNull(distCode);
                                break;
                            }
                            i2++;
                        }
                        a7 a7Var = ChangeOfAddressActivity.this.mBinding;
                        if (a7Var == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            a7Var = null;
                        }
                        a7Var.x.setText(distName2);
                        a7 a7Var2 = ChangeOfAddressActivity.this.mBinding;
                        if (a7Var2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            a7Var2 = null;
                        }
                        a7Var2.x.setContentDescription(distCode);
                        ChangeOfAddressActivity.this.getPresentAdd().setDistrict(distCode);
                        ChangeOfAddressActivity.this.B2();
                        xh0 xh0Var2 = ChangeOfAddressActivity.this.viewModel;
                        if (xh0Var2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            xh0Var2 = null;
                        }
                        xh0Var2.n(ChangeOfAddressActivity.this.getLastEndorseStateCode(), distCode);
                        List list5 = ChangeOfAddressActivity.this.mPermDistList;
                        Intrinsics.checkNotNull(list5);
                        int size2 = list5.size();
                        while (true) {
                            if (i >= size2) {
                                distCode2 = "";
                                break;
                            }
                            DOEkycX dOEkycX3 = ChangeOfAddressActivity.this.adharData;
                            if (dOEkycX3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                                dOEkycX3 = null;
                            }
                            String dist2 = dOEkycX3.getDist();
                            List list6 = ChangeOfAddressActivity.this.mPermDistList;
                            Intrinsics.checkNotNull(list6);
                            Object obj4 = list6.get(i);
                            Intrinsics.checkNotNull(obj4);
                            if (Intrinsics.areEqual(dist2, ((DistrictsMasterItem) obj4).getDistName())) {
                                List list7 = ChangeOfAddressActivity.this.mCurrDistList;
                                Intrinsics.checkNotNull(list7);
                                Object obj5 = list7.get(i);
                                Intrinsics.checkNotNull(obj5);
                                distName = ((DistrictsMasterItem) obj5).getDistName();
                                Intrinsics.checkNotNull(distName);
                                List list8 = ChangeOfAddressActivity.this.mCurrDistList;
                                Intrinsics.checkNotNull(list8);
                                Object obj6 = list8.get(i);
                                Intrinsics.checkNotNull(obj6);
                                distCode2 = ((DistrictsMasterItem) obj6).getDistCode();
                                Intrinsics.checkNotNull(distCode2);
                                break;
                            }
                            i++;
                        }
                        a7 a7Var3 = ChangeOfAddressActivity.this.mBinding;
                        if (a7Var3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            a7Var3 = null;
                        }
                        a7Var3.F.setText(distName);
                        a7 a7Var4 = ChangeOfAddressActivity.this.mBinding;
                        if (a7Var4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            a7Var4 = null;
                        }
                        a7Var4.F.setContentDescription(distCode2);
                        ChangeOfAddressActivity.this.getPermanentAdd().setDistrict(distCode2);
                        ChangeOfAddressActivity.this.E2();
                        xh0 xh0Var3 = ChangeOfAddressActivity.this.viewModel;
                        if (xh0Var3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        } else {
                            xh0Var = xh0Var3;
                        }
                        xh0Var.n(ChangeOfAddressActivity.this.getLastEndorseStateCode(), distCode2);
                    }
                }
            } catch (Exception unused) {
                ChangeOfAddressActivity changeOfAddressActivity2 = ChangeOfAddressActivity.this;
                changeOfAddressActivity2.S3(changeOfAddressActivity2.O2().b("service_is_not_present", ChangeOfAddressActivity.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((DistResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        public final void a(TalukaResponse talukaResponse) {
            String subDistname;
            String subDistname2;
            String subDistcode;
            String subDistcode2;
            ChangeOfAddressActivity.this.a3().dismiss();
            try {
                ChangeOfAddressActivity.this.W2().setVisibility(8);
                a7 a7Var = null;
                a7 a7Var2 = null;
                if (!Intrinsics.areEqual(talukaResponse != null ? talukaResponse.getStatusCode() : null, "00")) {
                    if (Intrinsics.areEqual(talukaResponse != null ? talukaResponse.getStatusCode() : null, "01")) {
                        ChangeOfAddressActivity changeOfAddressActivity = ChangeOfAddressActivity.this;
                        changeOfAddressActivity.S3(changeOfAddressActivity.O2().b("no_taluka_found", "No Taluka / Block found for selected District"));
                        return;
                    } else {
                        ChangeOfAddressActivity changeOfAddressActivity2 = ChangeOfAddressActivity.this;
                        changeOfAddressActivity2.S3(changeOfAddressActivity2.O2().b("no_details", ChangeOfAddressActivity.this.getString(R.string.unable_to_get_details)));
                        return;
                    }
                }
                if (Intrinsics.areEqual(ChangeOfAddressActivity.this.g3().g(), "Y")) {
                    ChangeOfAddressActivity.this.mCurrTalukaList = talukaResponse.getTakulaMaster();
                    ChangeOfAddressActivity.this.mPermTalukaList = talukaResponse.getTakulaMaster();
                } else if (Intrinsics.areEqual(ChangeOfAddressActivity.this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                    ChangeOfAddressActivity.this.mCurrTalukaList = talukaResponse.getTakulaMaster();
                } else {
                    ChangeOfAddressActivity.this.mPermTalukaList = talukaResponse.getTakulaMaster();
                }
                if (Intrinsics.areEqual(ChangeOfAddressActivity.this.g3().g(), "Y")) {
                    DOEkycX dOEkycX = ChangeOfAddressActivity.this.adharData;
                    if (dOEkycX == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adharData");
                        dOEkycX = null;
                    }
                    if (kt6.d(dOEkycX.getSubDist())) {
                        List list = ChangeOfAddressActivity.this.mPermTalukaList;
                        Intrinsics.checkNotNull(list);
                        int size = list.size();
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            subDistname = "";
                            if (i2 >= size) {
                                subDistname2 = "";
                                subDistcode = subDistname2;
                                break;
                            }
                            DOEkycX dOEkycX2 = ChangeOfAddressActivity.this.adharData;
                            if (dOEkycX2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                                dOEkycX2 = null;
                            }
                            String subDist = dOEkycX2.getSubDist();
                            List list2 = ChangeOfAddressActivity.this.mPermTalukaList;
                            Intrinsics.checkNotNull(list2);
                            Object obj = list2.get(i2);
                            Intrinsics.checkNotNull(obj);
                            if (Intrinsics.areEqual(subDist, ((TalukaMasterItem) obj).getSubDistname())) {
                                List list3 = ChangeOfAddressActivity.this.mPermTalukaList;
                                Intrinsics.checkNotNull(list3);
                                Object obj2 = list3.get(i2);
                                Intrinsics.checkNotNull(obj2);
                                subDistname2 = ((TalukaMasterItem) obj2).getSubDistname();
                                Intrinsics.checkNotNull(subDistname2);
                                List list4 = ChangeOfAddressActivity.this.mPermTalukaList;
                                Intrinsics.checkNotNull(list4);
                                Object obj3 = list4.get(i2);
                                Intrinsics.checkNotNull(obj3);
                                subDistcode = ((TalukaMasterItem) obj3).getSubDistcode();
                                Intrinsics.checkNotNull(subDistcode);
                                break;
                            }
                            i2++;
                        }
                        a7 a7Var3 = ChangeOfAddressActivity.this.mBinding;
                        if (a7Var3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            a7Var3 = null;
                        }
                        a7Var3.E.setText(subDistname2);
                        a7 a7Var4 = ChangeOfAddressActivity.this.mBinding;
                        if (a7Var4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            a7Var4 = null;
                        }
                        a7Var4.E.setContentDescription(subDistcode);
                        ChangeOfAddressActivity.this.getPermanentAdd().setSubDistrict(subDistcode);
                        List list5 = ChangeOfAddressActivity.this.mCurrTalukaList;
                        Intrinsics.checkNotNull(list5);
                        int size2 = list5.size();
                        while (true) {
                            if (i >= size2) {
                                subDistcode2 = "";
                                break;
                            }
                            DOEkycX dOEkycX3 = ChangeOfAddressActivity.this.adharData;
                            if (dOEkycX3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                                dOEkycX3 = null;
                            }
                            String subDist2 = dOEkycX3.getSubDist();
                            List list6 = ChangeOfAddressActivity.this.mCurrTalukaList;
                            Intrinsics.checkNotNull(list6);
                            Object obj4 = list6.get(i);
                            Intrinsics.checkNotNull(obj4);
                            if (Intrinsics.areEqual(subDist2, ((TalukaMasterItem) obj4).getSubDistname())) {
                                List list7 = ChangeOfAddressActivity.this.mCurrTalukaList;
                                Intrinsics.checkNotNull(list7);
                                Object obj5 = list7.get(i);
                                Intrinsics.checkNotNull(obj5);
                                subDistname = ((TalukaMasterItem) obj5).getSubDistname();
                                Intrinsics.checkNotNull(subDistname);
                                List list8 = ChangeOfAddressActivity.this.mCurrTalukaList;
                                Intrinsics.checkNotNull(list8);
                                Object obj6 = list8.get(i);
                                Intrinsics.checkNotNull(obj6);
                                subDistcode2 = ((TalukaMasterItem) obj6).getSubDistcode();
                                Intrinsics.checkNotNull(subDistcode2);
                                break;
                            }
                            i++;
                        }
                        a7 a7Var5 = ChangeOfAddressActivity.this.mBinding;
                        if (a7Var5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            a7Var5 = null;
                        }
                        a7Var5.w.setText(subDistname);
                        a7 a7Var6 = ChangeOfAddressActivity.this.mBinding;
                        if (a7Var6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        } else {
                            a7Var = a7Var6;
                        }
                        a7Var.w.setContentDescription(subDistcode2);
                        ChangeOfAddressActivity.this.getPresentAdd().setSubDistrict(subDistcode2);
                        return;
                    }
                }
                a7 a7Var7 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var7 = null;
                }
                a7Var7.E.setFocusable(true);
                a7 a7Var8 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    a7Var2 = a7Var8;
                }
                a7Var2.E.setEnabled(true);
            } catch (Exception unused) {
                ChangeOfAddressActivity changeOfAddressActivity3 = ChangeOfAddressActivity.this;
                changeOfAddressActivity3.S3(changeOfAddressActivity3.O2().b("service_is_not_present", ChangeOfAddressActivity.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((TalukaResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(VillageOrTownResponse villageOrTownResponse) {
            ChangeOfAddressActivity.this.a3().dismiss();
            try {
                ChangeOfAddressActivity.this.W2().setVisibility(8);
                if (!Intrinsics.areEqual(villageOrTownResponse != null ? villageOrTownResponse.getStatusCode() : null, "00")) {
                    ChangeOfAddressActivity changeOfAddressActivity = ChangeOfAddressActivity.this;
                    changeOfAddressActivity.S3(changeOfAddressActivity.O2().b("no_vill_found", "No Village/Town found for selected Taluka/Block"));
                } else if (Intrinsics.areEqual(ChangeOfAddressActivity.this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                    ChangeOfAddressActivity.this.mCurrVillageOrTownList = villageOrTownResponse.getVillageMaster();
                } else {
                    ChangeOfAddressActivity.this.mPermVillageOrTownList = villageOrTownResponse.getVillageMaster();
                }
                Log.e("dl_village", villageOrTownResponse.toString());
            } catch (Exception unused) {
                ChangeOfAddressActivity changeOfAddressActivity2 = ChangeOfAddressActivity.this;
                changeOfAddressActivity2.S3(changeOfAddressActivity2.O2().b("service_is_not_present", ChangeOfAddressActivity.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((VillageOrTownResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function1 {
        public f() {
            super(1);
        }

        public final void a(DlRenewalSaveDto dlRenewalSaveDto) throws Throwable {
            ResultItemSubmit resultItemSubmit;
            a7 a7Var = null;
            try {
                ChangeOfAddressActivity.this.W2().setVisibility(8);
                a7 a7Var2 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var2 = null;
                }
                a7Var2.s0.c(false);
                DlSubmitResult result = dlRenewalSaveDto.getResult();
                Intrinsics.checkNotNull(result);
                if (!StringsKt__StringsJVMKt.equals$default(result.getStatusCode(), "00", false, 2, null)) {
                    DlSubmitResult result2 = dlRenewalSaveDto.getResult();
                    Intrinsics.checkNotNull(result2);
                    String reqStatus = result2.getReqStatus();
                    if (reqStatus != null && reqStatus.length() != 0) {
                        ChangeOfAddressActivity changeOfAddressActivity = ChangeOfAddressActivity.this;
                        DlSubmitResult result3 = dlRenewalSaveDto.getResult();
                        Intrinsics.checkNotNull(result3);
                        String reqStatus2 = result3.getReqStatus();
                        Intrinsics.checkNotNull(reqStatus2);
                        changeOfAddressActivity.S3(reqStatus2);
                        return;
                    }
                    ChangeOfAddressActivity changeOfAddressActivity2 = ChangeOfAddressActivity.this;
                    changeOfAddressActivity2.S3(changeOfAddressActivity2.O2().b("service_is_not_present", ChangeOfAddressActivity.this.getString(R.string.unable_to_get_details)));
                    return;
                }
                DlSubmitResult result4 = dlRenewalSaveDto.getResult();
                Intrinsics.checkNotNull(result4);
                if (result4.getResult() == null || !(!r6.isEmpty())) {
                    return;
                }
                DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity = new DLServiceAcknowlegementActivity();
                List<ResultItemSubmit> result5 = dlRenewalSaveDto.getResult().getResult();
                if (result5 == null || (resultItemSubmit = result5.get(0)) == null) {
                    return;
                }
                ChangeOfAddressActivity changeOfAddressActivity3 = ChangeOfAddressActivity.this;
                Log.d("date_", resultItemSubmit.getApplicationDate());
                try {
                    DlLogCapture.Companion companion = DlLogCapture.INSTANCE;
                    String applicationDate = resultItemSubmit.getApplicationDate();
                    String applicationNo = resultItemSubmit.getApplicationNo();
                    Intrinsics.checkNotNull(applicationNo);
                    long j = Long.parseLong(applicationNo);
                    int i = Integer.parseInt(changeOfAddressActivity3.X2().k());
                    String dateofBirth = resultItemSubmit.getDateofBirth();
                    String dlno = resultItemSubmit.getDlno();
                    Intrinsics.checkNotNull(dlno);
                    String applicantGender = resultItemSubmit.getApplicantGender();
                    String mobile_no = changeOfAddressActivity3.getMobile_no();
                    Intrinsics.checkNotNull(mobile_no);
                    companion.a(changeOfAddressActivity3, "1234", "S", applicationDate, j, i, dateofBirth, dlno, "N", "N", applicantGender, mobile_no, false, changeOfAddressActivity3.getPurCode(), changeOfAddressActivity3.getLastEndorseRTOCode(), changeOfAddressActivity3.getLastEndorseStateCode());
                } catch (Exception unused) {
                }
                if (!Intrinsics.areEqual(changeOfAddressActivity3.g3().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                    changeOfAddressActivity3.i4(new ArrayList());
                    changeOfAddressActivity3.Z2().add(changeOfAddressActivity3.g3().k());
                }
                dLServiceAcknowlegementActivity.K2(changeOfAddressActivity3, resultItemSubmit, changeOfAddressActivity3.getLastEndorseRTOCode(), changeOfAddressActivity3.L2(), changeOfAddressActivity3.getDlNo(), changeOfAddressActivity3.getDob(), changeOfAddressActivity3.getMobile_no(), changeOfAddressActivity3.getLastEndorseRto(), changeOfAddressActivity3.getLastEndorseState(), changeOfAddressActivity3.getLastEndorseStateCode(), changeOfAddressActivity3.Z2());
            } catch (Exception unused2) {
                a7 a7Var3 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    a7Var = a7Var3;
                }
                a7Var.s0.c(false);
                ChangeOfAddressActivity changeOfAddressActivity4 = ChangeOfAddressActivity.this;
                changeOfAddressActivity4.S3(changeOfAddressActivity4.O2().b("service_is_not_present", ChangeOfAddressActivity.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((DlRenewalSaveDto) obj);
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

        public final void invoke(String it) {
            xh0 xh0Var;
            Intrinsics.checkNotNullParameter(it, "it");
            if (StringsKt__StringsJVMKt.equals(it, "yes", true)) {
                a7 a7Var = ChangeOfAddressActivity.this.mBinding;
                a7 a7Var2 = null;
                if (a7Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var = null;
                }
                a7Var.s0.c(true);
                xh0 xh0Var2 = ChangeOfAddressActivity.this.viewModel;
                if (xh0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    xh0Var = null;
                } else {
                    xh0Var = xh0Var2;
                }
                String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(ChangeOfAddressActivity.this.getDlNo())).toString();
                String dob = ChangeOfAddressActivity.this.getDob();
                Intrinsics.checkNotNull(dob);
                String lastEndorseRTOCode = ChangeOfAddressActivity.this.getLastEndorseRTOCode();
                String appCategory = ChangeOfAddressActivity.this.getAppCategory();
                a7 a7Var3 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var3 = null;
                }
                String string2 = a7Var3.A.getText().toString();
                a7 a7Var4 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var4 = null;
                }
                String string3 = a7Var4.D.getText().toString();
                a7 a7Var5 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var5 = null;
                }
                String string4 = a7Var5.B.getText().toString();
                String villageOrTown = ChangeOfAddressActivity.this.getPermanentAdd().getVillageOrTown();
                Intrinsics.checkNotNull(villageOrTown);
                String subDistrict = ChangeOfAddressActivity.this.getPermanentAdd().getSubDistrict();
                Intrinsics.checkNotNull(subDistrict);
                String district = ChangeOfAddressActivity.this.getPermanentAdd().getDistrict();
                Intrinsics.checkNotNull(district);
                String strB3 = ChangeOfAddressActivity.this.b3();
                a7 a7Var6 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var6 = null;
                }
                String string5 = a7Var6.O.getText().toString();
                a7 a7Var7 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var7 = null;
                }
                String string6 = a7Var7.L.getText().toString();
                a7 a7Var8 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var8 = null;
                }
                String string7 = a7Var8.P.getText().toString();
                a7 a7Var9 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var9 = null;
                }
                String string8 = a7Var9.N.getText().toString();
                String villageOrTown2 = ChangeOfAddressActivity.this.getPresentAdd().getVillageOrTown();
                Intrinsics.checkNotNull(villageOrTown2);
                String subDistrict2 = ChangeOfAddressActivity.this.getPresentAdd().getSubDistrict();
                Intrinsics.checkNotNull(subDistrict2);
                String district2 = ChangeOfAddressActivity.this.getPresentAdd().getDistrict();
                Intrinsics.checkNotNull(district2);
                String strJ2 = ChangeOfAddressActivity.this.J2();
                a7 a7Var10 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    a7Var2 = a7Var10;
                }
                String string9 = a7Var2.O.getText().toString();
                String mobile_no = ChangeOfAddressActivity.this.getMobile_no();
                Intrinsics.checkNotNull(mobile_no);
                xh0Var.p(string, dob, lastEndorseRTOCode, appCategory, "B", string2, string3, string4, villageOrTown, subDistrict, district, strB3, string5, string6, string7, string8, villageOrTown2, subDistrict2, district2, strJ2, string9, "DelhTrans", "0.0.0.0", "d9fe1613399b0883e4ecf3f710e18317", "sarathiservice", mobile_no, ChangeOfAddressActivity.this.g3().f(), ChangeOfAddressActivity.this.g3().g(), ChangeOfAddressActivity.this.g3().e(), ChangeOfAddressActivity.this.g3().h());
            }
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
            xh0 xh0Var;
            Intrinsics.checkNotNullParameter(it, "it");
            if (StringsKt__StringsJVMKt.equals(it, "yes", true)) {
                a7 a7Var = ChangeOfAddressActivity.this.mBinding;
                a7 a7Var2 = null;
                if (a7Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var = null;
                }
                a7Var.s0.c(true);
                xh0 xh0Var2 = ChangeOfAddressActivity.this.viewModel;
                if (xh0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    xh0Var = null;
                } else {
                    xh0Var = xh0Var2;
                }
                String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(ChangeOfAddressActivity.this.getDlNo())).toString();
                String dob = ChangeOfAddressActivity.this.getDob();
                Intrinsics.checkNotNull(dob);
                String lastEndorseRTOCode = ChangeOfAddressActivity.this.getLastEndorseRTOCode();
                String appCategory = ChangeOfAddressActivity.this.getAppCategory();
                a7 a7Var3 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var3 = null;
                }
                String string2 = a7Var3.A.getText().toString();
                a7 a7Var4 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var4 = null;
                }
                String string3 = a7Var4.D.getText().toString();
                a7 a7Var5 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var5 = null;
                }
                String string4 = a7Var5.B.getText().toString();
                String villageOrTown = ChangeOfAddressActivity.this.getPermanentAdd().getVillageOrTown();
                Intrinsics.checkNotNull(villageOrTown);
                String subDistrict = ChangeOfAddressActivity.this.getPermanentAdd().getSubDistrict();
                Intrinsics.checkNotNull(subDistrict);
                String district = ChangeOfAddressActivity.this.getPermanentAdd().getDistrict();
                Intrinsics.checkNotNull(district);
                String strB3 = ChangeOfAddressActivity.this.b3();
                a7 a7Var6 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var6 = null;
                }
                String string5 = a7Var6.O.getText().toString();
                a7 a7Var7 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var7 = null;
                }
                String string6 = a7Var7.L.getText().toString();
                a7 a7Var8 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var8 = null;
                }
                String string7 = a7Var8.P.getText().toString();
                a7 a7Var9 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var9 = null;
                }
                String string8 = a7Var9.N.getText().toString();
                String villageOrTown2 = ChangeOfAddressActivity.this.getPresentAdd().getVillageOrTown();
                Intrinsics.checkNotNull(villageOrTown2);
                String subDistrict2 = ChangeOfAddressActivity.this.getPresentAdd().getSubDistrict();
                Intrinsics.checkNotNull(subDistrict2);
                String district2 = ChangeOfAddressActivity.this.getPresentAdd().getDistrict();
                Intrinsics.checkNotNull(district2);
                String strJ2 = ChangeOfAddressActivity.this.J2();
                a7 a7Var10 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    a7Var2 = a7Var10;
                }
                String string9 = a7Var2.O.getText().toString();
                String mobile_no = ChangeOfAddressActivity.this.getMobile_no();
                Intrinsics.checkNotNull(mobile_no);
                xh0Var.p(string, dob, lastEndorseRTOCode, appCategory, "B", string2, string3, string4, villageOrTown, subDistrict, district, strB3, string5, string6, string7, string8, villageOrTown2, subDistrict2, district2, strJ2, string9, "DelhTrans", "0.0.0.0", "d9fe1613399b0883e4ecf3f710e18317", "sarathiservice", mobile_no, ChangeOfAddressActivity.this.g3().f(), ChangeOfAddressActivity.this.g3().g(), ChangeOfAddressActivity.this.g3().e(), ChangeOfAddressActivity.this.g3().h());
            }
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

        public final void invoke(String it) {
            xh0 xh0Var;
            Intrinsics.checkNotNullParameter(it, "it");
            if (StringsKt__StringsJVMKt.equals(it, "yes", true)) {
                a7 a7Var = ChangeOfAddressActivity.this.mBinding;
                a7 a7Var2 = null;
                if (a7Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var = null;
                }
                a7Var.s0.c(true);
                xh0 xh0Var2 = ChangeOfAddressActivity.this.viewModel;
                if (xh0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    xh0Var = null;
                } else {
                    xh0Var = xh0Var2;
                }
                String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(ChangeOfAddressActivity.this.getDlNo())).toString();
                String dob = ChangeOfAddressActivity.this.getDob();
                Intrinsics.checkNotNull(dob);
                String lastEndorseRTOCode = ChangeOfAddressActivity.this.getLastEndorseRTOCode();
                String appCategory = ChangeOfAddressActivity.this.getAppCategory();
                a7 a7Var3 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var3 = null;
                }
                String string2 = a7Var3.A.getText().toString();
                a7 a7Var4 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var4 = null;
                }
                String string3 = a7Var4.D.getText().toString();
                a7 a7Var5 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var5 = null;
                }
                String string4 = a7Var5.B.getText().toString();
                String villageOrTown = ChangeOfAddressActivity.this.getPermanentAdd().getVillageOrTown();
                Intrinsics.checkNotNull(villageOrTown);
                String subDistrict = ChangeOfAddressActivity.this.getPermanentAdd().getSubDistrict();
                Intrinsics.checkNotNull(subDistrict);
                String district = ChangeOfAddressActivity.this.getPermanentAdd().getDistrict();
                Intrinsics.checkNotNull(district);
                String strB3 = ChangeOfAddressActivity.this.b3();
                a7 a7Var6 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var6 = null;
                }
                String string5 = a7Var6.O.getText().toString();
                a7 a7Var7 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var7 = null;
                }
                String string6 = a7Var7.L.getText().toString();
                a7 a7Var8 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var8 = null;
                }
                String string7 = a7Var8.P.getText().toString();
                a7 a7Var9 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var9 = null;
                }
                String string8 = a7Var9.N.getText().toString();
                String villageOrTown2 = ChangeOfAddressActivity.this.getPresentAdd().getVillageOrTown();
                Intrinsics.checkNotNull(villageOrTown2);
                String subDistrict2 = ChangeOfAddressActivity.this.getPresentAdd().getSubDistrict();
                Intrinsics.checkNotNull(subDistrict2);
                String district2 = ChangeOfAddressActivity.this.getPresentAdd().getDistrict();
                Intrinsics.checkNotNull(district2);
                String strJ2 = ChangeOfAddressActivity.this.J2();
                a7 a7Var10 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    a7Var2 = a7Var10;
                }
                String string9 = a7Var2.O.getText().toString();
                String mobile_no = ChangeOfAddressActivity.this.getMobile_no();
                Intrinsics.checkNotNull(mobile_no);
                xh0Var.p(string, dob, lastEndorseRTOCode, appCategory, "B", string2, string3, string4, villageOrTown, subDistrict, district, strB3, string5, string6, string7, string8, villageOrTown2, subDistrict2, district2, strJ2, string9, "DelhTrans", "0.0.0.0", "d9fe1613399b0883e4ecf3f710e18317", "sarathiservice", mobile_no, ChangeOfAddressActivity.this.g3().f(), ChangeOfAddressActivity.this.g3().g(), ChangeOfAddressActivity.this.g3().e(), ChangeOfAddressActivity.this.g3().h());
            }
        }
    }

    public static final class j implements d86.b {
        public j() {
        }

        @Override // com.zepto.d86.b
        public void a(String str, int i) {
            DistrictsMasterItem districtsMasterItem;
            DistrictsMasterItem districtsMasterItem2;
            String str2 = ChangeOfAddressActivity.this.isCurrentOrPermanentAddress;
            xh0 xh0Var = null;
            if (Intrinsics.areEqual(str2, "dl-renewal-current-address")) {
                List list = ChangeOfAddressActivity.this.mCurrDistList;
                String distCode = (list == null || (districtsMasterItem2 = (DistrictsMasterItem) list.get(i)) == null) ? null : districtsMasterItem2.getDistCode();
                a7 a7Var = ChangeOfAddressActivity.this.mBinding;
                if (a7Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var = null;
                }
                a7Var.x.setText(str);
                a7 a7Var2 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var2 = null;
                }
                a7Var2.x.setContentDescription(distCode);
                ChangeOfAddressActivity.this.getPresentAdd().setDistrict(distCode);
                ChangeOfAddressActivity.this.B2();
                if (distCode != null) {
                    ChangeOfAddressActivity changeOfAddressActivity = ChangeOfAddressActivity.this;
                    changeOfAddressActivity.W2().setVisibility(0);
                    xh0 xh0Var2 = changeOfAddressActivity.viewModel;
                    if (xh0Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    } else {
                        xh0Var = xh0Var2;
                    }
                    xh0Var.n(StringsKt__StringsKt.trim((CharSequence) changeOfAddressActivity.getLastEndorseStateCode()).toString(), distCode);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(str2, "dl-renewal-permanent-addressx")) {
                List list2 = ChangeOfAddressActivity.this.mPermDistList;
                String distCode2 = (list2 == null || (districtsMasterItem = (DistrictsMasterItem) list2.get(i)) == null) ? null : districtsMasterItem.getDistCode();
                a7 a7Var3 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var3 = null;
                }
                a7Var3.F.setText(str);
                a7 a7Var4 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var4 = null;
                }
                a7Var4.F.setContentDescription(distCode2);
                ChangeOfAddressActivity.this.getPermanentAdd().setDistrict(distCode2);
                ChangeOfAddressActivity.this.E2();
                if (distCode2 != null) {
                    ChangeOfAddressActivity changeOfAddressActivity2 = ChangeOfAddressActivity.this;
                    changeOfAddressActivity2.W2().setVisibility(0);
                    xh0 xh0Var3 = changeOfAddressActivity2.viewModel;
                    if (xh0Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    } else {
                        xh0Var = xh0Var3;
                    }
                    xh0Var.n(StringsKt__StringsKt.trim((CharSequence) changeOfAddressActivity2.getLastEndorseStateCode()).toString(), distCode2);
                }
            }
        }
    }

    public static final class k implements d86.b {
        public final /* synthetic */ Ref.ObjectRef b;

        public k(Ref.ObjectRef objectRef) {
            this.b = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.zepto.d86.b
        public void a(String str, int i) {
            TalukaMasterItem talukaMasterItem;
            TalukaMasterItem talukaMasterItem2;
            a7 a7Var = null;
            DOEkycX dOEkycX = null;
            DOEkycX dOEkycX2 = null;
            a7 a7Var2 = null;
            if (!Intrinsics.areEqual(ChangeOfAddressActivity.this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                List list = ChangeOfAddressActivity.this.mPermTalukaList;
                String subDistcode = (list == null || (talukaMasterItem = (TalukaMasterItem) list.get(i)) == null) ? null : talukaMasterItem.getSubDistcode();
                a7 a7Var3 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var3 = null;
                }
                a7Var3.E.setText(str);
                a7 a7Var4 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var4 = null;
                }
                a7Var4.E.setContentDescription(subDistcode);
                ChangeOfAddressActivity.this.getPermanentAdd().setSubDistrict(subDistcode);
                ChangeOfAddressActivity.this.d3((String) this.b.element);
                a7 a7Var5 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var5 = null;
                }
                EditText editText = a7Var5.B;
                StringBuilder sb = new StringBuilder();
                a7 a7Var6 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var6 = null;
                }
                sb.append((Object) a7Var6.E.getText());
                sb.append(", ");
                a7 a7Var7 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var7 = null;
                }
                sb.append((Object) a7Var7.F.getText());
                sb.append(", ");
                a7 a7Var8 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    a7Var = a7Var8;
                }
                sb.append((Object) a7Var.G.getText());
                editText.setText(sb.toString());
                return;
            }
            List list2 = ChangeOfAddressActivity.this.mCurrTalukaList;
            String subDistcode2 = (list2 == null || (talukaMasterItem2 = (TalukaMasterItem) list2.get(i)) == null) ? null : talukaMasterItem2.getSubDistcode();
            a7 a7Var9 = ChangeOfAddressActivity.this.mBinding;
            if (a7Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var9 = null;
            }
            a7Var9.w.setText(str);
            a7 a7Var10 = ChangeOfAddressActivity.this.mBinding;
            if (a7Var10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var10 = null;
            }
            a7Var10.w.setContentDescription(subDistcode2);
            ChangeOfAddressActivity.this.getPresentAdd().setSubDistrict(subDistcode2);
            ChangeOfAddressActivity.this.K2((String) this.b.element);
            if (!Intrinsics.areEqual(ChangeOfAddressActivity.this.g3().g(), "Y")) {
                a7 a7Var11 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var11 = null;
                }
                EditText editText2 = a7Var11.N;
                StringBuilder sb2 = new StringBuilder();
                a7 a7Var12 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var12 = null;
                }
                sb2.append((Object) a7Var12.w.getText());
                sb2.append(", ");
                a7 a7Var13 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var13 = null;
                }
                sb2.append((Object) a7Var13.x.getText());
                sb2.append(", ");
                a7 a7Var14 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    a7Var2 = a7Var14;
                }
                sb2.append((Object) a7Var2.y.getText());
                editText2.setText(sb2.toString());
                return;
            }
            DOEkycX dOEkycX3 = ChangeOfAddressActivity.this.adharData;
            if (dOEkycX3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX3 = null;
            }
            if (kt6.d(dOEkycX3.getLandMark())) {
                a7 a7Var15 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var15 = null;
                }
                EditText editText3 = a7Var15.N;
                DOEkycX dOEkycX4 = ChangeOfAddressActivity.this.adharData;
                if (dOEkycX4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adharData");
                } else {
                    dOEkycX = dOEkycX4;
                }
                editText3.setText(dOEkycX.getLandMark());
                return;
            }
            a7 a7Var16 = ChangeOfAddressActivity.this.mBinding;
            if (a7Var16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var16 = null;
            }
            EditText editText4 = a7Var16.N;
            StringBuilder sb3 = new StringBuilder();
            a7 a7Var17 = ChangeOfAddressActivity.this.mBinding;
            if (a7Var17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var17 = null;
            }
            sb3.append((Object) a7Var17.w.getText());
            sb3.append(", ");
            DOEkycX dOEkycX5 = ChangeOfAddressActivity.this.adharData;
            if (dOEkycX5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX5 = null;
            }
            sb3.append(dOEkycX5.getLocalityIfAny());
            sb3.append(", ");
            DOEkycX dOEkycX6 = ChangeOfAddressActivity.this.adharData;
            if (dOEkycX6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX6 = null;
            }
            sb3.append(dOEkycX6.getDist());
            sb3.append(", ");
            DOEkycX dOEkycX7 = ChangeOfAddressActivity.this.adharData;
            if (dOEkycX7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
            } else {
                dOEkycX2 = dOEkycX7;
            }
            sb3.append(dOEkycX2.getState());
            editText4.setText(sb3.toString());
        }
    }

    public static final class l implements d86.b {
        public l() {
        }

        @Override // com.zepto.d86.b
        public void a(String str, int i) {
            VillageOrTownMasterItem villageOrTownMasterItem;
            VillageOrTownMasterItem villageOrTownMasterItem2;
            a7 a7Var = null;
            if (Intrinsics.areEqual(ChangeOfAddressActivity.this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                List list = ChangeOfAddressActivity.this.mCurrVillageOrTownList;
                String villageCode = (list == null || (villageOrTownMasterItem2 = (VillageOrTownMasterItem) list.get(i)) == null) ? null : villageOrTownMasterItem2.getVillageCode();
                a7 a7Var2 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var2 = null;
                }
                a7Var2.M.setText(str);
                a7 a7Var3 = ChangeOfAddressActivity.this.mBinding;
                if (a7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    a7Var = a7Var3;
                }
                a7Var.M.setContentDescription(villageCode);
                ChangeOfAddressActivity.this.getPresentAdd().setVillageOrTown(villageCode);
                return;
            }
            List list2 = ChangeOfAddressActivity.this.mPermVillageOrTownList;
            String villageCode2 = (list2 == null || (villageOrTownMasterItem = (VillageOrTownMasterItem) list2.get(i)) == null) ? null : villageOrTownMasterItem.getVillageCode();
            a7 a7Var4 = ChangeOfAddressActivity.this.mBinding;
            if (a7Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var4 = null;
            }
            a7Var4.H.setText(str);
            a7 a7Var5 = ChangeOfAddressActivity.this.mBinding;
            if (a7Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                a7Var = a7Var5;
            }
            a7Var.H.setContentDescription(villageCode2);
            ChangeOfAddressActivity.this.getPermanentAdd().setVillageOrTown(villageCode2);
        }
    }

    public static final class m implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public m(Function1 function) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void A2() {
        a7 a7Var = this.mBinding;
        a7 a7Var2 = null;
        if (a7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var = null;
        }
        a7Var.x.setText("");
        a7 a7Var3 = this.mBinding;
        if (a7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            a7Var2 = a7Var3;
        }
        a7Var2.x.setHint(O2().b("edit_dl_serv_selc_district", getString(R.string.select_district)));
        this.mCurrTalukaList = CollectionsKt__CollectionsKt.emptyList();
        B2();
    }

    public static final void A3(ChangeOfAddressActivity this$0, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a7 a7Var = null;
        try {
            if (z) {
                this$0.W3();
                a7 a7Var2 = this$0.mBinding;
                if (a7Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var2 = null;
                }
                a7Var2.G.setEnabled(false);
                a7 a7Var3 = this$0.mBinding;
                if (a7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var3 = null;
                }
                a7Var3.F.setEnabled(false);
                a7 a7Var4 = this$0.mBinding;
                if (a7Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var4 = null;
                }
                a7Var4.E.setEnabled(false);
                a7 a7Var5 = this$0.mBinding;
                if (a7Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var5 = null;
                }
                a7Var5.H.setEnabled(false);
                a7 a7Var6 = this$0.mBinding;
                if (a7Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var6 = null;
                }
                a7Var6.B.setEnabled(false);
                a7 a7Var7 = this$0.mBinding;
                if (a7Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var7 = null;
                }
                a7Var7.A.setEnabled(false);
                a7 a7Var8 = this$0.mBinding;
                if (a7Var8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var8 = null;
                }
                a7Var8.D.setEnabled(false);
                a7 a7Var9 = this$0.mBinding;
                if (a7Var9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var9 = null;
                }
                a7Var9.C.setEnabled(false);
            } else {
                a7 a7Var10 = this$0.mBinding;
                if (a7Var10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var10 = null;
                }
                a7Var10.G.setEnabled(true);
                a7 a7Var11 = this$0.mBinding;
                if (a7Var11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var11 = null;
                }
                a7Var11.F.setEnabled(true);
                a7 a7Var12 = this$0.mBinding;
                if (a7Var12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var12 = null;
                }
                a7Var12.E.setEnabled(true);
                a7 a7Var13 = this$0.mBinding;
                if (a7Var13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var13 = null;
                }
                a7Var13.H.setEnabled(true);
                a7 a7Var14 = this$0.mBinding;
                if (a7Var14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var14 = null;
                }
                a7Var14.B.setEnabled(true);
                a7 a7Var15 = this$0.mBinding;
                if (a7Var15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var15 = null;
                }
                a7Var15.A.setEnabled(true);
                a7 a7Var16 = this$0.mBinding;
                if (a7Var16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var16 = null;
                }
                a7Var16.D.setEnabled(true);
                a7 a7Var17 = this$0.mBinding;
                if (a7Var17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var17 = null;
                }
                a7Var17.C.setEnabled(true);
                this$0.permanentAdd = new DlAddress("", "", "", "", "", "", "", "");
                a7 a7Var18 = this$0.mBinding;
                if (a7Var18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var18 = null;
                }
                a7Var18.F.setText("");
                a7 a7Var19 = this$0.mBinding;
                if (a7Var19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var19 = null;
                }
                a7Var19.E.setText("");
                a7 a7Var20 = this$0.mBinding;
                if (a7Var20 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var20 = null;
                }
                a7Var20.H.setText("");
                a7 a7Var21 = this$0.mBinding;
                if (a7Var21 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var21 = null;
                }
                a7Var21.B.setText("");
                a7 a7Var22 = this$0.mBinding;
                if (a7Var22 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var22 = null;
                }
                a7Var22.A.setText("");
                a7 a7Var23 = this$0.mBinding;
                if (a7Var23 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var23 = null;
                }
                a7Var23.D.setText("");
                a7 a7Var24 = this$0.mBinding;
                if (a7Var24 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var24 = null;
                }
                a7Var24.C.setText("");
            }
            a7 a7Var25 = this$0.mBinding;
            if (a7Var25 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var25 = null;
            }
            a7Var25.x(this$0.permanentAdd);
            a7 a7Var26 = this$0.mBinding;
            if (a7Var26 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                a7Var = a7Var26;
            }
            a7Var.a();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B2() {
        a7 a7Var = this.mBinding;
        a7 a7Var2 = null;
        if (a7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var = null;
        }
        a7Var.w.setText("");
        a7 a7Var3 = this.mBinding;
        if (a7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            a7Var2 = a7Var3;
        }
        a7Var2.w.setHint(O2().b("edit_dl_serv_selc_block", getString(R.string.select_taluka)));
        this.mCurrTalukaList = CollectionsKt__CollectionsKt.emptyList();
        C2();
        C2();
    }

    public static final void B3(ChangeOfAddressActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(this$0.g3().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            this$0.V3();
            return;
        }
        try {
            if (this$0.p3()) {
                if (Intrinsics.areEqual(this$0.state_value, "differ")) {
                    if (Intrinsics.areEqual(this$0.g3().b(), VContant.MAINSCREEN) || Intrinsics.areEqual(this$0.g3().b(), "537")) {
                        this$0.n3(new Intent(this$0, (Class<?>) RenewalOfDLActivity.class));
                    } else if (Intrinsics.areEqual(this$0.g3().b(), VContant.APPLICATION_SCREEN)) {
                        this$0.n3(new Intent(this$0, (Class<?>) DLDuplicateActivity.class));
                    } else if (Intrinsics.areEqual(this$0.g3().b(), VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE)) {
                        this$0.n3(new Intent(this$0, (Class<?>) DLReplecementActivity.class));
                    } else if (Intrinsics.areEqual(this$0.g3().b(), "3")) {
                        String strB = this$0.O2().b("nex_parivahan", this$0.getString(R.string.app_name));
                        Intrinsics.checkNotNull(strB);
                        String strB2 = this$0.O2().b("label_want_to_proceed", this$0.getString(R.string.are_you_want_to_proceed));
                        Intrinsics.checkNotNull(strB2);
                        o40.q1(this$0, strB, strB2, 0, null, null, this$0.new g(), 24, null);
                    }
                } else if (!StringsKt__StringsJVMKt.equals(this$0.I2(), "S", true) || !Intrinsics.areEqual(this$0.state_value, "same")) {
                    String strB3 = this$0.O2().b("nex_parivahan", this$0.getString(R.string.app_name));
                    Intrinsics.checkNotNull(strB3);
                    String strB4 = this$0.O2().b("label_want_to_proceed", this$0.getString(R.string.are_you_want_to_proceed));
                    Intrinsics.checkNotNull(strB4);
                    o40.q1(this$0, strB3, strB4, 0, null, null, this$0.new i(), 24, null);
                } else if (Intrinsics.areEqual(this$0.g3().b(), VContant.APPLICATION_SCREEN)) {
                    this$0.n3(new Intent(this$0, (Class<?>) DLDuplicateActivity.class));
                } else if (Intrinsics.areEqual(this$0.g3().b(), VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE)) {
                    this$0.n3(new Intent(this$0, (Class<?>) DLReplecementActivity.class));
                } else if (Intrinsics.areEqual(this$0.g3().b(), VContant.MAINSCREEN) || Intrinsics.areEqual(this$0.g3().b(), "537")) {
                    this$0.n3(new Intent(this$0, (Class<?>) RenewalOfDLActivity.class));
                } else if (Intrinsics.areEqual(this$0.g3().b(), VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE)) {
                    this$0.n3(new Intent(this$0, (Class<?>) DLExtractActivity.class));
                } else if (Intrinsics.areEqual(this$0.g3().b(), "4")) {
                    this$0.n3(new Intent(this$0, (Class<?>) DLIdpActivity.class));
                } else if (Intrinsics.areEqual(this$0.g3().b(), "3")) {
                    String strB5 = this$0.O2().b("nex_parivahan", this$0.getString(R.string.app_name));
                    Intrinsics.checkNotNull(strB5);
                    String strB6 = this$0.O2().b("label_want_to_proceed", this$0.getString(R.string.are_you_want_to_proceed));
                    Intrinsics.checkNotNull(strB6);
                    o40.q1(this$0, strB5, strB6, 0, null, null, this$0.new h(), 24, null);
                }
            }
        } catch (Exception unused) {
        }
    }

    private final void C2() {
        a7 a7Var = this.mBinding;
        a7 a7Var2 = null;
        if (a7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var = null;
        }
        a7Var.M.setText("");
        a7 a7Var3 = this.mBinding;
        if (a7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            a7Var2 = a7Var3;
        }
        a7Var2.M.setHint(O2().b("edit_dl_serv_selc_town", getString(R.string.sel_vt)));
        this.mCurrVillageOrTownList = CollectionsKt__CollectionsKt.emptyList();
    }

    public static final void C3(ChangeOfAddressActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a7 a7Var = this$0.mBinding;
        a7 a7Var2 = null;
        if (a7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var = null;
        }
        a7Var.U.setVisibility(8);
        a7 a7Var3 = this$0.mBinding;
        if (a7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var3 = null;
        }
        a7Var3.T.setVisibility(0);
        a7 a7Var4 = this$0.mBinding;
        if (a7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            a7Var2 = a7Var4;
        }
        a7Var2.b0.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D2() {
        a7 a7Var = this.mBinding;
        a7 a7Var2 = null;
        if (a7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var = null;
        }
        a7Var.F.setText("");
        a7 a7Var3 = this.mBinding;
        if (a7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            a7Var2 = a7Var3;
        }
        a7Var2.F.setHint(O2().b("edit_dl_serv_selc_district", getString(R.string.select_district)));
        this.mPermDistList = CollectionsKt__CollectionsKt.emptyList();
        E2();
    }

    public static final void D3(ChangeOfAddressActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a7 a7Var = this$0.mBinding;
        a7 a7Var2 = null;
        if (a7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var = null;
        }
        a7Var.U.setVisibility(0);
        a7 a7Var3 = this$0.mBinding;
        if (a7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var3 = null;
        }
        a7Var3.T.setVisibility(8);
        a7 a7Var4 = this$0.mBinding;
        if (a7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            a7Var2 = a7Var4;
        }
        a7Var2.b0.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E2() {
        a7 a7Var = this.mBinding;
        a7 a7Var2 = null;
        if (a7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var = null;
        }
        a7Var.E.setText("");
        a7 a7Var3 = this.mBinding;
        if (a7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            a7Var2 = a7Var3;
        }
        a7Var2.E.setHint(O2().b("edit_dl_serv_selc_block", getString(R.string.select_taluka)));
        this.mPermTalukaList = CollectionsKt__CollectionsKt.emptyList();
        F2();
    }

    public static final void E3(ChangeOfAddressActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a7 a7Var = this$0.mBinding;
        a7 a7Var2 = null;
        if (a7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var = null;
        }
        a7Var.j0.setVisibility(8);
        a7 a7Var3 = this$0.mBinding;
        if (a7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var3 = null;
        }
        a7Var3.i0.setVisibility(0);
        a7 a7Var4 = this$0.mBinding;
        if (a7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            a7Var2 = a7Var4;
        }
        a7Var2.c0.setVisibility(8);
    }

    private final void F2() {
        a7 a7Var = this.mBinding;
        a7 a7Var2 = null;
        if (a7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var = null;
        }
        a7Var.H.setText("");
        a7 a7Var3 = this.mBinding;
        if (a7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            a7Var2 = a7Var3;
        }
        a7Var2.H.setHint(O2().b("edit_dl_serv_selc_town", getString(R.string.sel_vt)));
        this.mPermVillageOrTownList = CollectionsKt__CollectionsKt.emptyList();
    }

    public static final void F3(ChangeOfAddressActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a7 a7Var = this$0.mBinding;
        a7 a7Var2 = null;
        if (a7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var = null;
        }
        a7Var.j0.setVisibility(0);
        a7 a7Var3 = this$0.mBinding;
        if (a7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var3 = null;
        }
        a7Var3.i0.setVisibility(8);
        a7 a7Var4 = this$0.mBinding;
        if (a7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            a7Var2 = a7Var4;
        }
        a7Var2.c0.setVisibility(0);
    }

    public static final void G3(ChangeOfAddressActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a7 a7Var = this$0.mBinding;
        a7 a7Var2 = null;
        if (a7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var = null;
        }
        a7Var.g0.setVisibility(8);
        a7 a7Var3 = this$0.mBinding;
        if (a7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var3 = null;
        }
        a7Var3.h0.setVisibility(0);
        a7 a7Var4 = this$0.mBinding;
        if (a7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            a7Var2 = a7Var4;
        }
        a7Var2.S.setVisibility(0);
    }

    public static final void H3(ChangeOfAddressActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a7 a7Var = this$0.mBinding;
        a7 a7Var2 = null;
        if (a7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var = null;
        }
        a7Var.g0.setVisibility(0);
        a7 a7Var3 = this$0.mBinding;
        if (a7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var3 = null;
        }
        a7Var3.h0.setVisibility(8);
        a7 a7Var4 = this$0.mBinding;
        if (a7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            a7Var2 = a7Var4;
        }
        a7Var2.S.setVisibility(8);
    }

    public static final void I3(ChangeOfAddressActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) DlServiceDetailsActivity.class);
            intent.putExtra("DL", this$0.dlNo);
            intent.putExtra("dob", this$0.dob);
            intent.putExtra("DLDetails", this$0.L2());
            intent.putExtra("Mobile_no", this$0.mobile_no);
            intent.putExtra("lastEndorsedRTO", this$0.lastEndorseRto);
            intent.putExtra("lastEndorsedState", this$0.lastEndorseState);
            intent.putExtra("lastEndorsedRTOCode", this$0.lastEndorseRTOCode);
            intent.putExtra("lastEndorseStateCode", this$0.lastEndorseStateCode);
            intent.putExtra("whatServiceRequired", this$0.whatServiceRequired);
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final void J3(ChangeOfAddressActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K2(String villaOrTown) {
        try {
            a7 a7Var = this.mBinding;
            a7 a7Var2 = null;
            if (a7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var = null;
            }
            String string = a7Var.w.getContentDescription().toString();
            C2();
            W2().setVisibility(0);
            xh0 xh0Var = this.viewModel;
            if (xh0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                xh0Var = null;
            }
            String string2 = StringsKt__StringsKt.trim((CharSequence) this.lastEndorseStateCode).toString();
            a7 a7Var3 = this.mBinding;
            if (a7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                a7Var2 = a7Var3;
            }
            xh0Var.o(string2, a7Var2.x.getContentDescription().toString(), string, villaOrTown);
        } catch (Exception unused) {
        }
    }

    public static final void K3(View view) {
    }

    /* JADX WARN: Not initialized variable reg: 25, insn: 0x0259: MOVE (r3 I:??[OBJECT, ARRAY]) = (r25 I:??[OBJECT, ARRAY]), block:B:57:0x0259 */
    public static final void M3(ChangeOfAddressActivity this$0, GetAckDetForGivenDLNumberResponse getAckDetForGivenDLNumberResponse) throws Throwable {
        int i2;
        a7 a7Var;
        String str;
        String str2;
        List<ResultItemSubmit> result;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a7 a7Var2 = this$0.mBinding;
        if (a7Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var2 = null;
        }
        ChangeOfAddressActivity changeOfAddressActivity = null;
        a7Var2.s0.c(false);
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
                            try {
                                String str3 = "";
                                if (CollectionsKt___CollectionsKt.contains(this$0.Z2(), this$0.O2().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                                    str3 = "513,";
                                }
                                if (CollectionsKt___CollectionsKt.contains(this$0.Z2(), this$0.O2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                                    str3 = str3 + "514,";
                                }
                                if (CollectionsKt___CollectionsKt.contains(this$0.Z2(), this$0.O2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                                    str3 = str3 + "537,";
                                }
                                if (CollectionsKt___CollectionsKt.contains(this$0.Z2(), this$0.O2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                                    str3 = str3 + "515,";
                                }
                                if (CollectionsKt___CollectionsKt.contains(this$0.Z2(), this$0.O2().b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                                    str3 = str3 + "516,";
                                }
                                if (CollectionsKt___CollectionsKt.contains(this$0.Z2(), this$0.O2().b("check_dl_serv_extract_dl", "DL Extract"))) {
                                    str3 = str3 + "523,";
                                }
                                if (CollectionsKt___CollectionsKt.contains(this$0.Z2(), this$0.O2().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                                    str3 = str3 + "524,";
                                }
                                if (CollectionsKt___CollectionsKt.contains(this$0.Z2(), this$0.O2().b("change_name_dl", "Change of Name in DL"))) {
                                    str3 = str3 + "526,";
                                }
                                if (CollectionsKt___CollectionsKt.contains(this$0.Z2(), this$0.O2().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                                    str3 = str3 + "548";
                                }
                                String str4 = str3;
                                DlLogCapture.Companion companion = DlLogCapture.INSTANCE;
                                String applicationDate = resultItemSubmit.getApplicationDate();
                                String applicationNo = resultItemSubmit.getApplicationNo();
                                Intrinsics.checkNotNull(applicationNo);
                                long j2 = Long.parseLong(applicationNo);
                                int i3 = Integer.parseInt(this$0.X2().k());
                                String dateofBirth = resultItemSubmit.getDateofBirth();
                                String dlno = resultItemSubmit.getDlno();
                                Intrinsics.checkNotNull(dlno);
                                String applicantGender = resultItemSubmit.getApplicantGender();
                                String str5 = this$0.mobile_no;
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
                            dLServiceAcknowlegementActivity.K2(this$0, resultItemSubmit, this$0.lastEndorseRTOCode, this$0.L2(), this$0.dlNo, this$0.dob, this$0.mobile_no, this$0.lastEndorseRto, this$0.lastEndorseState, this$0.lastEndorseStateCode, this$0.T2());
                            return;
                        }
                        return;
                    } catch (Exception unused4) {
                        a7Var = null;
                        changeOfAddressActivity = this$0;
                        i2 = R.string.unable_to_get_details;
                        str = "service_is_not_present";
                    }
                } else {
                    a7Var = null;
                    changeOfAddressActivity = this$0;
                    DlSubmitResult dlSubmitresult3 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                    String reqStatus = dlSubmitresult3 != null ? dlSubmitresult3.getReqStatus() : null;
                    if (reqStatus != null && reqStatus.length() != 0) {
                        DlSubmitResult dlSubmitresult4 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                        String reqStatus2 = dlSubmitresult4 != null ? dlSubmitresult4.getReqStatus() : null;
                        Intrinsics.checkNotNull(reqStatus2);
                        changeOfAddressActivity.S3(reqStatus2);
                        return;
                    }
                    wa3 wa3VarO2 = this$0.O2();
                    i2 = R.string.unable_to_get_details;
                    try {
                        str = "service_is_not_present";
                        try {
                            changeOfAddressActivity.S3(wa3VarO2.b(str, changeOfAddressActivity.getString(R.string.unable_to_get_details)));
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
            a7Var = null;
            str = "service_is_not_present";
            changeOfAddressActivity = this$0;
        }
        a7 a7Var3 = changeOfAddressActivity.mBinding;
        if (a7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var3 = a7Var;
        }
        a7Var3.s0.c(false);
        changeOfAddressActivity.S3(this$0.O2().b(str, changeOfAddressActivity.getString(i2)));
    }

    public static final void N3(ChangeOfAddressActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a7 a7Var = this$0.mBinding;
        if (a7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var = null;
        }
        a7Var.s0.c(false);
        this$0.S3(this$0.O2().b("service_is_not_present", this$0.getString(R.string.unable_to_get_details)));
    }

    public static final void O3(ChangeOfAddressActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    private final void P3(String fromWhere) {
        try {
            this.isCurrentOrPermanentAddress = fromWhere;
            ArrayList arrayList = new ArrayList();
            if (Intrinsics.areEqual(this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                List<DistrictsMasterItem> list = this.mCurrDistList;
                if (list != null) {
                    for (DistrictsMasterItem districtsMasterItem : list) {
                        arrayList.add(String.valueOf(districtsMasterItem != null ? districtsMasterItem.getDistName() : null));
                    }
                }
            } else {
                List<DistrictsMasterItem> list2 = this.mPermDistList;
                if (list2 != null) {
                    for (DistrictsMasterItem districtsMasterItem2 : list2) {
                        arrayList.add(String.valueOf(districtsMasterItem2 != null ? districtsMasterItem2.getDistName() : null));
                    }
                }
            }
            d86 d86VarA = d86.INSTANCE.a("Select Districts", arrayList);
            d86VarA.k2(I0(), "DistPicker");
            d86VarA.n2(new j());
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    private final void Q3(String fromWhere) {
        try {
            this.isCurrentOrPermanentAddress = fromWhere;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            ArrayList arrayList = new ArrayList();
            String str = "R";
            a7 a7Var = null;
            if (Intrinsics.areEqual(this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                List<TalukaMasterItem> list = this.mCurrTalukaList;
                if (list != null) {
                    for (TalukaMasterItem talukaMasterItem : list) {
                        arrayList.add(String.valueOf(talukaMasterItem != null ? talukaMasterItem.getSubDistname() : null));
                    }
                }
                a7 a7Var2 = this.mBinding;
                if (a7Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    a7Var = a7Var2;
                }
                ?? r2 = str;
                if (a7Var.t0.isChecked()) {
                    r2 = "U";
                }
                objectRef.element = r2;
                this.presSelectedVillOrTown = r2;
            } else {
                List<TalukaMasterItem> list2 = this.mPermTalukaList;
                if (list2 != null) {
                    for (TalukaMasterItem talukaMasterItem2 : list2) {
                        arrayList.add(String.valueOf(talukaMasterItem2 != null ? talukaMasterItem2.getSubDistname() : null));
                    }
                }
                a7 a7Var3 = this.mBinding;
                if (a7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    a7Var = a7Var3;
                }
                ?? r22 = str;
                if (a7Var.I.isChecked()) {
                    r22 = "U";
                }
                objectRef.element = r22;
                this.permSelectedVillOrTown = r22;
            }
            d86 d86VarA = d86.INSTANCE.a("Select Taluka", arrayList);
            d86VarA.k2(I0(), "TalukaPicker");
            d86VarA.n2(new k(objectRef));
        } catch (Exception unused) {
        }
    }

    private final void R3(String fromWhere) {
        try {
            this.isCurrentOrPermanentAddress = fromWhere;
            ArrayList arrayList = new ArrayList();
            if (Intrinsics.areEqual(this.isCurrentOrPermanentAddress, "dl-renewal-current-address")) {
                List<VillageOrTownMasterItem> list = this.mCurrVillageOrTownList;
                if (list != null) {
                    for (VillageOrTownMasterItem villageOrTownMasterItem : list) {
                        arrayList.add(String.valueOf(villageOrTownMasterItem != null ? villageOrTownMasterItem.getVillageName() : null));
                    }
                }
            } else {
                List<VillageOrTownMasterItem> list2 = this.mPermVillageOrTownList;
                if (list2 != null) {
                    for (VillageOrTownMasterItem villageOrTownMasterItem2 : list2) {
                        arrayList.add(String.valueOf(villageOrTownMasterItem2 != null ? villageOrTownMasterItem2.getVillageName() : null));
                    }
                }
            }
            d86 d86VarA = d86.INSTANCE.a("Select Village/Town", arrayList);
            d86VarA.k2(I0(), "VillageTownPicker");
            d86VarA.n2(new l());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S3(String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressActivity.T3(dialog, view);
            }
        });
        dialog.show();
    }

    public static final void T3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void W3() {
        try {
            this.permanentAdd = this.presentAdd;
            k4(this.lastEndorseStateCode);
            a4(this.lastEndorseStateCode);
            a7 a7Var = this.mBinding;
            a7 a7Var2 = null;
            if (a7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var = null;
            }
            EditText editText = a7Var.F;
            a7 a7Var3 = this.mBinding;
            if (a7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var3 = null;
            }
            editText.setText(a7Var3.x.getText());
            a7 a7Var4 = this.mBinding;
            if (a7Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var4 = null;
            }
            EditText editText2 = a7Var4.E;
            a7 a7Var5 = this.mBinding;
            if (a7Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var5 = null;
            }
            editText2.setText(a7Var5.w.getText());
            a7 a7Var6 = this.mBinding;
            if (a7Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var6 = null;
            }
            EditText editText3 = a7Var6.H;
            a7 a7Var7 = this.mBinding;
            if (a7Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var7 = null;
            }
            editText3.setText(a7Var7.M.getText());
            a7 a7Var8 = this.mBinding;
            if (a7Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var8 = null;
            }
            EditText editText4 = a7Var8.A;
            a7 a7Var9 = this.mBinding;
            if (a7Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var9 = null;
            }
            editText4.setText(a7Var9.L.getText());
            a7 a7Var10 = this.mBinding;
            if (a7Var10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var10 = null;
            }
            EditText editText5 = a7Var10.D;
            a7 a7Var11 = this.mBinding;
            if (a7Var11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var11 = null;
            }
            editText5.setText(a7Var11.P.getText());
            a7 a7Var12 = this.mBinding;
            if (a7Var12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var12 = null;
            }
            EditText editText6 = a7Var12.B;
            a7 a7Var13 = this.mBinding;
            if (a7Var13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var13 = null;
            }
            editText6.setText(a7Var13.N.getText());
            a7 a7Var14 = this.mBinding;
            if (a7Var14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var14 = null;
            }
            EditText editText7 = a7Var14.C;
            a7 a7Var15 = this.mBinding;
            if (a7Var15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var15 = null;
            }
            editText7.setText(a7Var15.O.getText());
            a7 a7Var16 = this.mBinding;
            if (a7Var16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var16 = null;
            }
            if (a7Var16.R0.isChecked()) {
                a7 a7Var17 = this.mBinding;
                if (a7Var17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    a7Var2 = a7Var17;
                }
                a7Var2.J.setChecked(true);
            } else {
                a7 a7Var18 = this.mBinding;
                if (a7Var18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var18 = null;
                }
                if (a7Var18.t0.isChecked()) {
                    a7 a7Var19 = this.mBinding;
                    if (a7Var19 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    } else {
                        a7Var2 = a7Var19;
                    }
                    a7Var2.I.setChecked(true);
                }
            }
            this.permSelectedVillOrTown = this.presSelectedVillOrTown;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d3(String villaOrTown) {
        try {
            a7 a7Var = this.mBinding;
            a7 a7Var2 = null;
            if (a7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var = null;
            }
            String string = a7Var.E.getContentDescription().toString();
            F2();
            W2().setVisibility(0);
            xh0 xh0Var = this.viewModel;
            if (xh0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                xh0Var = null;
            }
            String string2 = StringsKt__StringsKt.trim((CharSequence) this.lastEndorseStateCode).toString();
            a7 a7Var3 = this.mBinding;
            if (a7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                a7Var2 = a7Var3;
            }
            xh0Var.o(string2, a7Var2.F.getContentDescription().toString(), string, villaOrTown);
        } catch (Exception unused) {
        }
    }

    public static final void i3(ChangeOfAddressActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) DlServiceDetailsActivity.class);
            intent.putExtra("DL", this$0.dlNo);
            intent.putExtra("dob", this$0.dob);
            intent.putExtra("DLDetails", this$0.L2());
            intent.putExtra("Mobile_no", this$0.mobile_no);
            intent.putExtra("lastEndorsedRTO", this$0.lastEndorseRto);
            intent.putExtra("lastEndorsedState", this$0.lastEndorseState);
            intent.putExtra("lastEndorsedRTOCode", this$0.lastEndorseRTOCode);
            intent.putExtra("lastEndorseStateCode", this$0.lastEndorseStateCode);
            intent.putExtra("whatServiceRequired", this$0.whatServiceRequired);
            if (Intrinsics.areEqual(this$0.g3().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", this$0.Z2());
            }
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final void j3(ChangeOfAddressActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(this$0.g3().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                if (this$0.T2().size() > 1) {
                    final Dialog dialog = new Dialog(this$0);
                    dialog.setContentView(R.layout.layout_multi);
                    Window window = dialog.getWindow();
                    Intrinsics.checkNotNull(window);
                    int i2 = 0;
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
                    textView.setText(this$0.O2().b("btn_ok", "OK"));
                    ((TextView) viewFindViewById5).setText(this$0.O2().b("title_dl_services", "Driving Licence Services"));
                    ((ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tf0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            ChangeOfAddressActivity.k3(dialog, view2);
                        }
                    });
                    textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.uf0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            ChangeOfAddressActivity.l3(dialog, view2);
                        }
                    });
                    int size = this$0.T2().size();
                    String str = "";
                    String string = "";
                    while (i2 < size) {
                        str = str + ((String) this$0.T2().get(i2)) + '\n';
                        StringBuilder sb = new StringBuilder();
                        sb.append(string);
                        i2++;
                        sb.append(i2);
                        sb.append(".\n");
                        string = sb.toString();
                    }
                    textView2.setText(str);
                    textView3.setText(string);
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

    public static final void k3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void l3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void m3() {
        this.viewModel = (xh0) new z(this).a(xh0.class);
        a7 a7Var = this.mBinding;
        xh0 xh0Var = null;
        if (a7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var = null;
        }
        a7Var.v(this);
        a7 a7Var2 = this.mBinding;
        if (a7Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var2 = null;
        }
        a7Var2.y(this.presentAdd);
        a7 a7Var3 = this.mBinding;
        if (a7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var3 = null;
        }
        a7Var3.x(this.permanentAdd);
        try {
            if (com.nic.mparivahan.a.a.a(this)) {
                a3().show();
                xh0 xh0Var2 = this.viewModel;
                if (xh0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    xh0Var2 = null;
                }
                xh0Var2.m();
            } else {
                Toast.makeText(getApplicationContext(), O2().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 1).show();
            }
        } catch (Exception unused) {
        }
        xh0 xh0Var3 = this.viewModel;
        if (xh0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            xh0Var3 = null;
        }
        xh0Var3.i().g(this, new m(new b()));
        xh0 xh0Var4 = this.viewModel;
        if (xh0Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            xh0Var4 = null;
        }
        xh0Var4.h().g(this, new m(new c()));
        xh0 xh0Var5 = this.viewModel;
        if (xh0Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            xh0Var5 = null;
        }
        xh0Var5.k().g(this, new m(new d()));
        xh0 xh0Var6 = this.viewModel;
        if (xh0Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            xh0Var6 = null;
        }
        xh0Var6.l().g(this, new m(new e()));
        xh0 xh0Var7 = this.viewModel;
        if (xh0Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            xh0Var = xh0Var7;
        }
        xh0Var.j().g(this, new m(new f()));
    }

    private final void o3(Intent intent, String lastEndRTO, String lastEndState, String purCode, ArrayList multiList) {
        try {
            intent.putExtra("DL", this.dlNo);
            intent.putExtra("dob", this.dob);
            intent.putExtra("DLDetails", L2());
            intent.putExtra("Mobile_no", this.mobile_no);
            intent.putExtra("lastEndorsedRTO", lastEndRTO);
            intent.putExtra("lastEndorsedState", lastEndState);
            intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
            intent.putExtra("lastEndorseStateCode", this.lastEndorseStateCode);
            intent.putExtra("whatServiceRequired", this.whatServiceRequired);
            intent.putExtra("state_value", this.state_value);
            intent.putExtra("purCode", purCode);
            intent.putExtra("bioRecGenesis", I2());
            intent.putExtra("allowAddrChangeAtDlservReqst", G2());
            intent.putExtra("metaflag", this.metaflag);
            intent.putExtra("multiList", multiList);
            intent.putExtra("serialNo", this.serialNo + 1);
            intent.putExtra("COA", this.COA);
            intent.putExtra("listHeaderSteps", T2());
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final boolean p3() {
        a7 a7Var = this.mBinding;
        a7 a7Var2 = null;
        if (a7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var = null;
        }
        if (!StringsKt__StringsJVMKt.equals$default(a7Var.s0.getButtonText(), O2().b("vahan_btn_submit", "Submit"), false, 2, null)) {
            a7 a7Var3 = this.mBinding;
            if (a7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var3 = null;
            }
            Editable text = a7Var3.y.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            if (text.length() == 0) {
                Toast.makeText(this, O2().b("select_state", getString(R.string.select_state)), 0).show();
                return false;
            }
            a7 a7Var4 = this.mBinding;
            if (a7Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var4 = null;
            }
            Editable text2 = a7Var4.x.getText();
            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
            if (text2.length() == 0) {
                Toast.makeText(this, O2().b("select_district", getString(R.string.select_district)), 0).show();
                return false;
            }
            a7 a7Var5 = this.mBinding;
            if (a7Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var5 = null;
            }
            Editable text3 = a7Var5.w.getText();
            Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
            if (text3.length() == 0) {
                Toast.makeText(this, O2().b("select_taluka", getString(R.string.select_taluka)), 0).show();
                return false;
            }
            a7 a7Var6 = this.mBinding;
            if (a7Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var6 = null;
            }
            Editable text4 = a7Var6.N.getText();
            Intrinsics.checkNotNullExpressionValue(text4, "getText(...)");
            if (text4.length() == 0) {
                Toast.makeText(this, O2().b("select_landmark", getString(R.string.sel_landmark)), 0).show();
                return false;
            }
            a7 a7Var7 = this.mBinding;
            if (a7Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var7 = null;
            }
            Editable text5 = a7Var7.O.getText();
            Intrinsics.checkNotNullExpressionValue(text5, "getText(...)");
            if (text5.length() == 0) {
                Toast.makeText(this, O2().b("select_pincode", getString(R.string.enter_pincode)), 0).show();
                return false;
            }
            a7 a7Var8 = this.mBinding;
            if (a7Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var8 = null;
            }
            if (a7Var8.O.getText().length() < 6) {
                Toast.makeText(this, O2().b("select_pin_code", getString(R.string.enter_correct_pincode)), 0).show();
                return false;
            }
        } else if (this.appCategory.equals("0")) {
            S3(O2().b("select_app_cat", getString(R.string.sel_app_category)));
            return false;
        }
        a7 a7Var9 = this.mBinding;
        if (a7Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var9 = null;
        }
        Editable text6 = a7Var9.G.getText();
        Intrinsics.checkNotNullExpressionValue(text6, "getText(...)");
        if (text6.length() == 0) {
            Toast.makeText(this, O2().b("select_pstate", getString(R.string.sel_p_state)), 0).show();
            return false;
        }
        if (Intrinsics.areEqual(g3().g(), "N")) {
            a7 a7Var10 = this.mBinding;
            if (a7Var10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var10 = null;
            }
            Editable text7 = a7Var10.F.getText();
            Intrinsics.checkNotNullExpressionValue(text7, "getText(...)");
            if (text7.length() == 0) {
                Toast.makeText(this, O2().b("select_pdistrict", getString(R.string.sel_p_dis)), 0).show();
                return false;
            }
        }
        if (Intrinsics.areEqual(g3().g(), "N")) {
            a7 a7Var11 = this.mBinding;
            if (a7Var11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var11 = null;
            }
            Editable text8 = a7Var11.E.getText();
            Intrinsics.checkNotNullExpressionValue(text8, "getText(...)");
            if (text8.length() == 0) {
                Toast.makeText(this, O2().b("select_ptaluka", getString(R.string.sel_p_tal)), 0).show();
                return false;
            }
        }
        if (Intrinsics.areEqual(g3().g(), "N")) {
            a7 a7Var12 = this.mBinding;
            if (a7Var12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var12 = null;
            }
            Editable text9 = a7Var12.B.getText();
            Intrinsics.checkNotNullExpressionValue(text9, "getText(...)");
            if (text9.length() == 0) {
                Toast.makeText(this, O2().b("select_plandmark", getString(R.string.sel_p_lm)), 0).show();
                return false;
            }
        }
        if (Intrinsics.areEqual(g3().g(), "N")) {
            a7 a7Var13 = this.mBinding;
            if (a7Var13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var13 = null;
            }
            Editable text10 = a7Var13.C.getText();
            Intrinsics.checkNotNullExpressionValue(text10, "getText(...)");
            if (text10.length() == 0) {
                Toast.makeText(this, O2().b("select_pin_code", getString(R.string.enter_correct_pincode)), 0).show();
                return false;
            }
        }
        if (!Intrinsics.areEqual(g3().g(), "N")) {
            return true;
        }
        a7 a7Var14 = this.mBinding;
        if (a7Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            a7Var2 = a7Var14;
        }
        if (a7Var2.C.getText().length() >= 6) {
            return true;
        }
        Toast.makeText(this, O2().b("select_ppin_code", getString(R.string.sel_pc_pin)), 0).show();
        return false;
    }

    private final void q3() {
        a7 a7Var = this.mBinding;
        a7 a7Var2 = null;
        if (a7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var = null;
        }
        a7Var.d0.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressActivity.J3(this.a, view);
            }
        });
        a7 a7Var3 = this.mBinding;
        if (a7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var3 = null;
        }
        a7Var3.y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressActivity.K3(view);
            }
        });
        a7 a7Var4 = this.mBinding;
        if (a7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var4 = null;
        }
        a7Var4.x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.if0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressActivity.r3(this.a, view);
            }
        });
        a7 a7Var5 = this.mBinding;
        if (a7Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var5 = null;
        }
        a7Var5.w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.jf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressActivity.s3(this.a, view);
            }
        });
        a7 a7Var6 = this.mBinding;
        if (a7Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var6 = null;
        }
        a7Var6.M.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressActivity.t3(this.a, view);
            }
        });
        a7 a7Var7 = this.mBinding;
        if (a7Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var7 = null;
        }
        a7Var7.S0.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.zepto.lf0
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
                ChangeOfAddressActivity.u3(this.a, radioGroup, i2);
            }
        });
        a7 a7Var8 = this.mBinding;
        if (a7Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var8 = null;
        }
        a7Var8.G.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressActivity.v3(view);
            }
        });
        a7 a7Var9 = this.mBinding;
        if (a7Var9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var9 = null;
        }
        a7Var9.F.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.of0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressActivity.w3(this.a, view);
            }
        });
        a7 a7Var10 = this.mBinding;
        if (a7Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var10 = null;
        }
        a7Var10.E.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressActivity.x3(this.a, view);
            }
        });
        a7 a7Var11 = this.mBinding;
        if (a7Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var11 = null;
        }
        a7Var11.H.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressActivity.y3(this.a, view);
            }
        });
        a7 a7Var12 = this.mBinding;
        if (a7Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var12 = null;
        }
        a7Var12.K.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.zepto.yf0
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
                ChangeOfAddressActivity.z3(this.a, radioGroup, i2);
            }
        });
        a7 a7Var13 = this.mBinding;
        if (a7Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var13 = null;
        }
        a7Var13.p0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zepto.zf0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ChangeOfAddressActivity.A3(this.a, compoundButton, z);
            }
        });
        if (Intrinsics.areEqual(g3().b(), "3")) {
            a7 a7Var14 = this.mBinding;
            if (a7Var14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var14 = null;
            }
            a7Var14.s0.setText(O2().b("vahan_btn_submit", "Submit"));
        } else if (StringsKt__StringsJVMKt.equals(this.state_value, "differ", true) || StringsKt__StringsJVMKt.equals(I2(), "S", true)) {
            a7 a7Var15 = this.mBinding;
            if (a7Var15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var15 = null;
            }
            a7Var15.s0.setText(O2().b("btn_dl_serv_next", "Next"));
        }
        a7 a7Var16 = this.mBinding;
        if (a7Var16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var16 = null;
        }
        a7Var16.s0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ag0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressActivity.B3(this.a, view);
            }
        });
        a7 a7Var17 = this.mBinding;
        if (a7Var17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var17 = null;
        }
        a7Var17.U.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressActivity.C3(this.a, view);
            }
        });
        a7 a7Var18 = this.mBinding;
        if (a7Var18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var18 = null;
        }
        a7Var18.T.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressActivity.D3(this.a, view);
            }
        });
        a7 a7Var19 = this.mBinding;
        if (a7Var19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var19 = null;
        }
        a7Var19.j0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressActivity.E3(this.a, view);
            }
        });
        a7 a7Var20 = this.mBinding;
        if (a7Var20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var20 = null;
        }
        a7Var20.i0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.df0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressActivity.F3(this.a, view);
            }
        });
        a7 a7Var21 = this.mBinding;
        if (a7Var21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var21 = null;
        }
        a7Var21.g0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ef0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressActivity.G3(this.a, view);
            }
        });
        a7 a7Var22 = this.mBinding;
        if (a7Var22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var22 = null;
        }
        a7Var22.h0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ff0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressActivity.H3(this.a, view);
            }
        });
        a7 a7Var23 = this.mBinding;
        if (a7Var23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var23 = null;
        }
        TextView textView = a7Var23.Q0;
        a7 a7Var24 = this.mBinding;
        if (a7Var24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var24 = null;
        }
        textView.setPaintFlags(a7Var24.Q0.getPaintFlags() | 8);
        a7 a7Var25 = this.mBinding;
        if (a7Var25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            a7Var2 = a7Var25;
        }
        a7Var2.Q0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressActivity.I3(this.a, view);
            }
        });
    }

    public static final void r3(ChangeOfAddressActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.P3("dl-renewal-current-address");
        } else {
            Toast.makeText(this$0.getApplicationContext(), this$0.O2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public static final void s3(ChangeOfAddressActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.Q3("dl-renewal-current-address");
        } else {
            Toast.makeText(this$0.getApplicationContext(), this$0.O2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public static final void t3(ChangeOfAddressActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.R3("dl-renewal-current-address");
        } else {
            Toast.makeText(this$0.getApplicationContext(), this$0.O2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public static final void u3(ChangeOfAddressActivity this$0, RadioGroup radioGroup, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.mCurrTalukaList == null || !(!r2.isEmpty())) {
            return;
        }
        if (i2 == R.id.town_rb) {
            this$0.presSelectedVillOrTown = "U";
            this$0.K2("U");
        } else {
            if (i2 != R.id.village_rb) {
                return;
            }
            this$0.presSelectedVillOrTown = "R";
            this$0.K2("R");
        }
    }

    public static final void v3(View view) {
    }

    public static final void w3(ChangeOfAddressActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.P3("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(this$0.getApplicationContext(), this$0.O2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    public static final void x3(ChangeOfAddressActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.O2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
            return;
        }
        a7 a7Var = this$0.mBinding;
        a7 a7Var2 = null;
        if (a7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var = null;
        }
        Editable text = a7Var.H.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0) {
            a7 a7Var3 = this$0.mBinding;
            if (a7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var3 = null;
            }
            a7Var3.H.setFocusable(true);
            a7 a7Var4 = this$0.mBinding;
            if (a7Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                a7Var2 = a7Var4;
            }
            a7Var2.H.setEnabled(true);
        }
        this$0.Q3("dl-renewal-permanent-addressx");
    }

    public static final void y3(ChangeOfAddressActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.R3("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(this$0.getApplicationContext(), this$0.O2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.ArrayList] */
    private final void z2() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new ArrayList();
        a7 a7Var = this.mBinding;
        a7 a7Var2 = null;
        if (a7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var = null;
        }
        if (StringsKt__StringsJVMKt.equals$default(a7Var.s0.getButtonText(), O2().b("btn_dl_serv_next", "Next"), false, 2, null)) {
            a7 a7Var3 = this.mBinding;
            if (a7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var3 = null;
            }
            a7Var3.a0.setVisibility(8);
        } else {
            a7 a7Var4 = this.mBinding;
            if (a7Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var4 = null;
            }
            a7Var4.a0.setVisibility(0);
            ((ArrayList) objectRef.element).add(0, new AppCatPojo("0", "Select Applicant Category"));
            ((ArrayList) objectRef.element).add(1, new AppCatPojo("G", "General"));
            ((ArrayList) objectRef.element).add(2, new AppCatPojo("R", "Repatriate"));
            ((ArrayList) objectRef.element).add(3, new AppCatPojo("T", "Refugees"));
            ((ArrayList) objectRef.element).add(4, new AppCatPojo("X", "Ex-Servicemen"));
            ((ArrayList) objectRef.element).add(5, new AppCatPojo("F", "Foreigners (Not Diplomats)"));
            ((ArrayList) objectRef.element).add(6, new AppCatPojo("D", "Diplomats (Foreigner)"));
            ((ArrayList) objectRef.element).add(7, new AppCatPojo("O", "OCI"));
            ((ArrayList) objectRef.element).add(8, new AppCatPojo("P", "Differently Abled"));
            oq oqVar = new oq(this, (ArrayList) objectRef.element);
            a7 a7Var5 = this.mBinding;
            if (a7Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var5 = null;
            }
            a7Var5.r0.setAdapter((SpinnerAdapter) oqVar);
            int size = ((ArrayList) objectRef.element).size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                if (Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) g3().a()).toString(), StringsKt__StringsKt.trim((CharSequence) ((AppCatPojo) ((ArrayList) objectRef.element).get(i2)).getAppCode()).toString())) {
                    a7 a7Var6 = this.mBinding;
                    if (a7Var6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        a7Var6 = null;
                    }
                    a7Var6.r0.setSelection(i2);
                } else {
                    i2++;
                }
            }
        }
        a7 a7Var7 = this.mBinding;
        if (a7Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var7 = null;
        }
        a7Var7.r0.setOnItemSelectedListener(new a(objectRef));
        if (I2().equals("S")) {
            a7 a7Var8 = this.mBinding;
            if (a7Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                a7Var2 = a7Var8;
            }
            a7Var2.r0.setEnabled(true);
            return;
        }
        if (this.appCategory.equals("0")) {
            a7 a7Var9 = this.mBinding;
            if (a7Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                a7Var2 = a7Var9;
            }
            a7Var2.r0.setEnabled(true);
            return;
        }
        a7 a7Var10 = this.mBinding;
        if (a7Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            a7Var2 = a7Var10;
        }
        a7Var2.r0.setEnabled(false);
    }

    public static final void z3(ChangeOfAddressActivity this$0, RadioGroup radioGroup, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.mPermTalukaList == null || !(!r2.isEmpty())) {
            return;
        }
        switch (i2) {
            case R.id.dl_permanent_town_rb /* 2131362708 */:
                this$0.permSelectedVillOrTown = "U";
                this$0.d3("U");
                break;
            case R.id.dl_permanent_village_rb /* 2131362709 */:
                this$0.permSelectedVillOrTown = "R";
                this$0.d3("R");
                break;
        }
    }

    public final String G2() {
        String str = this.allowAddrChangeAtDlservReqst;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("allowAddrChangeAtDlservReqst");
        return null;
    }

    /* JADX INFO: renamed from: H2, reason: from getter */
    public final String getAppCategory() {
        return this.appCategory;
    }

    public final String I2() {
        String str = this.bioRecGenesis;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bioRecGenesis");
        return null;
    }

    public final String J2() {
        String str = this.currStateCd;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("currStateCd");
        return null;
    }

    public final DldetobjX L2() {
        DldetobjX dldetobjX = this.dlDetails;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlDetails");
        return null;
    }

    public final void L3() {
        fs0 fs0Var = this.mCombineViewModel;
        fs0 fs0Var2 = null;
        if (fs0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCombineViewModel");
            fs0Var = null;
        }
        fs0Var.i().g(this, new mf4() { // from class: com.zepto.mf0
            @Override // com.zepto.mf4
            public final void a(Object obj) throws Throwable {
                ChangeOfAddressActivity.M3(this.a, (GetAckDetForGivenDLNumberResponse) obj);
            }
        });
        fs0 fs0Var3 = this.mCombineViewModel;
        if (fs0Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCombineViewModel");
        } else {
            fs0Var2 = fs0Var3;
        }
        fs0Var2.h().g(this, new mf4() { // from class: com.zepto.vf0
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                ChangeOfAddressActivity.N3(this.a, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M2, reason: from getter */
    public final String getDlNo() {
        return this.dlNo;
    }

    /* JADX INFO: renamed from: N2, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    public final wa3 O2() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    /* JADX INFO: renamed from: P2, reason: from getter */
    public final String getLastEndorseRTOCode() {
        return this.lastEndorseRTOCode;
    }

    /* JADX INFO: renamed from: Q2, reason: from getter */
    public final String getLastEndorseRto() {
        return this.lastEndorseRto;
    }

    /* JADX INFO: renamed from: R2, reason: from getter */
    public final String getLastEndorseState() {
        return this.lastEndorseState;
    }

    /* JADX INFO: renamed from: S2, reason: from getter */
    public final String getLastEndorseStateCode() {
        return this.lastEndorseStateCode;
    }

    public final ArrayList T2() {
        ArrayList arrayList = this.listHeaderSteps;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("listHeaderSteps");
        return null;
    }

    public final CombineServiceInterface U2() {
        CombineServiceInterface combineServiceInterface = this.mCombineServiceInterface;
        if (combineServiceInterface != null) {
            return combineServiceInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mCombineServiceInterface");
        return null;
    }

    public final void U3() {
        try {
            String bioPermAdd1 = L2().getBioObj().getBioPermAdd1();
            String bioPermAdd2 = L2().getBioObj().getBioPermAdd2();
            String bioPermAdd3 = L2().getBioObj().getBioPermAdd3();
            int bioPermPin = L2().getBioObj().getBioPermPin();
            String bioTempAdd1 = L2().getBioObj().getBioTempAdd1();
            String bioTempAdd2 = L2().getBioObj().getBioTempAdd2();
            String bioTempAdd3 = L2().getBioObj().getBioTempAdd3();
            int bioTempPin = L2().getBioObj().getBioTempPin();
            a7 a7Var = this.mBinding;
            a7 a7Var2 = null;
            if (a7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var = null;
            }
            a7Var.l0.setText(bioPermAdd1 + ' ' + bioPermAdd2 + ' ' + bioPermAdd3 + ' ' + bioPermPin);
            a7 a7Var3 = this.mBinding;
            if (a7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var3 = null;
            }
            a7Var3.m0.setText(bioTempAdd1 + ' ' + bioTempAdd2 + ' ' + bioTempAdd3 + ' ' + bioTempPin);
            if (!StringsKt__StringsJVMKt.equals(I2(), "S", true) || Intrinsics.areEqual(g3().b(), "3")) {
                return;
            }
            a7 a7Var4 = this.mBinding;
            if (a7Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var4 = null;
            }
            a7Var4.D0.setText(O2().b("current_add_details", getString(R.string.current_address_details)));
            a7 a7Var5 = this.mBinding;
            if (a7Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var5 = null;
            }
            a7Var5.E0.setText(O2().b("permanent_add_details", getString(R.string.perm_add_det)));
            if (bioTempAdd1 != null) {
                a7 a7Var6 = this.mBinding;
                if (a7Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var6 = null;
                }
                a7Var6.L.setText(bioTempAdd1);
            }
            if (bioTempAdd2 != null) {
                a7 a7Var7 = this.mBinding;
                if (a7Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var7 = null;
                }
                a7Var7.P.setText(bioTempAdd2);
            }
            if (bioTempAdd3 != null) {
                a7 a7Var8 = this.mBinding;
                if (a7Var8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var8 = null;
                }
                a7Var8.N.setText(bioTempAdd3);
            }
            if (bioPermAdd1 != null) {
                a7 a7Var9 = this.mBinding;
                if (a7Var9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var9 = null;
                }
                a7Var9.A.setText(bioTempAdd1);
            }
            if (bioPermAdd2 != null) {
                a7 a7Var10 = this.mBinding;
                if (a7Var10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var10 = null;
                }
                a7Var10.D.setText(bioTempAdd2);
            }
            if (bioPermAdd3 != null) {
                a7 a7Var11 = this.mBinding;
                if (a7Var11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    a7Var2 = a7Var11;
                }
                a7Var2.B.setText(bioTempAdd3);
            }
        } catch (Exception e2) {
            Toast.makeText(this, e2.getLocalizedMessage(), 1).show();
        }
    }

    public final Context V2() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final void V3() {
        fs0 fs0Var;
        a7 a7Var;
        if (p3()) {
            try {
                if (Z2().size() > this.serialNo) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                    Gson gson = new Gson();
                    CombineReq combineReq = (CombineReq) gson.fromJson(defaultSharedPreferences.getString("MultiService", ""), CombineReq.class);
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
                    combineReq2.setApplDateOfBirth(combineReq.getApplDateOfBirth());
                    combineReq2.setCodobDlReasonName(combineReq.getCodobDlReasonName());
                    combineReq2.setCodobDlReasonCode(combineReq.getCodobDlReasonCode());
                    combineReq2.setDeclaringcheck("Y");
                    combineReq2.setHillcertificate(combineReq.getHillcertificate());
                    combineReq2.setHillissueDate(combineReq.getHillissueDate());
                    combineReq2.setHillvalidFrom(combineReq.getHillvalidFrom());
                    combineReq2.setHillvalidTo(combineReq.getHillvalidTo());
                    combineReq2.setHilldrivingschool(combineReq.getHilldrivingschool());
                    combineReq2.setHillissby(combineReq.getHillissby());
                    a7 a7Var2 = this.mBinding;
                    if (a7Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        a7Var2 = null;
                    }
                    combineReq2.setPerHouseNo(a7Var2.A.getText().toString());
                    a7 a7Var3 = this.mBinding;
                    if (a7Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        a7Var3 = null;
                    }
                    combineReq2.setPerStreet(a7Var3.D.getText().toString());
                    a7 a7Var4 = this.mBinding;
                    if (a7Var4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        a7Var4 = null;
                    }
                    combineReq2.setPerLocation(a7Var4.B.getText().toString());
                    String villageOrTown = this.permanentAdd.getVillageOrTown();
                    Intrinsics.checkNotNull(villageOrTown);
                    combineReq2.setPermVillageOrTown(villageOrTown);
                    String subDistrict = this.permanentAdd.getSubDistrict();
                    Intrinsics.checkNotNull(subDistrict);
                    combineReq2.setPerSubDistrict(subDistrict);
                    String district = this.permanentAdd.getDistrict();
                    Intrinsics.checkNotNull(district);
                    combineReq2.setPerDistrict(district);
                    combineReq2.setPerState(b3());
                    a7 a7Var5 = this.mBinding;
                    if (a7Var5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        a7Var5 = null;
                    }
                    combineReq2.setPerPinCode(a7Var5.O.getText().toString());
                    a7 a7Var6 = this.mBinding;
                    if (a7Var6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        a7Var6 = null;
                    }
                    combineReq2.setPresHouseNo(a7Var6.L.getText().toString());
                    a7 a7Var7 = this.mBinding;
                    if (a7Var7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        a7Var7 = null;
                    }
                    combineReq2.setPresStreet(a7Var7.P.getText().toString());
                    a7 a7Var8 = this.mBinding;
                    if (a7Var8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        a7Var8 = null;
                    }
                    combineReq2.setPresLocation(a7Var8.N.getText().toString());
                    String villageOrTown2 = this.presentAdd.getVillageOrTown();
                    Intrinsics.checkNotNull(villageOrTown2);
                    combineReq2.setPresVillageOrTown(villageOrTown2);
                    String subDistrict2 = this.presentAdd.getSubDistrict();
                    Intrinsics.checkNotNull(subDistrict2);
                    combineReq2.setPresSubDistrict(subDistrict2);
                    String district2 = this.presentAdd.getDistrict();
                    Intrinsics.checkNotNull(district2);
                    combineReq2.setPresDistrict(district2);
                    combineReq2.setPresState(J2());
                    a7 a7Var9 = this.mBinding;
                    if (a7Var9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        a7Var = null;
                    } else {
                        a7Var = a7Var9;
                    }
                    combineReq2.setPresPincode(a7Var.O.getText().toString());
                    SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
                    editorEdit.putString("MultiService", gson.toJson(combineReq2));
                    editorEdit.commit();
                    if (Intrinsics.areEqual(Z2().get(this.serialNo), O2().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                        setIntent(new Intent(this, (Class<?>) DLDuplicateActivity.class));
                        Intent intent = getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                        o3(intent, this.lastEndorseRTOCode, this.lastEndorseState, "513", Z2());
                        return;
                    }
                    if (Intrinsics.areEqual(Z2().get(this.serialNo), O2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                        setIntent(new Intent(this, (Class<?>) RenewalOfDLActivity.class));
                        Intent intent2 = getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
                        o3(intent2, this.lastEndorseRTOCode, this.lastEndorseState, "514", Z2());
                        return;
                    }
                    if (Intrinsics.areEqual(Z2().get(this.serialNo), O2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                        setIntent(new Intent(this, (Class<?>) RenewalOfDLActivity.class));
                        Intent intent3 = getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent3, "getIntent(...)");
                        o3(intent3, this.lastEndorseRTOCode, this.lastEndorseState, "537", Z2());
                        return;
                    }
                    if (Intrinsics.areEqual(Z2().get(this.serialNo), O2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                        setIntent(new Intent(this, (Class<?>) ChangeOfAddressActivity.class));
                        Intent intent4 = getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent4, "getIntent(...)");
                        o3(intent4, this.lastEndorseRTOCode, this.lastEndorseState, "515", Z2());
                        return;
                    }
                    if (Intrinsics.areEqual(Z2().get(this.serialNo), O2().b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                        setIntent(new Intent(this, (Class<?>) DLReplecementActivity.class));
                        Intent intent5 = getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent5, "getIntent(...)");
                        o3(intent5, this.lastEndorseRTOCode, this.lastEndorseState, "516", Z2());
                        return;
                    }
                    if (Intrinsics.areEqual(Z2().get(this.serialNo), O2().b("check_dl_serv_extract_dl", "DL Extract"))) {
                        setIntent(new Intent(this, (Class<?>) DLExtractActivity.class));
                        Intent intent6 = getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent6, "getIntent(...)");
                        o3(intent6, this.lastEndorseRTOCode, this.lastEndorseState, "523", Z2());
                        return;
                    }
                    if (Intrinsics.areEqual(Z2().get(this.serialNo), O2().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                        setIntent(new Intent(this, (Class<?>) HillReligion.class));
                        Intent intent7 = getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent7, "getIntent(...)");
                        o3(intent7, this.lastEndorseRTOCode, this.lastEndorseState, "524", Z2());
                        return;
                    }
                    if (Intrinsics.areEqual(Z2().get(this.serialNo), O2().b("change_name_dl", "Change of Name in DL"))) {
                        setIntent(new Intent(this, (Class<?>) ChangeOfName.class));
                        Intent intent8 = getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent8, "getIntent(...)");
                        o3(intent8, this.lastEndorseRTOCode, this.lastEndorseState, "526", Z2());
                        return;
                    }
                    if (Intrinsics.areEqual(Z2().get(this.serialNo), O2().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                        setIntent(new Intent(this, (Class<?>) DobChangeActivity.class));
                        Intent intent9 = getIntent();
                        Intrinsics.checkNotNullExpressionValue(intent9, "getIntent(...)");
                        o3(intent9, this.lastEndorseRTOCode, this.lastEndorseState, "548", Z2());
                        return;
                    }
                    return;
                }
                CombineReq combineReq3 = (CombineReq) new Gson().fromJson(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getString("MultiService", ""), CombineReq.class);
                if (!com.nic.mparivahan.a.a.a(this)) {
                    Toast.makeText(getApplicationContext(), O2().b("service_is_not_present", getString(R.string.unable_to_get_details)), 0).show();
                    return;
                }
                a7 a7Var10 = this.mBinding;
                if (a7Var10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var10 = null;
                }
                a7Var10.s0.c(true);
                ArrayList arrayList = new ArrayList();
                int size = L2().getDlcovs().size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(String.valueOf(L2().getDlcovs().get(i2).getDcCovcd()));
                }
                fs0 fs0Var2 = this.mCombineViewModel;
                if (fs0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCombineViewModel");
                    fs0Var = null;
                } else {
                    fs0Var = fs0Var2;
                }
                boolean z = this.COA;
                String strI2 = I2();
                String strG2 = G2();
                ArrayList arrayListZ2 = Z2();
                String str = this.appCategory;
                String dlHolderAltMobMum = combineReq3.getDlHolderAltMobMum();
                Intrinsics.checkNotNull(dlHolderAltMobMum);
                String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(this.dlNo)).toString();
                String str2 = this.dob;
                Intrinsics.checkNotNull(str2);
                String str3 = this.lastEndorseRTOCode;
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
                String str4 = this.mobile_no;
                Intrinsics.checkNotNull(str4);
                String changeOfAddReq = combineReq3.getChangeOfAddReq();
                Intrinsics.checkNotNull(changeOfAddReq);
                a7 a7Var11 = this.mBinding;
                if (a7Var11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var11 = null;
                }
                String string2 = a7Var11.A.getText().toString();
                a7 a7Var12 = this.mBinding;
                if (a7Var12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var12 = null;
                }
                String string3 = a7Var12.D.getText().toString();
                a7 a7Var13 = this.mBinding;
                if (a7Var13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var13 = null;
                }
                String string4 = a7Var13.B.getText().toString();
                String villageOrTown3 = this.permanentAdd.getVillageOrTown();
                Intrinsics.checkNotNull(villageOrTown3);
                String subDistrict3 = this.permanentAdd.getSubDistrict();
                Intrinsics.checkNotNull(subDistrict3);
                String district3 = this.permanentAdd.getDistrict();
                Intrinsics.checkNotNull(district3);
                String strB3 = b3();
                a7 a7Var14 = this.mBinding;
                if (a7Var14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var14 = null;
                }
                String string5 = a7Var14.O.getText().toString();
                a7 a7Var15 = this.mBinding;
                if (a7Var15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var15 = null;
                }
                String string6 = a7Var15.L.getText().toString();
                a7 a7Var16 = this.mBinding;
                if (a7Var16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var16 = null;
                }
                String string7 = a7Var16.P.getText().toString();
                a7 a7Var17 = this.mBinding;
                if (a7Var17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var17 = null;
                }
                String string8 = a7Var17.N.getText().toString();
                String villageOrTown4 = this.presentAdd.getVillageOrTown();
                Intrinsics.checkNotNull(villageOrTown4);
                String subDistrict4 = this.presentAdd.getSubDistrict();
                Intrinsics.checkNotNull(subDistrict4);
                String district4 = this.presentAdd.getDistrict();
                Intrinsics.checkNotNull(district4);
                String strJ2 = J2();
                a7 a7Var18 = this.mBinding;
                if (a7Var18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var18 = null;
                }
                String string9 = a7Var18.O.getText().toString();
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
                fs0Var.g(z, arrayList, strI2, strG2, arrayListZ2, "mobSARATHI", "657d1c758e2e95af0014e16f5109f933", "10.248.210.8", "sarathiservice", str, dlHolderAltMobMum, string, str2, str3, willtoDonateOrgans, relationType, strValueOf, conDlReasonName, dlHolderNaturalName, conEffdate, applFirstName, applLastName, relFirstName, relLastName, str4, changeOfAddReq, string2, string3, string4, villageOrTown3, subDistrict3, district3, strB3, string5, string6, string7, string8, villageOrTown4, subDistrict4, district4, strJ2, string9, dleDlReasonCode, dleDlReasonName, dupDlReasonName, dupDlReasonCode, applDateOfBirth, codobDlReasonName, codobDlReasonCode, declaringcheck, hillcertificate, hillissueDate, hillvalidFrom, hillvalidTo, hilldrivingschool, hillissby, pofbirth, country, passno, passvaltill, visano, visavaltill, tovisit, iscountryrestricted, countryRestrictedReason, strIsDlSerdisqualified, dlSerdisqualifiedReason, forAdd1, forAdd2, forAdd3, forAddPinCode, forNationMobNum, emailID, appliedIdpfromIndEmb, indEmbName, embPlace, dateOfVerifEmb, embEndorseNo, idpcountryapplyfrom, g3().f(), g3().g(), g3().e(), g3().h());
            } catch (Exception unused) {
            }
        }
    }

    public final ProgressBar W2() {
        ProgressBar progressBar = this.mProgressBar;
        if (progressBar != null) {
            return progressBar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mProgressBar");
        return null;
    }

    public final ws6 X2() {
        ws6 ws6Var = this.mSessionmanger;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSessionmanger");
        return null;
    }

    public final void X3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.allowAddrChangeAtDlservReqst = str;
    }

    /* JADX INFO: renamed from: Y2, reason: from getter */
    public final String getMobile_no() {
        return this.mobile_no;
    }

    public final void Y3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appCategory = str;
    }

    public final ArrayList Z2() {
        ArrayList arrayList = this.multiListName;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiListName");
        return null;
    }

    public final void Z3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bioRecGenesis = str;
    }

    public final ProgressDialog a3() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final void a4(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currStateCd = str;
    }

    public final String b3() {
        String str = this.perStateCd;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("perStateCd");
        return null;
    }

    public final void b4(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dlDetails = dldetobjX;
    }

    /* JADX INFO: renamed from: c3, reason: from getter */
    public final DlAddress getPermanentAdd() {
        return this.permanentAdd;
    }

    public final void c4(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void d4(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.listHeaderSteps = arrayList;
    }

    /* JADX INFO: renamed from: e3, reason: from getter */
    public final DlAddress getPresentAdd() {
        return this.presentAdd;
    }

    public final void e4(CombineServiceInterface combineServiceInterface) {
        Intrinsics.checkNotNullParameter(combineServiceInterface, "<set-?>");
        this.mCombineServiceInterface = combineServiceInterface;
    }

    /* JADX INFO: renamed from: f3, reason: from getter */
    public final String getPurCode() {
        return this.purCode;
    }

    public final void f4(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final wl5 g3() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final void g4(ProgressBar progressBar) {
        Intrinsics.checkNotNullParameter(progressBar, "<set-?>");
        this.mProgressBar = progressBar;
    }

    public final void h3() {
        try {
            Z3(String.valueOf(getIntent().getStringExtra("bioRecGenesis")));
            X3(String.valueOf(getIntent().getStringExtra("allowAddrChangeAtDlservReqst")));
            this.dlNo = String.valueOf(getIntent().getStringExtra("DL"));
            this.dob = String.valueOf(getIntent().getStringExtra("dob"));
            this.mobile_no = String.valueOf(getIntent().getStringExtra("Mobile_no"));
            String stringExtra = getIntent().getStringExtra("lastEndorsedRTOCode");
            Intrinsics.checkNotNull(stringExtra, "null cannot be cast to non-null type kotlin.String");
            this.rto_cd = stringExtra;
            String stringExtra2 = getIntent().getStringExtra("state_value");
            Intrinsics.checkNotNull(stringExtra2, "null cannot be cast to non-null type kotlin.String");
            this.state_value = stringExtra2;
            String stringExtra3 = getIntent().getStringExtra("purCode");
            Intrinsics.checkNotNull(stringExtra3, "null cannot be cast to non-null type kotlin.String");
            this.purCode = stringExtra3;
            String stringExtra4 = getIntent().getStringExtra("lastEndorsedRTO");
            Intrinsics.checkNotNull(stringExtra4, "null cannot be cast to non-null type kotlin.String");
            this.lastEndorseRto = stringExtra4;
            String stringExtra5 = getIntent().getStringExtra("lastEndorsedState");
            Intrinsics.checkNotNull(stringExtra5, "null cannot be cast to non-null type kotlin.String");
            this.lastEndorseState = stringExtra5;
            String stringExtra6 = getIntent().getStringExtra("lastEndorseStateCode");
            Intrinsics.checkNotNull(stringExtra6, "null cannot be cast to non-null type kotlin.String");
            this.lastEndorseStateCode = stringExtra6;
            String stringExtra7 = getIntent().getStringExtra("lastEndorsedRTOCode");
            Intrinsics.checkNotNull(stringExtra7, "null cannot be cast to non-null type kotlin.String");
            this.lastEndorseRTOCode = stringExtra7;
            Serializable serializableExtra = getIntent().getSerializableExtra("whatServiceRequired");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type java.util.HashMap<kotlin.String?, kotlin.String?>");
            this.whatServiceRequired = (HashMap) serializableExtra;
            Serializable serializableExtra2 = getIntent().getSerializableExtra("DLDetails");
            Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
            b4((DldetobjX) serializableExtra2);
            a7 a7Var = this.mBinding;
            a7 a7Var2 = null;
            if (a7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var = null;
            }
            a7Var.z.setText(O2().b("dl_no", "DL No. : ") + ' ' + this.dlNo);
            BioImgObjX bioImgObj = L2().getBioImgObj();
            if ((bioImgObj != null ? bioImgObj.getBiPhoto() : null) == null) {
                a7 a7Var3 = this.mBinding;
                if (a7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var3 = null;
                }
                a7Var3.o0.setVisibility(8);
                a7 a7Var4 = this.mBinding;
                if (a7Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var4 = null;
                }
                a7Var4.X.setVisibility(0);
            } else {
                a7 a7Var5 = this.mBinding;
                if (a7Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var5 = null;
                }
                a7Var5.o0.setVisibility(0);
                a7 a7Var6 = this.mBinding;
                if (a7Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var6 = null;
                }
                a7Var6.X.setVisibility(8);
                a7 a7Var7 = this.mBinding;
                if (a7Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var7 = null;
                }
                ImageView imageView = a7Var7.Y;
                BioImgObjX bioImgObj2 = L2().getBioImgObj();
                imageView.setImageBitmap(kt6.a(bioImgObj2 != null ? bioImgObj2.getBiPhoto() : null));
            }
            if (Intrinsics.areEqual(g3().g(), "Y")) {
                Serializable serializableExtra3 = getIntent().getSerializableExtra("aadharData");
                Intrinsics.checkNotNull(serializableExtra3, "null cannot be cast to non-null type com.nic.mparivahan.DLServicesAuth.eKyc.NewAdharApi.DOEkycX");
                this.adharData = (DOEkycX) serializableExtra3;
            }
            if (Intrinsics.areEqual(g3().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                this.serialNo = getIntent().getIntExtra("serialNo", 0);
                Serializable serializableExtra4 = getIntent().getSerializableExtra("multiList");
                Intrinsics.checkNotNull(serializableExtra4, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                i4((ArrayList) serializableExtra4);
                Serializable serializableExtra5 = getIntent().getSerializableExtra("listHeaderSteps");
                Intrinsics.checkNotNull(serializableExtra5, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                d4((ArrayList) serializableExtra5);
                String stringExtra8 = getIntent().getStringExtra("metaflag");
                Intrinsics.checkNotNull(stringExtra8, "null cannot be cast to non-null type kotlin.String");
                this.metaflag = stringExtra8;
                Serializable serializableExtra6 = getIntent().getSerializableExtra("COA");
                Intrinsics.checkNotNull(serializableExtra6, "null cannot be cast to non-null type kotlin.Boolean");
                this.COA = ((Boolean) serializableExtra6).booleanValue();
                try {
                    if (Build.VERSION.SDK_INT >= 30) {
                        WindowMetrics maximumWindowMetrics = getWindowManager().getMaximumWindowMetrics();
                        Intrinsics.checkNotNullExpressionValue(maximumWindowMetrics, "getMaximumWindowMetrics(...)");
                        Rect bounds = maximumWindowMetrics.getBounds();
                        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
                        this.widthPixels = bounds.right;
                    } else {
                        this.widthPixels = getResources().getDisplayMetrics().widthPixels;
                    }
                    a7 a7Var8 = this.mBinding;
                    if (a7Var8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        a7Var8 = null;
                    }
                    TextView textView = a7Var8.e0.h;
                    a7 a7Var9 = this.mBinding;
                    if (a7Var9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        a7Var9 = null;
                    }
                    textView.setPaintFlags(a7Var9.e0.h.getPaintFlags() | 8);
                    if (Intrinsics.areEqual(g3().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                        try {
                            if (T2().size() > 1) {
                                a7 a7Var10 = this.mBinding;
                                if (a7Var10 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                                    a7Var10 = null;
                                }
                                a7Var10.f0.setLayoutManager(new LinearLayoutManager(this, 0, false));
                                ArrayList arrayListT2 = T2();
                                int i2 = this.serialNo;
                                int i3 = this.widthPixels;
                                String strB = O2().b("check_dl_serv_change_addr", "Change of Address in DL");
                                Intrinsics.checkNotNull(strB);
                                k76 k76Var = new k76(arrayListT2, this, i2, i3, strB);
                                a7 a7Var11 = this.mBinding;
                                if (a7Var11 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                                    a7Var11 = null;
                                }
                                a7Var11.f0.setAdapter(k76Var);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    if (this.serialNo == Z2().size()) {
                        a7 a7Var12 = this.mBinding;
                        if (a7Var12 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            a7Var12 = null;
                        }
                        a7Var12.s0.setText(O2().b("vahan_btn_submit", "Submit"));
                    } else {
                        a7 a7Var13 = this.mBinding;
                        if (a7Var13 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            a7Var13 = null;
                        }
                        a7Var13.s0.setText(O2().b("btn_dl_serv_next", "Next"));
                    }
                } catch (Exception unused2) {
                }
            }
            a7 a7Var14 = this.mBinding;
            if (a7Var14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var14 = null;
            }
            a7Var14.e0.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rf0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChangeOfAddressActivity.i3(this.a, view);
                }
            });
            a7 a7Var15 = this.mBinding;
            if (a7Var15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var15 = null;
            }
            a7Var15.e0.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sf0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChangeOfAddressActivity.j3(this.a, view);
                }
            });
            if (!Intrinsics.areEqual(g3().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                a7 a7Var16 = this.mBinding;
                if (a7Var16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    a7Var2 = a7Var16;
                }
                a7Var2.e0.g.setText(g3().k());
            } else if (T2().size() == 1) {
                a7 a7Var17 = this.mBinding;
                if (a7Var17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    a7Var2 = a7Var17;
                }
                a7Var2.e0.g.setText((CharSequence) T2().get(0));
            } else {
                a7 a7Var18 = this.mBinding;
                if (a7Var18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var18 = null;
                }
                TextView textView2 = a7Var18.e0.g;
                String strB2 = O2().b("dl_services", getString(R.string.dl_services));
                Intrinsics.checkNotNull(strB2);
                textView2.setText(strB2);
                a7 a7Var19 = this.mBinding;
                if (a7Var19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    a7Var19 = null;
                }
                TextView textView3 = a7Var19.e0.g;
                a7 a7Var20 = this.mBinding;
                if (a7Var20 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    a7Var2 = a7Var20;
                }
                textView3.setPaintFlags(a7Var2.e0.g.getPaintFlags() | 8);
            }
        } catch (Exception unused3) {
        }
        U3();
    }

    public final void h4(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.mSessionmanger = ws6Var;
    }

    public final void i4(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.multiListName = arrayList;
    }

    public final void j4(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void k4(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.perStateCd = str;
    }

    public final void l4(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final void m4() {
        a7 a7Var = null;
        DOEkycX dOEkycX = null;
        if (!Intrinsics.areEqual(g3().g(), "Y")) {
            a7 a7Var2 = this.mBinding;
            if (a7Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var2 = null;
            }
            a7Var2.p0.setEnabled(true);
            a7 a7Var3 = this.mBinding;
            if (a7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var3 = null;
            }
            a7Var3.p0.setClickable(true);
            a7 a7Var4 = this.mBinding;
            if (a7Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var4 = null;
            }
            a7Var4.A.setFocusable(true);
            a7 a7Var5 = this.mBinding;
            if (a7Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var5 = null;
            }
            a7Var5.B.setFocusable(true);
            a7 a7Var6 = this.mBinding;
            if (a7Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var6 = null;
            }
            a7Var6.D.setFocusable(true);
            a7 a7Var7 = this.mBinding;
            if (a7Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var7 = null;
            }
            a7Var7.C.setFocusable(true);
            a7 a7Var8 = this.mBinding;
            if (a7Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var8 = null;
            }
            a7Var8.F.setFocusable(true);
            a7 a7Var9 = this.mBinding;
            if (a7Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var9 = null;
            }
            a7Var9.F.setEnabled(true);
            a7 a7Var10 = this.mBinding;
            if (a7Var10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var10 = null;
            }
            a7Var10.E.setFocusable(false);
            a7 a7Var11 = this.mBinding;
            if (a7Var11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var11 = null;
            }
            a7Var11.E.setEnabled(true);
            a7 a7Var12 = this.mBinding;
            if (a7Var12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var12 = null;
            }
            a7Var12.J.setClickable(true);
            a7 a7Var13 = this.mBinding;
            if (a7Var13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var13 = null;
            }
            a7Var13.J.setEnabled(true);
            a7 a7Var14 = this.mBinding;
            if (a7Var14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var14 = null;
            }
            a7Var14.I.setEnabled(true);
            a7 a7Var15 = this.mBinding;
            if (a7Var15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var15 = null;
            }
            a7Var15.I.setClickable(true);
            a7 a7Var16 = this.mBinding;
            if (a7Var16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var16 = null;
            }
            a7Var16.H.setFocusable(true);
            a7 a7Var17 = this.mBinding;
            if (a7Var17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                a7Var = a7Var17;
            }
            a7Var.H.setEnabled(true);
            return;
        }
        a7 a7Var18 = this.mBinding;
        if (a7Var18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var18 = null;
        }
        a7Var18.p0.setEnabled(false);
        a7 a7Var19 = this.mBinding;
        if (a7Var19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var19 = null;
        }
        a7Var19.p0.setClickable(false);
        a7 a7Var20 = this.mBinding;
        if (a7Var20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var20 = null;
        }
        a7Var20.p0.setChecked(false);
        a7 a7Var21 = this.mBinding;
        if (a7Var21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var21 = null;
        }
        a7Var21.A.setFocusable(false);
        a7 a7Var22 = this.mBinding;
        if (a7Var22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var22 = null;
        }
        a7Var22.B.setFocusable(false);
        a7 a7Var23 = this.mBinding;
        if (a7Var23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var23 = null;
        }
        a7Var23.D.setFocusable(false);
        a7 a7Var24 = this.mBinding;
        if (a7Var24 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var24 = null;
        }
        a7Var24.C.setFocusable(false);
        a7 a7Var25 = this.mBinding;
        if (a7Var25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var25 = null;
        }
        a7Var25.F.setFocusable(false);
        a7 a7Var26 = this.mBinding;
        if (a7Var26 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var26 = null;
        }
        a7Var26.F.setEnabled(false);
        a7 a7Var27 = this.mBinding;
        if (a7Var27 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var27 = null;
        }
        a7Var27.E.setFocusable(false);
        a7 a7Var28 = this.mBinding;
        if (a7Var28 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var28 = null;
        }
        a7Var28.E.setEnabled(false);
        a7 a7Var29 = this.mBinding;
        if (a7Var29 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var29 = null;
        }
        a7Var29.H.setEnabled(false);
        a7 a7Var30 = this.mBinding;
        if (a7Var30 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var30 = null;
        }
        a7Var30.J.setClickable(false);
        a7 a7Var31 = this.mBinding;
        if (a7Var31 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var31 = null;
        }
        a7Var31.J.setEnabled(false);
        a7 a7Var32 = this.mBinding;
        if (a7Var32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var32 = null;
        }
        a7Var32.I.setEnabled(false);
        a7 a7Var33 = this.mBinding;
        if (a7Var33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var33 = null;
        }
        a7Var33.I.setClickable(false);
        a7 a7Var34 = this.mBinding;
        if (a7Var34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var34 = null;
        }
        a7Var34.H.setFocusable(false);
        DOEkycX dOEkycX2 = this.adharData;
        if (dOEkycX2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adharData");
            dOEkycX2 = null;
        }
        if (kt6.d(dOEkycX2.getHouse())) {
            a7 a7Var35 = this.mBinding;
            if (a7Var35 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var35 = null;
            }
            EditText editText = a7Var35.A;
            DOEkycX dOEkycX3 = this.adharData;
            if (dOEkycX3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX3 = null;
            }
            editText.setText(dOEkycX3.getHouse());
            a7 a7Var36 = this.mBinding;
            if (a7Var36 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var36 = null;
            }
            EditText editText2 = a7Var36.L;
            DOEkycX dOEkycX4 = this.adharData;
            if (dOEkycX4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX4 = null;
            }
            editText2.setText(dOEkycX4.getHouse());
        }
        DOEkycX dOEkycX5 = this.adharData;
        if (dOEkycX5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adharData");
            dOEkycX5 = null;
        }
        if (kt6.d(dOEkycX5.getLocalityIfAny())) {
            a7 a7Var37 = this.mBinding;
            if (a7Var37 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var37 = null;
            }
            EditText editText3 = a7Var37.D;
            DOEkycX dOEkycX6 = this.adharData;
            if (dOEkycX6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX6 = null;
            }
            editText3.setText(dOEkycX6.getLocalityIfAny());
            a7 a7Var38 = this.mBinding;
            if (a7Var38 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var38 = null;
            }
            EditText editText4 = a7Var38.P;
            DOEkycX dOEkycX7 = this.adharData;
            if (dOEkycX7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX7 = null;
            }
            editText4.setText(dOEkycX7.getLocalityIfAny());
        }
        DOEkycX dOEkycX8 = this.adharData;
        if (dOEkycX8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adharData");
            dOEkycX8 = null;
        }
        if (kt6.d(dOEkycX8.getLandMark())) {
            a7 a7Var39 = this.mBinding;
            if (a7Var39 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var39 = null;
            }
            EditText editText5 = a7Var39.B;
            DOEkycX dOEkycX9 = this.adharData;
            if (dOEkycX9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX9 = null;
            }
            editText5.setText(dOEkycX9.getLandMark());
            a7 a7Var40 = this.mBinding;
            if (a7Var40 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var40 = null;
            }
            EditText editText6 = a7Var40.N;
            DOEkycX dOEkycX10 = this.adharData;
            if (dOEkycX10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX10 = null;
            }
            editText6.setText(dOEkycX10.getLandMark());
        } else {
            a7 a7Var41 = this.mBinding;
            if (a7Var41 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var41 = null;
            }
            EditText editText7 = a7Var41.B;
            StringBuilder sb = new StringBuilder();
            DOEkycX dOEkycX11 = this.adharData;
            if (dOEkycX11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX11 = null;
            }
            sb.append(dOEkycX11.getLocalityIfAny());
            sb.append(", ");
            DOEkycX dOEkycX12 = this.adharData;
            if (dOEkycX12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX12 = null;
            }
            sb.append(dOEkycX12.getDist());
            sb.append(", ");
            DOEkycX dOEkycX13 = this.adharData;
            if (dOEkycX13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX13 = null;
            }
            sb.append(dOEkycX13.getState());
            editText7.setText(sb.toString());
            a7 a7Var42 = this.mBinding;
            if (a7Var42 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var42 = null;
            }
            EditText editText8 = a7Var42.N;
            StringBuilder sb2 = new StringBuilder();
            DOEkycX dOEkycX14 = this.adharData;
            if (dOEkycX14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX14 = null;
            }
            sb2.append(dOEkycX14.getLocalityIfAny());
            sb2.append(", ");
            DOEkycX dOEkycX15 = this.adharData;
            if (dOEkycX15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX15 = null;
            }
            sb2.append(dOEkycX15.getDist());
            sb2.append(", ");
            DOEkycX dOEkycX16 = this.adharData;
            if (dOEkycX16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX16 = null;
            }
            sb2.append(dOEkycX16.getState());
            editText8.setText(sb2.toString());
        }
        DOEkycX dOEkycX17 = this.adharData;
        if (dOEkycX17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adharData");
            dOEkycX17 = null;
        }
        if (kt6.d(dOEkycX17.getPincode())) {
            a7 a7Var43 = this.mBinding;
            if (a7Var43 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var43 = null;
            }
            EditText editText9 = a7Var43.C;
            DOEkycX dOEkycX18 = this.adharData;
            if (dOEkycX18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
                dOEkycX18 = null;
            }
            editText9.setText(dOEkycX18.getPincode());
            a7 a7Var44 = this.mBinding;
            if (a7Var44 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var44 = null;
            }
            EditText editText10 = a7Var44.O;
            DOEkycX dOEkycX19 = this.adharData;
            if (dOEkycX19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adharData");
            } else {
                dOEkycX = dOEkycX19;
            }
            editText10.setText(dOEkycX.getPincode());
        }
        this.isCurrentOrPermanentAddress = "dl-renewal-current-address";
    }

    public final void n3(Intent intent) {
        try {
            intent.putExtra("DL", this.dlNo);
            intent.putExtra("dob", this.dob);
            intent.putExtra("DLDetails", L2());
            intent.putExtra("Mobile_no", this.mobile_no);
            intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
            intent.putExtra("lastEndorsedState", this.lastEndorseState);
            intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
            intent.putExtra("lastEndorseStateCode", this.lastEndorseStateCode);
            intent.putExtra("whatServiceRequired", this.whatServiceRequired);
            a7 a7Var = this.mBinding;
            a7 a7Var2 = null;
            if (a7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var = null;
            }
            intent.putExtra("presHouseNo", a7Var.L.getText().toString());
            a7 a7Var3 = this.mBinding;
            if (a7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var3 = null;
            }
            intent.putExtra("presStreet", a7Var3.P.getText().toString());
            a7 a7Var4 = this.mBinding;
            if (a7Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var4 = null;
            }
            intent.putExtra("presLocation", a7Var4.N.getText().toString());
            intent.putExtra("presVillageOrTown", this.presentAdd.getVillageOrTown());
            intent.putExtra("presSubDistrict", this.presentAdd.getSubDistrict());
            intent.putExtra("presDistrict", this.presentAdd.getDistrict());
            intent.putExtra("presState", J2());
            a7 a7Var5 = this.mBinding;
            if (a7Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var5 = null;
            }
            intent.putExtra("presPincode", a7Var5.O.getText().toString());
            a7 a7Var6 = this.mBinding;
            if (a7Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var6 = null;
            }
            intent.putExtra("perHouseNo", a7Var6.A.getText().toString());
            a7 a7Var7 = this.mBinding;
            if (a7Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var7 = null;
            }
            intent.putExtra("perStreet", a7Var7.D.getText().toString());
            a7 a7Var8 = this.mBinding;
            if (a7Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                a7Var8 = null;
            }
            intent.putExtra("perLocation", a7Var8.B.getText().toString());
            intent.putExtra("permVillageOrTown", this.permanentAdd.getVillageOrTown());
            intent.putExtra("perSubDistrict", this.permanentAdd.getSubDistrict());
            intent.putExtra("perDistrict", this.permanentAdd.getDistrict());
            intent.putExtra("perState", b3());
            a7 a7Var9 = this.mBinding;
            if (a7Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                a7Var2 = a7Var9;
            }
            intent.putExtra("perPinCode", a7Var2.O.getText().toString());
            intent.putExtra("permanentAdd", this.permanentAdd);
            intent.putExtra("state_value", this.state_value);
            intent.putExtra("purCode", this.purCode);
            intent.putExtra("bioRecGenesis", I2());
            intent.putExtra("allowAddrChangeAtDlservReqst", G2());
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lq7 lq7VarF = kd1.f(this, R.layout.activity_change_of_address);
        Intrinsics.checkNotNullExpressionValue(lq7VarF, "setContentView(...)");
        this.mBinding = (a7) lq7VarF;
        l4(new wl5(this));
        h4(new ws6(this));
        c4(new wa3(this));
        f4(this);
        ta3.a aVar = ta3.a;
        a7 a7Var = this.mBinding;
        a7 a7Var2 = null;
        if (a7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var = null;
        }
        aVar.y(this, a7Var);
        View viewFindViewById = findViewById(R.id.pb_coa);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        g4((ProgressBar) viewFindViewById);
        j4(new ProgressDialog(V2()));
        a3().setMessage(O2().b("label_challan_please_wait", getString(R.string.please_wait)));
        a3().setCancelable(false);
        a3().setCanceledOnTouchOutside(false);
        h3();
        m3();
        q3();
        z2();
        if (Intrinsics.areEqual(g3().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            e4(CombineServiceInterface.INSTANCE.a(this));
            this.mCombineViewModel = (fs0) new z(this, new ds0(new cs0(U2()))).a(fs0.class);
            L3();
        }
        a7 a7Var3 = this.mBinding;
        if (a7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var3 = null;
        }
        a7Var3.e0.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChangeOfAddressActivity.O3(this.a, view);
            }
        });
        a7 a7Var4 = this.mBinding;
        if (a7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var4 = null;
        }
        a7Var4.e0.e.setVisibility(8);
        a7 a7Var5 = this.mBinding;
        if (a7Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var5 = null;
        }
        a7Var5.d0.g.setText(g3().k());
        a7 a7Var6 = this.mBinding;
        if (a7Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            a7Var6 = null;
        }
        a7Var6.Q0.setVisibility(0);
        a7 a7Var7 = this.mBinding;
        if (a7Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            a7Var2 = a7Var7;
        }
        a7Var2.z.setVisibility(0);
        m4();
    }
}
