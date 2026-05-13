package com.nic.mparivahan.dlservices.ui.idp;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowMetrics;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.DLServicesAuth.View.DlServiceDetailsActivity;
import com.nic.mparivahan.Dl.Model.BioImgObjX;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.DlCombineServices.CombineServiceInterface;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.DlLog.DlLogCapture;
import com.nic.mparivahan.dlservices.data.model.AppCatPojo;
import com.nic.mparivahan.dlservices.data.model.DlSubmitResult;
import com.nic.mparivahan.dlservices.data.model.ResultItemSubmit;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse;
import com.nic.mparivahan.dlservices.data.model.idp.GetIdpCovGradesResponse;
import com.nic.mparivahan.dlservices.data.model.idp.GetNationsCodeItem;
import com.nic.mparivahan.dlservices.data.model.idp.GetNationsToApplyForResponse;
import com.nic.mparivahan.dlservices.data.model.idp.IdpGenSubmit;
import com.nic.mparivahan.dlservices.data.model.idp.IdpSubmitRequest;
import com.nic.mparivahan.dlservices.data.model.idp.IdpcovgradesItem;
import com.nic.mparivahan.dlservices.data.model.idp.selectDLlist;
import com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity;
import com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity;
import com.nic.mparivahan.dlservices.ui.idp.a;
import com.zepto.b91;
import com.zepto.cc;
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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
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
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b`\n\u0002\u0018\u0002\n\u0002\bC\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\t¢\u0006\u0006\b×\u0002\u0010Ø\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u001a\u0010\n\u001a\u00020\u00032\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0011H\u0002J\b\u0010\u0017\u001a\u00020\u0003H\u0002J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001b\u001a\u00020\u0003H\u0002J\u001c\u0010 \u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002J\u001a\u0010$\u001a\u00020\u00032\u0010\u0010#\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\"\u0018\u00010!H\u0003J\u0012\u0010'\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010%H\u0014J\u001a\u0010(\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eJ\u0018\u0010+\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u0011H\u0016R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010J\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010N\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010E\u001a\u0004\bL\u0010G\"\u0004\bM\u0010IR$\u0010R\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010E\u001a\u0004\bP\u0010G\"\u0004\bQ\u0010IR2\u0010Z\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001e0S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0018\u0010\\\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010ER\"\u0010`\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010E\u001a\u0004\b^\u0010G\"\u0004\b_\u0010IR\"\u0010d\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010E\u001a\u0004\bb\u0010G\"\u0004\bc\u0010IR\"\u0010h\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010E\u001a\u0004\bf\u0010G\"\u0004\bg\u0010IR \u0010k\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR \u0010m\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010jR \u0010o\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010jR \u0010r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\"\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u001d\u0010v\u001a\b\u0012\u0004\u0012\u00020\u001e0!8\u0006¢\u0006\f\n\u0004\bs\u0010j\u001a\u0004\bt\u0010uR\u001d\u0010y\u001a\b\u0012\u0004\u0012\u00020\u001e0!8\u0006¢\u0006\f\n\u0004\bw\u0010j\u001a\u0004\bx\u0010uR\u001d\u0010|\u001a\b\u0012\u0004\u0012\u00020\u001e0!8\u0006¢\u0006\f\n\u0004\bz\u0010j\u001a\u0004\b{\u0010uR\u001d\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u001e0!8\u0006¢\u0006\f\n\u0004\b}\u0010j\u001a\u0004\b~\u0010uR \u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0!8\u0006¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010j\u001a\u0005\b\u0081\u0001\u0010uR\u0018\u0010\u0084\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010ER\u0018\u0010\u0086\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010ER\u001e\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0!8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010jR\u0018\u0010\u008a\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010ER\u0018\u0010\u008c\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010ER4\u0010\u0095\u0001\u001a\r \u008e\u0001*\u0005\u0018\u00010\u008d\u00010\u008d\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R&\u0010\u0099\u0001\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0096\u0001\u0010E\u001a\u0005\b\u0097\u0001\u0010G\"\u0005\b\u0098\u0001\u0010IR&\u0010\u009d\u0001\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009a\u0001\u0010E\u001a\u0005\b\u009b\u0001\u0010G\"\u0005\b\u009c\u0001\u0010IR&\u0010¡\u0001\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009e\u0001\u0010E\u001a\u0005\b\u009f\u0001\u0010G\"\u0005\b \u0001\u0010IR&\u0010¥\u0001\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¢\u0001\u0010E\u001a\u0005\b£\u0001\u0010G\"\u0005\b¤\u0001\u0010IR*\u0010\u00ad\u0001\u001a\u00030¦\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R-\u0010²\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0!8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b®\u0001\u0010j\u001a\u0005\b¯\u0001\u0010u\"\u0006\b°\u0001\u0010±\u0001R(\u0010¶\u0001\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b³\u0001\u0010E\u001a\u0005\b´\u0001\u0010G\"\u0005\bµ\u0001\u0010IR(\u0010º\u0001\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b·\u0001\u0010E\u001a\u0005\b¸\u0001\u0010G\"\u0005\b¹\u0001\u0010IR(\u0010¾\u0001\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b»\u0001\u0010E\u001a\u0005\b¼\u0001\u0010G\"\u0005\b½\u0001\u0010IR(\u0010Â\u0001\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¿\u0001\u0010E\u001a\u0005\bÀ\u0001\u0010G\"\u0005\bÁ\u0001\u0010IR(\u0010Æ\u0001\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÃ\u0001\u0010E\u001a\u0005\bÄ\u0001\u0010G\"\u0005\bÅ\u0001\u0010IR(\u0010Ê\u0001\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÇ\u0001\u0010E\u001a\u0005\bÈ\u0001\u0010G\"\u0005\bÉ\u0001\u0010IR(\u0010Î\u0001\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bË\u0001\u0010E\u001a\u0005\bÌ\u0001\u0010G\"\u0005\bÍ\u0001\u0010IR(\u0010Ò\u0001\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÏ\u0001\u0010E\u001a\u0005\bÐ\u0001\u0010G\"\u0005\bÑ\u0001\u0010IR(\u0010Ö\u0001\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÓ\u0001\u0010E\u001a\u0005\bÔ\u0001\u0010G\"\u0005\bÕ\u0001\u0010IR(\u0010Ú\u0001\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b×\u0001\u0010E\u001a\u0005\bØ\u0001\u0010G\"\u0005\bÙ\u0001\u0010IR(\u0010Þ\u0001\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÛ\u0001\u0010E\u001a\u0005\bÜ\u0001\u0010G\"\u0005\bÝ\u0001\u0010IR(\u0010â\u0001\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bß\u0001\u0010E\u001a\u0005\bà\u0001\u0010G\"\u0005\bá\u0001\u0010IR(\u0010æ\u0001\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bã\u0001\u0010E\u001a\u0005\bä\u0001\u0010G\"\u0005\bå\u0001\u0010IR(\u0010ê\u0001\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bç\u0001\u0010E\u001a\u0005\bè\u0001\u0010G\"\u0005\bé\u0001\u0010IR(\u0010î\u0001\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bë\u0001\u0010E\u001a\u0005\bì\u0001\u0010G\"\u0005\bí\u0001\u0010IR(\u0010ò\u0001\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bï\u0001\u0010E\u001a\u0005\bð\u0001\u0010G\"\u0005\bñ\u0001\u0010IR(\u0010ö\u0001\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bó\u0001\u0010E\u001a\u0005\bô\u0001\u0010G\"\u0005\bõ\u0001\u0010IR(\u0010ú\u0001\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b÷\u0001\u0010E\u001a\u0005\bø\u0001\u0010G\"\u0005\bù\u0001\u0010IR&\u0010þ\u0001\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bû\u0001\u0010E\u001a\u0005\bü\u0001\u0010G\"\u0005\bý\u0001\u0010IR1\u0010\u0082\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\"\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bÿ\u0001\u0010j\u001a\u0005\b\u0080\u0002\u0010u\"\u0006\b\u0081\u0002\u0010±\u0001R&\u0010\u0086\u0002\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0083\u0002\u0010E\u001a\u0005\b\u0084\u0002\u0010G\"\u0005\b\u0085\u0002\u0010IR*\u0010\u008e\u0002\u001a\u00030\u0087\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0088\u0002\u0010\u0089\u0002\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002\"\u0006\b\u008c\u0002\u0010\u008d\u0002R&\u0010\u0092\u0002\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008f\u0002\u0010E\u001a\u0005\b\u0090\u0002\u0010G\"\u0005\b\u0091\u0002\u0010IR&\u0010\u0096\u0002\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0093\u0002\u0010E\u001a\u0005\b\u0094\u0002\u0010G\"\u0005\b\u0095\u0002\u0010IR&\u0010\u009a\u0002\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0097\u0002\u0010E\u001a\u0005\b\u0098\u0002\u0010G\"\u0005\b\u0099\u0002\u0010IR&\u0010\u009e\u0002\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009b\u0002\u0010E\u001a\u0005\b\u009c\u0002\u0010G\"\u0005\b\u009d\u0002\u0010IR&\u0010¢\u0002\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009f\u0002\u0010E\u001a\u0005\b \u0002\u0010G\"\u0005\b¡\u0002\u0010IR&\u0010¦\u0002\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b£\u0002\u0010E\u001a\u0005\b¤\u0002\u0010G\"\u0005\b¥\u0002\u0010IR&\u0010ª\u0002\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b§\u0002\u0010E\u001a\u0005\b¨\u0002\u0010G\"\u0005\b©\u0002\u0010IR&\u0010®\u0002\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b«\u0002\u0010E\u001a\u0005\b¬\u0002\u0010G\"\u0005\b\u00ad\u0002\u0010IR&\u0010²\u0002\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¯\u0002\u0010E\u001a\u0005\b°\u0002\u0010G\"\u0005\b±\u0002\u0010IR-\u0010¶\u0002\u001a\b\u0012\u0004\u0012\u00020\u001e0!8\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0005\b³\u0002\u0010j\u001a\u0005\b´\u0002\u0010u\"\u0006\bµ\u0002\u0010±\u0001R-\u0010º\u0002\u001a\b\u0012\u0004\u0012\u00020\u001e0!8\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0005\b·\u0002\u0010j\u001a\u0005\b¸\u0002\u0010u\"\u0006\b¹\u0002\u0010±\u0001R)\u0010À\u0002\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b»\u0002\u0010\u0080\u0001\u001a\u0006\b¼\u0002\u0010½\u0002\"\u0006\b¾\u0002\u0010¿\u0002R(\u0010Æ\u0002\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bÁ\u0002\u0010=\u001a\u0006\bÂ\u0002\u0010Ã\u0002\"\u0006\bÄ\u0002\u0010Å\u0002R(\u0010Ê\u0002\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bÇ\u0002\u0010=\u001a\u0006\bÈ\u0002\u0010Ã\u0002\"\u0006\bÉ\u0002\u0010Å\u0002R\u001a\u0010Î\u0002\u001a\u00030Ë\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÌ\u0002\u0010Í\u0002R*\u0010Ö\u0002\u001a\u00030Ï\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÐ\u0002\u0010Ñ\u0002\u001a\u0006\bÒ\u0002\u0010Ó\u0002\"\u0006\bÔ\u0002\u0010Õ\u0002¨\u0006Ù\u0002"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/idp/DLIdpActivity;", "Lcom/zepto/o40;", "Lcom/nic/mparivahan/dlservices/ui/idp/a$a;", "", "g2", "E2", "F2", "", "Lcom/nic/mparivahan/dlservices/data/model/idp/GetNationsCodeItem;", "nationsMaster", "n3", "J2", "Lcom/nic/mparivahan/dlservices/data/model/idp/IdpSubmitRequest;", "o3", "Lcom/nic/mparivahan/dlservices/data/model/idp/IdpGenSubmit;", "p3", "l2", "", "I2", "isDisq", "D2", "isBarred", "C2", "h3", "", "forBirthOrChooseNation", "f3", "g3", "Landroid/content/Context;", "context", "", "message", "i3", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/dlservices/data/model/idp/IdpcovgradesItem;", "idpcovgradesItems", "h2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "l3", "position", "clickAble", "j", "Lcom/zepto/cc;", "F", "Lcom/zepto/cc;", "mBinding", "Lcom/zepto/b91;", "G", "Lcom/zepto/b91;", "viewModel", "Lcom/zepto/wl5;", "H", "Lcom/zepto/wl5;", "B2", "()Lcom/zepto/wl5;", "y3", "(Lcom/zepto/wl5;)V", "sarthiSession", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "I", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "m2", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "r3", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "dlDetails", "J", "Ljava/lang/String;", "n2", "()Ljava/lang/String;", "setDlNo", "(Ljava/lang/String;)V", "dlNo", "K", "o2", "setDob", "dob", "L", "y2", "setMobile_no", "mobile_no", "Ljava/util/HashMap;", "M", "Ljava/util/HashMap;", "getWhatServiceRequired", "()Ljava/util/HashMap;", "setWhatServiceRequired", "(Ljava/util/HashMap;)V", "whatServiceRequired", "N", "lastEndorseRTOCode", "O", "q2", "setLastEndorseRto", "lastEndorseRto", "P", "r2", "setLastEndorseState", "lastEndorseState", "Q", "s2", "setLastEndorseStateCode", "lastEndorseStateCode", "R", "Ljava/util/ArrayList;", "mAllNationalList", "S", "mValidNationalList", "T", "mRestrictedNationalList", "U", "Ljava/util/List;", "mCovList", "V", "getListsName", "()Ljava/util/ArrayList;", "listsName", "W", "t2", "listCode", "X", "getAlllistName", "alllistName", "Y", "k2", "alllistCode", "Z", "getRestrictList", "restrictList", "a0", "brithCountryCd", "b0", "selectedCountryCd", "c0", "covsCd", "d0", "idpAppliedFromCd", "e0", "mNatVisaIssbleForNatCode", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "f0", "Ljava/util/Calendar;", "getMyCalendar", "()Ljava/util/Calendar;", "setMyCalendar", "(Ljava/util/Calendar;)V", "myCalendar", "g0", "getAppliedIdpFromIndianEmb", "setAppliedIdpFromIndianEmb", "appliedIdpFromIndianEmb", "h0", "getAnyDisqualified", "setAnyDisqualified", "anyDisqualified", "i0", "A2", "setPurCode", "purCode", "j0", "getAnyBarred", "setAnyBarred", "anyBarred", "Lcom/zepto/ws6;", "k0", "Lcom/zepto/ws6;", "x2", "()Lcom/zepto/ws6;", "w3", "(Lcom/zepto/ws6;)V", "mSessionmanger", "l0", "getCovList", "setCovList", "(Ljava/util/ArrayList;)V", "covList", "m0", "getBioRecGenesis", "setBioRecGenesis", "bioRecGenesis", "n0", "getAllowAddrChangeAtDlservReqst", "setAllowAddrChangeAtDlservReqst", "allowAddrChangeAtDlservReqst", "o0", "getPerHouseNo", "setPerHouseNo", "perHouseNo", "p0", "getPerStreet", "setPerStreet", "perStreet", "q0", "getPerLocation", "setPerLocation", "perLocation", "r0", "getPermVillageOrTown", "setPermVillageOrTown", "permVillageOrTown", "s0", "getPerSubDistrict", "setPerSubDistrict", "perSubDistrict", "t0", "getPerDistrict", "setPerDistrict", "perDistrict", "u0", "getPerState", "setPerState", "perState", "v0", "getPerPinCode", "setPerPinCode", "perPinCode", "w0", "getPresHouseNo", "setPresHouseNo", "presHouseNo", "x0", "getPresStreet", "setPresStreet", "presStreet", "y0", "getPresLocation", "setPresLocation", "presLocation", "z0", "getPresVillageOrTown", "setPresVillageOrTown", "presVillageOrTown", "A0", "getPresSubDistrict", "setPresSubDistrict", "presSubDistrict", "B0", "getPresDistrict", "setPresDistrict", "presDistrict", "C0", "getPresState", "setPresState", "presState", "D0", "getPresPincode", "setPresPincode", "presPincode", "E0", "getState_value", "setState_value", "state_value", "F0", "w2", "v3", "mIdpcovgradesItem", "G0", "getAppCategory", "q3", "appCategory", "Lcom/zepto/wa3;", "H0", "Lcom/zepto/wa3;", "p2", "()Lcom/zepto/wa3;", "s3", "(Lcom/zepto/wa3;)V", "langSession", "I0", "getForm1FlagDLserReq", "setForm1FlagDLserReq", "form1FlagDLserReq", "J0", "getSubmitFormOne", "setSubmitFormOne", "submitFormOne", "K0", "getAString", "setAString", "aString", "L0", "getBString", "setBString", "bString", "M0", "getCString", "setCString", "cString", "N0", "getDString", "setDString", "dString", "O0", "getEString", "setEString", "eString", "P0", "getFString", "setFString", "fString", "Q0", "getGString", "setGString", "gString", "R0", "z2", "x3", "multiListName", "S0", "u2", "t3", "listHeaderSteps", "T0", "getCOA", "()Z", "setCOA", "(Z)V", "COA", "U0", "getWidthPixels", "()I", "setWidthPixels", "(I)V", "widthPixels", "V0", "getSerialNo", "setSerialNo", "serialNo", "Lcom/zepto/fs0;", "W0", "Lcom/zepto/fs0;", "mCombineViewModel", "Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;", "X0", "Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;", "v2", "()Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;", "u3", "(Lcom/nic/mparivahan/DlCombineServices/CombineServiceInterface;)V", "mCombineServiceInterface", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDLIdpActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DLIdpActivity.kt\ncom/nic/mparivahan/dlservices/ui/idp/DLIdpActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1527:1\n1855#2,2:1528\n1855#2,2:1530\n1855#2,2:1532\n1855#2,2:1534\n1855#2,2:1536\n*S KotlinDebug\n*F\n+ 1 DLIdpActivity.kt\ncom/nic/mparivahan/dlservices/ui/idp/DLIdpActivity\n*L\n838#1:1528,2\n893#1:1530,2\n947#1:1532,2\n1018#1:1534,2\n1140#1:1536,2\n*E\n"})
public final class DLIdpActivity extends o40 implements a.InterfaceC0061a {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public cc mBinding;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    public ArrayList mIdpcovgradesItem;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public b91 viewModel;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public DldetobjX dlDetails;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String dlNo;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String dob;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String mobile_no;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    public ArrayList multiListName;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    public ArrayList listHeaderSteps;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    public boolean COA;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public List mCovList;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    public int widthPixels;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    public int serialNo;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    public fs0 mCombineViewModel;

