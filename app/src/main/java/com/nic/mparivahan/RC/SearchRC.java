package com.nic.mparivahan.RC;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.provider.Settings;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.z;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.gson.Gson;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Account.Model.State;
import com.nic.mparivahan.Account.Model.StateMaster;
import com.nic.mparivahan.Account.SignService;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dl.SearchDL;
import com.nic.mparivahan.PushNotification.NaxpToKenService;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.CitizenDocInfoX;
import com.nic.mparivahan.RC.Model.CitzValidDoc;
import com.nic.mparivahan.RC.Model.GetVirtualDocDetails;
import com.nic.mparivahan.RC.Model.ImpoundRcSuccessModel;
import com.nic.mparivahan.RC.Model.MparCitizenDocInfo;
import com.nic.mparivahan.RC.Model.NrvDetails;
import com.nic.mparivahan.RC.Model.RcModelsDet;
import com.nic.mparivahan.RC.Model.ValidateRcSuccess;
import com.nic.mparivahan.RC.RcInterface.AllIndiaPermit;
import com.nic.mparivahan.RC.RcInterface.RcImpoundService;
import com.nic.mparivahan.RC.RcInterface.RcService;
import com.nic.mparivahan.RC.SearchRC;
import com.nic.mparivahan.VahanServices.VahanModel.GetStateCode;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.zepto.a26;
import com.zepto.a55;
import com.zepto.b55;
import com.zepto.br4;
import com.zepto.c26;
import com.zepto.co;
import com.zepto.cr4;
import com.zepto.dg;
import com.zepto.dl4;
import com.zepto.gd1;
import com.zepto.hz0;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.n35;
import com.zepto.o45;
import com.zepto.p26;
import com.zepto.p45;
import com.zepto.pq;
import com.zepto.q45;
import com.zepto.s45;
import com.zepto.ta3;
import com.zepto.tb0;
import com.zepto.va3;
import com.zepto.wa3;
import com.zepto.ws6;
import com.zepto.xq4;
import com.zepto.yy0;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\bB\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\br\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\t¢\u0006\u0006\b\u009e\u0003\u0010\u009f\u0003J\b\u0010\u0004\u001a\u00020\u0003H\u0003J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0015J\u001a\u0010\r\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u000e\u001a\u00020\u0003H\u0014J\u001a\u0010\u000f\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ*\u0010\u0013\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000bJ\u0010\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0003H\u0016J\u0012\u0010\u001c\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u001d\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\u001e\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010M\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010U\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010]\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010a\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010X\u001a\u0004\b_\u0010Z\"\u0004\b`\u0010\\R\"\u0010h\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010l\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010c\u001a\u0004\bj\u0010e\"\u0004\bk\u0010gR\"\u0010p\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bm\u0010c\u001a\u0004\bn\u0010e\"\u0004\bo\u0010gR\"\u0010t\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010c\u001a\u0004\br\u0010e\"\u0004\bs\u0010gR\"\u0010x\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bu\u0010c\u001a\u0004\bv\u0010e\"\u0004\bw\u0010gR\"\u0010|\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\by\u0010c\u001a\u0004\bz\u0010e\"\u0004\b{\u0010gR#\u0010\u0080\u0001\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b}\u0010c\u001a\u0004\b~\u0010e\"\u0004\b\u007f\u0010gR&\u0010\u0084\u0001\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010c\u001a\u0005\b\u0082\u0001\u0010e\"\u0005\b\u0083\u0001\u0010gR&\u0010\u0088\u0001\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010c\u001a\u0005\b\u0086\u0001\u0010e\"\u0005\b\u0087\u0001\u0010gR&\u0010\u008c\u0001\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010c\u001a\u0005\b\u008a\u0001\u0010e\"\u0005\b\u008b\u0001\u0010gR&\u0010\u0090\u0001\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010c\u001a\u0005\b\u008e\u0001\u0010e\"\u0005\b\u008f\u0001\u0010gR&\u0010\u0094\u0001\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010c\u001a\u0005\b\u0092\u0001\u0010e\"\u0005\b\u0093\u0001\u0010gR&\u0010\u0098\u0001\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0095\u0001\u0010c\u001a\u0005\b\u0096\u0001\u0010e\"\u0005\b\u0097\u0001\u0010gR&\u0010\u009c\u0001\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0099\u0001\u0010c\u001a\u0005\b\u009a\u0001\u0010e\"\u0005\b\u009b\u0001\u0010gR&\u0010 \u0001\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009d\u0001\u0010c\u001a\u0005\b\u009e\u0001\u0010e\"\u0005\b\u009f\u0001\u0010gR&\u0010¤\u0001\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¡\u0001\u0010X\u001a\u0005\b¢\u0001\u0010Z\"\u0005\b£\u0001\u0010\\R*\u0010¬\u0001\u001a\u00030¥\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R&\u0010°\u0001\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u00ad\u0001\u0010X\u001a\u0005\b®\u0001\u0010Z\"\u0005\b¯\u0001\u0010\\R&\u0010´\u0001\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b±\u0001\u0010X\u001a\u0005\b²\u0001\u0010Z\"\u0005\b³\u0001\u0010\\R&\u0010¸\u0001\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bµ\u0001\u0010X\u001a\u0005\b¶\u0001\u0010Z\"\u0005\b·\u0001\u0010\\R!\u0010½\u0001\u001a\n\u0012\u0005\u0012\u00030º\u00010¹\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R*\u0010Ä\u0001\u001a\u00030º\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R&\u0010È\u0001\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÅ\u0001\u0010c\u001a\u0005\bÆ\u0001\u0010e\"\u0005\bÇ\u0001\u0010gR&\u0010Ì\u0001\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÉ\u0001\u0010c\u001a\u0005\bÊ\u0001\u0010e\"\u0005\bË\u0001\u0010gR*\u0010Ô\u0001\u001a\u00030Í\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÎ\u0001\u0010Ï\u0001\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\"\u0006\bÒ\u0001\u0010Ó\u0001R*\u0010Ü\u0001\u001a\u00030Õ\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÖ\u0001\u0010×\u0001\u001a\u0006\bØ\u0001\u0010Ù\u0001\"\u0006\bÚ\u0001\u0010Û\u0001R)\u0010ã\u0001\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÝ\u0001\u0010Þ\u0001\u001a\u0006\bß\u0001\u0010à\u0001\"\u0006\bá\u0001\u0010â\u0001R&\u0010ç\u0001\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bä\u0001\u0010X\u001a\u0005\bå\u0001\u0010Z\"\u0005\bæ\u0001\u0010\\R&\u0010ë\u0001\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bè\u0001\u0010X\u001a\u0005\bé\u0001\u0010Z\"\u0005\bê\u0001\u0010\\R&\u0010ï\u0001\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bì\u0001\u0010X\u001a\u0005\bí\u0001\u0010Z\"\u0005\bî\u0001\u0010\\R&\u0010ó\u0001\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bð\u0001\u0010X\u001a\u0005\bñ\u0001\u0010Z\"\u0005\bò\u0001\u0010\\R&\u0010÷\u0001\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bô\u0001\u0010c\u001a\u0005\bõ\u0001\u0010e\"\u0005\bö\u0001\u0010gR&\u0010û\u0001\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bø\u0001\u0010c\u001a\u0005\bù\u0001\u0010e\"\u0005\bú\u0001\u0010gR)\u0010\u0082\u0002\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bü\u0001\u0010ý\u0001\u001a\u0006\bþ\u0001\u0010ÿ\u0001\"\u0006\b\u0080\u0002\u0010\u0081\u0002R)\u0010\u0086\u0002\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0083\u0002\u0010ý\u0001\u001a\u0006\b\u0084\u0002\u0010ÿ\u0001\"\u0006\b\u0085\u0002\u0010\u0081\u0002R&\u0010\u008a\u0002\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0087\u0002\u0010P\u001a\u0005\b\u0088\u0002\u0010R\"\u0005\b\u0089\u0002\u0010TR&\u0010\u008e\u0002\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008b\u0002\u0010P\u001a\u0005\b\u008c\u0002\u0010R\"\u0005\b\u008d\u0002\u0010TR&\u0010\u0092\u0002\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008f\u0002\u0010X\u001a\u0005\b\u0090\u0002\u0010Z\"\u0005\b\u0091\u0002\u0010\\R(\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0093\u0002\u0010ý\u0001\u001a\u0006\b\u0094\u0002\u0010ÿ\u0001\"\u0006\b\u0095\u0002\u0010\u0081\u0002R&\u0010\u0099\u0002\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0096\u0002\u0010c\u001a\u0005\b\u0097\u0002\u0010e\"\u0005\b\u0098\u0002\u0010gR&\u0010\u009d\u0002\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009a\u0002\u0010X\u001a\u0005\b\u009b\u0002\u0010Z\"\u0005\b\u009c\u0002\u0010\\R&\u0010¡\u0002\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009e\u0002\u0010X\u001a\u0005\b\u009f\u0002\u0010Z\"\u0005\b \u0002\u0010\\R&\u0010¥\u0002\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¢\u0002\u0010c\u001a\u0005\b£\u0002\u0010e\"\u0005\b¤\u0002\u0010gR&\u0010©\u0002\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¦\u0002\u0010c\u001a\u0005\b§\u0002\u0010e\"\u0005\b¨\u0002\u0010gR)\u0010\u00ad\u0002\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bª\u0002\u0010ý\u0001\u001a\u0006\b«\u0002\u0010ÿ\u0001\"\u0006\b¬\u0002\u0010\u0081\u0002R\u0018\u0010¯\u0002\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b®\u0002\u0010GR&\u0010³\u0002\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b°\u0002\u0010c\u001a\u0005\b±\u0002\u0010e\"\u0005\b²\u0002\u0010gR&\u0010·\u0002\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b´\u0002\u0010X\u001a\u0005\bµ\u0002\u0010Z\"\u0005\b¶\u0002\u0010\\R&\u0010»\u0002\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¸\u0002\u0010c\u001a\u0005\b¹\u0002\u0010e\"\u0005\bº\u0002\u0010gR&\u0010¿\u0002\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¼\u0002\u0010X\u001a\u0005\b½\u0002\u0010Z\"\u0005\b¾\u0002\u0010\\R&\u0010Ã\u0002\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÀ\u0002\u0010X\u001a\u0005\bÁ\u0002\u0010Z\"\u0005\bÂ\u0002\u0010\\R)\u0010Ç\u0002\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÄ\u0002\u0010ý\u0001\u001a\u0006\bÅ\u0002\u0010ÿ\u0001\"\u0006\bÆ\u0002\u0010\u0081\u0002R\u001a\u0010Ë\u0002\u001a\u00030È\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÉ\u0002\u0010Ê\u0002R*\u0010Ó\u0002\u001a\u00030Ì\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÍ\u0002\u0010Î\u0002\u001a\u0006\bÏ\u0002\u0010Ð\u0002\"\u0006\bÑ\u0002\u0010Ò\u0002R&\u0010×\u0002\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bÔ\u0002\u0010c\u001a\u0005\bÕ\u0002\u0010e\"\u0005\bÖ\u0002\u0010gR&\u0010Û\u0002\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\bØ\u0002\u0010c\u001a\u0005\bÙ\u0002\u0010e\"\u0005\bÚ\u0002\u0010gR*\u0010ã\u0002\u001a\u00030Ü\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÝ\u0002\u0010Þ\u0002\u001a\u0006\bß\u0002\u0010à\u0002\"\u0006\bá\u0002\u0010â\u0002R\u001a\u0010ç\u0002\u001a\u00030ä\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bå\u0002\u0010æ\u0002R,\u0010ï\u0002\u001a\u0005\u0018\u00010è\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bé\u0002\u0010ê\u0002\u001a\u0006\bë\u0002\u0010ì\u0002\"\u0006\bí\u0002\u0010î\u0002R.\u0010ö\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u000b0ð\u0002j\t\u0012\u0004\u0012\u00020\u000b`ñ\u00028\u0006¢\u0006\u0010\n\u0006\bò\u0002\u0010ó\u0002\u001a\u0006\bô\u0002\u0010õ\u0002R.\u0010ù\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u000b0ð\u0002j\t\u0012\u0004\u0012\u00020\u000b`ñ\u00028\u0006¢\u0006\u0010\n\u0006\b÷\u0002\u0010ó\u0002\u001a\u0006\bø\u0002\u0010õ\u0002R*\u0010\u0081\u0003\u001a\u00030ú\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bû\u0002\u0010ü\u0002\u001a\u0006\bý\u0002\u0010þ\u0002\"\u0006\bÿ\u0002\u0010\u0080\u0003R*\u0010\u0089\u0003\u001a\u00030\u0082\u00038\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0083\u0003\u0010\u0084\u0003\u001a\u0006\b\u0085\u0003\u0010\u0086\u0003\"\u0006\b\u0087\u0003\u0010\u0088\u0003R)\u0010\u008d\u0003\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008a\u0003\u0010ý\u0001\u001a\u0006\b\u008b\u0003\u0010ÿ\u0001\"\u0006\b\u008c\u0003\u0010\u0081\u0002R)\u0010\u0091\u0003\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008e\u0003\u0010ý\u0001\u001a\u0006\b\u008f\u0003\u0010ÿ\u0001\"\u0006\b\u0090\u0003\u0010\u0081\u0002R)\u0010\u0095\u0003\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0092\u0003\u0010ý\u0001\u001a\u0006\b\u0093\u0003\u0010ÿ\u0001\"\u0006\b\u0094\u0003\u0010\u0081\u0002R*\u0010\u009d\u0003\u001a\u00030\u0096\u00038\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0097\u0003\u0010\u0098\u0003\u001a\u0006\b\u0099\u0003\u0010\u009a\u0003\"\u0006\b\u009b\u0003\u0010\u009c\u0003¨\u0006 \u0003"}, d2 = {"Lcom/nic/mparivahan/RC/SearchRC;", "Lcom/zepto/pq;", "Lcom/zepto/tb0;", "", "e2", "M1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "", "message", "B3", "onResume", "D3", "Lcom/nic/mparivahan/RC/Model/RcModelsDet;", "details", "doc_id", "N1", "Ljava/util/Date;", "startDate", "", "n3", "U1", "()Ljava/lang/Integer;", "onBackPressed", "searchNumber", "M", "x", "U4", "Lcom/zepto/a55;", "C", "Lcom/zepto/a55;", "B2", "()Lcom/zepto/a55;", "d4", "(Lcom/zepto/a55;)V", "mRcViewModel", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "D", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "A2", "()Lcom/nic/mparivahan/RC/RcInterface/RcService;", "c4", "(Lcom/nic/mparivahan/RC/RcInterface/RcService;)V", "mRcService", "Lcom/zepto/o45;", "E", "Lcom/zepto/o45;", "G2", "()Lcom/zepto/o45;", "l4", "(Lcom/zepto/o45;)V", "rcImpoundModel", "Lcom/nic/mparivahan/RC/RcInterface/RcImpoundService;", "F", "Lcom/nic/mparivahan/RC/RcInterface/RcImpoundService;", "rcImpoundService", "Lcom/nic/mparivahan/RC/RcInterface/AllIndiaPermit;", "G", "Lcom/nic/mparivahan/RC/RcInterface/AllIndiaPermit;", "permitService", "Lcom/zepto/br4;", "H", "Lcom/zepto/br4;", "H2", "()Lcom/zepto/br4;", "m4", "(Lcom/zepto/br4;)V", "rcPermitModel", "I", "Landroid/content/Context;", "z2", "()Landroid/content/Context;", "b4", "(Landroid/content/Context;)V", "mContext", "Landroid/widget/EditText;", "J", "Landroid/widget/EditText;", "d2", "()Landroid/widget/EditText;", "S3", "(Landroid/widget/EditText;)V", "etSearchRC", "Landroid/widget/LinearLayout;", "K", "Landroid/widget/LinearLayout;", "x2", "()Landroid/widget/LinearLayout;", "Z3", "(Landroid/widget/LinearLayout;)V", "llSearchRC", "L", "y2", "a4", "ll_rc", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "X2", "()Landroid/widget/TextView;", "D4", "(Landroid/widget/TextView;)V", "txtOwnerName", "N", "Q2", "w4", "title_name", "O", "getInsurance_title", "T3", "insurance_title", "P", "getPucc_title", "k4", "pucc_title", "Q", "Z2", "F4", "txtRegAuthority", "R", "d3", "J4", "txtVehicleClass", "S", "V2", "B4", "txtFuelType", "T", "c3", "I4", "txtVehicleAge", "U", "e3", "K4", "txtVeicleStatus", "V", "a3", "G4", "txtRegDate", "W", "U2", "A4", "txtFitnessUpTo", "X", "W2", "C4", "txtInsuranceUpTo", "Y", "b3", "H4", "txtTaxValidUpTo", "Z", "Y2", "E4", "txtPuccUpTo", "a0", "T2", "z4", "txtBlackListStatus", "b0", "s2", "U3", "LayoutBlackListStatus", "Landroid/app/ProgressDialog;", "c0", "Landroid/app/ProgressDialog;", "F2", "()Landroid/app/ProgressDialog;", "i4", "(Landroid/app/ProgressDialog;)V", "pDialog", "d0", "E2", "g4", "nexgenarrow", "e0", "V1", "K3", "createvirtualrc", "f0", "k3", "R4", "viewChallan", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "g0", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomSheetBehavior", "h0", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "P1", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "F3", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V", "bottom", "i0", "W1", "L3", "createvirtualrcbutton", "j0", "T1", "J3", "closebutton", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "k0", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "X1", "()Lcom/nic/mparivahan/DB/DatabaseHelper;", "M3", "(Lcom/nic/mparivahan/DB/DatabaseHelper;)V", "databaseHelper", "Lcom/zepto/ws6;", "l0", "Lcom/zepto/ws6;", "P2", "()Lcom/zepto/ws6;", "u4", "(Lcom/zepto/ws6;)V", "sessionManager", "m0", "Lcom/nic/mparivahan/RC/Model/RcModelsDet;", "I2", "()Lcom/nic/mparivahan/RC/Model/RcModelsDet;", "n4", "(Lcom/nic/mparivahan/RC/Model/RcModelsDet;)V", "rcdetails", "n0", "t2", "V3", "linear_menu_bar", "o0", "J2", "o4", "redirect_DashBoard", "p0", "K2", "p4", "redirect_Rcdashboard", "q0", "Y1", "N3", "dl_dashboard", "r0", "S1", "I3", "chassis_no_txt", "s0", "b2", "Q3", "engine_no_txt", "t0", "Ljava/lang/String;", "Q1", "()Ljava/lang/String;", "G3", "(Ljava/lang/String;)V", "chassino", "u0", "c2", "R3", "enginno", "v0", "R1", "H3", "chassis_no_et", "w0", "a2", "P3", "engine_no_et", "x0", "w2", "Y3", "llRecentRC", "y0", "Z1", "O3", "z0", "j3", "Q4", "vehicle_number", "A0", "u2", "W3", "linear_permit_number", "B0", "v2", "X3", "linear_permit_validUpto", "C0", "C2", "e4", "national_permit_no", "D0", "D2", "f4", "national_permit_no_valid_upto", "E0", "N2", "s4", "service", "F0", "isViewChallanToOpen", "G0", "f3", "L4", "txt_check_impound", "H0", "i3", "P4", "vehicleImpoundLl", "I0", "getTxt_vehicle_impound_value", "N4", "txt_vehicle_impound_value", "J0", "M2", "r4", "seizureImpoundLl", "K0", "g3", "M4", "txt_seizure_impound_value", "L0", "h3", "O4", "var_rc_value", "Lcom/zepto/dg;", "M0", "Lcom/zepto/dg;", "binding", "Lcom/zepto/wa3;", "N0", "Lcom/zepto/wa3;", "O2", "()Lcom/zepto/wa3;", "t4", "(Lcom/zepto/wa3;)V", "session", "O0", "R2", "x4", "tv_chassis_no", "P0", "S2", "y4", "tv_engine_no", "Lcom/zepto/p26;", "Q0", "Lcom/zepto/p26;", "l3", "()Lcom/zepto/p26;", "S4", "(Lcom/zepto/p26;)V", "viewModel", "Lcom/nic/mparivahan/Account/SignService;", "R0", "Lcom/nic/mparivahan/Account/SignService;", "retrofitService", "Landroid/app/Dialog;", "S0", "Landroid/app/Dialog;", "getDiloge", "()Landroid/app/Dialog;", "setDiloge", "(Landroid/app/Dialog;)V", "diloge", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "T0", "Ljava/util/ArrayList;", "r2", "()Ljava/util/ArrayList;", "impoundListtitleArray", "U0", "q2", "impoundListdescArray", "Lcom/zepto/ld7;", "V0", "Lcom/zepto/ld7;", "m3", "()Lcom/zepto/ld7;", "T4", "(Lcom/zepto/ld7;)V", "viewModelAddMob", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "W0", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "L2", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "q4", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitServiceAddMob", "X0", "getStateCode", "v4", "stateCode", "Y0", "getOffCode", "h4", "offCode", "Z0", "getMobile_no", "setMobile_no", "mobile_no", "Lcom/zepto/dl4;", "a1", "Lcom/zepto/dl4;", "getPSession", "()Lcom/zepto/dl4;", "j4", "(Lcom/zepto/dl4;)V", "pSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSearchRC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchRC.kt\ncom/nic/mparivahan/RC/SearchRC\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1604:1\n766#2:1605\n857#2,2:1606\n766#2:1608\n857#2,2:1609\n766#2:1611\n857#2,2:1612\n*S KotlinDebug\n*F\n+ 1 SearchRC.kt\ncom/nic/mparivahan/RC/SearchRC\n*L\n641#1:1605\n641#1:1606,2\n954#1:1608\n954#1:1609,2\n1302#1:1611\n1302#1:1612,2\n*E\n"})
public final class SearchRC extends pq implements tb0 {

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    public LinearLayout linear_permit_number;

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    public LinearLayout linear_permit_validUpto;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public a55 mRcViewModel;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    public TextView national_permit_no;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public RcService mRcService;

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    public TextView national_permit_no_valid_upto;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public o45 rcImpoundModel;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    public String service;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public RcImpoundService rcImpoundService;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    public int isViewChallanToOpen;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public AllIndiaPermit permitService;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    public TextView txt_check_impound;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public br4 rcPermitModel;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    public LinearLayout vehicleImpoundLl;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    public TextView txt_vehicle_impound_value;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public EditText etSearchRC;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    public LinearLayout seizureImpoundLl;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public LinearLayout llSearchRC;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    public LinearLayout txt_seizure_impound_value;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public LinearLayout ll_rc;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public String var_rc_value;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public TextView txtOwnerName;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public dg binding;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public TextView title_name;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public TextView insurance_title;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    public TextView tv_chassis_no;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public TextView pucc_title;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    public TextView tv_engine_no;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public TextView txtRegAuthority;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    public p26 viewModel;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public TextView txtVehicleClass;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    public SignService retrofitService;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public TextView txtFuelType;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    public Dialog diloge;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public TextView txtVehicleAge;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public TextView txtVeicleStatus;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public TextView txtRegDate;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    public ld7 viewModelAddMob;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public TextView txtFitnessUpTo;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    public VahanProService retrofitServiceAddMob;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public TextView txtInsuranceUpTo;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public TextView txtTaxValidUpTo;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public TextView txtPuccUpTo;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public TextView txtBlackListStatus;

