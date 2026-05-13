package com.nic.mparivahan.Dl;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.Account.Model.ResendOtp;
import com.nic.mparivahan.Account.Model.SendOtpResult;
import com.nic.mparivahan.Account.SignService;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dl.DlInterface.DlService;
import com.nic.mparivahan.Dl.Model.BioObjX;
import com.nic.mparivahan.Dl.Model.DLDocument;
import com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.Dl.Model.DlobjX;
import com.nic.mparivahan.Dl.NewDlSearch;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.CitizenDocInfoX;
import com.nic.mparivahan.RC.Model.CitzValidDoc;
import com.nic.mparivahan.RC.Model.CreateVirtualDocModle;
import com.nic.mparivahan.RC.Model.GetVirtualDocDetails;
import com.nic.mparivahan.RC.Model.MyRcDeletResponse;
import com.nic.mparivahan.RC.RcInterface.RcService;
import com.zepto.a26;
import com.zepto.a55;
import com.zepto.ae;
import com.zepto.b55;
import com.zepto.c26;
import com.zepto.gd1;
import com.zepto.hz0;
import com.zepto.is1;
import com.zepto.jp1;
import com.zepto.js1;
import com.zepto.k18;
import com.zepto.km1;
import com.zepto.mf4;
import com.zepto.n35;
import com.zepto.p26;
import com.zepto.pq;
import com.zepto.s45;
import com.zepto.ta3;
import com.zepto.va3;
import com.zepto.wa3;
import com.zepto.ws6;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001c\u0010\f\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014J\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005J6\u0010\u0015\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u0013J\u001e\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u0002J\u0018\u0010\u001d\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001c\u001a\u00020\u0005R\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010<\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010C\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010O\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010>\u001a\u0004\bM\u0010@\"\u0004\bN\u0010BR\"\u0010S\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010>\u001a\u0004\bQ\u0010@\"\u0004\bR\u0010BR\"\u0010W\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010>\u001a\u0004\bU\u0010@\"\u0004\bV\u0010BR$\u0010^\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010f\u001a\u0004\u0018\u00010_8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR*\u0010o\u001a\n h*\u0004\u0018\u00010g0g8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010w\u001a\u00020p8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010{\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bx\u0010Y\u001a\u0004\by\u0010[\"\u0004\bz\u0010]R$\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R*\u0010\u0089\u0001\u001a\u00030\u0082\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R&\u0010\u008d\u0001\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010F\u001a\u0005\b\u008b\u0001\u0010H\"\u0005\b\u008c\u0001\u0010JR*\u0010\u0095\u0001\u001a\u00030\u008e\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R*\u0010\u009d\u0001\u001a\u00030\u0096\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R*\u0010¡\u0001\u001a\u00030\u0096\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u0098\u0001\u001a\u0006\b\u009f\u0001\u0010\u009a\u0001\"\u0006\b \u0001\u0010\u009c\u0001R*\u0010©\u0001\u001a\u00030¢\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R\u001a\u0010\u00ad\u0001\u001a\u00030ª\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R*\u0010µ\u0001\u001a\u00030®\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001\"\u0006\b³\u0001\u0010´\u0001R*\u0010½\u0001\u001a\u00030¶\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R*\u0010Å\u0001\u001a\u00030¾\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¿\u0001\u0010À\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001\"\u0006\bÃ\u0001\u0010Ä\u0001R\u001a\u0010É\u0001\u001a\u00030Æ\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001¨\u0006Ì\u0001"}, d2 = {"Lcom/nic/mparivahan/Dl/NewDlSearch;", "Lcom/zepto/pq;", "", "a2", "s3", "", "str", "", "O1", "Landroid/content/Context;", "context", "message", "Q2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "T2", "docnumber", "doc_id", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "dlobj", "P1", "Landroid/widget/EditText;", "editText", "Landroid/view/View;", "mView", "x2", "r3", "dl_number", "L2", "Lcom/zepto/is1;", "C", "Lcom/zepto/is1;", "t2", "()Lcom/zepto/is1;", "h3", "(Lcom/zepto/is1;)V", "mDlViewModel", "Lcom/nic/mparivahan/Dl/DlInterface/DlService;", "D", "Lcom/nic/mparivahan/Dl/DlInterface/DlService;", "s2", "()Lcom/nic/mparivahan/Dl/DlInterface/DlService;", "g3", "(Lcom/nic/mparivahan/Dl/DlInterface/DlService;)V", "mDlService", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "y2", "()Landroid/app/ProgressDialog;", "l3", "(Landroid/app/ProgressDialog;)V", "pDialog", "F", "Landroid/content/Context;", "r2", "()Landroid/content/Context;", "f3", "(Landroid/content/Context;)V", "mContext", "G", "Landroid/widget/EditText;", "Z1", "()Landroid/widget/EditText;", "d3", "(Landroid/widget/EditText;)V", "etSearchDL", "Landroid/widget/LinearLayout;", "H", "Landroid/widget/LinearLayout;", "q2", "()Landroid/widget/LinearLayout;", "e3", "(Landroid/widget/LinearLayout;)V", "llSearchDL", "I", "W1", "a3", "dobDateMain", "J", "X1", "b3", "dobMonthMain", "K", "Y1", "c3", "dobYearMain", "L", "Ljava/lang/String;", "T1", "()Ljava/lang/String;", "X2", "(Ljava/lang/String;)V", "dateValeMain", "Landroid/app/Dialog;", "M", "Landroid/app/Dialog;", "getDiloge", "()Landroid/app/Dialog;", "setDiloge", "(Landroid/app/Dialog;)V", "diloge", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "N", "Ljava/util/Calendar;", "R1", "()Ljava/util/Calendar;", "setCal", "(Ljava/util/Calendar;)V", "cal", "Lcom/zepto/ws6;", "O", "Lcom/zepto/ws6;", "C2", "()Lcom/zepto/ws6;", "p3", "(Lcom/zepto/ws6;)V", "userSessionManager", "P", "getD_number", "V2", "d_number", "Q", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "V1", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "Z2", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "R", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "S1", "()Lcom/nic/mparivahan/DB/DatabaseHelper;", "W2", "(Lcom/nic/mparivahan/DB/DatabaseHelper;)V", "databaseHelper", "S", "w2", "k3", "nexgenarrow", "Landroidx/recyclerview/widget/RecyclerView;", "T", "Landroidx/recyclerview/widget/RecyclerView;", "z2", "()Landroidx/recyclerview/widget/RecyclerView;", "m3", "(Landroidx/recyclerview/widget/RecyclerView;)V", "recyclerList", "Landroid/widget/ImageView;", "U", "Landroid/widget/ImageView;", "U1", "()Landroid/widget/ImageView;", "Y2", "(Landroid/widget/ImageView;)V", "date_img", "V", "A2", "n3", "refresh", "Lcom/zepto/wa3;", "W", "Lcom/zepto/wa3;", "B2", "()Lcom/zepto/wa3;", "o3", "(Lcom/zepto/wa3;)V", "session", "Lcom/zepto/ae;", "X", "Lcom/zepto/ae;", "binding", "Lcom/zepto/a55;", "Y", "Lcom/zepto/a55;", "v2", "()Lcom/zepto/a55;", "j3", "(Lcom/zepto/a55;)V", "mRcViewModel", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "Z", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "u2", "()Lcom/nic/mparivahan/RC/RcInterface/RcService;", "i3", "(Lcom/nic/mparivahan/RC/RcInterface/RcService;)V", "mRcService", "Lcom/zepto/p26;", "a0", "Lcom/zepto/p26;", "D2", "()Lcom/zepto/p26;", "q3", "(Lcom/zepto/p26;)V", "viewModel", "Lcom/nic/mparivahan/Account/SignService;", "b0", "Lcom/nic/mparivahan/Account/SignService;", "retrofitService", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nNewDlSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewDlSearch.kt\ncom/nic/mparivahan/Dl/NewDlSearch\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,1461:1\n107#2:1462\n79#2,22:1463\n107#2:1485\n79#2,22:1486\n107#2:1508\n79#2,22:1509\n107#2:1531\n79#2,29:1532\n107#2:1561\n79#2,29:1562\n*S KotlinDebug\n*F\n+ 1 NewDlSearch.kt\ncom/nic/mparivahan/Dl/NewDlSearch\n*L\n537#1:1462\n537#1:1463,22\n547#1:1485\n547#1:1486,22\n550#1:1508\n550#1:1509,22\n1437#1:1531\n1437#1:1532,29\n1439#1:1561\n1439#1:1562,29\n*E\n"})
public final class NewDlSearch extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public is1 mDlViewModel;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public DlService mDlService;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public EditText etSearchDL;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public LinearLayout llSearchDL;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public EditText dobDateMain;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public EditText dobMonthMain;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public EditText dobYearMain;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String dateValeMain;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public Dialog diloge;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public Calendar cal = Calendar.getInstance();

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public ws6 userSessionManager;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String d_number;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public DldetobjX dlobj;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public DatabaseHelper databaseHelper;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public LinearLayout nexgenarrow;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public RecyclerView recyclerList;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public ImageView date_img;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public ImageView refresh;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public ae binding;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public a55 mRcViewModel;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public RcService mRcService;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public p26 viewModel;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public SignService retrofitService;

    public static final class a implements View.OnClickListener {
        public final /* synthetic */ n b;

        public a(n nVar) {
            this.b = nVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            DatePickerDialog datePickerDialog = new DatePickerDialog(NewDlSearch.this.r2(), this.b, NewDlSearch.this.getCal().get(1), NewDlSearch.this.getCal().get(2), NewDlSearch.this.getCal().get(5));
            datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
            datePickerDialog.show();
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
        public final void a(DLServiceResponseModleV1 dLServiceResponseModleV1) throws Throwable {
            try {
                NewDlSearch.this.y2().dismiss();
                NewDlSearch.this.S1().P0(StringsKt__StringsKt.trim((CharSequence) dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlLicno()).toString(), dLServiceResponseModleV1.getDldetobj().get(0));
                NewDlSearch newDlSearch = NewDlSearch.this;
                newDlSearch.T2(newDlSearch, newDlSearch.B2().b(va3.a.l(), "Virtual DL successfully updated!"));
            } catch (Exception e) {
                e.printStackTrace();
                NewDlSearch.this.y2().dismiss();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((DLServiceResponseModleV1) obj);
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
            try {
                NewDlSearch.this.y2().dismiss();
            } catch (Exception e) {
                e.printStackTrace();
            }
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
        public final void a(MyRcDeletResponse myRcDeletResponse) throws Throwable {
            DlobjX dlobj;
            NewDlSearch.this.y2().dismiss();
            if (!StringsKt__StringsJVMKt.equals(myRcDeletResponse.getStatusCode(), "VTLD001", true)) {
                if (StringsKt__StringsJVMKt.equals(myRcDeletResponse.getStatusCode(), "VTLD099", true)) {
                    NewDlSearch.this.y2().dismiss();
                    NewDlSearch newDlSearch = NewDlSearch.this;
                    newDlSearch.T2(newDlSearch, myRcDeletResponse.getStatusDesc());
                    return;
                } else {
                    if (gd1.a.m(myRcDeletResponse.getStatusDesc())) {
                        NewDlSearch.this.y2().dismiss();
                        return;
                    }
                    NewDlSearch.this.y2().dismiss();
                    NewDlSearch newDlSearch2 = NewDlSearch.this;
                    newDlSearch2.T2(newDlSearch2, myRcDeletResponse.getStatusDesc());
                    return;
                }
            }
            if (!gd1.a.m(myRcDeletResponse.getStatusDesc())) {
                NewDlSearch newDlSearch3 = NewDlSearch.this;
                newDlSearch3.T2(newDlSearch3, newDlSearch3.B2().b(va3.a.a1(), "Virtual DL successfully deleted!"));
            }
            NewDlSearch.this.S1().e0();
            String dlLicno = null;
            ae aeVar = null;
            dlLicno = null;
            if (NewDlSearch.this.S1().z0() == null) {
                ae aeVar2 = NewDlSearch.this.binding;
                if (aeVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    aeVar2 = null;
                }
                aeVar2.t.setVisibility(8);
                ae aeVar3 = NewDlSearch.this.binding;
                if (aeVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    aeVar = aeVar3;
                }
                aeVar.B.setVisibility(8);
                return;
            }
            try {
                ae aeVar4 = NewDlSearch.this.binding;
                if (aeVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    aeVar4 = null;
                }
                aeVar4.t.setVisibility(8);
                NewDlSearch.this.z2().setVisibility(8);
                ArrayList arrayListZ0 = NewDlSearch.this.S1().z0();
                Intrinsics.checkNotNullExpressionValue(arrayListZ0, "getDLDetailsList(...)");
                NewDlSearch.this.z2().setLayoutManager(new LinearLayoutManager(NewDlSearch.this, 0, false));
                NewDlSearch.this.z2().setAdapter(new km1(NewDlSearch.this, arrayListZ0));
                ArrayList arrayListZ02 = NewDlSearch.this.S1().z0();
                Intrinsics.checkNotNullExpressionValue(arrayListZ02, "getDLDetailsList(...)");
                if (((DLDocument) arrayListZ02.get(0)).getDldetails() != null) {
                    ae aeVar5 = NewDlSearch.this.binding;
                    if (aeVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        aeVar5 = null;
                    }
                    aeVar5.B.setVisibility(0);
                    ae aeVar6 = NewDlSearch.this.binding;
                    if (aeVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        aeVar6 = null;
                    }
                    TextView textView = aeVar6.q;
                    DldetobjX dldetails = ((DLDocument) arrayListZ02.get(0)).getDldetails();
                    if (dldetails != null && (dlobj = dldetails.getDlobj()) != null) {
                        dlLicno = dlobj.getDlLicno();
                    }
                    textView.setText(dlLicno);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
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
            NewDlSearch.this.y2().dismiss();
            NewDlSearch newDlSearch = NewDlSearch.this;
            newDlSearch.T2(newDlSearch, newDlSearch.B2().b(va3.a.F0(), "Unable to delete the virtual DL, Please try after some time"));
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
        public final void a(ResendOtp resendOtp) {
            NewDlSearch.this.y2().dismiss();
            try {
                if (StringsKt__StringsJVMKt.equals(resendOtp.getStatusCode(), "AL001", true)) {
                    NewDlSearch newDlSearch = NewDlSearch.this;
                    Toast.makeText(newDlSearch, newDlSearch.B2().b("label_log_resend_otp", "We have resent the OTP Verification to your mobile number"), 1).show();
                } else if (gd1.a.m(resendOtp.getStatusDesc())) {
                    NewDlSearch.this.y2().dismiss();
                    NewDlSearch newDlSearch2 = NewDlSearch.this;
                    newDlSearch2.T2(newDlSearch2, newDlSearch2.B2().b("label_log_invalid_otp", "The OTP you entered is invalid, Please enter the correct OTP"));
                } else {
                    Toast.makeText(NewDlSearch.this, resendOtp.getStatusDesc(), 1).show();
                }
            } catch (Exception unused) {
                NewDlSearch.this.y2().dismiss();
                NewDlSearch newDlSearch3 = NewDlSearch.this;
                newDlSearch3.T2(newDlSearch3, newDlSearch3.B2().b("label_log_unbl_resend_otp", "Unable to resend the OTP, Please try after sometime."));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ResendOtp) obj);
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
            NewDlSearch.this.y2().dismiss();
            NewDlSearch newDlSearch = NewDlSearch.this;
            newDlSearch.T2(newDlSearch, newDlSearch.B2().b("label_log_unbl_resend_otp", "Unable to resend the OTP, Please try after sometime."));
        }
    }

    public static final class h implements TextWatcher {
        public h() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            if (s.length() >= 2) {
                NewDlSearch.this.X1().setFocusableInTouchMode(true);
            }
        }
    }

    public static final class i implements TextWatcher {
        public i() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            if (s.length() >= 2) {
                NewDlSearch.this.Y1().setFocusableInTouchMode(true);
            }
        }
    }

    public static final class j implements TextWatcher {
        public j() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            NewDlSearch.this.W1().requestFocus();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            if (i == 1 && i2 == 0) {
                NewDlSearch.this.X1().requestFocus();
            }
            String string = s.toString();
            int length = string.length() - 1;
            int i4 = 0;
            boolean z = false;
            while (i4 <= length) {
                boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i4 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i4++;
                } else {
                    z = true;
                }
            }
            if (string.subSequence(i4, length + 1).toString().length() == 2) {
                String string2 = s.toString();
                int length2 = string2.length() - 1;
                int i5 = 0;
                boolean z3 = false;
                while (i5 <= length2) {
                    boolean z4 = Intrinsics.compare((int) string2.charAt(!z3 ? i5 : length2), 32) <= 0;
                    if (z3) {
                        if (!z4) {
                            break;
                        } else {
                            length2--;
                        }
                    } else if (z4) {
                        i5++;
                    } else {
                        z3 = true;
                    }
                }
                int i6 = Integer.parseInt(string2.subSequence(i5, length2 + 1).toString());
                if (i6 == 0 || i6 > 31) {
                    NewDlSearch.this.W1().setText("");
                }
            }
        }
    }

    public static final class k implements TextWatcher {
        public k() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            NewDlSearch.this.X1().requestFocus();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            if (i == 1 && i2 == 0) {
                NewDlSearch.this.Y1().requestFocus();
            }
            String string = s.toString();
            int length = string.length() - 1;
            int i4 = 0;
            boolean z = false;
            while (i4 <= length) {
                boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i4 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i4++;
                } else {
                    z = true;
                }
            }
            if (string.subSequence(i4, length + 1).toString().length() == 2) {
                String string2 = s.toString();
                int length2 = string2.length() - 1;
                int i5 = 0;
                boolean z3 = false;
                while (i5 <= length2) {
                    boolean z4 = Intrinsics.compare((int) string2.charAt(!z3 ? i5 : length2), 32) <= 0;
                    if (z3) {
                        if (!z4) {
                            break;
                        } else {
                            length2--;
                        }
                    } else if (z4) {
                        i5++;
                    } else {
                        z3 = true;
                    }
                }
                int i6 = Integer.parseInt(string2.subSequence(i5, length2 + 1).toString());
                if (i6 == 0 || i6 > 12) {
                    NewDlSearch.this.X1().setText("");
                }
            }
        }
    }

    public static final class l implements TextWatcher {
        public l() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            String string = s.toString();
            int length = string.length() - 1;
            int i4 = 0;
            boolean z = false;
            while (i4 <= length) {
                boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i4 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i4++;
                } else {
                    z = true;
                }
            }
            if (string.subSequence(i4, length + 1).toString().length() == 4) {
                String string2 = s.toString();
                int length2 = string2.length() - 1;
                int i5 = 0;
                boolean z3 = false;
                while (i5 <= length2) {
                    boolean z4 = Intrinsics.compare((int) string2.charAt(!z3 ? i5 : length2), 32) <= 0;
                    if (z3) {
                        if (!z4) {
                            break;
                        } else {
                            length2--;
                        }
                    } else if (z4) {
                        i5++;
                    } else {
                        z3 = true;
                    }
                }
                int i6 = Integer.parseInt(string2.subSequence(i5, length2 + 1).toString());
                if (i6 == 0 || i6 < 1900) {
                    NewDlSearch.this.Y1().setText("");
                }
            }
        }
    }

    public static final class m implements DatePickerDialog.OnDateSetListener {
        public m() {
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker view, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(view, "view");
            NewDlSearch.this.getCal().set(1, i);
            NewDlSearch.this.getCal().set(2, i2);
            NewDlSearch.this.getCal().set(5, i3);
            NewDlSearch.this.s3();
        }
    }

    public static final class n implements DatePickerDialog.OnDateSetListener {
        public n() {
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker view, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(view, "view");
            NewDlSearch.this.getCal().set(1, i);
            NewDlSearch.this.getCal().set(2, i2);
            NewDlSearch.this.getCal().set(5, i3);
            CharSequence charSequence = DateFormat.format("dd", NewDlSearch.this.getCal().getTime());
            Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type kotlin.String");
            String str = (String) charSequence;
            CharSequence charSequence2 = DateFormat.format("MM", NewDlSearch.this.getCal().getTime());
            Intrinsics.checkNotNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) charSequence2;
            CharSequence charSequence3 = DateFormat.format("yyyy", NewDlSearch.this.getCal().getTime());
            Intrinsics.checkNotNull(charSequence3, "null cannot be cast to non-null type kotlin.String");
            String str3 = (String) charSequence3;
            try {
                ae aeVar = NewDlSearch.this.binding;
                if (aeVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    aeVar = null;
                }
                aeVar.c.setText(str + '-' + str2 + '-' + str3);
                NewDlSearch.this.X2(str3 + '-' + str2 + '-' + str);
            } catch (Exception unused) {
            }
        }
    }

    public static final class o extends Lambda implements Function1 {
        public o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            NewDlSearch.this.y2().dismiss();
        }
    }

    public static final class p extends Lambda implements Function1 {
        public p() {
            super(1);
        }

        public final void a(GetVirtualDocDetails getVirtualDocDetails) {
            if (StringsKt__StringsJVMKt.equals(getVirtualDocDetails.getStatusCode(), "VTLD005", true)) {
                NewDlSearch.this.y2().dismiss();
                return;
            }
            if (!StringsKt__StringsJVMKt.equals(getVirtualDocDetails.getStatusCode(), "VTLD001", true)) {
                NewDlSearch.this.y2().dismiss();
                return;
            }
            int size = getVirtualDocDetails.getMparCitizenDocInfo().size();
            String strValueOf = null;
            for (int i = 0; i < size; i++) {
                if (StringsKt__StringsJVMKt.equals(StringsKt__StringsKt.trim((CharSequence) getVirtualDocDetails.getMparCitizenDocInfo().get(i).getDocType()).toString(), "DL", true)) {
                    strValueOf = String.valueOf(getVirtualDocDetails.getMparCitizenDocInfo().get(i).getDocId());
                }
            }
            if (strValueOf != null) {
                NewDlSearch.this.v2().g(strValueOf, NewDlSearch.this);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetVirtualDocDetails) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class q extends Lambda implements Function1 {
        public q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            NewDlSearch.this.y2().dismiss();
        }
    }

    public static final class r extends Lambda implements Function1 {
        public r() {
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
            if (!StringsKt__StringsJVMKt.equals(myRcDeletResponse.getStatusCode(), "VTLD001", true)) {
                if (gd1.a.m(myRcDeletResponse.getStatusDesc())) {
                    NewDlSearch.this.y2().dismiss();
                    return;
                } else {
                    NewDlSearch newDlSearch = NewDlSearch.this;
                    newDlSearch.T2(newDlSearch, myRcDeletResponse.getStatusDesc());
                    return;
                }
            }
            if (!gd1.a.m(myRcDeletResponse.getStatusDesc())) {
                NewDlSearch newDlSearch2 = NewDlSearch.this;
                newDlSearch2.T2(newDlSearch2, myRcDeletResponse.getStatusDesc());
            }
            NewDlSearch.this.V1().getDlobj().getDlLicno();
            NewDlSearch.this.S1().e0();
            NewDlSearch newDlSearch3 = NewDlSearch.this;
            k18.a aVar = k18.a;
            String dateValeMain = newDlSearch3.getDateValeMain();
            Intrinsics.checkNotNull(dateValeMain);
            newDlSearch3.X2(aVar.b(StringsKt__StringsKt.trim((CharSequence) dateValeMain).toString()));
            p26 p26VarD2 = NewDlSearch.this.D2();
            NewDlSearch newDlSearch4 = NewDlSearch.this;
            p26VarD2.I(newDlSearch4, newDlSearch4.C2().l(), 2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((MyRcDeletResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class s implements View.OnClickListener {
        public final /* synthetic */ Context a;
        public final /* synthetic */ x b;
        public final /* synthetic */ Ref.ObjectRef c;

        public s(Context context, x xVar, Ref.ObjectRef objectRef) {
            this.a = context;
            this.b = xVar;
            this.c = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            DatePickerDialog datePickerDialog = new DatePickerDialog(this.a, this.b, ((Calendar) this.c.element).get(1), ((Calendar) this.c.element).get(2), ((Calendar) this.c.element).get(5));
            datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
            datePickerDialog.show();
        }
    }

    public static final class t implements TextWatcher {
        public final /* synthetic */ EditText a;

        public t(EditText editText) {
            this.a = editText;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            if (s.length() >= 2) {
                this.a.setFocusableInTouchMode(true);
            }
        }
    }

    public static final class u implements TextWatcher {
        public final /* synthetic */ EditText a;
        public final /* synthetic */ EditText b;

        public u(EditText editText, EditText editText2) {
            this.a = editText;
            this.b = editText2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            this.a.requestFocus();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            if (i == 1 && i2 == 0) {
                this.b.requestFocus();
            }
            String string = s.toString();
            int length = string.length() - 1;
            int i4 = 0;
            boolean z = false;
            while (i4 <= length) {
                boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i4 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i4++;
                } else {
                    z = true;
                }
            }
            if (string.subSequence(i4, length + 1).toString().length() == 2) {
                String string2 = s.toString();
                int length2 = string2.length() - 1;
                int i5 = 0;
                boolean z3 = false;
                while (i5 <= length2) {
                    boolean z4 = Intrinsics.compare((int) string2.charAt(!z3 ? i5 : length2), 32) <= 0;
                    if (z3) {
                        if (!z4) {
                            break;
                        } else {
                            length2--;
                        }
                    } else if (z4) {
                        i5++;
                    } else {
                        z3 = true;
                    }
                }
                int i6 = Integer.parseInt(string2.subSequence(i5, length2 + 1).toString());
                if (i6 == 0 || i6 > 31) {
                    this.a.setText("");
                }
            }
        }
    }

    public static final class v implements TextWatcher {
        public final /* synthetic */ EditText a;

        public v(EditText editText) {
            this.a = editText;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            if (s.length() >= 2) {
                this.a.setFocusableInTouchMode(true);
            }
        }
    }

    public static final class w implements TextWatcher {
        public final /* synthetic */ EditText a;
        public final /* synthetic */ EditText b;

        public w(EditText editText, EditText editText2) {
            this.a = editText;
            this.b = editText2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            this.a.requestFocus();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            if (i == 1 && i2 == 0) {
                this.b.requestFocus();
            }
            String string = s.toString();
            int length = string.length() - 1;
            int i4 = 0;
            boolean z = false;
            while (i4 <= length) {
                boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i4 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i4++;
                } else {
                    z = true;
                }
            }
            if (string.subSequence(i4, length + 1).toString().length() == 2) {
                String string2 = s.toString();
                int length2 = string2.length() - 1;
                int i5 = 0;
                boolean z3 = false;
                while (i5 <= length2) {
                    boolean z4 = Intrinsics.compare((int) string2.charAt(!z3 ? i5 : length2), 32) <= 0;
                    if (z3) {
                        if (!z4) {
                            break;
                        } else {
                            length2--;
                        }
                    } else if (z4) {
                        i5++;
                    } else {
                        z3 = true;
                    }
                }
                int i6 = Integer.parseInt(string2.subSequence(i5, length2 + 1).toString());
                if (i6 == 0 || i6 > 12) {
                    this.a.setText("");
                }
            }
        }
    }

    public static final class x implements DatePickerDialog.OnDateSetListener {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ EditText b;
        public final /* synthetic */ EditText c;
        public final /* synthetic */ EditText d;

        public x(Ref.ObjectRef objectRef, EditText editText, EditText editText2, EditText editText3) {
            this.a = objectRef;
            this.b = editText;
            this.c = editText2;
            this.d = editText3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker view, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(view, "view");
            ((Calendar) this.a.element).set(1, i);
            ((Calendar) this.a.element).set(2, i2);
            ((Calendar) this.a.element).set(5, i3);
            CharSequence charSequence = DateFormat.format("dd", ((Calendar) this.a.element).getTime());
            Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type kotlin.String");
            String str = (String) charSequence;
            CharSequence charSequence2 = DateFormat.format("MM", ((Calendar) this.a.element).getTime());
            Intrinsics.checkNotNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) charSequence2;
            CharSequence charSequence3 = DateFormat.format("yyyy", ((Calendar) this.a.element).getTime());
            Intrinsics.checkNotNull(charSequence3, "null cannot be cast to non-null type kotlin.String");
            String str3 = (String) charSequence3;
            try {
                this.b.setText(str);
                this.c.setText(str2);
                this.d.setText(str3);
                this.b.clearFocus();
                this.c.clearFocus();
                this.d.clearFocus();
            } catch (Exception unused) {
            }
        }
    }

    public static final class y implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public y(Function1 function) {
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

    public static final void E2(NewDlSearch this$0, CreateVirtualDocModle createVirtualDocModle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.y2().dismiss();
        if (StringsKt__StringsJVMKt.equals(createVirtualDocModle.getStatusCode(), "VTLD005", true)) {
            this$0.T2(this$0.r2(), createVirtualDocModle.getStatusDesc().toString());
            return;
        }
        if (StringsKt__StringsJVMKt.equals(createVirtualDocModle.getStatusCode(), "VTLD001", true)) {
            this$0.P1(this$0.r2(), this$0.B2().b(va3.a.k(), "Virtual DL Successfully Created!"), createVirtualDocModle.getCitizenDocInfo().getDocNumber().toString(), String.valueOf(createVirtualDocModle.getCitizenDocInfo().getDocId()), this$0.V1());
            return;
        }
        if (!StringsKt__StringsJVMKt.equals(createVirtualDocModle.getStatusCode(), "VTLD014", true)) {
            if (gd1.a.m(createVirtualDocModle.getStatusDesc())) {
                this$0.T2(this$0.r2(), this$0.B2().b(va3.a.K0(), "Unable to Create the Virtual DL, Please try after some time."));
                return;
            } else {
                this$0.T2(this$0.r2(), createVirtualDocModle.getStatusDesc().toString());
                return;
            }
        }
        if (this$0.S1().z0() != null) {
            this$0.T2(this$0.r2(), createVirtualDocModle.getStatusDesc().toString());
            return;
        }
        try {
            this$0.y2().show();
            this$0.v2().X(this$0.C2().k(), this$0);
        } catch (Exception unused) {
        }
    }

    public static final void F2(NewDlSearch this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.y2().dismiss();
        this$0.T2(this$0.r2(), this$0.B2().b(va3.a.K0(), "Unable to Create the Virtual DL, Please try after some time."));
    }

    public static final void G2(NewDlSearch this$0, DLServiceResponseModleV1 dLServiceResponseModleV1) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (!gd1.a.m(dLServiceResponseModleV1.getStatusCode())) {
                this$0.y2().dismiss();
                if (StringsKt__StringsJVMKt.equals$default(dLServiceResponseModleV1.getStatusCode(), "NR090", false, 2, null)) {
                    this$0.y2().dismiss();
                    hz0.a.Q(this$0.r2(), dLServiceResponseModleV1.getStatusDesc(), 1);
                } else if (StringsKt__StringsJVMKt.equals$default(dLServiceResponseModleV1.getStatusCode(), "NR091", false, 2, null)) {
                    this$0.y2().dismiss();
                    hz0.a.Q(this$0.r2(), dLServiceResponseModleV1.getStatusDesc(), 2);
                }
            } else if (dLServiceResponseModleV1.getDldetobj().get(0).getErrorcd() == 0) {
                this$0.Z2(dLServiceResponseModleV1.getDldetobj().get(0));
                this$0.V1().getDlobj().getDlLicno();
                this$0.V1().getDlobj().getDlLicno();
                k18.a aVar = k18.a;
                String str = this$0.dateValeMain;
                Intrinsics.checkNotNull(str);
                this$0.dateValeMain = aVar.b(StringsKt__StringsKt.trim((CharSequence) str).toString());
                this$0.D2().I(this$0, this$0.C2().l(), 2);
            } else {
                this$0.y2().dismiss();
                if (dLServiceResponseModleV1.getDldetobj().get(0).getErrorcd() == -2) {
                    this$0.T2(this$0.r2(), this$0.B2().b("kindly_etner_correct_details", "Kindly enter correct details"));
                } else {
                    this$0.T2(this$0.r2(), this$0.B2().b("no_details", "No Details are available."));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            this$0.y2().dismiss();
        }
    }

    public static final void H2(NewDlSearch this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.y2().dismiss();
        this$0.T2(this$0.r2(), this$0.B2().b("no_details", "No Details are available."));
    }

    public static final void I2(NewDlSearch this$0, DLServiceResponseModleV1 dLServiceResponseModleV1) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (dLServiceResponseModleV1.getDldetobj().get(0).getErrorcd() != 0) {
                this$0.y2().dismiss();
                dLServiceResponseModleV1.getDldetobj().get(0).getErrorcd();
                return;
            }
            this$0.Z2(dLServiceResponseModleV1.getDldetobj().get(0));
            this$0.V1().getDlobj().getDlLicno();
            String dlLicno = this$0.V1().getDlobj().getDlLicno();
            String strB0 = this$0.S1().B0(dlLicno);
            if (strB0.equals("0")) {
                strB0 = this$0.S1().B0(new Regex("\\s").replace(dlLicno, ""));
            }
            if (strB0 != null && strB0.length() != 0) {
                a55 a55VarV2 = this$0.v2();
                Intrinsics.checkNotNull(strB0);
                a55VarV2.g(strB0, this$0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void J2(NewDlSearch this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.y2().dismiss();
    }

    public static final void K2(NewDlSearch this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.startActivity(new Intent(this$0, (Class<?>) DLVirtualRcScreen.class));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final boolean M2(TextView textView, int i2, KeyEvent keyEvent) {
        return i2 == 3 || i2 == 6 || (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66);
    }

    public static final boolean N2(EditText dobMonth, EditText dobDate, View view, int i2, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(dobMonth, "$dobMonth");
        Intrinsics.checkNotNullParameter(dobDate, "$dobDate");
        if (i2 != 67 || dobMonth.getText().length() != 0) {
            return false;
        }
        dobDate.requestFocus();
        return false;
    }

    private final boolean O1(String str) {
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.charAt(i3) == '-') {
                i2++;
            }
        }
        return i2 <= 4;
    }

    public static final void O2(NewDlSearch this$0, Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d2, "$d");
        ae aeVar = this$0.binding;
        if (aeVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aeVar = null;
        }
        aeVar.h.setVisibility(0);
        d2.dismiss();
    }

    public static final void P2(EditText dobYear, EditText dobMonth, EditText dobDate, Dialog d2, NewDlSearch this$0, String dl_number, View view) {
        Intrinsics.checkNotNullParameter(dobYear, "$dobYear");
        Intrinsics.checkNotNullParameter(dobMonth, "$dobMonth");
        Intrinsics.checkNotNullParameter(dobDate, "$dobDate");
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dl_number, "$dl_number");
        String string = dobYear.getText().toString();
        int length = string.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i2 : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i2++;
            } else {
                z = true;
            }
        }
        if (string.subSequence(i2, length + 1).toString().length() > 0) {
            String string2 = dobMonth.getText().toString();
            int length2 = string2.length() - 1;
            int i3 = 0;
            boolean z3 = false;
            while (i3 <= length2) {
                boolean z4 = Intrinsics.compare((int) string2.charAt(!z3 ? i3 : length2), 32) <= 0;
                if (z3) {
                    if (!z4) {
                        break;
                    } else {
                        length2--;
                    }
                } else if (z4) {
                    i3++;
                } else {
                    z3 = true;
                }
            }
            if (string2.subSequence(i3, length2 + 1).toString().length() > 0) {
                String string3 = dobDate.getText().toString();
                int length3 = string3.length() - 1;
                int i4 = 0;
                boolean z5 = false;
                while (i4 <= length3) {
                    boolean z6 = Intrinsics.compare((int) string3.charAt(!z5 ? i4 : length3), 32) <= 0;
                    if (z5) {
                        if (!z6) {
                            break;
                        } else {
                            length3--;
                        }
                    } else if (z6) {
                        i4++;
                    } else {
                        z5 = true;
                    }
                }
                if (string3.subSequence(i4, length3 + 1).toString().length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    String string4 = dobYear.getText().toString();
                    int length4 = string4.length() - 1;
                    int i5 = 0;
                    boolean z7 = false;
                    while (i5 <= length4) {
                        boolean z8 = Intrinsics.compare((int) string4.charAt(!z7 ? i5 : length4), 32) <= 0;
                        if (z7) {
                            if (!z8) {
                                break;
                            } else {
                                length4--;
                            }
                        } else if (z8) {
                            i5++;
                        } else {
                            z7 = true;
                        }
                    }
                    sb.append(string4.subSequence(i5, length4 + 1).toString());
                    sb.append('-');
                    String string5 = dobMonth.getText().toString();
                    int length5 = string5.length() - 1;
                    int i6 = 0;
                    boolean z9 = false;
                    while (i6 <= length5) {
                        boolean z10 = Intrinsics.compare((int) string5.charAt(!z9 ? i6 : length5), 32) <= 0;
                        if (z9) {
                            if (!z10) {
                                break;
                            } else {
                                length5--;
                            }
                        } else if (z10) {
                            i6++;
                        } else {
                            z9 = true;
                        }
                    }
                    sb.append(string5.subSequence(i6, length5 + 1).toString());
                    sb.append('-');
                    String string6 = dobDate.getText().toString();
                    int length6 = string6.length() - 1;
                    int i7 = 0;
                    boolean z11 = false;
                    while (i7 <= length6) {
                        boolean z12 = Intrinsics.compare((int) string6.charAt(!z11 ? i7 : length6), 32) <= 0;
                        if (z11) {
                            if (!z12) {
                                break;
                            } else {
                                length6--;
                            }
                        } else if (z12) {
                            i7++;
                        } else {
                            z11 = true;
                        }
                    }
                    sb.append(string6.subSequence(i7, length6 + 1).toString());
                    String string7 = sb.toString();
                    d2.dismiss();
                    ae aeVar = this$0.binding;
                    ae aeVar2 = null;
                    if (aeVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        aeVar = null;
                    }
                    aeVar.h.setVisibility(8);
                    ae aeVar3 = this$0.binding;
                    if (aeVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        aeVar2 = aeVar3;
                    }
                    aeVar2.o.setVisibility(0);
                    this$0.t2().h(dl_number, string7, this$0);
                    return;
                }
            }
        }
        Toast.makeText(this$0, this$0.B2().b("edit_dl_serv_dob", "Please enter the valid dob"), 0).show();
    }

    public static final void Q1(Dialog d2, NewDlSearch this$0, DldetobjX dlobj, String str, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dlobj, "$dlobj");
        d2.dismiss();
        try {
            ae aeVar = this$0.binding;
            ae aeVar2 = null;
            if (aeVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                aeVar = null;
            }
            aeVar.i.setText("");
            ae aeVar3 = this$0.binding;
            if (aeVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                aeVar3 = null;
            }
            aeVar3.c.setText("");
            ae aeVar4 = this$0.binding;
            if (aeVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                aeVar2 = aeVar4;
            }
            aeVar2.c.setHint("DD - MM - YYYY");
            this$0.S1().O0(dlobj.getDlobj().getDlLicno(), dlobj, str, dlobj.getBioObj().getBioDob().toString());
            this$0.r3();
        } catch (Exception e2) {
            Log.d("new_design", String.valueOf(e2.getMessage()));
        }
    }

    private final void Q2(Context context, String message) {
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
        ((TextView) viewFindViewById4).setText(B2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(B2().b("button_proceed", "Proceed"));
        textView2.setText(B2().b("button_cancel", "Cancel"));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.j84
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewDlSearch.R2(dialog, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.k84
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                NewDlSearch.S2(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void R2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void S2(Dialog d2, NewDlSearch this$0, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        ae aeVar = this$0.binding;
        ae aeVar2 = null;
        if (aeVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aeVar = null;
        }
        String string = aeVar.q.getText().toString();
        if (string == null || string.length() == 0) {
            return;
        }
        try {
            this$0.y2().show();
            ae aeVar3 = this$0.binding;
            if (aeVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                aeVar3 = null;
            }
            String string2 = StringsKt__StringsKt.trim((CharSequence) aeVar3.q.getText().toString()).toString();
            Log.e("Catch - ", string2);
            String strB0 = this$0.S1().B0(string2);
            if (strB0.equals("0")) {
                DatabaseHelper databaseHelperS1 = this$0.S1();
                ae aeVar4 = this$0.binding;
                if (aeVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    aeVar2 = aeVar4;
                }
                strB0 = databaseHelperS1.B0(new Regex("\\s").replace(aeVar2.q.getText().toString(), ""));
            }
            if (strB0 != null && strB0.length() != 0) {
                a55 a55VarV2 = this$0.v2();
                Intrinsics.checkNotNull(strB0);
                a55VarV2.h(strB0, this$0);
            }
        } catch (Exception e2) {
            this$0.y2().dismiss();
            e2.printStackTrace();
        }
    }

    public static final void U2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void a2() throws Throwable {
        DlobjX dlobj;
        View viewFindViewById = findViewById(R.id.et_search_dl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        d3((EditText) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.ll_search_dl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        e3((LinearLayout) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.dobDateMain);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        a3((EditText) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.dobMonthMain);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        b3((EditText) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.dobYearMain);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        c3((EditText) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.rc_new_design);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        m3((RecyclerView) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.date_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        Y2((ImageView) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.refresh);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        n3((ImageView) viewFindViewById8);
        DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(this);
        Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
        W2(databaseHelperD0);
        View viewFindViewById9 = findViewById(R.id.nexgenarrow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        k3((LinearLayout) viewFindViewById9);
        w2().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.s84
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewDlSearch.n2(this.a, view);
            }
        });
        W1().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zepto.v74
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return NewDlSearch.o2(textView, i2, keyEvent);
            }
        });
        W1().addTextChangedListener(new h());
        X1().addTextChangedListener(new i());
        W1().addTextChangedListener(new j());
        X1().setOnKeyListener(new View.OnKeyListener() { // from class: com.zepto.w74
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                return NewDlSearch.p2(this.a, view, i2, keyEvent);
            }
        });
        X1().addTextChangedListener(new k());
        Y1().setOnKeyListener(new View.OnKeyListener() { // from class: com.zepto.x74
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                return NewDlSearch.b2(this.a, view, i2, keyEvent);
            }
        });
        Y1().addTextChangedListener(new l());
        new m();
        q2().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.y74
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewDlSearch.c2(this.a, view);
            }
        });
        ae aeVar = null;
        if (S1().A0() != null) {
            try {
                ae aeVar2 = this.binding;
                if (aeVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    aeVar2 = null;
                }
                aeVar2.t.setVisibility(8);
                z2().setVisibility(8);
                ArrayList arrayListA0 = S1().A0();
                Intrinsics.checkNotNullExpressionValue(arrayListA0, "getDLDetailsListDoc(...)");
                z2().setLayoutManager(new LinearLayoutManager(this, 0, false));
                z2().setAdapter(new km1(this, arrayListA0));
                ArrayList arrayListA02 = S1().A0();
                Intrinsics.checkNotNullExpressionValue(arrayListA02, "getDLDetailsListDoc(...)");
                ae aeVar3 = this.binding;
                if (aeVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    aeVar3 = null;
                }
                aeVar3.q.setText(StringsKt__StringsKt.trim((CharSequence) String.valueOf(((DLDocument) arrayListA02.get(0)).getDocnumber())).toString());
                if (((DLDocument) arrayListA02.get(0)).getDldetails() != null) {
                    ae aeVar4 = this.binding;
                    if (aeVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        aeVar4 = null;
                    }
                    aeVar4.B.setVisibility(0);
                    ae aeVar5 = this.binding;
                    if (aeVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        aeVar5 = null;
                    }
                    TextView textView = aeVar5.q;
                    DldetobjX dldetails = ((DLDocument) arrayListA02.get(0)).getDldetails();
                    textView.setText((dldetails == null || (dlobj = dldetails.getDlobj()) == null) ? null : dlobj.getDlLicno());
                } else {
                    ae aeVar6 = this.binding;
                    if (aeVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        aeVar6 = null;
                    }
                    aeVar6.B.setVisibility(0);
                    ae aeVar7 = this.binding;
                    if (aeVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        aeVar7 = null;
                    }
                    aeVar7.h.setVisibility(0);
                    ae aeVar8 = this.binding;
                    if (aeVar8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        aeVar8 = null;
                    }
                    aeVar8.d.setVisibility(8);
                    ae aeVar9 = this.binding;
                    if (aeVar9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        aeVar9 = null;
                    }
                    aeVar9.A.setVisibility(8);
                    ae aeVar10 = this.binding;
                    if (aeVar10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        aeVar10 = null;
                    }
                    aeVar10.j.setAlpha(0.2f);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else {
            ae aeVar11 = this.binding;
            if (aeVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                aeVar11 = null;
            }
            aeVar11.t.setVisibility(8);
            ae aeVar12 = this.binding;
            if (aeVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                aeVar12 = null;
            }
            aeVar12.B.setVisibility(8);
        }
        final n nVar = new n();
        U1().setOnClickListener(new a(nVar));
        ae aeVar13 = this.binding;
        if (aeVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aeVar13 = null;
        }
        aeVar13.c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.z74
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewDlSearch.d2(this.a, nVar, view);
            }
        });
        ae aeVar14 = this.binding;
        if (aeVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aeVar14 = null;
        }
        aeVar14.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.b84
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewDlSearch.e2(this.a, view);
            }
        });
        A2().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.c84
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                NewDlSearch.f2(this.a, view);
            }
        });
        t2().n().g(this, new y(new b()));
        t2().o().g(this, new y(new c()));
        v2().v().g(this, new y(new d()));
        v2().w().g(this, new y(new e()));
        ae aeVar15 = this.binding;
        if (aeVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            aeVar = aeVar15;
        }
        aeVar.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.d84
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewDlSearch.g2(this.a, view);
            }
        });
        t2().l().g(this, new mf4() { // from class: com.zepto.e84
            @Override // com.zepto.mf4
            public final void a(Object obj) throws Throwable {
                NewDlSearch.h2(this.a, (DLServiceResponseModleV1) obj);
            }
        });
        t2().m().g(this, new mf4() { // from class: com.zepto.q74
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                NewDlSearch.i2(this.a, (String) obj);
            }
        });
        D2().u().g(this, new mf4() { // from class: com.zepto.r74
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                NewDlSearch.j2(this.a, (SendOtpResult) obj);
            }
        });
        D2().t().g(this, new mf4() { // from class: com.zepto.s74
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                NewDlSearch.k2(this.a, (String) obj);
            }
        });
        D2().x().g(this, new mf4() { // from class: com.zepto.t74
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                NewDlSearch.l2(this.a, (CitzValidDoc) obj);
            }
        });
        D2().k().g(this, new mf4() { // from class: com.zepto.u74
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                NewDlSearch.m2(this.a, (String) obj);
            }
        });
        D2().A().g(this, new y(new f()));
        D2().z().g(this, new y(new g()));
    }

    public static final boolean b2(NewDlSearch this$0, View view, int i2, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i2 != 67 || this$0.Y1().getText().length() != 0) {
            return false;
        }
        this$0.X1().requestFocus();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c2(com.nic.mparivahan.Dl.NewDlSearch r9, android.view.View r10) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Dl.NewDlSearch.c2(com.nic.mparivahan.Dl.NewDlSearch, android.view.View):void");
    }

    public static final void d2(NewDlSearch this$0, n dateSetListenerDialog, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dateSetListenerDialog, "$dateSetListenerDialog");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0.r2(), dateSetListenerDialog, this$0.cal.get(1), this$0.cal.get(2), this$0.cal.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
    }

    public static final void e2(NewDlSearch this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.Q2(this$0, this$0.B2().b(va3.a.A0(), "Are you sure, You want to delete ?"));
        } else {
            Toast.makeText(this$0, this$0.B2().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 0).show();
        }
    }

    public static final void f2(NewDlSearch this$0, View view) throws Throwable {
        BioObjX bioObj;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.y2().show();
            ArrayList arrayListA0 = this$0.S1().A0();
            Intrinsics.checkNotNullExpressionValue(arrayListA0, "getDLDetailsListDoc(...)");
            String string = StringsKt__StringsKt.trim((CharSequence) String.valueOf(((DLDocument) arrayListA0.get(0)).getDocnumber())).toString();
            is1 is1VarT2 = this$0.t2();
            k18.a aVar = k18.a;
            DldetobjX dldetails = ((DLDocument) arrayListA0.get(0)).getDldetails();
            is1VarT2.j(string, aVar.b(StringsKt__StringsKt.trim((CharSequence) String.valueOf((dldetails == null || (bioObj = dldetails.getBioObj()) == null) ? null : bioObj.getBioDob())).toString()), this$0);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void g2(NewDlSearch this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ae aeVar = this$0.binding;
        ae aeVar2 = null;
        if (aeVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aeVar = null;
        }
        aeVar.h.setVisibility(8);
        ae aeVar3 = this$0.binding;
        if (aeVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            aeVar2 = aeVar3;
        }
        this$0.L2(this$0, StringsKt__StringsKt.trim((CharSequence) aeVar2.q.getText().toString()).toString());
    }

    public static final void h2(NewDlSearch this$0, DLServiceResponseModleV1 dLServiceResponseModleV1) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ae aeVar = null;
        try {
            ae aeVar2 = this$0.binding;
            if (aeVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                aeVar2 = null;
            }
            aeVar2.o.setVisibility(8);
            if (dLServiceResponseModleV1.getDldetobj().get(0).getErrorcd() != 0) {
                if (dLServiceResponseModleV1.getDldetobj().get(0).getErrorcd() == -2) {
                    ae aeVar3 = this$0.binding;
                    if (aeVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        aeVar3 = null;
                    }
                    aeVar3.h.setVisibility(0);
                    return;
                }
                ae aeVar4 = this$0.binding;
                if (aeVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    aeVar4 = null;
                }
                aeVar4.h.setVisibility(0);
                return;
            }
            ae aeVar5 = this$0.binding;
            if (aeVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                aeVar5 = null;
            }
            aeVar5.h.setVisibility(8);
            ae aeVar6 = this$0.binding;
            if (aeVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                aeVar6 = null;
            }
            aeVar6.d.setVisibility(0);
            ae aeVar7 = this$0.binding;
            if (aeVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                aeVar7 = null;
            }
            aeVar7.A.setVisibility(0);
            ae aeVar8 = this$0.binding;
            if (aeVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                aeVar8 = null;
            }
            aeVar8.j.setAlpha(1.0f);
            this$0.S1().P0(StringsKt__StringsKt.trim((CharSequence) dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlLicno()).toString(), dLServiceResponseModleV1.getDldetobj().get(0));
        } catch (Exception e2) {
            ae aeVar9 = this$0.binding;
            if (aeVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                aeVar9 = null;
            }
            aeVar9.o.setVisibility(8);
            ae aeVar10 = this$0.binding;
            if (aeVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                aeVar = aeVar10;
            }
            aeVar.h.setVisibility(0);
            e2.printStackTrace();
        }
    }

    public static final void i2(NewDlSearch this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ae aeVar = this$0.binding;
        ae aeVar2 = null;
        if (aeVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aeVar = null;
        }
        aeVar.o.setVisibility(8);
        ae aeVar3 = this$0.binding;
        if (aeVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            aeVar2 = aeVar3;
        }
        aeVar2.h.setVisibility(0);
    }

    public static final void j2(NewDlSearch this$0, SendOtpResult sendOtpResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.y2().dismiss();
            if (StringsKt__StringsJVMKt.equals(sendOtpResult.getStatusCode(), "AL001", true)) {
                this$0.diloge = n35.a.m(this$0, this$0, new ws6(this$0).l(), this$0.D2(), String.valueOf(sendOtpResult.getRecordId()), StringsKt__StringsKt.trim((CharSequence) this$0.V1().getDlobj().getDlLicno().toString()).toString(), "DL", this$0.V1().getBioObj().getBioDob().toString(), this$0.y2());
            } else if (!gd1.a.m(sendOtpResult.getStatusDesc())) {
                this$0.T2(this$0, sendOtpResult.getStatusDesc());
            }
        } catch (Exception unused) {
            this$0.y2().dismiss();
        }
    }

    public static final void k2(NewDlSearch this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.y2().dismiss();
        this$0.T2(this$0, this$0.B2().b(va3.a.K0(), "Unable to create the virtual DL, Please try after some time"));
    }

    public static final void l2(NewDlSearch this$0, CitzValidDoc citzValidDoc) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (!StringsKt__StringsJVMKt.equals$default(citzValidDoc.getStatusCode(), "AL001", false, 2, null)) {
                this$0.y2().dismiss();
                Toast.makeText(this$0, citzValidDoc.getStatusDesc(), 1).show();
                return;
            }
            Dialog dialog = this$0.diloge;
            if (dialog != null) {
                Intrinsics.checkNotNull(dialog);
                dialog.dismiss();
                this$0.y2().dismiss();
            }
            gd1.a aVar = gd1.a;
            if (aVar.m(citzValidDoc.getParam())) {
                Context contextR2 = this$0.r2();
                String strB = this$0.B2().b(va3.a.k(), "Virtual DL successfully created.");
                CitizenDocInfoX citizenDocInfo = citzValidDoc.getCitizenDocInfo();
                String strValueOf = String.valueOf(citizenDocInfo != null ? citizenDocInfo.getDocNumber() : null);
                CitizenDocInfoX citizenDocInfo2 = citzValidDoc.getCitizenDocInfo();
                this$0.P1(contextR2, strB, strValueOf, String.valueOf(citizenDocInfo2 != null ? citizenDocInfo2.getDocId() : null), this$0.V1());
                return;
            }
            if (this$0.y2().isShowing()) {
                this$0.y2().dismiss();
            }
            if (aVar.m(citzValidDoc.getParam())) {
                Dialog dialog2 = this$0.diloge;
                if (dialog2 != null) {
                    Intrinsics.checkNotNull(dialog2);
                    dialog2.dismiss();
                }
                this$0.T2(this$0.r2(), this$0.B2().b(va3.a.K0(), "Unable to add Virtual DL, Try after some time"));
                return;
            }
            Dialog dialog3 = this$0.diloge;
            if (dialog3 != null) {
                Intrinsics.checkNotNull(dialog3);
                dialog3.dismiss();
            }
            this$0.T2(this$0, citzValidDoc.getParam());
        } catch (Exception unused) {
            if (this$0.y2().isShowing()) {
                this$0.y2().dismiss();
            }
            Dialog dialog4 = this$0.diloge;
            if (dialog4 != null) {
                Intrinsics.checkNotNull(dialog4);
                dialog4.dismiss();
            }
            this$0.T2(this$0.r2(), this$0.B2().b(va3.a.K0(), "Unable to add Virtual DL, Try after some time"));
        }
    }

    public static final void m2(NewDlSearch this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Log.e("Test", str.toString());
        this$0.y2().dismiss();
        Dialog dialog = this$0.diloge;
        if (dialog != null) {
            Intrinsics.checkNotNull(dialog);
            dialog.dismiss();
        }
        this$0.T2(this$0.r2(), this$0.B2().b(va3.a.K0(), "Unable to add Virtual DL, Try after some time"));
    }

    public static final void n2(NewDlSearch this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final boolean o2(TextView textView, int i2, KeyEvent keyEvent) {
        return i2 == 3 || i2 == 6 || (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66);
    }

    public static final boolean p2(NewDlSearch this$0, View view, int i2, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i2 != 67) {
            return false;
        }
        Editable text = this$0.X1().getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() != 0) {
            return false;
        }
        this$0.W1().requestFocus();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s3() {
        new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence charSequence = DateFormat.format("dd", this.cal.getTime());
        Intrinsics.checkNotNull(charSequence, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence2 = DateFormat.format("MM", this.cal.getTime());
        Intrinsics.checkNotNull(charSequence2, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence3 = DateFormat.format("yyyy", this.cal.getTime());
        Intrinsics.checkNotNull(charSequence3, "null cannot be cast to non-null type kotlin.String");
        CharSequence charSequence4 = DateFormat.format("dd", this.cal.getTime());
        Intrinsics.checkNotNull(charSequence4, "null cannot be cast to non-null type kotlin.String");
        String str = (String) charSequence4;
        CharSequence charSequence5 = DateFormat.format("MM", this.cal.getTime());
        Intrinsics.checkNotNull(charSequence5, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) charSequence5;
        CharSequence charSequence6 = DateFormat.format("yyyy", this.cal.getTime());
        Intrinsics.checkNotNull(charSequence6, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) charSequence6;
        try {
            W1().setText(str);
            X1().setText(str2);
            Y1().setText(str3);
        } catch (Exception unused) {
        }
    }

    public final ImageView A2() {
        ImageView imageView = this.refresh;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("refresh");
        return null;
    }

    public final wa3 B2() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final ws6 C2() {
        ws6 ws6Var = this.userSessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userSessionManager");
        return null;
    }

    public final p26 D2() {
        p26 p26Var = this.viewModel;
        if (p26Var != null) {
            return p26Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [T, java.util.Calendar] */
    public final void L2(Context context, final String dl_number) {
        Intrinsics.checkNotNullParameter(dl_number, "dl_number");
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.mvvm_dl_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Window window2 = dialog.getWindow();
        Intrinsics.checkNotNull(window2);
        window2.setLayout(-1, -2);
        View viewFindViewById = dialog.findViewById(R.id.verify_card);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        CardView cardView = (CardView) viewFindViewById;
        View viewFindViewById2 = dialog.findViewById(R.id.cancel);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        View viewFindViewById3 = dialog.findViewById(R.id.applicant_year);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText = (EditText) viewFindViewById3;
        View viewFindViewById4 = dialog.findViewById(R.id.applicant_month);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText2 = (EditText) viewFindViewById4;
        View viewFindViewById5 = dialog.findViewById(R.id.applicant_date);
        Intrinsics.checkNotNull(viewFindViewById5, "null cannot be cast to non-null type android.widget.EditText");
        final EditText editText3 = (EditText) viewFindViewById5;
        View viewFindViewById6 = dialog.findViewById(R.id.dob_cal);
        Intrinsics.checkNotNull(viewFindViewById6, "null cannot be cast to non-null type android.widget.ImageView");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = Calendar.getInstance();
        View viewFindViewById7 = dialog.findViewById(R.id.head);
        Intrinsics.checkNotNull(viewFindViewById7, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById8 = dialog.findViewById(R.id.verify_text_view);
        Intrinsics.checkNotNull(viewFindViewById8, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById9 = dialog.findViewById(R.id.cancle_txt);
        Intrinsics.checkNotNull(viewFindViewById9, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById7).setText(B2().b(va3.a.X0(), "Verify your DL"));
        ((TextView) viewFindViewById8).setText(B2().b("vahan_btn_verify", "Verify"));
        ((TextView) viewFindViewById9).setText(B2().b("button_cancel", "Cancel"));
        View viewFindViewById10 = dialog.findViewById(R.id.dob_badge);
        Intrinsics.checkNotNull(viewFindViewById10, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById10).setText(B2().b("edit_dl_serv_dob", "Please Enter Date of Birth"));
        ((ImageView) viewFindViewById6).setOnClickListener(new s(context, new x(objectRef, editText3, editText2, editText), objectRef));
        editText3.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zepto.f84
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return NewDlSearch.M2(textView, i2, keyEvent);
            }
        });
        editText3.addTextChangedListener(new t(editText2));
        editText3.addTextChangedListener(new u(editText3, editText2));
        editText2.addTextChangedListener(new v(editText));
        editText2.setOnKeyListener(new View.OnKeyListener() { // from class: com.zepto.g84
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                return NewDlSearch.N2(editText2, editText3, view, i2, keyEvent);
            }
        });
        editText2.addTextChangedListener(new w(editText2, editText));
        ((CardView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.h84
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewDlSearch.O2(this.a, dialog, view);
            }
        });
        cardView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.i84
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewDlSearch.P2(editText, editText2, editText3, dialog, this, dl_number, view);
            }
        });
        dialog.show();
    }

    public final void P1(Context context, String message, String docnumber, final String doc_id, final DldetobjX dlobj) {
        Intrinsics.checkNotNullParameter(dlobj, "dlobj");
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCancelable(false);
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
        ((TextView) viewFindViewById3).setText(B2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(B2().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.r84
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                NewDlSearch.Q1(dialog, this, dlobj, doc_id, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: renamed from: R1, reason: from getter */
    public final Calendar getCal() {
        return this.cal;
    }

    public final DatabaseHelper S1() {
        DatabaseHelper databaseHelper = this.databaseHelper;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("databaseHelper");
        return null;
    }

    /* JADX INFO: renamed from: T1, reason: from getter */
    public final String getDateValeMain() {
        return this.dateValeMain;
    }

    public final void T2(Context context, String message) {
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
        ((TextView) viewFindViewById3).setText(B2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(B2().b("btn_ok", "OK"));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.q84
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewDlSearch.U2(dialog, view);
            }
        });
        dialog.show();
    }

    public final ImageView U1() {
        ImageView imageView = this.date_img;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("date_img");
        return null;
    }

    public final DldetobjX V1() {
        DldetobjX dldetobjX = this.dlobj;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlobj");
        return null;
    }

    public final void V2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.d_number = str;
    }

    public final EditText W1() {
        EditText editText = this.dobDateMain;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dobDateMain");
        return null;
    }

    public final void W2(DatabaseHelper databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "<set-?>");
        this.databaseHelper = databaseHelper;
    }

    public final EditText X1() {
        EditText editText = this.dobMonthMain;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dobMonthMain");
        return null;
    }

    public final void X2(String str) {
        this.dateValeMain = str;
    }

    public final EditText Y1() {
        EditText editText = this.dobYearMain;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dobYearMain");
        return null;
    }

    public final void Y2(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.date_img = imageView;
    }

    public final EditText Z1() {
        EditText editText = this.etSearchDL;
        if (editText != null) {
            return editText;
        }
        Intrinsics.throwUninitializedPropertyAccessException("etSearchDL");
        return null;
    }

    public final void Z2(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dlobj = dldetobjX;
    }

    public final void a3(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.dobDateMain = editText;
    }

    public final void b3(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.dobMonthMain = editText;
    }

    public final void c3(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.dobYearMain = editText;
    }

    public final void d3(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<set-?>");
        this.etSearchDL = editText;
    }

    public final void e3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.llSearchDL = linearLayout;
    }

    public final void f3(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void g3(DlService dlService) {
        Intrinsics.checkNotNullParameter(dlService, "<set-?>");
        this.mDlService = dlService;
    }

    public final void h3(is1 is1Var) {
        Intrinsics.checkNotNullParameter(is1Var, "<set-?>");
        this.mDlViewModel = is1Var;
    }

    public final void i3(RcService rcService) {
        Intrinsics.checkNotNullParameter(rcService, "<set-?>");
        this.mRcService = rcService;
    }

    public final void j3(a55 a55Var) {
        Intrinsics.checkNotNullParameter(a55Var, "<set-?>");
        this.mRcViewModel = a55Var;
    }

    public final void k3(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.nexgenarrow = linearLayout;
    }

    public final void l3(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void m3(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.recyclerList = recyclerView;
    }

    public final void n3(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.refresh = imageView;
    }

    public final void o3(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        ae aeVarC = ae.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(aeVarC, "inflate(...)");
        this.binding = aeVarC;
        ae aeVar = null;
        if (aeVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aeVarC = null;
        }
        setContentView(aeVarC.b());
        ta3.a aVar = ta3.a;
        ae aeVar2 = this.binding;
        if (aeVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aeVar2 = null;
        }
        aVar.z1(this, aeVar2);
        o3(new wa3(this));
        f3(this);
        g3(DlService.INSTANCE.a(this));
        p3(new ws6(this));
        DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(r2());
        Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
        W2(databaseHelperD0);
        l3(new ProgressDialog(r2()));
        y2().setMessage("Please wait...");
        y2().setCancelable(true);
        y2().setCanceledOnTouchOutside(true);
        i3(RcService.INSTANCE.a(this));
        this.retrofitService = SignService.INSTANCE.a(this);
        j3((a55) new z(this, new b55(new s45(u2()))).a(a55.class));
        SignService signService = this.retrofitService;
        if (signService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
            signService = null;
        }
        q3((p26) new z(this, new a26(new c26(signService))).a(p26.class));
        h3((is1) new z(this, new js1(new jp1(s2()))).a(is1.class));
        a2();
        t2().B().g(this, new mf4() { // from class: com.zepto.p74
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                NewDlSearch.E2(this.a, (CreateVirtualDocModle) obj);
            }
        });
        t2().C().g(this, new mf4() { // from class: com.zepto.a84
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                NewDlSearch.F2(this.a, (String) obj);
            }
        });
        t2().r().g(this, new mf4() { // from class: com.zepto.l84
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                NewDlSearch.G2(this.a, (DLServiceResponseModleV1) obj);
            }
        });
        t2().s().g(this, new mf4() { // from class: com.zepto.m84
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                NewDlSearch.H2(this.a, (String) obj);
            }
        });
        t2().p().g(this, new mf4() { // from class: com.zepto.n84
            @Override // com.zepto.mf4
            public final void a(Object obj) throws Throwable {
                NewDlSearch.I2(this.a, (DLServiceResponseModleV1) obj);
            }
        });
        t2().q().g(this, new mf4() { // from class: com.zepto.o84
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                NewDlSearch.J2(this.a, (String) obj);
            }
        });
        v2().L().g(this, new y(new p()));
        v2().M().g(this, new y(new q()));
        v2().x().g(this, new y(new r()));
        v2().y().g(this, new y(new o()));
        ae aeVar3 = this.binding;
        if (aeVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            aeVar = aeVar3;
        }
        aeVar.A.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.p84
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewDlSearch.K2(this.a, view);
            }
        });
    }

    public final void p3(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.userSessionManager = ws6Var;
    }

    public final LinearLayout q2() {
        LinearLayout linearLayout = this.llSearchDL;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("llSearchDL");
        return null;
    }

    public final void q3(p26 p26Var) {
        Intrinsics.checkNotNullParameter(p26Var, "<set-?>");
        this.viewModel = p26Var;
    }

    public final Context r2() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final void r3() throws Throwable {
        DlobjX dlobj;
        String dlLicno = null;
        ae aeVar = null;
        dlLicno = null;
        if (S1().z0() == null) {
            ae aeVar2 = this.binding;
            if (aeVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                aeVar2 = null;
            }
            aeVar2.t.setVisibility(8);
            ae aeVar3 = this.binding;
            if (aeVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                aeVar = aeVar3;
            }
            aeVar.B.setVisibility(8);
            return;
        }
        try {
            ae aeVar4 = this.binding;
            if (aeVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                aeVar4 = null;
            }
            aeVar4.t.setVisibility(8);
            z2().setVisibility(8);
            ArrayList arrayListZ0 = S1().z0();
            Intrinsics.checkNotNullExpressionValue(arrayListZ0, "getDLDetailsList(...)");
            z2().setLayoutManager(new LinearLayoutManager(this, 0, false));
            z2().setAdapter(new km1(this, arrayListZ0));
            ArrayList arrayListZ02 = S1().z0();
            Intrinsics.checkNotNullExpressionValue(arrayListZ02, "getDLDetailsList(...)");
            if (((DLDocument) arrayListZ02.get(0)).getDldetails() != null) {
                ae aeVar5 = this.binding;
                if (aeVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    aeVar5 = null;
                }
                aeVar5.B.setVisibility(0);
                ae aeVar6 = this.binding;
                if (aeVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    aeVar6 = null;
                }
                TextView textView = aeVar6.q;
                DldetobjX dldetails = ((DLDocument) arrayListZ02.get(0)).getDldetails();
                if (dldetails != null && (dlobj = dldetails.getDlobj()) != null) {
                    dlLicno = dlobj.getDlLicno();
                }
                textView.setText(dlLicno);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final DlService s2() {
        DlService dlService = this.mDlService;
        if (dlService != null) {
            return dlService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDlService");
        return null;
    }

    public final is1 t2() {
        is1 is1Var = this.mDlViewModel;
        if (is1Var != null) {
            return is1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDlViewModel");
        return null;
    }

    public final RcService u2() {
        RcService rcService = this.mRcService;
        if (rcService != null) {
            return rcService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRcService");
        return null;
    }

    public final a55 v2() {
        a55 a55Var = this.mRcViewModel;
        if (a55Var != null) {
            return a55Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRcViewModel");
        return null;
    }

    public final LinearLayout w2() {
        LinearLayout linearLayout = this.nexgenarrow;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nexgenarrow");
        return null;
    }

    public final boolean x2(String str, EditText editText, View mView) {
        Intrinsics.checkNotNullParameter(str, "str");
        Intrinsics.checkNotNullParameter(editText, "editText");
        Intrinsics.checkNotNullParameter(mView, "mView");
        int[] iArr = new int[256];
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            iArr[cCharAt] = iArr[cCharAt] + 1;
        }
        char[] cArr = new char[str.length()];
        for (int i3 = 0; i3 < length; i3++) {
            cArr[i3] = str.charAt(i3);
            if (i3 >= 0) {
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    if (str.charAt(i3) == cArr[i4]) {
                        i5++;
                    }
                    if (i4 == i3) {
                        break;
                    }
                    i4++;
                }
                if (i5 > 12) {
                    editText.requestFocus();
                    T2(r2(), B2().b("dl_validation_msg", "Please enter minimum 10 & maximum 18 characters.Only hyphen(-), forward slash(/) & space is allowed"));
                    return true;
                }
            }
        }
        return false;
    }

    public final ProgressDialog y2() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final RecyclerView z2() {
        RecyclerView recyclerView = this.recyclerList;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recyclerList");
        return null;
    }
}
