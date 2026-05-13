package com.nic.mparivahan.DLServicesAuth.View;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.CurrentRTO;
import com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster;
import com.nic.mparivahan.DLServicesAuth.Model.RTO.DlLastRtoDetailsDto;
import com.nic.mparivahan.DLServicesAuth.Model.RTO.Result;
import com.nic.mparivahan.DLServicesAuth.View.DlServiceListActivity;
import com.nic.mparivahan.DLServicesAuth.eKyc.AadharInterface;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewService.NewServPojo.EkycImplState;
import com.nic.mparivahan.DLServicesAuth.eKyc.NewService.NewServPojo.ServPojo;
import com.nic.mparivahan.DLServicesAuth.eKyc.Pojo.CheckByState;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Dl.Model.BioImgObjX;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.nic.mparivahan.dlservices.sarathiStateApi.SarathiStatePojo;
import com.nic.mparivahan.dlservices.sarathiStateApi.StateMaster;
import com.zepto.jl;
import com.zepto.kl;
import com.zepto.kt6;
import com.zepto.ll;
import com.zepto.lr1;
import com.zepto.mf4;
import com.zepto.nr1;
import com.zepto.o40;
import com.zepto.rq1;
import com.zepto.ta3;
import com.zepto.tq1;
import com.zepto.wa3;
import com.zepto.wl5;
import com.zepto.x31;
import com.zepto.y31;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\t¢\u0006\u0006\b¶\u0001\u0010·\u0001J4\u0010\u0007\u001a\u00020\u00062*\u0010\u0005\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002j\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\u0004H\u0002J4\u0010\b\u001a\u00020\u00062*\u0010\u0005\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002j\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\u0004H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0002J\u0012\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014J(\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010%\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010)\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\"\u0010-\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$R\"\u00101\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010 \u001a\u0004\b/\u0010\"\"\u0004\b0\u0010$R\"\u00108\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010ORF\u0010\u0005\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002j\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010Z\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010 \u001a\u0004\bX\u0010\"\"\u0004\bY\u0010$R\"\u0010^\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010 \u001a\u0004\b\\\u0010\"\"\u0004\b]\u0010$R\"\u0010b\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010 \u001a\u0004\b`\u0010\"\"\u0004\ba\u0010$R\"\u0010f\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010 \u001a\u0004\bd\u0010\"\"\u0004\be\u0010$R2\u0010p\u001a\u0012\u0012\u0004\u0012\u00020h0gj\b\u0012\u0004\u0012\u00020h`i8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR2\u0010u\u001a\u0012\u0012\u0004\u0012\u00020q0gj\b\u0012\u0004\u0012\u00020q`i8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010k\u001a\u0004\bs\u0010m\"\u0004\bt\u0010oR\"\u0010|\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R#\u0010\u0080\u0001\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b}\u0010;\u001a\u0004\b~\u0010=\"\u0004\b\u007f\u0010?R*\u0010\u0088\u0001\u001a\u00030\u0081\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R&\u0010\u008c\u0001\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010 \u001a\u0005\b\u008a\u0001\u0010\"\"\u0005\b\u008b\u0001\u0010$R*\u0010\u0094\u0001\u001a\u00030\u008d\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R*\u0010\u009c\u0001\u001a\u00030\u0095\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R*\u0010¤\u0001\u001a\u00030\u009d\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R6\u0010¨\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00030gj\b\u0012\u0004\u0012\u00020\u0003`i8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¥\u0001\u0010k\u001a\u0005\b¦\u0001\u0010m\"\u0005\b§\u0001\u0010oR&\u0010¬\u0001\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b©\u0001\u0010 \u001a\u0005\bª\u0001\u0010\"\"\u0005\b«\u0001\u0010$R8\u0010±\u0001\u001a\u0014\u0012\u0005\u0012\u00030\u00ad\u00010gj\t\u0012\u0005\u0012\u00030\u00ad\u0001`i8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b®\u0001\u0010k\u001a\u0005\b¯\u0001\u0010m\"\u0005\b°\u0001\u0010oR6\u0010µ\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00030gj\b\u0012\u0004\u0012\u00020\u0003`i8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b²\u0001\u0010k\u001a\u0005\b³\u0001\u0010m\"\u0005\b´\u0001\u0010o¨\u0006¸\u0001"}, d2 = {"Lcom/nic/mparivahan/DLServicesAuth/View/DlServiceListActivity;", "Lcom/zepto/o40;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "whatServiceRequired", "", "w2", "v2", "C2", "message", "A2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "context", "dl_number", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "dl_details", "", "vis", "x2", "Lcom/zepto/tq1;", "F", "Lcom/zepto/tq1;", "P1", "()Lcom/zepto/tq1;", "D2", "(Lcom/zepto/tq1;)V", "binding", "G", "Ljava/lang/String;", "S1", "()Ljava/lang/String;", "setDlNo", "(Ljava/lang/String;)V", "dlNo", "H", "getDob", "setDob", "dob", "I", "getLastEndorseRtoCode", "setLastEndorseRtoCode", "lastEndorseRtoCode", "J", "getLastEndorseStateCode", "setLastEndorseStateCode", "lastEndorseStateCode", "K", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "R1", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "F2", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "dlDetails", "Lcom/zepto/wl5;", "L", "Lcom/zepto/wl5;", "f2", "()Lcom/zepto/wl5;", "U2", "(Lcom/zepto/wl5;)V", "sarthiSession", "Lcom/zepto/nr1;", "M", "Lcom/zepto/nr1;", "T1", "()Lcom/zepto/nr1;", "G2", "(Lcom/zepto/nr1;)V", "dlServicesViewModel", "Landroid/widget/LinearLayout;", "N", "Landroid/widget/LinearLayout;", "X1", "()Landroid/widget/LinearLayout;", "K2", "(Landroid/widget/LinearLayout;)V", "ll_home", "O", "Ljava/util/HashMap;", "getWhatServiceRequired", "()Ljava/util/HashMap;", "setWhatServiceRequired", "(Ljava/util/HashMap;)V", "P", "g2", "V2", "state_code", "Q", "getRto_code", "R2", "rto_code", "R", "d2", "S2", "rto_name", "S", "i2", "X2", "state_name", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/dlservices/sarathiStateApi/StateMaster;", "Lkotlin/collections/ArrayList;", "T", "Ljava/util/ArrayList;", "h2", "()Ljava/util/ArrayList;", "W2", "(Ljava/util/ArrayList;)V", "state_list", "Lcom/nic/mparivahan/DLServicesAuth/Model/GetCurrentRTO/RtosMaster;", "U", "a2", "O2", "mRtosMaster", "V", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "N2", "(Landroid/content/Context;)V", "mContext", "W", "e2", "T2", "sahi_session", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "X", "Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "c2", "()Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;", "Q2", "(Lcom/nic/mparivahan/dlservices/data/network/DlServiceInt;)V", "retrofitService", "Y", "Q1", "E2", "bioRecGenesis", "Lcom/zepto/wa3;", "Z", "Lcom/zepto/wa3;", "W1", "()Lcom/zepto/wa3;", "J2", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/ll;", "a0", "Lcom/zepto/ll;", "Z1", "()Lcom/zepto/ll;", "M2", "(Lcom/zepto/ll;)V", "mAadharViewModel", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/AadharInterface;", "b0", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/AadharInterface;", "Y1", "()Lcom/nic/mparivahan/DLServicesAuth/eKyc/AadharInterface;", "L2", "(Lcom/nic/mparivahan/DLServicesAuth/eKyc/AadharInterface;)V", "mAadharInterface", "c0", "b2", "P2", "multiList", "d0", "getMultiCheck", "setMultiCheck", "multiCheck", "Lcom/nic/mparivahan/DLServicesAuth/eKyc/NewService/NewServPojo/EkycImplState;", "e0", "V1", "I2", "enabledService", "f0", "U1", "H2", "eService", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class DlServiceListActivity extends o40 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public tq1 binding;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String dlNo;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String dob;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public DldetobjX dlDetails;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public wl5 sarthiSession;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public nr1 dlServicesViewModel;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public LinearLayout ll_home;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String state_code;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String rto_name;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String state_name;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public ArrayList state_list;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public ArrayList mRtosMaster;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public wl5 sahi_session;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public DlServiceInt retrofitService;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    public String bioRecGenesis;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public ll mAadharViewModel;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public AadharInterface mAadharInterface;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public ArrayList multiList;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public ArrayList enabledService;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public ArrayList eService;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String lastEndorseRtoCode = "";

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String lastEndorseStateCode = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public HashMap whatServiceRequired = new HashMap();

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String rto_code = "0";

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public String multiCheck = "valid";

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            DlServiceListActivity.this.P1().E.c(false);
            DlServiceListActivity.this.A2("Service is temporary unavailable. Try After some time");
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            if (i == 0) {
                DlServiceListActivity.this.V2("0");
                return;
            }
            try {
                DlServiceListActivity dlServiceListActivity = DlServiceListActivity.this;
                dlServiceListActivity.V2(((StateMaster) dlServiceListActivity.h2().get(i)).getState_code());
                DlServiceListActivity dlServiceListActivity2 = DlServiceListActivity.this;
                dlServiceListActivity2.X2(((StateMaster) dlServiceListActivity2.h2().get(i)).getState_name());
                nr1 nr1VarT1 = DlServiceListActivity.this.T1();
                DlServiceListActivity dlServiceListActivity3 = DlServiceListActivity.this;
                nr1VarT1.h(dlServiceListActivity3, dlServiceListActivity3.g2());
            } catch (Exception e) {
                e.getLocalizedMessage();
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class c implements AdapterView.OnItemSelectedListener {
        public c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            Intrinsics.checkNotNullParameter(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            if (i == 0 && Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) DlServiceListActivity.this.g2()).toString(), "DL")) {
                DlServiceListActivity.this.R2("DL3");
                DlServiceListActivity.this.S2("DY.DIR.ZONAL OFFICE,SOUTH DELHI,SHEIKH SARAI - 98");
            } else {
                if (i == 0 && !Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) DlServiceListActivity.this.g2()).toString(), "DL")) {
                    DlServiceListActivity.this.R2("0");
                    return;
                }
                DlServiceListActivity dlServiceListActivity = DlServiceListActivity.this;
                dlServiceListActivity.S2(((RtosMaster) dlServiceListActivity.a2().get(i)).getRto_name());
                DlServiceListActivity dlServiceListActivity2 = DlServiceListActivity.this;
                dlServiceListActivity2.R2(((RtosMaster) dlServiceListActivity2.a2().get(i)).getRto_code());
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
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

        public final void invoke(String str) {
            DlServiceListActivity.this.P1().E.c(false);
            DlServiceListActivity.this.C2();
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
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
        public final void a(ServPojo servPojo) {
            DlServiceListActivity.this.P1().E.c(false);
            try {
                if (servPojo.getResponseMsg().getStatusCode() != 200) {
                    Toast.makeText(DlServiceListActivity.this, servPojo.getResponseMsg().getDeveloperMessage(), 1).show();
                    return;
                }
                if (StringsKt__StringsJVMKt.equals(servPojo.getEkycRequired(), "N", true)) {
                    DlServiceListActivity.this.C2();
                    return;
                }
                DlServiceListActivity.this.I2(servPojo.getEkycImplStates());
                if (DlServiceListActivity.this.V1().size() <= 0) {
                    DlServiceListActivity.this.C2();
                    return;
                }
                int size = DlServiceListActivity.this.V1().size();
                for (int i = 0; i < size; i++) {
                    DlServiceListActivity.this.U1().add(String.valueOf(((EkycImplState) DlServiceListActivity.this.V1().get(i)).getEkycIsTrcd()));
                }
                if (!DlServiceListActivity.this.U1().contains("513") && !DlServiceListActivity.this.U1().contains("514") && !DlServiceListActivity.this.U1().contains("515") && !DlServiceListActivity.this.U1().contains("516") && !DlServiceListActivity.this.U1().contains("524") && !DlServiceListActivity.this.U1().contains("526") && !DlServiceListActivity.this.U1().contains("537") && !DlServiceListActivity.this.U1().contains("548")) {
                    DlServiceListActivity.this.C2();
                    return;
                }
                DlServiceListActivity dlServiceListActivity = DlServiceListActivity.this;
                dlServiceListActivity.x2(dlServiceListActivity, dlServiceListActivity.getDlNo(), DlServiceListActivity.this.R1(), true);
            } catch (Exception unused) {
                DlServiceListActivity.this.A2("Service is temporary unavailable. Try After some time");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ServPojo) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class f implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public f(Function1 function) {
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
    public final void A2(String message) {
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
        textView.setText(W1().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(W1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(W1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fq1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlServiceListActivity.B2(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void j2(DlServiceListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) DashBoard.class);
        intent.setFlags(67108864);
        this$0.startActivity(intent);
        this$0.finish();
    }

    public static final void k2(DlServiceListActivity this$0, DlLastRtoDetailsDto dlLastRtoDetailsDto) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (!Intrinsics.areEqual(dlLastRtoDetailsDto.getStatus_code(), "00")) {
                this$0.A2(dlLastRtoDetailsDto.getStatus_desc());
                return;
            }
            List<Result> result = dlLastRtoDetailsDto.getResult();
            if (result != null) {
                this$0.P1().w.setText(result.get(0).getLastEndState());
                this$0.P1().v.setText(result.get(0).getLastEndRTO());
                String rtoCode = result.get(0).getRtoCode();
                Intrinsics.checkNotNull(rtoCode);
                this$0.lastEndorseRtoCode = rtoCode;
                String stCode = result.get(0).getStCode();
                Intrinsics.checkNotNull(stCode);
                this$0.lastEndorseStateCode = stCode;
                if (Intrinsics.areEqual(this$0.f2().b(), "4") || Intrinsics.areEqual(this$0.f2().b(), VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE) || Intrinsics.areEqual(this$0.f2().b(), "524") || Intrinsics.areEqual(this$0.f2().b(), "548") || Intrinsics.areEqual(this$0.f2().b(), "526")) {
                    this$0.P1().t.setVisibility(8);
                } else {
                    this$0.P1().t.setVisibility(8);
                    this$0.T1().i(this$0);
                }
                String lastEndRTO = result.get(0).getLastEndRTO();
                if (lastEndRTO != null && lastEndRTO.length() != 0) {
                    this$0.e2().u(String.valueOf(result.get(0).getLastEndRTO()));
                    return;
                }
                this$0.e2().u("NA");
            }
        } catch (Exception unused) {
            this$0.A2(this$0.getString(R.string.service_unavable_please_try));
        }
    }

    public static final void l2(DlServiceListActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.P1().t.setVisibility(8);
        this$0.A2(this$0.W1().b("service_is_not_present", this$0.getString(R.string.unable_to_get_details)));
    }

    public static final void m2(DlServiceListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void n2(DlServiceListActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.A2(new JSONObject(str.toString()).getString("Result"));
        } catch (Exception unused) {
            this$0.A2(this$0.getString(R.string.service_unavable_please_try));
        }
    }

    public static final void o2(DlServiceListActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.A2(this$0.getString(R.string.service_unavable_please_try));
    }

    public static final void p2(DlServiceListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.P1().h.performClick();
    }

    public static final void q2(DlServiceListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.getApplicationContext(), this$0.W1().b("label_log_check_internet", this$0.getString(R.string.msg_no_internet)), 1).show();
            return;
        }
        try {
            int i = Intrinsics.areEqual(this$0.f2().b(), VContant.MAINSCREEN) ? 514 : Intrinsics.areEqual(this$0.f2().b(), VContant.APPLICATION_SCREEN) ? 513 : Intrinsics.areEqual(this$0.f2().b(), "3") ? 515 : Intrinsics.areEqual(this$0.f2().b(), "4") ? 525 : Intrinsics.areEqual(this$0.f2().b(), VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE) ? 523 : Intrinsics.areEqual(this$0.f2().b(), VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE) ? 516 : Intrinsics.areEqual(this$0.f2().b(), "537") ? 537 : Intrinsics.areEqual(this$0.f2().b(), "524") ? 524 : Intrinsics.areEqual(this$0.f2().b(), "526") ? 526 : Intrinsics.areEqual(this$0.f2().b(), "548") ? 548 : Integer.parseInt(this$0.f2().b());
            if (Intrinsics.areEqual(this$0.f2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                if (Intrinsics.areEqual(this$0.rto_code, "0")) {
                    this$0.A2(this$0.W1().b("select_rto", this$0.getString(R.string.please_select_rto)));
                    return;
                } else {
                    this$0.P1().E.c(true);
                    this$0.Z1().n(this$0.f2().n(), StringsKt__StringsKt.trim((CharSequence) this$0.rto_code).toString());
                    return;
                }
            }
            if (!Intrinsics.areEqual(this$0.f2().b(), VContant.MAINSCREEN) && !Intrinsics.areEqual(this$0.f2().b(), VContant.APPLICATION_SCREEN) && !Intrinsics.areEqual(this$0.f2().b(), "3") && !Intrinsics.areEqual(this$0.f2().b(), VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE) && !Intrinsics.areEqual(this$0.f2().b(), "537")) {
                this$0.P1().E.c(true);
                this$0.Z1().g(this$0.f2().n(), i, StringsKt__StringsKt.trim((CharSequence) this$0.lastEndorseRtoCode).toString());
                return;
            }
            if (Intrinsics.areEqual(this$0.rto_code, "0")) {
                this$0.A2(this$0.W1().b("select_rto", this$0.getString(R.string.please_select_rto)));
            } else {
                this$0.P1().E.c(true);
                this$0.Z1().g(this$0.f2().n(), i, StringsKt__StringsKt.trim((CharSequence) this$0.rto_code).toString());
            }
        } catch (Exception unused) {
        }
    }

    public static final void r2(DlServiceListActivity this$0, CheckByState checkByState) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.P1().E.c(false);
        try {
            if (StringsKt__StringsJVMKt.equals(checkByState.getEkycRequired(), "N", true)) {
                this$0.C2();
            } else {
                this$0.x2(this$0, this$0.dlNo, this$0.R1(), true);
            }
        } catch (Exception unused) {
            this$0.C2();
        }
    }

    public static final void s2(DlServiceListActivity this$0, SarathiStatePojo sarathiStatePojo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (!StringsKt__StringsJVMKt.equals(sarathiStatePojo.getStatus_code(), "00", true)) {
                this$0.W2(new ArrayList());
                this$0.h2().add(0, new StateMaster("Select State", "0"));
                this$0.P1().i.setAdapter((SpinnerAdapter) new y31(this$0, this$0.h2()));
                return;
            }
            List<StateMaster> stateMaster = sarathiStatePojo.getStateMaster();
            Intrinsics.checkNotNull(stateMaster, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.dlservices.sarathiStateApi.StateMaster>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.dlservices.sarathiStateApi.StateMaster> }");
            this$0.W2((ArrayList) stateMaster);
            this$0.h2().add(0, new StateMaster("Select State", "0"));
            this$0.P1().i.setAdapter((SpinnerAdapter) new y31(this$0, this$0.h2()));
            Log.d("getStateCode", this$0.e2().n());
            int size = this$0.h2().size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (StringsKt__StringsJVMKt.equals(this$0.e2().n(), "OR", true) && StringsKt__StringsJVMKt.equals(StringsKt__StringsKt.trim((CharSequence) ((StateMaster) this$0.h2().get(i)).getState_code()).toString(), "OD", true)) {
                        this$0.P1().i.setSelection(i);
                        break;
                    } else {
                        if (Intrinsics.areEqual(this$0.e2().n(), StringsKt__StringsKt.trim((CharSequence) ((StateMaster) this$0.h2().get(i)).getState_code()).toString())) {
                            this$0.P1().i.setSelection(i);
                            break;
                        }
                        i++;
                    }
                } else {
                    break;
                }
            }
            this$0.P1().i.setEnabled(false);
            this$0.P1().i.setClickable(false);
        } catch (Exception unused) {
            Toast.makeText(this$0.getApplicationContext(), this$0.W1().b("service_is_not_present", this$0.getString(R.string.unable_to_get_details)), 1).show();
        }
    }

    public static final void t2(DlServiceListActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.P1().t.setVisibility(8);
        Toast.makeText(this$0.getApplicationContext(), this$0.W1().b("service_is_not_present", this$0.getString(R.string.unable_to_get_details)), 1).show();
    }

    public static final void u2(DlServiceListActivity this$0, CurrentRTO currentRTO) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.P1().t.setVisibility(8);
        try {
            if (!StringsKt__StringsJVMKt.equals(currentRTO.getStatus_code(), "00", true)) {
                List<RtosMaster> rtosMaster = currentRTO.getRtosMaster();
                Intrinsics.checkNotNull(rtosMaster, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster> }");
                this$0.O2((ArrayList) rtosMaster);
                ArrayList arrayListA2 = this$0.a2();
                String strB = this$0.W1().b("select_rto", this$0.getString(R.string.please_select_rto));
                Intrinsics.checkNotNull(strB);
                arrayListA2.add(0, new RtosMaster(strB, "0"));
                this$0.P1().h.setAdapter((SpinnerAdapter) new x31(this$0, this$0.a2()));
            } else if (Intrinsics.areEqual(this$0.g2(), "DL")) {
                List<RtosMaster> rtosMaster2 = currentRTO.getRtosMaster();
                Intrinsics.checkNotNull(rtosMaster2, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster> }");
                this$0.O2((ArrayList) rtosMaster2);
                this$0.a2().add(0, new RtosMaster("DY.DIR.ZONAL OFFICE,SOUTH DELHI,SHEIKH SARAI - 98", "DL3"));
                this$0.P1().h.setAdapter((SpinnerAdapter) new x31(this$0, this$0.a2()));
                this$0.P1().h.setEnabled(false);
                this$0.P1().h.setClickable(false);
                this$0.P1().p.setClickable(false);
            } else {
                this$0.P1().p.setClickable(true);
                List<RtosMaster> rtosMaster3 = currentRTO.getRtosMaster();
                Intrinsics.checkNotNull(rtosMaster3, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.DLServicesAuth.Model.GetCurrentRTO.RtosMaster> }");
                this$0.O2((ArrayList) rtosMaster3);
                ArrayList arrayListA22 = this$0.a2();
                String strB2 = this$0.W1().b("select_rto", this$0.getString(R.string.please_select_rto));
                Intrinsics.checkNotNull(strB2);
                arrayListA22.add(0, new RtosMaster(strB2, "0"));
                this$0.P1().h.setAdapter((SpinnerAdapter) new x31(this$0, this$0.a2()));
                this$0.P1().h.setEnabled(true);
                this$0.P1().h.setClickable(true);
            }
        } catch (Exception unused) {
            this$0.P1().t.setVisibility(8);
            this$0.A2(this$0.W1().b("service_is_not_present", this$0.getString(R.string.unable_to_get_details)));
        }
    }

    public static final void y2(Dialog d2, DlServiceListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        try {
            if (Intrinsics.areEqual(this$0.f2().b(), "4")) {
                this$0.whatServiceRequired.put("525", "International Driving Permit");
                this$0.v2(this$0.whatServiceRequired);
                return;
            }
            if (Intrinsics.areEqual(this$0.f2().b(), VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE)) {
                this$0.whatServiceRequired.put("523", "DL Extract");
                this$0.v2(this$0.whatServiceRequired);
                return;
            }
            if (Intrinsics.areEqual(this$0.f2().b(), "524")) {
                this$0.whatServiceRequired.put("524", "Endorsement to Drive in Hill Region");
                this$0.v2(this$0.whatServiceRequired);
                return;
            }
            if (Intrinsics.areEqual(this$0.f2().b(), "526")) {
                this$0.whatServiceRequired.put("526", "Change of Name in DL");
                this$0.v2(this$0.whatServiceRequired);
                return;
            }
            if (Intrinsics.areEqual(this$0.f2().b(), "548")) {
                this$0.whatServiceRequired.put("548", "Change of Date of Birth in DL");
                this$0.v2(this$0.whatServiceRequired);
                return;
            }
            if (StringsKt__StringsJVMKt.equals(this$0.g2(), "0", true)) {
                this$0.A2(this$0.W1().b("label_log_sel_state", this$0.getString(R.string.please_select_state)));
                return;
            }
            if (StringsKt__StringsJVMKt.equals(this$0.rto_code, "0", true) && !Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) this$0.g2()).toString(), "DL")) {
                this$0.A2(this$0.W1().b("select_rto", this$0.getString(R.string.please_select_rto)));
                return;
            }
            if (StringsKt__StringsJVMKt.equals(this$0.f2().b(), VContant.MAINSCREEN, true)) {
                this$0.whatServiceRequired.put("514", "Renewal of DL");
            } else if (StringsKt__StringsJVMKt.equals(this$0.f2().b(), VContant.APPLICATION_SCREEN, true)) {
                this$0.whatServiceRequired.put("513", "Issue of Duplicate DL");
            } else if (StringsKt__StringsJVMKt.equals(this$0.f2().b(), "537", true)) {
                this$0.whatServiceRequired.put("537", "RE-VALIDATION OF EXPIRED DL");
            } else if (StringsKt__StringsJVMKt.equals(this$0.f2().b(), "3", true)) {
                this$0.whatServiceRequired.put("515", "Change of Address in DL");
            } else if (StringsKt__StringsJVMKt.equals(this$0.f2().b(), VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE, true)) {
                this$0.whatServiceRequired.put("516", "Replacement of DL");
            } else if (StringsKt__StringsJVMKt.equals(this$0.f2().b(), VContant.MULTISERVICE_PURPOSE_CODE, true)) {
                this$0.whatServiceRequired.put(VContant.MULTISERVICE_PURPOSE_CODE, "Multi Service");
            }
            Intent intent = new Intent(this$0, (Class<?>) SarthiProcessWithAdhar.class);
            intent.putExtra("DL", this$0.dlNo);
            intent.putExtra("dob", this$0.dob);
            intent.putExtra("DLDetails", this$0.R1());
            intent.putExtra("whatServiceRequired", this$0.whatServiceRequired);
            intent.putExtra("lastEndorsedRTOCode", this$0.rto_code);
            intent.putExtra("lastEndorseStateCode", this$0.g2());
            intent.putExtra("lastEndorsedState", this$0.i2());
            intent.putExtra("lastEndorsedRTO", this$0.d2());
            intent.putExtra("bioRecGenesis", this$0.Q1());
            if (StringsKt__StringsJVMKt.equals(StringsKt__StringsKt.trim((CharSequence) this$0.lastEndorseStateCode).toString(), StringsKt__StringsKt.trim((CharSequence) this$0.g2()).toString(), true)) {
                intent.putExtra("state_value", "same");
            } else {
                intent.putExtra("state_value", "differ");
            }
            if (Intrinsics.areEqual(this$0.f2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", this$0.U1());
            } else {
                intent.putExtra("multiList", this$0.b2());
            }
            intent.putExtra("multiCheck", this$0.multiCheck);
            this$0.startActivity(intent);
            this$0.finish();
        } catch (Exception e2) {
            Log.d("valueListActivity", e2.getLocalizedMessage());
        }
    }

    public static final void z2(Dialog d2, DlServiceListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        this$0.C2();
    }

    public final void C2() {
        try {
            if (Intrinsics.areEqual(f2().b(), "4")) {
                this.whatServiceRequired.put("525", "International Driving Permit");
                w2(this.whatServiceRequired);
                return;
            }
            if (Intrinsics.areEqual(f2().b(), VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE)) {
                this.whatServiceRequired.put("523", "DL Extract");
                w2(this.whatServiceRequired);
                return;
            }
            if (Intrinsics.areEqual(f2().b(), "524")) {
                this.whatServiceRequired.put("524", "Endorsement to Drive in Hill Region");
                w2(this.whatServiceRequired);
                return;
            }
            if (Intrinsics.areEqual(f2().b(), "526")) {
                this.whatServiceRequired.put("526", "Change of Name in DL");
                w2(this.whatServiceRequired);
                return;
            }
            if (Intrinsics.areEqual(f2().b(), "548")) {
                this.whatServiceRequired.put("548", "Change of Date of Birth in DL");
                w2(this.whatServiceRequired);
                return;
            }
            if (StringsKt__StringsJVMKt.equals(g2(), "0", true)) {
                A2(W1().b("label_log_sel_state", getString(R.string.please_select_state)));
                return;
            }
            if (StringsKt__StringsJVMKt.equals(this.rto_code, "0", true) && !Intrinsics.areEqual(StringsKt__StringsKt.trim((CharSequence) g2()).toString(), "DL")) {
                A2(W1().b("select_rto", getString(R.string.please_select_rto)));
                return;
            }
            if (StringsKt__StringsJVMKt.equals(f2().b(), VContant.MAINSCREEN, true)) {
                this.whatServiceRequired.put("514", "Renewal of DL");
            } else if (StringsKt__StringsJVMKt.equals(f2().b(), VContant.APPLICATION_SCREEN, true)) {
                this.whatServiceRequired.put("513", "Issue of Duplicate DL");
            } else if (StringsKt__StringsJVMKt.equals(f2().b(), "537", true)) {
                this.whatServiceRequired.put("537", "RE-VALIDATION OF EXPIRED DL");
            } else if (StringsKt__StringsJVMKt.equals(f2().b(), "3", true)) {
                this.whatServiceRequired.put("515", "Change of Address in DL");
            } else if (StringsKt__StringsJVMKt.equals(f2().b(), VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE, true)) {
                this.whatServiceRequired.put("516", "Replacement of DL");
            }
            Intent intent = new Intent(this, (Class<?>) SarthiProcessWithMobile.class);
            intent.putExtra("DL", this.dlNo);
            intent.putExtra("dob", this.dob);
            intent.putExtra("DLDetails", R1());
            intent.putExtra("whatServiceRequired", this.whatServiceRequired);
            intent.putExtra("lastEndorsedRTOCode", this.rto_code);
            intent.putExtra("lastEndorseStateCode", g2());
            intent.putExtra("lastEndorsedState", i2());
            intent.putExtra("lastEndorsedRTO", d2());
            intent.putExtra("bioRecGenesis", Q1());
            if (StringsKt__StringsJVMKt.equals(StringsKt__StringsKt.trim((CharSequence) this.lastEndorseStateCode).toString(), StringsKt__StringsKt.trim((CharSequence) g2()).toString(), true)) {
                intent.putExtra("state_value", "same");
            } else {
                intent.putExtra("state_value", "differ");
            }
            intent.putExtra("multiList", b2());
            intent.putExtra("multiCheck", this.multiCheck);
            startActivity(intent);
            finish();
        } catch (Exception e2) {
            Log.d("valueListActivity", e2.getLocalizedMessage());
        }
    }

    public final void D2(tq1 tq1Var) {
        Intrinsics.checkNotNullParameter(tq1Var, "<set-?>");
        this.binding = tq1Var;
    }

    public final void E2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bioRecGenesis = str;
    }

    public final void F2(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dlDetails = dldetobjX;
    }

    public final void G2(nr1 nr1Var) {
        Intrinsics.checkNotNullParameter(nr1Var, "<set-?>");
        this.dlServicesViewModel = nr1Var;
    }

    public final void H2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.eService = arrayList;
    }

    public final void I2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.enabledService = arrayList;
    }

    public final void J2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void K2(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.ll_home = linearLayout;
    }

    public final void L2(AadharInterface aadharInterface) {
        Intrinsics.checkNotNullParameter(aadharInterface, "<set-?>");
        this.mAadharInterface = aadharInterface;
    }

    public final void M2(ll llVar) {
        Intrinsics.checkNotNullParameter(llVar, "<set-?>");
        this.mAadharViewModel = llVar;
    }

    public final void N2(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void O2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.mRtosMaster = arrayList;
    }

    public final tq1 P1() {
        tq1 tq1Var = this.binding;
        if (tq1Var != null) {
            return tq1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void P2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.multiList = arrayList;
    }

    public final String Q1() {
        String str = this.bioRecGenesis;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bioRecGenesis");
        return null;
    }

    public final void Q2(DlServiceInt dlServiceInt) {
        Intrinsics.checkNotNullParameter(dlServiceInt, "<set-?>");
        this.retrofitService = dlServiceInt;
    }

    public final DldetobjX R1() {
        DldetobjX dldetobjX = this.dlDetails;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlDetails");
        return null;
    }

    public final void R2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rto_code = str;
    }

    /* JADX INFO: renamed from: S1, reason: from getter */
    public final String getDlNo() {
        return this.dlNo;
    }

    public final void S2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rto_name = str;
    }

    public final nr1 T1() {
        nr1 nr1Var = this.dlServicesViewModel;
        if (nr1Var != null) {
            return nr1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlServicesViewModel");
        return null;
    }

    public final void T2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sahi_session = wl5Var;
    }

    public final ArrayList U1() {
        ArrayList arrayList = this.eService;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eService");
        return null;
    }

    public final void U2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarthiSession = wl5Var;
    }

    public final ArrayList V1() {
        ArrayList arrayList = this.enabledService;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("enabledService");
        return null;
    }

    public final void V2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.state_code = str;
    }

    public final wa3 W1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final void W2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.state_list = arrayList;
    }

    public final LinearLayout X1() {
        LinearLayout linearLayout = this.ll_home;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ll_home");
        return null;
    }

    public final void X2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.state_name = str;
    }

    public final AadharInterface Y1() {
        AadharInterface aadharInterface = this.mAadharInterface;
        if (aadharInterface != null) {
            return aadharInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAadharInterface");
        return null;
    }

    public final ll Z1() {
        ll llVar = this.mAadharViewModel;
        if (llVar != null) {
            return llVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAadharViewModel");
        return null;
    }

    public final ArrayList a2() {
        ArrayList arrayList = this.mRtosMaster;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRtosMaster");
        return null;
    }

    public final ArrayList b2() {
        ArrayList arrayList = this.multiList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiList");
        return null;
    }

    public final DlServiceInt c2() {
        DlServiceInt dlServiceInt = this.retrofitService;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final String d2() {
        String str = this.rto_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rto_name");
        return null;
    }

    public final wl5 e2() {
        wl5 wl5Var = this.sahi_session;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sahi_session");
        return null;
    }

    public final wl5 f2() {
        wl5 wl5Var = this.sarthiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarthiSession");
        return null;
    }

    public final String g2() {
        String str = this.state_code;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("state_code");
        return null;
    }

    public final ArrayList h2() {
        ArrayList arrayList = this.state_list;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("state_list");
        return null;
    }

    public final String i2() {
        String str = this.state_name;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("state_name");
        return null;
    }

    @Override // com.zepto.o40, com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tq1 tq1VarC = tq1.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(tq1VarC, "inflate(...)");
        D2(tq1VarC);
        N2(this);
        T2(new wl5(this));
        J2(new wa3(this));
        L2(AadharInterface.INSTANCE.a(this));
        M2((ll) new z(this, new jl(new kl(Y1()))).a(ll.class));
        ta3.a.w0(this, P1());
        Q2(DlServiceInt.INSTANCE.a(this));
        setContentView(P1().b());
        U2(new wl5(this));
        if (Intrinsics.areEqual(f2().b(), "4") || Intrinsics.areEqual(f2().b(), VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE) || Intrinsics.areEqual(f2().b(), "524") || Intrinsics.areEqual(f2().b(), "548") || Intrinsics.areEqual(f2().b(), "526")) {
            P1().B.setVisibility(8);
            P1().s.setVisibility(8);
            P1().C.setVisibility(8);
            P1().r.setVisibility(8);
        } else {
            P1().B.setVisibility(0);
            P1().s.setVisibility(0);
            P1().C.setVisibility(0);
            P1().r.setVisibility(0);
        }
        View viewFindViewById = findViewById(R.id.ll_home);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        K2((LinearLayout) viewFindViewById);
        X1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.aq1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlServiceListActivity.j2(this.a, view);
            }
        });
        try {
            E2(String.valueOf(getIntent().getStringExtra("bioRecGenesis")));
            this.dlNo = String.valueOf(getIntent().getStringExtra("DL"));
            this.dob = String.valueOf(getIntent().getStringExtra("dob"));
            Serializable serializableExtra = getIntent().getSerializableExtra("DLDetails");
            Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
            F2((DldetobjX) serializableExtra);
            P1().l.setText(W1().b("dl_no", "DL No. : ") + ' ' + this.dlNo);
            P1().m.setText(W1().b("dl_no", "DL No. : ") + ' ' + this.dlNo);
            BioImgObjX bioImgObj = R1().getBioImgObj();
            if ((bioImgObj != null ? bioImgObj.getBiPhoto() : null) == null) {
                P1().u.setVisibility(8);
                P1().o.setVisibility(0);
            } else {
                P1().u.setVisibility(0);
                P1().o.setVisibility(8);
                P1().q.setImageBitmap(kt6.a(R1().getBioImgObj().getBiPhoto()));
            }
            this.multiCheck = String.valueOf(getIntent().getStringExtra("multiCheck"));
            Serializable serializableExtra2 = getIntent().getSerializableExtra("multiList");
            Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            P2((ArrayList) serializableExtra2);
            Intrinsics.areEqual(f2().b(), VContant.MULTISERVICE_PURPOSE_CODE);
        } catch (Exception unused) {
        }
        G2((nr1) new z(this, new rq1(new lr1(c2(), this))).a(nr1.class));
        P1().t.setVisibility(0);
        if (com.nic.mparivahan.a.a.a(this)) {
            nr1 nr1VarT1 = T1();
            String str = this.dlNo;
            Intrinsics.checkNotNull(str);
            String str2 = this.dob;
            Intrinsics.checkNotNull(str2);
            nr1VarT1.x(this, str, str2);
        } else {
            Toast.makeText(getApplicationContext(), W1().b("label_log_check_internet", getString(R.string.msg_no_internet)), 1).show();
        }
        T1().l().g(this, new mf4() { // from class: com.zepto.iq1
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                DlServiceListActivity.k2(this.a, (DlLastRtoDetailsDto) obj);
            }
        });
        T1().m().g(this, new mf4() { // from class: com.zepto.jq1
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                DlServiceListActivity.n2(this.a, (String) obj);
            }
        });
        T1().t().g(this, new mf4() { // from class: com.zepto.kq1
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                DlServiceListActivity.o2(this.a, (String) obj);
            }
        });
        P1().p.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lq1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlServiceListActivity.p2(this.a, view);
            }
        });
        P1().n.setText(f2().k());
        P1().E.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mq1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlServiceListActivity.q2(this.a, view);
            }
        });
        P1().k.setText(this.dlNo);
        Z1().j().g(this, new mf4() { // from class: com.zepto.nq1
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                DlServiceListActivity.r2(this.a, (CheckByState) obj);
            }
        });
        Z1().i().g(this, new f(new d()));
        I2(new ArrayList());
        H2(new ArrayList());
        Z1().k().g(this, new f(new e()));
        Z1().i().g(this, new f(new a()));
        T1().z().g(this, new mf4() { // from class: com.zepto.oq1
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                DlServiceListActivity.s2(this.a, (SarathiStatePojo) obj);
            }
        });
        T1().B().g(this, new mf4() { // from class: com.zepto.bq1
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                DlServiceListActivity.t2(this.a, (String) obj);
            }
        });
        P1().i.setOnItemSelectedListener(new b());
        T1().y().g(this, new mf4() { // from class: com.zepto.cq1
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                DlServiceListActivity.u2(this.a, (CurrentRTO) obj);
            }
        });
        T1().A().g(this, new mf4() { // from class: com.zepto.gq1
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                DlServiceListActivity.l2(this.a, (String) obj);
            }
        });
        P1().h.setOnItemSelectedListener(new c());
        P1().D.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hq1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlServiceListActivity.m2(this.a, view);
            }
        });
    }

    public final void v2(HashMap whatServiceRequired) {
        Intent intent = new Intent(this, (Class<?>) SarthiProcessWithAdhar.class);
        intent.putExtra("DL", this.dlNo);
        intent.putExtra("dob", this.dob);
        intent.putExtra("DLDetails", R1());
        intent.putExtra("whatServiceRequired", whatServiceRequired);
        if (StringsKt__StringsJVMKt.equals(StringsKt__StringsKt.trim((CharSequence) this.lastEndorseStateCode).toString(), "DL", true)) {
            intent.putExtra("lastEndorsedRTOCode", "DL3");
        } else {
            intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRtoCode);
        }
        intent.putExtra("lastEndorseStateCode", this.lastEndorseStateCode);
        intent.putExtra("lastEndorsedState", P1().w.getText().toString());
        intent.putExtra("lastEndorsedRTO", P1().v.getText().toString());
        intent.putExtra("state_value", "same");
        intent.putExtra("bioRecGenesis", Q1());
        if (Intrinsics.areEqual(f2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            intent.putExtra("multiList", U1());
        } else {
            intent.putExtra("multiList", b2());
        }
        intent.putExtra("multiCheck", this.multiCheck);
        startActivity(intent);
        finish();
    }

    public final void w2(HashMap whatServiceRequired) {
        Intent intent = new Intent(this, (Class<?>) SarthiProcessWithMobile.class);
        intent.putExtra("DL", this.dlNo);
        intent.putExtra("dob", this.dob);
        intent.putExtra("DLDetails", R1());
        intent.putExtra("whatServiceRequired", whatServiceRequired);
        if (StringsKt__StringsJVMKt.equals(StringsKt__StringsKt.trim((CharSequence) this.lastEndorseStateCode).toString(), "DL", true)) {
            intent.putExtra("lastEndorsedRTOCode", "DL3");
        } else {
            intent.putExtra("lastEndorsedRTOCode", this.lastEndorseRtoCode);
        }
        intent.putExtra("lastEndorseStateCode", this.lastEndorseStateCode);
        intent.putExtra("lastEndorsedState", P1().w.getText().toString());
        intent.putExtra("lastEndorsedRTO", P1().v.getText().toString());
        intent.putExtra("state_value", "same");
        intent.putExtra("bioRecGenesis", Q1());
        intent.putExtra("multiList", b2());
        intent.putExtra("multiCheck", this.multiCheck);
        startActivity(intent);
        finish();
    }

    public final void x2(Context context, String dl_number, DldetobjX dl_details, boolean vis) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dl_details, "dl_details");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.vahan_process_diloge);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Window window2 = dialog.getWindow();
        WindowManager.LayoutParams attributes = window2 != null ? window2.getAttributes() : null;
        if (attributes != null) {
            attributes.windowAnimations = R.style.PauseDialogAnimation;
        }
        View viewFindViewById = dialog.findViewById(R.id.process_with_Adhar);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = dialog.findViewById(R.id.process_with_mobile);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById2;
        if (vis) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dq1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlServiceListActivity.y2(dialog, this, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.eq1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DlServiceListActivity.z2(dialog, this, view);
            }
        });
        dialog.show();
    }
}