    /* JADX INFO: renamed from: a1, reason: from kotlin metadata */
    public dl4 pSession;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public LinearLayout LayoutBlackListStatus;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public LinearLayout nexgenarrow;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public LinearLayout createvirtualrc;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public LinearLayout viewChallan;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public BottomSheetBehavior bottomSheetBehavior;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public CoordinatorLayout bottom;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public TextView createvirtualrcbutton;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public TextView closebutton;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public DatabaseHelper databaseHelper;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public RcModelsDet rcdetails;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public LinearLayout linear_menu_bar;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public LinearLayout redirect_DashBoard;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public LinearLayout redirect_Rcdashboard;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public LinearLayout dl_dashboard;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public TextView chassis_no_txt;

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    public TextView engine_no_txt;

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    public String chassino;

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    public String enginno;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public EditText chassis_no_et;

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    public EditText engine_no_et;

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    public LinearLayout llRecentRC;

    /* JADX INFO: renamed from: y0, reason: from kotlin metadata */
    public String doc_id;

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    public TextView vehicle_number;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    public final ArrayList impoundListtitleArray = new ArrayList();

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    public final ArrayList impoundListdescArray = new ArrayList();

    /* JADX INFO: renamed from: X0, reason: from kotlin metadata */
    public String stateCode = " ";

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    public String offCode = " ";

