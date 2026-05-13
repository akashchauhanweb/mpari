package com.nic.mparivahan.Dashboard.ui;

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
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dashboard.ui.VirtualDocScreen;
import com.nic.mparivahan.Dl.DLVirtualRcScreen;
import com.nic.mparivahan.Dl.DlInterface.DlService;
import com.nic.mparivahan.Dl.Model.DLDocument;
import com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.Dl.Model.UpdateDocSuccessResponse;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.GetSharedRecivedDoc;
import com.nic.mparivahan.RC.Model.MyRcDeletResponse;
import com.nic.mparivahan.RC.Model.RcModelsDet;
import com.nic.mparivahan.RC.Model.ReceivedDoc;
import com.nic.mparivahan.RC.Model.SharedDoc;
import com.nic.mparivahan.RC.Model.SharedRcDeletResponse;
import com.nic.mparivahan.RC.RcInterface.RcService;
import com.zepto.a55;
import com.zepto.b55;
import com.zepto.gd1;
import com.zepto.hz0;
import com.zepto.is1;
import com.zepto.jp1;
import com.zepto.js1;
import com.zepto.k18;
import com.zepto.kt7;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.r04;
import com.zepto.s45;
import com.zepto.ta3;
import com.zepto.u55;
import com.zepto.uh1;
import com.zepto.va3;
import com.zepto.vh1;
import com.zepto.wa3;
import com.zepto.ws6;
import com.zepto.y04;
import com.zepto.y25;
import com.zepto.yy0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
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
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\t¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0015J\u001a\u0010\r\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0007J\u0018\u0010\u0019\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0018\u001a\u00020\u000bR\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R2\u0010K\u001a\u0012\u0012\u0004\u0012\u00020C0Bj\b\u0012\u0004\u0012\u00020C`D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010S\u001a\u00020L8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010[\u001a\u00020T8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010c\u001a\u00020\\8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010k\u001a\u00020d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010M\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010t\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010M\u001a\u0004\br\u0010n\"\u0004\bs\u0010pR\"\u0010|\u001a\u00020u8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R&\u0010\u0083\u0001\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R)\u0010\u008a\u0001\u001a\u00030\u0084\u00018\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0005\b\u0011\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R*\u0010\u0092\u0001\u001a\u00030\u008b\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0017\u0010\u0093\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010~R*\u0010\u009b\u0001\u001a\u00030\u0094\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001¨\u0006\u009e\u0001"}, d2 = {"Lcom/nic/mparivahan/Dashboard/ui/VirtualDocScreen;", "Lcom/zepto/pq;", "Lcom/zepto/vh1;", "Lcom/zepto/uh1;", "Lcom/zepto/u55;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/content/Context;", "context", "", "message", "s2", "shared_id", "", "position", "Q", "rc_number", "p", "rc", "S", "c0", "f2", "dl_number", "X1", "Lcom/zepto/a55;", "C", "Lcom/zepto/a55;", "E1", "()Lcom/zepto/a55;", "k2", "(Lcom/zepto/a55;)V", "mRcViewModel", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "D", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "D1", "()Lcom/nic/mparivahan/RC/RcInterface/RcService;", "j2", "(Lcom/nic/mparivahan/RC/RcInterface/RcService;)V", "mRcService", "Lcom/zepto/is1;", "E", "Lcom/zepto/is1;", "C1", "()Lcom/zepto/is1;", "i2", "(Lcom/zepto/is1;)V", "mDlViewModel", "Lcom/nic/mparivahan/Dl/DlInterface/DlService;", "F", "Lcom/nic/mparivahan/Dl/DlInterface/DlService;", "B1", "()Lcom/nic/mparivahan/Dl/DlInterface/DlService;", "h2", "(Lcom/nic/mparivahan/Dl/DlInterface/DlService;)V", "mDlService", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "G", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "z1", "()Lcom/nic/mparivahan/DB/DatabaseHelper;", "e2", "(Lcom/nic/mparivahan/DB/DatabaseHelper;)V", "databaseHelper", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/RC/Model/Document;", "Lkotlin/collections/ArrayList;", "H", "Ljava/util/ArrayList;", "x1", "()Ljava/util/ArrayList;", "c2", "(Ljava/util/ArrayList;)V", "arrayList", "Lcom/zepto/ws6;", "I", "Lcom/zepto/ws6;", "M1", "()Lcom/zepto/ws6;", "q2", "(Lcom/zepto/ws6;)V", "sessionManager", "Landroid/app/ProgressDialog;", "J", "Landroid/app/ProgressDialog;", "H1", "()Landroid/app/ProgressDialog;", "m2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/y04;", "K", "Lcom/zepto/y04;", "N1", "()Lcom/zepto/y04;", "r2", "(Lcom/zepto/y04;)V", "shared_adapter", "Lcom/zepto/r04;", "L", "Lcom/zepto/r04;", "J1", "()Lcom/zepto/r04;", "n2", "(Lcom/zepto/r04;)V", "received_adapter", "M", "I1", "()I", "setPosition", "(I)V", "N", "G1", "setMyRcAdapterPosition", "MyRcAdapterPosition", "Lcom/zepto/y25;", "O", "Lcom/zepto/y25;", "F1", "()Lcom/zepto/y25;", "l2", "(Lcom/zepto/y25;)V", "myRcAdapter", "P", "Ljava/lang/String;", "K1", "()Ljava/lang/String;", "o2", "(Ljava/lang/String;)V", "selectedRcNumber", "Lcom/zepto/kt7;", "Lcom/zepto/kt7;", "y1", "()Lcom/zepto/kt7;", "d2", "(Lcom/zepto/kt7;)V", "binding", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "R", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "A1", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "g2", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "dl_data", "selectedRc", "Lcom/zepto/wa3;", "T", "Lcom/zepto/wa3;", "L1", "()Lcom/zepto/wa3;", "p2", "(Lcom/zepto/wa3;)V", "session", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nVirtualDocScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VirtualDocScreen.kt\ncom/nic/mparivahan/Dashboard/ui/VirtualDocScreen\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,1609:1\n107#2:1610\n79#2,29:1611\n107#2:1640\n79#2,29:1641\n*S KotlinDebug\n*F\n+ 1 VirtualDocScreen.kt\ncom/nic/mparivahan/Dashboard/ui/VirtualDocScreen\n*L\n1590#1:1610\n1590#1:1611,29\n1592#1:1640\n1592#1:1641,29\n*E\n"})
public final class VirtualDocScreen extends pq implements vh1, uh1, u55 {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public a55 mRcViewModel;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public RcService mRcService;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public is1 mDlViewModel;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public DlService mDlService;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public DatabaseHelper databaseHelper;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ArrayList arrayList;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public y04 shared_adapter;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public r04 received_adapter;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public int position;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public int MyRcAdapterPosition;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public y25 myRcAdapter;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public String selectedRcNumber;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public kt7 binding;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public DldetobjX dl_data;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String selectedRc = "";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public wa3 session;

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
            VirtualDocScreen.this.H1().dismiss();
            Toast.makeText(VirtualDocScreen.this.getApplicationContext(), VirtualDocScreen.this.L1().b("no_details", "Unable to get the details, Please try after sometimes!"), 1).show();
        }
    }

    public static final class a0 implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public a0(Function1 function) {
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
        public final void a(SharedRcDeletResponse sharedRcDeletResponse) {
            try {
                VirtualDocScreen.this.H1().dismiss();
                if (StringsKt__StringsJVMKt.equals(sharedRcDeletResponse.getStatusCode(), "VTLD001", true)) {
                    try {
                        VirtualDocScreen.this.N1().Q(VirtualDocScreen.this.getPosition());
                        VirtualDocScreen virtualDocScreen = VirtualDocScreen.this;
                        virtualDocScreen.s2(virtualDocScreen, virtualDocScreen.L1().b(va3.a.u0(), "Shared RC Successfully Deleted"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (gd1.a.m(sharedRcDeletResponse.getStatusDesc())) {
                    Toast.makeText(VirtualDocScreen.this.getApplicationContext(), VirtualDocScreen.this.L1().b(va3.a.I0(), "Unable to delete the shared Rc, Please try after some time"), 1).show();
                } else {
                    VirtualDocScreen virtualDocScreen2 = VirtualDocScreen.this;
                    virtualDocScreen2.s2(virtualDocScreen2, sharedRcDeletResponse.getStatusDesc());
                }
            } catch (Exception e2) {
                VirtualDocScreen.this.H1().dismiss();
                e2.printStackTrace();
                Toast.makeText(VirtualDocScreen.this.getApplicationContext(), VirtualDocScreen.this.L1().b(va3.a.I0(), "Unable to delete the shared Rc, Please try after some time"), 1).show();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SharedRcDeletResponse) obj);
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
            Toast.makeText(VirtualDocScreen.this.getApplicationContext(), VirtualDocScreen.this.L1().b(va3.a.I0(), "Unable to delete the shared Rc, Please try after some time"), 1).show();
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
        public final void a(SharedRcDeletResponse sharedRcDeletResponse) {
            try {
                VirtualDocScreen.this.H1().dismiss();
                if (StringsKt__StringsJVMKt.equals(sharedRcDeletResponse.getStatusCode(), "VTLD001", true)) {
                    try {
                        VirtualDocScreen.this.J1().O(VirtualDocScreen.this.getPosition());
                        VirtualDocScreen virtualDocScreen = VirtualDocScreen.this;
                        virtualDocScreen.s2(virtualDocScreen, virtualDocScreen.L1().b(va3.a.i0(), "Received RC Successfully Deleted!"));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (gd1.a.m(sharedRcDeletResponse.getStatusDesc())) {
                    Toast.makeText(VirtualDocScreen.this.getApplicationContext(), VirtualDocScreen.this.L1().b(va3.a.H0(), "Unable to delete the Received RC, Please try after some times"), 1).show();
                } else {
                    VirtualDocScreen virtualDocScreen2 = VirtualDocScreen.this;
                    virtualDocScreen2.s2(virtualDocScreen2, sharedRcDeletResponse.getStatusDesc());
                }
            } catch (Exception e2) {
                VirtualDocScreen.this.H1().dismiss();
                e2.printStackTrace();
                Toast.makeText(VirtualDocScreen.this.getApplicationContext(), VirtualDocScreen.this.L1().b(va3.a.H0(), "Unable to delete the Received RC, Please try after some times"), 1).show();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SharedRcDeletResponse) obj);
            return Unit.INSTANCE;
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
        public final void a(MyRcDeletResponse myRcDeletResponse) throws Throwable {
            try {
                VirtualDocScreen.this.H1().dismiss();
                if (!StringsKt__StringsJVMKt.equals(myRcDeletResponse.getStatusCode(), "VTLD001", true)) {
                    if (StringsKt__StringsJVMKt.equals(myRcDeletResponse.getStatusCode(), "VTLD090", true)) {
                        hz0.a.Q(VirtualDocScreen.this, myRcDeletResponse.getStatusDesc(), 1);
                        return;
                    }
                    if (StringsKt__StringsJVMKt.equals(myRcDeletResponse.getStatusCode(), "VTLD091", true)) {
                        hz0.a.Q(VirtualDocScreen.this, myRcDeletResponse.getStatusDesc(), 2);
                        return;
                    } else if (gd1.a.m(myRcDeletResponse.getStatusDesc())) {
                        Toast.makeText(VirtualDocScreen.this.getApplicationContext(), VirtualDocScreen.this.L1().b(va3.a.G0(), "Unable to delete the Virtual Rc, Please try after some time"), 1).show();
                        return;
                    } else {
                        VirtualDocScreen virtualDocScreen = VirtualDocScreen.this;
                        virtualDocScreen.s2(virtualDocScreen, myRcDeletResponse.getStatusDesc());
                        return;
                    }
                }
                try {
                    VirtualDocScreen.this.F1().Y(VirtualDocScreen.this.getMyRcAdapterPosition());
                    VirtualDocScreen.this.z1().p0(VirtualDocScreen.this.K1());
                    if (gd1.a.m(myRcDeletResponse.getStatusDesc())) {
                        VirtualDocScreen virtualDocScreen2 = VirtualDocScreen.this;
                        virtualDocScreen2.s2(virtualDocScreen2, virtualDocScreen2.L1().b(va3.a.h0(), "Virtual RC successfully deleted!"));
                    } else {
                        VirtualDocScreen virtualDocScreen3 = VirtualDocScreen.this;
                        virtualDocScreen3.s2(virtualDocScreen3, virtualDocScreen3.L1().b(va3.a.h0(), "Virtual RC successfully deleted!"));
                    }
                    try {
                        VirtualDocScreen virtualDocScreen4 = VirtualDocScreen.this;
                        ArrayList arrayListH0 = virtualDocScreen4.z1().H0();
                        Intrinsics.checkNotNull(arrayListH0, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.Document>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.RC.Model.Document> }");
                        virtualDocScreen4.c2(arrayListH0);
                        if (VirtualDocScreen.this.x1().size() <= 0) {
                            VirtualDocScreen.this.y1().c0.setAdapter(null);
                            VirtualDocScreen.this.y1().l0.setVisibility(0);
                            TextView textView = VirtualDocScreen.this.y1().l0;
                            wa3 wa3VarL1 = VirtualDocScreen.this.L1();
                            va3.a aVar = va3.a;
                            textView.setText(wa3VarL1.b(aVar.Q(), "No Virtual RC Found"));
                            VirtualDocScreen.this.y1().k0.setVisibility(0);
                            VirtualDocScreen.this.y1().m0.setText(VirtualDocScreen.this.L1().b(aVar.Z(), "There is no Virtual RC \nfound for your account"));
                        }
                    } catch (Exception unused) {
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(VirtualDocScreen.this.getApplicationContext(), VirtualDocScreen.this.L1().b(va3.a.G0(), "Unable to delete the Virtual Rc, Please try after some time"), 1).show();
                }
            } catch (Exception e2) {
                VirtualDocScreen.this.H1().dismiss();
                Log.e("error-1-", myRcDeletResponse.toString());
                e2.printStackTrace();
                Toast.makeText(VirtualDocScreen.this.getApplicationContext(), VirtualDocScreen.this.L1().b(va3.a.G0(), "Unable to delete the Virtual Rc, Please try after some time"), 1).show();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((MyRcDeletResponse) obj);
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

        public final void invoke(String str) {
            VirtualDocScreen.this.H1().dismiss();
            Toast.makeText(VirtualDocScreen.this.getApplicationContext(), VirtualDocScreen.this.L1().b(va3.a.G0(), "Unable to delete the Virtual Rc, Please try after some time"), 1).show();
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
        public final void a(MyRcDeletResponse myRcDeletResponse) throws Throwable {
            try {
                VirtualDocScreen.this.H1().dismiss();
                if (StringsKt__StringsJVMKt.equals(myRcDeletResponse.getStatusCode(), "VTLD001", true)) {
                    try {
                        VirtualDocScreen.this.z1().e0();
                        VirtualDocScreen virtualDocScreen = VirtualDocScreen.this;
                        virtualDocScreen.s2(virtualDocScreen, virtualDocScreen.L1().b(va3.a.a1(), "Virtual DL successfully deleted!"));
                        VirtualDocScreen.this.f2();
                    } catch (Exception e) {
                        e.printStackTrace();
                        Toast.makeText(VirtualDocScreen.this.getApplicationContext(), VirtualDocScreen.this.L1().b(va3.a.F0(), "Unable to delete the Virtual DL, Please try after some times"), 1).show();
                    }
                } else if (!gd1.a.m(myRcDeletResponse.getStatusDesc())) {
                    VirtualDocScreen virtualDocScreen2 = VirtualDocScreen.this;
                    virtualDocScreen2.s2(virtualDocScreen2, myRcDeletResponse.getStatusDesc());
                }
            } catch (Exception e2) {
                VirtualDocScreen.this.H1().dismiss();
                Log.e("error-1-", myRcDeletResponse.toString());
                e2.printStackTrace();
                Toast.makeText(VirtualDocScreen.this.getApplicationContext(), VirtualDocScreen.this.L1().b(va3.a.F0(), "Unable to delete the Virtual DL, Please try after some time"), 1).show();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((MyRcDeletResponse) obj);
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
            VirtualDocScreen.this.H1().dismiss();
            Toast.makeText(VirtualDocScreen.this.getApplicationContext(), VirtualDocScreen.this.L1().b(va3.a.F0(), "Unable to delete the Virtual DL, Please try after some time"), 1).show();
        }
    }

    public static final class i extends Lambda implements Function1 {
        public i() {
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
        public final void a(RcModelsDet rcModelsDet) throws Throwable {
            VirtualDocScreen.this.H1().dismiss();
            try {
                if (!StringsKt__StringsJVMKt.equals(rcModelsDet.getStatusCode().toString(), "NP001", true)) {
                    VirtualDocScreen virtualDocScreen = VirtualDocScreen.this;
                    virtualDocScreen.s2(virtualDocScreen, virtualDocScreen.L1().b(va3.a.P0(), "Unable to Update the Virtual RC, Please try after some time"));
                    return;
                }
                try {
                    VirtualDocScreen.this.z1().d(rcModelsDet.getNrvDetails().getRc_regn_no(), rcModelsDet.getNrvDetails(), 0);
                    VirtualDocScreen.this.F1().j();
                    VirtualDocScreen virtualDocScreen2 = VirtualDocScreen.this;
                    virtualDocScreen2.s2(virtualDocScreen2, virtualDocScreen2.L1().b(va3.a.b1(), "Virtual RC successfully updated"));
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                VirtualDocScreen.this.H1().dismiss();
                VirtualDocScreen virtualDocScreen3 = VirtualDocScreen.this;
                virtualDocScreen3.s2(virtualDocScreen3, virtualDocScreen3.L1().b(va3.a.P0(), "Unable to Update the Virtual RC, Please try after some time"));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((RcModelsDet) obj);
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
            VirtualDocScreen.this.H1().dismiss();
            try {
                VirtualDocScreen virtualDocScreen = VirtualDocScreen.this;
                virtualDocScreen.s2(virtualDocScreen, virtualDocScreen.L1().b(va3.a.P0(), "Unable to Update the Virtual RC, Please try after some time"));
            } catch (Exception unused) {
            }
        }
    }

    public static final class k extends Lambda implements Function1 {
        public k() {
            super(1);
        }

        public final void a(DLServiceResponseModleV1 dLServiceResponseModleV1) throws Throwable {
            try {
                VirtualDocScreen.this.y1().W.setVisibility(8);
                try {
                    VirtualDocScreen.this.y1().q.setText(dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioFullName());
                    VirtualDocScreen.this.y1().o.setText(dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioPermAdd1() + ' ' + dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioPermAdd2());
                    TextView textView = VirtualDocScreen.this.y1().p;
                    StringBuilder sb = new StringBuilder();
                    sb.append(VirtualDocScreen.this.L1().b("issue_date", "Issue Date"));
                    k18.a aVar = k18.a;
                    sb.append(aVar.f(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlIssuedt()));
                    textView.setText(sb.toString());
                    VirtualDocScreen.this.y1().s.setText(VirtualDocScreen.this.L1().b("label_dl_serv_valid_upto", "Valid Upto") + aVar.f(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlNtValdtoDt()));
                    VirtualDocScreen.this.y1().V.setVisibility(0);
                    VirtualDocScreen.this.z1().P0(StringsKt__StringsKt.trim((CharSequence) dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlLicno()).toString(), dLServiceResponseModleV1.getDldetobj().get(0));
                } catch (Exception e) {
                    e.printStackTrace();
                    VirtualDocScreen.this.y1().F.setAlpha(0.5f);
                    VirtualDocScreen.this.y1().z.setVisibility(0);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                VirtualDocScreen.this.y1().W.setVisibility(8);
                VirtualDocScreen.this.y1().F.setAlpha(0.5f);
                VirtualDocScreen.this.y1().z.setVisibility(0);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((DLServiceResponseModleV1) obj);
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
            try {
                Log.e("Track", "111");
                VirtualDocScreen.this.y1().W.setVisibility(8);
                VirtualDocScreen.this.y1().F.setAlpha(0.5f);
                VirtualDocScreen.this.y1().z.setVisibility(0);
            } catch (Exception e) {
                e.printStackTrace();
                VirtualDocScreen.this.y1().W.setVisibility(8);
            }
        }
    }

    public static final class m extends Lambda implements Function1 {
        public m() {
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
                Log.e("Track", "111");
                Log.e("Track", dLServiceResponseModleV1.getDldetobj().get(0).toString());
                VirtualDocScreen.this.y1().W.setVisibility(8);
                try {
                    VirtualDocScreen.this.z1().P0(StringsKt__StringsKt.trim((CharSequence) dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlLicno()).toString(), dLServiceResponseModleV1.getDldetobj().get(0));
                    VirtualDocScreen.this.f2();
                    VirtualDocScreen virtualDocScreen = VirtualDocScreen.this;
                    virtualDocScreen.s2(virtualDocScreen, virtualDocScreen.L1().b(va3.a.l(), "Virtual DL Successfully updated!"));
                } catch (Exception e) {
                    e.printStackTrace();
                    VirtualDocScreen virtualDocScreen2 = VirtualDocScreen.this;
                    virtualDocScreen2.s2(virtualDocScreen2, virtualDocScreen2.L1().b(va3.a.O0(), "Unable to update the Virtual DL, Please try after some time"));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                VirtualDocScreen.this.y1().W.setVisibility(8);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((DLServiceResponseModleV1) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class n extends Lambda implements Function1 {
        public n() {
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
            try {
                Log.e("Track", "111");
                VirtualDocScreen.this.y1().W.setVisibility(8);
                VirtualDocScreen virtualDocScreen = VirtualDocScreen.this;
                virtualDocScreen.s2(virtualDocScreen, virtualDocScreen.L1().b(va3.a.O0(), "Unable to update the Virtual DL, Please try after some time"));
            } catch (Exception e) {
                e.printStackTrace();
                VirtualDocScreen.this.y1().W.setVisibility(8);
            }
        }
    }

    public static final class o extends Lambda implements Function1 {
        public o() {
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
        public final void a(UpdateDocSuccessResponse updateDocSuccessResponse) {
            if (Intrinsics.areEqual(updateDocSuccessResponse.getStatusCode(), "VTLD001")) {
                VirtualDocScreen.this.C1().j(StringsKt__StringsKt.trim((CharSequence) VirtualDocScreen.this.A1().getDlobj().getDlLicno().toString()).toString(), k18.a.b(StringsKt__StringsKt.trim((CharSequence) VirtualDocScreen.this.A1().getBioObj().getBioDob().toString()).toString()), VirtualDocScreen.this);
                return;
            }
            if (StringsKt__StringsJVMKt.equals(updateDocSuccessResponse.getStatusCode(), "VTLD090", true)) {
                VirtualDocScreen.this.H1().dismiss();
                hz0.a.Q(VirtualDocScreen.this, updateDocSuccessResponse.getStatusDesc(), 1);
            } else if (StringsKt__StringsJVMKt.equals(updateDocSuccessResponse.getStatusCode(), "VTLD091", true)) {
                VirtualDocScreen.this.H1().dismiss();
                hz0.a.Q(VirtualDocScreen.this, updateDocSuccessResponse.getStatusDesc(), 2);
            } else {
                if (gd1.a.m(updateDocSuccessResponse.getStatusDesc())) {
                    return;
                }
                VirtualDocScreen.this.H1().dismiss();
                VirtualDocScreen virtualDocScreen = VirtualDocScreen.this;
                virtualDocScreen.s2(virtualDocScreen, updateDocSuccessResponse.getStatusDesc());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((UpdateDocSuccessResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class p extends Lambda implements Function1 {
        public p() {
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
            if (VirtualDocScreen.this.H1().isShowing()) {
                VirtualDocScreen.this.H1().dismiss();
            }
            VirtualDocScreen virtualDocScreen = VirtualDocScreen.this;
            virtualDocScreen.s2(virtualDocScreen, virtualDocScreen.L1().b(va3.a.O0(), "Unable to update the Virtual DL, Please try after some time"));
        }
    }

    public static final class q extends Lambda implements Function1 {
        public q() {
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
            if (Intrinsics.areEqual(myRcDeletResponse.getStatusCode(), "VTLD001")) {
                try {
                    String strC0 = VirtualDocScreen.this.z1().C0(VirtualDocScreen.this.selectedRc);
                    a55 a55VarE1 = VirtualDocScreen.this.E1();
                    String strK = VirtualDocScreen.this.M1().k();
                    Intrinsics.checkNotNull(strC0);
                    a55VarE1.o(strK, strC0, VirtualDocScreen.this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            if (StringsKt__StringsJVMKt.equals(myRcDeletResponse.getStatusCode(), "VTLD090", true)) {
                VirtualDocScreen.this.H1().dismiss();
                hz0.a.Q(VirtualDocScreen.this, myRcDeletResponse.getStatusDesc(), 1);
            } else if (StringsKt__StringsJVMKt.equals(myRcDeletResponse.getStatusCode(), "VTLD091", true)) {
                VirtualDocScreen.this.H1().dismiss();
                hz0.a.Q(VirtualDocScreen.this, myRcDeletResponse.getStatusDesc(), 2);
            } else {
                if (gd1.a.m(myRcDeletResponse.getStatusDesc())) {
                    return;
                }
                VirtualDocScreen.this.H1().dismiss();
                VirtualDocScreen virtualDocScreen = VirtualDocScreen.this;
                virtualDocScreen.s2(virtualDocScreen, myRcDeletResponse.getStatusDesc());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((MyRcDeletResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class r extends Lambda implements Function1 {
        public r() {
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
            if (VirtualDocScreen.this.H1().isShowing()) {
                VirtualDocScreen.this.H1().dismiss();
            }
            VirtualDocScreen virtualDocScreen = VirtualDocScreen.this;
            virtualDocScreen.s2(virtualDocScreen, virtualDocScreen.L1().b(va3.a.P0(), "Unable to Update the Virtual RC, Please try after some times!"));
        }
    }

    public static final class s extends Lambda implements Function1 {
        public s() {
            super(1);
        }

        public final void a(GetSharedRecivedDoc getSharedRecivedDoc) {
            try {
                VirtualDocScreen.this.H1().dismiss();
                if (StringsKt__StringsJVMKt.equals(getSharedRecivedDoc.getStatusCode(), "VTLD001", true)) {
                    if (getSharedRecivedDoc.getSharedDocs().size() > 0) {
                        VirtualDocScreen.this.y1().k0.setVisibility(8);
                        VirtualDocScreen.this.y1().l0.setVisibility(8);
                        VirtualDocScreen.this.y1().c0.setAdapter(null);
                        VirtualDocScreen virtualDocScreen = VirtualDocScreen.this;
                        List<SharedDoc> sharedDocs = getSharedRecivedDoc.getSharedDocs();
                        Intrinsics.checkNotNull(sharedDocs, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.SharedDoc>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.RC.Model.SharedDoc> }");
                        VirtualDocScreen virtualDocScreen2 = VirtualDocScreen.this;
                        virtualDocScreen.r2(new y04((ArrayList) sharedDocs, virtualDocScreen2, virtualDocScreen2));
                        VirtualDocScreen.this.y1().c0.setAdapter(VirtualDocScreen.this.N1());
                    } else {
                        VirtualDocScreen.this.y1().c0.setAdapter(null);
                        VirtualDocScreen.this.y1().l0.setVisibility(0);
                        VirtualDocScreen.this.y1().k0.setVisibility(0);
                        TextView textView = VirtualDocScreen.this.y1().m0;
                        wa3 wa3VarL1 = VirtualDocScreen.this.L1();
                        va3.a aVar = va3.a;
                        textView.setText(wa3VarL1.b(aVar.V(), "There is no Shared RC \nfound for your account"));
                        VirtualDocScreen.this.y1().l0.setText(VirtualDocScreen.this.L1().b(aVar.U(), "No Shared RC Found"));
                    }
                } else if (StringsKt__StringsJVMKt.equals(getSharedRecivedDoc.getStatusCode(), "VTLD007", true)) {
                    VirtualDocScreen.this.y1().c0.setAdapter(null);
                    VirtualDocScreen.this.y1().k0.setVisibility(0);
                    TextView textView2 = VirtualDocScreen.this.y1().m0;
                    wa3 wa3VarL12 = VirtualDocScreen.this.L1();
                    va3.a aVar2 = va3.a;
                    textView2.setText(wa3VarL12.b(aVar2.V(), "There is no Shared RC \nfound for your account"));
                    VirtualDocScreen.this.y1().l0.setVisibility(0);
                    VirtualDocScreen.this.y1().l0.setText(VirtualDocScreen.this.L1().b(aVar2.U(), "No Shared RC Found"));
                } else if (StringsKt__StringsJVMKt.equals(getSharedRecivedDoc.getStatusCode(), "VTLD090", true)) {
                    VirtualDocScreen.this.H1().dismiss();
                    hz0.a.Q(VirtualDocScreen.this, getSharedRecivedDoc.getStatusDesc(), 1);
                } else if (StringsKt__StringsJVMKt.equals(getSharedRecivedDoc.getStatusCode(), "VTLD091", true)) {
                    VirtualDocScreen.this.H1().dismiss();
                    hz0.a.Q(VirtualDocScreen.this, getSharedRecivedDoc.getStatusDesc(), 2);
                } else {
                    VirtualDocScreen.this.y1().c0.setAdapter(null);
                    VirtualDocScreen.this.y1().k0.setVisibility(0);
                    TextView textView3 = VirtualDocScreen.this.y1().m0;
                    wa3 wa3VarL13 = VirtualDocScreen.this.L1();
                    va3.a aVar3 = va3.a;
                    textView3.setText(wa3VarL13.b(aVar3.V(), "There is no Shared RC \nfound for your account"));
                    VirtualDocScreen.this.y1().l0.setVisibility(0);
                    VirtualDocScreen.this.y1().l0.setText(VirtualDocScreen.this.L1().b(aVar3.U(), "No Shared RC Found"));
                }
            } catch (Exception e) {
                VirtualDocScreen.this.H1().dismiss();
                Log.e("error-1-", getSharedRecivedDoc.toString());
                e.printStackTrace();
                Toast.makeText(VirtualDocScreen.this.getApplicationContext(), VirtualDocScreen.this.L1().b(va3.a.a0(), "Number is not registered with the mParivahan"), 1).show();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetSharedRecivedDoc) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class t extends Lambda implements Function1 {
        public t() {
            super(1);
        }

        public final void a(GetSharedRecivedDoc getSharedRecivedDoc) {
            try {
                VirtualDocScreen.this.H1().dismiss();
                if (StringsKt__StringsJVMKt.equals(getSharedRecivedDoc.getStatusCode(), "VTLD001", true)) {
                    if (getSharedRecivedDoc.getReceivedDocs().size() > 0) {
                        VirtualDocScreen.this.y1().k0.setVisibility(8);
                        VirtualDocScreen.this.y1().l0.setVisibility(8);
                        VirtualDocScreen.this.y1().c0.setAdapter(null);
                        VirtualDocScreen virtualDocScreen = VirtualDocScreen.this;
                        List<ReceivedDoc> receivedDocs = getSharedRecivedDoc.getReceivedDocs();
                        Intrinsics.checkNotNull(receivedDocs, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.ReceivedDoc>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.RC.Model.ReceivedDoc> }");
                        VirtualDocScreen virtualDocScreen2 = VirtualDocScreen.this;
                        virtualDocScreen.n2(new r04((ArrayList) receivedDocs, virtualDocScreen2, virtualDocScreen2));
                        VirtualDocScreen.this.y1().c0.setAdapter(VirtualDocScreen.this.J1());
                    } else {
                        VirtualDocScreen.this.y1().k0.setVisibility(0);
                        VirtualDocScreen.this.y1().k0.setVisibility(0);
                        VirtualDocScreen.this.y1().l0.setVisibility(0);
                        VirtualDocScreen.this.y1().c0.setAdapter(null);
                        TextView textView = VirtualDocScreen.this.y1().l0;
                        wa3 wa3VarL1 = VirtualDocScreen.this.L1();
                        va3.a aVar = va3.a;
                        textView.setText(wa3VarL1.b(aVar.S(), "No Received RC Found"));
                        VirtualDocScreen.this.y1().m0.setText(VirtualDocScreen.this.L1().b(aVar.T(), "There is no Received RC \nfound for your account"));
                    }
                } else if (StringsKt__StringsJVMKt.equals(getSharedRecivedDoc.getStatusCode(), "VTLD007", true)) {
                    VirtualDocScreen.this.y1().c0.setAdapter(null);
                    VirtualDocScreen.this.y1().k0.setVisibility(0);
                    VirtualDocScreen.this.y1().l0.setVisibility(0);
                    VirtualDocScreen.this.y1().c0.setAdapter(null);
                    TextView textView2 = VirtualDocScreen.this.y1().l0;
                    wa3 wa3VarL12 = VirtualDocScreen.this.L1();
                    va3.a aVar2 = va3.a;
                    textView2.setText(wa3VarL12.b(aVar2.S(), "No Received RC Found"));
                    VirtualDocScreen.this.y1().m0.setText(VirtualDocScreen.this.L1().b(aVar2.T(), "There is no Received RC \nfound for your account"));
                } else if (StringsKt__StringsJVMKt.equals(getSharedRecivedDoc.getStatusCode(), "VTLD090", true)) {
                    VirtualDocScreen.this.H1().dismiss();
                    hz0.a.Q(VirtualDocScreen.this, getSharedRecivedDoc.getStatusDesc(), 1);
                } else if (StringsKt__StringsJVMKt.equals(getSharedRecivedDoc.getStatusCode(), "VTLD091", true)) {
                    VirtualDocScreen.this.H1().dismiss();
                    hz0.a.Q(VirtualDocScreen.this, getSharedRecivedDoc.getStatusDesc(), 2);
                } else if (StringsKt__StringsJVMKt.equals(getSharedRecivedDoc.getStatusCode(), "VTLD099", true)) {
                    VirtualDocScreen.this.y1().l0.setVisibility(0);
                    VirtualDocScreen.this.y1().k0.setVisibility(0);
                    VirtualDocScreen.this.y1().c0.setAdapter(null);
                    TextView textView3 = VirtualDocScreen.this.y1().l0;
                    wa3 wa3VarL13 = VirtualDocScreen.this.L1();
                    va3.a aVar3 = va3.a;
                    textView3.setText(wa3VarL13.b(aVar3.S(), "No Received RC Found"));
                    VirtualDocScreen.this.y1().m0.setText(VirtualDocScreen.this.L1().b(aVar3.T(), "There is no Received RC \nfound for your account"));
                } else {
                    VirtualDocScreen.this.y1().l0.setVisibility(0);
                    VirtualDocScreen.this.y1().k0.setVisibility(0);
                    VirtualDocScreen.this.y1().c0.setAdapter(null);
                    TextView textView4 = VirtualDocScreen.this.y1().l0;
                    wa3 wa3VarL14 = VirtualDocScreen.this.L1();
                    va3.a aVar4 = va3.a;
                    textView4.setText(wa3VarL14.b(aVar4.S(), "No Received RC Found"));
                    VirtualDocScreen.this.y1().m0.setText(VirtualDocScreen.this.L1().b(aVar4.T(), "There is no Received RC \nfound for your account"));
                }
            } catch (Exception e) {
                VirtualDocScreen.this.H1().dismiss();
                Log.e("error-1-", getSharedRecivedDoc.toString());
                e.printStackTrace();
                VirtualDocScreen.this.y1().k0.setVisibility(0);
                VirtualDocScreen.this.y1().l0.setVisibility(0);
                TextView textView5 = VirtualDocScreen.this.y1().l0;
                wa3 wa3VarL15 = VirtualDocScreen.this.L1();
                va3.a aVar5 = va3.a;
                textView5.setText(wa3VarL15.b(aVar5.S(), "No Received RC Found"));
                VirtualDocScreen.this.y1().m0.setText(VirtualDocScreen.this.L1().b(aVar5.T(), "There is no Received RC \nfound for your account"));
                VirtualDocScreen.this.y1().l0.setVisibility(0);
                VirtualDocScreen.this.y1().c0.setAdapter(null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetSharedRecivedDoc) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class u implements View.OnClickListener {
        public final /* synthetic */ Context a;
        public final /* synthetic */ z b;
        public final /* synthetic */ Ref.ObjectRef c;

        public u(Context context, z zVar, Ref.ObjectRef objectRef) {
            this.a = context;
            this.b = zVar;
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
                if (i6 == 0 || i6 > 31) {
                    this.a.setText("");
                }
            }
        }
    }

    public static final class x implements TextWatcher {
        public final /* synthetic */ EditText a;

        public x(EditText editText) {
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

    public static final class y implements TextWatcher {
        public final /* synthetic */ EditText a;
        public final /* synthetic */ EditText b;

        public y(EditText editText, EditText editText2) {
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

    public static final class z implements DatePickerDialog.OnDateSetListener {
        public final /* synthetic */ Ref.ObjectRef a;
        public final /* synthetic */ EditText b;
        public final /* synthetic */ EditText c;
        public final /* synthetic */ EditText d;

        public z(Ref.ObjectRef objectRef, EditText editText, EditText editText2, EditText editText3) {
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

    public static final void O1(VirtualDocScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void P1(final VirtualDocScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PopupMenu popupMenu = new PopupMenu(this$0, this$0.y1().V);
        popupMenu.inflate(R.menu.dl_menu);
        MenuItem menuItemFindItem = popupMenu.getMenu().findItem(R.id.menu1);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem, "findItem(...)");
        MenuItem menuItemFindItem2 = popupMenu.getMenu().findItem(R.id.menu2);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem2, "findItem(...)");
        MenuItem menuItemFindItem3 = popupMenu.getMenu().findItem(R.id.menu3);
        Intrinsics.checkNotNullExpressionValue(menuItemFindItem3, "findItem(...)");
        menuItemFindItem.setTitle(this$0.L1().b("label_view", "View"));
        menuItemFindItem2.setTitle(this$0.L1().b(va3.a.j0(), "Refresh"));
        menuItemFindItem3.setTitle(this$0.L1().b("delete", "Delete"));
        popupMenu.setGravity(5);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.zepto.at7
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return VirtualDocScreen.Q1(this.a, menuItem);
            }
        });
        popupMenu.show();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final boolean Q1(VirtualDocScreen this$0, MenuItem menuItem) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        switch (menuItem.getItemId()) {
            case R.id.menu1 /* 2131363697 */:
                this$0.startActivity(new Intent(this$0, (Class<?>) DLVirtualRcScreen.class));
                return false;
            case R.id.menu2 /* 2131363698 */:
                try {
                    if (com.nic.mparivahan.a.a.a(this$0)) {
                        this$0.y1().W.setVisibility(0);
                        DldetobjX dldetails = ((DLDocument) this$0.z1().z0().get(0)).getDldetails();
                        Intrinsics.checkNotNull(dldetails);
                        this$0.g2(dldetails);
                        String strB0 = this$0.z1().B0(StringsKt__StringsKt.trim((CharSequence) this$0.A1().getDlobj().getDlLicno()).toString());
                        if (strB0.equals("0")) {
                            strB0 = this$0.z1().B0(new Regex("\\s").replace(this$0.y1().v.getText().toString(), ""));
                        }
                        is1 is1VarC1 = this$0.C1();
                        Intrinsics.checkNotNull(strB0);
                        is1VarC1.E(strB0, "DL", k18.a.a(StringsKt__StringsKt.trim((CharSequence) this$0.A1().getBioObj().getBioDob()).toString()), this$0);
                    } else {
                        Toast.makeText(this$0, this$0.L1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 0).show();
                    }
                } catch (Exception e2) {
                    this$0.y1().W.setVisibility(8);
                    e2.printStackTrace();
                }
                return false;
            case R.id.menu3 /* 2131363699 */:
                if (com.nic.mparivahan.a.a.a(this$0)) {
                    String string = this$0.y1().v.getText().toString();
                    if (string != null && string.length() != 0) {
                        try {
                            this$0.H1().show();
                            String strB02 = this$0.z1().B0(this$0.y1().v.getText().toString());
                            if (strB02.equals("0")) {
                                strB02 = this$0.z1().B0(new Regex("\\s").replace(this$0.y1().v.getText().toString(), ""));
                            }
                            if (strB02 != null && strB02.length() != 0) {
                                a55 a55VarE1 = this$0.E1();
                                Intrinsics.checkNotNull(strB02);
                                a55VarE1.g(strB02, this$0);
                            }
                        } catch (Exception e3) {
                            this$0.H1().dismiss();
                            e3.printStackTrace();
                        }
                    }
                    break;
                } else {
                    Toast.makeText(this$0, this$0.L1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 0).show();
                }
                return false;
            default:
                return false;
        }
    }

    public static final void R1(VirtualDocScreen this$0, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.y1().h.setBackgroundColor(yy0.c(this$0, R.color.gery_doc_color));
        this$0.y1().i.setBackgroundResource(R.drawable.round_title_shape_doc);
        this$0.y1().i.setTextColor(yy0.c(this$0, R.color.white));
        this$0.y1().h.setTextColor(yy0.c(this$0, R.color.black));
        this$0.y1().Y.setVisibility(8);
        this$0.y1().u.setVisibility(0);
        try {
            this$0.f2();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void S1(VirtualDocScreen this$0, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.y1().h.setBackgroundResource(R.drawable.round_title_shape_doc);
        this$0.y1().i.setBackgroundColor(yy0.c(this$0, R.color.gery_doc_color));
        this$0.y1().h.setTextColor(yy0.c(this$0, R.color.white));
        this$0.y1().i.setTextColor(yy0.c(this$0, R.color.black));
        this$0.y1().Y.setVisibility(0);
        this$0.y1().u.setVisibility(8);
        this$0.y1().k0.setVisibility(8);
        try {
            this$0.y1().e0.setBackgroundResource(R.drawable.shared_recieved_rc_background);
            this$0.y1().Z.setBackgroundResource(R.drawable.shared_recieved_rc_background);
            this$0.y1().L.setBackgroundResource(R.drawable.shared_received_rc_background_ontap);
            this$0.y1().N.setTextColor(yy0.c(this$0, R.color.white));
            this$0.y1().h0.setTextColor(yy0.c(this$0, R.color.black));
            this$0.y1().b0.setTextColor(yy0.c(this$0, R.color.black));
            this$0.y1().a0.setImageResource(R.drawable.received_rc_ontap);
            this$0.y1().g0.setImageResource(R.drawable.shared_rc_ontap);
            this$0.y1().M.setImageResource(R.drawable.my_rc_ontap);
            ArrayList arrayListH0 = this$0.z1().H0();
            Intrinsics.checkNotNull(arrayListH0, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.Document>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.RC.Model.Document> }");
            if (arrayListH0.size() > 0) {
                this$0.y1().l0.setVisibility(8);
                this$0.y1().c0.setAdapter(null);
                this$0.l2(new y25(arrayListH0, this$0, this$0));
                this$0.y1().c0.setAdapter(this$0.F1());
            } else {
                this$0.y1().c0.setAdapter(null);
                this$0.y1().l0.setVisibility(0);
                TextView textView = this$0.y1().l0;
                wa3 wa3VarL1 = this$0.L1();
                va3.a aVar = va3.a;
                textView.setText(wa3VarL1.b(aVar.Q(), "No Virtual RC Found"));
                this$0.y1().k0.setVisibility(0);
                this$0.y1().m0.setText(this$0.L1().b(aVar.Z(), "There is no Virtual RC \nfound for your account"));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void T1(VirtualDocScreen this$0, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.y1().e0.setBackgroundResource(R.drawable.shared_recieved_rc_background);
            this$0.y1().Z.setBackgroundResource(R.drawable.shared_recieved_rc_background);
            this$0.y1().L.setBackgroundResource(R.drawable.shared_received_rc_background_ontap);
            this$0.y1().N.setTextColor(yy0.c(this$0, R.color.white));
            this$0.y1().h0.setTextColor(yy0.c(this$0, R.color.black));
            this$0.y1().b0.setTextColor(yy0.c(this$0, R.color.black));
            this$0.y1().a0.setImageResource(R.drawable.received_rc_ontap);
            this$0.y1().g0.setImageResource(R.drawable.shared_rc_ontap);
            this$0.y1().M.setImageResource(R.drawable.my_rc_ontap);
            ArrayList arrayListH0 = this$0.z1().H0();
            Intrinsics.checkNotNull(arrayListH0, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.Document>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.RC.Model.Document> }");
            this$0.c2(arrayListH0);
            if (this$0.x1().size() > 0) {
                this$0.y1().l0.setVisibility(8);
                this$0.y1().k0.setVisibility(8);
                this$0.y1().c0.setAdapter(null);
                this$0.l2(new y25(this$0.x1(), this$0, this$0));
                this$0.y1().c0.setAdapter(this$0.F1());
            } else {
                this$0.y1().c0.setAdapter(null);
                this$0.y1().l0.setVisibility(0);
                TextView textView = this$0.y1().l0;
                wa3 wa3VarL1 = this$0.L1();
                va3.a aVar = va3.a;
                textView.setText(wa3VarL1.b(aVar.Q(), "No Virtual RC Found"));
                this$0.y1().k0.setVisibility(0);
                this$0.y1().m0.setText(this$0.L1().b(aVar.Z(), "There is no Virtual RC \nfound for your account"));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final void U1(VirtualDocScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0, this$0.L1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        this$0.y1().e0.setBackgroundResource(R.drawable.shared_received_rc_background_ontap);
        this$0.y1().Z.setBackgroundResource(R.drawable.shared_recieved_rc_background);
        this$0.y1().L.setBackgroundResource(R.drawable.shared_recieved_rc_background);
        this$0.y1().N.setTextColor(yy0.c(this$0, R.color.black));
        this$0.y1().h0.setTextColor(yy0.c(this$0, R.color.white));
        this$0.y1().b0.setTextColor(yy0.c(this$0, R.color.black));
        this$0.y1().a0.setImageResource(R.drawable.received_rc_ontap);
        this$0.y1().g0.setImageResource(R.drawable.shared_rc_org);
        this$0.y1().M.setImageResource(R.drawable.my_rc_org);
        this$0.H1().show();
        this$0.E1().Q(this$0.M1().k(), this$0);
    }

    public static final void V1(VirtualDocScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0, this$0.L1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        this$0.y1().e0.setBackgroundResource(R.drawable.shared_recieved_rc_background);
        this$0.y1().Z.setBackgroundResource(R.drawable.shared_received_rc_background_ontap);
        this$0.y1().L.setBackgroundResource(R.drawable.shared_recieved_rc_background);
        this$0.y1().a0.setImageResource(R.drawable.received_rc_org);
        this$0.y1().g0.setImageResource(R.drawable.shared_rc_ontap);
        this$0.y1().M.setImageResource(R.drawable.my_rc_org);
        this$0.y1().N.setTextColor(yy0.c(this$0, R.color.black));
        this$0.y1().h0.setTextColor(yy0.c(this$0, R.color.black));
        this$0.y1().b0.setTextColor(yy0.c(this$0, R.color.white));
        this$0.H1().show();
        this$0.E1().P(this$0.M1().k(), this$0);
    }

    public static final void W1(VirtualDocScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.y1().z.setVisibility(8);
            this$0.X1(this$0, StringsKt__StringsKt.trim((CharSequence) this$0.y1().v.getText().toString()).toString());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static final boolean Y1(TextView textView, int i2, KeyEvent keyEvent) {
        return i2 == 3 || i2 == 6 || (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66);
    }

    public static final boolean Z1(EditText dobMonth, EditText dobDate, View view, int i2, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(dobMonth, "$dobMonth");
        Intrinsics.checkNotNullParameter(dobDate, "$dobDate");
        if (i2 != 67 || dobMonth.getText().length() != 0) {
            return false;
        }
        dobDate.requestFocus();
        return false;
    }

    public static final void a2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public static final void b2(EditText dobYear, EditText dobMonth, EditText dobDate, Dialog d2, VirtualDocScreen this$0, String dl_number, View view) {
        Intrinsics.checkNotNullParameter(dobYear, "$dobYear");
        Intrinsics.checkNotNullParameter(dobMonth, "$dobMonth");
        Intrinsics.checkNotNullParameter(dobDate, "$dobDate");
        Intrinsics.checkNotNullParameter(d2, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(dl_number, "$dl_number");
        String string = dobYear.getText().toString();
        int length = string.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean z3 = Intrinsics.compare((int) string.charAt(!z2 ? i2 : length), 32) <= 0;
            if (z2) {
                if (!z3) {
                    break;
                } else {
                    length--;
                }
            } else if (z3) {
                i2++;
            } else {
                z2 = true;
            }
        }
        if (string.subSequence(i2, length + 1).toString().length() > 0) {
            String string2 = dobMonth.getText().toString();
            int length2 = string2.length() - 1;
            int i3 = 0;
            boolean z4 = false;
            while (i3 <= length2) {
                boolean z5 = Intrinsics.compare((int) string2.charAt(!z4 ? i3 : length2), 32) <= 0;
                if (z4) {
                    if (!z5) {
                        break;
                    } else {
                        length2--;
                    }
                } else if (z5) {
                    i3++;
                } else {
                    z4 = true;
                }
            }
            if (string2.subSequence(i3, length2 + 1).toString().length() > 0) {
                String string3 = dobDate.getText().toString();
                int length3 = string3.length() - 1;
                int i4 = 0;
                boolean z6 = false;
                while (i4 <= length3) {
                    boolean z7 = Intrinsics.compare((int) string3.charAt(!z6 ? i4 : length3), 32) <= 0;
                    if (z6) {
                        if (!z7) {
                            break;
                        } else {
                            length3--;
                        }
                    } else if (z7) {
                        i4++;
                    } else {
                        z6 = true;
                    }
                }
                if (string3.subSequence(i4, length3 + 1).toString().length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    String string4 = dobYear.getText().toString();
                    int length4 = string4.length() - 1;
                    int i5 = 0;
                    boolean z8 = false;
                    while (i5 <= length4) {
                        boolean z9 = Intrinsics.compare((int) string4.charAt(!z8 ? i5 : length4), 32) <= 0;
                        if (z8) {
                            if (!z9) {
                                break;
                            } else {
                                length4--;
                            }
                        } else if (z9) {
                            i5++;
                        } else {
                            z8 = true;
                        }
                    }
                    sb.append(string4.subSequence(i5, length4 + 1).toString());
                    sb.append('-');
                    String string5 = dobMonth.getText().toString();
                    int length5 = string5.length() - 1;
                    int i6 = 0;
                    boolean z10 = false;
                    while (i6 <= length5) {
                        boolean z11 = Intrinsics.compare((int) string5.charAt(!z10 ? i6 : length5), 32) <= 0;
                        if (z10) {
                            if (!z11) {
                                break;
                            } else {
                                length5--;
                            }
                        } else if (z11) {
                            i6++;
                        } else {
                            z10 = true;
                        }
                    }
                    sb.append(string5.subSequence(i6, length5 + 1).toString());
                    sb.append('-');
                    String string6 = dobDate.getText().toString();
                    int length6 = string6.length() - 1;
                    int i7 = 0;
                    boolean z12 = false;
                    while (i7 <= length6) {
                        boolean z13 = Intrinsics.compare((int) string6.charAt(!z12 ? i7 : length6), 32) <= 0;
                        if (z12) {
                            if (!z13) {
                                break;
                            } else {
                                length6--;
                            }
                        } else if (z13) {
                            i7++;
                        } else {
                            z12 = true;
                        }
                    }
                    sb.append(string6.subSequence(i7, length6 + 1).toString());
                    String string7 = sb.toString();
                    d2.dismiss();
                    this$0.y1().z.setVisibility(8);
                    this$0.y1().W.setVisibility(0);
                    this$0.C1().i(dl_number, string7, this$0);
                    return;
                }
            }
        }
        Toast.makeText(this$0, this$0.L1().b(va3.a.d0(), "Please enter the valid dob"), 0).show();
    }

    public static final void t2(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public final DldetobjX A1() {
        DldetobjX dldetobjX = this.dl_data;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dl_data");
        return null;
    }

    public final DlService B1() {
        DlService dlService = this.mDlService;
        if (dlService != null) {
            return dlService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDlService");
        return null;
    }

    public final is1 C1() {
        is1 is1Var = this.mDlViewModel;
        if (is1Var != null) {
            return is1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDlViewModel");
        return null;
    }

    public final RcService D1() {
        RcService rcService = this.mRcService;
        if (rcService != null) {
            return rcService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRcService");
        return null;
    }

    public final a55 E1() {
        a55 a55Var = this.mRcViewModel;
        if (a55Var != null) {
            return a55Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRcViewModel");
        return null;
    }

    public final y25 F1() {
        y25 y25Var = this.myRcAdapter;
        if (y25Var != null) {
            return y25Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("myRcAdapter");
        return null;
    }

    /* JADX INFO: renamed from: G1, reason: from getter */
    public final int getMyRcAdapterPosition() {
        return this.MyRcAdapterPosition;
    }

    public final ProgressDialog H1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    /* JADX INFO: renamed from: I1, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    public final r04 J1() {
        r04 r04Var = this.received_adapter;
        if (r04Var != null) {
            return r04Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("received_adapter");
        return null;
    }

    public final String K1() {
        String str = this.selectedRcNumber;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("selectedRcNumber");
        return null;
    }

    public final wa3 L1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final ws6 M1() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final y04 N1() {
        y04 y04Var = this.shared_adapter;
        if (y04Var != null) {
            return y04Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shared_adapter");
        return null;
    }

    @Override // com.zepto.vh1
    public void Q(String shared_id, int position) {
        this.position = position;
        H1().show();
        E1().k(String.valueOf(shared_id), M1().k(), this);
    }

    @Override // com.zepto.uh1
    public void S(String rc, int position) throws Throwable {
        try {
            if (!com.nic.mparivahan.a.a.a(this)) {
                Toast.makeText(this, L1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
            } else if (z1().C0(rc) != null) {
                H1().show();
                Intrinsics.checkNotNull(rc);
                this.selectedRc = rc;
                String strC0 = z1().C0(rc);
                a55 a55VarE1 = E1();
                Intrinsics.checkNotNull(strC0);
                a55VarE1.a0(strC0, "RC", this);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [T, java.util.Calendar] */
    public final void X1(Context context, final String dl_number) {
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
        ((ImageView) viewFindViewById6).setOnClickListener(new u(context, new z(objectRef, editText3, editText2, editText), objectRef));
        editText3.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zepto.it7
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return VirtualDocScreen.Y1(textView, i2, keyEvent);
            }
        });
        editText3.addTextChangedListener(new v(editText2));
        editText3.addTextChangedListener(new w(editText3, editText2));
        editText2.addTextChangedListener(new x(editText));
        editText2.setOnKeyListener(new View.OnKeyListener() { // from class: com.zepto.jt7
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                return VirtualDocScreen.Z1(editText2, editText3, view, i2, keyEvent);
            }
        });
        editText2.addTextChangedListener(new y(editText2, editText));
        ((CardView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xs7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirtualDocScreen.a2(dialog, view);
            }
        });
        cardView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ys7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirtualDocScreen.b2(editText, editText2, editText3, dialog, this, dl_number, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.u55
    public void c0(String shared_id, int position) {
        this.position = position;
        H1().show();
        E1().j(String.valueOf(shared_id), M1().k(), this);
    }

    public final void c2(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.arrayList = arrayList;
    }

    public final void d2(kt7 kt7Var) {
        Intrinsics.checkNotNullParameter(kt7Var, "<set-?>");
        this.binding = kt7Var;
    }

    public final void e2(DatabaseHelper databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "<set-?>");
        this.databaseHelper = databaseHelper;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f2() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Dashboard.ui.VirtualDocScreen.f2():void");
    }

    public final void g2(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dl_data = dldetobjX;
    }

    public final void h2(DlService dlService) {
        Intrinsics.checkNotNullParameter(dlService, "<set-?>");
        this.mDlService = dlService;
    }

    public final void i2(is1 is1Var) {
        Intrinsics.checkNotNullParameter(is1Var, "<set-?>");
        this.mDlViewModel = is1Var;
    }

    public final void j2(RcService rcService) {
        Intrinsics.checkNotNullParameter(rcService, "<set-?>");
        this.mRcService = rcService;
    }

    public final void k2(a55 a55Var) {
        Intrinsics.checkNotNullParameter(a55Var, "<set-?>");
        this.mRcViewModel = a55Var;
    }

    public final void l2(y25 y25Var) {
        Intrinsics.checkNotNullParameter(y25Var, "<set-?>");
        this.myRcAdapter = y25Var;
    }

    public final void m2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void n2(r04 r04Var) {
        Intrinsics.checkNotNullParameter(r04Var, "<set-?>");
        this.received_adapter = r04Var;
    }

    public final void o2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.selectedRcNumber = str;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.virtual_document_layout);
        getWindow().addFlags(128);
        h2(DlService.INSTANCE.a(this));
        j2(RcService.INSTANCE.a(this));
        q2(new ws6(this));
        p2(new wa3(this));
        kt7 kt7VarC = kt7.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(kt7VarC, "inflate(...)");
        d2(kt7VarC);
        setContentView(y1().b());
        ta3.a.b3(this, y1());
        DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(this);
        Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
        e2(databaseHelperD0);
        m2(new ProgressDialog(this));
        H1().setMessage(L1().b("label_challan_please_wait", "Please wait..."));
        H1().setCancelable(false);
        H1().setCanceledOnTouchOutside(false);
        i2((is1) new androidx.lifecycle.z(this, new js1(new jp1(B1()))).a(is1.class));
        y1().P.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ws7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirtualDocScreen.O1(this.a, view);
            }
        });
        y1().V.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bt7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirtualDocScreen.P1(this.a, view);
            }
        });
        y1().i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ct7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                VirtualDocScreen.R1(this.a, view);
            }
        });
        y1().h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dt7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                VirtualDocScreen.S1(this.a, view);
            }
        });
        y1().c0.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        k2((a55) new androidx.lifecycle.z(this, new b55(new s45(D1()))).a(a55.class));
        try {
            ArrayList arrayListH0 = z1().H0();
            Intrinsics.checkNotNull(arrayListH0, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.Document>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.RC.Model.Document> }");
            c2(arrayListH0);
            if (x1().size() > 0) {
                y1().L.setBackgroundResource(R.drawable.shared_received_rc_background_ontap);
                y1().N.setTextColor(yy0.c(this, R.color.white));
                y1().h0.setTextColor(yy0.c(this, R.color.black));
                y1().b0.setTextColor(yy0.c(this, R.color.black));
                y1().a0.setImageResource(R.drawable.received_rc_ontap);
                y1().g0.setImageResource(R.drawable.shared_rc_ontap);
                y1().M.setImageResource(R.drawable.my_rc_ontap);
                y1().k0.setVisibility(8);
                y1().l0.setVisibility(8);
                l2(new y25(x1(), this, this));
                y1().c0.setAdapter(F1());
            } else {
                y1().l0.setVisibility(0);
                TextView textView = y1().l0;
                wa3 wa3VarL1 = L1();
                va3.a aVar = va3.a;
                textView.setText(wa3VarL1.b(aVar.Q(), "No Virtual RC Found"));
                y1().k0.setVisibility(0);
                y1().m0.setText(L1().b(aVar.Z(), "There is no Virtual RC \nfound for your account"));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        y1().L.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.et7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                VirtualDocScreen.T1(this.a, view);
            }
        });
        y1().e0.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ft7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirtualDocScreen.U1(this.a, view);
            }
        });
        y1().Z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gt7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirtualDocScreen.V1(this.a, view);
            }
        });
        E1().F().g(this, new a0(new s()));
        E1().D().g(this, new a0(new t()));
        E1().E().g(this, new a0(new a()));
        E1().J().g(this, new a0(new b()));
        E1().K().g(this, new a0(new c()));
        E1().B().g(this, new a0(new d()));
        E1().z().g(this, new a0(new e()));
        E1().A().g(this, new a0(new f()));
        E1().x().g(this, new a0(new g()));
        E1().y().g(this, new a0(new h()));
        E1().R().g(this, new a0(new i()));
        E1().S().g(this, new a0(new j()));
        C1().r().g(this, new a0(new k()));
        C1().s().g(this, new a0(new l()));
        C1().n().g(this, new a0(new m()));
        C1().o().g(this, new a0(new n()));
        C1().y().g(this, new a0(new o()));
        C1().x().g(this, new a0(new p()));
        E1().U().g(this, new a0(new q()));
        E1().T().g(this, new a0(new r()));
        y1().z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ht7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirtualDocScreen.W1(this.a, view);
            }
        });
    }

    @Override // com.zepto.uh1
    public void p(String rc_number, int position) throws Throwable {
        Log.e("MyRc", String.valueOf(rc_number));
        if (!com.nic.mparivahan.a.a.a(this)) {
            Toast.makeText(this, L1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        this.MyRcAdapterPosition = position;
        o2(String.valueOf(rc_number));
        if (z1().C0(rc_number) != null) {
            String strC0 = z1().C0(rc_number);
            if (gd1.a.m(strC0)) {
                return;
            }
            H1().show();
            a55 a55VarE1 = E1();
            Intrinsics.checkNotNull(strC0);
            a55VarE1.i(strC0, this);
        }
    }

    public final void p2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final void q2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final void r2(y04 y04Var) {
        Intrinsics.checkNotNullParameter(y04Var, "<set-?>");
        this.shared_adapter = y04Var;
    }

    public final void s2(Context context, String message) {
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
        ((TextView) viewFindViewById3).setText(L1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(L1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zs7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirtualDocScreen.t2(dialog, view);
            }
        });
        dialog.show();
    }

    public final ArrayList x1() {
        ArrayList arrayList = this.arrayList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("arrayList");
        return null;
    }

    public final kt7 y1() {
        kt7 kt7Var = this.binding;
        if (kt7Var != null) {
            return kt7Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final DatabaseHelper z1() {
        DatabaseHelper databaseHelper = this.databaseHelper;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("databaseHelper");
        return null;
    }
}
