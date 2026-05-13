package com.nic.mparivahan.VahanServices.Nominee;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.z;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.PushNotification.NaxpToKenService;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.GetStateCode;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.OwnerDetailPuccPermit;
import com.nic.mparivahan.VahanServices.VahanModel.vahanOnlineCheck;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanGenerateOTPScreen;
import com.nic.mparivahan.VahanServices.VahanView.VahanProcessWithAdhar;
import com.zepto.al7;
import com.zepto.bg7;
import com.zepto.bl7;
import com.zepto.gd1;
import com.zepto.jd7;
import com.zepto.kd7;
import com.zepto.ld7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.sg4;
import com.zepto.ta3;
import com.zepto.vh7;
import com.zepto.wa3;
import com.zepto.yb4;
import com.zepto.yy0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u00012\u00020\u0002B\t¢\u0006\u0006\b«\u0001\u0010¬\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0003J\b\u0010\b\u001a\u00020\u0003H\u0003J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\f\u001a\u00020\u0003H\u0014J\u0016\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0016\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000fJ$\u0010\u0018\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u000fJ\u001c\u0010\u001f\u001a\u00020\u000f2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u001dH\u0007R\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010N\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010R\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010I\u001a\u0004\bP\u0010K\"\u0004\bQ\u0010MR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010j\u001a\u00020c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010r\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010v\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010]\u001a\u0004\bt\u0010_\"\u0004\bu\u0010aR\"\u0010z\u001a\u00020c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bw\u0010e\u001a\u0004\bx\u0010g\"\u0004\by\u0010iRA\u0010\u0082\u0001\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u001dj\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f`{8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R%\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010I\u001a\u0005\b\u0084\u0001\u0010K\"\u0005\b\u0085\u0001\u0010MR&\u0010\u0089\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010I\u001a\u0005\b\u0087\u0001\u0010K\"\u0005\b\u0088\u0001\u0010MR(\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010I\u001a\u0005\b\u008b\u0001\u0010K\"\u0005\b\u008c\u0001\u0010MR&\u0010\u0091\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010I\u001a\u0005\b\u008f\u0001\u0010K\"\u0005\b\u0090\u0001\u0010MR*\u0010\u0099\u0001\u001a\u00030\u0092\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R;\u0010¢\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u000f0\u009a\u0001j\t\u0012\u0004\u0012\u00020\u000f`\u009b\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R&\u0010¦\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b£\u0001\u0010I\u001a\u0005\b¤\u0001\u0010K\"\u0005\b¥\u0001\u0010MR&\u0010ª\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b§\u0001\u0010I\u001a\u0005\b¨\u0001\u0010K\"\u0005\b©\u0001\u0010M¨\u0006\u00ad\u0001"}, d2 = {"Lcom/nic/mparivahan/VahanServices/Nominee/NomineeMainViewScreen;", "Lcom/zepto/pq;", "Lcom/zepto/sg4;", "", "W1", "", "u2", "Z1", "X1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "Landroid/content/Context;", "context", "", "rc_number", "x1", "title", "v1", "rc_num", "", "position", "chassiNo", "e0", "message", "s2", "check_string", "r2", "Ljava/util/HashMap;", "serviceSelection_HashMap", "A1", "Lcom/zepto/yb4;", "C", "Lcom/zepto/yb4;", "B1", "()Lcom/zepto/yb4;", "b2", "(Lcom/zepto/yb4;)V", "binding", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "D", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "getDatabaseHelper", "()Lcom/nic/mparivahan/DB/DatabaseHelper;", "d2", "(Lcom/nic/mparivahan/DB/DatabaseHelper;)V", "databaseHelper", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "E1", "()Landroid/app/ProgressDialog;", "i2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/al7;", "F", "Lcom/zepto/al7;", "N1", "()Lcom/zepto/al7;", "p2", "(Lcom/zepto/al7;)V", "viewModel", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "G", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "I1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;", "k2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanServiceConnection;)V", "retrofitService", "H", "Ljava/lang/String;", "getClickvalue", "()Ljava/lang/String;", "c2", "(Ljava/lang/String;)V", "clickvalue", "I", "getRc_adapter_val", "setRc_adapter_val", "rc_adapter_val", "Lcom/zepto/vh7;", "J", "Lcom/zepto/vh7;", "K1", "()Lcom/zepto/vh7;", "m2", "(Lcom/zepto/vh7;)V", "session", "Lcom/zepto/ld7;", "K", "Lcom/zepto/ld7;", "M1", "()Lcom/zepto/ld7;", "o2", "(Lcom/zepto/ld7;)V", "vahanViewModle", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "L", "Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "L1", "()Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;", "n2", "(Lcom/nic/mparivahan/VahanServices/VahanService/VahanProService;)V", "vahanService", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "M", "Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "D1", "()Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;", "g2", "(Lcom/nic/mparivahan/VahanServices/VahanModel/NrvDetails;)V", "nrvDetails", "N", "O1", "q2", "viewModelAddMob", "O", "J1", "l2", "retrofitServiceAddMob", "Lkotlin/collections/HashMap;", "P", "Ljava/util/HashMap;", "getServiceSelectionHashMap", "()Ljava/util/HashMap;", "setServiceSelectionHashMap", "(Ljava/util/HashMap;)V", "serviceSelectionHashMap", "Q", "getRc_number", "j2", "R", "getMobile_number", "f2", "mobile_number", "S", "getOff_code", "h2", "off_code", "T", "getState_intent", "setState_intent", "state_intent", "Lcom/zepto/wa3;", "U", "Lcom/zepto/wa3;", "C1", "()Lcom/zepto/wa3;", "e2", "(Lcom/zepto/wa3;)V", "languageSession", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "V", "Ljava/util/ArrayList;", "F1", "()Ljava/util/ArrayList;", "setRcArrayList", "(Ljava/util/ArrayList;)V", "rcArrayList", "W", "G1", "setRegistrationDateEtString", "registrationDateEtString", "X", "H1", "setRegistrationUptoEtString", "registrationUptoEtString", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nNomineeMainViewScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NomineeMainViewScreen.kt\ncom/nic/mparivahan/VahanServices/Nominee/NomineeMainViewScreen\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,783:1\n1549#2:784\n1620#2,3:785\n1549#2:788\n1620#2,3:789\n1549#2:792\n1620#2,3:793\n*S KotlinDebug\n*F\n+ 1 NomineeMainViewScreen.kt\ncom/nic/mparivahan/VahanServices/Nominee/NomineeMainViewScreen\n*L\n457#1:784\n457#1:785,3\n473#1:788\n473#1:789,3\n474#1:792\n474#1:793,3\n*E\n"})
public final class NomineeMainViewScreen extends pq implements sg4 {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public yb4 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public DatabaseHelper databaseHelper;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public al7 viewModel;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public VahanServiceConnection retrofitService;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String clickvalue;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public vh7 session;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ld7 vahanViewModle;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public VahanProService vahanService;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public NrvDetails nrvDetails;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public ld7 viewModelAddMob;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public VahanProService retrofitServiceAddMob;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public wa3 languageSession;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String rc_adapter_val = " ";

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public HashMap serviceSelectionHashMap = new HashMap();

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public String rc_number = "";

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public String mobile_number = "NA";

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String off_code = "0";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String state_intent = "NA";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public ArrayList rcArrayList = new ArrayList();

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public String registrationDateEtString = "";

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public String registrationUptoEtString = "";