    /* JADX INFO: renamed from: Z0, reason: from kotlin metadata */
    public String mobile_no = " ";

    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
            if (s.toString().length() == 5) {
                SearchRC.this.a2().requestFocus();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
        }
    }

    public static final class b extends BottomSheetBehavior.g {
        public b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View bottomSheet, float f) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View bottomSheet, int i) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if (i == 3) {
                SearchRC.this.f3().setEnabled(false);
            } else {
                if (i != 4) {
                    return;
                }
                SearchRC.this.f3().setEnabled(true);
            }
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
        public final void a(ResendOtp resendOtp) {
            SearchRC.this.F2().dismiss();
            try {
                if (StringsKt__StringsJVMKt.equals(resendOtp.getStatusCode(), "AL001", true)) {
                    Toast.makeText(SearchRC.this, "We have resent the OTP to your Mobile Number", 1).show();
                } else if (gd1.a.m(resendOtp.getStatusDesc())) {
                    SearchRC.this.F2().dismiss();
                    SearchRC searchRC = SearchRC.this;
                    searchRC.D3(searchRC, "The OTP you entered is invalid, Please enter the correct OTP");
                } else {
                    Toast.makeText(SearchRC.this, resendOtp.getStatusDesc(), 1).show();
                }
            } catch (Exception unused) {
                SearchRC.this.F2().dismiss();
                SearchRC searchRC2 = SearchRC.this;
                searchRC2.D3(searchRC2, "Unable to resend the OTP, Please try after some time");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ResendOtp) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
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
            SearchRC.this.F2().dismiss();
            SearchRC searchRC = SearchRC.this;
            searchRC.D3(searchRC, "Unable to Resend the OTP, Please try after some times");
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(ImpoundRcSuccessModel impoundRcSuccessModel) {
            if (SearchRC.this.F2().isShowing()) {
                SearchRC.this.F2().dismiss();
            }
            SearchRC.this.f3().setVisibility(0);
            SearchRC.this.i3().setVisibility(8);
            SearchRC.this.M2().setVisibility(8);
            int size = impoundRcSuccessModel.getResult().size();
            for (int i = 0; i < size; i++) {
                if (StringsKt__StringsJVMKt.equals(impoundRcSuccessModel.getResult().get(i).getImpound_type(), "document", true)) {
                    SearchRC.this.M2().setVisibility(8);
                    TextView textView = new TextView(SearchRC.this);
                    textView.setTextColor(yy0.c(SearchRC.this, R.color.red_new));
                    textView.setTextSize(13.0f);
                    textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    textView.setGravity(8388613);
                    textView.setText(impoundRcSuccessModel.getResult().get(i).getDocument());
                    SearchRC.this.g3().addView(textView);
                    SearchRC.this.getImpoundListtitleArray().add(impoundRcSuccessModel.getResult().get(i).getDocument());
                    SearchRC.this.getImpoundListdescArray().add(impoundRcSuccessModel.getResult().get(i).getDoc_impound_type());
                }
                if (StringsKt__StringsJVMKt.equals(impoundRcSuccessModel.getResult().get(i).getImpound_type(), "vehicle", true)) {
                    SearchRC.this.i3().setVisibility(8);
                    SearchRC.this.getImpoundListtitleArray().add(impoundRcSuccessModel.getResult().get(i).getImpound_type());
                    SearchRC.this.getImpoundListdescArray().add("Yes");
                }
            }
            co.a aVar = co.a;
            SearchRC searchRC = SearchRC.this;
            aVar.b(searchRC, searchRC.getImpoundListtitleArray(), SearchRC.this.getImpoundListdescArray());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ImpoundRcSuccessModel) obj);
            return Unit.INSTANCE;
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
            if (SearchRC.this.F2().isShowing()) {
                SearchRC.this.F2().dismiss();
            }
            SearchRC.this.f3().setVisibility(0);
            SearchRC.this.i3().setVisibility(8);
            SearchRC.this.M2().setVisibility(8);
            SearchRC searchRC = SearchRC.this;
            searchRC.B3(searchRC, "No Vehicle or Seizure Document impound against the searched RC number.");
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
            super(1);
        }

        public final void a(RcModelsDet rcModelsDet) throws Throwable {
            SearchRC.this.y2().setVisibility(0);
            SearchRC.this.w2().setVisibility(8);
            SearchRC.this.M1();
            try {
                if (!rcModelsDet.getStatusCode().equals("NP001")) {
                    if (rcModelsDet.getStatusCode().equals("NR090")) {
                        SearchRC.this.F2().cancel();
                        SearchRC.this.y2().setVisibility(4);
                        hz0.a.Q(SearchRC.this.z2(), "Vehicle Number: " + SearchRC.this.h3() + " \n\n" + rcModelsDet.getStatusDesc(), 1);
                        return;
                    }
                    if (rcModelsDet.getStatusCode().equals("NR091")) {
                        SearchRC.this.F2().cancel();
                        SearchRC.this.y2().setVisibility(4);
                        hz0.a.Q(SearchRC.this.z2(), "Vehicle Number: " + SearchRC.this.h3() + " \n" + rcModelsDet.getStatusDesc(), 2);
                        return;
                    }
                    if (gd1.a.m(rcModelsDet.getStatusDesc())) {
                        SearchRC.this.F2().cancel();
                        SearchRC.this.y2().setVisibility(4);
                        SearchRC searchRC = SearchRC.this;
                        searchRC.D3(searchRC.z2(), "Vehicle Number: " + SearchRC.this.h3() + " \n" + rcModelsDet.getStatusDesc());
                        return;
                    }
                    SearchRC.this.F2().cancel();
                    SearchRC.this.y2().setVisibility(4);
                    SearchRC searchRC2 = SearchRC.this;
                    searchRC2.D3(searchRC2.z2(), "Vehicle Number: " + SearchRC.this.h3() + " \n" + rcModelsDet.getStatusDesc());
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("regnNo", SearchRC.this.h3());
                SearchRC.this.H2().g(jSONObject);
                if (rcModelsDet.getNrvDetails() == null) {
                    SearchRC.this.y2().setVisibility(4);
                    SearchRC searchRC3 = SearchRC.this;
                    searchRC3.D3(searchRC3.z2(), rcModelsDet.getStatusDesc());
                    return;
                }
                SearchRC.this.n4(rcModelsDet);
                if (!StringsKt__StringsKt.contains$default((CharSequence) rcModelsDet.toString(), (CharSequence) "rc_owner_name", false, 2, (Object) null) || rcModelsDet.getNrvDetails().getRc_owner_name() == null) {
                    SearchRC.this.X2().setText("NA");
                } else {
                    SearchRC.this.X2().setText(String.valueOf(rcModelsDet.getNrvDetails().getRc_owner_name()));
                    SearchRC.this.G3(String.valueOf(rcModelsDet.getNrvDetails().getRc_chasi_no()));
                    SearchRC.this.R3(String.valueOf(rcModelsDet.getNrvDetails().getRc_eng_no()));
                    SearchRC.this.j3().setText(rcModelsDet.getNrvDetails().getRc_regn_no());
                }
                if (!StringsKt__StringsKt.contains$default((CharSequence) rcModelsDet.toString(), (CharSequence) "rc_regn_dt", false, 2, (Object) null) || rcModelsDet.getNrvDetails().getRc_regn_dt() == null) {
                    SearchRC.this.a3().setText("NA");
                } else {
                    SearchRC.this.a3().setText(rcModelsDet.getNrvDetails().getRc_regn_dt());
                }
                if (!StringsKt__StringsKt.contains$default((CharSequence) rcModelsDet.toString(), (CharSequence) "rc_vh_class_desc", false, 2, (Object) null) || rcModelsDet.getNrvDetails().getRc_vh_class_desc() == null) {
                    SearchRC.this.d3().setText("NA");
                } else {
                    SearchRC.this.d3().setText(rcModelsDet.getNrvDetails().getRc_vh_class_desc());
                }
                if (!StringsKt__StringsKt.contains$default((CharSequence) rcModelsDet.toString(), (CharSequence) "rc_fuel_desc", false, 2, (Object) null) || rcModelsDet.getNrvDetails().getRc_fuel_desc() == null) {
                    SearchRC.this.V2().setText("NA");
                } else {
                    SearchRC.this.V2().setText(rcModelsDet.getNrvDetails().getRc_fuel_desc());
                }
                if (!StringsKt__StringsKt.contains$default((CharSequence) rcModelsDet.toString(), (CharSequence) "rc_regn_dt", false, 2, (Object) null) || rcModelsDet.getNrvDetails().getRc_regn_dt() == null) {
                    SearchRC.this.a3().setText("NA");
                } else {
                    SearchRC.this.a3().setText(rcModelsDet.getNrvDetails().getRc_regn_dt());
                }
                if (!StringsKt__StringsKt.contains$default((CharSequence) rcModelsDet.toString(), (CharSequence) "rc_fit_upto", false, 2, (Object) null) || rcModelsDet.getNrvDetails().getRc_fit_upto() == null) {
                    SearchRC.this.U2().setText("NA");
                } else {
                    SearchRC.this.U2().setText(rcModelsDet.getNrvDetails().getRc_fit_upto());
                }
                if (!StringsKt__StringsKt.contains$default((CharSequence) rcModelsDet.toString(), (CharSequence) "rc_insurance_upto", false, 2, (Object) null) || gd1.a.m(rcModelsDet.getNrvDetails().getRc_insurance_upto())) {
                    SearchRC.this.W2().setText("NA");
                } else if (SearchRC.this.N2().equals("INS002")) {
                    SearchRC.this.W2().setText(rcModelsDet.getNrvDetails().getRc_insurance_upto());
                    SearchRC.this.W2().setTextColor(yy0.c(SearchRC.this, R.color.wear_helmet));
                } else {
                    SearchRC.this.W2().setText(rcModelsDet.getNrvDetails().getRc_insurance_upto());
                }
                if (!StringsKt__StringsKt.contains$default((CharSequence) rcModelsDet.toString(), (CharSequence) "rc_tax_upto", false, 2, (Object) null)) {
                    dg dgVar = SearchRC.this.binding;
                    if (dgVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dgVar = null;
                    }
                    dgVar.d0.setVisibility(8);
                    SearchRC.this.b3().setText("NA");
                } else if (gd1.a.m(rcModelsDet.getNrvDetails().getRc_tax_upto())) {
                    dg dgVar2 = SearchRC.this.binding;
                    if (dgVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dgVar2 = null;
                    }
                    dgVar2.d0.setVisibility(8);
                    SearchRC.this.b3().setText("NA");
                } else {
                    SearchRC.this.b3().setText(rcModelsDet.getNrvDetails().getRc_tax_upto());
                }
                if (!StringsKt__StringsKt.contains$default((CharSequence) rcModelsDet.toString(), (CharSequence) "rc_blacklist_status", false, 2, (Object) null) || gd1.a.m(rcModelsDet.getNrvDetails().getRc_blacklist_status())) {
                    SearchRC.this.s2().setVisibility(8);
                } else {
                    SearchRC.this.s2().setVisibility(0);
                    SearchRC.this.T2().setText(rcModelsDet.getNrvDetails().getRc_blacklist_status());
                }
                if (!StringsKt__StringsKt.contains$default((CharSequence) rcModelsDet.toString(), (CharSequence) "rc_np_no", false, 2, (Object) null) || gd1.a.m(rcModelsDet.getNrvDetails().getRc_np_no()) || StringsKt__StringsJVMKt.equals(rcModelsDet.getNrvDetails().getRc_np_no(), "NA", true)) {
                    SearchRC.this.u2().setVisibility(8);
                } else {
                    SearchRC.this.C2().setText(rcModelsDet.getNrvDetails().getRc_np_no());
                }
                if (!StringsKt__StringsKt.contains$default((CharSequence) rcModelsDet.toString(), (CharSequence) "rc_permit_valid_upto", false, 2, (Object) null)) {
                    dg dgVar3 = SearchRC.this.binding;
                    if (dgVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dgVar3 = null;
                    }
                    dgVar3.w.setVisibility(8);
                } else if (gd1.a.m(rcModelsDet.getNrvDetails().getRc_permit_valid_upto())) {
                    dg dgVar4 = SearchRC.this.binding;
                    if (dgVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dgVar4 = null;
                    }
                    dgVar4.w.setVisibility(8);
                } else {
                    dg dgVar5 = SearchRC.this.binding;
                    if (dgVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dgVar5 = null;
                    }
                    dgVar5.M.setText(rcModelsDet.getNrvDetails().getRc_permit_valid_upto());
                }
                if (!StringsKt__StringsKt.contains$default((CharSequence) rcModelsDet.toString(), (CharSequence) "rc_np_upto", false, 2, (Object) null) || gd1.a.m(rcModelsDet.getNrvDetails().getRc_np_upto()) || StringsKt__StringsJVMKt.equals(rcModelsDet.getNrvDetails().getRc_np_upto(), "NA", true)) {
                    SearchRC.this.v2().setVisibility(8);
                } else {
                    SearchRC.this.D2().setText(rcModelsDet.getNrvDetails().getRc_np_upto());
                }
                if (!StringsKt__StringsKt.contains$default((CharSequence) rcModelsDet.toString(), (CharSequence) "rc_norms_desc", false, 2, (Object) null)) {
                    dg dgVar6 = SearchRC.this.binding;
                    if (dgVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dgVar6 = null;
                    }
                    dgVar6.R.setVisibility(8);
                } else if (gd1.a.m(rcModelsDet.getNrvDetails().getRc_norms_desc()) || StringsKt__StringsJVMKt.equals(rcModelsDet.getNrvDetails().getRc_norms_desc(), "NA", true)) {
                    dg dgVar7 = SearchRC.this.binding;
                    if (dgVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dgVar7 = null;
                    }
                    dgVar7.R.setVisibility(0);
                    dg dgVar8 = SearchRC.this.binding;
                    if (dgVar8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dgVar8 = null;
                    }
                    dgVar8.Q.setText("Not Available|Applicable");
                } else {
                    dg dgVar9 = SearchRC.this.binding;
                    if (dgVar9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dgVar9 = null;
                    }
                    dgVar9.Q.setText(rcModelsDet.getNrvDetails().getRc_norms_desc());
                }
                if (!StringsKt__StringsKt.contains$default((CharSequence) rcModelsDet.toString(), (CharSequence) "rc_pucc_upto", false, 2, (Object) null) || gd1.a.m(rcModelsDet.getNrvDetails().getRc_pucc_upto())) {
                    SearchRC.this.Y2().setText("NA");
                } else if (SearchRC.this.N2().equals("PUCC003")) {
                    SearchRC.this.Y2().setText(rcModelsDet.getNrvDetails().getRc_pucc_upto());
                    SearchRC.this.Y2().setTextColor(yy0.c(SearchRC.this, R.color.wear_helmet));
                } else {
                    SearchRC.this.Y2().setText(rcModelsDet.getNrvDetails().getRc_pucc_upto());
                }
                if (!StringsKt__StringsKt.contains$default((CharSequence) rcModelsDet.toString(), (CharSequence) "rc_status", false, 2, (Object) null) || rcModelsDet.getNrvDetails().getRc_status() == null) {
                    SearchRC.this.e3().setText("NA");
                } else {
                    SearchRC.this.e3().setText(rcModelsDet.getNrvDetails().getRc_status());
                    if (String.valueOf(rcModelsDet.getNrvDetails().getRc_status()).equals("Fitness Expired")) {
                        SearchRC.this.e3().setTextColor(-65536);
                    }
                }
                if (!StringsKt__StringsKt.contains$default((CharSequence) rcModelsDet.toString(), (CharSequence) "rc_financer", false, 2, (Object) null)) {
                    dg dgVar10 = SearchRC.this.binding;
                    if (dgVar10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dgVar10 = null;
                    }
                    dgVar10.q.setText("No");
                } else if (gd1.a.m(rcModelsDet.getNrvDetails().getRc_financer()) || StringsKt__StringsJVMKt.equals(rcModelsDet.getNrvDetails().getRc_norms_desc(), "No", true)) {
                    dg dgVar11 = SearchRC.this.binding;
                    if (dgVar11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dgVar11 = null;
                    }
                    dgVar11.q.setText("No");
                } else {
                    dg dgVar12 = SearchRC.this.binding;
                    if (dgVar12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dgVar12 = null;
                    }
                    dgVar12.q.setText("Yes");
                }
                if (!StringsKt__StringsKt.contains$default((CharSequence) rcModelsDet.toString(), (CharSequence) "rc_registered_at", false, 2, (Object) null) || rcModelsDet.getNrvDetails().getRc_registered_at() == null) {
                    SearchRC.this.Z2().setText("NA");
                } else {
                    SearchRC.this.Z2().setText(rcModelsDet.getNrvDetails().getRc_registered_at());
                }
                try {
                    int iN3 = SearchRC.this.n3(new SimpleDateFormat("dd-MMM-yyyy").parse(String.valueOf(rcModelsDet.getNrvDetails().getRc_regn_dt())));
                    SearchRC.this.c3().setText((iN3 / 12) + " Years  & " + (iN3 % 12) + " months");
                    if (SearchRC.this.X1().P(rcModelsDet.getNrvDetails().getRc_regn_no()) == 0) {
                        SearchRC.this.X1().S0(rcModelsDet.getNrvDetails().getRc_regn_no(), rcModelsDet.getNrvDetails().getRc_owner_name(), "RC", new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()), rcModelsDet.getNrvDetails().getRc_vh_class_desc());
                    } else {
                        SearchRC.this.X1().N0(rcModelsDet.getNrvDetails().getRc_regn_no(), new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()), rcModelsDet.getNrvDetails().getRc_owner_name());
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                SearchRC.this.v4(String.valueOf(rcModelsDet.getNrvDetails().getState_cd()));
            } catch (Exception unused) {
                SearchRC.this.F2().cancel();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((RcModelsDet) obj);
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

        public final void invoke(String str) {
            SearchRC searchRC = SearchRC.this;
            searchRC.D3(searchRC.z2(), "Vehicle Number: " + SearchRC.this.h3() + " \nTry after some time");
            SearchRC.this.F2().cancel();
        }
    }

    public static final class i extends Lambda implements Function1 {
        public i() {
            super(1);
        }

        public final void a(HashMap map) {
            SearchRC.this.F2().cancel();
            if (map != null) {
                dg dgVar = null;
                try {
                    dg dgVar2 = SearchRC.this.binding;
                    if (dgVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dgVar2 = null;
                    }
                    dgVar2.t.setVisibility(0);
                    dg dgVar3 = SearchRC.this.binding;
                    if (dgVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dgVar3 = null;
                    }
                    dgVar3.u.setVisibility(8);
                    dg dgVar4 = SearchRC.this.binding;
                    if (dgVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dgVar4 = null;
                    }
                    dgVar4.b.setText((CharSequence) map.get("permitNo"));
                    dg dgVar5 = SearchRC.this.binding;
                    if (dgVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dgVar5 = null;
                    }
                    dgVar5.e.setText((CharSequence) map.get("permitUpto"));
                } catch (Exception unused) {
                    dg dgVar6 = SearchRC.this.binding;
                    if (dgVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dgVar6 = null;
                    }
                    dgVar6.t.setVisibility(8);
                    dg dgVar7 = SearchRC.this.binding;
                    if (dgVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        dgVar = dgVar7;
                    }
                    dgVar.u.setVisibility(8);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((HashMap) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class j extends Lambda implements Function1 {
        public j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            SearchRC.this.F2().cancel();
        }
    }

    public static final class k extends Lambda implements Function1 {
        public k() {
            super(1);
        }

        public final void a(GetStateCode getStateCode) {
            if (getStateCode != null) {
                try {
                    if (gd1.a.m(getStateCode.getStateCd())) {
                        return;
                    }
                    SearchRC.this.v4(getStateCode.getStateCd());
                    SearchRC.this.h4(String.valueOf(getStateCode.getOffCd()));
                    SearchRC.this.B2().m(String.valueOf(SearchRC.this.I2().getNrvDetails().getRc_regn_no()), SearchRC.this.P2().k().toString(), SearchRC.this.R1().getText().toString(), SearchRC.this.a2().getText().toString(), SearchRC.this, hz0.a.x());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetStateCode) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class l extends Lambda implements Function1 {
        public l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            SearchRC.this.F2().dismiss();
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

    public static final void A3(SearchRC this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.D3(this$0.z2(), "Unable to create the Virtual RC, Please try after some time!");
        this$0.F2().cancel();
    }

    public static final void C3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void E3(Dialog d2, SearchRC this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        BottomSheetBehavior bottomSheetBehavior = null;
        this$0.R1().setText((CharSequence) null);
        this$0.a2().setText((CharSequence) null);
        this$0.R1().requestFocus();
        BottomSheetBehavior bottomSheetBehavior2 = this$0.bottomSheetBehavior;
        if (bottomSheetBehavior2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
            bottomSheetBehavior2 = null;
        }
        if (bottomSheetBehavior2.v0() == 3) {
            BottomSheetBehavior bottomSheetBehavior3 = this$0.bottomSheetBehavior;
            if (bottomSheetBehavior3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
            } else {
                bottomSheetBehavior = bottomSheetBehavior3;
            }
            bottomSheetBehavior.X0(4);
        }
    }

    public static final void O1(Dialog d2, SearchRC this$0, RcModelsDet details, String doc_id, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(details, "$details");
        Intrinsics.checkNotNullParameter(doc_id, "$doc_id");
        d2.dismiss();
        try {
            this$0.X1().R0(details.getNrvDetails().getRc_regn_no(), doc_id, details.getNrvDetails(), 0);
            Intent intent = new Intent(this$0, (Class<?>) VirtualRcScreen.class);
            intent.putExtra("RcNumber", details.getNrvDetails().getRc_regn_no());
            this$0.startActivity(intent);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void V4(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void e2() throws Throwable {
        View viewFindViewById = findViewById(R.id.owner_name_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        D4((TextView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.registering_auth_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        F4((TextView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.vehicle_class_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        J4((TextView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.fuel_type_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        B4((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.vehicle_age_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        I4((TextView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.rc_status_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        K4((TextView) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.registration_dt_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        G4((TextView) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.fitness_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        A4((TextView) viewFindViewById8);
        View viewFindViewById9 = findViewById(R.id.pucc_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        E4((TextView) viewFindViewById9);
        View viewFindViewById10 = findViewById(R.id.txt_rc_black_list);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        z4((TextView) viewFindViewById10);
        View viewFindViewById11 = findViewById(R.id.ll_black_list);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        U3((LinearLayout) viewFindViewById11);
        View viewFindViewById12 = findViewById(R.id.tax_txt_valid);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        H4((TextView) viewFindViewById12);
        View viewFindViewById13 = findViewById(R.id.insurance_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        C4((TextView) viewFindViewById13);
        View viewFindViewById14 = findViewById(R.id.et_search_rc);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        S3((EditText) viewFindViewById14);
        View viewFindViewById15 = findViewById(R.id.ll_search_rc);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById15, "findViewById(...)");
        Z3((LinearLayout) viewFindViewById15);
        View viewFindViewById16 = findViewById(R.id.nexgenarrow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById16, "findViewById(...)");
        g4((LinearLayout) viewFindViewById16);
        View viewFindViewById17 = findViewById(R.id.createvirtualrc);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById17, "findViewById(...)");
        K3((LinearLayout) viewFindViewById17);
        View viewFindViewById18 = findViewById(R.id.viewChallan);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById18, "findViewById(...)");
        R4((LinearLayout) viewFindViewById18);
        View viewFindViewById19 = findViewById(R.id.bottom);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById19, "findViewById(...)");
        F3((CoordinatorLayout) viewFindViewById19);
        View viewFindViewById20 = findViewById(R.id.createvirtualrcbutton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById20, "findViewById(...)");
        L3((TextView) viewFindViewById20);
        View viewFindViewById21 = findViewById(R.id.closebutton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById21, "findViewById(...)");
        J3((TextView) viewFindViewById21);
        View viewFindViewById22 = findViewById(R.id.linear_menu_bar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById22, "findViewById(...)");
        V3((LinearLayout) viewFindViewById22);
        View viewFindViewById23 = findViewById(R.id.redirect_DashBoard);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById23, "findViewById(...)");
        o4((LinearLayout) viewFindViewById23);
        View viewFindViewById24 = findViewById(R.id.redirect_Rcdashboard);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById24, "findViewById(...)");
        p4((LinearLayout) viewFindViewById24);
        View viewFindViewById25 = findViewById(R.id.dl_dashboard);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById25, "findViewById(...)");
        N3((LinearLayout) viewFindViewById25);
        View viewFindViewById26 = findViewById(R.id.chassis_no_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById26, "findViewById(...)");
        I3((TextView) viewFindViewById26);
        View viewFindViewById27 = findViewById(R.id.engine_no_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById27, "findViewById(...)");
        Q3((TextView) viewFindViewById27);
        View viewFindViewById28 = findViewById(R.id.chassis_no_et);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById28, "findViewById(...)");
        H3((EditText) viewFindViewById28);
        View viewFindViewById29 = findViewById(R.id.engine_no_et);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById29, "findViewById(...)");
        P3((EditText) viewFindViewById29);
        View viewFindViewById30 = findViewById(R.id.tv_chassi_no);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById30, "findViewById(...)");
        x4((TextView) viewFindViewById30);
        View viewFindViewById31 = findViewById(R.id.tv_engine_no);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById31, "findViewById(...)");
        y4((TextView) viewFindViewById31);
        View viewFindViewById32 = findViewById(R.id.ll_rec_search);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById32, "findViewById(...)");
        Y3((LinearLayout) viewFindViewById32);
        View viewFindViewById33 = findViewById(R.id.vehicle_number);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById33, "findViewById(...)");
        Q4((TextView) viewFindViewById33);
        View viewFindViewById34 = findViewById(R.id.linear_permit_number);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById34, "findViewById(...)");
        W3((LinearLayout) viewFindViewById34);
        View viewFindViewById35 = findViewById(R.id.linear_permit_validUpto);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById35, "findViewById(...)");
        X3((LinearLayout) viewFindViewById35);
        View viewFindViewById36 = findViewById(R.id.national_permit_no);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById36, "findViewById(...)");
        e4((TextView) viewFindViewById36);
        View viewFindViewById37 = findViewById(R.id.national_permit_no_valid_upto);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById37, "findViewById(...)");
        f4((TextView) viewFindViewById37);
        View viewFindViewById38 = findViewById(R.id.ll_rc);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById38, "findViewById(...)");
        a4((LinearLayout) viewFindViewById38);
        View viewFindViewById39 = findViewById(R.id.title_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById39, "findViewById(...)");
        w4((TextView) viewFindViewById39);
        View viewFindViewById40 = findViewById(R.id.insurance_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById40, "findViewById(...)");
        T3((TextView) viewFindViewById40);
        View viewFindViewById41 = findViewById(R.id.pucc_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById41, "findViewById(...)");
        k4((TextView) viewFindViewById41);
        View viewFindViewById42 = findViewById(R.id.txt_check_impound);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById42, "findViewById(...)");
        L4((TextView) viewFindViewById42);
        View viewFindViewById43 = findViewById(R.id.vehicleImpoundLl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById43, "findViewById(...)");
        P4((LinearLayout) viewFindViewById43);
        View viewFindViewById44 = findViewById(R.id.txt_vehicle_impound_value);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById44, "findViewById(...)");
        N4((TextView) viewFindViewById44);
        View viewFindViewById45 = findViewById(R.id.seizureImpoundLl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById45, "findViewById(...)");
        r4((LinearLayout) viewFindViewById45);
        View viewFindViewById46 = findViewById(R.id.txt_seizure_impound_value);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById46, "findViewById(...)");
        M4((LinearLayout) viewFindViewById46);
        y2().setVisibility(8);
        R2().setText(O2().b("label_challan_chassis_no", "Chassis No. ( Enter last five digits )"));
        S2().setText(O2().b("label_challan_engine_no", getString(R.string.enter_five_engine_no)));
        T1().setText(O2().b("btn_dl_serv_close", "Close"));
        E2().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pt5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchRC.f2(this.a, view);
            }
        });
        f3().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rt5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchRC.g2(this.a, view);
            }
        });
        R1().addTextChangedListener(new a());
        K2().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.st5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchRC.h2(this.a, view);
            }
        });
        Y1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tt5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchRC.i2(this.a, view);
            }
        });
        Integer numU1 = U1();
        Intrinsics.checkNotNull(numU1);
        if (numU1.intValue() > 0) {
            t2().setVisibility(8);
        } else {
            t2().setVisibility(8);
        }
        BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(P1());
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorQ0, "from(...)");
        this.bottomSheetBehavior = bottomSheetBehaviorQ0;
        if (bottomSheetBehaviorQ0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
            bottomSheetBehaviorQ0 = null;
        }
        bottomSheetBehaviorQ0.c0(new b());
        View viewFindViewById47 = findViewById(R.id.ll_rc);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById47, "findViewById(...)");
        a4((LinearLayout) viewFindViewById47);
        y2().setVisibility(4);
        W1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vt5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchRC.j2(this.a, view);
            }
        });
        J2().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wt5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchRC.k2(this.a, view);
            }
        });
        E2().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xt5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchRC.l2(this.a, view);
            }
        });
        T1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yt5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchRC.m2(this.a, view);
            }
        });
        V1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zt5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchRC.n2(this.a, view);
            }
        });
        k3().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.au5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                SearchRC.o2(this.a, view);
            }
        });
        x2().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qt5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchRC.p2(this.a, view);
            }
        });
    }

    public static final void f2(SearchRC this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void g2(SearchRC this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (this$0.F2().isShowing()) {
                this$0.F2().dismiss();
            }
            this$0.F2().show();
            String string = Settings.Secure.getString(this$0.getContentResolver(), "android_id");
            ws6 ws6Var = new ws6(this$0);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rc_no", String.valueOf(this$0.I2().getNrvDetails().getRc_regn_no()));
            jSONObject.put("did", string);
            jSONObject.put("mid", ws6Var.l());
            jSONObject.put("tid", ws6Var.e());
            jSONObject.put("recordId", Long.parseLong(ws6Var.k()));
            this$0.G2().j(jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this$0.impoundListdescArray.clear();
        this$0.impoundListtitleArray.clear();
    }

    public static final void h2(SearchRC this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) RCDashBoard.class));
        this$0.finish();
    }

    public static final void i2(SearchRC this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) SearchDL.class));
        this$0.finish();
    }

    public static final void j2(SearchRC this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.R1().getText().toString();
        String string2 = this$0.a2().getText().toString();
        if (string.length() < 5) {
            Toast.makeText(this$0.getApplicationContext(), this$0.O2().b("label_challan_valid_chassis_no", "Please enter the valid last 5 digit of chassis no."), 1).show();
            return;
        }
        if (string2.length() < 5) {
            Toast.makeText(this$0.getApplicationContext(), this$0.O2().b("label_challan_valid_engine_no", "Please enter the valid last 5 digit of engine no"), 1).show();
            return;
        }
        this$0.F2().show();
        Object objFromJson = new Gson().fromJson(new dl4(this$0).e(), (Class<Object>) StateMaster.class);
        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
        ArrayList<State> states = ((StateMaster) objFromJson).getStates();
        ArrayList arrayList = new ArrayList();
        for (Object obj : states) {
            State state = (State) obj;
            if (Intrinsics.areEqual(state.getStateCode(), this$0.stateCode) && state.isNgmp() == 2) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            this$0.B2().m(String.valueOf(this$0.I2().getNrvDetails().getRc_regn_no()), this$0.P2().k().toString(), string, string2, this$0, hz0.a.x());
        } else {
            this$0.m3().o(this$0, this$0.h3());
        }
    }

    public static final void k2(SearchRC this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void l2(SearchRC this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void m2(SearchRC this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BottomSheetBehavior bottomSheetBehavior = this$0.bottomSheetBehavior;
        BottomSheetBehavior bottomSheetBehavior2 = null;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
            bottomSheetBehavior = null;
        }
        if (bottomSheetBehavior.v0() == 3) {
            BottomSheetBehavior bottomSheetBehavior3 = this$0.bottomSheetBehavior;
            if (bottomSheetBehavior3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
            } else {
                bottomSheetBehavior2 = bottomSheetBehavior3;
            }
            bottomSheetBehavior2.X0(4);
            return;
        }
        BottomSheetBehavior bottomSheetBehavior4 = this$0.bottomSheetBehavior;
        if (bottomSheetBehavior4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
        } else {
            bottomSheetBehavior2 = bottomSheetBehavior4;
        }
        bottomSheetBehavior2.X0(3);
    }

    public static final void n2(SearchRC this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.S1().setText(this$0.Q1().subSequence(0, this$0.Q1().length() - 5));
            this$0.b2().setText(this$0.c2().subSequence(0, this$0.c2().length() - 5));
        } catch (Exception unused) {
        }
        BottomSheetBehavior bottomSheetBehavior = this$0.bottomSheetBehavior;
        BottomSheetBehavior bottomSheetBehavior2 = null;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
            bottomSheetBehavior = null;
        }
        if (bottomSheetBehavior.v0() != 3) {
            if (!this$0.X1().C0(String.valueOf(this$0.I2().getNrvDetails().getRc_regn_no())).equals("0")) {
                this$0.U4(this$0, this$0.O2().b("create_vir_rc_already", "You have already created the Virtual RC"));
                return;
            }
            String rc_status = this$0.I2().getNrvDetails().getRc_status();
            Intrinsics.checkNotNull(rc_status);
            if (StringsKt__StringsKt.contains((CharSequence) rc_status, (CharSequence) "SCRAPPED", true)) {
                this$0.U4(this$0, this$0.O2().b("scrappedkey", "Virtual RC is not allowed for scrapped vehicle"));
                return;
            }
            this$0.W1().setText(this$0.O2().b("create_vir_rc", "Create Virtual RC"));
            BottomSheetBehavior bottomSheetBehavior3 = this$0.bottomSheetBehavior;
            if (bottomSheetBehavior3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
            } else {
                bottomSheetBehavior2 = bottomSheetBehavior3;
            }
            bottomSheetBehavior2.X0(3);
            this$0.V1().setEnabled(true);
            this$0.isViewChallanToOpen = 0;
        }
    }

    public static final void o2(SearchRC this$0, View view) throws Throwable {
        String strSubstring;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.S1().setText(this$0.Q1().subSequence(0, this$0.Q1().length() - 5));
            this$0.b2().setText(this$0.c2().subSequence(0, this$0.c2().length() - 5));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        BottomSheetBehavior bottomSheetBehavior = this$0.bottomSheetBehavior;
        BottomSheetBehavior bottomSheetBehavior2 = null;
        String strSubstring2 = null;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
            bottomSheetBehavior = null;
        }
        if (bottomSheetBehavior.v0() != 3) {
            if (this$0.X1().C0(String.valueOf(this$0.I2().getNrvDetails().getRc_regn_no())).equals("0")) {
                this$0.W1().setText(this$0.O2().b("label_view_challan", "View Challan"));
                BottomSheetBehavior bottomSheetBehavior3 = this$0.bottomSheetBehavior;
                if (bottomSheetBehavior3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
                } else {
                    bottomSheetBehavior2 = bottomSheetBehavior3;
                }
                bottomSheetBehavior2.X0(3);
                this$0.k3().setEnabled(true);
                this$0.isViewChallanToOpen = 1;
                return;
            }
            NrvDetails nrvDetailsF0 = this$0.X1().F0(String.valueOf(this$0.I2().getNrvDetails().getRc_regn_no()));
            String rc_chasi_no = nrvDetailsF0.getRc_chasi_no();
            if (rc_chasi_no != null) {
                String rc_chasi_no2 = nrvDetailsF0.getRc_chasi_no();
                Integer numValueOf = rc_chasi_no2 != null ? Integer.valueOf(rc_chasi_no2.length()) : null;
                Intrinsics.checkNotNull(numValueOf);
                int iIntValue = numValueOf.intValue() - 5;
                String rc_chasi_no3 = nrvDetailsF0.getRc_chasi_no();
                Integer numValueOf2 = rc_chasi_no3 != null ? Integer.valueOf(rc_chasi_no3.length()) : null;
                Intrinsics.checkNotNull(numValueOf2);
                strSubstring = rc_chasi_no.substring(iIntValue, numValueOf2.intValue());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                strSubstring = null;
            }
            String rc_eng_no = nrvDetailsF0.getRc_eng_no();
            if (rc_eng_no != null) {
                String rc_eng_no2 = nrvDetailsF0.getRc_eng_no();
                Integer numValueOf3 = rc_eng_no2 != null ? Integer.valueOf(rc_eng_no2.length()) : null;
                Intrinsics.checkNotNull(numValueOf3);
                int iIntValue2 = numValueOf3.intValue() - 5;
                String rc_eng_no3 = nrvDetailsF0.getRc_eng_no();
                Integer numValueOf4 = rc_eng_no3 != null ? Integer.valueOf(rc_eng_no3.length()) : null;
                Intrinsics.checkNotNull(numValueOf4);
                strSubstring2 = rc_eng_no.substring(iIntValue2, numValueOf4.intValue());
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Intent intent = new Intent(this$0, (Class<?>) ViewRcChallanActivity.class);
            intent.putExtra("rcNo", String.valueOf(this$0.I2().getNrvDetails().getRc_regn_no()));
            intent.putExtra("type", "RC");
            intent.putExtra("engineNo", String.valueOf(strSubstring2));
            intent.putExtra("chassisNo", String.valueOf(strSubstring));
            this$0.startActivity(intent);
        }
    }

    public static final void o3(SearchRC this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.D3(this$0.z2(), this$0.O2().b(va3.a.L0(), "Unable to create the virtual RC, Please try after some time"));
        this$0.F2().cancel();
    }

    public static final void p2(SearchRC this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String strH3 = this$0.h3();
        if (strH3 == null || strH3.length() == 0) {
            return;
        }
        this$0.F2().show();
        this$0.B2().N(this$0.d2().getText().toString(), this$0.P2().k(), this$0);
    }

    public static final void p3(SearchRC this$0, ValidateRcSuccess validateRcSuccess) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!StringsKt__StringsJVMKt.equals(validateRcSuccess.getStatusCode(), "NP001", true)) {
            this$0.F2().dismiss();
            Toast.makeText(this$0.getApplicationContext(), validateRcSuccess.getStatusDesc(), 1).show();
            return;
        }
        if (this$0.isViewChallanToOpen != 0) {
            this$0.F2().dismiss();
            Intent intent = new Intent(this$0, (Class<?>) ViewRcChallanActivity.class);
            intent.putExtra("rcNo", String.valueOf(this$0.I2().getNrvDetails().getRc_regn_no()));
            intent.putExtra("type", "RC");
            intent.putExtra("engineNo", this$0.a2().getText().toString());
            intent.putExtra("chassisNo", this$0.R1().getText().toString());
            this$0.startActivity(intent);
            return;
        }
        Object objFromJson = new Gson().fromJson(new dl4(this$0).e(), (Class<Object>) StateMaster.class);
        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
        ArrayList<State> states = ((StateMaster) objFromJson).getStates();
        ArrayList arrayList = new ArrayList();
        for (Object obj : states) {
            State state = (State) obj;
            if (Intrinsics.areEqual(state.getStateCode(), this$0.stateCode) && state.isNgmp() == 2) {
                arrayList.add(obj);
            }
        }
        this$0.l3().I(this$0, new ws6(this$0).l(), 2);
        if (!arrayList.isEmpty()) {
            this$0.m3().A0(this$0, this$0.h3(), this$0.stateCode, this$0.R1().getText().toString(), this$0.offCode);
        } else {
            this$0.l3().I(this$0, new ws6(this$0).l(), 2);
        }
    }

    public static final void q3(SearchRC this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.F2().dismiss();
        Toast.makeText(this$0.getApplicationContext(), "Unable to create the virtual Rc, Please try after sometime!", 1).show();
    }

    public static final void r3(SearchRC this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (gd1.a.m(str)) {
                this$0.F2().dismiss();
                n35.a.i(this$0, new wa3(this$0).b("validateMobile", this$0.getString(R.string.validate1)));
            } else {
                this$0.mobile_no = str.toString();
                this$0.l3().I(this$0, this$0.mobile_no, 1);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void s3(SearchRC this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.F2().dismiss();
        if (StringsKt__StringsJVMKt.equals(str, "Error", true)) {
            Toast.makeText(this$0.getApplicationContext(), "Unable to create the virtual Rc, Please try after sometime!", 1).show();
        } else {
            n35.a.i(this$0, new wa3(this$0).b("validateMobile", this$0.getString(R.string.validate1)));
        }
    }

    public static final void t3(SearchRC this$0, SendOtpResult sendOtpResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.F2().dismiss();
            if (!StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL001", true)) {
                if (gd1.a.m(sendOtpResult.getStatusDesc())) {
                    return;
                }
                this$0.D3(this$0, sendOtpResult.getStatusDesc());
                return;
            }
            ws6 ws6Var = new ws6(this$0);
            Object objFromJson = new Gson().fromJson(new dl4(this$0).e(), (Class<Object>) StateMaster.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            ArrayList<State> states = ((StateMaster) objFromJson).getStates();
            ArrayList arrayList = new ArrayList();
            for (Object obj : states) {
                State state = (State) obj;
                if (Intrinsics.areEqual(state.getStateCode(), this$0.stateCode) && state.isNgmp() == 2) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                this$0.mobile_no = ws6Var.l();
            }
            this$0.diloge = n35.a.m(this$0, this$0, this$0.mobile_no, this$0.l3(), String.valueOf(sendOtpResult.getRecordId()), String.valueOf(this$0.I2().getNrvDetails().getRc_regn_no()), "RC", " ", this$0.F2());
        } catch (Exception unused) {
            this$0.F2().dismiss();
        }
    }

    public static final void u3(String str) {
    }

    public static final void v3(SearchRC this$0, CitzValidDoc citzValidDoc) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (!StringsKt__StringsJVMKt.equals$default(citzValidDoc.getStatusCode(), "AL001", false, 2, null)) {
                if (this$0.F2().isShowing()) {
                    this$0.F2().dismiss();
                }
                Toast.makeText(this$0, citzValidDoc.getStatusDesc(), 1).show();
                return;
            }
            gd1.a aVar = gd1.a;
            if (aVar.m(citzValidDoc.getParam())) {
                Dialog dialog = this$0.diloge;
                if (dialog != null) {
                    Intrinsics.checkNotNull(dialog);
                    dialog.dismiss();
                    CitizenDocInfoX citizenDocInfo = citzValidDoc.getCitizenDocInfo();
                    this$0.O3(String.valueOf(citizenDocInfo != null ? citizenDocInfo.getDocId() : null));
                    this$0.B2().X(this$0.P2().k(), this$0.z2());
                    return;
                }
                return;
            }
            if (this$0.F2().isShowing()) {
                this$0.F2().dismiss();
            }
            if (aVar.m(citzValidDoc.getParam())) {
                if (this$0.F2().isShowing()) {
                    this$0.F2().dismiss();
                }
                this$0.D3(this$0.z2(), this$0.O2().b(va3.a.L0(), "Unable to create the virtual RC, Please try after some time"));
            } else {
                Dialog dialog2 = this$0.diloge;
                if (dialog2 != null) {
                    Intrinsics.checkNotNull(dialog2);
                    dialog2.dismiss();
                }
                this$0.D3(this$0, citzValidDoc.getParam());
            }
        } catch (Exception unused) {
            if (this$0.F2().isShowing()) {
                this$0.F2().dismiss();
            }
            Dialog dialog3 = this$0.diloge;
            if (dialog3 != null) {
                Intrinsics.checkNotNull(dialog3);
                dialog3.dismiss();
            }
            this$0.D3(this$0.z2(), this$0.O2().b(va3.a.L0(), "Unable to create the virtual RC, Please try after some time"));
        }
    }

    public static final void w3(SearchRC this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.F2().dismiss();
        Dialog dialog = this$0.diloge;
        if (dialog != null) {
            Intrinsics.checkNotNull(dialog);
            dialog.dismiss();
        }
        this$0.D3(this$0.z2(), this$0.O2().b(va3.a.L0(), "Unable to create the virtual RC, Please try after some time"));
    }

    public static final void x3(SearchRC this$0, GetVirtualDocDetails getVirtualDocDetails) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.F2().dismiss();
        if (StringsKt__StringsJVMKt.equals(getVirtualDocDetails.getStatusCode(), "VTLD005", true)) {
            this$0.D3(this$0.z2(), getVirtualDocDetails.getStatusDesc().toString());
            return;
        }
        if (!StringsKt__StringsJVMKt.equals(getVirtualDocDetails.getStatusCode(), "VTLD001", true)) {
            if (gd1.a.m(getVirtualDocDetails.getStatusDesc())) {
                this$0.F2().dismiss();
                this$0.D3(this$0.z2(), "Unable to create the Virtual RC, Please try after some time!");
                return;
            } else {
                this$0.F2().dismiss();
                this$0.D3(this$0.z2(), getVirtualDocDetails.getStatusDesc().toString());
                return;
            }
        }
        BottomSheetBehavior bottomSheetBehavior = this$0.bottomSheetBehavior;
        if (bottomSheetBehavior == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
            bottomSheetBehavior = null;
        }
        if (bottomSheetBehavior.v0() == 3) {
            BottomSheetBehavior bottomSheetBehavior2 = this$0.bottomSheetBehavior;
            if (bottomSheetBehavior2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bottomSheetBehavior");
                bottomSheetBehavior2 = null;
            }
            bottomSheetBehavior2.X0(4);
        }
        ArrayList<MparCitizenDocInfo> mparCitizenDocInfo = getVirtualDocDetails.getMparCitizenDocInfo();
        int size = mparCitizenDocInfo.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            String string = StringsKt__StringsKt.trim((CharSequence) mparCitizenDocInfo.get(i2).getDocNumber().toString()).toString();
            String rc_regn_no = this$0.I2().getNrvDetails().getRc_regn_no();
            if (StringsKt__StringsJVMKt.equals(string, rc_regn_no != null ? StringsKt__StringsKt.trim((CharSequence) rc_regn_no).toString() : null, true)) {
                this$0.O3(String.valueOf(mparCitizenDocInfo.get(i2).getDocId()));
                break;
            }
            i2++;
        }
        if (gd1.a.m(this$0.Z1())) {
            return;
        }
        this$0.B2().o(this$0.P2().k(), this$0.Z1().toString(), this$0);
    }

    public static final void y3(SearchRC this$0, RcModelsDet rcModelsDet) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.F2().isShowing()) {
            this$0.F2().cancel();
        }
        try {
            if (StringsKt__StringsJVMKt.equals(rcModelsDet.getStatusCode(), "NP001", true)) {
                Intrinsics.checkNotNull(rcModelsDet);
                this$0.n4(rcModelsDet);
                this$0.N1(this$0.z2(), "Virtual RC Successfully Created!", this$0.I2(), this$0.Z1().toString());
            } else {
                if (gd1.a.m(rcModelsDet.getStatusDesc())) {
                    return;
                }
                this$0.D3(this$0.z2(), rcModelsDet.getStatusDesc());
            }
        } catch (Exception unused) {
        }
    }

    public static final void z3(SearchRC this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.F2().cancel();
        try {
            this$0.D3(this$0.z2(), "Unable to create the Virtual RC, Please try after some time!");
        } catch (Exception unused) {
        }
    }

    public final RcService A2() {
        RcService rcService = this.mRcService;
        if (rcService != null) {
            return rcService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRcService");
        return null;
    }

    public final void A4(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtFitnessUpTo = textView;
    }

    public final a55 B2() {
        a55 a55Var = this.mRcViewModel;
        if (a55Var != null) {
            return a55Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRcViewModel");
        return null;
    }

    public final void B3(Context context, String message) {
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
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nt5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchRC.C3(dialog, view);
            }
        });
        dialog.show();
    }

    public final void B4(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtFuelType = textView;
    }

    public final TextView C2() {
        TextView textView = this.national_permit_no;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("national_permit_no");
        return null;
    }

    public final void C4(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtInsuranceUpTo = textView;
    }

    public final TextView D2() {
        TextView textView = this.national_permit_no_valid_upto;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("national_permit_no_valid_upto");
        return null;
    }

    public final void D3(Context context, String message) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
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
        ((TextView) viewFindViewById3).setText(O2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(O2().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ot5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchRC.E3(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final void D4(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtOwnerName = textView;
    }

    public final LinearLayout E2() {
        LinearLayout linearLayout = this.nexgenarrow;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nexgenarrow");
        return null;
    }

    public final void E4(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtPuccUpTo = textView;
    }

    public final ProgressDialog F2() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final void F3(CoordinatorLayout coordinatorLayout) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "<set-?>");
        this.bottom = coordinatorLayout;
    }

    public final void F4(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtRegAuthority = textView;
    }

    public final o45 G2() {
        o45 o45Var = this.rcImpoundModel;
        if (o45Var != null) {
            return o45Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcImpoundModel");
        return null;
    }

    public final void G3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.chassino = str;
    }

    public final void G4(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtRegDate = textView;
    }

    public final br4 H2() {
        br4 br4Var = this.rcPermitModel;
        if (br4Var != null) {
            return br4Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcPermitModel");
        return null;
    }

    public final void H3(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.chassis_no_et = editText;
    }

    public final void H4(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtTaxValidUpTo = textView;
    }

    public final RcModelsDet I2() {
        RcModelsDet rcModelsDet = this.rcdetails;
        if (rcModelsDet != null) {
            return rcModelsDet;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final void I3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.chassis_no_txt = textView;
    }

    public final void I4(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtVehicleAge = textView;
    }

    public final LinearLayout J2() {
        LinearLayout linearLayout = this.redirect_DashBoard;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("redirect_DashBoard");
        return null;
    }

    public final void J3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.closebutton = textView;
    }

    public final void J4(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtVehicleClass = textView;
    }

    public final LinearLayout K2() {
        LinearLayout linearLayout = this.redirect_Rcdashboard;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("redirect_Rcdashboard");
        return null;
    }

    public final void K3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.createvirtualrc = linearLayout;
    }

    public final void K4(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtVeicleStatus = textView;
    }

    public final VahanProService L2() {
        VahanProService vahanProService = this.retrofitServiceAddMob;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitServiceAddMob");
        return null;
    }

    public final void L3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.createvirtualrcbutton = textView;
    }

    public final void L4(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txt_check_impound = textView;
    }

    @Override // com.zepto.tb0
    public void M(String searchNumber) {
        i4(new ProgressDialog(z2()));
        F2().setMessage(O2().b("label_challan_please_wait", "Please wait..."));
        F2().setCancelable(false);
        F2().setCanceledOnTouchOutside(false);
        F2().show();
        if (searchNumber != null) {
            B2().N(searchNumber, P2().k(), this);
        }
    }

    public final void M1() {
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            Object systemService = getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public final LinearLayout M2() {
        LinearLayout linearLayout = this.seizureImpoundLl;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("seizureImpoundLl");
        return null;
    }

    public final void M3(DatabaseHelper databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "<set-?>");
        this.databaseHelper = databaseHelper;
    }

    public final void M4(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.txt_seizure_impound_value = linearLayout;
    }

    public final void N1(Context context, String message, final RcModelsDet details, final String doc_id) {
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(doc_id, "doc_id");
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
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
        ((TextView) viewFindViewById3).setText(O2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(O2().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bu5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchRC.O1(dialog, this, details, doc_id, view);
            }
        });
        dialog.show();
    }

    public final String N2() {
        String str = this.service;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("service");
        return null;
    }

    public final void N3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.dl_dashboard = linearLayout;
    }

    public final void N4(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txt_vehicle_impound_value = textView;
    }

    public final wa3 O2() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final void O3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.doc_id = str;
    }

    public final void O4(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.var_rc_value = str;
    }

    public final CoordinatorLayout P1() {
        CoordinatorLayout coordinatorLayout = this.bottom;
        if (coordinatorLayout != null) {
            return coordinatorLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bottom");
        return null;
    }

    public final ws6 P2() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final void P3(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.engine_no_et = editText;
    }

    public final void P4(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.vehicleImpoundLl = linearLayout;
    }

    public final String Q1() {
        String str = this.chassino;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chassino");
        return null;
    }

    public final TextView Q2() {
        TextView textView = this.title_name;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("title_name");
        return null;
    }

    public final void Q3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.engine_no_txt = textView;
    }

    public final void Q4(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.vehicle_number = textView;
    }

    public final EditText R1() {
        EditText editText = this.chassis_no_et;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chassis_no_et");
        return null;
    }

    public final TextView R2() {
        TextView textView = this.tv_chassis_no;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tv_chassis_no");
        return null;
    }

    public final void R3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.enginno = str;
    }

    public final void R4(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.viewChallan = linearLayout;
    }

    public final TextView S1() {
        TextView textView = this.chassis_no_txt;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chassis_no_txt");
        return null;
    }

    public final TextView S2() {
        TextView textView = this.tv_engine_no;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tv_engine_no");
        return null;
    }

    public final void S3(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.etSearchRC = editText;
    }

    public final void S4(p26 p26Var) {
        Intrinsics.checkNotNullParameter(p26Var, "<set-?>");
        this.viewModel = p26Var;
    }

    public final TextView T1() {
        TextView textView = this.closebutton;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("closebutton");
        return null;
    }

    public final TextView T2() {
        TextView textView = this.txtBlackListStatus;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtBlackListStatus");
        return null;
    }

    public final void T3(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.insurance_title = textView;
    }

    public final void T4(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModelAddMob = ld7Var;
    }

    public final Integer U1() throws Throwable {
        int iE0;
        try {
            iE0 = X1().E0();
        } catch (Exception unused) {
            iE0 = 0;
        }
        return Integer.valueOf(iE0);
    }

    public final TextView U2() {
        TextView textView = this.txtFitnessUpTo;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtFitnessUpTo");
        return null;
    }

    public final void U3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.LayoutBlackListStatus = linearLayout;
    }

    public final void U4(Context context, String message) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cu5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchRC.V4(dialog, view);
            }
        });
        dialog.show();
    }

    public final LinearLayout V1() {
        LinearLayout linearLayout = this.createvirtualrc;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("createvirtualrc");
        return null;
    }

    public final TextView V2() {
        TextView textView = this.txtFuelType;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtFuelType");
        return null;
    }

    public final void V3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.linear_menu_bar = linearLayout;
    }

    public final TextView W1() {
        TextView textView = this.createvirtualrcbutton;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("createvirtualrcbutton");
        return null;
    }

    public final TextView W2() {
        TextView textView = this.txtInsuranceUpTo;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtInsuranceUpTo");
        return null;
    }

    public final void W3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.linear_permit_number = linearLayout;
    }

    public final DatabaseHelper X1() {
        DatabaseHelper databaseHelper = this.databaseHelper;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("databaseHelper");
        return null;
    }

    public final TextView X2() {
        TextView textView = this.txtOwnerName;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtOwnerName");
        return null;
    }

    public final void X3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.linear_permit_validUpto = linearLayout;
    }

    public final LinearLayout Y1() {
        LinearLayout linearLayout = this.dl_dashboard;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dl_dashboard");
        return null;
    }

    public final TextView Y2() {
        TextView textView = this.txtPuccUpTo;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtPuccUpTo");
        return null;
    }

    public final void Y3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.llRecentRC = linearLayout;
    }

    public final String Z1() {
        String str = this.doc_id;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("doc_id");
        return null;
    }

    public final TextView Z2() {
        TextView textView = this.txtRegAuthority;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtRegAuthority");
        return null;
    }

    public final void Z3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.llSearchRC = linearLayout;
    }

    public final EditText a2() {
        EditText editText = this.engine_no_et;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("engine_no_et");
        return null;
    }

    public final TextView a3() {
        TextView textView = this.txtRegDate;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtRegDate");
        return null;
    }

    public final void a4(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.ll_rc = linearLayout;
    }

    public final TextView b2() {
        TextView textView = this.engine_no_txt;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("engine_no_txt");
        return null;
    }

    public final TextView b3() {
        TextView textView = this.txtTaxValidUpTo;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtTaxValidUpTo");
        return null;
    }

    public final void b4(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final String c2() {
        String str = this.enginno;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("enginno");
        return null;
    }

    public final TextView c3() {
        TextView textView = this.txtVehicleAge;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtVehicleAge");
        return null;
    }

    public final void c4(RcService rcService) {
        Intrinsics.checkNotNullParameter(rcService, "<set-?>");
        this.mRcService = rcService;
    }

    public final EditText d2() {
        EditText editText = this.etSearchRC;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("etSearchRC");
        return null;
    }

    public final TextView d3() {
        TextView textView = this.txtVehicleClass;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtVehicleClass");
        return null;
    }

    public final void d4(a55 a55Var) {
        Intrinsics.checkNotNullParameter(a55Var, "<set-?>");
        this.mRcViewModel = a55Var;
    }

    public final TextView e3() {
        TextView textView = this.txtVeicleStatus;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txtVeicleStatus");
        return null;
    }

    public final void e4(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.national_permit_no = textView;
    }

    public final TextView f3() {
        TextView textView = this.txt_check_impound;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txt_check_impound");
        return null;
    }

    public final void f4(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.national_permit_no_valid_upto = textView;
    }

    public final LinearLayout g3() {
        LinearLayout linearLayout = this.txt_seizure_impound_value;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("txt_seizure_impound_value");
        return null;
    }

    public final void g4(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.nexgenarrow = linearLayout;
    }

    public final String h3() {
        String str = this.var_rc_value;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("var_rc_value");
        return null;
    }

    public final void h4(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.offCode = str;
    }

    public final LinearLayout i3() {
        LinearLayout linearLayout = this.vehicleImpoundLl;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vehicleImpoundLl");
        return null;
    }

    public final void i4(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final TextView j3() {
        TextView textView = this.vehicle_number;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vehicle_number");
        return null;
    }

    public final void j4(dl4 dl4Var) {
        Intrinsics.checkNotNullParameter(dl4Var, "<set-?>");
        this.pSession = dl4Var;
    }

    public final LinearLayout k3() {
        LinearLayout linearLayout = this.viewChallan;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewChallan");
        return null;
    }

    public final void k4(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.pucc_title = textView;
    }

    public final p26 l3() {
        p26 p26Var = this.viewModel;
        if (p26Var != null) {
            return p26Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void l4(o45 o45Var) {
        Intrinsics.checkNotNullParameter(o45Var, "<set-?>");
        this.rcImpoundModel = o45Var;
    }

    public final ld7 m3() {
        ld7 ld7Var = this.viewModelAddMob;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelAddMob");
        return null;
    }

    public final void m4(br4 br4Var) {
        Intrinsics.checkNotNullParameter(br4Var, "<set-?>");
        this.rcPermitModel = br4Var;
    }

    public final int n3(Date startDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date());
        int i2 = 0;
        if (calendar2.get(5) - calendar.get(5) < 0) {
            calendar2.getActualMaximum(5);
            if (calendar2.get(5) - calendar.get(5) <= 0) {
                i2 = -1;
            }
        }
        return i2 + (calendar2.get(2) - calendar.get(2)) + ((calendar2.get(1) - calendar.get(1)) * 12);
    }

    public final void n4(RcModelsDet rcModelsDet) {
        Intrinsics.checkNotNullParameter(rcModelsDet, "<set-?>");
        this.rcdetails = rcModelsDet;
    }

    public final void o4(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.redirect_DashBoard = linearLayout;
    }

    @Override // com.zepto.zt0, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        dg dgVarC = dg.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(dgVarC, "inflate(...)");
        this.binding = dgVarC;
        SignService signService = null;
        if (dgVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dgVarC = null;
        }
        setContentView(dgVarC.b());
        getWindow().addFlags(128);
        b4(this);
        ta3.a aVar = ta3.a;
        Context contextZ2 = z2();
        dg dgVar = this.binding;
        if (dgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dgVar = null;
        }
        aVar.N1(contextZ2, dgVar);
        u4(new ws6(this));
        j4(new dl4(this));
        t4(new wa3(this));
        this.rcImpoundService = RcImpoundService.INSTANCE.a(z2());
        c4(RcService.INSTANCE.a(this));
        this.permitService = AllIndiaPermit.INSTANCE.a(this);
        q4(VahanProService.INSTANCE.a(this));
        T4((ld7) new z(this, new kd7(new jd7(L2()))).a(ld7.class));
        AllIndiaPermit allIndiaPermit = this.permitService;
        if (allIndiaPermit == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permitService");
            allIndiaPermit = null;
        }
        m4((br4) new z(this, new cr4(new xq4(allIndiaPermit))).a(br4.class));
        DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(z2());
        Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
        M3(databaseHelperD0);
        i4(new ProgressDialog(z2()));
        F2().setMessage(O2().b("label_challan_please_wait", "Please wait..."));
        F2().setCancelable(false);
        F2().setCanceledOnTouchOutside(false);
        O4(String.valueOf(getIntent().getStringExtra("RC_Number")));
        d4((a55) new z(this, new b55(new s45(A2()))).a(a55.class));
        RcImpoundService rcImpoundService = this.rcImpoundService;
        if (rcImpoundService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rcImpoundService");
            rcImpoundService = null;
        }
        l4((o45) new z(this, new q45(new p45(rcImpoundService))).a(o45.class));
        this.retrofitService = SignService.INSTANCE.a(this);
        SignService signService2 = this.retrofitService;
        if (signService2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        } else {
            signService = signService2;
        }
        S4((p26) new z(this, new a26(new c26(signService))).a(p26.class));
        e2();
        s4(String.valueOf(getIntent().getStringExtra("RCSERVICE")));
        if (N2().equals("INS002")) {
            Q2().setText(O2().b("insurance_search", "Insurance Search"));
        }
        if (N2().equals("PUCC003")) {
            Q2().setText(O2().b("pucc_Search", "PUCC Search"));
        }
        String strH3 = h3();
        if (strH3 != null && strH3.length() != 0) {
            F2().show();
            B2().N(h3(), P2().k(), this);
        }
        B2().O().g(this, new m(new g()));
        B2().s().g(this, new m(new h()));
        H2().h().g(this, new m(new i()));
        H2().i().g(this, new m(new j()));
        B2().Y().g(this, new mf4() { // from class: com.zepto.jt5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SearchRC.o3(this.a, (String) obj);
            }
        });
        m3().j0().g(this, new m(new k()));
        m3().k0().g(this, new m(new l()));
        l3().u().g(this, new mf4() { // from class: com.zepto.fu5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SearchRC.t3(this.a, (SendOtpResult) obj);
            }
        });
        l3().t().g(this, new mf4() { // from class: com.zepto.gu5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SearchRC.u3((String) obj);
            }
        });
        l3().x().g(this, new mf4() { // from class: com.zepto.hu5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SearchRC.v3(this.a, (CitzValidDoc) obj);
            }
        });
        l3().k().g(this, new mf4() { // from class: com.zepto.iu5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SearchRC.w3(this.a, (String) obj);
            }
        });
        l3().A().g(this, new m(new c()));
        l3().z().g(this, new m(new d()));
        B2().L().g(this, new mf4() { // from class: com.zepto.ju5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SearchRC.x3(this.a, (GetVirtualDocDetails) obj);
            }
        });
        B2().R().g(this, new mf4() { // from class: com.zepto.ku5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SearchRC.y3(this.a, (RcModelsDet) obj);
            }
        });
        B2().S().g(this, new mf4() { // from class: com.zepto.kt5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SearchRC.z3(this.a, (String) obj);
            }
        });
        B2().M().g(this, new mf4() { // from class: com.zepto.lt5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SearchRC.A3(this.a, (String) obj);
            }
        });
        G2().l().g(this, new m(new e()));
        G2().k().g(this, new m(new f()));
        B2().V().g(this, new mf4() { // from class: com.zepto.mt5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SearchRC.p3(this.a, (ValidateRcSuccess) obj);
            }
        });
        B2().W().g(this, new mf4() { // from class: com.zepto.ut5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SearchRC.q3(this.a, (String) obj);
            }
        });
        m3().x0().g(this, new mf4() { // from class: com.zepto.du5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SearchRC.r3(this.a, (String) obj);
            }
        });
        m3().y0().g(this, new mf4() { // from class: com.zepto.eu5
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                SearchRC.s3(this.a, (String) obj);
            }
        });
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() throws Throwable {
        super.onResume();
        try {
            if (com.nic.mparivahan.a.a.a(this)) {
                NaxpToKenService.INSTANCE.a(this);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        Integer numU1 = U1();
        Intrinsics.checkNotNull(numU1);
        if (numU1.intValue() > 0) {
            t2().setVisibility(8);
        } else {
            t2().setVisibility(8);
        }
    }

    public final void p4(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.redirect_Rcdashboard = linearLayout;
    }

    /* JADX INFO: renamed from: q2, reason: from getter */
    public final ArrayList getImpoundListdescArray() {
        return this.impoundListdescArray;
    }

    public final void q4(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitServiceAddMob = vahanProService;
    }

    /* JADX INFO: renamed from: r2, reason: from getter */
    public final ArrayList getImpoundListtitleArray() {
        return this.impoundListtitleArray;
    }

    public final void r4(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.seizureImpoundLl = linearLayout;
    }

    public final LinearLayout s2() {
        LinearLayout linearLayout = this.LayoutBlackListStatus;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("LayoutBlackListStatus");
        return null;
    }

    public final void s4(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.service = str;
    }

    public final LinearLayout t2() {
        LinearLayout linearLayout = this.linear_menu_bar;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("linear_menu_bar");
        return null;
    }

    public final void t4(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final LinearLayout u2() {
        LinearLayout linearLayout = this.linear_permit_number;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("linear_permit_number");
        return null;
    }

    public final void u4(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final LinearLayout v2() {
        LinearLayout linearLayout = this.linear_permit_validUpto;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("linear_permit_validUpto");
        return null;
    }

    public final void v4(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCode = str;
    }

    public final LinearLayout w2() {
        LinearLayout linearLayout = this.llRecentRC;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("llRecentRC");
        return null;
    }

    public final void w4(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.title_name = textView;
    }

    @Override // com.zepto.tb0
    public void x(String searchNumber) {
    }

    public final LinearLayout x2() {
        LinearLayout linearLayout = this.llSearchRC;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("llSearchRC");
        return null;
    }

    public final void x4(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tv_chassis_no = textView;
    }

    public final LinearLayout y2() {
        LinearLayout linearLayout = this.ll_rc;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ll_rc");
        return null;
    }

    public final void y4(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tv_engine_no = textView;
    }

    public final Context z2() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final void z4(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtBlackListStatus = textView;
    }
}
