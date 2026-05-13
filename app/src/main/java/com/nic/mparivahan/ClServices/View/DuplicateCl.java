package com.nic.mparivahan.ClServices.View;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.z;
import com.nic.mparivahan.ClServices.ClInterface.ClInter;
import com.nic.mparivahan.ClServices.Pojo.ServiceSubmitResponse;
import com.nic.mparivahan.ClServices.View.DuplicateCl;
import com.nic.mparivahan.ClServicesMainScreens.ClDetailsTop;
import com.nic.mparivahan.ClServicesMainScreens.ClSubmitScreen;
import com.nic.mparivahan.R;
import com.zepto.hb;
import com.zepto.jl0;
import com.zepto.kl0;
import com.zepto.kt6;
import com.zepto.mf4;
import com.zepto.pq;
import com.zepto.sn0;
import com.zepto.ta3;
import com.zepto.wa3;
import com.zepto.wl5;
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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bx\u0010yJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u001c\u0010\t\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010/\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00103\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010*\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R\"\u00107\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010*\u001a\u0004\b5\u0010,\"\u0004\b6\u0010.R\"\u0010;\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u0010*\u001a\u0004\b9\u0010,\"\u0004\b:\u0010.R\"\u0010?\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010*\u001a\u0004\b=\u0010,\"\u0004\b>\u0010.R\"\u0010C\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010*\u001a\u0004\bA\u0010,\"\u0004\bB\u0010.R\"\u0010G\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010*\u001a\u0004\bE\u0010,\"\u0004\bF\u0010.R\"\u0010K\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010*\u001a\u0004\bI\u0010,\"\u0004\bJ\u0010.R\"\u0010O\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010*\u001a\u0004\bM\u0010,\"\u0004\bN\u0010.R\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010_\u001a\u00020X8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010k\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010*\u001a\u0004\bi\u0010,\"\u0004\bj\u0010.R\"\u0010o\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010*\u001a\u0004\bm\u0010,\"\u0004\bn\u0010.R\"\u0010s\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010*\u001a\u0004\bq\u0010,\"\u0004\br\u0010.R\"\u0010w\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010*\u001a\u0004\bu\u0010,\"\u0004\bv\u0010.¨\u0006z"}, d2 = {"Lcom/nic/mparivahan/ClServices/View/DuplicateCl;", "Lcom/zepto/pq;", "", "N1", "M1", "Landroid/content/Context;", "context", "", "message", "V1", "Y1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/zepto/hb;", "C", "Lcom/zepto/hb;", "duplicateClBinding", "D", "Landroid/content/Context;", "D1", "()Landroid/content/Context;", "h2", "(Landroid/content/Context;)V", "mContext", "Landroid/app/ProgressDialog;", "E", "Landroid/app/ProgressDialog;", "F1", "()Landroid/app/ProgressDialog;", "j2", "(Landroid/app/ProgressDialog;)V", "pDialog", "Lcom/zepto/wa3;", "F", "Lcom/zepto/wa3;", "J1", "()Lcom/zepto/wa3;", "n2", "(Lcom/zepto/wa3;)V", "session", "G", "Ljava/lang/String;", "x1", "()Ljava/lang/String;", "c2", "(Ljava/lang/String;)V", "dlValue", "H", "y1", "d2", "dobValue", "I", "z1", "e2", "fatherName", "J", "u1", "a2", "clName", "K", "v1", "b2", "clPhoto", "L", "G1", "k2", "rtoCode", "M", "K1", "o2", "stateCode", "N", "E1", "i2", "Mobile_no", "O", "H1", "l2", "rtoName", "Lcom/zepto/wl5;", "P", "Lcom/zepto/wl5;", "I1", "()Lcom/zepto/wl5;", "m2", "(Lcom/zepto/wl5;)V", "sarathiSession", "Lcom/zepto/kl0;", "Q", "Lcom/zepto/kl0;", "B1", "()Lcom/zepto/kl0;", "f2", "(Lcom/zepto/kl0;)V", "mClDlViewModel", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "R", "Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "C1", "()Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;", "g2", "(Lcom/nic/mparivahan/ClServices/ClInterface/ClInter;)V", "mClInter", "S", "t1", "setAddress", "address", "T", "A1", "setIssuing_authority", "issuing_authority", "U", "L1", "setValidity", "validity", "V", "w1", "setCl_Status", "cl_Status", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
public final class DuplicateCl extends pq {

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public hb duplicateClBinding;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public ProgressDialog pDialog;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public wa3 session;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public String dlValue;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public String dobValue;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String fatherName;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public String clName;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public String clPhoto;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public String rtoCode;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public String stateCode;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public String Mobile_no;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public String rtoName;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public wl5 sarathiSession;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public kl0 mClDlViewModel;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public ClInter mClInter;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public String address = "";

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public String issuing_authority = "";

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public String validity = "";

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public String cl_Status = "";

    public static final class a extends Lambda implements Function1 {
        public a() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
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
        public final void a(ServiceSubmitResponse serviceSubmitResponse) {
            String str = "Something went wrong,Please try after some time!";
            String cl_Status = "service_is_not_present";
            DuplicateCl.this.F1().dismiss();
            try {
                if (StringsKt__StringsJVMKt.equals(serviceSubmitResponse.getStatus_code(), "00", true)) {
                    String applicationNo = serviceSubmitResponse.getClServiceAckknowledgement().get(0).getApplicationNo();
                    if (applicationNo == null || applicationNo.length() == 0) {
                        DuplicateCl duplicateCl = DuplicateCl.this;
                        duplicateCl.Y1(duplicateCl.J1().b("service_is_not_present", "Something went wrong,Please try after some time!"));
                        str = str;
                    } else {
                        try {
                            Intent intent = new Intent(DuplicateCl.this, (Class<?>) ClSubmitScreen.class);
                            intent.putExtra("appNumber", serviceSubmitResponse.getClServiceAckknowledgement().get(0).getApplicationNo());
                            intent.putExtra("dlValue", DuplicateCl.this.x1());
                            intent.putExtra("dobValue", DuplicateCl.this.y1());
                            intent.putExtra("fatherName", DuplicateCl.this.z1());
                            intent.putExtra("clName", DuplicateCl.this.u1());
                            intent.putExtra("clPhoto", DuplicateCl.this.v1());
                            intent.putExtra("stateCode", DuplicateCl.this.K1());
                            intent.putExtra("rtoCode", DuplicateCl.this.G1());
                            intent.putExtra("rtoName", DuplicateCl.this.H1());
                            intent.putExtra("Mobile_no", DuplicateCl.this.E1());
                            intent.putExtra("address", DuplicateCl.this.getAddress()).toString();
                            intent.putExtra("issuing_authority", DuplicateCl.this.getIssuing_authority()).toString();
                            intent.putExtra("validity", DuplicateCl.this.getValidity()).toString();
                            cl_Status = DuplicateCl.this.getCl_Status();
                            intent.putExtra("cl_Status", cl_Status).toString();
                            DuplicateCl.this.startActivity(intent);
                            str = intent;
                        } catch (Exception unused) {
                        }
                    }
                } else if (StringsKt__StringsJVMKt.equals(serviceSubmitResponse.getStatus_code(), "01", true)) {
                    DuplicateCl.this.Y1(serviceSubmitResponse.getStatus_desc());
                    str = str;
                } else {
                    DuplicateCl duplicateCl2 = DuplicateCl.this;
                    duplicateCl2.Y1(duplicateCl2.J1().b("service_is_not_present", "Something went wrong,Please try after some time!"));
                    str = str;
                }
            } catch (Exception unused2) {
                DuplicateCl duplicateCl3 = DuplicateCl.this;
                duplicateCl3.Y1(duplicateCl3.J1().b(cl_Status, str));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ServiceSubmitResponse) obj);
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

    private final void M1() {
        h2(this);
        n2(new wa3(D1()));
        m2(new wl5(D1()));
        j2(new ProgressDialog(D1()));
        F1().setMessage(J1().b("label_challan_please_wait", getString(R.string.please_wait)));
        F1().setCancelable(false);
        F1().setCanceledOnTouchOutside(false);
        try {
            d2(String.valueOf(getIntent().getStringExtra("dobValue")));
            c2(String.valueOf(getIntent().getStringExtra("dlValue")));
            e2(String.valueOf(getIntent().getStringExtra("fatherName")));
            a2(String.valueOf(getIntent().getStringExtra("clName")));
            b2(String.valueOf(getIntent().getStringExtra("clPhoto")));
            k2(String.valueOf(getIntent().getStringExtra("rtoCode")));
            l2(String.valueOf(getIntent().getStringExtra("rtoName")));
            o2(String.valueOf(getIntent().getStringExtra("stateCode")));
            i2(String.valueOf(getIntent().getStringExtra("Mobile_no")));
            this.address = String.valueOf(getIntent().getStringExtra("address"));
            this.issuing_authority = String.valueOf(getIntent().getStringExtra("issuing_authority"));
            this.validity = String.valueOf(getIntent().getStringExtra("validity"));
            this.cl_Status = String.valueOf(getIntent().getStringExtra("cl_Status"));
            hb hbVar = this.duplicateClBinding;
            hb hbVar2 = null;
            if (hbVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("duplicateClBinding");
                hbVar = null;
            }
            hbVar.A.g.setText(I1().k());
            hb hbVar3 = this.duplicateClBinding;
            if (hbVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("duplicateClBinding");
                hbVar3 = null;
            }
            hbVar3.F.setText(J1().b("CL_NO", "CL No.") + ' ' + x1());
            String strV1 = v1();
            if (strV1 == null || strV1.length() == 0) {
                hb hbVar4 = this.duplicateClBinding;
                if (hbVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("duplicateClBinding");
                } else {
                    hbVar2 = hbVar4;
                }
                hbVar2.A.f.setVisibility(8);
            } else {
                hb hbVar5 = this.duplicateClBinding;
                if (hbVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("duplicateClBinding");
                    hbVar5 = null;
                }
                hbVar5.A.f.setVisibility(0);
                hb hbVar6 = this.duplicateClBinding;
                if (hbVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("duplicateClBinding");
                } else {
                    hbVar2 = hbVar6;
                }
                hbVar2.A.b.setImageBitmap(kt6.a(v1()));
            }
        } catch (Exception unused) {
        }
        g2(ClInter.INSTANCE.a(D1()));
        f2((kl0) new z(this, new sn0(new jl0(C1()))).a(kl0.class));
    }

    private final void N1() {
        hb hbVar = this.duplicateClBinding;
        hb hbVar2 = null;
        if (hbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("duplicateClBinding");
            hbVar = null;
        }
        hbVar.B.h.setText(StringsKt__StringsKt.trim((CharSequence) x1()).toString());
        hb hbVar3 = this.duplicateClBinding;
        if (hbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("duplicateClBinding");
            hbVar3 = null;
        }
        TextView textView = hbVar3.B.h;
        hb hbVar4 = this.duplicateClBinding;
        if (hbVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("duplicateClBinding");
            hbVar4 = null;
        }
        textView.setPaintFlags(hbVar4.B.h.getPaintFlags() | 8);
        hb hbVar5 = this.duplicateClBinding;
        if (hbVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("duplicateClBinding");
            hbVar5 = null;
        }
        hbVar5.B.g.setText(I1().k());
        hb hbVar6 = this.duplicateClBinding;
        if (hbVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("duplicateClBinding");
        } else {
            hbVar2 = hbVar6;
        }
        hbVar2.B.h.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.zx1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DuplicateCl.O1(this.a, view);
            }
        });
    }

    public static final void O1(DuplicateCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Intent intent = new Intent(this$0, (Class<?>) ClDetailsTop.class);
            intent.putExtra("dlValue", this$0.x1());
            intent.putExtra("dobValue", this$0.y1());
            intent.putExtra("fatherName", this$0.z1());
            intent.putExtra("clName", this$0.u1());
            intent.putExtra("clPhoto", this$0.v1());
            intent.putExtra("address", this$0.address).toString();
            intent.putExtra("issuing_authority", this$0.issuing_authority).toString();
            intent.putExtra("validity", this$0.validity).toString();
            intent.putExtra("cl_Status", this$0.cl_Status).toString();
            this$0.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static final void P1(DuplicateCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void Q1(DuplicateCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void R1(DuplicateCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public static final void S1(DuplicateCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        hb hbVar = this$0.duplicateClBinding;
        if (hbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("duplicateClBinding");
            hbVar = null;
        }
        Editable text = hbVar.w.getText();
        if (text == null || text.length() == 0) {
            this$0.Y1(this$0.J1().b("label_dl_serv_enter_reas_manul", this$0.getString(R.string.enter_Reason)));
        } else if (com.nic.mparivahan.a.a.a(this$0)) {
            this$0.V1(this$0.D1(), this$0.J1().b("label_want_to_proceed", "Are you sure, You want to proceed ?"));
        } else {
            Toast.makeText(this$0.D1(), "Please Check Your Internet connection", 1).show();
        }
    }

    public static final void T1(DuplicateCl this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.F1().dismiss();
        String strB = this$0.J1().b("label_unable_details", this$0.getString(R.string.unable_to_get_details));
        Intrinsics.checkNotNull(strB);
        this$0.Y1(strB);
    }

    public static final void U1(DuplicateCl this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) ClDetailsTop.class);
        intent.putExtra("dlValue", this$0.x1());
        intent.putExtra("dobValue", this$0.y1());
        intent.putExtra("fatherName", this$0.z1());
        intent.putExtra("clName", this$0.u1());
        intent.putExtra("clPhoto", this$0.v1());
        intent.putExtra("address", this$0.address).toString();
        intent.putExtra("issuing_authority", this$0.issuing_authority).toString();
        intent.putExtra("validity", this$0.validity).toString();
        intent.putExtra("cl_Status", this$0.cl_Status).toString();
        this$0.startActivity(intent);
    }

    private final void V1(Context context, String message) {
        Intrinsics.checkNotNull(context);
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirmation_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_proceed);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = dialog.findViewById(R.id.pop_up_cancel);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById3;
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById4 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById4).setText(J1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(J1().b("radio_dl_serv_yes", "Proceed"));
        textView2.setText(J1().b("radio_dl_serv_no", "Cancel"));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.xx1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DuplicateCl.W1(dialog, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.yx1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DuplicateCl.X1(dialog, this, view);
            }
        });
        dialog.show();
    }

    public static final void W1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    public static final void X1(Dialog d, DuplicateCl this$0, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        d.dismiss();
        if (!com.nic.mparivahan.a.a.a(this$0)) {
            Toast.makeText(this$0.D1(), this$0.J1().b("label_log_check_internet", this$0.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        } else {
            this$0.F1().show();
            this$0.B1().v(this$0, this$0.K1(), this$0.G1(), "554", this$0.x1(), this$0.y1());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y1(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View viewFindViewById = dialog.findViewById(R.id.pop_up_msg);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById2 = dialog.findViewById(R.id.pop_up_close);
        Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        textView.setText(J1().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) viewFindViewById).setText(message);
        View viewFindViewById3 = dialog.findViewById(R.id.tv_title);
        Intrinsics.checkNotNull(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) viewFindViewById3).setText(J1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(J1().b("btn_ok", "OK"));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ay1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DuplicateCl.Z1(dialog, view);
            }
        });
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z1(Dialog d, View view) {
        Intrinsics.checkNotNullParameter(d, "$d");
        d.dismiss();
    }

    /* JADX INFO: renamed from: A1, reason: from getter */
    public final String getIssuing_authority() {
        return this.issuing_authority;
    }

    public final kl0 B1() {
        kl0 kl0Var = this.mClDlViewModel;
        if (kl0Var != null) {
            return kl0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mClDlViewModel");
        return null;
    }

    public final ClInter C1() {
        ClInter clInter = this.mClInter;
        if (clInter != null) {
            return clInter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mClInter");
        return null;
    }

    public final Context D1() {
        Context context = this.mContext;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContext");
        return null;
    }

    public final String E1() {
        String str = this.Mobile_no;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("Mobile_no");
        return null;
    }

    public final ProgressDialog F1() {
        ProgressDialog progressDialog = this.pDialog;
        if (progressDialog != null) {
            return progressDialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pDialog");
        return null;
    }

    public final String G1() {
        String str = this.rtoCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rtoCode");
        return null;
    }

    public final String H1() {
        String str = this.rtoName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rtoName");
        return null;
    }

    public final wl5 I1() {
        wl5 wl5Var = this.sarathiSession;
        if (wl5Var != null) {
            return wl5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sarathiSession");
        return null;
    }

    public final wa3 J1() {
        wa3 wa3Var = this.session;
        if (wa3Var != null) {
            return wa3Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("session");
        return null;
    }

    public final String K1() {
        String str = this.stateCode;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stateCode");
        return null;
    }

    /* JADX INFO: renamed from: L1, reason: from getter */
    public final String getValidity() {
        return this.validity;
    }

    public final void a2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clName = str;
    }

    public final void b2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clPhoto = str;
    }

    public final void c2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dlValue = str;
    }

    public final void d2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dobValue = str;
    }

    public final void e2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fatherName = str;
    }

    public final void f2(kl0 kl0Var) {
        Intrinsics.checkNotNullParameter(kl0Var, "<set-?>");
        this.mClDlViewModel = kl0Var;
    }

    public final void g2(ClInter clInter) {
        Intrinsics.checkNotNullParameter(clInter, "<set-?>");
        this.mClInter = clInter;
    }

    public final void h2(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void i2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.Mobile_no = str;
    }

    public final void j2(ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(progressDialog, "<set-?>");
        this.pDialog = progressDialog;
    }

    public final void k2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoCode = str;
    }

    public final void l2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rtoName = str;
    }

    public final void m2(wl5 wl5Var) {
        Intrinsics.checkNotNullParameter(wl5Var, "<set-?>");
        this.sarathiSession = wl5Var;
    }

    public final void n2(wa3 wa3Var) {
        Intrinsics.checkNotNullParameter(wa3Var, "<set-?>");
        this.session = wa3Var;
    }

    public final void o2(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateCode = str;
    }

    @Override // com.zepto.yf2, com.zepto.zt0, com.zepto.bu0, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hb hbVarX = hb.x(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(hbVarX, "inflate(...)");
        this.duplicateClBinding = hbVarX;
        hb hbVar = null;
        if (hbVarX == null) {
            Intrinsics.throwUninitializedPropertyAccessException("duplicateClBinding");
            hbVarX = null;
        }
        setContentView(hbVarX.m());
        M1();
        ta3.a aVar = ta3.a;
        hb hbVar2 = this.duplicateClBinding;
        if (hbVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("duplicateClBinding");
            hbVar2 = null;
        }
        aVar.F0(this, hbVar2);
        hb hbVar3 = this.duplicateClBinding;
        if (hbVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("duplicateClBinding");
            hbVar3 = null;
        }
        hbVar3.B.d.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.rx1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DuplicateCl.P1(this.a, view);
            }
        });
        hb hbVar4 = this.duplicateClBinding;
        if (hbVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("duplicateClBinding");
            hbVar4 = null;
        }
        hbVar4.C.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.sx1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DuplicateCl.Q1(this.a, view);
            }
        });
        hb hbVar5 = this.duplicateClBinding;
        if (hbVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("duplicateClBinding");
            hbVar5 = null;
        }
        hbVar5.A.e.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.tx1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DuplicateCl.R1(this.a, view);
            }
        });
        hb hbVar6 = this.duplicateClBinding;
        if (hbVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("duplicateClBinding");
            hbVar6 = null;
        }
        hbVar6.y.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.ux1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DuplicateCl.S1(this.a, view);
            }
        });
        B1().l().g(this, new mf4() { // from class: com.zepto.vx1
            @Override // com.zepto.mf4
            public final void a(Object obj) {
                DuplicateCl.T1(this.a, (String) obj);
            }
        });
        B1().s().g(this, new b(new a()));
        hb hbVar7 = this.duplicateClBinding;
        if (hbVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("duplicateClBinding");
        } else {
            hbVar = hbVar7;
        }
        hbVar.I.setOnClickListener(new View.OnClickListener() { // from class: com.zepto.wx1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DuplicateCl.U1(this.a, view);
            }
        });
        N1();
    }

    /* JADX INFO: renamed from: t1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    public final String u1() {
        String str = this.clName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clName");
        return null;
    }

    public final String v1() {
        String str = this.clPhoto;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clPhoto");
        return null;
    }

    /* JADX INFO: renamed from: w1, reason: from getter */
    public final String getCl_Status() {
        return this.cl_Status;
    }

    public final String x1() {
        String str = this.dlValue;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dlValue");
        return null;
    }

    public final String y1() {
        String str = this.dobValue;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dobValue");
        return null;
    }

    public final String z1() {
        String str = this.fatherName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fatherName");
        return null;
    }
}
