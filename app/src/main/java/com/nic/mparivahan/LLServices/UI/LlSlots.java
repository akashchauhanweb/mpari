package com.nic.mparivahan.LLServices.UI;

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
import com.nic.mparivahan.LLMainScreen.LlDetails;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.LLServices.UI.LlSlots;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.SlotDet;
import com.nic.mparivahan.dlservices.ui.slots.calendar.ExpandableHeightGridView;
import com.zepto.a46;
import com.zepto.b46;
import com.zepto.ds1;
import com.zepto.mf4;
import com.zepto.ms3;
import com.zepto.o40;
import com.zepto.pc;
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
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002B\t¢\u0006\u0006\b¢\u0001\u0010£\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J \u0010\n\u001a\u00020\u00032\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0002J \u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u001a\u0010\u0015\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J(\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J\u0012\u0010\u001a\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002J\u001c\u0010\u001d\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002J\u0012\u0010 \u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0014J\u0014\u0010\"\u001a\u0004\u0018\u00010\u00132\b\u0010!\u001a\u0004\u0018\u00010\u0013H\u0007J\u0006\u0010#\u001a\u00020\u0003J$\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010$\u001a\u00020\u00132\b\u0010%\u001a\u0004\u0018\u00010\u00132\b\u0010&\u001a\u0004\u0018\u00010\u0013J \u0010)\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u000e\u0010*\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001bJ\u0016\u0010,\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u0013J:\u00100\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010\u00132\u0006\u0010.\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u000f2\b\u0010/\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0018\u001a\u00020\u000fR\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010CR$\u0010L\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010T\u001a\u0004\u0018\u00010M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010[\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR2\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\\0\u0006j\b\u0012\u0004\u0012\u00020\\`\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR2\u0010g\u001a\u0012\u0012\u0004\u0012\u00020c0\u0006j\b\u0012\u0004\u0012\u00020c`\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010^\u001a\u0004\be\u0010`\"\u0004\bf\u0010bR\u001d\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\bh\u0010^\u001a\u0004\bi\u0010`R$\u0010n\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010V\u001a\u0004\bl\u0010X\"\u0004\bm\u0010ZR$\u0010r\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010V\u001a\u0004\bp\u0010X\"\u0004\bq\u0010ZR\"\u0010v\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010V\u001a\u0004\bt\u0010X\"\u0004\bu\u0010ZR$\u0010z\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010V\u001a\u0004\bx\u0010X\"\u0004\by\u0010ZR$\u0010~\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b{\u0010V\u001a\u0004\b|\u0010X\"\u0004\b}\u0010ZR'\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u007f\u0010V\u001a\u0005\b\u0080\u0001\u0010X\"\u0005\b\u0081\u0001\u0010ZR&\u0010\u0086\u0001\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010V\u001a\u0005\b\u0084\u0001\u0010X\"\u0005\b\u0085\u0001\u0010ZR*\u0010\u008e\u0001\u001a\u00030\u0087\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R*\u0010\u0096\u0001\u001a\u00030\u008f\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R*\u0010\u009e\u0001\u001a\u00030\u0097\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R*\u0010¡\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b8\u0006¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010^\u001a\u0005\b \u0001\u0010`¨\u0006¤\u0001"}, d2 = {"Lcom/nic/mparivahan/LLServices/UI/LlSlots;", "Lcom/zepto/o40;", "Lcom/zepto/a46$a;", "", "W1", "j2", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/dlservices/data/model/SlotDet;", "Lkotlin/collections/ArrayList;", "mSlotsEvents", "e2", "Ljava/util/Calendar;", "tapedDay", "o2", "O1", "", "pos", "Landroid/content/Intent;", "V1", "", "message", "Z1", "mDate", "slot_nu", "forNextMoth", "b2", "c2", "Landroid/content/Context;", "context", "d2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "fdate", "L1", "h2", "dateToFormat", "inputFormat", "outputFormat", "Ljava/util/Date;", "K1", "i", "I1", "rtoCd", "J1", "rto_code", "mContext", "app_number", "f2", "Lcom/zepto/pc;", "F", "Lcom/zepto/pc;", "N1", "()Lcom/zepto/pc;", "g2", "(Lcom/zepto/pc;)V", "cBinding", "Lcom/zepto/ds1;", "G", "Lcom/zepto/ds1;", "viewModel", "Lcom/zepto/a46;", "H", "Lcom/zepto/a46;", "adapter", "Landroid/app/ProgressDialog;", "I", "Landroid/app/ProgressDialog;", "pDialog", "Landroid/widget/LinearLayout;", "J", "Landroid/widget/LinearLayout;", "getLayoutCalender", "()Landroid/widget/LinearLayout;", "setLayoutCalender", "(Landroid/widget/LinearLayout;)V", "layoutCalender", "Landroid/view/View;", "K", "Landroid/view/View;", "getCustom_view", "()Landroid/view/View;", "setCustom_view", "(Landroid/view/View;)V", "custom_view", "L", "Ljava/lang/String;", "Q1", "()Ljava/lang/String;", "setLastEndorseRTOCode", "(Ljava/lang/String;)V", "lastEndorseRTOCode", "Lcom/nic/mparivahan/dlservices/ui/slots/calendar/SlotDetailsItem;", "M", "Ljava/util/ArrayList;", "getMSlotsEvents", "()Ljava/util/ArrayList;", "setMSlotsEvents", "(Ljava/util/ArrayList;)V", "Lcom/zepto/b46;", "N", "getMEvents", "setMEvents", "mEvents", "O", "M1", "arraylistslot", "P", "S1", "setMApplNo", "mApplNo", "Q", "getMApplDob", "setMApplDob", "mApplDob", "R", "T1", "m2", "rtoCdNew", "S", "getDlNo", "setDlNo", "dlNo", "T", "getDob", "setDob", "dob", "U", "getMobile_no", "setMobile_no", "Mobile_no", "V", "getLastEndorseRto", "setLastEndorseRto", "lastEndorseRto", "Lcom/zepto/wa3;", "W", "Lcom/zepto/wa3;", "P1", "()Lcom/zepto/wa3;", "k2", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/wl5;", "X", "Lcom/zepto/wl5;", "U1", "()Lcom/zepto/wl5;", "n2", "(Lcom/zepto/wl5;)V", "sarathiSession", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "Y", "Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "R1", "()Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;", "l2", "(Lcom/nic/mparivahan/LLMainScreen/UpdatedFetchDetails/FetchLlDetails;)V", "llDetails", "Z", "getItems", "items", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLlSlots.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LlSlots.kt\ncom/nic/mparivahan/LLServices/UI/LlSlots\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,604:1\n1855#2:605\n1856#2:607\n1855#2,2:608\n1#3:606\n*S KotlinDebug\n*F\n+ 1 LlSlots.kt\ncom/nic/mparivahan/LLServices/UI/LlSlots\n*L\n333#1:605\n333#1:607\n417#1:608,2\n*E\n"})
public final class LlSlots extends o40 implements a46.a {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public pc cBinding;

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

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public wl5 sarathiSession;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public FetchLlDetails llDetails;

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

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
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
            if (!StringsKt__StringsJVMKt.equals(it, "yes", true) || (lastEndorseRTOCode = LlSlots.this.getLastEndorseRTOCode()) == null) {
                return;
            }
            LlSlots llSlots = LlSlots.this;
            llSlots.f2(lastEndorseRTOCode, llSlots, this.e, this.f, llSlots.getMApplNo(), this.g);
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
            LlSlots.this.finish();
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
        public final /* synthetic */ LlSlots e;
        public final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ProgressDialog progressDialog, LlSlots llSlots, int i) {
            super(1);
            this.c = progressDialog;
            this.e = llSlots;
            this.f = i;
        }

        public final void a(JSONObject jSONObject) {
            try {
                this.c.dismiss();
                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                if (StringsKt__StringsJVMKt.equals(jSONObject2.getString("status_code"), "00", true)) {
                    LlSlots llSlots = this.e;
                    llSlots.Z1(llSlots.P1().b("label_dl_Service_instered", this.e.getString(R.string.dl_ll)), this.f);
                } else {
                    this.e.c2(jSONObject2.getString("status_desc"));
                }
            } catch (Exception unused) {
                LlSlots llSlots2 = this.e;
                llSlots2.c2(llSlots2.P1().b("service_is_not_present", this.e.getString(R.string.unable_to_get_details)));
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
            public final /* synthetic */ LlSlots c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LlSlots llSlots) {
                super(1);
                this.c = llSlots;
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
                        LlSlots llSlots = this.c;
                        llSlots.d2(llSlots, jSONObject2.getString("status_desc"));
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
                    LlSlots llSlots2 = this.c;
                    llSlots2.e2(llSlots2.getArraylistslot());
                } catch (Exception unused) {
                    LlSlots llSlots3 = this.c;
                    llSlots3.c2(llSlots3.P1().b("service_is_not_present", this.c.getString(R.string.unable_to_get_details)));
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
                ProgressDialog progressDialog = LlSlots.this.pDialog;
                if (progressDialog == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                    progressDialog = null;
                }
                progressDialog.dismiss();
                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                if (!Intrinsics.areEqual(jSONObject2.getString("status_code"), "00")) {
                    try {
                        LlSlots.this.c2(jSONObject2.getString("status_desc"));
                        return;
                    } catch (Exception unused) {
                        LlSlots llSlots = LlSlots.this;
                        llSlots.c2(llSlots.P1().b("service_is_not_present", LlSlots.this.getString(R.string.unable_to_get_details)));
                        return;
                    }
                }
                JSONArray jSONArray = jSONObject2.getJSONArray("Applcnt_Details");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    String string = jSONObject3.getString("rtoCd");
                    if (string != null && string.length() != 0) {
                        LlSlots llSlots2 = LlSlots.this;
                        String string2 = jSONObject3.getString("rtoCd");
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        llSlots2.m2(string2);
                        LlSlots llSlots3 = LlSlots.this;
                        llSlots3.J1(llSlots3, llSlots3.T1());
                        ds1 ds1Var = LlSlots.this.viewModel;
                        if (ds1Var == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            ds1Var = null;
                        }
                        ms3 ms3VarK = ds1Var.k();
                        LlSlots llSlots4 = LlSlots.this;
                        ms3VarK.g(llSlots4, new d(new a(llSlots4)));
                    }
                }
            } catch (Exception unused2) {
                LlSlots llSlots5 = LlSlots.this;
                llSlots5.c2(llSlots5.P1().b("service_is_not_present", LlSlots.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((JSONObject) obj);
            return Unit.INSTANCE;
        }
    }

    private final ArrayList O1(Calendar tapedDay) {
        String str = new SimpleDateFormat("yyyy-MM-dd").format(Long.valueOf(Calendar.getInstance().getTimeInMillis()));
        String str2 = new SimpleDateFormat("dd-MM-yyyy").format(Long.valueOf(tapedDay.getTimeInMillis()));
        String str3 = new SimpleDateFormat("EEE, MMM d").format(Long.valueOf(tapedDay.getTimeInMillis()));
        String str4 = new SimpleDateFormat("EEEE").format(Long.valueOf(tapedDay.getTimeInMillis()));
        N1().B.setText(str3);
        if (str.equals(str2)) {
            N1().C.setText("Today");
        } else {
            N1().C.setText(str4);
        }
        ArrayList arrayList = new ArrayList();
        for (SlotDet slotDet : this.arraylistslot) {
            if (StringsKt__StringsJVMKt.equals(slotDet.getQuotadt(), str2, true) && slotDet.getQaflag()) {
                arrayList.add(slotDet);
            }
        }
        return arrayList;
    }

    private final Intent V1(int pos) {
        Intent intent = new Intent(this, (Class<?>) LlStoltsAck.class);
        intent.putExtra("dl_st_appl_ackno_no", this.mApplNo);
        intent.putExtra("dl_st_appl_ackno_no_dob", this.mApplDob);
        intent.putExtra("slot-date", ((SlotDet) this.items.get(pos)).getQuotadt());
        intent.putExtra("slot-time", ((SlotDet) this.items.get(pos)).getTimeForDisp());
        return intent;
    }

    private final void W1() {
        N1().I.g.setText(U1().k());
        N1().I.h.setPaintFlags(N1().I.h.getPaintFlags() | 8);
        TextView textView = N1().I.h;
        String str = this.dlNo;
        Intrinsics.checkNotNull(str);
        textView.setText(StringsKt__StringsKt.trim((CharSequence) str).toString());
        N1().I.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ol3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlSlots.X1(this.a, view);
            }
        });
    }

    public static final void X1(LlSlots this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) LlDetails.class);
            intent.putExtra("LLDetails", this$0.R1());
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final void Y1(LlSlots this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z1(String message, final int pos) {
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
        ((TextView) viewFindViewById3).setText(P1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(P1().b("btn_dl_serv_next", "Next"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pl3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlSlots.a2(this.a, pos, dialog, view);
            }
        });
        dialog.show();
    }

    public static final void a2(LlSlots this$0, int i, Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d2, "$d");
        this$0.startActivity(this$0.V1(i));
        d2.dismiss();
        this$0.finish();
    }

    private final void b2(String message, String mDate, int slot_nu, int forNextMoth) {
        String strB = P1().b("nex_parivahan", getString(R.string.app_name));
        Intrinsics.checkNotNull(strB);
        o40.q1(this, strB, message, 0, null, null, new a(mDate, slot_nu, forNextMoth), 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c2(String message) {
        if (message != null) {
            String strB = P1().b("nex_parivahan", getString(R.string.app_name));
            Intrinsics.checkNotNull(strB);
            String strB2 = P1().b("btn_ok", getString(R.string.ok_txt));
            Intrinsics.checkNotNull(strB2);
            o40.q1(this, strB, message, 1, strB2, null, b.c, 16, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d2(Context context, String message) {
        if (message != null) {
            String strB = P1().b("nex_parivahan", getString(R.string.app_name));
            Intrinsics.checkNotNull(strB);
            String strB2 = P1().b("btn_ok", getString(R.string.ok_txt));
            Intrinsics.checkNotNull(strB2);
            o40.q1(this, strB, message, 1, strB2, null, new c(), 16, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e2(ArrayList mSlotsEvents) {
        b46 b46Var;
        b46 b46Var2;
        Log.d("size", String.valueOf(mSlotsEvents.size()));
        this.mEvents.clear();
        Iterator it = mSlotsEvents.iterator();
        while (it.hasNext()) {
            SlotDet slotDet = (SlotDet) it.next();
            Date dateK1 = K1(slotDet.getQuotadt(), "dd-MM-yyyy", "yyyy/MM/dd");
            b46 b46Var3 = null;
            if (slotDet.getQaflag() && slotDet.getAvalableSeats() > 0) {
                if (dateK1 != null) {
                    Drawable drawable = getResources().getDrawable(R.drawable.dl_slots_green);
                    Intrinsics.checkNotNullExpressionValue(drawable, "getDrawable(...)");
                    b46Var2 = new b46(dateK1, drawable);
                } else {
                    b46Var2 = null;
                }
                if (b46Var2 != null) {
                    this.mEvents.add(b46Var2);
                }
            } else if (slotDet.getQcflag()) {
                if (dateK1 != null) {
                    Drawable drawable2 = getResources().getDrawable(R.drawable.dl_slots_red);
                    Intrinsics.checkNotNullExpressionValue(drawable2, "getDrawable(...)");
                    b46Var = new b46(dateK1, drawable2);
                } else {
                    b46Var = null;
                }
                if (b46Var != null) {
                    this.mEvents.add(b46Var);
                }
            }
            if (slotDet.getHflag()) {
                if (dateK1 != null) {
                    Drawable drawable3 = getResources().getDrawable(R.drawable.dl_slots_blue);
                    Intrinsics.checkNotNullExpressionValue(drawable3, "getDrawable(...)");
                    b46Var3 = new b46(dateK1, drawable3);
                }
                if (b46Var3 != null) {
                    this.mEvents.add(b46Var3);
                }
            }
        }
        Log.d("size", String.valueOf(this.mEvents.size()));
        h2();
    }

    public static final void i2(LlSlots this$0, AdapterView adapterView, View view, int i, long j) {
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
                this$0.w1(this$0.P1().b("previous_date", this$0.getString(R.string.prev_date)), this$0.N1().m());
            }
            try {
                Intrinsics.checkNotNull(calendar2);
                this$0.o2(calendar2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private final void j2() {
        this.custom_view = findViewById(R.id.custom_view);
        View viewFindViewById = findViewById(R.id.layoutCalender);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
        this.layoutCalender = (LinearLayout) viewFindViewById;
        N1().M.setLayoutManager(new LinearLayoutManager(this));
        this.viewModel = (ds1) new z(this).a(ds1.class);
        N1().v(this);
        if (getIntent() != null) {
            try {
                ds1 ds1Var = null;
                if (getIntent() != null) {
                    this.mApplNo = String.valueOf(getIntent().getStringExtra("dl_st_appl_ackno_no"));
                    this.mApplDob = L1(String.valueOf(getIntent().getStringExtra("dl_st_appl_ackno_no_dob")));
                    Bundle extras = getIntent().getExtras();
                    this.lastEndorseRTOCode = String.valueOf(extras != null ? extras.get("lastEndorseRTOCode") : null);
                    this.dlNo = String.valueOf(getIntent().getStringExtra("DL"));
                    this.dob = String.valueOf(getIntent().getStringExtra("dob"));
                    this.Mobile_no = String.valueOf(getIntent().getStringExtra("Mobile_no"));
                    String stringExtra = getIntent().getStringExtra("lastEndorsedRTO");
                    Intrinsics.checkNotNull(stringExtra, "null cannot be cast to non-null type kotlin.String");
                    this.lastEndorseRto = stringExtra;
                    Serializable serializableExtra = getIntent().getSerializableExtra("LLDetails");
                    Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails");
                    l2((FetchLlDetails) serializableExtra);
                }
                if (!com.nic.mparivahan.a.a.a(this)) {
                    Toast.makeText(getApplicationContext(), P1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
                    return;
                }
                I1(this);
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

    private final void o2(Calendar tapedDay) {
        this.items.clear();
        this.items.addAll(O1(tapedDay));
        this.adapter = new a46(this, this.items, this);
        RecyclerView recyclerView = N1().M;
        a46 a46Var = this.adapter;
        if (a46Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            a46Var = null;
        }
        recyclerView.setAdapter(a46Var);
    }

    public final void I1(Context context) {
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

    public final void J1(Context context, String rtoCd) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rtoCd, "rtoCd");
        try {
            ProgressDialog progressDialog = new ProgressDialog(context);
            this.pDialog = progressDialog;
            progressDialog.setMessage(P1().b("label_challan_please_wait", "Please wait..."));
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

    public final Date K1(String dateToFormat, String inputFormat, String outputFormat) {
        Intrinsics.checkNotNullParameter(dateToFormat, "dateToFormat");
        try {
            return new SimpleDateFormat("yyyy/MM/dd").parse(new SimpleDateFormat(outputFormat).format(new SimpleDateFormat(inputFormat).parse(dateToFormat)));
        } catch (ParseException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final String L1(String fdate) {
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

    /* JADX INFO: renamed from: M1, reason: from getter */
    public final ArrayList getArraylistslot() {
        return this.arraylistslot;
    }

    public final pc N1() {
        pc pcVar = this.cBinding;
        if (pcVar != null) {
            return pcVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        return null;
    }

    public final wa3 P1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    /* JADX INFO: renamed from: Q1, reason: from getter */
    public final String getLastEndorseRTOCode() {
        return this.lastEndorseRTOCode;
    }

    public final FetchLlDetails R1() {
        FetchLlDetails fetchLlDetails = this.llDetails;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("llDetails");
        return null;
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
        wl5 wl5Var = this.sarathiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarathiSession");
        return null;
    }

    public final void f2(String rto_code, Context mContext, String mDate, int slot_nu, String app_number, int forNextMoth) {
        ds1 ds1Var;
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mDate, "mDate");
        try {
            ProgressDialog progressDialog = new ProgressDialog(mContext);
            progressDialog.setMessage(P1().b("label_challan_please_wait", "Please wait..."));
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

    public final void g2(pc pcVar) {
        Intrinsics.checkNotNullParameter(pcVar, "<set-?>");
        this.cBinding = pcVar;
    }

    public final void h2() {
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
        calendarGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.zepto.nl3
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                LlSlots.i2(this.a, adapterView, view2, i, j);
            }
        });
    }

    @Override // com.zepto.a46.a
    public void i(int pos, String mDate, int slot_nu) {
        Intrinsics.checkNotNullParameter(mDate, "mDate");
        if (!com.nic.mparivahan.a.a.a(this)) {
            Toast.makeText(getApplicationContext(), P1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        if (!((SlotDet) this.items.get(pos)).getQaflag() || ((SlotDet) this.items.get(pos)).getAvalableSeats() <= 0) {
            if (((SlotDet) this.items.get(pos)).getAvalableSeats() == 0) {
                w1(P1().b("label_slots_not_avl", ""), N1().m());
                return;
            }
            return;
        }
        String strB = P1().b("label_sure_to_book_slot" + slot_nu + " on " + slot_nu, "Are you sure to book Slot");
        Intrinsics.checkNotNull(strB);
        b2(strB, mDate, slot_nu, pos);
    }

    public final void k2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void l2(FetchLlDetails fetchLlDetails) {
        Intrinsics.checkNotNullParameter(fetchLlDetails, "<set-?>");
        this.llDetails = fetchLlDetails;
    }

    public final void m2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoCdNew = str;
    }

    public final void n2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarathiSession = wl5Var;
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pc pcVarX = pc.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(pcVarX, "inflate(...)");
        g2(pcVarX);
        setContentView(N1().m());
        k2(new wa3(this));
        n2(new wl5(this));
        ta3.a.m1(this, N1());
        j2();
        W1();
        N1().I.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ml3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LlSlots.Y1(this.a, view);
            }
        });
    }

    public final void setCustom_view(View view) {
        this.custom_view = view;
    }
}
