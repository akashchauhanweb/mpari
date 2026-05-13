package com.nic.mparivahan.Citizen.Activities;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.TextView;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.nic.mparivahan.Citizen.Activities.TrafficHistoryHomeActivity;
import com.nic.mparivahan.Citizen.Interfaces.OffenceInterface;
import com.nic.mparivahan.Citizen.Models.ComplaintList;
import com.nic.mparivahan.R;
import com.zepto.mf4;
import com.zepto.of4;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.tg;
import com.zepto.uf4;
import com.zepto.vf4;
import com.zepto.wa3;
import com.zepto.ws6;
import com.zepto.xa5;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bV\u0010WJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0015J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u00102\u001a\b\u0012\u0004\u0012\u00020+0*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00109\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010=\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u00104\u001a\u0004\b;\u00106\"\u0004\b<\u00108R\"\u0010A\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u00104\u001a\u0004\b?\u00106\"\u0004\b@\u00108R\"\u0010E\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u00104\u001a\u0004\bC\u00106\"\u0004\bD\u00108R\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010Q\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u00104\u001a\u0004\bO\u00106\"\u0004\bP\u00108R\"\u0010U\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u00104\u001a\u0004\bS\u00106\"\u0004\bT\u00108¨\u0006X"}, d2 = {"Lcom/nic/mparivahan/Citizen/Activities/TrafficHistoryHomeActivity;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/content/Context;", "context", "", "message", "J1", "Lcom/zepto/tg;", "C", "Lcom/zepto/tg;", "binding", "D", "Landroid/content/Context;", "w1", "()Landroid/content/Context;", "P1", "(Landroid/content/Context;)V", "mContext", "Lcom/zepto/vf4;", "E", "Lcom/zepto/vf4;", "y1", "()Lcom/zepto/vf4;", "R1", "(Lcom/zepto/vf4;)V", "mOffenceViewModel", "Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;", "F", "Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;", "mOffenceInterface", "Lcom/zepto/ws6;", "G", "Lcom/zepto/ws6;", "A1", "()Lcom/zepto/ws6;", "T1", "(Lcom/zepto/ws6;)V", "sessionManager", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/Citizen/Models/MparCitizenViolationX;", "H", "Ljava/util/ArrayList;", "x1", "()Ljava/util/ArrayList;", "Q1", "(Ljava/util/ArrayList;)V", "mListVal", "I", "Ljava/lang/String;", "v1", "()Ljava/lang/String;", "O1", "(Ljava/lang/String;)V", "dayStartString", "J", "u1", "N1", "dayStartMonth", "K", "t1", "M1", "dayEndString", "L", "s1", "L1", "dayEndMonth", "Lcom/zepto/wa3;", "M", "Lcom/zepto/wa3;", "z1", "()Lcom/zepto/wa3;", "S1", "(Lcom/zepto/wa3;)V", "session", "N", "getStartdate", "setStartdate", "startdate", "O", "getEnddate", "setEnddate", "enddate", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class TrafficHistoryHomeActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public tg binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public vf4 mOffenceViewModel;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public OffenceInterface mOffenceInterface;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ArrayList mListVal;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String dayStartString;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String dayStartMonth;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String dayEndString;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String dayEndMonth;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String startdate = "";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String enddate = "";

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
        public final void a(ComplaintList complaintList) {
            tg tgVar = null;
            try {
                tg tgVar2 = TrafficHistoryHomeActivity.this.binding;
                if (tgVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tgVar2 = null;
                }
                tgVar2.m.setVisibility(8);
                if (Intrinsics.areEqual(complaintList.getStatusDesc(), "Success")) {
                    tg tgVar3 = TrafficHistoryHomeActivity.this.binding;
                    if (tgVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        tgVar3 = null;
                    }
                    tgVar3.k.setLayoutManager(new LinearLayoutManager(TrafficHistoryHomeActivity.this));
                    tg tgVar4 = TrafficHistoryHomeActivity.this.binding;
                    if (tgVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        tgVar4 = null;
                    }
                    tgVar4.k.setAdapter(null);
                    TrafficHistoryHomeActivity.this.Q1(complaintList.getCitizenViolations());
                    Collections.reverse(TrafficHistoryHomeActivity.this.x1());
                    xa5 xa5Var = new xa5(TrafficHistoryHomeActivity.this.x1(), TrafficHistoryHomeActivity.this.w1());
                    tg tgVar5 = TrafficHistoryHomeActivity.this.binding;
                    if (tgVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        tgVar5 = null;
                    }
                    tgVar5.k.setAdapter(xa5Var);
                    return;
                }
                if (Intrinsics.areEqual(complaintList.getStatusCode(), "ACCD099")) {
                    TrafficHistoryHomeActivity trafficHistoryHomeActivity = TrafficHistoryHomeActivity.this;
                    trafficHistoryHomeActivity.J1(trafficHistoryHomeActivity, trafficHistoryHomeActivity.getResources().getString(R.string.traffic_state));
                    tg tgVar6 = TrafficHistoryHomeActivity.this.binding;
                    if (tgVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        tgVar6 = null;
                    }
                    tgVar6.m.setVisibility(8);
                    return;
                }
                tg tgVar7 = TrafficHistoryHomeActivity.this.binding;
                if (tgVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tgVar7 = null;
                }
                tgVar7.m.setVisibility(8);
                tg tgVar8 = TrafficHistoryHomeActivity.this.binding;
                if (tgVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    tgVar8 = null;
                }
                tgVar8.k.setAdapter(null);
                TrafficHistoryHomeActivity trafficHistoryHomeActivity2 = TrafficHistoryHomeActivity.this;
                trafficHistoryHomeActivity2.J1(trafficHistoryHomeActivity2, complaintList.getStatusDesc());
            } catch (Exception unused) {
                tg tgVar9 = TrafficHistoryHomeActivity.this.binding;
                if (tgVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    tgVar = tgVar9;
                }
                tgVar.m.setVisibility(8);
                TrafficHistoryHomeActivity trafficHistoryHomeActivity3 = TrafficHistoryHomeActivity.this;
                trafficHistoryHomeActivity3.J1(trafficHistoryHomeActivity3, "Something went wrong,Please try after some time!");
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ComplaintList) obj);
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
            tg tgVar = TrafficHistoryHomeActivity.this.binding;
            if (tgVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                tgVar = null;
            }
            tgVar.m.setVisibility(8);
            TrafficHistoryHomeActivity trafficHistoryHomeActivity = TrafficHistoryHomeActivity.this;
            trafficHistoryHomeActivity.J1(trafficHistoryHomeActivity, "Something went wrong,Please try after some time!");
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

    public static final void B1(TrafficHistoryHomeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void C1(TrafficHistoryHomeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) TrafficReportVioActivity.class));
        this$0.finish();
    }

    public static final void D1(TrafficHistoryHomeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) TrafficDashboardActivity.class));
        this$0.finish();
    }

    public static final void E1(final TrafficHistoryHomeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Calendar calendar = Calendar.getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.jk6
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                TrafficHistoryHomeActivity.F1(this.a, datePicker, i, i2, i3);
            }
        }, calendar.get(1), calendar.get(2), calendar.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-1).setTextColor(-16777216);
        datePickerDialog.getButton(-2).setTextColor(-16777216);
    }

    public static final void F1(TrafficHistoryHomeActivity this$0, DatePicker datePicker, int i, int i2, int i3) {
        String strValueOf;
        String strValueOf2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (String.valueOf(i3).length() < 2) {
            StringBuilder sb = new StringBuilder();
            sb.append('0');
            sb.append(i3);
            strValueOf = sb.toString();
        } else {
            strValueOf = String.valueOf(i3);
        }
        this$0.O1(strValueOf);
        int i4 = i2 + 1;
        if (String.valueOf(i4).length() < 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('0');
            sb2.append(i4);
            strValueOf2 = sb2.toString();
        } else {
            strValueOf2 = String.valueOf(i4);
        }
        this$0.N1(strValueOf2);
        tg tgVar = this$0.binding;
        if (tgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tgVar = null;
        }
        tgVar.c.setText(this$0.v1() + '-' + this$0.u1() + '-' + i);
        this$0.startdate = i + '-' + this$0.u1() + '-' + this$0.v1();
    }

    public static final void G1(final TrafficHistoryHomeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Calendar calendar = Calendar.getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog(this$0, new DatePickerDialog.OnDateSetListener() { // from class: com.zepto.kk6
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                TrafficHistoryHomeActivity.H1(this.a, datePicker, i, i2, i3);
            }
        }, calendar.get(1), calendar.get(2), calendar.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-1).setTextColor(-16777216);
        datePickerDialog.getButton(-2).setTextColor(-16777216);
    }

    public static final void H1(TrafficHistoryHomeActivity this$0, DatePicker datePicker, int i, int i2, int i3) {
        String strValueOf;
        String strValueOf2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (String.valueOf(i3).length() < 2) {
            StringBuilder sb = new StringBuilder();
            sb.append('0');
            sb.append(i3);
            strValueOf = sb.toString();
        } else {
            strValueOf = String.valueOf(i3);
        }
        this$0.M1(strValueOf);
        int i4 = i2 + 1;
        if (String.valueOf(i4).length() < 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('0');
            sb2.append(i4);
            strValueOf2 = sb2.toString();
        } else {
            strValueOf2 = String.valueOf(i4);
        }
        this$0.L1(strValueOf2);
        tg tgVar = this$0.binding;
        if (tgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tgVar = null;
        }
        tgVar.b.setText(this$0.t1() + '-' + this$0.s1() + '-' + i);
        this$0.enddate = i + '-' + this$0.s1() + '-' + this$0.t1();
    }

    public static final void I1(TrafficHistoryHomeActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        tg tgVar = this$0.binding;
        tg tgVar2 = null;
        if (tgVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tgVar = null;
        }
        CharSequence text = tgVar.c.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        if (text.length() == 0) {
            this$0.J1(this$0.w1(), this$0.z1().b("enter_Start_date", "Please enter start date"));
            return;
        }
        tg tgVar3 = this$0.binding;
        if (tgVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tgVar3 = null;
        }
        CharSequence text2 = tgVar3.b.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        if (text2.length() == 0) {
            this$0.J1(this$0.w1(), this$0.z1().b("enter_end_date", "Please enter end date"));
            return;
        }
        tg tgVar4 = this$0.binding;
        if (tgVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            tgVar2 = tgVar4;
        }
        tgVar2.m.setVisibility(0);
        this$0.y1().V(this$0.A1().k(), this$0.startdate, this$0.enddate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public final ws6 A1() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final void J1(Context context, String message) {
        Intrinsics.checkNotNullParameter(context, "context");
        final Dialog dialog = new Dialog(context);
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ik6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficHistoryHomeActivity.K1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void L1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dayEndMonth = str;
    }

    public final void M1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dayEndString = str;
    }

    public final void N1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dayStartMonth = str;
    }

    public final void O1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dayStartString = str;
    }

    public final void P1(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void Q1(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.mListVal = arrayList;
    }

    public final void R1(vf4 vf4Var) {
        Intrinsics.checkNotNullParameter(vf4Var, "<set-?>");
        this.mOffenceViewModel = vf4Var;
    }

    public final void S1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final void T1(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tg tgVarC = tg.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(tgVarC, "inflate(...)");
        this.binding = tgVarC;
        tg tgVar = null;
        if (tgVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tgVarC = null;
        }
        setContentView(tgVarC.b());
        P1(this);
        T1(new ws6(this));
        ta3.a aVar = ta3.a;
        tg tgVar2 = this.binding;
        if (tgVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tgVar2 = null;
        }
        aVar.i(this, tgVar2);
        this.mOffenceInterface = OffenceInterface.INSTANCE.a(this);
        S1(new wa3(this));
        tg tgVar3 = this.binding;
        if (tgVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tgVar3 = null;
        }
        tgVar3.d.g.setText(z1().b("report_traffic_violation", "Report Traffic Violation"));
        tg tgVar4 = this.binding;
        if (tgVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tgVar4 = null;
        }
        tgVar4.d.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ck6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficHistoryHomeActivity.B1(this.a, view);
            }
        });
        tg tgVar5 = this.binding;
        if (tgVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tgVar5 = null;
        }
        tgVar5.g.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dk6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficHistoryHomeActivity.C1(this.a, view);
            }
        });
        tg tgVar6 = this.binding;
        if (tgVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tgVar6 = null;
        }
        tgVar6.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ek6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficHistoryHomeActivity.D1(this.a, view);
            }
        });
        OffenceInterface offenceInterface = this.mOffenceInterface;
        if (offenceInterface == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOffenceInterface");
            offenceInterface = null;
        }
        R1((vf4) new z(this, new uf4(new of4(offenceInterface))).a(vf4.class));
        y1().G().g(this, new c(new a()));
        y1().H().g(this, new c(new b()));
        tg tgVar7 = this.binding;
        if (tgVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tgVar7 = null;
        }
        tgVar7.c.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.fk6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficHistoryHomeActivity.E1(this.a, view);
            }
        });
        tg tgVar8 = this.binding;
        if (tgVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            tgVar8 = null;
        }
        tgVar8.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.gk6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficHistoryHomeActivity.G1(this.a, view);
            }
        });
        tg tgVar9 = this.binding;
        if (tgVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            tgVar = tgVar9;
        }
        tgVar.n.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.hk6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrafficHistoryHomeActivity.I1(this.a, view);
            }
        });
    }

    public final String s1() {
        String str = this.dayEndMonth;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dayEndMonth");
        return null;
    }

    public final String t1() {
        String str = this.dayEndString;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dayEndString");
        return null;
    }

    public final String u1() {
        String str = this.dayStartMonth;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dayStartMonth");
        return null;
    }

    public final String v1() {
        String str = this.dayStartString;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dayStartString");
        return null;
    }

    public final Context w1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final ArrayList x1() {
        ArrayList arrayList = this.mListVal;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mListVal");
        return null;
    }

    public final vf4 y1() {
        vf4 vf4Var = this.mOffenceViewModel;
        if (vf4Var != null) {
            return vf4Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mOffenceViewModel");
        return null;
    }

    public final wa3 z1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }
}