    public static final class a extends Lambda implements Function1 {
        public a() {
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
            NomineeMainViewScreen.this.E1().dismiss();
            NomineeMainViewScreen nomineeMainViewScreen = NomineeMainViewScreen.this;
            nomineeMainViewScreen.s2(nomineeMainViewScreen, nomineeMainViewScreen.C1().b("record_error_msg", NomineeMainViewScreen.this.getString(R.string.service_unavable_please_try)));
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
        public final void a(GetStateCode getStateCode) {
            if (getStateCode == null) {
                NomineeMainViewScreen.this.E1().dismiss();
                NomineeMainViewScreen nomineeMainViewScreen = NomineeMainViewScreen.this;
                nomineeMainViewScreen.s2(nomineeMainViewScreen, nomineeMainViewScreen.C1().b("record_error_msg", NomineeMainViewScreen.this.getString(R.string.service_unavable_please_try)));
                return;
            }
            try {
                if (gd1.a.m(getStateCode.getStateCd())) {
                    NomineeMainViewScreen.this.E1().dismiss();
                    NomineeMainViewScreen nomineeMainViewScreen2 = NomineeMainViewScreen.this;
                    nomineeMainViewScreen2.s2(nomineeMainViewScreen2, nomineeMainViewScreen2.C1().b("record_error_msg", NomineeMainViewScreen.this.getString(R.string.service_unavable_please_try)));
                } else {
                    String strValueOf = String.valueOf(NomineeMainViewScreen.this.B1().h.getText());
                    NomineeMainViewScreen.this.j2(strValueOf);
                    if (strValueOf.length() > 0) {
                        String strValueOf2 = String.valueOf(NomineeMainViewScreen.this.B1().c.getText());
                        ld7 ld7VarM1 = NomineeMainViewScreen.this.M1();
                        NomineeMainViewScreen nomineeMainViewScreen3 = NomineeMainViewScreen.this;
                        String stateCd = getStateCode.getStateCd();
                        String strA = VContant.INSTANCE.A(NomineeMainViewScreen.this.K1());
                        String strSubstring = strValueOf2.substring(strValueOf2.length() - 5, strValueOf2.length());
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        ld7VarM1.F0(nomineeMainViewScreen3, strValueOf, stateCd, strA, strSubstring);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                NomineeMainViewScreen.this.E1().dismiss();
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
            NomineeMainViewScreen.this.E1().dismiss();
            if (StringsKt__StringsJVMKt.equals(str, "Error", true)) {
                NomineeMainViewScreen nomineeMainViewScreen = NomineeMainViewScreen.this;
                nomineeMainViewScreen.s2(nomineeMainViewScreen, nomineeMainViewScreen.C1().b("record_error_msg", NomineeMainViewScreen.this.getString(R.string.service_unavable_please_try)));
            } else {
                NomineeMainViewScreen nomineeMainViewScreen2 = NomineeMainViewScreen.this;
                nomineeMainViewScreen2.s2(nomineeMainViewScreen2, str.toString());
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
        public final void a(OwnerDetailPuccPermit ownerDetailPuccPermit) {
            try {
                String regn_no = ownerDetailPuccPermit.getRegn_no();
                if (regn_no != null && regn_no.length() != 0) {
                    String strValueOf = String.valueOf(NomineeMainViewScreen.this.B1().c.getText());
                    String strSubstring = strValueOf.substring(strValueOf.length() - 5, strValueOf.length());
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Intrinsics.checkNotNull(ownerDetailPuccPermit);
                    NomineeMainViewScreen.this.g2(VContant.INSTANCE.c(ownerDetailPuccPermit.copy(((-32769) & 1) != 0 ? ownerDetailPuccPermit.aadhar_no : null, ((-32769) & 2) != 0 ? ownerDetailPuccPermit.ac_fitted : null, ((-32769) & 4) != 0 ? ownerDetailPuccPermit.annual_income : null, ((-32769) & 8) != 0 ? ownerDetailPuccPermit.appl_no : null, ((-32769) & 16) != 0 ? ownerDetailPuccPermit.audio_fitted : null, ((-32769) & 32) != 0 ? ownerDetailPuccPermit.body_type : null, ((-32769) & 64) != 0 ? ownerDetailPuccPermit.c_add1 : null, ((-32769) & 128) != 0 ? ownerDetailPuccPermit.c_add2 : null, ((-32769) & 256) != 0 ? ownerDetailPuccPermit.c_add3 : null, ((-32769) & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.c_district : null, ((-32769) & 1024) != 0 ? ownerDetailPuccPermit.c_district_name : null, ((-32769) & 2048) != 0 ? ownerDetailPuccPermit.c_off_cd : null, ((-32769) & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.c_pincode : null, ((-32769) & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.c_state : null, ((-32769) & 16384) != 0 ? ownerDetailPuccPermit.c_state_name : null, ((-32769) & 32768) != 0 ? ownerDetailPuccPermit.chasi_no : strSubstring, ((-32769) & 65536) != 0 ? ownerDetailPuccPermit.chasi_no_original : null, ((-32769) & 131072) != 0 ? ownerDetailPuccPermit.color : null, ((-32769) & 262144) != 0 ? ownerDetailPuccPermit.conditionstatus : null, ((-32769) & 524288) != 0 ? ownerDetailPuccPermit.cubic_cap : null, ((-32769) & 1048576) != 0 ? ownerDetailPuccPermit.dealer_cd : null, ((-32769) & 2097152) != 0 ? ownerDetailPuccPermit.dept_cd : null, ((-32769) & 4194304) != 0 ? ownerDetailPuccPermit.dlRequired : null, ((-32769) & 8388608) != 0 ? ownerDetailPuccPermit.dlValidationRequired : null, ((-32769) & 16777216) != 0 ? ownerDetailPuccPermit.dl_no : null, ((-32769) & 33554432) != 0 ? ownerDetailPuccPermit.dlr_add1 : null, ((-32769) & 67108864) != 0 ? ownerDetailPuccPermit.dlr_add2 : null, ((-32769) & 134217728) != 0 ? ownerDetailPuccPermit.dlr_add3 : null, ((-32769) & 268435456) != 0 ? ownerDetailPuccPermit.dlr_city : null, ((-32769) & 536870912) != 0 ? ownerDetailPuccPermit.dlr_district : null, ((-32769) & 1073741824) != 0 ? ownerDetailPuccPermit.dlr_name : null, ((-32769) & IntCompanionObject.MIN_VALUE) != 0 ? ownerDetailPuccPermit.dlr_pincode : null, ((-1) & 1) != 0 ? ownerDetailPuccPermit.email_id : null, ((-1) & 2) != 0 ? ownerDetailPuccPermit.eng_no : null, ((-1) & 4) != 0 ? ownerDetailPuccPermit.eng_no_original : null, ((-1) & 8) != 0 ? ownerDetailPuccPermit.eng_no_orignal : null, ((-1) & 16) != 0 ? ownerDetailPuccPermit.f_name : null, ((-1) & 32) != 0 ? ownerDetailPuccPermit.fit_upto : null, ((-1) & 64) != 0 ? ownerDetailPuccPermit.fit_uptoAsDate : null, ((-1) & 128) != 0 ? ownerDetailPuccPermit.fit_upto_desc : null, ((-1) & 256) != 0 ? ownerDetailPuccPermit.flag : null, ((-1) & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.floor_area : null, ((-1) & 1024) != 0 ? ownerDetailPuccPermit.formatRegn_dt : null, ((-1) & 2048) != 0 ? ownerDetailPuccPermit.fuel : null, ((-1) & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.fuel_descr : null, ((-1) & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.garage_add : null, ((-1) & 16384) != 0 ? ownerDetailPuccPermit.gcw : null, ((-1) & 32768) != 0 ? ownerDetailPuccPermit.height : null, ((-1) & 65536) != 0 ? ownerDetailPuccPermit.hp : null, ((-1) & 131072) != 0 ? ownerDetailPuccPermit.imported_vch : null, ((-1) & 262144) != 0 ? ownerDetailPuccPermit.laser_code : null, ((-1) & 524288) != 0 ? ownerDetailPuccPermit.ld_wt : null, ((-1) & 1048576) != 0 ? ownerDetailPuccPermit.length : null, ((-1) & 2097152) != 0 ? ownerDetailPuccPermit.maker : null, ((-1) & 4194304) != 0 ? ownerDetailPuccPermit.maker_name : null, ((-1) & 8388608) != 0 ? ownerDetailPuccPermit.manu_mon : null, ((-1) & 16777216) != 0 ? ownerDetailPuccPermit.manu_yr : null, ((-1) & 33554432) != 0 ? ownerDetailPuccPermit.mobileNoEditable : null, ((-1) & 67108864) != 0 ? ownerDetailPuccPermit.mobile_no : null, ((-1) & 134217728) != 0 ? ownerDetailPuccPermit.model_cd : null, ((-1) & 268435456) != 0 ? ownerDetailPuccPermit.model_name : null, ((-1) & 536870912) != 0 ? ownerDetailPuccPermit.no_cyl : null, ((-1) & 1073741824) != 0 ? ownerDetailPuccPermit.no_of_axles : null, ((-1) & IntCompanionObject.MIN_VALUE) != 0 ? ownerDetailPuccPermit.norms : null, ((-1) & 1) != 0 ? ownerDetailPuccPermit.norms_descr : null, ((-1) & 2) != 0 ? ownerDetailPuccPermit.numberOfTyres : null, ((-1) & 4) != 0 ? ownerDetailPuccPermit.off_cd : null, ((-1) & 8) != 0 ? ownerDetailPuccPermit.off_name : null, ((-1) & 16) != 0 ? ownerDetailPuccPermit.op_dt : null, ((-1) & 32) != 0 ? ownerDetailPuccPermit.other_criteria : null, ((-1) & 64) != 0 ? ownerDetailPuccPermit.ownerCatg : null, ((-1) & 128) != 0 ? ownerDetailPuccPermit.ownerIdentification : null, ((-1) & 256) != 0 ? ownerDetailPuccPermit.owner_cd : null, ((-1) & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.owner_cd_descr : null, ((-1) & 1024) != 0 ? ownerDetailPuccPermit.owner_ctg : null, ((-1) & 2048) != 0 ? ownerDetailPuccPermit.owner_name : null, ((-1) & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.owner_sr : null, ((-1) & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.p_add1 : null, ((-1) & 16384) != 0 ? ownerDetailPuccPermit.p_add2 : null, ((-1) & 32768) != 0 ? ownerDetailPuccPermit.p_add3 : null, ((-1) & 65536) != 0 ? ownerDetailPuccPermit.p_district : null, ((-1) & 131072) != 0 ? ownerDetailPuccPermit.p_district_name : null, ((-1) & 262144) != 0 ? ownerDetailPuccPermit.p_pincode : null, ((-1) & 524288) != 0 ? ownerDetailPuccPermit.p_state : null, ((-1) & 1048576) != 0 ? ownerDetailPuccPermit.p_state_name : null, ((-1) & 2097152) != 0 ? ownerDetailPuccPermit.pan_no : null, ((-1) & 4194304) != 0 ? ownerDetailPuccPermit.passport_no : null, ((-1) & 8388608) != 0 ? ownerDetailPuccPermit.permitDetailEntity : null, ((-1) & 16777216) != 0 ? ownerDetailPuccPermit.permit_rto_cd : null, ((-1) & 33554432) != 0 ? ownerDetailPuccPermit.purchase_date : null, ((-1) & 67108864) != 0 ? ownerDetailPuccPermit.purchase_dt : null, ((-1) & 134217728) != 0 ? ownerDetailPuccPermit.ration_card_no : null, ((-1) & 268435456) != 0 ? ownerDetailPuccPermit.regn_dt : null, ((-1) & 536870912) != 0 ? ownerDetailPuccPermit.regn_dtAsDate : null, ((-1) & 1073741824) != 0 ? ownerDetailPuccPermit.regn_no : null, ((-1) & IntCompanionObject.MIN_VALUE) != 0 ? ownerDetailPuccPermit.regn_type : null, (IntCompanionObject.MAX_VALUE & 1) != 0 ? ownerDetailPuccPermit.regn_type_descr : null, (IntCompanionObject.MAX_VALUE & 2) != 0 ? ownerDetailPuccPermit.regn_upto : null, (IntCompanionObject.MAX_VALUE & 4) != 0 ? ownerDetailPuccPermit.regn_uptoAsDate : null, (IntCompanionObject.MAX_VALUE & 8) != 0 ? ownerDetailPuccPermit.returnMessge : null, (IntCompanionObject.MAX_VALUE & 16) != 0 ? ownerDetailPuccPermit.sale_amt : null, (IntCompanionObject.MAX_VALUE & 32) != 0 ? ownerDetailPuccPermit.seat_cap : null, (IntCompanionObject.MAX_VALUE & 64) != 0 ? ownerDetailPuccPermit.sleeper_cap : null, (IntCompanionObject.MAX_VALUE & 128) != 0 ? ownerDetailPuccPermit.stand_cap : null, (IntCompanionObject.MAX_VALUE & 256) != 0 ? ownerDetailPuccPermit.state_cd : null, (IntCompanionObject.MAX_VALUE & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.state_name : null, (IntCompanionObject.MAX_VALUE & 1024) != 0 ? ownerDetailPuccPermit.status : null, (IntCompanionObject.MAX_VALUE & 2048) != 0 ? ownerDetailPuccPermit.tax_mode : null, (IntCompanionObject.MAX_VALUE & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ownerDetailPuccPermit.transport_catg : null, (IntCompanionObject.MAX_VALUE & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ownerDetailPuccPermit.unld_wt : null, (IntCompanionObject.MAX_VALUE & 16384) != 0 ? ownerDetailPuccPermit.vch_catg : null, (IntCompanionObject.MAX_VALUE & 32768) != 0 ? ownerDetailPuccPermit.vch_catg_desc : null, (IntCompanionObject.MAX_VALUE & 65536) != 0 ? ownerDetailPuccPermit.vch_purchase_as : null, (IntCompanionObject.MAX_VALUE & 131072) != 0 ? ownerDetailPuccPermit.vch_purchase_asCode : null, (IntCompanionObject.MAX_VALUE & 262144) != 0 ? ownerDetailPuccPermit.vehType : null, (IntCompanionObject.MAX_VALUE & 524288) != 0 ? ownerDetailPuccPermit.vehTypeAsInt : null, (IntCompanionObject.MAX_VALUE & 1048576) != 0 ? ownerDetailPuccPermit.vh_class : null, (IntCompanionObject.MAX_VALUE & 2097152) != 0 ? ownerDetailPuccPermit.vh_class_desc : null, (IntCompanionObject.MAX_VALUE & 4194304) != 0 ? ownerDetailPuccPermit.video_fitted : null, (IntCompanionObject.MAX_VALUE & 8388608) != 0 ? ownerDetailPuccPermit.voter_id : null, (IntCompanionObject.MAX_VALUE & 16777216) != 0 ? ownerDetailPuccPermit.vtInsuranceCommonDto : null, (IntCompanionObject.MAX_VALUE & 33554432) != 0 ? ownerDetailPuccPermit.vtpucc : null, (IntCompanionObject.MAX_VALUE & 67108864) != 0 ? ownerDetailPuccPermit.wheelbase : null, (IntCompanionObject.MAX_VALUE & 134217728) != 0 ? ownerDetailPuccPermit.width : null, (IntCompanionObject.MAX_VALUE & 268435456) != 0 ? ownerDetailPuccPermit.vTHypthEntity : null, (IntCompanionObject.MAX_VALUE & 536870912) != 0 ? ownerDetailPuccPermit.latesttaxdetails : null, (IntCompanionObject.MAX_VALUE & 1073741824) != 0 ? ownerDetailPuccPermit.permitDetailDto : null)));
                    String state_name = ownerDetailPuccPermit.getState_name();
                    if (state_name == null || state_name.length() == 0) {
                        NomineeMainViewScreen.this.h2(String.valueOf(ownerDetailPuccPermit.getOff_cd()));
                    } else {
                        NomineeMainViewScreen.this.h2(String.valueOf(ownerDetailPuccPermit.getOff_cd()));
                        NomineeMainViewScreen.this.f2(String.valueOf(ownerDetailPuccPermit.getMobile_no()));
                    }
                    NomineeMainViewScreen.this.getRcArrayList().add(String.valueOf(NomineeMainViewScreen.this.D1().getRc_regn_no()));
                    NomineeMainViewScreen.this.getRcArrayList().add(String.valueOf(NomineeMainViewScreen.this.D1().getRc_chasi_no()));
                    NomineeMainViewScreen.this.getRcArrayList().add(String.valueOf(NomineeMainViewScreen.this.D1().getRc_eng_no()));
                    NomineeMainViewScreen.this.getRcArrayList().add(String.valueOf(NomineeMainViewScreen.this.D1().getRc_regn_dt()));
                    NomineeMainViewScreen.this.getRcArrayList().add(String.valueOf(NomineeMainViewScreen.this.D1().getRc_fit_upto()));
                    VUtility.Companion companion = VUtility.INSTANCE;
                    if (!companion.y0(NomineeMainViewScreen.this.getRcArrayList(), String.valueOf(NomineeMainViewScreen.this.B1().h.getText()))) {
                        NomineeMainViewScreen.this.E1().dismiss();
                        NomineeMainViewScreen nomineeMainViewScreen = NomineeMainViewScreen.this;
                        Toast.makeText(nomineeMainViewScreen, nomineeMainViewScreen.C1().b("please_enter_valid_reg", NomineeMainViewScreen.this.getString(R.string.please_enter_valid_reg)), 1).show();
                        return;
                    }
                    if (!companion.y0(NomineeMainViewScreen.this.getRcArrayList(), String.valueOf(NomineeMainViewScreen.this.B1().c.getText()))) {
                        NomineeMainViewScreen.this.E1().dismiss();
                        NomineeMainViewScreen nomineeMainViewScreen2 = NomineeMainViewScreen.this;
                        Toast.makeText(nomineeMainViewScreen2, nomineeMainViewScreen2.C1().b("please_enter_valid_chaissis_no", NomineeMainViewScreen.this.getString(R.string.please_enter_valid_chaissis_no)), 1).show();
                        return;
                    }
                    if (!companion.y0(NomineeMainViewScreen.this.getRcArrayList(), String.valueOf(NomineeMainViewScreen.this.B1().e.getText()))) {
                        NomineeMainViewScreen.this.E1().dismiss();
                        NomineeMainViewScreen nomineeMainViewScreen3 = NomineeMainViewScreen.this;
                        Toast.makeText(nomineeMainViewScreen3, nomineeMainViewScreen3.C1().b("please_enter_valid_engine_no", NomineeMainViewScreen.this.getString(R.string.please_enter_valid_engine_no)), 1).show();
                        return;
                    } else if (!companion.y0(NomineeMainViewScreen.this.getRcArrayList(), NomineeMainViewScreen.this.getRegistrationDateEtString())) {
                        NomineeMainViewScreen.this.E1().dismiss();
                        NomineeMainViewScreen nomineeMainViewScreen4 = NomineeMainViewScreen.this;
                        Toast.makeText(nomineeMainViewScreen4, nomineeMainViewScreen4.C1().b("please_enter_valid_reg_date", NomineeMainViewScreen.this.getString(R.string.please_enter_valid_reg_date)), 1).show();
                        return;
                    } else if (companion.y0(NomineeMainViewScreen.this.getRcArrayList(), NomineeMainViewScreen.this.getRegistrationUptoEtString())) {
                        ld7 ld7VarO1 = NomineeMainViewScreen.this.O1();
                        NomineeMainViewScreen nomineeMainViewScreen5 = NomineeMainViewScreen.this;
                        ld7VarO1.i(nomineeMainViewScreen5, String.valueOf(nomineeMainViewScreen5.D1().getState_cd()));
                        return;
                    } else {
                        NomineeMainViewScreen.this.E1().dismiss();
                        NomineeMainViewScreen nomineeMainViewScreen6 = NomineeMainViewScreen.this;
                        Toast.makeText(nomineeMainViewScreen6, nomineeMainViewScreen6.C1().b("please_enter_valid_reg_upto_date", NomineeMainViewScreen.this.getString(R.string.please_enter_valid_reg_upto_date)), 1).show();
                        return;
                    }
                }
                NomineeMainViewScreen.this.E1().dismiss();
                NomineeMainViewScreen nomineeMainViewScreen7 = NomineeMainViewScreen.this;
                nomineeMainViewScreen7.v1(nomineeMainViewScreen7, String.valueOf(nomineeMainViewScreen7.C1().b("no_details_found", NomineeMainViewScreen.this.getString(R.string.no_details_found))));
            } catch (Exception e) {
                NomineeMainViewScreen.this.E1().dismiss();
                e.printStackTrace();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OwnerDetailPuccPermit) obj);
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
            NomineeMainViewScreen.this.E1().dismiss();
            NomineeMainViewScreen nomineeMainViewScreen = NomineeMainViewScreen.this;
            nomineeMainViewScreen.s2(nomineeMainViewScreen, nomineeMainViewScreen.C1().b("record_error_msg", NomineeMainViewScreen.this.getString(R.string.service_unavable_please_try)));
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

    public static final void P1(NomineeMainViewScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void Q1(NomineeMainViewScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.u2()) {
            this$0.rc_number = String.valueOf(this$0.B1().h.getText());
            this$0.E1().show();
            this$0.M1().o(this$0, String.valueOf(this$0.B1().h.getText()));
        }
    }

    public static final void R1(NomineeMainViewScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.W1();
    }

    public static final void S1(NomineeMainViewScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.Z1();
    }

    public static final void T1(NomineeMainViewScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.X1();
    }

    public static final void U1(NomineeMainViewScreen this$0, vahanOnlineCheck vahanonlinecheck) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.E1().dismiss();
            this$0.r2(vahanonlinecheck.getService_auth_mode().toString());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void V1(NomineeMainViewScreen this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.E1().dismiss();
        this$0.s2(this$0, this$0.C1().b("record_error_msg", this$0.getString(R.string.service_unavable_please_try)));
    }

    private final void W1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    private final void X1() {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.mb4
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i4, int i5, int i6) {
                NomineeMainViewScreen.Y1(objectRef, objectRef2, this, datePicker, i4, i5, i6);
            }
        }, i, i2, i3);
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-1).setTextColor(yy0.c(this, R.color.black));
        datePickerDialog.getButton(-2).setTextColor(yy0.c(this, R.color.red_new));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void Y1(Ref.ObjectRef dayStartString, Ref.ObjectRef dayStartMonth, NomineeMainViewScreen this$0, DatePicker datePicker, int i, int i2, int i3) {
        T tValueOf;
        T tValueOf2;
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(dayStartString, "$dayStartString");
        Intrinsics.checkNotNullParameter(dayStartMonth, "$dayStartMonth");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (String.valueOf(i3).length() < 2) {
            StringBuilder sb = new StringBuilder();
            sb.append('0');
            sb.append(i3);
            tValueOf = sb.toString();
        } else {
            tValueOf = String.valueOf(i3);
        }
        dayStartString.element = tValueOf;
        int i4 = i2 + 1;
        if (String.valueOf(i4).length() < 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('0');
            sb2.append(i4);
            tValueOf2 = sb2.toString();
        } else {
            tValueOf2 = String.valueOf(i4);
        }
        dayStartMonth.element = tValueOf2;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i);
        sb3.append('-');
        T t = dayStartMonth.element;
        String str4 = null;
        if (t == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dayStartMonth");
            str = null;
        } else {
            str = (String) t;
        }
        sb3.append(str);
        sb3.append('-');
        T t2 = dayStartString.element;
        if (t2 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dayStartString");
            str2 = null;
        } else {
            str2 = (String) t2;
        }
        sb3.append(str2);
        this$0.registrationDateEtString = sb3.toString();
        AppCompatTextView appCompatTextView = this$0.B1().i;
        StringBuilder sb4 = new StringBuilder();
        T t3 = dayStartString.element;
        if (t3 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dayStartString");
            str3 = null;
        } else {
            str3 = (String) t3;
        }
        sb4.append(str3);
        sb4.append('-');
        T t4 = dayStartMonth.element;
        if (t4 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dayStartMonth");
        } else {
            str4 = (String) t4;
        }
        sb4.append(str4);
        sb4.append('-');
        sb4.append(i);
        appCompatTextView.setText(sb4.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a2(Ref.ObjectRef dayStartString, Ref.ObjectRef dayStartMonth, NomineeMainViewScreen this$0, DatePicker datePicker, int i, int i2, int i3) {
        T tValueOf;
        T tValueOf2;
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(dayStartString, "$dayStartString");
        Intrinsics.checkNotNullParameter(dayStartMonth, "$dayStartMonth");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (String.valueOf(i3).length() < 2) {
            StringBuilder sb = new StringBuilder();
            sb.append('0');
            sb.append(i3);
            tValueOf = sb.toString();
        } else {
            tValueOf = String.valueOf(i3);
        }
        dayStartString.element = tValueOf;
        int i4 = i2 + 1;
        if (String.valueOf(i4).length() < 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('0');
            sb2.append(i4);
            tValueOf2 = sb2.toString();
        } else {
            tValueOf2 = String.valueOf(i4);
        }
        dayStartMonth.element = tValueOf2;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i);
        sb3.append('-');
        T t = dayStartMonth.element;
        String str4 = null;
        if (t == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dayStartMonth");
            str = null;
        } else {
            str = (String) t;
        }
        sb3.append(str);
        sb3.append('-');
        T t2 = dayStartString.element;
        if (t2 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dayStartString");
            str2 = null;
        } else {
            str2 = (String) t2;
        }
        sb3.append(str2);
        this$0.registrationUptoEtString = sb3.toString();
        AppCompatTextView appCompatTextView = this$0.B1().m;
        StringBuilder sb4 = new StringBuilder();
        T t3 = dayStartString.element;
        if (t3 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dayStartString");
            str3 = null;
        } else {
            str3 = (String) t3;
        }
        sb4.append(str3);
        sb4.append('-');
        T t4 = dayStartMonth.element;
        if (t4 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("dayStartMonth");
        } else {
            str4 = (String) t4;
        }
        sb4.append(str4);
        sb4.append('-');
        sb4.append(i);
        appCompatTextView.setText(sb4.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final boolean u2() {
        Editable text = B1().h.getText();
        if (text != null && text.length() == 0) {
            B1().h.setError(C1().b("PLEASE_ENTER_REG", getString(R.string.please_enter_reg_no)));
            B1().h.requestFocus();
            return false;
        }
        if (String.valueOf(B1().h.getText()).length() < 4) {
            B1().h.setError(C1().b("label_challan_rc_validation", "Please enter vehicle number.Minimum 4 & maximum 10 character with no special character"));
            B1().h.requestFocus();
            return false;
        }
        Editable text2 = B1().c.getText();
        if (text2 != null && text2.length() == 0) {
            B1().c.setError(C1().b("PLEASE_ENTER_CHASSI", getString(R.string.please_enter_chassis_no)));
            B1().c.requestFocus();
            return false;
        }
        if (String.valueOf(B1().c.getText()).length() < 5) {
            B1().c.setError(C1().b("INVALID_CHASSI", getString(R.string.invalid_chassis_no)));
            B1().c.requestFocus();
            return false;
        }
        Editable text3 = B1().e.getText();
        if (text3 != null && text3.length() == 0) {
            B1().e.setError(C1().b("label_challan_enter_engine_no", getString(R.string.invalid_chassis_no)));
            B1().e.requestFocus();
            return false;
        }
        if (String.valueOf(B1().e.getText()).length() < 5) {
            B1().e.setError(C1().b("INVALID_ENGINE", getString(R.string.invalid_engine_no)));
            B1().e.requestFocus();
            return false;
        }
        CharSequence text4 = B1().i.getText();
        if (text4 != null && text4.length() == 0) {
            B1().i.setError(C1().b("REG_DATE", getString(R.string.please_enter_reg_date)));
            B1().i.requestFocus();
            return false;
        }
        CharSequence text5 = B1().m.getText();
        if (text5 == null || text5.length() != 0) {
            return true;
        }
        B1().m.setError(C1().b("REG_UPTO", getString(R.string.please_enter_reg_upto)));
        B1().m.requestFocus();
        return false;
    }

    public static final void w1(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    public static final void y1(Dialog d2, Context context, String rc_number, NomineeMainViewScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(rc_number, "$rc_number");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        Intent intent = new Intent(context, (Class<?>) VahanProcessWithAdhar.class);
        intent.putExtra("RC", rc_number);
        intent.putExtra("map", this$0.serviceSelectionHashMap);
        intent.putExtra("RcDetails", this$0.D1());
        intent.putExtra("off_code", this$0.off_code);
        context.startActivity(intent);
        this$0.finish();
    }

    public static final void z1(Dialog d2, Context context, String rc_number, NomineeMainViewScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(rc_number, "$rc_number");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d2.dismiss();
        Intent intent = new Intent(context, (Class<?>) VahanGenerateOTPScreen.class);
        intent.putExtra("RC", rc_number);
        intent.putExtra("map", this$0.serviceSelectionHashMap);
        intent.putExtra("Mobile_no", this$0.mobile_number);
        intent.putExtra("RcDetails", this$0.D1());
        intent.putExtra("off_code", this$0.off_code);
        context.startActivity(intent);
        this$0.finish();
    }

    public final String A1(HashMap serviceSelection_HashMap) {
        Intrinsics.checkNotNullParameter(serviceSelection_HashMap, "serviceSelection_HashMap");
        return serviceSelection_HashMap.containsKey(VContant.DUPLICATE_RC) ? "3" : serviceSelection_HashMap.containsKey(VContant.TRANFER_OF_OWNERSHIP) ? "500" : serviceSelection_HashMap.containsKey(VContant.CHANGE_OF_ADDRESS) ? "4" : serviceSelection_HashMap.containsKey(VContant.HYPOTHICATION_TERMINATION) ? VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE : serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_CONTINUATION) ? VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE : serviceSelection_HashMap.containsKey(VContant.HYPOTHECATION_ADDITION) ? VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE : serviceSelection_HashMap.containsKey(VContant.RCPARTICULAR) ? VContant.RCPARTICULAR_PURPOSE_CODE : (serviceSelection_HashMap.containsKey(VContant.NOC) || serviceSelection_HashMap.containsKey(VContant.NOC)) ? VContant.NOC_PURPOSE_CODE : serviceSelection_HashMap.containsKey(VContant.DUPLICATE_FITNESS) ? VContant.DUPLICATE_FITNESS_PURPOSE_CODE : serviceSelection_HashMap.containsKey(VContant.RC_CANCALATION) ? VContant.RC_CACELLATION_PURPOSE_CODE : serviceSelection_HashMap.containsKey(VContant.RC_SURRENDER) ? VContant.RC_SURRENDER_PURPOSE_CODE : serviceSelection_HashMap.containsKey(VContant.TRANFER_OF_OWNERSHIP) ? VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE : serviceSelection_HashMap.containsKey(VContant.PERMIT_RENEWAL) ? VContant.RC_PERMIT_RENEWAL_PURPOSE_CODE : "500";
    }

    public final yb4 B1() {
        yb4 yb4Var = this.binding;
        if (yb4Var != null) {
            return yb4Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final wa3 C1() {
        wa3 wa3Var = this.languageSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("languageSession");
        return null;
    }

    public final NrvDetails D1() {
        NrvDetails nrvDetails = this.nrvDetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nrvDetails");
        return null;
    }

    public final ProgressDialog E1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    /* JADX INFO: renamed from: F1, reason: from getter */
    public final ArrayList getRcArrayList() {
        return this.rcArrayList;
    }

    /* JADX INFO: renamed from: G1, reason: from getter */
    public final String getRegistrationDateEtString() {
        return this.registrationDateEtString;
    }

    /* JADX INFO: renamed from: H1, reason: from getter */
    public final String getRegistrationUptoEtString() {
        return this.registrationUptoEtString;
    }

    public final VahanServiceConnection I1() {
        VahanServiceConnection vahanServiceConnection = this.retrofitService;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitService");
        return null;
    }

    public final VahanProService J1() {
        VahanProService vahanProService = this.retrofitServiceAddMob;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retrofitServiceAddMob");
        return null;
    }

    public final vh7 K1() {
        vh7 vh7Var = this.session;
        if (vh7Var != null) {
            return vh7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final VahanProService L1() {
        VahanProService vahanProService = this.vahanService;
        if (vahanProService != null) {
            return vahanProService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vahanService");
        return null;
    }

    public final ld7 M1() {
        ld7 ld7Var = this.vahanViewModle;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vahanViewModle");
        return null;
    }

    public final al7 N1() {
        al7 al7Var = this.viewModel;
        if (al7Var != null) {
            return al7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    public final ld7 O1() {
        ld7 ld7Var = this.viewModelAddMob;
        if (ld7Var != null) {
            return ld7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelAddMob");
        return null;
    }

    public final void Z1() {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.nb4
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i4, int i5, int i6) {
                NomineeMainViewScreen.a2(objectRef, objectRef2, this, datePicker, i4, i5, i6);
            }
        }, i, i2, i3);
        datePickerDialog.show();
        datePickerDialog.getButton(-1).setTextColor(yy0.c(this, R.color.black));
        datePickerDialog.getButton(-2).setTextColor(yy0.c(this, R.color.red_new));
    }

    public final void b2(yb4 yb4Var) {
        Intrinsics.checkNotNullParameter(yb4Var, "<set-?>");
        this.binding = yb4Var;
    }

    public final void c2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clickvalue = str;
    }

    public final void d2(DatabaseHelper databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "<set-?>");
        this.databaseHelper = databaseHelper;
    }

    @Override // com.zepto.sg4
    public void e0(String rc_num, int position, String chassiNo) {
        if (rc_num != null) {
            c2("rcnumber");
            this.rc_adapter_val = rc_num;
            E1().show();
            M1().o(this, rc_num);
        }
    }

    public final void e2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.languageSession = wa3Var;
    }

    public final void f2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobile_number = str;
    }

    public final void g2(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.nrvDetails = nrvDetails;
    }

    public final void h2(String str) {
        this.off_code = str;
    }

    public final void i2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void j2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void k2(VahanServiceConnection vahanServiceConnection) {
        Intrinsics.checkNotNullParameter(vahanServiceConnection, "<set-?>");
        this.retrofitService = vahanServiceConnection;
    }

    public final void l2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.retrofitServiceAddMob = vahanProService;
    }

    public final void m2(vh7 vh7Var) {
        Intrinsics.checkNotNullParameter(vh7Var, "<set-?>");
        this.session = vh7Var;
    }

    public final void n2(VahanProService vahanProService) {
        Intrinsics.checkNotNullParameter(vahanProService, "<set-?>");
        this.vahanService = vahanProService;
    }

    public final void o2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.vahanViewModle = ld7Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nomines_layout);
        yb4 yb4VarC = yb4.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(yb4VarC, "inflate(...)");
        b2(yb4VarC);
        setContentView(B1().b());
        ta3.a.B1(this, B1());
        getWindow().addFlags(128);
        e2(new wa3(this));
        if (getIntent() != null) {
            this.state_intent = String.valueOf(getIntent().getStringExtra("state_code"));
        }
        VahanProService.Companion companion = VahanProService.INSTANCE;
        n2(companion.a(this));
        l2(companion.a(this));
        k2(VahanServiceConnection.INSTANCE.a(this));
        q2((ld7) new z(this, new kd7(new jd7(J1()))).a(ld7.class));
        p2((al7) new z(this, new bl7(new bg7(I1()))).a(al7.class));
        o2((ld7) new z(this, new kd7(new jd7(L1()))).a(ld7.class));
        wa3 wa3Var = new wa3(this);
        i2(new ProgressDialog(this));
        E1().setMessage(wa3Var.b("label_challan_please_wait", "Please wait..."));
        E1().setCancelable(false);
        E1().setCanceledOnTouchOutside(false);
        m2(new vh7(this));
        B1().n.i.setText(VContant.INSTANCE.n(this, K1()));
        DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(this);
        Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
        d2(databaseHelperD0);
        try {
            if (StringsKt__StringsJVMKt.equals(K1().c(), VContant.COMPOUND_FEE_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.COMPOUND_FEE, VContant.COMPOUND_FEE_CODE);
            }
            if (StringsKt__StringsJVMKt.equals(K1().c(), VContant.Nominee_CODE, true)) {
                this.serviceSelectionHashMap.put(VContant.Nominee_Addition, VContant.Nominee_CODE);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        B1().n.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kb4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NomineeMainViewScreen.P1(this.a, view);
            }
        });
        B1().g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ob4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NomineeMainViewScreen.Q1(this.a, view);
            }
        });
        B1().n.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pb4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NomineeMainViewScreen.R1(this.a, view);
            }
        });
        M1().j0().g(this, new f(new b()));
        M1().k0().g(this, new f(new c()));
        B1().m.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qb4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NomineeMainViewScreen.S1(this.a, view);
            }
        });
        B1().i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rb4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NomineeMainViewScreen.T1(this.a, view);
            }
        });
        M1().I0().g(this, new f(new d()));
        M1().H0().g(this, new f(new e()));
        N1().g().g(this, new f(new a()));
        O1().c1().g(this, new mf4() { // from class: com.zepto.sb4
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                NomineeMainViewScreen.U1(this.a, (vahanOnlineCheck) obj);
            }
        });
        O1().d1().g(this, new mf4() { // from class: com.zepto.tb4
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                NomineeMainViewScreen.V1(this.a, (String) obj);
            }
        });
    }

