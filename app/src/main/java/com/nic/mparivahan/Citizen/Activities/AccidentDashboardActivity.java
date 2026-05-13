package com.nic.mparivahan.Citizen.Activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.nic.mparivahan.Citizen.Activities.AccidentDashboardActivity;
import com.nic.mparivahan.Citizen.Interfaces.OffenceInterface;
import com.nic.mparivahan.Citizen.Models.GetDashboardPojo;
import com.nic.mparivahan.Citizen.Models.GetLastAccident;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.zepto.c6;
import com.zepto.e65;
import com.zepto.mf4;
import com.zepto.of4;
import com.zepto.pq;
import com.zepto.ta3;
import com.zepto.uf4;
import com.zepto.vf4;
import com.zepto.wa3;
import com.zepto.ws6;
import java.util.HashMap;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b7\u00108J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0015R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R.\u0010.\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020'0&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00069"}, d2 = {"Lcom/nic/mparivahan/Citizen/Activities/AccidentDashboardActivity;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lcom/zepto/c6;", "C", "Lcom/zepto/c6;", "binding", "Landroid/content/Context;", "D", "Landroid/content/Context;", "o1", "()Landroid/content/Context;", "x1", "(Landroid/content/Context;)V", "mContext", "Lcom/zepto/ws6;", "E", "Lcom/zepto/ws6;", "r1", "()Lcom/zepto/ws6;", "A1", "(Lcom/zepto/ws6;)V", "sessionManager", "Lcom/zepto/vf4;", "F", "Lcom/zepto/vf4;", "p1", "()Lcom/zepto/vf4;", "y1", "(Lcom/zepto/vf4;)V", "mOffenceViewModel", "Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;", "G", "Lcom/nic/mparivahan/Citizen/Interfaces/OffenceInterface;", "mOffenceInterface", "Ljava/util/HashMap;", "", "H", "Ljava/util/HashMap;", "getResponseData", "()Ljava/util/HashMap;", "setResponseData", "(Ljava/util/HashMap;)V", "responseData", "Lcom/zepto/wa3;", "I", "Lcom/zepto/wa3;", "q1", "()Lcom/zepto/wa3;", "z1", "(Lcom/zepto/wa3;)V", "session", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class AccidentDashboardActivity extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public c6 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public vf4 mOffenceViewModel;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public OffenceInterface mOffenceInterface;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public HashMap responseData = new HashMap();

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
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
            c6 c6Var = AccidentDashboardActivity.this.binding;
            c6 c6Var2 = null;
            if (c6Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6Var = null;
            }
            c6Var.b.setVisibility(8);
            c6 c6Var3 = AccidentDashboardActivity.this.binding;
            if (c6Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c6Var2 = c6Var3;
            }
            c6Var2.j.setVisibility(8);
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(GetLastAccident getLastAccident) {
            c6 c6Var = null;
            try {
                c6 c6Var2 = AccidentDashboardActivity.this.binding;
                if (c6Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c6Var2 = null;
                }
                c6Var2.b.setVisibility(8);
                String statusDesc = getLastAccident.getStatusDesc();
                if (!Intrinsics.areEqual(statusDesc, "Success")) {
                    if (Intrinsics.areEqual(statusDesc, "No Record(s) Found.")) {
                        c6 c6Var3 = AccidentDashboardActivity.this.binding;
                        if (c6Var3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            c6Var3 = null;
                        }
                        c6Var3.h.setVisibility(8);
                        c6 c6Var4 = AccidentDashboardActivity.this.binding;
                        if (c6Var4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            c6Var4 = null;
                        }
                        c6Var4.v.setVisibility(0);
                        c6 c6Var5 = AccidentDashboardActivity.this.binding;
                        if (c6Var5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            c6Var5 = null;
                        }
                        c6Var5.x.setVisibility(0);
                        return;
                    }
                    c6 c6Var6 = AccidentDashboardActivity.this.binding;
                    if (c6Var6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c6Var6 = null;
                    }
                    c6Var6.h.setVisibility(8);
                    c6 c6Var7 = AccidentDashboardActivity.this.binding;
                    if (c6Var7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c6Var7 = null;
                    }
                    c6Var7.v.setVisibility(0);
                    c6 c6Var8 = AccidentDashboardActivity.this.binding;
                    if (c6Var8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c6Var8 = null;
                    }
                    c6Var8.x.setVisibility(0);
                    c6 c6Var9 = AccidentDashboardActivity.this.binding;
                    if (c6Var9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c6Var9 = null;
                    }
                    c6Var9.b.setVisibility(8);
                    return;
                }
                c6 c6Var10 = AccidentDashboardActivity.this.binding;
                if (c6Var10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c6Var10 = null;
                }
                c6Var10.v.setVisibility(8);
                c6 c6Var11 = AccidentDashboardActivity.this.binding;
                if (c6Var11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c6Var11 = null;
                }
                c6Var11.x.setVisibility(8);
                c6 c6Var12 = AccidentDashboardActivity.this.binding;
                if (c6Var12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c6Var12 = null;
                }
                c6Var12.h.setVisibility(0);
                c6 c6Var13 = AccidentDashboardActivity.this.binding;
                if (c6Var13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c6Var13 = null;
                }
                c6Var13.y.setText(getLastAccident.getMparCitizenAccident().getAccdRegnNo());
                c6 c6Var14 = AccidentDashboardActivity.this.binding;
                if (c6Var14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c6Var14 = null;
                }
                c6Var14.w.setText(String.valueOf(getLastAccident.getMparCitizenAccident().getAccdRecordId()));
                if (getLastAccident.getMparCitizenAccident().getAccdSubmittedAt().length() > 8) {
                    c6 c6Var15 = AccidentDashboardActivity.this.binding;
                    if (c6Var15 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c6Var15 = null;
                    }
                    c6Var15.A.setText(getLastAccident.getMparCitizenAccident().getAccdSubmittedAt());
                } else {
                    c6 c6Var16 = AccidentDashboardActivity.this.binding;
                    if (c6Var16 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c6Var16 = null;
                    }
                    c6Var16.A.setText("Not Available");
                }
                if (getLastAccident.getMparCitizenAccident().getAccdStatus() == 0) {
                    c6 c6Var17 = AccidentDashboardActivity.this.binding;
                    if (c6Var17 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c6Var17 = null;
                    }
                    c6Var17.C.setText("Pending");
                } else {
                    c6 c6Var18 = AccidentDashboardActivity.this.binding;
                    if (c6Var18 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c6Var18 = null;
                    }
                    c6Var18.C.setText("Active");
                }
                c6 c6Var19 = AccidentDashboardActivity.this.binding;
                if (c6Var19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c6Var19 = null;
                }
                c6Var19.B.setText(getLastAccident.getMparCitizenAccident().getAccdLocation());
            } catch (Exception unused) {
                c6 c6Var20 = AccidentDashboardActivity.this.binding;
                if (c6Var20 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c6Var20 = null;
                }
                c6Var20.b.setVisibility(8);
                c6 c6Var21 = AccidentDashboardActivity.this.binding;
                if (c6Var21 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c6Var21 = null;
                }
                c6Var21.h.setVisibility(8);
                c6 c6Var22 = AccidentDashboardActivity.this.binding;
                if (c6Var22 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c6Var22 = null;
                }
                c6Var22.v.setVisibility(0);
                c6 c6Var23 = AccidentDashboardActivity.this.binding;
                if (c6Var23 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    c6Var = c6Var23;
                }
                c6Var.x.setVisibility(0);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetLastAccident) obj);
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
            c6 c6Var = AccidentDashboardActivity.this.binding;
            c6 c6Var2 = null;
            if (c6Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6Var = null;
            }
            c6Var.b.setVisibility(8);
            c6 c6Var3 = AccidentDashboardActivity.this.binding;
            if (c6Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6Var3 = null;
            }
            c6Var3.b.setVisibility(8);
            c6 c6Var4 = AccidentDashboardActivity.this.binding;
            if (c6Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6Var4 = null;
            }
            c6Var4.h.setVisibility(8);
            c6 c6Var5 = AccidentDashboardActivity.this.binding;
            if (c6Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6Var5 = null;
            }
            c6Var5.v.setVisibility(0);
            c6 c6Var6 = AccidentDashboardActivity.this.binding;
            if (c6Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c6Var2 = c6Var6;
            }
            c6Var2.x.setVisibility(0);
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
            c6 c6Var = AccidentDashboardActivity.this.binding;
            c6 c6Var2 = null;
            if (c6Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6Var = null;
            }
            c6Var.b.setVisibility(8);
            c6 c6Var3 = AccidentDashboardActivity.this.binding;
            if (c6Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6Var3 = null;
            }
            c6Var3.b.setVisibility(8);
            c6 c6Var4 = AccidentDashboardActivity.this.binding;
            if (c6Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6Var4 = null;
            }
            c6Var4.h.setVisibility(8);
            c6 c6Var5 = AccidentDashboardActivity.this.binding;
            if (c6Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c6Var5 = null;
            }
            c6Var5.v.setVisibility(0);
            c6 c6Var6 = AccidentDashboardActivity.this.binding;
            if (c6Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c6Var2 = c6Var6;
            }
            c6Var2.x.setVisibility(0);
        }
    }

    public static final class e extends Lambda implements Function1 {
        public e() {
            super(1);
        }

        public final void a(GetDashboardPojo getDashboardPojo) {
            c6 c6Var = null;
            try {
                c6 c6Var2 = AccidentDashboardActivity.this.binding;
                if (c6Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c6Var2 = null;
                }
                c6Var2.b.setVisibility(8);
                String statusCode = getDashboardPojo.getStatusCode();
                if (Intrinsics.areEqual(statusCode, "ACCD001")) {
                    c6 c6Var3 = AccidentDashboardActivity.this.binding;
                    if (c6Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c6Var3 = null;
                    }
                    c6Var3.j.setVisibility(0);
                    c6 c6Var4 = AccidentDashboardActivity.this.binding;
                    if (c6Var4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c6Var4 = null;
                    }
                    c6Var4.n.setLayoutManager(new LinearLayoutManager(AccidentDashboardActivity.this));
                    e65 e65Var = new e65(getDashboardPojo.getContents(), AccidentDashboardActivity.this.o1());
                    c6 c6Var5 = AccidentDashboardActivity.this.binding;
                    if (c6Var5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c6Var5 = null;
                    }
                    c6Var5.n.setAdapter(e65Var);
                    return;
                }
                if (Intrinsics.areEqual(statusCode, "ACCD099")) {
                    c6 c6Var6 = AccidentDashboardActivity.this.binding;
                    if (c6Var6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c6Var6 = null;
                    }
                    c6Var6.b.setVisibility(8);
                    c6 c6Var7 = AccidentDashboardActivity.this.binding;
                    if (c6Var7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c6Var7 = null;
                    }
                    c6Var7.j.setVisibility(8);
                    return;
                }
                c6 c6Var8 = AccidentDashboardActivity.this.binding;
                if (c6Var8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c6Var8 = null;
                }
                c6Var8.b.setVisibility(8);
                c6 c6Var9 = AccidentDashboardActivity.this.binding;
                if (c6Var9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c6Var9 = null;
                }
                c6Var9.j.setVisibility(8);
            } catch (Exception unused) {
                c6 c6Var10 = AccidentDashboardActivity.this.binding;
                if (c6Var10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c6Var10 = null;
                }
                c6Var10.b.setVisibility(8);
                c6 c6Var11 = AccidentDashboardActivity.this.binding;
                if (c6Var11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    c6Var = c6Var11;
                }
                c6Var.j.setVisibility(8);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((GetDashboardPojo) obj);
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

    public static final void s1(AccidentDashboardActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void t1(AccidentDashboardActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) AccidentReportActivity.class));
        this$0.finish();
    }

    public static final void u1(AccidentDashboardActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) AccidentReportActivity.class));
        this$0.finish();
    }

    public static final void v1(AccidentDashboardActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) AccidentHistoryActivity.class));
        this$0.finish();
    }

    public static final void w1(AccidentDashboardActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) ViewAccidentDetails.class);
        c6 c6Var = this$0.binding;
        c6 c6Var2 = null;
        if (c6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c6Var = null;
        }
        CharSequence text = c6Var.B.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        intent.putExtra("location", StringsKt__StringsKt.trim(text));
        c6 c6Var3 = this$0.binding;
        if (c6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c6Var3 = null;
        }
        if (Intrinsics.areEqual(c6Var3.C.getText(), "Active")) {
            intent.putExtra("status", VContant.MAINSCREEN);
        } else {
            intent.putExtra("status", "0");
        }
        c6 c6Var4 = this$0.binding;
        if (c6Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c6Var4 = null;
        }
        CharSequence text2 = c6Var4.y.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        intent.putExtra("vehicleNumber", StringsKt__StringsKt.trim(text2));
        c6 c6Var5 = this$0.binding;
        if (c6Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c6Var2 = c6Var5;
        }
        CharSequence text3 = c6Var2.w.getText();
        Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
        intent.putExtra("accRecordId", StringsKt__StringsKt.trim(text3));
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
        c6 c6VarC = c6.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c6VarC, "inflate(...)");
        this.binding = c6VarC;
        OffenceInterface offenceInterface = null;
        if (c6VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c6VarC = null;
        }
        setContentView(c6VarC.b());
        z1(new wa3(this));
        ta3.a aVar = ta3.a;
        c6 c6Var = this.binding;
        if (c6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c6Var = null;
        }
        aVar.a(this, c6Var);
        c6 c6Var2 = this.binding;
        if (c6Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c6Var2 = null;
        }
        c6Var2.e.g.setText(q1().b("report_accident", "Report Accident"));
        c6 c6Var3 = this.binding;
        if (c6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c6Var3 = null;
        }
        c6Var3.e.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.c4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccidentDashboardActivity.s1(this.a, view);
            }
        });
        x1(this);
        A1(new ws6(this));
        this.mOffenceInterface = OffenceInterface.INSTANCE.a(this);
        c6 c6Var4 = this.binding;
        if (c6Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c6Var4 = null;
        }
        c6Var4.x.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.d4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccidentDashboardActivity.t1(this.a, view);
            }
        });
        c6 c6Var5 = this.binding;
        if (c6Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c6Var5 = null;
        }
        c6Var5.i.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.e4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccidentDashboardActivity.u1(this.a, view);
            }
        });
        c6 c6Var6 = this.binding;
        if (c6Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c6Var6 = null;
        }
        c6Var6.f.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.f4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccidentDashboardActivity.v1(this.a, view);
            }
        });
        c6 c6Var7 = this.binding;
        if (c6Var7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c6Var7 = null;
        }
        c6Var7.z.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.g4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccidentDashboardActivity.w1(this.a, view);
            }
        });
        c6 c6Var8 = this.binding;
        if (c6Var8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c6Var8 = null;
        }
        c6Var8.b.setVisibility(0);
        OffenceInterface offenceInterface2 = this.mOffenceInterface;
        if (offenceInterface2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOffenceInterface");
        } else {
            offenceInterface = offenceInterface2;
        }
        y1((vf4) new z(this, new uf4(new of4(offenceInterface))).a(vf4.class));
        p1().C(r1().k());
        p1().x().g(this, new f(new b()));
        p1().q().g(this, new f(new c()));
        p1().p().g(this, new f(new d()));
        p1().g(r1().k());
        p1().u().g(this, new f(new e()));
        p1().l().g(this, new f(new a()));
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
