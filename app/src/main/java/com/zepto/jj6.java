package com.zepto;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.nic.mparivahan.Citizen.Interfaces.OffenceInterface;
import com.nic.mparivahan.Citizen.Models.GetDashboardPojo;
import com.nic.mparivahan.Citizen.Models.GetLastViolation;
import com.nic.mparivahan.R;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b=\u0010>J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0014\u0010<\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lcom/zepto/jj6;", "Lcom/zepto/sf2;", "Landroid/os/Bundle;", "savedInstanceState", "", "C0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "G0", "view", "b1", "Lcom/zepto/pj6;", "d0", "Lcom/zepto/pj6;", "_binding", "Lcom/zepto/vf4;", "e0", "Lcom/zepto/vf4;", "d2", "()Lcom/zepto/vf4;", "m2", "(Lcom/zepto/vf4;)V", "mOffenceViewModel", "Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;", "f0", "Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;", "c2", "()Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;", "l2", "(Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;)V", "mOffenceInterface", "Landroid/content/Context;", "g0", "Landroid/content/Context;", "b2", "()Landroid/content/Context;", "k2", "(Landroid/content/Context;)V", "mContext", "Landroid/app/ProgressDialog;", "h0", "Landroid/app/ProgressDialog;", "e2", "()Landroid/app/ProgressDialog;", "n2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/ws6;", "i0", "Lcom/zepto/ws6;", "f2", "()Lcom/zepto/ws6;", "o2", "(Lcom/zepto/ws6;)V", "sessionManager", "a2", "()Lcom/zepto/pj6;", "binding", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class jj6 extends sf2 {

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public pj6 _binding;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public vf4 mOffenceViewModel;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public OffenceInterface mOffenceInterface;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public ws6 sessionManager;

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
            jj6.this.e2().dismiss();
            jj6.this.a2().f.setVisibility(8);
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
            jj6.this.e2().dismiss();
            jj6.this.a2().h.setVisibility(8);
        }
    }

    public static final class c implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public c(Function1 function) {
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

    public static final void g2(jj6 this$0, GetLastViolation getLastViolation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.e2().dismiss();
            if (!StringsKt__StringsJVMKt.equals(getLastViolation.getStatusCode().toString(), "TRV001", true)) {
                if (Intrinsics.areEqual(getLastViolation.getStatusCode(), "TRV099")) {
                    this$0.a2().f.setVisibility(8);
                    this$0.a2().j.setVisibility(0);
                    return;
                } else {
                    this$0.a2().f.setVisibility(8);
                    this$0.a2().j.setVisibility(0);
                    this$0.e2().dismiss();
                    return;
                }
            }
            this$0.a2().j.setVisibility(8);
            this$0.a2().f.setVisibility(0);
            this$0.a2().k.setText(getLastViolation.getCitizenViolation().getViolRegnNo());
            if (getLastViolation.getCitizenViolation().getViolSubmittedAt().length() > 8) {
                this$0.a2().l.setText(getLastViolation.getCitizenViolation().getViolSubmittedAt());
            } else {
                this$0.a2().l.setText("Not Available");
            }
            if (getLastViolation.getCitizenViolation().getViolStatus() == 0) {
                this$0.a2().n.setText("Pending");
            } else {
                this$0.a2().n.setText("Active");
            }
            this$0.a2().m.setText(getLastViolation.getCitizenViolation().getViolLocation());
        } catch (Exception e) {
            e.printStackTrace();
            this$0.e2().dismiss();
            this$0.a2().f.setVisibility(8);
            this$0.a2().j.setVisibility(0);
        }
    }

    public static final void h2(jj6 this$0, GetDashboardPojo getDashboardPojo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.e2().dismiss();
            if (StringsKt__StringsJVMKt.equals(getDashboardPojo.getStatusCode().toString(), "TRV001", true)) {
                this$0.a2().h.setVisibility(0);
                this$0.a2().i.setLayoutManager(new LinearLayoutManager(this$0.E1()));
                this$0.a2().i.setAdapter(new e65(getDashboardPojo.getContents(), this$0.b2()));
            } else if (Intrinsics.areEqual(getDashboardPojo.getStatusCode(), "TRV099")) {
                this$0.e2().dismiss();
                this$0.a2().h.setVisibility(8);
            } else {
                this$0.e2().dismiss();
                this$0.a2().h.setVisibility(8);
            }
        } catch (Exception e) {
            e.printStackTrace();
            this$0.e2().dismiss();
            this$0.a2().h.setVisibility(8);
        }
    }

    public static final void i2(jj6 this$0, View view) {
        mg2 mg2VarI0;
        dh2 dh2VarN;
        dh2 dh2VarO;
        dh2 dh2VarG;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        pb5 pb5Var = new pb5();
        yf2 yf2VarN = this$0.n();
        if (yf2VarN == null || (mg2VarI0 = yf2VarN.I0()) == null || (dh2VarN = mg2VarI0.n()) == null || (dh2VarO = dh2VarN.o(R.id.main_activity_fragmentContainer, pb5Var)) == null || (dh2VarG = dh2VarO.g(null)) == null) {
            return;
        }
        dh2VarG.h();
    }

    public static final void j2(jj6 this$0, View view) {
        mg2 mg2VarI0;
        dh2 dh2VarN;
        dh2 dh2VarO;
        dh2 dh2VarG;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        it0 it0Var = new it0();
        yf2 yf2VarN = this$0.n();
        if (yf2VarN == null || (mg2VarI0 = yf2VarN.I0()) == null || (dh2VarN = mg2VarI0.n()) == null || (dh2VarO = dh2VarN.o(R.id.main_activity_fragmentContainer, it0Var)) == null || (dh2VarG = dh2VarO.g(null)) == null) {
            return;
        }
        dh2VarG.h();
    }

    @Override // com.zepto.sf2
    public void C0(Bundle savedInstanceState) {
        super.C0(savedInstanceState);
    }

    @Override // com.zepto.sf2
    public View G0(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = pj6.c(inflater, container, false);
        return a2().b();
    }

    public final pj6 a2() {
        pj6 pj6Var = this._binding;
        Intrinsics.checkNotNull(pj6Var);
        return pj6Var;
    }

    @Override // com.zepto.sf2
    public void b1(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        yf2 yf2VarE1 = E1();
        Intrinsics.checkNotNullExpressionValue(yf2VarE1, "requireActivity(...)");
        k2(yf2VarE1);
        o2(new ws6(E1()));
        l2(OffenceInterface.INSTANCE.a(b2()));
        n2(new ProgressDialog(E1()));
        e2().setMessage("Please wait...");
        e2().setCancelable(false);
        e2().setCanceledOnTouchOutside(false);
        m2((vf4) new androidx.lifecycle.z(this, new uf4(new of4(c2()))).a(vf4.class));
        d2().D(f2().k());
        yf2 yf2VarN = n();
        if (yf2VarN != null) {
            d2().y().g(yf2VarN, new mf4() { // from class: com.zepto.fj6
                @Override // com.zepto.mf4
                public final void a(Object obj) {
                    jj6.g2(this.a, (GetLastViolation) obj);
                }
            });
        }
        yf2 yf2VarN2 = n();
        if (yf2VarN2 != null) {
            d2().o().g(yf2VarN2, new c(new a()));
        }
        d2().k(f2().k());
        yf2 yf2VarN3 = n();
        if (yf2VarN3 != null) {
            d2().w().g(yf2VarN3, new mf4() { // from class: com.zepto.gj6
                @Override // com.zepto.mf4
                public final void a(Object obj) {
                    jj6.h2(this.a, (GetDashboardPojo) obj);
                }
            });
        }
        yf2 yf2VarN4 = n();
        if (yf2VarN4 != null) {
            d2().o().g(yf2VarN4, new c(new b()));
        }
        a2().g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hj6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                jj6.i2(this.a, view2);
            }
        });
        a2().d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ij6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                jj6.j2(this.a, view2);
            }
        });
        super.b1(view, savedInstanceState);
    }

    public final Context b2() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final OffenceInterface c2() {
        OffenceInterface offenceInterface = this.mOffenceInterface;
        if (offenceInterface != null) {
            return offenceInterface;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mOffenceInterface");
        return null;
    }

    public final vf4 d2() {
        vf4 vf4Var = this.mOffenceViewModel;
        if (vf4Var != null) {
            return vf4Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mOffenceViewModel");
        return null;
    }

    public final ProgressDialog e2() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final ws6 f2() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final void k2(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void l2(OffenceInterface offenceInterface) {
        Intrinsics.checkNotNullParameter(offenceInterface, "<set-?>");
        this.mOffenceInterface = offenceInterface;
    }

    public final void m2(vf4 vf4Var) {
        Intrinsics.checkNotNullParameter(vf4Var, "<set-?>");
        this.mOffenceViewModel = vf4Var;
    }

    public final void n2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void o2(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }
}
