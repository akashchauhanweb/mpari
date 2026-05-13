package com.nic.mparivahan.ClServices.View;

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
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nic.mparivahan.ClServices.View.ClSots;
import com.nic.mparivahan.ClServicesMainScreens.ClDetailsTop;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.SlotDet;
import com.nic.mparivahan.dlservices.ui.slots.calendar.ExpandableHeightGridView;
import com.zepto.a46;
import com.zepto.b46;
import com.zepto.ds1;
import com.zepto.g8;
import com.zepto.mf4;
import com.zepto.ms3;
import com.zepto.o40;
import com.zepto.ta3;
import com.zepto.u90;
import com.zepto.wa3;
import com.zepto.wl5;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b?\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002B\t¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u001a\u0010\u0014\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J(\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0002J\u0012\u0010\u0019\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u001c\u0010\u001c\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0012\u0010\u001f\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0014J\u0014\u0010!\u001a\u0004\u0018\u00010\u00122\b\u0010 \u001a\u0004\u0018\u00010\u0012H\u0007J\u0006\u0010\"\u001a\u00020\u0003J$\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010#\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u00122\b\u0010%\u001a\u0004\u0018\u00010\u0012J \u0010(\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u000e\u0010)\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001aJ\u0016\u0010+\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u0012J:\u0010/\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010\u00122\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000e2\b\u0010.\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0017\u001a\u00020\u000eR\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR$\u0010K\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010S\u001a\u0004\u0018\u00010L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010Z\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR(\u0010\b\u001a\b\u0012\u0004\u0012\u00020[0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR(\u0010f\u001a\b\u0012\u0004\u0012\u00020b0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010]\u001a\u0004\bd\u0010_\"\u0004\be\u0010aR\u001d\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\bg\u0010]\u001a\u0004\bh\u0010_R$\u0010m\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010U\u001a\u0004\bk\u0010W\"\u0004\bl\u0010YR$\u0010q\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010U\u001a\u0004\bo\u0010W\"\u0004\bp\u0010YR\"\u0010u\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010U\u001a\u0004\bs\u0010W\"\u0004\bt\u0010YR$\u0010y\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bv\u0010U\u001a\u0004\bw\u0010W\"\u0004\bx\u0010YR$\u0010}\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010U\u001a\u0004\b{\u0010W\"\u0004\b|\u0010YR&\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b~\u0010U\u001a\u0004\b\u007f\u0010W\"\u0005\b\u0080\u0001\u0010YR&\u0010\u0085\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010U\u001a\u0005\b\u0083\u0001\u0010W\"\u0005\b\u0084\u0001\u0010YR&\u0010\u0089\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010U\u001a\u0005\b\u0087\u0001\u0010W\"\u0005\b\u0088\u0001\u0010YR&\u0010\u008d\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010U\u001a\u0005\b\u008b\u0001\u0010W\"\u0005\b\u008c\u0001\u0010YR&\u0010\u0091\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010U\u001a\u0005\b\u008f\u0001\u0010W\"\u0005\b\u0090\u0001\u0010YR&\u0010\u0095\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0092\u0001\u0010U\u001a\u0005\b\u0093\u0001\u0010W\"\u0005\b\u0094\u0001\u0010YR&\u0010\u0099\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0096\u0001\u0010U\u001a\u0005\b\u0097\u0001\u0010W\"\u0005\b\u0098\u0001\u0010YR&\u0010\u009d\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009a\u0001\u0010U\u001a\u0005\b\u009b\u0001\u0010W\"\u0005\b\u009c\u0001\u0010YR&\u0010¡\u0001\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009e\u0001\u0010U\u001a\u0005\b\u009f\u0001\u0010W\"\u0005\b \u0001\u0010YR*\u0010©\u0001\u001a\u00030¢\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R*\u0010±\u0001\u001a\u00030ª\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R \u0010´\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\u000e\n\u0005\b²\u0001\u0010]\u001a\u0005\b³\u0001\u0010_¨\u0006·\u0001"}, d2 = {"Lcom/nic/mparivahan/ClServices/View/ClSots;", "Lcom/zepto/o40;", "Lcom/zepto/a46$a;", "", "W1", "k2", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/dlservices/data/model/SlotDet;", "mSlotsEvents", "f2", "Ljava/util/Calendar;", "tapedDay", "o2", "P1", "", "pos", "Landroid/content/Intent;", "V1", "", "message", "a2", "mDate", "slot_nu", "forNextMoth", "c2", "d2", "Landroid/content/Context;", "context", "e2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "fdate", "M1", "i2", "dateToFormat", "inputFormat", "outputFormat", "Ljava/util/Date;", "L1", "i", "J1", "rtoCd", "K1", "rto_code", "mContext", "app_number", "g2", "Lcom/zepto/g8;", "F", "Lcom/zepto/g8;", "O1", "()Lcom/zepto/g8;", "h2", "(Lcom/zepto/g8;)V", "cBinding", "Lcom/zepto/ds1;", "G", "Lcom/zepto/ds1;", "viewModel", "Lcom/zepto/a46;", "H", "Lcom/zepto/a46;", "adapter", "Landroid/app/ProgressDialog;", "I", "Landroid/app/ProgressDialog;", "pDialog", "Landroid/widget/LinearLayout;", "J", "Landroid/widget/LinearLayout;", "getLayoutCalender", "()Landroid/widget/LinearLayout;", "setLayoutCalender", "(Landroid/widget/LinearLayout;)V", "layoutCalender", "Landroid/view/View;", "K", "Landroid/view/View;", "getCustom_view", "()Landroid/view/View;", "setCustom_view", "(Landroid/view/View;)V", "custom_view", "L", "Ljava/lang/String;", "R1", "()Ljava/lang/String;", "setLastEndorseRTOCode", "(Ljava/lang/String;)V", "lastEndorseRTOCode", "Lcom/nic/mparivahan/dlservices/ui/slots/calendar/SlotDetailsItem;", "M", "Ljava/util/ArrayList;", "getMSlotsEvents", "()Ljava/util/ArrayList;", "setMSlotsEvents", "(Ljava/util/ArrayList;)V", "Lcom/zepto/b46;", "N", "getMEvents", "setMEvents", "mEvents", "O", "N1", "arraylistslot", "P", "S1", "setMApplNo", "mApplNo", "Q", "getMApplDob", "setMApplDob", "mApplDob", "R", "T1", "m2", "rtoCdNew", "S", "getDlNo", "setDlNo", "dlNo", "T", "getDob", "setDob", "dob", "U", "getMobile_no", "setMobile_no", "Mobile_no", "V", "getLastEndorseRto", "setLastEndorseRto", "lastEndorseRto", "W", "getClName", "setClName", "clName", "X", "getFatherName", "setFatherName", "fatherName", "Y", "getAddress", "setAddress", "address", "Z", "getCl_Status", "setCl_Status", "cl_Status", "a0", "getClPhoto", "setClPhoto", "clPhoto", "b0", "getIssuing_authority", "setIssuing_authority", "issuing_authority", "c0", "getValidity", "setValidity", "validity", "Lcom/zepto/wa3;", "d0", "Lcom/zepto/wa3;", "Q1", "()Lcom/zepto/wa3;", "l2", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/wl5;", "e0", "Lcom/zepto/wl5;", "U1", "()Lcom/zepto/wl5;", "n2", "(Lcom/zepto/wl5;)V", "sarthiSession", "f0", "getItems", "items", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nClSots.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClSots.kt\ncom/nic/mparivahan/ClServices/View/ClSots\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,684:1\n1855#2:685\n1856#2:687\n1855#2,2:688\n1#3:686\n*S KotlinDebug\n*F\n+ 1 ClSots.kt\ncom/nic/mparivahan/ClServices/View/ClSots\n*L\n369#1:685\n369#1:687\n453#1:688,2\n*E\n"})
public final class ClSots extends o40 implements a46.a {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public g8 cBinding;

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
    public String rtoCdNew;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ArrayList mSlotsEvents = new ArrayList();

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ArrayList mEvents = new ArrayList();

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public final ArrayList arraylistslot = new ArrayList();

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String dlNo = "";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String dob = "";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String Mobile_no = "";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String lastEndorseRto = "";

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String clName = "";

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String fatherName = "";

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String address = "";

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public String cl_Status = "";

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public String clPhoto = "";

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public String issuing_authority = "";

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public String validity = "";

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
            if (!StringsKt__StringsJVMKt.equals(it, "yes", true) || (lastEndorseRTOCode = ClSots.this.getLastEndorseRTOCode()) == null) {
                return;
            }
            ClSots clSots = ClSots.this;
            clSots.g2(lastEndorseRTOCode, clSots, this.e, this.f, clSots.getMApplNo(), this.g);
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
            ClSots.this.finish();
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
        public final /* synthetic */ ClSots e;
        public final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ProgressDialog progressDialog, ClSots clSots, int i) {
            super(1);
            this.c = progressDialog;
            this.e = clSots;
            this.f = i;
        }

        public final void a(JSONObject jSONObject) {
            try {
                this.c.dismiss();
                Log.d("save_slot", jSONObject.toString());
                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                if (StringsKt__StringsJVMKt.equals(jSONObject2.getString("status_code"), "00", true)) {
                    ClSots clSots = this.e;
                    clSots.a2(clSots.Q1().b("label_dl_Service_instered", this.e.getString(R.string.dl_ll)), this.f);
                } else {
                    this.e.d2(jSONObject2.getString("status_desc"));
                }
            } catch (Exception unused) {
                ClSots clSots2 = this.e;
                clSots2.d2(clSots2.Q1().b("service_is_not_present", this.e.getString(R.string.unable_to_get_details)));
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
            public final /* synthetic */ ClSots c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ClSots clSots) {
                super(1);
                this.c = clSots;
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
                        ClSots clSots = this.c;
                        clSots.e2(clSots, jSONObject2.getString("status_desc"));
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
                    ClSots clSots2 = this.c;
                    clSots2.f2(clSots2.getArraylistslot());
                } catch (Exception unused) {
                    ClSots clSots3 = this.c;
                    clSots3.d2(clSots3.Q1().b("service_is_not_present", this.c.getString(R.string.unable_to_get_details)));
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
                ProgressDialog progressDialog = ClSots.this.pDialog;
                if (progressDialog == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                    progressDialog = null;
                }
                progressDialog.dismiss();
                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                if (!Intrinsics.areEqual(jSONObject2.getString("status_code"), "00")) {
                    try {
                        ClSots.this.d2(jSONObject2.getString("status_desc"));
                        return;
                    } catch (Exception unused) {
                        ClSots clSots = ClSots.this;
                        clSots.d2(clSots.Q1().b("service_is_not_present", ClSots.this.getString(R.string.unable_to_get_details)));
                        return;
                    }
                }
                JSONArray jSONArray = jSONObject2.getJSONArray("Applcnt_Details");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    String string = jSONObject3.getString("rtoCd");
                    if (string != null && string.length() != 0) {
                        ClSots clSots2 = ClSots.this;
                        String string2 = jSONObject3.getString("rtoCd");
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        clSots2.m2(string2);
                        ClSots clSots3 = ClSots.this;
                        clSots3.K1(clSots3, clSots3.T1());
                        ds1 ds1Var = ClSots.this.viewModel;
                        if (ds1Var == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            ds1Var = null;
                        }
                        ms3 ms3VarK = ds1Var.k();
                        ClSots clSots4 = ClSots.this;
                        ms3VarK.g(clSots4, new d(new a(clSots4)));
                    }
                }
            } catch (Exception unused2) {
                ClSots clSots5 = ClSots.this;
                clSots5.d2(clSots5.Q1().b("service_is_not_present", ClSots.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((JSONObject) obj);
            return Unit.INSTANCE;
        }
    }

    private final void W1() {
        O1().I.g.setText(U1().k());
        O1().I.h.setPaintFlags(O1().I.h.getPaintFlags() | 8);
        TextView textView = O1().I.h;
        String str = this.dlNo;
        Intrinsics.checkNotNull(str);
        textView.setText(StringsKt__StringsKt.trim((CharSequence) str).toString());
        O1().I.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClSots.X1(this.a, view);
            }
        });
    }

    public static final void X1(ClSots this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) ClDetailsTop.class);
            intent.putExtra("dlValue", StringsKt__StringsKt.trim((CharSequence) String.valueOf(this$0.dlNo)).toString());
            intent.putExtra("dobValue", this$0.dob);
            intent.putExtra("fatherName", this$0.fatherName);
            intent.putExtra("clName", this$0.clName);
            intent.putExtra("clPhoto", this$0.clPhoto);
            intent.putExtra("address", this$0.address).toString();
            intent.putExtra("issuing_authority", this$0.issuing_authority).toString();
            intent.putExtra("validity", this$0.validity).toString();
            intent.putExtra("cl_Status", this$0.cl_Status).toString();
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final void Y1(ClSots this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void Z1(ClSots this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void b2(ClSots this$0, int i, Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d2, "$d");
        try {
            this$0.startActivity(this$0.V1(i));
        } catch (Exception unused) {
        }
        d2.dismiss();
        this$0.finish();
    }

    public static final void j2(ClSots this$0, AdapterView adapterView, View view, int i, long j) {
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
                this$0.w1(this$0.Q1().b("previous_date", this$0.getString(R.string.prev_date)), this$0.O1().m());
            }
            try {
                Intrinsics.checkNotNull(calendar2);
                this$0.o2(calendar2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void J1(Context context) {
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

    public final void K1(Context context, String rtoCd) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rtoCd, "rtoCd");
        try {
            ProgressDialog progressDialog = new ProgressDialog(context);
            this.pDialog = progressDialog;
            progressDialog.setMessage(Q1().b("label_challan_please_wait", "Please wait..."));
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
            Log.d("checkAppSlots", e2.getLocalizedMessage());
        }
    }

    public final Date L1(String dateToFormat, String inputFormat, String outputFormat) {
        Intrinsics.checkNotNullParameter(dateToFormat, "dateToFormat");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Log.d("DATE", "Input Date Date is " + dateToFormat);
            String str = new SimpleDateFormat(outputFormat).format(new SimpleDateFormat(inputFormat).parse(dateToFormat));
            Log.d("DATE", "Output Date is " + str);
            return simpleDateFormat.parse(str);
        } catch (ParseException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final String M1(String fdate) {
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

    /* JADX INFO: renamed from: N1, reason: from getter */
    public final ArrayList getArraylistslot() {
        return this.arraylistslot;
    }

    public final g8 O1() {
        g8 g8Var = this.cBinding;
        if (g8Var != null) {
            return g8Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        return null;
    }

    public final ArrayList P1(Calendar tapedDay) {
        String str = new SimpleDateFormat("yyyy-MM-dd").format(Long.valueOf(Calendar.getInstance().getTimeInMillis()));
        String str2 = new SimpleDateFormat("dd-MM-yyyy").format(Long.valueOf(tapedDay.getTimeInMillis()));
        String str3 = new SimpleDateFormat("EEE, MMM d").format(Long.valueOf(tapedDay.getTimeInMillis()));
        String str4 = new SimpleDateFormat("EEEE").format(Long.valueOf(tapedDay.getTimeInMillis()));
        O1().B.setText(str3);
        if (str.equals(str2)) {
            O1().C.setText("Today");
        } else {
            O1().C.setText(str4);
        }
        ArrayList arrayList = new ArrayList();
        for (SlotDet slotDet : this.arraylistslot) {
            if (StringsKt__StringsJVMKt.equals(slotDet.getQuotadt(), str2, true) && slotDet.getQaflag()) {
                arrayList.add(slotDet);
            }
        }
        return arrayList;
    }

    public final wa3 Q1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    /* JADX INFO: renamed from: R1, reason: from getter */
    public final String getLastEndorseRTOCode() {
        return this.lastEndorseRTOCode;
    }

    /* JADX INFO: renamed from: S1, reason: from getter */
    public final String getMApplNo() {
        return this.mApplNo;
    }

    public final String T1() {
        String str = this.rtoCdNew;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rtoCdNew");
        return null;
    }

    public final wl5 U1() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final Intent V1(int pos) {
        Intent intent = new Intent(this, (Class<?>) ClSlotsAcknow.class);
        intent.putExtra("dl_st_appl_ackno_no", this.mApplNo);
        intent.putExtra("dl_st_appl_ackno_no_dob", this.mApplDob);
        intent.putExtra("slot-date", ((SlotDet) this.items.get(pos)).getQuotadt());
        intent.putExtra("slot-time", ((SlotDet) this.items.get(pos)).getTimeForDisp());
        return intent;
    }

    public final void a2(String message, final int pos) {
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
        ((TextView) viewFindViewById3).setText(Q1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(Q1().b("btn_dl_serv_next", "Next"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.up0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClSots.b2(this.a, pos, dialog, view);
            }
        });
        dialog.show();
    }

    public final void c2(String message, String mDate, int slot_nu, int forNextMoth) {
        String strB = Q1().b("nex_parivahan", getString(R.string.app_name));
        Intrinsics.checkNotNull(strB);
        o40.q1(this, strB, message, 0, null, null, new a(mDate, slot_nu, forNextMoth), 24, null);
    }

    public final void d2(String message) {
        if (message != null) {
            String strB = Q1().b("nex_parivahan", getString(R.string.app_name));
            Intrinsics.checkNotNull(strB);
            String strB2 = Q1().b("btn_ok", getString(R.string.ok_txt));
            Intrinsics.checkNotNull(strB2);
            o40.q1(this, strB, message, 1, strB2, null, b.c, 16, null);
        }
    }

    public final void e2(Context context, String message) {
        if (message != null) {
            String strB = Q1().b("nex_parivahan", getString(R.string.app_name));
            Intrinsics.checkNotNull(strB);
            String strB2 = Q1().b("btn_ok", getString(R.string.ok_txt));
            Intrinsics.checkNotNull(strB2);
            o40.q1(this, strB, message, 1, strB2, null, new c(), 16, null);
        }
    }

    public final void f2(ArrayList mSlotsEvents) {
        b46 b46Var;
        b46 b46Var2;
        Log.d("size", String.valueOf(mSlotsEvents.size()));
        this.mEvents.clear();
        Iterator it = mSlotsEvents.iterator();
        while (it.hasNext()) {
            SlotDet slotDet = (SlotDet) it.next();
            Date dateL1 = L1(slotDet.getQuotadt(), "dd-MM-yyyy", "yyyy/MM/dd");
            b46 b46Var3 = null;
            if (slotDet.getQaflag() && slotDet.getAvalableSeats() > 0) {
                if (dateL1 != null) {
                    Drawable drawable = getResources().getDrawable(R.drawable.dl_slots_green);
                    Intrinsics.checkNotNullExpressionValue(drawable, "getDrawable(...)");
                    b46Var2 = new b46(dateL1, drawable);
                } else {
                    b46Var2 = null;
                }
                if (b46Var2 != null) {
                    this.mEvents.add(b46Var2);
                }
            } else if (slotDet.getQcflag()) {
                if (dateL1 != null) {
                    Drawable drawable2 = getResources().getDrawable(R.drawable.dl_slots_red);
                    Intrinsics.checkNotNullExpressionValue(drawable2, "getDrawable(...)");
                    b46Var = new b46(dateL1, drawable2);
                } else {
                    b46Var = null;
                }
                if (b46Var != null) {
                    this.mEvents.add(b46Var);
                }
            }
            if (slotDet.getHflag()) {
                if (dateL1 != null) {
                    Drawable drawable3 = getResources().getDrawable(R.drawable.dl_slots_blue);
                    Intrinsics.checkNotNullExpressionValue(drawable3, "getDrawable(...)");
                    b46Var3 = new b46(dateL1, drawable3);
                }
                if (b46Var3 != null) {
                    this.mEvents.add(b46Var3);
                }
            }
        }
        Log.d("size", String.valueOf(this.mEvents.size()));
        i2();
    }

    public final void g2(String rto_code, Context mContext, String mDate, int slot_nu, String app_number, int forNextMoth) {
        ds1 ds1Var;
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mDate, "mDate");
        try {
            ProgressDialog progressDialog = new ProgressDialog(mContext);
            progressDialog.setMessage(Q1().b("label_challan_please_wait", "Please wait..."));
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
            String strT1 = T1();
            Intrinsics.checkNotNull(strT1);
            String string = StringsKt__StringsKt.trim((CharSequence) strT1.toString()).toString();
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

    public final void h2(g8 g8Var) {
        Intrinsics.checkNotNullParameter(g8Var, "<set-?>");
        this.cBinding = g8Var;
    }

    @Override // com.zepto.a46.a
    public void i(int pos, String mDate, int slot_nu) {
        Intrinsics.checkNotNullParameter(mDate, "mDate");
        if (!com.nic.mparivahan.a.a.a(this)) {
            Toast.makeText(getApplicationContext(), Q1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        if (!((SlotDet) this.items.get(pos)).getQaflag() || ((SlotDet) this.items.get(pos)).getAvalableSeats() <= 0) {
            if (((SlotDet) this.items.get(pos)).getAvalableSeats() == 0) {
                w1(Q1().b("label_slots_not_avl", ""), O1().m());
                return;
            }
            return;
        }
        String strB = Q1().b("label_sure_to_book_slot" + slot_nu + " on " + slot_nu, "Are you sure to book Slot");
        Intrinsics.checkNotNull(strB);
        c2(strB, mDate, slot_nu, pos);
    }

    public final void i2() {
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
        calendarGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.zepto.sp0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                ClSots.j2(this.a, adapterView, view2, i, j);
            }
        });
    }

    public final void k2() {
        this.custom_view = findViewById(R.id.custom_view);
        View viewFindViewById = findViewById(R.id.layoutCalender);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
        this.layoutCalender = (LinearLayout) viewFindViewById;
        O1().M.setLayoutManager(new LinearLayoutManager(this));
        this.viewModel = (ds1) new z(this).a(ds1.class);
        O1().v(this);
        if (getIntent() != null) {
            try {
                ds1 ds1Var = null;
                if (getIntent() != null) {
                    try {
                        this.mApplNo = String.valueOf(getIntent().getStringExtra("dl_st_appl_ackno_no"));
                        this.mApplDob = M1(String.valueOf(getIntent().getStringExtra("dl_st_appl_ackno_no_dob")));
                        Bundle extras = getIntent().getExtras();
                        this.lastEndorseRTOCode = String.valueOf(extras != null ? extras.get("lastEndorseRTOCode") : null);
                        this.dlNo = String.valueOf(getIntent().getStringExtra("DL"));
                        this.dob = String.valueOf(getIntent().getStringExtra("dob"));
                        this.Mobile_no = String.valueOf(getIntent().getStringExtra("Mobile_no"));
                        String stringExtra = getIntent().getStringExtra("lastEndorsedRTO");
                        Intrinsics.checkNotNull(stringExtra, "null cannot be cast to non-null type kotlin.String");
                        this.lastEndorseRto = stringExtra;
                        String stringExtra2 = getIntent().getStringExtra("clName");
                        Intrinsics.checkNotNull(stringExtra2, "null cannot be cast to non-null type kotlin.String");
                        this.clName = stringExtra2;
                        String stringExtra3 = getIntent().getStringExtra("fatherName");
                        Intrinsics.checkNotNull(stringExtra3, "null cannot be cast to non-null type kotlin.String");
                        this.fatherName = stringExtra3;
                        this.address = String.valueOf(getIntent().getStringExtra("address"));
                        this.issuing_authority = String.valueOf(getIntent().getStringExtra("issuing_authority"));
                        this.validity = String.valueOf(getIntent().getStringExtra("validity"));
                        this.cl_Status = String.valueOf(getIntent().getStringExtra("cl_Status"));
                        String stringExtra4 = getIntent().getStringExtra("clPhoto");
                        Intrinsics.checkNotNull(stringExtra4, "null cannot be cast to non-null type kotlin.String");
                        this.clPhoto = stringExtra4;
                    } catch (Exception unused) {
                    }
                }
                if (!com.nic.mparivahan.a.a.a(this)) {
                    Toast.makeText(getApplicationContext(), Q1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
                    return;
                }
                J1(this);
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

    public final void l2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void m2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoCdNew = str;
    }

    public final void n2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final void o2(Calendar tapedDay) {
        this.items.clear();
        this.items.addAll(P1(tapedDay));
        this.adapter = new a46(this, this.items, this);
        RecyclerView recyclerView = O1().M;
        a46 a46Var = this.adapter;
        if (a46Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            a46Var = null;
        }
        recyclerView.setAdapter(a46Var);
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        g8 g8VarX = g8.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(g8VarX, "inflate(...)");
        h2(g8VarX);
        setContentView(O1().m());
        l2(new wa3(this));
        n2(new wl5(this));
        k2();
        W1();
        ta3.a.f0(this, O1());
        O1().I.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClSots.Y1(this.a, view);
            }
        });
        O1().E.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClSots.Z1(this.a, view);
            }
        });
    }

    public final void setCustom_view(View view) {
        this.custom_view = view;
    }
}
