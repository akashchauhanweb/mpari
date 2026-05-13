package com.nic.mparivahan.RC;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Account.Model.State;
import com.nic.mparivahan.Account.Model.StateMaster;
import com.nic.mparivahan.Account.SignService;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.CreateRCAlertsScreen;
import com.nic.mparivahan.RC.Model.CitizenDocInfoX;
import com.nic.mparivahan.RC.Model.CitzValidDoc;
import com.nic.mparivahan.RC.Model.MyRcDeletResponse;
import com.nic.mparivahan.RC.Model.RcModelsDet;
import com.nic.mparivahan.RC.Model.ValidateRcSuccess;
import com.nic.mparivahan.RC.RcInterface.RcService;
import com.nic.mparivahan.VahanServices.VahanModel.GetStateCode;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.zepto.a26;
import com.zepto.a55;
import com.zepto.b55;
import com.zepto.c26;
import com.zepto.d31;
import com.zepto.dl4;
import com.zepto.gd1;
import com.zepto.hz0;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.n35;
import com.zepto.nq6;
import com.zepto.p26;
import com.zepto.pq;
import com.zepto.s45;
import com.zepto.ta3;
import com.zepto.va3;
import com.zepto.wa3;
import com.zepto.ws6;
import com.zepto.xn;
import com.zepto.z21;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\t¢\u0006\u0006\b\u0083\u0002\u0010\u0084\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0002J&\u0010\n\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\u001a\u0010\u000e\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007J*\u0010\u0012\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007J\u0006\u0010\u0013\u001a\u00020\u0003J\u0006\u0010\u0014\u001a\u00020\u0003J\u0019\u0010\u0017\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001c\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u001a\u0010\u001d\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007R\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00104\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010\u0019\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010a\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010i\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010m\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010d\u001a\u0004\bk\u0010f\"\u0004\bl\u0010hR\"\u0010q\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010d\u001a\u0004\bo\u0010f\"\u0004\bp\u0010hR\"\u0010y\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\"\u0010}\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bz\u0010N\u001a\u0004\b{\u0010P\"\u0004\b|\u0010RR$\u0010\u0081\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0013\n\u0004\b~\u0010N\u001a\u0004\b\u007f\u0010P\"\u0005\b\u0080\u0001\u0010RR*\u0010\u0089\u0001\u001a\u00030\u0082\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R*\u0010\u008d\u0001\u001a\u00030\u0082\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u0084\u0001\u001a\u0006\b\u008b\u0001\u0010\u0086\u0001\"\u0006\b\u008c\u0001\u0010\u0088\u0001R*\u0010\u0095\u0001\u001a\u00030\u008e\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R&\u0010\u0099\u0001\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0096\u0001\u0010?\u001a\u0005\b\u0097\u0001\u0010A\"\u0005\b\u0098\u0001\u0010CR1\u0010¢\u0001\u001a\n\u0012\u0005\u0012\u00030\u009b\u00010\u009a\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R*\u0010ª\u0001\u001a\u00030£\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R&\u0010®\u0001\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b«\u0001\u0010?\u001a\u0005\b¬\u0001\u0010A\"\u0005\b\u00ad\u0001\u0010CR*\u0010¶\u0001\u001a\u00030¯\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R\u001a\u0010º\u0001\u001a\u00030·\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R%\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b»\u0001\u0010N\u001a\u0005\b¼\u0001\u0010P\"\u0005\b½\u0001\u0010RR&\u0010Á\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¾\u0001\u0010N\u001a\u0005\b¿\u0001\u0010P\"\u0005\bÀ\u0001\u0010RR(\u0010Ç\u0001\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bÂ\u0001\u0010M\u001a\u0006\bÃ\u0001\u0010Ä\u0001\"\u0006\bÅ\u0001\u0010Æ\u0001R(\u0010Ë\u0001\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bÈ\u0001\u0010M\u001a\u0006\bÉ\u0001\u0010Ä\u0001\"\u0006\bÊ\u0001\u0010Æ\u0001R*\u0010Ó\u0001\u001a\u00030Ì\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÍ\u0001\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0006\bÑ\u0001\u0010Ò\u0001R\u0019\u0010Ö\u0001\u001a\u00030Ô\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0017\u0010Õ\u0001R,\u0010Þ\u0001\u001a\u0005\u0018\u00010×\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bØ\u0001\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001R*\u0010æ\u0001\u001a\u00030ß\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bà\u0001\u0010á\u0001\u001a\u0006\bâ\u0001\u0010ã\u0001\"\u0006\bä\u0001\u0010å\u0001R*\u0010î\u0001\u001a\u00030ç\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bè\u0001\u0010é\u0001\u001a\u0006\bê\u0001\u0010ë\u0001\"\u0006\bì\u0001\u0010í\u0001R&\u0010ò\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bï\u0001\u0010N\u001a\u0005\bð\u0001\u0010P\"\u0005\bñ\u0001\u0010RR&\u0010ö\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bó\u0001\u0010N\u001a\u0005\bô\u0001\u0010P\"\u0005\bõ\u0001\u0010RR&\u0010ú\u0001\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b÷\u0001\u0010N\u001a\u0005\bø\u0001\u0010P\"\u0005\bù\u0001\u0010RR*\u0010\u0082\u0002\u001a\u00030û\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bü\u0001\u0010ý\u0001\u001a\u0006\bþ\u0001\u0010ÿ\u0001\"\u0006\b\u0080\u0002\u0010\u0081\u0002¨\u0006\u0085\u0002"}, d2 = {"Lcom/nic/mparivahan/RC/CreateRCAlertsScreen;", "Lcom/zepto/pq;", "Lcom/zepto/nq6;", "", "O1", "Landroid/content/Context;", "context", "", "message", "rc_number", "v2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "y2", "Lcom/nic/mparivahan/RC/Model/RcModelsDet;", "details", "doc_id", "B1", "g3", "h3", "", "position", "f0", "(Ljava/lang/Integer;)V", "rc", "f", "(Ljava/lang/String;Ljava/lang/Integer;)V", "B", "e3", "Lcom/zepto/a55;", "C", "Lcom/zepto/a55;", "U1", "()Lcom/zepto/a55;", "N2", "(Lcom/zepto/a55;)V", "mRcViewModel", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "D", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "T1", "()Lcom/nic/mparivahan/RC/RcInterface/RcService;", "M2", "(Lcom/nic/mparivahan/RC/RcInterface/RcService;)V", "mRcService", "E", "Landroid/content/Context;", "S1", "()Landroid/content/Context;", "L2", "(Landroid/content/Context;)V", "mContext", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "Y1", "()Landroid/app/ProgressDialog;", "R2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Landroid/widget/LinearLayout;", "G", "Landroid/widget/LinearLayout;", "X1", "()Landroid/widget/LinearLayout;", "P2", "(Landroid/widget/LinearLayout;)V", "nexgenarrow", "Lcom/nic/mparivahan/MyTextView;", "H", "Lcom/nic/mparivahan/MyTextView;", "I1", "()Lcom/nic/mparivahan/MyTextView;", "F2", "(Lcom/nic/mparivahan/MyTextView;)V", "createvirtualrc", "I", "Ljava/lang/String;", "getRc", "()Ljava/lang/String;", "T2", "(Ljava/lang/String;)V", "Lcom/zepto/ws6;", "J", "Lcom/zepto/ws6;", "f2", "()Lcom/zepto/ws6;", "Z2", "(Lcom/zepto/ws6;)V", "sessionManager", "K", "Lcom/nic/mparivahan/RC/Model/RcModelsDet;", "a2", "()Lcom/nic/mparivahan/RC/Model/RcModelsDet;", "U2", "(Lcom/nic/mparivahan/RC/Model/RcModelsDet;)V", "rcdetails", "Landroid/widget/EditText;", "L", "Landroid/widget/EditText;", "H1", "()Landroid/widget/EditText;", "E2", "(Landroid/widget/EditText;)V", "chassis_no_et", "M", "K1", "H2", "engine_no_et", "N", "N1", "K2", "etSearchRC", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "O", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "J1", "()Lcom/nic/mparivahan/DB/DatabaseHelper;", "G2", "(Lcom/nic/mparivahan/DB/DatabaseHelper;)V", "databaseHelper", "P", "L1", "I2", "enter_chassi", "Q", "M1", "J2", "enter_engin", "Landroidx/recyclerview/widget/RecyclerView;", "R", "Landroidx/recyclerview/widget/RecyclerView;", "b2", "()Landroidx/recyclerview/widget/RecyclerView;", "V2", "(Landroidx/recyclerview/widget/RecyclerView;)V", "rec_rc_recycler", "S", "E1", "B2", "alerst_recycle_view", "Lcom/zepto/xn;", "T", "Lcom/zepto/xn;", "D1", "()Lcom/zepto/xn;", "A2", "(Lcom/zepto/xn;)V", "alerst_adapter", "U", "F1", "C2", "alerts_layout", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/RC/Model/Document;", "V", "Ljava/util/ArrayList;", "G1", "()Ljava/util/ArrayList;", "D2", "(Ljava/util/ArrayList;)V", "arrayList", "Lcom/zepto/z21;", "W", "Lcom/zepto/z21;", "V1", "()Lcom/zepto/z21;", "O2", "(Lcom/zepto/z21;)V", "myRcAdapter", "X", "j2", "d3", "virtualrc_layout", "Lcom/zepto/wa3;", "Y", "Lcom/zepto/wa3;", "e2", "()Lcom/zepto/wa3;", "Y2", "(Lcom/zepto/wa3;)V", "session", "Lcom/zepto/d31;", "Z", "Lcom/zepto/d31;", "binding", "a0", "getDoc_id", "setDoc_id", "b0", "d2", "X2", "selectedRcNumber", "c0", "g2", "()I", "setUpdatePosition", "(I)V", "updatePosition", "d0", "W1", "setMyRcAdapterPosition", "MyRcAdapterPosition", "Lcom/zepto/p26;", "e0", "Lcom/zepto/p26;", "h2", "()Lcom/zepto/p26;", "b3", "(Lcom/zepto/p26;)V", "viewModel", "Lcom/nic/mparivahan/Account/SignService;", "Lcom/nic/mparivahan/Account/SignService;", "retrofitService", "Landroid/app/Dialog;", "g0", "Landroid/app/Dialog;", "getDiloge", "()Landroid/app/Dialog;", "setDiloge", "(Landroid/app/Dialog;)V", "diloge", "Lcom/zepto/ld7;", "h0", "Lcom/zepto/ld7;", "i2", "()Lcom/zepto/ld7;", "c3", "(Lcom/zepto/ld7;)V", "viewModelAddMob", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "i0", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "c2", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "W2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "retrofitServiceAddMob", "j0", "getStateCode", "a3", "stateCode", "k0", "getOffCode", "Q2", "offCode", "l0", "getMobile_no", "setMobile_no", "mobile_no", "Lcom/zepto/dl4;", "m0", "Lcom/zepto/dl4;", "Z1", "()Lcom/zepto/dl4;", "S2", "(Lcom/zepto/dl4;)V", "pSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCreateRCAlertsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateRCAlertsScreen.kt\ncom/nic/mparivahan/RC/CreateRCAlertsScreen\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,868:1\n1#2:869\n766#3:870\n857#3,2:871\n*S KotlinDebug\n*F\n+ 1 CreateRCAlertsScreen.kt\ncom/nic/mparivahan/RC/CreateRCAlertsScreen\n*L\n334#1:870\n334#1:871,2\n*E\n"})
public final class CreateRCAlertsScreen extends pq implements nq6 {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public a55 mRcViewModel;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public RcService mRcService;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public LinearLayout nexgenarrow;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public MyTextView createvirtualrc;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String rc;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public RcModelsDet rcdetails;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public EditText chassis_no_et;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public EditText engine_no_et;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public EditText etSearchRC;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public DatabaseHelper databaseHelper;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String enter_chassi;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String enter_engin;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public RecyclerView rec_rc_recycler;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public RecyclerView alerst_recycle_view;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public xn alerst_adapter;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public LinearLayout alerts_layout;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public ArrayList arrayList;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public z21 myRcAdapter;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public LinearLayout virtualrc_layout;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public d31 binding;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String selectedRcNumber;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public int updatePosition;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public int MyRcAdapterPosition;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public p26 viewModel;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public SignService retrofitService;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public Dialog diloge;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public ld7 viewModelAddMob;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public VahanProService retrofitServiceAddMob;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public dl4 pSession;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String doc_id = "0";

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public String stateCode = " ";

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public String offCode = " ";

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public String mobile_no = " ";

    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
            if (s.toString().length() == 5) {
                CreateRCAlertsScreen.this.K1().requestFocus();
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

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(GetStateCode getStateCode) {
            if (getStateCode != null) {
                try {
                    if (gd1.a.m(getStateCode.getStateCd())) {
                        return;
                    }
                    CreateRCAlertsScreen.this.a3(getStateCode.getStateCd());
                    CreateRCAlertsScreen.this.Q2(String.valueOf(getStateCode.getOffCd()));
                    CreateRCAlertsScreen.this.U1().m(CreateRCAlertsScreen.this.N1().getText().toString(), CreateRCAlertsScreen.this.f2().k().toString(), CreateRCAlertsScreen.this.L1(), CreateRCAlertsScreen.this.M1(), CreateRCAlertsScreen.this, hz0.a.x());
                } catch (Exception unused) {
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetStateCode) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            new dl4(CreateRCAlertsScreen.this).f(0);
            CreateRCAlertsScreen.this.U1().m(CreateRCAlertsScreen.this.N1().getText().toString(), CreateRCAlertsScreen.this.f2().k().toString(), CreateRCAlertsScreen.this.L1(), CreateRCAlertsScreen.this.M1(), CreateRCAlertsScreen.this, hz0.a.x());
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
        public final void a(MyRcDeletResponse myRcDeletResponse) {
            try {
                CreateRCAlertsScreen.this.Y1().dismiss();
                if (StringsKt__StringsJVMKt.equals(myRcDeletResponse.getStatusCode(), "VTLD001", true)) {
                    try {
                        CreateRCAlertsScreen.this.V1().M(CreateRCAlertsScreen.this.getMyRcAdapterPosition());
                        CreateRCAlertsScreen.this.J1().p0(CreateRCAlertsScreen.this.d2());
                        CreateRCAlertsScreen createRCAlertsScreen = CreateRCAlertsScreen.this;
                        createRCAlertsScreen.e3(createRCAlertsScreen, createRCAlertsScreen.e2().b(va3.a.h0(), "Virtual RC successfully deleted!"));
                    } catch (Exception e) {
                        e.printStackTrace();
                        Toast.makeText(CreateRCAlertsScreen.this.getApplicationContext(), CreateRCAlertsScreen.this.e2().b(va3.a.G0(), "Unable to delete the Virtual Rc, Please try after some time"), 1).show();
                    }
                } else if (gd1.a.m(myRcDeletResponse.getStatusDesc())) {
                    Toast.makeText(CreateRCAlertsScreen.this.getApplicationContext(), CreateRCAlertsScreen.this.e2().b(va3.a.G0(), "Unable to delete the Virtual Rc, Please try after some time"), 1).show();
                } else {
                    CreateRCAlertsScreen createRCAlertsScreen2 = CreateRCAlertsScreen.this;
                    createRCAlertsScreen2.e3(createRCAlertsScreen2, myRcDeletResponse.getStatusDesc());
                }
            } catch (Exception unused) {
                CreateRCAlertsScreen.this.Y1().dismiss();
                Log.e("error-1-", myRcDeletResponse.toString());
                Toast.makeText(CreateRCAlertsScreen.this.getApplicationContext(), CreateRCAlertsScreen.this.e2().b(va3.a.G0(), "Unable to delete the Virtual Rc, Please try after some times"), 1).show();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((MyRcDeletResponse) obj);
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

        public final void invoke(String str) {
            CreateRCAlertsScreen.this.Y1().dismiss();
            Toast.makeText(CreateRCAlertsScreen.this.getApplicationContext(), CreateRCAlertsScreen.this.e2().b(va3.a.G0(), "Unable to delete the Virtual Rc, Please try after some times"), 1).show();
        }
    }

    public static final class f extends Lambda implements Function1 {
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
        public final void a(RcModelsDet rcModelsDet) {
            try {
                if (StringsKt__StringsJVMKt.equals(rcModelsDet.getStatusCode().toString(), "NP001", true)) {
                    if (n35.a.l(CreateRCAlertsScreen.this, rcModelsDet.getNrvDetails()) > 0) {
                        CreateRCAlertsScreen.this.V1().k(CreateRCAlertsScreen.this.getUpdatePosition());
                    }
                    CreateRCAlertsScreen createRCAlertsScreen = CreateRCAlertsScreen.this;
                    createRCAlertsScreen.e3(createRCAlertsScreen, createRCAlertsScreen.e2().b(va3.a.b1(), "Virtual RC successfully updated!"));
                }
            } catch (Exception unused) {
                CreateRCAlertsScreen.this.Y1().dismiss();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((RcModelsDet) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class g extends Lambda implements Function1 {
        public g() {
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
            CreateRCAlertsScreen.this.Y1().dismiss();
            try {
                if (StringsKt__StringsJVMKt.equals(resendOtp.getStatusCode(), "AL001", true)) {
                    CreateRCAlertsScreen createRCAlertsScreen = CreateRCAlertsScreen.this;
                    Toast.makeText(createRCAlertsScreen, createRCAlertsScreen.e2().b("label_log_resend_otp", "We have resent the OTP to your Mobile Number"), 1).show();
                } else if (gd1.a.m(resendOtp.getStatusDesc())) {
                    CreateRCAlertsScreen.this.Y1().dismiss();
                    CreateRCAlertsScreen createRCAlertsScreen2 = CreateRCAlertsScreen.this;
                    createRCAlertsScreen2.y2(createRCAlertsScreen2, createRCAlertsScreen2.e2().b("label_log_invalid_otp", "The OTP you entered is invalid, Please enter the correct OTP"));
                } else {
                    Toast.makeText(CreateRCAlertsScreen.this, resendOtp.getStatusDesc(), 1).show();
                }
            } catch (Exception unused) {
                CreateRCAlertsScreen.this.Y1().dismiss();
                CreateRCAlertsScreen createRCAlertsScreen3 = CreateRCAlertsScreen.this;
                createRCAlertsScreen3.y2(createRCAlertsScreen3, createRCAlertsScreen3.e2().b("label_log_unbl_resend_otp", "Unable to resend the OTP, Please try after sometime."));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ResendOtp) obj);
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
            CreateRCAlertsScreen.this.Y1().dismiss();
            CreateRCAlertsScreen createRCAlertsScreen = CreateRCAlertsScreen.this;
            createRCAlertsScreen.y2(createRCAlertsScreen, createRCAlertsScreen.e2().b("label_log_unbl_resend_otp", "Unable to resend the OTP, Please try after sometime."));
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

    public static final void C1(Dialog d2, CreateRCAlertsScreen this$0, RcModelsDet details, String doc_id, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(details, "$details");
        Intrinsics.checkNotNullParameter(doc_id, "$doc_id");
        d2.dismiss();
        try {
            this$0.J1().R0(details.getNrvDetails().getRc_regn_no(), doc_id, details.getNrvDetails(), 0);
            this$0.h3();
            this$0.g3();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void O1() throws Throwable {
        View viewFindViewById = findViewById(R.id.chassis_no_et);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        E2((EditText) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.engin_no);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        H2((EditText) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.et_search_rc);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        K2((EditText) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.createvirtualrc);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        F2((MyTextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.alerst_recycle_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        B2((RecyclerView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.alerts_layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        C2((LinearLayout) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.nexgenarrow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        P2((LinearLayout) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.virtualrc_layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        d3((LinearLayout) viewFindViewById8);
        View viewFindViewById9 = findViewById(R.id.rec_rc_recycler);
        Intrinsics.checkNotNull(viewFindViewById9, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        V2((RecyclerView) viewFindViewById9);
        b2().setLayoutManager(new LinearLayoutManager(this, 0, false));
        E1().setLayoutManager(new LinearLayoutManager(this, 0, false));
        R2(new ProgressDialog(this));
        Y1().setMessage("Please wait...");
        Y1().setCancelable(false);
        Y1().setCanceledOnTouchOutside(false);
        h3();
        g3();
        X1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.g21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRCAlertsScreen.P1(this.a, view);
            }
        });
        H1().addTextChangedListener(new a());
        X1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.h21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRCAlertsScreen.Q1(this.a, view);
            }
        });
        I1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.i21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRCAlertsScreen.R1(this.a, view);
            }
        });
        i2().j0().g(this, new i(new b()));
        i2().k0().g(this, new i(new c()));
        U1().z().g(this, new i(new d()));
        U1().A().g(this, new i(new e()));
    }

    public static final void P1(CreateRCAlertsScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void Q1(CreateRCAlertsScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void R1(CreateRCAlertsScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.T2(this$0.N1().getText().toString());
        this$0.I2(this$0.H1().getText().toString());
        this$0.J2(this$0.K1().getText().toString());
        this$0.N1().getText().toString();
        if (this$0.N1().getText().toString().length() == 0 || this$0.N1().getText().toString().length() < 4) {
            this$0.N1().requestFocus();
            this$0.y2(this$0.S1(), this$0.e2().b("label_challan_rc_validation", "Please enter vehicle number.Minimum 4 & maximum 10 characters with no special character"));
            return;
        }
        if (!new Regex("[a-zA-Z0-9]*").matches(this$0.N1().getText().toString())) {
            this$0.N1().requestFocus();
            this$0.y2(this$0.S1(), this$0.e2().b("label_challan_rc_validation", "Please enter vehicle number.Minimum 4 & maximum 10 characters with no special character"));
            return;
        }
        if (this$0.L1().length() < 5) {
            Toast.makeText(this$0.getApplicationContext(), this$0.e2().b("label_challan_valid_chassis_no", "Please enter the valid last 5 digit of chassis no."), 1).show();
            return;
        }
        if (this$0.M1().length() < 5) {
            Toast.makeText(this$0.getApplicationContext(), this$0.e2().b("label_challan_valid_engine_no", "Please enter the valid last 5 digit of engine no"), 1).show();
            return;
        }
        if (this$0.N1().getText().toString().length() >= 4) {
            if (!new Regex("^[0-9]*$").matches(this$0.N1().getText().toString())) {
                if (!new Regex("[a-zA-Z]+").matches(this$0.N1().getText().toString())) {
                    this$0.R2(new ProgressDialog(this$0.S1()));
                    this$0.Y1().setMessage("Please wait...");
                    this$0.Y1().setCancelable(false);
                    this$0.Y1().setCanceledOnTouchOutside(false);
                    this$0.Y1().show();
                    this$0.i2().o(this$0, this$0.N1().getText().toString());
                    return;
                }
            }
            this$0.y2(this$0.S1(), this$0.e2().b("label_challan_rc_validation", this$0.getString(R.string.rc_text)));
        }
    }

    public static final void f3(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void k2(CreateRCAlertsScreen this$0, RcModelsDet rcModelsDet) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.Y1().cancel();
        if (!StringsKt__StringsJVMKt.equals(rcModelsDet.getStatusCode(), "NP001", true)) {
            if (gd1.a.m(rcModelsDet.getStatusDesc())) {
                this$0.y2(this$0.S1(), this$0.e2().b(va3.a.J0(), "Unable to add the Vehicle, Please try after some time"));
                return;
            } else {
                this$0.y2(this$0.S1(), rcModelsDet.getStatusDesc());
                return;
            }
        }
        d31 d31Var = this$0.binding;
        d31 d31Var2 = null;
        if (d31Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            d31Var = null;
        }
        d31Var.g.setText("");
        d31 d31Var3 = this$0.binding;
        if (d31Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            d31Var3 = null;
        }
        d31Var3.d.setText("");
        d31 d31Var4 = this$0.binding;
        if (d31Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            d31Var2 = d31Var4;
        }
        d31Var2.f.setText("");
        Intrinsics.checkNotNull(rcModelsDet);
        this$0.U2(rcModelsDet);
        this$0.B1(this$0.S1(), this$0.e2().b(va3.a.V0(), "My Vehicle added successfully!"), this$0.a2(), this$0.doc_id);
    }

    public static final void l2(CreateRCAlertsScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.y2(this$0.S1(), this$0.e2().b(va3.a.J0(), "Unable to add the Vehicle, Please try after some times"));
        this$0.Y1().cancel();
    }

    public static final void m2(CreateRCAlertsScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (gd1.a.m(str)) {
                this$0.Y1().dismiss();
                n35.a.i(this$0, new wa3(this$0).b("validateMobile", this$0.getString(R.string.validate1)));
            } else {
                Intrinsics.checkNotNull(str);
                this$0.mobile_no = str;
                this$0.h2().I(this$0, this$0.mobile_no, 1);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void n2(CreateRCAlertsScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.Y1().dismiss();
        if (StringsKt__StringsJVMKt.equals(str, "Error", true)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.e2().b(va3.a.L0(), "Unable to add the Virtual RC, Please try again"), 1).show();
        } else {
            n35.a.i(this$0, new wa3(this$0).b("validateMobile", this$0.getString(R.string.validate1)));
        }
    }

    public static final void o2(CreateRCAlertsScreen this$0, SendOtpResult sendOtpResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.Y1().dismiss();
            if (!StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL001", true)) {
                if (gd1.a.m(sendOtpResult.getStatusDesc())) {
                    return;
                }
                this$0.y2(this$0, sendOtpResult.getStatusDesc());
                return;
            }
            ws6 ws6Var = new ws6(this$0);
            if (this$0.Z1().b() < 2) {
                this$0.mobile_no = ws6Var.l();
            }
            n35.a aVar = n35.a;
            String str = this$0.mobile_no;
            p26 p26VarH2 = this$0.h2();
            String strValueOf = String.valueOf(sendOtpResult.getRecordId());
            d31 d31Var = this$0.binding;
            if (d31Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                d31Var = null;
            }
            this$0.diloge = aVar.m(this$0, this$0, str, p26VarH2, strValueOf, d31Var.g.getText().toString(), "RC", " ", this$0.Y1());
        } catch (Exception unused) {
            this$0.Y1().dismiss();
        }
    }

    public static final void p2(CreateRCAlertsScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.Y1().dismiss();
        this$0.y2(this$0, this$0.e2().b(va3.a.L0(), "Unable to create the virtual RC, Please try after some time"));
    }

    public static final void q2(CreateRCAlertsScreen this$0, CitzValidDoc citzValidDoc) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (!StringsKt__StringsJVMKt.equals$default(citzValidDoc.getStatusCode(), "AL001", false, 2, null)) {
                if (this$0.Y1().isShowing()) {
                    this$0.Y1().dismiss();
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
                    this$0.doc_id = String.valueOf(citizenDocInfo != null ? citizenDocInfo.getDocId() : null);
                    this$0.U1().o(this$0.f2().k(), this$0.doc_id, this$0);
                    return;
                }
                return;
            }
            if (this$0.Y1().isShowing()) {
                this$0.Y1().dismiss();
            }
            if (aVar.m(citzValidDoc.getParam())) {
                Dialog dialog2 = this$0.diloge;
                if (dialog2 != null) {
                    Intrinsics.checkNotNull(dialog2);
                    dialog2.dismiss();
                }
                this$0.y2(this$0, this$0.e2().b(va3.a.L0(), "Unable to create the virtual RC, Please try after some time"));
                return;
            }
            Dialog dialog3 = this$0.diloge;
            if (dialog3 != null) {
                Intrinsics.checkNotNull(dialog3);
                dialog3.dismiss();
            }
            this$0.y2(this$0, citzValidDoc.getParam());
        } catch (Exception unused) {
            if (this$0.Y1().isShowing()) {
                this$0.Y1().dismiss();
            }
            Dialog dialog4 = this$0.diloge;
            if (dialog4 != null) {
                Intrinsics.checkNotNull(dialog4);
                dialog4.dismiss();
            }
            this$0.y2(this$0, this$0.e2().b(va3.a.L0(), "Unable to create the virtual RC, Please try after some time"));
        }
    }

    public static final void r2(CreateRCAlertsScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Log.e("Test", str.toString());
        this$0.Y1().dismiss();
        Dialog dialog = this$0.diloge;
        if (dialog != null) {
            Intrinsics.checkNotNull(dialog);
            dialog.dismiss();
        }
        this$0.y2(this$0, this$0.e2().b(va3.a.L0(), "Unable to create the virtual RC, Please try after some time"));
    }

    public static final void s2(CreateRCAlertsScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.Y1().cancel();
        this$0.y2(this$0, this$0.e2().b(va3.a.J0(), "Unable to add the My Vehicle, Please try after some time"));
    }

    public static final void t2(CreateRCAlertsScreen this$0, ValidateRcSuccess validateRcSuccess) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!StringsKt__StringsJVMKt.equals(validateRcSuccess.getStatusCode(), "NP001", true)) {
            if (validateRcSuccess.getStatusCode().equals("NR090")) {
                hz0.a.Q(this$0.S1(), validateRcSuccess.getStatusDesc(), 1);
                return;
            } else if (validateRcSuccess.getStatusCode().equals("NR091")) {
                hz0.a.Q(this$0.S1(), validateRcSuccess.getStatusDesc(), 2);
                return;
            } else {
                this$0.Y1().dismiss();
                this$0.y2(this$0.S1(), validateRcSuccess.getStatusDesc());
                return;
            }
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
        if (arrayList.isEmpty()) {
            this$0.h2().I(this$0, this$0.f2().l(), 1);
            return;
        }
        ld7 ld7VarI2 = this$0.i2();
        String string = this$0.N1().getText().toString();
        String str = this$0.stateCode;
        d31 d31Var = this$0.binding;
        if (d31Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            d31Var = null;
        }
        ld7VarI2.A0(this$0, string, str, d31Var.d.getText().toString(), this$0.offCode);
    }

    public static final void u2(CreateRCAlertsScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.Y1().dismiss();
        Toast.makeText(this$0.getApplicationContext(), this$0.e2().b(va3.a.L0(), "Unable to add the Virtual RC, Please try again"), 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void x2(Dialog d2, CreateRCAlertsScreen this$0, String str, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        if (this$0.J1().C0(str) != null) {
            String strC0 = this$0.J1().C0(str);
            if (gd1.a.m(strC0)) {
                return;
            }
            this$0.R2(new ProgressDialog(this$0.S1()));
            this$0.Y1().setMessage(this$0.e2().b("label_challan_please_wait", "please wait"));
            this$0.Y1().setCancelable(false);
            this$0.Y1().setCanceledOnTouchOutside(false);
            this$0.Y1().show();
            a55 a55VarU1 = this$0.U1();
            Intrinsics.checkNotNull(strC0);
            a55VarU1.i(strC0, this$0);
        }
    }

    public static final void z2(Dialog d2, CreateRCAlertsScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        this$0.H1().setText((CharSequence) null);
        this$0.K1().setText((CharSequence) null);
        this$0.H1().requestFocus();
    }

    public final void A2(xn xnVar) {
        Intrinsics.checkNotNullParameter(xnVar, "<set-?>");
        this.alerst_adapter = xnVar;
    }

    @Override // com.zepto.nq6
    public void B(String rc_number, int position) {
        if (!com.nic.mparivahan.a.a.a(this)) {
            Toast.makeText(this, e2().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        this.MyRcAdapterPosition = position;
        X2(String.valueOf(rc_number));
        v2(this, e2().b("label_want_to_proceed", "Are you sure, You want to delete ?"), d2());
    }

    public final void B1(Context context, String message, final RcModelsDet details, final String doc_id) {
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
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(e2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(e2().b("btn_ok", "OK"));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.k21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                CreateRCAlertsScreen.C1(dialog, this, details, doc_id, view);
            }
        });
        dialog.show();
    }

    public final void B2(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.alerst_recycle_view = recyclerView;
    }

    public final void C2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.alerts_layout = linearLayout;
    }

    public final xn D1() {
        xn xnVar = this.alerst_adapter;
        if (xnVar != null) {
            return xnVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("alerst_adapter");
        return null;
    }

    public final void D2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.arrayList = arrayList;
    }

    public final RecyclerView E1() {
        RecyclerView recyclerView = this.alerst_recycle_view;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("alerst_recycle_view");
        return null;
    }

    public final void E2(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.chassis_no_et = editText;
    }

    public final LinearLayout F1() {
        LinearLayout linearLayout = this.alerts_layout;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("alerts_layout");
        return null;
    }

    public final void F2(MyTextView myTextView) {
        Intrinsics.checkNotNullParameter(myTextView, "<set-?>");
        this.createvirtualrc = myTextView;
    }

    public final ArrayList G1() {
        ArrayList arrayList = this.arrayList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("arrayList");
        return null;
    }

    public final void G2(DatabaseHelper databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "<set-?>");
        this.databaseHelper = databaseHelper;
    }

    public final EditText H1() {
        EditText editText = this.chassis_no_et;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chassis_no_et");
        return null;
    }

    public final void H2(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.engine_no_et = editText;
    }

    public final MyTextView I1() {
        MyTextView myTextView = this.createvirtualrc;
        if (myTextView != null) {
            return myTextView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("createvirtualrc");
        return null;
    }

    public final void I2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.enter_chassi = str;
    }

    public final DatabaseHelper J1() {
        DatabaseHelper databaseHelper = this.databaseHelper;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("databaseHelper");
        return null;
    }

    public final void J2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.enter_engin = str;
    }

    public final EditText K1() {
        EditText editText = this.engine_no_et;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("engine_no_et");
        return null;
    }

    public final void K2(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.etSearchRC = editText;
    }

    public final String L1() {
        String str = this.enter_chassi;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("enter_chassi");
        return null;
    }

    public final void L2(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final String M1() {
        String str = this.enter_engin;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("enter_engin");
        return null;
    }

    public final void M2(RcService rcService) {
        Intrinsics.checkNotNullParameter(rcService, "<set-?>");
        this.mRcService = rcService;
    }

    public final EditText N1() {
        EditText editText = this.etSearchRC;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("etSearchRC");
        return null;
    }

    public final void N2(a55 a55Var) {
        Intrinsics.checkNotNullParameter(a55Var, "<set-?>");
        this.mRcViewModel = a55Var;
    }

    public final void O2(z21 z21Var) {
        Intrinsics.checkNotNullParameter(z21Var, "<set-?>");
        this.myRcAdapter = z21Var;
    }

    public final void P2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.nexgenarrow = linearLayout;
    }

    public final void Q2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.offCode = str;
    }

    public final void R2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final Context S1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final void S2(dl4 dl4Var) {
        Intrinsics.checkNotNullParameter(dl4Var, "<set-?>");
        this.pSession = dl4Var;
    }

    public final RcService T1() {
        RcService rcService = this.mRcService;
        if (rcService != null) {
            return rcService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRcService");
        return null;
    }

    public final void T2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc = str;
    }

    public final a55 U1() {
        a55 a55Var = this.mRcViewModel;
        if (a55Var != null) {
            return a55Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRcViewModel");
        return null;
    }

    public final void U2(RcModelsDet rcModelsDet) {
        Intrinsics.checkNotNullParameter(rcModelsDet, "<set-?>");
        this.rcdetails = rcModelsDet;
    }

    public final z21 V1() {
        z21 z21Var = this.myRcAdapter;
        if (z21Var != null) {
            return z21Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("myRcAdapter");
        return null;
    }

    public final void V2(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.rec_rc_recycler = recyclerView;
    }

    /* JADX INFO: renamed from: W1, reason: from getter */
    public final int getMyRcAdapterPosition() {
        return this.MyRcAdapterPosition;
    }

    public final void W2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitServiceAddMob = vahanProService;
    }

    public final LinearLayout X1() {
        LinearLayout linearLayout = this.nexgenarrow;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nexgenarrow");
        return null;
    }

    public final void X2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.selectedRcNumber = str;
    }

    public final ProgressDialog Y1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final void Y2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final dl4 Z1() {
        dl4 dl4Var = this.pSession;
        if (dl4Var != null) {
            return dl4Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pSession");
        return null;
    }

    public final void Z2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final RcModelsDet a2() {
        RcModelsDet rcModelsDet = this.rcdetails;
        if (rcModelsDet != null) {
            return rcModelsDet;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final void a3(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCode = str;
    }

    public final RecyclerView b2() {
        RecyclerView recyclerView = this.rec_rc_recycler;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rec_rc_recycler");
        return null;
    }

    public final void b3(p26 p26Var) {
        Intrinsics.checkNotNullParameter(p26Var, "<set-?>");
        this.viewModel = p26Var;
    }

    public final VahanProService c2() {
        VahanProService vahanProService = this.retrofitServiceAddMob;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitServiceAddMob");
        return null;
    }

    public final void c3(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModelAddMob = ld7Var;
    }

    public final String d2() {
        String str = this.selectedRcNumber;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("selectedRcNumber");
        return null;
    }

    public final void d3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.virtualrc_layout = linearLayout;
    }

    public final wa3 e2() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final void e3(Context context, String message) {
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
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(e2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(e2().b("btn_ok", "OK"));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.f21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRCAlertsScreen.f3(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.nq6, com.zepto.br6
    public void f(String rc, Integer position) throws Throwable {
        Intrinsics.checkNotNullParameter(rc, "rc");
        try {
            Intrinsics.checkNotNull(position);
            this.updatePosition = position.intValue();
            J1().C0(rc);
            U1().l(rc, this);
        } catch (Exception unused) {
        }
    }

    @Override // com.zepto.nq6
    public void f0(Integer position) throws Throwable {
        Intrinsics.checkNotNull(position);
        if (position.intValue() > -1) {
            g3();
        }
    }

    public final ws6 f2() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    /* JADX INFO: renamed from: g2, reason: from getter */
    public final int getUpdatePosition() {
        return this.updatePosition;
    }

    public final void g3() throws Throwable {
        if (J1().B() == null) {
            F1().setVisibility(8);
            return;
        }
        if (J1().B().size() <= 0) {
            F1().setVisibility(8);
            return;
        }
        F1().setVisibility(8);
        ArrayList arrayListB = J1().B();
        E1().setAdapter(null);
        Intrinsics.checkNotNull(arrayListB);
        A2(new xn(arrayListB, this));
        E1().setAdapter(D1());
        D1().j();
    }

    public final p26 h2() {
        p26 p26Var = this.viewModel;
        if (p26Var != null) {
            return p26Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final void h3() throws Throwable {
        ArrayList arrayListH0 = J1().H0();
        Intrinsics.checkNotNull(arrayListH0, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.Document>");
        D2(arrayListH0);
        if (G1().size() <= 0) {
            b2().setVisibility(8);
            j2().setVisibility(8);
            return;
        }
        j2().setVisibility(0);
        b2().setVisibility(0);
        z21 z21Var = new z21(G1(), this, this);
        Intrinsics.checkNotNull(z21Var);
        O2(z21Var);
        b2().setAdapter(V1());
    }

    public final ld7 i2() {
        ld7 ld7Var = this.viewModelAddMob;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelAddMob");
        return null;
    }

    public final LinearLayout j2() {
        LinearLayout linearLayout = this.virtualrc_layout;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("virtualrc_layout");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        d31 d31VarC = d31.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(d31VarC, "inflate(...)");
        this.binding = d31VarC;
        SignService signService = null;
        if (d31VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            d31VarC = null;
        }
        setContentView(d31VarC.b());
        getWindow().addFlags(128);
        L2(this);
        Z2(new ws6(this));
        S2(new dl4(this));
        ta3.a aVar = ta3.a;
        Context contextS1 = S1();
        d31 d31Var = this.binding;
        if (d31Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            d31Var = null;
        }
        aVar.n0(contextS1, d31Var);
        Y2(new wa3(S1()));
        M2(RcService.INSTANCE.a(this));
        DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(S1());
        Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
        G2(databaseHelperD0);
        N2((a55) new z(this, new b55(new s45(T1()))).a(a55.class));
        this.retrofitService = SignService.INSTANCE.a(this);
        W2(VahanProService.INSTANCE.a(this));
        SignService signService2 = this.retrofitService;
        if (signService2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        } else {
            signService = signService2;
        }
        b3((p26) new z(this, new a26(new c26(signService))).a(p26.class));
        c3((ld7) new z(this, new kd7(new jd7(c2()))).a(ld7.class));
        O1();
        U1().R().g(this, new mf4() { // from class: com.zepto.d21
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                CreateRCAlertsScreen.k2(this.a, (RcModelsDet) obj);
            }
        });
        U1().s().g(this, new mf4() { // from class: com.zepto.o21
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                CreateRCAlertsScreen.l2(this.a, (String) obj);
            }
        });
        h2().u().g(this, new mf4() { // from class: com.zepto.p21
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                CreateRCAlertsScreen.o2(this.a, (SendOtpResult) obj);
            }
        });
        h2().t().g(this, new mf4() { // from class: com.zepto.q21
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                CreateRCAlertsScreen.p2(this.a, (String) obj);
            }
        });
        h2().x().g(this, new mf4() { // from class: com.zepto.r21
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                CreateRCAlertsScreen.q2(this.a, (CitzValidDoc) obj);
            }
        });
        h2().k().g(this, new mf4() { // from class: com.zepto.s21
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                CreateRCAlertsScreen.r2(this.a, (String) obj);
            }
        });
        h2().A().g(this, new i(new g()));
        h2().z().g(this, new i(new h()));
        U1().Y().g(this, new mf4() { // from class: com.zepto.t21
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                CreateRCAlertsScreen.s2(this.a, (String) obj);
            }
        });
        U1().V().g(this, new mf4() { // from class: com.zepto.u21
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                CreateRCAlertsScreen.t2(this.a, (ValidateRcSuccess) obj);
            }
        });
        U1().W().g(this, new mf4() { // from class: com.zepto.v21
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                CreateRCAlertsScreen.u2(this.a, (String) obj);
            }
        });
        i2().x0().g(this, new mf4() { // from class: com.zepto.e21
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                CreateRCAlertsScreen.m2(this.a, (String) obj);
            }
        });
        i2().y0().g(this, new mf4() { // from class: com.zepto.n21
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                CreateRCAlertsScreen.n2(this.a, (String) obj);
            }
        });
        U1().p().g(this, new i(new f()));
    }

    public final void v2(Context context, String message, final String rc_number) {
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
        ((TextView) viewFindViewById4).setText(e2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(e2().b("radio_dl_serv_yes", "Proceed"));
        textView2.setText(e2().b("radio_dl_serv_no", "No"));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.l21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRCAlertsScreen.w2(dialog, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.m21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                CreateRCAlertsScreen.x2(dialog, this, rc_number, view);
            }
        });
        dialog.show();
    }

    public final void y2(Context context, String message) {
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
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(e2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(e2().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.j21
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreateRCAlertsScreen.z2(dialog, this, view);
            }
        });
        dialog.show();
    }
}