    /* JADX INFO: renamed from: X0, reason: from kotlin metadata */
    public CombineServiceInterface mCombineServiceInterface;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public ws6 mSessionmanger;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public String bioRecGenesis;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public String allowAddrChangeAtDlservReqst;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public HashMap whatServiceRequired = new HashMap();

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String lastEndorseRTOCode = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String lastEndorseRto = "";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String lastEndorseState = "";

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String lastEndorseStateCode = "";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public ArrayList mAllNationalList = new ArrayList();

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public ArrayList mValidNationalList = new ArrayList();

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public ArrayList mRestrictedNationalList = new ArrayList();

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public final ArrayList listsName = new ArrayList();

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public final ArrayList listCode = new ArrayList();

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public final ArrayList alllistName = new ArrayList();

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public final ArrayList alllistCode = new ArrayList();

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public final ArrayList restrictList = new ArrayList();

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String brithCountryCd = "";

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String selectedCountryCd = "";

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public ArrayList covsCd = new ArrayList();

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public String idpAppliedFromCd = "";

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public String mNatVisaIssbleForNatCode = "";

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public Calendar myCalendar = Calendar.getInstance();

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public String appliedIdpFromIndianEmb = "";

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public String anyDisqualified = "N";

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public String purCode = "0";

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public String anyBarred = "N";

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public ArrayList covList = new ArrayList();

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public String perHouseNo = "";

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public String perStreet = "";

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public String perLocation = "";

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public String permVillageOrTown = "";

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    public String perSubDistrict = "";

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    public String perDistrict = "";

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    public String perState = "";

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public String perPinCode = "";

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    public String presHouseNo = "";

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    public String presStreet = "";

