package com.nic.mparivahan.RC;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.GetSharedRecivedDoc;
import com.nic.mparivahan.RC.Model.MyRcDeletResponse;
import com.nic.mparivahan.RC.Model.RcModelsDet;
import com.nic.mparivahan.RC.Model.ReceivedDoc;
import com.nic.mparivahan.RC.Model.SharedDoc;
import com.nic.mparivahan.RC.Model.SharedRcDeletResponse;
import com.nic.mparivahan.RC.RCDashBoard;
import com.nic.mparivahan.RC.RcInterface.RcService;
import com.zepto.a55;
import com.zepto.b55;
import com.zepto.l04;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.r04;
import com.zepto.s45;
import com.zepto.ta3;
import com.zepto.u55;
import com.zepto.uh1;
import com.zepto.va3;
import com.zepto.ve;
import com.zepto.vh1;
import com.zepto.wa3;
import com.zepto.ws6;
import com.zepto.y04;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\bu\u0010vJ\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u001a\u0010\r\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R2\u00108\u001a\u0012\u0012\u0004\u0012\u0002000/j\b\u0012\u0004\u0012\u000200`18\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010F\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010]\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010F\u001a\u0004\b[\u0010W\"\u0004\b\\\u0010YR\"\u0010e\u001a\u00020^8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010l\u001a\u00020\u000b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010t\u001a\u00020m8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010s¨\u0006w"}, d2 = {"Lcom/nic/mparivahan/RC/RCDashBoard;", "Lcom/zepto/pq;", "Lcom/zepto/vh1;", "Lcom/zepto/uh1;", "Lcom/zepto/u55;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/content/Context;", "context", "", "message", "Y1", "shared_id", "", "position", "Q", "rc_number", "p", "rc", "S", "c0", "Lcom/zepto/a55;", "C", "Lcom/zepto/a55;", "x1", "()Lcom/zepto/a55;", "S1", "(Lcom/zepto/a55;)V", "mRcViewModel", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "D", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "w1", "()Lcom/nic/mparivahan/RC/RcInterface/RcService;", "R1", "(Lcom/nic/mparivahan/RC/RcInterface/RcService;)V", "mRcService", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "E", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "v1", "()Lcom/nic/mparivahan/DB/DatabaseHelper;", "Q1", "(Lcom/nic/mparivahan/DB/DatabaseHelper;)V", "databaseHelper", "Ljava/util/ArrayList;", "Lcom/nic/mparivahan/RC/Model/NrvDetails;", "Lkotlin/collections/ArrayList;", "F", "Ljava/util/ArrayList;", "u1", "()Ljava/util/ArrayList;", "P1", "(Ljava/util/ArrayList;)V", "arrayList", "Lcom/zepto/ve;", "G", "Lcom/zepto/ve;", "binding", "Lcom/zepto/ws6;", "H", "Lcom/zepto/ws6;", "C1", "()Lcom/zepto/ws6;", "W1", "(Lcom/zepto/ws6;)V", "sessionManager", "Landroid/app/ProgressDialog;", "I", "Landroid/app/ProgressDialog;", "z1", "()Landroid/app/ProgressDialog;", "U1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/y04;", "J", "Lcom/zepto/y04;", "D1", "()Lcom/zepto/y04;", "X1", "(Lcom/zepto/y04;)V", "shared_adapter", "K", "getPosition", "()I", "setPosition", "(I)V", "L", "getMyRcAdapterPosition", "setMyRcAdapterPosition", "MyRcAdapterPosition", "Lcom/zepto/l04;", "M", "Lcom/zepto/l04;", "y1", "()Lcom/zepto/l04;", "T1", "(Lcom/zepto/l04;)V", "myRcAdapter", "N", "Ljava/lang/String;", "A1", "()Ljava/lang/String;", "V1", "(Ljava/lang/String;)V", "selectedRcNumber", "Lcom/zepto/wa3;", "O", "Lcom/zepto/wa3;", "B1", "()Lcom/zepto/wa3;", "setSession", "(Lcom/zepto/wa3;)V", "session", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class RCDashBoard extends pq implements vh1, uh1, u55 {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public a55 mRcViewModel;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public RcService mRcService;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public DatabaseHelper databaseHelper;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ArrayList arrayList;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ve binding;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ws6 sessionManager;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public y04 shared_adapter;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public int position;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public int MyRcAdapterPosition;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public l04 myRcAdapter;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String selectedRcNumber;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
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
            Toast.makeText(RCDashBoard.this.getApplicationContext(), RCDashBoard.this.B1().b(va3.a.I0(), "Unable to delete the shared RC, Please try after some times"), 1).show();
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
            RCDashBoard.this.z1().dismiss();
            Toast.makeText(RCDashBoard.this.getApplicationContext(), RCDashBoard.this.B1().b(va3.a.G0(), "Unable to delete the Virtual RC, Please try after some time"), 1).show();
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
            RCDashBoard.this.z1().dismiss();
            Toast.makeText(RCDashBoard.this.getApplicationContext(), RCDashBoard.this.B1().b(va3.a.D(), "Unable to get the details, Plese try after sometimes!"), 1).show();
        }
    }

    public static final class d implements mf4, FunctionAdapter {
        public final /* synthetic */ Function1 a;

        public d(Function1 function) {
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

    public static final void E1(RCDashBoard this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void F1(RCDashBoard this$0, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            ve veVar = this$0.binding;
            ve veVar2 = null;
            if (veVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                veVar = null;
            }
            veVar.e.setBackgroundResource(R.drawable.corner_rectangle_bg_17);
            ve veVar3 = this$0.binding;
            if (veVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                veVar3 = null;
            }
            veVar3.m.setBackgroundResource(R.drawable.dashboard);
            ve veVar4 = this$0.binding;
            if (veVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                veVar4 = null;
            }
            veVar4.b.setBackgroundResource(R.drawable.dashboard);
            ve veVar5 = this$0.binding;
            if (veVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                veVar5 = null;
            }
            veVar5.g.setImageResource(R.drawable.white_myrc);
            ve veVar6 = this$0.binding;
            if (veVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                veVar6 = null;
            }
            veVar6.c.setImageResource(R.drawable.black_shareicon);
            ve veVar7 = this$0.binding;
            if (veVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                veVar7 = null;
            }
            veVar7.j.setImageResource(R.drawable.black_recived);
            ve veVar8 = this$0.binding;
            if (veVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                veVar8 = null;
            }
            veVar8.d.setTextColor(Color.parseColor("#FFFFFF"));
            ve veVar9 = this$0.binding;
            if (veVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                veVar9 = null;
            }
            veVar9.n.setTextColor(Color.parseColor("#000000"));
            ve veVar10 = this$0.binding;
            if (veVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                veVar10 = null;
            }
            veVar10.k.setTextColor(Color.parseColor("#000000"));
            ArrayList arrayListG0 = this$0.v1().G0();
            Intrinsics.checkNotNull(arrayListG0, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.NrvDetails>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.RC.Model.NrvDetails> }");
            this$0.P1(arrayListG0);
            if (this$0.u1().size() <= 0) {
                ve veVar11 = this$0.binding;
                if (veVar11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    veVar11 = null;
                }
                veVar11.l.setAdapter(null);
                ve veVar12 = this$0.binding;
                if (veVar12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    veVar12 = null;
                }
                veVar12.o.setVisibility(0);
                ve veVar13 = this$0.binding;
                if (veVar13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    veVar2 = veVar13;
                }
                veVar2.o.setText(this$0.B1().b(va3.a.Z(), "No Virtual RC Found"));
                return;
            }
            ve veVar14 = this$0.binding;
            if (veVar14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                veVar14 = null;
            }
            veVar14.o.setVisibility(8);
            ve veVar15 = this$0.binding;
            if (veVar15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                veVar15 = null;
            }
            veVar15.l.setAdapter(null);
            this$0.T1(new l04(this$0.u1(), this$0, this$0));
            ve veVar16 = this$0.binding;
            if (veVar16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                veVar2 = veVar16;
            }
            veVar2.l.setAdapter(this$0.y1());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void G1(RCDashBoard this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.z1().dismiss();
        try {
            this$0.Y1(this$0, this$0.B1().b(va3.a.P0(), "Unable to Update the Virtual RC, Please try after some time"));
        } catch (Exception unused) {
        }
    }

    public static final void H1(RCDashBoard this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ve veVar = this$0.binding;
        ve veVar2 = null;
        if (veVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            veVar = null;
        }
        veVar.e.setBackgroundResource(R.drawable.dashboard);
        ve veVar3 = this$0.binding;
        if (veVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            veVar3 = null;
        }
        veVar3.m.setBackgroundResource(R.drawable.sign_in_new);
        ve veVar4 = this$0.binding;
        if (veVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            veVar4 = null;
        }
        veVar4.b.setBackgroundResource(R.drawable.dashboard);
        ve veVar5 = this$0.binding;
        if (veVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            veVar5 = null;
        }
        veVar5.g.setImageResource(R.drawable.myrcicon);
        ve veVar6 = this$0.binding;
        if (veVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            veVar6 = null;
        }
        veVar6.c.setImageResource(R.drawable.white_shared);
        ve veVar7 = this$0.binding;
        if (veVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            veVar7 = null;
        }
        veVar7.j.setImageResource(R.drawable.black_recived);
        ve veVar8 = this$0.binding;
        if (veVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            veVar8 = null;
        }
        veVar8.d.setTextColor(Color.parseColor("#000000"));
        ve veVar9 = this$0.binding;
        if (veVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            veVar9 = null;
        }
        veVar9.n.setTextColor(Color.parseColor("#FFFFFF"));
        ve veVar10 = this$0.binding;
        if (veVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            veVar2 = veVar10;
        }
        veVar2.k.setTextColor(Color.parseColor("#000000"));
        this$0.z1().show();
        this$0.x1().Q(this$0.C1().k(), this$0);
    }

    public static final void I1(RCDashBoard this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ve veVar = this$0.binding;
        ve veVar2 = null;
        if (veVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            veVar = null;
        }
        veVar.e.setBackgroundResource(R.drawable.dashboard);
        ve veVar3 = this$0.binding;
        if (veVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            veVar3 = null;
        }
        veVar3.m.setBackgroundResource(R.drawable.dashboard);
        ve veVar4 = this$0.binding;
        if (veVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            veVar4 = null;
        }
        veVar4.b.setBackgroundResource(R.drawable.sign_in_new);
        ve veVar5 = this$0.binding;
        if (veVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            veVar5 = null;
        }
        veVar5.g.setImageResource(R.drawable.myrcicon);
        ve veVar6 = this$0.binding;
        if (veVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            veVar6 = null;
        }
        veVar6.c.setImageResource(R.drawable.black_shareicon);
        ve veVar7 = this$0.binding;
        if (veVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            veVar7 = null;
        }
        veVar7.j.setImageResource(R.drawable.white_reciced);
        ve veVar8 = this$0.binding;
        if (veVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            veVar8 = null;
        }
        veVar8.d.setTextColor(Color.parseColor("#000000"));
        ve veVar9 = this$0.binding;
        if (veVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            veVar9 = null;
        }
        veVar9.n.setTextColor(Color.parseColor("#000000"));
        ve veVar10 = this$0.binding;
        if (veVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            veVar2 = veVar10;
        }
        veVar2.k.setTextColor(Color.parseColor("#FFFFFF"));
        this$0.z1().show();
        this$0.x1().P(this$0.C1().k(), this$0);
    }

    public static final void J1(RCDashBoard this$0, GetSharedRecivedDoc getSharedRecivedDoc) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.z1().dismiss();
            ve veVar = null;
            if (!StringsKt__StringsJVMKt.equals(getSharedRecivedDoc.getStatusCode(), "VTLD001", true)) {
                if (StringsKt__StringsJVMKt.equals(getSharedRecivedDoc.getStatusCode(), "VTLD007", true)) {
                    ve veVar2 = this$0.binding;
                    if (veVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        veVar2 = null;
                    }
                    veVar2.l.setAdapter(null);
                    ve veVar3 = this$0.binding;
                    if (veVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        veVar3 = null;
                    }
                    veVar3.o.setVisibility(0);
                    ve veVar4 = this$0.binding;
                    if (veVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        veVar = veVar4;
                    }
                    veVar.o.setText(this$0.B1().b(va3.a.U(), "No Shared RC found"));
                    return;
                }
                ve veVar5 = this$0.binding;
                if (veVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    veVar5 = null;
                }
                veVar5.l.setAdapter(null);
                ve veVar6 = this$0.binding;
                if (veVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    veVar6 = null;
                }
                veVar6.o.setVisibility(0);
                ve veVar7 = this$0.binding;
                if (veVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    veVar = veVar7;
                }
                veVar.o.setText(this$0.B1().b(va3.a.U(), "No Shared RC found"));
                return;
            }
            if (getSharedRecivedDoc.getSharedDocs().size() <= 0) {
                ve veVar8 = this$0.binding;
                if (veVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    veVar8 = null;
                }
                veVar8.l.setAdapter(null);
                ve veVar9 = this$0.binding;
                if (veVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    veVar9 = null;
                }
                veVar9.o.setVisibility(0);
                ve veVar10 = this$0.binding;
                if (veVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    veVar = veVar10;
                }
                veVar.o.setText(this$0.B1().b(va3.a.U(), "No Shared RC found"));
                return;
            }
            ve veVar11 = this$0.binding;
            if (veVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                veVar11 = null;
            }
            veVar11.o.setVisibility(8);
            ve veVar12 = this$0.binding;
            if (veVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                veVar12 = null;
            }
            veVar12.l.setAdapter(null);
            List<SharedDoc> sharedDocs = getSharedRecivedDoc.getSharedDocs();
            Intrinsics.checkNotNull(sharedDocs, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.SharedDoc>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.RC.Model.SharedDoc> }");
            this$0.X1(new y04((ArrayList) sharedDocs, this$0, this$0));
            ve veVar13 = this$0.binding;
            if (veVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                veVar = veVar13;
            }
            veVar.l.setAdapter(this$0.D1());
        } catch (Exception e) {
            this$0.z1().dismiss();
            e.printStackTrace();
            Toast.makeText(this$0.getApplicationContext(), this$0.B1().b(va3.a.a0(), "Number is not registered with the mParivahan"), 1).show();
        }
    }

    public static final void K1(RCDashBoard this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.z1().dismiss();
    }

    public static final void L1(RCDashBoard this$0, GetSharedRecivedDoc getSharedRecivedDoc) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ve veVar = null;
        try {
            this$0.z1().dismiss();
            if (StringsKt__StringsJVMKt.equals(getSharedRecivedDoc.getStatusCode(), "VTLD001", true)) {
                if (getSharedRecivedDoc.getReceivedDocs().size() <= 0) {
                    ve veVar2 = this$0.binding;
                    if (veVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        veVar2 = null;
                    }
                    veVar2.o.setVisibility(0);
                    ve veVar3 = this$0.binding;
                    if (veVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        veVar3 = null;
                    }
                    veVar3.l.setAdapter(null);
                    ve veVar4 = this$0.binding;
                    if (veVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        veVar4 = null;
                    }
                    veVar4.o.setText(this$0.B1().b(va3.a.S(), "No Received RC Found"));
                    return;
                }
                ve veVar5 = this$0.binding;
                if (veVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    veVar5 = null;
                }
                veVar5.o.setVisibility(8);
                ve veVar6 = this$0.binding;
                if (veVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    veVar6 = null;
                }
                veVar6.l.setAdapter(null);
                List<ReceivedDoc> receivedDocs = getSharedRecivedDoc.getReceivedDocs();
                Intrinsics.checkNotNull(receivedDocs, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.ReceivedDoc>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.RC.Model.ReceivedDoc> }");
                r04 r04Var = new r04((ArrayList) receivedDocs, this$0, this$0);
                ve veVar7 = this$0.binding;
                if (veVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    veVar7 = null;
                }
                veVar7.l.setAdapter(r04Var);
                return;
            }
            if (StringsKt__StringsJVMKt.equals(getSharedRecivedDoc.getStatusCode(), "VTLD007", true)) {
                ve veVar8 = this$0.binding;
                if (veVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    veVar8 = null;
                }
                veVar8.l.setAdapter(null);
                ve veVar9 = this$0.binding;
                if (veVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    veVar9 = null;
                }
                veVar9.o.setVisibility(0);
                ve veVar10 = this$0.binding;
                if (veVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    veVar10 = null;
                }
                veVar10.l.setAdapter(null);
                ve veVar11 = this$0.binding;
                if (veVar11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    veVar11 = null;
                }
                veVar11.o.setText(this$0.B1().b(va3.a.S(), "No Received RC Found"));
                return;
            }
            if (StringsKt__StringsJVMKt.equals(getSharedRecivedDoc.getStatusCode(), "VTLD099", true)) {
                ve veVar12 = this$0.binding;
                if (veVar12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    veVar12 = null;
                }
                veVar12.o.setVisibility(0);
                ve veVar13 = this$0.binding;
                if (veVar13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    veVar13 = null;
                }
                veVar13.l.setAdapter(null);
                ve veVar14 = this$0.binding;
                if (veVar14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    veVar14 = null;
                }
                veVar14.o.setText(this$0.B1().b(va3.a.S(), "No Received RC Found"));
                return;
            }
            ve veVar15 = this$0.binding;
            if (veVar15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                veVar15 = null;
            }
            veVar15.o.setVisibility(0);
            ve veVar16 = this$0.binding;
            if (veVar16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                veVar16 = null;
            }
            veVar16.l.setAdapter(null);
            ve veVar17 = this$0.binding;
            if (veVar17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                veVar17 = null;
            }
            veVar17.o.setText(this$0.B1().b(va3.a.S(), "No Received RC Found"));
        } catch (Exception e) {
            this$0.z1().dismiss();
            e.printStackTrace();
            ve veVar18 = this$0.binding;
            if (veVar18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                veVar18 = null;
            }
            veVar18.o.setVisibility(0);
            ve veVar19 = this$0.binding;
            if (veVar19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                veVar19 = null;
            }
            veVar19.l.setAdapter(null);
            ve veVar20 = this$0.binding;
            if (veVar20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                veVar = veVar20;
            }
            veVar.o.setText(this$0.B1().b(va3.a.S(), "No Received RC Found"));
        }
    }

    public static final void M1(RCDashBoard this$0, SharedRcDeletResponse sharedRcDeletResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.z1().dismiss();
            if (StringsKt__StringsJVMKt.equals(sharedRcDeletResponse.getStatusCode(), "VTLD001", true)) {
                try {
                    this$0.D1().Q(this$0.position);
                    this$0.Y1(this$0, this$0.B1().b(va3.a.u0(), "Shared RC Successfully Deleted!"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (StringsKt__StringsJVMKt.equals(sharedRcDeletResponse.getStatusCode(), "VTLD007", true)) {
                Toast.makeText(this$0.getApplicationContext(), this$0.B1().b(va3.a.I0(), "Unable to delete the shared RC, Please try after some times"), 1).show();
            } else {
                Toast.makeText(this$0.getApplicationContext(), this$0.B1().b(va3.a.I0(), "Unable to delete the shared RC, Please try after some times"), 1).show();
            }
        } catch (Exception unused) {
            this$0.z1().dismiss();
            Toast.makeText(this$0.getApplicationContext(), this$0.B1().b(va3.a.I0(), "Unable to delete the shared RC, Please try after some times"), 1).show();
        }
    }

    public static final void N1(RCDashBoard this$0, MyRcDeletResponse myRcDeletResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.z1().dismiss();
            if (StringsKt__StringsJVMKt.equals(myRcDeletResponse.getStatusCode(), "VTLD001", true)) {
                try {
                    this$0.y1().O(this$0.MyRcAdapterPosition);
                    this$0.v1().p0(this$0.A1());
                    this$0.Y1(this$0, this$0.B1().b(va3.a.h0(), "Virtual RC successfully deleted!"));
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(this$0.getApplicationContext(), this$0.B1().b(va3.a.G0(), "Unable to delete the Virtual RC, Please try after some time"), 1).show();
                }
            } else if (StringsKt__StringsJVMKt.equals(myRcDeletResponse.getStatusCode(), "VTLD007", true)) {
                Toast.makeText(this$0.getApplicationContext(), this$0.B1().b(va3.a.G0(), "Unable to delete the Virtual RC, Please try after some time"), 1).show();
            } else {
                Toast.makeText(this$0.getApplicationContext(), this$0.B1().b(va3.a.G0(), "Unable to delete the Virtual RC, Please try after some time"), 1).show();
            }
        } catch (Exception unused) {
            this$0.z1().dismiss();
            Toast.makeText(this$0.getApplicationContext(), this$0.B1().b(va3.a.G0(), "Unable to delete the Virtual RC, Please try after some time"), 1).show();
        }
    }

    public static final void O1(RCDashBoard this$0, RcModelsDet rcModelsDet) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.z1().dismiss();
        try {
            if (StringsKt__StringsJVMKt.equals(rcModelsDet.getStatusCode().toString(), "NP001", true)) {
                this$0.Y1(this$0, "Virtual RC successfully updated!");
            } else {
                this$0.Y1(this$0, this$0.B1().b(va3.a.P0(), "Unable to Update the Virtual RC, Please try after some time"));
            }
        } catch (Exception unused) {
            this$0.z1().dismiss();
            this$0.Y1(this$0, this$0.B1().b(va3.a.P0(), "Unable to Update the Virtual RC, Please try after some time"));
        }
    }

    public static final void Z1(Dialog d2, View view) {
        Intrinsics.checkNotNullParameter(d2, "$d");
        d2.dismiss();
    }

    public final String A1() {
        String str = this.selectedRcNumber;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("selectedRcNumber");
        return null;
    }

    public final wa3 B1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final ws6 C1() {
        ws6 ws6Var = this.sessionManager;
        if (ws6Var != null) {
            return ws6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        return null;
    }

    public final y04 D1() {
        y04 y04Var = this.shared_adapter;
        if (y04Var != null) {
            return y04Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shared_adapter");
        return null;
    }

    public final void P1(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.arrayList = arrayList;
    }

    @Override // com.zepto.vh1
    public void Q(String shared_id, int position) {
        this.position = position;
        z1().show();
        x1().k(String.valueOf(shared_id), C1().k(), this);
    }

    public final void Q1(DatabaseHelper databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "<set-?>");
        this.databaseHelper = databaseHelper;
    }

    public final void R1(RcService rcService) {
        Intrinsics.checkNotNullParameter(rcService, "<set-?>");
        this.mRcService = rcService;
    }

    @Override // com.zepto.uh1
    public void S(String rc, int position) throws Throwable {
        String strC0 = v1().C0(rc);
        z1().show();
        a55 a55VarX1 = x1();
        String strK = C1().k();
        Intrinsics.checkNotNull(strC0);
        a55VarX1.o(strK, strC0, this);
    }

    public final void S1(a55 a55Var) {
        Intrinsics.checkNotNullParameter(a55Var, "<set-?>");
        this.mRcViewModel = a55Var;
    }

    public final void T1(l04 l04Var) {
        Intrinsics.checkNotNullParameter(l04Var, "<set-?>");
        this.myRcAdapter = l04Var;
    }

    public final void U1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void V1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.selectedRcNumber = str;
    }

    public final void W1(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.sessionManager = ws6Var;
    }

    public final void X1(y04 y04Var) {
        Intrinsics.checkNotNullParameter(y04Var, "<set-?>");
        this.shared_adapter = y04Var;
    }

    public final void Y1(Context context, String message) {
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
        ((TextView) viewFindViewById3).setText(B1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(B1().b("btn_ok", "OK"));
        ((TextView) viewFindViewById).setText(message);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.f25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RCDashBoard.Z1(dialog, view);
            }
        });
        dialog.show();
    }

    @Override // com.zepto.u55
    public void c0(String shared_id, int position) {
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        ve veVarC = ve.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(veVarC, "inflate(...)");
        this.binding = veVarC;
        ve veVar = null;
        if (veVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            veVarC = null;
        }
        setContentView(veVarC.b());
        ta3.a aVar = ta3.a;
        ve veVar2 = this.binding;
        if (veVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            veVar2 = null;
        }
        aVar.G1(this, veVar2);
        W1(new ws6(this));
        R1(RcService.INSTANCE.a(this));
        U1(new ProgressDialog(this));
        z1().setMessage("Please wait...");
        z1().setCancelable(false);
        z1().setCanceledOnTouchOutside(false);
        ve veVar3 = this.binding;
        if (veVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            veVar3 = null;
        }
        veVar3.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.d25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RCDashBoard.E1(this.a, view);
            }
        });
        ve veVar4 = this.binding;
        if (veVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            veVar4 = null;
        }
        veVar4.l.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(this);
        Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
        Q1(databaseHelperD0);
        S1((a55) new z(this, new b55(new s45(w1()))).a(a55.class));
        try {
            ArrayList arrayListG0 = v1().G0();
            Intrinsics.checkNotNull(arrayListG0, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.NrvDetails>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.RC.Model.NrvDetails> }");
            P1(arrayListG0);
            if (u1().size() > 0) {
                ve veVar5 = this.binding;
                if (veVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    veVar5 = null;
                }
                veVar5.e.setBackgroundResource(R.drawable.corner_rectangle_bg_17);
                ve veVar6 = this.binding;
                if (veVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    veVar6 = null;
                }
                veVar6.d.setTextColor(Color.parseColor("#FFFFFF"));
                ve veVar7 = this.binding;
                if (veVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    veVar7 = null;
                }
                veVar7.g.setImageResource(R.drawable.white_myrc);
                ve veVar8 = this.binding;
                if (veVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    veVar8 = null;
                }
                veVar8.o.setVisibility(8);
                T1(new l04(u1(), this, this));
                ve veVar9 = this.binding;
                if (veVar9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    veVar9 = null;
                }
                veVar9.l.setAdapter(y1());
            } else {
                ve veVar10 = this.binding;
                if (veVar10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    veVar10 = null;
                }
                veVar10.e.setBackgroundResource(R.drawable.corner_rectangle_bg_17);
                ve veVar11 = this.binding;
                if (veVar11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    veVar11 = null;
                }
                veVar11.d.setTextColor(Color.parseColor("#FFFFFF"));
                ve veVar12 = this.binding;
                if (veVar12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    veVar12 = null;
                }
                veVar12.o.setVisibility(0);
                ve veVar13 = this.binding;
                if (veVar13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    veVar13 = null;
                }
                veVar13.o.setText(B1().b(va3.a.Z(), "No Virtual RC Found"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        ve veVar14 = this.binding;
        if (veVar14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            veVar14 = null;
        }
        veVar14.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.h25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                RCDashBoard.F1(this.a, view);
            }
        });
        ve veVar15 = this.binding;
        if (veVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            veVar15 = null;
        }
        veVar15.m.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.i25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RCDashBoard.H1(this.a, view);
            }
        });
        ve veVar16 = this.binding;
        if (veVar16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            veVar = veVar16;
        }
        veVar.b.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.j25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RCDashBoard.I1(this.a, view);
            }
        });
        x1().F().g(this, new mf4() { // from class: com.zepto.k25
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                RCDashBoard.J1(this.a, (GetSharedRecivedDoc) obj);
            }
        });
        x1().G().g(this, new mf4() { // from class: com.zepto.l25
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                RCDashBoard.K1(this.a, (String) obj);
            }
        });
        x1().D().g(this, new mf4() { // from class: com.zepto.m25
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                RCDashBoard.L1(this.a, (GetSharedRecivedDoc) obj);
            }
        });
        x1().E().g(this, new d(new c()));
        x1().J().g(this, new mf4() { // from class: com.zepto.n25
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                RCDashBoard.M1(this.a, (SharedRcDeletResponse) obj);
            }
        });
        x1().K().g(this, new d(new a()));
        x1().z().g(this, new mf4() { // from class: com.zepto.o25
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                RCDashBoard.N1(this.a, (MyRcDeletResponse) obj);
            }
        });
        x1().A().g(this, new d(new b()));
        x1().R().g(this, new mf4() { // from class: com.zepto.e25
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                RCDashBoard.O1(this.a, (RcModelsDet) obj);
            }
        });
        x1().S().g(this, new mf4() { // from class: com.zepto.g25
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                RCDashBoard.G1(this.a, (String) obj);
            }
        });
    }

    @Override // com.zepto.uh1
    public void p(String rc_number, int position) throws Throwable {
        this.MyRcAdapterPosition = position;
        V1(String.valueOf(rc_number));
        if (v1().C0(rc_number) != null) {
            z1().show();
            String strC0 = v1().C0(rc_number);
            a55 a55VarX1 = x1();
            Intrinsics.checkNotNull(strC0);
            a55VarX1.i(strC0, this);
        }
    }

    public final ArrayList u1() {
        ArrayList arrayList = this.arrayList;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("arrayList");
        return null;
    }

    public final DatabaseHelper v1() {
        DatabaseHelper databaseHelper = this.databaseHelper;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("databaseHelper");
        return null;
    }

    public final RcService w1() {
        RcService rcService = this.mRcService;
        if (rcService != null) {
            return rcService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRcService");
        return null;
    }

    public final a55 x1() {
        a55 a55Var = this.mRcViewModel;
        if (a55Var != null) {
            return a55Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRcViewModel");
        return null;
    }

    public final l04 y1() {
        l04 l04Var = this.myRcAdapter;
        if (l04Var != null) {
            return l04Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("myRcAdapter");
        return null;
    }

    public final ProgressDialog z1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }
}
