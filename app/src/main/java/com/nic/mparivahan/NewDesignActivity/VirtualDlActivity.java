package com.nic.mparivahan.NewDesignActivity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Dl.DLVirtualRcScreen;
import com.nic.mparivahan.Dl.DlInterface.DlService;
import com.nic.mparivahan.Dl.Model.BioObjX;
import com.nic.mparivahan.Dl.Model.DLDocument;
import com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.Dl.Model.DlobjX;
import com.nic.mparivahan.Dl.Model.UpdateDocSuccessResponse;
import com.nic.mparivahan.NewDesignActivity.VirtualDlActivity;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.MyRcDeletResponse;
import com.nic.mparivahan.RC.RcInterface.RcService;
import com.zepto.a55;
import com.zepto.b55;
import com.zepto.is1;
import com.zepto.jp1;
import com.zepto.js1;
import com.zepto.k18;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.s45;
import com.zepto.ut1;
import com.zepto.wa3;
import com.zepto.ws6;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b^\u0010_J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\b\u0010\b\u001a\u00020\u0002H\u0007J\u001a\u0010\r\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010U\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010]\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\¨\u0006`"}, d2 = {"Lcom/nic/mparivahan/NewDesignActivity/VirtualDlActivity;", "Lcom/zepto/pq;", "", "w1", "B1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "E1", "Landroid/content/Context;", "context", "", "message", "N1", "Lcom/zepto/ut1;", "C", "Lcom/zepto/ut1;", "n1", "()Lcom/zepto/ut1;", "C1", "(Lcom/zepto/ut1;)V", "binding", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "D", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "o1", "()Lcom/nic/mparivahan/DB/DatabaseHelper;", "D1", "(Lcom/nic/mparivahan/DB/DatabaseHelper;)V", "databaseHelper", "Lcom/zepto/ws6;", "E", "Lcom/zepto/ws6;", "getSessionManager", "()Lcom/zepto/ws6;", "M1", "(Lcom/zepto/ws6;)V", "sessionManager", "Landroid/app/ProgressDialog;", "F", "Landroid/app/ProgressDialog;", "v1", "()Landroid/app/ProgressDialog;", "L1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/is1;", "G", "Lcom/zepto/is1;", "s1", "()Lcom/zepto/is1;", "I1", "(Lcom/zepto/is1;)V", "mDlViewModel", "Lcom/nic/mparivahan/Dl/DlInterface/DlService;", "H", "Lcom/nic/mparivahan/Dl/DlInterface/DlService;", "r1", "()Lcom/nic/mparivahan/Dl/DlInterface/DlService;", "H1", "(Lcom/nic/mparivahan/Dl/DlInterface/DlService;)V", "mDlService", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "I", "Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "p1", "()Lcom/nic/mparivahan/Dl/Model/DldetobjX;", "F1", "(Lcom/nic/mparivahan/Dl/Model/DldetobjX;)V", "dl_data", "Lcom/zepto/a55;", "J", "Lcom/zepto/a55;", "u1", "()Lcom/zepto/a55;", "K1", "(Lcom/zepto/a55;)V", "mRcViewModel", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "K", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "t1", "()Lcom/nic/mparivahan/RC/RcInterface/RcService;", "J1", "(Lcom/nic/mparivahan/RC/RcInterface/RcService;)V", "mRcService", "Lcom/zepto/wa3;", "L", "Lcom/zepto/wa3;", "q1", "()Lcom/zepto/wa3;", "G1", "(Lcom/zepto/wa3;)V", "langSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VirtualDlActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ut1 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public DatabaseHelper databaseHelper;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public is1 mDlViewModel;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public DlService mDlService;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public DldetobjX dl_data;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public a55 mRcViewModel;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public RcService mRcService;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public wa3 langSession;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(UpdateDocSuccessResponse updateDocSuccessResponse) {
            if (Intrinsics.areEqual(updateDocSuccessResponse.getStatusCode(), "VTLD001")) {
                VirtualDlActivity.this.s1().j(StringsKt__StringsKt.trim((CharSequence) VirtualDlActivity.this.p1().getDlobj().getDlLicno().toString()).toString(), k18.a.b(StringsKt__StringsKt.trim((CharSequence) VirtualDlActivity.this.p1().getBioObj().getBioDob().toString()).toString()), VirtualDlActivity.this);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((UpdateDocSuccessResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
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
            if (VirtualDlActivity.this.v1().isShowing()) {
                VirtualDlActivity.this.v1().dismiss();
            }
            VirtualDlActivity virtualDlActivity = VirtualDlActivity.this;
            virtualDlActivity.N1(virtualDlActivity, "Unable to update the Virtual DL, Please try after some time!");
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(DLServiceResponseModleV1 dLServiceResponseModleV1) throws Throwable {
            DlobjX dlobj;
            DlobjX dlobj2;
            DlobjX dlobj3;
            try {
                if (VirtualDlActivity.this.v1().isShowing()) {
                    VirtualDlActivity.this.v1().dismiss();
                }
                try {
                    VirtualDlActivity.this.o1().P0(StringsKt__StringsKt.trim((CharSequence) dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlLicno()).toString(), dLServiceResponseModleV1.getDldetobj().get(0));
                    VirtualDlActivity.this.n1().h.setText(dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioSwdFullName());
                    VirtualDlActivity.this.n1().b.setText(dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioPermAdd1() + ' ' + dLServiceResponseModleV1.getDldetobj().get(0).getBioObj().getBioPermAdd2());
                    VirtualDlActivity.this.n1().e.setText(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlIssuedt());
                    DldetobjX dldetobjX = dLServiceResponseModleV1.getDldetobj().get(0);
                    String dlNtValdtoDt = null;
                    String dlNtValdtoDt2 = (dldetobjX == null || (dlobj3 = dldetobjX.getDlobj()) == null) ? null : dlobj3.getDlNtValdtoDt();
                    if (dlNtValdtoDt2 != null && dlNtValdtoDt2.length() != 0) {
                        TextView textView = VirtualDlActivity.this.n1().f;
                        k18.a aVar = k18.a;
                        DldetobjX dldetobjX2 = dLServiceResponseModleV1.getDldetobj().get(0);
                        if (dldetobjX2 != null && (dlobj2 = dldetobjX2.getDlobj()) != null) {
                            dlNtValdtoDt = dlobj2.getDlTrValdtoDt();
                        }
                        textView.setText(aVar.f(String.valueOf(dlNtValdtoDt)));
                        return;
                    }
                    TextView textView2 = VirtualDlActivity.this.n1().f;
                    k18.a aVar2 = k18.a;
                    DldetobjX dldetobjX3 = dLServiceResponseModleV1.getDldetobj().get(0);
                    if (dldetobjX3 != null && (dlobj = dldetobjX3.getDlobj()) != null) {
                        dlNtValdtoDt = dlobj.getDlNtValdtoDt();
                    }
                    textView2.setText(aVar2.f(String.valueOf(dlNtValdtoDt)));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                if (VirtualDlActivity.this.v1().isShowing()) {
                    VirtualDlActivity.this.v1().dismiss();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((DLServiceResponseModleV1) obj);
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

        public final void invoke(String str) {
            try {
                if (VirtualDlActivity.this.v1().isShowing()) {
                    VirtualDlActivity.this.v1().dismiss();
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (VirtualDlActivity.this.v1().isShowing()) {
                    VirtualDlActivity.this.v1().dismiss();
                }
            }
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
        public final void a(DLServiceResponseModleV1 dLServiceResponseModleV1) throws Throwable {
            try {
                if (VirtualDlActivity.this.v1().isShowing()) {
                    VirtualDlActivity.this.v1().dismiss();
                }
                try {
                    VirtualDlActivity.this.o1().P0(StringsKt__StringsKt.trim((CharSequence) dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlLicno()).toString(), dLServiceResponseModleV1.getDldetobj().get(0));
                    VirtualDlActivity virtualDlActivity = VirtualDlActivity.this;
                    virtualDlActivity.N1(virtualDlActivity, "Virtual DL Successfully updated!");
                } catch (Exception e) {
                    e.printStackTrace();
                    VirtualDlActivity virtualDlActivity2 = VirtualDlActivity.this;
                    virtualDlActivity2.N1(virtualDlActivity2, "Unable to update the Virtual DL, Please try after some time!");
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                if (VirtualDlActivity.this.v1().isShowing()) {
                    VirtualDlActivity.this.v1().dismiss();
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((DLServiceResponseModleV1) obj);
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
            try {
                if (VirtualDlActivity.this.v1().isShowing()) {
                    VirtualDlActivity.this.v1().dismiss();
                }
                VirtualDlActivity virtualDlActivity = VirtualDlActivity.this;
                virtualDlActivity.N1(virtualDlActivity, "Unable to update the Virtual DL, Please try after some time!");
            } catch (Exception e) {
                e.printStackTrace();
                if (VirtualDlActivity.this.v1().isShowing()) {
                    VirtualDlActivity.this.v1().dismiss();
                }
            }
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
                VirtualDlActivity.this.v1().dismiss();
                if (StringsKt__StringsJVMKt.equals(myRcDeletResponse.getStatusCode(), "VTLD001", true)) {
                    try {
                        VirtualDlActivity.this.o1().e0();
                        VirtualDlActivity virtualDlActivity = VirtualDlActivity.this;
                        virtualDlActivity.N1(virtualDlActivity, "Virtual DL successfully deleted!");
                        VirtualDlActivity.this.E1();
                    } catch (Exception e) {
                        e.printStackTrace();
                        Toast.makeText(VirtualDlActivity.this.getApplicationContext(), "Unable to delete the Virtual DL, Please try after some times", 1).show();
                    }
                } else if (StringsKt__StringsJVMKt.equals(myRcDeletResponse.getStatusCode(), "VTLD007", true)) {
                    Toast.makeText(VirtualDlActivity.this.getApplicationContext(), "Unable to delete the Virtual DL, Please try after some times", 1).show();
                } else {
                    Toast.makeText(VirtualDlActivity.this.getApplicationContext(), "Unable to delete the Virtual DL, Please try after some times", 1).show();
                }
            } catch (Exception e2) {
                if (VirtualDlActivity.this.v1().isShowing()) {
                    VirtualDlActivity.this.v1().dismiss();
                }
                e2.printStackTrace();
                Toast.makeText(VirtualDlActivity.this.getApplicationContext(), "Unable to delete the Virtual DL, Please try after some times", 1).show();
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
            if (VirtualDlActivity.this.v1().isShowing()) {
                VirtualDlActivity.this.v1().dismiss();
            }
            Toast.makeText(VirtualDlActivity.this.getApplicationContext(), "Unable to delete the Virtual DL, Please try after some times", 1).show();
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final boolean A1(VirtualDlActivity this$0, MenuItem menuItem) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        switch (menuItem.getItemId()) {
            case R.id.menu1 /* 2131363697 */:
                this$0.startActivity(new Intent(this$0, (Class<?>) DLVirtualRcScreen.class));
                return false;
            case R.id.menu2 /* 2131363698 */:
                try {
                    if (this$0.v1().isShowing()) {
                        this$0.v1().dismiss();
                    }
                    this$0.v1().show();
                    DldetobjX dldetails = ((DLDocument) this$0.o1().z0().get(0)).getDldetails();
                    Intrinsics.checkNotNull(dldetails);
                    this$0.F1(dldetails);
                    String strB0 = this$0.o1().B0(StringsKt__StringsKt.trim((CharSequence) this$0.p1().getDlobj().getDlLicno()).toString());
                    is1 is1VarS1 = this$0.s1();
                    Intrinsics.checkNotNull(strB0);
                    is1VarS1.E(strB0, "DL", k18.a.a(StringsKt__StringsKt.trim((CharSequence) this$0.p1().getBioObj().getBioDob()).toString()), this$0);
                    break;
                } catch (Exception unused) {
                    if (this$0.v1().isShowing()) {
                        this$0.v1().dismiss();
                    }
                }
                return false;
            case R.id.menu3 /* 2131363699 */:
                if (this$0.n1().d.getText().toString().length() > 0) {
                    try {
                        if (this$0.v1().isShowing()) {
                            this$0.v1().dismiss();
                        }
                        this$0.v1().show();
                        String strB02 = this$0.o1().B0(new Regex("\\s").replace(this$0.n1().d.getText().toString(), ""));
                        if (strB02 != null && strB02.length() != 0) {
                            a55 a55VarU1 = this$0.u1();
                            Intrinsics.checkNotNull(strB02);
                            a55VarU1.g(strB02, this$0);
                        }
                    } catch (Exception e2) {
                        if (this$0.v1().isShowing()) {
                            this$0.v1().dismiss();
                        }
                        e2.printStackTrace();
                    }
                    break;
                }
                return false;
            default:
                return false;
        }
    }

    private final void B1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public static final void O1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void w1() throws Throwable {
        n1().i.setNestedScrollingEnabled(false);
        n1().k.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rs7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirtualDlActivity.x1(this.a, view);
            }
        });
        n1().k.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ss7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirtualDlActivity.y1(this.a, view);
            }
        });
        K1((a55) new z(this, new b55(new s45(t1()))).a(a55.class));
        I1((is1) new z(this, new js1(new jp1(r1()))).a(is1.class));
        E1();
        n1().g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ts7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirtualDlActivity.z1(this.a, view);
            }
        });
        s1().r().g(this, new i(new c()));
        s1().s().g(this, new i(new d()));
        s1().n().g(this, new i(new e()));
        s1().o().g(this, new i(new f()));
        u1().x().g(this, new i(new g()));
        u1().y().g(this, new i(new h()));
        s1().y().g(this, new i(new a()));
        s1().x().g(this, new i(new b()));
    }

    public static final void x1(VirtualDlActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void y1(VirtualDlActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.B1();
    }

    public static final void z1(final VirtualDlActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PopupMenu popupMenu = new PopupMenu(this$0, this$0.n1().g);
        popupMenu.inflate(R.menu.dl_menu);
        popupMenu.setGravity(5);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.zepto.vs7
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return VirtualDlActivity.A1(this.a, menuItem);
            }
        });
        popupMenu.show();
    }

    public final void C1(ut1 ut1Var) {
        Intrinsics.checkNotNullParameter(ut1Var, "<set-?>");
        this.binding = ut1Var;
    }

    public final void D1(DatabaseHelper databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "<set-?>");
        this.databaseHelper = databaseHelper;
    }

    public final void E1() throws Throwable {
        BioObjX bioObj;
        if (o1().z0() == null) {
            n1().c.setVisibility(8);
            n1().j.setVisibility(0);
            n1().j.setText("No Virtual DL Found");
            return;
        }
        n1().j.setVisibility(8);
        n1().c.setVisibility(0);
        ArrayList arrayListZ0 = o1().z0();
        DldetobjX dldetails = ((DLDocument) arrayListZ0.get(0)).getDldetails();
        String docnumber = ((DLDocument) arrayListZ0.get(0)).getDocnumber();
        if (docnumber == null || docnumber.length() == 0) {
            return;
        }
        n1().d.setText(String.valueOf(((DLDocument) arrayListZ0.get(0)).getDocnumber()));
        if (((DLDocument) arrayListZ0.get(0)).getDldetails() == null) {
            v1().show();
            s1().i(String.valueOf(((DLDocument) arrayListZ0.get(0)).getDocnumber()), StringsKt__StringsKt.trim((CharSequence) String.valueOf(((DLDocument) arrayListZ0.get(0)).getDob())).toString(), this);
            return;
        }
        TextView textView = n1().h;
        DldetobjX dldetails2 = ((DLDocument) arrayListZ0.get(0)).getDldetails();
        textView.setText((dldetails2 == null || (bioObj = dldetails2.getBioObj()) == null) ? null : bioObj.getBioFullName());
        TextView textView2 = n1().b;
        StringBuilder sb = new StringBuilder();
        BioObjX bioObj2 = dldetails != null ? dldetails.getBioObj() : null;
        Intrinsics.checkNotNull(bioObj2);
        sb.append(bioObj2.getBioPermAdd1());
        sb.append(' ');
        sb.append(dldetails.getBioObj().getBioPermAdd2());
        textView2.setText(sb.toString());
        TextView textView3 = n1().e;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Issue Date :");
        k18.a aVar = k18.a;
        sb2.append(aVar.f(dldetails.getDlobj().getDlIssuedt()));
        textView3.setText(sb2.toString());
        n1().e.setText(q1().b("issue_date", "Issue Date") + " - " + aVar.f(dldetails.getDlobj().getDlIssuedt()));
        n1().l.setVisibility(8);
        DlobjX dlobj = dldetails.getDlobj();
        String dlNtValdtoDt = dlobj != null ? dlobj.getDlNtValdtoDt() : null;
        if (dlNtValdtoDt == null || dlNtValdtoDt.length() == 0) {
            TextView textView4 = n1().f;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(q1().b("label_dl_serv_valid_upto", "Valid Upto"));
            sb3.append(' ');
            DlobjX dlobj2 = dldetails.getDlobj();
            sb3.append(aVar.f(String.valueOf(dlobj2 != null ? dlobj2.getDlTrValdtoDt() : null)));
            textView4.setText(sb3.toString());
            return;
        }
        Log.e("details", "call2");
        TextView textView5 = n1().f;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(q1().b("label_dl_serv_valid_upto", "Valid Upto"));
        sb4.append(' ');
        DlobjX dlobj3 = dldetails.getDlobj();
        sb4.append(aVar.f(String.valueOf(dlobj3 != null ? dlobj3.getDlNtValdtoDt() : null)));
        textView5.setText(sb4.toString());
    }

    public final void F1(DldetobjX dldetobjX) {
        Intrinsics.checkNotNullParameter(dldetobjX, "<set-?>");
        this.dl_data = dldetobjX;
    }

    public final void G1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void H1(DlService dlService) {
        Intrinsics.checkNotNullParameter(dlService, "<set-?>");
        this.mDlService = dlService;
    }

    public final void I1(is1 is1Var) {
        Intrinsics.checkNotNullParameter(is1Var, "<set-?>");
        this.mDlViewModel = is1Var;
    }

    public final void J1(RcService rcService) {
        Intrinsics.checkNotNullParameter(rcService, "<set-?>");
        this.mRcService = rcService;
    }

    public final void K1(a55 a55Var) {
        Intrinsics.checkNotNullParameter(a55Var, "<set-?>");
        this.mRcViewModel = a55Var;
    }

    public final void L1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void M1(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final void N1(Context context, String message) {
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
        ((TextView) viewFindViewById3).setText(q1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(q1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.us7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirtualDlActivity.O1(dialog, view);
            }
        });
        dialog.show();
    }

    public final ut1 n1() {
        ut1 ut1Var = this.binding;
        if (ut1Var != null) {
            return ut1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final DatabaseHelper o1() {
        DatabaseHelper databaseHelper = this.databaseHelper;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("databaseHelper");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doc_virtual_dl);
        ut1 ut1VarC = ut1.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(ut1VarC, "inflate(...)");
        C1(ut1VarC);
        setContentView(n1().b());
        G1(new wa3(this));
        J1(RcService.INSTANCE.a(this));
        H1(DlService.INSTANCE.a(this));
        M1(new ws6(this));
        DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(this);
        Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
        D1(databaseHelperD0);
        L1(new ProgressDialog(this));
        v1().setMessage("Please wait...");
        v1().setCancelable(false);
        v1().setCanceledOnTouchOutside(false);
        w1();
    }

    public final DldetobjX p1() {
        DldetobjX dldetobjX = this.dl_data;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dl_data");
        return null;
    }

    public final wa3 q1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final DlService r1() {
        DlService dlService = this.mDlService;
        if (dlService != null) {
            return dlService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDlService");
        return null;
    }

    public final is1 s1() {
        is1 is1Var = this.mDlViewModel;
        if (is1Var != null) {
            return is1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDlViewModel");
        return null;
    }

    public final RcService t1() {
        RcService rcService = this.mRcService;
        if (rcService != null) {
            return rcService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRcService");
        return null;
    }

    public final a55 u1() {
        a55 a55Var = this.mRcViewModel;
        if (a55Var != null) {
            return a55Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRcViewModel");
        return null;
    }

    public final ProgressDialog v1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }
}
