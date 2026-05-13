package com.nic.mparivahan.dlservices.newlearner;

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
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.LlSlotDet;
import com.nic.mparivahan.dlservices.newlearner.LLSlots;
import com.nic.mparivahan.dlservices.ui.slots.calendar.ExpandableHeightGridView;
import com.zepto.b46;
import com.zepto.ds1;
import com.zepto.mf4;
import com.zepto.ms3;
import com.zepto.o40;
import com.zepto.pa;
import com.zepto.rl3;
import com.zepto.tx3;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u0002B\t¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\n\u001a\u00020\tH\u0003J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u001a\u0010\u0013\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0003J(\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0002J\u0012\u0010\u0018\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J\u001c\u0010\u001b\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011H\u0002J\u0012\u0010 \u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0014J\u0014\u0010!\u001a\u0004\u0018\u00010\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011H\u0007J\u0006\u0010\"\u001a\u00020\u0003J&\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010#\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010\u00112\b\u0010%\u001a\u0004\u0018\u00010\u0011H\u0007J \u0010(\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u000e\u0010)\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019J\u0016\u0010+\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u0011J:\u0010/\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010\u00112\u0006\u0010-\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020\rR\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR$\u0010K\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010S\u001a\u0004\u0018\u00010L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010Z\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001c\u0010^\u001a\b\u0012\u0004\u0012\u00020[0\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010]R$\u0010d\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010U\u001a\u0004\bb\u0010W\"\u0004\bc\u0010YR$\u0010h\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010U\u001a\u0004\bf\u0010W\"\u0004\bg\u0010YR\"\u0010l\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010U\u001a\u0004\bj\u0010W\"\u0004\bk\u0010YR$\u0010p\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010U\u001a\u0004\bn\u0010W\"\u0004\bo\u0010YR$\u0010t\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010U\u001a\u0004\br\u0010W\"\u0004\bs\u0010YR\"\u0010x\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010U\u001a\u0004\bv\u0010W\"\u0004\bw\u0010YR\u0016\u0010z\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010UR%\u0010\u0082\u0001\u001a\u00020{8\u0006@\u0006X\u0086.¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R*\u0010\u008a\u0001\u001a\u00030\u0083\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R!\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\u000f\n\u0005\b\u008b\u0001\u0010]\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001¨\u0006\u0091\u0001"}, d2 = {"Lcom/nic/mparivahan/dlservices/newlearner/LLSlots;", "Lcom/zepto/o40;", "Lcom/zepto/rl3$a;", "", "h2", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/dlservices/data/model/LlSlotDet;", "mSlotsEvents", "c2", "Ljava/util/Calendar;", "tapedDay", "l2", "P1", "", "pos", "Landroid/content/Intent;", "V1", "", "message", "X1", "mDate", "slot_nu", "forNextMoth", "Z1", "a2", "Landroid/content/Context;", "context", "b2", "fdate", "L1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "N1", "f2", "dateToFormat", "inputFormat", "outputFormat", "Ljava/util/Date;", "M1", "i", "J1", "rtoCd", "K1", "rto_code", "mContext", "app_number", "d2", "Lcom/zepto/pa;", "F", "Lcom/zepto/pa;", "O1", "()Lcom/zepto/pa;", "e2", "(Lcom/zepto/pa;)V", "cBinding", "Lcom/zepto/ds1;", "G", "Lcom/zepto/ds1;", "viewModel", "Lcom/zepto/rl3;", "H", "Lcom/zepto/rl3;", "adapter", "Landroid/app/ProgressDialog;", "I", "Landroid/app/ProgressDialog;", "pDialog", "Landroid/widget/LinearLayout;", "J", "Landroid/widget/LinearLayout;", "getLayoutCalender", "()Landroid/widget/LinearLayout;", "setLayoutCalender", "(Landroid/widget/LinearLayout;)V", "layoutCalender", "Landroid/view/View;", "K", "Landroid/view/View;", "getCustom_view", "()Landroid/view/View;", "setCustom_view", "(Landroid/view/View;)V", "custom_view", "L", "Ljava/lang/String;", "R1", "()Ljava/lang/String;", "setLastEndorseRTOCode", "(Ljava/lang/String;)V", "lastEndorseRTOCode", "Lcom/zepto/b46;", "M", "Ljava/util/ArrayList;", "mEvents", "N", "arraylistslot", "O", "S1", "setMApplNo", "mApplNo", "P", "getMApplDob", "setMApplDob", "mApplDob", "Q", "T1", "j2", "rtoCdNew", "R", "getDob", "setDob", "dob", "S", "getMobile_no", "setMobile_no", "Mobile_no", "T", "getLastEndorseRto", "setLastEndorseRto", "lastEndorseRto", "U", "aadharPhoto", "Lcom/zepto/wa3;", "V", "Lcom/zepto/wa3;", "Q1", "()Lcom/zepto/wa3;", "i2", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/wl5;", "W", "Lcom/zepto/wl5;", "U1", "()Lcom/zepto/wl5;", "k2", "(Lcom/zepto/wl5;)V", "sarthiSession", "X", "getItems", "()Ljava/util/ArrayList;", "items", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLLSlots.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLSlots.kt\ncom/nic/mparivahan/dlservices/newlearner/LLSlots\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,632:1\n1855#2:633\n1856#2:635\n1855#2,2:636\n1#3:634\n*S KotlinDebug\n*F\n+ 1 LLSlots.kt\ncom/nic/mparivahan/dlservices/newlearner/LLSlots\n*L\n297#1:633\n297#1:635\n383#1:636,2\n*E\n"})
public final class LLSlots extends o40 implements rl3.a {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public pa cBinding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ds1 viewModel;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public rl3 adapter;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public LinearLayout layoutCalender;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public View custom_view;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String mApplNo;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String mApplDob;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String rtoCdNew;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String lastEndorseRTOCode = "";

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ArrayList mEvents = new ArrayList();

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public final ArrayList arraylistslot = new ArrayList();

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String dob = "";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String Mobile_no = "";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String lastEndorseRto = "";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String aadharPhoto = "";

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
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
            if (!StringsKt__StringsJVMKt.equals(it, "yes", true) || (lastEndorseRTOCode = LLSlots.this.getLastEndorseRTOCode()) == null) {
                return;
            }
            LLSlots lLSlots = LLSlots.this;
            lLSlots.d2(lastEndorseRTOCode, lLSlots, this.e, this.f, lLSlots.getMApplNo(), this.g);
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
            LLSlots.this.finish();
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
        public final /* synthetic */ LLSlots e;
        public final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ProgressDialog progressDialog, LLSlots lLSlots, int i) {
            super(1);
            this.c = progressDialog;
            this.e = lLSlots;
            this.f = i;
        }

        public final void a(JSONObject jSONObject) {
            try {
                this.c.dismiss();
                Log.d("save_slot", jSONObject.toString());
                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                if (StringsKt__StringsJVMKt.equals(jSONObject2.getString("status_code"), "00", true)) {
                    LLSlots lLSlots = this.e;
                    lLSlots.X1(lLSlots.Q1().b("label_dl_Service_instered", this.e.getString(R.string.dl_ll)), this.f);
                } else {
                    this.e.a2(jSONObject2.getString("status_desc"));
                }
            } catch (Exception unused) {
                LLSlots lLSlots2 = this.e;
                lLSlots2.a2(lLSlots2.Q1().b("service_is_not_present", this.e.getString(R.string.unable_to_get_details)));
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
            public final /* synthetic */ LLSlots c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LLSlots lLSlots) {
                super(1);
                this.c = lLSlots;
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
                        LLSlots lLSlots = this.c;
                        lLSlots.b2(lLSlots, jSONObject2.getString("status_desc"));
                        return;
                    }
                    JSONArray jSONArray = jSONObject2.getJSONArray("Slot_Details");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                        if (jSONObject3.getInt("avalableSeats") > 0) {
                            LlSlotDet llSlotDet = new LlSlotDet();
                            String string = jSONObject3.getString("quotadt");
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            String strL1 = this.c.L1(StringsKt__StringsJVMKt.replace$default(string, "IST", "", false, 4, (Object) null));
                            Intrinsics.checkNotNull(strL1);
                            llSlotDet.setQuotadt(strL1);
                            String string2 = jSONObject3.getString("timeForDisp");
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            llSlotDet.setTimeForDisp(string2);
                            llSlotDet.setAvalableSeats(jSONObject3.getInt("avalableSeats"));
                            llSlotDet.setSlotNo(jSONObject3.getInt("slotNo"));
                            String string3 = jSONObject3.getString("rtoCode");
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            llSlotDet.setRtoCode(string3);
                            this.c.arraylistslot.add(llSlotDet);
                        }
                    }
                    LLSlots lLSlots2 = this.c;
                    lLSlots2.c2(lLSlots2.arraylistslot);
                } catch (Exception unused) {
                    LLSlots lLSlots3 = this.c;
                    lLSlots3.a2(lLSlots3.Q1().b("service_is_not_present", this.c.getString(R.string.unable_to_get_details)));
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
                ProgressDialog progressDialog = LLSlots.this.pDialog;
                if (progressDialog == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pDialog");
                    progressDialog = null;
                }
                progressDialog.dismiss();
                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                if (!Intrinsics.areEqual(jSONObject2.getString("status_code"), "00")) {
                    try {
                        LLSlots.this.a2(jSONObject2.getString("status_desc"));
                        return;
                    } catch (Exception unused) {
                        LLSlots lLSlots = LLSlots.this;
                        lLSlots.a2(lLSlots.Q1().b("service_is_not_present", LLSlots.this.getString(R.string.unable_to_get_details)));
                        return;
                    }
                }
                JSONArray jSONArray = jSONObject2.getJSONArray("Applcnt_Details");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    String string = jSONObject3.getString("rtoCd");
                    if (string != null && string.length() != 0) {
                        LLSlots lLSlots2 = LLSlots.this;
                        String string2 = jSONObject3.getString("rtoCd");
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        lLSlots2.j2(string2);
                        LLSlots lLSlots3 = LLSlots.this;
                        lLSlots3.K1(lLSlots3, lLSlots3.T1());
                        ds1 ds1Var = LLSlots.this.viewModel;
                        if (ds1Var == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            ds1Var = null;
                        }
                        ms3 ms3VarJ = ds1Var.j();
                        LLSlots lLSlots4 = LLSlots.this;
                        ms3VarJ.g(lLSlots4, new d(new a(lLSlots4)));
                    }
                }
            } catch (Exception unused2) {
                LLSlots lLSlots5 = LLSlots.this;
                lLSlots5.a2(lLSlots5.Q1().b("service_is_not_present", LLSlots.this.getString(R.string.unable_to_get_details)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((JSONObject) obj);
            return Unit.INSTANCE;
        }
    }

    private final ArrayList P1(Calendar tapedDay) {
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
        for (LlSlotDet llSlotDet : this.arraylistslot) {
            if (StringsKt__StringsJVMKt.equals(llSlotDet.getQuotadt(), str2, true)) {
                arrayList.add(llSlotDet);
            }
        }
        return arrayList;
    }

    private final Intent V1(int pos) {
        Intent intent = new Intent(this, (Class<?>) LLSlotsAcknowActivity.class);
        intent.putExtra("dl_st_appl_ackno_no", this.mApplNo);
        intent.putExtra("dl_st_appl_ackno_no_dob", this.mApplDob);
        intent.putExtra("slot-date", ((LlSlotDet) this.items.get(pos)).getQuotadt());
        intent.putExtra("slot-time", ((LlSlotDet) this.items.get(pos)).getTimeForDisp());
        intent.putExtra("dob", this.dob);
        intent.putExtra("Mobile_no", this.Mobile_no);
        intent.putExtra("lastEndorsedRTO", this.lastEndorseRto);
        intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRTOCode);
        intent.putExtra("aadharPhoto", this.aadharPhoto);
        return intent;
    }

    public static final void W1(LLSlots this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X1(String message, final int pos) {
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
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.w93
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLSlots.Y1(this.a, pos, dialog, view);
            }
        });
        dialog.show();
    }

    public static final void Y1(LLSlots this$0, int i, Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(d2, "$d");
        try {
            this$0.startActivity(this$0.V1(i));
            d2.dismiss();
            this$0.finish();
        } catch (Exception unused) {
        }
    }

    private final void Z1(String message, String mDate, int slot_nu, int forNextMoth) {
        String strB = Q1().b("nex_parivahan", getString(R.string.app_name));
        Intrinsics.checkNotNull(strB);
        o40.q1(this, strB, message, 0, null, null, new a(mDate, slot_nu, forNextMoth), 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a2(String message) {
        if (message != null) {
            String strB = Q1().b("nex_parivahan", getString(R.string.app_name));
            Intrinsics.checkNotNull(strB);
            String strB2 = Q1().b("btn_ok", getString(R.string.ok_txt));
            Intrinsics.checkNotNull(strB2);
            o40.q1(this, strB, message, 1, strB2, null, b.c, 16, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b2(Context context, String message) {
        if (message != null) {
            String strB = Q1().b("nex_parivahan", getString(R.string.app_name));
            Intrinsics.checkNotNull(strB);
            String strB2 = Q1().b("btn_ok", getString(R.string.ok_txt));
            Intrinsics.checkNotNull(strB2);
            o40.q1(this, strB, message, 1, strB2, null, new c(), 16, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c2(ArrayList mSlotsEvents) {
        Log.d("size", String.valueOf(mSlotsEvents.size()));
        this.mEvents.clear();
        Iterator it = mSlotsEvents.iterator();
        while (it.hasNext()) {
            LlSlotDet llSlotDet = (LlSlotDet) it.next();
            Date dateM1 = M1(llSlotDet.getQuotadt(), "dd-MM-yyyy", "yyyy/MM/dd");
            b46 b46Var = null;
            if (llSlotDet.getAvalableSeats() > 0) {
                if (dateM1 != null) {
                    Drawable drawable = getResources().getDrawable(R.drawable.dl_slots_green);
                    Intrinsics.checkNotNullExpressionValue(drawable, "getDrawable(...)");
                    b46Var = new b46(dateM1, drawable);
                }
                if (b46Var != null) {
                    this.mEvents.add(b46Var);
                }
            } else {
                if (dateM1 != null) {
                    Drawable drawable2 = getResources().getDrawable(R.drawable.dl_slots_red);
                    Intrinsics.checkNotNullExpressionValue(drawable2, "getDrawable(...)");
                    b46Var = new b46(dateM1, drawable2);
                }
                if (b46Var != null) {
                    this.mEvents.add(b46Var);
                }
            }
        }
        Log.d("size", String.valueOf(this.mEvents.size()));
        f2();
    }

    public static final void g2(LLSlots this$0, AdapterView adapterView, View view, int i, long j) {
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
                this$0.l2(calendar2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private final void h2() {
        this.custom_view = findViewById(R.id.custom_view);
        View viewFindViewById = findViewById(R.id.layoutCalender);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
        this.layoutCalender = (LinearLayout) viewFindViewById;
        O1().L.setLayoutManager(new LinearLayoutManager(this));
        this.viewModel = (ds1) new z(this).a(ds1.class);
        O1().v(this);
        if (getIntent() != null) {
            new wl5(this);
            try {
                if (getIntent() != null) {
                    this.mApplNo = String.valueOf(getIntent().getStringExtra("dl_st_appl_ackno_no"));
                    this.mApplDob = N1(String.valueOf(getIntent().getStringExtra("dl_st_appl_ackno_no_dob")));
                    this.lastEndorseRTOCode = String.valueOf(getIntent().getStringExtra("lastEndorseRTOCode"));
                    this.dob = String.valueOf(getIntent().getStringExtra("dob"));
                    this.Mobile_no = String.valueOf(getIntent().getStringExtra("Mobile_no"));
                    String stringExtra = getIntent().getStringExtra("lastEndorsedRTO");
                    Intrinsics.checkNotNull(stringExtra, "null cannot be cast to non-null type kotlin.String");
                    this.lastEndorseRto = stringExtra;
                    String stringExtra2 = getIntent().getStringExtra("aadharPhoto");
                    Intrinsics.checkNotNull(stringExtra2);
                    this.aadharPhoto = stringExtra2;
                }
                if (!com.nic.mparivahan.a.a.a(this)) {
                    Toast.makeText(getApplicationContext(), Q1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
                    return;
                }
                J1(this);
                ds1 ds1Var = this.viewModel;
                if (ds1Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    ds1Var = null;
                }
                ds1Var.i().g(this, new d(new f()));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private final void l2(Calendar tapedDay) {
        this.items.clear();
        this.items.addAll(P1(tapedDay));
        this.adapter = new rl3(this, this.items, this);
        RecyclerView recyclerView = O1().L;
        rl3 rl3Var = this.adapter;
        if (rl3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            rl3Var = null;
        }
        recyclerView.setAdapter(rl3Var);
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
            ds1Var.n(str2, str);
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
            String string = StringsKt__StringsKt.trim((CharSequence) rtoCd).toString();
            tx3.a aVar = tx3.a;
            ds1Var.o(string, aVar.c(), aVar.b());
        } catch (Exception e2) {
            e2.printStackTrace();
            Log.d("checkAppSlots", e2.getLocalizedMessage());
        }
    }

    public final String L1(String fdate) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E MMM dd HH:mm:ss  yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date date = simpleDateFormat.parse(fdate);
            Intrinsics.checkNotNullExpressionValue(date, "parse(...)");
            return simpleDateFormat2.format(date);
        } catch (ParseException unused) {
            return null;
        }
    }

    public final Date M1(String dateToFormat, String inputFormat, String outputFormat) {
        Intrinsics.checkNotNullParameter(dateToFormat, "dateToFormat");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(outputFormat);
            Date date = new SimpleDateFormat(inputFormat).parse(dateToFormat);
            Intrinsics.checkNotNull(date);
            return simpleDateFormat.parse(simpleDateFormat2.format(date));
        } catch (ParseException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final String N1(String fdate) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Intrinsics.checkNotNull(fdate);
            Date date = simpleDateFormat.parse(fdate);
            Intrinsics.checkNotNull(date);
            return simpleDateFormat2.format(date);
        } catch (ParseException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final pa O1() {
        pa paVar = this.cBinding;
        if (paVar != null) {
            return paVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cBinding");
        return null;
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

    public final void d2(String rto_code, Context mContext, String mDate, int slot_nu, String app_number, int forNextMoth) {
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
            String string = StringsKt__StringsKt.trim((CharSequence) T1().toString()).toString();
            Intrinsics.checkNotNull(app_number);
            ds1Var.q(string, app_number, mDate, "" + slot_nu, "0", "0");
            ds1 ds1Var4 = this.viewModel;
            if (ds1Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                ds1Var3 = ds1Var4;
            }
            ds1Var3.l().g(this, new d(new e(progressDialog, this, forNextMoth)));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void e2(pa paVar) {
        Intrinsics.checkNotNullParameter(paVar, "<set-?>");
        this.cBinding = paVar;
    }

    public final void f2() {
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
        calendarGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.zepto.v93
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                LLSlots.g2(this.a, adapterView, view2, i, j);
            }
        });
    }

    @Override // com.zepto.rl3.a
    public void i(int pos, String mDate, int slot_nu) {
        Intrinsics.checkNotNullParameter(mDate, "mDate");
        if (!com.nic.mparivahan.a.a.a(this)) {
            Toast.makeText(getApplicationContext(), Q1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        if (((LlSlotDet) this.items.get(pos)).getAvalableSeats() <= 0) {
            if (((LlSlotDet) this.items.get(pos)).getAvalableSeats() == 0) {
                w1(Q1().b("label_slots_not_avl", ""), O1().m());
                return;
            }
            return;
        }
        String strB = Q1().b("label_sure_to_book_slot" + slot_nu + " on " + slot_nu, "Are you sure to book Slot");
        Intrinsics.checkNotNull(strB);
        Z1(strB, mDate, slot_nu, pos);
    }

    public final void i2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void j2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoCdNew = str;
    }

    public final void k2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dl_slots);
        pa paVarX = pa.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(paVarX, "inflate(...)");
        e2(paVarX);
        setContentView(O1().m());
        i2(new wa3(this));
        k2(new wl5(this));
        O1().E.g.setText(U1().k());
        h2();
        O1().E.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.u93
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LLSlots.W1(this.a, view);
            }
        });
    }

    public final void setCustom_view(View view) {
        this.custom_view = view;
    }
}
