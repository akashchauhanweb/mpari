package com.nic.mparivahan.dlservices.ui.slots;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.DLServicesAuth.View.DlServiceDetailsActivity;
import com.nic.mparivahan.Dl.Model.BioImgObjX;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.data.model.SlotDet;
import com.nic.mparivahan.dlservices.ui.slots.DlRenewalSlotsActivity;
import com.nic.mparivahan.dlservices.ui.slots.calendar.ExpandableHeightGridView;
import com.zepto.a46;
import com.zepto.b46;
import com.zepto.ds1;
import com.zepto.fa;
import com.zepto.kd1;
import com.zepto.kt6;
import com.zepto.lq7;
import com.zepto.mf4;
import com.zepto.ms3;
import com.zepto.o40;
import com.zepto.ta3;
import com.zepto.u90;
import com.zepto.wa3;
import com.zepto.wl5;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
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
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u00012\u00020\u0002B\t¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J \u0010\t\u001a\u00020\u00032\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J \u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u001a\u0010\u0014\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J(\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0002J\u0012\u0010\u0019\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u001c\u0010\u001c\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0012\u0010\u001f\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0014J\u0014\u0010!\u001a\u0004\u0018\u00010\u00122\b\u0010 \u001a\u0004\u0018\u00010\u0012H\u0007J\u0006\u0010\"\u001a\u00020\u0003J$\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010#\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u00122\b\u0010%\u001a\u0004\u0018\u00010\u0012J \u0010(\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u000e\u0010)\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001aJ\u0016\u0010+\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u0012J:\u0010/\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010\u00122\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000e2\b\u0010.\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0017\u001a\u00020\u000eR\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R$\u0010G\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010O\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010V\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR2\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020W0\u0005j\b\u0012\u0004\u0012\u00020W`\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R2\u0010b\u001a\u0012\u0012\u0004\u0012\u00020^0\u0005j\b\u0012\u0004\u0012\u00020^`\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010Y\u001a\u0004\b`\u0010[\"\u0004\ba\u0010]R\u001d\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\bc\u0010Y\u001a\u0004\bd\u0010[R$\u0010i\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010Q\u001a\u0004\bg\u0010S\"\u0004\bh\u0010UR$\u0010m\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010Q\u001a\u0004\bk\u0010S\"\u0004\bl\u0010UR\"\u0010u\u001a\u00020n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\"\u0010y\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010Q\u001a\u0004\bw\u0010S\"\u0004\bx\u0010UR$\u0010}\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010Q\u001a\u0004\b{\u0010S\"\u0004\b|\u0010UR&\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b~\u0010Q\u001a\u0004\b\u007f\u0010S\"\u0005\b\u0080\u0001\u0010UR(\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010Q\u001a\u0005\b\u0083\u0001\u0010S\"\u0005\b\u0084\u0001\u0010UR&\u0010\u0089\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010Q\u001a\u0005\b\u0087\u0001\u0010S\"\u0005\b\u0088\u0001\u0010UR&\u0010\u008d\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010Q\u001a\u0005\b\u008b\u0001\u0010S\"\u0005\b\u008c\u0001\u0010UR&\u0010\u0091\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010Q\u001a\u0005\b\u008f\u0001\u0010S\"\u0005\b\u0090\u0001\u0010UR*\u0010\u0099\u0001\u001a\u00030\u0092\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R,\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120\u00058\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009a\u0001\u0010Y\u001a\u0005\b\u009b\u0001\u0010[\"\u0005\b\u009c\u0001\u0010]R,\u0010¡\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120\u00058\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009e\u0001\u0010Y\u001a\u0005\b\u009f\u0001\u0010[\"\u0005\b \u0001\u0010]R*\u0010©\u0001\u001a\u00030¢\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R(\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bª\u0001\u0010Q\u001a\u0005\b«\u0001\u0010S\"\u0005\b¬\u0001\u0010UR(\u0010±\u0001\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b®\u0001\u0010Q\u001a\u0005\b¯\u0001\u0010S\"\u0005\b°\u0001\u0010UR*\u0010´\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078\u0006¢\u0006\u000e\n\u0005\b²\u0001\u0010Y\u001a\u0005\b³\u0001\u0010[¨\u0006·\u0001"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/slots/DlRenewalSlotsActivity;", "Lcom/zepto/o40;", "Lcom/zepto/a46$a;", "", "p2", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/dlservices/data/model/SlotDet;", "Lkotlin/collections/ArrayList;", "mSlotsEvents", "k2", "Ljava/util/Calendar;", "tapedDay", "v2", "Q1", "", "pos", "Landroid/content/Intent;", "Z1", "", "message", "f2", "mDate", "slot_nu", "forNextMoth", "h2", "i2", "Landroid/content/Context;", "context", "j2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "fdate", "O1", "m2", "dateToFormat", "inputFormat", "outputFormat", "Ljava/util/Date;", "N1", "i", "L1", "rtoCd", "M1", "rto_code", "mContext", "app_number", "l2", "Lcom/zepto/fa;", "F", "Lcom/zepto/fa;", "mBinding", "Lcom/zepto/ds1;", "G", "Lcom/zepto/ds1;", "viewModel", "Lcom/zepto/a46;", "H", "Lcom/zepto/a46;", "adapter", "Landroid/app/ProgressDialog;", "I", "Landroid/app/ProgressDialog;", "pDialog", "Landroid/widget/LinearLayout;", "J", "Landroid/widget/LinearLayout;", "getLayoutCalender", "()Landroid/widget/LinearLayout;", "setLayoutCalender", "(Landroid/widget/LinearLayout;)V", "layoutCalender", "Landroid/view/View;", "K", "Landroid/view/View;", "getCustom_view", "()Landroid/view/View;", "setCustom_view", "(Landroid/view/View;)V", "custom_view", "L", "Ljava/lang/String;", "T1", "()Ljava/lang/String;", "setLastEndorseRTOCode", "(Ljava/lang/String;)V", "lastEndorseRTOCode", "Lcom/nic/mparivahan/dlservices/ui/slots/calendar/SlotDetailsItem;", "M", "Ljava/util/ArrayList;", "getMSlotsEvents", "()Ljava/util/ArrayList;", "setMSlotsEvents", "(Ljava/util/ArrayList;)V", "Lcom/zepto/b46;", "N", "getMEvents", "setMEvents", "mEvents", "O", "P1", "arraylistslot", "P", "V1", "setMApplNo", "mApplNo", "Q", "getMApplDob", "setMApplDob", "mApplDob", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "R", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "R1", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "o2", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "dlDetails", "S", "X1", "t2", "rtoCdNew", "T", "getDlNo", "setDlNo", "dlNo", "U", "getDob", "setDob", "dob", "V", "getMobile_no", "setMobile_no", "Mobile_no", "W", "getLastEndorseRto", "setLastEndorseRto", "lastEndorseRto", "X", "getLastEndorseState", "setLastEndorseState", "lastEndorseState", "Y", "getLastEndorseStateCode", "setLastEndorseStateCode", "lastEndorseStateCode", "Lcom/zepto/wa3;", "Z", "Lcom/zepto/wa3;", "S1", "()Lcom/zepto/wa3;", "q2", "(Lcom/zepto/wa3;)V", "langSession", "a0", "W1", "s2", "multiListName", "b0", "U1", "r2", "listHeaderSteps", "Lcom/zepto/wl5;", "c0", "Lcom/zepto/wl5;", "Y1", "()Lcom/zepto/wl5;", "u2", "(Lcom/zepto/wl5;)V", "sarthiSession", "d0", "getBioRecGenesis", "setBioRecGenesis", "bioRecGenesis", "e0", "getAllowAddrChangeAtDlservReqst", "setAllowAddrChangeAtDlservReqst", "allowAddrChangeAtDlservReqst", "f0", "getItems", "items", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDlRenewalSlotsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DlRenewalSlotsActivity.kt\ncom/nic/mparivahan/dlservices/ui/slots/DlRenewalSlotsActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,776:1\n1855#2:777\n1856#2:779\n1855#2,2:780\n1#3:778\n*S KotlinDebug\n*F\n+ 1 DlRenewalSlotsActivity.kt\ncom/nic/mparivahan/dlservices/ui/slots/DlRenewalSlotsActivity\n*L\n469#1:777\n469#1:779\n560#1:780,2\n*E\n"})
public final class DlRenewalSlotsActivity extends o40 implements a46.a {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public fa mBinding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ds1 viewModel;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public a46 adapter;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public LinearLayout layoutCalender;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public View custom_view;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String lastEndorseRTOCode;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String mApplNo;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String mApplDob;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public DldetobjX dlDetails;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String rtoCdNew;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public ArrayList multiListName;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public ArrayList listHeaderSteps;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ArrayList mSlotsEvents = new ArrayList();

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ArrayList mEvents = new ArrayList();

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public final ArrayList arraylistslot = new ArrayList();

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String dlNo = "";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String dob = "";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String Mobile_no = "";

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String lastEndorseRto = "";

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String lastEndorseState = "";

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String lastEndorseStateCode = "";

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public String bioRecGenesis = "";

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public String allowAddrChangeAtDlservReqst = "";

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public final ArrayList items = new ArrayList();