    /* JADX INFO: renamed from: y0, reason: from kotlin metadata */
    public String presLocation = "";

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    public String presVillageOrTown = "";

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    public String presSubDistrict = "";

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    public String presDistrict = "";

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    public String presState = "";

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    public String presPincode = "";

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    public String state_value = "";

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    public String appCategory = "0";

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    public String form1FlagDLserReq = "N";

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    public String submitFormOne = "N";

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    public String aString = "";

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public String bString = "";

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public String cString = "";

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public String dString = "";

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    public String eString = "";

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    public String fString = "";

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    public String gString = "N";

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
            DLIdpActivity.this.q3(((AppCatPojo) ((ArrayList) this.b.element).get(i)).getAppCode());
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
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
        public final void a(GetNationsToApplyForResponse getNationsToApplyForResponse) {
            try {
                if (StringsKt__StringsJVMKt.equals$default(getNationsToApplyForResponse.getStatusCode(), "00", false, 2, null)) {
                    List<GetNationsCodeItem> nationsMaster = getNationsToApplyForResponse.getNationsMaster();
                    Intrinsics.checkNotNull(nationsMaster, "null cannot be cast to non-null type kotlin.collections.List<com.nic.mparivahan.dlservices.data.model.idp.GetNationsCodeItem>");
                    Collections.sort(nationsMaster);
                    DLIdpActivity.this.n3(nationsMaster);
                } else {
                    DLIdpActivity dLIdpActivity = DLIdpActivity.this;
                    dLIdpActivity.l3(dLIdpActivity, dLIdpActivity.p2().b("no_details", DLIdpActivity.this.getString(R.string.no_Details_are_avail)));
                }
            } catch (Exception unused) {
                DLIdpActivity dLIdpActivity2 = DLIdpActivity.this;
                dLIdpActivity2.l3(dLIdpActivity2, dLIdpActivity2.p2().b("service_is_not_present", DLIdpActivity.this.getString(R.string.no_Details_are_avail)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetNationsToApplyForResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
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
        public final void a(GetIdpCovGradesResponse getIdpCovGradesResponse) {
            try {
                cc ccVar = null;
                if (StringsKt__StringsJVMKt.equals$default(getIdpCovGradesResponse.getStatusCode(), "00", false, 2, null)) {
                    DLIdpActivity.this.v3((ArrayList) getIdpCovGradesResponse.getIdpcovgrades());
                    return;
                }
                DLIdpActivity dLIdpActivity = DLIdpActivity.this;
                String statusDesc = getIdpCovGradesResponse.getStatusDesc();
                cc ccVar2 = DLIdpActivity.this.mBinding;
                if (ccVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    ccVar = ccVar2;
                }
                dLIdpActivity.w1(statusDesc, ccVar.m());
            } catch (Exception unused) {
                DLIdpActivity dLIdpActivity2 = DLIdpActivity.this;
                dLIdpActivity2.l3(dLIdpActivity2, dLIdpActivity2.p2().b("service_is_not_present", DLIdpActivity.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetIdpCovGradesResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
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
        public final void a(GetAckDetForGivenDLNumberResponse getAckDetForGivenDLNumberResponse) throws Throwable {
            List<ResultItemSubmit> result;
            cc ccVar = null;
            try {
                cc ccVar2 = DLIdpActivity.this.mBinding;
                if (ccVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    ccVar2 = null;
                }
                ccVar2.T.c(false);
                DlSubmitResult dlSubmitresult = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                if (!StringsKt__StringsJVMKt.equals$default(dlSubmitresult != null ? dlSubmitresult.getStatusCode() : null, "00", false, 2, null)) {
                    DlSubmitResult dlSubmitresult2 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                    if (StringsKt__StringsJVMKt.equals$default(dlSubmitresult2 != null ? dlSubmitresult2.getStatusCode() : null, "01", false, 2, null)) {
                        DLIdpActivity dLIdpActivity = DLIdpActivity.this;
                        dLIdpActivity.l3(dLIdpActivity, "DL holder does not have proper data");
                        cc ccVar3 = DLIdpActivity.this.mBinding;
                        if (ccVar3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            ccVar3 = null;
                        }
                        ccVar3.T.c(false);
                        return;
                    }
                    cc ccVar4 = DLIdpActivity.this.mBinding;
                    if (ccVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        ccVar4 = null;
                    }
                    ccVar4.T.c(false);
                    DLIdpActivity dLIdpActivity2 = DLIdpActivity.this;
                    DlSubmitResult dlSubmitresult3 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                    String statusDesc = dlSubmitresult3 != null ? dlSubmitresult3.getStatusDesc() : null;
                    cc ccVar5 = DLIdpActivity.this.mBinding;
                    if (ccVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        ccVar5 = null;
                    }
                    dLIdpActivity2.w1(statusDesc, ccVar5.m());
                    return;
                }
                DlSubmitResult dlSubmitresult4 = getAckDetForGivenDLNumberResponse.getDlSubmitresult();
                if (dlSubmitresult4 == null || (result = dlSubmitresult4.getResult()) == null || !(!result.isEmpty())) {
                    return;
                }
                DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity = new DLServiceAcknowlegementActivity();
                ResultItemSubmit resultItemSubmit = getAckDetForGivenDLNumberResponse.getDlSubmitresult().getResult().get(0);
                if (resultItemSubmit != null) {
                    DLIdpActivity dLIdpActivity3 = DLIdpActivity.this;
                    try {
                        DlLogCapture.Companion companion = DlLogCapture.INSTANCE;
                        String applicationDate = resultItemSubmit.getApplicationDate();
                        String applicationNo = resultItemSubmit.getApplicationNo();
                        Intrinsics.checkNotNull(applicationNo);
                        long j = Long.parseLong(applicationNo);
                        int i = Integer.parseInt(dLIdpActivity3.x2().k());
                        String dateofBirth = resultItemSubmit.getDateofBirth();
                        String dlno = resultItemSubmit.getDlno();
                        Intrinsics.checkNotNull(dlno);
                        String applicantGender = resultItemSubmit.getApplicantGender();
                        String mobile_no = dLIdpActivity3.getMobile_no();
                        Intrinsics.checkNotNull(mobile_no);
                        String purCode = dLIdpActivity3.getPurCode();
                        String str = dLIdpActivity3.lastEndorseRTOCode;
                        Intrinsics.checkNotNull(str);
                        companion.a(dLIdpActivity3, "1234", "S", applicationDate, j, i, dateofBirth, dlno, "N", "N", applicantGender, mobile_no, false, purCode, str, dLIdpActivity3.getLastEndorseStateCode());
                    } catch (Exception unused) {
                    }
                    if (!Intrinsics.areEqual(dLIdpActivity3.B2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                        dLIdpActivity3.x3(new ArrayList());
                        dLIdpActivity3.z2().add(dLIdpActivity3.B2().k());
                    }
                    dLServiceAcknowlegementActivity.K2(dLIdpActivity3, resultItemSubmit, dLIdpActivity3.lastEndorseRTOCode, dLIdpActivity3.m2(), dLIdpActivity3.getDlNo(), dLIdpActivity3.getDob(), dLIdpActivity3.getMobile_no(), dLIdpActivity3.getLastEndorseRto(), dLIdpActivity3.getLastEndorseState(), dLIdpActivity3.getLastEndorseStateCode(), dLIdpActivity3.z2());
                }
            } catch (Exception unused2) {
                cc ccVar6 = DLIdpActivity.this.mBinding;
                if (ccVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    ccVar = ccVar6;
                }
                ccVar.T.c(false);
                DLIdpActivity dLIdpActivity4 = DLIdpActivity.this;
                dLIdpActivity4.l3(dLIdpActivity4, dLIdpActivity4.p2().b("label_log_unbl_sigup", DLIdpActivity.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((GetAckDetForGivenDLNumberResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e implements d86.b {
        public final /* synthetic */ int a;
        public final /* synthetic */ DLIdpActivity b;

        public e(int i, DLIdpActivity dLIdpActivity) {
            this.a = i;
            this.b = dLIdpActivity;
        }

        @Override // com.zepto.d86.b
        public void a(String str, int i) {
            try {
                int i2 = this.a;
                cc ccVar = null;
                if (i2 != 1) {
                    if (i2 == 2) {
                        Object obj = this.b.getAlllistCode().get(i);
                        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                        String str2 = (String) obj;
                        cc ccVar2 = this.b.mBinding;
                        if (ccVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        } else {
                            ccVar = ccVar2;
                        }
                        ccVar.C.setText(str);
                        this.b.idpAppliedFromCd = "" + str2;
                        return;
                    }
                    return;
                }
                Object obj2 = this.b.getAlllistCode().get(i);
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                String str3 = (String) obj2;
                cc ccVar3 = this.b.mBinding;
                if (ccVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    ccVar = ccVar3;
                }
                ccVar.E.setText(str);
                this.b.brithCountryCd = "" + str3;
                Log.d("country of birth", str + '-' + str3);
            } catch (Exception unused) {
            }
        }
    }

    public static final class f implements d86.b {
        @Override // com.zepto.d86.b
        public void a(String str, int i) {
        }
    }

    public static final class g implements d86.b {
        public g() {
        }

        @Override // com.zepto.d86.b
        public void a(String str, int i) {
            try {
                Object obj = DLIdpActivity.this.getListCode().get(i);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                String str2 = (String) obj;
                cc ccVar = DLIdpActivity.this.mBinding;
                if (ccVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    ccVar = null;
                }
                ccVar.H.setText(str);
                DLIdpActivity.this.selectedCountryCd = "" + str2;
                Log.d("country for visa granted", str + '-' + str2);
            } catch (Exception unused) {
            }
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

    private final void E2() {
        cc ccVar = null;
        if (getIntent() != null) {
            try {
                this.bioRecGenesis = String.valueOf(getIntent().getStringExtra("bioRecGenesis"));
                this.allowAddrChangeAtDlservReqst = String.valueOf(getIntent().getStringExtra("allowAddrChangeAtDlservReqst"));
                String stringExtra = getIntent().getStringExtra("state_value");
                Intrinsics.checkNotNull(stringExtra, "null cannot be cast to non-null type kotlin.String");
                this.state_value = stringExtra;
                this.dlNo = String.valueOf(getIntent().getStringExtra("DL"));
                this.dob = String.valueOf(getIntent().getStringExtra("dob"));
                Serializable serializableExtra = getIntent().getSerializableExtra("DLDetails");
                Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
                r3((DldetobjX) serializableExtra);
                this.mobile_no = String.valueOf(getIntent().getStringExtra("Mobile_no"));
                String stringExtra2 = getIntent().getStringExtra("lastEndorsedRTOCode");
                Intrinsics.checkNotNull(stringExtra2, "null cannot be cast to non-null type kotlin.String");
                this.lastEndorseRTOCode = stringExtra2;
                Serializable serializableExtra2 = getIntent().getSerializableExtra("whatServiceRequired");
                Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type java.util.HashMap<kotlin.String?, kotlin.String?>");
                this.whatServiceRequired = (HashMap) serializableExtra2;
                String stringExtra3 = getIntent().getStringExtra("lastEndorsedRTO");
                Intrinsics.checkNotNull(stringExtra3, "null cannot be cast to non-null type kotlin.String");
                this.lastEndorseRto = stringExtra3;
                String stringExtra4 = getIntent().getStringExtra("lastEndorsedState");
                Intrinsics.checkNotNull(stringExtra4, "null cannot be cast to non-null type kotlin.String");
                this.lastEndorseState = stringExtra4;
                String stringExtra5 = getIntent().getStringExtra("lastEndorseStateCode");
                Intrinsics.checkNotNull(stringExtra5, "null cannot be cast to non-null type kotlin.String");
                this.lastEndorseStateCode = stringExtra5;
                String stringExtra6 = getIntent().getStringExtra("purCode");
                Intrinsics.checkNotNull(stringExtra6, "null cannot be cast to non-null type kotlin.String");
                this.purCode = stringExtra6;
                Serializable serializableExtra3 = getIntent().getSerializableExtra("whatServiceRequired");
                Intrinsics.checkNotNull(serializableExtra3, "null cannot be cast to non-null type java.util.HashMap<kotlin.String?, kotlin.String?>");
                this.whatServiceRequired = (HashMap) serializableExtra3;
                cc ccVar2 = this.mBinding;
                if (ccVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    ccVar2 = null;
                }
                ccVar2.w.setText(p2().b("dl_no", "DL No. : ") + ' ' + this.dlNo);
                BioImgObjX bioImgObj = m2().getBioImgObj();
                if ((bioImgObj != null ? bioImgObj.getBiPhoto() : null) == null) {
                    cc ccVar3 = this.mBinding;
                    if (ccVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        ccVar3 = null;
                    }
                    ccVar3.k0.setVisibility(8);
                    cc ccVar4 = this.mBinding;
                    if (ccVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        ccVar4 = null;
                    }
                    ccVar4.A.setVisibility(0);
                } else {
                    cc ccVar5 = this.mBinding;
                    if (ccVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        ccVar5 = null;
                    }
                    ccVar5.k0.setVisibility(0);
                    cc ccVar6 = this.mBinding;
                    if (ccVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        ccVar6 = null;
                    }
                    ccVar6.A.setVisibility(8);
                    cc ccVar7 = this.mBinding;
                    if (ccVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        ccVar7 = null;
                    }
                    ccVar7.c0.setImageBitmap(kt6.a(m2().getBioImgObj().getBiPhoto()));
                }
                String str = this.lastEndorseRto;
                if (str == null || str.length() == 0) {
                    cc ccVar8 = this.mBinding;
                    if (ccVar8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        ccVar8 = null;
                    }
                    ccVar8.S.setText("DL No. : ");
                } else {
                    cc ccVar9 = this.mBinding;
                    if (ccVar9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        ccVar9 = null;
                    }
                    ccVar9.S.setText(this.lastEndorseRto);
                }
            } catch (Exception unused) {
            }
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
        cc ccVar10 = this.mBinding;
        if (ccVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar10 = null;
        }
        ccVar10.e0.h.setText(StringsKt__StringsKt.trim((CharSequence) String.valueOf(this.dlNo)).toString());
        cc ccVar11 = this.mBinding;
        if (ccVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar11 = null;
        }
        TextView textView = ccVar11.e0.h;
        cc ccVar12 = this.mBinding;
        if (ccVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar12 = null;
        }
        textView.setPaintFlags(ccVar12.e0.h.getPaintFlags() | 8);
        if (!Intrinsics.areEqual(B2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            cc ccVar13 = this.mBinding;
            if (ccVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                ccVar = ccVar13;
            }
            ccVar.e0.g.setText(p2().b("check_dl_serv_intern_dl_perm", "International Driving Permit"));
            return;
        }
        this.serialNo = getIntent().getIntExtra("serialNo", 0);
        Serializable serializableExtra4 = getIntent().getSerializableExtra("multiList");
        Intrinsics.checkNotNull(serializableExtra4, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
        x3((ArrayList) serializableExtra4);
        Serializable serializableExtra5 = getIntent().getSerializableExtra("listHeaderSteps");
        Intrinsics.checkNotNull(serializableExtra5, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
        t3((ArrayList) serializableExtra5);
        Serializable serializableExtra6 = getIntent().getSerializableExtra("COA");
        Intrinsics.checkNotNull(serializableExtra6, "null cannot be cast to non-null type kotlin.Boolean");
        this.COA = ((Boolean) serializableExtra6).booleanValue();
        u3(CombineServiceInterface.INSTANCE.a(this));
        this.mCombineViewModel = (fs0) new z(this, new ds0(new cs0(v2()))).a(fs0.class);
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics maximumWindowMetrics = getWindowManager().getMaximumWindowMetrics();
            Intrinsics.checkNotNullExpressionValue(maximumWindowMetrics, "getMaximumWindowMetrics(...)");
            Rect bounds = maximumWindowMetrics.getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
            this.widthPixels = bounds.right;
        } else {
            this.widthPixels = getResources().getDisplayMetrics().widthPixels;
        }
        if (u2().size() > 1) {
            cc ccVar14 = this.mBinding;
            if (ccVar14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ccVar14 = null;
            }
            ccVar14.f0.setLayoutManager(new LinearLayoutManager(this, 0, false));
            ArrayList arrayListU2 = u2();
            int i = this.serialNo;
            int i2 = this.widthPixels;
            String strB = p2().b("check_dl_serv_replacement_dl", "Replacement of DL");
            Intrinsics.checkNotNull(strB);
            k76 k76Var = new k76(arrayListU2, this, i, i2, strB);
            cc ccVar15 = this.mBinding;
            if (ccVar15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ccVar15 = null;
            }
            ccVar15.f0.setAdapter(k76Var);
        }
        if (u2().size() == 1) {
            cc ccVar16 = this.mBinding;
            if (ccVar16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ccVar16 = null;
            }
            ccVar16.e0.g.setText((CharSequence) u2().get(0));
            cc ccVar17 = this.mBinding;
            if (ccVar17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ccVar17 = null;
            }
            ccVar17.e0.f.setVisibility(8);
        } else {
            cc ccVar18 = this.mBinding;
            if (ccVar18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ccVar18 = null;
            }
            TextView textView2 = ccVar18.e0.g;
            String strB2 = p2().b("dl_services", getString(R.string.dl_services));
            Intrinsics.checkNotNull(strB2);
            textView2.setText(strB2);
            cc ccVar19 = this.mBinding;
            if (ccVar19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ccVar19 = null;
            }
            ccVar19.e0.f.setVisibility(8);
            cc ccVar20 = this.mBinding;
            if (ccVar20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ccVar20 = null;
            }
            TextView textView3 = ccVar20.e0.g;
            cc ccVar21 = this.mBinding;
            if (ccVar21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ccVar21 = null;
            }
            textView3.setPaintFlags(ccVar21.e0.g.getPaintFlags() | 8);
        }
        if (this.serialNo == z2().size()) {
            cc ccVar22 = this.mBinding;
            if (ccVar22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                ccVar = ccVar22;
            }
            ccVar.T.setText(p2().b("vahan_btn_submit", "Submit"));
            return;
        }
        cc ccVar23 = this.mBinding;
        if (ccVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            ccVar = ccVar23;
        }
        ccVar.T.setText(p2().b("btn_dl_serv_next", "Next"));
    }

    private final void F2() {
        b91 b91Var = (b91) new z(this).a(b91.class);
        this.viewModel = b91Var;
        cc ccVar = null;
        if (b91Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            b91Var = null;
        }
        b91Var.m();
        b91 b91Var2 = this.viewModel;
        if (b91Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            b91Var2 = null;
        }
        b91Var2.k().g(this, new h(new b()));
        b91 b91Var3 = this.viewModel;
        if (b91Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            b91Var3 = null;
        }
        b91Var3.l();
        b91 b91Var4 = this.viewModel;
        if (b91Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            b91Var4 = null;
        }
        b91Var4.l();
        b91 b91Var5 = this.viewModel;
        if (b91Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            b91Var5 = null;
        }
        b91Var5.j().g(this, new h(new c()));
        b91 b91Var6 = this.viewModel;
        if (b91Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            b91Var6 = null;
        }
        b91Var6.i().g(this, new h(new d()));
        cc ccVar2 = this.mBinding;
        if (ccVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar2 = null;
        }
        ccVar2.d0.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.g81
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLIdpActivity.G2(this.a, view);
            }
        });
        cc ccVar3 = this.mBinding;
        if (ccVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            ccVar = ccVar3;
        }
        ccVar.d0.c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.h81
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLIdpActivity.H2(view);
            }
        });
    }

    public static final void G2(DLIdpActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void H2(View view) {
    }

    private final void J2() {
        cc ccVar = this.mBinding;
        cc ccVar2 = null;
        if (ccVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar = null;
        }
        ccVar.j0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.v81
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLIdpActivity.X2(this.a, view);
            }
        });
        cc ccVar3 = this.mBinding;
        if (ccVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar3 = null;
        }
        ccVar3.E.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.y81
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLIdpActivity.Y2(this.a, view);
            }
        });
        cc ccVar4 = this.mBinding;
        if (ccVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar4 = null;
        }
        ccVar4.H.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.z81
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLIdpActivity.K2(this.a, view);
            }
        });
        cc ccVar5 = this.mBinding;
        if (ccVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar5 = null;
        }
        ccVar5.C.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.a91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLIdpActivity.L2(this.a, view);
            }
        });
        cc ccVar6 = this.mBinding;
        if (ccVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar6 = null;
        }
        ccVar6.F.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.a81
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLIdpActivity.M2(this.a, view);
            }
        });
        cc ccVar7 = this.mBinding;
        if (ccVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar7 = null;
        }
        ccVar7.G.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.b81
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLIdpActivity.N2(this.a, view);
            }
        });
        cc ccVar8 = this.mBinding;
        if (ccVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar8 = null;
        }
        ccVar8.Z.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.zepto.c81
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                DLIdpActivity.O2(this.a, radioGroup, i);
            }
        });
        cc ccVar9 = this.mBinding;
        if (ccVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar9 = null;
        }
        ccVar9.a0.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.zepto.d81
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                DLIdpActivity.P2(this.a, radioGroup, i);
            }
        });
        cc ccVar10 = this.mBinding;
        if (ccVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar10 = null;
        }
        ccVar10.h0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.e81
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLIdpActivity.Q2(this.a, view);
            }
        });
        cc ccVar11 = this.mBinding;
        if (ccVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar11 = null;
        }
        ccVar11.L.setFocusable(false);
        cc ccVar12 = this.mBinding;
        if (ccVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar12 = null;
        }
        ccVar12.L.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.f81
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLIdpActivity.S2(this.a, view);
            }
        });
        cc ccVar13 = this.mBinding;
        if (ccVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar13 = null;
        }
        ccVar13.N0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.w81
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLIdpActivity.U2(this.a, view);
            }
        });
        cc ccVar14 = this.mBinding;
        if (ccVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            ccVar2 = ccVar14;
        }
        ccVar2.T.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.x81
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLIdpActivity.W2(this.a, view);
            }
        });
    }

    public static final void K2(DLIdpActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.h3();
    }

    public static final void L2(DLIdpActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f3(2);
    }

    public static final void M2(DLIdpActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.h2(this$0.mIdpcovgradesItem);
    }

    public static final void N2(DLIdpActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.g3();
    }

    public static final void O2(DLIdpActivity this$0, RadioGroup radioGroup, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == R.id.iidp_no) {
            this$0.anyDisqualified = "N";
            this$0.D2(false);
        } else {
            if (i != R.id.iidp_yes) {
                return;
            }
            this$0.anyDisqualified = "Y";
            this$0.D2(true);
        }
    }

    public static final void P2(DLIdpActivity this$0, RadioGroup radioGroup, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == R.id.iidp_no_second) {
            this$0.anyBarred = "N";
            this$0.C2(false);
        } else {
            if (i != R.id.iidp_yes_second) {
                return;
            }
            this$0.anyBarred = "Y";
            this$0.C2(true);
        }
    }

    public static final void Q2(final DLIdpActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.p81
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                DLIdpActivity.R2(this.a, datePicker, i, i2, i3);
            }
        }, this$0.myCalendar.get(1), this$0.myCalendar.get(2), this$0.myCalendar.get(5));
        datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis());
        datePickerDialog.show();
    }

    public static final void R2(DLIdpActivity this$0, DatePicker datePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        cc ccVar = this$0.mBinding;
        if (ccVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar = null;
        }
        EditText editText = ccVar.h0;
        StringBuilder sb = new StringBuilder();
        sb.append(i3);
        sb.append('-');
        sb.append(i2 + 1);
        sb.append('-');
        sb.append(i);
        editText.setText(sb.toString());
    }

    public static final void S2(final DLIdpActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.q81
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                DLIdpActivity.T2(this.a, datePicker, i, i2, i3);
            }
        }, this$0.myCalendar.get(1), this$0.myCalendar.get(2), this$0.myCalendar.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
    }

    public static final void T2(DLIdpActivity this$0, DatePicker datePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        cc ccVar = this$0.mBinding;
        if (ccVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar = null;
        }
        EditText editText = ccVar.L;
        StringBuilder sb = new StringBuilder();
        sb.append(i3);
        sb.append('-');
        sb.append(i2 + 1);
        sb.append('-');
        sb.append(i);
        editText.setText(sb.toString());
    }

    public static final void U2(final DLIdpActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.m81
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                DLIdpActivity.V2(this.a, datePicker, i, i2, i3);
            }
        }, this$0.myCalendar.get(1), this$0.myCalendar.get(2), this$0.myCalendar.get(5));
        datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis());
        datePickerDialog.show();
    }

    public static final void V2(DLIdpActivity this$0, DatePicker datePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        cc ccVar = this$0.mBinding;
        if (ccVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar = null;
        }
        EditText editText = ccVar.N0;
        StringBuilder sb = new StringBuilder();
        sb.append(i3);
        sb.append('-');
        sb.append(i2 + 1);
        sb.append('-');
        sb.append(i);
        editText.setText(sb.toString());
    }

    public static final void W2(DLIdpActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.I2()) {
            this$0.i3(this$0, this$0.p2().b("label_want_to_proceed", this$0.getString(R.string.are_you_want_to_proceed)));
        }
    }

    public static final void X2(DLIdpActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        cc ccVar = this$0.mBinding;
        cc ccVar2 = null;
        if (ccVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar = null;
        }
        ccVar.x(Boolean.TRUE);
        cc ccVar3 = this$0.mBinding;
        if (ccVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            ccVar2 = ccVar3;
        }
        ccVar2.k();
    }

    public static final void Y2(DLIdpActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f3(1);
    }

    public static final void Z2(DLIdpActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void a3(DLIdpActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) DlServiceDetailsActivity.class);
            intent.putExtra("DL", this$0.dlNo);
            intent.putExtra("dob", this$0.dob);
            intent.putExtra("DLDetails", this$0.m2());
            intent.putExtra("Mobile_no", this$0.mobile_no);
            intent.putExtra("lastEndorsedRTO", this$0.lastEndorseRto);
            intent.putExtra("lastEndorsedState", this$0.lastEndorseState);
            intent.putExtra("lastEndorsedRTOCode", this$0.lastEndorseRTOCode);
            intent.putExtra("lastEndorseStateCode", this$0.lastEndorseStateCode);
            intent.putExtra("whatServiceRequired", this$0.whatServiceRequired);
            if (Intrinsics.areEqual(this$0.B2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", this$0.z2());
            }
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final void b3(DLIdpActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(this$0.B2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                if (this$0.u2().size() > 1) {
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
                    textView.setText(this$0.p2().b("btn_ok", "OK"));
                    ((TextView) viewFindViewById5).setText(this$0.p2().b("title_dl_services", "Driving Licence Services"));
                    ((ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.i81
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            DLIdpActivity.c3(dialog, view2);
                        }
                    });
                    int size = this$0.u2().size();
                    String str = "";
                    int i = 0;
                    String string = "";
                    while (i < size) {
                        str = str + ((String) this$0.u2().get(i)) + '\n';
                        StringBuilder sb = new StringBuilder();
                        sb.append(string);
                        i++;
                        sb.append(i);
                        sb.append(".\n");
                        string = sb.toString();
                    }
                    textView2.setText(str);
                    textView3.setText(string);
                    textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.j81
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            DLIdpActivity.d3(dialog, view2);
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
    public static final void c3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void e3(DLIdpActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) DlServiceDetailsActivity.class);
            intent.putExtra("DL", this$0.dlNo);
            intent.putExtra("dob", this$0.dob);
            intent.putExtra("DLDetails", this$0.m2());
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.ArrayList] */
    private final void g2() {
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
        cc ccVar = this.mBinding;
        cc ccVar2 = null;
        if (ccVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar = null;
        }
        ccVar.m0.setAdapter((SpinnerAdapter) oqVar);
        int size = ((ArrayList) objectRef.element).size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) B2().a()).toString(), StringsKt__StringsKt.trim((CharSequence) ((AppCatPojo) ((ArrayList) objectRef.element).get(i)).getAppCode()).toString())) {
                cc ccVar3 = this.mBinding;
                if (ccVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    ccVar3 = null;
                }
                ccVar3.m0.setSelection(i);
            } else {
                i++;
            }
        }
        cc ccVar4 = this.mBinding;
        if (ccVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar4 = null;
        }
        ccVar4.m0.setOnItemSelectedListener(new a(objectRef));
        if (StringsKt__StringsJVMKt.equals$default(this.bioRecGenesis, "S", false, 2, null)) {
            cc ccVar5 = this.mBinding;
            if (ccVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                ccVar2 = ccVar5;
            }
            ccVar2.m0.setEnabled(true);
            return;
        }
        if (this.appCategory.equals("0")) {
            cc ccVar6 = this.mBinding;
            if (ccVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                ccVar2 = ccVar6;
            }
            ccVar2.m0.setEnabled(true);
            return;
        }
        cc ccVar7 = this.mBinding;
        if (ccVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            ccVar2 = ccVar7;
        }
        ccVar2.m0.setEnabled(false);
    }

    public static final void i2(Dialog d2, DLIdpActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        StringBuilder sb = new StringBuilder();
        for (String str : this$0.covList) {
            sb.append(str);
            if (!Intrinsics.areEqual(str, this$0.covList.get(r1.size() - 1))) {
                sb.append(",");
            }
        }
        cc ccVar = null;
        if (this$0.covList.size() > 0) {
            cc ccVar2 = this$0.mBinding;
            if (ccVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                ccVar = ccVar2;
            }
            ccVar.F.setText(sb.toString());
            return;
        }
        cc ccVar3 = this$0.mBinding;
        if (ccVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            ccVar = ccVar3;
        }
        ccVar.F.setText("Select Cov");
    }

    private final void i3(Context context, String message) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirmation_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_proceed);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.pop_up_cancel);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById4).setText(p2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(p2().b("radio_dl_serv_yes", "Yes"));
        textView2.setText(p2().b("radio_dl_serv_no", "No"));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.n81
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLIdpActivity.j3(dialog, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.o81
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLIdpActivity.k3(this.a, dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j2(DLIdpActivity this$0, Ref.ObjectRef adapter, Dialog d2, View view) {
        cc ccVar;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adapter, "$adapter");
        Intrinsics.checkNotNullParameter(d2, "$d");
        this$0.covList.clear();
        this$0.covsCd.clear();
        ArrayList arrayList2 = this$0.mIdpcovgradesItem;
        Intrinsics.checkNotNull(arrayList2);
        int size = arrayList2.size();
        int i = 0;
        while (true) {
            ccVar = null;
            if (i >= size) {
                break;
            }
            ArrayList arrayList3 = this$0.mIdpcovgradesItem;
            Intrinsics.checkNotNull(arrayList3);
            Object obj = arrayList3.get(i);
            Intrinsics.checkNotNull(obj);
            if (((IdpcovgradesItem) obj).getStatus() && (arrayList = this$0.mIdpcovgradesItem) != null) {
                Intrinsics.checkNotNull(arrayList);
                IdpcovgradesItem idpcovgradesItem = (IdpcovgradesItem) arrayList.get(i);
                String idpCovgrdCd = idpcovgradesItem != null ? idpcovgradesItem.getIdpCovgrdCd() : null;
                ArrayList arrayList4 = this$0.mIdpcovgradesItem;
                Intrinsics.checkNotNull(arrayList4);
                IdpcovgradesItem idpcovgradesItem2 = (IdpcovgradesItem) arrayList4.get(i);
            }
            i++;
        }
        cc ccVar2 = this$0.mBinding;
        if (ccVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            ccVar = ccVar2;
        }
        ccVar.F.setText("Select Cov");
        ((com.nic.mparivahan.dlservices.ui.idp.a) adapter.element).E(this$0.mIdpcovgradesItem);
        d2.dismiss();
        this$0.h2(this$0.mIdpcovgradesItem);
    }

    public static final void j3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void k3(DLIdpActivity this$0, Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d2, "$d");
        cc ccVar = this$0.mBinding;
        b91 b91Var = null;
        if (ccVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar = null;
        }
        ccVar.T.c(true);
        if (StringsKt__StringsJVMKt.equals$default(this$0.bioRecGenesis, "S", false, 2, null) && StringsKt__StringsJVMKt.equals$default(this$0.allowAddrChangeAtDlservReqst, "Y", false, 2, null)) {
            Intrinsics.areEqual(this$0.B2().g(), "Y");
            IdpGenSubmit idpGenSubmitP3 = this$0.p3();
            b91 b91Var2 = this$0.viewModel;
            if (b91Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                b91Var = b91Var2;
            }
            b91Var.h(idpGenSubmitP3);
        } else {
            Intrinsics.areEqual(this$0.B2().g(), "Y");
            IdpSubmitRequest idpSubmitRequestO3 = this$0.o3();
            b91 b91Var3 = this$0.viewModel;
            if (b91Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                b91Var = b91Var3;
            }
            b91Var.g(idpSubmitRequestO3);
        }
        d2.dismiss();
    }

    public static final void m3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: renamed from: A2, reason: from getter */
    public final String getPurCode() {
        return this.purCode;
    }

    public final wl5 B2() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final void C2(boolean isBarred) {
        cc ccVar = null;
        if (isBarred) {
            cc ccVar2 = this.mBinding;
            if (ccVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                ccVar = ccVar2;
            }
            ccVar.D.setVisibility(0);
            return;
        }
        cc ccVar3 = this.mBinding;
        if (ccVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar3 = null;
        }
        ccVar3.D.setVisibility(8);
        cc ccVar4 = this.mBinding;
        if (ccVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            ccVar = ccVar4;
        }
        ccVar.D.setText("");
    }

    public final void D2(boolean isDisq) {
        cc ccVar = null;
        if (isDisq) {
            cc ccVar2 = this.mBinding;
            if (ccVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                ccVar = ccVar2;
            }
            ccVar.B.setVisibility(0);
            return;
        }
        cc ccVar3 = this.mBinding;
        if (ccVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar3 = null;
        }
        ccVar3.B.setVisibility(8);
        cc ccVar4 = this.mBinding;
        if (ccVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            ccVar = ccVar4;
        }
        ccVar.B.setText("");
    }

    public final boolean I2() {
        cc ccVar = null;
        if (this.appCategory.equals("0")) {
            String strB = p2().b("label_app_category", getString(R.string.sel_app_category));
            cc ccVar2 = this.mBinding;
            if (ccVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                ccVar = ccVar2;
            }
            w1(strB, ccVar.m());
            return false;
        }
        cc ccVar3 = this.mBinding;
        if (ccVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar3 = null;
        }
        Editable text = ccVar3.U.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0) {
            String strB2 = p2().b("edit_dl_serv_enter_birth_plac", getString(R.string.enter_birth_place));
            cc ccVar4 = this.mBinding;
            if (ccVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                ccVar = ccVar4;
            }
            w1(strB2, ccVar.m());
            return false;
        }
        cc ccVar5 = this.mBinding;
        if (ccVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar5 = null;
        }
        Editable text2 = ccVar5.E.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        if (text2.length() == 0) {
            String strB3 = p2().b("birth_country", getString(R.string.sel_birth_con));
            cc ccVar6 = this.mBinding;
            if (ccVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                ccVar = ccVar6;
            }
            w1(strB3, ccVar.m());
            return false;
        }
        cc ccVar7 = this.mBinding;
        if (ccVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar7 = null;
        }
        Editable text3 = ccVar7.g0.getText();
        Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
        if (text3.length() == 0) {
            String strB4 = p2().b("edit_dl_serv_enter_pass_no", getString(R.string.enter_passport));
            cc ccVar8 = this.mBinding;
            if (ccVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                ccVar = ccVar8;
            }
            w1(strB4, ccVar.m());
            return false;
        }
        cc ccVar9 = this.mBinding;
        if (ccVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar9 = null;
        }
        Editable text4 = ccVar9.h0.getText();
        Intrinsics.checkNotNullExpressionValue(text4, "getText(...)");
        if (text4.length() == 0) {
            String strB5 = p2().b("edit_dl_serv_selc_pass_valid", getString(R.string.enter_passport_val));
            cc ccVar10 = this.mBinding;
            if (ccVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                ccVar = ccVar10;
            }
            w1(strB5, ccVar.m());
            return false;
        }
        cc ccVar11 = this.mBinding;
        if (ccVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar11 = null;
        }
        Editable text5 = ccVar11.H.getText();
        Intrinsics.checkNotNullExpressionValue(text5, "getText(...)");
        if (text5.length() == 0) {
            String strB6 = p2().b("edit_dl_serv_selc_country", getString(R.string.select_country));
            cc ccVar12 = this.mBinding;
            if (ccVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                ccVar = ccVar12;
            }
            w1(strB6, ccVar.m());
            return false;
        }
        cc ccVar13 = this.mBinding;
        if (ccVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar13 = null;
        }
        Editable text6 = ccVar13.F.getText();
        Intrinsics.checkNotNullExpressionValue(text6, "getText(...)");
        if (text6.length() != 0) {
            cc ccVar14 = this.mBinding;
            if (ccVar14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ccVar14 = null;
            }
            if (!StringsKt__StringsJVMKt.equals(StringsKt__StringsKt.trim((CharSequence) ccVar14.F.getText().toString()).toString(), "Select Cov", true)) {
                if (StringsKt__StringsJVMKt.equals(B2().d(), "true", true)) {
                    this.appliedIdpFromIndianEmb = "Y";
                } else {
                    this.appliedIdpFromIndianEmb = "N";
                }
                if (StringsKt__StringsJVMKt.equals(this.appliedIdpFromIndianEmb, "Y", true)) {
                    cc ccVar15 = this.mBinding;
                    if (ccVar15 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        ccVar15 = null;
                    }
                    Editable text7 = ccVar15.Q.getText();
                    Intrinsics.checkNotNullExpressionValue(text7, "getText(...)");
                    if (text7.length() == 0) {
                        String strB7 = p2().b("edit_dl_serv_enter_ind_embas_name", getString(R.string.enter_indian_amb));
                        cc ccVar16 = this.mBinding;
                        if (ccVar16 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        } else {
                            ccVar = ccVar16;
                        }
                        w1(strB7, ccVar.m());
                        return false;
                    }
                    cc ccVar17 = this.mBinding;
                    if (ccVar17 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        ccVar17 = null;
                    }
                    Editable text8 = ccVar17.R.getText();
                    Intrinsics.checkNotNullExpressionValue(text8, "getText(...)");
                    if (text8.length() == 0) {
                        String strB8 = p2().b("edit_dl_serv_enter_embas_place", getString(R.string.enter_indian_amb_place));
                        cc ccVar18 = this.mBinding;
                        if (ccVar18 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        } else {
                            ccVar = ccVar18;
                        }
                        w1(strB8, ccVar.m());
                        return false;
                    }
                    cc ccVar19 = this.mBinding;
                    if (ccVar19 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        ccVar19 = null;
                    }
                    Editable text9 = ccVar19.O.getText();
                    Intrinsics.checkNotNullExpressionValue(text9, "getText(...)");
                    if (text9.length() == 0) {
                        String strB9 = p2().b("edit_dl_serv_enter_fore_mob_no", getString(R.string.enter_indian_amb_number));
                        cc ccVar20 = this.mBinding;
                        if (ccVar20 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        } else {
                            ccVar = ccVar20;
                        }
                        w1(strB9, ccVar.m());
                        return false;
                    }
                    cc ccVar21 = this.mBinding;
                    if (ccVar21 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        ccVar21 = null;
                    }
                    Editable text10 = ccVar21.M.getText();
                    Intrinsics.checkNotNullExpressionValue(text10, "getText(...)");
                    if (text10.length() == 0) {
                        String strB10 = p2().b("enter_email_id", getString(R.string.enter_email));
                        cc ccVar22 = this.mBinding;
                        if (ccVar22 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        } else {
                            ccVar = ccVar22;
                        }
                        w1(strB10, ccVar.m());
                        return false;
                    }
                    cc ccVar23 = this.mBinding;
                    if (ccVar23 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        ccVar23 = null;
                    }
                    Editable text11 = ccVar23.L.getText();
                    Intrinsics.checkNotNullExpressionValue(text11, "getText(...)");
                    if (text11.length() == 0) {
                        String strB11 = p2().b("edit_dl_serv_date_verif_embass", getString(R.string.enter_ver_date));
                        cc ccVar24 = this.mBinding;
                        if (ccVar24 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        } else {
                            ccVar = ccVar24;
                        }
                        w1(strB11, ccVar.m());
                        return false;
                    }
                    cc ccVar25 = this.mBinding;
                    if (ccVar25 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        ccVar25 = null;
                    }
                    Editable text12 = ccVar25.N.getText();
                    Intrinsics.checkNotNullExpressionValue(text12, "getText(...)");
                    if (text12.length() == 0) {
                        String strB12 = p2().b("edit_dl_serv_embsy_endor_no", getString(R.string.enter_ver_end));
                        cc ccVar26 = this.mBinding;
                        if (ccVar26 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        } else {
                            ccVar = ccVar26;
                        }
                        w1(strB12, ccVar.m());
                        return false;
                    }
                    cc ccVar27 = this.mBinding;
                    if (ccVar27 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        ccVar27 = null;
                    }
                    Editable text13 = ccVar27.C.getText();
                    Intrinsics.checkNotNullExpressionValue(text13, "getText(...)");
                    if (text13.length() == 0) {
                        String strB13 = p2().b("edit_dl_serv_idp_applied_from", getString(R.string.applied_from));
                        cc ccVar28 = this.mBinding;
                        if (ccVar28 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        } else {
                            ccVar = ccVar28;
                        }
                        w1(strB13, ccVar.m());
                        return false;
                    }
                    cc ccVar29 = this.mBinding;
                    if (ccVar29 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        ccVar29 = null;
                    }
                    Editable text14 = ccVar29.I.getText();
                    Intrinsics.checkNotNullExpressionValue(text14, "getText(...)");
                    if (text14.length() == 0) {
                        String strB14 = p2().b("edit_dl_serv_enter_addr", getString(R.string.enter_address));
                        cc ccVar30 = this.mBinding;
                        if (ccVar30 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        } else {
                            ccVar = ccVar30;
                        }
                        w1(strB14, ccVar.m());
                        return false;
                    }
                    cc ccVar31 = this.mBinding;
                    if (ccVar31 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        ccVar31 = null;
                    }
                    Editable text15 = ccVar31.P.getText();
                    Intrinsics.checkNotNullExpressionValue(text15, "getText(...)");
                    if (text15.length() == 0) {
                        String strB15 = p2().b("edit_dl_serv_enter_pincode", getString(R.string.enter_pincode));
                        cc ccVar32 = this.mBinding;
                        if (ccVar32 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        } else {
                            ccVar = ccVar32;
                        }
                        w1(strB15, ccVar.m());
                        return false;
                    }
                }
                if (this.anyDisqualified.equals("Y")) {
                    cc ccVar33 = this.mBinding;
                    if (ccVar33 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        ccVar33 = null;
                    }
                    if (String.valueOf(ccVar33.B.getText()).length() == 0) {
                        String strB16 = p2().b("disqualified_reason", "");
                        cc ccVar34 = this.mBinding;
                        if (ccVar34 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        } else {
                            ccVar = ccVar34;
                        }
                        w1(strB16, ccVar.m());
                        return false;
                    }
                }
                if (this.anyBarred.equals("Y")) {
                    cc ccVar35 = this.mBinding;
                    if (ccVar35 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        ccVar35 = null;
                    }
                    if (String.valueOf(ccVar35.D.getText()).length() == 0) {
                        String strB17 = p2().b("barred_reason", getString(R.string.barr_reason));
                        cc ccVar36 = this.mBinding;
                        if (ccVar36 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        } else {
                            ccVar = ccVar36;
                        }
                        w1(strB17, ccVar.m());
                        return false;
                    }
                }
                return true;
            }
        }
        String strB18 = p2().b("edit_dl_serv_selc_cov_grade", getString(R.string.select_cov_val));
        cc ccVar37 = this.mBinding;
        if (ccVar37 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            ccVar = ccVar37;
        }
        w1(strB18, ccVar.m());
        return false;
    }

    public final void f3(int forBirthOrChooseNation) {
        d86 d86VarA = d86.INSTANCE.a("Select Nation", this.alllistName);
        d86VarA.k2(I0(), "NationPicker");
        d86VarA.n2(new e(forBirthOrChooseNation, this));
    }

    public final void g3() {
        d86 d86VarA = d86.INSTANCE.a("List of Restricted Nation", this.restrictList);
        d86VarA.k2(I0(), "RestrictedNationPicker");
        d86VarA.n2(new f());
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [T, com.nic.mparivahan.dlservices.ui.idp.a] */
    public final void h2(ArrayList idpcovgradesItems) {
        try {
            final Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.cov_dialog);
            Window window = dialog.getWindow();
            Intrinsics.checkNotNull(window);
            window.setBackgroundDrawable(new ColorDrawable(-1));
            View viewFindViewById = dialog.findViewById(R.id.cov_recycler);
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            RecyclerView recyclerView = (RecyclerView) viewFindViewById;
            View viewFindViewById2 = dialog.findViewById(R.id.cov_ok);
            Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
            View viewFindViewById3 = dialog.findViewById(R.id.cov_cancel);
            Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(null);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? aVar = new com.nic.mparivahan.dlservices.ui.idp.a(idpcovgradesItems, this, this);
            objectRef.element = aVar;
            recyclerView.setAdapter((RecyclerView.h) aVar);
            ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.r81
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DLIdpActivity.i2(dialog, this, view);
                }
            });
            ((TextView) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.s81
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DLIdpActivity.j2(this.a, objectRef, dialog, view);
                }
            });
            dialog.show();
        } catch (Exception unused) {
        }
    }

    public final void h3() {
        d86 d86VarA = d86.INSTANCE.a("Select Nation", this.listsName);
        d86VarA.k2(I0(), "NationPicker");
        d86VarA.n2(new g());
    }

    @Override // com.nic.mparivahan.dlservices.ui.idp.a.InterfaceC0061a
    public void j(int position, boolean clickAble) {
        try {
            ArrayList arrayList = this.covsCd;
            ArrayList arrayList2 = this.mIdpcovgradesItem;
            Intrinsics.checkNotNull(arrayList2);
            Object obj = arrayList2.get(position);
            Intrinsics.checkNotNull(obj);
            String idpCovgrdCd = ((IdpcovgradesItem) obj).getIdpCovgrdCd();
            Intrinsics.checkNotNull(idpCovgrdCd);
            if (arrayList.contains(StringsKt__StringsKt.trim((CharSequence) idpCovgrdCd).toString())) {
                ArrayList arrayList3 = this.covsCd;
                ArrayList arrayList4 = this.mIdpcovgradesItem;
                Intrinsics.checkNotNull(arrayList4);
                Object obj2 = arrayList4.get(position);
                Intrinsics.checkNotNull(obj2);
                String idpCovgrdCd2 = ((IdpcovgradesItem) obj2).getIdpCovgrdCd();
                Intrinsics.checkNotNull(idpCovgrdCd2);
                arrayList3.remove(StringsKt__StringsKt.trim((CharSequence) idpCovgrdCd2).toString());
            } else {
                ArrayList arrayList5 = this.covsCd;
                ArrayList arrayList6 = this.mIdpcovgradesItem;
                Intrinsics.checkNotNull(arrayList6);
                Object obj3 = arrayList6.get(position);
                Intrinsics.checkNotNull(obj3);
                String idpCovgrdCd3 = ((IdpcovgradesItem) obj3).getIdpCovgrdCd();
                Intrinsics.checkNotNull(idpCovgrdCd3);
                arrayList5.add(StringsKt__StringsKt.trim((CharSequence) idpCovgrdCd3).toString());
            }
            ArrayList arrayList7 = this.covList;
            ArrayList arrayList8 = this.mIdpcovgradesItem;
            Intrinsics.checkNotNull(arrayList8);
            Object obj4 = arrayList8.get(position);
            Intrinsics.checkNotNull(obj4);
            String idpcovgrdDesc = ((IdpcovgradesItem) obj4).getIdpcovgrdDesc();
            Intrinsics.checkNotNull(idpcovgrdDesc);
            if (arrayList7.contains(StringsKt__StringsKt.trim((CharSequence) idpcovgrdDesc).toString())) {
                ArrayList arrayList9 = this.covList;
                ArrayList arrayList10 = this.mIdpcovgradesItem;
                Intrinsics.checkNotNull(arrayList10);
                Object obj5 = arrayList10.get(position);
                Intrinsics.checkNotNull(obj5);
                String idpcovgrdDesc2 = ((IdpcovgradesItem) obj5).getIdpcovgrdDesc();
                Intrinsics.checkNotNull(idpcovgrdDesc2);
                arrayList9.remove(StringsKt__StringsKt.trim((CharSequence) idpcovgrdDesc2).toString());
                return;
            }
            ArrayList arrayList11 = this.covList;
            ArrayList arrayList12 = this.mIdpcovgradesItem;
            Intrinsics.checkNotNull(arrayList12);
            Object obj6 = arrayList12.get(position);
            Intrinsics.checkNotNull(obj6);
            String idpcovgrdDesc3 = ((IdpcovgradesItem) obj6).getIdpcovgrdDesc();
            Intrinsics.checkNotNull(idpcovgrdDesc3);
            arrayList11.add(StringsKt__StringsKt.trim((CharSequence) idpcovgrdDesc3).toString());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: k2, reason: from getter */
    public final ArrayList getAlllistCode() {
        return this.alllistCode;
    }

    public final void l2() {
        List<IdpcovgradesItem> list = this.mCovList;
        if (list != null) {
            for (IdpcovgradesItem idpcovgradesItem : list) {
                if (CollectionsKt___CollectionsKt.contains(this.covList, idpcovgradesItem != null ? idpcovgradesItem.getIdpcovgrdDesc() : null)) {
                    ArrayList arrayList = this.covsCd;
                    StringBuilder sb = new StringBuilder();
                    sb.append("");
                    sb.append(StringsKt__StringsKt.trim((CharSequence) String.valueOf(idpcovgradesItem != null ? idpcovgradesItem.getIdpCovgrdCd() : null)).toString());
                    arrayList.add(sb.toString());
                }
            }
        }
    }

    public final void l3(Context context, String message) {
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.l81
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLIdpActivity.m3(dialog, view);
            }
        });
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(p2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(p2().b("btn_ok", "OK"));
        dialog.show();
    }

    public final DldetobjX m2() {
        DldetobjX dldetobjX = this.dlDetails;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlDetails");
        return null;
    }

    /* JADX INFO: renamed from: n2, reason: from getter */
    public final String getDlNo() {
        return this.dlNo;
    }

    public final void n3(List nationsMaster) {
        Intrinsics.checkNotNull(nationsMaster);
        if (!(!nationsMaster.isEmpty()) || nationsMaster.size() <= 0) {
            return;
        }
        IntRange indices = CollectionsKt__CollectionsKt.getIndices(nationsMaster);
        Intrinsics.checkNotNull(indices);
        int first = indices.getFirst();
        int last = indices.getLast();
        if (first > last) {
            return;
        }
        while (true) {
            try {
                ArrayList arrayList = this.alllistName;
                Object obj = nationsMaster.get(first);
                Intrinsics.checkNotNull(obj);
                String nationName = ((GetNationsCodeItem) obj).getNationName();
                Intrinsics.checkNotNull(nationName);
                arrayList.add(nationName);
                ArrayList arrayList2 = this.alllistCode;
                Object obj2 = nationsMaster.get(first);
                Intrinsics.checkNotNull(obj2);
                String nationCode = ((GetNationsCodeItem) obj2).getNationCode();
                Intrinsics.checkNotNull(nationCode);
                arrayList2.add(nationCode);
                Object obj3 = nationsMaster.get(first);
                Intrinsics.checkNotNull(obj3);
                if (StringsKt__StringsJVMKt.equals$default(((GetNationsCodeItem) obj3).getNatIdpIssuable(), "Y", false, 2, null)) {
                    ArrayList arrayList3 = this.listsName;
                    Object obj4 = nationsMaster.get(first);
                    Intrinsics.checkNotNull(obj4);
                    String nationName2 = ((GetNationsCodeItem) obj4).getNationName();
                    Intrinsics.checkNotNull(nationName2);
                    arrayList3.add(nationName2);
                    ArrayList arrayList4 = this.listCode;
                    Object obj5 = nationsMaster.get(first);
                    Intrinsics.checkNotNull(obj5);
                    String nationCode2 = ((GetNationsCodeItem) obj5).getNationCode();
                    Intrinsics.checkNotNull(nationCode2);
                    arrayList4.add(nationCode2);
                } else {
                    ArrayList arrayList5 = this.restrictList;
                    Object obj6 = nationsMaster.get(first);
                    Intrinsics.checkNotNull(obj6);
                    String nationName3 = ((GetNationsCodeItem) obj6).getNationName();
                    Intrinsics.checkNotNull(nationName3);
                    arrayList5.add(nationName3);
                }
            } catch (Exception unused) {
            }
            if (first == last) {
                return;
            } else {
                first++;
            }
        }
    }

    /* JADX INFO: renamed from: o2, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    public final IdpSubmitRequest o3() {
        selectDLlist selectdllist = new selectDLlist("Issue International Driving Permit");
        new JSONArray();
        ArrayList arrayList = new ArrayList();
        l2();
        Iterator it = this.covsCd.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(this.dlNo)).toString();
        String strValueOf = String.valueOf(this.dob);
        String string2 = StringsKt__StringsKt.trim((CharSequence) String.valueOf(this.lastEndorseRTOCode)).toString();
        String str = this.brithCountryCd;
        String str2 = this.selectedCountryCd;
        cc ccVar = this.mBinding;
        if (ccVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar = null;
        }
        String string3 = ccVar.g0.getText().toString();
        cc ccVar2 = this.mBinding;
        if (ccVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar2 = null;
        }
        String string4 = ccVar2.h0.getText().toString();
        cc ccVar3 = this.mBinding;
        if (ccVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar3 = null;
        }
        String string5 = ccVar3.M0.getText().toString();
        cc ccVar4 = this.mBinding;
        if (ccVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar4 = null;
        }
        String string6 = ccVar4.N0.getText().toString();
        String str3 = this.selectedCountryCd;
        String str4 = this.anyBarred;
        cc ccVar5 = this.mBinding;
        if (ccVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar5 = null;
        }
        String strValueOf2 = String.valueOf(ccVar5.D.getText());
        String str5 = this.anyDisqualified;
        cc ccVar6 = this.mBinding;
        if (ccVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar6 = null;
        }
        String strValueOf3 = String.valueOf(ccVar6.B.getText());
        cc ccVar7 = this.mBinding;
        if (ccVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar7 = null;
        }
        String string7 = ccVar7.I.getText().toString();
        cc ccVar8 = this.mBinding;
        if (ccVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar8 = null;
        }
        String string8 = ccVar8.J.getText().toString();
        cc ccVar9 = this.mBinding;
        if (ccVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar9 = null;
        }
        String string9 = ccVar9.K.getText().toString();
        cc ccVar10 = this.mBinding;
        if (ccVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar10 = null;
        }
        String string10 = ccVar10.P.getText().toString();
        cc ccVar11 = this.mBinding;
        if (ccVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar11 = null;
        }
        String string11 = ccVar11.O.getText().toString();
        cc ccVar12 = this.mBinding;
        if (ccVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar12 = null;
        }
        String string12 = ccVar12.M.getText().toString();
        String str6 = this.appliedIdpFromIndianEmb;
        cc ccVar13 = this.mBinding;
        if (ccVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar13 = null;
        }
        String string13 = ccVar13.Q.getText().toString();
        cc ccVar14 = this.mBinding;
        if (ccVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar14 = null;
        }
        String string14 = ccVar14.R.getText().toString();
        cc ccVar15 = this.mBinding;
        if (ccVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar15 = null;
        }
        String string15 = ccVar15.L.getText().toString();
        cc ccVar16 = this.mBinding;
        if (ccVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar16 = null;
        }
        String string16 = ccVar16.N.getText().toString();
        String str7 = this.idpAppliedFromCd;
        String str8 = this.mobile_no;
        Intrinsics.checkNotNull(str8);
        return new IdpSubmitRequest(string, strValueOf, string2, selectdllist, str, str2, string3, string4, string5, string6, arrayList, str3, str4, strValueOf2, str5, strValueOf3, string7, string8, string9, string10, string11, string12, str6, string13, string14, string15, string16, str7, "sakalaHR", "975867c068a4e3e043058b5aaeebbeb5", "10.248.213.244", "SarathiMobileService", str8, "NA", "N", "NA", "NA");
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lq7 lq7VarF = kd1.f(this, R.layout.activity_issue_international_permit);
        Intrinsics.checkNotNullExpressionValue(lq7VarF, "setContentView(...)");
        this.mBinding = (cc) lq7VarF;
        y3(new wl5(this));
        s3(new wa3(this));
        ta3.a aVar = ta3.a;
        cc ccVar = this.mBinding;
        cc ccVar2 = null;
        if (ccVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar = null;
        }
        aVar.a1(this, ccVar);
        w3(new ws6(this));
        if (Intrinsics.areEqual(B2().d(), "true")) {
            cc ccVar3 = this.mBinding;
            if (ccVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ccVar3 = null;
            }
            ccVar3.y.setVisibility(0);
        } else {
            cc ccVar4 = this.mBinding;
            if (ccVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ccVar4 = null;
            }
            ccVar4.y.setVisibility(8);
        }
        E2();
        F2();
        J2();
        cc ccVar5 = this.mBinding;
        if (ccVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar5 = null;
        }
        ccVar5.e0.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.z71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLIdpActivity.Z2(this.a, view);
            }
        });
        cc ccVar6 = this.mBinding;
        if (ccVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar6 = null;
        }
        ccVar6.e0.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.k81
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLIdpActivity.a3(this.a, view);
            }
        });
        cc ccVar7 = this.mBinding;
        if (ccVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar7 = null;
        }
        ccVar7.e0.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.t81
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLIdpActivity.b3(this.a, view);
            }
        });
        cc ccVar8 = this.mBinding;
        if (ccVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar8 = null;
        }
        TextView textView = ccVar8.L0;
        cc ccVar9 = this.mBinding;
        if (ccVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar9 = null;
        }
        textView.setPaintFlags(ccVar9.L0.getPaintFlags() | 8);
        cc ccVar10 = this.mBinding;
        if (ccVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar10 = null;
        }
        ccVar10.L0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.u81
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DLIdpActivity.e3(this.a, view);
            }
        });
        g2();
        BioImgObjX bioImgObj = m2().getBioImgObj();
        String biPhoto = bioImgObj != null ? bioImgObj.getBiPhoto() : null;
        if (biPhoto == null || biPhoto.length() == 0) {
            cc ccVar11 = this.mBinding;
            if (ccVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ccVar11 = null;
            }
            ccVar11.d0.f.setVisibility(4);
        } else {
            cc ccVar12 = this.mBinding;
            if (ccVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ccVar12 = null;
            }
            ccVar12.d0.f.setVisibility(0);
            cc ccVar13 = this.mBinding;
            if (ccVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                ccVar13 = null;
            }
            ImageView imageView = ccVar13.d0.b;
            BioImgObjX bioImgObj2 = m2().getBioImgObj();
            imageView.setImageBitmap(kt6.a(bioImgObj2 != null ? bioImgObj2.getBiPhoto() : null));
        }
        cc ccVar14 = this.mBinding;
        if (ccVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar14 = null;
        }
        ccVar14.e0.e.setVisibility(8);
        cc ccVar15 = this.mBinding;
        if (ccVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar15 = null;
        }
        ccVar15.d0.g.setText(B2().k());
        cc ccVar16 = this.mBinding;
        if (ccVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar16 = null;
        }
        ccVar16.L0.setVisibility(0);
        cc ccVar17 = this.mBinding;
        if (ccVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            ccVar2 = ccVar17;
        }
        ccVar2.w.setVisibility(0);
    }

    public final wa3 p2() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final IdpGenSubmit p3() {
        selectDLlist selectdllist = new selectDLlist("Issue International Driving Permit");
        new JSONArray();
        ArrayList arrayList = new ArrayList();
        l2();
        Iterator it = this.covsCd.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(this.dlNo)).toString();
        String strValueOf = String.valueOf(this.dob);
        String string2 = StringsKt__StringsKt.trim((CharSequence) String.valueOf(this.lastEndorseRTOCode)).toString();
        String str = this.brithCountryCd;
        String str2 = this.selectedCountryCd;
        cc ccVar = this.mBinding;
        if (ccVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar = null;
        }
        String string3 = ccVar.g0.getText().toString();
        cc ccVar2 = this.mBinding;
        if (ccVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar2 = null;
        }
        String string4 = ccVar2.h0.getText().toString();
        cc ccVar3 = this.mBinding;
        if (ccVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar3 = null;
        }
        String string5 = ccVar3.M0.getText().toString();
        cc ccVar4 = this.mBinding;
        if (ccVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar4 = null;
        }
        String string6 = ccVar4.N0.getText().toString();
        String str3 = this.selectedCountryCd;
        String str4 = this.anyBarred;
        cc ccVar5 = this.mBinding;
        if (ccVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar5 = null;
        }
        String strValueOf2 = String.valueOf(ccVar5.D.getText());
        String str5 = this.anyDisqualified;
        cc ccVar6 = this.mBinding;
        if (ccVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar6 = null;
        }
        String strValueOf3 = String.valueOf(ccVar6.B.getText());
        cc ccVar7 = this.mBinding;
        if (ccVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar7 = null;
        }
        String string7 = ccVar7.I.getText().toString();
        cc ccVar8 = this.mBinding;
        if (ccVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar8 = null;
        }
        String string8 = ccVar8.J.getText().toString();
        cc ccVar9 = this.mBinding;
        if (ccVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar9 = null;
        }
        String string9 = ccVar9.K.getText().toString();
        cc ccVar10 = this.mBinding;
        if (ccVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar10 = null;
        }
        String string10 = ccVar10.P.getText().toString();
        cc ccVar11 = this.mBinding;
        if (ccVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar11 = null;
        }
        String string11 = ccVar11.O.getText().toString();
        cc ccVar12 = this.mBinding;
        if (ccVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar12 = null;
        }
        String string12 = ccVar12.M.getText().toString();
        String str6 = this.appliedIdpFromIndianEmb;
        cc ccVar13 = this.mBinding;
        if (ccVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar13 = null;
        }
        String string13 = ccVar13.Q.getText().toString();
        cc ccVar14 = this.mBinding;
        if (ccVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar14 = null;
        }
        String string14 = ccVar14.R.getText().toString();
        cc ccVar15 = this.mBinding;
        if (ccVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar15 = null;
        }
        String string15 = ccVar15.L.getText().toString();
        cc ccVar16 = this.mBinding;
        if (ccVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            ccVar16 = null;
        }
        String string16 = ccVar16.N.getText().toString();
        String str7 = this.idpAppliedFromCd;
        String str8 = this.presHouseNo;
        Intrinsics.checkNotNull(str8);
        String str9 = this.presStreet;
        Intrinsics.checkNotNull(str9);
        String str10 = this.presLocation;
        Intrinsics.checkNotNull(str10);
        String str11 = this.presVillageOrTown;
        Intrinsics.checkNotNull(str11);
        String str12 = this.presSubDistrict;
        Intrinsics.checkNotNull(str12);
        String str13 = this.presDistrict;
        Intrinsics.checkNotNull(str13);
        String str14 = this.presState;
        Intrinsics.checkNotNull(str14);
        String str15 = this.presPincode;
        Intrinsics.checkNotNull(str15);
        String str16 = this.perHouseNo;
        Intrinsics.checkNotNull(str16);
        String str17 = this.perStreet;
        Intrinsics.checkNotNull(str17);
        String str18 = this.perLocation;
        Intrinsics.checkNotNull(str18);
        String str19 = this.permVillageOrTown;
        Intrinsics.checkNotNull(str19);
        String str20 = this.perSubDistrict;
        Intrinsics.checkNotNull(str20);
        String str21 = this.perDistrict;
        Intrinsics.checkNotNull(str21);
        String str22 = this.perState;
        Intrinsics.checkNotNull(str22);
        String str23 = this.perPinCode;
        Intrinsics.checkNotNull(str23);
        String str24 = this.mobile_no;
        Intrinsics.checkNotNull(str24);
        return new IdpGenSubmit(string, strValueOf, string2, selectdllist, str, str2, string3, string4, string5, string6, arrayList, str3, str4, strValueOf2, str5, strValueOf3, string7, string8, string9, string10, string11, string12, str6, string13, string14, string15, string16, str7, "sakalaHR", "975867c068a4e3e043058b5aaeebbeb5", "10.248.213.244", "SarathiMobileService", str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, "NA", "N", "NA", "NA");
    }

    /* JADX INFO: renamed from: q2, reason: from getter */
    public final String getLastEndorseRto() {
        return this.lastEndorseRto;
    }

    public final void q3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appCategory = str;
    }

    /* JADX INFO: renamed from: r2, reason: from getter */
    public final String getLastEndorseState() {
        return this.lastEndorseState;
    }

    public final void r3(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dlDetails = dldetobjX;
    }

    /* JADX INFO: renamed from: s2, reason: from getter */
    public final String getLastEndorseStateCode() {
        return this.lastEndorseStateCode;
    }

    public final void s3(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    /* JADX INFO: renamed from: t2, reason: from getter */
    public final ArrayList getListCode() {
        return this.listCode;
    }

    public final void t3(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.listHeaderSteps = arrayList;
    }

    public final ArrayList u2() {
        ArrayList arrayList = this.listHeaderSteps;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("listHeaderSteps");
        return null;
    }

    public final void u3(CombineServiceInterface combineServiceInterface) {
        Intrinsics.checkNotNullParameter(combineServiceInterface, "<set-?>");
        this.mCombineServiceInterface = combineServiceInterface;
    }

    public final CombineServiceInterface v2() {
        CombineServiceInterface combineServiceInterface = this.mCombineServiceInterface;
        if (combineServiceInterface != null) {
            return combineServiceInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mCombineServiceInterface");
        return null;
    }

    public final void v3(ArrayList arrayList) {
        this.mIdpcovgradesItem = arrayList;
    }

    /* JADX INFO: renamed from: w2, reason: from getter */
    public final ArrayList getMIdpcovgradesItem() {
        return this.mIdpcovgradesItem;
    }

    public final void w3(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.mSessionmanger = ws6Var;
    }

    public final ws6 x2() {
        ws6 ws6Var = this.mSessionmanger;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSessionmanger");
        return null;
    }

    public final void x3(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.multiListName = arrayList;
    }

    /* JADX INFO: renamed from: y2, reason: from getter */
    public final String getMobile_no() {
        return this.mobile_no;
    }

    public final void y3(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final ArrayList z2() {
        ArrayList arrayList = this.multiListName;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiListName");
        return null;
    }
}