    @Override // com.zepto.yf2, android.app.Activity
    public void onResume() {
        super.onResume();
        try {
            NaxpToKenService.INSTANCE.a(this);
        } catch (Exception unused) {
        }
    }

    public final void p2(al7 al7Var) {
        Intrinsics.checkNotNullParameter(al7Var, "<set-?>");
        this.viewModel = al7Var;
    }

    public final void q2(ld7 ld7Var) {
        Intrinsics.checkNotNullParameter(ld7Var, "<set-?>");
        this.viewModelAddMob = ld7Var;
    }

    public final void r2(String check_string) {
        String string;
        String string2;
        ArrayList arrayList;
        Class<VahanGenerateOTPScreen> cls = VahanGenerateOTPScreen.class;
        String str = "";
        Intrinsics.checkNotNullParameter(check_string, "check_string");
        try {
            string = StringsKt__StringsKt.trim((CharSequence) StringsKt__StringsJVMKt.replace$default(check_string, Typography.less, ' ', false, 4, (Object) null)).toString();
            string2 = StringsKt__StringsKt.trim((CharSequence) StringsKt__StringsJVMKt.replace$default(string, Typography.greater, ' ', false, 4, (Object) null)).toString();
            try {
                List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) string2, new String[]{"&"}, false, 0, 6, (Object) null);
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default, 10));
                Iterator it = listSplit$default.iterator();
                while (it.hasNext()) {
                    arrayList.add(StringsKt__StringsKt.trim((CharSequence) it.next()).toString());
                }
                try {
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Exception e4) {
            e = e4;
            str = "Mobile_no";
        }
        if (arrayList.size() > 1) {
            String string3 = StringsKt__StringsKt.trim((CharSequence) arrayList.get(0)).toString();
            String string4 = StringsKt__StringsKt.trim((CharSequence) arrayList.get(1)).toString();
            Log.e("Step1", string.toString());
            Log.e("Step2", string2.toString());
            Log.e("step41", string3);
            Log.e("step42", string4);
            String string5 = StringsKt__StringsKt.trim((CharSequence) new Regex("\\s").replace(StringsKt__StringsJVMKt.replace$default(string3, '(', ' ', false, 4, (Object) null), "")).toString();
            String string6 = StringsKt__StringsKt.trim((CharSequence) new Regex("\\s").replace(StringsKt__StringsJVMKt.replace$default(string5, ')', ' ', false, 4, (Object) null), "")).toString();
            String string7 = StringsKt__StringsKt.trim((CharSequence) new Regex("\\s").replace(StringsKt__StringsJVMKt.replace$default(string4, '(', ' ', false, 4, (Object) null), "")).toString();
            String string8 = StringsKt__StringsKt.trim((CharSequence) new Regex("\\s").replace(StringsKt__StringsJVMKt.replace$default(string7, ')', ' ', false, 4, (Object) null), "")).toString();
            List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) string6, new String[]{","}, false, 0, 6, (Object) null);
            try {
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default2, 10));
                Iterator it2 = listSplit$default2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(StringsKt__StringsKt.trim((CharSequence) it2.next()).toString());
                }
                List listSplit$default3 = StringsKt__StringsKt.split$default((CharSequence) string8, new String[]{","}, false, 0, 6, (Object) null);
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default3, 10));
                Iterator it3 = listSplit$default3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(StringsKt__StringsKt.trim((CharSequence) it3.next()).toString());
                }
                Log.e("step43", string5);
                Log.e("step5", string6);
                Log.e("stepM4", string7);
                Log.e("stepM5", string8);
                if (arrayList2.contains("0") && arrayList3.contains("0")) {
                    Log.e("condition--> ", "condition-->1");
                    x1(this, this.rc_number);
                    return;
                }
                if (arrayList2.contains(StringsKt__StringsKt.trim((CharSequence) A1(this.serviceSelectionHashMap)).toString()) && arrayList3.contains(StringsKt__StringsKt.trim((CharSequence) A1(this.serviceSelectionHashMap)).toString())) {
                    Log.e("condition--> ", "condition-->2");
                    x1(this, this.rc_number);
                    return;
                }
                if (arrayList2.contains("0") && arrayList3.contains(StringsKt__StringsKt.trim((CharSequence) A1(this.serviceSelectionHashMap)).toString())) {
                    Log.e("condition--> ", "condition-->3");
                    x1(this, this.rc_number);
                    return;
                }
                if (arrayList2.contains(StringsKt__StringsKt.trim((CharSequence) A1(this.serviceSelectionHashMap)).toString()) && arrayList3.contains("0")) {
                    Log.e("condition--> ", "condition-->4");
                    x1(this, this.rc_number);
                    return;
                }
                if (arrayList2.contains("0") && !arrayList3.contains(StringsKt__StringsKt.trim((CharSequence) A1(this.serviceSelectionHashMap)).toString())) {
                    Log.e("condition--> ", "condition-->5");
                    Intent intent = new Intent(this, (Class<?>) VahanProcessWithAdhar.class);
                    intent.putExtra("RC", this.rc_number);
                    intent.putExtra("map", this.serviceSelectionHashMap);
                    intent.putExtra("RcDetails", D1());
                    intent.putExtra("off_code", this.off_code);
                    startActivity(intent);
                    return;
                }
                if (arrayList2.contains(StringsKt__StringsKt.trim((CharSequence) A1(this.serviceSelectionHashMap)).toString()) || !arrayList3.contains("0")) {
                    cls = cls;
                    str = "Mobile_no";
                    Log.e("condition--> ", "condition-->7");
                    s2(this, C1().b("record_error_msg", getString(R.string.service_unavable_please_try)));
                } else {
                    Log.e("condition--> ", "condition-->6");
                    cls = cls;
                    Intent intent2 = new Intent(this, cls);
                    intent2.putExtra("RC", this.rc_number);
                    intent2.putExtra("map", this.serviceSelectionHashMap);
                    str = "Mobile_no";
                    intent2.putExtra(str, this.mobile_number);
                    intent2.putExtra("RcDetails", D1());
                    intent2.putExtra("off_code", this.off_code);
                    startActivity(intent2);
                }
            } catch (Exception e5) {
                e = e5;
                cls = cls;
            }
            str = "Mobile_no";
            e.printStackTrace();
            e.printStackTrace();
            Log.e("Error", Unit.INSTANCE.toString());
            Intent intent3 = new Intent(this, cls);
            intent3.putExtra("RC", this.rc_number);
            intent3.putExtra("map", this.serviceSelectionHashMap);
            intent3.putExtra(str, this.mobile_number);
            intent3.putExtra("RcDetails", D1());
            intent3.putExtra("off_code", this.off_code);
            startActivity(intent3);
            return;
        }
        str = "Mobile_no";
        if (StringsKt__StringsKt.contains$default((CharSequence) string2.toString(), (CharSequence) "A", false, 2, (Object) null)) {
            Intent intent4 = new Intent(this, (Class<?>) VahanProcessWithAdhar.class);
            intent4.putExtra("RC", this.rc_number);
            intent4.putExtra("map", this.serviceSelectionHashMap);
            intent4.putExtra("RcDetails", D1());
            intent4.putExtra("off_code", this.off_code);
            startActivity(intent4);
        } else {
            Intent intent5 = new Intent(this, cls);
            intent5.putExtra("RC", this.rc_number);
            intent5.putExtra("map", this.serviceSelectionHashMap);
            intent5.putExtra(str, this.mobile_number);
            intent5.putExtra("RcDetails", D1());
            intent5.putExtra("off_code", this.off_code);
            startActivity(intent5);
        }
    }

    public final void s2(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
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
        ((TextView) viewFindViewById).setText(message);
        wa3 wa3Var = new wa3(context);
        ((TextView) viewFindViewById3).setText(wa3Var.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(wa3Var.b("btn_ok", context.getString(R.string.ok_txt)));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wb4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NomineeMainViewScreen.t2(dialog, view);
            }
        });
        dialog.show();
    }

    public final void v1(Context context, String title) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.mvvm_number_dialog);
        View viewFindViewById = dialog.findViewById(R.id.txt_dialog);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(title);
        View viewFindViewById2 = dialog.findViewById(R.id.ok);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        textView.setText(new wa3(context).b("btn_ok", context.getString(R.string.ok_txt)));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lb4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NomineeMainViewScreen.w1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void x1(final Context context, final String rc_number) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rc_number, "rc_number");
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.vahan_process_diloge);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.process_with_Adhar);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = dialog.findViewById(R.id.process_with_mobile);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById2;
        wa3 wa3Var = new wa3(this);
        textView.setText(wa3Var.b("proceed_with_adhar", "Proceed with Aadhaar/VID"));
        textView2.setText(wa3Var.b("proceed_with_mobile", "Proceed with Mobile No."));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ub4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NomineeMainViewScreen.y1(dialog, context, rc_number, this, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.vb4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NomineeMainViewScreen.z1(dialog, context, rc_number, this, view);
            }
        });
        dialog.show();
    }
}
