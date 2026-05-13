package com.nic.mparivahan.dlservices.ui.ViewDocs;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.temp.InsertedDocBeanItem;
import com.nic.mparivahan.dlservices.data.model.temp.InsertedUploadDocResponse;
import com.nic.mparivahan.dlservices.ui.ViewDocs.ViewDocScreen;
import com.zepto.au1;
import com.zepto.fm1;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.q44;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wh;
import com.zepto.wl5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b6\u00107J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u001a\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010!\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/nic/mparivahan/dlservices/ui/ViewDocs/ViewDocScreen;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/content/Context;", "context", "", "message", "r1", "Lcom/zepto/wh;", "C", "Lcom/zepto/wh;", "n1", "()Lcom/zepto/wh;", "v1", "(Lcom/zepto/wh;)V", "mBinding", "Lcom/zepto/fm1;", "D", "Lcom/zepto/fm1;", "viewModel", "E", "Ljava/lang/String;", "m1", "()Ljava/lang/String;", "u1", "(Ljava/lang/String;)V", "mApplicationNumber", "F", "p1", "x1", "stateCode", "Landroid/app/ProgressDialog;", "G", "Landroid/app/ProgressDialog;", "dialog", "Lcom/zepto/wa3;", "H", "Lcom/zepto/wa3;", "l1", "()Lcom/zepto/wa3;", "t1", "(Lcom/zepto/wa3;)V", "langSession", "Lcom/zepto/wl5;", "I", "Lcom/zepto/wl5;", "o1", "()Lcom/zepto/wl5;", "w1", "(Lcom/zepto/wl5;)V", "sarathiSession", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class ViewDocScreen extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public wh mBinding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public fm1 viewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public String mApplicationNumber;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String stateCode;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ProgressDialog dialog;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public wa3 langSession;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public wl5 sarathiSession;

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
        public final void a(InsertedUploadDocResponse insertedUploadDocResponse) {
            Log.d("dlInsertedDocStatus", insertedUploadDocResponse.toString());
            ProgressDialog progressDialog = ViewDocScreen.this.dialog;
            if (progressDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                progressDialog = null;
            }
            progressDialog.dismiss();
            try {
                ViewDocScreen.this.n1().b.setLayoutManager(new LinearLayoutManager(ViewDocScreen.this));
                ViewDocScreen.this.n1().b.setAdapter(null);
                List<InsertedDocBeanItem> insertedDocBean = insertedUploadDocResponse.getInsertedDocBean();
                Intrinsics.checkNotNull(insertedDocBean, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.dlservices.data.model.temp.InsertedDocBeanItem>");
                ViewDocScreen viewDocScreen = ViewDocScreen.this;
                ViewDocScreen.this.n1().b.setAdapter(new au1((ArrayList) insertedDocBean, viewDocScreen, viewDocScreen.m1(), ViewDocScreen.this.p1()));
            } catch (Exception unused) {
                ViewDocScreen viewDocScreen2 = ViewDocScreen.this;
                viewDocScreen2.r1(viewDocScreen2, "Something went wrong,Please try after some time!");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InsertedUploadDocResponse) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public b(Function1 function) {
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

    public static final void q1(ViewDocScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void s1(Dialog d, ViewDocScreen this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.finish();
    }

    public final wa3 l1() {
        wa3 wa3Var = this.langSession;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("langSession");
        return null;
    }

    public final String m1() {
        String str = this.mApplicationNumber;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mApplicationNumber");
        return null;
    }

    public final wh n1() {
        wh whVar = this.mBinding;
        if (whVar != null) {
            return whVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    public final wl5 o1() {
        wl5 wl5Var = this.sarathiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarathiSession");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        String strP1;
        super.onCreate(savedInstanceState);
        wh whVarC = wh.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(whVarC, "inflate(...)");
        v1(whVarC);
        setContentView(n1().b());
        t1(new wa3(this));
        ta3.a.o(this, n1());
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.dialog = progressDialog;
        progressDialog.setMessage(l1().b("label_challan_please_wait", "Please wait..."));
        if (getIntent() != null) {
            try {
                String stringExtra = getIntent().getStringExtra("app_no");
                Intrinsics.checkNotNull(stringExtra, "null cannot be cast to non-null type kotlin.String");
                u1(stringExtra);
                String stringExtra2 = getIntent().getStringExtra("stateCode");
                Intrinsics.checkNotNull(stringExtra2, "null cannot be cast to non-null type kotlin.String");
                x1(stringExtra2);
            } catch (Exception e) {
                Log.d("errors", e.getLocalizedMessage());
            }
        }
        w1(new wl5(this));
        n1().d.f.setText(o1().k());
        n1().d.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mq7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewDocScreen.q1(this.a, view);
            }
        });
        this.viewModel = (fm1) new z(this).a(fm1.class);
        String strM1 = m1();
        fm1 fm1Var = null;
        if (strM1 != null && strM1.length() != 0 && (strP1 = p1()) != null && strP1.length() != 0) {
            if (q44.a.a(this)) {
                ProgressDialog progressDialog2 = this.dialog;
                if (progressDialog2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                    progressDialog2 = null;
                }
                progressDialog2.show();
                fm1 fm1Var2 = this.viewModel;
                if (fm1Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    fm1Var2 = null;
                }
                fm1Var2.p(m1(), p1());
            } else {
                r1(this, l1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)));
            }
        }
        fm1 fm1Var3 = this.viewModel;
        if (fm1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            fm1Var = fm1Var3;
        }
        fm1Var.l().g(this, new b(new a()));
    }

    public final String p1() {
        String str = this.stateCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stateCode");
        return null;
    }

    public final void r1(Context context, String message) {
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
        ((TextView) viewFindViewById3).setText(l1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(l1().b("btn_ok", "OK"));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nq7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewDocScreen.s1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public final void t1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.langSession = wa3Var;
    }

    public final void u1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mApplicationNumber = str;
    }

    public final void v1(wh whVar) {
        Intrinsics.checkNotNullParameter(whVar, "<set-?>");
        this.mBinding = whVar;
    }

    public final void w1(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarathiSession = wl5Var;
    }

    public final void x1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCode = str;
    }
}
