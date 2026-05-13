package com.nic.mparivahan.Citizen.Activities;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.Citizen.Activities.TrafficFeedback;
import com.nic.mparivahan.Citizen.Interfaces.OffenceInterface;
import com.nic.mparivahan.Citizen.Models.SaveVioFeedBack;
import com.nic.mparivahan.R;
import com.zepto.gd1;
import com.zepto.mf4;
import com.zepto.of4;
import com.zepto.pq;
import com.zepto.rg;
import com.zepto.ta3;
import com.zepto.uf4;
import com.zepto.vf4;
import com.zepto.wa3;
import com.zepto.ws6;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bY\u0010ZJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\"\u0010!\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\"\u0010%\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010@\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006["}, d2 = {"Lcom/nic/mparivahan/Citizen/Activities/TrafficFeedback;", "Lcom/zepto/pq;", "", "r1", "", "message", "A1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Context;", "C", "Landroid/content/Context;", "t1", "()Landroid/content/Context;", "H1", "(Landroid/content/Context;)V", "mContext", "Landroid/widget/TextView;", "D", "Landroid/widget/TextView;", "q1", "()Landroid/widget/TextView;", "G1", "(Landroid/widget/TextView;)V", "evName", "E", "p1", "F1", "evEmailId", "F", "o1", "E1", "evDescription", "G", "n1", "D1", "btnFeedbak", "Lcom/zepto/ws6;", "H", "Lcom/zepto/ws6;", "w1", "()Lcom/zepto/ws6;", "K1", "(Lcom/zepto/ws6;)V", "sessionManager", "Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;", "I", "Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;", "mOffenceInterface", "Lcom/zepto/vf4;", "J", "Lcom/zepto/vf4;", "u1", "()Lcom/zepto/vf4;", "I1", "(Lcom/zepto/vf4;)V", "mOffenceViewModel", "K", "Ljava/lang/String;", "y1", "()Ljava/lang/String;", "M1", "(Ljava/lang/String;)V", "violOffenceId", "Landroid/widget/ProgressBar;", "L", "Landroid/widget/ProgressBar;", "x1", "()Landroid/widget/ProgressBar;", "L1", "(Landroid/widget/ProgressBar;)V", "traffic_feedback_progress", "Lcom/zepto/wa3;", "M", "Lcom/zepto/wa3;", "v1", "()Lcom/zepto/wa3;", "J1", "(Lcom/zepto/wa3;)V", "session", "Lcom/zepto/rg;", "N", "Lcom/zepto/rg;", "m1", "()Lcom/zepto/rg;", "C1", "(Lcom/zepto/rg;)V", "binding", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class TrafficFeedback extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public TextView evName;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public TextView evEmailId;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public TextView evDescription;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public TextView btnFeedbak;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public OffenceInterface mOffenceInterface;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public vf4 mOffenceViewModel;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String violOffenceId;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public ProgressBar traffic_feedback_progress;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public rg binding;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(SaveVioFeedBack saveVioFeedBack) {
            try {
                TrafficFeedback.this.x1().setVisibility(8);
                if (Intrinsics.areEqual(saveVioFeedBack.getStatusCode(), "TRV001")) {
                    TrafficFeedback.this.A1("Feedback submitted successfully");
                } else {
                    TrafficFeedback.this.x1().setVisibility(8);
                    TrafficFeedback.this.A1(saveVioFeedBack.getStatusDesc());
                }
            } catch (Exception unused) {
                TrafficFeedback.this.x1().setVisibility(8);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SaveVioFeedBack) obj);
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
            TrafficFeedback.this.x1().setVisibility(8);
            TrafficFeedback.this.A1("Something went wrong,Please try after some time!");
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void A1(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById).setText(message);
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sj6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficFeedback.B1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void B1(Dialog d, TrafficFeedback this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        this$0.finish();
    }

    private final void r1() {
        View viewFindViewById = findViewById(R.id.ev_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        G1((TextView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.ev_email_id);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        F1((TextView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.editTextTextMultiLine);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        E1((TextView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.btn_feedback);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        D1((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.traffic_feedback_progress);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        L1((ProgressBar) viewFindViewById5);
        if (w1().u()) {
            q1().setText(w1().n());
            if (gd1.a.m(w1().h())) {
                p1().setText("NA");
            } else {
                p1().setText(w1().h());
            }
        }
        OffenceInterface offenceInterface = this.mOffenceInterface;
        if (offenceInterface == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOffenceInterface");
            offenceInterface = null;
        }
        I1((vf4) new z(this, new uf4(new of4(offenceInterface))).a(vf4.class));
        u1().L().g(this, new c(new a()));
        u1().I().g(this, new c(new b()));
        n1().setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rj6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficFeedback.s1(this.a, view);
            }
        });
    }

    public static final void s1(TrafficFeedback this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.m1().c.getText().length() < 30) {
            Toast.makeText(this$0.t1(), this$0.v1().b("enter_Desription", "Please enter minimum 30 characters"), 0).show();
            return;
        }
        this$0.x1().setVisibility(0);
        if (this$0.y1() != null) {
            this$0.u1().Z(StringsKt__StringsKt.trim((CharSequence) this$0.o1().getText().toString()).toString(), this$0.y1());
        }
    }

    public static final void z1(TrafficFeedback this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public final void C1(rg rgVar) {
        Intrinsics.checkNotNullParameter(rgVar, "<set-?>");
        this.binding = rgVar;
    }

    public final void D1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.btnFeedbak = textView;
    }

    public final void E1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.evDescription = textView;
    }

    public final void F1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.evEmailId = textView;
    }

    public final void G1(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.evName = textView;
    }

    public final void H1(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void I1(vf4 vf4Var) {
        Intrinsics.checkNotNullParameter(vf4Var, "<set-?>");
        this.mOffenceViewModel = vf4Var;
    }

    public final void J1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final void K1(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final void L1(ProgressBar progressBar) {
        Intrinsics.checkNotNullParameter(progressBar, "<set-?>");
        this.traffic_feedback_progress = progressBar;
    }

    public final void M1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.violOffenceId = str;
    }

    public final rg m1() {
        rg rgVar = this.binding;
        if (rgVar != null) {
            return rgVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final TextView n1() {
        TextView textView = this.btnFeedbak;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("btnFeedbak");
        return null;
    }

    public final TextView o1() {
        TextView textView = this.evDescription;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("evDescription");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        rg rgVarC = rg.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(rgVarC, "inflate(...)");
        C1(rgVarC);
        setContentView(m1().b());
        H1(this);
        K1(new ws6(this));
        J1(new wa3(this));
        ta3.a.g(this, m1());
        m1().f.g.setText(v1().b("report_traffic_violation", "Report Traffic Violation"));
        m1().f.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.qj6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficFeedback.z1(this.a, view);
            }
        });
        this.mOffenceInterface = OffenceInterface.INSTANCE.a(this);
        M1(String.valueOf(getIntent().getStringExtra("violOffenceId")));
        r1();
    }

    public final TextView p1() {
        TextView textView = this.evEmailId;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("evEmailId");
        return null;
    }

    public final TextView q1() {
        TextView textView = this.evName;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("evName");
        return null;
    }

    public final Context t1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final vf4 u1() {
        vf4 vf4Var = this.mOffenceViewModel;
        if (vf4Var != null) {
            return vf4Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mOffenceViewModel");
        return null;
    }

    public final wa3 v1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final ws6 w1() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final ProgressBar x1() {
        ProgressBar progressBar = this.traffic_feedback_progress;
        if (progressBar != null) {
            return progressBar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("traffic_feedback_progress");
        return null;
    }

    public final String y1() {
        String str = this.violOffenceId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("violOffenceId");
        return null;
    }
}
