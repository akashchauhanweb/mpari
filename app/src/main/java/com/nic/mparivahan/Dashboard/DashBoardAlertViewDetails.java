package com.nic.mparivahan.Dashboard;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.z;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dashboard.DashBoardAlertViewDetails;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.NrvDetails;
import com.nic.mparivahan.RC.Model.RcModelsDet;
import com.nic.mparivahan.RC.RcInterface.RcImpoundService;
import com.nic.mparivahan.RC.RcInterface.RcService;
import com.zepto.a55;
import com.zepto.b55;
import com.zepto.gd1;
import com.zepto.hd1;
import com.zepto.kt6;
import com.zepto.mf4;
import com.zepto.n35;
import com.zepto.o45;
import com.zepto.p45;
import com.zepto.pq;
import com.zepto.q45;
import com.zepto.s45;
import com.zepto.ta3;
import com.zepto.va3;
import com.zepto.wa3;
import com.zepto.ws6;
import com.zepto.yy0;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bg\u0010hJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0016\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0016\u0010O\u001a\u00020L8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010f\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010e¨\u0006i"}, d2 = {"Lcom/nic/mparivahan/Dashboard/DashBoardAlertViewDetails;", "Lcom/zepto/pq;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lcom/zepto/hd1;", "binding", "Lcom/nic/mparivahan/RC/Model/NrvDetails;", "rcdetails", "D1", "Landroid/content/Context;", "context", "", "message", "J1", "change_color", "Landroid/widget/TextView;", "textView", "n1", "C", "Lcom/zepto/hd1;", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "D", "Lcom/nic/mparivahan/DB/DatabaseHelper;", "o1", "()Lcom/nic/mparivahan/DB/DatabaseHelper;", "y1", "(Lcom/nic/mparivahan/DB/DatabaseHelper;)V", "databaseHelper", "E", "Lcom/nic/mparivahan/RC/Model/NrvDetails;", "t1", "()Lcom/nic/mparivahan/RC/Model/NrvDetails;", "G1", "(Lcom/nic/mparivahan/RC/Model/NrvDetails;)V", "Landroid/widget/ImageView;", "F", "Landroid/widget/ImageView;", "getQrImg", "()Landroid/widget/ImageView;", "C1", "(Landroid/widget/ImageView;)V", "qrImg", "Landroid/app/ProgressDialog;", "G", "Landroid/app/ProgressDialog;", "r1", "()Landroid/app/ProgressDialog;", "B1", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/a55;", "H", "Lcom/zepto/a55;", "q1", "()Lcom/zepto/a55;", "A1", "(Lcom/zepto/a55;)V", "mRcViewModel", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "I", "Lcom/nic/mparivahan/RC/RcInterface/RcService;", "p1", "()Lcom/nic/mparivahan/RC/RcInterface/RcService;", "z1", "(Lcom/nic/mparivahan/RC/RcInterface/RcService;)V", "mRcService", "Lcom/zepto/o45;", "J", "Lcom/zepto/o45;", "getRcImpoundModel", "()Lcom/zepto/o45;", "E1", "(Lcom/zepto/o45;)V", "rcImpoundModel", "Lcom/nic/mparivahan/RC/RcInterface/RcImpoundService;", "K", "Lcom/nic/mparivahan/RC/RcInterface/RcImpoundService;", "rcImpoundService", "Lcom/zepto/wa3;", "L", "Lcom/zepto/wa3;", "u1", "()Lcom/zepto/wa3;", "H1", "(Lcom/zepto/wa3;)V", "session", "Lcom/zepto/ws6;", "M", "Lcom/zepto/ws6;", "getUserSessionManager", "()Lcom/zepto/ws6;", "I1", "(Lcom/zepto/ws6;)V", "userSessionManager", "N", "Ljava/lang/String;", "s1", "()Ljava/lang/String;", "F1", "(Ljava/lang/String;)V", "rc_number", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class DashBoardAlertViewDetails extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public hd1 binding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public DatabaseHelper databaseHelper;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public NrvDetails rcdetails;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public ImageView qrImg;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public a55 mRcViewModel;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public RcService mRcService;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public o45 rcImpoundModel;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public RcImpoundService rcImpoundService;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public ws6 userSessionManager;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String rc_number;

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
        public final void a(RcModelsDet rcModelsDet) throws Throwable {
            DashBoardAlertViewDetails.this.r1().dismiss();
            try {
                if (!StringsKt__StringsJVMKt.equals(rcModelsDet.getStatusCode().toString(), "NP001", true)) {
                    DashBoardAlertViewDetails dashBoardAlertViewDetails = DashBoardAlertViewDetails.this;
                    dashBoardAlertViewDetails.J1(dashBoardAlertViewDetails, dashBoardAlertViewDetails.u1().b(va3.a.Q0(), "Unable to Update the  Vehicle alert, Please try after some times"));
                    return;
                }
                try {
                    if (n35.a.l(DashBoardAlertViewDetails.this, rcModelsDet.getNrvDetails()) > 0) {
                        DashBoardAlertViewDetails dashBoardAlertViewDetails2 = DashBoardAlertViewDetails.this;
                        hd1 hd1Var = dashBoardAlertViewDetails2.binding;
                        if (hd1Var == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            hd1Var = null;
                        }
                        NrvDetails nrvDetailsF0 = DashBoardAlertViewDetails.this.o1().F0(rcModelsDet.getNrvDetails().getRc_regn_no());
                        Intrinsics.checkNotNullExpressionValue(nrvDetailsF0, "getRCDetails(...)");
                        dashBoardAlertViewDetails2.D1(hd1Var, nrvDetailsF0);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                DashBoardAlertViewDetails dashBoardAlertViewDetails3 = DashBoardAlertViewDetails.this;
                dashBoardAlertViewDetails3.J1(dashBoardAlertViewDetails3, dashBoardAlertViewDetails3.u1().b(va3.a.S0(), "Vehicle alert successfully updated"));
            } catch (Exception unused) {
                DashBoardAlertViewDetails.this.r1().dismiss();
                DashBoardAlertViewDetails dashBoardAlertViewDetails4 = DashBoardAlertViewDetails.this;
                dashBoardAlertViewDetails4.J1(dashBoardAlertViewDetails4, dashBoardAlertViewDetails4.u1().b(va3.a.Q0(), "Unable to Update the  Vehicle alert, Please try after some times"));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            a((RcModelsDet) obj);
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
            DashBoardAlertViewDetails.this.r1().dismiss();
            DashBoardAlertViewDetails dashBoardAlertViewDetails = DashBoardAlertViewDetails.this;
            dashBoardAlertViewDetails.J1(dashBoardAlertViewDetails, dashBoardAlertViewDetails.u1().b(va3.a.Q0(), "Unable to Update the  Vehicle alert, Please try after some times"));
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

    public static final void K1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void v1(DashBoardAlertViewDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) DashBoard.class));
        this$0.finish();
    }

    public static final void w1(DashBoardAlertViewDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) DashBoard.class));
        this$0.finish();
    }

    public static final void x1(DashBoardAlertViewDetails this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.o1().C0(this$0.s1()) != null) {
            this$0.r1().show();
            this$0.q1().l(this$0.s1(), this$0);
        }
    }

    public final void A1(a55 a55Var) {
        Intrinsics.checkNotNullParameter(a55Var, "<set-?>");
        this.mRcViewModel = a55Var;
    }

    public final void B1(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void C1(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.qrImg = imageView;
    }

    public final void D1(hd1 binding, NrvDetails rcdetails) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(rcdetails, "rcdetails");
        try {
            binding.D.setText(rcdetails.getRc_owner_name());
            binding.S.setText(rcdetails.getRc_f_name());
            binding.d.setText(rcdetails.getRc_chasi_no());
            binding.h.setText(rcdetails.getRc_eng_no());
            binding.K.setText(rcdetails.getRc_maker_desc());
            gd1.a aVar = gd1.a;
            if (aVar.m(rcdetails.getRc_tax_upto())) {
                binding.d0.setVisibility(8);
            } else if (aVar.n(rcdetails.getRc_tax_upto()) && aVar.f(String.valueOf(rcdetails.getRc_tax_upto()))) {
                String strD = aVar.d(this, String.valueOf(rcdetails.getRc_tax_upto()), " ");
                binding.c0.setText(strD);
                MyTextView taxValidUpTo = binding.c0;
                Intrinsics.checkNotNullExpressionValue(taxValidUpTo, "taxValidUpTo");
                n1(strD, taxValidUpTo);
            } else {
                binding.c0.setText(rcdetails.getRc_tax_upto());
            }
            if (kt6.d(rcdetails.getRc_maker_model())) {
                binding.M.setText(rcdetails.getRc_maker_model());
            } else {
                binding.M.setText("NA");
            }
            if (kt6.d(rcdetails.getRc_insurance_comp())) {
                binding.q.setText(rcdetails.getRc_insurance_comp());
            } else {
                binding.q.setText("NA");
            }
            if (kt6.d(rcdetails.getRc_insurance_policy_no())) {
                binding.r.setText(rcdetails.getRc_insurance_policy_no());
            } else {
                binding.r.setText("NA");
            }
            binding.w0.setText(rcdetails.getRc_vch_catg());
            binding.y0.setText(rcdetails.getRc_vh_class_desc());
            binding.n.setText(rcdetails.getRc_fuel_desc());
            binding.f.setText(rcdetails.getRc_color());
            binding.X.setText(rcdetails.getRc_seat_cap());
            binding.a0.setText(rcdetails.getRc_stand_cap());
            if (aVar.m(String.valueOf(rcdetails.getRc_financer()))) {
                binding.j.setText("NA");
            } else {
                binding.j.setText(rcdetails.getRc_financer());
            }
            if (aVar.n(rcdetails.getRc_insurance_upto()) && aVar.f(String.valueOf(rcdetails.getRc_insurance_upto()))) {
                String strD2 = aVar.d(this, String.valueOf(rcdetails.getRc_insurance_upto()), " ");
                binding.t.setText(strD2);
                MyTextView insuranceUptoTxt = binding.t;
                Intrinsics.checkNotNullExpressionValue(insuranceUptoTxt, "insuranceUptoTxt");
                n1(strD2, insuranceUptoTxt);
            } else {
                binding.t.setText(rcdetails.getRc_insurance_upto());
            }
            if (aVar.n(rcdetails.getRc_fit_upto()) && aVar.f(String.valueOf(rcdetails.getRc_fit_upto()))) {
                String strD3 = aVar.d(this, String.valueOf(rcdetails.getRc_fit_upto()), " ");
                binding.l.setText(strD3);
                MyTextView fitnessupto = binding.l;
                Intrinsics.checkNotNullExpressionValue(fitnessupto, "fitnessupto");
                n1(strD3, fitnessupto);
            } else {
                binding.l.setText(rcdetails.getRc_fit_upto());
            }
            if (aVar.m(rcdetails.getRc_pucc_upto())) {
                binding.H.setVisibility(8);
                binding.I.setVisibility(8);
            } else if (aVar.n(rcdetails.getRc_pucc_upto()) && aVar.f(String.valueOf(rcdetails.getRc_pucc_upto()))) {
                String strD4 = aVar.d(this, String.valueOf(rcdetails.getRc_pucc_upto()), " ");
                binding.I.setText(strD4);
                MyTextView puccValidatityTxt = binding.I;
                Intrinsics.checkNotNullExpressionValue(puccValidatityTxt, "puccValidatityTxt");
                n1(strD4, puccValidatityTxt);
            } else {
                binding.I.setText(rcdetails.getRc_pucc_upto());
            }
            binding.U.setText(rcdetails.getRc_registered_at());
            binding.p0.setText(rcdetails.getRc_blacklist_status());
            if (Intrinsics.areEqual(rcdetails.getRc_blacklist_status(), "NA")) {
                binding.u.setVisibility(8);
            } else {
                binding.u.setVisibility(8);
            }
            binding.e0.setVisibility(8);
            binding.m0.setText(rcdetails.getRc_np_no());
            CharSequence text = binding.m0.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            if (text.length() == 0) {
                binding.v.setVisibility(8);
            } else {
                binding.v.setVisibility(8);
            }
            if (aVar.n(rcdetails.getRc_np_upto()) && aVar.f(String.valueOf(rcdetails.getRc_np_upto()))) {
                String strD5 = aVar.d(this, String.valueOf(rcdetails.getRc_np_upto()), " ");
                binding.n0.setText(strD5);
                MyTextView txtPermitNumberValid = binding.n0;
                Intrinsics.checkNotNullExpressionValue(txtPermitNumberValid, "txtPermitNumberValid");
                n1(strD5, txtPermitNumberValid);
            } else {
                binding.n0.setText(rcdetails.getRc_np_upto());
            }
            CharSequence text2 = binding.n0.getText();
            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
            if (text2.length() == 0) {
                binding.w.setVisibility(8);
            } else {
                binding.w.setVisibility(0);
            }
            binding.o0.setText(rcdetails.getRc_permit_valid_upto());
            if (aVar.n(rcdetails.getRc_permit_valid_upto()) && aVar.f(String.valueOf(rcdetails.getRc_permit_valid_upto()))) {
                String strD6 = aVar.d(this, String.valueOf(rcdetails.getRc_permit_valid_upto()), " ");
                binding.o0.setText(strD6);
                MyTextView txtPermitNumberValidTwo = binding.o0;
                Intrinsics.checkNotNullExpressionValue(txtPermitNumberValidTwo, "txtPermitNumberValidTwo");
                n1(strD6, txtPermitNumberValidTwo);
            } else {
                binding.o0.setText(rcdetails.getRc_permit_valid_upto());
            }
            CharSequence text3 = binding.o0.getText();
            Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
            if (text3.length() == 0) {
                binding.x.setVisibility(8);
            } else {
                binding.x.setVisibility(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void E1(o45 o45Var) {
        Intrinsics.checkNotNullParameter(o45Var, "<set-?>");
        this.rcImpoundModel = o45Var;
    }

    public final void F1(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rc_number = str;
    }

    public final void G1(NrvDetails nrvDetails) {
        Intrinsics.checkNotNullParameter(nrvDetails, "<set-?>");
        this.rcdetails = nrvDetails;
    }

    public final void H1(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final void I1(ws6 ws6Var) {
        Intrinsics.checkNotNullParameter(ws6Var, "<set-?>");
        this.userSessionManager = ws6Var;
    }

    public final void J1(Context context, String message) {
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
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.zepto.dd1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DashBoardAlertViewDetails.K1(dialog, view);
            }
        });
        dialog.show();
    }

    public final void n1(String change_color, TextView textView) {
        Intrinsics.checkNotNullParameter(change_color, "change_color");
        Intrinsics.checkNotNullParameter(textView, "textView");
        if (StringsKt__StringsKt.contains((CharSequence) change_color, (CharSequence) "Expired", true)) {
            textView.setTextColor(yy0.c(this, R.color.danger));
        }
        if (StringsKt__StringsKt.contains((CharSequence) change_color, (CharSequence) "Expiring", true)) {
            textView.setTextColor(yy0.c(this, R.color.vehicle_fit));
        }
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
        hd1 hd1VarC = hd1.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(hd1VarC, "inflate(...)");
        this.binding = hd1VarC;
        RcImpoundService rcImpoundService = null;
        if (hd1VarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            hd1VarC = null;
        }
        setContentView(hd1VarC.b());
        ta3.a aVar = ta3.a;
        hd1 hd1Var = this.binding;
        if (hd1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            hd1Var = null;
        }
        aVar.A(this, hd1Var);
        this.rcImpoundService = RcImpoundService.INSTANCE.a(this);
        z1(RcService.INSTANCE.a(this));
        I1(new ws6(this));
        H1(new wa3(this));
        View viewFindViewById = findViewById(R.id.rc_qr_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C1((ImageView) viewFindViewById);
        B1(new ProgressDialog(this));
        r1().setMessage("Please wait...");
        r1().setCancelable(false);
        r1().setCanceledOnTouchOutside(false);
        try {
            F1(String.valueOf(getIntent().getStringExtra("RcNumber")));
            DatabaseHelper databaseHelperD0 = DatabaseHelper.D0(this);
            Intrinsics.checkNotNullExpressionValue(databaseHelperD0, "getInstance(...)");
            y1(databaseHelperD0);
            NrvDetails nrvDetailsF0 = o1().F0(s1());
            Intrinsics.checkNotNullExpressionValue(nrvDetailsF0, "getRCDetails(...)");
            G1(nrvDetailsF0);
            if (s1() != null) {
                hd1 hd1Var2 = this.binding;
                if (hd1Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    hd1Var2 = null;
                }
                hd1Var2.N.setText(s1());
                hd1 hd1Var3 = this.binding;
                if (hd1Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    hd1Var3 = null;
                }
                D1(hd1Var3, t1());
            }
            hd1 hd1Var4 = this.binding;
            if (hd1Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                hd1Var4 = null;
            }
            hd1Var4.V.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ad1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DashBoardAlertViewDetails.v1(this.a, view);
                }
            });
            hd1 hd1Var5 = this.binding;
            if (hd1Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                hd1Var5 = null;
            }
            hd1Var5.y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.bd1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DashBoardAlertViewDetails.w1(this.a, view);
                }
            });
            hd1 hd1Var6 = this.binding;
            if (hd1Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                hd1Var6 = null;
            }
            hd1Var6.P.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.cd1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DashBoardAlertViewDetails.x1(this.a, view);
                }
            });
        } catch (Error e) {
            e.printStackTrace();
            Log.e("error", Unit.INSTANCE.toString());
        }
        A1((a55) new z(this, new b55(new s45(p1()))).a(a55.class));
        RcImpoundService rcImpoundService2 = this.rcImpoundService;
        if (rcImpoundService2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rcImpoundService");
        } else {
            rcImpoundService = rcImpoundService2;
        }
        E1((o45) new z(this, new q45(new p45(rcImpoundService))).a(o45.class));
        q1().p().g(this, new c(new a()));
        q1().S().g(this, new c(new b()));
    }

    public final RcService p1() {
        RcService rcService = this.mRcService;
        if (rcService != null) {
            return rcService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRcService");
        return null;
    }

    public final a55 q1() {
        a55 a55Var = this.mRcViewModel;
        if (a55Var != null) {
            return a55Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRcViewModel");
        return null;
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
        String str = this.rc_number;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rc_number");
        return null;
    }

    public final NrvDetails t1() {
        NrvDetails nrvDetails = this.rcdetails;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rcdetails");
        return null;
    }

    public final wa3 u1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final void y1(DatabaseHelper databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "<set-?>");
        this.databaseHelper = databaseHelper;
    }

    public final void z1(RcService rcService) {
        Intrinsics.checkNotNullParameter(rcService, "<set-?>");
        this.mRcService = rcService;
    }
}
