package com.nic.mparivahan.Citizen.Activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.nic.mparivahan.Citizen.Activities.TrafficDashboardActivity;
import com.nic.mparivahan.Citizen.Interfaces.OffenceInterface;
import com.nic.mparivahan.Citizen.Models.GetDashboardPojo;
import com.nic.mparivahan.Citizen.Models.GetLastViolation;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.e65;
import com.zepto.mf4;
import com.zepto.of4;
import com.zepto.pq;
import com.zepto.qg;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b.\u0010/J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0015R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/nic/mparivahan/Citizen/Activities/TrafficDashboardActivity;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lcom/zepto/qg;", "C", "Lcom/zepto/qg;", "binding", "Lcom/zepto/vf4;", "D", "Lcom/zepto/vf4;", "p1", "()Lcom/zepto/vf4;", "y1", "(Lcom/zepto/vf4;)V", "mOffenceViewModel", "Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;", "E", "Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;", "mOffenceInterface", "Landroid/content/Context;", "F", "Landroid/content/Context;", "o1", "()Landroid/content/Context;", "x1", "(Landroid/content/Context;)V", "mContext", "Lcom/zepto/ws6;", "G", "Lcom/zepto/ws6;", "r1", "()Lcom/zepto/ws6;", "A1", "(Lcom/zepto/ws6;)V", "sessionManager", "Lcom/zepto/wa3;", "H", "Lcom/zepto/wa3;", "q1", "()Lcom/zepto/wa3;", "z1", "(Lcom/zepto/wa3;)V", "session", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class TrafficDashboardActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public qg binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public vf4 mOffenceViewModel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public OffenceInterface mOffenceInterface;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public wa3 session;

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        public final void a(GetLastViolation getLastViolation) {
            qg qgVar = TrafficDashboardActivity.this.binding;
            qg qgVar2 = null;
            if (qgVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                qgVar = null;
            }
            qgVar.s.setVisibility(8);
            try {
                Log.e("last_viol_resp", getLastViolation.toString());
                String statusCode = getLastViolation.getStatusCode();
                if (!Intrinsics.areEqual(statusCode, "TRV001")) {
                    if (Intrinsics.areEqual(statusCode, "TRV099")) {
                        qg qgVar3 = TrafficDashboardActivity.this.binding;
                        if (qgVar3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            qgVar3 = null;
                        }
                        qgVar3.e.setVisibility(8);
                        qg qgVar4 = TrafficDashboardActivity.this.binding;
                        if (qgVar4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            qgVar4 = null;
                        }
                        qgVar4.t.setVisibility(0);
                        qg qgVar5 = TrafficDashboardActivity.this.binding;
                        if (qgVar5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            qgVar5 = null;
                        }
                        qgVar5.u.setVisibility(0);
                        return;
                    }
                    qg qgVar6 = TrafficDashboardActivity.this.binding;
                    if (qgVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        qgVar6 = null;
                    }
                    qgVar6.e.setVisibility(8);
                    qg qgVar7 = TrafficDashboardActivity.this.binding;
                    if (qgVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        qgVar7 = null;
                    }
                    qgVar7.t.setVisibility(0);
                    qg qgVar8 = TrafficDashboardActivity.this.binding;
                    if (qgVar8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        qgVar8 = null;
                    }
                    qgVar8.u.setVisibility(0);
                    qg qgVar9 = TrafficDashboardActivity.this.binding;
                    if (qgVar9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        qgVar9 = null;
                    }
                    qgVar9.s.setVisibility(8);
                    return;
                }
                qg qgVar10 = TrafficDashboardActivity.this.binding;
                if (qgVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    qgVar10 = null;
                }
                qgVar10.t.setVisibility(8);
                qg qgVar11 = TrafficDashboardActivity.this.binding;
                if (qgVar11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    qgVar11 = null;
                }
                qgVar11.u.setVisibility(8);
                qg qgVar12 = TrafficDashboardActivity.this.binding;
                if (qgVar12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    qgVar12 = null;
                }
                qgVar12.e.setVisibility(0);
                qg qgVar13 = TrafficDashboardActivity.this.binding;
                if (qgVar13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    qgVar13 = null;
                }
                qgVar13.v.setText(getLastViolation.getCitizenViolation().getViolRegnNo());
                qg qgVar14 = TrafficDashboardActivity.this.binding;
                if (qgVar14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    qgVar14 = null;
                }
                qgVar14.y.setText(String.valueOf(getLastViolation.getCitizenViolation().getViolRecordId()));
                if (getLastViolation.getCitizenViolation().getViolSubmittedAt().length() > 8) {
                    qg qgVar15 = TrafficDashboardActivity.this.binding;
                    if (qgVar15 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        qgVar15 = null;
                    }
                    qgVar15.x.setText(getLastViolation.getCitizenViolation().getViolSubmittedAt());
                } else {
                    qg qgVar16 = TrafficDashboardActivity.this.binding;
                    if (qgVar16 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        qgVar16 = null;
                    }
                    qgVar16.x.setText("Not Available");
                }
                if (getLastViolation.getCitizenViolation().getViolStatus() == 0) {
                    qg qgVar17 = TrafficDashboardActivity.this.binding;
                    if (qgVar17 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        qgVar17 = null;
                    }
                    qgVar17.A.setText("Pending");
                } else {
                    qg qgVar18 = TrafficDashboardActivity.this.binding;
                    if (qgVar18 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        qgVar18 = null;
                    }
                    qgVar18.A.setText("Active");
                }
                qg qgVar19 = TrafficDashboardActivity.this.binding;
                if (qgVar19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    qgVar19 = null;
                }
                qgVar19.z.setText(getLastViolation.getCitizenViolation().getViolLocation());
            } catch (Exception unused) {
                qg qgVar20 = TrafficDashboardActivity.this.binding;
                if (qgVar20 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    qgVar20 = null;
                }
                qgVar20.s.setVisibility(8);
                qg qgVar21 = TrafficDashboardActivity.this.binding;
                if (qgVar21 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    qgVar21 = null;
                }
                qgVar21.e.setVisibility(8);
                qg qgVar22 = TrafficDashboardActivity.this.binding;
                if (qgVar22 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    qgVar22 = null;
                }
                qgVar22.t.setVisibility(0);
                qg qgVar23 = TrafficDashboardActivity.this.binding;
                if (qgVar23 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    qgVar2 = qgVar23;
                }
                qgVar2.u.setVisibility(0);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetLastViolation) obj);
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
            qg qgVar = TrafficDashboardActivity.this.binding;
            qg qgVar2 = null;
            if (qgVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                qgVar = null;
            }
            qgVar.s.setVisibility(8);
            qg qgVar3 = TrafficDashboardActivity.this.binding;
            if (qgVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                qgVar2 = qgVar3;
            }
            qgVar2.e.setVisibility(8);
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(GetDashboardPojo getDashboardPojo) {
            qg qgVar = null;
            try {
                qg qgVar2 = TrafficDashboardActivity.this.binding;
                if (qgVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    qgVar2 = null;
                }
                qgVar2.s.setVisibility(8);
                Log.e("last_resp", getDashboardPojo.toString());
                String statusCode = getDashboardPojo.getStatusCode();
                if (Intrinsics.areEqual(statusCode, "TRV001")) {
                    qg qgVar3 = TrafficDashboardActivity.this.binding;
                    if (qgVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        qgVar3 = null;
                    }
                    qgVar3.g.setVisibility(0);
                    qg qgVar4 = TrafficDashboardActivity.this.binding;
                    if (qgVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        qgVar4 = null;
                    }
                    qgVar4.k.setLayoutManager(new LinearLayoutManager(TrafficDashboardActivity.this));
                    e65 e65Var = new e65(getDashboardPojo.getContents(), TrafficDashboardActivity.this.o1());
                    qg qgVar5 = TrafficDashboardActivity.this.binding;
                    if (qgVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        qgVar5 = null;
                    }
                    qgVar5.k.setAdapter(e65Var);
                    return;
                }
                if (Intrinsics.areEqual(statusCode, "TRV099")) {
                    qg qgVar6 = TrafficDashboardActivity.this.binding;
                    if (qgVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        qgVar6 = null;
                    }
                    qgVar6.s.setVisibility(8);
                    qg qgVar7 = TrafficDashboardActivity.this.binding;
                    if (qgVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        qgVar7 = null;
                    }
                    qgVar7.g.setVisibility(8);
                    return;
                }
                qg qgVar8 = TrafficDashboardActivity.this.binding;
                if (qgVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    qgVar8 = null;
                }
                qgVar8.s.setVisibility(8);
                qg qgVar9 = TrafficDashboardActivity.this.binding;
                if (qgVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    qgVar9 = null;
                }
                qgVar9.g.setVisibility(8);
            } catch (Exception unused) {
                qg qgVar10 = TrafficDashboardActivity.this.binding;
                if (qgVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    qgVar10 = null;
                }
                qgVar10.s.setVisibility(8);
                qg qgVar11 = TrafficDashboardActivity.this.binding;
                if (qgVar11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    qgVar = qgVar11;
                }
                qgVar.g.setVisibility(8);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetDashboardPojo) obj);
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
            qg qgVar = TrafficDashboardActivity.this.binding;
            qg qgVar2 = null;
            if (qgVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                qgVar = null;
            }
            qgVar.s.setVisibility(8);
            qg qgVar3 = TrafficDashboardActivity.this.binding;
            if (qgVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                qgVar2 = qgVar3;
            }
            qgVar2.g.setVisibility(8);
        }
    }

    public static final class e implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public e(Function1 function) {
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

    public static final void s1(TrafficDashboardActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void t1(TrafficDashboardActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) TrafficReportVioActivity.class));
        this$0.finish();
    }

    public static final void u1(TrafficDashboardActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) TrafficReportVioActivity.class));
        this$0.finish();
    }

    public static final void v1(TrafficDashboardActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) TrafficHistoryActivity.class));
        this$0.finish();
    }

    public static final void w1(TrafficDashboardActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) ViewComplaintDetails.class);
        qg qgVar = this$0.binding;
        qg qgVar2 = null;
        if (qgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qgVar = null;
        }
        CharSequence text = qgVar.z.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        intent.putExtra("location", StringsKt__StringsKt.trim(text));
        qg qgVar3 = this$0.binding;
        if (qgVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qgVar3 = null;
        }
        if (Intrinsics.areEqual(qgVar3.A.getText(), "Active")) {
            intent.putExtra("status", VContant.MAINSCREEN);
        } else {
            intent.putExtra("status", "0");
        }
        qg qgVar4 = this$0.binding;
        if (qgVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qgVar4 = null;
        }
        CharSequence text2 = qgVar4.v.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        intent.putExtra("vehicleNumber", StringsKt__StringsKt.trim(text2));
        qg qgVar5 = this$0.binding;
        if (qgVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            qgVar2 = qgVar5;
        }
        CharSequence text3 = qgVar2.y.getText();
        Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
        intent.putExtra("violOffenceId", StringsKt__StringsKt.trim(text3));
        this$0.startActivity(intent);
    }

    public final void A1(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final Context o1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        qg qgVarC = qg.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(qgVarC, "inflate(...)");
        this.binding = qgVarC;
        OffenceInterface offenceInterface = null;
        if (qgVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qgVarC = null;
        }
        setContentView(qgVarC.b());
        x1(this);
        A1(new ws6(this));
        z1(new wa3(this));
        ta3.a aVar = ta3.a;
        qg qgVar = this.binding;
        if (qgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qgVar = null;
        }
        aVar.f(this, qgVar);
        qg qgVar2 = this.binding;
        if (qgVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qgVar2 = null;
        }
        qgVar2.b.g.setText(q1().b("report_traffic_violation", "Report Traffic Violation"));
        this.mOffenceInterface = OffenceInterface.INSTANCE.a(this);
        qg qgVar3 = this.binding;
        if (qgVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qgVar3 = null;
        }
        qgVar3.b.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.kj6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficDashboardActivity.s1(this.a, view);
            }
        });
        qg qgVar4 = this.binding;
        if (qgVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qgVar4 = null;
        }
        qgVar4.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.lj6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficDashboardActivity.t1(this.a, view);
            }
        });
        qg qgVar5 = this.binding;
        if (qgVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qgVar5 = null;
        }
        qgVar5.u.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.mj6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficDashboardActivity.u1(this.a, view);
            }
        });
        qg qgVar6 = this.binding;
        if (qgVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qgVar6 = null;
        }
        qgVar6.c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.nj6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficDashboardActivity.v1(this.a, view);
            }
        });
        qg qgVar7 = this.binding;
        if (qgVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qgVar7 = null;
        }
        qgVar7.w.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.oj6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficDashboardActivity.w1(this.a, view);
            }
        });
        qg qgVar8 = this.binding;
        if (qgVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            qgVar8 = null;
        }
        qgVar8.s.setVisibility(0);
        OffenceInterface offenceInterface2 = this.mOffenceInterface;
        if (offenceInterface2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOffenceInterface");
        } else {
            offenceInterface = offenceInterface2;
        }
        y1((vf4) new z(this, new uf4(new of4(offenceInterface))).a(vf4.class));
        p1().D(r1().k());
        p1().y().g(this, new e(new a()));
        p1().o().g(this, new e(new b()));
        p1().k(r1().k());
        p1().w().g(this, new e(new c()));
        p1().o().g(this, new e(new d()));
    }

    public final vf4 p1() {
        vf4 vf4Var = this.mOffenceViewModel;
        if (vf4Var != null) {
            return vf4Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mOffenceViewModel");
        return null;
    }

    public final wa3 q1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final ws6 r1() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final void x1(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void y1(vf4 vf4Var) {
        Intrinsics.checkNotNullParameter(vf4Var, "<set-?>");
        this.mOffenceViewModel = vf4Var;
    }

    public final void z1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }
}
