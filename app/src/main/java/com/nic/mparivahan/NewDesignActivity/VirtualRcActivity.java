package com.nic.mparivahan.NewDesignActivity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.NewDesignActivity.VirtualRcActivity;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.MyRcDeletResponse;
import com.nic.mparivahan.RC.Model.RcModelsDet;
import com.nic.mparivahan.RC.RcInterface.RcService;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.a55;
import com.zepto.b55;
import com.zepto.e14;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.s45;
import com.zepto.uh1;
import com.zepto.vt1;
import com.zepto.ws6;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b`\u0010aJ\b\u0010\u0004\u001a\u00020\u0003H\u0003J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0015J\u001a\u0010\r\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u001a\u0010\u000f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u001a\u0010\u0013\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\tR\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u00100\u001a\b\u0012\u0004\u0012\u00020)0(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010?\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010E\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010U\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010]\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0014\u0010_\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b^\u0010@¨\u0006b"}, d2 = {"Lcom/nic/mparivahan/NewDesignActivity/VirtualRcActivity;", "Lcom/zepto/pq;", "Lcom/zepto/uh1;", "", "u1", "x1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "rc_number", "", "position", "p", "rc", "S", "Landroid/content/Context;", "context", "message", "G1", "Lcom/zepto/vt1;", "C", "Lcom/zepto/vt1;", "binding", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "D", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "m1", "()Lcom/nic/mparivahan/DB/DatabaseHelper;", "z1", "(Lcom/nic/mparivahan/DB/DatabaseHelper;)V", "databaseHelper", "Lcom/zepto/ws6;", "E", "Lcom/zepto/ws6;", "t1", "()Lcom/zepto/ws6;", "F1", "(Lcom/zepto/ws6;)V", "sessionManager", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/RC/Model/NrvDetails;", "F", "Ljava/util/ArrayList;", "l1", "()Ljava/util/ArrayList;", "y1", "(Ljava/util/ArrayList;)V", "arrayList", "Lcom/zepto/e14;", "G", "Lcom/zepto/e14;", "p1", "()Lcom/zepto/e14;", "C1", "(Lcom/zepto/e14;)V", "myRcAdapter", "H", "I", "q1", "()I", "setMyRcAdapterPosition", "(I)V", "myRcAdapterPosition", "Ljava/lang/String;", "s1", "()Ljava/lang/String;", "E1", "(Ljava/lang/String;)V", "selectedRcNumber", "Landroid/app/ProgressDialog;", "J", "Landroid/app/ProgressDialog;", "r1", "()Landroid/app/ProgressDialog;", "D1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/a55;", "K", "Lcom/zepto/a55;", "o1", "()Lcom/zepto/a55;", "B1", "(Lcom/zepto/a55;)V", "mRcViewModel", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "L", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "n1", "()Lcom/nic/mparivahan/RC/RcInterface/RcService;", "A1", "(Lcom/nic/mparivahan/RC/RcInterface/RcService;)V", "mRcService", "M", "selectedRcNo", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class VirtualRcActivity extends pq implements uh1 {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public vt1 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public DatabaseHelper databaseHelper;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ArrayList arrayList;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public e14 myRcAdapter;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public int myRcAdapterPosition;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String selectedRcNumber;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public a55 mRcViewModel;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public RcService mRcService;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public final String selectedRcNo = "";

    public static final class a extends Lambda implements Function1 {
        public a() {
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
                VirtualRcActivity.this.r1().dismiss();
                if (StringsKt__StringsJVMKt.equals(myRcDeletResponse.getStatusCode(), "VTLD001", true)) {
                    try {
                        VirtualRcActivity.this.p1().I(VirtualRcActivity.this.getMyRcAdapterPosition());
                        VirtualRcActivity.this.m1().p0(VirtualRcActivity.this.s1());
                        VirtualRcActivity virtualRcActivity = VirtualRcActivity.this;
                        virtualRcActivity.G1(virtualRcActivity, "Virtual RC successfully deleted!");
                    } catch (Exception e) {
                        e.printStackTrace();
                        Toast.makeText(VirtualRcActivity.this.getApplicationContext(), "Unable to delete the Virtual Rc, Please try after some times", 1).show();
                    }
                } else if (StringsKt__StringsJVMKt.equals(myRcDeletResponse.getStatusCode(), "VTLD007", true)) {
                    Toast.makeText(VirtualRcActivity.this.getApplicationContext(), "Unable to delete the Virtual Rc, Please try after some times", 1).show();
                } else {
                    Toast.makeText(VirtualRcActivity.this.getApplicationContext(), "Unable to delete the Virtual Rc, Please try after some times", 1).show();
                }
            } catch (Exception e2) {
                VirtualRcActivity.this.r1().dismiss();
                Log.e("error-1-", myRcDeletResponse.toString());
                e2.printStackTrace();
                Toast.makeText(VirtualRcActivity.this.getApplicationContext(), "Unable to delete the Virtual Rc, Please try after some times", 1).show();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((MyRcDeletResponse) obj);
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

        public final void invoke(String str) {
            VirtualRcActivity.this.r1().dismiss();
            Toast.makeText(VirtualRcActivity.this.getApplicationContext(), "Unable to delete the Virtual Rc, Please try after some times", 1).show();
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
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
            VirtualRcActivity.this.r1().dismiss();
            try {
                if (StringsKt__StringsJVMKt.equals(rcModelsDet.getStatusCode().toString(), "NP001", true)) {
                    VirtualRcActivity virtualRcActivity = VirtualRcActivity.this;
                    virtualRcActivity.G1(virtualRcActivity, "Virtual RC successfully updated!");
                } else {
                    VirtualRcActivity virtualRcActivity2 = VirtualRcActivity.this;
                    virtualRcActivity2.G1(virtualRcActivity2, "Unable to Update the Virtual RC, Please try after some times!");
                }
            } catch (Exception unused) {
                VirtualRcActivity.this.r1().dismiss();
                VirtualRcActivity virtualRcActivity3 = VirtualRcActivity.this;
                virtualRcActivity3.G1(virtualRcActivity3, "Unable to Update the Virtual RC, Please try after some times!");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((RcModelsDet) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        public final void a(MyRcDeletResponse myRcDeletResponse) {
            if (Intrinsics.areEqual(myRcDeletResponse.getStatusCode(), "VTLD001")) {
                VirtualRcActivity.this.o1().N(VirtualRcActivity.this.s1().toString(), VirtualRcActivity.this.t1().k(), VirtualRcActivity.this);
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
            if (VirtualRcActivity.this.r1().isShowing()) {
                VirtualRcActivity.this.r1().dismiss();
            }
            VirtualRcActivity virtualRcActivity = VirtualRcActivity.this;
            virtualRcActivity.G1(virtualRcActivity, "Unable to Update the Virtual RC, Please try after some times!");
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
    public static final void H1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    private final void u1() throws Throwable {
        B1((a55) new z(this, new b55(new s45(n1()))).a(a55.class));
        vt1 vt1Var = this.binding;
        vt1 vt1Var2 = null;
        if (vt1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vt1Var = null;
        }
        vt1Var.d.setNestedScrollingEnabled(false);
        vt1 vt1Var3 = this.binding;
        if (vt1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vt1Var3 = null;
        }
        vt1Var3.f.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nt7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirtualRcActivity.v1(this.a, view);
            }
        });
        vt1 vt1Var4 = this.binding;
        if (vt1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vt1Var4 = null;
        }
        vt1Var4.f.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ot7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirtualRcActivity.w1(this.a, view);
            }
        });
        vt1 vt1Var5 = this.binding;
        if (vt1Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vt1Var5 = null;
        }
        vt1Var5.c.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        ArrayList arrayListG0 = m1().G0();
        Intrinsics.checkNotNull(arrayListG0, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.NrvDetails>");
        y1(arrayListG0);
        if (l1().size() > 0) {
            Log.e("test", VContant.MAINSCREEN);
            vt1 vt1Var6 = this.binding;
            if (vt1Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                vt1Var6 = null;
            }
            vt1Var6.e.setVisibility(8);
            vt1 vt1Var7 = this.binding;
            if (vt1Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                vt1Var7 = null;
            }
            vt1Var7.c.setVisibility(0);
            vt1 vt1Var8 = this.binding;
            if (vt1Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                vt1Var8 = null;
            }
            vt1Var8.c.setAdapter(null);
            C1(new e14(l1(), this, this));
            vt1 vt1Var9 = this.binding;
            if (vt1Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                vt1Var2 = vt1Var9;
            }
            vt1Var2.c.setAdapter(p1());
        } else {
            vt1 vt1Var10 = this.binding;
            if (vt1Var10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                vt1Var10 = null;
            }
            vt1Var10.c.setAdapter(null);
            vt1 vt1Var11 = this.binding;
            if (vt1Var11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                vt1Var11 = null;
            }
            vt1Var11.c.setVisibility(8);
            vt1 vt1Var12 = this.binding;
            if (vt1Var12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                vt1Var12 = null;
            }
            vt1Var12.e.setVisibility(0);
            vt1 vt1Var13 = this.binding;
            if (vt1Var13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                vt1Var2 = vt1Var13;
            }
            vt1Var2.e.setText("No Virtual RC Found");
        }
        o1().z().g(this, new f(new a()));
        o1().A().g(this, new f(new b()));
        o1().O().g(this, new f(new c()));
        o1().U().g(this, new f(new d()));
        o1().T().g(this, new f(new e()));
    }

    public static final void v1(VirtualRcActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    public static final void w1(VirtualRcActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.x1();
    }

    private final void x1() {
        Intent intent = new Intent(this, (Class<?>) DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void A1(RcService rcService) {
        Intrinsics.checkNotNullParameter(rcService, "<set-?>");
        this.mRcService = rcService;
    }

    public final void B1(a55 a55Var) {
        Intrinsics.checkNotNullParameter(a55Var, "<set-?>");
        this.mRcViewModel = a55Var;
    }

    public final void C1(e14 e14Var) {
        Intrinsics.checkNotNullParameter(e14Var, "<set-?>");
        this.myRcAdapter = e14Var;
    }

    public final void D1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void E1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.selectedRcNumber = str;
    }

    public final void F1(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final void G1(Context context, String message) {
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
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.pt7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirtualRcActivity.H1(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.uh1
    public void S(String rc, int position) throws Throwable {
        if (m1().C0(rc) != null) {
            Intrinsics.checkNotNull(rc);
            E1(rc);
            r1().show();
            String strC0 = m1().C0(rc);
            a55 a55VarO1 = o1();
            Intrinsics.checkNotNull(strC0);
            a55VarO1.a0(strC0, "RC", this);
        }
    }

    public final ArrayList l1() {
        ArrayList arrayList = this.arrayList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("arrayList");
        return null;
    }

    public final DatabaseHelper m1() {
        DatabaseHelper databaseHelper = this.databaseHelper;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("databaseHelper");
        return null;
    }

    public final RcService n1() {
        RcService rcService = this.mRcService;
        if (rcService != null) {
            return rcService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRcService");
        return null;
    }

    public final a55 o1() {
        a55 a55Var = this.mRcViewModel;
        if (a55Var != null) {
            return a55Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRcViewModel");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doc_virtual_rc);
        vt1 vt1VarC = vt1.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(vt1VarC, "inflate(...)");
        this.binding = vt1VarC;
        if (vt1VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vt1VarC = null;
        }
        setContentView(vt1VarC.b());
        A1(RcService.INSTANCE.a(this));
        F1(new ws6(this));
        DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(this);
        Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
        z1(databaseHelperD0);
        D1(new ProgressDialog(this));
        r1().setMessage("Please wait...");
        r1().setCancelable(false);
        r1().setCanceledOnTouchOutside(false);
        u1();
    }

    @Override // com.zepto.uh1
    public void p(String rc_number, int position) throws Throwable {
        this.myRcAdapterPosition = position;
        E1(String.valueOf(rc_number));
        if (m1().C0(rc_number) != null) {
            r1().show();
            String strC0 = m1().C0(rc_number);
            a55 a55VarO1 = o1();
            Intrinsics.checkNotNull(strC0);
            a55VarO1.i(strC0, this);
        }
    }

    public final e14 p1() {
        e14 e14Var = this.myRcAdapter;
        if (e14Var != null) {
            return e14Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("myRcAdapter");
        return null;
    }

    /* JADX INFO: renamed from: q1, reason: from getter */
    public final int getMyRcAdapterPosition() {
        return this.myRcAdapterPosition;
    }

    public final ProgressDialog r1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String s1() {
        String str = this.selectedRcNumber;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("selectedRcNumber");
        return null;
    }

    public final ws6 t1() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final void y1(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.arrayList = arrayList;
    }

    public final void z1(DatabaseHelper databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "<set-?>");
        this.databaseHelper = databaseHelper;
    }
}