    public static final class a extends Lambda implements Function1 {
        public final /* synthetic */ String e;
        public final /* synthetic */ int f;
        public final /* synthetic */ int g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, int i, int i2) {
            super(1);
            this.e = str;
            this.f = i;
            this.g = i2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String it) {
            String lastEndorseRTOCode;
            Intrinsics.checkNotNullParameter(it, "it");
            if (!StringsKt__StringsJVMKt.equals(it, "yes", true) || (lastEndorseRTOCode = DlRenewalSlotsActivity.this.getLastEndorseRTOCode()) == null) {
                return;
            }
            DlRenewalSlotsActivity dlRenewalSlotsActivity = DlRenewalSlotsActivity.this;
            dlRenewalSlotsActivity.l2(lastEndorseRTOCode, dlRenewalSlotsActivity, this.e, this.f, dlRenewalSlotsActivity.getMApplNo(), this.g);
        }
    }

    public static final class b extends Lambda implements Function1 {
        public static final b c = new b();

        public b() {
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

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            DlRenewalSlotsActivity.this.finish();
        }
    }

    public static final class d implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public d(Function1 function) {
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

    public static final class e extends Lambda implements Function1 {
        public final /* synthetic */ ProgressDialog c;
        public final /* synthetic */ DlRenewalSlotsActivity e;
        public final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ProgressDialog progressDialog, DlRenewalSlotsActivity dlRenewalSlotsActivity, int i) {
            super(1);
            this.c = progressDialog;
            this.e = dlRenewalSlotsActivity;
            this.f = i;
        }

        public final void a(JSONObject jSONObject) {
            try {
                this.c.dismiss();
                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                if (StringsKt__StringsJVMKt.equals(jSONObject2.getString("status_code"), "00", true)) {
                    DlRenewalSlotsActivity dlRenewalSlotsActivity = this.e;
                    dlRenewalSlotsActivity.f2(dlRenewalSlotsActivity.S1().b("label_dl_Service_instered", this.e.getString(R.string.dl_ll)), this.f);
                } else {
                    this.e.i2(jSONObject2.getString("status_desc"));
                }
            } catch (Exception unused) {
                DlRenewalSlotsActivity dlRenewalSlotsActivity2 = this.e;
                dlRenewalSlotsActivity2.i2(dlRenewalSlotsActivity2.S1().b("service_is_not_present", this.e.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((JSONObject) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function1 {

        public static final class a extends Lambda implements Function1 {
            public final /* synthetic */ DlRenewalSlotsActivity c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DlRenewalSlotsActivity dlRenewalSlotsActivity) {
                super(1);
                this.c = dlRenewalSlotsActivity;
            }

            public final void a(JSONObject jSONObject) {
                try {
                    ProgressDialog progressDialog = this.c.pDialog;
                    if (progressDialog == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                        progressDialog = null;
                    }
                    progressDialog.dismiss();
                    JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                    if (!StringsKt__StringsJVMKt.equals(jSONObject2.getString("status_code"), "00", true)) {
                        DlRenewalSlotsActivity dlRenewalSlotsActivity = this.c;
                        dlRenewalSlotsActivity.j2(dlRenewalSlotsActivity, jSONObject2.getString("status_desc"));
                        return;
                    }
                    JSONArray jSONArray = jSONObject2.getJSONArray("Slot_Details");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                        if (jSONObject3.getInt("avalableSeats") > 0) {
                            SlotDet slotDet = new SlotDet();
                            String string = jSONObject3.getString("quotadt");
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            slotDet.setQuotadt(string);
                            String string2 = jSONObject3.getString("timeForDisp");
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            slotDet.setTimeForDisp(string2);
                            slotDet.setAvalableSeats(jSONObject3.getInt("avalableSeats"));
                            slotDet.setQaflag(jSONObject3.getBoolean("qaflag"));
                            slotDet.setQcflag(jSONObject3.getBoolean("qcflag"));
                            slotDet.setSlotNo(jSONObject3.getInt("slotNo"));
                            slotDet.setHflag(jSONObject3.getBoolean("hflag"));
                            String string3 = jSONObject3.getString("rtoCode");
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            slotDet.setRtoCode(string3);
                            this.c.getArraylistslot().add(slotDet);
                        }
                    }
                    DlRenewalSlotsActivity dlRenewalSlotsActivity2 = this.c;
                    dlRenewalSlotsActivity2.k2(dlRenewalSlotsActivity2.getArraylistslot());
                } catch (Exception unused) {
                    DlRenewalSlotsActivity dlRenewalSlotsActivity3 = this.c;
                    dlRenewalSlotsActivity3.i2(dlRenewalSlotsActivity3.S1().b("service_is_not_present", this.c.getString(R.string.unable_to_get_details)));
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((JSONObject) obj);
                return Unit.INSTANCE;
            }
        }

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
        public final void a(JSONObject jSONObject) {
            try {
                ProgressDialog progressDialog = DlRenewalSlotsActivity.this.pDialog;
                if (progressDialog == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                    progressDialog = null;
                }
                progressDialog.dismiss();
                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                if (!Intrinsics.areEqual(jSONObject2.getString("status_code"), "00")) {
                    try {
                        DlRenewalSlotsActivity.this.i2(jSONObject2.getString("status_desc"));
                        return;
                    } catch (Exception unused) {
                        DlRenewalSlotsActivity dlRenewalSlotsActivity = DlRenewalSlotsActivity.this;
                        dlRenewalSlotsActivity.i2(dlRenewalSlotsActivity.S1().b("service_is_not_present", DlRenewalSlotsActivity.this.getString(R.string.unable_to_get_details)));
                        return;
                    }
                }
                JSONArray jSONArray = jSONObject2.getJSONArray("Applcnt_Details");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    String string = jSONObject3.getString("rtoCd");
                    if (string != null && string.length() != 0) {
                        DlRenewalSlotsActivity dlRenewalSlotsActivity2 = DlRenewalSlotsActivity.this;
                        String string2 = jSONObject3.getString("rtoCd");
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        dlRenewalSlotsActivity2.t2(string2);
                        DlRenewalSlotsActivity dlRenewalSlotsActivity3 = DlRenewalSlotsActivity.this;
                        dlRenewalSlotsActivity3.M1(dlRenewalSlotsActivity3, dlRenewalSlotsActivity3.X1());
                        ds1 ds1Var = DlRenewalSlotsActivity.this.viewModel;
                        if (ds1Var == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            ds1Var = null;
                        }
                        ms3 ms3VarK = ds1Var.k();
                        DlRenewalSlotsActivity dlRenewalSlotsActivity4 = DlRenewalSlotsActivity.this;
                        ms3VarK.g(dlRenewalSlotsActivity4, new d(new a(dlRenewalSlotsActivity4)));
                    }
                }
            } catch (Exception unused2) {
                DlRenewalSlotsActivity dlRenewalSlotsActivity5 = DlRenewalSlotsActivity.this;
                dlRenewalSlotsActivity5.i2(dlRenewalSlotsActivity5.S1().b("service_is_not_present", DlRenewalSlotsActivity.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((JSONObject) obj);
            return Unit.INSTANCE;
        }
    }

    private final ArrayList Q1(Calendar tapedDay) {
        String str = new SimpleDateFormat("yyyy-MM-dd").format(Long.valueOf(Calendar.getInstance().getTimeInMillis()));
        String str2 = new SimpleDateFormat("dd-MM-yyyy").format(Long.valueOf(tapedDay.getTimeInMillis()));
        String str3 = new SimpleDateFormat("EEE, MMM d").format(Long.valueOf(tapedDay.getTimeInMillis()));
        String str4 = new SimpleDateFormat("EEEE").format(Long.valueOf(tapedDay.getTimeInMillis()));
        fa faVar = this.mBinding;
        fa faVar2 = null;
        if (faVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            faVar = null;
        }
        faVar.B.setText(str3);
        if (str.equals(str2)) {
            fa faVar3 = this.mBinding;
            if (faVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                faVar2 = faVar3;
            }
            faVar2.C.setText("Today");
        } else {
            fa faVar4 = this.mBinding;
            if (faVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                faVar2 = faVar4;
            }
            faVar2.C.setText(str4);
        }
        ArrayList arrayList = new ArrayList();
        for (SlotDet slotDet : this.arraylistslot) {
            if (StringsKt__StringsJVMKt.equals(slotDet.getQuotadt(), str2, true) && slotDet.getQaflag()) {
                arrayList.add(slotDet);
            }
        }
        return arrayList;
    }

    private final Intent Z1(int pos) {
        Intent intent = new Intent(this, (Class<?>) DlSlotsAcknowActivity.class);
        intent.putExtra("dl_st_appl_ackno_no", this.mApplNo);
        intent.putExtra("dl_st_appl_ackno_no_dob", this.mApplDob);
        intent.putExtra("dl_st_dl_details_obj", R1());
        intent.putExtra("slot-date", ((SlotDet) this.items.get(pos)).getQuotadt());
        intent.putExtra("slot-time", ((SlotDet) this.items.get(pos)).getTimeForDisp());
        return intent;
    }

    public static final void a2(DlRenewalSlotsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void b2(DlRenewalSlotsActivity this$0, View view) {
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
            if (Intrinsics.areEqual(this$0.Y1().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", this$0.W1());
            }
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final void c2(DlRenewalSlotsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(this$0.Y1().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                if (this$0.U1().size() > 1) {
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
                    ((ImageView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dp1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            DlRenewalSlotsActivity.d2(dialog, view2);
                        }
                    });
                    int size = this$0.U1().size();
                    String str = "";
                    int i = 0;
                    String string = "";
                    while (i < size) {
                        str = str + ((String) this$0.U1().get(i)) + '\n';
                        StringBuilder sb = new StringBuilder();
                        sb.append(string);
                        i++;
                        sb.append(i);
                        sb.append(".\n");
                        string = sb.toString();
                    }
                    textView2.setText(str);
                    textView3.setText(string);
                    textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ep1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            DlRenewalSlotsActivity.e2(dialog, view2);
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
    public static final void d2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f2(String message, final int pos) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        textView.setText("Next");
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(S1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(S1().b("btn_dl_serv_next", "Next"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gp1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlRenewalSlotsActivity.g2(this.a, pos, dialog, view);
            }
        });
        dialog.show();
    }

    public static final void g2(DlRenewalSlotsActivity this$0, int i, Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d2, "$d");
        this$0.startActivity(this$0.Z1(i));
        d2.dismiss();
        this$0.finish();
    }

    private final void h2(String message, String mDate, int slot_nu, int forNextMoth) {
        String strB = S1().b("nex_parivahan", getString(R.string.app_name));
        Intrinsics.checkNotNull(strB);
        o40.q1(this, strB, message, 0, null, null, new a(mDate, slot_nu, forNextMoth), 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i2(String message) {
        if (message != null) {
            String strB = S1().b("nex_parivahan", getString(R.string.app_name));
            Intrinsics.checkNotNull(strB);
            String strB2 = S1().b("btn_ok", getString(R.string.ok_txt));
            Intrinsics.checkNotNull(strB2);
            o40.q1(this, strB, message, 1, strB2, null, b.c, 16, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j2(Context context, String message) {
        if (message != null) {
            String strB = S1().b("nex_parivahan", getString(R.string.app_name));
            Intrinsics.checkNotNull(strB);
            String strB2 = S1().b("btn_ok", getString(R.string.ok_txt));
            Intrinsics.checkNotNull(strB2);
            o40.q1(this, strB, message, 1, strB2, null, new c(), 16, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k2(ArrayList mSlotsEvents) {
        b46 b46Var;
        b46 b46Var2;
        Log.d("size", String.valueOf(mSlotsEvents.size()));
        this.mEvents.clear();
        Iterator it = mSlotsEvents.iterator();
        while (it.hasNext()) {
            SlotDet slotDet = (SlotDet) it.next();
            Date dateN1 = N1(slotDet.getQuotadt(), "dd-MM-yyyy", "yyyy/MM/dd");
            b46 b46Var3 = null;
            if (slotDet.getQaflag() && slotDet.getAvalableSeats() > 0) {
                if (dateN1 != null) {
                    Drawable drawable = getResources().getDrawable(R.drawable.dl_slots_green);
                    Intrinsics.checkNotNullExpressionValue(drawable, "getDrawable(...)");
                    b46Var2 = new b46(dateN1, drawable);
                } else {
                    b46Var2 = null;
                }
                if (b46Var2 != null) {
                    this.mEvents.add(b46Var2);
                }
            } else if (slotDet.getQcflag()) {
                if (dateN1 != null) {
                    Drawable drawable2 = getResources().getDrawable(R.drawable.dl_slots_red);
                    Intrinsics.checkNotNullExpressionValue(drawable2, "getDrawable(...)");
                    b46Var = new b46(dateN1, drawable2);
                } else {
                    b46Var = null;
                }
                if (b46Var != null) {
                    this.mEvents.add(b46Var);
                }
            }
            if (slotDet.getHflag()) {
                if (dateN1 != null) {
                    Drawable drawable3 = getResources().getDrawable(R.drawable.dl_slots_blue);
                    Intrinsics.checkNotNullExpressionValue(drawable3, "getDrawable(...)");
                    b46Var3 = new b46(dateN1, drawable3);
                }
                if (b46Var3 != null) {
                    this.mEvents.add(b46Var3);
                }
            }
        }
        Log.d("size", String.valueOf(this.mEvents.size()));
        m2();
    }

    public static final void n2(DlRenewalSlotsActivity this$0, AdapterView adapterView, View view, int i, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (adapterView != null) {
            int i2 = (int) j;
            if (adapterView.getAdapter().getView(i2, view, adapterView).getAlpha() == 0.4f) {
                return;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            Calendar calendar2 = Calendar.getInstance();
            Object item = adapterView.getAdapter().getItem(i2);
            Intrinsics.checkNotNull(item, "null cannot be cast to non-null type java.util.Date");
            calendar2.setTime((Date) item);
            boolean z = calendar.get(6) == calendar2.get(6);
            if (calendar.after(calendar2) && !z) {
                String strB = this$0.S1().b("previous_date", this$0.getString(R.string.prev_date));
                fa faVar = this$0.mBinding;
                if (faVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    faVar = null;
                }
                this$0.w1(strB, faVar.m());
            }
            try {
                Intrinsics.checkNotNull(calendar2);
                this$0.v2(calendar2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private final void p2() {
        this.custom_view = findViewById(R.id.custom_view);
        View viewFindViewById = findViewById(R.id.layoutCalender);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
        this.layoutCalender = (LinearLayout) viewFindViewById;
        fa faVar = this.mBinding;
        ds1 ds1Var = null;
        if (faVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            faVar = null;
        }
        faVar.Q.setLayoutManager(new LinearLayoutManager(this));
        this.viewModel = (ds1) new z(this).a(ds1.class);
        fa faVar2 = this.mBinding;
        if (faVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            faVar2 = null;
        }
        faVar2.v(this);
        if (getIntent() != null) {
            try {
                if (getIntent() != null) {
                    this.mApplNo = String.valueOf(getIntent().getStringExtra("dl_st_appl_ackno_no"));
                    this.mApplDob = O1(String.valueOf(getIntent().getStringExtra("dl_st_appl_ackno_no_dob")));
                    Bundle extras = getIntent().getExtras();
                    this.lastEndorseRTOCode = String.valueOf(extras != null ? extras.get("lastEndorseRTOCode") : null);
                    Bundle extras2 = getIntent().getExtras();
                    Serializable serializable = extras2 != null ? extras2.getSerializable("dl_st_dl_details_obj") : null;
                    Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
                    o2((DldetobjX) serializable);
                    this.dlNo = String.valueOf(getIntent().getStringExtra("DL"));
                    this.dob = String.valueOf(getIntent().getStringExtra("dob"));
                    this.Mobile_no = String.valueOf(getIntent().getStringExtra("Mobile_no"));
                    Serializable serializableExtra = getIntent().getSerializableExtra("DLDetails");
                    Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
                    o2((DldetobjX) serializableExtra);
                    String stringExtra = getIntent().getStringExtra("lastEndorsedRTO");
                    Intrinsics.checkNotNull(stringExtra, "null cannot be cast to non-null type kotlin.String");
                    this.lastEndorseRto = stringExtra;
                    String stringExtra2 = getIntent().getStringExtra("lastEndorsedState");
                    Intrinsics.checkNotNull(stringExtra2, "null cannot be cast to non-null type kotlin.String");
                    this.lastEndorseState = stringExtra2;
                    String stringExtra3 = getIntent().getStringExtra("lastEndorseStateCode");
                    Intrinsics.checkNotNull(stringExtra3, "null cannot be cast to non-null type kotlin.String");
                    this.lastEndorseStateCode = stringExtra3;
                    fa faVar3 = this.mBinding;
                    if (faVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        faVar3 = null;
                    }
                    faVar3.D.setText("DL No. " + R1().getBioObj().getBioDlno());
                    BioImgObjX bioImgObj = R1().getBioImgObj();
                    String biPhoto = bioImgObj != null ? bioImgObj.getBiPhoto() : null;
                    if (biPhoto == null || biPhoto.length() == 0) {
                        fa faVar4 = this.mBinding;
                        if (faVar4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            faVar4 = null;
                        }
                        faVar4.E.f.setVisibility(4);
                    } else {
                        fa faVar5 = this.mBinding;
                        if (faVar5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            faVar5 = null;
                        }
                        faVar5.E.f.setVisibility(0);
                        fa faVar6 = this.mBinding;
                        if (faVar6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            faVar6 = null;
                        }
                        ImageView imageView = faVar6.E.b;
                        BioImgObjX bioImgObj2 = R1().getBioImgObj();
                        imageView.setImageBitmap(kt6.a(bioImgObj2 != null ? bioImgObj2.getBiPhoto() : null));
                    }
                }
                if (!com.nic.mparivahan.a.a.a(this)) {
                    Toast.makeText(getApplicationContext(), S1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
                    return;
                }
                L1(this);
                ds1 ds1Var2 = this.viewModel;
                if (ds1Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    ds1Var = ds1Var2;
                }
                ds1Var.h().g(this, new d(new f()));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private final void v2(Calendar tapedDay) {
        this.items.clear();
        this.items.addAll(Q1(tapedDay));
        this.adapter = new a46(this, this.items, this);
        fa faVar = this.mBinding;
        a46 a46Var = null;
        if (faVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            faVar = null;
        }
        RecyclerView recyclerView = faVar.Q;
        a46 a46Var2 = this.adapter;
        if (a46Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            a46Var = a46Var2;
        }
        recyclerView.setAdapter(a46Var);
    }

    public final void L1(Context context) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            ProgressDialog progressDialog = new ProgressDialog(context);
            this.pDialog = progressDialog;
            progressDialog.setMessage(context.getResources().getString(R.string.loading_msg));
            ProgressDialog progressDialog2 = this.pDialog;
            ds1 ds1Var = null;
            if (progressDialog2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog2 = null;
            }
            progressDialog2.show();
            ProgressDialog progressDialog3 = this.pDialog;
            if (progressDialog3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog3 = null;
            }
            progressDialog3.setCancelable(false);
            ProgressDialog progressDialog4 = this.pDialog;
            if (progressDialog4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog4 = null;
            }
            progressDialog4.setCanceledOnTouchOutside(false);
            String str2 = this.mApplNo;
            if (str2 == null || (str = this.mApplDob) == null) {
                return;
            }
            ds1 ds1Var2 = this.viewModel;
            if (ds1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                ds1Var = ds1Var2;
            }
            ds1Var.g(str2, str);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void M1(Context context, String rtoCd) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rtoCd, "rtoCd");
        try {
            ProgressDialog progressDialog = new ProgressDialog(context);
            this.pDialog = progressDialog;
            progressDialog.setMessage(S1().b("label_challan_please_wait", "Please wait..."));
            ProgressDialog progressDialog2 = this.pDialog;
            ds1 ds1Var = null;
            if (progressDialog2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog2 = null;
            }
            progressDialog2.show();
            ProgressDialog progressDialog3 = this.pDialog;
            if (progressDialog3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog3 = null;
            }
            progressDialog3.setCancelable(false);
            ProgressDialog progressDialog4 = this.pDialog;
            if (progressDialog4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                progressDialog4 = null;
            }
            progressDialog4.setCanceledOnTouchOutside(false);
            ds1 ds1Var2 = this.viewModel;
            if (ds1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                ds1Var = ds1Var2;
            }
            ds1Var.p(StringsKt__StringsKt.trim((CharSequence) rtoCd).toString(), "0", "0");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final Date N1(String dateToFormat, String inputFormat, String outputFormat) {
        Intrinsics.checkNotNullParameter(dateToFormat, "dateToFormat");
        try {
            return new SimpleDateFormat("yyyy/MM/dd").parse(new SimpleDateFormat(outputFormat).format(new SimpleDateFormat(inputFormat).parse(dateToFormat)));
        } catch (ParseException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final String O1(String fdate) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = simpleDateFormat.parse(fdate);
            Intrinsics.checkNotNullExpressionValue(date, "parse(...)");
            return simpleDateFormat2.format(date);
        } catch (ParseException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: P1, reason: from getter */
    public final ArrayList getArraylistslot() {
        return this.arraylistslot;
    }

    public final DldetobjX R1() {
        DldetobjX dldetobjX = this.dlDetails;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlDetails");
        return null;
    }

    public final wa3 S1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    /* JADX INFO: renamed from: T1, reason: from getter */
    public final String getLastEndorseRTOCode() {
        return this.lastEndorseRTOCode;
    }

    public final ArrayList U1() {
        ArrayList arrayList = this.listHeaderSteps;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("listHeaderSteps");
        return null;
    }

    /* JADX INFO: renamed from: V1, reason: from getter */
    public final String getMApplNo() {
        return this.mApplNo;
    }

    public final ArrayList W1() {
        ArrayList arrayList = this.multiListName;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiListName");
        return null;
    }

    public final String X1() {
        String str = this.rtoCdNew;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rtoCdNew");
        return null;
    }

    public final wl5 Y1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    @Override // com.zepto.a46.a
    public void i(int pos, String mDate, int slot_nu) {
        Intrinsics.checkNotNullParameter(mDate, "mDate");
        if (!com.nic.mparivahan.a.a.a(this)) {
            Toast.makeText(getApplicationContext(), S1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        if (!((SlotDet) this.items.get(pos)).getQaflag() || ((SlotDet) this.items.get(pos)).getAvalableSeats() <= 0) {
            if (((SlotDet) this.items.get(pos)).getAvalableSeats() == 0) {
                String strB = S1().b("label_slots_not_avl", "");
                fa faVar = this.mBinding;
                if (faVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    faVar = null;
                }
                w1(strB, faVar.m());
                return;
            }
            return;
        }
        String strB2 = S1().b("label_sure_to_book_slot" + slot_nu + " on " + slot_nu, "Are you sure to book Slot");
        Intrinsics.checkNotNull(strB2);
        h2(strB2, mDate, slot_nu, pos);
    }

    public final void l2(String rto_code, Context mContext, String mDate, int slot_nu, String app_number, int forNextMoth) {
        ds1 ds1Var;
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mDate, "mDate");
        try {
            ProgressDialog progressDialog = new ProgressDialog(mContext);
            progressDialog.setMessage(S1().b("label_challan_please_wait", "Please wait..."));
            progressDialog.show();
            progressDialog.setCancelable(false);
            progressDialog.setCanceledOnTouchOutside(false);
            ds1 ds1Var2 = this.viewModel;
            ds1 ds1Var3 = null;
            if (ds1Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                ds1Var = null;
            } else {
                ds1Var = ds1Var2;
            }
            String strX1 = X1();
            Intrinsics.checkNotNull(strX1);
            String string = StringsKt__StringsKt.trim((CharSequence) strX1.toString()).toString();
            Intrinsics.checkNotNull(app_number);
            ds1Var.r(string, app_number, mDate, "" + slot_nu, "0", "0");
            ds1 ds1Var4 = this.viewModel;
            if (ds1Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                ds1Var3 = ds1Var4;
            }
            ds1Var3.m().g(this, new d(new e(progressDialog, this, forNextMoth)));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void m2() {
        View view = this.custom_view;
        ViewParent parent = view != null ? view.getParent() : null;
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).removeView(this.custom_view);
        LinearLayout linearLayout = this.layoutCalender;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        LinearLayout linearLayout2 = this.layoutCalender;
        if (linearLayout2 != null) {
            linearLayout2.setOrientation(1);
        }
        u90 u90Var = new u90(this, this.mEvents);
        u90Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout3 = this.layoutCalender;
        if (linearLayout3 != null) {
            linearLayout3.addView(u90Var);
        }
        ExpandableHeightGridView calendarGridView = u90Var.getCalendarGridView();
        if (calendarGridView == null) {
            return;
        }
        calendarGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.zepto.fp1
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                DlRenewalSlotsActivity.n2(this.a, adapterView, view2, i, j);
            }
        });
    }

    public final void o2(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dlDetails = dldetobjX;
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lq7 lq7VarF = kd1.f(this, R.layout.activity_dl_renewal_slots);
        Intrinsics.checkNotNullExpressionValue(lq7VarF, "setContentView(...)");
        fa faVar = (fa) lq7VarF;
        this.mBinding = faVar;
        ta3.a aVar = ta3.a;
        fa faVar2 = null;
        if (faVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            faVar = null;
        }
        aVar.U1(this, faVar);
        u2(new wl5(this));
        q2(new wa3(this));
        p2();
        fa faVar3 = this.mBinding;
        if (faVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            faVar3 = null;
        }
        faVar3.K.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ap1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlRenewalSlotsActivity.a2(this.a, view);
            }
        });
        if (Intrinsics.areEqual(Y1().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                Serializable serializableExtra = getIntent().getSerializableExtra("listHeaderSteps");
                Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                r2((ArrayList) serializableExtra);
                Serializable serializableExtra2 = getIntent().getSerializableExtra("multiList");
                Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                s2((ArrayList) serializableExtra2);
                if (U1().size() == 1) {
                    fa faVar4 = this.mBinding;
                    if (faVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        faVar4 = null;
                    }
                    faVar4.K.g.setText((CharSequence) U1().get(0));
                } else {
                    fa faVar5 = this.mBinding;
                    if (faVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        faVar5 = null;
                    }
                    TextView textView = faVar5.K.g;
                    String strB = S1().b("dl_services", getString(R.string.dl_services));
                    Intrinsics.checkNotNull(strB);
                    textView.setText(strB);
                    fa faVar6 = this.mBinding;
                    if (faVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        faVar6 = null;
                    }
                    TextView textView2 = faVar6.K.g;
                    fa faVar7 = this.mBinding;
                    if (faVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        faVar7 = null;
                    }
                    textView2.setPaintFlags(faVar7.K.g.getPaintFlags() | 8);
                }
            } catch (Exception unused) {
            }
        } else {
            fa faVar8 = this.mBinding;
            if (faVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                faVar8 = null;
            }
            faVar8.K.g.setText(Y1().k());
        }
        fa faVar9 = this.mBinding;
        if (faVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            faVar9 = null;
        }
        faVar9.K.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bp1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlRenewalSlotsActivity.b2(this.a, view);
            }
        });
        fa faVar10 = this.mBinding;
        if (faVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            faVar10 = null;
        }
        faVar10.K.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cp1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlRenewalSlotsActivity.c2(this.a, view);
            }
        });
        fa faVar11 = this.mBinding;
        if (faVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            faVar11 = null;
        }
        faVar11.K.e.setVisibility(8);
        fa faVar12 = this.mBinding;
        if (faVar12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            faVar12 = null;
        }
        faVar12.E.g.setVisibility(0);
        fa faVar13 = this.mBinding;
        if (faVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            faVar2 = faVar13;
        }
        faVar2.E.g.setText(Y1().k());
    }

    public final void q2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void r2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.listHeaderSteps = arrayList;
    }

    public final void s2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.multiListName = arrayList;
    }

    public final void setCustom_view(View view) {
        this.custom_view = view;
    }

    public final void t2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoCdNew = str;
    }

    public final void u2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }
}
